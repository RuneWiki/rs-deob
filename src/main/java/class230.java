import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!be")
public class class230 {

    @OriginalMember(owner = "client!be", name = "b", descriptor = "Z")
    public boolean field3106 = false;

    @OriginalMember(owner = "client!be", name = "h", descriptor = "Z")
    public boolean field3112 = true;

    @OriginalMember(owner = "client!be", name = "i", descriptor = "I")
    public int field3113 = -1;

    @OriginalMember(owner = "client!be", name = "o", descriptor = "I")
    public int field3119 = 8;

    @OriginalMember(owner = "client!be", name = "k", descriptor = "I")
    public int field3115 = 1190717;

    @OriginalMember(owner = "client!be", name = "j", descriptor = "I")
    public int field3114 = 0;

    @OriginalMember(owner = "client!be", name = "p", descriptor = "I")
    public int field3120 = 127;

    @OriginalMember(owner = "client!be", name = "l", descriptor = "Z")
    public boolean field3116 = true;

    @OriginalMember(owner = "client!be", name = "v", descriptor = "I")
    public int field3126 = 64;

    @OriginalMember(owner = "client!be", name = "u", descriptor = "I")
    public int field3125 = -1;

    @OriginalMember(owner = "client!be", name = "m", descriptor = "I")
    public int field3117 = 512;

    @OriginalMember(owner = "client!be", name = "w", descriptor = "J")
    public static long field3127 = 20000000L;

    @OriginalMember(owner = "client!be", name = "g", descriptor = "[I")
    public static int[] field3111 = new int[2];

    @OriginalMember(owner = "client!be", name = "a", descriptor = "I")
    public static int field3105;

    @OriginalMember(owner = "client!be", name = "c", descriptor = "I")
    public static int field3107;

    @OriginalMember(owner = "client!be", name = "d", descriptor = "I")
    public static int field3108;

    @OriginalMember(owner = "client!be", name = "e", descriptor = "I")
    public static int field3109;

    @OriginalMember(owner = "client!be", name = "f", descriptor = "I")
    public int field3110;

    @OriginalMember(owner = "client!be", name = "n", descriptor = "I")
    public static int field3118;

    @OriginalMember(owner = "client!be", name = "q", descriptor = "I")
    public static int field3121;

    @OriginalMember(owner = "client!be", name = "t", descriptor = "I")
    public static int field3124;

    @OriginalMember(owner = "client!be", name = "x", descriptor = "I")
    public static int field3128;

    @OriginalMember(owner = "client!be", name = "s", descriptor = "Lbj;")
    public class547 field3123;

