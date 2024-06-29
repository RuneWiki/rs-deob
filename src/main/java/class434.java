import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public class class434 extends class30 {

    @OriginalMember(owner = "client!cc", name = "x", descriptor = "I")
    private int field6371;

    @OriginalMember(owner = "client!cc", name = "v", descriptor = "I")
    private int field6369;

    @OriginalMember(owner = "client!cc", name = "q", descriptor = "I")
    private int field6364;

    @OriginalMember(owner = "client!cc", name = "u", descriptor = "I")
    private int field6368;

    @OriginalMember(owner = "client!cc", name = "p", descriptor = "J")
    public static volatile long field6363 = 0L;

    @OriginalMember(owner = "client!cc", name = "w", descriptor = "I")
    public static int field6370 = -50;

    @OriginalMember(owner = "client!cc", name = "t", descriptor = "[Z")
    public static boolean[] field6367 = new boolean[200];

    @OriginalMember(owner = "client!cc", name = "l", descriptor = "I")
    public static int field6359;

    @OriginalMember(owner = "client!cc", name = "m", descriptor = "I")
    public static int field6360;

    @OriginalMember(owner = "client!cc", name = "n", descriptor = "I")
    public static int field6361;

    @OriginalMember(owner = "client!cc", name = "o", descriptor = "I")
    public static int field6362;

    @OriginalMember(owner = "client!cc", name = "r", descriptor = "I")
    public static int field6365;

    @OriginalMember(owner = "client!cc", name = "y", descriptor = "I")
    public static int field6372;

    @OriginalMember(owner = "client!cc", name = "z", descriptor = "I")
    public static int field6373;

    @OriginalMember(owner = "client!cc", name = "k", descriptor = "Lep;")
    public static class241 field6358;

    @OriginalMember(owner = "client!cc", name = "s", descriptor = "Lmk;")
    public static class34 field6366;

    @OriginalMember(owner = "client!cc", name = "<init>", descriptor = "(IIIIII)V", line = 8)
    public class434(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(-1, arg4, arg5);
        this.field6371 = arg3;
        this.field6369 = arg2;
        this.field6364 = arg1;
        this.field6368 = arg0;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(II)Lao;", line = 19)
    public static final class158 method2699(int arg0, int arg1) {
        if (arg0 != 16626) {
            field6363 = 8L;
        }
        ++field6359;
        class158 var2 = (class158) class300.field4272.method2049(-53, (long) arg1);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class329.field4708.method361(29, 50, arg1);
            class158 var4 = new class158();
            if (var3 != null) {
                var4.method1038(arg1, new class211(var3), false);
            }
            class300.field4272.method2046((long) arg1, 0, var4);
            return var4;
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lra;I)V", line = 43)
    public static final void method2700(class57 arg0, int arg1) {
        if (arg1 != 17634) {
            field6366 = null;
        }
        ++field6361;
        class35.field341 = arg0;
    }

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "(IIB)V", line = 56)
    public final void method172(int arg0, int arg1, byte arg2) {
        ++field6360;
        if (arg2 != 78) {
            field6366 = null;
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(I)V", line = 67)
    public static void method2701(int arg0) {
        field6367 = null;
        field6366 = null;
        field6358 = null;
        if (arg0 > -96) {
            method2699(-101, -37);
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(IIB)V", line = 87)
    public final void method170(int arg0, int arg1, byte arg2) {
        ++field6365;
        if (arg2 <= 99) {
            method2700((class57) null, -10);
        }
        int var4 = this.field6368 * arg0 >> 12;
        int var5 = this.field6369 * arg0 >> 12;
        int var6 = this.field6364 * arg1 >> 12;
        int var7 = this.field6371 * arg1 >> 12;
        class339.method2185(var5, super.field277, var6, var7, var4, 1055745068);
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(III)V", line = 107)
    public final void method174(int arg0, int arg1, int arg2) {
        ++field6373;
        if (arg1 != 27492) {
            field6366 = null;
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(B)V", line = 123)
    public static final void method2702(byte arg0) {
        class331 var1 = class238.field3243;
        synchronized (class238.field3243) {
            class238.field3243.method2052(0);
        }
        ++field6372;
        if (arg0 >= 104) {
            class331 var2 = class402.field5855;
            synchronized (class402.field5855) {
                class402.field5855.method2052(0);
            }
        }
    }
}
