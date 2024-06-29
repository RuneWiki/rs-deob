import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ei")
public class class116 extends class14 {

    @OriginalMember(owner = "client!ei", name = "L", descriptor = "I")
    private int field1640 = 0;

    @OriginalMember(owner = "client!ei", name = "N", descriptor = "I")
    private int field1642 = 0;

    @OriginalMember(owner = "client!ei", name = "W", descriptor = "I")
    private int field1651 = 4096;

    @OriginalMember(owner = "client!ei", name = "M", descriptor = "I")
    private int field1641 = 12288;

    @OriginalMember(owner = "client!ei", name = "U", descriptor = "I")
    private int field1649 = 8192;

    @OriginalMember(owner = "client!ei", name = "J", descriptor = "I")
    private int field1638 = 2048;

    @OriginalMember(owner = "client!ei", name = "S", descriptor = "I")
    private int field1647 = 2048;

    @OriginalMember(owner = "client!ei", name = "Z", descriptor = "Lrc;")
    public static class374 field1654 = null;

    @OriginalMember(owner = "client!ei", name = "K", descriptor = "I")
    public static int field1639;

    @OriginalMember(owner = "client!ei", name = "O", descriptor = "I")
    public static int field1643;

    @OriginalMember(owner = "client!ei", name = "P", descriptor = "I")
    public static int field1644;

    @OriginalMember(owner = "client!ei", name = "Q", descriptor = "I")
    public static int field1645;

    @OriginalMember(owner = "client!ei", name = "R", descriptor = "I")
    public static int field1646;

    @OriginalMember(owner = "client!ei", name = "V", descriptor = "I")
    public static int field1650;

    @OriginalMember(owner = "client!ei", name = "X", descriptor = "I")
    public static int field1652;

    @OriginalMember(owner = "client!ei", name = "Y", descriptor = "I")
    public static int field1653;

    @OriginalMember(owner = "client!ei", name = "ab", descriptor = "I")
    public static int field1655;

    @OriginalMember(owner = "client!ei", name = "T", descriptor = "Lpc;")
    public static class473 field1648;

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(IZI)Z")
    private final boolean method792(int arg0, boolean arg1, int arg2) {
        ++field1646;
        int var4 = (arg2 - arg0) * this.field1641 >> 12;
        if (arg1) {
            return false;
        } else {
            int var5 = class289.field3779[(var4 * 255 & 1048062) >> 12];
            int var6 = (var5 << 12) / this.field1641;
            int var7 = (var6 << 12) / this.field1649;
            int var8 = this.field1651 * var7 >> 12;
            return arg0 + arg2 < var8 && ~(-var8) > ~(arg0 + arg2);
        }
    }

