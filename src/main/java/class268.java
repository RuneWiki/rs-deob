import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fh")
public class class268 {

    @OriginalMember(owner = "client!fh", name = "g", descriptor = "Lad;")
    private class19 field3340 = new class19(64);

    @OriginalMember(owner = "client!fh", name = "k", descriptor = "I")
    public int field3344 = 0;

    @OriginalMember(owner = "client!fh", name = "i", descriptor = "Ltf;")
    private class701 field3342;

    @OriginalMember(owner = "client!fh", name = "j", descriptor = "I")
    public int field3343;

    @OriginalMember(owner = "client!fh", name = "f", descriptor = "I")
    public static int field3339 = 0;

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "I")
    public static int field3335;

    @OriginalMember(owner = "client!fh", name = "c", descriptor = "I")
    public static int field3336;

    @OriginalMember(owner = "client!fh", name = "d", descriptor = "I")
    public static int field3337;

    @OriginalMember(owner = "client!fh", name = "e", descriptor = "I")
    public static int field3338;

    @OriginalMember(owner = "client!fh", name = "h", descriptor = "I")
    public static int field3341;

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "Lfg;")
    public static class174 field3334;

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(II)V")
    public final void method1577(int arg0, int arg1) {
        class19 var3 = this.field3340;
        synchronized (this.field3340) {
            this.field3340.method83((byte) -2, arg1);
        }
        field3338++;
        if (arg0 != 64) {
            this.field3343 = 96;
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(I)V")
    public final void method1578(int arg0) {
        field3336++;
        class19 var2 = this.field3340;
        synchronized (this.field3340) {
            this.field3340.method80((byte) -72);
            int var3 = -81 % ((arg0 + 28) / 37);
        }
    }

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "(II)Lot;")
    public final class226 method1579(int arg0, int arg1) {
        if (arg1 >= -38) {
            return null;
        }
        field3335++;
        class19 var3 = this.field3340;
        class226 var4;
        synchronized (this.field3340) {
            var4 = (class226) this.field3340.method78(0, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class701 var5 = this.field3342;
        byte[] var6;
        synchronized (this.field3342) {
            var6 = this.field3342.method3854((byte) 111, 4, arg0);
        }
        class226 var7 = new class226();
        var7.field2787 = arg0;
        var7.field2793 = this;
        if (var6 != null) {
            var7.method1361(0, new class115(var6));
        }
        var7.method1358((byte) -47);
        class19 var8 = this.field3340;
        synchronized (this.field3340) {
            this.field3340.method92(1, (long) arg0, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(Lnp;I)Liq;")
    public static final class202 method1580(class115 arg0, int arg1) {
        field3341++;
        class176 var2 = class309.method1779(arg0, -121);
        if (arg1 != 28065) {
            method1581(-94);
        }
        int var3 = arg0.method631(false);
        int var4 = arg0.method631(false);
        return new class202(var2.field1965, var2.field1962, var2.field1967, var2.field1970, var2.field1972, var2.field1971, var2.field1973, var2.field1969, var2.field1968, var3, var4);
    }

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "(I)V")
    public static void method1581(int arg0) {
        if (arg0 == 4) {
            field3334 = null;
        }
    }

    @OriginalMember(owner = "client!fh", name = "c", descriptor = "(I)V")
    public final void method1582(int arg0) {
        field3337++;
        class19 var2 = this.field3340;
        synchronized (this.field3340) {
            if (arg0 != 0) {
                field3339 = 14;
            }
            this.field3340.method88(64);
        }
    }

    @OriginalMember(owner = "client!fh", name = "<init>", descriptor = "(Lqh;ILtf;)V")
    public class268(class320 arg0, int arg1, class701 arg2) {
        this.field3342 = arg2;
        this.field3343 = this.field3342.method3883(4, 0);
    }
}
