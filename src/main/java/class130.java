import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dm")
public class class130 extends class65 implements class255 {

    @OriginalMember(owner = "client!dm", name = "F", descriptor = "I")
    private int field2046 = 50;

    @OriginalMember(owner = "client!dm", name = "X", descriptor = "Z")
    private boolean field2064 = false;

    @OriginalMember(owner = "client!dm", name = "r", descriptor = "Lak;")
    private class172 field2032;

    @OriginalMember(owner = "client!dm", name = "H", descriptor = "Lak;")
    private class172 field2048;

    @OriginalMember(owner = "client!dm", name = "N", descriptor = "Lgi;")
    private class109 field2054;

    @OriginalMember(owner = "client!dm", name = "U", descriptor = "Lgi;")
    private class109 field2061;

    @OriginalMember(owner = "client!dm", name = "O", descriptor = "I")
    public static int field2055 = 0;

    @OriginalMember(owner = "client!dm", name = "p", descriptor = "I")
    public static int field2030;

    @OriginalMember(owner = "client!dm", name = "q", descriptor = "I")
    public static int field2031;

    @OriginalMember(owner = "client!dm", name = "s", descriptor = "I")
    public static int field2033;

    @OriginalMember(owner = "client!dm", name = "u", descriptor = "I")
    public static int field2035;

    @OriginalMember(owner = "client!dm", name = "v", descriptor = "I")
    public static int field2036;

    @OriginalMember(owner = "client!dm", name = "w", descriptor = "I")
    public static int field2037;

    @OriginalMember(owner = "client!dm", name = "x", descriptor = "I")
    public static int field2038;

    @OriginalMember(owner = "client!dm", name = "y", descriptor = "I")
    public static int field2039;

    @OriginalMember(owner = "client!dm", name = "z", descriptor = "I")
    public static int field2040;

    @OriginalMember(owner = "client!dm", name = "A", descriptor = "I")
    public static int field2041;

    @OriginalMember(owner = "client!dm", name = "B", descriptor = "I")
    public static int field2042;

    @OriginalMember(owner = "client!dm", name = "C", descriptor = "I")
    public static int field2043;

    @OriginalMember(owner = "client!dm", name = "D", descriptor = "I")
    public static int field2044;

    @OriginalMember(owner = "client!dm", name = "E", descriptor = "I")
    public static int field2045;

    @OriginalMember(owner = "client!dm", name = "G", descriptor = "I")
    public static int field2047;

    @OriginalMember(owner = "client!dm", name = "I", descriptor = "I")
    public static int field2049;

    @OriginalMember(owner = "client!dm", name = "J", descriptor = "I")
    public static int field2050;

    @OriginalMember(owner = "client!dm", name = "K", descriptor = "I")
    public static int field2051;

    @OriginalMember(owner = "client!dm", name = "L", descriptor = "I")
    public static int field2052;

    @OriginalMember(owner = "client!dm", name = "M", descriptor = "I")
    public static int field2053;

    @OriginalMember(owner = "client!dm", name = "P", descriptor = "I")
    public static int field2056;

    @OriginalMember(owner = "client!dm", name = "R", descriptor = "I")
    public static int field2058;

    @OriginalMember(owner = "client!dm", name = "S", descriptor = "I")
    public static int field2059;

    @OriginalMember(owner = "client!dm", name = "T", descriptor = "I")
    public static int field2060;

    @OriginalMember(owner = "client!dm", name = "V", descriptor = "I")
    public static int field2062;

    @OriginalMember(owner = "client!dm", name = "W", descriptor = "I")
    public static int field2063;

    @OriginalMember(owner = "client!dm", name = "Y", descriptor = "I")
    public static int field2065;

    @OriginalMember(owner = "client!dm", name = "Z", descriptor = "I")
    public static int field2066;

    @OriginalMember(owner = "client!dm", name = "ab", descriptor = "I")
    public static int field2067;

    @OriginalMember(owner = "client!dm", name = "t", descriptor = "Lak;")
    public static class172 field2034;

    @OriginalMember(owner = "client!dm", name = "Q", descriptor = "[[[I")
    public static int[][][] field2057;

