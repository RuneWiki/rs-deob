import java.awt.Container;
import java.awt.Insets;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qc")
public class class442 {

    @OriginalMember(owner = "client!qc", name = "c", descriptor = "Lgq;")
    public class299 field6401 = new class299();

    @OriginalMember(owner = "client!qc", name = "k", descriptor = "I")
    public static int field6409 = -1;

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "Lbh;")
    public static class24 field6400 = new class24(5000);

    @OriginalMember(owner = "client!qc", name = "n", descriptor = "Ljava/util/Random;")
    public static Random field6412 = new Random();

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "I")
    public static int field6399;

    @OriginalMember(owner = "client!qc", name = "d", descriptor = "I")
    public static int field6402;

    @OriginalMember(owner = "client!qc", name = "e", descriptor = "I")
    public static int field6403;

    @OriginalMember(owner = "client!qc", name = "f", descriptor = "I")
    public static int field6404;

    @OriginalMember(owner = "client!qc", name = "g", descriptor = "I")
    public static int field6405;

    @OriginalMember(owner = "client!qc", name = "h", descriptor = "I")
    public static int field6406;

    @OriginalMember(owner = "client!qc", name = "i", descriptor = "I")
    public static int field6407;

    @OriginalMember(owner = "client!qc", name = "j", descriptor = "I")
    public static int field6408;

    @OriginalMember(owner = "client!qc", name = "l", descriptor = "I")
    public static int field6410;

    @OriginalMember(owner = "client!qc", name = "m", descriptor = "Lgq;")
    private class299 field6411;

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(B)V", line = 6)
    public static void method2764(byte arg0) {
        field6412 = null;
        field6400 = null;
        if (arg0 >= -72) {
            method2765((class430) null);
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(Lcp;)V", line = 19)
    public static final void method2765(class430 arg0) {
        for (int var1 = arg0.field6182; var1 <= arg0.field6195; var1++) {
            for (int var2 = arg0.field6186; var2 <= arg0.field6185; var2++) {
                class142 var3 = class5.field79[arg0.field6198][var1][var2];
                if (var3 != null) {
                    class218 var4 = var3.field2043;
                    class218 var5 = null;
                    while (var4 != null) {
                        if (var4.field2882 == arg0) {
                            if (var5 == null) {
                                var3.field2043 = var4.field2884;
                            } else {
                                var5.field2884 = var4.field2884;
                            }
                            var4.method1388(0);
                            break;
                        }
                        var5 = var4;
                        var4 = var4.field2884;
                    }
                    var3.field2036 = 0;
                    for (class218 var6 = var3.field2043; var6 != null; var6 = var6.field2884) {
                        var3.field2036 = (byte) (var3.field2036 | var6.field2881);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(ZZ)V", line = 70)
    public static final void method2766(boolean arg0, boolean arg1) {
        field6405++;
        byte[][] var2;
        byte var3;
        if (arg0) {
            var2 = class322.field4418;
            var3 = 1;
        } else {
            var3 = 4;
            var2 = class237.field3223;
        }
        if (!arg1) {
            field6409 = -24;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            class154.method1038(0);
            for (int var5 = 0; var5 < class432.field6220 >> 3; var5++) {
                for (int var6 = 0; var6 < class267.field3646 >> 3; var6++) {
                    int var7 = class25.field403[var4][var5][var6];
                    if (var7 != -1) {
                        int var8 = (var7 & 0x30F23EE) >> 24;
                        if (!arg0 || var8 == 0) {
                            int var9 = var7 >> 1 & 0x3;
                            int var10 = (var7 & 0xFFCB99) >> 14;
                            int var11 = (var7 & 0x3FFA) >> 3;
                            int var12 = (var10 / 8 << 8) + var11 / 8;
                            for (int var13 = 0; var13 < class324.field4432.length; var13++) {
                                if (class324.field4432[var13] == var12 && var2[var13] != null) {
                                    class207.method1351(class24.field326, var9, var2[var13], arg0, class408.field5920, var4, (var10 & 0x7) * 8, (var11 & 0x7) * 8, var8, var5 * 8, 1, var6 * 8);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(Ljava/lang/String;II)V", line = 161)
    public static final void method2767(String arg0, int arg1, int arg2) {
        field6402++;
        class399 var3 = class269.method1655(arg1, arg2, arg1 ^ 0xFFFFFFF0);
        var3.method2583((byte) 71);
        var3.field5834 = arg0;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(Lgq;B)V", line = 177)
    public final void method2768(class299 arg0, byte arg1) {
        if (arg1 != 123) {
            this.method2770((byte) 10);
        }
        if (arg0.field4139 != null) {
            arg0.method1928(90);
        }
        field6407++;
        arg0.field4138 = this.field6401;
        arg0.field4139 = this.field6401.field4139;
        arg0.field4139.field4138 = arg0;
        arg0.field4138.field4139 = arg0;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(I)Lgq;", line = 197)
    public final class299 method2769(int arg0) {
        field6403++;
        class299 var2 = this.field6411;
        if (arg0 != -1) {
            method2772(-1, -123, (String) null);
        }
        if (this.field6401 == var2) {
            this.field6411 = null;
            return null;
        } else {
            this.field6411 = var2.field4138;
            return var2;
        }
    }

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "(B)Lgq;", line = 221)
    public final class299 method2770(byte arg0) {
        if (arg0 != 30) {
            return null;
        }
        field6399++;
        class299 var2 = this.field6401.field4138;
        if (this.field6401 == var2) {
            this.field6411 = null;
            return null;
        } else {
            this.field6411 = var2.field4138;
            return var2;
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(Z)V", line = 242)
    public final void method2771(boolean arg0) {
        while (true) {
            class299 var2 = this.field6401.field4138;
            if (this.field6401 == var2) {
                if (arg0) {
                    field6412 = null;
                }
                field6410++;
                this.field6411 = null;
                return;
            }
            var2.method1928(50);
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(IILjava/lang/String;)V", line = 265)
    public static final void method2772(int arg0, int arg1, String arg2) {
        field6408++;
        class399 var3 = class269.method1655(2, arg0, -63);
        if (arg1 >= -59) {
            method2772(49, -33, (String) null);
        }
        var3.method2583((byte) 71);
        var3.field5834 = arg2;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(ZIIIII)V", line = 287)
    public static final void method2773(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0) {
            class259.method1599(false);
        }
        field6404++;
        if (class227.field3044 != null && (arg3 != 3 || class308.field4227 != arg4 || class29.field457 != arg5)) {
            class305.method1949(class204.field2772, class227.field3044, -1);
            class227.field3044 = null;
        }
        if (arg3 == 3 && class227.field3044 == null) {
            class227.field3044 = class89.method609(class204.field2772, arg5, 0, arg4, 0, (byte) -109);
            if (class227.field3044 != null) {
                class308.field4227 = arg4;
                class29.field457 = arg5;
                class29.method228(-55, class204.field2772);
            }
        }
        if (arg3 == 3 && class227.field3044 == null) {
            method2773(true, arg1, 9148, class152.field2153, -1, -1);
            return;
        }
        Container var6;
        if (class227.field3044 != null) {
            class358.field5043 = arg5;
            class33.field502 = arg4;
            var6 = class227.field3044;
        } else if (class393.field5746 == null) {
            var6 = class204.field2772.field4888;
            class33.field502 = var6.getSize().width;
            class358.field5043 = var6.getSize().height;
        } else {
            Insets var7 = class393.field5746.getInsets();
            class33.field502 = class393.field5746.getSize().width - var7.left - var7.right;
            class358.field5043 = class393.field5746.getSize().height - var7.top - var7.bottom;
            var6 = class393.field5746;
        }
        if (arg3 == 1) {
            class194.field2696 = 765;
            class243.field3359 = 503;
            class63.field985 = 0;
            class364.field5104 = (class33.field502 - 765) / 2;
        } else if (class275.field3730 < 96 && class16.field205 == 0) {
            int var8 = class33.field502 > 1024 ? 1024 : class33.field502;
            class194.field2696 = var8;
            class364.field5104 = (class33.field502 - var8) / 2;
            int var9 = class358.field5043 > 768 ? 768 : class358.field5043;
            class243.field3359 = var9;
            class63.field985 = 0;
        } else {
            class364.field5104 = 0;
            class243.field3359 = class358.field5043;
            class63.field985 = 0;
            class194.field2696 = class33.field502;
        }
        if (class67.field1043 != 0) {
            boolean var10000;
            if (class194.field2696 < 1024 && class243.field3359 < 768) {
                var10000 = true;
            } else {
                var10000 = false;
            }
        }
        if (arg0) {
            class99.method702(-17666, class16.field205);
        } else {
            class41.field617.setSize(class194.field2696, class243.field3359);
            if (class408.field5920 != null) {
                class408.field5920.method1761();
            }
            if (class393.field5746 == var6) {
                Insets var10 = class393.field5746.getInsets();
                class41.field617.setLocation(class364.field5104 + var10.left, class63.field985 + var10.top);
            } else {
                class41.field617.setLocation(class364.field5104, class63.field985);
            }
        }
        if (arg3 >= 2) {
            class113.field1654 = true;
        } else {
            class113.field1654 = false;
        }
        if (class230.field3089 != -1) {
            class279.method1706(0, true);
        }
        if (class199.field2749 != null && (class79.field1220 == 30 || class79.field1220 == 25)) {
            class298.method1924(11296);
        }
        if (arg2 != 9148) {
            field6409 = 10;
        }
        for (int var11 = 0; var11 < 100; var11++) {
            class259.field3553[var11] = true;
        }
        class289.field3995 = true;
    }

    @OriginalMember(owner = "client!qc", name = "<init>", descriptor = "()V", line = 449)
    public class442() {
        this.field6401.field4138 = this.field6401;
        this.field6401.field4139 = this.field6401;
    }
}
