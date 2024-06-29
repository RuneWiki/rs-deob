import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ITVAFKCK")
public class class22 extends class5 {

    @OriginalMember(owner = "client!ITVAFKCK", name = "z", descriptor = "Z")
    private boolean field728 = false;

    @OriginalMember(owner = "client!ITVAFKCK", name = "G", descriptor = "I")
    public int field735;

    @OriginalMember(owner = "client!ITVAFKCK", name = "H", descriptor = "I")
    public int field736;

    @OriginalMember(owner = "client!ITVAFKCK", name = "B", descriptor = "[I")
    public int[] field730;

    @OriginalMember(owner = "client!ITVAFKCK", name = "E", descriptor = "I")
    public int field733;

    @OriginalMember(owner = "client!ITVAFKCK", name = "F", descriptor = "I")
    public int field734;

    @OriginalMember(owner = "client!ITVAFKCK", name = "C", descriptor = "I")
    public int field731;

    @OriginalMember(owner = "client!ITVAFKCK", name = "D", descriptor = "I")
    public int field732;

    @OriginalMember(owner = "client!ITVAFKCK", name = "A", descriptor = "[B")
    public byte[] field729;

    @OriginalMember(owner = "client!ITVAFKCK", name = "<init>", descriptor = "(LAKPFVPPG;Ljava/lang/String;I)V")
    public class22(class2 arg0, String arg1, int arg2) {
        class13 var4 = new class13(arg0.method7(arg1 + ".dat", null), (byte) 3);
        class13 var5 = new class13(arg0.method7("index.dat", null), (byte) 3);
        var5.field643 = var4.method215();
        this.field735 = var5.method215();
        this.field736 = var5.method215();
        int var6 = var5.method213();
        this.field730 = new int[var6];
        for (int var7 = 0; var7 < var6 - 1; var7++) {
            this.field730[var7 + 1] = var5.method217();
        }
        for (int var8 = 0; var8 < arg2; var8++) {
            var5.field643 += 2;
            var4.field643 += var5.method215() * var5.method215();
            var5.field643++;
        }
        this.field733 = var5.method213();
        this.field734 = var5.method213();
        this.field731 = var5.method215();
        this.field732 = var5.method215();
        int var9 = var5.method213();
        int var10 = this.field732 * this.field731;
        this.field729 = new byte[var10];
        if (var9 == 0) {
            for (int var11 = 0; var11 < var10; var11++) {
                this.field729[var11] = var4.method214();
            }
        } else if (var9 == 1) {
            for (int var12 = 0; var12 < this.field731; var12++) {
                for (int var13 = 0; var13 < this.field732; var13++) {
                    this.field729[this.field731 * var13 + var12] = var4.method214();
                }
            }
        }
    }

    @OriginalMember(owner = "client!ITVAFKCK", name = "b", descriptor = "(B)V")
    public void method299(byte arg0) {
        this.field735 /= 2;
        this.field736 /= 2;
        byte[] var2 = new byte[this.field736 * this.field735];
        int var3 = 0;
        if (arg0 != 63) {
            this.field728 = !this.field728;
        }
        for (int var4 = 0; var4 < this.field732; var4++) {
            for (int var5 = 0; var5 < this.field731; var5++) {
                var2[(this.field733 + var5 >> 1) + (this.field734 + var4 >> 1) * this.field735] = this.field729[var3++];
            }
        }
        this.field729 = var2;
        this.field731 = this.field735;
        this.field732 = this.field736;
        this.field733 = 0;
        this.field734 = 0;
    }

