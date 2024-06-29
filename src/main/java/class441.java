import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mba")
public class class441 {

    @OriginalMember(owner = "client!mba", name = "k", descriptor = "Lqj;")
    private class535 field6347 = new class535(64);

    @OriginalMember(owner = "client!mba", name = "l", descriptor = "Luq;")
    private class172 field6348;

    @OriginalMember(owner = "client!mba", name = "n", descriptor = "Lpf;")
    public class607 field6350;

    @OriginalMember(owner = "client!mba", name = "d", descriptor = "I")
    public static int field6340 = 0;

    @OriginalMember(owner = "client!mba", name = "c", descriptor = "I")
    public static int field6339 = 16777215;

    @OriginalMember(owner = "client!mba", name = "m", descriptor = "Lsja;")
    public static class11 field6349;

    @OriginalMember(owner = "client!mba", name = "o", descriptor = "Ljb;")
    public static class519 field6351;

    @OriginalMember(owner = "client!mba", name = "a", descriptor = "I")
    public static int field6337;

    @OriginalMember(owner = "client!mba", name = "b", descriptor = "I")
    public static int field6338;

    @OriginalMember(owner = "client!mba", name = "e", descriptor = "I")
    public static int field6341;

    @OriginalMember(owner = "client!mba", name = "f", descriptor = "I")
    public static int field6342;

    @OriginalMember(owner = "client!mba", name = "g", descriptor = "I")
    public static int field6343;

    @OriginalMember(owner = "client!mba", name = "h", descriptor = "I")
    public static int field6344;

    @OriginalMember(owner = "client!mba", name = "i", descriptor = "I")
    public static int field6345;

    @OriginalMember(owner = "client!mba", name = "j", descriptor = "I")
    public static int field6346;

    @OriginalMember(owner = "client!mba", name = "p", descriptor = "I")
    public static int field6352;

    static {
        new class654("", 73);
        field6349 = new class11(16);
        field6351 = new class519(54, 2);
    }

    @OriginalMember(owner = "client!mba", name = "a", descriptor = "(IB)Lpu;", line = 9)
    public final class588 method2629(int arg0, byte arg1) {
        field6337++;
        class535 var3 = this.field6347;
        class588 var4;
        synchronized (this.field6347) {
            var4 = (class588) this.field6347.method3109((byte) 99, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class172 var5 = this.field6348;
        byte[] var6;
        synchronized (this.field6348) {
            var6 = this.field6348.method1188(32, arg1 - 18006, arg0);
        }
        class588 var7 = new class588();
        var7.field7979 = this;
        if (var6 != null) {
            var7.method3308((byte) 120, new class254(var6));
        }
        class535 var8 = this.field6347;
        synchronized (this.field6347) {
            this.field6347.method3108((long) arg0, arg1 ^ 0xFFFFC006, var7);
        }
        if (arg1 != -41) {
            field6351 = null;
        }
        return var7;
    }

    @OriginalMember(owner = "client!mba", name = "a", descriptor = "(I)V", line = 40)
    public static final void method2630(int arg0) {
        field6346++;
        class535 var1 = class263.field3874;
        synchronized (class263.field3874) {
            class263.field3874.method3113(-128);
        }
        class535 var2 = class465.field6593;
        synchronized (class465.field6593) {
            class465.field6593.method3113(-127);
            if (arg0 != 2) {
                field6339 = -5;
            }
        }
    }

    @OriginalMember(owner = "client!mba", name = "a", descriptor = "(B)V", line = 56)
    public final void method2631(byte arg0) {
        field6343++;
        class535 var2 = this.field6347;
        synchronized (this.field6347) {
            if (arg0 <= 48) {
                method2630(120);
            }
            this.field6347.method3103(-11294);
        }
    }

    @OriginalMember(owner = "client!mba", name = "a", descriptor = "(Z)V", line = 76)
    public static void method2632(boolean arg0) {
        if (!arg0) {
            field6351 = null;
            field6349 = null;
        }
    }

    @OriginalMember(owner = "client!mba", name = "b", descriptor = "(Z)I", line = 96)
    public static final int method2633(boolean arg0) {
        if (arg0) {
            field6340 = -12;
        }
        field6341++;
        return class773.field10630;
    }

    @OriginalMember(owner = "client!mba", name = "a", descriptor = "(BI)V", line = 110)
    public final void method2634(byte arg0, int arg1) {
        if (arg0 != 109) {
            return;
        }
        class535 var3 = this.field6347;
        synchronized (this.field6347) {
            this.field6347.method3101(false, arg1);
        }
        field6338++;
    }

    @OriginalMember(owner = "client!mba", name = "b", descriptor = "(I)V", line = 124)
    public final void method2635(int arg0) {
        class535 var2 = this.field6347;
        synchronized (this.field6347) {
            this.field6347.method3113(-128);
        }
        field6342++;
        if (arg0 != 54) {
            method2630(84);
        }
    }

    @OriginalMember(owner = "client!mba", name = "a", descriptor = "(ILdt;)V", line = 138)
    public static final void method2636(int arg0, class254 arg1) {
        field6344++;
        int var2 = arg1.method1673(-32768);
        class438.field6320 = new class526[var2];
        if (arg0 != 16) {
            return;
        }
        for (int var3 = 0; var3 < var2; var3++) {
            class438.field6320[var3] = new class526();
            class438.field6320[var3].field7300 = arg1.method1673(arg0 - 32784);
            class438.field6320[var3].field7305 = arg1.method1705((byte) -105);
        }
        class488.field6803 = arg1.method1673(-32768);
        class187.field2449 = arg1.method1673(-32768);
        class371.field5408 = arg1.method1673(-32768);
        class447.field6426 = new class154[class187.field2449 + 1 - class488.field6803];
        for (int var4 = 0; var4 < class371.field5408; var4++) {
            int var5 = arg1.method1673(arg0 - 32784);
            class154 var6 = class447.field6426[var5] = new class154();
            var6.field3869 = arg1.method1731((byte) 64);
            var6.field3873 = arg1.method1672(-16516);
            var6.field2086 = var5 + class488.field6803;
            var6.field2082 = arg1.method1705((byte) 27);
            var6.field2085 = arg1.method1705((byte) -100);
        }
        class654.field8816 = arg1.method1672(-16516);
        class436.field6310 = true;
    }

    @OriginalMember(owner = "client!mba", name = "<init>", descriptor = "(Lkw;ILuq;Lpf;)V", line = 195)
    public class441(class263 arg0, int arg1, class172 arg2, class607 arg3) {
        this.field6348 = arg2;
        this.field6348.method1175(32, (byte) 112);
        this.field6350 = arg3;
    }
}
