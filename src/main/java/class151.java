import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public class class151 extends class279 {

    @OriginalMember(owner = "client!kf", name = "L", descriptor = "Ltl;")
    public static class59 field2486 = class85.method639("sch-Utteln:", 9588);

    @OriginalMember(owner = "client!kf", name = "K", descriptor = "I")
    public static int field2485 = 0;

    @OriginalMember(owner = "client!kf", name = "Q", descriptor = "Ltl;")
    public static class59 field2491 = class85.method639("Weiter", 9588);

    @OriginalMember(owner = "client!kf", name = "O", descriptor = "Ltl;")
    private static class59 field2489 = class85.method639("flash3:", 9588);

    @OriginalMember(owner = "client!kf", name = "U", descriptor = "Ltl;")
    public static class59 field2495 = class85.method639("Speicher wird zugewiesen)3", 9588);

    @OriginalMember(owner = "client!kf", name = "V", descriptor = "Ltl;")
    public static class59 field2496 = field2489;

    @OriginalMember(owner = "client!kf", name = "I", descriptor = "Ltl;")
    public static class59 field2483 = field2489;

    @OriginalMember(owner = "client!kf", name = "T", descriptor = "[I")
    public static int[] field2494 = new int[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

    @OriginalMember(owner = "client!kf", name = "H", descriptor = "I")
    public static int field2482;

    @OriginalMember(owner = "client!kf", name = "J", descriptor = "I")
    public static int field2484;

    @OriginalMember(owner = "client!kf", name = "M", descriptor = "I")
    public static int field2487;

    @OriginalMember(owner = "client!kf", name = "N", descriptor = "I")
    public static int field2488;

    @OriginalMember(owner = "client!kf", name = "P", descriptor = "I")
    public static int field2490;

    @OriginalMember(owner = "client!kf", name = "R", descriptor = "I")
    public static int field2492;

    @OriginalMember(owner = "client!kf", name = "S", descriptor = "I")
    public static int field2493;

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(IIII)Z", line = 6)
    public static final boolean method1084(int arg0, int arg1, int arg2, int arg3) {
        if (class227.method1559(arg0, arg1, arg2)) {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            return class123.method913(var4 + 1, class97.field1558[arg0][arg1][arg2] + arg3, var5 + 1) && class123.method913(var4 + 128 - 1, class97.field1558[arg0][arg1 + 1][arg2] + arg3, var5 + 1) && class123.method913(var4 + 128 - 1, class97.field1558[arg0][arg1 + 1][arg2 + 1] + arg3, var5 + 128 - 1) && class123.method913(var4 + 1, class97.field1558[arg0][arg1][arg2 + 1] + arg3, var5 + 128 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(IJ)Ltl;", line = 26)
    public static final class59 method1085(int arg0, long arg1) {
        field2493++;
        if (arg1 <= 0L || arg1 >= 6582952005840035281L) {
            return null;
        } else if (arg1 % 37L == 0L) {
            return null;
        } else {
            int var3 = 0;
            long var4 = arg1;
            if (arg0 != 1) {
                field2486 = (class59) null;
            }
            while (var4 != 0L) {
                var4 /= 37L;
                var3++;
            }
            byte[] var6 = new byte[var3];
            while (arg1 != 0L) {
                long var7 = arg1;
                arg1 /= 37L;
                var3--;
                var6[var3] = class201.field3334[(int) (var7 - (arg1 * 37L))];
            }
            class59 var9 = new class59();
            var9.field889 = var6;
            var9.field863 = var6.length;
            return var9;
        }
    }

    @OriginalMember(owner = "client!kf", name = "c", descriptor = "(B)V", line = 72)
    public static void method1086(byte arg0) {
        field2495 = null;
        field2483 = null;
        field2494 = null;
        int var1 = -103 % ((80 - arg0) / 39);
        field2496 = null;
        field2491 = null;
        field2489 = null;
        field2486 = null;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(BLs;)La;", line = 87)
    public static final class270 method1087(byte arg0, class170 arg1) {
        field2484++;
        class270 var2 = new class270(arg1.method1250(false), arg1.method1250(false), arg1.method1214(-18254), arg1.method1214(arg0 ^ 0x4746), arg1.method1233((byte) -77), arg1.method1221(99) == 1);
        int var3 = arg1.method1221(95);
        int var4 = 0;
        if (arg0 != -12) {
            return (class270) null;
        }
        while (var3 > var4) {
            var2.field4688.method532(93, new class226(arg1.method1214(-18254), arg1.method1214(-18254), arg1.method1214(-18254), arg1.method1214(-18254)));
            var4++;
        }
        var2.method1882(105);
        return var2;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(ILme;)V", line = 114)
    public static final void method1088(int arg0, class295 arg1) {
        if (arg0 != 0) {
            field2491 = (class59) null;
        }
        field2482++;
        class259.field4331 = arg1;
    }

    @OriginalMember(owner = "client!kf", name = "f", descriptor = "(I)V", line = 125)
    public static final void method1089(int arg0) {
        if (class262.field4364 != -1) {
            class255.method1778(class262.field4364, arg0 ^ 0x0);
        }
        field2492++;
        for (int var1 = 0; var1 < class129.field2137; var1++) {
            if (class102.field1689[var1]) {
                class44.field719[var1] = true;
            }
            class199.field3303[var1] = class102.field1689[var1];
            class102.field1689[var1] = false;
        }
        class87.field1378 = class30.field420;
        class102.field1683 = -1;
        class99.field1595 = null;
        class113.field1824 = -1;
        if (class55.field815) {
            class46.field749 = true;
        }
        if (~class262.field4364 != arg0) {
            class129.field2137 = 0;
            class70.method569(class262.field4364, 0, -1, class53.field792, 0, 0, class152.field2498, arg0 ^ 0x0, 0);
        }
        if (class55.field815) {
            class240.method1681();
        } else {
            class272.method1907();
        }
        class64.field985 = 0;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(Llb;IZ)V", line = 174)
    public static final void method1090(class297 arg0, int arg1, boolean arg2) {
        field2488++;
        int var3 = (int) arg0.field4932;
        int var4 = arg0.field5089;
        if (arg1 <= 37) {
            return;
        }
        arg0.method2000(123);
        if (arg2) {
            class16.method105(var4, true);
        }
        class238.method1667(32, var4);
        class263 var5 = class247.method1738(false, var3);
        if (var5 != null) {
            class140.method1019(var5, (byte) -98);
        }
        int var6 = class231.field3803;
        for (int var7 = 0; var7 < var6; var7++) {
            if (class185.method1373(class27.field363[var7], 18979)) {
                class264.method1832(-37, var7);
            }
        }
        if (class231.field3803 == 1) {
            class85.field1336 = false;
            class120.method895(class105.field1736, (byte) 1, class247.field4117, class162.field2640, class1.field4);
        } else {
            class120.method895(class105.field1736, (byte) 1, class247.field4117, class162.field2640, class1.field4);
            int var8 = class251.field4187.method705(class275.field4741);
            for (int var9 = 0; var9 < class231.field3803; var9++) {
                int var10 = class251.field4187.method705(class224.method1546(var9, (byte) 116));
                if (var10 > var8) {
                    var8 = var10;
                }
            }
            class105.field1736 = var8 + 8;
            class162.field2640 = class231.field3803 * 15 + 22;
        }
        if (class262.field4364 != -1) {
            class155.method1108((byte) 114, class262.field4364, 1);
        }
    }

    @OriginalMember(owner = "client!kf", name = "<init>", descriptor = "()V", line = 254)
    public class151() {
        super(0, true);
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(ZII[BI[Ldl;)V", line = 259)
    public static final void method1091(boolean arg0, int arg1, int arg2, byte[] arg3, int arg4, class30[] arg5) {
        class170 var6 = new class170(arg3);
        field2487++;
        int var7 = -1;
        int var8 = -124 / ((75 - arg4) / 47);
        while (true) {
            int var9 = var6.method1240(true);
            if (var9 == 0) {
                return;
            }
            int var10 = 0;
            var7 += var9;
            while (true) {
                int var11 = var6.method1249(false);
                if (var11 == 0) {
                    break;
                }
                var10 += var11 - 1;
                int var12 = var10 >> 6 & 0x3F;
                int var13 = var10 & 0x3F;
                int var14 = var6.method1221(88);
                int var15 = var10 >> 12;
                int var16 = var14 >> 2;
                int var17 = var14 & 0x3;
                int var18 = arg2 + var12;
                int var19 = arg1 + var13;
                if (var18 > 0 && var19 > 0 && var18 < 103 && var19 < 103) {
                    class30 var20 = null;
                    if (!arg0) {
                        int var21 = var15;
                        if ((class308.field5219[1][var18][var19] & 0x2) == 2) {
                            var21 = var15 - 1;
                        }
                        if (var21 >= 0) {
                            var20 = arg5[var21];
                        }
                    }
                    class85.method635(var20, var17, var16, var19, var18, (byte) 58, var7, var15, !arg0, arg0, var15);
                }
            }
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(ZI)[I", line = 332)
    public final int[] method44(boolean arg0, int arg1) {
        field2490++;
        if (arg0) {
            method1088(-7, (class295) null);
        }
        return class31.field430;
    }
}
