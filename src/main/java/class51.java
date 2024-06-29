import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fe")
public abstract class class51 extends class97 {

    @OriginalMember(owner = "client!fe", name = "s", descriptor = "[Lfe;")
    public class51[] field1293;

    @OriginalMember(owner = "client!fe", name = "o", descriptor = "Z")
    public boolean field1289;

    @OriginalMember(owner = "client!fe", name = "C", descriptor = "Z")
    public static boolean field1303 = false;

    @OriginalMember(owner = "client!fe", name = "E", descriptor = "Lea;")
    public static class38 field1305 = class9.method46((byte) 115, "AUS");

    @OriginalMember(owner = "client!fe", name = "J", descriptor = "[I")
    public static int[] field1310 = new int[32];

    @OriginalMember(owner = "client!fe", name = "B", descriptor = "I")
    public static int field1302 = 0;

    @OriginalMember(owner = "client!fe", name = "P", descriptor = "Lea;")
    private static class38 field1316 = class9.method46((byte) 123, "Please check your message)2centre for details)3");

    @OriginalMember(owner = "client!fe", name = "q", descriptor = "Lea;")
    public static class38 field1291 = field1316;

    @OriginalMember(owner = "client!fe", name = "Y", descriptor = "I")
    public static int field1325 = 0;

    @OriginalMember(owner = "client!fe", name = "N", descriptor = "Lea;")
    public static class38 field1314 = class9.method46((byte) 121, "mapfunction");

    @OriginalMember(owner = "client!fe", name = "O", descriptor = "Lea;")
    private static class38 field1315 = class9.method46((byte) 103, "Please use a different world)3");

    @OriginalMember(owner = "client!fe", name = "Q", descriptor = "Lea;")
    public static class38 field1317 = field1315;

    @OriginalMember(owner = "client!fe", name = "S", descriptor = "Lea;")
    public static class38 field1319 = field1315;

    @OriginalMember(owner = "client!fe", name = "p", descriptor = "I")
    public static int field1290;

    @OriginalMember(owner = "client!fe", name = "t", descriptor = "I")
    public static int field1294;

    @OriginalMember(owner = "client!fe", name = "u", descriptor = "I")
    public int field1295;

    @OriginalMember(owner = "client!fe", name = "v", descriptor = "I")
    public static int field1296;

    @OriginalMember(owner = "client!fe", name = "x", descriptor = "I")
    public static int field1298;

    @OriginalMember(owner = "client!fe", name = "y", descriptor = "I")
    public static int field1299;

    @OriginalMember(owner = "client!fe", name = "A", descriptor = "I")
    public int field1301;

    @OriginalMember(owner = "client!fe", name = "D", descriptor = "I")
    public static int field1304;

    @OriginalMember(owner = "client!fe", name = "F", descriptor = "I")
    public static int field1306;

    @OriginalMember(owner = "client!fe", name = "G", descriptor = "I")
    public static int field1307;

    @OriginalMember(owner = "client!fe", name = "H", descriptor = "I")
    public static int field1308;

    @OriginalMember(owner = "client!fe", name = "I", descriptor = "I")
    public static int field1309;

    @OriginalMember(owner = "client!fe", name = "K", descriptor = "I")
    public static int field1311;

    @OriginalMember(owner = "client!fe", name = "R", descriptor = "I")
    public static int field1318;

    @OriginalMember(owner = "client!fe", name = "T", descriptor = "I")
    public static int field1320;

    @OriginalMember(owner = "client!fe", name = "U", descriptor = "I")
    public static int field1321;

    @OriginalMember(owner = "client!fe", name = "V", descriptor = "I")
    public static int field1322;

    @OriginalMember(owner = "client!fe", name = "W", descriptor = "I")
    public static int field1323;

    @OriginalMember(owner = "client!fe", name = "X", descriptor = "I")
    public static int field1324;

    @OriginalMember(owner = "client!fe", name = "L", descriptor = "Llc;")
    public class101 field1312;

    @OriginalMember(owner = "client!fe", name = "z", descriptor = "Lge;")
    public static class59 field1300;

    @OriginalMember(owner = "client!fe", name = "r", descriptor = "Ljg;")
    public class87 field1292;

