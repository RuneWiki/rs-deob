import java.awt.event.KeyEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lc")
public class class108 {

    @OriginalMember(owner = "client!lc", name = "p", descriptor = "I")
    private int field1960 = -1;

    @OriginalMember(owner = "client!lc", name = "q", descriptor = "I")
    private int field1961 = 0;

    @OriginalMember(owner = "client!lc", name = "g", descriptor = "Lh;")
    private class69 field1951 = new class69();

    @OriginalMember(owner = "client!lc", name = "r", descriptor = "Z")
    public boolean field1962 = false;

    @OriginalMember(owner = "client!lc", name = "e", descriptor = "I")
    private int field1949;

    @OriginalMember(owner = "client!lc", name = "h", descriptor = "I")
    private int field1952;

    @OriginalMember(owner = "client!lc", name = "i", descriptor = "[Lmb;")
    private class116[] field1953;

    @OriginalMember(owner = "client!lc", name = "f", descriptor = "[[[I")
    private int[][][] field1950;

    @OriginalMember(owner = "client!lc", name = "d", descriptor = "Ltg;")
    public static class184 field1948 = class135.method812("(U(Y", 3);

    @OriginalMember(owner = "client!lc", name = "o", descriptor = "Ltg;")
    public static class184 field1959 = class135.method812("http:)4)4www)3runescape)3com", 3);

