import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public class class120 extends class601 {

    @OriginalMember(owner = "client!wd", name = "F", descriptor = "I")
    private int field1605 = 1;

    @OriginalMember(owner = "client!wd", name = "N", descriptor = "I")
    private int field1612 = 0;

    @OriginalMember(owner = "client!wd", name = "S", descriptor = "I")
    private int field1617 = 0;

    @OriginalMember(owner = "client!wd", name = "K", descriptor = "[I")
    public static int[] field1609 = new int[3];

    @OriginalMember(owner = "client!wd", name = "J", descriptor = "Luw;")
    public static class208 field1608 = new class208(79, 10);

    @OriginalMember(owner = "client!wd", name = "T", descriptor = "[S")
    public static short[] field1618 = new short[256];

    @OriginalMember(owner = "client!wd", name = "U", descriptor = "Z")
    public static boolean field1619 = false;

    @OriginalMember(owner = "client!wd", name = "H", descriptor = "I")
    public static int field1606;

    @OriginalMember(owner = "client!wd", name = "I", descriptor = "I")
    public static int field1607;

    @OriginalMember(owner = "client!wd", name = "L", descriptor = "I")
    public static int field1610;

    @OriginalMember(owner = "client!wd", name = "M", descriptor = "I")
    public static int field1611;

    @OriginalMember(owner = "client!wd", name = "O", descriptor = "I")
    public static int field1613;

    @OriginalMember(owner = "client!wd", name = "P", descriptor = "I")
    public static int field1614;

    @OriginalMember(owner = "client!wd", name = "Q", descriptor = "I")
    public static int field1615;

    @OriginalMember(owner = "client!wd", name = "R", descriptor = "I")
    public static int field1616;

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "(B)V", line = 3)
    public final void method292(byte arg0) {
        class257.method1651(0);
        ++field1607;
        if (arg0 < 44) {
            this.field1612 = -46;
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(Lha;B)V", line = 15)
    public static final void method711(class570 arg0, byte arg1) {
        if (arg1 != -75) {
            method714(-37, -58, (class696) null, (int[]) null, (int[]) null, -104);
        }
        if (!class525.field6678) {
            class774.method4227(arg0, (byte) -106);
        } else {
            class146.method837(arg0, false);
        }
        ++field1606;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(Lmc;II)V", line = 31)
    public final void method259(class234 arg0, int arg1, int arg2) {
        int var4 = 23 % ((arg2 - 40) / 52);
        if (~arg1 != -1) {
            if (arg1 != 1) {
                if (arg1 == 3) {
                    this.field1605 = arg0.method1509(true);
                }
            } else {
                this.field1617 = arg0.method1509(true);
            }
        } else {
            this.field1612 = arg0.method1509(true);
        }
        ++field1614;
    }

    @OriginalMember(owner = "client!wd", name = "<init>", descriptor = "()V", line = 299)
    public class120() {
        super(0, true);
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(IIIIIII)V", line = 79)
    public static final void method712(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field1616;
        int var7 = -arg3 + arg2;
        int var8 = arg3 + arg5;
        for (int var9 = arg5; var9 < var8; ++var9) {
            class54.method333(arg4, class207.field2840[var9], 7, arg0, arg1);
        }
        int var10 = arg0 - -arg3;
        int var11 = arg4 - arg3;
        for (int var12 = arg2; ~var7 > ~var12; --var12) {
            class54.method333(arg4, class207.field2840[var12], 7, arg0, arg1);
        }
        int var13 = var8;
        if (arg6 >= -85) {
            method711((class570) null, (byte) 111);
        }
        while (var13 <= var7) {
            int[] var14 = class207.field2840[var13];
            class54.method333(var10, var14, 7, arg0, arg1);
            class54.method333(arg4, var14, 7, var11, arg1);
            ++var13;
        }
    }

    @OriginalMember(owner = "client!wd", name = "d", descriptor = "(B)I", line = 125)
    public static final int method713(byte arg0) {
        ++field1611;
        return arg0 <= 109 ? -93 : class601.field7648.method1325(-127);
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(IB)[I", line = 151)
    public final int[] method261(int arg0, byte arg1) {
        ++field1615;
        int[] var3 = super.field7643.method2054(arg0, 9986);
        if (arg1 > -76) {
            method712(89, 123, -123, -1, 90, -98, 23);
        }
        if (super.field7643.field4364) {
            int var4 = class427.field5623[arg0];
            int var5 = var4 + -2048 >> 1;
            for (int var6 = 0; var6 < class418.field5518; ++var6) {
                int var7 = class64.field839[var6];
                int var8 = var7 + -2048 >> 1;
                int var11;
                if (~this.field1612 != -1) {
                    int var9 = var5 * var5 + var8 * var8 >> 12;
                    int var10 = (int) (4096.0D * Math.sqrt((double) ((float) var9 / 4096.0F)));
                    var11 = (int) ((double) (this.field1605 * var10) * 3.141592653589793D);
                } else {
                    var11 = (var7 - var4) * this.field1605;
                }
                int var12 = var11 - (-4096 & var11);
                if (this.field1617 == 0) {
                    var12 = class438.field5764[255 & var12 >> 4] + 4096 >> 1;
                } else if (~this.field1617 == -3) {
                    var12 -= 2048;
                    if (~var12 > -1) {
                        var12 = -var12;
                    }
                    var12 = -var12 + 2048 << 1;
                }
                var3[var6] = var12;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(IILgd;[I[II)Llm;", line = 219)
    public static final class218 method714(int arg0, int arg1, class696 arg2, int[] arg3, int[] arg4, int arg5) {
        ++field1613;
        if (arg0 != 3) {
            method713((byte) -98);
        }
        if (arg2.method1188(class483.field6239, (byte) -69, class73.field990)) {
            byte[] var6 = new byte[arg1 * arg5];
            for (int var7 = 0; ~arg5 < ~var7; ++var7) {
                int var8 = arg1 * var7 + arg4[var7];
                for (int var9 = 0; ~arg3[var7] < ~var9; ++var9) {
                    var6[var8++] = -1;
                }
            }
            return new class218(arg2, arg1, arg5, var6);
        } else {
            int[] var10 = new int[arg1 * arg5];
            for (int var11 = 0; arg5 > var11; ++var11) {
                int var12 = arg1 * var11 + arg4[var11];
                for (int var13 = 0; var13 < arg3[var11]; ++var13) {
                    var10[var12++] = -16777216;
                }
            }
            return new class218(arg2, arg1, arg5, var10);
        }
    }

    @OriginalMember(owner = "client!wd", name = "c", descriptor = "(III)Z", line = 276)
    public static final boolean method715(int arg0, int arg1, int arg2) {
        if (arg2 > -40) {
            return false;
        } else {
            ++field1610;
            return (24 & arg1) != 0 | ~(544 & arg1) == -545;
        }
    }

    @OriginalMember(owner = "client!wd", name = "e", descriptor = "(B)V", line = 287)
    public static void method716(byte arg0) {
        if (arg0 > 48) {
            field1609 = null;
            field1608 = null;
            field1618 = null;
        }
    }
}
