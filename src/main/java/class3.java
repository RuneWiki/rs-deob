import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!b")
public class class3 extends class10 {

    @OriginalMember(owner = "mapview!b", name = "x", descriptor = "Z")
    public static boolean field19 = false;

    @OriginalMember(owner = "mapview!b", name = "C", descriptor = "Ll;")
    public static class22 field24 = class33.method229("u_pass", -75);

    @OriginalMember(owner = "mapview!b", name = "z", descriptor = "I")
    public static int field21 = 0;

    @OriginalMember(owner = "mapview!b", name = "E", descriptor = "Ll;")
    public static class22 field26 = class33.method229("sprites", -54);

    @OriginalMember(owner = "mapview!b", name = "F", descriptor = "J")
    public static volatile long field27 = 0L;

    @OriginalMember(owner = "mapview!b", name = "y", descriptor = "Ll;")
    public static class22 field20 = class33.method229("Legende", -56);

    @OriginalMember(owner = "mapview!b", name = "G", descriptor = "I")
    public static int field28 = 0;

    @OriginalMember(owner = "mapview!b", name = "D", descriptor = "I")
    public static int field25;

    @OriginalMember(owner = "mapview!b", name = "B", descriptor = "Z")
    public static boolean field23;

    @OriginalMember(owner = "mapview!b", name = "A", descriptor = "[B")
    public static byte[] field22;

    @OriginalMember(owner = "mapview!b", name = "a", descriptor = "(ILl;Lea;Ll;)[Lba;", line = 5)
    public static final class4[] method9(int arg0, class22 arg1, class10 arg2, class22 arg3) {
        int var4 = arg2.method41(true, arg3);
        if (arg0 != -1) {
            return (class4[]) null;
        } else {
            int var5 = arg2.method50(var4, (byte) -84, arg1);
            return class13.method66((byte) 68, arg2, var5, var4);
        }
    }

    @OriginalMember(owner = "mapview!b", name = "<init>", descriptor = "([BZZZ)V", line = 18)
    private class3(byte[] arg0, boolean arg1, boolean arg2, boolean arg3) throws IOException {
        super(arg1, arg2);
        this.method10(new DataInputStream(new ByteArrayInputStream(arg0)), (byte) -110, arg3);
    }

    @OriginalMember(owner = "mapview!b", name = "<init>", descriptor = "([BZZ)V", line = 30)
    public class3(byte[] arg0, boolean arg1, boolean arg2) throws IOException {
        this(arg0, arg1, arg2, false);
    }

    @OriginalMember(owner = "mapview!b", name = "a", descriptor = "(Ljava/io/DataInputStream;BZ)V", line = 58)
    private final void method10(DataInputStream arg0, byte arg1, boolean arg2) throws IOException {
        if (arg2) {
        }
        int var4 = arg0.read();
        int var5 = arg0.readInt();
        int var6 = var5;
        if (~var4 != -1) {
            var5 += 4;
        }
        class38 var7 = new class38(var5 + 5);
        var7.method245(var4, arg1 ^ 13935);
        var7.method243(var6, (byte) 6);
        arg0.readFully(var7.field500, var7.field498, var5);
        if (arg1 == -110) {
            this.method44(var7.field500, 0);
            for (int var8 = 0; var8 < super.field89; ++var8) {
                int var9 = arg0.read();
                int var10 = arg0.readInt();
                int var11 = var10;
                if (~var9 != -1) {
                    var10 += 4;
                }
                class38 var12 = new class38(var10 + 5);
                var12.method245(var9, -13827);
                var12.method243(var11, (byte) 6);
                while (~var10 < -33554433) {
                    var10 -= 33554432;
                    arg0.readFully(var12.field500, var12.field498, 33554432);
                    var12.field498 += 33554432;
                }
                arg0.readFully(var12.field500, var12.field498, var10);
                super.field86[super.field96[var8]] = class16.method92(var12.field500, class12.method64(arg1, 89), false);
            }
        }
    }

    @OriginalMember(owner = "mapview!b", name = "a", descriptor = "(Z)V", line = 117)
    public static void method11(boolean arg0) {
        field22 = null;
        field24 = null;
        field20 = null;
        field26 = null;
        if (arg0) {
            method12((byte[]) null, -69, (byte) 8, 8);
        }
    }

    @OriginalMember(owner = "mapview!b", name = "a", descriptor = "([BIBI)I", line = 144)
    public static final int method12(byte[] arg0, int arg1, byte arg2, int arg3) {
        int var4 = -1;
        for (int var5 = arg3; var5 < arg1; ++var5) {
            var4 = class24.field237[255 & (arg0[var5] ^ var4)] ^ var4 >>> 8;
        }
        if (arg2 >= 0) {
            field20 = (class22) null;
        }
        return ~var4;
    }
}
