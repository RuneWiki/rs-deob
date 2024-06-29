import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rq")
public abstract class class451 extends class410 {

    @OriginalMember(owner = "client!rq", name = "G", descriptor = "S")
    public short field6328;

    @OriginalMember(owner = "client!rq", name = "A", descriptor = "S")
    public short field6322;

    @OriginalMember(owner = "client!rq", name = "B", descriptor = "B")
    public byte field6323;

    @OriginalMember(owner = "client!rq", name = "H", descriptor = "Z")
    public boolean field6329;

    @OriginalMember(owner = "client!rq", name = "C", descriptor = "S")
    public short field6324;

    @OriginalMember(owner = "client!rq", name = "z", descriptor = "S")
    public short field6321;

    @OriginalMember(owner = "client!rq", name = "D", descriptor = "I")
    public static int field6325;

    @OriginalMember(owner = "client!rq", name = "E", descriptor = "I")
    public static int field6326;

    @OriginalMember(owner = "client!rq", name = "F", descriptor = "I")
    public static int field6327;

    @OriginalMember(owner = "client!rq", name = "I", descriptor = "I")
    public static int field6330;

    @OriginalMember(owner = "client!rq", name = "i", descriptor = "(I)Z", line = 8)
    public final boolean method936(int arg0) {
        ++field6330;
        if (arg0 >= -85) {
            return true;
        } else {
            for (int var2 = this.field6321; ~var2 >= ~this.field6322; ++var2) {
                for (int var3 = this.field6328; ~var3 >= ~this.field6324; ++var3) {
                    int var4 = -class337.field4349 + var2 - -class267.field3381;
                    if (~var4 <= -1 && class376.field5266.length > var4) {
                        int var5 = -class561.field7852 + var3 + class267.field3381;
                        if (~var5 <= -1 && ~var5 > ~class376.field5266.length && class376.field5266[var4][var5]) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(I[Lpk;)I", line = 52)
    public final int method933(int arg0, class621[] arg1) {
        ++field6327;
        int var3 = 0;
        int var4 = this.field6321;
        if (arg0 != 16) {
            return -118;
        } else {
            label116: while (var4 <= this.field6322) {
                label114: for (int var5 = this.field6328; var5 <= this.field6324; ++var5) {
                    long var6 = class374.field5261[super.field5779][var4][var5];
                    long var8 = 0L;
                    while (true) {
                        label109: while (true) {
                            if (var8 > 48L) {
                                continue label114;
                            }
                            int var10 = (int) (65535L & var6 >>> (int) var8);
                            if (~var10 >= -1) {
                                continue label114;
                            }
                            class615 var11 = class708.field9968[var10 - 1];
                            for (int var12 = 0; ~var3 < ~var12; ++var12) {
                                if (arg1[var12] == var11.field8615) {
                                    var8 += 16L;
                                    continue label109;
                                }
                            }
                            arg1[var3++] = var11.field8615;
                            if (var3 == 4) {
                                break label116;
                            }
                            var8 += 16L;
                        }
                    }
                }
                ++var4;
            }
            for (int var13 = var3; var13 < 4; ++var13) {
                arg1[var13] = null;
            }
            if (~this.field6323 != -1) {
                int var14 = -class337.field4349 + this.field6321;
                int var15 = -class561.field7852 + this.field6328;
                int var16;
                short var17;
                short var18;
                int var19;
                if (this.field6323 == 1) {
                    if (var15 <= var14) {
                        var16 = this.field6321 - 1;
                        var17 = this.field6321;
                        var18 = this.field6328;
                        var19 = this.field6328 + 1;
                    } else {
                        var19 = this.field6328 + -1;
                        var17 = this.field6321;
                        var18 = this.field6328;
                        var16 = this.field6321 - -1;
                    }
                } else if (-var14 < var15) {
                    var19 = this.field6328 + -1;
                    var17 = this.field6321;
                    var16 = this.field6321 + -1;
                    var18 = this.field6328;
                } else {
                    var19 = this.field6328 + 1;
                    var18 = this.field6328;
                    var17 = this.field6321;
                    var16 = this.field6321 + 1;
                }
                label80: for (int var20 = 0; var3 > var20; ++var20) {
                    long var21 = class374.field5261[super.field5779][var17][var19];
                    while (~var21 != -1L) {
                        class615 var27 = class708.field9968[(int) ((65535L & var21) + -1L)];
                        var21 >>>= 16;
                        if (arg1[var20] == var27.field8615) {
                            continue label80;
                        }
                    }
                    long var23 = class374.field5261[super.field5779][var16][var18];
                    while (~var23 != -1L) {
                        class615 var26 = class708.field9968[(int) ((65535L & var23) + -1L)];
                        var23 >>>= 16;
                        if (arg1[var20] == var26.field8615) {
                            continue label80;
                        }
                    }
                    for (int var25 = var20; ~(var3 + -1) < ~var25; ++var25) {
                        arg1[var25] = arg1[var25 + 1];
                    }
                    --var3;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!rq", name = "g", descriptor = "(B)V", line = 227)
    public void method246(byte arg0) {
        ++field6326;
        if (arg0 <= 120) {
            this.field6321 = -127;
        }
    }

    @OriginalMember(owner = "client!rq", name = "b", descriptor = "(ILha;)Z", line = 237)
    public final boolean method935(int arg0, class454 arg1) {
        if (arg0 <= 64) {
            this.method935(-17, (class454) null);
        }
        ++field6325;
        return class541.method3077(this.field6324, this.field6328, this.field6321, true, this.field6322, super.field5792, this.method520(arg1, (byte) 126));
    }

    @OriginalMember(owner = "client!rq", name = "<init>", descriptor = "(IIIIIIIIIZB)V", line = 249)
    public class451(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, byte arg10) {
        super.field5791 = arg3;
        this.field6328 = (short) arg7;
        this.field6322 = (short) arg6;
        this.field6323 = arg10;
        super.field5779 = (byte) arg0;
        super.field5792 = (byte) arg1;
        super.field5784 = arg4;
        this.field6329 = arg9;
        super.field5790 = arg2;
        this.field6324 = (short) arg8;
        this.field6321 = (short) arg5;
    }
}
