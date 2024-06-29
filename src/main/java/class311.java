import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lr")
public class class311 extends class540 {

    @OriginalMember(owner = "client!lr", name = "Bb", descriptor = "I")
    public static int field4571 = 2;

    @OriginalMember(owner = "client!lr", name = "Jb", descriptor = "J")
    public static volatile long field4579 = 0L;

    @OriginalMember(owner = "client!lr", name = "Tb", descriptor = "F")
    public static float field4589 = 0.0F;

    @OriginalMember(owner = "client!lr", name = "Cb", descriptor = "I")
    public static int field4572;

    @OriginalMember(owner = "client!lr", name = "Db", descriptor = "I")
    public static int field4573;

    @OriginalMember(owner = "client!lr", name = "Eb", descriptor = "I")
    public static int field4574;

    @OriginalMember(owner = "client!lr", name = "Fb", descriptor = "I")
    public static int field4575;

    @OriginalMember(owner = "client!lr", name = "Ib", descriptor = "I")
    public static int field4578;

    @OriginalMember(owner = "client!lr", name = "Lb", descriptor = "I")
    public static int field4581;

    @OriginalMember(owner = "client!lr", name = "Mb", descriptor = "I")
    public static int field4582;

    @OriginalMember(owner = "client!lr", name = "Nb", descriptor = "I")
    public static int field4583;

    @OriginalMember(owner = "client!lr", name = "Ob", descriptor = "I")
    public static int field4584;

    @OriginalMember(owner = "client!lr", name = "Pb", descriptor = "I")
    public static int field4585;

    @OriginalMember(owner = "client!lr", name = "Qb", descriptor = "I")
    public static int field4586;

    @OriginalMember(owner = "client!lr", name = "Rb", descriptor = "I")
    public static int field4587;

    @OriginalMember(owner = "client!lr", name = "Sb", descriptor = "I")
    private int field4588;

    @OriginalMember(owner = "client!lr", name = "Hb", descriptor = "Lq;")
    public static class151 field4577;

    @OriginalMember(owner = "client!lr", name = "Kb", descriptor = "Lcr;")
    private class162 field4580;

    @OriginalMember(owner = "client!lr", name = "Gb", descriptor = "[I")
    public static int[] field4576;

    @OriginalMember(owner = "client!lr", name = "g", descriptor = "(B)V", line = 5)
    public final void method1935(byte arg0) {
        ++field4572;
        super.field7956 = (this.field4588 + 7) / 8;
        int var2 = 106 / ((arg0 - -3) / 57);
    }

    @OriginalMember(owner = "client!lr", name = "n", descriptor = "(II)I", line = 16)
    public final int method1936(int arg0, int arg1) {
        ++field4584;
        if (arg0 != 8) {
            this.field4588 = 5;
        }
        return arg1 * 8 + -this.field4588;
    }

    @OriginalMember(owner = "client!lr", name = "h", descriptor = "(B)Z", line = 29)
    public final boolean method1937(byte arg0) {
        ++field4573;
        if (arg0 <= 65) {
            this.field4588 = 124;
        }
        int var2 = 255 & super.field7952[super.field7956] + -this.field4580.method1151((byte) -127);
        return ~var2 <= -129;
    }

    @OriginalMember(owner = "client!lr", name = "i", descriptor = "(B)I", line = 47)
    public final int method1938(byte arg0) {
        ++field4582;
        if (arg0 <= 31) {
            this.method1945((class162) null, -92);
        }
        int var2 = 255 & super.field7952[super.field7956++] + -this.field4580.method1152((byte) 124);
        return ~var2 > -129 ? var2 : (super.field7952[super.field7956++] - this.field4580.method1152((byte) 113) & 255) + (var2 + -128 << 8);
    }

    @OriginalMember(owner = "client!lr", name = "b", descriptor = "(ZI)V", line = 66)
    public final void method1939(boolean arg0, int arg1) {
        super.field7952[super.field7956++] = (byte) (arg1 + this.field4580.method1152((byte) -102));
        ++field4578;
        if (!arg0) {
            this.field4588 = 40;
        }
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "([IB)V", line = 78)
    public final void method1940(int[] arg0, byte arg1) {
        ++field4581;
        int var3 = 110 / ((arg1 - -47) / 35);
        this.field4580 = new class162(arg0);
    }

