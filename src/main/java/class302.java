import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uu")
public class class302 {

    @OriginalMember(owner = "client!uu", name = "c", descriptor = "I")
    public static int field4238 = -1;

    @OriginalMember(owner = "client!uu", name = "b", descriptor = "Ljb;")
    public static class519 field4237 = new class519(115, 0);

    @OriginalMember(owner = "client!uu", name = "f", descriptor = "I")
    public static int field4241 = 0;

    @OriginalMember(owner = "client!uu", name = "g", descriptor = "I")
    public static int field4242 = -1;

    @OriginalMember(owner = "client!uu", name = "h", descriptor = "Ljea;")
    public static class474 field4243 = new class474(12, 19);

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "I")
    public static int field4236;

    @OriginalMember(owner = "client!uu", name = "d", descriptor = "I")
    public static int field4239;

    @OriginalMember(owner = "client!uu", name = "e", descriptor = "I")
    public static int field4240;

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(I)V")
    public static void method1950(int arg0) {
        if (arg0 == -66) {
            field4237 = null;
            field4243 = null;
        }
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(B)V")
    public static final void method1951(byte arg0) {
        field4239++;
        if (class171.field2240 != null) {
            for (int var1 = 0; var1 < class171.field2240.length; var1++) {
                for (int var2 = 0; var2 < class171.field2240[var1].length; var2++) {
                    class171.field2240[var1][var2] = class753.field10201;
                }
            }
        }
        if (arg0 != -48) {
            field4240 = 27;
        }
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(ZBI)V")
    public static final void method1952(boolean arg0, byte arg1, int arg2) {
        field4236++;
        class358 var3 = class559.method3192(arg2, arg0, Integer.MIN_VALUE);
        if (var3 == null) {
            return;
        }
        if (arg1 < 61) {
            field4242 = 12;
        }
        for (int var4 = 0; var4 < var3.field5210.length; var4++) {
            var3.field5210[var4] = -1;
            var3.field5213[var4] = 0;
        }
    }
}
