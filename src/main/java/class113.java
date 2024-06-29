import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bba")
public abstract class class113 extends class43 {

    @OriginalMember(owner = "client!bba", name = "C", descriptor = "B")
    public byte field1811;

    @OriginalMember(owner = "client!bba", name = "L", descriptor = "S")
    public short field1820;

    @OriginalMember(owner = "client!bba", name = "M", descriptor = "Z")
    public boolean field1821;

    @OriginalMember(owner = "client!bba", name = "B", descriptor = "S")
    public short field1810;

    @OriginalMember(owner = "client!bba", name = "F", descriptor = "S")
    public short field1814;

    @OriginalMember(owner = "client!bba", name = "J", descriptor = "S")
    public short field1818;

    @OriginalMember(owner = "client!bba", name = "y", descriptor = "J")
    public static long field1807 = (long) (9.999999999E9D * Math.random());

    @OriginalMember(owner = "client!bba", name = "z", descriptor = "I")
    public static int field1808 = -1;

    @OriginalMember(owner = "client!bba", name = "D", descriptor = "I")
    public static int field1812 = 0;

    @OriginalMember(owner = "client!bba", name = "A", descriptor = "I")
    public static int field1809;

    @OriginalMember(owner = "client!bba", name = "E", descriptor = "I")
    public static int field1813;

    @OriginalMember(owner = "client!bba", name = "G", descriptor = "I")
    public static int field1815;

    @OriginalMember(owner = "client!bba", name = "H", descriptor = "I")
    public static int field1816;

    @OriginalMember(owner = "client!bba", name = "I", descriptor = "I")
    public static int field1817;

    @OriginalMember(owner = "client!bba", name = "K", descriptor = "I")
    public static int field1819;

    @OriginalMember(owner = "client!bba", name = "e", descriptor = "(I)Z", line = 7)
    public final boolean method391(int arg0) {
        ++field1817;
        if (arg0 != 0) {
            this.field1814 = 38;
        }
        return class13.method69(this.field1810, this.field1814, super.field659, this.field1820, arg0 ^ 1, this.field1818, this.method404(65535));
    }

    @OriginalMember(owner = "client!bba", name = "a", descriptor = "([Lbh;I)I", line = 18)
    public final int method407(class36[] arg0, int arg1) {
        ++field1819;
        int var3 = 0;
        label114: for (int var4 = this.field1814; ~this.field1818 <= ~var4; ++var4) {
            label112: for (int var5 = this.field1820; ~this.field1810 <= ~var5; ++var5) {
                long var6 = class577.field8165[super.field649][var4][var5];
                long var8 = 0L;
                while (true) {
                    label107: while (true) {
                        if (~var8 < -49L) {
                            continue label112;
                        }
                        int var10 = (int) (var6 >>> (int) var8 & 65535L);
                        if (var10 <= 0) {
                            continue label112;
                        }
                        class122 var11 = class502.field7171[var10 + -1];
                        for (int var12 = 0; var12 < var3; ++var12) {
                            if (arg0[var12] == var11.field1891) {
                                var8 += 16L;
                                continue label107;
                            }
                        }
                        arg0[var3++] = var11.field1891;
                        if (var3 == 4) {
                            break label114;
                        }
                        var8 += 16L;
                    }
                }
            }
        }
        for (int var13 = var3; var13 < 4; ++var13) {
            arg0[var13] = null;
        }
        if (this.field1811 != 0) {
            int var14 = -class155.field2331 + this.field1814;
            int var15 = -class214.field3065 + this.field1820;
            short var16;
            int var17;
            int var18;
            short var19;
            if (this.field1811 == 1) {
                if (var15 > var14) {
                    var16 = this.field1820;
                    var17 = this.field1820 + -1;
                    var18 = this.field1814 + 1;
                    var19 = this.field1814;
                } else {
                    var17 = this.field1820 - -1;
                    var16 = this.field1820;
                    var19 = this.field1814;
                    var18 = this.field1814 + -1;
                }
            } else if (var15 > -var14) {
                var19 = this.field1814;
                var17 = this.field1820 - 1;
                var18 = this.field1814 + -1;
                var16 = this.field1820;
            } else {
                var19 = this.field1814;
                var17 = this.field1820 - -1;
                var16 = this.field1820;
                var18 = this.field1814 - -1;
            }
            label78: for (int var20 = 0; var3 > var20; ++var20) {
                long var21 = class577.field8165[super.field649][var19][var17];
                while (var21 != 0L) {
                    class122 var27 = class502.field7171[(int) ((65535L & var21) + -1L)];
                    var21 >>>= 16;
                    if (arg0[var20] == var27.field1891) {
                        continue label78;
                    }
                }
                long var23 = class577.field8165[super.field649][var18][var16];
                while (~var23 != -1L) {
                    class122 var26 = class502.field7171[(int) ((var23 & 65535L) + -1L)];
                    var23 >>>= 16;
                    if (arg0[var20] == var26.field1891) {
                        continue label78;
                    }
                }
                for (int var25 = var20; var3 + -1 > var25; ++var25) {
                    arg0[var25] = arg0[var25 + 1];
                }
                --var3;
            }
        }
        int var28 = 115 / ((arg1 - -32) / 53);
        return var3;
    }

    @OriginalMember(owner = "client!bba", name = "i", descriptor = "(I)V", line = 203)
    public void method476(int arg0) {
        if (arg0 >= 100) {
            ++field1815;
        }
    }

    @OriginalMember(owner = "client!bba", name = "a", descriptor = "(II)Z", line = 214)
    public static final boolean method940(int arg0, int arg1) {
        ++field1813;
        if (arg0 < 12) {
            field1812 = 14;
        }
        return arg1 == 21 || ~arg1 == -58 || arg1 == 10 || ~arg1 == -51 || arg1 == 25 || ~arg1 == -47 || ~arg1 == -52;
    }

    @OriginalMember(owner = "client!bba", name = "<init>", descriptor = "(IIIIIIIIIZB)V", line = 228)
    public class113(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, byte arg10) {
        super.field644 = arg2;
        this.field1811 = arg10;
        super.field651 = arg3;
        this.field1820 = (short) arg7;
        this.field1821 = arg9;
        super.field659 = (byte) arg1;
        super.field648 = arg4;
        super.field649 = (byte) arg0;
        this.field1810 = (short) arg8;
        this.field1814 = (short) arg5;
        this.field1818 = (short) arg6;
    }

    @OriginalMember(owner = "client!bba", name = "g", descriptor = "(I)Z", line = 246)
    public final boolean method403(int arg0) {
        ++field1816;
        int var2 = this.field1814;
        if (arg0 != -28694) {
            this.method407((class36[]) null, -86);
        }
        while (var2 <= this.field1818) {
            for (int var3 = this.field1820; ~this.field1810 <= ~var3; ++var3) {
                int var4 = var2 - class155.field2331 + class235.field3337;
                if (~var4 <= -1 && ~class533.field7539.length < ~var4) {
                    int var5 = -class214.field3065 + class235.field3337 + var3;
                    if (~var5 <= -1 && ~var5 > ~class533.field7539.length && class533.field7539[var4][var5]) {
                        return true;
                    }
                }
            }
            ++var2;
        }
        return false;
    }
}
