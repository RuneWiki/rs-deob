import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aea")
public class class45 implements class125 {

    @OriginalMember(owner = "client!aea", name = "j", descriptor = "I")
    private int field861 = -1;

    @OriginalMember(owner = "client!aea", name = "r", descriptor = "I")
    private int field869 = 0;

    @OriginalMember(owner = "client!aea", name = "F", descriptor = "[Lida;")
    private class199[] field883 = new class199[9];

    @OriginalMember(owner = "client!aea", name = "b", descriptor = "Lgi;")
    private class583 field853;

    @OriginalMember(owner = "client!aea", name = "q", descriptor = "I")
    private int field868;

    @OriginalMember(owner = "client!aea", name = "a", descriptor = "I")
    public static int field852 = 13156520;

    @OriginalMember(owner = "client!aea", name = "A", descriptor = "[Lnv;")
    public static class353[] field878 = new class353[14];

    @OriginalMember(owner = "client!aea", name = "c", descriptor = "I")
    public static int field854;

    @OriginalMember(owner = "client!aea", name = "d", descriptor = "I")
    public static int field855;

    @OriginalMember(owner = "client!aea", name = "e", descriptor = "I")
    public static int field856;

    @OriginalMember(owner = "client!aea", name = "f", descriptor = "I")
    private int field857;

    @OriginalMember(owner = "client!aea", name = "h", descriptor = "I")
    public static int field859;

    @OriginalMember(owner = "client!aea", name = "i", descriptor = "I")
    private int field860;

    @OriginalMember(owner = "client!aea", name = "k", descriptor = "I")
    public static int field862;

    @OriginalMember(owner = "client!aea", name = "l", descriptor = "I")
    private int field863;

    @OriginalMember(owner = "client!aea", name = "m", descriptor = "I")
    public static int field864;

    @OriginalMember(owner = "client!aea", name = "n", descriptor = "I")
    public static int field865;

    @OriginalMember(owner = "client!aea", name = "o", descriptor = "I")
    public static int field866;

    @OriginalMember(owner = "client!aea", name = "p", descriptor = "I")
    public static int field867;

    @OriginalMember(owner = "client!aea", name = "s", descriptor = "I")
    public static int field870;

    @OriginalMember(owner = "client!aea", name = "t", descriptor = "I")
    public static int field871;

    @OriginalMember(owner = "client!aea", name = "u", descriptor = "I")
    public static int field872;

    @OriginalMember(owner = "client!aea", name = "v", descriptor = "I")
    public static int field873;

    @OriginalMember(owner = "client!aea", name = "w", descriptor = "I")
    public static int field874;

    @OriginalMember(owner = "client!aea", name = "x", descriptor = "I")
    public static int field875;

    @OriginalMember(owner = "client!aea", name = "y", descriptor = "I")
    public static int field876;

    @OriginalMember(owner = "client!aea", name = "z", descriptor = "I")
    public static int field877;

    @OriginalMember(owner = "client!aea", name = "B", descriptor = "I")
    public static int field879;

    @OriginalMember(owner = "client!aea", name = "C", descriptor = "I")
    public static int field880;

    @OriginalMember(owner = "client!aea", name = "D", descriptor = "I")
    public static int field881;

    @OriginalMember(owner = "client!aea", name = "E", descriptor = "I")
    public static int field882;

    @OriginalMember(owner = "client!aea", name = "G", descriptor = "I")
    public static int field884;

    @OriginalMember(owner = "client!aea", name = "g", descriptor = "[Llm;")
    public static class425[] field858;

    @OriginalMember(owner = "client!aea", name = "a", descriptor = "(IIIIIIZII)Z")
    public static final boolean method433(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8) {
        field882++;
        int var9 = class645.field9372.field616[0];
        int var10 = class645.field9372.field618[0];
        if (var9 < 0 || var9 >= class32.field513 || var10 < 0 || var10 >= class611.field8786) {
            return false;
        }
        int var11 = 108 % ((-arg5 - 50) / 51);
        if (arg1 < 0 || class32.field513 <= arg1 || arg3 < 0 || arg3 >= class611.field8786) {
            return false;
        }
        int var12 = class573.method3265(class314.field4234, (byte) -79, class428.field6075[class645.field9372.field6035], arg8, arg3, var9, arg4, var10, class645.field9372.method337(0), arg2, arg7, class236.field3314, arg1, arg6, arg0);
        if (var12 < 1) {
            return false;
        }
        class145.field2248 = class314.field4234[var12 - 1];
        class118.field1943 = class236.field3314[var12 - 1];
        class76.field1205 = false;
        class117.method825(27503);
        return true;
    }

