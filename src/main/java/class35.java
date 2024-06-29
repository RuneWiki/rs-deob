import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!de")
public class class35 extends class105 {

    @OriginalMember(owner = "client!de", name = "fb", descriptor = "I")
    private int field680 = 0;

    @OriginalMember(owner = "client!de", name = "Z", descriptor = "I")
    public static int field674 = 0;

    @OriginalMember(owner = "client!de", name = "kb", descriptor = "Lwf;")
    public static class204 field685 = new class204(512);

    @OriginalMember(owner = "client!de", name = "lb", descriptor = "Leh;")
    public static class47 field686 = null;

    @OriginalMember(owner = "client!de", name = "mb", descriptor = "I")
    public static int field687 = 0;

    @OriginalMember(owner = "client!de", name = "nb", descriptor = "I")
    public static int field688 = 0;

    @OriginalMember(owner = "client!de", name = "Y", descriptor = "I")
    public static int field673;

    @OriginalMember(owner = "client!de", name = "ab", descriptor = "I")
    public static int field675;

    @OriginalMember(owner = "client!de", name = "cb", descriptor = "I")
    public static int field677;

    @OriginalMember(owner = "client!de", name = "db", descriptor = "I")
    public static int field678;

    @OriginalMember(owner = "client!de", name = "gb", descriptor = "I")
    public static int field681;

    @OriginalMember(owner = "client!de", name = "ib", descriptor = "I")
    public static int field683;

    @OriginalMember(owner = "client!de", name = "jb", descriptor = "I")
    public static int field684;

    @OriginalMember(owner = "client!de", name = "bb", descriptor = "[I")
    private int[] field676;

    @OriginalMember(owner = "client!de", name = "hb", descriptor = "[I")
    private int[] field682;

    @OriginalMember(owner = "client!de", name = "eb", descriptor = "[[I")
    private int[][] field679;

