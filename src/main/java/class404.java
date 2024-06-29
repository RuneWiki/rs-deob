import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ka")
public abstract class class404 {

    @OriginalMember(owner = "client!ka", name = "e", descriptor = "Llu;")
    public static class610 field5521 = new class610(58, 15);

    @OriginalMember(owner = "client!ka", name = "g", descriptor = "Z")
    public static boolean field5523 = false;

    @OriginalMember(owner = "client!ka", name = "n", descriptor = "Ldn;")
    public static class442 field5530 = class102.method767((byte) -96);

    @OriginalMember(owner = "client!ka", name = "o", descriptor = "I")
    public static int field5531 = 0;

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "I")
    public static int field5517;

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "I")
    public int field5518;

    @OriginalMember(owner = "client!ka", name = "c", descriptor = "I")
    public static int field5519;

    @OriginalMember(owner = "client!ka", name = "d", descriptor = "I")
    public static int field5520;

    @OriginalMember(owner = "client!ka", name = "f", descriptor = "I")
    public static int field5522;

    @OriginalMember(owner = "client!ka", name = "h", descriptor = "I")
    public static int field5524;

    @OriginalMember(owner = "client!ka", name = "i", descriptor = "I")
    public int field5525;

    @OriginalMember(owner = "client!ka", name = "j", descriptor = "I")
    public static int field5526;

    @OriginalMember(owner = "client!ka", name = "k", descriptor = "I")
    public static int field5527;

    @OriginalMember(owner = "client!ka", name = "l", descriptor = "I")
    public static int field5528;

    @OriginalMember(owner = "client!ka", name = "m", descriptor = "I")
    public int field5529;

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(I)Z")
    public final boolean method2373(int arg0) {
        field5520++;
        if (arg0 != 508065) {
            field5523 = false;
        }
        return (this.field5529 & 0x4) != 0;
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IZIIII)I")
    public static final int method2374(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        if (!arg1) {
            field5521 = null;
        }
        field5524++;
        if (class165.field2609 == null) {
            return 0;
        }
        if (arg2 < 3) {
            int var6 = arg0 >> 7;
            int var7 = arg4 >> 7;
            if (arg3 < 0 || arg5 < 0 || class146.field2125 - 1 < arg3 || class410.field5609 - 1 < arg5) {
                return 0;
            }
            if (var6 < 1 || var7 < 1 || var6 > (class146.field2125 - 1) || var7 > class410.field5609 - 1) {
                return 0;
            }
            boolean var8 = (class146.field2114[1][arg0 >> 7][arg4 >> 7] & 0x2) != 0;
            if ((arg0 & 0x7F) == 0) {
                boolean var9 = (class146.field2114[1][var6 - 1][arg4 >> 7] & 0x2) != 0;
                boolean var10 = (class146.field2114[1][var6][arg4 >> 7] & 0x2) != 0;
                if (var10 != var9) {
                    var8 = (class146.field2114[1][arg3][arg5] & 0x2) != 0;
                }
            }
            if ((arg4 & 0x7F) == 0) {
                boolean var11 = (class146.field2114[1][arg0 >> 7][var7 - 1] & 0x2) != 0;
                boolean var12 = (class146.field2114[1][arg0 >> 7][var7] & 0x2) != 0;
                if (var12 != var11) {
                    var8 = (class146.field2114[1][arg3][arg5] & 0x2) != 0;
                }
            }
            if (var8) {
                arg2++;
            }
        }
        return class165.field2609[arg2].method1233(arg0, arg4);
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIBIIII)Lqba;")
    public static final class345 method2375(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 >= -73) {
            method2381(31, -94);
        }
        field5528++;
        long var7 = (long) arg6 * 32147369L ^ (long) arg0 * 475427L ^ (long) arg4 * 67481L ^ (long) arg5 * 97549L ^ (long) arg3 * 986053L ^ (long) arg1 * 76724863L;
        class345 var9 = (class345) class581.field8544.method842(0, var7);
        if (var9 == null) {
            class345 var10 = class58.field738.method424(arg4, arg5, arg0, arg3, arg6, arg1);
            class581.field8544.method835((byte) 116, var7, var10);
            return var10;
        } else {
            return var9;
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(B)Z")
    public final boolean method2376(byte arg0) {
        if (arg0 == -92) {
            field5526++;
            return (this.field5529 & 0x8) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "(I)Z")
    public final boolean method2377(int arg0) {
        field5519++;
        if (arg0 != 0) {
            field5530 = null;
        }
        return (this.field5529 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IJII)V")
    public static final void method2378(int arg0, long arg1, int arg2, int arg3) {
        field5522++;
        int var5 = ((int) arg1 & arg2) >> 14;
        int var6 = (int) arg1 >> 20 & 0x3;
        int var7 = Integer.MAX_VALUE & (int) (arg1 >>> 32);
        if (var5 != 10 && var5 != 11 && var5 != 22) {
            class11.method50(arg0, 0, true, (byte) 126, arg3, 0, var5, var6, 0);
            return;
        }
        class145 var8 = class216.field3172.method1505(arg2 ^ 0xFFF862B5, var7);
        int var9;
        int var10;
        if (var6 == 0 || var6 == 2) {
            var10 = var8.field2067;
            var9 = var8.field2108;
        } else {
            var9 = var8.field2067;
            var10 = var8.field2108;
        }
        int var11 = var8.field2097;
        if (var6 != 0) {
            var11 = (var11 << var6 & 0xF) + (var11 >> 4 - var6);
        }
        class11.method50(arg0, var10, true, (byte) 123, arg3, var9, 0, 0, var11);
    }

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "(B)Z")
    public final boolean method2379(byte arg0) {
        if (arg0 <= 119) {
            return false;
        } else {
            field5527++;
            return (this.field5529 & 0x2) != 0;
        }
    }

    @OriginalMember(owner = "client!ka", name = "c", descriptor = "(B)V")
    public static void method2380(byte arg0) {
        field5530 = null;
        if (arg0 != 45) {
            method2374(75, true, 72, -100, 104, 107);
        }
        field5521 = null;
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(II)I")
    public static final int method2381(int arg0, int arg1) {
        field5517++;
        if (arg0 != -1768) {
            method2378(121, 57L, 107, 20);
        }
        int var2 = (arg1 * arg1 >> 12) * arg1 >> 12;
        int var3 = arg1 * 6 - 61440;
        int var4 = (arg1 * var3 >> 12) + 40960;
        return var2 * var4 >> 12;
    }
}
