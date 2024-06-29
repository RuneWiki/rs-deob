import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mu")
public class class316 {

    @OriginalMember(owner = "client!mu", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field4998 = new String[] { method2661(method2660(".gciW")), method2661(method2660(".gcoW")), method2661(method2660(".gcnW")), method2661(method2660(".gclW")) };

    @OriginalMember(owner = "client!mu", name = "e", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field4994 = new CRC32();

    @OriginalMember(owner = "client!mu", name = "b", descriptor = "I")
    public static int field4997 = 1;

    @OriginalMember(owner = "client!mu", name = "c", descriptor = "Lqea;")
    public static class139 field4996 = new class139();

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "I")
    public static int field4992;

    @OriginalMember(owner = "client!mu", name = "f", descriptor = "I")
    public static int field4993;

    @OriginalMember(owner = "client!mu", name = "d", descriptor = "I")
    public static int field4995;

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(IIII)I", line = 6)
    public static final int method2656(int arg0, int arg1, int arg2, int arg3) {
        try {
            field4995++;
            if (class555.field8261 == null) {
                return 0;
            }
            int var4 = arg0 >> 9;
            int var5 = arg2 >> 9;
            if (var4 < 0 || var5 < 0 || (class648.field9378 - 1) < var4 || var5 > class659.field9506 - 1) {
                return 0;
            }
            if (arg3 != 0) {
                method2657((byte) 13);
            }
            int var6 = arg1;
            if (arg1 < 3 && (class184.field2545[1][var4][var5] & 0x2) != 0) {
                var6 = arg1 + 1;
            }
            return class555.field8261[var6].method2404((byte) 108, arg0, arg2);
        } catch (RuntimeException var8) {
            throw class759.method5498(var8, field4998[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(B)V", line = 38)
    public static void method2657(byte arg0) {
        try {
            if (arg0 != 43) {
                method2657((byte) 0);
            }
            field4994 = null;
            field4996 = null;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field4998[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(IIIIII)V", line = 49)
    public static final void method2658(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        try {
            field4992++;
            int var6 = arg2 - arg1;
            int var7 = arg5 - arg4;
            if (var6 == 0) {
                if (var7 != 0) {
                    class326.method2761(1, arg0, arg1, arg4, arg5);
                }
            } else if (var7 == 0) {
                class653.method4787(-127, arg0, arg1, arg2, arg4);
            } else {
                int var8 = (var7 << 12) / var6;
                int var9 = arg4 - (arg1 * var8 >> 12);
                int var10;
                int var11;
                if (arg2 < class200.field3119) {
                    var10 = var9 + (class200.field3119 * var8 >> 12);
                    var11 = class200.field3119;
                } else if (arg2 <= class676.field9797) {
                    var10 = arg5;
                    var11 = arg2;
                } else {
                    var11 = class676.field9797;
                    var10 = (class676.field9797 * var8 >> 12) + var9;
                }
                int var12;
                int var13;
                if (class200.field3119 > arg1) {
                    var12 = class200.field3119;
                    var13 = var9 + (class200.field3119 * var8 >> 12);
                } else if (class676.field9797 >= arg1) {
                    var12 = arg1;
                    var13 = arg4;
                } else {
                    var13 = var9 + (class676.field9797 * var8 >> 12);
                    var12 = class676.field9797;
                }
                if (arg3 == -1767209748) {
                    if (var13 < class676.field9807) {
                        var13 = class676.field9807;
                        var12 = (class676.field9807 - var9 << 12) / var8;
                    } else if (class381.field5786 < var13) {
                        var12 = (class381.field5786 - var9 << 12) / var8;
                        var13 = class381.field5786;
                    }
                    if (var10 < class676.field9807) {
                        var11 = (class676.field9807 - var9 << 12) / var8;
                        var10 = class676.field9807;
                    } else if (var10 > class381.field5786) {
                        var11 = (class381.field5786 - var9 << 12) / var8;
                        var10 = class381.field5786;
                    }
                    class660.method4839(var13, var12, var10, (byte) -110, arg0, var11);
                }
            }
        } catch (RuntimeException var15) {
            throw class759.method5498(var15, field4998[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(II)Z", line = 155)
    public static final boolean method2659(int arg0, int arg1) {
        try {
            field4993++;
            if (arg0 < 50) {
                field4996 = null;
            }
            return arg1 == 2 || arg1 == 3;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field4998[3] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!mu", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2660(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x7F);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!mu", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2661(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 67;
                    break;
                case 1:
                    var10005 = 18;
                    break;
                case 2:
                    var10005 = 77;
                    break;
                case 3:
                    var10005 = 45;
                    break;
                default:
                    var10005 = 127;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
