import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bq")
public class class727 implements class331 {

    @OriginalMember(owner = "client!bq", name = "h", descriptor = "I")
    private int field10119 = 0;

    @OriginalMember(owner = "client!bq", name = "s", descriptor = "[Lsfa;")
    private class200[] field10130 = new class200[9];

    @OriginalMember(owner = "client!bq", name = "B", descriptor = "I")
    private int field10139 = -1;

    @OriginalMember(owner = "client!bq", name = "t", descriptor = "Llea;")
    private class573 field10131;

    @OriginalMember(owner = "client!bq", name = "d", descriptor = "I")
    private int field10115;

    @OriginalMember(owner = "client!bq", name = "r", descriptor = "I")
    public static int field10129 = 0;

    @OriginalMember(owner = "client!bq", name = "w", descriptor = "I")
    public static int field10134 = -1;

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "I")
    public static int field10112;

    @OriginalMember(owner = "client!bq", name = "b", descriptor = "I")
    public static int field10113;

    @OriginalMember(owner = "client!bq", name = "c", descriptor = "I")
    public static int field10114;

    @OriginalMember(owner = "client!bq", name = "e", descriptor = "I")
    public static int field10116;

    @OriginalMember(owner = "client!bq", name = "f", descriptor = "I")
    public static int field10117;

    @OriginalMember(owner = "client!bq", name = "g", descriptor = "I")
    private int field10118;

    @OriginalMember(owner = "client!bq", name = "i", descriptor = "I")
    public static int field10120;

    @OriginalMember(owner = "client!bq", name = "j", descriptor = "I")
    public static int field10121;

    @OriginalMember(owner = "client!bq", name = "k", descriptor = "I")
    public static int field10122;

    @OriginalMember(owner = "client!bq", name = "l", descriptor = "I")
    public static int field10123;

    @OriginalMember(owner = "client!bq", name = "m", descriptor = "I")
    public static int field10124;

    @OriginalMember(owner = "client!bq", name = "n", descriptor = "I")
    public static int field10125;

    @OriginalMember(owner = "client!bq", name = "o", descriptor = "I")
    public static int field10126;

    @OriginalMember(owner = "client!bq", name = "q", descriptor = "I")
    public static int field10128;

    @OriginalMember(owner = "client!bq", name = "u", descriptor = "I")
    public static int field10132;

    @OriginalMember(owner = "client!bq", name = "v", descriptor = "I")
    public static int field10133;

    @OriginalMember(owner = "client!bq", name = "x", descriptor = "I")
    public static int field10135;

    @OriginalMember(owner = "client!bq", name = "y", descriptor = "I")
    public static int field10136;

    @OriginalMember(owner = "client!bq", name = "z", descriptor = "I")
    private int field10137;

    @OriginalMember(owner = "client!bq", name = "A", descriptor = "I")
    public static int field10138;

    @OriginalMember(owner = "client!bq", name = "C", descriptor = "I")
    private int field10140;

    @OriginalMember(owner = "client!bq", name = "D", descriptor = "I")
    public static int field10141;

    @OriginalMember(owner = "client!bq", name = "E", descriptor = "I")
    public static int field10142;

    @OriginalMember(owner = "client!bq", name = "p", descriptor = "Lmq;")
    public static class85 field10127;

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(IILoh;IZ)V", line = 3)
    private final void method4028(int arg0, int arg1, class653 arg2, int arg3, boolean arg4) {
        field10138++;
        if (this.field10139 == -1) {
            throw new RuntimeException();
        }
        int var6 = 0x1 << arg1;
        if (!arg4) {
            return;
        }
        if ((this.field10137 & ~var6) == 0) {
            this.field10140 = arg2.field9240;
            this.field10118 = arg2.field9240;
        } else if (this.field10140 != arg2.field9240 || this.field10118 != arg2.field9240) {
            throw new RuntimeException();
        }
        arg2.method3676(class86.field1287[arg1], 124, arg3, arg0, this.field10139);
        this.field10130[arg1] = arg2;
        this.field10137 |= var6;
    }

    @OriginalMember(owner = "client!bq", name = "c", descriptor = "(I)V", line = 34)
    public final void method2022(int arg0) {
        OpenGL.glBindFramebufferEXT(36008, this.field10115);
        field10128++;
        this.field10119 |= 0x1;
        if (arg0 != -27546) {
            field10129 = 52;
        }
        this.field10139 = this.method4039((byte) 47);
    }

    @OriginalMember(owner = "client!bq", name = "c", descriptor = "(Z)V", line = 48)
    public static void method4029(boolean arg0) {
        field10127 = null;
        if (!arg0) {
            field10129 = -5;
        }
    }

    @OriginalMember(owner = "client!bq", name = "finalize", descriptor = "()V", line = 58)
    protected final void finalize() throws Throwable {
        this.field10131.method3316(8448, this.field10115);
        field10142++;
        super.finalize();
    }

    @OriginalMember(owner = "client!bq", name = "b", descriptor = "(Z)V", line = 70)
    public final void method2024(boolean arg0) {
        field10112++;
        OpenGL.glBindFramebufferEXT(36009, 0);
        this.field10119 &= 0xFFFFFFFD;
        if (arg0) {
            this.field10139 = this.method4039((byte) 46);
        }
    }

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(IIILwi;)V", line = 89)
    private final void method4030(int arg0, int arg1, int arg2, class504 arg3) {
        field10122++;
        if (this.field10139 == -1) {
            throw new RuntimeException();
        }
        int var5 = 0x1 << arg2;
        if ((this.field10137 & ~var5) == 0) {
            this.field10140 = arg3.field6926;
            this.field10118 = arg3.field6927;
        } else if (this.field10140 != arg3.field6926 || this.field10118 != arg3.field6927) {
            throw new RuntimeException();
        }
        arg3.method2951(this.field10139, 3314, class86.field1287[arg2], arg0);
        if (arg1 == 4074) {
            this.field10130[arg2] = arg3;
            this.field10137 |= var5;
        }
    }

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(II)V", line = 120)
    public final void method4031(int arg0, int arg1) {
        field10132++;
        if (this.field10139 == -1) {
            throw new RuntimeException();
        }
        if (arg0 != 7) {
            this.method4032(-2);
        }
        OpenGL.glDrawBuffer(class86.field1287[arg1]);
    }

    @OriginalMember(owner = "client!bq", name = "b", descriptor = "(I)V", line = 136)
    public final void method2021(int arg0) {
        field10125++;
        OpenGL.glBindFramebufferEXT(36008, 0);
        this.field10119 &= 0xFFFFFFFE;
        this.field10139 = this.method4039((byte) 23);
        if (arg0 != 8690) {
            this.method4039((byte) -114);
        }
    }

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(I)V", line = 158)
    public final void method2020(int arg0) {
        OpenGL.glBindFramebufferEXT(36160, 0);
        field10114++;
        this.field10119 &= 0xFFFFFFFB;
        if (arg0 <= 0) {
            field10123 = -11;
        }
        this.field10139 = this.method4039((byte) -86);
    }

    @OriginalMember(owner = "client!bq", name = "e", descriptor = "(I)Z", line = 173)
    public final boolean method4032(int arg0) {
        if (arg0 != 0) {
            this.field10115 = -74;
        }
        field10121++;
        int var2 = OpenGL.glCheckFramebufferStatusEXT(this.field10139);
        return var2 == 36053;
    }

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(IILwi;)V", line = 193)
    public final void method4033(int arg0, int arg1, class504 arg2) {
        field10136++;
        this.method4030(arg0, 4074, arg1, arg2);
    }

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(Lra;II)V", line = 201)
    public final void method4034(class399 arg0, int arg1, int arg2) {
        field10113++;
        if (this.field10139 == -1) {
            throw new RuntimeException();
        }
        int var4 = arg1 << arg2;
        if ((this.field10137 & ~var4) == 0) {
            this.field10140 = arg0.field5506;
            this.field10118 = arg0.field5503;
        } else if (this.field10140 != arg0.field5506 || this.field10118 != arg0.field5503) {
            throw new RuntimeException();
        }
        arg0.method2372((byte) 124, this.field10139, class86.field1287[arg2]);
        this.field10130[arg2] = arg0;
        this.field10137 |= var4;
    }

    @OriginalMember(owner = "client!bq", name = "f", descriptor = "(I)V", line = 231)
    public static final void method4035(int arg0) {
        field10116++;
        class613.field8701.method161(true);
        class452.field6197.method3211((byte) 107);
        class38.field451.method2916(3);
        class312.field4418.method371((byte) 53);
        class677.field9511.method3698(-74);
        class422.field5873.method2933(87);
        class168.field2552.method3285(true);
        class620.field8760.method1826(6);
        class600.field8552.method3552(false);
        class4.field60.method3715(8);
        class662.field9323.method1708(64);
        class150.field2404.method1770((byte) -111);
        class309.field4401.method655(true);
        class451.field6195.method4110(-9740);
        class523.field7326.method2673(-123);
        class498.field6854.method3438(-98);
        class648.field9192.method2365(false);
        class606.field8616.method1217((byte) -128);
        class402.field5547.method1470(-68);
        class422.field5876.method3117(36);
        class233.field3382.method3413((byte) -123);
        if (arg0 >= -12) {
            method4029(false);
        }
        class153.field2446.method2729(true);
        class170.method1257((byte) 84);
        class605.method3511(7);
        class461.method2693(-73);
        class402.method2387((byte) -25);
        if (class94.field1340 != class145.field2353) {
            for (int var1 = 0; var1 < class351.field4977.length; var1++) {
                class351.field4977[var1] = null;
            }
            class280.field4037 = 0;
        }
        class629.method3593((byte) -107);
        client.method904(3078);
        class515.method3027((byte) 113);
        class266.method1712(-26261);
        class48.method375(1);
        class46.field621.method2881((byte) -78);
        class686.field9702.method490();
        class659.method3692(3);
        class313.method1911((byte) 112);
        class161.field2494.method2992((byte) -30);
        class679.field9599.method2992((byte) 104);
        class461.field6293.method2992((byte) -119);
        class427.field5919.method2992((byte) 113);
        class12.field151.method2992((byte) 116);
        class562.field7790.method2992((byte) 90);
        class399.field5495.method2992((byte) -7);
        class762.field10561.method2992((byte) 17);
        class176.field2648.method2992((byte) 123);
        class227.field3308.method2992((byte) 110);
        class234.field3395.method2992((byte) 106);
        class397.field5478.method2992((byte) 123);
        class522.field7317.method2992((byte) -94);
        class77.field1161.method2992((byte) -40);
        class224.field3296.method2992((byte) -96);
        class104.field1517.method2992((byte) 98);
        class265.field3739.method2992((byte) 125);
        class123.field2091.method2992((byte) 113);
        class724.field10088.method2992((byte) 117);
        class469.field6386.method2992((byte) -9);
        class629.field8924.method2992((byte) 101);
        class58.field898.method2992((byte) 113);
        class216.field3156.method2992((byte) 109);
        class576.field8310.method2992((byte) 5);
        class275.field3849.method2992((byte) -23);
        class194.field2908.method2992((byte) -4);
        class40.field467.method2992((byte) 101);
        class272.field3829.method2992((byte) 93);
        class636.field8992.method2992((byte) 120);
        class725.field10100.method2992((byte) 125);
        class144.field2338.method2992((byte) 114);
        class570.field7914.method2992((byte) 16);
        class30.field334.method2992((byte) 113);
        class5.field69.method2881((byte) -126);
        class126.field2150.method2881((byte) -124);
        class267.field3772.method2881((byte) -64);
        class356.field5053.method2881((byte) -111);
    }

    @OriginalMember(owner = "client!bq", name = "b", descriptor = "(II)V", line = 327)
    public final void method4036(int arg0, int arg1) {
        field10124++;
        if (this.field10130[arg1] != null) {
            this.field10130[arg1].method1359(3314);
        }
        this.field10137 &= ~(arg0 << arg1);
        this.field10130[arg1] = null;
    }

    @OriginalMember(owner = "client!bq", name = "d", descriptor = "(I)V", line = 343)
    public final void method2023(int arg0) {
        field10135++;
        OpenGL.glBindFramebufferEXT(36160, this.field10115);
        if (arg0 != -32551) {
            this.method2019(true);
        }
        this.field10119 |= 0x4;
        this.field10139 = this.method4039((byte) -119);
    }

    @OriginalMember(owner = "client!bq", name = "<init>", descriptor = "(Llea;)V", line = 470)
    public class727(class573 arg0) {
        if (!arg0.field8207) {
            throw new IllegalStateException("");
        }
        this.field10131 = arg0;
        OpenGL.glGenFramebuffersEXT(1, class447.field6173, 0);
        this.field10115 = class447.field6173[0];
    }

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(IIIIIII)I", line = 362)
    public static final int method4037(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if ((arg0 & 0x1) == 1) {
            int var7 = arg3;
            arg3 = arg5;
            arg5 = var7;
        }
        field10117++;
        int var8 = arg4 & 0x3;
        if (arg2 != 29356) {
            return -76;
        } else if (var8 == 0) {
            return arg6;
        } else if (var8 == 1) {
            return arg1;
        } else if (var8 == 2) {
            return 1 + 7 - arg3 - arg6;
        } else {
            return 7 + 1 - arg1 - arg5;
        }
    }

    @OriginalMember(owner = "client!bq", name = "c", descriptor = "(II)V", line = 392)
    public final void method4038(int arg0, int arg1) {
        field10133++;
        if (this.field10139 == -1) {
            throw new RuntimeException();
        }
        OpenGL.glReadBuffer(class86.field1287[arg1]);
        if (arg0 != 10498) {
            this.method4031(115, -30);
        }
    }

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(Z)V", line = 408)
    public final void method2019(boolean arg0) {
        if (arg0) {
            this.method2023(91);
        }
        OpenGL.glBindFramebufferEXT(36009, this.field10115);
        field10126++;
        this.field10119 |= 0x2;
        this.field10139 = this.method4039((byte) -112);
    }

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(B)I", line = 422)
    private final int method4039(byte arg0) {
        int var2 = -1 % ((-arg0 - 39) / 44);
        field10141++;
        if ((this.field10119 & 0x4) != 0) {
            return 36160;
        } else if ((this.field10119 & 0x2) == 0) {
            return (this.field10119 & 0x1) == 0 ? -1 : 36008;
        } else {
            return 36009;
        }
    }

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(Loh;III)V", line = 452)
    public final void method4040(class653 arg0, int arg1, int arg2, int arg3) {
        if (arg1 == 16) {
            field10120++;
            this.method4028(0, arg2, arg0, arg3, true);
        }
    }
}
