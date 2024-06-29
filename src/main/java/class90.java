import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dj")
public class class90 extends class118 {

    @OriginalMember(owner = "client!dj", name = "f", descriptor = "I")
    private int field1457;

    @OriginalMember(owner = "client!dj", name = "p", descriptor = "I")
    private int field1467;

    @OriginalMember(owner = "client!dj", name = "s", descriptor = "I")
    private int field1470;

    @OriginalMember(owner = "client!dj", name = "i", descriptor = "I")
    private int field1460;

    @OriginalMember(owner = "client!dj", name = "e", descriptor = "F")
    public static float field1456 = 0.0F;

    @OriginalMember(owner = "client!dj", name = "m", descriptor = "Lqd;")
    public static class173 field1464 = new class173(5);

    @OriginalMember(owner = "client!dj", name = "r", descriptor = "Ljava/lang/String;")
    public static String field1469 = "Loaded interfaces";

    @OriginalMember(owner = "client!dj", name = "q", descriptor = "I")
    public static int field1468 = 0;

    @OriginalMember(owner = "client!dj", name = "t", descriptor = "Lqd;")
    public static class173 field1471 = new class173(50);

    @OriginalMember(owner = "client!dj", name = "g", descriptor = "I")
    public static int field1458;

    @OriginalMember(owner = "client!dj", name = "h", descriptor = "I")
    public static int field1459;

    @OriginalMember(owner = "client!dj", name = "j", descriptor = "I")
    public static int field1461;

    @OriginalMember(owner = "client!dj", name = "k", descriptor = "I")
    public static int field1462;

    @OriginalMember(owner = "client!dj", name = "l", descriptor = "I")
    public static int field1463;

    @OriginalMember(owner = "client!dj", name = "n", descriptor = "I")
    public static int field1465;

    @OriginalMember(owner = "client!dj", name = "o", descriptor = "I")
    public static int field1466;

    @OriginalMember(owner = "client!dj", name = "u", descriptor = "Lfd;")
    public static class63 field1472;

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(I)V")
    public static final void method610(int arg0) {
        int var1 = -127 % ((arg0 - 50) / 53);
        ++field1459;
        if (class34.field516 != null) {
            class177 var2 = class34.field516;
            synchronized (class34.field516) {
                class34.field516 = null;
            }
        }
    }

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "(I)V")
    public static final void method611(int arg0) {
        ++field1465;
        if (!class129.method918(false) && class56.field941 != class287.field4606) {
            class100.method685(class19.field226, class48.field801, false, false, class56.field941, class239.field3829.field709[0], class239.field3829.field704[0], false);
        } else if (arg0 > 2) {
            class115.method817((byte) 66);
            if (class56.field941 != class129.field2026) {
                class287.method1914(true);
            }
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(ILag;)Z")
    public static final boolean method612(int arg0, class211 arg1) {
        ++field1466;
        if (arg0 != 646599820) {
            method612(-75, (class211) null);
        }
        if (arg1.field3340 == null) {
            return false;
        } else {
            for (int var2 = 0; var2 < arg1.field3340.length; ++var2) {
                int var3 = class141.method994(var2, arg1, (byte) 32);
                int var4 = arg1.field3462[var2];
                if (arg1.field3340[var2] == 2) {
                    if (~var4 >= ~var3) {
                        return false;
                    }
                } else if (arg1.field3340[var2] == 3) {
                    if (~var3 >= ~var4) {
                        return false;
                    }
                } else if (~arg1.field3340[var2] != -5) {
                    if (var3 != var4) {
                        return false;
                    }
                } else if (~var3 == ~var4) {
                    return false;
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "(III)V")
    public final void method2(int arg0, int arg1, int arg2) {
        int var4 = this.field1457 * arg0 >> 12;
        ++field1463;
        int var5 = this.field1460 * arg1 >> 12;
        int var6 = this.field1467 * arg0 >> 12;
        int var7 = this.field1470 * arg1 >> 12;
        class55.method380(super.field1900, 100, var4, var5, var6, var7);
        if (arg2 != -6211) {
            this.field1467 = 40;
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(III)V")
    public final void method1(int arg0, int arg1, int arg2) {
        int var4 = this.field1457 * arg0 >> 12;
        int var5 = this.field1467 * arg0 >> 12;
        ++field1462;
        if (arg1 >= -40) {
            this.field1470 = 10;
        }
        int var6 = this.field1470 * arg2 >> 12;
        int var7 = this.field1460 * arg2 >> 12;
        class19.method98(var4, super.field1898, super.field1899, var6, var5, super.field1900, var7, 2);
    }

    @OriginalMember(owner = "client!dj", name = "c", descriptor = "(I)V")
    public static void method613(int arg0) {
        field1464 = null;
        field1472 = null;
        field1471 = null;
        field1469 = null;
        int var1 = 66 % ((arg0 - -29) / 49);
    }

    @OriginalMember(owner = "client!dj", name = "<init>", descriptor = "(IIIIIII)V")
    public class90(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field1457 = arg0;
        this.field1467 = arg2;
        this.field1470 = arg3;
        this.field1460 = arg1;
    }

    @OriginalMember(owner = "client!dj", name = "d", descriptor = "(III)V")
    public final void method4(int arg0, int arg1, int arg2) {
        ++field1458;
        int var4 = this.field1460 * arg1 >> 12;
        int var5 = this.field1467 * arg2 >> 12;
        int var6 = this.field1457 * arg2 >> 12;
        int var7 = this.field1470 * arg1 >> 12;
        class18.method89(var6, var4, var5, super.field1899, super.field1898, var7, true);
        if (arg0 != 1207757217) {
            method610(65);
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(JJ)J")
    public static long method614(long arg0, long arg1) {
        return arg0 | arg1;
    }
}
