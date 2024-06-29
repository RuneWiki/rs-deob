import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gs")
public abstract class class743 extends class674 {

    @OriginalMember(owner = "client!gs", name = "M", descriptor = "Z")
    public boolean field10360;

    @OriginalMember(owner = "client!gs", name = "B", descriptor = "S")
    public short field10352;

    @OriginalMember(owner = "client!gs", name = "R", descriptor = "S")
    public short field10365;

    @OriginalMember(owner = "client!gs", name = "N", descriptor = "B")
    public byte field10361;

    @OriginalMember(owner = "client!gs", name = "I", descriptor = "S")
    public short field10357;

    @OriginalMember(owner = "client!gs", name = "C", descriptor = "S")
    public short field10353;

    @OriginalMember(owner = "client!gs", name = "O", descriptor = "[B")
    public static byte[] field10362 = new byte[520];

    @OriginalMember(owner = "client!gs", name = "G", descriptor = "I")
    public static int field10356 = 1405;

    @OriginalMember(owner = "client!gs", name = "A", descriptor = "F")
    public static float field10351;

    @OriginalMember(owner = "client!gs", name = "y", descriptor = "I")
    public static int field10349;

    @OriginalMember(owner = "client!gs", name = "z", descriptor = "I")
    public static int field10350;

    @OriginalMember(owner = "client!gs", name = "K", descriptor = "I")
    public static int field10358;

    @OriginalMember(owner = "client!gs", name = "L", descriptor = "I")
    public static int field10359;

    @OriginalMember(owner = "client!gs", name = "P", descriptor = "I")
    public static int field10363;

    @OriginalMember(owner = "client!gs", name = "Q", descriptor = "I")
    public static int field10364;

    @OriginalMember(owner = "client!gs", name = "D", descriptor = "Lda;")
    public static class400 field10354;

    @OriginalMember(owner = "client!gs", name = "F", descriptor = "Lwu;")
    public static class557 field10355;

    @OriginalMember(owner = "client!gs", name = "b", descriptor = "(Z)Z")
    public final boolean method342(boolean arg0) {
        ++field10350;
        if (arg0) {
            this.field10360 = false;
        }
        for (int var2 = this.field10352; var2 <= this.field10365; ++var2) {
            for (int var3 = this.field10357; ~var3 >= ~this.field10353; ++var3) {
                int var4 = -class126.field1717 - -class707.field9874 + var2;
                if (~var4 <= -1 && class359.field4594.length > var4) {
                    int var5 = -class157.field2139 + class707.field9874 + var3;
                    if (~var5 <= -1 && ~var5 > ~class359.field4594.length && class359.field4594[var4][var5]) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!gs", name = "f", descriptor = "(B)V")
    public static void method4143(byte arg0) {
        field10354 = null;
        field10355 = null;
        int var1 = -43 / ((arg0 - -20) / 53);
        field10362 = null;
    }

    @OriginalMember(owner = "client!gs", name = "i", descriptor = "(I)Z")
    public final boolean method339(int arg0) {
        ++field10358;
        return arg0 != 32188 ? false : class701.method3953(this.field10357, this.method268(-1), super.field9495, this.field10353, this.field10352, -82, this.field10365);
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(I[Lkb;)I")
    public final int method344(int arg0, class757[] arg1) {
        ++field10364;
        int var3 = 0;
        label114: for (int var4 = this.field10352; this.field10365 >= var4; ++var4) {
            label112: for (int var5 = this.field10357; var5 <= this.field10353; ++var5) {
                long var6 = class706.field9852[super.field9501][var4][var5];
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
                        class519 var11 = class146.field2026[var10 - 1];
                        for (int var12 = 0; ~var3 < ~var12; ++var12) {
                            if (arg1[var12] == var11.field7244) {
                                var8 += 16L;
                                continue label107;
                            }
                        }
                        arg1[var3++] = var11.field7244;
                        if (var3 == 4) {
                            break label114;
                        }
                        var8 += 16L;
                    }
                }
            }
        }
        int var13 = 127 / ((arg0 - 35) / 58);
        for (int var14 = var3; ~var14 > -5; ++var14) {
            arg1[var14] = null;
        }
        if (this.field10361 != 0) {
            int var15 = -class126.field1717 + this.field10352;
            int var16 = -class157.field2139 + this.field10357;
            int var17;
            short var18;
            int var19;
            short var20;
            if (~this.field10361 == -2) {
                if (~var16 < ~var15) {
                    var17 = this.field10352 + 1;
                    var18 = this.field10357;
                    var19 = this.field10357 - 1;
                    var20 = this.field10352;
                } else {
                    var19 = this.field10357 + 1;
                    var17 = this.field10352 + -1;
                    var20 = this.field10352;
                    var18 = this.field10357;
                }
            } else if (~(-var15) > ~var16) {
                var20 = this.field10352;
                var19 = this.field10357 - 1;
                var17 = this.field10352 + -1;
                var18 = this.field10357;
            } else {
                var20 = this.field10352;
                var18 = this.field10357;
                var17 = this.field10352 + 1;
                var19 = this.field10357 + 1;
            }
            label78: for (int var21 = 0; ~var21 > ~var3; ++var21) {
                long var22 = class706.field9852[super.field9501][var20][var19];
                while (~var22 != -1L) {
                    class519 var28 = class146.field2026[(int) ((var22 & 65535L) + -1L)];
                    var22 >>>= 16;
                    if (arg1[var21] == var28.field7244) {
                        continue label78;
                    }
                }
                long var24 = class706.field9852[super.field9501][var17][var18];
                while (var24 != 0L) {
                    class519 var27 = class146.field2026[(int) ((65535L & var24) + -1L)];
                    var24 >>>= 16;
                    if (arg1[var21] == var27.field7244) {
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

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(II)I")
    public static final int method4144(int arg0, int arg1) {
        ++field10349;
        if (~arg0 != -6408 && ~arg0 != -34844 && ~arg0 != -34838) {
            if (~arg0 != -6409 && arg0 != 34842 && arg0 != 34836) {
                if (arg0 != 6406 && arg0 != 34844) {
                    if (arg0 != 6409 && ~arg0 != -34847) {
                        if (arg0 != arg1 && arg0 != 34847) {
                            if (arg0 == 6402) {
                                return 6402;
                            } else {
                                throw new IllegalArgumentException("");
                            }
                        } else {
                            return 6410;
                        }
                    } else {
                        return 6409;
                    }
                } else {
                    return 6406;
                }
            } else {
                return 6408;
            }
        } else {
            return 6407;
        }
    }

    @OriginalMember(owner = "client!gs", name = "c", descriptor = "(Z)V")
    public void method3480(boolean arg0) {
        if (!arg0) {
            ++field10363;
        }
    }

    @OriginalMember(owner = "client!gs", name = "<init>", descriptor = "(IIIIIIIIIZB)V")
    public class743(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, byte arg10) {
        super.field9489 = arg4;
        this.field10360 = arg9;
        this.field10352 = (short) arg5;
        this.field10365 = (short) arg6;
        super.field9501 = (byte) arg0;
        this.field10361 = arg10;
        this.field10357 = (short) arg7;
        super.field9502 = arg3;
        this.field10353 = (short) arg8;
        super.field9490 = arg2;
        super.field9495 = (byte) arg1;
    }
}
