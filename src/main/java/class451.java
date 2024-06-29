import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ii")
public class class451 extends class276 {

    @OriginalMember(owner = "client!ii", name = "H", descriptor = "I")
    public int field6736 = 0;

    @OriginalMember(owner = "client!ii", name = "t", descriptor = "[I")
    public static int[] field6722 = new int[13];

    @OriginalMember(owner = "client!ii", name = "E", descriptor = "[[F")
    public static float[][] field6733 = new float[][] { { -0.333333F, -0.333333F, -0.333333F }, { 0.333333F, -0.333333F, -0.333333F }, { -0.333333F, 0.333333F, -0.333333F }, { 0.333333F, 0.333333F, -0.333333F }, { -0.333333F, -0.333333F, 0.333333F }, { 0.333333F, -0.333333F, 0.333333F }, { -0.333333F, 0.333333F, 0.333333F }, { 0.333333F, 0.333333F, 0.333333F } };

    @OriginalMember(owner = "client!ii", name = "K", descriptor = "[I")
    public static int[] field6739 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

    @OriginalMember(owner = "client!ii", name = "n", descriptor = "I")
    public int field6716;

    @OriginalMember(owner = "client!ii", name = "o", descriptor = "I")
    public int field6717;

    @OriginalMember(owner = "client!ii", name = "r", descriptor = "I")
    public int field6720;

    @OriginalMember(owner = "client!ii", name = "s", descriptor = "I")
    public int field6721;

    @OriginalMember(owner = "client!ii", name = "w", descriptor = "I")
    public int field6725;

    @OriginalMember(owner = "client!ii", name = "x", descriptor = "I")
    public int field6726;

    @OriginalMember(owner = "client!ii", name = "y", descriptor = "I")
    public int field6727;

    @OriginalMember(owner = "client!ii", name = "A", descriptor = "I")
    public int field6729;

    @OriginalMember(owner = "client!ii", name = "B", descriptor = "I")
    public int field6730;

    @OriginalMember(owner = "client!ii", name = "D", descriptor = "I")
    public static int field6732;

    @OriginalMember(owner = "client!ii", name = "G", descriptor = "I")
    public int field6735;

    @OriginalMember(owner = "client!ii", name = "I", descriptor = "I")
    public static int field6737;

    @OriginalMember(owner = "client!ii", name = "L", descriptor = "I")
    public int field6740;

    @OriginalMember(owner = "client!ii", name = "v", descriptor = "Lch;")
    public class166 field6724;

    @OriginalMember(owner = "client!ii", name = "z", descriptor = "Lbl;")
    public class265 field6728;

    @OriginalMember(owner = "client!ii", name = "u", descriptor = "Lvq;")
    public class341 field6723;

    @OriginalMember(owner = "client!ii", name = "F", descriptor = "Lvq;")
    public class341 field6734;

    @OriginalMember(owner = "client!ii", name = "p", descriptor = "Lp;")
    public class39 field6718;

    @OriginalMember(owner = "client!ii", name = "q", descriptor = "Lqs;")
    public static class496 field6719;

    @OriginalMember(owner = "client!ii", name = "C", descriptor = "Z")
    public boolean field6731;

    @OriginalMember(owner = "client!ii", name = "J", descriptor = "[I")
    public int[] field6738;

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(I)V", line = 4)
    public static void method2701(int arg0) {
        field6739 = null;
        field6719 = null;
        field6722 = null;
        field6733 = null;
        if (arg0 != 6624) {
            method2701(54);
        }
    }

    @OriginalMember(owner = "client!ii", name = "c", descriptor = "(I)V", line = 26)
    public final void method2702(int arg0) {
        field6732++;
        if (arg0 != 0) {
            return;
        }
        int var2 = this.field6730;
        if (this.field6718 != null) {
            class39 var3 = this.field6718.method296(-1008, class327.field5160);
            if (var3 == null) {
                this.field6738 = null;
                this.field6717 = 0;
                this.field6726 = 0;
                this.field6730 = -1;
                this.field6720 = 0;
                this.field6729 = 0;
            } else {
                this.field6738 = var3.field645;
                this.field6717 = var3.field627;
                this.field6726 = var3.field629 << 7;
                this.field6730 = var3.field653;
                this.field6720 = var3.field650;
                this.field6729 = var3.field637;
            }
        } else if (this.field6728 != null) {
            int var4 = class30.method235(this.field6728, (byte) -76);
            if (var2 != var4) {
                this.field6730 = var4;
                class510 var5 = this.field6728.field4430;
                if (var5.field7448 != null) {
                    var5 = var5.method3000(arg0 + 1, class327.field5160);
                }
                if (var5 == null) {
                    this.field6729 = this.field6726 = 0;
                } else {
                    this.field6729 = var5.field7415;
                    this.field6726 = var5.field7443 << 7;
                }
            }
        } else if (this.field6724 != null) {
            this.field6730 = class112.method802(124, this.field6724);
            this.field6726 = this.field6724.field2633 << 7;
            this.field6729 = this.field6724.field2625;
        }
        if (this.field6730 != var2 && this.field6723 != null) {
            class510.field7455.method1734(this.field6723);
            this.field6723 = null;
        }
    }
}
