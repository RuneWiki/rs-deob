import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cf")
public class class21 implements Runnable {

    @OriginalMember(owner = "client!cf", name = "f", descriptor = "Lrd;")
    private static class114 field378 = class84.method656("Please use a different world)3", (byte) 121);

    @OriginalMember(owner = "client!cf", name = "d", descriptor = "Lrd;")
    private static class114 field376 = class84.method656("Take", (byte) 126);

    @OriginalMember(owner = "client!cf", name = "h", descriptor = "I")
    public static int field380 = -1;

    @OriginalMember(owner = "client!cf", name = "g", descriptor = "J")
    public static long field379 = 0L;

    @OriginalMember(owner = "client!cf", name = "j", descriptor = "Lrd;")
    public static class114 field382 = field378;

    @OriginalMember(owner = "client!cf", name = "m", descriptor = "Lrd;")
    private static class114 field385 = class84.method656("Enter name of friend to add to list", (byte) 117);

    @OriginalMember(owner = "client!cf", name = "n", descriptor = "Lrd;")
    public static class114 field386 = class84.method656("(X100(U(Y", (byte) 122);

    @OriginalMember(owner = "client!cf", name = "k", descriptor = "Lrd;")
    public static class114 field383 = field385;

    @OriginalMember(owner = "client!cf", name = "u", descriptor = "Lrd;")
    public static class114 field393 = class84.method656("Ung-Ultige Session)2ID)3", (byte) 114);

    @OriginalMember(owner = "client!cf", name = "q", descriptor = "Lrd;")
    public static class114 field389 = class84.method656("::clientdrop", (byte) 123);

    @OriginalMember(owner = "client!cf", name = "v", descriptor = "Lrd;")
    public static class114 field394 = class84.method656("blinken3:", (byte) 117);

    @OriginalMember(owner = "client!cf", name = "x", descriptor = "Lrd;")
    private static class114 field396 = class84.method656("Enter object name", (byte) 114);

    @OriginalMember(owner = "client!cf", name = "w", descriptor = "Lrd;")
    public static class114 field395 = field378;

    @OriginalMember(owner = "client!cf", name = "o", descriptor = "Lrd;")
    public static class114 field387 = field396;

