import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mh")
public class class153 {

    @OriginalMember(owner = "client!mh", name = "g", descriptor = "Lad;")
    private class19 field1691 = new class19(128);

    @OriginalMember(owner = "client!mh", name = "j", descriptor = "Ltf;")
    private class701 field1694;

    @OriginalMember(owner = "client!mh", name = "k", descriptor = "I")
    public static int field1695 = 0;

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "I")
    public static int field1686;

    @OriginalMember(owner = "client!mh", name = "c", descriptor = "I")
    public static int field1687;

    @OriginalMember(owner = "client!mh", name = "d", descriptor = "I")
    public static int field1688;

    @OriginalMember(owner = "client!mh", name = "e", descriptor = "I")
    public static int field1689;

    @OriginalMember(owner = "client!mh", name = "f", descriptor = "I")
    public static int field1690;

    @OriginalMember(owner = "client!mh", name = "h", descriptor = "I")
    public static int field1692;

    @OriginalMember(owner = "client!mh", name = "i", descriptor = "I")
    public static int field1693;

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "J")
    public static long field1685;

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(II)Lov;")
    public final class379 method829(int arg0, int arg1) {
        field1688++;
        class19 var3 = this.field1691;
        class379 var4;
        synchronized (this.field1691) {
            var4 = (class379) this.field1691.method78(0, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class701 var5 = this.field1694;
        byte[] var6;
        synchronized (this.field1694) {
            var6 = this.field1694.method3854((byte) 43, arg0, arg1);
        }
        class379 var7 = new class379();
        if (var6 != null) {
            var7.method2187(new class115(var6), arg0 - 10338);
        }
        class19 var8 = this.field1691;
        synchronized (this.field1691) {
            this.field1691.method92(1, (long) arg1, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(I)V")
    public final void method830(int arg0) {
        if (arg0 != 1) {
            field1695 = -32;
        }
        field1686++;
        class19 var2 = this.field1691;
        synchronized (this.field1691) {
            this.field1691.method88(arg0 ^ 0x70);
        }
    }

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "(II)V")
    public static final void method831(int arg0, int arg1) {
        field1690++;
        if (arg0 != 1) {
            method833((byte) -13, null);
        }
        class581.field8240 = arg1;
        class602.field8467.method88(123);
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(B)V")
    public final void method832(byte arg0) {
        int var2 = 22 % ((34 - arg0) / 43);
        class19 var3 = this.field1691;
        synchronized (this.field1691) {
            this.field1691.method80((byte) 61);
        }
        field1693++;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(BLtf;)V")
    public static final void method833(byte arg0, class701 arg1) {
        class24.field186 = arg1;
        int var2 = -9 / ((-arg0 - 40) / 59);
        field1687++;
    }

    @OriginalMember(owner = "client!mh", name = "c", descriptor = "(II)V")
    public final void method834(int arg0, int arg1) {
        class19 var3 = this.field1691;
        synchronized (this.field1691) {
            this.field1691.method83((byte) -2, arg1);
        }
        field1689++;
        if (arg0 != 0) {
            this.field1691 = null;
        }
    }

    @OriginalMember(owner = "client!mh", name = "<init>", descriptor = "(Lqh;ILtf;)V")
    public class153(class320 arg0, int arg1, class701 arg2) {
        this.field1694 = arg2;
        this.field1694.method3883(1, 0);
    }
}
