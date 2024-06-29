import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rq")
public class class372 {

    @OriginalMember(owner = "client!rq", name = "e", descriptor = "Ljda;")
    private class239 field5380 = new class239(128);

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "Laj;")
    private class333 field5376;

    @OriginalMember(owner = "client!rq", name = "f", descriptor = "[I")
    public static int[] field5381 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

    @OriginalMember(owner = "client!rq", name = "c", descriptor = "Ljw;")
    public static class581 field5378 = new class581(20, 10);

    @OriginalMember(owner = "client!rq", name = "b", descriptor = "I")
    public static int field5377;

    @OriginalMember(owner = "client!rq", name = "d", descriptor = "I")
    public static int field5379;

    @OriginalMember(owner = "client!rq", name = "g", descriptor = "I")
    public static int field5382;

    @OriginalMember(owner = "client!rq", name = "h", descriptor = "I")
    public static int field5383;

    @OriginalMember(owner = "client!rq", name = "i", descriptor = "I")
    public static int field5384;

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(II)Lpja;")
    public final class42 method2305(int arg0, int arg1) {
        field5379++;
        class239 var3 = this.field5380;
        class42 var4;
        synchronized (this.field5380) {
            var4 = (class42) this.field5380.method1541(-10, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class333 var5 = this.field5376;
        byte[] var6;
        synchronized (this.field5376) {
            var6 = this.field5376.method2095(arg1, 1, 1);
        }
        class42 var7 = new class42();
        if (var6 != null) {
            var7.method286(2, new class376(var6));
        }
        class239 var8 = this.field5380;
        synchronized (this.field5380) {
            this.field5380.method1544(true, var7, (long) arg1);
            if (arg0 != 18912) {
                this.method2305(11, -118);
            }
            return var7;
        }
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(I)V")
    public static void method2306(int arg0) {
        field5378 = null;
        field5381 = null;
        if (arg0 <= 65) {
            method2306(-26);
        }
    }

    @OriginalMember(owner = "client!rq", name = "b", descriptor = "(II)V")
    public final void method2307(int arg0, int arg1) {
        field5383++;
        class239 var3 = this.field5380;
        synchronized (this.field5380) {
            this.field5380.method1546(arg0, (byte) -8);
        }
        if (arg1 != -3000) {
            this.method2307(105, -8);
        }
    }

    @OriginalMember(owner = "client!rq", name = "b", descriptor = "(I)V")
    public final void method2308(int arg0) {
        field5377++;
        class239 var2 = this.field5380;
        synchronized (this.field5380) {
            if (arg0 != 1) {
                this.field5380 = null;
            }
            this.field5380.method1552(arg0 - 123);
        }
    }

    @OriginalMember(owner = "client!rq", name = "<init>", descriptor = "(Lgia;ILaj;)V")
    public class372(class285 arg0, int arg1, class333 arg2) {
        this.field5376 = arg2;
        this.field5376.method2090(1, false);
    }

    @OriginalMember(owner = "client!rq", name = "c", descriptor = "(I)V")
    public final void method2309(int arg0) {
        field5382++;
        class239 var2 = this.field5380;
        synchronized (this.field5380) {
            if (arg0 <= -61) {
                this.field5380.method1555((byte) -3);
            }
        }
    }
}
