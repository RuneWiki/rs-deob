import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public class class116 {

    @OriginalMember(owner = "client!ed", name = "e", descriptor = "Leba;")
    public static class550 field1486 = new class550(37, -2);

    @OriginalMember(owner = "client!ed", name = "i", descriptor = "I")
    public static int field1490 = 1338;

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "I")
    public static int field1482;

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "I")
    public static int field1483;

    @OriginalMember(owner = "client!ed", name = "c", descriptor = "I")
    public static int field1484;

    @OriginalMember(owner = "client!ed", name = "d", descriptor = "I")
    public static int field1485;

    @OriginalMember(owner = "client!ed", name = "f", descriptor = "I")
    public static int field1487;

    @OriginalMember(owner = "client!ed", name = "g", descriptor = "I")
    public static int field1488;

    @OriginalMember(owner = "client!ed", name = "h", descriptor = "[Lf;")
    public static class532[] field1489;

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(IBIIILhe;I)V")
    public static final void method678(int arg0, byte arg1, int arg2, int arg3, int arg4, class231 arg5, int arg6) {
        field1482++;
        class452.method2540(arg4, 0, arg5.field397, arg5.field385, arg6, arg0, arg5.field398, arg2, arg3, 512);
        if (arg1 > -9) {
            field1490 = -119;
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(I)V")
    public static void method679(int arg0) {
        if (arg0 != 0) {
            method680((byte) -119);
        }
        field1489 = null;
        field1486 = null;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(B)V")
    public static final void method680(byte arg0) {
        for (int var1 = 0; var1 < 100; var1++) {
            class292.field3858[var1] = null;
        }
        if (arg0 == -68) {
            field1483++;
            class206.field2759 = 0;
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;I)V")
    public static final void method681(String arg0, String arg1, String arg2, int arg3, int arg4, String arg5, int arg6) {
        class686.method3884(arg0, (byte) 96, null, arg6, arg2, arg5, arg4, arg1, -1);
        field1485++;
        if (arg3 <= 38) {
            method680((byte) 94);
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(Ljava/lang/Object;ZB)[B")
    public static final byte[] method682(Object arg0, boolean arg1, byte arg2) {
        if (arg2 > -19) {
            method678(-24, (byte) -7, -1, -112, -95, null, -78);
        }
        field1484++;
        if (arg0 == null) {
            return null;
        } else if (arg0 instanceof byte[]) {
            byte[] var3 = (byte[]) arg0;
            return arg1 ? class339.method1981(0, var3) : var3;
        } else if (arg0 instanceof class337) {
            class337 var4 = (class337) arg0;
            return var4.method1223((byte) 59);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(III)Lri;")
    public static final class634 method683(int arg0, int arg1, int arg2) {
        class207 var3 = class153.field2168[arg0][arg1][arg2];
        return var3 == null ? null : var3.field2774;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(IIIIBII)V")
    public static final void method684(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6) {
        field1488++;
        int var7 = class496.method2826(arg0, (byte) 36, class6.field66, class151.field2071);
        int var8 = class496.method2826(arg1, (byte) 36, class6.field66, class151.field2071);
        int var9 = class496.method2826(arg6, (byte) 36, class281.field3703, class255.field3350);
        int var10 = class496.method2826(arg2, (byte) 36, class281.field3703, class255.field3350);
        int var11 = -101 / ((arg4 + 30) / 40);
        int var12 = class496.method2826(arg0 + arg3, (byte) 36, class6.field66, class151.field2071);
        int var13 = class496.method2826(arg1 - arg3, (byte) 36, class6.field66, class151.field2071);
        for (int var14 = var7; var14 < var12; var14++) {
            class285.method1691(var10, class315.field4224[var14], -7, var9, arg5);
        }
        for (int var15 = var8; var15 > var13; var15--) {
            class285.method1691(var10, class315.field4224[var15], -7, var9, arg5);
        }
        int var16 = class496.method2826(arg3 + arg6, (byte) 36, class281.field3703, class255.field3350);
        int var17 = class496.method2826(arg2 - arg3, (byte) 36, class281.field3703, class255.field3350);
        for (int var18 = var12; var18 <= var13; var18++) {
            int[] var19 = class315.field4224[var18];
            class285.method1691(var16, var19, -7, var9, arg5);
            class285.method1691(var10, var19, -7, var17, arg5);
        }
    }

    @OriginalMember(owner = "client!ed", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field1487++;
        throw new IllegalStateException();
    }
}
