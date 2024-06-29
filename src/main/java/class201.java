import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tj")
public class class201 {

    @OriginalMember(owner = "client!tj", name = "c", descriptor = "Z")
    private boolean field3037 = false;

    @OriginalMember(owner = "client!tj", name = "h", descriptor = "I")
    private int field3042 = 32;

    @OriginalMember(owner = "client!tj", name = "f", descriptor = "J")
    private long field3040 = class9.method57(-14133);

    @OriginalMember(owner = "client!tj", name = "y", descriptor = "J")
    private long field3059 = 0L;

    @OriginalMember(owner = "client!tj", name = "A", descriptor = "J")
    private long field3061 = 0L;

    @OriginalMember(owner = "client!tj", name = "F", descriptor = "I")
    private int field3066 = 0;

    @OriginalMember(owner = "client!tj", name = "C", descriptor = "I")
    private int field3063 = 0;

    @OriginalMember(owner = "client!tj", name = "K", descriptor = "I")
    private int field3071 = 0;

    @OriginalMember(owner = "client!tj", name = "E", descriptor = "[Lqd;")
    private class53[] field3065 = new class53[8];

    @OriginalMember(owner = "client!tj", name = "O", descriptor = "Z")
    private boolean field3075 = true;

    @OriginalMember(owner = "client!tj", name = "P", descriptor = "I")
    private int field3076 = 0;

    @OriginalMember(owner = "client!tj", name = "B", descriptor = "[Lqd;")
    private class53[] field3062 = new class53[8];

    @OriginalMember(owner = "client!tj", name = "i", descriptor = "Z")
    public static boolean field3043 = false;

    @OriginalMember(owner = "client!tj", name = "t", descriptor = "[I")
    public static int[] field3054 = new int[2];

    @OriginalMember(owner = "client!tj", name = "N", descriptor = "Ljava/lang/String;")
    public static String field3074 = null;

