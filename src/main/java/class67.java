import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!g")
public class class67 {

    @OriginalMember(owner = "client!g", name = "e", descriptor = "I")
    public static int field1207 = 0;

    @OriginalMember(owner = "client!g", name = "i", descriptor = "I")
    public static int field1211 = 1;

    @OriginalMember(owner = "client!g", name = "f", descriptor = "I")
    public static int field1208 = 0;

    @OriginalMember(owner = "client!g", name = "n", descriptor = "Li;")
    public static class88 field1216 = class208.method1425(105, "Keine Antwort vom Server)3");

    @OriginalMember(owner = "client!g", name = "m", descriptor = "Z")
    public static boolean field1215 = false;

    @OriginalMember(owner = "client!g", name = "d", descriptor = "I")
    public static int field1206 = 0;

    @OriginalMember(owner = "client!g", name = "l", descriptor = "Li;")
    public static class88 field1214 = class208.method1425(105, "<)4col>");

    @OriginalMember(owner = "client!g", name = "s", descriptor = "I")
    public static int field1221 = 0;

    @OriginalMember(owner = "client!g", name = "a", descriptor = "I")
    public static int field1203;

    @OriginalMember(owner = "client!g", name = "c", descriptor = "I")
    public static int field1205;

    @OriginalMember(owner = "client!g", name = "g", descriptor = "I")
    public static int field1209;

    @OriginalMember(owner = "client!g", name = "k", descriptor = "I")
    public static int field1213;

    @OriginalMember(owner = "client!g", name = "o", descriptor = "I")
    public static int field1217;

    @OriginalMember(owner = "client!g", name = "q", descriptor = "J")
    public long field1219;

    @OriginalMember(owner = "client!g", name = "b", descriptor = "Lbj;")
    public static class22 field1204;

    @OriginalMember(owner = "client!g", name = "j", descriptor = "Lg;")
    public class67 field1212;

    @OriginalMember(owner = "client!g", name = "r", descriptor = "Lg;")
    public class67 field1220;

    @OriginalMember(owner = "client!g", name = "p", descriptor = "[I")
    public static int[] field1218;

    @OriginalMember(owner = "client!g", name = "h", descriptor = "[S")
    public static short[] field1210;

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(ZLjava/lang/Object;I)[B")
    public static final byte[] method457(boolean arg0, Object arg1, int arg2) {
        if (arg2 != 0) {
            field1214 = null;
        }
        field1217++;
        if (arg1 == null) {
            return null;
        } else if (arg1 instanceof byte[]) {
            byte[] var3 = (byte[]) arg1;
            return arg0 ? class179.method1278(var3, true) : var3;
        } else if (arg1 instanceof class1) {
            class1 var4 = (class1) arg1;
            return var4.method1((byte) 118);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(II)Lke;")
    public static final class114 method458(int arg0, int arg1) {
        int var2 = 86 / (arg1 / 42);
        class114 var3 = (class114) class17.field251.method666((long) arg0, 0);
        field1213++;
        if (var3 != null) {
            return var3;
        }
        byte[] var4 = client.field567.method941((byte) 56, arg0, 5);
        class114 var5 = new class114();
        if (var4 != null) {
            var5.method777(new class46(var4), (byte) 83);
        }
        class17.field251.method664((long) arg0, var5, false);
        return var5;
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(I)Z")
    public final boolean method459(int arg0) {
        field1209++;
        if (this.field1212 == null) {
            return false;
        } else {
            if (arg0 != 1) {
                this.method459(6);
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(Z)V")
    public final void method460(boolean arg0) {
        field1205++;
        if (this.field1212 == null) {
            return;
        }
        this.field1212.field1220 = this.field1220;
        this.field1220.field1212 = this.field1212;
        if (!arg0) {
            this.method460(false);
        }
        this.field1220 = null;
        this.field1212 = null;
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(B)V")
    public static void method461(byte arg0) {
        field1210 = null;
        field1218 = null;
        field1216 = null;
        if (arg0 < 101) {
            field1218 = null;
        }
        field1214 = null;
        field1204 = null;
    }
}
