import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nda")
public class class582 extends class154 {

    @OriginalMember(owner = "client!nda", name = "F", descriptor = "Lbu;")
    public static class21 field8218 = new class21(2, 10);

    @OriginalMember(owner = "client!nda", name = "G", descriptor = "[I")
    public static int[] field8219 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!nda", name = "H", descriptor = "Loo;")
    public static class652 field8220 = new class652(128, 4);

    @OriginalMember(owner = "client!nda", name = "M", descriptor = "D")
    public static double field8225;

    @OriginalMember(owner = "client!nda", name = "I", descriptor = "I")
    public static int field8221;

    @OriginalMember(owner = "client!nda", name = "K", descriptor = "I")
    public static int field8223;

    @OriginalMember(owner = "client!nda", name = "L", descriptor = "I")
    public static int field8224;

    @OriginalMember(owner = "client!nda", name = "J", descriptor = "Lji;")
    public static class635 field8222;

    @OriginalMember(owner = "client!nda", name = "a", descriptor = "(IILso;)V", line = 3)
    public static final void method3408(int arg0, int arg1, class494 arg2) {
        ++field8223;
        if (class78.field886 != null) {
            try {
                class78.field886.method3632((byte) 48, 0L);
                class78.field886.method3635(24, arg2.field7050, 16251, arg0);
            } catch (Exception var3) {
            }
        }
        if (arg1 < 58) {
            method3409(false);
        }
    }

    @OriginalMember(owner = "client!nda", name = "a", descriptor = "(IIIB)V", line = 28)
    public final void method1053(int arg0, int arg1, int arg2, byte arg3) {
        ++field8224;
        super.field2181 = arg0;
        if (arg3 == 122) {
            super.field2175 = arg2;
            super.field2191 = arg1;
        }
    }

    @OriginalMember(owner = "client!nda", name = "a", descriptor = "(FI)V", line = 41)
    public final void method1061(float arg0, int arg1) {
        super.field2174 = arg0;
        if (arg1 < 13) {
            this.method1061(1.4404377F, -6);
        }
        ++field8221;
    }

    @OriginalMember(owner = "client!nda", name = "c", descriptor = "(Z)V", line = 56)
    public static void method3409(boolean arg0) {
        field8220 = null;
        field8219 = null;
        if (!arg0) {
            field8218 = null;
        }
        field8218 = null;
        field8222 = null;
    }

    @OriginalMember(owner = "client!nda", name = "<init>", descriptor = "(IIIIIF)V", line = 71)
    public class582(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
    }
}
