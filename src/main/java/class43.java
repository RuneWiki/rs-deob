import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!na")
public abstract class class43 extends class20 {

    @OriginalMember(owner = "client!na", name = "B", descriptor = "Z")
    public boolean field763;

    @OriginalMember(owner = "client!na", name = "H", descriptor = "S")
    public short field769;

    @OriginalMember(owner = "client!na", name = "I", descriptor = "S")
    public short field770;

    @OriginalMember(owner = "client!na", name = "C", descriptor = "B")
    public byte field764;

    @OriginalMember(owner = "client!na", name = "G", descriptor = "S")
    public short field768;

    @OriginalMember(owner = "client!na", name = "D", descriptor = "S")
    public short field765;

    @OriginalMember(owner = "client!na", name = "E", descriptor = "I")
    public static int field766;

    @OriginalMember(owner = "client!na", name = "F", descriptor = "I")
    public static int field767;

    @OriginalMember(owner = "client!na", name = "J", descriptor = "I")
    public static int field771;

    @OriginalMember(owner = "client!na", name = "K", descriptor = "I")
    public static int field772;

    @OriginalMember(owner = "client!na", name = "L", descriptor = "I")
    public static int field773;

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(ILkga;III)Leb;")
    public static final class577 method465(int arg0, class506 arg1, int arg2, int arg3, int arg4) {
        int var5 = 3 % ((arg3 - 2) / 49);
        ++field772;
        if (!arg1.field7360 && (!class326.method1894(arg2, 32) || !class326.method1894(arg0, 32))) {
            return !arg1.field7355 ? new class577(arg1, arg4, arg2, arg0, class698.method3915(arg2, (byte) 93), class698.method3915(arg0, (byte) 93)) : new class577(arg1, 34037, arg4, arg2, arg0);
        } else {
            return new class577(arg1, 3553, arg4, arg2, arg0);
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "([Lul;I)I")
    public final int method340(class530[] arg0, int arg1) {
        ++field767;
        int var3 = 0;
        label114: for (int var4 = this.field769; ~var4 >= ~this.field770; ++var4) {
            label112: for (int var5 = this.field768; this.field765 >= var5; ++var5) {
                long var6 = class321.field4226[super.field532][var4][var5];
                long var8 = 0L;
                while (true) {
                    label107: while (true) {
                        if (~var8 < -49L) {
                            continue label112;
                        }
                        int var10 = (int) (65535L & var6 >>> (int) var8);
                        if (~var10 >= -1) {
                            continue label112;
                        }
                        class475 var11 = class436.field6249[var10 + -1];
                        for (int var12 = 0; var3 > var12; ++var12) {
                            if (arg0[var12] == var11.field6647) {
                                var8 += 16L;
                                continue label107;
                            }
                        }
                        arg0[var3++] = var11.field6647;
                        if (~var3 == -5) {
                            break label114;
                        }
                        var8 += 16L;
                    }
                }
            }
        }
        for (int var13 = var3; ~var13 > -5; ++var13) {
            arg0[var13] = null;
        }
        if (~this.field764 != arg1) {
            int var14 = this.field769 - class591.field8564;
            int var15 = -class33.field663 + this.field768;
            int var16;
            short var17;
            short var18;
            int var19;
            if (~this.field764 != -2) {
                if (-var14 >= var15) {
                    var16 = this.field769 - -1;
                    var17 = this.field769;
                    var18 = this.field768;
                    var19 = this.field768 - -1;
                } else {
                    var16 = this.field769 - 1;
                    var19 = this.field768 + -1;
                    var17 = this.field769;
                    var18 = this.field768;
                }
            } else if (var14 >= var15) {
                var16 = this.field769 - 1;
                var17 = this.field769;
                var19 = this.field768 + 1;
                var18 = this.field768;
            } else {
                var16 = this.field769 + 1;
                var19 = this.field768 - 1;
                var17 = this.field769;
                var18 = this.field768;
            }
            label78: for (int var20 = 0; ~var20 > ~var3; ++var20) {
                long var21 = class321.field4226[super.field532][var17][var19];
                while (var21 != 0L) {
                    class475 var27 = class436.field6249[(int) ((65535L & var21) + -1L)];
                    var21 >>>= 16;
                    if (arg0[var20] == var27.field6647) {
                        continue label78;
                    }
                }
                long var23 = class321.field4226[super.field532][var16][var18];
                while (var23 != 0L) {
                    class475 var26 = class436.field6249[(int) ((var23 & 65535L) + -1L)];
                    var23 >>>= 16;
                    if (arg0[var20] == var26.field6647) {
                        continue label78;
                    }
                }
                for (int var25 = var20; ~(var3 + -1) < ~var25; ++var25) {
                    arg0[var25] = arg0[var25 + 1];
                }
                --var3;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!na", name = "j", descriptor = "(I)Z")
    public final boolean method339(int arg0) {
        ++field771;
        int var2 = -58 / ((arg0 - 51) / 47);
        for (int var3 = this.field769; ~var3 >= ~this.field770; ++var3) {
            for (int var4 = this.field768; ~var4 >= ~this.field765; ++var4) {
                int var5 = class119.field1526 + var3 + -class591.field8564;
                if (var5 >= 0 && ~class616.field8849.length < ~var5) {
                    int var6 = -class33.field663 + class119.field1526 + var4;
                    if (~var6 <= -1 && ~var6 > ~class616.field8849.length && class616.field8849[var5][var6]) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!na", name = "d", descriptor = "(B)Z")
    public final boolean method335(byte arg0) {
        ++field766;
        int var2 = 68 / ((arg0 - -19) / 60);
        return class342.method1968(-125, super.field535, this.method173(32249), this.field765, this.field770, this.field768, this.field769);
    }

    @OriginalMember(owner = "client!na", name = "k", descriptor = "(I)V")
    public void method164(int arg0) {
        ++field773;
        int var2 = -30 / ((arg0 - 9) / 43);
    }

    @OriginalMember(owner = "client!na", name = "<init>", descriptor = "(IIIIIIIIIZB)V")
    public class43(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, byte arg10) {
        this.field763 = arg9;
        this.field769 = (short) arg5;
        this.field770 = (short) arg6;
        this.field764 = arg10;
        super.field535 = (byte) arg1;
        super.field530 = arg2;
        super.field527 = arg3;
        this.field768 = (short) arg7;
        super.field532 = (byte) arg0;
        super.field531 = arg4;
        this.field765 = (short) arg8;
    }
}
