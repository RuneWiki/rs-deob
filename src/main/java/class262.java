import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!in")
public class class262 {

    @OriginalMember(owner = "client!in", name = "r", descriptor = "I")
    private int field4235 = 32;

    @OriginalMember(owner = "client!in", name = "t", descriptor = "Z")
    private boolean field4237 = false;

    @OriginalMember(owner = "client!in", name = "b", descriptor = "J")
    private long field4219 = class246.method1705((byte) 28);

    @OriginalMember(owner = "client!in", name = "B", descriptor = "J")
    private long field4245 = 0L;

    @OriginalMember(owner = "client!in", name = "F", descriptor = "I")
    private int field4249 = 0;

    @OriginalMember(owner = "client!in", name = "D", descriptor = "I")
    private int field4247 = 0;

    @OriginalMember(owner = "client!in", name = "I", descriptor = "[Lnu;")
    private class313[] field4252 = new class313[8];

    @OriginalMember(owner = "client!in", name = "E", descriptor = "J")
    private long field4248 = 0L;

    @OriginalMember(owner = "client!in", name = "J", descriptor = "I")
    private int field4253 = 0;

    @OriginalMember(owner = "client!in", name = "C", descriptor = "I")
    private int field4246 = 0;

    @OriginalMember(owner = "client!in", name = "L", descriptor = "[Lnu;")
    private class313[] field4255 = new class313[8];

    @OriginalMember(owner = "client!in", name = "M", descriptor = "Z")
    private boolean field4256 = true;

    @OriginalMember(owner = "client!in", name = "x", descriptor = "Loh;")
    public static class445 field4241 = new class445();

