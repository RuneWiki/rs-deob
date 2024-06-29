import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!od")
public class class209 {

    @OriginalMember(owner = "client!od", name = "c", descriptor = "Z")
    public boolean field3565 = false;

    @OriginalMember(owner = "client!od", name = "s", descriptor = "[F")
    public float[] field3581 = new float[4];

    @OriginalMember(owner = "client!od", name = "B", descriptor = "I")
    public int field3590;

    @OriginalMember(owner = "client!od", name = "z", descriptor = "Z")
    public boolean field3588;

    @OriginalMember(owner = "client!od", name = "a", descriptor = "Z")
    public boolean field3563;

    @OriginalMember(owner = "client!od", name = "o", descriptor = "I")
    public int field3577;

    @OriginalMember(owner = "client!od", name = "h", descriptor = "I")
    public int field3570;

    @OriginalMember(owner = "client!od", name = "e", descriptor = "I")
    public int field3567;

    @OriginalMember(owner = "client!od", name = "y", descriptor = "I")
    public int field3587;

    @OriginalMember(owner = "client!od", name = "r", descriptor = "[S")
    public short[] field3580;

    @OriginalMember(owner = "client!od", name = "b", descriptor = "I")
    public int field3564;

    @OriginalMember(owner = "client!od", name = "j", descriptor = "I")
    private int field3572;

    @OriginalMember(owner = "client!od", name = "m", descriptor = "I")
    private int field3575;

    @OriginalMember(owner = "client!od", name = "i", descriptor = "Lml;")
    public static class160 field3571 = new class160(64);

    @OriginalMember(owner = "client!od", name = "F", descriptor = "[F")
    public static float[] field3594 = new float[] { 0.073F, 0.169F, 0.24F, 1.0F };

    @OriginalMember(owner = "client!od", name = "H", descriptor = "I")
    public static int field3596 = 0;

    @OriginalMember(owner = "client!od", name = "k", descriptor = "F")
    public float field3573;

    @OriginalMember(owner = "client!od", name = "q", descriptor = "F")
    public float field3579;

    @OriginalMember(owner = "client!od", name = "f", descriptor = "I")
    public static int field3568;

    @OriginalMember(owner = "client!od", name = "g", descriptor = "I")
    public static int field3569;

    @OriginalMember(owner = "client!od", name = "l", descriptor = "I")
    public static int field3574;

    @OriginalMember(owner = "client!od", name = "n", descriptor = "I")
    public static int field3576;

    @OriginalMember(owner = "client!od", name = "p", descriptor = "I")
    private int field3578;

    @OriginalMember(owner = "client!od", name = "u", descriptor = "I")
    private int field3583;

    @OriginalMember(owner = "client!od", name = "v", descriptor = "I")
    public static int field3584;

    @OriginalMember(owner = "client!od", name = "w", descriptor = "I")
    private int field3585;

    @OriginalMember(owner = "client!od", name = "x", descriptor = "I")
    public static int field3586;

    @OriginalMember(owner = "client!od", name = "A", descriptor = "I")
    public static int field3589;

    @OriginalMember(owner = "client!od", name = "C", descriptor = "I")
    public static int field3591;

    @OriginalMember(owner = "client!od", name = "G", descriptor = "I")
    private int field3595;

    @OriginalMember(owner = "client!od", name = "E", descriptor = "Lgh;")
    public class233 field3593;

    @OriginalMember(owner = "client!od", name = "t", descriptor = "Ljk;")
    public static class273 field3582;

    @OriginalMember(owner = "client!od", name = "D", descriptor = "Lck;")
    public static class275 field3592;

