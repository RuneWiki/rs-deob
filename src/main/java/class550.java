import jaggl.OpenGL;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bba")
public class class550 extends class512 {

    @OriginalMember(owner = "client!bba", name = "t", descriptor = "Z")
    private boolean field7767 = false;

    @OriginalMember(owner = "client!bba", name = "r", descriptor = "[F")
    private float[] field7765 = new float[4];

    @OriginalMember(owner = "client!bba", name = "p", descriptor = "Loha;")
    private class445 field7763;

    @OriginalMember(owner = "client!bba", name = "I", descriptor = "Loha;")
    private class445 field7782;

    @OriginalMember(owner = "client!bba", name = "F", descriptor = "Loha;")
    private class445 field7779;

    @OriginalMember(owner = "client!bba", name = "D", descriptor = "Loha;")
    private class445 field7777;

    @OriginalMember(owner = "client!bba", name = "H", descriptor = "Z")
    private boolean field7781;

    @OriginalMember(owner = "client!bba", name = "z", descriptor = "Loia;")
    private class51 field7773;

    @OriginalMember(owner = "client!bba", name = "s", descriptor = "Lag;")
    public static class214 field7766 = new class214(3, 2);

    @OriginalMember(owner = "client!bba", name = "J", descriptor = "Z")
    public static boolean field7783 = false;

    @OriginalMember(owner = "client!bba", name = "o", descriptor = "I")
    public static int field7762;

    @OriginalMember(owner = "client!bba", name = "q", descriptor = "I")
    public static int field7764;

    @OriginalMember(owner = "client!bba", name = "u", descriptor = "I")
    public static int field7768;

    @OriginalMember(owner = "client!bba", name = "w", descriptor = "I")
    public static int field7770;

    @OriginalMember(owner = "client!bba", name = "x", descriptor = "I")
    public static int field7771;

    @OriginalMember(owner = "client!bba", name = "y", descriptor = "I")
    public static int field7772;

    @OriginalMember(owner = "client!bba", name = "A", descriptor = "I")
    public static int field7774;

    @OriginalMember(owner = "client!bba", name = "B", descriptor = "I")
    public static int field7775;

    @OriginalMember(owner = "client!bba", name = "C", descriptor = "I")
    public static int field7776;

    @OriginalMember(owner = "client!bba", name = "G", descriptor = "I")
    public static int field7780;

    @OriginalMember(owner = "client!bba", name = "v", descriptor = "Z")
    private boolean field7769;

    @OriginalMember(owner = "client!bba", name = "E", descriptor = "Z")
    private boolean field7778;

    @OriginalMember(owner = "client!bba", name = "f", descriptor = "(B)V")
    public final void method3062(byte arg0) {
        ++field7775;
        int var2 = super.field7153.method2895(false);
        if (arg0 <= 90) {
            this.field7781 = false;
        }
        class173 var3 = super.field7153.method2915(17967);
        if (!this.field7778) {
            OpenGL.glBindProgramARB(34336, var2 == Integer.MAX_VALUE ? this.field7763.field6085 : this.field7779.field6085);
        } else {
            OpenGL.glBindProgramARB(34336, var2 != Integer.MAX_VALUE ? this.field7777.field6085 : this.field7782.field6085);
        }
        OpenGL.glEnable(34336);
        this.field7769 = true;
        var3.method1096(this.field7765, -1.0F, (byte) -53, 0.0F, 0.0F, (float) var2);
        OpenGL.glProgramLocalParameter4fARB(34336, 1, this.field7765[0], this.field7765[1], this.field7765[2], this.field7765[3]);
        this.method2284((byte) -45);
    }

    @OriginalMember(owner = "client!bba", name = "a", descriptor = "(IILlo;)V")
    public final void method40(int arg0, int arg1, class117 arg2) {
        if (arg1 != -37) {
            this.method35(104);
        }
        if (arg2 != null) {
            if (this.field7767) {
                super.field7153.method2946(0, class186.field2725, (byte) 127);
                super.field7153.method2923(-93, 0, class186.field2725);
                this.field7767 = false;
            }
            super.field7153.method2933((byte) 108, arg2);
            super.field7153.method2881(arg0, -1);
        } else if (!this.field7767) {
            super.field7153.method2933((byte) -94, super.field7153.field6870);
            super.field7153.method2881(1, -1);
            super.field7153.method2946(0, class214.field3017, (byte) 127);
            super.field7153.method2923(-109, 0, class214.field3017);
            this.field7767 = true;
        }
        ++field7771;
    }

    @OriginalMember(owner = "client!bba", name = "f", descriptor = "(I)V")
    public static void method3287(int arg0) {
        if (arg0 < 97) {
            method3288(false, (class557) null, -31, -106L, 59, -10, -30);
        }
        field7766 = null;
    }

    @OriginalMember(owner = "client!bba", name = "d", descriptor = "(B)V")
    public final void method2284(byte arg0) {
        if (this.field7769) {
            int var2 = super.field7153.method2160();
            int var3 = super.field7153.method2230();
            float var4 = (float) var2 + -((float) (-var3 + var2) * 0.125F);
            float var5 = (float) var2 - (float) (-var3 + var2) * 0.25F;
            OpenGL.glProgramLocalParameter4fARB(34336, 0, var5, var4, 1.0F / (float) super.field7153.method2935(-124), (float) super.field7153.method2931(6) / 255.0F);
            super.field7153.method2949(1, 7544);
            super.field7153.method2912((byte) 9, super.field7153.method2880(arg0 ^ -37));
            super.field7153.method2949(0, 7544);
        }
        ++field7774;
        if (arg0 != -45) {
            this.field7781 = true;
        }
    }

