import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!re")
public class class236 extends class134 {

    @OriginalMember(owner = "client!re", name = "x", descriptor = "I")
    public int field3987;

    @OriginalMember(owner = "client!re", name = "t", descriptor = "I")
    public int field3983;

    @OriginalMember(owner = "client!re", name = "w", descriptor = "I")
    public static int field3986 = 0;

    @OriginalMember(owner = "client!re", name = "q", descriptor = "Ldd;")
    public static class91 field3980 = new class91(5000);

    @OriginalMember(owner = "client!re", name = "z", descriptor = "I")
    public static int field3989 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "client!re", name = "y", descriptor = "[Z")
    public static boolean[] field3988 = new boolean[100];

    @OriginalMember(owner = "client!re", name = "o", descriptor = "I")
    public static int field3978;

    @OriginalMember(owner = "client!re", name = "p", descriptor = "I")
    public static int field3979;

    @OriginalMember(owner = "client!re", name = "r", descriptor = "I")
    public static int field3981;

    @OriginalMember(owner = "client!re", name = "s", descriptor = "I")
    public static int field3982;

    @OriginalMember(owner = "client!re", name = "u", descriptor = "I")
    public static int field3984;

    @OriginalMember(owner = "client!re", name = "v", descriptor = "I")
    public static int field3985;

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(IIIIB)V")
    public static final void method1693(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        int var5 = 72 / ((arg4 + 65) / 54);
        int var6 = 0;
        field3985++;
        int var7 = arg0;
        int var8 = -arg0;
        int var9 = -1;
        int var10 = class243.method1742(class23.field423, 0, class272.field4552, arg0 + arg2);
        int var11 = class243.method1742(class23.field423, 0, class272.field4552, arg2 - arg0);
        class134.method996(0, var10, var11, arg1, class41.field630[arg3]);
        while (var6 < var7) {
            var9 += 2;
            var8 += var9;
            if (var8 > 0) {
                var7--;
                var8 -= var7 << 1;
                int var12 = arg3 - var7;
                int var13 = arg3 + var7;
                if (class55.field972 <= var13 && class240.field4053 >= var12) {
                    int var14 = class243.method1742(class23.field423, 0, class272.field4552, arg2 + var6);
                    int var15 = class243.method1742(class23.field423, 0, class272.field4552, arg2 - var6);
                    if (class240.field4053 >= var13) {
                        class134.method996(0, var14, var15, arg1, class41.field630[var13]);
                    }
                    if (var12 >= class55.field972) {
                        class134.method996(0, var14, var15, arg1, class41.field630[var12]);
                    }
                }
            }
            var6++;
            int var16 = arg3 - var6;
            int var17 = arg3 + var6;
            if (class55.field972 <= var17 && var16 <= class240.field4053) {
                int var18 = class243.method1742(class23.field423, 0, class272.field4552, arg2 + var7);
                int var19 = class243.method1742(class23.field423, 0, class272.field4552, arg2 - var7);
                if (var17 <= class240.field4053) {
                    class134.method996(0, var18, var19, arg1, class41.field630[var17]);
                }
                if (class55.field972 <= var16) {
                    class134.method996(0, var18, var19, arg1, class41.field630[var16]);
                }
            }
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(ZZ)V")
    public static final void method1694(boolean arg0, boolean arg1) {
        if (arg0) {
            if (class243.field4082 != -1) {
                class220.method1565(class243.field4082, true);
            }
            for (class278 var2 = (class278) class306.field4952.method982(-9570); var2 != null; var2 = (class278) class306.field4952.method981(-1)) {
                class272.method1917((byte) 74, true, var2);
            }
            class243.field4082 = -1;
            class306.field4952 = new class132(8);
            class253.method1833(-2763);
            class243.field4082 = class258.field4336;
            class215.method1536(28942, false);
            class58.method369((byte) -106);
            class279.method1955(class243.field4082, 2000000);
        }
        class221.field3718 = -1;
        class283.method1973(arg1, class116.field1976);
        field3982++;
        class16.field314 = new class123();
        class16.field314.field771 = 3000;
        class16.field314.field715 = 3000;
        if (class43.field659 == 0) {
            class167.method1247(0, class25.field445);
            class240.method1719(10, 31136);
            return;
        }
        if (class169.field2739 == 2) {
            class107.field1758 = class208.field3522 << 7;
            class76.field1302 = class233.field3939 << 7;
        } else {
            class171.method1276((byte) -34);
        }
        class279.method1957(arg1);
        class240.method1719(28, 31136);
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(B)V")
    public static void method1695(byte arg0) {
        if (arg0 == 0) {
            field3988 = null;
            field3980 = null;
        }
    }

    @OriginalMember(owner = "client!re", name = "<init>", descriptor = "(II)V")
    public class236(int arg0, int arg1) {
        this.field3987 = arg0;
        this.field3983 = arg1;
    }
}
