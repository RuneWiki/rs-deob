import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!b")
public class class11 extends class64 {

    @OriginalMember(owner = "client!b", name = "eb", descriptor = "Z")
    public static boolean field261 = false;

    @OriginalMember(owner = "client!b", name = "cb", descriptor = "Lua;")
    public static class181 field259 = new class181(50);

    @OriginalMember(owner = "client!b", name = "nb", descriptor = "I")
    public static int field270 = 0;

    @OriginalMember(owner = "client!b", name = "lb", descriptor = "Lsg;")
    private static class169 field268 = class165.method1060("Bad session id)3", 1536);

    @OriginalMember(owner = "client!b", name = "qb", descriptor = "[I")
    public static int[] field273 = new int[200];

    @OriginalMember(owner = "client!b", name = "rb", descriptor = "Lsg;")
    public static class169 field274 = field268;

    @OriginalMember(owner = "client!b", name = "bb", descriptor = "I")
    public static int field258;

    @OriginalMember(owner = "client!b", name = "db", descriptor = "I")
    public static int field260;

    @OriginalMember(owner = "client!b", name = "fb", descriptor = "I")
    public static int field262;

    @OriginalMember(owner = "client!b", name = "gb", descriptor = "I")
    public static int field263;

    @OriginalMember(owner = "client!b", name = "hb", descriptor = "I")
    public static int field264;

    @OriginalMember(owner = "client!b", name = "ib", descriptor = "I")
    public static int field265;

    @OriginalMember(owner = "client!b", name = "jb", descriptor = "I")
    public static int field266;

    @OriginalMember(owner = "client!b", name = "kb", descriptor = "I")
    public static int field267;

    @OriginalMember(owner = "client!b", name = "mb", descriptor = "I")
    public static int field269;

    @OriginalMember(owner = "client!b", name = "ob", descriptor = "I")
    public static int field271;

