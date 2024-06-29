import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!faa")
public class class139 implements class79 {

    @OriginalMember(owner = "client!faa", name = "a", descriptor = "I")
    private int field2015 = -1;

    @OriginalMember(owner = "client!faa", name = "w", descriptor = "I")
    private int field2037 = 0;

    @OriginalMember(owner = "client!faa", name = "s", descriptor = "[Lak;")
    private class317[] field2033 = new class317[9];

    @OriginalMember(owner = "client!faa", name = "B", descriptor = "Lok;")
    private class228 field2042;

    @OriginalMember(owner = "client!faa", name = "o", descriptor = "I")
    private int field2029;

    @OriginalMember(owner = "client!faa", name = "q", descriptor = "S")
    public static short field2031 = 256;

    @OriginalMember(owner = "client!faa", name = "z", descriptor = "Ldg;")
    public static class376 field2040 = new class376(77, 11);

    @OriginalMember(owner = "client!faa", name = "E", descriptor = "Lnea;")
    public static class664 field2044 = new class664(42, -1);

    @OriginalMember(owner = "client!faa", name = "H", descriptor = "I")
    public static int field2047 = 0;

    @OriginalMember(owner = "client!faa", name = "F", descriptor = "Lnea;")
    public static class664 field2045 = new class664(109, -1);

    @OriginalMember(owner = "client!faa", name = "b", descriptor = "I")
    public static int field2016;

    @OriginalMember(owner = "client!faa", name = "d", descriptor = "I")
    public static int field2018;

    @OriginalMember(owner = "client!faa", name = "e", descriptor = "I")
    public static int field2019;

    @OriginalMember(owner = "client!faa", name = "f", descriptor = "I")
    public static int field2020;

    @OriginalMember(owner = "client!faa", name = "g", descriptor = "I")
    public static int field2021;

    @OriginalMember(owner = "client!faa", name = "h", descriptor = "I")
    public static int field2022;

    @OriginalMember(owner = "client!faa", name = "i", descriptor = "I")
    public static int field2023;

    @OriginalMember(owner = "client!faa", name = "j", descriptor = "I")
    public static int field2024;

    @OriginalMember(owner = "client!faa", name = "k", descriptor = "I")
    public static int field2025;

    @OriginalMember(owner = "client!faa", name = "l", descriptor = "I")
    public static int field2026;

    @OriginalMember(owner = "client!faa", name = "m", descriptor = "I")
    public static int field2027;

    @OriginalMember(owner = "client!faa", name = "n", descriptor = "I")
    public static int field2028;

    @OriginalMember(owner = "client!faa", name = "p", descriptor = "I")
    public static int field2030;

    @OriginalMember(owner = "client!faa", name = "r", descriptor = "I")
    public static int field2032;

    @OriginalMember(owner = "client!faa", name = "t", descriptor = "I")
    private int field2034;

    @OriginalMember(owner = "client!faa", name = "u", descriptor = "I")
    public static int field2035;

    @OriginalMember(owner = "client!faa", name = "v", descriptor = "I")
    private int field2036;

    @OriginalMember(owner = "client!faa", name = "x", descriptor = "I")
    public static int field2038;

    @OriginalMember(owner = "client!faa", name = "y", descriptor = "I")
    public static int field2039;

    @OriginalMember(owner = "client!faa", name = "A", descriptor = "I")
    public static int field2041;

    @OriginalMember(owner = "client!faa", name = "D", descriptor = "I")
    private int field2043;

    @OriginalMember(owner = "client!faa", name = "G", descriptor = "I")
    public static int field2046;

    @OriginalMember(owner = "client!faa", name = "c", descriptor = "Lnea;")
    public static class664 field2017;

    @OriginalMember(owner = "client!faa", name = "a", descriptor = "(II)V")
    public final void method1003(int arg0, int arg1) {
        if (this.field2033[arg0] != null) {
            this.field2033[arg0].method226(-1);
        }
        if (arg1 <= -88) {
            field2046++;
            this.field2034 &= ~(0x1 << arg0);
            this.field2033[arg0] = null;
        }
    }

    @OriginalMember(owner = "client!faa", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.field2042.method1554(76, this.field2029);
        field2023++;
        super.finalize();
    }

