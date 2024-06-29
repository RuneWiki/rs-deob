import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fu")
public class class639 {

    @OriginalMember(owner = "client!fu", name = "j", descriptor = "Lwu;")
    private class557 field9085;

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "I")
    private int field9076;

    @OriginalMember(owner = "client!fu", name = "c", descriptor = "[[I")
    private int[][] field9078;

    @OriginalMember(owner = "client!fu", name = "d", descriptor = "[Z")
    private boolean[] field9079;

    @OriginalMember(owner = "client!fu", name = "g", descriptor = "Low;")
    public static class747 field9082 = new class747("", 14);

    @OriginalMember(owner = "client!fu", name = "b", descriptor = "I")
    public static int field9077;

    @OriginalMember(owner = "client!fu", name = "e", descriptor = "I")
    public static int field9080;

    @OriginalMember(owner = "client!fu", name = "h", descriptor = "I")
    public static int field9083;

    @OriginalMember(owner = "client!fu", name = "i", descriptor = "I")
    public static int field9084;

    @OriginalMember(owner = "client!fu", name = "k", descriptor = "I")
    public static int field9086;

    @OriginalMember(owner = "client!fu", name = "l", descriptor = "I")
    public static int field9087;

    @OriginalMember(owner = "client!fu", name = "f", descriptor = "Lcw;")
    public static class21 field9081;

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "(B[B)Ljava/lang/String;", line = 6)
    public static final String method3713(byte arg0, byte[] arg1) {
        if (arg0 != -74) {
            method3713((byte) 73, null);
        }
        field9083++;
        return class748.method4161(0, arg1, arg1.length, true);
    }

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "(Z)V", line = 17)
    public static void method3714(boolean arg0) {
        field9082 = null;
        field9081 = null;
        if (arg0) {
            method3713((byte) 64, null);
        }
    }

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "(II)[I", line = 32)
    public final int[] method3715(int arg0, int arg1) {
        field9080++;
        if (arg1 < arg0 || arg1 >= this.field9078.length) {
            return this.field9076 == -1 ? new int[0] : new int[] { this.field9076 };
        } else if (this.field9079[arg1] && this.field9078[arg1].length > 1) {
            int var3 = this.field9076 == -1 ? 0 : 1;
            Random var4 = new Random();
            int[] var5 = new int[this.field9078[arg1].length];
            class34.method244(this.field9078[arg1], 0, var5, 0, var5.length);
            for (int var6 = var3; var6 < var5.length; var6++) {
                int var7 = var3 + class99.method676(var5.length - var3, var4, -58);
                int var8 = var5[var6];
                var5[var6] = var5[var7];
                var5[var7] = var8;
            }
            return var5;
        } else {
            return this.field9078[arg1];
        }
    }

    @OriginalMember(owner = "client!fu", name = "b", descriptor = "(II)Lgk;", line = 75)
    public final class181 method3716(int arg0, int arg1) {
        field9084++;
        byte[] var3 = this.field9085.method3322(1, arg1, (byte) 123);
        class181 var4 = new class181();
        var4.method1210(new class26(var3), arg0 ^ 0xFFFF8B7C);
        return arg0 == 29944 ? var4 : null;
    }

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "(I)Z", line = 103)
    public final boolean method3717(int arg0) {
        field9086++;
        if (arg0 != 0) {
            field9087 = 110;
        }
        return this.field9076 != -1;
    }

    @OriginalMember(owner = "client!fu", name = "<init>", descriptor = "(Lwj;ILwu;)V", line = 114)
    public class639(class121 arg0, int arg1, class557 arg2) {
        this.field9085 = arg2;
        this.field9085.method3333(1, 3443);
        class26 var4 = new class26(this.field9085.method3322(0, 0, (byte) 84));
        int var5 = var4.method194((byte) 119);
        if (var5 > 3) {
            this.field9078 = new int[0][];
            this.field9079 = new boolean[0];
            this.field9076 = -1;
        } else {
            int var6 = var4.method194((byte) 119);
            class214[] var7 = class329.method1917(-79);
            boolean var8 = true;
            if (var7.length == var6) {
                for (int var9 = 0; var9 < var7.length; var9++) {
                    int var10 = var4.method194((byte) 119);
                    if (var7[var9].field3020 != var10) {
                        var8 = false;
                        break;
                    }
                }
            } else {
                var8 = false;
            }
            if (var8) {
                int var11 = var4.method194((byte) 119);
                int var12 = var4.method194((byte) 119);
                if (var5 <= 2) {
                    this.field9076 = -1;
                } else {
                    this.field9076 = var4.method173(-3);
                }
                this.field9078 = new int[var12 + 1][];
                this.field9079 = new boolean[var12 + 1];
                for (int var13 = 0; var13 < var11; var13++) {
                    int var15 = var4.method194((byte) 119);
                    this.field9079[var15] = var4.method194((byte) 119) == 1;
                    int var16 = var4.method193(2);
                    if (this.field9076 == -1) {
                        this.field9078[var15] = new int[var16];
                        for (int var17 = 0; var17 < var16; var17++) {
                            this.field9078[var15][var17] = var4.method193(2);
                        }
                    } else {
                        this.field9078[var15] = new int[var16 + 1];
                        this.field9078[var15][0] = this.field9076;
                        for (int var18 = 0; var18 < var16; var18++) {
                            this.field9078[var15][var18 + 1] = var4.method193(2);
                        }
                    }
                }
                for (int var14 = 0; var14 < var12 + 1; var14++) {
                    if (this.field9078[var14] == null) {
                        if (this.field9076 == -1) {
                            this.field9078[var14] = new int[0];
                        } else {
                            this.field9078[var14] = new int[] { this.field9076 };
                        }
                    }
                }
            } else {
                this.field9078 = new int[0][];
                this.field9076 = -1;
                this.field9079 = new boolean[0];
            }
        }
    }
}
