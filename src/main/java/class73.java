import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kd")
public class class73 extends class8 {

    @OriginalMember(owner = "client!kd", name = "Y", descriptor = "I")
    public int field1589;

    @OriginalMember(owner = "client!kd", name = "Z", descriptor = "I")
    public int field1590;

    @OriginalMember(owner = "client!kd", name = "bb", descriptor = "I")
    public int field1592;

    @OriginalMember(owner = "client!kd", name = "cb", descriptor = "I")
    public int field1593;

    @OriginalMember(owner = "client!kd", name = "db", descriptor = "I")
    public int field1594;

    @OriginalMember(owner = "client!kd", name = "fb", descriptor = "I")
    public int field1596;

    @OriginalMember(owner = "client!kd", name = "ab", descriptor = "[B")
    public byte[] field1591;

    @OriginalMember(owner = "client!kd", name = "eb", descriptor = "[I")
    public int[] field1595;

    @OriginalMember(owner = "client!kd", name = "d", descriptor = "()V")
    public final void method530() {
        if (this.field1594 == this.field1592 && this.field1593 == this.field1590) {
            return;
        }
        byte[] var1 = new byte[this.field1594 * this.field1593];
        int var2 = 0;
        for (int var3 = 0; var3 < this.field1590; var3++) {
            for (int var4 = 0; var4 < this.field1592; var4++) {
                var1[(this.field1596 + var3) * this.field1594 + this.field1589 + var4] = this.field1591[var2++];
            }
        }
        this.field1591 = var1;
        this.field1592 = this.field1594;
        this.field1590 = this.field1593;
        this.field1589 = 0;
        this.field1596 = 0;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(II)V")
    public final void method531(int arg0, int arg1) {
        int var3 = this.field1589 + arg0;
        int var4 = this.field1596 + arg1;
        int var5 = class8.field154 * var4 + var3;
        int var6 = 0;
        int var7 = this.field1590;
        int var8 = this.field1592;
        int var9 = class8.field154 - var8;
        int var10 = 0;
        if (var4 < class8.field155) {
            int var11 = class8.field155 - var4;
            var7 -= var11;
            var4 = class8.field155;
            var6 += var8 * var11;
            var5 += class8.field154 * var11;
        }
        if (var4 + var7 > class8.field150) {
            var7 -= var4 + var7 - class8.field150;
        }
        if (var3 < class8.field151) {
            int var12 = class8.field151 - var3;
            var8 -= var12;
            var3 = class8.field151;
            var6 += var12;
            var5 += var12;
            var10 += var12;
            var9 += var12;
        }
        if (var3 + var8 > class8.field156) {
            int var13 = var3 + var8 - class8.field156;
            var8 -= var13;
            var10 += var13;
            var9 += var13;
        }
        if (var8 > 0 && var7 > 0) {
            method533(class8.field152, this.field1591, this.field1595, var6, var5, var8, var7, var9, var10);
        }
    }

    @OriginalMember(owner = "client!kd", name = "c", descriptor = "(III)V")
    public final void method532(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1595.length; var4++) {
            int var5 = this.field1595[var4] >> 16 & 0xFF;
            int var6 = arg0 + var5;
            if (var6 < 0) {
                var6 = 0;
            } else if (var6 > 255) {
                var6 = 255;
            }
            int var7 = this.field1595[var4] >> 8 & 0xFF;
            int var8 = arg1 + var7;
            if (var8 < 0) {
                var8 = 0;
            } else if (var8 > 255) {
                var8 = 255;
            }
            int var9 = this.field1595[var4] & 0xFF;
            int var10 = arg2 + var9;
            if (var10 < 0) {
                var10 = 0;
            } else if (var10 > 255) {
                var10 = 255;
            }
            this.field1595[var4] = (var6 << 16) + (var8 << 8) + var10;
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "([I[B[IIIIIII)V")
    private static final void method533(int[] arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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
}
