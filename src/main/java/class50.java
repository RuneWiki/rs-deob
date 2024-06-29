import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sca")
public class class50 implements class15 {

    @OriginalMember(owner = "client!sca", name = "g", descriptor = "[Lnia;")
    private class670[] field718 = new class670[9];

    @OriginalMember(owner = "client!sca", name = "s", descriptor = "I")
    private int field730 = -1;

    @OriginalMember(owner = "client!sca", name = "B", descriptor = "I")
    private int field739 = 0;

    @OriginalMember(owner = "client!sca", name = "v", descriptor = "Lkv;")
    private class280 field733;

    @OriginalMember(owner = "client!sca", name = "p", descriptor = "I")
    private int field727;

    @OriginalMember(owner = "client!sca", name = "h", descriptor = "I")
    public static int field719 = 0;

    @OriginalMember(owner = "client!sca", name = "a", descriptor = "I")
    public static int field712;

    @OriginalMember(owner = "client!sca", name = "b", descriptor = "I")
    public static int field713;

    @OriginalMember(owner = "client!sca", name = "c", descriptor = "I")
    public static int field714;

    @OriginalMember(owner = "client!sca", name = "d", descriptor = "I")
    public static int field715;

    @OriginalMember(owner = "client!sca", name = "e", descriptor = "I")
    public static int field716;

    @OriginalMember(owner = "client!sca", name = "f", descriptor = "I")
    public static int field717;

    @OriginalMember(owner = "client!sca", name = "i", descriptor = "I")
    public static int field720;

    @OriginalMember(owner = "client!sca", name = "j", descriptor = "I")
    private int field721;

    @OriginalMember(owner = "client!sca", name = "k", descriptor = "I")
    public static int field722;

    @OriginalMember(owner = "client!sca", name = "m", descriptor = "I")
    public static int field724;

    @OriginalMember(owner = "client!sca", name = "n", descriptor = "I")
    private int field725;

    @OriginalMember(owner = "client!sca", name = "o", descriptor = "I")
    public static int field726;

    @OriginalMember(owner = "client!sca", name = "q", descriptor = "I")
    public static int field728;

    @OriginalMember(owner = "client!sca", name = "r", descriptor = "I")
    public static int field729;

    @OriginalMember(owner = "client!sca", name = "t", descriptor = "I")
    public static int field731;

    @OriginalMember(owner = "client!sca", name = "u", descriptor = "I")
    public static int field732;

    @OriginalMember(owner = "client!sca", name = "w", descriptor = "I")
    public static int field734;

    @OriginalMember(owner = "client!sca", name = "x", descriptor = "I")
    public static int field735;

    @OriginalMember(owner = "client!sca", name = "y", descriptor = "I")
    private int field736;

    @OriginalMember(owner = "client!sca", name = "z", descriptor = "I")
    public static int field737;

    @OriginalMember(owner = "client!sca", name = "A", descriptor = "I")
    public static int field738;

    @OriginalMember(owner = "client!sca", name = "C", descriptor = "I")
    public static int field740;

    @OriginalMember(owner = "client!sca", name = "l", descriptor = "Lnba;")
    public static class312 field723;