    @OriginalMember(owner = "client!b", name = "pb", descriptor = "I")
    public static int field272;

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(IB)[I")
    public final int[] method16(int arg0, byte arg1) {
        if (arg1 != 19) {
            return null;
        } else {
            ++field258;
            int[] var3 = super.field1192.method19((byte) 122, arg0);
            if (super.field1192.field75) {
                int[] var4 = this.method394(20331, 0, arg0);
                int[] var5 = this.method394(20331, 1, arg0);
                int[] var6 = this.method394(20331, 2, arg0);
                for (int var7 = 0; ~var7 > ~class147.field2715; ++var7) {
                    int var8 = var6[var7];
                    if (~var8 != -4097) {
                        if (var8 != 0) {
                            var3[var7] = (-var8 + 4096) * var5[var7] + var4[var7] * var8 >> 12;
                        } else {
                            var3[var7] = var5[var7];
                        }
                    } else {
                        var3[var7] = var4[var7];
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(BLoa;I)V")
    public final void method14(byte arg0, class127 arg1, int arg2) {
        int var4 = 10 % ((-60 - arg0) / 36);
        if (~arg2 == -1) {
            super.field1183 = arg1.method819((byte) 22) == 1;
        }
        ++field266;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(II)I")
    public static final int method58(int arg0, int arg1) {
        ++field272;
        if (arg1 != 23068) {
            method64(-51, (byte[]) null);
        }
        int var7 = arg0 - 1;
        int var2 = var7 | var7 >>> 1;
        int var3 = var2 | var2 >>> 2;
        int var4 = var3 | var3 >>> 4;
        int var5 = var4 | var4 >>> 8;
        int var6 = var5 | var5 >>> 16;
        return var6 - -1;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(BI)[[I")
    public final int[][] method59(byte arg0, int arg1) {
        ++field265;
        if (arg0 != -40) {
            this.method59((byte) -52, 51);
        }
        int[][] var3 = super.field1195.method177(arg0 + 1233, arg1);
        if (super.field1195.field532) {
            int[] var4 = this.method394(20331, 2, arg1);
            int[][] var5 = this.method402(false, arg1, 0);
            int[][] var6 = this.method402(false, arg1, 1);
            int[] var7 = var3[0];
            int[] var8 = var5[0];
            int[] var9 = var3[1];
            int[] var10 = var6[0];
            int[] var11 = var5[2];
            int[] var12 = var3[2];
            int[] var13 = var6[1];
            int[] var14 = var6[2];
            int[] var15 = var5[1];
            for (int var16 = 0; ~class147.field2715 < ~var16; ++var16) {
                int var17 = var4[var16];
                if (var17 == 4096) {
                    var7[var16] = var8[var16];
                    var9[var16] = var15[var16];
                    var12[var16] = var11[var16];
                } else if (~var17 == -1) {
                    var7[var16] = var10[var16];
                    var9[var16] = var13[var16];
                    var12[var16] = var14[var16];
                } else {
                    int var18 = 4096 - var17;
                    var7[var16] = var8[var16] * var17 + var10[var16] * var18 >> 12;
                    var9[var16] = var13[var16] * var18 + var15[var16] * var17 >> 12;
                    var12[var16] = var11[var16] * var17 + var14[var16] * var18 >> 12;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!b", name = "h", descriptor = "(I)V")
    public static void method60(int arg0) {
        field274 = null;
        field273 = null;
        field268 = null;
        field259 = null;
        if (arg0 != 0) {
            field274 = null;
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(Lke;I)V")
    public static final void method61(class95 arg0, int arg1) {
        class90.field1641 = arg0;
        ++field260;
        if (arg1 != -30994) {
            field273 = null;
        }
    }

    @OriginalMember(owner = "client!b", name = "<init>", descriptor = "()V")
    public class11() {
        super(3, false);
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(B)V")
    public static final void method62(byte arg0) {
        ++field264;
        try {
            if (class25.field524 != null) {
                byte[] var1 = class25.field524.method830(-30012);
                if (var1 != null) {
                    class127 var2 = new class127(var1);
                    class65.field1219 = var2.method785(true);
                    class159.field3038 = new class187[class65.field1219];
                    for (int var3 = 0; class65.field1219 > var3; ++var3) {
                        class187 var4 = class159.field3038[var3] = new class187();
                        int var5 = var2.method785(true);
                        var4.field3637 = 32767 & var5;
                        var4.field3638 = ~(var5 & 32768) != -1;
                        var4.field3641 = var2.method793((byte) -117);
                        var4.field3631 = var2.method818(1629612104);
                        var4.field3635 = var3;
                        var4.field3633 = class185.method1226(-20152, var4.field3641);
                    }
                    class154.method1004(class159.field3038, 0, class115.field2090, class159.field3038.length - 1, true, class122.field2250);
                    class25.field524 = null;
                    class54.field996 = true;
                }
            } else {
                class25.field524 = new class128(class163.field3134, class165.method1058(0, new class169[] { class56.field1038, class45.field844, class1.field23 }).method1115(109));
            }
        } catch (Exception var7) {
            var7.printStackTrace();
            class25.field524 = null;
        }
        if (arg0 >= -4) {
            field269 = -49;
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(Lsg;B)V")
    public static final void method63(class169 arg0, byte arg1) {
        ++field267;
        if (class51.field900 >= 2) {
            if (arg0.method1110(class118.field2204, arg1 ^ -104)) {
                System.gc();
            }
            if (arg0.method1110(class188.field3661, 70)) {
                class132.method863((byte) -128);
            }
            if (arg0.method1110(class199.field3897, 70)) {
                class8.field225 = true;
            }
            if (arg0.method1110(class32.field682, 70)) {
                class8.field225 = false;
            }
            if (arg0.method1110(class158.field3020, 70)) {
                for (int var2 = 0; ~var2 > -5; ++var2) {
                    for (int var3 = 1; ~var3 > -104; ++var3) {
                        for (int var4 = 1; ~var4 > -104; ++var4) {
                            client.field575[var2].field3776[var3][var4] = 0;
                        }
                    }
                }
            }
            if (arg0.method1110(class122.field2254, 70) && ~class20.field439 == -3) {
                throw new RuntimeException();
            }
            if (arg0.method1124(class188.field3651, arg1 + 88)) {
                class65.field1209 = arg0.method1106(false, 12).method1107(-1).method1123(false);
                class199.method1307((byte) 119, (class169) null, class165.method1058(0, new class169[] { class19.field415, class2.method18((byte) -62, class65.field1209) }), 0);
            }
            if (arg0.method1110(class98.field1843, arg1 + 104)) {
                class172.field3335 = true;
            }
        }
        ++class89.field1625;
        class141.field2621.method1024(43, (byte) -94);
        class141.field2621.method821(-1 + arg0.method1134(0), 64);
        if (arg1 != -34) {
            method62((byte) 90);
        }
        class141.field2621.method799(arg0.method1106(false, 2), (byte) 0);
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(I[B)Lhg;")
    public static final class71 method64(int arg0, byte[] arg1) {
        ++field263;
        if (arg1 == null) {
            return null;
        } else {
            if (arg0 != 2) {
                field269 = -66;
            }
            class71 var2 = new class71(arg1, class182.field3544, class41.field770, class203.field3976, class2.field43, class197.field3873, class193.field3814);
            class66.method424((byte) -65);
            return var2;
        }
    }
}