    @OriginalMember(owner = "client!tj", name = "z", descriptor = "F")
    public static float field3060;

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "I")
    public static int field3035;

    @OriginalMember(owner = "client!tj", name = "e", descriptor = "I")
    public static int field3039;

    @OriginalMember(owner = "client!tj", name = "g", descriptor = "I")
    public static int field3041;

    @OriginalMember(owner = "client!tj", name = "j", descriptor = "I")
    public static int field3044;

    @OriginalMember(owner = "client!tj", name = "k", descriptor = "I")
    public static int field3045;

    @OriginalMember(owner = "client!tj", name = "l", descriptor = "I")
    public static int field3046;

    @OriginalMember(owner = "client!tj", name = "m", descriptor = "I")
    public static int field3047;

    @OriginalMember(owner = "client!tj", name = "o", descriptor = "I")
    public static int field3049;

    @OriginalMember(owner = "client!tj", name = "p", descriptor = "I")
    public static int field3050;

    @OriginalMember(owner = "client!tj", name = "r", descriptor = "I")
    public static int field3052;

    @OriginalMember(owner = "client!tj", name = "s", descriptor = "I")
    public static int field3053;

    @OriginalMember(owner = "client!tj", name = "u", descriptor = "I")
    public static int field3055;

    @OriginalMember(owner = "client!tj", name = "v", descriptor = "I")
    public static int field3056;

    @OriginalMember(owner = "client!tj", name = "w", descriptor = "I")
    public static int field3057;

    @OriginalMember(owner = "client!tj", name = "x", descriptor = "I")
    public static int field3058;

    @OriginalMember(owner = "client!tj", name = "D", descriptor = "I")
    public static int field3064;

    @OriginalMember(owner = "client!tj", name = "G", descriptor = "I")
    public int field3067;

    @OriginalMember(owner = "client!tj", name = "H", descriptor = "I")
    private int field3068;

    @OriginalMember(owner = "client!tj", name = "I", descriptor = "I")
    public static int field3069;

    @OriginalMember(owner = "client!tj", name = "J", descriptor = "I")
    public static int field3070;

    @OriginalMember(owner = "client!tj", name = "L", descriptor = "I")
    public static int field3072;

    @OriginalMember(owner = "client!tj", name = "M", descriptor = "I")
    public int field3073;

    @OriginalMember(owner = "client!tj", name = "q", descriptor = "Lpa;")
    public static class2 field3051;

    @OriginalMember(owner = "client!tj", name = "b", descriptor = "Lqd;")
    private class53 field3036;

    @OriginalMember(owner = "client!tj", name = "n", descriptor = "[I")
    public int[] field3048;

    @OriginalMember(owner = "client!tj", name = "d", descriptor = "[Lvj;")
    public static class122[] field3038;

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(I)[Lpa;", line = 9)
    public static final class2[] method1395(int arg0) {
        if (arg0 != 1) {
            method1396((byte) -33, -110);
        }
        field3057++;
        class2[] var1 = new class2[class10.field101];
        for (int var2 = 0; var2 < class10.field101; var2++) {
            int var3 = class259.field4093[var2] * class245.field3855[var2];
            int[] var4 = new int[var3];
            byte[] var5 = class14.field145[var2];
            for (int var6 = 0; var6 < var3; var6++) {
                var4[var6] = class251.field3978[class261.method1840(var5[var6], 255)];
            }
            if (class272.field4317) {
                var1[var2] = new class200(class122.field1683, class253.field4004, class110.field1518[var2], class33.field392[var2], class245.field3855[var2], class259.field4093[var2], var4);
            } else {
                var1[var2] = new class158(class122.field1683, class253.field4004, class110.field1518[var2], class33.field392[var2], class245.field3855[var2], class259.field4093[var2], var4);
            }
        }
        class99.method627(3735);
        return var1;
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(BI)I", line = 52)
    public static final int method1396(byte arg0, int arg1) {
        field3041++;
        class190 var2 = class197.method1374((byte) -87, arg1);
        int var3 = var2.field2850;
        int var4 = var2.field2853;
        int var5 = 79 / ((-arg0 - 22) / 51);
        int var6 = var2.field2857;
        int var7 = class108.field1486[var6 - var4];
        return class255.field4041[var3] >> var4 & var7;
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(Z)V", line = 72)
    public static void method1397(boolean arg0) {
        field3074 = null;
        field3038 = null;
        if (!arg0) {
            method1396((byte) -80, 75);
        }
        field3051 = null;
        field3054 = null;
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "()V", line = 85)
    public void method1398() throws Exception {
        field3049++;
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(B)V", line = 96)
    public static final void method1399(byte arg0) {
        class254 var1 = (class254) class27.field327.method1812(1);
        if (arg0 <= 43) {
            return;
        }
        field3058++;
        while (var1 != null) {
            if (var1.field4021 > 0) {
                var1.field4021--;
            }
            if (var1.field4021 != 0) {
                if (var1.field4028 > 0) {
                    var1.field4028--;
                }
                if (var1.field4028 == 0 && var1.field4032 >= 1 && var1.field4024 >= 1 && var1.field4032 <= 102 && var1.field4024 <= 102 && (var1.field4030 < 0 || class20.method145(var1.field4030, 10, var1.field4027))) {
                    class181.method1252(var1.field4016, var1.field4030, var1.field4027, var1.field4032, (byte) 82, var1.field4017, var1.field4031, var1.field4024);
                    var1.field4028 = -1;
                    if (var1.field4030 == var1.field4019 && var1.field4019 == -1) {
                        var1.method1290(123);
                    } else if (var1.field4030 == var1.field4019 && var1.field4031 == var1.field4029 && var1.field4027 == var1.field4020) {
                        var1.method1290(-115);
                    }
                }
            } else if (var1.field4019 < 0 || class20.method145(var1.field4019, 10, var1.field4020)) {
                class181.method1252(var1.field4016, var1.field4019, var1.field4020, var1.field4032, (byte) 124, var1.field4017, var1.field4029, var1.field4024);
                var1.method1290(-45);
            }
            var1 = (class254) class27.field327.method1809(128);
        }
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 153)
    public void method1400(Component arg0) throws Exception {
        field3039++;
    }

    @OriginalMember(owner = "client!tj", name = "b", descriptor = "()V", line = 167)
    public void method1401() throws Exception {
        field3035++;
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(ZLnk;II)[Lcf;", line = 177)
    public static final class149[] method1402(boolean arg0, class16 arg1, int arg2, int arg3) {
        if (arg0) {
            method1396((byte) -47, 27);
        }
        field3050++;
        return class102.method648(arg2, -1000000000, arg3, arg1) ? class293.method2086(710) : null;
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "([II)V", line = 192)
    private final void method1403(int[] arg0, int arg1) {
        int var3 = arg1;
        if (class349.field5573) {
            var3 = arg1 << 1;
        }
        class8.method54(arg0, 0, var3);
        this.field3066 -= arg1;
        if (this.field3036 != null && this.field3066 <= 0) {
            this.field3066 += class361.field5710 >> 4;
            class234.method1617(9488, this.field3036);
            this.method1407(this.field3036, this.field3036.method320(), (byte) -118);
            int var4 = 0;
            int var5 = 255;
            int var6 = 7;
            label105: while (var5 != 0) {
                int var7;
                int var8;
                if (var6 < 0) {
                    var7 = var6 & 0x3;
                    var8 = -(var6 >> 2);
                } else {
                    var7 = var6;
                    var8 = 0;
                }
                for (int var9 = var5 >>> var7 & 0x11111111; var9 != 0; var9 >>>= 0x4) {
                    if ((var9 & 0x1) != 0) {
                        var5 &= ~(0x1 << var7);
                        class53 var10 = null;
                        class53 var11 = this.field3062[var7];
                        label99: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label99;
                                }
                                class329 var12 = var11.field614;
                                if (var12 == null || var12.field5288 <= var8) {
                                    var11.field611 = true;
                                    int var13 = var11.method322();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field5288 += var13;
                                    }
                                    if (var4 >= this.field3042) {
                                        break label105;
                                    }
                                    class53 var14 = var11.method317();
                                    if (var14 != null) {
                                        int var15 = var11.field612;
                                        while (var14 != null) {
                                            this.method1407(var14, var15 * var14.method320() >> 8, (byte) 24);
                                            var14 = var11.method321();
                                        }
                                    }
                                    class53 var16 = var11.field613;
                                    var11.field613 = null;
                                    if (var10 == null) {
                                        this.field3062[var7] = var16;
                                    } else {
                                        var10.field613 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field3065[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field613;
                                }
                            }
                        }
                    }
                    var7 += 4;
                    var8++;
                }
                var6--;
            }
            for (int var17 = 0; var17 < 8; var17++) {
                class53 var18 = this.field3062[var17];
                this.field3062[var17] = this.field3065[var17] = null;
                while (var18 != null) {
                    class53 var19 = var18.field613;
                    var18.field613 = null;
                    var18 = var19;
                }
            }
        }
        if (this.field3066 < 0) {
            this.field3066 = 0;
        }
        if (this.field3036 != null) {
            this.field3036.method323(arg0, 0, arg1);
        }
        this.field3040 = class9.method57(-14133);
    }

    @OriginalMember(owner = "client!tj", name = "b", descriptor = "(I)V", line = 355)
    public final synchronized void method1404(int arg0) {
        this.field3075 = true;
        field3047++;
        try {
            this.method1398();
        } catch (Exception var3) {
            this.method1408();
            this.field3061 = class9.method57(arg0 ^ 0xFFFFC8C3) + 2000L;
        }
        if (arg0 != 8) {
            this.field3065 = (class53[]) null;
        }
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(Lqd;Z)V", line = 376)
    public final synchronized void method1405(class53 arg0, boolean arg1) {
        if (arg1) {
            this.method1405((class53) null, true);
        }
        this.field3036 = arg0;
        field3069++;
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(II)V", line = 392)
    private final void method1406(int arg0, int arg1) {
        this.field3066 -= arg1;
        field3072++;
        if (this.field3066 < 0) {
            this.field3066 = 0;
        }
        if (arg0 != -28514) {
            this.field3076 = -61;
        }
        if (this.field3036 != null) {
            this.field3036.method318(arg1);
        }
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(Lqd;IB)V", line = 417)
    private final void method1407(class53 arg0, int arg1, byte arg2) {
        int var4 = 40 / ((-arg2 - 59) / 44);
        field3064++;
        int var5 = arg1 >> 5;
        class53 var6 = this.field3065[var5];
        if (var6 == null) {
            this.field3062[var5] = arg0;
        } else {
            var6.field613 = arg0;
        }
        this.field3065[var5] = arg0;
        arg0.field612 = arg1;
    }

    @OriginalMember(owner = "client!tj", name = "c", descriptor = "()V", line = 436)
    public void method1408() {
        field3044++;
    }

    @OriginalMember(owner = "client!tj", name = "c", descriptor = "(I)V", line = 443)
    public final synchronized void method1409(int arg0) {
        if (class303.field4729 != null) {
            boolean var2 = true;
            for (int var3 = 0; var3 < 2; var3++) {
                if (class303.field4729.field4082[var3] == this) {
                    class303.field4729.field4082[var3] = null;
                }
                if (class303.field4729.field4082[var3] != null) {
                    var2 = false;
                }
            }
            if (var2) {
                class303.field4729.field4085 = true;
                while (class303.field4729.field4080) {
                    class19.method140(50L, 16711680);
                }
                class303.field4729 = null;
            }
        }
        field3052++;
        this.method1408();
        this.field3048 = null;
        this.field3037 = true;
        if (arg0 != 500000) {
            this.method1407((class53) null, -17, (byte) -55);
        }
    }

    @OriginalMember(owner = "client!tj", name = "d", descriptor = "()I", line = 488)
    public int method1410() throws Exception {
        field3055++;
        return this.field3073;
    }

    @OriginalMember(owner = "client!tj", name = "d", descriptor = "(I)V", line = 498)
    public void method1411(int arg0) throws Exception {
        field3053++;
    }

    @OriginalMember(owner = "client!tj", name = "b", descriptor = "(Z)V", line = 516)
    public final void method1412(boolean arg0) {
        this.field3075 = true;
        if (!arg0) {
            field3070++;
        }
    }

    @OriginalMember(owner = "client!tj", name = "e", descriptor = "(I)V", line = 536)
    public final synchronized void method1413(int arg0) {
        field3046++;
        if (this.field3037) {
            return;
        }
        long var2 = class9.method57(-14133);
        try {
            if (var2 > this.field3040 + 500000L) {
                this.field3040 = var2 - 500000L;
            }
            while (this.field3040 + 5000L < var2) {
                this.method1406(arg0 ^ 0xFFFF909C, 256);
                this.field3040 += (long) (256000 / class361.field5710);
            }
        } catch (Exception var9) {
            this.field3040 = var2;
        }
        if (this.field3048 == null) {
            return;
        }
        try {
            if (arg0 != 2) {
                method1397(true);
            }
            if (this.field3061 != 0L) {
                if (this.field3061 > var2) {
                    return;
                }
                this.method1411(this.field3073);
                this.field3075 = true;
                this.field3061 = 0L;
            }
            int var5 = this.method1410();
            int var6 = this.field3068 + this.field3067;
            if ((var6 + 256) > 16384) {
                var6 = 16128;
            }
            if (this.field3063 < (this.field3076 - var5)) {
                this.field3063 = this.field3076 - var5;
            }
            if (this.field3073 < var6 + 256) {
                var5 = 0;
                this.field3073 += 1024;
                if (this.field3073 > 16384) {
                    this.field3073 = 16384;
                }
                this.method1408();
                this.method1411(this.field3073);
                if (this.field3073 < (var6 + 256)) {
                    var6 = this.field3073 - 256;
                    this.field3068 = var6 - this.field3067;
                }
                this.field3075 = true;
            }
            while (var6 > var5) {
                var5 += 256;
                this.method1403(this.field3048, 256);
                this.method1401();
            }
            if (this.field3059 < var2) {
                if (this.field3075) {
                    this.field3075 = false;
                } else if (this.field3063 == 0 && this.field3071 == 0) {
                    this.method1408();
                    this.field3061 = var2 + 2000L;
                    return;
                } else {
                    this.field3068 = Math.min(this.field3071, this.field3063);
                    this.field3071 = this.field3063;
                }
                this.field3063 = 0;
                this.field3059 = var2 + 2000L;
            }
            this.field3076 = var5;
        } catch (Exception var8) {
            this.method1408();
            this.field3061 = var2 + 2000L;
        }
    }
}
