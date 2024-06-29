import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dca")
public class class545 extends class713 implements class523 {

    @OriginalMember(owner = "client!dca", name = "S", descriptor = "Z")
    private boolean field7787 = false;

    @OriginalMember(owner = "client!dca", name = "hb", descriptor = "Lpw;")
    public class101 field7802;

    @OriginalMember(owner = "client!dca", name = "Z", descriptor = "Z")
    private boolean field7794;

    @OriginalMember(owner = "client!dca", name = "fb", descriptor = "F")
    public static float field7800 = 1.0F;

    @OriginalMember(owner = "client!dca", name = "J", descriptor = "I")
    public static int field7779;

    @OriginalMember(owner = "client!dca", name = "K", descriptor = "I")
    public static int field7780;

    @OriginalMember(owner = "client!dca", name = "L", descriptor = "I")
    public static int field7781;

    @OriginalMember(owner = "client!dca", name = "N", descriptor = "I")
    public static int field7782;

    @OriginalMember(owner = "client!dca", name = "O", descriptor = "I")
    public static int field7783;

    @OriginalMember(owner = "client!dca", name = "P", descriptor = "I")
    public static int field7784;

    @OriginalMember(owner = "client!dca", name = "Q", descriptor = "I")
    public static int field7785;

    @OriginalMember(owner = "client!dca", name = "R", descriptor = "I")
    public static int field7786;

    @OriginalMember(owner = "client!dca", name = "T", descriptor = "I")
    public static int field7788;

    @OriginalMember(owner = "client!dca", name = "U", descriptor = "I")
    public static int field7789;

    @OriginalMember(owner = "client!dca", name = "V", descriptor = "I")
    public static int field7790;

    @OriginalMember(owner = "client!dca", name = "W", descriptor = "I")
    public static int field7791;

    @OriginalMember(owner = "client!dca", name = "Y", descriptor = "I")
    public static int field7793;

    @OriginalMember(owner = "client!dca", name = "ab", descriptor = "I")
    public static int field7795;

    @OriginalMember(owner = "client!dca", name = "bb", descriptor = "I")
    public static int field7796;

    @OriginalMember(owner = "client!dca", name = "cb", descriptor = "I")
    public static int field7797;

    @OriginalMember(owner = "client!dca", name = "db", descriptor = "I")
    public static int field7798;

    @OriginalMember(owner = "client!dca", name = "eb", descriptor = "I")
    public static int field7799;

    @OriginalMember(owner = "client!dca", name = "gb", descriptor = "I")
    public static int field7801;

    @OriginalMember(owner = "client!dca", name = "ib", descriptor = "I")
    public static int field7803;

    @OriginalMember(owner = "client!dca", name = "jb", descriptor = "I")
    public static int field7804;

    @OriginalMember(owner = "client!dca", name = "kb", descriptor = "I")
    public static int field7805;

    @OriginalMember(owner = "client!dca", name = "X", descriptor = "Lkn;")
    private class516 field7792;

    @OriginalMember(owner = "client!dca", name = "b", descriptor = "(Lha;I)V", line = 8)
    public final void method97(class544 arg0, int arg1) {
        ++field7782;
        class282 var3 = this.field7802.method829(true, true, arg1, arg0, 262144);
        if (var3 != null) {
            int var4 = super.field9477 >> 9;
            int var5 = super.field9475 >> 9;
            class73 var6 = arg0.method343();
            var6.method675(super.field9477, super.field9474, super.field9475);
            this.field7802.method825(var5, arg0, var5, 112, var6, var3, false, var4, var4);
        }
    }

    @OriginalMember(owner = "client!dca", name = "c", descriptor = "(I)V", line = 30)
    public final void method99(int arg0) {
        if (arg0 != -17773) {
            this.method86(85);
        }
        ++field7788;
    }

