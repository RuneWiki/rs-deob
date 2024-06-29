import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!al")
public class class87 {

    @OriginalMember(owner = "client!al", name = "b", descriptor = "Lpca;")
    private class653 field925 = new class653(16);

    @OriginalMember(owner = "client!al", name = "d", descriptor = "Ljo;")
    private class303 field927;

    @OriginalMember(owner = "client!al", name = "a", descriptor = "Lpr;")
    public static class407 field924 = new class407(86, 0);

    @OriginalMember(owner = "client!al", name = "j", descriptor = "Z")
    public static boolean field933 = false;

    @OriginalMember(owner = "client!al", name = "c", descriptor = "I")
    public static int field926;

    @OriginalMember(owner = "client!al", name = "e", descriptor = "I")
    public static int field928;

    @OriginalMember(owner = "client!al", name = "f", descriptor = "I")
    public static int field929;

    @OriginalMember(owner = "client!al", name = "g", descriptor = "I")
    public static int field930;

    @OriginalMember(owner = "client!al", name = "h", descriptor = "I")
    public static int field931;

    @OriginalMember(owner = "client!al", name = "i", descriptor = "I")
    public static int field932;

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(I)V")
    public final void method543(int arg0) {
        class653 var2 = this.field925;
        synchronized (this.field925) {
            this.field925.method3687((byte) -10);
        }
        field929++;
        if (arg0 != 86) {
            method546(true);
        }
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(BI)V")
    public final void method544(byte arg0, int arg1) {
        field926++;
        if (arg0 != -104) {
            this.field925 = null;
        }
        class653 var3 = this.field925;
        synchronized (this.field925) {
            this.field925.method3691(false, arg1);
        }
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(II)Lpc;")
    private final class613 method545(int arg0, int arg1) {
        field928++;
        class653 var3 = this.field925;
        class613 var4;
        synchronized (this.field925) {
            var4 = (class613) this.field925.method3690((byte) -79, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class303 var5 = this.field927;
        byte[] var6;
        synchronized (this.field927) {
            var6 = this.field927.method1719(arg1, 29, arg0 ^ 0x52);
            if (arg0 != 86) {
                field931 = 41;
            }
        }
        class613 var7 = new class613();
        if (var6 != null) {
            var7.method3426(new class452(var6), (byte) -3);
        }
        class653 var8 = this.field925;
        synchronized (this.field925) {
            this.field925.method3683(var7, (byte) 120, (long) arg1);
            return var7;
        }
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(Z)V")
    public static void method546(boolean arg0) {
        if (arg0) {
            field931 = -43;
        }
        field924 = null;
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(ILgh;IBII)Lbn;")
    public final class404 method547(int arg0, class500 arg1, int arg2, byte arg3, int arg4, int arg5) {
        field930++;
        class187[] var7 = null;
        class613 var8 = this.method545(86, arg4);
        if (var8.field8653 != null) {
            var7 = new class187[var8.field8653.length];
            for (int var9 = 0; var9 < var7.length; var9++) {
                class85 var10 = arg1.method2882(-5248, var8.field8653[var9]);
                var7[var9] = new class187(var10.field902, var10.field898, var10.field910, var10.field904, var10.field908, var10.field901, var10.field903, var10.field907);
            }
        }
        return arg3 == -105 ? new class404(var8.field8652, var7, var8.field8656, arg0, arg5, arg2) : null;
    }

    @OriginalMember(owner = "client!al", name = "b", descriptor = "(Z)V")
    public final void method548(boolean arg0) {
        field932++;
        class653 var2 = this.field925;
        synchronized (this.field925) {
            if (!arg0) {
                field933 = false;
            }
            this.field925.method3684(-17200);
        }
    }

    @OriginalMember(owner = "client!al", name = "<init>", descriptor = "(Ljda;ILjo;)V")
    public class87(class207 arg0, int arg1, class303 arg2) {
        this.field927 = arg2;
        this.field927.method1727(-77, 29);
    }
}
