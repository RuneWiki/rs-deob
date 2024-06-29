import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!daa")
public class class11 extends class314 {

    @OriginalMember(owner = "client!daa", name = "N", descriptor = "I")
    private int field181 = 2000;

    @OriginalMember(owner = "client!daa", name = "V", descriptor = "I")
    private int field189 = 16;

    @OriginalMember(owner = "client!daa", name = "X", descriptor = "I")
    private int field191 = 0;

    @OriginalMember(owner = "client!daa", name = "W", descriptor = "I")
    private int field190 = 0;

    @OriginalMember(owner = "client!daa", name = "U", descriptor = "I")
    private int field188 = 4096;

    @OriginalMember(owner = "client!daa", name = "Q", descriptor = "I")
    public static int field184 = 16777215;

    @OriginalMember(owner = "client!daa", name = "T", descriptor = "I")
    public static int field187 = 0;

    @OriginalMember(owner = "client!daa", name = "Y", descriptor = "Z")
    public static boolean field192 = false;

    @OriginalMember(owner = "client!daa", name = "M", descriptor = "I")
    public static int field180;

    @OriginalMember(owner = "client!daa", name = "O", descriptor = "I")
    public static int field182;

    @OriginalMember(owner = "client!daa", name = "R", descriptor = "I")
    public static int field185;

    @OriginalMember(owner = "client!daa", name = "S", descriptor = "I")
    public static int field186;

    @OriginalMember(owner = "client!daa", name = "L", descriptor = "Lhga;")
    public static class158 field179;

    @OriginalMember(owner = "client!daa", name = "P", descriptor = "Lis;")
    public static class464 field183;

    @OriginalMember(owner = "client!daa", name = "a", descriptor = "(II)[I", line = 6)
    public final int[] method6(int arg0, int arg1) {
        ++field185;
        if (arg1 < 109) {
            method199(-109);
        }
        int[] var3 = super.field4928.method534((byte) -79, arg0);
        if (super.field4928.field618) {
            int var4 = this.field188 >> 1;
            int[][] var5 = super.field4928.method531((byte) -117);
            Random var6 = new Random((long) this.field190);
            for (int var7 = 0; ~this.field181 < ~var7; ++var7) {
                int var8 = this.field188 <= 0 ? this.field191 : this.field191 + class93.method902(8047, var6, this.field188) - var4;
                int var9 = 255 & var8 >> 4;
                int var10 = class93.method902(8047, var6, class81.field1009);
                int var11 = class93.method902(8047, var6, class246.field3926);
                int var12 = (class174.field2873[var9] * this.field189 >> 12) + var10;
                int var13 = (class204.field3328[var9] * this.field189 >> 12) + var11;
                int var14 = var13 - var11;
                int var15 = -var10 + var12;
                if (var15 != 0 || ~var14 != -1) {
                    if (~var14 > -1) {
                        var14 = -var14;
                    }
                    if (var15 < 0) {
                        var15 = -var15;
                    }
                    boolean var16 = ~var15 > ~var14;
                    if (var16) {
                        int var17 = var10;
                        var10 = var11;
                        int var18 = var12;
                        var11 = var17;
                        var12 = var13;
                        var13 = var18;
                    }
                    if (var10 > var12) {
                        int var19 = var10;
                        var10 = var12;
                        int var20 = var11;
                        var11 = var13;
                        var12 = var19;
                        var13 = var20;
                    }
                    int var21 = var11;
                    int var22 = var12 - var10;
                    int var23 = var13 - var11;
                    int var24 = -var22 / 2;
                    int var25 = 2048 / var22;
                    int var26 = -(class93.method902(8047, var6, 4096) >> 2) + 1024;
                    int var27 = ~var13 < ~var11 ? 1 : -1;
                    if (~var23 > -1) {
                        var23 = -var23;
                    }
                    for (int var28 = var10; var12 > var28; ++var28) {
                        int var29 = (var28 - var10) * var25 + var26 + 1024;
                        int var30 = var28 & class504.field7373;
                        int var31 = class66.field849 & var21;
                        if (!var16) {
                            var5[var30][var31] = var29;
                        } else {
                            var5[var31][var30] = var29;
                        }
                        var24 += var23;
                        if (~var24 < -1) {
                            var21 += var27;
                            var24 -= var22;
                        }
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!daa", name = "a", descriptor = "(Lie;B)V", line = 141)
    public static final void method198(class6 arg0, byte arg1) {
        ++field182;
        for (int var2 = 0; var2 < class693.field9717; ++var2) {
            int var3 = arg0.method88((byte) 90);
            int var4 = arg0.method67(arg1 ^ 11953);
            if (~var4 == -65536) {
                var4 = -1;
            }
            if (class634.field8913[var3] != null) {
                class634.field8913[var3].field9196 = var4;
            }
        }
        if (arg1 != 68) {
            method198((class6) null, (byte) 74);
        }
    }

    @OriginalMember(owner = "client!daa", name = "<init>", descriptor = "()V", line = 174)
    public class11() {
        super(0, true);
    }

    @OriginalMember(owner = "client!daa", name = "h", descriptor = "(I)V", line = 177)
    public static void method199(int arg0) {
        if (arg0 != 16777215) {
            field184 = -11;
        }
        field179 = null;
        field183 = null;
    }

    @OriginalMember(owner = "client!daa", name = "a", descriptor = "(BLie;I)V", line = 188)
    public final void method5(byte arg0, class6 arg1, int arg2) {
        if (arg2 != 0) {
            if (arg2 != 1) {
                if (~arg2 != -3) {
                    if (arg2 != 3) {
                        if (arg2 == 4) {
                            this.field188 = arg1.method67(12021);
                        }
                    } else {
                        this.field191 = arg1.method67(12021);
                    }
                } else {
                    this.field189 = arg1.method70(-9059);
                }
            } else {
                this.field181 = arg1.method67(12021);
            }
        } else {
            this.field190 = arg1.method70(-9059);
        }
        ++field180;
        if (arg0 >= -1) {
            this.method6(71, -91);
        }
    }

    @OriginalMember(owner = "client!daa", name = "a", descriptor = "(B)V", line = 252)
    public final void method3(byte arg0) {
        if (arg0 != -15) {
            this.method3((byte) 14);
        }
        class46.method546(arg0 ^ 15546);
        ++field186;
    }
}
