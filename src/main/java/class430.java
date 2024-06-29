import java.awt.datatransfer.Clipboard;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qq")
public class class430 extends class747 {

    @OriginalMember(owner = "client!qq", name = "J", descriptor = "I")
    private int field6020 = 0;

    @OriginalMember(owner = "client!qq", name = "K", descriptor = "I")
    private int field6021 = 4096;

    @OriginalMember(owner = "client!qq", name = "F", descriptor = "I")
    public static int field6016 = -2;

    @OriginalMember(owner = "client!qq", name = "E", descriptor = "I")
    public static int field6015;

    @OriginalMember(owner = "client!qq", name = "H", descriptor = "I")
    public static int field6018;

    @OriginalMember(owner = "client!qq", name = "I", descriptor = "I")
    public static int field6019;

    @OriginalMember(owner = "client!qq", name = "L", descriptor = "I")
    public static int field6022;

    @OriginalMember(owner = "client!qq", name = "G", descriptor = "Ljava/awt/datatransfer/Clipboard;")
    public static Clipboard field6017;

    @OriginalMember(owner = "client!qq", name = "b", descriptor = "(II)[[I")
    public final int[][] method688(int arg0, int arg1) {
        ++field6019;
        int[][] var3 = super.field10289.method2200(0, arg1);
        if (super.field10289.field4906) {
            int[][] var4 = this.method4158(0, arg1, 2);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; class73.field1095 > var11; ++var11) {
                int var12 = var5[var11];
                int var13 = var6[var11];
                int var14 = var7[var11];
                if (~this.field6020 < ~var12) {
                    var8[var11] = this.field6020;
                } else if (~this.field6021 > ~var12) {
                    var8[var11] = this.field6021;
                } else {
                    var8[var11] = var12;
                }
                if (this.field6020 > var13) {
                    var9[var11] = this.field6020;
                } else if (this.field6021 < var13) {
                    var9[var11] = this.field6021;
                } else {
                    var9[var11] = var13;
                }
                if (~this.field6020 < ~var14) {
                    var10[var11] = this.field6020;
                } else if (this.field6021 < var14) {
                    var10[var11] = this.field6021;
                } else {
                    var10[var11] = var14;
                }
            }
        }
        int var15 = -34 / ((35 - arg0) / 58);
        return var3;
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(Ldc;II)V")
    public final void method183(class63 arg0, int arg1, int arg2) {
        ++field6022;
        if (~arg2 != -1) {
            if (arg2 != 1) {
                if (~arg2 == -3) {
                    super.field10281 = ~arg0.method505((byte) -119) == -2;
                }
            } else {
                this.field6021 = arg0.method482(-772591672);
            }
        } else {
            this.field6020 = arg0.method482(arg1 + -772603280);
        }
        if (arg1 != 11608) {
            this.field6020 = -6;
        }
    }

    @OriginalMember(owner = "client!qq", name = "c", descriptor = "(I)V")
    public static void method2663(int arg0) {
        field6017 = null;
        if (arg0 != -7213) {
            field6016 = 1;
        }
    }

    @OriginalMember(owner = "client!qq", name = "<init>", descriptor = "()V")
    public class430() {
        super(1, false);
    }

    @OriginalMember(owner = "client!qq", name = "d", descriptor = "(I)I")
    public static final int method2664(int arg0) {
        int var1 = 15 % ((-61 - arg0) / 50);
        ++field6015;
        return class544.field7547++;
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(II)[I")
    public final int[] method182(int arg0, int arg1) {
        ++field6018;
        if (arg1 >= -89) {
            method2663(36);
        }
        int[] var3 = super.field10279.method3479(true, arg0);
        if (super.field10279.field8263) {
            int[] var4 = this.method4156(84, arg0, 0);
            for (int var5 = 0; var5 < class73.field1095; ++var5) {
                int var6 = var4[var5];
                if (~var6 > ~this.field6020) {
                    var3[var5] = this.field6020;
                } else if (~this.field6021 <= ~var6) {
                    var3[var5] = var6;
                } else {
                    var3[var5] = this.field6021;
                }
            }
        }
        return var3;
    }
}
