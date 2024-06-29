import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public class class151 extends class31 {

    @OriginalMember(owner = "client!ib", name = "S", descriptor = "Ljava/lang/Object;")
    private Object field2683;

    @OriginalMember(owner = "client!ib", name = "W", descriptor = "Lpj;")
    public static class237 field2687 = class33.method353(":tradereq:", 78);

    @OriginalMember(owner = "client!ib", name = "Z", descriptor = "Lpj;")
    public static class237 field2690 = class33.method353(")4j", 118);

    @OriginalMember(owner = "client!ib", name = "ab", descriptor = "Z")
    public static boolean field2691 = false;

    @OriginalMember(owner = "client!ib", name = "P", descriptor = "I")
    public static int field2680;

    @OriginalMember(owner = "client!ib", name = "Q", descriptor = "I")
    public static int field2681;

    @OriginalMember(owner = "client!ib", name = "R", descriptor = "I")
    public static int field2682;

    @OriginalMember(owner = "client!ib", name = "V", descriptor = "I")
    public static int field2686;

    @OriginalMember(owner = "client!ib", name = "X", descriptor = "I")
    public static int field2688;

    @OriginalMember(owner = "client!ib", name = "Y", descriptor = "I")
    public static int field2689;

    @OriginalMember(owner = "client!ib", name = "bb", descriptor = "I")
    public static int field2692;

    @OriginalMember(owner = "client!ib", name = "U", descriptor = "Lfa;")
    public static class239 field2685;

    @OriginalMember(owner = "client!ib", name = "T", descriptor = "Ljd;")
    public static class86 field2684;

    @OriginalMember(owner = "client!ib", name = "h", descriptor = "(I)V")
    public static void method1031(int arg0) {
        field2687 = null;
        field2684 = null;
        if (arg0 >= -47) {
            method1032(100, (class215) null);
        }
        field2690 = null;
        field2685 = null;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(ILsb;)V")
    public static final void method1032(int arg0, class215 arg1) {
        field2686++;
        if (arg1.field3677 == 0) {
            return;
        }
        if (arg1.field3719 != -1 && arg1.field3719 < 32768) {
            class210 var2 = class232.field4022[arg1.field3719];
            if (var2 != null) {
                int var3 = arg1.field3710 - var2.field3710;
                int var4 = arg1.field3700 - var2.field3700;
                if (var3 != 0 || var4 != 0) {
                    arg1.field3717 = (int) (Math.atan2((double) var3, (double) var4) * 325.949D) & 0x7FF;
                }
            }
        }
        if (arg1.field3719 >= 32768) {
            int var5 = arg1.field3719 - 32768;
            if (class272.field4679 == var5) {
                var5 = 2047;
            }
            class271 var6 = class232.field4025[var5];
            if (var6 != null) {
                int var7 = arg1.field3710 - var6.field3710;
                int var8 = arg1.field3700 - var6.field3700;
                if (var7 != 0 || var8 != 0) {
                    arg1.field3717 = (int) (Math.atan2((double) var7, (double) var8) * 325.949D) & 0x7FF;
                }
            }
        }
        if ((arg1.field3706 != 0 || arg1.field3730 != 0) && (arg1.field3740 == 0 || arg1.field3701 > 0)) {
            int var9 = arg1.field3710 - (-(arg1.method1441((byte) 87) * 64) + (-class235.field4087 - class235.field4087 + arg1.field3706) * 64) - 64;
            int var10 = arg1.field3700 - ((((arg1.field3730 - class27.field494 - class27.field494) * 64) + 64) - (arg1.method1441((byte) 72) * 64));
            if (var9 != 0 || var10 != 0) {
                arg1.field3717 = (int) (Math.atan2((double) var9, (double) var10) * 325.949D) & 0x7FF;
            }
            arg1.field3706 = 0;
            arg1.field3730 = 0;
        }
        int var11 = arg1.field3717 - arg1.field3697 & 0x7FF;
        if (~var11 == arg0) {
            arg1.field3724 = 0;
            return;
        }
        arg1.field3724++;
        if (var11 <= 1024) {
            boolean var12 = true;
            arg1.field3697 += arg1.field3677;
            if (var11 < arg1.field3677 || var11 > 2048 - arg1.field3677) {
                arg1.field3697 = arg1.field3717;
                var12 = false;
            }
            if (arg1.field3723 == arg1.field3696 && (arg1.field3724 > 25 || var12)) {
                if (arg1.field3678 == -1) {
                    arg1.field3696 = arg1.field3711;
                } else {
                    arg1.field3696 = arg1.field3678;
                }
            }
        } else {
            boolean var13 = true;
            arg1.field3697 -= arg1.field3677;
            if (var11 < arg1.field3677 || (2048 - arg1.field3677) < var11) {
                arg1.field3697 = arg1.field3717;
                var13 = false;
            }
            if (arg1.field3723 == arg1.field3696 && (arg1.field3724 > 25 || var13)) {
                if (arg1.field3687 == -1) {
                    arg1.field3696 = arg1.field3711;
                } else {
                    arg1.field3696 = arg1.field3687;
                }
            }
        }
        arg1.field3697 &= 0x7FF;
    }

    @OriginalMember(owner = "client!ib", name = "<init>", descriptor = "(Ljava/lang/Object;)V")
    public class151(Object arg0) {
        this.field2683 = arg0;
    }

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "(B)Z")
    public static final boolean method1033(byte arg0) {
        field2689++;
        if (arg0 >= -24) {
            field2682 = 44;
        }
        return class271.field4649;
    }

    @OriginalMember(owner = "client!ib", name = "g", descriptor = "(I)Ljava/lang/Object;")
    public final Object method286(int arg0) {
        field2692++;
        if (arg0 != 12) {
            this.method286(-68);
        }
        return this.field2683;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(BIILw;)V")
    public static final void method1034(byte arg0, int arg1, int arg2, class141 arg3) {
        field2681++;
        if (class111.field1952 != 0 && class111.field1952 != 3 || !arg3.method980(1)) {
            return;
        }
        int var4 = arg3.field2442[arg1];
        if (var4 > arg2 || arg2 > arg3.field2429[arg1] + var4) {
            return;
        }
        int var5 = arg2 - arg3.field2575 / 2;
        int var6 = class257.field4417 + class13.field222 & 0x7FF;
        int var7 = arg1 - arg3.field2490 / 2;
        int var8 = class150.field2676[var6];
        int var9 = 121 / ((arg0 - 23) / 62);
        int var10 = (class85.field1577 + 256) * var8 >> 8;
        int var11 = class150.field2670[var6];
        int var12 = (class85.field1577 + 256) * var11 >> 8;
        int var13 = var7 * var10 - (var5 * var12) >> 11;
        int var14 = var5 * var10 + var7 * var12 >> 11;
        int var15 = class229.field3911.field3710 + var14 >> 7;
        int var16 = class229.field3911.field3700 - var13 >> 7;
        if (class64.field1283 > 0 && class119.field2083[82] && class119.field2083[81]) {
            class196.method1349(325, class27.field494 + var16, class274.field4798, class235.field4087 + var15);
            return;
        }
        boolean var17 = class210.method1406(0, 0, var16, var15, 0, 1, (byte) -56, class229.field3911.field3743[0], 0, class229.field3911.field3715[0], true, 0);
        if (!var17) {
            return;
        }
        class223.field3830.method293((byte) 125, var5);
        class223.field3830.method293((byte) 125, var7);
        class223.field3830.method350((byte) 19, class257.field4417);
        class223.field3830.method293((byte) 125, 57);
        class223.field3830.method293((byte) 125, class13.field222);
        class223.field3830.method293((byte) 125, class85.field1577);
        class223.field3830.method293((byte) 125, 89);
        class223.field3830.method350((byte) 19, class229.field3911.field3710);
        class223.field3830.method350((byte) 19, class229.field3911.field3700);
        class223.field3830.method293((byte) 125, class94.field1678);
        class223.field3830.method293((byte) 125, 63);
    }

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "(Z)Z")
    public final boolean method289(boolean arg0) {
        if (arg0) {
            field2688++;
            return false;
        } else {
            return false;
        }
    }
}
