import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tm")
public class class220 {

    @OriginalMember(owner = "client!tm", name = "d", descriptor = "I")
    public int field3017;

    @OriginalMember(owner = "client!tm", name = "c", descriptor = "[I")
    public int[] field3016;

    @OriginalMember(owner = "client!tm", name = "b", descriptor = "[I")
    public int[] field3015;

    @OriginalMember(owner = "client!tm", name = "g", descriptor = "I")
    public static int field3020 = 0;

    @OriginalMember(owner = "client!tm", name = "f", descriptor = "Z")
    public static boolean field3019 = false;

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "I")
    public static int field3014;

    @OriginalMember(owner = "client!tm", name = "e", descriptor = "Lra;")
    public static class57 field3018;

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(B)V")
    public static void method1436(byte arg0) {
        field3018 = null;
        if (arg0 != -85) {
            method1436((byte) -91);
        }
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(I)V")
    public static final void method1437(int arg0) {
        field3014++;
        if (arg0 != -175) {
            field3018 = null;
        }
        class428.field6220.method2043(-42);
    }

    @OriginalMember(owner = "client!tm", name = "<init>", descriptor = "(I)V")
    public class220(int arg0) {
        this.field3017 = arg0;
        this.field3016 = new int[this.field3017];
        this.field3015 = new int[this.field3017];
    }
}
