import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public class class142 implements Runnable {

    @OriginalMember(owner = "client!oc", name = "i", descriptor = "[Llg;")
    public volatile class116[] field2749 = new class116[2];

    @OriginalMember(owner = "client!oc", name = "k", descriptor = "Z")
    public volatile boolean field2751 = false;

    @OriginalMember(owner = "client!oc", name = "m", descriptor = "Z")
    public volatile boolean field2753 = false;

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "[I")
    public static int[] field2742 = new int[] { 1, -1, -1, 1 };

    @OriginalMember(owner = "client!oc", name = "g", descriptor = "I")
    public static int field2747 = 0;

    @OriginalMember(owner = "client!oc", name = "j", descriptor = "Lvc;")
    public static class212 field2750 = new class212(64);

    @OriginalMember(owner = "client!oc", name = "n", descriptor = "I")
    public static int field2754 = -1;

    @OriginalMember(owner = "client!oc", name = "p", descriptor = "Lob;")
    private static class141 field2756 = class175.method1195(40, "Service unavailable)3");

    @OriginalMember(owner = "client!oc", name = "o", descriptor = "Lob;")
    public static class141 field2755 = field2756;

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "I")
    public static int field2741;

    @OriginalMember(owner = "client!oc", name = "c", descriptor = "I")
    public static int field2743;

    @OriginalMember(owner = "client!oc", name = "d", descriptor = "I")
    public static int field2744;

    @OriginalMember(owner = "client!oc", name = "e", descriptor = "I")
    public static int field2745;

    @OriginalMember(owner = "client!oc", name = "l", descriptor = "I")
    public static int field2752;

    @OriginalMember(owner = "client!oc", name = "f", descriptor = "Lt;")
    public class189 field2746;

    @OriginalMember(owner = "client!oc", name = "h", descriptor = "[I")
    public static int[] field2748;

    @OriginalMember(owner = "client!oc", name = "run", descriptor = "()V")
    public final void run() {
        field2743++;
        this.field2753 = true;
        try {
            while (!this.field2751) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class116 var2 = this.field2749[var1];
                    if (var2 != null) {
                        var2.method751(-110);
                    }
                }
                class93.method638(10L, (byte) -8);
                class103.method691(this.field2746, null, (byte) 2);
            }
        } catch (Exception var9) {
            class170.method1162(null, var9, (byte) 107);
        } finally {
            Object var6 = null;
            this.field2753 = false;
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(I)V")
    public static void method938(int arg0) {
        field2755 = null;
        field2750 = null;
        field2748 = null;
        if (arg0 != -103) {
            method941(-36, -84L);
        }
        field2756 = null;
        field2742 = null;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(IIIIIZII)V")
    public static final void method939(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7) {
        if (arg5) {
            field2750 = null;
        }
        field2752++;
        if (arg3 < 1 || arg7 < 1 || arg3 > 102 || arg7 > 102) {
            return;
        }
        if (class8.field128 && class66.field1287 != arg4) {
            return;
        }
        int var8 = arg4;
        if (arg4 < 3 && (class164.field3177[1][arg3][arg7] & 0x2) == 2) {
            var8 = arg4 + 1;
        }
        class196.method1320(1177, arg4, var8, arg3, class47.field888[arg4], arg1, arg7);
        if (arg6 >= 0) {
            class7.method43(arg2, arg3, (byte) 70, arg6, arg4, false, arg7, var8, arg0, false, class47.field888[arg4]);
            return;
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(II)Z")
    public static final boolean method940(int arg0, int arg1) {
        field2741++;
        if (arg1 != 10) {
            field2747 = 33;
        }
        return (arg0 >> 21 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(IJ)V")
    public static final void method941(int arg0, long arg1) {
        field2745++;
        if (arg1 == 0L) {
            return;
        }
        class7.field120.method32(82, 12885);
        if (arg0 < -27) {
            class7.field120.method978(-110, arg1);
            class158.field3059++;
        }
    }
}
