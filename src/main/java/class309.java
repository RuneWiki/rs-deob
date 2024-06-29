import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ol")
public class class309 {

    @OriginalMember(owner = "client!ol", name = "c", descriptor = "[Ljava/lang/String;")
    public static String[] field4577 = new String[100];

    @OriginalMember(owner = "client!ol", name = "g", descriptor = "[I")
    public static int[] field4581 = new int[128];

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "I")
    public static int field4575;

    @OriginalMember(owner = "client!ol", name = "d", descriptor = "I")
    public static int field4578;

    @OriginalMember(owner = "client!ol", name = "e", descriptor = "I")
    public static int field4579;

    @OriginalMember(owner = "client!ol", name = "f", descriptor = "I")
    public static int field4580;

    @OriginalMember(owner = "client!ol", name = "b", descriptor = "Lfi;")
    public static class8 field4576;

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(II)V")
    public static final void method2042(int arg0, int arg1) {
        field4578++;
        class387 var2 = (class387) class67.field982.method2826(false, (long) arg1);
        if (var2 != null) {
            for (int var3 = arg0; var3 < var2.field5658.length; var3++) {
                var2.field5658[var3] = -1;
                var2.field5657[var3] = 0;
            }
        }
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(ILir;)V")
    public static final void method2043(int arg0, class185 arg1) {
        if (arg0 != 0) {
            field4576 = null;
        }
        field4580++;
        class129.field1698 = arg1;
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(I)V")
    public static void method2044(int arg0) {
        if (arg0 != 128) {
            method2044(-104);
        }
        field4576 = null;
        field4577 = null;
        field4581 = null;
    }

    @OriginalMember(owner = "client!ol", name = "b", descriptor = "(I)Lss;")
    public static final class394 method2045(int arg0) {
        field4575++;
        if (arg0 != 0) {
            method2045(117);
        }
        try {
            return (class394) Class.forName("un").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }
}