    @OriginalMember(owner = "client!fe", name = "M", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field1313;

    @OriginalMember(owner = "client!fe", name = "w", descriptor = "[I")
    public static int[] field1297;

    @OriginalMember(owner = "client!fe", name = "c", descriptor = "(I)V")
    public static void method368(int arg0) {
        field1310 = null;
        field1313 = null;
        if (arg0 != 17106) {
            return;
        }
        field1316 = null;
        field1317 = null;
        field1314 = null;
        field1297 = null;
        field1319 = null;
        field1315 = null;
        field1291 = null;
        field1300 = null;
        field1305 = null;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(Lhc;IZ)V")
    public void method51(class66 arg0, int arg1, boolean arg2) {
        field1324++;
        if (!arg2) {
            this.method369(64, -123, 36);
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(III)V")
    public final void method369(int arg0, int arg1, int arg2) {
        field1296++;
        int var4 = this.field1295 == 255 ? arg0 : this.field1295;
        if (this.field1289) {
            this.field1312 = new class101(var4, arg0, arg1);
        } else {
            this.field1292 = new class87(var4, arg0, arg1);
        }
        if (arg2 != -10) {
            this.method377(-3, 78, (byte) 7);
        }
    }

    @OriginalMember(owner = "client!fe", name = "d", descriptor = "(I)V")
    public void method235(int arg0) {
        field1320++;
        if (arg0 != -2) {
            this.method55(19, -36);
        }
    }

    @OriginalMember(owner = "client!fe", name = "e", descriptor = "(I)V")
    public static final void method370(int arg0) {
        field1290++;
        if (class203.field4007 != null || (arg0 != -2 || class45.field1094 != null)) {
            return;
        }
        int var1 = class165.field3424;
        if (class169.field3482) {
            if (var1 != 1) {
                int var2 = class176.field3568;
                int var3 = class10.field222;
                if (var2 < class143.field2981 - 10 || class151.field3125 + class143.field2981 + 10 < var2 || class127.field2727 - 10 > var3 || class36.field765 + class127.field2727 + 10 < var3) {
                    class169.field3482 = false;
                    class45.method326(class151.field3125, class143.field2981, class127.field2727, class36.field765, 16711680);
                }
            }
            if (var1 == 1) {
                int var4 = class127.field2727;
                int var5 = class143.field2981;
                int var6 = class87.field2029;
                int var7 = class151.field3125;
                int var8 = class105.field2345;
                int var9 = -1;
                for (int var10 = 0; var10 < class94.field2121; var10++) {
                    int var11 = (class94.field2121 - var10 - 1) * 15 + var4 + 31;
                    if (var5 < var6 && var5 + var7 > var6 && var11 - 13 < var8 && var11 + 3 > var8) {
                        var9 = var10;
                    }
                }
                if (var9 != -1) {
                    class36.method240((byte) -110, var9);
                }
                class169.field3482 = false;
                class45.method326(class151.field3125, class143.field2981, class127.field2727, class36.field765, 16711680);
                return;
            }
            return;
        }
        if (var1 == 1 && class94.field2121 > 0) {
            int var12 = class132.field2810[class94.field2121 - 1];
            if (var12 == 37 || var12 == 39 || var12 == 41 || var12 == 58 || var12 == 21 || var12 == 38 || var12 == 30 || var12 == 12 || var12 == 43 || var12 == 57 || var12 == 5 || var12 == 1005) {
                int var13 = class149.field3090[class94.field2121 - 1];
                int var14 = class141.field2972[class94.field2121 - 1];
                class43 var15 = class98.method813(var13, arg0 ^ 0xFFFFEFFE);
                if (method371(class40.method299(var15, arg0 + 27), 31) || class111.method878(-32, class40.method299(var15, 25))) {
                    class185.field3695 = 0;
                    class179.field3627 = false;
                    if (class203.field4007 != null) {
                        class172.method1209(class203.field4007, -1);
                    }
                    class203.field4007 = class98.method813(var13, 4096);
                    field1325 = var14;
                    class66.field1574 = class87.field2029;
                    class140.field2942 = class105.field2345;
                    class172.method1209(class203.field4007, -1);
                    return;
                }
            }
        }
        if (var1 == 1 && (class9.field206 == 1 && class94.field2121 > 2 || class202.method1326(class94.field2121 - 1, 2000))) {
            var1 = 2;
        }
        if (var1 == 1 && class94.field2121 > 0) {
            class36.method240((byte) -86, class94.field2121 - 1);
        }
        if (var1 != 2 || class94.field2121 <= 0) {
            return;
        }
        class151.method1057(arg0 + 106);
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(II)Z")
    private static final boolean method371(int arg0, int arg1) {
        field1322++;
        if (arg1 < 8) {
            method368(125);
        }
        return (arg0 >> 28 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(B)V")
    public final void method372(byte arg0) {
        if (this.field1289) {
            this.field1312.method835((byte) -92);
            this.field1312 = null;
        } else {
            this.field1292.method723(2);
            this.field1292 = null;
        }
        if (arg0 < 98) {
            this.method375(-98);
        }
        field1311++;
    }

    @OriginalMember(owner = "client!fe", name = "f", descriptor = "(I)Z")
    public static final boolean method373(int arg0) {
        field1318++;
        if (arg0 < 125) {
            return true;
        } else if (class45.field1104 == 0) {
            return class52.field1336.method536(75);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!fe", name = "g", descriptor = "(I)I")
    public int method374(int arg0) {
        if (arg0 <= 70) {
            method370(-97);
        }
        field1306++;
        return -1;
    }

    @OriginalMember(owner = "client!fe", name = "<init>", descriptor = "(IZ)V")
    public class51(int arg0, boolean arg1) {
        this.field1293 = new class51[arg0];
        this.field1289 = arg1;
    }

    @OriginalMember(owner = "client!fe", name = "h", descriptor = "(I)I")
    public int method375(int arg0) {
        if (arg0 != -30563) {
            field1303 = false;
        }
        field1308++;
        return -1;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(BI)[[I")
    public int[][] method52(byte arg0, int arg1) {
        if (arg0 < 111) {
            this.field1295 = -34;
        }
        field1321++;
        throw new IllegalStateException("This operation does not have a colour output");
    }

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "(III)[I")
    public final int[] method376(int arg0, int arg1, int arg2) {
        if (arg2 > -27) {
            field1303 = false;
        }
        field1323++;
        return this.field1293[arg1].field1289 ? this.field1293[arg1].method55(-127, arg0) : this.field1293[arg1].method52((byte) 119, arg0)[0];
    }

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "(II)[I")
    public int[] method55(int arg0, int arg1) {
        if (arg0 >= -125) {
            field1294 = 60;
        }
        field1298++;
        throw new IllegalStateException("This operation does not have a monochrome output");
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(IIB)[[I")
    public final int[][] method377(int arg0, int arg1, byte arg2) {
        if (arg2 >= -75) {
            return null;
        }
        field1309++;
        if (this.field1293[arg0].field1289) {
            int[] var4 = this.field1293[arg0].method55(-126, arg1);
            return new int[][] { var4, var4, var4 };
        } else {
            return this.field1293[arg0].method52((byte) 125, arg1);
        }
    }
}
