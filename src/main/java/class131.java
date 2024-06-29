import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hh")
public class class131 {

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "Lfc;")
    private class262 field1686 = new class262(16);

    @OriginalMember(owner = "client!hh", name = "e", descriptor = "Lni;")
    private class522 field1690;

    @OriginalMember(owner = "client!hh", name = "d", descriptor = "[F")
    public static float[] field1689 = new float[4];

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "I")
    public static int field1687 = -1;

    @OriginalMember(owner = "client!hh", name = "h", descriptor = "I")
    public static int field1693 = 0;

    @OriginalMember(owner = "client!hh", name = "c", descriptor = "I")
    public static int field1688;

    @OriginalMember(owner = "client!hh", name = "f", descriptor = "I")
    public static int field1691;

    @OriginalMember(owner = "client!hh", name = "g", descriptor = "I")
    public static int field1692;

    @OriginalMember(owner = "client!hh", name = "i", descriptor = "I")
    public static int field1694;

    @OriginalMember(owner = "client!hh", name = "j", descriptor = "I")
    public static int field1695;

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(I)V")
    public final void method824(int arg0) {
        class262 var2 = this.field1686;
        synchronized (this.field1686) {
            this.field1686.method1563(97);
        }
        if (arg0 != 21185) {
            method827();
        }
        field1688++;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(IB)V")
    public final void method825(int arg0, byte arg1) {
        class262 var3 = this.field1686;
        synchronized (this.field1686) {
            this.field1686.method1569((byte) 62, arg0);
        }
        field1692++;
        if (arg1 >= -117) {
            method826((byte) -111);
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(B)V")
    public static void method826(byte arg0) {
        if (arg0 == -67) {
            field1689 = null;
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "()V")
    public static final void method827() {
        class350.field4641 = class350.field4643;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(ZLjava/lang/String;I)V")
    public static final void method828(boolean arg0, String arg1, int arg2) {
        class359.method2064(arg0, arg1, -1, -1, -1);
        if (arg2 > -61) {
            method828(false, null, 41);
        }
        field1694++;
    }

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "(IB)Lql;")
    public final class736 method829(int arg0, byte arg1) {
        field1695++;
        class262 var3 = this.field1686;
        class736 var4;
        synchronized (this.field1686) {
            var4 = (class736) this.field1686.method1571(-124, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        if (arg1 != -87) {
            this.field1690 = null;
        }
        class522 var5 = this.field1690;
        byte[] var6;
        synchronized (this.field1690) {
            var6 = this.field1690.method2885(arg0, 30, false);
        }
        class736 var7 = new class736();
        if (var6 != null) {
            var7.method4122(new class611(var6), (byte) -16);
        }
        class262 var8 = this.field1686;
        synchronized (this.field1686) {
            this.field1686.method1574((long) arg0, var7, (byte) -80);
            return var7;
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(Z)V")
    public final void method830(boolean arg0) {
        field1691++;
        if (arg0) {
            class262 var2 = this.field1686;
            synchronized (this.field1686) {
                this.field1686.method1575((byte) -104);
            }
        }
    }

    @OriginalMember(owner = "client!hh", name = "<init>", descriptor = "(Lrga;ILni;)V")
    public class131(class242 arg0, int arg1, class522 arg2) {
        this.field1690 = arg2;
        this.field1690.method2901(0, 30);
    }
}
