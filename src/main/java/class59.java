import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fh")
public class class59 {

    @OriginalMember(owner = "client!fh", name = "i", descriptor = "[B")
    public byte[] field1188 = new byte[18002];

    @OriginalMember(owner = "client!fh", name = "f", descriptor = "[Z")
    public boolean[] field1185 = new boolean[16];

    @OriginalMember(owner = "client!fh", name = "m", descriptor = "[Z")
    public boolean[] field1192 = new boolean[256];

    @OriginalMember(owner = "client!fh", name = "d", descriptor = "[B")
    public byte[] field1183 = new byte[4096];

    @OriginalMember(owner = "client!fh", name = "x", descriptor = "[I")
    public int[] field1203 = new int[257];

    @OriginalMember(owner = "client!fh", name = "h", descriptor = "[[I")
    public int[][] field1187 = new int[6][258];

    @OriginalMember(owner = "client!fh", name = "r", descriptor = "[B")
    public byte[] field1197 = new byte[256];

    @OriginalMember(owner = "client!fh", name = "A", descriptor = "I")
    public int field1206 = 0;

    @OriginalMember(owner = "client!fh", name = "C", descriptor = "[[B")
    public byte[][] field1208 = new byte[6][258];

    @OriginalMember(owner = "client!fh", name = "G", descriptor = "[[I")
    public int[][] field1212 = new int[6][258];

    @OriginalMember(owner = "client!fh", name = "t", descriptor = "[[I")
    public int[][] field1199 = new int[6][258];

    @OriginalMember(owner = "client!fh", name = "F", descriptor = "[B")
    public byte[] field1211 = new byte[18002];

    @OriginalMember(owner = "client!fh", name = "L", descriptor = "I")
    public int field1217 = 0;

    @OriginalMember(owner = "client!fh", name = "g", descriptor = "[I")
    public int[] field1186 = new int[16];

    @OriginalMember(owner = "client!fh", name = "O", descriptor = "[I")
    public int[] field1220 = new int[6];

    @OriginalMember(owner = "client!fh", name = "J", descriptor = "[I")
    public int[] field1215 = new int[256];

    @OriginalMember(owner = "client!fh", name = "e", descriptor = "Lrf;")
    private static class163 field1184 = class53.method392(79, "Your ignore list is full)3 Max of 100 users)3");

    @OriginalMember(owner = "client!fh", name = "s", descriptor = "Lrf;")
    public static class163 field1198 = class53.method392(-127, ":trade:");

    @OriginalMember(owner = "client!fh", name = "l", descriptor = "[I")
    public static int[] field1191 = new int[5];

    @OriginalMember(owner = "client!fh", name = "c", descriptor = "I")
    public static int field1182 = 1;

    @OriginalMember(owner = "client!fh", name = "u", descriptor = "Lrf;")
    public static class163 field1200 = class53.method392(54, "compass");

    @OriginalMember(owner = "client!fh", name = "N", descriptor = "Lrf;")
    public static class163 field1219 = field1184;

