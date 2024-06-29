import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!f")
public class class409 extends class34 {

    @OriginalMember(owner = "client!f", name = "H", descriptor = "I")
    private int field5783 = 0;

    @OriginalMember(owner = "client!f", name = "J", descriptor = "I")
    private int field5785 = 20;

    @OriginalMember(owner = "client!f", name = "C", descriptor = "I")
    private int field5778 = 0;

    @OriginalMember(owner = "client!f", name = "M", descriptor = "I")
    private int field5788 = 1365;

    @OriginalMember(owner = "client!f", name = "G", descriptor = "Lkc;")
    public static class157 field5782 = new class157("Loaded interface scripts", "Interface-Skripte geladen", "Interfaces chargées", "Interfaces carregadas");

    @OriginalMember(owner = "client!f", name = "D", descriptor = "I")
    public static int field5779;

    @OriginalMember(owner = "client!f", name = "E", descriptor = "I")
    public static int field5780;

    @OriginalMember(owner = "client!f", name = "F", descriptor = "I")
    public static int field5781;

    @OriginalMember(owner = "client!f", name = "I", descriptor = "I")
    public static int field5784;

    @OriginalMember(owner = "client!f", name = "K", descriptor = "I")
    public static int field5786;

    @OriginalMember(owner = "client!f", name = "L", descriptor = "I")
    public static int field5787;

    @OriginalMember(owner = "client!f", name = "N", descriptor = "I")
    public static int field5789;

    @OriginalMember(owner = "client!f", name = "P", descriptor = "I")
    public static int field5791;

    @OriginalMember(owner = "client!f", name = "Q", descriptor = "I")
    public static int field5792;

    @OriginalMember(owner = "client!f", name = "O", descriptor = "[Lo;")
    public static class359[] field5790;

    @OriginalMember(owner = "client!f", name = "e", descriptor = "(I)V")
    public static void method2394(int arg0) {
        field5790 = null;
        field5782 = null;
        if (arg0 < 35) {
            method2399(10, 56);
        }
    }

    @OriginalMember(owner = "client!f", name = "<init>", descriptor = "()V")
    public class409() {
        super(0, true);
    }

