import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!og")
public class class42 extends class114 {

    @OriginalMember(owner = "client!og", name = "F", descriptor = "[I")
    public static int[] field625 = new int[2];

    @OriginalMember(owner = "client!og", name = "O", descriptor = "I")
    public static int field627 = 0;

    @OriginalMember(owner = "client!og", name = "T", descriptor = "I")
    public static int field632 = 64;

    @OriginalMember(owner = "client!og", name = "N", descriptor = "Lsc;")
    public static class166 field626 = new class166();

    @OriginalMember(owner = "client!og", name = "W", descriptor = "I")
    public static int field635 = 0;

    @OriginalMember(owner = "client!og", name = "P", descriptor = "I")
    public static int field628;

    @OriginalMember(owner = "client!og", name = "Q", descriptor = "I")
    public static int field629;

    @OriginalMember(owner = "client!og", name = "R", descriptor = "I")
    public static int field630;

    @OriginalMember(owner = "client!og", name = "S", descriptor = "I")
    public static int field631;

    @OriginalMember(owner = "client!og", name = "V", descriptor = "I")
    public static int field634;

    @OriginalMember(owner = "client!og", name = "U", descriptor = "Lwd;")
    public static class161 field633;

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(Lbj;II)V")
    public final void method13(class215 arg0, int arg1, int arg2) {
        if (arg1 == 0) {
            super.field1648 = arg0.method1374((byte) -60) == 1;
        }
        ++field628;
        if (arg2 != 12953) {
            this.method73((byte) -45, 24);
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(IZ)[I")
    public final int[] method16(int arg0, boolean arg1) {
        ++field634;
        if (arg1) {
            field627 = -125;
        }
        int[] var3 = super.field1630.method302(arg0, -124);
        if (super.field1630.field710) {
            int[] var4 = this.method729(arg0, 0, 0);
            int[] var5 = this.method729(arg0, 0, 1);
            int[] var6 = this.method729(arg0, 0, 2);
            for (int var7 = 0; var7 < class145.field2009; ++var7) {
                int var8 = var6[var7];
                if (~var8 != -4097) {
                    if (var8 == 0) {
                        var3[var7] = var5[var7];
                    } else {
                        var3[var7] = (4096 - var8) * var5[var7] + var4[var7] * var8 >> 12;
                    }
                } else {
                    var3[var7] = var4[var7];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!og", name = "c", descriptor = "(B)V")
    public static final void method282(byte arg0) {
        if (arg0 < 9) {
            method284(-90, (String) null, (byte) 2);
        }
        ++field631;
        class215.field3297.method944(85);
    }

    @OriginalMember(owner = "client!og", name = "h", descriptor = "(I)V")
    public static void method283(int arg0) {
        field626 = null;
        if (arg0 == 0) {
            field633 = null;
            field625 = null;
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(BI)[[I")
    public final int[][] method73(byte arg0, int arg1) {
        ++field629;
        int[][] var3 = super.field1627.method104(arg1, (byte) 121);
        if (super.field1627.field280) {
            int[] var4 = this.method729(arg1, 0, 2);
            int[][] var5 = this.method727(0, arg1, 842);
            int[][] var6 = this.method727(1, arg1, 842);
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            int[] var10 = var5[1];
            int[] var11 = var5[0];
            int[] var12 = var5[2];
            int[] var13 = var6[0];
            int[] var14 = var6[1];
            int[] var15 = var6[2];
            for (int var16 = 0; class145.field2009 > var16; ++var16) {
                int var17 = var4[var16];
                if (var17 != 4096) {
                    if (~var17 != -1) {
                        int var18 = 4096 - var17;
                        var7[var16] = var11[var16] * var17 + var13[var16] * var18 >> 12;
                        var8[var16] = var10[var16] * var17 - -(var14[var16] * var18) >> 12;
                        var9[var16] = var12[var16] * var17 + var15[var16] * var18 >> 12;
                    } else {
                        var7[var16] = var13[var16];
                        var8[var16] = var14[var16];
                        var9[var16] = var15[var16];
                    }
                } else {
                    var7[var16] = var11[var16];
                    var8[var16] = var10[var16];
                    var9[var16] = var12[var16];
                }
            }
        }
        if (arg0 != -112) {
            method284(-60, (String) null, (byte) -58);
        }
        return var3;
    }

    @OriginalMember(owner = "client!og", name = "<init>", descriptor = "()V")
    public class42() {
        super(3, false);
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(ILjava/lang/String;B)V")
    public static final void method284(int arg0, String arg1, byte arg2) {
        class231.field3614.method809(127, arg2 + 85);
        if (arg2 != -85) {
            field632 = -93;
        }
        class231.field3614.method1363(class231.method1518(arg1, 42) + 1, arg2 + 29);
        class231.field3614.method1391(98, arg0);
        ++field630;
        ++class250.field3911;
        class231.field3614.method1384(arg1, -595448376);
    }
}
