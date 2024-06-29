import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vda")
public class class195 implements class530 {

    @OriginalMember(owner = "client!vda", name = "v", descriptor = "I")
    private int field2332 = -1;

    @OriginalMember(owner = "client!vda", name = "s", descriptor = "I")
    private int field2329 = 0;

    @OriginalMember(owner = "client!vda", name = "c", descriptor = "[Lhv;")
    private class545[] field2313 = new class545[9];

    @OriginalMember(owner = "client!vda", name = "b", descriptor = "Lpc;")
    private class700 field2312;

    @OriginalMember(owner = "client!vda", name = "h", descriptor = "I")
    private int field2318;

    @OriginalMember(owner = "client!vda", name = "d", descriptor = "Lml;")
    public static class408 field2314 = new class408();

    @OriginalMember(owner = "client!vda", name = "a", descriptor = "I")
    public static int field2311;

    @OriginalMember(owner = "client!vda", name = "e", descriptor = "I")
    public static int field2315;

    @OriginalMember(owner = "client!vda", name = "f", descriptor = "I")
    public static int field2316;

    @OriginalMember(owner = "client!vda", name = "g", descriptor = "I")
    public static int field2317;

    @OriginalMember(owner = "client!vda", name = "i", descriptor = "I")
    public static int field2319;

    @OriginalMember(owner = "client!vda", name = "j", descriptor = "I")
    public static int field2320;

    @OriginalMember(owner = "client!vda", name = "k", descriptor = "I")
    public static int field2321;

    @OriginalMember(owner = "client!vda", name = "l", descriptor = "I")
    public static int field2322;

    @OriginalMember(owner = "client!vda", name = "m", descriptor = "I")
    public static int field2323;

    @OriginalMember(owner = "client!vda", name = "n", descriptor = "I")
    public static int field2324;

    @OriginalMember(owner = "client!vda", name = "o", descriptor = "I")
    private int field2325;

    @OriginalMember(owner = "client!vda", name = "p", descriptor = "I")
    public static int field2326;

    @OriginalMember(owner = "client!vda", name = "q", descriptor = "I")
    public static int field2327;

    @OriginalMember(owner = "client!vda", name = "r", descriptor = "I")
    private int field2328;

    @OriginalMember(owner = "client!vda", name = "t", descriptor = "I")
    public static int field2330;

    @OriginalMember(owner = "client!vda", name = "u", descriptor = "I")
    public static int field2331;

    @OriginalMember(owner = "client!vda", name = "w", descriptor = "I")
    public static int field2333;

    @OriginalMember(owner = "client!vda", name = "x", descriptor = "I")
    private int field2334;

    @OriginalMember(owner = "client!vda", name = "y", descriptor = "I")
    public static int field2335;

    @OriginalMember(owner = "client!vda", name = "A", descriptor = "I")
    public static int field2337;

    @OriginalMember(owner = "client!vda", name = "B", descriptor = "I")
    public static int field2338;

    @OriginalMember(owner = "client!vda", name = "z", descriptor = "Lbt;")
    public static class48 field2336;

    @OriginalMember(owner = "client!vda", name = "a", descriptor = "(IILvw;)V")
    public final void method1267(int arg0, int arg1, class322 arg2) {
        field2335++;
        if (this.field2332 == -1) {
            throw new RuntimeException();
        }
        int var4 = 0x1 << arg1;
        if ((this.field2328 & ~var4) == 0) {
            this.field2325 = arg2.field4004;
            this.field2334 = arg2.field3991;
        } else if (this.field2334 != arg2.field3991 || this.field2325 != arg2.field4004) {
            throw new RuntimeException();
        }
        arg2.method1923((byte) -46, this.field2332, class342.field4295[arg1]);
        this.field2313[arg1] = arg2;
        this.field2328 |= var4;
        int var5 = -111 % ((arg0 - 49) / 58);
    }

    @OriginalMember(owner = "client!vda", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.field2312.method3909(5890, this.field2318);
        field2324++;
        super.finalize();
    }

    @OriginalMember(owner = "client!vda", name = "a", descriptor = "(Lhfa;III)V")
    public final void method1268(class331 arg0, int arg1, int arg2, int arg3) {
        field2330++;
        this.method1280(arg1, arg3, arg2, arg0, false);
    }

