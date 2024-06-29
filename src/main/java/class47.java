import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public class class47 extends class56 implements class338 {

    @OriginalMember(owner = "client!wc", name = "x", descriptor = "Lid;")
    public class412 field704;

    @OriginalMember(owner = "client!wc", name = "H", descriptor = "Z")
    private boolean field714;

    @OriginalMember(owner = "client!wc", name = "D", descriptor = "I")
    public static int field710 = 0;

    @OriginalMember(owner = "client!wc", name = "s", descriptor = "I")
    public static int field699;

    @OriginalMember(owner = "client!wc", name = "t", descriptor = "I")
    public static int field700;

    @OriginalMember(owner = "client!wc", name = "u", descriptor = "I")
    public static int field701;

    @OriginalMember(owner = "client!wc", name = "v", descriptor = "I")
    public static int field702;

    @OriginalMember(owner = "client!wc", name = "w", descriptor = "I")
    public static int field703;

    @OriginalMember(owner = "client!wc", name = "y", descriptor = "I")
    public static int field705;

    @OriginalMember(owner = "client!wc", name = "z", descriptor = "I")
    public static int field706;

    @OriginalMember(owner = "client!wc", name = "A", descriptor = "I")
    public static int field707;

    @OriginalMember(owner = "client!wc", name = "B", descriptor = "I")
    public static int field708;

    @OriginalMember(owner = "client!wc", name = "C", descriptor = "I")
    public static int field709;

    @OriginalMember(owner = "client!wc", name = "E", descriptor = "I")
    public static int field711;

    @OriginalMember(owner = "client!wc", name = "F", descriptor = "I")
    public static int field712;

    @OriginalMember(owner = "client!wc", name = "G", descriptor = "I")
    public static int field713;

    @OriginalMember(owner = "client!wc", name = "I", descriptor = "I")
    public static int field715;

    @OriginalMember(owner = "client!wc", name = "J", descriptor = "I")
    public static int field716;

    @OriginalMember(owner = "client!wc", name = "K", descriptor = "I")
    public static int field717;

    @OriginalMember(owner = "client!wc", name = "L", descriptor = "I")
    public static int field718;

    @OriginalMember(owner = "client!wc", name = "M", descriptor = "I")
    public static int field719;

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(Lqa;Z)V", line = 3)
    public final void method334(class162 arg0, boolean arg1) {
        ++field705;
        class121 var3 = this.field704.method2380(true, arg1, arg0, super.field875, super.field879, 262144, -1);
        if (var3 != null) {
            int var4 = super.field879 >> 7;
            int var5 = super.field875 >> 7;
            this.field704.method2376(var3, arg0, var4, true, var5, var5, var4, false);
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(Lbo;[Ltr;Z)Leu;", line = 21)
    public static final class333 method335(class511 arg0, class191[] arg1, boolean arg2) {
        ++field706;
        for (int var3 = 0; arg1.length > var3; ++var3) {
            if (arg1[var3] == null || ~arg1[var3].field2688 >= -1L) {
                return null;
            }
        }
        if (!arg2) {
            field710 = -2;
        }
        long var4 = OpenGL.glCreateProgramObjectARB();
        for (int var6 = 0; var6 < arg1.length; ++var6) {
            OpenGL.glAttachObjectARB(var4, arg1[var6].field2688);
        }
        OpenGL.glLinkProgramARB(var4);
        OpenGL.glGetObjectParameterivARB(var4, 35714, class318.field4174, 0);
        if (~class318.field4174[0] == -1) {
            if (~class318.field4174[0] == -1) {
                System.out.println("Shader linking failed:");
            }
            OpenGL.glGetObjectParameterivARB(var4, 35716, class318.field4174, 1);
            if (class318.field4174[1] > 1) {
                byte[] var7 = new byte[class318.field4174[1]];
                OpenGL.glGetInfoLogARB(var4, class318.field4174[1], class318.field4174, 0, var7, 0);
                System.out.println(new String(var7));
            }
            if (class318.field4174[0] == 0) {
                for (int var8 = 0; ~var8 > ~arg1.length; ++var8) {
                    OpenGL.glDetachObjectARB(var4, arg1[var8].field2688);
                }
                OpenGL.glDeleteObjectARB(var4);
                return null;
            }
        }
        return new class333(arg0, var4, arg1);
    }

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "(B)Z", line = 88)
    public final boolean method126(byte arg0) {
        ++field717;
        return arg0 != 54 ? false : false;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(BLqa;I)Lc;", line = 99)
    public final class121 method336(byte arg0, class162 arg1, int arg2) {
        ++field702;
        if (arg0 != -102) {
            this.field704 = null;
        }
        return this.field704.method2380(false, false, arg1, 0, 0, arg2, arg0 + 101);
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IILqa;Leq;IIZ)V", line = 113)
    public final void method127(int arg0, int arg1, class162 arg2, class140 arg3, int arg4, int arg5, boolean arg6) {
        if (arg0 != 1) {
            this.method126((byte) 71);
        }
        ++field703;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!wc", name = "<init>", descriptor = "(Lqa;Lus;IIIIIZIII)V", line = 124)
    public class47(class162 arg0, class1 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10) {
        super(arg4, arg5, arg6, class102.method718(3, arg8, arg9));
        this.field704 = new class412(arg0, arg1, arg8, arg9, arg2, arg3, super.field879, super.field875, arg7, arg10);
        this.field714 = arg1.field83 != 0 && !arg7;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(ILqa;)V", line = 134)
    public final void method337(int arg0, class162 arg1) {
        this.field704.method2379(arg1, -6659);
        ++field716;
        if (arg0 != -7803) {
            field710 = -43;
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(Z)V", line = 145)
    public final void method125(boolean arg0) {
        if (!arg0) {
            this.field704 = null;
        }
        ++field713;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!wc", name = "d", descriptor = "(I)Z", line = 161)
    public final boolean method338(int arg0) {
        ++field711;
        if (arg0 >= -8) {
            this.field704 = null;
        }
        return this.field704.method2387(false);
    }

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "(ILqa;)Lfm;", line = 172)
    public final class514 method339(int arg0, class162 arg1) {
        ++field712;
        class121 var3 = this.field704.method2380(false, true, arg1, super.field875, super.field879, 2048, -1);
        if (var3 == null) {
            return null;
        } else {
            class414 var4 = arg1.method611();
            if (arg0 != 9124) {
                field699 = 118;
            }
            var4.method971(super.field879, super.field873, super.field875);
            class514 var5 = null;
            if (this.field714) {
                var5 = class148.method1020(0, 1);
            }
            if (this.field704.field5691 == null) {
                var3.method853(var4, var5 != null ? var5.field7563[0] : null, 0);
            } else {
                class411 var6 = this.field704.field5691.method3100();
                arg1.method534(var3, var6, var4, var5 == null ? null : var5.field7563[0], 0);
            }
            int var7 = super.field879 >> 7;
            int var8 = super.field875 >> 7;
            this.field704.method2376(var3, arg1, var7, true, var8, var8, var7, true);
            return var5;
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(Lqa;I)V", line = 212)
    public final void method340(class162 arg0, int arg1) {
        if (arg1 == 20203) {
            ++field709;
            this.field704.method2381(0, arg0);
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIB)V", line = 223)
    public static final void method341(int arg0, int arg1, byte arg2) {
        ++field719;
        class253 var3 = class332.method1911(arg0, (byte) 61, 1);
        var3.method1522(0);
        var3.field3356 = arg1;
        if (arg2 < 16) {
            method335((class511) null, (class191[]) null, false);
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(I)V", line = 243)
    public final void method342(int arg0) {
        ++field718;
        int var2 = 92 % ((arg0 - 56) / 52);
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IILqa;I)Z", line = 252)
    public final boolean method343(int arg0, int arg1, class162 arg2, int arg3) {
        ++field700;
        class121 var5 = this.field704.method2380(false, false, arg2, super.field875, super.field879, 131072, arg0);
        if (var5 == null) {
            return false;
        } else {
            class414 var6 = arg2.method611();
            var6.method971(super.field879, super.field873, super.field875);
            return var5.method847(arg3, arg1, var6, false);
        }
    }

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "(I)I", line = 273)
    public final int method344(int arg0) {
        ++field701;
        if (arg0 != -4534) {
            this.method347((byte) -107);
        }
        return this.field704.field5667;
    }

    @OriginalMember(owner = "client!wc", name = "c", descriptor = "(I)I", line = 287)
    public final int method345(int arg0) {
        ++field707;
        if (arg0 != -1736) {
            this.method338(33);
        }
        return this.field704.field5659;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(Lm;Lpc;I)V", line = 298)
    public static final void method346(class126 arg0, class473 arg1, int arg2) {
        class155.field2276 = arg0;
        ++field715;
        class151.field2138 = arg1;
        if (arg2 != -8318) {
            field699 = -69;
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(B)I", line = 312)
    public final int method347(byte arg0) {
        if (arg0 != -87) {
            return -19;
        } else {
            ++field708;
            return this.field704.field5671;
        }
    }
}
