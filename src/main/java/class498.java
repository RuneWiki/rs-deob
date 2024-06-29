import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fj")
public class class498 extends class115 {

    @OriginalMember(owner = "client!fj", name = "p", descriptor = "Ljava/lang/String;")
    public String field7389;

    @OriginalMember(owner = "client!fj", name = "n", descriptor = "F")
    public static float field7387;

    @OriginalMember(owner = "client!fj", name = "i", descriptor = "I")
    public static int field7382;

    @OriginalMember(owner = "client!fj", name = "j", descriptor = "I")
    public static int field7383;

    @OriginalMember(owner = "client!fj", name = "k", descriptor = "I")
    public static int field7384;

    @OriginalMember(owner = "client!fj", name = "l", descriptor = "I")
    public static int field7385;

    @OriginalMember(owner = "client!fj", name = "o", descriptor = "I")
    public static int field7388;

    @OriginalMember(owner = "client!fj", name = "q", descriptor = "I")
    public static int field7390;

    @OriginalMember(owner = "client!fj", name = "m", descriptor = "[I")
    public static int[] field7386;

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(I)V")
    public static void method2962(int arg0) {
        field7386 = null;
        if (arg0 != 0) {
            field7387 = -0.8356537F;
        }
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(IBIIZ)V")
    public static final void method2963(int arg0, byte arg1, int arg2, int arg3, boolean arg4) {
        field7384++;
        if (!arg4 && class116.field1743 == arg3 && class161.field2414 == arg2 && class521.field7651 == class151.field2295 || class454.field6661.method1533(-1, class113.field1723)) {
            return;
        }
        class151.field2295 = class521.field7651;
        class161.field2414 = arg2;
        class116.field1743 = arg3;
        if (arg1 < 73) {
            field7386 = null;
        }
        if (class454.field6661.method1533(-1, class113.field1723)) {
            class151.field2295 = 0;
        }
        class526.method3137(arg0, 2270);
        class351.method2123((byte) -123, class164.field2445, class221.field3157.method2103(class30.field430, (byte) 34), true);
        int var5 = class267.field3979;
        int var6 = class241.field3358;
        class267.field3979 = (class116.field1743 - (class50.field640 >> 4)) * 8;
        class241.field3358 = (class161.field2414 - (class448.field6611 >> 4)) * 8;
        class342.field5258 = class137.method992(class116.field1743 * 8, class161.field2414 * 8);
        client.field7541 = null;
        int var7 = class267.field3979 - var5;
        int var8 = class241.field3358 - var6;
        if (arg0 == 10) {
            for (int var15 = 0; var15 < 32768; var15++) {
                class351 var23 = class88.field1375[var15];
                if (var23 != null) {
                    for (int var24 = 0; var24 < 10; var24++) {
                        var23.field6065[var24] -= var7;
                        var23.field6068[var24] -= var8;
                    }
                    var23.field7681 -= var7 * 128;
                    var23.field7671 -= var8 * 128;
                }
            }
        } else {
            class519.field7609 = 0;
            int var9 = (class50.field640 - 1) * 128;
            int var10 = (class448.field6611 - 1) * 128;
            for (int var11 = 0; var11 < 32768; var11++) {
                class351 var12 = class88.field1375[var11];
                if (var12 != null) {
                    var12.field7671 -= var8 * 128;
                    var12.field7681 -= var7 * 128;
                    if (var12.field7681 >= 0 && var9 >= var12.field7681 && var12.field7671 >= 0 && var10 >= var12.field7671) {
                        boolean var13 = true;
                        for (int var14 = 0; var14 < 10; var14++) {
                            var12.field6065[var14] -= var7;
                            var12.field6068[var14] -= var8;
                            if (var12.field6065[var14] < 0 || var12.field6065[var14] >= class50.field640 || var12.field6068[var14] < 0 || class448.field6611 <= var12.field6068[var14]) {
                                var13 = false;
                            }
                        }
                        if (var13) {
                            class327.field5114[class519.field7609++] = var11;
                        } else {
                            class88.field1375[var11].method2127(null, (byte) 90);
                            class88.field1375[var11] = null;
                        }
                    } else {
                        class88.field1375[var11].method2127(null, (byte) 93);
                        class88.field1375[var11] = null;
                    }
                }
            }
        }
        for (int var16 = 0; var16 < 2048; var16++) {
            class480 var21 = class83.field1327[var16];
            if (var21 != null) {
                for (int var22 = 0; var22 < 10; var22++) {
                    var21.field6065[var22] -= var7;
                    var21.field6068[var22] -= var8;
                }
                var21.field7671 -= var8 * 128;
                var21.field7681 -= var7 * 128;
            }
        }
        class427[] var17 = class390.field5874;
        for (int var18 = 0; var18 < var17.length; var18++) {
            class427 var20 = var17[var18];
            if (var20 != null) {
                var20.field6356 -= var8 * 128;
                var20.field6366 -= var7 * 128;
            }
        }
        class399.method2400(true, var7, var8);
        for (class22 var19 = (class22) class110.field1644.method2957(94); var19 != null; var19 = (class22) class110.field1644.method2947(114)) {
            var19.field326 -= var7;
            var19.field321 -= var8;
            if (class311.field4830 != 3 && (var19.field326 < 0 || var19.field321 < 0 || class50.field640 <= var19.field326 || var19.field321 >= class448.field6611)) {
                var19.method876((byte) -96);
            }
        }
        if (class504.field7423 != 0) {
            class504.field7423 -= var7;
            class182.field2702 -= var8;
        }
        class385.method2309(false);
        if (arg0 != 10) {
            class94.field1456 -= var7;
            class282.field4263 -= var7 * 128;
            class393.field5897 -= var8 * 128;
            class227.field3208 -= var7;
            class16.field272 -= var8;
            class333.field5159 -= var8;
            if (Math.abs(var7) > class50.field640 || Math.abs(var8) > class448.field6611) {
                class398.method2388((byte) 47);
            }
        } else if (class350.field5388 == 4) {
            class444.field6528 -= var8 * 128;
            class125.field1880 -= var8 * 128;
            class382.field5746 -= var7 * 128;
            class295.field4416 -= var7 * 128;
        } else {
            class350.field5388 = 1;
        }
        class26.method259(42);
        class464.method2684(-1);
        class170.field2497.method2955(2131289328);
        class216.field3116.method2955(2131289328);
        class295.field4411.method3085((byte) 48);
        class390.method2336(0);
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "([I[ILsr;[IB)V")
    public static final void method2964(int[] arg0, int[] arg1, class351 arg2, int[] arg3, byte arg4) {
        field7390++;
        for (int var5 = 0; var5 < arg1.length; var5++) {
            int var6 = arg1[var5];
            int var7 = arg0[var5];
            int var8 = arg3[var5];
            int var9 = 0;
            while (var7 != 0 && var9 < arg2.field6029.length) {
                if ((var7 & 0x1) != 0) {
                    if (var6 == -1) {
                        arg2.field6029[var9] = null;
                    } else {
                        class520 var10 = class510.field7490.method575(var6, -101);
                        int var11 = var10.field7618;
                        class357 var12 = arg2.field6029[var9];
                        if (var12 != null) {
                            if (var12.field5474 == var6) {
                                if (var11 == 0) {
                                    var12 = arg2.field6029[var9] = null;
                                } else if (var11 == 1) {
                                    var12.field5473 = 0;
                                    var12.field5467 = 0;
                                    var12.field5468 = 0;
                                    var12.field5470 = 1;
                                    var12.field5472 = var8;
                                    class283.method1761(var10, false, arg2.field7671, -19, arg2.field7686, arg2.field7681, 0);
                                } else if (var11 == 2) {
                                    var12.field5473 = 0;
                                }
                            } else if (var10.field7644 >= class510.field7490.method575(var12.field5474, -123).field7644) {
                                var12 = arg2.field6029[var9] = null;
                            }
                        }
                        if (var12 == null) {
                            class357 var13 = arg2.field6029[var9] = new class357();
                            var13.field5473 = 0;
                            var13.field5472 = var8;
                            var13.field5470 = 1;
                            var13.field5467 = 0;
                            var13.field5468 = 0;
                            var13.field5474 = var6;
                            class283.method1761(var10, false, arg2.field7671, -66, arg2.field7686, arg2.field7681, 0);
                        }
                    }
                }
                var9++;
                var7 >>>= 0x1;
            }
        }
        if (arg4 < 0) {
            field7387 = 0.63941926F;
        }
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(IIII)V")
    public static final void method2965(int arg0, int arg1, int arg2, int arg3) {
        field7388++;
        String var4 = "tele " + arg0 + "," + (arg3 >> 6) + "," + (arg2 >> 6) + "," + (arg3 & 0x3F) + "," + (arg2 & 0x3F);
        System.out.println(var4);
        if (arg1 >= -118) {
            field7387 = 0.7775329F;
        }
        class149.method1084(var4, 59, true, false);
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(IIIBILdn;)V")
    public static final void method2966(int arg0, int arg1, int arg2, byte arg3, int arg4, class203 arg5) {
        int var6 = 51 / ((arg3 + 74) / 42);
        field7385++;
        if (arg5.field2967 == -1 && arg5.field2957 == null) {
            return;
        }
        int var7 = 0;
        if (arg5.field2958 < arg2) {
            var7 += arg2 - arg5.field2958;
        } else if (arg5.field2963 > arg2) {
            var7 += arg5.field2963 - arg2;
        }
        int var8 = class454.field6661.field1000 * arg5.field2953 >> 8;
        if (arg0 > arg5.field2947) {
            var7 += arg0 - arg5.field2947;
        } else if (arg5.field2954 > arg0) {
            var7 += arg5.field2954 - arg0;
        }
        if (arg5.field2962 == 0 || var7 - 64 > arg5.field2962 || class454.field6661.field1000 == 0 || arg5.field2952 != arg1) {
            if (arg5.field2959 != null) {
                class176.field2598.method2372(arg5.field2959);
                arg5.field2959 = null;
            }
            if (arg5.field2951 != null) {
                class176.field2598.method2372(arg5.field2951);
                arg5.field2951 = null;
            }
            return;
        }
        var7 -= 64;
        if (var7 < 0) {
            var7 = 0;
        }
        int var9 = (arg5.field2962 - var7) * var8 / arg5.field2962;
        if (arg5.field2959 != null) {
            arg5.field2959.method2248(var9);
        } else if (arg5.field2967 >= 0) {
            class183 var10 = class183.method1244(class235.field3298, arg5.field2967, 0);
            if (var10 != null) {
                class528 var11 = var10.method1246().method3138(class311.field4839);
                class380 var12 = class380.method2243(var11, 100, var9);
                var12.method2251(-1);
                class176.field2598.method2376(var12);
                arg5.field2959 = var12;
            }
        }
        if (arg5.field2951 != null) {
            arg5.field2951.method2248(var9);
            if (!arg5.field2951.method875(0)) {
                arg5.field2951 = null;
                return;
            }
            return;
        }
        if (arg5.field2957 == null || (arg5.field2956 -= arg4) > 0) {
            return;
        }
        int var13 = (int) ((double) arg5.field2957.length * Math.random());
        class183 var14 = class183.method1244(class235.field3298, arg5.field2957[var13], 0);
        if (var14 == null) {
            return;
        }
        class528 var15 = var14.method1246().method3138(class311.field4839);
        class380 var16 = class380.method2243(var15, 100, var9);
        var16.method2251(0);
        class176.field2598.method2376(var16);
        arg5.field2956 = (int) (Math.random() * (double) (arg5.field2948 - arg5.field2961)) + arg5.field2961;
        arg5.field2951 = var16;
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(II)I")
    public static final int method2967(int arg0, int arg1) {
        return class364.field5563 == null ? 0 : class364.field5563[arg0][arg1] & 0xFFFF;
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(III)V")
    public static final void method2968(int arg0, int arg1, int arg2) {
        field7383++;
        class506 var3 = class14.method185(-1304589728, arg2, 12);
        int var4 = -9 % ((-arg1 - 36) / 58);
        var3.method2992(0);
        var3.field7442 = arg0;
    }

    @OriginalMember(owner = "client!fj", name = "<init>", descriptor = "()V")
    public class498() {
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(Ljava/lang/Throwable;I)Ljava/lang/String;")
    public static final String method2969(Throwable arg0, int arg1) throws IOException {
        field7382++;
        String var3;
        if (arg0 instanceof class267) {
            class267 var2 = (class267) arg0;
            arg0 = var2.field3978;
            var3 = var2.field3973 + " | ";
        } else {
            var3 = "";
        }
        StringWriter var4 = new StringWriter();
        PrintWriter var5 = new PrintWriter(var4);
        arg0.printStackTrace(var5);
        var5.close();
        String var6 = var4.toString();
        BufferedReader var7 = new BufferedReader(new StringReader(var6));
        if (arg1 != 0) {
            return null;
        }
        String var8 = var7.readLine();
        while (true) {
            String var9 = var7.readLine();
            if (var9 == null) {
                return var3 + "| " + var8;
            }
            int var10 = var9.indexOf(40);
            int var11 = var9.indexOf(41, var10 + 1);
            String var12;
            if (var10 == -1) {
                var12 = var9;
            } else {
                var12 = var9.substring(0, var10);
            }
            String var13 = var12.trim();
            String var14 = var13.substring(var13.lastIndexOf(32) + 1);
            String var15 = var14.substring(var14.lastIndexOf(9) + 1);
            String var16 = var3 + var15;
            if (var10 != -1 && var11 != -1) {
                int var17 = var9.indexOf(".java:", var10);
                if (var17 >= 0) {
                    var16 = var16 + var9.substring(var17 + 5, var11);
                }
            }
            var3 = var16 + ' ';
        }
    }

    @OriginalMember(owner = "client!fj", name = "<init>", descriptor = "(Ljava/lang/String;)V")
    public class498(String arg0) {
        this.field7389 = arg0;
    }
}
