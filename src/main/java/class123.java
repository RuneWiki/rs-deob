import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jl")
public class class123 extends class135 implements class9 {

    @OriginalMember(owner = "client!jl", name = "r", descriptor = "I")
    private int field1586;

    @OriginalMember(owner = "client!jl", name = "s", descriptor = "Lqp;")
    public static class586 field1587 = new class586(99, -1);

    @OriginalMember(owner = "client!jl", name = "o", descriptor = "I")
    public static int field1583;

    @OriginalMember(owner = "client!jl", name = "p", descriptor = "I")
    public static int field1584;

    @OriginalMember(owner = "client!jl", name = "q", descriptor = "I")
    public static int field1585;

    @OriginalMember(owner = "client!jl", name = "t", descriptor = "I")
    public static int field1588;

    @OriginalMember(owner = "client!jl", name = "u", descriptor = "I")
    public static int field1589;

    @OriginalMember(owner = "client!jl", name = "v", descriptor = "I")
    public static int field1590;

    @OriginalMember(owner = "client!jl", name = "w", descriptor = "Lra;")
    public static class262 field1591;

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(ZLjava/lang/String;)V")
    public static final void method743(boolean arg0, String arg1) {
        ++field1583;
        if (arg1 != null) {
            if (arg1.startsWith("*")) {
                arg1 = arg1.substring(1);
            }
            String var2 = class436.method2679(arg1, -1);
            if (var2 != null) {
                if (arg0) {
                    method744(37);
                }
                for (int var3 = 0; ~var3 > ~class103.field1309; ++var3) {
                    String var4 = class446.field6551[var3];
                    if (var4.startsWith("*")) {
                        var4 = var4.substring(1);
                    }
                    String var5 = class436.method2679(var4, -1);
                    if (var5 != null && var5.equals(var2)) {
                        --class103.field1309;
                        for (int var6 = var3; ~var6 > ~class103.field1309; ++var6) {
                            class446.field6551[var6] = class446.field6551[var6 + 1];
                            class288.field4250[var6] = class288.field4250[var6 - -1];
                            class461.field6672[var6] = class461.field6672[var6 + 1];
                            class451.field6589[var6] = class451.field6589[var6 + 1];
                            class576.field8506[var6] = class576.field8506[var6 + 1];
                        }
                        ++class377.field5529;
                        class555.field8238 = class73.field858;
                        class165.method1046(-3466, class483.field7331);
                        class221.field3268.method2563(-13021, class83.method488(-127, arg1));
                        class221.field3268.method2580(arg1, 30127);
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(I)I")
    public final int method45(int arg0) {
        if (arg0 != 3497) {
            this.field1586 = -89;
        }
        ++field1588;
        return super.field1796;
    }

    @OriginalMember(owner = "client!jl", name = "d", descriptor = "(I)V")
    public static void method744(int arg0) {
        if (arg0 != -14644) {
            field1587 = null;
        }
        field1587 = null;
        field1591 = null;
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(BI[BI)V")
    public final void method44(byte arg0, int arg1, byte[] arg2, int arg3) {
        ++field1589;
        int var5 = -109 / ((arg0 - 38) / 47);
        this.method835(arg1, 35044, arg2);
        this.field1586 = arg3;
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(Z)I")
    public final int method47(boolean arg0) {
        ++field1590;
        if (!arg0) {
            method744(123);
        }
        return this.field1586;
    }

    @OriginalMember(owner = "client!jl", name = "c", descriptor = "(I)V")
    public final void method532(int arg0) {
        ++field1585;
        if (arg0 <= 10) {
            this.method532(-118);
        }
        super.field1790.method2823(this, false);
    }

    @OriginalMember(owner = "client!jl", name = "<init>", descriptor = "(Los;I[BIZ)V")
    public class123(class468 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        super(arg0, 34962, arg2, arg3, arg4);
        this.field1586 = arg1;
    }

    @OriginalMember(owner = "client!jl", name = "<init>", descriptor = "(Los;ILjaclib/memory/Buffer;IZ)V")
    public class123(class468 arg0, int arg1, Buffer arg2, int arg3, boolean arg4) {
        super(arg0, 34962, arg2, arg3, arg4);
        this.field1586 = arg1;
    }

    @OriginalMember(owner = "client!jl", name = "b", descriptor = "(I)J")
    public final long method46(int arg0) {
        if (arg0 != -22678) {
            this.field1586 = 49;
        }
        ++field1584;
        return 0L;
    }
}
