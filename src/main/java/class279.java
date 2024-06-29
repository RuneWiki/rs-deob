import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ns")
public class class279 implements class171 {

    @OriginalMember(owner = "client!ns", name = "e", descriptor = "I")
    private int field3517 = -1;

    @OriginalMember(owner = "client!ns", name = "n", descriptor = "[Llk;")
    private class416[] field3526 = new class416[9];

    @OriginalMember(owner = "client!ns", name = "g", descriptor = "I")
    private int field3519 = 0;

    @OriginalMember(owner = "client!ns", name = "v", descriptor = "Lug;")
    private class395 field3534;

    @OriginalMember(owner = "client!ns", name = "z", descriptor = "I")
    private int field3538;

    @OriginalMember(owner = "client!ns", name = "o", descriptor = "Ljava/lang/String;")
    public static String field3527 = null;

    @OriginalMember(owner = "client!ns", name = "f", descriptor = "I")
    public static int field3518 = 1401;

    @OriginalMember(owner = "client!ns", name = "u", descriptor = "Z")
    public static boolean field3533 = false;

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "I")
    public static int field3513;

    @OriginalMember(owner = "client!ns", name = "b", descriptor = "I")
    public static int field3514;

    @OriginalMember(owner = "client!ns", name = "c", descriptor = "I")
    public static int field3515;

    @OriginalMember(owner = "client!ns", name = "d", descriptor = "I")
    public static int field3516;

    @OriginalMember(owner = "client!ns", name = "h", descriptor = "I")
    public static int field3520;

    @OriginalMember(owner = "client!ns", name = "i", descriptor = "I")
    public static int field3521;

    @OriginalMember(owner = "client!ns", name = "j", descriptor = "I")
    public static int field3522;

    @OriginalMember(owner = "client!ns", name = "k", descriptor = "I")
    private int field3523;

    @OriginalMember(owner = "client!ns", name = "l", descriptor = "I")
    public static int field3524;

    @OriginalMember(owner = "client!ns", name = "m", descriptor = "I")
    public static int field3525;

    @OriginalMember(owner = "client!ns", name = "p", descriptor = "I")
    public static int field3528;

    @OriginalMember(owner = "client!ns", name = "q", descriptor = "I")
    public static int field3529;

    @OriginalMember(owner = "client!ns", name = "r", descriptor = "I")
    public static int field3530;

    @OriginalMember(owner = "client!ns", name = "s", descriptor = "I")
    public static int field3531;

    @OriginalMember(owner = "client!ns", name = "t", descriptor = "I")
    public static int field3532;

    @OriginalMember(owner = "client!ns", name = "w", descriptor = "I")
    public static int field3535;

    @OriginalMember(owner = "client!ns", name = "x", descriptor = "I")
    private int field3536;

    @OriginalMember(owner = "client!ns", name = "y", descriptor = "I")
    public static int field3537;

    @OriginalMember(owner = "client!ns", name = "A", descriptor = "I")
    private int field3539;

    @OriginalMember(owner = "client!ns", name = "B", descriptor = "I")
    public static int field3540;

    @OriginalMember(owner = "client!ns", name = "C", descriptor = "I")
    public static int field3541;

    @OriginalMember(owner = "client!ns", name = "D", descriptor = "I")
    public static int field3542;

    @OriginalMember(owner = "client!ns", name = "E", descriptor = "I")
    public static int field3543;

    @OriginalMember(owner = "client!ns", name = "F", descriptor = "I")
    public static int field3544;

    @OriginalMember(owner = "client!ns", name = "G", descriptor = "I")
    public static int field3545;

    @OriginalMember(owner = "client!ns", name = "H", descriptor = "I")
    public static int field3546;

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(II)V", line = 5)
    public final void method1643(int arg0, int arg1) {
        if (this.field3526[arg0] != null) {
            this.field3526[arg0].method864(-1);
        }
        field3514++;
        this.field3539 &= ~(arg1 << arg0);
        this.field3526[arg0] = null;
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(Lnn;IIII)V", line = 17)
    private final void method1644(class288 arg0, int arg1, int arg2, int arg3, int arg4) {
        field3530++;
        if (this.field3517 == -1) {
            throw new RuntimeException();
        }
        int var6 = 95 % ((arg2 - 17) / 49);
        int var7 = 0x1 << arg3;
        if ((this.field3539 & ~var7) == 0) {
            this.field3536 = arg0.field3677;
            this.field3523 = arg0.field3677;
        } else if (this.field3523 != arg0.field3677 || this.field3536 != arg0.field3677) {
            throw new RuntimeException();
        }
        arg0.method1702((byte) 50, arg1, arg4, class45.field541[arg3], this.field3517);
        this.field3526[arg3] = arg0;
        this.field3539 |= var7;
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(ZI)V", line = 54)
    public final void method1645(boolean arg0, int arg1) {
        field3524++;
        if (this.field3517 == -1) {
            throw new RuntimeException();
        }
        if (!arg0) {
            field3527 = null;
        }
        OpenGL.glDrawBuffer(class45.field541[arg1]);
    }

    @OriginalMember(owner = "client!ns", name = "d", descriptor = "(B)I", line = 69)
    public final int method1646(byte arg0) {
        if (arg0 != -123) {
            this.field3539 = 86;
        }
        field3546++;
        return this.field3536;
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(I)V", line = 80)
    public final void method1087(int arg0) {
        OpenGL.glBindFramebufferEXT(36160, this.field3538);
        field3521++;
        if (arg0 != -25922) {
            this.field3519 = -113;
        }
        this.field3519 |= 0x4;
        this.field3517 = this.method1650(98);
    }

    @OriginalMember(owner = "client!ns", name = "b", descriptor = "(B)V", line = 99)
    public final void method1090(byte arg0) {
        field3520++;
        OpenGL.glBindFramebufferEXT(36008, this.field3538);
        if (arg0 != -52) {
            field3518 = 3;
        }
        this.field3519 |= 0x1;
        this.field3517 = this.method1650(120);
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(B)V", line = 112)
    public final void method1088(byte arg0) {
        if (arg0 != 9) {
            this.field3517 = 95;
        }
        OpenGL.glBindFramebufferEXT(36008, 0);
        field3541++;
        this.field3519 &= 0xFFFFFFFE;
        this.field3517 = this.method1650(-50);
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(IIBLnn;)V", line = 127)
    public final void method1647(int arg0, int arg1, byte arg2, class288 arg3) {
        this.method1644(arg3, arg0, -70, arg1, 0);
        field3516++;
        if (arg2 != 70) {
            this.method1657(null, -103, 85);
        }
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(Lml;II)V", line = 138)
    public final void method1648(class265 arg0, int arg1, int arg2) {
        field3545++;
        int var4 = 16 % ((arg2 - 53) / 47);
        this.method1653(1, arg1, arg0, 0);
    }

    @OriginalMember(owner = "client!ns", name = "<init>", descriptor = "(Lug;)V", line = 419)
    public class279(class395 arg0) {
        if (!arg0.field5529) {
            throw new IllegalStateException("");
        }
        this.field3534 = arg0;
        OpenGL.glGenFramebuffersEXT(1, class505.field7275, 0);
        this.field3538 = class505.field7275[0];
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(Lw;Lya;I)I", line = 151)
    public static final int method1649(class196 arg0, class38 arg1, int arg2) {
        if (arg2 != 0) {
            method1651(-68L, (byte) 81);
        }
        field3542++;
        if (arg0.field2532 != -1) {
            return arg0.field2532;
        }
        if (arg0.field2535 != -1) {
            class139 var3 = arg1.field502.method1642(arg1.method322() ? arg0.field2535 : arg0.field2524, arg2 ^ 0x7D);
            if (!var3.field1775) {
                return var3.field1795;
            }
        }
        return arg0.field2544;
    }

    @OriginalMember(owner = "client!ns", name = "c", descriptor = "(I)I", line = 176)
    private final int method1650(int arg0) {
        field3537++;
        int var2 = -22 % ((arg0 - 38) / 56);
        if ((this.field3519 & 0x4) != 0) {
            return 36160;
        } else if ((this.field3519 & 0x2) == 0) {
            return (this.field3519 & 0x1) == 0 ? -1 : 36008;
        } else {
            return 36009;
        }
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(JB)Ljava/lang/String;", line = 202)
    public static final String method1651(long arg0, byte arg1) {
        field3522++;
        if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
            return null;
        } else if (arg0 % 37L == 0L) {
            return null;
        } else {
            int var3 = 0;
            long var4 = arg0;
            int var6 = -72 % ((-arg1 - 39) / 57);
            while (var4 != 0L) {
                var3++;
                var4 /= 37L;
            }
            StringBuffer var7 = new StringBuffer(var3);
            while (arg0 != 0L) {
                long var8 = arg0;
                arg0 /= 37L;
                var7.append(class506.field7285[(int) (var8 - (arg0 * 37L))]);
            }
            return var7.reverse().toString();
        }
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(III)I", line = 246)
    public static final int method1652(int arg0, int arg1, int arg2) {
        field3529++;
        if (arg1 == -1) {
            return 12345678;
        }
        if (arg0 != 126) {
            method1649(null, null, 98);
        }
        int var3 = (arg1 & 0x7F) * arg2 >> 7;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return (arg1 & 0xFF80) + var3;
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(IILml;I)V", line = 269)
    private final void method1653(int arg0, int arg1, class265 arg2, int arg3) {
        field3528++;
        if (this.field3517 == -1) {
            throw new RuntimeException();
        }
        int var5 = arg0 << arg1;
        if ((this.field3539 & ~var5) == 0) {
            this.field3523 = arg2.field3340;
            this.field3536 = arg2.field3339;
        } else if (this.field3523 != arg2.field3340 || this.field3536 != arg2.field3339) {
            throw new RuntimeException();
        }
        arg2.method1576(this.field3517, class45.field541[arg1], 17, arg3);
        this.field3526[arg1] = arg2;
        this.field3539 |= var5;
    }

    @OriginalMember(owner = "client!ns", name = "d", descriptor = "(I)Z", line = 299)
    public final boolean method1654(int arg0) {
        field3540++;
        int var2 = OpenGL.glCheckFramebufferStatusEXT(this.field3517);
        if (arg0 == 0) {
            return var2 == 36053;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ns", name = "finalize", descriptor = "()V", line = 324)
    protected final void finalize() throws Throwable {
        field3532++;
        this.field3534.method2313(0, this.field3538);
        super.finalize();
    }

    @OriginalMember(owner = "client!ns", name = "b", descriptor = "(Z)V", line = 337)
    public static void method1655(boolean arg0) {
        if (!arg0) {
            field3527 = null;
        }
        field3527 = null;
    }

    @OriginalMember(owner = "client!ns", name = "b", descriptor = "(II)V", line = 347)
    public final void method1656(int arg0, int arg1) {
        field3525++;
        if (~this.field3517 == arg0) {
            throw new RuntimeException();
        }
        OpenGL.glReadBuffer(class45.field541[arg1]);
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(Z)V", line = 361)
    public final void method1089(boolean arg0) {
        OpenGL.glBindFramebufferEXT(36009, 0);
        if (arg0) {
            field3531++;
            this.field3519 &= 0xFFFFFFFD;
            this.field3517 = this.method1650(-73);
        }
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(Lcf;II)V", line = 375)
    public final void method1657(class430 arg0, int arg1, int arg2) {
        field3513++;
        if (this.field3517 == -1) {
            throw new RuntimeException();
        }
        int var4 = 0x1 << arg1;
        if ((this.field3539 & ~var4) == 0) {
            this.field3536 = arg0.field6108;
            this.field3523 = arg0.field6109;
        } else if (this.field3523 != arg0.field6109 || this.field3536 != arg0.field6108) {
            throw new RuntimeException();
        }
        arg0.method2520(class45.field541[arg1], this.field3517, 96);
        int var5 = 28 % ((6 - arg2) / 49);
        this.field3526[arg1] = arg0;
        this.field3539 |= var4;
    }

    @OriginalMember(owner = "client!ns", name = "b", descriptor = "(III)I", line = 405)
    public static final int method1658(int arg0, int arg1, int arg2) {
        field3535++;
        return ~arg1 == arg2 || arg1 == 3 ? class130.field1715[arg0 & 0x3] : class276.field3489[arg0 & 0x3];
    }

    @OriginalMember(owner = "client!ns", name = "c", descriptor = "(B)V", line = 432)
    public final void method1091(byte arg0) {
        if (arg0 != 112) {
            this.method1645(false, -36);
        }
        field3543++;
        OpenGL.glBindFramebufferEXT(36009, this.field3538);
        this.field3519 |= 0x2;
        this.field3517 = this.method1650(arg0 - 196);
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(BII)Z", line = 445)
    public static final boolean method1659(byte arg0, int arg1, int arg2) {
        if (arg0 >= -106) {
            field3533 = false;
        }
        field3515++;
        return (arg1 & 0x10) != 0;
    }

    @OriginalMember(owner = "client!ns", name = "b", descriptor = "(I)V", line = 456)
    public final void method1092(int arg0) {
        OpenGL.glBindFramebufferEXT(36160, 0);
        field3544++;
        if (arg0 != 16835) {
            this.method1643(-68, -4);
        }
        this.field3519 &= 0xFFFFFFFB;
        this.field3517 = this.method1650(arg0 ^ 0xFFFFBE28);
    }
}
