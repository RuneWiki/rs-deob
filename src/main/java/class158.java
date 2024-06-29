import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jh")
public class class158 {

    @OriginalMember(owner = "client!jh", name = "b", descriptor = "Ljda;")
    public class224 field2357 = new class224();

    @OriginalMember(owner = "client!jh", name = "c", descriptor = "Lhda;")
    public static class747 field2358 = new class747();

    @OriginalMember(owner = "client!jh", name = "l", descriptor = "Lqe;")
    public static class465 field2367 = new class465(74, 6);

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "I")
    public static int field2356;

    @OriginalMember(owner = "client!jh", name = "d", descriptor = "I")
    public static int field2359;

    @OriginalMember(owner = "client!jh", name = "e", descriptor = "I")
    public static int field2360;

    @OriginalMember(owner = "client!jh", name = "f", descriptor = "I")
    public static int field2361;

    @OriginalMember(owner = "client!jh", name = "g", descriptor = "I")
    public static int field2362;

    @OriginalMember(owner = "client!jh", name = "i", descriptor = "I")
    public static int field2364;

    @OriginalMember(owner = "client!jh", name = "j", descriptor = "I")
    public static int field2365;

    @OriginalMember(owner = "client!jh", name = "k", descriptor = "I")
    public static int field2366;

    @OriginalMember(owner = "client!jh", name = "m", descriptor = "I")
    public static int field2368;

    @OriginalMember(owner = "client!jh", name = "h", descriptor = "Ljda;")
    private class224 field2363;

    @OriginalMember(owner = "client!jh", name = "n", descriptor = "Ljava/awt/Image;")
    public static Image field2369;

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(I)Ljda;")
    public final class224 method1196(int arg0) {
        field2368++;
        if (arg0 > -118) {
            return null;
        }
        class224 var2 = this.field2357.field3201;
        if (this.field2357 == var2) {
            this.field2363 = null;
            return null;
        } else {
            this.field2363 = var2.field3201;
            return var2;
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(ZIIII)Z")
    public static final boolean method1197(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        field2359++;
        if (!class186.field2665 || !class491.field6993) {
            return false;
        } else if (class671.field9405 < 100) {
            return false;
        } else if (!class675.method3817(arg4, 1, arg1, arg3)) {
            return false;
        } else if (arg0) {
            return false;
        } else {
            int var5 = arg3 << class440.field6142;
            int var6 = arg1 << class440.field6142;
            if (class151.method1164(class546.field7701, var5, 119, class138.field2153[arg4].method1825(arg1, -128, arg3), class546.field7701, var6, arg2)) {
                class503.field7188++;
                return true;
            } else {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!jh", name = "b", descriptor = "(I)I")
    public final int method1198(int arg0) {
        field2361++;
        int var2 = 0;
        class224 var3 = this.field2357.field3201;
        while (this.field2357 != var3) {
            var3 = var3.field3201;
            var2++;
        }
        if (arg0 < 64) {
            this.method1196(-3);
        }
        return var2;
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(Z)V")
    public final void method1199(boolean arg0) {
        field2360++;
        while (true) {
            class224 var2 = this.field2357.field3201;
            if (this.field2357 == var2) {
                if (arg0) {
                    return;
                } else {
                    this.field2363 = null;
                    return;
                }
            }
            var2.method1553(-101);
        }
    }

    @OriginalMember(owner = "client!jh", name = "b", descriptor = "(Z)Ljda;")
    public final class224 method1200(boolean arg0) {
        if (arg0) {
            this.method1200(false);
        }
        field2364++;
        class224 var2 = this.field2357.field3201;
        if (this.field2357 == var2) {
            return null;
        } else {
            var2.method1553(-100);
            return var2;
        }
    }

    @OriginalMember(owner = "client!jh", name = "c", descriptor = "(Z)V")
    public static void method1201(boolean arg0) {
        field2367 = null;
        field2358 = null;
        if (arg0) {
            field2358 = null;
        }
        field2369 = null;
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(III)Lht;")
    public static final class578 method1202(int arg0, int arg1, int arg2) {
        class416 var3 = class390.field5454[arg0][arg1][arg2];
        return var3 == null || var3.field5846 == null ? null : var3.field5846;
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(Ljda;I)V")
    public final void method1203(class224 arg0, int arg1) {
        if (arg1 != -101) {
            field2365 = 109;
        }
        field2356++;
        if (arg0.field3202 != null) {
            arg0.method1553(arg1 + 169);
        }
        arg0.field3201 = this.field2357;
        arg0.field3202 = this.field2357.field3202;
        arg0.field3202.field3201 = arg0;
        arg0.field3201.field3202 = arg0;
    }

    @OriginalMember(owner = "client!jh", name = "<init>", descriptor = "()V")
    public class158() {
        this.field2357.field3202 = this.field2357;
        this.field2357.field3201 = this.field2357;
    }

    @OriginalMember(owner = "client!jh", name = "d", descriptor = "(Z)Ljda;")
    public final class224 method1204(boolean arg0) {
        field2362++;
        class224 var2 = this.field2363;
        if (this.field2357 == var2) {
            this.field2363 = null;
            return null;
        }
        this.field2363 = var2.field3201;
        if (arg0) {
            this.method1200(true);
        }
        return var2;
    }
}
