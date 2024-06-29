import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tb")
public class class156 extends class264 {

    @OriginalMember(owner = "client!tb", name = "nb", descriptor = "[B")
    private byte[] field2316 = new byte[512];

    @OriginalMember(owner = "client!tb", name = "mb", descriptor = "I")
    public int field2315 = 0;

    @OriginalMember(owner = "client!tb", name = "jb", descriptor = "Z")
    public boolean field2312 = true;

    @OriginalMember(owner = "client!tb", name = "sb", descriptor = "I")
    public int field2321 = 4;

    @OriginalMember(owner = "client!tb", name = "xb", descriptor = "I")
    public int field2326 = 1638;

    @OriginalMember(owner = "client!tb", name = "Bb", descriptor = "I")
    public int field2330 = 4;

    @OriginalMember(owner = "client!tb", name = "qb", descriptor = "I")
    public int field2319 = 4;

    @OriginalMember(owner = "client!tb", name = "fb", descriptor = "Lma;")
    public static class5 field2308 = class12.method119("<br>(X", (byte) 64);

    @OriginalMember(owner = "client!tb", name = "ob", descriptor = "I")
    public static int field2317 = 0;

    @OriginalMember(owner = "client!tb", name = "rb", descriptor = "[I")
    public static int[] field2320 = new int[2048];

    @OriginalMember(owner = "client!tb", name = "kb", descriptor = "Lla;")
    public static class178 field2313 = null;

    @OriginalMember(owner = "client!tb", name = "Fb", descriptor = "Lma;")
    public static class5 field2334 = class12.method119("Mem:", (byte) 79);

    @OriginalMember(owner = "client!tb", name = "Eb", descriptor = "I")
    public static int field2333 = 0;

    @OriginalMember(owner = "client!tb", name = "gb", descriptor = "I")
    public static int field2309;

    @OriginalMember(owner = "client!tb", name = "hb", descriptor = "I")
    public static int field2310;

    @OriginalMember(owner = "client!tb", name = "ib", descriptor = "I")
    public static int field2311;

    @OriginalMember(owner = "client!tb", name = "lb", descriptor = "I")
    public static int field2314;

    @OriginalMember(owner = "client!tb", name = "pb", descriptor = "I")
    public static int field2318;

    @OriginalMember(owner = "client!tb", name = "ub", descriptor = "I")
    public static int field2323;

    @OriginalMember(owner = "client!tb", name = "yb", descriptor = "I")
    public static int field2327;

    @OriginalMember(owner = "client!tb", name = "zb", descriptor = "I")
    public static int field2328;

    @OriginalMember(owner = "client!tb", name = "Ab", descriptor = "I")
    public static int field2329;

    @OriginalMember(owner = "client!tb", name = "Cb", descriptor = "I")
    public static int field2331;

    @OriginalMember(owner = "client!tb", name = "Db", descriptor = "I")
    public static int field2332;

    @OriginalMember(owner = "client!tb", name = "wb", descriptor = "Lbf;")
    public static class209 field2325;

    @OriginalMember(owner = "client!tb", name = "tb", descriptor = "[S")
    private short[] field2322;

    @OriginalMember(owner = "client!tb", name = "vb", descriptor = "[S")
    private short[] field2324;

    @OriginalMember(owner = "client!tb", name = "h", descriptor = "(I)V", line = 7)
    public static void method998(int arg0) {
        field2320 = null;
        field2325 = null;
        if (arg0 != 1) {
            method999(73, 83, 12);
        }
        field2308 = null;
        field2313 = null;
        field2334 = null;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IILii;)V", line = 21)
    public final void method4(int arg0, int arg1, class221 arg2) {
        field2327++;
        if (arg0 == 0) {
            this.field2312 = arg2.method1509(true) == 1;
        } else if (arg0 == 1) {
            this.field2319 = arg2.method1509(true);
        } else if (arg0 == 2) {
            this.field2326 = arg2.method1505(3);
            if (this.field2326 < 0) {
                this.field2322 = new short[this.field2319];
                for (int var5 = 0; var5 < this.field2319; var5++) {
                    this.field2322[var5] = (short) arg2.method1505(111);
                }
            }
        } else if (arg0 == 3) {
            this.field2330 = this.field2321 = arg2.method1509(true);
        } else if (arg0 == 4) {
            this.field2315 = arg2.method1509(true);
        } else if (arg0 == 5) {
            this.field2330 = arg2.method1509(true);
        } else if (arg0 == 6) {
            this.field2321 = arg2.method1509(true);
        }
        if (arg1 > -27) {
            this.field2326 = -58;
        }
    }

