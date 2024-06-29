import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!f")
public class class55 extends class186 {

    @OriginalMember(owner = "client!f", name = "G", descriptor = "I")
    private int field1222 = -32768;

    @OriginalMember(owner = "client!f", name = "s", descriptor = "I")
    private int field1208;

    @OriginalMember(owner = "client!f", name = "E", descriptor = "I")
    private int field1220;

    @OriginalMember(owner = "client!f", name = "J", descriptor = "I")
    private int field1224;

    @OriginalMember(owner = "client!f", name = "z", descriptor = "I")
    private int field1215;

    @OriginalMember(owner = "client!f", name = "x", descriptor = "I")
    private int field1213;

    @OriginalMember(owner = "client!f", name = "F", descriptor = "I")
    private int field1221;

    @OriginalMember(owner = "client!f", name = "B", descriptor = "Lki;")
    private class117 field1217;

    @OriginalMember(owner = "client!f", name = "t", descriptor = "I")
    private int field1209;

    @OriginalMember(owner = "client!f", name = "I", descriptor = "I")
    private int field1223;

    @OriginalMember(owner = "client!f", name = "v", descriptor = "I")
    public static int field1211 = 2301979;

    @OriginalMember(owner = "client!f", name = "r", descriptor = "I")
    public static int field1207 = 0;

    @OriginalMember(owner = "client!f", name = "D", descriptor = "I")
    public static int field1219 = 0;

    @OriginalMember(owner = "client!f", name = "p", descriptor = "Lqe;")
    public static class179 field1205 = class206.method1380(")1", (byte) 17);

    @OriginalMember(owner = "client!f", name = "M", descriptor = "Lqe;")
    public static class179 field1227 = class206.method1380("blinken2:", (byte) 3);

    @OriginalMember(owner = "client!f", name = "N", descriptor = "Lqe;")
    public static class179 field1228 = class206.method1380("-5berpr-Ufen Sie Ihr Mitteilungsfach)3", (byte) -128);

    @OriginalMember(owner = "client!f", name = "K", descriptor = "I")
    public static int field1225 = 0;

    @OriginalMember(owner = "client!f", name = "L", descriptor = "I")
    public static int field1226 = -1;

    @OriginalMember(owner = "client!f", name = "C", descriptor = "D")
    public static double field1218;

    @OriginalMember(owner = "client!f", name = "o", descriptor = "I")
    public static int field1204;

    @OriginalMember(owner = "client!f", name = "q", descriptor = "I")
    public static int field1206;

    @OriginalMember(owner = "client!f", name = "u", descriptor = "I")
    public static int field1210;

    @OriginalMember(owner = "client!f", name = "w", descriptor = "I")
    public static int field1212;

    @OriginalMember(owner = "client!f", name = "y", descriptor = "I")
    public static int field1214;

