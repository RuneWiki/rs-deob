import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fs")
public class class353 implements class436 {

    @OriginalMember(owner = "client!fs", name = "q", descriptor = "[Lvr;")
    private class238[] field5045 = new class238[9];

    @OriginalMember(owner = "client!fs", name = "s", descriptor = "I")
    private int field5047 = -1;

    @OriginalMember(owner = "client!fs", name = "j", descriptor = "I")
    private int field5038 = 0;

    @OriginalMember(owner = "client!fs", name = "h", descriptor = "Ljj;")
    private class66 field5036;

    @OriginalMember(owner = "client!fs", name = "B", descriptor = "I")
    private int field5056;

    @OriginalMember(owner = "client!fs", name = "g", descriptor = "Lbv;")
    public static class567 field5035 = new class567("Checking for updates - ", "Suche nach Updates - ", "Vérification des mises à jour - ", "Verificando atualizações - ");

    @OriginalMember(owner = "client!fs", name = "n", descriptor = "I")
    public static int field5042 = 0;

    @OriginalMember(owner = "client!fs", name = "k", descriptor = "Loh;")
    public static class549 field5039 = null;

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "I")
    public static int field5029;

    @OriginalMember(owner = "client!fs", name = "b", descriptor = "I")
    public static int field5030;

    @OriginalMember(owner = "client!fs", name = "c", descriptor = "I")
    public static int field5031;

    @OriginalMember(owner = "client!fs", name = "d", descriptor = "I")
    private int field5032;

    @OriginalMember(owner = "client!fs", name = "e", descriptor = "I")
    public static int field5033;

    @OriginalMember(owner = "client!fs", name = "f", descriptor = "I")
    public static int field5034;

    @OriginalMember(owner = "client!fs", name = "i", descriptor = "I")
    private int field5037;

    @OriginalMember(owner = "client!fs", name = "l", descriptor = "I")
    public static int field5040;

    @OriginalMember(owner = "client!fs", name = "m", descriptor = "I")
    public static int field5041;

    @OriginalMember(owner = "client!fs", name = "o", descriptor = "I")
    public static int field5043;

    @OriginalMember(owner = "client!fs", name = "p", descriptor = "I")
    public static int field5044;

    @OriginalMember(owner = "client!fs", name = "r", descriptor = "I")
    public static int field5046;

    @OriginalMember(owner = "client!fs", name = "t", descriptor = "I")
    public static int field5048;

    @OriginalMember(owner = "client!fs", name = "u", descriptor = "I")
    public static int field5049;

    @OriginalMember(owner = "client!fs", name = "v", descriptor = "I")
    public static int field5050;

    @OriginalMember(owner = "client!fs", name = "w", descriptor = "I")
    public static int field5051;

    @OriginalMember(owner = "client!fs", name = "x", descriptor = "I")
    private int field5052;

    @OriginalMember(owner = "client!fs", name = "y", descriptor = "I")
    public static int field5053;

    @OriginalMember(owner = "client!fs", name = "z", descriptor = "I")
    public static int field5054;

    @OriginalMember(owner = "client!fs", name = "A", descriptor = "I")
    public static int field5055;

    @OriginalMember(owner = "client!fs", name = "C", descriptor = "I")
    public static int field5057;

    @OriginalMember(owner = "client!fs", name = "D", descriptor = "I")
    public static int field5058;

    @OriginalMember(owner = "client!fs", name = "F", descriptor = "I")
    public static int field5060;

    @OriginalMember(owner = "client!fs", name = "E", descriptor = "Lgp;")
    public static class561 field5059;

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(II)V")
    public final void method2137(int arg0, int arg1) {
        field5053++;
        if (arg0 != -25469) {
            this.method2137(-34, 61);
        }
        if (this.field5047 == -1) {
            throw new RuntimeException();
        }
        OpenGL.glDrawBuffer(class410.field6097[arg1]);
    }

    @OriginalMember(owner = "client!fs", name = "d", descriptor = "(I)I")
    private final int method2138(int arg0) {
        field5041++;
        if ((this.field5038 & 0x4) != 0) {
            return 36160;
        } else if ((this.field5038 & 0x2) == 0) {
            if (arg0 != 22050) {
                this.method2148(38, -41);
            }
            return (this.field5038 & 0x1) == 0 ? -1 : 36008;
        } else {
            return 36009;
        }
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(IIILhp;)V")
    private final void method2139(int arg0, int arg1, int arg2, class355 arg3) {
        field5029++;
        if (this.field5047 == -1) {
            throw new RuntimeException();
        }
        int var5 = 0x1 << arg0;
        if (arg2 <= 19) {
            return;
        }
        if ((~var5 & this.field5037) == 0) {
            this.field5032 = arg3.field5069;
            this.field5052 = arg3.field5070;
        } else if (this.field5032 != arg3.field5069 || this.field5052 != arg3.field5070) {
            throw new RuntimeException();
        }
        arg3.method2158(class410.field6097[arg0], this.field5047, arg1, (byte) 95);
        this.field5045[arg0] = arg3;
        this.field5037 |= var5;
    }

    @OriginalMember(owner = "client!fs", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.field5036.method606(this.field5056, -75);
        field5058++;
        super.finalize();
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(IZ)V")
    public final void method2140(int arg0, boolean arg1) {
        field5046++;
        if (this.field5047 == -1) {
            throw new RuntimeException();
        }
        if (arg1) {
            method2150(-71);
        }
        OpenGL.glReadBuffer(class410.field6097[arg0]);
    }

    @OriginalMember(owner = "client!fs", name = "e", descriptor = "(I)Z")
    public final boolean method2141(int arg0) {
        field5043++;
        int var2 = OpenGL.glCheckFramebufferStatusEXT(this.field5047);
        return ~var2 == arg0;
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(I)V")
    public final void method2142(int arg0) {
        field5034++;
        OpenGL.glBindFramebufferEXT(36160, 0);
        this.field5038 &= 0xFFFFFFFB;
        if (arg0 != 26666) {
            this.method2142(-41);
        }
        this.field5047 = this.method2138(22050);
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(III)V")
    public static final void method2143(int arg0, int arg1, int arg2) {
        class378.field5562 = arg1 - class212.field3120;
        if (arg0 != 1) {
            field5059 = null;
        }
        class469.field6762 = arg2 - class212.field3118;
        field5051++;
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(BLhp;I)V")
    public final void method2144(byte arg0, class355 arg1, int arg2) {
        field5033++;
        if (arg0 != 50) {
            this.method2138(-114);
        }
        this.method2139(arg2, 0, 108, arg1);
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(IBLcm;)V")
    public final void method2145(int arg0, byte arg1, class528 arg2) {
        field5030++;
        if (this.field5047 == -1) {
            throw new RuntimeException();
        }
        if (arg1 < 9) {
            this.method2141(53);
        }
        int var4 = 0x1 << arg0;
        if ((this.field5037 & ~var4) == 0) {
            this.field5052 = arg2.field7342;
            this.field5032 = arg2.field7344;
        } else if (this.field5032 != arg2.field7344 || this.field5052 != arg2.field7342) {
            throw new RuntimeException();
        }
        arg2.method2974(this.field5047, 5, class410.field6097[arg0]);
        this.field5045[arg0] = arg2;
        this.field5037 |= var4;
    }

    @OriginalMember(owner = "client!fs", name = "c", descriptor = "(B)V")
    public final void method2146(byte arg0) {
        field5054++;
        OpenGL.glBindFramebufferEXT(36009, 0);
        this.field5038 &= 0xFFFFFFFD;
        this.field5047 = this.method2138(22050);
        if (arg0 <= 5) {
            this.field5045 = null;
        }
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(IILoj;I)V")
    public final void method2147(int arg0, int arg1, class498 arg2, int arg3) {
        field5031++;
        this.method2152(arg0, arg2, (byte) 58, arg3, arg1);
    }

    @OriginalMember(owner = "client!fs", name = "b", descriptor = "(II)V")
    public final void method2148(int arg0, int arg1) {
        if (this.field5045[arg1] != null) {
            this.field5045[arg1].method1492(arg0 - 29949);
        }
        field5050++;
        this.field5037 &= ~(arg0 << arg1);
        this.field5045[arg1] = null;
    }

    @OriginalMember(owner = "client!fs", name = "b", descriptor = "(I)V")
    public final void method2149(int arg0) {
        OpenGL.glBindFramebufferEXT(36008, this.field5056);
        field5044++;
        if (arg0 < -26) {
            this.field5038 |= 0x1;
            this.field5047 = this.method2138(22050);
        }
    }

    @OriginalMember(owner = "client!fs", name = "f", descriptor = "(I)Z")
    public static final boolean method2150(int arg0) {
        if (arg0 > -87) {
            method2153((byte) -51);
        }
        field5040++;
        try {
            if (class376.field5531 == 2) {
                if (class595.field8464 == null) {
                    class595.field8464 = class53.method445(class69.field1309, class444.field6479, class66.field1086);
                    if (class595.field8464 == null) {
                        return false;
                    }
                }
                if (class544.field7578 == null) {
                    class544.field7578 = new class489(class304.field4388, class8.field77);
                }
                if (class193.field2780.method190(class544.field7578, (byte) -99, 22050, class580.field8277, class595.field8464)) {
                    class193.field2780.method182((byte) 125);
                    class193.field2780.method180(40, class617.field8732);
                    class193.field2780.method184(class161.field2392, false, class595.field8464);
                    class595.field8464 = null;
                    class544.field7578 = null;
                    class376.field5531 = 0;
                    class69.field1309 = null;
                    return true;
                }
            }
        } catch (Exception var2) {
            var2.printStackTrace();
            class193.field2780.method178(false);
            class69.field1309 = null;
            class376.field5531 = 0;
            class595.field8464 = null;
            class544.field7578 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!fs", name = "b", descriptor = "(B)V")
    public final void method2151(byte arg0) {
        OpenGL.glBindFramebufferEXT(36160, this.field5056);
        if (arg0 != -108) {
            this.method2137(21, 76);
        }
        field5060++;
        this.field5038 |= 0x4;
        this.field5047 = this.method2138(22050);
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(ILoj;BII)V")
    private final void method2152(int arg0, class498 arg1, byte arg2, int arg3, int arg4) {
        field5057++;
        if (this.field5047 == -1) {
            throw new RuntimeException();
        }
        int var6 = 0x1 << arg0;
        if ((this.field5037 & ~var6) == 0) {
            this.field5032 = arg1.field6976;
            this.field5052 = arg1.field6976;
        } else if (this.field5032 != arg1.field6976 || this.field5052 != arg1.field6976) {
            throw new RuntimeException();
        }
        arg1.method2837(arg4, this.field5047, class410.field6097[arg0], (byte) 65, arg3);
        this.field5045[arg0] = arg1;
        this.field5037 |= var6;
        if (arg2 != 58) {
            this.field5047 = 35;
        }
    }

    @OriginalMember(owner = "client!fs", name = "d", descriptor = "(B)V")
    public static void method2153(byte arg0) {
        field5035 = null;
        field5039 = null;
        if (arg0 < 98) {
            method2150(-37);
        }
        field5059 = null;
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(Z)I")
    public final int method2154(boolean arg0) {
        if (arg0) {
            this.method2145(7, (byte) -86, null);
        }
        field5048++;
        return this.field5052;
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(B)V")
    public final void method2155(byte arg0) {
        field5049++;
        if (arg0 != -58) {
            field5035 = null;
        }
        OpenGL.glBindFramebufferEXT(36009, this.field5056);
        this.field5038 |= 0x2;
        this.field5047 = this.method2138(22050);
    }

    @OriginalMember(owner = "client!fs", name = "<init>", descriptor = "(Ljj;)V")
    public class353(class66 arg0) {
        if (!arg0.field1201) {
            throw new IllegalStateException("");
        }
        this.field5036 = arg0;
        OpenGL.glGenFramebuffersEXT(1, class43.field587, 0);
        this.field5056 = class43.field587[0];
    }

    @OriginalMember(owner = "client!fs", name = "c", descriptor = "(I)V")
    public final void method2156(int arg0) {
        OpenGL.glBindFramebufferEXT(36008, 0);
        if (arg0 >= -53) {
            this.field5037 = -33;
        }
        field5055++;
        this.field5038 &= 0xFFFFFFFE;
        this.field5047 = this.method2138(22050);
    }
}
