import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public class class97 {

    @OriginalMember(owner = "client!oc", name = "d", descriptor = "Lmb;")
    public static class84 field2395 = class79.method672(true, "backhmid1");

    @OriginalMember(owner = "client!oc", name = "f", descriptor = "Lmb;")
    public static class84 field2397 = class79.method672(true, "An");

    @OriginalMember(owner = "client!oc", name = "h", descriptor = "Lmb;")
    public static class84 field2399 = class79.method672(true, "Fehler bei der Verbindung zum Server)3");

    @OriginalMember(owner = "client!oc", name = "m", descriptor = "[[I")
    public static int[][] field2404 = new int[5][5000];

    @OriginalMember(owner = "client!oc", name = "p", descriptor = "Lmb;")
    private static class84 field2407 = class79.method672(true, "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789(Q(R+R(T(U^(V(Z(X(Y)2_=)0[*U]*W;:(W@(S*X)1<)3>)4?*6*V ");

    @OriginalMember(owner = "client!oc", name = "k", descriptor = "Lmb;")
    private static class84 field2402 = class79.method672(true, "Prepared sound engine");

    @OriginalMember(owner = "client!oc", name = "o", descriptor = "Lmb;")
    public static class84 field2406 = field2402;

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "Lmb;")
    public static class84 field2393 = field2407;

    @OriginalMember(owner = "client!oc", name = "r", descriptor = "Z")
    public static boolean field2409 = false;

    @OriginalMember(owner = "client!oc", name = "c", descriptor = "I")
    public static int field2394;

    @OriginalMember(owner = "client!oc", name = "g", descriptor = "I")
    public static int field2398;

    @OriginalMember(owner = "client!oc", name = "i", descriptor = "I")
    public static int field2400;

    @OriginalMember(owner = "client!oc", name = "j", descriptor = "I")
    public static int field2401;

    @OriginalMember(owner = "client!oc", name = "l", descriptor = "I")
    public static int field2403;

    @OriginalMember(owner = "client!oc", name = "n", descriptor = "I")
    public static int field2405;

    @OriginalMember(owner = "client!oc", name = "q", descriptor = "I")
    public static int field2408;

    @OriginalMember(owner = "client!oc", name = "e", descriptor = "Lsd;")
    public static class122 field2396;

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "[Lr;")
    public static class112[] field2392;

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(IJ)V")
    public static final void method803(int arg0, long arg1) {
        field2403++;
        if (arg1 == 0L) {
            return;
        }
        if (class125.field3024 >= 100 && class91.field2275 != 1 || class125.field3024 >= 200) {
            class11.method64(class47.field1033, class95.field2361, arg0 ^ 0xFFFFFDAA, 0);
            return;
        }
        class84 var3 = class15.method91(-20821, arg1).method704(arg0 - 429);
        if (arg0 != 512) {
            method807((byte) 109);
        }
        for (int var4 = 0; var4 < class125.field3024; var4++) {
            if (class30.field710[var4] == arg1) {
                class11.method64(class51.method408(new class84[] { var3, class90.field2245 }, -65), class95.field2361, -70, 0);
                return;
            }
        }
        for (int var5 = 0; var5 < class86.field2133; var5++) {
            if (class71.field1747[var5] == arg1) {
                class11.method64(class51.method408(new class84[] { class143.field3447, var3, class128.field3081 }, -88), class95.field2361, -84, 0);
                return;
            }
        }
        if (var3.method720(-1, class40.field925.field1535)) {
            return;
        }
        class110.field2664++;
        class27.field646[class125.field3024] = var3;
        class30.field710[class125.field3024] = arg1;
        class71.field1741[class125.field3024] = 0;
        class14.field270[class125.field3024] = 0;
        class89.field2220 = true;
        class125.field3024++;
        class129.field3102 = class5.field100 + 1;
        class80.field1978.method769((byte) 78, 250);
        class80.field1978.method419(false, arg1);
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(I)[Lr;")
    public static final class112[] method804(int arg0) {
        field2401++;
        class112[] var1 = new class112[class80.field1989];
        if (arg0 != -1) {
            method808((byte) 85);
        }
        for (int var2 = 0; var2 < class80.field1989; var2++) {
            class112 var3 = var1[var2] = new class112();
            var3.field2689 = class80.field1991;
            var3.field2688 = class58.field1452;
            var3.field2690 = class107.field2599[var2];
            var3.field2686 = class134.field3213[var2];
            var3.field2687 = class133.field3162[var2];
            var3.field2685 = class125.field3032[var2];
            int var4 = var3.field2687 * var3.field2685;
            byte[] var5 = client.field459[var2];
            var3.field2691 = new int[var4];
            for (int var6 = 0; var6 < var4; var6++) {
                var3.field2691[var6] = class11.field181[client.method144(var5[var6], 255)];
            }
        }
        class115.method944(-99);
        return var1;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(II)Lia;")
    public static final class57 method805(int arg0, int arg1) {
        int var2 = arg1 >> arg0;
        int var3 = arg1 & 0xFFFF;
        field2408++;
        if (class24.field557[var2] == null || class24.field557[var2][var3] == null) {
            boolean var4 = class47.method338(arg0 + 894550404, var2);
            if (!var4) {
                return null;
            }
        }
        return class24.field557[var2][var3];
    }

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "(I)V")
    public static void method806(int arg0) {
        field2407 = null;
        if (arg0 != 5554) {
            field2409 = false;
        }
        field2392 = null;
        field2396 = null;
        field2402 = null;
        field2395 = null;
        field2406 = null;
        field2404 = null;
        field2393 = null;
        field2399 = null;
        field2397 = null;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(B)V")
    public static final void method807(byte arg0) {
        try {
            Graphics var1 = class92.field2296.getGraphics();
            class17.field368.method122(var1, 4, 4, 0);
            int var2 = -14 % ((arg0 + 39) / 33);
        } catch (Exception var3) {
            class92.field2296.repaint();
        }
        field2400++;
    }

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "(B)V")
    public static final void method808(byte arg0) {
        field2394++;
        if (arg0 != -9) {
            method806(-31);
        }
        class69.field1682.method966(false);
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(Lwc;I)V")
    public static final void method809(class145 arg0, int arg1) {
        arg0.field3537 = arg0.field3546;
        field2398++;
        if (arg0.field3555 == 0) {
            arg0.field3565 = 0;
            return;
        }
        if (arg0.field3558 != -1 && arg0.field3497 == 0) {
            class70 var2 = class79.method673(arg0.field3558, false);
            if (arg0.field3518 > 0 && var2.field1696 == 0) {
                arg0.field3565++;
                return;
            }
            if (arg0.field3518 <= 0 && var2.field1705 == 0) {
                arg0.field3565++;
                return;
            }
        }
        int var3 = arg0.field3549;
        int var4 = arg0.field3490[arg0.field3555 - 1] * 128 + arg0.field3562 * 64;
        int var5 = arg0.field3535;
        int var6 = arg0.field3489[arg0.field3555 - 1] * 128 + arg0.field3562 * 64;
        if (var4 - var3 > 256 || var4 - var3 < -256 || var6 - var5 > 256 || var6 - var5 < -256) {
            arg0.field3549 = var4;
            arg0.field3535 = var6;
            return;
        }
        if (arg1 != -2) {
            field2396 = null;
        }
        if (var4 > var3) {
            if (var5 < var6) {
                arg0.field3505 = 1280;
            } else if (var6 >= var5) {
                arg0.field3505 = 1536;
            } else {
                arg0.field3505 = 1792;
            }
        } else if (var4 < var3) {
            if (var6 > var5) {
                arg0.field3505 = 768;
            } else if (var5 <= var6) {
                arg0.field3505 = 512;
            } else {
                arg0.field3505 = 256;
            }
        } else if (var6 > var5) {
            arg0.field3505 = 1024;
        } else if (var6 < var5) {
            arg0.field3505 = 0;
        }
        int var7 = arg0.field3505 - arg0.field3521 & 0x7FF;
        if (var7 > 1024) {
            var7 -= 2048;
        }
        int var8 = arg0.field3539;
        int var9 = 4;
        if (var7 >= -256 && var7 <= 256) {
            var8 = arg0.field3557;
        } else if (var7 >= 256 && var7 < 768) {
            var8 = arg0.field3559;
        } else if (var7 >= -768 && var7 <= -256) {
            var8 = arg0.field3485;
        }
        if (var8 == -1) {
            var8 = arg0.field3557;
        }
        boolean var10 = true;
        arg0.field3537 = var8;
        if (arg0 instanceof class103) {
            var10 = ((class103) arg0).field2510.field3400;
        }
        if (var10) {
            if (arg0.field3521 != arg0.field3505 && arg0.field3529 == -1 && arg0.field3533 != 0) {
                var9 = 2;
            }
            if (arg0.field3555 > 2) {
                var9 = 6;
            }
            if (arg0.field3555 > 3) {
                var9 = 8;
            }
            if (arg0.field3565 > 0 && arg0.field3555 > 1) {
                arg0.field3565--;
                var9 = 8;
            }
        } else {
            if (arg0.field3555 > 1) {
                var9 = 6;
            }
            if (arg0.field3555 > 2) {
                var9 = 8;
            }
            if (arg0.field3565 > 0 && arg0.field3555 > 1) {
                arg0.field3565--;
                var9 = 8;
            }
        }
        if (arg0.field3528[arg0.field3555 - 1]) {
            var9 <<= 0x1;
        }
        if (var9 >= 8 && arg0.field3557 == arg0.field3537 && arg0.field3526 != -1) {
            arg0.field3537 = arg0.field3526;
        }
        if (var5 < var6) {
            arg0.field3535 += var9;
            if (var6 < arg0.field3535) {
                arg0.field3535 = var6;
            }
        } else if (var6 < var5) {
            arg0.field3535 -= var9;
            if (arg0.field3535 < var6) {
                arg0.field3535 = var6;
            }
        }
        if (var4 > var3) {
            arg0.field3549 += var9;
            if (arg0.field3549 > var4) {
                arg0.field3549 = var4;
            }
        } else if (var4 < var3) {
            arg0.field3549 -= var9;
            if (arg0.field3549 < var4) {
                arg0.field3549 = var4;
            }
        }
        if (arg0.field3549 == var4 && arg0.field3535 == var6) {
            if (arg0.field3518 > 0) {
                arg0.field3518--;
            }
            arg0.field3555--;
        }
    }
}
