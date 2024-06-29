import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bh")
public class class11 {

    @OriginalMember(owner = "client!bh", name = "g", descriptor = "I")
    public int field87 = -1;

    @OriginalMember(owner = "client!bh", name = "f", descriptor = "I")
    public static int field86 = 0;

    @OriginalMember(owner = "client!bh", name = "v", descriptor = "I")
    public static int field102 = 0;

    @OriginalMember(owner = "client!bh", name = "A", descriptor = "I")
    public static int field107 = 104;

    @OriginalMember(owner = "client!bh", name = "u", descriptor = "I")
    public static int field101;

    @OriginalMember(owner = "client!bh", name = "y", descriptor = "I")
    public static int field105;

    @OriginalMember(owner = "client!bh", name = "e", descriptor = "I")
    public static int field85;

    @OriginalMember(owner = "client!bh", name = "j", descriptor = "I")
    public static int field90;

    @OriginalMember(owner = "client!bh", name = "l", descriptor = "I")
    public static int field92;

    @OriginalMember(owner = "client!bh", name = "o", descriptor = "I")
    public static int field95;

    @OriginalMember(owner = "client!bh", name = "r", descriptor = "I")
    public static int field98;

    @OriginalMember(owner = "client!bh", name = "p", descriptor = "Ltn;")
    private class109 field96;

    @OriginalMember(owner = "client!bh", name = "m", descriptor = "Lij;")
    public static class316 field93;

    @OriginalMember(owner = "client!bh", name = "d", descriptor = "Ljava/lang/String;")
    private String field84;

    @OriginalMember(owner = "client!bh", name = "s", descriptor = "Ljava/lang/String;")
    private String field99;

    @OriginalMember(owner = "client!bh", name = "t", descriptor = "[I")
    private int[] field100;

    @OriginalMember(owner = "client!bh", name = "w", descriptor = "[I")
    private int[] field103;

