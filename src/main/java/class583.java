import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!at")
public class class583 extends class363 implements class599 {

    @OriginalMember(owner = "client!at", name = "V", descriptor = "Z")
    private boolean field7973;

    @OriginalMember(owner = "client!at", name = "jb", descriptor = "B")
    private byte field7987;

    @OriginalMember(owner = "client!at", name = "Z", descriptor = "S")
    private short field7977;

    @OriginalMember(owner = "client!at", name = "bb", descriptor = "Z")
    private boolean field7979;

    @OriginalMember(owner = "client!at", name = "P", descriptor = "B")
    private byte field7967;

    @OriginalMember(owner = "client!at", name = "ib", descriptor = "Z")
    private boolean field7986;

    @OriginalMember(owner = "client!at", name = "rb", descriptor = "Lda;")
    private class470 field7995;

    @OriginalMember(owner = "client!at", name = "cb", descriptor = "Lha;")
    private class117 field7980;

    @OriginalMember(owner = "client!at", name = "eb", descriptor = "Ldn;")
    public static class276 field7982 = new class276();

    @OriginalMember(owner = "client!at", name = "O", descriptor = "I")
    public static int field7966;

    @OriginalMember(owner = "client!at", name = "Q", descriptor = "I")
    public static int field7968;

    @OriginalMember(owner = "client!at", name = "R", descriptor = "I")
    public static int field7969;

    @OriginalMember(owner = "client!at", name = "S", descriptor = "I")
    public static int field7970;

    @OriginalMember(owner = "client!at", name = "T", descriptor = "I")
    public static int field7971;

    @OriginalMember(owner = "client!at", name = "U", descriptor = "I")
    public static int field7972;

    @OriginalMember(owner = "client!at", name = "W", descriptor = "I")
    public static int field7974;

    @OriginalMember(owner = "client!at", name = "X", descriptor = "I")
    public static int field7975;

    @OriginalMember(owner = "client!at", name = "Y", descriptor = "I")
    public static int field7976;

    @OriginalMember(owner = "client!at", name = "ab", descriptor = "I")
    public static int field7978;

    @OriginalMember(owner = "client!at", name = "db", descriptor = "I")
    public static int field7981;

    @OriginalMember(owner = "client!at", name = "fb", descriptor = "I")
    public static int field7983;

    @OriginalMember(owner = "client!at", name = "gb", descriptor = "I")
    public static int field7984;

    @OriginalMember(owner = "client!at", name = "kb", descriptor = "I")
    public static int field7988;

    @OriginalMember(owner = "client!at", name = "lb", descriptor = "I")
    public static int field7989;

    @OriginalMember(owner = "client!at", name = "mb", descriptor = "I")
    public static int field7990;

    @OriginalMember(owner = "client!at", name = "nb", descriptor = "I")
    public static int field7991;

    @OriginalMember(owner = "client!at", name = "ob", descriptor = "I")
    public static int field7992;

    @OriginalMember(owner = "client!at", name = "pb", descriptor = "I")
    public static int field7993;

    @OriginalMember(owner = "client!at", name = "qb", descriptor = "I")
    public static int field7994;

    @OriginalMember(owner = "client!at", name = "hb", descriptor = "Lcu;")
    private class475 field7985;

