import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ww")
public class class643 extends class163 {

    @OriginalMember(owner = "client!ww", name = "f", descriptor = "I")
    private int field8884 = 0;

    @OriginalMember(owner = "client!ww", name = "o", descriptor = "Lwh;")
    private class546 field8893 = new class546(16);

    @OriginalMember(owner = "client!ww", name = "N", descriptor = "I")
    private int field8918 = 0;

    @OriginalMember(owner = "client!ww", name = "K", descriptor = "Lwo;")
    private class445 field8915 = new class445();

    @OriginalMember(owner = "client!ww", name = "R", descriptor = "J")
    private long field8922 = 0L;

    @OriginalMember(owner = "client!ww", name = "D", descriptor = "I")
    private int field8908;

    @OriginalMember(owner = "client!ww", name = "E", descriptor = "Lcr;")
    private class485 field8909;

    @OriginalMember(owner = "client!ww", name = "L", descriptor = "Z")
    private boolean field8916;

    @OriginalMember(owner = "client!ww", name = "O", descriptor = "Lwo;")
    private class445 field8919;

    @OriginalMember(owner = "client!ww", name = "z", descriptor = "Lcr;")
    private class485 field8904;

    @OriginalMember(owner = "client!ww", name = "A", descriptor = "Lgb;")
    private class159 field8905;

    @OriginalMember(owner = "client!ww", name = "I", descriptor = "I")
    private int field8913;

    @OriginalMember(owner = "client!ww", name = "r", descriptor = "I")
    private int field8896;

    @OriginalMember(owner = "client!ww", name = "F", descriptor = "Lqt;")
    private class399 field8910;

    @OriginalMember(owner = "client!ww", name = "Q", descriptor = "Z")
    private boolean field8921;

    @OriginalMember(owner = "client!ww", name = "s", descriptor = "[B")
    private byte[] field8897;

    @OriginalMember(owner = "client!ww", name = "n", descriptor = "Lkw;")
    private class181 field8892;

    @OriginalMember(owner = "client!ww", name = "h", descriptor = "I")
    public static int field8886 = -1;

    @OriginalMember(owner = "client!ww", name = "q", descriptor = "Luf;")
    public static class380 field8895 = new class380(8);

    @OriginalMember(owner = "client!ww", name = "g", descriptor = "I")
    public static int field8885;

    @OriginalMember(owner = "client!ww", name = "i", descriptor = "I")
    public static int field8887;

    @OriginalMember(owner = "client!ww", name = "j", descriptor = "I")
    public static int field8888;

    @OriginalMember(owner = "client!ww", name = "k", descriptor = "I")
    public static int field8889;

    @OriginalMember(owner = "client!ww", name = "l", descriptor = "I")
    public static int field8890;

    @OriginalMember(owner = "client!ww", name = "p", descriptor = "I")
    public static int field8894;

    @OriginalMember(owner = "client!ww", name = "t", descriptor = "I")
    public static int field8898;

    @OriginalMember(owner = "client!ww", name = "u", descriptor = "I")
    public static int field8899;

    @OriginalMember(owner = "client!ww", name = "v", descriptor = "I")
    public static int field8900;

    @OriginalMember(owner = "client!ww", name = "w", descriptor = "I")
    public static int field8901;

    @OriginalMember(owner = "client!ww", name = "x", descriptor = "I")
    public static int field8902;

    @OriginalMember(owner = "client!ww", name = "y", descriptor = "I")
    public static int field8903;

    @OriginalMember(owner = "client!ww", name = "B", descriptor = "I")
    public static int field8906;

    @OriginalMember(owner = "client!ww", name = "C", descriptor = "I")
    public static int field8907;

    @OriginalMember(owner = "client!ww", name = "G", descriptor = "I")
    public static int field8911;

    @OriginalMember(owner = "client!ww", name = "H", descriptor = "I")
    public static int field8912;

    @OriginalMember(owner = "client!ww", name = "M", descriptor = "I")
    public static int field8917;

    @OriginalMember(owner = "client!ww", name = "e", descriptor = "Lkm;")
    private class121 field8883;

    @OriginalMember(owner = "client!ww", name = "J", descriptor = "Lsc;")
    public static class360 field8914;

    @OriginalMember(owner = "client!ww", name = "P", descriptor = "Z")
    private boolean field8920;

    @OriginalMember(owner = "client!ww", name = "m", descriptor = "[B")
    private byte[] field8891;

