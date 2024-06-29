import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lf")
public class class217 {

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "Laj;")
    private class287 field3297 = new class287(128);

    @OriginalMember(owner = "client!lf", name = "g", descriptor = "Lom;")
    private class344 field3302;

    @OriginalMember(owner = "client!lf", name = "f", descriptor = "Lqfa;")
    public static class85 field3301 = new class85(23, 0);

    @OriginalMember(owner = "client!lf", name = "k", descriptor = "[[Z")
    public static boolean[][] field3306 = new boolean[][] { new boolean[4], new boolean[4], { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, new boolean[4], new boolean[4], new boolean[4], new boolean[4] };

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "I")
    public static int field3296;

    @OriginalMember(owner = "client!lf", name = "c", descriptor = "I")
    public static int field3298;

    @OriginalMember(owner = "client!lf", name = "d", descriptor = "I")
    public static int field3299;

    @OriginalMember(owner = "client!lf", name = "e", descriptor = "I")
    public static int field3300;

    @OriginalMember(owner = "client!lf", name = "h", descriptor = "I")
    public static int field3303;

    @OriginalMember(owner = "client!lf", name = "i", descriptor = "I")
    public static int field3304;

    @OriginalMember(owner = "client!lf", name = "j", descriptor = "Lom;")
    public static class344 field3305;

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(I)V")
    public final void method1509(int arg0) {
        field3298++;
        class287 var2 = this.field3297;
        synchronized (this.field3297) {
            this.field3297.method1913(true);
            if (arg0 != 10134) {
                this.method1511(false);
            }
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(ZI)Lkf;")
    public final class232 method1510(boolean arg0, int arg1) {
        field3303++;
        class287 var3 = this.field3297;
        class232 var5;
        synchronized (this.field3297) {
            if (arg0) {
                return null;
            }
            var5 = (class232) this.field3297.method1900((long) arg1, -117);
        }
        if (var5 != null) {
            return var5;
        }
        class344 var6 = this.field3302;
        byte[] var7;
        synchronized (this.field3302) {
            var7 = this.field3302.method2216(1, arg1, true);
        }
        class232 var8 = new class232();
        if (var7 != null) {
            var8.method1567(new class61(var7), (byte) 121);
        }
        class287 var9 = this.field3297;
        synchronized (this.field3297) {
            this.field3297.method1904(var8, (long) arg1, -1);
            return var8;
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(Z)V")
    public final void method1511(boolean arg0) {
        field3296++;
        if (arg0) {
            this.method1510(false, 61);
        }
        class287 var2 = this.field3297;
        synchronized (this.field3297) {
            this.field3297.method1912(-2552);
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(CI)I")
    public static final int method1512(char arg0, int arg1) {
        field3300++;
        if (arg1 == 22768) {
            return arg0 >= '\u0000' && arg0 < class658.field9466.length ? class658.field9466[arg0] : -1;
        } else {
            return -101;
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(II)V")
    public final void method1513(int arg0, int arg1) {
        class287 var3 = this.field3297;
        synchronized (this.field3297) {
            this.field3297.method1908(arg0, (byte) -11);
            if (arg1 != -17731) {
                field3305 = null;
            }
        }
        field3299++;
    }

    @OriginalMember(owner = "client!lf", name = "<init>", descriptor = "(Lmea;ILom;)V")
    public class217(class398 arg0, int arg1, class344 arg2) {
        this.field3302 = arg2;
        this.field3302.method2236(1, 0);
    }

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "(I)V")
    public static void method1514(int arg0) {
        if (arg0 != 23) {
            field3301 = null;
        }
        field3301 = null;
        field3305 = null;
        field3306 = null;
    }
}
