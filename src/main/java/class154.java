import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public class class154 extends class145 {

    @OriginalMember(owner = "client!ra", name = "H", descriptor = "Lqd;")
    public class148 field3226 = new class148();

    @OriginalMember(owner = "client!ra", name = "J", descriptor = "Llh;")
    public class107 field3228 = new class107();

    @OriginalMember(owner = "client!ra", name = "F", descriptor = "Lec;")
    private class42 field3225;

    @OriginalMember(owner = "client!ra", name = "v", descriptor = "I")
    public static volatile int field3215 = -1;

    @OriginalMember(owner = "client!ra", name = "w", descriptor = "Lgg;")
    private static class63 field3216 = class116.method911(43, "Sorry invited players only)3");

    @OriginalMember(owner = "client!ra", name = "K", descriptor = "Lgg;")
    public static class63 field3229 = field3216;

    @OriginalMember(owner = "client!ra", name = "t", descriptor = "I")
    public static int field3213;

    @OriginalMember(owner = "client!ra", name = "u", descriptor = "I")
    public static int field3214;

    @OriginalMember(owner = "client!ra", name = "x", descriptor = "I")
    public static int field3217;

    @OriginalMember(owner = "client!ra", name = "y", descriptor = "I")
    public static int field3218;

    @OriginalMember(owner = "client!ra", name = "z", descriptor = "I")
    public static int field3219;

    @OriginalMember(owner = "client!ra", name = "A", descriptor = "I")
    public static int field3220;

    @OriginalMember(owner = "client!ra", name = "B", descriptor = "I")
    public static int field3221;

    @OriginalMember(owner = "client!ra", name = "C", descriptor = "I")
    public static int field3222;

    @OriginalMember(owner = "client!ra", name = "D", descriptor = "I")
    public static int field3223;

    @OriginalMember(owner = "client!ra", name = "I", descriptor = "I")
    public static int field3227;

    @OriginalMember(owner = "client!ra", name = "L", descriptor = "I")
    public static int field3230;

    @OriginalMember(owner = "client!ra", name = "M", descriptor = "I")
    public static int field3231;

    @OriginalMember(owner = "client!ra", name = "N", descriptor = "Lfg;")
    public static class55 field3232;

    @OriginalMember(owner = "client!ra", name = "E", descriptor = "[[[I")
    public static int[][][] field3224;

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(IBI)I")
    public static final int method1071(int arg0, byte arg1, int arg2) {
        int var3 = arg2 * 57 + arg0;
        field3222++;
        int var4 = var3 ^ var3 << 13;
        if (arg1 != -38) {
            method1073(76);
        }
        int var5 = (var4 * 15731 * var4 + 789221) * var4 + 1376312589 & Integer.MAX_VALUE;
        return var5 >> 19 & 0xFF;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "([III)V")
    public final void method375(int[] arg0, int arg1, int arg2) {
        field3230++;
        this.field3228.method375(arg0, arg1, arg2);
        for (class124 var4 = (class124) this.field3226.method1033(0); var4 != null; var4 = (class124) this.field3226.method1035(0)) {
            if (!this.field3225.method382(5286, var4)) {
                int var5 = arg2;
                int var6 = arg1;
                do {
                    if (var5 <= var4.field2745) {
                        this.method1076(arg0, var6, var4, var5, (byte) 127, var5 + var6);
                        var4.field2745 -= var5;
                        break;
                    }
                    this.method1076(arg0, var6, var4, var4.field2745, (byte) 121, var5 + var6);
                    var5 -= var4.field2745;
                    var6 += var4.field2745;
                } while (!this.field3225.method401(var4, var6, arg0, var5, -1));
            }
        }
    }

    @OriginalMember(owner = "client!ra", name = "d", descriptor = "()I")
    public final int method404() {
        field3220++;
        return 0;
    }

    @OriginalMember(owner = "client!ra", name = "c", descriptor = "()Lqa;")
    public final class145 method373() {
        field3214++;
        class124 var1;
        do {
            var1 = (class124) this.field3226.method1035(0);
            if (var1 == null) {
                return null;
            }
        } while (var1.field2743 == null);
        return var1.field2743;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(IILng;)V")
    private final void method1072(int arg0, int arg1, class124 arg2) {
        if ((this.field3225.field1004[arg2.field2740] & 0x4) != 0 && arg2.field2730 < 0) {
            int var4 = this.field3225.field962[arg2.field2740] / class124.field2762;
            int var5 = (var4 + 1048575 - arg2.field2735) / var4;
            arg2.field2735 = arg2.field2735 + arg0 * var4 & 0xFFFFF;
            if (var5 <= arg0) {
                if (this.field3225.field1000[arg2.field2740] == 0) {
                    arg2.field2743 = class44.method443(arg2.field2753, arg2.field2743.method428(), arg2.field2743.method436(), arg2.field2743.method435());
                } else {
                    arg2.field2743 = class44.method443(arg2.field2753, arg2.field2743.method428(), 0, arg2.field2743.method435());
                    this.field3225.method377(arg2, -108, arg2.field2732.field2262[arg2.field2747] < 0);
                }
                if (arg2.field2732.field2262[arg2.field2747] < 0) {
                    arg2.field2743.method417(-1);
                }
                arg0 = arg2.field2735 / var4;
            }
        }
        field3219++;
        arg2.field2743.method396(arg0);
        if (arg1 <= 90) {
            this.field3226 = null;
        }
    }

    @OriginalMember(owner = "client!ra", name = "c", descriptor = "(I)V")
    public static final void method1073(int arg0) {
        class131.field2855++;
        class141.field3031.method854(154, true);
        if (arg0 != 0) {
            field3215 = 15;
        }
        for (class132 var1 = (class132) class133.field2885.method699(arg0 ^ 0xFFFFD649); var1 != null; var1 = (class132) class133.field2885.method701(arg0 - 67)) {
            if (var1.field2875 == 0) {
                class121.method929(var1, (byte) 120, true);
            }
        }
        field3217++;
        if (class198.field3967 != null) {
            class113.method901(0, class198.field3967);
            class198.field3967 = null;
        }
    }

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "()Lqa;")
    public final class145 method378() {
        class124 var1 = (class124) this.field3226.method1033(0);
        field3213++;
        if (var1 == null) {
            return null;
        } else if (var1.field2743 == null) {
            return this.method373();
        } else {
            return var1.field2743;
        }
    }

    @OriginalMember(owner = "client!ra", name = "d", descriptor = "(I)V")
    public static void method1074(int arg0) {
        if (arg0 == 1048575) {
            field3229 = null;
            field3224 = null;
            field3216 = null;
            field3232 = null;
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(BII)V")
    public static final void method1075(byte arg0, int arg1, int arg2) {
        field3221++;
        if (arg0 > -3) {
            method1071(-42, (byte) -121, -111);
        }
        if (class90.field2106 != 0 && arg2 != -1) {
            class60.method560(0, 32599, class134.field2906, false, arg2, class90.field2106);
            class164.field3377 = true;
        }
    }

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "(I)V")
    public final void method396(int arg0) {
        this.field3228.method396(arg0);
        field3227++;
        for (class124 var2 = (class124) this.field3226.method1033(0); var2 != null; var2 = (class124) this.field3226.method1035(0)) {
            if (!this.field3225.method382(5286, var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field2745) {
                        this.method1072(var3, 103, var2);
                        var2.field2745 -= var3;
                        break;
                    }
                    this.method1072(var2.field2745, 100, var2);
                    var3 -= var2.field2745;
                } while (!this.field3225.method401(var2, 0, null, var3, -1));
            }
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "([IILng;IBI)V")
    private final void method1076(int[] arg0, int arg1, class124 arg2, int arg3, byte arg4, int arg5) {
        int var7 = 8 % ((61 - arg4) / 55);
        if ((this.field3225.field1004[arg2.field2740] & 0x4) != 0 && arg2.field2730 < 0) {
            int var8 = this.field3225.field962[arg2.field2740] / class124.field2762;
            while (true) {
                int var9 = (var8 + 1048575 - arg2.field2735) / var8;
                if (var9 > arg3) {
                    arg2.field2735 += arg3 * var8;
                    break;
                }
                arg3 -= var9;
                arg2.field2743.method375(arg0, arg1, var9);
                arg1 += var9;
                arg2.field2735 += var8 * var9 - 1048576;
                int var10 = class124.field2762 / 100;
                class44 var11 = arg2.field2743;
                int var12 = 262144 / var8;
                if (var12 < var10) {
                    var10 = var12;
                }
                if (this.field3225.field1000[arg2.field2740] == 0) {
                    arg2.field2743 = class44.method443(arg2.field2753, var11.method428(), var11.method436(), var11.method435());
                } else {
                    arg2.field2743 = class44.method443(arg2.field2753, var11.method428(), 0, var11.method435());
                    this.field3225.method377(arg2, -116, arg2.field2732.field2262[arg2.field2747] < 0);
                    arg2.field2743.method418(var10, var11.method436());
                }
                if (arg2.field2732.field2262[arg2.field2747] < 0) {
                    arg2.field2743.method417(-1);
                }
                var11.method430(var10);
                var11.method375(arg0, arg1, arg5 - arg1);
                if (var11.method429()) {
                    this.field3228.method873(var11);
                }
            }
        }
        arg2.field2743.method375(arg0, arg1, arg3);
        field3223++;
    }

    @OriginalMember(owner = "client!ra", name = "<init>", descriptor = "(Lec;)V")
    public class154(class42 arg0) {
        this.field3225 = arg0;
    }
}
