import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!si")
public class class321 {

    @OriginalMember(owner = "client!si", name = "i", descriptor = "I")
    private int field4587;

    @OriginalMember(owner = "client!si", name = "b", descriptor = "[Lw;")
    private class235[] field4580;

    @OriginalMember(owner = "client!si", name = "c", descriptor = "I")
    public static int field4581;

    @OriginalMember(owner = "client!si", name = "d", descriptor = "I")
    public static int field4582;

    @OriginalMember(owner = "client!si", name = "e", descriptor = "I")
    public static int field4583;

    @OriginalMember(owner = "client!si", name = "f", descriptor = "I")
    public static int field4584;

    @OriginalMember(owner = "client!si", name = "h", descriptor = "I")
    public static int field4586;

    @OriginalMember(owner = "client!si", name = "g", descriptor = "J")
    private long field4585;

    @OriginalMember(owner = "client!si", name = "a", descriptor = "Lw;")
    private class235 field4579;

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(I)Lw;", line = 6)
    public final class235 method1987(int arg0) {
        field4582++;
        if (this.field4579 == null) {
            return null;
        }
        class235 var2 = this.field4580[(int) ((long) (this.field4587 - 1) & this.field4585)];
        if (arg0 <= 35) {
            this.method1987(117);
        }
        while (this.field4579 != var2) {
            if (this.field4579.field3305 == this.field4585) {
                class235 var3 = this.field4579;
                this.field4579 = this.field4579.field3302;
                return var3;
            }
            this.field4579 = this.field4579.field3302;
        }
        this.field4579 = null;
        return null;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(IJ)Lw;", line = 38)
    public final class235 method1988(int arg0, long arg1) {
        int var4 = 61 / ((arg0 + 48) / 50);
        this.field4585 = arg1;
        field4584++;
        class235 var5 = this.field4580[(int) ((long) (this.field4587 - 1) & arg1)];
        for (this.field4579 = var5.field3302; this.field4579 != var5; this.field4579 = this.field4579.field3302) {
            if (this.field4579.field3305 == arg1) {
                class235 var6 = this.field4579;
                this.field4579 = this.field4579.field3302;
                return var6;
            }
        }
        this.field4579 = null;
        return null;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(IZILro;)V", line = 74)
    public static final void method1989(int arg0, boolean arg1, int arg2, class249 arg3) {
        if (arg3.field3636 == 0) {
            arg3.field3609 = arg3.field3612;
        } else if (arg3.field3636 == 1) {
            arg3.field3609 = (arg0 - arg3.field3578) / 2 + arg3.field3612;
        } else if (arg3.field3636 == 2) {
            arg3.field3609 = arg0 - arg3.field3578 - arg3.field3612;
        } else if (arg3.field3636 == 3) {
            arg3.field3609 = arg3.field3612 * arg0 >> 14;
        } else if (arg3.field3636 == 4) {
            arg3.field3609 = (arg3.field3612 * arg0 >> 14) + (arg0 - arg3.field3578) / 2;
        } else {
            arg3.field3609 = arg0 - (arg3.field3612 * arg0 >> 14) - arg3.field3578;
        }
        field4586++;
        if (arg3.field3478 == 0) {
            arg3.field3510 = arg3.field3599;
        } else if (arg3.field3478 == 1) {
            arg3.field3510 = (arg2 - arg3.field3604) / 2 + arg3.field3599;
        } else if (arg3.field3478 == 2) {
            arg3.field3510 = arg2 - (arg3.field3604 + arg3.field3599);
        } else if (arg3.field3478 == 3) {
            arg3.field3510 = arg3.field3599 * arg2 >> 14;
        } else if (arg3.field3478 == 4) {
            arg3.field3510 = (arg3.field3599 * arg2 >> 14) + (arg2 - arg3.field3604) / 2;
        } else {
            arg3.field3510 = arg2 - arg3.field3604 - (arg3.field3599 * arg2 >> 14);
        }
        if (!arg1 || !class381.field5720 || client.method1572(arg3).field2514 == 0 && arg3.field3637 != 0) {
            return;
        }
        if (arg3.field3609 < 0) {
            arg3.field3609 = 0;
        } else if ((arg3.field3609 + arg3.field3578) > arg0) {
            arg3.field3609 = arg0 - arg3.field3578;
        }
        if (arg3.field3510 < 0) {
            arg3.field3510 = 0;
        } else if (arg2 < arg3.field3604 + arg3.field3510) {
            arg3.field3510 = arg2 - arg3.field3604;
            return;
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(Z)Lc;", line = 146)
    public static final class159 method1990(boolean arg0) {
        field4583++;
        class344.field5039 = 0;
        return arg0 ? class439.method2780(119) : null;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(ZJLw;)V", line = 165)
    public final void method1991(boolean arg0, long arg1, class235 arg2) {
        field4581++;
        if (arg2.field3311 != null) {
            arg2.method1439(-29183);
        }
        class235 var5 = this.field4580[(int) ((long) (this.field4587 - 1) & arg1)];
        arg2.field3311 = var5.field3311;
        arg2.field3302 = var5;
        arg2.field3311.field3302 = arg2;
        if (arg0) {
            arg2.field3302.field3311 = arg2;
            arg2.field3305 = arg1;
        }
    }

    @OriginalMember(owner = "client!si", name = "<init>", descriptor = "(I)V", line = 194)
    public class321(int arg0) {
        this.field4587 = arg0;
        this.field4580 = new class235[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class235 var3 = this.field4580[var2] = new class235();
            var3.field3302 = var3;
            var3.field3311 = var3;
        }
    }
}