    @OriginalMember(owner = "client!at", name = "sb", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field7996;

    @OriginalMember(owner = "client!at", name = "d", descriptor = "(B)I", line = 4)
    public final int method176(byte arg0) {
        ++field7974;
        if (arg0 >= -114) {
            return -91;
        } else {
            return this.field7995 == null ? 0 : this.field7995.method613();
        }
    }

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(B)I", line = 16)
    public final int method710(byte arg0) {
        ++field7975;
        if (arg0 <= 55) {
            this.method699((byte) -55);
        }
        return 65535 & this.field7977;
    }

    @OriginalMember(owner = "client!at", name = "j", descriptor = "(I)Z", line = 29)
    public final boolean method168(int arg0) {
        ++field7981;
        if (arg0 != 20071) {
            this.method3220((class562) null, 114, (byte) 2);
        }
        return this.field7995 == null ? false : this.field7995.method657();
    }

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(BLr;ZI)Lht;", line = 49)
    private final class606 method3215(byte arg0, class562 arg1, boolean arg2, int arg3) {
        ++field7989;
        class600 var5 = class118.field1510.method3921(65535 & this.field7977, -95);
        if (arg0 <= 70) {
            this.field7995 = null;
        }
        class270 var6;
        class270 var7;
        if (!this.field7979) {
            if (~super.field386 <= -4) {
                var6 = null;
            } else {
                var6 = class454.field5981[super.field386 + 1];
            }
            var7 = class454.field5981[super.field386];
        } else {
            var6 = class454.field5981[0];
            var7 = class446.field5914[super.field386];
        }
        return var5.method3321(super.field388, this.field7967, arg2, arg1, super.field397, false, super.field398, arg3, this.field7987, var6, var7);
    }

    @OriginalMember(owner = "client!at", name = "l", descriptor = "(I)I", line = 81)
    public final int method173(int arg0) {
        ++field7988;
        if (arg0 != 0) {
            return -100;
        } else {
            return this.field7995 == null ? 0 : this.field7995.method621();
        }
    }

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(IBI)Z", line = 94)
    public static final boolean method3216(int arg0, byte arg1, int arg2) {
        if (arg1 != 109) {
            return false;
        } else {
            ++field7972;
            return (33 & arg0) != 0;
        }
    }

    @OriginalMember(owner = "client!at", name = "e", descriptor = "(B)V", line = 107)
    public static void method3217(byte arg0) {
        field7982 = null;
        field7996 = null;
        if (arg0 != 13) {
            field7996 = null;
        }
    }

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(Lwv;BZ)V", line = 119)
    public static final void method3218(class423 arg0, byte arg1, boolean arg2) {
        ++field7968;
        int var3 = arg0.field5595 == 0 ? arg0.field5561 : arg0.field5595;
        int var4 = 89 / ((arg1 - -11) / 45);
        int var5 = arg0.field5603 != 0 ? arg0.field5603 : arg0.field5672;
        class427.method2416(0, arg2, arg0.field5685, var5, class124.field1729[arg0.field5685 >> 16], var3);
        if (arg0.field5647 != null) {
            class427.method2416(0, arg2, arg0.field5685, var5, arg0.field5647, var3);
        }
        class137 var6 = (class137) class152.field2079.method3057(1, (long) arg0.field5685);
        if (var6 != null) {
            class480.method2761(arg2, var6.field1870, (byte) -120, var3, var5);
        }
    }

    @OriginalMember(owner = "client!at", name = "<init>", descriptor = "(Lr;Ltc;IIIIIZIIII)V", line = 143)
    public class583(class562 arg0, class600 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11) {
        super(arg4, arg5, arg6, arg2, arg3, arg8, arg9);
        this.field7973 = arg1.field8293 != 0 && !arg7;
        this.field7987 = (byte) arg10;
        this.field7977 = (short) arg1.field8345;
        this.field7979 = arg7;
        this.field7967 = (byte) arg11;
        super.field397 = arg6;
        super.field398 = arg4;
        this.field7986 = arg0.method1084() && arg1.field8305 && !this.field7979 && ~class602.field8408.method1870((byte) -94, class618.field8566) != -1;
        class606 var13 = this.method3215((byte) 92, arg0, this.field7986, 2048);
        if (var13 != null) {
            this.field7995 = var13.field8448;
            this.field7980 = var13.field8446;
        }
    }

    @OriginalMember(owner = "client!at", name = "b", descriptor = "(B)I", line = 169)
    public final int method699(byte arg0) {
        if (arg0 >= -32) {
            method3217((byte) -14);
        }
        ++field7992;
        return this.field7987;
    }

    @OriginalMember(owner = "client!at", name = "c", descriptor = "(I)I", line = 180)
    public final int method706(int arg0) {
        if (arg0 != 16259) {
            this.field7980 = null;
        }
        ++field7983;
        return this.field7967;
    }

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(BLr;)Lqw;", line = 191)
    public final class329 method165(byte arg0, class562 arg1) {
        ++field7970;
        if (this.field7995 == null) {
            return null;
        } else {
            class487 var3 = arg1.method1153();
            var3.method359(super.field4796 + super.field398, super.field388, super.field4803 + super.field397);
            class329 var4 = null;
            if (arg0 < 109) {
                this.field7986 = false;
            }
            if (this.field7973) {
                var4 = class541.method3035(27479, 1);
            }
            if (class347.field4632) {
                this.field7995.method648(var3, var4 == null ? null : var4.field4414[0], class414.field5430, 0);
            } else {
                this.field7995.method625(var3, var4 != null ? var4.field4414[0] : null, 0);
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 222)
    public static final void method3219(String arg0, int arg1) {
        if (arg1 != 0) {
            method3217((byte) -23);
        }
        System.exit(1);
        ++field7969;
    }

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(Lr;I)V", line = 238)
    public final void method700(class562 arg0, int arg1) {
        ++field7978;
        Object var3 = null;
        if (arg1 != -21186) {
            this.method161(52);
        }
        class117 var5;
        if (this.field7980 == null && this.field7986) {
            class606 var4 = this.method3215((byte) 73, arg0, true, 262144);
            var5 = var4 != null ? var4.field8446 : null;
        } else {
            var5 = this.field7980;
            this.field7980 = null;
        }
        if (var5 != null) {
            class201.method1287(var5, super.field386, super.field398, super.field397, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!at", name = "f", descriptor = "(I)Z", line = 268)
    public final boolean method161(int arg0) {
        ++field7984;
        return arg0 == 28602;
    }

    @OriginalMember(owner = "client!at", name = "b", descriptor = "(I)Z", line = 279)
    public final boolean method705(int arg0) {
        ++field7991;
        if (arg0 <= 67) {
            this.field7995 = null;
        }
        return this.field7986;
    }

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(Lr;Z)V", line = 290)
    public final void method177(class562 arg0, boolean arg1) {
        if (!arg1) {
            field7996 = null;
        }
        ++field7976;
    }

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(ZLr;II)Z", line = 303)
    public final boolean method167(boolean arg0, class562 arg1, int arg2, int arg3) {
        ++field7994;
        if (arg0) {
            this.field7973 = false;
        }
        class470 var5 = this.method3220(arg1, 131072, (byte) 73);
        if (var5 != null) {
            class487 var6 = arg1.method1153();
            var6.method359(super.field398, super.field388, super.field397);
            return class347.field4632 ? var5.method603(arg3, arg2, var6, false, class414.field5430) : var5.method655(arg3, arg2, var6, false);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(I)V", line = 325)
    public final void method703(int arg0) {
        if (arg0 != 6956) {
            this.method700((class562) null, 23);
        }
        ++field7966;
        if (this.field7995 != null) {
            this.field7995.method634();
        }
    }

    @OriginalMember(owner = "client!at", name = "b", descriptor = "(Lr;I)Lcu;", line = 338)
    public final class475 method174(class562 arg0, int arg1) {
        if (arg1 != -14700) {
            method3218((class423) null, (byte) -48, false);
        }
        if (this.field7985 == null) {
            this.field7985 = class258.method1562(super.field398, (byte) -47, super.field397, this.method3220(arg0, 0, (byte) 73), super.field388);
        }
        ++field7990;
        return this.field7985;
    }

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(Lr;IB)Lda;", line = 358)
    private final class470 method3220(class562 arg0, int arg1, byte arg2) {
        ++field7971;
        if (this.field7995 != null && ~arg0.method1053(this.field7995.method604(), arg1) == -1) {
            return this.field7995;
        } else {
            class606 var4 = this.method3215((byte) 93, arg0, false, arg1);
            if (arg2 != 73) {
                this.field7995 = null;
            }
            return var4 != null ? var4.field8448 : null;
        }
    }

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(Lr;B)V", line = 379)
    public final void method707(class562 arg0, byte arg1) {
        ++field7993;
        Object var3 = null;
        class117 var5;
        if (this.field7980 == null && this.field7986) {
            class606 var4 = this.method3215((byte) 83, arg0, true, 262144);
            var5 = var4 != null ? var4.field8446 : null;
        } else {
            var5 = this.field7980;
            this.field7980 = null;
        }
        if (var5 != null) {
            class614.method3395(var5, super.field386, super.field398, super.field397, (boolean[]) null);
        }
        int var6 = -22 % ((-28 - arg1) / 54);
    }
}
