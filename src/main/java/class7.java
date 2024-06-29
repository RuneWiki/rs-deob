import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!g")
public class class7 extends class5 {

    @OriginalMember(owner = "mapview!g", name = "p", descriptor = "[I")
    public int[] field52;

    @OriginalMember(owner = "mapview!g", name = "u", descriptor = "I")
    public int field57;

    @OriginalMember(owner = "mapview!g", name = "q", descriptor = "I")
    public int field53;

    @OriginalMember(owner = "mapview!g", name = "v", descriptor = "I")
    public int field58;

    @OriginalMember(owner = "mapview!g", name = "r", descriptor = "I")
    public int field54;

    @OriginalMember(owner = "mapview!g", name = "t", descriptor = "I")
    public int field56;

    @OriginalMember(owner = "mapview!g", name = "s", descriptor = "I")
    public int field55;

    @OriginalMember(owner = "mapview!g", name = "b", descriptor = "()V")
    public void method31() {
        class5.method18(this.field52, this.field53, this.field54);
    }

    @OriginalMember(owner = "mapview!g", name = "a", descriptor = "(II)V")
    public void method32(int arg0, int arg1) {
        int var3 = this.field55 + arg0;
        int var4 = this.field56 + arg1;
        int var5 = class5.field38 * var4 + var3;
        int var6 = 0;
        int var7 = this.field54;
        int var8 = this.field53;
        int var9 = class5.field38 - var8;
        int var10 = 0;
        if (var4 < class5.field40) {
            int var11 = class5.field40 - var4;
            var7 -= var11;
            var4 = class5.field40;
            var6 += var8 * var11;
            var5 += class5.field38 * var11;
        }
        if (var4 + var7 > class5.field41) {
            var7 -= var4 + var7 - class5.field41;
        }
        if (var3 < class5.field42) {
            int var12 = class5.field42 - var3;
            var8 -= var12;
            var3 = class5.field42;
            var6 += var12;
            var5 += var12;
            var10 += var12;
            var9 += var12;
        }
        if (var3 + var8 > class5.field43) {
            int var13 = var3 + var8 - class5.field43;
            var8 -= var13;
            var10 += var13;
            var9 += var13;
        }
        if (var8 > 0 && var7 > 0) {
            this.method33(class5.field37, this.field52, 0, var6, var5, var8, var7, var9, var10);
        }
    }

    @OriginalMember(owner = "mapview!g", name = "a", descriptor = "([I[IIIIIIII)V")
    private void method33(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        int var10 = -(arg5 >> 2);
        int var11 = -(arg5 & 0x3);
        for (int var12 = -arg6; var12 < 0; var12++) {
            for (int var13 = var10; var13 < 0; var13++) {
                int var16 = arg1[arg3++];
                if (var16 == 0) {
                    arg4++;
                } else {
                    arg0[arg4++] = var16;
                }
                int var17 = arg1[arg3++];
                if (var17 == 0) {
                    arg4++;
                } else {
                    arg0[arg4++] = var17;
                }
                int var18 = arg1[arg3++];
                if (var18 == 0) {
                    arg4++;
                } else {
                    arg0[arg4++] = var18;
                }
                int var19 = arg1[arg3++];
                if (var19 == 0) {
                    arg4++;
                } else {
                    arg0[arg4++] = var19;
                }
            }
            for (int var14 = var11; var14 < 0; var14++) {
                int var15 = arg1[arg3++];
                if (var15 == 0) {
                    arg4++;
                } else {
                    arg0[arg4++] = var15;
                }
            }
            arg4 += arg7;
            arg3 += arg8;
        }
    }

    @OriginalMember(owner = "mapview!g", name = "<init>", descriptor = "(II)V")
    public class7(int arg0, int arg1) {
        this.field52 = new int[arg0 * arg1];
        this.field53 = this.field57 = arg0;
        this.field54 = this.field58 = arg1;
        this.field55 = this.field56 = 0;
    }

    @OriginalMember(owner = "mapview!g", name = "<init>", descriptor = "(Lo;Ljava/lang/String;I)V")
    public class7(class15 arg0, String arg1, int arg2) {
        class10 var4 = new class10(arg0.method62(arg1 + ".dat", null));
        class10 var5 = new class10(arg0.method62("index.dat", null));
        var5.field77 = var4.method47();
        this.field57 = var5.method47();
        this.field58 = var5.method47();
        int var6 = var5.method45();
        int[] var7 = new int[var6];
        for (int var8 = 0; var8 < var6 - 1; var8++) {
            var7[var8 + 1] = var5.method49();
            if (var7[var8 + 1] == 0) {
                var7[var8 + 1] = 1;
            }
        }
        for (int var9 = 0; var9 < arg2; var9++) {
            var5.field77 += 2;
            var4.field77 += var5.method47() * var5.method47();
            var5.field77++;
        }
        this.field55 = var5.method45();
        this.field56 = var5.method45();
        this.field53 = var5.method47();
        this.field54 = var5.method47();
        int var10 = var5.method45();
        int var11 = this.field54 * this.field53;
        this.field52 = new int[var11];
        if (var10 == 0) {
            for (int var12 = 0; var12 < var11; var12++) {
                this.field52[var12] = var7[var4.method45()];
            }
        } else if (var10 == 1) {
            for (int var13 = 0; var13 < this.field53; var13++) {
                for (int var14 = 0; var14 < this.field54; var14++) {
                    this.field52[this.field53 * var14 + var13] = var7[var4.method45()];
                }
            }
        }
    }

    @OriginalMember(owner = "mapview!g", name = "b", descriptor = "(II)V")
    public void method34(int arg0, int arg1) {
        int var3 = this.field55 + arg0;
        int var4 = this.field56 + arg1;
        int var5 = class5.field38 * var4 + var3;
        int var6 = 0;
        int var7 = this.field54;
        int var8 = this.field53;
        int var9 = class5.field38 - var8;
        int var10 = 0;
        if (var4 < class5.field40) {
            int var11 = class5.field40 - var4;
            var7 -= var11;
            var4 = class5.field40;
            var6 += var8 * var11;
            var5 += class5.field38 * var11;
        }
        if (var4 + var7 > class5.field41) {
            var7 -= var4 + var7 - class5.field41;
        }
        if (var3 < class5.field42) {
            int var12 = class5.field42 - var3;
            var8 -= var12;
            var3 = class5.field42;
            var6 += var12;
            var5 += var12;
            var10 += var12;
            var9 += var12;
        }
        if (var3 + var8 > class5.field43) {
            int var13 = var3 + var8 - class5.field43;
            var8 -= var13;
            var10 += var13;
            var9 += var13;
        }
        if (var8 > 0 && var7 > 0) {
            this.method35(class5.field37, this.field52, var6, var5, var8, var7, var9, var10);
        }
    }

    @OriginalMember(owner = "mapview!g", name = "a", descriptor = "([I[IIIIIII)V")
    private void method35(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int var9 = -(arg4 >> 2);
        int var10 = -(arg4 & 0x3);
        for (int var11 = -arg5; var11 < 0; var11++) {
            for (int var12 = var9; var12 < 0; var12++) {
                arg0[arg3++] = arg1[arg2++];
                arg0[arg3++] = arg1[arg2++];
                arg0[arg3++] = arg1[arg2++];
                arg0[arg3++] = arg1[arg2++];
            }
            for (int var13 = var10; var13 < 0; var13++) {
                arg0[arg3++] = arg1[arg2++];
            }
            arg3 += arg6;
            arg2 += arg7;
        }
    }
}
