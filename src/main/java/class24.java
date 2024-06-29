import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wt")
public class class24 implements class506 {

    @OriginalMember(owner = "client!wt", name = "e", descriptor = "I")
    private int field183 = 0;

    @OriginalMember(owner = "client!wt", name = "q", descriptor = "[Lbga;")
    private class657[] field195 = new class657[9];

    @OriginalMember(owner = "client!wt", name = "t", descriptor = "I")
    private int field198 = -1;

    @OriginalMember(owner = "client!wt", name = "r", descriptor = "Lvj;")
    private class422 field196;

    @OriginalMember(owner = "client!wt", name = "c", descriptor = "I")
    private int field181;

    @OriginalMember(owner = "client!wt", name = "n", descriptor = "Z")
    public static volatile boolean field192 = true;

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "I")
    public static int field179;

    @OriginalMember(owner = "client!wt", name = "b", descriptor = "I")
    private int field180;

    @OriginalMember(owner = "client!wt", name = "d", descriptor = "I")
    public static int field182;

    @OriginalMember(owner = "client!wt", name = "f", descriptor = "I")
    public static int field184;

    @OriginalMember(owner = "client!wt", name = "g", descriptor = "I")
    public static int field185;

    @OriginalMember(owner = "client!wt", name = "i", descriptor = "I")
    public static int field187;

    @OriginalMember(owner = "client!wt", name = "j", descriptor = "I")
    private int field188;

    @OriginalMember(owner = "client!wt", name = "k", descriptor = "I")
    public static int field189;

    @OriginalMember(owner = "client!wt", name = "l", descriptor = "I")
    public static int field190;

    @OriginalMember(owner = "client!wt", name = "m", descriptor = "I")
    public static int field191;

    @OriginalMember(owner = "client!wt", name = "o", descriptor = "I")
    public static int field193;

    @OriginalMember(owner = "client!wt", name = "p", descriptor = "I")
    public static int field194;

    @OriginalMember(owner = "client!wt", name = "s", descriptor = "I")
    public static int field197;

    @OriginalMember(owner = "client!wt", name = "u", descriptor = "I")
    public static int field199;

    @OriginalMember(owner = "client!wt", name = "v", descriptor = "I")
    public static int field200;

    @OriginalMember(owner = "client!wt", name = "w", descriptor = "I")
    public static int field201;

    @OriginalMember(owner = "client!wt", name = "x", descriptor = "I")
    public static int field202;

    @OriginalMember(owner = "client!wt", name = "y", descriptor = "I")
    public static int field203;

    @OriginalMember(owner = "client!wt", name = "z", descriptor = "I")
    public static int field204;

    @OriginalMember(owner = "client!wt", name = "A", descriptor = "I")
    private int field205;

    @OriginalMember(owner = "client!wt", name = "B", descriptor = "I")
    public static int field206;

    @OriginalMember(owner = "client!wt", name = "C", descriptor = "I")
    public static int field207;

    @OriginalMember(owner = "client!wt", name = "h", descriptor = "Ltf;")
    public static class701 field186;

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(ZI)V")
    public final void method110(boolean arg0, int arg1) {
        if (arg0) {
            this.method120((byte) -27);
        }
        field197++;
        if (this.field198 == -1) {
            throw new RuntimeException();
        }
        OpenGL.glDrawBuffer(class507.field7285[arg1]);
    }

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(IBLg;I)V")
    private final void method111(int arg0, byte arg1, class555 arg2, int arg3) {
        int var5 = 2 % ((-arg1 - 38) / 62);
        field200++;
        if (this.field198 == -1) {
            throw new RuntimeException();
        }
        int var6 = 0x1 << arg3;
        if ((this.field205 & ~var6) == 0) {
            this.field188 = arg2.field7928;
            this.field180 = arg2.field7931;
        } else if (this.field180 != arg2.field7931 || this.field188 != arg2.field7928) {
            throw new RuntimeException();
        }
        arg2.method3145(class507.field7285[arg3], this.field198, arg0, (byte) -60);
        this.field195[arg3] = arg2;
        this.field205 |= var6;
    }

    @OriginalMember(owner = "client!wt", name = "c", descriptor = "(I)V")
    public final void method112(int arg0) {
        OpenGL.glBindFramebufferEXT(36008, 0);
        if (arg0 != -20845) {
            field186 = null;
        }
        field199++;
        this.field183 &= 0xFFFFFFFE;
        this.field198 = this.method114(117);
    }

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(Lbi;IB)V")
    public final void method113(class508 arg0, int arg1, byte arg2) {
        int var4 = 21 / ((arg2 - 39) / 59);
        field201++;
        if (this.field198 == -1) {
            throw new RuntimeException();
        }
        int var5 = 0x1 << arg1;
        if ((~var5 & this.field205) == 0) {
            this.field188 = arg0.field7289;
            this.field180 = arg0.field7287;
        } else if (this.field180 != arg0.field7287 || this.field188 != arg0.field7289) {
            throw new RuntimeException();
        }
        arg0.method2903(this.field198, 36161, class507.field7285[arg1]);
        this.field195[arg1] = arg0;
        this.field205 |= var5;
    }

    @OriginalMember(owner = "client!wt", name = "e", descriptor = "(I)I")
    private final int method114(int arg0) {
        field194++;
        if (arg0 <= 114) {
            return 5;
        } else if ((this.field183 & 0x4) != 0) {
            return 36160;
        } else if ((this.field183 & 0x2) == 0) {
            return (this.field183 & 0x1) == 0 ? -1 : 36008;
        } else {
            return 36009;
        }
    }

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(I)V")
    public final void method115(int arg0) {
        if (arg0 != -1018) {
            this.field195 = null;
        }
        field189++;
        OpenGL.glBindFramebufferEXT(36009, 0);
        this.field183 &= 0xFFFFFFFD;
        this.field198 = this.method114(115);
    }

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(IILfca;II)V")
    private final void method116(int arg0, int arg1, class140 arg2, int arg3, int arg4) {
        if (arg4 != -28026) {
            this.method110(false, 72);
        }
        field204++;
        if (this.field198 == -1) {
            throw new RuntimeException();
        }
        int var6 = 0x1 << arg1;
        if ((this.field205 & ~var6) == 0) {
            this.field188 = arg2.field1544;
            this.field180 = arg2.field1544;
        } else if (this.field180 != arg2.field1544 || this.field188 != arg2.field1544) {
            throw new RuntimeException();
        }
        arg2.method781(this.field198, arg4 - 16749190, arg3, class507.field7285[arg1], arg0);
        this.field195[arg1] = arg2;
        this.field205 |= var6;
    }

    @OriginalMember(owner = "client!wt", name = "c", descriptor = "(B)Lgu;")
    public static final class130 method117(byte arg0) {
        class372.field5073 = 0;
        if (arg0 > -95) {
            method117((byte) -116);
        }
        field191++;
        return class282.method1652(0);
    }

    @OriginalMember(owner = "client!wt", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.field196.method2359(this.field181, -356);
        field193++;
        super.finalize();
    }

    @OriginalMember(owner = "client!wt", name = "d", descriptor = "(I)V")
    public final void method118(int arg0) {
        OpenGL.glBindFramebufferEXT(36008, this.field181);
        field179++;
        this.field183 |= 0x1;
        this.field198 = this.method114(126);
        if (arg0 <= 6) {
            this.method110(true, -90);
        }
    }

    @OriginalMember(owner = "client!wt", name = "b", descriptor = "(B)V")
    public final void method119(byte arg0) {
        OpenGL.glBindFramebufferEXT(36009, this.field181);
        field203++;
        this.field183 |= 0x2;
        if (arg0 != -15) {
            this.field183 = 110;
        }
        this.field198 = this.method114(126);
    }

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(B)V")
    public final void method120(byte arg0) {
        field182++;
        OpenGL.glBindFramebufferEXT(36160, this.field181);
        this.field183 |= 0x4;
        if (arg0 <= 99) {
            field186 = null;
        }
        this.field198 = this.method114(121);
    }

    @OriginalMember(owner = "client!wt", name = "f", descriptor = "(I)V")
    public static void method121(int arg0) {
        if (arg0 >= -3) {
            field186 = null;
        }
        field186 = null;
    }

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(IIILfca;)V")
    public final void method122(int arg0, int arg1, int arg2, class140 arg3) {
        field207++;
        if (arg2 != -12190) {
            field186 = null;
        }
        this.method116(0, arg0, arg3, arg1, arg2 - 15836);
    }

    @OriginalMember(owner = "client!wt", name = "d", descriptor = "(B)V")
    public static final void method123(byte arg0) {
        field185++;
        class156.field1748.method1578(-87);
        class573.field8132.method832((byte) -69);
        class508.field7303.method2946((byte) 102);
        class364.field4891.method2138((byte) 109);
        class369.field5055.method344(0);
        class19.field153.method280(36);
        class265.field3301.method3044(1);
        class63.field654.method2192(-1);
        class259.field3254.method3829(0);
        class624.field8826.method3687(-112);
        class400.field5381.method2171(false);
        class689.field9695.method1116(3940);
        class247.field3060.method700(6);
        class600.field8445.method1059(77);
        class53.field531.method1563(-9);
        class66.field669.method2493(0);
        class328.field4021.method1375(6539);
        class211.field2553.method2801(-17079);
        class693.field9725.method2466(-118);
        class304.field3768.method1110(26);
        class408.method2289((byte) 126);
        class197.method1191(-66);
        class642.method3608(1188163656);
        class600.method3360(-14687);
        class257.method1520(1765586576);
        class162.field1815.method80((byte) -84);
        if (arg0 >= 116) {
            class697.field9777.method80((byte) 76);
            class66.field667.method80((byte) -102);
            class664.field9289.method80((byte) 68);
            class281.field3516.method80((byte) -64);
        }
    }

    @OriginalMember(owner = "client!wt", name = "e", descriptor = "(B)Z")
    public final boolean method124(byte arg0) {
        field202++;
        int var2 = OpenGL.glCheckFramebufferStatusEXT(this.field198);
        if (arg0 >= -90) {
            return false;
        } else {
            return var2 == 36053;
        }
    }

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(II)V")
    public final void method125(int arg0, int arg1) {
        field187++;
        if (this.field195[arg0] != null) {
            this.field195[arg0].method459(Integer.MIN_VALUE);
        }
        this.field205 &= ~(arg1 << arg0);
        this.field195[arg0] = null;
    }

    @OriginalMember(owner = "client!wt", name = "b", descriptor = "(I)V")
    public final void method126(int arg0) {
        field184++;
        OpenGL.glBindFramebufferEXT(36160, 0);
        if (arg0 == 29177) {
            this.field183 &= 0xFFFFFFFB;
            this.field198 = this.method114(121);
        }
    }

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(ILg;I)V")
    public final void method127(int arg0, class555 arg1, int arg2) {
        field206++;
        if (arg2 == 4) {
            this.method111(0, (byte) 65, arg1, arg0);
        }
    }

    @OriginalMember(owner = "client!wt", name = "b", descriptor = "(II)V")
    public final void method128(int arg0, int arg1) {
        if (arg0 != -29721) {
            this.method127(43, null, 9);
        }
        field190++;
        if (this.field198 == -1) {
            throw new RuntimeException();
        }
        OpenGL.glReadBuffer(class507.field7285[arg1]);
    }

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(IIII)V")
    public static final void method129(int arg0, int arg1, int arg2, int arg3) {
        class499 var4 = class487.field7044[arg0][arg1][arg2];
        if (var4 == null) {
            return;
        }
        class94 var5 = var4.field7231;
        class94 var6 = var4.field7228;
        if (var5 != null) {
            var5.field969 = (short) (var5.field969 * arg3 / (0x10 << class559.field7984 - 7));
            var5.field973 = (short) (var5.field973 * arg3 / (0x10 << class559.field7984 - 7));
        }
        if (var6 != null) {
            var6.field969 = (short) (var6.field969 * arg3 / (0x10 << class559.field7984 - 7));
            var6.field973 = (short) (var6.field973 * arg3 / (0x10 << class559.field7984 - 7));
        }
    }

    @OriginalMember(owner = "client!wt", name = "<init>", descriptor = "(Lvj;)V")
    public class24(class422 arg0) {
        if (!arg0.field5948) {
            throw new IllegalStateException("");
        }
        this.field196 = arg0;
        OpenGL.glGenFramebuffersEXT(1, class415.field5563, 0);
        this.field181 = class415.field5563[0];
    }
}
