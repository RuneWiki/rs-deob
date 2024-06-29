import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ba")
public class class279 extends class273 {

    @OriginalMember(owner = "client!ba", name = "L", descriptor = "I")
    private int field4418 = 2048;

    @OriginalMember(owner = "client!ba", name = "Z", descriptor = "I")
    private int field4432 = 0;

    @OriginalMember(owner = "client!ba", name = "cb", descriptor = "I")
    private int field4435 = 10;

    @OriginalMember(owner = "client!ba", name = "O", descriptor = "I")
    public static int field4421 = -1;

    @OriginalMember(owner = "client!ba", name = "W", descriptor = "Ljava/lang/String;")
    public static String field4429 = "Loaded input handler";

    @OriginalMember(owner = "client!ba", name = "X", descriptor = "I")
    public static int field4430 = -1;

    @OriginalMember(owner = "client!ba", name = "Y", descriptor = "[I")
    public static int[] field4431 = new int[2048];

    @OriginalMember(owner = "client!ba", name = "bb", descriptor = "Z")
    public static boolean field4434 = false;

    @OriginalMember(owner = "client!ba", name = "eb", descriptor = "Z")
    public static boolean field4437 = false;

    @OriginalMember(owner = "client!ba", name = "J", descriptor = "I")
    public static int field4416;

    @OriginalMember(owner = "client!ba", name = "M", descriptor = "I")
    public static int field4419;

    @OriginalMember(owner = "client!ba", name = "P", descriptor = "I")
    public static int field4422;

    @OriginalMember(owner = "client!ba", name = "R", descriptor = "I")
    public static int field4424;

    @OriginalMember(owner = "client!ba", name = "S", descriptor = "I")
    public static int field4425;

    @OriginalMember(owner = "client!ba", name = "T", descriptor = "I")
    public static int field4426;

    @OriginalMember(owner = "client!ba", name = "U", descriptor = "I")
    public static int field4427;

    @OriginalMember(owner = "client!ba", name = "V", descriptor = "I")
    public static int field4428;

    @OriginalMember(owner = "client!ba", name = "ab", descriptor = "I")
    public static int field4433;

    @OriginalMember(owner = "client!ba", name = "db", descriptor = "I")
    public static int field4436;

    @OriginalMember(owner = "client!ba", name = "Q", descriptor = "Lsb;")
    public static class124 field4423;

    @OriginalMember(owner = "client!ba", name = "K", descriptor = "[I")
    private int[] field4417;

    @OriginalMember(owner = "client!ba", name = "N", descriptor = "[I")
    private int[] field4420;