    @OriginalMember(owner = "client!od", name = "d", descriptor = "Lcc;")
    public static class313 field3566;

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(I)[Ljk;", line = 19)
    public static final class273[] method1457(int arg0) {
        class273[] var1 = new class273[class185.field3205];
        field3586++;
        if (arg0 != 15285) {
            field3582 = (class273) null;
        }
        for (int var2 = 0; var2 < class185.field3205; var2++) {
            int var3 = class279.field4643[var2] * class263.field4389[var2];
            byte[] var4 = class190.field3255[var2];
            if (class31.field434[var2]) {
                byte[] var7 = class303.field5044[var2];
                int[] var8 = new int[var3];
                for (int var9 = 0; var9 < var3; var9++) {
                    var8[var9] = class221.method1516(class241.field4062[class47.method289(255, var4[var9])], class47.method289(var7[var9], 255) << 24);
                }
                if (class56.field846) {
                    var1[var2] = new class6(class307.field5187, class290.field4802, class27.field386[var2], class63.field1032[var2], class279.field4643[var2], class263.field4389[var2], var8);
                } else {
                    var1[var2] = new class311(class307.field5187, class290.field4802, class27.field386[var2], class63.field1032[var2], class279.field4643[var2], class263.field4389[var2], var8);
                }
            } else {
                int[] var5 = new int[var3];
                for (int var6 = 0; var6 < var3; var6++) {
                    var5[var6] = class241.field4062[class47.method289(255, var4[var6])];
                }
                if (class56.field846) {
                    var1[var2] = new class198(class307.field5187, class290.field4802, class27.field386[var2], class63.field1032[var2], class279.field4643[var2], class263.field4389[var2], var5);
                } else {
                    var1[var2] = new class184(class307.field5187, class290.field4802, class27.field386[var2], class63.field1032[var2], class279.field4643[var2], class263.field4389[var2], var5);
                }
            }
        }
        class197.method1395((byte) 127);
        return var1;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(IZI)V", line = 82)
    public final void method1458(int arg0, boolean arg1, int arg2) {
        field3569++;
        int var4 = this.field3578 * arg0 / 50 + this.field3575 & 0x7FF;
        int var5 = this.field3583;
        int var6;
        if (var5 == 1) {
            var6 = (class236.field3985[var4] >> 6) + 1024;
        } else if (var5 == 3) {
            var6 = class37.field549[var4] >> 1;
        } else if (var5 == 4) {
            var6 = var4 >> 10 << 11;
        } else if (var5 == 2) {
            var6 = var4;
        } else if (var5 == 5) {
            var6 = (var4 >= 1024 ? 2048 - var4 : var4) << 1;
        } else {
            var6 = 2048;
        }
        if (arg2 <= 49) {
            this.field3573 = -0.20200606F;
        }
        if (arg1) {
            var6 = 2048;
        }
        this.field3573 = (float) (this.field3595 + (this.field3585 * var6 >> 11)) / 2048.0F;
        float var7 = this.field3573 / 255.0F;
        this.field3581[1] = var7 * (float) class47.method289(255, this.field3564 >> 8);
        this.field3581[0] = var7 * (float) (class47.method289(this.field3564, 16754854) >> 16);
        this.field3581[2] = (float) class47.method289(this.field3564, 255) * var7;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(ZIIILwd;)V", line = 167)
    public static final void method1459(boolean arg0, int arg1, int arg2, int arg3, class112 arg4) {
        field3568++;
        class181.method1294(arg0);
        if (class56.field846) {
            class101.method687(arg1, arg3, arg4.field1766 + arg1, arg4.field1753 + arg3);
        } else {
            class276.method1862(arg1, arg3, arg4.field1766 + arg1, arg4.field1753 + arg3);
        }
        if (class182.field3175 != 2 && class182.field3175 != 5 && class218.field3658 != null) {
            int var5 = class144.field2618 + class180.field3134 & 0x7FF;
            int var6 = class286.field4744.field2461 / 32 + 48;
            int var7 = 464 - class286.field4744.field2487 / 32;
            if (class56.field846) {
                ((class198) class218.field3658).method1402(arg1, arg3, arg4.field1766, arg4.field1753, var6, var7, var5, class234.field3951 + 256, (class198) arg4.method740(false, (byte) -23));
            } else {
                ((class184) class218.field3658).method1326(arg1, arg3, arg4.field1766, arg4.field1753, var6, var7, var5, class234.field3951 + 256, arg4.field1796, arg4.field1772);
            }
            if (class274.field4611 != null) {
                for (int var8 = 0; var8 < class274.field4611.field887; var8++) {
                    if (class274.field4611.method387(var8, !arg0)) {
                        int var9 = (class274.field4611.field881[var8] - class58.field914) * 4 - (class286.field4744.field2461 / 32 - 2);
                        int var10 = class236.field3985[var5];
                        int var11 = (class274.field4611.field877[var8] - class138.field2473) * 4 + 2 - (class286.field4744.field2487 / 32);
                        class312 var12 = class118.field1987;
                        int var13 = var10 * 256 / (class234.field3951 + 256);
                        int var14 = class236.field3971[var5];
                        int var15 = var14 * 256 / (class234.field3951 + 256);
                        if (class274.field4611.method394(!arg0, var8) == 1) {
                            var12 = class174.field3077;
                        }
                        if (class274.field4611.method394(!arg0, var8) == 2) {
                            var12 = class200.field3414;
                        }
                        int var16 = var9 * var15 + var11 * var13 >> 16;
                        int var17 = var11 * var15 - (var9 * var13) >> 16;
                        int var18 = var12.method2149(class274.field4611.field885[var8], 100);
                        int var19 = var16 - var18 / 2;
                        if (var19 >= -arg4.field1766 && arg4.field1766 >= var19 && (-arg4.field1753) <= var17 && var17 <= arg4.field1753) {
                            int var20 = 16777215;
                            if (class274.field4611.field878[var8] != -1) {
                                var20 = class274.field4611.field878[var8];
                            }
                            if (class56.field846) {
                                class101.method690((class198) arg4.method740(false, (byte) -23));
                            } else {
                                class276.method1849(arg4.field1796, arg4.field1772);
                            }
                            var12.method2134(class274.field4611.field885[var8], arg4.field1766 / 2 + (var19 + arg1), arg4.field1753 / 2 + arg3 + -var17, var18, 50, var20, 0, 256, 1, 0, 0);
                            if (class56.field846) {
                                class101.method691();
                            } else {
                                class276.method1863();
                            }
                        }
                    }
                }
            }
            for (int var21 = 0; var21 < class197.field3371; var21++) {
                int var22 = class220.field3705[var21] * 4 + 2 - (class286.field4744.field2487 / 32);
                int var23 = class168.field2990[var21] * 4 + 2 - (class286.field4744.field2461 / 32);
                class265 var24 = class185.method1338(class259.field4352[var21], -7153);
                if (var24.field4435 != null) {
                    var24 = var24.method1788(-1);
                    if (var24 == null || var24.field4476 == -1) {
                        continue;
                    }
                }
                class221.method1515(arg4, arg1, var22, class219.field3676[var24.field4476], arg0, var23, arg3);
            }
            for (int var25 = 0; var25 < 104; var25++) {
                for (int var26 = 0; var26 < 104; var26++) {
                    class129 var27 = class89.field1388[class131.field2250][var25][var26];
                    if (var27 != null) {
                        int var28 = var25 * 4 + 2 - class286.field4744.field2461 / 32;
                        int var29 = var26 * 4 + 2 - (class286.field4744.field2487 / 32);
                        class221.method1515(arg4, arg1, var29, class74.field1195[0], true, var28, arg3);
                    }
                }
            }
            for (int var30 = 0; var30 < class30.field425; var30++) {
                class89 var31 = class199.field3391[class279.field4639[var30]];
                if (var31 != null && var31.method626(36)) {
                    class304 var32 = var31.field1389;
                    if (var32 != null && var32.field5059 != null) {
                        var32 = var32.method2038((byte) 116);
                    }
                    if (var32 != null && var32.field5069 && var32.field5055) {
                        int var33 = var31.field2461 / 32 - (class286.field4744.field2461 / 32);
                        int var34 = var31.field2487 / 32 - (class286.field4744.field2487 / 32);
                        if (var32.field5063 == -1) {
                            class221.method1515(arg4, arg1, var34, class74.field1195[1], true, var33, arg3);
                        } else {
                            class221.method1515(arg4, arg1, var34, class219.field3676[var32.field5063], true, var33, arg3);
                        }
                    }
                }
            }
            for (int var35 = 0; var35 < class239.field4036; var35++) {
                class301 var36 = class85.field1352[class166.field2958[var35]];
                if (var36 != null && var36.method626(-124)) {
                    int var37 = var36.field2461 / 32 - (class286.field4744.field2461 / 32);
                    int var38 = var36.field2487 / 32 - (class286.field4744.field2487 / 32);
                    boolean var39 = false;
                    long var40 = var36.field5019.method845((byte) -126);
                    for (int var42 = 0; var42 < class14.field197; var42++) {
                        if (class64.field1088[var42] == var40 && class262.field4381[var42] != 0) {
                            var39 = true;
                            break;
                        }
                    }
                    boolean var43 = false;
                    for (int var44 = 0; var44 < class78.field1276; var44++) {
                        if (class159.field2865[var44].field1117 == var40) {
                            var43 = true;
                            break;
                        }
                    }
                    boolean var45 = false;
                    if (class286.field4744.field4995 != 0 && var36.field4995 != 0 && class286.field4744.field4995 == var36.field4995) {
                        var45 = true;
                    }
                    if (var39) {
                        class221.method1515(arg4, arg1, var38, class74.field1195[3], arg0, var37, arg3);
                    } else if (var43) {
                        class221.method1515(arg4, arg1, var38, class74.field1195[5], true, var37, arg3);
                    } else if (var45) {
                        class221.method1515(arg4, arg1, var38, class74.field1195[4], arg0, var37, arg3);
                    } else {
                        class221.method1515(arg4, arg1, var38, class74.field1195[2], arg0, var37, arg3);
                    }
                }
            }
            class190[] var46 = class100.field1623;
            for (int var47 = 0; var47 < var46.length; var47++) {
                class190 var48 = var46[var47];
                if (var48 != null && var48.field3268 != 0 && (class249.field4174 % 20) < 10) {
                    if (var48.field3268 == 1 && var48.field3257 >= 0 && var48.field3257 < class199.field3391.length) {
                        class89 var49 = class199.field3391[var48.field3257];
                        if (var49 != null) {
                            int var50 = var49.field2461 / 32 - class286.field4744.field2461 / 32;
                            int var51 = var49.field2487 / 32 - class286.field4744.field2487 / 32;
                            class25.method120((byte) 57, arg1, arg3, arg4, var50, var48.field3263, var51);
                        }
                    }
                    if (var48.field3268 == 2) {
                        int var52 = (var48.field3270 - class58.field914) * 4 - (class286.field4744.field2461 / 32 - 2);
                        int var53 = (var48.field3266 - class138.field2473) * 4 + 2 - (class286.field4744.field2487 / 32);
                        class25.method120((byte) -59, arg1, arg3, arg4, var52, var48.field3263, var53);
                    }
                    if (var48.field3268 == 10 && var48.field3257 >= 0 && class85.field1352.length > var48.field3257) {
                        class301 var54 = class85.field1352[var48.field3257];
                        if (var54 != null) {
                            int var55 = var54.field2461 / 32 - class286.field4744.field2461 / 32;
                            int var56 = var54.field2487 / 32 - (class286.field4744.field2487 / 32);
                            class25.method120((byte) 75, arg1, arg3, arg4, var55, var48.field3263, var56);
                        }
                    }
                }
            }
            if (class27.field378 != 0) {
                int var57 = class165.field2953 * 4 + 2 - class286.field4744.field2487 / 32;
                int var58 = class27.field378 * 4 + 2 - (class286.field4744.field2461 / 32);
                class221.method1515(arg4, arg1, var57, class152.field2770, true, var58, arg3);
            }
            if (class56.field846) {
                class101.method689(arg4.field1766 / 2 + arg1 - 1, arg3 - (-(arg4.field1753 / 2) + 1), 3, 3, 16777215);
            } else {
                class276.method1844(arg4.field1766 / 2 + arg1 - 1, arg3 - -(arg4.field1753 / 2) + -1, 3, 3, 16777215);
            }
        } else if (class56.field846) {
            class273 var59 = arg4.method740(false, (byte) -23);
            if (var59 != null) {
                var59.method1333(arg1, arg3);
            }
        } else {
            class276.method1852(arg1, arg3, 0, arg4.field1796, arg4.field1772);
        }
        class250.field4186[arg2] = true;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(Lcc;Lcc;IBI)Lcm;", line = 506)
    public static final class312 method1460(class313 arg0, class313 arg1, int arg2, byte arg3, int arg4) {
        field3584++;
        if (arg3 >= -117) {
            return (class312) null;
        } else if (class298.method2012(arg4, (byte) -110, arg0, arg2)) {
            return class30.method144((byte) 111, arg1.method2173(arg4, arg2, (byte) -82));
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!od", name = "b", descriptor = "(I)V", line = 522)
    public static void method1461(int arg0) {
        field3592 = null;
        field3566 = null;
        field3571 = null;
        field3582 = null;
        if (arg0 != 3) {
            field3592 = (class275) null;
        }
        field3594 = null;
    }

    @OriginalMember(owner = "client!od", name = "c", descriptor = "(I)V", line = 555)
    private final void method1462(int arg0) {
        int var2 = (this.field3587 << 7) + 64;
        field3576++;
        this.field3579 = 1.0F / (float) (var2 * var2);
        if (arg0 != -28108) {
            this.field3575 = 3;
        }
    }

    @OriginalMember(owner = "client!od", name = "<init>", descriptor = "()V", line = 781)
    protected class209() {
        if (class37.field549 == null) {
            class278.method1867(123);
        }
        this.method1463(-84);
    }

    @OriginalMember(owner = "client!od", name = "<init>", descriptor = "(Lbb;)V", line = 796)
    public class209(class134 arg0) {
        if (class37.field549 == null) {
            class278.method1867(-111);
        }
        this.field3590 = arg0.method948(-125);
        this.field3588 = (this.field3590 & 0x10) != 0;
        this.field3563 = (this.field3590 & 0x8) != 0;
        this.field3590 &= 0x7;
        this.field3577 = arg0.method942(true);
        this.field3570 = arg0.method942(true);
        this.field3567 = arg0.method942(true);
        this.field3587 = arg0.method948(-122);
        this.method1462(-28108);
        this.field3580 = new short[this.field3587 * 2 + 1];
        for (int var2 = 0; var2 < this.field3580.length; var2++) {
            this.field3580[var2] = (short) arg0.method942(true);
        }
        this.field3564 = class236.field3979[arg0.method942(true)];
        int var3 = arg0.method948(-122);
        this.field3572 = var3 & 0x1F;
        this.field3575 = (var3 & 0xE0) << 3;
        this.method1463(-99);
    }

    @OriginalMember(owner = "client!od", name = "d", descriptor = "(I)V", line = 578)
    private final void method1463(int arg0) {
        if (arg0 >= -74) {
            return;
        }
        field3574++;
        int var2 = this.field3572;
        if (var2 == 2) {
            this.field3595 = 0;
            this.field3585 = 2048;
            this.field3578 = 2048;
            this.field3583 = 1;
        } else if (var2 == 3) {
            this.field3585 = 2048;
            this.field3578 = 4096;
            this.field3595 = 0;
            this.field3583 = 1;
        } else if (var2 == 4) {
            this.field3578 = 2048;
            this.field3583 = 4;
            this.field3585 = 2048;
            this.field3595 = 0;
        } else if (var2 == 5) {
            this.field3578 = 8192;
            this.field3585 = 2048;
            this.field3595 = 0;
            this.field3583 = 4;
        } else if (var2 == 12) {
            this.field3583 = 2;
            this.field3595 = 0;
            this.field3578 = 2048;
            this.field3585 = 2048;
        } else if (var2 == 13) {
            this.field3595 = 0;
            this.field3578 = 8192;
            this.field3585 = 2048;
            this.field3583 = 2;
        } else if (var2 == 10) {
            this.field3585 = 512;
            this.field3583 = 3;
            this.field3595 = 1536;
            this.field3578 = 2048;
        } else if (var2 == 11) {
            this.field3578 = 4096;
            this.field3595 = 1536;
            this.field3585 = 512;
            this.field3583 = 3;
        } else if (var2 == 6) {
            this.field3578 = 2048;
            this.field3585 = 768;
            this.field3583 = 3;
            this.field3595 = 1280;
        } else if (var2 == 7) {
            this.field3585 = 768;
            this.field3583 = 3;
            this.field3595 = 1280;
            this.field3578 = 4096;
        } else if (var2 == 8) {
            this.field3585 = 1024;
            this.field3595 = 1024;
            this.field3578 = 2048;
            this.field3583 = 3;
        } else if (var2 == 9) {
            this.field3585 = 1024;
            this.field3595 = 1024;
            this.field3578 = 4096;
            this.field3583 = 3;
        } else if (var2 == 14) {
            this.field3583 = 1;
            this.field3595 = 1280;
            this.field3578 = 2048;
            this.field3585 = 768;
        } else if (var2 == 15) {
            this.field3578 = 4096;
            this.field3585 = 512;
            this.field3595 = 1536;
            this.field3583 = 1;
        } else if (var2 == 16) {
            this.field3578 = 8192;
            this.field3585 = 256;
            this.field3583 = 1;
            this.field3595 = 1792;
        } else {
            this.field3585 = 2048;
            this.field3595 = 0;
            this.field3583 = 0;
            this.field3578 = 2048;
        }
    }
}
