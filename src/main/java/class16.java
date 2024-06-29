import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nq")
public class class16 extends class194 implements class523 {

    @OriginalMember(owner = "client!nq", name = "H", descriptor = "Z")
    private boolean field161 = false;

    @OriginalMember(owner = "client!nq", name = "P", descriptor = "Lpw;")
    public class101 field168;

    @OriginalMember(owner = "client!nq", name = "W", descriptor = "Z")
    private boolean field175;

    @OriginalMember(owner = "client!nq", name = "E", descriptor = "Ltm;")
    public static class334 field158 = new class334(44, 7);

    @OriginalMember(owner = "client!nq", name = "D", descriptor = "I")
    public static int field157;

    @OriginalMember(owner = "client!nq", name = "F", descriptor = "I")
    public static int field159;

    @OriginalMember(owner = "client!nq", name = "J", descriptor = "I")
    public static int field162;

    @OriginalMember(owner = "client!nq", name = "K", descriptor = "I")
    public static int field163;

    @OriginalMember(owner = "client!nq", name = "L", descriptor = "I")
    public static int field164;

    @OriginalMember(owner = "client!nq", name = "M", descriptor = "I")
    public static int field165;

    @OriginalMember(owner = "client!nq", name = "N", descriptor = "I")
    public static int field166;

    @OriginalMember(owner = "client!nq", name = "O", descriptor = "I")
    public static int field167;

    @OriginalMember(owner = "client!nq", name = "Q", descriptor = "I")
    public static int field169;

    @OriginalMember(owner = "client!nq", name = "R", descriptor = "I")
    public static int field170;

    @OriginalMember(owner = "client!nq", name = "S", descriptor = "I")
    public static int field171;

    @OriginalMember(owner = "client!nq", name = "T", descriptor = "I")
    public static int field172;

    @OriginalMember(owner = "client!nq", name = "U", descriptor = "I")
    public static int field173;

    @OriginalMember(owner = "client!nq", name = "V", descriptor = "I")
    public static int field174;

    @OriginalMember(owner = "client!nq", name = "X", descriptor = "I")
    public static int field176;

    @OriginalMember(owner = "client!nq", name = "Y", descriptor = "I")
    public static int field177;

    @OriginalMember(owner = "client!nq", name = "Z", descriptor = "I")
    public static int field178;

    @OriginalMember(owner = "client!nq", name = "ab", descriptor = "I")
    public static int field179;

    @OriginalMember(owner = "client!nq", name = "bb", descriptor = "I")
    public static int field180;

    @OriginalMember(owner = "client!nq", name = "cb", descriptor = "I")
    public static int field181;

    @OriginalMember(owner = "client!nq", name = "G", descriptor = "Lkn;")
    private class516 field160;

    @OriginalMember(owner = "client!nq", name = "e", descriptor = "(B)V")
    public static void method84(byte arg0) {
        if (arg0 == 90) {
            field158 = null;
        }
    }

    @OriginalMember(owner = "client!nq", name = "b", descriptor = "(B)I")
    public final int method85(byte arg0) {
        if (arg0 != -72) {
            this.field175 = false;
        }
        ++field165;
        return this.field168.field1520;
    }

    @OriginalMember(owner = "client!nq", name = "i", descriptor = "(I)Z")
    public final boolean method86(int arg0) {
        ++field177;
        return arg0 != 0 ? true : this.field161;
    }

