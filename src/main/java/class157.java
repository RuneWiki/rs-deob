import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!er")
public class class157 {

    @OriginalMember(owner = "client!er", name = "h", descriptor = "Lkn;")
    private class233 field2277 = new class233();

    @OriginalMember(owner = "client!er", name = "i", descriptor = "I")
    private int field2278;

    @OriginalMember(owner = "client!er", name = "l", descriptor = "I")
    private int field2281;

    @OriginalMember(owner = "client!er", name = "d", descriptor = "Lqo;")
    private class141 field2273;

    @OriginalMember(owner = "client!er", name = "a", descriptor = "I")
    public static int field2270;

    @OriginalMember(owner = "client!er", name = "b", descriptor = "I")
    public static int field2271;

    @OriginalMember(owner = "client!er", name = "c", descriptor = "I")
    public static int field2272;

    @OriginalMember(owner = "client!er", name = "e", descriptor = "I")
    public static int field2274;

    @OriginalMember(owner = "client!er", name = "f", descriptor = "I")
    public static int field2275;

    @OriginalMember(owner = "client!er", name = "g", descriptor = "I")
    public static int field2276;

    @OriginalMember(owner = "client!er", name = "j", descriptor = "I")
    public static int field2279;

    @OriginalMember(owner = "client!er", name = "k", descriptor = "I")
    public static int field2280;

    @OriginalMember(owner = "client!er", name = "m", descriptor = "I")
    public static int field2282;

    @OriginalMember(owner = "client!er", name = "n", descriptor = "I")
    public static int field2283;

    @OriginalMember(owner = "client!er", name = "o", descriptor = "I")
    public static int field2284;

    @OriginalMember(owner = "client!er", name = "p", descriptor = "I")
    public static int field2285;

    @OriginalMember(owner = "client!er", name = "q", descriptor = "I")
    public static int field2286;

