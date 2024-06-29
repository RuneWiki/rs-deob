import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pfa")
public class class249 {

    @OriginalMember(owner = "client!pfa", name = "h", descriptor = "J")
    private long field3581;

    @OriginalMember(owner = "client!pfa", name = "l", descriptor = "I")
    private int field3585;

    @OriginalMember(owner = "client!pfa", name = "e", descriptor = "[I")
    public static int[] field3578 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client!pfa", name = "c", descriptor = "[I")
    public static int[] field3576 = new int[4096];

    @OriginalMember(owner = "client!pfa", name = "i", descriptor = "I")
    public static int field3582 = 1;

    @OriginalMember(owner = "client!pfa", name = "g", descriptor = "D")
    public static double field3580;

    @OriginalMember(owner = "client!pfa", name = "a", descriptor = "I")
    public static int field3574;

    @OriginalMember(owner = "client!pfa", name = "b", descriptor = "I")
    public static int field3575;

    @OriginalMember(owner = "client!pfa", name = "d", descriptor = "I")
    public static int field3577;

    @OriginalMember(owner = "client!pfa", name = "f", descriptor = "I")
    public static int field3579;

    @OriginalMember(owner = "client!pfa", name = "j", descriptor = "I")
    public static int field3583;

    @OriginalMember(owner = "client!pfa", name = "k", descriptor = "I")
    public static int field3584;

    @OriginalMember(owner = "client!pfa", name = "a", descriptor = "(ZI)I")
    private final int method1650(boolean arg0, int arg1) {
        if (!arg0) {
            field3576 = null;
        }
        field3579++;
        return (int) (this.field3581 >> class664.field9356 * arg1) & 0xF;
    }

    @OriginalMember(owner = "client!pfa", name = "a", descriptor = "(I)I")
    public final int method1651(int arg0) {
        if (arg0 != 3) {
            this.method1651(116);
        }
        field3577++;
        return this.field3585;
    }

    @OriginalMember(owner = "client!pfa", name = "b", descriptor = "(ZI)Lua;")
    public final class664 method1652(boolean arg0, int arg1) {
        field3584++;
        if (!arg0) {
            field3582 = -122;
        }
        return class664.method3721(this.method1650(arg0, arg1), 102);
    }

    @OriginalMember(owner = "client!pfa", name = "a", descriptor = "(Z)V")
    public static void method1653(boolean arg0) {
        field3576 = null;
        field3578 = null;
        if (!arg0) {
            field3580 = 0.2720762434001105D;
        }
    }

    @OriginalMember(owner = "client!pfa", name = "a", descriptor = "(IILha;)Lmq;")
    public static final class85 method1654(int arg0, int arg1, class475 arg2) {
        field3583++;
        class622 var3 = (class622) class108.field1547.method4253((long) arg1, -1);
        if (var3 != null) {
            class747 var4 = var3.field8775.method3986(113);
            var3.field8780 = true;
            if (var4 != null) {
                return var4.method4116(-9613, arg2);
            }
        }
        if (arg0 != 3) {
            field3576 = null;
        }
        return null;
    }

    @OriginalMember(owner = "client!pfa", name = "a", descriptor = "(ZLol;)Lia;")
    public static final class33 method1655(boolean arg0, class431 arg1) {
        if (!arg0) {
            method1655(false, null);
        }
        field3575++;
        return new class33(arg1.method2528((byte) 89), arg1.method2528((byte) 89), arg1.method2528((byte) 89), arg1.method2528((byte) 89), arg1.method2528((byte) 89), arg1.method2528((byte) 89), arg1.method2528((byte) 89), arg1.method2528((byte) 89), arg1.method2515(106), arg1.method2557(14929));
    }

    @OriginalMember(owner = "client!pfa", name = "a", descriptor = "(ILua;)V")
    private final void method1656(int arg0, class664 arg1) {
        this.field3581 |= (arg1.field9343 << class664.field9356 * this.field3585++);
        field3574++;
        if (arg0 != 4096) {
            this.field3585 = -14;
        }
    }

    @OriginalMember(owner = "client!pfa", name = "<init>", descriptor = "(Lua;)V")
    public class249(class664 arg0) {
        this.field3581 = arg0.field9343;
        this.field3585 = 1;
    }

    @OriginalMember(owner = "client!pfa", name = "<init>", descriptor = "([Lua;)V")
    public class249(class664[] arg0) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.method1656(4096, arg0[var2]);
        }
    }
}
