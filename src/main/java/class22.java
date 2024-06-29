import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ir")
public abstract class class22 {

    @OriginalMember(owner = "client!ir", name = "e", descriptor = "F")
    public static float field279 = 1.0F;

    @OriginalMember(owner = "client!ir", name = "d", descriptor = "[F")
    public static float[] field278 = new float[4];

    @OriginalMember(owner = "client!ir", name = "f", descriptor = "I")
    public static int field280 = 0;

    @OriginalMember(owner = "client!ir", name = "h", descriptor = "Z")
    public static boolean field282 = false;

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "I")
    public static int field275;

    @OriginalMember(owner = "client!ir", name = "b", descriptor = "I")
    public static int field276;

    @OriginalMember(owner = "client!ir", name = "c", descriptor = "I")
    public static int field277;

    @OriginalMember(owner = "client!ir", name = "g", descriptor = "Lvq;")
    public static class307 field281;

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(B)V", line = 9)
    public static void method110(byte arg0) {
        if (arg0 >= 67) {
            field278 = null;
            field281 = null;
        }
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(Z)V", line = 34)
    public static final void method113(boolean arg0) {
        field276++;
        if (class359.field5318 != null) {
            class359.field5318.method1974(-25261);
            class359.field5318 = null;
            class401.field5845 = null;
        }
        if (arg0) {
            field282 = true;
        }
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(I)I", line = 58)
    public static final int method114(int arg0) {
        field275++;
        if (arg0 > -89) {
            method113(true);
        }
        return class456.field7000;
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(ZII)[B")
    public abstract byte[] method111(boolean arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(I[B)V")
    public abstract void method112(int arg0, byte[] arg1);

    @OriginalMember(owner = "client!ir", name = "b", descriptor = "(I)[B")
    public abstract byte[] method115(int arg0);
}
