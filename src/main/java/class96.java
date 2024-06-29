import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ij")
public class class96 {

    @OriginalMember(owner = "client!ij", name = "e", descriptor = "Lbb;")
    public static class14 field1682 = new class14(64);

    @OriginalMember(owner = "client!ij", name = "h", descriptor = "[I")
    public static int[] field1685 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @OriginalMember(owner = "client!ij", name = "i", descriptor = "Ldc;")
    public static class37 field1686 = class185.method1233((byte) 86, "null");

    @OriginalMember(owner = "client!ij", name = "k", descriptor = "J")
    public static volatile long field1688 = 0L;

    @OriginalMember(owner = "client!ij", name = "l", descriptor = "Ldc;")
    public static class37 field1689 = class185.method1233((byte) 86, "l");

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "I")
    public int field1678;

    @OriginalMember(owner = "client!ij", name = "b", descriptor = "I")
    public int field1679;

    @OriginalMember(owner = "client!ij", name = "c", descriptor = "I")
    public static int field1680;

    @OriginalMember(owner = "client!ij", name = "d", descriptor = "I")
    public static int field1681;

    @OriginalMember(owner = "client!ij", name = "f", descriptor = "I")
    public static int field1683;

    @OriginalMember(owner = "client!ij", name = "g", descriptor = "I")
    public int field1684;

    @OriginalMember(owner = "client!ij", name = "j", descriptor = "Lwa;")
    public static class238 field1687;

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(BIIII)V")
    public static final void method640(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        field1680++;
        int var5 = arg2;
        if (arg0 > -109) {
            method643(4);
        }
        int var6 = -arg2;
        int var7 = -1;
        int var8 = 0;
        class29.method242(arg1 + arg2, (byte) -30, arg3, class11.field156[arg4], arg1 - arg2);
        while (var8 < var5) {
            var7 += 2;
            var8++;
            var6 += var7;
            if (var6 >= 0) {
                var5--;
                int[] var9 = class11.field156[arg4 + var5];
                var6 -= var5 << 1;
                int var10 = arg1 + var8;
                int[] var11 = class11.field156[arg4 - var5];
                int var12 = arg1 - var8;
                class29.method242(var10, (byte) -30, arg3, var9, var12);
                class29.method242(var10, (byte) -30, arg3, var11, var12);
            }
            int var13 = arg1 + var5;
            int var14 = arg1 - var5;
            int[] var15 = class11.field156[arg4 - var8];
            int[] var16 = class11.field156[arg4 + var8];
            class29.method242(var13, (byte) -30, arg3, var16, var14);
            class29.method242(var13, (byte) -30, arg3, var15, var14);
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(III)I")
    public static final int method641(int arg0, int arg1, int arg2) {
        field1683++;
        int var3 = 0;
        while (arg0 > 0) {
            arg0--;
            var3 = arg1 & 0x1 | var3 << 1;
            arg1 >>>= 0x1;
        }
        return arg2 == 32768 ? var3 : 99;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(I)I")
    public static final int method642(int arg0) {
        int var1 = 3;
        if (class92.field1587 < 310) {
            int var2 = class6.field71 >> 7;
            int var3 = class118.field2112 >> 7;
            if ((class193.field3602[class125.field2246][var2][var3] & 0x4) != 0) {
                var1 = class125.field2246;
            }
            int var4 = class238.field4382.field3505 >> 7;
            int var5 = class238.field4382.field3490 >> 7;
            int var6;
            if (var4 <= var2) {
                var6 = var2 - var4;
            } else {
                var6 = var4 - var2;
            }
            int var7;
            if (var5 <= var3) {
                var7 = var3 - var5;
            } else {
                var7 = var5 - var3;
            }
            if (var7 < var6) {
                int var8 = var7 * 65536 / var6;
                int var9 = 32768;
                while (var2 != var4) {
                    var9 += var8;
                    if (var4 > var2) {
                        var2++;
                    } else if (var2 > var4) {
                        var2--;
                    }
                    if ((class193.field3602[class125.field2246][var2][var3] & 0x4) != 0) {
                        var1 = class125.field2246;
                    }
                    if (var9 >= 65536) {
                        var9 -= 65536;
                        if (var5 > var3) {
                            var3++;
                        } else if (var5 < var3) {
                            var3--;
                        }
                        if ((class193.field3602[class125.field2246][var2][var3] & 0x4) != 0) {
                            var1 = class125.field2246;
                        }
                    }
                }
            } else {
                int var10 = var6 * 65536 / var7;
                int var11 = 32768;
                while (var3 != var5) {
                    var11 += var10;
                    if (var3 < var5) {
                        var3++;
                    } else if (var3 > var5) {
                        var3--;
                    }
                    if ((class193.field3602[class125.field2246][var2][var3] & 0x4) != 0) {
                        var1 = class125.field2246;
                    }
                    if (var11 >= 65536) {
                        var11 -= 65536;
                        if (var4 > var2) {
                            var2++;
                        } else if (var4 < var2) {
                            var2--;
                        }
                        if ((class193.field3602[class125.field2246][var2][var3] & 0x4) != 0) {
                            var1 = class125.field2246;
                        }
                    }
                }
            }
        }
        if ((class193.field3602[class125.field2246][class238.field4382.field3505 >> 7][class238.field4382.field3490 >> 7] & 0x4) != 0) {
            var1 = class125.field2246;
        }
        if (arg0 != -175122297) {
            field1682 = null;
        }
        field1681++;
        return var1;
    }

    @OriginalMember(owner = "client!ij", name = "b", descriptor = "(I)V")
    public static void method643(int arg0) {
        int var1 = 16 % ((46 - arg0) / 57);
        field1687 = null;
        field1689 = null;
        field1685 = null;
        field1686 = null;
        field1682 = null;
    }
}
