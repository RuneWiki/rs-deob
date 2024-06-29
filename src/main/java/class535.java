import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ct")
public class class535 implements class385 {

    @OriginalMember(owner = "client!ct", name = "c", descriptor = "Lvba;")
    private class417 field7442;

    @OriginalMember(owner = "client!ct", name = "d", descriptor = "Lgga;")
    private class513 field7443;

    @OriginalMember(owner = "client!ct", name = "i", descriptor = "[I")
    public static int[] field7448 = new int[14];

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "I")
    public static int field7440;

    @OriginalMember(owner = "client!ct", name = "b", descriptor = "I")
    public static int field7441;

    @OriginalMember(owner = "client!ct", name = "e", descriptor = "I")
    public static int field7444;

    @OriginalMember(owner = "client!ct", name = "f", descriptor = "I")
    public static int field7445;

    @OriginalMember(owner = "client!ct", name = "h", descriptor = "I")
    public static int field7447;

    @OriginalMember(owner = "client!ct", name = "j", descriptor = "I")
    public static int field7449;

    @OriginalMember(owner = "client!ct", name = "k", descriptor = "I")
    public static int field7450;

    @OriginalMember(owner = "client!ct", name = "g", descriptor = "Lmq;")
    private class85 field7446;

    @OriginalMember(owner = "client!ct", name = "b", descriptor = "(I)V")
    public final void method20(int arg0) {
        if (arg0 < -50) {
            this.field7446 = class663.method3712(91, this.field7443, this.field7442.field5789);
            field7441++;
        }
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(I)Z")
    public final boolean method17(int arg0) {
        field7440++;
        return arg0 >= -93 ? true : this.field7443.method3005(this.field7442.field5789, (byte) -69);
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(BLaia;)V")
    public static final void method3107(byte arg0, class400 arg1) {
        arg1.field5516 = null;
        if (arg0 != -100) {
            method3107((byte) 103, null);
        }
        field7445++;
        if (class585.field8406 < 20) {
            class259.field3674.method1734(arg1, 0);
            class585.field8406++;
        }
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(B)V")
    public static void method3108(byte arg0) {
        field7448 = null;
        if (arg0 <= 78) {
            method3110(null, -103, 14, 68, 123, null, -47, -12, -82, -103, 81, 10);
        }
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(JIIBZ)Ljava/lang/String;")
    public static final String method3109(long arg0, int arg1, int arg2, byte arg3, boolean arg4) {
        field7449++;
        char var6 = ',';
        if (arg3 != -17) {
            method3107((byte) -94, null);
        }
        char var7 = '.';
        if (arg1 == 0) {
            var6 = '.';
            var7 = ',';
        }
        if (arg1 == 2) {
            var7 = ' ';
        }
        boolean var8 = false;
        if (arg0 < 0L) {
            arg0 = -arg0;
            var8 = true;
        }
        StringBuffer var9 = new StringBuffer(26);
        if (arg2 > 0) {
            for (int var10 = 0; var10 < arg2; var10++) {
                int var11 = (int) arg0;
                arg0 /= 10L;
                var9.append((char) (var11 + 48 - ((int) arg0 * 10)));
            }
            var9.append(var6);
        }
        int var12 = 0;
        while (true) {
            int var13 = (int) arg0;
            arg0 /= 10L;
            var9.append((char) (var13 + 48 - ((int) arg0 * 10)));
            if (arg0 == 0L) {
                if (var8) {
                    var9.append('-');
                }
                return var9.reverse().toString();
            }
            if (arg4) {
                var12++;
                if (var12 % 3 == 0) {
                    var9.append(var7);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(Lha;IIIILtd;IIIIII)V")
    public static final void method3110(class475 arg0, int arg1, int arg2, int arg3, int arg4, class551 arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        if (arg7 < arg3 && arg3 < (arg7 + arg9) && arg1 > (arg2 - 13) && (arg2 + 3) > arg1) {
            arg11 = arg4;
        }
        field7450++;
        String var12 = class44.method332(false, arg5);
        if (arg6 < 5) {
            method3111((byte) -114, 8, -79);
        }
        class670.field9398.method2622(var12, class91.field1312, class312.field4420, arg2, (byte) 119, 0, arg7 + 3, arg11);
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(BII)Z")
    public static final boolean method3111(byte arg0, int arg1, int arg2) {
        field7444++;
        if (arg0 <= 6) {
            field7448 = null;
        }
        return (arg2 & 0x22) != 0;
    }

    @OriginalMember(owner = "client!ct", name = "<init>", descriptor = "(Lgga;Lvba;)V")
    public class535(class513 arg0, class417 arg1) {
        this.field7442 = arg1;
        this.field7443 = arg0;
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(ZI)V")
    public final void method19(boolean arg0, int arg1) {
        field7447++;
        if (arg1 <= 44 || !arg0) {
            return;
        }
        int var3 = class709.field9923 <= class499.field6858 ? class499.field6858 : class709.field9923;
        int var4 = class381.field5334 < class448.field6174 ? class448.field6174 : class381.field5334;
        int var5 = this.field7446.method11();
        int var6 = this.field7446.method14();
        int var7 = 0;
        int var8 = var3;
        int var9 = var3 * var6 / var5;
        int var10 = (var4 - var9) / 2;
        if (var4 < var9) {
            var8 = var4 * var5 / var6;
            var10 = 0;
            var9 = var4;
            var7 = (var3 - var8) / 2;
        }
        this.field7446.method755(var7, var10, var8, var9);
    }
}
