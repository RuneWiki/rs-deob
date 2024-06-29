import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rga")
public class class83 {

    @OriginalMember(owner = "client!rga", name = "k", descriptor = "I")
    private int field1157;

    @OriginalMember(owner = "client!rga", name = "f", descriptor = "I")
    private int field1155;

    @OriginalMember(owner = "client!rga", name = "j", descriptor = "I")
    private int field1145;

    @OriginalMember(owner = "client!rga", name = "l", descriptor = "Z")
    private boolean field1160;

    @OriginalMember(owner = "client!rga", name = "o", descriptor = "I")
    private int field1153;

    @OriginalMember(owner = "client!rga", name = "b", descriptor = "I")
    private int field1154;

    @OriginalMember(owner = "client!rga", name = "e", descriptor = "I")
    private int field1142;

    @OriginalMember(owner = "client!rga", name = "t", descriptor = "I")
    private int field1159;

    @OriginalMember(owner = "client!rga", name = "c", descriptor = "I")
    private int field1162;

    @OriginalMember(owner = "client!rga", name = "d", descriptor = "I")
    private int field1146;

    @OriginalMember(owner = "client!rga", name = "p", descriptor = "I")
    private int field1158;

    @OriginalMember(owner = "client!rga", name = "i", descriptor = "[I")
    private static int[] field1144 = new int[4];

    @OriginalMember(owner = "client!rga", name = "u", descriptor = "I")
    private int field1147;

    @OriginalMember(owner = "client!rga", name = "h", descriptor = "I")
    private int field1149;

    @OriginalMember(owner = "client!rga", name = "a", descriptor = "I")
    private int field1152;

    @OriginalMember(owner = "client!rga", name = "n", descriptor = "I")
    public int field1156;

    @OriginalMember(owner = "client!rga", name = "m", descriptor = "I")
    private int field1161;

    @OriginalMember(owner = "client!rga", name = "g", descriptor = "Ltb;")
    private static class392 field1143;

    @OriginalMember(owner = "client!rga", name = "q", descriptor = "Ltb;")
    private static class392 field1150;

    @OriginalMember(owner = "client!rga", name = "r", descriptor = "Ltb;")
    private class392 field1151;

    @OriginalMember(owner = "client!rga", name = "s", descriptor = "Lka;")
    private static class761 field1148;

    @OriginalMember(owner = "client!rga", name = "c", descriptor = "(Lha;Lrga;)V")
    private final void method813(class18 arg0, class83 arg1) {
        method822(arg0);
        method820(arg0);
        arg0.method229(field1144);
        arg0.method208(0, 0, this.field1149, this.field1149);
        arg0.method225();
        arg0.method237(0, 0, this.field1149, this.field1149, this.field1154 | 0xFF000000, 0);
        int var3 = 0;
        int var4 = 0;
        int var5 = 256;
        if (arg1 != null) {
            if (arg1.field1160) {
                var3 = -arg1.field1157;
                var4 = -arg1.field1155;
                var5 = -arg1.field1145;
            } else {
                var3 = arg1.field1157 - this.field1157;
                var4 = arg1.field1155 - this.field1155;
                var5 = arg1.field1145 - this.field1145;
            }
        }
        if (this.field1161 != 0) {
            int var6 = class487.field7151[this.field1161];
            int var7 = class487.field7150[this.field1161];
            int var8 = var4 * var7 - var5 * var6 >> 14;
            var5 = var4 * var6 + var5 * var7 >> 14;
            var4 = var8;
        }
        if (this.field1147 != 0) {
            int var9 = class487.field7151[this.field1147];
            int var10 = class487.field7150[this.field1147];
            int var11 = var3 * var10 + var5 * var9 >> 14;
            var5 = var5 * var10 - var3 * var9 >> 14;
            var3 = var11;
        }
        class761 var12 = field1148.method418((byte) 0, 51200, true);
        var12.method376((short) 0, (short) this.field1153);
        arg0.method127(1.0F);
        arg0.method235(16777215, 1.0F, 1.0F, (float) var3, (float) var4, (float) var5);
        int var13 = this.field1149 * 1024 / (var12.method417() - var12.method433());
        if (this.field1154 != 0) {
            var13 = var13 * 13 / 16;
        }
        int[] var14 = arg0.method157();
        arg0.method233(this.field1149 / 2, this.field1149 / 2, var13, var13);
        arg0.method204(arg0.method221());
        class104 var15 = arg0.method221();
        var15.method739(0, 0, arg0.method195() - var12.method414());
        var12.method427(var15, null, 1024, 1);
        int var16 = this.field1149 * 13 / 16;
        int var17 = (this.field1149 - var16) / 2;
        field1143.method3073(var17, var17, var16, var16, 0, this.field1154 | 0xFF000000, 1);
        this.field1151 = arg0.method196(0, 0, this.field1149, this.field1149, true);
        arg0.method225();
        arg0.method237(0, 0, this.field1149, this.field1149, 0, 0);
        field1150.method3073(0, 0, this.field1149, this.field1149, 1, 0, 0);
        this.field1151.method877(0, 0, 3);
        arg0.method233(var14[0], var14[1], var14[2], var14[3]);
        arg0.method208(field1144[0], field1144[1], field1144[2], field1144[3]);
    }