    @OriginalMember(owner = "client!ei", name = "e", descriptor = "(I)V")
    public static void method793(int arg0) {
        field1648 = null;
        if (arg0 != -16734) {
            field1654 = null;
        }
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(BLjs;)[Lfg;")
    public static final class83[] method794(byte arg0, class216 arg1) {
        ++field1652;
        if (!arg1.method1359(-5)) {
            return new class83[0];
        } else {
            class446 var2 = arg1.method1360(0);
            while (var2.field6100 == 0) {
                class94.method674(10L, 1);
            }
            if (var2.field6100 == 2) {
                return new class83[0];
            } else {
                int[] var3 = (int[]) var2.field6104;
                class83[] var4 = new class83[var3.length >> 2];
                if (arg0 != -88) {
                    field1654 = null;
                }
                for (int var5 = 0; var5 < var4.length; ++var5) {
                    class83 var6 = new class83();
                    var4[var5] = var6;
                    var6.field1234 = var3[var5 << 2];
                    var6.field1237 = var3[(var5 << 2) - -1];
                    var6.field1239 = var3[(var5 << 2) + 2];
                    var6.field1236 = var3[(var5 << 2) + 3];
                }
                return var4;
            }
        }
    }

    @OriginalMember(owner = "client!ei", name = "c", descriptor = "(III)Z")
    private final boolean method795(int arg0, int arg1, int arg2) {
        ++field1655;
        int var4 = (arg0 + arg2) * this.field1641 >> 12;
        int var5 = class289.field3779[(var4 * 255 & 1047776) >> 12];
        int var6 = (var5 << 12) / this.field1641;
        int var7 = (var6 << 12) / this.field1649;
        int var8 = 34 / ((arg1 - -29) / 48);
        int var9 = this.field1651 * var7 >> 12;
        return ~(-arg0 + arg2) > ~var9 && ~(-arg0 + arg2) < ~(-var9);
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(ILjava/lang/String;III)V")
    public static final void method796(int arg0, String arg1, int arg2, int arg3, int arg4) {
        ++field1639;
        class403 var5 = class381.method2261(-10673, arg3, arg4);
        if (var5 != null) {
            if (var5.field5506 != null) {
                class353 var6 = new class353();
                var6.field4773 = arg1;
                var6.field4767 = arg0;
                var6.field4772 = var5.field5506;
                var6.field4770 = var5;
                class122.method893(var6);
            }
            boolean var7 = true;
            if (var5.field5468 != 0) {
                var7 = class307.method1785(var5, (byte) 94);
            }
            if (var7) {
                if (client.method1255(var5).method2044(arg0 - 1, arg2 + 87)) {
                    if (~arg0 == -2) {
                        class118.method822(-95, class358.field4824);
                        ++class135.field1937;
                        class111.method766(arg3, arg4, (byte) 79, var5.field5530);
                    }
                    if (arg0 == 2) {
                        ++class499.field6897;
                        class118.method822(arg2 + -119, class515.field7622);
                        class111.method766(arg3, arg4, (byte) 108, var5.field5530);
                    }
                    if (~arg0 == -4) {
                        class118.method822(50, class333.field4372);
                        ++class165.field2404;
                        class111.method766(arg3, arg4, (byte) 94, var5.field5530);
                    }
                    if (arg0 == 4) {
                        class118.method822(-75, class454.field6159);
                        ++class94.field1416;
                        class111.method766(arg3, arg4, (byte) 121, var5.field5530);
                    }
                    if (~arg0 == -6) {
                        class118.method822(118, class435.field5969);
                        ++class296.field3869;
                        class111.method766(arg3, arg4, (byte) -55, var5.field5530);
                    }
                    if (~arg0 == -7) {
                        ++class71.field1058;
                        class118.method822(arg2 ^ -95, class301.field3983);
                        class111.method766(arg3, arg4, (byte) -50, var5.field5530);
                    }
                    if (arg0 == 7) {
                        ++class433.field5930;
                        class118.method822(44, class518.field7679);
                        class111.method766(arg3, arg4, (byte) 125, var5.field5530);
                    }
                    if (~arg0 == -9) {
                        class118.method822(arg2 + 105, class378.field5109);
                        ++class490.field6826;
                        class111.method766(arg3, arg4, (byte) -128, var5.field5530);
                    }
                    if (arg0 == arg2) {
                        class118.method822(62, class159.field2349);
                        ++class170.field2480;
                        class111.method766(arg3, arg4, (byte) 111, var5.field5530);
                    }
                    if (~arg0 == -11) {
                        class118.method822(-90, class321.field4200);
                        ++class511.field7349;
                        class111.method766(arg3, arg4, (byte) -33, var5.field5530);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ei", name = "<init>", descriptor = "()V")
    public class116() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "(II)I")
    public static final int method797(int arg0, int arg1) {
        ++field1644;
        return arg1 != 255 ? -74 : arg0 & 255;
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(IB)[I")
    public final int[] method140(int arg0, byte arg1) {
        ++field1653;
        int[] var3 = super.field270.method2263(-29596, arg0);
        if (arg1 >= -2) {
            this.method795(-98, -60, -41);
        }
        if (super.field270.field5222) {
            int var4 = class273.field3590[arg0] + -2048;
            for (int var5 = 0; class115.field1637 > var5; ++var5) {
                int var6 = class195.field2715[var5] + -2048;
                int var7 = var6 - -this.field1638;
                int var8 = var7 >= -2048 ? var7 : var7 - -4096;
                int var9 = var8 <= 2048 ? var8 : var8 - 4096;
                int var10 = var4 - -this.field1642;
                int var11 = var10 >= -2048 ? var10 : var10 + 4096;
                int var12 = var11 <= 2048 ? var11 : var11 + -4096;
                int var13 = this.field1640 + var6;
                int var14 = var13 < -2048 ? var13 + 4096 : var13;
                int var15 = ~var14 < -2049 ? var14 + -4096 : var14;
                int var16 = this.field1647 + var4;
                int var17 = ~var16 > 2047 ? var16 + 4096 : var16;
                int var18 = ~var17 < -2049 ? var17 + -4096 : var17;
                var3[var5] = !this.method792(var9, false, var12) && !this.method795(var15, 124, var18) ? 0 : 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "(B)V")
    public final void method142(byte arg0) {
        class204.method1307((byte) 64);
        int var2 = -23 % ((arg0 - 39) / 59);
        ++field1645;
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(Lpc;IIB)Lwp;")
    public static final class118 method798(class473 arg0, int arg1, int arg2, byte arg3) {
        ++field1650;
        byte[] var4 = arg0.method2708(arg2, arg1, (byte) 54);
        if (arg3 > -42) {
            field1648 = null;
        }
        return var4 == null ? null : new class118(var4);
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(IBLmd;)V")
    public final void method147(int arg0, byte arg1, class379 arg2) {
        ++field1643;
        if (arg0 != 0) {
            if (~arg0 != -2) {
                if (arg0 != 2) {
                    if (arg0 != 3) {
                        if (arg0 != 4) {
                            if (~arg0 != -6) {
                                if (arg0 == 6) {
                                    this.field1649 = arg2.method2212((byte) 83);
                                }
                            } else {
                                this.field1651 = arg2.method2212((byte) 83);
                            }
                        } else {
                            this.field1641 = arg2.method2212((byte) 83);
                        }
                    } else {
                        this.field1647 = arg2.method2212((byte) 83);
                    }
                } else {
                    this.field1640 = arg2.method2212((byte) 83);
                }
            } else {
                this.field1642 = arg2.method2212((byte) 83);
            }
        } else {
            this.field1638 = arg2.method2212((byte) 83);
        }
        int var5 = 73 / ((-51 - arg1) / 37);
    }
}
