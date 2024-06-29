import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hq")
public class class392 {

    @OriginalMember(owner = "client!hq", name = "j", descriptor = "Ltl;")
    private class400 field5778 = new class400(64);

    @OriginalMember(owner = "client!hq", name = "w", descriptor = "Ltl;")
    public class400 field5791 = new class400(50);

    @OriginalMember(owner = "client!hq", name = "x", descriptor = "Lee;")
    public class116 field5792 = new class116(250);

    @OriginalMember(owner = "client!hq", name = "z", descriptor = "Loh;")
    private class419 field5794 = new class419();

    @OriginalMember(owner = "client!hq", name = "i", descriptor = "Lui;")
    public class451 field5777;

    @OriginalMember(owner = "client!hq", name = "A", descriptor = "Lcs;")
    private class206 field5795;

    @OriginalMember(owner = "client!hq", name = "p", descriptor = "Lui;")
    private class451 field5784;

    @OriginalMember(owner = "client!hq", name = "v", descriptor = "Z")
    private boolean field5790;

    @OriginalMember(owner = "client!hq", name = "o", descriptor = "I")
    public int field5783;

    @OriginalMember(owner = "client!hq", name = "m", descriptor = "I")
    public int field5781;

    @OriginalMember(owner = "client!hq", name = "B", descriptor = "[Ljava/lang/String;")
    private String[] field5796;

    @OriginalMember(owner = "client!hq", name = "C", descriptor = "[Ljava/lang/String;")
    private String[] field5797;

    @OriginalMember(owner = "client!hq", name = "q", descriptor = "Lat;")
    public static class412 field5785 = new class412();

