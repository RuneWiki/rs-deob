import java.awt.FontMetrics;
import java.awt.Graphics;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public class class60 implements class65 {

    @OriginalMember(owner = "client!id", name = "Q", descriptor = "Z")
    private boolean field1481 = true;

    @OriginalMember(owner = "client!id", name = "B", descriptor = "I")
    public static int field1466 = 0;

    @OriginalMember(owner = "client!id", name = "U", descriptor = "Lid;")
    public static class60 field1485 = class11.method72("<col=40ff00>", (byte) -33);

    @OriginalMember(owner = "client!id", name = "X", descriptor = "Lid;")
    public static class60 field1488 = class11.method72("<br>(X", (byte) -45);

    @OriginalMember(owner = "client!id", name = "A", descriptor = "Lid;")
    public static class60 field1465 = class11.method72("Ihr Charakter)2Profil wird in:", (byte) -69);

    @OriginalMember(owner = "client!id", name = "ab", descriptor = "Lid;")
    public static class60 field1491 = class11.method72("Titelbild geladen)3", (byte) 116);

    @OriginalMember(owner = "client!id", name = "K", descriptor = "I")
    public static int field1475 = 0;

    @OriginalMember(owner = "client!id", name = "a", descriptor = "I")
    public static int field1439;

    @OriginalMember(owner = "client!id", name = "b", descriptor = "I")
    public static int field1440;

    @OriginalMember(owner = "client!id", name = "c", descriptor = "I")
    public static int field1441;

    @OriginalMember(owner = "client!id", name = "d", descriptor = "I")
    public static int field1442;

    @OriginalMember(owner = "client!id", name = "e", descriptor = "I")
    public static int field1443;

    @OriginalMember(owner = "client!id", name = "f", descriptor = "I")
    public static int field1444;

    @OriginalMember(owner = "client!id", name = "g", descriptor = "I")
    public static int field1445;

    @OriginalMember(owner = "client!id", name = "h", descriptor = "I")
    public static int field1446;

    @OriginalMember(owner = "client!id", name = "i", descriptor = "I")
    public static int field1447;

    @OriginalMember(owner = "client!id", name = "j", descriptor = "I")
    public static int field1448;

    @OriginalMember(owner = "client!id", name = "k", descriptor = "I")
    public static int field1449;

    @OriginalMember(owner = "client!id", name = "l", descriptor = "I")
    public static int field1450;

    @OriginalMember(owner = "client!id", name = "m", descriptor = "I")
    public static int field1451;

    @OriginalMember(owner = "client!id", name = "n", descriptor = "I")
    public static int field1452;

    @OriginalMember(owner = "client!id", name = "p", descriptor = "I")
    public static int field1454;

    @OriginalMember(owner = "client!id", name = "q", descriptor = "I")
    public static int field1455;

    @OriginalMember(owner = "client!id", name = "r", descriptor = "I")
    public static int field1456;

    @OriginalMember(owner = "client!id", name = "s", descriptor = "I")
    public static int field1457;

    @OriginalMember(owner = "client!id", name = "t", descriptor = "I")
    public static int field1458;

    @OriginalMember(owner = "client!id", name = "u", descriptor = "I")
    public static int field1459;

    @OriginalMember(owner = "client!id", name = "v", descriptor = "I")
    public static int field1460;

    @OriginalMember(owner = "client!id", name = "w", descriptor = "I")
    public static int field1461;

    @OriginalMember(owner = "client!id", name = "x", descriptor = "I")
    public static int field1462;

    @OriginalMember(owner = "client!id", name = "y", descriptor = "I")
    public static int field1463;

    @OriginalMember(owner = "client!id", name = "z", descriptor = "I")
    public static int field1464;

    @OriginalMember(owner = "client!id", name = "C", descriptor = "I")
    public static int field1467;

    @OriginalMember(owner = "client!id", name = "E", descriptor = "I")
    public static int field1469;

    @OriginalMember(owner = "client!id", name = "G", descriptor = "I")
    private int field1471;

    @OriginalMember(owner = "client!id", name = "H", descriptor = "I")
    public static int field1472;

    @OriginalMember(owner = "client!id", name = "I", descriptor = "I")
    public static int field1473;

    @OriginalMember(owner = "client!id", name = "J", descriptor = "I")
    public int field1474;

    @OriginalMember(owner = "client!id", name = "L", descriptor = "I")
    public static int field1476;

    @OriginalMember(owner = "client!id", name = "M", descriptor = "I")
    public static int field1477;

    @OriginalMember(owner = "client!id", name = "N", descriptor = "I")
    public static int field1478;

    @OriginalMember(owner = "client!id", name = "O", descriptor = "I")
    public static int field1479;

    @OriginalMember(owner = "client!id", name = "P", descriptor = "I")
    public static int field1480;

    @OriginalMember(owner = "client!id", name = "R", descriptor = "I")
    public static int field1482;

    @OriginalMember(owner = "client!id", name = "S", descriptor = "I")
    public static int field1483;

    @OriginalMember(owner = "client!id", name = "T", descriptor = "I")
    public static int field1484;

    @OriginalMember(owner = "client!id", name = "V", descriptor = "I")
    public static int field1486;

    @OriginalMember(owner = "client!id", name = "W", descriptor = "I")
    public static int field1487;

    @OriginalMember(owner = "client!id", name = "Y", descriptor = "I")
    public static int field1489;

    @OriginalMember(owner = "client!id", name = "Z", descriptor = "I")
    public static int field1490;

    @OriginalMember(owner = "client!id", name = "bb", descriptor = "I")
    public static int field1492;

    @OriginalMember(owner = "client!id", name = "cb", descriptor = "I")
    public static int field1493;

    @OriginalMember(owner = "client!id", name = "db", descriptor = "I")
    public static int field1494;

    @OriginalMember(owner = "client!id", name = "eb", descriptor = "I")
    public static int field1495;

    @OriginalMember(owner = "client!id", name = "fb", descriptor = "I")
    public static int field1496;

    @OriginalMember(owner = "client!id", name = "gb", descriptor = "I")
    public static int field1497;

    @OriginalMember(owner = "client!id", name = "D", descriptor = "Lae;")
    public static class6 field1468;

    @OriginalMember(owner = "client!id", name = "F", descriptor = "Lld;")
    public static class80 field1470;

    // $FF: synthetic field
    @OriginalMember(owner = "client!id", name = "hb", descriptor = "Ljava/lang/Class;")
    public static Class field1498;

    @OriginalMember(owner = "client!id", name = "o", descriptor = "[B")
    public byte[] field1453;

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(IB)I")
    public final int method418(int arg0, byte arg1) {
        int var3 = -60 / ((-arg1 - 24) / 42);
        field1484++;
        return this.field1453[arg0] & 0xFF;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(BI)Z")
    public static final boolean method419(byte arg0, int arg1) {
        if (arg0 != -100) {
            method419((byte) 103, -55);
        }
        field1444++;
        return (arg1 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(II)Lv;")
    public static final class146 method420(int arg0, int arg1) {
        field1497++;
        class146 var2 = (class146) class133.field3032.method918(-96, (long) arg1);
        if (var2 != null) {
            return var2;
        } else if (arg0 <= 54) {
            return null;
        } else {
            byte[] var3 = class94.field2313.method473((byte) 122, arg1, 0);
            if (var3 == null) {
                return null;
            }
            class146 var4 = new class146();
            int var5 = 0;
            class103 var6 = new class103(var3);
            var6.field2501 = var6.field2498.length - 12;
            int var7 = var6.method803(false);
            var4.field3299 = var6.method808(-20054);
            var4.field3287 = var6.method808(-20054);
            var4.field3298 = var6.method808(-20054);
            var4.field3286 = var6.method808(-20054);
            var6.field2501 = 0;
            var4.field3294 = var6.method848(0);
            var4.field3285 = new class60[var7];
            var4.field3300 = new int[var7];
            var4.field3278 = new int[var7];
            while (var6.field2498.length - 12 > var6.field2501) {
                int var8 = var6.method808(-20054);
                if (var8 == 3) {
                    var4.field3285[var5] = var6.method841(27330);
                } else if (var8 >= 100 || var8 == 21 || var8 == 38 || var8 == 39) {
                    var4.field3300[var5] = var6.method829((byte) 126);
                } else {
                    var4.field3300[var5] = var6.method803(false);
                }
                var4.field3278[var5++] = var8;
            }
            class133.field3032.method914(var4, (long) arg1, (byte) 49);
            return var4;
        }
    }

    @OriginalMember(owner = "client!id", name = "b", descriptor = "(II)Lid;")
    public final class60 method421(int arg0, int arg1) {
        field1459++;
        return arg1 == 0 ? this.method427(this.field1474, -50, arg0) : null;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(I)Lid;")
    public final class60 method422(int arg0) {
        int var2 = 0;
        int var3 = this.field1474;
        field1480++;
        while (var2 < this.field1474 && (this.field1453[var2] >= 0 && this.field1453[var2] <= 32 || (this.field1453[var2] & 0xFF) == 160)) {
            var2++;
        }
        while (var3 > var2 && (this.field1453[var3 - 1] >= 0 && this.field1453[var3 - 1] <= 32 || (this.field1453[var3 - 1] & 0xFF) == 160)) {
            var3--;
        }
        if (var2 == 0 && this.field1474 == var3) {
            return this;
        }
        class60 var4 = new class60();
        var4.field1474 = var3 - var2;
        var4.field1453 = new byte[var4.field1474];
        for (int var5 = arg0; var5 < var4.field1474; var5++) {
            var4.field1453[var5] = this.field1453[var2 + var5];
        }
        return var4;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(BILid;)I")
    private final int method423(byte arg0, int arg1, class60 arg2) {
        field1464++;
        int[] var4 = new int[arg2.field1474];
        int[] var5 = new int[256];
        int[] var6 = new int[arg2.field1474];
        for (int var7 = 0; var7 < var5.length; var7++) {
            var5[var7] = arg2.field1474;
        }
        for (int var8 = 1; var8 <= arg2.field1474; var8++) {
            var4[var8 - 1] = (arg2.field1474 << 1) - var8;
            var5[class80.method680(arg2.field1453[var8 - 1], 255)] = arg2.field1474 - var8;
        }
        int var9 = arg2.field1474 + 1;
        int var10 = 60 / ((33 - arg0) / 59);
        int var11 = arg2.field1474;
        while (var11 > 0) {
            var6[var11 - 1] = var9;
            while (var9 <= arg2.field1474 && arg2.field1453[var9 - 1] != arg2.field1453[var11 - 1]) {
                if (arg2.field1474 - var11 <= var4[var9 + -1]) {
                    var4[var9 - 1] = arg2.field1474 - var11;
                }
                var9 = var6[var9 - 1];
            }
            var11--;
            var9--;
        }
        int var12 = var9;
        int var13 = arg2.field1474 + 1 - var9;
        int var14 = 1;
        int var15 = 0;
        for (int var16 = 1; var16 <= var13; var16++) {
            var6[var16 - 1] = var15;
            while (var15 >= 1 && arg2.field1453[var15 - 1] != arg2.field1453[var16 - 1]) {
                var15 = var6[var15 - 1];
            }
            var15++;
        }
        while (var12 < arg2.field1474) {
            for (int var19 = var14; var19 <= var12; var19++) {
                if (var4[var19 - 1] >= arg2.field1474 + var12 - var19) {
                    var4[var19 - 1] = arg2.field1474 + var12 - var19;
                }
            }
            var14 = var12 + 1;
            var12 = var12 + var13 - var6[var13 + -1];
            var13 = var6[var13 - 1];
        }
        int var18;
        for (int var17 = arg2.field1474 + arg1 - 1; var17 < this.field1474; var17 += Math.max(var5[this.field1453[var17] & 0xFF], var4[var18])) {
            for (var18 = arg2.field1474 - 1; var18 >= 0 && this.field1453[var17] == arg2.field1453[var18]; var18--) {
                var17--;
            }
            if (var18 == -1) {
                return var17 + 1;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!id", name = "b", descriptor = "(I)I")
    public final int method424(int arg0) {
        field1479++;
        if (arg0 >= -36) {
            this.field1453 = null;
        }
        return this.method429((byte) -112, 10);
    }

    @OriginalMember(owner = "client!id", name = "c", descriptor = "(II)Z")
    private final boolean method425(int arg0, int arg1) {
        field1489++;
        boolean var3 = false;
        if (arg1 != -16823) {
            return true;
        }
        if (arg0 < 1 || arg0 > 36) {
            arg0 = 10;
        }
        boolean var4 = false;
        int var5 = 0;
        for (int var6 = 0; var6 < this.field1474; var6++) {
            int var7 = this.field1453[var6] & 0xFF;
            if (var6 == 0) {
                if (var7 == 45) {
                    var4 = true;
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
            if (arg0 <= var7) {
                return false;
            }
            if (var4) {
                var7 = -var7;
            }
            int var8 = arg0 * var5 + var7;
            if (var8 / arg0 != var5) {
                return false;
            }
            var3 = true;
            var5 = var8;
        }
        return var3;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(Lid;B)Z")
    public final boolean method426(class60 arg0, byte arg1) {
        field1439++;
        if (arg0 == null) {
            return false;
        } else if (this.field1474 == arg0.field1474) {
            for (int var3 = 0; var3 < this.field1474; var3++) {
                byte var4 = arg0.field1453[var3];
                byte var5 = this.field1453[var3];
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
            if (arg1 != 37) {
                this.field1471 = -120;
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!id", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field1447++;
        throw new RuntimeException();
    }

    @OriginalMember(owner = "client!id", name = "equals", descriptor = "(Ljava/lang/Object;)Z")
    public final boolean equals(Object arg0) {
        field1457++;
        if (!(arg0 instanceof class60)) {
            throw new IllegalArgumentException();
        }
        return this.method451((class60) arg0, 11207);
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(III)Lid;")
    public final class60 method427(int arg0, int arg1, int arg2) {
        if (arg1 >= -43) {
            this.method422(-73);
        }
        class60 var4 = new class60();
        field1469++;
        var4.field1453 = new byte[arg0 - arg2];
        var4.field1474 = arg0 - arg2;
        class149.method1136(this.field1453, arg2, var4.field1453, 0, var4.field1474);
        return var4;
    }

    @OriginalMember(owner = "client!id", name = "c", descriptor = "(I)Lid;")
    public final class60 method428(int arg0) {
        class60 var2 = new class60();
        field1446++;
        var2.field1474 = this.field1474;
        var2.field1453 = new byte[this.field1474];
        if (arg0 != 90) {
            return null;
        }
        for (int var3 = 0; var3 < this.field1474; var3++) {
            byte var4 = this.field1453[var3];
            if (var4 >= 65 && var4 <= 90 || var4 >= -64 && var4 <= -34 && var4 != -41) {
                var4 = (byte) (var4 + 32);
            }
            var2.field1453[var3] = var4;
        }
        return var2;
    }

    @OriginalMember(owner = "client!id", name = "b", descriptor = "(BI)I")
    public final int method429(byte arg0, int arg1) {
        if (arg1 < 1 || arg1 > 36) {
            arg1 = 10;
        }
        boolean var3 = false;
        field1450++;
        boolean var4 = false;
        int var5 = 0;
        for (int var6 = 0; var6 < this.field1474; var6++) {
            int var7 = this.field1453[var6] & 0xFF;
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
            if (var7 >= arg1) {
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
        if (arg0 >= -37) {
            this.method425(-105, -97);
        }
        return var5;
    }

    @OriginalMember(owner = "client!id", name = "d", descriptor = "(I)J")
    public final long method430(int arg0) {
        if (arg0 < 67) {
            field1488 = null;
        }
        field1440++;
        long var2 = 0L;
        for (int var4 = 0; this.field1474 > var4 && var4 < 12; var4++) {
            byte var5 = this.field1453[var4];
            var2 *= 37L;
            if (var5 >= 65 && var5 <= 90) {
                var2 += var5 + 1 - 65;
            } else if (var5 >= 97 && var5 <= 122) {
                var2 += var5 - 96;
            } else if (var5 >= 48 && var5 <= 57) {
                var2 += var5 + 27 - 48;
            }
        }
        while (var2 % 37L == 0L && var2 != 0L) {
            var2 /= 37L;
        }
        return var2;
    }

    @OriginalMember(owner = "client!id", name = "e", descriptor = "(I)Lid;")
    public final class60 method431(int arg0) {
        class60 var2 = new class60();
        int var3 = 0;
        var2.field1474 = 0;
        field1492++;
        var2.field1453 = new byte[12];
        for (int var4 = 0; var4 < this.field1474; var4++) {
            if (this.field1453[var4] >= 65 && this.field1453[var4] <= 90) {
                var2.field1453[var3++] = (byte) (this.field1453[var4] + 32);
                var2.field1474 = var3;
            } else if (this.field1453[var4] >= 97 && this.field1453[var4] <= 122 || this.field1453[var4] >= 48 && this.field1453[var4] <= 57) {
                var2.field1453[var3++] = this.field1453[var4];
                var2.field1474 = var3;
            } else if (var3 > 0) {
                var2.field1453[var3++] = 95;
            }
            if (var3 == 12) {
                break;
            }
        }
        if (arg0 != 97) {
            this.method450((byte) 68, null);
        }
        return var2;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(Lid;Z)I")
    public final int method432(class60 arg0, boolean arg1) {
        field1463++;
        int var3;
        if (arg0.field1474 >= this.field1474) {
            var3 = this.field1474;
        } else {
            var3 = arg0.field1474;
        }
        if (arg1) {
            return 38;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            if ((arg0.field1453[var4] & 0xFF) > (this.field1453[var4] & 0xFF)) {
                return -1;
            }
            if ((this.field1453[var4] & 0xFF) > (arg0.field1453[var4] & 0xFF)) {
                return 1;
            }
        }
        if (this.field1474 < arg0.field1474) {
            return -1;
        } else if (this.field1474 > arg0.field1474) {
            return 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(B)Z")
    public final boolean method433(byte arg0) {
        field1460++;
        if (arg0 >= -62) {
            this.hashCode();
        }
        return this.method425(10, -16823);
    }

    @OriginalMember(owner = "client!id", name = "b", descriptor = "(B)Lid;")
    public final class60 method434(byte arg0) {
        field1448++;
        class60 var2 = new class60();
        var2.field1474 = this.field1474;
        if (arg0 <= 30) {
            field1466 = 9;
        }
        var2.field1453 = new byte[this.field1474];
        boolean var3 = true;
        for (int var4 = 0; var4 < this.field1474; var4++) {
            byte var5 = this.field1453[var4];
            if (var5 == 95) {
                var3 = true;
                var2.field1453[var4] = 32;
            } else if (var5 >= 97 && var5 <= 122 && var3) {
                var3 = false;
                var2.field1453[var4] = (byte) (var5 - 32);
            } else {
                var2.field1453[var4] = var5;
                var3 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!id", name = "f", descriptor = "(I)I")
    public final int method435(int arg0) {
        field1494++;
        int var2 = arg0;
        for (int var3 = 0; var3 < this.field1474; var3++) {
            var2 = (this.field1453[var3] & 0xFF) + (var2 << 5) - var2;
        }
        return var2;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(IILjava/awt/Graphics;I)V")
    public final void method436(int arg0, int arg1, Graphics arg2, int arg3) {
        field1483++;
        String var5;
        try {
            var5 = new String(this.field1453, 0, this.field1474, "ISO-8859-1");
            if (arg3 != -14404) {
                this.field1474 = -6;
            }
        } catch (UnsupportedEncodingException var6) {
            var5 = new String(this.field1453, 0, this.field1474);
        }
        arg2.drawString(var5, arg0, arg1);
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(Lid;I)Lid;")
    public final class60 method437(class60 arg0, int arg1) {
        field1490++;
        if (!this.field1481) {
            throw new IllegalArgumentException();
        }
        this.field1471 = 0;
        if (this.field1453.length < this.field1474 + arg0.field1474) {
            int var3;
            for (var3 = 1; var3 < this.field1474 + arg0.field1474; var3 += var3) {
            }
            byte[] var4 = new byte[var3];
            class149.method1136(this.field1453, 0, var4, 0, this.field1474);
            this.field1453 = var4;
        }
        if (arg1 != 122) {
            field1475 = -128;
        }
        class149.method1136(arg0.field1453, 0, this.field1453, this.field1474, arg0.field1474);
        this.field1474 += arg0.field1474;
        return this;
    }

    @OriginalMember(owner = "client!id", name = "g", descriptor = "(I)J")
    private final long method438(int arg0) {
        field1476++;
        long var2 = 0L;
        if (arg0 != 1) {
            this.method430(81);
        }
        for (int var4 = 0; var4 < this.field1474; var4++) {
            var2 = (var2 << 5) + (long) (this.field1453[var4] & 0xFF) - var2;
        }
        return var2;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(Z)Lid;")
    public final class60 method439(boolean arg0) {
        field1467++;
        if (!this.field1481) {
            throw new IllegalArgumentException();
        }
        this.field1471 = 0;
        if (arg0) {
            this.method456(120, null);
        }
        if (this.field1453.length != this.field1474) {
            byte[] var2 = new byte[this.field1474];
            class149.method1136(this.field1453, 0, var2, 0, this.field1474);
            this.field1453 = var2;
        }
        return this;
    }

    @OriginalMember(owner = "client!id", name = "h", descriptor = "(I)[B")
    public final byte[] method440(int arg0) {
        field1449++;
        byte[] var2 = new byte[this.field1474];
        class149.method1136(this.field1453, 0, var2, arg0, this.field1474);
        return var2;
    }

    @OriginalMember(owner = "client!id", name = "c", descriptor = "(BI)Lid;")
    public final class60 method441(byte arg0, int arg1) {
        field1472++;
        if (arg1 <= 0 || arg1 > 255) {
            throw new IllegalArgumentException("invalid char:" + arg1);
        } else if (this.field1481) {
            this.field1471 = 0;
            if (this.field1453.length == this.field1474) {
                int var3;
                for (var3 = 1; var3 <= this.field1474; var3 += var3) {
                }
                byte[] var4 = new byte[var3];
                class149.method1136(this.field1453, 0, var4, 0, this.field1474);
                this.field1453 = var4;
            }
            this.field1453[this.field1474++] = (byte) arg1;
            int var5 = -92 % ((-arg0 - 28) / 54);
            return this;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!id", name = "i", descriptor = "(I)Lid;")
    public final class60 method442(int arg0) {
        field1493++;
        class60 var2 = new class60();
        var2.field1474 = this.field1474;
        var2.field1453 = new byte[this.field1474];
        for (int var3 = 0; var3 < this.field1474; var3++) {
            var2.field1453[var3] = 42;
        }
        int var4 = 70 / ((arg0 - 27) / 54);
        return var2;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(IZI)I")
    private final int method443(int arg0, boolean arg1, int arg2) {
        field1495++;
        byte var4 = (byte) arg0;
        for (int var5 = arg2; var5 < this.field1474; var5++) {
            if (this.field1453[var5] == var4) {
                return var5;
            }
        }
        if (arg1) {
            this.method418(48, (byte) 102);
        }
        return -1;
    }

    @OriginalMember(owner = "client!id", name = "b", descriptor = "(Z)Lid;")
    public final class60 method444(boolean arg0) {
        field1445++;
        class60 var2 = new class60();
        byte var3 = 2;
        var2.field1474 = this.field1474;
        var2.field1453 = new byte[this.field1474];
        for (int var4 = 0; var4 < this.field1474; var4++) {
            byte var5 = this.field1453[var4];
            if (var5 >= 97 && var5 <= 122 || !(var5 < -32 || var5 > -2 || var5 == -9)) {
                if (var3 == 2) {
                    var5 = (byte) (var5 - 32);
                }
                var3 = 0;
            } else if (var5 >= 65 && var5 <= 90 || var5 >= -64 && var5 <= -34 && var5 != -41) {
                if (var3 == 0) {
                    var5 = (byte) (var5 + 32);
                }
                var3 = 0;
            } else if (var5 == 46 || var5 == 33 || var5 == 63) {
                var3 = 2;
            } else if (var5 != 32) {
                var3 = 1;
            } else if (var3 != 2) {
                var3 = 1;
            }
            var2.field1453[var4] = var5;
        }
        if (!arg0) {
            field1466 = 121;
        }
        return var2;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(IIBI[B)I")
    public final int method445(int arg0, int arg1, byte arg2, int arg3, byte[] arg4) {
        class149.method1136(this.field1453, arg1, arg4, arg3, arg0 - arg1);
        field1452++;
        return arg2 == 55 ? arg0 - arg1 : 98;
    }

    @OriginalMember(owner = "client!id", name = "b", descriptor = "(Lid;I)I")
    public final int method446(class60 arg0, int arg1) {
        field1455++;
        if (arg1 != 0) {
            field1491 = null;
        }
        return this.method423((byte) 119, 0, arg0);
    }

    @OriginalMember(owner = "client!id", name = "c", descriptor = "(B)I")
    public final int method447(byte arg0) {
        field1462++;
        if (arg0 != 39) {
            this.method433((byte) -30);
        }
        return this.field1474;
    }

    @OriginalMember(owner = "client!id", name = "hashCode", descriptor = "()I")
    public final int hashCode() {
        field1458++;
        return this.method435(0);
    }

    @OriginalMember(owner = "client!id", name = "c", descriptor = "(Lid;I)Z")
    public final boolean method448(class60 arg0, int arg1) {
        field1486++;
        if (this.field1474 < arg0.field1474) {
            return false;
        }
        int var3 = this.field1474 - arg0.field1474;
        if (arg1 < 80) {
            return false;
        }
        for (int var4 = 0; var4 < arg0.field1474; var4++) {
            if (this.field1453[var3 + var4] != arg0.field1453[var4]) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!id", name = "j", descriptor = "(I)Lid;")
    public final class60 method449(int arg0) {
        field1443++;
        long var2 = this.method438(arg0 + 5179);
        synchronized (field1498 == null ? (field1498 = method458("id")) : field1498) {
            if (class105.field2590 == null) {
                class105.field2590 = new class86(4096);
            } else {
                for (class113 var5 = (class113) class105.field2590.method716((byte) 114, var2); var5 != null; var5 = (class113) class105.field2590.method717(false)) {
                    if (this.method451(var5.field2709, 11207)) {
                        return var5.field2709;
                    }
                }
            }
            if (arg0 != -5178) {
                field1442 = 81;
            }
            class113 var7 = new class113();
            var7.field2709 = this;
            this.field1481 = false;
            class105.field2590.method712(var2, var7, (byte) 124);
            return this;
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(BLid;)Z")
    public final boolean method450(byte arg0, class60 arg1) {
        field1451++;
        int var3 = -40 / ((-arg0 - 4) / 50);
        if (arg1.field1474 > this.field1474) {
            return false;
        }
        for (int var4 = 0; var4 < arg1.field1474; var4++) {
            if (this.field1453[var4] != arg1.field1453[var4]) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!id", name = "d", descriptor = "(Lid;I)Z")
    public final boolean method451(class60 arg0, int arg1) {
        if (arg1 != 11207) {
            this.toString();
        }
        field1461++;
        if (arg0 == null) {
            return false;
        } else if (this.field1474 == arg0.field1474) {
            if (!this.field1481 || !arg0.field1481) {
                if (this.field1471 == 0) {
                    this.field1471 = this.method435(0);
                    if (this.field1471 == 0) {
                        this.field1471 = 1;
                    }
                }
                if (arg0.field1471 == 0) {
                    arg0.field1471 = arg0.method435(0);
                    if (arg0.field1471 == 0) {
                        arg0.field1471 = 1;
                    }
                }
                if (this.field1471 != arg0.field1471) {
                    return false;
                }
            }
            for (int var3 = 0; var3 < this.field1474; var3++) {
                if (this.field1453[var3] != arg0.field1453[var3]) {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!id", name = "k", descriptor = "(I)Ljava/net/URL;")
    public final URL method452(int arg0) throws MalformedURLException {
        if (arg0 > -4) {
            this.method457((byte) -7, null);
        }
        field1473++;
        return new URL(new String(this.field1453, 0, this.field1474));
    }

    @OriginalMember(owner = "client!id", name = "b", descriptor = "(IB)I")
    public final int method453(int arg0, byte arg1) {
        field1454++;
        if (arg1 != 34) {
            this.method436(-29, -89, null, -106);
        }
        return this.method443(arg0, false, 0);
    }

    @OriginalMember(owner = "client!id", name = "d", descriptor = "(B)V")
    public static void method454(byte arg0) {
        field1491 = null;
        field1468 = null;
        int var1 = 89 % ((arg0 + 17) / 54);
        field1488 = null;
        field1470 = null;
        field1485 = null;
        field1465 = null;
    }

    @OriginalMember(owner = "client!id", name = "d", descriptor = "(II)Lid;")
    public final class60 method455(int arg0, int arg1) {
        if (arg1 != 20676) {
            this.method434((byte) -35);
        }
        field1456++;
        if (arg0 <= 0 || arg0 > 255) {
            throw new IllegalArgumentException("invalid char");
        }
        class60 var3 = new class60();
        var3.field1453 = new byte[this.field1474 + 1];
        var3.field1474 = this.field1474 + 1;
        class149.method1136(this.field1453, 0, var3.field1453, 0, this.field1474);
        var3.field1453[this.field1474] = (byte) arg0;
        return var3;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(ILid;)I")
    public final int method456(int arg0, class60 arg1) {
        int var3;
        if (this.field1474 <= arg1.field1474) {
            var3 = this.field1474;
        } else {
            var3 = arg1.field1474;
        }
        field1441++;
        if (arg0 != 6954) {
            this.method444(false);
        }
        for (int var4 = 0; var4 < var3; var4++) {
            if (class80.field1953[arg1.field1453[var4] & 0xFF] > class80.field1953[this.field1453[var4] & 0xFF]) {
                return -1;
            }
            if (class80.field1953[arg1.field1453[var4] & 0xFF] < class80.field1953[this.field1453[var4] & 0xFF]) {
                return 1;
            }
        }
        if (this.field1474 < arg1.field1474) {
            return -1;
        } else if (arg1.field1474 < this.field1474) {
            return 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(BLjava/awt/FontMetrics;)I")
    public final int method457(byte arg0, FontMetrics arg1) {
        String var3;
        try {
            var3 = new String(this.field1453, 0, this.field1474, "ISO-8859-1");
        } catch (UnsupportedEncodingException var4) {
            var3 = new String(this.field1453, 0, this.field1474);
        }
        field1478++;
        if (arg0 != -96) {
            field1465 = null;
        }
        return arg1.stringWidth(var3);
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!id", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method458(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
