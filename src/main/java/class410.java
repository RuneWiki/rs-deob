import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wl")
public class class410 {

    @OriginalMember(owner = "client!wl", name = "c", descriptor = "J")
    public static long field6172 = (long) (Math.random() * 9.999999999E9D);

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "I")
    public static int field6170;

    @OriginalMember(owner = "client!wl", name = "b", descriptor = "I")
    public static int field6171;

    @OriginalMember(owner = "client!wl", name = "d", descriptor = "I")
    public static int field6173;

    @OriginalMember(owner = "client!wl", name = "f", descriptor = "I")
    public static int field6175;

    @OriginalMember(owner = "client!wl", name = "e", descriptor = "Z")
    public static boolean field6174;

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(IIIII)V")
    public static final void method2603(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 != -9563) {
            field6172 = 122L;
        }
        field6171++;
        if (arg0 >= class166.field2622 && arg0 <= class432.field6446) {
            int var5 = class462.method2818(class391.field5895, class497.field7073, arg3, arg1 ^ 0xFFFFFA10);
            int var6 = class462.method2818(class391.field5895, class497.field7073, arg2, 8373);
            class103.method785(arg0, var5, var6, true, arg4);
        }
    }

    @OriginalMember(owner = "client!wl", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field6173++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(Lbh;B)Z")
    public static final boolean method2604(class37 arg0, byte arg1) {
        if (arg1 != 67) {
            field6174 = false;
        }
        field6170++;
        return class611.field8636 == arg0 || class499.field7095 == arg0 || class370.field5322 == arg0 || class730.field10230 == arg0;
    }
}