    @OriginalMember(owner = "client!in", name = "y", descriptor = "[[Z")
    public static boolean[][] field4242 = new boolean[][] { new boolean[4], new boolean[4], { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, new boolean[4], new boolean[4], new boolean[4], new boolean[4] };

    @OriginalMember(owner = "client!in", name = "A", descriptor = "Lbi;")
    public static class104 field4244 = new class104(36, 4);

    @OriginalMember(owner = "client!in", name = "a", descriptor = "I")
    public static int field4218;

    @OriginalMember(owner = "client!in", name = "c", descriptor = "I")
    public static int field4220;

    @OriginalMember(owner = "client!in", name = "d", descriptor = "I")
    public static int field4221;

    @OriginalMember(owner = "client!in", name = "e", descriptor = "I")
    public static int field4222;

    @OriginalMember(owner = "client!in", name = "f", descriptor = "I")
    public static int field4223;

    @OriginalMember(owner = "client!in", name = "h", descriptor = "I")
    public static int field4225;

    @OriginalMember(owner = "client!in", name = "i", descriptor = "I")
    public static int field4226;

    @OriginalMember(owner = "client!in", name = "j", descriptor = "I")
    public static int field4227;

    @OriginalMember(owner = "client!in", name = "k", descriptor = "I")
    public static int field4228;

    @OriginalMember(owner = "client!in", name = "m", descriptor = "I")
    public static int field4230;

    @OriginalMember(owner = "client!in", name = "n", descriptor = "I")
    public static int field4231;

    @OriginalMember(owner = "client!in", name = "o", descriptor = "I")
    public static int field4232;

    @OriginalMember(owner = "client!in", name = "p", descriptor = "I")
    public static int field4233;

    @OriginalMember(owner = "client!in", name = "q", descriptor = "I")
    public static int field4234;

    @OriginalMember(owner = "client!in", name = "s", descriptor = "I")
    public static int field4236;

    @OriginalMember(owner = "client!in", name = "u", descriptor = "I")
    public static int field4238;

    @OriginalMember(owner = "client!in", name = "v", descriptor = "I")
    public static int field4239;

    @OriginalMember(owner = "client!in", name = "w", descriptor = "I")
    public static int field4240;

    @OriginalMember(owner = "client!in", name = "z", descriptor = "I")
    public static int field4243;

    @OriginalMember(owner = "client!in", name = "G", descriptor = "I")
    public int field4250;

    @OriginalMember(owner = "client!in", name = "H", descriptor = "I")
    private int field4251;

    @OriginalMember(owner = "client!in", name = "K", descriptor = "I")
    public int field4254;

    @OriginalMember(owner = "client!in", name = "l", descriptor = "Lnu;")
    private class313 field4229;

    @OriginalMember(owner = "client!in", name = "g", descriptor = "[I")
    public int[] field4224;

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(I)V")
    public final synchronized void method1781(int arg0) {
        if (arg0 != 50) {
            return;
        }
        if (class472.field7235 != null) {
            boolean var2 = true;
            for (int var3 = 0; var3 < 2; var3++) {
                if (class472.field7235.field7312[var3] == this) {
                    class472.field7235.field7312[var3] = null;
                }
                if (class472.field7235.field7312[var3] != null) {
                    var2 = false;
                }
            }
            if (var2) {
                class472.field7235.field7317 = true;
                while (class472.field7235.field7318) {
                    class208.method1464((byte) -125, 50L);
                }
                class472.field7235 = null;
            }
        }
        field4226++;
        this.method1783();
        this.field4224 = null;
        this.field4237 = true;
    }

    @OriginalMember(owner = "client!in", name = "b", descriptor = "(I)V")
    public static void method1782(int arg0) {
        if (arg0 != 25706) {
            field4242 = null;
        }
        field4241 = null;
        field4242 = null;
        field4244 = null;
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "()V")
    public void method1783() {
        field4220++;
    }

    @OriginalMember(owner = "client!in", name = "c", descriptor = "(I)V")
    public final synchronized void method1784(int arg0) {
        this.field4256 = true;
        field4239++;
        try {
            this.method1785();
        } catch (Exception var2) {
            this.method1783();
            this.field4245 = class246.method1705((byte) 28) + 2000L;
        }
        if (arg0 <= 33) {
            this.field4235 = -67;
        }
    }

    @OriginalMember(owner = "client!in", name = "b", descriptor = "()V")
    public void method1785() throws Exception {
        field4231++;
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(II)V")
    private final void method1786(int arg0, int arg1) {
        field4238++;
        if (arg0 != 0) {
            this.field4248 = -64L;
        }
        this.field4249 -= arg1;
        if (this.field4249 < 0) {
            this.field4249 = 0;
        }
        if (this.field4229 != null) {
            this.field4229.method383(arg1);
        }
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(IIIBIIIIII)V")
    public static final void method1787(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg1 == arg8 && arg4 == arg5 && arg0 == arg6 && arg7 == arg9) {
            class270.method1827(arg2, arg5, arg1, arg0, arg7, 353);
        } else {
            int var10 = arg1;
            int var11 = arg5;
            int var12 = arg1 * 3;
            int var13 = arg5 * 3;
            int var14 = arg8 * 3;
            int var15 = arg4 * 3;
            int var16 = arg6 * 3;
            int var17 = arg9 * 3;
            int var18 = arg0 + var14 - var16 - arg1;
            int var19 = var15 + arg7 - arg5 - var17;
            int var20 = var16 + var12 - var14 - var14;
            int var21 = var17 + var13 - var15 - var15;
            int var22 = var14 - var12;
            int var23 = var15 - var13;
            for (int var24 = 128; var24 <= 4096; var24 += 128) {
                int var25 = var24 * var24 >> 12;
                int var26 = var24 * var25 >> 12;
                int var27 = var18 * var26;
                int var28 = var19 * var26;
                int var29 = var20 * var25;
                int var30 = var21 * var25;
                int var31 = var22 * var24;
                int var32 = var23 * var24;
                int var33 = (var27 + var31 + var29 >> 12) + arg1;
                int var34 = (var28 + var30 + var32 >> 12) + arg5;
                class270.method1827(arg2, var11, var10, var33, var34, 353);
                var10 = var33;
                var11 = var34;
            }
        }
        field4227++;
        if (arg3 != -85) {
            field4242 = null;
        }
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "([II)V")
    private final void method1788(int[] arg0, int arg1) {
        int var3 = arg1;
        if (class309.field4835) {
            var3 = arg1 << 1;
        }
        class324.method2171(arg0, 0, var3);
        this.field4249 -= arg1;
        if (this.field4229 != null && this.field4249 <= 0) {
            this.field4249 += class221.field3742 >> 4;
            class359.method2377(false, this.field4229);
            this.method1801(this.field4229, this.field4229.method2098(), (byte) 52);
            int var4 = 0;
            int var5 = 255;
            int var6 = 7;
            label107: while (var5 != 0) {
                int var7;
                int var8;
                if (var6 < 0) {
                    var7 = var6 & 0x3;
                    var8 = -(var6 >> 2);
                } else {
                    var7 = var6;
                    var8 = 0;
                }
                for (int var9 = var5 >>> var7 & 0x11111111; var9 != 0; var9 >>>= 0x4) {
                    if ((var9 & 0x1) != 0) {
                        var5 &= ~(0x1 << var7);
                        class313 var10 = null;
                        class313 var11 = this.field4255[var7];
                        label101: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label101;
                                }
                                class492 var12 = var11.field4908;
                                if (var12 == null || var12.field7440 <= var8) {
                                    var11.field4909 = true;
                                    int var13 = var11.method385();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field7440 += var13;
                                    }
                                    if (var4 >= this.field4235) {
                                        break label107;
                                    }
                                    class313 var14 = var11.method374();
                                    if (var14 != null) {
                                        int var15 = var11.field4910;
                                        while (var14 != null) {
                                            this.method1801(var14, var15 * var14.method2098() >> 8, (byte) 52);
                                            var14 = var11.method400();
                                        }
                                    }
                                    class313 var16 = var11.field4911;
                                    var11.field4911 = null;
                                    if (var10 == null) {
                                        this.field4255[var7] = var16;
                                    } else {
                                        var10.field4911 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field4252[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field4911;
                                }
                            }
                        }
                    }
                    var7 += 4;
                    var8++;
                }
                var6--;
            }
            for (int var17 = 0; var17 < 8; var17++) {
                class313 var18 = this.field4255[var17];
                this.field4255[var17] = this.field4252[var17] = null;
                while (var18 != null) {
                    class313 var19 = var18.field4911;
                    var18.field4911 = null;
                    var18 = var19;
                }
            }
        }
        if (this.field4249 < 0) {
            this.field4249 = 0;
        }
        if (this.field4229 != null) {
            this.field4229.method408(arg0, 0, arg1);
        }
        this.field4219 = class246.method1705((byte) 28);
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(B)V")
    public static final void method1789(byte arg0) {
        field4232++;
        if (arg0 > -112) {
            field4241 = null;
        }
        class279.field4428.method1860((byte) -107);
        int var1 = class279.field4428.method1852(92, 8);
        if (var1 < class378.field5815) {
            for (int var2 = var1; var2 < class378.field5815; var2++) {
                class169.field2481[class535.field7841++] = class81.field1198[var2];
            }
        }
        if (var1 > class378.field5815) {
            throw new RuntimeException("gnpov1");
        }
        class378.field5815 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = class81.field1198[var3];
            class378 var5 = ((class38) class365.field5659.method1122((byte) 59, (long) var4)).field378;
            int var6 = class279.field4428.method1852(113, 1);
            if (var6 == 0) {
                class81.field1198[class378.field5815++] = var4;
                var5.field801 = class88.field1278;
            } else {
                int var7 = class279.field4428.method1852(104, 2);
                if (var7 == 0) {
                    class81.field1198[class378.field5815++] = var4;
                    var5.field801 = class88.field1278;
                    class272.field4342[class368.field5681++] = var4;
                } else if (var7 == 1) {
                    class81.field1198[class378.field5815++] = var4;
                    var5.field801 = class88.field1278;
                    int var8 = class279.field4428.method1852(117, 3);
                    var5.method2446(1, 1, var8);
                    int var9 = class279.field4428.method1852(110, 1);
                    if (var9 == 1) {
                        class272.field4342[class368.field5681++] = var4;
                    }
                } else if (var7 == 2) {
                    class81.field1198[class378.field5815++] = var4;
                    var5.field801 = class88.field1278;
                    if (class279.field4428.method1852(102, 1) == 1) {
                        int var10 = class279.field4428.method1852(103, 3);
                        var5.method2446(1, 2, var10);
                        int var11 = class279.field4428.method1852(94, 3);
                        var5.method2446(1, 2, var11);
                    } else {
                        int var12 = class279.field4428.method1852(111, 3);
                        var5.method2446(1, 0, var12);
                    }
                    int var13 = class279.field4428.method1852(101, 1);
                    if (var13 == 1) {
                        class272.field4342[class368.field5681++] = var4;
                    }
                } else if (var7 == 3) {
                    class169.field2481[class535.field7841++] = var4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!in", name = "d", descriptor = "(I)V")
    public void method1790(int arg0) throws Exception {
        field4222++;
    }

    @OriginalMember(owner = "client!in", name = "c", descriptor = "()V")
    public void method1791() throws Exception {
        field4240++;
    }

    @OriginalMember(owner = "client!in", name = "d", descriptor = "()I")
    public int method1792() throws Exception {
        field4233++;
        return this.field4250;
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(IIIILej;)V")
    public static final void method1793(int arg0, int arg1, int arg2, int arg3, class528 arg4) {
        class409 var5 = class207.method1413(arg0, arg1, arg2);
        if (var5 == null) {
            return;
        }
        int var6 = 0;
        arg4.field7770 = (arg1 << class56.field908) + class376.field5781;
        arg4.field7768 = arg3;
        arg4.field7773 = (arg2 << class56.field908) + class376.field5781;
        for (class192 var7 = var5.field6175; var7 != null; var7 = var7.field2841) {
            if (var7.field2845.field6413) {
                int var8 = var7.field2845.method1596(true);
                if (var8 != -32768 && var8 < var6) {
                    var6 = var8;
                }
            }
        }
        if (var6 < 0) {
            arg4.field7768 += var6;
            arg4.field7771 = true;
        } else if (var5.field6176 != null) {
            arg4.field7768 -= var5.field6176.field130;
        }
        var5.field6186 = arg4;
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(FFLbl;FFIIIIIF[BIZ)V")
    public static final void method1794(float arg0, float arg1, class268 arg2, float arg3, float arg4, int arg5, int arg6, int arg7, int arg8, int arg9, float arg10, byte[] arg11, int arg12, boolean arg13) {
        field4223++;
        int var14 = arg7 * arg12;
        float[] var15 = new float[var14];
        for (int var16 = 0; var16 < arg9; var16++) {
            int var19 = arg6;
            arg2.method1820(arg3 / (float) arg12, arg7, (byte) 100, var15, arg8, arg5, 0, arg12, arg0 / (float) arg7, arg10 / (float) arg5, arg1 * 127.0F);
            arg1 *= arg4;
            arg3 *= 2.0F;
            for (int var20 = 0; var20 < var14; var20++) {
                arg11[var19] = (byte) ((int) ((float) arg11[var19] + var15[var20]));
                var19++;
            }
            arg10 *= 2.0F;
            arg0 *= 2.0F;
        }
        int var17 = arg6;
        if (arg13) {
            method1789((byte) 2);
        }
        for (int var18 = 0; var18 < var14; var18++) {
            arg11[var17] = (byte) (arg11[var17] + 127);
            var17++;
        }
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(ZIILgi;)V")
    public static final void method1795(boolean arg0, int arg1, int arg2, class437 arg3) {
        field4236++;
        if (arg3 == null) {
            return;
        }
        if (arg3.field6721 != null) {
            class491 var4 = new class491();
            var4.field7423 = arg3;
            var4.field7430 = arg3.field6721;
            class420.method2673(var4);
        }
        class535.field7838 = arg2;
        class264.field4277 = arg3.field6716;
        class128.field1732 = arg0;
        class436.field6587 = arg3.field6707;
        class31.field327 = arg3.field6595;
        class398.field6007 = arg3.field6751;
        class231.field3822 = arg1;
        class186.field2716 = arg3.field6618;
        class479.method2962(-106, arg3);
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public void method1796(Component arg0) throws Exception {
        field4225++;
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(IZI)I")
    public static final int method1797(int arg0, boolean arg1, int arg2) {
        field4243++;
        int var3 = arg0 >>> 24;
        int var4 = 255 - var3;
        if (!arg1) {
            field4242 = null;
        }
        int var5 = ((arg0 & 0xFF00) * var3 & 0xFF0000 | (arg0 & 0xFF00FF) * var3 & 0xFF00FF00) >>> 8;
        return (((arg2 & 0xFF00FF) * var4 & 0xFF00FF00 | (arg2 & 0xFF00) * var4 & 0xFF0000) >>> 8) + var5;
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(IIB)Z")
    public static final boolean method1798(int arg0, int arg1, byte arg2) {
        if (arg2 > -70) {
            field4241 = null;
        }
        field4228++;
        return class319.method2141(arg1, arg0, (byte) -127) & class252.method1736(arg0, (byte) -128, arg1);
    }

    @OriginalMember(owner = "client!in", name = "b", descriptor = "(B)V")
    public final synchronized void method1799(byte arg0) {
        field4221++;
        if (this.field4237) {
            return;
        }
        long var2 = class246.method1705((byte) 28);
        try {
            if (var2 > (this.field4219 + 500000L)) {
                this.field4219 = var2 - 500000L;
            }
            while ((this.field4219 + 5000L) < var2) {
                this.method1786(0, 256);
                this.field4219 += (256000 / class221.field3742);
            }
            if (arg0 != -102) {
                this.method1783();
            }
        } catch (Exception var7) {
            this.field4219 = var2;
        }
        if (this.field4224 == null) {
            return;
        }
        try {
            if (this.field4245 != 0L) {
                if (var2 < this.field4245) {
                    return;
                }
                this.method1790(this.field4250);
                this.field4256 = true;
                this.field4245 = 0L;
            }
            int var4 = this.method1792();
            if (this.field4246 < (this.field4253 - var4)) {
                this.field4246 = this.field4253 - var4;
            }
            int var5 = this.field4254 + this.field4251;
            if (var5 + 256 > 16384) {
                var5 = 16128;
            }
            if (var5 + 256 > this.field4250) {
                this.field4250 += 1024;
                if (this.field4250 > 16384) {
                    this.field4250 = 16384;
                }
                this.method1783();
                this.method1790(this.field4250);
                var4 = 0;
                if (var5 + 256 > this.field4250) {
                    var5 = this.field4250 - 256;
                    this.field4251 = var5 - this.field4254;
                }
                this.field4256 = true;
            }
            while (var5 > var4) {
                this.method1788(this.field4224, 256);
                var4 += 256;
                this.method1791();
            }
            if (var2 > this.field4248) {
                if (this.field4256) {
                    this.field4256 = false;
                } else if (this.field4246 == 0 && this.field4247 == 0) {
                    this.method1783();
                    this.field4245 = var2 + 2000L;
                    return;
                } else {
                    this.field4251 = Math.min(this.field4247, this.field4246);
                    this.field4247 = this.field4246;
                }
                this.field4248 = var2 + 2000L;
                this.field4246 = 0;
            }
            this.field4253 = var4;
        } catch (Exception var6) {
            this.method1783();
            this.field4245 = var2 + 2000L;
        }
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(Lnu;I)V")
    public final synchronized void method1800(class313 arg0, int arg1) {
        field4230++;
        if (arg1 != 13845) {
            field4244 = null;
        }
        this.field4229 = arg0;
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(Lnu;IB)V")
    private final void method1801(class313 arg0, int arg1, byte arg2) {
        if (arg2 != 52) {
            this.field4249 = 102;
        }
        field4234++;
        int var4 = arg1 >> 5;
        class313 var5 = this.field4252[var4];
        if (var5 == null) {
            this.field4255[var4] = arg0;
        } else {
            var5.field4911 = arg0;
        }
        this.field4252[var4] = arg0;
        arg0.field4910 = arg1;
    }
}
