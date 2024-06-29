import jagex3.jagmisc.jagmisc;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sv")
public class class510 extends class592 {

    @OriginalMember(owner = "client!sv", name = "p", descriptor = "Lpm;")
    private class553 field6685;

    @OriginalMember(owner = "client!sv", name = "l", descriptor = "Luj;")
    private class554 field6681;

    @OriginalMember(owner = "client!sv", name = "r", descriptor = "Lgga;")
    public static class462 field6687 = new class462();

    @OriginalMember(owner = "client!sv", name = "t", descriptor = "Z")
    public static boolean field6689 = false;

    @OriginalMember(owner = "client!sv", name = "u", descriptor = "J")
    public static long field6690 = 0L;

    @OriginalMember(owner = "client!sv", name = "h", descriptor = "I")
    public static int field6677;

    @OriginalMember(owner = "client!sv", name = "i", descriptor = "I")
    public static int field6678;

    @OriginalMember(owner = "client!sv", name = "j", descriptor = "I")
    public static int field6679;

    @OriginalMember(owner = "client!sv", name = "k", descriptor = "I")
    public static int field6680;

    @OriginalMember(owner = "client!sv", name = "m", descriptor = "I")
    public static int field6682;

    @OriginalMember(owner = "client!sv", name = "n", descriptor = "I")
    public static int field6683;

    @OriginalMember(owner = "client!sv", name = "o", descriptor = "I")
    public static int field6684;

    @OriginalMember(owner = "client!sv", name = "q", descriptor = "I")
    public static int field6686;

