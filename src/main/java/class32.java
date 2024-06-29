import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public class class32 extends class45 {

    @OriginalMember(owner = "client!ec", name = "gb", descriptor = "I")
    public int field899 = 0;

    @OriginalMember(owner = "client!ec", name = "V", descriptor = "Lkd;")
    private static class73 field888 = class126.method1070((byte) -66, "shake:");

    @OriginalMember(owner = "client!ec", name = "eb", descriptor = "Lkd;")
    private static class73 field897 = class126.method1070((byte) -66, "scroll:");

    @OriginalMember(owner = "client!ec", name = "Z", descriptor = "Lkd;")
    public static class73 field892 = class126.method1070((byte) -66, "backbase2");

    @OriginalMember(owner = "client!ec", name = "bb", descriptor = "I")
    public static int field894 = 0;

    @OriginalMember(owner = "client!ec", name = "fb", descriptor = "[[[I")
    public static int[][][] field898 = new int[4][13][13];

    @OriginalMember(owner = "client!ec", name = "ab", descriptor = "Lkd;")
    public static class73 field893 = field888;

    @OriginalMember(owner = "client!ec", name = "U", descriptor = "Lkd;")
    public static class73 field887 = field888;

    @OriginalMember(owner = "client!ec", name = "cb", descriptor = "Lkd;")
    public static class73 field895 = class126.method1070((byte) -66, "::fpson");

    @OriginalMember(owner = "client!ec", name = "X", descriptor = "Lkd;")
    public static class73 field890 = field897;

    @OriginalMember(owner = "client!ec", name = "db", descriptor = "Lkd;")
    public static class73 field896 = field897;

    @OriginalMember(owner = "client!ec", name = "R", descriptor = "I")
    public static int field884;

    @OriginalMember(owner = "client!ec", name = "S", descriptor = "I")
    public static int field885;

    @OriginalMember(owner = "client!ec", name = "T", descriptor = "I")
    public static int field886;

    @OriginalMember(owner = "client!ec", name = "W", descriptor = "I")
    public static int field889;

    @OriginalMember(owner = "client!ec", name = "Y", descriptor = "I")
    public static int field891;

    @OriginalMember(owner = "client!ec", name = "hb", descriptor = "I")
    public static int field900;

    @OriginalMember(owner = "client!ec", name = "ib", descriptor = "I")
    public static int field901;

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(BII)Z")
    public static final boolean method255(byte arg0, int arg1, int arg2) {
        field900++;
        if (arg2 == 0 && class119.field3054 == arg1) {
            return true;
        }
        if (arg0 > -41) {
            field894 = -120;
        }
        if (arg2 == 1 && class24.field702 == arg1) {
            return true;
        } else {
            return (arg2 == 2 || arg2 == 3) && class133.field3351 == arg1;
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(Lqc;B)V")
    public final void method256(class114 arg0, byte arg1) {
        field889++;
        if (arg1 <= 32) {
            field898 = null;
        }
        while (true) {
            int var3 = arg0.method957((byte) 56);
            if (var3 == 0) {
                return;
            }
            this.method260(-7674, arg0, var3);
        }
    }

    @OriginalMember(owner = "client!ec", name = "c", descriptor = "(I)V")
    public static final void method257(int arg0) {
        int var1 = -60 % ((42 - arg0) / 48);
        field901++;
        class42.field1139++;
        class15.method125(true, (byte) 125);
        class20.method161(true, -123);
        class15.method125(false, (byte) 125);
        class20.method161(false, 67);
        class70.method587((byte) 114);
        class83.method706((byte) 85);
        if (!class31.field873) {
            int var2 = class86.field2183;
            if (class24.field699 / 256 > var2) {
                var2 = class24.field699 / 256;
            }
            if (class47.field1265[4] && class140.field3483[4] + 128 > var2) {
                var2 = class140.field3483[4] + 128;
            }
            int var3 = class55.field1490 + class121.field3107 & 0x7FF;
            class143.method1158(class49.field1307, (byte) 127, var3, var2 * 3 + 600, class58.field1544, class70.method585(class11.field320, class73.field1901.field2277, class73.field1901.field2264, (byte) -53) - 50, var2);
        }
        int var4;
        if (class31.field873) {
            var4 = class71.method591(70);
        } else {
            var4 = class47.method378(19661064);
        }
        int var5 = class30.field857;
        int var6 = class23.field664;
        int var7 = class70.field1785;
        int var8 = class122.field3118;
        int var9 = class42.field1128;
        for (int var10 = 0; var10 < 5; var10++) {
            if (class47.field1265[var10]) {
                int var11 = (int) ((double) -class1.field79[var10] + (double) (class1.field79[var10] * 2 + 1) * Math.random() + Math.sin((double) class141.field3509[var10] / 100.0D * (double) class61.field1614[var10]) * (double) class140.field3483[var10]);
                if (var10 == 3) {
                    class42.field1128 = class42.field1128 + var11 & 0x7FF;
                }
                if (var10 == 0) {
                    class30.field857 += var11;
                }
                if (var10 == 2) {
                    class70.field1785 += var11;
                }
                if (var10 == 4) {
                    class122.field3118 += var11;
                    if (class122.field3118 < 128) {
                        class122.field3118 = 128;
                    }
                    if (class122.field3118 > 383) {
                        class122.field3118 = 383;
                    }
                }
                if (var10 == 1) {
                    class23.field664 += var11;
                }
            }
        }
        class136.method1115(8);
        class91.field2349 = 0;
        class91.field2354 = class3.field161 - 4;
        class91.field2345 = true;
        class91.field2357 = class31.field869 - 4;
        class92.method771((byte) 50);
        class17.method140();
        class92.method771((byte) 50);
        class34.field923.method60(class30.field857, class23.field664, class70.field1785, class122.field3118, class42.field1128, var4);
        class92.method771((byte) 50);
        class34.field923.method59();
        class33.method264((byte) 113);
        class20.method159((byte) 81);
        ((class84) class29.field829).method711(class125.field3166, 1);
        class21.method169(false);
        if (class2.field147 && class82.method698(false, 6717, true) == 0) {
            class2.field147 = false;
        }
        if (class2.field147) {
            class136.method1115(8);
            class17.method140();
            class11.method97(class137.field3406, false, false, null);
        }
        class92.method771((byte) 50);
        class110.method879((byte) 123);
        class30.field857 = var5;
        class23.field664 = var6;
        class70.field1785 = var7;
        class42.field1128 = var9;
        class122.field3118 = var8;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(I[Lkd;)Lkd;")
    public static final class73 method258(int arg0, class73[] arg1) {
        if (arg0 > -56) {
            method259(-126);
        }
        field884++;
        if (arg1.length < 2) {
            throw new IllegalArgumentException();
        }
        return class19.method157(arg1, arg1.length, (byte) -110, 0);
    }

    @OriginalMember(owner = "client!ec", name = "d", descriptor = "(I)V")
    public static void method259(int arg0) {
        field887 = null;
        field888 = null;
        field895 = null;
        field893 = null;
        field898 = null;
        field896 = null;
        field890 = null;
        field892 = null;
        field897 = null;
        if (arg0 != 256) {
            field897 = null;
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(ILqc;I)V")
    private final void method260(int arg0, class114 arg1, int arg2) {
        field886++;
        if (arg0 != -7674) {
            field897 = null;
        }
        if (arg2 == 2) {
            this.field899 = arg1.method944((byte) 123);
        }
    }
}
