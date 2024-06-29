import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public class class103 {

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "Z")
    public boolean field1384 = true;

    @OriginalMember(owner = "client!ua", name = "x", descriptor = "I")
    public int field1407 = 0;

    @OriginalMember(owner = "client!ua", name = "u", descriptor = "[Ljava/lang/String;")
    public String[] field1404 = new String[5];

    @OriginalMember(owner = "client!ua", name = "o", descriptor = "I")
    private int field1398 = -1;

    @OriginalMember(owner = "client!ua", name = "r", descriptor = "I")
    public int field1401 = -1;

    @OriginalMember(owner = "client!ua", name = "n", descriptor = "I")
    public int field1397 = -1;

    @OriginalMember(owner = "client!ua", name = "C", descriptor = "Z")
    public boolean field1412 = false;

    @OriginalMember(owner = "client!ua", name = "D", descriptor = "I")
    private int field1413 = -1;

    @OriginalMember(owner = "client!ua", name = "K", descriptor = "I")
    private int field1420 = -1;

    @OriginalMember(owner = "client!ua", name = "L", descriptor = "I")
    public int field1421 = -1;

    @OriginalMember(owner = "client!ua", name = "I", descriptor = "I")
    public int field1418 = -1;

    @OriginalMember(owner = "client!ua", name = "G", descriptor = "I")
    private int field1416 = -1;

    @OriginalMember(owner = "client!ua", name = "F", descriptor = "Z")
    public boolean field1415 = true;

    @OriginalMember(owner = "client!ua", name = "g", descriptor = "Z")
    public boolean field1390 = true;

    @OriginalMember(owner = "client!ua", name = "f", descriptor = "I")
    private int field1389 = -1;

    @OriginalMember(owner = "client!ua", name = "N", descriptor = "F")
    public static float field1423 = 128.0F;

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "I")
    public static int field1385;

    @OriginalMember(owner = "client!ua", name = "c", descriptor = "I")
    public static int field1386;

    @OriginalMember(owner = "client!ua", name = "d", descriptor = "I")
    public static int field1387;

    @OriginalMember(owner = "client!ua", name = "e", descriptor = "I")
    public int field1388;

    @OriginalMember(owner = "client!ua", name = "h", descriptor = "I")
    public int field1391;

    @OriginalMember(owner = "client!ua", name = "i", descriptor = "I")
    public int field1392;

    @OriginalMember(owner = "client!ua", name = "j", descriptor = "I")
    public static int field1393;

    @OriginalMember(owner = "client!ua", name = "k", descriptor = "I")
    public int field1394;

    @OriginalMember(owner = "client!ua", name = "l", descriptor = "I")
    private int field1395;

    @OriginalMember(owner = "client!ua", name = "p", descriptor = "I")
    public static int field1399;

    @OriginalMember(owner = "client!ua", name = "q", descriptor = "I")
    public int field1400;

    @OriginalMember(owner = "client!ua", name = "s", descriptor = "I")
    public static int field1402;

    @OriginalMember(owner = "client!ua", name = "t", descriptor = "I")
    private int field1403;

    @OriginalMember(owner = "client!ua", name = "v", descriptor = "I")
    public static int field1405;

    @OriginalMember(owner = "client!ua", name = "w", descriptor = "I")
    public static int field1406;

    @OriginalMember(owner = "client!ua", name = "y", descriptor = "I")
    public int field1408;

    @OriginalMember(owner = "client!ua", name = "A", descriptor = "I")
    private int field1410;

    @OriginalMember(owner = "client!ua", name = "B", descriptor = "I")
    private int field1411;

    @OriginalMember(owner = "client!ua", name = "E", descriptor = "I")
    public static int field1414;

    @OriginalMember(owner = "client!ua", name = "H", descriptor = "I")
    public static int field1417;

    @OriginalMember(owner = "client!ua", name = "J", descriptor = "I")
    public static int field1419;

    @OriginalMember(owner = "client!ua", name = "m", descriptor = "Ljava/lang/String;")
    public String field1396;

    @OriginalMember(owner = "client!ua", name = "M", descriptor = "Ljava/lang/String;")
    public String field1422;

    @OriginalMember(owner = "client!ua", name = "z", descriptor = "[I")
    public int[] field1409;

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(B)Lfe;", line = 6)
    public final class270 method650(byte arg0) {
        field1405++;
        class270 var2 = (class270) class31.field358.method380(0, (long) (this.field1389 | 0x20000));
        if (arg0 != 28) {
            this.method655(88, (byte) -93, (class143) null);
        }
        if (var2 != null) {
            return var2;
        }
        class208.field3147.method125(this.field1389, -81);
        class270 var3 = class315.method2227(class208.field3147, (byte) -100, 0, this.field1389);
        if (var3 != null) {
            var3.field2362 = 0;
            var3.field2360 = var3.field2361;
            var3.field2365 = 0;
            var3.field2369 = var3.field2366;
            class31.field358.method377((long) (this.field1389 | 0x20000), var3, -1);
        }
        return var3;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(ILlf;)V", line = 33)
    public final void method651(int arg0, class143 arg1) {
        field1406++;
        if (arg0 != -24979) {
            method652((byte) 63);
        }
        while (true) {
            int var3 = arg1.method1043(true);
            if (var3 == 0) {
                return;
            }
            this.method655(var3, (byte) 69, arg1);
        }
    }

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "(B)V", line = 60)
    public static final void method652(byte arg0) {
        if (arg0 > 78) {
            field1385++;
            class360.field5700.method383((byte) -48);
            class332.field5309.method383((byte) -48);
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(I)Z", line = 83)
    public static final boolean method653(int arg0) {
        field1417++;
        if (class272.field4317) {
            return true;
        } else if (arg0 == -29308) {
            return class337.field5384;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(II)V", line = 120)
    public static final void method654(int arg0, int arg1) {
        if (arg0 < -62) {
            field1387++;
            class276.field4345.method387(arg1, false);
            class119.field1648.method387(arg1, false);
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(IBLlf;)V", line = 132)
    private final void method655(int arg0, byte arg1, class143 arg2) {
        if (arg0 == 1) {
            this.field1421 = arg2.method1051(arg1 - 68);
        } else if (arg0 == 2) {
            this.field1401 = arg2.method1051(1);
        } else if (arg0 == 3) {
            this.field1396 = arg2.method1040((byte) -128);
        } else if (arg0 == 4) {
            this.field1394 = arg2.method1017((byte) 101);
        } else if (arg0 == 5) {
            this.field1418 = arg2.method1017((byte) 101);
        } else if (arg0 == 6) {
            this.field1407 = arg2.method1043(true);
        } else if (arg0 == 7) {
            int var4 = arg2.method1043(true);
            if ((var4 & 0x1) == 0) {
                this.field1415 = false;
            }
            if ((var4 & 0x2) == 2) {
                this.field1412 = true;
            }
        } else if (arg0 == 8) {
            this.field1390 = arg2.method1043(true) == 1;
        } else if (arg0 == 9) {
            this.field1420 = arg2.method1051(arg1 ^ 0x44);
            if (this.field1420 == 65535) {
                this.field1420 = -1;
            }
            this.field1398 = arg2.method1051(1);
            if (this.field1398 == 65535) {
                this.field1398 = -1;
            }
            this.field1411 = arg2.method1057(arg1 - 187);
            this.field1403 = arg2.method1057(arg1 ^ 0xFFFFFFD1);
        } else if (arg0 >= 10 && arg0 <= 14) {
            this.field1404[arg0 - 10] = arg2.method1040((byte) -127);
        } else if (arg0 == 15) {
            int var5 = arg2.method1043(true);
            this.field1409 = new int[var5 * 2];
            for (int var6 = 0; var6 < var5 * 2; var6++) {
                this.field1409[var6] = arg2.method1021(-1);
            }
            this.field1392 = arg2.method1057(arg1 ^ 0xFFFFFFCD);
            this.field1400 = arg2.method1057(-117);
        } else if (arg0 == 16) {
            this.field1384 = false;
        } else if (arg0 == 17) {
            this.field1422 = arg2.method1040((byte) -127);
        } else if (arg0 == 18) {
            this.field1389 = arg2.method1051(1);
        } else if (arg0 == 19) {
            this.field1397 = arg2.method1051(arg1 ^ 0x44);
        } else if (arg0 == 20) {
            this.field1416 = arg2.method1051(1);
            if (this.field1416 == 65535) {
                this.field1416 = -1;
            }
            this.field1413 = arg2.method1051(arg1 ^ 0x44);
            if (this.field1413 == 65535) {
                this.field1413 = -1;
            }
            this.field1395 = arg2.method1057(-118);
            this.field1410 = arg2.method1057(-112);
        } else if (arg0 == 21) {
            this.field1408 = arg2.method1057(-111);
        } else if (arg0 == 22) {
            this.field1388 = arg2.method1057(-118);
        }
        field1386++;
        if (arg1 != 69) {
            this.field1400 = 33;
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(ZBZ)Lcf;", line = 279)
    public final class149 method656(boolean arg0, byte arg1, boolean arg2) {
        int var4 = -88 / ((arg1 + 65) / 47);
        int var5 = arg2 ? this.field1401 : this.field1421;
        class149 var6 = (class149) class31.field358.method380(0, (long) ((arg2 ? 65536 : 0) | var5));
        field1393++;
        if (var6 != null) {
            return var6;
        } else if (class208.field3147.method125(var5, 113)) {
            class270 var7 = class315.method2227(class208.field3147, (byte) -100, 0, var5);
            class149 var8;
            if (class272.field4317 && !arg0) {
                var8 = new class217(var7);
            } else {
                var8 = var7;
            }
            if (var8 != null) {
                var8.field2360 = var8.field2361;
                var8.field2362 = 0;
                var8.field2369 = var8.field2366;
                var8.field2365 = 0;
                class31.field358.method377((long) ((arg2 ? 65536 : 0) | var5), var8, -1);
            }
            return var8;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "(I)Z", line = 328)
    public final boolean method657(int arg0) {
        field1419++;
        if (arg0 <= 37) {
            this.field1407 = 50;
        }
        if (this.field1398 == -1 && this.field1420 == -1) {
            return true;
        }
        boolean var2 = false;
        int var3;
        if (this.field1398 == -1) {
            var3 = class201.method1396((byte) -95, this.field1420);
        } else {
            var3 = class255.field4041[this.field1398];
        }
        if (var3 < this.field1411 || this.field1403 < var3) {
            return false;
        } else if (this.field1413 == -1 && this.field1416 == -1) {
            return true;
        } else {
            boolean var4 = false;
            int var5;
            if (this.field1413 == -1) {
                var5 = class201.method1396((byte) 117, this.field1416);
            } else {
                var5 = class255.field4041[this.field1413];
            }
            return var5 >= this.field1395 && this.field1410 >= var5;
        }
    }
}
