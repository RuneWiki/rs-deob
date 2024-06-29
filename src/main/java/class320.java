import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qh")
public class class320 {

    @OriginalMember(owner = "client!qh", name = "c", descriptor = "Ljava/lang/String;")
    public String field3940;

    @OriginalMember(owner = "client!qh", name = "f", descriptor = "I")
    public int field3943;

    @OriginalMember(owner = "client!qh", name = "b", descriptor = "[I")
    public static int[] field3939 = new int[13];

    @OriginalMember(owner = "client!qh", name = "e", descriptor = "Lsb;")
    public static class305 field3942 = new class305(69, 3);

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "I")
    public static int field3938;

    @OriginalMember(owner = "client!qh", name = "d", descriptor = "I")
    public static int field3941;

    @OriginalMember(owner = "client!qh", name = "g", descriptor = "Lf;")
    public static class534 field3944;

    @OriginalMember(owner = "client!qh", name = "toString", descriptor = "()Ljava/lang/String;", line = 5)
    public final String toString() {
        field3938++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(I)V", line = 17)
    public static void method1820(int arg0) {
        if (arg0 < 22) {
            method1820(0);
        }
        field3944 = null;
        field3942 = null;
        field3939 = null;
    }

    @OriginalMember(owner = "client!qh", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 36)
    public class320(String arg0, int arg1) {
        this.field3940 = arg0;
        this.field3943 = arg1;
    }
}
