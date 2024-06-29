import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public class class24 extends class260 {

    @OriginalMember(owner = "client!o", name = "o", descriptor = "I")
    public int field319;

    @OriginalMember(owner = "client!o", name = "m", descriptor = "I")
    public int field317;

    @OriginalMember(owner = "client!o", name = "n", descriptor = "Lkl;")
    public static class55 field318 = new class55(7, 0, 1, 1);

    @OriginalMember(owner = "client!o", name = "k", descriptor = "I")
    public static int field315;

    @OriginalMember(owner = "client!o", name = "p", descriptor = "I")
    public static int field320;

    @OriginalMember(owner = "client!o", name = "l", descriptor = "Lbm;")
    public static class75 field316;

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(Lem;Z)V")
    public static final void method139(class150 arg0, boolean arg1) {
        field320++;
        if (arg1 || !class59.field720) {
            return;
        }
        if (arg0.field2242 != null) {
            class150 var2 = class525.method3121(class214.field2994, class250.field3462, -9140);
            if (var2 != null) {
                class437 var3 = new class437();
                var3.field6390 = arg0;
                var3.field6391 = var2;
                var3.field6389 = arg0.field2242;
                class429.method2537(var3);
            }
        }
        class365.field5350++;
        class491.method2878((byte) 92, class25.field329);
        class481.field7027.method2359(arg0.field2277, -114);
        class481.field7027.method2351(class250.field3462, (byte) -109);
        class481.field7027.method2323(arg0.field2248, 93);
        class481.field7027.method2355(1686288168, class214.field2994);
        class481.field7027.method2323(class11.field171, 63);
        class481.field7027.method2360(32, arg0.field2237);
    }

    @OriginalMember(owner = "client!o", name = "<init>", descriptor = "(II)V")
    public class24(int arg0, int arg1) {
        this.field319 = arg0;
        this.field317 = arg1;
    }

    @OriginalMember(owner = "client!o", name = "c", descriptor = "(I)V")
    public static void method140(int arg0) {
        field318 = null;
        if (arg0 == 21816) {
            field316 = null;
        }
    }
}
