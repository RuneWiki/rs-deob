import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public class class76 extends class264 {

    @OriginalMember(owner = "client!oc", name = "fb", descriptor = "I")
    private int field1182 = 0;

    @OriginalMember(owner = "client!oc", name = "ib", descriptor = "I")
    private int field1185 = 20;

    @OriginalMember(owner = "client!oc", name = "jb", descriptor = "I")
    private int field1186 = 1365;

    @OriginalMember(owner = "client!oc", name = "pb", descriptor = "I")
    private int field1192 = 0;

    @OriginalMember(owner = "client!oc", name = "mb", descriptor = "I")
    public static int field1189 = 0;

    @OriginalMember(owner = "client!oc", name = "ob", descriptor = "I")
    public static int field1191 = 1;

    @OriginalMember(owner = "client!oc", name = "nb", descriptor = "I")
    public static int field1190 = -1;

    @OriginalMember(owner = "client!oc", name = "rb", descriptor = "Lma;")
    public static class5 field1194 = class12.method119("Schrifts-=tze geladen)3", (byte) 69);

    @OriginalMember(owner = "client!oc", name = "lb", descriptor = "Lma;")
    public static class5 field1188 = class12.method119("sl_stars", (byte) 55);

    @OriginalMember(owner = "client!oc", name = "sb", descriptor = "Lma;")
    private static class5 field1195 = class12.method119("Loading interfaces )2 ", (byte) 79);

    @OriginalMember(owner = "client!oc", name = "wb", descriptor = "Lma;")
    public static class5 field1199 = class12.method119(" <col=ffffff>", (byte) 73);

    @OriginalMember(owner = "client!oc", name = "vb", descriptor = "Lma;")
    public static class5 field1198 = field1195;

    @OriginalMember(owner = "client!oc", name = "gb", descriptor = "I")
    public static int field1183;

    @OriginalMember(owner = "client!oc", name = "kb", descriptor = "I")
    public static int field1187;

    @OriginalMember(owner = "client!oc", name = "qb", descriptor = "I")
    public static int field1193;

    @OriginalMember(owner = "client!oc", name = "tb", descriptor = "I")
    public static int field1196;

    @OriginalMember(owner = "client!oc", name = "ub", descriptor = "I")
    public static int field1197;

    @OriginalMember(owner = "client!oc", name = "hb", descriptor = "[Lla;")
    public static class178[] field1184;

    @OriginalMember(owner = "client!oc", name = "<init>", descriptor = "()V", line = 279)
    public class76() {
        super(0, true);
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(IILii;)V", line = 11)
    public final void method4(int arg0, int arg1, class221 arg2) {
        if (arg1 >= -27) {
            return;
        }
        if (arg0 == 0) {
            this.field1186 = arg2.method1524((byte) 52);
        } else if (arg0 == 1) {
            this.field1185 = arg2.method1524((byte) 109);
        } else if (arg0 == 2) {
            this.field1192 = arg2.method1524((byte) 62);
        } else if (arg0 == 3) {
            this.field1182 = arg2.method1524((byte) 46);
        }
        field1196++;
    }

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "(II)[I", line = 66)
    public final int[] method5(int arg0, int arg1) {
        if (arg0 >= -58) {
            field1190 = 24;
        }
        field1183++;
        int[] var3 = this.field4501.method1176(arg1, 125);
        if (this.field4501.field2741) {
            for (int var4 = 0; var4 < class226.field3716; var4++) {
                int var5 = (class251.field4159[var4] << 12) / this.field1186 + this.field1192;
                int var6 = (class116.field1726[arg1] << 12) / this.field1186 + this.field1182;
                int var7 = var5;
                int var8 = var6;
                int var9 = var5 * var5 >> 12;
                int var10 = var6 * var6 >> 12;
                int var11 = var6;
                int var12 = 0;
                int var13 = var5;
                while (var9 + var10 < 16384 && var12 < this.field1185) {
                    var11 = (var11 * var13 >> 12) * 2 + var8;
                    var13 = var7 + var9 - var10;
                    var12++;
                    var10 = var11 * var11 >> 12;
                    var9 = var13 * var13 >> 12;
                }
                var3[var4] = (this.field1185 - 1) > var12 ? (var12 << 12) / this.field1185 : 0;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!oc", name = "e", descriptor = "(III)Lwf;", line = 126)
    public static final class51 method530(int arg0, int arg1, int arg2) {
        class198 var3 = class43.field646[arg0][arg1][arg2];
        return var3 == null || var3.field3158 == null ? null : var3.field3158;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(BLni;ILni;I)Lfl;", line = 141)
    public static final class299 method531(byte arg0, class202 arg1, int arg2, class202 arg3, int arg4) {
        field1197++;
        int var5 = -1 / ((-arg0 - 3) / 45);
        return class180.method1171(arg4, arg2, arg3, (byte) -128) ? class14.method132((byte) 121, arg1.method1342(-116, arg4, arg2)) : null;
    }

    @OriginalMember(owner = "client!oc", name = "h", descriptor = "(I)V", line = 155)
    public static void method532(int arg0) {
        field1194 = null;
        field1198 = null;
        field1195 = null;
        field1199 = null;
        int var1 = 106 % ((arg0 - 42) / 53);
        field1188 = null;
        field1184 = null;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(IIZI)I", line = 169)
    public static final int method533(int arg0, int arg1, boolean arg2, int arg3) {
        field1187++;
        if (!arg2) {
            method532(-97);
        }
        return arg0 <= arg1 ? (arg3 < arg1 ? arg3 : arg1) : arg0;
    }

    @OriginalMember(owner = "client!oc", name = "f", descriptor = "(III)V", line = 192)
    public static final void method534(int arg0, int arg1, int arg2) {
        if (arg0 != 1820) {
            return;
        }
        for (int var3 = 0; var3 < class301.field5069; var3++) {
            class16 var4 = class236.method1672(var3, 29813);
            if (var4 != null) {
                int var5 = var4.field283;
                if (var5 >= 0 && !class229.field3802.method1092(-2, var5)) {
                    var5 = -1;
                }
                int var9;
                if (var4.field298 >= 0) {
                    int var6 = var4.field298;
                    int var7 = (var6 & 0x7F) + arg1;
                    if (var7 < 0) {
                        var7 = 0;
                    } else if (var7 > 127) {
                        var7 = 127;
                    }
                    int var8 = (var6 & 0x380) + (var6 + arg2 & 0xFC00) + var7;
                    var9 = class229.field3791[class297.method2001(false, var8, 96)];
                } else if (var5 >= 0) {
                    var9 = class229.field3791[class297.method2001(false, class229.field3802.method1088(var5, (byte) -69), 96)];
                } else if (var4.field295 == -1) {
                    var9 = -1;
                } else {
                    int var10 = var4.field295;
                    int var11 = (var10 & 0x7F) + arg1;
                    if (var11 < 0) {
                        var11 = 0;
                    } else if (var11 > 127) {
                        var11 = 127;
                    }
                    int var12 = (arg2 + var10 & 0xFC00) + (var10 & 0x380) + var11;
                    var9 = class229.field3791[class297.method2001(false, var12, 96)];
                }
                class43.field650[var3 + 1] = var9;
            }
        }
        field1193++;
    }
}