    @OriginalMember(owner = "client!hq", name = "u", descriptor = "[I")
    public static int[] field5789 = new int[2048];

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "I")
    public static int field5769;

    @OriginalMember(owner = "client!hq", name = "b", descriptor = "I")
    public static int field5770;

    @OriginalMember(owner = "client!hq", name = "c", descriptor = "I")
    public static int field5771;

    @OriginalMember(owner = "client!hq", name = "d", descriptor = "I")
    public static int field5772;

    @OriginalMember(owner = "client!hq", name = "e", descriptor = "I")
    public static int field5773;

    @OriginalMember(owner = "client!hq", name = "f", descriptor = "I")
    public static int field5774;

    @OriginalMember(owner = "client!hq", name = "g", descriptor = "I")
    public static int field5775;

    @OriginalMember(owner = "client!hq", name = "h", descriptor = "I")
    public static int field5776;

    @OriginalMember(owner = "client!hq", name = "k", descriptor = "I")
    public static int field5779;

    @OriginalMember(owner = "client!hq", name = "l", descriptor = "I")
    public static int field5780;

    @OriginalMember(owner = "client!hq", name = "n", descriptor = "I")
    public static int field5782;

    @OriginalMember(owner = "client!hq", name = "r", descriptor = "I")
    public static int field5786;

    @OriginalMember(owner = "client!hq", name = "s", descriptor = "I")
    public static int field5787;

    @OriginalMember(owner = "client!hq", name = "y", descriptor = "I")
    public static int field5793;

    @OriginalMember(owner = "client!hq", name = "D", descriptor = "I")
    public int field5798;

    @OriginalMember(owner = "client!hq", name = "t", descriptor = "Lsh;")
    public static class472 field5788;

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(BI)V")
    public final void method2363(byte arg0, int arg1) {
        field5786++;
        class400 var3 = this.field5778;
        synchronized (this.field5778) {
            this.field5778.method2389(false, arg1);
        }
        class400 var4 = this.field5791;
        synchronized (this.field5791) {
            int var5 = -81 / (arg0 / 43);
            this.field5791.method2389(false, arg1);
        }
        class116 var6 = this.field5792;
        synchronized (this.field5792) {
            this.field5792.method833((byte) -20, arg1);
        }
    }

    @OriginalMember(owner = "client!hq", name = "b", descriptor = "(BI)Lgd;")
    public final class184 method2364(byte arg0, int arg1) {
        field5782++;
        class400 var3 = this.field5778;
        class184 var4;
        synchronized (this.field5778) {
            var4 = (class184) this.field5778.method2393(-123, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field5784.method2691(class18.method183(arg1, (byte) 72), class451.method2658(false, arg1), 0);
        class184 var6 = new class184();
        var6.field2775 = this;
        var6.field2766 = arg1;
        var6.field2801 = new String[] { null, null, class209.field3147.method2036(this.field5783, (byte) -21), null, null };
        var6.field2729 = new String[] { null, null, null, null, class443.field6255.method2036(this.field5783, (byte) -21) };
        if (var5 != null) {
            var6.method1270(arg0 - 119, new class446(var5));
        }
        var6.method1265((byte) 91);
        if (var6.field2773 != -1) {
            var6.method1277(this.method2364((byte) 118, var6.field2773), this.method2364((byte) 118, var6.field2756), (byte) 117);
        }
        if (var6.field2785 != -1) {
            var6.method1269(this.method2364((byte) 118, var6.field2785), (byte) -42, this.method2364((byte) 118, var6.field2797));
        }
        if (arg0 != 118) {
            this.field5778 = null;
        }
        if (!this.field5790 && var6.field2779) {
            var6.field2722 = class428.field6105.method2036(this.field5783, (byte) -21);
            var6.field2801 = this.field5796;
            var6.field2798 = 0;
            var6.field2783 = false;
            var6.field2729 = this.field5797;
            var6.field2795 = null;
            if (var6.field2741 != null) {
                boolean var7 = false;
                for (class35 var8 = var6.field2741.method2296((byte) 39); var8 != null; var8 = var6.field2741.method2297(true)) {
                    class170 var9 = this.field5795.method1398(-127, (int) var8.field436);
                    if (var9.field2425) {
                        var8.method283(2);
                    } else {
                        var7 = true;
                    }
                }
                if (!var7) {
                    var6.field2741 = null;
                }
            }
        }
        class400 var10 = this.field5778;
        synchronized (this.field5778) {
            this.field5778.method2395(arg0 ^ 0x76, var6, (long) arg1);
            return var6;
        }
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(Ltq;IIIIIILcu;)Ldp;")
    public final class319 method2365(class63 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class330 arg7) {
        if (arg5 != 1) {
            this.method2363((byte) 80, -17);
        }
        field5769++;
        this.field5794.field6021 = arg0.field870;
        this.field5794.field6018 = arg6;
        this.field5794.field6010 = arg3;
        this.field5794.field6019 = arg7 != null;
        this.field5794.field6016 = arg4;
        this.field5794.field6017 = arg1;
        this.field5794.field6014 = arg2;
        return (class319) this.field5792.method837(this.field5794, arg5 - 90);
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(IIIIII)V")
    public static final void method2366(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg4 != 0) {
            return;
        }
        field5775++;
        if (arg1 == arg5) {
            class423.method2498(arg1, arg0, arg2, arg3, 71);
        } else if (class293.field4420 <= arg0 - arg1 && (arg0 + arg1) <= class119.field1643 && class176.field2503 <= arg3 - arg5 && class296.field4443 >= arg3 + arg5) {
            class268.method1746(arg5, arg0, arg4 ^ 0x51, arg3, arg1, arg2);
        } else {
            class371.method2303(0, arg1, arg2, arg5, arg0, arg3);
        }
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(Z)V")
    public final void method2367(boolean arg0) {
        class400 var2 = this.field5778;
        synchronized (this.field5778) {
            this.field5778.method2401((byte) -71);
            if (!arg0) {
                this.field5798 = -43;
            }
        }
        field5776++;
        class400 var3 = this.field5791;
        synchronized (this.field5791) {
            this.field5791.method2401((byte) -95);
        }
        class116 var4 = this.field5792;
        synchronized (this.field5792) {
            this.field5792.method834((byte) 65);
        }
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(I)V")
    public final void method2368(int arg0) {
        class400 var2 = this.field5791;
        synchronized (this.field5791) {
            this.field5791.method2401((byte) -35);
        }
        if (arg0 != 0) {
            this.field5798 = -43;
        }
        field5793++;
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(ZB)V")
    public final void method2369(boolean arg0, byte arg1) {
        if (arg1 <= 82) {
            return;
        }
        field5772++;
        if (arg0 != this.field5790) {
            this.field5790 = arg0;
            this.method2367(true);
        }
    }

    @OriginalMember(owner = "client!hq", name = "b", descriptor = "(Z)V")
    public final void method2370(boolean arg0) {
        field5780++;
        class400 var2 = this.field5778;
        synchronized (this.field5778) {
            this.field5778.method2388(-29);
        }
        class400 var3 = this.field5791;
        synchronized (this.field5791) {
            this.field5791.method2388(-92);
        }
        class116 var4 = this.field5792;
        synchronized (this.field5792) {
            if (!arg0) {
                this.method2372(9);
            }
            this.field5792.method828((byte) -97);
        }
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(IZIIIILtq;Ltr;ZILtq;Lcu;)Ldp;")
    public final class319 method2371(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, class63 arg6, class229 arg7, boolean arg8, int arg9, class63 arg10, class330 arg11) {
        field5787++;
        class319 var13 = this.method2365(arg6, arg3, arg5, arg2, arg0, 1, arg4, arg11);
        if (var13 != null) {
            return var13;
        }
        class184 var14 = this.method2364((byte) 118, arg0);
        if (arg5 > 1 && var14.field2757 != null) {
            int var15 = -1;
            for (int var16 = 0; var16 < 10; var16++) {
                if (arg5 >= var14.field2721[var16] && var14.field2721[var16] != 0) {
                    var15 = var14.field2757[var16];
                }
            }
            if (var15 != -1) {
                var14 = this.method2364((byte) 118, var15);
            }
        }
        if (arg9 != 0) {
            this.method2365((class63) null, 127, -30, -34, -81, -78, -71, (class330) null);
        }
        int[] var17 = var14.method1261(arg11, arg4, arg10, arg2, arg3, arg8, arg5, arg6, arg9 ^ 0x23, arg7);
        if (var17 == null) {
            return null;
        }
        class319 var18;
        if (arg1) {
            var18 = arg10.method536(var17, 0, 36, 36, 32);
        } else {
            var18 = arg6.method536(var17, 0, 36, 36, 32);
        }
        if (!arg1) {
            class419 var19 = new class419();
            var19.field6017 = arg3;
            var19.field6021 = arg6.field870;
            var19.field6010 = arg2;
            var19.field6014 = arg5;
            var19.field6016 = arg0;
            var19.field6018 = arg4;
            var19.field6019 = arg11 != null;
            this.field5792.method836(var19, var18, 104);
        }
        return var18;
    }

    @OriginalMember(owner = "client!hq", name = "b", descriptor = "(I)V")
    public final void method2372(int arg0) {
        class116 var2 = this.field5792;
        synchronized (this.field5792) {
            if (arg0 != 0) {
                this.method2369(false, (byte) 81);
            }
            this.field5792.method834((byte) 96);
        }
        field5771++;
    }

    @OriginalMember(owner = "client!hq", name = "c", descriptor = "(I)V")
    public static void method2373(int arg0) {
        int var1 = -50 / ((arg0 + 47) / 39);
        field5789 = null;
        field5785 = null;
        field5788 = null;
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(BLui;)V")
    public static final void method2374(byte arg0, class451 arg1) {
        field5770++;
        if (arg0 != -64) {
            method2366(49, -117, -112, -115, 49, 65);
        }
        class87.field1235 = arg1.method2676("p11_full", (byte) -68);
        class297.field4451 = arg1.method2676("p12_full", (byte) -73);
        class410.field5932 = arg1.method2676("b12_full", (byte) -48);
        class23.field310 = arg1.method2676("hitmarks", (byte) -44);
        class492.field6922 = arg1.method2676("hitbar_default", (byte) -128);
        class228.field3341 = arg1.method2676("timerbar_default", (byte) -43);
        class183.field2714 = arg1.method2676("headicons_pk", (byte) -91);
        class357.field5431 = arg1.method2676("headicons_prayer", (byte) -121);
        class356.field5412 = arg1.method2676("hint_headicons", (byte) -79);
        class105.field1481 = arg1.method2676("hint_mapmarkers", (byte) -96);
        class449.field6349 = arg1.method2676("mapflag", (byte) -46);
        class317.field4760 = arg1.method2676("cross", (byte) -89);
        class344.field5187 = arg1.method2676("mapdots", (byte) -93);
        class429.field6117 = arg1.method2676("scrollbar", (byte) -124);
        class169.field2412 = arg1.method2676("name_icons", (byte) -51);
        class72.field972 = arg1.method2676("floorshadows", (byte) -61);
        class282.field4260 = arg1.method2676("compass", (byte) -99);
        class142.field2030 = arg1.method2676("otherlevel", (byte) -61);
        class395.field5815 = arg1.method2676("hint_mapedge", (byte) -80);
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(II)V")
    public final void method2375(int arg0, int arg1) {
        if (arg1 != -5682) {
            return;
        }
        field5779++;
        this.field5798 = arg0;
        class400 var3 = this.field5791;
        synchronized (this.field5791) {
            this.field5791.method2401((byte) -121);
        }
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(IB)V")
    public static final void method2376(int arg0, byte arg1) {
        field5773++;
        if (!class161.method1094(2007241424, arg0)) {
            return;
        }
        class178[] var2 = class467.field6572[arg0];
        if (arg1 <= 126) {
            field5789 = null;
        }
        for (int var3 = 0; var3 < var2.length; var3++) {
            class178 var4 = var2[var3];
            if (var4 != null) {
                var4.field2563 = 1;
                var4.field2568 = 0;
                var4.field2535 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!hq", name = "<init>", descriptor = "(Lgp;IZLcs;Lui;Lui;)V")
    public class392(class430 arg0, int arg1, boolean arg2, class206 arg3, class451 arg4, class451 arg5) {
        this.field5777 = arg5;
        this.field5795 = arg3;
        this.field5784 = arg4;
        this.field5790 = arg2;
        this.field5783 = arg1;
        if (this.field5784 == null) {
            this.field5781 = 0;
        } else {
            int var7 = this.field5784.method2675(false) - 1;
            this.field5781 = this.field5784.method2662(var7, (byte) -7) + var7 * 256;
        }
        this.field5796 = new String[] { null, null, class209.field3147.method2036(this.field5783, (byte) -21), null, null };
        this.field5797 = new String[] { null, null, null, null, class443.field6255.method2036(this.field5783, (byte) -21) };
    }

    static {
        new class332("Invalid teleport!", "Unzulässiger Teleport!", "Téléportation non valide !", "Teleporte inválido!");
    }
}
