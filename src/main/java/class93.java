import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public class class93 extends class59 {

    @OriginalMember(owner = "client!oa", name = "mb", descriptor = "I")
    public int field2174;

    @OriginalMember(owner = "client!oa", name = "gb", descriptor = "I")
    public int field2168;

    @OriginalMember(owner = "client!oa", name = "nb", descriptor = "I")
    public int field2175;

    @OriginalMember(owner = "client!oa", name = "lb", descriptor = "I")
    public int field2173;

    @OriginalMember(owner = "client!oa", name = "kb", descriptor = "I")
    public int field2172;

    @OriginalMember(owner = "client!oa", name = "hb", descriptor = "I")
    public int field2169;

    @OriginalMember(owner = "client!oa", name = "jb", descriptor = "[B")
    public byte[] field2171;

    @OriginalMember(owner = "client!oa", name = "ib", descriptor = "[I")
    public int[] field2170;

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(III)V")
    public final void method720(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field2170.length; var4++) {
            int var5 = this.field2170[var4] >> 16 & 0xFF;
            int var6 = arg0 + var5;
            if (var6 < 0) {
                var6 = 0;
            } else if (var6 > 255) {
                var6 = 255;
            }
            int var7 = this.field2170[var4] >> 8 & 0xFF;
            int var8 = arg1 + var7;
            if (var8 < 0) {
                var8 = 0;
            } else if (var8 > 255) {
                var8 = 255;
            }
            int var9 = this.field2170[var4] & 0xFF;
            int var10 = arg2 + var9;
            if (var10 < 0) {
                var10 = 0;
            } else if (var10 > 255) {
                var10 = 255;
            }
            this.field2170[var4] = (var6 << 16) + (var8 << 8) + var10;
        }
    }

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "()Loa;")
    public final class93 method721() {
        class93 var1 = new class93(this.field2174, this.field2175, this.field2170.length);
        var1.field2168 = this.field2168;
        var1.field2173 = this.field2173;
        var1.field2169 = this.field2169;
        var1.field2172 = this.field2172;
        int var2 = this.field2171.length;
        for (int var3 = 0; var3 < var2; var3++) {
            var1.field2171[var3] = this.field2171[var3];
        }
        int var4 = this.field2170.length;
        for (int var5 = 0; var5 < var4; var5++) {
            var1.field2170[var5] = this.field2170[var5];
        }
        return var1;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(II)V")
    public final void method722(int arg0, int arg1) {
        int var3 = this.field2169 + arg0;
        int var4 = this.field2172 + arg1;
        int var5 = class59.field1218 * var4 + var3;
        int var6 = 0;
        int var7 = this.field2175;
        int var8 = this.field2174;
        int var9 = class59.field1218 - var8;
        int var10 = 0;
        if (var4 < class59.field1214) {
            int var11 = class59.field1214 - var4;
            var7 -= var11;
            var4 = class59.field1214;
            var6 += var8 * var11;
            var5 += class59.field1218 * var11;
        }
        if (var4 + var7 > class59.field1216) {
            var7 -= var4 + var7 - class59.field1216;
        }
        if (var3 < class59.field1213) {
            int var12 = class59.field1213 - var3;
            var8 -= var12;
            var3 = class59.field1213;
            var6 += var12;
            var5 += var12;
            var10 += var12;
            var9 += var12;
        }
        if (var3 + var8 > class59.field1212) {
            int var13 = var3 + var8 - class59.field1212;
            var8 -= var13;
            var10 += var13;
            var9 += var13;
        }
        if (var8 > 0 && var7 > 0) {
            method726(class59.field1215, this.field2171, this.field2170, var6, var5, var8, var7, var9, var10);
        }
    }

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "()V")
    public final void method723() {
        byte[] var1 = new byte[this.field2175 * this.field2174];
        int var2 = 0;
        for (int var3 = this.field2175 - 1; var3 >= 0; var3--) {
            for (int var4 = 0; var4 < this.field2174; var4++) {
                var1[var2++] = this.field2171[this.field2174 * var3 + var4];
            }
        }
        this.field2171 = var1;
        this.field2172 = this.field2173 - this.field2175 - this.field2172;
    }

    @OriginalMember(owner = "client!oa", name = "f", descriptor = "()V")
    public final void method724() {
        if (this.field2174 == this.field2168 && this.field2175 == this.field2173) {
            return;
        }
        byte[] var1 = new byte[this.field2173 * this.field2168];
        int var2 = 0;
        for (int var3 = 0; var3 < this.field2175; var3++) {
            for (int var4 = 0; var4 < this.field2174; var4++) {
                var1[(this.field2172 + var3) * this.field2168 + this.field2169 + var4] = this.field2171[var2++];
            }
        }
        this.field2171 = var1;
        this.field2174 = this.field2168;
        this.field2175 = this.field2173;
        this.field2169 = 0;
        this.field2172 = 0;
    }

    @OriginalMember(owner = "client!oa", name = "<init>", descriptor = "()V")
    public class93() {
    }

    @OriginalMember(owner = "client!oa", name = "g", descriptor = "()V")
    public final void method725() {
        byte[] var1 = new byte[this.field2175 * this.field2174];
        int var2 = 0;
        for (int var3 = 0; var3 < this.field2175; var3++) {
            for (int var4 = this.field2174 - 1; var4 >= 0; var4--) {
                var1[var2++] = this.field2171[this.field2174 * var3 + var4];
            }
        }
        this.field2171 = var1;
        this.field2169 = this.field2168 - this.field2174 - this.field2169;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "([I[B[IIIIIII)V")
    private static final void method726(int[] arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @OriginalMember(owner = "client!oa", name = "<init>", descriptor = "(III)V")
    private class93(int arg0, int arg1, int arg2) {
        this.field2168 = this.field2174 = arg0;
        this.field2173 = this.field2175 = arg1;
        this.field2169 = this.field2172 = 0;
        this.field2171 = new byte[arg0 * arg1];
        this.field2170 = new int[arg2];
    }
}
