import java.awt.Component;
import java.awt.FontMetrics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ri")
public class class114 extends class16 {

    @OriginalMember(owner = "client!ri", name = "C", descriptor = "I")
    private int field2003 = -32768;

    @OriginalMember(owner = "client!ri", name = "B", descriptor = "[[S")
    public static short[][] field2002 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };

    @OriginalMember(owner = "client!ri", name = "w", descriptor = "Z")
    public static boolean field1997 = false;

    @OriginalMember(owner = "client!ri", name = "D", descriptor = "[I")
    public static int[] field2004 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @OriginalMember(owner = "client!ri", name = "r", descriptor = "I")
    public static int field1992 = 0;

    @OriginalMember(owner = "client!ri", name = "H", descriptor = "Lij;")
    public static class50 field2008 = class78.method578(125, "Versteckt");

    @OriginalMember(owner = "client!ri", name = "u", descriptor = "B")
    public static byte field1995;

    @OriginalMember(owner = "client!ri", name = "s", descriptor = "I")
    public int field1993;

    @OriginalMember(owner = "client!ri", name = "t", descriptor = "I")
    public static int field1994;

    @OriginalMember(owner = "client!ri", name = "y", descriptor = "I")
    public static int field1999;

    @OriginalMember(owner = "client!ri", name = "z", descriptor = "I")
    public static int field2000;

    @OriginalMember(owner = "client!ri", name = "A", descriptor = "I")
    public static int field2001;

    @OriginalMember(owner = "client!ri", name = "E", descriptor = "I")
    public static int field2005;

    @OriginalMember(owner = "client!ri", name = "F", descriptor = "I")
    public static int field2006;

    @OriginalMember(owner = "client!ri", name = "G", descriptor = "I")
    public static int field2007;

    @OriginalMember(owner = "client!ri", name = "I", descriptor = "I")
    public int field2009;

    @OriginalMember(owner = "client!ri", name = "x", descriptor = "Ljava/awt/FontMetrics;")
    public static FontMetrics field1998;

    @OriginalMember(owner = "client!ri", name = "v", descriptor = "[I")
    public static int[] field1996;

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(IJ)V")
    public static final void method821(int arg0, long arg1) {
        field2000++;
        if (arg1 == 0L || arg0 != 6554) {
            return;
        }
        for (int var3 = 0; var3 < class73.field1379; var3++) {
            if (class227.field3823[var3] == arg1) {
                class73.field1379--;
                for (int var4 = var3; var4 < class73.field1379; var4++) {
                    class227.field3823[var4] = class227.field3823[var4 + 1];
                    class20.field426[var4] = class20.field426[var4 + 1];
                }
                class68.field1285++;
                class184.field3023 = class217.field3649;
                class190.field3141.method1598((byte) -87, 242);
                class190.field3141.method1464(arg1, 867341416);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ri", name = "c", descriptor = "(I)V")
    public static void method822(int arg0) {
        field2002 = null;
        field1998 = null;
        if (arg0 == 24790) {
            field2008 = null;
            field2004 = null;
            field1996 = null;
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(ZZ)V")
    public static final void method823(boolean arg0, boolean arg1) {
        if (class239.field4067.field3990 >> 7 == class259.field4512 && class239.field4067.field4027 >> 7 == class102.field1872) {
            class259.field4512 = 0;
        }
        field2005++;
        int var2 = class78.field1450;
        if (arg1) {
            var2 = 1;
        }
        if (!arg0) {
            return;
        }
        for (int var3 = 0; var3 < var2; var3++) {
            long var4;
            class187 var6;
            if (arg1) {
                var4 = 8791798054912L;
                var6 = class239.field4067;
            } else {
                var4 = (long) class60.field1116[var3] << 32;
                var6 = class71.field1370[class60.field1116[var3]];
            }
            if (var6 != null && var6.method428((byte) 20)) {
                var6.field3081 = false;
                if ((class44.field808 && class78.field1450 > 200 || class78.field1450 > 50) && !arg1 && var6.field3996 == var6.field3965) {
                    var6.field3081 = true;
                }
                int var7 = var6.field3990 >> 7;
                int var8 = var6.field4027 >> 7;
                if (var7 >= 0 && var7 < 104 && var8 >= 0 && var8 < 104) {
                    if (var6.field3067 == null || class244.field4245 < var6.field3098 || class244.field4245 >= var6.field3061) {
                        if ((var6.field3990 & 0x7F) == 64 && (var6.field4027 & 0x7F) == 64) {
                            if (class144.field2504[var7][var8] == class6.field79) {
                                continue;
                            }
                            class144.field2504[var7][var8] = class6.field79;
                        }
                        var6.field4018 = class187.method1260((byte) 55, var6.field3990, var6.field4027, class201.field3312);
                        class61.method470(class201.field3312, var6.field3990, var6.field4027, var6.field4018, 60, var6, var6.field3993, var4, var6.field4028);
                    } else {
                        var6.field3081 = false;
                        var6.field4018 = class187.method1260((byte) 35, var6.field3990, var6.field4027, class201.field3312);
                        class204.method1380(class201.field3312, var6.field3990, var6.field4027, var6.field4018, var6, var6.field3993, var4, var6.field3099, var6.field3072, var6.field3068, var6.field3066);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(IIIIIIIIJ)V")
    public final void method129(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        field1999++;
        class98 var11 = class15.method111(this.field1993, false).method1614(0, (byte) 80, this.field2009, (class186) null);
        if (var11 != null) {
            var11.method129(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
            this.field2003 = var11.method126();
        }
    }

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "(IIIII)V")
    public static final void method824(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class190.field3141.field3581 = 0;
        field2001++;
        class190.field3141.method1471(171, (byte) 24);
        class190.field3141.method1471(arg1, (byte) 24);
        class190.field3141.method1471(arg0, (byte) 24);
        class190.field3141.method1494(arg3, (byte) -114);
        class190.field3141.method1494(arg2, (byte) -13);
        class233.field3915 = -3;
        class224.field3765 = 0;
        if (arg4 != -25652) {
            field1995 = -94;
        }
        class167.field2834 = 1;
        class162.field2769 = 0;
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(ZLjava/awt/Component;)V")
    public static final void method825(boolean arg0, Component arg1) {
        field2007++;
        arg1.removeKeyListener(class89.field1696);
        arg1.removeFocusListener(class89.field1696);
        class61.field1125 = -1;
        if (arg0) {
            field1995 = -12;
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "()I")
    public final int method126() {
        field1994++;
        return this.field2003;
    }
}
