import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sr")
public class class435 {

    @OriginalMember(owner = "client!sr", name = "f", descriptor = "Lof;")
    private class328 field6562 = new class328(64);

    @OriginalMember(owner = "client!sr", name = "n", descriptor = "Lof;")
    public class328 field6570 = new class328(64);

    @OriginalMember(owner = "client!sr", name = "d", descriptor = "Lmn;")
    private class162 field6560;

    @OriginalMember(owner = "client!sr", name = "i", descriptor = "Lmn;")
    public class162 field6565;

    @OriginalMember(owner = "client!sr", name = "j", descriptor = "I")
    public static int field6566 = 0;

    @OriginalMember(owner = "client!sr", name = "e", descriptor = "Lbi;")
    public static class104 field6561 = new class104(17, -1);

    @OriginalMember(owner = "client!sr", name = "o", descriptor = "Z")
    public static boolean field6571 = false;

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "I")
    public static int field6557;

    @OriginalMember(owner = "client!sr", name = "b", descriptor = "I")
    public static int field6558;

    @OriginalMember(owner = "client!sr", name = "c", descriptor = "I")
    public static int field6559;

    @OriginalMember(owner = "client!sr", name = "g", descriptor = "I")
    public static int field6563;

    @OriginalMember(owner = "client!sr", name = "h", descriptor = "I")
    public static int field6564;

    @OriginalMember(owner = "client!sr", name = "k", descriptor = "I")
    public static int field6567;

    @OriginalMember(owner = "client!sr", name = "l", descriptor = "I")
    public static int field6568;

    @OriginalMember(owner = "client!sr", name = "m", descriptor = "I")
    public static int field6569;

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(IB)Lhj;")
    public final class114 method2736(int arg0, byte arg1) {
        field6563++;
        class328 var3 = this.field6562;
        class114 var4;
        synchronized (this.field6562) {
            var4 = (class114) this.field6562.method2191((byte) -73, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class162 var5 = this.field6560;
        byte[] var6;
        synchronized (this.field6560) {
            var6 = this.field6560.method1004(34, false, arg0);
        }
        class114 var7 = new class114();
        var7.field1595 = this;
        if (var6 != null) {
            var7.method734(0, new class208(var6));
        }
        class328 var8 = this.field6562;
        synchronized (this.field6562) {
            this.field6562.method2188(-124, (long) arg0, var7);
            if (arg1 > -7) {
                this.field6562 = null;
            }
            return var7;
        }
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(B)V")
    public static void method2737(byte arg0) {
        field6561 = null;
        if (arg0 < 94) {
            method2737((byte) -55);
        }
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(IIB)I")
    public static final int method2738(int arg0, int arg1, byte arg2) {
        field6559++;
        int var3 = arg1 >>> 31;
        return arg2 == -34 ? (arg1 + var3) / arg0 - var3 : 73;
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(IILza;I)V")
    public static final void method2739(int arg0, int arg1, class497 arg2, int arg3) {
        field6569++;
        if (arg3 != 4) {
            return;
        }
        class307.field4813 = arg2;
        class183.field2649 = new class341[arg1][arg0];
        if (class487.field7386 != null) {
            class141.field1909 = class244.method1699(class487.field7386[4], class487.field7386[0], class487.field7386[5], (byte) -55, class487.field7386[2], class487.field7386[3], class487.field7386[1]);
        }
        class148.field1996 = new class341();
        class244.method1698((byte) -5);
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(I)V")
    public final void method2740(int arg0) {
        class328 var2 = this.field6562;
        synchronized (this.field6562) {
            this.field6562.method2189(false);
        }
        field6557++;
        class328 var3 = this.field6570;
        synchronized (this.field6570) {
            this.field6570.method2189(false);
        }
        if (arg0 != 5) {
            this.method2736(-21, (byte) 62);
        }
    }

    @OriginalMember(owner = "client!sr", name = "b", descriptor = "(I)V")
    public final void method2741(int arg0) {
        field6568++;
        if (arg0 != 64) {
            method2739(-107, 117, null, 125);
        }
        class328 var2 = this.field6562;
        synchronized (this.field6562) {
            this.field6562.method2187(-1);
        }
        class328 var3 = this.field6570;
        synchronized (this.field6570) {
            this.field6570.method2187(arg0 - 65);
        }
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(II)V")
    public final void method2742(int arg0, int arg1) {
        class328 var3 = this.field6562;
        synchronized (this.field6562) {
            this.field6562.method2202(0, arg0);
        }
        int var4 = 75 % ((arg1 - 28) / 58);
        field6567++;
        class328 var5 = this.field6570;
        synchronized (this.field6570) {
            this.field6570.method2202(0, arg0);
        }
    }

    @OriginalMember(owner = "client!sr", name = "b", descriptor = "(IIB)V")
    public final void method2743(int arg0, int arg1, byte arg2) {
        int var4 = 92 / ((71 - arg2) / 55);
        field6564++;
        this.field6562 = new class328(arg1);
        this.field6570 = new class328(arg0);
    }

    @OriginalMember(owner = "client!sr", name = "<init>", descriptor = "(Lpr;ILmn;Lmn;)V")
    public class435(class236 arg0, int arg1, class162 arg2, class162 arg3) {
        this.field6560 = arg2;
        this.field6565 = arg3;
        this.field6560.method1008(34, (byte) -21);
    }
}
