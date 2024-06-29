import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!on")
public class class527 {

    @OriginalMember(owner = "client!on", name = "e", descriptor = "Lwm;")
    private class30 field6694;

    @OriginalMember(owner = "client!on", name = "j", descriptor = "I")
    private int field6699;

    @OriginalMember(owner = "client!on", name = "k", descriptor = "[Z")
    private boolean[] field6700;

    @OriginalMember(owner = "client!on", name = "g", descriptor = "[[I")
    private int[][] field6696;

    @OriginalMember(owner = "client!on", name = "a", descriptor = "I")
    public static int field6690;

    @OriginalMember(owner = "client!on", name = "b", descriptor = "I")
    public static int field6691;

    @OriginalMember(owner = "client!on", name = "c", descriptor = "I")
    public static int field6692;

    @OriginalMember(owner = "client!on", name = "d", descriptor = "I")
    public static int field6693;

    @OriginalMember(owner = "client!on", name = "f", descriptor = "I")
    public static int field6695;

    @OriginalMember(owner = "client!on", name = "h", descriptor = "I")
    public static int field6697;

    @OriginalMember(owner = "client!on", name = "i", descriptor = "I")
    public static int field6698;

    @OriginalMember(owner = "client!on", name = "l", descriptor = "[Ljava/lang/String;")
    public static String[] field6701;

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(II)Z")
    public static final boolean method2892(int arg0, int arg1) {
        field6691++;
        if (arg0 != -1) {
            field6701 = null;
        }
        for (class765 var2 = (class765) class595.field7563.method3591(0); var2 != null; var2 = (class765) class595.field7563.method3600((byte) 75)) {
            if (class49.method319(var2.field10412, arg0 ^ 0x3B) && (long) arg1 == var2.field10404) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(B)V")
    public static void method2893(byte arg0) {
        field6701 = null;
        if (arg0 != -48) {
            method2892(-45, 106);
        }
    }

    @OriginalMember(owner = "client!on", name = "b", descriptor = "(B)Z")
    public final boolean method2894(byte arg0) {
        if (arg0 >= -17) {
            return false;
        } else {
            field6698++;
            return this.field6699 != -1;
        }
    }

    @OriginalMember(owner = "client!on", name = "b", descriptor = "(II)[I")
    public final int[] method2895(int arg0, int arg1) {
        field6695++;
        if (arg0 < 0 || arg0 >= this.field6696.length) {
            return this.field6699 == -1 ? new int[0] : new int[] { this.field6699 };
        } else if (this.field6700[arg0] && this.field6696[arg0].length > 1) {
            int var3 = this.field6699 == -1 ? 0 : 1;
            if (arg1 <= 14) {
                field6701 = null;
            }
            Random var4 = new Random();
            int[] var5 = new int[this.field6696[arg0].length];
            class642.method3475(this.field6696[arg0], 0, var5, 0, var5.length);
            for (int var6 = var3; var6 < var5.length; var6++) {
                int var7 = class419.method2416(var5.length - var3, var4, (byte) 125) + var3;
                int var8 = var5[var6];
                var5[var6] = var5[var7];
                var5[var7] = var8;
            }
            return var5;
        } else {
            return this.field6696[arg0];
        }
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(III)V")
    public static final void method2896(int arg0, int arg1, int arg2) {
        field6697++;
        if (arg0 > -67) {
            field6701 = null;
        }
        class614 var3 = class497.method2759(5, 5977, (long) arg2);
        var3.method3277(639);
        var3.field7742 = arg1;
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(IB)Lraa;")
    public final class373 method2897(int arg0, byte arg1) {
        field6690++;
        int var3 = -121 / ((16 - arg1) / 45);
        byte[] var4 = this.field6694.method139(1, (byte) -94, arg0);
        class373 var5 = new class373();
        var5.method2136(new class234(var4), (byte) -94);
        return var5;
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(I[I[J)V")
    public static final void method2898(int arg0, int[] arg1, long[] arg2) {
        if (arg0 < 46) {
            field6701 = null;
        }
        field6692++;
        class313.method1834(1, 0, arg1, arg2.length - 1, arg2);
    }

    @OriginalMember(owner = "client!on", name = "<init>", descriptor = "(Lega;ILwm;)V")
    public class527(class473 arg0, int arg1, class30 arg2) {
        this.field6694 = arg2;
        this.field6694.method138(0, 1);
        class234 var4 = new class234(this.field6694.method139(0, (byte) -94, 0));
        int var5 = var4.method1509(true);
        if (var5 > 3) {
            this.field6696 = new int[0][];
            this.field6700 = new boolean[0];
            this.field6699 = -1;
        } else {
            int var6 = var4.method1509(true);
            class576[] var7 = class512.method2829((byte) -49);
            boolean var8 = true;
            if (var7.length == var6) {
                for (int var9 = 0; var9 < var7.length; var9++) {
                    int var10 = var4.method1509(true);
                    if (var7[var9].field7322 != var10) {
                        var8 = false;
                        break;
                    }
                }
            } else {
                var8 = false;
            }
            if (var8) {
                int var11 = var4.method1509(true);
                int var12 = var4.method1509(true);
                if (var5 <= 2) {
                    this.field6699 = -1;
                } else {
                    this.field6699 = var4.method1542(27067);
                }
                this.field6700 = new boolean[var12 + 1];
                this.field6696 = new int[var12 + 1][];
                for (int var13 = 0; var13 < var11; var13++) {
                    int var15 = var4.method1509(true);
                    this.field6700[var15] = var4.method1509(true) == 1;
                    int var16 = var4.method1553((byte) 28);
                    if (this.field6699 == -1) {
                        this.field6696[var15] = new int[var16];
                        for (int var17 = 0; var17 < var16; var17++) {
                            this.field6696[var15][var17] = var4.method1553((byte) 81);
                        }
                    } else {
                        this.field6696[var15] = new int[var16 + 1];
                        this.field6696[var15][0] = this.field6699;
                        for (int var18 = 0; var18 < var16; var18++) {
                            this.field6696[var15][var18 + 1] = var4.method1553((byte) 38);
                        }
                    }
                }
                for (int var14 = 0; var14 < var12 + 1; var14++) {
                    if (this.field6696[var14] == null) {
                        if (this.field6699 == -1) {
                            this.field6696[var14] = new int[0];
                        } else {
                            this.field6696[var14] = new int[] { this.field6699 };
                        }
                    }
                }
            } else {
                this.field6699 = -1;
                this.field6696 = new int[0][];
                this.field6700 = new boolean[0];
            }
        }
    }
}