    @OriginalMember(owner = "client!aea", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        field879++;
        this.field853.method3403(1, this.field868);
        super.finalize();
    }

    @OriginalMember(owner = "client!aea", name = "b", descriptor = "(B)V")
    public final void method434(byte arg0) {
        OpenGL.glBindFramebufferEXT(36009, this.field868);
        field865++;
        if (arg0 <= 104) {
            this.field853 = null;
        }
        this.field869 |= 0x2;
        this.field861 = this.method446(0);
    }

    @OriginalMember(owner = "client!aea", name = "a", descriptor = "(ILob;I)V")
    public final void method435(int arg0, class629 arg1, int arg2) {
        field867++;
        this.method447(arg2, arg1, (byte) 20, arg0);
    }

    @OriginalMember(owner = "client!aea", name = "a", descriptor = "(IIIILnm;)V")
    private final void method436(int arg0, int arg1, int arg2, int arg3, class403 arg4) {
        field884++;
        if (this.field861 == -1) {
            throw new RuntimeException();
        }
        int var6 = arg1 << arg3;
        if ((this.field857 & ~var6) == 0) {
            this.field863 = arg4.field5733;
            this.field860 = arg4.field5733;
        } else if (this.field860 != arg4.field5733 || this.field863 != arg4.field5733) {
            throw new RuntimeException();
        }
        arg4.method2408(arg0, 109, this.field861, class246.field3417[arg3], arg2);
        this.field883[arg3] = arg4;
        this.field857 |= var6;
    }

    @OriginalMember(owner = "client!aea", name = "b", descriptor = "(I)V")
    public final void method437(int arg0) {
        OpenGL.glBindFramebufferEXT(36009, 0);
        field870++;
        this.field869 &= 0xFFFFFFFD;
        if (arg0 == -19911) {
            this.field861 = this.method446(0);
        }
    }

    @OriginalMember(owner = "client!aea", name = "a", descriptor = "(Z)V")
    public final void method438(boolean arg0) {
        field854++;
        OpenGL.glBindFramebufferEXT(36008, 0);
        if (!arg0) {
            this.method441(122, 38, -10, null);
        }
        this.field869 &= 0xFFFFFFFE;
        this.field861 = this.method446(0);
    }

    @OriginalMember(owner = "client!aea", name = "d", descriptor = "(B)V")
    public static void method439(byte arg0) {
        field878 = null;
        field858 = null;
        if (arg0 >= -25) {
            field878 = null;
        }
    }

