import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bw")
public class class20 {

    @OriginalMember(owner = "client!bw", name = "e", descriptor = "Lof;")
    private class328 field232 = new class328(64);

    @OriginalMember(owner = "client!bw", name = "j", descriptor = "Lmn;")
    private class162 field237;

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "I")
    public static int field228;

    @OriginalMember(owner = "client!bw", name = "b", descriptor = "I")
    public static int field229;

    @OriginalMember(owner = "client!bw", name = "c", descriptor = "I")
    public static int field230;

    @OriginalMember(owner = "client!bw", name = "d", descriptor = "I")
    public static int field231;

    @OriginalMember(owner = "client!bw", name = "f", descriptor = "I")
    public static int field233;

    @OriginalMember(owner = "client!bw", name = "g", descriptor = "I")
    public static int field234;

    @OriginalMember(owner = "client!bw", name = "h", descriptor = "I")
    public static int field235;

    @OriginalMember(owner = "client!bw", name = "i", descriptor = "I")
    public static int field236;

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(IIIII[FI)V")
    public static final void method124(int arg0, int arg1, int arg2, int arg3, int arg4, float[] arg5, int arg6) {
        field229++;
        if (arg1 > 0 && !class357.method2363(-58, arg1)) {
            throw new IllegalArgumentException("");
        } else if (arg0 > 0 && !class357.method2363(-111, arg0)) {
            throw new IllegalArgumentException("");
        } else if (arg2 < -4) {
            int var7 = class202.method1381(-32842, arg4);
            int var8 = 0;
            int var9 = arg1 < arg0 ? arg1 : arg0;
            int var10 = arg1 >> 1;
            int var11 = arg0 >> 1;
            float[] var12 = arg5;
            float[] var13 = new float[var7 * var10 * var11];
            while (true) {
                OpenGL.glTexImage2Df(arg3, var8, arg6, arg1, arg0, 0, arg4, 5126, var12, 0);
                if (var9 <= 1) {
                    return;
                }
                int var14 = arg1 * var7;
                for (int var15 = 0; var15 < var7; var15++) {
                    int var17 = var15;
                    int var18 = var15;
                    int var19 = var14 + var15;
                    for (int var20 = 0; var20 < var11; var20++) {
                        for (int var21 = 0; var21 < var10; var21++) {
                            float var22 = var12[var18];
                            int var23 = var7 + var18;
                            float var24 = var12[var23] + var22;
                            float var25 = var12[var19] + var24;
                            var18 = var7 + var23;
                            int var26 = var7 + var19;
                            float var27 = var12[var26] + var25;
                            var19 = var7 + var26;
                            var13[var17] = var27 * 0.25F;
                            var17 += var7;
                        }
                        var18 += var14;
                        var19 += var14;
                    }
                }
                float[] var16 = var13;
                var13 = var12;
                var12 = var16;
                arg0 = var11;
                arg1 = var10;
                var11 >>= 0x1;
                var9 >>= 0x1;
                var10 >>= 0x1;
                var8++;
            }
        }
    }

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(BLza;)V")
    public static final void method125(byte arg0, class497 arg1) {
        field234++;
        if (!(class501.field7514 >= 2 || class128.field1732) || class477.field7309 != null) {
            return;
        }
        String var2;
        if (class128.field1732 && class501.field7514 < 2) {
            var2 = class427.field6450 + class179.field2614.method1583(96, class12.field131) + class283.field4459 + " ->";
        } else if (class298.field4686 && class36.field376.method927(81, -1234) && class501.field7514 > 2) {
            var2 = class169.method1071((class140) class392.field5958.field4939.field7776.field7776, (byte) -5);
        } else {
            class140 var3 = (class140) class392.field5958.field4939.field7776;
            var2 = class169.method1071(var3, (byte) -5);
            int[] var4 = null;
            if (class518.method3108((byte) 102, var3.field1894)) {
                var4 = class337.field5262.method2077((byte) -65, (int) var3.field1895).field2995;
            } else if (var3.field1898 != -1) {
                var4 = class337.field5262.method2077((byte) -65, var3.field1898).field2995;
            } else if (class433.method2725((byte) -70, var3.field1894)) {
                class38 var7 = (class38) class365.field5659.method1122((byte) 59, (long) ((int) var3.field1895));
                if (var7 != null) {
                    class378 var8 = var7.field378;
                    class191 var9 = var8.field5809;
                    if (var9.field2798 != null) {
                        var9 = var9.method1190(-1, class96.field1394);
                    }
                    if (var9 != null) {
                        var4 = var9.field2837;
                    }
                }
            } else if (class61.method454(var3.field1894, 1002)) {
                Object var5 = null;
                class156 var6;
                if (var3.field1894 == 1007) {
                    var6 = class454.field7029.method3002(-1, (int) var3.field1895);
                } else {
                    var6 = class454.field7029.method3002(-1, (int) (var3.field1895 >>> 32 & 0x7FFFFFFFL));
                }
                if (var6.field2134 != null) {
                    var6 = var6.method962((byte) 37, class96.field1394);
                }
                if (var6 != null) {
                    var4 = var6.field2101;
                }
            }
            if (var4 != null) {
                var2 = var2 + class326.method2180(var4, -92);
            }
        }
        if (class501.field7514 > 2) {
            var2 = var2 + "<col=ffffff> / " + (class501.field7514 - 2) + class423.field6421.method1583(115, class12.field131);
        }
        if (arg0 < 65) {
            return;
        }
        if (class142.field1927 != null) {
            class299 var11 = class142.field1927.method2765(-4754, arg1);
            if (var11 == null) {
                var11 = class289.field4571;
            }
            var11.method2016(class142.field1927.field6615, class142.field1927.field6749, class142.field1927.field6622, class243.field3946, class517.field7677, class142.field1927.field6600, var2, class142.field1927.field6694, class181.field2633, class142.field1927.field6730, class258.field4163, class460.field7086, 55, class417.field6334, class131.field1779);
            class346.method2292(class258.field4163[2], 0, class258.field4163[1], class258.field4163[3], class258.field4163[0]);
        } else if (class186.field2713 != null && class516.field7674 == class153.field2042) {
            int var10 = class289.field4571.method2021(class460.field7086, class417.field6334, (byte) 91, class243.field3946, class181.field2633, 0, class358.field5550 + 16, 16777215, var2, class506.field7569 + 4);
            class346.method2292(var10 + class306.field4807.method2252(var2, 0), 0, class358.field5550, 16, class506.field7569 + 4);
            return;
        }
    }

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(I)V")
    public static final void method126(int arg0) {
        if (arg0 <= 112) {
            return;
        }
        class315.field4923 = null;
        class263.field4258 = null;
        class447.field6944 = null;
        class279.field4413 = null;
        class172.field2526 = null;
        class376.field5792 = null;
        class382.field5865 = null;
        class522.field7725 = null;
        class38.field381 = null;
        class500.field7506 = null;
        field235++;
        class289.field4571 = null;
        class491.field7436 = null;
        class468.field7178 = null;
        class120.field1645 = null;
        class247.field4025 = null;
        class171.field2493 = null;
        class128.field1741 = null;
        class457.field7052 = null;
    }

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(II)V")
    public final void method127(int arg0, int arg1) {
        int var3 = -96 / ((47 - arg1) / 35);
        class328 var4 = this.field232;
        synchronized (this.field232) {
            this.field232.method2202(0, arg0);
        }
        field236++;
    }

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "()V")
    public static final void method128() {
        class520.field7705 = 0;
        label212: for (int var0 = 0; var0 < class360.field5584; var0++) {
            class135 var1 = class222.field3745[var0];
            if (class393.field5961 != null) {
                for (int var2 = 0; var2 < class393.field5961.length; var2++) {
                    if (class393.field5961[var2] != -1000000 && (var1.field1816 <= class393.field5961[var2] || var1.field1836 <= class393.field5961[var2]) && (var1.field1834 <= class17.field182[var2] || var1.field1828 <= class17.field182[var2]) && (var1.field1834 >= class3.field36[var2] || var1.field1828 >= class3.field36[var2]) && (var1.field1832 <= class153.field2045[var2] || var1.field1825 <= class153.field2045[var2]) && (var1.field1832 >= class255.field4120[var2] || var1.field1825 >= class255.field4120[var2])) {
                        continue label212;
                    }
                }
            }
            if (var1.field1822 == 1) {
                int var3 = var1.field1818 + class78.field1156 - class192.field2847;
                if (var3 >= 0 && var3 <= class78.field1156 + class78.field1156) {
                    int var4 = var1.field1823 + class78.field1156 - class241.field3919;
                    if (var4 < 0) {
                        var4 = 0;
                    } else if (var4 > class78.field1156 + class78.field1156) {
                        continue;
                    }
                    int var5 = var1.field1820 + class78.field1156 - class241.field3919;
                    if (var5 > class78.field1156 + class78.field1156) {
                        var5 = class78.field1156 + class78.field1156;
                    } else if (var5 < 0) {
                        continue;
                    }
                    boolean var6 = false;
                    while (var4 <= var5) {
                        if (class357.field5543[var3][var4++]) {
                            var6 = true;
                            break;
                        }
                    }
                    if (var6) {
                        int var7 = class329.field5178 - var1.field1834;
                        if (var7 > class364.field5627) {
                            var1.field1831 = 1;
                        } else {
                            if (var7 >= -class364.field5627) {
                                continue;
                            }
                            var1.field1831 = 2;
                            var7 = -var7;
                        }
                        var1.field1829 = (var1.field1832 - class32.field331 << 8) / var7;
                        var1.field1819 = (var1.field1825 - class32.field331 << 8) / var7;
                        var1.field1837 = (var1.field1816 - class80.field1194 << 8) / var7;
                        var1.field1833 = (var1.field1836 - class80.field1194 << 8) / var7;
                        class376.field5778[class520.field7705++] = var1;
                    }
                }
            } else if (var1.field1822 == 2) {
                int var8 = var1.field1823 + class78.field1156 - class241.field3919;
                if (var8 >= 0 && var8 <= class78.field1156 + class78.field1156) {
                    int var9 = var1.field1818 + class78.field1156 - class192.field2847;
                    if (var9 < 0) {
                        var9 = 0;
                    } else if (var9 > class78.field1156 + class78.field1156) {
                        continue;
                    }
                    int var10 = var1.field1826 + class78.field1156 - class192.field2847;
                    if (var10 > class78.field1156 + class78.field1156) {
                        var10 = class78.field1156 + class78.field1156;
                    } else if (var10 < 0) {
                        continue;
                    }
                    boolean var11 = false;
                    while (var9 <= var10) {
                        if (class357.field5543[var9++][var8]) {
                            var11 = true;
                            break;
                        }
                    }
                    if (var11) {
                        int var12 = class32.field331 - var1.field1832;
                        if (var12 > class364.field5627) {
                            var1.field1831 = 3;
                        } else {
                            if (var12 >= -class364.field5627) {
                                continue;
                            }
                            var1.field1831 = 4;
                            var12 = -var12;
                        }
                        var1.field1821 = (var1.field1834 - class329.field5178 << 8) / var12;
                        var1.field1817 = (var1.field1828 - class329.field5178 << 8) / var12;
                        var1.field1837 = (var1.field1816 - class80.field1194 << 8) / var12;
                        var1.field1833 = (var1.field1836 - class80.field1194 << 8) / var12;
                        class376.field5778[class520.field7705++] = var1;
                    }
                }
            } else if (var1.field1822 == 4) {
                int var13 = var1.field1816 - class80.field1194;
                if (var13 > class385.field5892) {
                    int var14 = var1.field1823 + class78.field1156 - class241.field3919;
                    if (var14 < 0) {
                        var14 = 0;
                    } else if (var14 > class78.field1156 + class78.field1156) {
                        continue;
                    }
                    int var15 = var1.field1820 + class78.field1156 - class241.field3919;
                    if (var15 > class78.field1156 + class78.field1156) {
                        var15 = class78.field1156 + class78.field1156;
                    } else if (var15 < 0) {
                        continue;
                    }
                    int var16 = var1.field1818 + class78.field1156 - class192.field2847;
                    if (var16 < 0) {
                        var16 = 0;
                    } else if (var16 > class78.field1156 + class78.field1156) {
                        continue;
                    }
                    int var17 = var1.field1826 + class78.field1156 - class192.field2847;
                    if (var17 > class78.field1156 + class78.field1156) {
                        var17 = class78.field1156 + class78.field1156;
                    } else if (var17 < 0) {
                        continue;
                    }
                    boolean var18 = false;
                    label184: for (int var19 = var16; var19 <= var17; var19++) {
                        for (int var20 = var14; var20 <= var15; var20++) {
                            if (class357.field5543[var19][var20]) {
                                var18 = true;
                                break label184;
                            }
                        }
                    }
                    if (var18) {
                        var1.field1831 = 5;
                        var1.field1821 = (var1.field1834 - class329.field5178 << 8) / var13;
                        var1.field1817 = (var1.field1828 - class329.field5178 << 8) / var13;
                        var1.field1829 = (var1.field1832 - class32.field331 << 8) / var13;
                        var1.field1819 = (var1.field1825 - class32.field331 << 8) / var13;
                        class376.field5778[class520.field7705++] = var1;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!bw", name = "b", descriptor = "(I)V")
    public final void method129(int arg0) {
        class328 var2 = this.field232;
        synchronized (this.field232) {
            if (arg0 != 28569) {
                field228 = 60;
            }
            this.field232.method2187(-1);
        }
        field233++;
    }

    @OriginalMember(owner = "client!bw", name = "c", descriptor = "(I)V")
    public final void method130(int arg0) {
        class328 var2 = this.field232;
        synchronized (this.field232) {
            this.field232.method2189(false);
        }
        if (arg0 != -18419) {
            field228 = -80;
        }
        field231++;
    }

    @OriginalMember(owner = "client!bw", name = "b", descriptor = "(II)Lhh;")
    public final class126 method131(int arg0, int arg1) {
        field230++;
        class328 var3 = this.field232;
        class126 var4;
        synchronized (this.field232) {
            var4 = (class126) this.field232.method2191((byte) -73, (long) arg0);
        }
        if (arg1 != 28375) {
            method128();
        }
        if (var4 != null) {
            return var4;
        }
        class162 var5 = this.field237;
        byte[] var6;
        synchronized (this.field237) {
            var6 = this.field237.method1004(35, false, arg0);
        }
        class126 var7 = new class126();
        if (var6 != null) {
            var7.method789(-128, new class208(var6));
        }
        var7.method786(78);
        class328 var8 = this.field232;
        synchronized (this.field232) {
            this.field232.method2188(arg1 - 28502, (long) arg0, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!bw", name = "<init>", descriptor = "(Lpr;ILmn;)V")
    public class20(class236 arg0, int arg1, class162 arg2) {
        this.field237 = arg2;
        if (this.field237 != null) {
            this.field237.method1008(35, (byte) -21);
        }
    }

    static {
        new class213("Sending request to leave channel...", "Chatraum wird verlassen...", "Envoi de la demande de sortie du canal...", "Enviando solicitação para deixar o canal...");
    }
}
