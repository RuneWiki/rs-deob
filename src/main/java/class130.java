import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public class class130 {

    @OriginalMember(owner = "client!ne", name = "e", descriptor = "B")
    private byte field2790;

    @OriginalMember(owner = "client!ne", name = "s", descriptor = "I")
    public int field2804;

    @OriginalMember(owner = "client!ne", name = "p", descriptor = "I")
    public int field2801;

    @OriginalMember(owner = "client!ne", name = "o", descriptor = "I")
    public int field2800;

    @OriginalMember(owner = "client!ne", name = "w", descriptor = "I")
    public int field2808;

    @OriginalMember(owner = "client!ne", name = "g", descriptor = "I")
    public int field2792;

    @OriginalMember(owner = "client!ne", name = "j", descriptor = "[I")
    public static int[] field2795 = new int[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

    @OriginalMember(owner = "client!ne", name = "n", descriptor = "Z")
    public static boolean field2799 = false;

    @OriginalMember(owner = "client!ne", name = "i", descriptor = "Ldd;")
    public static class35 field2794 = class180.method1196((byte) 126, "mod_icons");

    @OriginalMember(owner = "client!ne", name = "l", descriptor = "Ldd;")
    private static class35 field2797 = class180.method1196((byte) 126, "Enter your username (V password)3");

    @OriginalMember(owner = "client!ne", name = "q", descriptor = "Ldd;")
    public static class35 field2802 = class180.method1196((byte) -86, "oder benutzen Sie eine andere Welt)3");

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "Ldd;")
    public static class35 field2786 = class180.method1196((byte) -124, "(Udns");

    @OriginalMember(owner = "client!ne", name = "y", descriptor = "Ldd;")
    public static class35 field2810 = class180.method1196((byte) -33, "Ein kostenloses Spielkonto erstellen)3");

    @OriginalMember(owner = "client!ne", name = "t", descriptor = "Ldd;")
    private static class35 field2805 = class180.method1196((byte) 126, "Prepared visibility map");

    @OriginalMember(owner = "client!ne", name = "u", descriptor = "[I")
    public static int[] field2806 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "client!ne", name = "h", descriptor = "Ldd;")
    public static class35 field2793 = field2805;

    @OriginalMember(owner = "client!ne", name = "v", descriptor = "Ldd;")
    public static class35 field2807 = field2797;

    @OriginalMember(owner = "client!ne", name = "z", descriptor = "I")
    public static int field2811 = 0;

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "I")
    public static int field2787;

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "I")
    public static int field2788;

    @OriginalMember(owner = "client!ne", name = "f", descriptor = "I")
    public static int field2791;

    @OriginalMember(owner = "client!ne", name = "k", descriptor = "I")
    public static int field2796;

    @OriginalMember(owner = "client!ne", name = "m", descriptor = "I")
    public static int field2798;

    @OriginalMember(owner = "client!ne", name = "r", descriptor = "I")
    public static int field2803;

    @OriginalMember(owner = "client!ne", name = "x", descriptor = "I")
    public static int field2809;

    @OriginalMember(owner = "client!ne", name = "d", descriptor = "Lag;")
    public static class8 field2789;

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(I)I")
    public final int method898(int arg0) {
        if (arg0 == 22248) {
            field2809++;
            return this.field2790 & 0x7;
        } else {
            return -105;
        }
    }

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "(I)I")
    public final int method899(int arg0) {
        if (arg0 == 1) {
            field2798++;
            return (this.field2790 & 0x8) == 8 ? 1 : 0;
        } else {
            return 92;
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(BILag;I)Lba;")
    public static final class12 method900(byte arg0, int arg1, class8 arg2, int arg3) {
        field2791++;
        if (arg0 > -121) {
            field2793 = null;
        }
        return class19.method166(arg1, 61, arg2, arg3) ? class190.method1251(-103) : null;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(Lag;ILag;ZB)Lf;")
    public static final class51 method901(class8 arg0, int arg1, class8 arg2, boolean arg3, byte arg4) {
        field2788++;
        int[] var5 = arg0.method61(arg1, 97);
        boolean var6 = true;
        for (int var7 = 0; var7 < var5.length; var7++) {
            byte[] var8 = arg0.method57(arg1, var5[var7], -1);
            if (var8 == null) {
                var6 = false;
            } else {
                int var9 = var8[1] & 0xFF | (var8[0] & 0xFF) << 8;
                byte[] var10;
                if (arg3) {
                    var10 = arg2.method57(0, var9, -1);
                } else {
                    var10 = arg2.method57(var9, 0, -1);
                }
                if (var10 == null) {
                    var6 = false;
                }
            }
        }
        if (!var6) {
            return null;
        }
        try {
            if (arg4 >= -20) {
                field2795 = null;
            }
            return new class51(arg0, arg2, arg1, arg3);
        } catch (Exception var11) {
            return null;
        }
    }

    @OriginalMember(owner = "client!ne", name = "<init>", descriptor = "()V")
    public class130() {
    }

    @OriginalMember(owner = "client!ne", name = "<init>", descriptor = "(Lce;)V")
    public class130(class26 arg0) {
        this.field2790 = arg0.method225((byte) -125);
        this.field2804 = arg0.method256((byte) -78);
        this.field2801 = arg0.method240(8);
        this.field2800 = arg0.method240(8);
        this.field2808 = arg0.method240(8);
        this.field2792 = arg0.method240(8);
    }

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "(I)V")
    public static void method902(int arg0) {
        field2789 = null;
        field2802 = null;
        field2806 = null;
        field2786 = null;
        field2793 = null;
        if (arg0 > -110) {
            method900((byte) -27, 59, null, 113);
        }
        field2797 = null;
        field2795 = null;
        field2810 = null;
        field2794 = null;
        field2807 = null;
        field2805 = null;
    }
}
