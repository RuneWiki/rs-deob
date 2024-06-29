import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oq")
public class class232 extends class219 {

    @OriginalMember(owner = "client!oq", name = "k", descriptor = "I")
    private int field3195 = 0;

    @OriginalMember(owner = "client!oq", name = "l", descriptor = "Lbo;")
    private class453 field3196 = new class453(16);

    @OriginalMember(owner = "client!oq", name = "P", descriptor = "I")
    private int field3226 = 0;

    @OriginalMember(owner = "client!oq", name = "L", descriptor = "Lm;")
    private class242 field3222 = new class242();

    @OriginalMember(owner = "client!oq", name = "R", descriptor = "J")
    private long field3228 = 0L;

    @OriginalMember(owner = "client!oq", name = "H", descriptor = "Leg;")
    private class330 field3218;

    @OriginalMember(owner = "client!oq", name = "h", descriptor = "I")
    private int field3192;

    @OriginalMember(owner = "client!oq", name = "K", descriptor = "Z")
    private boolean field3221;

    @OriginalMember(owner = "client!oq", name = "J", descriptor = "Lm;")
    private class242 field3220;

    @OriginalMember(owner = "client!oq", name = "C", descriptor = "Leg;")
    private class330 field3213;

    @OriginalMember(owner = "client!oq", name = "m", descriptor = "I")
    private int field3197;

    @OriginalMember(owner = "client!oq", name = "o", descriptor = "I")
    private int field3199;

    @OriginalMember(owner = "client!oq", name = "Q", descriptor = "Z")
    private boolean field3227;

    @OriginalMember(owner = "client!oq", name = "t", descriptor = "Lpq;")
    private class50 field3204;

    @OriginalMember(owner = "client!oq", name = "y", descriptor = "Lha;")
    private class243 field3209;

    @OriginalMember(owner = "client!oq", name = "B", descriptor = "Lpd;")
    private class352 field3212;

    @OriginalMember(owner = "client!oq", name = "F", descriptor = "[B")
    public static byte[] field3216 = new byte[32896];

    @OriginalMember(owner = "client!oq", name = "M", descriptor = "Z")
    public static boolean field3223;

    @OriginalMember(owner = "client!oq", name = "O", descriptor = "[Ljava/lang/String;")
    public static String[] field3225;

    @OriginalMember(owner = "client!oq", name = "e", descriptor = "I")
    public static int field3189;

    @OriginalMember(owner = "client!oq", name = "f", descriptor = "I")
    public static int field3190;

    @OriginalMember(owner = "client!oq", name = "g", descriptor = "I")
    public static int field3191;

    @OriginalMember(owner = "client!oq", name = "i", descriptor = "I")
    public static int field3193;

    @OriginalMember(owner = "client!oq", name = "j", descriptor = "I")
    public static int field3194;

    @OriginalMember(owner = "client!oq", name = "n", descriptor = "I")
    public static int field3198;

    @OriginalMember(owner = "client!oq", name = "p", descriptor = "I")
    public static int field3200;

    @OriginalMember(owner = "client!oq", name = "r", descriptor = "I")
    public static int field3202;

    @OriginalMember(owner = "client!oq", name = "u", descriptor = "I")
    public static int field3205;

    @OriginalMember(owner = "client!oq", name = "v", descriptor = "I")
    public static int field3206;

    @OriginalMember(owner = "client!oq", name = "w", descriptor = "I")
    public static int field3207;

    @OriginalMember(owner = "client!oq", name = "x", descriptor = "I")
    public static int field3208;

    @OriginalMember(owner = "client!oq", name = "z", descriptor = "I")
    public static int field3210;

    @OriginalMember(owner = "client!oq", name = "A", descriptor = "I")
    public static int field3211;

    @OriginalMember(owner = "client!oq", name = "D", descriptor = "I")
    public static int field3214;

    @OriginalMember(owner = "client!oq", name = "E", descriptor = "I")
    public static int field3215;

    @OriginalMember(owner = "client!oq", name = "G", descriptor = "I")
    public static int field3217;

    @OriginalMember(owner = "client!oq", name = "q", descriptor = "Lvm;")
    private class124 field3201;

    @OriginalMember(owner = "client!oq", name = "N", descriptor = "Lke;")
    public static class295 field3224;

