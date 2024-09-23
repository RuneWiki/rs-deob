import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("KZTQXFDC")
public class class23 extends class20 {

    @OriginalMember(owner = "KZTQXFDC", name = "x", descriptor = "Z")
    private boolean field972 = false;

    @OriginalMember(owner = "KZTQXFDC", name = "y", descriptor = "Z")
    private boolean field973 = true;

    @OriginalMember(owner = "KZTQXFDC", name = "z", descriptor = "Z")
    private boolean field974 = false;

    @OriginalMember(owner = "KZTQXFDC", name = "A", descriptor = "Z")
    private boolean field975 = false;

    @OriginalMember(owner = "KZTQXFDC", name = "B", descriptor = "I")
    private int field976 = -73;

    @OriginalMember(owner = "KZTQXFDC", name = "I", descriptor = "I")
    public int field983;

    @OriginalMember(owner = "KZTQXFDC", name = "J", descriptor = "I")
    public int field984;

    @OriginalMember(owner = "KZTQXFDC", name = "D", descriptor = "[I")
    public int[] field978;

    @OriginalMember(owner = "KZTQXFDC", name = "G", descriptor = "I")
    public int field981;

    @OriginalMember(owner = "KZTQXFDC", name = "H", descriptor = "I")
    public int field982;

    @OriginalMember(owner = "KZTQXFDC", name = "E", descriptor = "I")
    public int field979;

    @OriginalMember(owner = "KZTQXFDC", name = "F", descriptor = "I")
    public int field980;

    @OriginalMember(owner = "KZTQXFDC", name = "C", descriptor = "[B")
    public byte[] field977;

    @OriginalMember(owner = "KZTQXFDC", name = "<init>", descriptor = "(LDTIATKJO;Ljava/lang/String;I)V")
    public class23(class8 arg0, String arg1, int arg2) {
        class14 var4 = new class14(-527, arg0.method168(arg1 + ".dat", null));
        class14 var5 = new class14(-527, arg0.method168("index.dat", null));
        var5.field769 = var4.method204();
        this.field983 = var5.method204();
        this.field984 = var5.method204();
        int var6 = var5.method202();
        this.field978 = new int[var6];
        for (int var7 = 0; var7 < var6 - 1; var7++) {
            this.field978[var7 + 1] = var5.method206();
        }
        for (int var8 = 0; var8 < arg2; var8++) {
            var5.field769 += 2;
            var4.field769 += var5.method204() * var5.method204();
            var5.field769++;
        }
        this.field981 = var5.method202();
        this.field982 = var5.method202();
        this.field979 = var5.method204();
        this.field980 = var5.method204();
        int var9 = var5.method202();
        int var10 = this.field980 * this.field979;
        this.field977 = new byte[var10];
        if (var9 == 0) {
            for (int var11 = 0; var11 < var10; var11++) {
                this.field977[var11] = var4.method203();
            }
        } else {
            if (var9 == 1) {
                for (int var12 = 0; var12 < this.field979; var12++) {
                    for (int var13 = 0; var13 < this.field980; var13++) {
                        this.field977[this.field979 * var13 + var12] = var4.method203();
                    }
                }
            }
            if (class4.field57) {
            }
        }
    }

    @OriginalMember(owner = "KZTQXFDC", name = "c", descriptor = "(I)V")
    public void method295(int arg0) {
        this.field983 /= 2;
        if (arg0 != 7) {
            this.field976 = -400;
        }
        this.field984 /= 2;
        byte[] var2 = new byte[this.field984 * this.field983];
        int var3 = 0;
        for (int var4 = 0; var4 < this.field980; var4++) {
            for (int var5 = 0; var5 < this.field979; var5++) {
                var2[(this.field981 + var5 >> 1) + (this.field982 + var4 >> 1) * this.field983] = this.field977[var3++];
            }
        }
        this.field977 = var2;
        this.field979 = this.field983;
        this.field980 = this.field984;
        this.field981 = 0;
        this.field982 = 0;
    }

    @OriginalMember(owner = "KZTQXFDC", name = "d", descriptor = "(I)V")
    public void method296(int arg0) {
        if (this.field983 == this.field979 && this.field984 == this.field980) {
            return;
        }
        byte[] var2 = new byte[this.field984 * this.field983];
        int var3 = 0;
        for (int var4 = 0; var4 < this.field980; var4++) {
            for (int var5 = 0; var5 < this.field979; var5++) {
                var2[(this.field982 + var4) * this.field983 + this.field981 + var5] = this.field977[var3++];
            }
        }
        this.field977 = var2;
        this.field979 = this.field983;
        this.field980 = this.field984;
        this.field981 = 0;
        if (arg0 == -10722) {
            this.field982 = 0;
        }
    }

