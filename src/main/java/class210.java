import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tg")
public abstract class class210 extends class295 {

    @OriginalMember(owner = "client!tg", name = "P", descriptor = "S")
    public short field2973;

    @OriginalMember(owner = "client!tg", name = "F", descriptor = "S")
    public short field2963;

    @OriginalMember(owner = "client!tg", name = "O", descriptor = "S")
    public short field2972;

    @OriginalMember(owner = "client!tg", name = "K", descriptor = "B")
    public byte field2968;

    @OriginalMember(owner = "client!tg", name = "I", descriptor = "Z")
    public boolean field2966;

    @OriginalMember(owner = "client!tg", name = "L", descriptor = "S")
    public short field2969;

    @OriginalMember(owner = "client!tg", name = "H", descriptor = "Llh;")
    public static class487 field2965 = new class487(70, 2);

    @OriginalMember(owner = "client!tg", name = "B", descriptor = "I")
    public static int field2959;

    @OriginalMember(owner = "client!tg", name = "C", descriptor = "I")
    public static int field2960;

    @OriginalMember(owner = "client!tg", name = "D", descriptor = "I")
    public static int field2961;

    @OriginalMember(owner = "client!tg", name = "E", descriptor = "I")
    public static int field2962;

    @OriginalMember(owner = "client!tg", name = "G", descriptor = "I")
    public static int field2964;

    @OriginalMember(owner = "client!tg", name = "J", descriptor = "I")
    public static int field2967;

    @OriginalMember(owner = "client!tg", name = "N", descriptor = "I")
    public static int field2971;

    @OriginalMember(owner = "client!tg", name = "M", descriptor = "[Z")
    public static boolean[] field2970;

