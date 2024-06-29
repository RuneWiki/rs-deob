import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mj")
public class class447 {

    @OriginalMember(owner = "client!mj", name = "j", descriptor = "I")
    public int field6878 = 0;

    @OriginalMember(owner = "client!mj", name = "g", descriptor = "Z")
    private boolean field6875 = false;

    @OriginalMember(owner = "client!mj", name = "q", descriptor = "I")
    public int field6885 = 0;

    @OriginalMember(owner = "client!mj", name = "e", descriptor = "I")
    public static int field6873 = 0;

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "I")
    public static int field6869;

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "I")
    public static int field6870;

    @OriginalMember(owner = "client!mj", name = "c", descriptor = "I")
    public int field6871;

    @OriginalMember(owner = "client!mj", name = "d", descriptor = "I")
    public int field6872;

    @OriginalMember(owner = "client!mj", name = "f", descriptor = "I")
    public int field6874;

    @OriginalMember(owner = "client!mj", name = "h", descriptor = "I")
    public int field6876;

    @OriginalMember(owner = "client!mj", name = "l", descriptor = "I")
    public int field6880;

    @OriginalMember(owner = "client!mj", name = "m", descriptor = "I")
    public static int field6881;

    @OriginalMember(owner = "client!mj", name = "n", descriptor = "I")
    public int field6882;

    @OriginalMember(owner = "client!mj", name = "o", descriptor = "I")
    public int field6883;

    @OriginalMember(owner = "client!mj", name = "p", descriptor = "I")
    private int field6884;

    @OriginalMember(owner = "client!mj", name = "r", descriptor = "I")
    public static int field6886;

    @OriginalMember(owner = "client!mj", name = "s", descriptor = "I")
    public static int field6887;

    @OriginalMember(owner = "client!mj", name = "t", descriptor = "I")
    public int field6888;

    @OriginalMember(owner = "client!mj", name = "u", descriptor = "I")
    public int field6889;

    @OriginalMember(owner = "client!mj", name = "k", descriptor = "J")
    public long field6879;

    @OriginalMember(owner = "client!mj", name = "i", descriptor = "[I")
    public static int[] field6877;

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(Lha;I)V")
    public final void method2669(class40 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method257((byte) 72);
            if (var3 == 0) {
                if (arg1 != 0) {
                    field6873 = -103;
                }
                field6881++;
                return;
            }
            this.method2673(var3, (byte) -112, arg0);
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(IBIIII)I")
    public static final int method2670(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 >= -117) {
            return -93;
        }
        field6887++;
        if (class99.field1801 == null) {
            return 0;
        }
        if (arg3 < 3) {
            int var6 = arg5 >> 7;
            int var7 = arg0 >> 7;
            if (arg4 < 0 || arg2 < 0 || arg4 > class150.field2422 - 1 || class21.field272 - 1 < arg2) {
                return 0;
            }
            if (var6 < 1 || var7 < 1 || var6 > (class150.field2422 - 1) || class21.field272 - 1 < var7) {
                return 0;
            }
            boolean var8 = (class146.field2369[1][arg5 >> 7][arg0 >> 7] & 0x2) != 0;
            if ((arg5 & 0x7F) == 0) {
                boolean var9 = (class146.field2369[1][var6 - 1][arg0 >> 7] & 0x2) != 0;
                boolean var10 = (class146.field2369[1][var6][arg0 >> 7] & 0x2) != 0;
                if (var10 != var9) {
                    var8 = (class146.field2369[1][arg4][arg2] & 0x2) != 0;
                }
            }
            if ((arg0 & 0x7F) == 0) {
                boolean var11 = (class146.field2369[1][arg5 >> 7][var7 - 1] & 0x2) != 0;
                boolean var12 = (class146.field2369[1][arg5 >> 7][var7] & 0x2) != 0;
                if (var11 != var12) {
                    var8 = (class146.field2369[1][arg4][arg2] & 0x2) != 0;
                }
            }
            if (var8) {
                arg3++;
            }
        }
        return class99.field1801[arg3].method314(arg5, arg0);
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(I)V")
    public static final void method2671(int arg0) {
        field6869++;
        int var1 = class328.field4921;
        int[] var2 = class280.field4247;
        for (int var3 = 0; var3 < var1; var3++) {
            class47 var4 = class224.field3450[var2[var3]];
            if (var4 != null) {
                class289.method1764(var4, 44, var4.method337(0));
            }
        }
        if (arg0 <= 104) {
            field6877 = null;
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(Z)V")
    public static void method2672(boolean arg0) {
        field6877 = null;
        if (arg0) {
            method2670(122, (byte) 99, 77, 99, 81, -97);
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(IBLha;)V")
    private final void method2673(int arg0, byte arg1, class40 arg2) {
        if (arg1 >= -11) {
            method2672(false);
        }
        if (arg0 == 1) {
            this.field6884 = arg2.method254((byte) -101);
        } else if (arg0 == 2) {
            arg2.method257((byte) 103);
        } else if (arg0 == 3) {
            this.field6889 = arg2.method255((byte) 96);
            this.field6888 = arg2.method255((byte) 96);
            this.field6871 = arg2.method255((byte) 96);
        } else if (arg0 == 4) {
            this.field6874 = arg2.method257((byte) 116);
            this.field6880 = arg2.method255((byte) 96);
        } else if (arg0 == 6) {
            this.field6883 = arg2.method257((byte) 108);
        } else if (arg0 == 8) {
            this.field6878 = 1;
        } else if (arg0 == 9) {
            this.field6885 = 1;
        } else if (arg0 == 10) {
            this.field6875 = true;
        }
        field6870++;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(III)V")
    public static final void method2674(int arg0, int arg1, int arg2) {
        class268 var3 = class321.field4830[arg0][arg1][arg2];
        if (var3 == null) {
            return;
        }
        if (var3.field4059 != null) {
            var3.field4059 = null;
        }
        if (var3.field4063 != null) {
            var3.field4063 = null;
        }
    }

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "(I)V")
    public final void method2675(int arg0) {
        field6886++;
        this.field6872 = class195.field3077[this.field6884 << 3];
        this.field6876 = (int) Math.sqrt((double) (this.field6871 * this.field6871 + this.field6889 * this.field6889 + this.field6888 * this.field6888));
        if (this.field6880 == 0) {
            this.field6880 = 1;
        }
        if (this.field6874 == 0) {
            this.field6879 = 2147483647L;
        } else if (this.field6874 == 1) {
            this.field6879 = (this.field6876 * 8 / this.field6880);
            this.field6879 *= this.field6879;
        } else if (this.field6874 == 2) {
            this.field6879 = (this.field6876 * 8 / this.field6880);
        }
        if (arg0 > 32 && this.field6875) {
            this.field6876 *= -1;
        }
    }
}