    @OriginalMember(owner = "client!dm", name = "d", descriptor = "(ZI)I", line = 4)
    public final int method937(boolean arg0, int arg1) {
        field2041++;
        if (!arg0) {
            this.method940(-102, -75);
        }
        return this.method437((byte) 75, arg1).field243 & 0xFF;
    }

    @OriginalMember(owner = "client!dm", name = "b", descriptor = "(IB)Z", line = 16)
    public final boolean method938(int arg0, byte arg1) {
        field2062++;
        int var3 = -97 % ((18 - arg1) / 52);
        return this.method437((byte) 75, arg0).field241;
    }

    @OriginalMember(owner = "client!dm", name = "b", descriptor = "(I)V", line = 27)
    public final void method939(int arg0) {
        field2033++;
        this.field2054.method747((byte) -8);
        if (this.field2061 != null) {
            this.field2061.method747((byte) -8);
        }
        class1.field18 = null;
        if (arg0 >= -100) {
            this.method956(-128, -47);
        }
    }

    @OriginalMember(owner = "client!dm", name = "f", descriptor = "(II)V", line = 42)
    public final void method940(int arg0, int arg1) {
        this.field2046 = arg1;
        field2047++;
        this.field2054 = new class109(this.field2046);
        if (class232.field3690) {
            this.field2061 = new class109(this.field2046);
        } else {
            this.field2061 = null;
        }
        if (arg0 != 3) {
            this.method958(93, -0.32733992F, 7, false, 6);
        }
    }

    @OriginalMember(owner = "client!dm", name = "b", descriptor = "(II)I", line = 59)
    public final int method941(int arg0, int arg1) {
        field2052++;
        return arg1 >= -46 ? -124 : this.method437((byte) 75, arg0).field242 & 0xFF;
    }

    @OriginalMember(owner = "client!dm", name = "c", descriptor = "(II)[I", line = 71)
    public final int[] method942(int arg0, int arg1) {
        field2043++;
        class1 var3 = this.method957(arg0, arg1 ^ 0xFFFF4FF2);
        if (var3 == null) {
            return null;
        } else {
            if (arg1 != -20467) {
                this.method944(53, true);
            }
            return var3.method7(this, this.field2048, this.field2064 || this.method437((byte) 75, arg0).field253);
        }
    }

