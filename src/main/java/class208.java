import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public class class208 {

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "I")
    public static int field2952 = 0;

    @OriginalMember(owner = "client!aa", name = "e", descriptor = "[I")
    public static int[] field2955 = new int[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

    @OriginalMember(owner = "client!aa", name = "f", descriptor = "[I")
    public static int[] field2956 = new int[2500];

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "I")
    public static int field2951;

    @OriginalMember(owner = "client!aa", name = "c", descriptor = "I")
    public static int field2953;

    @OriginalMember(owner = "client!aa", name = "d", descriptor = "Lfh;")
    public static class140 field2954;

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(ZIIZIIII)V", line = 4)
    public static final void method1534(boolean arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7) {
        field2951++;
        if (!arg3 && class253.field3699 == arg2 && class289.field4179 == arg6 && class226.field3256 == arg7 || class138.method1038(true)) {
            return;
        }
        class289.field4179 = arg6;
        class226.field3256 = arg7;
        class253.field3699 = arg2;
        if (class138.method1038(true)) {
            class226.field3256 = 0;
        }
        if (arg0) {
            class59.method445(28, (byte) 102);
        } else {
            class59.method445(25, (byte) 92);
        }
        class190.method1383((byte) -66, class207.field2885, true);
        int var8 = class331.field4867;
        int var9 = class355.field5556;
        class331.field4867 = arg2 * 8 - 48;
        class355.field5556 = arg6 * 8 - 48;
        if (arg1 <= 85) {
            method1536((byte) -62);
        }
        class67.field862 = class38.method259(class253.field3699 * 8, class289.field4179 * 8);
        class260.field3764 = null;
        int var10 = class355.field5556 - var9;
        int var11 = class331.field4867 - var8;
        int var12 = class331.field4867;
        int var13 = class355.field5556;
        if (arg0) {
            class257.field3747 = 0;
            for (int var17 = 0; var17 < 32768; var17++) {
                class169 var18 = class251.field3688[var17];
                if (var18 != null) {
                    var18.field4893 -= var10 * 128;
                    var18.field4855 -= var11 * 128;
                    if (var18.field4855 >= 0 && var18.field4855 <= 13184 && var18.field4893 >= 0 && var18.field4893 <= 13184) {
                        for (int var19 = 0; var19 < 10; var19++) {
                            var18.field4842[var19] -= var11;
                            var18.field4936[var19] -= var10;
                        }
                        class305.field4455[class257.field3747++] = var17;
                    } else {
                        class251.field3688[var17].method1250((byte) -123, (class157) null);
                        class251.field3688[var17] = null;
                    }
                }
            }
        } else {
            for (int var14 = 0; var14 < 32768; var14++) {
                class169 var15 = class251.field3688[var14];
                if (var15 != null) {
                    for (int var16 = 0; var16 < 10; var16++) {
                        var15.field4842[var16] -= var11;
                        var15.field4936[var16] -= var10;
                    }
                    var15.field4855 -= var11 * 128;
                    var15.field4893 -= var10 * 128;
                }
            }
        }
        for (int var20 = 0; var20 < 2048; var20++) {
            class239 var21 = class311.field4574[var20];
            if (var21 != null) {
                for (int var22 = 0; var22 < 10; var22++) {
                    var21.field4842[var22] -= var11;
                    var21.field4936[var22] -= var10;
                }
                var21.field4893 -= var10 * 128;
                var21.field4855 -= var11 * 128;
            }
        }
        byte var23 = 0;
        byte var24 = 1;
        byte var25 = 104;
        if (var11 < 0) {
            var24 = -1;
            var25 = -1;
            var23 = 103;
        }
        byte var26 = 0;
        class56.field724 = arg7;
        byte var27 = 104;
        class359.field5616.method1700(arg4, false, (byte) -42, arg5);
        byte var28 = 1;
        if (var10 < 0) {
            var27 = -1;
            var28 = -1;
            var26 = 103;
        }
        for (int var29 = var23; var29 != var25; var29 += var24) {
            for (int var30 = var26; var30 != var27; var30 += var28) {
                int var31 = var11 + var29;
                int var32 = var30 + var10;
                for (int var33 = 0; var33 < 4; var33++) {
                    if (var31 >= 0 && var32 >= 0 && var31 < 104 && var32 < 104) {
                        class20.field221[var33][var29][var30] = class20.field221[var33][var31][var32];
                    } else {
                        class20.field221[var33][var29][var30] = null;
                    }
                }
            }
        }
        for (class146 var34 = (class146) class263.field3822.method413(1253231568); var34 != null; var34 = (class146) class263.field3822.method419(117)) {
            var34.field2039 -= var10;
            var34.field2045 -= var11;
            if (var34.field2045 < 0 || var34.field2039 < 0 || var34.field2045 >= 104 || var34.field2039 >= 104) {
                var34.method179((byte) 51);
            }
        }
        if (class116.field1499 != 0) {
            class5.field53 -= var10;
            class116.field1499 -= var11;
        }
        if (arg0) {
            class248.field3606 -= var10 * 128;
            class55.field712 -= var11;
            class135.field1846 -= var10;
            class316.field4658 -= var11;
            class48.field642 -= var10;
            class112.field1453 -= var11 * 128;
        } else {
            client.field1631 = 1;
        }
        class274.field3921 = 0;
        if (class47.field623 && arg0 && (Math.abs(var11) > 104 || Math.abs(var10) > 104)) {
            class96.method696((byte) -72);
        }
        class205.method1488((byte) 84);
        class95.field1233.method409(1986850152);
        class254.field3705.method409(1986850152);
        class187.method1365();
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(I)V", line = 263)
    public static final void method1535(int arg0) {
        class84.field1081 = null;
        class57.method432();
        int var1 = 15 / ((arg0 + 63) / 36);
        field2953++;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(B)V", line = 282)
    public static void method1536(byte arg0) {
        field2956 = null;
        if (arg0 == -54) {
            field2955 = null;
            field2954 = null;
        }
    }
}
