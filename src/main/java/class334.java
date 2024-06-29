import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public class class334 extends class145 {

    @OriginalMember(owner = "client!nb", name = "H", descriptor = "I")
    public static int field4525 = 0;

    @OriginalMember(owner = "client!nb", name = "K", descriptor = "[[I")
    public static int[][] field4528 = new int[][] { { 0, 2 }, { 0, 2 }, { 0, 0, 2 }, { 2, 0, 0 }, { 0, 2, 0 }, { 0, 0, 2 }, { 0, 5, 1, 4 }, { 0, 4, 4, 4 }, { 4, 4, 4, 0 }, { 6, 6, 6, 2, 2, 2 }, { 2, 2, 2, 6, 6, 6 }, { 0, 11, 6, 6, 6, 4 }, { 0, 2 }, { 0, 4, 4, 4 }, { 0, 4, 4, 4 } };

    @OriginalMember(owner = "client!nb", name = "L", descriptor = "I")
    public static int field4529 = 0;

    @OriginalMember(owner = "client!nb", name = "N", descriptor = "Lik;")
    public static class410 field4531 = new class410(64);

    @OriginalMember(owner = "client!nb", name = "F", descriptor = "I")
    public static int field4523;

    @OriginalMember(owner = "client!nb", name = "G", descriptor = "I")
    public static int field4524;

    @OriginalMember(owner = "client!nb", name = "J", descriptor = "I")
    public static int field4527;

    @OriginalMember(owner = "client!nb", name = "M", descriptor = "I")
    public static int field4530;

    @OriginalMember(owner = "client!nb", name = "O", descriptor = "I")
    public static int field4532;

    @OriginalMember(owner = "client!nb", name = "P", descriptor = "I")
    public static int field4533;

    @OriginalMember(owner = "client!nb", name = "Q", descriptor = "[I")
    public static int[] field4534;

    @OriginalMember(owner = "client!nb", name = "I", descriptor = "[Ljava/lang/String;")
    public static String[] field4526;

    @OriginalMember(owner = "client!nb", name = "e", descriptor = "(B)V")
    public static void method2113(byte arg0) {
        field4531 = null;
        field4526 = null;
        if (arg0 == 42) {
            field4534 = null;
            field4528 = null;
        }
    }

    @OriginalMember(owner = "client!nb", name = "<init>", descriptor = "()V")
    public class334() {
        super(0, true);
    }

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "(II)Los;")
    public static final class378 method2114(int arg0, int arg1) {
        ++field4533;
        class378 var2 = (class378) field4531.method2537(-80, (long) arg0);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class167.field2481.method2633(arg0, -1, arg1);
            class378 var4 = new class378();
            if (var3 != null) {
                var4.method2363((byte) -93, new class289(var3));
            }
            var4.method2361((byte) 39);
            field4531.method2542(var4, (byte) 82, (long) arg0);
            return var4;
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(Loo;Ltj;ILpe;)V")
    public static final void method2115(class384 arg0, class430 arg1, int arg2, class391 arg3) {
        ++field4523;
        class80 var4 = arg0.method2381(-120, arg3);
        if (var4 != null) {
            int var5 = var4.method723();
            if (var4.method733() > var5) {
                var5 = var4.method733();
            }
            byte var6 = 10;
            int var7 = arg1.field6122;
            int var8 = arg1.field6114;
            int var9 = arg2;
            int var10 = 0;
            int var11 = 0;
            if (arg0.field5400 != null) {
                var9 = class138.field1946.method2048((byte) -82, arg0.field5400, class434.field6157, (class80[]) null, (int[]) null);
                for (int var12 = 0; var12 < var9; ++var12) {
                    String var13 = class434.field6157[var12];
                    if (~var12 > ~(var9 + -1)) {
                        var13 = var13.substring(0, var13.length() - 4);
                    }
                    int var14 = class370.field5087.method1476(var13);
                    if (~var14 < ~var10) {
                        var10 = var14;
                    }
                }
                var11 = var9 * class370.field5087.method1472() + class370.field5087.method1474() / 2;
            }
            int var15 = var5 / 2 + arg1.field6122;
            if (var7 >= class99.field1429 - -var5) {
                if (-var5 + class99.field1428 < var7) {
                    var15 = class99.field1428 - var10 / 2 + -(var5 / 2) + -var6 + -5;
                    var7 = -var5 + class99.field1428;
                }
            } else {
                var7 = class99.field1429;
                var15 = var5 / 2 + var10 / 2 + 5 + class99.field1429 + var6;
            }
            int var16 = arg1.field6114;
            if (class99.field1437 + var5 > var8) {
                var16 = var5 / 2 + var6 + class99.field1437;
                var8 = class99.field1437;
            } else if (~var8 < ~(-var5 + class99.field1431)) {
                var16 = -var6 + class99.field1431 + -(var5 / 2) + -var11;
                var8 = -var5 + class99.field1431;
            }
            int var17 = (int) (Math.atan2((double) (-arg1.field6122 + var7), (double) (var8 - arg1.field6114)) / 3.141592653589793D * 32767.0D) & 65535;
            var4.method728((float) var5 / 2.0F + (float) var7, (float) var5 / 2.0F + (float) var8, 4096, var17);
            int var18 = -2;
            int var19 = -2;
            int var20 = -2;
            int var21 = -2;
            int var22 = var5 >> 1;
            if (arg0.field5400 != null) {
                var18 = var15 - var10 / 2 + -5;
                var19 = var16;
                var20 = var18 + 10 - -var10;
                var21 = 3 + var9 * class370.field5087.method1472() + var16;
                if (arg0.field5379 != 0) {
                    arg3.method2414(var16, var18, -var16 + var21, true, -var18 + var20, arg0.field5379);
                }
                if (~arg0.field5413 != -1) {
                    arg3.method2413(var18, -15084, var16, arg0.field5413, var21 - var16, -var18 + var20);
                }
                for (int var23 = 0; ~var9 < ~var23; ++var23) {
                    String var24 = class434.field6157[var23];
                    if (~var23 > ~(var9 + -1)) {
                        var24 = var24.substring(0, -4 + var24.length());
                    }
                    class370.field5087.method1475(arg3, var24, var15, var16, arg0.field5385, true);
                    var16 += class370.field5087.method1472();
                }
            }
            if (~class391.field5490 < ~(-var22 + var7) && class391.field5490 < var7 - -var22 && -var22 + var8 < class312.field4220 && var8 + var22 > class312.field4220 || ~var18 > ~class391.field5490 && class391.field5490 < var20 && class312.field4220 > var19 && class312.field4220 < var21) {
                if (arg0.field5395[4] != null) {
                    class361.method2264(0, -1, arg0.field5395[4], (long) arg1.field6119, 127, arg0.field5419, 1005, 0);
                }
                if (arg0.field5395[3] != null) {
                    class361.method2264(0, -1, arg0.field5395[3], (long) arg1.field6119, 88, arg0.field5419, 1007, 0);
                }
                if (arg0.field5395[2] != null) {
                    class361.method2264(0, -1, arg0.field5395[2], (long) arg1.field6119, 46, arg0.field5419, 1003, 0);
                }
                if (arg0.field5395[1] != null) {
                    class361.method2264(0, -1, arg0.field5395[1], (long) arg1.field6119, 29, arg0.field5419, 1012, 0);
                }
                if (arg0.field5395[0] != null) {
                    class361.method2264(0, -1, arg0.field5395[0], (long) arg1.field6119, 116, arg0.field5419, 1001, 0);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(II)[I")
    public final int[] method3(int arg0, int arg1) {
        ++field4530;
        int var3 = -76 / ((16 - arg1) / 49);
        int[] var4 = super.field2218.method1614(41, arg0);
        if (super.field2218.field3396) {
            class152.method1171(var4, 0, class156.field2364, class134.field1902[arg0]);
        }
        return var4;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(ILjava/lang/String;)I")
    public static final int method2116(int arg0, String arg1) {
        ++field4532;
        if (arg0 <= 20) {
            method2113((byte) -40);
        }
        if (arg1 == null) {
            return -1;
        } else {
            for (int var2 = 0; class123.field1724 > var2; ++var2) {
                if (arg1.equalsIgnoreCase(class87.field1294[var2])) {
                    return var2;
                }
            }
            return -1;
        }
    }

    @OriginalMember(owner = "client!nb", name = "c", descriptor = "(II)V")
    public static final void method2117(int arg0, int arg1) {
        class410 var2 = class417.field5844;
        synchronized (class417.field5844) {
            class417.field5844.method2534(0, arg1);
            if (arg0 >= -113) {
                field4528 = null;
            }
        }
        ++field4524;
    }
}
