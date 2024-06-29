import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!d")
public class class7 extends class23 {

    @OriginalMember(owner = "mapview!d", name = "z", descriptor = "Ln;")
    public static class26 field158 = class9.method82(255, "Next page");

    @OriginalMember(owner = "mapview!d", name = "A", descriptor = "Ln;")
    public static class26 field159 = class9.method82(255, "Potters Wheel");

    @OriginalMember(owner = "mapview!d", name = "C", descriptor = "Ln;")
    public static class26 field161 = class9.method82(255, "Windmill");

    @OriginalMember(owner = "mapview!d", name = "D", descriptor = "Ln;")
    public static class26 field162 = class9.method82(255, "mapfunction");

    @OriginalMember(owner = "mapview!d", name = "B", descriptor = "Ln;")
    public static class26 field160 = class9.method82(255, "Kebab Seller");

    @OriginalMember(owner = "mapview!d", name = "y", descriptor = "Ln;")
    public static class26 field157 = class9.method82(255, "Apothecary");

    @OriginalMember(owner = "mapview!d", name = "E", descriptor = "Ln;")
    public static class26 field163 = class9.method82(255, "Platebody Shop");

    @OriginalMember(owner = "mapview!d", name = "F", descriptor = "I")
    public static int field164;

    @OriginalMember(owner = "mapview!d", name = "x", descriptor = "[[B")
    public static byte[][] field156;

    @OriginalMember(owner = "mapview!d", name = "<init>", descriptor = "([BZZZ)V", line = 11)
    private class7(byte[] arg0, boolean arg1, boolean arg2, boolean arg3) throws IOException {
        super(arg1, arg2);
        this.method76(arg3, new DataInputStream(new ByteArrayInputStream(arg0)), -1);
    }

    @OriginalMember(owner = "mapview!d", name = "b", descriptor = "(I)V", line = 27)
    public static void method73(int arg0) {
        field159 = null;
        field163 = null;
        field160 = null;
        field157 = null;
        field162 = null;
        field156 = (byte[][]) null;
        field158 = null;
        if (arg0 != -1) {
            method73(10);
        }
        field161 = null;
    }

    @OriginalMember(owner = "mapview!d", name = "c", descriptor = "(I)B", line = 52)
    public static final byte method74(int arg0) {
        if (arg0 != 0) {
            field164 = 91;
        }
        return class34.field410 != null ? class34.field410[class18.field262] : 0;
    }

    @OriginalMember(owner = "mapview!d", name = "a", descriptor = "(Ln;Lla;ILn;)[Lq;", line = 106)
    public static final class32[] method75(class26 arg0, class23 arg1, int arg2, class26 arg3) {
        if (arg2 >= -100) {
            return (class32[]) null;
        } else {
            int var4 = arg1.method159((byte) 76, arg3);
            int var5 = arg1.method160(var4, arg0, -12935);
            return class10.method87(var5, var4, arg1, (byte) -107);
        }
    }

    @OriginalMember(owner = "mapview!d", name = "<init>", descriptor = "([BZZ)V", line = 126)
    public class7(byte[] arg0, boolean arg1, boolean arg2) throws IOException {
        this(arg0, arg1, arg2, false);
    }

    @OriginalMember(owner = "mapview!d", name = "a", descriptor = "(ZLjava/io/DataInputStream;I)V", line = 139)
    private final void method76(boolean arg0, DataInputStream arg1, int arg2) throws IOException {
        int var4 = arg1.read();
        if (!arg0) {
        }
        int var5 = arg1.readInt();
        int var6 = var5;
        if (~var4 != arg2) {
            var5 += 4;
        }
        class17 var7 = new class17(var5 + 5);
        var7.method123((byte) 17, var4);
        var7.method132((byte) 68, var6);
        arg1.readFully(var7.field252, var7.field251, var5);
        this.method164(var7.field252, false);
        for (int var8 = 0; var8 < super.field333; ++var8) {
            int var9 = arg1.read();
            int var10 = arg1.readInt();
            int var11 = var10;
            if (~var9 != -1) {
                var10 += 4;
            }
            class17 var12 = new class17(var10 + 5);
            var12.method123((byte) 17, var9);
            var12.method132((byte) -4, var11);
            while (-33554433 > ~var10) {
                var10 -= 33554432;
                arg1.readFully(var12.field252, var12.field251, 33554432);
                var12.field251 += 33554432;
            }
            arg1.readFully(var12.field252, var12.field251, var10);
            super.field317[super.field325[var8]] = var12.field252;
        }
    }
}
