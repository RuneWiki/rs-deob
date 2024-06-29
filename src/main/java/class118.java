import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kl")
public class class118 extends class175 {

    @OriginalMember(owner = "client!kl", name = "C", descriptor = "Z")
    public boolean field1999 = false;

    @OriginalMember(owner = "client!kl", name = "I", descriptor = "Ldj;")
    public class296 field2005;

    @OriginalMember(owner = "client!kl", name = "H", descriptor = "Z")
    private boolean field2004;

    @OriginalMember(owner = "client!kl", name = "z", descriptor = "Z")
    private boolean field1997;

    @OriginalMember(owner = "client!kl", name = "E", descriptor = "I")
    private int field2001;

    @OriginalMember(owner = "client!kl", name = "G", descriptor = "I")
    private int field2003;

    @OriginalMember(owner = "client!kl", name = "y", descriptor = "F")
    private float field1996;

    @OriginalMember(owner = "client!kl", name = "F", descriptor = "I")
    private int field2002;

    @OriginalMember(owner = "client!kl", name = "B", descriptor = "[I")
    public static int[] field1998;

    @OriginalMember(owner = "client!kl", name = "D", descriptor = "[I")
    private int[] field2000;

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "()V")
    public static void method835() {
        field1998 = null;
    }

    @OriginalMember(owner = "client!kl", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        super.finalize();
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(Lc;Ljj;FZ)[I")
    public final int[] method836(class276 arg0, class134 arg1, float arg2, boolean arg3) {
        if (this.field2000 == null || this.field1996 != arg2) {
            if (!this.field2005.method1979(arg0, -13722, arg1)) {
                return null;
            }
            this.field2002 = arg3 ? 64 : 128;
            this.field2000 = this.field2005.method1977(this.field2002, false, arg0, (double) arg2, arg1, true, this.field1997, this.field2002);
            this.field1996 = arg2;
            if (this.field2004) {
                int[] var5 = new int[this.field2002];
                int[] var6 = new int[this.field2002];
                int[] var7 = new int[this.field2002];
                int[] var8 = new int[this.field2002 * this.field2002];
                int var9 = this.field2002;
                int var10 = this.field2002;
                int var11 = var9 - 1;
                int var12 = var10 - 1;
                int var13 = var9 * var10;
                int var14 = var9;
                int var15 = var9;
                for (int var16 = 2; var16 >= 0; var16--) {
                    for (int var32 = var11; var32 >= 0; var32--) {
                        var14--;
                        int var33 = this.field2000[var14];
                        var5[var32] += var33 >> 16 & 0xFF;
                        var6[var32] += var33 >> 8 & 0xFF;
                        var7[var32] += var33 & 0xFF;
                    }
                    if (var14 == 0) {
                        var14 = var13;
                    }
                }
                int var17 = var13;
                for (int var18 = var12; var18 >= 0; var18--) {
                    int var19 = 1;
                    int var20 = 1;
                    int var21 = 0;
                    int var22 = 0;
                    int var23 = 0;
                    for (int var24 = 2; var24 >= 0; var24--) {
                        var20--;
                        var23 += var5[var20];
                        var21 += var6[var20];
                        var22 += var7[var20];
                        if (var20 == 0) {
                            var20 = var9;
                        }
                    }
                    for (int var25 = var11; var25 >= 0; var25--) {
                        var20--;
                        var19--;
                        int var29 = var23 / 9;
                        int var30 = var21 / 9;
                        int var31 = var22 / 9;
                        var17--;
                        var8[var17] = var29 << 16 | var30 << 8 | var31;
                        var23 += var5[var20] - var5[var19];
                        var22 += var7[var20] - var7[var19];
                        var21 += var6[var20] - var6[var19];
                        if (var20 == 0) {
                            var20 = var9;
                        }
                        if (var19 == 0) {
                            var19 = var9;
                        }
                    }
                    for (int var26 = var11; var26 >= 0; var26--) {
                        var14--;
                        int var27 = this.field2000[var14];
                        var15--;
                        int var28 = this.field2000[var15];
                        var5[var26] += (var27 >> 16 & 0xFF) - (var28 >> 16 & 0xFF);
                        var6[var26] += (var27 >> 8 & 0xFF) - (var28 >> 8 & 0xFF);
                        var7[var26] += (var27 & 0xFF) - (var28 & 0xFF);
                    }
                    if (var14 == 0) {
                        var14 = var13;
                    }
                    if (var15 == 0) {
                        var15 = var13;
                    }
                }
                this.field2000 = var8;
            }
        }
        return this.field2000;
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(Lc;Ljj;)Z")
    public final boolean method837(class276 arg0, class134 arg1) {
        return this.field2005.method1979(arg0, -13722, arg1);
    }

    @OriginalMember(owner = "client!kl", name = "h", descriptor = "(I)V")
    public final void method838(int arg0) {
        if (this.field2000 == null || this.field2003 == 0 && this.field2001 == 0) {
            return;
        }
        if (field1998 == null || field1998.length < this.field2000.length) {
            field1998 = new int[this.field2000.length];
        }
        int var2 = this.field2000.length;
        int var3 = this.field2001 * arg0;
        int var4 = this.field2002 - 1;
        int var5 = this.field2002 * arg0 * this.field2003;
        int var6 = var2 - 1;
        for (int var7 = 0; var7 < var2; var7 += this.field2002) {
            int var9 = var5 + var7 & var6;
            for (int var10 = 0; var10 < this.field2002; var10++) {
                int var11 = var7 + var10;
                int var12 = (var3 + var10 & var4) + var9;
                field1998[var11] = this.field2000[var12];
            }
        }
        int[] var8 = this.field2000;
        this.field2000 = field1998;
        field1998 = var8;
    }

    @OriginalMember(owner = "client!kl", name = "<init>", descriptor = "(Lhi;)V")
    public class118(class264 arg0) {
        this.field2005 = new class296(arg0);
        this.field2004 = arg0.method1779(-117) == 1;
        this.field1997 = arg0.method1779(-88) == 1;
        arg0.method1779(-64);
        arg0.method1779(-63);
        int var2 = arg0.method1779(-114) & 0x3;
        this.field2001 = arg0.method1767(16711680);
        this.field2003 = arg0.method1767(16711680);
        arg0.method1779(-109);
        arg0.method1779(-115);
        arg0.method1779(-90);
    }
}
