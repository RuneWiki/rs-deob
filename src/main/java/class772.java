import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hha")
public class class772 implements class343 {

    @OriginalMember(owner = "client!hha", name = "j", descriptor = "I")
    private int field10621 = -1;

    @OriginalMember(owner = "client!hha", name = "o", descriptor = "I")
    private int field10626 = 0;

    @OriginalMember(owner = "client!hha", name = "v", descriptor = "[Lci;")
    private class720[] field10633 = new class720[9];

    @OriginalMember(owner = "client!hha", name = "B", descriptor = "Lpq;")
    private class194 field10639;

    @OriginalMember(owner = "client!hha", name = "u", descriptor = "I")
    private int field10632;

    @OriginalMember(owner = "client!hha", name = "w", descriptor = "[[I")
    public static int[][] field10634 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12, 12, 5 }, { 5, 5, 1, 1 }, { 5, 1, 1, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 12, 12, 12, 12, 12 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 3, 1, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 7, 3, 7 }, { 12, 12, 12, 12 } };

    @OriginalMember(owner = "client!hha", name = "a", descriptor = "I")
    public static int field10612;

    @OriginalMember(owner = "client!hha", name = "b", descriptor = "I")
    public static int field10613;

    @OriginalMember(owner = "client!hha", name = "c", descriptor = "I")
    public static int field10614;

    @OriginalMember(owner = "client!hha", name = "d", descriptor = "I")
    public static int field10615;

    @OriginalMember(owner = "client!hha", name = "e", descriptor = "I")
    public static int field10616;

    @OriginalMember(owner = "client!hha", name = "f", descriptor = "I")
    public static int field10617;

    @OriginalMember(owner = "client!hha", name = "g", descriptor = "I")
    public static int field10618;

    @OriginalMember(owner = "client!hha", name = "h", descriptor = "I")
    private int field10619;

    @OriginalMember(owner = "client!hha", name = "i", descriptor = "I")
    public static int field10620;

    @OriginalMember(owner = "client!hha", name = "k", descriptor = "I")
    public static int field10622;

    @OriginalMember(owner = "client!hha", name = "l", descriptor = "I")
    public static int field10623;

    @OriginalMember(owner = "client!hha", name = "m", descriptor = "I")
    public static int field10624;

    @OriginalMember(owner = "client!hha", name = "n", descriptor = "I")
    public static int field10625;

    @OriginalMember(owner = "client!hha", name = "p", descriptor = "I")
    public static int field10627;

    @OriginalMember(owner = "client!hha", name = "q", descriptor = "I")
    public static int field10628;

    @OriginalMember(owner = "client!hha", name = "r", descriptor = "I")
    private int field10629;

    @OriginalMember(owner = "client!hha", name = "s", descriptor = "I")
    public static int field10630;

    @OriginalMember(owner = "client!hha", name = "t", descriptor = "I")
    public static int field10631;

    @OriginalMember(owner = "client!hha", name = "x", descriptor = "I")
    public static int field10635;

    @OriginalMember(owner = "client!hha", name = "y", descriptor = "I")
    public static int field10636;

    @OriginalMember(owner = "client!hha", name = "z", descriptor = "I")
    private int field10637;

    @OriginalMember(owner = "client!hha", name = "A", descriptor = "I")
    public static int field10638;

    @OriginalMember(owner = "client!hha", name = "b", descriptor = "(I)V")
    public final void method2174(int arg0) {
        field10636++;
        OpenGL.glBindFramebufferEXT(36009, 0);
        if (arg0 != -5104) {
            this.field10632 = 103;
        }
        this.field10626 &= 0xFFFFFFFD;
        this.field10621 = this.method4264(2);
    }

    @OriginalMember(owner = "client!hha", name = "a", descriptor = "(II)V")
    public final void method4257(int arg0, int arg1) {
        field10614++;
        if (~this.field10621 == arg0) {
            throw new RuntimeException();
        }
        OpenGL.glReadBuffer(class246.field3633[arg1]);
    }

    @OriginalMember(owner = "client!hha", name = "b", descriptor = "(Z)V")
    public final void method2175(boolean arg0) {
        field10638++;
        if (arg0) {
            this.method4268((byte) 17, -1);
        }
        OpenGL.glBindFramebufferEXT(36160, this.field10632);
        this.field10626 |= 0x4;
        this.field10621 = this.method4264(2);
    }

    @OriginalMember(owner = "client!hha", name = "a", descriptor = "(Z)V")
    public final void method2173(boolean arg0) {
        field10613++;
        if (!arg0) {
            OpenGL.glBindFramebufferEXT(36008, 0);
            this.field10626 &= 0xFFFFFFFE;
            this.field10621 = this.method4264(2);
        }
    }

    @OriginalMember(owner = "client!hha", name = "c", descriptor = "(Z)V")
    public static void method4258(boolean arg0) {
        field10634 = null;
        if (arg0) {
            method4265((byte) 59, 32, null);
        }
    }

    @OriginalMember(owner = "client!hha", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.field10639.method1222(78, this.field10632);
        field10612++;
        super.finalize();
    }

    @OriginalMember(owner = "client!hha", name = "a", descriptor = "(BI)V")
    public final void method4259(byte arg0, int arg1) {
        field10617++;
        if (this.field10621 == -1) {
            throw new RuntimeException();
        }
        OpenGL.glDrawBuffer(class246.field3633[arg1]);
        if (arg0 <= 48) {
            this.method4257(-95, 29);
        }
    }

    @OriginalMember(owner = "client!hha", name = "a", descriptor = "(ILrq;I)V")
    public final void method4260(int arg0, class470 arg1, int arg2) {
        field10618++;
        int var4 = 87 % ((arg0 - 35) / 33);
        this.method4261(arg2, arg1, 0, (byte) 104);
    }

    @OriginalMember(owner = "client!hha", name = "a", descriptor = "(ILrq;IB)V")
    private final void method4261(int arg0, class470 arg1, int arg2, byte arg3) {
        field10623++;
        if (this.field10621 == -1) {
            throw new RuntimeException();
        }
        int var5 = 0x1 << arg0;
        int var6 = 45 / (-arg3 / 52);
        if ((~var5 & this.field10637) == 0) {
            this.field10619 = arg1.field6516;
            this.field10629 = arg1.field6517;
        } else if (this.field10629 != arg1.field6517 || this.field10619 != arg1.field6516) {
            throw new RuntimeException();
        }
        arg1.method2803(class246.field3633[arg0], true, this.field10621, arg2);
        this.field10633[arg0] = arg1;
        this.field10637 |= var5;
    }

    @OriginalMember(owner = "client!hha", name = "a", descriptor = "(IILkk;)V")
    public final void method4262(int arg0, int arg1, class265 arg2) {
        field10631++;
        if (this.field10621 == -1) {
            throw new RuntimeException();
        }
        int var4 = 0x1 << arg0;
        if ((~var4 & this.field10637) == 0) {
            this.field10619 = arg2.field3858;
            this.field10629 = arg2.field3856;
        } else if (this.field10629 != arg2.field3856 || this.field10619 != arg2.field3858) {
            throw new RuntimeException();
        }
        int var5 = -10 % ((arg1 + 57) / 61);
        arg2.method1736(this.field10621, (byte) 103, class246.field3633[arg0]);
        this.field10633[arg0] = arg2;
        this.field10637 |= var4;
    }

    @OriginalMember(owner = "client!hha", name = "a", descriptor = "(IILjka;II)V")
    private final void method4263(int arg0, int arg1, class734 arg2, int arg3, int arg4) {
        field10622++;
        if (this.field10621 == -1) {
            throw new RuntimeException();
        }
        int var6 = 0x1 << arg0;
        if ((this.field10637 & ~var6) == 0) {
            this.field10629 = arg2.field10118;
            this.field10619 = arg2.field10118;
        } else if (this.field10629 != arg2.field10118 || this.field10619 != arg2.field10118) {
            throw new RuntimeException();
        }
        int var7 = 116 % ((arg3 - 26) / 59);
        arg2.method4079(arg4, this.field10621, (byte) 0, class246.field3633[arg0], arg1);
        this.field10633[arg0] = arg2;
        this.field10637 |= var6;
    }

    @OriginalMember(owner = "client!hha", name = "a", descriptor = "(I)V")
    public final void method2172(int arg0) {
        field10625++;
        if (arg0 >= 72) {
            OpenGL.glBindFramebufferEXT(36160, 0);
            this.field10626 &= 0xFFFFFFFB;
            this.field10621 = this.method4264(2);
        }
    }

    @OriginalMember(owner = "client!hha", name = "c", descriptor = "(I)I")
    private final int method4264(int arg0) {
        field10616++;
        if ((this.field10626 & 0x4) != 0) {
            return 36160;
        } else if ((arg0 & this.field10626) == 0) {
            return (this.field10626 & 0x1) == 0 ? -1 : 36008;
        } else {
            return 36009;
        }
    }

    @OriginalMember(owner = "client!hha", name = "a", descriptor = "(B)V")
    public final void method2176(byte arg0) {
        OpenGL.glBindFramebufferEXT(36008, this.field10632);
        field10628++;
        this.field10626 |= 0x1;
        this.field10621 = this.method4264(2);
        if (arg0 >= -22) {
            this.method2174(39);
        }
    }

    @OriginalMember(owner = "client!hha", name = "a", descriptor = "(BI[Lsha;)V")
    public static final void method4265(byte arg0, int arg1, class115[] arg2) {
        field10620++;
        for (int var3 = 0; var3 < arg2.length; var3++) {
            class115 var4 = arg2[var3];
            if (var4 != null) {
                if (var4.field1564 == 0) {
                    if (var4.field1394 != null) {
                        method4265((byte) -128, arg1, var4.field1394);
                    }
                    class610 var5 = (class610) class278.field3993.method3669(false, (long) var4.field1446);
                    if (var5 != null) {
                        class748.method4145(arg1, var5.field8600, 1);
                    }
                }
                if (arg1 == 0 && var4.field1447 != null) {
                    class114 var6 = new class114();
                    var6.field1378 = var4;
                    var6.field1384 = var4.field1447;
                    class700.method3959(var6);
                }
                if (arg1 == 1 && var4.field1491 != null) {
                    if (var4.field1482 >= 0) {
                        class115 var7 = class384.method2387(false, var4.field1446);
                        if (var7 == null || var7.field1394 == null || var4.field1482 >= var7.field1394.length || var7.field1394[var4.field1482] != var4) {
                            continue;
                        }
                    }
                    class114 var8 = new class114();
                    var8.field1378 = var4;
                    var8.field1384 = var4.field1491;
                    class700.method3959(var8);
                }
            }
        }
        if (arg0 >= -94) {
            field10634 = null;
        }
    }

    @OriginalMember(owner = "client!hha", name = "c", descriptor = "(B)Z")
    public final boolean method4266(byte arg0) {
        field10627++;
        int var2 = OpenGL.glCheckFramebufferStatusEXT(this.field10621);
        if (var2 == 36053) {
            if (arg0 <= 83) {
                this.field10633 = null;
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!hha", name = "a", descriptor = "(ILjka;IB)V")
    public final void method4267(int arg0, class734 arg1, int arg2, byte arg3) {
        field10615++;
        this.method4263(arg2, 0, arg1, -38, arg0);
        if (arg3 != -82) {
            this.field10632 = -101;
        }
    }

    @OriginalMember(owner = "client!hha", name = "b", descriptor = "(BI)V")
    public final void method4268(byte arg0, int arg1) {
        field10635++;
        int var3 = -34 % ((arg0 + 52) / 49);
        if (this.field10633[arg1] != null) {
            this.field10633[arg1].method1737(0);
        }
        this.field10637 &= ~(0x1 << arg1);
        this.field10633[arg1] = null;
    }

    @OriginalMember(owner = "client!hha", name = "b", descriptor = "(B)V")
    public final void method2177(byte arg0) {
        OpenGL.glBindFramebufferEXT(36009, this.field10632);
        if (arg0 > -80) {
            method4269(25, -15, null);
        }
        field10624++;
        this.field10626 |= 0x2;
        this.field10621 = this.method4264(2);
    }

    @OriginalMember(owner = "client!hha", name = "<init>", descriptor = "(Lpq;)V")
    public class772(class194 arg0) {
        if (!arg0.field2695) {
            throw new IllegalStateException("");
        }
        this.field10639 = arg0;
        OpenGL.glGenFramebuffersEXT(1, class301.field4372, 0);
        this.field10632 = class301.field4372[0];
    }

    @OriginalMember(owner = "client!hha", name = "a", descriptor = "(IILae;)Lho;")
    public static final class318 method4269(int arg0, int arg1, class283 arg2) {
        field10630++;
        class318 var3 = (class318) class31.field299.method312(0, (long) arg1);
        if (arg0 != 12) {
            return null;
        }
        if (var3 == null) {
            if (class352.field5104) {
                var3 = class111.field1332.method192(class279.method1811(arg2, arg1), true);
            } else {
                var3 = class84.method642((byte) -124, arg2.method1854(0, arg1));
            }
            class31.field299.method305(var3, (long) arg1, arg0 ^ 0x479C);
        }
        return var3;
    }
}
