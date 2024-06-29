import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mk")
public class class278 extends class170 {

    @OriginalMember(owner = "client!mk", name = "bb", descriptor = "I")
    private int field4800 = 0;

    @OriginalMember(owner = "client!mk", name = "R", descriptor = "I")
    private int field4790 = 1;

    @OriginalMember(owner = "client!mk", name = "db", descriptor = "I")
    private int field4802 = 0;

    @OriginalMember(owner = "client!mk", name = "V", descriptor = "Lmh;")
    public static class128 field4794 = class22.method156(122, "Ihre Freunde)2Liste ist voll(Q Maximale Eintr-=ge: Mitglieder 200)4freie Spieler 100");

    @OriginalMember(owner = "client!mk", name = "X", descriptor = "I")
    public static int field4796 = 2;

    @OriginalMember(owner = "client!mk", name = "cb", descriptor = "Lmh;")
    private static class128 field4801 = class22.method156(124, "level: ");

    @OriginalMember(owner = "client!mk", name = "ab", descriptor = "[[I")
    public static int[][] field4799 = new int[][] { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }, { 12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3 }, { 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 }, { 3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12 } };

    @OriginalMember(owner = "client!mk", name = "fb", descriptor = "Lmh;")
    private static class128 field4804 = class22.method156(125, "You can(Wt add yourself to your own friend list)3");

    @OriginalMember(owner = "client!mk", name = "T", descriptor = "Lmh;")
    public static class128 field4792 = field4804;

    @OriginalMember(owner = "client!mk", name = "eb", descriptor = "Lmh;")
    public static class128 field4803 = class22.method156(125, "showingVideoAd");

    @OriginalMember(owner = "client!mk", name = "Z", descriptor = "Lmh;")
    public static class128 field4798 = field4801;

    @OriginalMember(owner = "client!mk", name = "U", descriptor = "B")
    public static byte field4793;

    @OriginalMember(owner = "client!mk", name = "S", descriptor = "I")
    public static int field4791;

    @OriginalMember(owner = "client!mk", name = "Y", descriptor = "I")
    public static int field4797;

    @OriginalMember(owner = "client!mk", name = "gb", descriptor = "I")
    public static int field4805;

    @OriginalMember(owner = "client!mk", name = "hb", descriptor = "I")
    public static int field4806;

    @OriginalMember(owner = "client!mk", name = "ib", descriptor = "I")
    public static int field4807;

    @OriginalMember(owner = "client!mk", name = "W", descriptor = "[Lvd;")
    public static class127[] field4795;

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(BI)[I", line = 10)
    public final int[] method69(byte arg0, int arg1) {
        field4806++;
        int[] var3 = this.field2977.method1838(false, arg1);
        if (this.field2977.field4552) {
            int var4 = class307.field5221[arg1];
            int var5 = var4 - 2048 >> 1;
            for (int var6 = 0; var6 < class185.field3225; var6++) {
                int var7 = class118.field2002[var6];
                int var8 = var7 - 2048 >> 1;
                int var11;
                if (this.field4802 == 0) {
                    var11 = (var7 - var4) * this.field4790;
                } else {
                    int var9 = var5 * var5 + var8 * var8 >> 12;
                    int var10 = (int) (Math.sqrt((double) ((float) var9 / 4096.0F)) * 4096.0D);
                    var11 = (int) ((double) (this.field4790 * var10) * 3.141592653589793D);
                }
                int var12 = var11 - (var11 & 0xFFFFF000);
                if (this.field4800 == 0) {
                    var12 = class109.field1853[var12 >> 4 & 0xFF] + 4096 >> 1;
                } else if (this.field4800 == 2) {
                    var12 -= 2048;
                    if (var12 < 0) {
                        var12 = -var12;
                    }
                    var12 = 2048 - var12 << 1;
                }
                var3[var6] = var12;
            }
        }
        return arg0 == 85 ? var3 : (int[]) null;
    }

    @OriginalMember(owner = "client!mk", name = "d", descriptor = "(I)V", line = 79)
    public static void method1942(int arg0) {
        field4804 = null;
        field4795 = null;
        field4794 = null;
        field4803 = null;
        field4799 = (int[][]) null;
        if (arg0 != -784978420) {
            method1942(-18);
        }
        field4801 = null;
        field4798 = null;
        field4792 = null;
    }

    @OriginalMember(owner = "client!mk", name = "b", descriptor = "(BI)Z", line = 96)
    public static final boolean method1943(byte arg0, int arg1) {
        if (arg0 != -98) {
            method1943((byte) -94, 30);
        }
        field4807++;
        return (arg1 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!mk", name = "c", descriptor = "(I)V", line = 107)
    public final void method267(int arg0) {
        if (arg0 != -2718) {
            this.field4790 = 12;
        }
        field4797++;
        class39.method265(6361);
    }

    @OriginalMember(owner = "client!mk", name = "e", descriptor = "(B)V", line = 122)
    public static final void method1944(byte arg0) {
        field4805++;
        class314.field5335 = 0;
        class8.field188 = 0;
        class6.method37(true);
        class240.method1634((byte) 88);
        if (arg0 < 102) {
            method1942(109);
        }
        class218.method1507(-2);
        class53.method362(0);
        for (int var1 = 0; var1 < class8.field188; var1++) {
            int var2 = class207.field3637[var1];
            if (class293.field5011 != class140.field2405[var2].field477) {
                if (class140.field2405[var2].field2068 > 0) {
                    class249.method1730(class140.field2405[var2], -127);
                }
                class140.field2405[var2] = null;
            }
        }
        if (class102.field1749 != class54.field1051.field3380) {
            throw new RuntimeException("gpp1 pos:" + class54.field1051.field3380 + " psize:" + class102.field1749);
        }
        for (int var3 = 0; var3 < class75.field1404; var3++) {
            if (class140.field2405[class203.field3593[var3]] == null) {
                throw new RuntimeException("gpp2 pos:" + var3 + " size:" + class75.field1404);
            }
        }
    }

    @OriginalMember(owner = "client!mk", name = "<init>", descriptor = "()V", line = 175)
    public class278() {
        super(0, true);
    }

    @OriginalMember(owner = "client!mk", name = "c", descriptor = "(III)Lvi;", line = 197)
    public static final class5 method1945(int arg0, int arg1, int arg2) {
        class150 var3 = class182.field3184[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        }
        for (int var4 = 0; var4 < var3.field2576; var4++) {
            class5 var5 = var3.field2575[var4];
            if ((var5.field89 >> 29 & 0x3L) == 2L && var5.field92 == arg1 && var5.field88 == arg2) {
                class167.method1094(var5);
                return var5;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(ILbg;B)V", line = 233)
    public final void method63(int arg0, class194 arg1, byte arg2) {
        if (arg2 != 13) {
            return;
        }
        if (arg0 == 0) {
            this.field4802 = arg1.method1325(7627);
        } else if (arg0 == 1) {
            this.field4800 = arg1.method1325(7627);
        } else if (arg0 == 3) {
            this.field4790 = arg1.method1325(7627);
        }
        field4791++;
    }
}
