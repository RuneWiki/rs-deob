import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bt")
public class class45 extends class237 {

    @OriginalMember(owner = "client!bt", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field510 = new String[] { method463(method462(" T\u0005Ir")), method463(method462(" T\u0005Gr")), method463(method462(" T\u0005@r")), method463(method462(" T\u0005Br")), method463(method462(" T\u0005Dr")) };

    @OriginalMember(owner = "client!bt", name = "o", descriptor = "I")
    public static int field503;

    @OriginalMember(owner = "client!bt", name = "s", descriptor = "I")
    public static int field504;

    @OriginalMember(owner = "client!bt", name = "p", descriptor = "I")
    public static int field505;

    @OriginalMember(owner = "client!bt", name = "r", descriptor = "I")
    public static int field506;

    @OriginalMember(owner = "client!bt", name = "q", descriptor = "I")
    public static int field508;

    @OriginalMember(owner = "client!bt", name = "u", descriptor = "I")
    public static int field509;

    @OriginalMember(owner = "client!bt", name = "t", descriptor = "Lhk;")
    private class107 field507;

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(B)Z", line = 3)
    public final boolean method457(byte arg0) {
        try {
            if (arg0 <= 9) {
                this.field507 = null;
            }
            ++field505;
            return !super.method457((byte) 29) ? false : super.field3645.method595(-2, ((class622) super.field3648).field8978);
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field510[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(IZII)V", line = 24)
    public final void method458(int arg0, boolean arg1, int arg2, int arg3) {
        try {
            ++field509;
            int var5 = this.method2048(116) * super.field3648.field1869 / 10000;
            int[] var6 = new int[4];
            class662.field9437.method201(var6);
            class662.field9437.method221(arg3, arg0 - -2, arg3 + var5, arg0 - -super.field3648.field1862);
            this.field507.method1002(arg3, arg0 + arg2, super.field3648.field1869, super.field3648.field1862);
            class662.field9437.method221(var6[0], var6[1], var6[2], var6[3]);
        } catch (RuntimeException var8) {
            throw class590.method4333(var8, field510[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!bt", name = "b", descriptor = "(B)V", line = 39)
    public final void method459(byte arg0) {
        try {
            super.method459(arg0);
            ++field508;
            this.field507 = class326.method2770(32428, super.field3645, ((class622) super.field3648).field8978);
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field510[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(IIIZ)V", line = 48)
    public final void method460(int arg0, int arg1, int arg2, boolean arg3) {
        try {
            class662.field9437.method208(arg0 - 2, arg1, super.field3648.field1869 - -4, super.field3648.field1862 + 2, ((class622) super.field3648).field8979, 0);
            ++field503;
            class662.field9437.method208(arg0 + -1, arg1 + 1, super.field3648.field1869 + 2, super.field3648.field1862, 0, 0);
            if (arg2 > -7) {
                field506 = 71;
            }
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field510[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!bt", name = "<init>", descriptor = "(Lgda;Lgda;Lrj;)V", line = 61)
    public class45(class58 arg0, class58 arg1, class622 arg2) {
        super(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(IIZ)V", line = 65)
    public static final void method461(int arg0, int arg1, boolean arg2) {
        try {
            ++field504;
            if (class770.field11259 < class770.field11265) {
                class770.field11259 = (float) ((double) class770.field11259 / 30.0D + (double) class770.field11259);
                if (class770.field11265 < class770.field11259) {
                    class770.field11259 = class770.field11265;
                }
                class130.method1239((byte) -86);
                class770.field11268 = (int) class770.field11259 >> 1;
                class770.field11264 = class438.method3441(class770.field11268, (byte) 117);
            } else if (class770.field11265 < class770.field11259) {
                class770.field11259 = (float) ((double) class770.field11259 - (double) class770.field11259 / 30.0D);
                if (class770.field11259 < class770.field11265) {
                    class770.field11259 = class770.field11265;
                }
                class130.method1239((byte) -86);
                class770.field11268 = (int) class770.field11259 >> 1;
                class770.field11264 = class438.method3441(class770.field11268, (byte) 117);
            }
            if (~class62.field822 != 0 && ~class116.field1695 != 0) {
                int var3 = class62.field822 - class95.field1383;
                if (~var3 > -3 || var3 > 2) {
                    var3 /= 8;
                }
                int var4 = -class317.field5174 + class116.field1695;
                if (~var4 > -3 || var4 > 2) {
                    var4 /= 8;
                }
                class95.field1383 -= -var3;
                class317.field5174 -= -var4;
                if (~var3 == -1 && var4 == 0) {
                    class116.field1695 = -1;
                    class62.field822 = -1;
                }
                class130.method1239((byte) -86);
            }
            if (~class750.field11052 < -1) {
                --class153.field2137;
                if (~class153.field2137 == -1) {
                    --class750.field11052;
                    class153.field2137 = 100;
                }
            } else {
                class581.field8367 = -1;
                class188.field2980 = -1;
            }
            if (arg2) {
                if (class698.field10048 && class728.field10663 != null) {
                    for (class388 var5 = (class388) class728.field10663.method3228(11); var5 != null; var5 = (class388) class728.field10663.method3216(arg2)) {
                        class209 var6 = class770.field11257.method2325(-2, var5.field6204.field6636);
                        if (var5.method3156(arg1, 4, arg0)) {
                            if (var6.field3306 != null) {
                                if (var6.field3306[4] != null) {
                                    class101.method954(var6.field3274, 1004, -1, -1, var6.field3289, var6.field3306[4], (long) var5.field6204.field6636, (long) var5.field6204.field6636, (byte) -52, 0, false, false, true);
                                }
                                if (var6.field3306[3] != null) {
                                    class101.method954(var6.field3274, 1012, -1, -1, var6.field3289, var6.field3306[3], (long) var5.field6204.field6636, (long) var5.field6204.field6636, (byte) -88, 0, false, false, true);
                                }
                                if (var6.field3306[2] != null) {
                                    class101.method954(var6.field3274, 1011, -1, -1, var6.field3289, var6.field3306[2], (long) var5.field6204.field6636, (long) var5.field6204.field6636, (byte) -68, 0, false, false, true);
                                }
                                if (var6.field3306[1] != null) {
                                    class101.method954(var6.field3274, 1008, -1, -1, var6.field3289, var6.field3306[1], (long) var5.field6204.field6636, (long) var5.field6204.field6636, (byte) -69, 0, false, false, true);
                                }
                                if (var6.field3306[0] != null) {
                                    class101.method954(var6.field3274, 1006, -1, -1, var6.field3289, var6.field3306[0], (long) var5.field6204.field6636, (long) var5.field6204.field6636, (byte) -90, 0, false, false, true);
                                }
                            }
                            if (!var5.field6204.field6632) {
                                var5.field6204.field6632 = true;
                                class598.method4382(class366.field5963, var5.field6204.field6636, var6.field3274);
                            }
                            if (var5.field6204.field6632) {
                                class598.method4382(class422.field6658, var5.field6204.field6636, var6.field3274);
                            }
                        } else if (var5.field6204.field6632) {
                            var5.field6204.field6632 = false;
                            class598.method4382(class155.field2156, var5.field6204.field6636, var6.field3274);
                        }
                    }
                }
            }
        } catch (RuntimeException var8) {
            throw class590.method4333(var8, field510[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!bt", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method462(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 90);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!bt", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method463(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 66;
                    break;
                case 1:
                    var10005 = 32;
                    break;
                case 2:
                    var10005 = 43;
                    break;
                case 3:
                    var10005 = 1;
                    break;
                default:
                    var10005 = 90;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
