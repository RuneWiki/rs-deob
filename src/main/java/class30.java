import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("KWBPZBYX")
public class class30 extends class67 {

    @OriginalMember(owner = "KWBPZBYX", name = "y", descriptor = "I")
    private int field1031 = 11603;

    @OriginalMember(owner = "KWBPZBYX", name = "z", descriptor = "I")
    private int field1032 = 262;

    @OriginalMember(owner = "KWBPZBYX", name = "A", descriptor = "B")
    private byte field1033 = 3;

    @OriginalMember(owner = "KWBPZBYX", name = "B", descriptor = "I")
    private int field1034 = -8226;

    @OriginalMember(owner = "KWBPZBYX", name = "C", descriptor = "B")
    private byte field1035 = 2;

    @OriginalMember(owner = "KWBPZBYX", name = "D", descriptor = "Z")
    private boolean field1036 = false;

    @OriginalMember(owner = "KWBPZBYX", name = "K", descriptor = "I")
    public int field1043;

    @OriginalMember(owner = "KWBPZBYX", name = "L", descriptor = "I")
    public int field1044;

    @OriginalMember(owner = "KWBPZBYX", name = "F", descriptor = "[I")
    public int[] field1038;

    @OriginalMember(owner = "KWBPZBYX", name = "I", descriptor = "I")
    public int field1041;

    @OriginalMember(owner = "KWBPZBYX", name = "J", descriptor = "I")
    public int field1042;

    @OriginalMember(owner = "KWBPZBYX", name = "G", descriptor = "I")
    public int field1039;

    @OriginalMember(owner = "KWBPZBYX", name = "H", descriptor = "I")
    public int field1040;

    @OriginalMember(owner = "KWBPZBYX", name = "E", descriptor = "[B")
    public byte[] field1037;

    @OriginalMember(owner = "KWBPZBYX", name = "<init>", descriptor = "(LQDHHNYHL;Ljava/lang/String;I)V")
    public class30(class44 arg0, String arg1, int arg2) {
        class42 var4 = new class42(5, arg0.method488(arg1 + ".dat", null));
        class42 var5 = new class42(5, arg0.method488("index.dat", null));
        var5.field1250 = var4.method422();
        this.field1043 = var5.method422();
        this.field1044 = var5.method422();
        int var6 = var5.method420();
        this.field1038 = new int[var6];
        for (int var7 = 0; var7 < var6 - 1; var7++) {
            this.field1038[var7 + 1] = var5.method424();
        }
        for (int var8 = 0; var8 < arg2; var8++) {
            var5.field1250 += 2;
            var4.field1250 += var5.method422() * var5.method422();
            var5.field1250++;
        }
        this.field1041 = var5.method420();
        this.field1042 = var5.method420();
        this.field1039 = var5.method422();
        this.field1040 = var5.method422();
        int var9 = var5.method420();
        int var10 = this.field1040 * this.field1039;
        this.field1037 = new byte[var10];
        if (var9 == 0) {
            for (int var11 = 0; var11 < var10; var11++) {
                this.field1037[var11] = var4.method421();
            }
        } else if (var9 == 1) {
            for (int var12 = 0; var12 < this.field1039; var12++) {
                for (int var13 = 0; var13 < this.field1040; var13++) {
                    this.field1037[this.field1039 * var13 + var12] = var4.method421();
                }
            }
        }
    }

    @OriginalMember(owner = "KWBPZBYX", name = "a", descriptor = "(B)V")
    public void method366(byte arg0) {
        this.field1043 /= 2;
        this.field1044 /= 2;
        byte[] var2 = new byte[this.field1044 * this.field1043];
        int var3 = 0;
        for (int var4 = 0; var4 < this.field1040; var4++) {
            for (int var5 = 0; var5 < this.field1039; var5++) {
                var2[(this.field1041 + var5 >> 1) + (this.field1042 + var4 >> 1) * this.field1043] = this.field1037[var3++];
            }
        }
        this.field1037 = var2;
        this.field1039 = this.field1043;
        this.field1040 = this.field1044;
        if (arg0 != 126) {
            this.field1036 = !this.field1036;
        }
        this.field1041 = 0;
        this.field1042 = 0;
    }

    @OriginalMember(owner = "KWBPZBYX", name = "b", descriptor = "(I)V")
    public void method367(int arg0) {
        int var2 = 54 / arg0;
        if (this.field1043 == this.field1039 && this.field1044 == this.field1040) {
            return;
        }
        byte[] var3 = new byte[this.field1044 * this.field1043];
        int var4 = 0;
        for (int var5 = 0; var5 < this.field1040; var5++) {
            for (int var6 = 0; var6 < this.field1039; var6++) {
                var3[(this.field1042 + var5) * this.field1043 + this.field1041 + var6] = this.field1037[var4++];
            }
        }
        this.field1037 = var3;
        this.field1039 = this.field1043;
        this.field1040 = this.field1044;
        this.field1041 = 0;
        this.field1042 = 0;
    }