    @OriginalMember(owner = "client!tb", name = "e", descriptor = "(III)V", line = 131)
    public static final void method999(int arg0, int arg1, int arg2) {
        field2318++;
        if (class282.field4794 < 2 && class96.field1431 == 0 && !class265.field4539) {
            return;
        }
        class5 var3;
        if (class96.field1431 == 1 && class282.field4794 < 2) {
            var3 = class288.method1940((byte) 60, new class5[] { class274.field4669, class241.field4022, class59.field922, class221.field3628 });
        } else if (class265.field4539 && class282.field4794 < 2) {
            var3 = class288.method1940((byte) 71, new class5[] { class23.field405, class241.field4022, class110.field1634, class221.field3628 });
        } else {
            var3 = class104.method663(0, class282.field4794 - 1);
        }
        if (class282.field4794 > 2) {
            var3 = class288.method1940((byte) 127, new class5[] { var3, class251.field4167, class175.method1148(class282.field4794 - 2, false), class278.field4728 });
        }
        if (arg1 == 1372) {
            int var4 = class201.field3197.method2021(var3, arg0 + 4, arg2 + 15, 16777215, 0, class250.field4146, class256.field4369);
            class84.method566(64, 15, arg2, arg0 + 4, var4 + class201.field3197.method2013(var3));
        }
    }

