import jaggl.OpenGL;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public class class266 implements class419 {

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "[Lwaa;")
    private class603[] field3759 = new class603[9];

    @OriginalMember(owner = "client!ne", name = "d", descriptor = "I")
    private int field3762 = 0;

    @OriginalMember(owner = "client!ne", name = "g", descriptor = "I")
    private int field3765 = -1;

    @OriginalMember(owner = "client!ne", name = "m", descriptor = "Lte;")
    private class527 field3771;

    @OriginalMember(owner = "client!ne", name = "o", descriptor = "I")
    private int field3773;

    @OriginalMember(owner = "client!ne", name = "e", descriptor = "Z")
    public static boolean field3763 = false;

    @OriginalMember(owner = "client!ne", name = "D", descriptor = "Lada;")
    public static class144 field3788 = new class144(84, 6);

    @OriginalMember(owner = "client!ne", name = "G", descriptor = "Lh;")
    public static class572 field3791 = new class572("Self", "Mich", "Moi", "Eu");

    @OriginalMember(owner = "client!ne", name = "H", descriptor = "[I")
    private static int[] field3792 = new int[] { 36064, 36065, 36066, 36067, 36068, 36069, 36070, 36071, 36096 };

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "I")
    public static int field3760;

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "I")
    public static int field3761;

    @OriginalMember(owner = "client!ne", name = "f", descriptor = "I")
    public static int field3764;

    @OriginalMember(owner = "client!ne", name = "h", descriptor = "I")
    public static int field3766;

    @OriginalMember(owner = "client!ne", name = "i", descriptor = "I")
    public static int field3767;

    @OriginalMember(owner = "client!ne", name = "j", descriptor = "I")
    public static int field3768;

    @OriginalMember(owner = "client!ne", name = "k", descriptor = "I")
    public static int field3769;

    @OriginalMember(owner = "client!ne", name = "l", descriptor = "I")
    public static int field3770;

    @OriginalMember(owner = "client!ne", name = "n", descriptor = "I")
    public static int field3772;

    @OriginalMember(owner = "client!ne", name = "p", descriptor = "I")
    public static int field3774;

    @OriginalMember(owner = "client!ne", name = "q", descriptor = "I")
    public static int field3775;

    @OriginalMember(owner = "client!ne", name = "r", descriptor = "I")
    public static int field3776;

    @OriginalMember(owner = "client!ne", name = "s", descriptor = "I")
    private int field3777;

    @OriginalMember(owner = "client!ne", name = "t", descriptor = "I")
    public static int field3778;

    @OriginalMember(owner = "client!ne", name = "u", descriptor = "I")
    public static int field3779;

    @OriginalMember(owner = "client!ne", name = "v", descriptor = "I")
    public static int field3780;

    @OriginalMember(owner = "client!ne", name = "w", descriptor = "I")
    private int field3781;

    @OriginalMember(owner = "client!ne", name = "x", descriptor = "I")
    public static int field3782;

    @OriginalMember(owner = "client!ne", name = "y", descriptor = "I")
    public static int field3783;

    @OriginalMember(owner = "client!ne", name = "z", descriptor = "I")
    public static int field3784;

    @OriginalMember(owner = "client!ne", name = "A", descriptor = "I")
    public static int field3785;

    @OriginalMember(owner = "client!ne", name = "B", descriptor = "I")
    public static int field3786;

    @OriginalMember(owner = "client!ne", name = "C", descriptor = "I")
    public static int field3787;

    @OriginalMember(owner = "client!ne", name = "E", descriptor = "I")
    public static int field3789;

    @OriginalMember(owner = "client!ne", name = "F", descriptor = "I")
    private int field3790;

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(Lci;IIB)V", line = 3)
    public final void method1670(class384 arg0, int arg1, int arg2, byte arg3) {
        field3770++;
        this.method1675(0, false, arg0, arg2, arg1);
        if (arg3 != -115) {
            this.method1673(-86);
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(II)V", line = 14)
    public final void method1671(int arg0, int arg1) {
        field3782++;
        if (this.field3765 == arg0) {
            throw new RuntimeException();
        }
        OpenGL.glDrawBuffer(field3792[arg1]);
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(BILhk;)V", line = 26)
    public final void method1672(byte arg0, int arg1, class86 arg2) {
        field3779++;
        if (this.field3765 == -1) {
            throw new RuntimeException();
        }
        if (arg0 != -125) {
            this.method1691(124);
        }
        int var4 = 0x1 << arg1;
        if ((~var4 & this.field3777) == 0) {
            this.field3790 = arg2.field1222;
            this.field3781 = arg2.field1230;
        } else if (this.field3781 != arg2.field1230 || this.field3790 != arg2.field1222) {
            throw new RuntimeException();
        }
        arg2.method645(this.field3765, arg0 + 36286, field3792[arg1]);
        this.field3759[arg1] = arg2;
        this.field3777 |= var4;
    }

    @OriginalMember(owner = "client!ne", name = "d", descriptor = "(I)V", line = 59)
    public final void method1673(int arg0) {
        OpenGL.glBindFramebufferEXT(36008, this.field3773);
        field3767++;
        if (arg0 < -64) {
            this.field3762 |= 0x1;
            this.field3765 = this.method1690((byte) 102);
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(II[BLjava/io/File;)V", line = 75)
    public static final void method1674(int arg0, int arg1, byte[] arg2, File arg3) throws IOException {
        field3775++;
        DataInputStream var4 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg3)));
        try {
            var4.readFully(arg2, arg1, arg0);
        } catch (EOFException var5) {
        }
        var4.close();
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(IZLci;II)V", line = 89)
    private final void method1675(int arg0, boolean arg1, class384 arg2, int arg3, int arg4) {
        field3772++;
        if (this.field3765 == -1) {
            throw new RuntimeException();
        }
        if (arg1) {
            this.field3777 = -124;
        }
        int var6 = 0x1 << arg4;
        if ((~var6 & this.field3777) == 0) {
            this.field3790 = arg2.field5280;
            this.field3781 = arg2.field5280;
        } else if (this.field3781 != arg2.field5280 || this.field3790 != arg2.field5280) {
            throw new RuntimeException();
        }
        arg2.method2288(field3792[arg4], arg3, this.field3765, (byte) -93, arg0);
        this.field3759[arg4] = arg2;
        this.field3777 |= var6;
    }

    @OriginalMember(owner = "client!ne", name = "<init>", descriptor = "(Lte;)V", line = 488)
    public class266(class527 arg0) {
        if (!arg0.field7856) {
            throw new IllegalStateException("");
        }
        this.field3771 = arg0;
        OpenGL.glGenFramebuffersEXT(1, class132.field1813, 0);
        this.field3773 = class132.field1813[0];
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(BLvp;IILpa;IIIJ)V", line = 125)
    public static final void method1676(byte arg0, class162 arg1, int arg2, int arg3, class311 arg4, int arg5, int arg6, int arg7, long arg8) {
        if (arg0 != 69) {
            field3792 = null;
        }
        field3774++;
        int var10 = arg3 * arg3 + arg6 * arg6;
        if (((long) var10) > arg8) {
            return;
        }
        int var11 = Math.min(arg1.field2527 / 2, arg1.field2459 / 2);
        if (var11 * var11 >= var10) {
            class440.method2558(arg1, arg3, arg4, arg5, class349.field4779[arg2], 11643, arg6, arg7);
            return;
        }
        var11 -= 10;
        int var12;
        if (class531.field7929 == 4) {
            var12 = (int) class539.field8023 & 0x3FFF;
        } else {
            var12 = (int) class539.field8023 + class300.field4113 & 0x3FFF;
        }
        int var13 = class589.field8742[var12];
        int var14 = class589.field8735[var12];
        if (class531.field7929 != 4) {
            var14 = var14 * 256 / (class449.field6301 + 256);
            var13 = var13 * 256 / (class449.field6301 + 256);
        }
        int var15 = arg3 * var14 + arg6 * var13 >> 15;
        int var16 = arg6 * var14 - arg3 * var13 >> 15;
        double var17 = Math.atan2((double) var15, (double) var16);
        int var19 = (int) ((double) var11 * Math.sin(var17));
        int var20 = (int) (Math.cos(var17) * (double) var11);
        class474.field6699[arg2].method328((float) arg1.field2527 / 2.0F + (float) arg7 + (float) var19, (float) arg1.field2459 / 2.0F + (float) arg5 - (float) var20, 4096, (int) (-var17 / 6.283185307179586D * 65535.0D));
    }

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "(B)Z", line = 179)
    public final boolean method1677(byte arg0) {
        field3785++;
        int var2 = OpenGL.glCheckFramebufferStatusEXT(this.field3765);
        if (var2 == 36053) {
            return arg0 == 81;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ne", name = "finalize", descriptor = "()V", line = 210)
    protected final void finalize() throws Throwable {
        this.field3771.method3177(this.field3773, (byte) 125);
        field3789++;
        super.finalize();
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(IZ)V", line = 221)
    public final void method1678(int arg0, boolean arg1) {
        if (this.field3759[arg0] != null) {
            this.field3759[arg0].method642(-108);
        }
        field3786++;
        this.field3777 &= ~(0x1 << arg0);
        if (!arg1) {
            this.field3790 = -59;
        }
        this.field3759[arg0] = null;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(Z)I", line = 238)
    public final int method1679(boolean arg0) {
        field3761++;
        return arg0 ? this.field3790 : 117;
    }

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "(I)V", line = 256)
    public final void method1680(int arg0) {
        OpenGL.glBindFramebufferEXT(36160, this.field3773);
        field3776++;
        this.field3762 |= 0x4;
        this.field3765 = this.method1690((byte) 107);
        if (arg0 != 30918) {
            this.method1682(-58, 57);
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(IILea;I)V", line = 269)
    private final void method1681(int arg0, int arg1, class468 arg2, int arg3) {
        field3778++;
        if (this.field3765 == -1) {
            throw new RuntimeException();
        }
        int var5 = arg1 << arg3;
        if ((this.field3777 & ~var5) == 0) {
            this.field3790 = arg2.field6589;
            this.field3781 = arg2.field6587;
        } else if (this.field3781 != arg2.field6587 || this.field3790 != arg2.field6589) {
            throw new RuntimeException();
        }
        arg2.method2820(arg1 ^ 0x6A, arg0, field3792[arg3], this.field3765);
        this.field3759[arg3] = arg2;
        this.field3777 |= var5;
    }

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "(II)V", line = 296)
    public final void method1682(int arg0, int arg1) {
        field3760++;
        if (arg1 != 36069) {
            return;
        }
        if (this.field3765 == -1) {
            throw new RuntimeException();
        }
        OpenGL.glReadBuffer(field3792[arg0]);
    }

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "(B)V", line = 313)
    public final void method1683(byte arg0) {
        OpenGL.glBindFramebufferEXT(36009, this.field3773);
        if (arg0 != 56) {
            method1688(-6);
        }
        field3764++;
        this.field3762 |= 0x2;
        this.field3765 = this.method1690((byte) 106);
    }

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "(II)[B", line = 327)
    public static final byte[] method1684(int arg0, int arg1) {
        if (arg1 != 36068) {
            method1684(21, 32);
        }
        field3769++;
        class647 var2 = (class647) class564.field8347.method1423((byte) 89, (long) arg0);
        if (var2 == null) {
            byte[] var3 = new byte[512];
            Random var4 = new Random((long) arg0);
            for (int var5 = 0; var5 < 255; var5++) {
                var3[var5] = (byte) var5;
            }
            for (int var6 = 0; var6 < 255; var6++) {
                int var7 = 255 - var6;
                int var8 = class240.method1534(false, var7, var4);
                byte var9 = var3[var8];
                var3[var8] = var3[var7];
                var3[var7] = var3[511 - var6] = var9;
            }
            var2 = new class647(var3);
            class564.field8347.method1422((long) arg0, var2, -91);
        }
        return var2.field9394;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(IIBII)I", line = 380)
    public static final int method1685(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        field3783++;
        int var5 = 65536 - class589.field8735[arg4 * 8192 / arg1] >> 1;
        return arg2 == -14 ? ((65536 - var5) * arg0 >> 16) + (arg3 * var5 >> 16) : -52;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(B)V", line = 393)
    public final void method1686(byte arg0) {
        OpenGL.glBindFramebufferEXT(36009, 0);
        field3768++;
        this.field3762 &= 0xFFFFFFFD;
        if (arg0 != -9) {
            this.method1690((byte) 14);
        }
        this.field3765 = this.method1690((byte) 100);
    }

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "(I)V", line = 406)
    public final void method1687(int arg0) {
        if (arg0 != -6762) {
            this.method1687(1);
        }
        field3784++;
        OpenGL.glBindFramebufferEXT(36160, 0);
        this.field3762 &= 0xFFFFFFFB;
        this.field3765 = this.method1690((byte) 110);
    }

    @OriginalMember(owner = "client!ne", name = "e", descriptor = "(I)V", line = 425)
    public static void method1688(int arg0) {
        field3791 = null;
        field3792 = null;
        field3788 = null;
        if (arg0 != 255) {
            method1684(-127, 123);
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(ZLea;I)V", line = 438)
    public final void method1689(boolean arg0, class468 arg1, int arg2) {
        if (!arg0) {
            this.field3759 = null;
        }
        field3780++;
        this.method1681(0, 1, arg1, arg2);
    }

    @OriginalMember(owner = "client!ne", name = "d", descriptor = "(B)I", line = 449)
    private final int method1690(byte arg0) {
        field3766++;
        if (arg0 < 94) {
            return 102;
        } else if ((this.field3762 & 0x4) != 0) {
            return 36160;
        } else if ((this.field3762 & 0x2) == 0) {
            return (this.field3762 & 0x1) == 0 ? -1 : 36008;
        } else {
            return 36009;
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(I)V", line = 475)
    public final void method1691(int arg0) {
        field3787++;
        OpenGL.glBindFramebufferEXT(36008, 0);
        this.field3762 &= 0xFFFFFFFE;
        this.field3765 = this.method1690((byte) 120);
        if (arg0 != 6706) {
            this.method1683((byte) 83);
        }
    }
}
