import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jj")
public class class121 {

    @OriginalMember(owner = "client!jj", name = "f", descriptor = "Lfc;")
    private class262 field1582 = new class262(64);

    @OriginalMember(owner = "client!jj", name = "d", descriptor = "Lni;")
    private class522 field1580;

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "I")
    public int field1577;

    @OriginalMember(owner = "client!jj", name = "c", descriptor = "I")
    public static int field1579 = 0;

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "I")
    public static int field1578;

    @OriginalMember(owner = "client!jj", name = "e", descriptor = "I")
    public static int field1581;

    @OriginalMember(owner = "client!jj", name = "g", descriptor = "I")
    public static int field1583;

    @OriginalMember(owner = "client!jj", name = "h", descriptor = "I")
    public static int field1584;

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(I)V", line = 4)
    public final void method784(int arg0) {
        field1581++;
        class262 var2 = this.field1582;
        synchronized (this.field1582) {
            this.field1582.method1563(4);
            if (arg0 > -102) {
                this.field1577 = 56;
            }
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(II)Lld;", line = 21)
    public final class171 method785(int arg0, int arg1) {
        field1578++;
        class262 var3 = this.field1582;
        class171 var4;
        synchronized (this.field1582) {
            var4 = (class171) this.field1582.method1571(-125, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class522 var5 = this.field1580;
        byte[] var6;
        synchronized (this.field1580) {
            if (arg1 != 16) {
                this.field1577 = 120;
            }
            var6 = this.field1580.method2885(arg0, 16, false);
        }
        class171 var7 = new class171();
        if (var6 != null) {
            var7.method990(new class611(var6), -2);
        }
        class262 var8 = this.field1582;
        synchronized (this.field1582) {
            this.field1582.method1574((long) arg0, var7, (byte) -80);
            return var7;
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(B)V", line = 52)
    public final void method786(byte arg0) {
        if (arg0 <= 9) {
            this.method785(-33, -125);
        }
        class262 var2 = this.field1582;
        synchronized (this.field1582) {
            this.field1582.method1575((byte) 30);
        }
        field1583++;
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(BI)V", line = 65)
    public final void method787(byte arg0, int arg1) {
        int var3 = 84 / ((arg0 + 8) / 63);
        class262 var4 = this.field1582;
        synchronized (this.field1582) {
            this.field1582.method1569((byte) 62, arg1);
        }
        field1584++;
    }

    @OriginalMember(owner = "client!jj", name = "<init>", descriptor = "(Lrga;ILni;)V", line = 86)
    public class121(class242 arg0, int arg1, class522 arg2) {
        this.field1580 = arg2;
        if (this.field1580 == null) {
            this.field1577 = 0;
        } else {
            this.field1577 = this.field1580.method2901(0, 16);
        }
    }
}
