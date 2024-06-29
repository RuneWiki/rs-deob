import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wl")
public abstract class class287 extends class525 {

    @OriginalMember(owner = "client!wl", name = "C", descriptor = "Z")
    public volatile boolean field4248 = true;

    @OriginalMember(owner = "client!wl", name = "E", descriptor = "[S")
    public static short[] field4250 = new short[] { 59, 9, 30, 60, 17, 58, 22, 50 };

    @OriginalMember(owner = "client!wl", name = "A", descriptor = "[B")
    public static byte[] field4246 = new byte[520];

    @OriginalMember(owner = "client!wl", name = "B", descriptor = "[[I")
    public static int[][] field4247 = new int[128][128];

    @OriginalMember(owner = "client!wl", name = "F", descriptor = "Lbd;")
    public static class44 field4251 = new class44("Loading additional fonts - ", "Lade Zusatzschriftarten - ", "Chargement de polices secondaires - ", "Carregando fontes principais - ");

    @OriginalMember(owner = "client!wl", name = "K", descriptor = "Lgw;")
    public static class118 field4256 = new class118();

    @OriginalMember(owner = "client!wl", name = "N", descriptor = "I")
    public static int field4259 = 0;

    @OriginalMember(owner = "client!wl", name = "M", descriptor = "Lqv;")
    public static class316 field4258 = new class316(66, 2);

    @OriginalMember(owner = "client!wl", name = "D", descriptor = "I")
    public static int field4249;

    @OriginalMember(owner = "client!wl", name = "G", descriptor = "I")
    public static int field4252;

    @OriginalMember(owner = "client!wl", name = "I", descriptor = "I")
    public static int field4254;

    @OriginalMember(owner = "client!wl", name = "L", descriptor = "Lkv;")
    public static class181 field4257;

    @OriginalMember(owner = "client!wl", name = "O", descriptor = "Lci;")
    public static class320 field4260;

    @OriginalMember(owner = "client!wl", name = "H", descriptor = "Z")
    public boolean field4253;

    @OriginalMember(owner = "client!wl", name = "J", descriptor = "Z")
    public boolean field4255;

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(Z)V")
    public static final void method1838(boolean arg0) {
        class248.field3714 = false;
        field4252++;
        if (arg0) {
            class251.method1626(class252.field3743, class415.field5887, 0, class517.field7487, class291.field4322);
        }
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(IIIIII)V")
    public static final void method1839(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field4249++;
        int var6 = arg5 - arg4;
        int var7 = arg2 - arg0;
        if (var6 == 0) {
            if (var7 != 0) {
                class260.method1670(arg1, arg4, 73, arg2, arg0);
            }
        } else if (var7 == 0) {
            class336.method2134(arg5, arg1, -118, arg4, arg0);
        } else {
            if (arg3 != 18938) {
                method1839(-80, 57, -33, -102, -95, 105);
            }
            int var8 = (var7 << 12) / var6;
            int var9 = arg0 - (arg4 * var8 >> 12);
            int var10;
            int var11;
            if (arg4 < class465.field6763) {
                var10 = class465.field6763;
                var11 = (class465.field6763 * var8 >> 12) + var9;
            } else if (arg4 <= class176.field2630) {
                var10 = arg4;
                var11 = arg0;
            } else {
                var10 = class176.field2630;
                var11 = (class176.field2630 * var8 >> 12) + var9;
            }
            int var12;
            int var13;
            if (arg5 < class465.field6763) {
                var13 = (class465.field6763 * var8 >> 12) + var9;
                var12 = class465.field6763;
            } else if (class176.field2630 < arg5) {
                var12 = class176.field2630;
                var13 = var9 + (class176.field2630 * var8 >> 12);
            } else {
                var13 = arg2;
                var12 = arg5;
            }
            if (class424.field5996 > var11) {
                var10 = (class424.field5996 - var9 << 12) / var8;
                var11 = class424.field5996;
            } else if (var11 > class333.field4936) {
                var10 = (class333.field4936 - var9 << 12) / var8;
                var11 = class333.field4936;
            }
            if (var13 < class424.field5996) {
                var13 = class424.field5996;
                var12 = (class424.field5996 - var9 << 12) / var8;
            } else if (var13 > class333.field4936) {
                var13 = class333.field4936;
                var12 = (class333.field4936 - var9 << 12) / var8;
            }
            class374.method2282(var11, var12, var13, arg1, var10, 0);
        }
    }

    @OriginalMember(owner = "client!wl", name = "d", descriptor = "(B)[B")
    public abstract byte[] method398(byte arg0);

    @OriginalMember(owner = "client!wl", name = "c", descriptor = "(I)I")
    public abstract int method399(int arg0);

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(II)Ljk;")
    public static final class456 method1840(int arg0, int arg1) {
        if (arg1 >= -42) {
            method1840(-41, 62);
        }
        field4254++;
        if (arg0 == 0) {
            if ((double) class382.field5457 == 3.0D) {
                return class202.field3124;
            }
            if ((double) class382.field5457 == 4.0D) {
                return class450.field6577;
            }
            if ((double) class382.field5457 == 6.0D) {
                return class7.field53;
            }
            if ((double) class382.field5457 >= 8.0D) {
                return class121.field1898;
            }
        } else if (arg0 == 1) {
            if ((double) class382.field5457 == 3.0D) {
                return class7.field53;
            }
            if ((double) class382.field5457 == 4.0D) {
                return class121.field1898;
            }
            if ((double) class382.field5457 == 6.0D) {
                return class214.field3231;
            }
            if ((double) class382.field5457 >= 8.0D) {
                return class67.field1123;
            }
        } else if (arg0 == 2) {
            if ((double) class382.field5457 == 3.0D) {
                return class214.field3231;
            }
            if ((double) class382.field5457 == 4.0D) {
                return class67.field1123;
            }
            if ((double) class382.field5457 == 6.0D) {
                return class156.field2374;
            }
            if ((double) class382.field5457 >= 8.0D) {
                return class130.field2042;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!wl", name = "e", descriptor = "(I)V")
    public static void method1841(int arg0) {
        field4256 = null;
        if (arg0 != 30) {
            return;
        }
        field4251 = null;
        field4257 = null;
        field4250 = null;
        field4258 = null;
        field4247 = null;
        field4260 = null;
        field4246 = null;
    }
}
