import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("YAPSNHGU")
public class class71 extends class19 {

    @OriginalMember(owner = "YAPSNHGU", name = "x", descriptor = "Z")
    private boolean field1723 = false;

    @OriginalMember(owner = "YAPSNHGU", name = "y", descriptor = "I")
    private int field1724 = -673;

    @OriginalMember(owner = "YAPSNHGU", name = "z", descriptor = "I")
    private int field1725 = 9;

    @OriginalMember(owner = "YAPSNHGU", name = "A", descriptor = "Z")
    private boolean field1726 = true;

    @OriginalMember(owner = "YAPSNHGU", name = "H", descriptor = "I")
    public int field1733;

    @OriginalMember(owner = "YAPSNHGU", name = "I", descriptor = "I")
    public int field1734;

    @OriginalMember(owner = "YAPSNHGU", name = "C", descriptor = "[I")
    public int[] field1728;

    @OriginalMember(owner = "YAPSNHGU", name = "F", descriptor = "I")
    public int field1731;

    @OriginalMember(owner = "YAPSNHGU", name = "G", descriptor = "I")
    public int field1732;

    @OriginalMember(owner = "YAPSNHGU", name = "D", descriptor = "I")
    public int field1729;

    @OriginalMember(owner = "YAPSNHGU", name = "E", descriptor = "I")
    public int field1730;

    @OriginalMember(owner = "YAPSNHGU", name = "B", descriptor = "[B")
    public byte[] field1727;

    @OriginalMember(owner = "YAPSNHGU", name = "<init>", descriptor = "(LHRXSNEYZ;Ljava/lang/String;I)V")
    public class71(class26 arg0, String arg1, int arg2) {
        class31 var4 = new class31(arg0.method289(arg1 + ".dat", null), 8);
        class31 var5 = new class31(arg0.method289("index.dat", null), 8);
        var5.field901 = var4.method308();
        this.field1733 = var5.method308();
        this.field1734 = var5.method308();
        int var6 = var5.method306();
        this.field1728 = new int[var6];
        for (int var7 = 0; var7 < var6 - 1; var7++) {
            this.field1728[var7 + 1] = var5.method310();
        }
        for (int var8 = 0; var8 < arg2; var8++) {
            var5.field901 += 2;
            var4.field901 += var5.method308() * var5.method308();
            var5.field901++;
        }
        this.field1731 = var5.method306();
        this.field1732 = var5.method306();
        this.field1729 = var5.method308();
        this.field1730 = var5.method308();
        int var9 = var5.method306();
        int var10 = this.field1730 * this.field1729;
        this.field1727 = new byte[var10];
        if (var9 == 0) {
            for (int var11 = 0; var11 < var10; var11++) {
                this.field1727[var11] = var4.method307();
            }
        } else if (var9 == 1) {
            for (int var12 = 0; var12 < this.field1729; var12++) {
                for (int var13 = 0; var13 < this.field1730; var13++) {
                    this.field1727[this.field1729 * var13 + var12] = var4.method307();
                }
            }
        }
    }

    @OriginalMember(owner = "YAPSNHGU", name = "c", descriptor = "(Z)V")
    public void method582(boolean arg0) {
        this.field1733 /= 2;
        this.field1734 /= 2;
        byte[] var2 = new byte[this.field1734 * this.field1733];
        int var3 = 0;
        if (!arg0) {
            this.field1726 = !this.field1726;
        }
        for (int var4 = 0; var4 < this.field1730; var4++) {
            for (int var5 = 0; var5 < this.field1729; var5++) {
                var2[(this.field1731 + var5 >> 1) + (this.field1732 + var4 >> 1) * this.field1733] = this.field1727[var3++];
            }
        }
        this.field1727 = var2;
        this.field1729 = this.field1733;
        this.field1730 = this.field1734;
        this.field1731 = 0;
        this.field1732 = 0;
    }

    @OriginalMember(owner = "YAPSNHGU", name = "a", descriptor = "(I)V")
    public void method583(int arg0) {
        if (this.field1733 == this.field1729 && this.field1734 == this.field1730) {
            return;
        }
        byte[] var2 = new byte[this.field1734 * this.field1733];
        int var3 = 0;
        for (int var4 = 0; var4 < this.field1730; var4++) {
            for (int var5 = 0; var5 < this.field1729; var5++) {
                var2[(this.field1732 + var4) * this.field1733 + this.field1731 + var5] = this.field1727[var3++];
            }
        }
        this.field1727 = var2;
        if (arg0 < 0) {
            this.field1729 = this.field1733;
            this.field1730 = this.field1734;
            this.field1731 = 0;
            this.field1732 = 0;
        }
    }

