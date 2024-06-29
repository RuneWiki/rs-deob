import java.awt.Canvas;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!me")
public class class634 extends class438 {

    @OriginalMember(owner = "client!me", name = "p", descriptor = "I")
    private int field8899 = 0;

    @OriginalMember(owner = "client!me", name = "j", descriptor = "Lpl;")
    private class616 field8893 = new class616(16);

    @OriginalMember(owner = "client!me", name = "I", descriptor = "I")
    private int field8918 = 0;

    @OriginalMember(owner = "client!me", name = "L", descriptor = "Ltg;")
    private class605 field8921 = new class605();

    @OriginalMember(owner = "client!me", name = "O", descriptor = "J")
    private long field8924 = 0L;

    @OriginalMember(owner = "client!me", name = "f", descriptor = "I")
    private int field8889;

    @OriginalMember(owner = "client!me", name = "h", descriptor = "Lid;")
    private class463 field8891;

    @OriginalMember(owner = "client!me", name = "N", descriptor = "Z")
    private boolean field8923;

    @OriginalMember(owner = "client!me", name = "K", descriptor = "Ltg;")
    private class605 field8920;

    @OriginalMember(owner = "client!me", name = "C", descriptor = "I")
    private int field8912;

    @OriginalMember(owner = "client!me", name = "x", descriptor = "Lrt;")
    private class485 field8907;

    @OriginalMember(owner = "client!me", name = "B", descriptor = "Lid;")
    private class463 field8911;

    @OriginalMember(owner = "client!me", name = "z", descriptor = "I")
    private int field8909;

    @OriginalMember(owner = "client!me", name = "P", descriptor = "Z")
    private boolean field8925;

    @OriginalMember(owner = "client!me", name = "v", descriptor = "Lih;")
    private class741 field8905;

    @OriginalMember(owner = "client!me", name = "q", descriptor = "[B")
    private byte[] field8900;

    @OriginalMember(owner = "client!me", name = "e", descriptor = "Lfo;")
    private class482 field8888;

    @OriginalMember(owner = "client!me", name = "G", descriptor = "[I")
    public static int[] field8916 = new int[] { 2047, 16383, 65535 };

    @OriginalMember(owner = "client!me", name = "s", descriptor = "[I")
    public static int[] field8902 = new int[1000];

    @OriginalMember(owner = "client!me", name = "i", descriptor = "I")
    public static int field8892;

    @OriginalMember(owner = "client!me", name = "k", descriptor = "I")
    public static int field8894;

    @OriginalMember(owner = "client!me", name = "l", descriptor = "I")
    public static int field8895;

    @OriginalMember(owner = "client!me", name = "m", descriptor = "I")
    public static int field8896;

    @OriginalMember(owner = "client!me", name = "o", descriptor = "I")
    public static int field8898;

    @OriginalMember(owner = "client!me", name = "r", descriptor = "I")
    public static int field8901;

    @OriginalMember(owner = "client!me", name = "t", descriptor = "I")
    public static int field8903;

    @OriginalMember(owner = "client!me", name = "u", descriptor = "I")
    public static int field8904;

    @OriginalMember(owner = "client!me", name = "w", descriptor = "I")
    public static int field8906;

    @OriginalMember(owner = "client!me", name = "y", descriptor = "I")
    public static int field8908;

    @OriginalMember(owner = "client!me", name = "A", descriptor = "I")
    public static int field8910;

    @OriginalMember(owner = "client!me", name = "D", descriptor = "I")
    public static int field8913;

    @OriginalMember(owner = "client!me", name = "E", descriptor = "I")
    public static int field8914;

    @OriginalMember(owner = "client!me", name = "F", descriptor = "I")
    public static int field8915;

    @OriginalMember(owner = "client!me", name = "M", descriptor = "I")
    public static int field8922;

    @OriginalMember(owner = "client!me", name = "g", descriptor = "Luj;")
    private class436 field8890;

    // $FF: synthetic field
    @OriginalMember(owner = "client!me", name = "Q", descriptor = "Ljava/lang/Class;")
    public static Class field8926;

    @OriginalMember(owner = "client!me", name = "J", descriptor = "Z")
    private boolean field8919;

