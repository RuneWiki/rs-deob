import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ap")
public class class480 {

    @OriginalMember(owner = "client!ap", name = "d", descriptor = "Lqr;")
    private class65 field6577 = new class65(16);

    @OriginalMember(owner = "client!ap", name = "i", descriptor = "Lwu;")
    private class376 field6582;

    @OriginalMember(owner = "client!ap", name = "g", descriptor = "Lhda;")
    public static class752 field6580 = new class752(30, -1);

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "I")
    public static int field6574;

    @OriginalMember(owner = "client!ap", name = "b", descriptor = "I")
    public static int field6575;

    @OriginalMember(owner = "client!ap", name = "c", descriptor = "I")
    public static int field6576;

    @OriginalMember(owner = "client!ap", name = "e", descriptor = "I")
    public static int field6578;

    @OriginalMember(owner = "client!ap", name = "f", descriptor = "I")
    public static int field6579;

    @OriginalMember(owner = "client!ap", name = "h", descriptor = "I")
    public static int field6581;

    @OriginalMember(owner = "client!ap", name = "j", descriptor = "I")
    public static int field6583;

    @OriginalMember(owner = "client!ap", name = "k", descriptor = "[I")
    public static int[] field6584;

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(I)Z")
    public static final boolean method2700(int arg0) {
        field6579++;
        if (arg0 == -1) {
            return class320.field4576 != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(II)V")
    public final void method2701(int arg0, int arg1) {
        class65 var3 = this.field6577;
        synchronized (this.field6577) {
            if (arg1 != -1) {
                return;
            }
            this.field6577.method553(arg0, arg1 - 15781);
        }
        field6576++;
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(B)V")
    public static final void method2702(byte arg0) {
        class65 var1 = class600.field7880;
        synchronized (class600.field7880) {
            if (arg0 != 17) {
                field6584 = null;
            }
            class600.field7880.method558(arg0 - 17);
        }
        field6578++;
        class65 var2 = class66.field825;
        synchronized (class66.field825) {
            class66.field825.method558(0);
        }
    }

    @OriginalMember(owner = "client!ap", name = "b", descriptor = "(II)Llca;")
    public final class645 method2703(int arg0, int arg1) {
        field6574++;
        class65 var3 = this.field6577;
        class645 var4;
        synchronized (this.field6577) {
            var4 = (class645) this.field6577.method552(arg0 - 4, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class376 var5 = this.field6582;
        byte[] var6;
        synchronized (this.field6582) {
            var6 = this.field6582.method2218((byte) 109, 30, arg1);
        }
        class645 var7 = new class645();
        if (var6 != null) {
            var7.method3533(new class677(var6), arg0 - 9);
        }
        if (arg0 != 8) {
            field6584 = null;
        }
        class65 var8 = this.field6577;
        synchronized (this.field6577) {
            this.field6577.method556((byte) 0, (long) arg1, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!ap", name = "b", descriptor = "(B)V")
    public final void method2704(byte arg0) {
        class65 var2 = this.field6577;
        synchronized (this.field6577) {
            this.field6577.method558(0);
            if (arg0 >= -50) {
                this.method2701(54, -117);
            }
        }
        field6583++;
    }

    @OriginalMember(owner = "client!ap", name = "c", descriptor = "(B)V")
    public final void method2705(byte arg0) {
        field6575++;
        class65 var2 = this.field6577;
        synchronized (this.field6577) {
            if (arg0 != 109) {
                field6580 = null;
            }
            this.field6577.method561((byte) -78);
        }
    }

    @OriginalMember(owner = "client!ap", name = "<init>", descriptor = "(Lms;ILwu;)V")
    public class480(class763 arg0, int arg1, class376 arg2) {
        this.field6582 = arg2;
        this.field6582.method2195(30, 0);
    }

    @OriginalMember(owner = "client!ap", name = "b", descriptor = "(I)V")
    public static void method2706(int arg0) {
        if (arg0 != -15046) {
            field6580 = null;
        }
        field6580 = null;
        field6584 = null;
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(ILjava/lang/String;BZ)V")
    public static final void method2707(int arg0, String arg1, byte arg2, boolean arg3) {
        field6581++;
        class713.method4002((byte) 70);
        class528.method2948((byte) 46);
        class153.method1121(-121);
        class545.method3045(arg3, arg1, arg0, (byte) -119);
        class116.method958(102);
        class466.method2639(0, class341.field4807);
        class286.method1772((byte) -93, class341.field4807);
        class190.method1297(9749, class84.field1023, class341.field4807);
        class230.method1464(5123);
        class431.method2486(class679.field9485, -104);
        class312.method1915(-101);
        class505.method2837((byte) 81);
        if (class15.field215 == 3) {
            class66.method566(4, -21035);
        } else if (class15.field215 == 7) {
            class66.method566(8, -21035);
        } else if (class15.field215 == 10) {
            class66.method566(11, arg2 ^ 0x5222);
        } else if (class15.field215 == 1 || class15.field215 == 2) {
            class466.method2638(-4);
        }
        if (arg2 != -9) {
            field6584 = null;
        }
    }
}
