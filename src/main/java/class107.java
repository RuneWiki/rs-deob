import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public abstract class class107 {

    @OriginalMember(owner = "client!lb", name = "d", descriptor = "[[B")
    public static byte[][] field1936 = new byte[50][];

    @OriginalMember(owner = "client!lb", name = "h", descriptor = "[[I")
    public static int[][] field1940 = new int[104][104];

    @OriginalMember(owner = "client!lb", name = "j", descriptor = "I")
    public static int field1942 = 500;

    @OriginalMember(owner = "client!lb", name = "i", descriptor = "Z")
    public static boolean field1941 = false;

    @OriginalMember(owner = "client!lb", name = "g", descriptor = "Ltg;")
    private static class184 field1939 = class135.method812("New User", 3);

    @OriginalMember(owner = "client!lb", name = "f", descriptor = "Ltg;")
    public static class184 field1938 = field1939;

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "I")
    public static int field1933;

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "I")
    public int field1934;

    @OriginalMember(owner = "client!lb", name = "c", descriptor = "I")
    public static int field1935;

    @OriginalMember(owner = "client!lb", name = "e", descriptor = "I")
    public static int field1937;

    @OriginalMember(owner = "client!lb", name = "k", descriptor = "I")
    public int field1943;

    @OriginalMember(owner = "client!lb", name = "l", descriptor = "Llg;")
    public static class112 field1944;

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(I)V")
    public static void method663(int arg0) {
        field1938 = null;
        field1944 = null;
        field1940 = null;
        field1936 = null;
        field1939 = null;
        if (arg0 > -68) {
            field1937 = -46;
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(III)V")
    public abstract void method664(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(IIZ)V")
    public abstract void method665(int arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(Lrh;I)Lrh;")
    public static final class167 method666(class167 arg0, int arg1) {
        field1933++;
        if (arg1 != -950) {
            field1939 = null;
        }
        int var2 = class44.method258(class188.method1191((byte) -82, arg0), 2165);
        if (var2 == 0) {
            return null;
        }
        for (int var3 = 0; var3 < var2; var3++) {
            arg0 = class44.method255(arg0.field3001, 10583);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(BII)V")
    public abstract void method667(byte arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "(I)V")
    public static final void method668(int arg0) {
        field1935++;
        class149.field2675.method770(false);
        if (arg0 != 104) {
            field1941 = true;
        }
        class195.field3783.method770(false);
    }
}
