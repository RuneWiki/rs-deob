import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("HQETDHHW")
public class class20 extends class23 {

    @OriginalMember(owner = "HQETDHHW", name = "w", descriptor = "I")
    private int field741 = 192;

    @OriginalMember(owner = "HQETDHHW", name = "x", descriptor = "Z")
    private boolean field742 = false;

    @OriginalMember(owner = "HQETDHHW", name = "y", descriptor = "Z")
    private boolean field743 = false;

    @OriginalMember(owner = "HQETDHHW", name = "z", descriptor = "I")
    private int field744 = 821;

    @OriginalMember(owner = "HQETDHHW", name = "A", descriptor = "I")
    private int field745 = 1519;

    @OriginalMember(owner = "HQETDHHW", name = "H", descriptor = "I")
    public int field752;

    @OriginalMember(owner = "HQETDHHW", name = "I", descriptor = "I")
    public int field753;

    @OriginalMember(owner = "HQETDHHW", name = "C", descriptor = "[I")
    public int[] field747;

    @OriginalMember(owner = "HQETDHHW", name = "F", descriptor = "I")
    public int field750;

    @OriginalMember(owner = "HQETDHHW", name = "G", descriptor = "I")
    public int field751;

    @OriginalMember(owner = "HQETDHHW", name = "D", descriptor = "I")
    public int field748;

    @OriginalMember(owner = "HQETDHHW", name = "E", descriptor = "I")
    public int field749;

    @OriginalMember(owner = "HQETDHHW", name = "B", descriptor = "[B")
    public byte[] field746;

    @OriginalMember(owner = "HQETDHHW", name = "<init>", descriptor = "(LCXFTMSCH;Ljava/lang/String;I)V")
    public class20(class8 arg0, String arg1, int arg2) {
        class33 var4 = new class33(true, arg0.method176(arg1 + ".dat", null));
        class33 var5 = new class33(true, arg0.method176("index.dat", null));
        var5.field945 = var4.method327();
        this.field752 = var5.method327();
        this.field753 = var5.method327();
        int var6 = var5.method325();
        this.field747 = new int[var6];
        for (int var7 = 0; var7 < var6 - 1; var7++) {
            this.field747[var7 + 1] = var5.method329();
        }
        for (int var8 = 0; var8 < arg2; var8++) {
            var5.field945 += 2;
            var4.field945 += var5.method327() * var5.method327();
            var5.field945++;
        }
        this.field750 = var5.method325();
        this.field751 = var5.method325();
        this.field748 = var5.method327();
        this.field749 = var5.method327();
        int var9 = var5.method325();
        int var10 = this.field749 * this.field748;
        this.field746 = new byte[var10];
        if (var9 == 0) {
            for (int var11 = 0; var11 < var10; var11++) {
                this.field746[var11] = var4.method326();
            }
        } else if (var9 == 1) {
            for (int var12 = 0; var12 < this.field748; var12++) {
                for (int var13 = 0; var13 < this.field749; var13++) {
                    this.field746[this.field748 * var13 + var12] = var4.method326();
                }
            }
        }
    }

    @OriginalMember(owner = "HQETDHHW", name = "b", descriptor = "(I)V")
    public void method241(int arg0) {
        if (arg0 >= 0) {
            return;
        }
        this.field752 /= 2;
        this.field753 /= 2;
        byte[] var2 = new byte[this.field753 * this.field752];
        int var3 = 0;
        for (int var4 = 0; var4 < this.field749; var4++) {
            for (int var5 = 0; var5 < this.field748; var5++) {
                var2[(this.field750 + var5 >> 1) + (this.field751 + var4 >> 1) * this.field752] = this.field746[var3++];
            }
        }
        this.field746 = var2;
        this.field748 = this.field752;
        this.field749 = this.field753;
        this.field750 = 0;
        this.field751 = 0;
    }

    @OriginalMember(owner = "HQETDHHW", name = "c", descriptor = "(I)V")
    public void method242(int arg0) {
        if (this.field752 == this.field748 && this.field753 == this.field749) {
            return;
        }
        byte[] var2 = new byte[this.field753 * this.field752];
        int var3 = 0;
        for (int var4 = 0; var4 < this.field749; var4++) {
            for (int var5 = 0; var5 < this.field748; var5++) {
                var2[(this.field751 + var4) * this.field752 + this.field750 + var5] = this.field746[var3++];
            }
        }
        this.field746 = var2;
        this.field748 = this.field752;
        this.field749 = this.field753;
        this.field750 = 0;
        if (arg0 == 1) {
            this.field751 = 0;
        }
    }

    @OriginalMember(owner = "HQETDHHW", name = "d", descriptor = "(I)V")
    public void method243(int arg0) {
        byte[] var2 = new byte[this.field749 * this.field748];
        int var3 = 0;
        if (arg0 != 1) {
            return;
        }
        for (int var4 = 0; var4 < this.field749; var4++) {
            for (int var5 = this.field748 - 1; var5 >= 0; var5--) {
                var2[var3++] = this.field746[this.field748 * var4 + var5];
            }
        }
        this.field746 = var2;
        this.field750 = this.field752 - this.field748 - this.field750;
    }

