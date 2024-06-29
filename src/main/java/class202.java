import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kk")
public class class202 extends class129 {

    @OriginalMember(owner = "client!kk", name = "t", descriptor = "[F")
    private float[] field3144 = new float[4];

    @OriginalMember(owner = "client!kk", name = "o", descriptor = "Z")
    private boolean field3149 = false;

    @OriginalMember(owner = "client!kk", name = "z", descriptor = "Lde;")
    private class557 field3142;

    @OriginalMember(owner = "client!kk", name = "v", descriptor = "Lde;")
    private class557 field3147;

    @OriginalMember(owner = "client!kk", name = "p", descriptor = "Lde;")
    private class557 field3129;

    @OriginalMember(owner = "client!kk", name = "r", descriptor = "Lde;")
    private class557 field3131;

    @OriginalMember(owner = "client!kk", name = "F", descriptor = "Z")
    private boolean field3130;

    @OriginalMember(owner = "client!kk", name = "J", descriptor = "Lwp;")
    private class191 field3133;

    @OriginalMember(owner = "client!kk", name = "D", descriptor = "[Ljava/lang/String;")
    private static final String[] field3151 = new String[] { method1804(method1803("qN\u0013*")), method1804(method1803("tPQz\u0014qR\u000bxU")), method1804(method1803("jL !\u000fpN\u0011\"\"sR\u000b")), method1804(method1803("jL +\u0012{^\u0013\u0019\bqW\u00162")), method1804(method1803("d\u0015Qh\u0000")), method1804(method1803("jL !\u000fpN\u0011\"\"jU\u0013/\t")), method1804(method1803("jL +\u0012{^\u0013\u0019\u0011vO")), method1804(method1803("xW")), method1804(method1803("tPQ\u000eU")), method1804(method1803("tPQ\u0007U")), method1804(method1803("tPQ\u0004U")), method1804(method1803("tPQ\u000fU")), method1804(method1803("tPQ\u0003U")), method1804(method1803("tPQ\u0005U")), method1804(method1803("tPQ\u0000U")), method1804(method1803("tPQ\u0002U")), method1804(method1803("tPQ\u0001U")) };

    @OriginalMember(owner = "client!kk", name = "B", descriptor = "I")
    public static int field3150 = -1;

    @OriginalMember(owner = "client!kk", name = "s", descriptor = "F")
    public static float field3134;

    @OriginalMember(owner = "client!kk", name = "n", descriptor = "I")
    public static int field3132;

    @OriginalMember(owner = "client!kk", name = "A", descriptor = "I")
    public static int field3135;

    @OriginalMember(owner = "client!kk", name = "E", descriptor = "I")
    public static int field3136;

    @OriginalMember(owner = "client!kk", name = "x", descriptor = "I")
    public static int field3137;

    @OriginalMember(owner = "client!kk", name = "G", descriptor = "I")
    public static int field3138;

    @OriginalMember(owner = "client!kk", name = "q", descriptor = "I")
    public static int field3139;

    @OriginalMember(owner = "client!kk", name = "C", descriptor = "I")
    public static int field3140;

    @OriginalMember(owner = "client!kk", name = "I", descriptor = "I")
    public static int field3143;

    @OriginalMember(owner = "client!kk", name = "w", descriptor = "I")
    public static int field3146;

    @OriginalMember(owner = "client!kk", name = "H", descriptor = "I")
    public static int field3148;

    @OriginalMember(owner = "client!kk", name = "y", descriptor = "Z")
    private boolean field3141;