    @OriginalMember(owner = "client!sv", name = "s", descriptor = "I")
    public static int field6688;

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(I)V", line = 5)
    public final void method29(int arg0) {
        this.field6681.method2973(arg0 + 28137, '\u0001');
        ++field6679;
        if (arg0 != -1640) {
            field6689 = true;
        }
        super.field8014.method3469(1, false);
        super.field8014.method3388((class710) null, false);
        super.field8014.method3469(0, false);
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(Ljava/lang/String;B)J", line = 25)
    public static final long method2746(String arg0, byte arg1) {
        ++field6688;
        long var2 = 0L;
        int var4 = arg0.length();
        int var5 = 0;
        if (arg1 != 72) {
            field6690 = -55L;
        }
        while (~var4 < ~var5) {
            var2 *= 37L;
            char var6 = arg0.charAt(var5);
            if (var6 >= 'A' && var6 <= 'Z') {
                var2 += (long) (1 - -var6 + -65);
            } else if (~var6 <= -98 && var6 <= 'z') {
                var2 += (long) (var6 + -96);
            } else if (~var6 <= -49 && var6 <= '9') {
                var2 += (long) (var6 + 27 + -48);
            }
            if (var2 >= 177917621779460413L) {
                break;
            }
            ++var5;
        }
        while (~(var2 % 37L) == -1L && ~var2 != -1L) {
            var2 /= 37L;
        }
        return var2;
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(ZII)V", line = 70)
    public final void method33(boolean arg0, int arg1, int arg2) {
        ++field6678;
        float var4 = (float) ((3 & arg1) + 1) * -5.0E-4F;
        float var5 = (float) (((arg1 & 31) >> 3) + 1) * 5.0E-4F;
        float var6 = ~(arg1 & 64) == -1 ? 4.8828125E-4F : 9.765625E-4F;
        super.field8014.method3469(1, arg0);
        boolean var7 = (arg1 & 128) != 0;
        if (var7) {
            class484.field6445[0] = var6;
            class484.field6445[3] = 0.0F;
            class484.field6445[1] = 0.0F;
            class484.field6445[2] = 0.0F;
        } else {
            class484.field6445[3] = 0.0F;
            class484.field6445[2] = var6;
            class484.field6445[1] = 0.0F;
            class484.field6445[0] = 0.0F;
        }
        OpenGL.glTexGenfv(8192, 9474, class484.field6445, 0);
        class484.field6445[1] = var6;
        class484.field6445[3] = (float) super.field8014.field8566 * var4 % 1.0F;
        class484.field6445[0] = 0.0F;
        class484.field6445[2] = 0.0F;
        OpenGL.glTexGenfv(8193, 9474, class484.field6445, 0);
        if (!this.field6685.field7243) {
            int var8 = (int) ((float) super.field8014.field8566 * var5 * 16.0F);
            super.field8014.method3388(this.field6685.field7247[var8 % 16], false);
        } else {
            class484.field6445[2] = 0.0F;
            class484.field6445[3] = (float) super.field8014.field8566 * var5 % 1.0F;
            class484.field6445[0] = 0.0F;
            class484.field6445[1] = 0.0F;
            OpenGL.glTexGenfv(8194, 9473, class484.field6445, 0);
        }
        super.field8014.method3469(0, false);
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(IZ)V", line = 125)
    public final void method32(int arg0, boolean arg1) {
        ++field6686;
        if (arg0 == -1) {
            this.field6681.method2973(arg0 + 26498, '\u0000');
            if (this.field6685.field7243) {
                super.field8014.method3469(1, false);
                super.field8014.method3388(this.field6685.field7244, false);
                super.field8014.method3469(0, false);
            }
        }
    }

    @OriginalMember(owner = "client!sv", name = "<init>", descriptor = "(Lji;Lpm;)V", line = 144)
    public class510(class622 arg0, class553 arg1) {
        super(arg0);
        this.field6685 = arg1;
        this.field6681 = new class554(arg0, 2);
        this.field6681.method2971(0, 4864);
        super.field8014.method3469(1, false);
        if (this.field6685.field7243) {
            OpenGL.glTexGeni(8194, 9472, 9217);
            OpenGL.glEnable(3170);
        }
        OpenGL.glTexGeni(8192, 9472, 9216);
        OpenGL.glTexGeni(8193, 9472, 9216);
        OpenGL.glEnable(3168);
        OpenGL.glEnable(3169);
        super.field8014.method3469(0, false);
        this.field6681.method2969((byte) 60);
        this.field6681.method2971(1, 4864);
        super.field8014.method3469(1, false);
        if (this.field6685.field7243) {
            OpenGL.glDisable(3170);
        }
        OpenGL.glDisable(3168);
        OpenGL.glDisable(3169);
        super.field8014.method3469(0, false);
        this.field6681.method2969((byte) -74);
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(ZB)V", line = 176)
    public final void method27(boolean arg0, byte arg1) {
        if (arg1 < -67) {
            ++field6680;
        }
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(IILjava/lang/String;)V", line = 186)
    public static final void method2747(int arg0, int arg1, String arg2) {
        if (arg0 != 0) {
            class43 var3 = null;
            if (arg2 != null) {
                var3 = class43.method333(class650.field9053, 124, class524.field6827, class448.field5863, 0, 0);
                var3.method162(0);
                class547 var4 = class346.method1992(0, 14278, class531.field6904, class261.field3511);
                class597 var5 = var3.method405(var4, class506.method2731(class90.field1186, class531.field6904, 0), true);
                class337.method1933((byte) 42);
                class542.method2877(true, arg2, var3, var5, var4, true);
            }
            try {
                class520.field6799 = class43.method333(class650.field9053, 116, class524.field6827, class448.field5863, class260.field3509.field1287 * 2, arg0);
                if (arg2 != null) {
                    var3.method162(0);
                    class547 var6 = class346.method1992(0, 14278, class531.field6904, class261.field3511);
                    class597 var7 = var3.method405(var6, class506.method2731(class90.field1186, class531.field6904, 0), true);
                    class337.method1933((byte) 86);
                    class542.method2877(true, arg2, var3, var7, var6, true);
                }
                if (class520.field6799.method386()) {
                    boolean var8 = true;
                    try {
                        var8 = jagmisc.getTotalPhysicalMemory() > 268435456L;
                    } catch (Throwable var13) {
                    }
                    class686 var9;
                    if (var8) {
                        var9 = class520.field6799.method369(146800640);
                    } else {
                        var9 = class520.field6799.method369(104857600);
                    }
                    class520.field6799.method345(var9);
                }
            } catch (Throwable var14) {
                class520.field6799 = class43.method333(class650.field9053, 121, class524.field6827, class448.field5863, 0, 0);
                arg0 = 0;
            }
            if (var3 != null) {
                try {
                    var3.method392((byte) -39);
                } catch (Throwable var12) {
                }
            }
        } else {
            class520.field6799 = class43.method333(class650.field9053, arg1 ^ 9593, class524.field6827, class448.field5863, class260.field3509.field1287 * 2, 0);
            if (arg2 != null) {
                class520.field6799.method162(0);
                class547 var10 = class346.method1992(0, 14278, class531.field6904, class261.field3511);
                class597 var11 = class520.field6799.method405(var10, class506.method2731(class90.field1186, class531.field6904, 0), true);
                class337.method1933((byte) 76);
                class542.method2877(true, arg2, class520.field6799, var11, var10, true);
            }
        }
        ++field6677;
        class364.field4697 = arg0;
        class155.method1117(false);
        if (!class520.field6799.method334()) {
            class695.field9491 = 1;
        }
        class520.field6799.method359(class695.field9491);
        class520.field6799.method373(0);
        class520.field6799.method330(32);
        class355.field4580 = class520.field6799.method346();
        class125.field1623 = class520.field6799.method346();
        class563.method3008(512);
        class520.field6799.method332(!class260.field3509.field1297);
        if (arg1 != 9472) {
            field6689 = true;
        }
        if (class520.field6799.method327()) {
            class47.method431(class260.field3509.field1261, arg1 + -9355);
        }
        class76.method619(85, class520.field6799, class611.field8258 >> 3, class656.field9155 >> 3);
        class693.method3772((byte) 47);
        class336.field4352 = null;
        class249.field3389 = false;
        class61.field832 = true;
    }

    @OriginalMember(owner = "client!sv", name = "b", descriptor = "(B)Z", line = 307)
    public final boolean method30(byte arg0) {
        ++field6682;
        if (arg0 > -90) {
            field6690 = 101L;
        }
        return true;
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(BILji;II)Lch;", line = 319)
    public static final class219 method2748(byte arg0, int arg1, class622 arg2, int arg3, int arg4) {
        if (arg0 >= -60) {
            method2747(112, -103, (String) null);
        }
        ++field6684;
        if (!arg2.field8694 && (!class386.method2202(-79, arg4) || !class386.method2202(-112, arg3))) {
            return !arg2.field8650 ? new class219(arg2, arg1, arg4, arg3, class426.method2447(arg4, 250), class426.method2447(arg3, 250)) : new class219(arg2, 34037, arg1, arg4, arg3);
        } else {
            return new class219(arg2, 3553, arg1, arg4, arg3);
        }
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(IILgq;)V", line = 338)
    public final void method35(int arg0, int arg1, class710 arg2) {
        super.field8014.method3388(arg2, false);
        if (arg1 != 458752) {
            field6687 = null;
        }
        ++field6683;
        super.field8014.method3443(arg0, true);
    }

    @OriginalMember(owner = "client!sv", name = "b", descriptor = "(I)V", line = 351)
    public static void method2749(int arg0) {
        if (arg0 >= -36) {
            field6689 = false;
        }
        field6687 = null;
    }
}
