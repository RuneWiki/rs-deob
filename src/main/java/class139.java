import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public class class139 {

    @OriginalMember(owner = "client!sa", name = "e", descriptor = "Lwi;")
    private class330 field1852 = new class330(128);

    @OriginalMember(owner = "client!sa", name = "j", descriptor = "Luu;")
    private class191 field1857;

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "I")
    public static int field1848 = 0;

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "Lhv;")
    public static class365 field1849 = null;

    @OriginalMember(owner = "client!sa", name = "h", descriptor = "I")
    public static int field1855 = 1406;

    @OriginalMember(owner = "client!sa", name = "g", descriptor = "I")
    public static int field1854 = 0;

    @OriginalMember(owner = "client!sa", name = "c", descriptor = "Z")
    public static boolean field1850 = false;

    @OriginalMember(owner = "client!sa", name = "f", descriptor = "I")
    public static int field1853;

    @OriginalMember(owner = "client!sa", name = "i", descriptor = "I")
    public static int field1856;

    @OriginalMember(owner = "client!sa", name = "d", descriptor = "Ltr;")
    public static class195 field1851;

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(BI)Lur;")
    public final class380 method932(byte arg0, int arg1) {
        field1856++;
        class330 var3 = this.field1852;
        class380 var4;
        synchronized (this.field1852) {
            var4 = (class380) this.field1852.method2133((long) arg1, (byte) 73);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field1857.method1281(class414.method2543(true, arg1), class474.method2826(false, arg1), 96);
        class380 var6 = new class380();
        if (arg0 < 125) {
            return null;
        }
        if (var5 != null) {
            var6.method2382(-9196, new class164(var5));
        }
        class330 var7 = this.field1852;
        synchronized (this.field1852) {
            this.field1852.method2131(var6, (long) arg1, false);
            return var6;
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(IZIIII)V")
    public static final void method933(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        field1853++;
        int var6 = 0;
        int var7 = arg4;
        int var8 = arg2 * arg2;
        int var9 = arg4 * arg4;
        int var10 = var9 << 1;
        int var11 = var8 << 1;
        int var12 = arg4 << 1;
        int var13 = (1 - var12) * var8 + var10;
        int var14 = var9 - (var12 - 1) * var11;
        int var15 = var8 << 2;
        int var16 = var9 << 2;
        int var17 = ((var6 << 1) + 3) * var10;
        int var18 = ((arg4 << 1) - 3) * var11;
        int var19 = (var6 + 1) * var16;
        int var20 = (arg4 - 1) * var15;
        if (arg1) {
            method933(-54, true, -99, 121, -47, 4);
        }
        class221.method1489(class466.field6955[arg3], arg5 - arg2, arg2 + arg5, (byte) -30, arg0);
        while (var7 > 0) {
            if (var13 < 0) {
                while (var13 < 0) {
                    var13 += var17;
                    var14 += var19;
                    var6++;
                    var19 += var16;
                    var17 += var16;
                }
            }
            if (var14 < 0) {
                var14 += var19;
                var13 += var17;
                var6++;
                var19 += var16;
                var17 += var16;
            }
            var14 += -var18;
            var13 += -var20;
            var7--;
            var20 -= var15;
            var18 -= var15;
            int var21 = arg3 - var7;
            int var22 = arg3 + var7;
            int var23 = arg5 + var6;
            int var24 = arg5 - var6;
            class221.method1489(class466.field6955[var21], var24, var23, (byte) -30, arg0);
            class221.method1489(class466.field6955[var22], var24, var23, (byte) -30, arg0);
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(B)V")
    public static void method934(byte arg0) {
        field1851 = null;
        if (arg0 != -48) {
            method933(64, false, -79, 77, 114, 68);
        }
        field1849 = null;
    }

    @OriginalMember(owner = "client!sa", name = "<init>", descriptor = "(Liv;ILuu;)V")
    public class139(class65 arg0, int arg1, class191 arg2) {
        this.field1857 = arg2;
        if (this.field1857 != null) {
            int var4 = this.field1857.method1294(-1) - 1;
            this.field1857.method1290(false, var4);
        }
    }
}
