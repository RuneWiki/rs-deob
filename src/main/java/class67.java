import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rba")
public class class67 {

    @OriginalMember(owner = "client!rba", name = "d", descriptor = "Lrba;")
    public static class67 field820 = new class67();

    @OriginalMember(owner = "client!rba", name = "e", descriptor = "Lrba;")
    public static class67 field821 = new class67();

    @OriginalMember(owner = "client!rba", name = "f", descriptor = "Lrba;")
    public static class67 field822 = new class67();

    @OriginalMember(owner = "client!rba", name = "g", descriptor = "Lrba;")
    public static class67 field823 = new class67();

    @OriginalMember(owner = "client!rba", name = "h", descriptor = "[Ljr;")
    public static class480[] field824 = new class480[50];

    @OriginalMember(owner = "client!rba", name = "i", descriptor = "I")
    public static int field825 = 0;

    @OriginalMember(owner = "client!rba", name = "j", descriptor = "Ljb;")
    public static class498 field826 = new class498();

    @OriginalMember(owner = "client!rba", name = "a", descriptor = "I")
    public static int field817;

    @OriginalMember(owner = "client!rba", name = "b", descriptor = "I")
    public static int field818;

    @OriginalMember(owner = "client!rba", name = "c", descriptor = "I")
    public static int field819;

    @OriginalMember(owner = "client!rba", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field817++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!rba", name = "a", descriptor = "(IBI)I")
    public static final int method376(int arg0, byte arg1, int arg2) {
        field818++;
        int var3 = class254.method1538(arg0 - 1, arg2 - 1, (byte) -27) - (-class254.method1538(arg0 - 1, arg2 + 1, (byte) -43) - class254.method1538(arg0 + 1, arg2 + -1, (byte) -91) - class254.method1538(arg0 + 1, arg2 - -1, (byte) -91));
        int var4 = class254.method1538(arg0, arg2 - 1, (byte) -98) + (class254.method1538(arg0, arg2 + 1, (byte) -53) + class254.method1538(arg0 - 1, arg2, (byte) -122) + class254.method1538(arg0 + 1, arg2, (byte) -42));
        if (arg1 != 91) {
            field826 = null;
        }
        int var5 = class254.method1538(arg0, arg2, (byte) -85);
        return var5 / 4 + var3 / 16 + var4 / 8;
    }

    @OriginalMember(owner = "client!rba", name = "a", descriptor = "(BI)V")
    public static final void method377(byte arg0, int arg1) {
        field819++;
        if (arg0 >= -2) {
            method377((byte) -70, -18);
        }
        class256 var2 = class592.method3279((byte) -92, 12, arg1);
        var2.method1546((byte) 111);
    }

    @OriginalMember(owner = "client!rba", name = "a", descriptor = "(I)V")
    public static void method378(int arg0) {
        field826 = null;
        field822 = null;
        field823 = null;
        if (arg0 == 50) {
            field824 = null;
            field820 = null;
            field821 = null;
        }
    }
}
