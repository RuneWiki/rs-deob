import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fh")
public class class172 implements Runnable {

    @OriginalMember(owner = "client!fh", name = "c", descriptor = "Lob;")
    private class256 field3069 = new class256();

    @OriginalMember(owner = "client!fh", name = "r", descriptor = "Z")
    private boolean field3084 = false;

    @OriginalMember(owner = "client!fh", name = "u", descriptor = "I")
    public int field3087 = 0;

    @OriginalMember(owner = "client!fh", name = "o", descriptor = "Ljava/lang/Thread;")
    private Thread field3081;

    @OriginalMember(owner = "client!fh", name = "j", descriptor = "Llc;")
    public static class143 field3076 = class66.method374("Hierhin drehen", -1);

    @OriginalMember(owner = "client!fh", name = "q", descriptor = "I")
    public static int field3083 = 0;

    @OriginalMember(owner = "client!fh", name = "t", descriptor = "[Z")
    public static boolean[] field3086 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false };

    @OriginalMember(owner = "client!fh", name = "d", descriptor = "Llc;")
    public static class143 field3070 = class66.method374("Verbindung mit Update)2Server)3)3)3", -1);

    @OriginalMember(owner = "client!fh", name = "v", descriptor = "[Z")
    public static boolean[] field3088 = new boolean[8];

    @OriginalMember(owner = "client!fh", name = "s", descriptor = "Llc;")
    public static class143 field3085 = class66.method374(",Mcran)2titre charg-B", -1);

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "I")
    public static int field3067;

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "I")
    public static int field3068;

    @OriginalMember(owner = "client!fh", name = "e", descriptor = "I")
    public static int field3071;

    @OriginalMember(owner = "client!fh", name = "f", descriptor = "I")
    public static int field3072;

    @OriginalMember(owner = "client!fh", name = "g", descriptor = "I")
    public static int field3073;

    @OriginalMember(owner = "client!fh", name = "h", descriptor = "I")
    public static int field3074;

    @OriginalMember(owner = "client!fh", name = "i", descriptor = "I")
    public static int field3075;

    @OriginalMember(owner = "client!fh", name = "k", descriptor = "I")
    public static int field3077;

    @OriginalMember(owner = "client!fh", name = "m", descriptor = "I")
    public static int field3079;

    @OriginalMember(owner = "client!fh", name = "n", descriptor = "I")
    public static int field3080;

    @OriginalMember(owner = "client!fh", name = "p", descriptor = "I")
    public static int field3082;

    @OriginalMember(owner = "client!fh", name = "l", descriptor = "Lgf;")
    public static class7 field3078;

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(Lka;I[BI)Ldg;")
    public final class283 method1125(class164 arg0, int arg1, byte[] arg2, int arg3) {
        field3068++;
        class283 var5 = new class283();
        var5.field4990 = arg0;
        int var6 = -80 / ((-arg1 - 65) / 40);
        var5.field4995 = arg2;
        var5.field3967 = (long) arg3;
        var5.field1052 = false;
        var5.field4986 = 2;
        this.method1128(var5, -2);
        return var5;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(Ljava/awt/Component;ILq;II)Lcb;")
    public static final class248 method1126(Component arg0, int arg1, class81 arg2, int arg3, int arg4) {
        field3080++;
        if (class190.field3494 == 0) {
            throw new IllegalStateException();
        } else if (arg1 >= 0 && arg1 < 2) {
            if (arg4 < 256) {
                arg4 = 256;
            }
            try {
                class248 var5 = (class248) Class.forName("si").getDeclaredConstructor().newInstance();
                var5.field4475 = arg4;
                var5.field4464 = new int[(class83.field1509 ? 2 : 1) * 256];
                var5.method1641(arg0);
                var5.field4477 = (arg4 & 0xFFFFFC00) + 1024;
                if (var5.field4477 > 16384) {
                    var5.field4477 = 16384;
                }
                var5.method1651(var5.field4477);
                int var6 = 67 / ((arg3 - 60) / 38);
                if (class7.field134 > 0 && class56.field1087 == null) {
                    class56.field1087 = new class264();
                    class56.field1087.field4753 = arg2;
                    arg2.method460(class56.field1087, (byte) 81, class7.field134);
                }
                if (class56.field1087 != null) {
                    if (class56.field1087.field4750[arg1] != null) {
                        throw new IllegalArgumentException();
                    }
                    class56.field1087.field4750[arg1] = var5;
                }
                return var5;
            } catch (Throwable var9) {
                try {
                    class284 var7 = new class284(arg2, arg1);
                    var7.field4464 = new int[(class83.field1509 ? 2 : 1) * 256];
                    var7.field4475 = arg4;
                    var7.method1641(arg0);
                    var7.field4477 = 16384;
                    var7.method1651(var7.field4477);
                    if (class7.field134 > 0 && class56.field1087 == null) {
                        class56.field1087 = new class264();
                        class56.field1087.field4753 = arg2;
                        arg2.method460(class56.field1087, (byte) 68, class7.field134);
                    }
                    if (class56.field1087 != null) {
                        if (class56.field1087.field4750[arg1] != null) {
                            throw new IllegalArgumentException();
                        }
                        class56.field1087.field4750[arg1] = var7;
                    }
                    return var7;
                } catch (Throwable var8) {
                    return new class248();
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(IILvh;BI)V")
    public static final void method1127(int arg0, int arg1, class43 arg2, byte arg3, int arg4) {
        field3082++;
        class224.method1543((byte) -56);
        class260.method1738(arg1, arg4, arg2.field735 + arg1, arg2.field831 + arg4);
        if (class155.field2794 == 2 || class155.field2794 == 5 || class105.field1849 == null) {
            class260.method1723(arg1, arg4, 0, arg2.field779, arg2.field826);
        } else {
            int var5 = class184.field3339 + class137.field2400 & 0x7FF;
            int var6 = 464 - (class229.field4195.field4108 / 32);
            int var7 = class229.field4195.field4178 / 32 + 48;
            ((class160) class105.field1849).method1045(arg1, arg4, arg2.field735, arg2.field831, var7, var6, var5, class230.field4211 + 256, arg2.field779, arg2.field826);
            if (class242.field4350 != null) {
                for (int var8 = 0; var8 < class242.field4350.field2376; var8++) {
                    if (class242.field4350.method814((byte) -124, var8)) {
                        int var9 = (class242.field4350.field2368[var8] - class148.field2733) * 4 + 2 - (class229.field4195.field4178 / 32);
                        int var10 = (class242.field4350.field2378[var8] - class141.field2466) * 4 + 2 - (class229.field4195.field4108 / 32);
                        int var11 = class196.field3635[var5];
                        int var12 = var11 * 256 / (class230.field4211 + 256);
                        int var13 = class196.field3630[var5];
                        int var14 = var13 * 256 / (class230.field4211 + 256);
                        int var15 = var9 * var14 + var10 * var12 >> 16;
                        int var16 = var10 * var14 - (var9 * var12) >> 16;
                        class193 var17 = class256.field4608;
                        if (class242.field4350.method810(3, var8) == 1) {
                            var17 = class134.field2341;
                        }
                        if (class242.field4350.method810(3, var8) == 2) {
                            var17 = class239.field4326;
                        }
                        int var18 = var17.method1313(class242.field4350.field2375[var8], 100);
                        int var19 = var15 - var18 / 2;
                        if ((-arg2.field735) <= var19 && arg2.field735 >= var19 && var16 >= (-arg2.field831) && var16 <= arg2.field831) {
                            int var20 = 16777215;
                            if (class242.field4350.field2373[var8] != -1) {
                                var20 = class242.field4350.field2373[var8];
                            }
                            class260.method1716(arg2.field779, arg2.field826);
                            var17.method1312(class242.field4350.field2375[var8], arg2.field735 / 2 + (var19 + arg1), arg2.field831 / 2 + arg4 + -var16, var18, 50, var20, 0, 256, 1, 0, 0);
                            class260.method1724();
                        }
                    }
                }
            }
            for (int var21 = 0; var21 < class47.field927; var21++) {
                int var56 = class202.field3676[var21] * 4 + 2 - (class229.field4195.field4178 / 32);
                int var57 = class159.field2877[var21] * 4 + 2 - (class229.field4195.field4108 / 32);
                class209 var58 = class34.method232(167, class71.field1343[var21]);
                if (var58.field3868 != null) {
                    var58 = var58.method1467((byte) -119);
                    if (var58 == null || var58.field3851 == -1) {
                        continue;
                    }
                }
                class230.method1566((byte) -73, arg1, arg2, var56, var57, class202.field3675[var58.field3851], arg4);
            }
            for (int var22 = 0; var22 < 104; var22++) {
                for (int var52 = 0; var52 < 104; var52++) {
                    class191 var53 = class130.field2306[class170.field3044][var22][var52];
                    if (var53 != null) {
                        int var54 = var22 * 4 + 2 - (class229.field4195.field4178 / 32);
                        int var55 = var52 * 4 + 2 - (class229.field4195.field4108 / 32);
                        class230.method1566((byte) -73, arg1, arg2, var54, var55, class127.field2247[0], arg4);
                    }
                }
            }
            for (int var23 = 0; var23 < class212.field3945; var23++) {
                class187 var48 = class259.field4648[class56.field1093[var23]];
                if (var48 != null && var48.method217(false)) {
                    class85 var49 = var48.field3384;
                    if (var49 != null && var49.field1538 != null) {
                        var49 = var49.method489(-23677);
                    }
                    if (var49 != null && var49.field1520 && var49.field1518) {
                        int var50 = var48.field4178 / 32 - class229.field4195.field4178 / 32;
                        int var51 = var48.field4108 / 32 - (class229.field4195.field4108 / 32);
                        if (var49.field1545 == -1) {
                            class230.method1566((byte) -73, arg1, arg2, var50, var51, class127.field2247[1], arg4);
                        } else {
                            class230.method1566((byte) -73, arg1, arg2, var50, var51, class202.field3675[var49.field1545], arg4);
                        }
                    }
                }
            }
            for (int var24 = 0; var24 < class107.field1889; var24++) {
                class32 var38 = class6.field97[class30.field467[var24]];
                if (var38 != null && var38.method217(false)) {
                    int var39 = var38.field4178 / 32 - (class229.field4195.field4178 / 32);
                    int var40 = var38.field4108 / 32 - class229.field4195.field4108 / 32;
                    boolean var41 = false;
                    long var42 = var38.field518.method874(7);
                    for (int var44 = 0; var44 < class25.field421; var44++) {
                        if (class13.field251[var44] == var42 && class129.field2291[var44] != 0) {
                            var41 = true;
                            break;
                        }
                    }
                    boolean var45 = false;
                    for (int var46 = 0; var46 < class30.field479; var46++) {
                        if (class120.field2113[var46].field1162 == var42) {
                            var45 = true;
                            break;
                        }
                    }
                    boolean var47 = false;
                    if (class229.field4195.field528 != 0 && var38.field528 != 0 && class229.field4195.field528 == var38.field528) {
                        var47 = true;
                    }
                    if (var41) {
                        class230.method1566((byte) -73, arg1, arg2, var39, var40, class127.field2247[3], arg4);
                    } else if (var45) {
                        class230.method1566((byte) -73, arg1, arg2, var39, var40, class127.field2247[5], arg4);
                    } else if (var47) {
                        class230.method1566((byte) -73, arg1, arg2, var39, var40, class127.field2247[4], arg4);
                    } else {
                        class230.method1566((byte) -73, arg1, arg2, var39, var40, class127.field2247[2], arg4);
                    }
                }
            }
            class58[] var25 = class250.field4510;
            for (int var26 = 0; var26 < var25.length; var26++) {
                class58 var29 = var25[var26];
                if (var29 != null && var29.field1112 != 0 && class146.field2635 % 20 < 10) {
                    if (var29.field1112 == 1 && var29.field1123 >= 0 && class259.field4648.length > var29.field1123) {
                        class187 var30 = class259.field4648[var29.field1123];
                        if (var30 != null) {
                            int var31 = var30.field4108 / 32 - class229.field4195.field4108 / 32;
                            int var32 = var30.field4178 / 32 - class229.field4195.field4178 / 32;
                            class271.method1793((byte) -41, arg2, var31, arg1, var32, arg4, var29.field1114);
                        }
                    }
                    if (var29.field1112 == 2) {
                        int var33 = (var29.field1126 - class148.field2733) * 4 + 2 - (class229.field4195.field4178 / 32);
                        int var34 = (var29.field1119 - class141.field2466) * 4 + 2 - (class229.field4195.field4108 / 32);
                        class271.method1793((byte) -18, arg2, var34, arg1, var33, arg4, var29.field1114);
                    }
                    if (var29.field1112 == 10 && var29.field1123 >= 0 && class6.field97.length > var29.field1123) {
                        class32 var35 = class6.field97[var29.field1123];
                        if (var35 != null) {
                            int var36 = var35.field4178 / 32 - class229.field4195.field4178 / 32;
                            int var37 = var35.field4108 / 32 - class229.field4195.field4108 / 32;
                            class271.method1793((byte) -87, arg2, var37, arg1, var36, arg4, var29.field1114);
                        }
                    }
                }
            }
            if (class177.field3170 != 0) {
                int var27 = class177.field3170 * 4 + 2 - (class229.field4195.field4178 / 32);
                int var28 = class123.field2154 * 4 + 2 - (class229.field4195.field4108 / 32);
                class230.method1566((byte) -73, arg1, arg2, var27, var28, class185.field3356, arg4);
            }
            class260.method1726(arg2.field735 / 2 + arg1 - 1, arg4 - -(arg2.field831 / 2) + -1, 3, 3, 16777215);
        }
        class136.field2384[arg0] = true;
        int var59 = 99 % ((16 - arg3) / 48);
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(Ldg;I)V")
    private final void method1128(class283 arg0, int arg1) {
        class256 var3 = this.field3069;
        synchronized (this.field3069) {
            this.field3069.method1694(61, arg0);
            this.field3087++;
            if (arg1 != -2) {
                field3070 = null;
            }
            this.field3069.notifyAll();
        }
        field3075++;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(B)V")
    public static final void method1129(byte arg0) {
        if (arg0 != 94) {
            method1132((byte) -1);
        }
        field3079++;
        if (class13.field248) {
            class13.field248 = false;
            class271.field4835 = null;
            class79.field1438 = null;
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(I)V")
    public final void method1130(int arg0) {
        this.field3084 = true;
        field3067++;
        class256 var2 = this.field3069;
        synchronized (this.field3069) {
            if (arg0 != 0) {
                return;
            }
            this.field3069.notifyAll();
        }
        try {
            this.field3081.join();
        } catch (InterruptedException var5) {
        }
        this.field3081 = null;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(ILka;I)Ldg;")
    public final class283 method1131(int arg0, class164 arg1, int arg2) {
        class283 var4 = new class283();
        field3073++;
        int var5 = -91 / ((-arg0 - 38) / 61);
        var4.field1052 = false;
        var4.field4990 = arg1;
        var4.field3967 = (long) arg2;
        var4.field4986 = 3;
        this.method1128(var4, -2);
        return var4;
    }

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "(B)V")
    public static void method1132(byte arg0) {
        field3076 = null;
        field3086 = null;
        field3078 = null;
        field3085 = null;
        if (arg0 >= -94) {
            method1127(-39, 124, (class43) null, (byte) -3, 46);
        }
        field3088 = null;
        field3070 = null;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(Lka;IB)Ldg;")
    public final class283 method1133(class164 arg0, int arg1, byte arg2) {
        class283 var4 = new class283();
        var4.field4986 = 1;
        field3072++;
        class256 var5 = this.field3069;
        synchronized (this.field3069) {
            class283 var6 = (class283) this.field3069.method1698(101);
            while (true) {
                if (var6 == null) {
                    if (arg2 != 126) {
                        this.field3084 = true;
                    }
                    break;
                }
                if (((long) arg1) == var6.field3967 && var6.field4990 == arg0 && var6.field4986 == 2) {
                    var4.field1054 = false;
                    var4.field4995 = var6.field4995;
                    return var4;
                }
                var6 = (class283) this.field3069.method1699(arg2 - 225);
            }
        }
        var4.field4995 = arg0.method1076(-93, arg1);
        var4.field1054 = false;
        var4.field1052 = true;
        return var4;
    }

    @OriginalMember(owner = "client!fh", name = "<init>", descriptor = "()V")
    public class172() {
        class181 var1 = class4.field62.method460(this, (byte) 56, 5);
        while (var1.field3241 == 0) {
            class61.method347(10L, 1);
        }
        if (var1.field3241 == 2) {
            throw new RuntimeException();
        }
        this.field3081 = (Thread) var1.field3239;
    }

    @OriginalMember(owner = "client!fh", name = "run", descriptor = "()V")
    public final void run() {
        while (!this.field3084) {
            class256 var1 = this.field3069;
            class283 var2;
            synchronized (this.field3069) {
                var2 = (class283) this.field3069.method1700(-1);
                if (var2 == null) {
                    try {
                        this.field3069.wait();
                    } catch (InterruptedException var6) {
                    }
                    continue;
                }
                this.field3087--;
            }
            try {
                if (var2.field4986 == 2) {
                    var2.field4990.method1084((int) var2.field3967, (byte) 56, var2.field4995.length, var2.field4995);
                } else if (var2.field4986 == 3) {
                    var2.field4995 = var2.field4990.method1076(-58, (int) var2.field3967);
                }
            } catch (Exception var7) {
                class255.method1689(73, (String) null, var7);
            }
            var2.field1054 = false;
        }
        field3074++;
    }
}
