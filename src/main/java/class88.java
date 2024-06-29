import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!er")
public class class88 implements class291 {

    @OriginalMember(owner = "client!er", name = "a", descriptor = "I")
    private int field1052 = 0;

    @OriginalMember(owner = "client!er", name = "b", descriptor = "I")
    private int field1053 = -1;

    @OriginalMember(owner = "client!er", name = "q", descriptor = "[Lln;")
    private class317[] field1068 = new class317[9];

    @OriginalMember(owner = "client!er", name = "j", descriptor = "Lmh;")
    private class537 field1061;

    @OriginalMember(owner = "client!er", name = "e", descriptor = "I")
    private int field1056;

    @OriginalMember(owner = "client!er", name = "t", descriptor = "I")
    public static int field1071 = 0;

    @OriginalMember(owner = "client!er", name = "C", descriptor = "Lcu;")
    public static class185 field1080 = new class185(6, 19);

    @OriginalMember(owner = "client!er", name = "E", descriptor = "[C")
    public static char[] field1082 = new char[] { '€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ' };

    @OriginalMember(owner = "client!er", name = "c", descriptor = "I")
    public static int field1054;

    @OriginalMember(owner = "client!er", name = "d", descriptor = "I")
    public static int field1055;

    @OriginalMember(owner = "client!er", name = "f", descriptor = "I")
    public static int field1057;

    @OriginalMember(owner = "client!er", name = "g", descriptor = "I")
    public static int field1058;

    @OriginalMember(owner = "client!er", name = "h", descriptor = "I")
    public static int field1059;

    @OriginalMember(owner = "client!er", name = "i", descriptor = "I")
    public static int field1060;

    @OriginalMember(owner = "client!er", name = "k", descriptor = "I")
    public static int field1062;

    @OriginalMember(owner = "client!er", name = "l", descriptor = "I")
    public static int field1063;

    @OriginalMember(owner = "client!er", name = "m", descriptor = "I")
    private int field1064;

    @OriginalMember(owner = "client!er", name = "n", descriptor = "I")
    public static int field1065;

    @OriginalMember(owner = "client!er", name = "o", descriptor = "I")
    public static int field1066;

    @OriginalMember(owner = "client!er", name = "p", descriptor = "I")
    public static int field1067;

    @OriginalMember(owner = "client!er", name = "r", descriptor = "I")
    public static int field1069;

    @OriginalMember(owner = "client!er", name = "s", descriptor = "I")
    public static int field1070;

    @OriginalMember(owner = "client!er", name = "u", descriptor = "I")
    public static int field1072;

    @OriginalMember(owner = "client!er", name = "v", descriptor = "I")
    public static int field1073;

    @OriginalMember(owner = "client!er", name = "w", descriptor = "I")
    public static int field1074;

    @OriginalMember(owner = "client!er", name = "x", descriptor = "I")
    public static int field1075;

    @OriginalMember(owner = "client!er", name = "y", descriptor = "I")
    private int field1076;

    @OriginalMember(owner = "client!er", name = "z", descriptor = "I")
    public static int field1077;

    @OriginalMember(owner = "client!er", name = "A", descriptor = "I")
    public static int field1078;

    @OriginalMember(owner = "client!er", name = "B", descriptor = "I")
    private int field1079;

    @OriginalMember(owner = "client!er", name = "D", descriptor = "I")
    public static int field1081;

