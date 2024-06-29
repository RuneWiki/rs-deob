import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fe")
public abstract class class597 extends class543 {

    @OriginalMember(owner = "client!fe", name = "z", descriptor = "Z")
    public boolean field8366;

    @OriginalMember(owner = "client!fe", name = "y", descriptor = "S")
    public short field8365;

    @OriginalMember(owner = "client!fe", name = "G", descriptor = "B")
    public byte field8373;

    @OriginalMember(owner = "client!fe", name = "C", descriptor = "S")
    public short field8369;

    @OriginalMember(owner = "client!fe", name = "B", descriptor = "S")
    public short field8368;

    @OriginalMember(owner = "client!fe", name = "F", descriptor = "S")
    public short field8372;

    @OriginalMember(owner = "client!fe", name = "x", descriptor = "I")
    public static int field8364;

    @OriginalMember(owner = "client!fe", name = "A", descriptor = "I")
    public static int field8367;

    @OriginalMember(owner = "client!fe", name = "D", descriptor = "I")
    public static int field8370;

    @OriginalMember(owner = "client!fe", name = "E", descriptor = "I")
    public static int field8371;

    @OriginalMember(owner = "client!fe", name = "H", descriptor = "I")
    public static int field8374;

    @OriginalMember(owner = "client!fe", name = "I", descriptor = "I")
    public static int field8375;

    @OriginalMember(owner = "client!fe", name = "f", descriptor = "(I)Z", line = 11)
    public final boolean method2263(int arg0) {
        ++field8374;
        for (int var2 = this.field8368; this.field8372 >= var2; ++var2) {
            for (int var3 = this.field8369; ~this.field8365 <= ~var3; ++var3) {
                int var4 = -class434.field5912 + class389.field5342 + var2;
                if (~var4 <= -1 && ~class641.field8883.length < ~var4) {
                    int var5 = var3 - (-class389.field5342 + class111.field1920);
                    if (var5 >= 0 && class641.field8883.length > var5 && class641.field8883[var4][var5]) {
                        return true;
                    }
                }
            }
        }
        if (arg0 != -2) {
            this.field8366 = true;
        }
        return false;
    }

    @OriginalMember(owner = "client!fe", name = "e", descriptor = "(B)V", line = 51)
    public static final void method3398(byte arg0) {
        ++field8364;
        if (class426.field5815 != null) {
            if (arg0 == -101) {
                class426.field5815 = null;
                class735.method4081(class396.field5471, class429.field5856, class119.field2183, class424.field5808, (byte) 64);
            }
        }
    }

    @OriginalMember(owner = "client!fe", name = "<init>", descriptor = "(IIIIIIIIIZB)V", line = 69)
    public class597(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, byte arg10) {
        this.field8366 = arg9;
        this.field8365 = (short) arg8;
        super.field7391 = (byte) arg0;
        super.field7404 = (byte) arg1;
        this.field8373 = arg10;
        super.field7396 = arg2;
        this.field8369 = (short) arg7;
        this.field8368 = (short) arg5;
        super.field7405 = arg3;
        super.field7398 = arg4;
        this.field8372 = (short) arg6;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(IIIB)I", line = 87)
    public static final int method3399(int arg0, int arg1, int arg2, byte arg3) {
        ++field8367;
        if ((8 & class554.field7832[arg2][arg1][arg0]) != 0) {
            return 0;
        } else if (arg2 > 0 && (class554.field7832[1][arg1][arg0] & 2) != 0) {
            return arg2 + -1;
        } else {
            if (arg3 > -70) {
                method3399(23, -124, -120, (byte) -77);
            }
            return arg2;
        }
    }

    @OriginalMember(owner = "client!fe", name = "f", descriptor = "(B)V", line = 106)
    public void method1283(byte arg0) {
        ++field8370;
        int var2 = 86 % ((arg0 - -17) / 63);
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(ILha;)Z", line = 115)
    public final boolean method2261(int arg0, class66 arg1) {
        ++field8375;
        int var3 = 103 / ((arg0 - 21) / 48);
        return class496.method2843(this.field8369, this.method894(arg1, (byte) -44), super.field7404, this.field8368, 100, this.field8365, this.field8372);
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "([Lbq;Z)I", line = 125)
    public final int method2262(class307[] arg0, boolean arg1) {
        ++field8371;
        int var3 = 0;
        label118: for (int var4 = this.field8368; this.field8372 >= var4; ++var4) {
            label116: for (int var5 = this.field8369; this.field8365 >= var5; ++var5) {
                long var6 = class227.field3295[super.field7391][var4][var5];
                long var8 = 0L;
                while (true) {
                    label111: while (true) {
                        if (var8 > 48L) {
                            continue label116;
                        }
                        int var10 = (int) (var6 >>> (int) var8 & 65535L);
                        if (var10 <= 0) {
                            continue label116;
                        }
                        class199 var11 = class98.field1601[var10 + -1];
                        for (int var12 = 0; var3 > var12; ++var12) {
                            if (arg0[var12] == var11.field3001) {
                                var8 += 16L;
                                continue label111;
                            }
                        }
                        arg0[var3++] = var11.field3001;
                        if (var3 == 4) {
                            break label118;
                        }
                        var8 += 16L;
                    }
                }
            }
        }
        if (arg1) {
            return 38;
        } else {
            for (int var13 = var3; var13 < 4; ++var13) {
                arg0[var13] = null;
            }
            if (this.field8373 != 0) {
                int var14 = this.field8368 - class434.field5912;
                int var15 = -class111.field1920 + this.field8369;
                short var16;
                int var17;
                int var18;
                short var19;
                if (~this.field8373 == -2) {
                    if (var14 >= var15) {
                        var16 = this.field8369;
                        var17 = this.field8369 + 1;
                        var18 = this.field8368 - 1;
                        var19 = this.field8368;
                    } else {
                        var17 = this.field8369 + -1;
                        var19 = this.field8368;
                        var18 = this.field8368 + 1;
                        var16 = this.field8369;
                    }
                } else if (-var14 >= var15) {
                    var19 = this.field8368;
                    var17 = this.field8369 + 1;
                    var18 = this.field8368 + 1;
                    var16 = this.field8369;
                } else {
                    var17 = this.field8369 + -1;
                    var18 = this.field8368 + -1;
                    var19 = this.field8368;
                    var16 = this.field8369;
                }
                label82: for (int var20 = 0; var3 > var20; ++var20) {
                    long var21 = class227.field3295[super.field7391][var19][var17];
                    while (~var21 != -1L) {
                        class199 var27 = class98.field1601[(int) ((var21 & 65535L) + -1L)];
                        var21 >>>= 16;
                        if (arg0[var20] == var27.field3001) {
                            continue label82;
                        }
                    }
                    long var23 = class227.field3295[super.field7391][var18][var16];
                    while (~var23 != -1L) {
                        class199 var26 = class98.field1601[(int) ((var23 & 65535L) - 1L)];
                        var23 >>>= 16;
                        if (arg0[var20] == var26.field3001) {
                            continue label82;
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
    }
}
