import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gb")
public class class115 extends class418 {

    @OriginalMember(owner = "client!gb", name = "l", descriptor = "I")
    public int field1498;

    @OriginalMember(owner = "client!gb", name = "m", descriptor = "I")
    public int field1499;

    @OriginalMember(owner = "client!gb", name = "n", descriptor = "Ljava/lang/String;")
    public static String field1500 = "Loading textures - ";

    @OriginalMember(owner = "client!gb", name = "o", descriptor = "I")
    public static int field1501;

    @OriginalMember(owner = "client!gb", name = "p", descriptor = "I")
    public static int field1502;

    @OriginalMember(owner = "client!gb", name = "k", descriptor = "Lir;")
    public static class185 field1497;

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(Lir;ILir;Lir;)V", line = 13)
    public static final void method846(class185 arg0, int arg1, class185 arg2, class185 arg3) {
        class78.field1096 = arg2;
        field1501++;
        class249.method1637(false, arg3, arg0);
        if (arg1 != 128) {
            method846((class185) null, -18, (class185) null, (class185) null);
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(B)V", line = 26)
    public static void method847(byte arg0) {
        if (arg0 < 34) {
            method847((byte) -109);
        }
        field1500 = null;
        field1497 = null;
    }

    @OriginalMember(owner = "client!gb", name = "<init>", descriptor = "(II)V", line = 39)
    public class115(int arg0, int arg1) {
        this.field1498 = arg1;
        this.field1499 = arg0;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIII)Z", line = 51)
    public static final boolean method848(int arg0, int arg1, int arg2, int arg3) {
        if (class28.method234(arg0, arg1, arg2)) {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            return class27.method229(var4 + 1, class266.field3950[arg0].method722(arg1, arg2) + arg3, var5 + 1) && class27.method229(var4 + 128 - 1, class266.field3950[arg0].method722(arg1 + 1, arg2) + arg3, var5 + 1) && class27.method229(var4 + 128 - 1, class266.field3950[arg0].method722(arg1 + 1, arg2 + 1) + arg3, var5 + 128 - 1) && class27.method229(var4 + 1, class266.field3950[arg0].method722(arg1, arg2 + 1) + arg3, var5 + 128 - 1);
        } else {
            return false;
        }
    }
}
