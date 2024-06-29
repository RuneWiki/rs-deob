import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hq")
public class class36 extends class149 {

    @OriginalMember(owner = "client!hq", name = "L", descriptor = "I")
    private int field582 = 4096;

    @OriginalMember(owner = "client!hq", name = "J", descriptor = "I")
    private int field580 = 0;

    @OriginalMember(owner = "client!hq", name = "I", descriptor = "F")
    public static float field579;

    @OriginalMember(owner = "client!hq", name = "Q", descriptor = "F")
    public static float field587;

    @OriginalMember(owner = "client!hq", name = "K", descriptor = "I")
    public static int field581;

    @OriginalMember(owner = "client!hq", name = "N", descriptor = "I")
    public static int field584;

    @OriginalMember(owner = "client!hq", name = "O", descriptor = "I")
    public static int field585;

    @OriginalMember(owner = "client!hq", name = "P", descriptor = "I")
    public static int field586;

    @OriginalMember(owner = "client!hq", name = "M", descriptor = "Lln;")
    public static class169 field583;

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(II)[I")
    public final int[] method92(int arg0, int arg1) {
        ++field586;
        int[] var3 = super.field2152.method2891(arg1, (byte) 79);
        if (arg0 != -10835) {
            field579 = -0.7875299F;
        }
        if (super.field2152.field7051) {
            int[] var4 = this.method983(0, 24824, arg1);
            for (int var5 = 0; var5 < class316.field4838; ++var5) {
                int var6 = var4[var5];
                if (this.field580 > var6) {
                    var3[var5] = this.field580;
                } else if (~this.field582 > ~var6) {
                    var3[var5] = this.field582;
                } else {
                    var3[var5] = var6;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!hq", name = "<init>", descriptor = "()V")
    public class36() {
        super(1, false);
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(IBLtl;)V")
    public final void method93(int arg0, byte arg1, class91 arg2) {
        ++field581;
        if (~arg0 != -1) {
            if (~arg0 != -2) {
                if (~arg0 == -3) {
                    super.field2148 = ~arg2.method618((byte) 100) == -2;
                }
            } else {
                this.field582 = arg2.method631(10494);
            }
        } else {
            this.field580 = arg2.method631(10494);
        }
        if (arg1 != 35) {
            this.field580 = -89;
        }
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(BI)[[I")
    public final int[][] method139(byte arg0, int arg1) {
        ++field584;
        if (arg0 >= -45) {
            return null;
        } else {
            int[][] var3 = super.field2147.method2726(arg1, 0);
            if (super.field2147.field6664) {
                int[][] var4 = this.method984((byte) 118, 0, arg1);
                int[] var5 = var4[0];
                int[] var6 = var4[1];
                int[] var7 = var4[2];
                int[] var8 = var3[0];
                int[] var9 = var3[1];
                int[] var10 = var3[2];
                for (int var11 = 0; var11 < class316.field4838; ++var11) {
                    int var12 = var5[var11];
                    int var13 = var6[var11];
                    int var14 = var7[var11];
                    if (this.field580 > var12) {
                        var8[var11] = this.field580;
                    } else if (~var12 < ~this.field582) {
                        var8[var11] = this.field582;
                    } else {
                        var8[var11] = var12;
                    }
                    if (var13 >= this.field580) {
                        if (~var13 < ~this.field582) {
                            var9[var11] = this.field582;
                        } else {
                            var9[var11] = var13;
                        }
                    } else {
                        var9[var11] = this.field580;
                    }
                    if (this.field580 <= var14) {
                        if (this.field582 >= var14) {
                            var10[var11] = var14;
                        } else {
                            var10[var11] = this.field582;
                        }
                    } else {
                        var10[var11] = this.field580;
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!hq", name = "e", descriptor = "(I)V")
    public static void method265(int arg0) {
        field583 = null;
        if (arg0 != 2) {
            method265(-42);
        }
    }
}
