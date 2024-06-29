import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lh")
public class class245 extends class243 {

    @OriginalMember(owner = "client!lh", name = "nb", descriptor = "I")
    private int field4286 = 0;

    @OriginalMember(owner = "client!lh", name = "pb", descriptor = "[S")
    private short[] field4288 = new short[257];

    @OriginalMember(owner = "client!lh", name = "cb", descriptor = "I")
    public static int field4275 = 0;

    @OriginalMember(owner = "client!lh", name = "rb", descriptor = "I")
    public static int field4290 = 0;

    @OriginalMember(owner = "client!lh", name = "lb", descriptor = "Lub;")
    private static class227 field4284 = class257.method1749("Loading )2 please wait)3", 17263);

    @OriginalMember(owner = "client!lh", name = "Y", descriptor = "Lub;")
    public static class227 field4271 = field4284;

    @OriginalMember(owner = "client!lh", name = "sb", descriptor = "I")
    public static int field4291 = 0;

    @OriginalMember(owner = "client!lh", name = "ab", descriptor = "I")
    public static int field4273;

    @OriginalMember(owner = "client!lh", name = "bb", descriptor = "I")
    public static int field4274;

    @OriginalMember(owner = "client!lh", name = "gb", descriptor = "I")
    public static int field4279;

    @OriginalMember(owner = "client!lh", name = "hb", descriptor = "I")
    public static int field4280;

    @OriginalMember(owner = "client!lh", name = "ib", descriptor = "I")
    public static int field4281;

    @OriginalMember(owner = "client!lh", name = "jb", descriptor = "I")
    public static int field4282;

    @OriginalMember(owner = "client!lh", name = "mb", descriptor = "I")
    public static int field4285;

    @OriginalMember(owner = "client!lh", name = "qb", descriptor = "I")
    public static int field4289;

    @OriginalMember(owner = "client!lh", name = "tb", descriptor = "I")
    public static int field4292;

    @OriginalMember(owner = "client!lh", name = "ub", descriptor = "I")
    public static int field4293;

    @OriginalMember(owner = "client!lh", name = "fb", descriptor = "[I")
    private int[] field4278;

    @OriginalMember(owner = "client!lh", name = "ob", descriptor = "[I")
    private int[] field4287;

    @OriginalMember(owner = "client!lh", name = "eb", descriptor = "[Lnf;")
    public static class213[] field4277;

    @OriginalMember(owner = "client!lh", name = "Z", descriptor = "[Lgb;")
    public static class46[] field4272;

    @OriginalMember(owner = "client!lh", name = "kb", descriptor = "[[I")
    private int[][] field4283;

    @OriginalMember(owner = "client!lh", name = "db", descriptor = "[[[B")
    public static byte[][][] field4276;

