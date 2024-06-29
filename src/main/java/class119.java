import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pm")
public class class119 extends class182 {

    @OriginalMember(owner = "client!pm", name = "N", descriptor = "I")
    private int field2109 = 0;

    @OriginalMember(owner = "client!pm", name = "Z", descriptor = "I")
    private int field2121 = 0;

    @OriginalMember(owner = "client!pm", name = "P", descriptor = "I")
    private int field2111 = 0;

    @OriginalMember(owner = "client!pm", name = "S", descriptor = "Ljava/lang/String;")
    public static String field2114 = "Loaded config";

    @OriginalMember(owner = "client!pm", name = "db", descriptor = "Ljava/lang/String;")
    public static String field2125 = "yellow:";

    @OriginalMember(owner = "client!pm", name = "cb", descriptor = "Lsf;")
    public static class124 field2124 = new class124(64);

    @OriginalMember(owner = "client!pm", name = "I", descriptor = "I")
    public static int field2104;

    @OriginalMember(owner = "client!pm", name = "J", descriptor = "I")
    public static int field2105;

    @OriginalMember(owner = "client!pm", name = "K", descriptor = "I")
    private int field2106;

    @OriginalMember(owner = "client!pm", name = "L", descriptor = "I")
    public static int field2107;

    @OriginalMember(owner = "client!pm", name = "M", descriptor = "I")
    public static int field2108;

    @OriginalMember(owner = "client!pm", name = "O", descriptor = "I")
    public static int field2110;

    @OriginalMember(owner = "client!pm", name = "Q", descriptor = "I")
    private int field2112;

    @OriginalMember(owner = "client!pm", name = "R", descriptor = "I")
    public static int field2113;

    @OriginalMember(owner = "client!pm", name = "T", descriptor = "I")
    public static int field2115;

    @OriginalMember(owner = "client!pm", name = "V", descriptor = "I")
    private int field2117;

    @OriginalMember(owner = "client!pm", name = "W", descriptor = "I")
    public static int field2118;

    @OriginalMember(owner = "client!pm", name = "X", descriptor = "I")
    private int field2119;

    @OriginalMember(owner = "client!pm", name = "Y", descriptor = "I")
    private int field2120;

    @OriginalMember(owner = "client!pm", name = "ab", descriptor = "I")
    private int field2122;

    @OriginalMember(owner = "client!pm", name = "bb", descriptor = "I")
    public static int field2123;

    @OriginalMember(owner = "client!pm", name = "eb", descriptor = "I")
    public static int field2126;

    @OriginalMember(owner = "client!pm", name = "fb", descriptor = "I")
    public static int field2127;

    @OriginalMember(owner = "client!pm", name = "U", descriptor = "Lek;")
    public static class206 field2116;

