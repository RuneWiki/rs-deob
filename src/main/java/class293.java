import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!te")
public class class293 {

    @OriginalMember(owner = "client!te", name = "n", descriptor = "Lwg;")
    private class198 field4860 = new class198();

    @OriginalMember(owner = "client!te", name = "t", descriptor = "Lwg;")
    private class198 field4866 = new class198();

    @OriginalMember(owner = "client!te", name = "x", descriptor = "Lwg;")
    private class198 field4870 = new class198();

    @OriginalMember(owner = "client!te", name = "A", descriptor = "Lwg;")
    private class198 field4873 = new class198();

    @OriginalMember(owner = "client!te", name = "C", descriptor = "Lfh;")
    private class313 field4875 = new class313(4);

    @OriginalMember(owner = "client!te", name = "F", descriptor = "B")
    private byte field4878 = 0;

    @OriginalMember(owner = "client!te", name = "H", descriptor = "I")
    public volatile int field4880 = 0;

    @OriginalMember(owner = "client!te", name = "G", descriptor = "I")
    public volatile int field4879 = 0;

    @OriginalMember(owner = "client!te", name = "I", descriptor = "Lfh;")
    private class313 field4881 = new class313(8);

    @OriginalMember(owner = "client!te", name = "g", descriptor = "Ljava/lang/String;")
    public static String field4853 = "Loading defaults - ";

    @OriginalMember(owner = "client!te", name = "j", descriptor = "C")
    public static char field4856;

    @OriginalMember(owner = "client!te", name = "a", descriptor = "I")
    public static int field4847;

    @OriginalMember(owner = "client!te", name = "b", descriptor = "I")
    public static int field4848;

    @OriginalMember(owner = "client!te", name = "d", descriptor = "I")
    public static int field4850;

    @OriginalMember(owner = "client!te", name = "e", descriptor = "I")
    public static int field4851;

    @OriginalMember(owner = "client!te", name = "f", descriptor = "I")
    public static int field4852;

    @OriginalMember(owner = "client!te", name = "h", descriptor = "I")
    public static int field4854;

    @OriginalMember(owner = "client!te", name = "i", descriptor = "I")
    public static int field4855;

    @OriginalMember(owner = "client!te", name = "k", descriptor = "I")
    public static int field4857;

    @OriginalMember(owner = "client!te", name = "l", descriptor = "I")
    public static int field4858;

    @OriginalMember(owner = "client!te", name = "o", descriptor = "I")
    public static int field4861;

    @OriginalMember(owner = "client!te", name = "p", descriptor = "I")
    public static int field4862;

    @OriginalMember(owner = "client!te", name = "q", descriptor = "I")
    public static int field4863;

    @OriginalMember(owner = "client!te", name = "r", descriptor = "I")
    public static int field4864;

    @OriginalMember(owner = "client!te", name = "s", descriptor = "I")
    public static int field4865;

    @OriginalMember(owner = "client!te", name = "u", descriptor = "I")
    public static int field4867;

    @OriginalMember(owner = "client!te", name = "v", descriptor = "I")
    public static int field4868;

    @OriginalMember(owner = "client!te", name = "w", descriptor = "I")
    public static int field4869;

    @OriginalMember(owner = "client!te", name = "y", descriptor = "I")
    public static int field4871;

    @OriginalMember(owner = "client!te", name = "z", descriptor = "I")
    public static int field4872;

    @OriginalMember(owner = "client!te", name = "B", descriptor = "I")
    private int field4874;

    @OriginalMember(owner = "client!te", name = "D", descriptor = "J")
    private long field4876;

    @OriginalMember(owner = "client!te", name = "E", descriptor = "Lfa;")
    private class102 field4877;

    @OriginalMember(owner = "client!te", name = "m", descriptor = "Lnm;")
    public static class221 field4859;

    @OriginalMember(owner = "client!te", name = "J", descriptor = "Lnd;")
    private class256 field4882;

