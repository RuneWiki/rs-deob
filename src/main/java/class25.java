import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rk")
public class class25 {

    @OriginalMember(owner = "client!rk", name = "e", descriptor = "Z")
    public boolean field345 = true;

    @OriginalMember(owner = "client!rk", name = "x", descriptor = "I")
    private int field364 = -1;

    @OriginalMember(owner = "client!rk", name = "B", descriptor = "I")
    private int field368 = -1;

    @OriginalMember(owner = "client!rk", name = "N", descriptor = "Z")
    public boolean field380 = true;

    @OriginalMember(owner = "client!rk", name = "s", descriptor = "I")
    public int field359 = -1;

    @OriginalMember(owner = "client!rk", name = "m", descriptor = "Z")
    public boolean field353 = true;

    @OriginalMember(owner = "client!rk", name = "u", descriptor = "I")
    public int field361 = -1;

    @OriginalMember(owner = "client!rk", name = "A", descriptor = "I")
    public int field367 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!rk", name = "M", descriptor = "[Ljava/lang/String;")
    public String[] field379 = new String[5];

    @OriginalMember(owner = "client!rk", name = "K", descriptor = "I")
    public int field377 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!rk", name = "O", descriptor = "I")
    private int field381 = -1;

    @OriginalMember(owner = "client!rk", name = "F", descriptor = "I")
    private int field372 = -1;

    @OriginalMember(owner = "client!rk", name = "g", descriptor = "I")
    public int field347 = 0;

    @OriginalMember(owner = "client!rk", name = "y", descriptor = "I")
    public int field365 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!rk", name = "T", descriptor = "Z")
    public boolean field386 = false;

    @OriginalMember(owner = "client!rk", name = "C", descriptor = "I")
    public int field369 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!rk", name = "f", descriptor = "I")
    private int field346 = -1;

    @OriginalMember(owner = "client!rk", name = "p", descriptor = "I")
    public int field356 = -1;

    @OriginalMember(owner = "client!rk", name = "J", descriptor = "I")
    public int field376 = -1;

    @OriginalMember(owner = "client!rk", name = "I", descriptor = "J")
    public static long field375 = 0L;

    @OriginalMember(owner = "client!rk", name = "b", descriptor = "I")
    public static int field342;

    @OriginalMember(owner = "client!rk", name = "c", descriptor = "I")
    public static int field343;

    @OriginalMember(owner = "client!rk", name = "d", descriptor = "I")
    public int field344;

    @OriginalMember(owner = "client!rk", name = "i", descriptor = "I")
    public static int field349;

    @OriginalMember(owner = "client!rk", name = "j", descriptor = "I")
    public int field350;

    @OriginalMember(owner = "client!rk", name = "k", descriptor = "I")
    private int field351;

    @OriginalMember(owner = "client!rk", name = "l", descriptor = "I")
    public static int field352;

    @OriginalMember(owner = "client!rk", name = "n", descriptor = "I")
    private int field354;

    @OriginalMember(owner = "client!rk", name = "o", descriptor = "I")
    public static int field355;

    @OriginalMember(owner = "client!rk", name = "q", descriptor = "I")
    public int field357;

    @OriginalMember(owner = "client!rk", name = "r", descriptor = "I")
    private int field358;

    @OriginalMember(owner = "client!rk", name = "v", descriptor = "I")
    public static int field362;

    @OriginalMember(owner = "client!rk", name = "w", descriptor = "I")
    public static int field363;

    @OriginalMember(owner = "client!rk", name = "z", descriptor = "I")
    public int field366;

    @OriginalMember(owner = "client!rk", name = "G", descriptor = "I")
    public static int field373;

    @OriginalMember(owner = "client!rk", name = "H", descriptor = "I")
    public static int field374;

    @OriginalMember(owner = "client!rk", name = "L", descriptor = "I")
    private int field378;

    @OriginalMember(owner = "client!rk", name = "P", descriptor = "I")
    public int field382;

    @OriginalMember(owner = "client!rk", name = "Q", descriptor = "I")
    public static int field383;

    @OriginalMember(owner = "client!rk", name = "R", descriptor = "I")
    public int field384;

    @OriginalMember(owner = "client!rk", name = "S", descriptor = "I")
    public static int field385;

    @OriginalMember(owner = "client!rk", name = "h", descriptor = "Lgf;")
    public class183 field348;

    @OriginalMember(owner = "client!rk", name = "t", descriptor = "Lmn;")
    private class249 field360;

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "Ljava/lang/String;")
    public String field341;