    @OriginalMember(owner = "client!pm", name = "g", descriptor = "(I)V", line = 6)
    public static final void method865(int arg0) {
        if (arg0 != -4097) {
            field2126 = 108;
        }
        field2104++;
        if (class96.field1746 != null) {
            class96.field1746.method151(false);
        }
        if (class125.field2205 != null) {
            class125.field2205.method151(false);
        }
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(IIBI)Lan;", line = 25)
    public static final class355 method866(int arg0, int arg1, byte arg2, int arg3) {
        field2118++;
        class355 var4 = new class355();
        var4.field5657 = arg3;
        var4.field5661 = arg0;
        if (arg2 <= 79) {
            method869(99);
        }
        class34.field758.method2337(var4, 709, (long) arg1);
        class219.method1522(arg3, 0);
        class181 var5 = class224.method1564(-127, arg1);
        if (var5 != null) {
            class52.method459(128, var5);
        }
        if (class140.field2371 != null) {
            class52.method459(128, class140.field2371);
            class140.field2371 = null;
        }
        int var6 = class137.field2343;
        for (int var7 = 0; var7 < var6; var7++) {
            if (class287.method2032(-64, class107.field1938[var7])) {
                class51.method451(var7, 83);
            }
        }
        if (class137.field2343 == 1) {
            class5.field87 = false;
            class127.method906(class232.field3802, class351.field5616, class137.field2340, class278.field4528, 0);
        } else {
            class127.method906(class232.field3802, class351.field5616, class137.field2340, class278.field4528, 0);
            int var8 = class332.field5297.method636(class20.field518);
            for (int var9 = 0; var9 < class137.field2343; var9++) {
                int var10 = class332.field5297.method636(class142.method972(var9, (byte) 37));
                if (var8 < var10) {
                    var8 = var10;
                }
            }
            class278.field4528 = var8 + 8;
            class232.field3802 = (class170.field2807 ? 26 : 22) + class137.field2343 * 15;
        }
        if (var5 != null) {
            class353.method2513(false, var5, 121);
        }
        class92.method702(2000000, arg3);
        if (class88.field1566 != -1) {
            class222.method1557(1, true, class88.field1566);
        }
        return var4;
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(IBII)V", line = 107)
    private final void method867(int arg0, byte arg1, int arg2, int arg3) {
        field2107++;
        if (arg1 > -30) {
            method871(false, -40, (String) null, (class206) null);
        }
        int var5 = arg0 < arg2 ? arg0 : arg2;
        int var6 = arg0 <= arg2 ? arg2 : arg0;
        int var7 = arg3 < var5 ? arg3 : var5;
        int var8 = arg3 > var6 ? arg3 : var6;
        this.field2117 = (var7 + var8) / 2;
        int var9 = var8 - var7;
        if (var9 > 0) {
            int var10 = (var8 - arg0 << 12) / var9;
            int var11 = (var8 - arg2 << 12) / var9;
            int var12 = (var8 - arg3 << 12) / var9;
            if (arg0 == var8) {
                this.field2120 = arg2 == var7 ? var12 + 20480 : -var11 + 4096;
            } else if (arg2 == var8) {
                this.field2120 = arg3 == var7 ? var10 + 4096 : -var12 + 12288;
            } else {
                this.field2120 = arg0 == var7 ? var11 + 12288 : -var10 + 20480;
            }
            this.field2120 /= 6;
        } else {
            this.field2120 = 0;
        }
        if (this.field2117 > 0 && this.field2117 < 4096) {
            this.field2119 = (var9 << 12) / (this.field2117 <= 2048 ? this.field2117 * 2 : 8192 - this.field2117 * 2);
        } else {
            this.field2119 = 0;
        }
    }

    @OriginalMember(owner = "client!pm", name = "<init>", descriptor = "()V", line = 341)
    public class119() {
        super(1, false);
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(Loe;IB)V", line = 165)
    public final void method126(class146 arg0, int arg1, byte arg2) {
        if (arg2 != 60) {
            method866(-53, -115, (byte) -69, -53);
        }
        field2105++;
        if (arg1 == 0) {
            this.field2109 = arg0.method1050(3);
        } else if (arg1 == 1) {
            this.field2121 = (arg0.method1029(-2) << 12) / 100;
        } else if (arg1 == 2) {
            this.field2111 = (arg0.method1029(-2) << 12) / 100;
        }
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(IB)Lqi;", line = 214)
    public static final class335 method868(int arg0, byte arg1) {
        class335 var2 = (class335) class274.field4463.method893((long) arg0, 49);
        if (arg1 >= -87) {
            field2114 = (String) null;
        }
        field2108++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class285.field4661.method1404(class216.method1510((byte) -127, arg0), class78.method588(-63, arg0), (byte) -108);
        class335 var4 = new class335();
        if (var3 != null) {
            var4.method2359(new class146(var3), 0);
        }
        class274.field4463.method888((long) arg0, var4, 98);
        return var4;
    }

    @OriginalMember(owner = "client!pm", name = "h", descriptor = "(I)V", line = 240)
    public static void method869(int arg0) {
        field2114 = null;
        field2116 = null;
        if (arg0 > 31) {
            field2124 = null;
            field2125 = null;
        }
    }

    @OriginalMember(owner = "client!pm", name = "b", descriptor = "(IIIIIII)V", line = 259)
    public static final void method870(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg3 != -15113) {
            method868(57, (byte) 72);
        }
        field2113++;
        if (class190.field3224 <= arg2 && arg1 <= class289.field4704 && class87.field1520 <= arg4 && class177.field2930 >= arg5) {
            if (arg6 == 1) {
                class49.method438(arg2, 23706, arg1, arg0, arg4, arg5);
            } else {
                class158.method1136(arg2, arg0, arg4, arg5, arg1, (byte) 97, arg6);
            }
        } else if (arg6 == 1) {
            class205.method1396(arg1, arg5, 113, arg2, arg0, arg4);
        } else {
            class311.method2265(arg5, (byte) -74, arg4, arg6, arg0, arg2, arg1);
        }
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(ZILjava/lang/String;Lek;)Lga;", line = 291)
    public static final class23 method871(boolean arg0, int arg1, String arg2, class206 arg3) {
        int var4 = arg3.method1402(arg1 ^ 0x18C1, arg2);
        field2110++;
        if (var4 == -1) {
            return new class23(0);
        }
        int var5 = 0;
        int var6 = 0;
        if (arg1 != -6285) {
            method865(-121);
        }
        int[] var7 = arg3.method1413(var4, (byte) -117);
        class23 var8 = new class23(var7.length);
        while (true) {
            while (var8.field562 > var5) {
                class146 var9 = new class146(arg3.method1404(var4, var7[var6++], (byte) -92));
                int var10 = var9.method1004(3);
                int var11 = var9.method989(127);
                int var12 = var9.method1005((byte) 122);
                if (!arg0 && var12 == 1) {
                    var8.field562--;
                } else {
                    var8.field566[var5] = var10;
                    var8.field564[var5] = new class127();
                    var8.field564[var5].field2219 = var11;
                    var5++;
                }
            }
            return var8;
        }
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(II)[[I", line = 351)
    public final int[][] method122(int arg0, int arg1) {
        field2123++;
        int[][] var3 = this.field3152.method1953(arg0, arg1 - 4854);
        if (this.field3152.field4493) {
            int[][] var4 = this.method1291(arg0, (byte) 73, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[2];
            int[] var7 = var3[0];
            int[] var8 = var4[1];
            int[] var9 = var3[2];
            int[] var10 = var3[1];
            for (int var11 = 0; var11 < class26.field672; var11++) {
                this.method867(var5[var11], (byte) -71, var8[var11], var6[var11]);
                this.field2120 += this.field2109;
                this.field2119 += this.field2121;
                this.field2117 += this.field2111;
                if (this.field2119 < 0) {
                    this.field2119 = 0;
                }
                if (this.field2119 > 4096) {
                    this.field2119 = 4096;
                }
                while (this.field2120 < 0) {
                    this.field2120 += 4096;
                }
                if (this.field2117 < 0) {
                    this.field2117 = 0;
                }
                while (this.field2120 > 4096) {
                    this.field2120 -= 4096;
                }
                if (this.field2117 > 4096) {
                    this.field2117 = 4096;
                }
                this.method872(this.field2119, this.field2117, (byte) 123, this.field2120);
                var7[var11] = this.field2112;
                var10[var11] = this.field2122;
                var9[var11] = this.field2106;
            }
        }
        return arg1 == 4944 ? var3 : (int[][]) ((int[][]) null);
    }

    @OriginalMember(owner = "client!pm", name = "b", descriptor = "(IIBI)V", line = 433)
    private final void method872(int arg0, int arg1, byte arg2, int arg3) {
        field2115++;
        int var5 = arg1 > 2048 ? arg1 + arg0 - (arg0 * arg1 >> 12) : (arg0 + 4096) * arg1 >> 12;
        if (var5 <= 0) {
            this.field2112 = this.field2122 = this.field2106 = arg1;
        } else {
            int var6 = arg1 + arg1 - var5;
            int var7 = arg3 * 6;
            int var8 = (var5 - var6 << 12) / var5;
            int var9 = var7 >> 12;
            int var10 = var7 - (var9 << 12);
            int var12 = var8 * var5 >> 12;
            int var13 = var10 * var12 >> 12;
            int var14 = var6 + var13;
            int var15 = var5 - var13;
            if (var9 == 0) {
                this.field2112 = var5;
                this.field2106 = var6;
                this.field2122 = var14;
            } else if (var9 == 1) {
                this.field2112 = var15;
                this.field2106 = var6;
                this.field2122 = var5;
            } else if (var9 == 2) {
                this.field2112 = var6;
                this.field2106 = var14;
                this.field2122 = var5;
            } else if (var9 == 3) {
                this.field2112 = var6;
                this.field2106 = var5;
                this.field2122 = var15;
            } else if (var9 == 4) {
                this.field2122 = var6;
                this.field2112 = var14;
                this.field2106 = var5;
            } else if (var9 == 5) {
                this.field2122 = var6;
                this.field2112 = var5;
                this.field2106 = var15;
            }
        }
        if (arg2 < 18) {
            this.field2119 = -98;
        }
    }
}
