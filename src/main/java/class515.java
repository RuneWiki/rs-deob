import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!np")
public class class515 implements class560 {

    @OriginalMember(owner = "client!np", name = "b", descriptor = "I")
    public int field7281;

    @OriginalMember(owner = "client!np", name = "f", descriptor = "[F")
    public float[] field7285;

    @OriginalMember(owner = "client!np", name = "c", descriptor = "I")
    public int field7282;

    @OriginalMember(owner = "client!np", name = "g", descriptor = "Lfba;")
    public static class27 field7286 = new class27(2, 11);

    @OriginalMember(owner = "client!np", name = "a", descriptor = "I")
    public static int field7280;

    @OriginalMember(owner = "client!np", name = "d", descriptor = "I")
    public static int field7283;

    @OriginalMember(owner = "client!np", name = "e", descriptor = "I")
    public static int field7284;

    @OriginalMember(owner = "client!np", name = "h", descriptor = "I")
    public static int field7287;

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(IIIII)V", line = 5)
    public static final void method3104(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field7280++;
        if (arg3 <= arg2) {
            for (int var5 = arg3; var5 < arg2; var5++) {
                class746.field10330[var5][arg4] = arg0;
            }
        } else {
            for (int var6 = arg2; var6 < arg3; var6++) {
                class746.field10330[var6][arg4] = arg0;
            }
        }
        if (arg1 >= -125) {
            method3104(-97, -19, -19, 53, -6);
        }
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(I)V", line = 42)
    public static void method3105(int arg0) {
        if (arg0 != 1873296578) {
            field7287 = -114;
        }
        field7286 = null;
    }

    @OriginalMember(owner = "client!np", name = "b", descriptor = "(I)V", line = 52)
    public static final void method3106(int arg0) {
        class274.field3951.method515(((float) class21.field353.field10074.method315(-84) * 0.1F + 0.7F) * class650.field9076);
        field7283++;
        class274.field3951.method469(class603.field8445, class439.field5915, class277.field4036, (float) (class494.field7033 << 2), (float) (class139.field2075 << 2), (float) (class710.field9869 << 2));
        class274.field3951.method464(class720.field9970);
        if (arg0 != -31699) {
            method3105(98);
        }
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "()V", line = 67)
    public static final void method3107() {
        class631.method3616(1, class562.field7990);
    }

    @OriginalMember(owner = "client!np", name = "c", descriptor = "(I)V", line = 71)
    public static final void method3108(int arg0) {
        field7284++;
        if (arg0 != 21704) {
            field7287 = 64;
        }
        class524.field7398 = -1;
        class779.field10693 = null;
    }

    @OriginalMember(owner = "client!np", name = "<init>", descriptor = "(II)V", line = 82)
    public class515(int arg0, int arg1) {
        this.field7281 = arg1;
        this.field7285 = new float[arg0 * arg1];
        this.field7282 = arg0;
    }
}