    @OriginalMember(owner = "client!lr", name = "C", descriptor = "(I)V", line = 96)
    public final void method1941(int arg0) {
        ++field4585;
        if (arg0 >= -67) {
            field4577 = null;
        }
        this.field4588 = super.field7956 * 8;
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(Ljava/lang/String;II)V", line = 111)
    public static final void method1942(String arg0, int arg1, int arg2) {
        ++field4575;
        if (arg2 != -7) {
            method1942((String) null, -28, -25);
        }
        int var3 = class416.field6150;
        int[] var4 = class35.field554;
        boolean var5 = false;
        for (int var6 = 0; ~var3 < ~var6; ++var6) {
            class71 var7 = class35.field551[var4[var6]];
            if (var7 != null && class321.field4681 != var7 && var7.field1094 != null && var7.field1094.equalsIgnoreCase(arg0)) {
                var5 = true;
                if (~arg1 == -2) {
                    ++class540.field7918;
                    class654 var8 = class631.method3628(class527.field7483, (byte) -51, class357.field5280);
                    var8.field9358.method3163(-128, var4[var6]);
                    var8.field9358.method3123((byte) -121, 0);
                    class444.method2623(118, var8);
                } else if (arg1 != 4) {
                    if (~arg1 == -6) {
                        ++class276.field3593;
                        class654 var9 = class631.method3628(class109.field1621, (byte) -51, class357.field5280);
                        var9.field9358.method3123((byte) -109, 0);
                        var9.field9358.method3163(-128, var4[var6]);
                        class444.method2623(124, var9);
                    } else if (~arg1 == -7) {
                        ++class571.field8298;
                        class654 var10 = class631.method3628(class608.field8800, (byte) -51, class357.field5280);
                        var10.field9358.method3164(var4[var6], (byte) 109);
                        var10.field9358.method3123((byte) -120, 0);
                        class444.method2623(120, var10);
                    } else if (~arg1 == -8) {
                        ++class303.field4506;
                        class654 var11 = class631.method3628(class287.field3869, (byte) -51, class357.field5280);
                        var11.field9358.method3163(-128, var4[var6]);
                        var11.field9358.method3110(0, 112);
                        class444.method2623(125, var11);
                    }
                } else {
                    ++class584.field8488;
                    class654 var12 = class631.method3628(class428.field6247, (byte) -51, class357.field5280);
                    var12.field9358.method3162(-2003712696, var4[var6]);
                    var12.field9358.method3110(0, 99);
                    class444.method2623(117, var12);
                }
                break;
            }
        }
        if (!var5) {
            class36.method213(0, 4, class279.field3646.method1654(arg2 ^ -122, class262.field3401) + arg0);
        }
    }

    @OriginalMember(owner = "client!lr", name = "j", descriptor = "(B)V", line = 210)
    public static void method1943(byte arg0) {
        field4577 = null;
        field4576 = null;
        int var1 = -38 % ((arg0 - -10) / 63);
    }

    @OriginalMember(owner = "client!lr", name = "<init>", descriptor = "(I)V", line = 223)
    public class311(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(III[B)V", line = 226)
    public final void method1944(int arg0, int arg1, int arg2, byte[] arg3) {
        ++field4586;
        if (arg1 != 24566) {
            this.method1945((class162) null, 81);
        }
        for (int var5 = 0; var5 < arg2; ++var5) {
            arg3[arg0 + var5] = (byte) (super.field7952[super.field7956++] + -this.field4580.method1152((byte) -115));
        }
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(Lcr;I)V", line = 250)
    public final void method1945(class162 arg0, int arg1) {
        ++field4574;
        int var3 = 111 / ((-55 - arg1) / 54);
        this.field4580 = arg0;
    }

    @OriginalMember(owner = "client!lr", name = "e", descriptor = "(IB)I", line = 262)
    public final int method1946(int arg0, byte arg1) {
        ++field4583;
        int var3 = this.field4588 >> 3;
        int var4 = -(7 & this.field4588) + 8;
        if (arg1 <= 119) {
            this.field4580 = null;
        }
        int var5 = 0;
        this.field4588 += arg0;
        while (arg0 > var4) {
            var5 += (super.field7952[var3++] & class73.field1156[var4]) << arg0 - var4;
            arg0 -= var4;
            var4 = 8;
        }
        int var6;
        if (~arg0 == ~var4) {
            var6 = (super.field7952[var3] & class73.field1156[var4]) + var5;
        } else {
            var6 = (super.field7952[var3] >> -arg0 + var4 & class73.field1156[arg0]) + var5;
        }
        return var6;
    }
}
