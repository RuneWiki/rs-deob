import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rj")
public class class258 extends class30 {

    @OriginalMember(owner = "client!rj", name = "v", descriptor = "I")
    private int field3911 = 0;

    @OriginalMember(owner = "client!rj", name = "x", descriptor = "Ltd;")
    private class192 field3913 = new class192(16);

    @OriginalMember(owner = "client!rj", name = "Q", descriptor = "I")
    private int field3932 = 0;

    @OriginalMember(owner = "client!rj", name = "S", descriptor = "Lom;")
    private class156 field3934 = new class156();

    @OriginalMember(owner = "client!rj", name = "W", descriptor = "J")
    private long field3938 = 0L;

    @OriginalMember(owner = "client!rj", name = "y", descriptor = "Log;")
    private class283 field3914;

    @OriginalMember(owner = "client!rj", name = "G", descriptor = "I")
    private int field3922;

    @OriginalMember(owner = "client!rj", name = "U", descriptor = "Z")
    private boolean field3936;

    @OriginalMember(owner = "client!rj", name = "T", descriptor = "Lom;")
    private class156 field3935;

    @OriginalMember(owner = "client!rj", name = "m", descriptor = "I")
    private int field3902;

    @OriginalMember(owner = "client!rj", name = "q", descriptor = "Ljd;")
    private class92 field3906;

    @OriginalMember(owner = "client!rj", name = "V", descriptor = "Z")
    private boolean field3937;

    @OriginalMember(owner = "client!rj", name = "O", descriptor = "I")
    private int field3930;

    @OriginalMember(owner = "client!rj", name = "D", descriptor = "Lrk;")
    private class16 field3919;

    @OriginalMember(owner = "client!rj", name = "A", descriptor = "Log;")
    private class283 field3916;

    @OriginalMember(owner = "client!rj", name = "o", descriptor = "Loc;")
    private class80 field3904;

    @OriginalMember(owner = "client!rj", name = "n", descriptor = "[I")
    public static int[] field3903 = new int[1000];

    @OriginalMember(owner = "client!rj", name = "k", descriptor = "[Ljava/lang/String;")
    public static String[] field3900 = null;

    @OriginalMember(owner = "client!rj", name = "z", descriptor = "Ljava/lang/String;")
    public static String field3915 = "Allocated memory";

    @OriginalMember(owner = "client!rj", name = "F", descriptor = "I")
    public static int field3921 = -1;

    @OriginalMember(owner = "client!rj", name = "l", descriptor = "I")
    public static int field3901;

    @OriginalMember(owner = "client!rj", name = "s", descriptor = "I")
    public static int field3908;

    @OriginalMember(owner = "client!rj", name = "t", descriptor = "I")
    public static int field3909;

    @OriginalMember(owner = "client!rj", name = "u", descriptor = "I")
    public static int field3910;

    @OriginalMember(owner = "client!rj", name = "w", descriptor = "I")
    public static int field3912;

    @OriginalMember(owner = "client!rj", name = "B", descriptor = "I")
    public static int field3917;

    @OriginalMember(owner = "client!rj", name = "C", descriptor = "I")
    public static int field3918;

    @OriginalMember(owner = "client!rj", name = "H", descriptor = "I")
    public static int field3923;

    @OriginalMember(owner = "client!rj", name = "I", descriptor = "I")
    public static int field3924;

    @OriginalMember(owner = "client!rj", name = "J", descriptor = "I")
    public static int field3925;

    @OriginalMember(owner = "client!rj", name = "K", descriptor = "I")
    public static int field3926;

    @OriginalMember(owner = "client!rj", name = "L", descriptor = "I")
    public static int field3927;

    @OriginalMember(owner = "client!rj", name = "M", descriptor = "I")
    public static int field3928;

    @OriginalMember(owner = "client!rj", name = "N", descriptor = "I")
    public static int field3929;

    @OriginalMember(owner = "client!rj", name = "P", descriptor = "I")
    public static int field3931;

    @OriginalMember(owner = "client!rj", name = "p", descriptor = "Ljb;")
    private class206 field3905;

    @OriginalMember(owner = "client!rj", name = "j", descriptor = "Lfa;")
    public static class95 field3899;

    @OriginalMember(owner = "client!rj", name = "R", descriptor = "Z")
    private boolean field3933;

    @OriginalMember(owner = "client!rj", name = "r", descriptor = "[B")
    private byte[] field3907;

    @OriginalMember(owner = "client!rj", name = "E", descriptor = "[I")
    public static int[] field3920;