    @OriginalMember(owner = "client!er", name = "c", descriptor = "(I)V")
    public final void method511(int arg0) {
        field1062++;
        OpenGL.glBindFramebufferEXT(36009, this.field1056);
        if (arg0 == 12890) {
            this.field1052 |= 0x2;
            this.field1053 = this.method515(8222);
        }
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(IB)V")
    public final void method512(int arg0, byte arg1) {
        field1057++;
        if (this.field1068[arg0] != null) {
            this.field1068[arg0].method112((byte) 53);
        }
        this.field1079 &= ~(0x1 << arg0);
        int var3 = 13 / ((arg1 + 71) / 53);
        this.field1068[arg0] = null;
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(B)V")
    public final void method513(byte arg0) {
        field1074++;
        if (arg0 != -42) {
            method520(-74, -27, -10, true, null, -38);
        }
        OpenGL.glBindFramebufferEXT(36009, 0);
        this.field1052 &= 0xFFFFFFFD;
        this.field1053 = this.method515(8222);
    }

    @OriginalMember(owner = "client!er", name = "b", descriptor = "(B)V")
    public final void method514(byte arg0) {
        OpenGL.glBindFramebufferEXT(36160, 0);
        if (arg0 == -42) {
            field1054++;
            this.field1052 &= 0xFFFFFFFB;
            this.field1053 = this.method515(8222);
        }
    }

    @OriginalMember(owner = "client!er", name = "e", descriptor = "(I)I")
    private final int method515(int arg0) {
        field1059++;
        if ((this.field1052 & 0x4) != 0) {
            return 36160;
        } else if ((this.field1052 & 0x2) != 0) {
            return 36009;
        } else if (arg0 == 8222) {
            return (this.field1052 & 0x1) == 0 ? -1 : 36008;
        } else {
            return -111;
        }
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(IILrr;I)V")
    private final void method516(int arg0, int arg1, class303 arg2, int arg3) {
        field1069++;
        if (this.field1053 == -1) {
            throw new RuntimeException();
        }
        int var5 = 0x1 << arg1;
        if ((this.field1079 & ~var5) == 0) {
            this.field1064 = arg2.field3862;
            this.field1076 = arg2.field3869;
        } else if (this.field1076 != arg2.field3869 || this.field1064 != arg2.field3862) {
            throw new RuntimeException();
        }
        arg2.method1667(this.field1053, arg0, 12459, class511.field7235[arg1]);
        this.field1068[arg1] = arg2;
        if (arg3 != 381) {
            this.field1056 = 109;
        }
        this.field1079 |= var5;
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(IILdca;)V")
    public final void method517(int arg0, int arg1, class151 arg2) {
        field1067++;
        if (this.field1053 == -1) {
            throw new RuntimeException();
        }
        int var4 = 0x1 << arg0;
        if ((~var4 & this.field1079) == 0) {
            this.field1076 = arg2.field1795;
            this.field1064 = arg2.field1796;
        } else if (this.field1076 != arg2.field1795 || this.field1064 != arg2.field1796) {
            throw new RuntimeException();
        }
        arg2.method822(-1, class511.field7235[arg0], this.field1053);
        if (arg1 >= -51) {
            this.field1052 = 21;
        }
        this.field1068[arg0] = arg2;
        this.field1079 |= var4;
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(Z)V")
    public static void method518(boolean arg0) {
        field1082 = null;
        if (arg0) {
            field1071 = 35;
        }
        field1080 = null;
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(BI)V")
    public final void method519(byte arg0, int arg1) {
        field1075++;
        if (this.field1053 == -1) {
            throw new RuntimeException();
        }
        if (arg0 > -21) {
            this.method522(-24);
        }
        OpenGL.glDrawBuffer(class511.field7235[arg1]);
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(IIIZ[BI)V")
    public static final void method520(int arg0, int arg1, int arg2, boolean arg3, byte[] arg4, int arg5) {
        field1073++;
        if (arg1 >= arg5 || arg3) {
            return;
        }
        int var6 = arg0 + arg1;
        int var7 = arg5 - arg1 >> 2;
        while (true) {
            var7--;
            if (var7 < 0) {
                int var8 = arg5 - arg1 & 0x3;
                while (true) {
                    var8--;
                    if (var8 < 0) {
                        return;
                    }
                    arg4[var6++] = 1;
                }
            }
            arg4[var6++] = 1;
            arg4[var6++] = 1;
            arg4[var6++] = 1;
            arg4[var6++] = 1;
        }
    }

    @OriginalMember(owner = "client!er", name = "c", descriptor = "(B)I")
    public final int method521(byte arg0) {
        field1065++;
        return arg0 == -26 ? this.field1064 : 69;
    }

    @OriginalMember(owner = "client!er", name = "f", descriptor = "(I)Z")
    public final boolean method522(int arg0) {
        field1060++;
        if (arg0 > -15) {
            this.field1056 = 108;
        }
        int var2 = OpenGL.glCheckFramebufferStatusEXT(this.field1053);
        return var2 == 36053;
    }

    @OriginalMember(owner = "client!er", name = "d", descriptor = "(I)V")
    public final void method523(int arg0) {
        OpenGL.glBindFramebufferEXT(36008, 0);
        field1070++;
        if (arg0 == -4799) {
            this.field1052 &= 0xFFFFFFFE;
            this.field1053 = this.method515(8222);
        }
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(ILrr;I)V")
    public final void method524(int arg0, class303 arg1, int arg2) {
        this.method516(0, arg0, arg1, 381);
        field1063++;
        if (arg2 < 99) {
            this.method521((byte) -34);
        }
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(IIILkh;I)V")
    private final void method525(int arg0, int arg1, int arg2, class15 arg3, int arg4) {
        if (arg2 != 1641) {
            this.method522(37);
        }
        field1077++;
        if (this.field1053 == -1) {
            throw new RuntimeException();
        }
        int var6 = 0x1 << arg1;
        if ((~var6 & this.field1079) == 0) {
            this.field1064 = arg3.field117;
            this.field1076 = arg3.field117;
        } else if (this.field1076 != arg3.field117 || this.field1064 != arg3.field117) {
            throw new RuntimeException();
        }
        arg3.method113(6, this.field1053, class511.field7235[arg1], arg0, arg4);
        this.field1068[arg1] = arg3;
        this.field1079 |= var6;
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(II)V")
    public final void method526(int arg0, int arg1) {
        field1081++;
        if (this.field1053 == -1) {
            throw new RuntimeException();
        } else if (arg1 == -21033) {
            OpenGL.glReadBuffer(class511.field7235[arg0]);
        }
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(BIILkh;)V")
    public final void method527(byte arg0, int arg1, int arg2, class15 arg3) {
        this.method525(0, arg1, 1641, arg3, arg2);
        field1066++;
        if (arg0 > -109) {
            field1080 = null;
        }
    }

    @OriginalMember(owner = "client!er", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        field1078++;
        this.field1061.method3122(this.field1056, (byte) 91);
        super.finalize();
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(BLjava/lang/String;)I")
    public static final int method528(byte arg0, String arg1) {
        field1072++;
        if (arg0 > -14) {
            method528((byte) 90, null);
        }
        return arg1.length() + 1;
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(I)V")
    public final void method529(int arg0) {
        field1058++;
        OpenGL.glBindFramebufferEXT(36008, this.field1056);
        this.field1052 |= 0x1;
        if (arg0 != 9440) {
            this.field1076 = 64;
        }
        this.field1053 = this.method515(8222);
    }

    @OriginalMember(owner = "client!er", name = "b", descriptor = "(I)V")
    public final void method530(int arg0) {
        field1055++;
        OpenGL.glBindFramebufferEXT(36160, this.field1056);
        this.field1052 |= 0x4;
        if (arg0 != 15558) {
            this.field1053 = 125;
        }
        this.field1053 = this.method515(8222);
    }

    @OriginalMember(owner = "client!er", name = "<init>", descriptor = "(Lmh;)V")
    public class88(class537 arg0) {
        if (!arg0.field7872) {
            throw new IllegalStateException("");
        }
        this.field1061 = arg0;
        OpenGL.glGenFramebuffersEXT(1, class612.field8875, 0);
        this.field1056 = class612.field8875[0];
    }
}
