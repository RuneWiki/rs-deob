import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!h")
public class class49 implements class7 {

    @OriginalMember(owner = "client!h", name = "j", descriptor = "Lvf;")
    private class152 field1128 = new class152();

    @OriginalMember(owner = "client!h", name = "y", descriptor = "D")
    private double field1143 = 1.0D;

    @OriginalMember(owner = "client!h", name = "B", descriptor = "I")
    private int field1146 = 0;

    @OriginalMember(owner = "client!h", name = "A", descriptor = "I")
    private int field1145 = 128;

    @OriginalMember(owner = "client!h", name = "C", descriptor = "Lla;")
    private class77 field1147;

    @OriginalMember(owner = "client!h", name = "z", descriptor = "I")
    private int field1144;

    @OriginalMember(owner = "client!h", name = "x", descriptor = "[Lpb;")
    private class106[] field1142;

    @OriginalMember(owner = "client!h", name = "f", descriptor = "Lv;")
    public static class146 field1124 = class159.method1226((byte) -37, "<col=ff3000>");

    @OriginalMember(owner = "client!h", name = "m", descriptor = "[I")
    public static int[] field1131 = new int[100];

    @OriginalMember(owner = "client!h", name = "i", descriptor = "[I")
    public static int[] field1127 = new int[128];

    @OriginalMember(owner = "client!h", name = "l", descriptor = "Lv;")
    public static class146 field1130 = class159.method1226((byte) -37, "Neuer Benutzer");

    @OriginalMember(owner = "client!h", name = "s", descriptor = "Lv;")
    public static class146 field1137 = class159.method1226((byte) -37, "Willkommen auf RuneScape");

    @OriginalMember(owner = "client!h", name = "t", descriptor = "Lv;")
    private static class146 field1138 = class159.method1226((byte) -37, "Unexpected server response");

    @OriginalMember(owner = "client!h", name = "p", descriptor = "Lv;")
    public static class146 field1134 = field1138;

    @OriginalMember(owner = "client!h", name = "u", descriptor = "I")
    public static int field1139 = -1;

    @OriginalMember(owner = "client!h", name = "q", descriptor = "I")
    public static int field1135 = -1;

    @OriginalMember(owner = "client!h", name = "a", descriptor = "I")
    public static int field1119;

    @OriginalMember(owner = "client!h", name = "b", descriptor = "I")
    public static int field1120;

    @OriginalMember(owner = "client!h", name = "d", descriptor = "I")
    public static int field1122;

    @OriginalMember(owner = "client!h", name = "e", descriptor = "I")
    public static int field1123;

    @OriginalMember(owner = "client!h", name = "h", descriptor = "I")
    public static int field1126;

    @OriginalMember(owner = "client!h", name = "k", descriptor = "I")
    public static int field1129;

    @OriginalMember(owner = "client!h", name = "n", descriptor = "I")
    public static int field1132;

    @OriginalMember(owner = "client!h", name = "o", descriptor = "I")
    public static int field1133;

    @OriginalMember(owner = "client!h", name = "r", descriptor = "I")
    public static int field1136;

    @OriginalMember(owner = "client!h", name = "w", descriptor = "I")
    public static int field1141;

    @OriginalMember(owner = "client!h", name = "v", descriptor = "Lla;")
    public static class77 field1140;

    @OriginalMember(owner = "client!h", name = "c", descriptor = "[I")
    public static int[] field1121;

