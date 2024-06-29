import jaggl.OpenGL;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!br")
public class class502 extends class398 {

    @OriginalMember(owner = "client!br", name = "o", descriptor = "Lal;")
    private class170 field7104;

    @OriginalMember(owner = "client!br", name = "f", descriptor = "Lbq;")
    private class646 field7095;

    @OriginalMember(owner = "client!br", name = "g", descriptor = "Liba;")
    public static class211 field7096 = new class211(22, 8);

    @OriginalMember(owner = "client!br", name = "e", descriptor = "I")
    public static int field7094;

    @OriginalMember(owner = "client!br", name = "h", descriptor = "I")
    public static int field7097;

    @OriginalMember(owner = "client!br", name = "i", descriptor = "I")
    public static int field7098;

    @OriginalMember(owner = "client!br", name = "j", descriptor = "I")
    public static int field7099;

    @OriginalMember(owner = "client!br", name = "k", descriptor = "I")
    public static int field7100;

    @OriginalMember(owner = "client!br", name = "l", descriptor = "I")
    public static int field7101;

    @OriginalMember(owner = "client!br", name = "m", descriptor = "I")
    public static int field7102;

    @OriginalMember(owner = "client!br", name = "n", descriptor = "I")
    public static int field7103;

    @OriginalMember(owner = "client!br", name = "p", descriptor = "I")
    public static int field7105;

    @OriginalMember(owner = "client!br", name = "q", descriptor = "I")
    public static int field7106;

    @OriginalMember(owner = "client!br", name = "r", descriptor = "I")
    public static int field7107;

    @OriginalMember(owner = "client!br", name = "s", descriptor = "I")
    public static int field7108;

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(ZI)V", line = 6)
    public final void method91(boolean arg0, int arg1) {
        this.field7095.method3678('\u0000', 95);
        ++field7094;
        if (this.field7104.field2403) {
            super.field6009.method1745(true, 1);
            super.field6009.method1709((byte) -73, this.field7104.field2400);
            super.field6009.method1745(true, 0);
        }
        if (arg1 != -5191) {
            this.method93(102, (class517) null, (byte) 112);
        }
    }

    @OriginalMember(owner = "client!br", name = "<init>", descriptor = "(Luca;Lal;)V", line = 26)
    public class502(class287 arg0, class170 arg1) {
        super(arg0);
        this.field7104 = arg1;
        this.field7095 = new class646(arg0, 2);
        this.field7095.method3680(0, (byte) 93);
        super.field6009.method1745(true, 1);
        if (this.field7104.field2403) {
            OpenGL.glTexGeni(8194, 9472, 9217);
            OpenGL.glEnable(3170);
        }
        OpenGL.glTexGeni(8192, 9472, 9216);
        OpenGL.glTexGeni(8193, 9472, 9216);
        OpenGL.glEnable(3168);
        OpenGL.glEnable(3169);
        super.field6009.method1745(true, 0);
        this.field7095.method3679(-120);
        this.field7095.method3680(1, (byte) 77);
        super.field6009.method1745(true, 1);
        if (this.field7104.field2403) {
            OpenGL.glDisable(3170);
        }
        OpenGL.glDisable(3168);
        OpenGL.glDisable(3169);
        super.field6009.method1745(true, 0);
        this.field7095.method3679(-121);
    }