    @OriginalMember(owner = "client!ww", name = "d", descriptor = "(I)V")
    public final void method3572(int arg0) {
        field8889++;
        if (arg0 == 16383 && this.field8909 != null) {
            this.field8920 = true;
            if (this.field8919 == null) {
                this.field8919 = new class445();
            }
        }
    }

    @OriginalMember(owner = "client!ww", name = "a", descriptor = "(Lr;ILkt;Llv;)V")
    public static final void method3573(class562 arg0, int arg1, class83 arg2, class694 arg3) {
        field8885++;
        class532 var4 = arg2.method447(-711235523, arg0);
        if (var4 == null) {
            return;
        }
        int var5 = var4.method530();
        if (var4.method529() > var5) {
            var5 = var4.method529();
        }
        byte var6 = 10;
        int var7 = arg3.field9788;
        int var8 = -55 % ((arg1 + 22) / 49);
        int var9 = arg3.field9782;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        if (arg2.field1003 != null) {
            var10 = class671.field9544.method3760(null, 1499, class333.field4486, arg2.field1003, null);
            for (int var13 = 0; var13 < var10; var13++) {
                String var14 = class333.field4486[var13];
                if (var13 < (var10 - 1)) {
                    var14 = var14.substring(0, var14.length() - 4);
                }
                int var15 = class428.field5770.method2476(var14);
                if (var11 < var15) {
                    var11 = var15;
                }
            }
            var12 = var10 * class428.field5770.method2470() + (class428.field5770.method2475() / 2);
        }
        int var16 = var5 / 2 + arg3.field9788;
        if (class672.field9575 + var5 > var7) {
            var16 = var11 / 2 + class672.field9575 + var5 / 2 + var6 + 5;
            var7 = class672.field9575;
        } else if (class672.field9576 - var5 < var7) {
            var7 = class672.field9576 - var5;
            var16 = class672.field9576 - (var5 / 2) - var6 - (var11 / 2) - 5;
        }
        int var17 = arg3.field9782;
        if ((class672.field9569 + var5) > var9) {
            var9 = class672.field9569;
            var17 = class672.field9569 + var6 + (var5 / 2);
        } else if (var9 > class672.field9578 - var5) {
            var9 = class672.field9578 - var5;
            var17 = class672.field9578 - (var5 / 2) - var6 - var12;
        }
        int var18 = (int) (Math.atan2((double) (var7 - arg3.field9788), (double) (var9 - arg3.field9782)) / 3.141592653589793D * 32767.0D) & 0xFFFF;
        var4.method2989((float) var5 / 2.0F + (float) var7, (float) var5 / 2.0F + (float) var9, 4096, var18);
        int var19 = -2;
        int var20 = -2;
        int var21 = -2;
        int var22 = -2;
        if (arg2.field1003 != null) {
            var20 = var17;
            var19 = var16 - (var11 / 2) - 5;
            var21 = var19 + var11 + 10;
            var22 = class428.field5770.method2470() * var10 + var17 + 3;
            if (arg2.field985 != 0) {
                arg0.method3118(true, var22 - var17, var19, var17, var21 - var19, arg2.field985);
            }
            if (arg2.field982 != 0) {
                arg0.method3126(var17, var19, var22 - var17, 1, var21 - var19, arg2.field982);
            }
            for (int var23 = 0; var23 < var10; var23++) {
                String var24 = class333.field4486[var23];
                if (var10 - 1 > var23) {
                    var24 = var24.substring(0, var24.length() - 4);
                }
                class428.field5770.method2473(arg0, var24, var16, var17, arg2.field981, true);
                var17 += class428.field5770.method2470();
            }
        }
        if (arg2.field999 == -1 && arg2.field1003 == null) {
            return;
        }
        int var25 = var5 >> 1;
        class31 var26 = new class31(arg3);
        var26.field441 = var7 + var25;
        var26.field436 = var9 - var25;
        var26.field438 = var19;
        var26.field442 = var20;
        var26.field439 = var21;
        var26.field430 = var7 - var25;
        var26.field433 = var22;
        var26.field435 = var9 + var25;
        class533.field7329.method2507(var26, (byte) -126);
    }

