import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mo")
public class class618 {

    @OriginalMember(owner = "client!mo", name = "l", descriptor = "Lvi;")
    private class560 field8413 = new class560(64);

    @OriginalMember(owner = "client!mo", name = "r", descriptor = "Lvi;")
    public class560 field8419 = new class560(50);

    @OriginalMember(owner = "client!mo", name = "s", descriptor = "Lvi;")
    public class560 field8420 = new class560(5);

    @OriginalMember(owner = "client!mo", name = "d", descriptor = "Lpq;")
    private class159 field8405;

    @OriginalMember(owner = "client!mo", name = "h", descriptor = "Luea;")
    public class484 field8409;

    @OriginalMember(owner = "client!mo", name = "q", descriptor = "Lpq;")
    public class159 field8418;

    @OriginalMember(owner = "client!mo", name = "e", descriptor = "Z")
    public boolean field8406;

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "Ljj;")
    public static class398 field8402 = new class398(62, -1);

    @OriginalMember(owner = "client!mo", name = "o", descriptor = "[[I")
    public static int[][] field8416 = new int[][] { { 0, 1, 2, 3 }, { 1, 2, 3, 0 }, { 1, 2, -1, 0 }, { 2, 0, -1, 1 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 1, 3, -1 }, { -1, 0, 2, -1 }, { 3, 5, 2, 0 }, { 0, 2, 5, 3 }, { 0, 2, 3, 5 }, { 0, 1, 2, 3 } };

    @OriginalMember(owner = "client!mo", name = "n", descriptor = "[[I")
    public static int[][] field8415 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12, 12, 5 }, { 5, 5, 1, 1 }, { 5, 1, 1, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 12, 12, 12, 12, 12 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 3, 1, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 7, 3, 7 }, { 12, 12, 12, 12 } };

    @OriginalMember(owner = "client!mo", name = "k", descriptor = "Lrn;")
    public static class380 field8412 = new class380();

    @OriginalMember(owner = "client!mo", name = "b", descriptor = "I")
    public static int field8403;

    @OriginalMember(owner = "client!mo", name = "c", descriptor = "I")
    public static int field8404;

    @OriginalMember(owner = "client!mo", name = "f", descriptor = "I")
    public static int field8407;

    @OriginalMember(owner = "client!mo", name = "g", descriptor = "I")
    public static int field8408;

    @OriginalMember(owner = "client!mo", name = "i", descriptor = "I")
    public static int field8410;

    @OriginalMember(owner = "client!mo", name = "j", descriptor = "I")
    public static int field8411;

    @OriginalMember(owner = "client!mo", name = "m", descriptor = "I")
    public static int field8414;

    @OriginalMember(owner = "client!mo", name = "p", descriptor = "I")
    public static int field8417;

    @OriginalMember(owner = "client!mo", name = "t", descriptor = "I")
    public int field8421;

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(BI)V", line = 6)
    public final void method3382(byte arg0, int arg1) {
        this.field8421 = arg1;
        field8414++;
        class560 var3 = this.field8419;
        synchronized (this.field8419) {
            this.field8419.method3142(false);
            if (arg0 != 71) {
                this.field8409 = null;
            }
        }
        class560 var4 = this.field8420;
        synchronized (this.field8420) {
            this.field8420.method3142(false);
        }
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(IZ)V", line = 25)
    public final void method3383(int arg0, boolean arg1) {
        field8410++;
        if (this.field8406 == arg1) {
            return;
        }
        this.field8406 = arg1;
        this.method3385(true);
        if (arg0 != 11) {
            this.method3387(-69);
        }
    }

    @OriginalMember(owner = "client!mo", name = "b", descriptor = "(BI)Lqba;", line = 42)
    public final class195 method3384(byte arg0, int arg1) {
        field8408++;
        class560 var3 = this.field8413;
        class195 var4;
        synchronized (this.field8413) {
            var4 = (class195) this.field8413.method3134((long) arg1, -111);
        }
        if (var4 != null) {
            return var4;
        }
        class159 var5 = this.field8405;
        byte[] var6;
        synchronized (this.field8405) {
            var6 = this.field8405.method1087(class664.method3681(false, arg1), class524.method2992(arg1, 127), 1);
        }
        class195 var7 = new class195();
        var7.field2550 = this;
        var7.field2564 = arg1;
        if (var6 != null) {
            var7.method1250(-1, new class138(var6));
        }
        var7.method1241(0);
        class560 var8 = this.field8413;
        synchronized (this.field8413) {
            this.field8413.method3130((long) arg1, true, var7);
            if (arg0 < 77) {
                this.method3383(-96, false);
            }
            return var7;
        }
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(Z)V", line = 76)
    public final void method3385(boolean arg0) {
        class560 var2 = this.field8413;
        synchronized (this.field8413) {
            this.field8413.method3142(false);
        }
        field8404++;
        class560 var3 = this.field8419;
        synchronized (this.field8419) {
            this.field8419.method3142(false);
        }
        if (arg0) {
            class560 var4 = this.field8420;
            synchronized (this.field8420) {
                this.field8420.method3142(false);
            }
        }
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(IB)V", line = 95)
    public final void method3386(int arg0, byte arg1) {
        class560 var3 = this.field8413;
        synchronized (this.field8413) {
            this.field8413.method3129(arg0, 14583);
        }
        field8407++;
        class560 var4 = this.field8419;
        synchronized (this.field8419) {
            this.field8419.method3129(arg0, 14583);
        }
        if (arg1 == 63) {
            class560 var5 = this.field8420;
            synchronized (this.field8420) {
                this.field8420.method3129(arg0, 14583);
            }
        }
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(I)V", line = 122)
    public final void method3387(int arg0) {
        int var2 = 76 / ((arg0 - 21) / 51);
        class560 var3 = this.field8413;
        synchronized (this.field8413) {
            this.field8413.method3144(true);
        }
        field8411++;
        class560 var4 = this.field8419;
        synchronized (this.field8419) {
            this.field8419.method3144(true);
        }
        class560 var5 = this.field8420;
        synchronized (this.field8420) {
            this.field8420.method3144(true);
        }
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(B)V", line = 142)
    public static void method3388(byte arg0) {
        field8412 = null;
        if (arg0 <= -82) {
            field8416 = null;
            field8402 = null;
            field8415 = null;
        }
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "([JIII[Ljava/lang/Object;)V", line = 155)
    public static final void method3389(long[] arg0, int arg1, int arg2, int arg3, Object[] arg4) {
        if (arg2 > arg3) {
            int var5 = (arg2 + arg3) / 2;
            int var6 = arg3;
            long var7 = arg0[var5];
            arg0[var5] = arg0[arg2];
            arg0[arg2] = var7;
            Object var9 = arg4[var5];
            arg4[var5] = arg4[arg2];
            arg4[arg2] = var9;
            int var10 = ~var7 == Long.MIN_VALUE ? 0 : 1;
            for (int var11 = arg3; var11 < arg2; var11++) {
                if (arg0[var11] < (long) (var10 & var11) + var7) {
                    long var12 = arg0[var11];
                    arg0[var11] = arg0[var6];
                    arg0[var6] = var12;
                    Object var14 = arg4[var11];
                    arg4[var11] = arg4[var6];
                    arg4[var6++] = var14;
                }
            }
            arg0[arg2] = arg0[var6];
            arg0[var6] = var7;
            arg4[arg2] = arg4[var6];
            arg4[var6] = var9;
            method3389(arg0, -122, var6 - 1, arg3, arg4);
            method3389(arg0, -101, arg2, var6 + 1, arg4);
        }
        if (arg1 >= -97) {
            method3388((byte) 113);
        }
        field8403++;
    }

    @OriginalMember(owner = "client!mo", name = "b", descriptor = "(B)V", line = 217)
    public final void method3390(byte arg0) {
        field8417++;
        class560 var2 = this.field8419;
        synchronized (this.field8419) {
            this.field8419.method3142(false);
        }
        class560 var3 = this.field8420;
        synchronized (this.field8420) {
            this.field8420.method3142(false);
            if (arg0 > -28) {
                field8402 = null;
            }
        }
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(III)Lul;", line = 238)
    public static final class331 method3391(int arg0, int arg1, int arg2) {
        class651 var3 = class145.field1841[arg0][arg1][arg2];
        return var3 == null || var3.field9227 == null ? null : var3.field9227;
    }

    @OriginalMember(owner = "client!mo", name = "<init>", descriptor = "(Luea;IZLpq;Lpq;)V", line = 259)
    public class618(class484 arg0, int arg1, boolean arg2, class159 arg3, class159 arg4) {
        this.field8405 = arg3;
        this.field8409 = arg0;
        this.field8418 = arg4;
        this.field8406 = arg2;
        if (this.field8405 != null) {
            int var6 = this.field8405.method1074((byte) 90) - 1;
            this.field8405.method1076(var6, 0);
        }
    }
}
