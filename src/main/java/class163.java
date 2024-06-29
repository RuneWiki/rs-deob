import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public class class163 {

    @OriginalMember(owner = "client!kf", name = "d", descriptor = "I")
    private int field2625 = -1;

    @OriginalMember(owner = "client!kf", name = "o", descriptor = "I")
    private int field2636 = 0;

    @OriginalMember(owner = "client!kf", name = "e", descriptor = "Lth;")
    private class55 field2626 = new class55();

    @OriginalMember(owner = "client!kf", name = "p", descriptor = "Z")
    public boolean field2637 = false;

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "I")
    private int field2623;

    @OriginalMember(owner = "client!kf", name = "i", descriptor = "[Laf;")
    private class17[] field2630;

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "I")
    private int field2622;

    @OriginalMember(owner = "client!kf", name = "n", descriptor = "[[I")
    private int[][] field2635;

    @OriginalMember(owner = "client!kf", name = "j", descriptor = "[I")
    public static int[] field2631 = new int[] { 8, 11, 4, 6, 9, 7, 10, 0 };

    @OriginalMember(owner = "client!kf", name = "c", descriptor = "I")
    public static int field2624;

    @OriginalMember(owner = "client!kf", name = "f", descriptor = "I")
    public static int field2627;

    @OriginalMember(owner = "client!kf", name = "g", descriptor = "I")
    public static int field2628;

    @OriginalMember(owner = "client!kf", name = "h", descriptor = "I")
    public static int field2629;

    @OriginalMember(owner = "client!kf", name = "k", descriptor = "I")
    public static int field2632;

    @OriginalMember(owner = "client!kf", name = "l", descriptor = "I")
    public static int field2633;

    @OriginalMember(owner = "client!kf", name = "m", descriptor = "I")
    public static int field2634;

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(I)V", line = 7)
    public static void method1039(int arg0) {
        field2631 = null;
        if (arg0 != -3683) {
            method1044(-34, true);
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(IZ)[I", line = 17)
    public final int[] method1040(int arg0, boolean arg1) {
        if (arg1) {
            this.field2635 = (int[][]) ((int[][]) null);
        }
        field2627++;
        if (this.field2623 == this.field2622) {
            this.field2637 = this.field2630[arg0] == null;
            this.field2630[arg0] = class95.field1702;
            return this.field2635[arg0];
        } else if (this.field2622 == 1) {
            this.field2637 = this.field2625 != arg0;
            this.field2625 = arg0;
            return this.field2635[0];
        } else {
            class17 var3 = this.field2630[arg0];
            if (var3 == null) {
                this.field2637 = true;
                if (this.field2636 >= this.field2622) {
                    class17 var4 = (class17) this.field2626.method428(0);
                    var3 = new class17(arg0, var4.field318);
                    this.field2630[var4.field320] = null;
                    var4.method278((byte) -105);
                } else {
                    var3 = new class17(arg0, this.field2636);
                    this.field2636++;
                }
                this.field2630[arg0] = var3;
            } else {
                this.field2637 = false;
            }
            this.field2626.method429(var3, (byte) 127);
            return this.field2635[var3.field318];
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(B)V", line = 93)
    public final void method1041(byte arg0) {
        field2624++;
        for (int var2 = 0; var2 < this.field2622; var2++) {
            this.field2635[var2] = null;
        }
        int var3 = 62 % ((arg0 + 24) / 47);
        this.field2630 = null;
        this.field2635 = (int[][]) null;
        this.field2626.method432(-118);
        this.field2626 = null;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(Lag;I)Ljava/lang/String;", line = 114)
    public static final String method1042(class202 arg0, int arg1) {
        if (arg1 != 32767) {
            field2631 = (int[]) null;
        }
        field2634++;
        return class226.method1507(arg0, 0, 32767);
    }

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "(I)[[I", line = 125)
    public final int[][] method1043(int arg0) {
        field2633++;
        if (this.field2623 != this.field2622) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        for (int var2 = 0; var2 < this.field2622; var2++) {
            this.field2630[var2] = class95.field1702;
        }
        if (arg0 > -63) {
            method1044(-78, false);
        }
        return this.field2635;
    }

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "(IZ)V", line = 154)
    public static final void method1044(int arg0, boolean arg1) {
        if (arg1) {
            field2629 = -87;
        }
        field2632++;
        class2 var2 = class212.method1433(arg0, 2, -13802);
        var2.method16((byte) -28);
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(II)V", line = 171)
    public static final void method1045(int arg0, int arg1) {
        field2628++;
        class159.field2602.method1883(2047773287, arg0);
        if (arg1 != 11) {
            method1045(-20, -90);
        }
    }

    @OriginalMember(owner = "client!kf", name = "<init>", descriptor = "(III)V", line = 195)
    public class163(int arg0, int arg1, int arg2) {
        this.field2623 = arg1;
        this.field2630 = new class17[this.field2623];
        this.field2622 = arg0;
        this.field2635 = new int[this.field2622][arg2];
    }
}
