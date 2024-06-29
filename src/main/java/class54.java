import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vh")
public class class54 {

    @OriginalMember(owner = "client!vh", name = "q", descriptor = "I")
    public int field800;

    @OriginalMember(owner = "client!vh", name = "l", descriptor = "I")
    public int field795;

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "I")
    public int field785;

    @OriginalMember(owner = "client!vh", name = "o", descriptor = "I")
    public int field798;

    @OriginalMember(owner = "client!vh", name = "d", descriptor = "Lsf;")
    public static class108 field787 = class140.method973(255, "loginscreen");

    @OriginalMember(owner = "client!vh", name = "i", descriptor = "I")
    public static int field792 = 0;

    @OriginalMember(owner = "client!vh", name = "k", descriptor = "Lsf;")
    public static class108 field794 = class140.method973(255, "Veuillez commencer par supprimer ");

    @OriginalMember(owner = "client!vh", name = "n", descriptor = "Z")
    public static boolean field797 = false;

    @OriginalMember(owner = "client!vh", name = "m", descriptor = "[I")
    public static int[] field796 = new int[50];

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "I")
    public static int field784;

    @OriginalMember(owner = "client!vh", name = "c", descriptor = "I")
    public static int field786;

    @OriginalMember(owner = "client!vh", name = "e", descriptor = "I")
    public static int field788;

    @OriginalMember(owner = "client!vh", name = "f", descriptor = "I")
    public static int field789;

    @OriginalMember(owner = "client!vh", name = "g", descriptor = "I")
    public static int field790;

    @OriginalMember(owner = "client!vh", name = "h", descriptor = "I")
    public static int field791;

    @OriginalMember(owner = "client!vh", name = "j", descriptor = "I")
    public static int field793;

    @OriginalMember(owner = "client!vh", name = "p", descriptor = "Lik;")
    public static class262 field799;

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(IIII)V", line = 9)
    public static final void method376(int arg0, int arg1, int arg2, int arg3) {
        field790++;
        class98 var4 = class45.method324(arg2, arg3, (byte) 77);
        if (var4 != null && var4.field1594 != null) {
            class286 var5 = new class286();
            var5.field5006 = var4;
            var5.field4993 = var4.field1594;
            class287.method2053(var5, 71);
        }
        if (arg0 != 26121) {
            method377((byte) 5);
        }
        class172.field3132 = true;
        class163.field2927 = arg3;
        class218.field3873 = arg2;
        class21.field324 = arg1;
        class195.method1388(-82, var4);
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(B)V", line = 36)
    public static final void method377(byte arg0) {
        field784++;
        if (class16.field205 > 0) {
            class298.method2106((byte) 95);
            return;
        }
        class137.field2419 = class14.field161;
        class14.field161 = null;
        if (arg0 >= 45) {
            class312.method2177(40, (byte) -117);
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(III)V", line = 81)
    public static final void method378(int arg0, int arg1, int arg2) {
        field793++;
        if (class184.field3381 > 0) {
            class62.method429(class184.field3381, 16);
            class184.field3381 = 0;
        }
        short var3 = 256;
        int var4 = 0;
        int var5 = 0;
        if (arg1 != -256) {
            field792 = -58;
        }
        int var6 = class28.field428 * arg0;
        for (int var7 = 1; var7 < (var3 - 1); var7++) {
            int var8 = (var3 - var7) * class331.field5650[var7] / var3;
            if (var8 < 0) {
                var8 = 0;
            }
            var4 += var8;
            for (int var9 = var8; var9 < 128; var9++) {
                int var10 = class17.field235[var4++];
                int var11 = class28.field427[var6++ + arg2];
                if (var10 == 0) {
                    class81.field1268.field141[var5++] = var11;
                } else {
                    int var12 = var10 + 18;
                    if (var12 > 255) {
                        var12 = 255;
                    }
                    int var13 = 256 - var10 - 18;
                    int var14 = class60.field931[var10];
                    if (var13 > 255) {
                        var13 = 255;
                    }
                    class81.field1268.field141[var5++] = class162.method1118(16711680, var12 * class162.method1118(65280, var14) + class162.method1118(65280, var11) * var13) + class162.method1118(var12 * class162.method1118(var14, 16711935) + (var13 * class162.method1118(16711935, var11)), -16711936) >> 8;
                }
            }
            for (int var15 = 0; var15 < var8; var15++) {
                class81.field1268.field141[var5++] = class28.field427[var6++ + arg2];
            }
            var6 += class28.field428 - 128;
        }
        class81.field1268.method68(arg2, arg0);
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(IILfb;II)V", line = 170)
    public static final void method379(int arg0, int arg1, class60 arg2, int arg3, int arg4) {
        field788++;
        class299 var5 = (class299) class273.field4794.method13(0);
        if (arg3 <= 21) {
            field792 = 118;
        }
        while (var5 != null) {
            if (var5.field5200 == arg1 && (arg0 * 128) == var5.field5212 && (arg4 * 128) == var5.field5208 && var5.field5205.field902 == arg2.field902) {
                if (var5.field5220 != null) {
                    class213.field3789.method2186(var5.field5220);
                    var5.field5220 = null;
                }
                if (var5.field5222 != null) {
                    class213.field3789.method2186(var5.field5222);
                    var5.field5222 = null;
                }
                var5.method1325(0);
                return;
            }
            var5 = (class299) class273.field4794.method15((byte) 47);
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(IZIIIII)V", line = 209)
    public static final void method380(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 != -15651) {
            field799 = (class262) null;
        }
        field786++;
        class70.field1084 = arg6;
        class268.field4707 = arg5;
        class27.field415 = arg4;
        class284.field4967 = arg3;
        class128.field2188 = arg0;
        if (arg1 && class268.field4707 >= 100) {
            class15.field193 = class284.field4967 * 128 + 64;
            class255.field4443 = class70.field1084 * 128 + 64;
            class42.field560 = class45.method321(122, class255.field4443, class15.field193, class295.field5159) - class27.field415;
        }
        class63.field1021 = 2;
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(Z)V", line = 245)
    public static void method381(boolean arg0) {
        field787 = null;
        field799 = null;
        if (!arg0) {
            field794 = (class108) null;
        }
        field796 = null;
        field794 = null;
    }

    @OriginalMember(owner = "client!vh", name = "<init>", descriptor = "()V", line = 260)
    public class54() {
    }

    @OriginalMember(owner = "client!vh", name = "<init>", descriptor = "(Lvh;)V", line = 262)
    public class54(class54 arg0) {
        this.field800 = arg0.field800;
        this.field795 = arg0.field795;
        this.field785 = arg0.field785;
        this.field798 = arg0.field798;
    }
}
