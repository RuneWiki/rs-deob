import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iea")
public class class11 {

    @OriginalMember(owner = "client!iea", name = "f", descriptor = "Lla;")
    private class423 field102;

    @OriginalMember(owner = "client!iea", name = "a", descriptor = "I")
    private int field97;

    @OriginalMember(owner = "client!iea", name = "i", descriptor = "[[I")
    private int[][] field105;

    @OriginalMember(owner = "client!iea", name = "h", descriptor = "[Z")
    private boolean[] field104;

    @OriginalMember(owner = "client!iea", name = "e", descriptor = "[Ljava/lang/String;")
    public static String[] field101 = new String[100];

    @OriginalMember(owner = "client!iea", name = "c", descriptor = "[I")
    public static int[] field99 = new int[4096];

    @OriginalMember(owner = "client!iea", name = "d", descriptor = "Lfba;")
    public static class348 field100 = new class348(32);

    @OriginalMember(owner = "client!iea", name = "l", descriptor = "I")
    public static int field108 = 0;

    @OriginalMember(owner = "client!iea", name = "g", descriptor = "I")
    public static int field103;

    @OriginalMember(owner = "client!iea", name = "j", descriptor = "I")
    public static int field106;

    @OriginalMember(owner = "client!iea", name = "k", descriptor = "I")
    public static int field107;

    @OriginalMember(owner = "client!iea", name = "b", descriptor = "Leg;")
    public static class317 field98;

    @OriginalMember(owner = "client!iea", name = "a", descriptor = "(B)Z", line = 3)
    public final boolean method54(byte arg0) {
        field106++;
        if (arg0 != -88) {
            this.method55(83, -40);
        }
        return this.field97 != -1;
    }

    @OriginalMember(owner = "client!iea", name = "a", descriptor = "(II)Ldba;", line = 16)
    public final class293 method55(int arg0, int arg1) {
        field107++;
        byte[] var3 = this.field102.method2600(0, 1, arg0);
        class293 var4 = new class293();
        if (arg1 == -7424) {
            var4.method1839(new class479(var3), (byte) -121);
            return var4;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!iea", name = "a", descriptor = "(I)V", line = 47)
    public static void method56(int arg0) {
        field101 = null;
        field99 = null;
        field100 = null;
        if (arg0 <= 121) {
            method56(-114);
        }
        field98 = null;
    }

    @OriginalMember(owner = "client!iea", name = "b", descriptor = "(II)[I", line = 60)
    public final int[] method57(int arg0, int arg1) {
        field103++;
        if (arg1 < 0 || this.field105.length <= arg1) {
            return this.field97 == -1 ? new int[0] : new int[] { this.field97 };
        } else if (this.field104[arg1] && this.field105[arg1].length > 1) {
            int var3 = this.field97 == -1 ? 0 : 1;
            Random var4 = new Random();
            int[] var5 = new int[this.field105[arg1].length];
            if (arg0 <= 100) {
                return null;
            }
            class85.method684(this.field105[arg1], 0, var5, 0, var5.length);
            for (int var6 = var3; var6 < var5.length; var6++) {
                int var7 = class151.method1094(var4, 4, var5.length - var3) + var3;
                int var8 = var5[var6];
                var5[var6] = var5[var7];
                var5[var7] = var8;
            }
            return var5;
        } else {
            return this.field105[arg1];
        }
    }

    @OriginalMember(owner = "client!iea", name = "<init>", descriptor = "(Lmp;ILla;)V", line = 118)
    public class11(class315 arg0, int arg1, class423 arg2) {
        this.field102 = arg2;
        this.field102.method2616(1, 0);
        class479 var4 = new class479(this.field102.method2600(0, 0, 0));
        int var5 = var4.method2886(true);
        if (var5 > 3) {
            this.field97 = -1;
            this.field104 = new boolean[0];
            this.field105 = new int[0][];
        } else {
            int var6 = var4.method2886(true);
            class57[] var7 = class347.method2203((byte) 111);
            boolean var8 = true;
            if (var7.length == var6) {
                for (int var9 = 0; var9 < var7.length; var9++) {
                    int var10 = var4.method2886(true);
                    if (var7[var9].field964 != var10) {
                        var8 = false;
                        break;
                    }
                }
            } else {
                var8 = false;
            }
            if (var8) {
                int var11 = var4.method2886(true);
                int var12 = var4.method2886(true);
                if (var5 > 2) {
                    this.field97 = var4.method2870(-11395);
                } else {
                    this.field97 = -1;
                }
                this.field105 = new int[var12 + 1][];
                this.field104 = new boolean[var12 + 1];
                for (int var13 = 0; var13 < var11; var13++) {
                    int var15 = var4.method2886(true);
                    this.field104[var15] = var4.method2886(true) == 1;
                    int var16 = var4.method2882(-1);
                    if (this.field97 == -1) {
                        this.field105[var15] = new int[var16];
                        for (int var18 = 0; var18 < var16; var18++) {
                            this.field105[var15][var18] = var4.method2882(-1);
                        }
                    } else {
                        this.field105[var15] = new int[var16 + 1];
                        this.field105[var15][0] = this.field97;
                        for (int var17 = 0; var17 < var16; var17++) {
                            this.field105[var15][var17 + 1] = var4.method2882(-1);
                        }
                    }
                }
                for (int var14 = 0; var14 < var12 + 1; var14++) {
                    if (this.field105[var14] == null) {
                        if (this.field97 == -1) {
                            this.field105[var14] = new int[0];
                        } else {
                            this.field105[var14] = new int[] { this.field97 };
                        }
                    }
                }
            } else {
                this.field105 = new int[0][];
                this.field104 = new boolean[0];
                this.field97 = -1;
            }
        }
    }
}
