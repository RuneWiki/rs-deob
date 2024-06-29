import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lc")
public class class494 {

    @OriginalMember(owner = "client!lc", name = "c", descriptor = "Lfr;")
    private class231 field7213 = new class231(64);

    @OriginalMember(owner = "client!lc", name = "l", descriptor = "Lqs;")
    private class496 field7222;

    @OriginalMember(owner = "client!lc", name = "d", descriptor = "Z")
    public static boolean field7214 = false;

    @OriginalMember(owner = "client!lc", name = "k", descriptor = "Lvv;")
    public static class313 field7221 = new class313(46, 0);

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "I")
    public static int field7211;

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "I")
    public static int field7212;

    @OriginalMember(owner = "client!lc", name = "e", descriptor = "I")
    public static int field7215;

    @OriginalMember(owner = "client!lc", name = "f", descriptor = "I")
    public static int field7216;

    @OriginalMember(owner = "client!lc", name = "g", descriptor = "I")
    public static int field7217;

    @OriginalMember(owner = "client!lc", name = "h", descriptor = "I")
    public static int field7218;

    @OriginalMember(owner = "client!lc", name = "i", descriptor = "I")
    public static int field7219;

    @OriginalMember(owner = "client!lc", name = "j", descriptor = "I")
    public static int field7220;

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(Z)V")
    public static final void method2900(boolean arg0) {
        field7216++;
        int var1 = class49.field790 * 128 + 64;
        int var2 = class475.field7031 * 128 + 64;
        int var3 = class81.method592(var1, var2, 9251, class93.field1556) - class318.field4998;
        if (class423.field6386 < 100) {
            if (class473.field7021 < var1) {
                class473.field7021 += (var1 - class473.field7021) * class423.field6386 / 1000 + class251.field4286;
                if (var1 < class473.field7021) {
                    class473.field7021 = var1;
                }
            }
            if (class473.field7021 > var1) {
                class473.field7021 -= (class473.field7021 - var1) * class423.field6386 / 1000 + class251.field4286;
                if (class473.field7021 < var1) {
                    class473.field7021 = var1;
                }
            }
            if (var3 > class130.field2234) {
                class130.field2234 += (var3 - class130.field2234) * class423.field6386 / 1000 + class251.field4286;
                if (class130.field2234 > var3) {
                    class130.field2234 = var3;
                }
            }
            if (class130.field2234 > var3) {
                class130.field2234 -= (class130.field2234 - var3) * class423.field6386 / 1000 + class251.field4286;
                if (class130.field2234 < var3) {
                    class130.field2234 = var3;
                }
            }
            if (class48.field764 < var2) {
                class48.field764 += (var2 - class48.field764) * class423.field6386 / 1000 + class251.field4286;
                if (class48.field764 > var2) {
                    class48.field764 = var2;
                }
            }
            if (class48.field764 > var2) {
                class48.field764 -= (class48.field764 - var2) * class423.field6386 / 1000 + class251.field4286;
                if (var2 > class48.field764) {
                    class48.field764 = var2;
                }
            }
        } else {
            class473.field7021 = class49.field790 * 128 + 64;
            class48.field764 = class475.field7031 * 128 + 64;
            class130.field2234 = class81.method592(class473.field7021, class48.field764, 9251, class93.field1556) - class318.field4998;
        }
        int var4 = class60.field922 * 128 + 64;
        int var5 = class407.field6188 * 128 + 64;
        int var6 = class81.method592(var4, var5, 9251, class93.field1556) - class489.field7156;
        int var7 = var4 - class473.field7021;
        int var8 = var6 - class130.field2234;
        int var9 = var5 - class48.field764;
        int var10 = (int) Math.sqrt((double) (var7 * var7 + var9 * var9));
        int var11 = (int) (Math.atan2((double) var8, (double) var10) * 2607.5945876176133D) & 0x3FFF;
        if (arg0) {
            return;
        }
        if (var11 < 1024) {
            var11 = 1024;
        }
        int var12 = (int) (-2607.5945876176133D * Math.atan2((double) var7, (double) var9)) & 0x3FFF;
        if (var11 > 3072) {
            var11 = 3072;
        }
        if (var11 > class227.field3927) {
            class227.field3927 += (var11 - class227.field3927 >> 3) * class204.field3227 / 1000 + class199.field3164 << 3;
            if (var11 < class227.field3927) {
                class227.field3927 = var11;
            }
        }
        if (var11 < class227.field3927) {
            class227.field3927 -= class199.field3164 + ((class227.field3927 - var11 >> 3) * class204.field3227 / 1000) << 3;
            if (var11 > class227.field3927) {
                class227.field3927 = var11;
            }
        }
        int var13 = var12 - class381.field5891;
        if (var13 > 8192) {
            var13 -= 16384;
        }
        if (var13 < -8192) {
            var13 += 16384;
        }
        int var14 = var13 >> 3;
        if (var14 > 0) {
            class381.field5891 += class204.field3227 * var14 / 1000 + class199.field3164 << 3;
            class381.field5891 &= 0x3FFF;
        }
        if (var14 < 0) {
            class381.field5891 -= -var14 * class204.field3227 / 1000 + class199.field3164 << 3;
            class381.field5891 &= 0x3FFF;
        }
        int var15 = var12 - class381.field5891;
        if (var15 > 8192) {
            var15 -= 16384;
        }
        if (var15 < -8192) {
            var15 += 16384;
        }
        if (var15 < 0 && var14 > 0 || var15 > 0 && var14 < 0) {
            class381.field5891 = var12;
        }
        class64.field950 = 0;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(II)V")
    public final void method2901(int arg0, int arg1) {
        class231 var3 = this.field7213;
        synchronized (this.field7213) {
            if (arg0 != -8192) {
                return;
            }
            this.field7213.method1604(4);
            this.field7213 = new class231(arg1);
        }
        field7220++;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(I)V")
    public static void method2902(int arg0) {
        field7221 = null;
        if (arg0 != 1000) {
            method2906(-94);
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(IB)Lm;")
    public final class376 method2903(int arg0, byte arg1) {
        field7218++;
        class231 var3 = this.field7213;
        class376 var4;
        synchronized (this.field7213) {
            var4 = (class376) this.field7213.method1593((byte) -62, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class496 var5 = this.field7222;
        byte[] var6;
        synchronized (this.field7222) {
            var6 = this.field7222.method2926(class12.method67(124, arg0), -113, class446.method2680((byte) 97, arg0));
        }
        class376 var7 = new class376();
        if (arg1 < 51) {
            return null;
        }
        if (var6 != null) {
            var7.method2390(false, new class23(var6));
        }
        class231 var8 = this.field7213;
        synchronized (this.field7213) {
            this.field7213.method1595(var7, (long) arg0, (byte) -108);
            return var7;
        }
    }

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "(I)V")
    public final void method2904(int arg0) {
        field7215++;
        class231 var2 = this.field7213;
        synchronized (this.field7213) {
            this.field7213.method1598(arg0 - 131);
            if (arg0 != 64) {
                field7221 = null;
            }
        }
    }

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "(II)V")
    public final void method2905(int arg0, int arg1) {
        if (arg0 != 16383) {
            this.method2907((byte) -94);
        }
        class231 var3 = this.field7213;
        synchronized (this.field7213) {
            this.field7213.method1603((byte) -126, arg1);
        }
        field7212++;
    }

    @OriginalMember(owner = "client!lc", name = "c", descriptor = "(I)V")
    public static final void method2906(int arg0) {
        field7211++;
        int var1 = 0;
        if (class510.field7403.method2045(arg0 ^ 0xFFFFEAD1, class511.field7485)) {
            int var2 = var1 | 0x1;
            int var3 = var2 | 0x10;
            int var4 = var3 | 0x20;
            int var5 = var4 | 0x2;
            var1 = var5 | 0x4;
        }
        if (!class510.field7403.field5125) {
            var1 |= 0x40;
        }
        class375.method2386(var1, arg0 ^ 0xFFFFEAA0);
        class61.field928.method789(var1, (byte) 27);
        class20.field218.method2220(var1, arg0 + 5418);
        class22.field239.method1096(var1, 64);
        class30.field482.method2631(var1, 3);
        class34.method260(var1, (byte) -118);
        class171.method1157(var1, false);
        class117.method940(var1, arg0 ^ 0xFFFFD999);
        class117.method936(var1, arg0 ^ 0xFFFFEAD6);
        class67.method434(-96);
        if (arg0 != -5419) {
            method2906(50);
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(B)V")
    public final void method2907(byte arg0) {
        field7219++;
        class231 var2 = this.field7213;
        synchronized (this.field7213) {
            if (arg0 != -28) {
                this.method2904(75);
            }
            this.field7213.method1604(4);
        }
    }

    @OriginalMember(owner = "client!lc", name = "<init>", descriptor = "(Lwv;ILqs;)V")
    public class494(class535 arg0, int arg1, class496 arg2) {
        this.field7222 = arg2;
        if (this.field7222 != null) {
            int var4 = this.field7222.method2919((byte) -39) - 1;
            this.field7222.method2940(var4, -10511);
        }
    }

    static {
        new class306("You appear to be telling someone your password - please don't!", "Willst du jemandem dein Passwort verraten? Das darfst du nicht! Falls das", "Il semble que vous révéliez votre mot de passe à quelqu'un - ne faites jamais ça !", "Parece que você está revelando sua senha a alguém. Não faça isso!");
    }
}
