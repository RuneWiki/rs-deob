import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lr")
public abstract class class752 extends class176 {

    @OriginalMember(owner = "client!lr", name = "B", descriptor = "S")
    public short field10422;

    @OriginalMember(owner = "client!lr", name = "K", descriptor = "Z")
    public boolean field10431;

    @OriginalMember(owner = "client!lr", name = "A", descriptor = "S")
    public short field10421;

    @OriginalMember(owner = "client!lr", name = "G", descriptor = "B")
    public byte field10427;

    @OriginalMember(owner = "client!lr", name = "F", descriptor = "S")
    public short field10426;

    @OriginalMember(owner = "client!lr", name = "E", descriptor = "S")
    public short field10425;

    @OriginalMember(owner = "client!lr", name = "C", descriptor = "I")
    public static int field10423;

    @OriginalMember(owner = "client!lr", name = "D", descriptor = "I")
    public static int field10424;

    @OriginalMember(owner = "client!lr", name = "H", descriptor = "I")
    public static int field10428;

    @OriginalMember(owner = "client!lr", name = "I", descriptor = "I")
    public static int field10429;

    @OriginalMember(owner = "client!lr", name = "J", descriptor = "I")
    public static int field10430;

    @OriginalMember(owner = "client!lr", name = "L", descriptor = "I")
    public static int field10432;

