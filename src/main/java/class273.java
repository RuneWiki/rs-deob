import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!es")
public class class273 {

    @OriginalMember(owner = "client!es", name = "f", descriptor = "Laq;")
    private class494 field3835 = new class494(64);

    @OriginalMember(owner = "client!es", name = "g", descriptor = "Lgga;")
    private class513 field3836;

    @OriginalMember(owner = "client!es", name = "b", descriptor = "I")
    public int field3831;

    @OriginalMember(owner = "client!es", name = "d", descriptor = "Z")
    public static boolean field3833 = false;

    @OriginalMember(owner = "client!es", name = "h", descriptor = "Lss;")
    public static class307 field3837 = new class307("", 17);

    @OriginalMember(owner = "client!es", name = "i", descriptor = "[I")
    public static int[] field3838 = new int[3];

    @OriginalMember(owner = "client!es", name = "j", descriptor = "I")
    public static int field3839 = 0;

    @OriginalMember(owner = "client!es", name = "a", descriptor = "I")
    public static int field3830;

    @OriginalMember(owner = "client!es", name = "c", descriptor = "I")
    public static int field3832;

    @OriginalMember(owner = "client!es", name = "e", descriptor = "Led;")
    public static class626 field3834;

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(ZI)Liw;")
    public final class234 method1738(boolean arg0, int arg1) {
        field3830++;
        class494 var3 = this.field3835;
        class234 var4;
        synchronized (this.field3835) {
            var4 = (class234) this.field3835.method2882((long) arg1, (byte) -124);
        }
        if (var4 != null) {
            return var4;
        }
        if (arg0) {
            this.method1738(true, 4);
        }
        class513 var5 = this.field3836;
        byte[] var6;
        synchronized (this.field3836) {
            var6 = this.field3836.method3019(19, arg1, 124);
        }
        class234 var7 = new class234();
        if (var6 != null) {
            var7.method1591(new class431(var6), 1);
        }
        class494 var8 = this.field3835;
        synchronized (this.field3835) {
            this.field3835.method2890(-7307, (long) arg1, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(IIII)I")
    public static final int method1739(int arg0, int arg1, int arg2, int arg3) {
        field3832++;
        int var4 = arg2 & 0x3;
        if (arg3 < 100) {
            method1740((byte) 126);
        }
        if (var4 == 0) {
            return arg1;
        } else if (var4 == 1) {
            return arg0;
        } else if (var4 == 2) {
            return 4095 - arg1;
        } else {
            return 4095 - arg0;
        }
    }

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(B)V")
    public static void method1740(byte arg0) {
        field3834 = null;
        field3837 = null;
        if (arg0 != -89) {
            method1739(33, 72, -89, 89);
        }
        field3838 = null;
    }

    @OriginalMember(owner = "client!es", name = "<init>", descriptor = "(Lmca;ILgga;)V")
    public class273(class41 arg0, int arg1, class513 arg2) {
        this.field3836 = arg2;
        this.field3831 = this.field3836.method3007(-1, 19);
    }
}
