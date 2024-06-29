import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tfa")
public class class288 {

    @OriginalMember(owner = "client!tfa", name = "a", descriptor = "Luf;")
    private class380 field3794 = new class380(64);

    @OriginalMember(owner = "client!tfa", name = "l", descriptor = "Luf;")
    private class380 field3805 = new class380(100);

    @OriginalMember(owner = "client!tfa", name = "c", descriptor = "Lga;")
    private class332 field3796;

    @OriginalMember(owner = "client!tfa", name = "h", descriptor = "Lsj;")
    public static class666 field3801 = new class666();

    @OriginalMember(owner = "client!tfa", name = "j", descriptor = "I")
    public static int field3803 = 0;

    @OriginalMember(owner = "client!tfa", name = "b", descriptor = "I")
    public static int field3795;

    @OriginalMember(owner = "client!tfa", name = "d", descriptor = "I")
    public static int field3797;

    @OriginalMember(owner = "client!tfa", name = "e", descriptor = "I")
    public static int field3798;

    @OriginalMember(owner = "client!tfa", name = "f", descriptor = "I")
    public static int field3799;

    @OriginalMember(owner = "client!tfa", name = "g", descriptor = "I")
    public static int field3800;

    @OriginalMember(owner = "client!tfa", name = "i", descriptor = "I")
    public static int field3802;

    @OriginalMember(owner = "client!tfa", name = "k", descriptor = "I")
    public static int field3804;

    @OriginalMember(owner = "client!tfa", name = "a", descriptor = "(II)Lnt;", line = 5)
    public final class493 method1704(int arg0, int arg1) {
        field3798++;
        class380 var3 = this.field3805;
        synchronized (this.field3805) {
            if (arg0 != 100) {
                this.method1704(-60, -113);
            }
            class493 var4 = (class493) this.field3805.method2176(-128, (long) arg1);
            if (var4 == null) {
                var4 = new class493(arg1);
                this.field3805.method2174(var4, (long) arg1, (byte) -94);
            }
            return var4.method2810(96) ? var4 : null;
        }
    }

    @OriginalMember(owner = "client!tfa", name = "a", descriptor = "(I)V", line = 31)
    public static void method1705(int arg0) {
        if (arg0 != -26938) {
            field3804 = 12;
        }
        field3801 = null;
    }

    @OriginalMember(owner = "client!tfa", name = "b", descriptor = "(II)V", line = 42)
    public final void method1706(int arg0, int arg1) {
        class380 var3 = this.field3794;
        synchronized (this.field3794) {
            this.field3794.method2179(false, arg1);
        }
        field3800++;
        class380 var4 = this.field3805;
        synchronized (this.field3805) {
            this.field3805.method2179(false, arg1);
            if (arg0 != -1) {
                field3799 = 57;
            }
        }
    }

    @OriginalMember(owner = "client!tfa", name = "c", descriptor = "(II)Lhca;", line = 60)
    public final class186 method1707(int arg0, int arg1) {
        field3797++;
        class380 var3 = this.field3794;
        class186 var4;
        synchronized (this.field3794) {
            var4 = (class186) this.field3794.method2176(-124, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class332 var5 = this.field3796;
        byte[] var6;
        synchronized (this.field3796) {
            var6 = this.field3796.method1938(class131.method774(arg0, (byte) -111), class399.method2285(-1623128409, arg0), -17);
        }
        class186 var7 = new class186();
        var7.field2576 = arg0;
        var7.field2577 = this;
        if (var6 != null) {
            var7.method1233(126, new class157(var6));
        }
        var7.method1225(true);
        int var8 = 14 / ((arg1 + 28) / 47);
        class380 var9 = this.field3794;
        synchronized (this.field3794) {
            this.field3794.method2174(var7, (long) arg0, (byte) -34);
            return var7;
        }
    }

    @OriginalMember(owner = "client!tfa", name = "b", descriptor = "(I)V", line = 93)
    public final void method1708(int arg0) {
        class380 var2 = this.field3794;
        synchronized (this.field3794) {
            this.field3794.method2172(-15112);
        }
        field3795++;
        class380 var3 = this.field3805;
        synchronized (this.field3805) {
            this.field3805.method2172(-15112);
            int var4 = -119 / ((arg0 + 1) / 52);
        }
    }

    @OriginalMember(owner = "client!tfa", name = "c", descriptor = "(I)V", line = 108)
    public final void method1709(int arg0) {
        field3802++;
        class380 var2 = this.field3794;
        synchronized (this.field3794) {
            this.field3794.method2168((byte) -90);
        }
        class380 var3 = this.field3805;
        synchronized (this.field3805) {
            this.field3805.method2168((byte) -86);
            if (arg0 != 64) {
                method1705(44);
            }
        }
    }

    @OriginalMember(owner = "client!tfa", name = "<init>", descriptor = "(Lnq;ILga;Lga;Lga;)V", line = 142)
    public class288(class650 arg0, int arg1, class332 arg2, class332 arg3, class332 arg4) {
        this.field3796 = arg2;
        if (this.field3796 != null) {
            int var6 = this.field3796.method1933(-127) - 1;
            this.field3796.method1939(0, var6);
        }
        class64.method372(arg4, 2, arg3, true);
    }
}
