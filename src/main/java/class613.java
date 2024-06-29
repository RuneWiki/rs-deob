import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!et")
public abstract class class613 extends class383 {

    @OriginalMember(owner = "client!et", name = "I", descriptor = "S")
    public short field8634;

    @OriginalMember(owner = "client!et", name = "H", descriptor = "B")
    public byte field8633;

    @OriginalMember(owner = "client!et", name = "E", descriptor = "S")
    public short field8630;

    @OriginalMember(owner = "client!et", name = "B", descriptor = "S")
    public short field8627;

    @OriginalMember(owner = "client!et", name = "J", descriptor = "S")
    public short field8635;

    @OriginalMember(owner = "client!et", name = "D", descriptor = "Z")
    public boolean field8629;

    @OriginalMember(owner = "client!et", name = "x", descriptor = "Z")
    public static boolean field8623 = false;

    @OriginalMember(owner = "client!et", name = "F", descriptor = "Lbs;")
    public static class215 field8631 = new class215();

    @OriginalMember(owner = "client!et", name = "w", descriptor = "I")
    public static int field8622;

    @OriginalMember(owner = "client!et", name = "y", descriptor = "I")
    public static int field8624;

    @OriginalMember(owner = "client!et", name = "z", descriptor = "I")
    public static int field8625;

    @OriginalMember(owner = "client!et", name = "A", descriptor = "I")
    public static int field8626;

    @OriginalMember(owner = "client!et", name = "C", descriptor = "I")
    public static int field8628;

    @OriginalMember(owner = "client!et", name = "G", descriptor = "I")
    public static int field8632;

    @OriginalMember(owner = "client!et", name = "K", descriptor = "I")
    public static int field8636;

    @OriginalMember(owner = "client!et", name = "k", descriptor = "(I)V")
    public static void method3412(int arg0) {
        field8631 = null;
        if (arg0 != -21399) {
            field8631 = null;
        }
    }

    @OriginalMember(owner = "client!et", name = "l", descriptor = "(I)V")
    public void method3413(int arg0) {
        ++field8626;
        if (arg0 != 2) {
            field8632 = -109;
        }
    }

    @OriginalMember(owner = "client!et", name = "f", descriptor = "(I)Z")
    public final boolean method481(int arg0) {
        if (arg0 != 0) {
            field8631 = null;
        }
        ++field8636;
        for (int var2 = this.field8635; var2 <= this.field8634; ++var2) {
            for (int var3 = this.field8627; var3 <= this.field8630; ++var3) {
                int var4 = var2 - class309.field3830 - -class460.field6544;
                if (~var4 <= -1 && class475.field6837.length > var4) {
                    int var5 = var3 - -class460.field6544 + -class379.field5139;
                    if (var5 >= 0 && ~class475.field6837.length < ~var5 && class475.field6837[var4][var5]) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!et", name = "d", descriptor = "(B)Z")
    public final boolean method483(byte arg0) {
        if (arg0 <= 101) {
            field8631 = null;
        }
        ++field8622;
        return class375.method2175(this.field8627, (byte) -21, this.field8630, super.field5169, this.field8634, this.method179(3370), this.field8635);
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(I[Leq;)I")
    public final int method479(int arg0, class670[] arg1) {
        ++field8625;
        int var3 = 0;
        label118: for (int var4 = this.field8635; ~var4 >= ~this.field8634; ++var4) {
            label116: for (int var5 = this.field8627; var5 <= this.field8630; ++var5) {
                long var6 = class312.field3882[super.field5166][var4][var5];
                long var8 = 0L;
                while (true) {
                    label111: while (true) {
                        if (~var8 < -49L) {
                            continue label116;
                        }
                        int var10 = (int) (var6 >>> (int) var8 & 65535L);
                        if (var10 <= 0) {
                            continue label116;
                        }
                        class241 var11 = class85.field860[var10 + -1];
                        for (int var12 = 0; var3 > var12; ++var12) {
                            if (arg1[var12] == var11.field2980) {
                                var8 += 16L;
                                continue label111;
                            }
                        }
                        arg1[var3++] = var11.field2980;
                        if (var3 == 4) {
                            break label118;
                        }
                        var8 += 16L;
                    }
                }
            }
        }
        if (arg0 != -26355) {
            method3412(-1);
        }
        for (int var13 = var3; var13 < 4; ++var13) {
            arg1[var13] = null;
        }
        if (~this.field8633 != -1) {
            int var14 = -class309.field3830 + this.field8635;
            int var15 = -class379.field5139 + this.field8627;
            short var16;
            int var17;
            short var18;
            int var19;
            if (~this.field8633 != -2) {
                if (~var15 < ~(-var14)) {
                    var16 = this.field8627;
                    var17 = this.field8627 + -1;
                    var18 = this.field8635;
                    var19 = this.field8635 + -1;
                } else {
                    var16 = this.field8627;
                    var19 = this.field8635 + 1;
                    var17 = this.field8627 + 1;
                    var18 = this.field8635;
                }
            } else if (var15 > var14) {
                var16 = this.field8627;
                var19 = this.field8635 + 1;
                var18 = this.field8635;
                var17 = this.field8627 + -1;
            } else {
                var19 = this.field8635 + -1;
                var18 = this.field8635;
                var16 = this.field8627;
                var17 = this.field8627 + 1;
            }
            label82: for (int var20 = 0; ~var20 > ~var3; ++var20) {
                long var21 = class312.field3882[super.field5166][var18][var17];
                while (~var21 != -1L) {
                    class241 var27 = class85.field860[(int) ((65535L & var21) - 1L)];
                    var21 >>>= 16;
                    if (arg1[var20] == var27.field2980) {
                        continue label82;
                    }
                }
                long var23 = class312.field3882[super.field5166][var19][var16];
                while (var23 != 0L) {
                    class241 var26 = class85.field860[(int) ((65535L & var23) + -1L)];
                    var23 >>>= 16;
                    if (arg1[var20] == var26.field2980) {
                        continue label82;
                    }
                }
                for (int var25 = var20; var25 < var3 + -1; ++var25) {
                    arg1[var25] = arg1[var25 - -1];
                }
                --var3;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!et", name = "<init>", descriptor = "(IIIIIIIIIZB)V")
    public class613(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, byte arg10) {
        super.field5176 = arg4;
        this.field8634 = (short) arg6;
        this.field8633 = arg10;
        this.field8630 = (short) arg8;
        super.field5169 = (byte) arg1;
        this.field8627 = (short) arg7;
        this.field8635 = (short) arg5;
        super.field5178 = arg3;
        this.field8629 = arg9;
        super.field5179 = arg2;
        super.field5166 = (byte) arg0;
    }
}
