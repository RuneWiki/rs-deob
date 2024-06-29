import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gm")
public class class79 extends class354 {

    @OriginalMember(owner = "client!gm", name = "M", descriptor = "I")
    private int field1313 = -1;

    @OriginalMember(owner = "client!gm", name = "O", descriptor = "I")
    public static int field1315 = 0;

    @OriginalMember(owner = "client!gm", name = "K", descriptor = "[I")
    public static int[] field1311 = new int[1];

    @OriginalMember(owner = "client!gm", name = "H", descriptor = "I")
    private int field1309;

    @OriginalMember(owner = "client!gm", name = "J", descriptor = "I")
    public static int field1310;

    @OriginalMember(owner = "client!gm", name = "L", descriptor = "I")
    public static int field1312;

    @OriginalMember(owner = "client!gm", name = "N", descriptor = "I")
    public static int field1314;

    @OriginalMember(owner = "client!gm", name = "P", descriptor = "I")
    private int field1316;

    @OriginalMember(owner = "client!gm", name = "Q", descriptor = "I")
    public static int field1317;

    @OriginalMember(owner = "client!gm", name = "R", descriptor = "I")
    public static int field1318;

    @OriginalMember(owner = "client!gm", name = "S", descriptor = "I")
    public static int field1319;

    @OriginalMember(owner = "client!gm", name = "U", descriptor = "I")
    public static int field1321;

    @OriginalMember(owner = "client!gm", name = "T", descriptor = "[I")
    private int[] field1320;

