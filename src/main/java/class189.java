import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hf")
public class class189 extends class206 {

    @OriginalMember(owner = "client!hf", name = "v", descriptor = "Lwa;")
    private static class75 field3153 = class66.method560("white:", false);

    @OriginalMember(owner = "client!hf", name = "w", descriptor = "Lwa;")
    public static class75 field3154 = field3153;

    @OriginalMember(owner = "client!hf", name = "s", descriptor = "Lwa;")
    public static class75 field3150 = class66.method560("Ihre Freunde)2Liste ist voll(Q Maximale Eintr-=ge: Mitglieder 200)4freie Spieler 100", false);

    @OriginalMember(owner = "client!hf", name = "t", descriptor = "Lwa;")
    public static class75 field3151 = class66.method560("::qa_op_test", false);

    @OriginalMember(owner = "client!hf", name = "y", descriptor = "Lwa;")
    public static class75 field3156 = field3153;

    @OriginalMember(owner = "client!hf", name = "D", descriptor = "B")
    public byte field3160;

    @OriginalMember(owner = "client!hf", name = "p", descriptor = "I")
    public static int field3147;

    @OriginalMember(owner = "client!hf", name = "q", descriptor = "I")
    public static int field3148;

    @OriginalMember(owner = "client!hf", name = "u", descriptor = "I")
    public int field3152;

    @OriginalMember(owner = "client!hf", name = "x", descriptor = "I")
    public static int field3155;

    @OriginalMember(owner = "client!hf", name = "z", descriptor = "I")
    public static int field3157;

    @OriginalMember(owner = "client!hf", name = "C", descriptor = "I")
    public static int field3159;

    @OriginalMember(owner = "client!hf", name = "E", descriptor = "I")
    public static int field3161;

    @OriginalMember(owner = "client!hf", name = "F", descriptor = "I")
    public static int field3162;

    @OriginalMember(owner = "client!hf", name = "r", descriptor = "Lwa;")
    public class75 field3149;