    @OriginalMember(owner = "client!te", name = "c", descriptor = "Llj;")
    public static class289 field4849;

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(IZI)I", line = 4)
    public static final int method2067(int arg0, boolean arg1, int arg2) {
        if (!arg1) {
            field4861 = -51;
        }
        field4855++;
        class220 var3 = (class220) class294.field4888.method29((long) arg0, 103);
        if (var3 == null) {
            return -1;
        } else if (arg2 >= 0 && arg2 < var3.field3377.length) {
            return var3.field3377[arg2];
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(Z)V", line = 25)
    public static final void method2068(boolean arg0) {
        class294.field4888 = new class4(32);
        if (!arg0) {
            field4859 = (class221) null;
        }
        field4862++;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(ZB)V", line = 40)
    public final void method2069(boolean arg0, byte arg1) {
        field4848++;
        if (this.field4877 == null) {
            return;
        }
        try {
            this.field4875.field5137 = 0;
            this.field4875.method2193(arg0 ? 2 : 3, false);
            this.field4875.method2251(0, (byte) -59);
            this.field4877.method669(0, this.field4875.field5124, 4, (byte) -124);
        } catch (IOException var6) {
            try {
                this.field4877.method674((byte) -83);
            } catch (Exception var5) {
            }
            this.field4879 = -2;
            this.field4880++;
            this.field4877 = null;
        }
        if (arg1 != 112) {
            this.field4860 = (class198) null;
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(I)V", line = 69)
    public final void method2070(int arg0) {
        int var2 = -69 % ((arg0 - 28) / 44);
        if (this.field4877 != null) {
            this.field4877.method672(99);
        }
        field4852++;
    }

    @OriginalMember(owner = "client!te", name = "b", descriptor = "(I)V", line = 81)
    public final void method2071(int arg0) {
        try {
            this.field4877.method674((byte) -83);
        } catch (Exception var3) {
        }
        this.field4880++;
        this.field4877 = null;
        field4850++;
        if (arg0 > 122) {
            this.field4879 = -1;
            this.field4878 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
        }
    }

    @OriginalMember(owner = "client!te", name = "c", descriptor = "(I)V", line = 102)
    public final void method2072(int arg0) {
        field4871++;
        if (this.field4877 == null) {
            return;
        }
        try {
            this.field4875.field5137 = 0;
            this.field4875.method2193(7, false);
            this.field4875.method2251(0, (byte) -46);
            this.field4877.method669(0, this.field4875.field5124, 4, (byte) -83);
        } catch (IOException var6) {
            try {
                this.field4877.method674((byte) -83);
            } catch (Exception var5) {
            }
            this.field4877 = null;
            this.field4880++;
            this.field4879 = -2;
        }
        int var4 = 110 % ((arg0 + 21) / 44);
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(BIIBZ)Lnd;", line = 130)
    public final class256 method2073(byte arg0, int arg1, int arg2, byte arg3, boolean arg4) {
        field4865++;
        if (arg0 >= -51) {
            field4856 = '+';
        }
        long var6 = (long) ((arg2 << 16) + arg1);
        class256 var8 = new class256();
        var8.field4057 = arg3;
        var8.field1518 = arg4;
        var8.field5011 = var6;
        if (arg4) {
            if (this.method2078(-21) >= 20) {
                throw new RuntimeException();
            }
            this.field4860.method1353(-1, var8);
        } else if (this.method2084((byte) -62) < 20) {
            this.field4870.method1353(-1, var8);
        } else {
            throw new RuntimeException();
        }
        return var8;
    }

    @OriginalMember(owner = "client!te", name = "d", descriptor = "(I)Z", line = 177)
    public final boolean method2074(int arg0) {
        field4869++;
        if (this.field4877 != null) {
            long var2 = class19.method122(-12169);
            int var4 = (int) (var2 - this.field4876);
            this.field4876 = var2;
            if (var4 > 200) {
                var4 = 200;
            }
            this.field4874 += var4;
            if (this.field4874 > 30000) {
                try {
                    this.field4877.method674((byte) -83);
                } catch (Exception var30) {
                }
                this.field4877 = null;
            }
        }
        if (this.field4877 == null) {
            return this.method2078(-21) == 0 && this.method2084((byte) -62) == 0;
        }
        try {
            this.field4877.method671((byte) -33);
            for (class256 var6 = (class256) this.field4860.method1350(0); var6 != null; var6 = (class256) this.field4860.method1351(arg0 - 100)) {
                this.field4875.field5137 = 0;
                this.field4875.method2193(1, false);
                this.field4875.method2251((int) var6.field5011, (byte) -84);
                this.field4877.method669(0, this.field4875.field5124, 4, (byte) -99);
                this.field4866.method1353(-1, var6);
            }
            if (arg0 != -1) {
                return false;
            }
            for (class256 var7 = (class256) this.field4870.method1350(0); var7 != null; var7 = (class256) this.field4870.method1351(-101)) {
                this.field4875.field5137 = 0;
                this.field4875.method2193(0, false);
                this.field4875.method2251((int) var7.field5011, (byte) -114);
                this.field4877.method669(0, this.field4875.field5124, 4, (byte) -98);
                this.field4873.method1353(-1, var7);
            }
            for (int var8 = 0; var8 < 100; var8++) {
                int var9 = this.field4877.method667(true);
                if (var9 < 0) {
                    throw new IOException();
                }
                if (var9 == 0) {
                    break;
                }
                this.field4874 = 0;
                byte var10 = 0;
                if (this.field4882 == null) {
                    var10 = 8;
                } else if (this.field4882.field4048 == 0) {
                    var10 = 1;
                }
                if (var10 <= 0) {
                    int var11 = this.field4882.field4055.field5124.length - this.field4882.field4057;
                    int var12 = 512 - this.field4882.field4048;
                    if (var11 - this.field4882.field4055.field5137 < var12) {
                        var12 = var11 - this.field4882.field4055.field5137;
                    }
                    if (var9 < var12) {
                        var12 = var9;
                    }
                    this.field4877.method670(this.field4882.field4055.field5137, this.field4882.field4055.field5124, (byte) 18, var12);
                    if (this.field4878 != 0) {
                        for (int var13 = 0; var13 < var12; var13++) {
                            this.field4882.field4055.field5124[this.field4882.field4055.field5137 + var13] = (byte) class185.method1279(this.field4882.field4055.field5124[this.field4882.field4055.field5137 + var13], this.field4878);
                        }
                    }
                    this.field4882.field4055.field5137 += var12;
                    this.field4882.field4048 += var12;
                    if (this.field4882.field4055.field5137 == var11) {
                        this.field4882.method2148((byte) 123);
                        this.field4882.field1513 = false;
                        this.field4882 = null;
                    } else if (this.field4882.field4048 == 512) {
                        this.field4882.field4048 = 0;
                    }
                } else {
                    int var14 = var10 - this.field4881.field5137;
                    if (var9 < var14) {
                        var14 = var9;
                    }
                    this.field4877.method670(this.field4881.field5137, this.field4881.field5124, (byte) 18, var14);
                    if (this.field4878 != 0) {
                        for (int var15 = 0; var15 < var14; var15++) {
                            this.field4881.field5124[this.field4881.field5137 + var15] = (byte) class185.method1279(this.field4881.field5124[this.field4881.field5137 + var15], this.field4878);
                        }
                    }
                    this.field4881.field5137 += var14;
                    if (this.field4881.field5137 >= var10) {
                        if (this.field4882 == null) {
                            this.field4881.field5137 = 0;
                            int var16 = this.field4881.method2224(-125);
                            int var17 = this.field4881.method2250(-1613178296);
                            int var18 = this.field4881.method2224(-122);
                            int var19 = var18 & 0x7F;
                            int var20 = this.field4881.method2231((byte) -124);
                            long var21 = (long) ((var16 << 16) + var17);
                            boolean var23 = (var18 & 0x80) != 0;
                            Object var24 = null;
                            class256 var25;
                            if (var23) {
                                for (var25 = (class256) this.field4873.method1350(0); var25 != null && var25.field5011 != var21; var25 = (class256) this.field4873.method1351(-96)) {
                                }
                            } else {
                                for (var25 = (class256) this.field4866.method1350(arg0 + 1); var25 != null && var25.field5011 != var21; var25 = (class256) this.field4866.method1351(-97)) {
                                }
                            }
                            if (var25 == null) {
                                throw new IOException();
                            }
                            this.field4882 = var25;
                            int var26 = var19 == 0 ? 5 : 9;
                            this.field4882.field4055 = new class313(var20 + var26 + this.field4882.field4057);
                            this.field4882.field4055.method2193(var19, false);
                            this.field4882.field4055.method2222(var20, arg0 ^ 0xFFFFFF00);
                            this.field4882.field4048 = 8;
                            this.field4881.field5137 = 0;
                        } else if (this.field4882.field4048 != 0) {
                            throw new IOException();
                        } else if (this.field4881.field5124[0] == -1) {
                            this.field4881.field5137 = 0;
                            this.field4882.field4048 = 1;
                        } else {
                            this.field4882 = null;
                        }
                    }
                }
            }
            return true;
        } catch (IOException var31) {
            try {
                this.field4877.method674((byte) -83);
            } catch (Exception var29) {
            }
            this.field4879 = -2;
            this.field4877 = null;
            this.field4880++;
            return this.method2078(-21) == 0 && this.method2084((byte) -62) == 0;
        }
    }

    @OriginalMember(owner = "client!te", name = "e", descriptor = "(I)Z", line = 454)
    public final boolean method2075(int arg0) {
        if (arg0 == 4774) {
            field4851++;
            return this.method2084((byte) -62) >= 20;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(Lfa;IZ)V", line = 471)
    public final void method2076(class102 arg0, int arg1, boolean arg2) {
        if (arg1 != -21) {
            this.field4882 = (class256) null;
        }
        if (this.field4877 != null) {
            try {
                this.field4877.method674((byte) -83);
            } catch (Exception var11) {
            }
            this.field4877 = null;
        }
        this.field4877 = arg0;
        field4864++;
        this.method2079(arg1 ^ 0xDC);
        this.method2069(arg2, (byte) 112);
        this.field4881.field5137 = 0;
        this.field4882 = null;
        while (true) {
            class256 var5 = (class256) this.field4866.method1352(false);
            if (var5 == null) {
                while (true) {
                    class256 var6 = (class256) this.field4873.method1352(false);
                    if (var6 == null) {
                        if (this.field4878 != 0) {
                            try {
                                this.field4875.field5137 = 0;
                                this.field4875.method2193(4, false);
                                this.field4875.method2193(this.field4878, false);
                                this.field4875.method2206(0, (byte) -77);
                                this.field4877.method669(0, this.field4875.field5124, 4, (byte) -113);
                            } catch (IOException var10) {
                                try {
                                    this.field4877.method674((byte) -83);
                                } catch (Exception var9) {
                                }
                                this.field4879 = -2;
                                this.field4877 = null;
                                this.field4880++;
                            }
                        }
                        this.field4874 = 0;
                        this.field4876 = class19.method122(arg1 ^ 0x2F9C);
                        return;
                    }
                    this.field4870.method1353(arg1 + 20, var6);
                }
            }
            this.field4860.method1353(-1, var5);
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(IIIILkm;Lkm;IIJ)V", line = 539)
    public static final void method2077(int arg0, int arg1, int arg2, int arg3, class162 arg4, class162 arg5, int arg6, int arg7, long arg8) {
        if (arg4 == null && arg5 == null) {
            return;
        }
        class257 var10 = new class257();
        var10.field4069 = arg8;
        var10.field4068 = arg1 * 128 + 64;
        var10.field4065 = arg2 * 128 + 64;
        var10.field4066 = arg3;
        var10.field4070 = arg4;
        var10.field4059 = arg5;
        var10.field4067 = arg6;
        var10.field4058 = arg7;
        for (int var11 = arg0; var11 >= 0; var11--) {
            if (class264.field4230[var11][arg1][arg2] == null) {
                class264.field4230[var11][arg1][arg2] = new class50(var11, arg1, arg2);
            }
        }
        class264.field4230[arg0][arg1][arg2].field732 = var10;
    }

    @OriginalMember(owner = "client!te", name = "f", descriptor = "(I)I", line = 567)
    public final int method2078(int arg0) {
        field4847++;
        return arg0 == -21 ? this.field4860.method1355(16266) + this.field4866.method1355(16266) : -104;
    }

    @OriginalMember(owner = "client!te", name = "g", descriptor = "(I)V", line = 578)
    private final void method2079(int arg0) {
        field4857++;
        if (this.field4877 == null) {
            return;
        }
        try {
            this.field4875.field5137 = 0;
            this.field4875.method2193(6, false);
            if (arg0 != -201) {
                this.field4873 = (class198) null;
            }
            this.field4875.method2251(3, (byte) -62);
            this.field4877.method669(0, this.field4875.field5124, 4, (byte) -109);
        } catch (IOException var5) {
            try {
                this.field4877.method674((byte) -83);
            } catch (Exception var4) {
            }
            this.field4880++;
            this.field4879 = -2;
            this.field4877 = null;
        }
    }

    @OriginalMember(owner = "client!te", name = "h", descriptor = "(I)V", line = 606)
    public final void method2080(int arg0) {
        if (arg0 != 4) {
            this.method2069(true, (byte) -16);
        }
        field4858++;
        if (this.field4877 != null) {
            this.field4877.method674((byte) -83);
        }
    }

    @OriginalMember(owner = "client!te", name = "i", descriptor = "(I)Z", line = 619)
    public final boolean method2081(int arg0) {
        field4868++;
        if (arg0 != 20) {
            field4859 = (class221) null;
        }
        return this.method2078(-21) >= 20;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(IIIII)V", line = 638)
    public static final void method2082(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4872++;
        class211 var5 = class17.method115(10, arg3, arg0 ^ 0xFFFFE684);
        var5.method1433(true);
        var5.field3211 = arg2;
        if (arg0 == -5774) {
            var5.field3209 = arg4;
            var5.field3210 = arg1;
        }
    }

    @OriginalMember(owner = "client!te", name = "j", descriptor = "(I)V", line = 659)
    public static void method2083(int arg0) {
        int var1 = 103 % ((arg0 - 39) / 42);
        field4849 = null;
        field4853 = null;
        field4859 = null;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(B)I", line = 672)
    private final int method2084(byte arg0) {
        field4863++;
        if (arg0 != -62) {
            this.field4878 = 6;
        }
        return this.field4870.method1355(16266) + this.field4873.method1355(16266);
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(IIIIIIII)V", line = 685)
    public static final void method2085(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field4867++;
        if (arg1 < 128 || arg7 < 128 || arg1 > 13056 || arg7 > 13056) {
            class7.field85 = -1;
            class246.field3915 = -1;
            return;
        }
        int var8 = client.method889(arg1, class120.field1779, arg7, -103) - arg2;
        int var9 = var8 - class74.field1117;
        int var10 = class272.field4470[class54.field817];
        int var11 = class272.field4480[class54.field817];
        int var12 = arg1 - class41.field625;
        if (arg5 != 512) {
            method2082(84, -79, 85, 4, 3);
        }
        int var13 = class272.field4480[class147.field2369];
        int var14 = arg7 - class259.field4098;
        int var15 = class272.field4470[class147.field2369];
        int var16 = var12 * var13 + var14 * var15 >> 16;
        int var17 = var13 * var14 - (var12 * var15) >> 16;
        int var19 = var9 * var11 - (var10 * var17) >> 16;
        int var20 = var9 * var10 + var11 * var17 >> 16;
        if (var20 < 50) {
            class7.field85 = -1;
            class246.field3915 = -1;
        } else if (class245.field3886) {
            int var22 = arg0 * 512 >> 8;
            int var23 = arg3 * 512 >> 8;
            class7.field85 = var16 * var22 / var20 + arg4;
            class246.field3915 = var19 * var23 / var20 + arg6;
        } else {
            class246.field3915 = (var19 << 9) / var20 + arg6;
            class7.field85 = (var16 << 9) / var20 + arg4;
        }
    }
}
