import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jh")
public abstract class class307 {

    @OriginalMember(owner = "client!jh", name = "g", descriptor = "Ljava/lang/String;")
    public static String field4990 = " more options";

    @OriginalMember(owner = "client!jh", name = "f", descriptor = "S")
    public static short field4989 = 32767;

    @OriginalMember(owner = "client!jh", name = "i", descriptor = "[Lbh;")
    public static class8[] field4992 = new class8[6];

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "I")
    public static int field4984;

    @OriginalMember(owner = "client!jh", name = "b", descriptor = "I")
    public static int field4985;

    @OriginalMember(owner = "client!jh", name = "c", descriptor = "I")
    public static int field4986;

    @OriginalMember(owner = "client!jh", name = "d", descriptor = "I")
    public static int field4987;

    @OriginalMember(owner = "client!jh", name = "e", descriptor = "I")
    public static int field4988;

    @OriginalMember(owner = "client!jh", name = "h", descriptor = "[[[Lke;")
    public static class116[][][] field4991;

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(B)V")
    public abstract void method275(byte arg0);

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(IBI)I")
    public abstract int method276(int arg0, byte arg1, int arg2);

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(IBIIII)V")
    public static final void method2088(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5) {
        field4988++;
        int var6 = arg0 - arg5;
        int var7 = arg2 - arg4;
        if (var7 == 0) {
            if (var6 != 0) {
                class210.method1450(arg4, 115, arg0, arg3, arg5);
            }
        } else if (var6 == 0) {
            class232.method1607(arg4, arg5, arg2, arg3, false);
        } else {
            if (arg1 != -14) {
                field4991 = null;
            }
            int var8 = (var6 << 12) / var7;
            int var9 = arg5 - (arg4 * var8 >> 12);
            int var10;
            int var11;
            if (class34.field561 > arg4) {
                var11 = (class34.field561 * var8 >> 12) + var9;
                var10 = class34.field561;
            } else if (class148.field2371 < arg4) {
                var10 = class148.field2371;
                var11 = (class148.field2371 * var8 >> 12) + var9;
            } else {
                var11 = arg5;
                var10 = arg4;
            }
            if (class52.field766 > var11) {
                var10 = (class52.field766 - var9 << 12) / var8;
                var11 = class52.field766;
            } else if (class191.field3112 < var11) {
                var11 = class191.field3112;
                var10 = (class191.field3112 - var9 << 12) / var8;
            }
            int var12;
            int var13;
            if (arg2 < class34.field561) {
                var13 = class34.field561;
                var12 = (class34.field561 * var8 >> 12) + var9;
            } else if (arg2 > class148.field2371) {
                var12 = var9 + (class148.field2371 * var8 >> 12);
                var13 = class148.field2371;
            } else {
                var12 = arg0;
                var13 = arg2;
            }
            if (class52.field766 > var12) {
                var13 = (class52.field766 - var9 << 12) / var8;
                var12 = class52.field766;
            } else if (var12 > class191.field3112) {
                var12 = class191.field3112;
                var13 = (class191.field3112 - var9 << 12) / var8;
            }
            class91.method636(var11, var13, arg3, (byte) -118, var10, var12);
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(I)V")
    public static final void method2089(int arg0) {
        class146.field2336.method1873(-7401);
        if (arg0 != 612106668) {
            field4989 = 94;
        }
        field4984++;
        class50.field727.method1873(arg0 ^ 0xDB83E2BB);
    }

    @OriginalMember(owner = "client!jh", name = "b", descriptor = "(B)J")
    public abstract long method273(byte arg0);

    @OriginalMember(owner = "client!jh", name = "c", descriptor = "(B)V")
    public static void method2090(byte arg0) {
        field4992 = null;
        field4990 = null;
        field4991 = null;
        int var1 = -76 % ((-arg0 - 24) / 43);
    }
}
