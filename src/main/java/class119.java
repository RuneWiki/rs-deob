import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oda")
public abstract class class119 extends class593 {

    @OriginalMember(owner = "client!oda", name = "B", descriptor = "S")
    public short field1624;

    @OriginalMember(owner = "client!oda", name = "D", descriptor = "S")
    public short field1626;

    @OriginalMember(owner = "client!oda", name = "J", descriptor = "S")
    public short field1632;

    @OriginalMember(owner = "client!oda", name = "F", descriptor = "S")
    public short field1628;

    @OriginalMember(owner = "client!oda", name = "H", descriptor = "B")
    public byte field1630;

    @OriginalMember(owner = "client!oda", name = "G", descriptor = "Z")
    public boolean field1629;

    @OriginalMember(owner = "client!oda", name = "z", descriptor = "I")
    public static int field1622;

    @OriginalMember(owner = "client!oda", name = "A", descriptor = "I")
    public static int field1623;

    @OriginalMember(owner = "client!oda", name = "C", descriptor = "I")
    public static int field1625;

    @OriginalMember(owner = "client!oda", name = "E", descriptor = "I")
    public static int field1627;

    @OriginalMember(owner = "client!oda", name = "I", descriptor = "I")
    public static int field1631;

    @OriginalMember(owner = "client!oda", name = "l", descriptor = "(B)V", line = 3)
    public static final void method866(byte arg0) {
        if (class612.field8653 != null) {
            class722[] var1 = class612.field8653;
            for (int var2 = 0; var1.length > var2; ++var2) {
                class722 var3 = var1[var2];
                var3.method2066(true);
            }
        }
        if (arg0 != -16) {
            method866((byte) -83);
        }
        ++field1622;
    }

    @OriginalMember(owner = "client!oda", name = "m", descriptor = "(B)V", line = 26)
    public void method736(byte arg0) {
        if (arg0 > -84) {
            this.field1632 = 49;
        }
        ++field1625;
    }

    @OriginalMember(owner = "client!oda", name = "a", descriptor = "(I[Lraa;)I", line = 40)
    public final int method84(int arg0, class609[] arg1) {
        ++field1623;
        int var3 = 0;
        label118: for (int var4 = this.field1628; ~this.field1632 <= ~var4; ++var4) {
            label116: for (int var5 = this.field1626; ~this.field1624 <= ~var5; ++var5) {
                long var6 = class146.field1947[super.field8429][var4][var5];
                long var8 = 0L;
                while (true) {
                    label111: while (true) {
                        if (var8 > 48L) {
                            continue label116;
                        }
                        int var10 = (int) (65535L & var6 >>> (int) var8);
                        if (~var10 >= -1) {
                            continue label116;
                        }
                        class14 var11 = class234.field3410[var10 + -1];
                        for (int var12 = 0; var12 < var3; ++var12) {
                            if (arg1[var12] == var11.field199) {
                                var8 += 16L;
                                continue label111;
                            }
                        }
                        arg1[var3++] = var11.field199;
                        if (var3 == 4) {
                            break label118;
                        }
                        var8 += 16L;
                    }
                }
            }
        }
        for (int var13 = var3; ~var13 > -5; ++var13) {
            arg1[var13] = null;
        }
        if (arg0 < 24) {
            this.field1630 = -69;
        }
        if (~this.field1630 != -1) {
            int var14 = -class736.field10315 + this.field1628;
            int var15 = -class116.field1600 + this.field1626;
            int var16;
            int var17;
            short var18;
            short var19;
            if (this.field1630 == 1) {
                if (var15 <= var14) {
                    var16 = this.field1628 + -1;
                    var17 = this.field1626 + 1;
                    var18 = this.field1628;
                    var19 = this.field1626;
                } else {
                    var16 = this.field1628 + 1;
                    var18 = this.field1628;
                    var19 = this.field1626;
                    var17 = this.field1626 + -1;
                }
            } else if (~(-var14) <= ~var15) {
                var18 = this.field1628;
                var19 = this.field1626;
                var17 = this.field1626 + 1;
                var16 = this.field1628 - -1;
            } else {
                var17 = this.field1626 + -1;
                var16 = this.field1628 - 1;
                var18 = this.field1628;
                var19 = this.field1626;
            }
            label81: for (int var20 = 0; ~var3 < ~var20; ++var20) {
                long var21 = class146.field1947[super.field8429][var18][var17];
                while (~var21 != -1L) {
                    class14 var27 = class234.field3410[(int) ((65535L & var21) + -1L)];
                    var21 >>>= 16;
                    if (arg1[var20] == var27.field199) {
                        continue label81;
                    }
                }
                long var23 = class146.field1947[super.field8429][var16][var19];
                while (~var23 != -1L) {
                    class14 var26 = class234.field3410[(int) ((65535L & var23) + -1L)];
                    var23 >>>= 16;
                    if (arg1[var20] == var26.field199) {
                        continue label81;
                    }
                }
                for (int var25 = var20; ~var25 > ~(var3 + -1); ++var25) {
                    arg1[var25] = arg1[var25 + 1];
                }
                --var3;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!oda", name = "b", descriptor = "(Lha;I)Z", line = 209)
    public final boolean method79(class60 arg0, int arg1) {
        if (arg1 != 9721) {
            this.method736((byte) 3);
        }
        ++field1627;
        return class562.method3281(super.field8417, this.field1626, this.method325(arg0, arg1 ^ 92169721), (byte) -54, this.field1632, this.field1628, this.field1624);
    }

    @OriginalMember(owner = "client!oda", name = "d", descriptor = "(I)Z", line = 225)
    public final boolean method85(int arg0) {
        ++field1631;
        int var2 = this.field1628;
        int var3 = 78 / ((16 - arg0) / 58);
        while (var2 <= this.field1632) {
            for (int var4 = this.field1626; ~this.field1624 <= ~var4; ++var4) {
                int var5 = -class736.field10315 + var2 + class60.field843;
                if (~var5 <= -1 && ~class464.field6819.length < ~var5) {
                    int var6 = var4 - (class116.field1600 - class60.field843);
                    if (var6 >= 0 && var6 < class464.field6819.length && class464.field6819[var5][var6]) {
                        return true;
                    }
                }
            }
            ++var2;
        }
        return false;
    }

    @OriginalMember(owner = "client!oda", name = "<init>", descriptor = "(IIIIIIIIIZB)V", line = 267)
    public class119(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, byte arg10) {
        this.field1624 = (short) arg8;
        this.field1626 = (short) arg7;
        super.field8417 = (byte) arg1;
        super.field8428 = arg4;
        this.field1632 = (short) arg6;
        this.field1628 = (short) arg5;
        super.field8423 = arg2;
        super.field8421 = arg3;
        this.field1630 = arg10;
        this.field1629 = arg9;
        super.field8429 = (byte) arg0;
    }
}
