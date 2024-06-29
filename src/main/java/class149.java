import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public abstract class class149 {

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "[I")
    public static int[] field2436 = new int[256];

    @OriginalMember(owner = "client!fc", name = "n", descriptor = "[J")
    public static long[] field2448 = new long[100];

    @OriginalMember(owner = "client!fc", name = "i", descriptor = "Z")
    public static boolean field2443 = false;

    @OriginalMember(owner = "client!fc", name = "d", descriptor = "Lre;")
    public static class266 field2438 = new class266();

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "I")
    public static int field2435;

    @OriginalMember(owner = "client!fc", name = "c", descriptor = "I")
    public static int field2437;

    @OriginalMember(owner = "client!fc", name = "e", descriptor = "I")
    public int field2439;

    @OriginalMember(owner = "client!fc", name = "f", descriptor = "I")
    public int field2440;

    @OriginalMember(owner = "client!fc", name = "g", descriptor = "I")
    public static int field2441;

    @OriginalMember(owner = "client!fc", name = "h", descriptor = "I")
    public int field2442;

    @OriginalMember(owner = "client!fc", name = "j", descriptor = "I")
    public int field2444;

    @OriginalMember(owner = "client!fc", name = "k", descriptor = "I")
    public int field2445;

    @OriginalMember(owner = "client!fc", name = "m", descriptor = "I")
    public int field2447;

    @OriginalMember(owner = "client!fc", name = "o", descriptor = "I")
    public static int field2449;

    @OriginalMember(owner = "client!fc", name = "l", descriptor = "[[[I")
    public static int[][][] field2446;

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(B)V")
    public static final void method1091(byte arg0) {
        field2435++;
        class224.field3564.method1060(31);
        class77.field1277.method58((byte) -115);
        int var1 = 69 / ((arg0 + 55) / 45);
        class239.field3773.method58((byte) -115);
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(II)V")
    public abstract void method588(int arg0, int arg1);

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(III)V")
    public abstract void method589(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(I)V")
    public static final void method1092(int arg0) {
        field2437++;
        int var1 = class287.field4595;
        if (arg0 != 128) {
            method1093((byte) -95);
        }
        int var2 = class22.field339;
        int var3 = class56.field991 - class33.field557 - var2;
        int var4 = class205.field3297 - var1 - class137.field2301;
        if (var1 <= 0 && var4 <= 0 && var2 <= 0 && var3 <= 0) {
            return;
        }
        try {
            Container var5;
            if (class201.field3273 != null) {
                var5 = class201.field3273;
            } else if (class207.field3327 == null) {
                var5 = class205.field3294.field1291;
            } else {
                var5 = class207.field3327;
            }
            int var6 = 0;
            int var7 = 0;
            if (class207.field3327 == var5) {
                Insets var8 = class207.field3327.getInsets();
                var7 = var8.top;
                var6 = var8.left;
            }
            Graphics var9 = var5.getGraphics();
            var9.setColor(Color.black);
            if (var1 > 0) {
                var9.fillRect(var6, var7, var1, class56.field991);
            }
            if (var2 > 0) {
                var9.fillRect(var6, var7, class205.field3297, var2);
            }
            if (var4 > 0) {
                var9.fillRect(class205.field3297 + var6 - var4, var7, var4, class56.field991);
            }
            if (var3 > 0) {
                var9.fillRect(var6, class56.field991 + var7 - var3, class205.field3297, var3);
                return;
            }
        } catch (Exception var10) {
            return;
        }
    }

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "(B)V")
    public static void method1093(byte arg0) {
        field2438 = null;
        field2446 = null;
        field2448 = null;
        if (arg0 >= -46) {
            method1094(52, (class171) null, 93);
        }
        field2436 = null;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(ILla;I)V")
    public static final void method1094(int arg0, class171 arg1, int arg2) {
        field2441++;
        if (arg1.field2836 > class207.field3336) {
            class247.method1641((byte) 119, arg1);
        } else if (arg1.field2866 < class207.field3336) {
            class293.method1957(arg1, -28276);
        } else {
            class25.method232(arg1, (byte) 75);
        }
        if (arg1.field2849 < 128 || arg1.field2887 < 128 || arg1.field2849 >= 13184 || arg1.field2887 >= 13184) {
            arg1.field2836 = 0;
            arg1.field2816 = -1;
            arg1.field2866 = 0;
            arg1.field2817 = -1;
            arg1.field2849 = arg1.field2844[0] * 128 + arg1.method1226((byte) -114) * 64;
            arg1.field2887 = arg1.field2813[0] * 128 + (arg1.method1226((byte) -88) * 64);
            arg1.method1223((byte) -22);
        }
        if (class48.field878 == arg1 && (arg1.field2849 < 1536 || arg1.field2887 < 1536 || arg1.field2849 >= 11776 || arg1.field2887 >= 11776)) {
            arg1.field2816 = -1;
            arg1.field2836 = 0;
            arg1.field2866 = 0;
            arg1.field2817 = -1;
            arg1.field2849 = arg1.field2844[0] * 128 + (arg1.method1226((byte) -92) * 64);
            arg1.field2887 = arg1.field2813[0] * 128 + arg1.method1226((byte) -113) * 64;
            arg1.method1223((byte) -22);
        }
        if (arg0 > -76) {
            method1093((byte) 20);
        }
        class40.method332(arg1, (byte) -128);
        class212.method1408(-1, arg1);
    }
}
