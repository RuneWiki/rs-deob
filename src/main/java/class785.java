import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gfa")
public class class785 {

    @OriginalMember(owner = "client!gfa", name = "k", descriptor = "I")
    public int field11467;

    @OriginalMember(owner = "client!gfa", name = "l", descriptor = "I")
    public int field11463;

    @OriginalMember(owner = "client!gfa", name = "a", descriptor = "I")
    public int field11471;

    @OriginalMember(owner = "client!gfa", name = "c", descriptor = "I")
    public int field11465;

    @OriginalMember(owner = "client!gfa", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field11474 = new String[] { method5651(method5650("h5HYSf=@\u0003Q'")), method5651(method5650("h5HY.'")), method5651(method5650("h5HY*'")), method5651(method5650("h5HY+'")), method5651(method5650("h5HY-'")), method5651(method5650("a&E\u001b")), method5651(method5650("t}\u0007Y\u0012")), method5651(method5650("h5HY,'")), method5651(method5650("h5HY)'")) };

    @OriginalMember(owner = "client!gfa", name = "f", descriptor = "I")
    public static int field11462;

    @OriginalMember(owner = "client!gfa", name = "h", descriptor = "I")
    public static int field11464;

    @OriginalMember(owner = "client!gfa", name = "g", descriptor = "I")
    public static int field11466;

    @OriginalMember(owner = "client!gfa", name = "d", descriptor = "I")
    public static int field11468;

    @OriginalMember(owner = "client!gfa", name = "i", descriptor = "I")
    public static int field11469;

    @OriginalMember(owner = "client!gfa", name = "j", descriptor = "I")
    public static int field11470;

    @OriginalMember(owner = "client!gfa", name = "e", descriptor = "I")
    public static int field11472;

    @OriginalMember(owner = "client!gfa", name = "b", descriptor = "[I")
    public static int[] field11473;

    @OriginalMember(owner = "client!gfa", name = "a", descriptor = "(Z)V")
    public static void method5644(boolean arg0) {
        try {
            if (!arg0) {
                method5646(88, 55, 113, -78, -88, -45, -33);
            }
            field11473 = null;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field11474[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gfa", name = "a", descriptor = "(B)V")
    public static final void method5645(byte arg0) {
        try {
            field11464++;
            for (int var1 = 0; var1 < 100; var1++) {
                class527.field7763[var1] = null;
            }
            if (arg0 != -107) {
                field11472 = -18;
            }
            class232.field3589 = 0;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field11474[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gfa", name = "a", descriptor = "(IIIIIII)V")
    public static final void method5646(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        try {
            field11468++;
            int var7 = class694.method5039(class478.field7264, class310.field5088, 0, arg2);
            int var8 = class694.method5039(class478.field7264, class310.field5088, 0, arg1);
            int var9 = class694.method5039(class779.field11374, class546.field8030, 0, arg4);
            int var10 = class694.method5039(class779.field11374, class546.field8030, arg6 - 100, arg5);
            int var11 = class694.method5039(class478.field7264, class310.field5088, arg6 ^ arg6, arg2 + arg0);
            int var12 = class694.method5039(class478.field7264, class310.field5088, arg6 ^ 0x64, arg1 - arg0);
            for (int var13 = var7; var13 < var11; var13++) {
                class545.method4051(var9, arg3, var10, class193.field3047[var13], -125);
            }
            for (int var14 = var8; var14 > var12; var14--) {
                class545.method4051(var9, arg3, var10, class193.field3047[var14], -124);
            }
            int var15 = class694.method5039(class779.field11374, class546.field8030, 0, arg0 + arg4);
            int var16 = class694.method5039(class779.field11374, class546.field8030, 0, arg5 - arg0);
            for (int var17 = var11; var17 <= var12; var17++) {
                int[] var18 = class193.field3047[var17];
                class545.method4051(var9, arg3, var15, var18, -120);
                class545.method4051(var16, arg3, var10, var18, arg6 - 227);
            }
        } catch (RuntimeException var20) {
            throw class590.method4333(var20, field11474[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
        }
    }

    @OriginalMember(owner = "client!gfa", name = "a", descriptor = "(BIIII)V")
    public static final void method5647(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        try {
            field11469++;
            for (int var5 = 0; var5 < class313.field5119; var5++) {
                Rectangle var6 = class784.field11455[var5];
                if (var6.x + var6.width > arg1 && arg1 + arg4 > var6.x && var6.y + var6.height > arg2 && arg2 + arg3 > var6.y) {
                    class370.field5996[var5] = true;
                }
            }
            if (arg0 != 87) {
                method5648(-125, -124, 17, null, 49, -67, -120, 15, 73, -55, null, -76);
            }
            class458.method3552(arg2, arg1 + arg4, arg2 + arg3, arg1, -63);
        } catch (RuntimeException var8) {
            throw class590.method4333(var8, field11474[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!gfa", name = "a", descriptor = "(IIILtda;IIIIIILjk;I)V")
    public static final void method5648(int arg0, int arg1, int arg2, class666 arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class662 arg10, int arg11) {
        try {
            class751.field11064 = arg9;
            class232.field3593 = arg1;
            class237.field3640 = arg7;
            class347.field5632 = null;
            class43.field480 = null;
            field11470++;
            class795.field11623 = arg3;
            class579.field8341 = arg8;
            if (arg6 != 0) {
                method5648(72, -65, 30, null, -50, 51, 64, -109, 98, -44, null, 40);
            }
            class671.field9528 = arg0;
            class128.field1842 = arg2;
            class721.field10567 = null;
            class22.field215 = arg4;
            class50.field596 = arg11;
            class83.field1256 = arg5;
            class612.field8808 = arg10;
            class375.method3088(16);
            class317.field5176 = true;
        } catch (RuntimeException var13) {
            throw class590.method4333(var13, field11474[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 == null ? field11474[5] : field11474[6]) + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + (arg10 == null ? field11474[5] : field11474[6]) + ',' + arg11 + ')');
        }
    }

    @OriginalMember(owner = "client!gfa", name = "<init>", descriptor = "(IIII)V")
    public class785(int arg0, int arg1, int arg2, int arg3) {
        try {
            this.field11467 = arg0;
            this.field11463 = arg2;
            this.field11471 = arg1;
            this.field11465 = arg3;
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field11474[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!gfa", name = "a", descriptor = "(II)Lgfa;")
    public final class785 method5649(int arg0, int arg1) {
        try {
            field11462++;
            if (arg0 < 61) {
                method5647((byte) 0, 47, -82, -35, 41);
            }
            return new class785(this.field11467, arg1, this.field11463, this.field11465);
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field11474[8] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!gfa", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5650(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x6F);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!gfa", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5651(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 15;
                    break;
                case 1:
                    var10005 = 83;
                    break;
                case 2:
                    var10005 = 41;
                    break;
                case 3:
                    var10005 = 119;
                    break;
                default:
                    var10005 = 111;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
