import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cj")
public class class77 extends class129 {

    @OriginalMember(owner = "client!cj", name = "y", descriptor = "I")
    private final int field1279;

    @OriginalMember(owner = "client!cj", name = "D", descriptor = "I")
    private final int field1283;

    @OriginalMember(owner = "client!cj", name = "T", descriptor = "I")
    private final int field1298;

    @OriginalMember(owner = "client!cj", name = "H", descriptor = "I")
    private int field1287;

    @OriginalMember(owner = "client!cj", name = "t", descriptor = "I")
    public static volatile int field1274 = 0;

    @OriginalMember(owner = "client!cj", name = "w", descriptor = "J")
    public static long field1277 = 0L;

    @OriginalMember(owner = "client!cj", name = "Q", descriptor = "Lmh;")
    private static class62 field1295 = class201.method1405(true, "Connected to update server");

    @OriginalMember(owner = "client!cj", name = "I", descriptor = "Lmh;")
    public static class62 field1288 = field1295;

    @OriginalMember(owner = "client!cj", name = "s", descriptor = "I")
    public static int field1273;

    @OriginalMember(owner = "client!cj", name = "u", descriptor = "I")
    public static int field1275;

    @OriginalMember(owner = "client!cj", name = "v", descriptor = "I")
    public static int field1276;

    @OriginalMember(owner = "client!cj", name = "x", descriptor = "I")
    public static int field1278;

    @OriginalMember(owner = "client!cj", name = "z", descriptor = "I")
    public static int field1280;

    @OriginalMember(owner = "client!cj", name = "A", descriptor = "I")
    public static int field1281;

    @OriginalMember(owner = "client!cj", name = "B", descriptor = "I")
    public static int field1282;

    @OriginalMember(owner = "client!cj", name = "E", descriptor = "I")
    public static int field1284;

    @OriginalMember(owner = "client!cj", name = "F", descriptor = "I")
    public static int field1285;

    @OriginalMember(owner = "client!cj", name = "G", descriptor = "I")
    private int field1286;

    @OriginalMember(owner = "client!cj", name = "K", descriptor = "I")
    public static int field1289;

    @OriginalMember(owner = "client!cj", name = "L", descriptor = "I")
    public static int field1290;

    @OriginalMember(owner = "client!cj", name = "M", descriptor = "I")
    public static int field1291;

    @OriginalMember(owner = "client!cj", name = "N", descriptor = "I")
    private int field1292;

    @OriginalMember(owner = "client!cj", name = "P", descriptor = "I")
    private int field1294;

    @OriginalMember(owner = "client!cj", name = "R", descriptor = "I")
    public static int field1296;

    @OriginalMember(owner = "client!cj", name = "U", descriptor = "I")
    private int field1299;

    @OriginalMember(owner = "client!cj", name = "S", descriptor = "[B")
    private byte[] field1297;

    @OriginalMember(owner = "client!cj", name = "O", descriptor = "[Lmh;")
    public static class62[] field1293;

    @OriginalMember(owner = "client!cj", name = "b", descriptor = "(Z)V", line = 8)
    public static void method592(boolean arg0) {
        field1293 = null;
        field1288 = null;
        field1295 = null;
        if (arg0) {
            field1277 = -102L;
        }
    }

