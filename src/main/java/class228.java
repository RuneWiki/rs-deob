import java.awt.Rectangle;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fh")
public class class228 extends class418 {

    @OriginalMember(owner = "client!fh", name = "p", descriptor = "I")
    public int field3136;

    @OriginalMember(owner = "client!fh", name = "u", descriptor = "I")
    public int field3141;

    @OriginalMember(owner = "client!fh", name = "v", descriptor = "I")
    public int field3142;

    @OriginalMember(owner = "client!fh", name = "s", descriptor = "Z")
    public boolean field3139;

    @OriginalMember(owner = "client!fh", name = "o", descriptor = "I")
    public int field3135;

    @OriginalMember(owner = "client!fh", name = "r", descriptor = "I")
    public int field3138;

    @OriginalMember(owner = "client!fh", name = "z", descriptor = "[I")
    public static int[] field3146 = new int[99];

    @OriginalMember(owner = "client!fh", name = "k", descriptor = "[Ljava/awt/Rectangle;")
    public static Rectangle[] field3131 = new Rectangle[100];

    @OriginalMember(owner = "client!fh", name = "t", descriptor = "Lsj;")
    public static class248 field3140 = null;

    @OriginalMember(owner = "client!fh", name = "C", descriptor = "Loh;")
    public static class217 field3149;

    @OriginalMember(owner = "client!fh", name = "l", descriptor = "I")
    public static int field3132;

    @OriginalMember(owner = "client!fh", name = "m", descriptor = "I")
    public static int field3133;

    @OriginalMember(owner = "client!fh", name = "n", descriptor = "I")
    public static int field3134;

    @OriginalMember(owner = "client!fh", name = "q", descriptor = "I")
    public static int field3137;

    @OriginalMember(owner = "client!fh", name = "w", descriptor = "I")
    public static int field3143;

    @OriginalMember(owner = "client!fh", name = "x", descriptor = "I")
    public static int field3144;

    @OriginalMember(owner = "client!fh", name = "y", descriptor = "I")
    public static int field3145;

    @OriginalMember(owner = "client!fh", name = "A", descriptor = "I")
    public static int field3147;