    @OriginalMember(owner = "client!aea", name = "a", descriptor = "(II)V")
    public static final void method440(int arg0, int arg1) {
        field874++;
        if (class440.field6254 == arg0) {
            return;
        }
        if (class440.field6254 == 0) {
            class18.method191(106);
        }
        if (arg0 == 12) {
            if (class68.field1153 == null) {
                class618.method3598(class320.field4337, class146.field2257, (byte) 118, class636.field9276);
            } else {
                class569.method3233(class320.field4337, -76);
            }
        }
        if (arg0 != 12 && class178.field2558 != null) {
            class178.field2558.method1004(34065);
            class178.field2558 = null;
        }
        if (arg0 == 2) {
            class397.method2375(true, class68.field1151 != class56.field1005);
        }
        if (arg0 == 6) {
            class378.method2233(true, class56.field1005 != class178.field2551);
        }
        if (arg0 == 4) {
            if (class68.field1153 == null) {
                class395.method2369((byte) -122, class636.field9276, class146.field2257);
            } else {
                class515.method2977((byte) 21);
            }
        } else if (arg0 == 5) {
            if (class68.field1153 == null) {
                class618.method3598(class320.field4337, class146.field2257, (byte) 99, class636.field9276);
            } else {
                class569.method3233(class320.field4337, -101);
            }
        } else if (arg0 == 8) {
            if (class68.field1153 == null) {
                class618.method3598(class320.field4337, class146.field2257, (byte) 50, class636.field9276);
            } else {
                class569.method3233(class320.field4337, -80);
            }
        } else if (arg0 == 11) {
            if (class68.field1153 == null) {
                class395.method2369((byte) -119, class636.field9276, class146.field2257);
            } else {
                class515.method2977((byte) 21);
            }
        }
        if (class51.method485((byte) 23, class440.field6254)) {
            class346.field4656.field288 = 2;
            class366.field4973.field288 = 2;
            class507.field7092.field288 = 2;
            class336.field4486.field288 = 2;
            class152.field2307.field288 = 2;
            class318.field4318.field288 = 2;
            class498.field6959.field288 = 2;
        }
        if (class51.method485((byte) -123, arg0)) {
            class457.field6446 = 0;
            class553.field7629 = 0;
            class365.field4969 = 1;
            class296.field4065 = 0;
            class226.field3242 = 1;
            class380.method2248(-69, true);
            class346.field4656.field288 = 1;
            class366.field4973.field288 = 1;
            class507.field7092.field288 = 1;
            class336.field4486.field288 = 1;
            class152.field2307.field288 = 1;
            class318.field4318.field288 = 1;
            class498.field6959.field288 = 1;
        }
        if (arg0 == 10 || arg0 == 2) {
            class492.method2857(21220);
        }
        if (arg0 == 1) {
            class397.method2376(class645.field9371, (byte) -125, class69.field1165);
        } else {
            class263.method1733(false);
        }
        boolean var2 = arg0 == 1 || class340.method2063(arg0, 30645) || class604.method3558(3, arg0);
        int var3 = -31 / ((arg1 + 36) / 33);
        boolean var4 = class440.field6254 == 1 || class340.method2063(class440.field6254, 30645) || class604.method3558(3, class440.field6254);
        if (var2 != var4) {
            if (var2) {
                class531.field7446 = class626.field9120;
                if (class491.field6875.field3362 == 0) {
                    class565.method3220(2, -30488);
                } else {
                    class189.method1177(false, 616, class626.field9120, 2, class491.field6875.field3362, 0, class236.field3305);
                }
                class591.field8440.method2479((byte) -58, false);
            } else {
                class565.method3220(2, -30488);
                class591.field8440.method2479((byte) -58, true);
            }
        }
        if (class51.method485((byte) -94, arg0) || arg0 == 12) {
            class69.field1165.method1299();
        }
        class440.field6254 = arg0;
    }

    @OriginalMember(owner = "client!aea", name = "a", descriptor = "(IIILnm;)V")
    public final void method441(int arg0, int arg1, int arg2, class403 arg3) {
        this.method436(0, 1, arg1, arg2, arg3);
        if (arg0 != 4962) {
            this.field868 = 93;
        }
        field877++;
    }

    @OriginalMember(owner = "client!aea", name = "a", descriptor = "(Lwk;B)V")
    public static final void method442(class122 arg0, byte arg1) {
        class303.field4139 = arg0;
        field866++;
        if (arg1 != -36) {
            field878 = null;
        }
    }

    @OriginalMember(owner = "client!aea", name = "a", descriptor = "(B)V")
    public final void method443(byte arg0) {
        field880++;
        OpenGL.glBindFramebufferEXT(36160, 0);
        this.field869 &= 0xFFFFFFFB;
        this.field861 = this.method446(0);
        if (arg0 >= -94) {
            this.method434((byte) -26);
        }
    }

    @OriginalMember(owner = "client!aea", name = "b", descriptor = "(II)V")
    public final void method444(int arg0, int arg1) {
        field872++;
        if (this.field861 == -1) {
            throw new RuntimeException();
        }
        int var3 = 40 % ((arg1 + 81) / 34);
        OpenGL.glReadBuffer(class246.field3417[arg0]);
    }

