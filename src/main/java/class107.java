import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vf")
public class class107 extends class198 {

    @OriginalMember(owner = "client!vf", name = "T", descriptor = "I")
    private int field1661 = -1;

    @OriginalMember(owner = "client!vf", name = "W", descriptor = "[I")
    public static int[] field1664 = new int[14];

    @OriginalMember(owner = "client!vf", name = "I", descriptor = "I")
    public static int field1650;

    @OriginalMember(owner = "client!vf", name = "J", descriptor = "I")
    public static int field1651;

    @OriginalMember(owner = "client!vf", name = "K", descriptor = "I")
    public static int field1652;

    @OriginalMember(owner = "client!vf", name = "M", descriptor = "I")
    public static int field1654;

    @OriginalMember(owner = "client!vf", name = "N", descriptor = "I")
    private int field1655;

    @OriginalMember(owner = "client!vf", name = "O", descriptor = "I")
    private int field1656;

    @OriginalMember(owner = "client!vf", name = "P", descriptor = "I")
    public static int field1657;

    @OriginalMember(owner = "client!vf", name = "R", descriptor = "I")
    public static int field1659;

    @OriginalMember(owner = "client!vf", name = "S", descriptor = "I")
    public static int field1660;

    @OriginalMember(owner = "client!vf", name = "U", descriptor = "I")
    public static int field1662;

    @OriginalMember(owner = "client!vf", name = "V", descriptor = "I")
    public static int field1663;

    @OriginalMember(owner = "client!vf", name = "Q", descriptor = "[I")
    private int[] field1658;

    @OriginalMember(owner = "client!vf", name = "L", descriptor = "[Lkk;")
    public static class254[] field1653;

