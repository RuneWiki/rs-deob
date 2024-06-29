import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public class class143 {

    @OriginalMember(owner = "client!w", name = "c", descriptor = "I")
    public int field3398;

    @OriginalMember(owner = "client!w", name = "o", descriptor = "I")
    public int field3410;

    @OriginalMember(owner = "client!w", name = "g", descriptor = "I")
    public int field3402;

    @OriginalMember(owner = "client!w", name = "l", descriptor = "I")
    public int field3407;

    @OriginalMember(owner = "client!w", name = "d", descriptor = "Lrd;")
    public static class117 field3399 = class95.method812("Benutzeroberfl-=che geladen)3", (byte) 8);

    @OriginalMember(owner = "client!w", name = "j", descriptor = "Lrd;")
    public static class117 field3405 = class95.method812("sideicons", (byte) 8);

    @OriginalMember(owner = "client!w", name = "h", descriptor = "[I")
    public static int[] field3403 = new int[128];

    @OriginalMember(owner = "client!w", name = "a", descriptor = "Lrd;")
    private static class117 field3396 = class95.method812("Please try again)3", (byte) 8);

    @OriginalMember(owner = "client!w", name = "k", descriptor = "Lrd;")
    public static class117 field3406 = field3396;

    @OriginalMember(owner = "client!w", name = "i", descriptor = "Lrd;")
    private static class117 field3404 = class95.method812("Attack", (byte) 8);

    @OriginalMember(owner = "client!w", name = "b", descriptor = "Lrd;")
    public static class117 field3397 = field3404;

    @OriginalMember(owner = "client!w", name = "f", descriptor = "Lrd;")
    public static class117 field3401 = class95.method812("RuneScape wird geladen )2 bitte warten)3)3)3", (byte) 8);

    @OriginalMember(owner = "client!w", name = "q", descriptor = "Lrd;")
    public static class117 field3412 = class95.method812(" @whi@(X", (byte) 8);

    @OriginalMember(owner = "client!w", name = "e", descriptor = "I")
    public static int field3400;

    @OriginalMember(owner = "client!w", name = "m", descriptor = "I")
    public static int field3408;

    @OriginalMember(owner = "client!w", name = "p", descriptor = "I")
    public static int field3411;

    @OriginalMember(owner = "client!w", name = "n", descriptor = "Lga;")
    public static class44 field3409;

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(IZII)I")
    public static final int method1135(int arg0, boolean arg1, int arg2, int arg3) {
        if (!arg1) {
            field3396 = null;
        }
        field3408++;
        int var4 = 256 - arg0;
        return ((arg3 & 0xFF00) * var4 + (arg2 & 0xFF00) * arg0 & 0xFF0000) + ((arg3 & 0xFF00FF) * var4 + ((arg2 & 0xFF00FF) * arg0) & 0xFF00FF00) >> 8;
    }

    @OriginalMember(owner = "client!w", name = "<init>", descriptor = "()V")
    public class143() {
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(I)V")
    public static void method1136(int arg0) {
        if (arg0 != -15736) {
            return;
        }
        field3412 = null;
        field3397 = null;
        field3399 = null;
        field3409 = null;
        field3406 = null;
        field3403 = null;
        field3396 = null;
        field3405 = null;
        field3404 = null;
        field3401 = null;
    }

    @OriginalMember(owner = "client!w", name = "<init>", descriptor = "(Lw;)V")
    public class143(class143 arg0) {
        this.field3398 = arg0.field3398;
        this.field3410 = arg0.field3410;
        this.field3402 = arg0.field3402;
        this.field3407 = arg0.field3407;
    }

    @OriginalMember(owner = "client!w", name = "b", descriptor = "(I)V")
    public static final void method1137(int arg0) {
        try {
            Graphics var1 = class42.field1216.getGraphics();
            class6.field150.method485(4, 0, -6898, var1);
            class97.field2443.method485(arg0, 0, -6898, var1);
            class37.field1068.method485(4, 722, -6898, var1);
            class5.field115.method485(205, 743, arg0 - 7255, var1);
            class16.field385.method485(0, 0, -6898, var1);
            class90.field2307.method485(4, 516, -6898, var1);
            class42.field1206.method485(205, 516, arg0 ^ 0xFFFFE46B, var1);
            class65.field1854.method485(357, 496, -6898, var1);
            class115.field2804.method485(338, 0, -6898, var1);
        } catch (Exception var2) {
            class42.field1216.repaint();
        }
        field3400++;
    }
}
