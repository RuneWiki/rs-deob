import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ol")
public class class336 {

    @OriginalMember(owner = "client!ol", name = "b", descriptor = "I")
    public int field4548 = -1;

    @OriginalMember(owner = "client!ol", name = "h", descriptor = "Z")
    public boolean field4554 = false;

    @OriginalMember(owner = "client!ol", name = "k", descriptor = "[I")
    private int[] field4557 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!ol", name = "f", descriptor = "I")
    public static int field4552 = -1;

    @OriginalMember(owner = "client!ol", name = "j", descriptor = "Ljava/lang/String;")
    public static String field4556 = "Please remove ";

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "I")
    public static int field4547;

    @OriginalMember(owner = "client!ol", name = "c", descriptor = "I")
    public static int field4549;

    @OriginalMember(owner = "client!ol", name = "d", descriptor = "I")
    public static int field4550;

    @OriginalMember(owner = "client!ol", name = "g", descriptor = "I")
    public static int field4553;

    @OriginalMember(owner = "client!ol", name = "i", descriptor = "I")
    public static int field4555;

    @OriginalMember(owner = "client!ol", name = "m", descriptor = "I")
    public static int field4559;

    @OriginalMember(owner = "client!ol", name = "n", descriptor = "I")
    public static int field4560;

    @OriginalMember(owner = "client!ol", name = "o", descriptor = "I")
    public static int field4561;

    @OriginalMember(owner = "client!ol", name = "r", descriptor = "[I")
    private int[] field4564;

    @OriginalMember(owner = "client!ol", name = "e", descriptor = "[S")
    private short[] field4551;

    @OriginalMember(owner = "client!ol", name = "l", descriptor = "[S")
    private short[] field4558;

    @OriginalMember(owner = "client!ol", name = "p", descriptor = "[S")
    private short[] field4562;

    @OriginalMember(owner = "client!ol", name = "q", descriptor = "[S")
    private short[] field4563;

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(BIIIZI)V")
    public static final void method2124(byte arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        if (arg4) {
            class114.method924(0);
        }
        field4550++;
        int var6 = -10 % ((63 - arg0) / 53);
        if (class416.field5820 != null && (arg1 != 3 || class42.field638 != arg5 || class422.field5903 != arg3)) {
            class35.method358(class30.field502, class416.field5820, 0);
            class416.field5820 = null;
        }
        if (arg1 == 3 && class416.field5820 == null) {
            class416.field5820 = class359.method2253(0, 0, arg3, class30.field502, arg5, 25788);
            if (class416.field5820 != null) {
                class42.field638 = arg5;
                class422.field5903 = arg3;
                class447.method2786((byte) 88, class30.field502);
            }
        }
        if (arg1 == 3 && class416.field5820 == null) {
            method2124((byte) 126, class102.field1513, arg2, -1, true, -1);
            return;
        }
        Container var7;
        if (class416.field5820 != null) {
            class417.field5853 = arg5;
            var7 = class416.field5820;
            class135.field1927 = arg3;
        } else if (class414.field5781 == null) {
            var7 = class30.field502.field4117;
            class417.field5853 = var7.getSize().width;
            class135.field1927 = var7.getSize().height;
        } else {
            Insets var8 = class414.field5781.getInsets();
            class417.field5853 = class414.field5781.getSize().width - var8.left - var8.right;
            int var10001 = var8.top + var8.bottom;
            class135.field1927 = class414.field5781.getSize().height - var10001;
            var7 = class414.field5781;
        }
        if (arg1 == 1) {
            class258.field3488 = 503;
            class249.field3414 = 765;
            class172.field2520 = (class417.field5853 - 765) / 2;
            class134.field1915 = 0;
        } else if (class297.field4005 < 96 && class243.field3355 == 0) {
            int var9 = class417.field5853 > 1024 ? 1024 : class417.field5853;
            class249.field3414 = var9;
            class172.field2520 = (class417.field5853 - var9) / 2;
            int var10 = class135.field1927 > 768 ? 768 : class135.field1927;
            class134.field1915 = 0;
            class258.field3488 = var10;
        } else {
            class172.field2520 = 0;
            class249.field3414 = class417.field5853;
            class134.field1915 = 0;
            class258.field3488 = class135.field1927;
        }
        if (class445.field6400 != 0) {
            boolean var10000;
            if (class249.field3414 < 1024 && class258.field3488 < 768) {
                var10000 = true;
            } else {
                var10000 = false;
            }
        }
        if (arg4) {
            class447.method2785(class243.field3355, (byte) 109);
        } else {
            class418.field5867.setSize(class249.field3414, class258.field3488);
            if (class249.field3415 != null) {
                class249.field3415.method174();
            }
            if (class414.field5781 == var7) {
                Insets var11 = class414.field5781.getInsets();
                class418.field5867.setLocation(var11.left + class172.field2520, class134.field1915 + var11.top);
            } else {
                class418.field5867.setLocation(class172.field2520, class134.field1915);
            }
        }
        if (arg1 >= 2) {
            class164.field2417 = true;
        } else {
            class164.field2417 = false;
        }
        if (class149.field2288 != -1) {
            class22.method282(true, -112);
        }
        if (class105.field1540 != null && (class166.field2472 == 30 || class166.field2472 == 25)) {
            class132.method1033(-53);
        }
        for (int var12 = 0; var12 < 100; var12++) {
            class135.field1930[var12] = true;
        }
        class415.field5809 = true;
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(I)Lmr;")
    public final class84 method2125(int arg0) {
        field4561++;
        if (this.field4564 == null) {
            return null;
        }
        class84[] var2 = new class84[this.field4564.length];
        class427 var3 = class96.field1394;
        synchronized (class96.field1394) {
            int var4 = 0;
            while (true) {
                if (this.field4564.length <= var4) {
                    break;
                }
                var2[var4] = class128.method1002(this.field4564[var4], (byte) 126, 0, class96.field1394);
                var4++;
            }
        }
        int var5 = 95 / ((arg0 + 41) / 63);
        class84 var6;
        if (var2.length == 1) {
            var6 = var2[0];
        } else {
            var6 = new class84(var2, var2.length);
        }
        if (var6 == null) {
            return null;
        }
        if (this.field4551 != null) {
            for (int var7 = 0; var7 < this.field4551.length; var7++) {
                var6.method758(this.field4551[var7], this.field4558[var7], 256);
            }
        }
        if (this.field4562 != null) {
            for (int var8 = 0; var8 < this.field4562.length; var8++) {
                var6.method771((byte) 32, this.field4562[var8], this.field4563[var8]);
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(B)Z")
    public final boolean method2126(byte arg0) {
        field4559++;
        boolean var2 = true;
        if (arg0 > -54) {
            return true;
        }
        class427 var3 = class96.field1394;
        synchronized (class96.field1394) {
            for (int var4 = 0; var4 < 5; var4++) {
                if (this.field4557[var4] != -1 && !class96.field1394.method2628((byte) 107, this.field4557[var4], 0)) {
                    var2 = false;
                }
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!ol", name = "b", descriptor = "(B)Z")
    public final boolean method2127(byte arg0) {
        field4555++;
        if (this.field4564 == null) {
            return true;
        }
        boolean var2 = true;
        class427 var3 = class96.field1394;
        synchronized (class96.field1394) {
            int var4 = -63 % ((arg0 + 49) / 37);
            for (int var5 = 0; var5 < this.field4564.length; var5++) {
                if (!class96.field1394.method2628((byte) -115, this.field4564[var5], 0)) {
                    var2 = false;
                }
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(Z)Lmr;")
    public final class84 method2128(boolean arg0) {
        field4560++;
        class84[] var2 = new class84[5];
        int var3 = 0;
        class427 var4 = class96.field1394;
        synchronized (class96.field1394) {
            for (int var5 = 0; var5 < 5; var5++) {
                if (this.field4557[var5] != -1) {
                    var2[var3++] = class128.method1002(this.field4557[var5], (byte) 126, 0, class96.field1394);
                }
            }
        }
        if (arg0) {
            this.field4558 = null;
        }
        class84 var6 = new class84(var2, var3);
        if (this.field4551 != null) {
            for (int var7 = 0; var7 < this.field4551.length; var7++) {
                var6.method758(this.field4551[var7], this.field4558[var7], 256);
            }
        }
        if (this.field4562 != null) {
            for (int var8 = 0; var8 < this.field4562.length; var8++) {
                var6.method771((byte) 103, this.field4562[var8], this.field4563[var8]);
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(Lap;BI)V")
    private final void method2129(class289 arg0, byte arg1, int arg2) {
        if (arg1 != -50) {
            this.field4558 = null;
        }
        field4549++;
        if (arg2 == 1) {
            this.field4548 = arg0.method1861((byte) -72);
        } else if (arg2 == 2) {
            int var8 = arg0.method1861((byte) -72);
            this.field4564 = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field4564[var9] = arg0.method1853(-64);
            }
        } else if (arg2 == 3) {
            this.field4554 = true;
            return;
        } else if (arg2 == 40) {
            int var4 = arg0.method1861((byte) -72);
            this.field4558 = new short[var4];
            this.field4551 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field4551[var5] = (short) arg0.method1853(arg1 + 167);
                this.field4558[var5] = (short) arg0.method1853(95);
            }
            return;
        } else if (arg2 == 41) {
            int var6 = arg0.method1861((byte) -72);
            this.field4563 = new short[var6];
            this.field4562 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field4562[var7] = (short) arg0.method1853(arg1 - 66);
                this.field4563[var7] = (short) arg0.method1853(arg1 - 28);
            }
            return;
        } else if (arg2 >= 60 && arg2 < 70) {
            this.field4557[arg2 - 60] = arg0.method1853(103);
            return;
        }
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(Lap;I)V")
    public final void method2130(class289 arg0, int arg1) {
        if (arg1 != 9231) {
            this.field4563 = null;
        }
        while (true) {
            int var3 = arg0.method1861((byte) -72);
            if (var3 == 0) {
                field4547++;
                return;
            }
            this.method2129(arg0, (byte) -50, var3);
        }
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(I[Lbi;I)V")
    public static final void method2131(int arg0, class139[] arg1, int arg2) {
        for (int var3 = 0; var3 < arg1.length; var3++) {
            class139 var4 = arg1[var3];
            if (var4 != null) {
                if (var4.field2023 == 0) {
                    if (var4.field2045 != null) {
                        method2131(arg0, var4.field2045, -26);
                    }
                    class64 var5 = (class64) class204.field2865.method614(-80, (long) var4.field1968);
                    if (var5 != null) {
                        class385.method2389(arg0, -22715, var5.field976);
                    }
                }
                if (arg0 == 0 && var4.field2085 != null) {
                    class361 var6 = new class361();
                    var6.field4903 = var4;
                    var6.field4905 = var4.field2085;
                    class18.method267(var6);
                }
                if (arg0 == 1 && var4.field2032 != null) {
                    if (var4.field2094 >= 0) {
                        class139 var7 = class10.method57(65535, var4.field1968);
                        if (var7 == null || var7.field2045 == null || var4.field2094 >= var7.field2045.length || var7.field2045[var4.field2094] != var4) {
                            continue;
                        }
                    }
                    class361 var8 = new class361();
                    var8.field4905 = var4.field2032;
                    var8.field4903 = var4;
                    class18.method267(var8);
                }
            }
        }
        if (arg2 != -26) {
            field4552 = 87;
        }
        field4553++;
    }

    @OriginalMember(owner = "client!ol", name = "c", descriptor = "(B)V")
    public static void method2132(byte arg0) {
        int var1 = 90 / ((arg0 - 54) / 59);
        field4556 = null;
    }
}
