import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rq")
public class class39 {

    @OriginalMember(owner = "client!rq", name = "c", descriptor = "Lka;")
    private class473 field577 = new class473(64);

    @OriginalMember(owner = "client!rq", name = "n", descriptor = "I")
    public int field588 = 0;

    @OriginalMember(owner = "client!rq", name = "h", descriptor = "Ldk;")
    private class421 field582;

    @OriginalMember(owner = "client!rq", name = "m", descriptor = "I")
    public int field587;

    @OriginalMember(owner = "client!rq", name = "f", descriptor = "I")
    public static int field580 = 2;

    @OriginalMember(owner = "client!rq", name = "k", descriptor = "Lub;")
    public static class301 field585 = new class301("", 16);

    @OriginalMember(owner = "client!rq", name = "o", descriptor = "Lrb;")
    public static class283 field589 = new class283(81, 7);

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "I")
    public static int field575;

    @OriginalMember(owner = "client!rq", name = "b", descriptor = "I")
    public static int field576;

    @OriginalMember(owner = "client!rq", name = "d", descriptor = "I")
    public static int field578;

    @OriginalMember(owner = "client!rq", name = "e", descriptor = "I")
    public static int field579;

    @OriginalMember(owner = "client!rq", name = "g", descriptor = "I")
    public static int field581;

    @OriginalMember(owner = "client!rq", name = "i", descriptor = "I")
    public static int field583;

    @OriginalMember(owner = "client!rq", name = "j", descriptor = "I")
    public static int field584;

    @OriginalMember(owner = "client!rq", name = "l", descriptor = "I")
    public static int field586;

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(I)V")
    public final void method269(int arg0) {
        class473 var2 = this.field577;
        synchronized (this.field577) {
            this.field577.method2774((byte) -60);
        }
        field581++;
        if (arg0 != 0) {
            field580 = 8;
        }
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(II)V")
    public final void method270(int arg0, int arg1) {
        field575++;
        class473 var3 = this.field577;
        synchronized (this.field577) {
            this.field577.method2779(14896, arg1);
        }
        if (arg0 <= 54) {
            this.field588 = 80;
        }
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(Z)V")
    public static final void method271(boolean arg0) {
        field583++;
        if (!arg0) {
            method275(true, 1, null, -56);
        }
        class63.method421(10, arg0);
        class206.method1320(0);
        System.gc();
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(IB)Ltf;")
    public final class534 method272(int arg0, byte arg1) {
        field576++;
        class473 var3 = this.field577;
        class534 var4;
        synchronized (this.field577) {
            var4 = (class534) this.field577.method2767((long) arg0, 0);
        }
        if (var4 != null) {
            return var4;
        }
        class421 var5 = this.field582;
        byte[] var6;
        synchronized (this.field582) {
            var6 = this.field582.method2512(4, (byte) -93, arg0);
        }
        class534 var7 = new class534();
        var7.field7858 = arg0;
        var7.field7868 = this;
        if (var6 != null) {
            var7.method3161(new class319(var6), 127);
        }
        if (arg1 != -7) {
            this.method270(-15, -92);
        }
        var7.method3163(-30668);
        class473 var8 = this.field577;
        synchronized (this.field577) {
            this.field577.method2777(-1025, var7, (long) arg0);
            return var7;
        }
    }

    @OriginalMember(owner = "client!rq", name = "b", descriptor = "(II)Z")
    public static final boolean method273(int arg0, int arg1) {
        field586++;
        for (class440 var2 = (class440) class391.field5638.method3137(0); var2 != null; var2 = (class440) class391.field5638.method3132(0)) {
            if (class339.method2062((byte) 73, var2.field6337) && ((long) arg0) == var2.field6334) {
                return true;
            }
        }
        int var3 = 29 / ((arg1 + 33) / 35);
        return false;
    }

    @OriginalMember(owner = "client!rq", name = "c", descriptor = "(II)V")
    public static final void method274(int arg0, int arg1) {
        class197 var2 = null;
        for (int var3 = arg0; var3 < arg1; var3++) {
            class11 var4 = class348.field5000[var3];
            if (var4 != null) {
                for (int var5 = 0; var5 < class177.field2664; var5++) {
                    for (int var6 = 0; var6 < class124.field1916; var6++) {
                        var2 = var4.method86(var6, var5, var2);
                        if (var2 != null) {
                            int var7 = var6 << class295.field3991;
                            int var8 = var5 << class295.field3991;
                            for (int var9 = var3 - 1; var9 >= 0; var9--) {
                                class11 var10 = class348.field5000[var9];
                                if (var10 != null) {
                                    int var11 = var4.method85(var6, var5) - var10.method85(var6, var5);
                                    int var12 = var4.method85(var6 + 1, var5) - var10.method85(var6 + 1, var5);
                                    int var13 = var4.method85(var6 + 1, var5 + 1) - var10.method85(var6 + 1, var5 + 1);
                                    int var14 = var4.method85(var6, var5 + 1) - var10.method85(var6, var5 + 1);
                                    var10.method84(var2, var7, (var11 + var12 + var13 + var14) / 4, var8, 0, false);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(ZILat;I)V")
    public static final void method275(boolean arg0, int arg1, class444 arg2, int arg3) {
        field584++;
        if (arg2 == null) {
            return;
        }
        if (arg2.field6425 != null) {
            class414 var4 = new class414();
            var4.field5896 = arg2;
            var4.field5900 = arg2.field6425;
            class47.method313(var4);
        }
        class484.field6965 = arg2.field6392;
        class478.field6914 = arg2.field6469;
        class478.field6916 = arg2.field6510;
        class107.field1737 = arg1;
        class284.field3850 = arg3;
        class375.field5390 = arg0;
        class358.field5165 = arg2.field6483;
        class168.field2567 = arg2.field6481;
        class151.method1093(arg2, 126);
    }

    @OriginalMember(owner = "client!rq", name = "b", descriptor = "(I)V")
    public final void method276(int arg0) {
        class473 var2 = this.field577;
        synchronized (this.field577) {
            this.field577.method2764(-769);
        }
        field579++;
        if (arg0 >= -126) {
            this.field588 = 123;
        }
    }

    @OriginalMember(owner = "client!rq", name = "c", descriptor = "(I)V")
    public static void method277(int arg0) {
        field589 = null;
        int var1 = -34 % ((9 - arg0) / 39);
        field585 = null;
    }

    @OriginalMember(owner = "client!rq", name = "<init>", descriptor = "(Lad;ILdk;)V")
    public class39(class12 arg0, int arg1, class421 arg2) {
        this.field582 = arg2;
        this.field587 = this.field582.method2509(0, 4);
    }
}
