import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mk")
public class class316 extends class104 {

    @OriginalMember(owner = "client!mk", name = "C", descriptor = "I")
    private int field5011 = 0;

    @OriginalMember(owner = "client!mk", name = "G", descriptor = "I")
    private int field5015 = -1;

    @OriginalMember(owner = "client!mk", name = "N", descriptor = "Z")
    public boolean field5022 = false;

    @OriginalMember(owner = "client!mk", name = "L", descriptor = "I")
    private int field5020 = 0;

    @OriginalMember(owner = "client!mk", name = "Q", descriptor = "I")
    private int field5025 = -32768;

    @OriginalMember(owner = "client!mk", name = "W", descriptor = "Z")
    private boolean field5029 = false;

    @OriginalMember(owner = "client!mk", name = "w", descriptor = "I")
    public int field5005;

    @OriginalMember(owner = "client!mk", name = "F", descriptor = "I")
    public int field5014;

    @OriginalMember(owner = "client!mk", name = "p", descriptor = "I")
    public int field4998;

    @OriginalMember(owner = "client!mk", name = "K", descriptor = "I")
    public int field5019;

    @OriginalMember(owner = "client!mk", name = "y", descriptor = "I")
    private int field5007;

    @OriginalMember(owner = "client!mk", name = "J", descriptor = "I")
    public int field5018;

    @OriginalMember(owner = "client!mk", name = "H", descriptor = "Lwi;")
    private class285 field5016;

