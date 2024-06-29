import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wp")
public class class310 {

    @OriginalMember(owner = "client!wp", name = "u", descriptor = "Lof;")
    private class328 field4857 = new class328(64);

    @OriginalMember(owner = "client!wp", name = "A", descriptor = "Lof;")
    public class328 field4863 = new class328(50);

    @OriginalMember(owner = "client!wp", name = "B", descriptor = "Lqd;")
    public class398 field4864 = new class398(250);

    @OriginalMember(owner = "client!wp", name = "C", descriptor = "Lge;")
    private class13 field4865 = new class13();

    @OriginalMember(owner = "client!wp", name = "k", descriptor = "Z")
    private boolean field4847;

    @OriginalMember(owner = "client!wp", name = "e", descriptor = "I")
    public int field4841;

    @OriginalMember(owner = "client!wp", name = "D", descriptor = "Lte;")
    private class187 field4866;

    @OriginalMember(owner = "client!wp", name = "c", descriptor = "Lmn;")
    private class162 field4839;

    @OriginalMember(owner = "client!wp", name = "i", descriptor = "Lmn;")
    public class162 field4845;

    @OriginalMember(owner = "client!wp", name = "d", descriptor = "I")
    public int field4840;

    @OriginalMember(owner = "client!wp", name = "E", descriptor = "[Ljava/lang/String;")
    private String[] field4867;

    @OriginalMember(owner = "client!wp", name = "F", descriptor = "[Ljava/lang/String;")
    private String[] field4868;

    @OriginalMember(owner = "client!wp", name = "f", descriptor = "I")
    public static int field4842 = 0;

