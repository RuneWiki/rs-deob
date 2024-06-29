import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hj")
public class class221 implements Runnable {

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "Z")
    public boolean field3799 = true;

    @OriginalMember(owner = "client!hj", name = "d", descriptor = "Ljava/lang/Object;")
    public Object field3802 = new Object();

    @OriginalMember(owner = "client!hj", name = "h", descriptor = "[I")
    public int[] field3806 = new int[500];

    @OriginalMember(owner = "client!hj", name = "j", descriptor = "[I")
    public int[] field3808 = new int[500];

    @OriginalMember(owner = "client!hj", name = "m", descriptor = "I")
    public int field3811 = 0;

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "Leg;")
    public static class37 field3800 = class174.method1167(" s(West d-Bconnect-B)3", 65);

    @OriginalMember(owner = "client!hj", name = "g", descriptor = "I")
    public static int field3805 = 0;

    @OriginalMember(owner = "client!hj", name = "f", descriptor = "I")
    public static int field3804 = 1;

    @OriginalMember(owner = "client!hj", name = "l", descriptor = "Leg;")
    public static class37 field3810 = class174.method1167("Memory before cleanup=", -127);

    @OriginalMember(owner = "client!hj", name = "c", descriptor = "I")
    public static int field3801;

    @OriginalMember(owner = "client!hj", name = "e", descriptor = "I")
    public static int field3803;

    @OriginalMember(owner = "client!hj", name = "i", descriptor = "I")
    public static int field3807;

    @OriginalMember(owner = "client!hj", name = "k", descriptor = "I")
    public static int field3809;

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(IILpe;IIIII)V")
    public static final void method1546(int arg0, int arg1, class237 arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class36.field519) {
            class7.field109 = 32;
        } else {
            class7.field109 = 0;
        }
        class36.field519 = false;
        if (arg4 > -56) {
            return;
        }
        if (class104.field1620 != 0) {
            if (arg6 <= arg7 && arg6 + 16 > arg7 && arg1 <= arg5 && arg1 + 16 > arg5) {
                arg2.field4122 -= 4;
                class121.method856(24665, arg2);
            } else if (arg6 <= arg7 && arg7 < arg6 + 16 && (arg1 + arg3 - 16) <= arg5 && arg5 < arg1 + arg3) {
                arg2.field4122 += 4;
                class121.method856(24665, arg2);
            } else if (arg7 >= (arg6 - class7.field109) && arg7 < (arg6 - (-class7.field109 - 16)) && (arg1 + 16) <= arg5 && (arg1 + arg3 - 16) > arg5) {
                int var8 = (arg3 - 32) * arg3 / arg0;
                if (var8 < 8) {
                    var8 = 8;
                }
                int var9 = arg3 - var8 - 32;
                int var10 = arg5 - arg1 - (var8 / 2) - 16;
                arg2.field4122 = (arg0 - arg3) * var10 / var9;
                class121.method856(24665, arg2);
                class36.field519 = true;
            }
        }
        if (class271.field4761 != 0) {
            int var11 = arg2.field4067;
            if (arg6 - var11 <= arg7 && arg1 <= arg5 && arg6 + 16 > arg7 && (arg1 + arg3) >= arg5) {
                arg2.field4122 += class271.field4761 * 45;
                class121.method856(24665, arg2);
            }
        }
        field3807++;
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(I)V")
    public static void method1547(int arg0) {
        field3800 = null;
        if (arg0 != 4) {
            method1547(-10);
        }
        field3810 = null;
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(IZ)V")
    public static final void method1548(int arg0, boolean arg1) {
        for (class89 var2 = (class89) class127.field2130.method1566(-3); var2 != null; var2 = (class89) class127.field2130.method1570(3)) {
            if (var2.field1410 != null) {
                class127.field2127.method1514(var2.field1410);
                var2.field1410 = null;
            }
            if (var2.field1421 != null) {
                class127.field2127.method1514(var2.field1421);
                var2.field1421 = null;
            }
            var2.method441(16773377);
        }
        field3801++;
        if (arg1) {
            for (class89 var3 = (class89) class175.field2928.method1566(-3); var3 != null; var3 = (class89) class175.field2928.method1570(3)) {
                if (var3.field1410 != null) {
                    class127.field2127.method1514(var3.field1410);
                    var3.field1410 = null;
                }
                var3.method441(16773377);
            }
            for (class89 var4 = (class89) class154.field2584.method993(-15322); var4 != null; var4 = (class89) class154.field2584.method988(4586)) {
                if (var4.field1410 != null) {
                    class127.field2127.method1514(var4.field1410);
                    var4.field1410 = null;
                }
                var4.method441(16773377);
            }
        }
        if (arg0 <= 0) {
            field3810 = null;
        }
    }

    @OriginalMember(owner = "client!hj", name = "run", descriptor = "()V")
    public final void run() {
        while (this.field3799) {
            Object var1 = this.field3802;
            synchronized (this.field3802) {
                if (this.field3811 < 500) {
                    this.field3806[this.field3811] = class26.field363;
                    this.field3808[this.field3811] = class268.field4689;
                    this.field3811++;
                }
            }
            class144.method1008(107, 50L);
        }
        field3803++;
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(Ljl;IZ)Lkc;")
    public static final class45 method1549(class101 arg0, int arg1, boolean arg2) {
        byte[] var3 = arg0.method669(arg1, (byte) 74);
        if (arg2) {
            field3809++;
            return var3 == null ? null : new class45(var3);
        } else {
            return null;
        }
    }
}
