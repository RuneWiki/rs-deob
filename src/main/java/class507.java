import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pm")
public abstract class class507 implements class350 {

    @OriginalMember(owner = "client!pm", name = "b", descriptor = "Z")
    private boolean field7358 = false;

    @OriginalMember(owner = "client!pm", name = "w", descriptor = "I")
    public int field7379;

    @OriginalMember(owner = "client!pm", name = "o", descriptor = "I")
    private int field7371;

    @OriginalMember(owner = "client!pm", name = "q", descriptor = "I")
    public int field7373;

    @OriginalMember(owner = "client!pm", name = "e", descriptor = "Z")
    private boolean field7361;

    @OriginalMember(owner = "client!pm", name = "u", descriptor = "Lad;")
    public class362 field7377;

    @OriginalMember(owner = "client!pm", name = "n", descriptor = "I")
    public int field7370;

    @OriginalMember(owner = "client!pm", name = "f", descriptor = "[I")
    public static int[] field7362 = new int[13];

    @OriginalMember(owner = "client!pm", name = "l", descriptor = "Lig;")
    public static class206 field7368 = new class206(107, 6);

    @OriginalMember(owner = "client!pm", name = "y", descriptor = "Lhp;")
    public static class277 field7381 = new class277(10);

    @OriginalMember(owner = "client!pm", name = "z", descriptor = "I")
    public static int field7382 = class112.method688((byte) -123, 1600);

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "I")
    public static int field7357;

    @OriginalMember(owner = "client!pm", name = "c", descriptor = "I")
    public static int field7359;

    @OriginalMember(owner = "client!pm", name = "d", descriptor = "I")
    public static int field7360;

    @OriginalMember(owner = "client!pm", name = "g", descriptor = "I")
    public static int field7363;

    @OriginalMember(owner = "client!pm", name = "h", descriptor = "I")
    public static int field7364;

    @OriginalMember(owner = "client!pm", name = "i", descriptor = "I")
    public static int field7365;

    @OriginalMember(owner = "client!pm", name = "j", descriptor = "I")
    public static int field7366;

    @OriginalMember(owner = "client!pm", name = "k", descriptor = "I")
    public static int field7367;

    @OriginalMember(owner = "client!pm", name = "m", descriptor = "I")
    public static int field7369;

    @OriginalMember(owner = "client!pm", name = "p", descriptor = "I")
    public static int field7372;

    @OriginalMember(owner = "client!pm", name = "r", descriptor = "I")
    public static int field7374;

    @OriginalMember(owner = "client!pm", name = "s", descriptor = "I")
    public static int field7375;

    @OriginalMember(owner = "client!pm", name = "t", descriptor = "I")
    public static int field7376;

    @OriginalMember(owner = "client!pm", name = "v", descriptor = "I")
    public static int field7378;

    @OriginalMember(owner = "client!pm", name = "x", descriptor = "I")
    public static int field7380;

    @OriginalMember(owner = "client!pm", name = "b", descriptor = "(I)V", line = 4)
    public static final void method3013(int arg0) {
        if (arg0 != -3) {
            field7368 = null;
        }
        field7360++;
        class30.field344.method1805(arg0 ^ 0xFFFFFFF4);
    }

    @OriginalMember(owner = "client!pm", name = "c", descriptor = "(I)Z", line = 15)
    public static final boolean method3014(int arg0) {
        if (arg0 != 24250) {
            field7382 = -22;
        }
        field7364++;
        return class111.field1359 > 0;
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(IZ)V", line = 26)
    public final void method3015(int arg0, boolean arg1) {
        if (this.field7361 != arg1) {
            int var3 = this.method3025(arg0 ^ 0x594F);
            this.field7361 = true;
            this.method3021((byte) -65);
            this.method3019(var3, 113);
        }
        if (arg0 != 22860) {
            this.method3023(false);
        }
        field7376++;
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(CZ)Z", line = 48)
    public static final boolean method3016(char arg0, boolean arg1) {
        field7367++;
        if (arg0 >= ' ' && arg0 <= '~') {
            return true;
        } else if (arg0 >= ' ' && arg0 <= 'ÿ') {
            return true;
        } else {
            if (!arg1) {
                field7368 = null;
            }
            return arg0 == '€' || arg0 == 'Œ' || arg0 == '—' || arg0 == 'œ' || arg0 == 'Ÿ';
        }
    }

    @OriginalMember(owner = "client!pm", name = "<init>", descriptor = "(Lad;IIIZ)V", line = 289)
    public class507(class362 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field7379 = arg2;
        this.field7371 = arg3;
        this.field7373 = arg1;
        this.field7361 = arg4;
        this.field7377 = arg0;
        OpenGL.glGenTextures(1, class63.field712, 0);
        this.field7370 = class63.field712[0];
        this.method3019(0, 47);
    }

    @OriginalMember(owner = "client!pm", name = "d", descriptor = "(I)I", line = 75)
    public final int method3017(int arg0) {
        field7363++;
        if (arg0 != 0) {
            field7382 = -70;
        }
        return this.field7370;
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(BI)Z", line = 87)
    public static final boolean method3018(byte arg0, int arg1) {
        if (arg0 == -37) {
            field7375++;
            return arg1 == 2 || arg1 == 4 || arg1 == 5;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(II)V", line = 105)
    private final void method3019(int arg0, int arg1) {
        this.field7377.field5365 -= arg0;
        field7380++;
        if (arg1 >= 3) {
            this.field7377.field5365 += this.method3025(3);
        }
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(ZI)V", line = 117)
    public final void method3020(boolean arg0, int arg1) {
        field7359++;
        if (arg0 != this.field7358) {
            this.field7358 = arg0;
            this.method3021((byte) -65);
        }
        if (arg1 != 0) {
            method3016('\f', false);
        }
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(B)V", line = 137)
    private final void method3021(byte arg0) {
        this.field7377.method2295(arg0 ^ 0x6, this);
        field7365++;
        if (this.field7358) {
            OpenGL.glTexParameteri(this.field7373, 10241, this.field7361 ? 9987 : 9729);
            OpenGL.glTexParameteri(this.field7373, 10240, 9729);
        } else {
            OpenGL.glTexParameteri(this.field7373, 10241, this.field7361 ? 9984 : 9728);
            OpenGL.glTexParameteri(this.field7373, 10240, 9728);
        }
        if (arg0 != -65) {
            this.field7361 = true;
        }
    }

    @OriginalMember(owner = "client!pm", name = "b", descriptor = "(B)V", line = 163)
    public static void method3022(byte arg0) {
        field7368 = null;
        field7381 = null;
        if (arg0 <= -121) {
            field7362 = null;
        }
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(Z)V", line = 179)
    public final void method3023(boolean arg0) {
        if (arg0) {
            this.method3020(true, 54);
        }
        if (this.field7370 > 0) {
            this.field7377.method2334(-16, this.field7370, this.method3025(3));
            this.field7370 = 0;
        }
        field7357++;
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(BC)Z", line = 198)
    public static final boolean method3024(byte arg0, char arg1) {
        field7372++;
        if (Character.isISOControl(arg1)) {
            return false;
        } else if (class506.method3012(arg1, true)) {
            return true;
        } else if (arg0 < 10) {
            return true;
        } else {
            char[] var2 = class119.field1498;
            for (int var3 = 0; var3 < var2.length; var3++) {
                char var7 = var2[var3];
                if (arg1 == var7) {
                    return true;
                }
            }
            char[] var4 = class66.field733;
            for (int var5 = 0; var5 < var4.length; var5++) {
                char var6 = var4[var5];
                if (arg1 == var6) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!pm", name = "finalize", descriptor = "()V", line = 243)
    protected final void finalize() throws Throwable {
        this.method3023(false);
        field7378++;
        super.finalize();
    }

    @OriginalMember(owner = "client!pm", name = "e", descriptor = "(I)I", line = 252)
    private final int method3025(int arg0) {
        field7374++;
        int var2 = this.field7377.method2283(arg0, this.field7379) * this.field7371;
        if (arg0 != 3) {
            this.field7370 = -11;
        }
        return this.field7361 ? var2 * 4 / 3 : var2;
    }

    @OriginalMember(owner = "client!pm", name = "f", descriptor = "(I)Z", line = 267)
    public final boolean method3026(int arg0) {
        field7369++;
        if (!this.field7377.field5481) {
            if (arg0 != -127) {
                this.field7379 = -10;
            }
            return false;
        }
        int var2 = this.method3025(3);
        this.field7377.method2295(arg0 + 24, this);
        OpenGL.glGenerateMipmapEXT(this.field7373);
        this.field7361 = true;
        this.method3021((byte) -65);
        this.method3019(var2, 114);
        return true;
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(I)V")
    public abstract void method592(int arg0);
}
