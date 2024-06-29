import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public class class100 extends class7 {

    @OriginalMember(owner = "client!oc", name = "ib", descriptor = "I")
    public int field2325;

    @OriginalMember(owner = "client!oc", name = "gb", descriptor = "I")
    public int field2323;

    @OriginalMember(owner = "client!oc", name = "lb", descriptor = "I")
    public int field2328;

    @OriginalMember(owner = "client!oc", name = "kb", descriptor = "I")
    public int field2327;

    @OriginalMember(owner = "client!oc", name = "hb", descriptor = "I")
    public int field2324;

    @OriginalMember(owner = "client!oc", name = "fb", descriptor = "I")
    public int field2322;

    @OriginalMember(owner = "client!oc", name = "jb", descriptor = "[B")
    public byte[] field2326;

    @OriginalMember(owner = "client!oc", name = "eb", descriptor = "[I")
    public int[] field2321;

    @OriginalMember(owner = "client!oc", name = "d", descriptor = "()V")
    public final void method826() {
        byte[] var1 = new byte[this.field2328 * this.field2325];
        int var2 = 0;
        for (int var3 = this.field2328 - 1; var3 >= 0; var3--) {
            for (int var4 = 0; var4 < this.field2325; var4++) {
                var1[var2++] = this.field2326[this.field2325 * var3 + var4];
            }
        }
        this.field2326 = var1;
        this.field2324 = this.field2327 - this.field2328 - this.field2324;
    }

    @OriginalMember(owner = "client!oc", name = "e", descriptor = "()V")
    public final void method827() {
        byte[] var1 = new byte[this.field2328 * this.field2325];
        int var2 = 0;
        for (int var3 = 0; var3 < this.field2328; var3++) {
            for (int var4 = this.field2325 - 1; var4 >= 0; var4--) {
                var1[var2++] = this.field2326[this.field2325 * var3 + var4];
            }
        }
        this.field2326 = var1;
        this.field2322 = this.field2323 - this.field2325 - this.field2322;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(III)V")
    public final void method828(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field2321.length; var4++) {
            int var5 = this.field2321[var4] >> 16 & 0xFF;
            int var6 = arg0 + var5;
            if (var6 < 0) {
                var6 = 0;
            } else if (var6 > 255) {
                var6 = 255;
            }
            int var7 = this.field2321[var4] >> 8 & 0xFF;
            int var8 = arg1 + var7;
            if (var8 < 0) {
                var8 = 0;
            } else if (var8 > 255) {
                var8 = 255;
            }
            int var9 = this.field2321[var4] & 0xFF;
            int var10 = arg2 + var9;
            if (var10 < 0) {
                var10 = 0;
            } else if (var10 > 255) {
                var10 = 255;
            }
            this.field2321[var4] = (var6 << 16) + (var8 << 8) + var10;
        }
    }

    @OriginalMember(owner = "client!oc", name = "f", descriptor = "()V")
    public final void method829() {
        if (this.field2325 == this.field2323 && this.field2328 == this.field2327) {
            return;
        }
        byte[] var1 = new byte[this.field2327 * this.field2323];
        int var2 = 0;
        for (int var3 = 0; var3 < this.field2328; var3++) {
            for (int var4 = 0; var4 < this.field2325; var4++) {
                var1[(this.field2324 + var3) * this.field2323 + this.field2322 + var4] = this.field2326[var2++];
            }
        }
        this.field2326 = var1;
        this.field2325 = this.field2323;
        this.field2328 = this.field2327;
        this.field2322 = 0;
        this.field2324 = 0;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(II)V")
    public final void method830(int arg0, int arg1) {
        int var3 = this.field2322 + arg0;
        int var4 = this.field2324 + arg1;
        int var5 = class7.field119 * var4 + var3;
        int var6 = 0;
        int var7 = this.field2328;
        int var8 = this.field2325;
        int var9 = class7.field119 - var8;
        int var10 = 0;
        if (var4 < class7.field115) {
            int var11 = class7.field115 - var4;
            var7 -= var11;
            var4 = class7.field115;
            var6 += var8 * var11;
            var5 += class7.field119 * var11;
        }
        if (var4 + var7 > class7.field121) {
            var7 -= var4 + var7 - class7.field121;
        }
        if (var3 < class7.field118) {
            int var12 = class7.field118 - var3;
            var8 -= var12;
            var3 = class7.field118;
            var6 += var12;
            var5 += var12;
            var10 += var12;
            var9 += var12;
        }
        if (var3 + var8 > class7.field116) {
            int var13 = var3 + var8 - class7.field116;
            var8 -= var13;
            var10 += var13;
            var9 += var13;
        }
        if (var8 > 0 && var7 > 0) {
            method831(class7.field117, this.field2326, this.field2321, var6, var5, var8, var7, var9, var10);
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "([I[B[IIIIIII)V")
    private static final void method831(int[] arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @OriginalMember(owner = "client!oc", name = "g", descriptor = "()Loc;")
    public final class100 method832() {
        class100 var1 = new class100(this.field2325, this.field2328, this.field2321.length);
        var1.field2323 = this.field2323;
        var1.field2327 = this.field2327;
        var1.field2322 = this.field2322;
        var1.field2324 = this.field2324;
        int var2 = this.field2326.length;
        for (int var3 = 0; var3 < var2; var3++) {
            var1.field2326[var3] = this.field2326[var3];
        }
        int var4 = this.field2321.length;
        for (int var5 = 0; var5 < var4; var5++) {
            var1.field2321[var5] = this.field2321[var5];
        }
        return var1;
    }

    @OriginalMember(owner = "client!oc", name = "<init>", descriptor = "()V")
    public class100() {
    }

    @OriginalMember(owner = "client!oc", name = "<init>", descriptor = "(III)V")
    private class100(int arg0, int arg1, int arg2) {
        this.field2323 = this.field2325 = arg0;
        this.field2327 = this.field2328 = arg1;
        this.field2322 = this.field2324 = 0;
        this.field2326 = new byte[arg0 * arg1];
        this.field2321 = new int[arg2];
    }
}
