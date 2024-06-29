import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public class class164 {

    @OriginalMember(owner = "client!sb", name = "f", descriptor = "Lsg;")
    public static class169 field3147 = class165.method1060("<col=ffffff>", 1536);

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "Lsg;")
    public static class169 field3142 = class165.method1060(":trade:", 1536);

    @OriginalMember(owner = "client!sb", name = "d", descriptor = "Lsg;")
    public static class169 field3145 = class165.method1060(" weitere Optionen", 1536);

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "I")
    public static int field3143 = 0;

    @OriginalMember(owner = "client!sb", name = "l", descriptor = "Lsg;")
    public static class169 field3153 = class165.method1060("Sie haben gerade eine andere Welt verlassen)3", 1536);

    @OriginalMember(owner = "client!sb", name = "h", descriptor = "I")
    public static int field3149 = 0;

    @OriginalMember(owner = "client!sb", name = "c", descriptor = "Lsg;")
    public static class169 field3144 = class165.method1060("blinken2:", 1536);

    @OriginalMember(owner = "client!sb", name = "e", descriptor = "I")
    public static int field3146;

    @OriginalMember(owner = "client!sb", name = "i", descriptor = "I")
    public static int field3150;

    @OriginalMember(owner = "client!sb", name = "j", descriptor = "I")
    public static int field3151;

    @OriginalMember(owner = "client!sb", name = "k", descriptor = "I")
    public static int field3152;

    @OriginalMember(owner = "client!sb", name = "m", descriptor = "I")
    public static int field3154;

    @OriginalMember(owner = "client!sb", name = "g", descriptor = "Ljava/awt/Frame;")
    public static Frame field3148;

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(I)V")
    public static final void method1053(int arg0) {
        if (arg0 >= -5) {
            field3150 = 117;
        }
        field3152++;
        class21 var1 = class142.field2654;
        synchronized (class142.field2654) {
            class107.field1950 = class182.field3555;
            if (class69.field1294 >= 0) {
                while (class69.field1294 != class31.field661) {
                    int var2 = class54.field997[class31.field661];
                    class31.field661 = class31.field661 + 1 & 0x7F;
                    if (var2 >= 0) {
                        class165.field3158[var2] = true;
                    } else {
                        class165.field3158[~var2] = false;
                    }
                }
            } else {
                for (int var3 = 0; var3 < 112; var3++) {
                    class165.field3158[var3] = false;
                }
                class69.field1294 = class31.field661;
            }
            class182.field3555 = class126.field2302;
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(IIII)I")
    public static final int method1054(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg2 & 0x3;
        field3151++;
        if (~var4 == arg3) {
            return arg1;
        } else if (var4 == 1) {
            return arg0;
        } else if (var4 == 2) {
            return 7 - arg1;
        } else {
            return 7 - arg0;
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(ZZZ)I")
    public static final int method1055(boolean arg0, boolean arg1, boolean arg2) {
        if (arg2) {
            return 7;
        }
        field3146++;
        int var3 = 0;
        if (arg0) {
            var3 += class48.field875 + class16.field332;
        }
        if (arg1) {
            var3 += class154.field2974 + class137.field2557;
        }
        return var3;
    }

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "(I)V")
    public static void method1056(int arg0) {
        field3144 = null;
        field3153 = null;
        field3145 = null;
        field3148 = null;
        if (arg0 != 0) {
            method1055(false, true, false);
        }
        field3142 = null;
        field3147 = null;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(B[Lqf;I)V")
    public static final void method1057(byte arg0, class150[] arg1, int arg2) {
        field3154++;
        int var3 = -111 / ((60 - arg0) / 61);
        for (int var4 = 0; var4 < arg1.length; var4++) {
            class150 var5 = arg1[var4];
            if (var5 != null) {
                if (var5.field2882 == 0) {
                    if (var5.field2784 != null) {
                        method1057((byte) 125, var5.field2784, arg2);
                    }
                    class80 var6 = (class80) class202.field3948.method1045((long) var5.field2878, (byte) -77);
                    if (var6 != null) {
                        class200.method1310(var6.field1475, -7102, arg2);
                    }
                }
                if (arg2 == 0 && var5.field2809 != null) {
                    class200 var7 = new class200();
                    var7.field3911 = var5.field2809;
                    var7.field3907 = var5;
                    class172.method1147(-19955, var7);
                }
                if (arg2 == 1 && var5.field2869 != null) {
                    if (var5.field2850 >= 0) {
                        class150 var8 = class62.method385((byte) 41, var5.field2878);
                        if (var8 == null || var8.field2784 == null || var8.field2784.length <= var5.field2850 || var8.field2784[var5.field2850] != var5) {
                            continue;
                        }
                    }
                    class200 var9 = new class200();
                    var9.field3907 = var5;
                    var9.field3911 = var5.field2869;
                    class172.method1147(-19955, var9);
                }
            }
        }
    }
}