    @OriginalMember(owner = "client!kk", name = "u", descriptor = "Z")
    private boolean field3145;

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(ZB)V", line = 8)
    public final void method784(boolean arg0, byte arg1) {
        try {
            if (arg1 != -34) {
                this.method787(-5);
            }
            ++field3138;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field3151[8] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(I)V", line = 20)
    public final void method783(int arg0) {
        try {
            super.field1509.method2453(arg0, arg0 + 12);
            ++field3139;
            super.field1509.method2467(12, (class479) null);
            super.field1509.method2417(-90, class684.field9909, class684.field9909);
            super.field1509.method2498(0, class48.field546, (byte) -125);
            super.field1509.method2498(2, class114.field1352, (byte) 80);
            super.field1509.method2443(0, class48.field546, false);
            super.field1509.method2453(0, 13);
            if (this.field3149) {
                super.field1509.method2498(0, class48.field546, (byte) -98);
                super.field1509.method2443(0, class48.field546, false);
                this.field3149 = false;
            }
            if (this.field3141) {
                OpenGL.glBindProgramARB(34336, 0);
                OpenGL.glDisable(34820);
                OpenGL.glDisable(34336);
                this.field3141 = false;
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field3151[16] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!kk", name = "<init>", descriptor = "(Lrda;Lla;)V", line = 50)
    public class202(class690 arg0, class476 arg1) {
        super(arg0);
        try {
            if (arg1 != null && arg0.field10108) {
                this.field3142 = class688.method5041((byte) 94, arg1.method3640((byte) 22, field3151[5], field3151[7]), arg0, 34336);
                this.field3147 = class688.method5041((byte) 119, arg1.method3640((byte) -122, field3151[2], field3151[7]), arg0, 34336);
                this.field3129 = class688.method5041((byte) 78, arg1.method3640((byte) 107, field3151[3], field3151[7]), arg0, 34336);
                this.field3131 = class688.method5041((byte) 109, arg1.method3640((byte) 109, field3151[6], field3151[7]), arg0, 34336);
                if (!(this.field3131 != null & this.field3142 != null & this.field3147 != null & this.field3129 != null)) {
                    this.field3130 = false;
                } else {
                    this.field3133 = super.field1509.method2447(new int[] { 0, -1 }, 2, 1, false, 26236);
                    this.field3133.method751(false, 104, false);
                    this.field3130 = true;
                }
            } else {
                this.field3130 = false;
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field3151[1] + (arg0 != null ? field3151[4] : field3151[0]) + ',' + (arg1 != null ? field3151[4] : field3151[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(IILrca;)V", line = 79)
    public final void method788(int arg0, int arg1, class479 arg2) {
        try {
            if (arg1 >= -3) {
                this.method786(-22, -27, (byte) 91);
            }
            if (arg2 != null) {
                if (this.field3149) {
                    super.field1509.method2498(0, class48.field546, (byte) -114);
                    super.field1509.method2443(0, class48.field546, false);
                    this.field3149 = false;
                }
                super.field1509.method2467(12, arg2);
                super.field1509.method2433(-16075, arg0);
            } else if (!this.field3149) {
                super.field1509.method2467(12, super.field1509.field4553);
                super.field1509.method2433(-16075, 1);
                super.field1509.method2498(0, class185.field2557, (byte) -107);
                super.field1509.method2443(0, class185.field2557, false);
                this.field3149 = true;
            }
            ++field3132;
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field3151[15] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field3151[4] : field3151[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(IIB)V", line = 116)
    public final void method786(int arg0, int arg1, byte arg2) {
        try {
            int var4 = -111 / ((arg2 - 21) / 56);
            ++field3140;
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field3151[14] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(ZI)V", line = 132)
    public final void method781(boolean arg0, int arg1) {
        try {
            ++field3136;
            this.field3145 = arg0;
            super.field1509.method2453(arg1, arg1 + 12);
            super.field1509.method2467(12, this.field3133);
            super.field1509.method2417(-96, class206.field3175, class134.field1562);
            super.field1509.method2498(0, class114.field1352, (byte) -86);
            super.field1509.method889(false, 2, true, 99, class48.field546);
            super.field1509.method2443(0, class185.field2557, false);
            super.field1509.method2453(0, 13);
            this.method1124((byte) -44);
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field3151[11] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(II)V", line = 148)
    public static final void method1802(int arg0, int arg1) {
        try {
            if (arg1 <= -30) {
                class472.method3587(0);
                ++field3146;
                int var2 = class289.field4303.method2903(arg0, (byte) 38).field891;
                if (var2 != 0) {
                    int var3 = class276.field4168.field10195[arg0];
                    if (var2 == 6) {
                        class308.field4840 = var3;
                    }
                    if (~var2 == -6) {
                        class74.field864 = var3;
                    }
                }
            }
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field3151[9] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!kk", name = "c", descriptor = "(I)V", line = 180)
    public final void method787(int arg0) {
        try {
            if (this.field3141) {
                int var2 = super.field1509.method558();
                int var3 = super.field1509.method583();
                float var4 = (float) var2 + -((float) (-var3 + var2) * 0.125F);
                float var5 = (float) var2 + -((float) (-var3 + var2) * 0.25F);
                OpenGL.glProgramLocalParameter4fARB(34336, 0, var5, var4, 1.0F / (float) super.field1509.method2452(true), (float) super.field1509.method2428((byte) 110) / 255.0F);
                super.field1509.method2453(1, 13);
                super.field1509.method2462(super.field1509.method2451((byte) -62), arg0 + -2);
                super.field1509.method2453(0, 13);
            }
            if (arg0 != 1) {
                this.method790(false);
            }
            ++field3148;
        } catch (RuntimeException var7) {
            throw class759.method5498(var7, field3151[12] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(Z)Z", line = 210)
    public final boolean method790(boolean arg0) {
        try {
            ++field3137;
            return arg0 ? false : this.field3130;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field3151[13] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!kk", name = "b", descriptor = "(B)V", line = 227)
    public final void method1124(byte arg0) {
        try {
            ++field3143;
            if (arg0 == -44) {
                int var2 = super.field1509.method2427(8);
                class770 var3 = super.field1509.method2499(92);
                if (!this.field3145) {
                    OpenGL.glBindProgramARB(34336, ~var2 == Integer.MIN_VALUE ? this.field3142.field8291 : this.field3129.field8291);
                } else {
                    OpenGL.glBindProgramARB(34336, ~var2 == Integer.MIN_VALUE ? this.field3147.field8291 : this.field3131.field8291);
                }
                OpenGL.glEnable(34336);
                this.field3141 = true;
                var3.method5564(this.field3144, 0.0F, 0.0F, arg0 + 9318, (float) var2, -1.0F);
                OpenGL.glProgramLocalParameter4fARB(34336, 1, this.field3144[0], this.field3144[1], this.field3144[2], this.field3144[3]);
                this.method787(1);
            }
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field3151[10] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!kk", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1803(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 125);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!kk", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1804(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 31;
                    break;
                case 1:
                    var10005 = 59;
                    break;
                case 2:
                    var10005 = 127;
                    break;
                case 3:
                    var10005 = 70;
                    break;
                default:
                    var10005 = 125;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