    @OriginalMember(owner = "client!rk", name = "D", descriptor = "Ljava/lang/String;")
    public String field370;

    @OriginalMember(owner = "client!rk", name = "E", descriptor = "[I")
    public int[] field371;

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(ZBLza;)Lo;", line = 4)
    public final class24 method168(boolean arg0, byte arg1, class288 arg2) {
        field373++;
        int var4 = arg0 ? this.field361 : this.field356;
        int var5 = arg2.field4361 << 29 | var4;
        if (arg1 != -55) {
            this.field357 = 120;
        }
        class24 var6 = (class24) this.field348.field2956.method2478(1, (long) var5);
        if (var6 != null) {
            return var6;
        } else if (this.field348.field2944.method2739(var4, -127)) {
            class340 var7 = class340.method2139(this.field348.field2944, var4, 0);
            if (var7 != null) {
                var6 = arg2.method374(var7, true);
                this.field348.field2956.method2472(-89, var6, (long) var5);
            }
            return var6;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(Ljava/lang/String;IB)Ljava/lang/String;", line = 46)
    public final String method169(String arg0, int arg1, byte arg2) {
        field374++;
        if (this.field360 == null) {
            return arg0;
        } else {
            class268 var4 = (class268) this.field360.method1622((long) arg1, -109);
            int var5 = -29 % ((-arg2 - 58) / 34);
            return var4 == null ? arg0 : var4.field4061;
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(B)V", line = 69)
    public final void method170(byte arg0) {
        int var2 = -41 / ((56 - arg0) / 61);
        field385++;
        if (this.field371 == null) {
            return;
        }
        for (int var3 = 0; var3 < this.field371.length; var3 += 2) {
            if (this.field365 > this.field371[var3]) {
                this.field365 = this.field371[var3];
            } else if (this.field377 < this.field371[var3]) {
                this.field377 = this.field371[var3];
            }
            if (this.field371[var3 + 1] < this.field369) {
                this.field369 = this.field371[var3 + 1];
            } else if (this.field367 < this.field371[var3 + 1]) {
                this.field367 = this.field371[var3 + 1];
            }
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(ILza;)Lo;", line = 129)
    public final class24 method171(int arg0, class288 arg1) {
        field342++;
        class24 var3 = (class24) this.field348.field2956.method2478(1, (long) (arg1.field4361 << 29 | 0x20000 | this.field346));
        if (var3 != null) {
            return var3;
        }
        this.field348.field2944.method2739(this.field346, -33);
        if (arg0 != -1) {
            this.field377 = -117;
        }
        class340 var4 = class340.method2139(this.field348.field2944, this.field346, 0);
        if (var4 != null) {
            var3 = arg1.method374(var4, true);
            this.field348.field2956.method2472(-57, var3, (long) (arg1.field4361 << 29 | this.field346 | 0x20000));
        }
        return var3;
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(IZLnn;)V", line = 162)
    private final void method172(int arg0, boolean arg1, class289 arg2) {
        if (!arg1) {
            return;
        }
        if (arg0 == 1) {
            this.field356 = arg2.method1841((byte) 120);
        } else if (arg0 == 2) {
            this.field361 = arg2.method1841((byte) -118);
        } else if (arg0 == 3) {
            this.field370 = arg2.method1834(-17823);
        } else if (arg0 == 4) {
            this.field344 = arg2.method1863(103);
        } else if (arg0 == 5) {
            this.field376 = arg2.method1863(107);
        } else if (arg0 == 6) {
            this.field347 = arg2.method1858(-3256);
        } else if (arg0 == 7) {
            int var4 = arg2.method1858(-3256);
            if ((var4 & 0x1) == 0) {
                this.field345 = false;
            }
            if ((var4 & 0x2) == 2) {
                this.field386 = true;
            }
        } else if (arg0 == 8) {
            this.field353 = arg2.method1858(-3256) == 1;
        } else if (arg0 == 9) {
            this.field381 = arg2.method1841((byte) 21);
            if (this.field381 == 65535) {
                this.field381 = -1;
            }
            this.field368 = arg2.method1841((byte) 17);
            if (this.field368 == 65535) {
                this.field368 = -1;
            }
            this.field354 = arg2.method1815((byte) -111);
            this.field351 = arg2.method1815((byte) -51);
        } else if (arg0 >= 10 && arg0 <= 14) {
            this.field379[arg0 - 10] = arg2.method1834(-17823);
        } else if (arg0 == 15) {
            int var5 = arg2.method1858(-3256);
            this.field371 = new int[var5 * 2];
            for (int var6 = 0; var6 < (var5 * 2); var6++) {
                this.field371[var6] = arg2.method1848((byte) 116);
            }
            this.field366 = arg2.method1815((byte) -67);
            this.field382 = arg2.method1815((byte) -83);
        } else if (arg0 == 16) {
            this.field380 = false;
        } else if (arg0 == 17) {
            this.field341 = arg2.method1834(-17823);
        } else if (arg0 == 18) {
            this.field346 = arg2.method1841((byte) -124);
        } else if (arg0 == 19) {
            this.field359 = arg2.method1841((byte) -125);
        } else if (arg0 == 20) {
            this.field372 = arg2.method1841((byte) -8);
            if (this.field372 == 65535) {
                this.field372 = -1;
            }
            this.field364 = arg2.method1841((byte) 76);
            if (this.field364 == 65535) {
                this.field364 = -1;
            }
            this.field378 = arg2.method1815((byte) -70);
            this.field358 = arg2.method1815((byte) -125);
        } else if (arg0 == 21) {
            this.field384 = arg2.method1815((byte) -99);
        } else if (arg0 == 22) {
            this.field350 = arg2.method1815((byte) -70);
        } else if (arg0 == 249) {
            int var7 = arg2.method1858(-3256);
            if (this.field360 == null) {
                int var8 = class184.method1256(var7, (byte) 123);
                this.field360 = new class249(var8);
            }
            for (int var9 = 0; var9 < var7; var9++) {
                boolean var10 = arg2.method1858(-3256) == 1;
                int var11 = arg2.method1863(-94);
                class261 var12;
                if (var10) {
                    var12 = new class268(arg2.method1834(-17823));
                } else {
                    var12 = new class100(arg2.method1815((byte) -49));
                }
                this.field360.method1618(var12, (long) var11, -1);
            }
        }
        field363++;
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(Lnn;B)V", line = 371)
    public final void method173(class289 arg0, byte arg1) {
        while (true) {
            int var3 = arg0.method1858(arg1 ^ 0xFFFFF329);
            if (var3 == 0) {
                if (arg1 != 97) {
                    this.method173(null, (byte) 24);
                }
                field362++;
                return;
            }
            this.method172(var3, true, arg0);
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(III)I", line = 392)
    public final int method174(int arg0, int arg1, int arg2) {
        field352++;
        if (arg0 >= -105) {
            this.method168(false, (byte) -1, null);
        }
        if (this.field360 == null) {
            return arg2;
        } else {
            class100 var4 = (class100) this.field360.method1622((long) arg1, -121);
            return var4 == null ? arg2 : var4.field1923;
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(ILhp;)Z", line = 419)
    public final boolean method175(int arg0, class217 arg1) {
        field343++;
        int var3;
        if (this.field368 == -1) {
            if (this.field381 == -1) {
                return true;
            }
            var3 = arg1.method90(this.field381, (byte) 122);
        } else {
            var3 = arg1.method92(this.field368, -29949);
        }
        if (this.field354 > var3 || var3 > this.field351) {
            return false;
        }
        if (arg0 != -2871) {
            this.field357 = -13;
        }
        boolean var4 = false;
        int var5;
        if (this.field364 == -1) {
            if (this.field372 == -1) {
                return true;
            }
            var5 = arg1.method90(this.field372, (byte) 111);
        } else {
            var5 = arg1.method92(this.field364, arg0 ^ 0x7FCA);
        }
        return this.field378 <= var5 && this.field358 >= var5;
    }
}
