import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ug")
public class class300 extends class262 {

    @OriginalMember(owner = "client!ug", name = "S", descriptor = "Z")
    public static boolean field5078 = true;

    @OriginalMember(owner = "client!ug", name = "R", descriptor = "[I")
    public static int[] field5077 = new int[4096];

    @OriginalMember(owner = "client!ug", name = "V", descriptor = "F")
    public static float field5081;

    @OriginalMember(owner = "client!ug", name = "O", descriptor = "I")
    public static int field5074;

    @OriginalMember(owner = "client!ug", name = "Q", descriptor = "I")
    public static int field5076;

    @OriginalMember(owner = "client!ug", name = "T", descriptor = "I")
    public static int field5079;

    @OriginalMember(owner = "client!ug", name = "U", descriptor = "I")
    public static int field5080;

    @OriginalMember(owner = "client!ug", name = "X", descriptor = "I")
    public static int field5083;

    @OriginalMember(owner = "client!ug", name = "Y", descriptor = "I")
    public static int field5084;

    @OriginalMember(owner = "client!ug", name = "Z", descriptor = "I")
    public static int field5085;

    @OriginalMember(owner = "client!ug", name = "ab", descriptor = "I")
    public static int field5086;

    @OriginalMember(owner = "client!ug", name = "bb", descriptor = "I")
    private int field5087;

    @OriginalMember(owner = "client!ug", name = "cb", descriptor = "I")
    private int field5088;

    @OriginalMember(owner = "client!ug", name = "db", descriptor = "I")
    private int field5089;

    @OriginalMember(owner = "client!ug", name = "P", descriptor = "[[[B")
    public static byte[][][] field5075;

