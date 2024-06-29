import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lh")
public class class23 extends class147 {

    @OriginalMember(owner = "client!lh", name = "y", descriptor = "I")
    public int field335;

    @OriginalMember(owner = "client!lh", name = "v", descriptor = "I")
    public int field332;

    @OriginalMember(owner = "client!lh", name = "w", descriptor = "I")
    public int field333;

    @OriginalMember(owner = "client!lh", name = "t", descriptor = "I")
    public int field330;

    @OriginalMember(owner = "client!lh", name = "u", descriptor = "I")
    public static volatile int field331 = -1;

    @OriginalMember(owner = "client!lh", name = "x", descriptor = "Lna;")
    public static class26 field334 = class69.method505("scrollen:", (byte) -126);

    @OriginalMember(owner = "client!lh", name = "z", descriptor = "Lna;")
    public static class26 field336 = class69.method505("(U (X", (byte) -124);

    @OriginalMember(owner = "client!lh", name = "p", descriptor = "I")
    public static int field326;

    @OriginalMember(owner = "client!lh", name = "q", descriptor = "I")
    public static int field327;

    @OriginalMember(owner = "client!lh", name = "r", descriptor = "I")
    public static int field328;

    @OriginalMember(owner = "client!lh", name = "s", descriptor = "Lvh;")
    public static class53 field329;

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(BII)Z", line = 4)
    public final boolean method143(byte arg0, int arg1, int arg2) {
        if (arg0 != -45) {
            method144(6, -105);
        }
        field326++;
        return arg2 >= this.field330 && this.field333 >= arg2 && this.field332 <= arg1 && arg1 <= this.field335;
    }

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "(II)V", line = 23)
    public static final void method144(int arg0, int arg1) {
        field327++;
        class115.field1813 = arg0;
        class188.method1288(-32584, 3);
        class188.method1288(-32584, 4);
        if (arg1 <= 83) {
            method145((class213) null, -43, -61, -51, 101, -106, -58, true);
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(Lfg;IIIIIIZ)V", line = 40)
    public static final void method145(class213 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        int var8 = arg0.field3319.length;
        for (int var9 = 0; var9 < var8; var9++) {
            int var10 = arg0.field3319[var9] - class50.field794;
            int var11 = arg0.field3307[var9] - class133.field2019;
            int var12 = arg0.field3310[var9] - class18.field255;
            int var13 = arg3 * var12 + arg4 * var10 >> 16;
            int var14 = arg4 * var12 - arg3 * var10 >> 16;
            int var16 = arg2 * var11 - arg1 * var14 >> 16;
            int var17 = arg1 * var11 + arg2 * var14 >> 16;
            if (var17 < 50) {
                return;
            }
            if (arg0.field3308 != null) {
                class213.field3306[var9] = var13;
                class213.field3322[var9] = var16;
                class213.field3320[var9] = var17;
            }
            class213.field3315[var9] = (var13 << 9) / var17 + class200.field3110;
            class213.field3314[var9] = (var16 << 9) / var17 + class200.field3099;
        }
        class200.field3114 = 0;
        int var19 = arg0.field3316.length;
        for (int var20 = 0; var20 < var19; var20++) {
            int var21 = arg0.field3316[var20];
            int var22 = arg0.field3309[var20];
            int var23 = arg0.field3305[var20];
            int var24 = class213.field3315[var21];
            int var25 = class213.field3315[var22];
            int var26 = class213.field3315[var23];
            int var27 = class213.field3314[var21];
            int var28 = class213.field3314[var22];
            int var29 = class213.field3314[var23];
            if ((var24 - var25) * (var29 - var28) - (var26 - var25) * (var27 - var28) > 0) {
                if (class135.field2063 && class84.method650(class302.field5212 + class200.field3110, class76.field1160 + class200.field3099, var27, var28, var29, var24, var25, var26)) {
                    class322.field5533 = arg5;
                    class28.field477 = arg6;
                }
                if (!class255.field4184 && !arg7) {
                    class200.field3113 = false;
                    if (var24 < 0 || var25 < 0 || var26 < 0 || var24 > class200.field3111 || var25 > class200.field3111 || var26 > class200.field3111) {
                        class200.field3113 = true;
                    }
                    if (arg0.field3308 == null || arg0.field3308[var20] == -1) {
                        if (arg0.field3317[var20] != 12345678) {
                            class200.method1358(var27, var28, var29, var24, var25, var26, arg0.field3317[var20], arg0.field3324[var20], arg0.field3323[var20]);
                        }
                    } else if (!class268.field4435) {
                        int var30 = class200.field3102.method100(arg0.field3308[var20], 65535);
                        class200.method1358(var27, var28, var29, var24, var25, var26, class68.method502(var30, arg0.field3317[var20]), class68.method502(var30, arg0.field3324[var20]), class68.method502(var30, arg0.field3323[var20]));
                    } else if (arg0.field3321) {
                        class200.method1339(var27, var28, var29, var24, var25, var26, arg0.field3317[var20], arg0.field3324[var20], arg0.field3323[var20], class213.field3306[0], class213.field3306[1], class213.field3306[3], class213.field3322[0], class213.field3322[1], class213.field3322[3], class213.field3320[0], class213.field3320[1], class213.field3320[3], arg0.field3308[var20]);
                    } else {
                        class200.method1339(var27, var28, var29, var24, var25, var26, arg0.field3317[var20], arg0.field3324[var20], arg0.field3323[var20], class213.field3306[var21], class213.field3306[var22], class213.field3306[var23], class213.field3322[var21], class213.field3322[var22], class213.field3322[var23], class213.field3320[var21], class213.field3320[var22], class213.field3320[var23], arg0.field3308[var20]);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!lh", name = "c", descriptor = "(I)V", line = 153)
    public static void method146(int arg0) {
        if (arg0 != 0) {
            method147((byte) 35);
        }
        field329 = null;
        field336 = null;
        field334 = null;
    }

    @OriginalMember(owner = "client!lh", name = "d", descriptor = "(B)V", line = 176)
    public static final void method147(byte arg0) {
        field328++;
        class85.field1388.method1987(3);
        class88.field1447.method1987(3);
        if (arg0 != -41) {
            method144(14, 52);
        }
        class5.field59.method1987(3);
    }

    @OriginalMember(owner = "client!lh", name = "<init>", descriptor = "(IIII)V", line = 196)
    public class23(int arg0, int arg1, int arg2, int arg3) {
        this.field335 = arg3;
        this.field332 = arg1;
        this.field333 = arg2;
        this.field330 = arg0;
    }
}
