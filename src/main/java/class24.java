import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gh")
public class class24 {

    @OriginalMember(owner = "client!gh", name = "k", descriptor = "J")
    public long field303 = 0L;

    @OriginalMember(owner = "client!gh", name = "h", descriptor = "Lcf;")
    public static class93 field300 = class147.method1066("ondulation:", -48);

    @OriginalMember(owner = "client!gh", name = "d", descriptor = "[I")
    public static int[] field296 = new int[200];

    @OriginalMember(owner = "client!gh", name = "n", descriptor = "I")
    public static int field306 = 0;

    @OriginalMember(owner = "client!gh", name = "q", descriptor = "Lcf;")
    public static class93 field309 = class147.method1066("Impossible de trouver ", -48);

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "I")
    public int field293;

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "I")
    public static int field294;

    @OriginalMember(owner = "client!gh", name = "e", descriptor = "I")
    public int field297;

    @OriginalMember(owner = "client!gh", name = "f", descriptor = "I")
    public static int field298;

    @OriginalMember(owner = "client!gh", name = "g", descriptor = "I")
    public int field299;

    @OriginalMember(owner = "client!gh", name = "j", descriptor = "I")
    public int field302;

    @OriginalMember(owner = "client!gh", name = "l", descriptor = "I")
    public int field304;

    @OriginalMember(owner = "client!gh", name = "m", descriptor = "I")
    public int field305;

    @OriginalMember(owner = "client!gh", name = "o", descriptor = "I")
    public int field307;

    @OriginalMember(owner = "client!gh", name = "p", descriptor = "I")
    public static int field308;

    @OriginalMember(owner = "client!gh", name = "c", descriptor = "Lgl;")
    public class211 field295;

    @OriginalMember(owner = "client!gh", name = "i", descriptor = "Lgl;")
    public class211 field301;

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(III)V")
    public static final void method125(int arg0, int arg1, int arg2) {
        field294++;
        class212 var3 = class123.method905(arg1 - 1205364449, arg1, arg0);
        var3.method1493(13);
        var3.field3883 = arg2;
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(B)V")
    public static final void method126(byte arg0) {
        field298++;
        int var1 = class112.field1920;
        if (arg0 != -70) {
            field296 = null;
        }
        int var2 = class34.field537;
        int var3 = class189.field3465 - var1 - class150.field2629;
        int var4 = class47.field756 - var2 - class169.field2968;
        if (var1 <= 0 && var3 <= 0 && var2 <= 0 && var4 <= 0) {
            return;
        }
        try {
            int var5 = 0;
            Container var6;
            if (class126.field2236 != null) {
                var6 = class126.field2236;
            } else if (class246.field4432 == null) {
                var6 = class169.field2967.field5113;
            } else {
                var6 = class246.field4432;
            }
            int var7 = 0;
            if (class246.field4432 == var6) {
                Insets var8 = class246.field4432.getInsets();
                var7 = var8.top;
                var5 = var8.left;
            }
            Graphics var9 = var6.getGraphics();
            var9.setColor(Color.black);
            if (var1 > 0) {
                var9.fillRect(var5, var7, var1, class47.field756);
            }
            if (var2 > 0) {
                var9.fillRect(var5, var7, class189.field3465, var2);
            }
            if (var3 > 0) {
                var9.fillRect(class189.field3465 + var5 - var3, var7, var3, class47.field756);
            }
            if (var4 > 0) {
                var9.fillRect(var5, class47.field756 + var7 - var4, class189.field3465, var4);
                return;
            }
        } catch (Exception var10) {
            return;
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(Z)V")
    public static void method127(boolean arg0) {
        field309 = null;
        field296 = null;
        field300 = null;
        if (arg0) {
            field306 = 36;
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(BLtg;)V")
    public static final void method128(byte arg0, class181 arg1) {
        if (arg0 != -108) {
            field300 = null;
        }
        field308++;
        int var2 = arg1.field3218;
        if (var2 == 324) {
            if (class208.field3736 == -1) {
                class4.field43 = arg1.field3298;
                class208.field3736 = arg1.field3308;
            }
            if (class46.field737.field2861) {
                arg1.field3308 = class208.field3736;
            } else {
                arg1.field3308 = class4.field43;
            }
        } else if (var2 == 325) {
            if (class208.field3736 == -1) {
                class208.field3736 = arg1.field3308;
                class4.field43 = arg1.field3298;
            }
            if (class46.field737.field2861) {
                arg1.field3308 = class4.field43;
            } else {
                arg1.field3308 = class208.field3736;
            }
        } else if (var2 == 327) {
            arg1.field3254 = 150;
            arg1.field3243 = (int) (Math.sin((double) class275.field4921 / 40.0D) * 256.0D) & 0x7FF;
            arg1.field3326 = -1;
            arg1.field3287 = 5;
        } else if (var2 == 328) {
            if (class166.field2927.field4247 == null) {
                arg1.field3326 = 0;
            } else {
                arg1.field3254 = 150;
                arg1.field3243 = (int) (Math.sin((double) class275.field4921 / 40.0D) * 256.0D) & 0x7FF;
                arg1.field3287 = 5;
                arg1.field3326 = ((int) class166.field2927.field4247.method679((byte) 104) << 11) + 2047;
                arg1.field3328 = class166.field2927.field3862;
                arg1.field3337 = 0;
                arg1.field3204 = class166.field2927.field3796;
                arg1.field3203 = class166.field2927.field3797;
            }
        }
    }
}
