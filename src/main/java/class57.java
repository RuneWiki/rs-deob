import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public class class57 extends class62 {

    @OriginalMember(owner = "client!ia", name = "W", descriptor = "I")
    public int field1205;

    @OriginalMember(owner = "client!ia", name = "Z", descriptor = "I")
    public int field1208;

    @OriginalMember(owner = "client!ia", name = "X", descriptor = "I")
    public int field1206;

    @OriginalMember(owner = "client!ia", name = "bb", descriptor = "I")
    public int field1210;

    @OriginalMember(owner = "client!ia", name = "cb", descriptor = "I")
    public int field1211;

    @OriginalMember(owner = "client!ia", name = "Y", descriptor = "I")
    public int field1207;

    @OriginalMember(owner = "client!ia", name = "V", descriptor = "[B")
    public byte[] field1204;

    @OriginalMember(owner = "client!ia", name = "ab", descriptor = "[I")
    public int[] field1209;

    @OriginalMember(owner = "client!ia", name = "d", descriptor = "()Lia;")
    public final class57 method389() {
        class57 var1 = new class57(this.field1205, this.field1206, this.field1209.length);
        var1.field1208 = this.field1208;
        var1.field1210 = this.field1210;
        var1.field1207 = this.field1207;
        var1.field1211 = this.field1211;
        int var2 = this.field1204.length;
        for (int var3 = 0; var3 < var2; var3++) {
            var1.field1204[var3] = this.field1204[var3];
        }
        int var4 = this.field1209.length;
        for (int var5 = 0; var5 < var4; var5++) {
            var1.field1209[var5] = this.field1209[var5];
        }
        return var1;
    }

    @OriginalMember(owner = "client!ia", name = "e", descriptor = "()V")
    public final void method390() {
        if (this.field1208 == this.field1205 && this.field1210 == this.field1206) {
            return;
        }
        byte[] var1 = new byte[this.field1210 * this.field1208];
        int var2 = 0;
        for (int var3 = 0; var3 < this.field1206; var3++) {
            for (int var4 = 0; var4 < this.field1205; var4++) {
                var1[(this.field1211 + var3) * this.field1208 + this.field1207 + var4] = this.field1204[var2++];
            }
        }
        this.field1204 = var1;
        this.field1205 = this.field1208;
        this.field1206 = this.field1210;
        this.field1207 = 0;
        this.field1211 = 0;
    }

    @OriginalMember(owner = "client!ia", name = "f", descriptor = "()V")
    public final void method391() {
        byte[] var1 = new byte[this.field1206 * this.field1205];
        int var2 = 0;
        for (int var3 = 0; var3 < this.field1206; var3++) {
            for (int var4 = this.field1205 - 1; var4 >= 0; var4--) {
                var1[var2++] = this.field1204[this.field1205 * var3 + var4];
            }
        }
        this.field1204 = var1;
        this.field1207 = this.field1208 - this.field1205 - this.field1207;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "([I[B[IIIIIII)V")
    private static final void method392(int[] arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @OriginalMember(owner = "client!ia", name = "g", descriptor = "()V")
    public final void method393() {
        byte[] var1 = new byte[this.field1206 * this.field1205];
        int var2 = 0;
        for (int var3 = this.field1206 - 1; var3 >= 0; var3--) {
            for (int var4 = 0; var4 < this.field1205; var4++) {
                var1[var2++] = this.field1204[this.field1205 * var3 + var4];
            }
        }
        this.field1204 = var1;
        this.field1211 = this.field1210 - this.field1206 - this.field1211;
    }

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "(II)V")
    public final void method394(int arg0, int arg1) {
        int var3 = this.field1207 + arg0;
        int var4 = this.field1211 + arg1;
        int var5 = class62.field1335 * var4 + var3;
        int var6 = 0;
        int var7 = this.field1206;
        int var8 = this.field1205;
        int var9 = class62.field1335 - var8;
        int var10 = 0;
        if (var4 < class62.field1330) {
            int var11 = class62.field1330 - var4;
            var7 -= var11;
            var4 = class62.field1330;
            var6 += var8 * var11;
            var5 += class62.field1335 * var11;
        }
        if (var4 + var7 > class62.field1334) {
            var7 -= var4 + var7 - class62.field1334;
        }
        if (var3 < class62.field1332) {
            int var12 = class62.field1332 - var3;
            var8 -= var12;
            var3 = class62.field1332;
            var6 += var12;
            var5 += var12;
            var10 += var12;
            var9 += var12;
        }
        if (var3 + var8 > class62.field1333) {
            int var13 = var3 + var8 - class62.field1333;
            var8 -= var13;
            var10 += var13;
            var9 += var13;
        }
        if (var8 > 0 && var7 > 0) {
            method392(class62.field1331, this.field1204, this.field1209, var6, var5, var8, var7, var9, var10);
        }
    }

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "(III)V")
    public final void method395(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1209.length; var4++) {
            int var5 = this.field1209[var4] >> 16 & 0xFF;
            int var6 = arg0 + var5;
            if (var6 < 0) {
                var6 = 0;
            } else if (var6 > 255) {
                var6 = 255;
            }
            int var7 = this.field1209[var4] >> 8 & 0xFF;
            int var8 = arg1 + var7;
            if (var8 < 0) {
                var8 = 0;
            } else if (var8 > 255) {
                var8 = 255;
            }
            int var9 = this.field1209[var4] & 0xFF;
            int var10 = arg2 + var9;
            if (var10 < 0) {
                var10 = 0;
            } else if (var10 > 255) {
                var10 = 255;
            }
            this.field1209[var4] = (var6 << 16) + (var8 << 8) + var10;
        }
    }

    @OriginalMember(owner = "client!ia", name = "<init>", descriptor = "()V")
    public class57() {
    }

    @OriginalMember(owner = "client!ia", name = "<init>", descriptor = "(III)V")
    private class57(int arg0, int arg1, int arg2) {
        this.field1208 = this.field1205 = arg0;
        this.field1210 = this.field1206 = arg1;
        this.field1207 = this.field1211 = 0;
        this.field1204 = new byte[arg0 * arg1];
        this.field1209 = new int[arg2];
    }
}
