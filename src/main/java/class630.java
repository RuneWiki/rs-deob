import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public class class630 extends class334 {

    @OriginalMember(owner = "client!cd", name = "K", descriptor = "I")
    public static int field8932 = -1;

    @OriginalMember(owner = "client!cd", name = "F", descriptor = "F")
    public static float field8927;

    @OriginalMember(owner = "client!cd", name = "E", descriptor = "I")
    public static int field8926;

    @OriginalMember(owner = "client!cd", name = "G", descriptor = "I")
    public static int field8928;

    @OriginalMember(owner = "client!cd", name = "H", descriptor = "I")
    public static int field8929;

    @OriginalMember(owner = "client!cd", name = "I", descriptor = "I")
    public static int field8930;

    @OriginalMember(owner = "client!cd", name = "J", descriptor = "I")
    public static int field8931;

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "(II)Lmha;")
    public static final class422 method3595(int arg0, int arg1) {
        ++field8926;
        if (class497.field6832 && class527.field7353 <= arg1 && ~class42.field516 <= ~arg1) {
            return arg0 != 26316 ? null : class142.field2319[-class527.field7353 + arg1];
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(BLol;)Lwca;")
    public static final class43 method3596(byte arg0, class431 arg1) {
        ++field8928;
        if (arg0 >= -64) {
            field8927 = 1.2653209F;
        }
        int var2 = arg1.method2526(17);
        return new class43(var2);
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lkm;Z)Z")
    public static final boolean method3597(class208 arg0, boolean arg1) {
        boolean var2 = class678.field9594 == class454.field6207;
        int var3 = 0;
        short var4 = 0;
        byte var5 = 0;
        arg0.method1445(245373737);
        if (arg0.field3027 >= 0 && arg0.field3035 >= 0 && arg0.field3030 < class42.field520 && arg0.field3038 < class681.field9665) {
            short var6 = 0;
            for (int var7 = arg0.field3027; var7 <= arg0.field3030; ++var7) {
                for (int var11 = arg0.field3035; var11 <= arg0.field3038; ++var11) {
                    class172 var12 = class134.method1114(arg0.field10361, var7, var11);
                    if (var12 != null) {
                        class11 var13 = class5.method34(-20292, arg0);
                        class11 var14 = var12.field2594;
                        if (var14 == null) {
                            var12.field2594 = var13;
                        } else {
                            while (var14.field145 != null) {
                                var14 = var14.field145;
                            }
                            var14.field145 = var13;
                        }
                        if (var2 && (class510.field7018[var7][var11] & -16777216) != 0) {
                            var3 = class510.field7018[var7][var11];
                            var4 = class722.field10080[var7][var11];
                            var5 = class97.field1386[var7][var11];
                        }
                        if (!arg1 && var12.field2595 != null && var12.field2595.field3005 > var6) {
                            var6 = var12.field2595.field3005;
                        }
                    }
                }
            }
            if (var2 && (var3 & -16777216) != 0) {
                for (int var8 = arg0.field3027; var8 <= arg0.field3030; ++var8) {
                    for (int var9 = arg0.field3035; var9 <= arg0.field3038; ++var9) {
                        if ((class510.field7018[var8][var9] & -16777216) == 0) {
                            class510.field7018[var8][var9] = var3;
                            class722.field10080[var8][var9] = var4;
                            class97.field1386[var8][var9] = var5;
                        }
                    }
                }
            }
            if (arg1) {
                class316.field4516[class401.field5525++] = arg0;
            } else {
                int var10 = class678.field9594 == class454.field6207 ? 1 : 0;
                if (arg0.method1170(16383)) {
                    if (arg0.method1175((byte) 110)) {
                        arg0.field10360 = class277.field3997[var10];
                        class277.field3997[var10] = arg0;
                    } else {
                        arg0.field10360 = class5.field74[var10];
                        class5.field74[var10] = arg0;
                        class87.field1297 = true;
                    }
                } else {
                    arg0.field10360 = class407.field5602[var10];
                    class407.field5602[var10] = arg0;
                }
            }
            if (arg1) {
                arg0.field10358 -= var6;
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(II)[I")
    public final int[] method28(int arg0, int arg1) {
        ++field8931;
        if (arg1 != -22563988) {
            return null;
        } else {
            int[] var3 = super.field4743.method1027((byte) -77, arg0);
            if (super.field4743.field1993) {
                int var4 = class527.field7361[arg0];
                for (int var5 = 0; ~class439.field6099 < ~var5; ++var5) {
                    var3[var5] = this.method3599(class295.field4296[var5], var4, arg1 + 22579719) % 4096;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!cd", name = "<init>", descriptor = "()V")
    public class630() {
        super(0, true);
    }

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "(IBI)Z")
    public static final boolean method3598(int arg0, byte arg1, int arg2) {
        ++field8930;
        if (arg1 >= -64) {
            method3596((byte) 40, (class431) null);
        }
        return ~(540800 & arg0) != -1;
    }

    @OriginalMember(owner = "client!cd", name = "c", descriptor = "(III)I")
    private final int method3599(int arg0, int arg1, int arg2) {
        if (arg2 != 15731) {
            this.method3599(106, 50, -71);
        }
        ++field8929;
        int var4 = arg1 * 57 + arg0;
        int var5 = var4 << 1 ^ var4;
        return 4096 - (Integer.MAX_VALUE & (var5 * 15731 * var5 + 789221) * var5 - -1376312589) / 262144;
    }
}