    @OriginalMember(owner = "client!oq", name = "I", descriptor = "Z")
    private boolean field3219;

    @OriginalMember(owner = "client!oq", name = "s", descriptor = "[B")
    private byte[] field3203;

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(B)I")
    public final int method1498(byte arg0) {
        field3206++;
        if (this.field3201 == null) {
            return 0;
        } else if (this.field3221) {
            if (arg0 != -22) {
                this.field3227 = false;
            }
            class418 var2 = this.field3220.method1575(0);
            return var2 == null ? 0 : (int) var2.field6091;
        } else {
            return this.field3201.field1613;
        }
    }

    @OriginalMember(owner = "client!oq", name = "c", descriptor = "(I)V")
    public final void method1499(int arg0) {
        field3217++;
        if (this.field3220 == null || this.method1435(82) == null) {
            return;
        }
        for (class418 var2 = this.field3222.method1575(arg0); var2 != null; var2 = this.field3222.method1573((byte) -128)) {
            int var3 = (int) var2.field6091;
            if (var3 < 0 || this.field3201.field1599 <= var3 || this.field3201.field1598[var3] == 0) {
                var2.method2632(true);
            } else {
                if (this.field3203[var3] == 0) {
                    this.method1509(70, 1, var3);
                }
                if (this.field3203[var3] == -1) {
                    this.method1509(120, 2, var3);
                }
                if (this.field3203[var3] == 1) {
                    var2.method2632(true);
                }
            }
        }
    }

    @OriginalMember(owner = "client!oq", name = "d", descriptor = "(I)I")
    public final int method1500(int arg0) {
        field3194++;
        if (this.method1435(45) == null) {
            return this.field3212 == null ? 0 : this.field3212.method565(0);
        } else {
            if (arg0 > -71) {
                field3216 = null;
            }
            return 100;
        }
    }

    @OriginalMember(owner = "client!oq", name = "e", descriptor = "(I)V")
    public final void method1501(int arg0) {
        field3189++;
        if (this.field3218 != null && arg0 < -22) {
            this.field3219 = true;
            if (this.field3220 == null) {
                this.field3220 = new class242();
            }
        }
    }

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(I)Lvm;")
    public final class124 method1435(int arg0) {
        field3208++;
        int var2 = 74 % ((-arg0 - 26) / 58);
        if (this.field3201 != null) {
            return this.field3201;
        }
        if (this.field3212 == null) {
            if (this.field3204.method353((byte) -96)) {
                return null;
            }
            this.field3212 = this.field3204.method352((byte) 0, this.field3192, true, 255, (byte) 35);
        }
        if (this.field3212.field5227) {
            return null;
        }
        byte[] var3 = this.field3212.method569(0);
        if (this.field3212 instanceof class249) {
            try {
                if (var3 == null) {
                    throw new RuntimeException();
                }
                this.field3201 = new class124(var3, this.field3199);
                if (this.field3201.field1616 != this.field3197) {
                    throw new RuntimeException();
                }
            } catch (RuntimeException var4) {
                this.field3201 = null;
                if (this.field3204.method353((byte) 97)) {
                    this.field3212 = null;
                } else {
                    this.field3212 = this.field3204.method352((byte) 0, this.field3192, true, 255, (byte) 35);
                }
                return null;
            }
        } else {
            try {
                if (var3 == null) {
                    throw new RuntimeException();
                }
                this.field3201 = new class124(var3, this.field3199);
            } catch (RuntimeException var5) {
                this.field3204.method358(1);
                this.field3201 = null;
                if (this.field3204.method353((byte) -96)) {
                    this.field3212 = null;
                } else {
                    this.field3212 = this.field3204.method352((byte) 0, this.field3192, true, 255, (byte) 35);
                }
                return null;
            }
            if (this.field3213 != null) {
                this.field3209.method1580(this.field3192, 2, var3, this.field3213);
            }
        }
        this.field3212 = null;
        if (this.field3218 != null) {
            this.field3203 = new byte[this.field3201.field1599];
            this.field3195 = 0;
        }
        return this.field3201;
    }

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(BJ)V")
    public static final void method1502(byte arg0, long arg1) {
        if (arg0 > -17) {
            method1502((byte) 11, -103L);
        }
        field3207++;
        try {
            Thread.sleep(arg1);
        } catch (InterruptedException var3) {
        }
    }

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(II)I")
    public final int method1436(int arg0, int arg1) {
        if (arg1 >= -20) {
            return -49;
        } else {
            field3193++;
            class352 var3 = (class352) this.field3196.method2826(false, (long) arg0);
            return var3 == null ? 0 : var3.method565(0);
        }
    }

