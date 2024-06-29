import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ch")
public class class199 {

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "[B")
    private byte[] field3409;

    @OriginalMember(owner = "client!ch", name = "g", descriptor = "[I")
    private int[] field3414;

    @OriginalMember(owner = "client!ch", name = "d", descriptor = "[I")
    private int[] field3411;

    @OriginalMember(owner = "client!ch", name = "h", descriptor = "Lpf;")
    public static class168 field3415 = new class168(128);

    @OriginalMember(owner = "client!ch", name = "c", descriptor = "I")
    public static int field3410;

    @OriginalMember(owner = "client!ch", name = "f", descriptor = "I")
    public static int field3413;

    @OriginalMember(owner = "client!ch", name = "i", descriptor = "I")
    public static int field3416;

    @OriginalMember(owner = "client!ch", name = "j", descriptor = "I")
    public static int field3417;

    @OriginalMember(owner = "client!ch", name = "k", descriptor = "I")
    public static int field3418;

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "Lvj;")
    public static class215 field3408;

    @OriginalMember(owner = "client!ch", name = "e", descriptor = "Lnh;")
    public static class57 field3412;

    @OriginalMember(owner = "client!ch", name = "m", descriptor = "[I")
    public static int[] field3420;

    @OriginalMember(owner = "client!ch", name = "l", descriptor = "[Lnf;")
    public static class213[] field3419;

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(Z)V")
    public static void method1282(boolean arg0) {
        field3415 = null;
        field3412 = null;
        field3419 = null;
        field3408 = null;
        field3420 = null;
        if (arg0) {
            field3419 = null;
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(Lnj;B)Lcf;")
    public static final class153 method1283(class226 arg0, byte arg1) {
        field3410++;
        if (arg1 != -59) {
            method1286((class239) null, 46, (class226) null, -122);
        }
        return new class153(arg0.method1433(121), arg0.method1433(arg1 + 170), arg0.method1433(107), arg0.method1433(127), arg0.method1444(171285352), arg0.method1444(arg1 ^ 0xF5CA64AD), arg0.method1471(255));
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(II[B[BIB)I")
    public final int method1284(int arg0, int arg1, byte[] arg2, byte[] arg3, int arg4, byte arg5) {
        if (arg5 != -113) {
            this.field3409 = null;
        }
        int var7 = 0;
        int var8 = arg0 + arg1;
        int var9 = arg4 << 3;
        field3413++;
        while (var8 > arg1) {
            int var10 = arg2[arg1] & 0xFF;
            byte var11 = this.field3409[var10];
            int var12 = this.field3411[var10];
            if (var11 == 0) {
                throw new RuntimeException("No codeword for data value " + var10);
            }
            int var13 = var9 >> 3;
            int var14 = var9 & 0x7;
            var9 += var11;
            int var15 = var7 & -var14 >> 31;
            int var16 = (var14 + var11 - 1 >> 3) + var13;
            int var17 = var14 + 24;
            arg3[var13] = (byte) (var7 = class246.method1640(var15, var12 >>> var17));
            if (var13 < var16) {
                var14 = var17 - 8;
                var13++;
                arg3[var13] = (byte) (var7 = var12 >>> var14);
                if (var16 > var13) {
                    var14 -= 8;
                    var13++;
                    arg3[var13] = (byte) (var7 = var12 >>> var14);
                    if (var16 > var13) {
                        var13++;
                        var14 -= 8;
                        arg3[var13] = (byte) (var7 = var12 >>> var14);
                        if (var13 < var16) {
                            var13++;
                            var14 -= 8;
                            arg3[var13] = (byte) (var7 = var12 << -var14);
                        }
                    }
                }
            }
            arg1++;
        }
        return (var9 + 7 >> 3) - arg4;
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(I[BZI[BI)I")
    public final int method1285(int arg0, byte[] arg1, boolean arg2, int arg3, byte[] arg4, int arg5) {
        field3417++;
        if (arg3 == 0) {
            return 0;
        }
        int var7 = arg0 + arg3;
        int var8 = 0;
        if (arg2) {
            this.method1284(-80, -54, (byte[]) null, (byte[]) null, 33, (byte) -60);
        }
        int var9 = arg5;
        while (true) {
            byte var10 = arg4[var9];
            if (var10 < 0) {
                var8 = this.field3414[var8];
            } else {
                var8++;
            }
            int var11;
            if ((var11 = this.field3414[var8]) < 0) {
                arg1[arg0++] = (byte) (~var11);
                if (var7 <= arg0) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x40) == 0) {
                var8++;
            } else {
                var8 = this.field3414[var8];
            }
            int var12;
            if ((var12 = this.field3414[var8]) < 0) {
                arg1[arg0++] = (byte) (~var12);
                if (arg0 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x20) == 0) {
                var8++;
            } else {
                var8 = this.field3414[var8];
            }
            int var13;
            if ((var13 = this.field3414[var8]) < 0) {
                arg1[arg0++] = (byte) (~var13);
                if (var7 <= arg0) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x10) == 0) {
                var8++;
            } else {
                var8 = this.field3414[var8];
            }
            int var14;
            if ((var14 = this.field3414[var8]) < 0) {
                arg1[arg0++] = (byte) (~var14);
                if (arg0 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x8) == 0) {
                var8++;
            } else {
                var8 = this.field3414[var8];
            }
            int var15;
            if ((var15 = this.field3414[var8]) < 0) {
                arg1[arg0++] = (byte) (~var15);
                if (arg0 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x4) == 0) {
                var8++;
            } else {
                var8 = this.field3414[var8];
            }
            int var16;
            if ((var16 = this.field3414[var8]) < 0) {
                arg1[arg0++] = (byte) (~var16);
                if (var7 <= arg0) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x2) == 0) {
                var8++;
            } else {
                var8 = this.field3414[var8];
            }
            int var17;
            if ((var17 = this.field3414[var8]) < 0) {
                arg1[arg0++] = (byte) (~var17);
                if (var7 <= arg0) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x1) == 0) {
                var8++;
            } else {
                var8 = this.field3414[var8];
            }
            int var18;
            if ((var18 = this.field3414[var8]) < 0) {
                arg1[arg0++] = (byte) (~var18);
                if (var7 <= arg0) {
                    break;
                }
                var8 = 0;
            }
            var9++;
        }
        return var9 + 1 - arg5;
    }

    @OriginalMember(owner = "client!ch", name = "<init>", descriptor = "([B)V")
    public class199(byte[] arg0) {
        int var2 = arg0.length;
        this.field3409 = arg0;
        this.field3414 = new int[8];
        int[] var3 = new int[33];
        int var4 = 0;
        this.field3411 = new int[var2];
        for (int var5 = 0; var5 < var2; var5++) {
            byte var6 = arg0[var5];
            if (var6 != 0) {
                int var7 = 0x1 << 32 - var6;
                int var8 = var3[var6];
                this.field3411[var5] = var8;
                int var9;
                if ((var8 & var7) == 0) {
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
                        var3[var10] = class246.method1640(var11, var12);
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
                        if (this.field3414[var14] == 0) {
                            this.field3414[var14] = var4;
                        }
                        var14 = this.field3414[var14];
                    }
                    if (var14 >= this.field3414.length) {
                        int[] var17 = new int[this.field3414.length * 2];
                        for (int var18 = 0; var18 < this.field3414.length; var18++) {
                            var17[var18] = this.field3414[var18];
                        }
                        this.field3414 = var17;
                    }
                    int var19 = var16 >>> 1;
                }
                if (var14 >= var4) {
                    var4 = var14 + 1;
                }
                this.field3414[var14] = ~var5;
            }
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(Lth;ILnj;I)V")
    public static final void method1286(class239 arg0, int arg1, class226 arg2, int arg3) {
        field3418++;
        class261 var4 = new class261();
        var4.field4545 = arg2.method1471(255);
        var4.field4546 = arg2.method1478(-32053);
        var4.field4551 = new int[var4.field4545];
        var4.field4548 = new int[var4.field4545];
        var4.field4550 = new class74[var4.field4545];
        var4.field4541 = new byte[var4.field4545][][];
        var4.field4547 = new class74[var4.field4545];
        var4.field4549 = new int[var4.field4545];
        for (int var5 = 0; var5 < var4.field4545; var5++) {
            try {
                int var6 = arg2.method1471(255);
                if (var6 == 0 || var6 == 1 || var6 == 2) {
                    String var7 = new String(arg2.method1480(-114).method1502((byte) 44));
                    String var8 = new String(arg2.method1480(-127).method1502((byte) 44));
                    int var9 = 0;
                    if (var6 == 1) {
                        var9 = arg2.method1478(-32053);
                    }
                    var4.field4548[var5] = var6;
                    var4.field4551[var5] = var9;
                    var4.field4547[var5] = arg0.method1600((byte) 85, class71.method429(-103, var7), var8);
                } else if (var6 == 3 || var6 == 4) {
                    String var10 = new String(arg2.method1480(-115).method1502((byte) 44));
                    String var11 = new String(arg2.method1480(-119).method1502((byte) 44));
                    int var12 = arg2.method1471(255);
                    String[] var13 = new String[var12];
                    for (int var14 = 0; var14 < var12; var14++) {
                        var13[var14] = new String(arg2.method1480(74).method1502((byte) 44));
                    }
                    byte[][] var15 = new byte[var12][];
                    if (var6 == 3) {
                        for (int var16 = 0; var16 < var12; var16++) {
                            int var17 = arg2.method1478(-32053);
                            var15[var16] = new byte[var17];
                            arg2.method1435(var15[var16], var17, (byte) -13, 0);
                        }
                    }
                    var4.field4548[var5] = var6;
                    Class[] var18 = new Class[var12];
                    for (int var19 = 0; var19 < var12; var19++) {
                        var18[var19] = class71.method429(-89, var13[var19]);
                    }
                    var4.field4550[var5] = arg0.method1595(var18, class71.method429(-73, var10), var11, 0);
                    var4.field4541[var5] = var15;
                }
            } catch (ClassNotFoundException var20) {
                var4.field4549[var5] = -1;
            } catch (SecurityException var21) {
                var4.field4549[var5] = -2;
            } catch (NullPointerException var22) {
                var4.field4549[var5] = -3;
            } catch (Exception var23) {
                var4.field4549[var5] = -4;
            } catch (Throwable var24) {
                var4.field4549[var5] = -5;
            }
        }
        if (arg1 > -14) {
            field3419 = null;
        }
        class213.field3602.method1272(5664, var4);
    }
}
