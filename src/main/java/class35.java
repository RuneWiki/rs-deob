import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!al")
public class class35 extends class88 {

    @OriginalMember(owner = "client!al", name = "R", descriptor = "I")
    public int field459 = 0;

    @OriginalMember(owner = "client!al", name = "J", descriptor = "I")
    public static int field451 = 0;

    @OriginalMember(owner = "client!al", name = "G", descriptor = "I")
    public static int field448 = 0;

    @OriginalMember(owner = "client!al", name = "L", descriptor = "Z")
    public static boolean field453 = false;

    @OriginalMember(owner = "client!al", name = "N", descriptor = "[I")
    public static int[] field455 = new int[] { -1, -1, 1, 1 };

    @OriginalMember(owner = "client!al", name = "P", descriptor = "Ljava/lang/String;")
    public static String field457 = "shake:";

    @OriginalMember(owner = "client!al", name = "Q", descriptor = "Ljava/lang/String;")
    public static String field458 = "white:";

    @OriginalMember(owner = "client!al", name = "E", descriptor = "I")
    public static int field446;

    @OriginalMember(owner = "client!al", name = "F", descriptor = "I")
    public static int field447;

    @OriginalMember(owner = "client!al", name = "I", descriptor = "I")
    public static int field450;

    @OriginalMember(owner = "client!al", name = "K", descriptor = "I")
    public static int field452;

    @OriginalMember(owner = "client!al", name = "O", descriptor = "Leh;")
    public static class137 field456;

    @OriginalMember(owner = "client!al", name = "M", descriptor = "Lae;")
    public static class92 field454;

    @OriginalMember(owner = "client!al", name = "H", descriptor = "[I")
    public static int[] field449;

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(ILpd;)V")
    public final void method186(int arg0, class96 arg1) {
        field450++;
        while (true) {
            int var3 = arg1.method584(255);
            if (var3 == 0) {
                if (arg0 == 16) {
                    return;
                } else {
                    field457 = null;
                    return;
                }
            }
            this.method189((byte) -10, var3, arg1);
        }
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(IIBII)V")
    public static final void method187(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        class166.field2666 = -1;
        class224.field3606 = class7.field88 * arg1 / arg3;
        class220.field3524 = class44.field562 * arg4 / arg0;
        field446++;
        if (arg2 > 4) {
            class236.field3910 = -1;
            class92.method511((byte) 92);
        }
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(IIIII)Z")
    public static final boolean method188(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = class282.field4472 * arg0 + class208.field3318 * arg3 >> 16;
        int var6 = class282.field4472 * arg3 - class208.field3318 * arg0 >> 16;
        int var7 = class247.field4073 * var6 + class126.field2019 * arg1 >> 16;
        int var8 = class247.field4073 * arg1 - class126.field2019 * var6 >> 16;
        if (var7 < 1) {
            var7 = 1;
        }
        int var9 = (var5 << 9) / var7;
        int var10 = (var8 << 9) / var7;
        int var11 = class247.field4073 * var6 + class126.field2019 * arg2 >> 16;
        int var12 = class247.field4073 * arg2 - class126.field2019 * var6 >> 16;
        if (var11 < 1) {
            var11 = 1;
        }
        int var13 = (var5 << 9) / var11;
        int var14 = (var12 << 9) / var11;
        if (var7 < 50 && var11 < 50) {
            return false;
        } else if (var7 > arg4 && var11 > arg4) {
            return false;
        } else if (var9 < class148.field2326 && var13 < class148.field2326) {
            return false;
        } else if (var9 > class239.field3942 && var13 > class239.field3942) {
            return false;
        } else if (var10 < class59.field758 && var14 < class59.field758) {
            return false;
        } else {
            return var10 <= class51.field665 || var14 <= class51.field665;
        }
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(BILpd;)V")
    private final void method189(byte arg0, int arg1, class96 arg2) {
        if (arg0 == -10) {
            if (arg1 == 2) {
                this.field459 = arg2.method549(255);
            }
            field447++;
        }
    }

    @OriginalMember(owner = "client!al", name = "c", descriptor = "(B)V")
    public static void method190(byte arg0) {
        if (arg0 != -27) {
            method187(112, 55, (byte) 123, 37, -41);
        }
        field456 = null;
        field455 = null;
        field458 = null;
        field454 = null;
        field449 = null;
        field457 = null;
    }
}
