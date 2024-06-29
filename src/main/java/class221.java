import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hm")
public class class221 extends class306 {

    @OriginalMember(owner = "client!hm", name = "L", descriptor = "Lada;")
    private class164 field3251 = new class164();

    @OriginalMember(owner = "client!hm", name = "N", descriptor = "I")
    private int field3253 = 256;

    @OriginalMember(owner = "client!hm", name = "Q", descriptor = "I")
    private int field3256 = 256;

    @OriginalMember(owner = "client!hm", name = "S", descriptor = "I")
    private int field3258 = 0;

    @OriginalMember(owner = "client!hm", name = "E", descriptor = "I")
    private int field3244;

    @OriginalMember(owner = "client!hm", name = "s", descriptor = "Lmia;")
    public static class63 field3232 = new class63(67, 2);

    @OriginalMember(owner = "client!hm", name = "v", descriptor = "Ldea;")
    public static class248 field3235 = new class248(0, 0);

    @OriginalMember(owner = "client!hm", name = "I", descriptor = "I")
    public static int field3248 = 1338;

    @OriginalMember(owner = "client!hm", name = "R", descriptor = "Z")
    public static boolean field3257 = false;

    @OriginalMember(owner = "client!hm", name = "q", descriptor = "I")
    public static int field3230;

    @OriginalMember(owner = "client!hm", name = "r", descriptor = "I")
    public static int field3231;

    @OriginalMember(owner = "client!hm", name = "t", descriptor = "I")
    public static int field3233;

    @OriginalMember(owner = "client!hm", name = "u", descriptor = "I")
    public static int field3234;

    @OriginalMember(owner = "client!hm", name = "w", descriptor = "I")
    public static int field3236;

    @OriginalMember(owner = "client!hm", name = "x", descriptor = "I")
    public static int field3237;

    @OriginalMember(owner = "client!hm", name = "y", descriptor = "I")
    public static int field3238;

    @OriginalMember(owner = "client!hm", name = "z", descriptor = "I")
    public static int field3239;

    @OriginalMember(owner = "client!hm", name = "A", descriptor = "I")
    public static int field3240;

    @OriginalMember(owner = "client!hm", name = "B", descriptor = "I")
    public static int field3241;

    @OriginalMember(owner = "client!hm", name = "C", descriptor = "I")
    public static int field3242;

    @OriginalMember(owner = "client!hm", name = "D", descriptor = "I")
    public static int field3243;

    @OriginalMember(owner = "client!hm", name = "F", descriptor = "I")
    public static int field3245;

    @OriginalMember(owner = "client!hm", name = "G", descriptor = "I")
    public static int field3246;

    @OriginalMember(owner = "client!hm", name = "H", descriptor = "I")
    public static int field3247;

    @OriginalMember(owner = "client!hm", name = "J", descriptor = "I")
    public static int field3249;

    @OriginalMember(owner = "client!hm", name = "K", descriptor = "I")
    public static int field3250;

    @OriginalMember(owner = "client!hm", name = "O", descriptor = "I")
    private int field3254;

    @OriginalMember(owner = "client!hm", name = "M", descriptor = "Z")
    private boolean field3252;

    @OriginalMember(owner = "client!hm", name = "P", descriptor = "Z")
    private boolean field3255;

