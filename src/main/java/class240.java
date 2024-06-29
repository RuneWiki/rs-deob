import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vh")
public class class240 implements class113 {

    @OriginalMember(owner = "client!vh", name = "m", descriptor = "[Ljf;")
    private class143[] field3452 = new class143[9];

    @OriginalMember(owner = "client!vh", name = "q", descriptor = "I")
    private int field3456 = 0;

    @OriginalMember(owner = "client!vh", name = "x", descriptor = "I")
    private int field3463 = -1;

    @OriginalMember(owner = "client!vh", name = "D", descriptor = "Lvj;")
    private class303 field3469;

    @OriginalMember(owner = "client!vh", name = "p", descriptor = "I")
    private int field3455;

    @OriginalMember(owner = "client!vh", name = "h", descriptor = "[S")
    public static short[] field3447 = new short[256];

    @OriginalMember(owner = "client!vh", name = "o", descriptor = "[[I")
    public static int[][] field3454 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 1, 1, 7 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 10 }, { 12, 12, 12, 12 } };

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "I")
    public static int field3440;

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "I")
    public static int field3441;

    @OriginalMember(owner = "client!vh", name = "c", descriptor = "I")
    public static int field3442;

    @OriginalMember(owner = "client!vh", name = "d", descriptor = "I")
    public static int field3443;

    @OriginalMember(owner = "client!vh", name = "e", descriptor = "I")
    private int field3444;

    @OriginalMember(owner = "client!vh", name = "f", descriptor = "I")
    public static int field3445;

    @OriginalMember(owner = "client!vh", name = "g", descriptor = "I")
    public static int field3446;

    @OriginalMember(owner = "client!vh", name = "i", descriptor = "I")
    public static int field3448;

    @OriginalMember(owner = "client!vh", name = "j", descriptor = "I")
    public static int field3449;

    @OriginalMember(owner = "client!vh", name = "k", descriptor = "I")
    public static int field3450;

    @OriginalMember(owner = "client!vh", name = "l", descriptor = "I")
    public static int field3451;

    @OriginalMember(owner = "client!vh", name = "n", descriptor = "I")
    public static int field3453;

    @OriginalMember(owner = "client!vh", name = "r", descriptor = "I")
    private int field3457;

    @OriginalMember(owner = "client!vh", name = "s", descriptor = "I")
    public static int field3458;

    @OriginalMember(owner = "client!vh", name = "t", descriptor = "I")
    public static int field3459;

    @OriginalMember(owner = "client!vh", name = "u", descriptor = "I")
    public static int field3460;

    @OriginalMember(owner = "client!vh", name = "v", descriptor = "I")
    public static int field3461;

    @OriginalMember(owner = "client!vh", name = "w", descriptor = "I")
    private int field3462;

    @OriginalMember(owner = "client!vh", name = "y", descriptor = "I")
    public static int field3464;

    @OriginalMember(owner = "client!vh", name = "z", descriptor = "I")
    public static int field3465;

    @OriginalMember(owner = "client!vh", name = "A", descriptor = "I")
    public static int field3466;

    @OriginalMember(owner = "client!vh", name = "B", descriptor = "I")
    public static int field3467;

    @OriginalMember(owner = "client!vh", name = "C", descriptor = "I")
    public static int field3468;

    @OriginalMember(owner = "client!vh", name = "E", descriptor = "I")
    public static int field3470;

    @OriginalMember(owner = "client!vh", name = "F", descriptor = "I")
    public static int field3471;

    @OriginalMember(owner = "client!vh", name = "H", descriptor = "I")
    public static int field3472;

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(IILmf;I)V", line = 5)
    private final void method1559(int arg0, int arg1, class286 arg2, int arg3) {
        field3465++;
        if (this.field3463 == -1) {
            throw new RuntimeException();
        }
        int var5 = 0x1 << arg0;
        if ((~var5 & this.field3457) == 0) {
            this.field3444 = arg2.field4076;
            this.field3462 = arg2.field4074;
        } else if (this.field3444 != arg2.field4076 || this.field3462 != arg2.field4074) {
            throw new RuntimeException();
        }
        arg2.method1824(this.field3463, class170.field2637[arg0], arg1 - 37318, arg3);
        this.field3452[arg0] = arg2;
        if (arg1 == 27768) {
            this.field3457 |= var5;
        }
    }

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "(B)V", line = 37)
    public static void method1560(byte arg0) {
        field3447 = null;
        field3454 = null;
        if (arg0 != 32) {
            method1562(-42);
        }
    }

    @OriginalMember(owner = "client!vh", name = "c", descriptor = "(B)I", line = 51)
    public final int method1561(byte arg0) {
        field3440++;
        if (arg0 <= 118) {
            this.field3452 = null;
        }
        return this.field3462;
    }

    @OriginalMember(owner = "client!vh", name = "f", descriptor = "(I)Z", line = 65)
    public static final boolean method1562(int arg0) {
        field3466++;
        try {
            if (class289.field4118 == 2) {
                if (class90.field1563 == null) {
                    class90.field1563 = class273.method1755(class488.field7226, class406.field6095, class281.field4024);
                    if (class90.field1563 == null) {
                        return false;
                    }
                }
                if (class511.field7536 == null) {
                    class511.field7536 = new class114(class253.field3639, class294.field4193);
                }
                if (class315.field4741.method2800(0, class90.field1563, 22050, class221.field3174, class511.field7536)) {
                    class315.field4741.method2812(arg0 + 119);
                    class315.field4741.method2822(15, class102.field1693);
                    class315.field4741.method2798(class219.field3158, class90.field1563, (byte) 101);
                    class488.field7226 = null;
                    class511.field7536 = null;
                    class289.field4118 = 0;
                    class90.field1563 = null;
                    return true;
                }
            }
        } catch (Exception var2) {
            var2.printStackTrace();
            class315.field4741.method2824(-31449);
            class90.field1563 = null;
            class488.field7226 = null;
            class289.field4118 = 0;
            class511.field7536 = null;
        }
        if (arg0 != 0) {
            method1573(16, 120, 83, 50, -4, -114, -115, null, -74, -0.046464864F);
        }
        return false;
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(I)V", line = 117)
    public final void method839(int arg0) {
        OpenGL.glBindFramebufferEXT(36009, this.field3455);
        field3464++;
        this.field3456 |= 0x2;
        this.field3463 = this.method1572((byte) -112);
        if (arg0 != 20433) {
            method1560((byte) 108);
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(B)V", line = 134)
    public final void method844(byte arg0) {
        field3472++;
        OpenGL.glBindFramebufferEXT(36160, this.field3455);
        if (arg0 != 22) {
            this.method1559(-75, 102, null, 70);
        }
        this.field3456 |= 0x4;
        this.field3463 = this.method1572((byte) -112);
    }

    @OriginalMember(owner = "client!vh", name = "c", descriptor = "(I)V", line = 147)
    public final void method841(int arg0) {
        OpenGL.glBindFramebufferEXT(36008, this.field3455);
        field3448++;
        if (arg0 >= -74) {
            this.method840(-21);
        }
        this.field3456 |= 0x1;
        this.field3463 = this.method1572((byte) -112);
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(IILrd;I)V", line = 163)
    public final void method1563(int arg0, int arg1, class221 arg2, int arg3) {
        if (arg0 == -2302) {
            this.method1571(arg3, arg2, 0, (byte) 21, arg1);
            field3451++;
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(II)V", line = 175)
    public final void method1564(int arg0, int arg1) {
        if (this.field3452[arg0] != null) {
            this.field3452[arg0].method1055((byte) -115);
        }
        field3460++;
        this.field3457 &= ~(0x1 << arg0);
        this.field3452[arg0] = null;
        if (arg1 <= 45) {
            method1560((byte) -4);
        }
    }

    @OriginalMember(owner = "client!vh", name = "e", descriptor = "(I)V", line = 191)
    public final void method843(int arg0) {
        if (arg0 != -13658) {
            this.field3457 = 50;
        }
        field3468++;
        OpenGL.glBindFramebufferEXT(36008, 0);
        this.field3456 &= 0xFFFFFFFE;
        this.field3463 = this.method1572((byte) -112);
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(ILip;I)V", line = 204)
    public final void method1565(int arg0, class497 arg1, int arg2) {
        field3461++;
        if (~this.field3463 == arg2) {
            throw new RuntimeException();
        }
        int var4 = 0x1 << arg0;
        if ((this.field3457 & ~var4) == 0) {
            this.field3462 = arg1.field7349;
            this.field3444 = arg1.field7338;
        } else if (this.field3444 != arg1.field7338 || this.field3462 != arg1.field7349) {
            throw new RuntimeException();
        }
        arg1.method2983((byte) -80, class170.field2637[arg0], this.field3463);
        this.field3452[arg0] = arg1;
        this.field3457 |= var4;
    }

    @OriginalMember(owner = "client!vh", name = "<init>", descriptor = "(Lvj;)V", line = 540)
    public class240(class303 arg0) {
        if (!arg0.field4532) {
            throw new IllegalStateException("");
        }
        this.field3469 = arg0;
        OpenGL.glGenFramebuffersEXT(1, class286.field4084, 0);
        this.field3455 = class286.field4084[0];
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(BI)V", line = 241)
    public final void method1566(byte arg0, int arg1) {
        field3443++;
        if (this.field3463 == -1) {
            throw new RuntimeException();
        }
        OpenGL.glReadBuffer(class170.field2637[arg1]);
        if (arg0 < 57) {
            this.field3457 = -47;
        }
    }

    @OriginalMember(owner = "client!vh", name = "g", descriptor = "(I)Z", line = 255)
    public final boolean method1567(int arg0) {
        field3441++;
        int var2 = -49 / ((arg0 + 31) / 41);
        int var3 = OpenGL.glCheckFramebufferStatusEXT(this.field3463);
        return var3 == 36053;
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(ZLcu;)V", line = 275)
    public static final void method1568(boolean arg0, class145 arg1) {
        field3446++;
        if (arg0) {
            field3454 = null;
        }
        if ((arg1.field2270.length - arg1.field2289) < 1) {
            return;
        }
        int var2 = arg1.method1063((byte) -29);
        if (var2 < 0 || var2 > 1 || arg1.field2270.length - arg1.field2289 < 2) {
            return;
        }
        int var3 = arg1.method1069((byte) -7);
        if (var3 * 6 != arg1.field2270.length - arg1.field2289) {
            return;
        }
        while (true) {
            int var4;
            int var5;
            do {
                do {
                    do {
                        if (arg1.field2270.length <= arg1.field2289) {
                            return;
                        }
                        var4 = arg1.method1069((byte) -122);
                        var5 = arg1.method1070(-32387);
                    } while (class170.field2629.length <= var4);
                } while (!class255.field3672[var4]);
            } while (class390.field5911.method1400(-93, var4).field2376 == '1' && (var5 < -1 || var5 > 1));
            class170.field2629[var4] = var5;
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(ZB)V", line = 321)
    public static final void method1569(boolean arg0, byte arg1) {
        field3449++;
        class165.field2542++;
        if (arg1 >= -64) {
            method1560((byte) -124);
        }
        class28.method321(class432.field6424, -5001);
        for (class352 var2 = (class352) class162.field2507.method160((byte) -20); var2 != null; var2 = (class352) class162.field2507.method163(124)) {
            if (!var2.method2091((byte) -121)) {
                var2 = (class352) class162.field2507.method160((byte) -20);
                if (var2 == null) {
                    break;
                }
            }
            if (var2.field5390 == 0) {
                class123.method946(true, arg0, var2, (byte) -50);
            }
        }
        if (class162.field2513 != null) {
            class302.method1902((byte) -112, class162.field2513);
            class162.field2513 = null;
        }
    }

    @OriginalMember(owner = "client!vh", name = "finalize", descriptor = "()V", line = 361)
    protected final void finalize() throws Throwable {
        field3459++;
        this.field3469.method1928(this.field3455, 260);
        super.finalize();
    }

    @OriginalMember(owner = "client!vh", name = "h", descriptor = "(I)V", line = 376)
    public static final void method1570(int arg0) {
        if (arg0 != 3) {
            field3447 = null;
        }
        class271.field3908.method488(-3);
        field3471++;
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(ILrd;IBI)V", line = 393)
    private final void method1571(int arg0, class221 arg1, int arg2, byte arg3, int arg4) {
        field3442++;
        if (this.field3463 == -1) {
            throw new RuntimeException();
        }
        int var6 = 0x1 << arg0;
        if ((this.field3457 & ~var6) == 0) {
            this.field3444 = arg1.field3173;
            this.field3462 = arg1.field3173;
        } else if (this.field3444 != arg1.field3173 || this.field3462 != arg1.field3173) {
            throw new RuntimeException();
        }
        arg1.method1471(arg4, true, class170.field2637[arg0], this.field3463, arg2);
        if (arg3 == 21) {
            this.field3452[arg0] = arg1;
            this.field3457 |= var6;
        }
    }

    @OriginalMember(owner = "client!vh", name = "d", descriptor = "(B)I", line = 425)
    private final int method1572(byte arg0) {
        field3470++;
        if ((this.field3456 & 0x4) != 0) {
            return 36160;
        } else if ((this.field3456 & 0x2) != 0) {
            return 36009;
        } else if ((this.field3456 & 0x1) == 0) {
            return arg0 == -112 ? -1 : 43;
        } else {
            return 36008;
        }
    }

    @OriginalMember(owner = "client!vh", name = "d", descriptor = "(I)V", line = 449)
    public final void method842(int arg0) {
        OpenGL.glBindFramebufferEXT(36160, 0);
        if (arg0 != -26504) {
            this.method1565(9, null, -34);
        }
        field3445++;
        this.field3456 &= 0xFFFFFFFB;
        this.field3463 = this.method1572((byte) -112);
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(IIIIIII[FIF)V", line = 471)
    public static final void method1573(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, float[] arg7, int arg8, float arg9) {
        int var10 = arg6 - arg5;
        int var11 = arg1 - arg8;
        int var12 = arg4 - arg2;
        field3467++;
        if (arg3 <= 74) {
            field3447 = null;
        }
        float var13 = arg7[2] * (float) var10 + arg7[1] * (float) var11 + arg7[0] * (float) var12;
        float var14 = arg7[5] * (float) var10 + arg7[3] * (float) var12 + arg7[4] * (float) var11;
        float var15 = arg7[8] * (float) var10 + arg7[7] * (float) var11 + arg7[6] * (float) var12;
        float var16 = (float) Math.sqrt((double) (var15 * var15 + var13 * var13 + var14 * var14));
        float var17 = (float) Math.atan2((double) var13, (double) var15) / 6.2831855F + 0.5F;
        float var18 = (float) Math.asin((double) (var14 / var16)) / 3.1415927F + arg9 + 0.5F;
        if (arg0 == 1) {
            float var19 = var17;
            var17 = -var18;
            var18 = var19;
        } else if (arg0 == 2) {
            var17 = -var17;
            var18 = -var18;
        } else if (arg0 == 3) {
            float var20 = var17;
            var17 = var18;
            var18 = -var20;
        }
        class221.field3172 = var18;
        class259.field3770 = var17;
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(IBLmf;)V", line = 524)
    public final void method1574(int arg0, byte arg1, class286 arg2) {
        field3453++;
        this.method1559(arg0, 27768, arg2, 0);
        if (arg1 <= 75) {
            this.field3455 = -109;
        }
    }

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "(I)V", line = 554)
    public final void method840(int arg0) {
        OpenGL.glBindFramebufferEXT(36009, 0);
        field3450++;
        if (arg0 != 18847) {
            this.method1572((byte) -81);
        }
        this.field3456 &= 0xFFFFFFFD;
        this.field3463 = this.method1572((byte) -112);
    }

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "(II)V", line = 567)
    public final void method1575(int arg0, int arg1) {
        field3458++;
        if (arg1 != 2) {
            field3447 = null;
        }
        if (this.field3463 == -1) {
            throw new RuntimeException();
        }
        OpenGL.glDrawBuffer(class170.field2637[arg0]);
    }
}
