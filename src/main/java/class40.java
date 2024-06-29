import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gd")
public class class40 extends class22 {

    @OriginalMember(owner = "client!gd", name = "z", descriptor = "I")
    public int field898;

    @OriginalMember(owner = "client!gd", name = "J", descriptor = "I")
    private int field907;

    @OriginalMember(owner = "client!gd", name = "C", descriptor = "[[I")
    public int[][] field901;

    @OriginalMember(owner = "client!gd", name = "x", descriptor = "[I")
    public int[] field896;

    @OriginalMember(owner = "client!gd", name = "I", descriptor = "I")
    public static int field906 = 0;

    @OriginalMember(owner = "client!gd", name = "K", descriptor = "Z")
    public static boolean field908 = false;

    @OriginalMember(owner = "client!gd", name = "D", descriptor = "Z")
    public static boolean field902 = false;

    @OriginalMember(owner = "client!gd", name = "F", descriptor = "Lva;")
    private static class121 field903 = class107.method797("and choose the (Wcreate account(W", -10983);

    @OriginalMember(owner = "client!gd", name = "M", descriptor = "I")
    public static int field910 = -1;

    @OriginalMember(owner = "client!gd", name = "B", descriptor = "Lva;")
    public static class121 field900 = field903;

    @OriginalMember(owner = "client!gd", name = "v", descriptor = "I")
    public static int field894;

    @OriginalMember(owner = "client!gd", name = "w", descriptor = "I")
    public static int field895;

    @OriginalMember(owner = "client!gd", name = "G", descriptor = "I")
    public static int field904;

    @OriginalMember(owner = "client!gd", name = "H", descriptor = "I")
    public static int field905;

    @OriginalMember(owner = "client!gd", name = "L", descriptor = "I")
    public static int field909;

    @OriginalMember(owner = "client!gd", name = "A", descriptor = "Lfa;")
    public static class32 field899;

    @OriginalMember(owner = "client!gd", name = "y", descriptor = "Lm;")
    public static class72 field897;

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(II)V", line = 14)
    public static final void method264(int arg0, int arg1) {
        field895++;
        if (!class56.method406(17754)) {
            return;
        }
        if (arg1 != 17324) {
            method264(-69, -46);
        }
        if (class97.field2180) {
            client.field432 = arg0;
        } else {
            class64.method457(true, arg0);
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(Z)V", line = 40)
    public static final void method265(boolean arg0) {
        field894++;
        class9.field151 = arg0;
        class56.method408((byte) 117);
        if (class69.field1651 != -1) {
            boolean var2 = class46.method310(0, 190, -1, 1, 0, class69.field1651, (byte) 99, 261, 0);
            if (!var2) {
                class97.field2168 = true;
            }
        } else if (class42.field956[class28.field716] != -1) {
            boolean var1 = class46.method310(0, 190, -1, 1, 0, class42.field956[class28.field716], (byte) 99, 261, 0);
            if (!var1) {
                class97.field2168 = true;
            }
        }
        if (class100.field2245 && class13.field240 == 1) {
            class100.method677((byte) 77);
        }
        class37.method255(-18443);
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(I)I", line = 79)
    public static final int method266(int arg0) {
        field909++;
        if (arg0 == 0) {
            int var1 = class47.method340(class15.field304, -6, class121.field2807, class37.field860);
            return var1 - class116.field2645 >= 800 || (class23.field613[class121.field2807][class15.field304 >> 7][class37.field860 >> 7] & 0x4) == 0 ? 3 : class121.field2807;
        } else {
            return -95;
        }
    }

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "(Z)V", line = 97)
    public static void method267(boolean arg0) {
        field903 = null;
        field899 = null;
        field897 = null;
        if (!arg0) {
            method264(-127, -128);
        }
        field900 = null;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(Led;I)V", line = 111)
    public static final void method268(class29 arg0, int arg1) {
        if (class115.field2614 == arg0.field780 || arg0.field793 == -1 || arg0.field778 != 0 || arg0.field746 + 1 > class5.method33(9, arg0.field793).field939[arg0.field785]) {
            int var2 = class115.field2614 - arg0.field726;
            int var3 = arg0.field780 - arg0.field726;
            int var4 = arg0.field786 * 64 + arg0.field764 * 128;
            int var5 = arg0.field786 * 64 + arg0.field745 * 128;
            int var6 = arg0.field786 * 64 + arg0.field741 * 128;
            arg0.field750 = ((var3 - var2) * var4 + var2 * var6) / var3;
            int var7 = arg0.field787 * 128 + arg0.field786 * 64;
            arg0.field742 = ((var3 - var2) * var5 + var2 * var7) / var3;
        }
        arg0.field729 = 0;
        field905++;
        if (arg0.field748 == 0) {
            arg0.field725 = 1024;
        }
        if (arg0.field748 == 1) {
            arg0.field725 = 1536;
        }
        if (arg0.field748 == 2) {
            arg0.field725 = 0;
        }
        if (arg0.field748 == 3) {
            arg0.field725 = 512;
        }
        int var8 = -87 % ((40 - arg1) / 60);
        arg0.field739 = arg0.field725;
    }

    @OriginalMember(owner = "client!gd", name = "<init>", descriptor = "(I[B)V", line = 170)
    public class40(int arg0, byte[] arg1) {
        this.field898 = arg0;
        class113 var3 = new class113(arg1);
        this.field907 = var3.method821(true);
        this.field901 = new int[this.field907][];
        this.field896 = new int[this.field907];
        for (int var4 = 0; var4 < this.field907; var4++) {
            this.field896[var4] = var3.method821(true);
        }
        for (int var5 = 0; var5 < this.field907; var5++) {
            this.field901[var5] = new int[var3.method821(true)];
        }
        for (int var6 = 0; var6 < this.field907; var6++) {
            for (int var7 = 0; var7 < this.field901[var6].length; var7++) {
                this.field901[var6][var7] = var3.method821(true);
            }
        }
    }
}
