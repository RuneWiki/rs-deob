import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jk")
public class class446 {

    @OriginalMember(owner = "client!jk", name = "c", descriptor = "Lnj;")
    private class162 field6567 = new class162(16);

    @OriginalMember(owner = "client!jk", name = "f", descriptor = "Lmg;")
    private class101 field6570;

    @OriginalMember(owner = "client!jk", name = "h", descriptor = "Lnj;")
    public static class162 field6572 = new class162(4);

    @OriginalMember(owner = "client!jk", name = "j", descriptor = "Lwj;")
    public static class270 field6574 = new class270(67, 5);

    @OriginalMember(owner = "client!jk", name = "k", descriptor = "Lwj;")
    public static class270 field6575 = new class270(52, 18);

    @OriginalMember(owner = "client!jk", name = "m", descriptor = "Lwj;")
    public static class270 field6577 = new class270(54, 9);

    @OriginalMember(owner = "client!jk", name = "n", descriptor = "[I")
    public static int[] field6578 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

    @OriginalMember(owner = "client!jk", name = "o", descriptor = "[I")
    public static int[] field6579 = new int[4096];

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "I")
    public static int field6565;

    @OriginalMember(owner = "client!jk", name = "b", descriptor = "I")
    public static int field6566;

    @OriginalMember(owner = "client!jk", name = "d", descriptor = "I")
    public static int field6568;

    @OriginalMember(owner = "client!jk", name = "e", descriptor = "I")
    public static int field6569;

    @OriginalMember(owner = "client!jk", name = "g", descriptor = "I")
    public static int field6571;

    @OriginalMember(owner = "client!jk", name = "i", descriptor = "I")
    public static int field6573;

    @OriginalMember(owner = "client!jk", name = "l", descriptor = "[J")
    public static long[] field6576;

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(ZI)V")
    public final void method2641(boolean arg0, int arg1) {
        field6569++;
        if (!arg0) {
            class162 var3 = this.field6567;
            synchronized (this.field6567) {
                this.field6567.method1065((byte) -95, arg1);
            }
        }
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(B)V")
    public final void method2642(byte arg0) {
        class162 var2 = this.field6567;
        synchronized (this.field6567) {
            this.field6567.method1068(0);
        }
        int var3 = -38 / ((20 - arg0) / 39);
        field6568++;
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(I)V")
    public static final void method2643(int arg0) {
        field6571++;
        int var1 = 0;
        if (class20.field269.method3084((byte) -71, class152.field2332)) {
            int var2 = var1 | 0x1;
            int var3 = var2 | 0x10;
            int var4 = var3 | 0x20;
            int var5 = var4 | 0x2;
            var1 = var5 | 0x4;
        }
        if (!class20.field269.field7632) {
            var1 |= 0x40;
        }
        class492.method2882(var1, arg0 ^ 0xE27);
        if (arg0 != -3623) {
            field6574 = null;
        }
        class78.field1141.method2106(var1, (byte) 118);
        class328.field4480.method3094(8, var1);
        class158.field2401.method2204(var1, (byte) -92);
        class27.field357.method1477((byte) 90, var1);
        class171.method1114(-24389, var1);
        class17.method107(var1, 0);
        class227.method1413(1153, var1);
        class276.method1644(101, var1);
        if (class492.field7178 == 10) {
            class448.method2651(28, (byte) 112);
        } else if (class492.field7178 == 30) {
            class448.method2651(25, (byte) 112);
            return;
        }
    }

    @OriginalMember(owner = "client!jk", name = "b", descriptor = "(B)V")
    public final void method2644(byte arg0) {
        field6566++;
        if (arg0 > -57) {
            this.field6567 = null;
        }
        class162 var2 = this.field6567;
        synchronized (this.field6567) {
            this.field6567.method1066(4080);
        }
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(II)Lst;")
    public final class298 method2645(int arg0, int arg1) {
        field6565++;
        class162 var3 = this.field6567;
        class298 var4;
        synchronized (this.field6567) {
            if (arg0 < 76) {
                field6578 = null;
            }
            var4 = (class298) this.field6567.method1073((long) arg1, false);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field6570.method727(arg1, 30, -105);
        class298 var6 = new class298();
        if (var5 != null) {
            var6.method1748(14776, new class391(var5));
        }
        class162 var7 = this.field6567;
        synchronized (this.field6567) {
            this.field6567.method1072((long) arg1, var6, false);
            return var6;
        }
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(B[[[Lhg;)V")
    public static final void method2646(byte arg0, class486[][][] arg1) {
        for (int var2 = 0; var2 < arg1.length; var2++) {
            class486[][] var4 = arg1[var2];
            for (int var5 = 0; var5 < var4.length; var5++) {
                for (int var6 = 0; var6 < var4[var5].length; var6++) {
                    class486 var7 = var4[var5][var6];
                    if (var7 != null) {
                        if (var7.field7100 instanceof class503) {
                            ((class503) var7.field7100).method485(-102);
                        }
                        if (var7.field7103 instanceof class503) {
                            ((class503) var7.field7103).method485(-115);
                        }
                        if (var7.field7105 instanceof class503) {
                            ((class503) var7.field7105).method485(-119);
                        }
                        if (var7.field7114 instanceof class503) {
                            ((class503) var7.field7114).method485(-99);
                        }
                        if (var7.field7118 instanceof class503) {
                            ((class503) var7.field7118).method485(-113);
                        }
                        for (class164 var8 = var7.field7115; var8 != null; var8 = var8.field2467) {
                            class116 var9 = var8.field2468;
                            if (var9 instanceof class503) {
                                ((class503) var9).method485(-107);
                            }
                        }
                    }
                }
            }
        }
        int var3 = 107 / ((arg0 - 42) / 46);
        field6573++;
    }

    @OriginalMember(owner = "client!jk", name = "b", descriptor = "(I)V")
    public static void method2647(int arg0) {
        field6578 = null;
        field6579 = null;
        field6574 = null;
        field6576 = null;
        field6572 = null;
        field6575 = null;
        field6577 = null;
        if (arg0 != -31) {
            method2643(-105);
        }
    }

    @OriginalMember(owner = "client!jk", name = "<init>", descriptor = "(Lal;ILmg;)V")
    public class446(class66 arg0, int arg1, class101 arg2) {
        this.field6570 = arg2;
        this.field6570.method753(30, -91);
    }
}