    @OriginalMember(owner = "client!lr", name = "i", descriptor = "(I)V")
    public void method161(int arg0) {
        if (arg0 != -8675) {
            method4186(101, (class712) null, (class570) null);
        }
        ++field10423;
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(ILlga;Lhj;)Leda;")
    public static final class103 method4186(int arg0, class712 arg1, class570 arg2) {
        ++field10432;
        class103 var3 = class652.method3682(arg0 + -261);
        var3.field1378 = arg1;
        var3.field1382 = arg1.field9940;
        if (~var3.field1382 != 0) {
            if (~var3.field1382 != 1) {
                if (var3.field1382 <= 18) {
                    var3.field1379 = new class481(20);
                } else if (var3.field1382 <= 98) {
                    var3.field1379 = new class481(100);
                } else {
                    var3.field1379 = new class481(260);
                }
            } else {
                var3.field1379 = new class481(10000);
            }
        } else {
            var3.field1379 = new class481(260);
        }
        var3.field1379.method2697((byte) -125, arg2);
        var3.field1379.method2706(false, var3.field1378.method3991(2));
        var3.field1386 = 0;
        if (arg0 != 260) {
            method4186(-19, (class712) null, (class570) null);
        }
        return var3;
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(Lji;Z)Ltga;")
    public static final class58 method4187(class611 arg0, boolean arg1) {
        ++field10424;
        String var2 = arg0.method3403((byte) 84);
        class676 var3 = class216.method1203(122)[arg0.method3428((byte) 69)];
        class82 var4 = class449.method2516(256)[arg0.method3428((byte) -120)];
        int var5 = arg0.method3413(false);
        int var6 = arg0.method3413(!arg1);
        if (!arg1) {
            return null;
        } else {
            int var7 = arg0.method3428((byte) 106);
            int var8 = arg0.method3428((byte) 51);
            int var9 = arg0.method3428((byte) 15);
            int var10 = arg0.method3402((byte) 127);
            int var11 = arg0.method3402((byte) 127);
            int var12 = arg0.method3418(-2);
            int var13 = arg0.method3418(-2);
            int var14 = arg0.method3418(-2);
            return new class58(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14);
        }
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(I[Lcba;)I")
    public final int method881(int arg0, class551[] arg1) {
        ++field10430;
        int var3 = 0;
        label114: for (int var4 = this.field10422; var4 <= this.field10426; ++var4) {
            label112: for (int var5 = this.field10421; var5 <= this.field10425; ++var5) {
                long var6 = class180.field2218[super.field2175][var4][var5];
                long var8 = 0L;
                while (true) {
                    label107: while (true) {
                        if (var8 > 48L) {
                            continue label112;
                        }
                        int var10 = (int) (65535L & var6 >>> (int) var8);
                        if (var10 <= 0) {
                            continue label112;
                        }
                        class669 var11 = class85.field1176[var10 + -1];
                        for (int var12 = 0; var3 > var12; ++var12) {
                            if (arg1[var12] == var11.field9295) {
                                var8 += 16L;
                                continue label107;
                            }
                        }
                        arg1[var3++] = var11.field9295;
                        if (var3 == 4) {
                            break label114;
                        }
                        var8 += 16L;
                    }
                }
            }
        }
        int var13 = 79 % ((29 - arg0) / 62);
        for (int var14 = var3; var14 < 4; ++var14) {
            arg1[var14] = null;
        }
        if (this.field10427 != 0) {
            int var15 = this.field10422 - class610.field8512;
            int var16 = -class39.field407 + this.field10421;
            short var17;
            short var18;
            int var19;
            int var20;
            if (~this.field10427 != -2) {
                if (var16 <= -var15) {
                    var17 = this.field10422;
                    var18 = this.field10421;
                    var19 = this.field10421 + 1;
                    var20 = this.field10422 + 1;
                } else {
                    var20 = this.field10422 + -1;
                    var19 = this.field10421 + -1;
                    var18 = this.field10421;
                    var17 = this.field10422;
                }
            } else if (var15 < var16) {
                var20 = this.field10422 + 1;
                var19 = this.field10421 + -1;
                var17 = this.field10422;
                var18 = this.field10421;
            } else {
                var18 = this.field10421;
                var19 = this.field10421 + 1;
                var20 = this.field10422 + -1;
                var17 = this.field10422;
            }
            label78: for (int var21 = 0; var21 < var3; ++var21) {
                long var22 = class180.field2218[super.field2175][var17][var19];
                while (~var22 != -1L) {
                    class669 var28 = class85.field1176[(int) ((65535L & var22) - 1L)];
                    var22 >>>= 16;
                    if (arg1[var21] == var28.field9295) {
                        continue label78;
                    }
                }
                long var24 = class180.field2218[super.field2175][var20][var18];
                while (var24 != 0L) {
                    class669 var27 = class85.field1176[(int) ((var24 & 65535L) + -1L)];
                    var24 >>>= 16;
                    if (arg1[var21] == var27.field9295) {
                        continue label78;
                    }
                }
                for (int var26 = var21; ~(var3 + -1) < ~var26; ++var26) {
                    arg1[var26] = arg1[var26 + 1];
                }
                --var3;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(Lha;B)Z")
    public final boolean method882(class60 arg0, byte arg1) {
        ++field10428;
        if (arg1 != 77) {
            this.method885(false);
        }
        return class676.method3843(this.field10422, this.field10421, this.method134((byte) -53, arg0), 0, this.field10426, this.field10425, super.field2167);
    }

    @OriginalMember(owner = "client!lr", name = "d", descriptor = "(Z)Z")
    public final boolean method885(boolean arg0) {
        ++field10429;
        if (arg0) {
            this.method885(true);
        }
        for (int var2 = this.field10422; this.field10426 >= var2; ++var2) {
            for (int var3 = this.field10421; this.field10425 >= var3; ++var3) {
                int var4 = class118.field1562 + var2 + -class610.field8512;
                if (var4 >= 0 && ~var4 > ~class423.field5940.length) {
                    int var5 = -class39.field407 + var3 - -class118.field1562;
                    if (~var5 <= -1 && class423.field5940.length > var5 && class423.field5940[var4][var5]) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!lr", name = "<init>", descriptor = "(IIIIIIIIIZB)V")
    public class752(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, byte arg10) {
        this.field10422 = (short) arg5;
        this.field10431 = arg9;
        super.field2178 = arg3;
        super.field2167 = (byte) arg1;
        this.field10421 = (short) arg7;
        this.field10427 = arg10;
        this.field10426 = (short) arg6;
        super.field2170 = arg2;
        super.field2165 = arg4;
        this.field10425 = (short) arg8;
        super.field2175 = (byte) arg0;
    }
}