    @OriginalMember(owner = "client!br", name = "c", descriptor = "(I)V", line = 59)
    public static void method2861(int arg0) {
        if (arg0 != 0) {
            method2864(false);
        }
        field7096 = null;
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(IBI)V", line = 70)
    public final void method86(int arg0, byte arg1, int arg2) {
        ++field7098;
        float var4 = (float) ((arg2 & 3) - -1) * -5.0E-4F;
        if (arg1 != 82) {
            this.field7095 = null;
        }
        float var5 = (float) (((27 & arg2) >> 3) + 1) * 5.0E-4F;
        float var6 = ~(64 & arg2) != -1 ? 9.765625E-4F : 4.8828125E-4F;
        super.field6009.method1745(true, 1);
        boolean var7 = ~(128 & arg2) != -1;
        if (!var7) {
            class305.field4524[2] = var6;
            class305.field4524[1] = 0.0F;
            class305.field4524[0] = 0.0F;
            class305.field4524[3] = 0.0F;
        } else {
            class305.field4524[2] = 0.0F;
            class305.field4524[3] = 0.0F;
            class305.field4524[1] = 0.0F;
            class305.field4524[0] = var6;
        }
        OpenGL.glTexGenfv(8192, 9474, class305.field4524, 0);
        class305.field4524[0] = 0.0F;
        class305.field4524[3] = (float) super.field6009.field4020 * var4 % 1.0F;
        class305.field4524[1] = var6;
        class305.field4524[2] = 0.0F;
        OpenGL.glTexGenfv(8193, 9474, class305.field4524, 0);
        if (this.field7104.field2403) {
            class305.field4524[0] = 0.0F;
            class305.field4524[3] = (float) super.field6009.field4020 * var5 % 1.0F;
            class305.field4524[2] = 0.0F;
            class305.field4524[1] = 0.0F;
            OpenGL.glTexGenfv(8194, 9473, class305.field4524, 0);
        } else {
            int var8 = (int) ((float) super.field6009.field4020 * var5 * 16.0F);
            super.field6009.method1709((byte) -56, this.field7104.field2399[var8 % 16]);
        }
        super.field6009.method1745(true, 0);
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(I)Z", line = 127)
    public final boolean method87(int arg0) {
        ++field7100;
        return arg0 != 3 ? true : true;
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(Lr;I)V", line = 138)
    public static final void method2862(class98 arg0, int arg1) {
        if (arg1 >= -59) {
            field7101 = 106;
        }
        class597.field8642 = class596.method3397(arg0, class627.field9101, 2, true);
        ++field7103;
        class446.field6477 = class53.method321(arg0, 109, class627.field9101);
        class244.field3236 = class596.method3397(arg0, class410.field6111, 2, true);
        class624.field9024 = class53.method321(arg0, 109, class410.field6111);
        class395.field5976 = class596.method3397(arg0, class63.field1003, 2, true);
        class141.field2042 = class53.method321(arg0, 126, class63.field1003);
    }

    @OriginalMember(owner = "client!br", name = "b", descriptor = "(ZI)I", line = 154)
    public static final int method2863(boolean arg0, int arg1) {
        ++field7099;
        return arg0 ? 15 : arg1 >>> 7;
    }

    @OriginalMember(owner = "client!br", name = "b", descriptor = "(I)V", line = 165)
    public final void method92(int arg0) {
        this.field7095.method3678('\u0001', 106);
        ++field7107;
        super.field6009.method1745(true, 1);
        super.field6009.method1709((byte) -56, (class517) null);
        super.field6009.method1745(true, 0);
        if (arg0 != 512) {
            field7105 = 95;
        }
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(Z)Z", line = 179)
    public static final boolean method2864(boolean arg0) {
        ++field7106;
        if (arg0) {
            field7096 = null;
        }
        if (class295.field4357) {
            try {
                class101.method727("showVideoAd", -120, class551.field8116);
                return true;
            } catch (Throwable var1) {
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(ILvaa;B)V", line = 201)
    public final void method93(int arg0, class517 arg1, byte arg2) {
        int var4 = 123 / ((arg2 - 76) / 41);
        super.field6009.method1709((byte) -110, arg1);
        ++field7102;
        super.field6009.method1751(arg0, 21575);
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(IZ)V", line = 212)
    public final void method94(int arg0, boolean arg1) {
        if (arg0 != 0) {
            this.field7104 = null;
        }
        ++field7097;
    }

    @OriginalMember(owner = "client!br", name = "d", descriptor = "(I)Z", line = 231)
    public static final boolean method2865(int arg0) throws IOException {
        ++field7108;
        if (class230.field3051 == null) {
            return false;
        } else {
            if (class617.field8919 == null) {
                if (class430.field6261) {
                    if (!class230.field3051.method1359(-109, 1)) {
                        return false;
                    }
                    class230.field3051.method1356(false, 0, class389.field5816.field7952, 1);
                    ++class232.field3070;
                    class47.field746 = 0;
                    class430.field6261 = false;
                }
                class389.field5816.field7956 = 0;
                if (class389.field5816.method1937((byte) 93)) {
                    if (!class230.field3051.method1359(-83, 1)) {
                        return false;
                    }
                    class230.field3051.method1356(false, 1, class389.field5816.field7952, 1);
                    ++class232.field3070;
                    class47.field746 = 0;
                }
                class430.field6261 = true;
                class622[] var1 = class133.method947(0);
                int var2 = class389.field5816.method1938((byte) 81);
                if (~var2 > -1 || var2 >= var1.length) {
                    throw new IOException("invo:" + var2 + " ip:" + class389.field5816.field7956);
                }
                class617.field8919 = var1[var2];
                class297.field4376 = class617.field8919.field8998;
            }
            if (class297.field4376 == -1) {
                if (!class230.field3051.method1359(-90, 1)) {
                    return false;
                }
                class230.field3051.method1356(false, 0, class389.field5816.field7952, 1);
                class297.field4376 = class389.field5816.field7952[0] & 255;
                ++class232.field3070;
                class47.field746 = 0;
            }
            if (class297.field4376 == -2) {
                if (!class230.field3051.method1359(arg0 + 65431, 2)) {
                    return false;
                }
                class230.field3051.method1356(false, 0, class389.field5816.field7952, 2);
                class389.field5816.field7956 = 0;
                class297.field4376 = class389.field5816.method3169(26488);
                class232.field3070 += 2;
                class47.field746 = 0;
            }
            if (class297.field4376 > 0) {
                if (!class230.field3051.method1359(-93, class297.field4376)) {
                    return false;
                }
                class389.field5816.field7956 = 0;
                class230.field3051.method1356(false, 0, class389.field5816.field7952, class297.field4376);
                class47.field746 = 0;
                class232.field3070 += class297.field4376;
            }
            class334.field4862 = class160.field2275;
            class160.field2275 = class543.field8034;
            class543.field8034 = class617.field8919;
            if (class617.field8919 == class53.field818) {
                class181.method1219(true, class308.field4544);
                class617.field8919 = null;
                return true;
            } else if (class617.field8919 == class401.field6035) {
                int var3 = class389.field5816.method3169(arg0 ^ -39048);
                int var4 = class389.field5816.method3160(false);
                if (class612.method3484(var3, (byte) 98)) {
                    class200 var5 = (class200) class318.field4623.method2002((byte) -123, (long) var4);
                    if (var5 != null) {
                        class522.method2950(-3223, false, var5, true);
                    }
                    if (class246.field3254 != null) {
                        class284.method1679(class246.field3254, arg0 ^ 65461);
                        class246.field3254 = null;
                    }
                }
                class617.field8919 = null;
                return true;
            } else if (class617.field8919 == class509.field7193) {
                class65.method395(class317.field4617, arg0 + 65427);
                class617.field8919 = null;
                return false;
            } else if (class65.field1031 == class617.field8919) {
                int var6 = class389.field5816.method3169(26488);
                int var7 = class389.field5816.method3169(arg0 ^ -39048);
                int var8 = class389.field5816.method3169(arg0 ^ -39048);
                int var9 = class389.field5816.method3169(arg0 + 92024);
                if (class612.method3484(var6, (byte) -100) && class220.field2917[var7] != null) {
                    for (int var10 = var8; var9 > var10; ++var10) {
                        int var11 = class389.field5816.method3154((byte) -3);
                        if (~var10 > ~class220.field2917[var7].length && class220.field2917[var7][var10] != null) {
                            class220.field2917[var7][var10].field116 = var11;
                        }
                    }
                }
                class617.field8919 = null;
                return true;
            } else if (class617.field8919 == class44.field661) {
                class9.method69((byte) -4);
                class617.field8919 = null;
                return true;
            } else if (class617.field8919 == class408.field6078) {
                class181.method1219(true, class183.field2513);
                class617.field8919 = null;
                return true;
            } else if (class617.field8919 == class473.field6799) {
                int var12 = class389.field5816.method3160(false);
                int var13 = class389.field5816.method3168(65536);
                if (class612.method3484(var13, (byte) -109)) {
                    class8.method46(44, var12, 3, -1, -1);
                }
                class617.field8919 = null;
                return true;
            } else if (class617.field8919 == class295.field4355) {
                int var14 = class389.field5816.method3115(29871);
                int var15 = class389.field5816.method3168(65536);
                int var16 = class389.field5816.method3147(arg0 + 65534);
                int var17 = class389.field5816.method3168(65536);
                if (class612.method3484(var17, (byte) -118)) {
                    class200 var18 = (class200) class318.field4623.method2002((byte) -106, (long) var16);
                    if (var18 != null) {
                        class522.method2950(arg0 ^ 62313, false, var18, ~var18.field2716 != ~var15);
                    }
                    class460.method2681(-1, var16, false, var14, var15);
                }
                class617.field8919 = null;
                return true;
            } else if (class617.field8919 == class19.field365) {
                class617.field8919 = null;
                return false;
            } else if (class617.field8919 == class351.field5209) {
                boolean var19 = class389.field5816.method3115(29871) == 1;
                String var20 = class389.field5816.method3145((byte) -121);
                String var21 = var20;
                if (var19) {
                    var21 = class389.field5816.method3145((byte) -121);
                }
                long var22 = (long) class389.field5816.method3169(26488);
                long var24 = (long) class389.field5816.method3154((byte) -81);
                int var26 = class389.field5816.method3115(29871);
                int var27 = class389.field5816.method3169(26488);
                long var28 = (var22 << 32) + var24;
                boolean var30 = false;
                int var31 = 0;
                while (true) {
                    if (~var31 <= -101) {
                        if (~var26 >= -2 && class35.method209(var21, 11)) {
                            var30 = true;
                        }
                        break;
                    }
                    if (class252.field3299[var31] == var28) {
                        var30 = true;
                        break;
                    }
                    ++var31;
                }
                if (!var30 && class647.field9307 == 0) {
                    class252.field3299[class392.field5934] = var28;
                    class392.field5934 = (class392.field5934 + 1) % 100;
                    String var32 = class23.field431.method2749(var27, false).method1345((byte) -62, class389.field5816);
                    if (var26 == 2) {
                        class408.method2504(var20, 0, "<img=1>" + var21, var27, 18, var32, (String) null, "<img=1>" + var20, 0);
                    } else if (var26 != 1) {
                        class408.method2504(var20, 0, var21, var27, 18, var32, (String) null, var20, arg0 + 65536);
                    } else {
                        class408.method2504(var20, 0, "<img=0>" + var21, var27, 18, var32, (String) null, "<img=0>" + var20, 0);
                    }
                }
                class617.field8919 = null;
                return true;
            } else if (class617.field8919 == class475.field6811) {
                int var33 = class389.field5816.method3116(arg0 + 65599);
                String var34 = class389.field5816.method3145((byte) -121);
                int var35 = class389.field5816.method3169(26488);
                if (class612.method3484(var33, (byte) 0)) {
                    class203.method1314(var34, arg0 + 65538, var35);
                }
                class617.field8919 = null;
                return true;
            } else if (class617.field8919 == class240.field3158) {
                int var36 = class389.field5816.method3147(-2);
                int var37 = class389.field5816.method3168(arg0 ^ -131072);
                int var38 = class389.field5816.method3169(26488);
                if (class612.method3484(var38, (byte) -98)) {
                    class106.method748(var37, 41, var36);
                }
                class617.field8919 = null;
                return true;
            } else if (class617.field8919 == class282.field3770) {
                while (class389.field5816.field7956 < class297.field4376) {
                    boolean var49 = ~class389.field5816.method3115(29871) == -2;
                    String var50 = class389.field5816.method3145((byte) -121);
                    String var51 = class389.field5816.method3145((byte) -121);
                    int var52 = class389.field5816.method3169(26488);
                    int var53 = class389.field5816.method3115(29871);
                    String var54 = "";
                    boolean var55 = false;
                    if (var52 > 0) {
                        var54 = class389.field5816.method3145((byte) -121);
                        var55 = ~class389.field5816.method3115(29871) == -2;
                    }
                    for (int var56 = 0; var56 < class356.field5266; ++var56) {
                        if (!var49) {
                            if (var50.equals(class205.field2796[var56])) {
                                if (~class484.field6902[var56] != ~var52) {
                                    boolean var57 = true;
                                    for (class592 var58 = (class592) class688.field9715.method2370(-26173); var58 != null; var58 = (class592) class688.field9715.method2369((byte) 123)) {
                                        if (var58.field8597.equals(var50)) {
                                            if (var52 != 0 && var58.field8594 == 0) {
                                                var58.method300((byte) 61);
                                                var57 = false;
                                            } else if (var52 == 0 && ~var58.field8594 != -1) {
                                                var57 = false;
                                                var58.method300((byte) 61);
                                            }
                                        }
                                    }
                                    if (var57) {
                                        class688.field9715.method2368(0, new class592(var50, var52));
                                    }
                                    class484.field6902[var56] = var52;
                                }
                                class645.field9294[var56] = var51;
                                class273.field3566[var56] = var54;
                                class571.field8299[var56] = var53;
                                class238.field3133[var56] = var55;
                                var50 = null;
                                break;
                            }
                        } else if (var51.equals(class205.field2796[var56])) {
                            class205.field2796[var56] = var50;
                            class645.field9294[var56] = var51;
                            var50 = null;
                            break;
                        }
                    }
                    if (var50 != null && class356.field5266 < 200) {
                        class205.field2796[class356.field5266] = var50;
                        class645.field9294[class356.field5266] = var51;
                        class484.field6902[class356.field5266] = var52;
                        class273.field3566[class356.field5266] = var54;
                        class571.field8299[class356.field5266] = var53;
                        class238.field3133[class356.field5266] = var55;
                        ++class356.field5266;
                    }
                }
                class372.field5507 = 2;
                class516.field7245 = class351.field5215;
                boolean var39 = false;
                int var40 = class356.field5266;
                while (~var40 < -1) {
                    boolean var41 = true;
                    --var40;
                    for (int var42 = 0; var42 < var40; ++var42) {
                        if (class484.field6902[var42] != class684.field9654.field1522 && ~class484.field6902[var42 + 1] == ~class684.field9654.field1522 || class484.field6902[var42] == 0 && class484.field6902[var42 + 1] != 0) {
                            int var43 = class484.field6902[var42];
                            class484.field6902[var42] = class484.field6902[var42 + 1];
                            class484.field6902[var42 - -1] = var43;
                            String var44 = class273.field3566[var42];
                            class273.field3566[var42] = class273.field3566[var42 + 1];
                            class273.field3566[var42 - -1] = var44;
                            String var45 = class205.field2796[var42];
                            class205.field2796[var42] = class205.field2796[var42 - -1];
                            class205.field2796[var42 + 1] = var45;
                            String var46 = class645.field9294[var42];
                            class645.field9294[var42] = class645.field9294[var42 + 1];
                            class645.field9294[var42 - -1] = var46;
                            int var47 = class571.field8299[var42];
                            class571.field8299[var42] = class571.field8299[var42 - -1];
                            class571.field8299[var42 - -1] = var47;
                            boolean var48 = class238.field3133[var42];
                            class238.field3133[var42] = class238.field3133[var42 + 1];
                            class238.field3133[var42 + 1] = var48;
                            var41 = false;
                        }
                    }
                    if (var41) {
                        break;
                    }
                }
                class617.field8919 = null;
                return true;
            } else {
                if (arg0 != -65536) {
                    method2861(126);
                }
                if (class654.field9366 == class617.field8919) {
                    class639.field9183 = class389.field5816.method3166((byte) -62);
                    class386.field5769 = class389.field5816.method3117(arg0 ^ 76135392);
                    class617.field8919 = null;
                    return true;
                } else if (class617.field8919 == class374.field5528) {
                    class181.method1219(true, class413.field6124);
                    class617.field8919 = null;
                    return true;
                } else if (class74.field1164 == class617.field8919) {
                    boolean var59 = class389.field5816.method3115(arg0 + 95407) == 1;
                    byte[] var60 = new byte[class297.field4376 + -1];
                    class389.field5816.method3155(class297.field4376 + -1, 0, var60, 0);
                    class198.method1295(var60, 3739, var59);
                    class617.field8919 = null;
                    return true;
                } else if (class623.field9016 == class617.field8919) {
                    boolean var61 = ~class389.field5816.method3115(29871) == -2;
                    String var62 = class389.field5816.method3145((byte) -121);
                    String var63 = var62;
                    if (var61) {
                        var63 = class389.field5816.method3145((byte) -121);
                    }
                    int var64 = class389.field5816.method3115(29871);
                    boolean var65 = false;
                    if (var64 <= 1) {
                        if ((!class379.field5684 || class621.field8993) && !class398.field6008) {
                            if (var64 <= 1 && class35.method209(var63, -125)) {
                                var65 = true;
                            }
                        } else {
                            var65 = true;
                        }
                    }
                    if (!var65 && class647.field9307 == 0) {
                        String var66 = class289.method1787(class285.method1686((byte) -119, class389.field5816), arg0 ^ -65426);
                        if (var64 != 2) {
                            if (~var64 == -2) {
                                class408.method2504(var62, 0, "<img=0>" + var63, -1, 24, var66, (String) null, "<img=0>" + var62, arg0 + 65536);
                            } else {
                                class408.method2504(var62, 0, var63, -1, 24, var66, (String) null, var62, arg0 + 65536);
                            }
                        } else {
                            class408.method2504(var62, 0, "<img=1>" + var63, -1, 24, var66, (String) null, "<img=1>" + var62, 0);
                        }
                    }
                    class617.field8919 = null;
                    return true;
                } else if (class617.field8919 == class23.field435) {
                    int var67 = class389.field5816.method3169(26488);
                    int var68 = class389.field5816.method3115(29871);
                    boolean var69 = (var68 & 1) == 1;
                    class574.method3303(var69, var67, (byte) -125);
                    int var70 = class389.field5816.method3169(26488);
                    for (int var71 = 0; ~var70 < ~var71; ++var71) {
                        int var72 = class389.field5816.method3166((byte) -89);
                        if (~var72 == -256) {
                            var72 = class389.field5816.method3118(false);
                        }
                        int var73 = class389.field5816.method3168(arg0 + 131072);
                        class19.method133(var67, arg0 ^ -65536, var72, var73 + -1, var71, var69);
                    }
                    class222.field2942[class425.method2563(31, class324.field4706++)] = var67;
                    class617.field8919 = null;
                    return true;
                } else if (class617.field8919 == class149.field2110) {
                    int var74 = class389.field5816.method3169(26488);
                    if (~var74 == -65536) {
                        var74 = -1;
                    }
                    int var75 = class389.field5816.method3115(29871);
                    int var76 = class389.field5816.method3169(26488);
                    int var77 = class389.field5816.method3115(arg0 ^ -35665);
                    int var78 = class389.field5816.method3169(26488);
                    class176.method1201(false, var75, -124, var76, var78, var74, var77);
                    class617.field8919 = null;
                    return true;
                } else if (class617.field8919 == class504.field7141) {
                    int var79 = class389.field5816.method3117(-76104736);
                    byte var80 = class389.field5816.method3173(72);
                    int var81 = class389.field5816.method3168(65536);
                    if (class612.method3484(var81, (byte) 35)) {
                        class638.method3644(var79, var80, (byte) 124);
                    }
                    class617.field8919 = null;
                    return true;
                } else if (class617.field8919 == class441.field6403) {
                    int var82 = class389.field5816.method3166((byte) -53);
                    int var83 = class389.field5816.method3169(arg0 + 92024);
                    class308.field4545.method3396(var82, (byte) 89, var83);
                    class617.field8919 = null;
                    return true;
                } else if (class617.field8919 == class479.field6859) {
                    int var84 = class389.field5816.method3172(32122);
                    if (~var84 == -65536) {
                        var84 = -1;
                    }
                    int var85 = class389.field5816.method3168(65536);
                    int var86 = class389.field5816.method3118(false);
                    int var87 = class389.field5816.method3160(false);
                    int var88 = class389.field5816.method3168(65536);
                    if (~var88 == -65536) {
                        var88 = -1;
                    }
                    if (class612.method3484(var85, (byte) -121)) {
                        for (int var89 = var84; ~var88 <= ~var89; ++var89) {
                            long var90 = ((long) var86 << 32) + (long) var89;
                            class78 var92 = (class78) class584.field8483.method2002((byte) -125, var90);
                            class78 var93;
                            if (var92 != null) {
                                var93 = new class78(var87, var92.field1272);
                                var92.method2360((byte) 66);
                            } else if (~var89 != 0) {
                                var93 = new class78(var87, -1);
                            } else {
                                var93 = new class78(var87, class705.method3944(var86, (byte) 113).field128.field1272);
                            }
                            class584.field8483.method2001(24, var93, var90);
                        }
                    }
                    class617.field8919 = null;
                    return true;
                } else if (class617.field8919 == class522.field7327) {
                    int var94 = class389.field5816.method3169(arg0 ^ -39048);
                    if (class612.method3484(var94, (byte) 107)) {
                        class485.method2772((byte) -118);
                    }
                    class617.field8919 = null;
                    return true;
                } else if (class617.field8919 == class496.field7029) {
                    class550.method3212(class297.field4376, -121, class389.field5816);
                    class617.field8919 = null;
                    return true;
                } else if (class98.field1498 == class617.field8919) {
                    int var95 = class389.field5816.method3169(arg0 + 92024);
                    int var96 = class389.field5816.method3115(arg0 ^ -35665);
                    int var97 = class389.field5816.method3115(arg0 + 95407);
                    int var98 = class389.field5816.method3115(29871);
                    int var99 = class389.field5816.method3115(29871);
                    int var100 = class389.field5816.method3169(26488);
                    if (class612.method3484(var95, (byte) -118)) {
                        class215.field2883[var96] = true;
                        class564.field8246[var96] = var97;
                        class412.field6119[var96] = var98;
                        class684.field9660[var96] = var99;
                        class264.field3453[var96] = var100;
                    }
                    class617.field8919 = null;
                    return true;
                } else if (class617.field8919 == class496.field7026) {
                    class223.field2953 = class351.field5215;
                    if (class297.field4376 == 0) {
                        class587.field8520 = 0;
                        class205.field2805 = null;
                        class451.field6509 = null;
                        class642.field9202 = null;
                        class617.field8919 = null;
                        return true;
                    } else {
                        class205.field2805 = class389.field5816.method3145((byte) -121);
                        boolean var101 = class389.field5816.method3115(29871) == 1;
                        if (var101) {
                            class389.field5816.method3145((byte) -121);
                        }
                        long var102 = class389.field5816.method3165(arg0 + 65604);
                        class642.field9202 = class444.method2626(-4943, var102);
                        class281.field3746 = class389.field5816.method3128(arg0 + 98303);
                        int var104 = class389.field5816.method3115(29871);
                        if (~var104 == -256) {
                            class617.field8919 = null;
                            return true;
                        } else {
                            class587.field8520 = var104;
                            class11[] var105 = new class11[100];
                            for (int var106 = 0; ~var106 > ~class587.field8520; ++var106) {
                                var105[var106] = new class11();
                                var105[var106].field280 = class389.field5816.method3145((byte) -121);
                                boolean var112 = ~class389.field5816.method3115(arg0 ^ -35665) == -2;
                                if (!var112) {
                                    var105[var106].field275 = var105[var106].field280;
                                } else {
                                    var105[var106].field275 = class389.field5816.method3145((byte) -121);
                                }
                                var105[var106].field270 = class247.method1506(var105[var106].field275, false);
                                var105[var106].field271 = class389.field5816.method3169(26488);
                                var105[var106].field279 = class389.field5816.method3128(32767);
                                var105[var106].field274 = class389.field5816.method3145((byte) -121);
                                if (var105[var106].field275.equals(class321.field4681.field1094)) {
                                    class74.field1158 = var105[var106].field279;
                                }
                            }
                            boolean var107 = false;
                            int var108 = class587.field8520;
                            while (~var108 < -1) {
                                --var108;
                                boolean var109 = true;
                                for (int var110 = 0; var110 < var108; ++var110) {
                                    if (var105[var110].field270.compareTo(var105[var110 + 1].field270) > 0) {
                                        class11 var111 = var105[var110];
                                        var105[var110] = var105[var110 + 1];
                                        var105[var110 + 1] = var111;
                                        var109 = false;
                                    }
                                }
                                if (var109) {
                                    break;
                                }
                            }
                            class451.field6509 = var105;
                            class617.field8919 = null;
                            return true;
                        }
                    }
                } else if (class617.field8919 == class444.field6450) {
                    byte var113 = class389.field5816.method3156(6707);
                    int var114 = class389.field5816.method3168(65536);
                    class308.field4545.method3394(var114, var113, true);
                    class617.field8919 = null;
                    return true;
                } else if (class617.field8919 == class473.field6797) {
                    int var115 = class389.field5816.method3115(29871);
                    if (~class389.field5816.method3115(arg0 ^ -35665) != -1) {
                        --class389.field5816.field7956;
                        class362.field5314[var115] = new class3(class389.field5816);
                    } else {
                        class362.field5314[var115] = new class3();
                    }
                    class617.field8919 = null;
                    class79.field1285 = class351.field5215;
                    return true;
                } else if (class617.field8919 == class606.field8761) {
                    class308.field4545.method3393(78);
                    class572.field8306 += 32;
                    class617.field8919 = null;
                    return true;
                } else if (class617.field8919 == class248.field3273) {
                    int var116 = class389.field5816.method3166((byte) -99);
                    int var117 = class389.field5816.method3160(false);
                    int var118 = class389.field5816.method3117(-76104736);
                    class573.field8320[var116] = var117;
                    class457.field6606[var116] = var118;
                    class478.field6838[var116] = 1;
                    int var119 = class434.field6287[var116] + -1;
                    for (int var120 = 0; ~var120 > ~var119; ++var120) {
                        if (class216.field2886[var120] <= var117) {
                            class478.field6838[var116] = var120 - -2;
                        }
                    }
                    class520.field7296[class425.method2563(class549.field8077++, 31)] = var116;
                    class617.field8919 = null;
                    return true;
                } else if (class617.field8919 == class582.field8463) {
                    int var121 = class389.field5816.method3169(arg0 + 92024);
                    int var122 = class389.field5816.method3147(-2);
                    int var123 = class389.field5816.method3116(arg0 + 65415);
                    int var124 = class389.field5816.method3118(false);
                    if (class612.method3484(var121, (byte) -98)) {
                        class8.method46(108, var124, 5, var122, var123);
                    }
                    class617.field8919 = null;
                    return true;
                } else if (class617.field8919 == class436.field6374) {
                    int var125 = class389.field5816.method3172(32122);
                    int var126 = class389.field5816.method3172(32122);
                    int var127 = class389.field5816.method3141(4);
                    int var128 = class389.field5816.method3116(-123);
                    if (class612.method3484(var128, (byte) 52)) {
                        class164.method1156(var127, arg0 ^ 65535, (var125 << 16) + var126);
                    }
                    class617.field8919 = null;
                    return true;
                } else if (class617.field8919 == class314.field4597) {
                    int var129 = class389.field5816.method3172(32122);
                    int var130 = class389.field5816.method3147(-2);
                    int var131 = class389.field5816.method3169(26488);
                    if (class612.method3484(var131, (byte) -108)) {
                        class460.method2682(var130, var129, 0);
                    }
                    class617.field8919 = null;
                    return true;
                } else if (class617.field8919 == class18.field358) {
                    int var132 = class389.field5816.method3166((byte) -71);
                    int var133 = class389.field5816.method3117(-76104736);
                    if (var132 == 255) {
                        var133 = -1;
                        var132 = -1;
                    }
                    class542.method3186(var132, 15, var133);
                    class617.field8919 = null;
                    return true;
                } else if (class617.field8919 == class30.field508) {
                    int var134 = class389.field5816.method3147(-2);
                    int var135 = class389.field5816.method3116(26);
                    int var136 = class389.field5816.method3137(15511);
                    int var137 = class389.field5816.method3137(arg0 + 81047);
                    if (class612.method3484(var135, (byte) -117)) {
                        class315.method1958(11, var134, var137, var136);
                    }
                    class617.field8919 = null;
                    return true;
                } else if (class617.field8919 == class556.field8167) {
                    int var138 = class389.field5816.method3172(arg0 + 97658);
                    if (~var138 == -65536) {
                        var138 = -1;
                    }
                    int var139 = class389.field5816.method3118(false);
                    int var140 = class389.field5816.method3169(arg0 ^ -39048);
                    if (class612.method3484(var140, (byte) -111)) {
                        class457.method2673(114, var139, var138);
                    }
                    class617.field8919 = null;
                    return true;
                } else if (class617.field8919 == class236.field3098) {
                    int var141 = class389.field5816.method3172(arg0 ^ -33414);
                    int var142 = class389.field5816.method3172(arg0 ^ -33414);
                    int var143 = class389.field5816.method3169(26488);
                    int var144 = class389.field5816.method3117(-76104736);
                    int var145 = class389.field5816.method3160(false);
                    boolean var146 = (128 & var144) != 0;
                    if (~(var145 >> 30) == -1) {
                        if (var145 >> 29 == 0) {
                            if (~(var145 >> 28) != -1) {
                                int var147 = var145 & 65535;
                                class71 var148;
                                if (~class478.field6850 != ~var147) {
                                    var148 = class35.field551[var147];
                                } else {
                                    var148 = class321.field4681;
                                }
                                if (var148 != null) {
                                    if (~var141 == -65536) {
                                        var141 = -1;
                                    }
                                    boolean var149 = true;
                                    int var150 = var146 ? var148.field7353 : var148.field7360;
                                    if (var141 != -1 && ~var150 != 0) {
                                        if (~var141 == ~var150) {
                                            class525 var151 = class134.field1945.method3082((byte) 50, var141);
                                            if (var151.field7470 && ~var151.field7457 != 0) {
                                                class47 var152 = class203.field2769.method2971(-40, var151.field7457);
                                                int var153 = var152.field725;
                                                if (~var153 != -1 && ~var153 != -3) {
                                                    if (var153 == 1) {
                                                        var149 = true;
                                                    }
                                                } else {
                                                    var149 = false;
                                                }
                                            }
                                        } else {
                                            class525 var154 = class134.field1945.method3082((byte) 50, var141);
                                            class525 var155 = class134.field1945.method3082((byte) 50, var150);
                                            if (~var154.field7457 != 0 && ~var155.field7457 != 0) {
                                                class47 var156 = class203.field2769.method2971(-40, var154.field7457);
                                                class47 var157 = class203.field2769.method2971(-46, var155.field7457);
                                                if (var157.field742 > var156.field742) {
                                                    var149 = false;
                                                }
                                            }
                                        }
                                    }
                                    if (var149) {
                                        if (!var146) {
                                            var148.field7360 = var141;
                                            var148.field7380 = var144 & 7;
                                            var148.field7401 = class45.field685 + var142;
                                            var148.field7402 = 0;
                                            var148.field7407 = 1;
                                            var148.field7347 = var143;
                                            var148.field7358 = 0;
                                            if (~var148.field7401 < ~class45.field685) {
                                                var148.field7358 = -1;
                                            }
                                            if (~var148.field7360 == -65536) {
                                                var148.field7360 = -1;
                                            }
                                            if (var148.field7360 != -1 && ~class45.field685 == ~var148.field7401) {
                                                int var158 = class134.field1945.method3082((byte) 50, var148.field7360).field7457;
                                                if (var158 != -1) {
                                                    class47 var159 = class203.field2769.method2971(-56, var158);
                                                    if (var159 != null && var159.field732 != null && !var148.field7372) {
                                                        class620.method3567(var148, 0, var159, (byte) -72);
                                                    }
                                                }
                                            }
                                        } else {
                                            var148.field7375 = var143;
                                            var148.field7331 = 0;
                                            var148.field7385 = var144 & 7;
                                            var148.field7348 = class45.field685 + var142;
                                            var148.field7353 = var141;
                                            var148.field7388 = 0;
                                            var148.field7393 = 1;
                                            if (var148.field7353 == 65535) {
                                                var148.field7353 = -1;
                                            }
                                            if (~var148.field7348 < ~class45.field685) {
                                                var148.field7388 = -1;
                                            }
                                            if (var148.field7353 != -1 && class45.field685 == var148.field7348) {
                                                int var160 = class134.field1945.method3082((byte) 50, var148.field7353).field7457;
                                                if (~var160 != 0) {
                                                    class47 var161 = class203.field2769.method2971(-80, var160);
                                                    if (var161 != null && var161.field732 != null && !var148.field7372) {
                                                        class620.method3567(var148, 0, var161, (byte) -51);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            int var162 = 65535 & var145;
                            class177 var163 = (class177) class271.field3550.method2002((byte) -127, (long) var162);
                            if (var163 != null) {
                                class53 var164 = var163.field2476;
                                if (var141 == 65535) {
                                    var141 = -1;
                                }
                                boolean var165 = true;
                                int var166 = !var146 ? var164.field7360 : var164.field7353;
                                if (~var141 != 0 && ~var166 != 0) {
                                    if (var141 != var166) {
                                        class525 var167 = class134.field1945.method3082((byte) 50, var141);
                                        class525 var168 = class134.field1945.method3082((byte) 50, var166);
                                        if (~var167.field7457 != 0 && ~var168.field7457 != 0) {
                                            class47 var169 = class203.field2769.method2971(-36, var167.field7457);
                                            class47 var170 = class203.field2769.method2971(-67, var168.field7457);
                                            if (~var169.field742 > ~var170.field742) {
                                                var165 = false;
                                            }
                                        }
                                    } else {
                                        class525 var171 = class134.field1945.method3082((byte) 50, var141);
                                        if (var171.field7470 && ~var171.field7457 != 0) {
                                            class47 var172 = class203.field2769.method2971(-28, var171.field7457);
                                            int var173 = var172.field725;
                                            if (~var173 != -1 && ~var173 != -3) {
                                                if (var173 == 1) {
                                                    var165 = true;
                                                }
                                            } else {
                                                var165 = false;
                                            }
                                        }
                                    }
                                }
                                if (var165) {
                                    if (var146) {
                                        var164.field7393 = 1;
                                        var164.field7385 = var144 & 7;
                                        var164.field7348 = class45.field685 - -var142;
                                        var164.field7375 = var143;
                                        var164.field7331 = 0;
                                        var164.field7388 = 0;
                                        var164.field7353 = var141;
                                        if (class45.field685 < var164.field7348) {
                                            var164.field7388 = -1;
                                        }
                                        if (var164.field7353 != -1 && ~class45.field685 == ~var164.field7348) {
                                            int var174 = class134.field1945.method3082((byte) 50, var164.field7353).field7457;
                                            if (~var174 != 0) {
                                                class47 var175 = class203.field2769.method2971(arg0 ^ 65504, var174);
                                                if (var175 != null && var175.field732 != null && !var164.field7372) {
                                                    class620.method3567(var164, 0, var175, (byte) -111);
                                                }
                                            }
                                        }
                                    } else {
                                        var164.field7401 = class45.field685 + var142;
                                        var164.field7407 = 1;
                                        var164.field7358 = 0;
                                        var164.field7402 = 0;
                                        var164.field7360 = var141;
                                        var164.field7380 = var144 & 7;
                                        var164.field7347 = var143;
                                        if (~var164.field7401 < ~class45.field685) {
                                            var164.field7358 = -1;
                                        }
                                        if (var164.field7360 != -1 && ~class45.field685 == ~var164.field7401) {
                                            int var176 = class134.field1945.method3082((byte) 50, var164.field7360).field7457;
                                            if (~var176 != 0) {
                                                class47 var177 = class203.field2769.method2971(-47, var176);
                                                if (var177 != null && var177.field732 != null && !var164.field7372) {
                                                    class620.method3567(var164, 0, var177, (byte) -89);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        int var178 = (1030178009 & var145) >> 28;
                        int var179 = (16383 & var145 >> 14) + -class397.field6005;
                        int var180 = (var145 & 16383) + -class403.field6049;
                        if (~var179 <= -1 && ~var180 <= -1 && class72.field1144 > var179 && ~var180 > ~class668.field9444) {
                            int var181 = var179 * 512 + 256;
                            int var182 = var180 * 512 + 256;
                            int var183 = var178;
                            if (~var178 > -4 && class125.method898(-74, var179, var180)) {
                                var183 = var178 + 1;
                            }
                            class537 var184 = new class537(var141, 0, class45.field685, var178, var183, var181, -var143 + class504.method2870((byte) -123, var182, var181, var178), var182, var179, var179, var180, var180, 7 & var144);
                            class547.field8071.method1909(new class209(var184), (byte) -81);
                        }
                    }
                    class617.field8919 = null;
                    return true;
                } else if (class617.field8919 == class544.field8035) {
                    class181.method1219(true, class520.field7285);
                    class617.field8919 = null;
                    return true;
                } else if (class617.field8919 == class300.field4398) {
                    int var185 = class389.field5816.method3172(32122);
                    String var186 = class389.field5816.method3145((byte) -121);
                    int var187 = class389.field5816.method3118(false);
                    if (class612.method3484(var185, (byte) -119)) {
                        class531.method3077(var187, var186, arg0 + 47074);
                    }
                    class617.field8919 = null;
                    return true;
                } else if (class617.field8919 == class221.field2930) {
                    class181.method1219(true, class40.field599);
                    class617.field8919 = null;
                    return true;
                } else if (class617.field8919 == class264.field3444) {
                    int var188 = class389.field5816.method3168(65536);
                    int var189 = class389.field5816.method3118(false);
                    int var190 = class389.field5816.method3172(arg0 + 97658);
                    if (class612.method3484(var190, (byte) 111)) {
                        class677.method3804(true, var189, var188);
                    }
                    class617.field8919 = null;
                    return true;
                } else if (class617.field8919 == class509.field7180) {
                    boolean var191 = ~class389.field5816.method3115(29871) == -2;
                    String var192 = class389.field5816.method3145((byte) -121);
                    String var193 = var192;
                    if (var191) {
                        var193 = class389.field5816.method3145((byte) -121);
                    }
                    long var194 = class389.field5816.method3165(arg0 ^ -65498);
                    long var196 = (long) class389.field5816.method3169(26488);
                    long var198 = (long) class389.field5816.method3154((byte) -38);
                    int var200 = class389.field5816.method3115(29871);
                    long var201 = (var196 << 32) + var198;
                    boolean var203 = false;
                    int var204 = 0;
                    while (true) {
                        if (~var204 <= -101) {
                            if (~var200 >= -2) {
                                if ((!class379.field5684 || class621.field8993) && !class398.field6008) {
                                    if (class35.method209(var193, -127)) {
                                        var203 = true;
                                    }
                                } else {
                                    var203 = true;
                                }
                            }
                            break;
                        }
                        if (class252.field3299[var204] == var201) {
                            var203 = true;
                            break;
                        }
                        ++var204;
                    }
                    if (!var203 && class647.field9307 == 0) {
                        class252.field3299[class392.field5934] = var201;
                        class392.field5934 = (class392.field5934 + 1) % 100;
                        String var205 = class289.method1787(class285.method1686((byte) -40, class389.field5816), arg0 ^ 65421);
                        if (var200 != 2 && ~var200 != -4) {
                            if (~var200 != -2) {
                                class408.method2504(var192, 0, var193, -1, 9, var205, class629.method3622(var194, 4), var192, 0);
                            } else {
                                class408.method2504(var192, 0, "<img=0>" + var193, -1, 9, var205, class629.method3622(var194, arg0 ^ -65532), "<img=0>" + var192, 0);
                            }
                        } else {
                            class408.method2504(var192, 0, "<img=1>" + var193, -1, 9, var205, class629.method3622(var194, arg0 + 65540), "<img=1>" + var192, arg0 + 65536);
                        }
                    }
                    class617.field8919 = null;
                    return true;
                } else if (class617.field8919 == class198.field2709) {
                    int var206 = class389.field5816.method3169(26488);
                    class71 var207;
                    if (class478.field6850 != var206) {
                        var207 = class35.field551[var206];
                    } else {
                        var207 = class321.field4681;
                    }
                    if (var207 == null) {
                        class617.field8919 = null;
                        return true;
                    } else {
                        int var208 = class389.field5816.method3169(26488);
                        int var209 = class389.field5816.method3115(29871);
                        boolean var210 = (var208 & 32768) != 0;
                        if (var207.field1094 != null && var207.field1105 != null) {
                            boolean var211 = false;
                            if (~var209 >= -2) {
                                if (!var210 && (class379.field5684 && !class621.field8993 || class398.field6008)) {
                                    var211 = true;
                                } else if (class35.method209(var207.field1094, 88)) {
                                    var211 = true;
                                }
                            }
                            if (!var211 && class647.field9307 == 0) {
                                int var212 = -1;
                                String var213;
                                if (!var210) {
                                    var213 = class289.method1787(class285.method1686((byte) -51, class389.field5816), -89);
                                } else {
                                    var208 &= 32767;
                                    class510 var214 = class479.method2746(100, class389.field5816);
                                    var212 = var214.field7198;
                                    var213 = var214.field7195.method1345((byte) -87, class389.field5816);
                                }
                                var207.field7362 = var213.trim();
                                var207.field7386 = 150;
                                var207.field7410 = 255 & var208;
                                var207.field7416 = var208 >> 8;
                                int var215;
                                if (var209 != 1 && ~var209 != -3) {
                                    var215 = var210 ? 17 : 2;
                                } else {
                                    var215 = !var210 ? 1 : 17;
                                }
                                if (var209 != 2) {
                                    if (var209 != 1) {
                                        class408.method2504(var207.field1106, 0, var207.method413(false, 0), var212, var215, var213, (String) null, var207.method417(true, true), 0);
                                    } else {
                                        class408.method2504(var207.field1106, 0, "<img=0>" + var207.method413(false, 0), var212, var215, var213, (String) null, "<img=0>" + var207.method417(true, true), 0);
                                    }
                                } else {
                                    class408.method2504(var207.field1106, 0, "<img=1>" + var207.method413(false, 0), var212, var215, var213, (String) null, "<img=1>" + var207.method417(true, true), arg0 ^ -65536);
                                }
                            }
                        }
                        class617.field8919 = null;
                        return true;
                    }
                } else if (class617.field8919 == class603.field8701) {
                    class488.field6930 = class389.field5816.method3166((byte) -43);
                    class471.field6784 = class389.field5816.method3128(arg0 ^ -32769) << 3;
                    class350.field5180 = class389.field5816.method3128(arg0 + 98303) << 3;
                    while (class297.field4376 > class389.field5816.field7956) {
                        class2 var216 = class687.method3847(112)[class389.field5816.method3115(29871)];
                        class181.method1219(true, var216);
                    }
                    class617.field8919 = null;
                    return true;
                } else if (class617.field8919 == class539.field7908) {
                    class433.method2576(true);
                    class617.field8919 = null;
                    return false;
                } else if (class617.field8919 == class448.field6494) {
                    int var217 = class389.field5816.method3160(false);
                    class665.field9442 = class61.field978.method1410(var217, (byte) -103);
                    class617.field8919 = null;
                    return true;
                } else if (class617.field8919 == class273.field3563) {
                    int var218 = class389.field5816.method3116(arg0 ^ -65459);
                    int var219 = class389.field5816.method3168(arg0 ^ -131072);
                    int var220 = class389.field5816.method3169(26488);
                    int var221 = class389.field5816.method3147(-2);
                    int var222 = class389.field5816.method3172(32122);
                    if (class612.method3484(var220, (byte) 0)) {
                        class8.method46(107, var221, 7, var219, var222 | var218 << 16);
                    }
                    class617.field8919 = null;
                    return true;
                } else if (class617.field8919 == class279.field3690) {
                    int var223 = class389.field5816.method3116(70);
                    int var224 = class389.field5816.method3116(-99);
                    int var225 = class389.field5816.method3116(-119);
                    int var226 = class389.field5816.method3160(false);
                    int var227 = class389.field5816.method3169(arg0 + 92024);
                    if (class612.method3484(var227, (byte) -111)) {
                        class647.method3683(var224, var225, var226, arg0 ^ -39898, var223);
                    }
                    class617.field8919 = null;
                    return true;
                } else if (class617.field8919 == class338.field4913) {
                    int var228 = class389.field5816.method3168(65536);
                    if (var228 == 65535) {
                        var228 = -1;
                    }
                    int var229 = class389.field5816.method3166((byte) -95);
                    int var230 = class389.field5816.method3115(29871);
                    String var231 = class389.field5816.method3145((byte) -121);
                    if (var230 >= 1 && var230 <= 8) {
                        if (var231.equalsIgnoreCase("null")) {
                            var231 = null;
                        }
                        class677.field9580[var230 + -1] = var231;
                        class705.field9986[var230 + -1] = var228;
                        class350.field5181[var230 + -1] = ~var229 == -1;
                    }
                    class617.field8919 = null;
                    return true;
                } else if (class617.field8919 == class357.field5274) {
                    class453.method2657(class61.field978, class389.field5816, (byte) 42, class297.field4376);
                    class617.field8919 = null;
                    return true;
                } else if (class625.field9046 == class617.field8919) {
                    int var232 = class389.field5816.method3109(-2);
                    int var233 = class389.field5816.method3160(false);
                    int var234 = class389.field5816.method3115(29871);
                    String var235 = "";
                    String var236 = var235;
                    if (~(1 & var234) != -1) {
                        var235 = class389.field5816.method3145((byte) -121);
                        if ((2 & var234) != 0) {
                            var236 = class389.field5816.method3145((byte) -121);
                        } else {
                            var236 = var235;
                        }
                    }
                    String var237 = class389.field5816.method3145((byte) -121);
                    if (var232 == 99) {
                        class600.method3415(var237, true);
                    } else {
                        if (!var236.equals("") && class35.method209(var236, -116)) {
                            class617.field8919 = null;
                            return true;
                        }
                        class46.method275(var236, var232, var237, var235, 255, var235, var233);
                    }
                    class617.field8919 = null;
                    return true;
                } else if (class617.field8919 == class61.field969) {
                    class617.field8919 = null;
                    class516.field7245 = class351.field5215;
                    class372.field5507 = 1;
                    return true;
                } else if (class617.field8919 == class47.field733) {
                    class181.method1219(true, class688.field9714);
                    class617.field8919 = null;
                    return true;
                } else if (class617.field8919 == class305.field4523) {
                    int var238 = class389.field5816.method3172(32122);
                    int var239 = class389.field5816.method3160(false);
                    if (class612.method3484(var238, (byte) 86)) {
                        if (~var239 == 0) {
                            class250.field3280 = -1;
                            class150.field2120 = -1;
                        } else {
                            int var240 = 16383 & var239 >> 14;
                            int var241 = var239 & 16383;
                            int var242 = var240 - class397.field6005;
                            int var243 = var241 - class403.field6049;
                            if (var242 < 0) {
                                var242 = 0;
                            } else if (~class72.field1144 >= ~var242) {
                                var242 = class72.field1144;
                            }
                            class250.field3280 = (var242 << 9) - -256;
                            if (var243 < 0) {
                                var243 = 0;
                            } else if (var243 >= class668.field9444) {
                                var243 = class668.field9444;
                            }
                            class150.field2120 = (var243 << 9) + 256;
                        }
                    }
                    class617.field8919 = null;
                    return true;
                } else if (class617.field8919 == class420.field6184) {
                    int var244 = class389.field5816.method3141(arg0 ^ -65532);
                    int var245 = class389.field5816.method3116(arg0 + 65636);
                    if (class612.method3484(var245, (byte) -123)) {
                        class8.method46(59, var244, 5, 0, class478.field6850);
                    }
                    class617.field8919 = null;
                    return true;
                } else if (class617.field8919 == class347.field5151) {
                    boolean var246 = class389.field5816.method3115(29871) == 1;
                    String var247 = class389.field5816.method3145((byte) -121);
                    String var248 = var247;
                    if (var246) {
                        var248 = class389.field5816.method3145((byte) -121);
                    }
                    long var249 = (long) class389.field5816.method3169(arg0 + 92024);
                    long var251 = (long) class389.field5816.method3154((byte) -29);
                    int var253 = class389.field5816.method3115(29871);
                    long var254 = (var249 << 32) + var251;
                    boolean var256 = false;
                    int var257 = 0;
                    while (true) {
                        if (var257 >= 100) {
                            if (~var253 >= -2) {
                                if ((!class379.field5684 || class621.field8993) && !class398.field6008) {
                                    if (class35.method209(var248, -3)) {
                                        var256 = true;
                                    }
                                } else {
                                    var256 = true;
                                }
                            }
                            break;
                        }
                        if (~class252.field3299[var257] == ~var254) {
                            var256 = true;
                            break;
                        }
                        ++var257;
                    }
                    if (!var256 && class647.field9307 == 0) {
                        class252.field3299[class392.field5934] = var254;
                        class392.field5934 = (class392.field5934 + 1) % 100;
                        String var258 = class289.method1787(class285.method1686((byte) -100, class389.field5816), -80);
                        if (var253 == 2) {
                            class408.method2504(var247, 0, "<img=1>" + var248, -1, 7, var258, (String) null, "<img=1>" + var247, 0);
                        } else if (var253 == 1) {
                            class408.method2504(var247, 0, "<img=0>" + var248, -1, 7, var258, (String) null, "<img=0>" + var247, 0);
                        } else {
                            class408.method2504(var247, 0, var248, -1, 3, var258, (String) null, var247, 0);
                        }
                    }
                    class617.field8919 = null;
                    return true;
                } else if (class617.field8919 == class492.field6995) {
                    class215.field2881 = class389.field5816.method3129(65);
                    class617.field8919 = null;
                    class608.field8809 = class351.field5215;
                    return true;
                } else if (class617.field8919 == class28.field489) {
                    class564.field8248 = class389.field5816.method3115(29871);
                    for (int var259 = 0; class564.field8248 > var259; ++var259) {
                        class115.field1722[var259] = class389.field5816.method3145((byte) -121);
                        class268.field3501[var259] = class389.field5816.method3145((byte) -121);
                        if (class268.field3501[var259].equals("")) {
                            class268.field3501[var259] = class115.field1722[var259];
                        }
                        class203.field2774[var259] = class389.field5816.method3145((byte) -121);
                        class656.field9378[var259] = class389.field5816.method3145((byte) -121);
                        if (class656.field9378[var259].equals("")) {
                            class656.field9378[var259] = class203.field2774[var259];
                        }
                        class185.field2520[var259] = false;
                    }
                    class516.field7245 = class351.field5215;
                    class617.field8919 = null;
                    return true;
                } else if (class617.field8919 == class544.field8039) {
                    int var260 = class389.field5816.method3160(false);
                    int var261 = class389.field5816.method3169(arg0 ^ -39048);
                    class308.field4545.method3396(var260, (byte) 109, var261);
                    class617.field8919 = null;
                    return true;
                } else if (class617.field8919 == class410.field6102) {
                    int var262 = class389.field5816.method3160(false);
                    int var263 = class389.field5816.method3168(65536);
                    class308.field4545.method3394(var263, var262, true);
                    class617.field8919 = null;
                    return true;
                } else if (class617.field8919 == class280.field3698) {
                    class572.field8305 = class367.method2247(-5630, class389.field5816.method3115(arg0 ^ -35665));
                    class617.field8919 = null;
                    return true;
                } else if (class617.field8919 == class587.field8513) {
                    int var264 = class389.field5816.method3169(26488);
                    String var265 = class389.field5816.method3145((byte) -121);
                    Object[] var266 = new Object[1 + var265.length()];
                    for (int var267 = var265.length() - 1; ~var267 <= -1; --var267) {
                        if (var265.charAt(var267) != 's') {
                            var266[var267 + 1] = new Integer(class389.field5816.method3160(false));
                        } else {
                            var266[var267 + 1] = class389.field5816.method3145((byte) -121);
                        }
                    }
                    var266[0] = new Integer(class389.field5816.method3160(false));
                    if (class612.method3484(var264, (byte) 34)) {
                        class303 var268 = new class303();
                        var268.field4500 = var266;
                        class195.method1270(var268);
                    }
                    class617.field8919 = null;
                    return true;
                } else if (class617.field8919 == class454.field6556) {
                    byte var269 = class389.field5816.method3128(32767);
                    int var270 = class389.field5816.method3116(64);
                    int var271 = class389.field5816.method3169(26488);
                    if (class612.method3484(var270, (byte) 6)) {
                        class677.method3804(true, var269, var271);
                    }
                    class617.field8919 = null;
                    return true;
                } else if (class617.field8919 == class533.field7837) {
                    class350.field5180 = class389.field5816.method3156(6707) << 3;
                    class488.field6930 = class389.field5816.method3115(29871);
                    class471.field6784 = class389.field5816.method3156(6707) << 3;
                    class617.field8919 = null;
                    return true;
                } else if (class617.field8919 == class342.field5063) {
                    class181.method1219(true, class416.field6151);
                    class617.field8919 = null;
                    return true;
                } else if (class635.field9154 == class617.field8919) {
                    if (~class567.field8270 != 0) {
                        class572.method3283((byte) -122, 0, class567.field8270);
                    }
                    class617.field8919 = null;
                    return true;
                } else if (class617.field8919 == class132.field1914) {
                    if (class348.field5160 != null) {
                        class378.method2336(-1, false, (byte) -113, -1, class335.field4872.field9474);
                    }
                    byte[] var272 = new byte[class297.field4376];
                    class389.field5816.method1944(0, arg0 + 90102, class297.field4376, var272);
                    String var273 = class554.method3225(119, 0, var272, class297.field4376);
                    class86.method487(class61.field978, true, 2, var273, class62.field996 == 1);
                    class617.field8919 = null;
                    return true;
                } else if (class617.field8919 == class218.field2905) {
                    class471.field6784 = class389.field5816.method3128(arg0 ^ -32769) << 3;
                    class350.field5180 = class389.field5816.method3128(32767) << 3;
                    class488.field6930 = class389.field5816.method3139(113);
                    for (class668 var274 = (class668) class86.field1336.method1993(arg0 + 65424); var274 != null; var274 = (class668) class86.field1336.method1997(9831)) {
                        int var276 = (int) (var274.field5740 >> 28 & 3L);
                        int var277 = (int) (var274.field5740 & 16383L);
                        int var278 = -class397.field6005 + var277;
                        int var279 = (int) (16383L & var274.field5740 >> 14);
                        int var280 = -class403.field6049 + var279;
                        if (~class488.field6930 == ~var276 && ~class471.field6784 >= ~var278 && var278 < class471.field6784 + 8 && var280 >= class350.field5180 && class350.field5180 + 8 > var280) {
                            var274.method2360((byte) 66);
                            if (~var278 <= -1 && ~var280 <= -1 && ~var278 > ~class72.field1144 && var280 < class668.field9444) {
                                class408.method2505(class488.field6930, var280, var278, (byte) 91);
                            }
                        }
                    }
                    for (class285 var275 = (class285) class556.field8164.method1904(false); var275 != null; var275 = (class285) class556.field8164.method1901(105)) {
                        if (~var275.field3808 <= ~class471.field6784 && class471.field6784 + 8 > var275.field3808 && class350.field5180 <= var275.field3802 && var275.field3802 < class350.field5180 + 8 && class488.field6930 == var275.field3803) {
                            var275.field3797 = 0;
                        }
                    }
                    class617.field8919 = null;
                    return true;
                } else if (class617.field8919 == class379.field5698) {
                    String var281 = class389.field5816.method3145((byte) -121);
                    int var282 = class389.field5816.method3172(32122);
                    int var283 = class389.field5816.method3168(65536);
                    if (class612.method3484(var283, (byte) 10)) {
                        class203.method1314(var281, 2, var282);
                    }
                    class617.field8919 = null;
                    return true;
                } else if (class617.field8919 == class533.field7840) {
                    int var284 = class389.field5816.method3116(79);
                    int var285 = class389.field5816.method3117(arg0 + -76039200);
                    int var286 = class389.field5816.method3172(32122);
                    if (class612.method3484(var286, (byte) 104)) {
                        if (var285 == 2) {
                            class69.method404(-31369);
                        }
                        class567.field8270 = var284;
                        class417.method2533(var284, 0);
                        class537.method3101(false, 3531);
                        class195.method1273(class567.field8270);
                        for (int var287 = 0; ~var287 > -101; ++var287) {
                            class394.field5969[var287] = true;
                        }
                    }
                    class617.field8919 = null;
                    return true;
                } else if (class617.field8919 == class160.field2279) {
                    class127.method906((byte) 122);
                    class617.field8919 = null;
                    return true;
                } else if (class617.field8919 == class238.field3134) {
                    boolean var288 = class389.field5816.method3166((byte) -47) == 1;
                    int var289 = class389.field5816.method3172(arg0 ^ -33414);
                    if (class612.method3484(var289, (byte) 121)) {
                        class327.field4736 = var288;
                    }
                    class617.field8919 = null;
                    return true;
                } else if (class617.field8919 == class131.field1899) {
                    int var290 = class389.field5816.method3172(32122);
                    int var291 = class389.field5816.method3172(32122);
                    if (~var291 == -65536) {
                        var291 = -1;
                    }
                    int var292 = class389.field5816.method3116(arg0 ^ -65509);
                    int var293 = class389.field5816.method3147(-2);
                    int var294 = class389.field5816.method3116(92);
                    if (var294 == 65535) {
                        var294 = -1;
                    }
                    if (class612.method3484(var290, (byte) 76)) {
                        for (int var295 = var294; ~var291 <= ~var295; ++var295) {
                            long var296 = ((long) var293 << 32) + (long) var295;
                            class78 var298 = (class78) class584.field8483.method2002((byte) -113, var296);
                            class78 var299;
                            if (var298 == null) {
                                if (~var295 != 0) {
                                    var299 = new class78(0, var292);
                                } else {
                                    var299 = new class78(class705.method3944(var293, (byte) 107).field128.field1275, var292);
                                }
                            } else {
                                var299 = new class78(var298.field1275, var292);
                                var298.method2360((byte) 66);
                            }
                            class584.field8483.method2001(-117, var299, var296);
                        }
                    }
                    class617.field8919 = null;
                    return true;
                } else if (class617.field8919 == class471.field6768) {
                    int var300 = class389.field5816.method3168(65536);
                    int var301 = class389.field5816.method3168(arg0 + 131072);
                    int var302 = class389.field5816.method3172(32122);
                    if (class612.method3484(var300, (byte) 69)) {
                        class362.method2223(0, var301, var302, 1);
                    }
                    class617.field8919 = null;
                    return true;
                } else if (class617.field8919 == class445.field6459) {
                    int var303 = class389.field5816.method3166((byte) -99);
                    int var304 = class389.field5816.method3117(arg0 + -76039200);
                    int var305 = class389.field5816.method3168(arg0 + 131072);
                    if (var305 == 65535) {
                        var305 = -1;
                    }
                    class164.method1159((byte) -120, var304, var303, var305);
                    class617.field8919 = null;
                    return true;
                } else if (class617.field8919 == class526.field7477) {
                    int var306 = class389.field5816.method3134(-82);
                    int var307 = class389.field5816.method3116(36);
                    if (~var307 == -65536) {
                        var307 = -1;
                    }
                    int var308 = class389.field5816.method3115(arg0 + 95407);
                    class223.method1394(var306, arg0 ^ -65446, var308, var307);
                    class617.field8919 = null;
                    return true;
                } else if (class617.field8919 == class291.field4282) {
                    class346.field5110 = class389.field5816.method3115(29871);
                    class608.field8809 = class351.field5215;
                    class617.field8919 = null;
                    return true;
                } else if (class617.field8919 == class581.field8460) {
                    class181.method1219(true, class211.field2850);
                    class617.field8919 = null;
                    return true;
                } else if (class617.field8919 == class524.field7447) {
                    int var309 = class389.field5816.method3169(26488);
                    int var310 = class389.field5816.method3115(29871);
                    int var311 = class389.field5816.method3115(29871);
                    int var312 = class389.field5816.method3169(26488) << 2;
                    int var313 = class389.field5816.method3115(29871);
                    int var314 = class389.field5816.method3115(29871);
                    if (class612.method3484(var309, (byte) 59)) {
                        class653.method3694(var312, var313, var310, var311, 0, var314);
                    }
                    class617.field8919 = null;
                    return true;
                } else if (class701.field9963 == class617.field8919) {
                    int var315 = class389.field5816.method3160(false);
                    int var316 = class389.field5816.method3172(32122);
                    int var317 = class389.field5816.method3169(26488);
                    if (class612.method3484(var316, (byte) -118)) {
                        class250.method1517(0, var315, var317);
                    }
                    class617.field8919 = null;
                    return true;
                } else if (class621.field8987 == class617.field8919) {
                    int var318 = class389.field5816.method3169(26488);
                    if (~var318 == -65536) {
                        var318 = -1;
                    }
                    int var319 = class389.field5816.method3141(4);
                    int var320 = class389.field5816.method3169(26488);
                    int var321 = class389.field5816.method3118(false);
                    if (class612.method3484(var320, (byte) 81)) {
                        class204.method1316(var319, true, var318, var321);
                        class390 var322 = class259.field3355.method2382(var318, (byte) 28);
                        class647.method3683(var322.field5828, var322.field5877, var319, 25638, var322.field5898);
                        class28.method184(var322.field5905, var322.field5891, var319, var322.field5829, 83);
                    }
                    class617.field8919 = null;
                    return true;
                } else if (class617.field8919 == class341.field5056) {
                    int var323 = class389.field5816.method3115(29871);
                    boolean var324 = (1 & var323) == 1;
                    String var325 = class389.field5816.method3145((byte) -121);
                    String var326 = class389.field5816.method3145((byte) -121);
                    if (var326.equals("")) {
                        var326 = var325;
                    }
                    String var327 = class389.field5816.method3145((byte) -121);
                    String var328 = class389.field5816.method3145((byte) -121);
                    if (var328.equals("")) {
                        var328 = var327;
                    }
                    if (!var324) {
                        class115.field1722[class564.field8248] = var325;
                        class268.field3501[class564.field8248] = var326;
                        class203.field2774[class564.field8248] = var327;
                        class656.field9378[class564.field8248] = var328;
                        class185.field2520[class564.field8248] = ~class425.method2563(2, var323) == -3;
                        ++class564.field8248;
                    } else {
                        for (int var329 = 0; class564.field8248 > var329; ++var329) {
                            if (class268.field3501[var329].equals(var328)) {
                                class115.field1722[var329] = var325;
                                class268.field3501[var329] = var326;
                                class203.field2774[var329] = var327;
                                class656.field9378[var329] = var328;
                                break;
                            }
                        }
                    }
                    class516.field7245 = class351.field5215;
                    class617.field8919 = null;
                    return true;
                } else if (class617.field8919 == class244.field3235) {
                    class65.method395(false, 72);
                    class617.field8919 = null;
                    return false;
                } else if (class617.field8919 == class288.field4177) {
                    int var330 = class389.field5816.method3160(false);
                    int var331 = class389.field5816.method3168(65536);
                    if (var331 == 65535) {
                        var331 = -1;
                    }
                    int var332 = class389.field5816.method3169(26488);
                    if (class612.method3484(var332, (byte) 21)) {
                        class8.method46(68, var330, 2, -1, var331);
                    }
                    class617.field8919 = null;
                    return true;
                } else if (class617.field8919 == class581.field8453) {
                    class181.method1219(true, class82.field1320);
                    class617.field8919 = null;
                    return true;
                } else if (class617.field8919 == class591.field8589) {
                    class181.method1219(true, class623.field9010);
                    class617.field8919 = null;
                    return true;
                } else if (class617.field8919 == class238.field3131) {
                    class181.method1219(true, class620.field8973);
                    class617.field8919 = null;
                    return true;
                } else if (class617.field8919 == class12.field295) {
                    if (class261.method1566((byte) 5, class264.field3451)) {
                        class149.field2111 = (int) ((float) class389.field5816.method3169(26488) * 2.5F);
                    } else {
                        class149.field2111 = 30 * class389.field5816.method3169(26488);
                    }
                    class608.field8809 = class351.field5215;
                    class617.field8919 = null;
                    return true;
                } else if (class617.field8919 == class327.field4735) {
                    int var333 = class389.field5816.method3172(32122);
                    int var334 = class389.field5816.method3160(false);
                    int var335 = class389.field5816.method3116(arg0 ^ 65422);
                    if (var335 == 65535) {
                        var335 = -1;
                    }
                    if (class612.method3484(var333, (byte) -104)) {
                        class8.method46(110, var334, 1, -1, var335);
                    }
                    class617.field8919 = null;
                    return true;
                } else if (class9.field264 == class617.field8919) {
                    class582.method3342((byte) 98);
                    class617.field8919 = null;
                    return false;
                } else if (class617.field8919 == class158.field2239) {
                    int var336 = class389.field5816.method3166((byte) -84);
                    int var337 = class389.field5816.method3169(arg0 ^ -39048);
                    int[] var338 = new int[4];
                    for (int var339 = 0; ~var339 > -5; ++var339) {
                        var338[var339] = class389.field5816.method3116(arg0 + 65412);
                    }
                    class177 var340 = (class177) class271.field3550.method2002((byte) -127, (long) var337);
                    if (var340 != null) {
                        class652.method3690((byte) 94, var338, var340.field2476, var336);
                    }
                    class617.field8919 = null;
                    return true;
                } else if (class617.field8919 == class481.field6876) {
                    int var341 = class389.field5816.method3169(26488);
                    if (var341 == 65535) {
                        var341 = -1;
                    }
                    int var342 = class389.field5816.method3115(29871);
                    int var343 = class389.field5816.method3169(arg0 ^ -39048);
                    int var344 = class389.field5816.method3115(arg0 ^ -35665);
                    int var345 = class389.field5816.method3169(26488);
                    class612.method3486(var344, var341, var345, (byte) -118, var343, var342);
                    class617.field8919 = null;
                    return true;
                } else if (class617.field8919 == class308.field4546) {
                    boolean var346 = class389.field5816.method3115(29871) == 1;
                    String var347 = class389.field5816.method3145((byte) -121);
                    String var348 = var347;
                    if (var346) {
                        var348 = class389.field5816.method3145((byte) -121);
                    }
                    int var349 = class389.field5816.method3115(arg0 + 95407);
                    int var350 = class389.field5816.method3169(26488);
                    boolean var351 = false;
                    if (~var349 >= -2 && class35.method209(var348, -120)) {
                        var351 = true;
                    }
                    if (!var351 && class647.field9307 == 0) {
                        String var352 = class23.field431.method2749(var350, false).method1345((byte) -63, class389.field5816);
                        if (~var349 != -3) {
                            if (~var349 == -2) {
                                class408.method2504(var347, 0, "<img=0>" + var348, var350, 25, var352, (String) null, "<img=0>" + var347, 0);
                            } else {
                                class408.method2504(var347, 0, var348, var350, 25, var352, (String) null, var347, 0);
                            }
                        } else {
                            class408.method2504(var347, 0, "<img=1>" + var348, var350, 25, var352, (String) null, "<img=1>" + var347, 0);
                        }
                    }
                    class617.field8919 = null;
                    return true;
                } else if (class617.field8919 == class575.field8351) {
                    class454.method2662((byte) -69, class389.field5816.method3145((byte) -121));
                    class617.field8919 = null;
                    return true;
                } else if (class617.field8919 == class232.field3073) {
                    String var353 = class389.field5816.method3145((byte) -121);
                    boolean var354 = ~class389.field5816.method3115(arg0 + 95407) == -2;
                    String var355;
                    if (var354) {
                        var355 = class389.field5816.method3145((byte) -121);
                    } else {
                        var355 = var353;
                    }
                    int var356 = class389.field5816.method3169(26488);
                    byte var357 = class389.field5816.method3128(32767);
                    boolean var358 = false;
                    if (var357 == -128) {
                        var358 = true;
                    }
                    if (!var358) {
                        String var359 = class389.field5816.method3145((byte) -121);
                        class11 var360 = new class11();
                        var360.field280 = var353;
                        var360.field275 = var355;
                        var360.field270 = class247.method1506(var360.field275, false);
                        var360.field271 = var356;
                        var360.field274 = var359;
                        var360.field279 = var357;
                        int var361;
                        for (var361 = class587.field8520 + -1; ~var361 <= -1; --var361) {
                            int var362 = class451.field6509[var361].field270.compareTo(var360.field270);
                            if (var362 == 0) {
                                class451.field6509[var361].field271 = var356;
                                class451.field6509[var361].field279 = var357;
                                class451.field6509[var361].field274 = var359;
                                if (var355.equals(class321.field4681.field1094)) {
                                    class74.field1158 = var357;
                                }
                                class617.field8919 = null;
                                class223.field2953 = class351.field5215;
                                return true;
                            }
                            if (~var362 > -1) {
                                break;
                            }
                        }
                        if (~class587.field8520 <= ~class451.field6509.length) {
                            class617.field8919 = null;
                            return true;
                        }
                        for (int var363 = class587.field8520 + -1; ~var361 > ~var363; --var363) {
                            class451.field6509[var363 + 1] = class451.field6509[var363];
                        }
                        if (~class587.field8520 == -1) {
                            class451.field6509 = new class11[100];
                        }
                        class451.field6509[var361 - -1] = var360;
                        ++class587.field8520;
                        if (var355.equals(class321.field4681.field1094)) {
                            class74.field1158 = var357;
                        }
                    } else {
                        if (class587.field8520 == 0) {
                            class617.field8919 = null;
                            return true;
                        }
                        boolean var364 = false;
                        int var365;
                        for (var365 = 0; class587.field8520 > var365 && (!class451.field6509[var365].field275.equals(var355) || ~class451.field6509[var365].field271 != ~var356); ++var365) {
                        }
                        if (~var365 > ~class587.field8520) {
                            while (class587.field8520 + -1 > var365) {
                                class451.field6509[var365] = class451.field6509[var365 + 1];
                                ++var365;
                            }
                            --class587.field8520;
                            class451.field6509[class587.field8520] = null;
                        }
                    }
                    class223.field2953 = class351.field5215;
                    class617.field8919 = null;
                    return true;
                } else if (class617.field8919 == class160.field2274) {
                    class65.field1038 = class389.field5816.method3115(29871);
                    class617.field8919 = null;
                    return true;
                } else if (class617.field8919 == class595.field8614) {
                    boolean var366 = class389.field5816.method3115(29871) == 1;
                    String var367 = class389.field5816.method3145((byte) -121);
                    String var368 = var367;
                    if (var366) {
                        var368 = class389.field5816.method3145((byte) -121);
                    }
                    long var369 = class389.field5816.method3165(arg0 ^ -65430);
                    long var371 = (long) class389.field5816.method3169(arg0 ^ -39048);
                    long var373 = (long) class389.field5816.method3154((byte) -28);
                    int var375 = class389.field5816.method3115(29871);
                    int var376 = class389.field5816.method3169(26488);
                    long var377 = (var371 << 32) + var373;
                    boolean var379 = false;
                    int var380 = 0;
                    while (true) {
                        if (var380 >= 100) {
                            if (~var375 >= -2 && class35.method209(var368, 29)) {
                                var379 = true;
                            }
                            break;
                        }
                        if (class252.field3299[var380] == var377) {
                            var379 = true;
                            break;
                        }
                        ++var380;
                    }
                    if (!var379 && ~class647.field9307 == -1) {
                        class252.field3299[class392.field5934] = var377;
                        class392.field5934 = (class392.field5934 - -1) % 100;
                        String var381 = class23.field431.method2749(var376, false).method1345((byte) -124, class389.field5816);
                        if (~var375 == -3) {
                            class408.method2504(var367, 0, "<img=1>" + var368, var376, 20, var381, class629.method3622(var369, 4), "<img=1>" + var367, 0);
                        } else if (var375 == 1) {
                            class408.method2504(var367, 0, "<img=0>" + var368, var376, 20, var381, class629.method3622(var369, 4), "<img=0>" + var367, 0);
                        } else {
                            class408.method2504(var367, 0, var368, var376, 20, var381, class629.method3622(var369, 4), var367, 0);
                        }
                    }
                    class617.field8919 = null;
                    return true;
                } else if (class617.field8919 == class398.field6006) {
                    class181.method1219(true, class539.field7909);
                    class617.field8919 = null;
                    return true;
                } else if (class73.field1149 == class617.field8919) {
                    int var382 = class389.field5816.method3115(29871);
                    int var383 = var382 >> 2;
                    int var384 = var382 & 3;
                    int var385 = class540.field7953[var383];
                    int var386 = class389.field5816.method3168(65536);
                    if (~var386 == -65536) {
                        var386 = -1;
                    }
                    int var387 = class389.field5816.method3160(false);
                    int var388 = (1009893549 & var387) >> 28;
                    int var389 = 16383 & var387 >> 14;
                    int var390 = var387 & 16383;
                    int var391 = var389 - class397.field6005;
                    int var392 = var390 - class403.field6049;
                    class319.method1973(var388, var384, var392, var385, var386, arg0 ^ -64536, var391, var383);
                    class617.field8919 = null;
                    return true;
                } else if (class96.field1470 == class617.field8919) {
                    int var393 = class389.field5816.method3141(arg0 ^ -65532);
                    int var394 = class389.field5816.method3112(-149712440);
                    int var395 = class389.field5816.method3168(65536);
                    if (class612.method3484(var395, (byte) 37)) {
                        class200.method1303((byte) 116, var393, var394);
                    }
                    class617.field8919 = null;
                    return true;
                } else if (class617.field8919 == class231.field3063) {
                    String var396 = class389.field5816.method3145((byte) -121);
                    String var397 = class289.method1787(class285.method1686((byte) -99, class389.field5816), 57);
                    class46.method275(var396, 6, var397, var396, 255, var396, 0);
                    class617.field8919 = null;
                    return true;
                } else if (class617.field8919 == class202.field2744) {
                    int var398 = class389.field5816.method3117(-76104736);
                    int var399 = class389.field5816.method3169(26488);
                    boolean var400 = (1 & var398) == 1;
                    class201.method1307((byte) -119, var400, var399);
                    class222.field2942[class425.method2563(31, class324.field4706++)] = var399;
                    class617.field8919 = null;
                    return true;
                } else if (class617.field8919 == class224.field2969) {
                    class238.field3132 = class389.field5816.method3121(2);
                    class379.field5684 = class389.field5816.method3115(29871) == 1;
                    class617.field8919 = null;
                    return true;
                } else if (class617.field8919 == class369.field5474) {
                    int var401 = class389.field5816.method3169(arg0 + 92024);
                    if (~var401 == -65536) {
                        var401 = -1;
                    }
                    int var402 = class389.field5816.method3115(29871);
                    int var403 = class389.field5816.method3169(26488);
                    int var404 = class389.field5816.method3115(29871);
                    class176.method1201(true, var402, -127, var403, 256, var401, var404);
                    class617.field8919 = null;
                    return true;
                } else if (class617.field8919 == class424.field6212) {
                    int var405 = class389.field5816.method3115(arg0 + 95407);
                    int var406 = var405 >> 5;
                    int var407 = 31 & var405;
                    if (~var407 == -1) {
                        class700.field9879[var406] = null;
                        class617.field8919 = null;
                        return true;
                    } else {
                        class14 var408 = new class14();
                        var408.field317 = var407;
                        var408.field312 = class389.field5816.method3115(29871);
                        if (~var408.field312 <= -1 && class519.field7280.length > var408.field312) {
                            if (~var408.field317 != -2 && var408.field317 != 10) {
                                if (~var408.field317 <= -3 && ~var408.field317 >= -7) {
                                    if (var408.field317 == 2) {
                                        var408.field313 = 256;
                                        var408.field321 = 256;
                                    }
                                    if (~var408.field317 == -4) {
                                        var408.field321 = 0;
                                        var408.field313 = 256;
                                    }
                                    if (var408.field317 == 4) {
                                        var408.field313 = 256;
                                        var408.field321 = 512;
                                    }
                                    if (var408.field317 == 5) {
                                        var408.field313 = 0;
                                        var408.field321 = 256;
                                    }
                                    if (~var408.field317 == -7) {
                                        var408.field313 = 512;
                                        var408.field321 = 256;
                                    }
                                    var408.field317 = 2;
                                    var408.field315 = class389.field5816.method3115(29871);
                                    var408.field321 += class389.field5816.method3169(26488) - class397.field6005 << 9;
                                    var408.field313 += class389.field5816.method3169(arg0 + 92024) - class403.field6049 << 9;
                                    var408.field323 = class389.field5816.method3115(29871) << 2;
                                    var408.field311 = class389.field5816.method3169(26488);
                                }
                            } else {
                                var408.field309 = class389.field5816.method3169(26488);
                                class389.field5816.field7956 += 6;
                            }
                            var408.field314 = class389.field5816.method3169(26488);
                            if (~var408.field314 == -65536) {
                                var408.field314 = -1;
                            }
                            class700.field9879[var406] = var408;
                        }
                        class617.field8919 = null;
                        return true;
                    }
                } else if (class617.field8919 == class45.field686) {
                    class181.method1219(true, class303.field4495);
                    class617.field8919 = null;
                    return true;
                } else if (class617.field8919 == class20.field379) {
                    int var409 = class389.field5816.method3169(26488);
                    if (class612.method3484(var409, (byte) 43)) {
                        class474.method2727(122);
                    }
                    class617.field8919 = null;
                    return true;
                } else if (class617.field8919 == class231.field3062) {
                    class365.field5356 = class297.field4376 > 2 ? class389.field5816.method3145((byte) -121) : class279.field3651.method1654(-51, class262.field3401);
                    class132.field1924 = class297.field4376 <= 0 ? -1 : class389.field5816.method3169(arg0 ^ -39048);
                    class617.field8919 = null;
                    if (class132.field1924 == 65535) {
                        class132.field1924 = -1;
                    }
                    return true;
                } else if (class617.field8919 == class112.field1675) {
                    String var410 = class389.field5816.method3145((byte) -121);
                    int var411 = class389.field5816.method3169(26488);
                    String var412 = class23.field431.method2749(var411, false).method1345((byte) -126, class389.field5816);
                    class408.method2504(var410, 0, var410, var411, 19, var412, (String) null, var410, 0);
                    class617.field8919 = null;
                    return true;
                } else if (class9.field262 == class617.field8919) {
                    for (int var413 = 0; class35.field551.length > var413; ++var413) {
                        if (class35.field551[var413] != null) {
                            class35.field551[var413].field7328 = null;
                            class35.field551[var413].field7389 = -1;
                        }
                    }
                    for (int var414 = 0; var414 < class378.field5678; ++var414) {
                        class13.field299[var414].field2476.field7328 = null;
                        class13.field299[var414].field2476.field7389 = -1;
                    }
                    class617.field8919 = null;
                    return true;
                } else if (class617.field8919 == class175.field2457) {
                    int var415 = class389.field5816.method3147(arg0 + 65534);
                    int var416 = class389.field5816.method3139(105);
                    int var417 = class389.field5816.method3172(arg0 ^ -33414);
                    if (class612.method3484(var417, (byte) -114)) {
                        class166.method1164((byte) -99, var415, var416);
                    }
                    class617.field8919 = null;
                    return true;
                } else if (class617.field8919 == class329.field4764) {
                    int var418 = class389.field5816.method3169(26488);
                    int var419 = class389.field5816.method3115(arg0 ^ -35665);
                    boolean var420 = ~(1 & var419) == -2;
                    while (~class389.field5816.field7956 > ~class297.field4376) {
                        int var421 = class389.field5816.method3109(arg0 + 65534);
                        int var422 = class389.field5816.method3169(26488);
                        int var423 = 0;
                        if (~var422 != -1) {
                            var423 = class389.field5816.method3115(29871);
                            if (~var423 == -256) {
                                var423 = class389.field5816.method3160(false);
                            }
                        }
                        class19.method133(var418, arg0 + 65536, var423, var422 - 1, var421, var420);
                    }
                    class222.field2942[class425.method2563(class324.field4706++, 31)] = var418;
                    class617.field8919 = null;
                    return true;
                } else if (class617.field8919 != class230.field3049) {
                    if (class617.field8919 == class517.field7265) {
                        class181.method1219(true, class323.field4702);
                        class617.field8919 = null;
                        return true;
                    } else if (class617.field8919 == class261.field3397) {
                        int var431 = class389.field5816.method3115(29871);
                        int var432 = class389.field5816.method3168(65536);
                        if (class612.method3484(var432, (byte) -94)) {
                            class10.field267 = var431;
                        }
                        class617.field8919 = null;
                        return true;
                    } else if (class617.field8919 == class178.field2478) {
                        class389.field5816.field7956 += 28;
                        if (class389.field5816.method3133(true)) {
                            class340.method2110(class389.field5816.field7956 + -28, class389.field5816, (byte) -1);
                        }
                        class617.field8919 = null;
                        return true;
                    } else if (class617.field8919 == class295.field4345) {
                        class181.method1219(true, class142.field2047);
                        class617.field8919 = null;
                        return true;
                    } else if (class617.field8919 == class587.field8517) {
                        int var433 = class389.field5816.method3169(26488);
                        int var434 = class389.field5816.method3115(29871);
                        int var435 = class389.field5816.method3115(29871);
                        int var436 = class389.field5816.method3169(26488) << 2;
                        int var437 = class389.field5816.method3115(29871);
                        int var438 = class389.field5816.method3115(29871);
                        if (class612.method3484(var433, (byte) -107)) {
                            class409.method2508(var438, var436, var434, true, var437, var435, 512);
                        }
                        class617.field8919 = null;
                        return true;
                    } else {
                        class118.method869((Throwable) null, (byte) -128, "T1 - " + (class617.field8919 != null ? class617.field8919.method3585((byte) 87) : -1) + "," + (class160.field2275 != null ? class160.field2275.method3585((byte) 53) : -1) + "," + (class334.field4862 == null ? -1 : class334.field4862.method3585((byte) 80)) + " - " + class297.field4376);
                        class65.method395(false, -126);
                        return true;
                    }
                } else {
                    int var424 = class389.field5816.method3169(26488);
                    int var425 = class389.field5816.method3141(4);
                    int var426 = class389.field5816.method3141(4);
                    if (class612.method3484(var424, (byte) -104)) {
                        class200 var427 = (class200) class318.field4623.method2002((byte) -122, (long) var425);
                        class200 var428 = (class200) class318.field4623.method2002((byte) -122, (long) var426);
                        if (var428 != null) {
                            class522.method2950(-3223, false, var428, var427 == null || ~var427.field2716 != ~var428.field2716);
                        }
                        if (var427 != null) {
                            var427.method2360((byte) 66);
                            class318.field4623.method2001(arg0 + 65618, var427, (long) var426);
                        }
                        class5 var429 = class705.method3944(var425, (byte) 116);
                        if (var429 != null) {
                            class284.method1679(var429, -56);
                        }
                        class5 var430 = class705.method3944(var426, (byte) 125);
                        if (var430 != null) {
                            class284.method1679(var430, arg0 ^ 65498);
                            class319.method1976(true, (byte) 79, var430);
                        }
                        if (~class567.field8270 != 0) {
                            class572.method3283((byte) -104, 1, class567.field8270);
                        }
                    }
                    class617.field8919 = null;
                    return true;
                }
            }
        }
    }
}
