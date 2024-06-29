import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hm")
public abstract class class330 {

    @OriginalMember(owner = "client!hm", name = "h", descriptor = "[I")
    public static int[] field4504 = new int[50];

    @OriginalMember(owner = "client!hm", name = "d", descriptor = "I")
    public static int field4500 = 127;

    @OriginalMember(owner = "client!hm", name = "j", descriptor = "[Ls;")
    public static class141[] field4506 = new class141[29];

    @OriginalMember(owner = "client!hm", name = "f", descriptor = "I")
    public static int field4502 = 1;

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "I")
    public static int field4497;

    @OriginalMember(owner = "client!hm", name = "c", descriptor = "I")
    public static int field4499;

    @OriginalMember(owner = "client!hm", name = "e", descriptor = "I")
    public static int field4501;

    @OriginalMember(owner = "client!hm", name = "g", descriptor = "I")
    public static int field4503;

    @OriginalMember(owner = "client!hm", name = "i", descriptor = "Ljava/lang/String;")
    public static String field4505;

    @OriginalMember(owner = "client!hm", name = "b", descriptor = "[[I")
    public static int[][] field4498;

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(I)V")
    public static void method2122(int arg0) {
        field4504 = null;
        field4498 = null;
        if (arg0 == 0) {
            field4506 = null;
            field4505 = null;
        }
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(BI)I")
    public abstract int method1985(byte arg0, int arg1);

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(II)Lsg;")
    public static final class280 method2123(int arg0, int arg1) {
        field4503++;
        class280 var2 = (class280) class183.field2122.method2295((long) arg1, (byte) 74);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class428.field5860.method1794(5860, 26, arg1);
        if (arg0 != 29) {
            return null;
        }
        class280 var4 = new class280();
        if (var3 != null) {
            var4.method1749(new class242(var3), -109);
        }
        class183.field2122.method2294(var4, (byte) 17, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(Ljava/lang/String;ZLjava/lang/String;IILjava/lang/String;)V")
    public static final void method2124(String arg0, boolean arg1, String arg2, int arg3, int arg4, String arg5) {
        class175.method1099(-1, arg5, (String) null, arg0, arg3, arg2, arg4, (byte) 20);
        field4499++;
        if (arg1) {
            method2123(82, -109);
        }
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(B)J")
    public abstract long method1986(byte arg0);

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(IIIFIIIZI)[[I")
    public static final int[][] method2125(int arg0, int arg1, int arg2, float arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8) {
        field4501++;
        int[][] var9 = new int[arg4][arg1];
        class421 var10 = new class421();
        var10.field5760 = (int) (arg3 * 4096.0F);
        var10.field5774 = arg6;
        var10.field5768 = arg5;
        var10.field5772 = arg7;
        if (arg0 != -1) {
            method2126((byte) 67);
        }
        var10.field5765 = arg2;
        var10.method280(arg0 - 83);
        class32.method210((byte) 62, arg1, arg4);
        for (int var11 = 0; var11 < arg4; var11++) {
            var10.method2580(var9[var11], (byte) 101, var11);
        }
        return var9;
    }

    @OriginalMember(owner = "client!hm", name = "b", descriptor = "(B)V")
    public static final void method2126(byte arg0) {
        field4497++;
        if (class342.field4668.length() == 0) {
            return;
        }
        class228.method1394("--> " + class342.field4668, 0);
        class210.method1289(false, 10, class342.field4668);
        class286.field3774 = 0;
        if (arg0 > 40) {
            class241.field3160 = 0;
            class342.field4668 = "";
        }
    }

    @OriginalMember(owner = "client!hm", name = "c", descriptor = "(B)V")
    public abstract void method1984(byte arg0);
}
