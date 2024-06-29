import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rq")
public class class323 implements class579 {

    @OriginalMember(owner = "client!rq", name = "h", descriptor = "I")
    private int field4724 = 0;

    @OriginalMember(owner = "client!rq", name = "p", descriptor = "I")
    private int field4732 = -1;

    @OriginalMember(owner = "client!rq", name = "A", descriptor = "[Ljn;")
    private class670[] field4743 = new class670[9];

    @OriginalMember(owner = "client!rq", name = "s", descriptor = "Lus;")
    private class1 field4735;

    @OriginalMember(owner = "client!rq", name = "j", descriptor = "I")
    private int field4726;

    @OriginalMember(owner = "client!rq", name = "v", descriptor = "Lqfa;")
    public static class85 field4738 = new class85(100, 6);

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "I")
    public static int field4717;

    @OriginalMember(owner = "client!rq", name = "b", descriptor = "I")
    public static int field4718;

    @OriginalMember(owner = "client!rq", name = "c", descriptor = "I")
    public static int field4719;

    @OriginalMember(owner = "client!rq", name = "e", descriptor = "I")
    private int field4721;

    @OriginalMember(owner = "client!rq", name = "f", descriptor = "I")
    public static int field4722;

    @OriginalMember(owner = "client!rq", name = "g", descriptor = "I")
    public static int field4723;

    @OriginalMember(owner = "client!rq", name = "i", descriptor = "I")
    public static int field4725;

    @OriginalMember(owner = "client!rq", name = "k", descriptor = "I")
    public static int field4727;

    @OriginalMember(owner = "client!rq", name = "l", descriptor = "I")
    public static int field4728;

    @OriginalMember(owner = "client!rq", name = "m", descriptor = "I")
    public static int field4729;

    @OriginalMember(owner = "client!rq", name = "n", descriptor = "I")
    public static int field4730;

    @OriginalMember(owner = "client!rq", name = "o", descriptor = "I")
    public static int field4731;

    @OriginalMember(owner = "client!rq", name = "q", descriptor = "I")
    public static int field4733;

    @OriginalMember(owner = "client!rq", name = "r", descriptor = "I")
    public static int field4734;

    @OriginalMember(owner = "client!rq", name = "t", descriptor = "I")
    public static int field4736;

    @OriginalMember(owner = "client!rq", name = "u", descriptor = "I")
    public static int field4737;

    @OriginalMember(owner = "client!rq", name = "w", descriptor = "I")
    public static int field4739;

    @OriginalMember(owner = "client!rq", name = "x", descriptor = "I")
    public static int field4740;

    @OriginalMember(owner = "client!rq", name = "y", descriptor = "I")
    private int field4741;

    @OriginalMember(owner = "client!rq", name = "z", descriptor = "I")
    public static int field4742;

    @OriginalMember(owner = "client!rq", name = "B", descriptor = "I")
    public static int field4744;

    @OriginalMember(owner = "client!rq", name = "C", descriptor = "I")
    public static int field4745;

    @OriginalMember(owner = "client!rq", name = "D", descriptor = "I")
    public static int field4746;

    @OriginalMember(owner = "client!rq", name = "E", descriptor = "I")
    private int field4747;

    @OriginalMember(owner = "client!rq", name = "F", descriptor = "I")
    public static int field4748;

    @OriginalMember(owner = "client!rq", name = "G", descriptor = "I")
    public static int field4749;

    @OriginalMember(owner = "client!rq", name = "d", descriptor = "Lom;")
    public static class344 field4720;

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(II)V")
    public final void method2074(int arg0, int arg1) {
        if (this.field4743[arg0] != null) {
            this.field4743[arg0].method1612(122);
        }
        field4740++;
        if (arg1 > -49) {
            this.field4724 = 82;
        }
        this.field4741 &= ~(0x1 << arg0);
        this.field4743[arg0] = null;
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(ZI)V")
    public final void method2075(boolean arg0, int arg1) {
        field4722++;
        if (this.field4732 == -1) {
            throw new RuntimeException();
        } else if (!arg0) {
            OpenGL.glDrawBuffer(class325.field4768[arg1]);
        }
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(I)V")
    public final void method2076(int arg0) {
        OpenGL.glBindFramebufferEXT(36160, 0);
        if (arg0 <= -44) {
            field4737++;
            this.field4724 &= 0xFFFFFFFB;
            this.field4732 = this.method2094(119);
        }
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(Z)V")
    public final void method2077(boolean arg0) {
        OpenGL.glBindFramebufferEXT(36008, 0);
        if (!arg0) {
            this.field4741 = 57;
        }
        field4717++;
        this.field4724 &= 0xFFFFFFFE;
        this.field4732 = this.method2094(116);
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(IB)V")
    public final void method2078(int arg0, byte arg1) {
        field4733++;
        if (this.field4732 == -1) {
            throw new RuntimeException();
        }
        OpenGL.glReadBuffer(class325.field4768[arg0]);
        if (arg1 <= 43) {
            method2083(null, 77);
        }
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(I[B)Ljava/lang/String;")
    public static final String method2079(int arg0, byte[] arg1) {
        if (arg0 < 31) {
            field4738 = null;
        }
        field4745++;
        int var2 = arg1.length;
        char[] var3 = new char[var2];
        int var4 = 0;
        for (int var5 = 0; var5 < var2; var5++) {
            int var6 = arg1[var5] & 0xFF;
            if (var6 < 128) {
                var3[var4++] = (char) var6;
            } else if (var6 < 194) {
                throw new IllegalArgumentException("Overlong encoding in UTF-8 encoding " + var6);
            } else if (var6 < 224) {
                if (var2 <= var5 + 1) {
                    throw new IllegalArgumentException("Incomplete two-byte sequence at end of UTF-8 encoding");
                }
                var5++;
                int var7 = arg1[var5] & 0xFF;
                if (var7 < 128 || var7 > 191) {
                    throw new IllegalArgumentException("Illegal second byte in two-byte sequence in UTF-8 encoding");
                }
                var3[var4++] = (char) class2.method189(class481.method2919(var7, -129), class481.method2919(var6, -193) << 6);
            } else if (var6 < 240) {
                if (var2 <= var5 + 2) {
                    throw new IllegalArgumentException("Incomplete three-byte sequence at end of UTF-8 encoding");
                }
                var5++;
                int var8 = arg1[var5] & 0xFF;
                if (var8 < 128 || var8 > 191) {
                    throw new IllegalArgumentException("Illegal second byte in three-byte sequence in UTF-8 encoding");
                }
                var5++;
                int var9 = arg1[var5] & 0xFF;
                if (var9 < 128 || var9 > 191) {
                    throw new IllegalArgumentException("Illegal third byte in three-byte sequence in UTF-8 encoding");
                }
                var3[var4++] = (char) class2.method189(class2.method189(class481.method2919(-921600, var6 << 12), class481.method2919(-8256, var8 << 6)), class481.method2919(var9, -129));
            } else if (var6 < 244) {
                throw new IllegalArgumentException("Unsupported four-byte sequence in UTF-8 encoding");
            } else {
                throw new IllegalArgumentException("Illegal first sequence byte in UTF-8 encoding " + var6);
            }
        }
        return new String(var3, 0, var4);
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(ZLqh;)Lti;")
    public static final class409 method2080(boolean arg0, class61 arg1) {
        field4744++;
        String var2 = arg1.method747(14598);
        class320 var3 = class653.method3723(arg0)[arg1.method732(-559537960)];
        class547 var4 = class641.method3657((byte) -128)[arg1.method732(-559537960)];
        int var5 = arg1.method721(-461515024);
        int var6 = arg1.method721(-461515024);
        int var7 = arg1.method732(-559537960);
        int var8 = arg1.method732(-559537960);
        int var9 = arg1.method732(-559537960);
        int var10 = arg1.method723((byte) -25);
        int var11 = arg1.method723((byte) -25);
        int var12 = arg1.method730(-123);
        if (arg0) {
            return null;
        } else {
            int var13 = arg1.method730(92);
            int var14 = arg1.method730(100);
            return new class409(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14);
        }
    }

    @OriginalMember(owner = "client!rq", name = "c", descriptor = "(B)Z")
    public final boolean method2081(byte arg0) {
        field4718++;
        int var2 = OpenGL.glCheckFramebufferStatusEXT(this.field4732);
        int var3 = -110 % ((-arg0 - 26) / 63);
        return var2 == 36053;
    }

    @OriginalMember(owner = "client!rq", name = "b", descriptor = "(B)V")
    public final void method2082(byte arg0) {
        OpenGL.glBindFramebufferEXT(36009, this.field4726);
        field4725++;
        this.field4724 |= 0x2;
        if (arg0 != -29) {
            this.method2087(null, (byte) -92, 52, 11);
        }
        this.field4732 = this.method2094(118);
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(Ljava/lang/String;I)Z")
    public static final boolean method2083(String arg0, int arg1) {
        if (arg1 != 24369) {
            field4738 = null;
        }
        field4734++;
        return class392.method2426((byte) 73, arg0, true, 10);
    }

    @OriginalMember(owner = "client!rq", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.field4735.method14(this.field4726, (byte) -28);
        field4746++;
        super.finalize();
    }

    @OriginalMember(owner = "client!rq", name = "b", descriptor = "(I)V")
    public final void method2084(int arg0) {
        int var2 = 90 / ((80 - arg0) / 44);
        OpenGL.glBindFramebufferEXT(36008, this.field4726);
        field4719++;
        this.field4724 |= 0x1;
        this.field4732 = this.method2094(14);
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(B)V")
    public final void method2085(byte arg0) {
        OpenGL.glBindFramebufferEXT(36009, 0);
        field4728++;
        this.field4724 &= 0xFFFFFFFD;
        this.field4732 = this.method2094(-15);
        if (arg0 > -50) {
            this.field4726 = -128;
        }
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(IIIIII)V")
    public static final void method2086(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field4729++;
        int var6 = 0;
        int var7 = arg0;
        int var8 = arg4 * arg4;
        int var9 = arg0 * arg0;
        if (arg1 < 122) {
            return;
        }
        int var10 = var9 << 1;
        int var11 = var8 << 1;
        int var12 = arg0 << 1;
        int var13 = (1 - var12) * var8 + var10;
        int var14 = var9 - ((var12 - 1) * var11);
        int var15 = var8 << 2;
        int var16 = var9 << 2;
        int var17 = ((var6 << 1) + 3) * var10;
        int var18 = ((arg0 << 1) - 3) * var11;
        int var19 = (var6 + 1) * var16;
        if (class309.field4556 <= arg2 && arg2 <= client.field4115) {
            int var20 = class107.method968(class379.field5612, 120, class704.field9911, arg4 + arg5);
            int var21 = class107.method968(class379.field5612, 125, class704.field9911, arg5 - arg4);
            class705.method3938(var20, arg3, 30336, var21, class582.field8429[arg2]);
        }
        int var22 = (arg0 - 1) * var15;
        while (var7 > 0) {
            if (var13 < 0) {
                while (var13 < 0) {
                    var13 += var17;
                    var14 += var19;
                    var17 += var16;
                    var19 += var16;
                    var6++;
                }
            }
            if (var14 < 0) {
                var13 += var17;
                var14 += var19;
                var17 += var16;
                var19 += var16;
                var6++;
            }
            var14 += -var18;
            var13 += -var22;
            var22 -= var15;
            var7--;
            var18 -= var15;
            int var23 = arg2 - var7;
            int var24 = arg2 + var7;
            if (var24 >= class309.field4556 && client.field4115 >= var23) {
                int var25 = class107.method968(class379.field5612, 122, class704.field9911, arg5 + var6);
                int var26 = class107.method968(class379.field5612, 126, class704.field9911, arg5 - var6);
                if (var23 >= class309.field4556) {
                    class705.method3938(var25, arg3, 30336, var26, class582.field8429[var23]);
                }
                if (client.field4115 >= var24) {
                    class705.method3938(var25, arg3, 30336, var26, class582.field8429[var24]);
                }
            }
        }
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(Lmda;BII)V")
    public final void method2087(class243 arg0, byte arg1, int arg2, int arg3) {
        if (arg1 == -71) {
            field4723++;
            this.method2088(arg2, 0, arg0, arg3, -89);
        }
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(IILmda;II)V")
    private final void method2088(int arg0, int arg1, class243 arg2, int arg3, int arg4) {
        field4727++;
        if (this.field4732 == -1) {
            throw new RuntimeException();
        }
        int var6 = 31 / ((arg4 + 24) / 45);
        int var7 = 0x1 << arg3;
        if ((this.field4741 & ~var7) == 0) {
            this.field4747 = arg2.field3671;
            this.field4721 = arg2.field3671;
        } else if (this.field4721 != arg2.field3671 || this.field4747 != arg2.field3671) {
            throw new RuntimeException();
        }
        arg2.method1610(this.field4732, class325.field4768[arg3], arg0, arg1, 0);
        this.field4743[arg3] = arg2;
        this.field4741 |= var7;
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(Ldb;BI)V")
    public final void method2089(class296 arg0, byte arg1, int arg2) {
        if (arg1 >= 110) {
            this.method2091(0, arg2, arg0, (byte) -68);
            field4742++;
        }
    }

    @OriginalMember(owner = "client!rq", name = "c", descriptor = "(I)V")
    public final void method2090(int arg0) {
        OpenGL.glBindFramebufferEXT(36160, this.field4726);
        field4731++;
        this.field4724 |= 0x4;
        this.field4732 = this.method2094(-81);
        if (arg0 != 29882) {
            field4749 = 16;
        }
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(IILdb;B)V")
    private final void method2091(int arg0, int arg1, class296 arg2, byte arg3) {
        field4739++;
        if (this.field4732 == -1) {
            throw new RuntimeException();
        }
        int var5 = 0x1 << arg1;
        if ((this.field4741 & ~var5) == 0) {
            this.field4721 = arg2.field4431;
            this.field4747 = arg2.field4441;
        } else if (this.field4721 != arg2.field4431 || this.field4747 != arg2.field4441) {
            throw new RuntimeException();
        }
        arg2.method1966(arg0, class325.field4768[arg1], this.field4732, 20123);
        if (arg3 > -17) {
            field4749 = 78;
        }
        this.field4743[arg1] = arg2;
        this.field4741 |= var5;
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(IIIIIBI)V")
    public static final void method2092(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6) {
        class74.method800((byte) 45, arg6);
        field4748++;
        int var7 = 0;
        int var8 = arg6 - arg4;
        if (var8 < 0) {
            var8 = 0;
        }
        if (arg5 != -3) {
            return;
        }
        int var9 = arg6;
        int var10 = -arg6;
        int var11 = var8;
        int var12 = -var8;
        int var13 = -1;
        int var14 = -1;
        int[] var15 = class582.field8429[arg3];
        int var16 = arg0 - var8;
        int var17 = arg0 + var8;
        class705.method3938(var16, arg1, 30336, arg0 - arg6, var15);
        class705.method3938(var17, arg2, 30336, var16, var15);
        class705.method3938(arg0 + arg6, arg1, 30336, var17, var15);
        while (var7 < var9) {
            var13 += 2;
            var14 += 2;
            var10 += var13;
            var12 += var14;
            if (var12 >= 0 && var11 >= 1) {
                class486.field6950[var11] = var7;
                var11--;
                var12 -= var11 << 1;
            }
            var7++;
            if (var10 >= 0) {
                var9--;
                var10 -= var9 << 1;
                if (var9 < var8) {
                    int[] var18 = class582.field8429[arg3 + var9];
                    int[] var19 = class582.field8429[arg3 - var9];
                    int var20 = class486.field6950[var9];
                    int var21 = arg0 + var7;
                    int var22 = arg0 - var7;
                    int var23 = arg0 + var20;
                    int var24 = arg0 - var20;
                    class705.method3938(var24, arg1, 30336, var22, var18);
                    class705.method3938(var23, arg2, 30336, var24, var18);
                    class705.method3938(var21, arg1, arg5 ^ 0xFFFF897D, var23, var18);
                    class705.method3938(var24, arg1, 30336, var22, var19);
                    class705.method3938(var23, arg2, arg5 ^ 0xFFFF897D, var24, var19);
                    class705.method3938(var21, arg1, 30336, var23, var19);
                } else {
                    int[] var25 = class582.field8429[arg3 + var9];
                    int[] var26 = class582.field8429[arg3 - var9];
                    int var27 = arg0 + var7;
                    int var28 = arg0 - var7;
                    class705.method3938(var27, arg1, 30336, var28, var25);
                    class705.method3938(var27, arg1, 30336, var28, var26);
                }
            }
            int[] var29 = class582.field8429[arg3 + var7];
            int[] var30 = class582.field8429[arg3 - var7];
            int var31 = arg0 + var9;
            int var32 = arg0 - var9;
            if (var8 <= var7) {
                class705.method3938(var31, arg1, 30336, var32, var29);
                class705.method3938(var31, arg1, arg5 ^ 0xFFFF897D, var32, var30);
            } else {
                int var33 = var7 <= var11 ? var11 : class486.field6950[var7];
                int var34 = arg0 + var33;
                int var35 = arg0 - var33;
                class705.method3938(var35, arg1, arg5 ^ 0xFFFF897D, var32, var29);
                class705.method3938(var34, arg2, 30336, var35, var29);
                class705.method3938(var31, arg1, arg5 + 30339, var34, var29);
                class705.method3938(var35, arg1, 30336, var32, var30);
                class705.method3938(var34, arg2, 30336, var35, var30);
                class705.method3938(var31, arg1, arg5 + 30339, var34, var30);
            }
        }
    }

    @OriginalMember(owner = "client!rq", name = "d", descriptor = "(I)V")
    public static void method2093(int arg0) {
        field4720 = null;
        field4738 = null;
        if (arg0 < 114) {
            method2079(-34, null);
        }
    }

    @OriginalMember(owner = "client!rq", name = "e", descriptor = "(I)I")
    private final int method2094(int arg0) {
        int var2 = 58 % ((arg0 - 64) / 50);
        field4730++;
        if ((this.field4724 & 0x4) != 0) {
            return 36160;
        } else if ((this.field4724 & 0x2) == 0) {
            return (this.field4724 & 0x1) == 0 ? -1 : 36008;
        } else {
            return 36009;
        }
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(BILht;)V")
    public final void method2095(byte arg0, int arg1, class540 arg2) {
        field4736++;
        if (this.field4732 == -1) {
            throw new RuntimeException();
        }
        if (arg0 != -9) {
            method2083(null, -89);
        }
        int var4 = 0x1 << arg1;
        if ((~var4 & this.field4741) == 0) {
            this.field4747 = arg2.field7548;
            this.field4721 = arg2.field7552;
        } else if (this.field4721 != arg2.field7552 || this.field4747 != arg2.field7548) {
            throw new RuntimeException();
        }
        arg2.method3116(class325.field4768[arg1], this.field4732, 36161);
        this.field4743[arg1] = arg2;
        this.field4741 |= var4;
    }

    @OriginalMember(owner = "client!rq", name = "<init>", descriptor = "(Lus;)V")
    public class323(class1 arg0) {
        if (!arg0.field278) {
            throw new IllegalStateException("");
        }
        this.field4735 = arg0;
        OpenGL.glGenFramebuffersEXT(1, class425.field6137, 0);
        this.field4726 = class425.field6137[0];
    }
}
