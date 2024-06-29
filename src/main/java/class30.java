import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iha")
public class class30 implements class16 {

    @OriginalMember(owner = "client!iha", name = "j", descriptor = "I")
    private int field295 = -1;

    @OriginalMember(owner = "client!iha", name = "m", descriptor = "[Ll;")
    private class18[] field298 = new class18[9];

    @OriginalMember(owner = "client!iha", name = "s", descriptor = "I")
    private int field304 = 0;

    @OriginalMember(owner = "client!iha", name = "A", descriptor = "Lwh;")
    private class148 field312;

    @OriginalMember(owner = "client!iha", name = "f", descriptor = "I")
    private int field291;

    @OriginalMember(owner = "client!iha", name = "a", descriptor = "I")
    public static int field286;

    @OriginalMember(owner = "client!iha", name = "b", descriptor = "I")
    public static int field287;

    @OriginalMember(owner = "client!iha", name = "c", descriptor = "I")
    public static int field288;

    @OriginalMember(owner = "client!iha", name = "d", descriptor = "I")
    public static int field289;

    @OriginalMember(owner = "client!iha", name = "e", descriptor = "I")
    public static int field290;

    @OriginalMember(owner = "client!iha", name = "g", descriptor = "I")
    public static int field292;

    @OriginalMember(owner = "client!iha", name = "h", descriptor = "I")
    public static int field293;

    @OriginalMember(owner = "client!iha", name = "i", descriptor = "I")
    public static int field294;

    @OriginalMember(owner = "client!iha", name = "k", descriptor = "I")
    private int field296;

    @OriginalMember(owner = "client!iha", name = "l", descriptor = "I")
    public static int field297;

    @OriginalMember(owner = "client!iha", name = "n", descriptor = "I")
    public static int field299;

    @OriginalMember(owner = "client!iha", name = "o", descriptor = "I")
    public static int field300;

    @OriginalMember(owner = "client!iha", name = "p", descriptor = "I")
    public static int field301;

    @OriginalMember(owner = "client!iha", name = "q", descriptor = "I")
    public static int field302;

    @OriginalMember(owner = "client!iha", name = "r", descriptor = "I")
    public static int field303;

    @OriginalMember(owner = "client!iha", name = "t", descriptor = "I")
    private int field305;

    @OriginalMember(owner = "client!iha", name = "v", descriptor = "I")
    private int field307;

    @OriginalMember(owner = "client!iha", name = "w", descriptor = "I")
    public static int field308;

    @OriginalMember(owner = "client!iha", name = "x", descriptor = "I")
    public static int field309;

    @OriginalMember(owner = "client!iha", name = "y", descriptor = "I")
    public static int field310;

    @OriginalMember(owner = "client!iha", name = "z", descriptor = "I")
    public static int field311;

    @OriginalMember(owner = "client!iha", name = "B", descriptor = "I")
    public static int field313;

    @OriginalMember(owner = "client!iha", name = "C", descriptor = "I")
    public static int field314;

    @OriginalMember(owner = "client!iha", name = "u", descriptor = "[I")
    public static int[] field306;

    @OriginalMember(owner = "client!iha", name = "a", descriptor = "(IB)V", line = 3)
    public final void method144(int arg0, byte arg1) {
        field303++;
        if (this.field295 == -1) {
            throw new RuntimeException();
        }
        int var3 = -13 % ((-arg1 - 56) / 49);
        OpenGL.glReadBuffer(class346.field5000[arg0]);
    }

    @OriginalMember(owner = "client!iha", name = "a", descriptor = "(Lnc;IBII)V", line = 21)
    private final void method145(class24 arg0, int arg1, byte arg2, int arg3, int arg4) {
        field302++;
        if (this.field295 == -1) {
            throw new RuntimeException();
        }
        int var6 = 0x1 << arg1;
        if ((~var6 & this.field305) == 0) {
            this.field307 = arg0.field245;
            this.field296 = arg0.field245;
        } else if (this.field307 != arg0.field245 || this.field296 != arg0.field245) {
            throw new RuntimeException();
        }
        arg0.method122(arg3, class346.field5000[arg1], arg2 ^ 0x8537, arg4, this.field295);
        if (arg2 != 34) {
            method149((byte) 30);
        }
        this.field298[arg1] = arg0;
        this.field305 |= var6;
    }

    @OriginalMember(owner = "client!iha", name = "finalize", descriptor = "()V", line = 52)
    protected final void finalize() throws Throwable {
        field308++;
        this.field312.method1073(this.field291, 1);
        super.finalize();
    }

