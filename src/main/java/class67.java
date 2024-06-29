import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public class class67 {

    @OriginalMember(owner = "client!qb", name = "g", descriptor = "Laf;")
    private class39 field740 = new class39(128);

    @OriginalMember(owner = "client!qb", name = "k", descriptor = "Laf;")
    public class39 field744 = new class39(64);

    @OriginalMember(owner = "client!qb", name = "j", descriptor = "Lae;")
    public class283 field743;

    @OriginalMember(owner = "client!qb", name = "i", descriptor = "Lae;")
    private class283 field742;

    @OriginalMember(owner = "client!qb", name = "d", descriptor = "[I")
    public static int[] field737 = new int[1];

    @OriginalMember(owner = "client!qb", name = "h", descriptor = "Ljn;")
    public static class134 field741 = new class134(41, -2);

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "I")
    public static int field734;

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "I")
    public static int field735;

    @OriginalMember(owner = "client!qb", name = "c", descriptor = "I")
    public static int field736;

    @OriginalMember(owner = "client!qb", name = "e", descriptor = "I")
    public static int field738;

    @OriginalMember(owner = "client!qb", name = "f", descriptor = "I")
    public static int field739;

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(I)V")
    public final void method513(int arg0) {
        field739++;
        int var2 = 95 / ((arg0 - 32) / 56);
        class39 var3 = this.field740;
        synchronized (this.field740) {
            this.field740.method314(-2);
        }
        class39 var4 = this.field744;
        synchronized (this.field744) {
            this.field744.method314(-2);
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IB)Lsda;")
    public final class547 method514(int arg0, byte arg1) {
        field734++;
        class39 var3 = this.field740;
        class547 var4;
        synchronized (this.field740) {
            var4 = (class547) this.field740.method312(0, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class283 var5 = this.field742;
        byte[] var6;
        synchronized (this.field742) {
            var6 = this.field742.method1849(arg0, (byte) -93, 36);
        }
        class547 var7 = new class547();
        var7.field7614 = arg0;
        var7.field7608 = this;
        if (var6 != null) {
            var7.method3236(new class511(var6), (byte) -80);
        }
        var7.method3235(-65536);
        class39 var8 = this.field740;
        synchronized (this.field740) {
            this.field740.method305(var7, (long) arg0, 18320);
        }
        int var9 = -128 % ((arg1 - 12) / 41);
        return var7;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IZ)V")
    public final void method515(int arg0, boolean arg1) {
        class39 var3 = this.field740;
        synchronized (this.field740) {
            this.field740.method308(-1, arg0);
        }
        field738++;
        class39 var4 = this.field744;
        synchronized (this.field744) {
            this.field744.method308(-1, arg0);
            if (!arg1) {
                this.method513(-42);
            }
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(Z)V")
    public static void method516(boolean arg0) {
        field737 = null;
        field741 = null;
        if (arg0) {
            field741 = null;
        }
    }

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "(I)V")
    public final void method517(int arg0) {
        field735++;
        class39 var2 = this.field740;
        synchronized (this.field740) {
            this.field740.method319(-95);
        }
        class39 var3 = this.field744;
        synchronized (this.field744) {
            this.field744.method319(-126);
            int var4 = -115 / ((arg0 + 5) / 43);
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIB)V")
    public final void method518(int arg0, int arg1, byte arg2) {
        this.field740 = new class39(arg1);
        field736++;
        int var4 = 100 % ((arg2 - 71) / 54);
        this.field744 = new class39(arg0);
    }

    @OriginalMember(owner = "client!qb", name = "<init>", descriptor = "(Ljk;ILae;Lae;)V")
    public class67(class788 arg0, int arg1, class283 arg2, class283 arg3) {
        this.field743 = arg3;
        this.field742 = arg2;
        this.field742.method1867(36, (byte) 49);
    }
}
