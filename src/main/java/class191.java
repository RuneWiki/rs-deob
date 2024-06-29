import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ah")
public class class191 {

    @OriginalMember(owner = "client!ah", name = "y", descriptor = "I")
    private int field2939 = -32768;

    @OriginalMember(owner = "client!ah", name = "D", descriptor = "Z")
    private boolean field2944 = false;

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "Z")
    private boolean field2916 = false;

    @OriginalMember(owner = "client!ah", name = "C", descriptor = "I")
    private int field2943 = -1;

    @OriginalMember(owner = "client!ah", name = "h", descriptor = "I")
    private int field2922 = -1;

    @OriginalMember(owner = "client!ah", name = "n", descriptor = "I")
    private int field2928;

    @OriginalMember(owner = "client!ah", name = "u", descriptor = "B")
    private byte field2935;

    @OriginalMember(owner = "client!ah", name = "c", descriptor = "I")
    public int field2917;

    @OriginalMember(owner = "client!ah", name = "H", descriptor = "B")
    private byte field2948;

    @OriginalMember(owner = "client!ah", name = "K", descriptor = "I")
    public int field2951;

    @OriginalMember(owner = "client!ah", name = "F", descriptor = "I")
    public int field2946;

    @OriginalMember(owner = "client!ah", name = "k", descriptor = "I")
    private int field2925;

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "Z")
    private boolean field2915;

    @OriginalMember(owner = "client!ah", name = "m", descriptor = "I")
    public static int field2927 = 999999;

    @OriginalMember(owner = "client!ah", name = "q", descriptor = "Z")
    public static boolean field2931 = false;

    @OriginalMember(owner = "client!ah", name = "o", descriptor = "Lpn;")
    public static class49 field2929 = new class49(72, 6);

    @OriginalMember(owner = "client!ah", name = "E", descriptor = "F")
    public static float field2945;

    @OriginalMember(owner = "client!ah", name = "d", descriptor = "I")
    public static int field2918;

    @OriginalMember(owner = "client!ah", name = "e", descriptor = "I")
    public static int field2919;

    @OriginalMember(owner = "client!ah", name = "g", descriptor = "I")
    public static int field2921;

    @OriginalMember(owner = "client!ah", name = "i", descriptor = "I")
    public static int field2923;

    @OriginalMember(owner = "client!ah", name = "j", descriptor = "I")
    public static int field2924;

    @OriginalMember(owner = "client!ah", name = "l", descriptor = "I")
    public static int field2926;

    @OriginalMember(owner = "client!ah", name = "r", descriptor = "I")
    public static int field2932;

    @OriginalMember(owner = "client!ah", name = "s", descriptor = "I")
    public static int field2933;

    @OriginalMember(owner = "client!ah", name = "t", descriptor = "I")
    private int field2934;

    @OriginalMember(owner = "client!ah", name = "v", descriptor = "I")
    public static int field2936;

    @OriginalMember(owner = "client!ah", name = "w", descriptor = "I")
    public static int field2937;

    @OriginalMember(owner = "client!ah", name = "A", descriptor = "I")
    private int field2941;

    @OriginalMember(owner = "client!ah", name = "G", descriptor = "I")
    private int field2947;

    @OriginalMember(owner = "client!ah", name = "I", descriptor = "I")
    private int field2949;

    @OriginalMember(owner = "client!ah", name = "J", descriptor = "I")
    public static int field2950;

    @OriginalMember(owner = "client!ah", name = "z", descriptor = "Li;")
    private class200 field2940;

    @OriginalMember(owner = "client!ah", name = "x", descriptor = "Le;")
    private class289 field2938;

    @OriginalMember(owner = "client!ah", name = "B", descriptor = "Ltd;")
    public class382 field2942;

    @OriginalMember(owner = "client!ah", name = "p", descriptor = "Lkt;")
    private class61 field2930;

    @OriginalMember(owner = "client!ah", name = "f", descriptor = "[Z")
    private boolean[] field2920;

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(III)V", line = 16)
    private final void method1318(int arg0, int arg1, int arg2) {
        if (arg1 != -1) {
            this.field2949 = -104;
        }
        field2937++;
        label92: while (true) {
            if (this.field2930 == null) {
                if (this.field2916) {
                    return;
                }
                this.method1326((byte) -111, -1);
                if (this.field2930 == null) {
                    return;
                }
            }
            int var4 = class446.field6625 - this.field2949;
            if (var4 > 100 && this.field2930.field973 > 0) {
                int var5 = this.field2930.field976.length - this.field2930.field973;
                while (this.field2941 < var5 && this.field2930.field962[this.field2941] < var4) {
                    var4 -= this.field2930.field962[this.field2941];
                    this.field2941++;
                }
                if (var5 <= this.field2941) {
                    int var6 = 0;
                    for (int var7 = var5; var7 < this.field2930.field976.length; var7++) {
                        var6 += this.field2930.field962[var7];
                    }
                    var4 %= var6;
                }
                this.field2934 = this.field2941 + 1;
                if (this.field2930.field976.length <= this.field2934) {
                    this.field2934 -= this.field2930.field973;
                    if (this.field2934 < 0 || this.field2934 >= this.field2930.field976.length) {
                        this.field2934 = -1;
                    }
                }
            }
            while (true) {
                do {
                    do {
                        if (var4 <= this.field2930.field962[this.field2941]) {
                            this.field2949 = class446.field6625 - var4;
                            this.field2947 = var4;
                            return;
                        }
                        class439.method2721(false, this.field2930, arg2, this.field2941, (byte) 116, arg0, this.field2948);
                        var4 -= this.field2930.field962[this.field2941];
                        this.field2941++;
                        if (this.field2941 >= this.field2930.field976.length) {
                            this.field2941 -= this.field2930.field973;
                            if (this.field2941 < 0 || this.field2941 >= this.field2930.field976.length) {
                                this.field2930 = null;
                                continue label92;
                            }
                        }
                        this.field2934 = this.field2941 + 1;
                    } while (this.field2930.field976.length > this.field2934);
                    this.field2934 -= this.field2930.field973;
                } while (this.field2934 >= 0 && this.field2934 < this.field2930.field976.length);
                this.field2934 = -1;
            }
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(ILza;)V", line = 113)
    public final void method1319(int arg0, class299 arg1) {
        this.method1322(this.field2928, arg1, (byte) -123, true, true, 262144, this.field2925);
        if (arg0 <= 32) {
            this.field2951 = 48;
        }
        field2918++;
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(BI)V", line = 124)
    public final void method1320(byte arg0, int arg1) {
        int var3 = 0 % ((-arg0 - 68) / 56);
        this.field2916 = true;
        field2924++;
        this.method1326((byte) 111, arg1);
    }

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "(ILza;)V", line = 136)
    public final void method1321(int arg0, class299 arg1) {
        field2932++;
        if (arg0 == -32004 && this.field2940 != null) {
            class470.method2852(this.field2940, this.field2935, this.field2928, this.field2925, this.field2920);
            this.field2920 = null;
            this.field2940 = null;
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(ILza;BZZII)Le;", line = 167)
    public final class289 method1322(int arg0, class299 arg1, byte arg2, boolean arg3, boolean arg4, int arg5, int arg6) {
        field2950++;
        class395 var8 = class247.field3693.method2281(this.field2946, -9380);
        if (arg2 > -113) {
            this.method1322(75, null, (byte) -40, false, true, 24, 123);
        }
        if (var8.field5825 != null) {
            var8 = var8.method2485(class288.field4476, 120);
        }
        if (var8 == null) {
            this.method1321(-32004, arg1);
            this.field2922 = this.field2941;
            this.field2943 = -1;
            return null;
        }
        if (!this.field2916 && this.field2943 != var8.field5831) {
            this.field2938 = null;
            this.method1326((byte) 127, -1);
        }
        this.method1318(arg6, -1, arg0);
        boolean var9 = arg3 & this.field2915 & class40.field667.method1836(127, class108.field1631) != 0;
        boolean var10 = var9 & (this.field2943 != var8.field5831 || (this.field2941 != this.field2922 || this.field2930 != null && (this.field2930.field955 || class29.field324) && this.field2941 != this.field2934) && class40.field667.method1836(127, class108.field1631) >= 2);
        if (arg4 && !var10) {
            this.field2922 = this.field2941;
            this.field2943 = var8.field5831;
            return null;
        }
        if (var10) {
            class470.method2852(this.field2940, this.field2935, this.field2928, this.field2925, this.field2920);
        }
        class11 var11 = class407.field6024[this.field2935];
        class11 var12;
        if (this.field2944) {
            var12 = class274.field4306[0];
        } else {
            var12 = this.field2935 < 3 ? class407.field6024[this.field2935 + 1] : null;
        }
        class289 var13 = null;
        if (this.field2930 != null) {
            if (var10) {
                arg5 |= 0x40000;
            }
            var13 = var8.method2488(this.field2930, this.field2951 == 11 ? 10 : this.field2951, this.field2951 == 11 ? this.field2917 + 4 : this.field2917, arg1, this.field2925, var11.method68(this.field2928, this.field2925), this.field2947, (byte) -2, this.field2934, var11, this.field2928, arg5, this.field2941, var12);
            if (var13 == null) {
                this.field2939 = 0;
                this.field2920 = null;
                this.field2940 = null;
            } else {
                if (var10) {
                    if (this.field2920 == null) {
                        this.field2920 = new boolean[4];
                    }
                    this.field2940 = var13.method636(this.field2940);
                    class205.method1434(this.field2940, this.field2935, arg0, arg6, this.field2920);
                }
                this.field2939 = var13.method654();
            }
            this.field2938 = null;
        } else if (this.field2938 != null && arg5 == (arg5 & this.field2938.method679()) && this.field2943 == var8.field5831) {
            var13 = this.field2938;
        } else {
            if (this.field2938 != null) {
                arg5 |= this.field2938.method679();
            }
            class396 var14 = var8.method2499(var11, arg5, this.field2951 == 11 ? 10 : this.field2951, var11.method68(this.field2928, this.field2925), this.field2925, arg1, this.field2951 == 11 ? this.field2917 + 4 : this.field2917, var10, this.field2928, (byte) 62, var12);
            if (var14 == null) {
                this.field2920 = null;
                this.field2939 = 0;
                this.field2940 = null;
                this.field2938 = null;
            } else {
                var13 = var14.field5853;
                this.field2938 = var14.field5853;
                if (var10) {
                    this.field2920 = null;
                    this.field2940 = var14.field5850;
                    class205.method1434(this.field2940, this.field2935, arg0, arg6, null);
                }
                this.field2939 = var13.method654();
            }
        }
        this.field2922 = this.field2941;
        this.field2943 = var8.field5831;
        this.field2928 = arg0;
        this.field2925 = arg6;
        return var13;
    }

    @OriginalMember(owner = "client!ah", name = "<init>", descriptor = "(Lza;Lii;IIIIIIZI)V", line = 539)
    public class191(class299 arg0, class395 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, int arg9) {
        this.field2928 = arg6;
        this.field2935 = (byte) arg5;
        this.field2917 = arg3;
        this.field2948 = (byte) arg4;
        this.field2951 = arg2;
        this.field2946 = arg1.field5831;
        this.field2925 = arg7;
        this.field2944 = arg8;
        this.field2915 = arg0.method573() && arg1.field5801 && !this.field2944;
        if (arg9 != -1) {
            this.field2916 = true;
        }
        this.method1326((byte) 105, arg9);
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(IILza;ZLe;III)V", line = 298)
    public final void method1323(int arg0, int arg1, class299 arg2, boolean arg3, class289 arg4, int arg5, int arg6, int arg7) {
        field2921++;
        if (arg1 != -2376) {
            this.field2951 = -103;
        }
        class476[] var9 = arg4.method665();
        class349[] var10 = arg4.method634();
        if ((this.field2942 == null || this.field2942.field5606) && (var9 != null || var10 != null)) {
            class395 var11 = class247.field3693.method2281(this.field2946, -9380);
            if (var11.field5825 != null) {
                var11 = var11.method2485(class288.field4476, 117);
            }
            if (var11 != null) {
                this.field2942 = new class382(class446.field6625);
            }
        }
        if (this.field2942 == null) {
            return;
        }
        if (arg3) {
            this.field2942.method2421(arg2, (long) class446.field6625, var9, var10, false);
        } else {
            this.field2942.method2423((long) class446.field6625);
        }
        this.field2942.method2431(this.field2948, arg5, arg6, arg0, arg7);
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(B)I", line = 339)
    public final int method1324(byte arg0) {
        if (arg0 == -57) {
            field2936++;
            return this.field2939;
        } else {
            return 114;
        }
    }

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "(B)V", line = 353)
    public static void method1325(byte arg0) {
        field2929 = null;
        if (arg0 != -124) {
            field2931 = true;
        }
    }

    @OriginalMember(owner = "client!ah", name = "finalize", descriptor = "()V", line = 370)
    protected final void finalize() {
        if (this.field2942 != null) {
            this.field2942.method2430();
        }
        field2933++;
    }

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "(BI)V", line = 383)
    private final void method1326(byte arg0, int arg1) {
        field2919++;
        int var3 = -104 % ((-arg0 - 25) / 61);
        int var4 = arg1;
        boolean var5 = false;
        if (arg1 == -1) {
            class395 var6 = class247.field3693.method2281(this.field2946, -9380);
            class395 var7 = var6;
            if (var6.field5825 != null) {
                var6 = var6.method2485(class288.field4476, 118);
            }
            if (var6 == null) {
                return;
            }
            if (var6 == var7) {
                var7 = null;
            }
            if (var6.field5804 != null) {
                if (this.field2930 != null && var6.method2495(27448, this.field2930.field953)) {
                    return;
                }
                var4 = var6.method2491(84);
                if (this.field2943 != var6.field5831) {
                    var5 = var6.field5819;
                }
            } else if (var6.field5780 == -1) {
                if (var7 != null && var7.field5804 != null) {
                    if (this.field2930 != null && var7.method2495(27448, this.field2930.field953)) {
                        return;
                    }
                    var4 = var7.method2491(-72);
                    if (this.field2943 != var7.field5831) {
                        var5 = var7.field5819;
                    }
                } else if (var7 != null && var7.field5780 != -1 && this.field2943 != var7.field5831) {
                    var5 = var7.field5819;
                    var4 = var7.field5780;
                }
            } else if (this.field2943 != var6.field5831) {
                var4 = var6.field5780;
                var5 = var6.field5819;
            }
        }
        if (var4 == -1) {
            this.field2930 = null;
            return;
        }
        this.field2938 = null;
        if (this.field2930 == null || this.field2930.field953 != var4) {
            this.field2930 = class393.field5735.method1538(-4031, var4);
        } else if (this.field2930.field954 == 0) {
            return;
        }
        if (this.field2930.field976 == null) {
            this.field2930 = null;
            return;
        }
        if (var5) {
            this.field2941 = (int) ((double) this.field2930.field976.length * Math.random());
            this.field2947 = ((int) ((double) this.field2930.field962[this.field2941] * Math.random())) + 1;
        } else {
            this.field2941 = 0;
            this.field2947 = 1;
        }
        this.field2934 = this.field2941 + 1;
        if (this.field2934 < 0 || this.field2930.field976.length <= this.field2934) {
            this.field2934 = -1;
        }
        this.field2949 = class446.field6625 - this.field2947;
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(I[Lo;)V", line = 505)
    public static final void method1327(int arg0, class363[] arg1) {
        field2926++;
        class367.field5414 = arg1.length;
        class397.field5855 = new class363[class367.field5414 + 10];
        class280.field4361 = new int[class367.field5414 + 10];
        class325.method2133(arg1, 0, class397.field5855, 0, class367.field5414);
        for (int var2 = 0; var2 < class367.field5414; var2++) {
            class280.field4361[var2] = class397.field5855[var2].method396();
        }
        for (int var3 = class367.field5414; var3 < class397.field5855.length; var3++) {
            class280.field4361[var3] = 12;
        }
        if (arg0 != 11913) {
            field2945 = 2.1923902E-4F;
        }
    }

    @OriginalMember(owner = "client!ah", name = "c", descriptor = "(B)Z", line = 562)
    public final boolean method1328(byte arg0) {
        if (arg0 != -93) {
            this.field2935 = -7;
        }
        field2923++;
        return this.field2915;
    }
}
