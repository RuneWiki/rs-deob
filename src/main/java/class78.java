import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public class class78 extends class594 {

    @OriginalMember(owner = "client!cb", name = "k", descriptor = "Lgq;")
    public class305 field1061;

    @OriginalMember(owner = "client!cb", name = "i", descriptor = "I")
    public static int field1059;

    @OriginalMember(owner = "client!cb", name = "j", descriptor = "I")
    public static int field1060;

    @OriginalMember(owner = "client!cb", name = "l", descriptor = "Lgaa;")
    public static class279 field1062;

    @OriginalMember(owner = "client!cb", name = "h", descriptor = "Lac;")
    public static class284 field1058;

    @OriginalMember(owner = "client!cb", name = "c", descriptor = "(B)V")
    public static void method445(byte arg0) {
        if (arg0 != -84) {
            field1058 = null;
        }
        field1058 = null;
        field1062 = null;
    }

    @OriginalMember(owner = "client!cb", name = "d", descriptor = "(B)V")
    public static final void method446(byte arg0) {
        if (arg0 != -86) {
            method446((byte) -78);
        }
        field1060++;
        if (class225.field2880 != null && class125.field1560 != null) {
            return;
        }
        class125.field1560 = new int[256];
        class225.field2880 = new int[256];
        for (int var1 = 0; var1 < 256; var1++) {
            double var2 = (double) var1 / 255.0D * 6.283185307179586D;
            class225.field2880[var1] = (int) (Math.sin(var2) * 4096.0D);
            class125.field1560[var1] = (int) (Math.cos(var2) * 4096.0D);
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(IIIBI)V")
    public static final void method447(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        field1059++;
        if (arg3 >= -75) {
            method447(26, 26, -19, (byte) -94, 78);
        }
        if (arg0 < arg1) {
            for (int var5 = arg0; var5 < arg1; var5++) {
                class256.field3173[var5][arg4] = arg2;
            }
        } else {
            for (int var6 = arg1; var6 < arg0; var6++) {
                class256.field3173[var6][arg4] = arg2;
            }
        }
    }

    @OriginalMember(owner = "client!cb", name = "<init>", descriptor = "(Lre;II[B)V")
    public class78(class582 arg0, int arg1, int arg2, byte[] arg3) {
        this.field1061 = arg0.method3350(class33.field495, (byte) -84, arg3, false, arg2, arg1);
        this.field1061.method1052(false, -25920, false);
    }

    @OriginalMember(owner = "client!cb", name = "<init>", descriptor = "(Lre;II[I)V")
    public class78(class582 arg0, int arg1, int arg2, int[] arg3) {
        this.field1061 = arg0.method3349(-47, arg2, false, arg1, arg3);
        this.field1061.method1052(false, -25920, false);
    }
}
