import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uha")
public class class246 implements class209 {

    @OriginalMember(owner = "client!uha", name = "b", descriptor = "Lvv;")
    private class328 field3198;

    @OriginalMember(owner = "client!uha", name = "e", descriptor = "Ldk;")
    private class511 field3201;

    @OriginalMember(owner = "client!uha", name = "c", descriptor = "Loq;")
    public static class362 field3199 = new class362();

    @OriginalMember(owner = "client!uha", name = "g", descriptor = "Llga;")
    public static class712 field3203 = new class712(28, 3);

    @OriginalMember(owner = "client!uha", name = "a", descriptor = "I")
    public static int field3197;

    @OriginalMember(owner = "client!uha", name = "d", descriptor = "I")
    public static int field3200;

    @OriginalMember(owner = "client!uha", name = "f", descriptor = "I")
    public static int field3202;

    @OriginalMember(owner = "client!uha", name = "h", descriptor = "I")
    public static int field3204;

    @OriginalMember(owner = "client!uha", name = "i", descriptor = "Lufa;")
    public static class680 field3205;

    @OriginalMember(owner = "client!uha", name = "a", descriptor = "(I)Z", line = 3)
    public final boolean method183(int arg0) {
        field3200++;
        if (arg0 != 14017) {
            field3199 = null;
        }
        return this.field3198.method1950(-1);
    }

    @OriginalMember(owner = "client!uha", name = "a", descriptor = "(Z)V", line = 14)
    public static void method1478(boolean arg0) {
        field3203 = null;
        field3205 = null;
        field3199 = null;
        if (!arg0) {
            field3203 = null;
        }
    }

    @OriginalMember(owner = "client!uha", name = "a", descriptor = "(B)V", line = 26)
    public final void method184(byte arg0) {
        if (arg0 != -43) {
            this.field3201 = null;
        }
        field3202++;
    }

    @OriginalMember(owner = "client!uha", name = "a", descriptor = "(ZB)V", line = 38)
    public final void method182(boolean arg0, byte arg1) {
        if (arg1 >= -81) {
            field3205 = null;
        }
        field3204++;
        class409 var3 = this.field3198.method1951(23885, this.field3201.field6913);
        if (var3 == null) {
            return;
        }
        int var4 = this.field3201.field6914.method3841(class751.field10419, this.field3201.field6906, (byte) 110) + this.field3201.field6910;
        int var5 = this.field3201.field6911.method606(this.field3201.field6908, class396.field5620, (byte) -56) + this.field3201.field6896;
        if (this.field3201.field6904) {
            class21.field142.method391(var4, var5, this.field3201.field6906, this.field3201.field6908, this.field3201.field6895, 0);
        }
        int var6 = var5 + this.method1479(5, var5, class214.field2575, var3.field5777, true, var4) * 12;
        int var9 = var6 + 8;
        if (this.field3201.field6904) {
            class21.field142.method412(var4, var9, this.field3201.field6906 + var4 - 1, var9, this.field3201.field6895, 0);
        }
        var6 = var9 + 1;
        int var7 = var6 + this.method1479(5, var6, class214.field2575, var3.field5772, true, var4) * 12;
        int var10 = var7 + 5;
        int var10000 = var10 + this.method1479(5, var10, class214.field2575, var3.field5774, true, var4) * 12;
    }

    @OriginalMember(owner = "client!uha", name = "a", descriptor = "(IILda;Ljava/lang/String;ZI)I", line = 79)
    private final int method1479(int arg0, int arg1, class61 arg2, String arg3, boolean arg4, int arg5) {
        field3197++;
        if (!arg4) {
            this.field3198 = null;
        }
        return arg2.method473(arg0 + arg5, null, this.field3201.field6906 - (arg0 * 2), arg3, 0, this.field3201.field6897, null, 0, (byte) -119, this.field3201.field6899, null, 0, 0, 0, arg0 + arg1, -(arg0 * 2) + this.field3201.field6908);
    }

    @OriginalMember(owner = "client!uha", name = "<init>", descriptor = "(Lvv;Ldk;)V", line = 91)
    public class246(class328 arg0, class511 arg1) {
        this.field3198 = arg0;
        this.field3201 = arg1;
    }
}
