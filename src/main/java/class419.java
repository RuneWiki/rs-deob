import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ij")
public class class419 implements class703 {

    @OriginalMember(owner = "client!ij", name = "l", descriptor = "I")
    private int field5878 = 0;

    @OriginalMember(owner = "client!ij", name = "x", descriptor = "I")
    private int field5890 = -1;

    @OriginalMember(owner = "client!ij", name = "v", descriptor = "[Lbga;")
    private class356[] field5888 = new class356[9];

    @OriginalMember(owner = "client!ij", name = "b", descriptor = "Loea;")
    private class594 field5868;

    @OriginalMember(owner = "client!ij", name = "G", descriptor = "I")
    private int field5899;

    @OriginalMember(owner = "client!ij", name = "q", descriptor = "Lqca;")
    public static class115 field5883 = new class115(11, 0, 1, 2);

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "I")
    public static int field5867;

    @OriginalMember(owner = "client!ij", name = "c", descriptor = "I")
    public static int field5869;

    @OriginalMember(owner = "client!ij", name = "d", descriptor = "I")
    public static int field5870;

    @OriginalMember(owner = "client!ij", name = "e", descriptor = "I")
    public static int field5871;

    @OriginalMember(owner = "client!ij", name = "f", descriptor = "I")
    private int field5872;

    @OriginalMember(owner = "client!ij", name = "g", descriptor = "I")
    public static int field5873;

    @OriginalMember(owner = "client!ij", name = "h", descriptor = "I")
    public static int field5874;

    @OriginalMember(owner = "client!ij", name = "i", descriptor = "I")
    public static int field5875;

    @OriginalMember(owner = "client!ij", name = "j", descriptor = "I")
    public static int field5876;

    @OriginalMember(owner = "client!ij", name = "k", descriptor = "I")
    public static int field5877;

    @OriginalMember(owner = "client!ij", name = "m", descriptor = "I")
    public static int field5879;

    @OriginalMember(owner = "client!ij", name = "n", descriptor = "I")
    public static int field5880;

    @OriginalMember(owner = "client!ij", name = "o", descriptor = "I")
    public static int field5881;

    @OriginalMember(owner = "client!ij", name = "p", descriptor = "I")
    public static int field5882;

    @OriginalMember(owner = "client!ij", name = "r", descriptor = "I")
    private int field5884;

    @OriginalMember(owner = "client!ij", name = "s", descriptor = "I")
    public static int field5885;

    @OriginalMember(owner = "client!ij", name = "t", descriptor = "I")
    public static int field5886;

    @OriginalMember(owner = "client!ij", name = "u", descriptor = "I")
    public static int field5887;

    @OriginalMember(owner = "client!ij", name = "w", descriptor = "I")
    public static int field5889;

    @OriginalMember(owner = "client!ij", name = "y", descriptor = "I")
    public static int field5891;

    @OriginalMember(owner = "client!ij", name = "z", descriptor = "I")
    public static int field5892;

    @OriginalMember(owner = "client!ij", name = "A", descriptor = "I")
    private int field5893;

    @OriginalMember(owner = "client!ij", name = "C", descriptor = "I")
    public static int field5895;

    @OriginalMember(owner = "client!ij", name = "E", descriptor = "I")
    public static int field5897;

    @OriginalMember(owner = "client!ij", name = "F", descriptor = "I")
    public static int field5898;

    @OriginalMember(owner = "client!ij", name = "B", descriptor = "Leq;")
    public static class209 field5894;

    @OriginalMember(owner = "client!ij", name = "D", descriptor = "Lfp;")
    public static class323 field5896;

    @OriginalMember(owner = "client!ij", name = "b", descriptor = "(I)V")
    public final void method2550(int arg0) {
        field5879++;
        OpenGL.glBindFramebufferEXT(36160, this.field5899);
        if (arg0 == -14943) {
            this.field5878 |= 0x4;
            this.field5890 = this.method2552(false);
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(IIILni;)V")
    public final void method2551(int arg0, int arg1, int arg2, class518 arg3) {
        field5877++;
        this.method2565(arg1, arg2, -18039, 0, arg3);
        if (arg0 != -17968) {
            this.field5890 = 75;
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(Z)I")
    private final int method2552(boolean arg0) {
        field5895++;
        if ((this.field5878 & 0x4) != 0) {
            return 36160;
        } else if ((this.field5878 & 0x2) == 0) {
            if (arg0) {
                this.method2565(-92, -49, -99, -41, null);
            }
            return (this.field5878 & 0x1) == 0 ? -1 : 36008;
        } else {
            return 36009;
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(ZIILme;)V")
    private final void method2553(boolean arg0, int arg1, int arg2, class192 arg3) {
        field5873++;
        if (this.field5890 == -1) {
            throw new RuntimeException();
        }
        int var5 = 0x1 << arg2;
        if ((this.field5893 & ~var5) == 0) {
            this.field5872 = arg3.field2756;
            this.field5884 = arg3.field2753;
        } else if (this.field5872 != arg3.field2756 || this.field5884 != arg3.field2753) {
            throw new RuntimeException();
        }
        if (!arg0) {
            this.method2556(null, true, -30);
        }
        arg3.method1344(class676.field9541[arg2], arg1, -31812, this.field5890);
        this.field5888[arg2] = arg3;
        this.field5893 |= var5;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(BI)V")
    public final void method2554(byte arg0, int arg1) {
        if (arg0 <= 81) {
            return;
        }
        field5880++;
        if (this.field5890 == -1) {
            throw new RuntimeException();
        }
        OpenGL.glReadBuffer(class676.field9541[arg1]);
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(IB)V")
    public final void method2555(int arg0, byte arg1) {
        if (this.field5888[arg0] != null) {
            this.field5888[arg0].method827(0);
        }
        field5897++;
        this.field5893 &= ~(0x1 << arg0);
        if (arg1 <= 70) {
            this.field5893 = -38;
        }
        this.field5888[arg0] = null;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(Lme;ZI)V")
    public final void method2556(class192 arg0, boolean arg1, int arg2) {
        field5874++;
        this.method2553(arg1, 0, arg2, arg0);
    }

    @OriginalMember(owner = "client!ij", name = "e", descriptor = "(I)Z")
    public final boolean method2557(int arg0) {
        field5870++;
        if (arg0 < 72) {
            method2562((byte) -72);
        }
        int var2 = OpenGL.glCheckFramebufferStatusEXT(this.field5890);
        return var2 == 36053;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(I)V")
    public final void method2558(int arg0) {
        if (arg0 != 26754) {
            method2563(-125, 75, true);
        }
        OpenGL.glBindFramebufferEXT(36009, this.field5899);
        field5869++;
        this.field5878 |= 0x2;
        this.field5890 = this.method2552(false);
    }

    @OriginalMember(owner = "client!ij", name = "d", descriptor = "(I)V")
    public final void method2559(int arg0) {
        field5892++;
        OpenGL.glBindFramebufferEXT(36160, 0);
        this.field5878 &= 0xFFFFFFFB;
        if (arg0 <= 84) {
            this.field5872 = 62;
        }
        this.field5890 = this.method2552(false);
    }

    @OriginalMember(owner = "client!ij", name = "c", descriptor = "(B)V")
    public static final void method2560(byte arg0) {
        field5887++;
        if (arg0 > 4) {
            class583.field8235.method3048(false);
        }
    }

    @OriginalMember(owner = "client!ij", name = "b", descriptor = "(BI)I")
    public static final int method2561(byte arg0, int arg1) {
        field5886++;
        int var2 = 22 % ((8 - arg0) / 59);
        return arg1 == 16711935 ? -1 : class244.method1627(arg1, 0);
    }

    @OriginalMember(owner = "client!ij", name = "d", descriptor = "(B)V")
    public static void method2562(byte arg0) {
        field5883 = null;
        field5896 = null;
        field5894 = null;
        if (arg0 < 60) {
            field5894 = null;
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(IIZ)V")
    public static final void method2563(int arg0, int arg1, boolean arg2) {
        field5875++;
        int var3 = field5896.method2075(!arg2, class281.field3965.method1839((byte) 45, class744.field10426));
        int var5;
        if (class653.field9200) {
            for (class241 var7 = (class241) class211.field3046.method1196(-126); var7 != null; var7 = (class241) class211.field3046.method1204(false)) {
                int var10;
                if (var7.field3382 == 1) {
                    var10 = class76.method766((class66) var7.field3388.field2357.field3201, -1);
                } else {
                    var10 = class360.method2244((byte) -127, var7);
                }
                if (var10 > var3) {
                    var3 = var10;
                }
            }
            var3 += 8;
            class681.field9590 = (class214.field3067 ? 26 : 22) + class173.field2513 * 16;
            var5 = class173.field2513 * 16 + 21;
        } else {
            for (class66 var4 = (class66) class288.field4066.method1522(true); var4 != null; var4 = (class66) class288.field4066.method1527((byte) 107)) {
                int var6 = class76.method766(var4, -1);
                if (var6 > var3) {
                    var3 = var6;
                }
            }
            var3 += 8;
            var5 = class409.field5682 * 16 + 21;
            class681.field9590 = (class214.field3067 ? 26 : 22) + class409.field5682 * 16;
        }
        int var8 = arg1 - (var3 / 2);
        if (class206.field2956 < var3 + var8) {
            var8 = class206.field2956 - var3;
        }
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = arg0;
        if (class363.field5105 < (arg0 + var5)) {
            var9 = class363.field5105 - var5;
        }
        if (var9 < 0) {
            var9 = 0;
        }
        class396.field5544 = var8;
        class380.field5300 = var3;
        class34.field450 = arg2;
        class321.field4557 = var9;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(ZIZ)V")
    public static final void method2564(boolean arg0, int arg1, boolean arg2) {
        field5882++;
        if (arg1 >= -23) {
            method2561((byte) -61, -113);
        }
        if (arg0) {
            class679.field9574++;
            class259.method1762(20470);
        }
        if (arg2) {
            class605.field8785++;
            class183.method1312((byte) -78);
        }
    }

    @OriginalMember(owner = "client!ij", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        field5898++;
        this.field5868.method3410((byte) 117, this.field5899);
        super.finalize();
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(IIIILni;)V")
    private final void method2565(int arg0, int arg1, int arg2, int arg3, class518 arg4) {
        field5891++;
        if (this.field5890 == -1) {
            throw new RuntimeException();
        }
        int var6 = 0x1 << arg0;
        if ((~var6 & this.field5893) == 0) {
            this.field5884 = arg4.field7358;
            this.field5872 = arg4.field7358;
        } else if (this.field5872 != arg4.field7358 || this.field5884 != arg4.field7358) {
            throw new RuntimeException();
        }
        arg4.method3079(this.field5890, arg1, arg3, 0, class676.field9541[arg0]);
        this.field5888[arg0] = arg4;
        if (arg2 != -18039) {
            method2563(-72, -46, true);
        }
        this.field5893 |= var6;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(B)V")
    public final void method2566(byte arg0) {
        field5876++;
        OpenGL.glBindFramebufferEXT(36009, 0);
        this.field5878 &= 0xFFFFFFFD;
        this.field5890 = this.method2552(false);
        if (arg0 <= 53) {
            this.field5878 = -106;
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(IILnh;)V")
    public final void method2567(int arg0, int arg1, class744 arg2) {
        field5885++;
        if (this.field5890 == arg1) {
            throw new RuntimeException();
        }
        int var4 = 0x1 << arg0;
        if ((~var4 & this.field5893) == 0) {
            this.field5872 = arg2.field10411;
            this.field5884 = arg2.field10409;
        } else if (this.field5872 != arg2.field10411 || this.field5884 != arg2.field10409) {
            throw new RuntimeException();
        }
        arg2.method4144(this.field5890, arg1 ^ 0xFFFF72BE, class676.field9541[arg0]);
        this.field5888[arg0] = arg2;
        this.field5893 |= var4;
    }

    @OriginalMember(owner = "client!ij", name = "c", descriptor = "(I)V")
    public final void method2568(int arg0) {
        field5881++;
        OpenGL.glBindFramebufferEXT(36008, 0);
        this.field5878 &= 0xFFFFFFFE;
        this.field5890 = this.method2552(false);
        if (arg0 != 5961) {
            field5889 = 60;
        }
    }

    @OriginalMember(owner = "client!ij", name = "b", descriptor = "(IB)V")
    public final void method2569(int arg0, byte arg1) {
        field5871++;
        if (this.field5890 == -1) {
            throw new RuntimeException();
        }
        if (arg1 > -44) {
            this.method2554((byte) -66, 105);
        }
        OpenGL.glDrawBuffer(class676.field9541[arg0]);
    }

    @OriginalMember(owner = "client!ij", name = "b", descriptor = "(B)V")
    public final void method2570(byte arg0) {
        OpenGL.glBindFramebufferEXT(36008, this.field5899);
        field5867++;
        this.field5878 |= 0x1;
        this.field5890 = this.method2552(false);
        if (arg0 != 30) {
            method2564(true, 126, false);
        }
    }

    @OriginalMember(owner = "client!ij", name = "<init>", descriptor = "(Loea;)V")
    public class419(class594 arg0) {
        if (!arg0.field8624) {
            throw new IllegalStateException("");
        }
        this.field5868 = arg0;
        OpenGL.glGenFramebuffersEXT(1, class228.field3261, 0);
        this.field5899 = class228.field3261[0];
    }
}
