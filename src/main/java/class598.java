import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!th")
public class class598 {

    @OriginalMember(owner = "client!th", name = "a", descriptor = "Ljt;")
    private class106 field8467 = new class106(256);

    @OriginalMember(owner = "client!th", name = "b", descriptor = "Lvd;")
    private class39 field8468;

    @OriginalMember(owner = "client!th", name = "e", descriptor = "[I")
    public static int[] field8471 = new int[] { 28, 35, 40, 44 };

    @OriginalMember(owner = "client!th", name = "c", descriptor = "I")
    public static int field8469;

    @OriginalMember(owner = "client!th", name = "d", descriptor = "I")
    public static int field8470;

    @OriginalMember(owner = "client!th", name = "f", descriptor = "I")
    public static int field8472;

    @OriginalMember(owner = "client!th", name = "g", descriptor = "I")
    public static int field8473;

    @OriginalMember(owner = "client!th", name = "h", descriptor = "I")
    public static int field8474;

    @OriginalMember(owner = "client!th", name = "i", descriptor = "I")
    public static int field8475;

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(I)V", line = 7)
    public static void method3478(int arg0) {
        int var1 = -1 % ((arg0 - 55) / 52);
        field8471 = null;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(IIIIIII)I", line = 18)
    public static final int method3479(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field8474++;
        int var7 = arg2 & 0x3;
        if ((arg3 & 0x1) == 1) {
            int var8 = arg4;
            arg4 = arg1;
            arg1 = var8;
        }
        if (var7 == 0) {
            return arg6;
        }
        if (arg0 != 7) {
            field8471 = null;
        }
        if (var7 == 1) {
            return 1 + 7 - arg4 - arg5;
        } else if (var7 == 2) {
            return 1 + 7 - arg6 - arg1;
        } else {
            return arg5;
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(II)V", line = 49)
    public final void method3480(int arg0, int arg1) {
        field8473++;
        if (arg0 == 1) {
            class106 var3 = this.field8467;
            synchronized (this.field8467) {
                this.field8467.method807(arg1, arg0 ^ 0xFFFFFFFE);
            }
        }
    }

    @OriginalMember(owner = "client!th", name = "b", descriptor = "(I)V", line = 67)
    public static final void method3481(int arg0) {
        if (arg0 >= -92) {
            field8471 = null;
        }
        field8469++;
        class407.method2592(-2);
        class483.field6967 = false;
        class235.method1563(100, class338.field4919, class642.field9012, class624.field8741, class177.field2747);
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(B)V", line = 80)
    public final void method3482(byte arg0) {
        field8470++;
        class106 var2 = this.field8467;
        synchronized (this.field8467) {
            int var3 = 33 % ((arg0 + 42) / 52);
            this.field8467.method809(true);
        }
    }

    @OriginalMember(owner = "client!th", name = "<init>", descriptor = "(Lqg;ILvd;)V", line = 94)
    public class598(class464 arg0, int arg1, class39 arg2) {
        this.field8468 = arg2;
        this.field8468.method229(26, 0);
    }

    @OriginalMember(owner = "client!th", name = "c", descriptor = "(I)V", line = 114)
    public final void method3483(int arg0) {
        field8475++;
        class106 var2 = this.field8467;
        synchronized (this.field8467) {
            this.field8467.method800(89);
            if (arg0 != 7) {
                this.method3483(-63);
            }
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(IZ)Lpca;", line = 128)
    public final class717 method3484(int arg0, boolean arg1) {
        field8472++;
        class106 var3 = this.field8467;
        class717 var4;
        synchronized (this.field8467) {
            var4 = (class717) this.field8467.method803(113, (long) arg0);
        }
        if (arg1) {
            return null;
        } else if (var4 == null) {
            class39 var5 = this.field8468;
            byte[] var6;
            synchronized (this.field8468) {
                var6 = this.field8468.method211(true, 26, arg0);
            }
            class717 var7 = new class717();
            if (var6 != null) {
                var7.method4071(17440, new class645(var6));
            }
            class106 var8 = this.field8467;
            synchronized (this.field8467) {
                this.field8467.method801(1, var7, (long) arg0);
                return var7;
            }
        } else {
            return var4;
        }
    }
}
