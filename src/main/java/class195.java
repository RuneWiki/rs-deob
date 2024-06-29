import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ffa")
public class class195 {

    @OriginalMember(owner = "client!ffa", name = "a", descriptor = "Lpa;")
    public class387 field2865 = new class387(20);

    @OriginalMember(owner = "client!ffa", name = "k", descriptor = "Lpa;")
    private class387 field2875 = new class387(64);

    @OriginalMember(owner = "client!ffa", name = "i", descriptor = "Lcb;")
    public class544 field2873;

    @OriginalMember(owner = "client!ffa", name = "d", descriptor = "Lcb;")
    private class544 field2868;

    @OriginalMember(owner = "client!ffa", name = "c", descriptor = "[I")
    public static int[] field2867 = new int[5];

    @OriginalMember(owner = "client!ffa", name = "j", descriptor = "Z")
    public static boolean field2874 = false;

    @OriginalMember(owner = "client!ffa", name = "b", descriptor = "I")
    public static int field2866;

    @OriginalMember(owner = "client!ffa", name = "e", descriptor = "I")
    public static int field2869;

    @OriginalMember(owner = "client!ffa", name = "f", descriptor = "I")
    public static int field2870;

    @OriginalMember(owner = "client!ffa", name = "g", descriptor = "I")
    public static int field2871;

    @OriginalMember(owner = "client!ffa", name = "h", descriptor = "I")
    public static int field2872;

    @OriginalMember(owner = "client!ffa", name = "a", descriptor = "(IIILjava/lang/Class;)Lwga;", line = 4)
    public static final class778 method1415(int arg0, int arg1, int arg2, Class arg3) {
        class379 var4 = class378.field5427[arg0][arg1][arg2];
        if (var4 == null) {
            return null;
        }
        for (class393 var5 = var4.field5437; var5 != null; var5 = var5.field5574) {
            class778 var6 = var5.field5578;
            if (arg3.isAssignableFrom(var6.getClass()) && var6.field10733 == arg1 && var6.field10730 == arg2) {
                return var6;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!ffa", name = "a", descriptor = "(II)V", line = 29)
    public final void method1416(int arg0, int arg1) {
        if (arg1 != -24656) {
            return;
        }
        class387 var3 = this.field2875;
        synchronized (this.field2875) {
            this.field2875.method2366(arg0, 120);
        }
        field2871++;
        class387 var4 = this.field2865;
        synchronized (this.field2865) {
            this.field2865.method2366(arg0, arg1 ^ 0xFFFF9FCD);
        }
    }

    @OriginalMember(owner = "client!ffa", name = "a", descriptor = "(I)V", line = 46)
    public static void method1417(int arg0) {
        if (arg0 != 64) {
            field2874 = false;
        }
        field2867 = null;
    }

    @OriginalMember(owner = "client!ffa", name = "b", descriptor = "(I)V", line = 65)
    public final void method1418(int arg0) {
        field2872++;
        class387 var2 = this.field2875;
        synchronized (this.field2875) {
            this.field2875.method2364(1);
        }
        class387 var3 = this.field2865;
        synchronized (this.field2865) {
            this.field2865.method2364(arg0 ^ 0x1);
        }
        if (arg0 != 0) {
            this.field2875 = null;
        }
    }

    @OriginalMember(owner = "client!ffa", name = "c", descriptor = "(I)V", line = 81)
    public final void method1419(int arg0) {
        field2869++;
        if (arg0 != -12046) {
            return;
        }
        class387 var2 = this.field2875;
        synchronized (this.field2875) {
            this.field2875.method2369(arg0 ^ 0x2F0D);
        }
        class387 var3 = this.field2865;
        synchronized (this.field2865) {
            this.field2865.method2369(arg0 ^ 0x2F0D);
        }
    }

    @OriginalMember(owner = "client!ffa", name = "b", descriptor = "(II)Lgd;", line = 98)
    public final class356 method1420(int arg0, int arg1) {
        field2870++;
        class387 var3 = this.field2875;
        class356 var4;
        synchronized (this.field2875) {
            var4 = (class356) this.field2875.method2373((long) arg1, 103);
        }
        if (var4 != null) {
            return var4;
        }
        class544 var5 = this.field2868;
        byte[] var6;
        synchronized (this.field2868) {
            var6 = this.field2868.method3150(arg1, 36, 46);
            if (arg0 > -113) {
                this.method1420(50, 70);
            }
        }
        class356 var7 = new class356();
        var7.field5177 = this;
        if (var6 != null) {
            var7.method2239(new class120(var6), (byte) 38);
        }
        class387 var8 = this.field2875;
        synchronized (this.field2875) {
            this.field2875.method2362(var7, 0, (long) arg1);
            return var7;
        }
    }

    @OriginalMember(owner = "client!ffa", name = "a", descriptor = "(III)Z", line = 133)
    public static final boolean method1421(int arg0, int arg1, int arg2) {
        if (arg2 > -52) {
            return false;
        } else {
            field2866++;
            return (arg0 & 0x10) != 0;
        }
    }

    @OriginalMember(owner = "client!ffa", name = "<init>", descriptor = "(Liv;ILcb;Lcb;)V", line = 156)
    public class195(class106 arg0, int arg1, class544 arg2, class544 arg3) {
        this.field2873 = arg3;
        this.field2868 = arg2;
        this.field2868.method3147(46, -38);
    }
}