    @OriginalMember(owner = "client!ITVAFKCK", name = "a", descriptor = "(I)V")
    public void method300(int arg0) {
        if (arg0 != 0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        if (this.field735 == this.field731 && this.field736 == this.field732) {
            return;
        }
        byte[] var3 = new byte[this.field736 * this.field735];
        int var4 = 0;
        for (int var5 = 0; var5 < this.field732; var5++) {
            for (int var6 = 0; var6 < this.field731; var6++) {
                var3[(this.field734 + var5) * this.field735 + this.field733 + var6] = this.field729[var4++];
            }
        }
        this.field729 = var3;
        this.field731 = this.field735;
        this.field732 = this.field736;
        this.field733 = 0;
        this.field734 = 0;
    }

    @OriginalMember(owner = "client!ITVAFKCK", name = "b", descriptor = "(I)V")
    public void method301(int arg0) {
        if (arg0 != 33787) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        byte[] var3 = new byte[this.field732 * this.field731];
        int var4 = 0;
        for (int var5 = 0; var5 < this.field732; var5++) {
            for (int var6 = this.field731 - 1; var6 >= 0; var6--) {
                var3[var4++] = this.field729[this.field731 * var5 + var6];
            }
        }
        this.field729 = var3;
        this.field733 = this.field735 - this.field731 - this.field733;
    }

    @OriginalMember(owner = "client!ITVAFKCK", name = "c", descriptor = "(I)V")
    public void method302(int arg0) {
        byte[] var2 = new byte[this.field732 * this.field731];
        int var3 = 0;
        for (int var4 = this.field732 - 1; var4 >= 0; var4--) {
            for (int var5 = 0; var5 < this.field731; var5++) {
                var2[var3++] = this.field729[this.field731 * var4 + var5];
            }
        }
        if (arg0 < 0) {
            this.field729 = var2;
            this.field734 = this.field736 - this.field732 - this.field734;
        }
    }

    @OriginalMember(owner = "client!ITVAFKCK", name = "a", descriptor = "(ZIII)V")
    public void method303(boolean arg0, int arg1, int arg2, int arg3) {
        if (!arg0) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        for (int var6 = 0; var6 < this.field730.length; var6++) {
            int var7 = this.field730[var6] >> 16 & 0xFF;
            int var8 = arg3 + var7;
            if (var8 < 0) {
                var8 = 0;
            } else if (var8 > 255) {
                var8 = 255;
            }
            int var9 = this.field730[var6] >> 8 & 0xFF;
            int var10 = arg1 + var9;
            if (var10 < 0) {
                var10 = 0;
            } else if (var10 > 255) {
                var10 = 255;
            }
            int var11 = this.field730[var6] & 0xFF;
            int var12 = arg2 + var11;
            if (var12 < 0) {
                var12 = 0;
            } else if (var12 > 255) {
                var12 = 255;
            }
            this.field730[var6] = (var8 << 16) + (var10 << 8) + var12;
        }
    }

    @OriginalMember(owner = "client!ITVAFKCK", name = "a", descriptor = "(III)V")
    public void method304(int arg0, int arg1, int arg2) {
        int var4 = 4 / arg0;
        int var5 = this.field733 + arg1;
        int var6 = this.field734 + arg2;
        int var7 = class5.field46 * var6 + var5;
        int var8 = 0;
        int var9 = this.field732;
        int var10 = this.field731;
        int var11 = class5.field46 - var10;
        int var12 = 0;
        if (var6 < class5.field48) {
            int var13 = class5.field48 - var6;
            var9 -= var13;
            var6 = class5.field48;
            var8 += var10 * var13;
            var7 += class5.field46 * var13;
        }
        if (var6 + var9 > class5.field49) {
            var9 -= var6 + var9 - class5.field49;
        }
        if (var5 < class5.field50) {
            int var14 = class5.field50 - var5;
            var10 -= var14;
            var5 = class5.field50;
            var8 += var14;
            var7 += var14;
            var12 += var14;
            var11 += var14;
        }
        if (var5 + var10 > class5.field51) {
            int var15 = var5 + var10 - class5.field51;
            var10 -= var15;
            var12 += var15;
            var11 += var15;
        }
        if (var10 > 0 && var9 > 0) {
            this.method305(554, var12, var10, var8, var11, var9, var7, this.field729, class5.field45, this.field730);
        }
    }

    @OriginalMember(owner = "client!ITVAFKCK", name = "a", descriptor = "(IIIIIII[B[I[I)V")
    private void method305(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte[] arg7, int[] arg8, int[] arg9) {
        int var11 = -(arg2 >> 2);
        if (arg0 <= 0) {
            for (int var12 = 1; var12 > 0; var12++) {
            }
        }
        int var13 = -(arg2 & 0x3);
        for (int var14 = -arg5; var14 < 0; var14++) {
            for (int var15 = var11; var15 < 0; var15++) {
                byte var18 = arg7[arg3++];
                if (var18 == 0) {
                    arg6++;
                } else {
                    arg8[arg6++] = arg9[var18 & 0xFF];
                }
                byte var19 = arg7[arg3++];
                if (var19 == 0) {
                    arg6++;
                } else {
                    arg8[arg6++] = arg9[var19 & 0xFF];
                }
                byte var20 = arg7[arg3++];
                if (var20 == 0) {
                    arg6++;
                } else {
                    arg8[arg6++] = arg9[var20 & 0xFF];
                }
                byte var21 = arg7[arg3++];
                if (var21 == 0) {
                    arg6++;
                } else {
                    arg8[arg6++] = arg9[var21 & 0xFF];
                }
            }
            for (int var16 = var13; var16 < 0; var16++) {
                byte var17 = arg7[arg3++];
                if (var17 == 0) {
                    arg6++;
                } else {
                    arg8[arg6++] = arg9[var17 & 0xFF];
                }
            }
            arg6 += arg4;
            arg3 += arg1;
        }
    }
}