    @OriginalMember(owner = "client!wp", name = "q", descriptor = "[B")
    public static byte[] field4853 = new byte[2048];

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "I")
    public static int field4837;

    @OriginalMember(owner = "client!wp", name = "b", descriptor = "I")
    public static int field4838;

    @OriginalMember(owner = "client!wp", name = "g", descriptor = "I")
    public static int field4843;

    @OriginalMember(owner = "client!wp", name = "l", descriptor = "I")
    public static int field4848;

    @OriginalMember(owner = "client!wp", name = "m", descriptor = "I")
    public static int field4849;

    @OriginalMember(owner = "client!wp", name = "n", descriptor = "I")
    public static int field4850;

    @OriginalMember(owner = "client!wp", name = "o", descriptor = "I")
    public static int field4851;

    @OriginalMember(owner = "client!wp", name = "p", descriptor = "I")
    public static int field4852;

    @OriginalMember(owner = "client!wp", name = "r", descriptor = "I")
    public static int field4854;

    @OriginalMember(owner = "client!wp", name = "s", descriptor = "I")
    public static int field4855;

    @OriginalMember(owner = "client!wp", name = "t", descriptor = "I")
    public static int field4856;

    @OriginalMember(owner = "client!wp", name = "w", descriptor = "I")
    public static int field4859;

    @OriginalMember(owner = "client!wp", name = "x", descriptor = "I")
    public static int field4860;

    @OriginalMember(owner = "client!wp", name = "y", descriptor = "I")
    public static int field4861;

    @OriginalMember(owner = "client!wp", name = "G", descriptor = "I")
    public int field4869;

    @OriginalMember(owner = "client!wp", name = "z", descriptor = "Lvt;")
    public static class522 field4862;

    @OriginalMember(owner = "client!wp", name = "h", descriptor = "Lsm;")
    public static class70 field4844;

    @OriginalMember(owner = "client!wp", name = "v", descriptor = "Z")
    public static boolean field4858;

    @OriginalMember(owner = "client!wp", name = "j", descriptor = "[Z")
    public static boolean[] field4846;

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(BILza;IIILbk;I)Lo;")
    public final class139 method2074(byte arg0, int arg1, class497 arg2, int arg3, int arg4, int arg5, class78 arg6, int arg7) {
        this.field4865.field146 = arg1;
        this.field4865.field137 = arg5;
        int var9 = -113 / ((arg0 - 47) / 62);
        this.field4865.field141 = arg6 != null;
        field4848++;
        this.field4865.field136 = arg2.field7472;
        this.field4865.field138 = arg4;
        this.field4865.field143 = arg3;
        this.field4865.field135 = arg7;
        return (class139) this.field4864.method2559(this.field4865, (byte) -115);
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(B)V")
    public final void method2075(byte arg0) {
        class328 var2 = this.field4857;
        synchronized (this.field4857) {
            this.field4857.method2187(-1);
        }
        if (arg0 != -23) {
            field4853 = null;
        }
        field4855++;
        class328 var3 = this.field4863;
        synchronized (this.field4863) {
            this.field4863.method2187(arg0 ^ 0x16);
        }
        class398 var4 = this.field4864;
        synchronized (this.field4864) {
            this.field4864.method2565(0);
        }
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(IB)V")
    public final void method2076(int arg0, byte arg1) {
        field4837++;
        class328 var3 = this.field4857;
        synchronized (this.field4857) {
            this.field4857.method2202(0, arg0);
        }
        class328 var4 = this.field4863;
        synchronized (this.field4863) {
            this.field4863.method2202(0, arg0);
        }
        class398 var5 = this.field4864;
        synchronized (this.field4864) {
            this.field4864.method2566(arg0, 6780);
            int var6 = 12 % ((arg1 - 27) / 49);
        }
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(BI)Lro;")
    public final class196 method2077(byte arg0, int arg1) {
        field4860++;
        class328 var3 = this.field4857;
        class196 var4;
        synchronized (this.field4857) {
            var4 = (class196) this.field4857.method2191((byte) -73, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class162 var5 = this.field4839;
        byte[] var6;
        synchronized (this.field4839) {
            var6 = this.field4839.method1004(class239.method1676(112, arg1), false, class254.method1743(arg0 + 65, arg1));
        }
        class196 var7 = new class196();
        var7.field2992 = arg1;
        var7.field2988 = this;
        var7.field3011 = new String[] { null, null, class207.field3151.method1583(79, this.field4841), null, null };
        var7.field3000 = new String[] { null, null, null, null, class297.field4677.method1583(79, this.field4841) };
        if (var6 != null) {
            var7.method1354(new class208(var6), (byte) -6);
        }
        var7.method1356(-112);
        if (var7.field3010 != -1) {
            var7.method1340(this.method2077((byte) -65, var7.field3010), -31460, this.method2077((byte) -65, var7.field3017));
        }
        if (var7.field2983 != -1) {
            var7.method1353((byte) -111, this.method2077((byte) -65, var7.field2984), this.method2077((byte) -65, var7.field2983));
        }
        if (!this.field4847 && var7.field3002) {
            var7.field3034 = class207.field3152.method1583(arg0 + 172, this.field4841);
            var7.field2995 = null;
            var7.field3000 = this.field4868;
            var7.field2969 = false;
            var7.field3011 = this.field4867;
            var7.field2999 = 0;
            if (var7.field2956 != null) {
                boolean var8 = false;
                for (class529 var9 = var7.field2956.method1119(false); var9 != null; var9 = var7.field2956.method1121((byte) -124)) {
                    class442 var10 = this.field4866.method1171((byte) 82, (int) var9.field7780);
                    if (var10.field6879) {
                        var9.method3149(54);
                    } else {
                        var8 = true;
                    }
                }
                if (!var8) {
                    var7.field2956 = null;
                }
            }
        }
        if (arg0 != -65) {
            this.field4866 = null;
        }
        class328 var11 = this.field4857;
        synchronized (this.field4857) {
            this.field4857.method2188(arg0 - 63, (long) arg1, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!wp", name = "b", descriptor = "(B)V")
    public final void method2078(byte arg0) {
        field4850++;
        class328 var2 = this.field4863;
        synchronized (this.field4863) {
            this.field4863.method2189(false);
        }
        int var3 = 79 / ((arg0 - 8) / 42);
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(I)V")
    public static void method2079(int arg0) {
        field4846 = null;
        field4853 = null;
        field4862 = null;
        if (arg0 != 250) {
            field4858 = true;
        }
        field4844 = null;
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(ZZ)V")
    public final void method2080(boolean arg0, boolean arg1) {
        if (arg1) {
            this.method2077((byte) -100, 69);
        }
        field4856++;
        if (arg0 != this.field4847) {
            this.field4847 = arg0;
            this.method2088(89);
        }
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(Lbk;BILla;ILza;ZLza;IZII)Lo;")
    public final class139 method2081(class78 arg0, byte arg1, int arg2, class299 arg3, int arg4, class497 arg5, boolean arg6, class497 arg7, int arg8, boolean arg9, int arg10, int arg11) {
        field4861++;
        if (arg1 >= -102) {
            method2086(null, null, false, null, null);
        }
        class139 var13 = this.method2074((byte) 120, arg11, arg7, arg10, arg4, arg2, arg0, arg8);
        if (var13 != null) {
            return var13;
        }
        class196 var14 = this.method2077((byte) -65, arg4);
        if (arg8 > 1 && var14.field2972 != null) {
            int var15 = -1;
            for (int var16 = 0; var16 < 10; var16++) {
                if (arg8 >= var14.field2994[var16] && var14.field2994[var16] != 0) {
                    var15 = var14.field2972[var16];
                }
            }
            if (var15 != -1) {
                var14 = this.method2077((byte) -65, var15);
            }
        }
        int[] var17 = var14.method1338(arg3, 100, arg8, arg0, arg5, arg6, arg7, arg11, arg10, arg2);
        if (var17 == null) {
            return null;
        }
        class139 var18;
        if (arg9) {
            var18 = arg5.method1232(var17, 0, 36, 36, 32);
        } else {
            var18 = arg7.method1232(var17, 0, 36, 36, 32);
        }
        if (!arg9) {
            class13 var19 = new class13();
            var19.field135 = arg8;
            var19.field138 = arg4;
            var19.field136 = arg7.field7472;
            var19.field143 = arg10;
            var19.field137 = arg2;
            var19.field141 = arg0 != null;
            var19.field146 = arg11;
            this.field4864.method2560(var19, var18, -99);
        }
        return var18;
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(BILmn;I)Laq;")
    public static final class340 method2082(byte arg0, int arg1, class162 arg2, int arg3) {
        field4859++;
        if (arg0 == 121) {
            byte[] var4 = arg2.method1004(arg3, false, arg1);
            return var4 == null ? null : new class340(var4);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(ILgf;IB)Laa;")
    public static final class57 method2083(int arg0, class46 arg1, int arg2, byte arg3) {
        if (arg3 > -27) {
            return null;
        }
        field4852++;
        int var4 = arg1.field598 | arg2 << 8;
        class57 var5 = (class57) class364.field5628.method2130(false, (long) var4 << 16);
        if (var5 != null) {
            return var5;
        }
        byte[] var6 = class467.field7157.method1010(class467.field7157.method995(var4, (byte) -93), (byte) 124);
        if (var6 == null) {
            int var8 = arg0 + 65536 << 8 | arg1.field598;
            class57 var9 = (class57) class364.field5628.method2130(false, (long) var8 << 16);
            if (var9 != null) {
                return var9;
            }
            byte[] var10 = class467.field7157.method1010(class467.field7157.method995(var8, (byte) -125), (byte) 101);
            if (var10 == null) {
                int var12 = arg1.field598 | 0xFFFF00;
                class57 var13 = (class57) class364.field5628.method2130(false, (long) var12 << 16);
                if (var13 != null) {
                    return var13;
                }
                byte[] var14 = class467.field7157.method1010(class467.field7157.method995(var12, (byte) -85), (byte) 112);
                if (var14 == null) {
                    return null;
                } else if (var14.length <= 1) {
                    return null;
                } else {
                    class57 var15 = class131.method814(var14, (byte) 74);
                    var15.field914 = arg1;
                    class364.field5628.method2132(var15, (long) var12 << 16, 21826);
                    return var15;
                }
            } else if (var10.length <= 1) {
                return null;
            } else {
                class57 var11 = class131.method814(var10, (byte) 74);
                var11.field914 = arg1;
                class364.field5628.method2132(var11, (long) var8 << 16, 21826);
                return var11;
            }
        } else if (var6.length <= 1) {
            return null;
        } else {
            class57 var7 = class131.method814(var6, (byte) 74);
            var7.field914 = arg1;
            class364.field5628.method2132(var7, (long) var4 << 16, 21826);
            return var7;
        }
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(II)V")
    public final void method2084(int arg0, int arg1) {
        this.field4869 = arg0;
        field4851++;
        class328 var3 = this.field4863;
        synchronized (this.field4863) {
            this.field4863.method2189(false);
        }
        int var4 = 37 / ((33 - arg1) / 57);
    }

    @OriginalMember(owner = "client!wp", name = "b", descriptor = "(I)V")
    public static final void method2085(int arg0) {
        field4838++;
        int var1 = class140.field1906.length;
        if (arg0 != 17106) {
            method2086(null, null, true, null, null);
        }
        for (int var2 = 0; var2 < var1; var2++) {
            if (class140.field1906[var2] != null) {
                int var3 = -1;
                for (int var4 = 0; var4 < class511.field7603; var4++) {
                    if (class92.field1347[var4] == class529.field7782[var2]) {
                        var3 = var4;
                        break;
                    }
                }
                if (var3 == -1) {
                    class92.field1347[class511.field7603] = class529.field7782[var2];
                    var3 = class511.field7603++;
                }
                class208 var5 = new class208(class140.field1906[var2]);
                int var6 = 0;
                while (var5.field3162 < class140.field1906[var2].length && var6 < 511 && class378.field5815 < 1023) {
                    int var7 = var6++ << 6 | var3;
                    int var8 = var5.method1455(-3387);
                    int var9 = var8 >> 14;
                    int var10 = (var8 & 0x1FDF) >> 7;
                    int var11 = var8 & 0x3F;
                    int var12 = (class529.field7782[var2] >> 8) * 64 + var10 - class453.field7018;
                    int var13 = (class529.field7782[var2] & 0xFF) * 64 + var11 - class126.field1718;
                    class191 var14 = class6.field72.method2977(var5.method1455(-3387), 50);
                    class38 var15 = (class38) class365.field5659.method1122((byte) 59, (long) var7);
                    if (var15 == null && (var14.field2790 & 0x1) > 0 && class254.field4119 == var9 && var12 >= 0 && (var14.field2809 + var12) < class135.field1839 && var13 >= 0 && var14.field2809 + var13 < class197.field3038) {
                        class378 var16 = new class378();
                        var16.field847 = var7;
                        class38 var17 = new class38(var16);
                        class365.field5659.method1127(var17, (byte) 65, (long) var7);
                        class14.field150[class78.field1176++] = var17;
                        class81.field1198[class378.field5815++] = var7;
                        var16.field801 = class88.field1278;
                        var16.method2443(var14, (byte) -120);
                        var16.method430((byte) -59, var16.field5809.field2809);
                        var16.field850 = var16.field5809.field2830 << 3;
                        var16.method426(true, var16.field5809.field2810 + 4 << 11 & 0x3DBB, (byte) -111);
                        var16.method2441(var16.method415(-4), var12, var9, var13, (byte) -20, true);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "([I[IZLgh;[I)V")
    public static final void method2086(int[] arg0, int[] arg1, boolean arg2, class350 arg3, int[] arg4) {
        field4849++;
        int var5 = 0;
        if (!arg2) {
            field4862 = null;
        }
        while (arg1.length > var5) {
            int var6 = arg1[var5];
            int var7 = arg4[var5];
            int var8 = arg0[var5];
            int var9 = 0;
            while (var7 != 0 && arg3.field818.length > var9) {
                if ((var7 & 0x1) != 0) {
                    if (var6 == -1) {
                        arg3.field818[var9] = null;
                    } else {
                        class363 var10 = class388.field5915.method1703(var6, -12536);
                        int var11 = var10.field5621;
                        class75 var12 = arg3.field818[var9];
                        if (var12 != null) {
                            if (var12.field1120 == var6) {
                                if (var11 == 0) {
                                    var12 = arg3.field818[var9] = null;
                                } else if (var11 == 1) {
                                    var12.field1118 = 1;
                                    var12.field1121 = 0;
                                    var12.field1119 = var8;
                                    var12.field1122 = 0;
                                    var12.field1114 = 0;
                                    class35.method217((byte) -44, class358.field5565 == arg3, 0, var10, arg3.field6417, arg3.field6410, arg3.field6419);
                                } else if (var11 == 2) {
                                    var12.field1121 = 0;
                                }
                            } else if (var10.field5608 >= class388.field5915.method1703(var12.field1120, -12536).field5608) {
                                var12 = arg3.field818[var9] = null;
                            }
                        }
                        if (var12 == null) {
                            class75 var13 = arg3.field818[var9] = new class75();
                            var13.field1119 = var8;
                            var13.field1118 = 1;
                            var13.field1114 = 0;
                            var13.field1121 = 0;
                            var13.field1122 = 0;
                            var13.field1120 = var6;
                            class35.method217((byte) -44, class358.field5565 == arg3, 0, var10, arg3.field6417, arg3.field6410, arg3.field6419);
                        }
                    }
                }
                var9++;
                var7 >>>= 0x1;
            }
            var5++;
        }
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(Z)V")
    public final void method2087(boolean arg0) {
        field4854++;
        if (!arg0) {
            class398 var2 = this.field4864;
            synchronized (this.field4864) {
                this.field4864.method2563(119);
            }
        }
    }

    @OriginalMember(owner = "client!wp", name = "c", descriptor = "(I)V")
    public final void method2088(int arg0) {
        class328 var2 = this.field4857;
        synchronized (this.field4857) {
            this.field4857.method2189(false);
        }
        int var3 = 121 % ((22 - arg0) / 61);
        field4843++;
        class328 var4 = this.field4863;
        synchronized (this.field4863) {
            this.field4863.method2189(false);
        }
        class398 var5 = this.field4864;
        synchronized (this.field4864) {
            this.field4864.method2563(122);
        }
    }

    @OriginalMember(owner = "client!wp", name = "<init>", descriptor = "(Lpr;IZLte;Lmn;Lmn;)V")
    public class310(class236 arg0, int arg1, boolean arg2, class187 arg3, class162 arg4, class162 arg5) {
        this.field4847 = arg2;
        this.field4841 = arg1;
        this.field4866 = arg3;
        this.field4839 = arg4;
        this.field4845 = arg5;
        if (this.field4839 == null) {
            this.field4840 = 0;
        } else {
            int var7 = this.field4839.method1023(127) - 1;
            this.field4840 = this.field4839.method1008(var7, (byte) -21) + var7 * 256;
        }
        this.field4867 = new String[] { null, null, class207.field3151.method1583(124, this.field4841), null, null };
        this.field4868 = new String[] { null, null, null, null, class297.field4677.method1583(80, this.field4841) };
    }
}
