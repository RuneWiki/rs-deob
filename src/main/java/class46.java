import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kh")
public class class46 {

    @OriginalMember(owner = "client!kh", name = "e", descriptor = "Ljava/lang/String;")
    public static String field677 = "M";

    @OriginalMember(owner = "client!kh", name = "g", descriptor = "Ljava/lang/String;")
    public static String field679 = "shake:";

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "[Z")
    public static boolean[] field673 = new boolean[5];

    @OriginalMember(owner = "client!kh", name = "d", descriptor = "[I")
    public static int[] field676 = new int[5];

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "I")
    public static int field674;

    @OriginalMember(owner = "client!kh", name = "c", descriptor = "I")
    public static int field675;

    @OriginalMember(owner = "client!kh", name = "f", descriptor = "I")
    public static int field678;

    @OriginalMember(owner = "client!kh", name = "i", descriptor = "Lke;")
    public static class110 field681;

    @OriginalMember(owner = "client!kh", name = "h", descriptor = "Lpa;")
    public static class220 field680;

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(Z)V")
    public static final void method301(boolean arg0) {
        if (arg0) {
            class194.field2682 = class296.field4674;
            class200.field2788 = class95.field1341;
        } else {
            class194.field2682 = class278.field4313;
            class200.field2788 = class137.field1924;
        }
        class27.field342 = class194.field2682.length;
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(Lse;BIII)V")
    public static final void method302(class211 arg0, byte arg1, int arg2, int arg3, int arg4) {
        if (class286.field4481 >= 3) {
            class64.method408(arg4, arg3, 0, arg0.field3182, arg0.field3106);
        } else {
            ((class128) class216.field3260).method877(arg4, arg3, arg0.field3112, arg0.field3166, class216.field3260.field1539 / 2, class216.field3260.field1538 / 2, (int) class68.field912, 256, arg0.field3182, arg0.field3106);
        }
        int var5 = -69 % ((arg1 + 38) / 61);
        field678++;
        class293.field4607[arg2] = true;
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(IB[BI)Z")
    public static final boolean method303(int arg0, byte arg1, byte[] arg2, int arg3) {
        field675++;
        boolean var4 = true;
        class224 var5 = new class224(arg2);
        int var6 = -1;
        label60: while (true) {
            int var7 = var5.method1469(31412);
            if (var7 == 0) {
                if (arg1 != -115) {
                    field679 = null;
                }
                return var4;
            }
            var6 += var7;
            boolean var8 = false;
            int var9 = 0;
            while (true) {
                while (!var8) {
                    int var11 = var5.method1461(true);
                    if (var11 == 0) {
                        continue label60;
                    }
                    var9 += var11 - 1;
                    int var12 = var9 & 0x3F;
                    int var13 = (var9 & 0xFCE) >> 6;
                    int var14 = var5.method1453((byte) -127) >> 2;
                    int var15 = arg3 + var13;
                    int var16 = arg0 + var12;
                    if (var15 > 0 && var16 > 0 && var15 < 103 && var16 < 103) {
                        class111 var17 = class76.method489(var6, 17);
                        if (var14 != 22 || class75.field1053 || var17.field1605 != 0 || var17.field1584 == 1 || var17.field1574) {
                            if (!var17.method717(-1)) {
                                var4 = false;
                                class92.field1279++;
                            }
                            var8 = true;
                        }
                    }
                }
                int var10 = var5.method1461(true);
                if (var10 == 0) {
                    break;
                }
                var5.method1453((byte) -127);
            }
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(B)V")
    public static void method304(byte arg0) {
        field679 = null;
        if (arg0 > -83) {
            field673 = null;
        }
        field677 = null;
        field681 = null;
        field673 = null;
        field680 = null;
        field676 = null;
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(I)V")
    public static final void method305(int arg0) {
        field674++;
        if (class217.field3280 != null && (class217.field3280.field4019 + (64 - (class217.field3280.method561(-1) * 64)) >> 7) == class234.field3535 && (class217.field3280.field4085 - (class217.field3280.method561(-1) * 64 - 64) >> 7) == class199.field2768) {
            class234.field3535 = 0;
        }
        for (int var1 = 0; var1 < 104; var1++) {
            for (int var6 = 0; var6 < 104; var6++) {
                class279.field4324[var1][var6] = 0;
            }
        }
        int var2 = 0;
        if (arg0 != -105) {
            field680 = null;
        }
        while (class103.field1442 > var2) {
            class88 var5 = class154.field2133[class205.field2848[var2]];
            if (var5 != null) {
                var5.field4056 = false;
            }
            var2++;
        }
        for (int var3 = 0; var3 < class92.field1283; var3++) {
            class140 var4 = class119.field1679[class194.field2688[var3]];
            if (var4 != null) {
                var4.field4056 = false;
            }
        }
    }
}
