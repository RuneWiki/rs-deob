import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tt")
public class class504 implements class72 {

    @OriginalMember(owner = "client!tt", name = "d", descriptor = "I")
    private int field7087 = -1;

    @OriginalMember(owner = "client!tt", name = "l", descriptor = "[Lhda;")
    private class686[] field7095 = new class686[9];

    @OriginalMember(owner = "client!tt", name = "v", descriptor = "I")
    private int field7105 = 0;

    @OriginalMember(owner = "client!tt", name = "q", descriptor = "Leq;")
    private class357 field7100;

    @OriginalMember(owner = "client!tt", name = "g", descriptor = "I")
    private int field7090;

    @OriginalMember(owner = "client!tt", name = "h", descriptor = "J")
    public static volatile long field7091 = 0L;

    @OriginalMember(owner = "client!tt", name = "u", descriptor = "Lgg;")
    public static class114 field7104 = new class114(4);

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "I")
    public static int field7084;

    @OriginalMember(owner = "client!tt", name = "b", descriptor = "I")
    public static int field7085;

    @OriginalMember(owner = "client!tt", name = "c", descriptor = "I")
    public static int field7086;

    @OriginalMember(owner = "client!tt", name = "e", descriptor = "I")
    public static int field7088;

    @OriginalMember(owner = "client!tt", name = "f", descriptor = "I")
    public static int field7089;

    @OriginalMember(owner = "client!tt", name = "i", descriptor = "I")
    private int field7092;

    @OriginalMember(owner = "client!tt", name = "j", descriptor = "I")
    public static int field7093;

    @OriginalMember(owner = "client!tt", name = "k", descriptor = "I")
    public static int field7094;

    @OriginalMember(owner = "client!tt", name = "m", descriptor = "I")
    public static int field7096;

    @OriginalMember(owner = "client!tt", name = "n", descriptor = "I")
    public static int field7097;

    @OriginalMember(owner = "client!tt", name = "o", descriptor = "I")
    public static int field7098;

    @OriginalMember(owner = "client!tt", name = "p", descriptor = "I")
    public static int field7099;

    @OriginalMember(owner = "client!tt", name = "r", descriptor = "I")
    public static int field7101;

    @OriginalMember(owner = "client!tt", name = "s", descriptor = "I")
    public static int field7102;

    @OriginalMember(owner = "client!tt", name = "t", descriptor = "I")
    public static int field7103;

    @OriginalMember(owner = "client!tt", name = "w", descriptor = "I")
    public static int field7106;

    @OriginalMember(owner = "client!tt", name = "x", descriptor = "I")
    private int field7107;

    @OriginalMember(owner = "client!tt", name = "y", descriptor = "I")
    private int field7108;

    @OriginalMember(owner = "client!tt", name = "z", descriptor = "I")
    public static int field7109;

    @OriginalMember(owner = "client!tt", name = "A", descriptor = "I")
    public static int field7110;

    @OriginalMember(owner = "client!tt", name = "B", descriptor = "I")
    public static int field7111;

    @OriginalMember(owner = "client!tt", name = "C", descriptor = "I")
    public static int field7112;

    @OriginalMember(owner = "client!tt", name = "D", descriptor = "I")
    public static int field7113;

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(IB)V", line = 6)
    public final void method2901(int arg0, byte arg1) {
        field7089++;
        if (this.field7087 == -1) {
            throw new RuntimeException();
        } else if (arg1 > 17) {
            OpenGL.glDrawBuffer(class471.field6762[arg0]);
        }
    }

    @OriginalMember(owner = "client!tt", name = "c", descriptor = "(I)I", line = 21)
    private final int method2902(int arg0) {
        field7112++;
        if ((this.field7105 & 0x4) != 0) {
            return 36160;
        } else if ((this.field7105 & 0x2) != 0) {
            return 36009;
        } else if ((this.field7105 & 0x1) == 0) {
            if (arg0 != 36009) {
                this.method534(-72);
            }
            return -1;
        } else {
            return 36008;
        }
    }

    @OriginalMember(owner = "client!tt", name = "d", descriptor = "(B)V", line = 45)
    public static void method2903(byte arg0) {
        int var1 = 105 / ((-arg0 - 87) / 33);
        field7104 = null;
    }

    @OriginalMember(owner = "client!tt", name = "b", descriptor = "(IB)V", line = 54)
    public final void method2904(int arg0, byte arg1) {
        if (arg1 <= 59) {
            return;
        }
        if (this.field7095[arg0] != null) {
            this.field7095[arg0].method369(true);
        }
        field7085++;
        this.field7092 &= ~(0x1 << arg0);
        this.field7095[arg0] = null;
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(B)V", line = 70)
    public final void method531(byte arg0) {
        if (arg0 < -52) {
            field7110++;
            OpenGL.glBindFramebufferEXT(36160, 0);
            this.field7105 &= 0xFFFFFFFB;
            this.field7087 = this.method2902(36009);
        }
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(ZILgk;)V", line = 83)
    public final void method2905(boolean arg0, int arg1, class579 arg2) {
        field7084++;
        if (this.field7087 == -1) {
            throw new RuntimeException();
        }
        int var4 = 0x1 << arg1;
        if ((this.field7092 & ~var4) == 0) {
            this.field7108 = arg2.field8052;
            this.field7107 = arg2.field8060;
        } else if (this.field7108 != arg2.field8052 || this.field7107 != arg2.field8060) {
            throw new RuntimeException();
        }
        arg2.method3234(36161, class471.field6762[arg1], this.field7087);
        this.field7095[arg1] = arg2;
        this.field7092 |= var4;
        if (!arg0) {
            field7104 = null;
        }
    }

    @OriginalMember(owner = "client!tt", name = "d", descriptor = "(I)Z", line = 118)
    public final boolean method2906(int arg0) {
        if (arg0 != -1) {
            this.field7095 = null;
        }
        field7111++;
        int var2 = OpenGL.glCheckFramebufferStatusEXT(this.field7087);
        return var2 == 36053;
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(II)V", line = 141)
    public static final void method2907(int arg0, int arg1) {
        class610.field8449 = arg0;
        class488.field6949 = 100;
        class383.field5336 = arg1;
        field7096++;
        class718.field10122 = -1;
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(IILhga;I)V", line = 157)
    private final void method2908(int arg0, int arg1, class185 arg2, int arg3) {
        field7088++;
        if (this.field7087 == -1) {
            throw new RuntimeException();
        } else if (arg3 == -24167) {
            int var5 = 0x1 << arg0;
            if ((this.field7092 & ~var5) == 0) {
                this.field7107 = arg2.field2435;
                this.field7108 = arg2.field2433;
            } else if (this.field7108 != arg2.field2433 || this.field7107 != arg2.field2435) {
                throw new RuntimeException();
            }
            arg2.method1179(class471.field6762[arg0], this.field7087, arg1, 5121);
            this.field7095[arg0] = arg2;
            this.field7092 |= var5;
        }
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(BLgv;III)V", line = 188)
    private final void method2909(byte arg0, class45 arg1, int arg2, int arg3, int arg4) {
        field7106++;
        if (this.field7087 == -1) {
            throw new RuntimeException();
        }
        int var6 = 0x1 << arg3;
        if (arg0 > -41) {
            this.method530(-37);
        }
        if ((this.field7092 & ~var6) == 0) {
            this.field7108 = arg1.field670;
            this.field7107 = arg1.field670;
        } else if (this.field7108 != arg1.field670 || this.field7107 != arg1.field670) {
            throw new RuntimeException();
        }
        arg1.method370((byte) 70, arg4, class471.field6762[arg3], this.field7087, arg2);
        this.field7095[arg3] = arg1;
        this.field7092 |= var6;
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(I)V", line = 220)
    public final void method530(int arg0) {
        OpenGL.glBindFramebufferEXT(36008, 0);
        field7101++;
        this.field7105 &= 0xFFFFFFFE;
        this.field7087 = this.method2902(36009);
        if (arg0 != -15772) {
            this.field7105 = -2;
        }
    }

    @OriginalMember(owner = "client!tt", name = "c", descriptor = "(B)V", line = 235)
    public final void method533(byte arg0) {
        field7086++;
        OpenGL.glBindFramebufferEXT(36008, this.field7090);
        if (arg0 >= -118) {
            this.method2912(-10, 120, null);
        }
        this.field7105 |= 0x1;
        this.field7087 = this.method2902(36009);
    }

    @OriginalMember(owner = "client!tt", name = "b", descriptor = "(II)V", line = 249)
    public final void method2910(int arg0, int arg1) {
        field7109++;
        if (this.field7087 == -1) {
            throw new RuntimeException();
        }
        OpenGL.glReadBuffer(class471.field6762[arg1]);
        int var3 = -34 % ((arg0 + 9) / 34);
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(ZZ)V", line = 263)
    public static final void method2911(boolean arg0, boolean arg1) {
        field7103++;
        class66.method504(class599.field8320, class84.field1083, arg0, 16872, class638.field8834);
        if (arg1) {
            field7091 = -2L;
        }
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(IILhga;)V", line = 274)
    public final void method2912(int arg0, int arg1, class185 arg2) {
        this.method2908(arg1, arg0, arg2, arg0 ^ 0xFFFFA199);
        field7094++;
    }

    @OriginalMember(owner = "client!tt", name = "b", descriptor = "(I)V", line = 284)
    public final void method534(int arg0) {
        field7102++;
        OpenGL.glBindFramebufferEXT(36160, this.field7090);
        int var2 = 106 % ((35 - arg0) / 45);
        this.field7105 |= 0x4;
        this.field7087 = this.method2902(36009);
    }

    @OriginalMember(owner = "client!tt", name = "finalize", descriptor = "()V", line = 303)
    protected final void finalize() throws Throwable {
        field7097++;
        this.field7100.method2176(this.field7090, 23481);
        super.finalize();
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(ZLha;IZ)Lin;", line = 313)
    public static final class365 method2913(boolean arg0, class454 arg1, int arg2, boolean arg3) {
        field7099++;
        if (arg2 == -1) {
            return null;
        }
        if (class447.field6289 != null) {
            for (int var4 = 0; var4 < class447.field6289.length; var4++) {
                if (class447.field6289[var4] == arg2) {
                    return class449.field6312[var4];
                }
            }
        }
        class365 var5 = (class365) class491.field6967.method778((long) arg2, -72);
        if (var5 != null) {
            if (arg0 && var5.field5173 == null) {
                class56 var6 = class653.method3527(class457.field6396, (byte) -55, arg2);
                if (var6 == null) {
                    return null;
                }
                var5.field5173 = var6;
            }
            return var5;
        }
        class196[] var7 = class196.method1235(class88.field1123, arg2);
        if (var7 == null) {
            return null;
        }
        class56 var8 = class653.method3527(class457.field6396, (byte) -54, arg2);
        if (var8 == null) {
            return null;
        } else if (arg3) {
            class365 var9;
            if (arg0) {
                var9 = new class365(arg1.method156(var8, var7, true), var8);
            } else {
                var9 = new class365(arg1.method156(var8, var7, true));
            }
            class491.field6967.method774((long) arg2, -69, var9);
            return var9;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!tt", name = "<init>", descriptor = "(Leq;)V", line = 431)
    public class504(class357 arg0) {
        if (!arg0.field5073) {
            throw new IllegalStateException("");
        }
        this.field7100 = arg0;
        OpenGL.glGenFramebuffersEXT(1, class331.field4205, 0);
        this.field7090 = class331.field4205[0];
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(Z)V", line = 380)
    public final void method529(boolean arg0) {
        if (arg0) {
            field7113++;
            OpenGL.glBindFramebufferEXT(36009, this.field7090);
            this.field7105 |= 0x2;
            this.field7087 = this.method2902(36009);
        }
    }

    @OriginalMember(owner = "client!tt", name = "b", descriptor = "(B)V", line = 401)
    public final void method532(byte arg0) {
        field7093++;
        if (arg0 != -41) {
            this.field7108 = -80;
        }
        OpenGL.glBindFramebufferEXT(36009, 0);
        this.field7105 &= 0xFFFFFFFD;
        this.field7087 = this.method2902(36009);
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(IIILgv;)V", line = 420)
    public final void method2914(int arg0, int arg1, int arg2, class45 arg3) {
        this.method2909((byte) -84, arg3, arg2, arg1, arg0);
        field7098++;
    }
}
