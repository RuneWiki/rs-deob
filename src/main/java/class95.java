import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rg")
public class class95 extends class32 {

    @OriginalMember(owner = "client!rg", name = "i", descriptor = "I")
    private int field1361 = 0;

    @OriginalMember(owner = "client!rg", name = "J", descriptor = "Lhj;")
    private class29 field1388 = new class29(16);

    @OriginalMember(owner = "client!rg", name = "S", descriptor = "I")
    private int field1397 = 0;

    @OriginalMember(owner = "client!rg", name = "R", descriptor = "Lad;")
    private class128 field1396 = new class128();

    @OriginalMember(owner = "client!rg", name = "U", descriptor = "J")
    private long field1399 = 0L;

    @OriginalMember(owner = "client!rg", name = "D", descriptor = "I")
    private int field1382;

    @OriginalMember(owner = "client!rg", name = "s", descriptor = "Lbm;")
    private class137 field1371;

    @OriginalMember(owner = "client!rg", name = "P", descriptor = "Z")
    private boolean field1394;

    @OriginalMember(owner = "client!rg", name = "Q", descriptor = "Lad;")
    private class128 field1395;

    @OriginalMember(owner = "client!rg", name = "C", descriptor = "Lb;")
    private class60 field1381;

    @OriginalMember(owner = "client!rg", name = "x", descriptor = "Lbm;")
    private class137 field1376;

    @OriginalMember(owner = "client!rg", name = "V", descriptor = "Z")
    private boolean field1400;

    @OriginalMember(owner = "client!rg", name = "y", descriptor = "I")
    private int field1377;

    @OriginalMember(owner = "client!rg", name = "w", descriptor = "I")
    private int field1375;

    @OriginalMember(owner = "client!rg", name = "I", descriptor = "Lqc;")
    private class4 field1387;

    @OriginalMember(owner = "client!rg", name = "u", descriptor = "Lan;")
    private class322 field1373;

    @OriginalMember(owner = "client!rg", name = "F", descriptor = "Ljava/lang/String;")
    public static String field1384 = "rating: ";

    @OriginalMember(owner = "client!rg", name = "k", descriptor = "Lad;")
    public static class128 field1363 = new class128();

    @OriginalMember(owner = "client!rg", name = "j", descriptor = "F")
    public static float field1362;

    @OriginalMember(owner = "client!rg", name = "h", descriptor = "I")
    public static int field1360;

    @OriginalMember(owner = "client!rg", name = "l", descriptor = "I")
    public static int field1364;

    @OriginalMember(owner = "client!rg", name = "m", descriptor = "I")
    public static int field1365;

    @OriginalMember(owner = "client!rg", name = "n", descriptor = "I")
    public static int field1366;

    @OriginalMember(owner = "client!rg", name = "q", descriptor = "I")
    public static int field1369;

    @OriginalMember(owner = "client!rg", name = "r", descriptor = "I")
    public static int field1370;

    @OriginalMember(owner = "client!rg", name = "t", descriptor = "I")
    public static int field1372;

    @OriginalMember(owner = "client!rg", name = "v", descriptor = "I")
    public static int field1374;

    @OriginalMember(owner = "client!rg", name = "z", descriptor = "I")
    public static int field1378;

    @OriginalMember(owner = "client!rg", name = "A", descriptor = "I")
    public static int field1379;

    @OriginalMember(owner = "client!rg", name = "B", descriptor = "I")
    public static int field1380;

    @OriginalMember(owner = "client!rg", name = "E", descriptor = "I")
    public static int field1383;

    @OriginalMember(owner = "client!rg", name = "G", descriptor = "I")
    public static int field1385;

    @OriginalMember(owner = "client!rg", name = "H", descriptor = "I")
    public static int field1386;

    @OriginalMember(owner = "client!rg", name = "K", descriptor = "I")
    public static int field1389;

    @OriginalMember(owner = "client!rg", name = "L", descriptor = "I")
    public static int field1390;

    @OriginalMember(owner = "client!rg", name = "M", descriptor = "I")
    public static int field1391;

    @OriginalMember(owner = "client!rg", name = "O", descriptor = "Ltj;")
    private class180 field1393;

    @OriginalMember(owner = "client!rg", name = "N", descriptor = "Ltd;")
    public static class241 field1392;

    @OriginalMember(owner = "client!rg", name = "T", descriptor = "Z")
    private boolean field1398;

    @OriginalMember(owner = "client!rg", name = "p", descriptor = "[B")
    private byte[] field1368;