    @OriginalMember(owner = "client!rga", name = "b", descriptor = "(Lha;Lrga;)V")
    private final void method814(class18 arg0, class83 arg1) {
        class60 var3 = class372.method2951(this.field1153, 0, (byte) -3, class716.field10205);
        if (var3 == null) {
            return;
        }
        arg0.method229(field1144);
        arg0.method208(0, 0, this.field1149, this.field1149);
        arg0.method225();
        arg0.method237(0, 0, this.field1149, this.field1149, 0, 0);
        int var4 = 0;
        int var5 = 0;
        int var6 = 256;
        if (arg1 != null) {
            if (arg1.field1160) {
                var4 = -arg1.field1157;
                var5 = -arg1.field1155;
                var6 = -arg1.field1145;
            } else {
                var4 = this.field1157 - arg1.field1157;
                var5 = this.field1155 - arg1.field1155;
                var6 = this.field1145 - arg1.field1145;
            }
        }
        if (this.field1161 != 0) {
            int var7 = -this.field1161 & 0x3FFF;
            int var8 = class487.field7151[var7];
            int var9 = class487.field7150[var7];
            int var10 = var5 * var9 - var6 * var8 >> 14;
            var6 = var5 * var8 + var6 * var9 >> 14;
            var5 = var10;
        }
        if (this.field1147 != 0) {
            int var11 = -this.field1147 & 0x3FFF;
            int var12 = class487.field7151[var11];
            int var13 = class487.field7150[var11];
            int var14 = var4 * var13 + var6 * var12 >> 14;
            var6 = var6 * var13 - var4 * var12 >> 14;
            var4 = var14;
        }
        arg0.method127(1.0F);
        arg0.method235(this.field1154, 1.0F, 1.0F, (float) var4, (float) var5, (float) var6);
        var3.method647(this.field1158 & 0x3FFF, this.field1162 & 0x3FFF, (byte) 105, this.field1146 & 0x3FFF);
        class761 var15 = arg0.method197(var3, 2048, 0, 64, 768);
        int var16 = var15.method417() - var15.method433();
        int var17 = var15.method410() - var15.method432();
        int var18 = var16 > var17 ? var16 : var17;
        int var19 = this.field1149 * 1024 / var18;
        int[] var20 = arg0.method157();
        arg0.method233(this.field1149 / 2, this.field1149 / 2, var19, var19);
        arg0.method204(arg0.method221());
        class104 var21 = arg0.method136();
        var21.method739(0, 0, arg0.method195() - var15.method414());
        var15.method427(var21, null, arg0.method195(), 1);
        this.field1151 = arg0.method196(0, 0, this.field1149, this.field1149, true);
        this.field1151.method877(0, 0, 3);
        arg0.method233(var20[0], var20[1], var20[2], var20[3]);
        arg0.method208(field1144[0], field1144[1], field1144[2], field1144[3]);
    }