    @OriginalMember(owner = "client!cf", name = "c", descriptor = "Lrd;")
    public static class114 field375 = field376;

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "I")
    public static int field373;

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "I")
    public static int field374;

    @OriginalMember(owner = "client!cf", name = "e", descriptor = "I")
    public static int field377;

    @OriginalMember(owner = "client!cf", name = "i", descriptor = "I")
    public static int field381;

    @OriginalMember(owner = "client!cf", name = "l", descriptor = "I")
    public static int field384;

    @OriginalMember(owner = "client!cf", name = "p", descriptor = "I")
    public static int field388;

    @OriginalMember(owner = "client!cf", name = "r", descriptor = "I")
    public static int field390;

    @OriginalMember(owner = "client!cf", name = "s", descriptor = "I")
    public static int field391;

    @OriginalMember(owner = "client!cf", name = "t", descriptor = "I")
    public static int field392;

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(IIII)V")
    public static final void method136(int arg0, int arg1, int arg2, int arg3) {
        field381++;
        if (arg2 < arg3 || arg0 < 128 || arg2 > 13056 || arg0 > 13056) {
            field380 = -1;
            class38.field802 = -1;
            return;
        }
        int var4 = class137.method1110(class20.field346, arg2, arg0, (byte) 37) - arg1;
        int var5 = arg2 - class143.field3404;
        int var6 = arg0 - class99.field2253;
        int var7 = var4 - class128.field3075;
        int var8 = class134.field3272[class140.field3337];
        int var9 = class134.field3279[class88.field1966];
        int var10 = class134.field3272[class88.field1966];
        int var11 = class134.field3279[class140.field3337];
        int var12 = var5 * var11 + var6 * var8 >> 16;
        int var13 = var6 * var11 - var5 * var8 >> 16;
        int var15 = var7 * var9 - var10 * var13 >> 16;
        int var16 = var7 * var10 + var9 * var13 >> 16;
        if (var16 < 50) {
            class38.field802 = -1;
            field380 = -1;
        } else {
            field380 = (var12 << 9) / var16 + 256;
            class38.field802 = (var15 << 9) / var16 + 167;
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(ILnd;Lnd;II)Lnd;")
    public static final class90 method137(int arg0, class90 arg1, class90 arg2, int arg3, int arg4) {
        class90 var5 = class100.method759(arg2, arg0, 0, arg1.field2044, arg3, arg1.field2060, class78.field1772[arg1.field2060 >> 16], -1, arg1.field2043, arg4, arg1.field2032, arg1.field2013);
        field384++;
        if (var5 == null) {
            if (arg1.field2031 != null) {
                var5 = class100.method759(arg2, 0, 0, arg1.field2044, arg3, arg1.field2060, arg1.field2031, -1, arg1.field2043, arg4, arg1.field2032, arg1.field2013);
            }
            return var5;
        } else {
            return var5;
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(I)V")
    public static void method138(int arg0) {
        field375 = null;
        field376 = null;
        field396 = null;
        field382 = null;
        field395 = null;
        field393 = null;
        field386 = null;
        field387 = null;
        field383 = null;
        field389 = null;
        field385 = null;
        field378 = null;
        field394 = null;
        if (arg0 != 0) {
            field396 = null;
        }
    }

    @OriginalMember(owner = "client!cf", name = "run", descriptor = "()V")
    public final void run() {
        field391++;
        try {
            while (true) {
                class84 var1 = class118.field2761;
                class125 var2;
                synchronized (class118.field2761) {
                    var2 = (class125) class118.field2761.method654((byte) 91);
                }
                if (var2 == null) {
                    class141.method1122(17525, 100L);
                    Object var3 = class36.field751;
                    synchronized (class36.field751) {
                        if (class39.field818 <= 1) {
                            class39.field818 = 0;
                            class36.field751.notifyAll();
                            return;
                        }
                        class39.field818--;
                    }
                } else {
                    if (var2.field2968 == 0) {
                        var2.field2980.method163(var2.field2978.length, (int) var2.field1448, var2.field2978, -1);
                        class84 var5 = class118.field2761;
                        synchronized (class118.field2761) {
                            var2.method540(-26669);
                        }
                    } else if (var2.field2968 == 1) {
                        var2.field2978 = var2.field2980.method162((byte) -119, (int) var2.field1448);
                        class84 var4 = class118.field2761;
                        synchronized (class118.field2761) {
                            class103.field2407.method645(var2, (byte) -13);
                        }
                    }
                    Object var6 = class36.field751;
                    synchronized (class36.field751) {
                        if (class39.field818 <= 1) {
                            class39.field818 = 0;
                            class36.field751.notifyAll();
                            return;
                        }
                        class39.field818 = 600;
                    }
                }
            }
        } catch (Exception var17) {
            class121.method943((byte) -90, var17, null);
        }
    }

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "(I)V")
    public static final void method139(int arg0) {
        class64.field1362.method200(-112);
        int var1 = -45 % ((-arg0 - 40) / 46);
        field388++;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(Lnd;Z)Lrd;")
    public static final class114 method140(class90 arg0, boolean arg1) {
        if (!arg1) {
            field395 = null;
        }
        field373++;
        if (class121.method941((byte) 69, class39.method278(arg0, 1572721824)) == 0) {
            return null;
        } else if (arg0.field2089 == null || arg0.field2089.method862(-6488).method854(-29348) == 0) {
            return class1.field11 ? class120.field2795 : null;
        } else {
            return arg0.field2089;
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(ZILjava/awt/Component;Lg;I)Lre;")
    public static final class115 method141(boolean arg0, int arg1, Component arg2, class43 arg3, int arg4) {
        if (arg4 < 80) {
            return null;
        }
        class74.method604((byte) -88, arg2, arg0, arg1, arg3);
        field390++;
        class115 var5 = new class115();
        class31.method231(0, var5);
        return var5;
    }
}
