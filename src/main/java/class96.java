import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mg")
public class class96 implements class118 {

    @OriginalMember(owner = "client!mg", name = "d", descriptor = "[Lbv;")
    private class192[] field1708 = new class192[9];

    @OriginalMember(owner = "client!mg", name = "m", descriptor = "I")
    private int field1717 = 0;

    @OriginalMember(owner = "client!mg", name = "e", descriptor = "I")
    private int field1709 = -1;

    @OriginalMember(owner = "client!mg", name = "w", descriptor = "Lbl;")
    private class442 field1727;

    @OriginalMember(owner = "client!mg", name = "y", descriptor = "I")
    private int field1729;

    @OriginalMember(owner = "client!mg", name = "c", descriptor = "[I")
    public static int[] field1707 = new int[2];

    @OriginalMember(owner = "client!mg", name = "A", descriptor = "Loe;")
    public static class127 field1731 = new class127(80, 6);

    @OriginalMember(owner = "client!mg", name = "I", descriptor = "[F")
    public static float[] field1738 = new float[4];

    @OriginalMember(owner = "client!mg", name = "K", descriptor = "Lsk;")
    public static class423 field1740 = new class423("M", "M", "M", "M");

    @OriginalMember(owner = "client!mg", name = "N", descriptor = "[I")
    public static int[] field1743 = new int[64];

