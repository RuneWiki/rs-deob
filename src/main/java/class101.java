import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pk")
public class class101 extends class292 {

    @OriginalMember(owner = "client!pk", name = "M", descriptor = "Z")
    public boolean field1624 = false;

    @OriginalMember(owner = "client!pk", name = "J", descriptor = "Lvf;")
    public class103 field1621;

    @OriginalMember(owner = "client!pk", name = "F", descriptor = "Z")
    private boolean field1618;

    @OriginalMember(owner = "client!pk", name = "L", descriptor = "Z")
    private boolean field1623;

    @OriginalMember(owner = "client!pk", name = "K", descriptor = "I")
    private int field1622;

    @OriginalMember(owner = "client!pk", name = "N", descriptor = "I")
    private int field1625;

    @OriginalMember(owner = "client!pk", name = "E", descriptor = "F")
    private float field1617;

    @OriginalMember(owner = "client!pk", name = "D", descriptor = "I")
    private int field1616;

    @OriginalMember(owner = "client!pk", name = "G", descriptor = "[I")
    public static int[] field1619;

    @OriginalMember(owner = "client!pk", name = "H", descriptor = "[I")
    private int[] field1620;

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(Lmj;Luf;)Z")
    public final boolean method777(class114 arg0, class176 arg1) {
        return this.field1621.method791(0, arg1, arg0);
    }

    @OriginalMember(owner = "client!pk", name = "d", descriptor = "(I)V")
    public final void method778(int arg0) {
        if (this.field1620 == null || this.field1625 == 0 && this.field1622 == 0) {
            return;
        }
        if (field1619 == null || field1619.length < this.field1620.length) {
            field1619 = new int[this.field1620.length];
        }
        int var2 = this.field1620.length;
        int var3 = this.field1622 * arg0;
        int var4 = this.field1616 - 1;
        int var5 = this.field1616 * arg0 * this.field1625;
        int var6 = var2 - 1;
        for (int var7 = 0; var7 < var2; var7 += this.field1616) {
            int var9 = var5 + var7 & var6;
            for (int var10 = 0; var10 < this.field1616; var10++) {
                int var11 = var7 + var10;
                int var12 = (var3 + var10 & var4) + var9;
                field1619[var11] = this.field1620[var12];
            }
        }
        int[] var8 = this.field1620;
        this.field1620 = field1619;
        field1619 = var8;
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "()V")
    public static void method779() {
        field1619 = null;
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(Lmj;Luf;FZ)[I")
    public final int[] method780(class114 arg0, class176 arg1, float arg2, boolean arg3) {
        if (this.field1620 == null || this.field1617 != arg2) {
            if (!this.field1621.method791(0, arg1, arg0)) {
                return null;
            }
            this.field1616 = arg3 ? 64 : 128;
            this.field1620 = this.field1621.method788(this.field1623, this.field1616, (byte) 85, arg1, true, this.field1616, arg0, (double) arg2);
            this.field1617 = arg2;
            if (this.field1618) {
                int[] var5 = new int[this.field1616];
                int[] var6 = new int[this.field1616];
                int[] var7 = new int[this.field1616];
                int[] var8 = new int[this.field1616 * this.field1616];
                int var9 = this.field1616;
                int var10 = this.field1616;
                int var11 = var9 - 1;
                int var12 = var10 - 1;
                int var13 = var9 * var10;
                int var14 = var9;
                int var15 = var9;
                for (int var16 = 2; var16 >= 0; var16--) {
                    for (int var32 = var11; var32 >= 0; var32--) {
                        var14--;
                        int var33 = this.field1620[var14];
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
                        int var27 = this.field1620[var14];
                        var15--;
                        int var28 = this.field1620[var15];
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
                this.field1620 = var8;
            }
        }
        return this.field1620;
    }

    @OriginalMember(owner = "client!pk", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        super.finalize();
    }

    @OriginalMember(owner = "client!pk", name = "<init>", descriptor = "(Lf;)V")
    public class101(class37 arg0) {
        this.field1621 = new class103(arg0);
        this.field1618 = arg0.method333((byte) -59) == 1;
        this.field1623 = arg0.method333((byte) -59) == 1;
        arg0.method333((byte) -59);
        arg0.method333((byte) -59);
        int var2 = arg0.method333((byte) -59) & 0x3;
        this.field1622 = arg0.method322((byte) 84);
        this.field1625 = arg0.method322((byte) 51);
        arg0.method333((byte) -59);
        arg0.method333((byte) -59);
        arg0.method333((byte) -59);
    }
}