    @OriginalMember(owner = "client!gm", name = "<init>", descriptor = "()V", line = 4)
    public class79() {
        super(0, false);
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(ILti;I)V", line = 7)
    public final void method206(int arg0, class303 arg1, int arg2) {
        ++field1310;
        if (~arg2 == -1) {
            this.field1313 = arg1.method1868(arg0 + -15180);
        }
        if (arg0 != 15180) {
            this.method643(-73);
        }
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(BI)[[I", line = 23)
    public final int[][] method207(byte arg0, int arg1) {
        ++field1312;
        if (arg0 > -40) {
            this.method206(-95, (class303) null, -122);
        }
        int[][] var3 = super.field5351.method2819((byte) -57, arg1);
        if (super.field5351.field6959) {
            int var4 = (~class337.field5146 != ~this.field1309 ? this.field1309 * arg1 / class337.field5146 : arg1) * this.field1316;
            int[] var5 = var3[0];
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            if (~class404.field5952 == ~this.field1316) {
                for (int var8 = 0; ~class404.field5952 < ~var8; ++var8) {
                    int var9 = this.field1320[var4++];
                    var7[var8] = class388.method2441(255, var9) << 4;
                    var6[var8] = class388.method2441(4080, var9 >> 4);
                    var5[var8] = class388.method2441(var9 >> 12, 4080);
                }
            } else {
                for (int var10 = 0; ~var10 > ~class404.field5952; ++var10) {
                    int var11 = this.field1316 * var10 / class404.field5952;
                    int var12 = this.field1320[var4 - -var11];
                    var7[var10] = class388.method2441(var12, 255) << 4;
                    var6[var10] = class388.method2441(4080, var12 >> 4);
                    var5[var10] = class388.method2441(16711680, var12) >> 12;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "([[[Lkf;I)V", line = 89)
    public static final void method640(class165[][][] arg0, int arg1) {
        int var2 = -18 / ((arg1 - 52) / 48);
        for (int var3 = 0; ~var3 > ~arg0.length; ++var3) {
            class165[][] var4 = arg0[var3];
            for (int var5 = 0; var4.length > var5; ++var5) {
                for (int var6 = 0; ~var6 > ~var4[var5].length; ++var6) {
                    class165 var7 = var4[var5][var6];
                    if (var7 != null) {
                        if (var7.field2487 instanceof class232) {
                            ((class232) var7.field2487).method376(16931);
                        }
                        if (var7.field2482 instanceof class232) {
                            ((class232) var7.field2482).method376(16931);
                        }
                        if (var7.field2493 instanceof class232) {
                            ((class232) var7.field2493).method376(16931);
                        }
                        if (var7.field2480 instanceof class232) {
                            ((class232) var7.field2480).method376(16931);
                        }
                        if (var7.field2484 instanceof class232) {
                            ((class232) var7.field2484).method376(16931);
                        }
                        for (class525 var8 = var7.field2490; var8 != null; var8 = var8.field7716) {
                            class370 var9 = var8.field7711;
                            if (var9 instanceof class232) {
                                ((class232) var9).method376(16931);
                            }
                        }
                    }
                }
            }
        }
        ++field1319;
    }

    @OriginalMember(owner = "client!gm", name = "e", descriptor = "(I)V", line = 160)
    public static void method641(int arg0) {
        if (arg0 == -22503) {
            field1311 = null;
        }
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(III)V", line = 174)
    public final void method642(int arg0, int arg1, int arg2) {
        super.method642(arg0, -77, arg2);
        ++field1318;
        int var4 = -67 / ((arg1 - 62) / 58);
        if (~this.field1313 <= -1 && client.field2884 != null) {
            int var5 = !client.field2884.method935(this.field1313, -8037).field3112 ? 128 : 64;
            this.field1320 = client.field2884.method938(this.field1313, false, 1.0F, (byte) -85, var5, var5);
            this.field1316 = var5;
            this.field1309 = var5;
        }
    }

    @OriginalMember(owner = "client!gm", name = "b", descriptor = "(B)V", line = 198)
    public final void method203(byte arg0) {
        ++field1321;
        super.method203(arg0);
        this.field1320 = null;
    }

    @OriginalMember(owner = "client!gm", name = "c", descriptor = "(I)I", line = 218)
    public final int method643(int arg0) {
        ++field1317;
        return arg0 != -1529307414 ? -96 : this.field1313;
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(ILqa;IIII)V", line = 230)
    public static final void method644(int arg0, class162 arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field1314;
        arg1.method509(arg4, arg3, arg4 - -arg0, arg3 - -arg2);
        arg1.method1175(arg0, 8, arg4, -16777216, arg2, arg3);
        if (~class73.field1229 <= -101) {
            float var6 = (float) class2.field36 / (float) class2.field39;
            int var7 = arg0;
            int var8 = arg2;
            if (!(var6 < 1.0F)) {
                var7 = (int) ((float) arg2 / var6);
            } else {
                var8 = (int) ((float) arg0 * var6);
            }
            int var9 = (arg2 - var8) / 2 + arg3;
            int var10 = (-var7 + arg0) / 2 + arg4;
            if (class226.field3304 == null || ~class226.field3304.method137() != ~arg0 || arg2 != class226.field3304.method139()) {
                class2.method11(class2.field44, class2.field40 + class2.field36, class2.field44 + class2.field39, class2.field40, var10, var9, var7 + var10, var8 + var9);
                class2.method29(arg1);
                class226.field3304 = arg1.method532(var10, var9, var7, var8, false);
            }
            class226.field3304.method3129(var10, var9);
            int var11 = class177.field2681 * var7 / class2.field39;
            if (arg5 >= -60) {
                method644(108, (class162) null, -56, 104, -10, 92);
            }
            int var12 = class165.field2479 * var8 / class2.field36;
            int var13 = var10 - -(class474.field6981 * var7 / class2.field39);
            int var14 = var9 - -var8 + -(class207.field2971 * var8 / class2.field36) + -var12;
            int var15 = -1996554240;
            if (class321.field4649 == class193.field2824) {
                var15 = -1996488705;
            }
            arg1.method471(var13, var14, var11, var12, var15, 1);
            arg1.method516(var13, var14, var11, var12, var15, 0);
            if (~class410.field6034 < -1) {
                int var16;
                if (class421.field6199 <= 50) {
                    var16 = class421.field6199 * 5;
                } else {
                    var16 = -(class421.field6199 * 5) + 500;
                }
                for (class42 var17 = (class42) class2.field23.method2257((byte) 100); var17 != null; var17 = (class42) class2.field23.method2256(-120)) {
                    class210 var18 = class2.field15.method1835(36, var17.field649);
                    if (class88.method724(var18, 28)) {
                        if (class36.field540 == var17.field649) {
                            int var19 = var17.field644 * var7 / class2.field39 + var10;
                            int var20 = (-var17.field641 + class2.field36) * var8 / class2.field36 + var9;
                            arg1.method1175(4, 8, var19 + -2, 16776960 | var16 << 24, 4, var20 + -2);
                        } else if (class25.field441 != -1 && ~class25.field441 == ~var18.field3016) {
                            int var21 = var17.field644 * var7 / class2.field39 + var10;
                            int var22 = (-var17.field641 + class2.field36) * var8 / class2.field36 + var9;
                            arg1.method1175(4, 8, var21 + -2, 16776960 | var16 << 24, 4, var22 + -2);
                        }
                    }
                }
            }
        }
    }
}