    @OriginalMember(owner = "client!oq", name = "b", descriptor = "(II)[B")
    public final byte[] method1437(int arg0, int arg1) {
        if (arg1 != 2) {
            method1510(105, 115, false, -94, (class185) null, -26);
        }
        field3214++;
        class352 var3 = this.method1509(-36, 0, arg0);
        if (var3 == null) {
            return null;
        } else {
            byte[] var4 = var3.method569(0);
            var3.method2632(true);
            return var4;
        }
    }

    @OriginalMember(owner = "client!oq", name = "c", descriptor = "(II)V")
    public final void method1438(int arg0, int arg1) {
        field3200++;
        if (this.field3218 == null) {
            return;
        }
        for (class418 var3 = this.field3222.method1575(arg1 - 1217); var3 != null; var3 = this.field3222.method1573((byte) -128)) {
            if ((long) arg0 == var3.field6091) {
                return;
            }
        }
        class418 var4 = new class418();
        var4.field6091 = (long) arg0;
        this.field3222.method1560(-108, var4);
        if (arg1 != 1217) {
            this.method1498((byte) -115);
        }
    }

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(ILtj;)V")
    public static final void method1503(int arg0, class298 arg1) {
        if (class167.field2266) {
            class185.method1203(-113, arg1);
        } else {
            class167.method1122(true, arg1);
        }
        if (arg0 != -3) {
            field3216 = null;
        }
        field3211++;
    }

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(ZIIIZ)V")
    public static final void method1504(boolean arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field3191++;
        if (arg0 && class338.method2195(arg1, 6173)) {
            class51.method365(-1, arg2, arg3, arg4, -162, class4.field71[arg1]);
        }
    }

