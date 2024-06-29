import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fe")
public class class265 extends class313 {

    @OriginalMember(owner = "client!fe", name = "N", descriptor = "Z")
    public static boolean field4275 = false;

    @OriginalMember(owner = "client!fe", name = "P", descriptor = "I")
    public static int field4277 = 0;

    @OriginalMember(owner = "client!fe", name = "I", descriptor = "I")
    public static int field4271;

    @OriginalMember(owner = "client!fe", name = "K", descriptor = "I")
    private int field4272;

    @OriginalMember(owner = "client!fe", name = "L", descriptor = "I")
    public static int field4273;

    @OriginalMember(owner = "client!fe", name = "M", descriptor = "I")
    public static int field4274;

    @OriginalMember(owner = "client!fe", name = "O", descriptor = "I")
    public static int field4276;

    @OriginalMember(owner = "client!fe", name = "Q", descriptor = "I")
    public static int field4278;

    @OriginalMember(owner = "client!fe", name = "R", descriptor = "I")
    private int field4279;

    @OriginalMember(owner = "client!fe", name = "S", descriptor = "I")
    public static int field4280;

    @OriginalMember(owner = "client!fe", name = "T", descriptor = "I")
    private int field4281;

    @OriginalMember(owner = "client!fe", name = "U", descriptor = "I")
    public static int field4282;

    @OriginalMember(owner = "client!fe", name = "W", descriptor = "I")
    public static int field4284;

    @OriginalMember(owner = "client!fe", name = "X", descriptor = "I")
    public static int field4285;

