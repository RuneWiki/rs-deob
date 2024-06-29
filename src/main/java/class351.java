import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cs")
public class class351 {

    @OriginalMember(owner = "client!cs", name = "g", descriptor = "I")
    private int field4803;

    @OriginalMember(owner = "client!cs", name = "d", descriptor = "Z")
    public static boolean field4800 = false;

    @OriginalMember(owner = "client!cs", name = "c", descriptor = "[B")
    public static byte[] field4799 = new byte[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

    @OriginalMember(owner = "client!cs", name = "h", descriptor = "I")
    public static int field4804 = 0;

    @OriginalMember(owner = "client!cs", name = "b", descriptor = "I")
    public static int field4798;

    @OriginalMember(owner = "client!cs", name = "e", descriptor = "I")
    public static int field4801;

    @OriginalMember(owner = "client!cs", name = "f", descriptor = "I")
    public static int field4802;

    @OriginalMember(owner = "client!cs", name = "i", descriptor = "Lfc;")
    public static class343 field4805;

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "[Lmh;")
    public static class217[] field4797;

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(B)V")
    public static void method2098(byte arg0) {
        int var1 = -9 % ((arg0 + 30) / 40);
        field4799 = null;
        field4797 = null;
        field4805 = null;
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(I)I")
    public final int method2099(int arg0) {
        if (arg0 > -16) {
            return 20;
        } else {
            field4801++;
            return this.field4803;
        }
    }

    @OriginalMember(owner = "client!cs", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field4798++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!cs", name = "<init>", descriptor = "(II)V")
    public class351(int arg0, int arg1) {
        this.field4803 = arg0;
    }
}
