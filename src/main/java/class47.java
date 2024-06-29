import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aj")
public class class47 extends class259 {

    @OriginalMember(owner = "client!aj", name = "H", descriptor = "[Lpd;")
    public class57[] field905;

    @OriginalMember(owner = "client!aj", name = "J", descriptor = "Lcc;")
    public static class209 field907 = class95.method669(114, ":allyreq:");

    @OriginalMember(owner = "client!aj", name = "D", descriptor = "Lcc;")
    private static class209 field902 = class95.method669(111, "wishes to trade with you)3");

    @OriginalMember(owner = "client!aj", name = "E", descriptor = "Lcc;")
    public static class209 field903 = field902;

    @OriginalMember(owner = "client!aj", name = "M", descriptor = "I")
    public static int field910 = 0;

    @OriginalMember(owner = "client!aj", name = "K", descriptor = "Lcc;")
    public static class209 field908 = class95.method669(89, "settings=");

    @OriginalMember(owner = "client!aj", name = "T", descriptor = "[Z")
    public static boolean[] field917 = new boolean[100];

    @OriginalMember(owner = "client!aj", name = "F", descriptor = "I")
    public static int field904;

    @OriginalMember(owner = "client!aj", name = "L", descriptor = "I")
    public static int field909;

    @OriginalMember(owner = "client!aj", name = "O", descriptor = "I")
    public static int field912;

    @OriginalMember(owner = "client!aj", name = "R", descriptor = "I")
    public static int field915;

    @OriginalMember(owner = "client!aj", name = "S", descriptor = "I")
    public static int field916;

    @OriginalMember(owner = "client!aj", name = "I", descriptor = "Lql;")
    public static class217 field906;

    @OriginalMember(owner = "client!aj", name = "N", descriptor = "Lsj;")
    public static class49 field911;

    @OriginalMember(owner = "client!aj", name = "P", descriptor = "[I")
    public static int[] field913;

    @OriginalMember(owner = "client!aj", name = "Q", descriptor = "[[[B")
    public static byte[][][] field914;

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "(III)V")
    public static final void method342(int arg0, int arg1, int arg2) {
        field912++;
        if (class226.field4124 != arg1) {
            class50.field987 = new int[arg1];
            for (int var3 = 0; var3 < arg1; var3++) {
                class50.field987[var3] = (var3 << 12) / arg1;
            }
            class226.field4124 = arg1;
            class68.field1293 = arg1 == 64 ? 2048 : 4096;
            class249.field4490 = arg1 - 1;
        }
        if (arg2 != 0 || class79.field1469 == arg0) {
            return;
        }
        if (class226.field4124 == arg0) {
            class129.field2479 = class50.field987;
        } else {
            class129.field2479 = new int[arg0];
            for (int var4 = 0; var4 < arg0; var4++) {
                class129.field2479[var4] = (var4 << 12) / arg0;
            }
        }
        class79.field1469 = arg0;
        class42.field859 = arg0 - 1;
    }

    @OriginalMember(owner = "client!aj", name = "h", descriptor = "(I)V")
    public static void method343(int arg0) {
        field917 = null;
        field903 = null;
        field914 = null;
        field913 = null;
        field902 = null;
        field907 = null;
        field908 = null;
        if (arg0 == 12937) {
            field911 = null;
            field906 = null;
        }
    }

    @OriginalMember(owner = "client!aj", name = "d", descriptor = "(II)Z")
    public final boolean method344(int arg0, int arg1) {
        field904++;
        return arg0 < 13 ? true : this.field905[arg1].field1168;
    }

    @OriginalMember(owner = "client!aj", name = "<init>", descriptor = "(Lsj;Lsj;IZ)V")
    public class47(class49 arg0, class49 arg1, int arg2, boolean arg3) {
        class162 var5 = new class162();
        int var6 = arg0.method360(arg2, 0);
        this.field905 = new class57[var6];
        int[] var7 = arg0.method357((byte) -119, arg2);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method353(var7[var8], 126, arg2);
            class40 var10 = null;
            int var11 = (var9[0] & 0xFF) << 8 | var9[1] & 0xFF;
            for (class40 var12 = (class40) var5.method1119(20896); var12 != null; var12 = (class40) var5.method1120(73)) {
                if (var12.field676 == var11) {
                    var10 = var12;
                    break;
                }
            }
            if (var10 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method361(119, var11, 0);
                } else {
                    var13 = arg1.method361(34, 0, var11);
                }
                var10 = new class40(var11, var13);
                var5.method1123(var10, (byte) -128);
            }
            this.field905[var7[var8]] = new class57(var9, var10);
        }
    }

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "(IIIIII)V")
    public static final void method345(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field916++;
        int var6 = arg0;
        int var7 = 0;
        int var8 = arg3 * arg3;
        int var9 = arg0 * arg0;
        int var10 = var8 << 1;
        int var11 = arg0 << 1;
        int var12 = var9 - ((arg1 + var11) * var10);
        int var13 = var8 << 2;
        int var14 = var9 << 2;
        int var15 = var9 << 1;
        int var16 = ((arg0 << 1) - 3) * var10;
        int var17 = (var7 + 1) * var14;
        int var18 = (1 - var11) * var8 + var15;
        int var19 = ((var7 << 1) + 3) * var15;
        int var20 = (arg0 - 1) * var13;
        if (class102.field1957 <= arg4 && arg4 <= class155.field2847) {
            int var21 = class257.method1787(class262.field4723, arg2 + arg3, 28, class230.field4184);
            int var22 = class257.method1787(class262.field4723, arg2 - arg3, 28, class230.field4184);
            class176.method1215(var22, arg5, class252.field4543[arg4], var21, (byte) -30);
        }
        while (var6 > 0) {
            var6--;
            if (var18 < 0) {
                while (var18 < 0) {
                    var12 += var17;
                    var17 += var14;
                    var7++;
                    var18 += var19;
                    var19 += var14;
                }
            }
            if (var12 < 0) {
                var18 += var19;
                var12 += var17;
                var7++;
                var17 += var14;
                var19 += var14;
            }
            var12 += -var16;
            int var23 = arg4 + var6;
            int var24 = arg4 - var6;
            if (class102.field1957 <= var23 && class155.field2847 >= var24) {
                int var25 = class257.method1787(class262.field4723, arg2 + var7, 28, class230.field4184);
                int var26 = class257.method1787(class262.field4723, arg2 - var7, 28, class230.field4184);
                if (class102.field1957 <= var24) {
                    class176.method1215(var26, arg5, class252.field4543[var24], var25, (byte) 118);
                }
                if (class155.field2847 >= var23) {
                    class176.method1215(var26, arg5, class252.field4543[var23], var25, (byte) -82);
                }
            }
            var16 -= var13;
            var18 += -var20;
            var20 -= var13;
        }
    }
}
