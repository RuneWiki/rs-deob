import jaggl.OpenGL;
import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mda")
public class class267 {

    @OriginalMember(owner = "client!mda", name = "a", descriptor = "I")
    public int field3705 = 0;

    @OriginalMember(owner = "client!mda", name = "c", descriptor = "I")
    public int field3707 = 0;

    @OriginalMember(owner = "client!mda", name = "h", descriptor = "Z")
    public boolean field3712 = false;

    @OriginalMember(owner = "client!mda", name = "i", descriptor = "I")
    public int field3713 = 0;

    @OriginalMember(owner = "client!mda", name = "d", descriptor = "I")
    public int field3708 = 0;

    @OriginalMember(owner = "client!mda", name = "n", descriptor = "Z")
    public boolean field3718 = true;

    @OriginalMember(owner = "client!mda", name = "p", descriptor = "Lfu;")
    public class395 field3720 = new class395();

    @OriginalMember(owner = "client!mda", name = "A", descriptor = "[I")
    public int[] field3731 = new int[class19.field302];

    @OriginalMember(owner = "client!mda", name = "v", descriptor = "[I")
    public int[] field3726 = new int[64];

    @OriginalMember(owner = "client!mda", name = "B", descriptor = "[F")
    public float[] field3732 = new float[2];

    @OriginalMember(owner = "client!mda", name = "x", descriptor = "[I")
    public int[] field3728 = new int[10];

    @OriginalMember(owner = "client!mda", name = "C", descriptor = "[I")
    public int[] field3733 = new int[8];

    @OriginalMember(owner = "client!mda", name = "F", descriptor = "[I")
    public int[] field3736 = new int[64];

    @OriginalMember(owner = "client!mda", name = "z", descriptor = "[I")
    public int[] field3730 = new int[64];

    @OriginalMember(owner = "client!mda", name = "N", descriptor = "[I")
    public int[] field3744 = new int[10000];

    @OriginalMember(owner = "client!mda", name = "H", descriptor = "[I")
    public int[] field3738 = new int[64];

    @OriginalMember(owner = "client!mda", name = "G", descriptor = "[I")
    public int[] field3737 = new int[10000];

    @OriginalMember(owner = "client!mda", name = "O", descriptor = "[I")
    public int[] field3745 = new int[class19.field302];

    @OriginalMember(owner = "client!mda", name = "y", descriptor = "[I")
    public int[] field3729 = new int[class19.field302];

    @OriginalMember(owner = "client!mda", name = "L", descriptor = "[I")
    public int[] field3742 = new int[8];

    @OriginalMember(owner = "client!mda", name = "I", descriptor = "[I")
    public int[] field3739 = new int[8];

    @OriginalMember(owner = "client!mda", name = "V", descriptor = "[I")
    public int[] field3751 = new int[10];

    @OriginalMember(owner = "client!mda", name = "X", descriptor = "[I")
    public int[] field3753 = new int[10];

    @OriginalMember(owner = "client!mda", name = "s", descriptor = "[I")
    public int[] field3723 = new int[class19.field302];

    @OriginalMember(owner = "client!mda", name = "U", descriptor = "[I")
    public int[] field3750 = new int[class19.field302];

    @OriginalMember(owner = "client!mda", name = "W", descriptor = "[I")
    public int[] field3752 = new int[10];

    @OriginalMember(owner = "client!mda", name = "M", descriptor = "[I")
    public int[] field3743 = new int[class19.field302];

    @OriginalMember(owner = "client!mda", name = "bb", descriptor = "[I")
    public int[] field3757 = new int[class19.field302];

    @OriginalMember(owner = "client!mda", name = "o", descriptor = "Lgf;")
    private class279 field3719;

    @OriginalMember(owner = "client!mda", name = "j", descriptor = "I")
    public int field3714;

    @OriginalMember(owner = "client!mda", name = "Q", descriptor = "Lor;")
    public class641 field3747;

    @OriginalMember(owner = "client!mda", name = "ab", descriptor = "Lub;")
    public class19 field3756;

    @OriginalMember(owner = "client!mda", name = "E", descriptor = "Lub;")
    public class19 field3735;

    @OriginalMember(owner = "client!mda", name = "q", descriptor = "Lub;")
    public class19 field3721;

    @OriginalMember(owner = "client!mda", name = "r", descriptor = "Lub;")
    public class19 field3722;

    @OriginalMember(owner = "client!mda", name = "w", descriptor = "Lub;")
    public class19 field3727;

    @OriginalMember(owner = "client!mda", name = "Z", descriptor = "Lub;")
    public class19 field3755;

    @OriginalMember(owner = "client!mda", name = "K", descriptor = "Lub;")
    public class19 field3741;

    @OriginalMember(owner = "client!mda", name = "P", descriptor = "Lub;")
    public class19 field3746;

    @OriginalMember(owner = "client!mda", name = "D", descriptor = "Lub;")
    public class19 field3734;