    @OriginalMember(owner = "client!be", name = "r", descriptor = "Lkv;")
    public static class684 field3122;

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(Z)V", line = 3)
    public static final void method1365(boolean arg0) {
        class375.field5277 = -1;
        class521.field7260 = -1;
        class496.field6948 = null;
        if (!arg0) {
            method1371(74, -81, -8, 44, 64, null, 3);
        }
        class382.field5486 = null;
        class321.field4463 = null;
        class515.field7152 = null;
        class601.field8132 = null;
        class634.field8539 = null;
        class344.field4893 = -1;
        class513.field7094 = null;
        class653.field8743 = -1;
        field3109++;
        class72.field1094.method2473((byte) 50);
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(IBIIIII)V", line = 29)
    public static final void method1366(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg1 != 1) {
            field3118 = 12;
        }
        if (class332.field4707.field4782.method1140(0) != 0 && arg4 != 0 && class12.field108 < 50 && arg2 != -1) {
            class669.field9235[class12.field108++] = new class396((byte) 1, arg2, arg4, arg5, arg0, arg3, arg6, null);
        }
        field3108++;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(I)V", line = 53)
    public final void method1367(int arg0) {
        this.field3119 = this.field3110 | this.field3119 << 8;
        field3121++;
        if (arg0 != 0) {
            method1365(false);
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(ILdc;)V", line = 85)
    public final void method1368(int arg0, class63 arg1) {
        field3124++;
        while (true) {
            int var3 = arg1.method505((byte) -119);
            if (var3 == 0) {
                if (arg0 == 0) {
                    return;
                } else {
                    this.field3119 = 2;
                    return;
                }
            }
            this.method1372(var3, arg1, (byte) -117);
        }
    }

    @OriginalMember(owner = "client!be", name = "b", descriptor = "(I)V", line = 109)
    public static final void method1369(int arg0) {
        field3128++;
        int var1 = 0;
        for (int var2 = 0; var2 < class277.field4036; var2++) {
            for (int var4 = 0; var4 < class667.field9202; var4++) {
                if (class362.method2299(var2, var1, var4, class137.field1948, 802127056, true)) {
                    var1++;
                }
                if (var1 >= 512) {
                    return;
                }
            }
        }
        int var3 = 18 % ((arg0 - 46) / 50);
    }

    @OriginalMember(owner = "client!be", name = "c", descriptor = "(I)V", line = 144)
    public static void method1370(int arg0) {
        field3122 = null;
        int var1 = -62 % ((58 - arg0) / 54);
        field3111 = null;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(IIIIILha;I)V", line = 157)
    public static final void method1371(int arg0, int arg1, int arg2, int arg3, int arg4, class548 arg5, int arg6) {
        if ((class622.field8327 == null || class702.field9784 == null || class81.field1166 == null) && class671.field9318.method1578(class629.field8458, (byte) -81) && class671.field9318.method1578(class62.field891, (byte) -81) && class671.field9318.method1578(class156.field2197, (byte) -81)) {
            class52 var7 = class52.method374(class671.field9318, class62.field891, 0);
            class702.field9784 = arg5.method1496(var7, true);
            var7.method375();
            class515.field7185 = arg5.method1496(var7, true);
            class622.field8327 = arg5.method1496(class52.method374(class671.field9318, class629.field8458, 0), true);
            class52 var8 = class52.method374(class671.field9318, class156.field2197, 0);
            class81.field1166 = arg5.method1496(var8, true);
            var8.method375();
            class535.field7425 = arg5.method1496(var8, true);
        }
        field3105++;
        if (arg3 != 0) {
            field3127 = 100L;
        }
        if (class622.field8327 == null || class702.field9784 == null || class81.field1166 == null) {
            return;
        }
        int var9 = (arg2 - class81.field1166.method1955() * 2) / class622.field8327.method1955();
        for (int var10 = 0; var10 < var9; var10++) {
            class622.field8327.method1970(class81.field1166.method1955() + arg0 + var10 * class622.field8327.method1955(), arg1 + arg6 - class622.field8327.method1952());
        }
        int var11 = (arg6 - class81.field1166.method1952() - arg4) / class702.field9784.method1952();
        for (int var12 = 0; var12 < var11; var12++) {
            class702.field9784.method1970(arg0, class702.field9784.method1952() * var12 + arg1 + arg4);
            class515.field7185.method1970(arg2 + (arg0 - class515.field7185.method1955()), var12 * class702.field9784.method1952() + arg1 + arg4);
        }
        class81.field1166.method1970(arg0, arg1 + arg6 - class81.field1166.method1952());
        class535.field7425.method1970(arg0 + arg2 - class81.field1166.method1955(), -class81.field1166.method1952() + arg6 + arg1);
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(ILdc;B)V", line = 214)
    private final void method1372(int arg0, class63 arg1, byte arg2) {
        if (arg2 > -75) {
            return;
        }
        if (arg0 == 1) {
            this.field3114 = class166.method1038(arg1.method476((byte) 117), (byte) 68);
        } else if (arg0 == 2) {
            this.field3125 = arg1.method505((byte) -119);
        } else if (arg0 == 3) {
            this.field3125 = arg1.method482(-772591672);
            if (this.field3125 == 65535) {
                this.field3125 = -1;
            }
        } else if (arg0 == 5) {
            this.field3116 = false;
        } else if (arg0 == 7) {
            this.field3113 = class166.method1038(arg1.method476((byte) 108), (byte) 68);
        } else if (arg0 == 8) {
            this.field3123.field7605 = this.field3110;
        } else if (arg0 == 9) {
            this.field3117 = arg1.method482(-772591672) << 2;
        } else if (arg0 == 10) {
            this.field3112 = false;
        } else if (arg0 == 11) {
            this.field3119 = arg1.method505((byte) -119);
        } else if (arg0 == 12) {
            this.field3106 = true;
        } else if (arg0 == 13) {
            this.field3115 = arg1.method476((byte) -7);
        } else if (arg0 == 14) {
            this.field3126 = arg1.method505((byte) -119) << 2;
        } else if (arg0 == 16) {
            this.field3120 = arg1.method505((byte) -119);
        }
        field3107++;
    }
}
