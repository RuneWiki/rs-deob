import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!laa")
public abstract class class123 extends class168 {

    @OriginalMember(owner = "client!laa", name = "v", descriptor = "F")
    public float field1779;

    @OriginalMember(owner = "client!laa", name = "t", descriptor = "I")
    public int field1777;

    @OriginalMember(owner = "client!laa", name = "q", descriptor = "I")
    public int field1774;

    @OriginalMember(owner = "client!laa", name = "l", descriptor = "I")
    private int field1769;

    @OriginalMember(owner = "client!laa", name = "j", descriptor = "I")
    private int field1767;

    @OriginalMember(owner = "client!laa", name = "s", descriptor = "I")
    public int field1776;

    @OriginalMember(owner = "client!laa", name = "n", descriptor = "I")
    public static int field1771 = 0;

    @OriginalMember(owner = "client!laa", name = "z", descriptor = "I")
    public static int field1783 = 0;

    @OriginalMember(owner = "client!laa", name = "y", descriptor = "Leha;")
    public static class91 field1782 = new class91();

    @OriginalMember(owner = "client!laa", name = "k", descriptor = "I")
    public static int field1768;

    @OriginalMember(owner = "client!laa", name = "m", descriptor = "I")
    public static int field1770;

    @OriginalMember(owner = "client!laa", name = "o", descriptor = "I")
    public static int field1772;

    @OriginalMember(owner = "client!laa", name = "p", descriptor = "I")
    public static int field1773;

    @OriginalMember(owner = "client!laa", name = "r", descriptor = "I")
    public static int field1775;

    @OriginalMember(owner = "client!laa", name = "w", descriptor = "I")
    public static int field1780;

    @OriginalMember(owner = "client!laa", name = "x", descriptor = "I")
    public static int field1781;

    @OriginalMember(owner = "client!laa", name = "u", descriptor = "[[[Lds;")
    public static class14[][][] field1778;

    @OriginalMember(owner = "client!laa", name = "a", descriptor = "(I)I")
    public final int method932(int arg0) {
        field1772++;
        if (arg0 != -16562) {
            this.method938(-43);
        }
        return this.field1777;
    }

    @OriginalMember(owner = "client!laa", name = "b", descriptor = "(I)V")
    public static void method933(int arg0) {
        field1782 = null;
        field1778 = null;
        if (arg0 < 104) {
            method940((byte) -44, null);
        }
    }

    @OriginalMember(owner = "client!laa", name = "a", descriptor = "(B)I")
    public final int method934(byte arg0) {
        field1770++;
        if (arg0 > -60) {
            method940((byte) -27, null);
        }
        return this.field1769;
    }

    @OriginalMember(owner = "client!laa", name = "c", descriptor = "(I)I")
    public final int method935(int arg0) {
        if (arg0 == 0) {
            field1780++;
            return this.field1767;
        } else {
            return -35;
        }
    }

    @OriginalMember(owner = "client!laa", name = "a", descriptor = "(IIBI)V")
    public abstract void method936(int arg0, int arg1, byte arg2, int arg3);

    @OriginalMember(owner = "client!laa", name = "<init>", descriptor = "(IIIIIF)V")
    public class123(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        this.field1779 = arg5;
        this.field1777 = arg0;
        this.field1774 = arg1;
        this.field1769 = arg4;
        this.field1767 = arg3;
        this.field1776 = arg2;
    }

    @OriginalMember(owner = "client!laa", name = "e", descriptor = "(I)I")
    public final int method937(int arg0) {
        field1768++;
        return arg0 <= 44 ? 111 : this.field1774;
    }

    @OriginalMember(owner = "client!laa", name = "f", descriptor = "(I)I")
    public final int method938(int arg0) {
        field1775++;
        if (arg0 != 0) {
            this.field1769 = -62;
        }
        return this.field1776;
    }

    @OriginalMember(owner = "client!laa", name = "g", descriptor = "(I)F")
    public final float method939(int arg0) {
        if (arg0 == -11214) {
            field1781++;
            return this.field1779;
        } else {
            return 1.4424789F;
        }
    }

    @OriginalMember(owner = "client!laa", name = "a", descriptor = "(BLbp;)I")
    public static final int method940(byte arg0, class389 arg1) {
        field1773++;
        if (arg0 != 115) {
            field1778 = null;
        }
        if (class447.field5937 == arg1) {
            return 5890;
        } else if (class479.field6523 == arg1) {
            return 34167;
        } else if (class84.field1162 == arg1) {
            return 34168;
        } else if (class21.field383 == arg1) {
            return 34166;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!laa", name = "a", descriptor = "(FI)V")
    public abstract void method941(float arg0, int arg1);
}
