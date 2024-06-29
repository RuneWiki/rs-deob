import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nca")
public class class593 extends class623 {

    @OriginalMember(owner = "client!nca", name = "y", descriptor = "Lmi;")
    public class27 field8256;

    @OriginalMember(owner = "client!nca", name = "v", descriptor = "Lbt;")
    public class496 field8253;

    @OriginalMember(owner = "client!nca", name = "t", descriptor = "I")
    public static int field8251 = 0;

    @OriginalMember(owner = "client!nca", name = "u", descriptor = "[[I")
    public static int[][] field8252 = new int[][] { { 2, 4 }, { 2, 4 }, { 5, 2, 4 }, { 4, 5, 2 }, { 2, 4, 5 }, { 5, 2, 4 }, { 1, 6, 2, 5 }, { 1, 6, 7, 1 }, { 6, 7, 1, 1 }, { 0, 8, 9, 8, 9, 4 }, { 8, 9, 4, 0, 8, 9 }, { 2, 10, 0, 10, 11, 11 }, { 2, 4 }, { 1, 6, 7, 1 }, { 1, 6, 7, 1 } };

    @OriginalMember(owner = "client!nca", name = "s", descriptor = "I")
    public int field8250;

    @OriginalMember(owner = "client!nca", name = "w", descriptor = "I")
    public int field8254;

    @OriginalMember(owner = "client!nca", name = "x", descriptor = "I")
    public static int field8255;

    @OriginalMember(owner = "client!nca", name = "z", descriptor = "I")
    public int field8257;

    @OriginalMember(owner = "client!nca", name = "A", descriptor = "I")
    public static int field8258;

    @OriginalMember(owner = "client!nca", name = "B", descriptor = "I")
    public int field8259;

    @OriginalMember(owner = "client!nca", name = "E", descriptor = "I")
    public static int field8261;

    @OriginalMember(owner = "client!nca", name = "F", descriptor = "I")
    public int field8262;

    @OriginalMember(owner = "client!nca", name = "C", descriptor = "Lwc;")
    public static class376 field8260;

    @OriginalMember(owner = "client!nca", name = "b", descriptor = "(I)V", line = 4)
    public static final void method3290(int arg0) {
        field8261++;
        for (class64 var1 = (class64) class631.field8763.method3111(arg0 ^ 0x72); var1 != null; var1 = (class64) class631.field8763.method3116(-122)) {
            class561 var2 = var1.field863;
            if (var2.field7845) {
                var1.method3426((byte) -54);
                var2.method3170(0);
            } else if (var2.field7828 <= class266.field3368) {
                var2.method3167(class591.field8232, 81);
                if (var2.field7845) {
                    var1.method3426((byte) -17);
                } else {
                    class264.method1594(var2, true);
                }
            }
        }
        if (arg0 != 10) {
            method3290(118);
        }
    }

    @OriginalMember(owner = "client!nca", name = "b", descriptor = "(B)V", line = 42)
    public final void method3291(byte arg0) {
        this.field8254 = this.field8256.field447;
        if (arg0 > -2) {
            this.field8254 = -47;
        }
        field8255++;
        this.field8262 = this.field8256.field451;
        this.field8257 = this.field8256.field443;
        if (this.field8256.field440 != null) {
            this.field8256.field440.method1977(this.field8253.field7021, this.field8253.field7022, this.field8253.field7024, class661.field9066);
        }
        this.field8250 = class661.field9066[0];
        this.field8259 = class661.field9066[2];
    }

    @OriginalMember(owner = "client!nca", name = "a", descriptor = "(Low;I)V", line = 64)
    public static final void method3292(class637 arg0, int arg1) {
        if (arg1 != 1) {
            method3292(null, 18);
        }
        class704.field9937 = arg0;
        field8258++;
    }

    @OriginalMember(owner = "client!nca", name = "c", descriptor = "(I)V", line = 75)
    public static void method3293(int arg0) {
        if (arg0 != -18429) {
            field8252 = null;
        }
        field8252 = null;
        field8260 = null;
    }

    @OriginalMember(owner = "client!nca", name = "<init>", descriptor = "(Lmi;Laj;)V", line = 103)
    public class593(class27 arg0, class428 arg1) {
        this.field8256 = arg0;
        this.field8253 = this.field8256.method273(3758);
        this.method3291((byte) -104);
    }
}
