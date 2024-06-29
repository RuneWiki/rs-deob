import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public abstract class class103 extends class42 {

    @OriginalMember(owner = "client!ra", name = "db", descriptor = "I")
    public int field2505 = 1000;

    @OriginalMember(owner = "client!ra", name = "cb", descriptor = "[Lka;")
    public static class61[] field2504 = new class61[32768];

    @OriginalMember(owner = "client!ra", name = "lb", descriptor = "Lad;")
    public static class5 field2513 = class88.method674("auf der Hautpseite)3", -103);

    @OriginalMember(owner = "client!ra", name = "kb", descriptor = "Lad;")
    public static class5 field2512 = class88.method674("(U2", 17);

    @OriginalMember(owner = "client!ra", name = "qb", descriptor = "I")
    public static int field2518 = -1;

    @OriginalMember(owner = "client!ra", name = "pb", descriptor = "I")
    public static int field2517 = 255;

    @OriginalMember(owner = "client!ra", name = "eb", descriptor = "I")
    public static int field2506;

    @OriginalMember(owner = "client!ra", name = "gb", descriptor = "I")
    public static int field2508;

    @OriginalMember(owner = "client!ra", name = "hb", descriptor = "I")
    public static int field2509;

    @OriginalMember(owner = "client!ra", name = "jb", descriptor = "I")
    public static int field2511;

    @OriginalMember(owner = "client!ra", name = "mb", descriptor = "I")
    public static int field2514;

    @OriginalMember(owner = "client!ra", name = "nb", descriptor = "I")
    public static int field2515;

    @OriginalMember(owner = "client!ra", name = "ob", descriptor = "I")
    public static int field2516;

    @OriginalMember(owner = "client!ra", name = "rb", descriptor = "I")
    public static int field2519;

    @OriginalMember(owner = "client!ra", name = "sb", descriptor = "I")
    public static int field2520;

    @OriginalMember(owner = "client!ra", name = "fb", descriptor = "Lrd;")
    public static class106 field2507;

    @OriginalMember(owner = "client!ra", name = "ib", descriptor = "Lsb;")
    public static class110 field2510;

    @OriginalMember(owner = "client!ra", name = "f", descriptor = "(I)V", line = 6)
    public static final void method825(int arg0) {
        class14.field396.method101((byte) -95);
        if (arg0 == 10294) {
            class58.field1437.method101((byte) -88);
            field2519++;
        }
    }

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "(Z)V", line = 19)
    public static void method826(boolean arg0) {
        if (arg0) {
            return;
        }
        field2510 = null;
        field2507 = null;
        field2504 = null;
        field2512 = null;
        field2513 = null;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(IBI)I", line = 40)
    public static final int method827(int arg0, byte arg1, int arg2) {
        field2508++;
        int var3 = class135.method1034(-38, 4, arg2 + 91923, arg0 + 45365) + (class135.method1034(-98, 2, arg2 + 37821, arg0 + 10294) - 128 >> 1) + (class135.method1034(-94, 1, arg2, arg0) + -128 >> 2) - 128;
        if (arg1 > -68) {
            field2512 = null;
        }
        int var4 = (int) ((double) var3 * 0.3D) + 35;
        if (var4 < 10) {
            var4 = 10;
        } else if (var4 > 60) {
            var4 = 60;
        }
        return var4;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(II)V", line = 63)
    public static final void method828(int arg0, int arg1) {
        field2514++;
        if (!class116.method928(-119, arg1)) {
            return;
        }
        class105[] var2 = class121.field3013[arg1];
        if (arg0 != 29103) {
            field2518 = -106;
        }
        for (int var3 = 0; var3 < var2.length; var3++) {
            class105 var4 = var2[var3];
            if (var4 != null) {
                var4.field2621 = 0;
                var4.field2559 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(IIIIIIIII)V", line = 95)
    public void method388(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field2516++;
        class45 var10 = this.method30((byte) -106);
        if (var10 != null) {
            this.field2505 = var10.field2505;
            var10.method388(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        }
    }

    @OriginalMember(owner = "client!ra", name = "c", descriptor = "(Z)V", line = 110)
    public static final void method829(boolean arg0) {
        if (!arg0) {
            return;
        }
        field2509++;
        if (class4.field145 < 2 && class112.field2814 == 0 && class118.field2920 == 0) {
            return;
        }
        class5 var1;
        if (class112.field2814 == 1 && class4.field145 < 2) {
            var1 = class69.method546(true, new class5[] { class9.field318, class4.field144, class53.field1337, class88.field2081 });
        } else if (class118.field2920 == 1 && class4.field145 < 2) {
            var1 = class69.method546(true, new class5[] { class105.field2631, class4.field144, class38.field940, class88.field2081 });
        } else {
            var1 = class121.field3008[class4.field145 - 1];
        }
        if (class4.field145 > 2) {
            var1 = class69.method546(true, new class5[] { var1, class94.field2213, class106.method864(18413, class4.field145 - 2), class4.field129 });
        }
        class135.field3263.method1003(var1, 4, 15, 16777215, true, class69.field1636 / 1000);
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(BI)Lad;", line = 139)
    public static final class5 method830(byte arg0, int arg1) {
        class5 var2 = new class5();
        var2.field164 = new byte[arg1];
        field2511++;
        if (arg0 != 78) {
            field2510 = null;
        }
        var2.field183 = 0;
        return var2;
    }

    @OriginalMember(owner = "client!ra", name = "c", descriptor = "(B)Lhc;", line = 167)
    public class45 method30(byte arg0) {
        field2515++;
        int var2 = -53 % ((-arg0 - 14) / 59);
        return null;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(BLgb;)Lad;", line = 198)
    public static final class5 method831(byte arg0, class39 arg1) {
        int var2 = 15 % ((arg0 - 53) / 45);
        field2506++;
        return class75.method597(6144, 32767, arg1);
    }
}
