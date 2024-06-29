import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bm")
public class class123 {

    @OriginalMember(owner = "client!bm", name = "i", descriptor = "Lqj;")
    private class535 field1704 = new class535(64);

    @OriginalMember(owner = "client!bm", name = "k", descriptor = "I")
    public int field1706 = 0;

    @OriginalMember(owner = "client!bm", name = "c", descriptor = "Luq;")
    private class172 field1698;

    @OriginalMember(owner = "client!bm", name = "b", descriptor = "I")
    public int field1697;

    @OriginalMember(owner = "client!bm", name = "f", descriptor = "Z")
    public static boolean field1701 = false;

    @OriginalMember(owner = "client!bm", name = "h", descriptor = "Ljb;")
    public static class519 field1703 = new class519(68, -2);

    @OriginalMember(owner = "client!bm", name = "l", descriptor = "[Loea;")
    public static class622[] field1707 = new class622[128];

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "I")
    public static int field1696;

    @OriginalMember(owner = "client!bm", name = "d", descriptor = "I")
    public static int field1699;

    @OriginalMember(owner = "client!bm", name = "e", descriptor = "I")
    public static int field1700;

    @OriginalMember(owner = "client!bm", name = "g", descriptor = "I")
    public static int field1702;

    @OriginalMember(owner = "client!bm", name = "j", descriptor = "I")
    public static int field1705;

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(IZ)V", line = 6)
    public final void method885(int arg0, boolean arg1) {
        field1699++;
        class535 var3 = this.field1704;
        synchronized (this.field1704) {
            this.field1704.method3101(arg1, arg0);
        }
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(I)V", line = 16)
    public static void method886(int arg0) {
        int var1 = 117 / ((arg0 - 6) / 37);
        field1707 = null;
        field1703 = null;
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(B)V", line = 27)
    public final void method887(byte arg0) {
        class535 var2 = this.field1704;
        synchronized (this.field1704) {
            if (arg0 >= -110) {
                return;
            }
            this.field1704.method3113(-128);
        }
        field1702++;
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(IB)Lmea;", line = 47)
    public final class452 method888(int arg0, byte arg1) {
        field1696++;
        class535 var3 = this.field1704;
        class452 var4;
        synchronized (this.field1704) {
            var4 = (class452) this.field1704.method3109((byte) 122, (long) arg0);
        }
        int var5 = -19 % ((arg1 + 72) / 48);
        if (var4 != null) {
            return var4;
        }
        class172 var6 = this.field1698;
        byte[] var7;
        synchronized (this.field1698) {
            var7 = this.field1698.method1188(4, -18047, arg0);
        }
        class452 var8 = new class452();
        var8.field6489 = this;
        var8.field6476 = arg0;
        if (var7 != null) {
            var8.method2691(new class254(var7), true);
        }
        var8.method2683(false);
        class535 var9 = this.field1704;
        synchronized (this.field1704) {
            this.field1704.method3108((long) arg0, 16337, var8);
            return var8;
        }
    }

    @OriginalMember(owner = "client!bm", name = "b", descriptor = "(B)V", line = 85)
    public final void method889(byte arg0) {
        class535 var2 = this.field1704;
        synchronized (this.field1704) {
            this.field1704.method3103(-11294);
        }
        field1705++;
        if (arg0 <= 83) {
            this.method885(48, true);
        }
    }

    @OriginalMember(owner = "client!bm", name = "<init>", descriptor = "(Lkw;ILuq;)V", line = 108)
    public class123(class263 arg0, int arg1, class172 arg2) {
        this.field1698 = arg2;
        this.field1697 = this.field1698.method1175(4, (byte) 102);
    }
}
