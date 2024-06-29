import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vq")
public class class452 {

    @OriginalMember(owner = "client!vq", name = "g", descriptor = "Z")
    public boolean field5893;

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "I")
    public static int field5887;

    @OriginalMember(owner = "client!vq", name = "b", descriptor = "I")
    public static int field5888;

    @OriginalMember(owner = "client!vq", name = "f", descriptor = "I")
    public static int field5892;

    @OriginalMember(owner = "client!vq", name = "e", descriptor = "Lcu;")
    public class269 field5891;

    @OriginalMember(owner = "client!vq", name = "h", descriptor = "Lcu;")
    public class269 field5894;

    @OriginalMember(owner = "client!vq", name = "c", descriptor = "Z")
    public boolean field5889;

    @OriginalMember(owner = "client!vq", name = "d", descriptor = "[I")
    public static int[] field5890;

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(I)V")
    public static void method2549(int arg0) {
        field5890 = null;
        if (arg0 >= -110) {
            method2552(false, 45, (byte) -63, -29);
        }
    }

    @OriginalMember(owner = "client!vq", name = "b", descriptor = "(I)V")
    public final void method2550(int arg0) {
        if (this.field5891 != null) {
            this.field5891.method645(-89);
        }
        field5892++;
        this.field5889 = false;
        int var2 = 88 / ((38 - arg0) / 63);
    }

    @OriginalMember(owner = "client!vq", name = "c", descriptor = "(I)Z")
    public final boolean method2551(int arg0) {
        field5888++;
        if (arg0 >= -114) {
            this.field5894 = null;
        }
        return this.field5889 && !this.field5893;
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(ZIBI)V")
    public static final void method2552(boolean arg0, int arg1, byte arg2, int arg3) {
        field5887++;
        if (arg1 < 8000 || arg1 > 48000) {
            throw new IllegalArgumentException();
        }
        class669.field9289 = arg0;
        class66.field901 = arg1;
        class513.field6719 = arg3;
        if (arg2 <= 91) {
            method2549(-94);
        }
    }

    @OriginalMember(owner = "client!vq", name = "<init>", descriptor = "(Z)V")
    public class452(boolean arg0) {
        this.field5893 = arg0;
    }
}
