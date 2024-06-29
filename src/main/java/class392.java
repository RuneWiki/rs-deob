import jaggl.OpenGL;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gh")
public class class392 extends class120 {

    @OriginalMember(owner = "client!gh", name = "A", descriptor = "I")
    private int field5564 = -1;

    @OriginalMember(owner = "client!gh", name = "C", descriptor = "I")
    private int field5566 = -1;

    @OriginalMember(owner = "client!gh", name = "x", descriptor = "I")
    public int field5561;

    @OriginalMember(owner = "client!gh", name = "z", descriptor = "I")
    public int field5563;

    @OriginalMember(owner = "client!gh", name = "H", descriptor = "I")
    public int field5571;

    @OriginalMember(owner = "client!gh", name = "B", descriptor = "Lqt;")
    public static class459 field5565 = new class459(36, 0);

    @OriginalMember(owner = "client!gh", name = "J", descriptor = "Lub;")
    public static class18 field5573 = new class18();

    @OriginalMember(owner = "client!gh", name = "K", descriptor = "Z")
    public static boolean field5574 = false;

    @OriginalMember(owner = "client!gh", name = "y", descriptor = "I")
    public static int field5562;

    @OriginalMember(owner = "client!gh", name = "D", descriptor = "I")
    public static int field5567;

    @OriginalMember(owner = "client!gh", name = "E", descriptor = "I")
    public static int field5568;

    @OriginalMember(owner = "client!gh", name = "F", descriptor = "I")
    public static int field5569;

    @OriginalMember(owner = "client!gh", name = "G", descriptor = "I")
    public static int field5570;

    @OriginalMember(owner = "client!gh", name = "I", descriptor = "I")
    public static int field5572;