    @OriginalMember(owner = "client!dm", name = "b", descriptor = "(BI)Z", line = 89)
    public final boolean method943(byte arg0, int arg1) {
        if (arg0 >= -112) {
            return true;
        } else {
            field2045++;
            return this.method437((byte) 75, arg1).field240;
        }
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(IZ)I", line = 102)
    public final int method944(int arg0, boolean arg1) {
        if (!arg1) {
            this.field2061 = (class109) null;
        }
        field2051++;
        return this.method437((byte) 75, arg0).field251 & 0xFF;
    }

    @OriginalMember(owner = "client!dm", name = "d", descriptor = "(II)I", line = 113)
    public final int method945(int arg0, int arg1) {
        if (arg1 != 255) {
            this.method938(86, (byte) -49);
        }
        field2037++;
        return this.method437((byte) 75, arg0).field248 & 0xFFFF;
    }

    @OriginalMember(owner = "client!dm", name = "c", descriptor = "(I)J", line = 129)
    public static final long method946(int arg0) {
        if (arg0 >= -88) {
            method962(-41, (int[]) null, (int[]) null, -1, 81);
        }
        field2059++;
        return class106.field1579.method162(64);
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(IBII)I", line = 144)
    public static final int method947(int arg0, byte arg1, int arg2, int arg3) {
        field2030++;
        if (arg1 != -105) {
            method962(26, (int[]) null, (int[]) null, -54, 45);
        }
        int var4 = arg3 & 0x3;
        if (var4 == 0) {
            return arg0;
        } else if (var4 == 1) {
            return arg2;
        } else if (var4 == 2) {
            return 1023 - arg0;
        } else {
            return 1023 - arg2;
        }
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(IIIIII)V", line = 168)
    public static final void method948(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field2063++;
        int var6 = class33.method178(class279.field4497, class98.field1410, arg1, arg0 - 151);
        int var7 = class33.method178(class279.field4497, class98.field1410, arg3, arg0 ^ 0xA6);
        int var8 = class33.method178(class191.field3131, class336.field5249, arg5, 78);
        int var9 = class33.method178(class191.field3131, class336.field5249, arg2, 121);
        int var10 = var6;
        if (arg0 != 255) {
            method946(48);
        }
        while (var7 >= var10) {
            class80.method545(arg4, arg0 - 307, var9, var8, class281.field4523[var10]);
            var10++;
        }
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(IBI)V", line = 198)
    public static final void method949(int arg0, byte arg1, int arg2) {
        field2044++;
        class344 var3 = class110.method759(13, arg0, false);
        var3.method2390((byte) -127);
        var3.field5354 = arg2;
        if (arg1 <= 67) {
            field2060 = 96;
        }
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(III)V", line = 214)
    public final void method950(int arg0, int arg1, int arg2) {
        field2039++;
        boolean var4 = false;
        class179.method1343(this.method437((byte) 75, arg0).field251 & 0xFF, this.method437((byte) 75, arg0).field242 & arg1, -3);
        class1 var5 = this.method957(arg0, arg1 + 65280);
        if (var5 != null) {
            var4 = var5.method8(this, this.field2048, arg2);
        }
        if (!var4) {
            class210 var6 = this.method952((byte) 110, arg0);
            var6.method1517(arg1 ^ 0xFFFFFF41);
        }
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(ZI)Z", line = 240)
    public final boolean method951(boolean arg0, int arg1) {
        field2053++;
        if (arg0) {
            return false;
        } else {
            return this.field2064 || this.method437((byte) 75, arg1).field253;
        }
    }

    @OriginalMember(owner = "client!dm", name = "<init>", descriptor = "(Lak;Lak;Lak;IZ)V", line = 258)
    public class130(class172 arg0, class172 arg1, class172 arg2, int arg3, boolean arg4) {
        super(arg1, arg0, arg2);
        this.field2064 = arg4;
        this.field2032 = arg0;
        this.field2046 = arg3;
        this.field2048 = arg2;
        this.field2054 = new class109(this.field2046);
        if (class232.field3690) {
            this.field2061 = new class109(this.field2046);
        } else {
            this.field2061 = null;
        }
    }

    @OriginalMember(owner = "client!dm", name = "c", descriptor = "(BI)Ltl;", line = 283)
    private final class210 method952(byte arg0, int arg1) {
        if (arg0 != 110) {
            this.field2048 = (class172) null;
        }
        class210 var3 = (class210) this.field2061.method755((long) arg1, false);
        field2042++;
        if (var3 == null) {
            class210 var4 = new class210(this.method437((byte) 75, arg1).field248 & 0xFFFF);
            this.field2061.method750(var4, (long) arg1, arg0 ^ 0xFFFFB833);
            return var4;
        } else {
            return var3;
        }
    }

    @OriginalMember(owner = "client!dm", name = "g", descriptor = "(II)V", line = 302)
    public final void method953(int arg0, int arg1) {
        if (arg0 != 1) {
            this.field2032 = (class172) null;
        }
        for (class1 var3 = (class1) this.field2054.method757((byte) -118); var3 != null; var3 = (class1) this.field2054.method754((byte) -21)) {
            if (var3.field16) {
                var3.method4(arg1);
                var3.field16 = false;
            }
        }
        field2058++;
    }

    @OriginalMember(owner = "client!dm", name = "f", descriptor = "(ZI)V", line = 324)
    public final void method954(boolean arg0, int arg1) {
        field2065++;
        this.field2064 = arg0;
        if (arg1 != 64) {
            field2034 = (class172) null;
        }
        this.method939(-122);
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(IB)V", line = 339)
    public final void method955(int arg0, byte arg1) {
        this.method950(arg0, 255, this.field2064 || this.method437((byte) 75, arg0).field253 ? 64 : 128);
        int var3 = 22 / ((arg1 - 20) / 54);
        field2066++;
    }

    @OriginalMember(owner = "client!dm", name = "e", descriptor = "(II)I", line = 350)
    public final int method956(int arg0, int arg1) {
        if (arg1 != -29034) {
            method961((byte) -18);
        }
        field2067++;
        return this.method437((byte) 75, arg0).field247 & 0xFF;
    }

    @OriginalMember(owner = "client!dm", name = "e", descriptor = "(ZI)Lpk;", line = 363)
    public final class25 method434(boolean arg0, int arg1) {
        field2050++;
        class1 var3 = this.method957(arg1, 65535);
        if (arg0) {
            this.method960(-1.2662656F, 36, 19);
        }
        return var3 == null ? null : var3.field4;
    }

    @OriginalMember(owner = "client!dm", name = "h", descriptor = "(II)Lok;", line = 376)
    private final class1 method957(int arg0, int arg1) {
        if (arg1 != 65535) {
            this.field2032 = (class172) null;
        }
        field2036++;
        class1 var3 = (class1) this.field2054.method755((long) arg0, false);
        if (var3 != null) {
            return var3;
        }
        byte[] var4 = this.field2032.method1287(0, arg0, -1);
        if (var4 == null) {
            return null;
        } else {
            class1 var5 = new class1(new class44(var4));
            this.field2054.method750(var5, (long) arg0, arg1 - 83874);
            return var5;
        }
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(IFIZI)Lek;", line = 409)
    public final class220 method958(int arg0, float arg1, int arg2, boolean arg3, int arg4) {
        field2035++;
        if (arg0 > -95) {
            this.method958(116, -0.7327524F, -108, true, 55);
        }
        class1 var6 = this.method957(arg2, 65535);
        if (var6 != null && var6.method1(this, this.field2048)) {
            return arg3 ? var6.field4.method146(this.field2048, (byte) -35, this, (double) arg1, arg4, arg4, false) : var6.field4.method137((double) arg1, -127, arg4, this, false, arg4, this.field2048);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!dm", name = "b", descriptor = "(ZI)Z", line = 430)
    public final boolean method959(boolean arg0, int arg1) {
        class1 var3 = this.method957(arg1, 65535);
        field2031++;
        if (arg0) {
            return var3 == null ? false : var3.method1(this, this.field2048);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(FII)[I", line = 453)
    public final int[] method960(float arg0, int arg1, int arg2) {
        if (arg2 != -3) {
            this.field2048 = (class172) null;
        }
        class1 var4 = this.method957(arg1, arg2 ^ 0xFFFF0002);
        field2038++;
        if (var4 == null) {
            return null;
        } else {
            var4.field16 = true;
            return var4.method2(this, this.field2048, arg0, this.field2064 || this.method437((byte) 75, arg1).field253);
        }
    }

    @OriginalMember(owner = "client!dm", name = "b", descriptor = "(B)V", line = 471)
    public static void method961(byte arg0) {
        if (arg0 == 89) {
            field2057 = (int[][][]) null;
            field2034 = null;
        }
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(I[I[III)V", line = 482)
    public static final void method962(int arg0, int[] arg1, int[] arg2, int arg3, int arg4) {
        if (arg4 != 1) {
            field2034 = (class172) null;
        }
        field2040++;
        if (arg0 <= arg3) {
            return;
        }
        int var5 = arg3;
        int var6 = (arg0 + arg3) / 2;
        int var7 = arg1[var6];
        arg1[var6] = arg1[arg0];
        arg1[arg0] = var7;
        int var8 = arg2[var6];
        arg2[var6] = arg2[arg0];
        arg2[arg0] = var8;
        for (int var9 = arg3; var9 < arg0; var9++) {
            if (arg1[var9] > (var9 & 0x1) + var7) {
                int var10 = arg1[var9];
                arg1[var9] = arg1[var5];
                arg1[var5] = var10;
                int var11 = arg2[var9];
                arg2[var9] = arg2[var5];
                arg2[var5++] = var11;
            }
        }
        arg1[arg0] = arg1[var5];
        arg1[var5] = var7;
        arg2[arg0] = arg2[var5];
        arg2[var5] = var8;
        method962(var5 - 1, arg1, arg2, arg3, arg4 ^ 0x0);
        method962(arg0, arg1, arg2, var5 + 1, 1);
    }

    @OriginalMember(owner = "client!dm", name = "c", descriptor = "(ZI)Z", line = 540)
    public final boolean method963(boolean arg0, int arg1) {
        if (arg0) {
            field2055 = -25;
        }
        field2056++;
        return !this.method437((byte) 75, arg1).field245;
    }
}
