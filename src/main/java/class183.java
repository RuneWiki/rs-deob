import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oga")
public class class183 {

    @OriginalMember(owner = "client!oga", name = "h", descriptor = "Lad;")
    private class19 field2058 = new class19(256);

    @OriginalMember(owner = "client!oga", name = "a", descriptor = "Ltf;")
    private class701 field2051;

    @OriginalMember(owner = "client!oga", name = "b", descriptor = "I")
    public static int field2052;

    @OriginalMember(owner = "client!oga", name = "c", descriptor = "I")
    public static int field2053;

    @OriginalMember(owner = "client!oga", name = "d", descriptor = "I")
    public static int field2054;

    @OriginalMember(owner = "client!oga", name = "e", descriptor = "I")
    public static int field2055;

    @OriginalMember(owner = "client!oga", name = "f", descriptor = "I")
    public static int field2056;

    @OriginalMember(owner = "client!oga", name = "g", descriptor = "I")
    public static int field2057;

    @OriginalMember(owner = "client!oga", name = "a", descriptor = "(ZC)Z")
    public static final boolean method1107(boolean arg0, char arg1) {
        if (arg0) {
            return false;
        }
        field2054++;
        if (!(arg1 <= '\u0000' || arg1 >= '\u0080') || !(arg1 < ' ' || arg1 > 'ÿ')) {
            return true;
        }
        if (arg1 != '\u0000') {
            char[] var2 = class369.field5052;
            for (int var3 = 0; var3 < var2.length; var3++) {
                char var4 = var2[var3];
                if (arg1 == var4) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!oga", name = "a", descriptor = "(BI)Lgca;")
    public final class164 method1108(byte arg0, int arg1) {
        if (arg0 != 34) {
            this.field2051 = null;
        }
        field2056++;
        class19 var3 = this.field2058;
        class164 var4;
        synchronized (this.field2058) {
            var4 = (class164) this.field2058.method78(0, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class701 var5 = this.field2051;
        byte[] var6;
        synchronized (this.field2051) {
            var6 = this.field2051.method3854((byte) 88, 26, arg1);
        }
        class164 var7 = new class164();
        if (var6 != null) {
            var7.method887(false, new class115(var6));
        }
        class19 var8 = this.field2058;
        synchronized (this.field2058) {
            this.field2058.method92(1, (long) arg1, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!oga", name = "a", descriptor = "(B)V")
    public final void method1109(byte arg0) {
        field2055++;
        if (arg0 != -57) {
            this.field2051 = null;
        }
        class19 var2 = this.field2058;
        synchronized (this.field2058) {
            this.field2058.method88(81);
        }
    }

    @OriginalMember(owner = "client!oga", name = "a", descriptor = "(I)V")
    public final void method1110(int arg0) {
        if (arg0 != 26) {
            method1107(false, '0');
        }
        field2053++;
        class19 var2 = this.field2058;
        synchronized (this.field2058) {
            this.field2058.method80((byte) -79);
        }
    }

    @OriginalMember(owner = "client!oga", name = "a", descriptor = "(II)V")
    public final void method1111(int arg0, int arg1) {
        if (arg0 != 22425) {
            this.method1111(-111, -88);
        }
        class19 var3 = this.field2058;
        synchronized (this.field2058) {
            this.field2058.method83((byte) -2, arg1);
        }
        field2057++;
    }

    @OriginalMember(owner = "client!oga", name = "a", descriptor = "(Ljava/lang/String;Z)I")
    public static final int method1112(String arg0, boolean arg1) {
        field2052++;
        if (arg1) {
            method1112(null, true);
        }
        int var2 = arg0.length();
        int var3 = 0;
        for (int var4 = 0; var4 < var2; var4++) {
            var3 = (var3 << 5) + arg0.charAt(var4) - var3;
        }
        return var3;
    }

    @OriginalMember(owner = "client!oga", name = "<init>", descriptor = "(Lqh;ILtf;)V")
    public class183(class320 arg0, int arg1, class701 arg2) {
        this.field2051 = arg2;
        this.field2051.method3883(26, 0);
    }
}
