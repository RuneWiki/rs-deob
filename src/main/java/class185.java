import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wi")
public class class185 {

    @OriginalMember(owner = "client!wi", name = "c", descriptor = "I")
    public static volatile int field3292 = 0;

    @OriginalMember(owner = "client!wi", name = "d", descriptor = "I")
    public static int field3293;

    @OriginalMember(owner = "client!wi", name = "e", descriptor = "I")
    public static int field3294;

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "Lo;")
    public static class175 field3291;

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "[I")
    public static int[] field3290;

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(I)V")
    public static final void method1290(int arg0) {
        field3294++;
        while (class76.field1223.method549(-88, class108.field1772) >= 11) {
            int var1 = class76.field1223.method548(11, (byte) 67);
            if (var1 == 2047) {
                break;
            }
            boolean var2 = false;
            if (class39.field602[var1] == null) {
                var2 = true;
                class39.field602[var1] = new class116();
                if (class86.field1373[var1] != null) {
                    class39.field602[var1].method769(28874, class86.field1373[var1]);
                }
            }
            class218.field3750[class152.field2538++] = var1;
            class116 var3 = class39.field602[var1];
            var3.field2639 = class237.field4125;
            int var4 = class177.field3104[class76.field1223.method548(3, (byte) 67)];
            if (var2) {
                var3.field2616 = var3.field2675 = var4;
            }
            int var5 = class76.field1223.method548(5, (byte) 67);
            int var6 = class76.field1223.method548(5, (byte) 67);
            int var7 = class76.field1223.method548(1, (byte) 67);
            if (var6 > 15) {
                var6 -= 32;
            }
            if (var7 == 1) {
                class30.field498[class137.field2236++] = var1;
            }
            int var8 = class76.field1223.method548(1, (byte) 67);
            if (var5 > 15) {
                var5 -= 32;
            }
            var3.method1051(class258.field4507.field2623[0] + var6, var8 == 1, class258.field4507.field2672[0] + var5, -6882);
        }
        int var9 = 22 / ((29 - arg0) / 38);
        class76.field1223.method542(99);
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(II)I")
    public static int method1291(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "([B[Ljc;BZII)V")
    public static final void method1292(byte[] arg0, class8[] arg1, byte arg2, boolean arg3, int arg4, int arg5) {
        if (arg2 <= 94) {
            return;
        }
        field3293++;
        class230 var6 = new class230(arg0);
        int var7 = -1;
        while (true) {
            int var8 = var6.method1567((byte) 27);
            if (var8 == 0) {
                return;
            }
            int var9 = 0;
            var7 += var8;
            while (true) {
                int var10 = var6.method1517(false);
                if (var10 == 0) {
                    break;
                }
                var9 += var10 - 1;
                int var11 = var9 & 0x3F;
                int var12 = (var9 & 0xFD6) >> 6;
                int var13 = var9 >> 12;
                int var14 = var6.method1516((byte) 82);
                int var15 = var14 >> 2;
                int var16 = var14 & 0x3;
                int var17 = var11 + arg4;
                int var18 = var12 + arg5;
                if (var18 > 0 && var17 > 0 && var18 < 103 && var17 < 103) {
                    class8 var19 = null;
                    if (!arg3) {
                        int var20 = var13;
                        if ((class70.field1129[1][var18][var17] & 0x2) == 2) {
                            var20 = var13 - 1;
                        }
                        if (var20 >= 0) {
                            var19 = arg1[var20];
                        }
                    }
                    class42.method295(var7, var19, arg3, var15, -91, var13, var18, var16, var17, !arg3, var13);
                }
            }
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(Z)V")
    public static void method1293(boolean arg0) {
        field3291 = null;
        field3290 = null;
        if (!arg0) {
            method1293(true);
        }
    }
}
