import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mh")
public class class145 implements class466 {

    @OriginalMember(owner = "client!mh", name = "c", descriptor = "I")
    public int field1875;

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "I")
    public static int field1874 = 0;

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "I")
    public static int field1873;

    @OriginalMember(owner = "client!mh", name = "d", descriptor = "I")
    public static int field1876;

    @OriginalMember(owner = "client!mh", name = "e", descriptor = "I")
    public static int field1877;

    @OriginalMember(owner = "client!mh", name = "f", descriptor = "Lha;")
    public static class116 field1878;

    @OriginalMember(owner = "client!mh", name = "g", descriptor = "Ldda;")
    public static class597 field1879;

    @OriginalMember(owner = "client!mh", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field1876++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(II)V")
    public static final void method859(int arg0, int arg1) {
        field1873++;
        class621 var2 = class442.method2691(arg0, 12, true);
        int var3 = 6 / ((-arg1 - 79) / 47);
        var2.method3598(255);
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(IBI)Z")
    public static final boolean method860(int arg0, byte arg1, int arg2) {
        if (arg1 == -102) {
            field1877++;
            return class257.method1623(arg0, 32768, arg2) | (arg2 & 0x800) != 0 || class82.method474(arg2, arg0, (byte) 111);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(I)V")
    public static void method861(int arg0) {
        field1879 = null;
        field1878 = null;
        if (arg0 > -81) {
            field1879 = null;
        }
    }

    @OriginalMember(owner = "client!mh", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
    public class145(String arg0, int arg1) {
        this.field1875 = arg1;
    }
}
