import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ae")
public class class268 extends class170 {

    @OriginalMember(owner = "client!ae", name = "R", descriptor = "I")
    private int field4639 = 4096;

    @OriginalMember(owner = "client!ae", name = "ab", descriptor = "I")
    private int field4647 = 4096;

    @OriginalMember(owner = "client!ae", name = "X", descriptor = "[I")
    private int[] field4644 = new int[3];

    @OriginalMember(owner = "client!ae", name = "jb", descriptor = "I")
    private int field4656 = 409;

    @OriginalMember(owner = "client!ae", name = "eb", descriptor = "I")
    private int field4651 = 4096;

    @OriginalMember(owner = "client!ae", name = "S", descriptor = "Lmh;")
    public static class128 field4640 = class22.method156(126, "b12_full");

    @OriginalMember(owner = "client!ae", name = "Z", descriptor = "Lmh;")
    private static class128 field4646 = class22.method156(122, "RuneScape is loading )2 please wait)3)3)3");

    @OriginalMember(owner = "client!ae", name = "Y", descriptor = "Z")
    public static boolean field4645 = false;

    @OriginalMember(owner = "client!ae", name = "hb", descriptor = "Lmh;")
    public static class128 field4654 = field4646;

    @OriginalMember(owner = "client!ae", name = "T", descriptor = "I")
    public static int field4641 = 0;

    @OriginalMember(owner = "client!ae", name = "bb", descriptor = "Loe;")
    public static class120 field4648 = new class120(16);

    @OriginalMember(owner = "client!ae", name = "lb", descriptor = "Lmh;")
    public static class128 field4658 = class22.method156(127, "Ihre Ignorieren)2Liste ist voll)1 Sie k-Onnen nur 100 Spieler darauf eintragen)3");

    @OriginalMember(owner = "client!ae", name = "nb", descriptor = "Lmh;")
    public static class128 field4660 = class22.method156(122, "welle:");

    @OriginalMember(owner = "client!ae", name = "pb", descriptor = "[I")
    public static int[] field4662 = new int[64];

    @OriginalMember(owner = "client!ae", name = "V", descriptor = "I")
    public static int field4642;

    @OriginalMember(owner = "client!ae", name = "W", descriptor = "I")
    public static int field4643;

    @OriginalMember(owner = "client!ae", name = "cb", descriptor = "I")
    public static int field4649;

    @OriginalMember(owner = "client!ae", name = "db", descriptor = "I")
    public static int field4650;

    @OriginalMember(owner = "client!ae", name = "fb", descriptor = "I")
    public static int field4652;

    @OriginalMember(owner = "client!ae", name = "gb", descriptor = "I")
    public static int field4653;

    @OriginalMember(owner = "client!ae", name = "ob", descriptor = "I")
    public static int field4661;

    @OriginalMember(owner = "client!ae", name = "qb", descriptor = "I")
    public static int field4663;

    @OriginalMember(owner = "client!ae", name = "kb", descriptor = "Ldj;")
    public static class314 field4657;

    @OriginalMember(owner = "client!ae", name = "ib", descriptor = "Lph;")
    public static class72 field4655;

    @OriginalMember(owner = "client!ae", name = "mb", descriptor = "[[Z")
    public static boolean[][] field4659;

    @OriginalMember(owner = "client!ae", name = "e", descriptor = "(B)V", line = 9)
    public static void method1867(byte arg0) {
        field4640 = null;
        field4648 = null;
        field4660 = null;
        field4654 = null;
        field4655 = null;
        field4657 = null;
        field4662 = null;
        field4659 = (boolean[][]) null;
        field4646 = null;
        field4658 = null;
        if (arg0 >= -20) {
            field4640 = (class128) null;
        }
    }

