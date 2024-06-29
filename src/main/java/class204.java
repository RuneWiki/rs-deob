import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public class class204 {

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "I")
    public int field2724 = 0;

    @OriginalMember(owner = "client!pb", name = "g", descriptor = "[[I")
    public int[][] field2730 = new int[6][258];

    @OriginalMember(owner = "client!pb", name = "n", descriptor = "[B")
    public byte[] field2737 = new byte[256];

    @OriginalMember(owner = "client!pb", name = "e", descriptor = "[I")
    public int[] field2728 = new int[6];

    @OriginalMember(owner = "client!pb", name = "r", descriptor = "[Z")
    public boolean[] field2741 = new boolean[16];

    @OriginalMember(owner = "client!pb", name = "f", descriptor = "[B")
    public byte[] field2729 = new byte[18002];

    @OriginalMember(owner = "client!pb", name = "w", descriptor = "[[I")
    public int[][] field2746 = new int[6][258];

    @OriginalMember(owner = "client!pb", name = "l", descriptor = "[B")
    public byte[] field2735 = new byte[18002];

    @OriginalMember(owner = "client!pb", name = "x", descriptor = "[Z")
    public boolean[] field2747 = new boolean[256];

    @OriginalMember(owner = "client!pb", name = "z", descriptor = "[B")
    public byte[] field2749 = new byte[4096];

    @OriginalMember(owner = "client!pb", name = "G", descriptor = "[[I")
    public int[][] field2756 = new int[6][258];

    @OriginalMember(owner = "client!pb", name = "C", descriptor = "[I")
    public int[] field2752 = new int[257];

    @OriginalMember(owner = "client!pb", name = "o", descriptor = "[I")
    public int[] field2738 = new int[256];

    @OriginalMember(owner = "client!pb", name = "I", descriptor = "I")
    public int field2758 = 0;

    @OriginalMember(owner = "client!pb", name = "A", descriptor = "[[B")
    public byte[][] field2750 = new byte[6][258];

    @OriginalMember(owner = "client!pb", name = "D", descriptor = "[I")
    public int[] field2753 = new int[16];

    @OriginalMember(owner = "client!pb", name = "y", descriptor = "[I")
    public static int[] field2748 = new int[2];

    @OriginalMember(owner = "client!pb", name = "m", descriptor = "Lmk;")
    public static class154 field2736 = new class154();

    @OriginalMember(owner = "client!pb", name = "M", descriptor = "Lph;")
    public static class114 field2762 = new class114(64);

    @OriginalMember(owner = "client!pb", name = "J", descriptor = "B")
    public byte field2759;

    @OriginalMember(owner = "client!pb", name = "c", descriptor = "I")
    public static int field2726;

    @OriginalMember(owner = "client!pb", name = "h", descriptor = "I")
    public static int field2731;

    @OriginalMember(owner = "client!pb", name = "i", descriptor = "I")
    public int field2732;

    @OriginalMember(owner = "client!pb", name = "j", descriptor = "I")
    public int field2733;

    @OriginalMember(owner = "client!pb", name = "k", descriptor = "I")
    public int field2734;

    @OriginalMember(owner = "client!pb", name = "p", descriptor = "I")
    public static int field2739;

    @OriginalMember(owner = "client!pb", name = "q", descriptor = "I")
    public static int field2740;

    @OriginalMember(owner = "client!pb", name = "s", descriptor = "I")
    public int field2742;

    @OriginalMember(owner = "client!pb", name = "t", descriptor = "I")
    public int field2743;

    @OriginalMember(owner = "client!pb", name = "u", descriptor = "I")
    public int field2744;

    @OriginalMember(owner = "client!pb", name = "v", descriptor = "I")
    public int field2745;

    @OriginalMember(owner = "client!pb", name = "B", descriptor = "I")
    public int field2751;

    @OriginalMember(owner = "client!pb", name = "E", descriptor = "I")
    public int field2754;

    @OriginalMember(owner = "client!pb", name = "F", descriptor = "I")
    public int field2755;

    @OriginalMember(owner = "client!pb", name = "H", descriptor = "I")
    public int field2757;

    @OriginalMember(owner = "client!pb", name = "K", descriptor = "I")
    public int field2760;

    @OriginalMember(owner = "client!pb", name = "L", descriptor = "I")
    public int field2761;

    @OriginalMember(owner = "client!pb", name = "N", descriptor = "I")
    public static int field2763;

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "[B")
    public byte[] field2725;

    @OriginalMember(owner = "client!pb", name = "d", descriptor = "[B")
    public byte[] field2727;

    @OriginalMember(owner = "client!pb", name = "O", descriptor = "[I")
    public static int[] field2764;

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(IIIIIB)V")
    public static final void method1105(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5) {
        field2739++;
        int var6 = arg3 - arg0;
        int var7 = arg2 - arg1;
        if (var7 == 0) {
            if (var6 != 0) {
                class297.method1745(-110, arg3, arg4, arg0, arg1);
            }
        } else if (var6 == 0) {
            class72.method415(arg1, arg0, arg2, arg4, (byte) -128);
        } else {
            if (var7 < 0) {
                var7 = -var7;
            }
            if (var6 < 0) {
                var6 = -var6;
            }
            boolean var8 = var7 < var6;
            if (var8) {
                int var9 = arg1;
                arg1 = arg0;
                int var10 = arg2;
                arg0 = var9;
                arg2 = arg3;
                arg3 = var10;
            }
            if (arg1 > arg2) {
                int var11 = arg1;
                arg1 = arg2;
                int var12 = arg0;
                arg2 = var11;
                arg0 = arg3;
                arg3 = var12;
            }
            int var13 = arg0;
            int var14 = arg2 - arg1;
            if (arg5 < -19) {
                int var15 = arg3 - arg0;
                int var16 = -(var14 >> 1);
                int var17 = arg3 > arg0 ? 1 : -1;
                if (var15 < 0) {
                    var15 = -var15;
                }
                if (var8) {
                    for (int var19 = arg1; var19 <= arg2; var19++) {
                        var16 += var15;
                        class153.field1932[var19][var13] = arg4;
                        if (var16 > 0) {
                            var13 += var17;
                            var16 -= var14;
                        }
                    }
                } else {
                    for (int var18 = arg1; var18 <= arg2; var18++) {
                        class153.field1932[var13][var18] = arg4;
                        var16 += var15;
                        if (var16 > 0) {
                            var13 += var17;
                            var16 -= var14;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(BI)V")
    public static final void method1106(byte arg0, int arg1) {
        if (arg0 != -51) {
            method1109(68);
        }
        if (class252.field3445 == 0) {
            class314.field4205.method2348(arg1, (byte) 125);
        } else {
            class425.field6234 = arg1;
        }
        field2763++;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(Lfd;B)V")
    public static final void method1107(class194 arg0, byte arg1) {
        if (class300.field4088 == arg0.field2506) {
            class321.field4290[arg0.field2555] = true;
        }
        field2726++;
        if (arg1 > -89) {
            field2748 = null;
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(I)V")
    public static void method1108(int arg0) {
        field2748 = null;
        field2764 = null;
        field2762 = null;
        field2736 = null;
        if (arg0 != 0) {
            field2748 = null;
        }
    }

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "(I)I")
    public static final int method1109(int arg0) {
        field2740++;
        if (class452.field6586 || class244.field3323 <= 0) {
            int var1 = class337.field4493;
            int var2 = class306.field4146;
            int var3 = class344.field4618;
            int var4 = class18.field179;
            int var5 = class344.field4620;
            if (var3 < var1 && var3 + var5 > var1) {
                int var6 = -1;
                for (int var7 = 0; var7 < class244.field3323; var7++) {
                    if (class338.field4511) {
                        int var11 = (class244.field3323 - var7 - 1) * 16 + var4 + 33;
                        if ((var11 - 13) < var2 && var2 <= var11 + 3) {
                            var6 = var7;
                        }
                    } else {
                        int var12 = (class244.field3323 - var7 - 1) * 16 + var4 + 31;
                        if (var12 - 13 < var2 && (var12 + 3) >= var2) {
                            var6 = var7;
                        }
                    }
                }
                if (var6 != -1) {
                    int var8 = 0;
                    class159 var9 = new class159(class342.field4577);
                    for (class405 var10 = (class405) var9.method861(arg0 ^ 0xFFFFFFE6); var10 != null; var10 = (class405) var9.method862((byte) -26)) {
                        if (var8++ == var6) {
                            return var10.field5884;
                        }
                    }
                }
            }
            if (arg0 != -3) {
                field2736 = null;
            }
            return -1;
        } else if (class259.field3519 && class249.field3361[81] && class244.field3323 > 2) {
            return ((class405) class342.field4577.field1942.field4506.field4506).field5884;
        } else {
            return ((class405) class342.field4577.field1942.field4506).field5884;
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(II)Ldn;")
    public static final class321 method1110(int arg0, int arg1) {
        field2731++;
        class184[] var2 = class38.field396;
        synchronized (class38.field396) {
            if (arg0 != 258) {
                method1107((class194) null, (byte) -46);
            }
            class321 var3;
            if (class38.field396.length <= arg1 || class38.field396[arg1].method985((byte) -111)) {
                var3 = new class321();
                var3.field4293 = new class447[arg1];
                for (int var4 = 0; var4 < arg1; var4++) {
                    var3.field4293[var4] = new class447();
                }
            } else {
                var3 = (class321) class38.field396[arg1].method990((byte) 91);
                var3.method982((byte) 101);
                int var10002 = class19.field191[arg1]--;
            }
            return var3;
        }
    }
}
