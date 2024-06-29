import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ao")
public class class188 {

    @OriginalMember(owner = "client!ao", name = "k", descriptor = "Ljv;")
    private class55 field2807 = new class55(64);

    @OriginalMember(owner = "client!ao", name = "r", descriptor = "Ljv;")
    public class55 field2814 = new class55(50);

    @OriginalMember(owner = "client!ao", name = "v", descriptor = "Lpn;")
    public class523 field2818 = new class523(250);

    @OriginalMember(owner = "client!ao", name = "w", descriptor = "Lbt;")
    private class33 field2819 = new class33();

    @OriginalMember(owner = "client!ao", name = "h", descriptor = "Lbu;")
    public class17 field2804;

    @OriginalMember(owner = "client!ao", name = "A", descriptor = "Lbm;")
    private class74 field2823;

    @OriginalMember(owner = "client!ao", name = "o", descriptor = "Z")
    private boolean field2811;

    @OriginalMember(owner = "client!ao", name = "j", descriptor = "Lbu;")
    private class17 field2806;

    @OriginalMember(owner = "client!ao", name = "b", descriptor = "I")
    public int field2798;

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "I")
    public int field2797;

    @OriginalMember(owner = "client!ao", name = "z", descriptor = "[Ljava/lang/String;")
    private String[] field2822;

    @OriginalMember(owner = "client!ao", name = "y", descriptor = "[Ljava/lang/String;")
    private String[] field2821;

    @OriginalMember(owner = "client!ao", name = "c", descriptor = "I")
    public static int field2799;

    @OriginalMember(owner = "client!ao", name = "d", descriptor = "I")
    public static int field2800;

    @OriginalMember(owner = "client!ao", name = "e", descriptor = "I")
    public static int field2801;

    @OriginalMember(owner = "client!ao", name = "f", descriptor = "I")
    public static int field2802;

    @OriginalMember(owner = "client!ao", name = "g", descriptor = "I")
    public static int field2803;

    @OriginalMember(owner = "client!ao", name = "i", descriptor = "I")
    public static int field2805;

    @OriginalMember(owner = "client!ao", name = "l", descriptor = "I")
    public static int field2808;

    @OriginalMember(owner = "client!ao", name = "m", descriptor = "I")
    public static int field2809;

    @OriginalMember(owner = "client!ao", name = "n", descriptor = "I")
    public static int field2810;

    @OriginalMember(owner = "client!ao", name = "p", descriptor = "I")
    public static int field2812;

    @OriginalMember(owner = "client!ao", name = "q", descriptor = "I")
    public static int field2813;

    @OriginalMember(owner = "client!ao", name = "s", descriptor = "I")
    public static int field2815;

    @OriginalMember(owner = "client!ao", name = "t", descriptor = "I")
    public static int field2816;

    @OriginalMember(owner = "client!ao", name = "x", descriptor = "I")
    public int field2820;

    @OriginalMember(owner = "client!ao", name = "u", descriptor = "Lab;")
    public static class472 field2817;

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(II)V")
    public final void method1310(int arg0, int arg1) {
        if (arg0 <= 16) {
            this.method1311(11, -85, 25, -8, null, -59, 103, null);
        }
        this.field2820 = arg1;
        field2801++;
        class55 var3 = this.field2814;
        synchronized (this.field2814) {
            this.field2814.method488(-3);
        }
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(IIIILqa;IILqo;)Lf;")
    public final class529 method1311(int arg0, int arg1, int arg2, int arg3, class162 arg4, int arg5, int arg6, class19 arg7) {
        this.field2819.field650 = arg0;
        this.field2819.field649 = arg7 != null;
        this.field2819.field654 = arg3;
        field2803++;
        int var9 = 98 / ((arg6 - 7) / 41);
        this.field2819.field655 = arg1;
        this.field2819.field653 = arg4.field2502;
        this.field2819.field657 = arg2;
        this.field2819.field659 = arg5;
        return (class529) this.field2818.method3117(this.field2819, 24418);
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(BI)Lfq;")
    public final class134 method1312(byte arg0, int arg1) {
        field2809++;
        class55 var3 = this.field2807;
        class134 var4;
        synchronized (this.field2807) {
            var4 = (class134) this.field2807.method494(0, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field2806.method114(class201.method1390(arg1, false), class99.method739((byte) -110, arg1), -100);
        class134 var6 = new class134();
        var6.field2150 = this;
        var6.field2148 = arg1;
        var6.field2153 = new String[] { null, null, class177.field2701.method2180(this.field2798, 29491), null, null };
        var6.field2125 = new String[] { null, null, null, null, class274.field3967.method2180(this.field2798, arg0 ^ 0x7368) };
        if (var5 != null) {
            var6.method1000(60, new class145(var5));
        }
        var6.method997(-1663236324);
        if (var6.field2114 != -1) {
            var6.method1002((byte) -120, this.method1312((byte) 91, var6.field2114), this.method1312((byte) 91, var6.field2128));
        }
        if (var6.field2135 != -1) {
            var6.method1003(this.method1312((byte) 91, var6.field2135), this.method1312((byte) 91, var6.field2124), -72);
        }
        if (!this.field2811 && var6.field2102) {
            var6.field2133 = class412.field6163.method2180(this.field2798, arg0 ^ 0x7368);
            var6.field2126 = null;
            var6.field2125 = this.field2821;
            var6.field2153 = this.field2822;
            var6.field2146 = 0;
            var6.field2117 = false;
            if (var6.field2121 != null) {
                boolean var7 = false;
                for (class320 var8 = var6.field2121.method160((byte) -20); var8 != null; var8 = var6.field2121.method163(122)) {
                    class61 var9 = this.field2823.method597(11, (int) var8.field4904);
                    if (var9.field1068) {
                        var8.method2090(-1);
                    } else {
                        var7 = true;
                    }
                }
                if (!var7) {
                    var6.field2121 = null;
                }
            }
        }
        class55 var10 = this.field2807;
        synchronized (this.field2807) {
            this.field2807.method485((long) arg1, (byte) -125, var6);
            if (arg0 != 91) {
                method1314(64, false);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(IZ)V")
    public final void method1313(int arg0, boolean arg1) {
        field2816++;
        if (arg1 == this.field2811) {
            return;
        }
        this.field2811 = arg1;
        if (arg0 <= 36) {
            this.field2798 = 83;
        }
        this.method1316((byte) -77);
    }

    @OriginalMember(owner = "client!ao", name = "b", descriptor = "(IZ)I")
    public static final int method1314(int arg0, boolean arg1) {
        if (arg1) {
            field2813++;
            return arg0 >>> 7;
        } else {
            return 36;
        }
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(I)V")
    public final void method1315(int arg0) {
        field2810++;
        class523 var2 = this.field2818;
        synchronized (this.field2818) {
            if (arg0 <= -64) {
                this.field2818.method3125(true);
            }
        }
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(B)V")
    public final void method1316(byte arg0) {
        field2808++;
        if (arg0 != -77) {
            return;
        }
        class55 var2 = this.field2807;
        synchronized (this.field2807) {
            this.field2807.method488(-3);
        }
        class55 var3 = this.field2814;
        synchronized (this.field2814) {
            this.field2814.method488(-3);
        }
        class523 var4 = this.field2818;
        synchronized (this.field2818) {
            this.field2818.method3125(true);
        }
    }

    @OriginalMember(owner = "client!ao", name = "b", descriptor = "(B)V")
    public static void method1317(byte arg0) {
        field2817 = null;
        if (arg0 < 95) {
            method1318(-69, -17);
        }
    }

    @OriginalMember(owner = "client!ao", name = "b", descriptor = "(II)Z")
    public static final boolean method1318(int arg0, int arg1) {
        field2805++;
        if (arg0 == 10793) {
            return arg1 >= 0 && arg1 <= 3 || arg1 == 9;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(BLjava/lang/String;I)V")
    public static final void method1319(byte arg0, String arg1, int arg2) {
        field2799++;
        int var3 = class409.field6135;
        int[] var4 = class358.field5445;
        boolean var5 = false;
        if (arg0 != -33) {
            return;
        }
        for (int var6 = 0; var6 < var3; var6++) {
            class256 var7 = class183.field2747[var4[var6]];
            if (var7 != null && class139.field2224 != var7 && var7.field3684 != null && var7.field3684.equalsIgnoreCase(arg1)) {
                var5 = true;
                if (arg2 == 1) {
                    class388.field5838++;
                    class28.method321(class370.field5610, -5001);
                    class410.field6141.method1082(109, 0);
                    class410.field6141.method1080(var4[var6], 124);
                } else if (arg2 == 4) {
                    class495.field7310++;
                    class28.method321(class166.field2577, arg0 ^ 0x13A8);
                    class410.field6141.method1095(127, var4[var6]);
                    class410.field6141.method1114(-1971649880, 0);
                } else if (arg2 == 5) {
                    class185.field2762++;
                    class28.method321(class459.field6875, -5001);
                    class410.field6141.method1109(false, 0);
                    class410.field6141.method1080(var4[var6], 124);
                } else if (arg2 == 6) {
                    class28.method321(class462.field6927, -5001);
                    class447.field6712++;
                    class410.field6141.method1080(var4[var6], 124);
                    class410.field6141.method1082(124, 0);
                } else if (arg2 == 7) {
                    class28.method321(class431.field6410, -5001);
                    class147.field2349++;
                    class410.field6141.method1109(false, 0);
                    class410.field6141.method1080(var4[var6], 126);
                }
                break;
            }
        }
        if (!var5) {
            class101.method754(class510.field7523.method2180(client.field2870, 29491) + arg1, arg0 ^ 0xFFFFFFDF);
        }
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(ZZLqo;IIIIILqa;ILqa;Loa;)Lf;")
    public final class529 method1320(boolean arg0, boolean arg1, class19 arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class162 arg8, int arg9, class162 arg10, class489 arg11) {
        field2815++;
        class529 var13 = this.method1311(arg9, arg4, arg6, arg7, arg8, arg5, 86, arg2);
        if (arg3 != 0) {
            this.method1313(-73, true);
        }
        if (var13 != null) {
            return var13;
        }
        class134 var14 = this.method1312((byte) 91, arg5);
        if (arg7 > 1 && var14.field2149 != null) {
            int var15 = -1;
            for (int var16 = 0; var16 < 10; var16++) {
                if (arg7 >= var14.field2116[var16] && var14.field2116[var16] != 0) {
                    var15 = var14.field2149[var16];
                }
            }
            if (var15 != -1) {
                var14 = this.method1312((byte) 91, var15);
            }
        }
        int[] var17 = var14.method993(arg6, arg2, arg7, arg0, arg11, arg4, arg10, (byte) -49, arg8, arg9);
        if (var17 == null) {
            return null;
        }
        class529 var18;
        if (arg1) {
            var18 = arg10.method306(var17, 0, 36, 36, 32);
        } else {
            var18 = arg8.method306(var17, 0, 36, 36, 32);
        }
        if (!arg1) {
            class33 var19 = new class33();
            var19.field653 = arg8.field2502;
            var19.field650 = arg9;
            var19.field649 = arg2 != null;
            var19.field659 = arg5;
            var19.field657 = arg6;
            var19.field654 = arg7;
            var19.field655 = arg4;
            this.field2818.method3123(var19, (byte) -111, var18);
        }
        return var18;
    }

    @OriginalMember(owner = "client!ao", name = "b", descriptor = "(I)V")
    public final void method1321(int arg0) {
        class55 var2 = this.field2807;
        synchronized (this.field2807) {
            this.field2807.method484(120);
        }
        int var3 = -99 / ((45 - arg0) / 62);
        field2812++;
        class55 var4 = this.field2814;
        synchronized (this.field2814) {
            this.field2814.method484(108);
        }
        class523 var5 = this.field2818;
        synchronized (this.field2818) {
            this.field2818.method3124((byte) -128);
        }
    }

    @OriginalMember(owner = "client!ao", name = "c", descriptor = "(II)V")
    public final void method1322(int arg0, int arg1) {
        class55 var3 = this.field2807;
        synchronized (this.field2807) {
            this.field2807.method493(false, arg0);
        }
        field2802++;
        if (arg1 != -14665) {
            this.method1312((byte) -127, -44);
        }
        class55 var4 = this.field2814;
        synchronized (this.field2814) {
            this.field2814.method493(false, arg0);
        }
        class523 var5 = this.field2818;
        synchronized (this.field2818) {
            this.field2818.method3118(arg0, (byte) -121);
        }
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(Z)V")
    public final void method1323(boolean arg0) {
        field2800++;
        if (arg0) {
            this.method1323(true);
        }
        class55 var2 = this.field2814;
        synchronized (this.field2814) {
            this.field2814.method488(-3);
        }
    }

    @OriginalMember(owner = "client!ao", name = "<init>", descriptor = "(Loq;IZLbm;Lbu;Lbu;)V")
    public class188(class239 arg0, int arg1, boolean arg2, class74 arg3, class17 arg4, class17 arg5) {
        this.field2804 = arg5;
        this.field2823 = arg3;
        this.field2811 = arg2;
        this.field2806 = arg4;
        this.field2798 = arg1;
        if (this.field2806 == null) {
            this.field2797 = 0;
        } else {
            int var7 = this.field2806.method138(false) - 1;
            this.field2797 = this.field2806.method119(29630, var7) + var7 * 256;
        }
        this.field2822 = new String[] { null, null, class177.field2701.method2180(this.field2798, 29491), null, null };
        this.field2821 = new String[] { null, null, null, null, class274.field3967.method2180(this.field2798, 29491) };
    }
}
