import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!od")
public class class507 {

    @OriginalMember(owner = "client!od", name = "c", descriptor = "Lnk;")
    public static class326 field7377;

    @OriginalMember(owner = "client!od", name = "g", descriptor = "Lvv;")
    public static class313 field7381;

    @OriginalMember(owner = "client!od", name = "i", descriptor = "F")
    public static float field7383;

    @OriginalMember(owner = "client!od", name = "a", descriptor = "I")
    public static int field7375;

    @OriginalMember(owner = "client!od", name = "b", descriptor = "I")
    public static int field7376;

    @OriginalMember(owner = "client!od", name = "d", descriptor = "I")
    public static int field7378;

    @OriginalMember(owner = "client!od", name = "e", descriptor = "I")
    public static int field7379;

    @OriginalMember(owner = "client!od", name = "f", descriptor = "I")
    public static int field7380;

    @OriginalMember(owner = "client!od", name = "h", descriptor = "I")
    public static int field7382;

    static {
        new class306("Join your channel by clicking 'Join Chat' and typing: ", "Klick auf 'Betreten' und gib ein: ", "Pour rejoindre votre canal, cliquez sur « Participer » et entrez : ", "Para entrar no seu canal, clique em \"Acessar bate-papo\" e digite: ");
        field7377 = new class326(13, 0);
        field7381 = new class313(28, 2);
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(ZI)S", line = 11)
    public static final short method2982(boolean arg0, int arg1) {
        field7376++;
        int var2 = arg1 >> 10 & 0x3F;
        int var3 = arg1 >> 3 & 0x70;
        int var4 = arg1 & 0x7F;
        int var5 = var4 <= 64 ? var3 * var4 >> 7 : (127 - var4) * var3 >> 7;
        if (arg0) {
            return -56;
        }
        int var6 = var4 + var5;
        int var7;
        if (var6 == 0) {
            var7 = var5 << 1;
        } else {
            var7 = (var5 << 8) / var6;
        }
        return (short) (var6 | var7 >> 4 << 7 | var2 << 10);
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(IIII)I", line = 44)
    public static final int method2983(int arg0, int arg1, int arg2, int arg3) {
        field7375++;
        if ((class192.field2982[arg2][arg3][arg1] & 0x8) == arg0) {
            return arg2 <= 0 || (class192.field2982[1][arg3][arg1] & 0x2) == 0 ? arg2 : arg2 - 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(IIIZ)V", line = 61)
    public static final void method2984(int arg0, int arg1, int arg2, boolean arg3) {
        if (arg0 == 0) {
            class272.field4509++;
            class265.method1775(-2, class94.field1574);
        }
        field7378++;
        if (arg0 == 1) {
            class356.field5551++;
            class265.method1775(-2, class126.field2182);
        }
        class261.field4357.method160(-742698264, class16.field181 + arg2);
        class261.field4357.method119(class468.field6955.method1369(82, 26) ? 1 : 0, -4729);
        class261.field4357.method160(-742698264, class455.field6794 + arg1);
        class314.field4946 = arg2;
        class192.field2991 = false;
        if (arg3) {
            class420.field6346 = arg1;
            class269.method1794(-125);
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(Lqq;IZZ)V", line = 92)
    public static final void method2985(class52 arg0, int arg1, boolean arg2, boolean arg3) {
        field7380++;
        int var4 = arg0.field841;
        int var5 = (int) arg0.field4542;
        arg0.method1821((byte) -124);
        if (arg3) {
            class59.method396(var4, 84);
        }
        class106.method750(var4, arg1 - 32534);
        class68 var6 = class22.method115(7521, var5);
        if (var6 != null) {
            class396.method2476(var6, arg1 - 32406);
        }
        class533.method3158(16);
        if (!arg2 && class379.field5881 != -1) {
            class462.method2758(-118, class379.field5881, 1);
        }
        class318 var7 = new class318(class259.field4346);
        for (class52 var8 = (class52) var7.method2019(21388); var8 != null; var8 = (class52) var7.method2016(0)) {
            if (!var8.method1818(false)) {
                var8 = (class52) var7.method2019(21388);
                if (var8 == null) {
                    break;
                }
            }
            if (var8.field843 == 3) {
                int var9 = (int) var8.field4542;
                if ((var9 >>> 16) == var4) {
                    method2985(var8, 32407, arg2, true);
                }
            }
        }
        if (arg1 != 32407) {
            method2984(-24, 98, -22, false);
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(IIIII)V", line = 149)
    public static final void method2986(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class182.field2877 <= (arg3 - arg4) && (arg3 + arg4) <= class235.field4076 && (arg0 - arg4) >= class29.field460 && class472.field6996 >= (arg0 + arg4)) {
            class277.method1826(-1, arg0, arg1, arg4, arg3);
        } else {
            class95.method666(false, arg1, arg4, arg3, arg0);
        }
        if (arg2 != -1) {
            field7382 = 112;
        }
        field7379++;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(Z)V", line = 169)
    public static void method2987(boolean arg0) {
        field7381 = null;
        if (!arg0) {
            field7377 = null;
        }
    }
}
