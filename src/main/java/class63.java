import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!e")
public class class63 extends class166 {

    @OriginalMember(owner = "client!e", name = "W", descriptor = "I")
    private int field1217 = 0;

    @OriginalMember(owner = "client!e", name = "P", descriptor = "[S")
    private short[] field1211 = new short[257];

    @OriginalMember(owner = "client!e", name = "Y", descriptor = "Lhj;")
    public static class69 field1219 = class181.method1318("hitmarks", (byte) -127);

    @OriginalMember(owner = "client!e", name = "cb", descriptor = "Z")
    public static boolean field1223 = false;

    @OriginalMember(owner = "client!e", name = "R", descriptor = "Lta;")
    public static class241 field1213 = new class241(100);

    @OriginalMember(owner = "client!e", name = "gb", descriptor = "Lhj;")
    public static class69 field1227 = class181.method1318(" steht bereits auf Ihrer Ignorieren)2Liste(Q", (byte) -121);

    @OriginalMember(owner = "client!e", name = "hb", descriptor = "S")
    public static short field1228 = 1;

    @OriginalMember(owner = "client!e", name = "ib", descriptor = "I")
    public static int field1229 = 0;

    @OriginalMember(owner = "client!e", name = "kb", descriptor = "I")
    public static int field1231 = -1;

    @OriginalMember(owner = "client!e", name = "O", descriptor = "I")
    public static int field1210;

    @OriginalMember(owner = "client!e", name = "Q", descriptor = "I")
    public static int field1212;

    @OriginalMember(owner = "client!e", name = "X", descriptor = "I")
    public static int field1218;

    @OriginalMember(owner = "client!e", name = "Z", descriptor = "I")
    public static int field1220;

    @OriginalMember(owner = "client!e", name = "ab", descriptor = "I")
    public static int field1221;

    @OriginalMember(owner = "client!e", name = "bb", descriptor = "I")
    public static int field1222;

    @OriginalMember(owner = "client!e", name = "eb", descriptor = "I")
    public static int field1225;

    @OriginalMember(owner = "client!e", name = "fb", descriptor = "I")
    public static int field1226;

    @OriginalMember(owner = "client!e", name = "T", descriptor = "Ljf;")
    public static class62 field1214;

    @OriginalMember(owner = "client!e", name = "jb", descriptor = "Lnc;")
    public static class83 field1230;

    @OriginalMember(owner = "client!e", name = "U", descriptor = "[I")
    private int[] field1215;

    @OriginalMember(owner = "client!e", name = "V", descriptor = "[I")
    private int[] field1216;

    @OriginalMember(owner = "client!e", name = "db", descriptor = "[[I")
    private int[][] field1224;

