import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!r")
public class class115 extends class397 {

    @OriginalMember(owner = "client!r", name = "M", descriptor = "I")
    private int field1476 = 1;

    @OriginalMember(owner = "client!r", name = "O", descriptor = "I")
    private int field1478 = 0;

    @OriginalMember(owner = "client!r", name = "U", descriptor = "I")
    private int field1484 = 0;

    @OriginalMember(owner = "client!r", name = "P", descriptor = "Z")
    public static volatile boolean field1479 = false;

    @OriginalMember(owner = "client!r", name = "V", descriptor = "I")
    public static int field1485 = 0;

    @OriginalMember(owner = "client!r", name = "T", descriptor = "I")
    public static int field1483 = 0;

    @OriginalMember(owner = "client!r", name = "Q", descriptor = "F")
    public static float field1480;

    @OriginalMember(owner = "client!r", name = "L", descriptor = "I")
    public static int field1475;

    @OriginalMember(owner = "client!r", name = "N", descriptor = "I")
    public static int field1477;

    @OriginalMember(owner = "client!r", name = "R", descriptor = "I")
    public static int field1481;

    @OriginalMember(owner = "client!r", name = "S", descriptor = "I")
    public static int field1482;

    @OriginalMember(owner = "client!r", name = "X", descriptor = "I")
    public static int field1487;

    @OriginalMember(owner = "client!r", name = "W", descriptor = "[I")
    public static int[] field1486;

    @OriginalMember(owner = "client!r", name = "b", descriptor = "(II)[I", line = 3)
    public final int[] method31(int arg0, int arg1) {
        if (arg0 != -780833076) {
            this.method24(-39);
        }
        ++field1487;
        int[] var3 = super.field5854.method465(arg1, 112);
        if (super.field5854.field991) {
            int var4 = class447.field6523[arg1];
            int var5 = var4 + -2048 >> 1;
            for (int var6 = 0; var6 < class164.field2152; ++var6) {
                int var7 = class228.field3210[var6];
                int var8 = var7 + -2048 >> 1;
                int var11;
                if (~this.field1478 != -1) {
                    int var9 = var5 * var5 + var8 * var8 >> 12;
                    int var10 = (int) (Math.sqrt((double) ((float) var9 / 4096.0F)) * 4096.0D);
                    var11 = (int) ((double) (this.field1476 * var10) * 3.141592653589793D);
                } else {
                    var11 = (-var4 + var7) * this.field1476;
                }
                int var12 = var11 - (var11 & -4096);
                if (~this.field1484 != -1) {
                    if (this.field1484 == 2) {
                        var12 -= 2048;
                        if (~var12 > -1) {
                            var12 = -var12;
                        }
                        var12 = 2048 - var12 << 1;
                    }
                } else {
                    var12 = class348.field5044[var12 >> 4 & 255] + 4096 >> 1;
                }
                var3[var6] = var12;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!r", name = "<init>", descriptor = "()V", line = 154)
    public class115() {
        super(0, true);
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(II[IZILrl;)Loc;", line = 82)
    public static final class129 method665(int arg0, int arg1, int[] arg2, boolean arg3, int arg4, class487 arg5) {
        ++field1475;
        if (arg0 > -74) {
            method667(28);
        }
        if (!arg5.field7454 && (!class403.method2418(arg4, (byte) 78) || !class403.method2418(arg1, (byte) 79))) {
            return arg5.field7459 ? new class129(arg5, 34037, arg4, arg1, arg3, arg2) : new class129(arg5, arg4, arg1, class340.method2064(-86, arg4), class340.method2064(-111, arg1), arg2);
        } else {
            return new class129(arg5, 3553, arg4, arg1, arg3, arg2);
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(ILqn;)[Lil;", line = 102)
    public static final class7[] method666(int arg0, class44 arg1) {
        ++field1477;
        int var2 = -68 % ((15 - arg0) / 56);
        if (!arg1.method338((byte) 54)) {
            return new class7[0];
        } else {
            class439 var3 = arg1.method347(29756);
            while (~var3.field6417 == -1) {
                class322.method1935(true, 10L);
            }
            if (var3.field6417 == 2) {
                return new class7[0];
            } else {
                int[] var4 = (int[]) var3.field6416;
                class7[] var5 = new class7[var4.length >> 2];
                for (int var6 = 0; var6 < var5.length; ++var6) {
                    class7 var7 = new class7();
                    var5[var6] = var7;
                    var7.field127 = var4[var6 << 2];
                    var7.field125 = var4[(var6 << 2) + 1];
                    var7.field128 = var4[(var6 << 2) + 2];
                    var7.field121 = var4[(var6 << 2) - -3];
                }
                return var5;
            }
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(I)V", line = 143)
    public final void method24(int arg0) {
        class270.method1651((byte) -122);
        if (arg0 != 255) {
            this.method27(26, (byte) -54, (class156) null);
        }
        ++field1481;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IBLae;)V", line = 157)
    public final void method27(int arg0, byte arg1, class156 arg2) {
        ++field1482;
        if (arg1 != 80) {
            method667(110);
        }
        if (~arg0 != -1) {
            if (~arg0 != -2) {
                if (~arg0 == -4) {
                    this.field1476 = arg2.method941((byte) 125);
                }
            } else {
                this.field1484 = arg2.method941((byte) 124);
            }
        } else {
            this.field1478 = arg2.method941((byte) 124);
        }
    }

    @OriginalMember(owner = "client!r", name = "e", descriptor = "(I)V", line = 213)
    public static void method667(int arg0) {
        if (arg0 == -2147046559) {
            field1486 = null;
        }
    }
}
