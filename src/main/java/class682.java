import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mj")
public class class682 implements class185 {

    @OriginalMember(owner = "client!mj", name = "m", descriptor = "I")
    private int field9592 = 0;

    @OriginalMember(owner = "client!mj", name = "n", descriptor = "[Lsga;")
    private class75[] field9593 = new class75[9];

    @OriginalMember(owner = "client!mj", name = "w", descriptor = "I")
    private int field9602 = -1;

    @OriginalMember(owner = "client!mj", name = "A", descriptor = "Ldia;")
    private class246 field9606;

    @OriginalMember(owner = "client!mj", name = "G", descriptor = "I")
    private int field9611;

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "I")
    public static int field9580;

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "I")
    public static int field9581;

    @OriginalMember(owner = "client!mj", name = "c", descriptor = "I")
    public static int field9582;

    @OriginalMember(owner = "client!mj", name = "d", descriptor = "I")
    public static int field9583;

    @OriginalMember(owner = "client!mj", name = "e", descriptor = "I")
    public static int field9584;

    @OriginalMember(owner = "client!mj", name = "f", descriptor = "I")
    public static int field9585;

    @OriginalMember(owner = "client!mj", name = "g", descriptor = "I")
    public static int field9586;

    @OriginalMember(owner = "client!mj", name = "i", descriptor = "I")
    public static int field9588;

    @OriginalMember(owner = "client!mj", name = "j", descriptor = "I")
    public static int field9589;

    @OriginalMember(owner = "client!mj", name = "k", descriptor = "I")
    public static int field9590;

    @OriginalMember(owner = "client!mj", name = "l", descriptor = "I")
    public static int field9591;

    @OriginalMember(owner = "client!mj", name = "o", descriptor = "I")
    public static int field9594;

    @OriginalMember(owner = "client!mj", name = "p", descriptor = "I")
    public static int field9595;

    @OriginalMember(owner = "client!mj", name = "q", descriptor = "I")
    private int field9596;

    @OriginalMember(owner = "client!mj", name = "r", descriptor = "I")
    public static int field9597;

    @OriginalMember(owner = "client!mj", name = "s", descriptor = "I")
    public static int field9598;

    @OriginalMember(owner = "client!mj", name = "t", descriptor = "I")
    public static int field9599;

    @OriginalMember(owner = "client!mj", name = "u", descriptor = "I")
    public static int field9600;

    @OriginalMember(owner = "client!mj", name = "v", descriptor = "I")
    public static int field9601;

    @OriginalMember(owner = "client!mj", name = "x", descriptor = "I")
    private int field9603;

    @OriginalMember(owner = "client!mj", name = "y", descriptor = "I")
    public static int field9604;

    @OriginalMember(owner = "client!mj", name = "z", descriptor = "I")
    public static int field9605;

    @OriginalMember(owner = "client!mj", name = "B", descriptor = "I")
    public static int field9607;

    @OriginalMember(owner = "client!mj", name = "C", descriptor = "I")
    public static int field9608;

    @OriginalMember(owner = "client!mj", name = "D", descriptor = "I")
    private int field9609;

    @OriginalMember(owner = "client!mj", name = "F", descriptor = "I")
    public static int field9610;

    @OriginalMember(owner = "client!mj", name = "h", descriptor = "J")
    public static long field9587;

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(IBI)Z", line = 6)
    public static final boolean method3785(int arg0, byte arg1, int arg2) {
        if (arg1 == -11) {
            field9582++;
            return (arg0 & 0x10) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(BI)V", line = 17)
    public final void method3786(byte arg0, int arg1) {
        field9597++;
        if (arg0 > -120) {
            return;
        }
        if (this.field9602 == -1) {
            throw new RuntimeException();
        }
        OpenGL.glReadBuffer(class376.field5474[arg1]);
    }

    @OriginalMember(owner = "client!mj", name = "c", descriptor = "(B)Z", line = 33)
    public final boolean method3787(byte arg0) {
        field9604++;
        int var2 = OpenGL.glCheckFramebufferStatusEXT(this.field9602);
        if (var2 == 36053) {
            if (arg0 != 11) {
                field9587 = 19L;
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(IIIILefa;)V", line = 53)
    private final void method3788(int arg0, int arg1, int arg2, int arg3, class196 arg4) {
        field9600++;
        if (~this.field9602 == arg3) {
            throw new RuntimeException();
        }
        int var6 = 0x1 << arg1;
        if ((this.field9603 & ~var6) == 0) {
            this.field9609 = arg4.field2623;
            this.field9596 = arg4.field2623;
        } else if (this.field9596 != arg4.field2623 || this.field9609 != arg4.field2623) {
            throw new RuntimeException();
        }
        arg4.method1347(arg0, class376.field5474[arg1], this.field9602, arg2, (byte) -109);
        this.field9593[arg1] = arg4;
        this.field9603 |= var6;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(IBLtca;)V", line = 84)
    public final void method3789(int arg0, byte arg1, class184 arg2) {
        field9594++;
        this.method3791(0, arg2, false, arg0);
        if (arg1 != -93) {
            this.method3790(null, -103, -26, 22);
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(Lefa;III)V", line = 99)
    public final void method3790(class196 arg0, int arg1, int arg2, int arg3) {
        if (arg2 == 23590) {
            field9590++;
            this.method3788(0, arg1, arg3, 0, arg0);
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(ILtca;ZI)V", line = 114)
    private final void method3791(int arg0, class184 arg1, boolean arg2, int arg3) {
        field9583++;
        if (this.field9602 == -1) {
            throw new RuntimeException();
        }
        if (arg2) {
            this.method3787((byte) 55);
        }
        int var5 = 0x1 << arg3;
        if ((this.field9603 & ~var5) == 0) {
            this.field9609 = arg1.field2465;
            this.field9596 = arg1.field2476;
        } else if (this.field9596 != arg1.field2476 || this.field9609 != arg1.field2465) {
            throw new RuntimeException();
        }
        arg1.method1279(this.field9602, (byte) -69, class376.field5474[arg3], arg0);
        this.field9593[arg3] = arg1;
        this.field9603 |= var5;
    }

    @OriginalMember(owner = "client!mj", name = "finalize", descriptor = "()V", line = 147)
    protected final void finalize() throws Throwable {
        this.field9606.method1610(this.field9611, (byte) 11);
        field9610++;
        super.finalize();
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(I)V", line = 156)
    public final void method1282(int arg0) {
        OpenGL.glBindFramebufferEXT(36008, 0);
        field9585++;
        if (arg0 != -4055) {
            this.method3791(-122, null, true, 82);
        }
        this.field9592 &= 0xFFFFFFFE;
        this.field9602 = this.method3797((byte) 41);
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(II)V", line = 169)
    public final void method3792(int arg0, int arg1) {
        field9584++;
        if (this.field9593[arg0] != null) {
            this.field9593[arg0].method58(-1);
        }
        this.field9603 &= ~(0x1 << arg0);
        this.field9593[arg0] = null;
        if (arg1 != -10604) {
            this.method3791(28, null, false, -52);
        }
    }

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "(B)V", line = 184)
    public final void method1286(byte arg0) {
        OpenGL.glBindFramebufferEXT(36160, this.field9611);
        field9605++;
        this.field9592 |= 0x4;
        this.field9602 = this.method3797((byte) 41);
        int var2 = 101 % ((arg0 - 23) / 52);
    }

    @OriginalMember(owner = "client!mj", name = "d", descriptor = "(I)V", line = 196)
    public final void method1287(int arg0) {
        field9581++;
        if (arg0 >= -30) {
            this.field9592 = 11;
        }
        OpenGL.glBindFramebufferEXT(36009, this.field9611);
        this.field9592 |= 0x2;
        this.field9602 = this.method3797((byte) 41);
    }

    @OriginalMember(owner = "client!mj", name = "e", descriptor = "(I)Lqs;", line = 209)
    public static final class630 method3793(int arg0) {
        if (arg0 != 1) {
            method3798(121, -18);
        }
        field9591++;
        try {
            return (class630) Class.forName("hc").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(ILkq;I)V", line = 228)
    public final void method3794(int arg0, class620 arg1, int arg2) {
        field9580++;
        if (this.field9602 == -1) {
            throw new RuntimeException();
        } else if (arg0 == -14736) {
            int var4 = 0x1 << arg2;
            if ((this.field9603 & ~var4) == 0) {
                this.field9596 = arg1.field8362;
                this.field9609 = arg1.field8359;
            } else if (this.field9596 != arg1.field8362 || this.field9609 != arg1.field8359) {
                throw new RuntimeException();
            }
            arg1.method3405(this.field9602, (byte) 114, class376.field5474[arg2]);
            this.field9593[arg2] = arg1;
            this.field9603 |= var4;
        }
    }

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "(II)V", line = 264)
    public final void method3795(int arg0, int arg1) {
        field9607++;
        if (this.field9602 == -1) {
            throw new RuntimeException();
        }
        OpenGL.glDrawBuffer(class376.field5474[arg1]);
        if (arg0 <= 5) {
            this.field9609 = 43;
        }
    }

    @OriginalMember(owner = "client!mj", name = "<init>", descriptor = "(Ldia;)V", line = 511)
    public class682(class246 arg0) {
        if (!arg0.field3617) {
            throw new IllegalStateException("");
        }
        this.field9606 = arg0;
        OpenGL.glGenFramebuffersEXT(1, class456.field6332, 0);
        this.field9611 = class456.field6332[0];
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(BB)C", line = 283)
    public static final char method3796(byte arg0, byte arg1) {
        if (arg0 != 42) {
            method3799(-77, -26L);
        }
        field9608++;
        int var2 = arg1 & 0xFF;
        if (var2 == 0) {
            throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(var2, 16) + " provided");
        }
        if (var2 >= 128 && var2 < 160) {
            char var3 = class714.field9988[var2 - 128];
            if (var3 == '\u0000') {
                var3 = '?';
            }
            var2 = var3;
        }
        return (char) var2;
    }

    @OriginalMember(owner = "client!mj", name = "c", descriptor = "(I)V", line = 314)
    public final void method1285(int arg0) {
        field9598++;
        OpenGL.glBindFramebufferEXT(36009, 0);
        this.field9592 &= 0xFFFFFFFD;
        this.field9602 = this.method3797((byte) 41);
        if (arg0 != -16250) {
            this.field9593 = null;
        }
    }

    @OriginalMember(owner = "client!mj", name = "d", descriptor = "(B)I", line = 331)
    private final int method3797(byte arg0) {
        field9588++;
        if (arg0 != 41) {
            this.field9592 = 49;
        }
        if ((this.field9592 & 0x4) != 0) {
            return 36160;
        } else if ((this.field9592 & 0x2) == 0) {
            return (this.field9592 & 0x1) == 0 ? -1 : 36008;
        } else {
            return 36009;
        }
    }

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "(I)V", line = 353)
    public final void method1283(int arg0) {
        OpenGL.glBindFramebufferEXT(36160, 0);
        field9601++;
        this.field9592 &= 0xFFFFFFFB;
        if (arg0 != 15427) {
            this.method1282(114);
        }
        this.field9602 = this.method3797((byte) 41);
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(B)V", line = 366)
    public final void method1284(byte arg0) {
        OpenGL.glBindFramebufferEXT(36008, this.field9611);
        field9599++;
        int var2 = 10 % ((arg0 + 41) / 57);
        this.field9592 |= 0x1;
        this.field9602 = this.method3797((byte) 41);
    }

    @OriginalMember(owner = "client!mj", name = "c", descriptor = "(II)V", line = 385)
    public static final void method3798(int arg0, int arg1) {
        class298.field4322.method1546(arg1, (byte) -8);
        field9586++;
        class322.field4711.method1546(arg1, (byte) -8);
        class34.field555.method1546(arg1, (byte) -8);
        if (arg0 < -91) {
            class443.field6227.method1546(arg1, (byte) -8);
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(IJ)V", line = 404)
    public static final void method3799(int arg0, long arg1) {
        field9595++;
        int var3 = class551.field7456.field2257 + class15.field232;
        int var4 = class783.field10792 + class551.field7456.field2259;
        if (class262.field3888 - var3 < -2000 || class262.field3888 - var3 > 2000 || (class400.field5843 - var4) < -2000 || (class400.field5843 - var4) > 2000) {
            class400.field5843 = var4;
            class262.field3888 = var3;
        }
        if (class262.field3888 != var3) {
            int var5 = var3 - class262.field3888;
            int var6 = (int) ((long) var5 * arg1 / 320L);
            if (var5 <= 0) {
                if (var6 == 0) {
                    var6 = -1;
                } else if (var5 > var6) {
                    var6 = var5;
                }
            } else if (var6 == 0) {
                var6 = 1;
            } else if (var6 > var5) {
                var6 = var5;
            }
            class262.field3888 += var6;
        }
        class282.field4151 += (float) arg1 * class281.field4142 / 6.0F;
        if (class400.field5843 != var4) {
            int var7 = var4 - class400.field5843;
            int var8 = (int) ((long) var7 * arg1 / 320L);
            if (var7 > 0) {
                if (var8 == 0) {
                    var8 = 1;
                } else if (var7 < var8) {
                    var8 = var7;
                }
            } else if (var8 == 0) {
                var8 = -1;
            } else if (var7 > var8) {
                var8 = var7;
            }
            class400.field5843 += var8;
        }
        class135.field1974 += (float) arg1 * class282.field4157 / 6.0F;
        class320.method2033((byte) 59);
        if (arg0 != -30477) {
            method3796((byte) -71, (byte) 32);
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(ZIII)I", line = 490)
    public static final int method3800(boolean arg0, int arg1, int arg2, int arg3) {
        field9589++;
        class166 var4 = class389.method2461((byte) -126, arg3, arg0);
        if (var4 == null) {
            return -1;
        } else {
            if (arg2 != 13490) {
                field9587 = -56L;
            }
            return arg1 >= 0 && arg1 < var4.field2240.length ? var4.field2240[arg1] : -1;
        }
    }
}
