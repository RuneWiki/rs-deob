import java.io.IOException;
import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dc")
public class class22 {

    @OriginalMember(owner = "client!dc", name = "d", descriptor = "I")
    public static int field588 = 0;

    @OriginalMember(owner = "client!dc", name = "g", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field591 = new CRC32();

    @OriginalMember(owner = "client!dc", name = "k", descriptor = "Lv;")
    public static class122 field595 = class55.method425(-105, ")3000");

    @OriginalMember(owner = "client!dc", name = "l", descriptor = "I")
    public static int field596 = 0;

    @OriginalMember(owner = "client!dc", name = "n", descriptor = "Lv;")
    public static class122 field598 = class55.method425(-122, "(U2");

    @OriginalMember(owner = "client!dc", name = "r", descriptor = "I")
    private static int field602 = 0;

    @OriginalMember(owner = "client!dc", name = "p", descriptor = "Lmc;")
    public static class75 field600 = new class75(4096);

    @OriginalMember(owner = "client!dc", name = "s", descriptor = "Lv;")
    private static class122 field603 = class55.method425(-108, "Your profile will be transferred in:");

    @OriginalMember(owner = "client!dc", name = "v", descriptor = "Lv;")
    public static class122 field606 = field603;

    @OriginalMember(owner = "client!dc", name = "u", descriptor = "Lv;")
    private static class122 field605 = class55.method425(-82, "Close");

    @OriginalMember(owner = "client!dc", name = "t", descriptor = "Lv;")
    public static class122 field604 = field605;

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "I")
    public static int field585;

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "I")
    public static int field586;

    @OriginalMember(owner = "client!dc", name = "c", descriptor = "I")
    public static int field587;

    @OriginalMember(owner = "client!dc", name = "e", descriptor = "I")
    public static int field589;

    @OriginalMember(owner = "client!dc", name = "f", descriptor = "I")
    public static int field590;

    @OriginalMember(owner = "client!dc", name = "h", descriptor = "I")
    public static int field592;

    @OriginalMember(owner = "client!dc", name = "i", descriptor = "I")
    public static int field593;

    @OriginalMember(owner = "client!dc", name = "j", descriptor = "I")
    public static int field594;

    @OriginalMember(owner = "client!dc", name = "q", descriptor = "I")
    public static int field601;

    @OriginalMember(owner = "client!dc", name = "o", descriptor = "Lrd;")
    public static class106 field599;

    @OriginalMember(owner = "client!dc", name = "m", descriptor = "Z")
    public static boolean field597;

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(Li;I)V", line = 3)
    public static final synchronized void method228(class48 arg0, int arg1) {
        if (arg1 != 8) {
            method232(33, (byte) 113);
        }
        field594++;
        class109.field2702 = arg0;
    }

    @OriginalMember(owner = "client!dc", name = "<init>", descriptor = "(I)V", line = 13)
    public class22(int arg0) {
        client.field447 = arg0;
        class55.field1434 = System.currentTimeMillis();
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "()V", line = 32)
    public void method229() {
        field587++;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "([II)V", line = 41)
    public static final synchronized void method230(int[] arg0, int arg1) {
        int var2 = 0;
        int var3 = arg1 - 7;
        while (var2 < var3) {
            arg0[var2++] = 0;
            arg0[var2++] = 0;
            arg0[var2++] = 0;
            arg0[var2++] = 0;
            arg0[var2++] = 0;
            arg0[var2++] = 0;
            arg0[var2++] = 0;
            arg0[var2++] = 0;
        }
        var3 += 7;
        while (var2 < var3) {
            arg0[var2++] = 0;
        }
        if (class109.field2702 != null) {
            class109.field2702.method205(arg0, 0, var3);
        }
        class29.method275(var3, 1622083330);
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(I)V", line = 68)
    public static void method231(int arg0) {
        field606 = null;
        field595 = null;
        field599 = null;
        field591 = null;
        field604 = null;
        field598 = null;
        field605 = null;
        if (arg0 != -10882) {
            method230(null, -42);
        }
        field600 = null;
        field603 = null;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(IB)V", line = 86)
    public static final synchronized void method232(int arg0, byte arg1) {
        field589++;
        if (arg1 <= 19) {
            method237((byte) -68, null);
        }
        if (class109.field2702 != null) {
            class109.field2702.method209(arg0);
        }
        class29.method275(arg0, 1622083330);
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(IILbd;)V", line = 100)
    public static final void method233(int arg0, int arg1, class11 arg2) {
        field590++;
        if (arg2.field343 < 128 || arg2.field349 < 128 || arg2.field343 >= 13184 || arg2.field349 >= 13184) {
            arg2.field312 = 0;
            arg2.field315 = -1;
            arg2.field288 = 0;
            arg2.field324 = -1;
            arg2.field343 = arg2.field287[0] * 128 + arg2.field317 * 64;
            arg2.field349 = arg2.field307[0] * 128 + arg2.field317 * 64;
            arg2.method107((byte) 123);
        }
        if (class70.field1828 == arg2 && (arg2.field343 < 1536 || arg2.field349 < 1536 || arg2.field343 >= 11776 || arg2.field349 >= 11776)) {
            arg2.field288 = 0;
            arg2.field312 = 0;
            arg2.field324 = -1;
            arg2.field315 = -1;
            arg2.field343 = arg2.field287[0] * 128 + arg2.field317 * 64;
            arg2.field349 = arg2.field307[0] * 128 + arg2.field317 * 64;
            arg2.method107((byte) 127);
        }
        if (arg2.field312 > class16.field396) {
            class24.method251(arg2, 64);
        } else if (class16.field396 <= arg2.field288) {
            class18.method172(327, arg2);
        } else {
            class120.method915(1, arg2);
        }
        class114.method873(arg2, -26006);
        int var3 = 45 / ((45 - arg1) / 41);
        client.method181(22174, arg2);
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(J)V", line = 151)
    public void method234(long arg0) {
        field592++;
    }

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "(I)Z", line = 161)
    public static final boolean method235(int arg0) {
        field585++;
        if (class66.field1686 == null) {
            return false;
        }
        try {
            int var1 = class66.field1686.method590((byte) -91);
            if (var1 == 0) {
                return false;
            }
            if (class131.field3158 == -1) {
                class66.field1686.method593(1, true, class14.field372.field1679, 0);
                class14.field372.field1617 = 0;
                class131.field3158 = class14.field372.method990(255);
                class74.field1969 = class56.field1482[class131.field3158];
                var1--;
            }
            if (class74.field1969 == -1) {
                if (var1 <= 0) {
                    return false;
                }
                class66.field1686.method593(1, true, class14.field372.field1679, 0);
                var1--;
                class74.field1969 = class14.field372.field1679[0] & 0xFF;
            }
            if (class74.field1969 == -2) {
                if (var1 <= 1) {
                    return false;
                }
                class66.field1686.method593(2, true, class14.field372.field1679, 0);
                var1 -= 2;
                class14.field372.field1617 = 0;
                class74.field1969 = class14.field372.method506((byte) -90);
            }
            if (class74.field1969 > var1) {
                return false;
            }
            class14.field372.field1617 = 0;
            class66.field1686.method593(class74.field1969, true, class14.field372.field1679, 0);
            class80.field2088 = 0;
            client.field465 = class126.field3056;
            class126.field3056 = class40.field1018;
            class40.field1018 = class131.field3158;
            if (class131.field3158 == 175) {
                class122 var2 = class14.field372.method490(-59);
                int var3 = class14.field372.method485((byte) -114);
                class36 var4 = class4.method65(var3, false);
                var4.field901 = var2;
                if (var3 >> 16 == class84.field2191[class43.field1146]) {
                    class62.field1588 = true;
                }
                class131.field3158 = -1;
                return true;
            }
            if (class131.field3158 == 7) {
                int var5 = class14.field372.method485((byte) -114);
                int var6 = class14.field372.method506((byte) -90);
                int var7 = class14.field372.method524((byte) 40);
                int var8 = class14.field372.method524((byte) 101);
                class36 var9 = class4.method65(var5, false);
                class131.field3158 = -1;
                var9.field923 = var7;
                var9.field893 = var6;
                var9.field946 = var8;
                return true;
            }
            if (class131.field3158 == 188) {
                class62.field1588 = true;
                int var10 = class14.field372.method487(arg0 + 15246);
                class36 var11 = class4.method65(var10, false);
                int var12 = class14.field372.method506((byte) -90);
                for (int var13 = 0; var13 < var12; var13++) {
                    int var14 = class14.field372.method520(-123);
                    if (var14 == 255) {
                        var14 = class14.field372.method485((byte) -114);
                    }
                    var11.field897[var13] = class14.field372.method524((byte) 93);
                    var11.field942[var13] = var14;
                }
                for (int var15 = var12; var15 < var11.field897.length; var15++) {
                    var11.field897[var15] = 0;
                    var11.field942[var15] = 0;
                }
                class131.field3158 = -1;
                return true;
            }
            if (class131.field3158 == 225) {
                class19.field508 = class14.field372.method520(-112);
                class131.field3158 = -1;
                return true;
            }
            if (class131.field3158 == 38) {
                int var16 = class14.field372.method506((byte) -90);
                int var17 = class14.field372.method489(255);
                class36 var18 = class4.method65(var17, false);
                if (var18 != null && var18.field941 == 0) {
                    if (var16 < 0) {
                        var16 = 0;
                    }
                    if (var16 > var18.field947 - var18.field955) {
                        var16 = var18.field947 - var18.field955;
                    }
                    var18.field879 = var16;
                }
                class131.field3158 = -1;
                return true;
            }
            if (class131.field3158 == 34) {
                class74.field1986 = true;
                class26.field689 = class14.field372.method520(-112);
                class24.field640 = class14.field372.method520(-117);
                class54.field1379 = class14.field372.method506((byte) -90);
                class21.field572 = class14.field372.method520(-122);
                class2.field71 = class14.field372.method520(-116);
                if (class2.field71 >= 100) {
                    int var19 = class26.field689 * 128 + 64;
                    int var20 = class24.field640 * 128 + 64;
                    int var21 = class108.method837((byte) 59, var19, var20, class34.field848) - class54.field1379;
                    int var22 = var21 - class29.field743;
                    int var23 = var19 - class115.field2809;
                    int var24 = var20 - class5.field135;
                    int var25 = (int) Math.sqrt((double) (var23 * var23 + var24 * var24));
                    class115.field2815 = (int) (Math.atan2((double) var22, (double) var25) * 325.949D) & 0x7FF;
                    class81.field2114 = (int) (Math.atan2((double) var23, (double) var24) * -325.949D) & 0x7FF;
                    if (class115.field2815 < 128) {
                        class115.field2815 = 128;
                    }
                    if (class115.field2815 > 383) {
                        class115.field2815 = 383;
                    }
                }
                class131.field3158 = -1;
                return true;
            }
            if (class131.field3158 == 1) {
                class62.field1588 = true;
                int var26 = class14.field372.method530((byte) 92);
                int var27 = class14.field372.method487(arg0 + 15246);
                int var28 = class14.field372.method497((byte) 8);
                class125.field3046[var26] = var27;
                class8.field198[var26] = var28;
                class42.field1124[var26] = 1;
                for (int var29 = 0; var29 < 98; var29++) {
                    if (class107.field2652[var29] <= var27) {
                        class42.field1124[var26] = var29 + 2;
                    }
                }
                class131.field3158 = -1;
                return true;
            }
            if (class131.field3158 == 137) {
                int var30 = class14.field372.method513(4);
                int var31 = class14.field372.method506((byte) -90);
                int var32 = class14.field372.method524((byte) -128);
                class36 var33 = class4.method65(var30, false);
                if (var31 == 65535) {
                    var33.field914 = 0;
                    class131.field3158 = -1;
                    return true;
                }
                class10 var34 = class5.method69(var31, false);
                class131.field3158 = -1;
                var33.field959 = var31;
                var33.field893 = var34.field272;
                var33.field914 = 4;
                var33.field946 = var34.field248 * 100 / var32;
                var33.field923 = var34.field269;
                return true;
            }
            if (class131.field3158 == 135) {
                int var35 = class14.field372.method508(-87);
                class32.method289(var35, 0);
                if (class109.field2698 != -1) {
                    class16.method160(0, class109.field2698);
                    class109.field2698 = -1;
                    class114.field2796 = true;
                    class62.field1588 = true;
                }
                if (class108.field2676 != -1) {
                    class16.method160(0, class108.field2676);
                    class108.field2676 = -1;
                    class76.method641(30, true);
                }
                if (class113.field2765 != -1) {
                    class16.method160(arg0 + 15118, class113.field2765);
                    class113.field2765 = -1;
                }
                if (class47.field1210 != -1) {
                    class16.method160(0, class47.field1210);
                    class47.field1210 = -1;
                }
                if (class6.field155 != var35) {
                    class16.method160(0, class6.field155);
                    class6.field155 = var35;
                }
                class131.field3158 = -1;
                class24.field664 = false;
                class103.field2558 = true;
                return true;
            }
            if (class131.field3158 == 149) {
                class72.field1851 = class14.field372.method502((byte) 44);
                class131.field3158 = -1;
                return true;
            }
            if (class131.field3158 == 54) {
                int var36 = class14.field372.method487(arg0 ^ 0xFFFFC472);
                int var37 = class14.field372.method508(arg0 ^ 0x3B69);
                class109.field2699[var37] = var36;
                if (class73.field1896[var37] != var36) {
                    class73.field1896[var37] = var36;
                    class33.method293(var37, (byte) 81);
                    class62.field1588 = true;
                    if (class51.field1323 != -1) {
                        class103.field2558 = true;
                    }
                }
                class131.field3158 = -1;
                return true;
            }
            if (class131.field3158 == 134) {
                if (class109.field2698 != -1) {
                    class16.method160(0, class109.field2698);
                    class62.field1588 = true;
                    class109.field2698 = -1;
                    class114.field2796 = true;
                }
                if (class6.field155 != -1) {
                    class16.method160(0, class6.field155);
                    class103.field2558 = true;
                    class6.field155 = -1;
                }
                if (class108.field2676 != -1) {
                    class16.method160(0, class108.field2676);
                    class108.field2676 = -1;
                    class76.method641(30, true);
                }
                if (class113.field2765 != -1) {
                    class16.method160(0, class113.field2765);
                    class113.field2765 = -1;
                }
                if (class47.field1210 != -1) {
                    class16.method160(0, class47.field1210);
                    class47.field1210 = -1;
                }
                class131.field3158 = -1;
                class24.field664 = false;
                if (class83.field2166 != 0) {
                    class83.field2166 = 0;
                    class103.field2558 = true;
                }
                return true;
            }
            if (class131.field3158 == 177) {
                class25.field683 = class74.field1969 / 8;
                for (int var38 = 0; var38 < class25.field683; var38++) {
                    class129.field3133[var38] = class14.field372.method510((byte) 99);
                }
                class131.field3158 = -1;
                return true;
            }
            if (class131.field3158 == 43) {
                class74.field1986 = false;
                for (int var39 = 0; var39 < 5; var39++) {
                    class21.field584[var39] = false;
                }
                class131.field3158 = -1;
                return true;
            }
            if (class131.field3158 == 55) {
                class40.field1010 = class14.field372.method520(-116);
                if (class40.field1010 == 1) {
                    class119.field2884 = class14.field372.method506((byte) -90);
                }
                if (class40.field1010 >= 2 && class40.field1010 <= 6) {
                    if (class40.field1010 == 2) {
                        class36.field909 = 64;
                        class52.field1333 = 64;
                    }
                    if (class40.field1010 == 3) {
                        class36.field909 = 0;
                        class52.field1333 = 64;
                    }
                    if (class40.field1010 == 4) {
                        class36.field909 = 128;
                        class52.field1333 = 64;
                    }
                    if (class40.field1010 == 5) {
                        class52.field1333 = 0;
                        class36.field909 = 64;
                    }
                    if (class40.field1010 == 6) {
                        class52.field1333 = 128;
                        class36.field909 = 64;
                    }
                    class40.field1010 = 2;
                    class52.field1343 = class14.field372.method506((byte) -90);
                    class93.field2378 = class14.field372.method506((byte) -90);
                    class38.field996 = class14.field372.method520(-128);
                }
                if (class40.field1010 == 10) {
                    class67.field1736 = class14.field372.method506((byte) -90);
                }
                class131.field3158 = -1;
                return true;
            }
            if (class131.field3158 == 25) {
                class100.method764((byte) 111);
                class131.field3158 = -1;
                return true;
            }
            if (class131.field3158 == 152) {
                int var40 = class14.field372.method481(68);
                if (var40 >= 0) {
                    class32.method289(var40, 0);
                }
                if (class82.field2133 != var40) {
                    class16.method160(0, class82.field2133);
                    class82.field2133 = var40;
                }
                class131.field3158 = -1;
                return true;
            }
            if (class131.field3158 == 212) {
                boolean var41 = class14.field372.method497((byte) 8) == 1;
                int var42 = class14.field372.method485((byte) -114);
                class36 var43 = class4.method65(var42, false);
                class131.field3158 = -1;
                var43.field943 = var41;
                return true;
            }
            if (class131.field3158 == 161) {
                int var44 = class14.field372.method505(115);
                if (class51.field1323 != var44) {
                    class16.method160(0, class51.field1323);
                    class51.field1323 = var44;
                }
                class103.field2558 = true;
                class131.field3158 = -1;
                return true;
            }
            if (class131.field3158 == 190) {
                int var45 = class14.field372.method508(-86);
                byte var46 = class14.field372.method482(0);
                class109.field2699[var45] = var46;
                if (class73.field1896[var45] != var46) {
                    class73.field1896[var45] = var46;
                    class33.method293(var45, (byte) 99);
                    if (class51.field1323 != -1) {
                        class103.field2558 = true;
                    }
                    class62.field1588 = true;
                }
                class131.field3158 = -1;
                return true;
            }
            if (class131.field3158 == 123) {
                int var47 = class14.field372.method489(255);
                class36 var48 = class4.method65(var47, false);
                var48.field914 = 3;
                var48.field959 = class70.field1828.field1432.method733(-99);
                class131.field3158 = -1;
                return true;
            }
            if (class131.field3158 == 168) {
                class47.field1214 = class14.field372.method497((byte) 8);
                class73.field1887 = class14.field372.method494(255);
                class131.field3158 = -1;
                return true;
            }
            if (class131.field3158 == 140) {
                class74.field1986 = true;
                class118.field2850 = class14.field372.method520(arg0 + 14998);
                class76.field2038 = class14.field372.method520(arg0 + 15007);
                class122.field2966 = class14.field372.method506((byte) -90);
                class45.field1163 = class14.field372.method520(arg0 ^ 0x3B62);
                class55.field1414 = class14.field372.method520(-127);
                if (class55.field1414 >= 100) {
                    class5.field135 = class76.field2038 * 128 + 64;
                    class115.field2809 = class118.field2850 * 128 + 64;
                    class29.field743 = class108.method837((byte) 59, class115.field2809, class5.field135, class34.field848) - class122.field2966;
                }
                class131.field3158 = -1;
                return true;
            }
            if (class131.field3158 == 229) {
                class113.method863(-1, true);
                class131.field3158 = -1;
                return true;
            }
            if (class131.field3158 == 80) {
                int var49 = class14.field372.method508(arg0 ^ 0x3B6C);
                int var50 = class14.field372.method524((byte) 119);
                class32.method289(var49, arg0 ^ 0xFFFFC4F2);
                if (var50 != -1) {
                    class32.method289(var50, 0);
                }
                if (class47.field1210 != -1) {
                    class16.method160(0, class47.field1210);
                    class47.field1210 = -1;
                }
                if (class109.field2698 != -1) {
                    class16.method160(0, class109.field2698);
                    class109.field2698 = -1;
                }
                if (class6.field155 != -1) {
                    class16.method160(0, class6.field155);
                    class6.field155 = -1;
                }
                if (class108.field2676 != var49) {
                    class16.method160(0, class108.field2676);
                    class108.field2676 = var49;
                    class76.method641(35, true);
                }
                if (class113.field2765 != var49) {
                    class16.method160(0, class113.field2765);
                    class113.field2765 = var50;
                }
                class24.field664 = false;
                class131.field3158 = -1;
                class83.field2166 = 0;
                return true;
            }
            if (class131.field3158 == 184) {
                class33.method299(arg0 + 15118);
                class131.field3158 = -1;
                return true;
            }
            if (class131.field3158 == 238) {
                for (int var51 = 0; var51 < class73.field1896.length; var51++) {
                    if (class73.field1896[var51] != class109.field2699[var51]) {
                        class73.field1896[var51] = class109.field2699[var51];
                        class33.method293(var51, (byte) 81);
                        class62.field1588 = true;
                    }
                }
                class131.field3158 = -1;
                return true;
            }
            if (class131.field3158 == 3) {
                int var52 = class14.field372.method520(-117);
                int var53 = class14.field372.method520(arg0 ^ 0x3B79);
                int var54 = class14.field372.method520(-125);
                int var55 = class14.field372.method520(-121);
                class21.field584[var52] = true;
                class18.field432[var52] = var53;
                class103.field2541[var52] = var54;
                class41.field1044[var52] = var55;
                class74.field1998[var52] = 0;
                class131.field3158 = -1;
                return true;
            }
            if (class131.field3158 == 239) {
                int var56 = class14.field372.method508(-124);
                if (var56 == 65535) {
                    var56 = -1;
                }
                if (var56 == -1 && class66.field1708 == 0) {
                    class109.method847((byte) -124);
                } else if (var56 != -1 && class107.field2657 != var56 && class54.field1380 != 0 && class66.field1708 == 0) {
                    class109.method846(0, 0, -118, class93.field2396, class54.field1380, false, var56, 10);
                }
                class131.field3158 = -1;
                class107.field2657 = var56;
                return true;
            }
            if (class131.field3158 == 202) {
                int var57 = class14.field372.method524((byte) -16);
                if (var57 == 65535) {
                    var57 = -1;
                }
                int var58 = class14.field372.method529((byte) -59);
                if (class54.field1380 != 0 && var57 != -1) {
                    class109.method848(1, 20672, class34.field868, var57, class54.field1380, false, 0);
                    class66.field1708 = var58;
                }
                class131.field3158 = -1;
                return true;
            }
            if (class131.field3158 == 72) {
                class43.field1146 = class14.field372.method497((byte) 8);
                class131.field3158 = -1;
                class62.field1588 = true;
                class114.field2796 = true;
                return true;
            }
            if (class131.field3158 == 75) {
                int var59 = class14.field372.method481(86);
                int var60 = class14.field372.method513(4);
                class36 var61 = class4.method65(var60, false);
                if (var61.field924 != var59 || var59 == -1) {
                    var61.field958 = 0;
                    var61.field924 = var59;
                    var61.field876 = 0;
                }
                class131.field3158 = -1;
                return true;
            }
            if (class131.field3158 == 61) {
                class106.field2635 = 0;
                class131.field3158 = -1;
                return true;
            }
            if (class131.field3158 == 82) {
                long var62 = class14.field372.method510((byte) 104);
                int var64 = class14.field372.method506((byte) -90);
                class122 var65 = class24.method252(120, var62).method939(15365);
                for (int var66 = 0; var66 < class30.field764; var66++) {
                    if (class59.field1537[var66] == var62) {
                        if (class69.field1824[var66] != var64) {
                            class69.field1824[var66] = var64;
                            class62.field1588 = true;
                            if (var64 > 0) {
                                class55.method429(class51.field1287, 5, (byte) 48, class59.method454(new class122[] { var65, class120.field2908 }, 5176));
                            }
                            if (var64 == 0) {
                                class55.method429(class51.field1287, 5, (byte) 48, class59.method454(new class122[] { var65, class95.field2447 }, 5176));
                            }
                        }
                        var65 = null;
                        break;
                    }
                }
                if (var65 != null && class30.field764 < 200) {
                    class59.field1537[class30.field764] = var62;
                    class75.field2020[class30.field764] = var65;
                    class69.field1824[class30.field764] = var64;
                    class62.field1588 = true;
                    class30.field764++;
                }
                boolean var67 = false;
                while (!var67) {
                    var67 = true;
                    for (int var68 = 0; var68 < class30.field764 - 1; var68++) {
                        if (class69.field1824[var68] != class106.field2637 && class69.field1824[var68 + 1] == class106.field2637 || class69.field1824[var68] == 0 && class69.field1824[var68 + 1] != 0) {
                            int var69 = class69.field1824[var68];
                            class69.field1824[var68] = class69.field1824[var68 + 1];
                            var67 = false;
                            class69.field1824[var68 + 1] = var69;
                            class122 var70 = class75.field2020[var68];
                            class75.field2020[var68] = class75.field2020[var68 + 1];
                            class75.field2020[var68 + 1] = var70;
                            long var71 = class59.field1537[var68];
                            class59.field1537[var68] = class59.field1537[var68 + 1];
                            class59.field1537[var68 + 1] = var71;
                            class62.field1588 = true;
                        }
                    }
                }
                class131.field3158 = -1;
                return true;
            }
            if (class131.field3158 == 115) {
                int var73 = class14.field372.method487(arg0 ^ 0xFFFFC472);
                class36 var74 = class4.method65(var73, false);
                for (int var75 = 0; var75 < var74.field897.length; var75++) {
                    var74.field897[var75] = -1;
                    var74.field897[var75] = 0;
                }
                class131.field3158 = -1;
                return true;
            }
            if (class131.field3158 == 248) {
                int var76 = class14.field372.method508(arg0 + 15031);
                int var77 = class14.field372.method485((byte) -114);
                int var78 = class14.field372.method508(-99);
                class36 var79 = class4.method65(var77, false);
                var79.field910 = (var76 << 16) + var78;
                class131.field3158 = -1;
                return true;
            }
            if (class131.field3158 == 124) {
                long var80 = class14.field372.method510((byte) 95);
                long var82 = (long) class14.field372.method506((byte) -90);
                long var84 = (long) class14.field372.method503(65280);
                boolean var86 = false;
                long var87 = (var82 << 32) + var84;
                int var89 = class14.field372.method520(arg0 ^ 0x3B79);
                for (int var90 = 0; var90 < 100; var90++) {
                    if (class112.field2747[var90] == var87) {
                        var86 = true;
                        break;
                    }
                }
                if (var89 <= 1) {
                    for (int var91 = 0; var91 < class25.field683; var91++) {
                        if (class129.field3133[var91] == var80) {
                            var86 = true;
                            break;
                        }
                    }
                }
                if (!var86 && class23.field614 == 0) {
                    class112.field2747[field602] = var87;
                    field602 = (field602 + 1) % 100;
                    class122 var92 = class119.method912(false, class14.field372).method965((byte) -36);
                    if (var89 == 2 || var89 == 3) {
                        class55.method429(class59.method454(new class122[] { class26.field702, class24.method252(125, var80).method939(arg0 + 30483) }, 5176), 7, (byte) 48, var92);
                    } else if (var89 == 1) {
                        class55.method429(class59.method454(new class122[] { class41.field1029, class24.method252(-62, var80).method939(15365) }, 5176), 7, (byte) 48, var92);
                    } else {
                        class55.method429(class24.method252(126, var80).method939(arg0 ^ 0xFFFFF8F7), 3, (byte) 48, var92);
                    }
                }
                class131.field3158 = -1;
                return true;
            }
            if (class131.field3158 == 130) {
                int var93 = class14.field372.method487(arg0 ^ 0xFFFFC472);
                int var94 = class14.field372.method508(-115);
                class36 var95 = class4.method65(var93, false);
                int var96 = var94 >> 10 & 0x1F;
                int var97 = var94 >> 5 & 0x1F;
                class131.field3158 = -1;
                int var98 = var94 & 0x1F;
                var95.field918 = (var96 << 19) + (var97 << 11) + (var98 << 3);
                return true;
            }
            if (class131.field3158 == 27) {
                long var99 = class14.field372.method510((byte) 123);
                class122 var101 = class119.method912(false, class14.field372).method965((byte) -36);
                class55.method429(class24.method252(-32, var99).method939(15365), 6, (byte) 48, var101);
                class131.field3158 = -1;
                return true;
            }
            if (class131.field3158 == 170) {
                class47.field1214 = class14.field372.method520(-115);
                class73.field1887 = class14.field372.method520(-109);
                while (class74.field1969 > class14.field372.field1617) {
                    class131.field3158 = class14.field372.method520(-118);
                    class16.method153(42);
                }
                class131.field3158 = -1;
                return true;
            }
            if (class131.field3158 == 155) {
                class62.field1588 = true;
                int var102 = class14.field372.method487(128);
                class36 var103 = class4.method65(var102, false);
                while (class14.field372.field1617 < class74.field1969) {
                    int var104 = class14.field372.method486(125);
                    int var105 = class14.field372.method506((byte) -90);
                    int var106 = class14.field372.method520(-117);
                    if (var106 == 255) {
                        var106 = class14.field372.method487(arg0 + 15246);
                    }
                    if (var104 >= 0 && var104 < var103.field897.length) {
                        var103.field897[var104] = var105;
                        var103.field942[var104] = var106;
                    }
                }
                class131.field3158 = -1;
                return true;
            }
            if (class131.field3158 == 73) {
                class24.field643 = class14.field372.method530((byte) 92);
                if (class43.field1146 == class24.field643) {
                    if (class24.field643 == 3) {
                        class43.field1146 = 1;
                    } else {
                        class43.field1146 = 3;
                    }
                    class62.field1588 = true;
                }
                class131.field3158 = -1;
                return true;
            }
            if (class131.field3158 == 78) {
                class34.field842 = class14.field372.method520(-111);
                class131.field3158 = -1;
                return true;
            }
            if (class131.field3158 == 183) {
                class40.field1012 = class14.field372.method520(-121);
                class62.field1588 = true;
                class131.field3158 = -1;
                return true;
            }
            if (class131.field3158 == 139) {
                int var107 = class14.field372.method530((byte) 92);
                int var108 = class14.field372.method497((byte) 8);
                class122 var109 = class14.field372.method490(arg0 ^ 0xFFFFC495);
                if (var107 >= 1 && var107 <= 5) {
                    if (var109.method938(arg0 + 6932, class37.field986)) {
                        var109 = null;
                    }
                    class73.field1885[var107 - 1] = var109;
                    class91.field2337[var107 - 1] = var108 == 0;
                }
                class131.field3158 = -1;
                return true;
            }
            if (arg0 != -15118) {
                method230(null, 7);
            }
            if (class131.field3158 == 148) {
                int var110 = class14.field372.method513(4);
                class119.field2871 = class2.field70.method451(var110, -122);
                class131.field3158 = -1;
                return true;
            }
            if (class131.field3158 == 143) {
                class113.method863(-1, false);
                class131.field3158 = -1;
                return true;
            }
            if (class131.field3158 == 129) {
                class36.method317(arg0 ^ 0xFFFFC4BE);
                class131.field3158 = -1;
                return false;
            }
            if (class131.field3158 == 19) {
                int var111 = class14.field372.method506((byte) -90);
                class32.method289(var111, 0);
                if (class109.field2698 != -1) {
                    class16.method160(0, class109.field2698);
                    class114.field2796 = true;
                    class109.field2698 = -1;
                    class62.field1588 = true;
                }
                if (class6.field155 != -1) {
                    class16.method160(0, class6.field155);
                    class103.field2558 = true;
                    class6.field155 = -1;
                }
                if (class108.field2676 != -1) {
                    class16.method160(0, class108.field2676);
                    class108.field2676 = -1;
                    class76.method641(30, true);
                }
                if (class113.field2765 != -1) {
                    class16.method160(0, class113.field2765);
                    class113.field2765 = -1;
                }
                if (class47.field1210 != var111) {
                    class16.method160(0, class47.field1210);
                    class47.field1210 = var111;
                }
                class131.field3158 = -1;
                if (class83.field2166 != 0) {
                    class103.field2558 = true;
                    class83.field2166 = 0;
                }
                class24.field664 = false;
                return true;
            }
            if (class131.field3158 == 120) {
                class73.field1887 = class14.field372.method530((byte) 92);
                class47.field1214 = class14.field372.method520(-128);
                for (int var112 = class73.field1887; var112 < class73.field1887 + 8; var112++) {
                    for (int var113 = class47.field1214; var113 < class47.field1214 + 8; var113++) {
                        if (class50.field1260[class34.field848][var112][var113] != null) {
                            class50.field1260[class34.field848][var112][var113] = null;
                            class109.method849((byte) -74, var113, var112);
                        }
                    }
                }
                for (class5 var114 = (class5) class129.field3126.method311((byte) 74); var114 != null; var114 = (class5) class129.field3126.method302((byte) -59)) {
                    if (class73.field1887 <= var114.field118 && class73.field1887 + 8 > var114.field118 && class47.field1214 <= var114.field137 && var114.field137 < class47.field1214 + 8 && class34.field848 == var114.field136) {
                        var114.field121 = 0;
                    }
                }
                class131.field3158 = -1;
                return true;
            }
            if (class131.field3158 == 247) {
                for (int var115 = 0; var115 < class66.field1701; var115++) {
                    class26 var116 = class125.method987((byte) -127, var115);
                    if (var116 != null && var116.field694 == 0) {
                        class109.field2699[var115] = 0;
                        class73.field1896[var115] = 0;
                    }
                }
                class131.field3158 = -1;
                if (class51.field1323 != -1) {
                    class103.field2558 = true;
                }
                class62.field1588 = true;
                return true;
            }
            if (class131.field3158 == 142) {
                class18.field417 = class14.field372.method506((byte) -90) * 30;
                class131.field3158 = -1;
                return true;
            }
            if (class131.field3158 == 245) {
                class83.field2166 = 2;
                class103.field2558 = true;
                class51.field1318 = false;
                class51.field1312 = class51.field1287;
                class131.field3158 = -1;
                return true;
            }
            if (class131.field3158 == 254) {
                class6.method74(class2.field70, class14.field372, -88, class74.field1969);
                class131.field3158 = -1;
                return true;
            }
            if (class131.field3158 == 196 || class131.field3158 == 145 || class131.field3158 == 21 || class131.field3158 == 244 || class131.field3158 == 249 || class131.field3158 == 169 || class131.field3158 == 42 || class131.field3158 == 121 || class131.field3158 == 204 || class131.field3158 == 227 || class131.field3158 == 113) {
                class16.method153(arg0 + 15158);
                class131.field3158 = -1;
                return true;
            }
            if (class131.field3158 == 65) {
                int var117 = class14.field372.method501(-1653);
                int var118 = class14.field372.method481(-14);
                int var119 = class14.field372.method487(128);
                class36 var120 = class4.method65(var119, false);
                class131.field3158 = -1;
                var120.field934 = var120.field896 + var118;
                var120.field948 = var120.field874 + var117;
                return true;
            }
            if (class131.field3158 == 94) {
                int var121 = class14.field372.method530((byte) 92);
                int var122 = class14.field372.method506((byte) -90);
                if (var122 == 65535) {
                    var122 = -1;
                }
                if (class84.field2191[var121] != var122) {
                    class16.method160(0, class84.field2191[var121]);
                    class84.field2191[var121] = var122;
                }
                class62.field1588 = true;
                class131.field3158 = -1;
                class114.field2796 = true;
                return true;
            }
            if (class131.field3158 == 14) {
                int var123 = class14.field372.method506((byte) -90);
                int var124 = class14.field372.method513(arg0 + 15122);
                class36 var125 = class4.method65(var124, false);
                var125.field914 = 1;
                var125.field959 = var123;
                class131.field3158 = -1;
                return true;
            }
            if (class131.field3158 == 12) {
                class84.field2176 = class14.field372.method520(-115);
                class19.field496 = class14.field372.method520(-121);
                class36.field905 = class14.field372.method520(-124);
                class131.field3158 = -1;
                class41.field1035 = true;
                class103.field2558 = true;
                return true;
            }
            if (class131.field3158 == 53) {
                class122 var126 = class14.field372.method490(-74);
                if (var126.method949(-91, class6.field153)) {
                    class122 var138 = var126.method951(7835, var126.method955(24669, class51.field1292), 0);
                    long var139 = var138.method959(-1);
                    boolean var141 = false;
                    for (int var142 = 0; var142 < class25.field683; var142++) {
                        if (class129.field3133[var142] == var139) {
                            var141 = true;
                            break;
                        }
                    }
                    if (!var141 && class23.field614 == 0) {
                        class55.method429(var138, 4, (byte) 48, class83.field2149);
                    }
                } else if (var126.method949(arg0 ^ 0x3B57, class69.field1813)) {
                    class122 var133 = var126.method951(7835, var126.method955(arg0 + 39787, class51.field1292), 0);
                    boolean var134 = false;
                    long var135 = var133.method959(arg0 + 15117);
                    for (int var137 = 0; var137 < class25.field683; var137++) {
                        if (class129.field3133[var137] == var135) {
                            var134 = true;
                            break;
                        }
                    }
                    if (!var134 && class23.field614 == 0) {
                        class55.method429(var133, 8, (byte) 48, class14.field364);
                    }
                } else if (var126.method949(-91, class75.field2022)) {
                    class122 var127 = var126.method951(7835, var126.method955(24669, class51.field1292), 0);
                    long var128 = var127.method959(-1);
                    boolean var130 = false;
                    for (int var131 = 0; var131 < class25.field683; var131++) {
                        if (class129.field3133[var131] == var128) {
                            var130 = true;
                            break;
                        }
                    }
                    if (!var130 && class23.field614 == 0) {
                        class122 var132 = var126.method951(7835, var126.method946(70) - 9, var126.method955(24669, class51.field1292) + 1);
                        class55.method429(var127, 8, (byte) 48, var132);
                    }
                } else {
                    class55.method429(class51.field1287, 0, (byte) 48, var126);
                }
                class131.field3158 = -1;
                return true;
            }
            if (class131.field3158 == 119) {
                for (int var143 = 0; var143 < class125.field3043.length; var143++) {
                    if (class125.field3043[var143] != null) {
                        class125.field3043[var143].field324 = -1;
                    }
                }
                for (int var144 = 0; var144 < class94.field2423.length; var144++) {
                    if (class94.field2423[var144] != null) {
                        class94.field2423[var144].field324 = -1;
                    }
                }
                class131.field3158 = -1;
                return true;
            }
            if (class131.field3158 == 8) {
                class83.field2166 = 1;
                class51.field1312 = class51.field1287;
                class51.field1318 = false;
                class131.field3158 = -1;
                class103.field2558 = true;
                return true;
            }
            if (class131.field3158 == 48) {
                if (class43.field1146 == 12) {
                    class62.field1588 = true;
                }
                class61.field1557 = class14.field372.method501(-1653);
                class131.field3158 = -1;
                return true;
            }
            if (class131.field3158 == 141) {
                int var145 = class14.field372.method502((byte) 44);
                int var146 = class14.field372.method524((byte) -15);
                if (class6.field155 != -1) {
                    class16.method160(0, class6.field155);
                    class103.field2558 = true;
                    class6.field155 = -1;
                }
                if (class108.field2676 != -1) {
                    class16.method160(0, class108.field2676);
                    class108.field2676 = -1;
                    class76.method641(30, true);
                }
                if (class113.field2765 != -1) {
                    class16.method160(0, class113.field2765);
                    class113.field2765 = -1;
                }
                if (class47.field1210 != var145) {
                    class16.method160(0, class47.field1210);
                    class47.field1210 = var145;
                }
                if (class109.field2698 != var146) {
                    class16.method160(0, class109.field2698);
                    class109.field2698 = var146;
                }
                class62.field1588 = true;
                class114.field2796 = true;
                class24.field664 = false;
                if (class83.field2166 != 0) {
                    class103.field2558 = true;
                    class83.field2166 = 0;
                }
                class131.field3158 = -1;
                return true;
            }
            if (class131.field3158 == 236) {
                int var147 = class14.field372.method524((byte) 16);
                class32.method289(var147, 0);
                if (class6.field155 != -1) {
                    class16.method160(0, class6.field155);
                    class103.field2558 = true;
                    class6.field155 = -1;
                }
                if (class108.field2676 != -1) {
                    class16.method160(0, class108.field2676);
                    class108.field2676 = -1;
                    class76.method641(30, true);
                }
                if (class113.field2765 != -1) {
                    class16.method160(0, class113.field2765);
                    class113.field2765 = -1;
                }
                if (class47.field1210 != -1) {
                    class16.method160(0, class47.field1210);
                    class47.field1210 = -1;
                }
                if (class109.field2698 != var147) {
                    class16.method160(0, class109.field2698);
                    class109.field2698 = var147;
                }
                class62.field1588 = true;
                if (class83.field2166 != 0) {
                    class103.field2558 = true;
                    class83.field2166 = 0;
                }
                class24.field664 = false;
                class114.field2796 = true;
                class131.field3158 = -1;
                return true;
            }
            if (class131.field3158 == 157) {
                if (class43.field1146 == 12) {
                    class62.field1588 = true;
                }
                class40.field1019 = class14.field372.method520(-124);
                class131.field3158 = -1;
                return true;
            }
            if (class131.field3158 == 36) {
                int var148 = class14.field372.method506((byte) -90);
                int var149 = class14.field372.method520(-116);
                int var150 = class14.field372.method506((byte) -90);
                if (class56.field1465 != 0 && var149 != 0 && class83.field2151 < 50) {
                    class6.field149[class83.field2151] = var148;
                    class28.field722[class83.field2151] = var149;
                    class50.field1262[class83.field2151] = var150;
                    class10.field213[class83.field2151] = null;
                    class83.field2151++;
                }
                class131.field3158 = -1;
                return true;
            }
            if (class131.field3158 == 126) {
                int var151 = class14.field372.method487(128);
                int var152 = class14.field372.method524((byte) -126);
                class36 var153 = class4.method65(var151, false);
                var153.field959 = var152;
                var153.field914 = 2;
                class131.field3158 = -1;
                return true;
            }
            class84.method678("T1 - " + class131.field3158 + "," + class126.field3056 + "," + client.field465 + " - " + class74.field1969, null, 1);
            class36.method317(120);
        } catch (IOException var157) {
            class50.method399(0);
        } catch (Exception var158) {
            String var155 = "T2 - " + class131.field3158 + "," + class126.field3056 + "," + client.field465 + " - " + class74.field1969 + "," + (class70.field1828.field287[0] + class2.field77) + "," + (class70.field1828.field307[0] + class51.field1286) + " - ";
            for (int var156 = 0; class74.field1969 > var156 && var156 < 50; var156++) {
                var155 = var155 + class14.field372.field1679[var156] + ",";
            }
            class84.method678(var155, var158, 1);
            class36.method317(arg0 ^ 0xFFFFC48B);
        }
        return true;
    }

    @OriginalMember(owner = "client!dc", name = "c", descriptor = "(I)I", line = 1915)
    public static final int method236(int arg0) {
        field586++;
        int var1 = 3;
        if (class115.field2815 < 310) {
            int var2 = class115.field2809 >> 7;
            int var3 = class5.field135 >> 7;
            int var4 = class70.field1828.field343 >> 7;
            int var5;
            if (var2 >= var4) {
                var5 = var2 - var4;
            } else {
                var5 = var4 - var2;
            }
            if ((class54.field1408[class34.field848][var2][var3] & 0x4) != 0) {
                var1 = class34.field848;
            }
            int var6 = class70.field1828.field349 >> 7;
            int var7;
            if (var3 >= var6) {
                var7 = var3 - var6;
            } else {
                var7 = var6 - var3;
            }
            if (var7 < var5) {
                int var8 = var7 * 65536 / var5;
                int var9 = 32768;
                while (var2 != var4) {
                    if (var4 > var2) {
                        var2++;
                    } else if (var4 < var2) {
                        var2--;
                    }
                    var9 += var8;
                    if ((class54.field1408[class34.field848][var2][var3] & 0x4) != 0) {
                        var1 = class34.field848;
                    }
                    if (var9 >= 65536) {
                        var9 -= 65536;
                        if (var6 > var3) {
                            var3++;
                        } else if (var6 < var3) {
                            var3--;
                        }
                        if ((class54.field1408[class34.field848][var2][var3] & 0x4) != 0) {
                            var1 = class34.field848;
                        }
                    }
                }
            } else {
                int var10 = var5 * 65536 / var7;
                int var11 = 32768;
                while (var3 != var6) {
                    if (var6 > var3) {
                        var3++;
                    } else if (var3 > var6) {
                        var3--;
                    }
                    if ((class54.field1408[class34.field848][var2][var3] & 0x4) != 0) {
                        var1 = class34.field848;
                    }
                    var11 += var10;
                    if (var11 >= 65536) {
                        var11 -= 65536;
                        if (var2 < var4) {
                            var2++;
                        } else if (var2 > var4) {
                            var2--;
                        }
                        if ((class54.field1408[class34.field848][var2][var3] & 0x4) != 0) {
                            var1 = class34.field848;
                        }
                    }
                }
            }
        }
        if ((class54.field1408[class34.field848][class70.field1828.field343 >> 7][class70.field1828.field349 >> 7] & 0x4) != 0) {
            var1 = class34.field848;
        }
        if (arg0 != -8277) {
            field597 = true;
        }
        return var1;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(BLmb;)I", line = 2064)
    public static final int method237(byte arg0, class74 arg1) {
        int var2 = 0;
        if (arg1.method624(class89.field2285, -1, class59.field1529)) {
            var2++;
        }
        if (arg1.method624(class89.field2285, -1, class40.field1011)) {
            var2++;
        }
        field593++;
        if (arg1.method624(class89.field2285, arg0 - 31, class56.field1478)) {
            var2++;
        }
        if (arg1.method624(class89.field2285, -1, class32.field770)) {
            var2++;
        }
        if (arg1.method624(class89.field2285, -1, class112.field2730)) {
            var2++;
        }
        if (arg1.method624(class89.field2285, -1, client.field466)) {
            var2++;
        }
        if (arg1.method624(class89.field2285, arg0 - 31, class47.field1220)) {
            var2++;
        }
        if (arg1.method624(class89.field2285, arg0 - 31, class37.field990)) {
            var2++;
        }
        if (arg1.method624(class89.field2285, -1, class106.field2634)) {
            var2++;
        }
        if (arg1.method624(class89.field2285, -1, class36.field899)) {
            var2++;
        }
        if (arg0 != 30) {
            field600 = null;
        }
        if (arg1.method624(class89.field2285, -1, class100.field2513)) {
            var2++;
        }
        if (arg1.method624(class89.field2285, -1, class109.field2705)) {
            var2++;
        }
        if (arg1.method624(class89.field2285, -1, class45.field1174)) {
            var2++;
        }
        if (arg1.method624(class89.field2285, -1, class59.field1525)) {
            var2++;
        }
        if (arg1.method624(class89.field2285, arg0 - 31, class23.field638)) {
            var2++;
        }
        if (arg1.method624(class89.field2285, -1, class80.field2084)) {
            var2++;
        }
        if (arg1.method624(class89.field2285, arg0 ^ 0xFFFFFFE1, class112.field2727)) {
            var2++;
        }
        if (arg1.method624(class89.field2285, -1, class33.field825)) {
            var2++;
        }
        if (arg1.method624(class89.field2285, arg0 - 31, class94.field2417)) {
            var2++;
        }
        return var2;
    }
}
