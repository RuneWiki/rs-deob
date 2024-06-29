import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nj")
public class class219 {

    @OriginalMember(owner = "client!nj", name = "b", descriptor = "Lmf;")
    private class382 field3058 = new class382(256);

    @OriginalMember(owner = "client!nj", name = "g", descriptor = "Lok;")
    private class228 field3063;

    @OriginalMember(owner = "client!nj", name = "d", descriptor = "Lfa;")
    private class209 field3060;

    @OriginalMember(owner = "client!nj", name = "c", descriptor = "Lnea;")
    public static class664 field3059 = new class664(99, 12);

    @OriginalMember(owner = "client!nj", name = "i", descriptor = "Lkea;")
    public static class213 field3065 = new class213(512);

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "I")
    public static int field3057;

    @OriginalMember(owner = "client!nj", name = "e", descriptor = "I")
    public static int field3061;

    @OriginalMember(owner = "client!nj", name = "f", descriptor = "I")
    public static int field3062;

    @OriginalMember(owner = "client!nj", name = "h", descriptor = "I")
    public static int field3064;

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(II)V")
    public static final void method1433(int arg0, int arg1) {
        field3061++;
        class259.field3942 = 1000000000L / (long) arg1;
        if (arg0 != 3553) {
            field3065 = null;
        }
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(I)V")
    public final void method1434(int arg0) {
        this.field3058.method2285((byte) -113);
        if (arg0 <= 37) {
            this.field3063 = null;
        }
        field3062++;
    }

    @OriginalMember(owner = "client!nj", name = "b", descriptor = "(II)Lwn;")
    public final class673 method1435(int arg0, int arg1) {
        field3064++;
        Object var3 = this.field3058.method2287(1, (long) arg1);
        if (arg0 != 99) {
            return null;
        } else if (var3 != null) {
            return (class673) var3;
        } else if (this.field3060.method1383(arg1, 92)) {
            class159 var4 = this.field3060.method1386(arg1, -6514);
            int var5 = var4.field2304 ? 64 : this.field3063.field3391;
            class673 var7;
            if (var4.field2287 && this.field3063.method127()) {
                float[] var6 = this.field3060.method1385(var5, false, 0.7F, arg1, arg0 - 184, var5);
                var7 = new class673(this.field3063, 3553, 34842, var5, var5, var4.field2296 != 0, var6, 6408);
            } else {
                int[] var8;
                if (!var4.field2295 && class232.method1598(var4.field2300, (byte) 78)) {
                    var8 = this.field3060.method1381(var5, arg1, 0.7F, var5, -112, true);
                } else {
                    var8 = this.field3060.method1384(false, var5, var5, arg1, 0.7F, (byte) 125);
                }
                var7 = new class673(this.field3063, 3553, 6408, var5, var5, var4.field2296 != 0, var8, false);
            }
            var7.method3736(-115, var4.field2301, var4.field2285);
            this.field3058.method2291(var7, (long) arg1, arg0 - 98);
            return var7;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(B)V")
    public static void method1436(byte arg0) {
        field3059 = null;
        field3065 = null;
        if (arg0 >= -125) {
            field3059 = null;
        }
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(Z)V")
    public final void method1437(boolean arg0) {
        if (!arg0) {
            this.field3063 = null;
        }
        this.field3058.method2290(false, 5);
        field3057++;
    }

    @OriginalMember(owner = "client!nj", name = "<init>", descriptor = "(Lok;Lfa;)V")
    public class219(class228 arg0, class209 arg1) {
        this.field3063 = arg0;
        this.field3060 = arg1;
    }
}
