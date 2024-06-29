import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tk")
public class class51 {

    @OriginalMember(owner = "client!tk", name = "o", descriptor = "Lie;")
    private class32 field991 = new class32();

    @OriginalMember(owner = "client!tk", name = "g", descriptor = "Lqk;")
    public static class207 field983 = class24.method212(255, "Ausw-=hlen");

    @OriginalMember(owner = "client!tk", name = "h", descriptor = "Lqk;")
    public static class207 field984 = class24.method212(255, " steht bereits auf Ihrer Freunde)2Liste(Q");

    @OriginalMember(owner = "client!tk", name = "b", descriptor = "Lc;")
    public static class105 field978 = new class105(64);

    @OriginalMember(owner = "client!tk", name = "p", descriptor = "Lqk;")
    public static class207 field992 = class24.method212(255, "(U5");

    @OriginalMember(owner = "client!tk", name = "r", descriptor = "I")
    public static int field994 = 0;

    @OriginalMember(owner = "client!tk", name = "v", descriptor = "Lqk;")
    private static class207 field998 = class24.method212(255, "wishes to trade with you)3");

    @OriginalMember(owner = "client!tk", name = "s", descriptor = "[I")
    public static int[] field995 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @OriginalMember(owner = "client!tk", name = "q", descriptor = "Lqk;")
    public static class207 field993 = field998;

