import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kn")
public class class494 {

    @OriginalMember(owner = "client!kn", name = "e", descriptor = "Lga;")
    private class332 field6811;

    @OriginalMember(owner = "client!kn", name = "b", descriptor = "I")
    private int field6808;

    @OriginalMember(owner = "client!kn", name = "f", descriptor = "[Z")
    private boolean[] field6812;

    @OriginalMember(owner = "client!kn", name = "j", descriptor = "[[I")
    private int[][] field6816;

    @OriginalMember(owner = "client!kn", name = "c", descriptor = "I")
    public static int field6809 = 1;

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "I")
    public static int field6807;

    @OriginalMember(owner = "client!kn", name = "g", descriptor = "I")
    public static int field6813;

    @OriginalMember(owner = "client!kn", name = "h", descriptor = "I")
    public static int field6814;

    @OriginalMember(owner = "client!kn", name = "i", descriptor = "I")
    public static int field6815;

    @OriginalMember(owner = "client!kn", name = "d", descriptor = "Lit;")
    public static class513 field6810;

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(II)[I", line = 5)
    public final int[] method2817(int arg0, int arg1) {
        field6814++;
        if (arg0 < 0 || this.field6816.length <= arg0) {
            return this.field6808 == -1 ? new int[0] : new int[] { this.field6808 };
        } else if (this.field6812[arg0] && this.field6816[arg0].length > 1) {
            int var3 = this.field6808 == -1 ? 0 : 1;
            if (arg1 <= 75) {
                this.method2817(-104, -63);
            }
            Random var4 = new Random();
            int[] var5 = new int[this.field6816[arg0].length];
            class2.method10(this.field6816[arg0], 0, var5, 0, var5.length);
            for (int var6 = var3; var6 < var5.length; var6++) {
                int var7 = class584.method3227(false, var5.length - var3, var4) + var3;
                int var8 = var5[var6];
                var5[var6] = var5[var7];
                var5[var7] = var8;
            }
            return var5;
        } else {
            return this.field6816[arg0];
        }
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(IZ[B)V", line = 58)
    public static final void method2818(int arg0, boolean arg1, byte[] arg2) {
        field6813++;
        if (arg0 != 15409) {
            return;
        }
        if (class344.field4613 == null) {
            class344.field4613 = new class157(20000);
        }
        class344.field4613.method949(arg2, arg2.length, 0, (byte) -28);
        if (!arg1) {
            return;
        }
        class637.method3529(0, class344.field4613.field2199);
        class159.field2279 = new class277[class184.field2565];
        int var3 = 0;
        for (int var4 = class16.field210; var4 <= class663.field9446; var4++) {
            class277 var5 = class393.method2264(var4, arg0 - 15391);
            if (var5 != null) {
                class159.field2279[var3++] = var5;
            }
        }
        class30.field427 = false;
        class4.field36 = class529.method2982((byte) -69);
        class344.field4613 = null;
    }

    @OriginalMember(owner = "client!kn", name = "b", descriptor = "(II)Lraa;", line = 99)
    public final class679 method2819(int arg0, int arg1) {
        field6807++;
        if (arg0 == -1) {
            byte[] var3 = this.field6811.method1938(arg1, 1, -17);
            class679 var4 = new class679();
            var4.method3871((byte) -108, new class157(var3));
            return var4;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(I)Z", line = 115)
    public final boolean method2820(int arg0) {
        if (arg0 != -1) {
            this.field6812 = null;
        }
        field6815++;
        return this.field6808 != -1;
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(B)V", line = 138)
    public static void method2821(byte arg0) {
        field6810 = null;
        if (arg0 > -124) {
            method2818(-109, false, null);
        }
    }

    @OriginalMember(owner = "client!kn", name = "<init>", descriptor = "(Lnq;ILga;)V", line = 147)
    public class494(class650 arg0, int arg1, class332 arg2) {
        this.field6811 = arg2;
        this.field6811.method1939(0, 1);
        class157 var4 = new class157(this.field6811.method1938(0, 0, -17));
        int var5 = var4.method930(255);
        if (var5 > 3) {
            this.field6816 = new int[0][];
            this.field6812 = new boolean[0];
            this.field6808 = -1;
        } else {
            int var6 = var4.method930(255);
            class141[] var7 = class21.method130(128);
            boolean var8 = true;
            if (var7.length == var6) {
                for (int var9 = 0; var9 < var7.length; var9++) {
                    int var10 = var4.method930(255);
                    if (var7[var9].field1914 != var10) {
                        var8 = false;
                        break;
                    }
                }
            } else {
                var8 = false;
            }
            if (var8) {
                int var11 = var4.method930(255);
                int var12 = var4.method930(255);
                if (var5 > 2) {
                    this.field6808 = var4.method928(2016790224);
                } else {
                    this.field6808 = -1;
                }
                this.field6812 = new boolean[var12 + 1];
                this.field6816 = new int[var12 + 1][];
                for (int var13 = 0; var13 < var11; var13++) {
                    int var15 = var4.method930(255);
                    this.field6812[var15] = var4.method930(255) == 1;
                    int var16 = var4.method963(-118);
                    if (this.field6808 == -1) {
                        this.field6816[var15] = new int[var16];
                        for (int var18 = 0; var18 < var16; var18++) {
                            this.field6816[var15][var18] = var4.method963(-123);
                        }
                    } else {
                        this.field6816[var15] = new int[var16 + 1];
                        this.field6816[var15][0] = this.field6808;
                        for (int var17 = 0; var17 < var16; var17++) {
                            this.field6816[var15][var17 + 1] = var4.method963(-125);
                        }
                    }
                }
                for (int var14 = 0; var14 < (var12 + 1); var14++) {
                    if (this.field6816[var14] == null) {
                        if (this.field6808 == -1) {
                            this.field6816[var14] = new int[0];
                        } else {
                            this.field6816[var14] = new int[] { this.field6808 };
                        }
                    }
                }
            } else {
                this.field6816 = new int[0][];
                this.field6808 = -1;
                this.field6812 = new boolean[0];
            }
        }
    }
}
