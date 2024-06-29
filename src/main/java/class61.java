import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fn")
public class class61 extends class162 {

    @OriginalMember(owner = "client!fn", name = "i", descriptor = "Z")
    private boolean field923 = false;

    @OriginalMember(owner = "client!fn", name = "l", descriptor = "I")
    private int field926 = 0;

    @OriginalMember(owner = "client!fn", name = "v", descriptor = "I")
    private int field936 = 0;

    @OriginalMember(owner = "client!fn", name = "D", descriptor = "Z")
    public boolean field944 = false;

    @OriginalMember(owner = "client!fn", name = "y", descriptor = "I")
    private int field939 = -32768;

    @OriginalMember(owner = "client!fn", name = "F", descriptor = "I")
    private int field946 = -1;

    @OriginalMember(owner = "client!fn", name = "m", descriptor = "I")
    public int field927;

    @OriginalMember(owner = "client!fn", name = "o", descriptor = "I")
    public int field929;

    @OriginalMember(owner = "client!fn", name = "p", descriptor = "I")
    public int field930;

    @OriginalMember(owner = "client!fn", name = "w", descriptor = "I")
    public int field937;

    @OriginalMember(owner = "client!fn", name = "k", descriptor = "I")
    private int field925;

    @OriginalMember(owner = "client!fn", name = "h", descriptor = "I")
    public int field922;

    @OriginalMember(owner = "client!fn", name = "f", descriptor = "Lsb;")
    private class131 field920;

    @OriginalMember(owner = "client!fn", name = "q", descriptor = "I")
    public static int field931 = 0;

    @OriginalMember(owner = "client!fn", name = "j", descriptor = "I")
    public static int field924;

    @OriginalMember(owner = "client!fn", name = "n", descriptor = "I")
    public static int field928;

    @OriginalMember(owner = "client!fn", name = "r", descriptor = "I")
    public static int field932;

    @OriginalMember(owner = "client!fn", name = "s", descriptor = "I")
    public static int field933;

    @OriginalMember(owner = "client!fn", name = "t", descriptor = "I")
    public static int field934;

    @OriginalMember(owner = "client!fn", name = "u", descriptor = "I")
    public static int field935;

    @OriginalMember(owner = "client!fn", name = "z", descriptor = "I")
    public static int field940;

    @OriginalMember(owner = "client!fn", name = "A", descriptor = "I")
    public static int field941;

    @OriginalMember(owner = "client!fn", name = "B", descriptor = "I")
    public static int field942;

    @OriginalMember(owner = "client!fn", name = "C", descriptor = "I")
    public static int field943;

    @OriginalMember(owner = "client!fn", name = "E", descriptor = "I")
    public static int field945;

    @OriginalMember(owner = "client!fn", name = "G", descriptor = "I")
    public static int field947;

    @OriginalMember(owner = "client!fn", name = "g", descriptor = "Ldh;")
    private class145 field921;

    @OriginalMember(owner = "client!fn", name = "x", descriptor = "[Ljava/lang/String;")
    public static String[] field938;

