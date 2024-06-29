import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dk")
public class class202 extends class25 {

    @OriginalMember(owner = "client!dk", name = "n", descriptor = "I")
    public int field3454;

    @OriginalMember(owner = "client!dk", name = "w", descriptor = "I")
    public int field3463;

    @OriginalMember(owner = "client!dk", name = "r", descriptor = "I")
    public int field3458;

    @OriginalMember(owner = "client!dk", name = "s", descriptor = "I")
    public int field3459;

    @OriginalMember(owner = "client!dk", name = "o", descriptor = "Lcd;")
    public static class64 field3455 = class44.method335((byte) 71, "; Max)2Age=");

    @OriginalMember(owner = "client!dk", name = "q", descriptor = "I")
    public static int field3457 = -1;

    @OriginalMember(owner = "client!dk", name = "p", descriptor = "I")
    public static int field3456 = 1;

    @OriginalMember(owner = "client!dk", name = "m", descriptor = "I")
    public static int field3453 = 0;

    @OriginalMember(owner = "client!dk", name = "v", descriptor = "Z")
    public static boolean field3462 = true;

    @OriginalMember(owner = "client!dk", name = "y", descriptor = "Lcd;")
    public static class64 field3465 = class44.method335((byte) 71, "welle2:");

    @OriginalMember(owner = "client!dk", name = "t", descriptor = "I")
    public static int field3460;

    @OriginalMember(owner = "client!dk", name = "u", descriptor = "I")
    public static int field3461;

    @OriginalMember(owner = "client!dk", name = "x", descriptor = "I")
    public static int field3464;

    @OriginalMember(owner = "client!dk", name = "z", descriptor = "I")
    public static int field3466;

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "(IBI)Z", line = 14)
    public final boolean method1412(int arg0, byte arg1, int arg2) {
        if (arg1 >= -46) {
            return false;
        } else {
            field3461++;
            return this.field3458 <= arg2 && arg2 <= this.field3463 && this.field3459 <= arg0 && this.field3454 >= arg0;
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(II)I", line = 37)
    public static final int method1413(int arg0, int arg1) {
        field3466++;
        if (arg0 != -2236) {
            method1415((byte) 65);
        }
        int var2 = arg1 & 0x3F;
        int var3 = arg1 >> 6 & 0x3;
        if (var2 == 18) {
            if (var3 == 0) {
                return 1;
            }
            if (var3 == 1) {
                return 2;
            }
            if (var3 == 2) {
                return 4;
            }
            if (var3 == 3) {
                return 8;
            }
        } else if (var2 == 19 || var2 == 21) {
            if (var3 == 0) {
                return 16;
            }
            if (var3 == 1) {
                return 32;
            }
            if (var3 == 2) {
                return 64;
            }
            if (var3 == 3) {
                return 128;
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(IIIII)V", line = 98)
    public static final void method1414(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3464++;
        int var5 = 0;
        int var6 = arg1;
        if (arg4 != 2) {
            return;
        }
        int var7 = -1;
        int var8 = -arg1;
        int var9 = class160.method1155(class153.field2714, class290.field4976, 268435455, arg1 + arg2);
        int var10 = class160.method1155(class153.field2714, class290.field4976, 268435455, arg2 - arg1);
        class31.method268(var9, 119, var10, class124.field2241[arg0], arg3);
        while (var6 > var5) {
            var7 += 2;
            var8 += var7;
            if (var8 > 0) {
                var6--;
                var8 -= var6 << 1;
                int var11 = arg0 - var6;
                int var12 = arg0 + var6;
                if (class180.field3098 <= var12 && var11 <= class201.field3444) {
                    int var13 = class160.method1155(class153.field2714, class290.field4976, arg4 ^ 0xFFFFFFD, arg2 + var5);
                    int var14 = class160.method1155(class153.field2714, class290.field4976, 268435455, arg2 - var5);
                    if (var12 <= class201.field3444) {
                        class31.method268(var13, 118, var14, class124.field2241[var12], arg3);
                    }
                    if (class180.field3098 <= var11) {
                        class31.method268(var13, 121, var14, class124.field2241[var11], arg3);
                    }
                }
            }
            var5++;
            int var15 = arg0 - var5;
            int var16 = arg0 + var5;
            if (var16 >= class180.field3098 && class201.field3444 >= var15) {
                int var17 = class160.method1155(class153.field2714, class290.field4976, arg4 ^ 0xFFFFFFD, arg2 + var6);
                int var18 = class160.method1155(class153.field2714, class290.field4976, 268435455, arg2 - var6);
                if (class201.field3444 >= var16) {
                    class31.method268(var17, arg4 + 116, var18, class124.field2241[var16], arg3);
                }
                if (var15 >= class180.field3098) {
                    class31.method268(var17, 125, var18, class124.field2241[var15], arg3);
                }
            }
        }
    }

    @OriginalMember(owner = "client!dk", name = "<init>", descriptor = "(IIII)V", line = 179)
    public class202(int arg0, int arg1, int arg2, int arg3) {
        this.field3454 = arg3;
        this.field3463 = arg2;
        this.field3458 = arg0;
        this.field3459 = arg1;
    }

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "(B)V", line = 191)
    public static void method1415(byte arg0) {
        if (arg0 != 26) {
            field3457 = 18;
        }
        field3455 = null;
        field3465 = null;
    }

    @OriginalMember(owner = "client!dk", name = "d", descriptor = "(I)Z", line = 205)
    public static final boolean method1416(int arg0) {
        field3460++;
        class213 var1 = class29.field477;
        synchronized (class29.field477) {
            if (class27.field439 == class146.field2587) {
                return false;
            }
            class242.field4196 = class131.field2337[class27.field439];
            class211.field3564 = class222.field3766[class27.field439];
            class27.field439 = class27.field439 + 1 & 0x7F;
            if (arg0 != 32) {
                field3456 = 96;
            }
            return true;
        }
    }
}