    @OriginalMember(owner = "client!ww", name = "a", descriptor = "(I)Lkm;")
    public final class121 method999(int arg0) {
        field8903++;
        if (this.field8883 != null) {
            return this.field8883;
        }
        if (this.field8892 == null) {
            if (this.field8905.method980(4)) {
                return null;
            }
            this.field8892 = this.field8905.method981(this.field8908, (byte) 91, 255, (byte) 0, true);
        }
        if (this.field8892.field2536) {
            return null;
        }
        byte[] var2 = this.field8892.method437(4);
        if (this.field8892 instanceof class82) {
            try {
                if (var2 == null) {
                    throw new RuntimeException();
                }
                this.field8883 = new class121(var2, this.field8913, this.field8897);
                if (this.field8883.field1578 != this.field8896) {
                    throw new RuntimeException();
                }
            } catch (RuntimeException var3) {
                this.field8883 = null;
                if (this.field8905.method980(4)) {
                    this.field8892 = null;
                } else {
                    this.field8892 = this.field8905.method981(this.field8908, (byte) 97, 255, (byte) 0, true);
                }
                return null;
            }
        } else {
            try {
                if (var2 == null) {
                    throw new RuntimeException();
                }
                this.field8883 = new class121(var2, this.field8913, this.field8897);
            } catch (RuntimeException var4) {
                this.field8905.method982(-74);
                this.field8883 = null;
                if (this.field8905.method980(4)) {
                    this.field8892 = null;
                } else {
                    this.field8892 = this.field8905.method981(this.field8908, (byte) 84, 255, (byte) 0, true);
                }
                return null;
            }
            if (this.field8904 != null) {
                this.field8910.method2284(this.field8908, (byte) -48, this.field8904, var2);
            }
        }
        if (this.field8909 != null) {
            this.field8884 = 0;
            this.field8891 = new byte[this.field8883.field1564];
        }
        if (arg0 != 0) {
            method3581(127, 32, 35, 56, 14, -127);
        }
        this.field8892 = null;
        return this.field8883;
    }

    @OriginalMember(owner = "client!ww", name = "b", descriptor = "(B)I")
    public final int method3574(byte arg0) {
        field8906++;
        return arg0 == -50 ? this.field8884 : 68;
    }

    @OriginalMember(owner = "client!ww", name = "c", descriptor = "(B)I")
    public final int method3575(byte arg0) {
        if (arg0 <= 48) {
            return -13;
        }
        field8901++;
        if (this.method999(0) == null) {
            return this.field8892 == null ? 0 : this.field8892.method438((byte) -112);
        } else {
            return 100;
        }
    }