    @OriginalMember(owner = "client!mg", name = "M", descriptor = "Z")
    public static boolean field1742 = false;

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "I")
    public static int field1705;

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "I")
    public static int field1706;

    @OriginalMember(owner = "client!mg", name = "f", descriptor = "I")
    private int field1710;

    @OriginalMember(owner = "client!mg", name = "g", descriptor = "I")
    private int field1711;

    @OriginalMember(owner = "client!mg", name = "h", descriptor = "I")
    public static int field1712;

    @OriginalMember(owner = "client!mg", name = "i", descriptor = "I")
    public static int field1713;

    @OriginalMember(owner = "client!mg", name = "j", descriptor = "I")
    public static int field1714;

    @OriginalMember(owner = "client!mg", name = "k", descriptor = "I")
    public static int field1715;

    @OriginalMember(owner = "client!mg", name = "l", descriptor = "I")
    public static int field1716;

    @OriginalMember(owner = "client!mg", name = "n", descriptor = "I")
    private int field1718;

    @OriginalMember(owner = "client!mg", name = "o", descriptor = "I")
    public static int field1719;

    @OriginalMember(owner = "client!mg", name = "p", descriptor = "I")
    public static int field1720;

    @OriginalMember(owner = "client!mg", name = "q", descriptor = "I")
    public static int field1721;

    @OriginalMember(owner = "client!mg", name = "r", descriptor = "I")
    public static int field1722;

    @OriginalMember(owner = "client!mg", name = "s", descriptor = "I")
    public static int field1723;

    @OriginalMember(owner = "client!mg", name = "t", descriptor = "I")
    public static int field1724;

    @OriginalMember(owner = "client!mg", name = "u", descriptor = "I")
    public static int field1725;

    @OriginalMember(owner = "client!mg", name = "v", descriptor = "I")
    public static int field1726;

    @OriginalMember(owner = "client!mg", name = "x", descriptor = "I")
    public static int field1728;

    @OriginalMember(owner = "client!mg", name = "z", descriptor = "I")
    public static int field1730;

    @OriginalMember(owner = "client!mg", name = "B", descriptor = "I")
    public static int field1732;

    @OriginalMember(owner = "client!mg", name = "C", descriptor = "I")
    public static int field1733;

    @OriginalMember(owner = "client!mg", name = "D", descriptor = "I")
    public static int field1734;

    @OriginalMember(owner = "client!mg", name = "E", descriptor = "I")
    public static int field1735;

    @OriginalMember(owner = "client!mg", name = "F", descriptor = "I")
    public static int field1736;

    @OriginalMember(owner = "client!mg", name = "H", descriptor = "I")
    public static int field1737;

    @OriginalMember(owner = "client!mg", name = "L", descriptor = "Lda;")
    public static class41 field1741;

    @OriginalMember(owner = "client!mg", name = "J", descriptor = "[I")
    public static int[] field1739;

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(II)Loa;", line = 10)
    public static final class471 method714(int arg0, int arg1) {
        if (arg1 != 0) {
            method714(90, 56);
        }
        field1726++;
        return class239.field3611 && class407.field5905 <= arg0 && arg0 <= class506.field7648 ? class105.field1838[arg0 - class407.field5905] : null;
    }

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "(II)V", line = 31)
    public final void method715(int arg0, int arg1) {
        int var3 = -94 / ((21 - arg1) / 53);
        field1737++;
        if (this.field1709 == -1) {
            throw new RuntimeException();
        }
        OpenGL.glDrawBuffer(class330.field4944[arg0]);
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(BI)V", line = 47)
    public static final void method716(byte arg0, int arg1) {
        if (arg0 != 113) {
            field1738 = null;
        }
        field1733++;
        class288 var2 = class475.field7250;
        synchronized (class475.field7250) {
            class475.field7250.method1760(arg1, 30398);
        }
    }

    @OriginalMember(owner = "client!mg", name = "c", descriptor = "(II)V", line = 64)
    public final void method717(int arg0, int arg1) {
        field1722++;
        int var3 = 39 % ((31 - arg1) / 34);
        if (this.field1709 == -1) {
            throw new RuntimeException();
        }
        OpenGL.glReadBuffer(class330.field4944[arg0]);
    }

    @OriginalMember(owner = "client!mg", name = "f", descriptor = "(I)I", line = 78)
    public final int method718(int arg0) {
        if (arg0 == -19567) {
            field1734++;
            return this.field1718;
        } else {
            return -30;
        }
    }

    @OriginalMember(owner = "client!mg", name = "g", descriptor = "(I)Z", line = 89)
    public final boolean method719(int arg0) {
        field1713++;
        if (arg0 != -1) {
            method730(120, -41, -20, 108, 105, -62, -80);
        }
        int var2 = OpenGL.glCheckFramebufferStatusEXT(this.field1709);
        return var2 == 36053;
    }

    @OriginalMember(owner = "client!mg", name = "e", descriptor = "(I)V", line = 112)
    public final void method720(int arg0) {
        OpenGL.glBindFramebufferEXT(36009, this.field1729);
        field1725++;
        if (arg0 <= -123) {
            this.field1717 |= 0x2;
            this.field1709 = this.method732((byte) 107);
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(IIIZII)V", line = 126)
    public static final void method721(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        if (arg3) {
            method714(44, -92);
        }
        if (arg4 <= class478.field7310 && arg0 >= class248.field3808) {
            boolean var6;
            if (class355.field5296 > arg1) {
                arg1 = class355.field5296;
                var6 = false;
            } else if (class320.field4818 >= arg1) {
                var6 = true;
            } else {
                var6 = false;
                arg1 = class320.field4818;
            }
            boolean var7;
            if (class355.field5296 > arg2) {
                var7 = false;
                arg2 = class355.field5296;
            } else if (class320.field4818 < arg2) {
                var7 = false;
                arg2 = class320.field4818;
            } else {
                var7 = true;
            }
            if (class248.field3808 <= arg4) {
                class78.method566(class69.field1212[arg4++], arg2, arg5, -7, arg1);
            } else {
                arg4 = class248.field3808;
            }
            if (arg0 > class478.field7310) {
                arg0 = class478.field7310;
            } else {
                class78.method566(class69.field1212[arg0--], arg2, arg5, -7, arg1);
            }
            if (var6 && var7) {
                for (int var8 = arg4; var8 <= arg0; var8++) {
                    int[] var9 = class69.field1212[var8];
                    var9[arg1] = var9[arg2] = arg5;
                }
            } else if (var6) {
                for (int var10 = arg4; var10 <= arg0; var10++) {
                    class69.field1212[var10][arg1] = arg5;
                }
            } else if (var7) {
                for (int var11 = arg4; var11 <= arg0; var11++) {
                    class69.field1212[var11][arg2] = arg5;
                }
            }
        }
        field1716++;
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(IILsg;I)V", line = 230)
    private final void method722(int arg0, int arg1, class262 arg2, int arg3) {
        field1724++;
        if (this.field1709 == arg0) {
            throw new RuntimeException();
        }
        int var5 = 0x1 << arg3;
        if ((this.field1711 & ~var5) == 0) {
            this.field1710 = arg2.field3970;
            this.field1718 = arg2.field3968;
        } else if (this.field1710 != arg2.field3970 || this.field1718 != arg2.field3968) {
            throw new RuntimeException();
        }
        arg2.method1592(class330.field4944[arg3], this.field1709, 125, arg1);
        this.field1708[arg3] = arg2;
        this.field1711 |= var5;
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(B)V", line = 259)
    public final void method723(byte arg0) {
        OpenGL.glBindFramebufferEXT(36008, 0);
        if (arg0 >= -33) {
            this.method731(24, -71, (byte) 11, null, 21);
        }
        field1730++;
        this.field1717 &= 0xFFFFFFFE;
        this.field1709 = this.method732((byte) 112);
    }

    @OriginalMember(owner = "client!mg", name = "<init>", descriptor = "(Lbl;)V", line = 615)
    public class96(class442 arg0) {
        if (!arg0.field6802) {
            throw new IllegalStateException("");
        }
        this.field1727 = arg0;
        OpenGL.glGenFramebuffersEXT(1, class272.field4134, 0);
        this.field1729 = class272.field4134[0];
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(IILsg;)V", line = 275)
    public final void method724(int arg0, int arg1, class262 arg2) {
        this.method722(arg0 ^ 0xFFFFFFFB, 0, arg2, arg1);
        if (arg0 != 4) {
            field1731 = null;
        }
        field1714++;
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(I)V", line = 287)
    public final void method725(int arg0) {
        field1719++;
        OpenGL.glBindFramebufferEXT(36009, 0);
        if (arg0 >= -75) {
            this.method736(86);
        }
        this.field1717 &= 0xFFFFFFFD;
        this.field1709 = this.method732((byte) 114);
    }

    @OriginalMember(owner = "client!mg", name = "d", descriptor = "(I)V", line = 304)
    public final void method726(int arg0) {
        field1721++;
        OpenGL.glBindFramebufferEXT(36008, this.field1729);
        this.field1717 |= 0x1;
        if (arg0 != -27445) {
            this.method725(109);
        }
        this.field1709 = this.method732((byte) 112);
    }

    @OriginalMember(owner = "client!mg", name = "finalize", descriptor = "()V", line = 317)
    protected final void finalize() throws Throwable {
        field1712++;
        this.field1727.method2641(-15966, this.field1729);
        super.finalize();
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(Lkd;IZ)V", line = 329)
    public final void method727(class177 arg0, int arg1, boolean arg2) {
        field1728++;
        if (this.field1709 == -1) {
            throw new RuntimeException();
        }
        int var4 = 0x1 << arg1;
        if ((~var4 & this.field1711) == 0) {
            this.field1718 = arg0.field2779;
            this.field1710 = arg0.field2778;
        } else if (this.field1710 != arg0.field2778 || this.field1718 != arg0.field2779) {
            throw new RuntimeException();
        }
        arg0.method1112(this.field1709, arg2, class330.field4944[arg1]);
        this.field1708[arg1] = arg0;
        this.field1711 |= var4;
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(ZI)V", line = 360)
    public final void method728(boolean arg0, int arg1) {
        field1723++;
        if (arg0) {
            method733(null, (byte) 75, -24, null, null, -49, -21, null);
        }
        if (this.field1708[arg1] != null) {
            this.field1708[arg1].method1111((byte) -128);
        }
        this.field1711 &= ~(0x1 << arg1);
        this.field1708[arg1] = null;
    }

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "(B)V", line = 379)
    public static void method729(byte arg0) {
        field1739 = null;
        field1731 = null;
        if (arg0 >= -84) {
            return;
        }
        field1743 = null;
        field1740 = null;
        field1741 = null;
        field1738 = null;
        field1707 = null;
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(IIIIIII)V", line = 395)
    public static final void method730(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class461.method2755(false, arg6);
        field1706++;
        int var7 = 0;
        int var8 = arg6 - arg4;
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = arg6;
        if (arg2 > -17) {
            return;
        }
        int var10 = -arg6;
        int var11 = var8;
        int var12 = -var8;
        int var13 = -1;
        int var14 = -1;
        int[] var15 = class69.field1212[arg1];
        int var16 = arg3 - var8;
        class78.method566(var15, var16, arg5, -7, arg3 - arg6);
        int var17 = arg3 + var8;
        class78.method566(var15, var17, arg0, -7, var16);
        class78.method566(var15, arg3 + arg6, arg5, -7, var17);
        while (var7 < var9) {
            var13 += 2;
            var14 += 2;
            var12 += var14;
            var10 += var13;
            if (var12 >= 0 && var11 >= 1) {
                class276.field4181[var11] = var7;
                var11--;
                var12 -= var11 << 1;
            }
            var7++;
            if (var10 >= 0) {
                var9--;
                var10 -= var9 << 1;
                if (var8 > var9) {
                    int[] var18 = class69.field1212[arg1 + var9];
                    int[] var19 = class69.field1212[arg1 - var9];
                    int var20 = class276.field4181[var9];
                    int var21 = arg3 + var7;
                    int var22 = arg3 - var7;
                    int var23 = arg3 + var20;
                    int var24 = arg3 - var20;
                    class78.method566(var18, var24, arg5, -7, var22);
                    class78.method566(var18, var23, arg0, -7, var24);
                    class78.method566(var18, var21, arg5, -7, var23);
                    class78.method566(var19, var24, arg5, -7, var22);
                    class78.method566(var19, var23, arg0, -7, var24);
                    class78.method566(var19, var21, arg5, -7, var23);
                } else {
                    int[] var25 = class69.field1212[arg1 + var9];
                    int[] var26 = class69.field1212[arg1 - var9];
                    int var27 = arg3 + var7;
                    int var28 = arg3 - var7;
                    class78.method566(var25, var27, arg5, -7, var28);
                    class78.method566(var26, var27, arg5, -7, var28);
                }
            }
            int[] var29 = class69.field1212[arg1 + var7];
            int[] var30 = class69.field1212[arg1 - var7];
            int var31 = arg3 + var9;
            int var32 = arg3 - var9;
            if (var7 >= var8) {
                class78.method566(var29, var31, arg5, -7, var32);
                class78.method566(var30, var31, arg5, -7, var32);
            } else {
                int var33 = var11 < var7 ? class276.field4181[var7] : var11;
                int var34 = arg3 + var33;
                int var35 = arg3 - var33;
                class78.method566(var29, var35, arg5, -7, var32);
                class78.method566(var29, var34, arg0, -7, var35);
                class78.method566(var29, var31, arg5, -7, var34);
                class78.method566(var30, var35, arg5, -7, var32);
                class78.method566(var30, var34, arg0, -7, var35);
                class78.method566(var30, var31, arg5, -7, var34);
            }
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(IIBLsl;I)V", line = 526)
    private final void method731(int arg0, int arg1, byte arg2, class304 arg3, int arg4) {
        field1732++;
        if (this.field1709 == -1) {
            throw new RuntimeException();
        }
        if (arg2 <= 49) {
            method714(-125, -86);
        }
        int var6 = 0x1 << arg0;
        if ((~var6 & this.field1711) == 0) {
            this.field1710 = arg3.field4618;
            this.field1718 = arg3.field4618;
        } else if (this.field1710 != arg3.field4618 || this.field1718 != arg3.field4618) {
            throw new RuntimeException();
        }
        arg3.method1834(this.field1709, class330.field4944[arg0], (byte) -46, arg4, arg1);
        this.field1708[arg0] = arg3;
        this.field1711 |= var6;
    }

    @OriginalMember(owner = "client!mg", name = "c", descriptor = "(B)I", line = 558)
    private final int method732(byte arg0) {
        field1735++;
        if (arg0 < 103) {
            return -98;
        } else if ((this.field1717 & 0x4) != 0) {
            return 36160;
        } else if ((this.field1717 & 0x2) == 0) {
            return (this.field1717 & 0x1) == 0 ? -1 : 36008;
        } else {
            return 36009;
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(Ljava/lang/String;BILjava/lang/String;Ljava/lang/String;IILjava/lang/String;)V", line = 578)
    public static final void method733(String arg0, byte arg1, int arg2, String arg3, String arg4, int arg5, int arg6, String arg7) {
        for (int var8 = 99; var8 > 0; var8--) {
            class37.field502[var8] = class37.field502[var8 - 1];
            class414.field5998[var8] = class414.field5998[var8 - 1];
            class255.field3887[var8] = class255.field3887[var8 - 1];
            class224.field3452[var8] = class224.field3452[var8 - 1];
            class475.field7246[var8] = class475.field7246[var8 - 1];
            class128.field2067[var8] = class128.field2067[var8 - 1];
            class508.field7688[var8] = class508.field7688[var8 - 1];
        }
        field1720++;
        class37.field502[0] = arg6;
        class414.field5998[0] = arg5;
        class255.field3887[0] = arg7;
        class224.field3452[0] = arg4;
        if (arg1 != -4) {
            method730(24, -26, -37, -86, -22, 27, -44);
        }
        class475.field7246[0] = arg0;
        class108.field1885 = class298.field4515;
        class128.field2067[0] = arg3;
        class508.field7688[0] = arg2;
        class34.field489++;
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(IIILsl;)V", line = 628)
    public final void method734(int arg0, int arg1, int arg2, class304 arg3) {
        this.method731(arg2, 0, (byte) 72, arg3, arg0);
        if (arg1 == -1) {
            field1705++;
        }
    }

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "(I)V", line = 639)
    public final void method735(int arg0) {
        OpenGL.glBindFramebufferEXT(36160, 0);
        if (arg0 != 3015) {
            this.field1718 = 57;
        }
        field1736++;
        this.field1717 &= 0xFFFFFFFB;
        this.field1709 = this.method732((byte) 110);
    }

    @OriginalMember(owner = "client!mg", name = "c", descriptor = "(I)V", line = 660)
    public final void method736(int arg0) {
        field1715++;
        OpenGL.glBindFramebufferEXT(36160, this.field1729);
        this.field1717 |= 0x4;
        this.field1709 = this.method732((byte) 107);
        if (arg0 != 1354) {
            this.field1718 = 121;
        }
    }
}
