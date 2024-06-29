import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!at")
public abstract class class144 extends class204 {

    @OriginalMember(owner = "client!at", name = "y", descriptor = "S")
    public short field2481;

    @OriginalMember(owner = "client!at", name = "B", descriptor = "S")
    public short field2484;

    @OriginalMember(owner = "client!at", name = "D", descriptor = "S")
    public short field2486;

    @OriginalMember(owner = "client!at", name = "z", descriptor = "Z")
    public boolean field2482;

    @OriginalMember(owner = "client!at", name = "w", descriptor = "B")
    public byte field2479;

    @OriginalMember(owner = "client!at", name = "A", descriptor = "S")
    public short field2483;

    @OriginalMember(owner = "client!at", name = "F", descriptor = "I")
    public static int field2488 = 1;

    @OriginalMember(owner = "client!at", name = "s", descriptor = "I")
    public static int field2475;

    @OriginalMember(owner = "client!at", name = "t", descriptor = "I")
    public static int field2476;

    @OriginalMember(owner = "client!at", name = "u", descriptor = "I")
    public static int field2477;

    @OriginalMember(owner = "client!at", name = "v", descriptor = "I")
    public static int field2478;

    @OriginalMember(owner = "client!at", name = "x", descriptor = "I")
    public static int field2480;

    @OriginalMember(owner = "client!at", name = "C", descriptor = "I")
    public static int field2485;

    @OriginalMember(owner = "client!at", name = "E", descriptor = "I")
    public static int field2487;

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(IIZI)I", line = 4)
    public static final int method1116(int arg0, int arg1, boolean arg2, int arg3) {
        ++field2485;
        int var4 = arg3 / arg1;
        int var5 = arg3 & arg1 - 1;
        int var6 = arg0 / arg1;
        int var7 = arg1 + -1 & arg0;
        int var8 = class56.method473(var4, (byte) -108, var6);
        int var9 = class56.method473(var4 + 1, (byte) -108, var6);
        if (arg2) {
            method1116(20, 78, false, -128);
        }
        int var10 = class56.method473(var4, (byte) -108, var6 - -1);
        int var11 = class56.method473(var4 + 1, (byte) -108, var6 + 1);
        int var12 = class370.method2213((byte) 116, var8, arg1, var9, var5);
        int var13 = class370.method2213((byte) 121, var10, arg1, var11, var5);
        return class370.method2213((byte) -13, var12, arg1, var13, var7);
    }

    @OriginalMember(owner = "client!at", name = "b", descriptor = "(II)V", line = 37)
    public static final void method1117(int arg0, int arg1) {
        class440.field6371 = 3;
        ++field2487;
        class277.field3924 = arg1;
        class106.field1751 = 100;
        class530.field7820 = arg0;
    }

    @OriginalMember(owner = "client!at", name = "k", descriptor = "(I)V", line = 48)
    public void method1096(int arg0) {
        int var2 = 69 % ((-63 - arg0) / 51);
        ++field2475;
    }

    @OriginalMember(owner = "client!at", name = "f", descriptor = "(I)Z", line = 61)
    public final boolean method588(int arg0) {
        if (arg0 != 0) {
            this.field2483 = -77;
        }
        ++field2477;
        return class215.method1456(this.field2483, super.field3163, this.method626(-32768), this.field2484, this.field2486, this.field2481, 19100);
    }

    @OriginalMember(owner = "client!at", name = "b", descriptor = "(B)Z", line = 74)
    public final boolean method587(byte arg0) {
        ++field2480;
        if (arg0 > -22) {
            field2488 = -127;
        }
        for (int var2 = this.field2481; ~var2 >= ~this.field2483; ++var2) {
            for (int var3 = this.field2484; ~this.field2486 <= ~var3; ++var3) {
                int var4 = class668.field9389 + var2 - class371.field5135;
                if (var4 >= 0 && class678.field9661.length > var4) {
                    int var5 = var3 - (-class668.field9389 + class22.field303);
                    if (~var5 <= -1 && var5 < class678.field9661.length && class678.field9661[var4][var5]) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!at", name = "<init>", descriptor = "(IIIIIIIIIZB)V", line = 118)
    public class144(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, byte arg10) {
        this.field2481 = (short) arg5;
        super.field3163 = (byte) arg1;
        this.field2484 = (short) arg7;
        this.field2486 = (short) arg8;
        super.field3154 = arg4;
        this.field2482 = arg9;
        super.field3155 = arg2;
        this.field2479 = arg10;
        super.field3158 = (byte) arg0;
        super.field3160 = arg3;
        this.field2483 = (short) arg6;
    }

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(I[Lam;)I", line = 137)
    public final int method591(int arg0, class289[] arg1) {
        ++field2478;
        int var3 = 0;
        label114: for (int var4 = this.field2481; ~var4 >= ~this.field2483; ++var4) {
            label112: for (int var5 = this.field2484; this.field2486 >= var5; ++var5) {
                long var6 = class155.field2554[super.field3158][var4][var5];
                long var8 = 0L;
                while (true) {
                    label107: while (true) {
                        if (var8 > 48L) {
                            continue label112;
                        }
                        int var10 = (int) (var6 >>> (int) var8 & 65535L);
                        if (var10 <= 0) {
                            continue label112;
                        }
                        class8 var11 = class126.field2067[var10 + -1];
                        for (int var12 = 0; ~var3 < ~var12; ++var12) {
                            if (arg1[var12] == var11.field90) {
                                var8 += 16L;
                                continue label107;
                            }
                        }
                        arg1[var3++] = var11.field90;
                        if (~var3 == -5) {
                            break label114;
                        }
                        var8 += 16L;
                    }
                }
            }
        }
        for (int var13 = var3; var13 < 4; ++var13) {
            arg1[var13] = null;
        }
        if (~this.field2479 != arg0) {
            int var14 = -class371.field5135 + this.field2481;
            int var15 = this.field2484 - class22.field303;
            int var16;
            short var17;
            short var18;
            int var19;
            if (~this.field2479 == -2) {
                if (~var15 >= ~var14) {
                    var16 = this.field2481 - 1;
                    var17 = this.field2481;
                    var18 = this.field2484;
                    var19 = this.field2484 - -1;
                } else {
                    var19 = this.field2484 + -1;
                    var17 = this.field2481;
                    var18 = this.field2484;
                    var16 = this.field2481 - -1;
                }
            } else if (-var14 < var15) {
                var16 = this.field2481 + -1;
                var18 = this.field2484;
                var17 = this.field2481;
                var19 = this.field2484 + -1;
            } else {
                var19 = this.field2484 + 1;
                var18 = this.field2484;
                var16 = this.field2481 + 1;
                var17 = this.field2481;
            }
            label78: for (int var20 = 0; ~var20 > ~var3; ++var20) {
                long var21 = class155.field2554[super.field3158][var17][var19];
                while (~var21 != -1L) {
                    class8 var27 = class126.field2067[(int) ((var21 & 65535L) + -1L)];
                    var21 >>>= 16;
                    if (arg1[var20] == var27.field90) {
                        continue label78;
                    }
                }
                long var23 = class155.field2554[super.field3158][var16][var18];
                while (var23 != 0L) {
                    class8 var26 = class126.field2067[(int) ((65535L & var23) + -1L)];
                    var23 >>>= 16;
                    if (arg1[var20] == var26.field90) {
                        continue label78;
                    }
                }
                for (int var25 = var20; var3 + -1 > var25; ++var25) {
                    arg1[var25] = arg1[var25 - -1];
                }
                --var3;
            }
        }
        return var3;
    }
}
