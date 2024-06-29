import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fg")
public class class298 {

    @OriginalMember(owner = "client!fg", name = "d", descriptor = "I")
    public int field4683;

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "Lru;")
    public static class177 field4680 = new class177(16);

    @OriginalMember(owner = "client!fg", name = "g", descriptor = "Z")
    public static boolean field4686 = false;

    @OriginalMember(owner = "client!fg", name = "h", descriptor = "I")
    public static int field4687 = -1;

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "I")
    public static int field4681;

    @OriginalMember(owner = "client!fg", name = "c", descriptor = "I")
    public static int field4682;

    @OriginalMember(owner = "client!fg", name = "e", descriptor = "I")
    public static int field4684;

    @OriginalMember(owner = "client!fg", name = "i", descriptor = "I")
    public static int field4688;

    @OriginalMember(owner = "client!fg", name = "f", descriptor = "[[[I")
    public static int[][][] field4685;

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(BIII)V")
    public static final void method1997(byte arg0, int arg1, int arg2, int arg3) {
        field4684++;
        if (arg0 >= 81) {
            class456 var4 = class233.method1654(arg3, 11, 126);
            var4.method2858(10250);
            var4.field7042 = arg2;
            var4.field7041 = arg1;
        }
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(B)V")
    public static void method1998(byte arg0) {
        int var1 = -101 % ((arg0 - 9) / 57);
        field4680 = null;
        field4685 = null;
    }

    @OriginalMember(owner = "client!fg", name = "<init>", descriptor = "(II)V")
    public class298(int arg0, int arg1) {
        this.field4683 = arg0;
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(Z)V")
    public static final void method1999(boolean arg0) {
        field4682++;
        if (!arg0) {
            method1999(true);
        }
        class476.field7287 = null;
        class532.method3161(class509.field7597, 0, class489.field7400, -1, 0, class219.field3715, 0, -1, 0);
        if (class476.field7287 != null) {
            class302.method2031(0, 0, class219.field3715, class476.field7287, class326.field5117.field6646, 0, class94.field1371, -1412584499, class371.field5704, class489.field7400);
            class476.field7287 = null;
        }
    }

    @OriginalMember(owner = "client!fg", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field4681++;
        throw new IllegalStateException();
    }
}