    @OriginalMember(owner = "client!rga", name = "a", descriptor = "(Lha;IIIIIIIIII)V")
    public final void method815(class18 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        if (this.field1151 == null) {
            return;
        }
        int[] var12 = new int[3];
        int var13 = -(this.field1157 - arg7 << 16);
        int var14 = this.field1155 - arg8 << 15;
        int var15 = -(this.field1145 - arg9 << 16);
        class104 var16 = arg0.method129();
        var16.method740(0, 0, 0, var12);
        int var17 = var12[0] + var13;
        int var18 = var12[1] + var14;
        int var19 = var12[2] + var15;
        arg0.method223(var17, var18, var19, var12);
        if (var12[2] < 0) {
            return;
        }
        int var20 = var12[0] - this.field1152 / 2;
        int var21 = var12[1] - this.field1152 / 2;
        if (var21 < arg4 && this.field1152 + var21 > 0 && var20 < arg3 && this.field1152 + var20 > 0) {
            this.field1151.method3073(var20, var21, this.field1152, this.field1152, 0, arg10 << 24 | 0xFFFFFF, 1);
        }
    }

    @OriginalMember(owner = "client!rga", name = "a", descriptor = "(IIII)Z")
    public final boolean method816(int arg0, int arg1, int arg2, int arg3) {
        int var8;
        int var9;
        int var10;
        if (this.field1160) {
            this.field1156 = 1073741823;
            var8 = this.field1157;
            var9 = this.field1155;
            var10 = this.field1145;
        } else {
            int var5 = this.field1157 - arg0;
            int var6 = this.field1155 - arg1;
            int var7 = this.field1145 - arg2;
            this.field1156 = (int) Math.sqrt((double) (var7 * var7 + var5 * var5 + var6 * var6));
            if (this.field1156 == 0) {
                this.field1156 = 1;
            }
            var8 = (var5 << 8) / this.field1156;
            var9 = (var6 << 8) / this.field1156;
            var10 = (var7 << 8) / this.field1156;
        }
        int var11 = (int) (Math.sqrt((double) (var10 * var10 + var8 * var8 + var9 * var9)) * 256.0D);
        if (var11 > 128) {
            var8 = (var8 << 16) / var11;
            var9 = (var9 << 16) / var11;
            var10 = (var10 << 16) / var11;
            this.field1152 = this.field1142 * arg3 / (this.field1160 ? 1024 : this.field1156);
        } else {
            this.field1152 = 0;
        }
        if (this.field1152 < 8) {
            this.field1151 = null;
            return false;
        }
        int var12 = class788.method5671(1282334120, this.field1152);
        if (var12 > arg3) {
            var12 = class482.method3720((byte) -110, arg3);
        }
        if (var12 > 512) {
            var12 = 512;
        }
        if (this.field1149 != var12) {
            this.field1149 = var12;
        }
        this.field1161 = (int) (Math.asin((double) ((float) var9 / 256.0F)) * 2607.5945876176133D) & 0x3FFF;
        this.field1147 = (int) (Math.atan2((double) var8, (double) (-var10)) * 2607.5945876176133D) & 0x3FFF;
        this.field1151 = null;
        return true;
    }

    @OriginalMember(owner = "client!rga", name = "a", descriptor = "()V")
    public static void method817() {
        field1148 = null;
        field1143 = null;
        field1150 = null;
        field1144 = null;
    }

    @OriginalMember(owner = "client!rga", name = "d", descriptor = "(Lha;Lrga;)Z")
    public final boolean method818(class18 arg0, class83 arg1) {
        return this.field1151 != null || this.method821(arg0, arg1);
    }