    @OriginalMember(owner = "client!vda", name = "a", descriptor = "(I)V")
    public final void method1269(int arg0) {
        field2327++;
        if (arg0 == -26779) {
            OpenGL.glBindFramebufferEXT(36009, 0);
            this.field2329 &= 0xFFFFFFFD;
            this.field2332 = this.method1275(25);
        }
    }

    @OriginalMember(owner = "client!vda", name = "a", descriptor = "(Lld;III)V")
    private final void method1270(class182 arg0, int arg1, int arg2, int arg3) {
        field2326++;
        if (this.field2332 == -1) {
            throw new RuntimeException();
        }
        int var5 = 0x1 << arg3;
        if (arg1 != 5540) {
            return;
        }
        if ((~var5 & this.field2328) == 0) {
            this.field2325 = arg0.field2221;
            this.field2334 = arg0.field2215;
        } else if (this.field2334 != arg0.field2215 || this.field2325 != arg0.field2221) {
            throw new RuntimeException();
        }
        arg0.method1215(arg2, class342.field4295[arg3], this.field2332, (byte) -121);
        this.field2313[arg3] = arg0;
        this.field2328 |= var5;
    }

    @OriginalMember(owner = "client!vda", name = "b", descriptor = "(B)V")
    public final void method1271(byte arg0) {
        OpenGL.glBindFramebufferEXT(36160, this.field2318);
        field2311++;
        this.field2329 |= 0x4;
        int var2 = -106 % ((arg0 - 26) / 33);
        this.field2332 = this.method1275(127);
    }

    @OriginalMember(owner = "client!vda", name = "a", descriptor = "(II)V")
    public final void method1272(int arg0, int arg1) {
        if (arg1 != 18636) {
            this.method1283(-44);
        }
        field2323++;
        if (this.field2332 == -1) {
            throw new RuntimeException();
        }
        OpenGL.glDrawBuffer(class342.field4295[arg0]);
    }

    @OriginalMember(owner = "client!vda", name = "a", descriptor = "(CII)C")
    public static final char method1273(char arg0, int arg1, int arg2) {
        if (arg2 != -2770) {
            return (char) 65438;
        }
        field2338++;
        if (arg0 >= 'À' && arg0 <= 'ÿ') {
            if (arg0 >= 'À' && arg0 <= 'Æ') {
                return 'A';
            }
            if (arg0 == 'Ç') {
                return 'C';
            }
            if (arg0 >= 'È' && arg0 <= 'Ë') {
                return 'E';
            }
            if (arg0 >= 'Ì' && arg0 <= 'Ï') {
                return 'I';
            }
            if (arg0 >= 'Ò' && arg0 <= 'Ö') {
                return 'O';
            }
            if (arg0 >= 'Ù' && arg0 <= 'Ü') {
                return 'U';
            }
            if (arg0 == 'Ý') {
                return 'Y';
            }
            if (arg0 == 'ß') {
                return 's';
            }
            if (arg0 >= 'à' && arg0 <= 'æ') {
                return 'a';
            }
            if (arg0 == 'ç') {
                return 'c';
            }
            if (arg0 >= 'è' && arg0 <= 'ë') {
                return 'e';
            }
            if (arg0 >= 'ì' && arg0 <= 'ï') {
                return 'i';
            }
            if (arg0 >= 'ò' && arg0 <= 'ö') {
                return 'o';
            }
            if (arg0 >= 'ù' && arg0 <= 'ü') {
                return 'u';
            }
            if (arg0 == 'ý' || arg0 == 'ÿ') {
                return 'y';
            }
        }
        if (arg0 == 'Œ') {
            return 'O';
        } else if (arg0 == 'œ') {
            return 'o';
        } else if (arg0 == 'Ÿ') {
            return 'Y';
        } else {
            return arg0;
        }
    }

    @OriginalMember(owner = "client!vda", name = "a", descriptor = "(IILld;)V")
    public final void method1274(int arg0, int arg1, class182 arg2) {
        field2333++;
        this.method1270(arg2, 5540, arg1, arg0);
    }

    @OriginalMember(owner = "client!vda", name = "e", descriptor = "(I)I")
    private final int method1275(int arg0) {
        field2337++;
        int var2 = -22 / ((-arg0 - 47) / 52);
        if ((this.field2329 & 0x4) != 0) {
            return 36160;
        } else if ((this.field2329 & 0x2) == 0) {
            return (this.field2329 & 0x1) == 0 ? -1 : 36008;
        } else {
            return 36009;
        }
    }

