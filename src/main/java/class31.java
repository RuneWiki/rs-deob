import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!KYEPSAQL")
public class class31 extends class58 {

    @OriginalMember(owner = "client!KYEPSAQL", name = "z", descriptor = "I")
    private int field907 = 345;

    @OriginalMember(owner = "client!KYEPSAQL", name = "B", descriptor = "Z")
    private boolean field908 = false;

    @OriginalMember(owner = "client!KYEPSAQL", name = "C", descriptor = "I")
    private int field909 = 7;

    @OriginalMember(owner = "client!KYEPSAQL", name = "D", descriptor = "Z")
    private boolean field910 = true;

    @OriginalMember(owner = "client!KYEPSAQL", name = "E", descriptor = "B")
    private byte field911 = 0;

    @OriginalMember(owner = "client!KYEPSAQL", name = "F", descriptor = "Z")
    private boolean field912 = false;

    @OriginalMember(owner = "client!KYEPSAQL", name = "M", descriptor = "I")
    public int field919;

    @OriginalMember(owner = "client!KYEPSAQL", name = "N", descriptor = "I")
    public int field920;

    @OriginalMember(owner = "client!KYEPSAQL", name = "H", descriptor = "[I")
    public int[] field914;

    @OriginalMember(owner = "client!KYEPSAQL", name = "K", descriptor = "I")
    public int field917;

    @OriginalMember(owner = "client!KYEPSAQL", name = "L", descriptor = "I")
    public int field918;

    @OriginalMember(owner = "client!KYEPSAQL", name = "I", descriptor = "I")
    public int field915;

    @OriginalMember(owner = "client!KYEPSAQL", name = "J", descriptor = "I")
    public int field916;

    @OriginalMember(owner = "client!KYEPSAQL", name = "G", descriptor = "[B")
    public byte[] field913;

    @OriginalMember(owner = "client!KYEPSAQL", name = "<init>", descriptor = "(LSMIVAFST;Ljava/lang/String;I)V")
    public class31(class52 arg0, String arg1, int arg2) {
        class7 var4 = new class7(arg0.method512(arg1 + ".dat", null), (byte) 3);
        class7 var5 = new class7(arg0.method512("index.dat", null), (byte) 3);
        var5.field91 = var4.method49();
        this.field919 = var5.method49();
        this.field920 = var5.method49();
        int var6 = var5.method47();
        this.field914 = new int[var6];
        for (int var7 = 0; var7 < var6 - 1; var7++) {
            this.field914[var7 + 1] = var5.method51();
        }
        for (int var8 = 0; var8 < arg2; var8++) {
            var5.field91 += 2;
            var4.field91 += var5.method49() * var5.method49();
            var5.field91++;
        }
        this.field917 = var5.method47();
        this.field918 = var5.method47();
        this.field915 = var5.method49();
        this.field916 = var5.method49();
        int var9 = var5.method47();
        int var10 = this.field916 * this.field915;
        this.field913 = new byte[var10];
        if (var9 == 0) {
            for (int var11 = 0; var11 < var10; var11++) {
                this.field913[var11] = var4.method48();
            }
        } else {
            if (var9 == 1) {
                for (int var12 = 0; var12 < this.field915; var12++) {
                    for (int var13 = 0; var13 < this.field916; var13++) {
                        this.field913[this.field915 * var13 + var12] = var4.method48();
                    }
                }
            }
            if (class56.field1535) {
            }
        }
    }

    @OriginalMember(owner = "client!KYEPSAQL", name = "a", descriptor = "(Z)V")
    public void method345(boolean arg0) {
        this.field919 /= 2;
        this.field920 /= 2;
        byte[] var2 = new byte[this.field920 * this.field919];
        int var3 = 0;
        for (int var4 = 0; var4 < this.field916; var4++) {
            for (int var6 = 0; var6 < this.field915; var6++) {
                var2[(this.field917 + var6 >> 1) + (this.field918 + var4 >> 1) * this.field919] = this.field913[var3++];
            }
        }
        this.field913 = var2;
        if (!arg0) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        this.field915 = this.field919;
        this.field916 = this.field920;
        this.field917 = 0;
        this.field918 = 0;
    }

    @OriginalMember(owner = "client!KYEPSAQL", name = "b", descriptor = "(I)V")
    public void method346(int arg0) {
        if (this.field919 == this.field915 && this.field920 == this.field916) {
            return;
        }
        byte[] var2 = new byte[this.field920 * this.field919];
        int var3 = 0;
        for (int var4 = 0; var4 < this.field916; var4++) {
            for (int var5 = 0; var5 < this.field915; var5++) {
                var2[(this.field918 + var4) * this.field919 + this.field917 + var5] = this.field913[var3++];
            }
        }
        this.field913 = var2;
        this.field915 = this.field919;
        if (arg0 == 40711) {
            this.field916 = this.field920;
            this.field917 = 0;
            this.field918 = 0;
        }
    }