    @OriginalMember(owner = "client!er", name = "r", descriptor = "I")
    public static int field2287;

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(IJLjava/lang/Object;)V", line = 4)
    public final void method1012(int arg0, long arg1, Object arg2) {
        this.method1023(1, arg1, arg2, false);
        field2283++;
        if (arg0 > -59) {
            this.method1012(-20, -104L, null);
        }
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(JB)Ljava/lang/Object;", line = 15)
    public final Object method1013(long arg0, byte arg1) {
        field2270++;
        class189 var4 = (class189) this.field2273.method943(arg0, -1);
        if (var4 == null) {
            return null;
        } else if (arg1 == -106) {
            Object var5 = var4.method580((byte) -57);
            if (var5 == null) {
                var4.method2785((byte) -120);
                var4.method560((byte) 68);
                this.field2278 += var4.field2650;
                return null;
            }
            if (var4.method579(71)) {
                class319 var6 = new class319(var5, var4.field2650);
                this.field2273.method940(var4.field6799, -78, var6);
                this.field2277.method1582(var6, -1);
                var6.field1173 = 0L;
                var4.method2785((byte) -120);
                var4.method560((byte) 125);
            } else {
                this.field2277.method1582(var4, arg1 + 105);
                var4.field1173 = 0L;
            }
            return var5;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(JI)V", line = 61)
    private final void method1014(long arg0, int arg1) {
        if (arg1 == -28372) {
            field2285++;
            class189 var4 = (class189) this.field2273.method943(arg0, arg1 + 28371);
            this.method1025(var4, (byte) -57);
        }
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(B)V", line = 80)
    public final void method1015(byte arg0) {
        this.field2277.method1580(-5735);
        if (arg0 >= 79) {
            field2280++;
            this.field2273.method937(0);
            this.field2278 = this.field2281;
        }
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(IB)V", line = 93)
    public final void method1016(int arg0, byte arg1) {
        if (arg1 <= 114) {
            return;
        }
        field2275++;
        if (class279.field3852 == null) {
            return;
        }
        for (class189 var3 = (class189) this.field2277.method1581((byte) 53); var3 != null; var3 = (class189) this.field2277.method1585(-1)) {
            if (var3.method579(71)) {
                if (var3.method580((byte) -69) == null) {
                    var3.method2785((byte) -120);
                    var3.method560((byte) -55);
                    this.field2278++;
                }
            } else if (++var3.field1173 > (long) arg0) {
                class189 var4 = class279.field3852.method1852(var3, (byte) 92);
                this.field2273.method940(var3.field6799, -33, var4);
                class223.method1506(var4, var3, 0);
                var3.method2785((byte) -120);
                var3.method560((byte) 70);
            }
        }
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(I)Ljava/lang/Object;", line = 142)
    public final Object method1017(int arg0) {
        field2287++;
        class189 var2 = (class189) this.field2273.method948(98);
        if (arg0 <= 87) {
            return null;
        }
        while (var2 != null) {
            Object var3 = var2.method580((byte) -110);
            if (var3 != null) {
                return var3;
            }
            class189 var4 = var2;
            var2 = (class189) this.field2273.method938(119);
            var4.method2785((byte) -120);
            var4.method560((byte) 71);
            this.field2278 += var2.field2650;
        }
        return null;
    }

    @OriginalMember(owner = "client!er", name = "b", descriptor = "(I)Ljava/lang/Object;", line = 173)
    public final Object method1018(int arg0) {
        field2279++;
        if (arg0 != -1) {
            this.method1013(-7L, (byte) -23);
        }
        class189 var2 = (class189) this.field2273.method938(73);
        while (var2 != null) {
            Object var3 = var2.method580((byte) -63);
            if (var3 != null) {
                return var3;
            }
            class189 var4 = var2;
            var2 = (class189) this.field2273.method938(-101);
            var4.method2785((byte) -120);
            var4.method560((byte) 59);
            this.field2278 += var2.field2650;
        }
        return null;
    }

    @OriginalMember(owner = "client!er", name = "c", descriptor = "(I)I", line = 204)
    public final int method1019(int arg0) {
        field2284++;
        int var2 = 0;
        for (class189 var3 = (class189) this.field2277.method1581((byte) 53); var3 != null; var3 = (class189) this.field2277.method1585(-1)) {
            if (!var3.method579(71)) {
                var2++;
            }
        }
        if (arg0 >= -105) {
            this.field2281 = -38;
        }
        return var2;
    }

    @OriginalMember(owner = "client!er", name = "d", descriptor = "(I)I", line = 229)
    public final int method1020(int arg0) {
        field2272++;
        if (arg0 > -60) {
            this.field2273 = null;
        }
        return this.field2281;
    }

    @OriginalMember(owner = "client!er", name = "e", descriptor = "(I)I", line = 243)
    public final int method1021(int arg0) {
        if (arg0 != 1893) {
            this.method1014(11L, 74);
        }
        field2282++;
        return this.field2278;
    }

    @OriginalMember(owner = "client!er", name = "<init>", descriptor = "(I)V", line = 314)
    public class157(int arg0) {
        this.field2278 = arg0;
        this.field2281 = arg0;
        int var2;
        for (var2 = 1; arg0 > var2 + var2; var2 += var2) {
        }
        this.field2273 = new class141(var2);
    }

    @OriginalMember(owner = "client!er", name = "b", descriptor = "(B)V", line = 260)
    public final void method1022(byte arg0) {
        field2286++;
        if (arg0 != -34) {
            return;
        }
        for (class189 var2 = (class189) this.field2277.method1581((byte) 53); var2 != null; var2 = (class189) this.field2277.method1585(-1)) {
            if (var2.method579(71)) {
                var2.method2785((byte) -120);
                var2.method560((byte) 56);
                this.field2278 += var2.field2650;
            }
        }
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(IJLjava/lang/Object;Z)V", line = 286)
    private final void method1023(int arg0, long arg1, Object arg2, boolean arg3) {
        field2276++;
        if (this.field2281 < arg0) {
            throw new IllegalStateException("s>cs");
        }
        this.method1014(arg1, -28372);
        this.field2278 -= arg0;
        while (this.field2278 < 0) {
            class189 var7 = (class189) this.field2277.method1583(105);
            this.method1025(var7, (byte) -57);
        }
        if (!arg3) {
            class319 var6 = new class319(arg2, arg0);
            this.field2273.method940(arg1, -110, var6);
            this.field2277.method1582(var6, -1);
            var6.field1173 = 0L;
        }
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(IIIII)I", line = 336)
    public static final int method1024(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 == -14936) {
            field2271++;
            int var5 = 65536 - class525.field7763[arg2 * 8192 / arg1] >> 1;
            return ((65536 - var5) * arg3 >> 16) + (arg4 * var5 >> 16);
        } else {
            return 27;
        }
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(Lav;B)V", line = 349)
    private final void method1025(class189 arg0, byte arg1) {
        if (arg0 != null) {
            arg0.method2785((byte) -120);
            arg0.method560((byte) -56);
            this.field2278 += arg0.field2650;
        }
        field2274++;
        if (arg1 != -57) {
            this.method1012(-27, 44L, null);
        }
    }
}
