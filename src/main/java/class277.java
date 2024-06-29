import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wi")
public abstract class class277 {

    @OriginalMember(owner = "client!wi", name = "e", descriptor = "Ljava/lang/String;")
    public static String field4381 = "glow3:";

    @OriginalMember(owner = "client!wi", name = "h", descriptor = "Ljava/lang/String;")
    public static String field4384 = "flash2:";

    @OriginalMember(owner = "client!wi", name = "f", descriptor = "F")
    public static float field4382;

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "I")
    public static int field4378;

    @OriginalMember(owner = "client!wi", name = "c", descriptor = "I")
    public static int field4379;

    @OriginalMember(owner = "client!wi", name = "g", descriptor = "I")
    public static int field4383;

    @OriginalMember(owner = "client!wi", name = "d", descriptor = "J")
    public static long field4380;

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "Lkb;")
    public static class39 field4377;

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "(BI)Z", line = 21)
    public static final boolean method1972(byte arg0, int arg1) {
        field4383++;
        if (arg1 >= 0 && class231.field3700.length > arg1) {
            int var2 = -50 / ((arg0 + 20) / 63);
            return class231.field3700[arg1];
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "(I)V", line = 38)
    public static void method1973(int arg0) {
        if (arg0 != -1) {
            method1972((byte) 126, -50);
        }
        field4381 = null;
        field4384 = null;
        field4377 = null;
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(I)Lwf;")
    public abstract class64 method1182(int arg0);

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(BI)I")
    public abstract int method1188(byte arg0, int arg1);

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(II)[B")
    public abstract byte[] method1189(int arg0, int arg1);

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "(II)V")
    public abstract void method1184(int arg0, int arg1);
}
