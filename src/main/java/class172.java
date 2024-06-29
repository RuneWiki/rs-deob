import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hg")
public abstract class class172 extends class255 {

    @OriginalMember(owner = "client!hg", name = "M", descriptor = "[I")
    public static int[] field3039 = new int[100];

    @OriginalMember(owner = "client!hg", name = "O", descriptor = "Leb;")
    public static class230 field3041 = class68.method589(0, ":");

    @OriginalMember(owner = "client!hg", name = "P", descriptor = "Leb;")
    public static class230 field3042 = class68.method589(0, "document)3cookie=(R");

    @OriginalMember(owner = "client!hg", name = "Q", descriptor = "Leb;")
    public static class230 field3043 = class68.method589(0, "gleiten:");

    @OriginalMember(owner = "client!hg", name = "R", descriptor = "Leb;")
    public static class230 field3044 = class68.method589(0, "weiss:");

    @OriginalMember(owner = "client!hg", name = "T", descriptor = "I")
    public static int field3045;

    @OriginalMember(owner = "client!hg", name = "U", descriptor = "I")
    public static int field3046;

    @OriginalMember(owner = "client!hg", name = "V", descriptor = "I")
    public static int field3047;

    @OriginalMember(owner = "client!hg", name = "N", descriptor = "Lug;")
    public static class193 field3040;

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "(III)I")
    public static final int method1261(int arg0, int arg1, int arg2) {
        int var3 = 36 / ((arg0 - 84) / 32);
        field3046++;
        if (arg2 == -2) {
            return 12345678;
        } else if (arg2 == -1) {
            if (arg1 < 2) {
                arg1 = 2;
            } else if (arg1 > 126) {
                arg1 = 126;
            }
            return arg1;
        } else {
            int var4 = (arg2 & 0x7F) * arg1 >> 7;
            if (var4 < 2) {
                var4 = 2;
            } else if (var4 > 126) {
                var4 = 126;
            }
            return (arg2 & 0xFF80) + var4;
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(Z)Z")
    public abstract boolean method1227(boolean arg0);

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "(Z)V")
    public static final void method1262(boolean arg0) {
        class41.field740 = null;
        field3045++;
        if (!arg0) {
            method1263((byte) 104);
        }
        class156.field2791 = null;
        class233.field4046 = null;
    }

    @OriginalMember(owner = "client!hg", name = "e", descriptor = "(B)V")
    public static void method1263(byte arg0) {
        field3043 = null;
        if (arg0 > -121) {
            return;
        }
        field3039 = null;
        field3042 = null;
        field3041 = null;
        field3044 = null;
        field3040 = null;
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(ZI)Lvf;")
    public static final class100 method1264(boolean arg0, int arg1) {
        field3047++;
        class100 var2 = (class100) class102.field1865.method1125((long) arg1, true);
        if (var2 != null) {
            return var2;
        } else if (arg0) {
            return null;
        } else {
            byte[] var3 = class171.field3031.method1546(class233.method1646(arg1, !arg0), (byte) -100, class147.method1127(arg1, arg0));
            class100 var4 = new class100();
            if (var3 != null) {
                var4.method854((byte) -64, new class14(var3));
            }
            class102.field1865.method1129((long) arg1, true, var4);
            return var4;
        }
    }

    @OriginalMember(owner = "client!hg", name = "e", descriptor = "(I)Ljava/lang/Object;")
    public abstract Object method1229(int arg0);
}