    @OriginalMember(owner = "client!hm", name = "b", descriptor = "(I)D", line = 4)
    public final synchronized double method1480(int arg0) {
        field3237++;
        if (this.field3258 < 1) {
            return -1.0D;
        } else {
            class425 var2 = (class425) this.field3251.method1195(arg0 ^ arg0);
            return var2 == null ? -1.0D : (double) (-((float) var2.field6307[0].length / (float) client.field4279)) + var2.field6311;
        }
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(III)B", line = 22)
    public static final byte method1481(int arg0, int arg1, int arg2) {
        field3234++;
        if (arg0 != -22029) {
            method1481(32, -46, -115);
        }
        if (arg1 == 9) {
            return (byte) ((arg2 & 0x1) == 0 ? 1 : 2);
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(I)V", line = 43)
    public final synchronized void method1482(int arg0) {
        field3240++;
        if (this.field3252) {
            return;
        }
        while (true) {
            class425 var2 = this.method1496(-1578);
            if (var2 == null) {
                if (this.field3255) {
                    this.method1304((byte) 7);
                    class687.field9490.method2514(-125);
                }
                return;
            }
            if ((var2.field6307[0].length - this.field3254) > arg0) {
                this.field3254 += arg0;
                return;
            }
            arg0 -= var2.field6307[0].length - this.field3254;
            this.method1486(false);
        }
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(ZII)Z", line = 86)
    public static final boolean method1483(boolean arg0, int arg1, int arg2) {
        field3238++;
        if (!arg0) {
            method1487(36, 4);
        }
        return (arg1 & 0x84080) != 0;
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(II)V", line = 98)
    public final void method1484(int arg0, int arg1) {
        this.field3256 = arg0;
        field3231++;
        if (arg1 > -69) {
            method1481(14, 26, 5);
        }
        this.field3253 = arg0;
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "()Lca;", line = 116)
    public final class306 method1485() {
        field3239++;
        return null;
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(Z)V", line = 124)
    private final synchronized void method1486(boolean arg0) {
        if (arg0) {
            return;
        }
        field3233++;
        class425 var2 = this.method1496(-1578);
        if (var2 != null) {
            var2.method1304((byte) 7);
            this.field3254 = 0;
            this.field3258--;
            class687.field9490.method2518(var2.method2657(-27530), 22363, var2);
        }
    }

    @OriginalMember(owner = "client!hm", name = "b", descriptor = "(II)Z", line = 144)
    public static final boolean method1487(int arg0, int arg1) {
        field3245++;
        if (arg0 == -9) {
            return arg1 == 4 || arg1 == 8 || arg1 == 11;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!hm", name = "c", descriptor = "()Lca;", line = 157)
    public final class306 method1488() {
        field3236++;
        return null;
    }

    @OriginalMember(owner = "client!hm", name = "c", descriptor = "(I)V", line = 165)
    public static void method1489(int arg0) {
        if (arg0 > -75) {
            method1487(-110, -53);
        }
        field3232 = null;
        field3235 = null;
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(Lhea;I)V", line = 176)
    public final synchronized void method1490(class425 arg0, int arg1) {
        while (this.field3258 >= 100) {
            this.field3251.method1198((byte) 68);
            this.field3258--;
        }
        if (arg1 < -83) {
            field3242++;
            this.field3251.method1203(arg0, (byte) -48);
            this.field3258++;
        }
    }

    @OriginalMember(owner = "client!hm", name = "b", descriptor = "([III)V", line = 194)
    public final synchronized void method1491(int[] arg0, int arg1, int arg2) {
        field3249++;
        if (this.field3252) {
            return;
        }
        if (this.method1496(-1578) != null) {
            int var4 = arg1 + arg2;
            if (class266.field3798) {
                var4 <<= 0x1;
            }
            byte var5 = 0;
            byte var6 = 0;
            if (this.field3244 == 2) {
                var6 = 1;
            }
            while (var4 > arg1) {
                class425 var7 = this.method1496(-1578);
                if (var7 == null) {
                    return;
                }
                short[][] var8 = var7.field6307;
                while (arg1 < var4 && this.field3254 < var8[0].length) {
                    if (class266.field3798) {
                        arg0[arg1++] = var8[var5][this.field3254] * this.field3253;
                        arg0[arg1++] = var8[var6][this.field3254] * this.field3256;
                    } else {
                        int var10001 = arg1++;
                        arg0[var10001] += var8[var5][this.field3254] * this.field3253 + var8[var6][this.field3254] * this.field3256;
                    }
                    this.field3254++;
                }
                if (this.field3254 >= var8[0].length) {
                    this.method1486(false);
                }
            }
        } else if (this.field3255) {
            this.method1304((byte) 7);
            class687.field9490.method2514(-125);
        }
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(ZB)V", line = 262)
    public final synchronized void method1492(boolean arg0, byte arg1) {
        field3247++;
        if (arg1 != 109) {
            this.field3256 = -78;
        }
        this.field3252 = arg0;
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(ZDI)Lhea;", line = 275)
    public final class425 method1493(boolean arg0, double arg1, int arg2) {
        field3230++;
        long var5 = (long) (arg2 | this.field3244 << 0);
        class425 var7 = (class425) class687.field9490.method2515(var5, (byte) 74);
        if (var7 == null) {
            var7 = new class425(new short[this.field3244][arg2], arg1);
        } else {
            var7.field6311 = arg1;
            class687.field9490.method2516(-51, var5);
        }
        return arg0 ? null : var7;
    }

    @OriginalMember(owner = "client!hm", name = "e", descriptor = "(I)V", line = 299)
    public final synchronized void method1494(int arg0) {
        if (arg0 >= 109) {
            field3250++;
            this.field3255 = true;
        }
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(B)I", line = 312)
    public final synchronized int method1495(byte arg0) {
        field3243++;
        if (arg0 != -18) {
            this.field3251 = null;
        }
        return this.field3258;
    }

    @OriginalMember(owner = "client!hm", name = "f", descriptor = "(I)Lhea;", line = 327)
    private final synchronized class425 method1496(int arg0) {
        if (arg0 != -1578) {
            method1489(90);
        }
        field3241++;
        return (class425) this.field3251.method1195(0);
    }

    @OriginalMember(owner = "client!hm", name = "<init>", descriptor = "(I)V", line = 374)
    public class221(int arg0) {
        this.field3244 = arg0;
    }

    @OriginalMember(owner = "client!hm", name = "d", descriptor = "()I", line = 353)
    public final int method1497() {
        field3246++;
        return 1;
    }
}