    @OriginalMember(owner = "client!hf", name = "A", descriptor = "Lwa;")
    public class75 field3158;

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(BLwa;)V", line = 11)
    public static final void method1425(byte arg0, class75 arg1) {
        field3161++;
        class310.field5287 = arg1;
        if (class210.field3585.field2072 == null) {
            return;
        }
        try {
            class75 var2 = class89.field1477.method644((byte) -25, class210.field3585.field2072);
            if (arg0 != 24) {
                return;
            }
            class75 var3 = class219.field3750.method644((byte) -25, class210.field3585.field2072);
            class75 var4 = class66.method562((byte) -71, new class75[] { var2, class297.field5087, arg1, class166.field2806, var3 });
            class75 var5;
            if (arg1.method640(1) == 0) {
                var5 = class66.method562((byte) -38, new class75[] { var4, class288.field4951 });
            } else {
                var5 = class66.method562((byte) 124, new class75[] { var4, class48.field777, class29.method199(false, class78.method669(2047) + 94608000000L), class144.field2489, class263.method1877(25, 94608000L) });
            }
            class66.method562((byte) -106, new class75[] { class306.field5226, var5, class283.field4880 }).method636(-63, class210.field3585.field2072);
        } catch (Throwable var7) {
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(IIIII)V", line = 50)
    public static final void method1426(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3157++;
        if (class170.field2864 < 100) {
            class199.method1485(-1660907130);
        }
        class222.method1638(arg0, arg4, arg0 + arg1, arg2 + arg4);
        if (class170.field2864 < 100) {
            byte var14 = 20;
            int var15 = arg2 / 2 + arg4 - var14 - 18;
            int var16 = arg1 / 2 + arg0;
            class222.method1632(arg0, arg4, arg1, arg2, 0);
            class222.method1640(var16 - 152, var15, 304, 34, 9179409);
            class222.method1640(var16 - 151, var15 - -1, 302, 32, 0);
            class222.method1632(var16 - 150, var15 + 2, class170.field2864 * 3, 30, 9179409);
            class222.method1632(class170.field2864 * 3 + var16 - 150, var15 + 2, 300 - (class170.field2864 * 3), 30, 0);
            class3.field28.method774(class97.field1597, var16, var15 + var14, 16777215, -1);
            return;
        }
        class182.field3036 = class76.field1320 - ((int) ((float) arg1 / class205.field3468));
        class32.field483 = (int) ((float) (arg2 * 2) / class205.field3468);
        int var5 = class76.field1320 - ((int) ((float) arg1 / class205.field3468));
        class281.field4849 = (int) ((float) (arg1 * 2) / class205.field3468);
        int var6 = (int) ((float) arg1 / class205.field3468) + class76.field1320;
        int var7 = class215.field3666 - ((int) ((float) arg2 / class205.field3468));
        class185.field3072 = class215.field3666 - ((int) ((float) arg2 / class205.field3468));
        int var8 = (int) ((float) arg2 / class205.field3468) + class215.field3666;
        if (arg3 < 41) {
            return;
        }
        if (class176.field2955 == null || class176.field2955.field4318 != arg1 || class176.field2955.field4320 != arg2) {
            class176.field2955 = null;
            class176.field2955 = new class308(arg1, arg2);
        }
        class44.method298(class176.field2955.field3029, arg1, arg2);
        method1430(0, var8, var5, arg1, arg2, -131970000, var7, 0, var6);
        class75.method637(var5, var7, 0, true, var8, arg1, arg2, var6, 0);
        class41.method280(var6, arg1, var5, 0, var7, 0, (byte) -128, var8, arg2);
        class176.field2955.method156(arg0, arg4);
        if (class137.field2342 > 0) {
            class137.field2342--;
        }
        if (!class73.field1228) {
            return;
        }
        int var9 = arg2 + arg4 - 8;
        int var10 = arg0 + arg1 - 5;
        class269.field4654.method788(class66.method562((byte) -68, new class75[] { class301.field5148, class67.method565(40, class61.field1082) }), var10, var9, 16776960, -1);
        int var17 = var9 - 15;
        Runtime var11 = Runtime.getRuntime();
        int var12 = (int) ((var11.totalMemory() - var11.freeMemory()) / 1024L);
        int var13 = 16776960;
        if (var12 > 65536) {
            var13 = 16711680;
        }
        class269.field4654.method788(class66.method562((byte) -59, new class75[] { class81.field1364, class67.method565(42, var12), class300.field5132 }), var10, var17, var13, -1);
        var9 = var17 - 15;
    }

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "(III)I", line = 143)
    public static final int method1427(int arg0, int arg1, int arg2) {
        field3148++;
        if (arg2 == -1) {
            return 12345678;
        }
        int var3 = (arg2 & 0x7F) * arg1 >> 7;
        if (arg0 != -65537) {
            field3150 = (class75) null;
        }
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return (arg2 & 0xFF80) + var3;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(B)V", line = 167)
    public static final void method1428(byte arg0) {
        field3147++;
        if (!class161.field2738) {
            return;
        }
        class262 var1 = class161.method1208(class29.field405, class206.field3482, (byte) 38);
        if (var1 != null && var1.field4509 != null) {
            class24 var2 = new class24();
            var2.field301 = var1;
            var2.field302 = var1.field4509;
            class204.method1515(var2, (byte) 9);
        }
        if (arg0 > -41) {
            field3150 = (class75) null;
        }
        class161.field2738 = false;
        class291.method2027(var1, 14580);
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(IIIJ)Z", line = 199)
    public static final boolean method1429(int arg0, int arg1, int arg2, long arg3) {
        class242 var5 = class271.field4681[arg0][arg1][arg2];
        if (var5 == null) {
            return false;
        } else if (var5.field4098 != null && var5.field4098.field2814 == arg3) {
            return true;
        } else if (var5.field4096 != null && var5.field4096.field3967 == arg3) {
            return true;
        } else if (var5.field4092 != null && var5.field4092.field3704 == arg3) {
            return true;
        } else {
            for (int var6 = 0; var6 < var5.field4086; var6++) {
                if (var5.field4083[var6].field4914 == arg3) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(IIIIIIIII)V", line = 234)
    public static final void method1430(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field3155++;
        int var9 = arg1 - arg6;
        int var10 = (arg4 - arg7 << 16) / var9;
        int var11 = arg8 - arg2;
        int var12 = (arg3 - arg0 << 16) / var11;
        if (arg5 != -131970000) {
            field3154 = (class75) null;
        }
        class291.method2028(0, var12, arg8, arg2, arg1, arg6, 729619278, arg0, 0, arg7, var10);
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(IBI)I", line = 252)
    public static final int method1431(int arg0, byte arg1, int arg2) {
        int var3 = 0;
        while (arg2 > 0) {
            var3 = arg0 & 0x1 | var3 << 1;
            arg0 >>>= 0x1;
            arg2--;
        }
        if (arg1 < 2) {
            field3153 = (class75) null;
        }
        field3159++;
        return var3;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(IIII)V", line = 298)
    public static final void method1432(int arg0, int arg1, int arg2, int arg3) {
        field3162++;
        class156 var4 = class206.method1525(arg3, -32701, arg2);
        var4.method1183(true);
        var4.field2680 = arg1;
        var4.field2665 = arg0;
    }

    @OriginalMember(owner = "client!hf", name = "d", descriptor = "(I)V", line = 311)
    public static void method1433(int arg0) {
        if (arg0 != 12345678) {
            field3154 = (class75) null;
        }
        field3156 = null;
        field3150 = null;
        field3151 = null;
        field3153 = null;
        field3154 = null;
    }
}
