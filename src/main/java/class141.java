import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ue")
public class class141 extends class152 {

    @OriginalMember(owner = "client!ue", name = "U", descriptor = "I")
    public int field3543;

    @OriginalMember(owner = "client!ue", name = "Z", descriptor = "I")
    public int field3548;

    @OriginalMember(owner = "client!ue", name = "X", descriptor = "I")
    public int field3546;

    @OriginalMember(owner = "client!ue", name = "T", descriptor = "I")
    public int field3542;

    @OriginalMember(owner = "client!ue", name = "W", descriptor = "I")
    public int field3545;

    @OriginalMember(owner = "client!ue", name = "Y", descriptor = "I")
    public int field3547;

    @OriginalMember(owner = "client!ue", name = "V", descriptor = "[B")
    public byte[] field3544;

    @OriginalMember(owner = "client!ue", name = "ab", descriptor = "[I")
    public int[] field3549;

    @OriginalMember(owner = "client!ue", name = "d", descriptor = "()Lue;", line = 6)
    public final class141 method1150() {
        class141 var1 = new class141(this.field3543, this.field3546, this.field3549.length);
        var1.field3548 = this.field3548;
        var1.field3542 = this.field3542;
        var1.field3547 = this.field3547;
        var1.field3545 = this.field3545;
        int var2 = this.field3544.length;
        for (int var3 = 0; var3 < var2; var3++) {
            var1.field3544[var3] = this.field3544[var3];
        }
        int var4 = this.field3549.length;
        for (int var5 = 0; var5 < var4; var5++) {
            var1.field3549[var5] = this.field3549[var5];
        }
        return var1;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(III)V", line = 33)
    public final void method1151(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field3549.length; var4++) {
            int var5 = this.field3549[var4] >> 16 & 0xFF;
            int var6 = arg0 + var5;
            if (var6 < 0) {
                var6 = 0;
            } else if (var6 > 255) {
                var6 = 255;
            }
            int var7 = this.field3549[var4] >> 8 & 0xFF;
            int var8 = arg1 + var7;
            if (var8 < 0) {
                var8 = 0;
            } else if (var8 > 255) {
                var8 = 255;
            }
            int var9 = this.field3549[var4] & 0xFF;
            int var10 = arg2 + var9;
            if (var10 < 0) {
                var10 = 0;
            } else if (var10 > 255) {
                var10 = 255;
            }
            this.field3549[var4] = (var6 << 16) + (var8 << 8) + var10;
        }
    }

    @OriginalMember(owner = "client!ue", name = "e", descriptor = "()V", line = 74)
    public final void method1152() {
        byte[] var1 = new byte[this.field3546 * this.field3543];
        int var2 = 0;
        for (int var3 = 0; var3 < this.field3546; var3++) {
            for (int var4 = this.field3543 - 1; var4 >= 0; var4--) {
                var1[var2++] = this.field3544[this.field3543 * var3 + var4];
            }
        }
        this.field3544 = var1;
        this.field3547 = this.field3548 - this.field3543 - this.field3547;
    }

    @OriginalMember(owner = "client!ue", name = "f", descriptor = "()V", line = 96)
    public final void method1153() {
        if (this.field3548 == this.field3543 && this.field3546 == this.field3542) {
            return;
        }
        byte[] var1 = new byte[this.field3548 * this.field3542];
        int var2 = 0;
        for (int var3 = 0; var3 < this.field3546; var3++) {
            for (int var4 = 0; var4 < this.field3543; var4++) {
                var1[(this.field3545 + var3) * this.field3548 + this.field3547 + var4] = this.field3544[var2++];
            }
        }
        this.field3544 = var1;
        this.field3543 = this.field3548;
        this.field3546 = this.field3542;
        this.field3547 = 0;
        this.field3545 = 0;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "([I[B[IIIIIII)V", line = 137)
    private static final void method1154(int[] arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(II)V", line = 204)
    public final void method1155(int arg0, int arg1) {
        int var3 = this.field3547 + arg0;
        int var4 = this.field3545 + arg1;
        int var5 = class152.field3752 * var4 + var3;
        int var6 = 0;
        int var7 = this.field3546;
        int var8 = this.field3543;
        int var9 = class152.field3752 - var8;
        int var10 = 0;
        if (var4 < class152.field3753) {
            int var11 = class152.field3753 - var4;
            var7 -= var11;
            var4 = class152.field3753;
            var6 += var8 * var11;
            var5 += class152.field3752 * var11;
        }
        if (var4 + var7 > class152.field3756) {
            var7 -= var4 + var7 - class152.field3756;
        }
        if (var3 < class152.field3755) {
            int var12 = class152.field3755 - var3;
            var8 -= var12;
            var3 = class152.field3755;
            var6 += var12;
            var5 += var12;
            var10 += var12;
            var9 += var12;
        }
        if (var3 + var8 > class152.field3757) {
            int var13 = var3 + var8 - class152.field3757;
            var8 -= var13;
            var10 += var13;
            var9 += var13;
        }
        if (var8 > 0 && var7 > 0) {
            method1154(class152.field3754, this.field3544, this.field3549, var6, var5, var8, var7, var9, var10);
        }
    }

    @OriginalMember(owner = "client!ue", name = "g", descriptor = "()V", line = 259)
    public final void method1156() {
        byte[] var1 = new byte[this.field3546 * this.field3543];
        int var2 = 0;
        for (int var3 = this.field3546 - 1; var3 >= 0; var3--) {
            for (int var4 = 0; var4 < this.field3543; var4++) {
                var1[var2++] = this.field3544[this.field3543 * var3 + var4];
            }
        }
        this.field3544 = var1;
        this.field3545 = this.field3542 - this.field3546 - this.field3545;
    }

    @OriginalMember(owner = "client!ue", name = "<init>", descriptor = "()V", line = 286)
    public class141() {
    }

    @OriginalMember(owner = "client!ue", name = "<init>", descriptor = "(III)V", line = 288)
    private class141(int arg0, int arg1, int arg2) {
        this.field3548 = this.field3543 = arg0;
        this.field3542 = this.field3546 = arg1;
        this.field3547 = this.field3545 = 0;
        this.field3544 = new byte[arg0 * arg1];
        this.field3549 = new int[arg2];
    }
}
