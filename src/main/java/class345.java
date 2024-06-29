import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gha")
public class class345 {

    @OriginalMember(owner = "client!gha", name = "b", descriptor = "Leq;")
    private class209 field4854;

    @OriginalMember(owner = "client!gha", name = "m", descriptor = "I")
    private int field4865;

    @OriginalMember(owner = "client!gha", name = "j", descriptor = "[[I")
    private int[][] field4862;

    @OriginalMember(owner = "client!gha", name = "a", descriptor = "[Z")
    private boolean[] field4853;

    @OriginalMember(owner = "client!gha", name = "g", descriptor = "F")
    public static float field4859 = 1.0F;

    @OriginalMember(owner = "client!gha", name = "d", descriptor = "I")
    public static int field4856 = -1;

    @OriginalMember(owner = "client!gha", name = "i", descriptor = "I")
    public static int field4861 = 0;

    @OriginalMember(owner = "client!gha", name = "c", descriptor = "I")
    public static int field4855;

    @OriginalMember(owner = "client!gha", name = "e", descriptor = "I")
    public static int field4857;

    @OriginalMember(owner = "client!gha", name = "h", descriptor = "I")
    public static int field4860;

    @OriginalMember(owner = "client!gha", name = "l", descriptor = "I")
    public static int field4864;

    @OriginalMember(owner = "client!gha", name = "k", descriptor = "Leq;")
    public static class209 field4863;

    @OriginalMember(owner = "client!gha", name = "f", descriptor = "Lclient;")
    public static client field4858;

    @OriginalMember(owner = "client!gha", name = "a", descriptor = "(B)Z", line = 11)
    public final boolean method2178(byte arg0) {
        if (arg0 > -89) {
            field4859 = -2.5033123F;
        }
        field4855++;
        return this.field4865 != -1;
    }

    @OriginalMember(owner = "client!gha", name = "a", descriptor = "(II)Lufa;", line = 28)
    public final class677 method2179(int arg0, int arg1) {
        field4860++;
        if (arg1 != 24900) {
            this.method2179(-6, 40);
        }
        byte[] var3 = this.field4854.method1453(arg0, -126, 1);
        class677 var4 = new class677();
        var4.method3830(new class35(var3), (byte) -125);
        return var4;
    }

    @OriginalMember(owner = "client!gha", name = "a", descriptor = "(IB)[I", line = 52)
    public final int[] method2180(int arg0, byte arg1) {
        field4864++;
        if (arg0 < 0 || this.field4862.length <= arg0) {
            return this.field4865 == -1 ? new int[0] : new int[] { this.field4865 };
        } else if (this.field4853[arg0] && this.field4862[arg0].length > 1) {
            int var3 = this.field4865 == -1 ? 0 : 1;
            Random var4 = new Random();
            int[] var5 = new int[this.field4862[arg0].length];
            if (arg1 > -48) {
                this.method2178((byte) -90);
            }
            class622.method3596(this.field4862[arg0], 0, var5, 0, var5.length);
            for (int var6 = var3; var6 < var5.length; var6++) {
                int var7 = class459.method2800(var4, var5.length - var3, (byte) -82) + var3;
                int var8 = var5[var6];
                var5[var6] = var5[var7];
                var5[var7] = var8;
            }
            return var5;
        } else {
            return this.field4862[arg0];
        }
    }

    @OriginalMember(owner = "client!gha", name = "a", descriptor = "(I)V", line = 102)
    public static void method2181(int arg0) {
        if (arg0 <= 54) {
            field4863 = null;
        }
        field4858 = null;
        field4863 = null;
    }

    @OriginalMember(owner = "client!gha", name = "<init>", descriptor = "(Lcw;ILeq;)V", line = 112)
    public class345(class179 arg0, int arg1, class209 arg2) {
        this.field4854 = arg2;
        this.field4854.method1477(0, 1);
        class35 var4 = new class35(this.field4854.method1453(0, -125, 0));
        int var5 = var4.method273(255);
        if (var5 > 3) {
            this.field4865 = -1;
            this.field4862 = new int[0][];
            this.field4853 = new boolean[0];
        } else {
            int var6 = var4.method273(255);
            class551[] var7 = class316.method2035(16384);
            boolean var8 = true;
            if (var7.length == var6) {
                for (int var9 = 0; var9 < var7.length; var9++) {
                    int var10 = var4.method273(255);
                    if (var7[var9].field7726 != var10) {
                        var8 = false;
                        break;
                    }
                }
            } else {
                var8 = false;
            }
            if (var8) {
                int var11 = var4.method273(255);
                int var12 = var4.method273(255);
                if (var5 > 2) {
                    this.field4865 = var4.method225((byte) 125);
                } else {
                    this.field4865 = -1;
                }
                this.field4862 = new int[var12 + 1][];
                this.field4853 = new boolean[var12 + 1];
                for (int var13 = 0; var13 < var11; var13++) {
                    int var15 = var4.method273(255);
                    this.field4853[var15] = var4.method273(255) == 1;
                    int var16 = var4.method253(-13900);
                    if (this.field4865 == -1) {
                        this.field4862[var15] = new int[var16];
                        for (int var18 = 0; var18 < var16; var18++) {
                            this.field4862[var15][var18] = var4.method253(-13900);
                        }
                    } else {
                        this.field4862[var15] = new int[var16 + 1];
                        this.field4862[var15][0] = this.field4865;
                        for (int var17 = 0; var17 < var16; var17++) {
                            this.field4862[var15][var17 + 1] = var4.method253(-13900);
                        }
                    }
                }
                for (int var14 = 0; var14 < (var12 + 1); var14++) {
                    if (this.field4862[var14] == null) {
                        if (this.field4865 == -1) {
                            this.field4862[var14] = new int[0];
                        } else {
                            this.field4862[var14] = new int[] { this.field4865 };
                        }
                    }
                }
            } else {
                this.field4853 = new boolean[0];
                this.field4865 = -1;
                this.field4862 = new int[0][];
            }
        }
    }
}
