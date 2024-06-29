import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public class class194 extends class120 {

    @OriginalMember(owner = "client!pd", name = "T", descriptor = "I")
    private int field3123 = 4096;

    @OriginalMember(owner = "client!pd", name = "ib", descriptor = "I")
    private int field3138 = 3216;

    @OriginalMember(owner = "client!pd", name = "jb", descriptor = "I")
    private int field3139 = 3216;

    @OriginalMember(owner = "client!pd", name = "V", descriptor = "[I")
    private int[] field3125 = new int[3];

    @OriginalMember(owner = "client!pd", name = "W", descriptor = "I")
    public static int field3126 = 50;

    @OriginalMember(owner = "client!pd", name = "gb", descriptor = "I")
    public static int field3136 = 0;

    @OriginalMember(owner = "client!pd", name = "X", descriptor = "[S")
    public static short[] field3127 = new short[] { 6798, 8741, 25238, 4626, 4550 };

    @OriginalMember(owner = "client!pd", name = "cb", descriptor = "Z")
    public static boolean field3132 = false;

    @OriginalMember(owner = "client!pd", name = "lb", descriptor = "Lok;")
    private static class41 field3141 = class137.method956("Checking for updates )2 ", 45);

    @OriginalMember(owner = "client!pd", name = "bb", descriptor = "Lok;")
    public static class41 field3131 = field3141;

    @OriginalMember(owner = "client!pd", name = "U", descriptor = "I")
    public static int field3124;

    @OriginalMember(owner = "client!pd", name = "Y", descriptor = "I")
    public static int field3128;

    @OriginalMember(owner = "client!pd", name = "Z", descriptor = "I")
    public static int field3129;

    @OriginalMember(owner = "client!pd", name = "ab", descriptor = "I")
    public static int field3130;

    @OriginalMember(owner = "client!pd", name = "db", descriptor = "I")
    public static int field3133;

    @OriginalMember(owner = "client!pd", name = "eb", descriptor = "I")
    public static int field3134;

    @OriginalMember(owner = "client!pd", name = "fb", descriptor = "I")
    public static int field3135;

    @OriginalMember(owner = "client!pd", name = "hb", descriptor = "I")
    public static int field3137;

    @OriginalMember(owner = "client!pd", name = "kb", descriptor = "I")
    public static int field3140;

    @OriginalMember(owner = "client!pd", name = "c", descriptor = "(II)V", line = 11)
    public static final void method1390(int arg0, int arg1) {
        class57.field821.method138(arg0, 0);
        field3130++;
        class156.field2460.method138(arg0, 0);
        class18.field228.method138(arg0, 0);
        int var2 = 54 % ((28 - arg1) / 59);
    }

    @OriginalMember(owner = "client!pd", name = "f", descriptor = "(I)V", line = 23)
    public static void method1391(int arg0) {
        field3141 = null;
        field3127 = null;
        field3131 = null;
        if (arg0 > -86) {
            field3136 = 15;
        }
    }

    @OriginalMember(owner = "client!pd", name = "<init>", descriptor = "()V", line = 123)
    public class194() {
        super(1, true);
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(IIIII)I", line = 41)
    public static final int method1392(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3129++;
        if (arg2 != -1154803480) {
            return -78;
        }
        if (class281.field4568) {
            class281.field4568 = false;
            arg0 = 1000000;
        }
        class284 var5 = class129.field1932[arg1][arg3];
        int var6 = var5.field4619;
        float var7 = ((float) arg4 * 0.1F + 0.7F) * var5.field4609;
        float var8 = var5.field4608;
        float var9 = var5.field4604;
        int var10 = var5.field4605;
        int var11 = var5.field4618;
        if (!class296.field4787) {
            var11 = 0;
        }
        if (class113.field1676 != var6 || class212.field3422 != var7 || class260.field4140 != var9 || class101.field1447 != var8 || class313.field5284 != var10 || class205.field3317 != var11) {
            class101.field1447 = var8;
            class113.field1676 = var6;
            class313.field5284 = var10;
            class65.field1000 = class18.field235;
            class212.field3422 = var7;
            class260.field4140 = var9;
            class306.field5127 = class142.field2177;
            class185.field3026 = class266.field4234;
            class238.field3810 = class35.field520;
            class294.field4750 = class22.field345;
            class140.field2150 = class308.field5182;
            class216.field3474 = 0;
            class205.field3317 = var11;
        }
        if (class216.field3474 < 65536) {
            class216.field3474 += arg0 * 250;
            if (class216.field3474 >= 65536) {
                class216.field3474 = 65536;
            }
            int var12 = class216.field3474 >> 8;
            int var13 = 65536 - class216.field3474 >> 8;
            class266.field4234 = ((class185.field3026 & 0xFF00) * var13 + ((class113.field1676 & 0xFF00) * var12) & 0xFF0000) + ((class185.field3026 & 0xFF00FF) * var13 + (class113.field1676 & 0xFF00FF) * var12 & 0xFF00FF00) >> 8;
            class18.field235 = class65.field1000 * var13 + (class205.field3317 * var12) >> 8;
            class308.field5182 = ((class140.field2150 & 0xFF00FF) * var13 + ((class313.field5284 & 0xFF00FF) * var12) & 0xFF00FF00) + ((class313.field5284 & 0xFF00) * var12 + (class140.field2150 & 0xFF00) * var13 & 0xFF0000) >> 8;
            float var14 = (float) (65536 - class216.field3474) / 65536.0F;
            float var15 = (float) class216.field3474 / 65536.0F;
            class22.field345 = class294.field4750 * var14 + class260.field4140 * var15;
            class142.field2177 = class306.field5127 * var14 + class212.field3422 * var15;
            class35.field520 = class238.field3810 * var14 + class101.field1447 * var15;
        }
        class58.method405(class266.field4234, class142.field2177, class22.field345, class35.field520);
        class58.method412(class308.field5182, class18.field235);
        class58.method403((float) class36.field544, (float) class68.field1018, (float) class308.field5186);
        class58.method410();
        return class308.field5182;
    }

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "(Z)V", line = 141)
    private final void method1393(boolean arg0) {
        field3128++;
        double var2 = Math.cos((double) ((float) this.field3139 / 4096.0F));
        this.field3125[0] = (int) (var2 * Math.sin((double) ((float) this.field3138 / 4096.0F)) * 4096.0D);
        this.field3125[1] = (int) (Math.cos((double) ((float) this.field3138 / 4096.0F)) * 4096.0D * var2);
        this.field3125[2] = (int) (Math.sin((double) ((float) this.field3139 / 4096.0F)) * 4096.0D);
        int var4 = this.field3125[0] * this.field3125[0] >> 12;
        if (!arg0) {
            return;
        }
        int var5 = this.field3125[2] * this.field3125[2] >> 12;
        int var6 = this.field3125[1] * this.field3125[1] >> 12;
        int var7 = (int) (Math.sqrt((double) (var4 + var6 + var5 >> 12)) * 4096.0D);
        if (var7 != 0) {
            this.field3125[0] = (this.field3125[0] << 12) / var7;
            this.field3125[1] = (this.field3125[1] << 12) / var7;
            this.field3125[2] = (this.field3125[2] << 12) / var7;
        }
    }

    @OriginalMember(owner = "client!pd", name = "d", descriptor = "(I)V", line = 171)
    public final void method31(int arg0) {
        field3135++;
        this.method1393(true);
        if (arg0 != -31851) {
            method1390(36, 36);
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(IBIIIIII)V", line = 188)
    public static final void method1394(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field3140++;
        int var8 = arg5 - arg4;
        int var9 = 0;
        int var10 = arg2;
        int var11 = var8 * var8;
        int var12 = arg2 * arg2;
        int var13 = arg5 * arg5;
        int var14 = arg2 - arg4;
        int var15 = 0;
        int var16 = var14 * var14;
        int var17 = var12 << 1;
        int var18 = var13 << 1;
        int var19 = var16 << 1;
        int var20 = var14 << 1;
        int var21 = var11 << 1;
        int var22 = arg2 << 1;
        int var23 = (1 - var22) * var13 + var17;
        int var24 = var12 - ((var22 - 1) * var18);
        int var25 = (1 - var20) * var11 + var19;
        int var26 = var16 - ((var20 - 1) * var21);
        int var27 = var13 << 2;
        int var28 = var12 << 2;
        int var29 = var11 << 2;
        int var30 = var16 << 2;
        int var31 = var17 * 3;
        int var32 = var19 * 3;
        int var33 = var28;
        int var34 = (var20 - 3) * var21;
        int var35 = (var22 - 3) * var18;
        int var36 = (arg2 - 1) * var27;
        int var37 = -10 / ((27 - arg1) / 60);
        int var38 = var30;
        int var39 = (var14 - 1) * var29;
        if (arg7 >= class15.field192 && class237.field3801 >= arg7) {
            int[] var40 = class239.field3829[arg7];
            int var41 = class109.method733(class273.field4449, class153.field2439, (byte) 16, arg3 - arg5);
            int var42 = class109.method733(class273.field4449, class153.field2439, (byte) 16, arg3 + arg5);
            int var43 = class109.method733(class273.field4449, class153.field2439, (byte) 16, arg3 - var8);
            int var44 = class109.method733(class273.field4449, class153.field2439, (byte) 16, arg3 + var8);
            class269.method1908(19, var40, arg0, var43, var41);
            class269.method1908(19, var40, arg6, var44, var43);
            class269.method1908(19, var40, arg0, var42, var44);
        }
        while (var10 > 0) {
            if (var23 < 0) {
                while (var23 < 0) {
                    var24 += var33;
                    var33 += var28;
                    var23 += var31;
                    var31 += var28;
                    var9++;
                }
            }
            if (var24 < 0) {
                var9++;
                var23 += var31;
                var24 += var33;
                var33 += var28;
                var31 += var28;
            }
            var23 += -var36;
            var24 += -var35;
            var36 -= var27;
            boolean var45 = var14 >= var10;
            var10--;
            if (var45) {
                if (var25 < 0) {
                    while (var25 < 0) {
                        var26 += var38;
                        var15++;
                        var25 += var32;
                        var32 += var30;
                        var38 += var30;
                    }
                }
                if (var26 < 0) {
                    var26 += var38;
                    var38 += var30;
                    var25 += var32;
                    var32 += var30;
                    var15++;
                }
                var26 += -var34;
                var34 -= var29;
                var25 += -var39;
                var39 -= var29;
            }
            int var46 = arg7 - var10;
            var35 -= var27;
            int var47 = arg7 + var10;
            if (class15.field192 <= var47 && class237.field3801 >= var46) {
                int var48 = class109.method733(class273.field4449, class153.field2439, (byte) 16, arg3 + var9);
                int var49 = class109.method733(class273.field4449, class153.field2439, (byte) 16, arg3 - var9);
                if (var45) {
                    int var50 = class109.method733(class273.field4449, class153.field2439, (byte) 16, arg3 + var15);
                    int var51 = class109.method733(class273.field4449, class153.field2439, (byte) 16, arg3 - var15);
                    if (class15.field192 <= var46) {
                        int[] var52 = class239.field3829[var46];
                        class269.method1908(19, var52, arg0, var51, var49);
                        class269.method1908(19, var52, arg6, var50, var51);
                        class269.method1908(19, var52, arg0, var48, var50);
                    }
                    if (class237.field3801 >= var47) {
                        int[] var53 = class239.field3829[var47];
                        class269.method1908(19, var53, arg0, var51, var49);
                        class269.method1908(19, var53, arg6, var50, var51);
                        class269.method1908(19, var53, arg0, var48, var50);
                    }
                } else {
                    if (var46 >= class15.field192) {
                        class269.method1908(19, class239.field3829[var46], arg0, var48, var49);
                    }
                    if (var47 <= class237.field3801) {
                        class269.method1908(19, class239.field3829[var47], arg0, var48, var49);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(II)[I", line = 400)
    public final int[] method14(int arg0, int arg1) {
        if (arg1 != -14959) {
            method1392(-118, -84, -126, 41, 28);
        }
        int[] var3 = this.field1775.method863((byte) 34, arg0);
        field3133++;
        if (this.field1775.field1798) {
            int var4 = class252.field4013 * this.field3123 >> 12;
            int[] var5 = this.method854(0, arg0 - 1 & class27.field410, -24059);
            int[] var6 = this.method854(0, arg0, -24059);
            int[] var7 = this.method854(0, arg0 + 1 & class27.field410, -24059);
            for (int var8 = 0; var8 < class307.field5160; var8++) {
                int var9 = (var7[var8] - var5[var8]) * var4 >> 12;
                int var10 = (var6[var8 - 1 & class51.field776] - var6[class51.field776 & var8 + 1]) * var4 >> 12;
                int var11 = var10 >> 4;
                if (var11 < 0) {
                    var11 = -var11;
                }
                int var12 = var9 >> 4;
                if (var12 < 0) {
                    var12 = -var12;
                }
                if (var11 > 255) {
                    var11 = 255;
                }
                if (var12 > 255) {
                    var12 = 255;
                }
                int var13 = class262.field4166[((var12 + 1) * var12 >> 1) + var11] & 0xFF;
                int var14 = var9 * var13 >> 8;
                int var15 = var10 * var13 >> 8;
                int var16 = this.field3125[1] * var14 >> 12;
                int var17 = this.field3125[0] * var15 >> 12;
                int var18 = var13 * 4096 >> 8;
                int var19 = this.field3125[2] * var18 >> 12;
                var3[var8] = var17 - (-var16 - var19);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(Llb;II)V", line = 468)
    public final void method30(class112 arg0, int arg1, int arg2) {
        field3134++;
        if (arg2 == 0) {
            this.field3123 = arg0.method759((byte) -88);
        } else if (arg2 == 1) {
            this.field3138 = arg0.method759((byte) -63);
        } else if (arg2 == 2) {
            this.field3139 = arg0.method759((byte) -128);
        }
        if (arg1 != -1) {
            field3124 = -18;
        }
    }

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "(IIIII)V", line = 524)
    public static final void method1395(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3137++;
        int var5 = 0;
        int var6 = -arg2;
        int var7 = arg2;
        int var8 = -1;
        if (arg0 != 353679137) {
            method1390(-28, -36);
        }
        int var9 = class109.method733(class273.field4449, class153.field2439, (byte) 16, arg2 + arg3);
        int var10 = class109.method733(class273.field4449, class153.field2439, (byte) 16, arg3 - arg2);
        class269.method1908(19, class239.field3829[arg4], arg1, var9, var10);
        while (var5 < var7) {
            var8 += 2;
            var6 += var8;
            if (var6 > 0) {
                var7--;
                var6 -= var7 << 1;
                int var11 = arg4 - var7;
                int var12 = arg4 + var7;
                if (class15.field192 <= var12 && var11 <= class237.field3801) {
                    int var13 = class109.method733(class273.field4449, class153.field2439, (byte) 16, arg3 + var5);
                    int var14 = class109.method733(class273.field4449, class153.field2439, (byte) 16, arg3 - var5);
                    if (var12 <= class237.field3801) {
                        class269.method1908(19, class239.field3829[var12], arg1, var13, var14);
                    }
                    if (class15.field192 <= var11) {
                        class269.method1908(19, class239.field3829[var11], arg1, var13, var14);
                    }
                }
            }
            var5++;
            int var15 = arg4 - var5;
            int var16 = arg4 + var5;
            if (class15.field192 <= var16 && class237.field3801 >= var15) {
                int var17 = class109.method733(class273.field4449, class153.field2439, (byte) 16, arg3 + var7);
                int var18 = class109.method733(class273.field4449, class153.field2439, (byte) 16, arg3 - var7);
                if (class237.field3801 >= var16) {
                    class269.method1908(arg0 ^ 0x1514B732, class239.field3829[var16], arg1, var17, var18);
                }
                if (var15 >= class15.field192) {
                    class269.method1908(19, class239.field3829[var15], arg1, var17, var18);
                }
            }
        }
    }
}
