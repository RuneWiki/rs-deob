import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public class class15 extends class95 {

    @OriginalMember(owner = "client!cb", name = "db", descriptor = "I")
    public int field275;

    @OriginalMember(owner = "client!cb", name = "fb", descriptor = "I")
    public int field277;

    @OriginalMember(owner = "client!cb", name = "ib", descriptor = "I")
    public int field280;

    @OriginalMember(owner = "client!cb", name = "gb", descriptor = "I")
    public int field278;

    @OriginalMember(owner = "client!cb", name = "eb", descriptor = "I")
    public int field276;

    @OriginalMember(owner = "client!cb", name = "cb", descriptor = "I")
    public int field274;

    @OriginalMember(owner = "client!cb", name = "bb", descriptor = "[B")
    public byte[] field273;

    @OriginalMember(owner = "client!cb", name = "hb", descriptor = "[I")
    public int[] field279;

    @OriginalMember(owner = "client!cb", name = "d", descriptor = "()V")
    public final void method77() {
        byte[] var1 = new byte[this.field280 * this.field275];
        int var2 = 0;
        for (int var3 = 0; var3 < this.field280; var3++) {
            for (int var4 = this.field275 - 1; var4 >= 0; var4--) {
                var1[var2++] = this.field273[this.field275 * var3 + var4];
            }
        }
        this.field273 = var1;
        this.field274 = this.field277 - this.field275 - this.field274;
    }

    @OriginalMember(owner = "client!cb", name = "e", descriptor = "()V")
    public final void method78() {
        byte[] var1 = new byte[this.field280 * this.field275];
        int var2 = 0;
        for (int var3 = this.field280 - 1; var3 >= 0; var3--) {
            for (int var4 = 0; var4 < this.field275; var4++) {
                var1[var2++] = this.field273[this.field275 * var3 + var4];
            }
        }
        this.field273 = var1;
        this.field276 = this.field278 - this.field280 - this.field276;
    }

    @OriginalMember(owner = "client!cb", name = "f", descriptor = "()V")
    public final void method79() {
        if (this.field277 == this.field275 && this.field280 == this.field278) {
            return;
        }
        byte[] var1 = new byte[this.field278 * this.field277];
        int var2 = 0;
        for (int var3 = 0; var3 < this.field280; var3++) {
            for (int var4 = 0; var4 < this.field275; var4++) {
                var1[(this.field276 + var3) * this.field277 + this.field274 + var4] = this.field273[var2++];
            }
        }
        this.field273 = var1;
        this.field275 = this.field277;
        this.field280 = this.field278;
        this.field274 = 0;
        this.field276 = 0;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(II)V")
    public final void method80(int arg0, int arg1) {
        int var3 = this.field274 + arg0;
        int var4 = this.field276 + arg1;
        int var5 = class95.field2117 * var4 + var3;
        int var6 = 0;
        int var7 = this.field280;
        int var8 = this.field275;
        int var9 = class95.field2117 - var8;
        int var10 = 0;
        if (var4 < class95.field2114) {
            int var11 = class95.field2114 - var4;
            var7 -= var11;
            var4 = class95.field2114;
            var6 += var8 * var11;
            var5 += class95.field2117 * var11;
        }
        if (var4 + var7 > class95.field2116) {
            var7 -= var4 + var7 - class95.field2116;
        }
        if (var3 < class95.field2118) {
            int var12 = class95.field2118 - var3;
            var8 -= var12;
            var3 = class95.field2118;
            var6 += var12;
            var5 += var12;
            var10 += var12;
            var9 += var12;
        }
        if (var3 + var8 > class95.field2120) {
            int var13 = var3 + var8 - class95.field2120;
            var8 -= var13;
            var10 += var13;
            var9 += var13;
        }
        if (var8 > 0 && var7 > 0) {
            method81(class95.field2115, this.field273, this.field279, var6, var5, var8, var7, var9, var10);
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "([I[B[IIIIIII)V")
    private static final void method81(int[] arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        int var9 = -(arg5 >> 2);
        int var10 = -(arg5 & 0x3);
        for (int var11 = -arg6; var11 < 0; var11++) {
            for (int var12 = var9; var12 < 0; var12++) {
                byte var15 = arg1[arg3++];
                if (var15 == 0) {
                    arg4++;
                } else {
                    arg0[arg4++] = arg2[var15 & 0xFF];
                }
                byte var16 = arg1[arg3++];
                if (var16 == 0) {
                    arg4++;
                } else {
                    arg0[arg4++] = arg2[var16 & 0xFF];
                }
                byte var17 = arg1[arg3++];
                if (var17 == 0) {
                    arg4++;
                } else {
                    arg0[arg4++] = arg2[var17 & 0xFF];
                }
                byte var18 = arg1[arg3++];
                if (var18 == 0) {
                    arg4++;
                } else {
                    arg0[arg4++] = arg2[var18 & 0xFF];
                }
            }
            for (int var13 = var10; var13 < 0; var13++) {
                byte var14 = arg1[arg3++];
                if (var14 == 0) {
                    arg4++;
                } else {
                    arg0[arg4++] = arg2[var14 & 0xFF];
                }
            }
            arg4 += arg7;
            arg3 += arg8;
        }
    }

    @OriginalMember(owner = "client!cb", name = "g", descriptor = "()Lcb;")
    public final class15 method82() {
        class15 var1 = new class15(this.field275, this.field280, this.field279.length);
        var1.field277 = this.field277;
        var1.field278 = this.field278;
        var1.field274 = this.field274;
        var1.field276 = this.field276;
        int var2 = this.field273.length;
        for (int var3 = 0; var3 < var2; var3++) {
            var1.field273[var3] = this.field273[var3];
        }
        int var4 = this.field279.length;
        for (int var5 = 0; var5 < var4; var5++) {
            var1.field279[var5] = this.field279[var5];
        }
        return var1;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(III)V")
    public final void method83(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field279.length; var4++) {
            int var5 = this.field279[var4] >> 16 & 0xFF;
            int var6 = arg0 + var5;
            if (var6 < 0) {
                var6 = 0;
            } else if (var6 > 255) {
                var6 = 255;
            }
            int var7 = this.field279[var4] >> 8 & 0xFF;
            int var8 = arg1 + var7;
            if (var8 < 0) {
                var8 = 0;
            } else if (var8 > 255) {
                var8 = 255;
            }
            int var9 = this.field279[var4] & 0xFF;
            int var10 = arg2 + var9;
            if (var10 < 0) {
                var10 = 0;
            } else if (var10 > 255) {
                var10 = 255;
            }
            this.field279[var4] = (var6 << 16) + (var8 << 8) + var10;
        }
    }

    @OriginalMember(owner = "client!cb", name = "<init>", descriptor = "()V")
    public class15() {
    }

    @OriginalMember(owner = "client!cb", name = "<init>", descriptor = "(III)V")
    private class15(int arg0, int arg1, int arg2) {
        this.field277 = this.field275 = arg0;
        this.field278 = this.field280 = arg1;
        this.field274 = this.field276 = 0;
        this.field273 = new byte[arg0 * arg1];
        this.field279 = new int[arg2];
    }
}
