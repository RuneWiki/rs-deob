import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eaa")
public class class501 {

    @OriginalMember(owner = "client!eaa", name = "h", descriptor = "Lfc;")
    private class262 field6821 = new class262(16);

    @OriginalMember(owner = "client!eaa", name = "c", descriptor = "Lni;")
    private class522 field6816;

    @OriginalMember(owner = "client!eaa", name = "b", descriptor = "I")
    public static int field6815 = 0;

    @OriginalMember(owner = "client!eaa", name = "l", descriptor = "Llga;")
    public static class712 field6825 = new class712(36, -1);

    @OriginalMember(owner = "client!eaa", name = "m", descriptor = "Lea;")
    public static class547 field6826 = new class547(113, -2);

    @OriginalMember(owner = "client!eaa", name = "a", descriptor = "I")
    public static int field6814;

    @OriginalMember(owner = "client!eaa", name = "d", descriptor = "I")
    public static int field6817;

    @OriginalMember(owner = "client!eaa", name = "e", descriptor = "I")
    public static int field6818;

    @OriginalMember(owner = "client!eaa", name = "f", descriptor = "I")
    public static int field6819;

    @OriginalMember(owner = "client!eaa", name = "g", descriptor = "I")
    public static int field6820;

    @OriginalMember(owner = "client!eaa", name = "i", descriptor = "I")
    public static int field6822;

    @OriginalMember(owner = "client!eaa", name = "j", descriptor = "I")
    public static int field6823;

    @OriginalMember(owner = "client!eaa", name = "k", descriptor = "I")
    public static int field6824;

    @OriginalMember(owner = "client!eaa", name = "a", descriptor = "(III)Z", line = 5)
    public static final boolean method2793(int arg0, int arg1, int arg2) {
        if (arg2 < 34) {
            method2795((byte) 105, 80, null);
        }
        field6819++;
        return (arg0 & 0x800) != 0 | class463.method2575(-12, arg0, arg1) || class90.method644(55, arg0, arg1);
    }

    @OriginalMember(owner = "client!eaa", name = "a", descriptor = "(I)V", line = 16)
    public final void method2794(int arg0) {
        field6814++;
        class262 var2 = this.field6821;
        synchronized (this.field6821) {
            this.field6821.method1575((byte) 117);
            int var3 = -128 % ((arg0 + 15) / 39);
        }
    }

    @OriginalMember(owner = "client!eaa", name = "a", descriptor = "(BI[F)[F", line = 28)
    public static final float[] method2795(byte arg0, int arg1, float[] arg2) {
        field6817++;
        if (arg0 != -64) {
            field6820 = -4;
        }
        float[] var3 = new float[arg1];
        class373.method2197(arg2, 0, var3, 0, arg1);
        return var3;
    }

    @OriginalMember(owner = "client!eaa", name = "a", descriptor = "(IB)Leba;", line = 45)
    private final class589 method2796(int arg0, byte arg1) {
        field6818++;
        class262 var3 = this.field6821;
        class589 var4;
        synchronized (this.field6821) {
            var4 = (class589) this.field6821.method1571(-125, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        if (arg1 >= -87) {
            field6825 = null;
        }
        class522 var5 = this.field6816;
        byte[] var6;
        synchronized (this.field6816) {
            var6 = this.field6816.method2885(arg0, 29, false);
        }
        class589 var7 = new class589();
        if (var6 != null) {
            var7.method3278(new class611(var6), 0);
        }
        class262 var8 = this.field6821;
        synchronized (this.field6821) {
            this.field6821.method1574((long) arg0, var7, (byte) -80);
            return var7;
        }
    }

    @OriginalMember(owner = "client!eaa", name = "a", descriptor = "(IIIILhh;I)Lvaa;", line = 80)
    public final class469 method2797(int arg0, int arg1, int arg2, int arg3, class131 arg4, int arg5) {
        field6822++;
        if (arg0 != 0) {
            field6820 = 103;
        }
        class141[] var7 = null;
        class589 var8 = this.method2796(arg1, (byte) -120);
        if (var8.field8228 != null) {
            var7 = new class141[var8.field8228.length];
            for (int var9 = 0; var9 < var7.length; var9++) {
                class736 var10 = arg4.method829(var8.field8228[var9], (byte) -87);
                var7[var9] = new class141(var10.field10278, var10.field10280, var10.field10275, var10.field10273, var10.field10271, var10.field10268, var10.field10276, var10.field10269);
            }
        }
        return new class469(var8.field8225, var7, var8.field8227, arg3, arg2, arg5);
    }

    @OriginalMember(owner = "client!eaa", name = "a", descriptor = "(B)V", line = 113)
    public final void method2798(byte arg0) {
        class262 var2 = this.field6821;
        synchronized (this.field6821) {
            this.field6821.method1563(37);
            int var3 = -27 % ((arg0 - 33) / 53);
        }
        field6824++;
    }

    @OriginalMember(owner = "client!eaa", name = "a", descriptor = "(BI)V", line = 125)
    public final void method2799(byte arg0, int arg1) {
        if (arg0 != -32) {
            this.method2797(33, -37, -43, -90, null, 116);
        }
        field6823++;
        class262 var3 = this.field6821;
        synchronized (this.field6821) {
            this.field6821.method1569((byte) 62, arg1);
        }
    }

    @OriginalMember(owner = "client!eaa", name = "<init>", descriptor = "(Lrga;ILni;)V", line = 148)
    public class501(class242 arg0, int arg1, class522 arg2) {
        this.field6816 = arg2;
        this.field6816.method2901(0, 29);
    }

    @OriginalMember(owner = "client!eaa", name = "b", descriptor = "(B)V", line = 169)
    public static void method2800(byte arg0) {
        field6825 = null;
        field6826 = null;
        if (arg0 >= -114) {
            method2795((byte) -56, -98, null);
        }
    }
}