    @OriginalMember(owner = "client!sca", name = "a", descriptor = "(Z[[[BIBIIZ)V", line = 5)
    public static final void method330(boolean arg0, byte[][][] arg1, int arg2, byte arg3, int arg4, int arg5, boolean arg6) {
        int var7 = arg0 ? 1 : 0;
        class709.field9996 = 0;
        class761.field10492 = 0;
        class279.field3940++;
        if ((arg5 & 0x2) == 0) {
            for (class547 var8 = class472.field6734[var7]; var8 != null; var8 = var8.field7714) {
                if (!class678.method3835(var8, arg0, arg1, arg2, arg3)) {
                    class356.method2236(var8);
                    if (var8.field7722 != -1) {
                        class372.field5364[class709.field9996++] = var8;
                    }
                }
            }
        }
        if ((arg5 & 0x1) == 0) {
            for (class547 var9 = class110.field1365[var7]; var9 != null; var9 = var9.field7714) {
                if (!class678.method3835(var9, arg0, arg1, arg2, arg3)) {
                    class356.method2236(var9);
                    if (var9.field7722 != -1) {
                        class564.field8010[class761.field10492++] = var9;
                    }
                }
            }
            for (class547 var10 = class511.field7305[var7]; var10 != null; var10 = var10.field7714) {
                if (!class678.method3835(var10, arg0, arg1, arg2, arg3)) {
                    if (var10.method248((byte) -55)) {
                        class356.method2236(var10);
                        if (var10.field7722 != -1) {
                            class564.field8010[class761.field10492++] = var10;
                        }
                    } else {
                        class356.method2236(var10);
                        if (var10.field7722 != -1) {
                            class372.field5364[class709.field9996++] = var10;
                        }
                    }
                }
            }
            if (!arg0) {
                for (int var11 = 0; var11 < class592.field8357; var11++) {
                    if (!class678.method3835(class296.field4465[var11], arg0, arg1, arg2, arg3)) {
                        class356.method2236(class296.field4465[var11]);
                        if (class296.field4465[var11].field7722 != -1) {
                            if (class296.field4465[var11].method248((byte) -55)) {
                                class564.field8010[class761.field10492++] = class296.field4465[var11];
                            } else {
                                class372.field5364[class709.field9996++] = class296.field4465[var11];
                            }
                        }
                    }
                }
            }
        }
        if (class709.field9996 > 0) {
            class194.method1410(class372.field5364, 0, class709.field9996 - 1);
            for (int var12 = 0; var12 < class709.field9996; var12++) {
                class682.method3856(class372.field5364[var12], true, arg6);
            }
        }
        if (class727.field10183) {
            class711.field10005.method429(0, null);
        }
        if ((arg5 & 0x2) == 0) {
            for (int var13 = class197.field2884; var13 < class456.field6545; var13++) {
                if (var13 < arg2 || arg1 == null) {
                    int var23 = class457.field6551.length;
                    if (class457.field6551.length + class623.field8779 > class151.field2074) {
                        var23 -= class457.field6551.length + class623.field8779 - class151.field2074;
                    }
                    int var24 = class457.field6551[0].length;
                    if (class457.field6551[0].length + class366.field5282 > class12.field249) {
                        var24 -= class457.field6551[0].length + class366.field5282 - class12.field249;
                    }
                    boolean[][] var25 = class250.field3544;
                    if (class282.field4336) {
                        if (class437.field6253) {
                            var25 = class377.field5419[var13];
                        }
                        for (int var26 = class521.field7442; var26 < var23; var26++) {
                            int var27 = class623.field8779 + var26 - class521.field7442;
                            for (int var28 = class428.field6015; var28 < var24; var28++) {
                                if (class457.field6551[var26][var28] && !class136.method966(0, var13, class366.field5282 + var28 - class428.field6015, var27)) {
                                    var25[var26][var28] = true;
                                } else {
                                    var25[var26][var28] = false;
                                }
                            }
                        }
                    }
                    if (class437.field6253) {
                        if (arg4 >= 0) {
                            class622.field8777[var13].method1250(0, 0, 0, null, false, arg4, arg5);
                        } else {
                            class622.field8777[var13].method1243(0, 0, 0, null, false, arg5);
                        }
                        for (int var29 = 0; var29 < class622.field8775; var29++) {
                            class137.field1790[var29].method701((byte) 82, new class313(var13 + 1));
                        }
                    } else if (arg4 >= 0) {
                        class622.field8777[var13].method1250(class282.field4335, class301.field4521, class76.field1016, class250.field3544, true, arg4, arg5);
                    } else {
                        class622.field8777[var13].method1243(class282.field4335, class301.field4521, class76.field1016, class250.field3544, true, arg5);
                    }
                } else {
                    int var14 = class457.field6551.length;
                    if (class457.field6551.length + class623.field8779 > class151.field2074) {
                        var14 -= class457.field6551.length + class623.field8779 - class151.field2074;
                    }
                    int var15 = class457.field6551[0].length;
                    if (class457.field6551[0].length + class366.field5282 > class12.field249) {
                        var15 -= class457.field6551[0].length + class366.field5282 - class12.field249;
                    }
                    boolean[][] var16 = class250.field3544;
                    if (class282.field4336) {
                        if (class437.field6253) {
                            var16 = class377.field5419[var13];
                        }
                        for (int var17 = class521.field7442; var17 < var14; var17++) {
                            int var18 = class623.field8779 + var17 - class521.field7442;
                            for (int var19 = class428.field6015; var19 < var15; var19++) {
                                var16[var17][var19] = false;
                                if (class457.field6551[var17][var19]) {
                                    int var20 = class366.field5282 + var19 - class428.field6015;
                                    for (int var21 = var13; var21 >= 0; var21--) {
                                        if (class378.field5427[var21][var18][var20] != null && class378.field5427[var21][var18][var20].field5440 == var13) {
                                            if ((var21 < arg2 || arg1[var21][var18][var20] != arg3) && !class136.method966(0, var13, var20, var18)) {
                                                var16[var17][var19] = true;
                                                break;
                                            }
                                            var16[var17][var19] = false;
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (class437.field6253) {
                        if (arg4 >= 0) {
                            class622.field8777[var13].method1250(0, 0, 0, null, false, arg4, arg5);
                        } else {
                            class622.field8777[var13].method1243(0, 0, 0, null, false, arg5);
                        }
                        for (int var22 = 0; var22 < class622.field8775; var22++) {
                            class137.field1790[var22].method701((byte) -122, new class313(var13 + 1));
                        }
                    } else if (arg4 >= 0) {
                        class622.field8777[var13].method1250(class282.field4335, class301.field4521, class76.field1016, class250.field3544, false, arg4, arg5);
                    } else {
                        class622.field8777[var13].method1243(class282.field4335, class301.field4521, class76.field1016, class250.field3544, false, arg5);
                    }
                }
            }
        }
        if (class761.field10492 > 0) {
            class92.method655(class564.field8010, 0, class761.field10492 - 1);
            for (int var30 = 0; var30 < class761.field10492; var30++) {
                class682.method3856(class564.field8010[var30], true, arg6);
            }
        }
    }

    @OriginalMember(owner = "client!sca", name = "a", descriptor = "(B)V", line = 307)
    public static void method331(byte arg0) {
        if (arg0 < 68) {
            method341(62);
        }
        field723 = null;
    }

    @OriginalMember(owner = "client!sca", name = "d", descriptor = "(I)V", line = 317)
    public final void method137(int arg0) {
        field716++;
        OpenGL.glBindFramebufferEXT(36009, 0);
        if (arg0 > 59) {
            this.field739 &= 0xFFFFFFFD;
            this.field730 = this.method334(-1);
        }
    }

    @OriginalMember(owner = "client!sca", name = "a", descriptor = "(IB)V", line = 337)
    public final void method332(int arg0, byte arg1) {
        if (this.field718[arg0] != null) {
            this.field718[arg0].method1255((byte) 67);
        }
        field728++;
        this.field736 &= ~(0x1 << arg0);
        if (arg1 > 81) {
            this.field718[arg0] = null;
        }
    }

    @OriginalMember(owner = "client!sca", name = "a", descriptor = "(II)V", line = 353)
    public final void method333(int arg0, int arg1) {
        field720++;
        if (this.field730 == -1) {
            throw new RuntimeException();
        }
        if (arg1 != 0) {
            this.field727 = -15;
        }
        OpenGL.glDrawBuffer(class597.field8426[arg0]);
    }

    @OriginalMember(owner = "client!sca", name = "e", descriptor = "(I)I", line = 372)
    private final int method334(int arg0) {
        field731++;
        if ((this.field739 & 0x4) != 0) {
            return 36160;
        } else if (~(this.field739 & 0x2) == arg0) {
            return (this.field739 & 0x1) == 0 ? -1 : 36008;
        } else {
            return 36009;
        }
    }

    @OriginalMember(owner = "client!sca", name = "b", descriptor = "(Z)V", line = 391)
    public final void method136(boolean arg0) {
        OpenGL.glBindFramebufferEXT(36160, 0);
        field729++;
        this.field739 &= 0xFFFFFFFB;
        this.field730 = this.method334(-1);
        if (arg0) {
            method340(-14, true, 78, 0, -115, 93, -115, 3, 112);
        }
    }

    @OriginalMember(owner = "client!sca", name = "a", descriptor = "(Lmu;IZII)V", line = 404)
    private final void method335(class314 arg0, int arg1, boolean arg2, int arg3, int arg4) {
        field740++;
        if (this.field730 == -1) {
            throw new RuntimeException();
        }
        int var6 = 0x1 << arg1;
        if ((this.field736 & ~var6) == 0) {
            this.field721 = arg0.field4652;
            this.field725 = arg0.field4652;
        } else if (this.field721 != arg0.field4652 || this.field725 != arg0.field4652) {
            throw new RuntimeException();
        }
        arg0.method2039(this.field730, arg4, class597.field8426[arg1], arg3, (byte) 125);
        this.field718[arg1] = arg0;
        if (arg2) {
            field719 = 67;
        }
        this.field736 |= var6;
    }

    @OriginalMember(owner = "client!sca", name = "b", descriptor = "(I)V", line = 434)
    public final void method134(int arg0) {
        field714++;
        OpenGL.glBindFramebufferEXT(36008, 0);
        if (arg0 == 795) {
            this.field739 &= 0xFFFFFFFE;
            this.field730 = this.method334(-1);
        }
    }

    @OriginalMember(owner = "client!sca", name = "a", descriptor = "(Z)V", line = 447)
    public final void method133(boolean arg0) {
        OpenGL.glBindFramebufferEXT(36008, this.field727);
        field735++;
        if (!arg0) {
            this.field739 |= 0x1;
            this.field730 = this.method334(-1);
        }
    }

    @OriginalMember(owner = "client!sca", name = "a", descriptor = "(I)V", line = 460)
    public final void method132(int arg0) {
        OpenGL.glBindFramebufferEXT(36160, this.field727);
        field712++;
        if (arg0 == 26054) {
            this.field739 |= 0x4;
            this.field730 = this.method334(-1);
        }
    }

    @OriginalMember(owner = "client!sca", name = "<init>", descriptor = "(Lkv;)V", line = 661)
    public class50(class280 arg0) {
        if (!arg0.field4285) {
            throw new IllegalStateException("");
        }
        this.field733 = arg0;
        OpenGL.glGenFramebuffersEXT(1, class451.field6480, 0);
        this.field727 = class451.field6480[0];
    }

    @OriginalMember(owner = "client!sca", name = "b", descriptor = "(B)Z", line = 481)
    public final boolean method336(byte arg0) {
        field738++;
        int var2 = OpenGL.glCheckFramebufferStatusEXT(this.field730);
        if (var2 == 36053) {
            if (arg0 >= -5) {
                method340(6, false, -97, 87, -121, -58, 117, -55, -80);
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!sca", name = "a", descriptor = "(Lho;II)V", line = 507)
    public final void method337(class158 arg0, int arg1, int arg2) {
        field715++;
        this.method343(arg2, arg1, arg0, 0);
    }

    @OriginalMember(owner = "client!sca", name = "a", descriptor = "(ZI)V", line = 515)
    public final void method338(boolean arg0, int arg1) {
        field726++;
        if (this.field730 == -1) {
            throw new RuntimeException();
        }
        if (arg0) {
            this.method137(24);
        }
        OpenGL.glReadBuffer(class597.field8426[arg1]);
    }

    @OriginalMember(owner = "client!sca", name = "a", descriptor = "(ILgba;Z)V", line = 532)
    public final void method339(int arg0, class694 arg1, boolean arg2) {
        field724++;
        if (arg2) {
            return;
        }
        if (this.field730 == -1) {
            throw new RuntimeException();
        }
        int var4 = 0x1 << arg0;
        if ((this.field736 & ~var4) == 0) {
            this.field721 = arg1.field9818;
            this.field725 = arg1.field9810;
        } else if (this.field721 != arg1.field9818 || this.field725 != arg1.field9810) {
            throw new RuntimeException();
        }
        arg1.method3916(this.field730, class597.field8426[arg0], (byte) -74);
        this.field718[arg0] = arg1;
        this.field736 |= var4;
    }

    @OriginalMember(owner = "client!sca", name = "c", descriptor = "(I)V", line = 568)
    public final void method135(int arg0) {
        field713++;
        OpenGL.glBindFramebufferEXT(36009, this.field727);
        if (arg0 != 16667) {
            this.method338(true, 105);
        }
        this.field739 |= 0x2;
        this.field730 = this.method334(-1);
    }

    @OriginalMember(owner = "client!sca", name = "a", descriptor = "(IZIIIIIII)V", line = 587)
    public static final void method340(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field734++;
        if (arg1) {
            field719 = 123;
        }
        class785.method4302(arg7, (byte) -60, arg0, 0, arg5, arg4, arg8, arg6, arg2, arg3);
    }

    @OriginalMember(owner = "client!sca", name = "f", descriptor = "(I)V", line = 600)
    public static final void method341(int arg0) {
        class181.field2741.method2364(1);
        int var1 = -18 % ((-arg0 - 72) / 35);
        field732++;
    }

    @OriginalMember(owner = "client!sca", name = "a", descriptor = "(Lmu;III)V", line = 611)
    public final void method342(class314 arg0, int arg1, int arg2, int arg3) {
        field717++;
        this.method335(arg0, arg1, false, arg3, arg2);
    }

    @OriginalMember(owner = "client!sca", name = "a", descriptor = "(IILho;I)V", line = 622)
    private final void method343(int arg0, int arg1, class158 arg2, int arg3) {
        field737++;
        if (~this.field730 == arg1) {
            throw new RuntimeException();
        }
        int var5 = 0x1 << arg0;
        if ((this.field736 & ~var5) == 0) {
            this.field721 = arg2.field2367;
            this.field725 = arg2.field2358;
        } else if (this.field721 != arg2.field2367 || this.field725 != arg2.field2358) {
            throw new RuntimeException();
        }
        arg2.method1256(this.field730, (byte) -76, class597.field8426[arg0], arg3);
        this.field718[arg0] = arg2;
        this.field736 |= var5;
    }

    @OriginalMember(owner = "client!sca", name = "finalize", descriptor = "()V", line = 653)
    protected final void finalize() throws Throwable {
        this.field733.method1846(1, this.field727);
        field722++;
        super.finalize();
    }
}
