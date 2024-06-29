import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kv")
public class class284 {

    @OriginalMember(owner = "client!kv", name = "b", descriptor = "Z")
    public static boolean field4084 = false;

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "I")
    public static int field4083;

    @OriginalMember(owner = "client!kv", name = "c", descriptor = "I")
    public static int field4085;

    @OriginalMember(owner = "client!kv", name = "d", descriptor = "I")
    public static int field4086;

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(I)V")
    public static final void method1844(int arg0) {
        if (arg0 != 0) {
            field4084 = true;
        }
        field4083++;
        if (class175.field2318 != null) {
            for (int var1 = 0; var1 < class586.field7974; var1++) {
                class175.field2318[var1] = null;
            }
            class175.field2318 = null;
        }
        if (class139.field1881 != null) {
            for (int var2 = 0; var2 < class583.field7922; var2++) {
                class139.field1881[var2] = null;
            }
            class139.field1881 = null;
        }
        if (class135.field1833 != null) {
            for (int var3 = 0; var3 < class282.field4079; var3++) {
                class135.field1833[var3] = null;
            }
            class135.field1833 = null;
        }
        class493.field6934 = -1;
        class151.field2054 = -1;
        class712.field9720 = null;
        class561.field7690 = null;
        class99.field1448 = null;
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(IIIIZ)V")
    public static final void method1845(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field4085++;
        class778 var5 = class389.method2406(120, (long) arg3 | (long) arg1 << 32, 19);
        if (arg4) {
            method1844(-4);
        }
        var5.method4274(116);
        var5.field10692 = arg2;
        var5.field10690 = arg0;
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(Luq;II)Llq;")
    public static final class578 method1846(class172 arg0, int arg1, int arg2) {
        if (arg1 == 0) {
            field4086++;
            byte[] var3 = arg0.method1176(arg2, 82);
            return var3 == null ? null : new class578(var3);
        } else {
            return null;
        }
    }
}