    @OriginalMember(owner = "client!rj", name = "b", descriptor = "(I)[F", line = 15)
    public static final float[] method1748(int arg0) {
        field3928++;
        if (arg0 >= -60) {
            return (float[]) null;
        }
        float var1 = class280.method1953() + class280.method1950();
        int var2 = class280.method1956();
        class66.field856[3] = 1.0F;
        float var3 = (float) ((var2 & 0xFF5025) >> 16) / 255.0F;
        float var4 = 0.58823526F;
        float var5 = (float) ((var2 & 0xFFDD) >> 8) / 255.0F;
        class66.field856[1] = class151.field2275[1] * var5 * var4 * var1;
        class66.field856[0] = class151.field2275[0] * var3 * var4 * var1;
        float var6 = (float) (var2 & 0xFF) / 255.0F;
        class66.field856[2] = class151.field2275[2] * var6 * var4 * var1;
        return class66.field856;
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(B)I", line = 43)
    public final int method1749(byte arg0) {
        field3917++;
        if (arg0 != -120) {
            method1757((byte) 21);
        }
        return this.field3905 == null ? 0 : this.field3905.field3117;
    }

    @OriginalMember(owner = "client!rj", name = "c", descriptor = "(I)V", line = 59)
    public final void method1750(int arg0) {
        field3927++;
        if (this.field3914 == null) {
            return;
        }
        this.field3933 = true;
        if (this.field3935 == null) {
            this.field3935 = new class156();
        }
        if (arg0 != 1700) {
            this.method1749((byte) 98);
        }
    }

    @OriginalMember(owner = "client!rj", name = "b", descriptor = "(B)I", line = 76)
    public final int method1751(byte arg0) {
        if (arg0 <= 55) {
            this.method1756((byte) 55);
        }
        field3912++;
        return this.field3911;
    }

    @OriginalMember(owner = "client!rj", name = "<init>", descriptor = "(ILog;Log;Ljd;Lrk;IIZ)V", line = 7073)
    public class258(int arg0, class283 arg1, class283 arg2, class92 arg3, class16 arg4, int arg5, int arg6, boolean arg7) {
        this.field3914 = arg1;
        this.field3922 = arg0;
        if (this.field3914 == null) {
            this.field3936 = false;
        } else {
            this.field3936 = true;
            this.field3935 = new class156();
        }
        this.field3902 = arg6;
        this.field3906 = arg3;
        this.field3937 = arg7;
        this.field3930 = arg5;
        this.field3919 = arg4;
        this.field3916 = arg2;
        if (this.field3916 != null) {
            this.field3904 = this.field3919.method103(this.field3922, -121, this.field3916);
        }
    }

    @OriginalMember(owner = "client!rj", name = "c", descriptor = "(B)I", line = 112)
    public final int method1752(byte arg0) {
        if (arg0 < 65) {
            this.field3919 = (class16) null;
        }
        field3908++;
        if (this.field3905 == null) {
            return 0;
        } else if (this.field3936) {
            class101 var2 = this.field3935.method1109(57);
            return var2 == null ? 0 : (int) var2.field1603;
        } else {
            return this.field3905.field3117;
        }
    }

    @OriginalMember(owner = "client!rj", name = "d", descriptor = "(B)I", line = 143)
    public final int method1753(byte arg0) {
        field3909++;
        if (this.method191(false) == null) {
            return this.field3904 == null ? 0 : this.field3904.method76((byte) -62);
        } else {
            if (arg0 > -71) {
                this.field3907 = (byte[]) null;
            }
            return 100;
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(III)Loc;", line = 165)
    private final class80 method1754(int arg0, int arg1, int arg2) {
        field3929++;
        class80 var4 = (class80) this.field3913.method1320((long) arg1, 13002);
        if (var4 != null && arg2 == 0 && !var4.field1135 && var4.field1129) {
            var4.method714(98);
            var4 = null;
        }
        if (arg0 >= -92) {
            this.method1751((byte) -50);
        }
        if (var4 == null) {
            if (arg2 == 0) {
                if (this.field3914 == null || this.field3907[arg1] == -1) {
                    if (this.field3906.method651((byte) 90)) {
                        return null;
                    }
                    var4 = this.field3906.method647(arg1, true, (byte) 2, this.field3922, 1321879792);
                } else {
                    var4 = this.field3919.method103(arg1, -122, this.field3914);
                }
            } else if (arg2 == 1) {
                if (this.field3914 == null) {
                    throw new RuntimeException();
                }
                var4 = this.field3919.method99(this.field3914, arg1, 22414);
            } else if (arg2 == 2) {
                if (this.field3914 == null) {
                    throw new RuntimeException();
                }
                if (this.field3907[arg1] != -1) {
                    throw new RuntimeException();
                }
                if (this.field3906.method645(61)) {
                    return null;
                }
                var4 = this.field3906.method647(arg1, false, (byte) 2, this.field3922, 1321879792);
            } else {
                throw new RuntimeException();
            }
            this.field3913.method1319(-62, (long) arg1, var4);
        }
        if (var4.field1129) {
            return null;
        }
        byte[] var5 = var4.method75(954);
        if (!var4 instanceof class13) {
            try {
                if (var5 == null || var5.length <= 2) {
                    throw new RuntimeException();
                }
                class51.field632.reset();
                class51.field632.update(var5, 0, var5.length - 2);
                int var10 = (int) class51.field632.getValue();
                if (this.field3905.field3125[arg1] != var10) {
                    throw new RuntimeException();
                }
                this.field3906.field1391 = 0;
                this.field3906.field1393 = 0;
            } catch (RuntimeException var14) {
                this.field3906.method658((byte) 100);
                var4.method714(-78);
                if (var4.field1135 && !this.field3906.method651((byte) 108)) {
                    class93 var12 = this.field3906.method647(arg1, true, (byte) 2, this.field3922, 1321879792);
                    this.field3913.method1319(92, (long) arg1, var12);
                }
                return null;
            }
            var5[var5.length - 2] = (byte) (this.field3905.field3116[arg1] >>> 8);
            var5[var5.length - 1] = (byte) this.field3905.field3116[arg1];
            if (this.field3914 != null) {
                this.field3919.method102(arg1, (byte) -51, this.field3914, var5);
                if (this.field3907[arg1] != 1) {
                    this.field3911++;
                    this.field3907[arg1] = 1;
                }
            }
            if (!var4.field1135) {
                var4.method714(-114);
            }
            return var4;
        }
        try {
            if (var5 == null || var5.length <= 2) {
                throw new RuntimeException();
            }
            class51.field632.reset();
            class51.field632.update(var5, 0, var5.length - 2);
            int var6 = (int) class51.field632.getValue();
            if (this.field3905.field3125[arg1] != var6) {
                throw new RuntimeException();
            }
            int var7 = ((var5[var5.length - 2] & 0xFF) << 8) + (var5[var5.length - 1] & 0xFF);
            if ((this.field3905.field3116[arg1] & 0xFFFF) != var7) {
                throw new RuntimeException();
            }
            if (this.field3907[arg1] != 1) {
                if (this.field3907[arg1] != 0) {
                }
                this.field3911++;
                this.field3907[arg1] = 1;
            }
            if (!var4.field1135) {
                var4.method714(-81);
            }
            return var4;
        } catch (Exception var13) {
            this.field3907[arg1] = -1;
            var4.method714(106);
            if (var4.field1135 && !this.field3906.method651((byte) 112)) {
                class93 var9 = this.field3906.method647(arg1, true, (byte) 2, this.field3922, 1321879792);
                this.field3913.method1319(-74, (long) arg1, var9);
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!rj", name = "c", descriptor = "(II)I", line = 381)
    public final int method194(int arg0, int arg1) {
        field3926++;
        if (arg0 == -3701) {
            class80 var3 = (class80) this.field3913.method1320((long) arg1, 13002);
            return var3 == null ? 0 : var3.method76((byte) -87);
        } else {
            return 97;
        }
    }

    @OriginalMember(owner = "client!rj", name = "b", descriptor = "(Z)V", line = 398)
    public final void method1755(boolean arg0) {
        field3925++;
        if (!arg0) {
            this.method195(-52, -33);
        }
        if (this.field3935 != null) {
            if (this.method191(false) == null) {
                return;
            }
            if (this.field3936) {
                boolean var6 = true;
                for (class101 var7 = this.field3935.method1109(60); var7 != null; var7 = this.field3935.method1115((byte) 104)) {
                    int var8 = (int) var7.field1603;
                    if (this.field3907[var8] == 0) {
                        this.method1754(-127, var8, 1);
                    }
                    if (this.field3907[var8] == 0) {
                        var6 = false;
                    } else {
                        var7.method714(115);
                    }
                }
                while (this.field3905.field3119.length > this.field3932) {
                    if (this.field3905.field3119[this.field3932] == 0) {
                        this.field3932++;
                    } else {
                        if (this.field3919.field190 >= 250) {
                            var6 = false;
                            break;
                        }
                        if (this.field3907[this.field3932] == 0) {
                            this.method1754(-108, this.field3932, 1);
                        }
                        if (this.field3907[this.field3932] == 0) {
                            class101 var9 = new class101();
                            var6 = false;
                            var9.field1603 = (long) this.field3932;
                            this.field3935.method1108(var9, 65280);
                        }
                        this.field3932++;
                    }
                }
                if (var6) {
                    this.field3932 = 0;
                    this.field3936 = false;
                }
            } else if (this.field3933) {
                boolean var2 = true;
                for (class101 var3 = this.field3935.method1109(-128); var3 != null; var3 = this.field3935.method1115((byte) 118)) {
                    int var4 = (int) var3.field1603;
                    if (this.field3907[var4] != 1) {
                        this.method1754(-104, var4, 2);
                    }
                    if (this.field3907[var4] == 1) {
                        var3.method714(123);
                    } else {
                        var2 = false;
                    }
                }
                while (this.field3905.field3119.length > this.field3932) {
                    if (this.field3905.field3119[this.field3932] == 0) {
                        this.field3932++;
                    } else {
                        if (this.field3906.method645(99)) {
                            var2 = false;
                            break;
                        }
                        if (this.field3907[this.field3932] != 1) {
                            this.method1754(-100, this.field3932, 2);
                        }
                        if (this.field3907[this.field3932] != 1) {
                            var2 = false;
                            class101 var5 = new class101();
                            var5.field1603 = (long) this.field3932;
                            this.field3935.method1108(var5, 65280);
                        }
                        this.field3932++;
                    }
                }
                if (var2) {
                    this.field3933 = false;
                    this.field3932 = 0;
                }
            } else {
                this.field3935 = null;
            }
        }
        if (!this.field3937 || class231.method1594(-20375) < this.field3938) {
            return;
        }
        for (class80 var10 = (class80) this.field3913.method1321((byte) -109); var10 != null; var10 = (class80) this.field3913.method1330((byte) -90)) {
            if (!var10.field1129) {
                if (var10.field1128) {
                    if (!var10.field1135) {
                        throw new RuntimeException();
                    }
                    var10.method714(-55);
                } else {
                    var10.field1128 = true;
                }
            }
        }
        this.field3938 = class231.method1594(-20375) + 1000L;
    }

    @OriginalMember(owner = "client!rj", name = "e", descriptor = "(II)V", line = 580)
    public final void method199(int arg0, int arg1) {
        field3910++;
        if (this.field3914 == null || arg0 != 3332) {
            return;
        }
        for (class101 var3 = this.field3934.method1109(-98); var3 != null; var3 = this.field3934.method1115((byte) 63)) {
            if ((long) arg1 == var3.field1603) {
                return;
            }
        }
        class101 var4 = new class101();
        var4.field1603 = (long) arg1;
        this.field3934.method1108(var4, 65280);
    }

    @OriginalMember(owner = "client!rj", name = "e", descriptor = "(B)V", line = 609)
    public final void method1756(byte arg0) {
        field3923++;
        if (this.field3935 == null || this.method191(false) == null || arg0 != -90) {
            return;
        }
        for (class101 var2 = this.field3934.method1109(22); var2 != null; var2 = this.field3934.method1115((byte) 73)) {
            int var3 = (int) var2.field1603;
            if (var3 < 0 || this.field3905.field3123 <= var3 || this.field3905.field3119[var3] == 0) {
                var2.method714(94);
            } else {
                if (this.field3907[var3] == 0) {
                    this.method1754(-113, var3, 1);
                }
                if (this.field3907[var3] == -1) {
                    this.method1754(-104, var3, 2);
                }
                if (this.field3907[var3] == 1) {
                    var2.method714(-122);
                }
            }
        }
    }

    @OriginalMember(owner = "client!rj", name = "f", descriptor = "(B)V", line = 658)
    public static void method1757(byte arg0) {
        field3903 = null;
        if (arg0 == -10) {
            field3915 = null;
            field3899 = null;
            field3920 = null;
            field3900 = null;
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(IILlm;)Lea;", line = 673)
    public static final class235 method1758(int arg0, int arg1, class210 arg2) {
        if (arg1 == -2001) {
            field3931++;
            return class329.method2245(arg0, arg2, 63) ? class189.method1288(14897) : null;
        } else {
            return (class235) null;
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(Z)Ljb;", line = 687)
    public final class206 method191(boolean arg0) {
        field3901++;
        if (this.field3905 != null) {
            return this.field3905;
        }
        if (this.field3904 == null) {
            if (this.field3906.method651((byte) 75)) {
                return null;
            }
            this.field3904 = this.field3906.method647(this.field3922, true, (byte) 0, 255, 1321879792);
        }
        if (arg0) {
            return (class206) null;
        } else if (this.field3904.field1129) {
            return null;
        } else {
            byte[] var2 = this.field3904.method75(954);
            if (this.field3904 instanceof class13) {
                try {
                    if (var2 == null) {
                        throw new RuntimeException();
                    }
                    this.field3905 = new class206(var2, this.field3930);
                    if (this.field3905.field3121 != this.field3902) {
                        throw new RuntimeException();
                    }
                } catch (RuntimeException var5) {
                    this.field3905 = null;
                    if (this.field3906.method651((byte) 122)) {
                        this.field3904 = null;
                    } else {
                        this.field3904 = this.field3906.method647(this.field3922, true, (byte) 0, 255, 1321879792);
                    }
                    return null;
                }
            } else {
                try {
                    if (var2 == null) {
                        throw new RuntimeException();
                    }
                    this.field3905 = new class206(var2, this.field3930);
                } catch (RuntimeException var6) {
                    this.field3906.method658((byte) 103);
                    this.field3905 = null;
                    if (this.field3906.method651((byte) 81)) {
                        this.field3904 = null;
                    } else {
                        this.field3904 = this.field3906.method647(this.field3922, true, (byte) 0, 255, 1321879792);
                    }
                    return null;
                }
                if (this.field3916 != null) {
                    this.field3919.method102(this.field3922, (byte) -51, this.field3916, var2);
                }
            }
            this.field3904 = null;
            if (this.field3914 != null) {
                this.field3911 = 0;
                this.field3907 = new byte[this.field3905.field3123];
            }
            return this.field3905;
        }
    }

    @OriginalMember(owner = "client!rj", name = "d", descriptor = "(II)[B", line = 786)
    public final byte[] method195(int arg0, int arg1) {
        field3918++;
        class80 var3 = this.method1754(-108, arg1, 0);
        if (var3 == null) {
            return null;
        }
        if (arg0 != 5072) {
            this.field3916 = (class283) null;
        }
        byte[] var4 = var3.method75(954);
        var3.method714(-126);
        return var4;
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(ILfh;I)V", line = 806)
    public static final void method1759(int arg0, class286 arg1, int arg2) {
        field3924++;
        Object[] var3 = arg1.field4310;
        int var4 = (Integer) var3[0];
        class141 var5 = class58.method384(var4, (byte) -104);
        if (var5 == null) {
            return;
        }
        class145.field2193 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = -1;
        int[] var9 = var5.field2132;
        if (arg2 != 2778) {
            field3915 = (String) null;
        }
        int[] var10 = var5.field2138;
        byte var11 = -1;
        try {
            class192.field2885 = new String[var5.field2125];
            class169.field2544 = new int[var5.field2136];
            int var12 = 0;
            int var13 = 0;
            for (int var14 = 1; var14 < var3.length; var14++) {
                if (var3[var14] instanceof Integer) {
                    int var15 = (Integer) var3[var14];
                    if (var15 == -2147483647) {
                        var15 = arg1.field4329;
                    }
                    if (var15 == -2147483646) {
                        var15 = arg1.field4327;
                    }
                    if (var15 == -2147483645) {
                        var15 = arg1.field4330 == null ? -1 : arg1.field4330.field5086;
                    }
                    if (var15 == -2147483644) {
                        var15 = arg1.field4321;
                    }
                    if (var15 == -2147483643) {
                        var15 = arg1.field4330 == null ? -1 : arg1.field4330.field5040;
                    }
                    if (var15 == -2147483642) {
                        var15 = arg1.field4312 == null ? -1 : arg1.field4312.field5086;
                    }
                    if (var15 == -2147483641) {
                        var15 = arg1.field4312 == null ? -1 : arg1.field4312.field5040;
                    }
                    if (var15 == -2147483640) {
                        var15 = arg1.field4326;
                    }
                    if (var15 == -2147483639) {
                        var15 = arg1.field4320;
                    }
                    class169.field2544[var12++] = var15;
                } else if (var3[var14] instanceof String) {
                    String var16 = (String) var3[var14];
                    if (var16.equals("event_opbase")) {
                        var16 = arg1.field4317;
                    }
                    class192.field2885[var13++] = var16;
                }
            }
            int var17 = 0;
            label4261: while (true) {
                var17++;
                if (arg0 < var17) {
                    throw new RuntimeException("slow");
                }
                var8++;
                int var506 = var9[var8];
                if (var506 < 100) {
                    if (var506 == 0) {
                        class309.field4706[var6++] = var10[var8];
                        continue;
                    }
                    if (var506 == 1) {
                        int var18 = var10[var8];
                        class309.field4706[var6++] = class185.field2763[var18];
                        continue;
                    }
                    if (var506 == 2) {
                        int var19 = var10[var8];
                        var6--;
                        class292.method2044(var19, class309.field4706[var6], true);
                        continue;
                    }
                    if (var506 == 3) {
                        class198.field2978[var7++] = var5.field2128[var8];
                        continue;
                    }
                    if (var506 == 6) {
                        var8 += var10[var8];
                        continue;
                    }
                    if (var506 == 7) {
                        var6 -= 2;
                        if (class309.field4706[var6 + 1] != class309.field4706[var6]) {
                            var8 += var10[var8];
                        }
                        continue;
                    }
                    if (var506 == 8) {
                        var6 -= 2;
                        if (class309.field4706[var6 + 1] == class309.field4706[var6]) {
                            var8 += var10[var8];
                        }
                        continue;
                    }
                    if (var506 == 9) {
                        var6 -= 2;
                        if (class309.field4706[var6 + 1] > class309.field4706[var6]) {
                            var8 += var10[var8];
                        }
                        continue;
                    }
                    if (var506 == 10) {
                        var6 -= 2;
                        if (class309.field4706[var6] > class309.field4706[var6 + 1]) {
                            var8 += var10[var8];
                        }
                        continue;
                    }
                    if (var506 == 21) {
                        if (class145.field2193 == 0) {
                            return;
                        }
                        class20 var20 = class221.field3362[--class145.field2193];
                        var8 = var20.field241;
                        var5 = var20.field235;
                        var10 = var5.field2138;
                        class169.field2544 = var20.field236;
                        class192.field2885 = var20.field233;
                        var9 = var5.field2132;
                        continue;
                    }
                    if (var506 == 25) {
                        int var21 = var10[var8];
                        class309.field4706[var6++] = class310.method2144(1, var21);
                        continue;
                    }
                    if (var506 == 27) {
                        int var22 = var10[var8];
                        var6--;
                        class145.method1038(class309.field4706[var6], var22, (byte) -127);
                        continue;
                    }
                    if (var506 == 31) {
                        var6 -= 2;
                        if (class309.field4706[var6] <= class309.field4706[var6 + 1]) {
                            var8 += var10[var8];
                        }
                        continue;
                    }
                    if (var506 == 32) {
                        var6 -= 2;
                        if (class309.field4706[var6 + 1] <= class309.field4706[var6]) {
                            var8 += var10[var8];
                        }
                        continue;
                    }
                    if (var506 == 33) {
                        class309.field4706[var6++] = class169.field2544[var10[var8]];
                        continue;
                    }
                    int var10001;
                    if (var506 == 34) {
                        var10001 = var10[var8];
                        var6--;
                        class169.field2544[var10001] = class309.field4706[var6];
                        continue;
                    }
                    if (var506 == 35) {
                        class198.field2978[var7++] = class192.field2885[var10[var8]];
                        continue;
                    }
                    if (var506 == 36) {
                        var10001 = var10[var8];
                        var7--;
                        class192.field2885[var10001] = class198.field2978[var7];
                        continue;
                    }
                    if (var506 == 37) {
                        int var23 = var10[var8];
                        var7 -= var23;
                        String var24 = class189.method1295((byte) 88, class198.field2978, var23, var7);
                        class198.field2978[var7++] = var24;
                        continue;
                    }
                    if (var506 == 38) {
                        var6--;
                        continue;
                    }
                    if (var506 == 39) {
                        var7--;
                        continue;
                    }
                    if (var506 == 40) {
                        int var25 = var10[var8];
                        class141 var26 = class58.method384(var25, (byte) -116);
                        String[] var27 = new String[var26.field2125];
                        int[] var28 = new int[var26.field2136];
                        for (int var29 = 0; var29 < var26.field2139; var29++) {
                            var28[var29] = class309.field4706[var6 + var29 - var26.field2139];
                        }
                        for (int var30 = 0; var30 < var26.field2130; var30++) {
                            var27[var30] = class198.field2978[var7 + var30 - var26.field2130];
                        }
                        var7 -= var26.field2130;
                        var6 -= var26.field2139;
                        class20 var31 = new class20();
                        var31.field241 = var8;
                        var31.field233 = class192.field2885;
                        var31.field236 = class169.field2544;
                        var31.field235 = var5;
                        if (class145.field2193 >= class221.field3362.length) {
                            throw new RuntimeException();
                        }
                        class221.field3362[class145.field2193++] = var31;
                        var5 = var26;
                        class192.field2885 = var27;
                        var9 = var26.field2132;
                        class169.field2544 = var28;
                        var10 = var26.field2138;
                        var8 = -1;
                        continue;
                    }
                    if (var506 == 42) {
                        class309.field4706[var6++] = class157.field2349[var10[var8]];
                        continue;
                    }
                    if (var506 == 43) {
                        int var32 = var10[var8];
                        var6--;
                        class157.field2349[var32] = class309.field4706[var6];
                        class188.method1287(arg2 + 427110130, var32);
                        continue;
                    }
                    if (var506 == 44) {
                        int var33 = var10[var8] & 0xFFFF;
                        int var34 = var10[var8] >> 16;
                        var6--;
                        int var35 = class309.field4706[var6];
                        if (var35 >= 0 && var35 <= 5000) {
                            byte var36 = -1;
                            if (var33 == 105) {
                                var36 = 0;
                            }
                            class253.field3794[var34] = var35;
                            int var37 = 0;
                            while (true) {
                                if (var37 >= var35) {
                                    continue label4261;
                                }
                                class82.field1157[var34][var37] = var36;
                                var37++;
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (var506 == 45) {
                        int var38 = var10[var8];
                        var6--;
                        int var39 = class309.field4706[var6];
                        if (var39 >= 0 && class253.field3794[var38] > var39) {
                            class309.field4706[var6++] = class82.field1157[var38][var39];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var506 == 46) {
                        var6 -= 2;
                        int var40 = class309.field4706[var6];
                        int var41 = var10[var8];
                        if (var40 >= 0 && var40 < class253.field3794[var41]) {
                            class82.field1157[var41][var40] = class309.field4706[var6 + 1];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var506 == 47) {
                        String var42 = class314.field4756[var10[var8]];
                        if (var42 == null) {
                            var42 = "null";
                        }
                        class198.field2978[var7++] = var42;
                        continue;
                    }
                    if (var506 == 48) {
                        int var43 = var10[var8];
                        var7--;
                        class314.field4756[var43] = class198.field2978[var7];
                        class38.method263((byte) -67, var43);
                        continue;
                    }
                    if (var506 == 51) {
                        class192 var44 = var5.field2124[var10[var8]];
                        var6--;
                        class261 var45 = (class261) var44.method1320((long) class309.field4706[var6], 13002);
                        if (var45 != null) {
                            var8 += var45.field3954;
                        }
                        continue;
                    }
                }
                boolean var46;
                if (var10[var8] == 1) {
                    var46 = true;
                } else {
                    var46 = false;
                }
                if (var506 < 300) {
                    if (var506 == 100) {
                        var6 -= 3;
                        int var486 = class309.field4706[var6];
                        int var487 = class309.field4706[var6 + 1];
                        int var488 = class309.field4706[var6 + 2];
                        if (var487 == 0) {
                            throw new RuntimeException();
                        }
                        class329 var489 = class80.method541((byte) 96, var486);
                        if (var489.field4964 == null) {
                            var489.field4964 = new class329[var488 + 1];
                        }
                        if (var488 >= var489.field4964.length) {
                            class329[] var490 = new class329[var488 + 1];
                            for (int var491 = 0; var491 < var489.field4964.length; var491++) {
                                var490[var491] = var489.field4964[var491];
                            }
                            var489.field4964 = var490;
                        }
                        if (var488 > 0 && var489.field4964[var488 - 1] == null) {
                            throw new RuntimeException("Gap at:" + (var488 - 1));
                        }
                        class329 var492 = new class329();
                        var492.field5066 = var487;
                        var492.field5091 = var492.field5086 = var489.field5086;
                        var492.field5040 = var488;
                        var492.field5022 = true;
                        var489.field4964[var488] = var492;
                        if (var46) {
                            class61.field800 = var492;
                        } else {
                            class245.field3657 = var492;
                        }
                        class247.method1666(var489, -126);
                        continue;
                    }
                    if (var506 == 101) {
                        class329 var493 = var46 ? class61.field800 : class245.field3657;
                        if (var493.field5040 == -1) {
                            if (!var46) {
                                throw new RuntimeException("Tried to cc_delete static active-component!");
                            }
                            throw new RuntimeException("Tried to .cc_delete static .active-component!");
                        }
                        class329 var494 = class80.method541((byte) 96, var493.field5086);
                        var494.field4964[var493.field5040] = null;
                        class247.method1666(var494, -124);
                        continue;
                    }
                    if (var506 == 102) {
                        var6--;
                        class329 var495 = class80.method541((byte) 96, class309.field4706[var6]);
                        var495.field4964 = null;
                        class247.method1666(var495, arg2 ^ 0xFFFFF558);
                        continue;
                    }
                    if (var506 == 200) {
                        var6 -= 2;
                        int var496 = class309.field4706[var6];
                        int var497 = class309.field4706[var6 + 1];
                        class329 var498 = class10.method48(var497, var496, (byte) -55);
                        if (var498 != null && var497 != -1) {
                            class309.field4706[var6++] = 1;
                            if (var46) {
                                class61.field800 = var498;
                            } else {
                                class245.field3657 = var498;
                            }
                            continue;
                        }
                        class309.field4706[var6++] = 0;
                        continue;
                    }
                    if (var506 == 201) {
                        var6--;
                        int var499 = class309.field4706[var6];
                        class329 var500 = class80.method541((byte) 96, var499);
                        if (var500 == null) {
                            class309.field4706[var6++] = 0;
                        } else {
                            class309.field4706[var6++] = 1;
                            if (var46) {
                                class61.field800 = var500;
                            } else {
                                class245.field3657 = var500;
                            }
                        }
                        continue;
                    }
                } else if (var506 < 500) {
                    if (var506 == 403) {
                        var6 -= 2;
                        int var47 = class309.field4706[var6];
                        int var48 = class309.field4706[var6 + 1];
                        for (int var49 = 0; var49 < class82.field1154.length; var49++) {
                            if (class82.field1154[var49] == var47) {
                                class114.field1750.field2912.method1732(var48, -8180, var49);
                                continue label4261;
                            }
                        }
                        int var50 = 0;
                        while (true) {
                            if (var50 >= class286.field4314.length) {
                                continue label4261;
                            }
                            if (class286.field4314[var50] == var47) {
                                class114.field1750.field2912.method1732(var48, -8180, var50);
                                continue label4261;
                            }
                            var50++;
                        }
                    }
                    if (var506 == 404) {
                        var6 -= 2;
                        int var51 = class309.field4706[var6];
                        int var52 = class309.field4706[var6 + 1];
                        class114.field1750.field2912.method1725(109, var52, var51);
                        continue;
                    }
                    if (var506 == 410) {
                        var6--;
                        boolean var53 = class309.field4706[var6] != 0;
                        class114.field1750.field2912.method1730(var53, (byte) 58);
                        continue;
                    }
                } else if (!(var506 < 1000 || var506 >= 1100) || !(var506 < 2000 || var506 >= 2100)) {
                    class329 var54;
                    if (var506 >= 2000) {
                        var6--;
                        var54 = class80.method541((byte) 96, class309.field4706[var6]);
                        var506 -= 1000;
                    } else {
                        var54 = var46 ? class61.field800 : class245.field3657;
                    }
                    if (var506 == 1000) {
                        var6 -= 4;
                        var54.field4998 = class309.field4706[var6];
                        var54.field5042 = class309.field4706[var6 + 1];
                        int var55 = class309.field4706[var6 + 3];
                        if (var55 < 0) {
                            var55 = 0;
                        } else if (var55 > 5) {
                            var55 = 5;
                        }
                        int var56 = class309.field4706[var6 + 2];
                        var54.field5057 = (byte) var55;
                        if (var56 < 0) {
                            var56 = 0;
                        } else if (var56 > 5) {
                            var56 = 5;
                        }
                        var54.field5067 = (byte) var56;
                        class247.method1666(var54, -125);
                        class210.method1462((byte) 62, var54);
                        if (var54.field5040 == -1) {
                            class123.method891(var54.field5086, -128);
                        }
                        continue;
                    }
                    if (var506 == 1001) {
                        var6 -= 4;
                        var54.field4971 = class309.field4706[var6];
                        var54.field4946 = class309.field4706[var6 + 1];
                        var54.field5007 = 0;
                        var54.field5079 = 0;
                        int var57 = class309.field4706[var6 + 2];
                        if (var57 < 0) {
                            var57 = 0;
                        } else if (var57 > 4) {
                            var57 = 4;
                        }
                        int var58 = class309.field4706[var6 + 3];
                        var54.field4944 = (byte) var57;
                        if (var58 < 0) {
                            var58 = 0;
                        } else if (var58 > 4) {
                            var58 = 4;
                        }
                        var54.field4930 = (byte) var58;
                        class247.method1666(var54, -127);
                        class210.method1462((byte) 62, var54);
                        if (var54.field5066 == 0) {
                            class67.method444(var54, false, -1245723888);
                        }
                        continue;
                    }
                    if (var506 == 1003) {
                        var6--;
                        boolean var59 = class309.field4706[var6] == 1;
                        if (var59 != var54.field5026) {
                            var54.field5026 = var59;
                            class247.method1666(var54, -124);
                        }
                        if (var54.field5040 == -1) {
                            class200.method1366(77, var54.field5086);
                        }
                        continue;
                    }
                    if (var506 == 1004) {
                        var6 -= 2;
                        var54.field5025 = class309.field4706[var6];
                        var54.field5031 = class309.field4706[var6 + 1];
                        class247.method1666(var54, -127);
                        class210.method1462((byte) 62, var54);
                        if (var54.field5066 == 0) {
                            class67.method444(var54, false, arg2 ^ 0xB5BFC9CA);
                        }
                        continue;
                    }
                    if (var506 == 1005) {
                        var6--;
                        var54.field4951 = class309.field4706[var6] == 1;
                        continue;
                    }
                } else if (!(var506 < 1100 || var506 >= 1200) || !(var506 < 2100 || var506 >= 2200)) {
                    class329 var60;
                    if (var506 < 2000) {
                        var60 = var46 ? class61.field800 : class245.field3657;
                    } else {
                        var506 -= 1000;
                        var6--;
                        var60 = class80.method541((byte) 96, class309.field4706[var6]);
                    }
                    if (var506 == 1100) {
                        var6 -= 2;
                        var60.field5093 = class309.field4706[var6];
                        if (var60.field5034 - var60.field5018 < var60.field5093) {
                            var60.field5093 = var60.field5034 - var60.field5018;
                        }
                        if (var60.field5093 < 0) {
                            var60.field5093 = 0;
                        }
                        var60.field5023 = class309.field4706[var6 + 1];
                        if (var60.field4932 - var60.field4994 < var60.field5023) {
                            var60.field5023 = var60.field4932 - var60.field4994;
                        }
                        if (var60.field5023 < 0) {
                            var60.field5023 = 0;
                        }
                        class247.method1666(var60, -126);
                        if (var60.field5040 == -1) {
                            class82.method545(var60.field5086, arg2 - 2779);
                        }
                        continue;
                    }
                    if (var506 == 1101) {
                        var6--;
                        var60.field4935 = class309.field4706[var6];
                        class247.method1666(var60, -127);
                        if (var60.field5040 == -1) {
                            class285.method1983(true, var60.field5086);
                        }
                        continue;
                    }
                    if (var506 == 1102) {
                        var6--;
                        var60.field5009 = class309.field4706[var6] == 1;
                        class247.method1666(var60, -128);
                        continue;
                    }
                    if (var506 == 1103) {
                        var6--;
                        var60.field4956 = class309.field4706[var6];
                        class247.method1666(var60, -128);
                        continue;
                    }
                    if (var506 == 1104) {
                        var6--;
                        var60.field5096 = class309.field4706[var6];
                        class247.method1666(var60, -128);
                        continue;
                    }
                    if (var506 == 1105) {
                        var6--;
                        var60.field5050 = class309.field4706[var6];
                        class247.method1666(var60, arg2 - 2905);
                        continue;
                    }
                    if (var506 == 1106) {
                        var6--;
                        var60.field5015 = class309.field4706[var6];
                        class247.method1666(var60, -128);
                        continue;
                    }
                    if (var506 == 1107) {
                        var6--;
                        var60.field5095 = class309.field4706[var6] == 1;
                        class247.method1666(var60, arg2 - 2903);
                        continue;
                    }
                    if (var506 == 1108) {
                        var60.field4937 = 1;
                        var6--;
                        var60.field4939 = class309.field4706[var6];
                        class247.method1666(var60, -126);
                        if (var60.field5040 == -1) {
                            class274.method1931((byte) -126, var60.field5086);
                        }
                        continue;
                    }
                    if (var506 == 1109) {
                        var6 -= 6;
                        var60.field4997 = class309.field4706[var6];
                        var60.field5099 = class309.field4706[var6 + 1];
                        var60.field5097 = class309.field4706[var6 + 2];
                        var60.field4961 = class309.field4706[var6 + 3];
                        var60.field5084 = class309.field4706[var6 + 4];
                        var60.field5041 = class309.field4706[var6 + 5];
                        class247.method1666(var60, -125);
                        if (var60.field5040 == -1) {
                            class38.method259(30435, var60.field5086);
                            class94.method665(105, var60.field5086);
                        }
                        continue;
                    }
                    if (var506 == 1110) {
                        var6--;
                        int var61 = class309.field4706[var6];
                        if (var60.field4958 != var61) {
                            var60.field5059 = 0;
                            var60.field4986 = 0;
                            var60.field4958 = var61;
                            var60.field4970 = 1;
                            class247.method1666(var60, -124);
                        }
                        if (var60.field5040 == -1) {
                            class23.method159((byte) 127, var60.field5086);
                        }
                        continue;
                    }
                    if (var506 == 1111) {
                        var6--;
                        var60.field4975 = class309.field4706[var6] == 1;
                        class247.method1666(var60, arg2 ^ 0xFFFFF558);
                        continue;
                    }
                    if (var506 == 1112) {
                        var7--;
                        String var62 = class198.field2978[var7];
                        if (!var62.equals(var60.field5035)) {
                            var60.field5035 = var62;
                            class247.method1666(var60, -126);
                        }
                        if (var60.field5040 == -1) {
                            class316.method2164(var60.field5086, 3);
                        }
                        continue;
                    }
                    if (var506 == 1113) {
                        var6--;
                        var60.field5076 = class309.field4706[var6];
                        class247.method1666(var60, -124);
                        continue;
                    }
                    if (var506 == 1114) {
                        var6 -= 3;
                        var60.field4983 = class309.field4706[var6];
                        var60.field4952 = class309.field4706[var6 + 1];
                        var60.field5071 = class309.field4706[var6 + 2];
                        class247.method1666(var60, -124);
                        continue;
                    }
                    if (var506 == 1115) {
                        var6--;
                        var60.field5039 = class309.field4706[var6] == 1;
                        class247.method1666(var60, -126);
                        continue;
                    }
                    if (var506 == 1116) {
                        var6--;
                        var60.field5056 = class309.field4706[var6];
                        class247.method1666(var60, -124);
                        continue;
                    }
                    if (var506 == 1117) {
                        var6--;
                        var60.field5043 = class309.field4706[var6];
                        class247.method1666(var60, -125);
                        continue;
                    }
                    if (var506 == 1118) {
                        var6--;
                        var60.field4973 = class309.field4706[var6] == 1;
                        class247.method1666(var60, -125);
                        continue;
                    }
                    if (var506 == 1119) {
                        var6--;
                        var60.field5055 = class309.field4706[var6] == 1;
                        class247.method1666(var60, -126);
                        continue;
                    }
                    if (var506 == 1120) {
                        var6 -= 2;
                        var60.field5034 = class309.field4706[var6];
                        var60.field4932 = class309.field4706[var6 + 1];
                        class247.method1666(var60, -126);
                        if (var60.field5066 == 0) {
                            class67.method444(var60, false, arg2 ^ 0xB5BFC9CA);
                        }
                        continue;
                    }
                    if (var506 == 1121) {
                        var6 -= 2;
                        var60.field5085 = (short) class309.field4706[var6];
                        var60.field4991 = (short) class309.field4706[var6 + 1];
                        class247.method1666(var60, arg2 - 2902);
                        continue;
                    }
                    if (var506 == 1122) {
                        var6--;
                        var60.field5072 = class309.field4706[var6] == 1;
                        class247.method1666(var60, arg2 - 2905);
                        continue;
                    }
                    if (var506 == 1123) {
                        var6--;
                        var60.field5041 = class309.field4706[var6];
                        class247.method1666(var60, -127);
                        if (var60.field5040 == -1) {
                            class38.method259(30435, var60.field5086);
                        }
                        continue;
                    }
                } else if (var506 >= 1200 && var506 < 1300 || var506 >= 2200 && var506 < 2300) {
                    class329 var482;
                    if (var506 >= 2000) {
                        var6--;
                        var482 = class80.method541((byte) 96, class309.field4706[var6]);
                        var506 -= 1000;
                    } else {
                        var482 = var46 ? class61.field800 : class245.field3657;
                    }
                    class247.method1666(var482, -128);
                    if (var506 == 1200 || var506 == 1205) {
                        var6 -= 2;
                        int var483 = class309.field4706[var6];
                        int var484 = class309.field4706[var6 + 1];
                        if (var482.field5040 == -1) {
                            class54.method356(var482.field5086, arg2 - 2769);
                            class38.method259(30435, var482.field5086);
                            class94.method665(arg2 ^ 0xFFFFF54F, var482.field5086);
                        }
                        if (var483 == -1) {
                            var482.field4937 = 1;
                            var482.field4939 = -1;
                            var482.field5089 = -1;
                        } else {
                            var482.field5045 = var484;
                            var482.field5089 = var483;
                            class253 var485 = class325.method2219(var483, -9379);
                            if (var506 == 1205) {
                                var482.field5065 = false;
                            } else {
                                var482.field5065 = true;
                            }
                            var482.field5084 = var485.field3828;
                            var482.field4997 = var485.field3825;
                            var482.field5041 = var485.field3810;
                            var482.field5097 = var485.field3809;
                            var482.field4961 = var485.field3838;
                            var482.field5099 = var485.field3827;
                            if (var482.field5079 > 0) {
                                var482.field5041 = var482.field5041 * 32 / var482.field5079;
                            } else if (var482.field4971 > 0) {
                                var482.field5041 = var482.field5041 * 32 / var482.field4971;
                            }
                        }
                        continue;
                    }
                    if (var506 == 1201) {
                        var482.field4937 = 2;
                        var6--;
                        var482.field4939 = class309.field4706[var6];
                        if (var482.field5040 == -1) {
                            class274.method1931((byte) -128, var482.field5086);
                        }
                        continue;
                    }
                    if (var506 == 1202) {
                        var482.field4937 = 3;
                        var482.field4939 = class114.field1750.field2912.method1731((byte) -116);
                        if (var482.field5040 == -1) {
                            class274.method1931((byte) -116, var482.field5086);
                        }
                        continue;
                    }
                    if (var506 == 1203) {
                        var482.field4937 = 6;
                        var6--;
                        var482.field4939 = class309.field4706[var6];
                        if (var482.field5040 == -1) {
                            class274.method1931((byte) -116, var482.field5086);
                        }
                        continue;
                    }
                    if (var506 == 1204) {
                        var482.field4937 = 5;
                        var6--;
                        var482.field4939 = class309.field4706[var6];
                        if (var482.field5040 == -1) {
                            class274.method1931((byte) -125, var482.field5086);
                        }
                        continue;
                    }
                } else if ((var506 < 1300 || var506 >= 1400) && (var506 < 2300 || var506 >= 2400)) {
                    if (var506 >= 1400 && var506 < 1500 || var506 >= 2400 && var506 < 2500) {
                        class329 var475;
                        if (var506 < 2000) {
                            var475 = var46 ? class61.field800 : class245.field3657;
                        } else {
                            var506 -= 1000;
                            var6--;
                            var475 = class80.method541((byte) 96, class309.field4706[var6]);
                        }
                        var7--;
                        String var476 = class198.field2978[var7];
                        int[] var477 = null;
                        if (var476.length() > 0 && var476.charAt(var476.length() - 1) == 'Y') {
                            var6--;
                            int var478 = class309.field4706[var6];
                            if (var478 > 0) {
                                var477 = new int[var478];
                                while ((var478--) > 0) {
                                    var6--;
                                    var477[var478] = class309.field4706[var6];
                                }
                            }
                            var476 = var476.substring(0, var476.length() - 1);
                        }
                        Object[] var479 = new Object[var476.length() + 1];
                        for (int var480 = var479.length - 1; var480 >= 1; var480--) {
                            if (var476.charAt(var480 - 1) == 's') {
                                var7--;
                                var479[var480] = class198.field2978[var7];
                            } else {
                                var6--;
                                var479[var480] = Integer.valueOf(class309.field4706[var6]);
                            }
                        }
                        var6--;
                        int var481 = class309.field4706[var6];
                        if (var481 == -1) {
                            var479 = null;
                        } else {
                            var479[0] = Integer.valueOf(var481);
                        }
                        if (var506 == 1400) {
                            var475.field5030 = var479;
                        } else if (var506 == 1401) {
                            var475.field4968 = var479;
                        } else if (var506 == 1402) {
                            var475.field5010 = var479;
                        } else if (var506 == 1403) {
                            var475.field5061 = var479;
                        } else if (var506 == 1404) {
                            var475.field5080 = var479;
                        } else if (var506 == 1405) {
                            var475.field5070 = var479;
                        } else if (var506 == 1406) {
                            var475.field4963 = var479;
                        } else if (var506 == 1407) {
                            var475.field4947 = var479;
                            var475.field5060 = var477;
                        } else if (var506 == 1408) {
                            var475.field5073 = var479;
                        } else if (var506 == 1409) {
                            var475.field4978 = var479;
                        } else if (var506 == 1410) {
                            var475.field4934 = var479;
                        } else if (var506 == 1411) {
                            var475.field5020 = var479;
                        } else if (var506 == 1412) {
                            var475.field5100 = var479;
                        } else if (var506 == 1414) {
                            var475.field4977 = var477;
                            var475.field4931 = var479;
                        } else if (var506 == 1415) {
                            var475.field5098 = var477;
                            var475.field4927 = var479;
                        } else if (var506 == 1416) {
                            var475.field4969 = var479;
                        } else if (var506 == 1417) {
                            var475.field4933 = var479;
                        } else if (var506 == 1418) {
                            var475.field5053 = var479;
                        } else if (var506 == 1419) {
                            var475.field5037 = var479;
                        } else if (var506 == 1420) {
                            var475.field5005 = var479;
                        } else if (var506 == 1421) {
                            var475.field4954 = var479;
                        } else if (var506 == 1422) {
                            var475.field4967 = var479;
                        } else if (var506 == 1423) {
                            var475.field4981 = var479;
                        } else if (var506 == 1424) {
                            var475.field4990 = var479;
                        } else if (var506 == 1425) {
                            var475.field5090 = var479;
                        } else if (var506 == 1426) {
                            var475.field4949 = var479;
                        } else if (var506 == 1427) {
                            var475.field4987 = var479;
                        } else if (var506 == 1428) {
                            var475.field4974 = var479;
                            var475.field5048 = var477;
                        } else if (var506 == 1429) {
                            var475.field4959 = var479;
                            var475.field4941 = var477;
                        }
                        var475.field5000 = true;
                        continue;
                    }
                    if (var506 < 1600) {
                        class329 var474 = var46 ? class61.field800 : class245.field3657;
                        if (var506 == 1500) {
                            class309.field4706[var6++] = var474.field4929;
                            continue;
                        }
                        if (var506 == 1501) {
                            class309.field4706[var6++] = var474.field4962;
                            continue;
                        }
                        if (var506 == 1502) {
                            class309.field4706[var6++] = var474.field5018;
                            continue;
                        }
                        if (var506 == 1503) {
                            class309.field4706[var6++] = var474.field4994;
                            continue;
                        }
                        if (var506 == 1504) {
                            class309.field4706[var6++] = var474.field5026 ? 1 : 0;
                            continue;
                        }
                        if (var506 == 1505) {
                            class309.field4706[var6++] = var474.field5091;
                            continue;
                        }
                    } else if (var506 < 1700) {
                        class329 var69 = var46 ? class61.field800 : class245.field3657;
                        if (var506 == 1600) {
                            class309.field4706[var6++] = var69.field5093;
                            continue;
                        }
                        if (var506 == 1601) {
                            class309.field4706[var6++] = var69.field5023;
                            continue;
                        }
                        if (var506 == 1602) {
                            class198.field2978[var7++] = var69.field5035;
                            continue;
                        }
                        if (var506 == 1603) {
                            class309.field4706[var6++] = var69.field5034;
                            continue;
                        }
                        if (var506 == 1604) {
                            class309.field4706[var6++] = var69.field4932;
                            continue;
                        }
                        if (var506 == 1605) {
                            class309.field4706[var6++] = var69.field5041;
                            continue;
                        }
                        if (var506 == 1606) {
                            class309.field4706[var6++] = var69.field5097;
                            continue;
                        }
                        if (var506 == 1607) {
                            class309.field4706[var6++] = var69.field5084;
                            continue;
                        }
                        if (var506 == 1608) {
                            class309.field4706[var6++] = var69.field4961;
                            continue;
                        }
                        if (var506 == 1609) {
                            class309.field4706[var6++] = var69.field4956;
                            continue;
                        }
                        if (var506 == 1610) {
                            class309.field4706[var6++] = var69.field4997;
                            continue;
                        }
                        if (var506 == 1611) {
                            class309.field4706[var6++] = var69.field5099;
                            continue;
                        }
                        if (var506 == 1612) {
                            class309.field4706[var6++] = var69.field5050;
                            continue;
                        }
                    } else if (var506 < 1800) {
                        class329 var70 = var46 ? class61.field800 : class245.field3657;
                        if (var506 == 1700) {
                            class309.field4706[var6++] = var70.field5089;
                            continue;
                        }
                        if (var506 == 1701) {
                            if (var70.field5089 == -1) {
                                class309.field4706[var6++] = 0;
                            } else {
                                class309.field4706[var6++] = var70.field5045;
                            }
                            continue;
                        }
                        if (var506 == 1702) {
                            class309.field4706[var6++] = var70.field5040;
                            continue;
                        }
                    } else if (var506 < 1900) {
                        class329 var71 = var46 ? class61.field800 : class245.field3657;
                        if (var506 == 1800) {
                            class309.field4706[var6++] = client.method902(var71).method138((byte) 77);
                            continue;
                        }
                        if (var506 == 1801) {
                            var6--;
                            int var72 = class309.field4706[var6];
                            int var507 = var72 - 1;
                            if (var71.field4942 != null && var507 < var71.field4942.length && var71.field4942[var507] != null) {
                                class198.field2978[var7++] = var71.field4942[var507];
                                continue;
                            }
                            class198.field2978[var7++] = "";
                            continue;
                        }
                        if (var506 == 1802) {
                            if (var71.field4992 == null) {
                                class198.field2978[var7++] = "";
                            } else {
                                class198.field2978[var7++] = var71.field4992;
                            }
                            continue;
                        }
                    } else if (var506 < 2600) {
                        var6--;
                        class329 var73 = class80.method541((byte) 96, class309.field4706[var6]);
                        if (var506 == 2500) {
                            class309.field4706[var6++] = var73.field4929;
                            continue;
                        }
                        if (var506 == 2501) {
                            class309.field4706[var6++] = var73.field4962;
                            continue;
                        }
                        if (var506 == 2502) {
                            class309.field4706[var6++] = var73.field5018;
                            continue;
                        }
                        if (var506 == 2503) {
                            class309.field4706[var6++] = var73.field4994;
                            continue;
                        }
                        if (var506 == 2504) {
                            class309.field4706[var6++] = var73.field5026 ? 1 : 0;
                            continue;
                        }
                        if (var506 == 2505) {
                            class309.field4706[var6++] = var73.field5091;
                            continue;
                        }
                    } else if (var506 < 2700) {
                        var6--;
                        class329 var473 = class80.method541((byte) 96, class309.field4706[var6]);
                        if (var506 == 2600) {
                            class309.field4706[var6++] = var473.field5093;
                            continue;
                        }
                        if (var506 == 2601) {
                            class309.field4706[var6++] = var473.field5023;
                            continue;
                        }
                        if (var506 == 2602) {
                            class198.field2978[var7++] = var473.field5035;
                            continue;
                        }
                        if (var506 == 2603) {
                            class309.field4706[var6++] = var473.field5034;
                            continue;
                        }
                        if (var506 == 2604) {
                            class309.field4706[var6++] = var473.field4932;
                            continue;
                        }
                        if (var506 == 2605) {
                            class309.field4706[var6++] = var473.field5041;
                            continue;
                        }
                        if (var506 == 2606) {
                            class309.field4706[var6++] = var473.field5097;
                            continue;
                        }
                        if (var506 == 2607) {
                            class309.field4706[var6++] = var473.field5084;
                            continue;
                        }
                        if (var506 == 2608) {
                            class309.field4706[var6++] = var473.field4961;
                            continue;
                        }
                        if (var506 == 2609) {
                            class309.field4706[var6++] = var473.field4956;
                            continue;
                        }
                        if (var506 == 2610) {
                            class309.field4706[var6++] = var473.field4997;
                            continue;
                        }
                        if (var506 == 2611) {
                            class309.field4706[var6++] = var473.field5099;
                            continue;
                        }
                        if (var506 == 2612) {
                            class309.field4706[var6++] = var473.field5050;
                            continue;
                        }
                    } else if (var506 < 2800) {
                        if (var506 == 2700) {
                            var6--;
                            class329 var74 = class80.method541((byte) 96, class309.field4706[var6]);
                            class309.field4706[var6++] = var74.field5089;
                            continue;
                        }
                        if (var506 == 2701) {
                            var6--;
                            class329 var75 = class80.method541((byte) 96, class309.field4706[var6]);
                            if (var75.field5089 == -1) {
                                class309.field4706[var6++] = 0;
                            } else {
                                class309.field4706[var6++] = var75.field5045;
                            }
                            continue;
                        }
                        if (var506 == 2702) {
                            var6--;
                            int var76 = class309.field4706[var6];
                            class167 var77 = (class167) class295.field4522.method1320((long) var76, 13002);
                            if (var77 == null) {
                                class309.field4706[var6++] = 0;
                            } else {
                                class309.field4706[var6++] = 1;
                            }
                            continue;
                        }
                        if (var506 == 2703) {
                            var6--;
                            class329 var78 = class80.method541((byte) 96, class309.field4706[var6]);
                            if (var78.field4964 == null) {
                                class309.field4706[var6++] = 0;
                                continue;
                            }
                            int var79 = var78.field4964.length;
                            for (int var80 = 0; var80 < var78.field4964.length; var80++) {
                                if (var78.field4964[var80] == null) {
                                    var79 = var80;
                                    break;
                                }
                            }
                            class309.field4706[var6++] = var79;
                            continue;
                        }
                        if (var506 == 2704 || var506 == 2705) {
                            var6 -= 2;
                            int var81 = class309.field4706[var6];
                            int var82 = class309.field4706[var6 + 1];
                            class167 var83 = (class167) class295.field4522.method1320((long) var81, 13002);
                            if (var83 != null && var83.field2505 == var82) {
                                class309.field4706[var6++] = 1;
                            } else {
                                class309.field4706[var6++] = 0;
                            }
                            continue;
                        }
                    } else if (var506 < 2900) {
                        var6--;
                        class329 var471 = class80.method541((byte) 96, class309.field4706[var6]);
                        if (var506 == 2800) {
                            class309.field4706[var6++] = client.method902(var471).method138((byte) 81);
                            continue;
                        }
                        if (var506 == 2801) {
                            var6--;
                            int var472 = class309.field4706[var6];
                            int var508 = var472 - 1;
                            if (var471.field4942 != null && var508 < var471.field4942.length && var471.field4942[var508] != null) {
                                class198.field2978[var7++] = var471.field4942[var508];
                                continue;
                            }
                            class198.field2978[var7++] = "";
                            continue;
                        }
                        if (var506 == 2802) {
                            if (var471.field4992 == null) {
                                class198.field2978[var7++] = "";
                            } else {
                                class198.field2978[var7++] = var471.field4992;
                            }
                            continue;
                        }
                    } else if (var506 < 3200) {
                        if (var506 == 3100) {
                            var7--;
                            String var456 = class198.field2978[var7];
                            class92.method656(0, var456, "", -1);
                            continue;
                        }
                        if (var506 == 3101) {
                            var6 -= 2;
                            class157.method1120((byte) -92, class114.field1750, class309.field4706[var6], class309.field4706[var6 + 1]);
                            continue;
                        }
                        if (var506 == 3103) {
                            class248.method1671((byte) 40);
                            continue;
                        }
                        if (var506 == 3104) {
                            class68.field901++;
                            int var457 = 0;
                            var7--;
                            String var458 = class198.field2978[var7];
                            if (class169.method1175(16, var458)) {
                                var457 = class286.method1991(arg2 - 2857, var458);
                            }
                            class234.field3507.method28(111, false);
                            class234.field3507.method1815(arg2 - 2688, var457);
                            continue;
                        }
                        if (var506 == 3105) {
                            class222.field3394++;
                            var7--;
                            String var459 = class198.field2978[var7];
                            class234.field3507.method28(254, false);
                            class234.field3507.method1816(class242.method1638(var459, -14393), 21054);
                            continue;
                        }
                        if (var506 == 3106) {
                            class29.field394++;
                            var7--;
                            String var460 = class198.field2978[var7];
                            class234.field3507.method28(124, false);
                            class234.field3507.method1813(arg2 - 2675, var460.length() + 1);
                            class234.field3507.method1825(var460, (byte) -91);
                            continue;
                        }
                        if (var506 == 3107) {
                            var7--;
                            String var461 = class198.field2978[var7];
                            var6--;
                            int var462 = class309.field4706[var6];
                            class79.method535(arg2 - 21148, var462, var461);
                            continue;
                        }
                        if (var506 == 3108) {
                            var6 -= 3;
                            int var463 = class309.field4706[var6];
                            int var464 = class309.field4706[var6 + 1];
                            int var465 = class309.field4706[var6 + 2];
                            class329 var466 = class80.method541((byte) 96, var465);
                            class204.method1405(var464, var463, var466, arg2 ^ 0x1B85);
                            continue;
                        }
                        if (var506 == 3109) {
                            class329 var467 = var46 ? class61.field800 : class245.field3657;
                            var6 -= 2;
                            int var468 = class309.field4706[var6];
                            int var469 = class309.field4706[var6 + 1];
                            class204.method1405(var469, var468, var467, 4447);
                            continue;
                        }
                        if (var506 == 3110) {
                            class304.field4628++;
                            var6--;
                            int var470 = class309.field4706[var6];
                            class234.field3507.method28(27, false);
                            class234.field3507.method1823(var470, (byte) -45);
                            continue;
                        }
                    } else if (var506 < 3300) {
                        if (var506 == 3200) {
                            var6 -= 3;
                            class154.method1103(class309.field4706[var6 + 1], class309.field4706[var6], arg2 - 2826, class309.field4706[var6 + 2]);
                            continue;
                        }
                        if (var506 == 3201) {
                            var6--;
                            class283.method1976(class309.field4706[var6], arg2 - 3219);
                            continue;
                        }
                        if (var506 == 3202) {
                            var6 -= 2;
                            class205.method1407(arg2 - 2652, class309.field4706[var6], class309.field4706[var6 + 1]);
                            continue;
                        }
                    } else if (var506 < 3400) {
                        if (var506 == 3300) {
                            class309.field4706[var6++] = class304.field4641;
                            continue;
                        }
                        if (var506 == 3301) {
                            var6 -= 2;
                            int var84 = class309.field4706[var6 + 1];
                            int var85 = class309.field4706[var6];
                            class309.field4706[var6++] = class21.method136(false, var85, var84);
                            continue;
                        }
                        if (var506 == 3302) {
                            var6 -= 2;
                            int var86 = class309.field4706[var6 + 1];
                            int var87 = class309.field4706[var6];
                            class309.field4706[var6++] = class268.method1888(var86, var87, -28);
                            continue;
                        }
                        if (var506 == 3303) {
                            var6 -= 2;
                            int var88 = class309.field4706[var6];
                            int var89 = class309.field4706[var6 + 1];
                            class309.field4706[var6++] = class78.method529(var89, false, var88);
                            continue;
                        }
                        if (var506 == 3304) {
                            var6--;
                            int var90 = class309.field4706[var6];
                            class309.field4706[var6++] = class242.method1642(class206.method1421(arg2, 21220), var90).field3878;
                            continue;
                        }
                        if (var506 == 3305) {
                            var6--;
                            int var91 = class309.field4706[var6];
                            class309.field4706[var6++] = class167.field2511[var91];
                            continue;
                        }
                        if (var506 == 3306) {
                            var6--;
                            int var92 = class309.field4706[var6];
                            class309.field4706[var6++] = class284.field4296[var92];
                            continue;
                        }
                        if (var506 == 3307) {
                            var6--;
                            int var93 = class309.field4706[var6];
                            class309.field4706[var6++] = class184.field2748[var93];
                            continue;
                        }
                        if (var506 == 3308) {
                            int var94 = (class114.field1750.field1566 >> 7) + class217.field3309;
                            int var95 = class180.field2697;
                            int var96 = (class114.field1750.field1505 >> 7) + class189.field2807;
                            class309.field4706[var6++] = (var94 << 14) + (var95 << 28) + var96;
                            continue;
                        }
                        if (var506 == 3309) {
                            var6--;
                            int var97 = class309.field4706[var6];
                            class309.field4706[var6++] = class124.method893(268419222, var97) >> 14;
                            continue;
                        }
                        if (var506 == 3310) {
                            var6--;
                            int var98 = class309.field4706[var6];
                            class309.field4706[var6++] = var98 >> 28;
                            continue;
                        }
                        if (var506 == 3311) {
                            var6--;
                            int var99 = class309.field4706[var6];
                            class309.field4706[var6++] = class124.method893(var99, 16383);
                            continue;
                        }
                        if (var506 == 3312) {
                            class309.field4706[var6++] = class36.field443 ? 1 : 0;
                            continue;
                        }
                        if (var506 == 3313) {
                            var6 -= 2;
                            int var100 = class309.field4706[var6 + 1];
                            int var101 = class309.field4706[var6] + 32768;
                            class309.field4706[var6++] = class21.method136(false, var101, var100);
                            continue;
                        }
                        if (var506 == 3314) {
                            var6 -= 2;
                            int var102 = class309.field4706[var6] + 32768;
                            int var103 = class309.field4706[var6 + 1];
                            class309.field4706[var6++] = class268.method1888(var103, var102, class206.method1421(arg2, -2704));
                            continue;
                        }
                        if (var506 == 3315) {
                            var6 -= 2;
                            int var104 = class309.field4706[var6] + 32768;
                            int var105 = class309.field4706[var6 + 1];
                            class309.field4706[var6++] = class78.method529(var105, false, var104);
                            continue;
                        }
                        if (var506 == 3316) {
                            if (class192.field2863 < 2) {
                                class309.field4706[var6++] = 0;
                            } else {
                                class309.field4706[var6++] = class192.field2863;
                            }
                            continue;
                        }
                        if (var506 == 3317) {
                            class309.field4706[var6++] = class321.field4856;
                            continue;
                        }
                        if (var506 == 3318) {
                            class309.field4706[var6++] = field3921;
                            continue;
                        }
                        if (var506 == 3321) {
                            class309.field4706[var6++] = class136.field2067;
                            continue;
                        }
                        if (var506 == 3322) {
                            class309.field4706[var6++] = class183.field2739;
                            continue;
                        }
                        if (var506 == 3323) {
                            if (class122.field1909 >= 5 && class122.field1909 <= 9) {
                                class309.field4706[var6++] = 1;
                                continue;
                            }
                            class309.field4706[var6++] = 0;
                            continue;
                        }
                        if (var506 == 3324) {
                            if (class122.field1909 >= 5 && class122.field1909 <= 9) {
                                class309.field4706[var6++] = class122.field1909;
                                continue;
                            }
                            class309.field4706[var6++] = 0;
                            continue;
                        }
                        if (var506 == 3325) {
                            class309.field4706[var6++] = class283.field4277 ? 1 : 0;
                            continue;
                        }
                        if (var506 == 3326) {
                            class309.field4706[var6++] = class114.field1750.field2927;
                            continue;
                        }
                        if (var506 == 3327) {
                            class309.field4706[var6++] = class114.field1750.field2912.field3867 ? 1 : 0;
                            continue;
                        }
                        if (var506 == 3328) {
                            class309.field4706[var6++] = class261.field3955 && !class70.field927 ? 1 : 0;
                            continue;
                        }
                        if (var506 == 3329) {
                            class309.field4706[var6++] = class154.field2311 ? 1 : 0;
                            continue;
                        }
                        if (var506 == 3330) {
                            var6--;
                            int var106 = class309.field4706[var6];
                            class309.field4706[var6++] = class221.method1550(0, var106);
                            continue;
                        }
                        if (var506 == 3331) {
                            var6 -= 2;
                            int var107 = class309.field4706[var6];
                            int var108 = class309.field4706[var6 + 1];
                            class309.field4706[var6++] = class91.method639(var108, var107, false, (byte) 65);
                            continue;
                        }
                        if (var506 == 3332) {
                            var6 -= 2;
                            int var109 = class309.field4706[var6];
                            int var110 = class309.field4706[var6 + 1];
                            class309.field4706[var6++] = class91.method639(var110, var109, true, (byte) 65);
                            continue;
                        }
                        if (var506 == 3333) {
                            class309.field4706[var6++] = class74.field966;
                            continue;
                        }
                        if (var506 == 3335) {
                            class309.field4706[var6++] = class256.field3882;
                            continue;
                        }
                        if (var506 == 3336) {
                            var6 -= 4;
                            int var111 = class309.field4706[var6];
                            int var112 = class309.field4706[var6 + 1];
                            int var113 = (var112 << 14) + var111;
                            int var114 = class309.field4706[var6 + 2];
                            int var115 = class309.field4706[var6 + 3];
                            int var116 = (var114 << 28) + var113;
                            int var117 = var115 + var116;
                            class309.field4706[var6++] = var117;
                            continue;
                        }
                        if (var506 == 3337) {
                            class309.field4706[var6++] = class5.field24;
                            continue;
                        }
                    } else if (var506 < 3500) {
                        if (var506 == 3400) {
                            var6 -= 2;
                            int var439 = class309.field4706[var6];
                            int var440 = class309.field4706[var6 + 1];
                            class270 var441 = class206.method1414((byte) 112, var439);
                            if (var441.field4137 != 's') {
                            }
                            class198.field2978[var7++] = var441.method1897(true, var440);
                            continue;
                        }
                        if (var506 == 3408) {
                            var6 -= 4;
                            int var442 = class309.field4706[var6 + 1];
                            int var443 = class309.field4706[var6];
                            int var444 = class309.field4706[var6 + 2];
                            int var445 = class309.field4706[var6 + 3];
                            class270 var446 = class206.method1414((byte) 100, var444);
                            if (var446.field4133 == var443 && var446.field4137 == var442) {
                                if (var442 == 115) {
                                    class198.field2978[var7++] = var446.method1897(true, var445);
                                } else {
                                    class309.field4706[var6++] = var446.method1902(class206.method1421(arg2, 2778), var445);
                                }
                                continue;
                            }
                            throw new RuntimeException("C3408-1");
                        }
                        if (var506 == 3409) {
                            var6 -= 3;
                            int var447 = class309.field4706[var6];
                            int var448 = class309.field4706[var6 + 1];
                            int var449 = class309.field4706[var6 + 2];
                            if (var448 == -1) {
                                throw new RuntimeException("C3409-2");
                            }
                            class270 var450 = class206.method1414((byte) 106, var448);
                            if (var450.field4137 != var447) {
                                throw new RuntimeException("C3409-1");
                            }
                            class309.field4706[var6++] = var450.method1898(6, var449) ? 1 : 0;
                            continue;
                        }
                        if (var506 == 3410) {
                            var6--;
                            int var451 = class309.field4706[var6];
                            var7--;
                            String var452 = class198.field2978[var7];
                            if (var451 == -1) {
                                throw new RuntimeException("C3410-2");
                            }
                            class270 var453 = class206.method1414((byte) 92, var451);
                            if (var453.field4137 != 's') {
                                throw new RuntimeException("C3410-1");
                            }
                            class309.field4706[var6++] = var453.method1899(var452, -6) ? 1 : 0;
                            continue;
                        }
                        if (var506 == 3411) {
                            var6--;
                            int var454 = class309.field4706[var6];
                            class270 var455 = class206.method1414((byte) 126, var454);
                            class309.field4706[var6++] = var455.field4129.method1328(2);
                            continue;
                        }
                    } else if (var506 < 3700) {
                        if (var506 == 3600) {
                            if (class311.field4731 == 0) {
                                class309.field4706[var6++] = -2;
                            } else if (class311.field4731 == 1) {
                                class309.field4706[var6++] = -1;
                            } else {
                                class309.field4706[var6++] = class193.field2892;
                            }
                            continue;
                        }
                        if (var506 == 3601) {
                            var6--;
                            int var417 = class309.field4706[var6];
                            if (class311.field4731 == 2 && class193.field2892 > var417) {
                                class198.field2978[var7++] = class156.field2347[var417];
                                continue;
                            }
                            class198.field2978[var7++] = "";
                            continue;
                        }
                        if (var506 == 3602) {
                            var6--;
                            int var418 = class309.field4706[var6];
                            if (class311.field4731 == 2 && var418 < class193.field2892) {
                                class309.field4706[var6++] = class255.field3872[var418];
                                continue;
                            }
                            class309.field4706[var6++] = 0;
                            continue;
                        }
                        if (var506 == 3603) {
                            var6--;
                            int var419 = class309.field4706[var6];
                            if (class311.field4731 == 2 && class193.field2892 > var419) {
                                class309.field4706[var6++] = class63.field831[var419];
                                continue;
                            }
                            class309.field4706[var6++] = 0;
                            continue;
                        }
                        if (var506 == 3604) {
                            var7--;
                            String var420 = class198.field2978[var7];
                            var6--;
                            int var421 = class309.field4706[var6];
                            class57.method375(-8, var420, var421);
                            continue;
                        }
                        if (var506 == 3605) {
                            var7--;
                            String var422 = class198.field2978[var7];
                            class270.method1907(arg2 - 2784, class242.method1638(var422, -14393));
                            continue;
                        }
                        if (var506 == 3606) {
                            var7--;
                            String var423 = class198.field2978[var7];
                            class6.method15(class242.method1638(var423, -14393), arg2 - 2709);
                            continue;
                        }
                        if (var506 == 3607) {
                            var7--;
                            String var424 = class198.field2978[var7];
                            class66.method438(121, class242.method1638(var424, -14393));
                            continue;
                        }
                        if (var506 == 3608) {
                            var7--;
                            String var425 = class198.field2978[var7];
                            class42.method279(class242.method1638(var425, arg2 ^ 0xFFFFCD1D), false);
                            continue;
                        }
                        if (var506 == 3609) {
                            var7--;
                            String var426 = class198.field2978[var7];
                            if (var426.startsWith("<img=0>") || var426.startsWith("<img=1>")) {
                                var426 = var426.substring(7);
                            }
                            class309.field4706[var6++] = class297.method2073((byte) -87, var426) ? 1 : 0;
                            continue;
                        }
                        if (var506 == 3610) {
                            var6--;
                            int var427 = class309.field4706[var6];
                            if (class311.field4731 == 2 && class193.field2892 > var427) {
                                class198.field2978[var7++] = class17.field196[var427];
                                continue;
                            }
                            class198.field2978[var7++] = "";
                            continue;
                        }
                        if (var506 == 3611) {
                            if (class286.field4325 == null) {
                                class198.field2978[var7++] = "";
                            } else {
                                class198.field2978[var7++] = class246.method1658(class286.field4325, -128);
                            }
                            continue;
                        }
                        if (var506 == 3612) {
                            if (class286.field4325 == null) {
                                class309.field4706[var6++] = 0;
                            } else {
                                class309.field4706[var6++] = class281.field4264;
                            }
                            continue;
                        }
                        if (var506 == 3613) {
                            var6--;
                            int var428 = class309.field4706[var6];
                            if (class286.field4325 != null && var428 < class281.field4264) {
                                class198.field2978[var7++] = class246.method1658(class125.field1964[var428].field792, -128);
                                continue;
                            }
                            class198.field2978[var7++] = "";
                            continue;
                        }
                        if (var506 == 3614) {
                            var6--;
                            int var429 = class309.field4706[var6];
                            if (class286.field4325 != null && var429 < class281.field4264) {
                                class309.field4706[var6++] = class125.field1964[var429].field794;
                                continue;
                            }
                            class309.field4706[var6++] = 0;
                            continue;
                        }
                        if (var506 == 3615) {
                            var6--;
                            int var430 = class309.field4706[var6];
                            if (class286.field4325 != null && class281.field4264 > var430) {
                                class309.field4706[var6++] = class125.field1964[var430].field791;
                                continue;
                            }
                            class309.field4706[var6++] = 0;
                            continue;
                        }
                        if (var506 == 3616) {
                            class309.field4706[var6++] = class295.field4521;
                            continue;
                        }
                        if (var506 == 3617) {
                            var7--;
                            String var431 = class198.field2978[var7];
                            class138.method1003(var431, 42);
                            continue;
                        }
                        if (var506 == 3618) {
                            class309.field4706[var6++] = class206.field3118;
                            continue;
                        }
                        if (var506 == 3619) {
                            var7--;
                            String var432 = class198.field2978[var7];
                            class285.method1988(class242.method1638(var432, -14393), false);
                            continue;
                        }
                        if (var506 == 3620) {
                            class160.method1132(false);
                            continue;
                        }
                        if (var506 == 3621) {
                            if (class311.field4731 == 0) {
                                class309.field4706[var6++] = -1;
                            } else {
                                class309.field4706[var6++] = class247.field3687;
                            }
                            continue;
                        }
                        if (var506 == 3622) {
                            var6--;
                            int var433 = class309.field4706[var6];
                            if (class311.field4731 != 0 && var433 < class247.field3687) {
                                class198.field2978[var7++] = class194.method1337(class212.field3220[var433], 1);
                                continue;
                            }
                            class198.field2978[var7++] = "";
                            continue;
                        }
                        if (var506 == 3623) {
                            var7--;
                            String var434 = class198.field2978[var7];
                            if (var434.startsWith("<img=0>") || var434.startsWith("<img=1>")) {
                                var434 = var434.substring(7);
                            }
                            class309.field4706[var6++] = class224.method1560(0, var434) ? 1 : 0;
                            continue;
                        }
                        if (var506 == 3624) {
                            var6--;
                            int var435 = class309.field4706[var6];
                            if (class125.field1964 != null && class281.field4264 > var435 && class125.field1964[var435].field792.equalsIgnoreCase(class114.field1750.field2934)) {
                                class309.field4706[var6++] = 1;
                                continue;
                            }
                            class309.field4706[var6++] = 0;
                            continue;
                        }
                        if (var506 == 3625) {
                            if (class26.field367 == null) {
                                class198.field2978[var7++] = "";
                            } else {
                                class198.field2978[var7++] = class246.method1658(class26.field367, arg2 - 2906);
                            }
                            continue;
                        }
                        if (var506 == 3626) {
                            var6--;
                            int var436 = class309.field4706[var6];
                            if (class286.field4325 != null && var436 < class281.field4264) {
                                class198.field2978[var7++] = class125.field1964[var436].field793;
                                continue;
                            }
                            class198.field2978[var7++] = "";
                            continue;
                        }
                        if (var506 == 3627) {
                            var6--;
                            int var437 = class309.field4706[var6];
                            if (class311.field4731 == 2 && var437 >= 0 && class193.field2892 > var437) {
                                class309.field4706[var6++] = class120.field1891[var437] ? 1 : 0;
                                continue;
                            }
                            class309.field4706[var6++] = 0;
                            continue;
                        }
                        if (var506 == 3628) {
                            var7--;
                            String var438 = class198.field2978[var7];
                            if (var438.startsWith("<img=0>") || var438.startsWith("<img=1>")) {
                                var438 = var438.substring(7);
                            }
                            class309.field4706[var6++] = class35.method246(var438, class206.method1421(arg2, -2692));
                            continue;
                        }
                        if (var506 == 3629) {
                            class309.field4706[var6++] = class9.field78;
                            continue;
                        }
                    } else if (var506 < 4000) {
                        if (var506 == 3903) {
                            var6--;
                            int var403 = class309.field4706[var6];
                            class309.field4706[var6++] = class136.field2069[var403].method1863((byte) -65);
                            continue;
                        }
                        if (var506 == 3904) {
                            var6--;
                            int var404 = class309.field4706[var6];
                            class309.field4706[var6++] = class136.field2069[var404].field4052;
                            continue;
                        }
                        if (var506 == 3905) {
                            var6--;
                            int var405 = class309.field4706[var6];
                            class309.field4706[var6++] = class136.field2069[var405].field4048;
                            continue;
                        }
                        if (var506 == 3906) {
                            var6--;
                            int var406 = class309.field4706[var6];
                            class309.field4706[var6++] = class136.field2069[var406].field4051;
                            continue;
                        }
                        if (var506 == 3907) {
                            var6--;
                            int var407 = class309.field4706[var6];
                            class309.field4706[var6++] = class136.field2069[var407].field4053;
                            continue;
                        }
                        if (var506 == 3908) {
                            var6--;
                            int var408 = class309.field4706[var6];
                            class309.field4706[var6++] = class136.field2069[var408].field4054;
                            continue;
                        }
                        if (var506 == 3910) {
                            var6--;
                            int var409 = class309.field4706[var6];
                            int var410 = class136.field2069[var409].method1860((byte) 28);
                            class309.field4706[var6++] = var410 == 0 ? 1 : 0;
                            continue;
                        }
                        if (var506 == 3911) {
                            var6--;
                            int var411 = class309.field4706[var6];
                            int var412 = class136.field2069[var411].method1860((byte) 28);
                            class309.field4706[var6++] = var412 == 2 ? 1 : 0;
                            continue;
                        }
                        if (var506 == 3912) {
                            var6--;
                            int var413 = class309.field4706[var6];
                            int var414 = class136.field2069[var413].method1860((byte) 28);
                            class309.field4706[var6++] = var414 == 5 ? 1 : 0;
                            continue;
                        }
                        if (var506 == 3913) {
                            var6--;
                            int var415 = class309.field4706[var6];
                            int var416 = class136.field2069[var415].method1860((byte) 28);
                            class309.field4706[var6++] = var416 == 1 ? 1 : 0;
                            continue;
                        }
                    } else if (var506 < 4100) {
                        if (var506 == 4000) {
                            var6 -= 2;
                            int var118 = class309.field4706[var6];
                            int var119 = class309.field4706[var6 + 1];
                            class309.field4706[var6++] = var118 + var119;
                            continue;
                        }
                        if (var506 == 4001) {
                            var6 -= 2;
                            int var120 = class309.field4706[var6];
                            int var121 = class309.field4706[var6 + 1];
                            class309.field4706[var6++] = var120 - var121;
                            continue;
                        }
                        if (var506 == 4002) {
                            var6 -= 2;
                            int var122 = class309.field4706[var6];
                            int var123 = class309.field4706[var6 + 1];
                            class309.field4706[var6++] = var122 * var123;
                            continue;
                        }
                        if (var506 == 4003) {
                            var6 -= 2;
                            int var124 = class309.field4706[var6];
                            int var125 = class309.field4706[var6 + 1];
                            class309.field4706[var6++] = var124 / var125;
                            continue;
                        }
                        if (var506 == 4004) {
                            var6--;
                            int var126 = class309.field4706[var6];
                            class309.field4706[var6++] = (int) (Math.random() * (double) var126);
                            continue;
                        }
                        if (var506 == 4005) {
                            var6--;
                            int var127 = class309.field4706[var6];
                            class309.field4706[var6++] = (int) (Math.random() * (double) (var127 + 1));
                            continue;
                        }
                        if (var506 == 4006) {
                            var6 -= 5;
                            int var128 = class309.field4706[var6];
                            int var129 = class309.field4706[var6 + 2];
                            int var130 = class309.field4706[var6 + 3];
                            int var131 = class309.field4706[var6 + 1];
                            int var132 = class309.field4706[var6 + 4];
                            class309.field4706[var6++] = (var131 - var128) * (var132 - var129) / (var130 - var129) + var128;
                            continue;
                        }
                        if (var506 == 4007) {
                            var6 -= 2;
                            long var133 = (long) class309.field4706[var6];
                            long var135 = (long) class309.field4706[var6 + 1];
                            class309.field4706[var6++] = (int) (var133 * var135 / 100L + var133);
                            continue;
                        }
                        if (var506 == 4008) {
                            var6 -= 2;
                            int var137 = class309.field4706[var6];
                            int var138 = class309.field4706[var6 + 1];
                            class309.field4706[var6++] = class140.method1009(var137, 0x1 << var138);
                            continue;
                        }
                        if (var506 == 4009) {
                            var6 -= 2;
                            int var139 = class309.field4706[var6 + 1];
                            int var140 = class309.field4706[var6];
                            class309.field4706[var6++] = class124.method893(-(0x1 << var139) - 1, var140);
                            continue;
                        }
                        if (var506 == 4010) {
                            var6 -= 2;
                            int var141 = class309.field4706[var6];
                            int var142 = class309.field4706[var6 + 1];
                            class309.field4706[var6++] = class124.method893(0x1 << var142, var141) == 0 ? 0 : 1;
                            continue;
                        }
                        if (var506 == 4011) {
                            var6 -= 2;
                            int var143 = class309.field4706[var6 + 1];
                            int var144 = class309.field4706[var6];
                            class309.field4706[var6++] = var144 % var143;
                            continue;
                        }
                        if (var506 == 4012) {
                            var6 -= 2;
                            int var145 = class309.field4706[var6];
                            int var146 = class309.field4706[var6 + 1];
                            if (var145 == 0) {
                                class309.field4706[var6++] = 0;
                            } else {
                                class309.field4706[var6++] = (int) Math.pow((double) var145, (double) var146);
                            }
                            continue;
                        }
                        if (var506 == 4013) {
                            var6 -= 2;
                            int var147 = class309.field4706[var6];
                            int var148 = class309.field4706[var6 + 1];
                            if (var147 == 0) {
                                class309.field4706[var6++] = 0;
                            } else if (var148 == 0) {
                                class309.field4706[var6++] = Integer.MAX_VALUE;
                            } else {
                                class309.field4706[var6++] = (int) Math.pow((double) var147, 1.0D / (double) var148);
                            }
                            continue;
                        }
                        if (var506 == 4014) {
                            var6 -= 2;
                            int var149 = class309.field4706[var6 + 1];
                            int var150 = class309.field4706[var6];
                            class309.field4706[var6++] = class124.method893(var150, var149);
                            continue;
                        }
                        if (var506 == 4015) {
                            var6 -= 2;
                            int var151 = class309.field4706[var6];
                            int var152 = class309.field4706[var6 + 1];
                            class309.field4706[var6++] = class140.method1009(var152, var151);
                            continue;
                        }
                        if (var506 == 4016) {
                            var6 -= 2;
                            int var153 = class309.field4706[var6];
                            int var154 = class309.field4706[var6 + 1];
                            class309.field4706[var6++] = var154 <= var153 ? var154 : var153;
                            continue;
                        }
                        if (var506 == 4017) {
                            var6 -= 2;
                            int var155 = class309.field4706[var6];
                            int var156 = class309.field4706[var6 + 1];
                            class309.field4706[var6++] = var155 > var156 ? var155 : var156;
                            continue;
                        }
                        if (var506 == 4018) {
                            var6 -= 3;
                            long var157 = (long) class309.field4706[var6 + 1];
                            long var159 = (long) class309.field4706[var6];
                            long var161 = (long) class309.field4706[var6 + 2];
                            class309.field4706[var6++] = (int) (var159 * var161 / var157);
                            continue;
                        }
                    } else if (var506 < 4200) {
                        if (var506 == 4100) {
                            var7--;
                            String var163 = class198.field2978[var7];
                            var6--;
                            int var164 = class309.field4706[var6];
                            class198.field2978[var7++] = var163 + var164;
                            continue;
                        }
                        if (var506 == 4101) {
                            var7 -= 2;
                            String var165 = class198.field2978[var7 + 1];
                            String var166 = class198.field2978[var7];
                            class198.field2978[var7++] = var166 + var165;
                            continue;
                        }
                        if (var506 == 4102) {
                            var6--;
                            int var167 = class309.field4706[var6];
                            var7--;
                            String var168 = class198.field2978[var7];
                            class198.field2978[var7++] = var168 + class323.method2211(true, -58, var167);
                            continue;
                        }
                        if (var506 == 4103) {
                            var7--;
                            String var169 = class198.field2978[var7];
                            class198.field2978[var7++] = var169.toLowerCase();
                            continue;
                        }
                        if (var506 == 4104) {
                            var6--;
                            int var170 = class309.field4706[var6];
                            long var171 = (long) var170 * 86400000L + 1014768000000L;
                            class242.field3619.setTime(new Date(var171));
                            int var173 = class242.field3619.get(5);
                            int var174 = class242.field3619.get(2);
                            int var175 = class242.field3619.get(1);
                            class198.field2978[var7++] = var173 + "-" + class158.field2378[var174] + "-" + var175;
                            continue;
                        }
                        if (var506 == 4105) {
                            var7 -= 2;
                            String var176 = class198.field2978[var7];
                            String var177 = class198.field2978[var7 + 1];
                            if (class114.field1750.field2912 != null && class114.field1750.field2912.field3867) {
                                class198.field2978[var7++] = var177;
                                continue;
                            }
                            class198.field2978[var7++] = var176;
                            continue;
                        }
                        if (var506 == 4106) {
                            var6--;
                            int var178 = class309.field4706[var6];
                            class198.field2978[var7++] = Integer.toString(var178);
                            continue;
                        }
                        if (var506 == 4107) {
                            var7 -= 2;
                            class309.field4706[var6++] = class114.method789((byte) -31, class212.method1473(class198.field2978[var7], class198.field2978[var7 + 1], (byte) 50, class256.field3882));
                            continue;
                        }
                        if (var506 == 4108) {
                            var7--;
                            String var179 = class198.field2978[var7];
                            var6 -= 2;
                            int var180 = class309.field4706[var6 + 1];
                            int var181 = class309.field4706[var6];
                            class309.field4706[var6++] = class132.method974(0, var180).method613(var179, var181);
                            continue;
                        }
                        if (var506 == 4109) {
                            var7--;
                            String var182 = class198.field2978[var7];
                            var6 -= 2;
                            int var183 = class309.field4706[var6];
                            int var184 = class309.field4706[var6 + 1];
                            class309.field4706[var6++] = class132.method974(0, var184).method625(var182, var183);
                            continue;
                        }
                        if (var506 == 4110) {
                            var7 -= 2;
                            String var185 = class198.field2978[var7];
                            String var186 = class198.field2978[var7 + 1];
                            var6--;
                            if (class309.field4706[var6] == 1) {
                                class198.field2978[var7++] = var185;
                            } else {
                                class198.field2978[var7++] = var186;
                            }
                            continue;
                        }
                        if (var506 == 4111) {
                            var7--;
                            String var187 = class198.field2978[var7];
                            class198.field2978[var7++] = class89.method610(var187);
                            continue;
                        }
                        if (var506 == 4112) {
                            var6--;
                            int var188 = class309.field4706[var6];
                            var7--;
                            String var189 = class198.field2978[var7];
                            if (var188 == -1) {
                                throw new RuntimeException("null char");
                            }
                            class198.field2978[var7++] = var189 + (char) var188;
                            continue;
                        }
                        if (var506 == 4113) {
                            var6--;
                            int var190 = class309.field4706[var6];
                            class309.field4706[var6++] = class111.method774((char) var190, -3110) ? 1 : 0;
                            continue;
                        }
                        if (var506 == 4114) {
                            var6--;
                            int var191 = class309.field4706[var6];
                            class309.field4706[var6++] = class37.method253((char) var191, (byte) -68) ? 1 : 0;
                            continue;
                        }
                        if (var506 == 4115) {
                            var6--;
                            int var192 = class309.field4706[var6];
                            class309.field4706[var6++] = class28.method178((byte) 92, (char) var192) ? 1 : 0;
                            continue;
                        }
                        if (var506 == 4116) {
                            var6--;
                            int var193 = class309.field4706[var6];
                            class309.field4706[var6++] = class297.method2069((byte) 70, (char) var193) ? 1 : 0;
                            continue;
                        }
                        if (var506 == 4117) {
                            var7--;
                            String var194 = class198.field2978[var7];
                            if (var194 == null) {
                                class309.field4706[var6++] = 0;
                            } else {
                                class309.field4706[var6++] = var194.length();
                            }
                            continue;
                        }
                        if (var506 == 4118) {
                            var6 -= 2;
                            int var195 = class309.field4706[var6];
                            int var196 = class309.field4706[var6 + 1];
                            var7--;
                            String var197 = class198.field2978[var7];
                            class198.field2978[var7++] = var197.substring(var195, var196);
                            continue;
                        }
                        if (var506 == 4119) {
                            var7--;
                            String var198 = class198.field2978[var7];
                            StringBuffer var199 = new StringBuffer(var198.length());
                            boolean var200 = false;
                            for (int var201 = 0; var201 < var198.length(); var201++) {
                                char var202 = var198.charAt(var201);
                                if (var202 == '<') {
                                    var200 = true;
                                } else if (var202 == '>') {
                                    var200 = false;
                                } else if (!var200) {
                                    var199.append(var202);
                                }
                            }
                            class198.field2978[var7++] = var199.toString();
                            continue;
                        }
                        if (var506 == 4120) {
                            var6 -= 2;
                            var7--;
                            String var203 = class198.field2978[var7];
                            int var204 = class309.field4706[var6 + 1];
                            int var205 = class309.field4706[var6];
                            class309.field4706[var6++] = var203.indexOf(var205, var204);
                            continue;
                        }
                        if (var506 == 4121) {
                            var7 -= 2;
                            String var206 = class198.field2978[var7 + 1];
                            String var207 = class198.field2978[var7];
                            var6--;
                            int var208 = class309.field4706[var6];
                            class309.field4706[var6++] = var207.indexOf(var206, var208);
                            continue;
                        }
                        if (var506 == 4122) {
                            var6--;
                            int var209 = class309.field4706[var6];
                            class309.field4706[var6++] = Character.toLowerCase((char) var209);
                            continue;
                        }
                        if (var506 == 4123) {
                            var6--;
                            int var210 = class309.field4706[var6];
                            class309.field4706[var6++] = Character.toUpperCase((char) var210);
                            continue;
                        }
                        if (var506 == 4124) {
                            var6--;
                            boolean var211 = class309.field4706[var6] != 0;
                            var6--;
                            int var212 = class309.field4706[var6];
                            class198.field2978[var7++] = class80.method539(0, var211, (long) var212, 58, class256.field3882);
                            continue;
                        }
                    } else if (var506 < 4300) {
                        if (var506 == 4200) {
                            var6--;
                            int var213 = class309.field4706[var6];
                            class198.field2978[var7++] = class325.method2219(var213, -9379).field3837;
                            continue;
                        }
                        if (var506 == 4201) {
                            var6 -= 2;
                            int var214 = class309.field4706[var6];
                            int var215 = class309.field4706[var6 + 1];
                            class253 var216 = class325.method2219(var214, -9379);
                            if (var215 >= 1 && var215 <= 5 && var216.field3806[var215 - 1] != null) {
                                class198.field2978[var7++] = var216.field3806[var215 - 1];
                                continue;
                            }
                            class198.field2978[var7++] = "";
                            continue;
                        }
                        if (var506 == 4202) {
                            var6 -= 2;
                            int var217 = class309.field4706[var6];
                            int var218 = class309.field4706[var6 + 1];
                            class253 var219 = class325.method2219(var217, -9379);
                            if (var218 >= 1 && var218 <= 5 && var219.field3786[var218 - 1] != null) {
                                class198.field2978[var7++] = var219.field3786[var218 - 1];
                                continue;
                            }
                            class198.field2978[var7++] = "";
                            continue;
                        }
                        if (var506 == 4203) {
                            var6--;
                            int var220 = class309.field4706[var6];
                            class309.field4706[var6++] = class325.method2219(var220, arg2 - 12157).field3787;
                            continue;
                        }
                        if (var506 == 4204) {
                            var6--;
                            int var221 = class309.field4706[var6];
                            class309.field4706[var6++] = class325.method2219(var221, -9379).field3847 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var506 == 4205) {
                            var6--;
                            int var222 = class309.field4706[var6];
                            class253 var223 = class325.method2219(var222, arg2 - 12157);
                            if (var223.field3800 == -1 && var223.field3849 >= 0) {
                                class309.field4706[var6++] = var223.field3849;
                                continue;
                            }
                            class309.field4706[var6++] = var222;
                            continue;
                        }
                        if (var506 == 4206) {
                            var6--;
                            int var224 = class309.field4706[var6];
                            class253 var225 = class325.method2219(var224, -9379);
                            if (var225.field3800 >= 0 && var225.field3849 >= 0) {
                                class309.field4706[var6++] = var225.field3849;
                                continue;
                            }
                            class309.field4706[var6++] = var224;
                            continue;
                        }
                        if (var506 == 4207) {
                            var6--;
                            int var226 = class309.field4706[var6];
                            class309.field4706[var6++] = class325.method2219(var226, -9379).field3850 ? 1 : 0;
                            continue;
                        }
                        if (var506 == 4208) {
                            var6 -= 2;
                            int var227 = class309.field4706[var6];
                            int var228 = class309.field4706[var6 + 1];
                            class63 var229 = class104.method733(var228, true);
                            if (var229.method413((byte) -105)) {
                                class198.field2978[var7++] = class325.method2219(var227, -9379).method1708((byte) -37, var229.field827, var228);
                            } else {
                                class309.field4706[var6++] = class325.method2219(var227, -9379).method1714(var228, var229.field837, true);
                            }
                            continue;
                        }
                        if (var506 == 4210) {
                            var7--;
                            String var230 = class198.field2978[var7];
                            var6--;
                            int var231 = class309.field4706[var6];
                            class256.method1738(var230, arg2 - 2762, var231 == 1);
                            class309.field4706[var6++] = class266.field4097;
                            continue;
                        }
                        if (var506 == 4211) {
                            if (class257.field3898 != null && class266.field4097 > class306.field4658) {
                                class309.field4706[var6++] = class124.method893(class257.field3898[class306.field4658++], 65535);
                                continue;
                            }
                            class309.field4706[var6++] = -1;
                            continue;
                        }
                        if (var506 == 4212) {
                            class306.field4658 = 0;
                            continue;
                        }
                    } else if (var506 >= 4400) {
                        if (var506 < 4500) {
                            if (var506 == 4400) {
                                var6 -= 2;
                                int var232 = class309.field4706[var6];
                                int var233 = class309.field4706[var6 + 1];
                                class63 var234 = class104.method733(var233, true);
                                if (var234.method413((byte) -105)) {
                                    class198.field2978[var7++] = class284.method1980(var232, (byte) 122).method149(var233, var234.field827, (byte) -118);
                                } else {
                                    class309.field4706[var6++] = class284.method1980(var232, (byte) 126).method156((byte) 90, var233, var234.field837);
                                }
                                continue;
                            }
                        } else if (var506 >= 4600) {
                            if (var506 < 5100) {
                                if (var506 == 5000) {
                                    class309.field4706[var6++] = class19.field227;
                                    continue;
                                }
                                if (var506 == 5001) {
                                    class22.field313++;
                                    var6 -= 3;
                                    class19.field227 = class309.field4706[var6];
                                    class116.field1779 = class309.field4706[var6 + 1];
                                    class141.field2126 = class309.field4706[var6 + 2];
                                    class234.field3507.method28(235, false);
                                    class234.field3507.method1813(125, class19.field227);
                                    class234.field3507.method1813(arg2 ^ 0xA82, class116.field1779);
                                    class234.field3507.method1813(arg2 - 2709, class141.field2126);
                                    continue;
                                }
                                if (var506 == 5002) {
                                    class82.field1158++;
                                    var6 -= 2;
                                    int var235 = class309.field4706[var6];
                                    var7--;
                                    String var236 = class198.field2978[var7];
                                    int var237 = class309.field4706[var6 + 1];
                                    class234.field3507.method28(147, false);
                                    class234.field3507.method1816(class242.method1638(var236, arg2 - 17171), 21054);
                                    class234.field3507.method1813(54, var235 - 1);
                                    class234.field3507.method1813(arg2 ^ 0xFFFFF55A, var237);
                                    continue;
                                }
                                if (var506 == 5003) {
                                    var6--;
                                    int var238 = class309.field4706[var6];
                                    String var239 = null;
                                    if (var238 < 100) {
                                        var239 = class9.field69[var238];
                                    }
                                    if (var239 == null) {
                                        var239 = "";
                                    }
                                    class198.field2978[var7++] = var239;
                                    continue;
                                }
                                if (var506 == 5004) {
                                    var6--;
                                    int var240 = class309.field4706[var6];
                                    int var241 = -1;
                                    if (var240 < 100 && class9.field69[var240] != null) {
                                        var241 = class6.field30[var240];
                                    }
                                    class309.field4706[var6++] = var241;
                                    continue;
                                }
                                if (var506 == 5005) {
                                    class309.field4706[var6++] = class116.field1779;
                                    continue;
                                }
                                if (var506 == 5008) {
                                    var7--;
                                    String var242 = class198.field2978[var7];
                                    if (!var242.startsWith("::")) {
                                        if (class192.field2863 == 0 && (class261.field3955 && !class70.field927 || class154.field2311)) {
                                            continue;
                                        }
                                        class167.field2509++;
                                        String var243 = var242.toLowerCase();
                                        byte var244 = 0;
                                        byte var245 = 0;
                                        if (var243.startsWith(class317.field4781)) {
                                            var245 = 0;
                                            var242 = var242.substring(class317.field4781.length());
                                        } else if (var243.startsWith(class170.field2553)) {
                                            var245 = 1;
                                            var242 = var242.substring(class170.field2553.length());
                                        } else if (var243.startsWith(class67.field876)) {
                                            var245 = 2;
                                            var242 = var242.substring(class67.field876.length());
                                        } else if (var243.startsWith(class279.field4241)) {
                                            var245 = 3;
                                            var242 = var242.substring(class279.field4241.length());
                                        } else if (var243.startsWith(class237.field3558)) {
                                            var242 = var242.substring(class237.field3558.length());
                                            var245 = 4;
                                        } else if (var243.startsWith(class211.field3214)) {
                                            var242 = var242.substring(class211.field3214.length());
                                            var245 = 5;
                                        } else if (var243.startsWith(class251.field3749)) {
                                            var245 = 6;
                                            var242 = var242.substring(class251.field3749.length());
                                        } else if (var243.startsWith(class19.field232)) {
                                            var245 = 7;
                                            var242 = var242.substring(class19.field232.length());
                                        } else if (var243.startsWith(class281.field4262)) {
                                            var245 = 8;
                                            var242 = var242.substring(class281.field4262.length());
                                        } else if (var243.startsWith(class136.field2085)) {
                                            var242 = var242.substring(class136.field2085.length());
                                            var245 = 9;
                                        } else if (var243.startsWith(class329.field5028)) {
                                            var242 = var242.substring(class329.field5028.length());
                                            var245 = 10;
                                        } else if (var243.startsWith(class278.field4229)) {
                                            var245 = 11;
                                            var242 = var242.substring(class278.field4229.length());
                                        } else if (class256.field3882 != 0) {
                                            if (var243.startsWith(class160.field2399)) {
                                                var245 = 0;
                                                var242 = var242.substring(class160.field2399.length());
                                            } else if (var243.startsWith(class104.field1647)) {
                                                var245 = 1;
                                                var242 = var242.substring(class104.field1647.length());
                                            } else if (var243.startsWith(class270.field4149)) {
                                                var242 = var242.substring(class270.field4149.length());
                                                var245 = 2;
                                            } else if (var243.startsWith(class315.field4760)) {
                                                var245 = 3;
                                                var242 = var242.substring(class315.field4760.length());
                                            } else if (var243.startsWith(class114.field1751)) {
                                                var242 = var242.substring(class114.field1751.length());
                                                var245 = 4;
                                            } else if (var243.startsWith(class181.field2704)) {
                                                var245 = 5;
                                                var242 = var242.substring(class181.field2704.length());
                                            } else if (var243.startsWith(class192.field2884)) {
                                                var245 = 6;
                                                var242 = var242.substring(class192.field2884.length());
                                            } else if (var243.startsWith(class131.field2022)) {
                                                var242 = var242.substring(class131.field2022.length());
                                                var245 = 7;
                                            } else if (var243.startsWith(class187.field2791)) {
                                                var245 = 8;
                                                var242 = var242.substring(class187.field2791.length());
                                            } else if (var243.startsWith(class170.field2556)) {
                                                var245 = 9;
                                                var242 = var242.substring(class170.field2556.length());
                                            } else if (var243.startsWith(class73.field949)) {
                                                var242 = var242.substring(class73.field949.length());
                                                var245 = 10;
                                            } else if (var243.startsWith(class245.field3651)) {
                                                var245 = 11;
                                                var242 = var242.substring(class245.field3651.length());
                                            }
                                        }
                                        String var246 = var242.toLowerCase();
                                        if (var246.startsWith(class186.field2771)) {
                                            var244 = 1;
                                            var242 = var242.substring(class186.field2771.length());
                                        } else if (var246.startsWith(class241.field3591)) {
                                            var244 = 2;
                                            var242 = var242.substring(class241.field3591.length());
                                        } else if (var246.startsWith(class163.field2454)) {
                                            var242 = var242.substring(class163.field2454.length());
                                            var244 = 3;
                                        } else if (var246.startsWith(class109.field1683)) {
                                            var242 = var242.substring(class109.field1683.length());
                                            var244 = 4;
                                        } else if (var246.startsWith(class97.field1468)) {
                                            var244 = 5;
                                            var242 = var242.substring(class97.field1468.length());
                                        } else if (class256.field3882 != 0) {
                                            if (var246.startsWith(class22.field329)) {
                                                var242 = var242.substring(class22.field329.length());
                                                var244 = 1;
                                            } else if (var246.startsWith(class316.field4777)) {
                                                var244 = 2;
                                                var242 = var242.substring(class316.field4777.length());
                                            } else if (var246.startsWith(class234.field3520)) {
                                                var244 = 3;
                                                var242 = var242.substring(class234.field3520.length());
                                            } else if (var246.startsWith(class176.field2602)) {
                                                var242 = var242.substring(class176.field2602.length());
                                                var244 = 4;
                                            } else if (var246.startsWith(class167.field2506)) {
                                                var244 = 5;
                                                var242 = var242.substring(class167.field2506.length());
                                            }
                                        }
                                        class234.field3507.method28(110, false);
                                        class234.field3507.method1813(arg2 - 2862, 0);
                                        int var247 = class234.field3507.field4025;
                                        class234.field3507.method1813(39, var245);
                                        class234.field3507.method1813(-119, var244);
                                        class151.method1090(class234.field3507, var242, -43);
                                        class234.field3507.method1791(-1157288507, class234.field3507.field4025 - var247);
                                        continue;
                                    }
                                    class160.method1133((byte) -82, var242);
                                    continue;
                                }
                                if (var506 == 5009) {
                                    var7 -= 2;
                                    String var248 = class198.field2978[var7];
                                    String var249 = class198.field2978[var7 + 1];
                                    if (class192.field2863 != 0 || (!class261.field3955 || class70.field927) && !class154.field2311) {
                                        class226.field3442++;
                                        class234.field3507.method28(3, false);
                                        class234.field3507.method1813(arg2 ^ 0xAF1, 0);
                                        int var250 = class234.field3507.field4025;
                                        class234.field3507.method1816(class242.method1638(var248, -14393), 21054);
                                        class151.method1090(class234.field3507, var249, -97);
                                        class234.field3507.method1791(-1157288507, class234.field3507.field4025 - var250);
                                    }
                                    continue;
                                }
                                if (var506 == 5010) {
                                    var6--;
                                    int var251 = class309.field4706[var6];
                                    String var252 = null;
                                    if (var251 < 100) {
                                        var252 = class267.field4108[var251];
                                    }
                                    if (var252 == null) {
                                        var252 = "";
                                    }
                                    class198.field2978[var7++] = var252;
                                    continue;
                                }
                                if (var506 == 5011) {
                                    String var253 = null;
                                    var6--;
                                    int var254 = class309.field4706[var6];
                                    if (var254 < 100) {
                                        var253 = class122.field1904[var254];
                                    }
                                    if (var253 == null) {
                                        var253 = "";
                                    }
                                    class198.field2978[var7++] = var253;
                                    continue;
                                }
                                if (var506 == 5012) {
                                    var6--;
                                    int var255 = class309.field4706[var6];
                                    int var256 = -1;
                                    if (var255 < 100) {
                                        var256 = class225.field3429[var255];
                                    }
                                    class309.field4706[var6++] = var256;
                                    continue;
                                }
                                if (var506 == 5015) {
                                    String var257;
                                    if (class114.field1750 == null || class114.field1750.field2934 == null) {
                                        var257 = class178.field2640;
                                    } else {
                                        var257 = class114.field1750.method1344(-1);
                                    }
                                    class198.field2978[var7++] = var257;
                                    continue;
                                }
                                if (var506 == 5016) {
                                    class309.field4706[var6++] = class141.field2126;
                                    continue;
                                }
                                if (var506 == 5017) {
                                    class309.field4706[var6++] = class160.field2400;
                                    continue;
                                }
                                if (var506 == 5050) {
                                    var6--;
                                    int var258 = class309.field4706[var6];
                                    class198.field2978[var7++] = class278.method1938(arg2 - 2900, var258).field1663;
                                    continue;
                                }
                                if (var506 == 5051) {
                                    var6--;
                                    int var259 = class309.field4706[var6];
                                    class106 var260 = class278.method1938(-127, var259);
                                    if (var260.field1657 == null) {
                                        class309.field4706[var6++] = 0;
                                    } else {
                                        class309.field4706[var6++] = var260.field1657.length;
                                    }
                                    continue;
                                }
                                if (var506 == 5052) {
                                    var6 -= 2;
                                    int var261 = class309.field4706[var6 + 1];
                                    int var262 = class309.field4706[var6];
                                    class106 var263 = class278.method1938(-127, var262);
                                    int var264 = var263.field1657[var261];
                                    class309.field4706[var6++] = var264;
                                    continue;
                                }
                                if (var506 == 5053) {
                                    var6--;
                                    int var265 = class309.field4706[var6];
                                    class106 var266 = class278.method1938(-122, var265);
                                    if (var266.field1667 == null) {
                                        class309.field4706[var6++] = 0;
                                    } else {
                                        class309.field4706[var6++] = var266.field1667.length;
                                    }
                                    continue;
                                }
                                if (var506 == 5054) {
                                    var6 -= 2;
                                    int var267 = class309.field4706[var6 + 1];
                                    int var268 = class309.field4706[var6];
                                    class309.field4706[var6++] = class278.method1938(-128, var268).field1667[var267];
                                    continue;
                                }
                                if (var506 == 5055) {
                                    var6--;
                                    int var269 = class309.field4706[var6];
                                    class198.field2978[var7++] = class202.method1384(var269, (byte) 118).method61(false);
                                    continue;
                                }
                                if (var506 == 5056) {
                                    var6--;
                                    int var270 = class309.field4706[var6];
                                    class11 var271 = class202.method1384(var270, (byte) 118);
                                    if (var271.field116 == null) {
                                        class309.field4706[var6++] = 0;
                                    } else {
                                        class309.field4706[var6++] = var271.field116.length;
                                    }
                                    continue;
                                }
                                if (var506 == 5057) {
                                    var6 -= 2;
                                    int var272 = class309.field4706[var6 + 1];
                                    int var273 = class309.field4706[var6];
                                    class309.field4706[var6++] = class202.method1384(var273, (byte) 118).field116[var272];
                                    continue;
                                }
                                if (var506 == 5058) {
                                    class138.field2105 = new class189();
                                    var6--;
                                    class138.field2105.field2817 = class309.field4706[var6];
                                    class138.field2105.field2813 = class202.method1384(class138.field2105.field2817, (byte) 118);
                                    class138.field2105.field2808 = new int[class138.field2105.field2813.method64(true)];
                                    continue;
                                }
                                if (var506 == 5059) {
                                    class163.field2455++;
                                    class234.field3507.method28(135, false);
                                    class234.field3507.method1813(108, 0);
                                    int var274 = class234.field3507.field4025;
                                    class234.field3507.method1813(14, 0);
                                    class234.field3507.method1823(class138.field2105.field2817, (byte) -126);
                                    class138.field2105.field2813.method55(-11849, class234.field3507, class138.field2105.field2808);
                                    class234.field3507.method1791(-1157288507, class234.field3507.field4025 - var274);
                                    continue;
                                }
                                if (var506 == 5060) {
                                    class286.field4313++;
                                    var7--;
                                    String var275 = class198.field2978[var7];
                                    class234.field3507.method28(120, false);
                                    class234.field3507.method1813(97, 0);
                                    int var276 = class234.field3507.field4025;
                                    class234.field3507.method1816(class242.method1638(var275, arg2 ^ 0xFFFFCD1D), arg2 ^ 0x58E4);
                                    class234.field3507.method1823(class138.field2105.field2817, (byte) -36);
                                    class138.field2105.field2813.method55(arg2 ^ 0xFFFFDB6D, class234.field3507, class138.field2105.field2808);
                                    class234.field3507.method1791(-1157288507, class234.field3507.field4025 - var276);
                                    continue;
                                }
                                if (var506 == 5061) {
                                    class163.field2455++;
                                    class234.field3507.method28(135, false);
                                    class234.field3507.method1813(arg2 - 2735, 0);
                                    int var277 = class234.field3507.field4025;
                                    class234.field3507.method1813(13, 1);
                                    class234.field3507.method1823(class138.field2105.field2817, (byte) -89);
                                    class138.field2105.field2813.method55(arg2 - 14627, class234.field3507, class138.field2105.field2808);
                                    class234.field3507.method1791(arg2 ^ 0xBB05271F, class234.field3507.field4025 - var277);
                                    continue;
                                }
                                if (var506 == 5062) {
                                    var6 -= 2;
                                    int var278 = class309.field4706[var6];
                                    int var279 = class309.field4706[var6 + 1];
                                    class309.field4706[var6++] = class278.method1938(-125, var278).field1653[var279];
                                    continue;
                                }
                                if (var506 == 5063) {
                                    var6 -= 2;
                                    int var280 = class309.field4706[var6];
                                    int var281 = class309.field4706[var6 + 1];
                                    class309.field4706[var6++] = class278.method1938(arg2 - 2901, var280).field1664[var281];
                                    continue;
                                }
                                if (var506 == 5064) {
                                    var6 -= 2;
                                    int var282 = class309.field4706[var6];
                                    int var283 = class309.field4706[var6 + 1];
                                    if (var283 == -1) {
                                        class309.field4706[var6++] = -1;
                                    } else {
                                        class309.field4706[var6++] = class278.method1938(-125, var282).method750((char) var283, -255);
                                    }
                                    continue;
                                }
                                if (var506 == 5065) {
                                    var6 -= 2;
                                    int var284 = class309.field4706[var6];
                                    int var285 = class309.field4706[var6 + 1];
                                    if (var285 == -1) {
                                        class309.field4706[var6++] = -1;
                                    } else {
                                        class309.field4706[var6++] = class278.method1938(arg2 - 2906, var284).method755(true, (char) var285);
                                    }
                                    continue;
                                }
                                if (var506 == 5066) {
                                    var6--;
                                    int var286 = class309.field4706[var6];
                                    class309.field4706[var6++] = class202.method1384(var286, (byte) 118).method64(true);
                                    continue;
                                }
                                if (var506 == 5067) {
                                    var6 -= 2;
                                    int var287 = class309.field4706[var6];
                                    int var288 = class309.field4706[var6 + 1];
                                    int var289 = class202.method1384(var287, (byte) 118).method59((byte) -25, var288);
                                    class309.field4706[var6++] = var289;
                                    continue;
                                }
                                if (var506 == 5068) {
                                    var6 -= 2;
                                    int var290 = class309.field4706[var6];
                                    int var291 = class309.field4706[var6 + 1];
                                    class138.field2105.field2808[var290] = var291;
                                    continue;
                                }
                                if (var506 == 5069) {
                                    var6 -= 2;
                                    int var292 = class309.field4706[var6 + 1];
                                    int var293 = class309.field4706[var6];
                                    class138.field2105.field2808[var293] = var292;
                                    continue;
                                }
                                if (var506 == 5070) {
                                    var6 -= 3;
                                    int var294 = class309.field4706[var6];
                                    int var295 = class309.field4706[var6 + 1];
                                    int var296 = class309.field4706[var6 + 2];
                                    class11 var297 = class202.method1384(var294, (byte) 118);
                                    if (var297.method59((byte) -83, var295) != 0) {
                                        throw new RuntimeException("bad command");
                                    }
                                    class309.field4706[var6++] = var297.method53(var296, var295, -1);
                                    continue;
                                }
                                if (var506 == 5071) {
                                    var7--;
                                    String var298 = class198.field2978[var7];
                                    var6--;
                                    boolean var299 = class309.field4706[var6] == 1;
                                    class147.method1049(var298, (byte) -128, var299);
                                    class309.field4706[var6++] = class266.field4097;
                                    continue;
                                }
                                if (var506 == 5072) {
                                    if (class257.field3898 != null && class306.field4658 < class266.field4097) {
                                        class309.field4706[var6++] = class124.method893(class257.field3898[class306.field4658++], 65535);
                                        continue;
                                    }
                                    class309.field4706[var6++] = -1;
                                    continue;
                                }
                                if (var506 == 5073) {
                                    class306.field4658 = 0;
                                    continue;
                                }
                            } else if (var506 < 5200) {
                                if (var506 == 5100) {
                                    if (class120.field1879[86]) {
                                        class309.field4706[var6++] = 1;
                                    } else {
                                        class309.field4706[var6++] = 0;
                                    }
                                    continue;
                                }
                                if (var506 == 5101) {
                                    if (class120.field1879[82]) {
                                        class309.field4706[var6++] = 1;
                                    } else {
                                        class309.field4706[var6++] = 0;
                                    }
                                    continue;
                                }
                                if (var506 == 5102) {
                                    if (class120.field1879[81]) {
                                        class309.field4706[var6++] = 1;
                                    } else {
                                        class309.field4706[var6++] = 0;
                                    }
                                    continue;
                                }
                            } else if (var506 < 5300) {
                                if (var506 == 5200) {
                                    var6--;
                                    class201.method1378(class309.field4706[var6], (byte) -17);
                                    continue;
                                }
                                if (var506 == 5201) {
                                    class309.field4706[var6++] = class21.method131(arg2 + 24749);
                                    continue;
                                }
                                if (var506 == 5202) {
                                    var6--;
                                    class167.method1168(false, class309.field4706[var6]);
                                    continue;
                                }
                                if (var506 == 5203) {
                                    var7--;
                                    class122.method884(false, class198.field2978[var7]);
                                    continue;
                                }
                                if (var506 == 5204) {
                                    class198.field2978[var7 - 1] = class126.method919(class198.field2978[var7 - 1], 126);
                                    continue;
                                }
                                if (var506 == 5205) {
                                    var7--;
                                    class169.method1180(class198.field2978[var7], (byte) -95);
                                    continue;
                                }
                                if (var506 == 5206) {
                                    var6--;
                                    int var300 = class309.field4706[var6];
                                    class61 var301 = class242.method1637((var300 & 0xFFFE637) >> 14, var300 & 0x3FFF, (byte) -94);
                                    if (var301 == null) {
                                        class198.field2978[var7++] = "";
                                    } else {
                                        class198.field2978[var7++] = var301.field814;
                                    }
                                    continue;
                                }
                                if (var506 == 5207) {
                                    var7--;
                                    class61 var302 = class20.method123(class198.field2978[var7], -1);
                                    if (var302 != null && var302.field809 != null) {
                                        class198.field2978[var7++] = var302.field809;
                                        continue;
                                    }
                                    class198.field2978[var7++] = "";
                                    continue;
                                }
                                if (var506 == 5208) {
                                    class309.field4706[var6++] = class235.field3536;
                                    class309.field4706[var6++] = class98.field1531;
                                    continue;
                                }
                                if (var506 == 5209) {
                                    class309.field4706[var6++] = class233.field3504 + class292.field4439;
                                    class309.field4706[var6++] = class296.field4533 + class111.field1719 - (1 - -class203.field3037);
                                    continue;
                                }
                                if (var506 == 5210) {
                                    class61 var303 = class218.method1499(6982);
                                    if (var303 == null) {
                                        class309.field4706[var6++] = 0;
                                        class309.field4706[var6++] = 0;
                                    } else {
                                        class309.field4706[var6++] = var303.field810 * 64;
                                        class309.field4706[var6++] = var303.field818 * 64;
                                    }
                                    continue;
                                }
                                if (var506 == 5211) {
                                    class61 var304 = class218.method1499(arg2 ^ 0x119C);
                                    if (var304 == null) {
                                        class309.field4706[var6++] = 0;
                                        class309.field4706[var6++] = 0;
                                    } else {
                                        class309.field4706[var6++] = var304.field811 - var304.field806;
                                        class309.field4706[var6++] = var304.field824 - var304.field801;
                                    }
                                    continue;
                                }
                                if (var506 == 5212) {
                                    int var305 = class222.method1558(0);
                                    int var306 = 0;
                                    String var307;
                                    if (var305 == -1) {
                                        var307 = "";
                                    } else {
                                        var307 = class155.field2325.field2007[var305];
                                        var306 = class155.field2325.method963(var305, true);
                                    }
                                    String var308 = class201.method1379("<br>", -91, var307, " ");
                                    class198.field2978[var7++] = var308;
                                    class309.field4706[var6++] = var306;
                                    continue;
                                }
                                if (var506 == 5213) {
                                    int var309 = class162.method1145(-1);
                                    int var310 = 0;
                                    String var311;
                                    if (var309 == -1) {
                                        var311 = "";
                                    } else {
                                        var311 = class155.field2325.field2007[var309];
                                        var310 = class155.field2325.method963(var309, true);
                                    }
                                    String var312 = class201.method1379("<br>", -74, var311, " ");
                                    class198.field2978[var7++] = var312;
                                    class309.field4706[var6++] = var310;
                                    continue;
                                }
                                if (var506 == 5214) {
                                    var6--;
                                    int var313 = class309.field4706[var6];
                                    class243.method1651(true, var313 >> 14 & 0x3FFF, var313 & 0x3FFF);
                                    continue;
                                }
                                if (var506 == 5215) {
                                    var6--;
                                    int var314 = class309.field4706[var6];
                                    var7--;
                                    String var315 = class198.field2978[var7];
                                    class251 var316 = class247.method1667((byte) 124, (var314 & 0xFFFE22C) >> 14, var314 & 0x3FFF);
                                    boolean var317 = false;
                                    for (class61 var318 = (class61) var316.method1696(89); var318 != null; var318 = (class61) var316.method1695(arg2 ^ 0xFFFFC5F9)) {
                                        if (var318.field814.equalsIgnoreCase(var315)) {
                                            var317 = true;
                                            break;
                                        }
                                    }
                                    if (var317) {
                                        class309.field4706[var6++] = 1;
                                    } else {
                                        class309.field4706[var6++] = 0;
                                    }
                                    continue;
                                }
                                if (var506 == 5216) {
                                    var6--;
                                    int var319 = class309.field4706[var6];
                                    class247.method1668(var319, arg2 ^ 0xADA);
                                    continue;
                                }
                                if (var506 == 5217) {
                                    var6--;
                                    int var320 = class309.field4706[var6];
                                    if (class63.method415((byte) -106, var320)) {
                                        class309.field4706[var6++] = 1;
                                    } else {
                                        class309.field4706[var6++] = 0;
                                    }
                                    continue;
                                }
                                if (var506 == 5218) {
                                    class61 var321 = class218.method1499(6982);
                                    if (var321 == null) {
                                        class309.field4706[var6++] = -1;
                                    } else {
                                        class309.field4706[var6++] = var321.field815;
                                    }
                                    continue;
                                }
                                if (var506 == 5219) {
                                    var7--;
                                    class178.method1231(class198.field2978[var7], (byte) 15);
                                    continue;
                                }
                                if (var506 == 5220) {
                                    class309.field4706[var6++] = class221.field3369 == 100 ? 1 : 0;
                                    continue;
                                }
                            } else if (var506 < 5400) {
                                if (var506 == 5300) {
                                    var6 -= 2;
                                    int var384 = class309.field4706[var6 + 1];
                                    int var385 = class309.field4706[var6];
                                    class307.method2119(var385, false, var384, false, 3);
                                    class309.field4706[var6++] = class90.field1344 == null ? 0 : 1;
                                    continue;
                                }
                                if (var506 == 5301) {
                                    if (class90.field1344 != null) {
                                        class307.method2119(-1, false, -1, false, class144.field2175);
                                    }
                                    continue;
                                }
                                if (var506 == 5302) {
                                    class314[] var386 = class283.method1975(122);
                                    class309.field4706[var6++] = var386.length;
                                    continue;
                                }
                                if (var506 == 5303) {
                                    var6--;
                                    int var387 = class309.field4706[var6];
                                    class314[] var388 = class283.method1975(115);
                                    class309.field4706[var6++] = var388[var387].field4751;
                                    class309.field4706[var6++] = var388[var387].field4752;
                                    continue;
                                }
                                if (var506 == 5305) {
                                    int var389 = class91.field1360;
                                    int var390 = class204.field3064;
                                    int var391 = -1;
                                    class314[] var392 = class283.method1975(114);
                                    for (int var393 = 0; var393 < var392.length; var393++) {
                                        class314 var394 = var392[var393];
                                        if (var394.field4751 == var389 && var394.field4752 == var390) {
                                            var391 = var393;
                                            break;
                                        }
                                    }
                                    class309.field4706[var6++] = var391;
                                    continue;
                                }
                                if (var506 == 5306) {
                                    class309.field4706[var6++] = class48.method329((byte) 81);
                                    continue;
                                }
                                if (var506 == 5307) {
                                    var6--;
                                    int var395 = class309.field4706[var6];
                                    if (var395 < 0 || var395 > 2) {
                                        var395 = 0;
                                    }
                                    class307.method2119(-1, false, -1, false, var395);
                                    continue;
                                }
                                if (var506 == 5308) {
                                    class309.field4706[var6++] = class144.field2175;
                                    continue;
                                }
                                if (var506 == 5309) {
                                    var6--;
                                    int var396 = class309.field4706[var6];
                                    if (var396 < 0 || var396 > 2) {
                                        var396 = 0;
                                    }
                                    class144.field2175 = var396;
                                    class6.method17(class274.field4200, (byte) -111);
                                    continue;
                                }
                            } else if (var506 < 5500) {
                                if (var506 == 5400) {
                                    class73.field945++;
                                    var7 -= 2;
                                    var6--;
                                    int var364 = class309.field4706[var6];
                                    String var365 = class198.field2978[var7];
                                    String var366 = class198.field2978[var7 + 1];
                                    class234.field3507.method28(68, false);
                                    class234.field3507.method1813(-118, class224.method1565((byte) 96, var365) + class224.method1565((byte) 77, var366) + 1);
                                    class234.field3507.method1825(var365, (byte) 114);
                                    class234.field3507.method1825(var366, (byte) 84);
                                    class234.field3507.method1813(arg2 - 2889, var364);
                                    continue;
                                }
                                if (var506 == 5401) {
                                    var6 -= 2;
                                    class266.field4089[class309.field4706[var6]] = (short) class279.method1945((byte) 127, class309.field4706[var6 + 1]);
                                    class222.method1555((byte) -67);
                                    class193.method1334(false);
                                    class26.method171(115);
                                    class228.method1583(-109);
                                    class40.method270((byte) -105);
                                    continue;
                                }
                                if (var506 == 5405) {
                                    var6 -= 2;
                                    int var367 = class309.field4706[var6];
                                    int var368 = class309.field4706[var6 + 1];
                                    if (var367 >= 0 && var367 < 2) {
                                        class8.field66[var367] = new int[var368 << 1][4];
                                    }
                                    continue;
                                }
                                if (var506 == 5406) {
                                    var6 -= 7;
                                    int var369 = class309.field4706[var6];
                                    int var370 = class309.field4706[var6 + 2];
                                    int var371 = class309.field4706[var6 + 1] << 1;
                                    int var372 = class309.field4706[var6 + 3];
                                    int var373 = class309.field4706[var6 + 4];
                                    int var374 = class309.field4706[var6 + 6];
                                    int var375 = class309.field4706[var6 + 5];
                                    if (var369 >= 0 && var369 < 2 && class8.field66[var369] != null && var371 >= 0 && var371 < class8.field66[var369].length) {
                                        class8.field66[var369][var371] = new int[] { (class124.method893(var370, 268428521) >> 14) * 128, var372, class124.method893(16383, var370) * 128, var374 };
                                        class8.field66[var369][var371 + 1] = new int[] { (class124.method893(var373, 268426674) >> 14) * 128, var375, class124.method893(16383, var373) * 128 };
                                    }
                                    continue;
                                }
                                if (var506 == 5407) {
                                    var6--;
                                    int var376 = class8.field66[class309.field4706[var6]].length >> 1;
                                    class309.field4706[var6++] = var376;
                                    continue;
                                }
                                if (var506 == 5411) {
                                    if (class90.field1344 != null) {
                                        class307.method2119(-1, false, -1, false, class144.field2175);
                                    }
                                    if (class106.field1661 == null) {
                                        class97.method687(3, class28.method180(-1), false);
                                    } else {
                                        System.exit(0);
                                    }
                                    continue;
                                }
                                if (var506 == 5419) {
                                    String var377 = "";
                                    if (class135.field2056 != null) {
                                        if (class135.field2056.field3452 == null) {
                                            var377 = class96.method682(class135.field2056.field3457, 255);
                                        } else {
                                            var377 = (String) class135.field2056.field3452;
                                        }
                                    }
                                    class198.field2978[var7++] = var377;
                                    continue;
                                }
                                if (var506 == 5420) {
                                    class309.field4706[var6++] = class262.field3960 == 3 ? 1 : 0;
                                    continue;
                                }
                                if (var506 == 5421) {
                                    if (class90.field1344 != null) {
                                        class307.method2119(-1, false, -1, false, class144.field2175);
                                    }
                                    var7--;
                                    String var378 = class198.field2978[var7];
                                    var6--;
                                    boolean var379 = class309.field4706[var6] == 1;
                                    String var380 = class28.method180(-1) + var378;
                                    if (class106.field1661 == null && (!var379 || class262.field3960 == 3 || !class262.field3966.startsWith("win") || class11.field128)) {
                                        class97.method687(3, var380, var379);
                                        continue;
                                    }
                                    class268.field4116 = var380;
                                    class58.field741 = var379;
                                    class213.field3229 = class274.field4200.method1767(var380, -6225);
                                    continue;
                                }
                                if (var506 == 5422) {
                                    var7 -= 2;
                                    String var381 = class198.field2978[var7 + 1];
                                    String var382 = class198.field2978[var7];
                                    var6--;
                                    int var383 = class309.field4706[var6];
                                    if (var382.length() > 0) {
                                        if (class40.field491 == null) {
                                            class40.field491 = new String[class183.field2738[class237.field3555]];
                                        }
                                        class40.field491[var383] = var382;
                                    }
                                    if (var381.length() > 0) {
                                        if (class147.field2211 == null) {
                                            class147.field2211 = new String[class183.field2738[class237.field3555]];
                                        }
                                        class147.field2211[var383] = var381;
                                    }
                                    continue;
                                }
                                if (var506 == 5423) {
                                    var7--;
                                    System.out.println(class198.field2978[var7]);
                                    continue;
                                }
                                if (var506 == 5424) {
                                    var6 -= 11;
                                    class96.field1440 = class309.field4706[var6];
                                    class154.field2318 = class309.field4706[var6 + 1];
                                    class114.field1753 = class309.field4706[var6 + 2];
                                    class132.field2032 = class309.field4706[var6 + 3];
                                    class13.field151 = class309.field4706[var6 + 4];
                                    class164.field2474 = class309.field4706[var6 + 5];
                                    class186.field2780 = class309.field4706[var6 + 6];
                                    class49.field621 = class309.field4706[var6 + 7];
                                    class250.field3727 = class309.field4706[var6 + 8];
                                    class36.field447 = class309.field4706[var6 + 9];
                                    class223.field3403 = class309.field4706[var6 + 10];
                                    class68.field898.method1431(class13.field151, -86);
                                    class68.field898.method1431(class164.field2474, -39);
                                    class68.field898.method1431(class186.field2780, -114);
                                    class68.field898.method1431(class49.field621, -53);
                                    class68.field898.method1431(class250.field3727, arg2 ^ 0xFFFFF532);
                                    class30.field401 = true;
                                    continue;
                                }
                                if (var506 == 5425) {
                                    class138.method999(false);
                                    class30.field401 = false;
                                    continue;
                                }
                                if (var506 == 5426) {
                                    var6--;
                                    class90.field1340 = class309.field4706[var6];
                                    continue;
                                }
                                if (var506 == 5427) {
                                    var6 -= 2;
                                    class160.field2404 = class309.field4706[var6];
                                    class90.field1341 = class309.field4706[var6 + 1];
                                    continue;
                                }
                            } else if (var506 < 5600) {
                                if (var506 == 5500) {
                                    var6 -= 4;
                                    int var322 = class309.field4706[var6];
                                    int var323 = class309.field4706[var6 + 3];
                                    int var324 = class309.field4706[var6 + 2];
                                    int var325 = class309.field4706[var6 + 1];
                                    class306.method2114(var325, var324, (var322 & 0x3FFF) - class189.field2807, var323, -101, false, (var322 >> 14 & 0x3FFF) - class217.field3309);
                                    continue;
                                }
                                if (var506 == 5501) {
                                    var6 -= 4;
                                    int var326 = class309.field4706[var6 + 1];
                                    int var327 = class309.field4706[var6];
                                    int var328 = class309.field4706[var6 + 2];
                                    int var329 = class309.field4706[var6 + 3];
                                    class91.method638(((var327 & 0xFFFEF3A) >> 14) - class217.field3309, var326, (var327 & 0x3FFF) - class189.field2807, var329, false, var328);
                                    continue;
                                }
                                if (var506 == 5502) {
                                    var6 -= 6;
                                    int var330 = class309.field4706[var6];
                                    if (var330 >= 2) {
                                        throw new RuntimeException();
                                    }
                                    class41.field500 = var330;
                                    int var331 = class309.field4706[var6 + 1];
                                    if (var331 + 1 >= class8.field66[class41.field500].length >> 1) {
                                        throw new RuntimeException();
                                    }
                                    class245.field3653 = var331;
                                    class10.field105 = 0;
                                    class81.field1138 = class309.field4706[var6 + 2];
                                    class140.field2119 = class309.field4706[var6 + 3];
                                    int var332 = class309.field4706[var6 + 4];
                                    if (var332 >= 2) {
                                        throw new RuntimeException();
                                    }
                                    class69.field915 = var332;
                                    int var333 = class309.field4706[var6 + 5];
                                    if (var333 + 1 >= class8.field66[class69.field915].length >> 1) {
                                        throw new RuntimeException();
                                    }
                                    class56.field710 = 3;
                                    class101.field1600 = var333;
                                    continue;
                                }
                                if (var506 == 5503) {
                                    class296.method2068((byte) -61);
                                    continue;
                                }
                                if (var506 == 5504) {
                                    var6 -= 2;
                                    class234.field3525 = class309.field4706[var6];
                                    class284.field4297 = class309.field4706[var6 + 1];
                                    if (class56.field710 == 2) {
                                        class84.field1249 = class284.field4297;
                                        class160.field2392 = class234.field3525;
                                    }
                                    class272.method1924(-4);
                                    continue;
                                }
                                if (var506 == 5505) {
                                    class309.field4706[var6++] = class234.field3525;
                                    continue;
                                }
                                if (var506 == 5506) {
                                    class309.field4706[var6++] = class284.field4297;
                                    continue;
                                }
                            } else if (var506 < 5700) {
                                if (var506 == 5600) {
                                    var7 -= 2;
                                    String var360 = class198.field2978[var7 + 1];
                                    var6--;
                                    int var361 = class309.field4706[var6];
                                    String var362 = class198.field2978[var7];
                                    if (class293.field4490 == 10 && class49.field626 == 0 && class144.field2174 == 0 && class234.field3515 == 0 && class202.field3016 == 0) {
                                        class202.method1385(var360, (byte) 62, var362, var361);
                                    }
                                    continue;
                                }
                                if (var506 == 5601) {
                                    class236.method1619(85);
                                    continue;
                                }
                                if (var506 == 5602) {
                                    if (class144.field2174 == 0) {
                                        class170.field2555 = -2;
                                    }
                                    continue;
                                }
                                if (var506 == 5603) {
                                    var6 -= 4;
                                    if (class293.field4490 == 10 && class49.field626 == 0 && class144.field2174 == 0 && class234.field3515 == 0 && class202.field3016 == 0) {
                                        class109.method762(class309.field4706[var6 + 2], arg2 - 2778, class309.field4706[var6 + 1], class309.field4706[var6 + 3], class309.field4706[var6]);
                                    }
                                    continue;
                                }
                                if (var506 == 5604) {
                                    var7--;
                                    if (class293.field4490 == 10 && class49.field626 == 0 && class144.field2174 == 0 && class234.field3515 == 0 && class202.field3016 == 0) {
                                        class191.method1309(-122, class242.method1638(class198.field2978[var7], arg2 - 17171));
                                    }
                                    continue;
                                }
                                if (var506 == 5605) {
                                    var7 -= 3;
                                    var6 -= 7;
                                    if (class293.field4490 == 10 && class49.field626 == 0 && class144.field2174 == 0 && class234.field3515 == 0 && class202.field3016 == 0) {
                                        class67.method447((byte) -102, class242.method1638(class198.field2978[var7], -14393), class198.field2978[var7 + 2], class309.field4706[var6 + 6] == 1, class309.field4706[var6 + 5] == 1, class309.field4706[var6], class309.field4706[var6 + 4] == 1, class198.field2978[var7 + 1], class309.field4706[var6 + 3], class309.field4706[var6 + 1], class309.field4706[var6 + 2]);
                                    }
                                    continue;
                                }
                                if (var506 == 5606) {
                                    if (class234.field3515 == 0) {
                                        class56.field709 = -2;
                                    }
                                    continue;
                                }
                                if (var506 == 5607) {
                                    class309.field4706[var6++] = class170.field2555;
                                    continue;
                                }
                                if (var506 == 5608) {
                                    class309.field4706[var6++] = class247.field3683;
                                    continue;
                                }
                                if (var506 == 5609) {
                                    class309.field4706[var6++] = class56.field709;
                                    continue;
                                }
                                if (var506 == 5610) {
                                    for (int var363 = 0; var363 < 5; var363++) {
                                        class198.field2978[var7++] = var363 >= class249.field3708.length ? "" : class246.method1658(class249.field3708[var363], -128);
                                    }
                                    class249.field3708 = null;
                                    continue;
                                }
                                if (var506 == 5611) {
                                    class309.field4706[var6++] = class129.field2002;
                                    continue;
                                }
                            } else if (var506 < 6100) {
                                if (var506 == 6001) {
                                    var6--;
                                    int var351 = class309.field4706[var6];
                                    if (var351 < 1) {
                                        var351 = 1;
                                    }
                                    if (var351 > 4) {
                                        var351 = 4;
                                    }
                                    class272.field4167 = var351;
                                    if (!class117.field1817 || !class292.field4447) {
                                        if (class272.field4167 == 1) {
                                            class148.method1057(0.9F);
                                        }
                                        if (class272.field4167 == 2) {
                                            class148.method1057(0.8F);
                                        }
                                        if (class272.field4167 == 3) {
                                            class148.method1057(0.7F);
                                        }
                                        if (class272.field4167 == 4) {
                                            class148.method1057(0.6F);
                                        }
                                    }
                                    if (class117.field1817) {
                                        class49.method336(false);
                                        if (!class292.field4447) {
                                            class38.method262(true);
                                        }
                                    }
                                    class193.method1334(false);
                                    class6.method17(class274.field4200, (byte) -10);
                                    class250.field3726 = false;
                                    continue;
                                }
                                if (var506 == 6002) {
                                    var6--;
                                    class257.method1743(0, class309.field4706[var6] == 1);
                                    class217.method1493(-110);
                                    class38.method262(true);
                                    class243.method1649(-4);
                                    class6.method17(class274.field4200, (byte) 127);
                                    class250.field3726 = false;
                                    continue;
                                }
                                if (var506 == 6003) {
                                    var6--;
                                    client.field1945 = class309.field4706[var6] == 1;
                                    class243.method1649(-4);
                                    class6.method17(class274.field4200, (byte) -113);
                                    class250.field3726 = false;
                                    continue;
                                }
                                if (var506 == 6005) {
                                    var6--;
                                    class170.field2549 = class309.field4706[var6] == 1;
                                    class38.method262(true);
                                    class6.method17(class274.field4200, (byte) 109);
                                    class250.field3726 = false;
                                    continue;
                                }
                                if (var506 == 6006) {
                                    var6--;
                                    class151.field2274 = class309.field4706[var6] == 1;
                                    ((class292) class148.field2233).method2042(!class151.field2274, arg2 + 7594);
                                    class6.method17(class274.field4200, (byte) 7);
                                    class250.field3726 = false;
                                    continue;
                                }
                                if (var506 == 6007) {
                                    var6--;
                                    class97.field1467 = class309.field4706[var6] == 1;
                                    class6.method17(class274.field4200, (byte) 6);
                                    class250.field3726 = false;
                                    continue;
                                }
                                if (var506 == 6008) {
                                    var6--;
                                    class210.field3171 = class309.field4706[var6] == 1;
                                    class6.method17(class274.field4200, (byte) -122);
                                    class250.field3726 = false;
                                    continue;
                                }
                                if (var506 == 6009) {
                                    var6--;
                                    class233.field3506 = class309.field4706[var6] == 1;
                                    class6.method17(class274.field4200, (byte) -25);
                                    class250.field3726 = false;
                                    continue;
                                }
                                if (var506 == 6010) {
                                    var6--;
                                    class130.field2019 = class309.field4706[var6] == 1;
                                    class6.method17(class274.field4200, (byte) -120);
                                    class250.field3726 = false;
                                    continue;
                                }
                                if (var506 == 6011) {
                                    var6--;
                                    int var352 = class309.field4706[var6];
                                    if (var352 < 0 || var352 > 2) {
                                        var352 = 0;
                                    }
                                    class284.field4298 = var352;
                                    class6.method17(class274.field4200, (byte) 72);
                                    class250.field3726 = false;
                                    continue;
                                }
                                if (var506 == 6012) {
                                    if (class117.field1817) {
                                        class204.method1397(arg2 - 2895, 0, 0);
                                    }
                                    var6--;
                                    class292.field4447 = class309.field4706[var6] == 1;
                                    if (class117.field1817 && class292.field4447) {
                                        class148.method1057(0.7F);
                                    } else {
                                        if (class272.field4167 == 1) {
                                            class148.method1057(0.9F);
                                        }
                                        if (class272.field4167 == 2) {
                                            class148.method1057(0.8F);
                                        }
                                        if (class272.field4167 == 3) {
                                            class148.method1057(0.7F);
                                        }
                                        if (class272.field4167 == 4) {
                                            class148.method1057(0.6F);
                                        }
                                    }
                                    class38.method262(true);
                                    class6.method17(class274.field4200, (byte) -126);
                                    class250.field3726 = false;
                                    continue;
                                }
                                if (var506 == 6014) {
                                    var6--;
                                    class45.field569 = class309.field4706[var6] == 1;
                                    if (class117.field1817) {
                                        class38.method262(true);
                                    }
                                    class6.method17(class274.field4200, (byte) 89);
                                    class250.field3726 = false;
                                    continue;
                                }
                                if (var506 == 6015) {
                                    var6--;
                                    class197.field2968 = class309.field4706[var6] == 1;
                                    if (class117.field1817) {
                                        class49.method336(false);
                                    }
                                    class6.method17(class274.field4200, (byte) -124);
                                    class250.field3726 = false;
                                    continue;
                                }
                                if (var506 == 6016) {
                                    var6--;
                                    int var353 = class309.field4706[var6];
                                    if (class117.field1817) {
                                        class149.field2248 = true;
                                    }
                                    if (var353 < 0 || var353 > 2) {
                                        var353 = 0;
                                    }
                                    class194.field2902 = var353;
                                    continue;
                                }
                                if (var506 == 6017) {
                                    var6--;
                                    class178.field2630 = class309.field4706[var6] == 1;
                                    class144.method1033(-1);
                                    class6.method17(class274.field4200, (byte) -26);
                                    class250.field3726 = false;
                                    continue;
                                }
                                if (var506 == 6018) {
                                    var6--;
                                    int var354 = class309.field4706[var6];
                                    if (var354 < 0) {
                                        var354 = 0;
                                    }
                                    if (var354 > 127) {
                                        var354 = 127;
                                    }
                                    class287.field4341 = var354;
                                    class6.method17(class274.field4200, (byte) -128);
                                    class250.field3726 = false;
                                    continue;
                                }
                                if (var506 == 6019) {
                                    var6--;
                                    int var355 = class309.field4706[var6];
                                    if (var355 < 0) {
                                        var355 = 0;
                                    }
                                    if (var355 > 255) {
                                        var355 = 255;
                                    }
                                    if (class115.field1760 != var355) {
                                        if (class115.field1760 == 0 && class195.field2943 != -1) {
                                            class104.method732(0, class195.field2943, class48.field613, var355, -123, false);
                                            class146.field2205 = false;
                                        } else if (var355 == 0) {
                                            class169.method1174(arg2 - 2888);
                                            class146.field2205 = false;
                                        } else {
                                            class196.method1350(23881, var355);
                                        }
                                        class115.field1760 = var355;
                                    }
                                    class6.method17(class274.field4200, (byte) -114);
                                    class250.field3726 = false;
                                    continue;
                                }
                                if (var506 == 6020) {
                                    var6--;
                                    int var356 = class309.field4706[var6];
                                    if (var356 < 0) {
                                        var356 = 0;
                                    }
                                    if (var356 > 127) {
                                        var356 = 127;
                                    }
                                    class272.field4183 = var356;
                                    class6.method17(class274.field4200, (byte) 74);
                                    class250.field3726 = false;
                                    continue;
                                }
                                if (var506 == 6021) {
                                    var6--;
                                    class269.field4120 = class309.field4706[var6] == 1;
                                    class243.method1649(arg2 - 2782);
                                    continue;
                                }
                                if (var506 == 6023) {
                                    var6--;
                                    int var357 = class309.field4706[var6];
                                    boolean var358 = false;
                                    if (var357 < 0) {
                                        var357 = 0;
                                    }
                                    if (var357 > 2) {
                                        var357 = 2;
                                    }
                                    if (class84.field1251 < 96) {
                                        var358 = true;
                                        var357 = 0;
                                    }
                                    class18.method118(var357);
                                    class6.method17(class274.field4200, (byte) -118);
                                    class250.field3726 = false;
                                    class309.field4706[var6++] = var358 ? 0 : 1;
                                    continue;
                                }
                                if (var506 == 6024) {
                                    var6--;
                                    int var359 = class309.field4706[var6];
                                    if (var359 < 0 || var359 > 2) {
                                        var359 = 0;
                                    }
                                    class157.field2348 = var359;
                                    class6.method17(class274.field4200, (byte) 53);
                                    continue;
                                }
                                if (var506 == 6028) {
                                    var6--;
                                    class36.field442 = class309.field4706[var6] != 0;
                                    class6.method17(class274.field4200, (byte) -110);
                                    continue;
                                }
                            } else if (var506 < 6200) {
                                if (var506 == 6101) {
                                    class309.field4706[var6++] = class272.field4167;
                                    continue;
                                }
                                if (var506 == 6102) {
                                    class309.field4706[var6++] = class80.method540(class206.method1421(arg2, 2776)) ? 1 : 0;
                                    continue;
                                }
                                if (var506 == 6103) {
                                    class309.field4706[var6++] = client.field1945 ? 1 : 0;
                                    continue;
                                }
                                if (var506 == 6105) {
                                    class309.field4706[var6++] = class170.field2549 ? 1 : 0;
                                    continue;
                                }
                                if (var506 == 6106) {
                                    class309.field4706[var6++] = class151.field2274 ? 1 : 0;
                                    continue;
                                }
                                if (var506 == 6107) {
                                    class309.field4706[var6++] = class97.field1467 ? 1 : 0;
                                    continue;
                                }
                                if (var506 == 6108) {
                                    class309.field4706[var6++] = class210.field3171 ? 1 : 0;
                                    continue;
                                }
                                if (var506 == 6109) {
                                    class309.field4706[var6++] = class233.field3506 ? 1 : 0;
                                    continue;
                                }
                                if (var506 == 6110) {
                                    class309.field4706[var6++] = class130.field2019 ? 1 : 0;
                                    continue;
                                }
                                if (var506 == 6111) {
                                    class309.field4706[var6++] = class284.field4298;
                                    continue;
                                }
                                if (var506 == 6112) {
                                    class309.field4706[var6++] = class292.field4447 ? 1 : 0;
                                    continue;
                                }
                                if (var506 == 6114) {
                                    class309.field4706[var6++] = class45.field569 ? 1 : 0;
                                    continue;
                                }
                                if (var506 == 6115) {
                                    class309.field4706[var6++] = class197.field2968 ? 1 : 0;
                                    continue;
                                }
                                if (var506 == 6116) {
                                    class309.field4706[var6++] = class194.field2902;
                                    continue;
                                }
                                if (var506 == 6117) {
                                    class309.field4706[var6++] = class178.field2630 ? 1 : 0;
                                    continue;
                                }
                                if (var506 == 6118) {
                                    class309.field4706[var6++] = class287.field4341;
                                    continue;
                                }
                                if (var506 == 6119) {
                                    class309.field4706[var6++] = class115.field1760;
                                    continue;
                                }
                                if (var506 == 6120) {
                                    class309.field4706[var6++] = class272.field4183;
                                    continue;
                                }
                                if (var506 == 6121) {
                                    if (class117.field1817) {
                                        class309.field4706[var6++] = class117.field1821 ? 1 : 0;
                                    } else {
                                        class309.field4706[var6++] = 0;
                                    }
                                    continue;
                                }
                                if (var506 == 6123) {
                                    class309.field4706[var6++] = class18.method117();
                                    continue;
                                }
                                if (var506 == 6124) {
                                    class309.field4706[var6++] = class157.field2348;
                                    continue;
                                }
                                if (var506 == 6128) {
                                    class309.field4706[var6++] = class36.field442 ? 1 : 0;
                                    continue;
                                }
                            } else if (var506 < 6300) {
                                if (var506 == 6200) {
                                    var6 -= 2;
                                    class57.field715 = (short) class309.field4706[var6];
                                    if (class57.field715 <= 0) {
                                        class57.field715 = 256;
                                    }
                                    class288.field4345 = (short) class309.field4706[var6 + 1];
                                    if (class288.field4345 <= 0) {
                                        class288.field4345 = 205;
                                    }
                                    continue;
                                }
                                if (var506 == 6201) {
                                    var6 -= 2;
                                    class192.field2886 = (short) class309.field4706[var6];
                                    if (class192.field2886 <= 0) {
                                        class192.field2886 = 256;
                                    }
                                    class54.field678 = (short) class309.field4706[var6 + 1];
                                    if (class54.field678 <= 0) {
                                        class54.field678 = 320;
                                    }
                                    continue;
                                }
                                if (var506 == 6202) {
                                    var6 -= 4;
                                    class106.field1658 = (short) class309.field4706[var6];
                                    if (class106.field1658 <= 0) {
                                        class106.field1658 = 1;
                                    }
                                    class252.field3756 = (short) class309.field4706[var6 + 1];
                                    if (class252.field3756 <= 0) {
                                        class252.field3756 = 32767;
                                    } else if (class106.field1658 > class252.field3756) {
                                        class252.field3756 = class106.field1658;
                                    }
                                    class236.field3543 = (short) class309.field4706[var6 + 2];
                                    if (class236.field3543 <= 0) {
                                        class236.field3543 = 1;
                                    }
                                    class213.field3237 = (short) class309.field4706[var6 + 3];
                                    if (class213.field3237 <= 0) {
                                        class213.field3237 = 32767;
                                    } else if (class236.field3543 > class213.field3237) {
                                        class213.field3237 = class236.field3543;
                                    }
                                    continue;
                                }
                                if (var506 == 6203) {
                                    class257.method1744(0, 0, false, 334, class164.field2480.field4994, class164.field2480.field5018);
                                    class309.field4706[var6++] = class126.field1972;
                                    class309.field4706[var6++] = class176.field2603;
                                    continue;
                                }
                                if (var506 == 6204) {
                                    class309.field4706[var6++] = class192.field2886;
                                    class309.field4706[var6++] = class54.field678;
                                    continue;
                                }
                                if (var506 == 6205) {
                                    class309.field4706[var6++] = class57.field715;
                                    class309.field4706[var6++] = class288.field4345;
                                    continue;
                                }
                            } else if (var506 < 6400) {
                                if (var506 == 6300) {
                                    class309.field4706[var6++] = (int) (class231.method1594(-20375) / 60000L);
                                    continue;
                                }
                                if (var506 == 6301) {
                                    class309.field4706[var6++] = (int) (class231.method1594(-20375) / 86400000L) - 11745;
                                    continue;
                                }
                                if (var506 == 6302) {
                                    var6 -= 3;
                                    int var334 = class309.field4706[var6];
                                    int var335 = class309.field4706[var6 + 1];
                                    int var336 = class309.field4706[var6 + 2];
                                    class242.field3619.clear();
                                    class242.field3619.set(11, 12);
                                    class242.field3619.set(var336, var335, var334);
                                    class309.field4706[var6++] = (int) (class242.field3619.getTime().getTime() / 86400000L) - 11745;
                                    continue;
                                }
                                if (var506 == 6303) {
                                    class242.field3619.clear();
                                    class242.field3619.setTime(new Date(class231.method1594(-20375)));
                                    class309.field4706[var6++] = class242.field3619.get(1);
                                    continue;
                                }
                                if (var506 == 6304) {
                                    var6--;
                                    int var337 = class309.field4706[var6];
                                    boolean var338 = true;
                                    if (var337 < 0) {
                                        var338 = (var337 + 1) % 4 == 0;
                                    } else if (var337 < 1582) {
                                        var338 = (var337 % 4) == 0;
                                    } else if (var337 % 4 != 0) {
                                        var338 = false;
                                    } else if (var337 % 100 != 0) {
                                        var338 = true;
                                    } else if ((var337 % 400) != 0) {
                                        var338 = false;
                                    }
                                    class309.field4706[var6++] = var338 ? 1 : 0;
                                    continue;
                                }
                            } else if (var506 < 6500) {
                                if (var506 == 6405) {
                                    class309.field4706[var6++] = class72.method465((byte) 126) ? 1 : 0;
                                    continue;
                                }
                                if (var506 == 6406) {
                                    class309.field4706[var6++] = class193.method1335(false) ? 1 : 0;
                                    continue;
                                }
                            } else if (var506 < 6600) {
                                if (var506 == 6500) {
                                    if (class293.field4490 == 10 && class49.field626 == 0 && class144.field2174 == 0 && class234.field3515 == 0) {
                                        class309.field4706[var6++] = class197.method1357(arg2 - 30664) == -1 ? 0 : 1;
                                        continue;
                                    }
                                    class309.field4706[var6++] = 1;
                                    continue;
                                }
                                if (var506 == 6501) {
                                    class178 var339 = class29.method186(false);
                                    if (var339 == null) {
                                        class309.field4706[var6++] = -1;
                                        class309.field4706[var6++] = 0;
                                        class198.field2978[var7++] = "";
                                        class309.field4706[var6++] = 0;
                                        class198.field2978[var7++] = "";
                                        class309.field4706[var6++] = 0;
                                    } else {
                                        class309.field4706[var6++] = var339.field2643;
                                        class309.field4706[var6++] = var339.field164;
                                        class198.field2978[var7++] = var339.field2635;
                                        class146 var340 = var339.method1230(arg2 ^ 0xFFFFF525);
                                        class309.field4706[var6++] = var340.field2208;
                                        class198.field2978[var7++] = var340.field2203;
                                        class309.field4706[var6++] = var339.field165;
                                    }
                                    continue;
                                }
                                if (var506 == 6502) {
                                    class178 var341 = class135.method987(false);
                                    if (var341 == null) {
                                        class309.field4706[var6++] = -1;
                                        class309.field4706[var6++] = 0;
                                        class198.field2978[var7++] = "";
                                        class309.field4706[var6++] = 0;
                                        class198.field2978[var7++] = "";
                                        class309.field4706[var6++] = 0;
                                    } else {
                                        class309.field4706[var6++] = var341.field2643;
                                        class309.field4706[var6++] = var341.field164;
                                        class198.field2978[var7++] = var341.field2635;
                                        class146 var342 = var341.method1230(arg2 - 2779);
                                        class309.field4706[var6++] = var342.field2208;
                                        class198.field2978[var7++] = var342.field2203;
                                        class309.field4706[var6++] = var341.field165;
                                    }
                                    continue;
                                }
                                if (var506 == 6503) {
                                    var6--;
                                    int var343 = class309.field4706[var6];
                                    if (class293.field4490 == 10 && class49.field626 == 0 && class144.field2174 == 0 && class234.field3515 == 0) {
                                        class309.field4706[var6++] = class196.method1351(var343, false) ? 1 : 0;
                                        continue;
                                    }
                                    class309.field4706[var6++] = 0;
                                    continue;
                                }
                                if (var506 == 6504) {
                                    var6--;
                                    class294.field4499 = class309.field4706[var6];
                                    class6.method17(class274.field4200, (byte) -117);
                                    continue;
                                }
                                if (var506 == 6505) {
                                    class309.field4706[var6++] = class294.field4499;
                                    continue;
                                }
                                if (var506 == 6506) {
                                    var6--;
                                    int var344 = class309.field4706[var6];
                                    class178 var345 = class205.method1410(var344, 2586);
                                    if (var345 == null) {
                                        class309.field4706[var6++] = -1;
                                        class198.field2978[var7++] = "";
                                        class309.field4706[var6++] = 0;
                                        class198.field2978[var7++] = "";
                                        class309.field4706[var6++] = 0;
                                    } else {
                                        class309.field4706[var6++] = var345.field164;
                                        class198.field2978[var7++] = var345.field2635;
                                        class146 var346 = var345.method1230(-1);
                                        class309.field4706[var6++] = var346.field2208;
                                        class198.field2978[var7++] = var346.field2203;
                                        class309.field4706[var6++] = var345.field165;
                                    }
                                    continue;
                                }
                                if (var506 == 6507) {
                                    var6 -= 4;
                                    int var347 = class309.field4706[var6];
                                    boolean var348 = class309.field4706[var6 + 1] == 1;
                                    boolean var349 = class309.field4706[var6 + 3] == 1;
                                    int var350 = class309.field4706[var6 + 2];
                                    class225.method1570(var348, var349, (byte) -76, var347, var350);
                                    continue;
                                }
                            } else if (var506 < 6700) {
                                if (var506 == 6600) {
                                    var6--;
                                    class131.field2025 = class309.field4706[var6] == 1;
                                    class6.method17(class274.field4200, (byte) 38);
                                    continue;
                                }
                                if (var506 == 6601) {
                                    class309.field4706[var6++] = class131.field2025 ? 1 : 0;
                                    continue;
                                }
                            }
                        } else if (var506 == 4500) {
                            var6 -= 2;
                            int var397 = class309.field4706[var6 + 1];
                            int var398 = class309.field4706[var6];
                            class63 var399 = class104.method733(var397, true);
                            if (var399.method413((byte) -105)) {
                                class198.field2978[var7++] = class141.method1013(var398, (byte) 117).method877((byte) -29, var397, var399.field827);
                            } else {
                                class309.field4706[var6++] = class141.method1013(var398, (byte) 117).method876(var399.field837, var397, (byte) -43);
                            }
                            continue;
                        }
                    } else if (var506 == 4300) {
                        var6 -= 2;
                        int var400 = class309.field4706[var6];
                        int var401 = class309.field4706[var6 + 1];
                        class63 var402 = class104.method733(var401, true);
                        if (var402.method413((byte) -105)) {
                            class198.field2978[var7++] = class235.method1615(var400, 1128).method392(31852, var401, var402.field827);
                        } else {
                            class309.field4706[var6++] = class235.method1615(var400, 1128).method387(-7363, var402.field837, var401);
                        }
                        continue;
                    }
                } else {
                    class329 var63;
                    if (var506 < 2000) {
                        var63 = var46 ? class61.field800 : class245.field3657;
                    } else {
                        var6--;
                        var63 = class80.method541((byte) 96, class309.field4706[var6]);
                        var506 -= 1000;
                    }
                    if (var506 == 1300) {
                        var6--;
                        int var64 = class309.field4706[var6] - 1;
                        if (var64 >= 0 && var64 <= 9) {
                            var7--;
                            var63.method2247(0, var64, class198.field2978[var7]);
                            continue;
                        }
                        var7--;
                        continue;
                    }
                    if (var506 == 1301) {
                        var6 -= 2;
                        int var65 = class309.field4706[var6];
                        int var66 = class309.field4706[var6 + 1];
                        var63.field5027 = class10.method48(var66, var65, (byte) 100);
                        continue;
                    }
                    if (var506 == 1302) {
                        var6--;
                        var63.field5001 = class309.field4706[var6] == 1;
                        continue;
                    }
                    if (var506 == 1303) {
                        var6--;
                        var63.field5024 = class309.field4706[var6];
                        continue;
                    }
                    if (var506 == 1304) {
                        var6--;
                        var63.field4993 = class309.field4706[var6];
                        continue;
                    }
                    if (var506 == 1305) {
                        var7--;
                        var63.field4992 = class198.field2978[var7];
                        continue;
                    }
                    if (var506 == 1306) {
                        var7--;
                        var63.field5077 = class198.field2978[var7];
                        continue;
                    }
                    if (var506 == 1307) {
                        var63.field4942 = null;
                        continue;
                    }
                    if (var506 == 1308) {
                        var6--;
                        var63.field4985 = class309.field4706[var6];
                        var6--;
                        var63.field5058 = class309.field4706[var6];
                        continue;
                    }
                    if (var506 == 1309) {
                        var6--;
                        int var67 = class309.field4706[var6];
                        var6--;
                        int var68 = class309.field4706[var6];
                        if (var68 >= 1 && var68 <= 10) {
                            var63.method2248(var68 - 1, var67, -15712);
                        }
                        continue;
                    }
                }
                throw new IllegalStateException();
            }
        } catch (Exception var505) {
            if (var5.field2135 == null) {
                if (class252.field3769 != 0) {
                    class92.method656(0, "Clientscript error - check log for details", "", -1);
                }
                class19.method122(var505, "CS2 - scr:" + var5.field1603 + " op:" + var11, (byte) -105);
            } else {
                StringBuffer var502 = new StringBuffer(30);
                var502.append("%0a - in: ").append(var5.field2135);
                for (int var503 = class145.field2193 - 1; var503 >= 0; var503--) {
                    var502.append("%0a - via: ").append(class221.field3362[var503].field235.field2135);
                }
                if (var11 == 40) {
                    int var504 = var10[var8];
                    var502.append("%0a - non-existant gosub script-num: ").append(Integer.toString(var504));
                }
                if (class252.field3769 != 0) {
                    class92.method656(0, "Clientscript error in: " + var5.field2135, "", -1);
                }
                class19.method122(var505, "CS2 - scr:" + var5.field1603 + " op:" + var11 + var502.toString(), (byte) -109);
            }
        }
    }
}
