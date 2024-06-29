import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qq")
public class class82 {

    @OriginalMember(owner = "client!qq", name = "q", descriptor = "I")
    private int field1221;

    @OriginalMember(owner = "client!qq", name = "p", descriptor = "I")
    private int field1220;

    @OriginalMember(owner = "client!qq", name = "i", descriptor = "I")
    private int field1213;

    @OriginalMember(owner = "client!qq", name = "r", descriptor = "Z")
    private boolean field1222;

    @OriginalMember(owner = "client!qq", name = "c", descriptor = "I")
    private int field1207;

    @OriginalMember(owner = "client!qq", name = "h", descriptor = "I")
    private int field1212;

    @OriginalMember(owner = "client!qq", name = "l", descriptor = "I")
    private int field1216;

    @OriginalMember(owner = "client!qq", name = "g", descriptor = "I")
    private int field1211;

    @OriginalMember(owner = "client!qq", name = "m", descriptor = "[I")
    private static int[] field1217 = new int[4];

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "I")
    private int field1205;

    @OriginalMember(owner = "client!qq", name = "e", descriptor = "I")
    public int field1209;

    @OriginalMember(owner = "client!qq", name = "j", descriptor = "I")
    private int field1214;

    @OriginalMember(owner = "client!qq", name = "n", descriptor = "I")
    private int field1218;

    @OriginalMember(owner = "client!qq", name = "o", descriptor = "I")
    private int field1219;

    @OriginalMember(owner = "client!qq", name = "f", descriptor = "Lka;")
    private static class233 field1210;

    @OriginalMember(owner = "client!qq", name = "b", descriptor = "Lmq;")
    private static class85 field1206;

    @OriginalMember(owner = "client!qq", name = "d", descriptor = "Lmq;")
    private class85 field1208;

    @OriginalMember(owner = "client!qq", name = "k", descriptor = "Lmq;")
    private static class85 field1215;

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(Lha;)V")
    private static final void method719(class475 arg0) {
        if (field1215 != null) {
            return;
        }
        int[] var1 = new int[16384];
        int[] var2 = new int[16384];
        for (int var3 = 0; var3 < 64; var3++) {
            int var4 = 64 - var3;
            int var5 = var4 * var4;
            int var6 = 128 - var3 - 1;
            int var7 = var3 * 128;
            int var8 = var6 * 128;
            for (int var9 = 0; var9 < 64; var9++) {
                int var10 = 64 - var9;
                int var11 = var10 * var10;
                int var12 = 128 - var9 - 1;
                int var13 = 256 - (var5 + var11 << 8) / 4096;
                int var14 = var13 * 16 * 192 / 1536;
                if (var14 < 0) {
                    var14 = 0;
                } else if (var14 > 255) {
                    var14 = 255;
                }
                int var15 = var14 / 2;
                var2[var7 + var9] = var2[var7 + var12] = var2[var8 + var9] = var2[var8 + var12] = var14 | 0xFF00 << 16;
                var1[var7 + var9] = var1[var7 + var12] = var1[var8 + var9] = var1[var8 + var12] = 127 - var15 << 24 | 0xFFFFFF;
            }
        }
        field1215 = arg0.method2773(1, 128, var2, 0, 128, 128);
        field1206 = arg0.method2773(1, 128, var1, 0, 128, 128);
    }

    @OriginalMember(owner = "client!qq", name = "b", descriptor = "(Lha;)V")
    private static final void method720(class475 arg0) {
        if (field1210 != null) {
            return;
        }
        class678 var1 = new class678(580, 1104, 1);
        var1.method3802((byte) 0, (byte) 0, (short) 0, (short) 1024, (short) 1024, (byte) 0, true, (short) 32767, (short) 0, (short) 1024);
        var1.method3814(0, 0, 128, 0);
        var1.method3814(0, 0, -128, 0);
        for (int var2 = 0; var2 <= 24; var2++) {
            int var3 = var2 * 8192 / 24;
            int var4 = class253.field3634[var3];
            int var5 = class253.field3633[var3];
            for (int var6 = 1; var6 < 24; var6++) {
                int var12 = var6 * 8192 / 24;
                int var13 = class253.field3633[var12] >> 7;
                int var14 = class253.field3634[var12] * var4 >> 21;
                int var15 = class253.field3634[var12] * var5 >> 21;
                var1.method3814(-var14, 0, var13, var15);
            }
            if (var2 > 0) {
                int var7 = var2 * 23 + 2;
                int var8 = var7 - 23;
                var1.method3815(0, var8, (byte) 0, (byte) 0, false, var7, (short) 0, (short) 127, (byte) 0);
                for (int var9 = 1; var9 < 23; var9++) {
                    int var10 = var8 + 1;
                    int var11 = var7 + 1;
                    var1.method3815(var8, var10, (byte) 0, (byte) 0, false, var7, (short) 0, (short) 127, (byte) 0);
                    var1.method3815(var10, var11, (byte) 0, (byte) 0, false, var7, (short) 0, (short) 127, (byte) 0);
                    var8 = var10;
                    var7 = var11;
                }
                var1.method3815(var7, var8, (byte) 0, (byte) 0, false, 1, (short) 0, (short) 127, (byte) 0);
            }
        }
        var1.field9587 = var1.field9551;
        var1.field9573 = null;
        var1.field9545 = null;
        var1.field9575 = null;
        field1210 = arg0.method514(var1, 51200, 33, 64, 768);
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "()V")
    public final void method721() {
        this.field1208 = null;
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(IIII)Z")
    public final boolean method722(int arg0, int arg1, int arg2, int arg3) {
        int var8;
        int var9;
        int var10;
        if (this.field1222) {
            this.field1209 = 1073741823;
            var8 = this.field1221;
            var9 = this.field1220;
            var10 = this.field1213;
        } else {
            int var5 = this.field1221 - arg0;
            int var6 = this.field1220 - arg1;
            int var7 = this.field1213 - arg2;
            this.field1209 = (int) Math.sqrt((double) (var7 * var7 + var5 * var5 + var6 * var6));
            if (this.field1209 == 0) {
                this.field1209 = 1;
            }
            var8 = (var5 << 8) / this.field1209;
            var9 = (var6 << 8) / this.field1209;
            var10 = (var7 << 8) / this.field1209;
        }
        int var11 = (int) (Math.sqrt((double) (var10 * var10 + var8 * var8 + var9 * var9)) * 256.0D);
        if (var11 > 128) {
            var8 = (var8 << 16) / var11;
            var9 = (var9 << 16) / var11;
            var10 = (var10 << 16) / var11;
            this.field1214 = this.field1216 * arg3 / (this.field1222 ? 1024 : this.field1209);
        } else {
            this.field1214 = 0;
        }
        if (this.field1214 < 8) {
            this.field1208 = null;
            return false;
        }
        int var12 = class661.method3706(this.field1214, true);
        if (var12 > arg3) {
            var12 = class515.method3025(arg3, 592877665);
        }
        if (var12 > 512) {
            var12 = 512;
        }
        if (this.field1205 != var12) {
            this.field1205 = var12;
        }
        this.field1219 = (int) (Math.asin((double) ((float) var9 / 256.0F)) * 2607.5945876176133D) & 0x3FFF;
        this.field1218 = (int) (Math.atan2((double) var8, (double) (-var10)) * 2607.5945876176133D) & 0x3FFF;
        this.field1208 = null;
        return true;
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(Lha;Lqq;)Z")
    private final boolean method723(class475 arg0, class82 arg1) {
        if (this.field1208 == null) {
            if (this.field1211 == 0) {
                if (class106.field1527.method846(this.field1207, true)) {
                    int[] var3 = class106.field1527.method845(0.7F, this.field1207, false, (byte) 52, this.field1205, this.field1205);
                    this.field1208 = arg0.method2773(1, this.field1205, var3, 0, this.field1205, this.field1205);
                }
            } else if (this.field1211 == 2) {
                this.method725(arg0, arg1);
            } else if (this.field1211 == 1) {
                this.method728(arg0, arg1);
            }
        }
        return this.field1208 != null;
    }

    @OriginalMember(owner = "client!qq", name = "b", descriptor = "()V")
    public static final void method724() {
        field1210 = null;
        field1215 = null;
    }

    @OriginalMember(owner = "client!qq", name = "b", descriptor = "(Lha;Lqq;)V")
    private final void method725(class475 arg0, class82 arg1) {
        class678 var3 = class157.method1211(-5, class721.field10068, 0, this.field1207);
        if (var3 == null) {
            return;
        }
        arg0.method422(field1217);
        arg0.method488(0, 0, this.field1205, this.field1205);
        arg0.method436(0, 0, this.field1205, this.field1205, 0, 0);
        int var4 = 0;
        int var5 = 0;
        int var6 = 256;
        if (arg1 != null) {
            if (arg1.field1222) {
                var4 = -arg1.field1221;
                var5 = -arg1.field1220;
                var6 = -arg1.field1213;
            } else {
                var4 = this.field1221 - arg1.field1221;
                var5 = this.field1220 - arg1.field1220;
                var6 = this.field1213 - arg1.field1213;
            }
        }
        if (this.field1219 != 0) {
            int var7 = -this.field1219 & 0x3FFF;
            int var8 = class253.field3634[var7];
            int var9 = class253.field3633[var7];
            int var10 = var5 * var9 - var6 * var8 >> 14;
            var6 = var5 * var8 + var6 * var9 >> 14;
            var5 = var10;
        }
        if (this.field1218 != 0) {
            int var11 = -this.field1218 & 0x3FFF;
            int var12 = class253.field3634[var11];
            int var13 = class253.field3633[var11];
            int var14 = var4 * var13 + var6 * var12 >> 14;
            var6 = var6 * var13 - var4 * var12 >> 14;
            var4 = var14;
        }
        arg0.method516(1.0F);
        arg0.method517(16777215, 1.0F, 1.0F, (float) var4, (float) var5, (float) var6);
        class233 var15 = arg0.method514(var3, 2048, 0, 64, 768);
        int var16 = var15.method527() - var15.method566();
        int var17 = var15.method541() - var15.method534();
        int var18 = var15.method566() + var16 / 2;
        int var19 = var15.method534() + var17 / 2;
        int var20 = var16 > var17 ? var16 : var17;
        arg0.method449(var18, var19, var20, var20);
        arg0.method498(arg0.method463());
        class765 var21 = arg0.method457();
        var21.method1568(0, 0, arg0.method462() - var15.method525());
        var15.method546(var21, null, arg0.method462(), 1);
        this.field1208 = arg0.method503(0, 0, this.field1205, this.field1205, true);
        this.field1208.method277(0, 0, 3);
        arg0.method488(field1217[0], field1217[1], field1217[2], field1217[3]);
    }

    @OriginalMember(owner = "client!qq", name = "c", descriptor = "(Lha;Lqq;)Z")
    public final boolean method726(class475 arg0, class82 arg1) {
        return this.field1208 != null || this.method723(arg0, arg1);
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(Lha;IIIIII)V")
    public final void method727(class475 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (this.field1208 == null) {
            return;
        }
        int var8 = this.field1219 - arg5 & 0x3FFF;
        int var9 = this.field1218 - arg6 & 0x3FFF;
        if (var9 > 8192) {
            var9 -= 16384;
        }
        if (var8 > 8192) {
            var8 -= 16384;
        }
        int var10 = arg4 * var8 / 4096 + (arg4 - this.field1214) / 2;
        int var11 = arg4 * var9 / -4096 + (arg3 - this.field1214) / 2;
        if (var10 < arg4 && this.field1214 + var10 > 0 && var11 < arg3 && this.field1214 + var11 > 0) {
            this.field1208.method755(arg1 + var11, arg2 + var10, this.field1214, this.field1214);
        }
    }

    @OriginalMember(owner = "client!qq", name = "d", descriptor = "(Lha;Lqq;)V")
    private final void method728(class475 arg0, class82 arg1) {
        method720(arg0);
        method719(arg0);
        arg0.method422(field1217);
        arg0.method488(0, 0, this.field1205, this.field1205);
        arg0.method91();
        arg0.method436(0, 0, this.field1205, this.field1205, this.field1212 | 0xFF000000, 0);
        int var3 = 0;
        int var4 = 0;
        int var5 = 256;
        if (arg1 != null) {
            if (arg1.field1222) {
                var3 = -arg1.field1221;
                var4 = -arg1.field1220;
                var5 = -arg1.field1213;
            } else {
                var3 = arg1.field1221 - this.field1221;
                var4 = arg1.field1220 - this.field1220;
                var5 = arg1.field1213 - this.field1213;
            }
        }
        if (this.field1219 != 0) {
            int var6 = class253.field3634[this.field1219];
            int var7 = class253.field3633[this.field1219];
            int var8 = var4 * var7 - var5 * var6 >> 14;
            var5 = var4 * var6 + var5 * var7 >> 14;
            var4 = var8;
        }
        if (this.field1218 != 0) {
            int var9 = class253.field3634[this.field1218];
            int var10 = class253.field3633[this.field1218];
            int var11 = var3 * var10 + var5 * var9 >> 14;
            var5 = var5 * var10 - var3 * var9 >> 14;
            var3 = var11;
        }
        class233 var12 = field1210.method585((byte) 0, 51200, true);
        var12.method594((short) 0, (short) this.field1207);
        arg0.method516(1.0F);
        arg0.method517(16777215, 1.0F, 1.0F, (float) var3, (float) var4, (float) var5);
        int var13 = this.field1205 * 1024 / (var12.method527() - var12.method566());
        if (this.field1212 != 0) {
            var13 = var13 * 13 / 16;
        }
        arg0.method449(this.field1205 / 2, this.field1205 / 2, var13, var13);
        arg0.method498(arg0.method463());
        class765 var14 = arg0.method463();
        var14.method1568(0, 0, arg0.method462() - var12.method525());
        var12.method546(var14, null, 1024, 1);
        int var15 = this.field1205 * 13 / 16;
        int var16 = (this.field1205 - var15) / 2;
        field1206.method758(var16, var16, var15, var15, 0, this.field1212 | 0xFF000000, 1);
        this.field1208 = arg0.method503(0, 0, this.field1205, this.field1205, true);
        arg0.method91();
        arg0.method436(0, 0, this.field1205, this.field1205, 0, 0);
        field1215.method758(0, 0, this.field1205, this.field1205, 1, 0, 0);
        this.field1208.method277(0, 0, 0);
        arg0.method488(field1217[0], field1217[1], field1217[2], field1217[3]);
    }

    @OriginalMember(owner = "client!qq", name = "<init>", descriptor = "(IIIIIIIZ)V")
    public class82(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        this.field1221 = arg2;
        this.field1220 = arg3;
        this.field1213 = arg4;
        this.field1222 = arg7;
        this.field1207 = arg1;
        this.field1212 = arg6;
        this.field1216 = arg5;
        this.field1211 = arg0;
    }

    @OriginalMember(owner = "client!qq", name = "c", descriptor = "()V")
    public static void method729() {
        field1210 = null;
        field1206 = null;
        field1215 = null;
        field1217 = null;
    }
}
