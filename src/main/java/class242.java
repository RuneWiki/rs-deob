import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tea")
public class class242 {

    @OriginalMember(owner = "client!tea", name = "b", descriptor = "Z")
    public boolean field3129 = true;

    @OriginalMember(owner = "client!tea", name = "c", descriptor = "Lkg;")
    public static class275 field3130 = new class275(70, 0);

    @OriginalMember(owner = "client!tea", name = "k", descriptor = "C")
    private char field3138;

    @OriginalMember(owner = "client!tea", name = "a", descriptor = "I")
    public static int field3128;

    @OriginalMember(owner = "client!tea", name = "f", descriptor = "I")
    public static int field3133;

    @OriginalMember(owner = "client!tea", name = "g", descriptor = "I")
    public static int field3134;

    @OriginalMember(owner = "client!tea", name = "h", descriptor = "I")
    public static int field3135;

    @OriginalMember(owner = "client!tea", name = "i", descriptor = "I")
    public static int field3136;

    @OriginalMember(owner = "client!tea", name = "j", descriptor = "I")
    public int field3137;

    @OriginalMember(owner = "client!tea", name = "e", descriptor = "Lda;")
    public static class61 field3132;

    @OriginalMember(owner = "client!tea", name = "d", descriptor = "Ljava/lang/String;")
    public String field3131;

    @OriginalMember(owner = "client!tea", name = "a", descriptor = "(I)V")
    public static void method1510(int arg0) {
        field3130 = null;
        field3132 = null;
        if (arg0 != -1) {
            field3130 = null;
        }
    }

    @OriginalMember(owner = "client!tea", name = "a", descriptor = "([ILnd;Lnd;I)V")
    public static final void method1511(int[] arg0, class547 arg1, class547 arg2, int arg3) {
        class596.field8307 = arg2;
        field3133++;
        if (arg0 != null) {
            class628.field8647 = arg0;
        }
        if (arg3 <= -78) {
            class640.field8890 = arg1;
        }
    }

    @OriginalMember(owner = "client!tea", name = "a", descriptor = "(IIIII)V")
    public static final void method1512(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class214.field2822 = arg3;
        class5.field52 = arg1;
        field3134++;
        class38.field589 = arg2;
        if (arg4 != -2) {
            method1512(-115, 19, 67, -12, 63);
        }
        class658.field9167 = arg0;
    }

    @OriginalMember(owner = "client!tea", name = "a", descriptor = "(IILsl;)V")
    private final void method1513(int arg0, int arg1, class461 arg2) {
        if (arg0 <= 51) {
            field3130 = null;
        }
        field3128++;
        if (arg1 == 1) {
            this.field3138 = class534.method3078(255, arg2.method2601(0));
        } else if (arg1 == 2) {
            this.field3137 = arg2.method2622(-539564808);
        } else if (arg1 == 4) {
            this.field3129 = false;
        } else if (arg1 == 5) {
            this.field3131 = arg2.method2574(-1);
            return;
        }
    }

    @OriginalMember(owner = "client!tea", name = "a", descriptor = "(Lsl;B)V")
    public final void method1514(class461 arg0, byte arg1) {
        while (true) {
            int var3 = arg0.method2600((byte) -128);
            if (var3 == 0) {
                field3135++;
                if (arg1 > -55) {
                    this.field3138 = (char) 65533;
                    return;
                }
                return;
            }
            this.method1513(95, var3, arg0);
        }
    }

    @OriginalMember(owner = "client!tea", name = "b", descriptor = "(I)Z")
    public final boolean method1515(int arg0) {
        field3136++;
        if (arg0 != 115) {
            this.field3137 = -80;
        }
        return this.field3138 == 's';
    }
}
