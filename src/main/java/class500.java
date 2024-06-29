import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hm")
public class class500 {

    @OriginalMember(owner = "client!hm", name = "c", descriptor = "[I")
    private int[] field6863 = new int[8191];

    @OriginalMember(owner = "client!hm", name = "h", descriptor = "[I")
    private int[] field6868 = new int[1600];

    @OriginalMember(owner = "client!hm", name = "l", descriptor = "I")
    private int field6872 = 0;

    @OriginalMember(owner = "client!hm", name = "t", descriptor = "[[Lbh;")
    private class545[][] field6880 = new class545[64][768];

    @OriginalMember(owner = "client!hm", name = "p", descriptor = "[[Lbh;")
    private class545[][] field6876 = new class545[1600][64];

    @OriginalMember(owner = "client!hm", name = "s", descriptor = "[I")
    private int[] field6879 = new int[64];

    @OriginalMember(owner = "client!hm", name = "o", descriptor = "Lum;")
    private class109 field6875;

    @OriginalMember(owner = "client!hm", name = "u", descriptor = "Lwr;")
    private class697 field6881;

    @OriginalMember(owner = "client!hm", name = "j", descriptor = "Lwr;")
    private class697 field6870;

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "Lkga;")
    private class556 field6861;

    @OriginalMember(owner = "client!hm", name = "b", descriptor = "I")
    public static int field6862;

    @OriginalMember(owner = "client!hm", name = "d", descriptor = "I")
    public static int field6864;

    @OriginalMember(owner = "client!hm", name = "e", descriptor = "I")
    public static int field6865;

    @OriginalMember(owner = "client!hm", name = "f", descriptor = "I")
    public static int field6866;

    @OriginalMember(owner = "client!hm", name = "g", descriptor = "I")
    public static int field6867;

    @OriginalMember(owner = "client!hm", name = "i", descriptor = "I")
    public static int field6869;

    @OriginalMember(owner = "client!hm", name = "k", descriptor = "I")
    public static int field6871;

    @OriginalMember(owner = "client!hm", name = "m", descriptor = "I")
    public static int field6873;

    @OriginalMember(owner = "client!hm", name = "n", descriptor = "I")
    public static int field6874;

    @OriginalMember(owner = "client!hm", name = "q", descriptor = "I")
    public static int field6877;

    @OriginalMember(owner = "client!hm", name = "r", descriptor = "I")
    public static int field6878;

    @OriginalMember(owner = "client!hm", name = "v", descriptor = "I")
    public static int field6882;

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(Lqq;B)V", line = 5)
    private final void method2837(class651 arg0, byte arg1) {
        class609.field8462 = arg0.field9223;
        field6878++;
        arg0.method3686(false);
        arg0.method3619(29370, false);
        if (arg1 != -127) {
            this.field6863 = null;
        }
        arg0.method3628(false, (byte) -50);
        arg0.method3622(-22561);
    }

    @OriginalMember(owner = "client!hm", name = "<init>", descriptor = "(Lqq;)V", line = 808)
    public class500(class651 arg0) {
        this.field6875 = arg0.method2015((byte) -85, new class636[] { new class636(new class255[] { class255.field3339, class255.field3344, class255.field3346 }), new class636(class255.field3343) });
        this.field6881 = arg0.method1996(true, (byte) 111);
        this.field6870 = arg0.method1996(false, (byte) 111);
        this.field6870.method2567(12, (byte) -117, 393168);
        this.field6861 = arg0.method2046(1, false);
        this.field6861.method1765(49146, 30907);
        Buffer var2 = this.field6861.method2143(true, (byte) 77);
        if (var2 != null) {
            Stream var3 = arg0.method3614(var2, 0);
            if (Stream.method3445()) {
                for (int var6 = 0; var6 < 8191; var6++) {
                    int var7 = var6 * 4;
                    var3.method3433(var7);
                    var3.method3433(var7 + 1);
                    var3.method3433(var7 + 2);
                    var3.method3433(var7 + 2);
                    var3.method3433(var7 + 3);
                    var3.method3433(var7);
                }
            } else {
                for (int var4 = 0; var4 < 8191; var4++) {
                    int var5 = var4 * 4;
                    var3.method3443(var5);
                    var3.method3443(var5 + 1);
                    var3.method3443(var5 + 2);
                    var3.method3443(var5 + 2);
                    var3.method3443(var5 + 3);
                    var3.method3443(var5);
                }
            }
            var3.method3440();
            this.field6861.method2145(false);
        }
        Buffer var8 = this.field6870.method2566(true, (byte) 6);
        if (var8 != null) {
            Stream var9 = arg0.method3614(var8, 0);
            if (Stream.method3445()) {
                for (int var10 = 0; var10 < 8191; var10++) {
                    var9.method3439(0.0F);
                    var9.method3439(-1.0F);
                    var9.method3439(0.0F);
                    var9.method3439(0.0F);
                    var9.method3439(-1.0F);
                    var9.method3439(0.0F);
                    var9.method3439(0.0F);
                    var9.method3439(-1.0F);
                    var9.method3439(0.0F);
                    var9.method3439(0.0F);
                    var9.method3439(-1.0F);
                    var9.method3439(0.0F);
                }
            } else {
                for (int var11 = 0; var11 < 8191; var11++) {
                    var9.method3438(0.0F);
                    var9.method3438(-1.0F);
                    var9.method3438(0.0F);
                    var9.method3438(0.0F);
                    var9.method3438(-1.0F);
                    var9.method3438(0.0F);
                    var9.method3438(0.0F);
                    var9.method3438(-1.0F);
                    var9.method3438(0.0F);
                    var9.method3438(0.0F);
                    var9.method3438(-1.0F);
                    var9.method3438(0.0F);
                }
            }
            var9.method3440();
            this.field6870.method2564(118);
        }
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(ILwv;I)I", line = 32)
    public static final int method2838(int arg0, class423 arg1, int arg2) {
        field6866++;
        if (!client.method3858(arg1).method29(arg0, -123) && arg1.field5613 == null) {
            return -1;
        } else {
            if (arg2 < 111) {
                method2847((byte) 112, -21, 112, 90);
            }
            return arg1.field5597 == null || arg0 >= arg1.field5597.length ? -1 : arg1.field5597[arg0];
        }
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(ILqq;)V", line = 49)
    private final void method2839(int arg0, class651 arg1) {
        int var3 = 108 / ((-arg0 - 56) / 61);
        arg1.method3628(true, (byte) 127);
        field6882++;
        arg1.method3619(29370, true);
        if (class609.field8462 != arg1.field9223) {
            arg1.method1041(class609.field8462);
        }
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(I)V", line = 68)
    public final void method2840(int arg0) {
        this.field6881.method1758((byte) 126);
        if (arg0 >= 63) {
            field6871++;
        }
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(Lkr;I)I", line = 79)
    public static final int method2841(class354 arg0, int arg1) {
        field6874++;
        if (arg1 >= -101) {
            return 123;
        }
        String var2 = class509.method2886(-32, arg0);
        int[] var3 = null;
        if (class198.method1280(arg0.field4729, -1007)) {
            var3 = class87.field1058.method1394(-47, (int) arg0.field4723).field8058;
        } else if (arg0.field4719 != -1) {
            var3 = class87.field1058.method1394(-115, arg0.field4719).field8058;
        } else if (class258.method1561(arg0.field4729, -125)) {
            class407 var4 = (class407) class296.field3921.method3057(1, (long) ((int) arg0.field4723));
            if (var4 != null) {
                class351 var5 = var4.field5354;
                class384 var6 = var5.field4671;
                if (var6.field5121 != null) {
                    var6 = var6.method2203(3, class564.field7696);
                }
                if (var6 != null) {
                    var3 = var6.field5091;
                }
            }
        } else if (class125.method744(arg0.field4729, 45)) {
            Object var7 = null;
            class600 var8;
            if (arg0.field4729 == 1011) {
                var8 = class118.field1510.method3921((int) arg0.field4723, -124);
            } else {
                var8 = class118.field1510.method3921((int) (arg0.field4723 >>> 32 & 0x7FFFFFFFL), -58);
            }
            if (var8.field8257 != null) {
                var8 = var8.method3324((byte) 43, class564.field7696);
            }
            if (var8 != null) {
                var3 = var8.field8333;
            }
        }
        if (var3 != null) {
            var2 = var2 + class557.method3098(var3, 584);
        }
        int var9 = class254.field3332.method3767(class196.field2683, var2, 17674);
        if (arg0.field4726) {
            var9 += class121.field1581.method530() + 4;
        }
        return var9;
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(Lqq;ILec;I)V", line = 150)
    public final void method2842(class651 arg0, int arg1, class144 arg2, int arg3) {
        field6865++;
        if (arg0.field9171 == null) {
            return;
        }
        if (arg3 < 0) {
            this.method2837(arg0, (byte) -127);
        } else {
            this.method2844(arg0, 115, arg3);
        }
        float var5 = arg0.field9171.field2012;
        float var6 = arg0.field9171.field2004;
        float var7 = arg0.field9171.field2022;
        float var8 = arg0.field9171.field2021;
        try {
            int var9 = 0;
            int var10 = Integer.MAX_VALUE;
            int var11 = 0;
            class701 var12 = arg2.field1942.field4349;
            for (class701 var13 = var12.field9865; var13 != var12; var13 = var13.field9865) {
                class545 var14 = (class545) var13;
                int var15 = (int) ((float) (var14.field7456 >> 12) * var7 + (float) (var14.field7451 >> 12) * var5 + (float) (var14.field7448 >> 12) * var6 + var8);
                if (var15 > var11) {
                    var11 = var15;
                }
                this.field6863[var9++] = var15;
                if (var15 < var10) {
                    var10 = var15;
                }
            }
            int var16 = var11 - var10;
            int var17;
            if ((arg1 + var16) <= 1600) {
                var17 = 0;
                var16 += 2;
            } else {
                var17 = class252.method1532(-123, var16) + (1 - class165.field2367);
                var16 = (var16 >> var17) + 2;
            }
            int var18 = 0;
            class701 var19 = var12.field9865;
            int var20 = -2;
            boolean var21 = true;
            boolean var22 = true;
            while (var12 != var19) {
                this.field6872 = 0;
                for (int var23 = 0; var23 < var16; var23++) {
                    this.field6868[var23] = 0;
                }
                for (int var24 = 0; var24 < 64; var24++) {
                    this.field6879[var24] = 0;
                }
                while (var12 != var19) {
                    class545 var25 = (class545) var19;
                    if (var22) {
                        var20 = var25.field7444;
                        var21 = var25.field7445;
                        var22 = false;
                    }
                    if (var18 > 0 && (var25.field7444 != var20 || var25.field7445 != var21)) {
                        var22 = true;
                        break;
                    }
                    int var26 = this.field6863[var18++] - var10 >> var17;
                    if (var26 < 1600) {
                        if (this.field6868[var26] >= 64) {
                            label107: {
                                if (this.field6868[var26] == 64) {
                                    if (this.field6872 == 64) {
                                        break label107;
                                    }
                                    this.field6868[var26] += this.field6872++ + 1;
                                }
                                this.field6880[this.field6868[var26] - 1 - 64][this.field6879[this.field6868[var26] - 64 - 1]++] = var25;
                            }
                        } else {
                            this.field6876[var26][this.field6868[var26]++] = var25;
                        }
                    }
                    var19 = var19.field9865;
                }
                arg0.method3667(var20 >= 0 ? var20 : -1, false, false, 3);
                if (var21 && class609.field8462 != arg0.field9223) {
                    arg0.method1041(class609.field8462);
                } else if (arg0.field9223 != 1.0F) {
                    arg0.method1041(1.0F);
                }
                this.method2843(var16, arg0, arg1 - 103);
            }
        } catch (Exception var27) {
        }
        this.method2839(-121, arg0);
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(ILqq;I)V", line = 307)
    private final void method2843(int arg0, class651 arg1, int arg2) {
        field6877++;
        int var4 = 0;
        class149 var5 = arg1.method3617((byte) -36);
        float var6 = var5.field2032;
        float var7 = var5.field2027;
        float var8 = var5.field2036;
        float var9 = var5.field2034;
        float var10 = var5.field2044;
        float var11 = var5.field2026;
        float var12 = var6 + var9;
        float var13 = var7 + var10;
        float var14 = var8 + var11;
        float var15 = var6 - var9;
        if (arg2 >= -79) {
            this.field6870 = null;
        }
        float var16 = var7 - var10;
        float var17 = var8 - var11;
        float var18 = var9 - var6;
        float var19 = var10 - var7;
        float var20 = var11 - var8;
        Buffer var21 = this.field6881.method2566(true, (byte) 6);
        if (var21 == null) {
            return;
        }
        Stream var22 = arg1.method3614(var21, 0);
        if (Stream.method3445()) {
            for (int var48 = arg0 - 1; var48 >= 0; var48--) {
                int var49 = this.field6868[var48] <= 64 ? this.field6868[var48] : 64;
                if (var49 > 0) {
                    for (int var50 = var49 - 1; var50 >= 0; var50--) {
                        class545 var63 = this.field6876[var48][var50];
                        int var64 = var63.field7454;
                        byte var65 = (byte) (var64 >> 16);
                        byte var66 = (byte) (var64 >> 8);
                        byte var67 = (byte) var64;
                        byte var68 = (byte) (var64 >>> 24);
                        float var69 = (float) (var63.field7451 >> 12);
                        float var70 = (float) (var63.field7448 >> 12);
                        float var71 = (float) (var63.field7456 >> 12);
                        int var72 = var63.field7447 >> 12;
                        var22.method3439((float) (-var72) * var12 + var69);
                        var22.method3439((float) (-var72) * var13 + var70);
                        var22.method3439((float) (-var72) * var14 + var71);
                        if (arg1.field9262 == 0) {
                            var22.method3436(var65, var66, var67, var68);
                        } else {
                            var22.method3434(var65, var66, var67, var68);
                        }
                        var22.method3439(0.0F);
                        var22.method3439(0.0F);
                        var22.method3439((float) var72 * var15 + var69);
                        var22.method3439((float) var72 * var16 + var70);
                        var22.method3439((float) var72 * var17 + var71);
                        if (arg1.field9262 == 0) {
                            var22.method3436(var65, var66, var67, var68);
                        } else {
                            var22.method3434(var65, var66, var67, var68);
                        }
                        var22.method3439(1.0F);
                        var22.method3439(0.0F);
                        var22.method3439((float) var72 * var12 + var69);
                        var22.method3439((float) var72 * var13 + var70);
                        var22.method3439((float) var72 * var14 + var71);
                        if (arg1.field9262 == 0) {
                            var22.method3436(var65, var66, var67, var68);
                        } else {
                            var22.method3434(var65, var66, var67, var68);
                        }
                        var22.method3439(1.0F);
                        var22.method3439(1.0F);
                        var22.method3439((float) var72 * var18 + var69);
                        var22.method3439((float) var72 * var19 + var70);
                        var22.method3439((float) var72 * var20 + var71);
                        if (arg1.field9262 == 0) {
                            var22.method3436(var65, var66, var67, var68);
                        } else {
                            var22.method3434(var65, var66, var67, var68);
                        }
                        var22.method3439(0.0F);
                        var4++;
                        var22.method3439(1.0F);
                    }
                    if (this.field6868[var48] > 64) {
                        int var51 = this.field6868[var48] - 64 - 1;
                        for (int var52 = this.field6879[var51] - 1; var52 >= 0; var52--) {
                            class545 var53 = this.field6880[var51][var52];
                            int var54 = var53.field7454;
                            byte var55 = (byte) (var54 >> 16);
                            byte var56 = (byte) (var54 >> 8);
                            byte var57 = (byte) var54;
                            byte var58 = (byte) (var54 >>> 24);
                            float var59 = (float) (var53.field7451 >> 12);
                            float var60 = (float) (var53.field7448 >> 12);
                            float var61 = (float) (var53.field7456 >> 12);
                            int var62 = var53.field7447 >> 12;
                            var22.method3439((float) (-var62) * var12 + var59);
                            var22.method3439((float) (-var62) * var13 + var60);
                            var22.method3439((float) (-var62) * var14 + var61);
                            if (arg1.field9262 == 0) {
                                var22.method3436(var55, var56, var57, var58);
                            } else {
                                var22.method3434(var55, var56, var57, var58);
                            }
                            var22.method3439(0.0F);
                            var22.method3439(0.0F);
                            var22.method3439((float) var62 * var15 + var59);
                            var22.method3439((float) var62 * var16 + var60);
                            var22.method3439((float) var62 * var17 + var61);
                            if (arg1.field9262 == 0) {
                                var22.method3436(var55, var56, var57, var58);
                            } else {
                                var22.method3434(var55, var56, var57, var58);
                            }
                            var22.method3439(1.0F);
                            var22.method3439(0.0F);
                            var22.method3439((float) var62 * var12 + var59);
                            var22.method3439((float) var62 * var13 + var60);
                            var22.method3439((float) var62 * var14 + var61);
                            if (arg1.field9262 == 0) {
                                var22.method3436(var55, var56, var57, var58);
                            } else {
                                var22.method3434(var55, var56, var57, var58);
                            }
                            var22.method3439(1.0F);
                            var22.method3439(1.0F);
                            var22.method3439((float) var62 * var18 + var59);
                            var22.method3439((float) var62 * var19 + var60);
                            var22.method3439((float) var62 * var20 + var61);
                            if (arg1.field9262 == 0) {
                                var22.method3436(var55, var56, var57, var58);
                            } else {
                                var22.method3434(var55, var56, var57, var58);
                            }
                            var22.method3439(0.0F);
                            var22.method3439(1.0F);
                            var4++;
                        }
                    }
                }
            }
        } else {
            for (int var23 = arg0 - 1; var23 >= 0; var23--) {
                int var24 = this.field6868[var23] <= 64 ? this.field6868[var23] : 64;
                if (var24 > 0) {
                    for (int var25 = var24 - 1; var25 >= 0; var25--) {
                        class545 var38 = this.field6876[var23][var25];
                        int var39 = var38.field7454;
                        byte var40 = (byte) (var39 >> 16);
                        byte var41 = (byte) (var39 >> 8);
                        byte var42 = (byte) var39;
                        byte var43 = (byte) (var39 >>> 24);
                        float var44 = (float) (var38.field7451 >> 12);
                        float var45 = (float) (var38.field7448 >> 12);
                        float var46 = (float) (var38.field7456 >> 12);
                        int var47 = var38.field7447 >> 12;
                        var22.method3438((float) (-var47) * var12 + var44);
                        var22.method3438((float) (-var47) * var13 + var45);
                        var22.method3438((float) (-var47) * var14 + var46);
                        if (arg1.field9262 == 0) {
                            var22.method3436(var40, var41, var42, var43);
                        } else {
                            var22.method3434(var40, var41, var42, var43);
                        }
                        var22.method3438(0.0F);
                        var22.method3438(0.0F);
                        var22.method3438((float) var47 * var15 + var44);
                        var22.method3438((float) var47 * var16 + var45);
                        var22.method3438((float) var47 * var17 + var46);
                        if (arg1.field9262 == 0) {
                            var22.method3436(var40, var41, var42, var43);
                        } else {
                            var22.method3434(var40, var41, var42, var43);
                        }
                        var22.method3438(1.0F);
                        var22.method3438(0.0F);
                        var22.method3438((float) var47 * var12 + var44);
                        var22.method3438((float) var47 * var13 + var45);
                        var22.method3438((float) var47 * var14 + var46);
                        if (arg1.field9262 == 0) {
                            var22.method3436(var40, var41, var42, var43);
                        } else {
                            var22.method3434(var40, var41, var42, var43);
                        }
                        var22.method3438(1.0F);
                        var22.method3438(1.0F);
                        var22.method3438((float) var47 * var18 + var44);
                        var22.method3438((float) var47 * var19 + var45);
                        var22.method3438((float) var47 * var20 + var46);
                        if (arg1.field9262 == 0) {
                            var22.method3436(var40, var41, var42, var43);
                        } else {
                            var22.method3434(var40, var41, var42, var43);
                        }
                        var22.method3438(0.0F);
                        var22.method3438(1.0F);
                        var4++;
                    }
                    if (this.field6868[var23] > 64) {
                        int var26 = this.field6868[var23] - 65;
                        for (int var27 = this.field6879[var26] - 1; var27 >= 0; var27--) {
                            class545 var28 = this.field6880[var26][var27];
                            int var29 = var28.field7454;
                            byte var30 = (byte) (var29 >> 16);
                            byte var31 = (byte) (var29 >> 8);
                            byte var32 = (byte) var29;
                            byte var33 = (byte) (var29 >>> 24);
                            float var34 = (float) (var28.field7451 >> 12);
                            float var35 = (float) (var28.field7448 >> 12);
                            float var36 = (float) (var28.field7456 >> 12);
                            int var37 = var28.field7447 >> 12;
                            var22.method3438((float) (-var37) * var12 + var34);
                            var22.method3438((float) (-var37) * var13 + var35);
                            var22.method3438((float) (-var37) * var14 + var36);
                            if (arg1.field9262 == 0) {
                                var22.method3436(var30, var31, var32, var33);
                            } else {
                                var22.method3434(var30, var31, var32, var33);
                            }
                            var22.method3438(0.0F);
                            var22.method3438(0.0F);
                            var22.method3438((float) var37 * var15 + var34);
                            var22.method3438((float) var37 * var16 + var35);
                            var22.method3438((float) var37 * var17 + var36);
                            if (arg1.field9262 == 0) {
                                var22.method3436(var30, var31, var32, var33);
                            } else {
                                var22.method3434(var30, var31, var32, var33);
                            }
                            var22.method3438(1.0F);
                            var22.method3438(0.0F);
                            var22.method3438((float) var37 * var12 + var34);
                            var22.method3438((float) var37 * var13 + var35);
                            var22.method3438((float) var37 * var14 + var36);
                            if (arg1.field9262 == 0) {
                                var22.method3436(var30, var31, var32, var33);
                            } else {
                                var22.method3434(var30, var31, var32, var33);
                            }
                            var22.method3438(1.0F);
                            var22.method3438(1.0F);
                            var22.method3438((float) var37 * var18 + var34);
                            var22.method3438((float) var37 * var19 + var35);
                            var22.method3438((float) var37 * var20 + var36);
                            if (arg1.field9262 == 0) {
                                var22.method3436(var30, var31, var32, var33);
                            } else {
                                var22.method3434(var30, var31, var32, var33);
                            }
                            var22.method3438(0.0F);
                            var4++;
                            var22.method3438(1.0F);
                        }
                    }
                }
            }
        }
        var22.method3440();
        if (this.field6881.method2564(119)) {
            arg1.method2020(120, 0, this.field6881);
            arg1.method2020(110, 1, this.field6870);
            arg1.method1994(this.field6875, 3);
            arg1.method2040(0, -84, 0, this.field6861, var4 * 2, var4 * 4, class694.field9783);
        }
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(Lqq;II)V", line = 698)
    private final void method2844(class651 arg0, int arg1, int arg2) {
        int var4 = -120 % ((-arg1 - 19) / 49);
        class609.field8462 = arg0.field9223;
        field6864++;
        arg0.method3665((float) arg2, (byte) -57);
        arg0.method3681((byte) 106);
        arg0.method3619(29370, false);
        arg0.method3628(false, (byte) -36);
        arg0.method3622(-22561);
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(III)V", line = 714)
    public static final void method2845(int arg0, int arg1, int arg2) {
        field6873++;
        int var3 = class254.field3332.method3765(class371.field4903.method2141(class422.field5539, true), (byte) 6);
        for (class354 var4 = (class354) class101.field1211.method2506(68); var4 != null; var4 = (class354) class101.field1211.method2505(-121)) {
            int var8 = method2841(var4, -103);
            if (var3 < var8) {
                var3 = var8;
            }
        }
        var3 += 8;
        int var5 = class137.field1873 * 16 + 21;
        int var6 = arg0 - (var3 / 2);
        if (class399.field5301 < var3 + var6) {
            var6 = class399.field5301 - var3;
        }
        if (var6 < 0) {
            var6 = 0;
        }
        int var7 = arg1;
        if (class60.field750 < var5 + arg1) {
            var7 = class60.field750 - var5;
        }
        class114.field1464 = var6;
        if (var7 < 0) {
            var7 = 0;
        }
        class674.field9590 = true;
        if (arg2 == -30906) {
            class464.field6078 = class137.field1873 * 16 + (class218.field2857 ? 26 : 22);
            class102.field1224 = var7;
            class172.field2446 = var3;
        }
    }

    @OriginalMember(owner = "client!hm", name = "b", descriptor = "(Lqq;B)V", line = 767)
    public final void method2846(class651 arg0, byte arg1) {
        int var3 = 25 / ((-arg1 - 62) / 50);
        this.field6881.method2567(24, (byte) -116, 786336);
        field6867++;
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(BIII)V", line = 781)
    public static final void method2847(byte arg0, int arg1, int arg2, int arg3) {
        field6862++;
        class256 var4 = class592.method3279((byte) -111, 11, arg2);
        var4.method1549(arg0 - 32126);
        var4.field3358 = arg3;
        var4.field3354 = arg1;
        if (arg0 != 84) {
            method2838(-73, null, -119);
        }
    }
}
