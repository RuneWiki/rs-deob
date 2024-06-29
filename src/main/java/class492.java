import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public class class492 {

    @OriginalMember(owner = "client!ic", name = "h", descriptor = "Z")
    public boolean field7273;

    @OriginalMember(owner = "client!ic", name = "g", descriptor = "B")
    public byte field7272;

    @OriginalMember(owner = "client!ic", name = "m", descriptor = "S")
    public short field7278;

    @OriginalMember(owner = "client!ic", name = "j", descriptor = "S")
    public short field7275;

    @OriginalMember(owner = "client!ic", name = "i", descriptor = "B")
    public byte field7274;

    @OriginalMember(owner = "client!ic", name = "e", descriptor = "S")
    public short field7270;

    @OriginalMember(owner = "client!ic", name = "c", descriptor = "I")
    public int field7268;

    @OriginalMember(owner = "client!ic", name = "f", descriptor = "Z")
    public static boolean field7271 = false;

    @OriginalMember(owner = "client!ic", name = "o", descriptor = "[I")
    public static int[] field7280;

    @OriginalMember(owner = "client!ic", name = "p", descriptor = "Lss;")
    public static class295 field7281;

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "I")
    public static int field7266;

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "I")
    public static int field7267;

    @OriginalMember(owner = "client!ic", name = "d", descriptor = "I")
    public static int field7269;

    @OriginalMember(owner = "client!ic", name = "k", descriptor = "I")
    public static int field7276;

    @OriginalMember(owner = "client!ic", name = "l", descriptor = "I")
    public static int field7277;

    @OriginalMember(owner = "client!ic", name = "n", descriptor = "Lii;")
    public static class387 field7279;

    static {
        new class83("The channel you tried to join does not exist.", "Der von dir gewünschte Chatraum existiert nicht.", "Le canal que vous essayez de rejoindre n'existe pas.", "O canal que você tentou acessar não existe.");
        field7280 = new int[8];
        field7281 = null;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IFFF)F", line = 7)
    public static final float method2917(int arg0, float arg1, float arg2, float arg3) {
        int var4 = 86 / ((-arg0 - 13) / 39);
        field7267++;
        return (arg1 - arg3) * arg2 + arg3;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IIII)I", line = 18)
    public static final int method2918(int arg0, int arg1, int arg2, int arg3) {
        field7269++;
        int var4 = arg0 & 0x3;
        if (arg1 != 9851) {
            return 124;
        } else if (var4 == 0) {
            return arg3;
        } else if (var4 == 1) {
            return 1023 - arg2;
        } else if (var4 == 2) {
            return 1023 - arg3;
        } else {
            return arg2;
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(B)V", line = 42)
    public static final void method2919(byte arg0) {
        field7276++;
        if (arg0 >= -72) {
            return;
        }
        try {
            if (class510.field7488 == 1) {
                int var1 = class45.field638.method2028(true);
                if (var1 > 0 && class45.field638.method2010(true)) {
                    int var2 = var1 - class362.field5020;
                    if (var2 < 0) {
                        var2 = 0;
                    }
                    class45.field638.method2025(var2, (byte) -118);
                } else {
                    class45.field638.method2035(false);
                    class45.field638.method2017(255);
                    class389.field5455 = null;
                    if (class159.field2290 == null) {
                        class510.field7488 = 0;
                    } else {
                        class510.field7488 = 2;
                    }
                    class59.field792 = null;
                }
            }
        } catch (Exception var4) {
            var4.printStackTrace();
            class45.field638.method2035(false);
            class159.field2290 = null;
            class510.field7488 = 0;
            class59.field792 = null;
            class389.field5455 = null;
        }
    }

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "(B)V", line = 89)
    public static void method2920(byte arg0) {
        field7280 = null;
        if (arg0 >= 52) {
            field7279 = null;
            field7281 = null;
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IIB)V", line = 102)
    public static final void method2921(int arg0, int arg1, byte arg2) {
        field7277++;
        class163 var3 = class271.method1546(arg0, 14, true);
        var3.method1017(0);
        int var4 = -26 / ((20 - arg2) / 57);
        var3.field2328 = arg1;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IIIIB)Lic;", line = 115)
    public final class492 method2922(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        field7266++;
        if (arg4 != -91) {
            this.field7274 = -72;
        }
        return new class492(arg3, arg0, arg2, arg1, this.field7275, this.field7278, this.field7270, this.field7272, this.field7274, this.field7273);
    }

    @OriginalMember(owner = "client!ic", name = "<init>", descriptor = "(IIIIIIIIIZ)V", line = 142)
    public class492(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9) {
        this.field7273 = arg9;
        this.field7272 = (byte) arg7;
        this.field7278 = (short) arg5;
        this.field7275 = (short) arg4;
        this.field7274 = (byte) arg8;
        this.field7270 = (short) arg6;
        this.field7268 = arg0;
    }
}
