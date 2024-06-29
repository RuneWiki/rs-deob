import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public class class8 extends class170 {

    @OriginalMember(owner = "client!aa", name = "T", descriptor = "I")
    private int field184 = 4096;

    @OriginalMember(owner = "client!aa", name = "W", descriptor = "I")
    private int field187 = 0;

    @OriginalMember(owner = "client!aa", name = "X", descriptor = "I")
    public static int field188 = 0;

    @OriginalMember(owner = "client!aa", name = "U", descriptor = "Lmh;")
    public static class128 field185 = class22.method156(127, "::cardmem");

    @OriginalMember(owner = "client!aa", name = "R", descriptor = "I")
    public static int field182;

    @OriginalMember(owner = "client!aa", name = "V", descriptor = "I")
    public static int field186;

    @OriginalMember(owner = "client!aa", name = "Y", descriptor = "I")
    public static int field189;

    @OriginalMember(owner = "client!aa", name = "Z", descriptor = "I")
    public static int field190;

    @OriginalMember(owner = "client!aa", name = "ab", descriptor = "I")
    public static int field191;

    @OriginalMember(owner = "client!aa", name = "bb", descriptor = "I")
    public static int field192;

    @OriginalMember(owner = "client!aa", name = "cb", descriptor = "I")
    public static int field193;

    @OriginalMember(owner = "client!aa", name = "db", descriptor = "[I")
    public static int[] field194;

    @OriginalMember(owner = "client!aa", name = "S", descriptor = "[[B")
    public static byte[][] field183;

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(II)[[I", line = 30)
    public final int[][] method62(int arg0, int arg1) {
        field186++;
        int[][] var3 = this.field2976.method1098(arg0, -19544);
        if (this.field2976.field2883) {
            int[][] var4 = this.method1139(0, arg0, 0);
            int[] var5 = var4[1];
            int[] var6 = var4[0];
            int[] var7 = var4[2];
            int[] var8 = var3[1];
            int[] var9 = var3[0];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class185.field3225; var11++) {
                int var12 = var6[var11];
                int var13 = var7[var11];
                int var14 = var5[var11];
                if (var12 < this.field187) {
                    var9[var11] = this.field187;
                } else if (var12 <= this.field184) {
                    var9[var11] = var12;
                } else {
                    var9[var11] = this.field184;
                }
                if (var14 < this.field187) {
                    var8[var11] = this.field187;
                } else if (var14 <= this.field184) {
                    var8[var11] = var14;
                } else {
                    var8[var11] = this.field184;
                }
                if (this.field187 > var13) {
                    var10[var11] = this.field187;
                } else if (this.field184 >= var13) {
                    var10[var11] = var13;
                } else {
                    var10[var11] = this.field184;
                }
            }
        }
        int var15 = -54 / ((-arg1 - 24) / 46);
        return var3;
    }

    @OriginalMember(owner = "client!aa", name = "<init>", descriptor = "()V", line = 108)
    public class8() {
        super(1, false);
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(ILbg;B)V", line = 113)
    public final void method63(int arg0, class194 arg1, byte arg2) {
        field193++;
        if (arg0 == 0) {
            this.field187 = arg1.method1308(arg2 ^ 0xFFFFFFB6);
        } else if (arg0 == 1) {
            this.field184 = arg1.method1308(-51);
        } else if (arg0 == 2) {
            this.field2970 = arg1.method1325(7627) == 1;
        }
        if (arg2 != 13) {
            this.method63(118, (class194) null, (byte) 55);
        }
    }

    @OriginalMember(owner = "client!aa", name = "d", descriptor = "(I)V", line = 160)
    public static final void method64(int arg0) {
        if (arg0 < -51) {
            class119.method723();
            field191++;
            class119.method716();
        }
    }

    @OriginalMember(owner = "client!aa", name = "e", descriptor = "(I)V", line = 173)
    public static final void method65(int arg0) {
        if (arg0 != -2) {
            field194 = (int[]) null;
        }
        class50.field985.method1834(arg0 + 19);
        field182++;
    }

    @OriginalMember(owner = "client!aa", name = "c", descriptor = "(III)Lsl;", line = 184)
    public static final class92 method66(int arg0, int arg1, int arg2) {
        class150 var3 = class182.field3184[arg0][arg1][arg2];
        return var3 == null || var3.field2586 == null ? null : var3.field2586;
    }

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "(Z)V", line = 197)
    public static final void method67(boolean arg0) {
        class235.field4043++;
        field192++;
        class71.field1320.method570(178, -1);
        if (!arg0) {
            method68((byte) -30);
        }
        for (class88 var1 = (class88) class182.field3198.method729(-93); var1 != null; var1 = (class88) class182.field3198.method732(1)) {
            if (var1.field1508 == 0) {
                class50.method341(124, true, var1);
            }
        }
        if (class36.field739 != null) {
            class7.method48(class36.field739, 0);
            class36.field739 = null;
        }
    }

    @OriginalMember(owner = "client!aa", name = "e", descriptor = "(B)V", line = 228)
    public static void method68(byte arg0) {
        int var1 = -56 / ((20 - arg0) / 57);
        field185 = null;
        field183 = (byte[][]) null;
        field194 = null;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(BI)[I", line = 249)
    public final int[] method69(byte arg0, int arg1) {
        field190++;
        int[] var3 = this.field2977.method1838(false, arg1);
        if (this.field2977.field4552) {
            int[] var4 = this.method1142((byte) 44, 0, arg1);
            for (int var5 = 0; var5 < class185.field3225; var5++) {
                int var6 = var4[var5];
                if (var6 < this.field187) {
                    var3[var5] = this.field187;
                } else if (this.field184 < var6) {
                    var3[var5] = this.field184;
                } else {
                    var3[var5] = var6;
                }
            }
        }
        if (arg0 != 85) {
            field194 = (int[]) null;
        }
        return var3;
    }
}
