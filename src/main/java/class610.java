import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public class class610 {

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "Lbh;")
    private class538 field8679 = new class538(64);

    @OriginalMember(owner = "client!ca", name = "c", descriptor = "Lwu;")
    private class557 field8680;

    @OriginalMember(owner = "client!ca", name = "i", descriptor = "S")
    public static short field8686 = 320;

    @OriginalMember(owner = "client!ca", name = "d", descriptor = "I")
    public static int field8681;

    @OriginalMember(owner = "client!ca", name = "e", descriptor = "I")
    public static int field8682;

    @OriginalMember(owner = "client!ca", name = "f", descriptor = "I")
    public static int field8683;

    @OriginalMember(owner = "client!ca", name = "g", descriptor = "I")
    public static int field8684;

    @OriginalMember(owner = "client!ca", name = "h", descriptor = "I")
    public static int field8685;

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "Lwu;")
    public static class557 field8678;

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(B)V")
    public final void method3564(byte arg0) {
        if (arg0 != -3) {
            return;
        }
        field8682++;
        class538 var2 = this.field8679;
        synchronized (this.field8679) {
            this.field8679.method3210(false);
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(IZ)Lqfa;")
    public final class326 method3565(int arg0, boolean arg1) {
        field8684++;
        class538 var3 = this.field8679;
        class326 var4;
        synchronized (this.field8679) {
            var4 = (class326) this.field8679.method3200((long) arg0, -19983);
        }
        if (var4 != null) {
            return var4;
        }
        class557 var5 = this.field8680;
        byte[] var6;
        synchronized (this.field8680) {
            var6 = this.field8680.method3322(31, arg0, (byte) 105);
        }
        class326 var7 = new class326();
        if (var6 != null) {
            var7.method1907(11589, new class26(var6));
        }
        class538 var8 = this.field8679;
        synchronized (this.field8679) {
            this.field8679.method3199((byte) 78, var7, (long) arg0);
        }
        if (arg1) {
            this.field8679 = null;
        }
        return var7;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(I)V")
    public static void method3566(int arg0) {
        field8678 = null;
        if (arg0 != 31) {
            field8681 = -29;
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(BI)V")
    public final void method3567(byte arg0, int arg1) {
        field8685++;
        class538 var3 = this.field8679;
        synchronized (this.field8679) {
            this.field8679.method3204((byte) -99, arg1);
        }
        if (arg0 > -110) {
            field8678 = null;
        }
    }

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "(I)V")
    public final void method3568(int arg0) {
        field8683++;
        class538 var2 = this.field8679;
        synchronized (this.field8679) {
            this.field8679.method3202((byte) 127);
            if (arg0 != 320) {
                method3566(-85);
            }
        }
    }

    @OriginalMember(owner = "client!ca", name = "<init>", descriptor = "(Lwj;ILwu;)V")
    public class610(class121 arg0, int arg1, class557 arg2) {
        this.field8680 = arg2;
        this.field8680.method3333(31, 3443);
    }
}