    @OriginalMember(owner = "client!lc", name = "n", descriptor = "[I")
    public static int[] field1958 = new int[5];

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "Lnd;")
    public static class127 field1945 = new class127(64);

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "I")
    public static int field1946;

    @OriginalMember(owner = "client!lc", name = "c", descriptor = "I")
    public static int field1947;

    @OriginalMember(owner = "client!lc", name = "j", descriptor = "I")
    public static int field1954;

    @OriginalMember(owner = "client!lc", name = "k", descriptor = "I")
    public static int field1955;

    @OriginalMember(owner = "client!lc", name = "l", descriptor = "I")
    public static int field1956;

    @OriginalMember(owner = "client!lc", name = "m", descriptor = "I")
    public static int field1957;

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(ILjava/awt/event/KeyEvent;)I")
    public static final int method669(int arg0, KeyEvent arg1) {
        field1947++;
        if (arg0 != -257) {
            method674(-43, null);
        }
        int var2 = arg1.getKeyChar();
        if (var2 == 8364) {
            return 128;
        } else {
            if (var2 <= 0 || var2 >= 256) {
                var2 = -1;
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(I)[[[I")
    public final int[][][] method670(int arg0) {
        field1955++;
        if (this.field1952 != this.field1949) {
            throw new RuntimeException("Can only retrieve a full image cache");
        } else if (arg0 == -17514) {
            for (int var2 = 0; var2 < this.field1952; var2++) {
                this.field1953[var2] = class87.field1593;
            }
            return this.field1950;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(Ltd;IIIII)V")
    public static final void method671(class181 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var6 = true;
        int var7 = arg2;
        int var8 = arg2 + arg4;
        int var9 = arg3 - 1;
        int var10 = arg3 + arg5;
        for (int var11 = arg1; var11 <= arg1 + 1; var11++) {
            if (class87.field1608 != var11) {
                for (int var12 = var7; var12 <= var8; var12++) {
                    if (var12 >= 0 && var12 < class8.field145) {
                        for (int var13 = var9; var13 <= var10; var13++) {
                            if (var13 >= 0 && var13 < class159.field2853 && (!var6 || var12 >= var8 || var13 >= var10 || var13 < arg3 && arg2 != var12)) {
                                class90 var14 = class190.field3704[var11][var12][var13];
                                if (var14 != null) {
                                    int var15 = (class131.field2380[var11][var12 + 1][var13] + class131.field2380[var11][var12][var13] + class131.field2380[var11][var12][var13 + 1] + class131.field2380[var11][var12 + 1][var13 + 1]) / 4 - (class131.field2380[arg1][arg2 + 1][arg3] + class131.field2380[arg1][arg2][arg3] + class131.field2380[arg1][arg2][arg3 + 1] + class131.field2380[arg1][arg2 + 1][arg3 + 1]) / 4;
                                    class50 var16 = var14.field1693;
                                    if (var16 != null) {
                                        if (var16.field918 instanceof class181) {
                                            class181 var17 = (class181) var16.field918;
                                            class181.method1120(arg0, var17, (var12 - arg2) * 128 + (1 - arg4) * 64, var15, (var13 - arg3) * 128 + (1 - arg5) * 64, var6);
                                        }
                                        if (var16.field930 instanceof class181) {
                                            class181 var18 = (class181) var16.field930;
                                            class181.method1120(arg0, var18, (var12 - arg2) * 128 + (1 - arg4) * 64, var15, (var13 - arg3) * 128 + (1 - arg5) * 64, var6);
                                        }
                                    }
                                    for (int var19 = 0; var19 < var14.field1680; var19++) {
                                        class164 var20 = var14.field1686[var19];
                                        if (var20 != null && var20.field2951 instanceof class181) {
                                            class181 var21 = (class181) var20.field2951;
                                            int var22 = var20.field2949 + 1 - var20.field2954;
                                            int var23 = var20.field2957 + 1 - var20.field2945;
                                            class181.method1120(arg0, var21, (var20.field2954 - arg2) * 128 + (var22 - arg4) * 64, var15, (var20.field2945 - arg3) * 128 + (var23 - arg5) * 64, var6);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                var7--;
                var6 = false;
            }
        }
    }

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "(I)V")
    public static void method672(int arg0) {
        field1945 = null;
        field1948 = null;
        field1959 = null;
        if (arg0 != 1) {
            method669(29, null);
        }
        field1958 = null;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(II)[[I")
    public final int[][] method673(int arg0, int arg1) {
        int var3 = 29 / ((42 - arg1) / 37);
        field1946++;
        if (this.field1952 == this.field1949) {
            this.field1962 = this.field1953[arg0] == null;
            this.field1953[arg0] = class87.field1593;
            return this.field1950[arg0];
        } else if (this.field1952 == 1) {
            this.field1962 = this.field1960 != arg0;
            this.field1960 = arg0;
            return this.field1950[0];
        } else {
            class116 var4 = this.field1953[arg0];
            if (this.field1962 = var4 == null) {
                if (this.field1961 < this.field1952) {
                    var4 = new class116(arg0, this.field1961);
                    this.field1961++;
                } else {
                    class116 var5 = (class116) this.field1951.method412(true);
                    var4 = new class116(arg0, var5.field2106);
                    this.field1953[var5.field2100] = null;
                    var5.method797((byte) -97);
                }
                this.field1953[arg0] = var4;
            }
            this.field1951.method403(true, var4);
            return this.field1950[var4.field2106];
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(I[B)Lna;")
    public static final class124 method674(int arg0, byte[] arg1) {
        field1956++;
        if (arg1 == null) {
            return null;
        } else if (arg0 == -17820) {
            class124 var2 = new class124(arg1, class177.field3387, class26.field472, class83.field1479, class184.field3535, class83.field1481, class202.field3902);
            class200.method1283((byte) -1);
            return var2;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!lc", name = "c", descriptor = "(I)V")
    public static final void method675(int arg0) {
        class107.field1944.method451((byte) -59);
        field1957++;
        if (arg0 > -76) {
            method675(17);
        }
        for (int var1 = 0; var1 < 32; var1++) {
            class204.field3936[var1] = 0L;
        }
        for (int var2 = 0; var2 < 32; var2++) {
            class117.field2117[var2] = 0L;
        }
        class2.field56 = 0;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(Z)V")
    public final void method676(boolean arg0) {
        field1954++;
        int var2 = 0;
        if (arg0) {
            this.method673(-125, 16);
        }
        while (var2 < this.field1952) {
            this.field1950[var2][0] = null;
            this.field1950[var2][1] = null;
            this.field1950[var2][2] = null;
            this.field1950[var2] = null;
            var2++;
        }
        this.field1953 = null;
        this.field1950 = null;
        this.field1951.method407(2);
        this.field1951 = null;
    }

    @OriginalMember(owner = "client!lc", name = "<init>", descriptor = "(III)V")
    public class108(int arg0, int arg1, int arg2) {
        this.field1949 = arg1;
        this.field1952 = arg0;
        this.field1953 = new class116[arg1];
        this.field1950 = new int[arg0][3][arg2];
    }
}
