import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fl")
public class class480 {

    @OriginalMember(owner = "client!fl", name = "k", descriptor = "Lhu;")
    private class76 field6636 = new class76(64);

    @OriginalMember(owner = "client!fl", name = "p", descriptor = "I")
    public int field6641 = 0;

    @OriginalMember(owner = "client!fl", name = "d", descriptor = "Lr;")
    private class110 field6629;

    @OriginalMember(owner = "client!fl", name = "m", descriptor = "I")
    public int field6638;

    @OriginalMember(owner = "client!fl", name = "f", descriptor = "Lhu;")
    public static class76 field6631 = new class76(32);

    @OriginalMember(owner = "client!fl", name = "i", descriptor = "Lmc;")
    public static class78 field6634 = new class78(46, 2);

    @OriginalMember(owner = "client!fl", name = "n", descriptor = "Lh;")
    public static class434 field6639 = new class434(49, -1);

    @OriginalMember(owner = "client!fl", name = "o", descriptor = "Lh;")
    public static class434 field6640 = new class434(52, 9);

    @OriginalMember(owner = "client!fl", name = "b", descriptor = "I")
    public static int field6627;

    @OriginalMember(owner = "client!fl", name = "c", descriptor = "I")
    public static int field6628;

    @OriginalMember(owner = "client!fl", name = "e", descriptor = "I")
    public static int field6630;

    @OriginalMember(owner = "client!fl", name = "g", descriptor = "I")
    public static int field6632;

    @OriginalMember(owner = "client!fl", name = "h", descriptor = "I")
    public static int field6633;

    @OriginalMember(owner = "client!fl", name = "l", descriptor = "I")
    public static int field6637;

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "[Lns;")
    public static class255[] field6626;

    @OriginalMember(owner = "client!fl", name = "j", descriptor = "[Lhb;")
    public static class471[] field6635;

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(IB)V")
    public final void method2798(int arg0, byte arg1) {
        field6637++;
        if (arg1 == 9) {
            class76 var3 = this.field6636;
            synchronized (this.field6636) {
                this.field6636.method496(arg0, 92);
            }
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(B)V")
    public final void method2799(byte arg0) {
        if (arg0 > -28) {
            return;
        }
        class76 var2 = this.field6636;
        synchronized (this.field6636) {
            this.field6636.method495(-101);
        }
        field6630++;
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(II)I")
    public static final int method2800(int arg0, int arg1) {
        int var2 = -71 / ((arg0 - 76) / 40);
        field6628++;
        return arg1 >>> 7;
    }

    @OriginalMember(owner = "client!fl", name = "b", descriptor = "(II)Lmg;")
    public final class91 method2801(int arg0, int arg1) {
        field6632++;
        class76 var3 = this.field6636;
        class91 var4;
        synchronized (this.field6636) {
            var4 = (class91) this.field6636.method493((byte) 19, (long) arg1);
            int var5 = -64 % ((arg0 - 17) / 52);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var6 = this.field6629.method702((byte) -67, arg1, 4);
        class91 var7 = new class91();
        var7.field1333 = this;
        var7.field1321 = arg1;
        if (var6 != null) {
            var7.method583(-1, new class32(var6));
        }
        var7.method581(-1);
        class76 var8 = this.field6636;
        synchronized (this.field6636) {
            this.field6636.method505((long) arg1, var7, 103);
            return var7;
        }
    }

    @OriginalMember(owner = "client!fl", name = "b", descriptor = "(B)V")
    public static void method2802(byte arg0) {
        field6635 = null;
        field6631 = null;
        field6639 = null;
        if (arg0 < 52) {
            method2800(125, -40);
        }
        field6634 = null;
        field6626 = null;
        field6640 = null;
    }

    @OriginalMember(owner = "client!fl", name = "c", descriptor = "(B)V")
    public static final void method2803(byte arg0) {
        if (arg0 <= -23) {
            field6627++;
            for (int var1 = 0; var1 < 100; var1++) {
                class102.field1468[var1] = true;
            }
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(I)V")
    public final void method2804(int arg0) {
        field6633++;
        class76 var2 = this.field6636;
        synchronized (this.field6636) {
            this.field6636.method502(arg0);
        }
    }

    @OriginalMember(owner = "client!fl", name = "<init>", descriptor = "(Ldn;ILr;)V")
    public class480(class329 arg0, int arg1, class110 arg2) {
        this.field6629 = arg2;
        this.field6638 = this.field6629.method694(4, (byte) 119);
    }
}
