import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bb")
public class class217 implements class336 {

    @OriginalMember(owner = "client!bb", name = "m", descriptor = "[Lpb;")
    private class463[] field3134 = new class463[9];

    @OriginalMember(owner = "client!bb", name = "t", descriptor = "I")
    private int field3141 = -1;

    @OriginalMember(owner = "client!bb", name = "z", descriptor = "I")
    private int field3147 = 0;

    @OriginalMember(owner = "client!bb", name = "g", descriptor = "Lqg;")
    private class321 field3128;

    @OriginalMember(owner = "client!bb", name = "n", descriptor = "I")
    private int field3135;

    @OriginalMember(owner = "client!bb", name = "B", descriptor = "Lgf;")
    public static class180 field3149 = new class180("Please remove ", "Bitte entferne ", "Veuillez commencer par supprimer ", "Remova ");

    @OriginalMember(owner = "client!bb", name = "E", descriptor = "[I")
    public static int[] field3152 = new int[] { 0, 1, 2, 3, 4, 5, 6, 14 };

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "I")
    public static int field3122;

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "I")
    public static int field3123;

    @OriginalMember(owner = "client!bb", name = "c", descriptor = "I")
    public static int field3124;

    @OriginalMember(owner = "client!bb", name = "d", descriptor = "I")
    public static int field3125;

    @OriginalMember(owner = "client!bb", name = "e", descriptor = "I")
    public static int field3126;

    @OriginalMember(owner = "client!bb", name = "f", descriptor = "I")
    public static int field3127;

    @OriginalMember(owner = "client!bb", name = "h", descriptor = "I")
    public static int field3129;

    @OriginalMember(owner = "client!bb", name = "i", descriptor = "I")
    public static int field3130;

    @OriginalMember(owner = "client!bb", name = "j", descriptor = "I")
    public static int field3131;

    @OriginalMember(owner = "client!bb", name = "k", descriptor = "I")
    public static int field3132;

    @OriginalMember(owner = "client!bb", name = "l", descriptor = "I")
    private int field3133;

    @OriginalMember(owner = "client!bb", name = "o", descriptor = "I")
    public static int field3136;

    @OriginalMember(owner = "client!bb", name = "p", descriptor = "I")
    public static int field3137;

    @OriginalMember(owner = "client!bb", name = "q", descriptor = "I")
    private int field3138;

    @OriginalMember(owner = "client!bb", name = "r", descriptor = "I")
    public static int field3139;

    @OriginalMember(owner = "client!bb", name = "s", descriptor = "I")
    public static int field3140;

    @OriginalMember(owner = "client!bb", name = "u", descriptor = "I")
    public static int field3142;

    @OriginalMember(owner = "client!bb", name = "v", descriptor = "I")
    public static int field3143;

    @OriginalMember(owner = "client!bb", name = "w", descriptor = "I")
    public static int field3144;

    @OriginalMember(owner = "client!bb", name = "x", descriptor = "I")
    public static int field3145;

    @OriginalMember(owner = "client!bb", name = "y", descriptor = "I")
    private int field3146;

    @OriginalMember(owner = "client!bb", name = "A", descriptor = "I")
    public static int field3148;

    @OriginalMember(owner = "client!bb", name = "C", descriptor = "I")
    public static int field3150;

    @OriginalMember(owner = "client!bb", name = "D", descriptor = "I")
    public static int field3151;

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(B)V")
    public final void method1429(byte arg0) {
        if (arg0 != -1) {
            field3152 = null;
        }
        OpenGL.glBindFramebufferEXT(36009, 0);
        field3123++;
        this.field3147 &= 0xFFFFFFFD;
        this.field3141 = this.method1443((byte) 110);
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(II)V")
    public final void method1430(int arg0, int arg1) {
        if (arg0 > -27) {
            field3152 = null;
        }
        field3126++;
        if (this.field3141 == -1) {
            throw new RuntimeException();
        }
        OpenGL.glDrawBuffer(class467.field6870[arg1]);
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(IILjp;I)V")
    private final void method1431(int arg0, int arg1, class236 arg2, int arg3) {
        field3124++;
        if (this.field3141 == -1) {
            throw new RuntimeException();
        }
        int var5 = arg3 << arg0;
        if ((this.field3133 & ~var5) == 0) {
            this.field3146 = arg2.field3429;
            this.field3138 = arg2.field3430;
        } else if (this.field3138 != arg2.field3430 || this.field3146 != arg2.field3429) {
            throw new RuntimeException();
        }
        arg2.method1532(class467.field6870[arg0], arg1, this.field3141, -75);
        this.field3134[arg0] = arg2;
        this.field3133 |= var5;
    }

    @OriginalMember(owner = "client!bb", name = "e", descriptor = "(B)V")
    public final void method1432(byte arg0) {
        field3131++;
        if (arg0 != 101) {
            this.field3134 = null;
        }
        OpenGL.glBindFramebufferEXT(36008, 0);
        this.field3147 &= 0xFFFFFFFE;
        this.field3141 = this.method1443((byte) 83);
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(I)V")
    public final void method1433(int arg0) {
        field3129++;
        OpenGL.glBindFramebufferEXT(36008, this.field3135);
        this.field3147 |= 0x1;
        if (arg0 != 9435) {
            this.method1447((byte) 0);
        }
        this.field3141 = this.method1443((byte) -53);
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(ILnm;III)V")
    private final void method1434(int arg0, class329 arg1, int arg2, int arg3, int arg4) {
        field3150++;
        if (this.field3141 == -1) {
            throw new RuntimeException();
        }
        int var6 = 97 / ((arg2 - 26) / 50);
        int var7 = 0x1 << arg3;
        if ((this.field3133 & ~var7) == 0) {
            this.field3146 = arg1.field5077;
            this.field3138 = arg1.field5077;
        } else if (this.field3138 != arg1.field5077 || this.field3146 != arg1.field5077) {
            throw new RuntimeException();
        }
        arg1.method2147(class467.field6870[arg3], (byte) 77, arg0, this.field3141, arg4);
        this.field3134[arg3] = arg1;
        this.field3133 |= var7;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(IILnm;I)V")
    public final void method1435(int arg0, int arg1, class329 arg2, int arg3) {
        field3122++;
        this.method1434(arg3, arg2, -48, arg0, arg1);
    }

    @OriginalMember(owner = "client!bb", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.field3128.method2021(this.field3135, true);
        field3127++;
        super.finalize();
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(ZI)V")
    public final void method1436(boolean arg0, int arg1) {
        field3139++;
        if (this.field3141 == -1) {
            throw new RuntimeException();
        }
        OpenGL.glReadBuffer(class467.field6870[arg1]);
        if (arg0) {
            this.method1447((byte) 6);
        }
    }

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "(B)V")
    public final void method1437(byte arg0) {
        OpenGL.glBindFramebufferEXT(36160, 0);
        field3144++;
        if (arg0 != -115) {
            this.field3133 = -77;
        }
        this.field3147 &= 0xFFFFFFFB;
        this.field3141 = this.method1443((byte) -121);
    }

    @OriginalMember(owner = "client!bb", name = "c", descriptor = "(B)V")
    public final void method1438(byte arg0) {
        OpenGL.glBindFramebufferEXT(36160, this.field3135);
        field3143++;
        this.field3147 |= 0x4;
        this.field3141 = this.method1443((byte) -89);
        if (arg0 != -113) {
            this.field3134 = null;
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(Lec;II)V")
    public final void method1439(class156 arg0, int arg1, int arg2) {
        field3145++;
        if (this.field3141 == -1) {
            throw new RuntimeException();
        }
        int var4 = 0x1 << arg1;
        int var5 = -102 / ((67 - arg2) / 46);
        if ((~var4 & this.field3133) == 0) {
            this.field3138 = arg0.field2381;
            this.field3146 = arg0.field2371;
        } else if (this.field3138 != arg0.field2381 || this.field3146 != arg0.field2371) {
            throw new RuntimeException();
        }
        arg0.method1126(class467.field6870[arg1], this.field3141, 0);
        this.field3134[arg1] = arg0;
        this.field3133 |= var4;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(Z)I")
    public final int method1440(boolean arg0) {
        if (arg0) {
            return -9;
        } else {
            field3137++;
            return this.field3146;
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(IIIII)V")
    public static final void method1441(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3140++;
        float var5 = (float) class2.field36 / (float) class2.field39;
        int var6 = arg3;
        int var7 = arg0;
        if (var5 < 1.0F) {
            var7 = (int) ((float) arg3 * var5);
        } else {
            var6 = (int) ((float) arg0 / var5);
        }
        int var8 = arg4 - (arg3 - var6) / 2;
        int var9 = arg2 - (arg0 - var7) / 2;
        class25.field439 = class2.field39 * var8 / var6;
        class33.field522 = class2.field36 - class2.field36 * var9 / var7;
        class511.field7539 = arg1;
        class504.field7389 = -1;
        class182.method1276((byte) -59);
    }

    @OriginalMember(owner = "client!bb", name = "f", descriptor = "(B)V")
    public static void method1442(byte arg0) {
        if (arg0 < 38) {
            method1442((byte) 21);
        }
        field3149 = null;
        field3152 = null;
    }

    @OriginalMember(owner = "client!bb", name = "g", descriptor = "(B)I")
    private final int method1443(byte arg0) {
        field3142++;
        if ((this.field3147 & 0x4) != 0) {
            return 36160;
        }
        int var2 = 106 % ((arg0 - 32) / 44);
        if ((this.field3147 & 0x2) == 0) {
            return (this.field3147 & 0x1) == 0 ? -1 : 36008;
        } else {
            return 36009;
        }
    }

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "(I)Z")
    public final boolean method1444(int arg0) {
        field3151++;
        int var2 = OpenGL.glCheckFramebufferStatusEXT(this.field3141);
        if (arg0 > -125) {
            this.method1449((byte) -70, null, 39);
        }
        return var2 == 36053;
    }

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "(II)V")
    public final void method1445(int arg0, int arg1) {
        field3148++;
        if (this.field3134[arg1] != null) {
            this.field3134[arg1].method329(true);
        }
        this.field3133 &= ~(arg0 << arg1);
        this.field3134[arg1] = null;
    }

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "(ZI)Lrm;")
    public static final class281 method1446(boolean arg0, int arg1) {
        field3136++;
        class281 var2 = (class281) class388.field5751.method2339(-107, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class397.field5832.method683(0, arg1, 5);
        class281 var4 = new class281();
        if (arg0) {
            method1441(15, -56, 50, -29, 73);
        }
        if (var3 != null) {
            var4.method1778(new class303(var3), (byte) 71);
        }
        var4.method1777((byte) 103);
        class388.field5751.method2342((long) arg1, var4, 49);
        return var4;
    }

    @OriginalMember(owner = "client!bb", name = "d", descriptor = "(B)V")
    public final void method1447(byte arg0) {
        OpenGL.glBindFramebufferEXT(36009, this.field3135);
        field3130++;
        this.field3147 |= 0x2;
        this.field3141 = this.method1443((byte) -19);
        if (arg0 >= -38) {
            field3149 = null;
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "([IIIII)V")
    public static final void method1448(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg3 != 4) {
            field3149 = null;
        }
        field3125++;
        arg1--;
        int var13 = arg4 - 1;
        int var5 = var13 - 7;
        while (arg1 < var5) {
            int var6 = arg1 + 1;
            arg0[var6] = arg2;
            int var7 = var6 + 1;
            arg0[var7] = arg2;
            int var8 = var7 + 1;
            arg0[var8] = arg2;
            int var9 = var8 + 1;
            arg0[var9] = arg2;
            int var10 = var9 + 1;
            arg0[var10] = arg2;
            int var11 = var10 + 1;
            arg0[var11] = arg2;
            int var12 = var11 + 1;
            arg0[var12] = arg2;
            arg1 = var12 + 1;
            arg0[arg1] = arg2;
        }
        while (arg1 < var13) {
            arg1++;
            arg0[arg1] = arg2;
        }
    }

    @OriginalMember(owner = "client!bb", name = "<init>", descriptor = "(Lqg;)V")
    public class217(class321 arg0) {
        if (!arg0.field4836) {
            throw new IllegalStateException("");
        }
        this.field3128 = arg0;
        OpenGL.glGenFramebuffersEXT(1, class264.field3818, 0);
        this.field3135 = class264.field3818[0];
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(BLjp;I)V")
    public final void method1449(byte arg0, class236 arg1, int arg2) {
        field3132++;
        int var4 = -110 % ((-arg0 - 1) / 46);
        this.method1431(arg2, 0, arg1, 1);
    }
}
