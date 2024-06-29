import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uf")
public abstract class class184 {

    @OriginalMember(owner = "client!uf", name = "d", descriptor = "[I")
    public static int[] field2888 = new int[14];

    @OriginalMember(owner = "client!uf", name = "i", descriptor = "Ljava/lang/String;")
    public static String field2893 = "K";

    @OriginalMember(owner = "client!uf", name = "g", descriptor = "Ll;")
    public static class66 field2891 = new class66(100);

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "I")
    public static int field2885;

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "I")
    public static int field2886;

    @OriginalMember(owner = "client!uf", name = "c", descriptor = "I")
    public static int field2887;

    @OriginalMember(owner = "client!uf", name = "f", descriptor = "I")
    public static int field2890;

    @OriginalMember(owner = "client!uf", name = "h", descriptor = "I")
    public static int field2892;

    @OriginalMember(owner = "client!uf", name = "e", descriptor = "Lrn;")
    public static class18 field2889;

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(I)V", line = 5)
    public static final void method1420(int arg0) {
        field2887++;
        class203.field3133.method656(0);
        if (arg0 != 100) {
            method1423((byte) -74);
        }
    }

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "(I)V", line = 19)
    public static void method1421(int arg0) {
        field2893 = null;
        field2888 = null;
        field2889 = null;
        if (arg0 == -23032) {
            field2891 = null;
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(IIBLrn;)[Lqi;", line = 34)
    public static final class246[] method1422(int arg0, int arg1, byte arg2, class18 arg3) {
        if (arg2 != -53) {
            field2888 = (int[]) null;
        }
        field2886++;
        return class282.method2056(arg1, 0, arg3, arg0) ? class260.method1908((byte) -100) : null;
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(B)V", line = 50)
    public static final void method1423(byte arg0) {
        field2890++;
        if (class186.field2932 > 0) {
            class197.method1493(109);
            return;
        }
        class238.field3689 = class188.field2950;
        class188.field2950 = null;
        if (arg0 <= 108) {
            method1424(-101);
        }
        class175.method1370(40, (byte) -83);
    }

    @OriginalMember(owner = "client!uf", name = "c", descriptor = "(I)V", line = 76)
    public static final void method1424(int arg0) {
        field2885++;
        if (arg0 != 0) {
            field2889 = (class18) null;
        }
        class203.field3133.method655(-1);
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(ZLkf;)Lkf;")
    public abstract class174 method319(boolean arg0, class174 arg1);
}