    @OriginalMember(owner = "client!ae", name = "<init>", descriptor = "()V", line = 121)
    public class268() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(ILbg;B)V", line = 60)
    public final void method63(int arg0, class194 arg1, byte arg2) {
        if (arg0 == 0) {
            this.field4656 = arg1.method1308(-116);
        } else if (arg0 == 1) {
            this.field4639 = arg1.method1308(-22);
        } else if (arg0 == 2) {
            this.field4647 = arg1.method1308(-66);
        } else if (arg0 == 3) {
            this.field4651 = arg1.method1308(-67);
        } else if (arg0 == 4) {
            int var5 = arg1.method1349((byte) 91);
            this.field4644[2] = class238.method1622(0, var5 >> 12);
            this.field4644[1] = class238.method1622(4080, var5 >> 4);
            this.field4644[0] = class238.method1622(267386880, var5 << 4);
        }
        if (arg2 != 13) {
            field4655 = (class72) null;
        }
        field4643++;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(IB)Z", line = 138)
    public static final boolean method1868(int arg0, byte arg1) {
        field4649++;
        if (arg1 >= -76) {
            method1867((byte) -60);
        }
        return arg0 >= 97 && arg0 <= 122 || arg0 >= 65 && arg0 <= 90;
    }

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "(II)V", line = 150)
    public static final void method1869(int arg0, int arg1) {
        class20.field537 = null;
        if (arg0 != 17714) {
            return;
        }
        field4653++;
        class75.field1406 = arg1;
        class20.field540 = -1;
        class52.field1023 = 1;
        class106.field1809 = false;
        class134.field2332 = -1;
        class194.field3347 = 0;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(IIIIIIII)V", line = 177)
    public static final void method1870(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field4642++;
        if (arg1 > -103) {
            field4641 = -15;
        }
        if (arg5 < 1 || arg3 < 1 || arg5 > 102 || arg3 > 102) {
            return;
        }
        if (!class117.method702(true) && (class301.field5117[0][arg5][arg3] & 0x2) == 0) {
            int var8 = arg7;
            if ((class301.field5117[arg7][arg5][arg3] & 0x8) != 0) {
                var8 = 0;
            }
            if (class281.field4855 != var8) {
                return;
            }
        }
        int var9 = arg7;
        if (arg7 < 3 && (class301.field5117[1][arg5][arg3] & 0x2) == 2) {
            var9 = arg7 + 1;
        }
        class69.method465(class180.field3158[arg7], arg6, arg5, arg7, (byte) -90, var9, arg3);
        if (arg0 >= 0) {
            boolean var10 = class228.field3968;
            class228.field3968 = true;
            class43.method296(arg3, arg4, (byte) -46, false, arg7, arg2, arg5, var9, false, class180.field3158[arg7], arg0);
            class228.field3968 = var10;
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(II)[[I", line = 232)
    public final int[][] method62(int arg0, int arg1) {
        field4652++;
        int[][] var3 = this.field2976.method1098(arg0, -19544);
        if (this.field2976.field2883) {
            int[][] var4 = this.method1139(0, arg0, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[2];
            int[] var9 = var3[0];
            int[] var10 = var3[1];
            for (int var11 = 0; var11 < class185.field3225; var11++) {
                int var12 = var5[var11];
                int var13 = var12 - this.field4644[0];
                if (var13 < 0) {
                    var13 = -var13;
                }
                if (this.field4656 < var13) {
                    var9[var11] = var12;
                    var10[var11] = var6[var11];
                    var8[var11] = var7[var11];
                } else {
                    int var14 = var6[var11];
                    int var15 = var14 - this.field4644[1];
                    if (var15 < 0) {
                        var15 = -var15;
                    }
                    if (var15 > this.field4656) {
                        var9[var11] = var12;
                        var10[var11] = var14;
                        var8[var11] = var7[var11];
                    } else {
                        int var16 = var7[var11];
                        int var17 = var16 - this.field4644[2];
                        if (var17 < 0) {
                            var17 = -var17;
                        }
                        if (var17 <= this.field4656) {
                            var9[var11] = this.field4651 * var12 >> 12;
                            var10[var11] = this.field4647 * var14 >> 12;
                            var8[var11] = this.field4639 * var16 >> 12;
                        } else {
                            var9[var11] = var12;
                            var10[var11] = var14;
                            var8[var11] = var16;
                        }
                    }
                }
            }
        }
        int var18 = 5 / ((arg1 + 24) / 46);
        return var3;
    }
}
