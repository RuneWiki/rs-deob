import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hh")
public class class48 extends class275 {

    @OriginalMember(owner = "client!hh", name = "n", descriptor = "[I")
    public static int[] field670 = new int[2048];

    @OriginalMember(owner = "client!hh", name = "k", descriptor = "I")
    public static int field667 = -1;

    @OriginalMember(owner = "client!hh", name = "p", descriptor = "Ljava/lang/String;")
    public static String field672 = "red:";

    @OriginalMember(owner = "client!hh", name = "q", descriptor = "I")
    public static int field673 = -1;

    @OriginalMember(owner = "client!hh", name = "j", descriptor = "I")
    public static int field666;

    @OriginalMember(owner = "client!hh", name = "l", descriptor = "I")
    public static int field668;

    @OriginalMember(owner = "client!hh", name = "o", descriptor = "I")
    public static int field671;

    @OriginalMember(owner = "client!hh", name = "m", descriptor = "Lmh;")
    public static class263 field669;

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(IZ)V")
    public static final void method294(int arg0, boolean arg1) {
        field666++;
        if (class171.field2583 != arg1) {
            class171.field2583 = arg1;
            if (arg0 == -1) {
                class21.method145((byte) 10);
            }
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(I)V")
    public static void method295(int arg0) {
        field670 = null;
        field672 = null;
        field669 = null;
        if (arg0 != 12701) {
            field672 = null;
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(BIIZIII)V")
    public static final void method296(byte arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6) {
        field668++;
        class267.field4258 = arg1;
        class212.field3129 = arg6;
        class20.field220 = arg4;
        class224.field3296 = arg5;
        class299.field4827 = arg2;
        if (arg3 && class224.field3296 >= 100) {
            class93.field1533 = class20.field220 * 128 + 64;
            class260.field4024 = class299.field4827 * 128 + 64;
            class226.field3324 = class113.method851(class37.field474, 112, class260.field4024, class93.field1533) - class267.field4258;
        }
        if (arg0 != -47) {
            field669 = null;
        }
        class119.field1931 = 2;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(ZI)Lec;")
    public static final class93 method297(boolean arg0, int arg1) {
        class93 var2 = (class93) class195.field2878.method1418((long) arg1, 0);
        field671++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class1.field19.method1868(class99.method779(arg1, 14), class103.method808(arg1, -14477), 1);
        class93 var4 = new class93();
        var4.field1505 = arg1;
        if (arg0) {
            method297(false, -9);
        }
        if (var3 != null) {
            var4.method704((byte) -66, new class53(var3));
        }
        var4.method711(!arg0);
        if (!class7.field73 && var4.field1556) {
            var4.field1532 = null;
        }
        if (var4.field1537) {
            var4.field1574 = 0;
            var4.field1538 = false;
        }
        class195.field2878.method1421((long) arg1, var4, (byte) 55);
        return var4;
    }
}