    @OriginalMember(owner = "client!vf", name = "<init>", descriptor = "()V")
    public class107() {
        super(0, false);
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(Ljava/lang/String;ZII)I")
    public static final int method694(String arg0, boolean arg1, int arg2, int arg3) {
        ++field1652;
        if (~arg3 <= -3 && ~arg3 >= -37) {
            if (arg2 != 48) {
                method699(-66);
            }
            boolean var4 = false;
            boolean var5 = false;
            int var6 = 0;
            int var7 = arg0.length();
            for (int var8 = 0; var8 < var7; ++var8) {
                char var9 = arg0.charAt(var8);
                if (~var8 == -1) {
                    if (var9 == '-') {
                        var4 = true;
                        continue;
                    }
                    if (~var9 == -44 && arg1) {
                        continue;
                    }
                }
                int var11;
                if (var9 >= '0' && ~var9 >= -58) {
                    var11 = var9 - '0';
                } else if (~var9 <= -66 && var9 <= 'Z') {
                    var11 = var9 - '7';
                } else {
                    if (~var9 > -98 || ~var9 < -123) {
                        throw new NumberFormatException();
                    }
                    var11 = var9 - 'W';
                }
                if (~arg3 >= ~var11) {
                    throw new NumberFormatException();
                }
                if (var4) {
                    var11 = -var11;
                }
                int var10 = arg3 * var6 - -var11;
                if (~(var10 / arg3) != ~var6) {
                    throw new NumberFormatException();
                }
                var6 = var10;
                var5 = true;
            }
            if (!var5) {
                throw new NumberFormatException();
            } else {
                return var6;
            }
        } else {
            throw new IllegalArgumentException("Invalid radix:" + arg3);
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(ZB)V")
    public static final void method695(boolean arg0, byte arg1) {
        int[] var2 = null;
        ++field1659;
        byte var3 = 4;
        byte[][] var4 = class225.field3574;
        if (arg1 <= -55) {
            for (int var5 = 0; ~var5 > ~var3; ++var5) {
                class217.method1521(1);
                for (int var6 = 0; ~var6 > -14; ++var6) {
                    for (int var7 = 0; ~var7 > -14; ++var7) {
                        boolean var8 = false;
                        int var9 = class193.field3049[var5][var6][var7];
                        if (~var9 != 0) {
                            int var10 = 3 & var9 >> 24;
                            if (!arg0 || var10 == 0) {
                                int var11 = var9 >> 1 & 3;
                                int var12 = var9 >> 3 & 2047;
                                int var13 = var9 >> 14 & 1023;
                                int var14 = (var13 / 8 << 8) - -(var12 / 8);
                                for (int var15 = 0; ~class53.field718.length < ~var15; ++var15) {
                                    if (~class53.field718[var15] == ~var14 && var4[var15] != null) {
                                        var8 = true;
                                        int[] var16 = class37.method231(arg0, var6 * 8, var10, var5, var12, var7 * 8, var4[var15], true, var11, class183.field2841, var13);
                                        if (var2 == null && var16 != null) {
                                            var2 = var16;
                                        }
                                        break;
                                    }
                                }
                            }
                        }
                        if (!var8) {
                            class151.method1001(var5, var6 * 8, true, var7 * 8, 8, 8);
                        }
                    }
                }
            }
            if (var2 != null) {
                class203.field3284 = var2[4];
                class102.field1544 = var2[2];
                class197.field3127 = var2[1];
                class40.field496 = var2[0];
                class164.field2589 = var2[3];
            } else {
                class40.field496 = -1;
            }
        }
    }

    @OriginalMember(owner = "client!vf", name = "f", descriptor = "(I)V")
    public final void method696(int arg0) {
        ++field1662;
        super.method696(arg0);
        this.field1658 = null;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(II)[[I")
    public final int[][] method200(int arg0, int arg1) {
        if (arg1 != -2) {
            method694((String) null, true, 86, 39);
        }
        int[][] var3 = super.field3150.method642(arg0, 1);
        if (super.field3150.field1498 && this.method697((byte) -122)) {
            int var4 = (class258.field4243 == this.field1655 ? arg0 : this.field1655 * arg0 / class258.field4243) * this.field1656;
            int[] var5 = var3[0];
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            if (~class42.field590 == ~this.field1656) {
                for (int var8 = 0; ~var8 > ~class42.field590; ++var8) {
                    int var9 = this.field1658[var4++];
                    var7[var8] = class10.method53(var9 << 4, 4080);
                    var6[var8] = class10.method53(var9 >> 4, 4080);
                    var5[var8] = class10.method53(var9 >> 12, 4080);
                }
            } else {
                for (int var10 = 0; ~class42.field590 < ~var10; ++var10) {
                    int var11 = this.field1656 * var10 / class42.field590;
                    int var12 = this.field1658[var4 + var11];
                    var7[var10] = class10.method53(255, var12) << 4;
                    var6[var10] = class10.method53(var12 >> 4, 4080);
                    var5[var10] = class10.method53(var12 >> 12, 4080);
                }
            }
        }
        ++field1663;
        return var3;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(ILma;I)V")
    public final void method52(int arg0, class202 arg1, int arg2) {
        if (arg2 == 0) {
            this.field1661 = arg1.method1419(91);
        }
        int var4 = -80 / ((arg0 - 60) / 61);
        ++field1660;
    }

    @OriginalMember(owner = "client!vf", name = "d", descriptor = "(B)Z")
    private final boolean method697(byte arg0) {
        if (arg0 >= -45) {
            this.field1655 = 24;
        }
        ++field1650;
        if (this.field1658 != null) {
            return true;
        } else if (~this.field1661 <= -1) {
            int var2 = class258.field4243;
            int var3 = class42.field590;
            int var4 = !class311.field5031.method378(this.field1661, (byte) 86).field678 ? 128 : 64;
            this.field1658 = class311.field5031.method379(false, 1.0F, true, this.field1661, var4, var4);
            this.field1656 = var4;
            this.field1655 = var4;
            class218.method1523((byte) -70, var2, var3);
            return this.field1658 != null;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(IIIB)Lte;")
    public static final class80 method698(int arg0, int arg1, int arg2, byte arg3) {
        int var4 = arg1 | arg0 << 8;
        ++field1654;
        class80 var5 = (class80) class294.field4843.method1343(75, (long) var4 << 16);
        if (var5 != null) {
            return var5;
        } else {
            byte[] var6 = class119.field1835.method1884(class119.field1835.method1903(var4, (byte) -113), (byte) -89);
            if (var6 != null) {
                if (var6.length <= 1) {
                    return null;
                } else {
                    class80 var7 = class197.method1363((byte) -41, var6);
                    var7.field1261 = arg1;
                    class294.field4843.method1337(var7, (long) var4 << 16, -1);
                    return var7;
                }
            } else {
                int var8 = arg2 + 65536 << 8 | arg1;
                class80 var9 = (class80) class294.field4843.method1343(126, (long) var8 << 16);
                if (var9 != null) {
                    return var9;
                } else {
                    byte[] var10 = class119.field1835.method1884(class119.field1835.method1903(var8, (byte) -115), (byte) -98);
                    int var11 = -8 / ((-55 - arg3) / 60);
                    if (var10 != null) {
                        if (~var10.length >= -2) {
                            return null;
                        } else {
                            class80 var12 = class197.method1363((byte) -57, var10);
                            var12.field1261 = arg1;
                            class294.field4843.method1337(var12, (long) var8 << 16, -1);
                            return var12;
                        }
                    } else {
                        int var13 = 16776960 | arg1;
                        class80 var14 = (class80) class294.field4843.method1343(67, (long) var13 << 16);
                        if (var14 != null) {
                            return var14;
                        } else {
                            byte[] var15 = class119.field1835.method1884(class119.field1835.method1903(var13, (byte) -116), (byte) 87);
                            if (var15 != null) {
                                if (var15.length <= 1) {
                                    return null;
                                } else {
                                    class80 var16 = class197.method1363((byte) -126, var15);
                                    var16.field1261 = arg1;
                                    class294.field4843.method1337(var16, (long) var13 << 16, -1);
                                    return var16;
                                }
                            } else {
                                return null;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!vf", name = "g", descriptor = "(I)V")
    public static void method699(int arg0) {
        if (arg0 != -9998) {
            field1653 = null;
        }
        field1664 = null;
        field1653 = null;
    }

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "(B)I")
    public final int method700(byte arg0) {
        ++field1657;
        int var2 = 22 / ((69 - arg0) / 47);
        return this.field1661;
    }
}
