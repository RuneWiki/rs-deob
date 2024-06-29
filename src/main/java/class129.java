import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!baa")
public class class129 {

    @OriginalMember(owner = "client!baa", name = "c", descriptor = "Lbh;")
    private class538 field1761 = new class538(64);

    @OriginalMember(owner = "client!baa", name = "a", descriptor = "Lwu;")
    public class557 field1759;

    @OriginalMember(owner = "client!baa", name = "e", descriptor = "Lwu;")
    private class557 field1763;

    @OriginalMember(owner = "client!baa", name = "d", descriptor = "I")
    public static int field1762 = 0;

    @OriginalMember(owner = "client!baa", name = "b", descriptor = "I")
    public static int field1760;

    @OriginalMember(owner = "client!baa", name = "f", descriptor = "I")
    public static int field1764;

    @OriginalMember(owner = "client!baa", name = "g", descriptor = "I")
    public static int field1765;

    @OriginalMember(owner = "client!baa", name = "h", descriptor = "I")
    public static int field1766;

    @OriginalMember(owner = "client!baa", name = "a", descriptor = "(B)V")
    public final void method824(byte arg0) {
        class538 var2 = this.field1761;
        synchronized (this.field1761) {
            if (arg0 != 89) {
                return;
            }
            this.field1761.method3202((byte) 127);
        }
        field1764++;
    }

    @OriginalMember(owner = "client!baa", name = "a", descriptor = "(BI)Lrha;")
    public final class589 method825(byte arg0, int arg1) {
        field1766++;
        class538 var3 = this.field1761;
        class589 var4;
        synchronized (this.field1761) {
            var4 = (class589) this.field1761.method3200((long) arg1, -19983);
        }
        if (var4 != null) {
            return var4;
        }
        class557 var5 = this.field1763;
        byte[] var6;
        synchronized (this.field1763) {
            var6 = this.field1763.method3322(3, arg1, (byte) 88);
        }
        class589 var7 = new class589();
        if (arg0 != -103) {
            return null;
        }
        var7.field8449 = this;
        if (var6 != null) {
            var7.method3498(new class26(var6), (byte) 31);
        }
        class538 var8 = this.field1761;
        synchronized (this.field1761) {
            this.field1761.method3199((byte) 78, var7, (long) arg1);
            return var7;
        }
    }

    @OriginalMember(owner = "client!baa", name = "b", descriptor = "(BI)V")
    public final void method826(byte arg0, int arg1) {
        field1760++;
        class538 var3 = this.field1761;
        synchronized (this.field1761) {
            this.field1761.method3204((byte) 63, arg1);
            if (arg0 > -63) {
                this.method824((byte) -64);
            }
        }
    }

    @OriginalMember(owner = "client!baa", name = "a", descriptor = "(I)V")
    public final void method827(int arg0) {
        field1765++;
        class538 var2 = this.field1761;
        synchronized (this.field1761) {
            this.field1761.method3210(false);
            int var3 = 56 / ((-arg0 - 28) / 37);
        }
    }

    @OriginalMember(owner = "client!baa", name = "<init>", descriptor = "(Lwj;ILwu;Lwu;)V")
    public class129(class121 arg0, int arg1, class557 arg2, class557 arg3) {
        this.field1759 = arg3;
        this.field1763 = arg2;
        this.field1763.method3333(3, 3443);
    }
}
