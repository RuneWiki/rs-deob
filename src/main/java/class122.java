import java.io.IOException;
import java.net.Socket;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dh")
public class class122 extends class160 {

    @OriginalMember(owner = "client!dh", name = "T", descriptor = "I")
    private int field1952 = 2000;

    @OriginalMember(owner = "client!dh", name = "U", descriptor = "I")
    private int field1953 = 4096;

    @OriginalMember(owner = "client!dh", name = "S", descriptor = "I")
    private int field1951 = 16;

    @OriginalMember(owner = "client!dh", name = "Y", descriptor = "I")
    private int field1957 = 0;

    @OriginalMember(owner = "client!dh", name = "Z", descriptor = "I")
    private int field1958 = 0;

    @OriginalMember(owner = "client!dh", name = "X", descriptor = "[I")
    public static int[] field1956 = new int[50];

    @OriginalMember(owner = "client!dh", name = "eb", descriptor = "[Lnh;")
    public static class55[] field1963 = new class55[29];

    @OriginalMember(owner = "client!dh", name = "bb", descriptor = "Z")
    public static boolean field1960 = false;

    @OriginalMember(owner = "client!dh", name = "V", descriptor = "I")
    public static int field1954;

    @OriginalMember(owner = "client!dh", name = "W", descriptor = "I")
    public static int field1955;

    @OriginalMember(owner = "client!dh", name = "ab", descriptor = "I")
    public static int field1959;

    @OriginalMember(owner = "client!dh", name = "cb", descriptor = "I")
    public static int field1961;