    @OriginalMember(owner = "client!ba", name = "<init>", descriptor = "()V")
    public class279() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "(III)Z")
    public static final boolean method1873(int arg0, int arg1, int arg2) {
        int var3 = class76.field1253[arg0][arg1][arg2];
        if (-class139.field2326 == var3) {
            return false;
        } else if (class139.field2326 == var3) {
            return true;
        } else {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            if (class285.method1912(var4 + 1, class21.field327[arg0][arg1][arg2], var5 + 1) && class285.method1912(var4 + 128 - 1, class21.field327[arg0][arg1 + 1][arg2], var5 + 1) && class285.method1912(var4 + 128 - 1, class21.field327[arg0][arg1 + 1][arg2 + 1], var5 + 128 - 1) && class285.method1912(var4 + 1, class21.field327[arg0][arg1][arg2 + 1], var5 + 128 - 1)) {
                class76.field1253[arg0][arg1][arg2] = class139.field2326;
                return true;
            } else {
                class76.field1253[arg0][arg1][arg2] = -class139.field2326;
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(ZI)[I")
    public final int[] method4(boolean arg0, int arg1) {
        ++field4433;
        if (arg0) {
            return null;
        } else {
            int[] var3 = super.field4359.method387((byte) 111, arg1);
            if (super.field4359.field833) {
                int var4 = class255.field4068[arg1];
                if (~this.field4432 != -1) {
                    for (int var5 = 0; var5 < class26.field458; ++var5) {
                        short var6 = 0;
                        int var7 = 0;
                        int var8 = class265.field4234[var5];
                        int var9 = this.field4432;
                        if (var9 != 1) {
                            if (~var9 != -3) {
                                if (var9 == 3) {
                                    var7 = 2048 - -(-var4 + var8 >> 1);
                                }
                            } else {
                                var7 = 2048 - -(var8 - (4096 - var4) >> 1);
                            }
                        } else {
                            var7 = var8;
                        }
                        for (int var10 = 0; ~this.field4435 < ~var10; ++var10) {
                            if (this.field4420[var10] <= var7 && this.field4420[var10 + 1] > var7) {
                                if (~var7 > ~this.field4417[var10]) {
                                    var6 = 4096;
                                }
                                break;
                            }
                        }
                        var3[var5] = var6;
                    }
                } else {
                    short var11 = 0;
                    for (int var12 = 0; this.field4435 > var12; ++var12) {
                        if (this.field4420[var12] <= var4 && var4 < this.field4420[var12 + 1]) {
                            if (var4 < this.field4417[var12]) {
                                var11 = 4096;
                            }
                            break;
                        }
                    }
                    class68.method532(var3, 0, class26.field458, var11);
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "(II)V")
    public static final void method1874(int arg0, int arg1) {
        class26.field448.method1163(arg1, false);
        ++field4427;
        class152.field2489.method1163(arg1, false);
        int var2 = -63 % (arg0 / 60);
    }

    @OriginalMember(owner = "client!ba", name = "e", descriptor = "(I)V")
    private final void method1875(int arg0) {
        if (arg0 == 28693) {
            this.field4420 = new int[this.field4435 + 1];
            int var2 = 0;
            this.field4417 = new int[this.field4435 - -1];
            ++field4416;
            int var3 = 4096 / this.field4435;
            int var4 = this.field4418 * var3 >> 12;
            for (int var5 = 0; var5 < this.field4435; ++var5) {
                this.field4420[var5] = var2;
                this.field4417[var5] = var2 + var4;
                var2 += var3;
            }
            this.field4420[this.field4435] = 4096;
            this.field4417[this.field4435] = this.field4417[0] + 4096;
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(Lig;II)V")
    public final void method2(class136 arg0, int arg1, int arg2) {
        ++field4424;
        if (arg1 != 0) {
            if (~arg1 != -2) {
                if (~arg1 == -3) {
                    this.field4432 = arg0.method1012(arg2 + -1);
                }
            } else {
                this.field4418 = arg0.method996(arg2 ^ 65285);
            }
        } else {
            this.field4435 = arg0.method1012(arg2 + -1);
        }
        if (arg2 != 5) {
            field4429 = null;
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(Lhj;Z)V")
    public static final void method1876(class110 arg0, boolean arg1) {
        ++field4419;
        if (!arg1) {
            method1877(-28);
        }
        long var2 = 0L;
        if (arg0.field1699 == 0) {
            var2 = class76.method602(arg0.field1700, arg0.field1688, arg0.field1705);
        }
        if (~arg0.field1699 == -2) {
            var2 = class224.method1506(arg0.field1700, arg0.field1688, arg0.field1705);
        }
        if (arg0.field1699 == 2) {
            var2 = class38.method317(arg0.field1700, arg0.field1688, arg0.field1705);
        }
        int var4 = 0;
        int var5 = 0;
        int var6 = -1;
        if (~arg0.field1699 == -4) {
            var2 = class205.method1382(arg0.field1700, arg0.field1688, arg0.field1705);
        }
        if (var2 != 0L) {
            var4 = ((int) var2 & 3425063) >> 20;
            var5 = (int) var2 >> 14 & 31;
            var6 = (int) (var2 >>> 32) & Integer.MAX_VALUE;
        }
        arg0.field1690 = var4;
        arg0.field1701 = var6;
        arg0.field1695 = var5;
    }

    @OriginalMember(owner = "client!ba", name = "f", descriptor = "(I)V")
    public static final void method1877(int arg0) {
        ++field4436;
        class2.field12.method1157(760);
        if (arg0 >= -116) {
            method1877(36);
        }
        class270.field4337.method1157(760);
    }

    @OriginalMember(owner = "client!ba", name = "c", descriptor = "(II)Z")
    public static final boolean method1878(int arg0, int arg1) {
        ++field4422;
        if (class285.field4548[arg1]) {
            return true;
        } else if (!class71.field1183.method896(arg1, false)) {
            return false;
        } else {
            int var2 = class71.field1183.method891(0, arg1);
            if (~var2 == -1) {
                class285.field4548[arg1] = true;
                return true;
            } else {
                if (class128.field2119[arg1] == null) {
                    class128.field2119[arg1] = new class114[var2];
                }
                for (int var3 = arg0; ~var3 > ~var2; ++var3) {
                    if (class128.field2119[arg1][var3] == null) {
                        byte[] var4 = class71.field1183.method900(arg1, var3, false);
                        if (var4 != null) {
                            class114 var5 = class128.field2119[arg1][var3] = new class114();
                            var5.field1789 = (arg1 << 16) + var3;
                            if (var4[0] != -1) {
                                var5.method849(-3, new class136(var4));
                            } else {
                                var5.method854(new class136(var4), -75);
                            }
                        }
                    }
                }
                class285.field4548[arg1] = true;
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!ba", name = "d", descriptor = "(B)Lcj;")
    public static final class74 method1879(byte arg0) {
        ++field4426;
        if (arg0 < 40) {
            method1878(42, -67);
        }
        class74 var1 = new class74(class287.field4592, class20.field315, class193.field3155[0], class197.field3224[0], class4.field56[0], class19.field268[0], class66.field1082[0], class244.field3857);
        class213.method1410(0);
        return var1;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(I)V")
    public final void method108(int arg0) {
        ++field4425;
        this.method1875(28693);
        if (arg0 > -94) {
            this.field4435 = 58;
        }
    }

    @OriginalMember(owner = "client!ba", name = "g", descriptor = "(I)V")
    public static void method1880(int arg0) {
        field4431 = null;
        field4429 = null;
        if (arg0 != 1785641548) {
            field4430 = -111;
        }
        field4423 = null;
    }
}
