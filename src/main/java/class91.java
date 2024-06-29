import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ai")
public class class91 {

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "I")
    public int field1423 = 99;

    @OriginalMember(owner = "client!ai", name = "c", descriptor = "I")
    public int field1425 = -1;

    @OriginalMember(owner = "client!ai", name = "m", descriptor = "Z")
    public boolean field1435 = false;

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "Z")
    public boolean field1424 = false;

    @OriginalMember(owner = "client!ai", name = "g", descriptor = "I")
    public int field1429 = -1;

    @OriginalMember(owner = "client!ai", name = "u", descriptor = "Z")
    public boolean field1443 = false;

    @OriginalMember(owner = "client!ai", name = "w", descriptor = "I")
    public int field1445 = -1;

    @OriginalMember(owner = "client!ai", name = "t", descriptor = "I")
    public int field1442 = -1;

    @OriginalMember(owner = "client!ai", name = "E", descriptor = "I")
    public int field1453 = 2;

    @OriginalMember(owner = "client!ai", name = "y", descriptor = "I")
    public int field1447 = 5;

    @OriginalMember(owner = "client!ai", name = "x", descriptor = "Z")
    public boolean field1446 = false;

    @OriginalMember(owner = "client!ai", name = "p", descriptor = "I")
    public int field1438 = -1;

    @OriginalMember(owner = "client!ai", name = "j", descriptor = "Z")
    public static boolean field1432 = false;

    @OriginalMember(owner = "client!ai", name = "B", descriptor = "Z")
    public static boolean field1450 = false;

    @OriginalMember(owner = "client!ai", name = "q", descriptor = "I")
    public static int field1439 = 0;

    @OriginalMember(owner = "client!ai", name = "o", descriptor = "Ljava/lang/String;")
    public static String field1437 = "Loaded title screen";

    @OriginalMember(owner = "client!ai", name = "e", descriptor = "I")
    public static int field1427;

    @OriginalMember(owner = "client!ai", name = "f", descriptor = "I")
    public static int field1428;

    @OriginalMember(owner = "client!ai", name = "i", descriptor = "I")
    public static int field1431;

    @OriginalMember(owner = "client!ai", name = "k", descriptor = "I")
    public static int field1433;

    @OriginalMember(owner = "client!ai", name = "r", descriptor = "I")
    public static int field1440;

    @OriginalMember(owner = "client!ai", name = "s", descriptor = "I")
    public static int field1441;

    @OriginalMember(owner = "client!ai", name = "v", descriptor = "I")
    public static int field1444;

    @OriginalMember(owner = "client!ai", name = "z", descriptor = "I")
    public static int field1448;

    @OriginalMember(owner = "client!ai", name = "A", descriptor = "I")
    public static int field1449;

    @OriginalMember(owner = "client!ai", name = "G", descriptor = "I")
    public int field1455;

    @OriginalMember(owner = "client!ai", name = "h", descriptor = "Lgi;")
    public static class164 field1430;

    @OriginalMember(owner = "client!ai", name = "n", descriptor = "Lgi;")
    public static class164 field1436;

    @OriginalMember(owner = "client!ai", name = "F", descriptor = "Lrd;")
    public static class288 field1454;

    @OriginalMember(owner = "client!ai", name = "l", descriptor = "[I")
    public int[] field1434;

    @OriginalMember(owner = "client!ai", name = "C", descriptor = "[I")
    private int[] field1451;

    @OriginalMember(owner = "client!ai", name = "D", descriptor = "[I")
    public int[] field1452;

    @OriginalMember(owner = "client!ai", name = "I", descriptor = "[Lej;")
    public static class52[] field1457;

    @OriginalMember(owner = "client!ai", name = "d", descriptor = "[Z")
    public boolean[] field1426;

    @OriginalMember(owner = "client!ai", name = "H", descriptor = "[[I")
    public int[][] field1456;

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(Lfj;Z)V")
    public final void method629(class274 arg0, boolean arg1) {
        field1448++;
        while (true) {
            int var3 = arg0.method1849(255);
            if (var3 == 0) {
                if (arg1) {
                    return;
                } else {
                    method632(31);
                    return;
                }
            }
            this.method630(var3, 65, arg0);
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(IILfj;)V")
    private final void method630(int arg0, int arg1, class274 arg2) {
        if (arg0 == 1) {
            int var4 = arg2.method1837(arg1 + 187);
            this.field1452 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field1452[var5] = arg2.method1837(class81.method582(arg1, 189));
            }
            this.field1434 = new int[var4];
            for (int var6 = 0; var6 < var4; var6++) {
                this.field1434[var6] = arg2.method1837(class81.method582(arg1, 189));
            }
            for (int var7 = 0; var7 < var4; var7++) {
                this.field1434[var7] += arg2.method1837(252) << 16;
            }
        } else if (arg0 == 2) {
            this.field1442 = arg2.method1837(252);
        } else if (arg0 == 3) {
            this.field1426 = new boolean[256];
            int var8 = arg2.method1849(arg1 + 190);
            for (int var9 = 0; var9 < var8; var9++) {
                this.field1426[arg2.method1849(arg1 + 190)] = true;
            }
        } else if (arg0 == 4) {
            this.field1435 = true;
        } else if (arg0 == 5) {
            this.field1447 = arg2.method1849(arg1 ^ 0xBE);
        } else if (arg0 == 6) {
            this.field1438 = arg2.method1837(252);
        } else if (arg0 == 7) {
            this.field1425 = arg2.method1837(arg1 + 187);
        } else if (arg0 == 8) {
            this.field1423 = arg2.method1849(arg1 ^ 0xBE);
        } else if (arg0 == 9) {
            this.field1445 = arg2.method1849(arg1 ^ 0xBE);
        } else if (arg0 == 10) {
            this.field1429 = arg2.method1849(arg1 + 190);
        } else if (arg0 == 11) {
            this.field1453 = arg2.method1849(255);
        } else if (arg0 == 12) {
            int var10 = arg2.method1849(arg1 + 190);
            this.field1451 = new int[var10];
            for (int var11 = 0; var11 < var10; var11++) {
                this.field1451[var11] = arg2.method1837(252);
            }
            for (int var12 = 0; var12 < var10; var12++) {
                this.field1451[var12] = (arg2.method1837(252) << 16) + this.field1451[var12];
            }
        } else if (arg0 == 13) {
            int var13 = arg2.method1837(252);
            this.field1456 = new int[var13][];
            for (int var14 = 0; var14 < var13; var14++) {
                int var15 = arg2.method1849(255);
                if (var15 > 0) {
                    this.field1456[var14] = new int[var15];
                    this.field1456[var14][0] = arg2.method1812(true);
                    for (int var16 = 1; var16 < var15; var16++) {
                        this.field1456[var14][var16] = arg2.method1837(252);
                    }
                }
            }
        } else if (arg0 == 14) {
            this.field1424 = true;
        } else if (arg0 == 15) {
            this.field1443 = true;
        } else if (arg0 == 16) {
            this.field1446 = true;
        }
        field1441++;
        if (arg1 != 65) {
            this.method629((class274) null, true);
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(IIIIILha;)Lha;")
    public final class32 method631(int arg0, int arg1, int arg2, int arg3, int arg4, class32 arg5) {
        int var7 = this.field1452[arg0];
        field1449++;
        int var8 = this.field1434[arg0];
        class294 var9 = class215.method1476((byte) -128, var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            return arg5.method39(true, true, true);
        }
        int var11 = arg4 & 0x3;
        class294 var12 = null;
        if ((this.field1443 || class271.field4369) && arg2 != -1 && arg2 < this.field1434.length) {
            int var13 = this.field1434[arg2];
            var12 = class215.method1476((byte) -118, var13 >> 16);
            arg2 = var13 & 0xFFFF;
        }
        class32 var14;
        if (var12 == null) {
            var14 = arg5.method39(!var9.method2024(var10, 0), !var9.method2023(var10, arg3), !this.field1424);
        } else {
            var14 = arg5.method39(!var9.method2024(var10, arg3) & !var12.method2024(arg2, 0), !var9.method2023(var10, 0) & !var12.method2023(arg2, 0), !this.field1424);
        }
        if (var11 == 1) {
            var14.method29();
        } else if (var11 == 2) {
            var14.method53();
        } else if (var11 == 3) {
            var14.method44();
        }
        var14.method240(var9, var10, var12, arg2, arg1 - 1, var7, this.field1424);
        if (var11 == 1) {
            var14.method44();
        } else if (var11 == 2) {
            var14.method53();
        } else if (var11 == 3) {
            var14.method29();
        }
        if (arg3 != 0) {
            this.field1456 = null;
        }
        return var14;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(I)V")
    public static void method632(int arg0) {
        field1437 = null;
        field1436 = null;
        if (arg0 < 69) {
            method636(-36, -128, 107, (byte) -5, 62, 55);
        }
        field1454 = null;
        field1457 = null;
        field1430 = null;
    }

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "(I)V")
    public static final void method633(int arg0) {
        class120.field1900.method1876((byte) 116);
        class161.field2633.method1876((byte) 116);
        if (arg0 != -1) {
            field1432 = false;
        }
        field1431++;
        class254.field4198.method1876((byte) 127);
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(B)V")
    public final void method634(byte arg0) {
        if (this.field1445 == -1) {
            if (this.field1426 == null) {
                this.field1445 = 0;
            } else {
                this.field1445 = 2;
            }
        }
        if (arg0 <= 125) {
            this.field1424 = false;
        }
        if (this.field1429 == -1) {
            if (this.field1426 == null) {
                this.field1429 = 0;
            } else {
                this.field1429 = 2;
            }
        }
        field1444++;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(ILha;BII)Lha;")
    public final class32 method635(int arg0, class32 arg1, byte arg2, int arg3, int arg4) {
        int var6 = this.field1452[arg3];
        field1440++;
        int var7 = this.field1434[arg3];
        class294 var8 = class215.method1476((byte) -22, var7 >> 16);
        int var9 = var7 & 0xFFFF;
        if (var8 == null) {
            return arg1.method25(true, true, true);
        }
        if (arg2 != 112) {
            this.method634((byte) 98);
        }
        class294 var10 = null;
        if ((this.field1443 || class271.field4369) && arg4 != -1 && this.field1434.length > arg4) {
            int var11 = this.field1434[arg4];
            var10 = class215.method1476((byte) -119, var11 >> 16);
            arg4 = var11 & 0xFFFF;
        }
        class32 var12;
        if (var10 == null) {
            var12 = arg1.method25(!var8.method2024(var9, 0), !var8.method2023(var9, 0), !this.field1424);
        } else {
            var12 = arg1.method25(!var8.method2024(var9, 0) & !var10.method2024(arg4, 0), !var8.method2023(var9, 0) & !var10.method2023(arg4, arg2 - 112), !this.field1424);
        }
        var12.method240(var8, var9, var10, arg4, arg0 - 1, var6, this.field1424);
        return var12;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(IIIBII)V")
    public static final void method636(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5) {
        field1433++;
        int var6 = arg5 - arg0;
        int var7 = arg1 - arg4;
        if (var7 == 0) {
            if (var6 != 0) {
                class33.method246(arg5, arg4, 1, arg0, arg2);
            }
        } else if (var6 == 0) {
            class12.method100(arg3 ^ 0xFFFFFF8F, arg0, arg4, arg2, arg1);
        } else if (arg3 == -118) {
            if (var6 < 0) {
                var6 = -var6;
            }
            if (var7 < 0) {
                var7 = -var7;
            }
            boolean var8 = var6 > var7;
            if (var8) {
                int var9 = arg1;
                arg1 = arg5;
                arg5 = var9;
                int var10 = arg4;
                arg4 = arg0;
                arg0 = var10;
            }
            if (arg4 > arg1) {
                int var11 = arg4;
                arg4 = arg1;
                int var12 = arg0;
                arg1 = var11;
                arg0 = arg5;
                arg5 = var12;
            }
            int var13 = arg0;
            int var14 = arg1 - arg4;
            int var15 = arg5 - arg0;
            if (var15 < 0) {
                var15 = -var15;
            }
            int var16 = -(var14 >> 1);
            int var17 = arg5 <= arg0 ? -1 : 1;
            if (var8) {
                for (int var19 = arg4; var19 <= arg1; var19++) {
                    class232.field3629[var19][var13] = arg2;
                    var16 += var15;
                    if (var16 > 0) {
                        var16 -= var14;
                        var13 += var17;
                    }
                }
            } else {
                for (int var18 = arg4; var18 <= arg1; var18++) {
                    class232.field3629[var13][var18] = arg2;
                    var16 += var15;
                    if (var16 > 0) {
                        var13 += var17;
                        var16 -= var14;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(Lha;IIIB)Lha;")
    public final class32 method637(class32 arg0, int arg1, int arg2, int arg3, byte arg4) {
        int var6 = this.field1452[arg2];
        field1427++;
        int var7 = this.field1434[arg2];
        class294 var8 = class215.method1476((byte) 27, var7 >> 16);
        int var9 = var7 & 0xFFFF;
        if (var8 == null) {
            return arg0.method45(true, true, true);
        }
        class294 var10 = null;
        if (arg4 != 43) {
            this.field1435 = true;
        }
        if ((this.field1443 || class271.field4369) && arg1 != -1 && this.field1434.length > arg1) {
            int var11 = this.field1434[arg1];
            var10 = class215.method1476((byte) -128, var11 >> 16);
            arg1 = var11 & 0xFFFF;
        }
        class294 var12 = null;
        class294 var13 = null;
        int var14 = 0;
        int var15 = 0;
        if (this.field1451 != null) {
            if (arg2 < this.field1451.length) {
                var14 = this.field1451[arg2];
                if (var14 != 65535) {
                    var13 = class215.method1476((byte) -117, var14 >> 16);
                    var14 &= 0xFFFF;
                }
            }
            if ((this.field1443 || class271.field4369) && arg1 != -1 && this.field1451.length > arg1) {
                var15 = this.field1451[arg1];
                if (var15 != 65535) {
                    var12 = class215.method1476((byte) 41, var15 >> 16);
                    var15 &= 0xFFFF;
                }
            }
        }
        boolean var16 = !var8.method2024(var9, 0);
        boolean var17 = !var8.method2023(var9, 0);
        if (var13 != null) {
            var16 &= !var13.method2024(var14, 0);
            var17 &= !var13.method2023(var14, 0);
        }
        if (var10 != null) {
            var16 &= !var10.method2024(arg1, 0);
            var17 &= !var10.method2023(arg1, arg4 ^ 0x2B);
        }
        if (var12 != null) {
            var16 &= !var12.method2024(var15, 0);
            var17 &= !var12.method2023(var15, 0);
        }
        class32 var18 = arg0.method45(var16, var17, !this.field1424);
        var18.method240(var8, var9, var10, arg1, arg3 - 1, var6, this.field1424);
        if (var13 != null) {
            var18.method240(var13, var14, var12, var15, arg3 - 1, var6, this.field1424);
        }
        return var18;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(ZC)Z")
    public static final boolean method638(boolean arg0, char arg1) {
        if (arg0) {
            method632(75);
        }
        field1428++;
        return arg1 >= 'A' && arg1 <= 'Z' || arg1 >= 'a' && arg1 <= 'z';
    }
}
