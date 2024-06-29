import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ut")
public class class127 {

    @OriginalMember(owner = "client!ut", name = "e", descriptor = "Lde;")
    public class534 field1812 = new class534(20);

    @OriginalMember(owner = "client!ut", name = "l", descriptor = "Lde;")
    private class534 field1819 = new class534(64);

    @OriginalMember(owner = "client!ut", name = "j", descriptor = "Lnd;")
    private class547 field1817;

    @OriginalMember(owner = "client!ut", name = "f", descriptor = "Lnd;")
    public class547 field1813;

    @OriginalMember(owner = "client!ut", name = "h", descriptor = "I")
    public static int field1815 = 0;

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "I")
    public static int field1808 = -1;

    @OriginalMember(owner = "client!ut", name = "c", descriptor = "I")
    public static int field1810;

    @OriginalMember(owner = "client!ut", name = "d", descriptor = "I")
    public static int field1811;

    @OriginalMember(owner = "client!ut", name = "g", descriptor = "I")
    public static int field1814;

    @OriginalMember(owner = "client!ut", name = "i", descriptor = "I")
    public static int field1816;

    @OriginalMember(owner = "client!ut", name = "k", descriptor = "I")
    public static int field1818;

    @OriginalMember(owner = "client!ut", name = "m", descriptor = "I")
    public static int field1820;

    @OriginalMember(owner = "client!ut", name = "b", descriptor = "Lcv;")
    public static class570 field1809;

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(BI)V")
    public final void method952(byte arg0, int arg1) {
        if (arg0 <= 24) {
            return;
        }
        field1811++;
        class534 var3 = this.field1819;
        synchronized (this.field1819) {
            this.field1819.method3070(arg1, 119);
        }
        class534 var4 = this.field1812;
        synchronized (this.field1812) {
            this.field1812.method3070(arg1, 125);
        }
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(I)V")
    public final void method953(int arg0) {
        class534 var2 = this.field1819;
        synchronized (this.field1819) {
            this.field1819.method3065(true);
        }
        field1820++;
        class534 var3 = this.field1812;
        synchronized (this.field1812) {
            if (arg0 >= 118) {
                this.field1812.method3065(true);
            }
        }
    }

    @OriginalMember(owner = "client!ut", name = "b", descriptor = "(I)V")
    public static void method954(int arg0) {
        field1809 = null;
        int var1 = 21 % ((-arg0 - 30) / 60);
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(II)Lkb;")
    public final class692 method955(int arg0, int arg1) {
        field1816++;
        class534 var3 = this.field1819;
        class692 var4;
        synchronized (this.field1819) {
            var4 = (class692) this.field1819.method3079((long) arg0, arg1 ^ arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class547 var5 = this.field1817;
        byte[] var6;
        synchronized (this.field1817) {
            var6 = this.field1817.method3153(arg0, 0, 46);
        }
        class692 var7 = new class692();
        var7.field9600 = this;
        if (var6 != null) {
            var7.method3878(0, new class461(var6));
        }
        class534 var8 = this.field1819;
        synchronized (this.field1819) {
            this.field1819.method3077((byte) -38, (long) arg0, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!ut", name = "c", descriptor = "(I)V")
    public final void method956(int arg0) {
        class534 var2 = this.field1819;
        synchronized (this.field1819) {
            this.field1819.method3064(false);
        }
        field1810++;
        class534 var3 = this.field1812;
        synchronized (this.field1812) {
            this.field1812.method3064(false);
        }
        if (arg0 != -32307) {
            this.field1817 = null;
        }
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(IB)V")
    public static final void method957(int arg0, byte arg1) {
        class687.field9574.method3070(arg0, 121);
        field1814++;
        class60.field844.method3070(arg0, 125);
        class272.field3411.method3070(arg0, 126);
        if (arg1 != 17) {
            method954(-58);
        }
        class327.field4192.method3070(arg0, arg1 ^ 0x66);
    }

    @OriginalMember(owner = "client!ut", name = "<init>", descriptor = "(Lal;ILnd;Lnd;)V")
    public class127(class102 arg0, int arg1, class547 arg2, class547 arg3) {
        this.field1817 = arg2;
        this.field1813 = arg3;
        this.field1817.method3178((byte) 127, 46);
    }
}