    @OriginalMember(owner = "client!h", name = "g", descriptor = "[[B")
    public static byte[][] field1125;

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(II)Z")
    public final boolean method54(int arg0, int arg1) {
        if (arg1 < 9) {
            this.field1144 = 33;
        }
        field1123++;
        return this.field1142[arg0].field2544;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(I)V")
    public static void method338(int arg0) {
        field1130 = null;
        field1131 = null;
        field1121 = null;
        field1140 = null;
        field1127 = null;
        field1125 = null;
        field1124 = null;
        if (arg0 != -3832) {
            field1140 = null;
        }
        field1137 = null;
        field1138 = null;
        field1134 = null;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(ID)V")
    public final void method339(int arg0, double arg1) {
        this.field1143 = arg1;
        if (arg0 != -1) {
            this.method54(81, 5);
        }
        this.method342((byte) -57);
        field1129++;
    }

    @OriginalMember(owner = "client!h", name = "c", descriptor = "(II)V")
    public final void method340(int arg0, int arg1) {
        field1119++;
        for (int var3 = arg1; var3 < this.field1142.length; var3++) {
            class106 var4 = this.field1142[var3];
            if (var4 != null && var4.field2537 != 0 && var4.field2541) {
                var4.method860(arg0);
                var4.field2541 = false;
            }
        }
    }

    @OriginalMember(owner = "client!h", name = "d", descriptor = "(II)Lv;")
    public static final class146 method341(int arg0, int arg1) {
        if (arg0 >= -1) {
            method341(-14, 3);
        }
        field1132++;
        if (arg1 < 100000) {
            return class71.method509(new class146[] { class2.field44, class75.method564(false, arg1), class35.field761 }, (byte) -108);
        } else if (arg1 < 10000000) {
            return class71.method509(new class146[] { class125.field2912, class75.method564(false, arg1 / 1000), class122.field2831, class35.field761 }, (byte) -114);
        } else {
            return class71.method509(new class146[] { class52.field1191, class75.method564(false, arg1 / 1000000), class122.field2826, class35.field761 }, (byte) -111);
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(B)V")
    public final void method342(byte arg0) {
        field1122++;
        for (int var2 = 0; var2 < this.field1142.length; var2++) {
            if (this.field1142[var2] != null) {
                this.field1142[var2].method858();
            }
        }
        this.field1128 = new class152();
        if (arg0 == -57) {
            this.field1146 = this.field1144;
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(BI)[I")
    public final int[] method56(byte arg0, int arg1) {
        field1141++;
        int var3 = -4 % ((arg0 - 32) / 57);
        class106 var4 = this.field1142[arg1];
        if (var4 != null) {
            if (var4.field2538 != null) {
                this.field1128.method1137(2, var4);
                var4.field2541 = true;
                return var4.field2538;
            }
            boolean var5 = var4.method859(this.field1143, this.field1145, this.field1147);
            if (var5) {
                if (this.field1146 == 0) {
                    class106 var6 = (class106) this.field1128.method1143(-2271);
                    var6.method858();
                } else {
                    this.field1146--;
                }
                this.field1128.method1137(2, var4);
                var4.field2541 = true;
                return var4.field2538;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IB)Z")
    public final boolean method57(int arg0, byte arg1) {
        if (arg1 != -106) {
            field1135 = 82;
        }
        field1136++;
        return this.field1145 == 64;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IIIBI)V")
    public static final void method343(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        field1120++;
        int var5 = -112 / ((arg3 + 72) / 45);
        for (class5 var6 = (class5) class68.field1548.method1138(25852); var6 != null; var6 = (class5) class68.field1548.method1142(1)) {
            if (var6.field117 != -1 || var6.field121 != null) {
                int var7 = 0;
                if (var6.field99 < arg2) {
                    var7 += arg2 - var6.field99;
                } else if (arg2 < var6.field112) {
                    var7 += var6.field112 - arg2;
                }
                if (var6.field101 < arg4) {
                    var7 += arg4 - var6.field101;
                } else if (arg4 < var6.field120) {
                    var7 += var6.field120 - arg4;
                }
                if (var6.field108 < var7 - 64 || class44.field1001 == 0 || var6.field98 != arg0) {
                    if (var6.field123 != null) {
                        class18.field286.method999(var6.field123);
                        var6.field123 = null;
                    }
                    if (var6.field125 != null) {
                        class18.field286.method999(var6.field125);
                        var6.field125 = null;
                    }
                } else {
                    var7 -= 64;
                    if (var7 < 0) {
                        var7 = 0;
                    }
                    int var8 = (var6.field108 - var7) * class44.field1001 / var6.field108;
                    if (var6.field123 != null) {
                        var6.field123.method668(var8);
                    } else if (var6.field117 >= 0) {
                        class128 var9 = class128.method945(class15.field251, var6.field117, 0);
                        if (var9 != null) {
                            class109 var10 = var9.method946().method866(class57.field1282);
                            class84 var11 = class84.method662(var10, 100, var8);
                            var11.method644(-1);
                            class18.field286.method997(var11);
                            var6.field123 = var11;
                        }
                    }
                    if (var6.field125 != null) {
                        var6.field125.method668(var8);
                        if (!var6.field125.method218(121)) {
                            var6.field125 = null;
                        }
                    } else if (var6.field121 != null && (var6.field102 -= arg1) <= 0) {
                        int var12 = (int) ((double) var6.field121.length * Math.random());
                        class128 var13 = class128.method945(class15.field251, var6.field121[var12], 0);
                        if (var13 != null) {
                            class109 var14 = var13.method946().method866(class57.field1282);
                            class84 var15 = class84.method662(var14, 100, var8);
                            var15.method644(0);
                            class18.field286.method997(var15);
                            var6.field125 = var15;
                            var6.field102 = var6.field95 + (int) (Math.random() * (double) (var6.field127 - var6.field95));
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!h", name = "b", descriptor = "(II)I")
    public final int method55(int arg0, int arg1) {
        if (arg0 >= -70) {
            this.method339(74, 1.0254938308683237D);
        }
        field1126++;
        return this.field1142[arg1] == null ? 0 : this.field1142[arg1].field2546;
    }

    @OriginalMember(owner = "client!h", name = "<init>", descriptor = "(Lla;Lla;IDI)V")
    public class49(class77 arg0, class77 arg1, int arg2, double arg3, int arg4) {
        this.field1147 = arg1;
        this.field1143 = arg3;
        this.field1144 = arg2;
        this.field1146 = this.field1144;
        this.field1145 = arg4;
        int[] var7 = arg0.method577(0, 72);
        int var8 = var7.length;
        this.field1142 = new class106[arg0.method578(0, 0)];
        for (int var9 = 0; var9 < var8; var9++) {
            class95 var10 = new class95(arg0.method585(0, 116, var7[var9]));
            this.field1142[var7[var9]] = new class106(var10);
        }
    }
}
