import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public class class131 {

    @OriginalMember(owner = "client!oe", name = "e", descriptor = "[I")
    private int[] field2559;

    @OriginalMember(owner = "client!oe", name = "l", descriptor = "[I")
    private int[] field2566;

    @OriginalMember(owner = "client!oe", name = "h", descriptor = "[B")
    private byte[] field2562;

    @OriginalMember(owner = "client!oe", name = "f", descriptor = "Lsd;")
    public static class166 field2560 = class135.method935("Bitte starten Sie eine Mitgliedschaft", 0);

    @OriginalMember(owner = "client!oe", name = "k", descriptor = "Lsd;")
    private static class166 field2565 = class135.method935("Login server offline)3", 0);

    @OriginalMember(owner = "client!oe", name = "g", descriptor = "Lsd;")
    public static class166 field2561 = field2565;

    @OriginalMember(owner = "client!oe", name = "c", descriptor = "I")
    public static int field2557;

    @OriginalMember(owner = "client!oe", name = "d", descriptor = "I")
    public static int field2558;

    @OriginalMember(owner = "client!oe", name = "i", descriptor = "I")
    public static int field2563;

    @OriginalMember(owner = "client!oe", name = "m", descriptor = "I")
    public static int field2567;

    @OriginalMember(owner = "client!oe", name = "n", descriptor = "I")
    public static int field2568;

    @OriginalMember(owner = "client!oe", name = "j", descriptor = "Lf;")
    public static class47 field2564;

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "Lhb;")
    public static class66 field2555;

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "Li;")
    public static class73 field2556;

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(I)V")
    public static void method917(int arg0) {
        if (arg0 >= -121) {
            field2555 = null;
        }
        field2561 = null;
        field2565 = null;
        field2564 = null;
        field2555 = null;
        field2556 = null;
        field2560 = null;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(ZI[BII[B)I")
    public final int method918(boolean arg0, int arg1, byte[] arg2, int arg3, int arg4, byte[] arg5) {
        field2563++;
        if (arg1 == 0) {
            return 0;
        }
        int var7 = arg1 + arg4;
        if (!arg0) {
            field2555 = null;
        }
        int var8 = 0;
        int var9 = arg3;
        while (true) {
            byte var10 = arg2[var9];
            if (var10 >= 0) {
                var8++;
            } else {
                var8 = this.field2566[var8];
            }
            int var11;
            if ((var11 = this.field2566[var8]) < 0) {
                arg5[arg4++] = (byte) ~var11;
                if (var7 <= arg4) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x40) == 0) {
                var8++;
            } else {
                var8 = this.field2566[var8];
            }
            int var12;
            if ((var12 = this.field2566[var8]) < 0) {
                arg5[arg4++] = (byte) ~var12;
                if (var7 <= arg4) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x20) == 0) {
                var8++;
            } else {
                var8 = this.field2566[var8];
            }
            int var13;
            if ((var13 = this.field2566[var8]) < 0) {
                arg5[arg4++] = (byte) ~var13;
                if (var7 <= arg4) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x10) == 0) {
                var8++;
            } else {
                var8 = this.field2566[var8];
            }
            int var14;
            if ((var14 = this.field2566[var8]) < 0) {
                arg5[arg4++] = (byte) ~var14;
                if (arg4 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x8) == 0) {
                var8++;
            } else {
                var8 = this.field2566[var8];
            }
            int var15;
            if ((var15 = this.field2566[var8]) < 0) {
                arg5[arg4++] = (byte) ~var15;
                if (arg4 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x4) == 0) {
                var8++;
            } else {
                var8 = this.field2566[var8];
            }
            int var16;
            if ((var16 = this.field2566[var8]) < 0) {
                arg5[arg4++] = (byte) ~var16;
                if (arg4 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x2) == 0) {
                var8++;
            } else {
                var8 = this.field2566[var8];
            }
            int var17;
            if ((var17 = this.field2566[var8]) < 0) {
                arg5[arg4++] = (byte) ~var17;
                if (var7 <= arg4) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x1) == 0) {
                var8++;
            } else {
                var8 = this.field2566[var8];
            }
            int var18;
            if ((var18 = this.field2566[var8]) < 0) {
                arg5[arg4++] = (byte) ~var18;
                if (arg4 >= var7) {
                    break;
                }
                var8 = 0;
            }
            var9++;
        }
        return var9 + 1 - arg3;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(II)V")
    public static final void method919(int arg0, int arg1) {
        if (arg1 == -3) {
            class174.method1193(class8.field156, class102.field1998, (byte) 121, class113.field2207);
        } else if (arg1 == -2) {
            class174.method1193(class135.field2644, class102.field2011, (byte) 110, class102.field1992);
        } else if (arg1 == -1) {
            class174.method1193(class8.field161, class102.field1990, (byte) 116, class137.field2676);
        } else if (arg1 == 3) {
            class174.method1193(class63.field1304, class102.field1983, (byte) 121, class102.field2010);
        } else if (arg1 == 4) {
            class174.method1193(class102.field1999, class102.field1977, (byte) 107, class45.field816);
        } else if (arg1 == 5) {
            class174.method1193(class105.field2054, class102.field1970, (byte) 28, class9.field182);
        } else if (arg1 == 6) {
            class174.method1193(class3.field41, class102.field2003, (byte) -25, class119.field2331);
        } else if (arg1 == 7) {
            class174.method1193(class100.field1905, class102.field2002, (byte) -98, class199.field3946);
        } else if (arg1 == 8) {
            class174.method1193(field2561, class102.field2007, (byte) 106, class37.field675);
        } else if (arg1 == 9) {
            class174.method1193(class57.field1181, class102.field2000, (byte) -68, class125.field2463);
        } else if (arg1 == 10) {
            class174.method1193(class193.field3723, class102.field1968, (byte) -97, class37.field678);
        } else if (arg1 == 11) {
            class174.method1193(class42.field753, class102.field1962, (byte) -55, class184.field3485);
        } else if (arg1 == 12) {
            class174.method1193(class145.field2838, class102.field2012, (byte) -8, class41.field732);
        } else if (arg1 == 13) {
            class174.method1193(class8.field155, class102.field2005, (byte) -4, class202.field3995);
        } else if (arg1 == 14) {
            class174.method1193(class4.field62, class102.field2009, (byte) -39, class108.field2096);
        } else if (arg1 == 16) {
            class174.method1193(class156.field2996, class102.field1974, (byte) -8, class59.field1217);
        } else if (arg1 == 17) {
            class174.method1193(class9.field169, class102.field2014, (byte) 105, class174.field3309);
        } else if (arg1 == 18) {
            class174.method1193(class179.field3387, class102.field1972, (byte) -88, class137.field2675);
        } else if (arg1 == 19) {
            class174.method1193(class25.field457, class100.field1906, (byte) 118, class47.field874);
        } else if (arg1 == 20) {
            class174.method1193(class8.field141, class102.field1991, (byte) -125, class111.field2151);
        } else if (arg1 == 22) {
            class174.method1193(class49.field908, class102.field1969, (byte) -70, class164.field3124);
        } else if (arg1 == 23) {
            class174.method1193(class4.field81, class102.field1966, (byte) -104, class127.field2494);
        } else if (arg1 == 24) {
            class174.method1193(class56.field1100, class102.field1967, (byte) -9, class9.field171);
        } else if (arg1 == 25) {
            class174.method1193(class8.field143, class102.field1980, (byte) 108, class89.field1757);
        } else if (arg1 == 26) {
            class174.method1193(class92.field1806, class102.field1985, (byte) -41, class199.field3937);
        } else if (arg1 == 27) {
            class174.method1193(class169.field3254, class102.field1986, (byte) 111, class102.field1984);
        } else {
            class174.method1193(class8.field139, class102.field1979, (byte) -23, class23.field403);
        }
        field2568++;
        class88.method695((byte) -125, 10);
        if (arg0 != 120) {
            field2565 = null;
        }
    }

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "(I)V")
    public static final void method920(int arg0) {
        class179.field3377.method703((byte) 92);
        int var1 = class179.field3377.method708(8, 8);
        if (class98.field1880 > var1) {
            for (int var2 = var1; var2 < class98.field1880; var2++) {
                class167.field3219[class2.field29++] = class58.field1186[var2];
            }
        }
        field2557++;
        if (class98.field1880 < var1) {
            throw new RuntimeException("gnpov1");
        }
        if (arg0 != 1) {
            method921(-81, 17);
        }
        class98.field1880 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = class58.field1186[var3];
            class154 var5 = class124.field2434[var4];
            int var6 = class179.field3377.method708(8, 1);
            if (var6 == 0) {
                class58.field1186[class98.field1880++] = var4;
                var5.field3535 = class49.field910;
            } else {
                int var7 = class179.field3377.method708(arg0 + 7, 2);
                if (var7 == 0) {
                    class58.field1186[class98.field1880++] = var4;
                    var5.field3535 = class49.field910;
                    class2.field11[class206.field4058++] = var4;
                } else if (var7 == 1) {
                    class58.field1186[class98.field1880++] = var4;
                    var5.field3535 = class49.field910;
                    int var8 = class179.field3377.method708(8, 3);
                    var5.method1247(false, var8, -1);
                    int var9 = class179.field3377.method708(arg0 ^ 0x9, 1);
                    if (var9 == 1) {
                        class2.field11[class206.field4058++] = var4;
                    }
                } else if (var7 == 2) {
                    class58.field1186[class98.field1880++] = var4;
                    var5.field3535 = class49.field910;
                    int var10 = class179.field3377.method708(8, 3);
                    var5.method1247(true, var10, -1);
                    int var11 = class179.field3377.method708(8, 3);
                    var5.method1247(true, var11, -1);
                    int var12 = class179.field3377.method708(8, 1);
                    if (var12 == 1) {
                        class2.field11[class206.field4058++] = var4;
                    }
                } else if (var7 == 3) {
                    class167.field3219[class2.field29++] = var4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "(II)V")
    public static final void method921(int arg0, int arg1) {
        field2558++;
        if (arg1 == -1 || !class169.method1169(arg1, 0)) {
            return;
        }
        class193[] var2 = class63.field1309[arg1];
        for (int var3 = 0; var3 < var2.length; var3++) {
            class193 var4 = var2[var3];
            if (var4.field3806 != null) {
                class137 var5 = new class137();
                var5.field2668 = var4.field3806;
                var5.field2673 = var4;
                class60.method507(-123, var5, 2000000);
            }
        }
        if (arg0 <= 122) {
            field2556 = null;
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(I[BB[BII)I")
    public final int method922(int arg0, byte[] arg1, byte arg2, byte[] arg3, int arg4, int arg5) {
        field2567++;
        int var7 = 0;
        int var8 = arg0 + arg4;
        int var9 = arg5 << 3;
        if (arg2 != -21) {
            method919(42, 118);
        }
        while (var8 > arg4) {
            int var10 = arg3[arg4] & 0xFF;
            int var11 = this.field2559[var10];
            byte var12 = this.field2562[var10];
            if (var12 == 0) {
                throw new RuntimeException("No codeword for data value " + var10);
            }
            int var13 = var9 >> 3;
            int var14 = var9 & 0x7;
            int var15 = (var14 + var12 - 1 >> 3) + var13;
            int var16 = var7 & -var14 >> 31;
            var9 += var12;
            int var17 = var14 + 24;
            arg1[var13] = (byte) (var7 = class6.method42(var16, var11 >>> var17));
            if (var15 > var13) {
                var14 = var17 - 8;
                var13++;
                arg1[var13] = (byte) (var7 = var11 >>> var14);
                if (var13 < var15) {
                    var13++;
                    var14 -= 8;
                    arg1[var13] = (byte) (var7 = var11 >>> var14);
                    if (var13 < var15) {
                        var14 -= 8;
                        var13++;
                        arg1[var13] = (byte) (var7 = var11 >>> var14);
                        if (var13 < var15) {
                            var13++;
                            var14 -= 8;
                            arg1[var13] = (byte) (var7 = var11 << -var14);
                        }
                    }
                }
            }
            arg4++;
        }
        return (var9 + 7 >> 3) - arg5;
    }

    @OriginalMember(owner = "client!oe", name = "<init>", descriptor = "([B)V")
    public class131(byte[] arg0) {
        int var2 = arg0.length;
        this.field2559 = new int[var2];
        int[] var3 = new int[33];
        this.field2566 = new int[8];
        this.field2562 = arg0;
        int var4 = 0;
        for (int var5 = 0; var5 < var2; var5++) {
            byte var6 = arg0[var5];
            if (var6 != 0) {
                int var7 = 0x1 << 32 - var6;
                int var8 = var3[var6];
                this.field2559[var5] = var8;
                int var9;
                if ((var7 & var8) == 0) {
                    for (int var10 = var6 - 1; var10 >= 1; var10--) {
                        int var11 = var3[var10];
                        if (var8 != var11) {
                            break;
                        }
                        int var12 = 0x1 << 32 - var10;
                        if ((var12 & var11) != 0) {
                            var3[var10] = var3[var10 - 1];
                            break;
                        }
                        var3[var10] = class6.method42(var11, var12);
                    }
                    var9 = var8 | var7;
                } else {
                    var9 = var3[var6 - 1];
                }
                var3[var6] = var9;
                for (int var13 = var6 + 1; var13 <= 32; var13++) {
                    if (var3[var13] == var8) {
                        var3[var13] = var9;
                    }
                }
                int var14 = 0;
                for (int var15 = 0; var15 < var6; var15++) {
                    int var16 = Integer.MIN_VALUE >>> var15;
                    if ((var8 & var16) == 0) {
                        var14++;
                    } else {
                        if (this.field2566[var14] == 0) {
                            this.field2566[var14] = var4;
                        }
                        var14 = this.field2566[var14];
                    }
                    if (this.field2566.length <= var14) {
                        int[] var17 = new int[this.field2566.length * 2];
                        for (int var18 = 0; var18 < this.field2566.length; var18++) {
                            var17[var18] = this.field2566[var18];
                        }
                        this.field2566 = var17;
                    }
                    int var19 = var16 >>> 1;
                }
                if (var4 <= var14) {
                    var4 = var14 + 1;
                }
                this.field2566[var14] = ~var5;
            }
        }
    }
}