    @OriginalMember(owner = "client!tk", name = "u", descriptor = "Z")
    public static boolean field997 = false;

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "I")
    public static int field977;

    @OriginalMember(owner = "client!tk", name = "c", descriptor = "I")
    public static int field979;

    @OriginalMember(owner = "client!tk", name = "d", descriptor = "I")
    public static int field980;

    @OriginalMember(owner = "client!tk", name = "e", descriptor = "I")
    public static int field981;

    @OriginalMember(owner = "client!tk", name = "f", descriptor = "I")
    public static int field982;

    @OriginalMember(owner = "client!tk", name = "i", descriptor = "I")
    public static int field985;

    @OriginalMember(owner = "client!tk", name = "j", descriptor = "I")
    public static int field986;

    @OriginalMember(owner = "client!tk", name = "k", descriptor = "I")
    public static int field987;

    @OriginalMember(owner = "client!tk", name = "l", descriptor = "I")
    public static int field988;

    @OriginalMember(owner = "client!tk", name = "m", descriptor = "I")
    public static int field989;

    @OriginalMember(owner = "client!tk", name = "n", descriptor = "I")
    public static int field990;

    @OriginalMember(owner = "client!tk", name = "t", descriptor = "I")
    public static int field996;

    @OriginalMember(owner = "client!tk", name = "w", descriptor = "Lie;")
    private class32 field999;

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(ZLie;)V")
    public final void method389(boolean arg0, class32 arg1) {
        field990++;
        if (arg0) {
            return;
        }
        if (arg1.field651 != null) {
            arg1.method244(-10368);
        }
        arg1.field656 = this.field991;
        arg1.field651 = this.field991.field651;
        arg1.field651.field656 = arg1;
        arg1.field656.field651 = arg1;
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(IZI)V")
    public static final void method390(int arg0, boolean arg1, int arg2) {
        short var3 = 256;
        field988++;
        if (class14.field215 > 0) {
            class113.method806(class14.field215, (byte) -124);
            class14.field215 = 0;
        }
        int var4 = 0;
        int var5 = class23.field440 * arg2;
        int var6 = 0;
        for (int var7 = 1; var7 < var3 - 1; var7++) {
            int var8 = (var3 - var7) * class174.field3157[var7] / var3;
            if (var8 < 0) {
                var8 = 0;
            }
            var4 += var8;
            for (int var9 = var8; var9 < 128; var9++) {
                int var11 = class170.field2995[var4++];
                int var12 = class23.field435[var5++ + arg0];
                if (var11 == 0) {
                    class198.field3474.field2399[var6++] = var12;
                } else {
                    int var13 = var11 + 18;
                    if (var13 > 255) {
                        var13 = 255;
                    }
                    int var14 = -(var11 - 256) - 18;
                    int var15 = class113.field1969[var11];
                    if (var14 > 255) {
                        var14 = 255;
                    }
                    class198.field3474.field2399[var6++] = class121.method860(-16711936, class121.method860(var12, 16711935) * var14 + class121.method860(16711935, var15) * var13) + class121.method860(class121.method860(65280, var15) * var13 + var14 * class121.method860(var12, 65280), 16711680) >> 8;
                }
            }
            for (int var10 = 0; var10 < var8; var10++) {
                class198.field3474.field2399[var6++] = class23.field435[arg0 + (var5++)];
            }
            var5 += class23.field440 - 128;
        }
        if (!arg1) {
            method390(103, false, 80);
        }
        class198.field3474.method387(arg0, arg2);
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(I)Lie;")
    public final class32 method391(int arg0) {
        field981++;
        class32 var2 = this.field991.field656;
        if (arg0 != 65535) {
            this.method394(false);
        }
        if (this.field991 == var2) {
            this.field999 = null;
            return null;
        } else {
            this.field999 = var2.field656;
            return var2;
        }
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(B)I")
    public final int method392(byte arg0) {
        field982++;
        int var2 = 0;
        class32 var3 = this.field991.field656;
        if (arg0 != -26) {
            return -34;
        }
        while (this.field991 != var3) {
            var2++;
            var3 = var3.field656;
        }
        return var2;
    }

    @OriginalMember(owner = "client!tk", name = "b", descriptor = "(I)Lii;")
    public static final class255 method393(int arg0) {
        field989++;
        try {
            if (arg0 != -1) {
                method398((class149) null, 125);
            }
            return (class255) Class.forName("eb").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(Z)V")
    public final void method394(boolean arg0) {
        field985++;
        while (true) {
            class32 var2 = this.field991.field656;
            if (this.field991 == var2) {
                this.field999 = null;
                if (arg0) {
                    return;
                } else {
                    this.method391(80);
                    return;
                }
            }
            var2.method244(-10368);
        }
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(IIIIIBII)V")
    public static final void method395(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7) {
        field977++;
        if (arg1 == arg4) {
            class13.method73(arg3, arg6, arg5 + 188, arg0, arg7, arg4, arg2);
            return;
        }
        if (arg5 != -83) {
            method398((class149) null, 15);
        }
        if ((arg0 - arg4) >= class124.field2158 && (arg0 + arg4) <= class88.field1599 && arg7 - arg1 >= class204.field3580 && arg7 + arg1 <= class204.field3602) {
            class115.method817(83, arg3, arg1, arg7, arg6, arg0, arg2, arg4);
        } else {
            class236.method1685(arg2, arg0, arg1, arg4, 120, arg3, arg7, arg6);
        }
    }

    @OriginalMember(owner = "client!tk", name = "c", descriptor = "(I)V")
    public static void method396(int arg0) {
        field978 = null;
        field993 = null;
        field992 = null;
        field983 = null;
        if (arg0 != 8388607) {
            field994 = 27;
        }
        field984 = null;
        field998 = null;
        field995 = null;
    }

    @OriginalMember(owner = "client!tk", name = "d", descriptor = "(I)Lie;")
    public final class32 method397(int arg0) {
        class32 var2 = this.field991.field656;
        if (arg0 != 524287) {
            this.method391(-57);
        }
        field979++;
        if (this.field991 == var2) {
            return null;
        } else {
            var2.method244(arg0 ^ 0xFFF8287F);
            return var2;
        }
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(Lv;I)Lga;")
    public static final class170 method398(class149 arg0, int arg1) {
        arg0.method1045((byte) -67);
        field987++;
        int var2 = arg0.method1045((byte) 98);
        class170 var3 = class190.method1321(var2, arg1 ^ 0x7F);
        var3.field3000 = arg0.method1045((byte) 110);
        int var4 = arg0.method1045((byte) -93);
        for (int var5 = arg1; var5 < var4; var5++) {
            int var6 = arg0.method1045((byte) -17);
            var3.method29(arg0, 5877, var6);
        }
        var3.method50(arg1 + 106);
        return var3;
    }

    @OriginalMember(owner = "client!tk", name = "e", descriptor = "(I)Lie;")
    public final class32 method399(int arg0) {
        if (arg0 != 1048575) {
            return null;
        }
        field980++;
        class32 var2 = this.field999;
        if (this.field991 == var2) {
            this.field999 = null;
            return null;
        } else {
            this.field999 = var2.field656;
            return var2;
        }
    }

    @OriginalMember(owner = "client!tk", name = "<init>", descriptor = "()V")
    public class51() {
        this.field991.field651 = this.field991;
        this.field991.field656 = this.field991;
    }
}