    @OriginalMember(owner = "KZTQXFDC", name = "e", descriptor = "(I)V")
    public void method297(int arg0) {
        if (arg0 != 5496) {
            return;
        }
        byte[] var2 = new byte[this.field980 * this.field979];
        int var3 = 0;
        for (int var4 = 0; var4 < this.field980; var4++) {
            for (int var5 = this.field979 - 1; var5 >= 0; var5--) {
                var2[var3++] = this.field977[this.field979 * var4 + var5];
            }
        }
        this.field977 = var2;
        this.field981 = this.field983 - this.field979 - this.field981;
    }

    @OriginalMember(owner = "KZTQXFDC", name = "a", descriptor = "(Z)V")
    public void method298(boolean arg0) {
        byte[] var2 = new byte[this.field980 * this.field979];
        if (!arg0) {
            return;
        }
        int var3 = 0;
        for (int var4 = this.field980 - 1; var4 >= 0; var4--) {
            for (int var5 = 0; var5 < this.field979; var5++) {
                var2[var3++] = this.field977[this.field979 * var4 + var5];
            }
        }
        this.field977 = var2;
        this.field982 = this.field984 - this.field980 - this.field982;
    }

    @OriginalMember(owner = "KZTQXFDC", name = "a", descriptor = "(IIII)V")
    public void method299(int arg0, int arg1, int arg2, int arg3) {
        for (int var5 = 0; var5 < this.field978.length; var5++) {
            int var6 = this.field978[var5] >> 16 & 0xFF;
            int var7 = arg1 + var6;
            if (var7 < 0) {
                var7 = 0;
            } else if (var7 > 255) {
                var7 = 255;
            }
            int var8 = this.field978[var5] >> 8 & 0xFF;
            int var9 = arg3 + var8;
            if (var9 < 0) {
                var9 = 0;
            } else if (var9 > 255) {
                var9 = 255;
            }
            int var10 = this.field978[var5] & 0xFF;
            int var11 = arg0 + var10;
            if (var11 < 0) {
                var11 = 0;
            } else if (var11 > 255) {
                var11 = 255;
            }
            this.field978[var5] = (var7 << 16) + (var9 << 8) + var11;
        }
        if (arg2 > 0) {
            ;
        }
    }

    @OriginalMember(owner = "KZTQXFDC", name = "a", descriptor = "(IZI)V")
    public void method300(int arg0, boolean arg1, int arg2) {
        int var4 = this.field981 + arg2;
        int var5 = this.field982 + arg0;
        int var6 = class20.field933 * var5 + var4;
        int var7 = 0;
        if (!arg1) {
            return;
        }
        int var8 = this.field980;
        int var9 = this.field979;
        int var10 = class20.field933 - var9;
        int var11 = 0;
        if (var5 < class20.field935) {
            int var12 = class20.field935 - var5;
            var8 -= var12;
            var5 = class20.field935;
            var7 += var9 * var12;
            var6 += class20.field933 * var12;
        }
        if (var5 + var8 > class20.field936) {
            var8 -= var5 + var8 - class20.field936;
        }
        if (var4 < class20.field937) {
            int var13 = class20.field937 - var4;
            var9 -= var13;
            var4 = class20.field937;
            var7 += var13;
            var6 += var13;
            var11 += var13;
            var10 += var13;
        }
        if (var4 + var9 > class20.field938) {
            int var14 = var4 + var9 - class20.field938;
            var9 -= var14;
            var11 += var14;
            var10 += var14;
        }
        if (var9 > 0 && var8 > 0) {
            this.method301(var11, var8, this.field977, this.field978, var10, class20.field932, var7, -22274, var6, var9);
        }
    }

    @OriginalMember(owner = "KZTQXFDC", name = "a", descriptor = "(II[B[II[IIIII)V")
    private void method301(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int[] arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg7 != -22274) {
            this.field976 = -306;
        }
        int var11 = -(arg9 >> 2);
        int var12 = -(arg9 & 0x3);
        for (int var13 = -arg1; var13 < 0; var13++) {
            for (int var14 = var11; var14 < 0; var14++) {
                byte var17 = arg2[arg6++];
                if (var17 == 0) {
                    arg8++;
                } else {
                    arg5[arg8++] = arg3[var17 & 0xFF];
                }
                byte var18 = arg2[arg6++];
                if (var18 == 0) {
                    arg8++;
                } else {
                    arg5[arg8++] = arg3[var18 & 0xFF];
                }
                byte var19 = arg2[arg6++];
                if (var19 == 0) {
                    arg8++;
                } else {
                    arg5[arg8++] = arg3[var19 & 0xFF];
                }
                byte var20 = arg2[arg6++];
                if (var20 == 0) {
                    arg8++;
                } else {
                    arg5[arg8++] = arg3[var20 & 0xFF];
                }
            }
            for (int var15 = var12; var15 < 0; var15++) {
                byte var16 = arg2[arg6++];
                if (var16 == 0) {
                    arg8++;
                } else {
                    arg5[arg8++] = arg3[var16 & 0xFF];
                }
            }
            arg8 += arg4;
            arg6 += arg0;
        }
    }
}
