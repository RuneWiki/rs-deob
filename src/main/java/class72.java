import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ue")
public abstract class class72 {

    @OriginalMember(owner = "client!ue", name = "d", descriptor = "Lhh;")
    public static class163 field1355 = class137.method1065("leuchten1:", 17);

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "Lhh;")
    public static class163 field1352 = class137.method1065("Lade Titelbild )2 ", 17);

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "I")
    public static int field1353;

    @OriginalMember(owner = "client!ue", name = "e", descriptor = "I")
    public static int field1356;

    @OriginalMember(owner = "client!ue", name = "f", descriptor = "I")
    public static int field1357;

    @OriginalMember(owner = "client!ue", name = "g", descriptor = "I")
    public static int field1358;

    @OriginalMember(owner = "client!ue", name = "h", descriptor = "I")
    public static int field1359;

    @OriginalMember(owner = "client!ue", name = "i", descriptor = "I")
    public static int field1360;

    @OriginalMember(owner = "client!ue", name = "c", descriptor = "[Lne;")
    public static class94[] field1354;

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(ZI)V")
    public static final void method527(boolean arg0, int arg1) {
        class217.field3940 += arg1 * 128;
        short var2 = 256;
        field1353++;
        if (class94.field1782.length < class217.field3940) {
            class217.field3940 -= class94.field1782.length;
            int var3 = (int) (Math.random() * 12.0D);
            class57.method400(class16.field223[var3], -104);
        }
        int var4 = (var2 - arg1) * 128;
        int var5 = 0;
        int var6 = arg1 * 128;
        for (int var7 = 0; var7 < var4; var7++) {
            int var26 = class192.field3518[var5 + var6] - (class94.field1782[class217.field3940 + var5 & class94.field1782.length + -1] * arg1 / 6);
            if (var26 < 0) {
                var26 = 0;
            }
            class192.field3518[var5++] = var26;
        }
        for (int var8 = var2 - arg1; var8 < var2; var8++) {
            int var23 = var8 * 128;
            for (int var24 = 0; var24 < 128; var24++) {
                int var25 = (int) (Math.random() * 100.0D);
                if (var25 < 50 && var24 > 10 && var24 < 118) {
                    class192.field3518[var24 + var23] = 255;
                } else {
                    class192.field3518[var23 + var24] = 0;
                }
            }
        }
        for (int var9 = 0; var9 < var2 - arg1; var9++) {
            class136.field2635[var9] = class136.field2635[var9 + arg1];
        }
        if (!arg0) {
            return;
        }
        for (int var10 = var2 - arg1; var10 < var2; var10++) {
            class136.field2635[var10] = (int) (Math.sin((double) class233.field4158 / 14.0D) * 16.0D + Math.sin((double) class233.field4158 / 15.0D) * 14.0D + Math.sin((double) class233.field4158 / 16.0D) * 12.0D);
            class233.field4158++;
        }
        class9.field152 += arg1;
        int var11 = ((class227.field4092 & 0x1) + arg1) / 2;
        if (var11 <= 0) {
            return;
        }
        for (int var12 = 0; var12 < class9.field152; var12++) {
            int var21 = (int) (Math.random() * 124.0D) + 2;
            int var22 = (int) (Math.random() * 128.0D) + 128;
            class192.field3518[var21 + (var22 << 7)] = 192;
        }
        class9.field152 = 0;
        for (int var13 = 0; var13 < var2; var13++) {
            int var18 = var13 * 128;
            int var19 = 0;
            for (int var20 = -var11; var20 < 128; var20++) {
                if ((var11 + var20) < 128) {
                    var19 += class192.field3518[var20 + var18 + var11];
                }
                if (var20 - var11 - 1 >= 0) {
                    var19 -= class192.field3518[var18 - var11 - (1 - var20)];
                }
                if (var20 >= 0) {
                    class75.field1406[var18 + var20] = var19 / (var11 * 2 + 1);
                }
            }
        }
        for (int var14 = 0; var14 < 128; var14++) {
            int var15 = 0;
            for (int var16 = -var11; var16 < var2; var16++) {
                int var17 = var16 * 128;
                if ((var11 + var16) < var2) {
                    var15 += class75.field1406[var14 + var17 + (var11 * 128)];
                }
                if ((var16 - var11 - 1) >= 0) {
                    var15 -= class75.field1406[var17 + var14 - var11 * 128 - 128];
                }
                if (var16 >= 0) {
                    class192.field3518[var14 + var17] = var15 / (var11 * 2 + 1);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(B)V")
    public static void method528(byte arg0) {
        field1355 = null;
        field1354 = null;
        if (arg0 >= 36) {
            field1352 = null;
        }
    }

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "(B)[B")
    public abstract byte[] method529(byte arg0);

    @OriginalMember(owner = "client!ue", name = "c", descriptor = "(B)V")
    public static final void method530(byte arg0) {
        class130.field2516.method120((byte) -106);
        field1359++;
        int var1 = 83 % ((arg0 + 47) / 45);
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(I)V")
    public static final void method531(int arg0) {
        int var1 = -25 % ((arg0 + 34) / 54);
        field1360++;
        if ((class21.field335 < class219.field3985)) {
            class21.field335 = (float) ((double) class21.field335 / 30.0D + (double) class21.field335);
            if (class219.field3985 < class21.field335) {
                class21.field335 = class219.field3985;
            }
            class227.method1583((byte) 71);
        } else if (class219.field3985 < class21.field335) {
            class21.field335 = (float) ((double) class21.field335 - (double) class21.field335 / 30.0D);
            if (class21.field335 < class219.field3985) {
                class21.field335 = class219.field3985;
            }
            class227.method1583((byte) 77);
        }
        if (class27.field419 == -1 || class175.field3192 == -1) {
            return;
        }
        int var2 = class27.field419 - class169.field3086;
        int var3 = class175.field3192 - class201.field3611;
        if (var3 < 2 || var3 > 2) {
            var3 >>= 0x4;
        }
        class201.field3611 += var3;
        if (var2 < 2 || var2 > 2) {
            var2 >>= 0x4;
        }
        if (var2 == 0 && var3 == 0) {
            class27.field419 = -1;
            class175.field3192 = -1;
        }
        class169.field3086 += var2;
        class227.method1583((byte) 71);
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(ILpg;)V")
    public static final void method532(int arg0, class81 arg1) {
        field1357++;
        if (class247.field4346 != null) {
            try {
                class247.field4346.method1569(0L, (byte) 79);
                class247.field4346.method1568(arg1.field1562, arg1.field1541, -97, 24);
            } catch (Exception var3) {
            }
        }
        int var2 = -91 % ((arg0 + 56) / 36);
        arg1.field1541 += 24;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(I[B)V")
    public abstract void method533(int arg0, byte[] arg1);

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(II)I")
    public static final int method534(int arg0, int arg1) {
        field1358++;
        if (arg0 == 16711935) {
            return -1;
        } else {
            if (arg1 != -1) {
                method528((byte) 12);
            }
            return class106.method863(-193, arg0);
        }
    }

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "(I)V")
    public static final void method535(int arg0) {
        if (arg0 != 0) {
            field1354 = null;
        }
        class4.field74.method111((byte) -52);
        class210.field3813.method111((byte) -52);
        field1356++;
    }
}
