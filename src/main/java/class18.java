import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mm")
public class class18 {

    @OriginalMember(owner = "client!mm", name = "h", descriptor = "Lad;")
    private class11 field298 = new class11(64);

    @OriginalMember(owner = "client!mm", name = "x", descriptor = "Lad;")
    public class11 field314 = new class11(50);

    @OriginalMember(owner = "client!mm", name = "z", descriptor = "Lua;")
    public class446 field316 = new class446(250);

    @OriginalMember(owner = "client!mm", name = "C", descriptor = "Lke;")
    private class360 field319 = new class360();

    @OriginalMember(owner = "client!mm", name = "j", descriptor = "Ldn;")
    private class201 field300;

    @OriginalMember(owner = "client!mm", name = "s", descriptor = "Ldn;")
    public class201 field309;

    @OriginalMember(owner = "client!mm", name = "H", descriptor = "Lep;")
    private class308 field324;

    @OriginalMember(owner = "client!mm", name = "i", descriptor = "I")
    public int field299;

    @OriginalMember(owner = "client!mm", name = "t", descriptor = "Z")
    private boolean field310;

    @OriginalMember(owner = "client!mm", name = "p", descriptor = "I")
    public int field306;

    @OriginalMember(owner = "client!mm", name = "E", descriptor = "[Ljava/lang/String;")
    private String[] field321;

    @OriginalMember(owner = "client!mm", name = "G", descriptor = "[Ljava/lang/String;")
    private String[] field323;

    @OriginalMember(owner = "client!mm", name = "c", descriptor = "Ldf;")
    public static class445 field293 = new class445();

    @OriginalMember(owner = "client!mm", name = "y", descriptor = "Loi;")
    public static class169 field315 = new class169("M", "M", "M", "M");

