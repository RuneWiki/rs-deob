import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fa")
public class class201 {

    @OriginalMember(owner = "client!fa", name = "f", descriptor = "I")
    public int field3634 = -1;

    @OriginalMember(owner = "client!fa", name = "d", descriptor = "Lsf;")
    private static class108 field3632 = class140.method973(255, "Connection lost)3");

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "Lsf;")
    public static class108 field3629 = field3632;

    @OriginalMember(owner = "client!fa", name = "l", descriptor = "Lsf;")
    private static class108 field3640 = class140.method973(255, "red:");

    @OriginalMember(owner = "client!fa", name = "m", descriptor = "[Lbh;")
    public static class277[] field3641 = new class277[28];

    @OriginalMember(owner = "client!fa", name = "k", descriptor = "Lsf;")
    public static class108 field3639 = field3640;

    @OriginalMember(owner = "client!fa", name = "p", descriptor = "Lsf;")
    private static class108 field3644 = class140.method973(255, "Close");

    @OriginalMember(owner = "client!fa", name = "n", descriptor = "Lsf;")
    public static class108 field3642 = field3644;

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "Lsf;")
    public static class108 field3630 = field3640;

    @OriginalMember(owner = "client!fa", name = "c", descriptor = "I")
    public static int field3631;

    @OriginalMember(owner = "client!fa", name = "e", descriptor = "I")
    public static int field3633;

    @OriginalMember(owner = "client!fa", name = "j", descriptor = "I")
    public static int field3638;

    @OriginalMember(owner = "client!fa", name = "o", descriptor = "I")
    public static int field3643;

    @OriginalMember(owner = "client!fa", name = "h", descriptor = "Lph;")
    public class79 field3636;

    @OriginalMember(owner = "client!fa", name = "i", descriptor = "[I")
    public int[] field3637;

    @OriginalMember(owner = "client!fa", name = "g", descriptor = "[Lsf;")
    public class108[] field3635;

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(ILsf;)I", line = 9)
    public static final int method1421(int arg0, class108 arg1) {
        field3643++;
        if (arg0 != 255) {
            method1423(97);
        }
        if (arg1 == null) {
            return -1;
        }
        for (int var2 = 0; var2 < class120.field2056; var2++) {
            if (arg1.method781(class197.field3563[var2], -26321)) {
                return var2;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(IZ)V", line = 52)
    public static final void method1422(int arg0, boolean arg1) {
        byte[][] var2;
        byte var3;
        if (class231.field4051 && arg1) {
            var2 = class251.field4376;
            var3 = 1;
        } else {
            var3 = 4;
            var2 = class322.field5513;
        }
        field3633++;
        int var4 = var2.length;
        for (int var5 = 0; var5 < var4; var5++) {
            int var6 = (class57.field838[var5] >> 8) * 64 - class305.field5295;
            int var7 = (class57.field838[var5] & 0xFF) * 64 - class137.field2421;
            byte[] var8 = var2[var5];
            if (var8 != null) {
                class212.method1460((byte) -16);
                class177.method1253((byte) 100, var6, class330.field5644, var7, arg1, (class324.field5526 - 6) * 8, var8, class45.field653 * 8 - 48);
            }
        }
        for (int var9 = 0; var9 < var4; var9++) {
            int var10 = (class57.field838[var9] >> 8) * 64 - class305.field5295;
            int var11 = (class57.field838[var9] & 0xFF) * 64 - class137.field2421;
            byte[] var12 = var2[var9];
            if (var12 == null && class324.field5526 < 800) {
                class212.method1460((byte) -16);
                for (int var13 = 0; var13 < var3; var13++) {
                    class122.method855(64, 1, var11, var13, 64, var10);
                }
            }
        }
        if (arg0 != 8) {
            field3642 = (class108) null;
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(I)V", line = 145)
    public static void method1423(int arg0) {
        field3644 = null;
        field3629 = null;
        field3642 = null;
        if (arg0 < 93) {
            field3641 = (class277[]) null;
        }
        field3641 = null;
        field3639 = null;
        field3630 = null;
        field3640 = null;
        field3632 = null;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(IB)Lfb;", line = 178)
    public static final class60 method1424(int arg0, byte arg1) {
        class60 var2 = (class60) class223.field3945.method642((long) arg0, (byte) -99);
        field3631++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class157.field2843.method1868(12236, class302.method2126(arg0, 1405909032), class234.method1632(arg0, -74));
        class60 var4 = new class60();
        var4.field902 = arg0;
        if (var3 != null) {
            var4.method420(new class249(var3), (byte) 55);
        }
        var4.method413(-18653);
        if (var4.field956) {
            var4.field946 = 0;
            var4.field959 = false;
        }
        if (arg1 < 88) {
            method1422(-6, false);
        }
        if (!class92.field1472 && var4.field904) {
            var4.field918 = null;
        }
        class223.field3945.method643((byte) -49, (long) arg0, var4);
        return var4;
    }
}
