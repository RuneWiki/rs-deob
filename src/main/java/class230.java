import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gd")
public class class230 extends class409 {

    @OriginalMember(owner = "client!gd", name = "l", descriptor = "[Ljava/lang/String;")
    public static String[] field3448 = new String[5];

    @OriginalMember(owner = "client!gd", name = "h", descriptor = "I")
    public int field3444;

    @OriginalMember(owner = "client!gd", name = "i", descriptor = "I")
    public static int field3445;

    @OriginalMember(owner = "client!gd", name = "j", descriptor = "I")
    public int field3446;

    @OriginalMember(owner = "client!gd", name = "k", descriptor = "I")
    public int field3447;

    @OriginalMember(owner = "client!gd", name = "m", descriptor = "I")
    public static int field3449;

    @OriginalMember(owner = "client!gd", name = "n", descriptor = "I")
    public static int field3450;

    @OriginalMember(owner = "client!gd", name = "p", descriptor = "I")
    public static int field3452;

    @OriginalMember(owner = "client!gd", name = "q", descriptor = "I")
    public static int field3453;

    @OriginalMember(owner = "client!gd", name = "r", descriptor = "I")
    public int field3454;

    @OriginalMember(owner = "client!gd", name = "s", descriptor = "I")
    public static int field3455;

    @OriginalMember(owner = "client!gd", name = "t", descriptor = "I")
    public static int field3456;

    @OriginalMember(owner = "client!gd", name = "u", descriptor = "I")
    public int field3457;

    @OriginalMember(owner = "client!gd", name = "v", descriptor = "I")
    public int field3458;

    @OriginalMember(owner = "client!gd", name = "w", descriptor = "I")
    public static int field3459;

    @OriginalMember(owner = "client!gd", name = "g", descriptor = "Ljava/awt/Frame;")
    public static Frame field3443;

    @OriginalMember(owner = "client!gd", name = "o", descriptor = "Ljava/lang/String;")
    public String field3451;

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "(I)V", line = 9)
    public static final void method1533(int arg0) {
        for (int var1 = 0; var1 < class477.field6952; var1++) {
            int var2 = class483.field7012[var1];
            class193 var3 = (class193) class390.field5539.method2284(true, (long) var2);
            if (var3 != null) {
                class279 var4 = var3.field2805;
                class26.method160(36, var4, var4.field4157.field4620);
            }
        }
        field3452++;
        if (arg0 != -11716) {
            field3448 = null;
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(ZLwo;)Z", line = 40)
    public static final boolean method1534(boolean arg0, class534 arg1) {
        field3453++;
        class261 var2 = class277.field4139.method569((byte) 108, arg1.method561((byte) -85));
        if (arg0) {
            method1540(-45);
        }
        if (var2.field3879 == -1) {
            return true;
        } else {
            class368 var3 = class389.field5528.method2881(var2.field3879, (byte) -52);
            return var3.field5314 == -1 ? true : var3.method2252(-3984);
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(IILqa;I)V", line = 65)
    public static final void method1535(int arg0, int arg1, class167 arg2, int arg3) {
        field3450++;
        class157.field2402 = arg2;
        class57.field1019 = new class414[arg1][arg3];
        if (class338.field5010 != null) {
            class287.field4257 = class181.method1255(class338.field5010[5], class338.field5010[3], -1198, class338.field5010[1], class338.field5010[4], class338.field5010[2], class338.field5010[0]);
        }
        class56.field1011 = new class414();
        class384.method2339(0);
        if (arg0 != 2) {
            field3448 = null;
        }
    }

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "(I)V", line = 87)
    public static void method1536(int arg0) {
        field3448 = null;
        field3443 = null;
        if (arg0 != 0) {
            field3443 = null;
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(Ljava/lang/String;Lci;IZ)Lop;", line = 99)
    public static final class128 method1537(String arg0, class320 arg1, int arg2, boolean arg3) {
        field3459++;
        int var4 = arg1.method2043((byte) 110, arg0);
        if (var4 == -1) {
            return new class128(0);
        }
        int[] var5 = arg1.method2022((byte) 121, var4);
        if (arg2 < 69) {
            field3443 = null;
        }
        class128 var6 = new class128(var5.length);
        int var7 = 0;
        int var8 = 0;
        while (true) {
            while (var7 < var6.field1994) {
                class519 var9 = new class519(arg1.method2037(var5[var8++], (byte) 126, var4));
                int var10 = var9.method3053(-129);
                int var11 = var9.method3018(566990904);
                int var12 = var9.method3072((byte) -120);
                if (!arg3 && var12 == 1) {
                    var6.field1994--;
                } else {
                    var6.field1995[var7] = var10;
                    var6.field1993[var7] = var11;
                    var7++;
                }
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(B)Lbr;", line = 147)
    public static final class275 method1538(byte arg0) {
        field3455++;
        class275 var1 = (class275) class392.field5573.method102(1048575);
        if (var1 != null) {
            var1.method421(22071);
            var1.method3115((byte) 103);
            return var1;
        }
        if (arg0 > -4) {
            field3448 = null;
        }
        class275 var2;
        do {
            var2 = (class275) class450.field6574.method102(1048575);
            if (var2 == null) {
                return null;
            }
            if (var2.method1777(-70) > class165.method1188((byte) 26)) {
                return null;
            }
            var2.method421(22071);
            var2.method3115((byte) 103);
        } while ((var2.field7659 & Long.MIN_VALUE) == 0L);
        return var2;
    }

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "(II)V", line = 187)
    public static final void method1539(int arg0, int arg1) {
        field3445++;
        class511 var2 = class190.field2779;
        synchronized (class190.field2779) {
            class190.field2779.method2989(false, arg1);
        }
        class511 var3 = class502.field7245;
        synchronized (class502.field7245) {
            class502.field7245.method2989(false, arg1);
        }
        if (arg0 != 0) {
            field3448 = null;
        }
    }

    @OriginalMember(owner = "client!gd", name = "d", descriptor = "(I)V", line = 203)
    public static final void method1540(int arg0) {
        field3456++;
        if (class37.field799 == 6) {
            class391.method2358(false, arg0 - 473);
        } else if (arg0 == 513) {
            class405.field5763 = class410.field5802;
            class410.field5802 = null;
            class170.method1206(1, 12);
        }
    }
}
