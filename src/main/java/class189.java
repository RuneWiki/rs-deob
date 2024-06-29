import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pv")
public class class189 {

    @OriginalMember(owner = "client!pv", name = "b", descriptor = "I")
    public int field2354 = 512;

    @OriginalMember(owner = "client!pv", name = "c", descriptor = "I")
    public int field2355 = -1;

    @OriginalMember(owner = "client!pv", name = "f", descriptor = "I")
    private int field2358 = 0;

    @OriginalMember(owner = "client!pv", name = "o", descriptor = "Z")
    public boolean field2367 = true;

    @OriginalMember(owner = "client!pv", name = "q", descriptor = "Z")
    public boolean field2369 = true;

    @OriginalMember(owner = "client!pv", name = "l", descriptor = "[I")
    public static int[] field2364 = new int[5];

    @OriginalMember(owner = "client!pv", name = "p", descriptor = "I")
    public static int field2368 = 0;

    @OriginalMember(owner = "client!pv", name = "d", descriptor = "Lv;")
    public static class165 field2356 = new class165();

    @OriginalMember(owner = "client!pv", name = "s", descriptor = "I")
    public static int field2371 = 0;

    @OriginalMember(owner = "client!pv", name = "m", descriptor = "F")
    public static float field2365;

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "I")
    public int field2353;

    @OriginalMember(owner = "client!pv", name = "e", descriptor = "I")
    public static int field2357;

    @OriginalMember(owner = "client!pv", name = "g", descriptor = "I")
    public int field2359;

    @OriginalMember(owner = "client!pv", name = "h", descriptor = "I")
    public static int field2360;

    @OriginalMember(owner = "client!pv", name = "i", descriptor = "I")
    public static int field2361;

    @OriginalMember(owner = "client!pv", name = "j", descriptor = "I")
    public int field2362;

    @OriginalMember(owner = "client!pv", name = "k", descriptor = "I")
    public static int field2363;

    @OriginalMember(owner = "client!pv", name = "n", descriptor = "I")
    public int field2366;

    @OriginalMember(owner = "client!pv", name = "r", descriptor = "I")
    public static int field2370;

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "(IZLgga;)V")
    private final void method1180(int arg0, boolean arg1, class511 arg2) {
        field2370++;
        if (arg1) {
            this.field2359 = -14;
        }
        if (arg0 == 1) {
            this.field2358 = arg2.method2983(true);
            this.method1183(17164, this.field2358);
        } else if (arg0 == 2) {
            this.field2355 = arg2.method3002(-1);
            if (this.field2355 == 65535) {
                this.field2355 = -1;
            }
        } else if (arg0 == 3) {
            this.field2354 = arg2.method3002(-1) << 2;
        } else if (arg0 == 4) {
            this.field2369 = false;
        } else if (arg0 == 5) {
            this.field2367 = false;
            return;
        }
    }

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "(I)V")
    public static final void method1181(int arg0) {
        field2363++;
        client var1 = class274.field3958;
        synchronized (class274.field3958) {
            if (class661.field9305 == null) {
                Container var2;
                if (class43.field453 != null) {
                    var2 = class43.field453;
                } else if (class511.field7007 == null) {
                    var2 = class785.field10774;
                } else {
                    var2 = class511.field7007;
                }
                class20.field163 = var2.getSize().width;
                class277.field3991 = var2.getSize().height;
                if (class43.field453 == var2) {
                    Insets var3 = class43.field453.getInsets();
                    class277.field3991 -= var3.top + var3.bottom;
                    class20.field163 -= var3.right + var3.left;
                }
                if (class647.method3714(-26) == 1) {
                    class249.field3700 = class565.field7983;
                    class339.field4915 = (class20.field163 - class456.field6378) / 2;
                    class424.field5890 = 0;
                    class742.field10226 = class456.field6378;
                } else {
                    class462.method2779((byte) -119);
                }
                if (class425.field5937 != class224.field3414) {
                    boolean var10000;
                    if (class742.field10226 < 1024 && class249.field3700 < 768) {
                        var10000 = true;
                    } else {
                        var10000 = false;
                    }
                }
                class749.field10341.setSize(class742.field10226, class249.field3700);
                if (class111.field1332 != null) {
                    if (class55.field651) {
                        class664.method3787((byte) -81, class749.field10341);
                    } else {
                        class111.field1332.method190(class749.field10341, class742.field10226, class249.field3700);
                    }
                }
                if (class43.field453 == var2) {
                    Insets var4 = class43.field453.getInsets();
                    class749.field10341.setLocation(var4.left + class339.field4915, class424.field5890 + var4.top);
                } else {
                    class749.field10341.setLocation(class339.field4915, class424.field5890);
                }
                if (class610.field8597 != arg0) {
                    class513.method3056(true, (byte) -73);
                }
                class670.method3826(true);
            }
        }
    }

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "(Lgga;B)V")
    public final void method1182(class511 arg0, byte arg1) {
        field2357++;
        if (arg1 != -13) {
            this.field2359 = 71;
        }
        while (true) {
            int var3 = arg0.method3013(arg1 ^ 0xFFFFFFFA);
            if (var3 == 0) {
                return;
            }
            this.method1180(var3, false, arg0);
        }
    }

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "(II)V")
    private final void method1183(int arg0, int arg1) {
        if (arg0 != 17164) {
            this.field2367 = false;
        }
        field2360++;
        double var3 = (double) (arg1 >> 16 & 0xFF) / 256.0D;
        double var5 = (double) ((arg1 & 0xFF28) >> 8) / 256.0D;
        double var7 = (double) (arg1 & 0xFF) / 256.0D;
        double var9 = var3;
        if (var5 < var3) {
            var9 = var5;
        }
        if (var7 < var9) {
            var9 = var7;
        }
        double var11 = var3;
        if (var3 < var5) {
            var11 = var5;
        }
        if (var11 < var7) {
            var11 = var7;
        }
        double var13 = 0.0D;
        double var15 = 0.0D;
        double var17 = (var9 + var11) / 2.0D;
        if (var9 != var11) {
            if (var17 < 0.5D) {
                var15 = (var11 - var9) / (var9 + var11);
            }
            if (var17 >= 0.5D) {
                var15 = (var11 - var9) / (2.0D - var11 - var9);
            }
            if (var3 == var11) {
                var13 = (var5 - var7) / (var11 - var9);
            } else if (var5 == var11) {
                var13 = (var7 - var3) / (var11 - var9) + 2.0D;
            } else if (var7 == var11) {
                var13 = (var3 - var5) / (var11 - var9) + 4.0D;
            }
        }
        this.field2359 = (int) (var15 * 256.0D);
        double var19 = var13 / 6.0D;
        this.field2362 = (int) (var17 * 256.0D);
        if ((var17 > 0.5D)) {
            this.field2353 = (int) ((1.0D - var17) * var15 * 512.0D);
        } else {
            this.field2353 = (int) (var15 * var17 * 512.0D);
        }
        if (this.field2362 < 0) {
            this.field2362 = 0;
        } else if (this.field2362 > 255) {
            this.field2362 = 255;
        }
        if (this.field2359 < 0) {
            this.field2359 = 0;
        } else if (this.field2359 > 255) {
            this.field2359 = 255;
        }
        if (this.field2353 < 1) {
            this.field2353 = 1;
        }
        this.field2366 = (int) ((double) this.field2353 * var19);
    }

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "(Z)V")
    public static final void method1184(boolean arg0) {
        if (class386.field5508 == null) {
            class386.field5508 = class602.method3482(124);
            class570.field8022 = class386.field5508[0];
            class697.field9714 = class683.method3903((byte) 4);
        }
        field2361++;
        if (class409.field5750 == null) {
            class419.method2533(1);
        }
        class602 var1 = class570.field8022;
        int var2 = class380.method2372(arg0);
        if (class570.field8022 == var1) {
            class699.field9735 = class570.field8022.field8418.method3999(class553.field7667, (byte) -121);
            if (class570.field8022.field8414) {
                class13.field77 = (class570.field8022.field8423 - class570.field8022.field8416) * var2 / 100 + class570.field8022.field8416;
            }
            if (class570.field8022.field8419) {
                class699.field9735 = class699.field9735 + class13.field77 + "%";
            }
        } else if (class602.field8443 == class570.field8022) {
            class409.field5750 = null;
            class285.method1884(true, 3);
        } else {
            class699.field9735 = var1.field8415.method3999(class553.field7667, (byte) -53);
            if (class570.field8022.field8419) {
                class699.field9735 = class699.field9735 + var1.field8423 + "%";
            }
            class13.field77 = var1.field8423;
            if (class570.field8022.field8414 || var1.field8414) {
                class697.field9714 = class683.method3903((byte) 4);
            }
        }
        if (class409.field5750 == null) {
            return;
        }
        class409.field5750.method958(class13.field77, !arg0, class570.field8022, class697.field9714, class699.field9735);
        if (class381.field5458 == null) {
            return;
        }
        for (int var3 = class677.field9482 + 1; var3 < class381.field5458.length; var3++) {
            if (class381.field5458[var3].method113(-7350) >= 100 && var3 - 1 == class677.field9482 && class664.field9331 >= 1 && class409.field5750.method960((byte) -82)) {
                try {
                    class381.field5458[var3].method112(false);
                } catch (Exception var4) {
                    class381.field5458 = null;
                    return;
                }
                class409.field5750.method963((byte) 99, class381.field5458[var3]);
                class677.field9482++;
                if ((class381.field5458.length - 1) <= class677.field9482 && class381.field5458.length > 1) {
                    class677.field9482 = class793.field10874.method3138(0) ? 0 : -1;
                }
            }
        }
        return;
    }

    @OriginalMember(owner = "client!pv", name = "b", descriptor = "(I)V")
    public static void method1185(int arg0) {
        field2356 = null;
        if (arg0 != 0) {
            field2371 = -117;
        }
        field2364 = null;
    }
}
