import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rj")
public class class596 {

    @OriginalMember(owner = "client!rj", name = "g", descriptor = "Lni;")
    private class522 field8308;

    @OriginalMember(owner = "client!rj", name = "b", descriptor = "I")
    private int field8303;

    @OriginalMember(owner = "client!rj", name = "e", descriptor = "[Z")
    private boolean[] field8306;

    @OriginalMember(owner = "client!rj", name = "l", descriptor = "[[I")
    private int[][] field8313;

    @OriginalMember(owner = "client!rj", name = "c", descriptor = "I")
    public static int field8304 = 0;

    @OriginalMember(owner = "client!rj", name = "j", descriptor = "Lsba;")
    public static class218 field8311 = null;

    @OriginalMember(owner = "client!rj", name = "k", descriptor = "[I")
    public static int[] field8312 = new int[] { 1, 4, 1, 2 };

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "I")
    public static int field8302;

    @OriginalMember(owner = "client!rj", name = "d", descriptor = "I")
    public static int field8305;

    @OriginalMember(owner = "client!rj", name = "f", descriptor = "I")
    public static int field8307;

    @OriginalMember(owner = "client!rj", name = "h", descriptor = "I")
    public static int field8309;

    @OriginalMember(owner = "client!rj", name = "i", descriptor = "I")
    public static int field8310;

    @OriginalMember(owner = "client!rj", name = "m", descriptor = "I")
    public static int field8314;

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(BILoi;)V", line = 4)
    public static final void method3298(byte arg0, int arg1, class74 arg2) {
        if (arg0 != 37) {
            field8311 = null;
        }
        if (arg2.field821 != null) {
            int var3 = arg2.field821[arg1 + 1];
            if (arg2.field871 != var3) {
                arg2.field871 = var3;
                arg2.field811 = 0;
                arg2.field897 = arg2.field895;
                arg2.field806 = 1;
                arg2.field862 = 0;
                arg2.field846 = 0;
                if (arg2.field871 != -1) {
                    class153.method930((byte) -127, arg2, arg2.field846, class460.field6365.method1090(arg2.field871, arg0 + 16346));
                }
            }
        }
        field8307++;
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(IB)[I", line = 34)
    public final int[] method3299(int arg0, byte arg1) {
        field8305++;
        if (arg0 < 0 || arg0 >= this.field8313.length) {
            return this.field8303 == -1 ? new int[0] : new int[] { this.field8303 };
        } else if (this.field8306[arg0] && this.field8313[arg0].length > 1) {
            if (arg1 < 86) {
                this.method3299(9, (byte) 114);
            }
            int var3 = this.field8303 == -1 ? 0 : 1;
            Random var4 = new Random();
            int[] var5 = new int[this.field8313[arg0].length];
            class373.method2191(this.field8313[arg0], 0, var5, 0, var5.length);
            for (int var6 = var3; var6 < var5.length; var6++) {
                int var7 = class676.method3842(-28737, var5.length - var3, var4) + var3;
                int var8 = var5[var6];
                var5[var6] = var5[var7];
                var5[var7] = var8;
            }
            return var5;
        } else {
            return this.field8313[arg0];
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(II)Lie;", line = 84)
    public final class6 method3300(int arg0, int arg1) {
        int var3 = -31 % ((-arg0 - 52) / 54);
        field8310++;
        byte[] var4 = this.field8308.method2885(arg1, 1, false);
        class6 var5 = new class6();
        var5.method16(0, new class611(var4));
        return var5;
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(I)Z", line = 108)
    public final boolean method3301(int arg0) {
        field8302++;
        if (arg0 != 1) {
            this.field8306 = null;
        }
        return this.field8303 != -1;
    }

    @OriginalMember(owner = "client!rj", name = "b", descriptor = "(I)V", line = 123)
    public static void method3302(int arg0) {
        field8312 = null;
        if (arg0 != 0) {
            method3298((byte) -59, -38, null);
        }
        field8311 = null;
    }

    @OriginalMember(owner = "client!rj", name = "<init>", descriptor = "(Lrga;ILni;)V", line = 141)
    public class596(class242 arg0, int arg1, class522 arg2) {
        this.field8308 = arg2;
        this.field8308.method2901(0, 1);
        class611 var4 = new class611(this.field8308.method2885(0, 0, false));
        int var5 = var4.method3428((byte) 67);
        if (var5 > 3) {
            this.field8306 = new boolean[0];
            this.field8313 = new int[0][];
            this.field8303 = -1;
        } else {
            int var6 = var4.method3428((byte) 37);
            class750[] var7 = class185.method1045(false);
            boolean var8 = true;
            if (var7.length == var6) {
                for (int var9 = 0; var9 < var7.length; var9++) {
                    int var10 = var4.method3428((byte) 9);
                    if (var7[var9].field10400 != var10) {
                        var8 = false;
                        break;
                    }
                }
            } else {
                var8 = false;
            }
            if (var8) {
                int var11 = var4.method3428((byte) -110);
                int var12 = var4.method3428((byte) 49);
                if (var5 <= 2) {
                    this.field8303 = -1;
                } else {
                    this.field8303 = var4.method3413(false);
                }
                this.field8306 = new boolean[var12 + 1];
                this.field8313 = new int[var12 + 1][];
                for (int var13 = 0; var13 < var11; var13++) {
                    int var15 = var4.method3428((byte) -108);
                    this.field8306[var15] = var4.method3428((byte) -120) == 1;
                    int var16 = var4.method3402((byte) 127);
                    if (this.field8303 == -1) {
                        this.field8313[var15] = new int[var16];
                        for (int var17 = 0; var17 < var16; var17++) {
                            this.field8313[var15][var17] = var4.method3402((byte) 127);
                        }
                    } else {
                        this.field8313[var15] = new int[var16 + 1];
                        this.field8313[var15][0] = this.field8303;
                        for (int var18 = 0; var18 < var16; var18++) {
                            this.field8313[var15][var18 + 1] = var4.method3402((byte) 127);
                        }
                    }
                }
                for (int var14 = 0; var14 < var12 + 1; var14++) {
                    if (this.field8313[var14] == null) {
                        if (this.field8303 == -1) {
                            this.field8313[var14] = new int[0];
                        } else {
                            this.field8313[var14] = new int[] { this.field8303 };
                        }
                    }
                }
            } else {
                this.field8303 = -1;
                this.field8306 = new boolean[0];
                this.field8313 = new int[0][];
            }
        }
    }
}