    @OriginalMember(owner = "client!mda", name = "J", descriptor = "Lub;")
    public class19 field3740;

    @OriginalMember(owner = "client!mda", name = "t", descriptor = "[I")
    public int[] field3724;

    @OriginalMember(owner = "client!mda", name = "e", descriptor = "I")
    public static int field3709;

    @OriginalMember(owner = "client!mda", name = "f", descriptor = "I")
    public static int field3710;

    @OriginalMember(owner = "client!mda", name = "k", descriptor = "I")
    public static int field3715;

    @OriginalMember(owner = "client!mda", name = "l", descriptor = "I")
    public static int field3716;

    @OriginalMember(owner = "client!mda", name = "u", descriptor = "I")
    public int field3725;

    @OriginalMember(owner = "client!mda", name = "R", descriptor = "I")
    public int field3748;

    @OriginalMember(owner = "client!mda", name = "T", descriptor = "I")
    public int field3749;

    @OriginalMember(owner = "client!mda", name = "Y", descriptor = "I")
    public static int field3754;

    @OriginalMember(owner = "client!mda", name = "b", descriptor = "Lwu;")
    public static class376 field3706;

    @OriginalMember(owner = "client!mda", name = "g", descriptor = "Ljava/lang/Runnable;")
    public Runnable field3711;

    @OriginalMember(owner = "client!mda", name = "m", descriptor = "Z")
    public boolean field3717;

    @OriginalMember(owner = "client!mda", name = "<init>", descriptor = "(Lgf;)V", line = 248)
    public class267(class279 arg0) {
        this.field3719 = arg0;
        this.field3714 = this.field3719.field3932 - 255;
        this.field3747 = new class641(arg0, this);
        this.field3756 = new class19(this.field3719);
        this.field3735 = new class19(this.field3719);
        this.field3721 = new class19(this.field3719);
        this.field3722 = new class19(this.field3719);
        this.field3727 = new class19(this.field3719);
        this.field3755 = new class19(this.field3719);
        this.field3741 = new class19(this.field3719);
        this.field3746 = new class19(this.field3719);
        this.field3734 = new class19(this.field3719);
        this.field3740 = new class19(this.field3719);
        this.field3724 = new int[class19.field305];
        for (int var2 = 0; var2 < class19.field305; var2++) {
            this.field3724[var2] = -1;
        }
    }

    @OriginalMember(owner = "client!mda", name = "a", descriptor = "(I)Lju;", line = 8)
    public static final class127 method1614(int arg0) {
        field3715++;
        if (arg0 != 31638) {
            method1616((byte) -83);
        }
        class127 var1 = (class127) class384.field5376.method4051(896);
        if (var1 != null) {
            var1.method3564(true);
            var1.method2414((byte) -26);
            return var1;
        }
        class127 var2;
        do {
            var2 = (class127) class597.field7800.method4051(896);
            if (var2 == null) {
                return null;
            }
            if (var2.method1008(true) > class375.method2193(116)) {
                return null;
            }
            var2.method3564(true);
            var2.method2414((byte) -26);
        } while ((var2.field5747 & Long.MIN_VALUE) == 0L);
        return var2;
    }

    @OriginalMember(owner = "client!mda", name = "a", descriptor = "(BLwu;Ld;Ljava/awt/Canvas;I)Lha;", line = 52)
    public static final class59 method1615(byte arg0, class376 arg1, class152 arg2, Canvas arg3, int arg4) {
        field3709++;
        if (!class594.method3227(-51)) {
            throw new RuntimeException("");
        } else if (class702.method3952(-99, "jaggl")) {
            OpenGL var5 = new OpenGL();
            long var6 = var5.init(arg3, 8, 8, 8, 24, 0, arg4);
            if (var6 == 0L) {
                throw new RuntimeException("");
            }
            if (arg0 != -104) {
                field3706 = null;
            }
            class122 var8 = new class122(var5, arg3, var6, arg2, arg1, arg4);
            var8.method882(false);
            return var8;
        } else {
            throw new RuntimeException("");
        }
    }

    @OriginalMember(owner = "client!mda", name = "a", descriptor = "(B)V", line = 91)
    public static void method1616(byte arg0) {
        if (arg0 == -58) {
            field3706 = null;
        }
    }

    @OriginalMember(owner = "client!mda", name = "b", descriptor = "(I)V", line = 112)
    public final void method1617(int arg0) {
        field3710++;
        if (arg0 != 0) {
            method1616((byte) 72);
        }
        this.field3747 = new class641(this.field3719, this);
    }

    @OriginalMember(owner = "client!mda", name = "a", descriptor = "(ILjava/lang/Runnable;)V", line = 128)
    public final void method1618(int arg0, Runnable arg1) {
        field3754++;
        if (arg0 != 8) {
            method1615((byte) 5, null, null, null, -33);
        }
        this.field3711 = arg1;
    }
}
