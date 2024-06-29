import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ks")
public class class317 implements class122 {

    @OriginalMember(owner = "client!ks", name = "k", descriptor = "[Lih;")
    private class212[] field4850 = new class212[9];

    @OriginalMember(owner = "client!ks", name = "q", descriptor = "I")
    private int field4856 = 0;

    @OriginalMember(owner = "client!ks", name = "z", descriptor = "I")
    private int field4865 = -1;

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "Lbv;")
    private class282 field4840;

    @OriginalMember(owner = "client!ks", name = "n", descriptor = "I")
    private int field4853;

    @OriginalMember(owner = "client!ks", name = "x", descriptor = "Lpg;")
    public static class492 field4863;

    @OriginalMember(owner = "client!ks", name = "C", descriptor = "Lui;")
    public static class375 field4868;

    @OriginalMember(owner = "client!ks", name = "E", descriptor = "Lcm;")
    public static class449 field4870;

    @OriginalMember(owner = "client!ks", name = "b", descriptor = "I")
    public static int field4841;

    @OriginalMember(owner = "client!ks", name = "c", descriptor = "I")
    public static int field4842;

    @OriginalMember(owner = "client!ks", name = "d", descriptor = "I")
    public static int field4843;

    @OriginalMember(owner = "client!ks", name = "e", descriptor = "I")
    public static int field4844;

    @OriginalMember(owner = "client!ks", name = "f", descriptor = "I")
    public static int field4845;

    @OriginalMember(owner = "client!ks", name = "g", descriptor = "I")
    public static int field4846;

    @OriginalMember(owner = "client!ks", name = "h", descriptor = "I")
    public static int field4847;

    @OriginalMember(owner = "client!ks", name = "i", descriptor = "I")
    public static int field4848;

    @OriginalMember(owner = "client!ks", name = "j", descriptor = "I")
    public static int field4849;

    @OriginalMember(owner = "client!ks", name = "l", descriptor = "I")
    public static int field4851;

    @OriginalMember(owner = "client!ks", name = "m", descriptor = "I")
    public static int field4852;

    @OriginalMember(owner = "client!ks", name = "o", descriptor = "I")
    public static int field4854;

    @OriginalMember(owner = "client!ks", name = "p", descriptor = "I")
    private int field4855;

    @OriginalMember(owner = "client!ks", name = "r", descriptor = "I")
    public static int field4857;

    @OriginalMember(owner = "client!ks", name = "s", descriptor = "I")
    public static int field4858;

    @OriginalMember(owner = "client!ks", name = "t", descriptor = "I")
    public static int field4859;

    @OriginalMember(owner = "client!ks", name = "u", descriptor = "I")
    public static int field4860;

    @OriginalMember(owner = "client!ks", name = "v", descriptor = "I")
    private int field4861;

    @OriginalMember(owner = "client!ks", name = "w", descriptor = "I")
    private int field4862;

    @OriginalMember(owner = "client!ks", name = "y", descriptor = "I")
    public static int field4864;

    @OriginalMember(owner = "client!ks", name = "A", descriptor = "I")
    public static int field4866;

    @OriginalMember(owner = "client!ks", name = "B", descriptor = "I")
    public static int field4867;

    @OriginalMember(owner = "client!ks", name = "D", descriptor = "I")
    public static int field4869;

    @OriginalMember(owner = "client!ks", name = "F", descriptor = "I")
    public static int field4871;

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(ZLrk;)I")
    public static final int method2053(boolean arg0, class194 arg1) {
        field4860++;
        if (!arg0) {
            field4863 = null;
        }
        class329 var2 = arg1.field2768;
        if (var2.field5068 != null) {
            var2 = var2.method2125(class36.field583, !arg0);
            if (var2 == null) {
                return -1;
            }
        }
        int var3 = var2.field5037;
        class219 var4 = arg1.method2181(0);
        if (arg1.field5294) {
            var3 = var2.field5056;
        } else if (arg1.field5253 == var4.field3054 || arg1.field5253 == var4.field3036 || arg1.field5253 == var4.field3056 || arg1.field5253 == var4.field3063) {
            var3 = var2.field5089;
        } else if (arg1.field5253 == var4.field3052 || arg1.field5253 == var4.field3042 || arg1.field5253 == var4.field3037 || arg1.field5253 == var4.field3044) {
            var3 = var2.field5082;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(I)V")
    public final void method781(int arg0) {
        if (arg0 != -18631) {
            this.method784((byte) 33);
        }
        OpenGL.glBindFramebufferEXT(36008, 0);
        field4843++;
        this.field4856 &= 0xFFFFFFFE;
        this.field4865 = this.method2062(true);
    }

    @OriginalMember(owner = "client!ks", name = "e", descriptor = "(I)I")
    public final int method2054(int arg0) {
        field4851++;
        int var2 = -44 % ((-arg0 - 39) / 63);
        return this.field4855;
    }

    @OriginalMember(owner = "client!ks", name = "b", descriptor = "(I)V")
    public final void method782(int arg0) {
        field4854++;
        if (arg0 < -88) {
            OpenGL.glBindFramebufferEXT(36009, 0);
            this.field4856 &= 0xFFFFFFFD;
            this.field4865 = this.method2062(true);
        }
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(B)V")
    public final void method783(byte arg0) {
        field4852++;
        OpenGL.glBindFramebufferEXT(36009, this.field4853);
        this.field4856 |= 0x2;
        this.field4865 = this.method2062(true);
        int var2 = -18 % ((arg0 - 13) / 43);
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(II)V")
    public final void method2055(int arg0, int arg1) {
        field4842++;
        if (this.field4865 == -1) {
            throw new RuntimeException();
        }
        if (arg0 != 0) {
            this.method783((byte) -73);
        }
        OpenGL.glReadBuffer(class278.field3848[arg1]);
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(Lpo;BI)V")
    public final void method2056(class252 arg0, byte arg1, int arg2) {
        field4841++;
        if (this.field4865 == -1) {
            throw new RuntimeException();
        }
        int var4 = 0x1 << arg2;
        int var5 = -109 / ((-arg1 - 23) / 55);
        if ((this.field4861 & ~var4) == 0) {
            this.field4862 = arg0.field3487;
            this.field4855 = arg0.field3489;
        } else if (this.field4862 != arg0.field3487 || this.field4855 != arg0.field3489) {
            throw new RuntimeException();
        }
        arg0.method1644(36161, class278.field3848[arg2], this.field4865);
        this.field4850[arg2] = arg0;
        this.field4861 |= var4;
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(IILwg;)V")
    public final void method2057(int arg0, int arg1, class393 arg2) {
        int var4 = 120 / ((arg1 - 14) / 48);
        field4859++;
        this.method2067((byte) 88, arg0, arg2, 0);
    }

    @OriginalMember(owner = "client!ks", name = "c", descriptor = "(I)V")
    public final void method785(int arg0) {
        if (arg0 <= 32) {
            this.field4850 = null;
        }
        OpenGL.glBindFramebufferEXT(36008, this.field4853);
        field4845++;
        this.field4856 |= 0x1;
        this.field4865 = this.method2062(true);
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(IIIILlr;)V")
    private final void method2058(int arg0, int arg1, int arg2, int arg3, class237 arg4) {
        field4864++;
        if (this.field4865 == -1) {
            throw new RuntimeException();
        }
        int var6 = 0x1 << arg1;
        if ((~var6 & this.field4861) == 0) {
            this.field4862 = arg4.field3374;
            this.field4855 = arg4.field3374;
        } else if (this.field4862 != arg4.field3374 || this.field4855 != arg4.field3374) {
            throw new RuntimeException();
        }
        arg4.method1605(arg3, arg2, class278.field3848[arg1], -9454, this.field4865);
        if (arg0 == -5740) {
            this.field4850[arg1] = arg4;
            this.field4861 |= var6;
        }
    }

    @OriginalMember(owner = "client!ks", name = "f", descriptor = "(I)V")
    public static final void method2059(int arg0) {
        field4869++;
        class69.field965.method1959((byte) 113);
        for (class32 var1 = (class32) class96.field1395.method1970(64); var1 != null; var1 = (class32) class96.field1395.method1960(arg0 ^ 0xFFFF9BAE)) {
            if (var1.field485 < 1000) {
                var1.method2785((byte) -120);
                class69.field965.method1958(var1, 0);
            }
        }
        class69.field965.method1966(class96.field1395, 115);
        if (arg0 != -25674) {
            return;
        }
        int var2 = -1;
        class414 var3 = (class414) class94.field1369.method1970(64);
        if (var3 != null) {
            var2 = var3.method715((byte) -90);
        }
        if (!class455.field6680) {
            if (var2 == 0 && (class299.field4423 == 1 && class12.field201 > 2 || class115.method744((byte) -83))) {
                var2 = 2;
            }
            if (var2 == 2 && class12.field201 > 0 && var3 != null) {
                if (class362.field5615 == null && class515.field7638 == 0) {
                    class471.method2824(var3.method712(36), var3.method717(arg0 ^ 0xFFFFD329), -116);
                } else {
                    class276.field3834 = 2;
                }
            }
            if (var2 == 0 && class12.field201 > 0) {
                class336.method2168(123);
            }
            if (class362.field5615 != null || class515.field7638 != 0) {
                return;
            }
            class83.field1139 = null;
            class276.field3834 = 0;
            return;
        }
        if (var2 == -1) {
            int var4 = class346.field5419.method812(false);
            int var5 = class346.field5419.method811(false);
            if (var4 < class107.field1519 - 10 || var4 > (class107.field1519 + class455.field6686 + 10) || var5 < (class439.field6536 - 10) || var5 > (class439.field6536 + class148.field2128 + 10)) {
                class455.field6680 = false;
                class244.method1627(class455.field6686, class439.field6536, class148.field2128, class107.field1519, (byte) -31);
            }
        }
        if (var2 != 0) {
            return;
        }
        int var6 = class107.field1519;
        int var7 = class439.field6536;
        int var8 = class455.field6686;
        int var9 = var3.method717(arg0 ^ 0xFFFFD329);
        int var10 = var3.method712(125);
        int var11 = -1;
        for (int var12 = 0; var12 < class12.field201; var12++) {
            if (class207.field2923) {
                int var17 = (class12.field201 - var12 - 1) * 16 + var7 + 33;
                if (var9 > var6 && var9 < var6 + var8 && var10 > (var17 - 13) && var17 + 4 > var10) {
                    var11 = var12;
                }
            } else {
                int var16 = var7 - (-((class12.field201 - var12 - 1) * 16) - 31);
                if (var6 < var9 && (var6 + var8) > var9 && (var16 - 13) < var10 && (var16 + 3) > var10) {
                    var11 = var12;
                }
            }
        }
        if (var11 != -1) {
            int var13 = 0;
            class8 var14 = new class8(class96.field1395);
            for (class32 var15 = (class32) var14.method72((byte) -33); var15 != null; var15 = (class32) var14.method74(122)) {
                if (var11 == var13) {
                    class515.method3062(var9, var15, -14223, var10);
                }
                var13++;
            }
        }
        class455.field6680 = false;
        class244.method1627(class455.field6686, class439.field6536, class148.field2128, class107.field1519, (byte) -31);
        return;
    }

    @OriginalMember(owner = "client!ks", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.field4840.method1768(this.field4853, (byte) -51);
        field4846++;
        super.finalize();
    }

    @OriginalMember(owner = "client!ks", name = "d", descriptor = "(I)V")
    public final void method786(int arg0) {
        OpenGL.glBindFramebufferEXT(36160, this.field4853);
        int var2 = 58 % ((arg0 - 30) / 49);
        field4857++;
        this.field4856 |= 0x4;
        this.field4865 = this.method2062(true);
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(ILlr;IB)V")
    public final void method2060(int arg0, class237 arg1, int arg2, byte arg3) {
        this.method2058(-5740, arg2, 0, arg0, arg1);
        int var5 = -58 % ((-arg3 - 17) / 37);
        field4866++;
    }

    @OriginalMember(owner = "client!ks", name = "g", descriptor = "(I)V")
    public static void method2061(int arg0) {
        field4870 = null;
        field4868 = null;
        field4863 = null;
        if (arg0 != -1) {
            field4868 = null;
        }
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(Z)I")
    private final int method2062(boolean arg0) {
        field4847++;
        if (!arg0) {
            this.method2066((byte) 121, 120);
        }
        if ((this.field4856 & 0x4) != 0) {
            return 36160;
        } else if ((this.field4856 & 0x2) == 0) {
            return (this.field4856 & 0x1) == 0 ? -1 : 36008;
        } else {
            return 36009;
        }
    }

    @OriginalMember(owner = "client!ks", name = "b", descriptor = "(B)V")
    public final void method784(byte arg0) {
        field4849++;
        OpenGL.glBindFramebufferEXT(36160, 0);
        int var2 = 81 / ((arg0 - 46) / 49);
        this.field4856 &= 0xFFFFFFFB;
        this.field4865 = this.method2062(true);
    }

    @OriginalMember(owner = "client!ks", name = "h", descriptor = "(I)Z")
    public final boolean method2063(int arg0) {
        field4848++;
        int var2 = OpenGL.glCheckFramebufferStatusEXT(this.field4865);
        if (arg0 != -16436) {
            method2053(false, null);
        }
        return var2 == 36053;
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(BZLjava/lang/String;)V")
    public static final void method2064(byte arg0, boolean arg1, String arg2) {
        field4867++;
        String var3 = arg2.toLowerCase();
        short[] var4 = new short[16];
        int var5 = 0;
        int var6 = arg1 ? 32768 : 0;
        int var7 = (arg1 ? class84.field1147.field7627 : class84.field1147.field7621) + var6;
        for (int var8 = var6; var8 < var7; var8++) {
            class54 var11 = class84.field1147.method3057(64, var8);
            if (var11.field726 && var11.method367(8).toLowerCase().indexOf(var3) != -1) {
                if (var5 >= 50) {
                    class257.field3596 = -1;
                    class480.field7011 = null;
                    return;
                }
                if (var5 >= var4.length) {
                    short[] var12 = new short[var4.length * 2];
                    for (int var13 = 0; var13 < var5; var13++) {
                        var12[var13] = var4[var13];
                    }
                    var4 = var12;
                }
                var4[var5++] = (short) var8;
            }
        }
        if (arg0 != -82) {
            field4868 = null;
        }
        class480.field7011 = var4;
        class453.field6648 = 0;
        class257.field3596 = var5;
        String[] var9 = new String[class257.field3596];
        for (int var10 = 0; var10 < class257.field3596; var10++) {
            var9[var10] = class84.field1147.method3057(64, var4[var10]).method367(8);
        }
        class530.method3127(var9, class480.field7011, (byte) 25);
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(IB)V")
    public final void method2065(int arg0, byte arg1) {
        int var3 = -61 % ((-arg1 - 15) / 51);
        field4858++;
        if (this.field4865 == -1) {
            throw new RuntimeException();
        }
        OpenGL.glDrawBuffer(class278.field3848[arg0]);
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(BI)V")
    public final void method2066(byte arg0, int arg1) {
        field4871++;
        if (this.field4850[arg1] != null) {
            this.field4850[arg1].method127(false);
        }
        this.field4861 &= ~(0x1 << arg1);
        if (arg0 == 23) {
            this.field4850[arg1] = null;
        }
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(BILwg;I)V")
    private final void method2067(byte arg0, int arg1, class393 arg2, int arg3) {
        field4844++;
        if (this.field4865 == -1) {
            throw new RuntimeException();
        }
        if (arg0 != 88) {
            this.field4862 = -28;
        }
        int var5 = 0x1 << arg1;
        if ((this.field4861 & ~var5) == 0) {
            this.field4855 = arg2.field5979;
            this.field4862 = arg2.field5980;
        } else if (this.field4862 != arg2.field5980 || this.field4855 != arg2.field5979) {
            throw new RuntimeException();
        }
        arg2.method2418(class278.field3848[arg1], arg3, this.field4865, arg0 + 5);
        this.field4850[arg1] = arg2;
        this.field4861 |= var5;
    }

    @OriginalMember(owner = "client!ks", name = "<init>", descriptor = "(Lbv;)V")
    public class317(class282 arg0) {
        if (!arg0.field4159) {
            throw new IllegalStateException("");
        }
        this.field4840 = arg0;
        OpenGL.glGenFramebuffersEXT(1, class250.field3468, 0);
        this.field4853 = class250.field3468[0];
    }

    static {
        new class375("To go here you must login to a members' server.", "Du musst auf einer Mitglieder-Welt sein, um dort hinzukommen.", "Vous devez vous connecter à un serveur d'abonnés pour aller à cet endroit.", "Para entrar aqui, acesse um servidor para membros.");
        field4863 = new class492(51, -2);
        new class375(" was kicked from the channel.", " wurde aus dem Chatraum rausgeworfen.", " a été expulsé du canal.", " foi expulso do canal.");
        field4868 = new class375("Unable to find ", "Spieler kann nicht gefunden werden: ", "Impossible de trouver ", "Não é possível encontrar ");
        field4870 = new class449(20, 7);
    }
}
