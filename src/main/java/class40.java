import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wh")
public abstract class class40 extends class430 {

    @OriginalMember(owner = "client!wh", name = "p", descriptor = "F")
    public float field685;

    @OriginalMember(owner = "client!wh", name = "h", descriptor = "I")
    private int field677;

    @OriginalMember(owner = "client!wh", name = "i", descriptor = "I")
    public int field678;

    @OriginalMember(owner = "client!wh", name = "s", descriptor = "I")
    public int field688;

    @OriginalMember(owner = "client!wh", name = "j", descriptor = "I")
    public int field679;

    @OriginalMember(owner = "client!wh", name = "q", descriptor = "I")
    private int field686;

    @OriginalMember(owner = "client!wh", name = "g", descriptor = "I")
    public static int field676;

    @OriginalMember(owner = "client!wh", name = "l", descriptor = "I")
    public static int field681;

    @OriginalMember(owner = "client!wh", name = "m", descriptor = "I")
    public static int field682;

    @OriginalMember(owner = "client!wh", name = "n", descriptor = "I")
    public static int field683;

    @OriginalMember(owner = "client!wh", name = "r", descriptor = "I")
    public static int field687;

    @OriginalMember(owner = "client!wh", name = "t", descriptor = "I")
    public static int field689;

    @OriginalMember(owner = "client!wh", name = "u", descriptor = "I")
    public static int field690;

    @OriginalMember(owner = "client!wh", name = "o", descriptor = "Ld;")
    public static class267 field684;

    @OriginalMember(owner = "client!wh", name = "k", descriptor = "Lffa;")
    public static class676 field680;

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(I)I", line = 5)
    public final int method420(int arg0) {
        field687++;
        return arg0 == -1 ? this.field686 : 40;
    }

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "(I)I", line = 21)
    public final int method421(int arg0) {
        if (arg0 < 108) {
            return 29;
        } else {
            field690++;
            return this.field679;
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(B)I", line = 34)
    public final int method422(byte arg0) {
        if (arg0 >= -55) {
            this.field677 = -84;
        }
        field683++;
        return this.field678;
    }

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "(B)V", line = 45)
    public static final void method423(byte arg0) {
        if (arg0 != 102) {
            field684 = null;
        }
        class405.field5772 = -1;
        field689++;
        class607.field8612 = null;
    }

    @OriginalMember(owner = "client!wh", name = "d", descriptor = "(B)I", line = 59)
    public final int method425(byte arg0) {
        field681++;
        if (arg0 < 72) {
            this.method429(82);
        }
        return this.field677;
    }

    @OriginalMember(owner = "client!wh", name = "e", descriptor = "(B)V", line = 72)
    public static void method426(byte arg0) {
        if (arg0 != -77) {
            method426((byte) 106);
        }
        field684 = null;
        field680 = null;
    }

    @OriginalMember(owner = "client!wh", name = "c", descriptor = "(I)I", line = 83)
    public final int method427(int arg0) {
        if (arg0 == -1) {
            field682++;
            return this.field688;
        } else {
            return 2;
        }
    }

    @OriginalMember(owner = "client!wh", name = "<init>", descriptor = "(IIIIIF)V", line = 100)
    public class40(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        this.field685 = arg5;
        this.field677 = arg3;
        this.field678 = arg0;
        this.field688 = arg2;
        this.field679 = arg1;
        this.field686 = arg4;
    }

    @OriginalMember(owner = "client!wh", name = "d", descriptor = "(I)F", line = 115)
    public final float method429(int arg0) {
        if (arg0 != -1) {
            this.field686 = 54;
        }
        field676++;
        return this.field685;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(FI)V")
    public abstract void method424(float arg0, int arg1);

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(BIII)V")
    public abstract void method428(byte arg0, int arg1, int arg2, int arg3);
}
