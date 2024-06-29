import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dv")
public class class451 {

    @OriginalMember(owner = "client!dv", name = "c", descriptor = "Lrp;")
    private class288 field6934 = new class288(64);

    @OriginalMember(owner = "client!dv", name = "q", descriptor = "Lrp;")
    public class288 field6948 = new class288(50);

    @OriginalMember(owner = "client!dv", name = "r", descriptor = "Lrp;")
    public class288 field6949 = new class288(5);

    @OriginalMember(owner = "client!dv", name = "f", descriptor = "Llt;")
    private class458 field6937;

    @OriginalMember(owner = "client!dv", name = "k", descriptor = "Llt;")
    public class458 field6942;

    @OriginalMember(owner = "client!dv", name = "p", descriptor = "Z")
    public boolean field6947;

    @OriginalMember(owner = "client!dv", name = "o", descriptor = "I")
    public static int field6946 = 0;

    @OriginalMember(owner = "client!dv", name = "t", descriptor = "I")
    public static int field6951;

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "I")
    public static int field6932;

    @OriginalMember(owner = "client!dv", name = "b", descriptor = "I")
    public static int field6933;

    @OriginalMember(owner = "client!dv", name = "d", descriptor = "I")
    public static int field6935;

    @OriginalMember(owner = "client!dv", name = "e", descriptor = "I")
    public static int field6936;

    @OriginalMember(owner = "client!dv", name = "g", descriptor = "I")
    public static int field6938;

    @OriginalMember(owner = "client!dv", name = "h", descriptor = "I")
    public static int field6939;

    @OriginalMember(owner = "client!dv", name = "i", descriptor = "I")
    public static int field6940;

    @OriginalMember(owner = "client!dv", name = "j", descriptor = "I")
    public static int field6941;

    @OriginalMember(owner = "client!dv", name = "l", descriptor = "I")
    public static int field6943;

    @OriginalMember(owner = "client!dv", name = "m", descriptor = "I")
    public static int field6944;

    @OriginalMember(owner = "client!dv", name = "n", descriptor = "I")
    public static int field6945;

    @OriginalMember(owner = "client!dv", name = "s", descriptor = "I")
    public int field6950;

    @OriginalMember(owner = "client!dv", name = "u", descriptor = "Lro;")
    public static class2 field6952;

    static {
        new class423("You are not allowed to join this user's clan channel.", "Du darfst den Chatraum dieses Benutzers nicht betreten.", "Vous n'êtes pas autorisé à rejoindre le canal de clan de cet utilisateur.", "Você não tem permissão para entrar no canal de clã desse usuário.");
        field6951 = 0;
    }

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "(IILta;II)V", line = 10)
    public static final void method2687(int arg0, int arg1, class135 arg2, int arg3, int arg4) {
        field6945++;
        class14 var5 = arg2.method892((byte) -110);
        int var6 = arg2.field2146 - arg2.field2211.field3297 & 0x3FFF;
        if (~arg1 == arg3) {
            if (var6 != 0 || arg2.field2164 > 25) {
                if (arg0 < 0 && var5.field155 != -1) {
                    arg2.field2201 = var5.field155;
                } else if (arg0 <= 0 || var5.field157 == -1) {
                    arg2.field2201 = var5.field188;
                } else {
                    arg2.field2201 = var5.field157;
                }
                arg2.field2196 = false;
            } else if (!arg2.field2196 || !var5.method70(arg2.field2201, (byte) 49)) {
                arg2.field2201 = var5.method73(-32157);
                arg2.field2196 = arg2.field2201 != -1;
            }
        } else if (arg2.field2148 != -1 && (var6 >= 10240 || var6 <= 2048)) {
            int var7 = class284.field4294[arg4] - arg2.field2211.field3297 & 0x3FFF;
            if (arg1 == 2 && var5.field173 != -1) {
                if (var7 > 2048 && var7 <= 6144 && var5.field168 != -1) {
                    arg2.field2201 = var5.field168;
                } else if (var7 >= 10240 && var7 < 14336 && var5.field151 != -1) {
                    arg2.field2201 = var5.field151;
                } else if (var7 <= 6144 || var7 >= 10240 || var5.field201 == -1) {
                    arg2.field2201 = var5.field173;
                } else {
                    arg2.field2201 = var5.field201;
                }
            } else if (arg1 == 0 && var5.field190 != -1) {
                if (var7 > 2048 && var7 <= 6144 && var5.field187 != -1) {
                    arg2.field2201 = var5.field187;
                } else if (var7 >= 10240 && var7 < 14336 && var5.field172 != -1) {
                    arg2.field2201 = var5.field172;
                } else if (var7 <= 6144 || var7 >= 10240 || var5.field169 == -1) {
                    arg2.field2201 = var5.field190;
                } else {
                    arg2.field2201 = var5.field169;
                }
            } else if (var7 > 2048 && var7 <= 6144 && var5.field202 != -1) {
                arg2.field2201 = var5.field202;
            } else if (var7 >= 10240 && var7 < 14336 && var5.field192 != -1) {
                arg2.field2201 = var5.field192;
            } else if (var7 <= 6144 || var7 >= 10240 || var5.field163 == -1) {
                arg2.field2201 = var5.field188;
            } else {
                arg2.field2201 = var5.field163;
            }
            arg2.field2196 = false;
        } else if (var6 == 0 && arg2.field2164 <= 25) {
            arg2.field2196 = false;
            if (arg1 == 2 && var5.field173 != -1) {
                arg2.field2201 = var5.field173;
            } else if (arg1 == 0 && var5.field190 != -1) {
                arg2.field2201 = var5.field190;
            } else {
                arg2.field2201 = var5.field188;
            }
        } else {
            arg2.field2196 = false;
            if (arg1 == 2 && var5.field173 != -1) {
                if (arg0 < 0 && var5.field185 != -1) {
                    arg2.field2201 = var5.field185;
                } else if (arg0 <= 0 || var5.field182 == -1) {
                    arg2.field2201 = var5.field173;
                } else {
                    arg2.field2201 = var5.field182;
                }
            } else if (arg1 == 0 && var5.field190 != -1) {
                if (arg0 < 0 && var5.field183 != -1) {
                    arg2.field2201 = var5.field183;
                } else if (arg0 <= 0 || var5.field159 == -1) {
                    arg2.field2201 = var5.field190;
                } else {
                    arg2.field2201 = var5.field159;
                }
            } else if (arg0 < 0 && var5.field199 != -1) {
                arg2.field2201 = var5.field199;
            } else if (arg0 <= 0 || var5.field174 == -1) {
                arg2.field2201 = var5.field188;
            } else {
                arg2.field2201 = var5.field174;
            }
        }
    }

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "(II)Lat;", line = 168)
    public final class245 method2688(int arg0, int arg1) {
        field6932++;
        class288 var3 = this.field6934;
        class245 var4;
        synchronized (this.field6934) {
            var4 = (class245) this.field6934.method1752(0, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field6937.method2715(class484.method2916(arg0, 104), class157.method1008(28644, arg0), false);
        class245 var6 = new class245();
        var6.field3709 = arg0;
        var6.field3679 = this;
        if (var5 != null) {
            var6.method1479(-109, new class40(var5));
        }
        var6.method1470(0);
        class288 var7 = this.field6934;
        synchronized (this.field6934) {
            this.field6934.method1758(1, var6, (long) arg0);
        }
        return arg1 == -8333 ? var6 : null;
    }

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "(I[BB)I", line = 198)
    public static final int method2689(int arg0, byte[] arg1, byte arg2) {
        field6936++;
        int var3 = 76 % ((arg2 + 9) / 45);
        return class353.method2151(0, arg1, -1, arg0);
    }

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "(B)V", line = 208)
    public static final void method2690(byte arg0) {
        field6944++;
        int var1 = class491.field7457.method232((byte) 126);
        int var2 = class491.field7457.method247((byte) 0);
        class21.field269 = class491.field7457.method232((byte) 119);
        boolean var3 = class491.field7457.method232((byte) 123) == 1;
        int var4 = class491.field7457.method254((byte) -65);
        class384.method2299(var1, (byte) 122);
        class491.field7457.method2367(8);
        for (int var5 = 0; var5 < 4; var5++) {
            for (int var20 = 0; var20 < class150.field2422 >> 3; var20++) {
                for (int var21 = 0; var21 < class21.field272 >> 3; var21++) {
                    int var22 = class491.field7457.method2364(1, true);
                    if (var22 == 1) {
                        class420.field6038[var5][var20][var21] = class491.field7457.method2364(26, true);
                    } else {
                        class420.field6038[var5][var20][var21] = -1;
                    }
                }
            }
        }
        class491.field7457.method2373(false);
        int var6 = (class60.field1014 - class491.field7457.field585) / 16;
        class312.field4699 = new int[var6][4];
        if (arg0 < 41) {
            method2693((byte) -48);
        }
        for (int var7 = 0; var7 < var6; var7++) {
            for (int var19 = 0; var19 < 4; var19++) {
                class312.field4699[var7][var19] = class491.field7457.method255((byte) 96);
            }
        }
        class461.field7092 = new byte[var6][];
        class469.field7187 = new int[var6];
        class105.field1852 = new int[var6];
        class423.field6058 = new int[var6];
        class38.field512 = new int[var6];
        class167.field2591 = null;
        class251.field3838 = new byte[var6][];
        class358.field5314 = null;
        class311.field4685 = new byte[var6][];
        class216.field3335 = new byte[var6][];
        class61.field1032 = new int[var6];
        int var8 = 0;
        for (int var9 = 0; var9 < 4; var9++) {
            for (int var10 = 0; var10 < (class150.field2422 >> 3); var10++) {
                for (int var11 = 0; var11 < (class21.field272 >> 3); var11++) {
                    int var12 = class420.field6038[var9][var10][var11];
                    if (var12 != -1) {
                        int var13 = var12 >> 14 & 0x3FF;
                        int var14 = (var12 & 0x3FF8) >> 3;
                        int var15 = (var13 / 8 << 8) + (var14 / 8);
                        for (int var16 = 0; var16 < var8; var16++) {
                            if (class61.field1032[var16] == var15) {
                                var15 = -1;
                                break;
                            }
                        }
                        if (var15 != -1) {
                            class61.field1032[var8] = var15;
                            int var17 = (var15 & 0xFFA2) >> 8;
                            int var18 = var15 & 0xFF;
                            class469.field7187[var8] = class73.field1310.method2720("m" + var17 + "_" + var18, 1);
                            class105.field1852[var8] = class73.field1310.method2720("l" + var17 + "_" + var18, 1);
                            class423.field6058[var8] = class73.field1310.method2720("um" + var17 + "_" + var18, 1);
                            class38.field512[var8] = class73.field1310.method2720("ul" + var17 + "_" + var18, 1);
                            var8++;
                        }
                    }
                }
            }
        }
        class121.method842(var3, var4, (byte) -121, false, var2);
    }

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "(I)V", line = 356)
    public final void method2691(int arg0) {
        class288 var2 = this.field6934;
        synchronized (this.field6934) {
            this.field6934.method1761(-112);
        }
        field6939++;
        class288 var3 = this.field6948;
        synchronized (this.field6948) {
            this.field6948.method1761(arg0 ^ 0xFFFFFF82);
        }
        class288 var4 = this.field6949;
        synchronized (this.field6949) {
            if (arg0 == 0) {
                this.field6949.method1761(arg0 - 111);
            }
        }
    }

    @OriginalMember(owner = "client!dv", name = "b", descriptor = "(II)V", line = 375)
    public final void method2692(int arg0, int arg1) {
        field6941++;
        this.field6950 = arg0;
        class288 var3 = this.field6948;
        synchronized (this.field6948) {
            this.field6948.method1761(-126);
            if (arg1 >= 0) {
                this.method2697(-40, -7);
            }
        }
        class288 var4 = this.field6949;
        synchronized (this.field6949) {
            this.field6949.method1761(-109);
        }
    }

    @OriginalMember(owner = "client!dv", name = "b", descriptor = "(B)V", line = 393)
    public static void method2693(byte arg0) {
        if (arg0 >= -111) {
            field6951 = 24;
        }
        field6952 = null;
    }

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "(IZ)V", line = 404)
    public final void method2694(int arg0, boolean arg1) {
        field6943++;
        if (arg1 == this.field6947) {
            return;
        }
        this.field6947 = arg1;
        if (arg0 != -26) {
            this.field6942 = null;
        }
        this.method2691(0);
    }

    @OriginalMember(owner = "client!dv", name = "c", descriptor = "(B)V", line = 426)
    public final void method2695(byte arg0) {
        class288 var2 = this.field6934;
        synchronized (this.field6934) {
            this.field6934.method1749((byte) 123);
        }
        if (arg0 > -56) {
            this.method2696(-49);
        }
        field6938++;
        class288 var3 = this.field6948;
        synchronized (this.field6948) {
            this.field6948.method1749((byte) 124);
        }
        class288 var4 = this.field6949;
        synchronized (this.field6949) {
            this.field6949.method1749((byte) -104);
        }
    }

    @OriginalMember(owner = "client!dv", name = "b", descriptor = "(I)V", line = 447)
    public final void method2696(int arg0) {
        class288 var2 = this.field6948;
        synchronized (this.field6948) {
            this.field6948.method1761(arg0 - 117);
        }
        field6935++;
        if (arg0 != -1) {
            this.field6942 = null;
        }
        class288 var3 = this.field6949;
        synchronized (this.field6949) {
            this.field6949.method1761(-127);
        }
    }

    @OriginalMember(owner = "client!dv", name = "c", descriptor = "(II)V", line = 467)
    public final void method2697(int arg0, int arg1) {
        class288 var3 = this.field6934;
        synchronized (this.field6934) {
            this.field6934.method1760(arg0, arg1 ^ 0x6EBE);
        }
        field6940++;
        class288 var4 = this.field6948;
        synchronized (this.field6948) {
            this.field6948.method1760(arg0, arg1 + 24254);
        }
        class288 var5 = this.field6949;
        synchronized (this.field6949) {
            this.field6949.method1760(arg0, arg1 + 24254);
        }
        if (arg1 != 6144) {
            this.field6937 = null;
        }
    }

    @OriginalMember(owner = "client!dv", name = "<init>", descriptor = "(Lcm;IZLlt;Llt;)V", line = 506)
    public class451(class491 arg0, int arg1, boolean arg2, class458 arg3, class458 arg4) {
        this.field6937 = arg3;
        this.field6942 = arg4;
        this.field6947 = arg2;
        if (this.field6937 != null) {
            int var6 = this.field6937.method2738((byte) 109) - 1;
            this.field6937.method2726((byte) 113, var6);
        }
    }
}
