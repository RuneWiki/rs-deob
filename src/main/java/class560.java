import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eo")
public class class560 {

    @OriginalMember(owner = "client!eo", name = "h", descriptor = "Ltf;")
    private class701 field7997;

    @OriginalMember(owner = "client!eo", name = "b", descriptor = "[[I")
    private int[][] field7991;

    @OriginalMember(owner = "client!eo", name = "j", descriptor = "[Z")
    private boolean[] field7999;

    @OriginalMember(owner = "client!eo", name = "d", descriptor = "I")
    private int field7993;

    @OriginalMember(owner = "client!eo", name = "e", descriptor = "Lcq;")
    public static class110 field7994 = new class110(57, -1);

    @OriginalMember(owner = "client!eo", name = "k", descriptor = "[I")
    public static int[] field8000 = new int[1];

    @OriginalMember(owner = "client!eo", name = "g", descriptor = "I")
    public static int field7996;

    @OriginalMember(owner = "client!eo", name = "l", descriptor = "I")
    public static int field8001;

    @OriginalMember(owner = "client!eo", name = "m", descriptor = "I")
    public static int field8002;

    @OriginalMember(owner = "client!eo", name = "i", descriptor = "Ltf;")
    public static class701 field7998;

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "[I")
    public static int[] field7990;

    @OriginalMember(owner = "client!eo", name = "f", descriptor = "[I")
    public static int[] field7995;

    @OriginalMember(owner = "client!eo", name = "c", descriptor = "[[[Z")
    public static boolean[][][] field7992;

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(I)Z", line = 12)
    public final boolean method3177(int arg0) {
        if (arg0 == 11690) {
            field8001++;
            return this.field7993 != -1;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(II)[I", line = 27)
    public final int[] method3178(int arg0, int arg1) {
        field8002++;
        if (arg0 < 0 || this.field7991.length <= arg0) {
            return this.field7993 == -1 ? new int[0] : new int[] { this.field7993 };
        } else if (this.field7999[arg0] && this.field7991[arg0].length > 1) {
            int var3 = this.field7993 == -1 ? 0 : 1;
            Random var4 = new Random();
            int[] var5 = new int[this.field7991[arg0].length];
            class567.method3215(this.field7991[arg0], 0, var5, 0, var5.length);
            for (int var6 = var3; var6 < var5.length; var6++) {
                int var7 = class304.method1756(var4, var5.length - var3, -1304107232) + var3;
                int var8 = var5[var6];
                var5[var6] = var5[var7];
                var5[var7] = var8;
            }
            if (arg1 >= -35) {
                field7992 = null;
            }
            return var5;
        } else {
            return this.field7991[arg0];
        }
    }

    @OriginalMember(owner = "client!eo", name = "b", descriptor = "(II)Lok;", line = 71)
    public final class101 method3179(int arg0, int arg1) {
        field7996++;
        byte[] var3 = this.field7997.method3854((byte) 24, 1, arg0);
        class101 var4 = new class101();
        if (arg1 == 5234) {
            var4.method545(new class115(var3), false);
            return var4;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(B)V", line = 87)
    public static void method3180(byte arg0) {
        field8000 = null;
        if (arg0 != 98) {
            field7994 = null;
        }
        field7995 = null;
        field7992 = null;
        field7994 = null;
        field7990 = null;
        field7998 = null;
    }

    @OriginalMember(owner = "client!eo", name = "<init>", descriptor = "(Lqh;ILtf;)V", line = 106)
    public class560(class320 arg0, int arg1, class701 arg2) {
        this.field7997 = arg2;
        this.field7997.method3883(1, 0);
        class115 var4 = new class115(this.field7997.method3854((byte) 124, 0, 0));
        int var5 = var4.method620((byte) 86);
        if (var5 > 3) {
            this.field7991 = new int[0][];
            this.field7999 = new boolean[0];
            this.field7993 = -1;
        } else {
            int var6 = var4.method620((byte) 16);
            class14[] var7 = class225.method1356(-49);
            boolean var8 = true;
            if (var7.length == var6) {
                for (int var9 = 0; var9 < var7.length; var9++) {
                    int var10 = var4.method620((byte) -126);
                    if (var7[var9].field120 != var10) {
                        var8 = false;
                        break;
                    }
                }
            } else {
                var8 = false;
            }
            if (var8) {
                int var11 = var4.method620((byte) -127);
                int var12 = var4.method620((byte) 69);
                if (var5 <= 2) {
                    this.field7993 = -1;
                } else {
                    this.field7993 = var4.method676(-5);
                }
                this.field7999 = new boolean[var12 + 1];
                this.field7991 = new int[var12 + 1][];
                for (int var13 = 0; var13 < var11; var13++) {
                    int var15 = var4.method620((byte) -30);
                    this.field7999[var15] = var4.method620((byte) -1) == 1;
                    int var16 = var4.method643((byte) -77);
                    if (this.field7993 == -1) {
                        this.field7991[var15] = new int[var16];
                        for (int var17 = 0; var17 < var16; var17++) {
                            this.field7991[var15][var17] = var4.method643((byte) -77);
                        }
                    } else {
                        this.field7991[var15] = new int[var16 + 1];
                        this.field7991[var15][0] = this.field7993;
                        for (int var18 = 0; var18 < var16; var18++) {
                            this.field7991[var15][var18 + 1] = var4.method643((byte) -77);
                        }
                    }
                }
                for (int var14 = 0; var14 < var12 + 1; var14++) {
                    if (this.field7991[var14] == null) {
                        if (this.field7993 == -1) {
                            this.field7991[var14] = new int[0];
                        } else {
                            this.field7991[var14] = new int[] { this.field7993 };
                        }
                    }
                }
            } else {
                this.field7991 = new int[0][];
                this.field7993 = -1;
                this.field7999 = new boolean[0];
            }
        }
    }
}