    @OriginalMember(owner = "client!iha", name = "a", descriptor = "(IILaw;I)V", line = 62)
    private final void method146(int arg0, int arg1, class76 arg2, int arg3) {
        field300++;
        if (this.field295 == -1) {
            throw new RuntimeException();
        }
        int var5 = 0x1 << arg3;
        if ((~var5 & this.field305) == 0) {
            this.field296 = arg2.field1050;
            this.field307 = arg2.field1055;
        } else if (this.field307 != arg2.field1055 || this.field296 != arg2.field1050) {
            throw new RuntimeException();
        }
        arg2.method631(class346.field5000[arg3], 0, this.field295, arg0);
        this.field298[arg3] = arg2;
        this.field305 |= var5;
        if (arg1 != -32542) {
            method148(true, null);
        }
    }

    @OriginalMember(owner = "client!iha", name = "c", descriptor = "(I)V", line = 95)
    public final void method100(int arg0) {
        OpenGL.glBindFramebufferEXT(36008, 0);
        field314++;
        this.field304 &= 0xFFFFFFFE;
        this.field295 = this.method152(94);
        if (arg0 != -25412) {
            this.method97(-90);
        }
    }

    @OriginalMember(owner = "client!iha", name = "b", descriptor = "(I)V", line = 109)
    public final void method98(int arg0) {
        OpenGL.glBindFramebufferEXT(36009, 0);
        field297++;
        this.field304 &= 0xFFFFFFFD;
        this.field295 = this.method152(123);
        if (arg0 != 4197) {
            this.method147((byte) -83, 58, 26, null);
        }
    }

    @OriginalMember(owner = "client!iha", name = "a", descriptor = "(BIILnc;)V", line = 123)
    public final void method147(byte arg0, int arg1, int arg2, class24 arg3) {
        if (arg0 != 67) {
            method153('\u0007', -119);
        }
        this.method145(arg3, arg2, (byte) 34, arg1, 0);
        field309++;
    }

    @OriginalMember(owner = "client!iha", name = "a", descriptor = "(ZLjava/lang/String;)I", line = 138)
    public static final int method148(boolean arg0, String arg1) {
        field287++;
        int var2 = arg1.length();
        int var3 = 0;
        if (arg0) {
            for (int var4 = 0; var4 < var2; var4++) {
                var3 = arg1.charAt(var4) + ((var3 << 5) - var3);
            }
            return var3;
        } else {
            return 15;
        }
    }