    @OriginalMember(owner = "client!faa", name = "a", descriptor = "(IILqe;B)V")
    public final void method1004(int arg0, int arg1, class431 arg2, byte arg3) {
        this.method1013(arg1, arg0, (byte) 17, 0, arg2);
        field2027++;
        if (arg3 <= 107) {
            method1006(21, 2, -24, -15, 1.1627074F, -28, false, -113);
        }
    }

    @OriginalMember(owner = "client!faa", name = "c", descriptor = "(I)Z")
    public final boolean method1005(int arg0) {
        field2022++;
        int var2 = OpenGL.glCheckFramebufferStatusEXT(this.field2015);
        if (var2 == 36053) {
            return arg0 < -86;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!faa", name = "a", descriptor = "(IIIIFIZI)[I")
    public static final int[] method1006(int arg0, int arg1, int arg2, int arg3, float arg4, int arg5, boolean arg6, int arg7) {
        field2018++;
        int[] var8 = new int[arg1];
        class61 var9 = new class61();
        var9.field1153 = arg2;
        var9.field1151 = arg5;
        var9.field1154 = arg7;
        var9.field1157 = (int) (arg4 * 4096.0F);
        var9.field1149 = arg6;
        if (arg3 != -4003) {
            return null;
        }
        var9.field1152 = arg0;
        var9.method230(-9);
        class550.method3115(arg1, (byte) -83, 1);
        var9.method642(-10242, var8, 0);
        return var8;
    }

    @OriginalMember(owner = "client!faa", name = "c", descriptor = "(B)V")
    public final void method728(byte arg0) {
        OpenGL.glBindFramebufferEXT(36008, 0);
        field2016++;
        if (arg0 == -51) {
            this.field2037 &= 0xFFFFFFFE;
            this.field2015 = this.method1008((byte) -63);
        }
    }

    @OriginalMember(owner = "client!faa", name = "a", descriptor = "(IILwn;I)V")
    private final void method1007(int arg0, int arg1, class673 arg2, int arg3) {
        field2030++;
        if (this.field2015 == -1) {
            throw new RuntimeException();
        } else if (arg3 == 19537) {
            int var5 = 0x1 << arg0;
            if ((this.field2034 & ~var5) == 0) {
                this.field2036 = arg2.field9511;
                this.field2043 = arg2.field9515;
            } else if (this.field2036 != arg2.field9511 || this.field2043 != arg2.field9515) {
                throw new RuntimeException();
            }
            arg2.method3735(arg1, -32, class43.field702[arg0], this.field2015);
            this.field2033[arg0] = arg2;
            this.field2034 |= var5;
        }
    }

    @OriginalMember(owner = "client!faa", name = "d", descriptor = "(B)I")
    private final int method1008(byte arg0) {
        field2019++;
        if ((this.field2037 & 0x4) != 0) {
            return 36160;
        } else if (arg0 != -63) {
            return -33;
        } else if ((this.field2037 & 0x2) == 0) {
            return (this.field2037 & 0x1) == 0 ? -1 : 36008;
        } else {
            return 36009;
        }
    }

    @OriginalMember(owner = "client!faa", name = "b", descriptor = "(II)V")
    public final void method1009(int arg0, int arg1) {
        field2021++;
        if (this.field2015 == arg1) {
            throw new RuntimeException();
        }
        OpenGL.glDrawBuffer(class43.field702[arg0]);
    }

    @OriginalMember(owner = "client!faa", name = "b", descriptor = "(B)V")
    public final void method725(byte arg0) {
        field2032++;
        if (arg0 > -105) {
            this.method1014(11, 57, null);
        }
        OpenGL.glBindFramebufferEXT(36009, 0);
        this.field2037 &= 0xFFFFFFFD;
        this.field2015 = this.method1008((byte) -63);
    }

    @OriginalMember(owner = "client!faa", name = "d", descriptor = "(I)V")
    public static void method1010(int arg0) {
        field2045 = null;
        field2017 = null;
        if (arg0 != -22201) {
            field2017 = null;
        }
        field2044 = null;
        field2040 = null;
    }

    @OriginalMember(owner = "client!faa", name = "b", descriptor = "(I)V")
    public final void method726(int arg0) {
        OpenGL.glBindFramebufferEXT(36160, this.field2029);
        field2038++;
        this.field2037 |= 0x4;
        if (arg0 != 20174) {
            this.method725((byte) -43);
        }
        this.field2015 = this.method1008((byte) -63);
    }

    @OriginalMember(owner = "client!faa", name = "a", descriptor = "(B)V")
    public final void method723(byte arg0) {
        OpenGL.glBindFramebufferEXT(36008, this.field2029);
        field2026++;
        this.field2037 |= 0x1;
        if (arg0 != 38) {
            this.method727(true);
        }
        this.field2015 = this.method1008((byte) -63);
    }

    @OriginalMember(owner = "client!faa", name = "a", descriptor = "(I)V")
    public final void method724(int arg0) {
        OpenGL.glBindFramebufferEXT(36160, 0);
        if (arg0 != -24640) {
            field2047 = -10;
        }
        field2024++;
        this.field2037 &= 0xFFFFFFFB;
        this.field2015 = this.method1008((byte) -63);
    }

    @OriginalMember(owner = "client!faa", name = "a", descriptor = "(Lwn;IB)V")
    public final void method1011(class673 arg0, int arg1, byte arg2) {
        field2025++;
        if (arg2 != -74) {
            this.method727(true);
        }
        this.method1007(arg1, 0, arg0, arg2 ^ 0xFFFFB3E7);
    }

    @OriginalMember(owner = "client!faa", name = "a", descriptor = "(IB)V")
    public final void method1012(int arg0, byte arg1) {
        if (arg1 != -32) {
            field2045 = null;
        }
        field2020++;
        if (this.field2015 == -1) {
            throw new RuntimeException();
        }
        OpenGL.glReadBuffer(class43.field702[arg0]);
    }

    @OriginalMember(owner = "client!faa", name = "a", descriptor = "(IIBILqe;)V")
    private final void method1013(int arg0, int arg1, byte arg2, int arg3, class431 arg4) {
        field2039++;
        if (this.field2015 == -1) {
            throw new RuntimeException();
        }
        int var6 = 0x1 << arg1;
        if (arg2 != 17) {
            this.field2015 = -9;
        }
        if ((this.field2034 & ~var6) == 0) {
            this.field2036 = arg4.field6317;
            this.field2043 = arg4.field6317;
        } else if (this.field2036 != arg4.field6317 || this.field2043 != arg4.field6317) {
            throw new RuntimeException();
        }
        arg4.method2570(arg0, arg3, this.field2015, class43.field702[arg1], (byte) -124);
        this.field2033[arg1] = arg4;
        this.field2034 |= var6;
    }

    @OriginalMember(owner = "client!faa", name = "a", descriptor = "(IILeaa;)V")
    public final void method1014(int arg0, int arg1, class462 arg2) {
        field2035++;
        if (this.field2015 == -1) {
            throw new RuntimeException();
        }
        if (arg1 != -5253) {
            this.method726(-103);
        }
        int var4 = 0x1 << arg0;
        if ((this.field2034 & ~var4) == 0) {
            this.field2036 = arg2.field6655;
            this.field2043 = arg2.field6650;
        } else if (this.field2036 != arg2.field6655 || this.field2043 != arg2.field6650) {
            throw new RuntimeException();
        }
        arg2.method2728(376, class43.field702[arg0], this.field2015);
        this.field2033[arg0] = arg2;
        this.field2034 |= var4;
    }

    @OriginalMember(owner = "client!faa", name = "a", descriptor = "(Z)V")
    public final void method727(boolean arg0) {
        OpenGL.glBindFramebufferEXT(36009, this.field2029);
        field2028++;
        if (arg0) {
            field2044 = null;
        }
        this.field2037 |= 0x2;
        this.field2015 = this.method1008((byte) -63);
    }

    @OriginalMember(owner = "client!faa", name = "<init>", descriptor = "(Lok;)V")
    public class139(class228 arg0) {
        if (!arg0.field3515) {
            throw new IllegalStateException("");
        }
        this.field2042 = arg0;
        OpenGL.glGenFramebuffersEXT(1, class14.field128, 0);
        this.field2029 = class14.field128[0];
    }
}