    @OriginalMember(owner = "YAPSNHGU", name = "d", descriptor = "(Z)V")
    public void method584(boolean arg0) {
        byte[] var2 = new byte[this.field1730 * this.field1729];
        if (arg0) {
            this.field1725 = 207;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < this.field1730; var4++) {
            for (int var5 = this.field1729 - 1; var5 >= 0; var5--) {
                var2[var3++] = this.field1727[this.field1729 * var4 + var5];
            }
        }
        this.field1727 = var2;
        this.field1731 = this.field1733 - this.field1729 - this.field1731;
    }

    @OriginalMember(owner = "YAPSNHGU", name = "b", descriptor = "(I)V")
    public void method585(int arg0) {
        byte[] var2 = new byte[this.field1730 * this.field1729];
        int var3 = 0;
        if (arg0 != -25299) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        for (int var5 = this.field1730 - 1; var5 >= 0; var5--) {
            for (int var6 = 0; var6 < this.field1729; var6++) {
                var2[var3++] = this.field1727[this.field1729 * var5 + var6];
            }
        }
        this.field1727 = var2;
        this.field1732 = this.field1734 - this.field1730 - this.field1732;
    }

    @OriginalMember(owner = "YAPSNHGU", name = "a", descriptor = "(IIII)V")
    public void method586(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 != 0) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        for (int var6 = 0; var6 < this.field1728.length; var6++) {
            int var7 = this.field1728[var6] >> 16 & 0xFF;
            int var8 = arg1 + var7;
            if (var8 < 0) {
                var8 = 0;
            } else if (var8 > 255) {
                var8 = 255;
            }
            int var9 = this.field1728[var6] >> 8 & 0xFF;
            int var10 = arg0 + var9;
            if (var10 < 0) {
                var10 = 0;
            } else if (var10 > 255) {
                var10 = 255;
            }
            int var11 = this.field1728[var6] & 0xFF;
            int var12 = arg3 + var11;
            if (var12 < 0) {
                var12 = 0;
            } else if (var12 > 255) {
                var12 = 255;
            }
            this.field1728[var6] = (var8 << 16) + (var10 << 8) + var12;
        }
    }

    @OriginalMember(owner = "YAPSNHGU", name = "a", descriptor = "(IIB)V")
    public void method587(int arg0, int arg1, byte arg2) {
        int var4 = this.field1731 + arg1;
        if (arg2 != 122) {
            return;
        }
        int var5 = this.field1732 + arg0;
        int var6 = class19.field685 * var5 + var4;
        int var7 = 0;
        int var8 = this.field1730;
        int var9 = this.field1729;
        int var10 = class19.field685 - var9;
        int var11 = 0;
        if (var5 < class19.field687) {
            int var12 = class19.field687 - var5;
            var8 -= var12;
            var5 = class19.field687;
            var7 += var9 * var12;
            var6 += class19.field685 * var12;
        }
        if (var5 + var8 > class19.field688) {
            var8 -= var5 + var8 - class19.field688;
        }
        if (var4 < class19.field689) {
            int var13 = class19.field689 - var4;
            var9 -= var13;
            var4 = class19.field689;
            var7 += var13;
            var6 += var13;
            var11 += var13;
            var10 += var13;
        }
        if (var4 + var9 > class19.field690) {
            int var14 = var4 + var9 - class19.field690;
            var9 -= var14;
            var11 += var14;
            var10 += var14;
        }
        if (var9 > 0 && var8 > 0) {
            this.method588(this.field1727, var11, var7, true, this.field1728, var6, class19.field684, var10, var8, var9);
        }
    }

    @OriginalMember(owner = "YAPSNHGU", name = "a", descriptor = "([BIIZ[II[IIII)V")
    private void method588(byte[] arg0, int arg1, int arg2, boolean arg3, int[] arg4, int arg5, int[] arg6, int arg7, int arg8, int arg9) {
        int var11 = -(arg9 >> 2);
        int var12 = -(arg9 & 0x3);
        if (!arg3) {
            return;
        }
        for (int var13 = -arg8; var13 < 0; var13++) {
            for (int var14 = var11; var14 < 0; var14++) {
                byte var17 = arg0[arg2++];
                if (var17 == 0) {
                    arg5++;
                } else {
                    arg6[arg5++] = arg4[var17 & 0xFF];
                }
                byte var18 = arg0[arg2++];
                if (var18 == 0) {
                    arg5++;
                } else {
                    arg6[arg5++] = arg4[var18 & 0xFF];
                }
                byte var19 = arg0[arg2++];
                if (var19 == 0) {
                    arg5++;
                } else {
                    arg6[arg5++] = arg4[var19 & 0xFF];
                }
                byte var20 = arg0[arg2++];
                if (var20 == 0) {
                    arg5++;
                } else {
                    arg6[arg5++] = arg4[var20 & 0xFF];
                }
            }
            for (int var15 = var12; var15 < 0; var15++) {
                byte var16 = arg0[arg2++];
                if (var16 == 0) {
                    arg5++;
                } else {
                    arg6[arg5++] = arg4[var16 & 0xFF];
                }
            }
            arg5 += arg7;
            arg2 += arg1;
        }
    }
}
