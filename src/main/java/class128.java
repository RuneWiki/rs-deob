import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!q")
public abstract class class128 {

    @OriginalMember(owner = "client!q", name = "a", descriptor = "[Ljava/lang/String;")
    public static String[] field1917 = new String[200];

    @OriginalMember(owner = "client!q", name = "d", descriptor = "I")
    public static int field1920 = 0;

    @OriginalMember(owner = "client!q", name = "e", descriptor = "I")
    public static volatile int field1921 = 0;

    @OriginalMember(owner = "client!q", name = "b", descriptor = "I")
    public static int field1918;

    @OriginalMember(owner = "client!q", name = "c", descriptor = "I")
    public static int field1919;

    @OriginalMember(owner = "client!q", name = "f", descriptor = "I")
    public static int field1922;

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(III)V")
    public static final void method802(int arg0, int arg1, int arg2) {
        field1919++;
        if (arg2 != 0) {
            field1922 = -48;
        }
        class187 var3 = class120.method762((byte) -97, 13, arg1);
        var3.method1167(-119);
        var3.field2844 = arg0;
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(II)I")
    public static final int method803(int arg0, int arg1) {
        field1918++;
        if (arg0 != -333071897) {
            method804(-4);
        }
        return arg1 >>> 7;
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(I)V")
    public static void method804(int arg0) {
        if (arg0 == 1419152076) {
            field1917 = null;
        }
    }
}