    @OriginalMember(owner = "client!de", name = "<init>", descriptor = "()V")
    public class35() {
        super(1, true);
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(II)[I")
    private final int[] method300(int arg0, int arg1) {
        ++field684;
        if (arg1 < arg0) {
            return this.field676;
        } else {
            return ~arg1 <= ~this.field679.length ? this.field682 : this.field679[arg1];
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(ILhd;I)V")
    public final void method17(int arg0, class68 arg1, int arg2) {
        if (~arg0 == -1) {
            this.field680 = arg1.method604((byte) -124);
            this.field679 = new int[arg1.method604((byte) 5)][2];
            for (int var4 = 0; var4 < this.field679.length; ++var4) {
                this.field679[var4][0] = arg1.method569(26496);
                this.field679[var4][1] = arg1.method569(class136.method989(arg2, -26496));
            }
        }
        ++field673;
        if (arg2 != -256) {
            method301(3);
        }
    }

    @OriginalMember(owner = "client!de", name = "e", descriptor = "(I)V")
    public final void method13(int arg0) {
        if (this.field679 == null) {
            this.field679 = new int[][] { new int[2], { 4096, 4096 } };
        }
        ++field678;
        if (~this.field679.length > -3) {
            throw new RuntimeException("Curve operation requires at least two markers");
        } else {
            if (this.field680 == 2) {
                this.method304(arg0 + 123);
            }
            if (arg0 != -1) {
                field686 = null;
            }
            class185.method1227((byte) -75);
        }
    }

    @OriginalMember(owner = "client!de", name = "f", descriptor = "(I)V")
    public static void method301(int arg0) {
        field685 = null;
        field686 = null;
        if (arg0 != 32177) {
            field686 = null;
        }
    }

    @OriginalMember(owner = "client!de", name = "c", descriptor = "(B)V")
    public static final void method302(byte arg0) {
        class120.field2421.method993(1);
        ++field683;
        if (arg0 >= -44) {
            method301(-28);
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(Llc;III)V")
    public static final void method303(class102 arg0, int arg1, int arg2, int arg3) {
        if (arg2 < class103.field2156) {
            class152 var4 = class173.field3351[arg1][arg2 + 1][arg3];
            if (var4 != null && var4.field2989 != null && var4.field2989.field3894 instanceof class102) {
                class102 var5 = (class102) var4.field2989.field3894;
                class102.method827(arg0, var5, 128, 0, 0, true);
            }
        }
        if (arg3 < class103.field2156) {
            class152 var6 = class173.field3351[arg1][arg2][arg3 + 1];
            if (var6 != null && var6.field2989 != null && var6.field2989.field3894 instanceof class102) {
                class102 var7 = (class102) var6.field2989.field3894;
                class102.method827(arg0, var7, 0, 0, 128, true);
            }
        }
        if (arg2 < class103.field2156 && arg3 < class100.field2102) {
            class152 var8 = class173.field3351[arg1][arg2 + 1][arg3 + 1];
            if (var8 != null && var8.field2989 != null && var8.field2989.field3894 instanceof class102) {
                class102 var9 = (class102) var8.field2989.field3894;
                class102.method827(arg0, var9, 128, 0, 128, true);
            }
        }
        if (arg2 < class103.field2156 && arg3 > 0) {
            class152 var10 = class173.field3351[arg1][arg2 + 1][arg3 - 1];
            if (var10 != null && var10.field2989 != null && var10.field2989.field3894 instanceof class102) {
                class102 var11 = (class102) var10.field2989.field3894;
                class102.method827(arg0, var11, 128, 0, -128, true);
            }
        }
    }

    @OriginalMember(owner = "client!de", name = "g", descriptor = "(I)V")
    private final void method304(int arg0) {
        ++field681;
        int[] var2 = this.field679[0];
        int[] var3 = this.field679[this.field679.length + -2];
        int[] var4 = this.field679[1];
        int[] var5 = this.field679[this.field679.length + -1];
        this.field682 = new int[] { var3[0] + -var5[0] + var3[0], var3[1] + -var5[1] + var3[1] };
        if (arg0 <= 109) {
            this.field680 = 100;
        }
        this.field676 = new int[] { var2[0] + var2[0] + -var4[0], var2[1] + -var4[1] + var2[1] };
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(Lhd;I)Leh;")
    public static final class47 method305(class68 arg0, int arg1) {
        if (arg1 != 32767) {
            method301(-70);
        }
        ++field675;
        return class54.method472(32767, (byte) 117, arg0);
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(IB)[I")
    public final int[] method92(int arg0, byte arg1) {
        ++field677;
        if (arg1 <= 78) {
            field688 = 22;
        }
        int[] var3 = super.field2192.method336(-99, arg0);
        if (super.field2192.field770) {
            int[] var4 = this.method851(0, true, arg0);
            int var5 = this.field680;
            if (var5 != 2) {
                if (var5 == 1) {
                    for (int var6 = 0; ~class149.field2928 < ~var6; ++var6) {
                        int var7 = var4[var6];
                        int var8;
                        for (var8 = 1; ~var8 > ~(this.field679.length + -1) && ~this.field679[var8][0] >= ~var7; ++var8) {
                        }
                        int[] var9 = this.field679[var8];
                        int[] var10 = this.field679[var8 + -1];
                        int var11 = (-var10[0] + var7 << 12) / (var9[0] + -var10[0]);
                        int var12 = 4096 - class72.field1551[var11 >> 5 & 255] >> 1;
                        int var13 = -var12 + 4096;
                        var3[var6] = var9[1] * var12 + var10[1] * var13 >> 12;
                    }
                } else {
                    for (int var14 = 0; class149.field2928 > var14; ++var14) {
                        int var15 = var4[var14];
                        int var16;
                        for (var16 = 1; var16 < this.field679.length + -1 && var15 >= this.field679[var16][0]; ++var16) {
                        }
                        int[] var17 = this.field679[var16];
                        int[] var18 = this.field679[var16 + -1];
                        int var19 = (var15 - var18[0] << 12) / (var17[0] - var18[0]);
                        int var20 = -var19 + 4096;
                        var3[var14] = var17[1] * var19 + var18[1] * var20 >> 12;
                    }
                }
            } else {
                for (int var21 = 0; ~var21 > ~class149.field2928; ++var21) {
                    int var22 = var4[var21];
                    int var23;
                    for (var23 = 1; ~(this.field679.length - 1) < ~var23 && ~this.field679[var23][0] >= ~var22; ++var23) {
                    }
                    int[] var24 = this.field679[var23 - 1];
                    int[] var25 = this.field679[var23];
                    int var26 = this.method300(0, var23 + -2)[1];
                    int var27 = var25[1];
                    int var28 = var24[1];
                    int var29 = this.method300(0, var23 + 1)[1];
                    int var30 = (-var24[0] + var22 << 12) / (var25[0] - var24[0]);
                    int var31 = -var26 + var28 + -var27 + var29;
                    int var32 = -var26 + var27;
                    int var33 = var30 * var30 >> 12;
                    int var34 = -var28 + -var31 + var26;
                    int var36 = (var30 * var31 >> 12) * var33 >> 12;
                    int var37 = var33 * var34 >> 12;
                    int var38 = var30 * var32 >> 12;
                    var3[var21] = var36 + var37 - -var38 - -var28;
                }
            }
        }
        return var3;
    }
}
