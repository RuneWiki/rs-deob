import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!g")
public class class37 extends class40 {

    @OriginalMember(owner = "client!g", name = "Q", descriptor = "I")
    public int field855;

    @OriginalMember(owner = "client!g", name = "F", descriptor = "I")
    private int field844;

    @OriginalMember(owner = "client!g", name = "G", descriptor = "[I")
    public int[] field845;

    @OriginalMember(owner = "client!g", name = "K", descriptor = "[[I")
    public int[][] field849;

    @OriginalMember(owner = "client!g", name = "x", descriptor = "I")
    public static int field836 = 2301979;

    @OriginalMember(owner = "client!g", name = "E", descriptor = "Lec;")
    public static class28 field843 = null;

    @OriginalMember(owner = "client!g", name = "L", descriptor = "Lec;")
    public static class28 field850 = class28.method210(-46, "as it was used to break our rules");

    @OriginalMember(owner = "client!g", name = "I", descriptor = "I")
    public static int field847 = 0;

    @OriginalMember(owner = "client!g", name = "D", descriptor = "Lh;")
    public static class42 field842 = new class42();

    @OriginalMember(owner = "client!g", name = "P", descriptor = "I")
    public static int field854 = -1;

    @OriginalMember(owner = "client!g", name = "O", descriptor = "[[I")
    public static int[][] field853 = new int[104][104];

    @OriginalMember(owner = "client!g", name = "N", descriptor = "I")
    public static int field852 = 0;

    @OriginalMember(owner = "client!g", name = "M", descriptor = "Lec;")
    public static class28 field851 = class28.method210(-46, "Loaded title screen");

    @OriginalMember(owner = "client!g", name = "S", descriptor = "Lpa;")
    public static class91 field856 = new class91(64);

    @OriginalMember(owner = "client!g", name = "s", descriptor = "I")
    public static int field831;

    @OriginalMember(owner = "client!g", name = "t", descriptor = "I")
    public static int field832;

    @OriginalMember(owner = "client!g", name = "u", descriptor = "I")
    public static int field833;

    @OriginalMember(owner = "client!g", name = "w", descriptor = "I")
    public static int field835;

    @OriginalMember(owner = "client!g", name = "y", descriptor = "I")
    public static int field837;

    @OriginalMember(owner = "client!g", name = "z", descriptor = "I")
    public static int field838;

    @OriginalMember(owner = "client!g", name = "A", descriptor = "I")
    public static int field839;

    @OriginalMember(owner = "client!g", name = "B", descriptor = "I")
    public static int field840;

    @OriginalMember(owner = "client!g", name = "C", descriptor = "I")
    public static int field841;

    @OriginalMember(owner = "client!g", name = "H", descriptor = "I")
    public static int field846;

    @OriginalMember(owner = "client!g", name = "v", descriptor = "Led;")
    public static class29 field834;

    @OriginalMember(owner = "client!g", name = "J", descriptor = "Lha;")
    public static class43 field848;

    @OriginalMember(owner = "client!g", name = "r", descriptor = "[B")
    public static byte[] field830;

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(I)Lwc;")
    public static final class128 method303(int arg0) {
        class128 var1 = new class128();
        var1.field2761 = class72.field1613;
        field840++;
        var1.field2758 = class106.field2250;
        var1.field2757 = class61.field1365[0];
        var1.field2755 = class25.field552[0];
        var1.field2756 = class118.field2514[0];
        var1.field2759 = class62.field1382[0];
        if (arg0 > -55) {
            method305(74, 109);
        }
        var1.field2760 = class53.field1219;
        var1.field2754 = class123.field2682[0];
        class51.method409(-70);
        return var1;
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(Lvb;IZI)[Lea;")
    public static final class26[] method304(class122 arg0, int arg1, boolean arg2, int arg3) {
        if (!arg2) {
            method304(null, -7, false, 11);
        }
        field833++;
        return class47.method381((byte) -44, arg0, arg1, arg3) ? class20.method132(-116) : null;
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(II)Z")
    public static final boolean method305(int arg0, int arg1) {
        field835++;
        if (class105.field2210[arg1]) {
            return true;
        } else if (class98.field2162.method946((byte) 26, arg1)) {
            int var2 = class98.field2162.method947(arg1, (byte) 109);
            if (var2 == 0) {
                class105.field2210[arg1] = true;
                return true;
            }
            if (class18.field372[arg1] == null) {
                class18.field372[arg1] = new class78[var2];
            }
            for (int var3 = 0; var3 < var2; var3++) {
                if (class18.field372[arg1][var3] == null) {
                    byte[] var4 = class98.field2162.method932(123, var3, arg1);
                    if (var4 != null) {
                        class18.field372[arg1][var3] = new class78();
                        class18.field372[arg1][var3].method592((byte) -120, new class119(var4));
                    }
                }
            }
            if (arg0 != -1) {
                field853 = null;
            }
            class105.field2210[arg1] = true;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!g", name = "b", descriptor = "(I)V")
    public static final void method306(int arg0) {
        for (int var1 = 0; var1 < class16.field306; var1++) {
            int var3 = class25.field557[var1];
            class43 var4 = class129.field2779[var3];
            int var5 = class56.field1282.method879((byte) 45);
            if ((var5 & 0x4) != 0) {
                var5 += class56.field1282.method879((byte) 45) << 8;
            }
            class1.method3(var3, (byte) -128, var5, var4);
        }
        int var2 = 81 % ((arg0 - 43) / 50);
        field839++;
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "([BIB)I")
    public static final int method307(byte[] arg0, int arg1, byte arg2) {
        field837++;
        if (arg2 != -117) {
            method305(8, -36);
        }
        return class2.method5(0, true, arg1, arg0);
    }

    @OriginalMember(owner = "client!g", name = "c", descriptor = "(I)V")
    public static final void method308(int arg0) {
        if (arg0 < 115) {
            field851 = null;
        }
        class114.field2435 = 0;
        class25.field545 = -1;
        class5.field85.field2554 = 0;
        class122.field2660 = -1;
        class11.field185 = 0;
        class21.field482 = 0;
        class56.field1282.field2554 = 0;
        class34.field778 = -1;
        class48.field1118 = 0;
        class76.field1692 = 0;
        class12.field203 = -1;
        class13.field243 = false;
        field838++;
        class127.field2750 = 0;
        class74.method574(0, 30);
    }

    @OriginalMember(owner = "client!g", name = "c", descriptor = "(B)V")
    public static void method309(byte arg0) {
        field856 = null;
        field853 = null;
        if (arg0 <= 66) {
            field853 = null;
        }
        field830 = null;
        field843 = null;
        field851 = null;
        field834 = null;
        field848 = null;
        field842 = null;
        field850 = null;
    }

    @OriginalMember(owner = "client!g", name = "<init>", descriptor = "(I[B)V")
    public class37(int arg0, byte[] arg1) {
        this.field855 = arg0;
        class119 var3 = new class119(arg1);
        this.field844 = var3.method879((byte) 45);
        this.field845 = new int[this.field844];
        this.field849 = new int[this.field844][];
        for (int var4 = 0; var4 < this.field844; var4++) {
            this.field845[var4] = var3.method879((byte) 45);
        }
        for (int var5 = 0; var5 < this.field844; var5++) {
            this.field849[var5] = new int[var3.method879((byte) 45)];
        }
        for (int var6 = 0; var6 < this.field844; var6++) {
            for (int var7 = 0; var7 < this.field849[var6].length; var7++) {
                this.field849[var6][var7] = var3.method879((byte) 45);
            }
        }
    }
}
