import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hn")
public class class750 extends class76 {

    @OriginalMember(owner = "client!hn", name = "V", descriptor = "[Ljava/lang/String;")
    private static final String[] field10913 = new String[] { method5457(method5456("y(\u001a'p")), method5457(method5456("y(\u001a/p")), method5457(method5456("y(\u001a\"p")), method5457(method5456("y(\u001a#p")) };

    @OriginalMember(owner = "client!hn", name = "S", descriptor = "Ldea;")
    public static class259 field10911 = new class259();

    @OriginalMember(owner = "client!hn", name = "U", descriptor = "I")
    public static int field10912 = 0;

    @OriginalMember(owner = "client!hn", name = "K", descriptor = "I")
    public static int field10908;

    @OriginalMember(owner = "client!hn", name = "T", descriptor = "I")
    public static int field10909;

    @OriginalMember(owner = "client!hn", name = "R", descriptor = "I")
    public static int field10910;

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(IIZII)V")
    public static final void method5453(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
        try {
            class629.field9205 = arg4;
            class293.field4324 = arg3;
            if (arg2) {
                method5455(-56);
            }
            class339.field5276 = arg0;
            class127.field1498 = arg1;
            ++field10909;
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field10913[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(II)[[I")
    public final int[][] method234(int arg0, int arg1) {
        try {
            ++field10908;
            if (arg1 >= -38) {
                return null;
            } else {
                int[][] var3 = super.field3230.method5463((byte) -8, arg0);
                if (super.field3230.field10931 && this.method678((byte) -4)) {
                    int[] var4 = var3[0];
                    int[] var5 = var3[1];
                    int[] var6 = var3[2];
                    int var7 = arg0 % super.field876 * super.field876;
                    for (int var8 = 0; ~class343.field5332 < ~var8; ++var8) {
                        int var9 = super.field875[var8 % super.field881 + var7];
                        var6[var8] = class291.method2359(var9, 255) << 4;
                        var5[var8] = class291.method2359(var9, 65280) >> 4;
                        var4[var8] = class291.method2359(4080, var9 >> 12);
                    }
                }
                return var3;
            }
        } catch (RuntimeException var11) {
            throw class759.method5498(var11, field10913[1] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!hn", name = "c", descriptor = "(II)S")
    public static final short method5454(int arg0, int arg1) {
        try {
            ++field10910;
            int var2 = arg0 >> 10 & 63;
            int var3 = 112 & arg0 >> 3;
            if (arg1 != 13020) {
                return 72;
            } else {
                int var4 = arg0 & 127;
                int var5 = var4 <= 64 ? var3 * var4 >> 7 : (-var4 + 127) * var3 >> 7;
                int var6 = var4 + var5;
                int var7;
                if (~var6 != -1) {
                    var7 = (var5 << 8) / var6;
                } else {
                    var7 = var5 << 1;
                }
                return (short) (var6 | var2 << 10 | var7 >> 4 << 7);
            }
        } catch (RuntimeException var10) {
            throw class759.method5498(var10, field10913[2] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!hn", name = "g", descriptor = "(I)V")
    public static void method5455(int arg0) {
        try {
            if (arg0 != 13457) {
                method5454(-50, 103);
            }
            field10911 = null;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field10913[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!hn", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5456(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 88);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!hn", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5457(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 17;
                    break;
                case 1:
                    var10005 = 70;
                    break;
                case 2:
                    var10005 = 52;
                    break;
                case 3:
                    var10005 = 102;
                    break;
                default:
                    var10005 = 88;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
