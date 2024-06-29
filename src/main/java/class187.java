import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ob")
public class class187 {

    @OriginalMember(owner = "client!ob", name = "f", descriptor = "I")
    public int field2986;

    @OriginalMember(owner = "client!ob", name = "h", descriptor = "I")
    public int field2988;

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "Lmh;")
    public static class62 field2982 = class201.method1405(true, "Texturen geladen)3");

    @OriginalMember(owner = "client!ob", name = "i", descriptor = "Lmh;")
    public static class62 field2989 = class201.method1405(true, "Angreifen");

    @OriginalMember(owner = "client!ob", name = "d", descriptor = "I")
    public static int field2984 = 0;

    @OriginalMember(owner = "client!ob", name = "m", descriptor = "[[Z")
    public static boolean[][] field2993 = new boolean[][] { new boolean[0], { true, false, true }, { true, false, false, true }, { false, false, true, true }, { true, true, false }, { false, true, true }, { true, false, false, true }, { false, false, false, true, true }, { false, true, true }, { true, false, true, true, true }, { false, true, true, true, true }, { false, true, true, true, true, false } };

    @OriginalMember(owner = "client!ob", name = "j", descriptor = "F")
    public static float field2990;

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "I")
    public static int field2981;

    @OriginalMember(owner = "client!ob", name = "c", descriptor = "I")
    public static int field2983;

    @OriginalMember(owner = "client!ob", name = "e", descriptor = "I")
    public static int field2985;

    @OriginalMember(owner = "client!ob", name = "g", descriptor = "I")
    public static int field2987;

    @OriginalMember(owner = "client!ob", name = "k", descriptor = "I")
    public static int field2991;

    @OriginalMember(owner = "client!ob", name = "l", descriptor = "I")
    public static int field2992;

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(B)V", line = 4)
    public static void method1309(byte arg0) {
        field2993 = (boolean[][]) null;
        field2982 = null;
        if (arg0 == -37) {
            field2989 = null;
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(I)[Llc;", line = 16)
    public static final class304[] method1310(int arg0) {
        field2985++;
        if (arg0 != 0) {
            return (class304[]) null;
        }
        if (class173.field2789 == null) {
            class304[] var1 = class102.method811((byte) 44, class193.field3246);
            class304[] var2 = new class304[var1.length];
            int var3 = 0;
            label56: for (int var4 = 0; var4 < var1.length; var4++) {
                class304 var5 = var1[var4];
                if ((var5.field5224 <= 0 || var5.field5224 >= 24) && var5.field5226 >= 800 && var5.field5233 >= 600) {
                    for (int var6 = 0; var6 < var3; var6++) {
                        class304 var7 = var2[var6];
                        if (var5.field5226 == var7.field5226 && var5.field5233 == var7.field5233) {
                            if (var7.field5224 < var5.field5224) {
                                var2[var6] = var5;
                            }
                            continue label56;
                        }
                    }
                    var2[var3] = var5;
                    var3++;
                }
            }
            class173.field2789 = new class304[var3];
            class231.method1631(var2, 0, class173.field2789, 0, var3);
            int[] var8 = new int[class173.field2789.length];
            for (int var9 = 0; var9 < class173.field2789.length; var9++) {
                class304 var10 = class173.field2789[var9];
                var8[var9] = var10.field5233 * var10.field5226;
            }
            class32.method208(var8, -114, class173.field2789);
        }
        return class173.field2789;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(III)V", line = 96)
    public static final void method1311(int arg0, int arg1, int arg2) {
        class264.field4446 = true;
        class184.field2950 = arg0;
        class52.field757 = arg1;
        class153.field2419 = arg2;
        class41.field622 = -1;
        class212.field3568 = -1;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(II)V", line = 105)
    public static final void method1312(int arg0, int arg1) {
        field2987++;
        class249.field4226.method1390(arg0, -67);
        class307.field5267.method1390(arg0, -111);
        if (arg1 == 4433) {
            class275.field4672.method1390(arg0, -110);
        }
    }

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "(I)V", line = 122)
    public static final void method1313(int arg0) {
        class278.field4777 = arg0;
        for (int var1 = 0; var1 < class114.field1900; var1++) {
            for (int var2 = 0; var2 < class252.field4273; var2++) {
                if (class256.field4320[arg0][var1][var2] == null) {
                    class256.field4320[arg0][var1][var2] = new class166(arg0, var1, var2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(IIII)Z", line = 150)
    public static final boolean method1314(int arg0, int arg1, int arg2, int arg3) {
        if (class62.method416(arg0, arg1, arg2)) {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            return class201.method1411(var4 + 1, class37.field569[arg0][arg1][arg2] + arg3, var5 + 1) && class201.method1411(var4 + 128 - 1, class37.field569[arg0][arg1 + 1][arg2] + arg3, var5 + 1) && class201.method1411(var4 + 128 - 1, class37.field569[arg0][arg1 + 1][arg2 + 1] + arg3, var5 + 128 - 1) && class201.method1411(var4 + 1, class37.field569[arg0][arg1][arg2 + 1] + arg3, var5 + 128 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(Lhi;B)V", line = 181)
    public static final void method1315(class26 arg0, byte arg1) {
        class108.field1748 = class250.method1741(arg0, -108, class85.field1383, 0);
        class192.field3233 = new class61[class108.field1748.length];
        class212.field3567 = new class61[class108.field1748.length];
        field2981++;
        class220.field3788 = new class61[class108.field1748.length];
        for (int var2 = 0; var2 < class108.field1748.length; var2++) {
            class108.field1748[var2].method395();
            class192.field3233[var2] = class108.field1748[var2].method394();
            class108.field1748[var2].method395();
            class212.field3567[var2] = class108.field1748[var2].method394();
            class108.field1748[var2].method395();
            class220.field3788[var2] = class108.field1748[var2].method394();
            class108.field1748[var2].method395();
        }
        class270.field4594 = class30.method195(class50.field728, arg0, 126, 0);
        class1.field5 = class49.method319(arg0, 0, 29956, class53.field770);
        class151.field2379 = class49.method319(arg0, 0, 29956, class262.field4396);
        class286.field4890 = class49.method319(arg0, 0, 29956, class260.field4376);
        if (arg1 < 87) {
            return;
        }
        class109.field1761 = class49.method319(arg0, 0, 29956, class244.field4145);
        class298.field5088 = class236.method1669(0, -110, arg0, field2983);
        class228.field3963 = class236.method1669(0, -107, arg0, class42.field644);
        class245.field4169 = class62.method432(0, class155.field2497, arg0, 0);
        class197.field3338 = class236.method1669(0, -105, arg0, class27.field333);
        class293.field4982 = class236.method1669(0, -78, arg0, class2.field28);
        class284.field4859 = class43.method287(0, arg0, (byte) 80, class174.field2803);
        class248.field4212 = class43.method287(0, arg0, (byte) 80, class281.field4799);
        class125.field2097.method2041(class248.field4212, (int[]) null);
        class20.field195.method2041(class248.field4212, (int[]) null);
        class296.field5047.method2041(class248.field4212, (int[]) null);
        class168.field2736 = class250.method1741(arg0, -121, class193.field3245, 0);
        for (int var3 = 0; var3 < class168.field2736.length; var3++) {
            class168.field2736[var3].method398();
        }
        class82 var4 = class298.method2016(23, arg0, class92.field1504, 0);
        var4.method627();
        class17.field173 = new class257(var4);
        class82[] var5 = class30.method195(class267.field4506, arg0, 124, 0);
        for (int var6 = 0; var6 < var5.length; var6++) {
            var5[var6].method627();
        }
        class264.field4451 = new class135[var5.length];
        for (int var7 = 0; var7 < var5.length; var7++) {
            class264.field4451[var7] = new class257(var5[var7]);
        }
        int var8 = (int) (Math.random() * 21.0D) - 10;
        int var9 = (int) (Math.random() * 21.0D) - 10;
        int var10 = (int) (Math.random() * 21.0D) - 10;
        int var11 = (int) (Math.random() * 41.0D) - 20;
        for (int var12 = 0; var12 < class270.field4594.length; var12++) {
            class270.field4594[var12].method633(var8 + var11, var10 + var11, var9 + var11);
        }
        class108.field1748[0].method400(var8 + var11, var10 + var11, var9 + var11);
        class119.field1990 = new class135[class270.field4594.length];
        for (int var13 = 0; var13 < class270.field4594.length; var13++) {
            class119.field1990[var13] = new class257(class270.field4594[var13]);
        }
    }

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "(II)I", line = 297)
    public static final int method1316(int arg0, int arg1) {
        if (arg1 != 255) {
            method1316(-109, -38);
        }
        field2991++;
        return arg0 & 0xFF;
    }

    @OriginalMember(owner = "client!ob", name = "<init>", descriptor = "(IIIIIIZ)V", line = 321)
    public class187(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        this.field2986 = arg5;
        this.field2988 = arg2;
    }
}
