import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ja")
public abstract class class114 {

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "Lce;")
    public static class126 field1933 = class206.method1445(-7923, "Lade Benutzeroberfl-=che )2 ");

    @OriginalMember(owner = "client!ja", name = "c", descriptor = "Lce;")
    public static class126 field1934 = class206.method1445(-7923, "<col=80ff00>");

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "I")
    public static int field1932;

    @OriginalMember(owner = "client!ja", name = "d", descriptor = "I")
    public static int field1935;

    @OriginalMember(owner = "client!ja", name = "e", descriptor = "I")
    public static int field1936;

    @OriginalMember(owner = "client!ja", name = "f", descriptor = "I")
    public static int field1937;

    @OriginalMember(owner = "client!ja", name = "g", descriptor = "I")
    public static int field1938;

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(Lja;IIIZ)V", line = 9)
    public void method437(class114 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field1937++;
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "()Z", line = 25)
    public boolean method449() {
        field1936++;
        return false;
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(III)Lja;", line = 33)
    public class114 method431(int arg0, int arg1, int arg2) {
        field1935++;
        return this;
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(IIILcc;)Lie;", line = 49)
    public static final class2 method753(int arg0, int arg1, int arg2, class313 arg3) {
        if (arg1 != 2) {
            method755(-35);
        }
        field1938++;
        return class298.method2012(arg0, (byte) -110, arg3, arg2) ? class98.method662(-91) : null;
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(I)V", line = 75)
    public static void method754(int arg0) {
        field1933 = null;
        field1934 = null;
        if (arg0 < 74) {
            method753(-28, -44, 4, (class313) null);
        }
    }

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "(I)I", line = 94)
    public static final int method755(int arg0) {
        if (arg0 != 2) {
            return 13;
        }
        field1932++;
        if (class124.field2097) {
            return 0;
        } else if (class22.method109(arg0 ^ 0x1002)) {
            return class301.field5016 ? 2 : 1;
        } else {
            return 1;
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(IIIIIIIIJILqj;)V")
    public abstract void method241(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class211 arg10);

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "()I")
    public abstract int method225();

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(IIIII)V")
    public abstract void method407(int arg0, int arg1, int arg2, int arg3, int arg4);
}