    @OriginalMember(owner = "client!ug", name = "W", descriptor = "[[[I")
    public static int[][][] field5082;

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(II[JI[Ljava/lang/Object;)V", line = 6)
    public static final void method2115(int arg0, int arg1, long[] arg2, int arg3, Object[] arg4) {
        field5074++;
        if (arg1 != 17965) {
            method2115(116, 84, (long[]) null, -126, (Object[]) null);
        }
        if (arg0 <= arg3) {
            return;
        }
        int var5 = (arg0 + arg3) / 2;
        int var6 = arg3;
        long var7 = arg2[var5];
        arg2[var5] = arg2[arg0];
        arg2[arg0] = var7;
        Object var9 = arg4[var5];
        arg4[var5] = arg4[arg0];
        arg4[arg0] = var9;
        for (int var10 = arg3; var10 < arg0; var10++) {
            if (arg2[var10] < var7 + ((long) (var10 & 0x1))) {
                long var11 = arg2[var10];
                arg2[var10] = arg2[var6];
                arg2[var6] = var11;
                Object var13 = arg4[var10];
                arg4[var10] = arg4[var6];
                arg4[var6++] = var13;
            }
        }
        arg2[arg0] = arg2[var6];
        arg2[var6] = var7;
        arg4[arg0] = arg4[var6];
        arg4[var6] = var9;
        method2115(var6 - 1, 17965, arg2, arg3, arg4);
        method2115(arg0, 17965, arg2, var6 + 1, arg4);
    }

    @OriginalMember(owner = "client!ug", name = "<init>", descriptor = "()V", line = 58)
    public class300() {
        this(0);
    }

    @OriginalMember(owner = "client!ug", name = "<init>", descriptor = "(I)V", line = 67)
    private class300(int arg0) {
        super(0, false);
        this.method2119(arg0, 1);
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(Lwe;II)V", line = 77)
    public final void method40(class47 arg0, int arg1, int arg2) {
        field5079++;
        if (arg2 == 0) {
            this.method2119(arg0.method389((byte) 109), arg1 - 2047);
        }
        if (arg1 != 2048) {
            field5082 = (int[][][]) ((int[][][]) null);
        }
    }

    @OriginalMember(owner = "client!ug", name = "d", descriptor = "(B)V", line = 106)
    public static void method2116(byte arg0) {
        int var1 = -120 / ((arg0 - 4) / 58);
        field5082 = (int[][][]) null;
        field5075 = (byte[][][]) null;
        field5077 = null;
    }

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "(II)[[I", line = 122)
    public final int[][] method87(int arg0, int arg1) {
        int[][] var3 = this.field4347.method536(arg1, 4096);
        if (this.field4347.field1202) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            for (int var7 = 0; var7 < class98.field1598; var7++) {
                var4[var7] = this.field5087;
                var5[var7] = this.field5089;
                var6[var7] = this.field5088;
            }
        }
        field5084++;
        return arg0 == 7 ? var3 : (int[][]) ((int[][]) null);
    }

    @OriginalMember(owner = "client!ug", name = "c", descriptor = "(II)Z", line = 163)
    public static final boolean method2117(int arg0, int arg1) {
        class228 var2 = class265.method1924(arg0, (byte) -45);
        field5080++;
        if (var2 == null) {
            return false;
        } else if (class129.field2154 == 1 || class129.field2154 == 2 || class22.field408 == 2) {
            byte[] var3 = var2.field3811.method1128(false);
            class17.field343 = new String(var3, 0, var3.length);
            class72.field1178 = var2.field3806;
            if (class22.field408 != 0) {
                class128.field2067 = class72.field1178 + 40000;
                class71.field1158 = class128.field2067;
                class267.field4599 = class72.field1178 + 50000;
            }
            return true;
        } else {
            class146 var4 = class43.field747;
            if (~class22.field408 != arg1) {
                var4 = class112.method758(-24, new class146[] { class78.field1247, class82.method585(arg1 ^ -14745, var2.field3806 + 7000) });
            }
            class146 var5 = class43.field747;
            if (class139.field2318 != null) {
                var5 = class112.method758(119, new class146[] { class140.field2324, class139.field2318 });
            }
            class146 var6 = class112.method758(arg1 ^ 0x47, new class146[] { class70.field1146, var2.field3811, var4, class5.field102, class82.method585(arg1 + 14745, class14.field263), class249.field4179, class82.method585(14744, class92.field1468), var5, class168.field2841, class305.field5226 ? class5.field52 : class62.field1057, class94.field1509, class114.field1838 ? class5.field52 : class62.field1057, class223.field3716, class251.field4204 ? class5.field52 : class62.field1057 });
            try {
                class151.field2569.getAppletContext().showDocument(var6.method1112(0), "_self");
                return true;
            } catch (Exception var8) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(Loh;IB)Lje;", line = 216)
    public static final class70 method2118(class15 arg0, int arg1, byte arg2) {
        field5083++;
        if (arg2 == -33) {
            return class52.method426(0, arg1, arg0) ? class321.method2233(0) : null;
        } else {
            return (class70) null;
        }
    }

    @OriginalMember(owner = "client!ug", name = "d", descriptor = "(II)V", line = 236)
    private final void method2119(int arg0, int arg1) {
        this.field5089 = (arg0 & 0xFF00) >> 4;
        this.field5088 = (arg0 & 0xFF) << 4;
        field5086++;
        this.field5087 = (arg0 & 0xFF0000) >> 12;
        if (arg1 != 1) {
            method2121(-49, -75, -43, -111, true);
        }
    }

    @OriginalMember(owner = "client!ug", name = "e", descriptor = "(B)V", line = 251)
    public static final void method2120(byte arg0) {
        if (arg0 >= -113) {
            method2120((byte) -100);
        }
        field5076++;
        class9.field177.method791(8);
        class226.field3775.method791(8);
        class207.field3460.method791(8);
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(IIIIZ)V", line = 272)
    public static final void method2121(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field5085++;
        if (!arg4) {
            method2118((class15) null, -26, (byte) 12);
        }
        class158 var5 = class206.method1564(arg2, 10, -124);
        var5.method1236(-13730);
        var5.field2672 = arg3;
        var5.field2662 = arg1;
        var5.field2663 = arg0;
    }
}
