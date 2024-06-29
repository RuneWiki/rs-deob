import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sg")
public abstract class class183 {

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "Lpf;")
    public static class17 field2921 = new class17(64);

    @OriginalMember(owner = "client!sg", name = "i", descriptor = "Z")
    public static boolean field2928 = false;

    @OriginalMember(owner = "client!sg", name = "h", descriptor = "I")
    public static int field2927 = -1;

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "I")
    public static int field2920;

    @OriginalMember(owner = "client!sg", name = "c", descriptor = "I")
    public static int field2922;

    @OriginalMember(owner = "client!sg", name = "d", descriptor = "I")
    public static int field2923;

    @OriginalMember(owner = "client!sg", name = "e", descriptor = "I")
    public static int field2924;

    @OriginalMember(owner = "client!sg", name = "f", descriptor = "I")
    public static int field2925;

    @OriginalMember(owner = "client!sg", name = "g", descriptor = "I")
    public static int field2926;

    @OriginalMember(owner = "client!sg", name = "k", descriptor = "Lme;")
    public static class165 field2930;

    @OriginalMember(owner = "client!sg", name = "j", descriptor = "[[[I")
    public static int[][][] field2929;

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(IZ)Ljava/lang/String;")
    public static final String method1328(int arg0, boolean arg1) {
        field2925++;
        String var2 = Integer.toString(arg0);
        if (arg1) {
            field2921 = null;
        }
        for (int var3 = var2.length() - 3; var3 > 0; var3 -= 3) {
            var2 = var2.substring(0, var3) + "," + var2.substring(var3);
        }
        if (var2.length() > 9) {
            return " <col=00ff80>" + var2.substring(0, var2.length() - 8) + class1.field76 + " (" + var2 + ")</col>";
        } else if (var2.length() > 6) {
            return " <col=ffffff>" + var2.substring(0, var2.length() - 4) + class50.field855 + " (" + var2 + ")</col>";
        } else {
            return " <col=ffff00>" + var2 + "</col>";
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(I[II[II)V")
    public static final void method1329(int arg0, int[] arg1, int arg2, int[] arg3, int arg4) {
        field2920++;
        if (arg2 > arg0) {
            int var5 = (arg0 + arg2) / 2;
            int var6 = arg0;
            int var7 = arg3[var5];
            arg3[var5] = arg3[arg2];
            arg3[arg2] = var7;
            int var8 = arg1[var5];
            arg1[var5] = arg1[arg2];
            arg1[arg2] = var8;
            for (int var9 = arg0; var9 < arg2; var9++) {
                if (((var9 & 0x1) + var7) < arg3[var9]) {
                    int var10 = arg3[var9];
                    arg3[var9] = arg3[var6];
                    arg3[var6] = var10;
                    int var11 = arg1[var9];
                    arg1[var9] = arg1[var6];
                    arg1[var6++] = var11;
                }
            }
            arg3[arg2] = arg3[var6];
            arg3[var6] = var7;
            arg1[arg2] = arg1[var6];
            arg1[var6] = var8;
            method1329(arg0, arg1, var6 - 1, arg3, 2);
            method1329(var6 + 1, arg1, arg2, arg3, arg4);
        }
        if (arg4 != 2) {
            method1328(7, false);
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(Z)V")
    public abstract void method419(boolean arg0);

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(B)V")
    public static final void method1330(byte arg0) {
        if (arg0 <= 44) {
            method1332((byte) 72, -4);
        }
        for (int var1 = 0; var1 < 5; var1++) {
            class71.field1210[var1] = false;
        }
        class21.field383 = -1;
        class261.field4384 = 0;
        class209.field3533 = 0;
        class313.field5036 = -1;
        field2922++;
        class169.field2739 = 1;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(II)V")
    public static final void method1331(int arg0, int arg1) {
        field2923++;
        if (arg1 != -1) {
            method1332((byte) -108, -46);
        }
        class302 var2 = (class302) class21.field381.method987(-123, (long) arg0);
        if (var2 != null) {
            var2.method993(32);
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(BI)V")
    public static final void method1332(byte arg0, int arg1) {
        field2924++;
        class36 var2 = class136.method1013(5, arg1, (byte) -90);
        var2.method221(1);
        if (arg0 <= 84) {
            field2921 = null;
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(III)I")
    public abstract int method420(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(I)J")
    public abstract long method417(int arg0);

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "(B)V")
    public static void method1333(byte arg0) {
        field2930 = null;
        field2921 = null;
        if (arg0 <= 53) {
            field2921 = null;
        }
        field2929 = null;
    }
}
