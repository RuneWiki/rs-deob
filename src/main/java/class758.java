import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public class class758 extends class559 {

    @OriginalMember(owner = "client!ra", name = "Q", descriptor = "Z")
    private boolean field10550 = true;

    @OriginalMember(owner = "client!ra", name = "P", descriptor = "I")
    private int field10549 = 0;

    @OriginalMember(owner = "client!ra", name = "S", descriptor = "Z")
    public boolean field10552 = false;

    @OriginalMember(owner = "client!ra", name = "X", descriptor = "I")
    private int field10557 = 0;

    @OriginalMember(owner = "client!ra", name = "T", descriptor = "I")
    private int field10553 = 0;

    @OriginalMember(owner = "client!ra", name = "gb", descriptor = "I")
    private int field10566 = 0;

    @OriginalMember(owner = "client!ra", name = "jb", descriptor = "I")
    private int field10569 = -1;

    @OriginalMember(owner = "client!ra", name = "db", descriptor = "I")
    private int field10563 = 0;

    @OriginalMember(owner = "client!ra", name = "ob", descriptor = "I")
    private int field10574;

    @OriginalMember(owner = "client!ra", name = "R", descriptor = "I")
    public int field10551;

    @OriginalMember(owner = "client!ra", name = "W", descriptor = "Lvga;")
    private class82 field10556;

    @OriginalMember(owner = "client!ra", name = "sb", descriptor = "[F")
    public static float[] field10578 = new float[16];

    @OriginalMember(owner = "client!ra", name = "eb", descriptor = "Ljn;")
    public static class322 field10564 = new class322();

    @OriginalMember(owner = "client!ra", name = "ub", descriptor = "Z")
    public static boolean field10580 = false;

    @OriginalMember(owner = "client!ra", name = "wb", descriptor = "[[I")
    public static int[][] field10582 = new int[][] { { 0, 1, 2, 3 }, { 1, -1, -1, 0 }, { -1, 2, -1, 0 }, { -1, 0, -1, 2 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 3, 4, -1 }, { -1, 0, 2, -1 }, { -1, -1, 2, 0 }, { 0, 2, 5, 3 }, { 0, -1, 6, -1 }, { 0, 1, 2, 3 } };

    @OriginalMember(owner = "client!ra", name = "ab", descriptor = "F")
    public static float field10560;

    @OriginalMember(owner = "client!ra", name = "O", descriptor = "I")
    public static int field10548;

    @OriginalMember(owner = "client!ra", name = "U", descriptor = "I")
    public static int field10554;

    @OriginalMember(owner = "client!ra", name = "V", descriptor = "I")
    public static int field10555;

    @OriginalMember(owner = "client!ra", name = "Y", descriptor = "I")
    public static int field10558;

    @OriginalMember(owner = "client!ra", name = "Z", descriptor = "I")
    public static int field10559;

    @OriginalMember(owner = "client!ra", name = "bb", descriptor = "I")
    public static int field10561;

    @OriginalMember(owner = "client!ra", name = "cb", descriptor = "I")
    public static int field10562;

    @OriginalMember(owner = "client!ra", name = "fb", descriptor = "I")
    public static int field10565;

    @OriginalMember(owner = "client!ra", name = "hb", descriptor = "I")
    public static int field10567;

    @OriginalMember(owner = "client!ra", name = "ib", descriptor = "I")
    public static int field10568;

    @OriginalMember(owner = "client!ra", name = "kb", descriptor = "I")
    public static int field10570;

    @OriginalMember(owner = "client!ra", name = "lb", descriptor = "I")
    public static int field10571;

    @OriginalMember(owner = "client!ra", name = "mb", descriptor = "I")
    public static int field10572;

    @OriginalMember(owner = "client!ra", name = "nb", descriptor = "I")
    public static int field10573;

    @OriginalMember(owner = "client!ra", name = "qb", descriptor = "I")
    public static int field10576;

    @OriginalMember(owner = "client!ra", name = "rb", descriptor = "I")
    public static int field10577;

    @OriginalMember(owner = "client!ra", name = "tb", descriptor = "I")
    public static int field10579;

    @OriginalMember(owner = "client!ra", name = "vb", descriptor = "I")
    public static int field10581;

    @OriginalMember(owner = "client!ra", name = "pb", descriptor = "Lem;")
    private class627 field10575;

    @OriginalMember(owner = "client!ra", name = "<init>", descriptor = "(IIIIIIIIIIIII)V", line = 4)
    public class758(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        super(arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, false, (byte) 0);
        this.field10574 = arg0;
        this.field10566 = arg12;
        this.field10551 = arg2 - -arg1;
        class417 var14 = class41.field718.method1529((byte) 82, this.field10574);
        int var15 = var14.field6136;
        if (var15 != -1) {
            this.field10556 = class83.field1219.method2358((byte) -89, var15);
            this.field10552 = false;
        } else {
            this.field10552 = true;
        }
        if (~this.field10551 == ~arg2) {
            class262.method1747(this, this.field10563, this.field10556, -26868);
        }
    }

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "(II)V", line = 35)
    public final void method4215(int arg0, int arg1) {
        ++field10559;
        if (!this.field10552) {
            this.field10557 += arg0;
            if (arg1 <= 90) {
                this.field10569 = -18;
            }
            while (this.field10556.field1211[this.field10563] < this.field10557) {
                this.field10557 -= this.field10556.field1211[this.field10563];
                ++this.field10563;
                if (~this.field10556.field1197.length >= ~this.field10563) {
                    this.field10552 = true;
                    break;
                }
            }
            if (!this.field10552) {
                class262.method1747(this, this.field10563, this.field10556, -26868);
            }
        }
    }

    @OriginalMember(owner = "client!ra", name = "g", descriptor = "(I)Z", line = 67)
    public final boolean method92(int arg0) {
        ++field10561;
        if (arg0 != 2) {
            field10582 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "(ILha;)Lgh;", line = 78)
    public final class48 method103(int arg0, class544 arg1) {
        ++field10573;
        class282 var3 = this.method4220(arg1, 2048 | (~this.field10566 != -1 ? 5 : 0), this.field10574, (byte) -26);
        if (var3 == null) {
            return null;
        } else {
            if (this.field10566 != arg0) {
                var3.method1019(this.field10566 * 2048);
            }
            class73 var4 = arg1.method343();
            var4.method675(super.field9477, super.field9474, super.field9475);
            this.method4219(var3, var4, arg1, (byte) -32);
            class48 var5 = class331.method2130(1, (byte) 92, false);
            if (!class141.field2211) {
                var3.method1007(var4, var5.field795[0], 0);
            } else {
                var3.method1026(var4, var5.field795[0], class106.field1553, 0);
            }
            if (this.field10575 != null) {
                class315 var6 = this.field10575.method3556();
                if (class141.field2211) {
                    arg1.method380(var6, class106.field1553);
                } else {
                    arg1.method420(var6);
                }
            }
            this.field10550 = var3.method1048();
            this.field10549 = var3.method1033();
            this.field10553 = var3.method1013();
            return var5;
        }
    }

    @OriginalMember(owner = "client!ra", name = "j", descriptor = "(I)I", line = 120)
    public final int method89(int arg0) {
        int var2 = -112 % ((arg0 - 17) / 61);
        ++field10565;
        return this.field10553;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(I)V", line = 134)
    public static void method4216(int arg0) {
        field10582 = null;
        field10564 = null;
        field10578 = null;
        if (arg0 != -1) {
            method4216(-40);
        }
    }

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "(I)V", line = 146)
    public final void method4217(int arg0) {
        if (arg0 >= 38) {
            if (this.field10575 != null) {
                this.field10575.method3557();
            }
            ++field10579;
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(IILha;I)Z", line = 160)
    public final boolean method94(int arg0, int arg1, class544 arg2, int arg3) {
        ++field10577;
        int var5 = -112 / ((-80 - arg3) / 44);
        return false;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(Lha;I)Lkn;", line = 174)
    public final class516 method93(class544 arg0, int arg1) {
        ++field10555;
        return arg1 != 1 ? null : null;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(ZILha;Lov;IIZ)V", line = 186)
    public final void method104(boolean arg0, int arg1, class544 arg2, class668 arg3, int arg4, int arg5, boolean arg6) {
        if (!arg0) {
            ++field10562;
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!ra", name = "c", descriptor = "(II)V", line = 197)
    public static final void method4218(int arg0, int arg1) {
        ++field10558;
        if (arg1 > -61) {
            field10580 = true;
        }
        class118 var2 = class86.method755(true, 10, arg0);
        var2.method936(0);
    }

    @OriginalMember(owner = "client!ra", name = "finalize", descriptor = "()V", line = 212)
    protected final void finalize() {
        ++field10570;
        if (this.field10575 != null) {
            this.field10575.method3557();
        }
    }

    @OriginalMember(owner = "client!ra", name = "d", descriptor = "(B)I", line = 227)
    public final int method100(byte arg0) {
        int var2 = -7 % ((21 - arg0) / 56);
        ++field10548;
        return this.field10549;
    }

    @OriginalMember(owner = "client!ra", name = "i", descriptor = "(I)Z", line = 240)
    public final boolean method86(int arg0) {
        if (arg0 != 0) {
            this.method4219((class282) null, (class73) null, (class544) null, (byte) 67);
        }
        ++field10554;
        return this.field10550;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(Lka;Ltc;Lha;B)V", line = 255)
    private final void method4219(class282 arg0, class73 arg1, class544 arg2, byte arg3) {
        ++field10572;
        arg0.method1028(arg1);
        class157[] var5 = arg0.method1020();
        if (arg3 == -32) {
            class158[] var6 = arg0.method1036();
            if ((this.field10575 == null || this.field10575.field8793) && (var5 != null || var6 != null)) {
                this.field10575 = class627.method3555(class199.field3403, true);
            }
            if (this.field10575 != null) {
                this.field10575.method3561(arg2, (long) class199.field3403, var5, var6, false);
                this.field10575.method3560(super.field9470, super.field7927, super.field7931, super.field7930, super.field7934);
            }
        }
    }

    @OriginalMember(owner = "client!ra", name = "h", descriptor = "(I)V", line = 280)
    public final void method102(int arg0) {
        if (arg0 != 0) {
            this.method4215(75, 38);
        }
        ++field10576;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "(Lha;I)V", line = 291)
    public final void method97(class544 arg0, int arg1) {
        ++field10568;
        class282 var3 = this.method4220(arg0, 0, this.field10574, (byte) -26);
        if (var3 != null) {
            class73 var4 = arg0.method343();
            var4.method675(super.field9477, super.field9474, super.field9475);
            this.method4219(var3, var4, arg0, (byte) -32);
        }
        if (arg1 != -1) {
            this.method104(true, -105, (class544) null, (class668) null, -91, -103, true);
        }
    }

    @OriginalMember(owner = "client!ra", name = "k", descriptor = "(I)Z", line = 322)
    public final boolean method95(int arg0) {
        ++field10567;
        return arg0 != 0 ? false : false;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(Lha;IIB)Lka;", line = 339)
    private final class282 method4220(class544 arg0, int arg1, int arg2, byte arg3) {
        if (arg3 != -26) {
            return null;
        } else {
            ++field10571;
            class417 var5 = class41.field718.method1529((byte) 108, arg2);
            class339 var6 = class121.field1867[super.field9470];
            class339 var7 = ~super.field9469 > -4 ? class121.field1867[super.field9469 + 1] : null;
            return !this.field10552 ? var5.method2565(this.field10569, super.field9477, var7, class83.field1219, arg0, this.field10563, true, super.field9475, this.field10557, arg1, var6, super.field9474, (byte) 2) : var5.method2565(-1, super.field9477, var7, class83.field1219, arg0, -1, true, super.field9475, 0, arg1, var6, super.field9474, (byte) 2);
        }
    }
}
