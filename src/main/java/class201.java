import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public class class201 {

    @OriginalMember(owner = "client!cc", name = "k", descriptor = "Loc;")
    private class59 field3636;

    @OriginalMember(owner = "client!cc", name = "g", descriptor = "Lkg;")
    private class132 field3632;

    @OriginalMember(owner = "client!cc", name = "i", descriptor = "Lb;")
    private class81 field3634;

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "[[S")
    public static short[][] field3627 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

    @OriginalMember(owner = "client!cc", name = "d", descriptor = "I")
    public static int field3629 = 0;

    @OriginalMember(owner = "client!cc", name = "p", descriptor = "Lhj;")
    private static class69 field3641 = class181.method1318("Members object", (byte) -111);

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "Lhj;")
    public static class69 field3626 = field3641;

    @OriginalMember(owner = "client!cc", name = "q", descriptor = "I")
    public static int field3642 = 1;

    @OriginalMember(owner = "client!cc", name = "c", descriptor = "I")
    public static int field3628;

    @OriginalMember(owner = "client!cc", name = "f", descriptor = "I")
    public static int field3631;

    @OriginalMember(owner = "client!cc", name = "h", descriptor = "I")
    public static int field3633;

    @OriginalMember(owner = "client!cc", name = "j", descriptor = "I")
    public static int field3635;

    @OriginalMember(owner = "client!cc", name = "m", descriptor = "I")
    public static int field3638;

    @OriginalMember(owner = "client!cc", name = "n", descriptor = "I")
    public static int field3639;

    @OriginalMember(owner = "client!cc", name = "r", descriptor = "I")
    public static int field3643;

    @OriginalMember(owner = "client!cc", name = "o", descriptor = "Lfh;")
    private class128 field3640;

    @OriginalMember(owner = "client!cc", name = "l", descriptor = "Lue;")
    public static class86 field3637;

    @OriginalMember(owner = "client!cc", name = "e", descriptor = "[Lug;")
    private class193[] field3630;

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(ZLke;ILke;Z)Lug;")
    private final class193 method1461(boolean arg0, class105 arg1, int arg2, class105 arg3, boolean arg4) {
        field3631++;
        if (this.field3640 == null) {
            throw new RuntimeException();
        }
        this.field3640.field2379 = arg2 * 8 + 5;
        if (this.field3640.field2379 >= this.field3640.field2385.length) {
            throw new RuntimeException();
        } else if (this.field3630[arg2] == null) {
            int var6 = this.field3640.method923(arg4);
            int var7 = this.field3640.method923(arg4);
            class193 var8 = new class193(arg2, arg1, arg3, this.field3632, this.field3636, var6, var7, arg0);
            this.field3630[arg2] = var8;
            return var8;
        } else {
            return this.field3630[arg2];
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(I)V")
    public final void method1462(int arg0) {
        field3639++;
        if (this.field3630 == null) {
            return;
        }
        for (int var2 = 0; var2 < this.field3630.length; var2++) {
            if (this.field3630[var2] != null) {
                this.field3630[var2].method1395(-78);
            }
        }
        if (arg0 != -8607) {
            this.field3632 = null;
        }
        for (int var3 = 0; var3 < this.field3630.length; var3++) {
            if (this.field3630[var3] != null) {
                this.field3630[var3].method1401(91);
            }
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(Z)V")
    public static void method1463(boolean arg0) {
        field3627 = null;
        field3637 = null;
        field3641 = null;
        field3626 = null;
        if (!arg0) {
            field3641 = null;
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(III)Ljd;")
    public static final class85 method1464(int arg0, int arg1, int arg2) {
        class217 var3 = class158.field2935[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        }
        for (int var4 = 0; var4 < var3.field3940; var4++) {
            class85 var5 = var3.field3933[var4];
            if ((var5.field1656 >> 29 & 0x3L) == 2L && var5.field1662 == arg1 && var5.field1653 == arg2) {
                class104.method779(var5);
                return var5;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(I[B)Ld;")
    public static final class225 method1465(int arg0, byte[] arg1) {
        field3633++;
        if (arg1 == null) {
            return null;
        } else if (arg0 == 107) {
            class30 var2 = new class30(arg1, class138.field2585, class88.field1682, class69.field1350, class113.field2167, class157.field2919);
            class229.method1636((byte) 50);
            return var2;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lke;IBLke;)Lug;")
    public final class193 method1466(class105 arg0, int arg1, byte arg2, class105 arg3) {
        if (arg2 >= -60) {
            field3627 = null;
        }
        field3635++;
        return this.method1461(true, arg0, arg1, arg3, true);
    }

    @OriginalMember(owner = "client!cc", name = "<init>", descriptor = "(Lkg;Loc;)V")
    public class201(class132 arg0, class59 arg1) {
        this.field3636 = arg1;
        this.field3632 = arg0;
        if (!this.field3632.method985(20)) {
            this.field3634 = this.field3632.method981(true, 126, 255, (byte) 0, 255);
        }
    }

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "(Z)Z")
    public final boolean method1467(boolean arg0) {
        field3628++;
        if (this.field3640 != null) {
            return true;
        }
        if (this.field3634 == null) {
            if (this.field3632.method985(20)) {
                return false;
            }
            this.field3634 = this.field3632.method981(true, 127, 255, (byte) 0, 255);
        }
        if (this.field3634.field2983) {
            return false;
        }
        this.field3640 = new class128(this.field3634.method579(-874));
        if (arg0) {
            this.method1466((class105) null, -52, (byte) 14, (class105) null);
        }
        this.field3630 = new class193[(this.field3640.field2385.length - 5) / 8];
        return true;
    }
}