    @OriginalMember(owner = "client!rga", name = "b", descriptor = "()V")
    public static final void method819() {
        field1148 = null;
        field1150 = null;
    }

    @OriginalMember(owner = "client!rga", name = "a", descriptor = "(Lha;)V")
    private static final void method820(class18 arg0) {
        if (field1150 != null) {
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
        field1150 = arg0.method201(128, 128, var2, 128, (byte) 3, 0);
        field1143 = arg0.method201(128, 128, var1, 128, (byte) 127, 0);
    }

    @OriginalMember(owner = "client!rga", name = "a", descriptor = "(Lha;Lrga;)Z")
    private final boolean method821(class18 arg0, class83 arg1) {
        if (this.field1151 == null) {
            if (this.field1159 == 0) {
                if (class62.field946.method4504(this.field1153, -31410)) {
                    int[] var3 = class62.field946.method4499(this.field1149, this.field1149, -7994, false, 0.7F, this.field1153);
                    this.field1151 = arg0.method201(this.field1149, this.field1149, var3, this.field1149, (byte) -71, 0);
                }
            } else if (this.field1159 == 2) {
                this.method814(arg0, arg1);
            } else if (this.field1159 == 1) {
                this.method813(arg0, arg1);
            }
        }
        return this.field1151 != null;
    }

    @OriginalMember(owner = "client!rga", name = "<init>", descriptor = "(IIIIIIIZIII)V")
    public class83(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10) {
        this.field1157 = arg2;
        this.field1155 = arg3;
        this.field1145 = arg4;
        this.field1160 = arg7;
        this.field1153 = arg1;
        this.field1154 = arg6;
        this.field1142 = arg5;
        this.field1159 = arg0;
        this.field1162 = arg8;
        this.field1146 = arg9;
        this.field1158 = arg10;
    }

    @OriginalMember(owner = "client!rga", name = "b", descriptor = "(Lha;)V")
    private static final void method822(class18 arg0) {
        if (field1148 != null) {
            return;
        }
        class60 var1 = new class60(580, 1104, 1);
        var1.method640((byte) 0, (short) 1024, (byte) 0, (short) 0, (short) 0, (short) 32767, -1, (byte) 0, (short) 1024, (short) 1024);
        var1.method655(0, 128, 0, 0);
        var1.method655(0, -128, 0, 0);
        for (int var2 = 0; var2 <= 24; var2++) {
            int var3 = var2 * 8192 / 24;
            int var4 = class487.field7151[var3];
            int var5 = class487.field7150[var3];
            for (int var6 = 1; var6 < 24; var6++) {
                int var12 = var6 * 8192 / 24;
                int var13 = class487.field7150[var12] >> 7;
                int var14 = class487.field7151[var12] * var4 >> 21;
                int var15 = class487.field7151[var12] * var5 >> 21;
                var1.method655(0, var13, var15, -var14);
            }
            if (var2 > 0) {
                int var7 = var2 * 23 + 2;
                int var8 = var7 - 23;
                var1.method641((short) 127, var7, (byte) 0, 0, 21217, (byte) 0, (short) 0, (byte) 0, var8);
                for (int var9 = 1; var9 < 23; var9++) {
                    int var10 = var8 + 1;
                    int var11 = var7 + 1;
                    var1.method641((short) 127, var7, (byte) 0, var8, 21217, (byte) 0, (short) 0, (byte) 0, var10);
                    var1.method641((short) 127, var7, (byte) 0, var10, 21217, (byte) 0, (short) 0, (byte) 0, var11);
                    var8 = var10;
                    var7 = var11;
                }
                var1.method641((short) 127, 1, (byte) 0, var7, 21217, (byte) 0, (short) 0, (byte) 0, var8);
            }
        }
        var1.field880 = var1.field874;
        var1.field910 = null;
        var1.field904 = null;
        var1.field884 = null;
        field1148 = arg0.method197(var1, 51200, 33, 64, 768);
    }
}
