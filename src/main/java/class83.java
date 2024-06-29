import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public class class83 extends class175 {

    @OriginalMember(owner = "client!ec", name = "Q", descriptor = "I")
    private int field1396 = 0;

    @OriginalMember(owner = "client!ec", name = "T", descriptor = "I")
    private int field1399 = 2048;

    @OriginalMember(owner = "client!ec", name = "P", descriptor = "I")
    private int field1395 = 4096;

    @OriginalMember(owner = "client!ec", name = "db", descriptor = "I")
    private int field1409 = 12288;

    @OriginalMember(owner = "client!ec", name = "mb", descriptor = "I")
    private int field1418 = 2048;

    @OriginalMember(owner = "client!ec", name = "bb", descriptor = "I")
    private int field1407 = 0;

    @OriginalMember(owner = "client!ec", name = "nb", descriptor = "I")
    private int field1419 = 8192;

    @OriginalMember(owner = "client!ec", name = "V", descriptor = "I")
    public static int field1401 = 5063219;

    @OriginalMember(owner = "client!ec", name = "fb", descriptor = "Lmb;")
    public static class96 field1411 = class243.method1708("(U1", (byte) 108);

    @OriginalMember(owner = "client!ec", name = "kb", descriptor = "[Lmb;")
    public static class96[] field1416 = new class96[100];

    @OriginalMember(owner = "client!ec", name = "jb", descriptor = "I")
    public static int field1415 = 500;

    @OriginalMember(owner = "client!ec", name = "lb", descriptor = "Lmb;")
    public static class96 field1417 = class243.method1708(")4a=", (byte) 125);

    @OriginalMember(owner = "client!ec", name = "gb", descriptor = "I")
    public static int field1412 = 0;

    @OriginalMember(owner = "client!ec", name = "R", descriptor = "I")
    public static int field1397;

    @OriginalMember(owner = "client!ec", name = "S", descriptor = "I")
    public static int field1398;

    @OriginalMember(owner = "client!ec", name = "U", descriptor = "I")
    public static int field1400;

    @OriginalMember(owner = "client!ec", name = "W", descriptor = "I")
    public static int field1402;

    @OriginalMember(owner = "client!ec", name = "X", descriptor = "I")
    public static int field1403;

    @OriginalMember(owner = "client!ec", name = "Y", descriptor = "I")
    public static int field1404;

    @OriginalMember(owner = "client!ec", name = "Z", descriptor = "I")
    public static int field1405;

    @OriginalMember(owner = "client!ec", name = "ab", descriptor = "I")
    public static int field1406;

    @OriginalMember(owner = "client!ec", name = "cb", descriptor = "I")
    public static int field1408;

    @OriginalMember(owner = "client!ec", name = "eb", descriptor = "I")
    public static int field1410;

    @OriginalMember(owner = "client!ec", name = "hb", descriptor = "I")
    public static int field1413;

    @OriginalMember(owner = "client!ec", name = "ob", descriptor = "I")
    public static int field1420;

    @OriginalMember(owner = "client!ec", name = "ib", descriptor = "[Lri;")
    public static class36[] field1414;

    @OriginalMember(owner = "client!ec", name = "d", descriptor = "(I)V")
    public final void method150(int arg0) {
        class29.method189(4096);
        ++field1408;
        if (arg0 != 2) {
            field1411 = null;
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(BILrg;)V")
    public final void method115(byte arg0, int arg1, class239 arg2) {
        ++field1398;
        int var4 = 28 / ((-22 - arg0) / 58);
        if (arg1 != 0) {
            if (arg1 != 1) {
                if (arg1 != 2) {
                    if (~arg1 != -4) {
                        if (arg1 != 4) {
                            if (arg1 != 5) {
                                if (arg1 == 6) {
                                    this.field1419 = arg2.method1663((byte) 68);
                                }
                            } else {
                                this.field1395 = arg2.method1663((byte) 82);
                            }
                        } else {
                            this.field1409 = arg2.method1663((byte) 93);
                        }
                    } else {
                        this.field1418 = arg2.method1663((byte) 85);
                    }
                } else {
                    this.field1407 = arg2.method1663((byte) 61);
                }
            } else {
                this.field1396 = arg2.method1663((byte) 125);
            }
        } else {
            this.field1399 = arg2.method1663((byte) 70);
        }
    }

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "(Z)V")
    public static final void method581(boolean arg0) {
        if (arg0) {
            class224.field3817.method96(false);
            ++field1403;
            class74.field1279.method96(false);
        }
    }

    @OriginalMember(owner = "client!ec", name = "e", descriptor = "(B)V")
    public static final void method582(byte arg0) {
        class254.field4385.method233(20145);
        ++field1420;
        if (arg0 >= -92) {
            field1417 = null;
        }
        class85.field1436 = null;
        class249.field4308 = 1;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(IIIBIIII)V")
    public static final void method583(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg3 != 106) {
            method582((byte) -42);
        }
        ++field1400;
        if (arg0 == arg7) {
            class168.method1210(arg6, arg5, arg0, false, arg2, arg4, arg1);
        } else if (~(-arg0 + arg1) <= ~class9.field145 && class162.field2884 >= arg0 + arg1 && ~(-arg7 + arg2) <= ~client.field1994 && arg2 + arg7 <= class9.field149) {
            class212.method1475(arg0, arg5, arg4, arg6, arg7, arg3 ^ 15, arg1, arg2);
        } else {
            class128.method975(-1, arg1, arg0, arg4, arg7, arg6, arg2, arg5);
        }
    }

    @OriginalMember(owner = "client!ec", name = "c", descriptor = "(III)Z")
    private final boolean method584(int arg0, int arg1, int arg2) {
        if (arg1 > -68) {
            this.field1407 = -16;
        }
        ++field1406;
        int var4 = (arg0 + arg2) * this.field1409 >> 12;
        int var5 = class103.field1741[(1044638 & var4 * 255) >> 12];
        int var6 = (var5 << 12) / this.field1409;
        int var7 = (var6 << 12) / this.field1419;
        int var8 = this.field1395 * var7 >> 12;
        return -arg2 + arg0 < var8 && arg0 - arg2 > -var8;
    }

    @OriginalMember(owner = "client!ec", name = "<init>", descriptor = "()V")
    public class83() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ec", name = "f", descriptor = "(B)Ldi;")
    public static final class39 method585(byte arg0) {
        ++field1410;
        try {
            if (arg0 <= 33) {
                field1414 = null;
            }
            return (class39) Class.forName("qc").newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "([II)[I")
    public static final int[] method586(int[] arg0, int arg1) {
        if (arg1 >= -17) {
            return null;
        } else {
            ++field1413;
            if (arg0 == null) {
                return null;
            } else {
                int[] var2 = new int[arg0.length];
                class102.method776(arg0, 0, var2, 0, arg0.length);
                return var2;
            }
        }
    }

    @OriginalMember(owner = "client!ec", name = "g", descriptor = "(B)V")
    public static void method587(byte arg0) {
        field1414 = null;
        field1417 = null;
        int var1 = 51 % ((arg0 - -46) / 35);
        field1411 = null;
        field1416 = null;
    }

    @OriginalMember(owner = "client!ec", name = "e", descriptor = "(I)V")
    public static final void method588(int arg0) {
        if (arg0 != ~class123.field2278.toLowerCase().indexOf("microsoft")) {
            class78.field1331[192] = 58;
            class78.field1331[190] = 72;
            class78.field1331[219] = 42;
            class78.field1331[223] = 28;
            class78.field1331[221] = 43;
            class78.field1331[189] = 26;
            class78.field1331[220] = 74;
            class78.field1331[191] = 73;
            class78.field1331[186] = 57;
            class78.field1331[188] = 71;
            class78.field1331[187] = 27;
            class78.field1331[222] = 59;
        } else {
            class78.field1331[92] = 74;
            class78.field1331[44] = 71;
            class78.field1331[45] = 26;
            class78.field1331[61] = 27;
            class78.field1331[93] = 43;
            class78.field1331[91] = 42;
            if (class123.field2291 == null) {
                class78.field1331[222] = 59;
                class78.field1331[192] = 58;
            } else {
                class78.field1331[520] = 59;
                class78.field1331[192] = 28;
                class78.field1331[222] = 58;
            }
            class78.field1331[46] = 72;
            class78.field1331[47] = 73;
            class78.field1331[59] = 57;
        }
        ++field1405;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(BI)[I")
    public final int[] method1(byte arg0, int arg1) {
        int var3 = -76 % ((arg0 - 62) / 54);
        ++field1397;
        int[] var4 = super.field3044.method904((byte) -119, arg1);
        if (super.field3044.field2150) {
            int var5 = class23.field395[arg1] + -2048;
            for (int var6 = 0; ~var6 > ~class1.field11; ++var6) {
                int var7 = class244.field4240[var6] - 2048;
                int var8 = this.field1396 + var5;
                int var9 = var8 < -2048 ? var8 - -4096 : var8;
                int var10 = this.field1407 + var7;
                int var11 = ~var9 < -2049 ? var9 - 4096 : var9;
                int var12 = var7 - -this.field1399;
                int var13 = var12 < -2048 ? var12 + 4096 : var12;
                int var14 = ~var10 <= 2047 ? var10 : var10 - -4096;
                int var15 = var14 > 2048 ? var14 - 4096 : var14;
                int var16 = ~var13 < -2049 ? var13 - 4096 : var13;
                int var17 = this.field1418 + var5;
                int var18 = ~var17 <= 2047 ? var17 : var17 + 4096;
                int var19 = var18 <= 2048 ? var18 : var18 + -4096;
                var4[var6] = !this.method589(var16, var11, (byte) 48) && !this.method584(var19, -124, var15) ? 0 : 4096;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(IIB)Z")
    private final boolean method589(int arg0, int arg1, byte arg2) {
        int var4 = (-arg0 + arg1) * this.field1409 >> 12;
        ++field1404;
        if (arg2 <= 25) {
            method585((byte) 62);
        }
        int var5 = class103.field1741[(var4 * 255 & 1048355) >> 12];
        int var6 = (var5 << 12) / this.field1409;
        int var7 = (var6 << 12) / this.field1419;
        int var8 = this.field1395 * var7 >> 12;
        return arg0 + arg1 < var8 && arg0 + arg1 > -var8;
    }
}
