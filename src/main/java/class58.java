import java.io.IOException;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ff")
public class class58 extends class16 {

    @OriginalMember(owner = "client!ff", name = "Z", descriptor = "I")
    private int field761 = 10;

    @OriginalMember(owner = "client!ff", name = "W", descriptor = "I")
    private int field758 = 2048;

    @OriginalMember(owner = "client!ff", name = "U", descriptor = "I")
    private int field756 = 0;

    @OriginalMember(owner = "client!ff", name = "bb", descriptor = "Z")
    public static boolean field763 = true;

    @OriginalMember(owner = "client!ff", name = "cb", descriptor = "[I")
    public static int[] field764 = new int[2];

    @OriginalMember(owner = "client!ff", name = "R", descriptor = "Ljava/util/Random;")
    public static Random field753 = new Random();

    @OriginalMember(owner = "client!ff", name = "S", descriptor = "I")
    public static int field754;

    @OriginalMember(owner = "client!ff", name = "T", descriptor = "I")
    public static int field755;

    @OriginalMember(owner = "client!ff", name = "V", descriptor = "I")
    public static int field757;

    @OriginalMember(owner = "client!ff", name = "X", descriptor = "I")
    public static int field759;

    @OriginalMember(owner = "client!ff", name = "ab", descriptor = "I")
    public static int field762;

    @OriginalMember(owner = "client!ff", name = "db", descriptor = "I")
    public static int field765;

    @OriginalMember(owner = "client!ff", name = "fb", descriptor = "I")
    public static int field767;

    @OriginalMember(owner = "client!ff", name = "gb", descriptor = "I")
    public static int field768;

    @OriginalMember(owner = "client!ff", name = "hb", descriptor = "I")
    public static int field769;

    @OriginalMember(owner = "client!ff", name = "Q", descriptor = "[I")
    public static int[] field752;

    @OriginalMember(owner = "client!ff", name = "Y", descriptor = "[I")
    private int[] field760;