    @OriginalMember(owner = "client!fh", name = "j", descriptor = "B")
    public byte field1189;

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "I")
    public int field1180;

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "I")
    public int field1181;

    @OriginalMember(owner = "client!fh", name = "k", descriptor = "I")
    public static int field1190;

    @OriginalMember(owner = "client!fh", name = "n", descriptor = "I")
    public int field1193;

    @OriginalMember(owner = "client!fh", name = "o", descriptor = "I")
    public int field1194;

    @OriginalMember(owner = "client!fh", name = "p", descriptor = "I")
    public int field1195;

    @OriginalMember(owner = "client!fh", name = "v", descriptor = "I")
    public int field1201;

    @OriginalMember(owner = "client!fh", name = "w", descriptor = "I")
    public int field1202;

    @OriginalMember(owner = "client!fh", name = "y", descriptor = "I")
    public int field1204;

    @OriginalMember(owner = "client!fh", name = "z", descriptor = "I")
    public int field1205;

    @OriginalMember(owner = "client!fh", name = "B", descriptor = "I")
    public static int field1207;

    @OriginalMember(owner = "client!fh", name = "E", descriptor = "I")
    public int field1210;

    @OriginalMember(owner = "client!fh", name = "H", descriptor = "I")
    public int field1213;

    @OriginalMember(owner = "client!fh", name = "I", descriptor = "I")
    public int field1214;

    @OriginalMember(owner = "client!fh", name = "K", descriptor = "I")
    public int field1216;

    @OriginalMember(owner = "client!fh", name = "M", descriptor = "I")
    public static int field1218;

    @OriginalMember(owner = "client!fh", name = "q", descriptor = "[B")
    public byte[] field1196;

    @OriginalMember(owner = "client!fh", name = "D", descriptor = "[B")
    public byte[] field1209;

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(B)V")
    public static void method423(byte arg0) {
        field1184 = null;
        field1200 = null;
        field1198 = null;
        field1219 = null;
        field1191 = null;
        int var1 = -72 % ((arg0 + 41) / 47);
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(II)V")
    public static final void method424(int arg0, int arg1) {
        field1190++;
        if (arg1 == -1 && !class107.field2234) {
            class48.method297((byte) 69);
        } else if (arg1 != -1 && (class103.field2165 != arg1 || !class197.method1310(-107)) && class144.field2961 != 0 && !class107.field2234) {
            class37.method236(false, 0, class134.field2777, false, class144.field2961, arg1, 2);
        }
        if (arg0 <= 42) {
            method423((byte) 121);
        }
        class103.field2165 = arg1;
    }

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "(B)V")
    public static final void method425(byte arg0) {
        field1218++;
        if (arg0 == -120 && class131.field2735 != null) {
            class141 var1 = class131.field2735;
            synchronized (class131.field2735) {
                class131.field2735 = null;
            }
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(Z)V")
    public static final void method426(boolean arg0) {
        field1207++;
        if (!class26.field486) {
            return;
        }
        class58.field1177 = null;
        class3.field34 = null;
        class190.field3775 = null;
        class13.field245 = null;
        class58.field1172 = null;
        class108.field2236 = null;
        class6.field121 = null;
        class114.field2414 = null;
        class25.field449 = null;
        class38.field779 = null;
        class168.field3432 = null;
        class206.field4025 = null;
        class107.field2232 = null;
        class82.field1653 = null;
        class61.field1247 = null;
        class48.field935 = null;
        class71.field1500 = null;
        class55.field1117 = null;
        class148.field3056 = null;
        class95.field2035 = null;
        class125.field2607 = null;
        class43.field870 = null;
        class9.method72(2, -1);
        class96.method662(true, 127);
        class26.field486 = arg0;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(Lei;IIIII)V")
    public static final void method427(class50 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var6 = true;
        int var7 = arg2;
        int var8 = arg2 + arg4;
        int var9 = arg3 - 1;
        int var10 = arg3 + arg5;
        for (int var11 = arg1; var11 <= arg1 + 1; var11++) {
            if (class41.field847 != var11) {
                for (int var12 = var7; var12 <= var8; var12++) {
                    if (var12 >= 0 && var12 < class80.field1620) {
                        for (int var13 = var9; var13 <= var10; var13++) {
                            if (var13 >= 0 && var13 < class92.field2007 && (!var6 || var12 >= var8 || var13 >= var10 || var13 < arg3 && arg2 != var12)) {
                                class111 var14 = class97.field2054[var11][var12][var13];
                                if (var14 != null) {
                                    int var15 = (class99.field2086[var11][var12 + 1][var13] + class99.field2086[var11][var12][var13] + class99.field2086[var11][var12][var13 + 1] + class99.field2086[var11][var12 + 1][var13 + 1]) / 4 - (class99.field2086[arg1][arg2 + 1][arg3] + class99.field2086[arg1][arg2][arg3] + class99.field2086[arg1][arg2][arg3 + 1] + class99.field2086[arg1][arg2 + 1][arg3 + 1]) / 4;
                                    class72 var16 = var14.field2345;
                                    if (var16 != null) {
                                        if (var16.field1502 instanceof class50) {
                                            class50 var17 = (class50) var16.field1502;
                                            class50.method315(arg0, var17, (var12 - arg2) * 128 + (1 - arg4) * 64, var15, (var13 - arg3) * 128 + (1 - arg5) * 64, var6);
                                        }
                                        if (var16.field1504 instanceof class50) {
                                            class50 var18 = (class50) var16.field1504;
                                            class50.method315(arg0, var18, (var12 - arg2) * 128 + (1 - arg4) * 64, var15, (var13 - arg3) * 128 + (1 - arg5) * 64, var6);
                                        }
                                    }
                                    for (int var19 = 0; var19 < var14.field2359; var19++) {
                                        class121 var20 = var14.field2344[var19];
                                        if (var20 != null && var20.field2546 instanceof class50) {
                                            class50 var21 = (class50) var20.field2546;
                                            int var22 = var20.field2548 + 1 - var20.field2544;
                                            int var23 = var20.field2535 + 1 - var20.field2542;
                                            class50.method315(arg0, var21, (var20.field2544 - arg2) * 128 + (var22 - arg4) * 64, var15, (var20.field2542 - arg3) * 128 + (var23 - arg5) * 64, var6);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                var7--;
                var6 = false;
            }
        }
    }
}
