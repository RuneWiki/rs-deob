import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jc")
public class class414 {

    @OriginalMember(owner = "client!jc", name = "m", descriptor = "Lco;")
    private class210 field5906 = new class210(64);

    @OriginalMember(owner = "client!jc", name = "p", descriptor = "Lco;")
    public class210 field5909 = new class210(30);

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "Lg;")
    private class470 field5894;

    @OriginalMember(owner = "client!jc", name = "d", descriptor = "Lg;")
    public class470 field5897;

    @OriginalMember(owner = "client!jc", name = "i", descriptor = "Lec;")
    public static class40 field5902 = new class40("Loaded title screen", "Titelbild geladen.", "Écran-titre chargé", "Tela título carregada");

    @OriginalMember(owner = "client!jc", name = "k", descriptor = "Ldb;")
    public static class29 field5904 = new class29("LIVE", 0);

    @OriginalMember(owner = "client!jc", name = "n", descriptor = "I")
    public static int field5907 = 0;

    @OriginalMember(owner = "client!jc", name = "r", descriptor = "I")
    public static int field5911 = 0;

    @OriginalMember(owner = "client!jc", name = "q", descriptor = "Lwb;")
    public static class45 field5910 = new class45(8);

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "I")
    public static int field5895;

    @OriginalMember(owner = "client!jc", name = "c", descriptor = "I")
    public static int field5896;

    @OriginalMember(owner = "client!jc", name = "e", descriptor = "I")
    public static int field5898;

    @OriginalMember(owner = "client!jc", name = "f", descriptor = "I")
    public static int field5899;

    @OriginalMember(owner = "client!jc", name = "g", descriptor = "I")
    public static int field5900;

    @OriginalMember(owner = "client!jc", name = "h", descriptor = "I")
    public static int field5901;

    @OriginalMember(owner = "client!jc", name = "j", descriptor = "I")
    public static int field5903;

    @OriginalMember(owner = "client!jc", name = "l", descriptor = "I")
    public static int field5905;

    @OriginalMember(owner = "client!jc", name = "o", descriptor = "I")
    public static int field5908;

    @OriginalMember(owner = "client!jc", name = "s", descriptor = "I")
    public int field5912;

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(I)V")
    public final void method2449(int arg0) {
        field5898++;
        class210 var2 = this.field5906;
        synchronized (this.field5906) {
            this.field5906.method1169(1076);
            if (arg0 != 16383) {
                this.field5909 = null;
            }
        }
        class210 var3 = this.field5909;
        synchronized (this.field5909) {
            this.field5909.method1169(arg0 ^ 0x3BCB);
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIIIII)Z")
    public static final boolean method2450(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field5900++;
        for (int var6 = arg2; var6 <= arg4; var6++) {
            for (int var7 = arg1; var7 <= arg0; var7++) {
                if (class417.field6014[var6][var7] == arg5 && class299.field4462[var6][var7] <= 1) {
                    return true;
                }
            }
        }
        if (arg3 != 1) {
            field5907 = 35;
        }
        return false;
    }

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "(I)V")
    public final void method2451(int arg0) {
        class210 var2 = this.field5906;
        synchronized (this.field5906) {
            this.field5906.method1165((byte) 118);
            if (arg0 != 17088) {
                this.field5906 = null;
            }
        }
        field5905++;
        class210 var3 = this.field5909;
        synchronized (this.field5909) {
            this.field5909.method1165((byte) 118);
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(B)V")
    public static void method2452(byte arg0) {
        field5902 = null;
        field5910 = null;
        field5904 = null;
        if (arg0 <= 32) {
            method2457(34, 77);
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(II)V")
    public final void method2453(int arg0, int arg1) {
        if (arg1 != -24565) {
            this.method2456(-121, 73);
        }
        this.field5912 = arg0;
        field5895++;
        class210 var3 = this.field5909;
        synchronized (this.field5909) {
            this.field5909.method1165((byte) 118);
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(ZI)V")
    public final void method2454(boolean arg0, int arg1) {
        field5903++;
        class210 var3 = this.field5906;
        synchronized (this.field5906) {
            this.field5906.method1166(arg1, (byte) -52);
            if (arg0) {
                method2452((byte) -39);
            }
        }
        class210 var4 = this.field5909;
        synchronized (this.field5909) {
            this.field5909.method1166(arg1, (byte) -52);
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(Lab;I)V")
    public static final void method2455(class256 arg0, int arg1) {
        field5899++;
        if (arg1 != 2485) {
            field5904 = null;
        }
        if (class397.field5647 != arg0.field3591) {
            return;
        }
        if (class19.field258.field2736 == null) {
            arg0.field3610 = 0;
            arg0.field3674 = 0;
            return;
        }
        arg0.field3567 = 150;
        arg0.field3681 = (int) (Math.sin((double) class204.field2796 / 40.0D) * 256.0D) & 0x7FF;
        arg0.field3596 = 5;
        arg0.field3674 = class61.field760;
        arg0.field3610 = class288.method1821(arg1 ^ 0x19E8, class19.field258.field2736);
        arg0.field3572 = class19.field258.field2514;
        arg0.field3639 = class19.field258.field2458;
        arg0.field3637 = class19.field258.field2461;
        arg0.field3696 = 0;
    }

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "(II)Lpm;")
    public final class12 method2456(int arg0, int arg1) {
        field5901++;
        class210 var3 = this.field5906;
        class12 var4;
        synchronized (this.field5906) {
            var4 = (class12) this.field5906.method1163((byte) -109, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        if (arg1 != 600) {
            this.field5909 = null;
        }
        byte[] var5 = this.field5894.method2768(-20472, class328.method1994(arg0, false), class40.method203(-2, arg0));
        class12 var6 = new class12();
        var6.field181 = arg0;
        var6.field165 = this;
        if (var5 != null) {
            var6.method90(97, new class179(var5));
        }
        class210 var7 = this.field5906;
        synchronized (this.field5906) {
            this.field5906.method1172((long) arg0, 1, var6);
            return var6;
        }
    }

    @OriginalMember(owner = "client!jc", name = "c", descriptor = "(II)V")
    public static final void method2457(int arg0, int arg1) {
        field5908++;
        if (arg0 != 2602) {
            field5911 = 102;
        }
        int var2 = class204.field2796 - class125.field1534;
        if (var2 >= 100) {
            class358.field5167 = 1;
            return;
        }
        int var3 = (int) class31.field389;
        if ((class192.field2643 >> 8) > var3) {
            var3 = class192.field2643 >> 8;
        }
        if (class141.field1696[4] && class329.field4742[4] + 128 > var3) {
            var3 = class329.field4742[4] + 128;
        }
        int var4 = (int) class349.field5021 + class2.field12 & 0x3FFF;
        class105.method501(class375.method2264(-1547, class19.field258.field1005, class100.field1217, class19.field258.field1008) - 50, (byte) -77, (var3 >> 3) * 3 + 600, class191.field2617, var3, class186.field2445, var4, arg1);
        float var5 = 1.0F - ((float) ((100 - var2) * (100 - var2) * (100 - var2)) / 1000000.0F);
        class120.field1490 = (int) ((float) (class120.field1490 - class208.field2884) * var5 + (float) class208.field2884);
        class427.field6145 = (int) ((float) (class427.field6145 - class146.field1766) * var5 + (float) class146.field1766);
        class351.field5047 = (int) ((float) (class351.field5047 - class50.field658) * var5 + (float) class50.field658);
        class58.field734 = (int) ((float) (class58.field734 - class368.field5264) * var5 + (float) class368.field5264);
        int var6 = class13.field193 - class346.field4944;
        if (var6 > 8192) {
            var6 -= 16384;
        } else if (var6 < -8192) {
            var6 += 16384;
        }
        class13.field193 = (int) ((float) var6 * var5 + (float) class346.field4944);
        class13.field193 &= 0x3FFF;
    }

    @OriginalMember(owner = "client!jc", name = "<init>", descriptor = "(Lci;ILg;Lg;)V")
    public class414(class421 arg0, int arg1, class470 arg2, class470 arg3) {
        this.field5894 = arg2;
        this.field5897 = arg3;
        int var5 = this.field5894.method2756(true) - 1;
        this.field5894.method2755(-86, var5);
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIIII)V")
    public static final void method2458(int arg0, int arg1, int arg2, int arg3, int arg4) {
        for (class399 var5 = (class399) class445.field6339.method802((byte) 111); var5 != null; var5 = (class399) class445.field6339.method806((byte) 104)) {
            class342.method2078(arg2, arg1, var5, 100, arg4, arg3);
        }
        field5896++;
        for (class399 var6 = (class399) class53.field689.method802((byte) 127); var6 != null; var6 = (class399) class53.field689.method806((byte) 104)) {
            byte var11 = 1;
            class349 var12 = var6.field5671.method1018(-113);
            if (var6.field5671.field2497) {
                var11 = 0;
            } else if (var6.field5671.field2514 == var12.field5003 || var6.field5671.field2514 == var12.field5010 || var6.field5671.field2514 == var12.field5007 || var6.field5671.field2514 == var12.field4978) {
                var11 = 2;
            } else if (var6.field5671.field2514 == var12.field4982 || var6.field5671.field2514 == var12.field5001 || var6.field5671.field2514 == var12.field4974 || var6.field5671.field2514 == var12.field5005) {
                var11 = 3;
            }
            if (var6.field5676 != var11) {
                int var13 = class349.method2116(arg0 - 83, var6.field5671);
                if (var6.field5677 != var13) {
                    if (var6.field5688 != null) {
                        class226.field3136.method509(var6.field5688);
                        var6.field5688 = null;
                    }
                    var6.field5677 = var13;
                }
                var6.field5676 = var11;
            }
            var6.field5680 = var6.field5671.field1008;
            var6.field5681 = var6.field5671.field1008 + (var6.field5671.method1012(false) * 64);
            var6.field5672 = var6.field5671.field1005;
            var6.field5686 = var6.field5671.field1005 + var6.field5671.method1012(false) * 64;
            class342.method2078(arg2, arg1, var6, 100, arg4, arg3);
        }
        for (class399 var7 = (class399) class350.field5031.method241(arg0 ^ arg0); var7 != null; var7 = (class399) class350.field5031.method239(0)) {
            byte var8 = 1;
            class349 var9 = var7.field5669.method1018(-127);
            if (var7.field5669.field2497) {
                var8 = 0;
            } else if (var7.field5669.field2514 == var9.field5003 || var7.field5669.field2514 == var9.field5010 || var7.field5669.field2514 == var9.field5007 || var7.field5669.field2514 == var9.field4978) {
                var8 = 2;
            } else if (var7.field5669.field2514 == var9.field4982 || var7.field5669.field2514 == var9.field5001 || var7.field5669.field2514 == var9.field4974 || var7.field5669.field2514 == var9.field5005) {
                var8 = 3;
            }
            if (var7.field5676 != var8) {
                int var10 = class62.method318(arg0 - 55, var7.field5669);
                if (var7.field5677 != var10) {
                    if (var7.field5688 != null) {
                        class226.field3136.method509(var7.field5688);
                        var7.field5688 = null;
                    }
                    var7.field5677 = var10;
                }
                var7.field5676 = var8;
            }
            var7.field5680 = var7.field5669.field1008;
            var7.field5681 = var7.field5669.field1008 + var7.field5669.method1012(false) * 64;
            var7.field5672 = var7.field5669.field1005;
            var7.field5686 = var7.field5669.field1005 + var7.field5669.method1012(false) * 64;
            class342.method2078(arg2, arg1, var7, 100, arg4, arg3);
        }
    }
}
