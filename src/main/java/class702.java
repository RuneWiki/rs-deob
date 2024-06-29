import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bea")
public class class702 {

    @OriginalMember(owner = "client!bea", name = "k", descriptor = "Ltb;")
    private class450 field9924 = new class450(64);

    @OriginalMember(owner = "client!bea", name = "l", descriptor = "Ltb;")
    public class450 field9925 = new class450(60);

    @OriginalMember(owner = "client!bea", name = "j", descriptor = "Lpl;")
    private class612 field9923;

    @OriginalMember(owner = "client!bea", name = "b", descriptor = "Lpl;")
    public class612 field9915;

    @OriginalMember(owner = "client!bea", name = "h", descriptor = "Lae;")
    public static class40 field9921 = new class40();

    @OriginalMember(owner = "client!bea", name = "a", descriptor = "I")
    public static int field9914;

    @OriginalMember(owner = "client!bea", name = "c", descriptor = "I")
    public static int field9916;

    @OriginalMember(owner = "client!bea", name = "d", descriptor = "I")
    public static int field9917;

    @OriginalMember(owner = "client!bea", name = "e", descriptor = "I")
    public static int field9918;

    @OriginalMember(owner = "client!bea", name = "f", descriptor = "I")
    public static int field9919;

    @OriginalMember(owner = "client!bea", name = "g", descriptor = "I")
    public static int field9920;

    @OriginalMember(owner = "client!bea", name = "i", descriptor = "I")
    public static int field9922;

    @OriginalMember(owner = "client!bea", name = "m", descriptor = "I")
    public int field9926;

    @OriginalMember(owner = "client!bea", name = "n", descriptor = "I")
    public static int field9927;

    @OriginalMember(owner = "client!bea", name = "o", descriptor = "I")
    public static int field9928;

    @OriginalMember(owner = "client!bea", name = "a", descriptor = "(II)V")
    public final void method3937(int arg0, int arg1) {
        if (arg1 != 29206) {
            this.field9924 = null;
        }
        field9917++;
        class450 var3 = this.field9924;
        synchronized (this.field9924) {
            this.field9924.method2411(true, arg0);
        }
        class450 var4 = this.field9925;
        synchronized (this.field9925) {
            this.field9925.method2411(true, arg0);
        }
    }

    @OriginalMember(owner = "client!bea", name = "b", descriptor = "(II)V")
    public static final void method3938(int arg0, int arg1) {
        class590.field8287 = 3;
        class550.field7645 = -1;
        class382.field4823 = arg0;
        if (arg1 != 9192) {
            method3940(107);
        }
        class673.field9471 = 100;
        field9918++;
    }

    @OriginalMember(owner = "client!bea", name = "a", descriptor = "(Lr;I)V")
    public static final void method3939(class566 arg0, int arg1) {
        field9922++;
        if (class20.field314 == class376.field4748.field6470) {
            return;
        }
        if (arg1 <= 4) {
            method3939(null, 124);
        }
        if (class270.field3423 != null && class684.method3847(class376.field4748.field6470, 104, arg0)) {
            class20.field314 = class376.field4748.field6470;
        }
    }

    @OriginalMember(owner = "client!bea", name = "a", descriptor = "(I)V")
    public static void method3940(int arg0) {
        field9921 = null;
        if (arg0 > -82) {
            method3938(-17, 75);
        }
    }

    @OriginalMember(owner = "client!bea", name = "b", descriptor = "(I)V")
    public final void method3941(int arg0) {
        if (arg0 != 25313) {
            return;
        }
        field9920++;
        class450 var2 = this.field9924;
        synchronized (this.field9924) {
            this.field9924.method2412((byte) 106);
        }
        class450 var3 = this.field9925;
        synchronized (this.field9925) {
            this.field9925.method2412((byte) 35);
        }
    }

    @OriginalMember(owner = "client!bea", name = "c", descriptor = "(II)V")
    public final void method3942(int arg0, int arg1) {
        this.field9926 = arg1;
        field9914++;
        class450 var3 = this.field9925;
        synchronized (this.field9925) {
            this.field9925.method2406(18385);
            if (arg0 != -12336) {
                this.method3941(50);
            }
        }
    }

    @OriginalMember(owner = "client!bea", name = "a", descriptor = "(BI)Liv;")
    public final class388 method3943(byte arg0, int arg1) {
        field9919++;
        class450 var3 = this.field9924;
        class388 var4;
        synchronized (this.field9924) {
            var4 = (class388) this.field9924.method2418((long) arg1, (byte) 100);
        }
        if (arg0 != 12) {
            this.field9924 = null;
        }
        if (var4 != null) {
            return var4;
        }
        class612 var5 = this.field9923;
        byte[] var6;
        synchronized (this.field9923) {
            var6 = this.field9923.method3365(class425.method2259(arg1, arg0 ^ 0xC), arg0 ^ 0xFFFFFF8E, class214.method1272(arg1, 7836));
        }
        class388 var7 = new class388();
        var7.field4883 = this;
        var7.field4877 = arg1;
        if (var6 != null) {
            var7.method2082(3, new class630(var6));
        }
        class450 var8 = this.field9924;
        synchronized (this.field9924) {
            this.field9924.method2409((long) arg1, var7, 1);
            return var7;
        }
    }

    @OriginalMember(owner = "client!bea", name = "a", descriptor = "(B)V")
    public final void method3944(byte arg0) {
        field9916++;
        class450 var2 = this.field9924;
        synchronized (this.field9924) {
            if (arg0 != -115) {
                method3939(null, -66);
            }
            this.field9924.method2406(arg0 ^ 0xFFFFB85C);
        }
        class450 var3 = this.field9925;
        synchronized (this.field9925) {
            this.field9925.method2406(18385);
        }
    }

    @OriginalMember(owner = "client!bea", name = "<init>", descriptor = "(Lrf;ILpl;Lpl;)V")
    public class702(class112 arg0, int arg1, class612 arg2, class612 arg3) {
        this.field9923 = arg2;
        this.field9915 = arg3;
        int var5 = this.field9923.method3342((byte) -107) - 1;
        this.field9923.method3349(var5, true);
    }
}
