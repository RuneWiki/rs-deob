import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hd")
public class class270 {

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "Lqc;")
    private class325 field3991 = new class325(64);

    @OriginalMember(owner = "client!hd", name = "j", descriptor = "Lqc;")
    public class325 field3999 = new class325(64);

    @OriginalMember(owner = "client!hd", name = "i", descriptor = "Ldda;")
    public class597 field3998;

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "Ldda;")
    private class597 field3990;

    @OriginalMember(owner = "client!hd", name = "l", descriptor = "[S")
    public static short[] field4001 = new short[] { -4160, -4163, -8256, -8259, 22461 };

    @OriginalMember(owner = "client!hd", name = "g", descriptor = "Lqu;")
    public static class364 field3996 = new class364(69, 3);

    @OriginalMember(owner = "client!hd", name = "c", descriptor = "I")
    public static int field3992;

    @OriginalMember(owner = "client!hd", name = "d", descriptor = "I")
    public static int field3993;

    @OriginalMember(owner = "client!hd", name = "e", descriptor = "I")
    public static int field3994;

    @OriginalMember(owner = "client!hd", name = "f", descriptor = "I")
    public static int field3995;

    @OriginalMember(owner = "client!hd", name = "h", descriptor = "I")
    public static int field3997;

    @OriginalMember(owner = "client!hd", name = "k", descriptor = "I")
    public static int field4000;

    @OriginalMember(owner = "client!hd", name = "m", descriptor = "I")
    public static int field4002;

    @OriginalMember(owner = "client!hd", name = "n", descriptor = "I")
    public static int field4003;

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(Z)V", line = 3)
    public static void method1710(boolean arg0) {
        field3996 = null;
        field4001 = null;
        if (!arg0) {
            method1716(6, -100, (byte) -84);
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(BI)Lwk;", line = 14)
    public final class402 method1711(byte arg0, int arg1) {
        field3992++;
        class325 var3 = this.field3991;
        class402 var4;
        synchronized (this.field3991) {
            var4 = (class402) this.field3991.method2025((long) arg1, 2);
        }
        if (var4 != null) {
            return var4;
        }
        class597 var5 = this.field3990;
        byte[] var6;
        synchronized (this.field3990) {
            var6 = this.field3990.method3486((byte) -97, arg1, 34);
        }
        class402 var7 = new class402();
        var7.field5757 = this;
        if (arg0 != -96) {
            this.method1717(-103, 120);
        }
        if (var6 != null) {
            var7.method2409(arg0 + 96, new class428(var6));
        }
        class325 var8 = this.field3991;
        synchronized (this.field3991) {
            this.field3991.method2029(false, var7, (long) arg1);
            return var7;
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(I)V", line = 48)
    public final void method1712(int arg0) {
        field4002++;
        class325 var2 = this.field3991;
        synchronized (this.field3991) {
            this.field3991.method2037(true);
        }
        class325 var3 = this.field3999;
        synchronized (this.field3999) {
            if (arg0 == -17274) {
                this.field3999.method2037(true);
            }
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(JJ)J", line = 70)
    public static long method1713(long arg0, long arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(B)V", line = 81)
    public final void method1714(byte arg0) {
        field3997++;
        class325 var2 = this.field3991;
        synchronized (this.field3991) {
            this.field3991.method2024((byte) -124);
            if (arg0 != -43) {
                method1710(true);
            }
        }
        class325 var3 = this.field3999;
        synchronized (this.field3999) {
            this.field3999.method2024((byte) -123);
        }
    }

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "(B)Lts;", line = 97)
    public static final class53 method1715(byte arg0) {
        field3994++;
        if (arg0 != -14) {
            field4001 = null;
        }
        return class113.field1419;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(IIB)I", line = 109)
    public static final int method1716(int arg0, int arg1, byte arg2) {
        field3993++;
        if (arg2 != 77) {
            field4001 = null;
        }
        if (arg0 == -2) {
            return 12345678;
        } else if (arg0 == -1) {
            if (arg1 < 2) {
                arg1 = 2;
            } else if (arg1 > 126) {
                arg1 = 126;
            }
            return arg1;
        } else {
            int var3 = (arg0 & 0x7F) * arg1 >> 7;
            if (var3 < 2) {
                var3 = 2;
            } else if (var3 > 126) {
                var3 = 126;
            }
            return (arg0 & 0xFF80) + var3;
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(II)V", line = 145)
    public final void method1717(int arg0, int arg1) {
        class325 var3 = this.field3991;
        synchronized (this.field3991) {
            this.field3991.method2028(arg0, true);
        }
        if (arg1 > -12) {
            field3996 = null;
        }
        field3995++;
        class325 var4 = this.field3999;
        synchronized (this.field3999) {
            this.field3999.method2028(arg0, true);
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(III)V", line = 162)
    public final void method1718(int arg0, int arg1, int arg2) {
        if (arg2 != 126) {
            method1715((byte) 65);
        }
        this.field3991 = new class325(arg1);
        field4000++;
        this.field3999 = new class325(arg0);
    }

    @OriginalMember(owner = "client!hd", name = "<init>", descriptor = "(Loda;ILdda;Ldda;)V", line = 194)
    public class270(class559 arg0, int arg1, class597 arg2, class597 arg3) {
        this.field3998 = arg3;
        this.field3990 = arg2;
        this.field3990.method3462(34, -127);
    }
}