    @OriginalMember(owner = "client!dca", name = "h", descriptor = "(I)V", line = 40)
    public final void method102(int arg0) {
        ++field7783;
        if (arg0 != 0) {
            this.method93((class544) null, 32);
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!dca", name = "g", descriptor = "(I)Z", line = 58)
    public final boolean method92(int arg0) {
        if (arg0 != 2) {
            this.field7794 = false;
        }
        ++field7799;
        return false;
    }

    @OriginalMember(owner = "client!dca", name = "d", descriptor = "(B)I", line = 69)
    public final int method100(byte arg0) {
        int var2 = 115 % ((21 - arg0) / 56);
        ++field7781;
        return this.field7802.method833(-74);
    }

    @OriginalMember(owner = "client!dca", name = "j", descriptor = "(I)I", line = 79)
    public final int method89(int arg0) {
        ++field7785;
        int var2 = 49 / ((arg0 - 17) / 61);
        return this.field7802.method828(true);
    }

    @OriginalMember(owner = "client!dca", name = "a", descriptor = "(I)I", line = 90)
    public final int method98(int arg0) {
        if (arg0 != -12194) {
            return 23;
        } else {
            ++field7797;
            return this.field7802.field1521;
        }
    }

    @OriginalMember(owner = "client!dca", name = "a", descriptor = "(Lha;Z)V", line = 101)
    public final void method91(class544 arg0, boolean arg1) {
        if (!arg1) {
            this.field7792 = null;
        }
        this.field7802.method830(0, arg0);
        ++field7795;
    }

    @OriginalMember(owner = "client!dca", name = "i", descriptor = "(I)Z", line = 112)
    public final boolean method86(int arg0) {
        ++field7796;
        if (arg0 != 0) {
            this.method89(-97);
        }
        return this.field7787;
    }

    @OriginalMember(owner = "client!dca", name = "a", descriptor = "(ZILha;Lov;IIZ)V", line = 123)
    public final void method104(boolean arg0, int arg1, class544 arg2, class668 arg3, int arg4, int arg5, boolean arg6) {
        ++field7803;
        if (!arg0) {
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!dca", name = "a", descriptor = "(B)Z", line = 135)
    public final boolean method88(byte arg0) {
        if (arg0 <= 44) {
            this.method95(-83);
        }
        ++field7804;
        return this.field7802.method827((byte) -74);
    }

    @OriginalMember(owner = "client!dca", name = "a", descriptor = "(IILha;I)Z", line = 149)
    public final boolean method94(int arg0, int arg1, class544 arg2, int arg3) {
        int var5 = 0 / ((-80 - arg3) / 44);
        ++field7791;
        class282 var6 = this.field7802.method829(false, false, -1, arg2, 131072);
        if (var6 == null) {
            return false;
        } else {
            class73 var7 = arg2.method343();
            var7.method675(super.field9477, super.field9474, super.field9475);
            return !class141.field2211 ? var6.method1010(arg0, arg1, var7, false, 0) : var6.method1023(arg0, arg1, var7, false, 0, class106.field1553);
        }
    }

    @OriginalMember(owner = "client!dca", name = "<init>", descriptor = "(Lha;Ljl;IIIIIZII)V", line = 317)
    public class545(class544 arg0, class595 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9) {
        super(arg4, arg5, arg6, arg2, arg3, arg1.field8393);
        this.field7802 = new class101(arg0, arg1, 22, arg8, arg2, arg3, this, arg7, arg9);
        this.field7794 = arg1.field8426 != 0 && !arg7;
    }

    @OriginalMember(owner = "client!dca", name = "k", descriptor = "(I)Z", line = 171)
    public final boolean method95(int arg0) {
        ++field7780;
        return arg0 != 0 ? false : false;
    }

    @OriginalMember(owner = "client!dca", name = "b", descriptor = "(ILha;)Lgh;", line = 182)
    public final class48 method103(int arg0, class544 arg1) {
        ++field7798;
        class282 var3 = this.field7802.method829(false, true, -1, arg1, 2048);
        if (var3 == null) {
            return null;
        } else {
            class73 var4 = arg1.method343();
            var4.method675(super.field9477, super.field9474, super.field9475);
            class48 var5 = class331.method2130(1, (byte) 92, this.field7794);
            int var6 = super.field9477 >> 9;
            int var7 = super.field9475 >> 9;
            if (arg0 != 0) {
                this.method94(72, 99, (class544) null, -21);
            }
            this.field7802.method825(var7, arg1, var7, 120, var4, var3, true, var6, var6);
            if (class141.field2211) {
                var3.method1026(var4, var5.field795[0], class106.field1553, 0);
            } else {
                var3.method1007(var4, var5.field795[0], 0);
            }
            if (this.field7802.field1498 != null) {
                class315 var8 = this.field7802.field1498.method3556();
                if (class141.field2211) {
                    arg1.method380(var8, class106.field1553);
                } else {
                    arg1.method420(var8);
                }
            }
            this.field7787 = var3.method1048() || this.field7802.field1498 != null;
            if (this.field7792 == null) {
                this.field7792 = class100.method819(8, var3, super.field9474, super.field9475, super.field9477);
            } else {
                class736.method4109(var3, -8631, super.field9475, this.field7792, super.field9477, super.field9474);
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!dca", name = "a", descriptor = "(Lha;I)Lkn;", line = 235)
    public final class516 method93(class544 arg0, int arg1) {
        if (arg1 != 1) {
            return null;
        } else {
            ++field7793;
            return this.field7792;
        }
    }

    @OriginalMember(owner = "client!dca", name = "a", descriptor = "(BLha;)V", line = 246)
    public final void method96(byte arg0, class544 arg1) {
        ++field7786;
        this.field7802.method836(arg0 ^ -58, arg1);
        if (arg0 != 89) {
            this.field7792 = null;
        }
    }

    @OriginalMember(owner = "client!dca", name = "a", descriptor = "(IIII)V", line = 257)
    public static final void method3196(int arg0, int arg1, int arg2, int arg3) {
        ++field7805;
        if (~class607.field8569 != ~arg3 || ~class478.field6939 != ~arg1 || ~class221.field3592 != ~arg0) {
            class478.field6939 = arg1;
            class245.field3947 = true;
            class607.field8569 = arg3;
            class221.field3592 = arg0;
            double var4 = -((double) (arg3 * 2) * 3.141592653589793D) / 16384.0D;
            double var6 = -((double) (arg1 * arg2) * 3.141592653589793D) / 16384.0D;
            double var8 = Math.cos(var6);
            double var10 = Math.sin(var6);
            double var12 = Math.cos(var4);
            double var14 = Math.sin(var4);
            class759.field10596 = var14;
            class122.field1873 = var12;
            class331.field4878 = var10;
            class535.field7672 = var10 * var14;
            class570.field8088 = var8;
            class230.field3708 = -var10 * var12;
            class330.field4865 = var8 * var12;
            class161.field2509 = -var8 * var14;
            class454.field6603 = 0.0D;
        }
    }

    @OriginalMember(owner = "client!dca", name = "b", descriptor = "(B)I", line = 327)
    public final int method85(byte arg0) {
        if (arg0 != -72) {
            this.method95(69);
        }
        ++field7779;
        return this.field7802.field1520;
    }

    @OriginalMember(owner = "client!dca", name = "n", descriptor = "(I)I", line = 338)
    public static final int method3197(int arg0) {
        ++field7784;
        if (~class554.field7897 == -2) {
            return class560.field7941;
        } else {
            int var1 = -11 / ((-4 - arg0) / 34);
            return 0;
        }
    }

    @OriginalMember(owner = "client!dca", name = "b", descriptor = "(I)I", line = 357)
    public final int method87(int arg0) {
        if (arg0 != 2836) {
            return -14;
        } else {
            ++field7789;
            return this.field7802.field1500;
        }
    }

    @OriginalMember(owner = "client!dca", name = "e", descriptor = "(B)V", line = 368)
    public static final void method3198(byte arg0) {
        ++field7790;
        class751.field10473.method42(-99);
        for (int var1 = 0; ~var1 > -33; ++var1) {
            class247.field3959[var1] = 0L;
        }
        if (arg0 > -117) {
            method3198((byte) 70);
        }
        for (int var2 = 0; var2 < 32; ++var2) {
            class100.field1483[var2] = 0L;
        }
        class398.field5921 = 0;
    }
}