    @OriginalMember(owner = "client!bh", name = "z", descriptor = "[I")
    private int[] field106;

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "[I")
    private int[] field81;

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "[I")
    private int[] field82;

    @OriginalMember(owner = "client!bh", name = "h", descriptor = "[I")
    private int[] field88;

    @OriginalMember(owner = "client!bh", name = "k", descriptor = "[I")
    private int[] field91;

    @OriginalMember(owner = "client!bh", name = "q", descriptor = "[I")
    private int[] field97;

    @OriginalMember(owner = "client!bh", name = "x", descriptor = "[Ljava/lang/String;")
    private String[] field104;

    @OriginalMember(owner = "client!bh", name = "i", descriptor = "[Ljava/lang/String;")
    private String[] field89;

    @OriginalMember(owner = "client!bh", name = "B", descriptor = "[[I")
    private int[][] field108;

    @OriginalMember(owner = "client!bh", name = "c", descriptor = "[[I")
    private int[][] field83;

    @OriginalMember(owner = "client!bh", name = "n", descriptor = "[[I")
    private int[][] field94;

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(I)V", line = 11)
    public final void method54(int arg0) {
        field85++;
        if (this.field84 == null) {
            this.field84 = this.field99;
        }
        if (arg0 != 7303) {
            this.method56((byte) -3, (class366) null);
        }
    }

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "(I)V", line = 46)
    public static void method55(int arg0) {
        if (arg0 <= 70) {
            method60(113, -112);
        }
        field93 = null;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(BLrg;)V", line = 62)
    public final void method56(byte arg0, class366 arg1) {
        if (arg0 <= 64) {
            this.method59(18, (class366) null, 19);
        }
        field98++;
        while (true) {
            int var3 = arg1.method2306((byte) 126);
            if (var3 == 0) {
                return;
            }
            this.method59(var3, arg1, 3);
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(II)Ljr;", line = 90)
    public static final class233 method57(int arg0, int arg1) {
        field90++;
        class408 var2 = class219.field3072;
        class233 var3;
        synchronized (class219.field3072) {
            var3 = (class233) class219.field3072.method2529(0, (long) arg1);
        }
        if (var3 != null) {
            return var3;
        }
        byte[] var4 = class187.field2710.method1926(0, class142.method1036(arg1, (byte) 71), class435.method2680(arg1, false));
        class233 var5 = new class233();
        var5.field3272 = arg1;
        if (var4 != null) {
            var5.method1522(new class366(var4), arg0 + 80293);
        }
        var5.method1518(arg0 ^ 0xFFFFC616);
        class408 var6 = class219.field3072;
        synchronized (class219.field3072) {
            class219.field3072.method2527(arg0 ^ 0xFFFFC674, (long) arg1, var5);
            if (arg0 != -14758) {
                method60(-25, 26);
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(B)Lfc;", line = 122)
    public static final class193 method58(byte arg0) {
        field95++;
        try {
            return new class378();
        } catch (Throwable var3) {
            int var1 = -51 / ((arg0 - 68) / 39);
            try {
                return (class193) Class.forName("kh").getDeclaredConstructor().newInstance();
            } catch (Throwable var2) {
                return new class208();
            }
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(ILrg;I)V", line = 148)
    private final void method59(int arg0, class366 arg1, int arg2) {
        if (arg0 == 1) {
            this.field99 = arg1.method2278(false);
        } else if (arg0 == 2) {
            this.field84 = arg1.method2278(false);
        } else if (arg0 == 3) {
            int var22 = arg1.method2306((byte) 97);
            this.field83 = new int[var22][3];
            for (int var23 = 0; var23 < var22; var23++) {
                this.field83[var23][0] = arg1.method2297(class267.method1701(arg2, 13355));
                this.field83[var23][1] = arg1.method2258(1177515464);
                this.field83[var23][2] = arg1.method2258(arg2 + 1177515461);
            }
        } else if (arg0 == 4) {
            int var4 = arg1.method2306((byte) 82);
            this.field108 = new int[var4][3];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field108[var5][0] = arg1.method2297(13352);
                this.field108[var5][1] = arg1.method2258(1177515464);
                this.field108[var5][2] = arg1.method2258(1177515464);
            }
        } else if (arg0 == 5) {
            arg1.method2297(13352);
        } else if (arg0 == 6) {
            arg1.method2306((byte) 117);
        } else if (arg0 == 7) {
            arg1.method2306((byte) 124);
        } else if (arg0 != 8) {
            if (arg0 == 9) {
                arg1.method2306((byte) 108);
            } else if (arg0 == 10) {
                int var20 = arg1.method2306((byte) 78);
                this.field103 = new int[var20];
                for (int var21 = 0; var21 < var20; var21++) {
                    this.field103[var21] = arg1.method2258(1177515464);
                }
            } else if (arg0 == 12) {
                arg1.method2258(1177515464);
            } else if (arg0 == 13) {
                int var6 = arg1.method2306((byte) 44);
                this.field97 = new int[var6];
                for (int var7 = 0; var7 < var6; var7++) {
                    this.field97[var7] = arg1.method2297(13352);
                }
            } else if (arg0 == 14) {
                int var8 = arg1.method2306((byte) 100);
                this.field94 = new int[var8][2];
                for (int var9 = 0; var9 < var8; var9++) {
                    this.field94[var9][0] = arg1.method2306((byte) 57);
                    this.field94[var9][1] = arg1.method2306((byte) 54);
                }
            } else if (arg0 == 15) {
                arg1.method2297(13352);
            } else if (arg0 == 17) {
                this.field87 = arg1.method2297(13352);
            } else if (arg0 == 18) {
                int var10 = arg1.method2306((byte) 36);
                this.field89 = new String[var10];
                this.field82 = new int[var10];
                this.field81 = new int[var10];
                this.field106 = new int[var10];
                for (int var11 = 0; var11 < var10; var11++) {
                    this.field82[var11] = arg1.method2258(1177515464);
                    this.field81[var11] = arg1.method2258(1177515464);
                    this.field106[var11] = arg1.method2258(1177515464);
                    this.field89[var11] = arg1.method2255(-32226);
                }
            } else if (arg0 == 19) {
                int var18 = arg1.method2306((byte) 122);
                this.field91 = new int[var18];
                this.field100 = new int[var18];
                this.field88 = new int[var18];
                this.field104 = new String[var18];
                for (int var19 = 0; var19 < var18; var19++) {
                    this.field91[var19] = arg1.method2258(1177515464);
                    this.field100[var19] = arg1.method2258(class267.method1701(arg2, 1177515467));
                    this.field88[var19] = arg1.method2258(arg2 + 1177515461);
                    this.field104[var19] = arg1.method2255(-32226);
                }
            } else if (arg0 == 249) {
                int var12 = arg1.method2306((byte) 43);
                if (this.field96 == null) {
                    int var13 = class177.method1249((byte) -125, var12);
                    this.field96 = new class109(var13);
                }
                for (int var14 = 0; var14 < var12; var14++) {
                    boolean var15 = arg1.method2306((byte) 82) == 1;
                    int var16 = arg1.method2263((byte) 10);
                    class311 var17;
                    if (var15) {
                        var17 = new class245(arg1.method2255(arg2 - 32229));
                    } else {
                        var17 = new class166(arg1.method2258(1177515464));
                    }
                    this.field96.method835(4, var17, (long) var16);
                }
            }
        }
        if (arg2 != 3) {
            this.field99 = null;
        }
        field92++;
    }

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "(II)V", line = 383)
    public static final void method60(int arg0, int arg1) {
        field105++;
        class26 var2 = class217.method1445(true, arg1, 8);
        var2.method164(12);
        int var3 = -80 % ((-arg0 - 67) / 46);
    }
}
