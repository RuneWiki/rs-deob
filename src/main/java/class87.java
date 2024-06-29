import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public class class87 extends class1 {

    @OriginalMember(owner = "client!nc", name = "H", descriptor = "Z")
    public boolean field1387 = false;

    @OriginalMember(owner = "client!nc", name = "G", descriptor = "Lwh;")
    public class198 field1386;

    @OriginalMember(owner = "client!nc", name = "P", descriptor = "Z")
    private boolean field1395;

    @OriginalMember(owner = "client!nc", name = "L", descriptor = "Z")
    private boolean field1391;

    @OriginalMember(owner = "client!nc", name = "K", descriptor = "I")
    private int field1390;

    @OriginalMember(owner = "client!nc", name = "N", descriptor = "I")
    private int field1393;

    @OriginalMember(owner = "client!nc", name = "M", descriptor = "F")
    private float field1392;

    @OriginalMember(owner = "client!nc", name = "O", descriptor = "I")
    private int field1394;

    @OriginalMember(owner = "client!nc", name = "I", descriptor = "[I")
    public static int[] field1388;

    @OriginalMember(owner = "client!nc", name = "J", descriptor = "[I")
    private int[] field1389;

    @OriginalMember(owner = "client!nc", name = "f", descriptor = "(I)V")
    public final void method567(int arg0) {
        if (this.field1389 == null || this.field1393 == 0 && this.field1390 == 0) {
            return;
        }
        if (field1388 == null || field1388.length < this.field1389.length) {
            field1388 = new int[this.field1389.length];
        }
        int var2 = this.field1389.length;
        int var3 = this.field1390 * arg0;
        int var4 = this.field1394 - 1;
        int var5 = this.field1394 * arg0 * this.field1393;
        int var6 = var2 - 1;
        for (int var7 = 0; var7 < var2; var7 += this.field1394) {
            int var9 = var5 + var7 & var6;
            for (int var10 = 0; var10 < this.field1394; var10++) {
                int var11 = var7 + var10;
                int var12 = (var3 + var10 & var4) + var9;
                field1388[var11] = this.field1389[var12];
            }
        }
        int[] var8 = this.field1389;
        this.field1389 = field1388;
        field1388 = var8;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(Lvf;Lpf;)Z")
    public final boolean method568(class104 arg0, class294 arg1) {
        return this.field1386.method1243(arg0, arg1, (byte) 122);
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "()V")
    public static void method569() {
        field1388 = null;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(Lvf;Lpf;FZ)[I")
    public final int[] method570(class104 arg0, class294 arg1, float arg2, boolean arg3) {
        if (this.field1389 == null || this.field1392 != arg2) {
            if (!this.field1386.method1243(arg0, arg1, (byte) -49)) {
                return null;
            }
            this.field1394 = arg3 ? 64 : 128;
            this.field1389 = this.field1386.method1239(-12746, true, this.field1394, (double) arg2, this.field1394, arg1, arg0, this.field1391);
            this.field1392 = arg2;
            if (this.field1395) {
                int[] var5 = new int[this.field1394];
                int[] var6 = new int[this.field1394];
                int[] var7 = new int[this.field1394];
                int[] var8 = new int[this.field1394 * this.field1394];
                int var9 = this.field1394;
                int var10 = this.field1394;
                int var11 = var9 - 1;
                int var12 = var10 - 1;
                int var13 = var9 * var10;
                int var14 = var9;
                int var15 = var9;
                for (int var16 = 2; var16 >= 0; var16--) {
                    for (int var32 = var11; var32 >= 0; var32--) {
                        var14--;
                        int var33 = this.field1389[var14];
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
                        int var27 = this.field1389[var14];
                        var15--;
                        int var28 = this.field1389[var15];
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
                this.field1389 = var8;
            }
        }
        return this.field1389;
    }

    @OriginalMember(owner = "client!nc", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        super.finalize();
    }

    @OriginalMember(owner = "client!nc", name = "<init>", descriptor = "(Lfl;)V")
    public class87(class248 arg0) {
        this.field1386 = new class198(arg0);
        this.field1395 = arg0.method1593((byte) 27) == 1;
        this.field1391 = arg0.method1593((byte) 27) == 1;
        arg0.method1593((byte) 27);
        arg0.method1593((byte) 27);
        int var2 = arg0.method1593((byte) 27) & 0x3;
        this.field1390 = arg0.method1604(4);
        this.field1393 = arg0.method1604(4);
        arg0.method1593((byte) 27);
        arg0.method1593((byte) 27);
        arg0.method1593((byte) 27);
    }
}