    @OriginalMember(owner = "KWBPZBYX", name = "c", descriptor = "(I)V")
    public void method368(int arg0) {
        byte[] var2 = new byte[this.field1040 * this.field1039];
        if (this.field1034 != arg0) {
            this.field1034 = -461;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < this.field1040; var4++) {
            for (int var5 = this.field1039 - 1; var5 >= 0; var5--) {
                var2[var3++] = this.field1037[this.field1039 * var4 + var5];
            }
        }
        this.field1037 = var2;
        this.field1041 = this.field1043 - this.field1039 - this.field1041;
    }

    @OriginalMember(owner = "KWBPZBYX", name = "d", descriptor = "(I)V")
    public void method369(int arg0) {
        byte[] var2 = new byte[this.field1040 * this.field1039];
        if (arg0 <= 0) {
            return;
        }
        int var3 = 0;
        for (int var4 = this.field1040 - 1; var4 >= 0; var4--) {
            for (int var5 = 0; var5 < this.field1039; var5++) {
                var2[var3++] = this.field1037[this.field1039 * var4 + var5];
            }
        }
        this.field1037 = var2;
        this.field1042 = this.field1044 - this.field1040 - this.field1042;
    }

    @OriginalMember(owner = "KWBPZBYX", name = "a", descriptor = "(IIIB)V")
    public void method370(int arg0, int arg1, int arg2, byte arg3) {
        if (arg3 == 0) {
            boolean var5 = false;
        } else {
            this.field1036 = !this.field1036;
        }
        for (int var6 = 0; var6 < this.field1038.length; var6++) {
            int var7 = this.field1038[var6] >> 16 & 0xFF;
            int var8 = arg0 + var7;
            if (var8 < 0) {
                var8 = 0;
            } else if (var8 > 255) {
                var8 = 255;
            }
            int var9 = this.field1038[var6] >> 8 & 0xFF;
            int var10 = arg2 + var9;
            if (var10 < 0) {
                var10 = 0;
            } else if (var10 > 255) {
                var10 = 255;
            }
            int var11 = this.field1038[var6] & 0xFF;
            int var12 = arg1 + var11;
            if (var12 < 0) {
                var12 = 0;
            } else if (var12 > 255) {
                var12 = 255;
            }
            this.field1038[var6] = (var8 << 16) + (var10 << 8) + var12;
        }
    }

    @OriginalMember(owner = "KWBPZBYX", name = "a", descriptor = "(IIZ)V")
    public void method371(int arg0, int arg1, boolean arg2) {
        if (arg2) {
            this.field1036 = !this.field1036;
        }
        int var4 = this.field1041 + arg0;
        int var5 = this.field1042 + arg1;
        int var6 = class67.field1671 * var5 + var4;
        int var7 = 0;
        int var8 = this.field1040;
        int var9 = this.field1039;
        int var10 = class67.field1671 - var9;
        int var11 = 0;
        if (var5 < class67.field1673) {
            int var12 = class67.field1673 - var5;
            var8 -= var12;
            var5 = class67.field1673;
            var7 += var9 * var12;
            var6 += class67.field1671 * var12;
        }
        if (var5 + var8 > class67.field1674) {
            var8 -= var5 + var8 - class67.field1674;
        }
        if (var4 < class67.field1675) {
            int var13 = class67.field1675 - var4;
            var9 -= var13;
            var4 = class67.field1675;
            var7 += var13;
            var6 += var13;
            var11 += var13;
            var10 += var13;
        }
        if (var4 + var9 > class67.field1676) {
            int var14 = var4 + var9 - class67.field1676;
            var9 -= var14;
            var11 += var14;
            var10 += var14;
        }
        if (var9 > 0 && var8 > 0) {
            this.method372(var11, var7, this.field1037, var9, var8, var10, this.field1035, class67.field1670, this.field1038, var6);
        }
    }

    @OriginalMember(owner = "KWBPZBYX", name = "a", descriptor = "(II[BIIIB[I[II)V")
    private void method372(int arg0, int arg1, byte[] arg2, int arg3, int arg4, int arg5, byte arg6, int[] arg7, int[] arg8, int arg9) {
        int var11 = -(arg3 >> 2);
        int var12 = -(arg3 & 0x3);
        if (arg6 == 2) {
            boolean var13 = false;
        } else {
            this.field1031 = -497;
        }
        for (int var14 = -arg4; var14 < 0; var14++) {
            for (int var15 = var11; var15 < 0; var15++) {
                byte var18 = arg2[arg1++];
                if (var18 == 0) {
                    arg9++;
                } else {
                    arg7[arg9++] = arg8[var18 & 0xFF];
                }
                byte var19 = arg2[arg1++];
                if (var19 == 0) {
                    arg9++;
                } else {
                    arg7[arg9++] = arg8[var19 & 0xFF];
                }
                byte var20 = arg2[arg1++];
                if (var20 == 0) {
                    arg9++;
                } else {
                    arg7[arg9++] = arg8[var20 & 0xFF];
                }
                byte var21 = arg2[arg1++];
                if (var21 == 0) {
                    arg9++;
                } else {
                    arg7[arg9++] = arg8[var21 & 0xFF];
                }
            }
            for (int var16 = var12; var16 < 0; var16++) {
                byte var17 = arg2[arg1++];
                if (var17 == 0) {
                    arg9++;
                } else {
                    arg7[arg9++] = arg8[var17 & 0xFF];
                }
            }
            arg9 += arg5;
            arg1 += arg0;
        }
    }
}
