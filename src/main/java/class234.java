import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!md")
public class class234 {

    @OriginalMember(owner = "client!md", name = "a", descriptor = "I")
    public static int field4083 = 0;

    @OriginalMember(owner = "client!md", name = "g", descriptor = "Lqc;")
    private static class329 field4089 = new class329(64);

    @OriginalMember(owner = "client!md", name = "h", descriptor = "I")
    public static int field4090 = -1;

    @OriginalMember(owner = "client!md", name = "b", descriptor = "I")
    public static int field4084;

    @OriginalMember(owner = "client!md", name = "c", descriptor = "I")
    public static int field4085;

    @OriginalMember(owner = "client!md", name = "d", descriptor = "I")
    public static int field4086;

    @OriginalMember(owner = "client!md", name = "e", descriptor = "I")
    public static int field4087;

    @OriginalMember(owner = "client!md", name = "f", descriptor = "I")
    public static int field4088;

    @OriginalMember(owner = "client!md", name = "a", descriptor = "([IZ[Ljava/lang/Object;)V", line = 7)
    public static final void method1663(int[] arg0, boolean arg1, Object[] arg2) {
        class91.method648(arg1, arg0, arg2, 0, arg0.length - 1);
        field4085++;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(II)V", line = 21)
    public static final void method1664(int arg0, int arg1) {
        field4088++;
        int var2 = 31 % ((arg1 - 33) / 62);
        class164 var3 = (class164) class67.field1038.method507((long) arg0, 602425312);
        if (var3 != null) {
            var3.method961((byte) 118);
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(Lum;B)V", line = 40)
    public static final void method1665(class222 arg0, byte arg1) {
        field4087++;
        class168.field2933 = arg0.method1594(class233.field4043, -62);
        class187.field3141 = arg0.method1594(class209.field3678, -84);
        if (arg1 != -97) {
            field4083 = 33;
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(IZ)Lhe;", line = 53)
    public static final class156 method1666(int arg0, boolean arg1) {
        if (!arg1) {
            method1664(-64, -47);
        }
        field4084++;
        class156 var2 = (class156) field4089.method2250((long) arg0, false);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class55.field884.method1577(5, arg0, -29569);
        class156 var4 = new class156();
        if (var3 != null) {
            var4.method1114((byte) 84, new class153(var3));
        }
        field4089.method2255(var4, (long) arg0, !arg1);
        return var4;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(B)V", line = 83)
    public static void method1667(byte arg0) {
        field4089 = null;
        if (arg0 != 50) {
            method1668(36, -77);
        }
    }

    @OriginalMember(owner = "client!md", name = "b", descriptor = "(II)V", line = 97)
    public static final void method1668(int arg0, int arg1) {
        field4086++;
        if (arg1 != -2) {
            method1663((int[]) null, false, (Object[]) null);
        }
        if (arg0 == 0) {
            return;
        }
        if (arg0 == 1) {
            class229.method1630((byte) 116);
        } else if (arg0 == 2) {
            class40.method315(39);
        } else {
            throw new RuntimeException();
        }
    }
}
