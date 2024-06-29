import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public class class313 {

    @OriginalMember(owner = "client!cb", name = "k", descriptor = "Z")
    public boolean field4906 = false;

    @OriginalMember(owner = "client!cb", name = "c", descriptor = "I")
    public static int field4898 = 0;

    @OriginalMember(owner = "client!cb", name = "e", descriptor = "[J")
    public static long[] field4900 = new long[1000];

    @OriginalMember(owner = "client!cb", name = "h", descriptor = "I")
    public static int field4903 = -1;

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "I")
    public int field4896;

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "I")
    public static int field4897;

    @OriginalMember(owner = "client!cb", name = "d", descriptor = "I")
    public static int field4899;

    @OriginalMember(owner = "client!cb", name = "f", descriptor = "I")
    public static int field4901;

    @OriginalMember(owner = "client!cb", name = "g", descriptor = "I")
    public static int field4902;

    @OriginalMember(owner = "client!cb", name = "i", descriptor = "I")
    public static int field4904;

    @OriginalMember(owner = "client!cb", name = "j", descriptor = "I")
    public static int field4905;

    @OriginalMember(owner = "client!cb", name = "l", descriptor = "I")
    public int field4907;

    @OriginalMember(owner = "client!cb", name = "m", descriptor = "I")
    public static int field4908;

    @OriginalMember(owner = "client!cb", name = "n", descriptor = "I")
    public static int field4909;

    @OriginalMember(owner = "client!cb", name = "o", descriptor = "I")
    public static int field4910;

    @OriginalMember(owner = "client!cb", name = "p", descriptor = "I")
    public static int field4911;

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(ILjava/lang/String;)J", line = 12)
    public static final long method2206(int arg0, String arg1) {
        field4899++;
        int var2 = arg1.length();
        long var3 = 0L;
        for (int var5 = 0; var5 < var2; var5++) {
            var3 = (var3 << 5) + (long) arg1.charAt(var5) - var3;
        }
        if (arg0 != -1) {
            method2211((class323) null, 109);
        }
        return var3;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(ILlf;II)V", line = 38)
    private final void method2207(int arg0, class143 arg1, int arg2, int arg3) {
        if (arg0 == 1) {
            this.field4907 = arg1.method1051(1);
        } else if (arg0 == 2) {
            this.field4896 = arg1.method1017((byte) 101);
        } else if (arg0 == 3) {
            this.field4906 = true;
        } else if (arg0 == 4) {
            this.field4907 = -1;
        }
        int var5 = 84 % ((arg2 - 58) / 55);
        field4909++;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(Lnk;BI)Z", line = 71)
    public static final boolean method2208(class16 arg0, byte arg1, int arg2) {
        field4901++;
        byte[] var3 = arg0.method124(arg2, 12700);
        if (var3 == null) {
            return false;
        } else {
            int var4 = -6 / ((arg1 - 23) / 60);
            class246.method1750(12, var3);
            return true;
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(ZBI)Lfe;", line = 91)
    public final class270 method2209(boolean arg0, byte arg1, int arg2) {
        if (arg1 >= -47) {
            field4903 = -113;
        }
        field4904++;
        class270 var4 = (class270) class119.field1659.method380(0, (long) ((arg0 ? 262144 : 0) | arg2 << 16 | this.field4907));
        if (var4 != null) {
            return var4;
        }
        class25.field292.method125(this.field4907, 63);
        class270 var5 = class315.method2227(class25.field292, (byte) -100, 0, this.field4907);
        if (var5 != null) {
            var5.method1911(class13.field135, class60.field708, class91.field1203);
            var5.field2369 = var5.field2366;
            var5.field2360 = var5.field2361;
            if (arg0) {
                var5.method1907();
            }
            for (int var6 = 0; var6 < arg2; var6++) {
                var5.method1903();
            }
            class119.field1659.method377((long) ((arg0 ? 262144 : 0) | arg2 << 16 | this.field4907), var5, -1);
        }
        return var5;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(Lro;IIIZI)V", line = 130)
    public static final void method2210(class111 arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        field4908++;
        if (arg2 <= class298.field4681 || arg0 == null || arg0.field1539 == null || arg1 >= arg0.field1539.length || arg0.field1539[arg1] == null) {
            return;
        }
        int var6 = arg0.field1539[arg1][0];
        int var7 = var6 >> 5 & 0x7;
        int var8 = var6 & 0x1F;
        int var9 = var6 >> 8;
        if (arg0.field1539[arg1].length > 1) {
            int var10 = (int) ((double) arg0.field1539[arg1].length * Math.random());
            if (var10 > 0) {
                var9 = arg0.field1539[arg1][var10];
            }
        }
        if (var8 == 0) {
            if (arg4) {
                class42.method264(var7, var9, 0, 255, -51);
            }
        } else if (class213.field3240 != 0) {
            class187.field2811[class298.field4681] = var9;
            class88.field1161[class298.field4681] = var7;
            class14.field150[class298.field4681] = 0;
            class247.field3913[class298.field4681] = null;
            int var11 = (arg5 - 64) / 128;
            int var12 = (arg3 - 64) / 128;
            class327.field5239[class298.field4681] = 255;
            class87.field1144[class298.field4681] = (var12 << 8) + ((var11 << 16) + var8);
            class298.field4681++;
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(Lhi;I)Ljava/lang/String;", line = 190)
    public static final String method2211(class323 arg0, int arg1) {
        if (arg1 < 54) {
            field4903 = -84;
        }
        field4905++;
        if (client.method2013(arg0).method485((byte) -64) == 0) {
            return null;
        } else if (arg0.field5116 == null || arg0.field5116.trim().length() == 0) {
            return class214.field3244 ? "Hidden-use" : null;
        } else {
            return arg0.field5116;
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(IIIIIBI)V", line = 216)
    public static final void method2212(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6) {
        field4910++;
        class61.method376(arg1, (byte) 4);
        int var7 = 0;
        int var8 = arg1;
        int var9 = arg1 - arg0;
        int var10 = -arg1;
        if (arg5 > -34) {
            field4897 = -45;
        }
        if (var9 < 0) {
            var9 = 0;
        }
        int var11 = -var9;
        int var12 = -1;
        int[] var13 = class347.field5501[arg2];
        int var14 = -1;
        int var15 = var9;
        int var16 = arg3 + var9;
        int var17 = arg3 - var9;
        class278.method1986(arg3 - arg1, var13, arg6, var17, (byte) 90);
        class278.method1986(var17, var13, arg4, var16, (byte) -124);
        class278.method1986(var16, var13, arg6, arg1 + arg3, (byte) 117);
        while (var8 > var7) {
            var12 += 2;
            var11 += var12;
            if (var11 >= 0 && var15 >= 1) {
                class180.field2694[var15] = var7;
                var15--;
                var11 -= var15 << 1;
            }
            var7++;
            var14 += 2;
            var10 += var14;
            if (var10 >= 0) {
                var8--;
                var10 -= var8 << 1;
                if (var9 <= var8) {
                    int[] var18 = class347.field5501[arg2 + var8];
                    int[] var19 = class347.field5501[arg2 - var8];
                    int var20 = arg3 + var7;
                    int var21 = arg3 - var7;
                    class278.method1986(var21, var18, arg6, var20, (byte) -84);
                    class278.method1986(var21, var19, arg6, var20, (byte) 30);
                } else {
                    int[] var22 = class347.field5501[arg2 + var8];
                    int[] var23 = class347.field5501[arg2 - var8];
                    int var24 = class180.field2694[var8];
                    int var25 = arg3 + var7;
                    int var26 = arg3 - var7;
                    int var27 = arg3 + var24;
                    int var28 = arg3 - var24;
                    class278.method1986(var26, var22, arg6, var28, (byte) 100);
                    class278.method1986(var28, var22, arg4, var27, (byte) -99);
                    class278.method1986(var27, var22, arg6, var25, (byte) -81);
                    class278.method1986(var26, var23, arg6, var28, (byte) 60);
                    class278.method1986(var28, var23, arg4, var27, (byte) -58);
                    class278.method1986(var27, var23, arg6, var25, (byte) -69);
                }
            }
            int[] var29 = class347.field5501[arg2 + var7];
            int[] var30 = class347.field5501[arg2 - var7];
            int var31 = arg3 + var8;
            int var32 = arg3 - var8;
            if (var9 <= var7) {
                class278.method1986(var32, var29, arg6, var31, (byte) 30);
                class278.method1986(var32, var30, arg6, var31, (byte) 54);
            } else {
                int var33 = var15 >= var7 ? var15 : class180.field2694[var7];
                int var34 = arg3 - var33;
                class278.method1986(var32, var29, arg6, var34, (byte) -81);
                int var35 = arg3 + var33;
                class278.method1986(var34, var29, arg4, var35, (byte) -63);
                class278.method1986(var35, var29, arg6, var31, (byte) 31);
                class278.method1986(var32, var30, arg6, var34, (byte) -74);
                class278.method1986(var34, var30, arg4, var35, (byte) 70);
                class278.method1986(var35, var30, arg6, var31, (byte) 41);
            }
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(BI)V", line = 346)
    public static final void method2213(byte arg0, int arg1) {
        field4902++;
        class197.field3006.method387(arg1, false);
        if (arg0 != 84) {
            method2210((class111) null, 106, 66, 121, true, -84);
        }
        class188.field2830.method387(arg1, false);
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(B)V", line = 358)
    public static void method2214(byte arg0) {
        if (arg0 != 39) {
            field4897 = 3;
        }
        field4900 = null;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(IILlf;)V", line = 368)
    public final void method2215(int arg0, int arg1, class143 arg2) {
        if (arg0 != -1) {
            return;
        }
        while (true) {
            int var4 = arg2.method1043(true);
            if (var4 == 0) {
                field4911++;
                return;
            }
            this.method2207(var4, arg2, 120, arg1);
        }
    }
}
