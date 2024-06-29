import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mg")
public class class130 {

    @OriginalMember(owner = "client!mg", name = "j", descriptor = "I")
    public int field1627;

    @OriginalMember(owner = "client!mg", name = "c", descriptor = "I")
    public int field1620;

    @OriginalMember(owner = "client!mg", name = "e", descriptor = "S")
    public short field1622;

    @OriginalMember(owner = "client!mg", name = "m", descriptor = "I")
    public int field1630;

    @OriginalMember(owner = "client!mg", name = "q", descriptor = "S")
    public short field1634;

    @OriginalMember(owner = "client!mg", name = "l", descriptor = "I")
    public int field1629;

    @OriginalMember(owner = "client!mg", name = "n", descriptor = "S")
    public short field1631;

    @OriginalMember(owner = "client!mg", name = "g", descriptor = "Z")
    public boolean field1624;

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "B")
    public byte field1618;

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "I")
    public int field1619;

    @OriginalMember(owner = "client!mg", name = "d", descriptor = "I")
    public static int field1621;

    @OriginalMember(owner = "client!mg", name = "f", descriptor = "I")
    public static int field1623;

    @OriginalMember(owner = "client!mg", name = "h", descriptor = "I")
    public static int field1625;

    @OriginalMember(owner = "client!mg", name = "k", descriptor = "I")
    public static int field1628;

    @OriginalMember(owner = "client!mg", name = "o", descriptor = "I")
    public static int field1632;

    @OriginalMember(owner = "client!mg", name = "p", descriptor = "I")
    public static int field1633;

    @OriginalMember(owner = "client!mg", name = "i", descriptor = "Led;")
    public static class613 field1626;

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(Ljava/awt/Component;IIZLtq;)Lmca;")
    public static final class28 method799(Component arg0, int arg1, int arg2, boolean arg3, class545 arg4) {
        field1632++;
        if (class292.field4050 == 0) {
            throw new IllegalStateException();
        } else if (arg2 >= 0 && arg2 < 2) {
            if (arg1 < 256) {
                arg1 = 256;
            }
            try {
                class28 var5 = (class28) Class.forName("to").getDeclaredConstructor().newInstance();
                var5.field304 = new int[(class325.field4696 ? 2 : 1) * 256];
                var5.field318 = arg1;
                if (arg3) {
                    return null;
                }
                var5.method42(arg0);
                var5.field319 = (arg1 & 0xFFFFFC00) + 1024;
                if (var5.field319 > 16384) {
                    var5.field319 = 16384;
                }
                var5.method41(var5.field319);
                if (class377.field5732 > 0 && class248.field3524 == null) {
                    class248.field3524 = new class174();
                    class248.field3524.field2131 = arg4;
                    arg4.method3177(class377.field5732, -128, class248.field3524);
                }
                if (class248.field3524 != null) {
                    if (class248.field3524.field2132[arg2] != null) {
                        throw new IllegalArgumentException();
                    }
                    class248.field3524.field2132[arg2] = var5;
                }
                return var5;
            } catch (Throwable var8) {
                try {
                    class265 var6 = new class265(arg4, arg2);
                    var6.field318 = arg1;
                    var6.field304 = new int[(class325.field4696 ? 2 : 1) * 256];
                    var6.method42(arg0);
                    var6.field319 = 16384;
                    var6.method41(var6.field319);
                    if (class377.field5732 > 0 && class248.field3524 == null) {
                        class248.field3524 = new class174();
                        class248.field3524.field2131 = arg4;
                        arg4.method3177(class377.field5732, -126, class248.field3524);
                    }
                    if (class248.field3524 != null) {
                        if (class248.field3524.field2132[arg2] != null) {
                            throw new IllegalArgumentException();
                        }
                        class248.field3524.field2132[arg2] = var6;
                    }
                    return var6;
                } catch (Throwable var7) {
                    return new class28();
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(I)V")
    public static void method800(int arg0) {
        if (arg0 != 26826) {
            method802(null, false);
        }
        field1626 = null;
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(Ltt;B)V")
    public static final void method801(class78 arg0, byte arg1) {
        field1633++;
        if (arg1 != -76) {
            method801(null, (byte) 47);
        }
        for (class588 var2 = (class588) class407.field6140.method719(false); var2 != null; var2 = (class588) class407.field6140.method716(14)) {
            if (var2.field8440 == arg0) {
                if (var2.field8455 != null) {
                    class44.field469.method934(var2.field8455);
                    var2.field8455 = null;
                }
                var2.method2108(true);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(Ljava/lang/String;Z)J")
    public static final long method802(String arg0, boolean arg1) {
        field1628++;
        int var2 = arg0.length();
        if (arg1) {
            return -12L;
        }
        long var3 = 0L;
        for (int var5 = 0; var5 < var2; var5++) {
            var3 = (var3 << 5) + (long) arg0.charAt(var5) - var3;
        }
        return var3;
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(BZ)V")
    public static final void method803(byte arg0, boolean arg1) {
        field1621++;
        if (arg1) {
            if (class518.field7542 != -1) {
                class200.method1271(class518.field7542, arg0 ^ 0x14);
            }
            for (class563 var2 = (class563) class234.field3309.method523(-127); var2 != null; var2 = (class563) class234.field3309.method530(12714)) {
                if (!var2.method2109(11574)) {
                    var2 = (class563) class234.field3309.method523(-114);
                    if (var2 == null) {
                        break;
                    }
                }
                class292.method1885(false, true, (byte) -72, var2);
            }
            class518.field7542 = -1;
            class234.field3309 = new class80(8);
            class613.method3543((byte) -23);
            class518.field7542 = class256.field3659;
            class599.method3480(arg0 ^ 0x17, false);
            class410.method2598(101);
            class604.method3508(class518.field7542);
        }
        if (arg0 != -100) {
            field1626 = null;
        }
        class242.field3435 = true;
    }

    @OriginalMember(owner = "client!mg", name = "<init>", descriptor = "(IIIIIIIIIZZI)V")
    public class130(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, boolean arg10, int arg11) {
        this.field1627 = arg3;
        this.field1620 = arg1;
        this.field1622 = (short) arg4;
        this.field1630 = arg11;
        this.field1634 = (short) arg5;
        this.field1629 = arg2;
        this.field1631 = (short) arg6;
        this.field1624 = arg10;
        this.field1618 = (byte) arg8;
        this.field1619 = arg0;
    }
}