    @OriginalMember(owner = "client!gh", name = "L", descriptor = "Lci;")
    public static class320 field5575;

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(ILjava/util/Random;I)I")
    public static final int method2360(int arg0, Random arg1, int arg2) {
        ++field5567;
        if (arg2 <= 0) {
            throw new IllegalArgumentException();
        } else if (class494.method2900((byte) 124, arg2)) {
            return (int) ((long) arg2 * ((long) arg1.nextInt() & 4294967295L) >> 32);
        } else {
            int var3 = -((int) (4294967296L % (long) arg2)) + arg0;
            int var4;
            do {
                var4 = arg1.nextInt();
            } while (~var3 >= ~var4);
            return class414.method2474(arg2, -799553825, var4);
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(Z)V")
    public final void method889(boolean arg0) {
        OpenGL.glFramebufferTexture3DEXT(this.field5566, this.field5564, super.field1881, 0, 0, 0);
        if (!arg0) {
            field5573 = null;
        }
        ++field5562;
        this.field5566 = -1;
        this.field5564 = -1;
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(IIIIIIII)V")
    public final void method2361(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field5572;
        super.field1884.method285(false, this);
        OpenGL.glCopyTexSubImage3D(super.field1881, arg0, arg3, arg4, arg1, arg5, arg7, arg2, arg6);
        OpenGL.glFlush();
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(IIII)V")
    public static final void method2362(int arg0, int arg1, int arg2, int arg3) {
        class276.field4124.method3019(arg1, 11648);
        ++field5569;
        class276.field4124.method3029(89, arg0);
        if (arg2 == 36) {
            class276.field4124.method3016(arg3, -67);
        }
    }

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "(II)Lnj;")
    public static final class166 method2363(int arg0, int arg1) {
        ++field5568;
        class122[] var2 = class522.field7633;
        synchronized (class522.field7633) {
            class166 var3;
            if (arg1 < class522.field7633.length && !class522.field7633[arg1].method906(true)) {
                var3 = (class166) class522.field7633[arg1].method900((byte) -122);
                var3.method2429(arg0 ^ 3209);
                int var10002 = class71.field1158[arg1]--;
            } else {
                var3 = new class166();
                var3.field2497 = new class48[arg1];
                for (int var4 = 0; ~arg1 < ~var4; ++var4) {
                    var3.field2497[var4] = new class48();
                }
            }
            if (arg0 != 3317) {
                method2360(37, (Random) null, 80);
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "(Z)V")
    public static void method2364(boolean arg0) {
        field5575 = null;
        field5573 = null;
        if (!arg0) {
            method2363(-103, -32);
        }
        field5565 = null;
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(I[[[BIBII)V")
    public static final void method2365(int arg0, byte[][][] arg1, int arg2, byte arg3, int arg4, int arg5) {
        ++class226.field3411;
        class229.field3440 = 0;
        for (int var6 = class70.field1150; var6 < class251.field3740; ++var6) {
            class188[][] var17 = class461.field6675[var6];
            for (int var18 = class11.field111; var18 < class520.field7589; ++var18) {
                for (int var19 = class27.field383; var19 < class56.field1010; ++var19) {
                    class188 var20 = var17[var18][var19];
                    if (var20 != null) {
                        if (!class334.field4958[var18 - class295.field4418 + class272.field4085][var19 - class118.field1845 + class272.field4085] || arg1 != null && var6 >= arg2 && arg1[var6][var18][var19] == arg3) {
                            var20.field2758 = false;
                            var20.field2757 = false;
                            var20.field2754 = 0;
                            if (var18 >= class295.field4418 - 16 && var18 <= class295.field4418 + 16 && var19 >= class118.field1845 - 16 && var19 <= class118.field1845 + 16 && (var20.field2764 != null || var20.field2751 != null || var20.field2755 != null || var20.field2774 != null || var20.field2756 != null || var20.field2773 != null)) {
                                class386.field5506.method772(var20, true);
                            }
                        } else {
                            var20.field2758 = true;
                            var20.field2757 = true;
                            if (var20.field2773 != null) {
                                var20.field2750 = true;
                            } else {
                                var20.field2750 = false;
                            }
                            ++class229.field3440;
                        }
                    }
                }
            }
        }
        boolean var7 = class477.field6942 == class146.field2262;
        for (int var8 = class70.field1150; var8 < class251.field3740; ++var8) {
            float var9 = var7 ? 251.5F : 201.5F - (float) var8 * 50.0F - 0.5F;
            if (class141.field2179.method189() && var8 >= arg2 && arg1 != null) {
                int var10 = class334.field4958.length;
                if (class334.field4958.length + class11.field111 > class394.field5608) {
                    var10 -= class334.field4958.length + class11.field111 - class394.field5608;
                }
                int var11 = class334.field4958[0].length;
                if (class334.field4958[0].length + class27.field383 > class337.field5000) {
                    var11 -= class334.field4958[0].length + class27.field383 - class337.field5000;
                }
                int var12 = class107.field1612;
                while (true) {
                    if (var12 >= var10) {
                        class386.field5506.method778(class146.field2262[var8], true, var9, -117, var8);
                        break;
                    }
                    int var13 = class11.field111 + var12 - class107.field1612;
                    for (int var14 = class261.field3934; var14 < var11; ++var14) {
                        class214.field3232[var12][var14] = false;
                        if (class334.field4958[var12][var14]) {
                            int var15 = class27.field383 + var14 - class261.field3934;
                            for (int var16 = var8; var16 >= 0; --var16) {
                                if (class461.field6675[var16][var13][var15] != null && class461.field6675[var16][var13][var15].field2763 == var8) {
                                    class214.field3232[var12][var14] = class461.field6675[var16][var13][var15].field2758;
                                    break;
                                }
                            }
                        }
                    }
                    ++var12;
                }
            } else {
                class386.field5506.method778(class146.field2262[var8], false, var9, -122, var8);
            }
            class386.field5506.method769(-115);
        }
        if (!class270.method1753(true)) {
            class270.method1753(false);
        }
    }

    @OriginalMember(owner = "client!gh", name = "<init>", descriptor = "(Lbt;IIII[BI)V")
    public class392(class33 arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5, int arg6) {
        super(arg0, 32879, arg1, arg2 * arg3 * arg4, false);
        this.field5561 = arg4;
        this.field5563 = arg3;
        this.field5571 = arg2;
        super.field1884.method285(false, this);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glTexImage3Dub(super.field1881, 0, super.field1867, this.field5571, this.field5563, this.field5561, 0, arg6, 5121, arg5, 0);
        OpenGL.glPixelStorei(3317, 4);
        this.method879(true, (byte) 127);
    }

    @OriginalMember(owner = "client!gh", name = "<init>", descriptor = "(Lbt;IIII)V")
    public class392(class33 arg0, int arg1, int arg2, int arg3, int arg4) {
        super(arg0, 32879, arg1, arg2 * arg4 * arg3, false);
        this.field5561 = arg4;
        this.field5563 = arg3;
        this.field5571 = arg2;
        super.field1884.method285(false, this);
        OpenGL.glTexImage3Dub(super.field1881, 0, super.field1867, this.field5571, this.field5563, this.field5561, 0, class136.method993(super.field1867, (byte) -86), 5121, (byte[]) null, 0);
        this.method879(true, (byte) 108);
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(BIILkj;)Lhu;")
    public static final class88 method2366(byte arg0, int arg1, int arg2, class405 arg3) {
        int var4 = -87 % ((60 - arg0) / 46);
        ++field5570;
        int var5 = arg2 << 8 | arg3.field5766;
        class88 var6 = (class88) class520.field7585.method997((byte) -126, (long) var5 << 16);
        if (var6 != null) {
            return var6;
        } else {
            byte[] var7 = class464.field6744.method2029(class464.field6744.method2027(var5, (byte) -111), false);
            if (var7 != null) {
                if (var7.length <= 1) {
                    return null;
                } else {
                    class88 var8 = class342.method2165(-99, var7);
                    var8.field1418 = arg3;
                    class520.field7585.method998((byte) -100, (long) var5 << 16, var8);
                    return var8;
                }
            } else {
                int var9 = arg3.field5766 | arg1 - -65536 << 8;
                class88 var10 = (class88) class520.field7585.method997((byte) -128, (long) var9 << 16);
                if (var10 != null) {
                    return var10;
                } else {
                    byte[] var11 = class464.field6744.method2029(class464.field6744.method2027(var9, (byte) 115), false);
                    if (var11 != null) {
                        if (~var11.length >= -2) {
                            return null;
                        } else {
                            class88 var12 = class342.method2165(-108, var11);
                            var12.field1418 = arg3;
                            class520.field7585.method998((byte) 70, (long) var9 << 16, var12);
                            return var12;
                        }
                    } else {
                        int var13 = arg3.field5766 | 16776960;
                        class88 var14 = (class88) class520.field7585.method997((byte) -128, (long) var13 << 16);
                        if (var14 != null) {
                            return var14;
                        } else {
                            byte[] var15 = class464.field6744.method2029(class464.field6744.method2027(var13, (byte) -102), false);
                            if (var15 != null) {
                                if (~var15.length >= -2) {
                                    return null;
                                } else {
                                    class88 var16 = class342.method2165(-95, var15);
                                    var16.field1418 = arg3;
                                    class520.field7585.method998((byte) 109, (long) var13 << 16, var16);
                                    return var16;
                                }
                            } else {
                                return null;
                            }
                        }
                    }
                }
            }
        }
    }
}