    @OriginalMember(owner = "client!fe", name = "V", descriptor = "Lwb;")
    public static class171 field4283;

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(II)[[I", line = 10)
    public final int[][] method299(int arg0, int arg1) {
        int[][] var3 = this.field4958.method2404(arg0, (byte) 124);
        if (arg1 != 2) {
            this.field4272 = 25;
        }
        if (this.field4958.field5463) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            for (int var7 = 0; var7 < class133.field2269; var7++) {
                var4[var7] = this.field4281;
                var5[var7] = this.field4272;
                var6[var7] = this.field4279;
            }
        }
        field4282++;
        return var3;
    }

    @OriginalMember(owner = "client!fe", name = "c", descriptor = "(II)Loj;", line = 52)
    public static final class351 method1823(int arg0, int arg1) {
        field4274++;
        class351 var2 = (class351) class4.field56.method467(true, (long) arg0);
        if (arg1 != -29180) {
            field4277 = -77;
        }
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class211.field3567.method441(false, 31, arg0);
        class351 var4 = new class351();
        if (var3 != null) {
            var4.method2444(new class336(var3), arg0, -96);
        }
        class4.field56.method465(var4, (long) arg0, (byte) 88);
        return var4;
    }

    @OriginalMember(owner = "client!fe", name = "g", descriptor = "(I)[Lta;", line = 76)
    public static final class217[] method1824(int arg0) {
        if (arg0 != 9192) {
            field4283 = (class171) null;
        }
        field4273++;
        class217[] var1 = new class217[class130.field2242];
        for (int var2 = 0; var2 < class130.field2242; var2++) {
            var1[var2] = new class217(class308.field4901, class4.field58, class352.field5575[var2], class104.field1743[var2], class39.field585[var2], class123.field2138[var2], class191.field3205[var2], class40.field600);
        }
        class15.method151(0);
        return var1;
    }

    @OriginalMember(owner = "client!fe", name = "d", descriptor = "(II)V", line = 103)
    private final void method1825(int arg0, int arg1) {
        this.field4281 = arg1 >> 12 & 0xFF0;
        field4280++;
        this.field4279 = arg1 & 0xFF << 4;
        this.field4272 = arg1 >> 4 & 0xFF0;
        if (arg0 != 2358) {
            field4283 = (class171) null;
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(Lcg;[Ln;Z)V", line = 118)
    public static final void method1826(class49 arg0, class309[] arg1, boolean arg2) {
        field4285++;
        class83.field1330 = arg1;
        class122.field2120 = arg0;
        class124.field2140 = new boolean[class83.field1330.length];
        class137.field2370.method734(1);
        int var3 = class122.field2120.method437((byte) -33, "details");
        int[] var4 = class122.field2120.method430(var3, (byte) -28);
        if (arg2) {
            for (int var5 = 0; var5 < var4.length; var5++) {
                class137.field2370.method725((long) var4[var5], class200.method1510(var4[var5], 1, new class336(class122.field2120.method441(false, var3, var4[var5]))), 1);
            }
        }
    }

    @OriginalMember(owner = "client!fe", name = "<init>", descriptor = "(I)V", line = 147)
    private class265(int arg0) {
        super(0, false);
        this.method1825(2358, arg0);
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(IILpi;)V", line = 156)
    public final void method185(int arg0, int arg1, class336 arg2) {
        field4271++;
        if (arg0 == 0) {
            this.method1825(2358, arg2.method2317(arg1 ^ 0xFFFFEF63));
        }
        if (arg1 != -17848) {
            field4283 = (class171) null;
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(IZII)I", line = 185)
    public static final int method1827(int arg0, boolean arg1, int arg2, int arg3) {
        if (!arg1) {
            return 123;
        }
        field4278++;
        int var4 = class62.field955[class103.method888(arg0, arg2)];
        if (arg3 > 0) {
            int var5 = class62.field953.method1230(arg3 & 0xFFFF, true);
            if (var5 != 0) {
                int var6;
                if (arg2 < 0) {
                    var6 = 0;
                } else if (arg2 <= 127) {
                    var6 = arg2 * 131586;
                } else {
                    var6 = 16777215;
                }
                if (var5 == 256) {
                    var4 = var6;
                } else {
                    int var8 = 256 - var5;
                    var4 = ((var6 & 0xFF00FF) * var5 + ((var4 & 0xFF00FF) * var8) & 0xFF00FF00) + ((var4 & 0xFF00) * var8 + (var6 & 0xFF00) * var5 & 0xFF0000) >> 8;
                }
            }
            int var9 = class62.field953.method1224(-59, arg3 & 0xFFFF);
            if (var9 != 0) {
                var9 += 256;
                int var10 = (var4 >> 16 & 0xFF) * var9;
                if (var10 > 65535) {
                    var10 = 65535;
                }
                int var11 = (var4 & 0xFF) * var9;
                if (var11 > 65535) {
                    var11 = 65535;
                }
                int var12 = (var4 >> 8 & 0xFF) * var9;
                if (var12 > 65535) {
                    var12 = 65535;
                }
                var4 = (var12 & 0xFF00) + (((var10 & 0x8C00FF00) << 8) + (var11 >> 8));
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!fe", name = "c", descriptor = "(B)V", line = 258)
    public static void method1828(byte arg0) {
        field4283 = null;
        if (arg0 != -17) {
            method1829(21, 119, -15, -49, -41, 57, -68);
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(IIIIIII)V", line = 271)
    public static final void method1829(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (class170.field2944 <= arg4 && arg3 <= class310.field4916 && arg2 >= class90.field1428 && arg5 <= class135.field2358) {
            if (arg0 == 1) {
                class148.method1175(-1, arg1, arg4, arg5, arg3, arg2);
            } else {
                class289.method1972(arg3, arg1, arg0, 127, arg5, arg4, arg2);
            }
        } else if (arg0 == 1) {
            class116.method990(arg5, arg4, arg3, -1, arg1, arg2);
        } else {
            class94.method813(arg2, arg6 ^ 0x12BB, arg3, arg5, arg1, arg4, arg0);
        }
        if (arg6 == 16067) {
            field4284++;
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(ILcg;)V", line = 302)
    public static final void method1830(int arg0, class49 arg1) {
        if (arg0 == 131586) {
            field4276++;
            class122.field2129 = arg1;
        }
    }

    @OriginalMember(owner = "client!fe", name = "<init>", descriptor = "()V", line = 313)
    public class265() {
        this(0);
    }
}