    @OriginalMember(owner = "client!cj", name = "b", descriptor = "(I)V", line = 27)
    public static final void method593(int arg0) {
        field1276++;
        if (class296.field5052 == 5) {
            class296.field5052 = 6;
            if (arg0 != 1262386856) {
                field1288 = (class62) null;
            }
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(IZ)I", line = 49)
    public static final int method594(int arg0, boolean arg1) {
        long var2 = class293.method1985((byte) -71);
        field1278++;
        if (arg0 >= -73) {
            field1293 = (class62[]) null;
        }
        for (class176 var4 = arg1 ? (class176) class269.field4567.method317(-89) : (class176) class269.field4567.method314(-54); var4 != null; var4 = (class176) class269.field4567.method314(-43)) {
            if ((var4.field2822 & 0x3FFFFFFFFFFFFFFFL) < var2) {
                if ((var4.field2822 & 0x4000000000000000L) != 0L) {
                    int var5 = (int) var4.field3499;
                    class222.field3877[var5] = class24.field275[var5];
                    var4.method1444((byte) 89);
                    return var5;
                }
                var4.method1444((byte) 89);
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "([III[II)V", line = 88)
    public static final void method595(int[] arg0, int arg1, int arg2, int[] arg3, int arg4) {
        field1281++;
        if (arg4 != -12530) {
            field1293 = (class62[]) null;
        }
        if (arg2 <= arg1) {
            return;
        }
        int var5 = (arg1 + arg2) / 2;
        int var6 = arg0[var5];
        arg0[var5] = arg0[arg2];
        arg0[arg2] = var6;
        int var7 = arg3[var5];
        arg3[var5] = arg3[arg2];
        int var8 = arg1;
        arg3[arg2] = var7;
        for (int var9 = arg1; var9 < arg2; var9++) {
            if (arg0[var9] > (var9 & 0x1) + var6) {
                int var10 = arg0[var9];
                arg0[var9] = arg0[var8];
                arg0[var8] = var10;
                int var11 = arg3[var9];
                arg3[var9] = arg3[var8];
                arg3[var8++] = var11;
            }
        }
        arg0[arg2] = arg0[var8];
        arg0[var8] = var6;
        arg3[arg2] = arg3[var8];
        arg3[var8] = var7;
        method595(arg0, arg1, var8 - 1, arg3, -12530);
        method595(arg0, var8 + 1, arg2, arg3, -12530);
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(ZBI)Lmh;", line = 146)
    public static final class62 method596(boolean arg0, byte arg1, int arg2) {
        field1289++;
        int var3 = -67 % ((arg1 - 49) / 51);
        return class164.method1181(arg2, 10, arg0, (byte) -35);
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(IB)V", line = 156)
    public void method597(int arg0, byte arg1) {
        this.field1297[arg0] = arg1;
        field1284++;
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(BZ)V", line = 175)
    public static final void method598(byte arg0, boolean arg1) {
        byte[][] var2;
        byte var3;
        if (arg1) {
            var2 = class256.field4327;
            var3 = 1;
        } else {
            var2 = class196.field3328;
            var3 = 4;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            class209.method1460(119);
            for (int var5 = 0; var5 < 13; var5++) {
                for (int var6 = 0; var6 < 13; var6++) {
                    boolean var7 = false;
                    int var8 = class183.field2927[var4][var5][var6];
                    if (var8 != -1) {
                        int var9 = var8 >> 24 & 0x3;
                        if (!arg1 || var9 == 0) {
                            int var10 = (var8 & 0x7) >> 1;
                            int var11 = var8 >> 14 & 0x3FF;
                            int var12 = (var8 & 0x3FFE) >> 3;
                            int var13 = (var11 / 8 << 8) + (var12 / 8);
                            for (int var14 = 0; var14 < class39.field608.length; var14++) {
                                if (class39.field608[var14] == var13 && var2[var14] != null) {
                                    var7 = true;
                                    class42.method283(var2[var14], var4, var9, (byte) 115, arg1, var5 * 8, class250.field4244, (var12 & 0x7) * 8, var6 * 8, var10, (var11 & 0x7) * 8);
                                    break;
                                }
                            }
                        }
                    }
                    if (!var7) {
                        class229.method1619(8, var6 * 8, var4, var5 * 8, -105, 8);
                    }
                }
            }
        }
        field1290++;
        if (arg0 != -29) {
            field1293 = (class62[]) null;
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(III)V", line = 271)
    public final void method599(int arg0, int arg1, int arg2) {
        field1280++;
        if (arg0 != -1816054708) {
            this.field1292 = -113;
        }
        if (arg1 == 0) {
            this.field1286 = this.field1283 - (arg2 < 0 ? -arg2 : arg2);
            this.field1286 = this.field1286 * this.field1286 >> 12;
            this.field1299 = 4096;
            this.field1292 = this.field1286;
            return;
        }
        this.field1299 = this.field1286 * this.field1279 >> 12;
        if (this.field1299 < 0) {
            this.field1299 = 0;
        } else if (this.field1299 > 4096) {
            this.field1299 = 4096;
        }
        this.field1286 = this.field1283 - (arg2 >= 0 ? arg2 : -arg2);
        this.field1286 = this.field1286 * this.field1286 >> 12;
        this.field1286 = this.field1299 * this.field1286 >> 12;
        this.field1292 += this.field1287 * this.field1286 >> 12;
        this.field1287 = this.field1298 * this.field1287 >> 12;
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(Z)V", line = 314)
    public final void method600(boolean arg0) {
        if (!arg0) {
            this.field1294 = 0;
            field1291++;
            this.field1292 = 0;
        }
    }

    @OriginalMember(owner = "client!cj", name = "<init>", descriptor = "(IIIIIFFF)V", line = 334)
    public class77(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5, float arg6, float arg7) {
        super(arg0, arg1, arg2, arg3, arg4);
        this.field1279 = (int) (arg7 * 4096.0F);
        this.field1283 = (int) (arg6 * 4096.0F);
        this.field1287 = this.field1298 = (int) (Math.pow(0.5D, (double) (-arg5)) * 4096.0D);
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(BIIILsg;II)V", line = 345)
    public static final void method601(byte arg0, int arg1, int arg2, int arg3, class191 arg4, int arg5, int arg6) {
        field1285++;
        int var7 = arg2 * arg2 + arg5 * arg5;
        if (var7 > 360000) {
            return;
        }
        if (arg0 != 66) {
            field1293 = (class62[]) null;
        }
        int var8 = Math.min(arg4.field3190 / 2, arg4.field3126 / 2);
        if (var7 <= var8 * var8) {
            class234.method1653(class228.field3963[arg6], arg1, arg3, arg5, arg4, arg2, (byte) 64);
            return;
        }
        int var9 = class267.field4516 + class187.field2984 & 0x7FF;
        int var10 = class23.field245[var9];
        var8 -= 10;
        int var11 = var10 * 256 / (class149.field2350 + 256);
        int var12 = class23.field254[var9];
        int var13 = var12 * 256 / (class149.field2350 + 256);
        int var14 = arg2 * var13 + arg5 * var11 >> 16;
        int var15 = arg5 * var13 - (arg2 * var11) >> 16;
        double var16 = Math.atan2((double) var14, (double) var15);
        int var18 = (int) (Math.sin(var16) * (double) var8);
        int var19 = (int) (Math.cos(var16) * (double) var8);
        ((class257) class264.field4451[arg6]).method1786(240, 240, (arg3 - (-(arg4.field3190 / 2) - var18)) * 16, (arg1 + (arg4.field3126 / 2) - var19) * 16, (int) (var16 * 10430.378D), 4096);
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(Lhi;Lhi;ZLhi;Lhi;)V", line = 395)
    public static final void method602(class26 arg0, class26 arg1, boolean arg2, class26 arg3, class26 arg4) {
        class165.field2692 = arg4;
        class15.field127 = arg1;
        class289.field4923 = arg0;
        field1296++;
        if (!arg2) {
            method596(false, (byte) -89, 21);
        }
        class205.field3463 = arg3;
        class275.field4713 = new class191[class165.field2692.method151((byte) 74)][];
        class307.field5266 = new boolean[class165.field2692.method151((byte) 74)];
    }

    @OriginalMember(owner = "client!cj", name = "c", descriptor = "(B)V", line = 411)
    public final void method603(byte arg0) {
        field1273++;
        if (arg0 != -87) {
            method595((int[]) null, -70, 83, (int[]) null, 119);
        }
        this.field1292 >>= 0x4;
        if (this.field1292 < 0) {
            this.field1292 = 0;
        } else if (this.field1292 > 255) {
            this.field1292 = 255;
        }
        this.field1287 = this.field1298;
        this.method597(this.field1294++, (byte) this.field1292);
        this.field1292 = 0;
    }
}
