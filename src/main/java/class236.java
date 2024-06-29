import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public class class236 {

    @OriginalMember(owner = "client!lb", name = "d", descriptor = "I")
    private int field3627 = 0;

    @OriginalMember(owner = "client!lb", name = "h", descriptor = "Lqb;")
    private class117 field3631;

    @OriginalMember(owner = "client!lb", name = "c", descriptor = "[[S")
    public static short[][] field3626 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

    @OriginalMember(owner = "client!lb", name = "n", descriptor = "Z")
    public static boolean field3637 = false;

    @OriginalMember(owner = "client!lb", name = "o", descriptor = "Ljava/lang/String;")
    public static String field3638 = "K";

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "I")
    public static int field3624;

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "I")
    public static int field3625;

    @OriginalMember(owner = "client!lb", name = "e", descriptor = "I")
    public static int field3628;

    @OriginalMember(owner = "client!lb", name = "g", descriptor = "I")
    public static int field3630;

    @OriginalMember(owner = "client!lb", name = "i", descriptor = "I")
    public static int field3632;

    @OriginalMember(owner = "client!lb", name = "j", descriptor = "I")
    public static int field3633;

    @OriginalMember(owner = "client!lb", name = "l", descriptor = "I")
    public static int field3635;

    @OriginalMember(owner = "client!lb", name = "m", descriptor = "I")
    public static int field3636;

    @OriginalMember(owner = "client!lb", name = "f", descriptor = "Lba;")
    private class188 field3629;

    @OriginalMember(owner = "client!lb", name = "k", descriptor = "[[[Lwk;")
    public static class196[][][] field3634;

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(I)Lba;", line = 5)
    public final class188 method1630(int arg0) {
        field3625++;
        this.field3627 = 0;
        return arg0 == 24712 ? this.method1634(108) : (class188) null;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(BI)V", line = 19)
    public static final void method1631(byte arg0, int arg1) {
        field3632++;
        class347.field5503.method383((byte) -48);
        class347.field5503 = new class62(arg1);
        if (arg0 != -49) {
            field3638 = (String) null;
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "([Ljava/lang/Object;I[IIB)V", line = 31)
    public static final void method1632(Object[] arg0, int arg1, int[] arg2, int arg3, byte arg4) {
        if (arg4 != 78) {
            return;
        }
        field3628++;
        if (arg3 >= arg1) {
            return;
        }
        int var5 = arg3;
        int var6 = (arg3 + arg1) / 2;
        int var7 = arg2[var6];
        arg2[var6] = arg2[arg1];
        arg2[arg1] = var7;
        Object var8 = arg0[var6];
        arg0[var6] = arg0[arg1];
        arg0[arg1] = var8;
        for (int var9 = arg3; var9 < arg1; var9++) {
            if (arg2[var9] < ((var9 & 0x1) + var7)) {
                int var10 = arg2[var9];
                arg2[var9] = arg2[var5];
                arg2[var5] = var10;
                Object var11 = arg0[var9];
                arg0[var9] = arg0[var5];
                arg0[var5++] = var11;
            }
        }
        arg2[arg1] = arg2[var5];
        arg2[var5] = var7;
        arg0[arg1] = arg0[var5];
        arg0[var5] = var8;
        method1632(arg0, var5 - 1, arg2, arg3, (byte) 78);
        method1632(arg0, arg1, arg2, var5 + 1, (byte) 78);
    }

    @OriginalMember(owner = "client!lb", name = "<init>", descriptor = "(Lqb;)V", line = 146)
    public class236(class117 arg0) {
        this.field3631 = arg0;
    }

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "(I)V", line = 99)
    public static void method1633(int arg0) {
        field3638 = null;
        field3626 = (short[][]) null;
        if (arg0 == 32517) {
            field3634 = (class196[][][]) null;
        }
    }

    @OriginalMember(owner = "client!lb", name = "c", descriptor = "(I)Lba;", line = 111)
    public final class188 method1634(int arg0) {
        field3636++;
        if (this.field3627 > 0 && this.field3631.field1629[this.field3627 - 1] != this.field3629) {
            class188 var2 = this.field3629;
            this.field3629 = var2.field2835;
            return var2;
        }
        class188 var3;
        do {
            if (this.field3627 >= this.field3631.field1617) {
                if (arg0 <= 12) {
                    this.method1630(-20);
                }
                return null;
            }
            var3 = this.field3631.field1629[this.field3627++].field2835;
        } while (this.field3631.field1629[this.field3627 - 1] == var3);
        this.field3629 = var3.field2835;
        return var3;
    }

    @OriginalMember(owner = "client!lb", name = "d", descriptor = "(I)V", line = 155)
    public static final void method1635(int arg0) {
        class14.method86(5, (byte) -14);
        field3635++;
        class255.method1799(5, 997);
        class18.method139(true, 5);
        class352.method2439(5, (byte) -54);
        class298.method2108(5, false);
        class142.method994(true, 5);
        class103.method654(-78, 5);
        class72.method444(5, 0);
        class238.method1648((byte) 57, 5);
        class263.method1865(5, (byte) 111);
        class30.method214(5, (byte) -121);
        class310.method2192(5, -11598);
        class290.method2074((byte) -125, 5);
        class115.method748(5, (byte) -128);
        class12.method70(62, 5);
        class90.method568(5, (byte) 18);
        class70.method436(false, 5);
        class313.method2213((byte) 84, 5);
        class42.method258(-113, 50);
        class194.method1352(-65, 5);
        class241.method1702(5, 511);
        class110.field1516.method387(5, false);
        class290.field4561.method387(5, false);
        if (arg0 < 10) {
            method1636((byte) 99);
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(B)V", line = 192)
    public static final void method1636(byte arg0) {
        field3624++;
        class360.field5700.method378(0);
        if (arg0 < -16) {
            class332.field5309.method378(0);
        }
    }
}
