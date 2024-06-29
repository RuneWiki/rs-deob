import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!r")
public class class433 extends class305 {

    @OriginalMember(owner = "client!r", name = "D", descriptor = "I")
    private int field6425 = 2000;

    @OriginalMember(owner = "client!r", name = "G", descriptor = "I")
    private int field6428 = 0;

    @OriginalMember(owner = "client!r", name = "K", descriptor = "I")
    private int field6432 = 4096;

    @OriginalMember(owner = "client!r", name = "N", descriptor = "I")
    private int field6435 = 0;

    @OriginalMember(owner = "client!r", name = "L", descriptor = "I")
    private int field6433 = 16;

    @OriginalMember(owner = "client!r", name = "J", descriptor = "Lpu;")
    public static class179 field6431 = new class179("Loading...", "Lade...", "Chargement en cours...", "Carregando...");

    @OriginalMember(owner = "client!r", name = "M", descriptor = "Lpu;")
    public static class179 field6434 = new class179("Please wait...", "Bitte warte...", "Veuillez patienter...", "Aguarde...");

    @OriginalMember(owner = "client!r", name = "P", descriptor = "[I")
    public static int[] field6437 = new int[14];

    @OriginalMember(owner = "client!r", name = "E", descriptor = "I")
    public static int field6426;

    @OriginalMember(owner = "client!r", name = "F", descriptor = "I")
    public static int field6427;

    @OriginalMember(owner = "client!r", name = "H", descriptor = "I")
    public static int field6429;

    @OriginalMember(owner = "client!r", name = "I", descriptor = "I")
    public static int field6430;

    @OriginalMember(owner = "client!r", name = "O", descriptor = "[Lji;")
    public static class253[] field6436;

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(ILfh;B)V")
    public final void method14(int arg0, class194 arg1, byte arg2) {
        ++field6429;
        if (arg0 != 0) {
            if (~arg0 != -2) {
                if (arg0 != 2) {
                    if (~arg0 != -4) {
                        if (arg0 == 4) {
                            this.field6432 = arg1.method1396(62);
                        }
                    } else {
                        this.field6428 = arg1.method1396(22);
                    }
                } else {
                    this.field6433 = arg1.method1337((byte) -110);
                }
            } else {
                this.field6425 = arg1.method1396(-82);
            }
        } else {
            this.field6435 = arg1.method1337((byte) -126);
        }
        if (arg2 <= 76) {
            this.method17((byte) -124);
        }
    }

    @OriginalMember(owner = "client!r", name = "<init>", descriptor = "()V")
    public class433() {
        super(0, true);
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Z)V")
    public static void method2690(boolean arg0) {
        field6437 = null;
        field6436 = null;
        field6434 = null;
        if (arg0) {
            field6431 = null;
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(II)[I")
    public final int[] method15(int arg0, int arg1) {
        ++field6430;
        int[] var3 = super.field4677.method2174(arg0, -122);
        if (super.field4677.field5040) {
            int var4 = this.field6432 >> 1;
            int[][] var5 = super.field4677.method2177((byte) -111);
            Random var6 = new Random((long) this.field6435);
            for (int var7 = 0; this.field6425 > var7; ++var7) {
                int var8 = ~this.field6432 < -1 ? this.field6428 - (var4 + -class58.method378(false, this.field6432, var6)) : this.field6428;
                int var9 = var8 >> 4 & 255;
                int var10 = class58.method378(false, class91.field1471, var6);
                int var11 = class58.method378(false, class537.field7884, var6);
                int var12 = (class480.field7043[var9] * this.field6433 >> 12) + var10;
                int var13 = var11 - -(class417.field6133[var9] * this.field6433 >> 12);
                int var14 = -var11 + var13;
                int var15 = var12 - var10;
                if (var15 != 0 || ~var14 != -1) {
                    if (~var14 > -1) {
                        var14 = -var14;
                    }
                    if (var15 < 0) {
                        var15 = -var15;
                    }
                    boolean var16 = ~var14 < ~var15;
                    if (var16) {
                        int var17 = var10;
                        int var18 = var12;
                        var10 = var11;
                        var12 = var13;
                        var11 = var17;
                        var13 = var18;
                    }
                    if (~var12 > ~var10) {
                        int var19 = var10;
                        var10 = var12;
                        int var20 = var11;
                        var12 = var19;
                        var11 = var13;
                        var13 = var20;
                    }
                    int var21 = var11;
                    int var22 = -var10 + var12;
                    int var23 = -var11 + var13;
                    int var24 = -var22 / 2;
                    int var25 = 2048 / var22;
                    int var26 = 1024 - (class58.method378(false, 4096, var6) >> 2);
                    int var27 = var13 <= var11 ? -1 : 1;
                    if (var23 < 0) {
                        var23 = -var23;
                    }
                    for (int var28 = var10; ~var12 < ~var28; ++var28) {
                        int var29 = var26 - -((var28 - var10) * var25) + 1024;
                        int var30 = var28 & class228.field3447;
                        int var31 = var21 & class236.field3551;
                        var24 += var23;
                        if (var16) {
                            var5[var31][var30] = var29;
                        } else {
                            var5[var30][var31] = var29;
                        }
                        if (~var24 < -1) {
                            var24 += -var22;
                            var21 += var27;
                        }
                    }
                }
            }
        }
        if (arg1 != 4688) {
            this.method17((byte) -62);
        }
        return var3;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(B)V")
    public final void method17(byte arg0) {
        class441.method2728(false);
        ++field6427;
        if (arg0 != -62) {
            this.field6435 = 27;
        }
    }
}
