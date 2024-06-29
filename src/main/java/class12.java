import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!be")
public abstract class class12 extends class99 {

    @OriginalMember(owner = "client!be", name = "fb", descriptor = "I")
    public int field297 = 1000;

    @OriginalMember(owner = "client!be", name = "O", descriptor = "[I")
    public static int[] field294 = new int[99];

    @OriginalMember(owner = "client!be", name = "eb", descriptor = "[I")
    public static int[] field296 = new int[50];

    @OriginalMember(owner = "client!be", name = "kb", descriptor = "Lvc;")
    public static class128 field302;

    @OriginalMember(owner = "client!be", name = "ob", descriptor = "I")
    public static int field306;

    @OriginalMember(owner = "client!be", name = "ub", descriptor = "I")
    public static int field312;

    @OriginalMember(owner = "client!be", name = "tb", descriptor = "[Lod;")
    public static class88[] field311;

    @OriginalMember(owner = "client!be", name = "pb", descriptor = "Lpd;")
    public static class94 field307;

    @OriginalMember(owner = "client!be", name = "vb", descriptor = "Lpd;")
    private static class94 field313;

    @OriginalMember(owner = "client!be", name = "qb", descriptor = "Lpd;")
    public static class94 field308;

    @OriginalMember(owner = "client!be", name = "nb", descriptor = "Lpd;")
    public static class94 field305;

    @OriginalMember(owner = "client!be", name = "db", descriptor = "I")
    public static int field295;

    @OriginalMember(owner = "client!be", name = "gb", descriptor = "I")
    public static int field298;

    @OriginalMember(owner = "client!be", name = "hb", descriptor = "I")
    public static int field299;

    @OriginalMember(owner = "client!be", name = "ib", descriptor = "I")
    public static int field300;

    @OriginalMember(owner = "client!be", name = "jb", descriptor = "I")
    public static int field301;

    @OriginalMember(owner = "client!be", name = "sb", descriptor = "J")
    public static long field310;

    @OriginalMember(owner = "client!be", name = "rb", descriptor = "Ltd;")
    public static class118 field309;

    @OriginalMember(owner = "client!be", name = "lb", descriptor = "[I")
    public static int[] field303;

    @OriginalMember(owner = "client!be", name = "mb", descriptor = "[I")
    public static int[] field304;

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 99; var1++) {
            int var2 = var1 + 1;
            int var3 = (int) ((double) var2 + Math.pow(2.0D, (double) var2 / 7.0D) * 300.0D);
            var0 += var3;
            field294[var1] = var0 / 4;
        }
        field302 = new class128(500);
        field306 = 0;
        field312 = 0;
        field311 = new class88[4];
        field307 = class28.method249(-95, "Die Adresse dieses Computers wurde gesperrt)1");
        field313 = class28.method249(-94, "glow2:");
        field308 = class28.method249(-79, "gr-Un:");
        field305 = field313;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(IILs;)Lad;", line = 3)
    public static final class5 method75(int arg0, int arg1, class111 arg2) {
        field301++;
        if (class88.method657(arg2, false, arg1)) {
            if (arg0 != 16036) {
                field303 = null;
            }
            return class100.method752(arg0 ^ 0x3FA0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(IIIIIIIII)V", line = 20)
    public void method76(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field295++;
        class48 var10 = this.method77(1536);
        if (var10 != null) {
            this.field297 = var10.field297;
            var10.method76(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        }
    }

    @OriginalMember(owner = "client!be", name = "c", descriptor = "(I)Lia;", line = 39)
    public class48 method77(int arg0) {
        if (arg0 != 1536) {
            field312 = 69;
        }
        field299++;
        return null;
    }

    @OriginalMember(owner = "client!be", name = "d", descriptor = "(I)V", line = 75)
    public static void method78(int arg0) {
        field313 = null;
        field304 = null;
        if (arg0 < 35) {
            method78(-47);
        }
        field294 = null;
        field305 = null;
        field296 = null;
        field302 = null;
        field303 = null;
        field308 = null;
        field311 = null;
        field307 = null;
        field309 = null;
    }
}
