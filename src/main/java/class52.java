import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jv")
public class class52 {

    @OriginalMember(owner = "client!jv", name = "m", descriptor = "[I")
    private int[] field776;

    @OriginalMember(owner = "client!jv", name = "k", descriptor = "[I")
    private int[] field774;

    @OriginalMember(owner = "client!jv", name = "c", descriptor = "[I")
    public static int[] field766 = new int[500];

    @OriginalMember(owner = "client!jv", name = "q", descriptor = "I")
    public static int field780;

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "I")
    private int field764;

    @OriginalMember(owner = "client!jv", name = "b", descriptor = "I")
    private int field765;

    @OriginalMember(owner = "client!jv", name = "d", descriptor = "I")
    public static int field767;

    @OriginalMember(owner = "client!jv", name = "e", descriptor = "I")
    private int field768;

    @OriginalMember(owner = "client!jv", name = "f", descriptor = "I")
    public static int field769;

    @OriginalMember(owner = "client!jv", name = "g", descriptor = "I")
    private int field770;

    @OriginalMember(owner = "client!jv", name = "h", descriptor = "I")
    public static int field771;

    @OriginalMember(owner = "client!jv", name = "i", descriptor = "I")
    public static int field772;

    @OriginalMember(owner = "client!jv", name = "j", descriptor = "I")
    public static int field773;

    @OriginalMember(owner = "client!jv", name = "l", descriptor = "I")
    public static int field775;

    @OriginalMember(owner = "client!jv", name = "o", descriptor = "I")
    public static int field778;

    @OriginalMember(owner = "client!jv", name = "p", descriptor = "I")
    public static int field779;

    @OriginalMember(owner = "client!jv", name = "n", descriptor = "[[Z")
    public static boolean[][] field777;

    static {
        new class194("You can spot a Jagex moderator by the gold crown next to their name.", "Jagex-Mitarbeiter haben eine goldene Krone neben ihrem Namen.", "Vous pouvez reconnaître les modérateurs Jagex à la couronne dorée en regard de leur nom.", "Os moderadores da Jagex são identificados por uma coroa dourada próxima ao \u007fnome.");
        field780 = 0;
    }

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(B)V", line = 3)
    public static void method381(byte arg0) {
        field777 = null;
        if (arg0 != -83) {
            method387(null, 20);
        }
        field766 = null;
    }

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(I)V", line = 15)
    private final void method382(int arg0) {
        field767++;
        int var2 = -1640531527;
        int var3 = -1640531527;
        int var4 = -1640531527;
        int var5 = -1640531527;
        int var6 = -1640531527;
        int var7 = -1640531527;
        int var8 = -1640531527;
        int var9 = -1640531527;
        if (arg0 != 958) {
            return;
        }
        for (int var10 = 0; var10 < 4; var10++) {
            int var61 = var9 ^ var8 << 11;
            int var62 = var7 + var8;
            int var63 = var6 + var61;
            int var64 = var62 ^ var7 >>> 2;
            int var65 = var7 + var63;
            int var66 = var5 + var64;
            int var67 = var65 ^ var63 << 8;
            int var68 = var4 + var67;
            int var69 = var63 + var66;
            var6 = var69 ^ var66 >>> 16;
            int var70 = var66 + var68;
            int var71 = var3 + var6;
            var5 = var70 ^ var68 << 10;
            int var72 = var68 + var71;
            int var73 = var2 + var5;
            var4 = var72 ^ var71 >>> 4;
            int var74 = var4 + var61;
            int var75 = var71 + var73;
            var3 = var75 ^ var73 << 8;
            var8 = var3 + var64;
            int var76 = var73 + var74;
            var2 = var76 ^ var74 >>> 9;
            var9 = var8 + var74;
            var7 = var2 + var67;
        }
        for (int var11 = 0; var11 < 256; var11 += 8) {
            int var37 = this.field774[var11 + 4] + var5;
            int var38 = this.field774[var11 + 5] + var4;
            int var39 = this.field774[var11] + var9;
            int var40 = this.field774[var11 + 6] + var3;
            int var41 = this.field774[var11 + 3] + var6;
            int var42 = this.field774[var11 + 2] + var7;
            int var43 = this.field774[var11 + 1] + var8;
            int var44 = this.field774[var11 + 7] + var2;
            int var45 = var39 ^ var43 << 11;
            int var46 = var42 + var43;
            int var47 = var41 + var45;
            int var48 = var46 ^ var42 >>> 2;
            int var49 = var37 + var48;
            int var50 = var42 + var47;
            int var51 = var50 ^ var47 << 8;
            int var52 = var38 + var51;
            int var53 = var47 + var49;
            var6 = var53 ^ var49 >>> 16;
            int var54 = var6 + var40;
            int var55 = var49 + var52;
            var5 = var55 ^ var52 << 10;
            int var56 = var52 + var54;
            int var57 = var5 + var44;
            var4 = var56 ^ var54 >>> 4;
            int var58 = var54 + var57;
            int var59 = var4 + var45;
            var3 = var58 ^ var57 << 8;
            int var60 = var57 + var59;
            var8 = var3 + var48;
            var2 = var60 ^ var59 >>> 9;
            var7 = var2 + var51;
            var9 = var8 + var59;
            this.field776[var11] = var9;
            this.field776[var11 + 1] = var8;
            this.field776[var11 + 2] = var7;
            this.field776[var11 + 3] = var6;
            this.field776[var11 + 4] = var5;
            this.field776[var11 + 5] = var4;
            this.field776[var11 + 6] = var3;
            this.field776[var11 + 7] = var2;
        }
        for (int var12 = 0; var12 < 256; var12 += 8) {
            int var13 = this.field776[var12 + 6] + var3;
            int var14 = this.field776[var12 + 4] + var5;
            int var15 = this.field776[var12 + 5] + var4;
            int var16 = this.field776[var12 + 7] + var2;
            int var17 = this.field776[var12 + 2] + var7;
            int var18 = this.field776[var12 + 3] + var6;
            int var19 = this.field776[var12] + var9;
            int var20 = this.field776[var12 + 1] + var8;
            int var21 = var19 ^ var20 << 11;
            int var22 = var18 + var21;
            int var23 = var17 + var20;
            int var24 = var23 ^ var17 >>> 2;
            int var25 = var17 + var22;
            int var26 = var14 + var24;
            int var27 = var25 ^ var22 << 8;
            int var28 = var15 + var27;
            int var29 = var22 + var26;
            var6 = var29 ^ var26 >>> 16;
            int var30 = var26 + var28;
            int var31 = var6 + var13;
            var5 = var30 ^ var28 << 10;
            int var32 = var28 + var31;
            int var33 = var5 + var16;
            var4 = var32 ^ var31 >>> 4;
            int var34 = var4 + var21;
            int var35 = var31 + var33;
            var3 = var35 ^ var33 << 8;
            int var36 = var33 + var34;
            var8 = var3 + var24;
            var2 = var36 ^ var34 >>> 9;
            var9 = var8 + var34;
            var7 = var2 + var27;
            this.field776[var12] = var9;
            this.field776[var12 + 1] = var8;
            this.field776[var12 + 2] = var7;
            this.field776[var12 + 3] = var6;
            this.field776[var12 + 4] = var5;
            this.field776[var12 + 5] = var4;
            this.field776[var12 + 6] = var3;
            this.field776[var12 + 7] = var2;
        }
        this.method383(-697128318);
        this.field768 = 256;
    }

    @OriginalMember(owner = "client!jv", name = "b", descriptor = "(I)V", line = 167)
    private final void method383(int arg0) {
        field771++;
        this.field770 += ++this.field764;
        for (int var2 = 0; var2 < 256; var2++) {
            int var3 = this.field776[var2];
            if ((var2 & 0x2) == 0) {
                if ((var2 & 0x1) == 0) {
                    this.field765 ^= this.field765 << 13;
                } else {
                    this.field765 ^= this.field765 >>> 6;
                }
            } else if ((var2 & 0x1) == 0) {
                this.field765 ^= this.field765 << 2;
            } else {
                this.field765 ^= this.field765 >>> 16;
            }
            this.field765 += this.field776[var2 + 128 & 0xFF];
            int var4;
            this.field776[var2] = var4 = this.field770 + (this.field776[class500.method3013(var3, 1020) >> 2] + this.field765);
            this.field774[var2] = this.field770 = var3 + this.field776[class500.method3013(255, var4 >> 8 >> 2)];
        }
        if (arg0 != -697128318) {
            method385(111, null, null);
        }
    }

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(ILtb;ZI)V", line = 211)
    public static final void method384(int arg0, class262 arg1, boolean arg2, int arg3) {
        field775++;
        if (arg1 == null || class230.field3220.field5018 == arg1) {
            return;
        }
        int var4 = arg1.field3734;
        int var5 = arg1.field3735;
        int var6 = arg1.field3737;
        int var7 = (int) arg1.field3733;
        if (var6 >= 2000) {
            var6 -= 2000;
        }
        long var8 = arg1.field3733;
        if (var6 == 6) {
            class295.field4313 = 2;
            class57.field885 = arg3;
            class140.field1838++;
            class166.field2177 = 0;
            class38.field592 = arg0;
            class386.method2321(arg2, class245.field3522);
            class79.field1108.method987(class455.field6637 + var4, (byte) 6);
            class79.field1108.method947(-57, class489.field7484.method1877(-91, 82) ? 1 : 0);
            class79.field1108.method987(var7, (byte) 6);
            class79.field1108.method961(class223.field3158 + var5, 1608339368);
            class364.method2224(var4, var5, 32766);
        }
        if (var6 == 8) {
            class313 var10 = class262.field3742[var7];
            if (var10 != null) {
                class166.field2177 = 0;
                class295.field4313 = 2;
                class57.field885 = arg3;
                class38.field592 = arg0;
                class28.field465++;
                class386.method2321(arg2, class61.field908);
                class79.field1108.method972(var7, -128);
                class79.field1108.method964(class489.field7484.method1877(124, 82) ? 1 : 0, 0);
                class230.method1404(true, true, var10.field4279[0], 0, var10.field4282[0], var10.method1773(-77), 0, var10.method1773(-40), -2);
            }
        }
        if (var6 == 4) {
            class139 var11 = class504.field7697[var7];
            if (var11 != null) {
                class295.field4313 = 2;
                class166.field2177 = 0;
                class38.field592 = arg0;
                class456.field6648++;
                class57.field885 = arg3;
                class386.method2321(true, class465.field6731);
                class79.field1108.method989(128, class489.field7484.method1877(-8, 82) ? 1 : 0);
                class79.field1108.method944(true, var7);
                class230.method1404(true, arg2, var11.field4279[0], 0, var11.field4282[0], var11.method1773(-9), 0, var11.method1773(-83), -2);
            }
        }
        if (var6 == 1009) {
            class57.field885 = arg3;
            class166.field2177 = 0;
            class295.field4313 = 2;
            class38.field592 = arg0;
            class139 var12 = class504.field7697[var7];
            if (var12 != null) {
                class272 var13 = var12.field1825;
                if (var13.field3797 != null) {
                    var13 = var13.method1656(class453.field6591, -49);
                }
                if (var13 != null) {
                    class386.method2321(arg2, class363.field5453);
                    class166.field2169++;
                    class79.field1108.method961(var13.field3850, 1608339368);
                }
            }
        }
        if (var6 == 1002) {
            class38.field592 = arg0;
            class166.field2177 = 0;
            class358.field5309++;
            class295.field4313 = 2;
            class57.field885 = arg3;
            class386.method2321(arg2, class477.field6867);
            class79.field1108.method961(var7, 1608339368);
        }
        if (var6 == 30) {
            class139 var14 = class504.field7697[var7];
            if (var14 != null) {
                class57.field885 = arg3;
                class166.field2177 = 0;
                class38.field592 = arg0;
                class429.field6313++;
                class295.field4313 = 2;
                class386.method2321(true, class317.field4649);
                class79.field1108.method972(var7, -128);
                class79.field1108.method947(-61, class489.field7484.method1877(126, 82) ? 1 : 0);
                class230.method1404(true, true, var14.field4279[0], 0, var14.field4282[0], var14.method1773(-112), 0, var14.method1773(-91), -2);
            }
        }
        if (var6 == 58) {
            if (class118.field1535 > 0 && class489.field7484.method1877(125, 82) && class489.field7484.method1877(127, 81)) {
                class508.method3060(class223.field3158 + var5, class455.field6637 + var4, (byte) -73, class415.field6145.field2956);
            } else {
                class435.method2569(var7, false, var5, var4);
                if (var7 == 1) {
                    class79.field1108.method947(-116, -1);
                    class79.field1108.method947(-74, -1);
                    class79.field1108.method961((int) class506.field7722, 1608339368);
                    class79.field1108.method947(-40, 57);
                    class79.field1108.method947(-126, class280.field4003);
                    class79.field1108.method947(-109, class498.field7587);
                    class79.field1108.method947(-109, 89);
                    class79.field1108.method961(class415.field6145.field2959, 1608339368);
                    class79.field1108.method961(class415.field6145.field2966, 1608339368);
                    class79.field1108.method947(-40, 63);
                } else {
                    class38.field592 = arg0;
                    class57.field885 = arg3;
                    class295.field4313 = 1;
                    class166.field2177 = 0;
                }
                class230.method1404(true, arg2, var4, 0, var5, 1, 0, 1, -4);
            }
        }
        if (var6 == 51) {
            class139 var15 = class504.field7697[var7];
            if (var15 != null) {
                class295.field4313 = 2;
                class57.field885 = arg3;
                class166.field2177 = 0;
                class440.field6426++;
                class38.field592 = arg0;
                class386.method2321(true, class510.field7754);
                class79.field1108.method972(var7, -128);
                class79.field1108.method947(-30, class489.field7484.method1877(-112, 82) ? 1 : 0);
                class230.method1404(true, true, var15.field4279[0], 0, var15.field4282[0], var15.method1773(-30), 0, var15.method1773(-50), -2);
            }
        }
        if (var6 == 1004) {
            class295.field4313 = 2;
            class166.field2177 = 0;
            class507.field7726++;
            class38.field592 = arg0;
            class57.field885 = arg3;
            class386.method2321(true, class403.field5934);
            class79.field1108.method961(var7, 1608339368);
        }
        if (var6 == 49) {
            class57.field885 = arg3;
            class166.field2177 = 0;
            class137.field1789++;
            class38.field592 = arg0;
            class295.field4313 = 2;
            class386.method2321(true, class193.field2737);
            class79.field1108.method961((int) (var8 >>> 32) & Integer.MAX_VALUE, 1608339368);
            class79.field1108.method961(class455.field6637 + var4, 1608339368);
            class79.field1108.method947(-128, class489.field7484.method1877(123, 82) ? 1 : 0);
            class79.field1108.method972(class223.field3158 + var5, -128);
            class176.method1105(var8, var5, (byte) 56, var4);
        }
        if (var6 == 2) {
            class313 var16 = class262.field3742[var7];
            if (var16 != null) {
                class166.field2177 = 0;
                class38.field592 = arg0;
                class57.field885 = arg3;
                class295.field4313 = 2;
                class488.field7463++;
                class386.method2321(true, class348.field5033);
                class79.field1108.method989(128, class489.field7484.method1877(-16, 82) ? 1 : 0);
                class79.field1108.method987(var7, (byte) 6);
                class230.method1404(true, true, var16.field4279[0], 0, var16.field4282[0], var16.method1773(-21), 0, var16.method1773(-118), -2);
            }
        }
        if (var6 == 1010) {
            class295.field4313 = 2;
            class38.field592 = arg0;
            class57.field885 = arg3;
            class166.field2177 = 0;
            class3.field45++;
            class386.method2321(true, class466.field6743);
            class79.field1108.method972(class455.field6637 + var4, -128);
            class79.field1108.method944(true, Integer.MAX_VALUE & (int) (var8 >>> 32));
            class79.field1108.method944(true, class223.field3158 + var5);
            class79.field1108.method964(class489.field7484.method1877(-55, 82) ? 1 : 0, 0);
            class176.method1105(var8, var5, (byte) 94, var4);
        }
        if (var6 == 18) {
            class356 var17 = class236.method1433(var4, var5, (byte) 54);
            if (var17 != null) {
                class489.method2941(-1);
                class489 var18 = client.method1188(var17);
                class179.method1137(-1, var17, var18.field7482, var18.method2933(2015625216));
                class457.field6660 = class191.method1203(var17, (byte) 55);
                if (class457.field6660 == null) {
                    class457.field6660 = "Null";
                }
                class211.field2998 = var17.field5183 + "<col=ffffff>";
            }
            return;
        }
        if (var6 == 23) {
            class38.field592 = arg0;
            class295.field4313 = 2;
            class166.field2177 = 0;
            class57.field885 = arg3;
            class165.field2158++;
            class386.method2321(true, class94.field1265);
            class79.field1108.method961(class223.field3158 + var5, 1608339368);
            class79.field1108.method944(arg2, class71.field1052);
            class79.field1108.method987(class472.field6827, (byte) 6);
            class79.field1108.method987(var4 + class455.field6637, (byte) 6);
            class79.field1108.method961((int) (var8 >>> 32) & Integer.MAX_VALUE, 1608339368);
            class79.field1108.method969(19869, class303.field4394);
            class79.field1108.method989(128, class489.field7484.method1877(123, 82) ? 1 : 0);
            class176.method1105(var8, var5, (byte) 84, var4);
        }
        if (var6 == 12) {
            class57.field885 = arg3;
            class38.field592 = arg0;
            class166.field2177 = 0;
            class295.field4313 = 2;
            class392.field5805++;
            class386.method2321(true, class122.field1592);
            class79.field1108.method944(true, class455.field6637 + var4);
            class79.field1108.method961(class223.field3158 + var5, 1608339368);
            class79.field1108.method964(class489.field7484.method1877(-4, 82) ? 1 : 0, 0);
            class79.field1108.method961(Integer.MAX_VALUE & (int) (var8 >>> 32), 1608339368);
            class176.method1105(var8, var5, (byte) 89, var4);
        }
        if (var6 == 47) {
            class313 var19 = class262.field3742[var7];
            if (var19 != null) {
                class57.field885 = arg3;
                class295.field4313 = 2;
                class166.field2177 = 0;
                class360.field5341++;
                class38.field592 = arg0;
                class386.method2321(true, class176.field2415);
                class79.field1108.method987(var7, (byte) 6);
                class79.field1108.method964(class489.field7484.method1877(-38, 82) ? 1 : 0, 0);
                class230.method1404(true, arg2, var19.field4279[0], 0, var19.field4282[0], var19.method1773(-105), 0, var19.method1773(-78), -2);
            }
        }
        if (var6 == 46 && class319.field4688 == null) {
            class305.method1837(var5, 3, var4);
            class319.field4688 = class236.method1433(var4, var5, (byte) 70);
            class170.method1068(-83, class319.field4688);
        }
        if (var6 == 57) {
            class356 var20 = class236.method1433(var4, var5, (byte) 51);
            if (var20 != null) {
                class98.method594(var20, -1);
            }
        }
        if (var6 == 50) {
            class295.field4313 = 1;
            class166.field2177 = 0;
            class93.field1261++;
            class38.field592 = arg0;
            class57.field885 = arg3;
            class386.method2321(true, class415.field6142);
            class79.field1108.method944(arg2, class472.field6827);
            class79.field1108.method987(class223.field3158 + var5, (byte) 6);
            class79.field1108.method961(class71.field1052, 1608339368);
            class79.field1108.method972(class455.field6637 + var4, -128);
            class79.field1108.method969(19869, class303.field4394);
            class230.method1404(true, true, var4, 0, var5, 1, 0, 1, -4);
        }
        if (var6 == 10) {
            class313 var21 = class262.field3742[var7];
            if (var21 != null) {
                class295.field4313 = 2;
                class57.field885 = arg3;
                class148.field1920++;
                class166.field2177 = 0;
                class38.field592 = arg0;
                class386.method2321(true, class262.field3743);
                class79.field1108.method972(var7, -128);
                class79.field1108.method964(class489.field7484.method1877(-23, 82) ? 1 : 0, 0);
                class230.method1404(true, true, var21.field4279[0], 0, var21.field4282[0], var21.method1773(-85), 0, var21.method1773(-67), -2);
            }
        }
        if (var6 == 22) {
            class57.field885 = arg3;
            class211.field2992++;
            class295.field4313 = 2;
            class38.field592 = arg0;
            class166.field2177 = 0;
            class386.method2321(true, class220.field3104);
            class79.field1108.method987(class71.field1052, (byte) 6);
            class79.field1108.method987(class472.field6827, (byte) 6);
            class79.field1108.method947(-40, class489.field7484.method1877(127, 82) ? 1 : 0);
            class79.field1108.method944(true, class415.field6145.field4262);
            class79.field1108.method992(-92, class303.field4394);
        }
        if (var6 == 5) {
            class313 var22 = class262.field3742[var7];
            if (var22 != null) {
                class211.field2992++;
                class57.field885 = arg3;
                class38.field592 = arg0;
                class166.field2177 = 0;
                class295.field4313 = 2;
                class386.method2321(true, class220.field3104);
                class79.field1108.method987(class71.field1052, (byte) 6);
                class79.field1108.method987(class472.field6827, (byte) 6);
                class79.field1108.method947(-94, class489.field7484.method1877(-109, 82) ? 1 : 0);
                class79.field1108.method944(arg2, var7);
                class79.field1108.method992(-113, class303.field4394);
                class230.method1404(true, true, var22.field4279[0], 0, var22.field4282[0], var22.method1773(-100), 0, var22.method1773(-92), -2);
            }
        }
        if (var6 == 15) {
            class295.field4313 = 2;
            class166.field2177 = 0;
            class38.field592 = arg0;
            class288.field4123++;
            class57.field885 = arg3;
            class386.method2321(true, class226.field3198);
            class79.field1108.method961(var4 + class455.field6637, 1608339368);
            class79.field1108.method947(-103, class489.field7484.method1877(-109, 82) ? 1 : 0);
            class79.field1108.method944(true, class223.field3158 + var5);
            class79.field1108.method987(var7, (byte) 6);
            class364.method2224(var4, var5, 32766);
        }
        if (!arg2) {
            field780 = 121;
        }
        if (var6 == 44) {
            class313 var23 = class262.field3742[var7];
            if (var23 != null) {
                class57.field885 = arg3;
                class38.field592 = arg0;
                class166.field2177 = 0;
                class295.field4313 = 2;
                class487.field7126++;
                class386.method2321(true, class403.field5939);
                class79.field1108.method972(var7, -128);
                class79.field1108.method945(-30, class489.field7484.method1877(124, 82) ? 1 : 0);
                class230.method1404(true, true, var23.field4279[0], 0, var23.field4282[0], var23.method1773(-35), 0, var23.method1773(-34), -2);
            }
        }
        if (var6 == 1012 || var6 == 1008 || var6 == 1001 || var6 == 1003 || var6 == 1006) {
            class116.method668(var4, arg2, var6, var7);
        }
        if (var6 == 59) {
            class139 var24 = class504.field7697[var7];
            if (var24 != null) {
                class166.field2177 = 0;
                class38.field592 = arg0;
                class295.field4313 = 2;
                class57.field885 = arg3;
                class30.field500++;
                class386.method2321(true, class70.field1032);
                class79.field1108.method947(-106, class489.field7484.method1877(-125, 82) ? 1 : 0);
                class79.field1108.method944(arg2, var7);
                class230.method1404(true, true, var24.field4279[0], 0, var24.field4282[0], var24.method1773(-51), 0, var24.method1773(-120), -2);
            }
        }
        if (var6 == 16) {
            class351.field5100++;
            class57.field885 = arg3;
            class295.field4313 = 2;
            class166.field2177 = 0;
            class38.field592 = arg0;
            class386.method2321(true, class295.field4290);
            class79.field1108.method987(var4 + class455.field6637, (byte) 6);
            class79.field1108.method945(-101, class489.field7484.method1877(-92, 82) ? 1 : 0);
            class79.field1108.method944(arg2, class223.field3158 + var5);
            class79.field1108.method961(var7, 1608339368);
            class364.method2224(var4, var5, 32766);
        }
        if (var6 == 25) {
            class57.field885 = arg3;
            class38.field592 = arg0;
            class166.field2177 = 0;
            class295.field4313 = 2;
            class252.field3636++;
            class386.method2321(true, class126.field1623);
            class79.field1108.method964(class489.field7484.method1877(127, 82) ? 1 : 0, 0);
            class79.field1108.method961(var7, 1608339368);
            class79.field1108.method972(class455.field6637 + var4, -128);
            class79.field1108.method944(arg2, class223.field3158 + var5);
            class364.method2224(var4, var5, 32766);
        }
        if (var6 == 19) {
            if (class118.field1535 > 0 && class489.field7484.method1877(-119, 82) && class489.field7484.method1877(-50, 81)) {
                class508.method3060(class223.field3158 + var5, class455.field6637 - -var4, (byte) -73, class415.field6145.field2956);
            } else {
                class57.field885 = arg3;
                class38.field592 = arg0;
                class295.field4313 = 1;
                class166.field2177 = 0;
                class134.field1703++;
                class386.method2321(true, class235.field3306);
                class79.field1108.method961(class223.field3158 + var5, 1608339368);
                class79.field1108.method972(class455.field6637 + var4, -128);
            }
        }
        if (var6 == 48) {
            class313 var25 = class262.field3742[var7];
            if (var25 != null) {
                class57.field885 = arg3;
                class38.field592 = arg0;
                class295.field4313 = 2;
                class492.field7521++;
                class166.field2177 = 0;
                class386.method2321(true, class250.field3606);
                class79.field1108.method945(-59, class489.field7484.method1877(-79, 82) ? 1 : 0);
                class79.field1108.method944(true, var7);
                class230.method1404(true, true, var25.field4279[0], 0, var25.field4282[0], var25.method1773(-43), 0, var25.method1773(-98), -2);
            }
        }
        if (var6 == 9) {
            class313 var26 = class262.field3742[var7];
            if (var26 != null) {
                class295.field4313 = 2;
                class210.field2958++;
                class166.field2177 = 0;
                class57.field885 = arg3;
                class38.field592 = arg0;
                class386.method2321(arg2, class464.field6729);
                class79.field1108.method989(128, class489.field7484.method1877(-82, 82) ? 1 : 0);
                class79.field1108.method961(var7, 1608339368);
                class230.method1404(true, true, var26.field4279[0], 0, var26.field4282[0], var26.method1773(-114), 0, var26.method1773(-116), -2);
            }
        }
        if (var6 == 11) {
            class295.field4313 = 2;
            class57.field885 = arg3;
            class166.field2177 = 0;
            class493.field7524++;
            class38.field592 = arg0;
            class386.method2321(true, class335.field4864);
            class79.field1108.method961(class455.field6637 + var4, 1608339368);
            class79.field1108.method987(var7, (byte) 6);
            class79.field1108.method944(arg2, class223.field3158 + var5);
            class79.field1108.method945(-128, class489.field7484.method1877(124, 82) ? 1 : 0);
            class364.method2224(var4, var5, 32766);
        }
        if (var6 == 17) {
            class57.field885 = arg3;
            class275.field3934++;
            class38.field592 = arg0;
            class295.field4313 = 2;
            class166.field2177 = 0;
            class386.method2321(true, class135.field1727);
            class79.field1108.method944(arg2, (int) (var8 >>> 32) & Integer.MAX_VALUE);
            class79.field1108.method947(-111, class489.field7484.method1877(123, 82) ? 1 : 0);
            class79.field1108.method961(class223.field3158 + var5, 1608339368);
            class79.field1108.method987(class455.field6637 + var4, (byte) 6);
            class176.method1105(var8, var5, (byte) 71, var4);
        }
        if (var6 == 45) {
            class339.field4937++;
            class57.field885 = arg3;
            class166.field2177 = 0;
            class295.field4313 = 2;
            class38.field592 = arg0;
            class386.method2321(arg2, class281.field4020);
            class79.field1108.method972(class223.field3158 + var5, -128);
            class79.field1108.method987(var7, (byte) 6);
            class79.field1108.method987(class472.field6827, (byte) 6);
            class79.field1108.method961(class71.field1052, 1608339368);
            class79.field1108.method964(class489.field7484.method1877(124, 82) ? 1 : 0, 0);
            class79.field1108.method944(true, class455.field6637 + var4);
            class79.field1108.method992(-108, class303.field4394);
            class364.method2224(var4, var5, 32766);
        }
        if (var6 == 21) {
            class313 var27 = class262.field3742[var7];
            if (var27 != null) {
                class166.field2177 = 0;
                class205.field2839++;
                class295.field4313 = 2;
                class38.field592 = arg0;
                class57.field885 = arg3;
                class386.method2321(true, class92.field1249);
                class79.field1108.method944(true, var7);
                class79.field1108.method947(-31, class489.field7484.method1877(-30, 82) ? 1 : 0);
                class230.method1404(true, true, var27.field4279[0], 0, var27.field4282[0], var27.method1773(-121), 0, var27.method1773(-76), -2);
            }
        }
        if (var6 == 13) {
            class139 var28 = class504.field7697[var7];
            if (var28 != null) {
                class57.field885 = arg3;
                class38.field592 = arg0;
                class230.field3217++;
                class166.field2177 = 0;
                class295.field4313 = 2;
                class386.method2321(true, class274.field3918);
                class79.field1108.method944(true, var7);
                class79.field1108.method989(128, class489.field7484.method1877(127, 82) ? 1 : 0);
                class230.method1404(true, true, var28.field4279[0], 0, var28.field4282[0], var28.method1773(-101), 0, var28.method1773(-82), -2);
            }
        }
        if (var6 == 60 || var6 == 1011) {
            class87.method547(var4, var5, arg1.field3732, 107, var7);
        }
        if (var6 == 20) {
            class139 var29 = class504.field7697[var7];
            if (var29 != null) {
                class166.field2177 = 0;
                class38.field592 = arg0;
                class165.field2160++;
                class295.field4313 = 2;
                class57.field885 = arg3;
                class386.method2321(arg2, class202.field2809);
                class79.field1108.method969(19869, class303.field4394);
                class79.field1108.method972(var7, -128);
                class79.field1108.method987(class472.field6827, (byte) 6);
                class79.field1108.method972(class71.field1052, -128);
                class79.field1108.method989(128, class489.field7484.method1877(-25, 82) ? 1 : 0);
                class230.method1404(true, true, var29.field4279[0], 0, var29.field4282[0], var29.method1773(-29), 0, var29.method1773(-106), -2);
            }
        }
        if (var6 == 3) {
            class295.field4313 = 2;
            class57.field885 = arg3;
            class201.field2793++;
            class38.field592 = arg0;
            class166.field2177 = 0;
            class386.method2321(true, class64.field960);
            class79.field1108.method944(true, var4 + class455.field6637);
            class79.field1108.method944(arg2, Integer.MAX_VALUE & (int) (var8 >>> 32));
            class79.field1108.method972(class223.field3158 + var5, -128);
            class79.field1108.method964(class489.field7484.method1877(125, 82) ? 1 : 0, 0);
            class176.method1105(var8, var5, (byte) 99, var4);
        }
        if (class288.field4128) {
            class489.method2941(-1);
        }
        if (class36.field564 != null && class300.field4350 == 0) {
            class170.method1068(-103, class36.field564);
        }
    }

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(ILcg;Lcg;)V", line = 933)
    public static final void method385(int arg0, class86 arg1, class86 arg2) {
        if (arg1.field1173 != null) {
            arg1.method536(false);
        }
        field779++;
        arg1.field1179 = arg2;
        if (arg0 == 0) {
            arg1.field1173 = arg2.field1173;
            arg1.field1173.field1179 = arg1;
            arg1.field1179.field1173 = arg1;
        }
    }

    @OriginalMember(owner = "client!jv", name = "b", descriptor = "(B)I", line = 952)
    public final int method386(byte arg0) {
        if (this.field768 == 0) {
            this.method383(-697128318);
            this.field768 = 256;
        }
        field773++;
        return arg0 > -18 ? -21 : this.field774[this.field768 - 1];
    }

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(Lso;I)I", line = 972)
    public static final int method387(class313 arg0, int arg1) {
        field769++;
        if (arg1 != 18) {
            return 23;
        }
        int var2 = arg0.field4563;
        class171 var3 = arg0.method1767(arg1 ^ 0x4111);
        if (arg0.field4209) {
            var2 = arg0.field4565;
        } else if (arg0.field4256 == var3.field2285 || arg0.field4256 == var3.field2302 || arg0.field4256 == var3.field2282 || arg0.field4256 == var3.field2306) {
            var2 = arg0.field4583;
        } else if (arg0.field4256 == var3.field2318 || arg0.field4256 == var3.field2314 || arg0.field4256 == var3.field2320 || arg0.field4256 == var3.field2299) {
            var2 = arg0.field4556;
        }
        return var2;
    }

    @OriginalMember(owner = "client!jv", name = "c", descriptor = "(I)I", line = 1003)
    public final int method388(int arg0) {
        field772++;
        if (arg0 != 82) {
            this.field765 = 107;
        }
        if (this.field768 == 0) {
            this.method383(-697128318);
            this.field768 = 256;
        }
        return this.field774[--this.field768];
    }

    @OriginalMember(owner = "client!jv", name = "<init>", descriptor = "()V", line = 1020)
    private class52() {
    }

    @OriginalMember(owner = "client!jv", name = "<init>", descriptor = "([I)V", line = 1027)
    public class52(int[] arg0) {
        this.field776 = new int[256];
        this.field774 = new int[256];
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field774[var2] = arg0[var2];
        }
        this.method382(958);
    }

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(IILih;Leq;Lqs;ILwd;I)V", line = 1048)
    public static final void method389(int arg0, int arg1, class474 arg2, class134 arg3, class410 arg4, int arg5, class170 arg6, int arg7) {
        field778++;
        if (arg7 != -21010) {
            field777 = null;
        }
        int var8 = arg4.field6011 - (arg1 / 2) - 5;
        int var9 = arg5 + 2;
        if (arg6.field2265 != 0) {
            arg3.method801(-6625, arg1 + 10, var9, arg6.field2265, var8, arg5 + (arg0 * arg2.method2774()) + 1 - var9);
        }
        if (arg6.field2279 != 0) {
            arg3.method806(arg6.field2279, arg1 + 10, var9, var8, (byte) 37, arg2.method2774() * arg0 + (arg5 - var9) + 1);
        }
        int var10 = arg6.field2237;
        if (arg4.field6015 && arg6.field2254 != -1) {
            var10 = arg6.field2254;
        }
        for (int var11 = 0; var11 < arg0; var11++) {
            String var12 = class161.field2098[var11];
            if ((arg0 - 1) > var11) {
                var12 = var12.substring(0, var12.length() - 4);
            }
            arg2.method2777(arg3, var12, arg4.field6011, arg5, var10, true);
            arg5 += arg2.method2774();
        }
    }
}