    @OriginalMember(owner = "client!tb", name = "f", descriptor = "(I)V", line = 162)
    public final void method111(int arg0) {
        field2328++;
        this.field2316 = class196.method1290(117, this.field2315);
        this.method1001(-715203135);
        int var2 = -72 % ((arg0 - 66) / 44);
        for (int var3 = this.field2319 - 1; var3 >= 1; var3--) {
            short var4 = this.field2322[var3];
            if (var4 > 8 || var4 < -8) {
                break;
            }
            this.field2319--;
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IIIIIII)I", line = 195)
    private final int method1000(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field2331++;
        int var8 = arg6 - 4096;
        int var9 = arg2 >> 12;
        int var10 = arg2 & 0xFFF;
        int var11 = class10.field148[var10];
        int var12 = var9 + 1;
        int var13 = var9 & 0xFF;
        int var14 = var10 - 4096;
        if (arg4 != 804568012) {
            return 18;
        }
        int var15 = this.field2316[var13 + arg1] & 0x3;
        int var16;
        if (var15 > 1) {
            var16 = var15 == 2 ? var10 - arg6 : -arg6 + -var10;
        } else {
            var16 = var15 == 0 ? var10 + arg6 : arg6 - var10;
        }
        if (arg3 <= var12) {
            var12 = 0;
        }
        int var17 = var12 & 0xFF;
        int var18 = this.field2316[arg1 + var17] & 0x3;
        int var19;
        if (var18 <= 1) {
            var19 = var18 == 0 ? var14 + arg6 : -var14 + arg6;
        } else {
            var19 = var18 == 2 ? var14 - arg6 : -arg6 + -var14;
        }
        int var20 = this.field2316[arg5 + var13] & 0x3;
        int var21 = ((var19 - var16) * var11 >> 12) + var16;
        int var22;
        if (var20 <= 1) {
            var22 = var20 == 0 ? var8 + var10 : -var10 + var8;
        } else {
            var22 = var20 == 2 ? var10 - var8 : -var8 + -var10;
        }
        int var23 = this.field2316[var17 + arg5] & 0x3;
        int var24;
        if (var23 <= 1) {
            var24 = var23 == 0 ? var8 + var14 : -var14 + var8;
        } else {
            var24 = var23 == 2 ? var14 - var8 : -var8 + -var14;
        }
        int var25 = ((var24 - var22) * var11 >> 12) + var22;
        return var21 + ((var25 - var21) * arg0 >> 12);
    }

    @OriginalMember(owner = "client!tb", name = "i", descriptor = "(I)V", line = 267)
    private final void method1001(int arg0) {
        if (this.field2326 > 0) {
            this.field2322 = new short[this.field2319];
            this.field2324 = new short[this.field2319];
            for (int var3 = 0; var3 < this.field2319; var3++) {
                this.field2322[var3] = (short) ((int) (Math.pow((double) ((float) this.field2326 / 4096.0F), (double) var3) * 4096.0D));
                this.field2324[var3] = (short) ((int) Math.pow(2.0D, (double) var3));
            }
        } else if (this.field2322 != null && this.field2322.length == this.field2319) {
            this.field2324 = new short[this.field2319];
            for (int var2 = 0; var2 < this.field2319; var2++) {
                this.field2324[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
            }
        }
        if (arg0 != -715203135) {
            this.field2326 = 68;
        }
        field2332++;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IZILni;Lni;)Lcj;", line = 311)
    public static final class282 method1002(int arg0, boolean arg1, int arg2, class202 arg3, class202 arg4) {
        boolean var5 = true;
        field2310++;
        int[] var6 = arg3.method1325((byte) -73, arg0);
        for (int var7 = 0; var7 < var6.length; var7++) {
            byte[] var8 = arg3.method1328((byte) -47, var6[var7], arg0);
            if (var8 == null) {
                var5 = false;
            } else {
                int var9 = var8[1] & 0xFF | var8[0] & 0xFF << 8;
                byte[] var10;
                if (arg1) {
                    var10 = arg4.method1328((byte) -47, var9, 0);
                } else {
                    var10 = arg4.method1328((byte) -47, 0, var9);
                }
                if (var10 == null) {
                    var5 = false;
                }
            }
        }
        if (arg2 != 18495) {
            return (class282) null;
        } else if (var5) {
            try {
                return new class282(arg3, arg4, arg0, arg1);
            } catch (Exception var12) {
                return null;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!tb", name = "<init>", descriptor = "()V", line = 363)
    public class156() {
        super(0, true);
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "([IBI)V", line = 374)
    public final void method1003(int[] arg0, byte arg1, int arg2) {
        field2309++;
        int var4 = -84 / ((arg1 - 64) / 51);
        int var5 = class116.field1726[arg2] * this.field2321;
        if (this.field2319 == 1) {
            short var39 = this.field2322[0];
            int var40 = this.field2324[0] << 12;
            int var41 = this.field2330 * var40 >> 12;
            int var42 = var5 * var40 >> 12;
            int var43 = this.field2321 * var40 >> 12;
            int var44 = var42 >> 12;
            int var45 = this.field2316[var44 & 0xFF] & 0xFF;
            int var46 = var42 & 0xFFF;
            int var47 = class10.field148[var46];
            int var48 = var44 + 1;
            if (var43 <= var48) {
                var48 = 0;
            }
            int var49 = this.field2316[var48 & 0xFF] & 0xFF;
            if (this.field2312) {
                for (int var50 = 0; var50 < class226.field3716; var50++) {
                    int var51 = class251.field4159[var50] * this.field2330;
                    int var52 = this.method1000(var47, var45, var40 * var51 >> 12, var41, 804568012, var49, var46);
                    int var53 = var39 * var52 >> 12;
                    arg0[var50] = (var53 >> 1) + 2048;
                }
            } else {
                for (int var54 = 0; var54 < class226.field3716; var54++) {
                    int var55 = class251.field4159[var54] * this.field2330;
                    int var56 = this.method1000(var47, var45, var40 * var55 >> 12, var41, 804568012, var49, var46);
                    arg0[var54] = var39 * var56 >> 12;
                }
            }
            return;
        }
        short var6 = this.field2322[0];
        if (var6 > 8 || var6 < -8) {
            int var7 = this.field2324[0] << 12;
            int var8 = this.field2330 * var7 >> 12;
            int var9 = var5 * var7 >> 12;
            int var10 = var9 >> 12;
            int var11 = var10 + 1;
            int var12 = var9 & 0xFFF;
            int var13 = this.field2321 * var7 >> 12;
            if (var13 <= var11) {
                var11 = 0;
            }
            int var14 = this.field2316[var11 & 0xFF] & 0xFF;
            int var15 = class10.field148[var12];
            int var16 = this.field2316[var10 & 0xFF] & 0xFF;
            for (int var17 = 0; var17 < class226.field3716; var17++) {
                int var18 = class251.field4159[var17] * this.field2330;
                int var19 = this.method1000(var15, var16, var7 * var18 >> 12, var8, 804568012, var14, var12);
                arg0[var17] = var6 * var19 >> 12;
            }
        }
        for (int var20 = 1; var20 < this.field2319; var20++) {
            short var21 = this.field2322[var20];
            if (var21 > 8 || var21 < -8) {
                int var22 = this.field2324[var20] << 12;
                int var23 = this.field2321 * var22 >> 12;
                int var24 = var5 * var22 >> 12;
                int var25 = this.field2330 * var22 >> 12;
                int var26 = var24 >> 12;
                int var27 = var26 + 1;
                if (var27 >= var23) {
                    var27 = 0;
                }
                int var28 = this.field2316[var26 & 0xFF] & 0xFF;
                int var29 = this.field2316[var27 & 0xFF] & 0xFF;
                int var30 = var24 & 0xFFF;
                int var31 = class10.field148[var30];
                if (this.field2312 && this.field2319 - 1 == var20) {
                    for (int var32 = 0; var32 < class226.field3716; var32++) {
                        int var33 = class251.field4159[var32] * this.field2330;
                        int var34 = this.method1000(var31, var28, var22 * var33 >> 12, var25, 804568012, var29, var30);
                        int var35 = (var21 * var34 >> 12) + arg0[var32];
                        arg0[var32] = (var35 >> 1) + 2048;
                    }
                } else {
                    for (int var36 = 0; var36 < class226.field3716; var36++) {
                        int var37 = class251.field4159[var36] * this.field2330;
                        int var38 = this.method1000(var31, var28, var22 * var37 >> 12, var25, 804568012, var29, var30);
                        arg0[var36] += var21 * var38 >> 12;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "(II)[I", line = 558)
    public final int[] method5(int arg0, int arg1) {
        field2323++;
        if (arg0 >= -58) {
            field2317 = 86;
        }
        int[] var3 = this.field4501.method1176(arg1, 127);
        if (this.field4501.field2741) {
            this.method1003(var3, (byte) -50, arg1);
        }
        return var3;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IIIIII)V", line = 599)
    public static final void method1004(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field2311++;
        int var6 = 0;
        int var7 = arg3;
        if (arg0 != -928251167) {
            method999(-18, 55, 97);
        }
        int var8 = arg3 * arg3;
        int var9 = var8 << 1;
        int var10 = arg2 * arg2;
        int var11 = var10 << 1;
        int var12 = arg3 << 1;
        int var13 = (1 - var12) * var10 + var9;
        int var14 = var10 << 2;
        int var15 = var8 << 2;
        int var16 = var8 - ((var12 - 1) * var11);
        int var17 = ((var6 << 1) + 3) * var9;
        int var18 = ((arg3 << 1) - 3) * var11;
        int var19 = (var6 + 1) * var15;
        int var20 = (arg3 - 1) * var14;
        if (class294.field4956 <= arg1 && class101.field1505 >= arg1) {
            int var21 = class76.method533(class57.field899, arg4 + arg2, true, class301.field5073);
            int var22 = class76.method533(class57.field899, arg4 - arg2, true, class301.field5073);
            class239.method1690(var22, 23267, var21, class137.field2032[arg1], arg5);
        }
        while (var7 > 0) {
            var7--;
            int var23 = arg1 - var7;
            if (var13 < 0) {
                while (var13 < 0) {
                    var13 += var17;
                    var6++;
                    var16 += var19;
                    var17 += var15;
                    var19 += var15;
                }
            }
            if (var16 < 0) {
                var6++;
                var13 += var17;
                var17 += var15;
                var16 += var19;
                var19 += var15;
            }
            var13 += -var20;
            var16 += -var18;
            var18 -= var14;
            var20 -= var14;
            int var24 = arg1 + var7;
            if (class294.field4956 <= var24 && var23 <= class101.field1505) {
                int var25 = class76.method533(class57.field899, arg4 + var6, true, class301.field5073);
                int var26 = class76.method533(class57.field899, arg4 - var6, true, class301.field5073);
                if (var23 >= class294.field4956) {
                    class239.method1690(var26, 23267, var25, class137.field2032[var23], arg5);
                }
                if (var24 <= class101.field1505) {
                    class239.method1690(var26, 23267, var25, class137.field2032[var24], arg5);
                }
            }
        }
    }
}
