import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ft")
public class class4 {

    @OriginalMember(owner = "client!ft", name = "i", descriptor = "Lhp;")
    private class277 field32 = new class277(64);

    @OriginalMember(owner = "client!ft", name = "u", descriptor = "Lhp;")
    public class277 field44 = new class277(50);

    @OriginalMember(owner = "client!ft", name = "w", descriptor = "Ljda;")
    public class193 field46 = new class193(250);

    @OriginalMember(owner = "client!ft", name = "x", descriptor = "Lok;")
    private class216 field47 = new class216();

    @OriginalMember(owner = "client!ft", name = "A", descriptor = "Lhg;")
    private class602 field50;

    @OriginalMember(owner = "client!ft", name = "e", descriptor = "Lkea;")
    private class203 field28;

    @OriginalMember(owner = "client!ft", name = "b", descriptor = "Lkea;")
    public class203 field25;

    @OriginalMember(owner = "client!ft", name = "o", descriptor = "I")
    public int field38;

    @OriginalMember(owner = "client!ft", name = "g", descriptor = "Z")
    private boolean field30;

    @OriginalMember(owner = "client!ft", name = "c", descriptor = "I")
    public int field26;

    @OriginalMember(owner = "client!ft", name = "y", descriptor = "[Ljava/lang/String;")
    private String[] field48;

    @OriginalMember(owner = "client!ft", name = "z", descriptor = "[Ljava/lang/String;")
    private String[] field49;

    @OriginalMember(owner = "client!ft", name = "t", descriptor = "I")
    public static int field43 = 100;