    @OriginalMember(owner = "client!rg", name = "o", descriptor = "[[B")
    public static byte[][] field1367;

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(I)V", line = 6)
    public final void method746(int arg0) {
        field1370++;
        if (this.field1395 == null || this.method224((byte) -122) == null) {
            return;
        }
        for (class217 var2 = this.field1396.method986(false); var2 != null; var2 = this.field1396.method982(14877)) {
            int var3 = (int) var2.field3418;
            if (var3 < 0 || var3 >= this.field1393.field2699 || this.field1393.field2712[var3] == 0) {
                var2.method1554((byte) -120);
            } else {
                if (this.field1368[var3] == 0) {
                    this.method761(2, 1, var3);
                }
                if (this.field1368[var3] == -1) {
                    this.method761(2, 2, var3);
                }
                if (this.field1368[var3] == 1) {
                    var2.method1554((byte) -61);
                }
            }
        }
        if (arg0 != 27871) {
            this.field1387 = (class4) null;
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(II)[B", line = 53)
    public final byte[] method222(int arg0, int arg1) {
        field1391++;
        class322 var3 = this.method761(2, 0, arg1);
        if (var3 == null) {
            return null;
        }
        if (arg0 > -99) {
            this.field1395 = (class128) null;
        }
        byte[] var4 = var3.method54((byte) 33);
        var3.method1554((byte) -72);
        return var4;
    }

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "(I)V", line = 72)
    public static void method747(int arg0) {
        field1392 = null;
        field1384 = null;
        field1363 = null;
        field1367 = (byte[][]) null;
        if (arg0 != -18347) {
            method751(false);
        }
    }

    @OriginalMember(owner = "client!rg", name = "d", descriptor = "(B)V", line = 85)
    public final void method748(byte arg0) {
        field1364++;
        if (arg0 <= 96) {
            method760(55, 112, -89);
        }
        if (this.field1395 != null) {
            if (this.method224((byte) -122) == null) {
                return;
            }
            if (this.field1394) {
                boolean var2 = true;
                for (class217 var3 = this.field1395.method986(false); var3 != null; var3 = this.field1395.method982(14877)) {
                    int var4 = (int) var3.field3418;
                    if (this.field1368[var4] == 0) {
                        this.method761(2, 1, var4);
                    }
                    if (this.field1368[var4] == 0) {
                        var2 = false;
                    } else {
                        var3.method1554((byte) -92);
                    }
                }
                while (this.field1393.field2712.length > this.field1397) {
                    if (this.field1393.field2712[this.field1397] == 0) {
                        this.field1397++;
                    } else {
                        if (this.field1381.field906 >= 250) {
                            var2 = false;
                            break;
                        }
                        if (this.field1368[this.field1397] == 0) {
                            this.method761(2, 1, this.field1397);
                        }
                        if (this.field1368[this.field1397] == 0) {
                            var2 = false;
                            class217 var5 = new class217();
                            var5.field3418 = (long) this.field1397;
                            this.field1395.method977(4, var5);
                        }
                        this.field1397++;
                    }
                }
                if (var2) {
                    this.field1394 = false;
                    this.field1397 = 0;
                }
            } else if (this.field1398) {
                boolean var6 = true;
                for (class217 var7 = this.field1395.method986(false); var7 != null; var7 = this.field1395.method982(14877)) {
                    int var8 = (int) var7.field3418;
                    if (this.field1368[var8] != 1) {
                        this.method761(2, 2, var8);
                    }
                    if (this.field1368[var8] == 1) {
                        var7.method1554((byte) -42);
                    } else {
                        var6 = false;
                    }
                }
                while (this.field1397 < this.field1393.field2712.length) {
                    if (this.field1393.field2712[this.field1397] == 0) {
                        this.field1397++;
                    } else {
                        if (this.field1387.method40(false)) {
                            var6 = false;
                            break;
                        }
                        if (this.field1368[this.field1397] != 1) {
                            this.method761(2, 2, this.field1397);
                        }
                        if (this.field1368[this.field1397] != 1) {
                            var6 = false;
                            class217 var9 = new class217();
                            var9.field3418 = (long) this.field1397;
                            this.field1395.method977(4, var9);
                        }
                        this.field1397++;
                    }
                }
                if (var6) {
                    this.field1398 = false;
                    this.field1397 = 0;
                }
            } else {
                this.field1395 = null;
            }
        }
        if (!this.field1400 || class234.method1650((byte) -121) < this.field1399) {
            return;
        }
        for (class322 var10 = (class322) this.field1388.method200(0); var10 != null; var10 = (class322) this.field1388.method202((byte) 94)) {
            if (!var10.field5004) {
                if (var10.field5008) {
                    if (!var10.field4998) {
                        throw new RuntimeException();
                    }
                    var10.method1554((byte) -116);
                } else {
                    var10.field5008 = true;
                }
            }
        }
        this.field1399 = class234.method1650((byte) 52) + 1000L;
    }

    @OriginalMember(owner = "client!rg", name = "c", descriptor = "(I)V", line = 261)
    public final void method749(int arg0) {
        field1386++;
        if (this.field1371 == null) {
            return;
        }
        if (arg0 <= 64) {
            this.method223(-110, -106);
        }
        this.field1398 = true;
        if (this.field1395 == null) {
            this.field1395 = new class128();
        }
    }

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "(II)V", line = 281)
    public final void method223(int arg0, int arg1) {
        if (arg1 != 4) {
            this.method761(-110, -124, -2);
        }
        field1379++;
        if (this.field1371 == null) {
            return;
        }
        for (class217 var3 = this.field1396.method986(false); var3 != null; var3 = this.field1396.method982(arg1 + 14873)) {
            if (((long) arg0) == var3.field3418) {
                return;
            }
        }
        class217 var4 = new class217();
        var4.field3418 = (long) arg0;
        this.field1396.method977(4, var4);
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(B)Ltj;", line = 311)
    public final class180 method224(byte arg0) {
        field1378++;
        if (this.field1393 != null) {
            return this.field1393;
        }
        if (this.field1373 == null) {
            if (this.field1387.method50(arg0 + 1636)) {
                return null;
            }
            this.field1373 = this.field1387.method41(-6479, true, (byte) 0, this.field1382, 255);
        }
        if (this.field1373.field5004) {
            return null;
        } else if (arg0 == -122) {
            byte[] var2 = this.field1373.method54((byte) 33);
            if (this.field1373 instanceof class6) {
                try {
                    if (var2 == null) {
                        throw new RuntimeException();
                    }
                    this.field1393 = new class180(var2, this.field1377);
                    if (this.field1393.field2696 != this.field1375) {
                        throw new RuntimeException();
                    }
                } catch (RuntimeException var5) {
                    this.field1393 = null;
                    if (this.field1387.method50(1514)) {
                        this.field1373 = null;
                    } else {
                        this.field1373 = this.field1387.method41(-6479, true, (byte) 0, this.field1382, 255);
                    }
                    return null;
                }
            } else {
                try {
                    if (var2 == null) {
                        throw new RuntimeException();
                    }
                    this.field1393 = new class180(var2, this.field1377);
                } catch (RuntimeException var6) {
                    this.field1387.method45(false);
                    this.field1393 = null;
                    if (this.field1387.method50(arg0 + 1636)) {
                        this.field1373 = null;
                    } else {
                        this.field1373 = this.field1387.method41(arg0 ^ 0x1937, true, (byte) 0, this.field1382, 255);
                    }
                    return null;
                }
                if (this.field1376 != null) {
                    this.field1381.method538(var2, this.field1382, 8471, this.field1376);
                }
            }
            if (this.field1371 != null) {
                this.field1368 = new byte[this.field1393.field2699];
                this.field1361 = 0;
            }
            this.field1373 = null;
            return this.field1393;
        } else {
            return (class180) null;
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "([SB)[S", line = 409)
    public static final short[] method750(short[] arg0, byte arg1) {
        if (arg1 != -12) {
            return (short[]) null;
        }
        field1360++;
        if (arg0 == null) {
            return null;
        } else {
            short[] var2 = new short[arg0.length];
            class151.method1118(arg0, 0, var2, 0, arg0.length);
            return var2;
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(Z)V", line = 440)
    public static final void method751(boolean arg0) {
        if (arg0) {
            class250.field3746 = class314.field4874;
            class41.field612 = class308.field4797;
            class212.field3364 = class304.field4757;
        } else {
            class250.field3746 = class180.field2695;
            class41.field612 = class258.field3844;
            class212.field3364 = class287.field4423;
        }
        class136.field2126 = class250.field3746.length;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(ILlb;)V", line = 465)
    public static final void method752(int arg0, class211 arg1) {
        class104.field1586 = arg1.method1519((byte) 16, "runes");
        field1389++;
        if (arg0 != 0) {
            field1392 = (class241) null;
        }
    }

    @OriginalMember(owner = "client!rg", name = "d", descriptor = "(I)V", line = 475)
    public static final void method753(int arg0) {
        class112.field1759 = arg0;
        for (int var1 = 0; var1 < class39.field589; var1++) {
            for (int var2 = 0; var2 < class210.field3312; var2++) {
                if (class250.field3746[arg0][var1][var2] == null) {
                    class250.field3746[arg0][var1][var2] = new class99(arg0, var1, var2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(Llb;Z)V", line = 500)
    public static final void method754(class211 arg0, boolean arg1) {
        if (!arg1) {
            field1367 = (byte[][]) ((byte[][]) null);
        }
        field1366++;
        class196.field3113 = arg0;
    }

    @OriginalMember(owner = "client!rg", name = "e", descriptor = "(B)I", line = 511)
    public final int method755(byte arg0) {
        field1365++;
        return arg0 == 84 ? this.field1361 : 1;
    }

    @OriginalMember(owner = "client!rg", name = "f", descriptor = "(B)I", line = 527)
    public final int method756(byte arg0) {
        field1383++;
        if (this.field1393 == null) {
            return 0;
        }
        int var2 = -29 / ((-arg0 - 10) / 41);
        if (this.field1394) {
            class217 var3 = this.field1395.method986(false);
            return var3 == null ? 0 : (int) var3.field3418;
        } else {
            return this.field1393.field2691;
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(IB)I", line = 555)
    public final int method229(int arg0, byte arg1) {
        if (arg1 == 0) {
            class322 var3 = (class322) this.field1388.method203(arg1 + 1710, (long) arg0);
            field1380++;
            return var3 == null ? 0 : var3.method56(100);
        } else {
            return -44;
        }
    }

    @OriginalMember(owner = "client!rg", name = "g", descriptor = "(B)I", line = 571)
    public final int method757(byte arg0) {
        field1372++;
        if (this.method224((byte) -122) == null) {
            return this.field1373 == null ? 0 : this.field1373.method56(100);
        } else if (arg0 >= -54) {
            return 100;
        } else {
            return 100;
        }
    }

    @OriginalMember(owner = "client!rg", name = "h", descriptor = "(B)I", line = 592)
    public final int method758(byte arg0) {
        field1374++;
        if (arg0 != -58) {
            this.method761(-42, 80, 113);
        }
        return this.field1393 == null ? 0 : this.field1393.field2691;
    }

    @OriginalMember(owner = "client!rg", name = "i", descriptor = "(B)V", line = 609)
    public static final void method759(byte arg0) {
        class126.field1989 = class7.method66(4, 2048, 0.4F, 8, 35, true, 8, (byte) 50);
        field1390++;
        if (arg0 <= 24) {
            method751(false);
        }
    }

    @OriginalMember(owner = "client!rg", name = "<init>", descriptor = "(ILbm;Lbm;Lqc;Lb;IIZ)V", line = 945)
    public class95(int arg0, class137 arg1, class137 arg2, class4 arg3, class60 arg4, int arg5, int arg6, boolean arg7) {
        this.field1382 = arg0;
        this.field1371 = arg1;
        if (this.field1371 == null) {
            this.field1394 = false;
        } else {
            this.field1394 = true;
            this.field1395 = new class128();
        }
        this.field1381 = arg4;
        this.field1376 = arg2;
        this.field1400 = arg7;
        this.field1377 = arg5;
        this.field1375 = arg6;
        this.field1387 = arg3;
        if (this.field1376 != null) {
            this.field1373 = this.field1381.method534(this.field1376, this.field1382, -57);
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(III)V", line = 638)
    public static final void method760(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class136.field2126; var3++) {
            for (int var4 = 0; var4 < class39.field589; var4++) {
                for (int var5 = 0; var5 < class210.field3312; var5++) {
                    class99 var6 = class250.field3746[var3][var4][var5];
                    if (var6 != null) {
                        class10 var7 = var6.field1486;
                        if (var7 != null && var7.field98.method386()) {
                            class15.method112(var7.field98, var3, var4, var5, 1, 1);
                            if (var7.field94 != null && var7.field94.method386()) {
                                class15.method112(var7.field94, var3, var4, var5, 1, 1);
                                var7.field98.method400(var7.field94, 0, 0, 0, false);
                                var7.field94 = var7.field94.method381(arg0, arg1, arg2);
                            }
                            var7.field98 = var7.field98.method381(arg0, arg1, arg2);
                        }
                        for (int var8 = 0; var8 < var6.field1488; var8++) {
                            class91 var9 = var6.field1471[var8];
                            if (var9 != null && var9.field1326.method386()) {
                                class15.method112(var9.field1326, var3, var4, var5, var9.field1317 + 1 - var9.field1329, var9.field1319 - var9.field1323 + 1);
                                var9.field1326 = var9.field1326.method381(arg0, arg1, arg2);
                            }
                        }
                        class173 var10 = var6.field1472;
                        if (var10 != null && var10.field2560.method386()) {
                            class106.method820(var10.field2560, var3, var4, var5);
                            var10.field2560 = var10.field2560.method381(arg0, arg1, arg2);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "(III)Lan;", line = 709)
    private final class322 method761(int arg0, int arg1, int arg2) {
        field1369++;
        class322 var4 = (class322) this.field1388.method203(1710, (long) arg2);
        if (var4 != null && arg1 == 0 && !var4.field4998 && var4.field5004) {
            var4.method1554((byte) -26);
            var4 = null;
        }
        if (var4 == null) {
            if (arg1 == 0) {
                if (this.field1371 == null || this.field1368[arg2] == -1) {
                    if (this.field1387.method50(1514)) {
                        return null;
                    }
                    var4 = this.field1387.method41(-6479, true, (byte) 2, arg2, this.field1382);
                } else {
                    var4 = this.field1381.method534(this.field1371, arg2, -119);
                }
            } else if (arg1 == 1) {
                if (this.field1371 == null) {
                    throw new RuntimeException();
                }
                var4 = this.field1381.method541(arg2, this.field1371, arg0 ^ 0x0);
            } else if (arg1 == 2) {
                if (this.field1371 == null) {
                    throw new RuntimeException();
                }
                if (this.field1368[arg2] != -1) {
                    throw new RuntimeException();
                }
                if (this.field1387.method40(false)) {
                    return null;
                }
                var4 = this.field1387.method41(-6479, false, (byte) 2, arg2, this.field1382);
            } else {
                throw new RuntimeException();
            }
            this.field1388.method208(var4, (long) arg2, 0);
        }
        if (arg0 != 2) {
            this.field1393 = (class180) null;
        }
        if (var4.field5004) {
            return null;
        }
        byte[] var5 = var4.method54((byte) 33);
        if (!var4 instanceof class6) {
            try {
                if (var5 == null || var5.length <= 2) {
                    throw new RuntimeException();
                }
                class326.field5064.reset();
                class326.field5064.update(var5, 0, var5.length - 2);
                int var10 = (int) class326.field5064.getValue();
                if (this.field1393.field2706[arg2] != var10) {
                    throw new RuntimeException();
                }
                this.field1387.field44 = 0;
                this.field1387.field45 = 0;
            } catch (RuntimeException var14) {
                this.field1387.method45(false);
                var4.method1554((byte) -33);
                if (var4.field4998 && !this.field1387.method50(1514)) {
                    class188 var12 = this.field1387.method41(-6479, true, (byte) 2, arg2, this.field1382);
                    this.field1388.method208(var12, (long) arg2, 0);
                }
                return null;
            }
            var5[var5.length - 2] = (byte) (this.field1393.field2692[arg2] >>> 8);
            var5[var5.length - 1] = (byte) this.field1393.field2692[arg2];
            if (this.field1371 != null) {
                this.field1381.method538(var5, arg2, arg0 ^ 0x2115, this.field1371);
                if (this.field1368[arg2] != 1) {
                    this.field1361++;
                    this.field1368[arg2] = 1;
                }
            }
            if (!var4.field4998) {
                var4.method1554((byte) -83);
            }
            return var4;
        }
        try {
            if (var5 == null || var5.length <= 2) {
                throw new RuntimeException();
            }
            class326.field5064.reset();
            class326.field5064.update(var5, 0, var5.length - 2);
            int var6 = (int) class326.field5064.getValue();
            if (this.field1393.field2706[arg2] != var6) {
                throw new RuntimeException();
            }
            int var7 = ((var5[var5.length - 2] & 0xFF) << 8) + (var5[var5.length - 1] & 0xFF);
            if ((this.field1393.field2692[arg2] & 0xFFFF) != var7) {
                throw new RuntimeException();
            }
            if (this.field1368[arg2] != 1) {
                if (this.field1368[arg2] == 0) {
                }
                this.field1361++;
                this.field1368[arg2] = 1;
            }
            if (!var4.field4998) {
                var4.method1554((byte) -58);
            }
            return var4;
        } catch (Exception var13) {
            this.field1368[arg2] = -1;
            var4.method1554((byte) -79);
            if (var4.field4998 && !this.field1387.method50(1514)) {
                class188 var9 = this.field1387.method41(arg0 - 6481, true, (byte) 2, arg2, this.field1382);
                this.field1388.method208(var9, (long) arg2, 0);
            }
            return null;
        }
    }
}