    @OriginalMember(owner = "client!iha", name = "d", descriptor = "(B)Ljm;", line = 160)
    public static final class691 method149(byte arg0) {
        if (arg0 != 92) {
            field306 = null;
        }
        field286++;
        try {
            return (class691) Class.forName("gba").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!iha", name = "b", descriptor = "(B)V", line = 177)
    public final void method101(byte arg0) {
        if (arg0 <= 88) {
            this.field305 = 0;
        }
        OpenGL.glBindFramebufferEXT(36160, this.field291);
        field293++;
        this.field304 |= 0x4;
        this.field295 = this.method152(75);
    }

    @OriginalMember(owner = "client!iha", name = "a", descriptor = "(IZ)V", line = 191)
    public final void method150(int arg0, boolean arg1) {
        field292++;
        if (this.field295 == -1) {
            throw new RuntimeException();
        }
        OpenGL.glDrawBuffer(class346.field5000[arg0]);
        if (!arg1) {
            this.field304 = 118;
        }
    }

    @OriginalMember(owner = "client!iha", name = "a", descriptor = "(ILaw;I)V", line = 206)
    public final void method151(int arg0, class76 arg1, int arg2) {
        field288++;
        if (arg2 <= 56) {
            this.field304 = 76;
        }
        this.method146(0, -32542, arg1, arg0);
    }

    @OriginalMember(owner = "client!iha", name = "d", descriptor = "(I)I", line = 217)
    private final int method152(int arg0) {
        field294++;
        if ((this.field304 & 0x4) != 0) {
            return 36160;
        } else if ((this.field304 & 0x2) == 0) {
            if (arg0 < 27) {
                this.method100(13);
            }
            return (this.field304 & 0x1) == 0 ? -1 : 36008;
        } else {
            return 36009;
        }
    }

    @OriginalMember(owner = "client!iha", name = "a", descriptor = "(CI)C", line = 248)
    public static final char method153(char arg0, int arg1) {
        if (arg1 != -194) {
            field306 = null;
        }
        field301++;
        if (arg0 == ' ' || arg0 == ' ' || arg0 == '_' || arg0 == '-') {
            return '_';
        } else if (arg0 == '[' || arg0 == ']' || arg0 == '#') {
            return arg0;
        } else if (arg0 == 'à' || arg0 == 'á' || arg0 == 'â' || arg0 == 'ä' || arg0 == 'ã' || arg0 == 'À' || arg0 == 'Á' || arg0 == 'Â' || arg0 == 'Ä' || arg0 == 'Ã') {
            return 'a';
        } else if (arg0 == 'è' || arg0 == 'é' || arg0 == 'ê' || arg0 == 'ë' || arg0 == 'È' || arg0 == 'É' || arg0 == 'Ê' || arg0 == 'Ë') {
            return 'e';
        } else if (arg0 == 'í' || arg0 == 'î' || arg0 == 'ï' || arg0 == 'Í' || arg0 == 'Î' || arg0 == 'Ï') {
            return 'i';
        } else if (arg0 == 'ò' || arg0 == 'ó' || arg0 == 'ô' || arg0 == 'ö' || arg0 == 'õ' || arg0 == 'Ò' || arg0 == 'Ó' || arg0 == 'Ô' || arg0 == 'Ö' || arg0 == 'Õ') {
            return 'o';
        } else if (arg0 == 'ù' || arg0 == 'ú' || arg0 == 'û' || arg0 == 'ü' || arg0 == 'Ù' || arg0 == 'Ú' || arg0 == 'Û' || arg0 == 'Ü') {
            return 'u';
        } else if (arg0 == 'ç' || arg0 == 'Ç') {
            return 'c';
        } else if (arg0 == 'ÿ' || arg0 == 'Ÿ') {
            return 'y';
        } else if (arg0 == 'ñ' || arg0 == 'Ñ') {
            return 'n';
        } else if (arg0 == 'ß') {
            return 'b';
        } else {
            return Character.toLowerCase(arg0);
        }
    }

    @OriginalMember(owner = "client!iha", name = "a", descriptor = "(B)V", line = 647)
    public final void method99(byte arg0) {
        OpenGL.glBindFramebufferEXT(36008, this.field291);
        field299++;
        this.field304 |= 0x1;
        this.field295 = this.method152(29);
        if (arg0 >= -121) {
            this.method97(-83);
        }
    }

    @OriginalMember(owner = "client!iha", name = "e", descriptor = "(I)Z", line = 660)
    public final boolean method154(int arg0) {
        field313++;
        int var2 = OpenGL.glCheckFramebufferStatusEXT(this.field295);
        if (var2 == 36053) {
            if (arg0 != 239) {
                this.method146(-103, 19, null, 118);
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!iha", name = "<init>", descriptor = "(Lwh;)V", line = 778)
    public class30(class148 arg0) {
        if (!arg0.field2205) {
            throw new IllegalStateException("");
        }
        this.field312 = arg0;
        OpenGL.glGenFramebuffersEXT(1, class169.field2650, 0);
        this.field291 = class169.field2650[0];
    }

    @OriginalMember(owner = "client!iha", name = "a", descriptor = "(I)V", line = 689)
    public final void method97(int arg0) {
        field289++;
        OpenGL.glBindFramebufferEXT(36160, 0);
        this.field304 &= 0xFFFFFFFB;
        if (arg0 == -32609) {
            this.field295 = this.method152(arg0 + 32727);
        }
    }

    @OriginalMember(owner = "client!iha", name = "a", descriptor = "(Laea;II)V", line = 702)
    public final void method155(class51 arg0, int arg1, int arg2) {
        field310++;
        if (~this.field295 == arg1) {
            throw new RuntimeException();
        }
        int var4 = 0x1 << arg2;
        if ((this.field305 & ~var4) == 0) {
            this.field307 = arg0.field726;
            this.field296 = arg0.field731;
        } else if (this.field307 != arg0.field726 || this.field296 != arg0.field731) {
            throw new RuntimeException();
        }
        arg0.method372(this.field295, class346.field5000[arg2], 36161);
        this.field298[arg2] = arg0;
        this.field305 |= var4;
    }

    @OriginalMember(owner = "client!iha", name = "c", descriptor = "(B)V", line = 733)
    public final void method102(byte arg0) {
        field290++;
        OpenGL.glBindFramebufferEXT(36009, this.field291);
        if (arg0 >= -113) {
            this.field304 = -60;
        }
        this.field304 |= 0x2;
        this.field295 = this.method152(104);
    }

    @OriginalMember(owner = "client!iha", name = "f", descriptor = "(I)V", line = 747)
    public static void method156(int arg0) {
        field306 = null;
        if (arg0 != 241) {
            field306 = null;
        }
    }

    @OriginalMember(owner = "client!iha", name = "a", descriptor = "(II)V", line = 762)
    public final void method157(int arg0, int arg1) {
        field311++;
        if (this.field298[arg0] != null) {
            this.field298[arg0].method106(87);
        }
        if (arg1 == -210) {
            this.field305 &= ~(0x1 << arg0);
            this.field298[arg0] = null;
        }
    }
}