    @OriginalMember(owner = "client!aea", name = "a", descriptor = "(I)V")
    public final void method445(int arg0) {
        field855++;
        OpenGL.glBindFramebufferEXT(36160, this.field868);
        this.field869 |= 0x4;
        this.field861 = this.method446(0);
        if (arg0 != -14263) {
            field858 = null;
        }
    }

    @OriginalMember(owner = "client!aea", name = "c", descriptor = "(I)I")
    private final int method446(int arg0) {
        field864++;
        if ((this.field869 & 0x4) != 0) {
            return 36160;
        } else if ((this.field869 & 0x2) == 0) {
            return (this.field869 & 0x1) == arg0 ? -1 : 36008;
        } else {
            return 36009;
        }
    }

    @OriginalMember(owner = "client!aea", name = "a", descriptor = "(ILob;BI)V")
    private final void method447(int arg0, class629 arg1, byte arg2, int arg3) {
        field859++;
        if (this.field861 == -1) {
            throw new RuntimeException();
        }
        int var5 = 0x1 << arg0;
        int var6 = -63 / ((-arg2 - 32) / 35);
        if ((this.field857 & ~var5) == 0) {
            this.field860 = arg1.field9202;
            this.field863 = arg1.field9198;
        } else if (this.field860 != arg1.field9202 || this.field863 != arg1.field9198) {
            throw new RuntimeException();
        }
        arg1.method3663(this.field861, class246.field3417[arg0], arg3, false);
        this.field883[arg0] = arg1;
        this.field857 |= var5;
    }

    @OriginalMember(owner = "client!aea", name = "d", descriptor = "(I)Z")
    public final boolean method448(int arg0) {
        field856++;
        int var2 = OpenGL.glCheckFramebufferStatusEXT(this.field861);
        if (var2 == 36053) {
            return arg0 <= -52;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!aea", name = "a", descriptor = "(Lfda;II)V")
    public final void method449(class267 arg0, int arg1, int arg2) {
        field875++;
        if (this.field861 == -1) {
            throw new RuntimeException();
        }
        int var4 = 0x1 << arg2;
        if ((~var4 & this.field857) == 0) {
            this.field860 = arg0.field3745;
            this.field863 = arg0.field3746;
        } else if (this.field860 != arg0.field3745 || this.field863 != arg0.field3746) {
            throw new RuntimeException();
        }
        if (arg1 == 24029) {
            arg0.method1747(this.field861, class246.field3417[arg2], false);
            this.field883[arg2] = arg0;
            this.field857 |= var4;
        }
    }

    @OriginalMember(owner = "client!aea", name = "e", descriptor = "(B)I")
    public final int method450(byte arg0) {
        field881++;
        return arg0 == 63 ? this.field863 : 23;
    }

    @OriginalMember(owner = "client!aea", name = "c", descriptor = "(B)V")
    public final void method451(byte arg0) {
        if (arg0 > -118) {
            this.field861 = 61;
        }
        OpenGL.glBindFramebufferEXT(36008, this.field868);
        field873++;
        this.field869 |= 0x1;
        this.field861 = this.method446(0);
    }

    @OriginalMember(owner = "client!aea", name = "a", descriptor = "(BI)V")
    public final void method452(byte arg0, int arg1) {
        field876++;
        int var3 = 100 % ((arg0 - 29) / 33);
        if (this.field883[arg1] != null) {
            this.field883[arg1].method1220((byte) 73);
        }
        this.field857 &= ~(0x1 << arg1);
        this.field883[arg1] = null;
    }

    @OriginalMember(owner = "client!aea", name = "c", descriptor = "(II)V")
    public final void method453(int arg0, int arg1) {
        field862++;
        if (this.field861 == -1) {
            throw new RuntimeException();
        }
        if (arg0 < 32) {
            this.method437(-92);
        }
        OpenGL.glDrawBuffer(class246.field3417[arg1]);
    }

    @OriginalMember(owner = "client!aea", name = "<init>", descriptor = "(Lgi;)V")
    public class45(class583 arg0) {
        if (!arg0.field8306) {
            throw new IllegalStateException("");
        }
        this.field853 = arg0;
        OpenGL.glGenFramebuffersEXT(1, class14.field201, 0);
        this.field868 = class14.field201[0];
    }
}
