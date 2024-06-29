import java.awt.FontMetrics;
import java.awt.Graphics;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public class class59 implements class119 {

    @OriginalMember(owner = "client!ic", name = "C", descriptor = "Z")
    private boolean field1430 = true;

    @OriginalMember(owner = "client!ic", name = "n", descriptor = "I")
    public static int field1415 = 0;

    @OriginalMember(owner = "client!ic", name = "R", descriptor = "I")
    public static int field1445 = 0;

    @OriginalMember(owner = "client!ic", name = "r", descriptor = "Llf;")
    public static class82 field1419 = new class82(64);

    @OriginalMember(owner = "client!ic", name = "Y", descriptor = "Lic;")
    private static class59 field1452 = method433(0, "Walk here");

    @OriginalMember(owner = "client!ic", name = "bb", descriptor = "I")
    public static int field1455 = 0;

    @OriginalMember(owner = "client!ic", name = "X", descriptor = "Lic;")
    private static class59 field1451 = method433(0, "No reply from loginserver)3");

    @OriginalMember(owner = "client!ic", name = "ab", descriptor = "Lic;")
    private static class59 field1454 = method433(0, "Loading)3)3)3");

    @OriginalMember(owner = "client!ic", name = "W", descriptor = "Lic;")
    public static class59 field1450 = field1454;

    @OriginalMember(owner = "client!ic", name = "V", descriptor = "Lic;")
    public static class59 field1449 = field1451;

    @OriginalMember(owner = "client!ic", name = "db", descriptor = "Lic;")
    public static class59 field1457 = field1452;

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "I")
    public static int field1402;

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "I")
    public static int field1403;

    @OriginalMember(owner = "client!ic", name = "c", descriptor = "I")
    public static int field1404;

    @OriginalMember(owner = "client!ic", name = "d", descriptor = "I")
    public static int field1405;

    @OriginalMember(owner = "client!ic", name = "e", descriptor = "I")
    public static int field1406;

    @OriginalMember(owner = "client!ic", name = "f", descriptor = "I")
    public static int field1407;

    @OriginalMember(owner = "client!ic", name = "g", descriptor = "I")
    public static int field1408;

    @OriginalMember(owner = "client!ic", name = "h", descriptor = "I")
    public static int field1409;

    @OriginalMember(owner = "client!ic", name = "i", descriptor = "I")
    public static int field1410;

    @OriginalMember(owner = "client!ic", name = "j", descriptor = "I")
    public static int field1411;

    @OriginalMember(owner = "client!ic", name = "k", descriptor = "I")
    private int field1412;

    @OriginalMember(owner = "client!ic", name = "l", descriptor = "I")
    public static int field1413;

    @OriginalMember(owner = "client!ic", name = "m", descriptor = "I")
    public static int field1414;

    @OriginalMember(owner = "client!ic", name = "o", descriptor = "I")
    public static int field1416;

    @OriginalMember(owner = "client!ic", name = "p", descriptor = "I")
    public static int field1417;

    @OriginalMember(owner = "client!ic", name = "q", descriptor = "I")
    public int field1418;

    @OriginalMember(owner = "client!ic", name = "s", descriptor = "I")
    public static int field1420;

    @OriginalMember(owner = "client!ic", name = "t", descriptor = "I")
    public static int field1421;

    @OriginalMember(owner = "client!ic", name = "u", descriptor = "I")
    public static int field1422;

    @OriginalMember(owner = "client!ic", name = "v", descriptor = "I")
    public static int field1423;

    @OriginalMember(owner = "client!ic", name = "w", descriptor = "I")
    public static int field1424;

    @OriginalMember(owner = "client!ic", name = "x", descriptor = "I")
    public static int field1425;

    @OriginalMember(owner = "client!ic", name = "y", descriptor = "I")
    public static int field1426;

    @OriginalMember(owner = "client!ic", name = "z", descriptor = "I")
    public static int field1427;

    @OriginalMember(owner = "client!ic", name = "A", descriptor = "I")
    public static int field1428;

    @OriginalMember(owner = "client!ic", name = "B", descriptor = "I")
    public static int field1429;

    @OriginalMember(owner = "client!ic", name = "D", descriptor = "I")
    public static int field1431;

    @OriginalMember(owner = "client!ic", name = "E", descriptor = "I")
    public static int field1432;

    @OriginalMember(owner = "client!ic", name = "F", descriptor = "I")
    public static int field1433;

    @OriginalMember(owner = "client!ic", name = "G", descriptor = "I")
    public static int field1434;

    @OriginalMember(owner = "client!ic", name = "H", descriptor = "I")
    public static int field1435;

    @OriginalMember(owner = "client!ic", name = "I", descriptor = "I")
    public static int field1436;

    @OriginalMember(owner = "client!ic", name = "J", descriptor = "I")
    public static int field1437;

    @OriginalMember(owner = "client!ic", name = "K", descriptor = "I")
    public static int field1438;

    @OriginalMember(owner = "client!ic", name = "L", descriptor = "I")
    public static int field1439;

    @OriginalMember(owner = "client!ic", name = "M", descriptor = "I")
    public static int field1440;

    @OriginalMember(owner = "client!ic", name = "N", descriptor = "I")
    public static int field1441;

    @OriginalMember(owner = "client!ic", name = "O", descriptor = "I")
    public static int field1442;

    @OriginalMember(owner = "client!ic", name = "P", descriptor = "I")
    public static int field1443;

    @OriginalMember(owner = "client!ic", name = "Q", descriptor = "I")
    public static int field1444;

    @OriginalMember(owner = "client!ic", name = "S", descriptor = "I")
    public static int field1446;

    @OriginalMember(owner = "client!ic", name = "T", descriptor = "I")
    public static int field1447;

    @OriginalMember(owner = "client!ic", name = "Z", descriptor = "I")
    public static int field1453;

    @OriginalMember(owner = "client!ic", name = "cb", descriptor = "I")
    public static int field1456;

    // $FF: synthetic field
    @OriginalMember(owner = "client!ic", name = "eb", descriptor = "Ljava/lang/Class;")
    public static Class field1458;

    @OriginalMember(owner = "client!ic", name = "U", descriptor = "[B")
    public byte[] field1448;

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(II)Lic;")
    public final class59 method420(int arg0, int arg1) {
        field1436++;
        if (arg0 <= 0 || arg0 > 255) {
            throw new IllegalArgumentException("invalid char");
        }
        class59 var3 = new class59();
        var3.field1448 = new byte[this.field1418 + 1];
        var3.field1418 = this.field1418 + 1;
        class105.method818(this.field1448, 0, var3.field1448, 0, this.field1418);
        if (arg1 < 97) {
            this.field1430 = false;
        }
        var3.field1448[this.field1418] = (byte) arg0;
        return var3;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(Lic;Z)Z")
    public final boolean method421(class59 arg0, boolean arg1) {
        if (arg1) {
            return false;
        }
        field1408++;
        if (arg0 == null) {
            return false;
        } else if (this.field1418 == arg0.field1418) {
            if (!this.field1430 || !arg0.field1430) {
                if (this.field1412 == 0) {
                    this.field1412 = this.method456(false);
                    if (this.field1412 == 0) {
                        this.field1412 = 1;
                    }
                }
                if (arg0.field1412 == 0) {
                    arg0.field1412 = arg0.method456(false);
                    if (arg0.field1412 == 0) {
                        arg0.field1412 = 1;
                    }
                }
                if (this.field1412 != arg0.field1412) {
                    return false;
                }
            }
            for (int var3 = 0; var3 < this.field1418; var3++) {
                if (this.field1448[var3] != arg0.field1448[var3]) {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(III)I")
    public final int method422(int arg0, int arg1, int arg2) {
        if (arg1 != -39) {
            this.method447(-89);
        }
        byte var4 = (byte) arg2;
        field1416++;
        for (int var5 = arg0; var5 < this.field1418; var5++) {
            if (this.field1448[var5] == var4) {
                return var5;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(Lic;I)Z")
    public final boolean method423(class59 arg0, int arg1) {
        field1446++;
        if (arg0 == null) {
            return false;
        } else if (this.field1418 != arg0.field1418) {
            return false;
        } else if (arg1 == -61) {
            for (int var3 = 0; var3 < this.field1418; var3++) {
                byte var4 = arg0.field1448[var3];
                byte var5 = this.field1448[var3];
                if (var5 >= 65 && var5 <= 90 || var5 >= -64 && var5 <= -34 && var5 != -41) {
                    var5 = (byte) (var5 + 32);
                }
                if (var4 >= 65 && var4 <= 90 || var4 >= -64 && var4 <= -34 && var4 != -41) {
                    var4 = (byte) (var4 + 32);
                }
                if (var4 != var5) {
                    return false;
                }
            }
            return true;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "(Lic;I)Lic;")
    public final class59 method424(class59 arg0, int arg1) {
        field1423++;
        if (!this.field1430) {
            throw new IllegalArgumentException();
        } else if (arg1 == 2) {
            this.field1412 = 0;
            if (this.field1418 + arg0.field1418 > this.field1448.length) {
                int var3;
                for (var3 = 1; var3 < this.field1418 + arg0.field1418; var3 += var3) {
                }
                byte[] var4 = new byte[var3];
                class105.method818(this.field1448, 0, var4, 0, this.field1418);
                this.field1448 = var4;
            }
            class105.method818(arg0.field1448, 0, this.field1448, this.field1418, arg0.field1418);
            this.field1418 += arg0.field1418;
            return this;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(BI)I")
    public final int method425(byte arg0, int arg1) {
        if (arg0 != 105) {
            field1455 = -93;
        }
        field1435++;
        return this.field1448[arg1] & 0xFF;
    }

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "(II)Z")
    private final boolean method426(int arg0, int arg1) {
        field1429++;
        boolean var3 = false;
        if (arg0 > -29) {
            this.field1418 = 119;
        }
        int var4 = 0;
        boolean var5 = false;
        if (arg1 < 1 || arg1 > 36) {
            arg1 = 10;
        }
        for (int var6 = 0; var6 < this.field1418; var6++) {
            int var7 = this.field1448[var6] & 0xFF;
            if (var6 == 0) {
                if (var7 == 45) {
                    var3 = true;
                    continue;
                }
                if (var7 == 43) {
                    continue;
                }
            }
            if (var7 >= 48 && var7 <= 57) {
                var7 -= 48;
            } else if (var7 >= 65 && var7 <= 90) {
                var7 -= 55;
            } else if (var7 >= 97 && var7 <= 122) {
                var7 -= 87;
            } else {
                return false;
            }
            if (arg1 <= var7) {
                return false;
            }
            if (var3) {
                var7 = -var7;
            }
            int var8 = arg1 * var4 + var7;
            if (var8 / arg1 != var4) {
                return false;
            }
            var5 = true;
            var4 = var8;
        }
        return var5;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(BII)Lic;")
    public final class59 method427(byte arg0, int arg1, int arg2) {
        field1426++;
        class59 var4 = new class59();
        var4.field1448 = new byte[arg1 - arg2];
        var4.field1418 = arg1 - arg2;
        class105.method818(this.field1448, arg2, var4.field1448, 0, var4.field1418);
        return arg0 == 41 ? var4 : null;
    }

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "(BI)I")
    public final int method428(byte arg0, int arg1) {
        field1402++;
        if (arg1 < 1 || arg1 > 36) {
            arg1 = 10;
        }
        boolean var3 = false;
        if (arg0 != 116) {
            return 18;
        }
        boolean var4 = false;
        int var5 = 0;
        for (int var6 = 0; var6 < this.field1418; var6++) {
            int var7 = this.field1448[var6] & 0xFF;
            if (var6 == 0) {
                if (var7 == 45) {
                    var3 = true;
                    continue;
                }
                if (var7 == 43) {
                    continue;
                }
            }
            if (var7 >= 48 && var7 <= 57) {
                var7 -= 48;
            } else if (var7 >= 65 && var7 <= 90) {
                var7 -= 55;
            } else if (var7 >= 97 && var7 <= 122) {
                var7 -= 87;
            } else {
                throw new NumberFormatException();
            }
            if (arg1 <= var7) {
                throw new NumberFormatException();
            }
            if (var3) {
                var7 = -var7;
            }
            int var8 = arg1 * var5 + var7;
            if (var8 / arg1 != var5) {
                throw new NumberFormatException();
            }
            var4 = true;
            var5 = var8;
        }
        if (!var4) {
            throw new NumberFormatException();
        }
        return var5;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(I)Lic;")
    public final class59 method429(int arg0) {
        field1414++;
        int var2;
        for (var2 = 0; this.field1418 > var2 && (this.field1448[var2] >= 0 && this.field1448[var2] <= 32 || (this.field1448[var2] & 0xFF) == 160); var2++) {
        }
        int var3;
        for (var3 = this.field1418; var3 > var2 && (this.field1448[var3 - 1] >= 0 && this.field1448[var3 - 1] <= 32 || (this.field1448[var3 - 1] & 0xFF) == 160); var3--) {
        }
        if (var2 == 0 && this.field1418 == var3) {
            return this;
        }
        class59 var4 = new class59();
        var4.field1418 = var3 - var2;
        var4.field1448 = new byte[var4.field1418];
        int var5 = -7 / ((-arg0 - 84) / 40);
        for (int var6 = 0; var6 < var4.field1418; var6++) {
            var4.field1448[var6] = this.field1448[var2 + var6];
        }
        return var4;
    }

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "(I)V")
    public static final void method430(int arg0) {
        if (arg0 != 1) {
            method438((byte) 89);
        }
        class148 var1 = (class148) class89.field2242.method682(0);
        field1410++;
        while (var1 != null) {
            if (class44.field1127 != var1.field3211 || var1.field3218 < class23.field561) {
                var1.method929(124);
            } else if (var1.field3210 <= class23.field561) {
                if (var1.field3246 > 0) {
                    class90 var2 = class47.field1210[var1.field3246 - 1];
                    if (var2 != null && var2.field1730 >= 0 && var2.field1730 < 13312 && var2.field1751 >= 0 && var2.field1751 < 13312) {
                        var1.method1104((byte) 62, var2.field1730, class147.method1095((byte) 30, var2.field1751, var1.field3211, var2.field1730) - var1.field3225, var2.field1751, class23.field561);
                    }
                }
                if (var1.field3246 < 0) {
                    int var3 = -var1.field3246 - 1;
                    class49 var4;
                    if (class2.field42 == var3) {
                        var4 = class159.field3650;
                    } else {
                        var4 = class91.field2323[var3];
                    }
                    if (var4 != null && var4.field1730 >= 0 && var4.field1730 < 13312 && var4.field1751 >= 0 && var4.field1751 < 13312) {
                        var1.method1104((byte) 99, var4.field1730, class147.method1095((byte) 30, var4.field1751, var1.field3211, var4.field1730) - var1.field3225, var4.field1751, class23.field561);
                    }
                }
                var1.method1098(class76.field1872, 106);
                class3.field58.method898(class44.field1127, (int) var1.field3227, (int) var1.field3233, (int) var1.field3223, 60, var1, var1.field3214, -1, false);
            }
            var1 = (class148) class89.field2242.method684((byte) -65);
        }
    }

    @OriginalMember(owner = "client!ic", name = "c", descriptor = "(I)Lic;")
    private final class59 method431(int arg0) {
        field1434++;
        if (arg0 <= 108) {
            return null;
        }
        long var2 = this.method446(true);
        synchronized (field1458 == null ? (field1458 = method460("ic")) : field1458) {
            if (class91.field2326 == null) {
                class91.field2326 = new class7(4096);
            } else {
                for (class94 var5 = (class94) class91.field2326.method35(var2, 105); var5 != null; var5 = (class94) class91.field2326.method40(-1)) {
                    if (this.method421(var5.field2393, false)) {
                        return var5.field2393;
                    }
                }
            }
            class94 var7 = new class94();
            var7.field2393 = this;
            this.field1430 = false;
            class91.field2326.method38(var7, (byte) 93, var2);
            return this;
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(BLic;)I")
    public final int method432(byte arg0, class59 arg1) {
        field1453++;
        int var3;
        if (this.field1418 <= arg1.field1418) {
            var3 = this.field1418;
        } else {
            var3 = arg1.field1418;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            if (class53.field1321[arg1.field1448[var4] & 0xFF] > class53.field1321[this.field1448[var4] & 0xFF]) {
                return -1;
            }
            if (class53.field1321[arg1.field1448[var4] & 0xFF] < class53.field1321[this.field1448[var4] & 0xFF]) {
                return 1;
            }
        }
        if (this.field1418 < arg1.field1418) {
            return -1;
        }
        if (arg0 >= -58) {
            this.field1418 = 46;
        }
        if (this.field1418 > arg1.field1418) {
            return 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(ILjava/lang/String;)Lic;")
    public static final class59 method433(int arg0, String arg1) {
        byte[] var2 = arg1.getBytes();
        int var3 = arg0;
        int var4 = var2.length;
        class59 var5 = new class59();
        field1437++;
        var5.field1448 = new byte[var4];
        while (var4 > var3) {
            int var6 = var2[var3++] & 0xFF;
            if (var6 <= 45 && var6 >= 40) {
                if (var4 <= var3) {
                    break;
                }
                int var7 = var2[var3++] & 0xFF;
                var5.field1448[var5.field1418++] = (byte) (var6 * 43 + var7 - 1720 - 48);
            } else if (var6 != 0) {
                var5.field1448[var5.field1418++] = (byte) var6;
            }
        }
        var5.method436((byte) -35);
        return var5.method431(125);
    }

    @OriginalMember(owner = "client!ic", name = "c", descriptor = "(II)Lic;")
    public final class59 method434(int arg0, int arg1) {
        field1444++;
        if (arg0 != -20362) {
            this.method442(null, 92, -62, -14, -93);
        }
        if (arg1 <= 0 || arg1 > 255) {
            throw new IllegalArgumentException("invalid char:" + arg1);
        } else if (this.field1430) {
            this.field1412 = 0;
            if (this.field1448.length == this.field1418) {
                int var3;
                for (var3 = 1; var3 <= this.field1418; var3 += var3) {
                }
                byte[] var4 = new byte[var3];
                class105.method818(this.field1448, 0, var4, 0, this.field1418);
                this.field1448 = var4;
            }
            this.field1448[this.field1418++] = (byte) arg1;
            return this;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!ic", name = "c", descriptor = "(Lic;I)I")
    public final int method435(class59 arg0, int arg1) {
        if (arg1 != -15730) {
            this.method445(63, 66, null, -60);
        }
        field1441++;
        return this.method441(-47, arg0, 0);
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(B)Lic;")
    public final class59 method436(byte arg0) {
        field1447++;
        if (!this.field1430) {
            throw new IllegalArgumentException();
        }
        if (arg0 != -35) {
            this.method427((byte) -31, 27, -60);
        }
        this.field1412 = 0;
        if (this.field1448.length != this.field1418) {
            byte[] var2 = new byte[this.field1418];
            class105.method818(this.field1448, 0, var2, 0, this.field1418);
            this.field1448 = var2;
        }
        return this;
    }

    @OriginalMember(owner = "client!ic", name = "equals", descriptor = "(Ljava/lang/Object;)Z")
    public final boolean equals(Object arg0) {
        field1411++;
        if (!(arg0 instanceof class59)) {
            throw new IllegalArgumentException();
        }
        return this.method421((class59) arg0, false);
    }

    @OriginalMember(owner = "client!ic", name = "hashCode", descriptor = "()I")
    public final int hashCode() {
        field1405++;
        return this.method456(false);
    }

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "(B)I")
    public final int method437(byte arg0) {
        if (arg0 != 52) {
            this.field1412 = -15;
        }
        field1407++;
        return this.field1418;
    }

    @OriginalMember(owner = "client!ic", name = "c", descriptor = "(B)V")
    public static final void method438(byte arg0) {
        if (class98.field2447 != null) {
            class98.field2447.method308(19401);
        }
        field1422++;
        if (arg0 >= -89) {
            field1454 = null;
        }
    }

    @OriginalMember(owner = "client!ic", name = "d", descriptor = "(B)Lic;")
    public final class59 method439(byte arg0) {
        field1439++;
        byte var2 = 2;
        class59 var3 = new class59();
        var3.field1418 = this.field1418;
        var3.field1448 = new byte[this.field1418];
        if (arg0 <= 75) {
            field1450 = null;
        }
        for (int var4 = 0; var4 < this.field1418; var4++) {
            byte var5 = this.field1448[var4];
            if (var5 >= 97 && var5 <= 122 || !(var5 < -32 || var5 > -2 || var5 == -9)) {
                if (var2 == 2) {
                    var5 = (byte) (var5 - 32);
                }
                var2 = 0;
            } else if (var5 >= 65 && var5 <= 90 || var5 >= -64 && var5 <= -34 && var5 != -41) {
                if (var2 == 0) {
                    var5 = (byte) (var5 + 32);
                }
                var2 = 0;
            } else if (var5 == 46 || var5 == 33 || var5 == 63) {
                var2 = 2;
            } else if (var5 != 32) {
                var2 = 1;
            } else if (var2 != 2) {
                var2 = 1;
            }
            var3.field1448[var4] = var5;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ic", name = "d", descriptor = "(I)I")
    public final int method440(int arg0) {
        if (arg0 != 10) {
            this.method443((byte) 75, null);
        }
        field1456++;
        return this.method428((byte) 116, 10);
    }

    @OriginalMember(owner = "client!ic", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field1440++;
        throw new RuntimeException();
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(ILic;I)I")
    public final int method441(int arg0, class59 arg1, int arg2) {
        field1404++;
        int[] var4 = new int[256];
        int[] var5 = new int[arg1.field1418];
        int[] var6 = new int[arg1.field1418];
        for (int var7 = 0; var7 < var4.length; var7++) {
            var4[var7] = arg1.field1418;
        }
        if (arg0 >= -7) {
            field1452 = null;
        }
        for (int var8 = 1; var8 <= arg1.field1418; var8++) {
            var5[var8 - 1] = (arg1.field1418 << 1) - var8;
            var4[class24.method156(arg1.field1448[var8 - 1], 255)] = arg1.field1418 - var8;
        }
        int var9 = arg1.field1418 + 1;
        int var10 = arg1.field1418;
        while (var10 > 0) {
            var6[var10 - 1] = var9;
            while (var9 <= arg1.field1418 && arg1.field1448[var9 - 1] != arg1.field1448[var10 - 1]) {
                if (arg1.field1418 - var10 <= var5[var9 + -1]) {
                    var5[var9 - 1] = arg1.field1418 - var10;
                }
                var9 = var6[var9 - 1];
            }
            var10--;
            var9--;
        }
        int var11 = var9;
        int var12 = 1;
        int var13 = arg1.field1418 + 1 - var9;
        int var14 = 0;
        for (int var15 = 1; var15 <= var13; var15++) {
            var6[var15 - 1] = var14;
            while (var14 >= 1 && arg1.field1448[var14 - 1] != arg1.field1448[var15 - 1]) {
                var14 = var6[var14 - 1];
            }
            var14++;
        }
        while (arg1.field1418 > var11) {
            for (int var18 = var12; var18 <= var11; var18++) {
                if (var5[var18 - 1] >= arg1.field1418 + var11 - var18) {
                    var5[var18 - 1] = arg1.field1418 + var11 - var18;
                }
            }
            var12 = var11 + 1;
            var11 += var13 - var6[var13 - 1];
            var13 = var6[var13 - 1];
        }
        int var17;
        for (int var16 = arg1.field1418 + arg2 - 1; var16 < this.field1418; var16 += Math.max(var4[this.field1448[var16] & 0xFF], var5[var17])) {
            for (var17 = arg1.field1418 - 1; var17 >= 0 && this.field1448[var16] == arg1.field1448[var17]; var17--) {
                var16--;
            }
            if (var17 == -1) {
                return var16 + 1;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "([BIIII)I")
    public final int method442(byte[] arg0, int arg1, int arg2, int arg3, int arg4) {
        class105.method818(this.field1448, arg3, arg0, arg1, arg2 - arg3);
        if (arg4 != 255) {
            field1450 = null;
        }
        field1406++;
        return arg2 - arg3;
    }

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "(BLic;)Z")
    public final boolean method443(byte arg0, class59 arg1) {
        field1432++;
        if (arg0 != 34) {
            field1449 = null;
        }
        if (this.field1418 < arg1.field1418) {
            return false;
        }
        for (int var3 = 0; var3 < arg1.field1418; var3++) {
            if (this.field1448[var3] != arg1.field1448[var3]) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!ic", name = "e", descriptor = "(I)Lic;")
    public final class59 method444(int arg0) {
        field1417++;
        class59 var2 = new class59();
        var2.field1418 = this.field1418;
        var2.field1448 = new byte[this.field1418];
        if (arg0 == -58) {
            for (int var3 = 0; var3 < this.field1418; var3++) {
                var2.field1448[var3] = 42;
            }
            return var2;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IILjava/awt/Graphics;I)V")
    public final void method445(int arg0, int arg1, Graphics arg2, int arg3) {
        field1425++;
        String var5;
        try {
            var5 = new String(this.field1448, 0, this.field1418, "ISO-8859-1");
            if (arg1 != 63) {
                field1455 = 125;
            }
        } catch (UnsupportedEncodingException var6) {
            var5 = new String(this.field1448, 0, this.field1418);
        }
        arg2.drawString(var5, arg3, arg0);
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(Z)J")
    private final long method446(boolean arg0) {
        if (!arg0) {
            return -8L;
        }
        long var2 = 0L;
        for (int var4 = 0; var4 < this.field1418; var4++) {
            var2 = (var2 << 5) + (long) (this.field1448[var4] & 0xFF) - var2;
        }
        field1443++;
        return var2;
    }

    @OriginalMember(owner = "client!ic", name = "f", descriptor = "(I)J")
    public final long method447(int arg0) {
        field1409++;
        if (arg0 != 12074) {
            this.method435(null, 120);
        }
        long var2 = 0L;
        for (int var4 = 0; var4 < this.field1418 && var4 < 12; var4++) {
            byte var5 = this.field1448[var4];
            var2 *= 37L;
            if (var5 >= 65 && var5 <= 90) {
                var2 += var5 + 1 - 65;
            } else if (var5 >= 97 && var5 <= 122) {
                var2 += var5 + 1 - 97;
            } else if (var5 >= 48 && var5 <= 57) {
                var2 += var5 + 27 - 48;
            }
        }
        while (var2 % 37L == 0L && var2 != 0L) {
            var2 /= 37L;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "(Z)Lic;")
    public final class59 method448(boolean arg0) {
        field1442++;
        class59 var2 = new class59();
        var2.field1418 = 0;
        var2.field1448 = new byte[12];
        int var3 = 0;
        if (!arg0) {
            this.method446(false);
        }
        for (int var4 = 0; var4 < this.field1418; var4++) {
            if (this.field1448[var4] >= 65 && this.field1448[var4] <= 90) {
                var2.field1448[var3++] = (byte) (this.field1448[var4] + 97 - 65);
                var2.field1418 = var3;
            } else if (this.field1448[var4] >= 97 && this.field1448[var4] <= 122 || this.field1448[var4] >= 48 && this.field1448[var4] <= 57) {
                var2.field1448[var3++] = this.field1448[var4];
                var2.field1418 = var3;
            } else if (var3 > 0) {
                var2.field1448[var3++] = 95;
            }
            if (var3 == 12) {
                break;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!ic", name = "g", descriptor = "(I)Ljava/net/URL;")
    public final URL method449(int arg0) throws MalformedURLException {
        if (arg0 < 124) {
            this.field1448 = null;
        }
        field1438++;
        return new URL(new String(this.field1448, 0, this.field1418));
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(Lic;B)I")
    public final int method450(class59 arg0, byte arg1) {
        field1433++;
        int var3;
        if (arg0.field1418 >= this.field1418) {
            var3 = this.field1418;
        } else {
            var3 = arg0.field1418;
        }
        int var4 = 0;
        if (arg1 >= -107) {
            return -121;
        }
        while (var3 > var4) {
            if ((this.field1448[var4] & 0xFF) < (arg0.field1448[var4] & 0xFF)) {
                return -1;
            }
            if ((this.field1448[var4] & 0xFF) > (arg0.field1448[var4] & 0xFF)) {
                return 1;
            }
            var4++;
        }
        if (arg0.field1418 > this.field1418) {
            return -1;
        } else if (this.field1418 > arg0.field1418) {
            return 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!ic", name = "c", descriptor = "(Z)Lic;")
    public final class59 method451(boolean arg0) {
        field1431++;
        class59 var2 = new class59();
        var2.field1418 = this.field1418;
        var2.field1448 = new byte[this.field1418];
        if (!arg0) {
            method433(-75, null);
        }
        for (int var3 = 0; var3 < this.field1418; var3++) {
            byte var4 = this.field1448[var3];
            if (var4 >= 65 && var4 <= 90 || var4 >= -64 && var4 <= -34 && var4 != -41) {
                var4 = (byte) (var4 + 32);
            }
            var2.field1448[var3] = var4;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ic", name = "d", descriptor = "(II)Lic;")
    public final class59 method452(int arg0, int arg1) {
        if (arg0 != -805469788) {
            this.method422(-11, -124, -39);
        }
        field1420++;
        return this.method427((byte) 41, this.field1418, arg1);
    }

    @OriginalMember(owner = "client!ic", name = "e", descriptor = "(B)[B")
    public final byte[] method453(byte arg0) {
        field1427++;
        byte[] var2 = new byte[this.field1418];
        class105.method818(this.field1448, 0, var2, 0, this.field1418);
        return arg0 == -128 ? var2 : null;
    }

    @OriginalMember(owner = "client!ic", name = "h", descriptor = "(I)V")
    public static void method454(int arg0) {
        if (arg0 != 63) {
            field1449 = null;
        }
        field1450 = null;
        field1454 = null;
        field1451 = null;
        field1449 = null;
        field1457 = null;
        field1452 = null;
        field1419 = null;
    }

    @OriginalMember(owner = "client!ic", name = "f", descriptor = "(B)Z")
    public final boolean method455(byte arg0) {
        if (arg0 != 29) {
            this.method452(-110, -4);
        }
        field1413++;
        return this.method426(arg0 ^ 0xFFFFFFB1, 10);
    }

    @OriginalMember(owner = "client!ic", name = "d", descriptor = "(Z)I")
    public final int method456(boolean arg0) {
        field1428++;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field1418; var3++) {
            var2 = (var2 << 5) + (this.field1448[var3] & 0xFF) - var2;
        }
        if (arg0) {
            this.method448(true);
        }
        return var2;
    }

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "(Lic;B)Z")
    public final boolean method457(class59 arg0, byte arg1) {
        field1421++;
        if (arg0.field1418 > this.field1418) {
            return false;
        }
        int var3 = this.field1418 - arg0.field1418;
        for (int var4 = 0; var4 < arg0.field1418; var4++) {
            if (this.field1448[var3 + var4] != arg0.field1448[var4]) {
                return false;
            }
        }
        if (arg1 != 52) {
            field1452 = null;
        }
        return true;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(Ljava/awt/FontMetrics;I)I")
    public final int method458(FontMetrics arg0, int arg1) {
        if (arg1 != 1430) {
            return -65;
        }
        String var3;
        try {
            var3 = new String(this.field1448, 0, this.field1418, "ISO-8859-1");
        } catch (UnsupportedEncodingException var4) {
            var3 = new String(this.field1448, 0, this.field1418);
        }
        field1424++;
        return arg0.stringWidth(var3);
    }

    @OriginalMember(owner = "client!ic", name = "i", descriptor = "(I)Lic;")
    public final class59 method459(int arg0) {
        field1403++;
        class59 var2 = new class59();
        var2.field1418 = this.field1418;
        var2.field1448 = new byte[this.field1418];
        boolean var3 = true;
        if (arg0 != 28452) {
            this.method421(null, true);
        }
        for (int var4 = 0; var4 < this.field1418; var4++) {
            byte var5 = this.field1448[var4];
            if (var5 == 95) {
                var2.field1448[var4] = 32;
                var3 = true;
            } else if (var5 >= 97 && var5 <= 122 && var3) {
                var3 = false;
                var2.field1448[var4] = (byte) (var5 - 32);
            } else {
                var3 = false;
                var2.field1448[var4] = var5;
            }
        }
        return var2;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method460(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