    @OriginalMember(owner = "HQETDHHW", name = "b", descriptor = "(B)V")
    public void method244(byte arg0) {
        byte[] var2 = new byte[this.field749 * this.field748];
        int var3 = 0;
        for (int var4 = this.field749 - 1; var4 >= 0; var4--) {
            for (int var5 = 0; var5 < this.field748; var5++) {
                var2[var3++] = this.field746[this.field748 * var4 + var5];
            }
        }
        if (arg0 != 85) {
            this.field743 = !this.field743;
        }
        this.field746 = var2;
        this.field751 = this.field753 - this.field749 - this.field751;
    }

    @OriginalMember(owner = "HQETDHHW", name = "a", descriptor = "(IIIB)V")
    public void method245(int arg0, int arg1, int arg2, byte arg3) {
        for (int var5 = 0; var5 < this.field747.length; var5++) {
            int var7 = this.field747[var5] >> 16 & 0xFF;
            int var8 = arg1 + var7;
            if (var8 < 0) {
                var8 = 0;
            } else if (var8 > 255) {
                var8 = 255;
            }
            int var9 = this.field747[var5] >> 8 & 0xFF;
            int var10 = arg2 + var9;
            if (var10 < 0) {
                var10 = 0;
            } else if (var10 > 255) {
                var10 = 255;
            }
            int var11 = this.field747[var5] & 0xFF;
            int var12 = arg0 + var11;
            if (var12 < 0) {
                var12 = 0;
            } else if (var12 > 255) {
                var12 = 255;
            }
            this.field747[var5] = (var8 << 16) + (var10 << 8) + var12;
        }
        if (arg3 != -65) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
    }

    @OriginalMember(owner = "HQETDHHW", name = "a", descriptor = "(III)V")
    public void method246(int arg0, int arg1, int arg2) {
        int var4 = this.field750 + arg0;
        int var5 = this.field751 + arg1;
        int var6 = class23.field783 * var5 + var4;
        int var7 = 0;
        int var8 = this.field749;
        int var9 = this.field748;
        int var10 = class23.field783 - var9;
        int var11 = 0;
        if (arg2 < 2 || arg2 > 2) {
            for (int var12 = 1; var12 > 0; var12++) {
            }
        }
        if (var5 < class23.field785) {
            int var13 = class23.field785 - var5;
            var8 -= var13;
            var5 = class23.field785;
            var7 += var9 * var13;
            var6 += class23.field783 * var13;
        }
        if (var5 + var8 > class23.field786) {
            var8 -= var5 + var8 - class23.field786;
        }
        if (var4 < class23.field787) {
            int var14 = class23.field787 - var4;
            var9 -= var14;
            var4 = class23.field787;
            var7 += var14;
            var6 += var14;
            var11 += var14;
            var10 += var14;
        }
        if (var4 + var9 > class23.field788) {
            int var15 = var4 + var9 - class23.field788;
            var9 -= var15;
            var11 += var15;
            var10 += var15;
        }
        if (var9 > 0 && var8 > 0) {
            this.method247(this.field747, var8, var9, class23.field782, var11, var10, var6, var7, true, this.field746);
        }
    }

    @OriginalMember(owner = "HQETDHHW", name = "a", descriptor = "([III[IIIIIZ[B)V")
    private void method247(int[] arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, byte[] arg9) {
        int var11 = -(arg2 >> 2);
        if (!arg8) {
            return;
        }
        int var12 = -(arg2 & 0x3);
        for (int var13 = -arg1; var13 < 0; var13++) {
            for (int var14 = var11; var14 < 0; var14++) {
                byte var17 = arg9[arg7++];
                if (var17 == 0) {
                    arg6++;
                } else {
                    arg3[arg6++] = arg0[var17 & 0xFF];
                }
                byte var18 = arg9[arg7++];
                if (var18 == 0) {
                    arg6++;
                } else {
                    arg3[arg6++] = arg0[var18 & 0xFF];
                }
                byte var19 = arg9[arg7++];
                if (var19 == 0) {
                    arg6++;
                } else {
                    arg3[arg6++] = arg0[var19 & 0xFF];
                }
                byte var20 = arg9[arg7++];
                if (var20 == 0) {
                    arg6++;
                } else {
                    arg3[arg6++] = arg0[var20 & 0xFF];
                }
            }
            for (int var15 = var12; var15 < 0; var15++) {
                byte var16 = arg9[arg7++];
                if (var16 == 0) {
                    arg6++;
                } else {
                    arg3[arg6++] = arg0[var16 & 0xFF];
                }
            }
            arg6 += arg5;
            arg7 += arg4;
        }
    }
}