    @OriginalMember(owner = "client!tg", name = "f", descriptor = "(B)Z")
    public final boolean method1322(byte arg0) {
        if (arg0 != -54) {
            return true;
        } else {
            ++field2967;
            return class622.method3455(this.method217(arg0 ^ -72), super.field4050, this.field2972, this.field2963, this.field2969, this.field2973, arg0 ^ -53);
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "([Ltw;I)I")
    public final int method1323(class186[] arg0, int arg1) {
        ++field2959;
        int var3 = 0;
        label116: for (int var4 = this.field2972; ~var4 >= ~this.field2973; ++var4) {
            label114: for (int var5 = this.field2963; this.field2969 >= var5; ++var5) {
                long var6 = class508.field6965[super.field4053][var4][var5];
                long var8 = 0L;
                while (true) {
                    label109: while (true) {
                        if (var8 > 48L) {
                            continue label114;
                        }
                        int var10 = (int) (var6 >>> (int) var8 & 65535L);
                        if (~var10 >= -1) {
                            continue label114;
                        }
                        class130 var11 = class334.field4501[var10 + -1];
                        for (int var12 = 0; var12 < var3; ++var12) {
                            if (arg0[var12] == var11.field1852) {
                                var8 += 16L;
                                continue label109;
                            }
                        }
                        arg0[var3++] = var11.field1852;
                        if (~var3 == -5) {
                            break label116;
                        }
                        var8 += 16L;
                    }
                }
            }
        }
        int var13 = var3;
        if (arg1 <= 69) {
            field2970 = null;
        }
        while (var13 < 4) {
            arg0[var13] = null;
            ++var13;
        }
        if (this.field2968 != 0) {
            int var14 = -class167.field2435 + this.field2972;
            int var15 = -class353.field4699 + this.field2963;
            short var16;
            int var17;
            int var18;
            short var19;
            if (~this.field2968 != -2) {
                if (-var14 >= var15) {
                    var16 = this.field2963;
                    var17 = this.field2972 + 1;
                    var18 = this.field2963 + 1;
                    var19 = this.field2972;
                } else {
                    var16 = this.field2963;
                    var17 = this.field2972 + -1;
                    var19 = this.field2972;
                    var18 = this.field2963 - 1;
                }
            } else if (~var15 < ~var14) {
                var19 = this.field2972;
                var17 = this.field2972 + 1;
                var16 = this.field2963;
                var18 = this.field2963 + -1;
            } else {
                var19 = this.field2972;
                var18 = this.field2963 + 1;
                var17 = this.field2972 - 1;
                var16 = this.field2963;
            }
            label80: for (int var20 = 0; ~var20 > ~var3; ++var20) {
                long var21 = class508.field6965[super.field4053][var19][var18];
                while (~var21 != -1L) {
                    class130 var27 = class334.field4501[(int) ((65535L & var21) - 1L)];
                    var21 >>>= 16;
                    if (arg0[var20] == var27.field1852) {
                        continue label80;
                    }
                }
                long var23 = class508.field6965[super.field4053][var17][var16];
                while (var23 != 0L) {
                    class130 var26 = class334.field4501[(int) ((var23 & 65535L) + -1L)];
                    var23 >>>= 16;
                    if (arg0[var20] == var26.field1852) {
                        continue label80;
                    }
                }
                for (int var25 = var20; ~var25 > ~(var3 + -1); ++var25) {
                    arg0[var25] = arg0[var25 + 1];
                }
                --var3;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!tg", name = "g", descriptor = "(B)V")
    public void method893(byte arg0) {
        if (arg0 <= -115) {
            ++field2961;
        }
    }

    @OriginalMember(owner = "client!tg", name = "h", descriptor = "(B)V")
    public static void method1358(byte arg0) {
        field2965 = null;
        field2970 = null;
        int var1 = 82 % ((arg0 - 36) / 60);
    }

    @OriginalMember(owner = "client!tg", name = "h", descriptor = "(I)Z")
    public final boolean method1324(int arg0) {
        ++field2960;
        int var2 = this.field2972;
        if (arg0 >= -104) {
            field2970 = null;
        }
        while (var2 <= this.field2973) {
            for (int var3 = this.field2963; ~this.field2969 <= ~var3; ++var3) {
                int var4 = -class167.field2435 + class36.field428 + var2;
                if (~var4 <= -1 && ~var4 > ~class147.field2093.length) {
                    int var5 = -class353.field4699 + class36.field428 + var3;
                    if (~var5 <= -1 && ~class147.field2093.length < ~var5 && class147.field2093[var4][var5]) {
                        return true;
                    }
                }
            }
            ++var2;
        }
        return false;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(BLjava/io/File;I)[B")
    public static final byte[] method1359(byte arg0, File arg1, int arg2) {
        ++field2964;
        int var3 = -62 % ((arg0 - 65) / 51);
        try {
            byte[] var4 = new byte[arg2];
            class474.method2677(arg2, (byte) -92, arg1, var4);
            return var4;
        } catch (IOException var5) {
            return null;
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(ILla;Lvn;ILua;Lin;IIILjava/lang/String;IB)V")
    public static final void method1360(int arg0, class417 arg1, class283 arg2, int arg3, class618 arg4, class78 arg5, int arg6, int arg7, int arg8, String arg9, int arg10, byte arg11) {
        ++field2962;
        int var12;
        if (~class203.field2863 != -5) {
            var12 = 16383 & (int) class705.field9964 + class174.field2526;
        } else {
            var12 = (int) class705.field9964 & 16383;
        }
        int var13 = Math.max(arg5.field1104 / 2, arg5.field1050 / 2) + 10;
        int var14 = arg7 * arg7 - -(arg8 * arg8);
        if (~(var13 * var13) <= ~var14) {
            int var15 = class597.field8342[var12];
            int var16 = class597.field8344[var12];
            int var17 = -2 / ((40 - arg11) / 33);
            if (~class203.field2863 != -5) {
                var15 = var15 * 256 / (class216.field3062 + 256);
                var16 = var16 * 256 / (class216.field3062 + 256);
            }
            int var18 = arg8 * var15 - -(arg7 * var16) >> 14;
            int var19 = arg8 * var16 + -(arg7 * var15) >> 14;
            int var20 = arg2.method1738((byte) 97, 100, arg9, (class702[]) null);
            int var21 = var18 - var20 / 2;
            int var22 = arg2.method1734((byte) -96, (class702[]) null, 0, arg9, 100);
            if (-arg5.field1104 <= var21 && arg5.field1104 >= var21 && ~var19 <= ~(-arg5.field1050) && var19 <= arg5.field1050) {
                arg1.method2427(0, arg3, arg4, arg6, -var19 + arg6 - -(arg5.field1050 / 2) + -arg0 + -var22, 0, (int[]) null, arg10, 1, arg5.field1104 / 2 + arg3 + var21, var20, (byte) 111, 0, 50, arg9, (class702[]) null);
            }
        }
    }

    @OriginalMember(owner = "client!tg", name = "<init>", descriptor = "(IIIIIIIIIZB)V")
    public class210(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, byte arg10) {
        this.field2973 = (short) arg6;
        this.field2963 = (short) arg7;
        super.field4053 = (byte) arg0;
        this.field2972 = (short) arg5;
        super.field4052 = arg3;
        super.field4042 = arg2;
        super.field4050 = (byte) arg1;
        this.field2968 = arg10;
        super.field4047 = arg4;
        this.field2966 = arg9;
        this.field2969 = (short) arg8;
    }
}
