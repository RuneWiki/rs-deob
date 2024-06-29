import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vn")
public class class206 implements class152 {

    @OriginalMember(owner = "client!vn", name = "b", descriptor = "I")
    private int field3286 = -1;

    @OriginalMember(owner = "client!vn", name = "u", descriptor = "I")
    private int field3305 = 0;

    @OriginalMember(owner = "client!vn", name = "w", descriptor = "[Lpq;")
    private class131[] field3307 = new class131[9];

    @OriginalMember(owner = "client!vn", name = "f", descriptor = "Lda;")
    private class44 field3290;

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "I")
    private int field3285;

    @OriginalMember(owner = "client!vn", name = "o", descriptor = "Lbj;")
    public static class162 field3299 = new class162(81, 4);

    @OriginalMember(owner = "client!vn", name = "c", descriptor = "I")
    public static int field3287;

    @OriginalMember(owner = "client!vn", name = "d", descriptor = "I")
    private int field3288;

    @OriginalMember(owner = "client!vn", name = "e", descriptor = "I")
    public static int field3289;

    @OriginalMember(owner = "client!vn", name = "g", descriptor = "I")
    public static int field3291;

    @OriginalMember(owner = "client!vn", name = "h", descriptor = "I")
    public static int field3292;

    @OriginalMember(owner = "client!vn", name = "i", descriptor = "I")
    public static int field3293;

    @OriginalMember(owner = "client!vn", name = "j", descriptor = "I")
    public static int field3294;

    @OriginalMember(owner = "client!vn", name = "k", descriptor = "I")
    public static int field3295;

    @OriginalMember(owner = "client!vn", name = "l", descriptor = "I")
    public static int field3296;

    @OriginalMember(owner = "client!vn", name = "m", descriptor = "I")
    public static int field3297;

    @OriginalMember(owner = "client!vn", name = "n", descriptor = "I")
    public static int field3298;

    @OriginalMember(owner = "client!vn", name = "p", descriptor = "I")
    public static int field3300;

    @OriginalMember(owner = "client!vn", name = "q", descriptor = "I")
    public static int field3301;

    @OriginalMember(owner = "client!vn", name = "r", descriptor = "I")
    public static int field3302;

    @OriginalMember(owner = "client!vn", name = "s", descriptor = "I")
    private int field3303;

    @OriginalMember(owner = "client!vn", name = "t", descriptor = "I")
    public static int field3304;

    @OriginalMember(owner = "client!vn", name = "v", descriptor = "I")
    public static int field3306;

    @OriginalMember(owner = "client!vn", name = "x", descriptor = "I")
    public static int field3308;

    @OriginalMember(owner = "client!vn", name = "y", descriptor = "I")
    private int field3309;

    @OriginalMember(owner = "client!vn", name = "z", descriptor = "I")
    public static int field3310;

    @OriginalMember(owner = "client!vn", name = "A", descriptor = "I")
    public static int field3311;

    @OriginalMember(owner = "client!vn", name = "B", descriptor = "I")
    public static int field3312;

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(IILsq;)V")
    public final void method1406(int arg0, int arg1, class120 arg2) {
        this.method1411(arg2, arg1, arg0, (byte) -115);
        field3310++;
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(IILwa;)V")
    public final void method1407(int arg0, int arg1, class438 arg2) {
        field3306++;
        if (~this.field3286 == arg1) {
            throw new RuntimeException();
        }
        int var4 = 0x1 << arg0;
        if ((~var4 & this.field3288) == 0) {
            this.field3303 = arg2.field6501;
            this.field3309 = arg2.field6505;
        } else if (this.field3309 != arg2.field6505 || this.field3303 != arg2.field6501) {
            throw new RuntimeException();
        }
        arg2.method2614(this.field3286, class473.field7020[arg0], true);
        this.field3307[arg0] = arg2;
        this.field3288 |= var4;
    }

    @OriginalMember(owner = "client!vn", name = "e", descriptor = "(I)V")
    public final void method1117(int arg0) {
        OpenGL.glBindFramebufferEXT(36009, 0);
        int var2 = 16 / ((arg0 - 21) / 53);
        field3292++;
        this.field3305 &= 0xFFFFFFFD;
        this.field3286 = this.method1414(-32310);
    }

    @OriginalMember(owner = "client!vn", name = "f", descriptor = "(I)V")
    public final void method1118(int arg0) {
        field3293++;
        int var2 = -82 / ((arg0 - 51) / 45);
        OpenGL.glBindFramebufferEXT(36008, 0);
        this.field3305 &= 0xFFFFFFFE;
        this.field3286 = this.method1414(-32310);
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(II)V")
    public final void method1408(int arg0, int arg1) {
        field3295++;
        if (this.field3286 == arg0) {
            throw new RuntimeException();
        }
        OpenGL.glDrawBuffer(class473.field7020[arg1]);
    }

    @OriginalMember(owner = "client!vn", name = "d", descriptor = "(I)V")
    public final void method1116(int arg0) {
        field3291++;
        OpenGL.glBindFramebufferEXT(36009, this.field3285);
        this.field3305 |= 0x2;
        this.field3286 = this.method1414(-32310);
        if (arg0 != 24874) {
            this.field3288 = 93;
        }
    }

    @OriginalMember(owner = "client!vn", name = "b", descriptor = "(II)V")
    public final void method1409(int arg0, int arg1) {
        if (this.field3307[arg0] != null) {
            this.field3307[arg0].method458(1);
        }
        field3298++;
        if (arg1 >= -5) {
            this.field3309 = 67;
        }
        this.field3288 &= ~(0x1 << arg0);
        this.field3307[arg0] = null;
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(Ldl;IIZI)V")
    private final void method1410(class46 arg0, int arg1, int arg2, boolean arg3, int arg4) {
        field3312++;
        if (this.field3286 == -1) {
            throw new RuntimeException();
        }
        int var6 = 0x1 << arg1;
        if (!arg3) {
            return;
        }
        if ((~var6 & this.field3288) == 0) {
            this.field3303 = arg0.field957;
            this.field3309 = arg0.field957;
        } else if (this.field3309 != arg0.field957 || this.field3303 != arg0.field957) {
            throw new RuntimeException();
        }
        arg0.method457(arg2, arg4, this.field3286, class473.field7020[arg1], (byte) -83);
        this.field3307[arg1] = arg0;
        this.field3288 |= var6;
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(Lsq;IIB)V")
    private final void method1411(class120 arg0, int arg1, int arg2, byte arg3) {
        field3302++;
        if (this.field3286 == -1) {
            throw new RuntimeException();
        }
        int var5 = 0x1 << arg2;
        if ((this.field3288 & ~var5) == 0) {
            this.field3303 = arg0.field2107;
            this.field3309 = arg0.field2097;
        } else if (this.field3309 != arg0.field2097 || this.field3303 != arg0.field2107) {
            throw new RuntimeException();
        }
        if (arg3 > -112) {
            this.method1416(99, -20);
        }
        arg0.method966(this.field3286, class473.field7020[arg2], arg1, true);
        this.field3307[arg2] = arg0;
        this.field3288 |= var5;
    }

    @OriginalMember(owner = "client!vn", name = "c", descriptor = "(I)V")
    public final void method1115(int arg0) {
        field3311++;
        OpenGL.glBindFramebufferEXT(36160, this.field3285);
        this.field3305 |= 0x4;
        this.field3286 = this.method1414(-32310);
        if (arg0 != 16739) {
            this.method1408(-84, -35);
        }
    }

    @OriginalMember(owner = "client!vn", name = "g", descriptor = "(I)V")
    public static final void method1412(int arg0) {
        field3301++;
        int var1 = class229.field3560;
        if (arg0 != -1487) {
            method1412(53);
        }
        int[] var2 = class316.field4782;
        for (int var3 = 0; var3 < var1; var3++) {
            class366 var4 = class73.field1444[var2[var3]];
            if (var4 != null) {
                class70.method606(var4, var4.method2241(-8), arg0 + 1275);
            }
        }
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(Z)Z")
    public final boolean method1413(boolean arg0) {
        field3297++;
        int var2 = OpenGL.glCheckFramebufferStatusEXT(this.field3286);
        if (var2 == 36053) {
            if (arg0) {
                this.method1115(109);
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!vn", name = "h", descriptor = "(I)I")
    private final int method1414(int arg0) {
        if (arg0 != -32310) {
            this.method1115(-116);
        }
        field3308++;
        if ((this.field3305 & 0x4) != 0) {
            return 36160;
        } else if ((this.field3305 & 0x2) == 0) {
            return (this.field3305 & 0x1) == 0 ? -1 : 36008;
        } else {
            return 36009;
        }
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(I)V")
    public final void method1113(int arg0) {
        OpenGL.glBindFramebufferEXT(36160, 0);
        field3300++;
        this.field3305 &= 0xFFFFFFFB;
        this.field3286 = this.method1414(-32310);
        if (arg0 != 31546) {
            this.field3290 = null;
        }
    }

    @OriginalMember(owner = "client!vn", name = "i", descriptor = "(I)I")
    public final int method1415(int arg0) {
        if (arg0 >= -71) {
            this.field3290 = null;
        }
        field3289++;
        return this.field3303;
    }

    @OriginalMember(owner = "client!vn", name = "b", descriptor = "(I)V")
    public final void method1114(int arg0) {
        if (arg0 == -26734) {
            OpenGL.glBindFramebufferEXT(36008, this.field3285);
            field3287++;
            this.field3305 |= 0x1;
            this.field3286 = this.method1414(-32310);
        }
    }

    @OriginalMember(owner = "client!vn", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.field3290.method290(this.field3285, 34200);
        field3296++;
        super.finalize();
    }

    @OriginalMember(owner = "client!vn", name = "c", descriptor = "(II)V")
    public final void method1416(int arg0, int arg1) {
        field3294++;
        if (this.field3286 == arg0) {
            throw new RuntimeException();
        }
        OpenGL.glReadBuffer(class473.field7020[arg1]);
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(IILdl;Z)V")
    public final void method1417(int arg0, int arg1, class46 arg2, boolean arg3) {
        field3304++;
        this.method1410(arg2, arg0, arg1, arg3, 0);
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(B)V")
    public static void method1418(byte arg0) {
        if (arg0 == -98) {
            field3299 = null;
        }
    }

    @OriginalMember(owner = "client!vn", name = "<init>", descriptor = "(Lda;)V")
    public class206(class44 arg0) {
        if (!arg0.field920) {
            throw new IllegalStateException("");
        }
        this.field3290 = arg0;
        OpenGL.glGenFramebuffersEXT(1, class120.field2110, 0);
        this.field3285 = class120.field2110[0];
    }
}