    @OriginalMember(owner = "client!bba", name = "a", descriptor = "(ZZ)V")
    public final void method33(boolean arg0, boolean arg1) {
        if (arg0) {
            ++field7770;
        }
    }

    @OriginalMember(owner = "client!bba", name = "a", descriptor = "(ZLwu;IJIII)V")
    public static final void method3288(boolean arg0, class557 arg1, int arg2, long arg3, int arg4, int arg5, int arg6) {
        ++field7776;
        class449.method2700(arg6, arg5 ^ -1183060724, arg1, arg4, arg0, arg2, arg5, arg3);
    }

    @OriginalMember(owner = "client!bba", name = "a", descriptor = "(IZ)V")
    public final void method36(int arg0, boolean arg1) {
        ++field7772;
        this.field7778 = arg1;
        super.field7153.method2949(1, 7544);
        super.field7153.method2933((byte) 102, this.field7773);
        super.field7153.method2878(class253.field3501, 28768, class438.field6017);
        super.field7153.method2946(0, class123.field1675, (byte) 127);
        super.field7153.method582(2, (byte) 82, true, class186.field2725, false);
        super.field7153.method2923(-98, 0, class214.field3017);
        if (arg0 < -62) {
            super.field7153.method2949(0, 7544);
            this.method3062((byte) 105);
        }
    }

    @OriginalMember(owner = "client!bba", name = "a", descriptor = "(IIZ)V")
    public final void method38(int arg0, int arg1, boolean arg2) {
        ++field7780;
        if (arg2) {
            this.field7765 = null;
        }
    }

    @OriginalMember(owner = "client!bba", name = "a", descriptor = "(IILmr;Ljava/lang/String;)Lfg;")
    public static final class436 method3289(int arg0, int arg1, class613 arg2, String arg3) {
        ++field7768;
        if (~arg1 == -1) {
            return arg2.method3590((byte) 113, arg3);
        } else if (~arg1 == -2) {
            try {
                class208.method1376(95, class622.field8847, new Object[] { (new URL(class622.field8847.getCodeBase(), arg3)).toString() }, "openjs");
                class436 var4 = new class436();
                var4.field5975 = 1;
                return var4;
            } catch (Throwable var10) {
                class436 var5 = new class436();
                var5.field5975 = 2;
                return var5;
            }
        } else if (~arg1 == -3) {
            try {
                class622.field8847.getAppletContext().showDocument(new URL(class622.field8847.getCodeBase(), arg3), "_blank");
                class436 var6 = new class436();
                var6.field5975 = 1;
                return var6;
            } catch (Exception var11) {
                class436 var7 = new class436();
                var7.field5975 = 2;
                return var7;
            }
        } else {
            if (arg0 != 0) {
                field7783 = false;
            }
            if (arg1 == 3) {
                try {
                    class208.method1378("loggedout", class622.field8847, arg0 ^ -9875);
                } catch (Throwable var13) {
                }
                try {
                    class622.field8847.getAppletContext().showDocument(new URL(class622.field8847.getCodeBase(), arg3), "_top");
                    class436 var8 = new class436();
                    var8.field5975 = 1;
                    return var8;
                } catch (Exception var12) {
                    class436 var9 = new class436();
                    var9.field5975 = 2;
                    return var9;
                }
            } else {
                throw new IllegalArgumentException();
            }
        }
    }

    @OriginalMember(owner = "client!bba", name = "<init>", descriptor = "(Lsb;Lwu;)V")
    public class550(class93 arg0, class557 arg1) {
        super(arg0);
        if (arg1 != null && arg0.field1360) {
            this.field7763 = class477.method2822(arg0, (byte) 44, arg1.method3330((byte) 67, "uw_ground_unlit", "gl"), 34336);
            this.field7782 = class477.method2822(arg0, (byte) 44, arg1.method3330((byte) 67, "uw_ground_lit", "gl"), 34336);
            this.field7779 = class477.method2822(arg0, (byte) 44, arg1.method3330((byte) 67, "uw_model_unlit", "gl"), 34336);
            this.field7777 = class477.method2822(arg0, (byte) 44, arg1.method3330((byte) 67, "uw_model_lit", "gl"), 34336);
            if (!(this.field7777 != null & this.field7782 != null & this.field7763 != null & this.field7779 != null)) {
                this.field7781 = false;
            } else {
                this.field7773 = super.field7153.method2936(false, 2, 1, new int[] { 0, -1 }, (byte) 103);
                this.field7773.method355(false, (byte) -106, false);
                this.field7781 = true;
            }
        } else {
            this.field7781 = false;
        }
    }

    @OriginalMember(owner = "client!bba", name = "b", descriptor = "(I)V")
    public final void method39(int arg0) {
        if (arg0 == 6) {
            ++field7762;
            super.field7153.method2949(1, 7544);
            super.field7153.method2933((byte) 125, (class117) null);
            super.field7153.method2878(class369.field4717, 28768, class369.field4717);
            super.field7153.method2946(0, class186.field2725, (byte) 127);
            super.field7153.method2946(2, class123.field1675, (byte) 127);
            super.field7153.method2923(-100, 0, class186.field2725);
            super.field7153.method2949(0, 7544);
            if (this.field7767) {
                super.field7153.method2946(0, class186.field2725, (byte) 127);
                super.field7153.method2923(-112, 0, class186.field2725);
                this.field7767 = false;
            }
            if (this.field7769) {
                OpenGL.glBindProgramARB(34336, 0);
                OpenGL.glDisable(34820);
                OpenGL.glDisable(34336);
                this.field7769 = false;
            }
        }
    }

    @OriginalMember(owner = "client!bba", name = "e", descriptor = "(I)Z")
    public final boolean method35(int arg0) {
        ++field7764;
        int var2 = 45 % ((arg0 - -72) / 37);
        return this.field7781;
    }
}