    @OriginalMember(owner = "client!lh", name = "g", descriptor = "(I)V")
    private final void method1633(int arg0) {
        ++field4293;
        int[] var2 = this.field4283[1];
        int[] var3 = this.field4283[0];
        if (arg0 == 2350) {
            int[] var4 = this.field4283[this.field4283.length + -2];
            int[] var5 = this.field4283[this.field4283.length - 1];
            this.field4278 = new int[] { var4[0] + -var5[0] + var4[0], var4[1] - (-var4[1] - -var5[1]) };
            this.field4287 = new int[] { var3[0] - var2[0] - -var3[0], var3[1] - (var2[1] + -var3[1]) };
        }
    }

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "(Z)V")
    public final void method170(boolean arg0) {
        if (this.field4283 == null) {
            this.field4283 = new int[][] { new int[2], { 4096, 4096 } };
        }
        ++field4281;
        if (this.field4283.length < 2) {
            throw new RuntimeException("Curve operation requires at least two markers");
        } else {
            if (~this.field4286 == -3) {
                this.method1633(2350);
            }
            class87.method522(113);
            if (!arg0) {
                this.method1635(0);
            }
        }
    }

    @OriginalMember(owner = "client!lh", name = "c", descriptor = "(II)[I")
    private final int[] method1634(int arg0, int arg1) {
        ++field4282;
        if (~arg0 > -1) {
            return this.field4287;
        } else if (~this.field4283.length >= ~arg0) {
            return this.field4278;
        } else {
            return arg1 != 0 ? null : this.field4283[arg0];
        }
    }

    @OriginalMember(owner = "client!lh", name = "h", descriptor = "(I)V")
    private final void method1635(int arg0) {
        if (arg0 != 0) {
            field4271 = null;
        }
        int var2 = this.field4286;
        if (var2 != 2) {
            if (var2 == 1) {
                for (int var3 = 0; ~var3 > -258; ++var3) {
                    int var4 = var3 << 4;
                    int var5;
                    for (var5 = 1; ~(this.field4283.length + -1) < ~var5 && var4 >= this.field4283[var5][0]; ++var5) {
                    }
                    int[] var6 = this.field4283[var5 - 1];
                    int[] var7 = this.field4283[var5];
                    int var8 = (-var6[0] + var4 << 12) / (var7[0] + -var6[0]);
                    int var9 = -class43.field716[255 & var8 >> 5] + 4096 >> 1;
                    int var10 = -var9 + 4096;
                    int var11 = var6[1] * var10 - -(var7[1] * var9) >> 12;
                    if (var11 <= -32768) {
                        var11 = -32767;
                    }
                    if (var11 >= 32768) {
                        var11 = 32767;
                    }
                    this.field4288[var3] = (short) var11;
                }
            } else {
                for (int var12 = 0; ~var12 > -258; ++var12) {
                    int var13 = var12 << 4;
                    int var14;
                    for (var14 = 1; ~(this.field4283.length + -1) < ~var14 && var13 >= this.field4283[var14][0]; ++var14) {
                    }
                    int[] var15 = this.field4283[var14 + -1];
                    int[] var16 = this.field4283[var14];
                    int var17 = (-var15[0] + var13 << 12) / (var16[0] + -var15[0]);
                    int var18 = -var17 + 4096;
                    int var19 = var15[1] * var18 + var16[1] * var17 >> 12;
                    if (~var19 >= 32767) {
                        var19 = -32767;
                    }
                    if (~var19 <= -32769) {
                        var19 = 32767;
                    }
                    this.field4288[var12] = (short) var19;
                }
            }
        } else {
            for (int var20 = 0; var20 < 257; ++var20) {
                int var21 = var20 << 4;
                int var22;
                for (var22 = 1; this.field4283.length + -1 > var22 && this.field4283[var22][0] <= var21; ++var22) {
                }
                int[] var23 = this.field4283[var22];
                int[] var24 = this.field4283[var22 + -1];
                int var25 = this.method1634(var22 + -2, arg0)[1];
                int var26 = var23[1];
                int var27 = var24[1];
                int var28 = this.method1634(var22 + 1, arg0)[1];
                int var29 = (var21 - var24[0] << 12) / (var23[0] + -var24[0]);
                int var31 = var29 * var29 >> 12;
                int var32 = -var25 + var26;
                int var33 = var29 * var32 >> 12;
                int var34 = var27 + var28 - (var26 - -var25);
                int var35 = -var27 + var25 + -var34;
                int var36 = (var29 * var34 >> 12) * var31 >> 12;
                int var37 = var31 * var35 >> 12;
                int var38 = var37 - -var33 + var36 - -var27;
                if (var38 <= -32768) {
                    var38 = -32767;
                }
                if (~var38 <= -32769) {
                    var38 = 32767;
                }
                this.field4288[var20] = (short) var38;
            }
        }
        ++field4280;
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(Lnj;ZI)V")
    public final void method81(class226 arg0, boolean arg1, int arg2) {
        if (~arg2 == -1) {
            this.field4286 = arg0.method1471(255);
            this.field4283 = new int[arg0.method1471(255)][2];
            for (int var4 = 0; ~var4 > ~this.field4283.length; ++var4) {
                this.field4283[var4][0] = arg0.method1447(0);
                this.field4283[var4][1] = arg0.method1447(0);
            }
        }
        ++field4274;
        if (arg1) {
            this.method1634(-42, 9);
        }
    }

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "(IBI)V")
    public static final void method1636(int arg0, byte arg1, int arg2) {
        ++field4279;
        if (~class212.field3586 != ~arg0) {
            class212.field3585 = new int[arg0];
            for (int var3 = 0; arg0 > var3; ++var3) {
                class212.field3585[var3] = (var3 << 12) / arg0;
            }
            class254.field4461 = ~arg0 != -65 ? 4096 : 2048;
            class212.field3586 = arg0;
            class179.field3062 = arg0 + -1;
        }
        if (arg1 == 7) {
            if (class193.field3280 != arg2) {
                if (class212.field3586 == arg2) {
                    class148.field2582 = class212.field3585;
                } else {
                    class148.field2582 = new int[arg2];
                    for (int var4 = 0; ~arg2 < ~var4; ++var4) {
                        class148.field2582[var4] = (var4 << 12) / arg2;
                    }
                }
                class254.field4469 = arg2 + -1;
                class193.field3280 = arg2;
            }
        }
    }

    @OriginalMember(owner = "client!lh", name = "<init>", descriptor = "()V")
    public class245() {
        super(1, true);
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(JB)Lub;")
    public static final class227 method1637(long arg0, byte arg1) {
        class109.field2049.setTime(new Date(arg0));
        ++field4292;
        if (arg1 <= 20) {
            return null;
        } else {
            int var3 = class109.field2049.get(7);
            int var4 = class109.field2049.get(5);
            int var5 = class109.field2049.get(2);
            int var6 = class109.field2049.get(1);
            int var7 = class109.field2049.get(11);
            int var8 = class109.field2049.get(12);
            int var9 = class109.field2049.get(13);
            return class76.method445((byte) -104, new class227[] { class240.field4179[var3 + -1], class194.field3298, class204.method1303(var4 / 10, 1), class204.method1303(var4 % 10, 1), class151.field2620, class34.field557[var5], class151.field2620, class204.method1303(var6, 1), class256.field4490, class204.method1303(var7 / 10, 1), class204.method1303(var7 % 10, 1), class165.field2768, class204.method1303(var8 / 10, 1), class204.method1303(var8 % 10, 1), class165.field2768, class204.method1303(var9 / 10, 1), class204.method1303(var9 % 10, 1), class132.field2298 });
        }
    }

    @OriginalMember(owner = "client!lh", name = "c", descriptor = "(Z)V")
    public static void method1638(boolean arg0) {
        field4284 = null;
        if (arg0) {
            field4272 = null;
        }
        field4272 = null;
        field4277 = null;
        field4276 = null;
        field4271 = null;
    }

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "(II)[I")
    public final int[] method77(int arg0, int arg1) {
        ++field4285;
        int var3 = 121 / ((arg0 - -15) / 51);
        int[] var4 = super.field4215.method984(arg1, 0);
        if (super.field4215.field2707) {
            int[] var5 = this.method1614(0, arg1, 83);
            for (int var6 = 0; ~class212.field3586 < ~var6; ++var6) {
                int var7 = var5[var6] >> 4;
                if (var7 < 0) {
                    var7 = 0;
                }
                if (var7 > 256) {
                    var7 = 256;
                }
                var4[var6] = this.field4288[var7];
            }
        }
        return var4;
    }
}