    @OriginalMember(owner = "client!ww", name = "a", descriptor = "(BILjava/lang/Object;I)[B")
    public static final byte[] method3576(byte arg0, int arg1, Object arg2, int arg3) {
        field8898++;
        if (arg2 == null) {
            return null;
        }
        if (arg0 < 94) {
            field8914 = null;
        }
        if (arg2 instanceof byte[]) {
            byte[] var4 = (byte[]) arg2;
            return class471.method2725(arg3, arg1, var4, (byte) 81);
        } else if (arg2 instanceof class337) {
            class337 var5 = (class337) arg2;
            return var5.method1222(arg1, 0, arg3);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!ww", name = "a", descriptor = "(II)[B")
    public final byte[] method1000(int arg0, int arg1) {
        field8890++;
        int var3 = -67 / ((5 - arg1) / 52);
        class181 var4 = this.method3577((byte) 0, arg0, 0);
        if (var4 == null) {
            return null;
        } else {
            byte[] var5 = var4.method437(4);
            var4.method242(true);
            return var5;
        }
    }

    @OriginalMember(owner = "client!ww", name = "b", descriptor = "(IB)V")
    public final void method1004(int arg0, byte arg1) {
        field8900++;
        if (this.field8909 == null) {
            return;
        }
        for (class45 var3 = this.field8915.method2506(68); var3 != null; var3 = this.field8915.method2505(-128)) {
            if (((long) arg0) == var3.field545) {
                return;
            }
        }
        class45 var4 = new class45();
        if (arg1 >= 64) {
            var4.field545 = arg0;
            this.field8915.method2507(var4, (byte) -121);
        }
    }

    @OriginalMember(owner = "client!ww", name = "a", descriptor = "(BII)Lkw;")
    private final class181 method3577(byte arg0, int arg1, int arg2) {
        field8887++;
        class181 var4 = (class181) this.field8893.method3057(1, (long) arg1);
        if (var4 != null && arg2 == 0 && !var4.field2538 && var4.field2536) {
            var4.method242(true);
            var4 = null;
        }
        if (var4 == null) {
            if (arg2 == 0) {
                if (this.field8909 == null || this.field8891[arg1] == -1) {
                    if (this.field8905.method980(arg0 ^ 0x4)) {
                        return null;
                    }
                    var4 = this.field8905.method981(arg1, (byte) 112, this.field8908, (byte) 2, true);
                } else {
                    var4 = this.field8910.method2281(-107, arg1, this.field8909);
                }
            } else if (arg2 == 1) {
                if (this.field8909 == null) {
                    throw new RuntimeException();
                }
                var4 = this.field8910.method2282(true, arg1, this.field8909);
            } else if (arg2 == 2) {
                if (this.field8909 == null) {
                    throw new RuntimeException();
                }
                if (this.field8891[arg1] != -1) {
                    throw new RuntimeException();
                }
                if (this.field8905.method976(arg0 ^ 0x14)) {
                    return null;
                }
                var4 = this.field8905.method981(arg1, (byte) 76, this.field8908, (byte) 2, false);
            } else {
                throw new RuntimeException();
            }
            this.field8893.method3061(124, (long) arg1, var4);
        }
        if (var4.field2536) {
            return null;
        }
        if (arg0 != 0) {
            this.field8908 = -66;
        }
        byte[] var5 = var4.method437(4);
        if (!var4 instanceof class82) {
            try {
                label159: {
                    if (var5 != null && var5.length > 2) {
                        class309.field4180.reset();
                        class309.field4180.update(var5, 0, var5.length - 2);
                        int var12 = (int) class309.field4180.getValue();
                        if (this.field8883.field1562[arg1] != var12) {
                            throw new RuntimeException();
                        }
                        if (this.field8883.field1584 == null || this.field8883.field1584[arg1] == null) {
                            break label159;
                        }
                        byte[] var13 = this.field8883.field1584[arg1];
                        byte[] var14 = class286.method1695(var5.length - 2, var5, 0, 101);
                        int var15 = 0;
                        while (true) {
                            if (var15 >= 64) {
                                break label159;
                            }
                            if (var13[var15] != var14[var15]) {
                                throw new RuntimeException();
                            }
                            var15++;
                        }
                    }
                    throw new RuntimeException();
                }
                this.field8905.field2308 = 0;
                this.field8905.field2306 = 0;
            } catch (RuntimeException var18) {
                this.field8905.method982(arg0 - 85);
                var4.method242(true);
                if (var4.field2538 && !this.field8905.method980(4)) {
                    class352 var16 = this.field8905.method981(arg1, (byte) 65, this.field8908, (byte) 2, true);
                    this.field8893.method3061(127, (long) arg1, var16);
                }
                return null;
            }
            var5[var5.length - 2] = (byte) (this.field8883.field1572[arg1] >>> 8);
            var5[var5.length - 1] = (byte) this.field8883.field1572[arg1];
            if (this.field8909 != null) {
                this.field8910.method2284(arg1, (byte) -48, this.field8909, var5);
                if (this.field8891[arg1] != 1) {
                    this.field8884++;
                    this.field8891[arg1] = 1;
                }
            }
            if (!var4.field2538) {
                var4.method242(true);
            }
            return var4;
        }
        try {
            if (var5 == null || var5.length <= 2) {
                throw new RuntimeException();
            }
            class309.field4180.reset();
            class309.field4180.update(var5, 0, var5.length - 2);
            int var6 = (int) class309.field4180.getValue();
            if (this.field8883.field1562[arg1] != var6) {
                throw new RuntimeException();
            }
            if (this.field8883.field1584 != null && this.field8883.field1584[arg1] != null) {
                byte[] var7 = this.field8883.field1584[arg1];
                byte[] var8 = class286.method1695(var5.length - 2, var5, 0, 125);
                for (int var9 = 0; var9 < 64; var9++) {
                    if (var7[var9] != var8[var9]) {
                        throw new RuntimeException();
                    }
                }
            }
            int var10 = ((var5[var5.length - 2] & 0xFF) << 8) + (var5[var5.length - 1] & 0xFF);
            if ((this.field8883.field1572[arg1] & 0xFFFF) != var10) {
                throw new RuntimeException();
            }
            if (this.field8891[arg1] != 1) {
                this.field8884++;
                this.field8891[arg1] = 1;
            }
            if (!var4.field2538) {
                var4.method242(true);
            }
            return var4;
        } catch (Exception var17) {
            this.field8891[arg1] = -1;
            var4.method242(true);
            if (var4.field2538 && !this.field8905.method980(4)) {
                class352 var11 = this.field8905.method981(arg1, (byte) 108, this.field8908, (byte) 2, true);
                this.field8893.method3061(arg0 ^ 0x7B, (long) arg1, var11);
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!ww", name = "a", descriptor = "(IB)I")
    public final int method1001(int arg0, byte arg1) {
        field8911++;
        class181 var3 = (class181) this.field8893.method3057(1, (long) arg0);
        if (arg1 > -20) {
            return 13;
        } else if (var3 == null) {
            return 0;
        } else {
            return var3.method438((byte) -112);
        }
    }

    @OriginalMember(owner = "client!ww", name = "a", descriptor = "(Lio;B)Lnga;")
    public static final class574 method3578(class157 arg0, byte arg1) {
        field8917++;
        String var2 = arg0.method925(117);
        class566 var3 = class335.method1971(2)[arg0.method930(255)];
        class286 var4 = class190.method1252((byte) 81)[arg0.method930(255)];
        int var5 = arg0.method928(2016790224);
        int var6 = arg0.method928(2016790224);
        int var7 = arg0.method930(255);
        int var8 = arg0.method930(255);
        int var9 = arg0.method930(255);
        int var10 = arg0.method963(-124);
        int var11 = arg0.method963(-126);
        int var12 = arg0.method908(false);
        if (arg1 <= 61) {
            return null;
        } else {
            int var13 = arg0.method908(false);
            int var14 = arg0.method908(false);
            return new class574(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14);
        }
    }

    @OriginalMember(owner = "client!ww", name = "a", descriptor = "(Z)V")
    public final void method3579(boolean arg0) {
        field8888++;
        if (arg0) {
            this.field8896 = -106;
        }
        if (this.field8919 != null) {
            if (this.method999(0) == null) {
                return;
            }
            if (this.field8916) {
                boolean var2 = true;
                for (class45 var3 = this.field8919.method2506(68); var3 != null; var3 = this.field8919.method2505(-118)) {
                    int var5 = (int) var3.field545;
                    if (this.field8891[var5] == 0) {
                        this.method3577((byte) 0, var5, 1);
                    }
                    if (this.field8891[var5] == 0) {
                        var2 = false;
                    } else {
                        var3.method242(true);
                    }
                }
                while (this.field8883.field1570.length > this.field8918) {
                    if (this.field8883.field1570[this.field8918] == 0) {
                        this.field8918++;
                    } else {
                        if (this.field8910.field5299 >= 250) {
                            var2 = false;
                            break;
                        }
                        if (this.field8891[this.field8918] == 0) {
                            this.method3577((byte) 0, this.field8918, 1);
                        }
                        if (this.field8891[this.field8918] == 0) {
                            class45 var4 = new class45();
                            var4.field545 = this.field8918;
                            var2 = false;
                            this.field8919.method2507(var4, (byte) -128);
                        }
                        this.field8918++;
                    }
                }
                if (var2) {
                    this.field8916 = false;
                    this.field8918 = 0;
                }
            } else if (this.field8920) {
                boolean var6 = true;
                for (class45 var7 = this.field8919.method2506(68); var7 != null; var7 = this.field8919.method2505(-123)) {
                    int var9 = (int) var7.field545;
                    if (this.field8891[var9] != 1) {
                        this.method3577((byte) 0, var9, 2);
                    }
                    if (this.field8891[var9] == 1) {
                        var7.method242(true);
                    } else {
                        var6 = false;
                    }
                }
                while (this.field8918 < this.field8883.field1570.length) {
                    if (this.field8883.field1570[this.field8918] == 0) {
                        this.field8918++;
                    } else {
                        if (this.field8905.method976(20)) {
                            var6 = false;
                            break;
                        }
                        if (this.field8891[this.field8918] != 1) {
                            this.method3577((byte) 0, this.field8918, 2);
                        }
                        if (this.field8891[this.field8918] != 1) {
                            class45 var8 = new class45();
                            var8.field545 = this.field8918;
                            var6 = false;
                            this.field8919.method2507(var8, (byte) -127);
                        }
                        this.field8918++;
                    }
                }
                if (var6) {
                    this.field8918 = 0;
                    this.field8920 = false;
                }
            } else {
                this.field8919 = null;
            }
        }
        if (!this.field8921 || class529.method2982((byte) -69) < this.field8922) {
            return;
        }
        for (class181 var10 = (class181) this.field8893.method3053((byte) 100); var10 != null; var10 = (class181) this.field8893.method3056(18113)) {
            if (!var10.field2536) {
                if (var10.field2537) {
                    if (!var10.field2538) {
                        throw new RuntimeException();
                    }
                    var10.method242(true);
                } else {
                    var10.field2537 = true;
                }
            }
        }
        this.field8922 = class529.method2982((byte) -69) + 1000L;
    }

    @OriginalMember(owner = "client!ww", name = "e", descriptor = "(I)V")
    public final void method3580(int arg0) {
        field8912++;
        if (this.field8919 == null || this.method999(arg0 ^ arg0) == null) {
            return;
        }
        for (class45 var2 = this.field8915.method2506(68); var2 != null; var2 = this.field8915.method2505(-118)) {
            int var3 = (int) var2.field545;
            if (var3 < 0 || this.field8883.field1564 <= var3 || this.field8883.field1570[var3] == 0) {
                var2.method242(true);
            } else {
                if (this.field8891[var3] == 0) {
                    this.method3577((byte) 0, var3, 1);
                }
                if (this.field8891[var3] == -1) {
                    this.method3577((byte) 0, var3, 2);
                }
                if (this.field8891[var3] == 1) {
                    var2.method242(true);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ww", name = "a", descriptor = "(IIIIII)V")
    public static final void method3581(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 != 3072) {
            return;
        }
        class152.field2090 = arg3;
        class420.field5514 = arg5;
        field8894++;
        class170.field2427 = arg4;
        class108.field1281 = arg0;
        class155.field2184 = arg2;
        if (class170.field2427 >= 100) {
            int var6 = class155.field2184 * 512 + 256;
            int var7 = class420.field5514 * 512 + 256;
            int var8 = class180.method1211(class298.field3942, true, var6, var7) - class152.field2090;
            int var9 = var6 - class82.field946;
            int var10 = var8 - class148.field1986;
            int var11 = var7 - class147.field1980;
            int var12 = (int) Math.sqrt((double) (var9 * var9 + var11 * var11));
            class558.field7615 = (int) (Math.atan2((double) var10, (double) var12) * 2607.5945876176133D) & 0x3FFF;
            class604.field8440 = (int) (Math.atan2((double) var9, (double) var11) * -2607.5945876176133D) & 0x3FFF;
            if (class558.field7615 < 1024) {
                class558.field7615 = 1024;
            }
            class660.field9416 = 0;
            if (class558.field7615 > 3072) {
                class558.field7615 = 3072;
            }
        }
        class83.field1004 = -1;
        class342.field4585 = -1;
        class311.field4200 = 2;
    }

    @OriginalMember(owner = "client!ww", name = "f", descriptor = "(I)I")
    public final int method3582(int arg0) {
        field8907++;
        if (this.field8883 == null) {
            return 0;
        } else if (this.field8916) {
            class45 var2 = this.field8919.method2506(68);
            if (arg0 < 88) {
                this.field8916 = false;
            }
            return var2 == null ? 0 : (int) var2.field545;
        } else {
            return this.field8883.field1582;
        }
    }

    @OriginalMember(owner = "client!ww", name = "g", descriptor = "(I)I")
    public final int method3583(int arg0) {
        if (arg0 > -73) {
            this.field8904 = null;
        }
        field8902++;
        return this.field8883 == null ? 0 : this.field8883.field1582;
    }

    @OriginalMember(owner = "client!ww", name = "h", descriptor = "(I)V")
    public static void method3584(int arg0) {
        if (arg0 == -3) {
            field8895 = null;
            field8914 = null;
        }
    }

    @OriginalMember(owner = "client!ww", name = "a", descriptor = "(ILdf;)V")
    public static final void method3585(int arg0, class595 arg1) {
        class267.field3489 = arg1;
        field8899++;
        if (arg0 >= -58) {
            field8886 = 27;
        }
    }

    @OriginalMember(owner = "client!ww", name = "<init>", descriptor = "(ILcr;Lcr;Lgb;Lqt;I[BIZ)V")
    public class643(int arg0, class485 arg1, class485 arg2, class159 arg3, class399 arg4, int arg5, byte[] arg6, int arg7, boolean arg8) {
        this.field8908 = arg0;
        this.field8909 = arg1;
        if (this.field8909 == null) {
            this.field8916 = false;
        } else {
            this.field8916 = true;
            this.field8919 = new class445();
        }
        this.field8904 = arg2;
        this.field8905 = arg3;
        this.field8913 = arg5;
        this.field8896 = arg7;
        this.field8910 = arg4;
        this.field8921 = arg8;
        this.field8897 = arg6;
        if (this.field8904 != null) {
            this.field8892 = this.field8910.method2281(-79, this.field8908, this.field8904);
        }
    }
}