    @OriginalMember(owner = "client!oq", name = "f", descriptor = "(I)V")
    public final void method1505(int arg0) {
        field3210++;
        if (this.field3220 != null) {
            if (this.method1435(85) == null) {
                return;
            }
            if (this.field3221) {
                boolean var6 = true;
                for (class418 var7 = this.field3220.method1575(arg0 ^ 0xFFFF9ADB); var7 != null; var7 = this.field3220.method1573((byte) -128)) {
                    int var9 = (int) var7.field6091;
                    if (this.field3203[var9] == 0) {
                        this.method1509(82, 1, var9);
                    }
                    if (this.field3203[var9] == 0) {
                        var6 = false;
                    } else {
                        var7.method2632(true);
                    }
                }
                while (this.field3201.field1598.length > this.field3226) {
                    if (this.field3201.field1598[this.field3226] == 0) {
                        this.field3226++;
                    } else {
                        if (this.field3209.field3415 >= 250) {
                            var6 = false;
                            break;
                        }
                        if (this.field3203[this.field3226] == 0) {
                            this.method1509(80, 1, this.field3226);
                        }
                        if (this.field3203[this.field3226] == 0) {
                            class418 var8 = new class418();
                            var8.field6091 = (long) this.field3226;
                            this.field3220.method1560(-105, var8);
                            var6 = false;
                        }
                        this.field3226++;
                    }
                }
                if (var6) {
                    this.field3221 = false;
                    this.field3226 = 0;
                }
            } else if (this.field3219) {
                boolean var2 = true;
                for (class418 var3 = this.field3220.method1575(0); var3 != null; var3 = this.field3220.method1573((byte) -128)) {
                    int var5 = (int) var3.field6091;
                    if (this.field3203[var5] != 1) {
                        this.method1509(-26, 2, var5);
                    }
                    if (this.field3203[var5] == 1) {
                        var3.method2632(true);
                    } else {
                        var2 = false;
                    }
                }
                while (this.field3201.field1598.length > this.field3226) {
                    if (this.field3201.field1598[this.field3226] == 0) {
                        this.field3226++;
                    } else {
                        if (this.field3204.method350(20)) {
                            var2 = false;
                            break;
                        }
                        if (this.field3203[this.field3226] != 1) {
                            this.method1509(118, 2, this.field3226);
                        }
                        if (this.field3203[this.field3226] != 1) {
                            class418 var4 = new class418();
                            var4.field6091 = (long) this.field3226;
                            this.field3220.method1560(-127, var4);
                            var2 = false;
                        }
                        this.field3226++;
                    }
                }
                if (var2) {
                    this.field3219 = false;
                    this.field3226 = 0;
                }
            } else {
                this.field3220 = null;
            }
        }
        if (this.field3227 && class98.method768((byte) 33) >= this.field3228) {
            for (class352 var10 = (class352) this.field3196.method2812(15710); var10 != null; var10 = (class352) this.field3196.method2819((byte) 121)) {
                if (!var10.field5227) {
                    if (var10.field5220) {
                        if (!var10.field5226) {
                            throw new RuntimeException();
                        }
                        var10.method2632(true);
                    } else {
                        var10.field5220 = true;
                    }
                }
            }
            this.field3228 = class98.method768((byte) 108) + 1000L;
        }
        if (arg0 != -25893) {
            this.method1435(-66);
        }
    }

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/Class;")
    public static final Class method1506(byte arg0, String arg1) throws ClassNotFoundException {
        field3202++;
        if (arg1.equals("B")) {
            return Byte.TYPE;
        } else if (arg1.equals("I")) {
            return Integer.TYPE;
        } else if (arg1.equals("S")) {
            return Short.TYPE;
        } else if (arg1.equals("J")) {
            return Long.TYPE;
        } else if (arg1.equals("Z")) {
            return Boolean.TYPE;
        } else if (arg1.equals("F")) {
            return Float.TYPE;
        } else if (arg1.equals("D")) {
            return Double.TYPE;
        } else if (arg0 == -71) {
            return arg1.equals("C") ? Character.TYPE : Class.forName(arg1);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!oq", name = "g", descriptor = "(I)I")
    public final int method1507(int arg0) {
        field3198++;
        if (arg0 != -20986) {
            this.field3204 = null;
        }
        return this.field3195;
    }

    @OriginalMember(owner = "client!oq", name = "h", descriptor = "(I)I")
    public final int method1508(int arg0) {
        field3205++;
        if (this.field3201 == null) {
            return 0;
        } else {
            if (arg0 != 0) {
                this.method1500(0);
            }
            return this.field3201.field1613;
        }
    }

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(III)Lpd;")
    private final class352 method1509(int arg0, int arg1, int arg2) {
        field3190++;
        int var4 = -49 / ((arg0 - 22) / 47);
        class352 var5 = (class352) this.field3196.method2826(false, (long) arg2);
        if (var5 != null && arg1 == 0 && !var5.field5226 && var5.field5227) {
            var5.method2632(true);
            var5 = null;
        }
        if (var5 == null) {
            if (arg1 == 0) {
                if (this.field3218 == null || this.field3203[arg2] == -1) {
                    if (this.field3204.method353((byte) -120)) {
                        return null;
                    }
                    var5 = this.field3204.method352((byte) 2, arg2, true, this.field3192, (byte) 35);
                } else {
                    var5 = this.field3209.method1581(arg2, 91, this.field3218);
                }
            } else if (arg1 == 1) {
                if (this.field3218 == null) {
                    throw new RuntimeException();
                }
                var5 = this.field3209.method1583(arg2, -124, this.field3218);
            } else if (arg1 == 2) {
                if (this.field3218 == null) {
                    throw new RuntimeException();
                }
                if (this.field3203[arg2] != -1) {
                    throw new RuntimeException();
                }
                if (this.field3204.method350(20)) {
                    return null;
                }
                var5 = this.field3204.method352((byte) 2, arg2, false, this.field3192, (byte) 35);
            } else {
                throw new RuntimeException();
            }
            this.field3196.method2815(-1, (long) arg2, var5);
        }
        if (var5.field5227) {
            return null;
        }
        byte[] var6 = var5.method569(0);
        if (!var5 instanceof class249) {
            try {
                if (var6 == null || var6.length <= 2) {
                    throw new RuntimeException();
                }
                class126.field1646.reset();
                class126.field1646.update(var6, 0, var6.length - 2);
                int var10 = (int) class126.field1646.getValue();
                if (this.field3201.field1615[arg2] != var10) {
                    throw new RuntimeException();
                }
                this.field3204.field784 = 0;
                this.field3204.field786 = 0;
            } catch (RuntimeException var13) {
                this.field3204.method358(1);
                var5.method2632(true);
                if (var5.field5226 && !this.field3204.method353((byte) -96)) {
                    class66 var11 = this.field3204.method352((byte) 2, arg2, true, this.field3192, (byte) 35);
                    this.field3196.method2815(-1, (long) arg2, var11);
                }
                return null;
            }
            var6[var6.length - 2] = (byte) (this.field3201.field1602[arg2] >>> 8);
            var6[var6.length - 1] = (byte) this.field3201.field1602[arg2];
            if (this.field3218 != null) {
                this.field3209.method1580(arg2, 2, var6, this.field3218);
                if (this.field3203[arg2] != 1) {
                    this.field3195++;
                    this.field3203[arg2] = 1;
                }
            }
            if (!var5.field5226) {
                var5.method2632(true);
            }
            return var5;
        }
        try {
            if (var6 == null || var6.length <= 2) {
                throw new RuntimeException();
            }
            class126.field1646.reset();
            class126.field1646.update(var6, 0, var6.length - 2);
            int var7 = (int) class126.field1646.getValue();
            if (this.field3201.field1615[arg2] != var7) {
                throw new RuntimeException();
            }
            int var8 = ((var6[var6.length - 2] & 0xFF) << 8) + (var6[var6.length - 1] & 0xFF);
            if ((this.field3201.field1602[arg2] & 0xFFFF) != var8) {
                throw new RuntimeException();
            }
            if (this.field3203[arg2] != 1) {
                this.field3195++;
                this.field3203[arg2] = 1;
            }
            if (!var5.field5226) {
                var5.method2632(true);
            }
            return var5;
        } catch (Exception var12) {
            this.field3203[arg2] = -1;
            var5.method2632(true);
            if (var5.field5226 && !this.field3204.method353((byte) -109)) {
                class66 var9 = this.field3204.method352((byte) 2, arg2, true, this.field3192, (byte) 35);
                this.field3196.method2815(-1, (long) arg2, var9);
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(IIZILir;I)V")
    public static final void method1510(int arg0, int arg1, boolean arg2, int arg3, class185 arg4, int arg5) {
        if (arg1 != -10668) {
            field3224 = null;
        }
        class195.field2697 = arg2;
        class305.field4566 = arg3;
        field3215++;
        class264.field3890 = arg4;
        class144.field1824 = arg5;
        class223.field3074 = 10000;
        class444.field6414 = arg0;
        class217.field3024 = 1;
    }

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(Z)V")
    public static void method1511(boolean arg0) {
        field3225 = null;
        field3224 = null;
        if (!arg0) {
            field3216 = null;
        }
        field3216 = null;
    }

    @OriginalMember(owner = "client!oq", name = "<init>", descriptor = "(ILeg;Leg;Lpq;Lha;IIZ)V")
    public class232(int arg0, class330 arg1, class330 arg2, class50 arg3, class243 arg4, int arg5, int arg6, boolean arg7) {
        this.field3218 = arg1;
        this.field3192 = arg0;
        if (this.field3218 == null) {
            this.field3221 = false;
        } else {
            this.field3221 = true;
            this.field3220 = new class242();
        }
        this.field3213 = arg2;
        this.field3197 = arg6;
        this.field3199 = arg5;
        this.field3227 = arg7;
        this.field3204 = arg3;
        this.field3209 = arg4;
        if (this.field3213 != null) {
            this.field3212 = this.field3209.method1581(this.field3192, 105, this.field3213);
        }
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 256; var1++) {
            for (int var2 = 0; var2 <= var1; var2++) {
                field3216[var0++] = (byte) ((int) (255.0D / Math.sqrt((double) ((float) (var2 * var2 + (var1 * var1 + 65535)) / 65535.0F))));
            }
        }
        field3223 = true;
        field3225 = new String[100];
    }
}
