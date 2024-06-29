import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public class class293 extends class197 {

    @OriginalMember(owner = "client!ac", name = "P", descriptor = "I")
    private int field5033 = 2048;

    @OriginalMember(owner = "client!ac", name = "O", descriptor = "I")
    private int field5032 = 0;

    @OriginalMember(owner = "client!ac", name = "Z", descriptor = "I")
    private int field5043 = 10;

    @OriginalMember(owner = "client!ac", name = "W", descriptor = "Loh;")
    public static class258 field5040 = class153.method1046("Weiter", 121);

    @OriginalMember(owner = "client!ac", name = "bb", descriptor = "Loh;")
    public static class258 field5045 = class153.method1046("Wordpack geladen)3", 119);

    @OriginalMember(owner = "client!ac", name = "S", descriptor = "Lf;")
    public static class121 field5036 = new class121(5000);

    @OriginalMember(owner = "client!ac", name = "db", descriptor = "[I")
    public static int[] field5047 = new int[256];

    @OriginalMember(owner = "client!ac", name = "cb", descriptor = "Loh;")
    public static class258 field5046 = class153.method1046("Lade)3)3)3", 113);

    @OriginalMember(owner = "client!ac", name = "M", descriptor = "I")
    public static int field5030;

    @OriginalMember(owner = "client!ac", name = "Q", descriptor = "I")
    public static int field5034;

    @OriginalMember(owner = "client!ac", name = "R", descriptor = "I")
    public static int field5035;

    @OriginalMember(owner = "client!ac", name = "U", descriptor = "I")
    public static int field5038;

    @OriginalMember(owner = "client!ac", name = "V", descriptor = "I")
    public static int field5039;

    @OriginalMember(owner = "client!ac", name = "X", descriptor = "I")
    public static int field5041;

    @OriginalMember(owner = "client!ac", name = "Y", descriptor = "I")
    public static int field5042;

    @OriginalMember(owner = "client!ac", name = "N", descriptor = "Lgb;")
    public static class213 field5031;

    @OriginalMember(owner = "client!ac", name = "T", descriptor = "[I")
    private int[] field5037;

    @OriginalMember(owner = "client!ac", name = "ab", descriptor = "[I")
    private int[] field5044;

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "(I)V", line = 5)
    public static void method2054(int arg0) {
        field5045 = null;
        field5036 = null;
        if (arg0 < 75) {
            method2055(104, -11, -108);
        }
        field5031 = null;
        field5046 = null;
        field5040 = null;
        field5047 = null;
    }

    @OriginalMember(owner = "client!ac", name = "<init>", descriptor = "()V", line = 22)
    public class293() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(I)V", line = 28)
    public final void method223(int arg0) {
        field5038++;
        if (arg0 == 11135) {
            this.method2057(-32522);
        }
    }

    @OriginalMember(owner = "client!ac", name = "d", descriptor = "(III)J", line = 39)
    public static final long method2055(int arg0, int arg1, int arg2) {
        class228 var3 = class178.field3180[arg0][arg1][arg2];
        return var3 == null || var3.field3931 == null ? 0L : var3.field3931.field4306;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIIIBI)V", line = 48)
    public static final void method2056(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5) {
        int var6 = -51 / ((arg4 - 20) / 50);
        field5030++;
        if (arg1 > class94.field1654 || arg0 < class241.field4189) {
            return;
        }
        boolean var7;
        if (class75.field1314 > arg3) {
            var7 = false;
            arg3 = class75.field1314;
        } else if (class206.field3562 >= arg3) {
            var7 = true;
        } else {
            arg3 = class206.field3562;
            var7 = false;
        }
        boolean var8;
        if (class75.field1314 > arg2) {
            arg2 = class75.field1314;
            var8 = false;
        } else if (class206.field3562 >= arg2) {
            var8 = true;
        } else {
            arg2 = class206.field3562;
            var8 = false;
        }
        if (arg1 >= class241.field4189) {
            class19.method126(7, arg5, class154.field2638[arg1++], arg3, arg2);
        } else {
            arg1 = class241.field4189;
        }
        if (class94.field1654 >= arg0) {
            class19.method126(7, arg5, class154.field2638[arg0--], arg3, arg2);
        } else {
            arg0 = class94.field1654;
        }
        if (var7 && var8) {
            for (int var9 = arg1; var9 <= arg0; var9++) {
                int[] var10 = class154.field2638[var9];
                var10[arg3] = var10[arg2] = arg5;
            }
        } else if (var7) {
            for (int var11 = arg1; var11 <= arg0; var11++) {
                class154.field2638[var11][arg3] = arg5;
            }
        } else if (var8) {
            for (int var12 = arg1; var12 <= arg0; var12++) {
                class154.field2638[var12][arg2] = arg5;
            }
        }
    }

    @OriginalMember(owner = "client!ac", name = "c", descriptor = "(I)V", line = 168)
    private final void method2057(int arg0) {
        this.field5037 = new int[this.field5043 + 1];
        field5042++;
        int var2 = 0;
        this.field5044 = new int[this.field5043 + 1];
        int var3 = 4096 / this.field5043;
        int var4 = this.field5033 * var3 >> 12;
        if (arg0 != -32522) {
            method2056(51, -39, 27, -86, (byte) 70, -102);
        }
        for (int var5 = 0; var5 < this.field5043; var5++) {
            this.field5037[var5] = var2;
            this.field5044[var5] = var2 + var4;
            var2 += var3;
        }
        this.field5037[this.field5043] = 4096;
        this.field5044[this.field5043] = this.field5044[0] + 4096;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(II)[I", line = 208)
    public final int[] method96(int arg0, int arg1) {
        if (arg0 != -16221) {
            return (int[]) null;
        }
        field5034++;
        int[] var3 = this.field3456.method2104(arg1, arg0 + 16221);
        if (this.field3456.field5115) {
            int var4 = class268.field4670[arg1];
            if (this.field5032 == 0) {
                short var5 = 0;
                for (int var6 = 0; var6 < this.field5043; var6++) {
                    if (var4 >= this.field5037[var6] && var4 < this.field5037[var6 + 1]) {
                        if (this.field5044[var6] > var4) {
                            var5 = 4096;
                        }
                        break;
                    }
                }
                class275.method1931(var3, 0, class190.field3362, var5);
            } else {
                for (int var7 = 0; var7 < class190.field3362; var7++) {
                    short var8 = 0;
                    int var9 = 0;
                    int var10 = class166.field2822[var7];
                    int var11 = this.field5032;
                    if (var11 == 1) {
                        var9 = var10;
                    } else if (var11 == 2) {
                        var9 = (var10 - (4096 - var4) >> 1) + 2048;
                    } else if (var11 == 3) {
                        var9 = (var10 - var4 >> 1) + 2048;
                    }
                    for (int var12 = 0; var12 < this.field5043; var12++) {
                        if (this.field5037[var12] <= var9 && var9 < this.field5037[var12 + 1]) {
                            if (var9 < this.field5044[var12]) {
                                var8 = 4096;
                            }
                            break;
                        }
                    }
                    var3[var7] = var8;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(BLgb;I)Lkl;", line = 334)
    public static final class65 method2058(byte arg0, class213 arg1, int arg2) {
        field5041++;
        int var3 = 3 / ((arg0 - 26) / 44);
        return class286.method2016(arg1, false, arg2) ? class1.method5(-4928) : null;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(ILva;I)V", line = 356)
    public final void method98(int arg0, class235 arg1, int arg2) {
        if (arg0 != 7955) {
            method2054(75);
        }
        if (arg2 == 0) {
            this.field5043 = arg1.method1589(65);
        } else if (arg2 == 1) {
            this.field5033 = arg1.method1615(-126);
        } else if (arg2 == 2) {
            this.field5032 = arg1.method1589(93);
        }
        field5035++;
    }
}