    @OriginalMember(owner = "client!me", name = "H", descriptor = "[B")
    private byte[] field8917;

    @OriginalMember(owner = "client!me", name = "n", descriptor = "[Ljava/lang/String;")
    public static String[] field8897;

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(I)I")
    public final int method3583(int arg0) {
        if (arg0 != -30536) {
            this.method3593((byte) 14);
        }
        field8913++;
        if (this.field8890 == null) {
            return 0;
        } else if (this.field8923) {
            class65 var2 = this.field8920.method3463((byte) -50);
            return var2 == null ? 0 : (int) var2.field1039;
        } else {
            return this.field8890.field6357;
        }
    }

    @OriginalMember(owner = "client!me", name = "b", descriptor = "(ZI)V")
    public static final void method3584(boolean arg0, int arg1) {
        field8895++;
        if (class665.field9445.length() == 0) {
            return;
        }
        class400.method2484(26852, "--> " + class665.field9445);
        class734.method4099(class665.field9445, arg0, 13, false);
        if (arg1 != 2) {
            method3590(72, null, (byte) -4, null, -58);
        }
        class174.field2996 = 0;
        class723.field10139 = 0;
        class665.field9445 = "";
    }

    @OriginalMember(owner = "client!me", name = "b", descriptor = "(Z)I")
    public final int method3585(boolean arg0) {
        if (arg0) {
            field8906++;
            return this.field8899;
        } else {
            return 4;
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(ZI)[B")
    public final byte[] method2697(boolean arg0, int arg1) {
        field8892++;
        class482 var3 = this.method3592(0, 0, arg1);
        if (var3 == null) {
            return null;
        } else {
            byte[] var4 = var3.method12(24649);
            var3.method636((byte) 97);
            return arg0 ? null : var4;
        }
    }

    @OriginalMember(owner = "client!me", name = "b", descriptor = "(I)V")
    public static final void method3586(int arg0) {
        if (arg0 >= -3) {
            method3590(31, null, (byte) -120, null, -127);
        }
        try {
            Method var1 = (field8926 == null ? (field8926 = method3595("java.lang.Runtime")) : field8926).getMethod("availableProcessors");
            if (var1 != null) {
                try {
                    Runtime var2 = Runtime.getRuntime();
                    Integer var3 = (Integer) var1.invoke(var2, (Object[]) null);
                    class51.field824 = var3;
                } catch (Throwable var4) {
                }
            }
        } catch (Exception var5) {
        }
        field8894++;
    }

    @OriginalMember(owner = "client!me", name = "b", descriptor = "(B)V")
    public final void method3587(byte arg0) {
        field8914++;
        if (this.field8891 == null) {
            return;
        }
        this.field8919 = true;
        if (this.field8920 == null) {
            this.field8920 = new class605();
        }
        if (arg0 != 66) {
            this.method2700(true);
        }
    }

    @OriginalMember(owner = "client!me", name = "c", descriptor = "(I)I")
    public final int method3588(int arg0) {
        field8901++;
        if (this.method2700(true) == null) {
            return this.field8888 == null ? 0 : this.field8888.method11((byte) 119);
        } else if (arg0 == -26239) {
            return 100;
        } else {
            return 14;
        }
    }

    @OriginalMember(owner = "client!me", name = "c", descriptor = "(B)I")
    public final int method3589(byte arg0) {
        field8903++;
        if (this.field8890 == null) {
            return 0;
        } else {
            if (arg0 != 0) {
                method3590(58, null, (byte) 88, null, -70);
            }
            return this.field8890.field6357;
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(II)V")
    public final void method2698(int arg0, int arg1) {
        field8922++;
        if (arg0 != -2) {
            this.method2697(false, -39);
        }
        if (this.field8891 == null) {
            return;
        }
        for (class65 var3 = this.field8921.method3463((byte) -50); var3 != null; var3 = this.field8921.method3469((byte) 107)) {
            if ((long) arg1 == var3.field1039) {
                return;
            }
        }
        class65 var4 = new class65();
        var4.field1039 = arg1;
        this.field8921.method3472(103, var4);
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(Z)Luj;")
    public final class436 method2700(boolean arg0) {
        field8904++;
        if (this.field8890 != null) {
            return this.field8890;
        }
        if (!arg0) {
            this.method3589((byte) 43);
        }
        if (this.field8888 == null) {
            if (this.field8907.method2937((byte) 56)) {
                return null;
            }
            this.field8888 = this.field8907.method2933(true, this.field8889, -513, (byte) 0, 255);
        }
        if (this.field8888.field6952) {
            return null;
        }
        byte[] var2 = this.field8888.method12(24649);
        if (this.field8888 instanceof class4) {
            try {
                if (var2 == null) {
                    throw new RuntimeException();
                }
                this.field8890 = new class436(var2, this.field8912, this.field8900);
                if (this.field8890.field6375 != this.field8909) {
                    throw new RuntimeException();
                }
            } catch (RuntimeException var3) {
                this.field8890 = null;
                if (this.field8907.method2937((byte) 56)) {
                    this.field8888 = null;
                } else {
                    this.field8888 = this.field8907.method2933(true, this.field8889, -513, (byte) 0, 255);
                }
                return null;
            }
        } else {
            try {
                if (var2 == null) {
                    throw new RuntimeException();
                }
                this.field8890 = new class436(var2, this.field8912, this.field8900);
            } catch (RuntimeException var4) {
                this.field8907.method2941(false);
                this.field8890 = null;
                if (this.field8907.method2937((byte) 56)) {
                    this.field8888 = null;
                } else {
                    this.field8888 = this.field8907.method2933(true, this.field8889, -513, (byte) 0, 255);
                }
                return null;
            }
            if (this.field8911 != null) {
                this.field8905.method4153(-4539, var2, this.field8911, this.field8889);
            }
        }
        if (this.field8891 != null) {
            this.field8899 = 0;
            this.field8917 = new byte[this.field8890.field6373];
        }
        this.field8888 = null;
        return this.field8890;
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(ILjava/awt/Canvas;BLd;I)Lha;")
    public static final class544 method3590(int arg0, Canvas arg1, byte arg2, class267 arg3, int arg4) {
        if (arg2 == 37) {
            field8898++;
            return new class491(arg1, arg3, arg0, arg4);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!me", name = "d", descriptor = "(I)V")
    public static void method3591(int arg0) {
        if (arg0 > 0) {
            method3586(-119);
        }
        field8902 = null;
        field8897 = null;
        field8916 = null;
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(III)Lfo;")
    private final class482 method3592(int arg0, int arg1, int arg2) {
        field8910++;
        class482 var4 = (class482) this.field8893.method3512(true, (long) arg2);
        if (var4 != null && arg0 == 0 && !var4.field6953 && var4.field6952) {
            var4.method636((byte) 97);
            var4 = null;
        }
        if (var4 == null) {
            if (arg0 == 0) {
                if (this.field8891 == null || this.field8917[arg2] == -1) {
                    if (this.field8907.method2937((byte) 56)) {
                        return null;
                    }
                    var4 = this.field8907.method2933(true, arg2, -513, (byte) 2, this.field8889);
                } else {
                    var4 = this.field8905.method4150(arg2, this.field8891, -8351);
                }
            } else if (arg0 == 1) {
                if (this.field8891 == null) {
                    throw new RuntimeException();
                }
                var4 = this.field8905.method4146(106, arg2, this.field8891);
            } else if (arg0 == 2) {
                if (this.field8891 == null) {
                    throw new RuntimeException();
                }
                if (this.field8917[arg2] != -1) {
                    throw new RuntimeException();
                }
                if (this.field8907.method2935(arg1 ^ 0xFFFF945E)) {
                    return null;
                }
                var4 = this.field8907.method2933(false, arg2, -513, (byte) 2, this.field8889);
            } else {
                throw new RuntimeException();
            }
            this.field8893.method3516(255, (long) arg2, var4);
        }
        if (var4.field6952) {
            return null;
        }
        if (arg1 != 0) {
            this.field8909 = 68;
        }
        byte[] var5 = var4.method12(24649);
        if (!var4 instanceof class4) {
            try {
                label159: {
                    if (var5 != null && var5.length > 2) {
                        class89.field1364.reset();
                        class89.field1364.update(var5, 0, var5.length - 2);
                        int var12 = (int) class89.field1364.getValue();
                        if (this.field8890.field6355[arg2] != var12) {
                            throw new RuntimeException();
                        }
                        if (this.field8890.field6368 == null || this.field8890.field6368[arg2] == null) {
                            break label159;
                        }
                        byte[] var13 = this.field8890.field6368[arg2];
                        byte[] var14 = class38.method313(var5.length - 2, 23863, 0, var5);
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
                this.field8907.field7022 = 0;
                this.field8907.field7021 = 0;
            } catch (RuntimeException var18) {
                this.field8907.method2941(false);
                var4.method636((byte) 97);
                if (var4.field6953 && !this.field8907.method2937((byte) 56)) {
                    class648 var16 = this.field8907.method2933(true, arg2, arg1 ^ 0xFFFFFDFF, (byte) 2, this.field8889);
                    this.field8893.method3516(arg1 + 255, (long) arg2, var16);
                }
                return null;
            }
            var5[var5.length - 2] = (byte) (this.field8890.field6363[arg2] >>> 8);
            var5[var5.length - 1] = (byte) this.field8890.field6363[arg2];
            if (this.field8891 != null) {
                this.field8905.method4153(-4539, var5, this.field8891, arg2);
                if (this.field8917[arg2] != 1) {
                    this.field8899++;
                    this.field8917[arg2] = 1;
                }
            }
            if (!var4.field6953) {
                var4.method636((byte) 97);
            }
            return var4;
        }
        try {
            if (var5 == null || var5.length <= 2) {
                throw new RuntimeException();
            }
            class89.field1364.reset();
            class89.field1364.update(var5, 0, var5.length - 2);
            int var6 = (int) class89.field1364.getValue();
            if (this.field8890.field6355[arg2] != var6) {
                throw new RuntimeException();
            }
            if (this.field8890.field6368 != null && this.field8890.field6368[arg2] != null) {
                byte[] var7 = this.field8890.field6368[arg2];
                byte[] var8 = class38.method313(var5.length - 2, 23863, 0, var5);
                for (int var9 = 0; var9 < 64; var9++) {
                    if (var7[var9] != var8[var9]) {
                        throw new RuntimeException();
                    }
                }
            }
            int var10 = (var5[var5.length - 2] & 0xFF << 8) + (var5[var5.length - 1] & 0xFF);
            if ((this.field8890.field6363[arg2] & 0xFFFF) != var10) {
                throw new RuntimeException();
            }
            if (this.field8917[arg2] != 1) {
                this.field8899++;
                this.field8917[arg2] = 1;
            }
            if (!var4.field6953) {
                var4.method636((byte) 97);
            }
            return var4;
        } catch (Exception var17) {
            this.field8917[arg2] = -1;
            var4.method636((byte) 97);
            if (var4.field6953 && !this.field8907.method2937((byte) 56)) {
                class648 var11 = this.field8907.method2933(true, arg2, -513, (byte) 2, this.field8889);
                this.field8893.method3516(255, (long) arg2, var11);
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!me", name = "d", descriptor = "(B)V")
    public final void method3593(byte arg0) {
        field8896++;
        if (this.field8920 == null || this.method2700(true) == null) {
            return;
        }
        class65 var2 = this.field8921.method3463((byte) -50);
        if (arg0 != 1) {
            return;
        }
        while (var2 != null) {
            int var3 = (int) var2.field1039;
            if (var3 < 0 || var3 >= this.field8890.field6373 || this.field8890.field6360[var3] == 0) {
                var2.method636((byte) 97);
            } else {
                if (this.field8917[var3] == 0) {
                    this.method3592(1, 0, var3);
                }
                if (this.field8917[var3] == -1) {
                    this.method3592(2, 0, var3);
                }
                if (this.field8917[var3] == 1) {
                    var2.method636((byte) 97);
                }
            }
            var2 = this.field8921.method3469((byte) 107);
        }
    }

    @OriginalMember(owner = "client!me", name = "b", descriptor = "(II)I")
    public final int method2701(int arg0, int arg1) {
        field8915++;
        class482 var3 = (class482) this.field8893.method3512(true, (long) arg1);
        int var4 = -86 % ((42 - arg0) / 50);
        return var3 == null ? 0 : var3.method11((byte) 109);
    }

    @OriginalMember(owner = "client!me", name = "e", descriptor = "(I)V")
    public final void method3594(int arg0) {
        field8908++;
        if (this.field8920 != null) {
            if (this.method2700(true) == null) {
                return;
            }
            if (this.field8923) {
                boolean var2 = true;
                for (class65 var3 = this.field8920.method3463((byte) -50); var3 != null; var3 = this.field8920.method3469((byte) 107)) {
                    int var5 = (int) var3.field1039;
                    if (this.field8917[var5] == 0) {
                        this.method3592(1, 0, var5);
                    }
                    if (this.field8917[var5] == 0) {
                        var2 = false;
                    } else {
                        var3.method636((byte) 97);
                    }
                }
                while (this.field8918 < this.field8890.field6360.length) {
                    if (this.field8890.field6360[this.field8918] == 0) {
                        this.field8918++;
                    } else {
                        if (this.field8905.field10402 >= 250) {
                            var2 = false;
                            break;
                        }
                        if (this.field8917[this.field8918] == 0) {
                            this.method3592(1, 0, this.field8918);
                        }
                        if (this.field8917[this.field8918] == 0) {
                            class65 var4 = new class65();
                            var4.field1039 = this.field8918;
                            var2 = false;
                            this.field8920.method3472(108, var4);
                        }
                        this.field8918++;
                    }
                }
                if (var2) {
                    this.field8923 = false;
                    this.field8918 = 0;
                }
            } else if (this.field8919) {
                boolean var6 = true;
                for (class65 var7 = this.field8920.method3463((byte) -50); var7 != null; var7 = this.field8920.method3469((byte) 107)) {
                    int var9 = (int) var7.field1039;
                    if (this.field8917[var9] != 1) {
                        this.method3592(2, 0, var9);
                    }
                    if (this.field8917[var9] == 1) {
                        var7.method636((byte) 97);
                    } else {
                        var6 = false;
                    }
                }
                while (this.field8918 < this.field8890.field6360.length) {
                    if (this.field8890.field6360[this.field8918] == 0) {
                        this.field8918++;
                    } else {
                        if (this.field8907.method2935(-27554)) {
                            var6 = false;
                            break;
                        }
                        if (this.field8917[this.field8918] != 1) {
                            this.method3592(2, 0, this.field8918);
                        }
                        if (this.field8917[this.field8918] != 1) {
                            class65 var8 = new class65();
                            var8.field1039 = this.field8918;
                            var6 = false;
                            this.field8920.method3472(88, var8);
                        }
                        this.field8918++;
                    }
                }
                if (var6) {
                    this.field8919 = false;
                    this.field8918 = 0;
                }
            } else {
                this.field8920 = null;
            }
        }
        if (this.field8925 && class18.method109(-11121) >= this.field8924) {
            for (class482 var10 = (class482) this.field8893.method3508((byte) -97); var10 != null; var10 = (class482) this.field8893.method3520(-1)) {
                if (!var10.field6952) {
                    if (var10.field6954) {
                        if (!var10.field6953) {
                            throw new RuntimeException();
                        }
                        var10.method636((byte) 97);
                    } else {
                        var10.field6954 = true;
                    }
                }
            }
            this.field8924 = class18.method109(-11121) + 1000L;
        }
        if (arg0 <= 18) {
            this.field8909 = -105;
        }
    }

    @OriginalMember(owner = "client!me", name = "<init>", descriptor = "(ILid;Lid;Lrt;Lih;I[BIZ)V")
    public class634(int arg0, class463 arg1, class463 arg2, class485 arg3, class741 arg4, int arg5, byte[] arg6, int arg7, boolean arg8) {
        this.field8889 = arg0;
        this.field8891 = arg1;
        if (this.field8891 == null) {
            this.field8923 = false;
        } else {
            this.field8923 = true;
            this.field8920 = new class605();
        }
        this.field8912 = arg5;
        this.field8907 = arg3;
        this.field8911 = arg2;
        this.field8909 = arg7;
        this.field8925 = arg8;
        this.field8905 = arg4;
        this.field8900 = arg6;
        if (this.field8911 != null) {
            this.field8888 = this.field8905.method4150(this.field8889, this.field8911, -8351);
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!me", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method3595(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
