import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ph")
public class class293 extends class341 {

    @OriginalMember(owner = "client!ph", name = "f", descriptor = "S")
    public static short field4537 = 205;

    @OriginalMember(owner = "client!ph", name = "j", descriptor = "I")
    public static int field4541 = 0;

    @OriginalMember(owner = "client!ph", name = "k", descriptor = "Ljava/lang/String;")
    public static String field4542 = "Prepared sound engine";

    @OriginalMember(owner = "client!ph", name = "e", descriptor = "I")
    public static int field4536;

    @OriginalMember(owner = "client!ph", name = "h", descriptor = "I")
    public static int field4539;

    @OriginalMember(owner = "client!ph", name = "g", descriptor = "Z")
    public static boolean field4538;

    @OriginalMember(owner = "client!ph", name = "i", descriptor = "[[B")
    public static byte[][] field4540;

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(II)V", line = 4)
    public static final void method2042(int arg0, int arg1) {
        if (arg0 != 0) {
            return;
        }
        field4539++;
        if (class72.field1002 == arg1 && arg1 != 0) {
            class173 var2 = class327.field5130[arg1];
            var2.method353(class81.field1117);
        }
    }

    @OriginalMember(owner = "client!ph", name = "d", descriptor = "(I)V", line = 48)
    public static void method2043(int arg0) {
        if (arg0 != 205) {
            field4542 = (String) null;
        }
        field4540 = (byte[][]) null;
        field4542 = null;
    }
}
