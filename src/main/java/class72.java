import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public class class72 extends class61 {

    @OriginalMember(owner = "client!ie", name = "l", descriptor = "I")
    public int field1356;

    @OriginalMember(owner = "client!ie", name = "r", descriptor = "I")
    private int field1362;

    @OriginalMember(owner = "client!ie", name = "w", descriptor = "[Z")
    public boolean[] field1367;

    @OriginalMember(owner = "client!ie", name = "q", descriptor = "[[I")
    public int[][] field1361;

    @OriginalMember(owner = "client!ie", name = "p", descriptor = "[I")
    public int[] field1360;

    @OriginalMember(owner = "client!ie", name = "j", descriptor = "I")
    public static int field1354;

    @OriginalMember(owner = "client!ie", name = "k", descriptor = "I")
    public static int field1355;

    @OriginalMember(owner = "client!ie", name = "m", descriptor = "I")
    public static int field1357;

    @OriginalMember(owner = "client!ie", name = "o", descriptor = "I")
    public static int field1359;

    @OriginalMember(owner = "client!ie", name = "s", descriptor = "I")
    public static int field1363;

    @OriginalMember(owner = "client!ie", name = "t", descriptor = "I")
    public static int field1364;

    @OriginalMember(owner = "client!ie", name = "u", descriptor = "I")
    public static int field1365;

    @OriginalMember(owner = "client!ie", name = "v", descriptor = "I")
    public static int field1366;

    @OriginalMember(owner = "client!ie", name = "n", descriptor = "[Lvg;")
    public static class230[] field1358;

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(B)V")
    public static void method414(byte arg0) {
        if (arg0 >= -23) {
            field1359 = -73;
        }
        field1358 = null;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "([Llc;Z)[Llc;")
    public static final class143[] method415(class143[] arg0, boolean arg1) {
        field1354++;
        class143[] var2 = new class143[5];
        int var3 = 0;
        if (!arg1) {
            method417(71, (class7) null);
        }
        while (var3 < 5) {
            var2[var3] = class25.method179(0, new class143[] { class274.method1806(var3, true), class171.field3057 });
            if (arg0 != null && arg0[var3] != null) {
                var2[var3] = class25.method179(0, new class143[] { var2[var3], arg0[var3] });
            }
            var3++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(ZI)V")
    public static final void method416(boolean arg0, int arg1) {
        class178.field3193 = new int[104];
        class36.field618 = new int[104];
        class173.field3108 = new int[104];
        field1366++;
        class133.field2326 = new int[104];
        class287.field5041 = 99;
        if (arg1 != -1) {
            method419(-125, 101);
        }
        byte var2;
        if (arg0) {
            var2 = 1;
        } else {
            var2 = 4;
        }
        class153.field2771 = new byte[var2][104][104];
        class236.field4299 = new byte[var2][104][104];
        class36.field620 = new byte[var2][104][104];
        class283.field4992 = new byte[var2][104][104];
        class137.field2405 = new byte[var2][105][105];
        class272.field4858 = new int[var2][105][105];
        class7.field146 = new int[104];
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(ILgf;)V")
    public static final void method417(int arg0, class7 arg1) {
        field1357++;
        class157.field2818 = arg1;
        int var2 = 37 / ((-arg0 - 6) / 33);
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(Z)V")
    public static final void method418(boolean arg0) {
        field1355++;
        if (!class21.method149((byte) -57) && class225.field4075 != class170.field3044) {
            class5.method27(class229.field4195.field4148[0], class170.field3044, false, class272.field4854, -11, class66.field1233, class229.field4195.field4115[0]);
            return;
        }
        if (!arg0) {
            field1359 = 111;
        }
        if (class192.field3539 != class170.field3044) {
            class192.field3539 = class170.field3044;
            class134.method806(class170.field3044, 3);
            class114.method689((byte) -58);
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(II)I")
    public static final int method419(int arg0, int arg1) {
        field1364++;
        if (arg0 < 0) {
            return 0;
        }
        class162 var2 = (class162) class143.field2518.method1824((long) arg0, 0);
        if (var2 == null) {
            return class5.method25(121, arg0).field2763;
        }
        if (arg1 != 5236) {
            method420((class190) null, -86);
        }
        int var3 = 0;
        for (int var4 = 0; var4 < var2.field2916.length; var4++) {
            if (var2.field2916[var4] == -1) {
                var3++;
            }
        }
        return var3 + class5.method25(127, arg0).field2763 - var2.field2916.length;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(Lh;I)V")
    public static final void method420(class190 arg0, int arg1) {
        field1365++;
        int var2 = arg0.method1257((byte) 61);
        class26.field431 = new class165[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            class26.field431[var3] = new class165();
            class26.field431[var3].field2960 = arg0.method1257((byte) 99);
            class26.field431[var3].field2963 = arg0.method1256(-32718);
        }
        class158.field2854 = arg0.method1257((byte) 112);
        class234.field4268 = arg0.method1257((byte) 74);
        class112.field1969 = arg0.method1257((byte) 97);
        int var4 = -17 % ((arg1 + 44) / 58);
        class154.field2789 = new class133[class234.field4268 + 1 - class158.field2854];
        for (int var5 = 0; var5 < class112.field1969; var5++) {
            int var6 = arg0.method1257((byte) 80);
            class133 var7 = class154.field2789[var6] = new class133();
            var7.field259 = arg0.method1265(114);
            var7.field264 = arg0.method1269(85);
            var7.field2331 = class158.field2854 + var6;
            var7.field2327 = arg0.method1256(-32718);
            var7.field2335 = arg0.method1256(-32718);
        }
        class154.field2777 = arg0.method1269(100);
        class270.field4825 = true;
    }

    @OriginalMember(owner = "client!ie", name = "<init>", descriptor = "(I[B)V")
    public class72(int arg0, byte[] arg1) {
        this.field1356 = arg0;
        class190 var3 = new class190(arg1);
        this.field1362 = var3.method1265(115);
        this.field1367 = new boolean[this.field1362];
        this.field1361 = new int[this.field1362][];
        this.field1360 = new int[this.field1362];
        for (int var4 = 0; var4 < this.field1362; var4++) {
            this.field1360[var4] = var3.method1265(121);
        }
        for (int var5 = 0; var5 < this.field1362; var5++) {
            this.field1367[var5] = var3.method1265(125) == 1;
        }
        for (int var6 = 0; var6 < this.field1362; var6++) {
            this.field1361[var6] = new int[var3.method1265(121)];
        }
        for (int var7 = 0; var7 < this.field1362; var7++) {
            for (int var8 = 0; var8 < this.field1361[var7].length; var8++) {
                this.field1361[var7][var8] = var3.method1265(115);
            }
        }
    }
}
