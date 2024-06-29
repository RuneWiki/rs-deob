import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ifa")
public class class75 {

    @OriginalMember(owner = "client!ifa", name = "a", descriptor = "I")
    public static int field1146;

    @OriginalMember(owner = "client!ifa", name = "b", descriptor = "I")
    public static int field1147;

    @OriginalMember(owner = "client!ifa", name = "c", descriptor = "I")
    public static int field1148;

    @OriginalMember(owner = "client!ifa", name = "d", descriptor = "I")
    public static int field1149;

    @OriginalMember(owner = "client!ifa", name = "e", descriptor = "I")
    public static int field1150;

    @OriginalMember(owner = "client!ifa", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method688(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1149++;
        int var8 = arg1 + arg6;
        int var9 = arg0 - arg6;
        if (arg2 != 1) {
            return;
        }
        for (int var10 = arg1; var10 < var8; var10++) {
            class379.method2284(arg4, arg7, class74.field1144[var10], arg3, 2);
        }
        int var11 = arg7 - arg6;
        for (int var12 = arg0; var12 > var9; var12--) {
            class379.method2284(arg4, arg7, class74.field1144[var12], arg3, 2);
        }
        int var13 = arg4 + arg6;
        for (int var14 = var8; var14 <= var9; var14++) {
            int[] var15 = class74.field1144[var14];
            class379.method2284(arg4, var13, var15, arg3, 2);
            class379.method2284(var13, var11, var15, arg5, arg2 ^ 0x3);
            class379.method2284(var11, arg7, var15, arg3, 2);
        }
    }

    @OriginalMember(owner = "client!ifa", name = "a", descriptor = "(IILvu;I)J")
    public static final long method689(int arg0, int arg1, class226 arg2, int arg3) {
        if (arg3 != 15606) {
            return 104L;
        }
        field1147++;
        long var4 = 4194304L;
        long var6 = Long.MIN_VALUE;
        class416 var8 = class312.field4418.method369((byte) 125, arg2.method1165((byte) 122));
        long var9 = (long) (arg2.method1166(arg3 - 15491) | 0x10000 << 14 | arg0 << 7 | arg1 | arg2.method1174((byte) -121) << 20);
        if (var8.field5754 == 0) {
            var9 |= var6;
        }
        if (var8.field5727 == 1) {
            var9 |= var4;
        }
        return var9 | (long) arg2.method1165((byte) 113) << 32;
    }

    @OriginalMember(owner = "client!ifa", name = "a", descriptor = "(ZI)V")
    public static final void method690(boolean arg0, int arg1) {
        field1150++;
        if (class141.field2306 == arg1) {
            return;
        }
        if (arg1 == 13) {
            if (class692.field9757 == null) {
                class594.method3469(class347.field4939, class110.field1563, class599.field8546, -1);
            } else {
                class554.method3197(-101, class347.field4939);
            }
        }
        if (arg1 != 13 && class94.field1347 != null) {
            class94.field1347.method183((byte) 88);
            class94.field1347 = null;
        }
        if (arg1 == 3) {
            class98.method811(class379.field5314 != class222.field3265, (byte) 42);
        }
        if (arg1 == 7) {
            class363.method2186(class420.field5819 != class379.field5314, 0);
        }
        if (arg1 == 5) {
            if (class692.field9757 == null) {
                class91.method778(class110.field1563, 125, class599.field8546);
            } else {
                class17.method175(true);
            }
        } else if (arg1 == 6) {
            if (class692.field9757 == null) {
                class594.method3469(class347.field4939, class110.field1563, class599.field8546, -1);
            } else {
                class554.method3197(-102, class347.field4939);
            }
        } else if (arg1 == 9) {
            if (class692.field9757 == null) {
                class594.method3469(class347.field4939, class110.field1563, class599.field8546, -1);
            } else {
                class554.method3197(-121, class347.field4939);
            }
        } else if (arg1 == 12) {
            if (class692.field9757 == null) {
                class91.method778(class110.field1563, 86, class599.field8546);
            } else {
                class17.method175(true);
            }
        }
        if (class532.method3099(class141.field2306, 0)) {
            class461.field6293.field7051 = 2;
            class123.field2091.field7051 = 2;
            class265.field3739.field7051 = 2;
            class724.field10088.field7051 = 2;
            class469.field6386.field7051 = 2;
            class629.field8924.field7051 = 2;
            class58.field898.field7051 = 2;
        }
        if (class532.method3099(arg1, 0)) {
            class165.field2524 = 0;
            class472.field6427 = 0;
            class183.field2786 = 1;
            class106.field1524 = 0;
            class83.field1247 = 1;
            class180.method1313(true, 25932);
            class461.field6293.field7051 = 1;
            class123.field2091.field7051 = 1;
            class265.field3739.field7051 = 1;
            class724.field10088.field7051 = 1;
            class469.field6386.field7051 = 1;
            class629.field8924.field7051 = 1;
            class58.field898.field7051 = 1;
        }
        if (!arg0) {
            return;
        }
        if (arg1 == 11 || arg1 == 3) {
            client.method894((byte) -91);
        }
        boolean var2 = arg1 == 2 || class251.method1665(-110, arg1) || class761.method4207((byte) 99, arg1);
        boolean var3 = class141.field2306 == 2 || class251.method1665(-126, class141.field2306) || class761.method4207((byte) 99, class141.field2306);
        if (var2 != var3) {
            if (var2) {
                class371.field5236 = class743.field10326;
                if (class420.field5820.field9478.method1367(17539) == 0) {
                    class473.method2762(2, false);
                } else {
                    class121.method1059(0, false, 4080, class420.field5820.field9478.method1367(17539), 2, class743.field10326, class399.field5495);
                    class646.method3658((byte) -112);
                }
                class138.field2286.method1842(-2, false);
            } else {
                class473.method2762(2, false);
                class138.field2286.method1842(-2, true);
            }
        }
        if (class532.method3099(arg1, 0) || arg1 == 13) {
            class686.field9702.method138();
        }
        class141.field2306 = arg1;
    }

    @OriginalMember(owner = "client!ifa", name = "a", descriptor = "(IIIIIZI)V")
    public static final void method691(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
        field1146++;
        if ((arg5 ? class420.field5820.field9451.method1367(arg6 ^ 0x4483) : class420.field5820.field9448.method1367(17539)) != arg6 && arg0 != 0 && class57.field884 < 50 && arg2 != -1) {
            class278.field4014[class57.field884++] = new class420((byte) (arg5 ? 3 : 2), arg2, arg0, arg3, arg1, 0, arg4, null);
        }
    }

    @OriginalMember(owner = "client!ifa", name = "a", descriptor = "(Lha;II[[[BIIBIIIIII)V")
    public static final void method692(class475 arg0, int arg1, int arg2, byte[][][] arg3, int arg4, int arg5, byte arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        field1148++;
        if (arg8 == 0 || arg10 == 0) {
            return;
        }
        if (arg8 == 9) {
            arg9 = arg9 + 1 & 0x3;
            arg8 = 1;
        }
        if (arg8 == 10) {
            arg9 = arg9 + 3 & 0x3;
            arg8 = 1;
        }
        if (arg8 == 11) {
            arg9 = arg9 + 3 & 0x3;
            arg8 = 8;
        }
        arg0.method510(arg1, arg11, arg7, arg2, arg4, arg12, arg3[arg8 - 1][arg9], arg10, arg5);
        if (arg6 <= 90) {
            method689(109, 123, null, 20);
        }
    }
}
