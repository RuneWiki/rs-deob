import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wn")
public class class724 {

    @OriginalMember(owner = "client!wn", name = "b", descriptor = "Lqr;")
    private class65 field10081 = new class65(64);

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "Lwu;")
    private class376 field10080;

    @OriginalMember(owner = "client!wn", name = "g", descriptor = "I")
    public int field10086;

    @OriginalMember(owner = "client!wn", name = "c", descriptor = "I")
    public static int field10082;

    @OriginalMember(owner = "client!wn", name = "d", descriptor = "I")
    public static int field10083;

    @OriginalMember(owner = "client!wn", name = "e", descriptor = "I")
    public static int field10084;

    @OriginalMember(owner = "client!wn", name = "f", descriptor = "I")
    public static int field10085;

    @OriginalMember(owner = "client!wn", name = "h", descriptor = "I")
    public static int field10087;

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(I)V")
    public final void method4075(int arg0) {
        class65 var2 = this.field10081;
        synchronized (this.field10081) {
            this.field10081.method558(arg0 ^ arg0);
        }
        field10083++;
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(BI)V")
    public final void method4076(byte arg0, int arg1) {
        field10087++;
        int var3 = -117 / ((-arg0 - 21) / 60);
        class65 var4 = this.field10081;
        synchronized (this.field10081) {
            this.field10081.method553(arg1, -15782);
        }
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(IB)Lkt;")
    public final class159 method4077(int arg0, byte arg1) {
        field10082++;
        class65 var3 = this.field10081;
        class159 var4;
        synchronized (this.field10081) {
            var4 = (class159) this.field10081.method552(4, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class376 var5 = this.field10080;
        byte[] var6;
        synchronized (this.field10080) {
            var6 = this.field10080.method2218((byte) 122, 16, arg0);
        }
        class159 var7 = new class159();
        if (var6 != null) {
            var7.method1143((byte) -119, new class677(var6));
        }
        class65 var8 = this.field10081;
        synchronized (this.field10081) {
            int var9 = 88 % ((arg1 - 73) / 39);
            this.field10081.method556((byte) 0, (long) arg0, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!wn", name = "<init>", descriptor = "(Lms;ILwu;)V")
    public class724(class763 arg0, int arg1, class376 arg2) {
        this.field10080 = arg2;
        if (this.field10080 == null) {
            this.field10086 = 0;
        } else {
            this.field10086 = this.field10080.method2195(16, 0);
        }
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(II)I")
    public static final int method4078(int arg0, int arg1) {
        field10085++;
        return arg0 == 7600775 ? arg1 >>> 7 : -98;
    }

    @OriginalMember(owner = "client!wn", name = "b", descriptor = "(I)V")
    public final void method4079(int arg0) {
        class65 var2 = this.field10081;
        synchronized (this.field10081) {
            int var3 = 27 % ((arg0 - 32) / 32);
            this.field10081.method561((byte) -78);
        }
        field10084++;
    }
}