    @OriginalMember(owner = "client!nq", name = "b", descriptor = "(I)I")
    public final int method87(int arg0) {
        if (arg0 != 2836) {
            method84((byte) 22);
        }
        ++field171;
        return this.field168.field1500;
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(B)Z")
    public final boolean method88(byte arg0) {
        if (arg0 <= 44) {
            this.method99(-88);
        }
        ++field170;
        return this.field168.method827((byte) -74);
    }

    @OriginalMember(owner = "client!nq", name = "j", descriptor = "(I)I")
    public final int method89(int arg0) {
        int var2 = 26 % ((arg0 - 17) / 61);
        ++field162;
        return this.field168.method828(true);
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(ZIIII)Z")
    public static final boolean method90(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field167;
        if (class432.field6336 && class199.field3402) {
            if (class699.field9884 < 100) {
                return false;
            } else if (!class429.method2671(arg2, (byte) -118, arg1, arg3)) {
                return false;
            } else {
                int var5 = arg1 << class662.field9425;
                if (!arg0) {
                    return true;
                } else {
                    int var6 = arg3 << class662.field9425;
                    if (class52.method502(class382.field5732, var6, -69, class211.field3511[arg2].method2160(-81, arg3, arg1), class382.field5732, var5, arg4)) {
                        ++class200.field3412;
                        return true;
                    } else {
                        return false;
                    }
                }
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(Lha;Z)V")
    public final void method91(class544 arg0, boolean arg1) {
        ++field179;
        this.field168.method830(0, arg0);
        if (!arg1) {
            this.field175 = false;
        }
    }

    @OriginalMember(owner = "client!nq", name = "g", descriptor = "(I)Z")
    public final boolean method92(int arg0) {
        ++field163;
        if (arg0 != 2) {
            method84((byte) -77);
        }
        return false;
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(Lha;I)Lkn;")
    public final class516 method93(class544 arg0, int arg1) {
        if (arg1 != 1) {
            this.method100((byte) 43);
        }
        ++field178;
        return this.field160;
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(IILha;I)Z")
    public final boolean method94(int arg0, int arg1, class544 arg2, int arg3) {
        ++field159;
        class282 var5 = this.field168.method829(false, false, -1, arg2, 131072);
        if (var5 == null) {
            return false;
        } else {
            class73 var6 = arg2.method343();
            var6.method675(super.field9477, super.field9474, super.field9475);
            int var7 = -39 / ((-80 - arg3) / 44);
            return class141.field2211 ? var5.method1023(arg0, arg1, var6, false, 0, class106.field1553) : var5.method1010(arg0, arg1, var6, false, 0);
        }
    }

    @OriginalMember(owner = "client!nq", name = "k", descriptor = "(I)Z")
    public final boolean method95(int arg0) {
        if (arg0 != 0) {
            method101(-41, (String) null);
        }
        ++field166;
        return false;
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(BLha;)V")
    public final void method96(byte arg0, class544 arg1) {
        ++field173;
        this.field168.method836(-85, arg1);
        if (arg0 != 89) {
            this.method92(57);
        }
    }

    @OriginalMember(owner = "client!nq", name = "b", descriptor = "(Lha;I)V")
    public final void method97(class544 arg0, int arg1) {
        ++field172;
        class282 var3 = this.field168.method829(true, true, arg1, arg0, 262144);
        if (var3 != null) {
            int var4 = super.field9477 >> 9;
            int var5 = super.field9475 >> 9;
            class73 var6 = arg0.method343();
            var6.method675(super.field9477, super.field9474, super.field9475);
            this.field168.method825(var5, arg0, var5, arg1 ^ 84, var6, var3, false, var4, var4);
        }
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(I)I")
    public final int method98(int arg0) {
        ++field157;
        if (arg0 != -12194) {
            this.method103(-34, (class544) null);
        }
        return this.field168.field1521;
    }

    @OriginalMember(owner = "client!nq", name = "<init>", descriptor = "(Lha;Ljl;IIIIIZIII)V")
    public class16(class544 arg0, class595 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10) {
        super(arg4, arg5, arg6, arg2, arg3, class463.method2836(arg9, false, arg8));
        this.field168 = new class101(arg0, arg1, arg8, arg9, super.field9470, arg3, this, arg7, arg10);
        this.field175 = arg1.field8426 != 0 && !arg7;
    }

    @OriginalMember(owner = "client!nq", name = "c", descriptor = "(I)V")
    public final void method99(int arg0) {
        if (arg0 != -17773) {
            this.method98(-10);
        }
        ++field180;
    }

    @OriginalMember(owner = "client!nq", name = "d", descriptor = "(B)I")
    public final int method100(byte arg0) {
        int var2 = -120 / ((arg0 - 21) / 56);
        ++field169;
        return this.field168.method833(-89);
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(ILjava/lang/String;)I")
    public static final int method101(int arg0, String arg1) {
        if (arg0 >= -22) {
            field158 = null;
        }
        ++field181;
        return 1 + arg1.length();
    }

    @OriginalMember(owner = "client!nq", name = "h", descriptor = "(I)V")
    public final void method102(int arg0) {
        ++field164;
        if (arg0 == 0) {
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!nq", name = "b", descriptor = "(ILha;)Lgh;")
    public final class48 method103(int arg0, class544 arg1) {
        ++field176;
        class282 var3 = this.field168.method829(false, true, -1, arg1, 2048);
        if (var3 == null) {
            return null;
        } else {
            class73 var4 = arg1.method343();
            var4.method675(super.field9477, super.field9474, super.field9475);
            class48 var5 = class331.method2130(1, (byte) 92, this.field175);
            if (arg0 != 0) {
                field158 = null;
            }
            int var6 = super.field9477 >> 9;
            int var7 = super.field9475 >> 9;
            this.field168.method825(var7, arg1, var7, -106, var4, var3, true, var6, var6);
            if (!class141.field2211) {
                var3.method1007(var4, var5.field795[0], 0);
            } else {
                var3.method1026(var4, var5.field795[0], class106.field1553, 0);
            }
            if (this.field168.field1498 != null) {
                class315 var8 = this.field168.field1498.method3556();
                if (!class141.field2211) {
                    arg1.method420(var8);
                } else {
                    arg1.method380(var8, class106.field1553);
                }
            }
            this.field161 = var3.method1048() || this.field168.field1498 != null;
            if (this.field160 == null) {
                this.field160 = class100.method819(8, var3, super.field9474, super.field9475, super.field9477);
            } else {
                class736.method4109(var3, -8631, super.field9475, this.field160, super.field9477, super.field9474);
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(ZILha;Lov;IIZ)V")
    public final void method104(boolean arg0, int arg1, class544 arg2, class668 arg3, int arg4, int arg5, boolean arg6) {
        ++field174;
        if (arg0) {
            this.field168 = null;
        }
        throw new IllegalStateException();
    }
}
