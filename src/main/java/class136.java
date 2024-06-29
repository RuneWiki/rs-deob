import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public class class136 {

    @OriginalMember(owner = "client!oe", name = "c", descriptor = "I")
    public static int field1810 = -1;

    @OriginalMember(owner = "client!oe", name = "k", descriptor = "Z")
    public static boolean field1818 = false;

    @OriginalMember(owner = "client!oe", name = "l", descriptor = "[I")
    public static int[] field1819 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

    @OriginalMember(owner = "client!oe", name = "h", descriptor = "Lni;")
    public static class367 field1815 = new class367(63, -1);

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "I")
    public static int field1808;

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "I")
    public static int field1809;

    @OriginalMember(owner = "client!oe", name = "d", descriptor = "I")
    public int field1811;

    @OriginalMember(owner = "client!oe", name = "e", descriptor = "I")
    public static int field1812;

    @OriginalMember(owner = "client!oe", name = "f", descriptor = "I")
    public int field1813;

    @OriginalMember(owner = "client!oe", name = "g", descriptor = "I")
    public static int field1814;

    @OriginalMember(owner = "client!oe", name = "i", descriptor = "I")
    public static int field1816;

    @OriginalMember(owner = "client!oe", name = "m", descriptor = "I")
    public static int field1820;

    @OriginalMember(owner = "client!oe", name = "n", descriptor = "I")
    private int field1821;

    @OriginalMember(owner = "client!oe", name = "j", descriptor = "Lhg;")
    public class496 field1817;

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(ILnj;)V")
    public static final void method915(int arg0, class164 arg1) {
        if (arg0 != -10970) {
            method917(-98, -119, null, -94);
        }
        field1816++;
        byte[] var2 = new byte[24];
        if (class88.field1269 != null) {
            try {
                class88.field1269.method1159(arg0 ^ 0xFFFFD55D, 0L);
                class88.field1269.method1157(arg0 + 774085410, var2);
                int var3;
                for (var3 = 0; var3 < 24 && var2[var3] == 0; var3++) {
                }
                if (var3 >= 24) {
                    throw new IOException();
                }
            } catch (Exception var5) {
                for (int var4 = 0; var4 < 24; var4++) {
                    var2[var4] = -1;
                }
            }
        }
        arg1.method1089(0, var2, -4516, 24);
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(Lnj;IB)V")
    private final void method916(class164 arg0, int arg1, byte arg2) {
        if (arg1 == 1) {
            this.field1821 = arg0.method1074(-635989152);
        } else if (arg1 == 2) {
            this.field1811 = arg0.method1087(false);
            this.field1813 = arg0.method1087(false);
        }
        field1808++;
        if (arg2 > -86) {
            method918((byte) -82);
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(IILga;I)V")
    public static final void method917(int arg0, int arg1, class282 arg2, int arg3) {
        field1814++;
        if (arg2 == null) {
            return;
        }
        if (arg2.field3996 != null) {
            class143 var4 = new class143();
            var4.field1903 = arg2;
            var4.field1912 = arg2.field3996;
            class343.method2227(var4);
        }
        if (arg0 >= -77) {
            method917(-127, -75, null, -94);
        }
        class48.field691 = arg2.field4045;
        class364.field5591 = arg3;
        class44.field641 = true;
        class361.field5539 = arg2.field4012;
        class63.field894 = arg2.field4029;
        class497.field7333 = arg2.field4031;
        class449.field6752 = arg2.field4002;
        class144.field1922 = arg1;
        class206.method1385(2, arg2);
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(B)V")
    public static void method918(byte arg0) {
        field1815 = null;
        int var1 = 110 / ((30 - arg0) / 37);
        field1819 = null;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(I)Lmn;")
    public final synchronized class252 method919(int arg0) {
        field1809++;
        class252 var2 = (class252) this.field1817.field7319.method2133((long) this.field1821, (byte) 126);
        if (var2 != null) {
            return var2;
        }
        class252 var3 = class252.method1630(this.field1817.field7308, this.field1821, arg0);
        if (var3 != null) {
            this.field1817.field7319.method2131(var3, (long) this.field1821, false);
        }
        return var3;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(Lnj;I)V")
    public final void method920(class164 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method1087(false);
            if (var3 == 0) {
                if (arg1 <= 24) {
                    field1815 = null;
                }
                field1812++;
                return;
            }
            this.method916(arg0, var3, (byte) -116);
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(BIII)I")
    public static final int method921(byte arg0, int arg1, int arg2, int arg3) {
        field1820++;
        if ((class178.field2382[arg3][arg1][arg2] & 0x8) != 0) {
            return 0;
        } else if (arg0 > -36) {
            return -126;
        } else if (arg3 <= 0 || (class178.field2382[1][arg1][arg2] & 0x2) == 0) {
            return arg3;
        } else {
            return arg3 - 1;
        }
    }
}
