import java.awt.Font;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public class class40 {

    @OriginalMember(owner = "client!ra", name = "m", descriptor = "Lik;")
    private class115 field660 = new class115();

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "Lub;")
    public static class227 field648 = class257.method1749(":tradereq:", 17263);

    @OriginalMember(owner = "client!ra", name = "g", descriptor = "[[[B")
    public static byte[][][] field654 = new byte[4][104][104];

    @OriginalMember(owner = "client!ra", name = "l", descriptor = "[I")
    public static int[] field659 = new int[4096];

    @OriginalMember(owner = "client!ra", name = "p", descriptor = "I")
    public static int field663 = 0;

    @OriginalMember(owner = "client!ra", name = "o", descriptor = "Lub;")
    private static class227 field662 = class257.method1749("Use", 17263);

    @OriginalMember(owner = "client!ra", name = "d", descriptor = "Lub;")
    public static class227 field651 = field662;

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "I")
    public static int field649;

    @OriginalMember(owner = "client!ra", name = "e", descriptor = "I")
    public static int field652;

    @OriginalMember(owner = "client!ra", name = "f", descriptor = "I")
    public static int field653;

    @OriginalMember(owner = "client!ra", name = "h", descriptor = "I")
    public static int field655;

    @OriginalMember(owner = "client!ra", name = "i", descriptor = "I")
    public static int field656;

    @OriginalMember(owner = "client!ra", name = "j", descriptor = "I")
    public static int field657;

    @OriginalMember(owner = "client!ra", name = "k", descriptor = "I")
    public static int field658;

    @OriginalMember(owner = "client!ra", name = "n", descriptor = "I")
    public static int field661;

    @OriginalMember(owner = "client!ra", name = "q", descriptor = "I")
    public static int field664;

    @OriginalMember(owner = "client!ra", name = "r", descriptor = "I")
    public static int field665;

    @OriginalMember(owner = "client!ra", name = "u", descriptor = "I")
    public static int field668;

    @OriginalMember(owner = "client!ra", name = "v", descriptor = "I")
    public static int field669;

    @OriginalMember(owner = "client!ra", name = "w", descriptor = "I")
    public static int field670;

    @OriginalMember(owner = "client!ra", name = "t", descriptor = "Lik;")
    private class115 field667;

    @OriginalMember(owner = "client!ra", name = "s", descriptor = "Ljava/awt/Font;")
    public static Font field666;

    @OriginalMember(owner = "client!ra", name = "c", descriptor = "[I")
    public static int[] field650;

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(I)Lik;")
    public final class115 method209(int arg0) {
        field670++;
        if (arg0 != 16711680) {
            method213(18, 96, 107, 98, -55, -125);
        }
        class115 var2 = this.field660.field2111;
        if (this.field660 == var2) {
            this.field667 = null;
            return null;
        } else {
            this.field667 = var2.field2111;
            return var2;
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(Z)V")
    public static void method210(boolean arg0) {
        if (!arg0) {
            field662 = null;
        }
        field659 = null;
        field662 = null;
        field654 = null;
        field648 = null;
        field650 = null;
        field666 = null;
        field651 = null;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(IBI)V")
    public static final void method211(int arg0, byte arg1, int arg2) {
        if (arg1 >= -18) {
            field655 = -61;
        }
        field661++;
        if (class94.field1631 < 2 && class122.field2199 == 0 && !class57.field1050) {
            return;
        }
        class227 var3;
        if (class122.field2199 == 1 && class94.field1631 < 2) {
            var3 = class76.method445((byte) 54, new class227[] { field651, class147.field2549, class184.field3130, class249.field4325 });
        } else if (class57.field1050 && class94.field1631 < 2) {
            var3 = class76.method445((byte) 79, new class227[] { class88.field1528, class147.field2549, class149.field2608, class249.field4325 });
        } else {
            var3 = class125.method770(class94.field1631 - 1, (byte) 101);
        }
        if (class94.field1631 > 2) {
            var3 = class76.method445((byte) 41, new class227[] { var3, class80.field1395, class204.method1303(class94.field1631 - 2, 1), class27.field445 });
        }
        int var4 = class260.field4532.method1259(var3, arg0 + 4, arg2 - -15, 16777215, 0, class253.field4376, class92.field1572);
        class103.method630((byte) 120, arg2, 15, var4 + class260.field4532.method1246(var3), arg0 + 4);
    }

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "(I)Z")
    public static final boolean method212(int arg0) {
        field668++;
        int var1 = -86 / ((-arg0 - 83) / 37);
        return class140.field2419 == 0 ? class235.field4078.method1699(false) : true;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(IIIIII)V")
    public static final void method213(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class69.field1224[arg0].method258(arg1, arg4);
        int var6 = (arg2 - 32) * arg2 / arg3;
        class69.field1224[1].method258(arg1, arg2 + arg4 - 16);
        if (var6 < 8) {
            var6 = 8;
        }
        int var7 = (arg2 - var6 - 32) * arg5 / (arg3 - arg2);
        class111.method694(arg1, arg4 + 16, 16, arg2 - 32, class106.field1997);
        class111.method694(arg1, arg4 - (-var7 - 16), 16, var6, class248.field4310);
        class111.method701(arg1, arg4 + var7 + 16, var6, class86.field1498);
        class111.method701(arg1 + 1, arg4 - (-var7 + -16), var6, class86.field1498);
        class111.method696(arg1, arg4 + var7 + 16, 16, class86.field1498);
        class111.method696(arg1, var7 + arg4 + 17, 16, class86.field1498);
        class111.method701(arg1 + 15, arg4 + 16 + var7, var6, class18.field318);
        class111.method701(arg1 + 14, arg4 + 17 + var7, var6 - 1, class18.field318);
        class111.method696(arg1, arg4 + var7 + var6 + 15, 16, class18.field318);
        class111.method696(arg1 + 1, arg4 + var7 + var6 + 14, 15, class18.field318);
        field652++;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(III)J")
    public static final long method214(int arg0, int arg1, int arg2) {
        class108 var3 = class261.field4539[arg0][arg1][arg2];
        if (var3 == null) {
            return 0L;
        }
        for (int var4 = 0; var4 < var3.field2012; var4++) {
            class230 var5 = var3.field2021[var4];
            if ((var5.field4029 >> 29 & 0x3L) == 2L && var5.field4032 == arg1 && var5.field4025 == arg2) {
                return var5.field4029;
            }
        }
        return 0L;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(IIIII)V")
    public static final void method215(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class111.method704(arg3, arg4, arg1 + arg3, arg4 - -arg0);
        class111.method694(arg3, arg4, arg1, arg0, 0);
        if (arg2 != 11503) {
            method215(-84, 76, 7, 86, 84);
        }
        field649++;
        if (class5.field120 < 100) {
            return;
        }
        if (class210.field3560 == null || class210.field3560.field3590 != arg1 || class210.field3560.field3604 != arg0) {
            class163 var5 = new class163(arg1, arg0);
            class111.method699(var5.field2756, arg1, arg0);
            class188.method1200(0, (byte) -125, 0, class45.field753, 0, arg0, arg1, class249.field4322, 0);
            class210.field3560 = var5;
            class14.field263.method1203(-1);
        }
        class210.field3560.method784(arg3, arg4);
        int var6 = class173.field2895 * arg1 / class249.field4322 + arg3;
        int var7 = class178.field3000 * arg1 / class249.field4322;
        int var8 = class182.field3105 * arg0 / class45.field753 + arg4;
        int var9 = class197.field3381 * arg0 / class45.field753;
        class111.method692(var6, var8, var7, var9, 16711680, 128);
        class111.method705(var6, var8, var7, var9, 16711680);
        if (class182.field3107 <= 0 || (class182.field3107 % 10) >= 5) {
            return;
        }
        for (class210 var10 = (class210) class36.field593.method1277(96); var10 != null; var10 = (class210) class36.field593.method1271(arg2 - 11253)) {
            if (class218.field3651 == var10.field3558) {
                int var11 = arg3 + (var10.field3563 * arg1 / class249.field4322);
                int var12 = arg4 + (var10.field3565 * arg0 / class45.field753);
                class111.method694(var11 - 2, var12 + -2, 4, 4, 16776960);
            }
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(B)V")
    public final void method216(byte arg0) {
        field658++;
        while (true) {
            class115 var2 = this.field660.field2111;
            if (this.field660 == var2) {
                if (arg0 != -28) {
                    field655 = 24;
                }
                this.field667 = null;
                return;
            }
            var2.method727((byte) 2);
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(ILik;)V")
    public final void method217(int arg0, class115 arg1) {
        if (arg1.field2105 != null) {
            arg1.method727((byte) 2);
        }
        arg1.field2105 = this.field660.field2105;
        field656++;
        arg1.field2111 = this.field660;
        if (arg0 == 29) {
            arg1.field2105.field2111 = arg1;
            arg1.field2111.field2105 = arg1;
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(Lik;B)V")
    public final void method218(class115 arg0, byte arg1) {
        if (arg1 <= 61) {
            return;
        }
        if (arg0.field2105 != null) {
            arg0.method727((byte) 2);
        }
        arg0.field2111 = this.field660.field2111;
        arg0.field2105 = this.field660;
        arg0.field2105.field2111 = arg0;
        field669++;
        arg0.field2111.field2105 = arg0;
    }

    @OriginalMember(owner = "client!ra", name = "c", descriptor = "(I)Lik;")
    public final class115 method219(int arg0) {
        field653++;
        class115 var2 = this.field660.field2111;
        if (this.field660 == var2) {
            return null;
        } else {
            var2.method727((byte) 2);
            return arg0 == 21786 ? var2 : null;
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(ILik;Lik;)V")
    public final void method220(int arg0, class115 arg1, class115 arg2) {
        field657++;
        if (arg1.field2105 != null) {
            arg1.method727((byte) 2);
        }
        arg1.field2111 = arg2.field2111;
        arg1.field2105 = arg2;
        arg1.field2105.field2111 = arg1;
        if (arg0 != 18601) {
            this.method219(87);
        }
        arg1.field2111.field2105 = arg1;
    }

    @OriginalMember(owner = "client!ra", name = "<init>", descriptor = "()V")
    public class40() {
        this.field660.field2111 = this.field660;
        this.field660.field2105 = this.field660;
    }

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "(B)Lik;")
    public final class115 method221(byte arg0) {
        field665++;
        int var2 = 96 / ((arg0 + 47) / 62);
        class115 var3 = this.field667;
        if (this.field660 == var3) {
            this.field667 = null;
            return null;
        } else {
            this.field667 = var3.field2111;
            return var3;
        }
    }
}
