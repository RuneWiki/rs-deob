import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dl")
public class class30 extends class197 {

    @OriginalMember(owner = "client!dl", name = "T", descriptor = "I")
    public int field355 = 0;

    @OriginalMember(owner = "client!dl", name = "V", descriptor = "I")
    public int field357 = 1638;

    @OriginalMember(owner = "client!dl", name = "W", descriptor = "[B")
    private byte[] field358 = new byte[512];

    @OriginalMember(owner = "client!dl", name = "M", descriptor = "Z")
    public boolean field348 = true;

    @OriginalMember(owner = "client!dl", name = "ab", descriptor = "I")
    public int field362 = 4;

    @OriginalMember(owner = "client!dl", name = "cb", descriptor = "I")
    public int field364 = 4;

    @OriginalMember(owner = "client!dl", name = "db", descriptor = "I")
    public int field365 = 4;

    @OriginalMember(owner = "client!dl", name = "N", descriptor = "I")
    public static int field349;

    @OriginalMember(owner = "client!dl", name = "O", descriptor = "I")
    public static int field350;

    @OriginalMember(owner = "client!dl", name = "P", descriptor = "I")
    public static int field351;

    @OriginalMember(owner = "client!dl", name = "Q", descriptor = "I")
    public static int field352;

    @OriginalMember(owner = "client!dl", name = "S", descriptor = "I")
    public static int field354;

    @OriginalMember(owner = "client!dl", name = "X", descriptor = "I")
    public static int field359;

    @OriginalMember(owner = "client!dl", name = "Y", descriptor = "I")
    public static int field360;

    @OriginalMember(owner = "client!dl", name = "Z", descriptor = "I")
    public static int field361;

    @OriginalMember(owner = "client!dl", name = "bb", descriptor = "I")
    public static int field363;

    @OriginalMember(owner = "client!dl", name = "fb", descriptor = "I")
    public static int field367;

    @OriginalMember(owner = "client!dl", name = "R", descriptor = "Z")
    public static boolean field353;

    @OriginalMember(owner = "client!dl", name = "U", descriptor = "[S")
    private short[] field356;

    @OriginalMember(owner = "client!dl", name = "eb", descriptor = "[S")
    private short[] field366;