    @OriginalMember(owner = "client!ff", name = "eb", descriptor = "[I")
    private int[] field766;

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "(ZI)[I", line = 6)
    public final int[] method8(boolean arg0, int arg1) {
        if (!arg0) {
            this.field758 = 87;
        }
        field768++;
        int[] var3 = this.field207.method1784(arg1, (byte) 102);
        if (this.field207.field4024) {
            int var4 = class130.field1921[arg1];
            if (this.field756 == 0) {
                short var5 = 0;
                for (int var6 = 0; var6 < this.field761; var6++) {
                    if (this.field760[var6] <= var4 && var4 < this.field760[var6 + 1]) {
                        if (var4 < this.field766[var6]) {
                            var5 = 4096;
                        }
                        break;
                    }
                }
                class213.method1551(var3, 0, class276.field4376, var5);
            } else {
                for (int var7 = 0; var7 < class276.field4376; var7++) {
                    int var8 = 0;
                    short var9 = 0;
                    int var10 = class27.field396[var7];
                    int var11 = this.field756;
                    if (var11 == 1) {
                        var8 = var10;
                    } else if (var11 == 2) {
                        var8 = (var4 + var10 - 4096 >> 1) + 2048;
                    } else if (var11 == 3) {
                        var8 = (var10 - var4 >> 1) + 2048;
                    }
                    for (int var12 = 0; var12 < this.field761; var12++) {
                        if (this.field760[var12] <= var8 && this.field760[var12 + 1] > var8) {
                            if (var8 < this.field766[var12]) {
                                var9 = 4096;
                            }
                            break;
                        }
                    }
                    var3[var7] = var9;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ff", name = "<init>", descriptor = "()V", line = 118)
    public class58() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "(II)I", line = 123)
    public static final int method405(int arg0, int arg1) {
        field767++;
        double var2 = (double) ((arg0 & 0xFFD736) >> 16) / 256.0D;
        double var4 = (double) ((arg0 & 0xFFF6) >> 8) / 256.0D;
        double var6 = (double) (arg0 & 0xFF) / 256.0D;
        double var8 = var2;
        if (var2 > var4) {
            var8 = var4;
        }
        if (var6 < var8) {
            var8 = var6;
        }
        double var10 = var2;
        if (var2 < var4) {
            var10 = var4;
        }
        if (var6 > var10) {
            var10 = var6;
        }
        double var12 = (var8 + var10) / 2.0D;
        double var14 = 0.0D;
        double var16 = 0.0D;
        if (var8 != var10) {
            if (var2 == var10) {
                var14 = (var4 - var6) / (var10 - var8);
            } else if (var4 == var10) {
                var14 = (var6 - var2) / (var10 - var8) + 2.0D;
            } else if (var6 == var10) {
                var14 = (var2 - var4) / (var10 - var8) + 4.0D;
            }
            if (var12 < 0.5D) {
                var16 = (var10 - var8) / (var8 + var10);
            }
            if (var12 >= 0.5D) {
                var16 = (var10 - var8) / (2.0D - var10 - var8);
            }
        }
        double var18 = var14 / 6.0D;
        int var20 = (int) (var12 * 256.0D);
        int var21 = (int) (var16 * 256.0D);
        if (~var21 > arg1) {
            var21 = 0;
        } else if (var21 > 255) {
            var21 = 255;
        }
        int var22 = (int) (var18 * 256.0D);
        if (var20 < 0) {
            var20 = 0;
        } else if (var20 > 255) {
            var20 = 255;
        }
        if (var20 > 243) {
            var21 >>= 0x4;
        } else if (var20 > 217) {
            var21 >>= 0x3;
        } else if (var20 > 192) {
            var21 >>= 0x2;
        } else if (var20 > 179) {
            var21 >>= 0x1;
        }
        return (var22 >> 2 << 10) + (var21 >> 5 << 7) + (var20 >> 1);
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(BLim;I)V", line = 227)
    public final void method52(byte arg0, class192 arg1, int arg2) {
        field754++;
        if (arg2 == 0) {
            this.field761 = arg1.method1399(-1172389784);
        } else if (arg2 == 1) {
            this.field758 = arg1.method1396(-79);
        } else if (arg2 == 2) {
            this.field756 = arg1.method1399(-1172389784);
        }
        if (arg0 != -7) {
            field753 = (Random) null;
        }
    }

    @OriginalMember(owner = "client!ff", name = "g", descriptor = "(I)V", line = 273)
    public static void method406(int arg0) {
        field752 = null;
        if (arg0 <= 42) {
            field763 = true;
        }
        field764 = null;
        field753 = null;
    }

    @OriginalMember(owner = "client!ff", name = "e", descriptor = "(B)Z", line = 286)
    public static final boolean method407(byte arg0) throws IOException {
        field757++;
        if (class69.field901 == null) {
            return false;
        }
        int var1 = class69.field901.method2100(0);
        if (var1 == 0) {
            return false;
        }
        if (class35.field459 == -1) {
            var1--;
            class69.field901.method2092(1, 15167, class336.field5213.field3128, 0);
            class336.field5213.field3129 = 0;
            class35.field459 = class336.field5213.method1537(255);
            class138.field2063 = class24.field348[class35.field459];
        }
        if (class138.field2063 == -1) {
            if (var1 <= 0) {
                return false;
            }
            var1--;
            class69.field901.method2092(1, 15167, class336.field5213.field3128, 0);
            class138.field2063 = class336.field5213.field3128[0] & 0xFF;
        }
        if (class138.field2063 == -2) {
            if (var1 <= 1) {
                return false;
            }
            var1 -= 2;
            class69.field901.method2092(2, 15167, class336.field5213.field3128, 0);
            class336.field5213.field3129 = 0;
            class138.field2063 = class336.field5213.method1396(-43);
        }
        if (class138.field2063 > var1) {
            return false;
        }
        class336.field5213.field3129 = 0;
        class69.field901.method2092(class138.field2063, arg0 + 15229, class336.field5213.field3128, 0);
        class151.field2320 = 0;
        class98.field1498 = class93.field1430;
        class93.field1430 = class229.field3648;
        class229.field3648 = class35.field459;
        if (class35.field459 == 36) {
            long var390 = class336.field5213.method1346(2);
            String var392 = class143.method999(class98.method695(class305.method2134(120, class336.field5213), false));
            class245.method1740((byte) -119, 6, class331.method2290((byte) 120, var390), var392);
            class35.field459 = -1;
            return true;
        } else if (class35.field459 == 174) {
            class101.method710(arg0 + 20709, class336.field5213.method1355((byte) 28));
            class35.field459 = -1;
            return true;
        } else if (class35.field459 == 16) {
            int var385 = class336.field5213.method1396(-40);
            String var386 = class336.field5213.method1355((byte) 27);
            Object[] var387 = new Object[var386.length() + 1];
            for (int var388 = var386.length() - 1; var388 >= 0; var388--) {
                if (var386.charAt(var388) == 's') {
                    var387[var388 + 1] = class336.field5213.method1355((byte) 40);
                } else {
                    var387[var388 + 1] = Integer.valueOf(class336.field5213.method1354((byte) 16));
                }
            }
            var387[0] = Integer.valueOf(class336.field5213.method1354((byte) 41));
            if (class302.method2111(var385, (byte) 67)) {
                class247 var389 = new class247();
                var389.field3925 = var387;
                class69.method455(var389, (byte) -64);
            }
            class35.field459 = -1;
            return true;
        } else if (class35.field459 == 32) {
            byte var2 = class336.field5213.method1385(true);
            int var3 = class336.field5213.method1357(true);
            class74.method473(0, var3, var2);
            class35.field459 = -1;
            return true;
        } else if (class35.field459 == 117) {
            class97.field1480 = class336.field5213.method1407(true);
            class291.field4580 = class336.field5213.method1393(3);
            for (int var382 = class291.field4580; var382 < class291.field4580 + 8; var382++) {
                for (int var383 = class97.field1480; var383 < class97.field1480 + 8; var383++) {
                    if (class116.field1745[class148.field2209][var382][var383] != null) {
                        class116.field1745[class148.field2209][var382][var383] = null;
                        class90.method651(var383, var382, 107);
                    }
                }
            }
            for (class125 var384 = (class125) class119.field1831.method1807((byte) 25); var384 != null; var384 = (class125) class119.field1831.method1808(18051)) {
                if (var384.field1865 >= class291.field4580 && (class291.field4580 + 8) > var384.field1865 && class97.field1480 <= var384.field1872 && class97.field1480 + 8 > var384.field1872 && class148.field2209 == var384.field1859) {
                    var384.field1874 = 0;
                }
            }
            class35.field459 = -1;
            return true;
        } else if (class35.field459 == 157) {
            int var379 = class336.field5213.method1394(false);
            String var380 = class336.field5213.method1355((byte) 45);
            int var381 = class336.field5213.method1396(-102);
            if (class302.method2111(var379, (byte) 103)) {
                class280.method1984(var380, -1, var381);
            }
            class35.field459 = -1;
            return true;
        } else if (class35.field459 == 183) {
            int var4 = class336.field5213.method1360((byte) -94);
            class49.field669 = class264.field4183.method49(3, var4);
            class35.field459 = -1;
            return true;
        } else if (class35.field459 == 119) {
            class321.method2246((byte) -128);
            class35.field459 = -1;
            return false;
        } else if (class35.field459 == 31) {
            class19.field273 = class336.field5213.method1399(-1172389784);
            class93.field1444 = class297.field4655;
            class35.field459 = -1;
            return true;
        } else if (class35.field459 == 37) {
            long var364 = class336.field5213.method1346(arg0 + 64);
            class336.field5213.method1377(true);
            long var366 = class336.field5213.method1346(2);
            long var368 = (long) class336.field5213.method1396(-112);
            long var370 = (long) class336.field5213.method1378(false);
            boolean var372 = false;
            int var373 = class336.field5213.method1399(arg0 - 1172389722);
            long var374 = (var368 << 32) + var370;
            int var376 = 0;
            label1709: while (true) {
                if (var376 >= 100) {
                    if (var373 <= 1) {
                        if ((!class288.field4549 || class112.field1675) && !class210.field3446) {
                            for (int var377 = 0; var377 < class271.field4291; var377++) {
                                if (class157.field2424[var377] == var364) {
                                    var372 = true;
                                    break label1709;
                                }
                            }
                        } else {
                            var372 = true;
                        }
                    }
                    break;
                }
                if (class35.field462[var376] == var374) {
                    var372 = true;
                    break;
                }
                var376++;
            }
            if (!var372 && class269.field4252 == 0) {
                class35.field462[class208.field3407] = var374;
                class208.field3407 = (class208.field3407 + 1) % 100;
                String var378 = class143.method999(class98.method695(class305.method2134(123, class336.field5213), false));
                if (var373 == 2 || var373 == 3) {
                    class55.method388(9, -1, var378, "<img=1>" + class331.method2290((byte) 120, var364), class331.method2290((byte) 120, var366));
                } else if (var373 == 1) {
                    class55.method388(9, arg0 + 61, var378, "<img=0>" + class331.method2290((byte) 120, var364), class331.method2290((byte) 120, var366));
                } else {
                    class55.method388(9, arg0 ^ 0x3D, var378, class331.method2290((byte) 120, var364), class331.method2290((byte) 120, var366));
                }
            }
            class35.field459 = -1;
            return true;
        } else if (class35.field459 == 11) {
            int var362 = class336.field5213.method1393(3);
            int var363 = class336.field5213.method1394(false);
            if (class302.method2111(var363, (byte) 79)) {
                class337.field5238 = var362;
            }
            class35.field459 = -1;
            return true;
        } else if (class35.field459 == 1) {
            int var5 = class336.field5213.method1384(arg0 ^ 0x828947CA);
            int var6 = class336.field5213.method1357(true);
            int var7 = class336.field5213.method1403(0);
            if (var6 == 65535) {
                var6 = -1;
            }
            int var8 = class336.field5213.method1354((byte) -119);
            if (class302.method2111(var5, (byte) 116)) {
                class160 var9 = class37.method238((byte) 69, var8);
                if (var9.field2551) {
                    class16.method106(var6, var7, 126, var8);
                    class74 var10 = class31.method198(false, var6);
                    class310.method2169(var10.field963, var10.field945, (byte) 79, var10.field942, var8);
                    class166.method1143(var10.field930, var10.field954, var8, (byte) 88, var10.field929);
                } else if (var6 == -1) {
                    class35.field459 = -1;
                    var9.field2621 = 0;
                    return true;
                } else {
                    class74 var11 = class31.method198(false, var6);
                    var9.field2586 = var11.field945;
                    var9.field2447 = var11.field963 * 100 / var7;
                    var9.field2624 = var6;
                    var9.field2582 = var11.field942;
                    var9.field2621 = 4;
                    class219.method1600(var9, 121);
                }
            }
            class35.field459 = -1;
            return true;
        } else if (class35.field459 == 115) {
            int var360 = class336.field5213.method1396(arg0 - 65);
            if (var360 == 65535) {
                var360 = -1;
            }
            int var361 = class336.field5213.method1407(true);
            class184.method1267(var361, -12676, var360);
            class35.field459 = -1;
            return true;
        } else if (class35.field459 == 211) {
            int var12 = class336.field5213.method1388((byte) 123);
            int var13 = class336.field5213.method1384(2104932360);
            if (var13 == 65535) {
                var13 = -1;
            }
            int var14 = class336.field5213.method1399(-1172389784);
            class46.method312(var14, 0, var13, var12);
            class35.field459 = -1;
            return true;
        } else if (class35.field459 == 203) {
            int var15 = class336.field5213.method1394(false);
            int var16 = class336.field5213.method1384(arg0 + 2104932422);
            int var17 = class336.field5213.method1357(true);
            int var18 = class336.field5213.method1390((byte) 31);
            int var19 = class336.field5213.method1394(false);
            if (class302.method2111(var16, (byte) 62)) {
                class310.method2169(var15, var17, (byte) 97, var19, var18);
            }
            class35.field459 = -1;
            return true;
        } else if (class35.field459 == 240) {
            int var20 = class336.field5213.method1360((byte) -49);
            int var21 = class336.field5213.method1357(true);
            int var22 = class336.field5213.method1357(true);
            int var23 = class336.field5213.method1394(false);
            int var24 = class336.field5213.method1384(arg0 ^ 0x828947CA);
            if (var24 == 65535) {
                var24 = -1;
            }
            if (var23 == 65535) {
                var23 = -1;
            }
            if (class302.method2111(var22, (byte) 101)) {
                for (int var25 = var23; var25 <= var24; var25++) {
                    long var26 = ((long) var20 << 32) + (long) var25;
                    class170 var28 = (class170) class101.field1550.method1743(var26, (byte) -92);
                    class170 var29;
                    if (var28 != null) {
                        var29 = new class170(var28.field2725, var21);
                        var28.method465((byte) -122);
                    } else if (var25 == -1) {
                        var29 = new class170(class37.method238((byte) -88, var20).field2579.field2725, var21);
                    } else {
                        var29 = new class170(0, var21);
                    }
                    class101.field1550.method1750(var29, (byte) 127, var26);
                }
            }
            class35.field459 = -1;
            return true;
        } else if (class35.field459 == 154) {
            int var354 = class336.field5213.method1396(-96);
            int var355 = class336.field5213.method1399(-1172389784);
            int var356 = class336.field5213.method1399(arg0 - 1172389722);
            int var357 = class336.field5213.method1396(-82);
            int var358 = class336.field5213.method1399(arg0 - 1172389722);
            int var359 = class336.field5213.method1399(-1172389784);
            if (class302.method2111(var354, (byte) 72)) {
                class182.method1257(var359, true, 19, var355, var358, var356, var357);
            }
            class35.field459 = -1;
            return true;
        } else if (class35.field459 == 13) {
            class35.field459 = -1;
            class174.field2784 = 0;
            return true;
        } else if (class35.field459 == 160) {
            for (int var353 = 0; var353 < class29.field422.length; var353++) {
                if (class29.field422[var353] != class17.field235[var353]) {
                    class29.field422[var353] = class17.field235[var353];
                    class276.method1966(var353, (byte) 82);
                    class309.field4837[class200.method1465(class188.field3053++, 31)] = var353;
                }
            }
            class35.field459 = -1;
            return true;
        } else if (class35.field459 == 54) {
            int var348 = class336.field5213.method1397((byte) -120);
            int var349 = class336.field5213.method1394(false);
            int var350 = class336.field5213.method1357(true);
            int var351 = class336.field5213.method1360((byte) 104);
            if (class302.method2111(var349, (byte) 125)) {
                class224 var352 = (class224) class176.field2870.method1743((long) var351, (byte) 121);
                if (var352 != null) {
                    class100.method707(var352, arg0 ^ 0xFFFFFFB5, var352.field3564 != var350);
                }
                class219.method1605(arg0 - 55, var350, var351, var348);
            }
            class35.field459 = -1;
            return true;
        } else if (class35.field459 == 64) {
            int var30 = class336.field5213.method1354((byte) -120);
            int var31 = class336.field5213.method1396(-21);
            if (var30 < -70000) {
                var31 += 32768;
            }
            class160 var32;
            if (var30 >= 0) {
                var32 = class37.method238((byte) 93, var30);
            } else {
                var32 = null;
            }
            if (var32 != null) {
                for (int var33 = 0; var33 < var32.field2615.length; var33++) {
                    var32.field2615[var33] = 0;
                    var32.field2559[var33] = 0;
                }
            }
            class192.method1387(0, var31);
            int var34 = class336.field5213.method1396(arg0 + 45);
            for (int var35 = 0; var35 < var34; var35++) {
                int var36 = class336.field5213.method1396(-87);
                int var37 = class336.field5213.method1393(3);
                if (var37 == 255) {
                    var37 = class336.field5213.method1390((byte) 31);
                }
                if (var32 != null && var32.field2615.length > var35) {
                    var32.field2615[var35] = var36;
                    var32.field2559[var35] = var37;
                }
                class229.method1659(var36 - 1, var35, var31, (byte) -78, var37);
            }
            if (var32 != null) {
                class219.method1600(var32, 119);
            }
            class40.method278(0);
            class35.field465[class200.method1465(31, class149.field2279++)] = class200.method1465(32767, var31);
            class35.field459 = -1;
            return true;
        } else if (class35.field459 == 232) {
            for (int var38 = 0; var38 < class100.field1523.length; var38++) {
                if (class100.field1523[var38] != null) {
                    class100.field1523[var38].field1968 = -1;
                }
            }
            for (int var39 = 0; var39 < class297.field4657.length; var39++) {
                if (class297.field4657[var39] != null) {
                    class297.field4657[var39].field1968 = -1;
                }
            }
            class35.field459 = -1;
            return true;
        } else if (class35.field459 == 24) {
            int var40 = class336.field5213.method1357(true);
            if (var40 == 65535) {
                var40 = -1;
            }
            int var41 = class336.field5213.method1403(0);
            int var42 = class336.field5213.method1384(2104932360);
            if (class302.method2111(var42, (byte) 108)) {
                class116.method804(false, var41, 1, var40, -1);
            }
            class35.field459 = -1;
            return true;
        } else if (class35.field459 == 201 || class35.field459 == 134 || class35.field459 == 53 || class35.field459 == 220 || class35.field459 == 40 || class35.field459 == 104 || class35.field459 == 75 || class35.field459 == 165 || class35.field459 == 239 || class35.field459 == 229 || class35.field459 == 60 || class35.field459 == 168 || class35.field459 == 99 || class35.field459 == 153) {
            class27.method185((byte) 2);
            class35.field459 = -1;
            return true;
        } else if (class35.field459 == 243) {
            class339.field5257 = class336.field5213.method1396(arg0 - 11) * 30;
            class35.field471 = class297.field4655;
            class35.field459 = -1;
            return true;
        } else if (class35.field459 == 151) {
            class271.field4291 = class138.field2063 / 8;
            for (int var347 = 0; var347 < class271.field4291; var347++) {
                class157.field2424[var347] = class336.field5213.method1346(2);
                class100.field1525[var347] = class343.method2363(class157.field2424[var347], 101);
                class45.field620[var347] = false;
            }
            class93.field1444 = class297.field4655;
            class35.field459 = -1;
            return true;
        } else if (class35.field459 == 130) {
            int var43 = class336.field5213.method1357(true);
            String var44 = class336.field5213.method1355((byte) 93);
            int var45 = class336.field5213.method1390((byte) 31);
            if (class302.method2111(var43, (byte) 79)) {
                class154.method1070(false, var44, var45);
            }
            class35.field459 = -1;
            return true;
        } else if (class35.field459 == 25) {
            int var313 = class336.field5213.method1390((byte) 31);
            int var314 = class336.field5213.method1396(-52);
            int var315 = class336.field5213.method1394(false);
            int var316 = class336.field5213.method1357(true);
            if (var313 >> 30 != 0) {
                int var317 = (var313 >> 14 & 0x3FFF) - class181.field2925;
                int var318 = var313 >> 28 & 0x3;
                int var319 = (var313 & 0x3FFF) - class24.field351;
                if (var317 >= 0 && var319 >= 0 && var317 < 104 && var319 < 104) {
                    int var320 = var317 * 128 + 64;
                    int var321 = var319 * 128 + 64;
                    class282 var322 = new class282(var315, var318, var320, var321, class227.method1653(var320, var321, arg0 ^ 0x2FC4, var318) - var314, var316, class48.field648);
                    class136.field2049.method1815((byte) -123, new class323(var322));
                }
            } else if ((var313 >> 29) != 0) {
                int var323 = var313 & 0xFFFF;
                class196 var324 = class297.field4657[var323];
                if (var324 != null) {
                    if (var315 == 65535) {
                        var315 = -1;
                    }
                    boolean var325 = true;
                    if (var315 != -1 && var324.field2022 != -1) {
                        if (var324.field2022 == var315) {
                            class20 var330 = class264.method1881((byte) 115, var315);
                            if (var330.field299 && var330.field302 != -1) {
                                class80 var331 = class37.method236(var330.field302, 20254);
                                int var332 = var331.field1207;
                                if (var332 == 1) {
                                    var324.field1993 = 0;
                                    var325 = false;
                                    var324.field1981 = 0;
                                    var324.field1945 = class48.field648 + var316;
                                    var324.field2024 = 1;
                                    var324.field1957 = 0;
                                    class253.method1789(arg0 ^ 0xFFFFB54A, var324.field1944, var331, var324.field1957, var324.field1980, false);
                                } else if (var332 == 2) {
                                    var324.field2023 = 0;
                                    var325 = false;
                                }
                            }
                        } else {
                            class20 var326 = class264.method1881((byte) 116, var315);
                            class20 var327 = class264.method1881((byte) 114, var324.field2022);
                            if (var326.field302 != -1 && var327.field302 != -1) {
                                class80 var328 = class37.method236(var326.field302, arg0 ^ 0xFFFFB0DC);
                                class80 var329 = class37.method236(var327.field302, 20254);
                                if (var329.field1197 > var328.field1197) {
                                    var325 = false;
                                }
                            }
                        }
                    }
                    if (var325) {
                        var324.field1945 = class48.field648 + var316;
                        var324.field1993 = 0;
                        var324.field1957 = 0;
                        var324.field2022 = var315;
                        if (var324.field1945 > class48.field648) {
                            var324.field1957 = -1;
                        }
                        var324.field2010 = var314;
                        var324.field2024 = 1;
                        if (var324.field2022 != -1 && class48.field648 == var324.field1945) {
                            int var333 = class264.method1881((byte) 120, var324.field2022).field302;
                            if (var333 != -1) {
                                class80 var334 = class37.method236(var333, 20254);
                                if (var334 != null && var334.field1209 != null) {
                                    class253.method1789(19080, var324.field1944, var334, 0, var324.field1980, false);
                                }
                            }
                        }
                    }
                }
            } else if (var313 >> 28 != 0) {
                int var335 = var313 & 0xFFFF;
                class320 var336;
                if (class254.field4032 == var335) {
                    var336 = class13.field159;
                } else {
                    var336 = class100.field1523[var335];
                }
                if (var336 != null) {
                    if (var315 == 65535) {
                        var315 = -1;
                    }
                    boolean var337 = true;
                    if (var315 != -1 && var336.field2022 != -1) {
                        if (var336.field2022 == var315) {
                            class20 var342 = class264.method1881((byte) 108, var315);
                            if (var342.field299 && var342.field302 != -1) {
                                class80 var343 = class37.method236(var342.field302, 20254);
                                int var344 = var343.field1207;
                                if (var344 == 1) {
                                    var336.field1981 = 0;
                                    var337 = false;
                                    var336.field1993 = 0;
                                    var336.field1957 = 0;
                                    var336.field1945 = class48.field648 + var316;
                                    var336.field2024 = 1;
                                    class253.method1789(arg0 ^ 0xFFFFB54A, var336.field1944, var343, var336.field1957, var336.field1980, false);
                                } else if (var344 == 2) {
                                    var337 = false;
                                    var336.field2023 = 0;
                                }
                            }
                        } else {
                            class20 var338 = class264.method1881((byte) 117, var315);
                            class20 var339 = class264.method1881((byte) 119, var336.field2022);
                            if (var338.field302 != -1 && var339.field302 != -1) {
                                class80 var340 = class37.method236(var338.field302, 20254);
                                class80 var341 = class37.method236(var339.field302, 20254);
                                if (var341.field1197 > var340.field1197) {
                                    var337 = false;
                                }
                            }
                        }
                    }
                    if (var337) {
                        var336.field2010 = var314;
                        var336.field1993 = 0;
                        var336.field2024 = 1;
                        var336.field1945 = class48.field648 + var316;
                        var336.field2022 = var315;
                        var336.field1957 = 0;
                        if (var336.field2022 == 65535) {
                            var336.field2022 = -1;
                        }
                        if (class48.field648 < var336.field1945) {
                            var336.field1957 = -1;
                        }
                        if (var336.field2022 != -1 && class48.field648 == var336.field1945) {
                            int var345 = class264.method1881((byte) 122, var336.field2022).field302;
                            if (var345 != -1) {
                                class80 var346 = class37.method236(var345, arg0 ^ 0xFFFFB0DC);
                                if (var346 != null && var346.field1209 != null) {
                                    class253.method1789(arg0 ^ 0xFFFFB54A, var336.field1944, var346, 0, var336.field1980, class13.field159 == var336);
                                }
                            }
                        }
                    }
                }
            }
            class35.field459 = -1;
            return true;
        } else if (class35.field459 == 145) {
            int var46 = class336.field5213.method1394(false);
            int var47 = class336.field5213.method1357(true);
            int var48 = class336.field5213.method1390((byte) 31);
            if (class302.method2111(var46, (byte) 123)) {
                class115.method798(-1, var47, var48);
            }
            class35.field459 = -1;
            return true;
        } else if (class35.field459 == 190) {
            class4.method19(-22291, class138.field2063, class336.field5213, class264.field4183);
            class35.field459 = -1;
            return true;
        } else if (class35.field459 == 77) {
            int var311 = class336.field5213.method1394(false);
            int var312 = class336.field5213.method1407(true);
            class258.method1829(-1, var311, var312);
            class35.field459 = -1;
            return true;
        } else if (class35.field459 == 108) {
            int var301 = class336.field5213.method1360((byte) 117);
            int var302 = class336.field5213.method1360((byte) 96);
            int var303 = class336.field5213.method1357(true);
            if (var303 == 65535) {
                var303 = -1;
            }
            int var304 = class336.field5213.method1394(false);
            int var305 = class336.field5213.method1394(false);
            if (var304 == 65535) {
                var304 = -1;
            }
            if (class302.method2111(var305, (byte) 77)) {
                for (int var306 = var304; var306 <= var303; var306++) {
                    long var307 = ((long) var301 << 32) + (long) var306;
                    class170 var309 = (class170) class101.field1550.method1743(var307, (byte) 100);
                    class170 var310;
                    if (var309 != null) {
                        var310 = new class170(var302, var309.field2712);
                        var309.method465((byte) -122);
                    } else if (var306 == -1) {
                        var310 = new class170(var302, class37.method238((byte) 96, var301).field2579.field2712);
                    } else {
                        var310 = new class170(var302, -1);
                    }
                    class101.field1550.method1750(var310, (byte) 120, var307);
                }
            }
            class35.field459 = -1;
            return true;
        } else if (class35.field459 == 163) {
            int var297 = class336.field5213.method1396(-98);
            if (var297 == 65535) {
                var297 = -1;
            }
            int var298 = class336.field5213.method1399(arg0 - 1172389722);
            int var299 = class336.field5213.method1396(-89);
            int var300 = class336.field5213.method1399(-1172389784);
            class193.method1414(var297, var298, var300, var299, 79);
            class35.field459 = -1;
            return true;
        } else if (class35.field459 == 41) {
            int var296 = class336.field5213.method1396(-111);
            class342.method2355(arg0 - 2013, var296);
            class35.field465[class200.method1465(31, class149.field2279++)] = class200.method1465(var296, 32767);
            class35.field459 = -1;
            return true;
        } else if (class35.field459 == 152) {
            int var49 = class336.field5213.method1394(false);
            int var50 = class336.field5213.method1354((byte) -120);
            int var51 = class336.field5213.method1394(false);
            if (var51 == 65535) {
                var51 = -1;
            }
            if (class302.method2111(var49, (byte) 83)) {
                class116.method804(false, var50, 2, var51, -1);
            }
            class35.field459 = -1;
            return true;
        } else if (class35.field459 == 202) {
            if (class138.field2063 == 0) {
                class10.field113 = class249.field3955;
            } else {
                class10.field113 = class336.field5213.method1355((byte) 36);
            }
            class35.field459 = -1;
            return true;
        } else if (class35.field459 == 184) {
            class175.method1208(true, -70);
            class35.field459 = -1;
            return true;
        } else if (class35.field459 == 59) {
            class94.method677(12);
            class40.method278(0);
            class35.field459 = -1;
            class188.field3053 += 32;
            return true;
        } else if (class35.field459 == 245) {
            String var52 = class336.field5213.method1355((byte) 74);
            int var53 = class336.field5213.method1394(false);
            int var54 = class336.field5213.method1384(2104932360);
            if (class302.method2111(var54, (byte) 125)) {
                class280.method1984(var52, arg0 ^ 0x3D, var53);
            }
            class35.field459 = -1;
            return true;
        } else if (class35.field459 == 148) {
            int var55 = class336.field5213.method1396(-28);
            int var56 = class336.field5213.method1399(arg0 ^ 0x45E13FAA);
            int var57 = class336.field5213.method1399(-1172389784);
            int var58 = class336.field5213.method1396(-30);
            int var59 = class336.field5213.method1399(-1172389784);
            int var60 = class336.field5213.method1399(-1172389784);
            if (class302.method2111(var55, (byte) 95)) {
                class146.method1027(false, var58, var56, var57, var59, var60);
            }
            class35.field459 = -1;
            return true;
        } else if (class35.field459 == 83) {
            int var61 = class336.field5213.method1392(10927);
            int var62 = class336.field5213.method1403(0);
            int var63 = class336.field5213.method1389(102);
            int var64 = class336.field5213.method1394(false);
            if (class302.method2111(var64, (byte) 103)) {
                class111.method772((byte) 108, var62, var61, var63);
            }
            class35.field459 = -1;
            return true;
        } else if (class35.field459 == 66) {
            if (class113.field1688 != null) {
                class201.method1471(false, -1, class49.field674, -1, false);
            }
            byte[] var65 = new byte[class138.field2063];
            class336.field5213.method1534(var65, class138.field2063, (byte) 94, 0);
            String var66 = class229.method1660(var65, class138.field2063, 0, true);
            if (class161.field2635 == null && class6.field62 == 3 || !class6.field65.startsWith("win") || class107.field1608) {
                class60.method415(var66, true, (byte) 126);
            } else {
                class42.field582 = var66;
                class38.field504 = true;
                class240.field3791 = class264.field4183.method30(var66, -59);
            }
            class35.field459 = -1;
            return true;
        } else if (class35.field459 == 5) {
            class321.method2245(49);
            class35.field459 = -1;
            return true;
        } else if (class35.field459 == 162) {
            class291.field4580 = class336.field5213.method1393(3);
            class97.field1480 = class336.field5213.method1399(-1172389784);
            class35.field459 = -1;
            return true;
        } else if (class35.field459 == 159) {
            int var67 = class336.field5213.method1396(-79);
            int var68 = class336.field5213.method1354((byte) -124);
            if (class302.method2111(var67, (byte) 97)) {
                class224 var69 = (class224) class176.field2870.method1743((long) var68, (byte) -17);
                if (var69 != null) {
                    class100.method707(var69, 108, true);
                }
                if (class10.field109 != null) {
                    class219.method1600(class10.field109, 122);
                    class10.field109 = null;
                }
            }
            class35.field459 = -1;
            return true;
        } else if (class35.field459 == 155) {
            class40.method278(0);
            class93.field1433 = class336.field5213.method1399(-1172389784);
            class35.field471 = class297.field4655;
            class35.field459 = -1;
            return true;
        } else if (class35.field459 == 84) {
            class291.field4580 = class336.field5213.method1397((byte) -121);
            class97.field1480 = class336.field5213.method1393(arg0 + 65);
            while (class336.field5213.field3129 < class138.field2063) {
                class35.field459 = class336.field5213.method1399(-1172389784);
                class27.method185((byte) 2);
            }
            class35.field459 = -1;
            return true;
        } else if (class35.field459 == 72) {
            String var70 = class336.field5213.method1355((byte) 83);
            if (var70.endsWith(":tradereq:")) {
                String var106 = var70.substring(0, var70.indexOf(":"));
                long var107 = class232.method1669(37, var106);
                boolean var109 = false;
                for (int var110 = 0; var110 < class271.field4291; var110++) {
                    if (class157.field2424[var110] == var107) {
                        var109 = true;
                        break;
                    }
                }
                if (!var109 && class269.field4252 == 0) {
                    class245.method1740((byte) 35, 4, var106, class102.field1559);
                }
            } else if (var70.endsWith(":chalreq:")) {
                boolean var71 = false;
                String var72 = var70.substring(0, var70.indexOf(":"));
                long var73 = class232.method1669(arg0 + 99, var72);
                for (int var75 = 0; var75 < class271.field4291; var75++) {
                    if (class157.field2424[var75] == var73) {
                        var71 = true;
                        break;
                    }
                }
                if (!var71 && class269.field4252 == 0) {
                    String var76 = var70.substring(var70.indexOf(":") + 1, var70.length() + -9);
                    class245.method1740((byte) -120, 8, var72, var76);
                }
            } else if (var70.endsWith(":assistreq:")) {
                String var101 = var70.substring(0, var70.indexOf(":"));
                long var102 = class232.method1669(37, var101);
                boolean var104 = false;
                for (int var105 = 0; var105 < class271.field4291; var105++) {
                    if (class157.field2424[var105] == var102) {
                        var104 = true;
                        break;
                    }
                }
                if (!var104 && class269.field4252 == 0) {
                    class245.method1740((byte) -111, 10, var101, "");
                }
            } else if (var70.endsWith(":clan:")) {
                String var77 = var70.substring(0, var70.indexOf(":clan:"));
                class245.method1740((byte) -126, 11, "", var77);
            } else if (var70.endsWith(":trade:")) {
                String var100 = var70.substring(0, var70.indexOf(":trade:"));
                if (class269.field4252 == 0) {
                    class245.method1740((byte) 125, 12, "", var100);
                }
            } else if (var70.endsWith(":assist:")) {
                String var99 = var70.substring(0, var70.indexOf(":assist:"));
                if (class269.field4252 == 0) {
                    class245.method1740((byte) -122, 13, "", var99);
                }
            } else if (var70.endsWith(":duelstake:")) {
                String var94 = var70.substring(0, var70.indexOf(":"));
                boolean var95 = false;
                long var96 = class232.method1669(arg0 + 99, var94);
                for (int var98 = 0; var98 < class271.field4291; var98++) {
                    if (class157.field2424[var98] == var96) {
                        var95 = true;
                        break;
                    }
                }
                if (!var95 && class269.field4252 == 0) {
                    class245.method1740((byte) 78, 14, var94, "");
                }
            } else if (var70.endsWith(":duelfriend:")) {
                String var89 = var70.substring(0, var70.indexOf(":"));
                long var90 = class232.method1669(arg0 + 99, var89);
                boolean var92 = false;
                for (int var93 = 0; var93 < class271.field4291; var93++) {
                    if (class157.field2424[var93] == var90) {
                        var92 = true;
                        break;
                    }
                }
                if (!var92 && class269.field4252 == 0) {
                    class245.method1740((byte) 90, 15, var89, "");
                }
            } else if (var70.endsWith(":clanreq:")) {
                String var78 = var70.substring(0, var70.indexOf(":"));
                long var79 = class232.method1669(37, var78);
                boolean var81 = false;
                for (int var82 = 0; var82 < class271.field4291; var82++) {
                    if (class157.field2424[var82] == var79) {
                        var81 = true;
                        break;
                    }
                }
                if (!var81 && class269.field4252 == 0) {
                    class245.method1740((byte) 71, 16, var78, "");
                }
            } else if (var70.endsWith(":allyreq:")) {
                String var83 = var70.substring(0, var70.indexOf(":"));
                boolean var84 = false;
                long var85 = class232.method1669(37, var83);
                for (int var87 = 0; var87 < class271.field4291; var87++) {
                    if (class157.field2424[var87] == var85) {
                        var84 = true;
                        break;
                    }
                }
                if (!var84 && class269.field4252 == 0) {
                    String var88 = var70.substring(var70.indexOf(":") + 1, var70.length() + -9);
                    class245.method1740((byte) 17, 21, var83, var88);
                }
            } else {
                class245.method1740((byte) -126, 0, "", var70);
            }
            class35.field459 = -1;
            return true;
        } else if (class35.field459 == 20) {
            long var111 = class336.field5213.method1346(arg0 + 64);
            int var113 = class336.field5213.method1396(-101);
            int var114 = class336.field5213.method1399(-1172389784);
            boolean var115 = true;
            if (var111 < 0L) {
                var111 &= Long.MAX_VALUE;
                var115 = false;
            }
            String var116 = "";
            if (var113 > 0) {
                var116 = class336.field5213.method1355((byte) 89);
            }
            String var117 = class331.method2290((byte) 120, var111);
            for (int var118 = 0; var118 < class198.field3247; var118++) {
                if (class87.field1314[var118] == var111) {
                    if (class36.field482[var118] != var113) {
                        class36.field482[var118] = var113;
                        if (var113 > 0) {
                            class245.method1740((byte) 120, 5, "", var117 + class187.field3042);
                        }
                        if (var113 == 0) {
                            class245.method1740((byte) -111, 5, "", var117 + class260.field4147);
                        }
                    }
                    var117 = null;
                    class164.field2670[var118] = var116;
                    class239.field3783[var118] = var114;
                    class183.field2957[var118] = var115;
                    break;
                }
            }
            boolean var119 = false;
            if (var117 != null && class198.field3247 < 200) {
                class87.field1314[class198.field3247] = var111;
                class239.field3773[class198.field3247] = var117;
                class36.field482[class198.field3247] = var113;
                class164.field2670[class198.field3247] = var116;
                class239.field3783[class198.field3247] = var114;
                class183.field2957[class198.field3247] = var115;
                class198.field3247++;
            }
            class93.field1444 = class297.field4655;
            int var120 = class198.field3247;
            while (var120 > 0) {
                var120--;
                boolean var121 = true;
                for (int var122 = 0; var122 < var120; var122++) {
                    if (class36.field482[var122] != class94.field1452 && class36.field482[var122 + 1] == class94.field1452 || class36.field482[var122] == 0 && class36.field482[var122 + 1] != 0) {
                        int var123 = class36.field482[var122];
                        class36.field482[var122] = class36.field482[var122 + 1];
                        var121 = false;
                        class36.field482[var122 + 1] = var123;
                        String var124 = class164.field2670[var122];
                        class164.field2670[var122] = class164.field2670[var122 + 1];
                        class164.field2670[var122 + 1] = var124;
                        String var125 = class239.field3773[var122];
                        class239.field3773[var122] = class239.field3773[var122 + 1];
                        class239.field3773[var122 + 1] = var125;
                        long var126 = class87.field1314[var122];
                        class87.field1314[var122] = class87.field1314[var122 + 1];
                        class87.field1314[var122 + 1] = var126;
                        int var128 = class239.field3783[var122];
                        class239.field3783[var122] = class239.field3783[var122 + 1];
                        class239.field3783[var122 + 1] = var128;
                        boolean var129 = class183.field2957[var122];
                        class183.field2957[var122] = class183.field2957[var122 + 1];
                        class183.field2957[var122 + 1] = var129;
                    }
                }
                if (var121) {
                    break;
                }
            }
            class35.field459 = -1;
            return true;
        } else if (class35.field459 == 144) {
            int var130 = class336.field5213.method1394(false);
            int var131 = class336.field5213.method1354((byte) -19);
            int var132 = class336.field5213.method1396(-36);
            if (class302.method2111(var132, (byte) 127)) {
                class71.method461(var131, (byte) 79, var130);
            }
            class35.field459 = -1;
            return true;
        } else if (class35.field459 == 176) {
            int var295 = class336.field5213.method1399(-1172389784);
            if (class336.field5213.method1399(-1172389784) == 0) {
                class41.field565[var295] = new class99();
            } else {
                class336.field5213.field3129--;
                class41.field565[var295] = new class99(class336.field5213);
            }
            class293.field4607 = class297.field4655;
            class35.field459 = -1;
            return true;
        } else if (class35.field459 == 141) {
            int var133 = class336.field5213.method1381(true);
            int var134 = class336.field5213.method1390((byte) 31);
            int var135 = class336.field5213.method1396(-86);
            if (class302.method2111(var135, (byte) 92)) {
                class230.method1663(var133, var134, true);
            }
            class35.field459 = -1;
            return true;
        } else if (class35.field459 == 179) {
            long var281 = class336.field5213.method1346(2);
            long var283 = (long) class336.field5213.method1396(-105);
            long var285 = (long) class336.field5213.method1378(false);
            int var287 = class336.field5213.method1399(-1172389784);
            long var288 = (var283 << 32) + var285;
            boolean var290 = false;
            int var291 = class336.field5213.method1396(-85);
            int var292 = 0;
            label1612: while (true) {
                if (var292 >= 100) {
                    if (var287 <= 1) {
                        for (int var293 = 0; var293 < class271.field4291; var293++) {
                            if (class157.field2424[var293] == var281) {
                                var290 = true;
                                break label1612;
                            }
                        }
                    }
                    break;
                }
                if (class35.field462[var292] == var288) {
                    var290 = true;
                    break;
                }
                var292++;
            }
            if (!var290 && class269.field4252 == 0) {
                class35.field462[class208.field3407] = var288;
                class208.field3407 = (class208.field3407 + 1) % 100;
                String var294 = class21.method137(var291, (byte) 92).method1982(class336.field5213, arg0 + 61);
                if (var287 == 2) {
                    class192.method1405(var294, 18, (String) null, var291, "<img=1>" + class331.method2290((byte) 120, var281), arg0 ^ 0x9E620F22);
                } else if (var287 == 1) {
                    class192.method1405(var294, 18, (String) null, var291, "<img=0>" + class331.method2290((byte) 120, var281), arg0 + 1637740830);
                } else {
                    class192.method1405(var294, 18, (String) null, var291, class331.method2290((byte) 120, var281), arg0 + 1637740830);
                }
            }
            class35.field459 = -1;
            return true;
        } else if (class35.field459 == 114) {
            int var136 = class336.field5213.method1407(true);
            int var137 = class336.field5213.method1397((byte) -125);
            int var138 = class336.field5213.method1399(-1172389784);
            class148.field2209 = var136 >> 1;
            class13.field159.method2236(var138, var137, 18675, (var136 & 0x1) == 1);
            class35.field459 = -1;
            return true;
        } else if (class35.field459 == 87) {
            class338.field5245 = class297.field4655;
            long var139 = class336.field5213.method1346(arg0 ^ 0xFFFFFFC0);
            if (var139 == 0L) {
                class264.field4184 = null;
                class52.field701 = null;
                class168.field2701 = 0;
                class294.field4616 = null;
                class35.field459 = -1;
                return true;
            }
            long var141 = class336.field5213.method1346(2);
            class264.field4184 = class336.method2313((byte) -110, var141);
            class294.field4616 = class336.method2313((byte) -110, var139);
            class231.field3694 = class336.field5213.method1377(true);
            int var143 = class336.field5213.method1399(-1172389784);
            if (var143 == 255) {
                class35.field459 = -1;
                return true;
            }
            class168.field2701 = var143;
            class290[] var144 = new class290[100];
            for (int var145 = 0; var145 < class168.field2701; var145++) {
                var144[var145] = new class290();
                var144[var145].field916 = class336.field5213.method1346(2);
                var144[var145].field4573 = class336.method2313((byte) -110, var144[var145].field916);
                var144[var145].field4569 = class336.field5213.method1396(-47);
                var144[var145].field4572 = class336.field5213.method1377(true);
                var144[var145].field4566 = class336.field5213.method1355((byte) 105);
                if (class140.field2085 == var144[var145].field916) {
                    class161.field2637 = var144[var145].field4572;
                }
            }
            boolean var146 = false;
            int var147 = class168.field2701;
            while (var147 > 0) {
                boolean var148 = true;
                var147--;
                for (int var149 = 0; var149 < var147; var149++) {
                    if (var144[var149].field4573.compareTo(var144[var149 + 1].field4573) > 0) {
                        class290 var150 = var144[var149];
                        var148 = false;
                        var144[var149] = var144[var149 + 1];
                        var144[var149 + 1] = var150;
                    }
                }
                if (var148) {
                    break;
                }
            }
            class35.field459 = -1;
            class52.field701 = var144;
            return true;
        } else if (class35.field459 == 122) {
            int var277 = class336.field5213.method1396(-97);
            int var278 = class336.field5213.method1394(false);
            int var279 = class336.field5213.method1384(2104932360);
            int var280 = class336.field5213.method1354((byte) -124);
            if (class302.method2111(var278, (byte) 105)) {
                class166.method1144((byte) 126, var280, (var279 << 16) + var277);
            }
            class35.field459 = -1;
            return true;
        } else if (class35.field459 == 81) {
            long var264 = class336.field5213.method1346(2);
            long var266 = (long) class336.field5213.method1396(-90);
            long var268 = (long) class336.field5213.method1378(false);
            long var270 = (var266 << 32) + var268;
            boolean var272 = false;
            int var273 = class336.field5213.method1399(-1172389784);
            int var274 = 0;
            label1569: while (true) {
                if (var274 < 100) {
                    if (class35.field462[var274] != var270) {
                        var274++;
                        continue;
                    }
                    var272 = true;
                    break;
                }
                if (var273 <= 1) {
                    if ((!class288.field4549 || class112.field1675) && !class210.field3446) {
                        for (int var275 = 0; var275 < class271.field4291; var275++) {
                            if (class157.field2424[var275] == var264) {
                                var272 = true;
                                break label1569;
                            }
                        }
                    } else {
                        var272 = true;
                    }
                }
                break;
            }
            if (!var272 && class269.field4252 == 0) {
                class35.field462[class208.field3407] = var270;
                class208.field3407 = (class208.field3407 + 1) % 100;
                String var276 = class143.method999(class98.method695(class305.method2134(122, class336.field5213), false));
                if (var273 == 2 || var273 == 3) {
                    class245.method1740((byte) -112, 7, "<img=1>" + class331.method2290((byte) 120, var264), var276);
                } else if (var273 == 1) {
                    class245.method1740((byte) -115, 7, "<img=0>" + class331.method2290((byte) 120, var264), var276);
                } else {
                    class245.method1740((byte) -121, 3, class331.method2290((byte) 120, var264), var276);
                }
            }
            class35.field459 = -1;
            return true;
        } else if (class35.field459 == 214) {
            int var151 = class336.field5213.method1399(-1172389784);
            int var152 = class336.field5213.method1357(true);
            int var153 = class336.field5213.method1357(true);
            if (class302.method2111(var152, (byte) 79)) {
                if (var151 == 2) {
                    class210.method1540(-29908);
                }
                class246.field3904 = var153;
                class103.method726((byte) 122, var153);
                class242.method1713(false, arg0 + 163);
                class80.method590(class246.field3904, (byte) -115);
                for (int var154 = 0; var154 < 100; var154++) {
                    class284.field4485[var154] = true;
                }
            }
            class35.field459 = -1;
            return true;
        } else if (class35.field459 == 238) {
            int var155 = class336.field5213.method1390((byte) 31);
            int var156 = var155 >> 28 & 0x3;
            int var157 = var155 >> 14 & 0x3FFF;
            int var158 = var155 & 0x3FFF;
            int var159 = class336.field5213.method1384(arg0 + 2104932422);
            if (var159 == 65535) {
                var159 = -1;
            }
            int var160 = class336.field5213.method1407(true);
            int var161 = var160 >> 2;
            int var162 = var157 - class181.field2925;
            int var163 = class208.field3411[var161];
            int var164 = var158 - class24.field351;
            int var165 = var160 & 0x3;
            class224.method1634(var164, var165, var159, var156, (byte) -126, var163, var161, var162);
            class35.field459 = -1;
            return true;
        } else if (class35.field459 == 82) {
            int var261 = class336.field5213.method1384(2104932360);
            int var262 = class336.field5213.method1390((byte) 31);
            if (class302.method2111(var261, (byte) 115)) {
                int var263 = 0;
                if (class13.field159.field5004 != null) {
                    var263 = class13.field159.field5004.method2119((byte) -92);
                }
                class116.method804(false, var262, 3, var263, -1);
            }
            class35.field459 = -1;
            return true;
        } else if (class35.field459 == 43) {
            if (class246.field3904 != -1) {
                class125.method864(class246.field3904, 0, -1);
            }
            class35.field459 = -1;
            return true;
        } else if (class35.field459 == 27) {
            class258.field4087 = class336.field5213.method1399(-1172389784);
            class35.field459 = -1;
            return true;
        } else if (arg0 != -62) {
            return false;
        } else if (class35.field459 == 52) {
            int var166 = class336.field5213.method1354((byte) -121);
            class160 var167 = class37.method238((byte) -125, var166);
            for (int var168 = 0; var168 < var167.field2615.length; var168++) {
                var167.field2615[var168] = -1;
                var167.field2615[var168] = 0;
            }
            class219.method1600(var167, 121);
            class35.field459 = -1;
            return true;
        } else if (class35.field459 == 253) {
            int var257 = class336.field5213.method1393(3);
            int var258 = class336.field5213.method1397((byte) -124);
            String var259 = class336.field5213.method1355((byte) 56);
            int var260 = class336.field5213.method1396(-17);
            if (var260 == 65535) {
                var260 = -1;
            }
            if (var257 >= 1 && var257 <= 8) {
                if (var259.equalsIgnoreCase("null")) {
                    var259 = null;
                }
                class299.field4667[var257 - 1] = var259;
                class86.field1309[var257 - 1] = var260;
                class131.field1939[var257 - 1] = var258 == 0;
            }
            class35.field459 = -1;
            return true;
        } else if (class35.field459 == 2) {
            int var255 = class336.field5213.method1396(-126);
            int var256 = class336.field5213.method1360((byte) -86);
            class258.method1829(-1, var255, var256);
            class35.field459 = -1;
            return true;
        } else if (class35.field459 == 242) {
            int var169 = class336.field5213.method1357(true);
            int var170 = class336.field5213.method1396(-112);
            int var171 = class336.field5213.method1357(true);
            int var172 = class336.field5213.method1403(0);
            int var173 = class336.field5213.method1357(true);
            if (class302.method2111(var169, (byte) 82)) {
                class116.method804(false, var172, 7, var170 << 16 | var171, var173);
            }
            class35.field459 = -1;
            return true;
        } else if (class35.field459 == 217) {
            int var174 = class336.field5213.method1357(true);
            int var175 = class336.field5213.method1396(-44);
            int var176 = class336.field5213.method1403(0);
            if (class302.method2111(var174, (byte) 110)) {
                class231.method1666((byte) 116, var175, var176);
            }
            class35.field459 = -1;
            return true;
        } else if (class35.field459 == 23) {
            long var177 = class336.field5213.method1346(arg0 ^ 0xFFFFFFC0);
            int var179 = class336.field5213.method1396(-93);
            boolean var180 = false;
            if ((var177 & Long.MIN_VALUE) != 0L) {
                var180 = true;
            }
            byte var181 = class336.field5213.method1377(true);
            if (var180) {
                if (class168.field2701 == 0) {
                    class35.field459 = -1;
                    return true;
                }
                long var187 = var177 & Long.MAX_VALUE;
                boolean var189 = false;
                int var190;
                for (var190 = 0; var190 < class168.field2701 && (class52.field701[var190].field916 != var187 || class52.field701[var190].field4569 != var179); var190++) {
                }
                if (var190 < class168.field2701) {
                    while (var190 < (class168.field2701 - 1)) {
                        class52.field701[var190] = class52.field701[var190 + 1];
                        var190++;
                    }
                    class168.field2701--;
                    class52.field701[class168.field2701] = null;
                }
            } else {
                String var182 = class336.field5213.method1355((byte) 75);
                class290 var183 = new class290();
                var183.field916 = var177;
                var183.field4573 = class336.method2313((byte) -110, var183.field916);
                var183.field4569 = var179;
                var183.field4566 = var182;
                var183.field4572 = var181;
                int var184;
                for (var184 = class168.field2701 - 1; var184 >= 0; var184--) {
                    int var185 = class52.field701[var184].field4573.compareTo(var183.field4573);
                    if (var185 == 0) {
                        class52.field701[var184].field4569 = var179;
                        class52.field701[var184].field4572 = var181;
                        class52.field701[var184].field4566 = var182;
                        class35.field459 = -1;
                        if (class140.field2085 == var177) {
                            class161.field2637 = var181;
                        }
                        class338.field5245 = class297.field4655;
                        return true;
                    }
                    if (var185 < 0) {
                        break;
                    }
                }
                if (class52.field701.length <= class168.field2701) {
                    class35.field459 = -1;
                    return true;
                }
                for (int var186 = class168.field2701 - 1; var186 > var184; var186--) {
                    class52.field701[var186 + 1] = class52.field701[var186];
                }
                if (class168.field2701 == 0) {
                    class52.field701 = new class290[100];
                }
                class52.field701[var184 + 1] = var183;
                if (class140.field2085 == var177) {
                    class161.field2637 = var181;
                }
                class168.field2701++;
            }
            class35.field459 = -1;
            class338.field5245 = class297.field4655;
            return true;
        } else if (class35.field459 == 101) {
            class175.method1208(false, -118);
            class35.field459 = -1;
            return true;
        } else if (class35.field459 == 3) {
            class40.method278(arg0 + 62);
            int var251 = class336.field5213.method1354((byte) 80);
            int var252 = class336.field5213.method1407(true);
            int var253 = class336.field5213.method1393(3);
            class329.field5115[var252] = var251;
            class112.field1679[var252] = var253;
            class116.field1744[var252] = 1;
            for (int var254 = 0; var254 < 98; var254++) {
                if (var251 >= class173.field2746[var254]) {
                    class116.field1744[var252] = var254 + 2;
                }
            }
            class320.field5018[class200.method1465(class173.field2750++, 31)] = var252;
            class35.field459 = -1;
            return true;
        } else if (class35.field459 == 231) {
            int var191 = class336.field5213.method1354((byte) -122);
            int var192 = class336.field5213.method1396(-89);
            if (var191 < -70000) {
                var192 += 32768;
            }
            class160 var193;
            if (var191 < 0) {
                var193 = null;
            } else {
                var193 = class37.method238((byte) 99, var191);
            }
            while (class138.field2063 > class336.field5213.field3129) {
                int var194 = class336.field5213.method1362(124);
                int var195 = class336.field5213.method1396(-70);
                int var196 = 0;
                if (var195 != 0) {
                    var196 = class336.field5213.method1399(-1172389784);
                    if (var196 == 255) {
                        var196 = class336.field5213.method1354((byte) -122);
                    }
                }
                if (var193 != null && var194 >= 0 && var193.field2615.length > var194) {
                    var193.field2615[var194] = var195;
                    var193.field2559[var194] = var196;
                }
                class229.method1659(var195 - 1, var194, var192, (byte) -78, var196);
            }
            if (var193 != null) {
                class219.method1600(var193, arg0 ^ 0xFFFFFFB3);
            }
            class40.method278(0);
            class35.field465[class200.method1465(31, class149.field2279++)] = class200.method1465(32767, var192);
            class35.field459 = -1;
            return true;
        } else if (class35.field459 == 246) {
            int var250 = class336.field5213.method1396(-40);
            if (class302.method2111(var250, (byte) 89)) {
                class30.method192(16711680);
            }
            class35.field459 = -1;
            return true;
        } else if (class35.field459 == 80) {
            long var234 = class336.field5213.method1346(2);
            class336.field5213.method1377(true);
            long var236 = class336.field5213.method1346(2);
            long var238 = (long) class336.field5213.method1396(-40);
            long var240 = (long) class336.field5213.method1378(false);
            boolean var242 = false;
            int var243 = class336.field5213.method1399(-1172389784);
            int var244 = class336.field5213.method1396(-96);
            long var245 = (var238 << 32) + var240;
            int var247 = 0;
            label1533: while (true) {
                if (var247 < 100) {
                    if (class35.field462[var247] != var245) {
                        var247++;
                        continue;
                    }
                    var242 = true;
                    break;
                }
                if (var243 <= 1) {
                    for (int var248 = 0; var248 < class271.field4291; var248++) {
                        if (class157.field2424[var248] == var234) {
                            var242 = true;
                            break label1533;
                        }
                    }
                }
                break;
            }
            if (!var242 && class269.field4252 == 0) {
                class35.field462[class208.field3407] = var245;
                class208.field3407 = (class208.field3407 + 1) % 100;
                String var249 = class21.method137(var244, (byte) 92).method1982(class336.field5213, -1);
                if (var243 == 2 || var243 == 3) {
                    class192.method1405(var249, 20, class331.method2290((byte) 120, var236), var244, "<img=1>" + class331.method2290((byte) 120, var234), arg0 + 1637740830);
                } else if (var243 == 1) {
                    class192.method1405(var249, 20, class331.method2290((byte) 120, var236), var244, "<img=0>" + class331.method2290((byte) 120, var234), 1637740768);
                } else {
                    class192.method1405(var249, 20, class331.method2290((byte) 120, var236), var244, class331.method2290((byte) 120, var234), 1637740768);
                }
            }
            class35.field459 = -1;
            return true;
        } else if (class35.field459 == 105) {
            int var197 = class336.field5213.method1399(-1172389784);
            int var198 = var197 >> 5;
            int var199 = var197 & 0x1F;
            if (var199 == 0) {
                class283.field4472[var198] = null;
                class35.field459 = -1;
                return true;
            }
            class249 var200 = new class249();
            var200.field3967 = var199;
            var200.field3952 = class336.field5213.method1399(arg0 ^ 0x45E13FAA);
            if (var200.field3952 >= 0 && class158.field2431.length > var200.field3952) {
                if (var200.field3967 == 1 || var200.field3967 == 10) {
                    var200.field3951 = class336.field5213.method1396(-50);
                    class336.field5213.field3129 += 5;
                } else if (var200.field3967 >= 2 && var200.field3967 <= 6) {
                    if (var200.field3967 == 2) {
                        var200.field3948 = 64;
                        var200.field3947 = 64;
                    }
                    if (var200.field3967 == 3) {
                        var200.field3948 = 64;
                        var200.field3947 = 0;
                    }
                    if (var200.field3967 == 4) {
                        var200.field3947 = 128;
                        var200.field3948 = 64;
                    }
                    if (var200.field3967 == 5) {
                        var200.field3948 = 0;
                        var200.field3947 = 64;
                    }
                    if (var200.field3967 == 6) {
                        var200.field3947 = 64;
                        var200.field3948 = 128;
                    }
                    var200.field3967 = 2;
                    var200.field3965 = class336.field5213.method1396(-117);
                    var200.field3953 = class336.field5213.method1396(-122);
                    var200.field3954 = class336.field5213.method1399(-1172389784);
                    var200.field3950 = class336.field5213.method1396(-32);
                }
                var200.field3959 = class336.field5213.method1396(-69);
                if (var200.field3959 == 65535) {
                    var200.field3959 = -1;
                }
                class283.field4472[var198] = var200;
            }
            class35.field459 = -1;
            return true;
        } else if (class35.field459 == 131) {
            int var231 = class336.field5213.method1384(2104932360);
            int var232 = class336.field5213.method1357(true);
            int var233 = class336.field5213.method1357(true);
            if (class302.method2111(var231, (byte) 120)) {
                class5.method26(arg0 + 14870, var232, var233);
            }
            class35.field459 = -1;
            return true;
        } else if (class35.field459 == 89) {
            int var225 = class336.field5213.method1396(-40);
            int var226 = class336.field5213.method1399(arg0 - 1172389722);
            int var227 = class336.field5213.method1399(-1172389784);
            int var228 = class336.field5213.method1399(-1172389784);
            int var229 = class336.field5213.method1399(arg0 ^ 0x45E13FAA);
            int var230 = class336.field5213.method1396(-80);
            if (class302.method2111(var225, (byte) 112)) {
                class36.field483[var226] = true;
                class253.field4012[var226] = var227;
                class236.field3740[var226] = var228;
                class302.field4724[var226] = var229;
                class97.field1487[var226] = var230;
            }
            class35.field459 = -1;
            return true;
        } else if (class35.field459 == 70) {
            class40.method278(arg0 ^ 0xFFFFFFC2);
            class92.field1428 = class336.field5213.method1389(102);
            class35.field471 = class297.field4655;
            class35.field459 = -1;
            return true;
        } else if (class35.field459 == 30) {
            int var224 = class336.field5213.method1396(-68);
            if (class302.method2111(var224, (byte) 62)) {
                class274.method1955((byte) -80);
            }
            class35.field459 = -1;
            return true;
        } else if (class35.field459 == 187) {
            int var201 = class336.field5213.method1394(false);
            int var202 = class336.field5213.method1384(arg0 ^ 0x828947CA);
            int var203 = class336.field5213.method1407(true);
            class196 var204 = class297.field4657[var201];
            if (var204 != null) {
                class66.method433(var203, var202, var204, true);
            }
            class35.field459 = -1;
            return true;
        } else if (class35.field459 == 6) {
            class338.method2330((byte) -126);
            class35.field459 = -1;
            return true;
        } else if (class35.field459 == 213) {
            class336.field5213.field3129 += 28;
            if (class336.field5213.method1379(255)) {
                class281.method1991(arg0 ^ 0xFFFFFFDA, class336.field5213.field3129 - 28, class336.field5213);
            }
            class35.field459 = -1;
            return true;
        } else if (class35.field459 == 241) {
            int var217 = class336.field5213.method1384(2104932360);
            int var218 = class336.field5213.method1390((byte) 31);
            int var219 = class336.field5213.method1390((byte) 31);
            if (class302.method2111(var217, (byte) 82)) {
                class224 var220 = (class224) class176.field2870.method1743((long) var218, (byte) -65);
                class224 var221 = (class224) class176.field2870.method1743((long) var219, (byte) -48);
                if (var221 != null) {
                    class100.method707(var221, 119, var220 == null || var220.field3564 != var221.field3564);
                }
                if (var220 != null) {
                    var220.method465((byte) -122);
                    class176.field2870.method1750(var220, (byte) 122, (long) var219);
                }
                class160 var222 = class37.method238((byte) -119, var218);
                if (var222 != null) {
                    class219.method1600(var222, 120);
                }
                class160 var223 = class37.method238((byte) -116, var219);
                if (var223 != null) {
                    class219.method1600(var223, arg0 + 164);
                    class326.method2267(true, var223, 0);
                }
                if (class246.field3904 != -1) {
                    class125.method864(class246.field3904, 1, arg0 ^ 0x3D);
                }
            }
            class35.field459 = -1;
            return true;
        } else if (class35.field459 == 45) {
            long var213 = class336.field5213.method1346(arg0 ^ 0xFFFFFFC0);
            int var215 = class336.field5213.method1396(-96);
            String var216 = class21.method137(var215, (byte) 92).method1982(class336.field5213, -1);
            class192.method1405(var216, 19, (String) null, var215, class331.method2290((byte) 120, var213), 1637740768);
            class35.field459 = -1;
            return true;
        } else if (class35.field459 == 147) {
            int var210 = class336.field5213.method1397((byte) -124);
            int var211 = class336.field5213.method1396(arg0 + 26);
            int var212 = class336.field5213.method1360((byte) -56);
            if (class302.method2111(var211, (byte) 92)) {
                class166.method1147(var210, (byte) 40, var212);
            }
            class35.field459 = -1;
            return true;
        } else if (class35.field459 == 172) {
            int var207 = class336.field5213.method1384(arg0 ^ 0x828947CA);
            byte var208 = class336.field5213.method1386(false);
            int var209 = class336.field5213.method1394(false);
            if (class302.method2111(var209, (byte) 85)) {
                class115.method798(-1, var207, var208);
            }
            class35.field459 = -1;
            return true;
        } else if (class35.field459 == 180) {
            class249.field3962 = class336.field5213.method1399(-1172389784);
            class261.field4161 = class336.field5213.method1399(-1172389784);
            class218.field3507 = class336.field5213.method1399(-1172389784);
            class35.field459 = -1;
            return true;
        } else if (class35.field459 == 255) {
            int var205 = class336.field5213.method1384(arg0 ^ 0x828947CA);
            int var206 = class336.field5213.method1403(0);
            class74.method473(0, var205, var206);
            class35.field459 = -1;
            return true;
        } else {
            class314.method2186("T1 - " + class35.field459 + "," + class93.field1430 + "," + class98.field1498 + " - " + class138.field2063, 121, (Throwable) null);
            class321.method2246((byte) -128);
            return true;
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(IIIILh;JZ)V", line = 3199)
    public static final void method408(int arg0, int arg1, int arg2, int arg3, class232 arg4, long arg5, boolean arg6) {
        if (arg4 == null) {
            return;
        }
        class49 var8 = new class49();
        var8.field667 = arg4;
        var8.field682 = arg1 * 128 + 64;
        var8.field680 = arg2 * 128 + 64;
        var8.field670 = arg3;
        var8.field677 = arg5;
        var8.field668 = arg6;
        if (class251.field3996[arg0][arg1][arg2] == null) {
            class251.field3996[arg0][arg1][arg2] = new class230(arg0, arg1, arg2);
        }
        class251.field3996[arg0][arg1][arg2].field3675 = var8;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 3219)
    public static final void method409(String arg0, int arg1) {
        field762++;
        if (class52.field701 == null) {
            return;
        }
        int var2 = 0;
        long var3 = class232.method1669(37, arg0);
        if (var3 == 0L) {
            return;
        }
        while (var2 < class52.field701.length && class52.field701[var2].field916 != var3) {
            var2++;
        }
        if (var2 < class52.field701.length && class52.field701[var2] != null) {
            class218.field3502++;
            class21.field313.method1541(-50, 172);
            class21.field313.method1375(class52.field701[var2].field916, 114);
            int var5 = 122 / ((arg1 - 32) / 38);
        }
    }

    @OriginalMember(owner = "client!ff", name = "c", descriptor = "(IBI)I", line = 3262)
    public static final int method410(int arg0, byte arg1, int arg2) {
        int var3 = arg2 >>> 31;
        field755++;
        int var4 = -30 / ((arg1 - 38) / 54);
        return (arg2 + var3) / arg0 - var3;
    }

    @OriginalMember(owner = "client!ff", name = "d", descriptor = "(B)V", line = 3284)
    public final void method55(byte arg0) {
        this.method411((byte) -123);
        if (arg0 != 0) {
            this.field758 = 15;
        }
        field759++;
    }

    @OriginalMember(owner = "client!ff", name = "f", descriptor = "(B)V", line = 3300)
    private final void method411(byte arg0) {
        field769++;
        this.field760 = new int[this.field761 + 1];
        int var2 = 4096 / this.field761;
        int var3 = this.field758 * var2 >> 12;
        this.field766 = new int[this.field761 + 1];
        if (arg0 > -26) {
            method410(90, (byte) -16, 75);
        }
        int var4 = 0;
        for (int var5 = 0; var5 < this.field761; var5++) {
            this.field760[var5] = var4;
            this.field766[var5] = var3 + var4;
            var4 += var2;
        }
        this.field760[this.field761] = 4096;
        this.field766[this.field761] = this.field766[0] + 4096;
    }
}
