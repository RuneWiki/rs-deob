import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jh")
public class class234 extends class254 {

    @OriginalMember(owner = "client!jh", name = "p", descriptor = "Z")
    public static boolean field3516 = true;

    @OriginalMember(owner = "client!jh", name = "x", descriptor = "I")
    public static int field3524 = 0;

    @OriginalMember(owner = "client!jh", name = "u", descriptor = "[I")
    public static int[] field3521 = new int[5];

    @OriginalMember(owner = "client!jh", name = "I", descriptor = "I")
    public static int field3535 = 0;

    @OriginalMember(owner = "client!jh", name = "C", descriptor = "I")
    public static volatile int field3529 = 0;

    @OriginalMember(owner = "client!jh", name = "J", descriptor = "I")
    public static int field3536 = 0;

    @OriginalMember(owner = "client!jh", name = "r", descriptor = "I")
    public int field3518;

    @OriginalMember(owner = "client!jh", name = "s", descriptor = "I")
    public int field3519;

    @OriginalMember(owner = "client!jh", name = "v", descriptor = "I")
    public static int field3522;

    @OriginalMember(owner = "client!jh", name = "z", descriptor = "I")
    public static int field3526;

    @OriginalMember(owner = "client!jh", name = "A", descriptor = "I")
    public static int field3527;

    @OriginalMember(owner = "client!jh", name = "B", descriptor = "I")
    public int field3528;

    @OriginalMember(owner = "client!jh", name = "F", descriptor = "I")
    public int field3532;

    @OriginalMember(owner = "client!jh", name = "K", descriptor = "I")
    public int field3537;

    @OriginalMember(owner = "client!jh", name = "L", descriptor = "I")
    public static int field3538;

    @OriginalMember(owner = "client!jh", name = "M", descriptor = "I")
    public static int field3539;

    @OriginalMember(owner = "client!jh", name = "G", descriptor = "Lve;")
    public static class233 field3533;

    @OriginalMember(owner = "client!jh", name = "w", descriptor = "Lha;")
    public class267 field3523;

    @OriginalMember(owner = "client!jh", name = "E", descriptor = "Lha;")
    public class267 field3531;

    @OriginalMember(owner = "client!jh", name = "t", descriptor = "Ljava/lang/String;")
    public String field3520;

    @OriginalMember(owner = "client!jh", name = "H", descriptor = "Z")
    public boolean field3534;

    @OriginalMember(owner = "client!jh", name = "q", descriptor = "[Lij;")
    public static class69[] field3517;

    @OriginalMember(owner = "client!jh", name = "D", descriptor = "[Ljava/lang/Object;")
    public Object[] field3530;

    @OriginalMember(owner = "client!jh", name = "y", descriptor = "[[[I")
    public static int[][][] field3525;

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(IIIII)V")
    public static final void method1541(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != 30106) {
            field3524 = 94;
        }
        class144.method950(arg2, arg1, arg2 + arg4, arg1 + arg3);
        class144.method955(arg2, arg1, arg4, arg3, 0);
        field3538++;
        if (class280.field4470 < 100) {
            return;
        }
        if (class163.field2371 == null || class163.field2371.field1075 != arg4 || class163.field2371.field1084 != arg3) {
            class244 var5 = new class244(arg4, arg3);
            class144.method959(var5.field3663, arg4, arg3);
            class120.method821(class63.field1009, 0, class99.field1482, arg4, 0, 0, arg3, (byte) -95, 0);
            class163.field2371 = var5;
            class251.field3828.method1142(arg0 ^ 0x7583);
        }
        class163.field2371.method473(arg2, arg1);
        int var6 = field3539 * arg4 / class99.field1482;
        int var7 = class42.field609 * arg3 / class63.field1009 + arg1;
        int var8 = class179.field2558 * arg4 / class99.field1482 + arg2;
        int var9 = class259.field3916 * arg3 / class63.field1009;
        int var10 = 16711680;
        if (class69.field1076 == 1) {
            var10 = 16777215;
        }
        class144.method958(var8, var7, var6, var9, var10, 128);
        class144.method951(var8, var7, var6, var9, var10);
        if (class80.field1235 <= 0) {
            return;
        }
        int var11;
        if (class140.field2029 > 10) {
            var11 = 500 - (class140.field2029 * 25);
        } else {
            var11 = class140.field2029 * 25;
        }
        for (class45 var12 = (class45) class173.field2471.method656(112); var12 != null; var12 = (class45) class173.field2471.method650(arg0 ^ 0x75E4)) {
            if (class242.field3637 == var12.field641) {
                int var13 = var12.field643 * arg4 / class99.field1482 + arg2;
                int var14 = var12.field638 * arg3 / class63.field1009 + arg1;
                class144.method958(var13 - 2, var14 + -2, 4, 4, 16776960, var11);
            }
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(BI)V")
    public static final void method1542(byte arg0, int arg1) {
        if (arg0 > -68) {
            field3535 = 82;
        }
        field3527++;
        if (class288.field4565 == null || class288.field4565.length < arg1) {
            class288.field4565 = new int[arg1];
        }
    }

    @OriginalMember(owner = "client!jh", name = "c", descriptor = "(I)V")
    public static void method1543(int arg0) {
        field3521 = null;
        field3533 = null;
        if (arg0 != 0) {
            method1544(118, -17, 34);
        }
        field3517 = null;
        field3525 = null;
    }

    @OriginalMember(owner = "client!jh", name = "b", descriptor = "(III)V")
    public static final void method1544(int arg0, int arg1, int arg2) {
        field3522++;
        if (arg0 != 896) {
            return;
        }
        for (int var3 = 0; var3 < class248.field3726; var3++) {
            class197 var4 = class221.method1419(117, var3);
            if (var4 != null) {
                int var5 = var4.field2842;
                if (var5 >= 0 && !class18.field252.method696(var5, true)) {
                    var5 = -1;
                }
                int var9;
                if (var4.field2846 >= 0) {
                    int var6 = var4.field2846;
                    int var7 = (var6 & 0x7F) + arg1;
                    if (var7 < 0) {
                        var7 = 0;
                    } else if (var7 > 127) {
                        var7 = 127;
                    }
                    int var8 = (arg2 + var6 & 0xFC00) - (-(var6 & 0x380) - var7);
                    var9 = class18.field260[class25.method186(false, var8, 96)];
                } else if (var5 >= 0) {
                    var9 = class18.field260[class25.method186(false, class18.field252.method700(var5, (byte) 127), 96)];
                } else if (var4.field2844 == -1) {
                    var9 = -1;
                } else {
                    int var10 = var4.field2844;
                    int var11 = (var10 & 0x7F) + arg1;
                    if (var11 < 0) {
                        var11 = 0;
                    } else if (var11 > 127) {
                        var11 = 127;
                    }
                    int var12 = (arg2 + var10 & 0xFC00) + (var10 & 0x380) + var11;
                    var9 = class18.field260[class25.method186(false, var12, 96)];
                }
                class152.field2193[var3 + 1] = var9;
            }
        }
    }
}
