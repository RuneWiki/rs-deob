import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wca")
public abstract class class631 {

    @OriginalMember(owner = "client!wca", name = "c", descriptor = "Ltf;")
    public static class269 field9085 = new class269();

    @OriginalMember(owner = "client!wca", name = "e", descriptor = "Lqfa;")
    public static class85 field9087 = new class85(63, 4);

    @OriginalMember(owner = "client!wca", name = "f", descriptor = "I")
    public static int field9088 = -1;

    @OriginalMember(owner = "client!wca", name = "a", descriptor = "I")
    public static int field9083;

    @OriginalMember(owner = "client!wca", name = "b", descriptor = "I")
    public static int field9084;

    @OriginalMember(owner = "client!wca", name = "d", descriptor = "[J")
    public static long[] field9086;

    @OriginalMember(owner = "client!wca", name = "a", descriptor = "(B)Lnr;")
    public abstract class53 method2202(byte arg0);

    @OriginalMember(owner = "client!wca", name = "a", descriptor = "(IIIJLjava/lang/String;IBZLjava/lang/String;IZ)V")
    public static final void method3604(int arg0, int arg1, int arg2, long arg3, String arg4, int arg5, byte arg6, boolean arg7, String arg8, int arg9, boolean arg10) {
        field9084++;
        if (arg6 <= -25 && !class308.field4551 && class481.field6904 < 500) {
            int var12 = arg9 == -1 ? class139.field2461 : arg9;
            class300 var13 = new class300(arg4, arg8, var12, arg0, arg2, arg3, arg5, arg1, arg7, arg10);
            class126.field2292.method1229(var13, (byte) 120);
            class481.field6904++;
        }
    }

    @OriginalMember(owner = "client!wca", name = "b", descriptor = "(B)V")
    public abstract void method2201(byte arg0);

    @OriginalMember(owner = "client!wca", name = "a", descriptor = "(I)V")
    public static void method3605(int arg0) {
        field9085 = null;
        field9087 = null;
        field9086 = null;
        if (arg0 != 256) {
            field9088 = 13;
        }
    }

    @OriginalMember(owner = "client!wca", name = "b", descriptor = "(I)V")
    public abstract void method2204(int arg0);

    @OriginalMember(owner = "client!wca", name = "a", descriptor = "(IB)Z")
    public abstract boolean method2194(int arg0, byte arg1);

    @OriginalMember(owner = "client!wca", name = "a", descriptor = "(IBII)V")
    public static final void method3606(int arg0, byte arg1, int arg2, int arg3) {
        field9083++;
        int var4 = class33.field967 + arg2;
        int var5 = class323.field4749 + arg0;
        if (class257.field3792 == null || arg2 < 0 || arg0 < 0 || arg2 >= class675.field9604 || arg0 >= class218.field3316 || !class527.field7429.method2824(-1, class90.field1654) && class532.field7456.field9814 != arg3) {
            return;
        }
        long var6 = (long) (var4 | var5 << 14 | arg3 << 28);
        if (arg1 != 0) {
            return;
        }
        class38 var8 = (class38) class409.field5924.method2596(var6, arg1 ^ 0x3E);
        if (var8 == null) {
            class423.method2577(arg3, arg2, arg0);
            return;
        }
        class315 var9 = (class315) var8.field1053.method1224(-2);
        if (var9 == null) {
            class423.method2577(arg3, arg2, arg0);
            return;
        }
        class502 var10 = (class502) class423.method2577(arg3, arg2, arg0);
        if (var10 == null) {
            var10 = new class502(arg2 << 9, class485.field6947[arg3].method551(arg2, arg0, (byte) -105), arg0 << 9, arg3, arg3);
        } else {
            var10.field7149 = var10.field7135 = -1;
        }
        var10.field7140 = var9.field4649;
        var10.field7150 = var9.field4652;
        label61: while (true) {
            class315 var11 = (class315) var8.field1053.method1232(-2);
            if (var11 == null) {
                break;
            }
            if (var10.field7150 != var11.field4652) {
                var10.field7139 = var11.field4649;
                var10.field7149 = var11.field4652;
                while (true) {
                    class315 var12 = (class315) var8.field1053.method1232(-2);
                    if (var12 == null) {
                        break label61;
                    }
                    if (var10.field7150 != var12.field4652 && var10.field7149 != var12.field4652) {
                        var10.field7135 = var12.field4652;
                        var10.field7146 = var12.field4649;
                    }
                }
            }
        }
        int var13 = class460.method2757(0, (arg0 << 9) + 256, arg3, (arg2 << 9) + 256);
        var10.field9814 = (byte) arg3;
        var10.field9806 = arg2 << 9;
        var10.field9809 = var13;
        var10.field9804 = (byte) arg3;
        var10.field9815 = arg0 << 9;
        if (class89.method868(5125, arg2, arg0)) {
            var10.field9804++;
        }
        class499.method2977(arg3, arg2, arg0, var13, var10);
    }
}