    @OriginalMember(owner = "client!f", name = "d", descriptor = "(B)V")
    public static final void method2395(byte arg0) {
        if (arg0 < 14) {
            field5782 = null;
        }
        class2.field33.method2774((byte) -51);
        ++field5779;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(ZIII)I")
    public static final int method2396(boolean arg0, int arg1, int arg2, int arg3) {
        ++field5781;
        if (arg1 == arg3) {
            return arg1;
        } else {
            int var4 = -arg2 + 128;
            if (!arg0) {
                field5790 = null;
            }
            int var5 = (arg1 & 127) * var4 + (arg3 & 127) * arg2 >> 7;
            int var6 = (arg1 & 896) * var4 + (896 & arg3) * arg2 >> 7;
            int var7 = (64512 & arg1) * var4 + (64512 & arg3) * arg2 >> 7;
            return 64512 & var7 | var6 & 896 | var5 & 127;
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(IIC)C")
    public static final char method2397(int arg0, int arg1, char arg2) {
        ++field5786;
        if (arg2 >= 192 && arg2 <= 255) {
            if (arg2 >= 192 && arg2 <= 198) {
                return 'A';
            }
            if (arg2 == 199) {
                return 'C';
            }
            if (arg2 >= 200 && arg2 <= 203) {
                return 'E';
            }
            if (arg2 >= 204 && arg2 <= 207) {
                return 'I';
            }
            if (~arg2 == -210 && ~arg0 != -1) {
                return 'N';
            }
            if (~arg2 <= -211 && arg2 <= 214) {
                return 'O';
            }
            if (arg2 >= 217 && arg2 <= 220) {
                return 'U';
            }
            if (arg2 == 221) {
                return 'Y';
            }
            if (arg2 == 223) {
                return 's';
            }
            if (arg2 >= 224 && arg2 <= 230) {
                return 'a';
            }
            if (arg2 == 231) {
                return 'c';
            }
            if (~arg2 <= -233 && ~arg2 >= -236) {
                return 'e';
            }
            if (arg2 >= 236 && ~arg2 >= -240) {
                return 'i';
            }
            if (arg2 == 241 && ~arg0 != -1) {
                return 'n';
            }
            if (~arg2 <= -243 && arg2 <= 246) {
                return 'o';
            }
            if (arg2 >= 249 && arg2 <= 252) {
                return 'u';
            }
            if (~arg2 == -254 || ~arg2 == -256) {
                return 'y';
            }
        }
        if (~arg2 == -339) {
            return 'O';
        } else {
            int var3 = -83 % ((-29 - arg1) / 55);
            if (arg2 == 339) {
                return 'o';
            } else {
                return ~arg2 == -377 ? 'Y' : arg2;
            }
        }
    }

    @OriginalMember(owner = "client!f", name = "f", descriptor = "(I)V")
    public static final void method2398(int arg0) {
        if (class374.field5376 == 1 || class374.field5376 == 3 || ~class443.field6381 != ~class374.field5376 && (class374.field5376 == 0 || class443.field6381 == 0)) {
            class273.field3692 = 0;
            class534.field7854 = 0;
            class281.field3826.method1583(84);
        }
        if (arg0 == 0) {
            ++field5787;
            class443.field6381 = class374.field5376;
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(II)V")
    public static final void method2399(int arg0, int arg1) {
        ++field5792;
        class314 var2 = class177.method1213(false, 8, arg1);
        var2.method1811((byte) 86);
        if (arg0 != -27599) {
            method2398(54);
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(Lsv;II)V")
    public final void method69(class319 arg0, int arg1, int arg2) {
        ++field5780;
        if (arg1 >= 16) {
            if (~arg2 != -1) {
                if (~arg2 != -2) {
                    if (~arg2 != -3) {
                        if (arg2 == 3) {
                            this.field5778 = arg0.method1844(-109);
                        }
                    } else {
                        this.field5783 = arg0.method1844(-116);
                    }
                } else {
                    this.field5785 = arg0.method1844(-116);
                }
            } else {
                this.field5788 = arg0.method1844(-126);
            }
        }
    }

    @OriginalMember(owner = "client!f", name = "e", descriptor = "(B)V")
    public static final void method2400(byte arg0) {
        if (class336.field4899 < 0) {
            class470.field6776 = -1;
            class336.field4899 = 0;
            class281.field3828 = -1;
        }
        ++field5791;
        if (class336.field4899 > class472.field6821) {
            class470.field6776 = -1;
            class281.field3828 = -1;
            class336.field4899 = class472.field6821;
        }
        if (class321.field4414 < 0) {
            class470.field6776 = -1;
            class321.field4414 = 0;
            class281.field3828 = -1;
        }
        if (arg0 != 2) {
            field5789 = 78;
        }
        if (~class321.field4414 < ~class472.field6833) {
            class321.field4414 = class472.field6833;
            class470.field6776 = -1;
            class281.field3828 = -1;
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(IB)[I")
    public final int[] method64(int arg0, byte arg1) {
        ++field5784;
        int[] var3 = super.field537.method1780(arg0, (byte) 72);
        if (super.field537.field4191) {
            for (int var4 = 0; ~var4 > ~class383.field5502; ++var4) {
                int var5 = (class91.field1463[var4] << 12) / this.field5788 + this.field5783;
                int var6 = (class284.field3856[arg0] << 12) / this.field5788 - -this.field5778;
                int var7 = var5;
                int var8 = var6;
                int var9 = var5;
                int var10 = var6;
                int var11 = var5 * var5 >> 12;
                int var12 = var6 * var6 >> 12;
                int var13 = 0;
                while (var11 + var12 < 16384 && this.field5785 > var13) {
                    var10 = (var9 * var10 >> 12) * 2 + var8;
                    var9 = -var12 + var7 + var11;
                    ++var13;
                    var11 = var9 * var9 >> 12;
                    var12 = var10 * var10 >> 12;
                }
                var3[var4] = var13 < this.field5785 - 1 ? (var13 << 12) / this.field5785 : 0;
            }
        }
        int var14 = 24 % (-arg1 / 50);
        return var3;
    }
}