    @OriginalMember(owner = "client!fn", name = "<init>", descriptor = "(IIIIIII)V", line = 386)
    public class61(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field927 = arg5 + arg6;
        this.field929 = arg1;
        this.field930 = arg2;
        this.field937 = arg4;
        this.field925 = arg0;
        this.field922 = arg3;
        int var8 = class214.method1455((byte) -6, this.field925).field2675;
        if (var8 == -1) {
            this.field944 = true;
        } else {
            this.field944 = false;
            this.field920 = class68.method476((byte) 80, var8);
        }
        if (this.field927 == arg6) {
            class276.method1970(this.field920, false, this.field922, 119, this.field930, this.field936);
        }
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(IIIII)V", line = 13)
    public final void method313(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field924++;
        if (!this.field923) {
            class128 var6 = this.method447(82);
            if (var6 == null) {
                return;
            }
            this.method445(1, var6);
        }
        if (this.field921 != null) {
            this.field921.method1038(arg0, arg1, arg3, arg2, arg4);
        }
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(IIII)I", line = 39)
    public static final int method442(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg3 & 0x3;
        field933++;
        if (arg1 == var4) {
            return arg0;
        } else if (var4 == 1) {
            return arg2;
        } else if (var4 == 2) {
            return 7 - arg0;
        } else {
            return 7 - arg2;
        }
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(II)V", line = 61)
    public final void method443(int arg0, int arg1) {
        field940++;
        if (this.field944) {
            return;
        }
        if (arg0 != 0) {
            this.field922 = 41;
        }
        this.field926 += arg1;
        while (this.field920.field2002[this.field936] < this.field926) {
            this.field926 -= this.field920.field2002[this.field936];
            this.field936++;
            if (this.field936 >= this.field920.field1988.length) {
                this.field944 = true;
                break;
            }
        }
        if (!this.field944) {
            class276.method1970(this.field920, false, this.field922, arg0 + 85, this.field930, this.field936);
        }
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(IIIZII)V", line = 99)
    public static final void method444(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        field932++;
        if (class341.field5494 <= arg2 && class196.field3001 >= arg1 && arg4 >= class33.field505 && arg5 <= class278.field4586) {
            class217.method1469(arg4, (byte) -95, arg1, arg2, arg0, arg5);
        } else {
            class283.method2003(arg0, 122, arg2, arg1, arg5, arg4);
        }
        if (!arg3) {
            field931 = -108;
        }
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "()I", line = 125)
    public final int method192() {
        field928++;
        return this.field939;
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(ILsm;)V", line = 135)
    private final void method445(int arg0, class128 arg1) {
        if (class245.field3886) {
            class22 var3 = (class22) arg1;
            if ((this.field921 == null || this.field921.field2306) && (var3.field287 != null || var3.field282 != null)) {
                this.field921 = new class145(class58.field875, 1, 1);
            }
            if (this.field921 != null) {
                this.field921.method1037(var3.field287, var3.field282, false, var3.field306, var3.field301, var3.field279);
            }
        } else {
            class67 var4 = (class67) arg1;
            if ((this.field921 == null || this.field921.field2306) && (var4.field975 != null || var4.field1002 != null)) {
                this.field921 = new class145(class58.field875, 1, 1);
            }
            if (this.field921 != null) {
                this.field921.method1037(var4.field975, var4.field1002, false, var4.field973, var4.field969, var4.field990);
            }
        }
        field941++;
        if (arg0 == 1) {
            this.field923 = true;
        }
    }

    @OriginalMember(owner = "client!fn", name = "b", descriptor = "(I)V", line = 171)
    public static void method446(int arg0) {
        field938 = null;
        if (arg0 != 0) {
            field931 = 27;
        }
    }

    @OriginalMember(owner = "client!fn", name = "c", descriptor = "(I)Lsm;", line = 183)
    private final class128 method447(int arg0) {
        if (arg0 <= 31) {
            this.method313(11, -31, -90, -60, 81);
        }
        class172 var2 = class214.method1455((byte) -6, this.field925);
        field942++;
        class128 var3;
        if (this.field944) {
            var3 = var2.method1186(-25079, -1, 0, -1);
        } else {
            var3 = var2.method1186(-25079, this.field936, this.field926, this.field946);
        }
        return var3 == null ? null : var3;
    }

    @OriginalMember(owner = "client!fn", name = "d", descriptor = "(I)V", line = 210)
    public static final void method448(int arg0) {
        class111.field1650 = null;
        if (arg0 != -21403) {
            method442(-6, -107, 50, -124);
        }
        field945++;
        class291.method2059(true, class243.field3838, -1, 0, class233.field3712, 0, class345.field5538, 0, 0);
        if (class111.field1650 != null) {
            class70.method486(class11.field117, class243.field3838, 0, -1412584499, class299.field4937, 0, (byte) -108, class111.field1650, class233.field3712, class242.field3813.field4357);
            class111.field1650 = null;
        }
    }

    @OriginalMember(owner = "client!fn", name = "e", descriptor = "(I)V", line = 232)
    public static final void method449(int arg0) {
        class218.method1472((byte) 104, class52.field788);
        field947++;
        class143.field2303++;
        if (class52.field795 && class9.field108) {
            int var1 = class52.field788.field4193;
            if (arg0 != 18060) {
                method446(-102);
            }
            int var2 = class130.field1982;
            int var3 = var2 - class267.field4389;
            int var4 = class305.field4988;
            if (var3 < class217.field3345) {
                var3 = class217.field3345;
            }
            if (class52.field788.field4236 + var3 > class217.field3345 + class242.field3813.field4236) {
                var3 = class217.field3345 + class242.field3813.field4236 - class52.field788.field4236;
            }
            int var5 = var3 + class242.field3813.field4242 - class217.field3345;
            int var6 = var4 - class171.field2666;
            int var7 = var3 - class147.field2371;
            if (var6 < class30.field462) {
                var6 = class30.field462;
            }
            if ((var6 + class52.field788.field4223) > (class30.field462 + class242.field3813.field4223)) {
                var6 = class30.field462 + class242.field3813.field4223 - class52.field788.field4223;
            }
            int var8 = var6 - class115.field1682;
            if (class52.field788.field4200 < class143.field2303 && (var1 < var8 || -var1 > var8 || var7 > var1 || (-var1) > var7)) {
                class326.field5344 = true;
            }
            int var9 = class242.field3813.field4220 + var6 - class30.field462;
            if (class52.field788.field4267 != null && class326.field5344) {
                class190 var10 = new class190();
                var10.field2937 = class52.field788;
                var10.field2949 = var5;
                var10.field2950 = var9;
                var10.field2940 = class52.field788.field4267;
                class201.method1372(var10, arg0 + 181940);
            }
            if (class197.field3032 == 0) {
                if (class326.field5344) {
                    if (class52.field788.field4273 != null) {
                        class190 var11 = new class190();
                        var11.field2950 = var9;
                        var11.field2951 = class109.field1619;
                        var11.field2937 = class52.field788;
                        var11.field2949 = var5;
                        var11.field2940 = class52.field788.field4273;
                        class201.method1372(var11, arg0 ^ 0x34BCC);
                    }
                    if (class109.field1619 != null && client.method900(class52.field788) != null) {
                        class263.field4172++;
                        class195.field2992.method250(arg0 + 3006, 124);
                        class195.field2992.method2222(class109.field1619.field4204, arg0 ^ 0x4673);
                        class195.field2992.method2236(-1620419064, class52.field788.field4240);
                        class195.field2992.method2233(class109.field1619.field4240, -29032);
                        class195.field2992.method2222(class52.field788.field4204, 255);
                    }
                } else if ((class40.field604 == 1 || class198.method1349((byte) -106, class117.field1701 - 1)) && class117.field1701 > 2) {
                    class329.method2348((byte) -114);
                } else if (class117.field1701 > 0) {
                    class285.method2015(-3);
                }
                class52.field788 = null;
            }
        } else if (class143.field2303 > 1) {
            class52.field788 = null;
        }
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(IIIIIIIIJILdh;)V", line = 355)
    public final void method180(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class145 arg10) {
        field934++;
        class128 var13 = this.method447(38);
        if (var13 != null) {
            this.method445(1, var13);
            var13.method180(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field921);
            this.field939 = var13.method192();
        }
    }
}
