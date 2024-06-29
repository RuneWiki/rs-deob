import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public class class128 {

    @OriginalMember(owner = "client!mb", name = "c", descriptor = "J")
    public long field2107 = 0L;

    @OriginalMember(owner = "client!mb", name = "n", descriptor = "[I")
    public static int[] field2118 = new int[] { 2, 2, 4, 0, 1, 8, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!mb", name = "h", descriptor = "[Lig;")
    public static class136[] field2112 = new class136[2048];

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "I")
    public static int field2106;

    @OriginalMember(owner = "client!mb", name = "d", descriptor = "I")
    public int field2108;

    @OriginalMember(owner = "client!mb", name = "e", descriptor = "I")
    public static int field2109;

    @OriginalMember(owner = "client!mb", name = "f", descriptor = "I")
    public static int field2110;

    @OriginalMember(owner = "client!mb", name = "g", descriptor = "I")
    public static int field2111;

    @OriginalMember(owner = "client!mb", name = "i", descriptor = "I")
    public int field2113;

    @OriginalMember(owner = "client!mb", name = "k", descriptor = "I")
    public int field2115;

    @OriginalMember(owner = "client!mb", name = "l", descriptor = "I")
    public int field2116;

    @OriginalMember(owner = "client!mb", name = "p", descriptor = "I")
    public static int field2120;

    @OriginalMember(owner = "client!mb", name = "q", descriptor = "I")
    public int field2121;

    @OriginalMember(owner = "client!mb", name = "j", descriptor = "Lbf;")
    public static class102 field2114;

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "Lci;")
    public class60 field2105;

    @OriginalMember(owner = "client!mb", name = "m", descriptor = "Lci;")
    public class60 field2117;

    @OriginalMember(owner = "client!mb", name = "o", descriptor = "[[Lkj;")
    public static class114[][] field2119;

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(II)Luf;")
    public static final class165 method932(int arg0, int arg1) {
        field2111++;
        class165 var2 = (class165) class29.field506.method1155((long) arg1, true);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class192.field3142.method900(class287.method1930(22409, arg1), class234.method1552(arg1, 10629), false);
        class165 var4 = new class165();
        var4.field2703 = arg1;
        int var5 = 29 % ((58 - arg0) / 33);
        if (var3 != null) {
            var4.method1190(new class136(var3), (byte) -65);
        }
        var4.method1187(-7280);
        class29.field506.method1161(var4, (byte) -106, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(I)V")
    public static void method933(int arg0) {
        if (arg0 != 2) {
            field2114 = null;
        }
        field2119 = null;
        field2112 = null;
        field2118 = null;
        field2114 = null;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(ZLjava/lang/String;B)V")
    public static final void method934(boolean arg0, String arg1, byte arg2) {
        if (arg2 <= 0) {
            field2112 = null;
        }
        field2109++;
        if (arg0) {
            try {
                class75.field1226.getAppletContext().showDocument(new URL(class75.field1226.getCodeBase(), arg1), "_blank");
            } catch (Exception var3) {
            }
            return;
        }
        try {
            class120.method877(class205.field3294.field1291, 25718, "loggedout");
        } catch (Throwable var5) {
        }
        try {
            class75.field1226.getAppletContext().showDocument(new URL(class75.field1226.getCodeBase(), arg1), "_top");
        } catch (Exception var4) {
        }
    }

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "(II)Lrc;")
    public static final class9 method935(int arg0, int arg1) {
        field2110++;
        class9 var2 = (class9) class127.field2095.method1155((long) arg0, true);
        if (var2 != null) {
            return var2;
        }
        int var3 = -127 / ((77 - arg1) / 41);
        byte[] var4 = class193.field3161.method900(3, arg0, false);
        class9 var5 = new class9();
        if (var4 != null) {
            var5.method49(0, new class136(var4));
        }
        class127.field2095.method1161(var5, (byte) -105, (long) arg0);
        return var5;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(IZI)I")
    public static final int method936(int arg0, boolean arg1, int arg2) {
        field2106++;
        if (arg1) {
            field2118 = null;
        }
        class194 var3 = (class194) class139.field2322.method1063((byte) -85, (long) arg0);
        if (var3 == null) {
            return -1;
        } else if (arg2 >= 0 && var3.field3179.length > arg2) {
            return var3.field3179[arg2];
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "(I)V")
    public static final void method937(int arg0) {
        field2120++;
        class233.field3697.method1157(760);
        class211.field3389.method1157(760);
        if (arg0 != -21383) {
            field2112 = null;
        }
    }
}
