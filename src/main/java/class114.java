import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cda")
public class class114 {

    @OriginalMember(owner = "client!cda", name = "f", descriptor = "Lbh;")
    private class538 field1609 = new class538(64);

    @OriginalMember(owner = "client!cda", name = "e", descriptor = "Lwu;")
    private class557 field1608;

    @OriginalMember(owner = "client!cda", name = "b", descriptor = "I")
    public int field1605;

    @OriginalMember(owner = "client!cda", name = "c", descriptor = "Lqk;")
    public static class148 field1606 = new class148(80, 11);

    @OriginalMember(owner = "client!cda", name = "a", descriptor = "I")
    public static int field1604;

    @OriginalMember(owner = "client!cda", name = "d", descriptor = "I")
    public static int field1607;

    @OriginalMember(owner = "client!cda", name = "g", descriptor = "I")
    public static int field1610;

    @OriginalMember(owner = "client!cda", name = "a", descriptor = "(B)V")
    public static void method759(byte arg0) {
        field1606 = null;
        if (arg0 > -77) {
            field1606 = null;
        }
    }

    @OriginalMember(owner = "client!cda", name = "b", descriptor = "(B)V")
    public static final void method760(byte arg0) {
        field1604++;
        if (class105.field1536 == null) {
            return;
        }
        class105.field1536 = null;
        class746.method4149(class660.field9314, class729.field10220, class695.field9701, (byte) 108, class495.field6946);
        if (arg0 != -105) {
            method759((byte) 85);
        }
    }

    @OriginalMember(owner = "client!cda", name = "a", descriptor = "(II)Lsk;")
    public final class122 method761(int arg0, int arg1) {
        field1610++;
        class538 var3 = this.field1609;
        class122 var4;
        synchronized (this.field1609) {
            var4 = (class122) this.field1609.method3200((long) arg0, -19983);
        }
        if (var4 != null) {
            return var4;
        }
        class557 var5 = this.field1608;
        byte[] var6;
        synchronized (this.field1608) {
            var6 = this.field1608.method3322(19, arg0, (byte) 109);
            if (arg1 != 11) {
                this.method761(67, -6);
            }
        }
        class122 var7 = new class122();
        if (var6 != null) {
            var7.method788(new class26(var6), (byte) -23);
        }
        class538 var8 = this.field1609;
        synchronized (this.field1609) {
            this.field1609.method3199((byte) 78, var7, (long) arg0);
            return var7;
        }
    }

    @OriginalMember(owner = "client!cda", name = "<init>", descriptor = "(Lwj;ILwu;)V")
    public class114(class121 arg0, int arg1, class557 arg2) {
        this.field1608 = arg2;
        this.field1605 = this.field1608.method3333(19, 3443);
    }
}
