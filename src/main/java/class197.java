import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hn")
public class class197 extends class27 {

    @OriginalMember(owner = "client!hn", name = "T", descriptor = "I")
    public static int field2858 = 0;

    @OriginalMember(owner = "client!hn", name = "W", descriptor = "Ljava/lang/String;")
    public static String field2861 = " is already on your friend list.";

    @OriginalMember(owner = "client!hn", name = "K", descriptor = "[B")
    public static byte[] field2849 = new byte[32896];

    @OriginalMember(owner = "client!hn", name = "Y", descriptor = "Z")
    public static boolean field2863;

    @OriginalMember(owner = "client!hn", name = "L", descriptor = "I")
    public static int field2850;

    @OriginalMember(owner = "client!hn", name = "M", descriptor = "I")
    public static int field2851;

    @OriginalMember(owner = "client!hn", name = "N", descriptor = "I")
    public static int field2852;

    @OriginalMember(owner = "client!hn", name = "O", descriptor = "I")
    public static int field2853;

    @OriginalMember(owner = "client!hn", name = "R", descriptor = "I")
    public static int field2856;

    @OriginalMember(owner = "client!hn", name = "S", descriptor = "I")
    public static int field2857;

    @OriginalMember(owner = "client!hn", name = "U", descriptor = "I")
    public static int field2859;

    @OriginalMember(owner = "client!hn", name = "V", descriptor = "I")
    public static int field2860;

    @OriginalMember(owner = "client!hn", name = "X", descriptor = "I")
    public static int field2862;

    @OriginalMember(owner = "client!hn", name = "Z", descriptor = "I")
    public static int field2864;

    @OriginalMember(owner = "client!hn", name = "Q", descriptor = "Lqf;")
    public static class359 field2855;

    @OriginalMember(owner = "client!hn", name = "P", descriptor = "Lph;")
    public static class361 field2854;

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(II)[[I", line = 5)
    public final int[][] method19(int arg0, int arg1) {
        field2851++;
        int[][] var3 = this.field379.method668(arg1, 0);
        if (arg0 != -28941) {
            field2849 = (byte[]) null;
        }
        if (this.field379.field1171) {
            int[][] var4 = this.method168(0, arg0 ^ 0xFFFF8E9B, arg1);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var4[2];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class209.field3053; var11++) {
                var7[var11] = 4096 - var5[var11];
                var8[var11] = 4096 - var6[var11];
                var10[var11] = 4096 - var9[var11];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(Lsb;Z)Lal;", line = 54)
    public static final class88 method1415(class190 arg0, boolean arg1) {
        if (arg1) {
            field2852++;
            return new class88(arg0.method1347((byte) 61), arg0.method1347((byte) 61), arg0.method1347((byte) 61), arg0.method1347((byte) 61), arg0.method1312(69), arg0.method1312(101), arg0.method1319(255));
        } else {
            return (class88) null;
        }
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(IB)[I", line = 66)
    public final int[] method18(int arg0, byte arg1) {
        field2853++;
        if (arg1 != -62) {
            field2861 = (String) null;
        }
        int[] var3 = this.field375.method2087(-93, arg0);
        if (this.field375.field4382) {
            int[] var4 = this.method164(arg0, 72, 0);
            for (int var5 = 0; var5 < class209.field3053; var5++) {
                var3[var5] = 4096 - var4[var5];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!hn", name = "e", descriptor = "(B)[Lln;", line = 100)
    public static final class118[] method1416(byte arg0) {
        field2850++;
        if (arg0 >= -28) {
            field2849 = (byte[]) null;
        }
        class118[] var1 = new class118[class220.field3285];
        for (int var2 = 0; var2 < class220.field3285; var2++) {
            int var3 = class59.field871[var2] * class225.field3397[var2];
            byte[] var4 = class225.field3385[var2];
            int[] var5 = new int[var3];
            for (int var6 = 0; var6 < var3; var6++) {
                var5[var6] = class206.field3015[class287.method2076(255, var4[var6])];
            }
            var1[var2] = new class118(class255.field3816, class22.field336, class199.field2896[var2], class160.field2319[var2], class59.field871[var2], class225.field3397[var2], var5);
        }
        class321.method2235(-2182);
        return var1;
    }

    @OriginalMember(owner = "client!hn", name = "<init>", descriptor = "()V", line = 136)
    public class197() {
        super(1, false);
    }

    @OriginalMember(owner = "client!hn", name = "b", descriptor = "(II)Ltg;", line = 141)
    public static final class175 method1417(int arg0, int arg1) {
        field2856++;
        class175 var2 = (class175) class288.field4362.method551(arg1 + 16267, (long) arg0);
        if (arg1 != -16267) {
            field2854 = (class361) null;
        }
        if (var2 != null) {
            return var2;
        }
        byte[] var3;
        if (arg0 >= 32768) {
            var3 = class272.field4124.method2520(0, arg0 & 0x7FFF, (byte) -25);
        } else {
            var3 = class343.field5316.method2520(0, arg0, (byte) -25);
        }
        class175 var4 = new class175();
        if (var3 != null) {
            var4.method1233(new class190(var3), arg1 + 16266);
        }
        if (arg0 >= 32768) {
            var4.method1223((byte) -89);
        }
        class288.field4362.method547((long) arg0, -1, var4);
        return var4;
    }

    @OriginalMember(owner = "client!hn", name = "g", descriptor = "(I)V", line = 177)
    public static final void method1418(int arg0) {
        class107.field1533.method1915(true, 64);
        field2857++;
        class107.field1533.method1355((byte) -108, 0);
        if (arg0 < -15) {
            field2862++;
        }
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(ILsb;I)V", line = 191)
    public final void method23(int arg0, class190 arg1, int arg2) {
        field2859++;
        if (arg2 == 0) {
            this.field376 = arg1.method1319(255) == 1;
        }
        if (arg0 != -5836) {
            method1419(-71, 4, -82, 71, 74, 4, 47, 116);
        }
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(IIIIIIII)Z", line = 206)
    public static final boolean method1419(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
            return false;
        } else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
            return false;
        } else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
            return false;
        } else if (arg0 > arg5 && arg0 > arg6 && arg0 > arg7) {
            return false;
        } else {
            int var8 = (arg1 - arg2) * (arg6 - arg5) - (arg0 - arg5) * (arg3 - arg2);
            int var9 = (arg1 - arg4) * (arg5 - arg7) - (arg0 - arg7) * (arg2 - arg4);
            int var10 = (arg1 - arg3) * (arg7 - arg6) - (arg0 - arg6) * (arg4 - arg3);
            return var8 * var10 > 0 && var9 * var10 > 0;
        }
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 256; var1++) {
            for (int var2 = 0; var2 <= var1; var2++) {
                field2849[var0++] = (byte) ((int) (255.0D / Math.sqrt((double) ((float) (var2 * var2 + var1 * var1 + 65535) / 65535.0F))));
            }
        }
        field2863 = true;
    }

    @OriginalMember(owner = "client!hn", name = "h", descriptor = "(I)V", line = 240)
    public static void method1420(int arg0) {
        field2855 = null;
        field2854 = null;
        field2861 = null;
        field2849 = null;
        if (arg0 != 0) {
            field2855 = (class359) null;
        }
    }
}
