import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!q")
public class class114 extends class19 {

    @OriginalMember(owner = "client!q", name = "db", descriptor = "I")
    public int field2619;

    @OriginalMember(owner = "client!q", name = "fb", descriptor = "I")
    public int field2621;

    @OriginalMember(owner = "client!q", name = "gb", descriptor = "I")
    public int field2622;

    @OriginalMember(owner = "client!q", name = "hb", descriptor = "I")
    public int field2623;

    @OriginalMember(owner = "client!q", name = "ib", descriptor = "I")
    public int field2624;

    @OriginalMember(owner = "client!q", name = "jb", descriptor = "I")
    public int field2625;

    @OriginalMember(owner = "client!q", name = "eb", descriptor = "[B")
    public byte[] field2620;

    @OriginalMember(owner = "client!q", name = "cb", descriptor = "[I")
    public int[] field2618;

    @OriginalMember(owner = "client!q", name = "d", descriptor = "(II)V")
    public final void method932(int arg0, int arg1) {
        int var3 = this.field2623 + arg0;
        int var4 = this.field2619 + arg1;
        int var5 = class19.field424 * var4 + var3;
        int var6 = 0;
        int var7 = this.field2624;
        int var8 = this.field2625;
        int var9 = class19.field424 - var8;
        int var10 = 0;
        if (var4 < class19.field425) {
            int var11 = class19.field425 - var4;
            var7 -= var11;
            var4 = class19.field425;
            var6 += var8 * var11;
            var5 += class19.field424 * var11;
        }
        if (var4 + var7 > class19.field426) {
            var7 -= var4 + var7 - class19.field426;
        }
        if (var3 < class19.field428) {
            int var12 = class19.field428 - var3;
            var8 -= var12;
            var3 = class19.field428;
            var6 += var12;
            var5 += var12;
            var10 += var12;
            var9 += var12;
        }
        if (var3 + var8 > class19.field422) {
            int var13 = var3 + var8 - class19.field422;
            var8 -= var13;
            var10 += var13;
            var9 += var13;
        }
        if (var8 > 0 && var7 > 0) {
            method934(class19.field423, this.field2620, this.field2618, var6, var5, var8, var7, var9, var10);
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(III)V")
    public final void method933(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field2618.length; var4++) {
            int var5 = this.field2618[var4] >> 16 & 0xFF;
            int var6 = arg0 + var5;
            if (var6 < 0) {
                var6 = 0;
            } else if (var6 > 255) {
                var6 = 255;
            }
            int var7 = this.field2618[var4] >> 8 & 0xFF;
            int var8 = arg1 + var7;
            if (var8 < 0) {
                var8 = 0;
            } else if (var8 > 255) {
                var8 = 255;
            }
            int var9 = this.field2618[var4] & 0xFF;
            int var10 = arg2 + var9;
            if (var10 < 0) {
                var10 = 0;
            } else if (var10 > 255) {
                var10 = 255;
            }
            this.field2618[var4] = (var6 << 16) + (var8 << 8) + var10;
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "([I[B[IIIIIII)V")
    private static final void method934(int[] arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @OriginalMember(owner = "client!q", name = "d", descriptor = "()V")
    public final void method935() {
        if (this.field2625 == this.field2621 && this.field2624 == this.field2622) {
            return;
        }
        byte[] var1 = new byte[this.field2622 * this.field2621];
        int var2 = 0;
        for (int var3 = 0; var3 < this.field2624; var3++) {
            for (int var4 = 0; var4 < this.field2625; var4++) {
                var1[(this.field2619 + var3) * this.field2621 + this.field2623 + var4] = this.field2620[var2++];
            }
        }
        this.field2620 = var1;
        this.field2625 = this.field2621;
        this.field2624 = this.field2622;
        this.field2623 = 0;
        this.field2619 = 0;
    }
}