    @OriginalMember(owner = "client!mm", name = "D", descriptor = "[I")
    public static int[] field320 = new int[5];

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "I")
    public static int field291;

    @OriginalMember(owner = "client!mm", name = "b", descriptor = "I")
    public static int field292;

    @OriginalMember(owner = "client!mm", name = "d", descriptor = "I")
    public static int field294;

    @OriginalMember(owner = "client!mm", name = "e", descriptor = "I")
    public static int field295;

    @OriginalMember(owner = "client!mm", name = "f", descriptor = "I")
    public static int field296;

    @OriginalMember(owner = "client!mm", name = "g", descriptor = "I")
    public static int field297;

    @OriginalMember(owner = "client!mm", name = "k", descriptor = "I")
    public static int field301;

    @OriginalMember(owner = "client!mm", name = "l", descriptor = "I")
    public static int field302;

    @OriginalMember(owner = "client!mm", name = "m", descriptor = "I")
    public static int field303;

    @OriginalMember(owner = "client!mm", name = "n", descriptor = "I")
    public static int field304;

    @OriginalMember(owner = "client!mm", name = "o", descriptor = "I")
    public static int field305;

    @OriginalMember(owner = "client!mm", name = "q", descriptor = "I")
    public static int field307;

    @OriginalMember(owner = "client!mm", name = "r", descriptor = "I")
    public static int field308;

    @OriginalMember(owner = "client!mm", name = "u", descriptor = "I")
    public static int field311;

    @OriginalMember(owner = "client!mm", name = "v", descriptor = "I")
    public static int field312;

    @OriginalMember(owner = "client!mm", name = "A", descriptor = "I")
    public static int field317;

    @OriginalMember(owner = "client!mm", name = "B", descriptor = "I")
    public static int field318;

    @OriginalMember(owner = "client!mm", name = "F", descriptor = "I")
    public int field322;

    @OriginalMember(owner = "client!mm", name = "w", descriptor = "Lsv;")
    public static class317 field313;

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(II)Lqe;", line = 4)
    public final class497 method111(int arg0, int arg1) {
        field304++;
        class11 var3 = this.field298;
        class497 var4;
        synchronized (this.field298) {
            var4 = (class497) this.field298.method78((long) arg0, (byte) -118);
        }
        if (var4 != null) {
            return var4;
        }
        int var5 = 23 % ((-arg1 - 15) / 50);
        byte[] var6 = this.field300.method1313((byte) -119, class495.method2959(arg0, (byte) 85), class456.method2702(-79, arg0));
        class497 var7 = new class497();
        var7.field7314 = arg0;
        var7.field7250 = this;
        var7.field7251 = new String[] { null, null, class171.field2217.method1127(this.field299, false), null, null };
        var7.field7272 = new String[] { null, null, null, null, class234.field3054.method1127(this.field299, false) };
        if (var6 != null) {
            var7.method2964(-1, new class88(var6));
        }
        var7.method2963(-19837);
        if (var7.field7291 != -1) {
            var7.method2980(this.method111(var7.field7291, 89), this.method111(var7.field7270, -110), (byte) -70);
        }
        if (var7.field7286 != -1) {
            var7.method2981(this.method111(var7.field7256, -109), this.method111(var7.field7286, -123), (byte) 121);
        }
        if (!this.field310 && var7.field7260) {
            var7.field7262 = class221.field2832.method1127(this.field299, false);
            var7.field7288 = null;
            var7.field7259 = false;
            var7.field7272 = this.field323;
            var7.field7251 = this.field321;
            var7.field7299 = 0;
            if (var7.field7326 != null) {
                boolean var8 = false;
                for (class508 var9 = var7.field7326.method2087(0); var9 != null; var9 = var7.field7326.method2091(-126)) {
                    class483 var10 = this.field324.method1837(11, (int) var9.field7456);
                    if (var10.field7031) {
                        var9.method3021(-118);
                    } else {
                        var8 = true;
                    }
                }
                if (!var8) {
                    var7.field7326 = null;
                }
            }
        }
        class11 var11 = this.field298;
        synchronized (this.field298) {
            this.field298.method88((long) arg0, 101, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(I)V", line = 84)
    public static final void method112(int arg0) {
        if (arg0 >= -19) {
            return;
        }
        if (class40.field587 == null || class234.field3041 == null) {
            class40.field587 = new int[256];
            class234.field3041 = new int[256];
            for (int var1 = 0; var1 < 256; var1++) {
                double var2 = (double) var1 / 255.0D * 6.283185307179586D;
                class40.field587[var1] = (int) (Math.sin(var2) * 4096.0D);
                class234.field3041[var1] = (int) (Math.cos(var2) * 4096.0D);
            }
        }
        field305++;
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(ZLai;IIIIILqa;)Lf;", line = 114)
    public final class404 method113(boolean arg0, class345 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class129 arg7) {
        this.field319.field4649 = arg1 != null;
        if (arg0) {
            this.method124(123, (byte) -85);
        }
        this.field319.field4657 = arg3;
        this.field319.field4661 = arg2;
        this.field319.field4659 = arg5;
        this.field319.field4662 = arg4;
        field294++;
        this.field319.field4656 = arg7.field1760;
        this.field319.field4660 = arg6;
        return (class404) this.field316.method2649(0, this.field319);
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(BZ)V", line = 132)
    public final void method114(byte arg0, boolean arg1) {
        field302++;
        if (arg1 != this.field310) {
            this.field310 = arg1;
            this.method115(256);
            int var3 = 12 % ((arg0 - 28) / 63);
        }
    }

    @OriginalMember(owner = "client!mm", name = "b", descriptor = "(I)V", line = 146)
    public final void method115(int arg0) {
        field301++;
        class11 var2 = this.field298;
        synchronized (this.field298) {
            if (arg0 != 256) {
                this.method117((byte) -113, -8);
            }
            this.field298.method90((byte) -27);
        }
        class11 var3 = this.field314;
        synchronized (this.field314) {
            this.field314.method90((byte) -27);
        }
        class446 var4 = this.field316;
        synchronized (this.field316) {
            this.field316.method2651(1);
        }
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(ILqv;IIII)V", line = 166)
    public static final void method116(int arg0, class72 arg1, int arg2, int arg3, int arg4, int arg5) {
        field295++;
        if (arg1.field902 == -1 && arg1.field887 == null) {
            return;
        }
        int var6 = 0;
        if (arg3 > arg1.field883) {
            var6 += arg3 - arg1.field883;
        } else if (arg1.field896 > arg3) {
            var6 += arg1.field896 - arg3;
        }
        int var7 = class421.field5647.field7695 * arg1.field885 >> 8;
        if (arg1.field897 < arg2) {
            var6 += arg2 - arg1.field897;
        } else if (arg1.field906 > arg2) {
            var6 += arg1.field906 - arg2;
        }
        if (arg1.field890 == 0 || var6 - 64 > arg1.field890 || class421.field5647.field7695 == 0 || arg1.field892 != arg5) {
            if (arg1.field886 != null) {
                field313.method1890(arg1.field886);
                arg1.field886 = null;
            }
            if (arg1.field893 != null) {
                field313.method1890(arg1.field893);
                arg1.field893 = null;
            }
        } else if (arg0 < -89) {
            var6 -= 64;
            if (var6 < 0) {
                var6 = 0;
            }
            int var8 = (arg1.field890 - var6) * var7 / arg1.field890;
            if (arg1.field886 != null) {
                arg1.field886.method2283(var8);
            } else if (arg1.field902 >= 0) {
                class384 var9 = class384.method2299(class135.field1829, arg1.field902, 0);
                if (var9 != null) {
                    class59 var10 = var9.method2300().method337(class439.field6117);
                    class383 var11 = class383.method2257(var10, 100, var8);
                    var11.method2287(-1);
                    field313.method1891(var11);
                    arg1.field886 = var11;
                }
            }
            if (arg1.field893 != null) {
                arg1.field893.method2283(var8);
                if (!arg1.field893.method3019(-128)) {
                    arg1.field893 = null;
                }
            } else if (arg1.field887 != null && (arg1.field888 -= arg4) <= 0) {
                int var12 = (int) (Math.random() * (double) arg1.field887.length);
                class384 var13 = class384.method2299(class135.field1829, arg1.field887[var12], 0);
                if (var13 != null) {
                    class59 var14 = var13.method2300().method337(class439.field6117);
                    class383 var15 = class383.method2257(var14, 100, var8);
                    var15.method2287(0);
                    field313.method1891(var15);
                    arg1.field893 = var15;
                    arg1.field888 = arg1.field904 + (int) ((double) (arg1.field905 - arg1.field904) * Math.random());
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(BI)V", line = 292)
    public final void method117(byte arg0, int arg1) {
        this.field322 = arg1;
        field297++;
        class11 var3 = this.field314;
        synchronized (this.field314) {
            this.field314.method90((byte) -27);
            if (arg0 != -26) {
                this.field322 = 57;
            }
        }
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(ILai;IIIZLqa;Lqa;Loa;IZB)Lf;", line = 307)
    public final class404 method118(int arg0, class345 arg1, int arg2, int arg3, int arg4, boolean arg5, class129 arg6, class129 arg7, class167 arg8, int arg9, boolean arg10, byte arg11) {
        field296++;
        class404 var13 = this.method113(false, arg1, arg9, arg2, arg4, arg3, arg0, arg7);
        if (var13 != null) {
            return var13;
        }
        class497 var14 = this.method111(arg0, 94);
        if (arg4 > 1 && var14.field7280 != null) {
            int var15 = -1;
            for (int var16 = 0; var16 < 10; var16++) {
                if (var14.field7248[var16] <= arg4 && var14.field7248[var16] != 0) {
                    var15 = var14.field7280[var16];
                }
            }
            if (var15 != -1) {
                var14 = this.method111(var15, -101);
            }
        }
        int[] var17 = var14.method2971(arg4, arg5, arg2, arg8, arg7, -128, arg3, arg1, arg9, arg6);
        if (var17 == null) {
            return null;
        }
        class404 var18;
        if (arg10) {
            var18 = arg6.method921(var17, 0, 36, 36, 32);
        } else {
            var18 = arg7.method921(var17, 0, 36, 36, 32);
        }
        if (arg11 != -97) {
            this.method118(-55, null, -80, -114, 51, true, null, null, null, 58, false, (byte) 32);
        }
        if (!arg10) {
            class360 var19 = new class360();
            var19.field4661 = arg9;
            var19.field4662 = arg4;
            var19.field4657 = arg2;
            var19.field4656 = arg7.field1760;
            var19.field4660 = arg0;
            var19.field4659 = arg3;
            var19.field4649 = arg1 != null;
            this.field316.method2648(var19, var18, 43);
        }
        return var18;
    }

    @OriginalMember(owner = "client!mm", name = "b", descriptor = "(BI)Z", line = 378)
    public static final boolean method119(byte arg0, int arg1) {
        if (arg0 != -80) {
            method116(8, null, -27, -56, 29, -113);
        }
        field308++;
        class311 var2 = class129.method819(-126, arg1);
        if (var2 == null) {
            return false;
        } else if (class441.field6150 == 3) {
            String var3 = "";
            if (class246.field3151 != class222.field2867) {
                var3 = ":" + (var2.field4008 + 7000);
            }
            String var4 = "";
            if (class297.field3851 != null) {
                var4 = "/p=" + class297.field3851;
            }
            String var5 = "http://" + var2.field4012 + var3 + "/l=" + class379.field4920 + "/a=" + class326.field4189 + var4 + "/j" + (class251.field3199 ? "1" : "0") + ",o" + (class352.field4502 ? "1" : "0") + ",a2";
            try {
                class396.field5266.getAppletContext().showDocument(new URL(var5), "_self");
                return true;
            } catch (Exception var6) {
                return false;
            }
        } else {
            class375.field4875 = var2.field4008;
            class385.field5066 = var2.field4012;
            if (class246.field3151 != class222.field2867) {
                class385.field5067 = class375.field4875 + 50000;
                class531.field7821 = class375.field4875 + 40000;
                class116.field1631 = class531.field7821;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(B)V", line = 431)
    public final void method120(byte arg0) {
        field292++;
        class11 var2 = this.field298;
        synchronized (this.field298) {
            this.field298.method84(97);
        }
        class11 var3 = this.field314;
        synchronized (this.field314) {
            int var4 = 98 % ((17 - arg0) / 36);
            this.field314.method84(85);
        }
        class446 var5 = this.field316;
        synchronized (this.field316) {
            this.field316.method2652((byte) 36);
        }
    }

    @OriginalMember(owner = "client!mm", name = "b", descriptor = "(B)V", line = 451)
    public static void method121(byte arg0) {
        if (arg0 >= -65) {
            method112(-126);
        }
        field315 = null;
        field293 = null;
        field313 = null;
        field320 = null;
    }

    @OriginalMember(owner = "client!mm", name = "c", descriptor = "(B)V", line = 469)
    public final void method122(byte arg0) {
        if (arg0 != -102) {
            this.method120((byte) -111);
        }
        field312++;
        class446 var2 = this.field316;
        synchronized (this.field316) {
            this.field316.method2651(1);
        }
    }

    @OriginalMember(owner = "client!mm", name = "<init>", descriptor = "(Lgt;IZLep;Ldn;Ldn;)V", line = 549)
    public class18(class65 arg0, int arg1, boolean arg2, class308 arg3, class201 arg4, class201 arg5) {
        this.field300 = arg4;
        this.field309 = arg5;
        this.field324 = arg3;
        this.field299 = arg1;
        this.field310 = arg2;
        if (this.field300 == null) {
            this.field306 = 0;
        } else {
            int var7 = this.field300.method1309((byte) 31) - 1;
            this.field306 = var7 * 256 + this.field300.method1302(-106, var7);
        }
        this.field321 = new String[] { null, null, class171.field2217.method1127(this.field299, false), null, null };
        this.field323 = new String[] { null, null, null, null, class234.field3054.method1127(this.field299, false) };
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(Z)V", line = 488)
    public final void method123(boolean arg0) {
        class11 var2 = this.field314;
        synchronized (this.field314) {
            if (arg0) {
                return;
            }
            this.field314.method90((byte) -27);
        }
        field291++;
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(IB)V", line = 501)
    public final void method124(int arg0, byte arg1) {
        field311++;
        class11 var3 = this.field298;
        synchronized (this.field298) {
            this.field298.method80(-93, arg0);
        }
        class11 var4 = this.field314;
        synchronized (this.field314) {
            this.field314.method80(-102, arg0);
        }
        class446 var5 = this.field316;
        synchronized (this.field316) {
            this.field316.method2650(arg0, 0);
        }
        if (arg1 >= -104) {
            this.field321 = null;
        }
    }
}
