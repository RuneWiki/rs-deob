import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jr")
public class class231 extends class83 {

    @OriginalMember(owner = "client!jr", name = "P", descriptor = "I")
    private int field3182 = 204;

    @OriginalMember(owner = "client!jr", name = "T", descriptor = "I")
    private int field3186 = 1;

    @OriginalMember(owner = "client!jr", name = "U", descriptor = "I")
    private int field3187 = 1;

    @OriginalMember(owner = "client!jr", name = "O", descriptor = "[I")
    public static int[] field3181 = new int[13];

    @OriginalMember(owner = "client!jr", name = "K", descriptor = "I")
    public static int field3177;

    @OriginalMember(owner = "client!jr", name = "L", descriptor = "I")
    public static int field3178;

    @OriginalMember(owner = "client!jr", name = "M", descriptor = "I")
    public static int field3179;

    @OriginalMember(owner = "client!jr", name = "N", descriptor = "I")
    public static int field3180;

    @OriginalMember(owner = "client!jr", name = "Q", descriptor = "I")
    public static int field3183;

    @OriginalMember(owner = "client!jr", name = "R", descriptor = "I")
    public static int field3184;

    @OriginalMember(owner = "client!jr", name = "S", descriptor = "I")
    public static int field3185;

    @OriginalMember(owner = "client!jr", name = "d", descriptor = "(B)V")
    public static void method1253(byte arg0) {
        field3181 = null;
        if (arg0 <= 84) {
            method1254(-54, (byte) 25, -77);
        }
    }

    @OriginalMember(owner = "client!jr", name = "<init>", descriptor = "()V")
    public class231() {
        super(0, true);
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(II)[I")
    public final int[] method37(int arg0, int arg1) {
        ++field3179;
        int[] var3 = super.field916.method1813(arg1, (byte) -1);
        if (arg0 != 2) {
            this.method35(-10, (byte) -13, (class250) null);
        }
        if (super.field916.field4174) {
            for (int var4 = 0; ~class420.field6139 < ~var4; ++var4) {
                int var5 = class402.field5863[var4];
                int var6 = class225.field3036[arg1];
                int var7 = this.field3186 * var5 >> 12;
                int var8 = this.field3187 * var6 >> 12;
                int var9 = var5 % (4096 / this.field3186) * this.field3186;
                int var10 = var6 % (4096 / this.field3187) * this.field3187;
                if (~this.field3182 < ~var10) {
                    for (var7 -= var8; ~var7 > -1; var7 += 4) {
                    }
                    while (~var7 < -4) {
                        var7 -= 4;
                    }
                    if (var7 != 1) {
                        var3[var4] = 0;
                        continue;
                    }
                    if (this.field3182 > var9) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                if (this.field3182 > var9) {
                    int var11;
                    for (var11 = var7 - var8; ~var11 > -1; var11 += 4) {
                    }
                    while (var11 > 3) {
                        var11 -= 4;
                    }
                    if (var11 > 0) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                var3[var4] = 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(IBLtq;)V")
    public final void method35(int arg0, byte arg1, class250 arg2) {
        if (~arg0 != -1) {
            if (~arg0 != -2) {
                if (~arg0 == -3) {
                    this.field3182 = arg2.method1374(-2);
                }
            } else {
                this.field3187 = arg2.method1350(31351);
            }
        } else {
            this.field3186 = arg2.method1350(31351);
        }
        ++field3178;
        int var5 = 86 % ((arg1 - -27) / 50);
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(IBI)I")
    public static final int method1254(int arg0, byte arg1, int arg2) {
        if (arg1 <= 63) {
            method1253((byte) 108);
        }
        ++field3185;
        class367 var3 = (class367) class106.field1305.method308((long) arg2, (byte) 73);
        if (var3 == null) {
            return 0;
        } else {
            return ~arg0 <= -1 && ~arg0 > ~var3.field5137.length ? var3.field5137[arg0] : 0;
        }
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(ZZ)V")
    public static final void method1255(boolean arg0, boolean arg1) {
        ++field3180;
        byte[][] var2;
        byte var3;
        if (arg1) {
            var2 = class297.field4042;
            var3 = 1;
        } else {
            var2 = class105.field1293;
            var3 = 4;
        }
        for (int var4 = 0; var4 < var3; ++var4) {
            class449.method2771(-32);
            for (int var5 = 0; ~(class315.field4214 >> 3) < ~var5; ++var5) {
                for (int var6 = 0; ~(class340.field4549 >> 3) < ~var6; ++var6) {
                    int var7 = class94.field1085[var4][var5][var6];
                    if (var7 != -1) {
                        int var8 = (var7 & 61287480) >> 24;
                        if (!arg1 || ~var8 == -1) {
                            int var9 = 3 & var7 >> 1;
                            int var10 = (16772192 & var7) >> 14;
                            int var11 = (var7 & 16379) >> 3;
                            int var12 = (var10 / 8 << 8) + var11 / 8;
                            for (int var13 = 0; var13 < class138.field1777.length; ++var13) {
                                if (class138.field1777[var13] == var12 && var2[var13] != null) {
                                    class203.method1102((var10 & 7) * 8, (byte) 124, var4, arg1, var2[var13], var8, (var11 & 7) * 8, class88.field1003, var5 * 8, class36.field352, var9, var6 * 8);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        if (arg0) {
            method1253((byte) -3);
        }
    }
}
