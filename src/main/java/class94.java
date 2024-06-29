import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public class class94 {

    @OriginalMember(owner = "client!qe", name = "g", descriptor = "Lhj;")
    private static class69 field1756 = class181.method1318("Loaded interfaces", (byte) -112);

    @OriginalMember(owner = "client!qe", name = "e", descriptor = "Lhj;")
    public static class69 field1754 = field1756;

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "Lka;")
    public static class243 field1751 = new class243();

    @OriginalMember(owner = "client!qe", name = "j", descriptor = "Lhj;")
    private static class69 field1759 = class181.method1318("OFF", (byte) -120);

    @OriginalMember(owner = "client!qe", name = "k", descriptor = "Lhj;")
    public static class69 field1760 = field1759;

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "I")
    public static int field1750;

    @OriginalMember(owner = "client!qe", name = "c", descriptor = "I")
    public static int field1752;

    @OriginalMember(owner = "client!qe", name = "d", descriptor = "I")
    public static int field1753;

    @OriginalMember(owner = "client!qe", name = "f", descriptor = "I")
    public static int field1755;

    @OriginalMember(owner = "client!qe", name = "h", descriptor = "I")
    public static int field1757;

    @OriginalMember(owner = "client!qe", name = "i", descriptor = "I")
    public static int field1758;

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(IIIIIII)V")
    public static final void method681(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = arg2 - arg3;
        int var8 = arg3 + arg6;
        field1753++;
        int var9 = arg3 + arg4;
        for (int var10 = arg4; var10 < var9; var10++) {
            class99.method740(arg1, class186.field3402[var10], -1162793114, arg0, arg6);
        }
        if (arg5 != 3454481) {
            method682(-30, 18);
        }
        int var11 = arg0 - arg3;
        for (int var12 = arg2; var12 > var7; var12--) {
            class99.method740(arg1, class186.field3402[var12], arg5 - 1166247595, arg0, arg6);
        }
        for (int var13 = var9; var13 <= var7; var13++) {
            int[] var14 = class186.field3402[var13];
            class99.method740(arg1, var14, arg5 ^ 0xBA859977, var8, arg6);
            class99.method740(arg1, var14, -1162793114, arg0, var11);
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(II)V")
    public static final void method682(int arg0, int arg1) {
        field1750++;
        int var2 = 126 / ((arg1 + 18) / 60);
        class135 var3 = class8.method38((byte) 112, 5, arg0);
        var3.method1012((byte) -96);
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(B)V")
    public static final void method683(byte arg0) {
        field1757++;
        if (arg0 != 100) {
            return;
        }
        while (class199.field3595.method295(class33.field451, (byte) 55) >= 27) {
            int var1 = class199.field3595.method305(15, 8);
            if (var1 == 32767) {
                break;
            }
            boolean var2 = false;
            if (class131.field2428[var1] == null) {
                class131.field2428[var1] = new class38();
                var2 = true;
            }
            class38 var3 = class131.field2428[var1];
            class245.field4490[class46.field659++] = var1;
            var3.field4041 = class180.field3272;
            if (var3.field517 != null && var3.field517.method1359(90)) {
                class168.method1241(true, var3);
            }
            int var4 = class270.field4790[class199.field3595.method305(3, 8)];
            if (var2) {
                var3.field4052 = var3.field4003 = var4;
            }
            int var5 = class199.field3595.method305(1, 8);
            if (var5 == 1) {
                class102.field1908[class156.field2917++] = var1;
            }
            var3.field517 = class62.method386((byte) 95, class199.field3595.method305(14, 8));
            int var6 = class199.field3595.method305(5, arg0 ^ 0x6C);
            if (var6 > 15) {
                var6 -= 32;
            }
            int var7 = class199.field3595.method305(5, 8);
            if (var7 > 15) {
                var7 -= 32;
            }
            int var8 = class199.field3595.method305(1, 8);
            var3.method1578(var3.field517.field3359, (byte) 73);
            var3.field4054 = var3.field517.field3374;
            var3.field3982 = var3.field517.field3353;
            var3.field4045 = var3.field517.field3361;
            var3.field4026 = var3.field517.field3350;
            var3.field3984 = var3.field517.field3398;
            if (var3.field3984 == 0) {
                var3.field4003 = 0;
            }
            var3.field3999 = var3.field517.field3401;
            var3.field4018 = var3.field517.field3408;
            var3.field4049 = var3.field517.field3383;
            var3.method1574(var8 == 1, class156.field2904.field4046[0] + var7, class156.field2904.field3998[0] - -var6, var3.method813(15963), 62);
            if (var3.field517.method1359(65)) {
                class232.method1653(0, var3.field3998[0], (byte) 85, var3, class52.field927, (class12) null, (class108) null, var3.field4046[0]);
            }
        }
        class199.field3595.method303((byte) -88);
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(I)V")
    public static void method684(int arg0) {
        if (arg0 != 10) {
            field1759 = null;
        }
        field1756 = null;
        field1760 = null;
        field1759 = null;
        field1754 = null;
        field1751 = null;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(JIII)Z")
    public static final boolean method685(long arg0, int arg1, int arg2, int arg3) {
        field1752++;
        int var5 = (int) arg0 >> 14 & 0x1F;
        int var6 = ((int) arg0 & 0x34B611) >> 20;
        int var7 = Integer.MAX_VALUE & (int) (arg0 >>> 32);
        if (var5 == 10 || var5 == 11 || var5 == 22) {
            class12 var8 = class145.method1102(var7, 0);
            int var9;
            int var10;
            if (var6 == 0 || var6 == 2) {
                var9 = var8.field153;
                var10 = var8.field127;
            } else {
                var9 = var8.field127;
                var10 = var8.field153;
            }
            int var11 = var8.field152;
            if (var6 != 0) {
                var11 = (var11 << var6 & 0xF) + (var11 >> 4 - var6);
            }
            class206.method1498(true, 0, class156.field2904.field4046[0], arg2, arg3, var11, class156.field2904.field3998[0], true, 0, var10, 2, var9);
        } else {
            class206.method1498(true, var6, class156.field2904.field4046[0], arg2, arg3, 0, class156.field2904.field3998[0], true, var5 + 1, 0, 2, 0);
        }
        class9.field65 = class207.field3776;
        class161.field2995 = 0;
        class216.field3907 = 2;
        if (arg1 < 113) {
            field1760 = null;
        }
        class222.field4059 = class56.field1020;
        return true;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(BIIIIIIII)V")
    public static final void method686(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        int var9 = arg7 - arg1;
        field1755++;
        int var10 = arg3 - arg5;
        int var11 = (arg4 - arg6 << 16) / var10;
        int var12 = (arg8 - arg2 << 16) / var9;
        if (arg0 == 86) {
            client.method1139(-1, var12, arg5, arg7, 0, arg3, arg2, arg6, arg1, 0, var11);
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(ZI)V")
    public static final void method687(boolean arg0, int arg1) {
        if (arg0) {
            field1754 = null;
        }
        field1758++;
        class135 var2 = class8.method38((byte) 109, 9, arg1);
        var2.method1012((byte) 50);
    }
}
