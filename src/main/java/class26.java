import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qaa")
public class class26 {

    @OriginalMember(owner = "client!qaa", name = "b", descriptor = "I")
    public static int field336 = 0;

    @OriginalMember(owner = "client!qaa", name = "f", descriptor = "Luc;")
    public static class27 field340 = new class27(10, 3);

    @OriginalMember(owner = "client!qaa", name = "a", descriptor = "I")
    public static int field335;

    @OriginalMember(owner = "client!qaa", name = "c", descriptor = "I")
    public static int field337;

    @OriginalMember(owner = "client!qaa", name = "d", descriptor = "I")
    public static int field338;

    @OriginalMember(owner = "client!qaa", name = "e", descriptor = "I")
    public static int field339;

    @OriginalMember(owner = "client!qaa", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field337++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!qaa", name = "a", descriptor = "(B)Z")
    public static final boolean method121(byte arg0) {
        field335++;
        if (arg0 > -104) {
            field336 = -19;
        }
        return class307.method1881("jaclib", false) ? class307.method1881("hw3d", false) : false;
    }

    @OriginalMember(owner = "client!qaa", name = "a", descriptor = "(I[FZ)[F")
    public static final float[] method122(int arg0, float[] arg1, boolean arg2) {
        if (arg2) {
            return null;
        } else {
            field338++;
            float[] var3 = new float[arg0];
            class282.method1707(arg1, 0, var3, 0, arg0);
            return var3;
        }
    }

    @OriginalMember(owner = "client!qaa", name = "a", descriptor = "(I)V")
    public static void method123(int arg0) {
        field340 = null;
        if (arg0 != 0) {
            method122(-74, null, false);
        }
    }
}
