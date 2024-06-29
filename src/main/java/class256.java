import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vea")
public class class256 {

    @OriginalMember(owner = "client!vea", name = "a", descriptor = "Z")
    public static boolean field3280 = false;

    @OriginalMember(owner = "client!vea", name = "b", descriptor = "Ldr;")
    public static class675 field3281 = new class675(40, 6);

    @OriginalMember(owner = "client!vea", name = "f", descriptor = "Ljd;")
    public static class216 field3285 = new class216(1, 2);

    @OriginalMember(owner = "client!vea", name = "g", descriptor = "Lbq;")
    public static class270 field3286 = new class270();

    @OriginalMember(owner = "client!vea", name = "c", descriptor = "I")
    public int field3282;

    @OriginalMember(owner = "client!vea", name = "e", descriptor = "I")
    public static int field3284;

    @OriginalMember(owner = "client!vea", name = "d", descriptor = "Ljava/lang/String;")
    public String field3283;

    @OriginalMember(owner = "client!vea", name = "a", descriptor = "([FIB)[F", line = 4)
    public static final float[] method1533(float[] arg0, int arg1, byte arg2) {
        field3284++;
        if (arg2 < 109) {
            method1534(false);
        }
        float[] var3 = new float[arg1];
        class70.method554(arg0, 0, var3, 0, arg1);
        return var3;
    }

    @OriginalMember(owner = "client!vea", name = "a", descriptor = "(Z)V", line = 22)
    public static void method1534(boolean arg0) {
        field3281 = null;
        if (!arg0) {
            field3286 = null;
            field3285 = null;
        }
    }
}
