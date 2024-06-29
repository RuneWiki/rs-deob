import java.awt.Component;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!n")
public class class26 extends class31 {

    @OriginalMember(owner = "mapview!n", name = "B", descriptor = "Lt;")
    public static class35 field301 = class3.method28(false, "Hair Dressers");

    @OriginalMember(owner = "mapview!n", name = "C", descriptor = "Lda;")
    public static class8 field302 = new class8();

    @OriginalMember(owner = "mapview!n", name = "D", descriptor = "Z")
    public static boolean field303 = false;

    @OriginalMember(owner = "mapview!n", name = "E", descriptor = "Lt;")
    public static class35 field304 = class3.method28(false, "Pub)4Bar");

    @OriginalMember(owner = "mapview!n", name = "b", descriptor = "(Z)B", line = 4)
    public static final byte method147(boolean arg0) {
        if (arg0) {
            return -95;
        } else {
            return class27.field305 != null ? class27.field305[class31.field392] : 0;
        }
    }

    @OriginalMember(owner = "mapview!n", name = "<init>", descriptor = "([BZZZ)V", line = 36)
    private class26(byte[] arg0, boolean arg1, boolean arg2, boolean arg3) throws IOException {
        super(arg1, arg2);
        this.method148(arg3, new DataInputStream(new ByteArrayInputStream(arg0)), (byte) -90);
    }

    @OriginalMember(owner = "mapview!n", name = "a", descriptor = "(ZLjava/io/DataInputStream;B)V", line = 49)
    private final void method148(boolean arg0, DataInputStream arg1, byte arg2) throws IOException {
        int var4 = arg1.read();
        if (arg2 > -70) {
            method147(false);
        }
        if (!arg0) {
        }
        int var5 = arg1.readInt();
        int var6 = var5;
        if (var4 != 0) {
            var5 += 4;
        }
        class18 var7 = new class18(var5 - -5);
        var7.method108((byte) -61, var4);
        var7.method107(var6, 6729);
        arg1.readFully(var7.field204, var7.field203, var5);
        this.method170((byte) -81, var7.field204);
        for (int var8 = 0; var8 < super.field375; ++var8) {
            int var9 = arg1.read();
            int var10 = arg1.readInt();
            int var11 = var10;
            if (~var9 != -1) {
                var10 += 4;
            }
            class18 var12 = new class18(var10 + 5);
            var12.method108((byte) -61, var9);
            var12.method107(var11, 6729);
            while (~var10 < -33554433) {
                arg1.readFully(var12.field204, var12.field203, 33554432);
                var10 -= 33554432;
                var12.field203 += 33554432;
            }
            arg1.readFully(var12.field204, var12.field203, var10);
            super.field390[super.field373[var8]] = var12.field204;
        }
    }

    @OriginalMember(owner = "mapview!n", name = "a", descriptor = "(Ljava/awt/Component;I)V", line = 119)
    public static final void method149(Component arg0, int arg1) {
        arg0.addMouseListener(class31.field393);
        arg0.addMouseMotionListener(class31.field393);
        if (arg1 != -5) {
            method147(false);
        }
        arg0.addFocusListener(class31.field393);
    }

    @OriginalMember(owner = "mapview!n", name = "a", descriptor = "(I)V", line = 132)
    public static void method150(int arg0) {
        field302 = null;
        field304 = null;
        field301 = null;
        if (arg0 != -33554433) {
            method150(122);
        }
    }

    @OriginalMember(owner = "mapview!n", name = "<init>", descriptor = "([BZZ)V", line = 160)
    public class26(byte[] arg0, boolean arg1, boolean arg2) throws IOException {
        this(arg0, arg1, arg2, false);
    }
}