    @OriginalMember(owner = "client!f", name = "A", descriptor = "I")
    public static int field1216;

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(IZZLeh;Leh;)V")
    public static final void method381(int arg0, boolean arg1, boolean arg2, class52 arg3, class52 arg4) {
        class95.field1795 = arg2;
        field1204++;
        class90.field1708 = arg4;
        class165.field2984 = arg3;
        class31.field680 = arg1;
        class193.field3597 = new class201(arg0);
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "()I")
    public final int method295() {
        field1212++;
        return this.field1222;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(IIII)I")
    public static final int method382(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 != 16711935) {
            method382(-121, 86, -47, 89);
        }
        field1214++;
        int var4 = 256 - arg3;
        return ((arg0 & 0xFF00) * arg3 + (arg2 & 0xFF00) * var4 & 0xFF0000) + ((arg0 & 0xFF00FF) * arg3 + (arg2 & 0xFF00FF) * var4 & 0xFF00FF00) >> 8;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(ZI)V")
    public static final void method383(boolean arg0, int arg1) {
        field1216++;
        if (class61.field1298.field3159 >> 7 == class139.field2567 && class61.field1298.field3198 >> 7 == class199.field3704) {
            class139.field2567 = 0;
        }
        int var2 = class22.field548;
        if (arg0) {
            var2 = 1;
        }
        for (int var3 = 0; var3 < var2; var3++) {
            class115 var5;
            long var6;
            if (arg0) {
                var5 = class61.field1298;
                var6 = 8791798054912L;
            } else {
                var6 = (long) class10.field279[var3] << 32;
                var5 = class23.field554[class10.field279[var3]];
            }
            if (var5 != null && var5.method742((byte) -66)) {
                var5.field2146 = false;
                if ((class180.field3307 && class22.field548 > 50 || class22.field548 > 200) && !arg0 && var5.field3153 == var5.field3130) {
                    var5.field2146 = true;
                }
                int var8 = var5.field3159 >> 7;
                int var9 = var5.field3198 >> 7;
                if (var8 >= 0 && var8 < 104 && var9 >= 0 && var9 < 104) {
                    if (var5.field2171 == null || var5.field2155 > class13.field322 || var5.field2156 <= class13.field322) {
                        if ((var5.field3159 & 0x7F) == 64 && (var5.field3198 & 0x7F) == 64) {
                            if (class191.field3543[var8][var9] == class239.field4401) {
                                continue;
                            }
                            class191.field3543[var8][var9] = class239.field4401;
                        }
                        var5.field3146 = class202.method1341(71, var5.field3159, class49.field1038, var5.field3198);
                        class113.method728(class49.field1038, var5.field3159, var5.field3198, var5.field3146, 60, var5, var5.field3177, var6, var5.field3171);
                    } else {
                        var5.field2146 = false;
                        var5.field3146 = class202.method1341(108, var5.field3159, class49.field1038, var5.field3198);
                        class130.method831(class49.field1038, var5.field3159, var5.field3198, var5.field3146, var5, var5.field3177, var6, var5.field2176, var5.field2170, var5.field2154, var5.field2159);
                    }
                }
            }
        }
        int var4 = -117 % ((arg1 + 38) / 59);
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(IIIIIIIIJ)V")
    public final void method286(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        class186 var11 = this.method385((byte) 17);
        field1210++;
        if (var11 != null) {
            var11.method286(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
            this.field1222 = var11.method295();
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(Z)V")
    public static void method384(boolean arg0) {
        if (!arg0) {
            field1228 = null;
        }
        field1205 = null;
        field1228 = null;
        field1227 = null;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(B)Lrb;")
    private final class186 method385(byte arg0) {
        field1206++;
        class134 var2 = class114.method735((byte) -77, this.field1213);
        if (var2.field2479 != null) {
            var2 = var2.method860(-106);
        }
        if (var2 == null) {
            return null;
        }
        if (this.field1217 != null) {
            int var3 = class13.field322 - this.field1223;
            if (var3 > 100 && this.field1217.field2208 > 0) {
                int var4 = this.field1217.field2217.length - this.field1217.field2208;
                while (var4 > this.field1209 && var3 > this.field1217.field2199[this.field1209]) {
                    var3 -= this.field1217.field2199[this.field1209];
                    this.field1209++;
                }
                if (this.field1209 >= var4) {
                    int var5 = 0;
                    for (int var6 = var4; var6 < this.field1217.field2217.length; var6++) {
                        var5 += this.field1217.field2199[var6];
                    }
                    var3 %= var5;
                }
            }
            label86: {
                do {
                    do {
                        if (var3 <= this.field1217.field2199[this.field1209]) {
                            break label86;
                        }
                        var3 -= this.field1217.field2199[this.field1209];
                        this.field1209++;
                    } while (this.field1217.field2217.length > this.field1209);
                    this.field1209 -= this.field1217.field2208;
                } while (this.field1209 >= 0 && this.field1209 < this.field1217.field2217.length);
                this.field1217 = null;
            }
            this.field1223 = class13.field322 - var3;
        }
        int var7;
        int var8;
        if (this.field1224 == 1 || this.field1224 == 3) {
            var8 = var2.field2442;
            var7 = var2.field2430;
        } else {
            var7 = var2.field2442;
            var8 = var2.field2430;
        }
        int var9 = (var7 >> 1) + this.field1215;
        int var10 = (var7 + 1 >> 1) + this.field1215;
        int var11 = (var8 >> 1) + this.field1220;
        int var12 = (var8 + 1 >> 1) + this.field1220;
        if (arg0 != 17) {
            this.method385((byte) -24);
        }
        int[][] var13 = class194.field3619[this.field1208];
        int var14 = var13[var9][var11] + var13[var10][var11] + var13[var9][var12] + var13[var10][var12] >> 2;
        int var15 = (this.field1215 << 7) + (var7 << 6);
        int var16 = (this.field1220 << 7) + (var8 << 6);
        class92 var17;
        if (this.field1217 == null) {
            var17 = var2.method855(var16, this.field1221, var14, var15, 28167, false, this.field1224, var13);
        } else {
            var17 = var2.method863(var14, this.field1217, this.field1221, this.field1209, (byte) -65, var16, var15, this.field1224, var13);
        }
        return var17 == null ? null : var17.field1743;
    }

    @OriginalMember(owner = "client!f", name = "<init>", descriptor = "(IIIIIIIZLrb;)V")
    public class55(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class186 arg8) {
        this.field1208 = arg3;
        this.field1220 = arg5;
        this.field1224 = arg2;
        this.field1215 = arg4;
        this.field1213 = arg0;
        this.field1221 = arg1;
        if (arg6 != -1) {
            this.field1217 = class239.method1550(arg6, (byte) 107);
            this.field1209 = 0;
            this.field1223 = class13.field322 - 1;
            if (this.field1217.field2197 == 0 && arg8 != null && arg8 instanceof class55) {
                class55 var10 = (class55) arg8;
                if (this.field1217 == var10.field1217) {
                    this.field1209 = var10.field1209;
                    this.field1223 = var10.field1223;
                    return;
                }
            }
            if (arg7 && this.field1217.field2208 != -1) {
                this.field1209 = (int) (Math.random() * (double) this.field1217.field2217.length);
                this.field1223 -= (int) (Math.random() * (double) this.field1217.field2199[this.field1209]);
                return;
            }
        }
    }
}
