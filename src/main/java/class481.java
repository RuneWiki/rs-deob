import java.awt.Point;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wf")
public class class481 {

    @OriginalMember(owner = "client!wf", name = "g", descriptor = "Lau;")
    private class692 field6879 = new class692(128);

    @OriginalMember(owner = "client!wf", name = "o", descriptor = "Lau;")
    public class692 field6887 = new class692(64);

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "Lmv;")
    public class295 field6874;

    @OriginalMember(owner = "client!wf", name = "f", descriptor = "Lmv;")
    private class295 field6878;

    @OriginalMember(owner = "client!wf", name = "d", descriptor = "Lvg;")
    public static class622 field6876 = new class622(5, 8);

    @OriginalMember(owner = "client!wf", name = "l", descriptor = "Lnw;")
    public static class619 field6884 = new class619();

    @OriginalMember(owner = "client!wf", name = "k", descriptor = "F")
    public static float field6883;

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "I")
    public static int field6873;

    @OriginalMember(owner = "client!wf", name = "c", descriptor = "I")
    public static int field6875;

    @OriginalMember(owner = "client!wf", name = "e", descriptor = "I")
    public static int field6877;

    @OriginalMember(owner = "client!wf", name = "h", descriptor = "I")
    public static int field6880;

    @OriginalMember(owner = "client!wf", name = "i", descriptor = "I")
    public static int field6881;

    @OriginalMember(owner = "client!wf", name = "j", descriptor = "I")
    public static int field6882;

    @OriginalMember(owner = "client!wf", name = "m", descriptor = "I")
    public static int field6885;

    @OriginalMember(owner = "client!wf", name = "n", descriptor = "I")
    public static int field6886;

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(I)V", line = 5)
    public final void method2751(int arg0) {
        field6873++;
        class692 var2 = this.field6879;
        synchronized (this.field6879) {
            this.field6879.method3891(13747);
        }
        class692 var3 = this.field6887;
        synchronized (this.field6887) {
            if (arg0 != 0) {
                field6884 = null;
            }
            this.field6887.method3891(arg0 ^ 0x35B3);
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(III)V", line = 22)
    public final void method2752(int arg0, int arg1, int arg2) {
        this.field6879 = new class692(arg1);
        if (arg0 == 36) {
            field6881++;
            this.field6887 = new class692(arg2);
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(BI)V", line = 36)
    public static final void method2753(byte arg0, int arg1) {
        field6882++;
        if (!class335.field4872.field9508) {
            arg1 = -1;
        }
        if (class235.field3093 == arg1) {
            return;
        }
        if (arg1 != -1) {
            class144 var2 = class252.field3301.method742(arg1, 108);
            class616 var3 = var2.method1004(0);
            if (var3 == null) {
                arg1 = -1;
            } else {
                class61.field978.method1406(-30547, var3.method3520(), new Point(var2.field2076, var2.field2074), var3.method3512(), var3.method3510(), class410.field6110);
                class235.field3093 = arg1;
            }
        }
        if (arg1 == -1 && class235.field3093 != -1) {
            class61.field978.method1406(-30547, -1, new Point(), -1, null, class410.field6110);
            class235.field3093 = -1;
        }
        int var4 = -13 / ((arg0 - 12) / 38);
    }

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "(I)V", line = 81)
    public static void method2754(int arg0) {
        field6876 = null;
        if (arg0 >= -89) {
            field6884 = null;
        }
        field6884 = null;
    }

    @OriginalMember(owner = "client!wf", name = "c", descriptor = "(I)V", line = 92)
    public final void method2755(int arg0) {
        class692 var2 = this.field6879;
        synchronized (this.field6879) {
            if (arg0 <= 22) {
                field6884 = null;
            }
            this.field6879.method3890(-1);
        }
        field6880++;
        class692 var3 = this.field6887;
        synchronized (this.field6887) {
            this.field6887.method3890(-1);
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(IIIIIIBI)V", line = 117)
    public static final void method2756(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int arg7) {
        if (class175.field2455 <= arg0 && arg7 <= class375.field5631 && class323.field4704 <= arg4 && arg5 <= class148.field2106) {
            class579.method3324(arg5, arg3, arg1, arg0, false, arg4, arg7, arg2);
        } else {
            class375.method2323(arg4, (byte) 9, arg3, arg0, arg2, arg5, arg1, arg7);
        }
        if (arg6 <= -42) {
            field6877++;
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(IB)Lhh;", line = 135)
    public final class168 method2757(int arg0, byte arg1) {
        field6875++;
        class692 var3 = this.field6879;
        class168 var4;
        synchronized (this.field6879) {
            var4 = (class168) this.field6879.method3901((long) arg0, -119);
        }
        if (var4 != null) {
            return var4;
        }
        class295 var5 = this.field6878;
        byte[] var6;
        synchronized (this.field6878) {
            var6 = this.field6878.method1844(36, 31330, arg0);
        }
        class168 var7 = new class168();
        var7.field2343 = arg0;
        var7.field2367 = this;
        if (var6 != null) {
            var7.method1168((byte) 0, new class540(var6));
        }
        if (arg1 != -46) {
            return null;
        }
        var7.method1169(1);
        class692 var8 = this.field6879;
        synchronized (this.field6879) {
            this.field6879.method3894(var7, (byte) 60, (long) arg0);
            return var7;
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(II)V", line = 169)
    public final void method2758(int arg0, int arg1) {
        if (arg1 < 105) {
            field6876 = null;
        }
        class692 var3 = this.field6879;
        synchronized (this.field6879) {
            this.field6879.method3900(arg0, 0);
        }
        field6885++;
        class692 var4 = this.field6887;
        synchronized (this.field6887) {
            this.field6887.method3900(arg0, 0);
        }
    }

    @OriginalMember(owner = "client!wf", name = "<init>", descriptor = "(Lsea;ILmv;Lmv;)V", line = 196)
    public class481(class373 arg0, int arg1, class295 arg2, class295 arg3) {
        this.field6874 = arg3;
        this.field6878 = arg2;
        this.field6878.method1845(36, true);
    }
}