    @OriginalMember(owner = "client!dh", name = "db", descriptor = "I")
    public static int field1962;

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(SB)Z")
    public static final boolean method842(short arg0, byte arg1) {
        ++field1955;
        if (~arg0 != -38 && ~arg0 != -11 && arg0 != 44 && arg0 != 26 && ~arg0 != -44 && ~arg0 != -21 && ~arg0 != -37 && ~arg0 != -4) {
            if (arg1 > -28) {
                field1960 = true;
            }
            if (~arg0 != -23 && ~arg0 != -20 && arg0 != 1005 && ~arg0 != -1007) {
                if (~arg0 != -14 && ~arg0 != -26 && ~arg0 != -49 && ~arg0 != -6 && ~arg0 != -50) {
                    return arg0 == 14 || arg0 == 40 || ~arg0 == -5 || arg0 == 38 || ~arg0 == -33 || ~arg0 == -42;
                } else {
                    return true;
                }
            } else {
                return true;
            }
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!dh", name = "<init>", descriptor = "()V")
    public class122() {
        super(0, true);
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(IB)[I")
    public final int[] method1(int arg0, byte arg1) {
        ++field1959;
        if (arg1 != 57) {
            this.field1958 = 22;
        }
        int[] var3 = super.field2488.method15((byte) 124, arg0);
        if (super.field2488.field42) {
            int var4 = this.field1953 >> 1;
            int[][] var5 = super.field2488.method17(-1);
            Random var6 = new Random((long) this.field1958);
            for (int var7 = 0; ~var7 > ~this.field1952; ++var7) {
                int var8 = this.field1953 > 0 ? this.field1957 + class129.method896(this.field1953, var6, false) + -var4 : this.field1957;
                int var9 = (var8 & 4083) >> 4;
                int var10 = class129.method896(class240.field3896, var6, false);
                int var11 = class129.method896(class79.field1328, var6, false);
                int var12 = (class197.field3112[var9] * this.field1951 >> 12) + var10;
                int var13 = -var10 + var12;
                int var14 = (class106.field1759[var9] * this.field1951 >> 12) + var11;
                int var15 = var14 - var11;
                if (~var13 != -1 || var15 != 0) {
                    if (~var13 > -1) {
                        var13 = -var13;
                    }
                    if (~var15 > -1) {
                        var15 = -var15;
                    }
                    boolean var16 = var13 < var15;
                    if (var16) {
                        int var17 = var10;
                        var10 = var11;
                        var11 = var17;
                        int var18 = var12;
                        var12 = var14;
                        var14 = var18;
                    }
                    if (var10 > var12) {
                        int var19 = var10;
                        var10 = var12;
                        var12 = var19;
                        int var20 = var11;
                        var11 = var14;
                        var14 = var20;
                    }
                    int var21 = var14 - var11;
                    int var22 = -var10 + var12;
                    int var23 = var11;
                    if (~var21 > -1) {
                        var21 = -var21;
                    }
                    int var24 = -var22 / 2;
                    int var25 = -(class129.method896(4096, var6, false) >> 2) + 1024;
                    int var26 = 2048 / var22;
                    int var27 = var14 <= var11 ? -1 : 1;
                    for (int var28 = var10; ~var28 > ~var12; ++var28) {
                        var24 += var21;
                        int var29 = var25 - (-1024 - (var28 - var10) * var26);
                        int var30 = var28 & class189.field2929;
                        int var31 = var23 & class53.field811;
                        if (!var16) {
                            var5[var30][var31] = var29;
                        } else {
                            var5[var31][var30] = var29;
                        }
                        if (var24 > 0) {
                            var24 += -var22;
                            var23 += var27;
                        }
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!dh", name = "i", descriptor = "(B)V")
    public static void method843(byte arg0) {
        field1963 = null;
        if (arg0 != 94) {
            method843((byte) -8);
        }
        field1956 = null;
    }

    @OriginalMember(owner = "client!dh", name = "h", descriptor = "(B)V")
    public final void method210(byte arg0) {
        ++field1954;
        class47.method338(-85);
        if (arg0 >= -124) {
            this.field1958 = 95;
        }
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(Lai;II)V")
    public final void method2(class88 arg0, int arg1, int arg2) {
        ++field1961;
        if (arg1 > 11) {
            if (~arg2 != -1) {
                if (~arg2 != -2) {
                    if (~arg2 != -3) {
                        if (arg2 != 3) {
                            if (~arg2 == -5) {
                                this.field1953 = arg0.method645(11596);
                            }
                        } else {
                            this.field1957 = arg0.method645(11596);
                        }
                    } else {
                        this.field1951 = arg0.method633(112);
                    }
                } else {
                    this.field1952 = arg0.method645(11596);
                }
            } else {
                this.field1958 = arg0.method633(104);
            }
        }
    }

    @OriginalMember(owner = "client!dh", name = "j", descriptor = "(B)I")
    public static final int method844(byte arg0) {
        ++field1962;
        try {
            if (~class29.field406 == -1) {
                if (class134.method924(false) - 5000L < class236.field3829) {
                    return 0;
                }
                class194.field3073 = class179.field2788.method246(class163.field2571, class238.field3869, false);
                class163.field2563 = class134.method924(false);
                class29.field406 = 1;
            }
            if (~class134.method924(false) < ~(class163.field2563 + 30000L)) {
                return class27.method214(1000, (byte) 43);
            }
            if (class29.field406 == 1) {
                if (class194.field3073.field1255 == 2) {
                    return class27.method214(1001, (byte) 43);
                }
                if (class194.field3073.field1255 != 1) {
                    return -1;
                }
                int var1 = 0;
                class249.field4022 = new class130((Socket) class194.field3073.field1258, class179.field2788);
                client.field2435.field1535 = 0;
                class194.field3073 = null;
                if (class40.field572) {
                    var1 = class57.field948;
                }
                client.field2435.method654((byte) -103, 23);
                client.field2435.method639(var1, (byte) -97);
                class249.field4022.method897(client.field2435.field1535, client.field2435.field1471, 0, 5000);
                if (class222.field3412 != null) {
                    class222.field3412.method558(0);
                }
                if (class183.field2844 != null) {
                    class183.field2844.method558(0);
                }
                int var2 = class249.field4022.method906(-120);
                if (class222.field3412 != null) {
                    class222.field3412.method558(0);
                }
                if (class183.field2844 != null) {
                    class183.field2844.method558(0);
                }
                if (var2 != 0) {
                    return class27.method214(var2, (byte) 43);
                }
                class29.field406 = 2;
            }
            if (class29.field406 == 2) {
                if (~class249.field4022.method898(37) > -3) {
                    return -1;
                }
                class171.field2680 = class249.field4022.method906(-77);
                class171.field2680 <<= 8;
                class171.field2680 += class249.field4022.method906(-52);
                class292.field4598 = new byte[class171.field2680];
                class29.field406 = 3;
                class239.field3887 = 0;
            }
            if (class29.field406 == 3) {
                int var3 = class249.field4022.method898(37);
                if (var3 < 1) {
                    return -1;
                }
                if (class171.field2680 - class239.field3887 < var3) {
                    var3 = -class239.field3887 + class171.field2680;
                }
                class249.field4022.method907((byte) 114, var3, class292.field4598, class239.field3887);
                class239.field3887 += var3;
                if (~class171.field2680 < ~class239.field3887) {
                    return -1;
                }
                if (!class197.method1345((byte) 107, class292.field4598)) {
                    return class27.method214(1002, (byte) 43);
                }
                class185.field2865 = new class284[class265.field4229];
                int var4 = 0;
                for (int var5 = class65.field1085; ~class52.field770 <= ~var5; ++var5) {
                    class284 var6 = class112.method797(0, var5);
                    if (var6 != null) {
                        class185.field2865[var4++] = var6;
                    }
                }
                class249.field4022.method899((byte) -123);
                class73.field1230 = 0;
                class292.field4598 = null;
                class249.field4022 = null;
                class29.field406 = 0;
                class236.field3829 = class134.method924(false);
                return 0;
            }
        } catch (IOException var7) {
            return class27.method214(1003, (byte) 43);
        }
        if (arg0 >= -76) {
            field1960 = false;
        }
        return -1;
    }
}
