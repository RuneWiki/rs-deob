import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cw")
public class class192 {

    @OriginalMember(owner = "client!cw", name = "m", descriptor = "I")
    public int field2595 = 128;

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "I")
    public int field2597 = 128;

    @OriginalMember(owner = "client!cw", name = "d", descriptor = "I")
    public int field2587;

    @OriginalMember(owner = "client!cw", name = "k", descriptor = "I")
    public int field2589;

    @OriginalMember(owner = "client!cw", name = "j", descriptor = "I")
    public int field2590;

    @OriginalMember(owner = "client!cw", name = "g", descriptor = "I")
    public int field2593;

    @OriginalMember(owner = "client!cw", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field2600 = new String[] { method1652(method1651("Q\u0013H7\f")), method1652(method1651("\\\u0011\n\u0019")), method1652(method1651("IJH[Y")), method1652(method1651("Q\u0013HIM\\\r\u0012K\f")), method1652(method1651("Q\u0013H6\f")), method1652(method1651("Q\u0013H1\f")), method1652(method1651("Q\u0013H4\f")) };

    @OriginalMember(owner = "client!cw", name = "f", descriptor = "[Liu;")
    public static class604[] field2592 = new class604[0];

    @OriginalMember(owner = "client!cw", name = "l", descriptor = "[I")
    public static int[] field2599 = new int[] { 28, 35, 40, 44 };

    @OriginalMember(owner = "client!cw", name = "h", descriptor = "I")
    public static int field2588;

    @OriginalMember(owner = "client!cw", name = "e", descriptor = "I")
    public static int field2591;

    @OriginalMember(owner = "client!cw", name = "c", descriptor = "I")
    public static int field2594;

    @OriginalMember(owner = "client!cw", name = "i", descriptor = "I")
    public static int field2598;

    @OriginalMember(owner = "client!cw", name = "b", descriptor = "[Z")
    public static boolean[] field2596;

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "(IIB)I")
    public static final int method1647(int arg0, int arg1, byte arg2) {
        try {
            if (arg2 < 122) {
                method1650((byte) -4);
            }
            field2591++;
            int var3 = arg1 >> 31 & arg0 - 1;
            return ((arg1 >>> 31) + arg1) % arg0 + var3;
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field2600[4] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "(Lcw;B)V")
    public final void method1648(class192 arg0, byte arg1) {
        try {
            if (arg1 != -32) {
                field2599 = null;
            }
            this.field2595 = arg0.field2595;
            field2588++;
            this.field2589 = arg0.field2589;
            this.field2587 = arg0.field2587;
            this.field2590 = arg0.field2590;
            this.field2593 = arg0.field2593;
            this.field2597 = arg0.field2597;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field2600[0] + (arg0 == null ? field2600[1] : field2600[2]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "(I)Lcw;")
    public final class192 method1649(int arg0) {
        try {
            field2598++;
            if (arg0 < 58) {
                field2592 = null;
            }
            return new class192(this.field2587, this.field2595, this.field2597, this.field2590, this.field2589, this.field2593);
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field2600[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "(B)V")
    public static void method1650(byte arg0) {
        try {
            field2592 = null;
            field2599 = null;
            if (arg0 == -109) {
                field2596 = null;
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field2600[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!cw", name = "<init>", descriptor = "(I)V")
    public class192(int arg0) {
        try {
            this.field2587 = arg0;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field2600[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!cw", name = "<init>", descriptor = "(IIIIII)V")
    private class192(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        try {
            this.field2589 = arg4;
            this.field2590 = arg3;
            this.field2597 = arg2;
            this.field2593 = arg5;
            this.field2587 = arg0;
            this.field2595 = arg1;
        } catch (RuntimeException var8) {
            throw class759.method5498(var8, field2600[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!cw", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1651(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x24);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!cw", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1652(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 50;
                    break;
                case 1:
                    var10005 = 100;
                    break;
                case 2:
                    var10005 = 102;
                    break;
                case 3:
                    var10005 = 117;
                    break;
                default:
                    var10005 = 36;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
