import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pk")
public abstract class class621 extends class627 {

    @OriginalMember(owner = "client!pk", name = "p", descriptor = "I")
    public int field8683;

    @OriginalMember(owner = "client!pk", name = "w", descriptor = "F")
    public float field8690;

    @OriginalMember(owner = "client!pk", name = "u", descriptor = "I")
    private int field8688;

    @OriginalMember(owner = "client!pk", name = "j", descriptor = "I")
    public int field8677;

    @OriginalMember(owner = "client!pk", name = "m", descriptor = "I")
    private int field8680;

    @OriginalMember(owner = "client!pk", name = "s", descriptor = "I")
    public int field8686;

    @OriginalMember(owner = "client!pk", name = "r", descriptor = "I")
    public static int field8685 = 0;

    @OriginalMember(owner = "client!pk", name = "t", descriptor = "[Ljava/awt/Color;")
    public static Color[] field8687 = new Color[] { new Color(9179409), new Color(16777215), new Color(16726277), new Color(16726277) };

    @OriginalMember(owner = "client!pk", name = "x", descriptor = "[I")
    public static int[] field8691 = new int[120];

    @OriginalMember(owner = "client!pk", name = "k", descriptor = "I")
    public static int field8678;

    @OriginalMember(owner = "client!pk", name = "l", descriptor = "I")
    public static int field8679;

    @OriginalMember(owner = "client!pk", name = "n", descriptor = "I")
    public static int field8681;

    @OriginalMember(owner = "client!pk", name = "o", descriptor = "I")
    public static int field8682;

    @OriginalMember(owner = "client!pk", name = "q", descriptor = "I")
    public static int field8684;

    @OriginalMember(owner = "client!pk", name = "v", descriptor = "I")
    public static int field8689;

    @OriginalMember(owner = "client!pk", name = "y", descriptor = "[Law;")
    public static class539[] field8692;

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 120; var1++) {
            int var2 = var1 + 1;
            int var3 = (int) ((double) var2 + Math.pow(2.0D, (double) var2 / 7.0D) * 300.0D);
            var0 += var3;
            field8691[var1] = var0 / 4;
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(B)I", line = 4)
    public final int method3399(byte arg0) {
        field8689++;
        if (arg0 != -108) {
            method3400(116);
        }
        return this.field8680;
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(I)V", line = 19)
    public static void method3400(int arg0) {
        field8687 = null;
        if (arg0 != -9520) {
            method3400(72);
        }
        field8691 = null;
        field8692 = null;
    }

    @OriginalMember(owner = "client!pk", name = "b", descriptor = "(I)I", line = 41)
    public final int method3401(int arg0) {
        if (arg0 == 4) {
            field8684++;
            return this.field8688;
        } else {
            return 77;
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(Z)I", line = 52)
    public final int method3402(boolean arg0) {
        field8679++;
        return arg0 ? this.field8677 : 50;
    }

    @OriginalMember(owner = "client!pk", name = "b", descriptor = "(B)I", line = 63)
    public final int method3403(byte arg0) {
        field8682++;
        if (arg0 <= 4) {
            this.method3402(true);
        }
        return this.field8683;
    }

    @OriginalMember(owner = "client!pk", name = "c", descriptor = "(I)I", line = 77)
    public final int method3404(int arg0) {
        if (arg0 == -1) {
            field8678++;
            return this.field8686;
        } else {
            return -125;
        }
    }

    @OriginalMember(owner = "client!pk", name = "b", descriptor = "(Z)F", line = 90)
    public final float method3405(boolean arg0) {
        if (arg0) {
            return 1.2993698F;
        } else {
            field8681++;
            return this.field8690;
        }
    }

    @OriginalMember(owner = "client!pk", name = "<init>", descriptor = "(IIIIIF)V", line = 111)
    public class621(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        this.field8683 = arg1;
        this.field8690 = arg5;
        this.field8688 = arg4;
        this.field8677 = arg0;
        this.field8680 = arg3;
        this.field8686 = arg2;
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(IZII)V")
    public abstract void method594(int arg0, boolean arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(BF)V")
    public abstract void method597(byte arg0, float arg1);
}
