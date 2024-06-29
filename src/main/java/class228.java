import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public class class228 {

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "Lad;")
    private class19 field2827 = new class19(16);

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "Ltf;")
    private class701 field2826;

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "I")
    public static int field2825;

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "I")
    public static int field2828;

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "I")
    public static int field2829;

    @OriginalMember(owner = "client!oa", name = "f", descriptor = "I")
    public static int field2830;

    @OriginalMember(owner = "client!oa", name = "g", descriptor = "Lwc;")
    public static class494 field2831;

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(I)V")
    public final void method1371(int arg0) {
        if (arg0 != 30) {
            method1372((byte) -113);
        }
        field2828++;
        class19 var2 = this.field2827;
        synchronized (this.field2827) {
            this.field2827.method88(117);
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(B)V")
    public static void method1372(byte arg0) {
        field2831 = null;
        if (arg0 < 102) {
            field2831 = null;
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(BI)Lrk;")
    public final class459 method1373(byte arg0, int arg1) {
        field2825++;
        class19 var3 = this.field2827;
        class459 var4;
        synchronized (this.field2827) {
            var4 = (class459) this.field2827.method78(0, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class701 var5 = this.field2826;
        byte[] var6;
        synchronized (this.field2826) {
            var6 = this.field2826.method3854((byte) 61, 30, arg1);
        }
        class459 var7 = new class459();
        if (arg0 < 109) {
            return null;
        }
        if (var6 != null) {
            var7.method2629(-6, new class115(var6));
        }
        class19 var8 = this.field2827;
        synchronized (this.field2827) {
            this.field2827.method92(1, (long) arg1, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(ZI)V")
    public final void method1374(boolean arg0, int arg1) {
        class19 var3 = this.field2827;
        synchronized (this.field2827) {
            this.field2827.method83((byte) -2, arg1);
        }
        field2830++;
        if (arg0) {
            this.field2827 = null;
        }
    }

    @OriginalMember(owner = "client!oa", name = "<init>", descriptor = "(Lqh;ILtf;)V")
    public class228(class320 arg0, int arg1, class701 arg2) {
        this.field2826 = arg2;
        this.field2826.method3883(30, 0);
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(I)V")
    public final void method1375(int arg0) {
        field2829++;
        class19 var2 = this.field2827;
        synchronized (this.field2827) {
            if (arg0 != 6539) {
                field2831 = null;
            }
            this.field2827.method80((byte) -106);
        }
    }
}
