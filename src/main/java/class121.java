import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kk")
public class class121 {

    @OriginalMember(owner = "client!kk", name = "e", descriptor = "F")
    public static float field1846 = 0.0F;

    @OriginalMember(owner = "client!kk", name = "j", descriptor = "Ljava/lang/String;")
    public static String field1851 = "Please remove ";

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "F")
    public static float field1842;

    @OriginalMember(owner = "client!kk", name = "c", descriptor = "I")
    public static int field1844;

    @OriginalMember(owner = "client!kk", name = "d", descriptor = "I")
    public static int field1845;

    @OriginalMember(owner = "client!kk", name = "f", descriptor = "I")
    public static int field1847;

    @OriginalMember(owner = "client!kk", name = "i", descriptor = "Lin;")
    public class168 field1850;

    @OriginalMember(owner = "client!kk", name = "b", descriptor = "Lwb;")
    public class253 field1843;

    @OriginalMember(owner = "client!kk", name = "h", descriptor = "[S")
    public static short[] field1849;

    @OriginalMember(owner = "client!kk", name = "g", descriptor = "[[I")
    public static int[][] field1848;

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(IIIIII)V", line = 9)
    public static final void method881(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg3 != 217) {
            method881(122, 19, 22, -3, 49, -93);
        }
        if (class141.field2187 >= arg5 && class119.field1817 <= arg2) {
            boolean var6;
            if (class206.field3170 > arg4) {
                var6 = false;
                arg4 = class206.field3170;
            } else if (class12.field184 >= arg4) {
                var6 = true;
            } else {
                arg4 = class12.field184;
                var6 = false;
            }
            boolean var7;
            if (arg0 < class206.field3170) {
                arg0 = class206.field3170;
                var7 = false;
            } else if (class12.field184 >= arg0) {
                var7 = true;
            } else {
                arg0 = class12.field184;
                var7 = false;
            }
            if (arg5 < class119.field1817) {
                arg5 = class119.field1817;
            } else {
                class272.method1876(class34.field525[arg5++], arg0, arg4, arg1, (byte) -125);
            }
            if (arg2 > class141.field2187) {
                arg2 = class141.field2187;
            } else {
                class272.method1876(class34.field525[arg2--], arg0, arg4, arg1, (byte) -25);
            }
            if (var6 && var7) {
                for (int var8 = arg5; var8 <= arg2; var8++) {
                    int[] var9 = class34.field525[var8];
                    var9[arg4] = var9[arg0] = arg1;
                }
            } else if (var6) {
                for (int var11 = arg5; var11 <= arg2; var11++) {
                    class34.field525[var11][arg4] = arg1;
                }
            } else if (var7) {
                for (int var10 = arg5; var10 <= arg2; var10++) {
                    class34.field525[var10][arg0] = arg1;
                }
            }
        }
        field1845++;
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(Ll;IBI)[Lgm;", line = 125)
    public static final class249[] method882(class133 arg0, int arg1, byte arg2, int arg3) {
        field1847++;
        if (arg2 >= -126) {
            return (class249[]) null;
        } else if (class181.method1296(false, arg0, arg1, arg3)) {
            return class268.method1854((byte) 124);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(I)V", line = 140)
    public static void method883(int arg0) {
        if (arg0 == -244) {
            field1849 = null;
            field1848 = (int[][]) null;
            field1851 = null;
        }
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(BIII)I", line = 152)
    public static final int method884(byte arg0, int arg1, int arg2, int arg3) {
        if (arg0 > -29) {
            field1846 = 1.3577465F;
        }
        field1844++;
        if (arg3 > 243) {
            arg2 >>= 0x4;
        } else if (arg3 > 217) {
            arg2 >>= 0x3;
        } else if (arg3 > 192) {
            arg2 >>= 0x2;
        } else if (arg3 > 179) {
            arg2 >>= 0x1;
        }
        return (arg3 >> 1) + (arg1 >> 2 << 10) + (arg2 >> 5 << 7);
    }
}