    @OriginalMember(owner = "client!mk", name = "I", descriptor = "[I")
    public static int[] field5017 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client!mk", name = "q", descriptor = "[[I")
    public static int[][] field4999 = new int[5][5000];

    @OriginalMember(owner = "client!mk", name = "B", descriptor = "I")
    public static int field5010 = -1;

    @OriginalMember(owner = "client!mk", name = "o", descriptor = "I")
    public static int field4997 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!mk", name = "z", descriptor = "I")
    public static int field5008 = 0;

    @OriginalMember(owner = "client!mk", name = "U", descriptor = "Ljava/lang/String;")
    public static String field5028 = " ";

    @OriginalMember(owner = "client!mk", name = "R", descriptor = "Ljava/lang/String;")
    public static String field5026 = "Loading fonts - ";

    @OriginalMember(owner = "client!mk", name = "t", descriptor = "I")
    public static int field5002;

    @OriginalMember(owner = "client!mk", name = "u", descriptor = "I")
    public static int field5003;

    @OriginalMember(owner = "client!mk", name = "v", descriptor = "I")
    public static int field5004;

    @OriginalMember(owner = "client!mk", name = "x", descriptor = "I")
    public static int field5006;

    @OriginalMember(owner = "client!mk", name = "A", descriptor = "I")
    public static int field5009;

    @OriginalMember(owner = "client!mk", name = "D", descriptor = "I")
    public static int field5012;

    @OriginalMember(owner = "client!mk", name = "E", descriptor = "I")
    public static int field5013;

    @OriginalMember(owner = "client!mk", name = "M", descriptor = "I")
    public static int field5021;

    @OriginalMember(owner = "client!mk", name = "O", descriptor = "I")
    public static int field5023;

    @OriginalMember(owner = "client!mk", name = "P", descriptor = "I")
    public static int field5024;

    @OriginalMember(owner = "client!mk", name = "S", descriptor = "I")
    public static int field5027;

    @OriginalMember(owner = "client!mk", name = "r", descriptor = "Lil;")
    private class65 field5000;

    @OriginalMember(owner = "client!mk", name = "s", descriptor = "Ljava/lang/Thread;")
    public static Thread field5001;

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(Lli;)V", line = 6)
    public static final void method2171(class241 arg0) {
        for (int var1 = arg0.field3932; var1 <= arg0.field3930; var1++) {
            for (int var2 = arg0.field3929; var2 <= arg0.field3928; var2++) {
                class257 var3 = class279.field4430[arg0.field3939][var1][var2];
                if (var3 != null) {
                    for (int var4 = 0; var4 < var3.field4150; var4++) {
                        if (var3.field4147[var4] == arg0) {
                            var3.field4150--;
                            for (int var5 = var4; var5 < var3.field4150; var5++) {
                                var3.field4147[var5] = var3.field4147[var5 + 1];
                                var3.field4165[var5] = var3.field4165[var5 + 1];
                            }
                            var3.field4147[var3.field4150] = null;
                            break;
                        }
                    }
                    var3.field4151 = 0;
                    for (int var6 = 0; var6 < var3.field4150; var6++) {
                        var3.field4151 |= var3.field4165[var6];
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!mk", name = "b", descriptor = "(II)Z", line = 67)
    public static final boolean method2172(int arg0, int arg1) {
        field5012++;
        if (arg1 < 0) {
            return false;
        }
        int var2 = class276.field4401[arg1];
        if (arg0 >= ~var2) {
            var2 -= 2000;
        }
        return var2 == 1002;
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(Z)V", line = 87)
    public static void method2173(boolean arg0) {
        field5017 = null;
        field5026 = null;
        field5001 = null;
        field4999 = (int[][]) null;
        field5028 = null;
        if (arg0) {
            field5001 = (Thread) null;
        }
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(B)Lgk;", line = 103)
    private final class10 method2174(byte arg0) {
        class158 var2 = class271.method1851(this.field5007, 0);
        if (arg0 >= -99) {
            method2180((byte) 22);
        }
        field5027++;
        class10 var3;
        if (this.field5022) {
            var3 = var2.method1267(51, -1, 0, -1);
        } else {
            var3 = var2.method1267(44, this.field5015, this.field5020, this.field5011);
        }
        return var3 == null ? null : var3;
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(ZZ)V", line = 127)
    public static final void method2175(boolean arg0, boolean arg1) {
        field5023++;
        class9.method68(class152.field2686, class18.field290, class344.field5475, class166.field2905);
        class9.method71(class166.field2901, class36.field532, arg0);
        class9.method70((float) class67.field1074, (float) class180.field3038, (float) class32.field453);
        class9.method62();
        class118.field2051 = class194.field3242;
        class118.field2054 = class88.field1388;
        class118.field2050 = class12.field172;
        class250.field4056 = class148.field2657;
        if (arg1) {
            field5026 = (String) null;
        }
    }

    @OriginalMember(owner = "client!mk", name = "c", descriptor = "(II)V", line = 155)
    public final void method2176(int arg0, int arg1) {
        field5006++;
        if (this.field5022) {
            return;
        }
        this.field5020 += arg1;
        while (this.field5016.field4536[this.field5011] < this.field5020) {
            this.field5020 -= this.field5016.field4536[this.field5011];
            this.field5011++;
            if (this.field5016.field4531.length <= this.field5011) {
                this.field5022 = true;
                break;
            }
        }
        if (arg0 == -4341 && !this.field5022) {
            class20.method199(false, this.field5014, this.field5016, this.field4998, this.field5011, true);
        }
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(IIIIIIIIJILil;)V", line = 188)
    public final void method74(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class65 arg10) {
        field5013++;
        class10 var13 = this.method2174((byte) -109);
        if (var13 != null) {
            this.method2178((byte) 81, var13);
            var13.method74(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field5000);
            this.field5025 = var13.method95();
        }
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(Lcg;IIB)Lwb;", line = 205)
    public static final class171 method2177(class49 arg0, int arg1, int arg2, byte arg3) {
        if (arg3 <= 10) {
            method2180((byte) -28);
        }
        field5004++;
        return class325.method2262(arg2, (byte) 84, arg0, arg1) ? class58.method525(-66) : null;
    }

    @OriginalMember(owner = "client!mk", name = "b", descriptor = "()I", line = 220)
    public final int method95() {
        field5021++;
        return this.field5025;
    }

    @OriginalMember(owner = "client!mk", name = "<init>", descriptor = "(IIIIIII)V", line = 373)
    public class316(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field5005 = arg4;
        this.field5014 = arg3;
        this.field4998 = arg2;
        this.field5019 = arg1;
        this.field5007 = arg0;
        this.field5018 = arg5 + arg6;
        int var8 = class271.method1851(this.field5007, 0).field2793;
        if (var8 == -1) {
            this.field5022 = true;
        } else {
            this.field5022 = false;
            this.field5016 = class346.method2428(var8, (byte) -24);
        }
        if (this.field5018 == arg6) {
            class20.method199(false, this.field5014, this.field5016, this.field4998, this.field5011, true);
        }
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(BLgk;)V", line = 246)
    private final void method2178(byte arg0, class10 arg1) {
        if (class43.field680) {
            class183 var4 = (class183) arg1;
            if ((this.field5000 == null || this.field5000.field1024) && (var4.field3086 != null || var4.field3066 != null)) {
                this.field5000 = new class65(class181.field3045, 1, 1);
            }
            if (this.field5000 != null) {
                this.field5000.method613(var4.field3086, var4.field3066, false, var4.field3080, var4.field3054, var4.field3087);
            }
        } else {
            class103 var3 = (class103) arg1;
            if ((this.field5000 == null || this.field5000.field1024) && (var3.field1653 != null || var3.field1672 != null)) {
                this.field5000 = new class65(class181.field3045, 1, 1);
            }
            if (this.field5000 != null) {
                this.field5000.method613(var3.field1653, var3.field1672, false, var3.field1657, var3.field1671, var3.field1664);
            }
        }
        field5003++;
        if (arg0 > 15) {
            this.field5029 = true;
        }
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(IIIII)V", line = 282)
    public final void method97(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field5002++;
        if (!this.field5029) {
            class10 var6 = this.method2174((byte) -108);
            if (var6 == null) {
                return;
            }
            this.method2178((byte) 20, var6);
        }
        if (this.field5000 != null) {
            this.field5000.method615(arg0, arg1, arg3, arg2, arg4);
        }
    }

    @OriginalMember(owner = "client!mk", name = "b", descriptor = "(III)V", line = 345)
    public static final void method2179(int arg0, int arg1, int arg2) {
        class50.field785 = true;
        class116.field2010 = arg0;
        class160.field2841 = arg1;
        class158.field2805 = arg2;
        class97.field1565 = -1;
        class290.field4628 = -1;
    }

    @OriginalMember(owner = "client!mk", name = "b", descriptor = "(B)I", line = 354)
    public static final int method2180(byte arg0) {
        field5024++;
        int var1 = 109 / ((arg0 - 9) / 51);
        if (class305.field4842) {
            return 0;
        } else if (class56.method499(-104)) {
            return class129.field2225 ? 2 : 1;
        } else {
            return 1;
        }
    }
}
