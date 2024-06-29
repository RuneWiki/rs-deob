import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ve")
public class class428 extends class466 {

    @OriginalMember(owner = "client!ve", name = "F", descriptor = "I")
    private int field6070 = 4096;

    @OriginalMember(owner = "client!ve", name = "H", descriptor = "I")
    private int field6072 = 4096;

    @OriginalMember(owner = "client!ve", name = "M", descriptor = "[I")
    private int[] field6077 = new int[3];

    @OriginalMember(owner = "client!ve", name = "I", descriptor = "I")
    private int field6073 = 409;

    @OriginalMember(owner = "client!ve", name = "E", descriptor = "I")
    private int field6069 = 4096;

    @OriginalMember(owner = "client!ve", name = "K", descriptor = "[Lld;")
    public static class145[] field6075 = new class145[4];

    @OriginalMember(owner = "client!ve", name = "L", descriptor = "I")
    public static int field6076;

    @OriginalMember(owner = "client!ve", name = "N", descriptor = "I")
    public static int field6078;

    @OriginalMember(owner = "client!ve", name = "O", descriptor = "I")
    public static int field6079;

    @OriginalMember(owner = "client!ve", name = "J", descriptor = "Lan;")
    public static class21 field6074;

    @OriginalMember(owner = "client!ve", name = "G", descriptor = "[Laf;")
    public static class368[] field6071;

    @OriginalMember(owner = "client!ve", name = "d", descriptor = "(I)V")
    public static void method2543(int arg0) {
        field6075 = null;
        field6074 = null;
        field6071 = null;
        if (arg0 != 1833556716) {
            method2544(114, 77, 123, (class21) null);
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(Ldaa;II)V")
    public final void method6(class11 arg0, int arg1, int arg2) {
        ++field6078;
        if (arg1 != -5062) {
            this.field6072 = -63;
        }
        if (~arg2 != -1) {
            if (~arg2 != -2) {
                if (arg2 != 2) {
                    if (~arg2 != -4) {
                        if (arg2 == 4) {
                            int var5 = arg0.method89((byte) -25);
                            this.field6077[2] = class589.method3454(255, var5) >> 12;
                            this.field6077[0] = class589.method3454(267386880, var5 << 4);
                            this.field6077[1] = class589.method3454(var5, 65280) >> 4;
                        }
                    } else {
                        this.field6070 = arg0.method93((byte) 89);
                    }
                } else {
                    this.field6072 = arg0.method93((byte) 100);
                }
            } else {
                this.field6069 = arg0.method93((byte) 83);
            }
        } else {
            this.field6073 = arg0.method93((byte) 101);
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(IZ)[[I")
    public final int[][] method33(int arg0, boolean arg1) {
        ++field6079;
        int[][] var3 = super.field6569.method828((byte) 127, arg0);
        if (arg1) {
            method2543(122);
        }
        if (super.field6569.field1934) {
            int[][] var4 = this.method2719(0, arg0, 5);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; class312.field4207 > var11; ++var11) {
                int var12 = var5[var11];
                int var13 = -this.field6077[0] + var12;
                if (~var13 > -1) {
                    var13 = -var13;
                }
                if (this.field6073 < var13) {
                    var8[var11] = var12;
                    var9[var11] = var6[var11];
                    var10[var11] = var7[var11];
                } else {
                    int var14 = var6[var11];
                    int var15 = -this.field6077[1] + var14;
                    if (~var15 > -1) {
                        var15 = -var15;
                    }
                    if (~var15 < ~this.field6073) {
                        var8[var11] = var12;
                        var9[var11] = var14;
                        var10[var11] = var7[var11];
                    } else {
                        int var16 = var7[var11];
                        int var17 = -this.field6077[2] + var16;
                        if (var17 < 0) {
                            var17 = -var17;
                        }
                        if (~this.field6073 > ~var17) {
                            var8[var11] = var12;
                            var9[var11] = var14;
                            var10[var11] = var16;
                        } else {
                            var8[var11] = this.field6070 * var12 >> 12;
                            var9[var11] = this.field6072 * var14 >> 12;
                            var10[var11] = this.field6069 * var16 >> 12;
                        }
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ve", name = "<init>", descriptor = "()V")
    public class428() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(IIILan;)Lln;")
    public static final class317 method2544(int arg0, int arg1, int arg2, class21 arg3) {
        if (arg0 > -74) {
            return null;
        } else {
            ++field6076;
            byte[] var4 = arg3.method240(arg2, arg1, (byte) -124);
            return var4 == null ? null : new class317(var4);
        }
    }
}
