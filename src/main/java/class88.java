import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public class class88 extends class223 {

    @OriginalMember(owner = "client!nc", name = "P", descriptor = "[I")
    private int[] field1381 = new int[3];

    @OriginalMember(owner = "client!nc", name = "U", descriptor = "I")
    private int field1386 = 3216;

    @OriginalMember(owner = "client!nc", name = "R", descriptor = "I")
    private int field1383 = 3216;

    @OriginalMember(owner = "client!nc", name = "Z", descriptor = "I")
    private int field1391 = 4096;

    @OriginalMember(owner = "client!nc", name = "N", descriptor = "Ljava/lang/String;")
    public static String field1380 = "Your ignore list is full. Max of 100 users.";

    @OriginalMember(owner = "client!nc", name = "K", descriptor = "I")
    public static int field1377 = 0;

    @OriginalMember(owner = "client!nc", name = "L", descriptor = "I")
    public static int field1378;

    @OriginalMember(owner = "client!nc", name = "M", descriptor = "I")
    public static int field1379;

    @OriginalMember(owner = "client!nc", name = "Q", descriptor = "I")
    public static int field1382;

    @OriginalMember(owner = "client!nc", name = "S", descriptor = "I")
    public static int field1384;

    @OriginalMember(owner = "client!nc", name = "T", descriptor = "I")
    public static int field1385;

    @OriginalMember(owner = "client!nc", name = "V", descriptor = "I")
    public static int field1387;

    @OriginalMember(owner = "client!nc", name = "W", descriptor = "I")
    public static int field1388;

    @OriginalMember(owner = "client!nc", name = "X", descriptor = "I")
    public static int field1389;

    @OriginalMember(owner = "client!nc", name = "Y", descriptor = "I")
    public static int field1390;

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(BI)[I")
    public final int[] method40(byte arg0, int arg1) {
        ++field1387;
        if (arg0 <= 14) {
            field1380 = null;
        }
        int[] var3 = super.field3588.method1611(0, arg1);
        if (super.field3588.field3722) {
            int var4 = class194.field3029 * this.field1391 >> 12;
            int[] var5 = this.method1533(0, arg1 + -1 & class75.field1168, -80);
            int[] var6 = this.method1533(0, arg1, -102);
            int[] var7 = this.method1533(0, arg1 + 1 & class75.field1168, -124);
            for (int var8 = 0; ~class250.field4008 < ~var8; ++var8) {
                int var9 = (var7[var8] + -var5[var8]) * var4 >> 12;
                int var10 = (var6[var8 + -1 & class280.field4430] - var6[var8 - -1 & class280.field4430]) * var4 >> 12;
                int var11 = var9 >> 4;
                if (var11 < 0) {
                    var11 = -var11;
                }
                if (var11 > 255) {
                    var11 = 255;
                }
                int var12 = var10 >> 4;
                if (~var12 > -1) {
                    var12 = -var12;
                }
                if (var12 > 255) {
                    var12 = 255;
                }
                int var13 = class148.field2192[((var11 - -1) * var11 >> 1) + var12] & 255;
                int var14 = var10 * var13 >> 8;
                int var15 = var13 * 4096 >> 8;
                int var16 = this.field1381[2] * var15 >> 12;
                int var17 = var9 * var13 >> 8;
                int var18 = this.field1381[1] * var17 >> 12;
                int var19 = this.field1381[0] * var14 >> 12;
                var3[var8] = var16 + var18 + var19;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!nc", name = "f", descriptor = "(I)V")
    public static void method669(int arg0) {
        field1380 = null;
        if (arg0 != -15122) {
            field1380 = null;
        }
    }

    @OriginalMember(owner = "client!nc", name = "d", descriptor = "(I)V")
    public final void method43(int arg0) {
        if (arg0 != 500) {
            this.field1386 = 55;
        }
        this.method672(0);
        ++field1379;
    }

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "(II)I")
    public static final int method670(int arg0, int arg1) {
        ++field1378;
        return arg1 > -127 ? -18 : arg0 >>> 8;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(ZI)V")
    public static final void method671(boolean arg0, int arg1) {
        if (arg1 == 14955) {
            ++field1384;
            if (!arg0 == class237.field3745) {
                class237.field3745 = arg0;
                class252.method1709(arg1 ^ 14953);
            }
        }
    }

    @OriginalMember(owner = "client!nc", name = "g", descriptor = "(I)V")
    private final void method672(int arg0) {
        ++field1389;
        double var2 = Math.cos((double) ((float) this.field1386 / 4096.0F));
        this.field1381[arg0] = (int) (4096.0D * var2 * Math.sin((double) ((float) this.field1383 / 4096.0F)));
        this.field1381[1] = (int) (4096.0D * Math.cos((double) ((float) this.field1383 / 4096.0F)) * var2);
        this.field1381[2] = (int) (4096.0D * Math.sin((double) ((float) this.field1386 / 4096.0F)));
        int var4 = this.field1381[1] * this.field1381[1] >> 12;
        int var5 = this.field1381[0] * this.field1381[0] >> 12;
        int var6 = this.field1381[2] * this.field1381[2] >> 12;
        int var7 = (int) (4096.0D * Math.sqrt((double) (var5 - -var4 - -var6 >> 12)));
        if (var7 != 0) {
            this.field1381[1] = (this.field1381[1] << 12) / var7;
            this.field1381[0] = (this.field1381[0] << 12) / var7;
            this.field1381[2] = (this.field1381[2] << 12) / var7;
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(Lha;IB)V")
    public final void method37(class31 arg0, int arg1, byte arg2) {
        if (arg2 != 102) {
            field1380 = null;
        }
        if (~arg1 != -1) {
            if (~arg1 != -2) {
                if (~arg1 == -3) {
                    this.field1386 = arg0.method260((byte) -67);
                }
            } else {
                this.field1383 = arg0.method260((byte) -67);
            }
        } else {
            this.field1391 = arg0.method260((byte) -67);
        }
        ++field1382;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(IIC)C")
    public static final char method673(int arg0, int arg1, char arg2) {
        ++field1388;
        if (arg2 >= 192 && arg2 <= 255) {
            if (~arg2 <= -193 && arg2 <= 198) {
                return 'A';
            }
            if (~arg2 == -200) {
                return 'C';
            }
            if (arg2 >= 200 && arg2 <= 203) {
                return 'E';
            }
            if (arg2 >= 204 && ~arg2 >= -208) {
                return 'I';
            }
            if (arg2 == 209 && arg1 != 0) {
                return 'N';
            }
            if (arg2 >= 210 && ~arg2 >= -215) {
                return 'O';
            }
            if (arg2 >= 217 && ~arg2 >= -221) {
                return 'U';
            }
            if (~arg2 == -222) {
                return 'Y';
            }
            if (arg2 == 223) {
                return 's';
            }
            if (~arg2 <= -225 && arg2 <= 230) {
                return 'a';
            }
            if (~arg2 == -232) {
                return 'c';
            }
            if (arg2 >= 232 && arg2 <= 235) {
                return 'e';
            }
            if (~arg2 <= -237 && ~arg2 >= -240) {
                return 'i';
            }
            if (arg2 == 241 && arg1 != 0) {
                return 'n';
            }
            if (arg2 >= 242 && ~arg2 >= -247) {
                return 'o';
            }
            if (arg2 >= 249 && arg2 <= 252) {
                return 'u';
            }
            if (arg2 == 253 || arg2 == 255) {
                return 'y';
            }
        }
        if (~arg2 == -339) {
            return 'O';
        } else if ((char) arg0 == arg2) {
            return 'o';
        } else {
            return ~arg2 == -377 ? 'Y' : arg2;
        }
    }

    @OriginalMember(owner = "client!nc", name = "<init>", descriptor = "()V")
    public class88() {
        super(1, true);
    }
}
