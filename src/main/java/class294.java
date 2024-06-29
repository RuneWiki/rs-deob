import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gs")
public class class294 {

    @OriginalMember(owner = "client!gs", name = "m", descriptor = "Lof;")
    private class328 field4643 = new class328(64);

    @OriginalMember(owner = "client!gs", name = "o", descriptor = "Lof;")
    public class328 field4645 = new class328(30);

    @OriginalMember(owner = "client!gs", name = "e", descriptor = "Lmn;")
    private class162 field4635;

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "Lmn;")
    public class162 field4631;

    @OriginalMember(owner = "client!gs", name = "d", descriptor = "Z")
    public static boolean field4634 = false;

    @OriginalMember(owner = "client!gs", name = "j", descriptor = "[I")
    public static int[] field4640 = new int[200];

    @OriginalMember(owner = "client!gs", name = "c", descriptor = "[Ljava/lang/String;")
    public static String[] field4633 = new String[200];

    @OriginalMember(owner = "client!gs", name = "l", descriptor = "I")
    public static int field4642 = 0;

    @OriginalMember(owner = "client!gs", name = "f", descriptor = "I")
    public static int field4636;

    @OriginalMember(owner = "client!gs", name = "g", descriptor = "I")
    public static int field4637;

    @OriginalMember(owner = "client!gs", name = "h", descriptor = "I")
    public static int field4638;

    @OriginalMember(owner = "client!gs", name = "i", descriptor = "I")
    public static int field4639;

    @OriginalMember(owner = "client!gs", name = "k", descriptor = "I")
    public static int field4641;

    @OriginalMember(owner = "client!gs", name = "n", descriptor = "I")
    public static int field4644;

    @OriginalMember(owner = "client!gs", name = "p", descriptor = "I")
    public int field4646;

    @OriginalMember(owner = "client!gs", name = "b", descriptor = "Ljl;")
    public static class495 field4632;

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(II)V")
    public final void method1970(int arg0, int arg1) {
        this.field4646 = arg1;
        field4638++;
        class328 var3 = this.field4645;
        synchronized (this.field4645) {
            if (arg0 != 21100) {
                this.field4643 = null;
            }
            this.field4645.method2189(false);
        }
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(I)V")
    public final void method1971(int arg0) {
        field4641++;
        class328 var2 = this.field4643;
        synchronized (this.field4643) {
            this.field4643.method2189(false);
        }
        class328 var3 = this.field4645;
        synchronized (this.field4645) {
            if (arg0 != 200) {
                this.method1971(-25);
            }
            this.field4645.method2189(false);
        }
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(BI)Ljp;")
    public final class279 method1972(byte arg0, int arg1) {
        field4637++;
        class328 var3 = this.field4643;
        class279 var4;
        synchronized (this.field4643) {
            var4 = (class279) this.field4643.method2191((byte) -73, (long) arg1);
            if (arg0 != -58) {
                this.field4646 = -35;
            }
        }
        if (var4 != null) {
            return var4;
        }
        class162 var5 = this.field4635;
        byte[] var6;
        synchronized (this.field4635) {
            var6 = this.field4635.method1004(class297.method1994((byte) -88, arg1), false, class203.method1387(512, arg1));
        }
        class279 var7 = new class279();
        var7.field4407 = arg1;
        var7.field4414 = this;
        if (var6 != null) {
            var7.method1879(true, new class208(var6));
        }
        class328 var8 = this.field4643;
        synchronized (this.field4643) {
            this.field4643.method2188(-125, (long) arg1, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!gs", name = "b", descriptor = "(I)V")
    public static void method1973(int arg0) {
        field4633 = null;
        if (arg0 > 43) {
            field4640 = null;
            field4632 = null;
        }
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(Lsk;BI)V")
    public static final void method1974(class341 arg0, byte arg1, int arg2) {
        field4639++;
        int var3 = -86 / ((55 - arg1) / 45);
        if (class12.field123) {
            class12.field123 = false;
            arg2 = 0;
        }
        if (class172.field2507 != null && class172.field2507.method2265(-59, arg0)) {
            return;
        }
        class172.field2507 = arg0;
        class1.field5 = class246.method1705((byte) 28);
        class481.field7331 = arg2;
        class429.field6512 = arg2;
        if (class429.field6512 != 0) {
            class405.field6105 = class428.field6486;
            class211.field3472 = class416.field6322;
            class53.field713 = class15.field161;
            class234.field3854 = class137.field1885;
            class192.field2844 = class33.field342;
            class226.field3779 = class80.field1185;
            class168.field2458 = class509.field7594;
            class526.field7761 = class272.field4341;
            class94.field1366 = class481.field7325;
            class36.field371 = class188.field2734;
            return;
        }
        class418.method2669((byte) 106);
    }

    @OriginalMember(owner = "client!gs", name = "b", descriptor = "(II)V")
    public final void method1975(int arg0, int arg1) {
        class328 var3 = this.field4643;
        synchronized (this.field4643) {
            this.field4643.method2202(0, arg0);
        }
        field4644++;
        if (arg1 != -1) {
            method1974(null, (byte) 86, -87);
        }
        class328 var4 = this.field4645;
        synchronized (this.field4645) {
            this.field4645.method2202(0, arg0);
        }
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(B)V")
    public final void method1976(byte arg0) {
        class328 var2 = this.field4643;
        synchronized (this.field4643) {
            this.field4643.method2187(-1);
            int var3 = -22 / ((-arg0 - 24) / 58);
        }
        field4636++;
        class328 var4 = this.field4645;
        synchronized (this.field4645) {
            this.field4645.method2187(-1);
        }
    }

    @OriginalMember(owner = "client!gs", name = "<init>", descriptor = "(Lpr;ILmn;Lmn;)V")
    public class294(class236 arg0, int arg1, class162 arg2, class162 arg3) {
        this.field4635 = arg2;
        this.field4631 = arg3;
        int var5 = this.field4635.method1023(127) - 1;
        this.field4635.method1008(var5, (byte) -21);
    }
}