    @OriginalMember(owner = "client!e", name = "e", descriptor = "(I)V")
    public static void method411(int arg0) {
        if (arg0 <= -109) {
            field1227 = null;
            field1230 = null;
            field1219 = null;
            field1213 = null;
            field1214 = null;
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(IIZ)V")
    public static final void method412(int arg0, int arg1, boolean arg2) {
        ++field1220;
        class135 var3 = class8.method38((byte) 126, 6, arg1);
        var3.method1011((byte) 122);
        if (!arg2) {
            method412(26, -128, false);
        }
        var3.field2539 = arg0;
    }

    @OriginalMember(owner = "client!e", name = "e", descriptor = "(II)[I")
    private final int[] method413(int arg0, int arg1) {
        ++field1218;
        if (~arg1 > arg0) {
            return this.field1216;
        } else {
            return ~this.field1224.length >= ~arg1 ? this.field1215 : this.field1224[arg1];
        }
    }

    @OriginalMember(owner = "client!e", name = "c", descriptor = "(I)V")
    public final void method16(int arg0) {
        ++field1226;
        if (this.field1224 == null) {
            this.field1224 = new int[][] { new int[2], { 4096, 4096 } };
        }
        int var2 = 46 % ((arg0 - 58) / 50);
        if (this.field1224.length < 2) {
            throw new RuntimeException("Curve operation requires at least two markers");
        } else {
            if (~this.field1217 == -3) {
                this.method414(true);
            }
            class243.method1728(-89);
            this.method416((byte) 123);
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(BLfh;I)V")
    public final void method18(byte arg0, class128 arg1, int arg2) {
        if (arg0 != 96) {
            field1231 = 74;
        }
        ++field1210;
        if (~arg2 == -1) {
            this.field1217 = arg1.method937(false);
            this.field1224 = new int[arg1.method937(false)][2];
            for (int var4 = 0; this.field1224.length > var4; ++var4) {
                this.field1224[var4][0] = arg1.method912(-94);
                this.field1224[var4][1] = arg1.method912(class197.method1442(arg0, -31));
            }
        }
    }

    @OriginalMember(owner = "client!e", name = "c", descriptor = "(Z)V")
    private final void method414(boolean arg0) {
        ++field1225;
        int[] var2 = this.field1224[0];
        if (arg0) {
            int[] var3 = this.field1224[1];
            int[] var4 = this.field1224[this.field1224.length + -2];
            int[] var5 = this.field1224[this.field1224.length + -1];
            this.field1215 = new int[] { var4[0] - (var5[0] - var4[0]), var4[1] + -var5[1] + var4[1] };
            this.field1216 = new int[] { var2[0] - var3[0] + var2[0], var2[1] - -var2[1] + -var3[1] };
        }
    }

    @OriginalMember(owner = "client!e", name = "f", descriptor = "(I)Lhj;")
    public static final class69 method415(int arg0) {
        if (arg0 != 17694) {
            field1231 = 55;
        }
        ++field1222;
        class69 var1 = class79.field1522;
        if (~class240.field4402 != -1) {
            var1 = client.field2810;
        }
        return class9.method42(-100, new class69[] { class47.field671, var1, class155.field2896, class98.method727(-229, class165.field3051), class216.field3916, class98.method727(-229, class114.field2181), class131.field2429 });
    }

    @OriginalMember(owner = "client!e", name = "d", descriptor = "(B)V")
    private final void method416(byte arg0) {
        ++field1212;
        if (arg0 > 82) {
            int var2 = this.field1217;
            if (var2 != 2) {
                if (var2 == 1) {
                    for (int var3 = 0; ~var3 > -258; ++var3) {
                        int var4 = var3 << 4;
                        int var5;
                        for (var5 = 1; ~var5 > ~(this.field1224.length + -1) && this.field1224[var5][0] <= var4; ++var5) {
                        }
                        int[] var6 = this.field1224[var5 + -1];
                        int[] var7 = this.field1224[var5];
                        int var8 = (-var6[0] + var4 << 12) / (var7[0] + -var6[0]);
                        int var9 = -class244.field4476[(var8 & 8176) >> 5] + 4096 >> 1;
                        int var10 = -var9 + 4096;
                        int var11 = var6[1] * var10 + var7[1] * var9 >> 12;
                        if (~var11 >= 32767) {
                            var11 = -32767;
                        }
                        if (~var11 <= -32769) {
                            var11 = 32767;
                        }
                        this.field1211[var3] = (short) var11;
                    }
                } else {
                    for (int var12 = 0; ~var12 > -258; ++var12) {
                        int var13 = var12 << 4;
                        int var14;
                        for (var14 = 1; ~var14 > ~(this.field1224.length + -1) && this.field1224[var14][0] <= var13; ++var14) {
                        }
                        int[] var15 = this.field1224[var14];
                        int[] var16 = this.field1224[var14 + -1];
                        int var17 = (var13 - var16[0] << 12) / (var15[0] + -var16[0]);
                        int var18 = -var17 + 4096;
                        int var19 = var15[1] * var17 + var16[1] * var18 >> 12;
                        if (var19 <= -32768) {
                            var19 = -32767;
                        }
                        if (var19 >= 32768) {
                            var19 = 32767;
                        }
                        this.field1211[var12] = (short) var19;
                    }
                }
            } else {
                for (int var20 = 0; var20 < 257; ++var20) {
                    int var21 = var20 << 4;
                    int var22;
                    for (var22 = 1; this.field1224.length + -1 > var22 && ~var21 <= ~this.field1224[var22][0]; ++var22) {
                    }
                    int[] var23 = this.field1224[var22 + -1];
                    int[] var24 = this.field1224[var22];
                    int var25 = this.method413(-1, var22 - 2)[1];
                    int var26 = var23[1];
                    int var27 = var24[1];
                    int var28 = this.method413(-1, var22 + 1)[1];
                    int var29 = (var21 - var23[0] << 12) / (var24[0] + -var23[0]);
                    int var30 = var29 * var29 >> 12;
                    int var31 = -var27 + var28 - (var25 - var26);
                    int var32 = -var26 + var25 + -var31;
                    int var34 = -var25 + var27;
                    int var35 = var30 * var32 >> 12;
                    int var36 = (var29 * var31 >> 12) * var30 >> 12;
                    int var37 = var29 * var34 >> 12;
                    int var38 = var26 + var35 + var36 + var37;
                    if (~var38 >= 32767) {
                        var38 = -32767;
                    }
                    if (var38 >= 32768) {
                        var38 = 32767;
                    }
                    this.field1211[var20] = (short) var38;
                }
            }
        }
    }

    @OriginalMember(owner = "client!e", name = "<init>", descriptor = "()V")
    public class63() {
        super(1, true);
    }

    @OriginalMember(owner = "client!e", name = "b", descriptor = "(II)[I")
    public final int[] method20(int arg0, int arg1) {
        if (arg1 != 8388607) {
            this.field1217 = -68;
        }
        int[] var3 = super.field3071.method1252(arg0, true);
        ++field1221;
        if (super.field3071.field3142) {
            int[] var4 = this.method1231(124, arg0, 0);
            for (int var5 = 0; ~class253.field4565 < ~var5; ++var5) {
                int var6 = var4[var5] >> 4;
                if (~var6 > -1) {
                    var6 = 0;
                }
                if (var6 > 256) {
                    var6 = 256;
                }
                var3[var5] = this.field1211[var6];
            }
        }
        return var3;
    }
}
