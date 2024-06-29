import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public class class790 extends class593 {

    @OriginalMember(owner = "client!cc", name = "w", descriptor = "[F")
    private float[] field11487 = new float[4];

    @OriginalMember(owner = "client!cc", name = "k", descriptor = "Z")
    private boolean field11494 = false;

    @OriginalMember(owner = "client!cc", name = "n", descriptor = "Z")
    private boolean field11482;

    @OriginalMember(owner = "client!cc", name = "l", descriptor = "Lnh;")
    private class388 field11484;

    @OriginalMember(owner = "client!cc", name = "t", descriptor = "Lnh;")
    private class388 field11499;

    @OriginalMember(owner = "client!cc", name = "o", descriptor = "Lnh;")
    private class388 field11492;

    @OriginalMember(owner = "client!cc", name = "v", descriptor = "Lnh;")
    private class388 field11500;

    @OriginalMember(owner = "client!cc", name = "p", descriptor = "Lcf;")
    private class196 field11483;

    @OriginalMember(owner = "client!cc", name = "B", descriptor = "[Ljava/lang/String;")
    private static final String[] field11502 = new String[] { method5701(method5700("7DDwW")), method5701(method5700("/\tD\u001e\u0002")), method5701(method5700(":R\u0006\\")), method5701(method5700("7DDrW")), method5701(method5700("3K")), method5701(method5700("!P5W\r;R\u0004T 8N\u001e")), method5701(method5700("!P5W\r;R\u0004T !I\u0006Y\u000b")), method5701(method5700("!P5]\u00100B\u0006o\u0013=S")), method5701(method5700("7DD\f\u0016:N\u001e\u000eW")), method5701(method5700("!P5]\u00100B\u0006o\n:K\u0003D")), method5701(method5700("7DDxW")), method5701(method5700("7DDzW")), method5701(method5700("7DDyW")), method5701(method5700("7DDaW")), method5701(method5700("7DDqW")), method5701(method5700("7DDuW")), method5701(method5700("7DDvW")) };

    @OriginalMember(owner = "client!cc", name = "i", descriptor = "[J")
    public static long[] field11496 = new long[32];

    @OriginalMember(owner = "client!cc", name = "y", descriptor = "Lrj;")
    public static class252 field11490 = new class252();

    @OriginalMember(owner = "client!cc", name = "j", descriptor = "I")
    public static int field11486;

    @OriginalMember(owner = "client!cc", name = "A", descriptor = "I")
    public static int field11489;

    @OriginalMember(owner = "client!cc", name = "m", descriptor = "I")
    public static int field11491;

    @OriginalMember(owner = "client!cc", name = "z", descriptor = "I")
    public static int field11493;

    @OriginalMember(owner = "client!cc", name = "x", descriptor = "I")
    public static int field11495;

    @OriginalMember(owner = "client!cc", name = "q", descriptor = "I")
    public static int field11497;

    @OriginalMember(owner = "client!cc", name = "s", descriptor = "I")
    public static int field11498;

    @OriginalMember(owner = "client!cc", name = "u", descriptor = "I")
    public static int field11501;

    @OriginalMember(owner = "client!cc", name = "r", descriptor = "Z")
    private boolean field11485;

    @OriginalMember(owner = "client!cc", name = "h", descriptor = "Z")
    private boolean field11488;

    @OriginalMember(owner = "client!cc", name = "d", descriptor = "(I)V", line = 3)
    public final void method3256(int arg0) {
        try {
            ++field11498;
            int var2 = super.field8530.method2682(8);
            class639 var3 = super.field8530.method2610(true);
            if (this.field11485) {
                OpenGL.glBindProgramARB(34336, var2 != Integer.MAX_VALUE ? this.field11500.field5658 : this.field11499.field5658);
            } else {
                OpenGL.glBindProgramARB(34336, ~var2 == Integer.MIN_VALUE ? this.field11484.field5658 : this.field11492.field5658);
            }
            OpenGL.glEnable(34336);
            if (arg0 == 16934) {
                this.field11488 = true;
                var3.method4657(false, 0.0F, this.field11487, (float) var2, -1.0F, 0.0F);
                OpenGL.glProgramLocalParameter4fARB(34336, 1, this.field11487[0], this.field11487[1], this.field11487[2], this.field11487[3]);
                this.method1472(-5405);
            }
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field11502[13] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!cc", name = "<init>", descriptor = "(Ldga;Llga;)V", line = 37)
    public class790(class713 arg0, class47 arg1) {
        super(arg0);
        try {
            if (arg1 != null && arg0.field10136) {
                this.field11484 = class470.method3610(34336, arg1.method529(field11502[4], 1, field11502[6]), arg0, 34379);
                this.field11499 = class470.method3610(34336, arg1.method529(field11502[4], 1, field11502[5]), arg0, 34379);
                this.field11492 = class470.method3610(34336, arg1.method529(field11502[4], 1, field11502[9]), arg0, 34379);
                this.field11500 = class470.method3610(34336, arg1.method529(field11502[4], 1, field11502[7]), arg0, 34379);
                if (this.field11492 != null & this.field11499 != null & this.field11484 != null & this.field11500 != null) {
                    this.field11483 = super.field8530.method2613(2, 10, false, new int[] { 0, -1 }, 1);
                    this.field11483.method1706(-18440, false, false);
                    this.field11482 = true;
                } else {
                    this.field11482 = false;
                }
            } else {
                this.field11482 = false;
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field11502[8] + (arg0 != null ? field11502[1] : field11502[2]) + ',' + (arg1 != null ? field11502[1] : field11502[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "(I)V", line = 64)
    public final void method1472(int arg0) {
        try {
            ++field11497;
            if (this.field11488) {
                int var2 = super.field8530.method187();
                int var3 = super.field8530.method195();
                float var4 = (float) var2 - (float) (-var3 + var2) * 0.125F;
                float var5 = (float) var2 + -((float) (-var3 + var2) * 0.25F);
                OpenGL.glProgramLocalParameter4fARB(34336, 0, var5, var4, 1.0F / (float) super.field8530.method2615(2), (float) super.field8530.method2665((byte) 88) / 255.0F);
                super.field8530.method2661(arg0 ^ -5459, 1);
                super.field8530.method2658(super.field8530.method2653(3), -8793);
                super.field8530.method2661(51, 0);
            }
            if (arg0 != -5405) {
                this.field11487 = null;
            }
        } catch (RuntimeException var7) {
            throw class665.method4799(var7, field11502[11] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(I)Z", line = 91)
    public final boolean method458(int arg0) {
        try {
            if (arg0 < 70) {
                return false;
            } else {
                ++field11489;
                return this.field11482;
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field11502[16] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(BZ)V", line = 105)
    public final void method460(byte arg0, boolean arg1) {
        try {
            ++field11501;
            if (arg0 != -20) {
                method5699(86);
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field11502[10] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(IZ)V", line = 117)
    public final void method454(int arg0, boolean arg1) {
        try {
            ++field11491;
            int var3 = -5 % ((-51 - arg0) / 39);
            this.field11485 = arg1;
            super.field8530.method2661(101, 1);
            super.field8530.method2668(24, this.field11483);
            super.field8530.method2624(class795.field11565, (byte) 121, class256.field3668);
            super.field8530.method2655(1, 0, class659.field9335);
            super.field8530.method2096(true, false, (byte) 96, class784.field11325, 2);
            super.field8530.method2670(-128, 0, class514.field7551);
            super.field8530.method2661(108, 0);
            this.method3256(16934);
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field11502[14] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!cc", name = "h", descriptor = "(I)V", line = 135)
    public static void method5699(int arg0) {
        try {
            field11490 = null;
            field11496 = null;
            if (arg0 != -1) {
                method5699(-91);
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field11502[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!cc", name = "c", descriptor = "(I)V", line = 155)
    public final void method455(int arg0) {
        try {
            super.field8530.method2661(87, 1);
            ++field11486;
            super.field8530.method2668(24, (class764) null);
            if (arg0 != -15226) {
                this.field11484 = null;
            }
            super.field8530.method2624(class539.field7920, (byte) 96, class539.field7920);
            super.field8530.method2655(1, 0, class784.field11325);
            super.field8530.method2655(1, 2, class659.field9335);
            super.field8530.method2670(-128, 0, class784.field11325);
            super.field8530.method2661(arg0 + 15270, 0);
            if (this.field11494) {
                super.field8530.method2655(1, 0, class784.field11325);
                super.field8530.method2670(-128, 0, class784.field11325);
                this.field11494 = false;
            }
            if (this.field11488) {
                OpenGL.glBindProgramARB(34336, 0);
                OpenGL.glDisable(34820);
                OpenGL.glDisable(34336);
                this.field11488 = false;
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field11502[15] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(IIB)V", line = 195)
    public final void method463(int arg0, int arg1, byte arg2) {
        try {
            ++field11495;
            if (arg2 > -98) {
                this.field11487 = null;
            }
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field11502[12] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(IBLah;)V", line = 205)
    public final void method452(int arg0, byte arg1, class764 arg2) {
        try {
            if (arg2 != null) {
                if (this.field11494) {
                    super.field8530.method2655(arg1 + 107, 0, class784.field11325);
                    super.field8530.method2670(-128, 0, class784.field11325);
                    this.field11494 = false;
                }
                super.field8530.method2668(24, arg2);
                super.field8530.method2679(2, arg0);
            } else if (!this.field11494) {
                super.field8530.method2668(arg1 ^ -114, super.field8530.field4751);
                super.field8530.method2679(2, 1);
                super.field8530.method2655(1, 0, class514.field7551);
                super.field8530.method2670(-128, 0, class514.field7551);
                this.field11494 = true;
            }
            if (arg1 != -106) {
                this.field11488 = false;
            }
            ++field11493;
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field11502[0] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field11502[1] : field11502[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!cc", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5700(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 127);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!cc", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5701(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 84;
                    break;
                case 1:
                    var10005 = 39;
                    break;
                case 2:
                    var10005 = 106;
                    break;
                case 3:
                    var10005 = 48;
                    break;
                default:
                    var10005 = 127;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
