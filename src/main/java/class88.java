import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rg")
public class class88 {

    @OriginalMember(owner = "client!rg", name = "h", descriptor = "Lda;")
    private class112 field1431 = null;

    @OriginalMember(owner = "client!rg", name = "S", descriptor = "Z")
    private boolean field1467;

    @OriginalMember(owner = "client!rg", name = "H", descriptor = "Lb;")
    private class55 field1457;

    @OriginalMember(owner = "client!rg", name = "t", descriptor = "Z")
    private boolean field1443;

    @OriginalMember(owner = "client!rg", name = "i", descriptor = "I")
    public static int field1432 = 0;

    @OriginalMember(owner = "client!rg", name = "j", descriptor = "I")
    public static int field1433 = 0;

    @OriginalMember(owner = "client!rg", name = "J", descriptor = "Lve;")
    public static class255 field1459 = class87.method607(74, "<img=1>");

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "I")
    public static int field1424;

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "I")
    public static int field1425;

    @OriginalMember(owner = "client!rg", name = "c", descriptor = "I")
    public static int field1426;

    @OriginalMember(owner = "client!rg", name = "d", descriptor = "I")
    public static int field1427;

    @OriginalMember(owner = "client!rg", name = "e", descriptor = "I")
    public static int field1428;

    @OriginalMember(owner = "client!rg", name = "f", descriptor = "I")
    public static int field1429;

    @OriginalMember(owner = "client!rg", name = "g", descriptor = "I")
    public static int field1430;

    @OriginalMember(owner = "client!rg", name = "k", descriptor = "I")
    public static int field1434;

    @OriginalMember(owner = "client!rg", name = "l", descriptor = "I")
    public static int field1435;

    @OriginalMember(owner = "client!rg", name = "n", descriptor = "I")
    public static int field1437;

    @OriginalMember(owner = "client!rg", name = "o", descriptor = "I")
    public static int field1438;

    @OriginalMember(owner = "client!rg", name = "p", descriptor = "I")
    public static int field1439;

    @OriginalMember(owner = "client!rg", name = "q", descriptor = "I")
    public static int field1440;

    @OriginalMember(owner = "client!rg", name = "r", descriptor = "I")
    public static int field1441;

    @OriginalMember(owner = "client!rg", name = "s", descriptor = "I")
    public static int field1442;

    @OriginalMember(owner = "client!rg", name = "u", descriptor = "I")
    public static int field1444;

    @OriginalMember(owner = "client!rg", name = "v", descriptor = "I")
    public static int field1445;

    @OriginalMember(owner = "client!rg", name = "w", descriptor = "I")
    public static int field1446;

    @OriginalMember(owner = "client!rg", name = "x", descriptor = "I")
    public static int field1447;

    @OriginalMember(owner = "client!rg", name = "y", descriptor = "I")
    public static int field1448;

    @OriginalMember(owner = "client!rg", name = "z", descriptor = "I")
    public static int field1449;

    @OriginalMember(owner = "client!rg", name = "A", descriptor = "I")
    public static int field1450;

    @OriginalMember(owner = "client!rg", name = "B", descriptor = "I")
    public static int field1451;

    @OriginalMember(owner = "client!rg", name = "C", descriptor = "I")
    public static int field1452;

    @OriginalMember(owner = "client!rg", name = "D", descriptor = "I")
    public static int field1453;

    @OriginalMember(owner = "client!rg", name = "E", descriptor = "I")
    public static int field1454;

    @OriginalMember(owner = "client!rg", name = "F", descriptor = "I")
    public static int field1455;

    @OriginalMember(owner = "client!rg", name = "G", descriptor = "I")
    public static int field1456;

    @OriginalMember(owner = "client!rg", name = "K", descriptor = "I")
    public static int field1460;

    @OriginalMember(owner = "client!rg", name = "L", descriptor = "I")
    public static int field1461;

    @OriginalMember(owner = "client!rg", name = "N", descriptor = "I")
    public static int field1463;

    @OriginalMember(owner = "client!rg", name = "O", descriptor = "I")
    public static int field1464;

    @OriginalMember(owner = "client!rg", name = "P", descriptor = "I")
    public static int field1465;

    @OriginalMember(owner = "client!rg", name = "Q", descriptor = "I")
    public static int field1466;

    @OriginalMember(owner = "client!rg", name = "M", descriptor = "Z")
    public static boolean field1462;

    @OriginalMember(owner = "client!rg", name = "I", descriptor = "[Ljava/lang/Object;")
    private Object[] field1458;

    @OriginalMember(owner = "client!rg", name = "m", descriptor = "[[Ljava/lang/Object;")
    private Object[][] field1436;

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(ILve;)Z", line = 8)
    public final boolean method610(int arg0, class255 arg1) {
        if (arg0 != -29242) {
            field1433 = -4;
        }
        field1448++;
        if (this.method635(-93)) {
            class255 var3 = arg1.method1777(-157);
            int var4 = this.field1431.field1890.method1149(1, var3.method1740(true));
            return var4 >= 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(IBI)Z", line = 32)
    private final boolean method611(int arg0, byte arg1, int arg2) {
        field1425++;
        if (!this.method635(-116)) {
            return false;
        } else if (arg0 >= 0 && arg2 >= 0 && this.field1431.field1884.length > arg0 && this.field1431.field1884[arg0] > arg2) {
            if (arg1 <= 5) {
                this.method615((byte) 124, -97, 75);
            }
            return true;
        } else if (class210.field3583) {
            throw new IllegalArgumentException(arg0 + "," + arg2);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(Lve;ILve;)Z", line = 61)
    public final boolean method612(class255 arg0, int arg1, class255 arg2) {
        field1440++;
        if (!this.method635(arg1 ^ 0x99)) {
            return false;
        }
        class255 var4 = arg2.method1777(-157);
        if (arg1 != -209) {
            this.method619((class255) null, 114);
        }
        class255 var5 = arg0.method1777(-157);
        int var6 = this.field1431.field1890.method1149(arg1 ^ 0xFFFFFF2E, var4.method1740(true));
        if (this.method637(-118, var6)) {
            int var7 = this.field1431.field1892[var6].method1149(arg1 ^ 0xFFFFFF2E, var5.method1740(true));
            return this.method625(var6, var7, 0);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(II)[I", line = 84)
    public final int[] method613(int arg0, int arg1) {
        if (arg0 != 0) {
            this.field1436 = (Object[][]) ((Object[][]) null);
        }
        field1424++;
        if (!this.method637(arg0 + 70, arg1)) {
            return null;
        }
        int[] var3 = this.field1431.field1885[arg1];
        if (var3 == null) {
            var3 = new int[this.field1431.field1881[arg1]];
            int var4 = 0;
            while (var3.length > var4) {
                var3[var4] = var4++;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "(II)V", line = 123)
    private final void method614(int arg0, int arg1) {
        field1450++;
        if (arg0 <= 19) {
            return;
        }
        if (this.field1467) {
            this.field1458[arg1] = this.field1457.method99(arg1, 0);
        } else {
            this.field1458[arg1] = class141.method1052(-108, false, this.field1457.method99(arg1, 0));
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(BII)[B", line = 145)
    public final byte[] method615(byte arg0, int arg1, int arg2) {
        field1466++;
        if (arg0 > -107) {
            return (byte[]) null;
        } else if (this.method611(arg1, (byte) 59, arg2)) {
            if (this.field1436[arg1] == null || this.field1436[arg1][arg2] == null) {
                boolean var4 = this.method627((int[]) null, arg1, (byte) -61);
                if (!var4) {
                    this.method614(40, arg1);
                    boolean var5 = this.method627((int[]) null, arg1, (byte) -61);
                    if (!var5) {
                        return null;
                    }
                }
            }
            return class276.method1933(-1, this.field1436[arg1][arg2], false);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(IB)I", line = 186)
    public static final int method616(int arg0, byte arg1) {
        field1437++;
        return arg1 == -7 ? arg0 >>> 8 : -35;
    }

    @OriginalMember(owner = "client!rg", name = "c", descriptor = "(II)I", line = 197)
    public final int method617(int arg0, int arg1) {
        if (arg0 != 17374) {
            this.method615((byte) -90, -10, 72);
        }
        field1427++;
        return this.method637(arg0 ^ 0xFFFFBC4F, arg1) ? this.field1431.field1884[arg1] : 0;
    }

    @OriginalMember(owner = "client!rg", name = "d", descriptor = "(II)Z", line = 213)
    public final boolean method618(int arg0, int arg1) {
        field1447++;
        if (!this.method637(arg0 ^ 0xFFFFDEDB, arg1)) {
            return false;
        }
        if (arg0 != 8534) {
            field1462 = false;
        }
        if (this.field1458[arg1] == null) {
            this.method614(64, arg1);
            return this.field1458[arg1] != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(Lve;I)I", line = 235)
    public final int method619(class255 arg0, int arg1) {
        field1464++;
        if (arg1 != 20053) {
            return 116;
        } else if (this.method635(-72)) {
            class255 var3 = arg0.method1777(-157);
            int var4 = this.field1431.field1890.method1149(arg1 ^ 0x4E54, var3.method1740(true));
            return this.method637(-124, var4) ? var4 : -1;
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(I)V", line = 258)
    public static void method620(int arg0) {
        if (arg0 != 0) {
            field1459 = (class255) null;
        }
        field1459 = null;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(Lve;B)I", line = 269)
    public final int method621(class255 arg0, byte arg1) {
        field1435++;
        if (!this.method635(-111)) {
            return 0;
        } else if (arg1 == -71) {
            class255 var3 = arg0.method1777(-157);
            int var4 = this.field1431.field1890.method1149(arg1 ^ 0xFFFFFFB8, var3.method1740(true));
            return this.method631(var4, 60);
        } else {
            return 3;
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(BLve;)V", line = 287)
    public final void method622(byte arg0, class255 arg1) {
        field1428++;
        if (!this.method635(-102)) {
            return;
        }
        class255 var3 = arg1.method1777(-157);
        int var4 = this.field1431.field1890.method1149(1, var3.method1740(true));
        if (arg0 < 79) {
            field1459 = (class255) null;
        }
        this.method643((byte) -61, var4);
    }

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "(IB)V", line = 304)
    public final void method623(int arg0, byte arg1) {
        field1461++;
        if (arg1 < -81 && this.method637(44, arg0) && this.field1436 != null) {
            this.field1436[arg0] = null;
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(B)V", line = 321)
    public final void method624(byte arg0) {
        if (this.field1436 != null) {
            for (int var2 = 0; var2 < this.field1436.length; var2++) {
                this.field1436[var2] = null;
            }
        }
        if (arg0 <= 99) {
            this.field1443 = false;
        }
        field1455++;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(III)Z", line = 343)
    public final boolean method625(int arg0, int arg1, int arg2) {
        field1449++;
        if (!this.method611(arg0, (byte) 113, arg1)) {
            return false;
        } else if (this.field1436[arg0] != null && this.field1436[arg0][arg1] != null) {
            return true;
        } else if (this.field1458[arg0] == null) {
            if (arg2 != 0) {
                this.field1436 = (Object[][]) ((Object[][]) null);
            }
            this.method614(89, arg0);
            return this.field1458[arg0] != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(IZI)Lve;", line = 373)
    public static final class255 method626(int arg0, boolean arg1, int arg2) {
        field1456++;
        if (arg2 != 100) {
            field1459 = (class255) null;
        }
        return class67.method408((byte) -120, arg1, arg0, 10);
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "([IIB)Z", line = 385)
    private final boolean method627(int[] arg0, int arg1, byte arg2) {
        if (arg2 != -61) {
            return true;
        }
        field1465++;
        if (!this.method637(arg2 - 40, arg1)) {
            return false;
        } else if (this.field1458[arg1] == null) {
            return false;
        } else {
            int var4 = this.field1431.field1881[arg1];
            int[] var5 = this.field1431.field1885[arg1];
            if (this.field1436[arg1] == null) {
                this.field1436[arg1] = new Object[this.field1431.field1884[arg1]];
            }
            boolean var6 = true;
            Object[] var7 = this.field1436[arg1];
            for (int var8 = 0; var8 < var4; var8++) {
                int var9;
                if (var5 == null) {
                    var9 = var8;
                } else {
                    var9 = var5[var8];
                }
                if (var7[var9] == null) {
                    var6 = false;
                    break;
                }
            }
            if (var6) {
                return true;
            }
            byte[] var10;
            if (arg0 != null && (arg0[0] != 0 || arg0[1] != 0 || arg0[2] != 0 || arg0[3] != 0)) {
                var10 = class276.method1933(arg2 + 60, this.field1458[arg1], true);
                class70 var11 = new class70(var10);
                var11.method425(var11.field1066.length, arg0, (byte) 78, 5);
            } else {
                var10 = class276.method1933(-1, this.field1458[arg1], false);
            }
            byte[] var12;
            try {
                var12 = class64.method386(var10, -1);
            } catch (RuntimeException var31) {
                throw class184.method1286(var31, "T3 - " + (arg0 != null) + "," + arg1 + "," + var10.length + "," + class160.method1165(var10, var10.length, (byte) -33) + "," + class160.method1165(var10, var10.length - 2, (byte) -77) + "," + this.field1431.field1894[arg1] + "," + this.field1431.field1897);
            }
            if (this.field1467) {
                this.field1458[arg1] = null;
            }
            if (var4 <= 1) {
                int var14;
                if (var5 == null) {
                    var14 = 0;
                } else {
                    var14 = var5[0];
                }
                if (this.field1443) {
                    var7[var14] = var12;
                } else {
                    var7[var14] = class141.method1052(-68, false, var12);
                }
            } else {
                int var15 = var12.length;
                int var32 = var15 - 1;
                int var16 = var12[var32] & 0xFF;
                class70 var17 = new class70(var12);
                int var18 = var32 - var4 * 4 * var16;
                int[] var19 = new int[var4];
                var17.field1068 = var18;
                for (int var20 = 0; var20 < var16; var20++) {
                    int var21 = 0;
                    for (int var22 = 0; var22 < var4; var22++) {
                        if (var5 != null) {
                        }
                        var21 += var17.method469(arg2 + 170);
                        var19[var22] += var21;
                    }
                }
                byte[][] var23 = new byte[var4][];
                for (int var24 = 0; var24 < var4; var24++) {
                    var23[var24] = new byte[var19[var24]];
                    var19[var24] = 0;
                }
                var17.field1068 = var18;
                int var25 = 0;
                for (int var26 = 0; var26 < var16; var26++) {
                    int var27 = 0;
                    for (int var28 = 0; var28 < var4; var28++) {
                        var27 += var17.method469(89);
                        class36.method216(var12, var25, var23[var28], var19[var28], var27);
                        var25 += var27;
                        var19[var28] += var27;
                    }
                }
                for (int var29 = 0; var29 < var4; var29++) {
                    int var30;
                    if (var5 == null) {
                        var30 = var29;
                    } else {
                        var30 = var5[var29];
                    }
                    if (this.field1443) {
                        var7[var30] = var23[var29];
                    } else {
                        var7[var30] = class141.method1052(-101, false, var23[var29]);
                    }
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(Z)I", line = 585)
    public final int method628(boolean arg0) {
        field1430++;
        if (!this.method635(-85)) {
            throw new IllegalStateException("");
        }
        if (!arg0) {
            field1462 = true;
        }
        return this.field1431.field1897;
    }

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "(Lve;I)Z", line = 607)
    public final boolean method629(class255 arg0, int arg1) {
        field1438++;
        if (!this.method635(-72)) {
            return false;
        } else if (arg1 == 19531) {
            class255 var3 = arg0.method1777(-157);
            int var4 = this.field1431.field1890.method1149(1, var3.method1740(true));
            return this.method618(8534, var4);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(BI[II)[B", line = 626)
    public final byte[] method630(byte arg0, int arg1, int[] arg2, int arg3) {
        field1454++;
        if (!this.method611(arg3, (byte) 86, arg1)) {
            return null;
        }
        int var5 = -107 / ((21 - arg0) / 53);
        if (this.field1436[arg3] == null || this.field1436[arg3][arg1] == null) {
            boolean var6 = this.method627(arg2, arg3, (byte) -61);
            if (!var6) {
                this.method614(125, arg3);
                boolean var7 = this.method627(arg2, arg3, (byte) -61);
                if (!var7) {
                    return null;
                }
            }
        }
        byte[] var8 = class276.method1933(-1, this.field1436[arg3][arg1], false);
        if (this.field1443) {
            this.field1436[arg3][arg1] = null;
            if (this.field1431.field1884[arg3] == 1) {
                this.field1436[arg3] = null;
            }
        }
        return var8;
    }

    @OriginalMember(owner = "client!rg", name = "e", descriptor = "(II)I", line = 668)
    private final int method631(int arg0, int arg1) {
        field1444++;
        if (arg1 < 16) {
            field1433 = -62;
        }
        if (this.method637(-105, arg0)) {
            return this.field1458[arg0] == null ? this.field1457.method97(arg0, (byte) 32) : 100;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(IZZ)V", line = 692)
    public final void method632(int arg0, boolean arg1, boolean arg2) {
        field1463++;
        if (!this.method635(-74)) {
            return;
        }
        if (arg1) {
            this.field1431.field1888 = (int[][]) null;
            this.field1431.field1892 = null;
        }
        if (arg2) {
            this.field1431.field1903 = null;
            this.field1431.field1890 = null;
        }
        if (arg0 != -2) {
            this.method629((class255) null, -98);
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(BI)[B", line = 733)
    public final byte[] method633(byte arg0, int arg1) {
        field1460++;
        if (!this.method635(arg0 ^ 0x2B)) {
            return null;
        } else if (this.field1431.field1884.length == 1) {
            return this.method636(0, (byte) 63, arg1);
        } else if (this.method637(27, arg1)) {
            if (arg0 != -70) {
                this.method642(52);
            }
            if (this.field1431.field1884[arg1] != 1) {
                throw new RuntimeException();
            }
            return this.method636(arg1, (byte) 109, 0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!rg", name = "f", descriptor = "(II)Z", line = 763)
    public final boolean method634(int arg0, int arg1) {
        if (arg0 != -19044) {
            field1462 = true;
        }
        field1445++;
        if (!this.method635(-120)) {
            return false;
        } else if (this.field1431.field1884.length == 1) {
            return this.method625(0, arg1, 0);
        } else if (!this.method637(-108, arg1)) {
            return false;
        } else if (this.field1431.field1884[arg1] == 1) {
            return this.method625(arg1, 0, arg0 ^ 0xFFFFB59C);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "(I)Z", line = 788)
    private final boolean method635(int arg0) {
        field1452++;
        if (arg0 > -67) {
            return false;
        }
        if (this.field1431 == null) {
            this.field1431 = this.field1457.method106((byte) 2);
            if (this.field1431 == null) {
                return false;
            }
            this.field1458 = new Object[this.field1431.field1883];
            this.field1436 = new Object[this.field1431.field1883][];
        }
        return true;
    }

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "(IBI)[B", line = 819)
    public final byte[] method636(int arg0, byte arg1, int arg2) {
        if (arg1 <= 48) {
            this.field1457 = (class55) null;
        }
        field1426++;
        return this.method630((byte) -107, arg2, (int[]) null, arg0);
    }

    @OriginalMember(owner = "client!rg", name = "<init>", descriptor = "(Lb;ZZ)V", line = 1017)
    public class88(class55 arg0, boolean arg1, boolean arg2) {
        this.field1467 = arg1;
        this.field1457 = arg0;
        this.field1443 = arg2;
    }

    @OriginalMember(owner = "client!rg", name = "g", descriptor = "(II)Z", line = 838)
    private final boolean method637(int arg0, int arg1) {
        field1439++;
        if (!this.method635(-77)) {
            return false;
        } else if (arg1 >= 0 && arg1 < this.field1431.field1884.length && this.field1431.field1884[arg1] != 0) {
            int var3 = 116 / ((-arg0 - 66) / 33);
            return true;
        } else if (class210.field3583) {
            throw new IllegalArgumentException(Integer.toString(arg1));
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!rg", name = "c", descriptor = "(I)I", line = 861)
    public final int method638(int arg0) {
        if (arg0 > -55) {
            this.method637(9, 124);
        }
        field1434++;
        return this.method635(-77) ? this.field1431.field1884.length : -1;
    }

    @OriginalMember(owner = "client!rg", name = "d", descriptor = "(I)I", line = 876)
    public final int method639(int arg0) {
        field1446++;
        if (!this.method635(-99)) {
            return 0;
        }
        int var2 = 0;
        int var3 = arg0;
        for (int var4 = 0; var4 < this.field1458.length; var4++) {
            if (this.field1431.field1881[var4] > 0) {
                var2 += 100;
                var3 += this.method631(var4, 117);
            }
        }
        if (var2 == 0) {
            return 100;
        } else {
            return var3 * 100 / var2;
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(IIIII)V", line = 920)
    public static final void method640(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1441++;
        class255.field4318.field1068 = 0;
        class255.field4318.method463(false, 169);
        class255.field4318.method463(false, arg0);
        class255.field4318.method463(false, arg3);
        class255.field4318.method462(arg1, (byte) -61);
        class255.field4318.method462(arg4, (byte) -61);
        class274.field4715 = 0;
        if (arg2 == 23929) {
            field1433 = 1;
            class172.field2852 = 0;
            class46.field693 = -3;
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(BLve;Lve;)[B", line = 940)
    public final byte[] method641(byte arg0, class255 arg1, class255 arg2) {
        field1451++;
        if (!this.method635(-115)) {
            return null;
        }
        class255 var4 = arg2.method1777(-157);
        class255 var5 = arg1.method1777(-157);
        int var6 = this.field1431.field1890.method1149(1, var4.method1740(true));
        if (!this.method637(-16, var6)) {
            return null;
        }
        if (arg0 <= 4) {
            this.field1431 = (class112) null;
        }
        int var7 = this.field1431.field1892[var6].method1149(1, var5.method1740(true));
        return this.method636(var6, (byte) 68, var7);
    }

    @OriginalMember(owner = "client!rg", name = "e", descriptor = "(I)Z", line = 965)
    public final boolean method642(int arg0) {
        field1453++;
        if (!this.method635(-84)) {
            return false;
        }
        boolean var2 = true;
        if (arg0 < 59) {
            this.method632(50, false, true);
        }
        for (int var3 = 0; var3 < this.field1431.field1887.length; var3++) {
            int var4 = this.field1431.field1887[var3];
            if (this.field1458[var4] == null) {
                this.method614(110, var4);
                if (this.field1458[var4] == null) {
                    var2 = false;
                }
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "(BI)V", line = 1008)
    private final void method643(byte arg0, int arg1) {
        if (arg0 >= -20) {
            this.method639(97);
        }
        this.field1457.method91(arg1, (byte) -96);
        field1442++;
    }
}