    @OriginalMember(owner = "client!vda", name = "c", descriptor = "(B)Z")
    public final boolean method1276(byte arg0) {
        field2315++;
        if (arg0 == 24) {
            int var2 = OpenGL.glCheckFramebufferStatusEXT(this.field2332);
            return var2 == 36053;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!vda", name = "d", descriptor = "(B)V")
    public static void method1277(byte arg0) {
        if (arg0 >= -44) {
            method1273((char) 65495, 84, -100);
        }
        field2336 = null;
        field2314 = null;
    }

    @OriginalMember(owner = "client!vda", name = "b", descriptor = "(II)V")
    public final void method1278(int arg0, int arg1) {
        field2331++;
        if (this.field2332 == -1) {
            throw new RuntimeException();
        }
        OpenGL.glReadBuffer(class342.field4295[arg1]);
        if (arg0 <= 75) {
            this.method1282(-70);
        }
    }

    @OriginalMember(owner = "client!vda", name = "b", descriptor = "(I)V")
    public final void method1279(int arg0) {
        field2320++;
        OpenGL.glBindFramebufferEXT(36008, 0);
        this.field2329 &= 0xFFFFFFFE;
        if (arg0 == -26068) {
            this.field2332 = this.method1275(90);
        }
    }

    @OriginalMember(owner = "client!vda", name = "a", descriptor = "(IIILhfa;Z)V")
    private final void method1280(int arg0, int arg1, int arg2, class331 arg3, boolean arg4) {
        field2321++;
        if (this.field2332 == -1) {
            throw new RuntimeException();
        }
        int var6 = 0x1 << arg0;
        if ((~var6 & this.field2328) == 0) {
            this.field2334 = arg3.field4101;
            this.field2325 = arg3.field4101;
        } else if (this.field2334 != arg3.field4101 || this.field2325 != arg3.field4101) {
            throw new RuntimeException();
        }
        arg3.method1969(arg2, 106, this.field2332, arg1, class342.field4295[arg0]);
        this.field2313[arg0] = arg3;
        this.field2328 |= var6;
        if (arg4) {
            this.method1272(70, -93);
        }
    }

    @OriginalMember(owner = "client!vda", name = "a", descriptor = "(B)V")
    public final void method1281(byte arg0) {
        field2322++;
        if (arg0 != 127) {
            this.field2334 = -86;
        }
        OpenGL.glBindFramebufferEXT(36008, this.field2318);
        this.field2329 |= 0x1;
        this.field2332 = this.method1275(arg0 ^ 0x5E);
    }

    @OriginalMember(owner = "client!vda", name = "d", descriptor = "(I)V")
    public final void method1282(int arg0) {
        OpenGL.glBindFramebufferEXT(36160, 0);
        field2317++;
        if (arg0 != 24191) {
            this.field2312 = null;
        }
        this.field2329 &= 0xFFFFFFFB;
        this.field2332 = this.method1275(94);
    }

    @OriginalMember(owner = "client!vda", name = "c", descriptor = "(I)V")
    public final void method1283(int arg0) {
        OpenGL.glBindFramebufferEXT(36009, this.field2318);
        field2316++;
        this.field2329 |= 0x2;
        if (arg0 == -25911) {
            this.field2332 = this.method1275(arg0 ^ 0x6553);
        }
    }

    @OriginalMember(owner = "client!vda", name = "c", descriptor = "(II)V")
    public final void method1284(int arg0, int arg1) {
        if (this.field2313[arg1] != null) {
            this.field2313[arg1].method1219(-106);
        }
        if (arg0 != 21450) {
            this.method1270(null, -106, -114, 121);
        }
        field2319++;
        this.field2328 &= ~(0x1 << arg1);
        this.field2313[arg1] = null;
    }

    @OriginalMember(owner = "client!vda", name = "<init>", descriptor = "(Lpc;)V")
    public class195(class700 arg0) {
        if (!arg0.field9841) {
            throw new IllegalStateException("");
        }
        this.field2312 = arg0;
        OpenGL.glGenFramebuffersEXT(1, class272.field3207, 0);
        this.field2318 = class272.field3207[0];
    }
}