    @OriginalMember(owner = "client!dl", name = "g", descriptor = "(B)V", line = 4)
    public static final void method220(byte arg0) {
        field354++;
        if (class154.field2640 == null) {
            return;
        }
        if (class206.field3557 < 10) {
            if (!class193.field3414.method1424(class154.field2640.field2228, -41)) {
                class206.field3557 = class312.field5297.method1423(false, class154.field2640.field2228) / 10;
                return;
            }
            class47.method383(true);
            class206.field3557 = 10;
        }
        if (class206.field3557 == 10) {
            class317.field5348 = class154.field2640.field2237 >> 6 << 6;
            class225.field3870 = (class154.field2640.field2245 >> 6 << 6) + 64 - class317.field5348;
            class121.field2139 = 8.0F;
            class313.field5302 = 8.0F;
            int var1 = class317.field5348 + class225.field3870 - ((class152.field2606.field934 >> 7) + class311.field5271) - 1;
            int var2 = var1 + ((int) (Math.random() * 10.0D) - 5);
            class49.field735 = class154.field2640.field2242 >> 6 << 6;
            class57.field907 = (class154.field2640.field2221 >> 6 << 6) + 64 - class49.field735;
            int var3 = class229.field3955 + (class152.field2606.field912 >> 7) - class49.field735;
            int var4 = var3 + (int) (Math.random() * 10.0D) - 5;
            if (var4 >= 0 && class57.field907 > var4 && var2 >= 0 && class225.field3870 > var2) {
                class176.field3163 = var2;
                class165.field2784 = var4;
            } else {
                class165.field2784 = class154.field2640.field2224 * 64 - class49.field735;
                class176.field3163 = class225.field3870 + class317.field5348 - (class154.field2640.field2225 * 64) - 1;
            }
            class178.method1222(false);
            class37.field494 = new int[class106.field1902 + 1];
            int var5 = class20.field244 >> 2 << 10;
            int var6 = class283.field4859 >> 1;
            int var7 = class225.field3870 >> 6;
            int var8 = class57.field907 >> 6;
            class272.field4710 = new int[var8][var7][];
            class115.field2053 = new byte[var8][var7][];
            class243.field4223 = new short[var8][var7][];
            class56.field885 = new byte[var8][var7][];
            class167.field2836 = new byte[var8][var7][];
            class202.field3502 = new int[var8][var7][];
            class19.field224 = new byte[var8][var7][];
            class64.field1122 = new byte[var8][var7][];
            class26.method201(var6, 82, var5);
            class206.field3557 = 20;
        } else if (class206.field3557 == 20) {
            class231.method1538(new class235(class193.field3414.method1450(0, class154.field2640.field2228, class132.field2301)), 0);
            class206.field3557 = 30;
            class159.method1075((byte) -116, true);
            class310.method2155((byte) -69);
        } else if (class206.field3557 == 30) {
            class206.method1365(new class235(class193.field3414.method1450(0, class154.field2640.field2228, class56.field884)), -126);
            class206.field3557 = 40;
            class310.method2155((byte) -75);
        } else if (class206.field3557 == 40) {
            class303.method2120((byte) -67, new class235(class193.field3414.method1450(0, class154.field2640.field2228, class107.field1912)));
            class206.field3557 = 50;
            class310.method2155((byte) -80);
        } else if (class206.field3557 == 50) {
            class191.method1292(new class235(class193.field3414.method1450(0, class154.field2640.field2228, class260.field4525)), -9847);
            class206.field3557 = 60;
            class159.method1075((byte) -116, true);
            class310.method2155((byte) -44);
        } else if (class206.field3557 == 60) {
            if (class193.field3414.method1445(124, class100.method755(-6, new class258[] { class154.field2640.field2228, class137.field2340 }))) {
                if (!class193.field3414.method1424(class100.method755(-6, new class258[] { class154.field2640.field2228, class137.field2340 }), 61)) {
                    return;
                }
                class65.field1144 = class170.method1126(class193.field3414, class100.method755(-6, new class258[] { class154.field2640.field2228, class137.field2340 }), false);
            } else {
                class65.field1144 = new class225(0);
            }
            class206.field3557 = 70;
            class310.method2155((byte) -103);
        } else if (class206.field3557 == 70) {
            class209.field3603 = new class112(11, true, class5.field67);
            class206.field3557 = 73;
            class159.method1075((byte) -116, true);
            class310.method2155((byte) -73);
        } else if (class206.field3557 == 73) {
            class123.field2175 = new class112(12, true, class5.field67);
            class206.field3557 = 76;
            class159.method1075((byte) -116, true);
            class310.method2155((byte) -113);
        } else if (class206.field3557 == 76) {
            class62.field1093 = new class112(14, true, class5.field67);
            class206.field3557 = 79;
            class159.method1075((byte) -116, true);
            class310.method2155((byte) -67);
        } else if (class206.field3557 == 79) {
            class62.field1095 = new class112(17, true, class5.field67);
            class206.field3557 = 82;
            class159.method1075((byte) -116, true);
            class310.method2155((byte) -39);
        } else if (class206.field3557 == 82) {
            class300.field5136 = new class112(19, true, class5.field67);
            class206.field3557 = 85;
            class159.method1075((byte) -116, true);
            class310.method2155((byte) -122);
        } else if (class206.field3557 == 85) {
            class218.field3755 = new class112(22, true, class5.field67);
            class206.field3557 = 88;
            class159.method1075((byte) -116, true);
            class310.method2155((byte) -41);
        } else if (class206.field3557 == 88) {
            class105.field1893 = new class112(26, true, class5.field67);
            class206.field3557 = 91;
            class159.method1075((byte) -116, true);
            class310.method2155((byte) -107);
        } else {
            class138.field2354 = new class112(30, true, class5.field67);
            class206.field3557 = 100;
            class159.method1075((byte) -116, true);
            class310.method2155((byte) -114);
            class299.field5122 = -1;
            class218.field3782 = -1;
            if (arg0 >= -63) {
                method221(88, 25, 47, false);
            }
            System.gc();
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(II)[I", line = 205)
    public final int[] method96(int arg0, int arg1) {
        if (arg0 != -16221) {
            return (int[]) null;
        }
        field350++;
        int[] var3 = this.field3456.method2104(arg1, arg0 + 16221);
        if (this.field3456.field5115) {
            this.method222(arg1, 82, var3);
        }
        return var3;
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(IIIZ)Loh;", line = 227)
    public static final class258 method221(int arg0, int arg1, int arg2, boolean arg3) {
        field363++;
        if (arg1 < 2 || arg1 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg1);
        }
        int var4 = 1;
        for (int var5 = arg2 / arg1; var5 != 0; var5 /= arg1) {
            var4++;
        }
        int var6 = var4;
        if (arg2 < 0 || arg3) {
            var6 = var4 + 1;
        }
        byte[] var7 = new byte[var6];
        if (arg2 < 0) {
            var7[0] = 45;
        } else if (arg3) {
            var7[0] = 43;
        }
        for (int var8 = 0; var8 < var4; var8++) {
            int var9 = arg2 % arg1;
            if (var9 < 0) {
                var9 = -var9;
            }
            if (var9 > 9) {
                var9 += 39;
            }
            var7[var6 - var8 - 1] = (byte) (var9 + 48);
            arg2 /= arg1;
        }
        if (arg0 != -15449) {
            field360 = 124;
        }
        class258 var10 = new class258();
        var10.field4478 = var6;
        var10.field4490 = var7;
        return var10;
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(ILva;I)V", line = 292)
    public final void method98(int arg0, class235 arg1, int arg2) {
        if (arg0 != 7955) {
            return;
        }
        if (arg2 == 0) {
            this.field348 = arg1.method1589(55) == 1;
        } else if (arg2 == 1) {
            this.field364 = arg1.method1589(arg0 ^ 0x1F2D);
        } else if (arg2 == 2) {
            this.field357 = arg1.method1574(-121);
            if (this.field357 < 0) {
                this.field366 = new short[this.field364];
                for (int var5 = 0; var5 < this.field364; var5++) {
                    this.field366[var5] = (short) arg1.method1574(-62);
                }
            }
        } else if (arg2 == 3) {
            this.field362 = this.field365 = arg1.method1589(108);
        } else if (arg2 == 4) {
            this.field355 = arg1.method1589(89);
        } else if (arg2 == 5) {
            this.field362 = arg1.method1589(76);
        } else if (arg2 == 6) {
            this.field365 = arg1.method1589(102);
        }
        field349++;
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(II[I)V", line = 401)
    public final void method222(int arg0, int arg1, int[] arg2) {
        int var4 = class268.field4670[arg0] * this.field365;
        int var5 = 61 % ((-arg1 - 10) / 33);
        field359++;
        if (this.field364 == 1) {
            short var39 = this.field366[0];
            int var40 = this.field356[0] << 12;
            int var41 = var4 * var40 >> 12;
            int var42 = var41 >> 12;
            int var43 = var41 & 0xFFF;
            int var44 = class265.field4625[var43];
            int var45 = this.field362 * var40 >> 12;
            int var46 = this.field365 * var40 >> 12;
            int var47 = var42 + 1;
            if (var46 <= var47) {
                var47 = 0;
            }
            int var48 = this.field358[var42 & 0xFF] & 0xFF;
            int var49 = this.field358[var47 & 0xFF] & 0xFF;
            if (this.field348) {
                for (int var50 = 0; var50 < class190.field3362; var50++) {
                    int var51 = class166.field2822[var50] * this.field362;
                    int var52 = this.method225(true, var48, var43, var45, var40 * var51 >> 12, var49, var44);
                    int var53 = var39 * var52 >> 12;
                    arg2[var50] = (var53 >> 1) + 2048;
                }
            } else {
                for (int var54 = 0; var54 < class190.field3362; var54++) {
                    int var55 = class166.field2822[var54] * this.field362;
                    int var56 = this.method225(true, var48, var43, var45, var40 * var55 >> 12, var49, var44);
                    arg2[var54] = var39 * var56 >> 12;
                }
            }
            return;
        }
        short var6 = this.field366[0];
        if (var6 > 8 || var6 < -8) {
            int var7 = this.field356[0] << 12;
            int var8 = this.field362 * var7 >> 12;
            int var9 = var4 * var7 >> 12;
            int var10 = this.field365 * var7 >> 12;
            int var11 = var9 >> 12;
            int var12 = var9 & 0xFFF;
            int var13 = this.field358[var11 & 0xFF] & 0xFF;
            int var14 = class265.field4625[var12];
            int var15 = var11 + 1;
            if (var10 <= var15) {
                var15 = 0;
            }
            int var16 = this.field358[var15 & 0xFF] & 0xFF;
            for (int var17 = 0; var17 < class190.field3362; var17++) {
                int var18 = class166.field2822[var17] * this.field362;
                int var19 = this.method225(true, var13, var12, var8, var7 * var18 >> 12, var16, var14);
                arg2[var17] = var6 * var19 >> 12;
            }
        }
        for (int var20 = 1; var20 < this.field364; var20++) {
            short var21 = this.field366[var20];
            if (var21 > 8 || var21 < -8) {
                int var22 = this.field356[var20] << 12;
                int var23 = this.field362 * var22 >> 12;
                int var24 = this.field365 * var22 >> 12;
                int var25 = var4 * var22 >> 12;
                int var26 = var25 >> 12;
                int var27 = var26 + 1;
                int var28 = var25 & 0xFFF;
                if (var27 >= var24) {
                    var27 = 0;
                }
                int var29 = this.field358[var27 & 0xFF] & 0xFF;
                int var30 = class265.field4625[var28];
                int var31 = this.field358[var26 & 0xFF] & 0xFF;
                if (this.field348 && (this.field364 - 1) == var20) {
                    for (int var32 = 0; var32 < class190.field3362; var32++) {
                        int var33 = class166.field2822[var32] * this.field362;
                        int var34 = this.method225(true, var31, var28, var23, var22 * var33 >> 12, var29, var30);
                        int var35 = (var21 * var34 >> 12) + arg2[var32];
                        arg2[var32] = (var35 >> 1) + 2048;
                    }
                } else {
                    for (int var36 = 0; var36 < class190.field3362; var36++) {
                        int var37 = class166.field2822[var36] * this.field362;
                        int var38 = this.method225(true, var31, var28, var23, var22 * var37 >> 12, var29, var30);
                        arg2[var36] += var21 * var38 >> 12;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(I)V", line = 561)
    public final void method223(int arg0) {
        field352++;
        this.field358 = class86.method621(this.field355, arg0 - 11027);
        this.method224((byte) -10);
        for (int var2 = this.field364 - 1; var2 >= 1; var2--) {
            short var3 = this.field366[var2];
            if (var3 > 8 || var3 < -8) {
                break;
            }
            this.field364--;
        }
        if (arg0 != 11135) {
            field360 = -102;
        }
    }

    @OriginalMember(owner = "client!dl", name = "<init>", descriptor = "()V", line = 733)
    public class30() {
        super(0, true);
    }

    @OriginalMember(owner = "client!dl", name = "h", descriptor = "(B)V", line = 601)
    private final void method224(byte arg0) {
        if (arg0 != -10) {
            this.method225(true, -28, -79, -33, 96, -79, 17);
        }
        field367++;
        if (this.field357 > 0) {
            this.field366 = new short[this.field364];
            this.field356 = new short[this.field364];
            for (int var2 = 0; var2 < this.field364; var2++) {
                this.field366[var2] = (short) ((int) (Math.pow((double) ((float) this.field357 / 4096.0F), (double) var2) * 4096.0D));
                this.field356[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
            }
        } else if (this.field366 != null && this.field366.length == this.field364) {
            this.field356 = new short[this.field364];
            for (int var3 = 0; var3 < this.field364; var3++) {
                this.field356[var3] = (short) ((int) Math.pow(2.0D, (double) var3));
            }
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(ZIIIIII)I", line = 642)
    private final int method225(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field351++;
        int var8 = arg2 - 4096;
        int var9 = arg4 >> 12;
        int var10 = var9 + 1;
        if (!arg0) {
            this.field356 = (short[]) null;
        }
        int var11 = arg4 & 0xFFF;
        int var12 = var9 & 0xFF;
        int var13 = this.field358[var12 + arg1] & 0x3;
        int var14 = var11 - 4096;
        int var15;
        if (var13 > 1) {
            var15 = var13 == 2 ? var11 - arg2 : -arg2 + -var11;
        } else {
            var15 = var13 == 0 ? arg2 + var11 : -var11 + arg2;
        }
        int var16 = class265.field4625[var11];
        if (arg3 <= var10) {
            var10 = 0;
        }
        int var17 = var10 & 0xFF;
        int var18 = this.field358[arg1 + var17] & 0x3;
        int var19;
        if (var18 > 1) {
            var19 = var18 == 2 ? var14 - arg2 : -arg2 + -var14;
        } else {
            var19 = var18 == 0 ? arg2 + var14 : arg2 - var14;
        }
        int var20 = var15 + ((var19 - var15) * var16 >> 12);
        int var21 = this.field358[var12 + arg5] & 0x3;
        int var22;
        if (var21 <= 1) {
            var22 = var21 == 0 ? var8 + var11 : -var11 + var8;
        } else {
            var22 = var21 == 2 ? var11 - var8 : -var8 + -var11;
        }
        int var23 = this.field358[arg5 + var17] & 0x3;
        int var24;
        if (var23 <= 1) {
            var24 = var23 == 0 ? var8 + var14 : -var14 + var8;
        } else {
            var24 = var23 == 2 ? var14 - var8 : -var14 - var8;
        }
        int var25 = ((var24 - var22) * var16 >> 12) + var22;
        return var20 + ((var25 - var20) * arg6 >> 12);
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(Lrk;III)V", line = 737)
    public static final void method226(class123 arg0, int arg1, int arg2, int arg3) {
        if (arg2 < class23.field277) {
            class228 var4 = class178.field3180[arg1][arg2 + 1][arg3];
            if (var4 != null && var4.field3931 != null && var4.field3931.field4310.method709()) {
                arg0.method711(var4.field3931.field4310, 128, 0, 0, true);
            }
        }
        if (arg3 < class23.field277) {
            class228 var5 = class178.field3180[arg1][arg2][arg3 + 1];
            if (var5 != null && var5.field3931 != null && var5.field3931.field4310.method709()) {
                arg0.method711(var5.field3931.field4310, 0, 0, 128, true);
            }
        }
        if (arg2 < class23.field277 && arg3 < class290.field4995) {
            class228 var6 = class178.field3180[arg1][arg2 + 1][arg3 + 1];
            if (var6 != null && var6.field3931 != null && var6.field3931.field4310.method709()) {
                arg0.method711(var6.field3931.field4310, 128, 0, 128, true);
            }
        }
        if (arg2 < class23.field277 && arg3 > 0) {
            class228 var7 = class178.field3180[arg1][arg2 + 1][arg3 - 1];
            if (var7 != null && var7.field3931 != null && var7.field3931.field4310.method709()) {
                arg0.method711(var7.field3931.field4310, 128, 0, -128, true);
            }
        }
    }
}
