import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pg")
public class class273 extends class34 {

    @OriginalMember(owner = "client!pg", name = "P", descriptor = "I")
    private int field4227 = 4;

    @OriginalMember(owner = "client!pg", name = "W", descriptor = "I")
    private int field4234 = 4;

    @OriginalMember(owner = "client!pg", name = "Q", descriptor = "I")
    public static int field4228;

    @OriginalMember(owner = "client!pg", name = "R", descriptor = "I")
    public static int field4229;

    @OriginalMember(owner = "client!pg", name = "S", descriptor = "I")
    public static int field4230;

    @OriginalMember(owner = "client!pg", name = "U", descriptor = "I")
    public static int field4232;

    @OriginalMember(owner = "client!pg", name = "V", descriptor = "I")
    public static int field4233;

    @OriginalMember(owner = "client!pg", name = "T", descriptor = "[[I")
    public static int[][] field4231;

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(BI)[[I")
    public final int[][] method52(byte arg0, int arg1) {
        ++field4233;
        int var3 = -93 / ((-54 - arg0) / 44);
        int[][] var4 = super.field618.method91(41, arg1);
        if (super.field618.field211) {
            int var5 = class226.field3527 / this.field4227;
            int var6 = class259.field3965 / this.field4234;
            int[][] var7;
            if (var6 <= 0) {
                var7 = this.method231(0, (byte) 117, 0);
            } else {
                int var8 = arg1 % var6;
                var7 = this.method231(class259.field3965 * var8 / var6, (byte) 94, 0);
            }
            int[] var9 = var7[0];
            int[] var10 = var7[1];
            int[] var11 = var7[2];
            int[] var12 = var4[0];
            int[] var13 = var4[1];
            int[] var14 = var4[2];
            for (int var15 = 0; ~class226.field3527 < ~var15; ++var15) {
                int var17;
                if (var5 > 0) {
                    int var16 = var15 % var5;
                    var17 = class226.field3527 * var16 / var5;
                } else {
                    var17 = 0;
                }
                var12[var15] = var9[var17];
                var13[var15] = var10[var17];
                var14[var15] = var11[var17];
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!pg", name = "c", descriptor = "(II)[I")
    public final int[] method43(int arg0, int arg1) {
        ++field4230;
        if (arg0 < 75) {
            method1826(51);
        }
        int[] var3 = super.field610.method228(24856, arg1);
        if (super.field610.field597) {
            int var4 = class259.field3965 / this.field4234;
            int var5 = class226.field3527 / this.field4227;
            int[] var6;
            if (var4 <= 0) {
                var6 = this.method230(0, -15337, 0);
            } else {
                int var7 = arg1 % var4;
                var6 = this.method230(class259.field3965 * var7 / var4, -15337, 0);
            }
            for (int var8 = 0; ~var8 > ~class226.field3527; ++var8) {
                if (~var5 < -1) {
                    int var9 = var8 % var5;
                    var3[var8] = var6[class226.field3527 * var9 / var5];
                } else {
                    var3[var8] = var6[0];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(IIIIII)Z")
    public static final boolean method1825(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 == arg2 && arg3 == arg4) {
            if (!class179.method1179(arg0, arg1, arg3)) {
                return false;
            } else {
                int var6 = arg1 << 7;
                int var7 = arg3 << 7;
                return class7.method66(var6 + 1, class166.field2451[arg0][arg1][arg3] + arg5, var7 + 1) && class7.method66(var6 + 128 - 1, class166.field2451[arg0][arg1 + 1][arg3] + arg5, var7 + 1) && class7.method66(var6 + 128 - 1, class166.field2451[arg0][arg1 + 1][arg3 + 1] + arg5, var7 + 128 - 1) && class7.method66(var6 + 1, class166.field2451[arg0][arg1][arg3 + 1] + arg5, var7 + 128 - 1);
            }
        } else {
            for (int var8 = arg1; var8 <= arg2; ++var8) {
                for (int var14 = arg3; var14 <= arg4; ++var14) {
                    if (class54.field863[arg0][var8][var14] == -class104.field1534) {
                        return false;
                    }
                }
            }
            int var9 = (arg1 << 7) + 1;
            int var10 = (arg3 << 7) + 2;
            int var11 = class166.field2451[arg0][arg1][arg3] + arg5;
            if (!class7.method66(var9, var11, var10)) {
                return false;
            } else {
                int var12 = (arg2 << 7) - 1;
                if (!class7.method66(var12, var11, var10)) {
                    return false;
                } else {
                    int var13 = (arg4 << 7) - 1;
                    if (!class7.method66(var9, var11, var13)) {
                        return false;
                    } else if (!class7.method66(var12, var11, var13)) {
                        return false;
                    } else {
                        return true;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!pg", name = "f", descriptor = "(I)V")
    public static void method1826(int arg0) {
        if (arg0 != 0) {
            field4231 = null;
        }
        field4231 = null;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(Lpk;IBI)Lbk;")
    public static final class46 method1827(class237 arg0, int arg1, byte arg2, int arg3) {
        ++field4232;
        if (!class223.method1526(arg1, arg3, (byte) 112, arg0)) {
            return null;
        } else {
            if (arg2 < 89) {
                method1825(18, 65, 97, -35, -1, 118);
            }
            return class43.method352(31488);
        }
    }

    @OriginalMember(owner = "client!pg", name = "<init>", descriptor = "()V")
    public class273() {
        super(1, false);
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(Ljava/lang/String;B)V")
    public static final void method1828(String arg0, byte arg1) {
        ++field4229;
        if (arg1 != -19) {
            field4231 = null;
        }
        System.out.println("Bad " + arg0 + ", Usage: worldid, <live/rc/wip>, <english/german>, <game0/game1>");
        System.exit(1);
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(IILca;)V")
    public final void method50(int arg0, int arg1, class54 arg2) {
        ++field4228;
        if (~arg1 != -1) {
            if (~arg1 == -2) {
                this.field4234 = arg2.method407(arg0 + 249);
            }
        } else {
            this.field4227 = arg2.method407(arg0 + 249);
        }
        if (arg0 != 6) {
            this.field4227 = -44;
        }
    }
}
