import java.io.IOException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jf")
public class class137 {

    @OriginalMember(owner = "client!jf", name = "l", descriptor = "Z")
    public boolean field2258 = false;

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "Lrp;")
    private class288 field2247 = new class288(64);

    @OriginalMember(owner = "client!jf", name = "x", descriptor = "Lrp;")
    public class288 field2270 = new class288(500);

    @OriginalMember(owner = "client!jf", name = "y", descriptor = "Lrp;")
    public class288 field2271 = new class288(30);

    @OriginalMember(owner = "client!jf", name = "z", descriptor = "Lrp;")
    public class288 field2272 = new class288(50);

    @OriginalMember(owner = "client!jf", name = "p", descriptor = "Llt;")
    private class458 field2262;

    @OriginalMember(owner = "client!jf", name = "u", descriptor = "Z")
    public boolean field2267;

    @OriginalMember(owner = "client!jf", name = "k", descriptor = "Llt;")
    public class458 field2257;

    @OriginalMember(owner = "client!jf", name = "o", descriptor = "J")
    public static long field2261 = 0L;

    @OriginalMember(owner = "client!jf", name = "j", descriptor = "Z")
    public static boolean field2256 = false;

    @OriginalMember(owner = "client!jf", name = "w", descriptor = "Lft;")
    public static class4 field2269;

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "I")
    public static int field2248;

    @OriginalMember(owner = "client!jf", name = "c", descriptor = "I")
    public static int field2249;

    @OriginalMember(owner = "client!jf", name = "d", descriptor = "I")
    public static int field2250;

    @OriginalMember(owner = "client!jf", name = "e", descriptor = "I")
    public static int field2251;

    @OriginalMember(owner = "client!jf", name = "f", descriptor = "I")
    public static int field2252;

    @OriginalMember(owner = "client!jf", name = "g", descriptor = "I")
    public static int field2253;

    @OriginalMember(owner = "client!jf", name = "h", descriptor = "I")
    public static int field2254;

    @OriginalMember(owner = "client!jf", name = "i", descriptor = "I")
    public static int field2255;

    @OriginalMember(owner = "client!jf", name = "m", descriptor = "I")
    public static int field2259;

    @OriginalMember(owner = "client!jf", name = "n", descriptor = "I")
    public static int field2260;

    @OriginalMember(owner = "client!jf", name = "q", descriptor = "I")
    public static int field2263;

    @OriginalMember(owner = "client!jf", name = "r", descriptor = "I")
    public static int field2264;

    @OriginalMember(owner = "client!jf", name = "s", descriptor = "I")
    public static int field2265;

    @OriginalMember(owner = "client!jf", name = "t", descriptor = "I")
    public static int field2266;

    @OriginalMember(owner = "client!jf", name = "v", descriptor = "I")
    public static int field2268;

    @OriginalMember(owner = "client!jf", name = "A", descriptor = "I")
    public int field2273;

    static {
        new class423("Invalid name", "Unzulässiger Name!", "Nom incorrect", "Nome inválido");
        field2269 = new class4();
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(B)V", line = 3)
    public static final void method908(byte arg0) {
        class230.field3509 = class478.method2891(35, 0.4F, arg0 + 166, 8, 2048, 4, 8, true);
        if (arg0 != 34) {
            method915(75);
        }
        field2266++;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(ZI)V", line = 16)
    public final void method909(boolean arg0, int arg1) {
        field2252++;
        if (this.field2267 == arg0) {
            return;
        }
        this.field2267 = arg0;
        this.method919(-100);
        if (arg1 != 0) {
            field2269 = null;
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(I)V", line = 32)
    public final void method910(int arg0) {
        class288 var2 = this.field2247;
        synchronized (this.field2247) {
            this.field2247.method1749((byte) 123);
        }
        if (arg0 != -32043) {
            return;
        }
        field2255++;
        class288 var3 = this.field2270;
        synchronized (this.field2270) {
            this.field2270.method1749((byte) 125);
        }
        class288 var4 = this.field2271;
        synchronized (this.field2271) {
            this.field2271.method1749((byte) -87);
        }
        class288 var5 = this.field2272;
        synchronized (this.field2272) {
            this.field2272.method1749((byte) -90);
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(ILjava/lang/String;Lhf;I)Luu;", line = 54)
    public static final class180 method911(int arg0, String arg1, class260 arg2, int arg3) {
        field2259++;
        if (arg3 == 0) {
            return arg2.method1575(arg1, (byte) 86);
        } else if (arg3 == 1) {
            try {
                class209.method1279(new Object[] { (new URL(arg2.field3929.getCodeBase(), arg1)).toString() }, "openjs", 115, arg2.field3929);
                class180 var4 = new class180();
                var4.field2802 = 1;
                return var4;
            } catch (Throwable var11) {
                class180 var5 = new class180();
                var5.field2802 = 2;
                return var5;
            }
        } else {
            int var6 = -83 / ((arg0 - 12) / 33);
            if (arg3 == 2) {
                try {
                    arg2.field3929.getAppletContext().showDocument(new URL(arg2.field3929.getCodeBase(), arg1), "_blank");
                    class180 var7 = new class180();
                    var7.field2802 = 1;
                    return var7;
                } catch (Exception var12) {
                    class180 var8 = new class180();
                    var8.field2802 = 2;
                    return var8;
                }
            } else if (arg3 == 3) {
                try {
                    class209.method1278(5633, arg2.field3929, "loggedout");
                } catch (Throwable var14) {
                }
                try {
                    arg2.field3929.getAppletContext().showDocument(new URL(arg2.field3929.getCodeBase(), arg1), "_top");
                    class180 var9 = new class180();
                    var9.field2802 = 1;
                    return var9;
                } catch (Exception var13) {
                    class180 var10 = new class180();
                    var10.field2802 = 2;
                    return var10;
                }
            } else {
                throw new IllegalArgumentException();
            }
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(IZ)I", line = 129)
    public static final int method912(int arg0, boolean arg1) {
        if (arg1) {
            field2250++;
            return arg0 >>> 10;
        } else {
            return -105;
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(IB)V", line = 141)
    public final void method913(int arg0, byte arg1) {
        this.field2273 = arg0;
        field2254++;
        class288 var3 = this.field2270;
        synchronized (this.field2270) {
            int var4 = -112 % ((6 - arg1) / 49);
            this.field2270.method1761(-112);
        }
        class288 var5 = this.field2271;
        synchronized (this.field2271) {
            this.field2271.method1761(-115);
        }
        class288 var6 = this.field2272;
        synchronized (this.field2272) {
            this.field2272.method1761(-107);
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(IFIIII[FFIII)V", line = 166)
    public static final void method914(int arg0, float arg1, int arg2, int arg3, int arg4, int arg5, float[] arg6, float arg7, int arg8, int arg9, int arg10) {
        int var11 = arg2 - arg9;
        int var12 = arg8 - arg10;
        int var13 = arg5 - arg0;
        field2264++;
        float var14 = arg6[2] * (float) var11 + arg6[1] * (float) var13 + arg6[0] * (float) var12;
        float var15 = arg6[5] * (float) var11 + arg6[4] * (float) var13 + arg6[3] * (float) var12;
        float var16 = arg6[8] * (float) var11 + arg6[6] * (float) var12 + arg6[7] * (float) var13;
        float var17 = (float) Math.atan2((double) var14, (double) var16) / 6.2831855F + 0.5F;
        if (arg3 <= 36) {
            method908((byte) 24);
        }
        if (arg1 != 1.0F) {
            var17 = arg1 * var17;
        }
        float var18 = var15 + arg7 + 0.5F;
        if (arg4 == 1) {
            float var19 = var17;
            var17 = -var18;
            var18 = var19;
        } else if (arg4 == 2) {
            var17 = -var17;
            var18 = -var18;
        } else if (arg4 == 3) {
            float var20 = var17;
            var17 = var18;
            var18 = -var20;
        }
        class234.field3555 = var18;
        class190.field3029 = var17;
    }

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "(I)V", line = 223)
    public static void method915(int arg0) {
        field2269 = null;
        if (arg0 != 3) {
            field2256 = true;
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(BI)Lin;", line = 236)
    public final class56 method916(byte arg0, int arg1) {
        if (arg0 != -15) {
            this.field2247 = null;
        }
        field2253++;
        class288 var3 = this.field2247;
        class56 var4;
        synchronized (this.field2247) {
            var4 = (class56) this.field2247.method1752(0, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field2262.method2715(class189.method1195(arg1, false), class233.method1397(arg1, (byte) -70), false);
        class56 var6 = new class56();
        var6.field958 = arg1;
        var6.field962 = this;
        if (var5 != null) {
            var6.method392(new class40(var5), true);
        }
        var6.method396(arg0 + 9);
        if (var6.field966) {
            var6.field928 = false;
            var6.field885 = 0;
        }
        if (!this.field2267 && var6.field948) {
            var6.field879 = null;
            var6.field920 = null;
        }
        class288 var7 = this.field2247;
        synchronized (this.field2247) {
            this.field2247.method1758(arg0 ^ 0xFFFFFFF0, var6, (long) arg1);
            return var6;
        }
    }

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "(BI)V", line = 281)
    public final void method917(byte arg0, int arg1) {
        field2248++;
        class288 var3 = this.field2247;
        synchronized (this.field2247) {
            this.field2247.method1760(arg1, 30398);
        }
        class288 var4 = this.field2270;
        synchronized (this.field2270) {
            this.field2270.method1760(arg1, 30398);
        }
        class288 var5 = this.field2271;
        synchronized (this.field2271) {
            if (arg0 >= -105) {
                this.method919(71);
            }
            this.field2271.method1760(arg1, 30398);
        }
        class288 var6 = this.field2272;
        synchronized (this.field2272) {
            this.field2272.method1760(arg1, 30398);
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(ZB)V", line = 303)
    public final void method918(boolean arg0, byte arg1) {
        field2260++;
        if (arg0 != this.field2258) {
            this.field2258 = arg0;
            this.method919(115);
            int var3 = -6 / ((arg1 + 32) / 54);
        }
    }

    @OriginalMember(owner = "client!jf", name = "c", descriptor = "(I)V", line = 318)
    public final void method919(int arg0) {
        class288 var2 = this.field2247;
        synchronized (this.field2247) {
            this.field2247.method1761(-110);
        }
        field2251++;
        class288 var3 = this.field2270;
        synchronized (this.field2270) {
            this.field2270.method1761(-113);
        }
        class288 var4 = this.field2271;
        synchronized (this.field2271) {
            int var5 = 9 / ((arg0 + 18) / 49);
            this.field2271.method1761(-108);
        }
        class288 var6 = this.field2272;
        synchronized (this.field2272) {
            this.field2272.method1761(-112);
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(ILqh;II)V", line = 339)
    public static final void method920(int arg0, class47 arg1, int arg2, int arg3) {
        int var4 = -73 % ((arg0 - 55) / 36);
        field2268++;
        if (arg1.field2174 == arg2 && arg2 != -1) {
            class87 var5 = class429.field6302.method106(-124, arg2);
            int var6 = var5.field1503;
            if (var6 == 1) {
                arg1.field2188 = arg3;
                arg1.field2193 = 0;
                arg1.field2150 = 1;
                arg1.field2141 = 0;
                arg1.field2186 = 0;
                class70.method516(var5, arg1.field3217, arg1.field2141, class286.field4329 == arg1, arg1.field3218, arg1.field3222, (byte) -79);
            }
            if (var6 == 2) {
                arg1.field2193 = 0;
                return;
            }
        } else if (arg2 == -1 || arg1.field2174 == -1 || class429.field6302.method106(-113, arg2).field1527 >= class429.field6302.method106(-111, arg1.field2174).field1527) {
            arg1.field2150 = 1;
            arg1.field2230 = arg1.field2231;
            arg1.field2188 = arg3;
            arg1.field2186 = 0;
            arg1.field2141 = 0;
            arg1.field2193 = 0;
            arg1.field2174 = arg2;
            if (arg1.field2174 == -1) {
                return;
            }
            class70.method516(class429.field6302.method106(-82, arg1.field2174), arg1.field3217, arg1.field2141, class286.field4329 == arg1, arg1.field3218, arg1.field3222, (byte) -79);
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(Lha;B)V", line = 390)
    public static final void method921(class40 arg0, byte arg1) {
        if (arg1 != 18) {
            method908((byte) 115);
        }
        field2263++;
        byte[] var2 = new byte[24];
        if (class215.field3333 != null) {
            try {
                class215.field3333.method1543(0L, (byte) -125);
                class215.field3333.method1538(0, var2);
                int var3;
                for (var3 = 0; var3 < 24 && var2[var3] == 0; var3++) {
                }
                if (var3 >= 24) {
                    throw new IOException();
                }
            } catch (Exception var5) {
                for (int var4 = 0; var4 < 24; var4++) {
                    var2[var4] = -1;
                }
            }
        }
        arg0.method281(24, var2, 0, 113);
    }

    @OriginalMember(owner = "client!jf", name = "<init>", descriptor = "(Lcm;IZLlt;Llt;)V", line = 506)
    public class137(class491 arg0, int arg1, boolean arg2, class458 arg3, class458 arg4) {
        this.field2262 = arg3;
        this.field2267 = arg2;
        this.field2257 = arg4;
        if (this.field2262 != null) {
            int var6 = this.field2262.method2738((byte) 109) - 1;
            this.field2262.method2726((byte) 113, var6);
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(II)V", line = 446)
    public final void method922(int arg0, int arg1) {
        this.field2247 = new class288(arg0);
        if (arg1 <= -110) {
            field2249++;
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(IIZ)V", line = 472)
    public static final void method923(int arg0, int arg1, boolean arg2) {
        field2265++;
        class146 var3 = class478.method2889(arg0, (byte) 27, arg2);
        if (var3 != null) {
            for (int var4 = arg1; var4 < var3.field2367.length; var4++) {
                var3.field2367[var4] = -1;
                var3.field2359[var4] = 0;
            }
        }
    }
}
