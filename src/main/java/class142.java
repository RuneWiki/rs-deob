import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fa")
public class class142 {

    @OriginalMember(owner = "client!fa", name = "d", descriptor = "I")
    public int field1886;

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "Lus;")
    public static class1 field1884 = new class1(17, 14);

    @OriginalMember(owner = "client!fa", name = "i", descriptor = "Lus;")
    public static class1 field1891 = new class1(65, 12);

    @OriginalMember(owner = "client!fa", name = "j", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field1892 = new CRC32();

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "I")
    public static int field1883;

    @OriginalMember(owner = "client!fa", name = "c", descriptor = "I")
    public static int field1885;

    @OriginalMember(owner = "client!fa", name = "e", descriptor = "I")
    public static int field1887;

    @OriginalMember(owner = "client!fa", name = "f", descriptor = "I")
    public static int field1888;

    @OriginalMember(owner = "client!fa", name = "g", descriptor = "I")
    public static int field1889;

    @OriginalMember(owner = "client!fa", name = "h", descriptor = "I")
    public static int field1890;

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(CB)C")
    public static final char method890(char arg0, byte arg1) {
        field1890++;
        int var2 = -14 % ((arg1 + 35) / 61);
        if (arg0 == ' ' || arg0 == ' ' || arg0 == '_' || arg0 == '-') {
            return '_';
        } else if (arg0 == '[' || arg0 == ']' || arg0 == '#') {
            return arg0;
        } else if (arg0 == 'à' || arg0 == 'á' || arg0 == 'â' || arg0 == 'ä' || arg0 == 'ã' || arg0 == 'À' || arg0 == 'Á' || arg0 == 'Â' || arg0 == 'Ä' || arg0 == 'Ã') {
            return 'a';
        } else if (arg0 == 'è' || arg0 == 'é' || arg0 == 'ê' || arg0 == 'ë' || arg0 == 'È' || arg0 == 'É' || arg0 == 'Ê' || arg0 == 'Ë') {
            return 'e';
        } else if (arg0 == 'í' || arg0 == 'î' || arg0 == 'ï' || arg0 == 'Í' || arg0 == 'Î' || arg0 == 'Ï') {
            return 'i';
        } else if (arg0 == 'ò' || arg0 == 'ó' || arg0 == 'ô' || arg0 == 'ö' || arg0 == 'õ' || arg0 == 'Ò' || arg0 == 'Ó' || arg0 == 'Ô' || arg0 == 'Ö' || arg0 == 'Õ') {
            return 'o';
        } else if (arg0 == 'ù' || arg0 == 'ú' || arg0 == 'û' || arg0 == 'ü' || arg0 == 'Ù' || arg0 == 'Ú' || arg0 == 'Û' || arg0 == 'Ü') {
            return 'u';
        } else if (arg0 == 'ç' || arg0 == 'Ç') {
            return 'c';
        } else if (arg0 == 'ÿ' || arg0 == 'Ÿ') {
            return 'y';
        } else if (arg0 == 'ñ' || arg0 == 'Ñ') {
            return 'n';
        } else if (arg0 == 'ß') {
            return 'b';
        } else {
            return Character.toLowerCase(arg0);
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(Lcj;IBI)V")
    public static final void method891(class451 arg0, int arg1, byte arg2, int arg3) {
        field1889++;
        if (arg0 == null || class160.field2365.field6838 == arg0) {
            return;
        }
        int var4 = arg0.field6236;
        int var5 = arg0.field6234;
        int var6 = arg0.field6245;
        int var7 = (int) arg0.field6235;
        if (var6 >= 2000) {
            var6 -= 2000;
        }
        long var8 = arg0.field6235;
        if (var6 == 15) {
            class452 var10 = class124.field1559[var7];
            if (var10 != null) {
                class153.field2270++;
                class279.field4100 = arg1;
                class264.field3854 = arg3;
                class76.field938 = 0;
                class202.field2967 = 2;
                class15.method110(class172.field2503, -126);
                class225.field3415.method1689(var7, (byte) 115);
                class225.field3415.method1695(class272.field3959.method2712(2, 82) ? 1 : 0, true);
                class279.method1768(true, -2, false, var10.method918(false), 0, var10.field2159[0], 0, var10.field2163[0], var10.method918(false));
            }
        }
        if (var6 == 4) {
            class216 var11 = class139.field1851[var7];
            if (var11 != null) {
                class202.field2967 = 2;
                class264.field3854 = arg3;
                class247.field3656++;
                class279.field4100 = arg1;
                class76.field938 = 0;
                class15.method110(class107.field1341, -127);
                class225.field3415.method1694(var7, -69);
                class225.field3415.method1753(true, class272.field3959.method2712(2, 82) ? 1 : 0);
                class279.method1768(true, -2, false, var11.method918(false), 0, var11.field2159[0], 0, var11.field2163[0], var11.method918(false));
            }
        }
        if (var6 == 57) {
            class467.field6584++;
            class202.field2967 = 2;
            class279.field4100 = arg1;
            class76.field938 = 0;
            class264.field3854 = arg3;
            class15.method110(class45.field648, -128);
            class225.field3415.method1711(false, class360.field5180 + var5);
            class225.field3415.method1711(false, class240.field3602 + var4);
            class225.field3415.method1694(var7, arg2 ^ 0xD);
            class225.field3415.method1753(true, class272.field3959.method2712(2, 82) ? 1 : 0);
            class191.method1182(-6513, var5, var4);
        }
        if (var6 == 9) {
            class216 var12 = class139.field1851[var7];
            if (var12 != null) {
                class264.field3854 = arg3;
                class202.field2967 = 2;
                class276.field4024++;
                class279.field4100 = arg1;
                class76.field938 = 0;
                class15.method110(class410.field5748, -128);
                class225.field3415.method1711(false, var7);
                class225.field3415.method1695(class272.field3959.method2712(2, 82) ? 1 : 0, true);
                class279.method1768(true, -2, false, var12.method918(false), 0, var12.field2159[0], 0, var12.field2163[0], var12.method918(false));
            }
        }
        if (var6 == 49) {
            class361.field5195++;
            class202.field2967 = 2;
            class76.field938 = 0;
            class279.field4100 = arg1;
            class264.field3854 = arg3;
            class15.method110(class112.field1419, -127);
            class225.field3415.method1720(class255.field3739, (byte) -8);
            class225.field3415.method1753(true, class272.field3959.method2712(2, 82) ? 1 : 0);
            class225.field3415.method1724((byte) -128, class40.field523);
            class225.field3415.method1694(class360.field5180 + var5, -71);
            class225.field3415.method1694((int) (var8 >>> 32) & Integer.MAX_VALUE, 107);
            class225.field3415.method1711(false, class240.field3602 + var4);
            class225.field3415.method1694(class359.field5170, arg2 + 205);
            class307.method1901(var8, var5, var4, 20710);
        }
        if (var6 == 8) {
            class145 var13 = class441.method2598((byte) -127, var5, var4);
            if (var13 != null) {
                class382.method2305(-124);
                class385 var14 = client.method1122(var13);
                class62.method386(var13.field1964, var13.field2059, var14.method2319(-2829), var5, var4, true, var14.field5469);
                class489.field6894 = class138.method868(41, var13);
                if (class489.field6894 == null) {
                    class489.field6894 = "Null";
                }
                class373.field5386 = var13.field1928 + "<col=ffffff>";
            }
            return;
        }
        if (var6 == 51) {
            class279.field4100 = arg1;
            client.field2617++;
            class202.field2967 = 2;
            class264.field3854 = arg3;
            class76.field938 = 0;
            class15.method110(class1.field6, arg2 ^ 0x2B);
            class225.field3415.method1727(class272.field3959.method2712(2, 82) ? 1 : 0, 0);
            class225.field3415.method1689(var7, (byte) 126);
            class225.field3415.method1724((byte) -122, class360.field5180 + var5);
            class225.field3415.method1711(false, class240.field3602 + var4);
            class191.method1182(-6513, var5, var4);
        }
        if (var6 == 2 && class207.field3166 == null) {
            class126.method793(var5, 20, var4);
            class207.field3166 = class441.method2598((byte) -127, var5, var4);
            class22.method148((byte) -78, class207.field3166);
        }
        if (var6 == 17) {
            class326.field4705++;
            class264.field3854 = arg3;
            class279.field4100 = arg1;
            class202.field2967 = 2;
            class76.field938 = 0;
            class15.method110(class348.field5046, arg2 - 41);
            class225.field3415.method1694(var7, 83);
            class225.field3415.method1724((byte) -125, class360.field5180 + var5);
            class225.field3415.method1695(class272.field3959.method2712(2, 82) ? 1 : 0, true);
            class225.field3415.method1724((byte) -121, class240.field3602 + var4);
            class191.method1182(-6513, var5, var4);
        }
        if (var6 == 1007) {
            class427.field5973++;
            class202.field2967 = 2;
            class279.field4100 = arg1;
            class76.field938 = 0;
            class264.field3854 = arg3;
            class15.method110(class265.field3873, -126);
            class225.field3415.method1711(false, var7);
        }
        if (var6 == 1008) {
            class264.field3854 = arg3;
            class202.field2967 = 2;
            class279.field4100 = arg1;
            class492.field6936++;
            class76.field938 = 0;
            class15.method110(class421.field5879, -128);
            class225.field3415.method1711(false, var7);
        }
        if (var6 == 44) {
            if (class362.field5213 > 0 && class272.field3959.method2712(2, 82) && class272.field3959.method2712(2, 81)) {
                class382.method2308(class492.field6935.field4319, class240.field3602 + var4, class360.field5180 + var5, -55);
            } else {
                class264.field3854 = arg3;
                class76.field938 = 0;
                class202.field2967 = 1;
                class279.field4100 = arg1;
                class43.field629++;
                class15.method110(class136.field1801, -125);
                class225.field3415.method1689(class360.field5180 + var5, (byte) 124);
                class225.field3415.method1689(class240.field3602 + var4, (byte) 127);
            }
        }
        if (var6 == 6) {
            class452 var15 = class124.field1559[var7];
            if (var15 != null) {
                class279.field4100 = arg1;
                class76.field938 = 0;
                class394.field5586++;
                class202.field2967 = 2;
                class264.field3854 = arg3;
                class15.method110(class481.field6769, -126);
                class225.field3415.method1694(var7, arg2 ^ 0xFFFFFFFA);
                class225.field3415.method1695(class272.field3959.method2712(2, 82) ? 1 : 0, true);
                class279.method1768(true, -2, false, var15.method918(false), 0, var15.field2159[0], 0, var15.field2163[0], var15.method918(false));
            }
        }
        if (var6 == 47) {
            if (class362.field5213 > 0 && class272.field3959.method2712(2, 82) && class272.field3959.method2712(arg2 ^ 0xFFFFFFA8, 81)) {
                class382.method2308(class492.field6935.field4319, class240.field3602 + var4, class360.field5180 + var5, arg2 - 30);
            } else {
                class356.method2219(var4, var7, 124, var5);
                if (var7 == 1) {
                    class225.field3415.method1753(true, -1);
                    class225.field3415.method1753(true, -1);
                    class225.field3415.method1711(false, (int) class157.field2346);
                    class225.field3415.method1753(true, 57);
                    class225.field3415.method1753(true, class84.field1032);
                    class225.field3415.method1753(true, class216.field3251);
                    class225.field3415.method1753(true, 89);
                    class225.field3415.method1711(false, class492.field6935.field4331);
                    class225.field3415.method1711(false, class492.field6935.field4317);
                    class225.field3415.method1753(true, 63);
                } else {
                    class279.field4100 = arg1;
                    class202.field2967 = 1;
                    class264.field3854 = arg3;
                    class76.field938 = 0;
                }
                class279.method1768(true, -4, false, 1, 0, var5, 0, var4, 1);
            }
        }
        if (var6 == 5) {
            class279.field4100 = arg1;
            class76.field938 = 0;
            class327.field4730++;
            class264.field3854 = arg3;
            class202.field2967 = 2;
            class15.method110(class38.field502, -126);
            class225.field3415.method1718(class272.field3959.method2712(2, 82) ? 1 : 0, 32734);
            class225.field3415.method1689(class40.field523, (byte) 124);
            class225.field3415.method1711(false, var5 + class360.field5180);
            class225.field3415.method1690(class255.field3739, -149045192);
            class225.field3415.method1724((byte) 82, var7);
            class225.field3415.method1724((byte) 29, class359.field5170);
            class225.field3415.method1724((byte) 49, class240.field3602 + var4);
            class191.method1182(-6513, var5, var4);
        }
        if (var6 == 19) {
            class488.field6880++;
            class202.field2967 = 2;
            class76.field938 = 0;
            class279.field4100 = arg1;
            class264.field3854 = arg3;
            class15.method110(class243.field3623, -127);
            class225.field3415.method1724((byte) -122, class240.field3602 + var4);
            class225.field3415.method1753(true, class272.field3959.method2712(2, 82) ? 1 : 0);
            class225.field3415.method1711(false, (int) (var8 >>> 32) & Integer.MAX_VALUE);
            class225.field3415.method1724((byte) -125, class360.field5180 + var5);
            class307.method1901(var8, var5, var4, 20710);
        }
        if (var6 == 20) {
            class452 var16 = class124.field1559[var7];
            if (var16 != null) {
                class202.field2967 = 2;
                class76.field938 = 0;
                class306.field4351++;
                class264.field3854 = arg3;
                class279.field4100 = arg1;
                class15.method110(class218.field3273, -126);
                class225.field3415.method1727(class272.field3959.method2712(2, 82) ? 1 : 0, arg2 ^ 0xFFFFFFAA);
                class225.field3415.method1724((byte) 112, var7);
                class225.field3415.method1689(class40.field523, (byte) 122);
                class225.field3415.method1711(false, class359.field5170);
                class225.field3415.method1752(class255.field3739, 25580);
                class279.method1768(true, -2, false, var16.method918(false), 0, var16.field2159[0], 0, var16.field2163[0], var16.method918(false));
            }
        }
        if (var6 == 21) {
            class264.field3854 = arg3;
            class279.field4100 = arg1;
            class387.field5493++;
            class76.field938 = 0;
            class202.field2967 = 2;
            class15.method110(class438.field6087, -126);
            class225.field3415.method1727(class272.field3959.method2712(2, 82) ? 1 : 0, 0);
            class225.field3415.method1694(class240.field3602 + var4, -84);
            class225.field3415.method1694(class360.field5180 + var5, arg2 ^ 0xFFFFFFFE);
            class225.field3415.method1689(Integer.MAX_VALUE & (int) (var8 >>> 32), (byte) 117);
            class307.method1901(var8, var5, var4, 20710);
        }
        if (var6 == 11 || var6 == 1004) {
            class245.method1539(arg0.field6246, var7, var4, 3188, var5);
        }
        if (var6 == 25) {
            class279.field4100 = arg1;
            class76.field938 = 0;
            class255.field3730++;
            class202.field2967 = 2;
            class264.field3854 = arg3;
            class15.method110(class476.field6687, -128);
            class225.field3415.method1727(class272.field3959.method2712(2, 82) ? 1 : 0, 0);
            class225.field3415.method1711(false, Integer.MAX_VALUE & (int) (var8 >>> 32));
            class225.field3415.method1694(class360.field5180 + var5, 122);
            class225.field3415.method1694(class240.field3602 + var4, 82);
            class307.method1901(var8, var5, var4, 20710);
        }
        if (var6 == 30) {
            class452 var17 = class124.field1559[var7];
            if (var17 != null) {
                class76.field938 = 0;
                class202.field2967 = 2;
                class279.field4100 = arg1;
                class264.field3854 = arg3;
                class36.field474++;
                class15.method110(class239.field3583, -125);
                class225.field3415.method1753(true, class272.field3959.method2712(2, 82) ? 1 : 0);
                class225.field3415.method1694(var7, arg2 ^ 0x11);
                class279.method1768(true, -2, false, var17.method918(false), 0, var17.field2159[0], 0, var17.field2163[0], var17.method918(false));
            }
        }
        if (var6 == 45) {
            class452 var18 = class124.field1559[var7];
            if (var18 != null) {
                client.field2603++;
                class76.field938 = 0;
                class202.field2967 = 2;
                class264.field3854 = arg3;
                class279.field4100 = arg1;
                class15.method110(class93.field1185, arg2 ^ 0x29);
                class225.field3415.method1711(false, var7);
                class225.field3415.method1718(class272.field3959.method2712(2, 82) ? 1 : 0, 32734);
                class279.method1768(true, -2, false, var18.method918(false), 0, var18.field2159[0], 0, var18.field2163[0], var18.method918(false));
            }
        }
        if (var6 == 3) {
            class216 var19 = class139.field1851[var7];
            if (var19 != null) {
                class154.field2291++;
                class264.field3854 = arg3;
                class202.field2967 = 2;
                class76.field938 = 0;
                class279.field4100 = arg1;
                class15.method110(class118.field1490, -128);
                class225.field3415.method1694(class359.field5170, arg2 + 39);
                class225.field3415.method1720(class255.field3739, (byte) -8);
                class225.field3415.method1694(var7, -29);
                class225.field3415.method1689(class40.field523, (byte) 120);
                class225.field3415.method1727(class272.field3959.method2712(arg2 ^ 0xFFFFFFA8, 82) ? 1 : 0, 0);
                class279.method1768(true, -2, false, var19.method918(false), 0, var19.field2159[0], 0, var19.field2163[0], var19.method918(false));
            }
        }
        if (var6 == 23) {
            class452 var20 = class124.field1559[var7];
            if (var20 != null) {
                class349.field5048++;
                class76.field938 = 0;
                class279.field4100 = arg1;
                class264.field3854 = arg3;
                class202.field2967 = 2;
                class15.method110(class446.field6175, arg2 ^ 0x2B);
                class225.field3415.method1724((byte) -127, var7);
                class225.field3415.method1695(class272.field3959.method2712(2, 82) ? 1 : 0, true);
                class279.method1768(true, -2, false, var20.method918(false), 0, var20.field2159[0], 0, var20.field2163[0], var20.method918(false));
            }
        }
        if (var6 == 18) {
            class452 var21 = class124.field1559[var7];
            if (var21 != null) {
                class264.field3854 = arg3;
                class267.field3897++;
                class279.field4100 = arg1;
                class76.field938 = 0;
                class202.field2967 = 2;
                class15.method110(class157.field2339, arg2 ^ 0x2A);
                class225.field3415.method1695(class272.field3959.method2712(2, 82) ? 1 : 0, true);
                class225.field3415.method1694(var7, -126);
                class279.method1768(true, -2, false, var21.method918(false), 0, var21.field2159[0], 0, var21.field2163[0], var21.method918(false));
            }
        }
        if (arg2 != -86) {
            field1888 = -118;
        }
        if (var6 == 48) {
            class279.field4100 = arg1;
            class202.field2967 = 1;
            class76.field938 = 0;
            class264.field3854 = arg3;
            class481.field6770++;
            class15.method110(class236.field3551, arg2 ^ 0x28);
            class225.field3415.method1689(class359.field5170, (byte) 126);
            class225.field3415.method1694(class40.field523, -109);
            class225.field3415.method1711(false, class360.field5180 + var5);
            class225.field3415.method1694(class240.field3602 + var4, 101);
            class225.field3415.method1752(class255.field3739, 25580);
            class279.method1768(true, -4, false, 1, 0, var5, 0, var4, 1);
        }
        if (var6 == 60) {
            class264.field3854 = arg3;
            class81.field988++;
            class76.field938 = 0;
            class279.field4100 = arg1;
            class202.field2967 = 2;
            class15.method110(class151.field2244, arg2 ^ 0x2A);
            class225.field3415.method1753(true, class272.field3959.method2712(2, 82) ? 1 : 0);
            class225.field3415.method1689(Integer.MAX_VALUE & (int) (var8 >>> 32), (byte) 117);
            class225.field3415.method1689(class360.field5180 + var5, (byte) 123);
            class225.field3415.method1689(class240.field3602 + var4, (byte) 121);
            class307.method1901(var8, var5, var4, 20710);
        }
        if (var6 == 10) {
            class216 var22 = class139.field1851[var7];
            if (var22 != null) {
                class291.field4243++;
                class202.field2967 = 2;
                class76.field938 = 0;
                class264.field3854 = arg3;
                class279.field4100 = arg1;
                class15.method110(class472.field6638, -126);
                class225.field3415.method1718(class272.field3959.method2712(2, 82) ? 1 : 0, 32734);
                class225.field3415.method1694(var7, -49);
                class279.method1768(true, -2, false, var22.method918(false), 0, var22.field2159[0], 0, var22.field2163[0], var22.method918(false));
            }
        }
        if (var6 == 1012) {
            class264.field3854 = arg3;
            class76.field938 = 0;
            class279.field4100 = arg1;
            class202.field2967 = 2;
            class216 var23 = class139.field1851[var7];
            if (var23 != null) {
                class466 var24 = var23.field3232;
                if (var24.field6526 != null) {
                    var24 = var24.method2742(-118, class140.field1859);
                }
                if (var24 != null) {
                    class15.method110(class420.field5862, arg2 - 41);
                    class190.field2826++;
                    class225.field3415.method1711(false, var24.field6570);
                }
            }
        }
        if (var6 == 13) {
            class76.field938 = 0;
            class474.field6664++;
            class202.field2967 = 2;
            class264.field3854 = arg3;
            class279.field4100 = arg1;
            class15.method110(class250.field3694, -128);
            class225.field3415.method1753(true, class272.field3959.method2712(2, 82) ? 1 : 0);
            class225.field3415.method1694(var7, -103);
            class225.field3415.method1724((byte) -128, class240.field3602 + var4);
            class225.field3415.method1694(class360.field5180 + var5, arg2 + 57);
            class191.method1182(-6513, var5, var4);
        }
        if (var6 == 22) {
            class452 var25 = class124.field1559[var7];
            if (var25 != null) {
                class264.field3854 = arg3;
                class279.field4100 = arg1;
                class202.field2967 = 2;
                class76.field938 = 0;
                class343.field4993++;
                class15.method110(class441.field6122, -125);
                class225.field3415.method1695(class272.field3959.method2712(2, 82) ? 1 : 0, true);
                class225.field3415.method1694(var7, 93);
                class279.method1768(true, -2, false, var25.method918(false), 0, var25.field2159[0], 0, var25.field2163[0], var25.method918(false));
            }
        }
        if (var6 == 46) {
            class216 var26 = class139.field1851[var7];
            if (var26 != null) {
                class442.field6128++;
                class202.field2967 = 2;
                class76.field938 = 0;
                class264.field3854 = arg3;
                class279.field4100 = arg1;
                class15.method110(class330.field4785, arg2 - 40);
                class225.field3415.method1718(class272.field3959.method2712(2, 82) ? 1 : 0, 32734);
                class225.field3415.method1724((byte) -123, var7);
                class279.method1768(true, -2, false, var26.method918(false), 0, var26.field2159[0], 0, var26.field2163[0], var26.method918(false));
            }
        }
        if (var6 == 12) {
            class145 var27 = class441.method2598((byte) -127, var5, var4);
            if (var27 != null) {
                class401.method2396(arg2 - 39, var27);
            }
        }
        if (var6 == 58) {
            class216 var28 = class139.field1851[var7];
            if (var28 != null) {
                class264.field3854 = arg3;
                class76.field938 = 0;
                class202.field2967 = 2;
                class87.field1054++;
                class279.field4100 = arg1;
                class15.method110(class143.field1893, arg2 ^ 0x28);
                class225.field3415.method1689(var7, (byte) 119);
                class225.field3415.method1727(class272.field3959.method2712(2, 82) ? 1 : 0, 0);
                class279.method1768(true, -2, false, var28.method918(false), 0, var28.field2159[0], 0, var28.field2163[0], var28.method918(false));
            }
        }
        if (var6 == 1010 || var6 == 1001 || var6 == 1009 || var6 == 1006 || var6 == 1002) {
            class131.method821(var4, var6, var7, (byte) -113);
        }
        if (var6 == 59) {
            class452 var29 = class124.field1559[var7];
            if (var29 != null) {
                class279.field4100 = arg1;
                class76.field938 = 0;
                class264.field3854 = arg3;
                class202.field2967 = 2;
                class59.field794++;
                class15.method110(class435.field6059, -126);
                class225.field3415.method1753(true, class272.field3959.method2712(2, 82) ? 1 : 0);
                class225.field3415.method1724((byte) -122, var7);
                class279.method1768(true, -2, false, var29.method918(false), 0, var29.field2159[0], 0, var29.field2163[0], var29.method918(false));
            }
        }
        if (var6 == 1003) {
            class339.field4944++;
            class76.field938 = 0;
            class264.field3854 = arg3;
            class202.field2967 = 2;
            class279.field4100 = arg1;
            class15.method110(class141.field1874, -127);
            class225.field3415.method1724((byte) 32, class360.field5180 + var5);
            class225.field3415.method1711(false, class240.field3602 + var4);
            class225.field3415.method1753(true, class272.field3959.method2712(2, 82) ? 1 : 0);
            class225.field3415.method1694(Integer.MAX_VALUE & (int) (var8 >>> 32), -126);
            class307.method1901(var8, var5, var4, 20710);
        }
        if (var6 == 50) {
            class224.field3396++;
            class76.field938 = 0;
            class202.field2967 = 2;
            class264.field3854 = arg3;
            class279.field4100 = arg1;
            class15.method110(class278.field4091, -125);
            class225.field3415.method1694(var7, arg2 - 33);
            class225.field3415.method1727(class272.field3959.method2712(2, 82) ? 1 : 0, 0);
            class225.field3415.method1694(var5 + class360.field5180, 107);
            class225.field3415.method1724((byte) 0, class240.field3602 + var4);
            class191.method1182(-6513, var5, var4);
        }
        if (class36.field473) {
            class382.method2305(arg2 - 40);
        }
        if (class291.field4240 != null && class87.field1061 == 0) {
            class22.method148((byte) -78, class291.field4240);
        }
    }

    @OriginalMember(owner = "client!fa", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field1887++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "([[[Lct;I)V")
    public static final void method892(class88[][][] arg0, int arg1) {
        field1883++;
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class88[][] var3 = arg0[var2];
            for (int var4 = 0; var4 < var3.length; var4++) {
                for (int var5 = 0; var5 < var3[var4].length; var5++) {
                    class88 var6 = var3[var4][var5];
                    if (var6 != null) {
                        if (var6.field1070 instanceof class106) {
                            ((class106) var6.field1070).method111(73);
                        }
                        if (var6.field1087 instanceof class106) {
                            ((class106) var6.field1087).method111(104);
                        }
                        if (var6.field1066 instanceof class106) {
                            ((class106) var6.field1066).method111(91);
                        }
                        if (var6.field1078 instanceof class106) {
                            ((class106) var6.field1078).method111(arg1 ^ 0x1D72);
                        }
                        if (var6.field1082 instanceof class106) {
                            ((class106) var6.field1082).method111(arg1 - 7346);
                        }
                        for (class93 var7 = var6.field1068; var7 != null; var7 = var7.field1178) {
                            class304 var8 = var7.field1177;
                            if (var8 instanceof class106) {
                                ((class106) var8).method111(68);
                            }
                        }
                    }
                }
            }
        }
        if (arg1 != 7441) {
            method893(0);
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(I)V")
    public static void method893(int arg0) {
        field1884 = null;
        if (arg0 != -2) {
            method891((class451) null, -5, (byte) -31, -98);
        }
        field1892 = null;
        field1891 = null;
    }

    @OriginalMember(owner = "client!fa", name = "<init>", descriptor = "(II)V")
    public class142(int arg0, int arg1) {
        this.field1886 = arg0;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(IB)I")
    public static final int method894(int arg0, byte arg1) {
        field1885++;
        int var2 = 62 % ((74 - arg1) / 44);
        return arg0 >>> 8;
    }
}
