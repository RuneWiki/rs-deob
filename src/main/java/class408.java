import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public class class408 {

    @OriginalMember(owner = "client!ua", name = "g", descriptor = "Lmo;")
    private class336 field5587 = new class336(64);

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "Lnl;")
    private class435 field5581;

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "I")
    public static int field5582 = 0;

    @OriginalMember(owner = "client!ua", name = "h", descriptor = "Lmo;")
    public static class336 field5588 = new class336(50);

    @OriginalMember(owner = "client!ua", name = "c", descriptor = "I")
    public static int field5583;

    @OriginalMember(owner = "client!ua", name = "e", descriptor = "I")
    public static int field5585;

    @OriginalMember(owner = "client!ua", name = "f", descriptor = "I")
    public static int field5586;

    @OriginalMember(owner = "client!ua", name = "i", descriptor = "I")
    public static int field5589;

    @OriginalMember(owner = "client!ua", name = "d", descriptor = "Lam;")
    public static class199 field5584;

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(B)V")
    public final void method2442(byte arg0) {
        class336 var2 = this.field5587;
        synchronized (this.field5587) {
            this.field5587.method2119(0);
            int var3 = -121 % ((arg0 + 43) / 57);
        }
        field5589++;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(I)V")
    public static void method2443(int arg0) {
        field5588 = null;
        field5584 = null;
        if (arg0 != 17075) {
            field5584 = null;
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(II)Lo;")
    public final class125 method2444(int arg0, int arg1) {
        field5583++;
        class336 var3 = this.field5587;
        class125 var4;
        synchronized (this.field5587) {
            var4 = (class125) this.field5587.method2113(0, (long) arg0);
            if (arg1 <= 108) {
                this.method2446(true);
            }
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field5581.method2633(31, arg0, 102);
        class125 var6 = new class125();
        if (var5 != null) {
            var6.method946(31, new class161(var5));
        }
        class336 var7 = this.field5587;
        synchronized (this.field5587) {
            this.field5587.method2116((long) arg0, (byte) -125, var6);
            return var6;
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(IB)V")
    public final void method2445(int arg0, byte arg1) {
        field5586++;
        int var3 = 24 / ((84 - arg1) / 32);
        class336 var4 = this.field5587;
        synchronized (this.field5587) {
            this.field5587.method2120((byte) -96, arg0);
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(Z)V")
    public final void method2446(boolean arg0) {
        field5585++;
        class336 var2 = this.field5587;
        synchronized (this.field5587) {
            this.field5587.method2109(-1);
        }
        if (arg0) {
            this.method2442((byte) -110);
        }
    }

    @OriginalMember(owner = "client!ua", name = "<init>", descriptor = "(Llo;ILnl;)V")
    public class408(class280 arg0, int arg1, class435 arg2) {
        this.field5581 = arg2;
        this.field5581.method2638(1, 31);
    }
}