    @OriginalMember(owner = "client!KYEPSAQL", name = "b", descriptor = "(Z)V")
    public void method347(boolean arg0) {
        byte[] var2 = new byte[this.field916 * this.field915];
        int var3 = 0;
        if (arg0) {
            this.field908 = !this.field908;
        }
        for (int var4 = 0; var4 < this.field916; var4++) {
            for (int var5 = this.field915 - 1; var5 >= 0; var5--) {
                var2[var3++] = this.field913[this.field915 * var4 + var5];
            }
        }
        this.field913 = var2;
        this.field917 = this.field919 - this.field915 - this.field917;
    }

    @OriginalMember(owner = "client!KYEPSAQL", name = "c", descriptor = "(I)V")
    public void method348(int arg0) {
        byte[] var2 = new byte[this.field916 * this.field915];
        int var3 = 0;
        if (arg0 >= 0) {
            return;
        }
        for (int var4 = this.field916 - 1; var4 >= 0; var4--) {
            for (int var5 = 0; var5 < this.field915; var5++) {
                var2[var3++] = this.field913[this.field915 * var4 + var5];
            }
        }
        this.field913 = var2;
        this.field918 = this.field920 - this.field916 - this.field918;
    }

    @OriginalMember(owner = "client!KYEPSAQL", name = "a", descriptor = "(IIIZ)V")
    public void method349(int arg0, int arg1, int arg2, boolean arg3) {
        for (int var5 = 0; var5 < this.field914.length; var5++) {
            int var6 = this.field914[var5] >> 16 & 0xFF;
            int var7 = arg0 + var6;
            if (var7 < 0) {
                var7 = 0;
            } else if (var7 > 255) {
                var7 = 255;
            }
            int var8 = this.field914[var5] >> 8 & 0xFF;
            int var9 = arg2 + var8;
            if (var9 < 0) {
                var9 = 0;
            } else if (var9 > 255) {
                var9 = 255;
            }
            int var10 = this.field914[var5] & 0xFF;
            int var11 = arg1 + var10;
            if (var11 < 0) {
                var11 = 0;
            } else if (var11 > 255) {
                var11 = 255;
            }
            this.field914[var5] = (var7 << 16) + (var9 << 8) + var11;
        }
        if (!arg3) {
            this.field912 = !this.field912;
        }
    }

    @OriginalMember(owner = "client!KYEPSAQL", name = "a", descriptor = "(IBI)V")
    public void method350(int arg0, byte arg1, int arg2) {
        int var4 = this.field917 + arg2;
        int var5 = this.field918 + arg0;
        int var6 = class58.field1546 * var5 + var4;
        int var7 = 0;
        int var8 = this.field916;
        int var9 = this.field915;
        int var10 = class58.field1546 - var9;
        int var11 = 0;
        if (arg1 != 0) {
            return;
        }
        boolean var12 = false;
        if (var5 < class58.field1548) {
            int var13 = class58.field1548 - var5;
            var8 -= var13;
            var5 = class58.field1548;
            var7 += var9 * var13;
            var6 += class58.field1546 * var13;
        }
        if (var5 + var8 > class58.field1549) {
            var8 -= var5 + var8 - class58.field1549;
        }
        if (var4 < class58.field1550) {
            int var14 = class58.field1550 - var4;
            var9 -= var14;
            var4 = class58.field1550;
            var7 += var14;
            var6 += var14;
            var11 += var14;
            var10 += var14;
        }
        if (var4 + var9 > class58.field1551) {
            int var15 = var4 + var9 - class58.field1551;
            var9 -= var15;
            var11 += var15;
            var10 += var15;
        }
        if (var9 > 0 && var8 > 0) {
            this.method351(this.field910, var7, this.field914, var9, var8, var10, var11, this.field913, class58.field1545, var6);
        }
    }

    @OriginalMember(owner = "client!KYEPSAQL", name = "a", descriptor = "(ZI[IIIII[B[II)V")
    private void method351(boolean arg0, int arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, byte[] arg7, int[] arg8, int arg9) {
        int var11 = -(arg3 >> 2);
        int var12 = -(arg3 & 0x3);
        for (int var13 = -arg4; var13 < 0; var13++) {
            for (int var14 = var11; var14 < 0; var14++) {
                byte var17 = arg7[arg1++];
                if (var17 == 0) {
                    arg9++;
                } else {
                    arg8[arg9++] = arg2[var17 & 0xFF];
                }
                byte var18 = arg7[arg1++];
                if (var18 == 0) {
                    arg9++;
                } else {
                    arg8[arg9++] = arg2[var18 & 0xFF];
                }
                byte var19 = arg7[arg1++];
                if (var19 == 0) {
                    arg9++;
                } else {
                    arg8[arg9++] = arg2[var19 & 0xFF];
                }
                byte var20 = arg7[arg1++];
                if (var20 == 0) {
                    arg9++;
                } else {
                    arg8[arg9++] = arg2[var20 & 0xFF];
                }
            }
            for (int var15 = var12; var15 < 0; var15++) {
                byte var16 = arg7[arg1++];
                if (var16 == 0) {
                    arg9++;
                } else {
                    arg8[arg9++] = arg2[var16 & 0xFF];
                }
            }
            arg9 += arg5;
            arg1 += arg6;
        }
        if (arg0) {
            ;
        }
    }
}
