import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public class class148 extends class192 {

    @OriginalMember(owner = "client!mc", name = "B", descriptor = "Z")
    public static boolean field2502 = false;

    @OriginalMember(owner = "client!mc", name = "D", descriptor = "S")
    public static short field2504 = 256;

    @OriginalMember(owner = "client!mc", name = "I", descriptor = "I")
    public static int field2509 = 0;

    @OriginalMember(owner = "client!mc", name = "K", descriptor = "[[[I")
    public static int[][][] field2511 = new int[4][13][13];

    @OriginalMember(owner = "client!mc", name = "S", descriptor = "Loh;")
    public static class258 field2519 = class153.method1046("Stufe: ", 122);

    @OriginalMember(owner = "client!mc", name = "C", descriptor = "I")
    public static int field2503;

    @OriginalMember(owner = "client!mc", name = "F", descriptor = "I")
    public int field2506;

    @OriginalMember(owner = "client!mc", name = "G", descriptor = "I")
    public static int field2507;

    @OriginalMember(owner = "client!mc", name = "M", descriptor = "I")
    public static int field2513;

    @OriginalMember(owner = "client!mc", name = "N", descriptor = "I")
    public static int field2514;

    @OriginalMember(owner = "client!mc", name = "O", descriptor = "I")
    public static int field2515;

    @OriginalMember(owner = "client!mc", name = "P", descriptor = "I")
    public int field2516;

    @OriginalMember(owner = "client!mc", name = "Q", descriptor = "I")
    public int field2517;

    @OriginalMember(owner = "client!mc", name = "R", descriptor = "I")
    public static int field2518;

    @OriginalMember(owner = "client!mc", name = "T", descriptor = "I")
    public int field2520;

    @OriginalMember(owner = "client!mc", name = "L", descriptor = "Loh;")
    public class258 field2512;

    @OriginalMember(owner = "client!mc", name = "J", descriptor = "[I")
    public int[] field2510;

    @OriginalMember(owner = "client!mc", name = "U", descriptor = "[I")
    public int[] field2521;

    @OriginalMember(owner = "client!mc", name = "H", descriptor = "[Lfk;")
    public class144[] field2508;

    @OriginalMember(owner = "client!mc", name = "E", descriptor = "[Loh;")
    public class258[] field2505;

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "(I)V", line = 23)
    public static void method1018(int arg0) {
        if (arg0 == 0) {
            field2519 = null;
            field2511 = (int[][][]) null;
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(ILva;)Lsg;", line = 47)
    public static final class197 method1019(int arg0, class235 arg1) {
        arg1.method1589(arg0 ^ 0x13D);
        field2518++;
        int var2 = arg1.method1589(98);
        class197 var3 = class100.method748(var2, 14441);
        var3.field3454 = arg1.method1589(arg0 ^ 0x152);
        if (arg0 != 256) {
            method1019(-101, (class235) null);
        }
        int var4 = arg1.method1589(67);
        for (int var5 = 0; var5 < var4; var5++) {
            int var6 = arg1.method1589(54);
            var3.method98(7955, arg1, var6);
        }
        var3.method223(11135);
        return var3;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(IZIB)I", line = 83)
    public static final int method1020(int arg0, boolean arg1, int arg2, byte arg3) {
        class238 var4 = (class238) class287.field4943.method986((long) arg2, arg3 ^ 0xFFFFFFAA);
        if (arg3 != -86) {
            method1018(-82);
        }
        field2514++;
        if (var4 == null) {
            return 0;
        }
        int var5 = 0;
        for (int var6 = 0; var6 < var4.field4153.length; var6++) {
            if (var4.field4153[var6] >= 0 && var4.field4153[var6] < class137.field2336) {
                class61 var7 = class186.method1256((byte) 122, var4.field4153[var6]);
                if (var7.field1019 != null) {
                    class119 var8 = (class119) var7.field1019.method986((long) arg0, arg3 + 86);
                    if (var8 != null) {
                        if (arg1) {
                            var5 += var4.field4160[var6] * var8.field2107;
                        } else {
                            var5 += var8.field2107;
                        }
                    }
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!mc", name = "c", descriptor = "(I)[Ldb;", line = 139)
    public static final class41[] method1021(int arg0) {
        field2515++;
        class41[] var1 = new class41[class152.field2608];
        int var2 = -117 % ((arg0 + 75) / 48);
        for (int var3 = 0; var3 < class152.field2608; var3++) {
            int var4 = class301.field5149[var3] * class113.field1958[var3];
            byte[] var5 = class37.field497[var3];
            int[] var6 = new int[var4];
            for (int var7 = 0; var7 < var4; var7++) {
                var6[var7] = class121.field2143[class2.method15(var5[var7], 255)];
            }
            var1[var3] = new class41(class108.field1919, class23.field279, class279.field4795[var3], class280.field4819[var3], class113.field1958[var3], class301.field5149[var3], var6);
        }
        class290.method2038(120);
        return var1;
    }
}