    @OriginalMember(owner = "client!ft", name = "j", descriptor = "Lhp;")
    public static class277 field33 = new class277(260);

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "I")
    public static int field24;

    @OriginalMember(owner = "client!ft", name = "d", descriptor = "I")
    public static int field27;

    @OriginalMember(owner = "client!ft", name = "f", descriptor = "I")
    public static int field29;

    @OriginalMember(owner = "client!ft", name = "h", descriptor = "I")
    public static int field31;

    @OriginalMember(owner = "client!ft", name = "k", descriptor = "I")
    public static int field34;

    @OriginalMember(owner = "client!ft", name = "l", descriptor = "I")
    public static int field35;

    @OriginalMember(owner = "client!ft", name = "m", descriptor = "I")
    public static int field36;

    @OriginalMember(owner = "client!ft", name = "n", descriptor = "I")
    public static int field37;

    @OriginalMember(owner = "client!ft", name = "p", descriptor = "I")
    public static int field39;

    @OriginalMember(owner = "client!ft", name = "q", descriptor = "I")
    public static int field40;

    @OriginalMember(owner = "client!ft", name = "r", descriptor = "I")
    public static int field41;

    @OriginalMember(owner = "client!ft", name = "s", descriptor = "I")
    public static int field42;

    @OriginalMember(owner = "client!ft", name = "B", descriptor = "I")
    public int field51;

    @OriginalMember(owner = "client!ft", name = "v", descriptor = "[I")
    public static int[] field45;

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(ZI)V")
    public final void method14(boolean arg0, int arg1) {
        if (arg1 >= -17) {
            return;
        }
        field41++;
        if (arg0 != this.field30) {
            this.field30 = arg0;
            this.method18(20038);
        }
    }

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(BI)V")
    public final void method15(byte arg0, int arg1) {
        field42++;
        this.field51 = arg1;
        if (arg0 > 105) {
            class277 var3 = this.field44;
            synchronized (this.field44) {
                this.field44.method1810(false);
            }
        }
    }

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(I)V")
    public final void method16(int arg0) {
        field29++;
        class193 var2 = this.field46;
        synchronized (this.field46) {
            this.field46.method1171(0);
            if (arg0 != 8860) {
                this.field32 = null;
            }
        }
    }

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(B)V")
    public final void method17(byte arg0) {
        field35++;
        if (arg0 != -77) {
            this.field44 = null;
        }
        class277 var2 = this.field32;
        synchronized (this.field32) {
            this.field32.method1805(41);
        }
        class277 var3 = this.field44;
        synchronized (this.field44) {
            this.field44.method1805(111);
        }
        class193 var4 = this.field46;
        synchronized (this.field46) {
            this.field46.method1162((byte) 45);
        }
    }

    @OriginalMember(owner = "client!ft", name = "b", descriptor = "(I)V")
    public final void method18(int arg0) {
        field36++;
        class277 var2 = this.field32;
        synchronized (this.field32) {
            this.field32.method1810(false);
            if (arg0 != 20038) {
                this.field48 = null;
            }
        }
        class277 var3 = this.field44;
        synchronized (this.field44) {
            this.field44.method1810(false);
        }
        class193 var4 = this.field46;
        synchronized (this.field46) {
            this.field46.method1171(0);
        }
    }

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(Loa;Lvv;Loa;ZIIIZBIILta;)Lxa;")
    public final class433 method19(class605 arg0, class274 arg1, class605 arg2, boolean arg3, int arg4, int arg5, int arg6, boolean arg7, byte arg8, int arg9, int arg10, class181 arg11) {
        field27++;
        class433 var13 = this.method23(arg1, arg5, 3, arg9, arg6, arg10, arg4, arg2);
        if (var13 != null) {
            return var13;
        }
        class190 var14 = this.method25(arg4, -38);
        if (arg5 > 1 && var14.field2413 != null) {
            int var15 = -1;
            for (int var16 = 0; var16 < 10; var16++) {
                if (var14.field2374[var16] <= arg5 && var14.field2374[var16] != 0) {
                    var15 = var14.field2413[var16];
                }
            }
            if (var15 != -1) {
                var14 = this.method25(var15, -14);
            }
        }
        int var17 = -53 / ((-arg8 - 47) / 33);
        int[] var18 = var14.method1127(arg0, arg10, arg5, arg6, (byte) -89, arg1, arg2, arg9, arg11, arg3);
        if (var18 == null) {
            return null;
        }
        class433 var19;
        if (arg7) {
            var19 = arg0.method343(var18, 0, 36, 36, 32);
        } else {
            var19 = arg2.method343(var18, 0, 36, 36, 32);
        }
        if (!arg7) {
            class216 var20 = new class216();
            var20.field2986 = arg4;
            var20.field2983 = arg6;
            var20.field2975 = arg9;
            var20.field2979 = arg10;
            var20.field2985 = arg1 != null;
            var20.field2978 = arg2.field8846;
            var20.field2977 = arg5;
            this.field46.method1167(var20, -29355, var19);
        }
        return var19;
    }

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(BILrt;)V")
    public static final void method20(byte arg0, int arg1, class194 arg2) {
        if (class27.field287 != null) {
            try {
                class27.field287.method1665(0, 0L);
                class27.field287.method1658(0, arg2.field2622, arg1, 24);
            } catch (Exception var4) {
            }
        }
        field24++;
        int var3 = -60 % ((-arg0 - 14) / 42);
    }

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(Z)V")
    public final void method21(boolean arg0) {
        class277 var2 = this.field44;
        synchronized (this.field44) {
            this.field44.method1810(false);
        }
        field34++;
        if (!arg0) {
            this.method15((byte) -64, 30);
        }
    }

    @OriginalMember(owner = "client!ft", name = "c", descriptor = "(I)V")
    public static void method22(int arg0) {
        field33 = null;
        if (arg0 != 3) {
            field43 = 11;
        }
        field45 = null;
    }

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(Lvv;IIIIIILoa;)Lxa;")
    public final class433 method23(class274 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class605 arg7) {
        this.field47.field2986 = arg6;
        this.field47.field2983 = arg4;
        this.field47.field2977 = arg1;
        this.field47.field2975 = arg3;
        if (arg2 != 3) {
            method26(109, 78, 26, 104, 109, 2);
        }
        this.field47.field2985 = arg0 != null;
        this.field47.field2979 = arg5;
        this.field47.field2978 = arg7.field8846;
        field40++;
        return (class433) this.field46.method1165((byte) -82, this.field47);
    }

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(II)V")
    public final void method24(int arg0, int arg1) {
        field39++;
        class277 var3 = this.field32;
        synchronized (this.field32) {
            this.field32.method1811((byte) 120, arg1);
        }
        class277 var4 = this.field44;
        synchronized (this.field44) {
            int var5 = -79 % ((-arg0 - 69) / 44);
            this.field44.method1811((byte) -81, arg1);
        }
        class193 var6 = this.field46;
        synchronized (this.field46) {
            this.field46.method1166(arg1, 1);
        }
    }

    @OriginalMember(owner = "client!ft", name = "b", descriptor = "(II)Lbea;")
    public final class190 method25(int arg0, int arg1) {
        field37++;
        class277 var3 = this.field32;
        class190 var4;
        synchronized (this.field32) {
            var4 = (class190) this.field32.method1801(0, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class203 var5 = this.field28;
        byte[] var6;
        synchronized (this.field28) {
            var6 = this.field28.method1286(class82.method542(arg0, (byte) -61), class330.method2151(-93, arg0), (byte) -49);
        }
        class190 var7 = new class190();
        var7.field2352 = this;
        if (arg1 > -4) {
            return null;
        }
        var7.field2365 = arg0;
        var7.field2410 = new String[] { null, null, class428.field6358.method2902(this.field38, -20139), null, null };
        var7.field2341 = new String[] { null, null, null, null, class176.field2146.method2902(this.field38, -20139) };
        if (var6 != null) {
            var7.method1140(new class194(var6), -1);
        }
        var7.method1132((byte) 14);
        if (var7.field2381 != -1) {
            var7.method1129(this.method25(var7.field2381, -55), true, this.method25(var7.field2378, -69));
        }
        if (var7.field2411 != -1) {
            var7.method1136(this.method25(var7.field2372, -73), this.method25(var7.field2411, -73), 36);
        }
        if (!this.field30 && var7.field2337) {
            var7.field2408 = class452.field6744.method2902(this.field38, -20139);
            var7.field2396 = null;
            var7.field2341 = this.field49;
            var7.field2410 = this.field48;
            var7.field2338 = 0;
            var7.field2377 = false;
            if (var7.field2399 != null) {
                boolean var8 = false;
                for (class324 var9 = var7.field2399.method523(123); var9 != null; var9 = var7.field2399.method530(12714)) {
                    class403 var10 = this.field50.method3495(3, (int) var9.field4676);
                    if (var10.field6096) {
                        var9.method2108(true);
                    } else {
                        var8 = true;
                    }
                }
                if (!var8) {
                    var7.field2399 = null;
                }
            }
        }
        class277 var11 = this.field32;
        synchronized (this.field32) {
            this.field32.method1808((long) arg0, var7, (byte) -108);
            return var7;
        }
    }

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(IIIIII)V")
    public static final void method26(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field31++;
        int var6 = 0;
        int var7 = arg5;
        int var8 = arg1 * arg1;
        int var9 = arg5 * arg5;
        int var10 = var9 << 1;
        int var11 = var8 << 1;
        int var12 = arg5 << 1;
        int var13 = (1 - var12) * var8 + var10;
        int var14 = var9 - ((var12 - 1) * var11);
        int var15 = var8 << 2;
        int var16 = var9 << 2;
        int var17 = ((var6 << 1) + 3) * var10;
        int var18 = ((arg5 << 1) - 3) * var11;
        int var19 = (var6 + 1) * var16;
        int var20 = (arg3 + arg5) * var15;
        if (class418.field6298 <= arg2 && arg2 <= class461.field6877) {
            int var21 = class132.method818((byte) -93, arg0 + arg1, class113.field1385, field43);
            int var22 = class132.method818((byte) -93, arg0 - arg1, class113.field1385, field43);
            class645.method3675(arg3 + 90, class402.field6087[arg2], arg4, var22, var21);
        }
        while (var7 > 0) {
            if (var13 < 0) {
                while (var13 < 0) {
                    var13 += var17;
                    var14 += var19;
                    var6++;
                    var17 += var16;
                    var19 += var16;
                }
            }
            if (var14 < 0) {
                var13 += var17;
                var14 += var19;
                var19 += var16;
                var17 += var16;
                var6++;
            }
            var13 += -var20;
            var14 += -var18;
            var20 -= var15;
            var18 -= var15;
            var7--;
            int var23 = arg2 - var7;
            int var24 = arg2 + var7;
            if (var24 >= class418.field6298 && class461.field6877 >= var23) {
                int var25 = class132.method818((byte) -93, arg0 + var6, class113.field1385, field43);
                int var26 = class132.method818((byte) -93, arg0 - var6, class113.field1385, field43);
                if (var23 >= class418.field6298) {
                    class645.method3675(101, class402.field6087[var23], arg4, var26, var25);
                }
                if (var24 <= class461.field6877) {
                    class645.method3675(111, class402.field6087[var24], arg4, var26, var25);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ft", name = "<init>", descriptor = "(Lcda;IZLhg;Lkea;Lkea;)V")
    public class4(class149 arg0, int arg1, boolean arg2, class602 arg3, class203 arg4, class203 arg5) {
        this.field50 = arg3;
        this.field28 = arg4;
        this.field25 = arg5;
        this.field38 = arg1;
        this.field30 = arg2;
        if (this.field28 == null) {
            this.field26 = 0;
        } else {
            int var7 = this.field28.method1282(-104) - 1;
            this.field26 = var7 * 256 + this.field28.method1309(1675886592, var7);
        }
        this.field48 = new String[] { null, null, class428.field6358.method2902(this.field38, -20139), null, null };
        this.field49 = new String[] { null, null, null, null, class176.field2146.method2902(this.field38, -20139) };
    }
}
