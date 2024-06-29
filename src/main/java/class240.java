import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fg")
public class class240 {

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "I")
    public static int field3987 = 0;

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "I")
    public static int field3986;

    @OriginalMember(owner = "client!fg", name = "c", descriptor = "I")
    public static int field3988;

    @OriginalMember(owner = "client!fg", name = "d", descriptor = "I")
    public static int field3989;

    @OriginalMember(owner = "client!fg", name = "e", descriptor = "I")
    public static int field3990;

    @OriginalMember(owner = "client!fg", name = "f", descriptor = "Lg;")
    public static class181 field3991;

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(I)V", line = 4)
    public static void method1675(int arg0) {
        if (arg0 != -9014) {
            method1675(-17);
        }
        field3991 = null;
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(II)Lch;", line = 20)
    public static final class158 method1676(int arg0, int arg1) {
        field3988++;
        class158 var2 = (class158) class261.field4304.method893((long) arg1, 70);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class145.field2428.method1404(3, arg1, (byte) -61);
        class158 var4 = new class158();
        if (var3 != null) {
            var4.method1143(new class146(var3), 1039);
        }
        if (arg0 < 121) {
            field3990 = -104;
        }
        class261.field4304.method888((long) arg1, var4, 39);
        return var4;
    }

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "(II)V", line = 54)
    public static final void method1677(int arg0, int arg1) {
        class223.field3691.method896(arg0, (byte) -120);
        field3986++;
        if (arg1 != -1) {
            method1677(58, -2);
        }
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(ZLgb;BZILgb;I)I", line = 66)
    public static final int method1678(boolean arg0, class191 arg1, byte arg2, boolean arg3, int arg4, class191 arg5, int arg6) {
        if (arg2 != 48) {
            method1677(93, 17);
        }
        field3989++;
        int var7 = class115.method851(arg6, arg1, -110, arg5, arg0);
        if (var7 != 0) {
            return arg0 ? -var7 : var7;
        } else if (arg4 == -1) {
            return 0;
        } else {
            int var8 = class115.method851(arg4, arg1, -114, arg5, arg3);
            return arg3 ? -var8 : var8;
        }
    }
}