    @OriginalMember(owner = "client!fh", name = "B", descriptor = "I")
    public static int field3148;

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(Lde;I)V")
    public static final void method1481(class364 arg0, int arg1) {
        class378.field5531 = 3;
        field3137++;
        class7.method40(true, -29254);
        class227.field3128 = 127;
        class232.field3223 = true;
        class273.field4015 = true;
        class289.field4338 = 0;
        class24.field434 = true;
        class423.field6169 = true;
        class1.field10 = true;
        class104.field1359 = 0;
        class355.field5263 = 0;
        class197.field2724 = 0;
        class154.field1961 = 255;
        class389.field5692 = 127;
        class397.field5799 = true;
        class407.field5937 = true;
        class330.field4863 = 2;
        class116.field1508 = 1;
        class338.field4993 = true;
        class452.field6560 = true;
        class354.field5256 = true;
        if (class393.field5727 < 96) {
            class199.method1313(86, 0);
        } else {
            class199.method1313(99, 2);
        }
        class389.field5689 = true;
        if (arg1 >= -26) {
            return;
        }
        class249.field3681 = 0;
        class325.field4817 = 2;
        class331.field4880 = false;
        class257.field3775 = true;
        class241.field3377 = 0;
        class195.field2700 = 2;
        class257.field3777 = false;
        class256.field3747 = false;
        class408 var2 = null;
        try {
            class225 var3 = arg0.method2389(0);
            while (var3.field3104 == 0) {
                class31.method245(1L, -108);
            }
            if (var3.field3104 == 1) {
                var2 = (class408) var3.field3105;
                byte[] var4 = new byte[(int) var2.method2580(0)];
                int var6;
                for (int var5 = 0; var5 < var4.length; var5 += var6) {
                    var6 = var2.method2582(var5, var4.length - var5, (byte) -118, var4);
                    if (var6 == -1) {
                        throw new IOException("EOF");
                    }
                }
                class383.method2488(new class341(var4), -57);
            }
        } catch (Exception var8) {
        }
        try {
            if (var2 != null) {
                var2.method2584((byte) -66);
            }
        } catch (Exception var7) {
        }
    }

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "(II)V")
    public static final void method1482(int arg0, int arg1) {
        field3148++;
        class51 var2 = class318.field4678;
        synchronized (class318.field4678) {
            class318.field4678.method379(arg0, false);
        }
        class51 var3 = class295.field4442;
        synchronized (class295.field4442) {
            if (arg1 == 0) {
                class295.field4442.method379(arg0, false);
            }
        }
    }

    @OriginalMember(owner = "client!fh", name = "c", descriptor = "(Z)V")
    public static final void method1483(boolean arg0) {
        class114.field1475++;
        field3132++;
        class140.field1797.method1833(-20379, 134);
        if (!arg0) {
            method1482(15, 126);
        }
        class140.field1797.method2250(false, class416.field6024);
    }

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "(I)V")
    public static final void method1484(int arg0) {
        if (arg0 != 127) {
            method1487(64);
        }
        field3133++;
        if (class33.field526.length() != 0) {
            class17.method129("--> " + class33.field526, (byte) -5);
            class185.method1237(class33.field526, false, arg0 - 250);
            class14.field226 = 0;
            class33.field526 = "";
        }
    }

    @OriginalMember(owner = "client!fh", name = "c", descriptor = "(I)V")
    public static final void method1485(int arg0) {
        if (arg0 != 0) {
            method1484(-122);
        }
        class238.field3346.method372(arg0 ^ 0x7D);
        field3145++;
    }

    @OriginalMember(owner = "client!fh", name = "d", descriptor = "(I)V")
    public static final void method1486(int arg0) {
        class123.field1589.method372(arg0 + 19131);
        if (arg0 == -19017) {
            field3147++;
        }
    }

    @OriginalMember(owner = "client!fh", name = "e", descriptor = "(I)V")
    public static final void method1487(int arg0) {
        if (arg0 != 2) {
            method1483(false);
        }
        class51 var1 = class163.field2221;
        synchronized (class163.field2221) {
            class163.field2221.method366(arg0 - 61);
        }
        field3144++;
        class51 var2 = class142.field1807;
        synchronized (class142.field1807) {
            class142.field1807.method366(arg0 ^ 0x6E);
        }
    }

    @OriginalMember(owner = "client!fh", name = "c", descriptor = "(II)V")
    public static final void method1488(int arg0, int arg1) {
        field3143++;
        class440 var2 = class186.method1241(arg1, 12, (byte) 56);
        var2.method2749(13828096);
        if (arg0 >= -20) {
            field3140 = null;
        }
    }

    @OriginalMember(owner = "client!fh", name = "d", descriptor = "(Z)V")
    public static void method1489(boolean arg0) {
        if (!arg0) {
            field3146 = null;
            field3140 = null;
            field3149 = null;
            field3131 = null;
        }
    }

    @OriginalMember(owner = "client!fh", name = "<init>", descriptor = "(IIIIIZ)V")
    public class228(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        this.field3136 = arg1;
        this.field3141 = arg0;
        this.field3142 = arg4;
        this.field3139 = arg5;
        this.field3135 = arg3;
        this.field3138 = arg2;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(ZI)V")
    public static final void method1490(boolean arg0, int arg1) {
        class51 var2 = class163.field2221;
        synchronized (class163.field2221) {
            class163.field2221.method379(arg1, false);
        }
        field3134++;
        class51 var3 = class142.field1807;
        synchronized (class142.field1807) {
            if (arg0) {
                class142.field1807.method379(arg1, false);
            }
        }
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 99; var1++) {
            int var2 = var1 + 1;
            int var3 = (int) (Math.pow(2.0D, (double) var2 / 7.0D) * 300.0D + (double) var2);
            var0 += var3;
            field3146[var1] = var0 / 4;
        }
        field3149 = null;
    }
}
