import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oh")
public abstract class class274 {

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "I")
    public static int field4339 = 0;

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "I")
    public static int field4340;

    @OriginalMember(owner = "client!oh", name = "d", descriptor = "I")
    public static int field4342;

    @OriginalMember(owner = "client!oh", name = "e", descriptor = "I")
    public static int field4343;

    @OriginalMember(owner = "client!oh", name = "f", descriptor = "I")
    public static int field4344;

    @OriginalMember(owner = "client!oh", name = "h", descriptor = "I")
    public static int field4346;

    @OriginalMember(owner = "client!oh", name = "c", descriptor = "Lsk;")
    public static class112 field4341;

    @OriginalMember(owner = "client!oh", name = "g", descriptor = "Lf;")
    public static class36 field4345;

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1848(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field4340++;
        int var8 = class51.method393(arg0, 0, class161.field2561, class51.field896);
        int var9 = class51.method393(arg5, 0, class161.field2561, class51.field896);
        int var10 = class51.method393(arg4, 0, class255.field4055, class9.field128);
        int var11 = class51.method393(arg3, 0, class255.field4055, class9.field128);
        int var12 = class51.method393(arg0 + arg7, arg2 ^ arg2, class161.field2561, class51.field896);
        int var13 = class51.method393(arg5 - arg7, 0, class161.field2561, class51.field896);
        for (int var14 = var8; var14 < var12; var14++) {
            class56.method420(class29.field452[var14], arg1, -7, var10, var11);
        }
        for (int var15 = var9; var15 > var13; var15--) {
            class56.method420(class29.field452[var15], arg1, arg2 + 31952, var10, var11);
        }
        int var16 = class51.method393(arg4 + arg7, 0, class255.field4055, class9.field128);
        int var17 = class51.method393(arg3 - arg7, 0, class255.field4055, class9.field128);
        for (int var18 = var12; var18 <= var13; var18++) {
            int[] var19 = class29.field452[var18];
            class56.method420(var19, arg1, -7, var10, var16);
            class56.method420(var19, arg6, arg2 + 31952, var16, var17);
            class56.method420(var19, arg1, -7, var17, var11);
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(BIIII)V")
    public static final void method1849(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        field4342++;
        int var5 = 0;
        int var6 = 84 % ((-arg0 - 47) / 53);
        while (var5 < class98.field1615) {
            if (arg2 < (class142.field2295[var5] + class124.field2006[var5]) && class142.field2295[var5] < (arg2 + arg1) && arg4 < class98.field1616[var5] + class158.field2550[var5] && class98.field1616[var5] < arg3 + arg4) {
                class223.field3698[var5] = true;
            }
            var5++;
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(I)V")
    public static void method1850(int arg0) {
        field4345 = null;
        field4341 = null;
        if (arg0 != 0) {
            method1849((byte) 33, 44, 9, -10, -122);
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(Lse;Z)Lse;")
    public abstract class205 method1059(class205 arg0, boolean arg1);

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(I[B[Lwd;ZIZ)V")
    public static final void method1851(int arg0, byte[] arg1, class22[] arg2, boolean arg3, int arg4, boolean arg5) {
        class221 var6 = new class221(arg1);
        field4343++;
        if (!arg5) {
            method1848(-75, 63, -127, 24, 73, 121, -81, -86);
        }
        int var7 = -1;
        while (true) {
            int var8 = var6.method1562((byte) 39);
            if (var8 == 0) {
                return;
            }
            var7 += var8;
            int var9 = 0;
            while (true) {
                int var10 = var6.method1528(19380);
                if (var10 == 0) {
                    break;
                }
                var9 += var10 - 1;
                int var11 = var9 & 0x3F;
                int var12 = var6.method1517((byte) -96);
                int var13 = var12 & 0x3;
                int var14 = var9 >> 12;
                int var15 = var12 >> 2;
                int var16 = (var9 & 0xFC4) >> 6;
                int var17 = var11 + arg0;
                int var18 = arg4 + var16;
                if (var18 > 0 && var17 > 0 && var18 < 103 && var17 < 103) {
                    class22 var19 = null;
                    if (!arg3) {
                        int var20 = var14;
                        if ((class201.field3198[1][var18][var17] & 0x2) == 2) {
                            var20 = var14 - 1;
                        }
                        if (var20 >= 0) {
                            var19 = arg2[var20];
                        }
                    }
                    class56.method416(var19, arg3, var7, true, var14, var15, var14, !arg3, var17, var18, var13);
                }
            }
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "()V")
    public static final void method1852() {
        for (int var0 = 0; var0 < class78.field1260; var0++) {
            class289 var1 = class155.field2505[var0];
            class263.method1787(var1);
            class155.field2505[var0] = null;
        }
        class78.field1260 = 0;
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(IB)V")
    public static final void method1853(int arg0, byte arg1) {
        class199.field3182.method476(false, arg0);
        if (arg1 != 92) {
            method1850(-32);
        }
        field4346++;
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(Lqh;BLqh;)V")
    public static final void method1854(class201 arg0, byte arg1, class201 arg2) {
        field4344++;
        class212.field3454 = arg2;
        int var3 = -55 % ((-arg1 - 34) / 50);
        class54.field923 = arg0;
    }
}
