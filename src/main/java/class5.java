import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public class class5 extends class68 {

    @OriginalMember(owner = "client!ma", name = "L", descriptor = "[Lk;")
    public class240[] field54 = new class240[5];

    @OriginalMember(owner = "client!ma", name = "R", descriptor = "[I")
    public int[] field60 = new int[5];

    @OriginalMember(owner = "client!ma", name = "Z", descriptor = "I")
    public int field67 = 0;

    @OriginalMember(owner = "client!ma", name = "t", descriptor = "I")
    public int field36;

    @OriginalMember(owner = "client!ma", name = "M", descriptor = "I")
    public int field55;

    @OriginalMember(owner = "client!ma", name = "Q", descriptor = "I")
    public int field59;

    @OriginalMember(owner = "client!ma", name = "u", descriptor = "I")
    public int field37;

    @OriginalMember(owner = "client!ma", name = "E", descriptor = "Lce;")
    public static class126 field47 = class206.method1445(-7923, "unzap");

    @OriginalMember(owner = "client!ma", name = "s", descriptor = "Lce;")
    public static class126 field35 = class206.method1445(-7923, "brillant2:");

    @OriginalMember(owner = "client!ma", name = "F", descriptor = "Lce;")
    public static class126 field48 = class206.method1445(-7923, "_labels");

    @OriginalMember(owner = "client!ma", name = "N", descriptor = "I")
    public static int field56 = 0;

    @OriginalMember(owner = "client!ma", name = "x", descriptor = "I")
    public static int field40;

    @OriginalMember(owner = "client!ma", name = "y", descriptor = "I")
    public int field41;

    @OriginalMember(owner = "client!ma", name = "z", descriptor = "I")
    public static int field42;

    @OriginalMember(owner = "client!ma", name = "I", descriptor = "I")
    public int field51;

    @OriginalMember(owner = "client!ma", name = "K", descriptor = "I")
    public int field53;

    @OriginalMember(owner = "client!ma", name = "O", descriptor = "I")
    public static int field57;

    @OriginalMember(owner = "client!ma", name = "P", descriptor = "I")
    public static int field58;

    @OriginalMember(owner = "client!ma", name = "S", descriptor = "I")
    public int field61;

    @OriginalMember(owner = "client!ma", name = "T", descriptor = "I")
    public int field62;

    @OriginalMember(owner = "client!ma", name = "G", descriptor = "Lmb;")
    public class107 field49;

    @OriginalMember(owner = "client!ma", name = "D", descriptor = "Lne;")
    public class130 field46;

    @OriginalMember(owner = "client!ma", name = "A", descriptor = "Lcf;")
    public class260 field43;

    @OriginalMember(owner = "client!ma", name = "C", descriptor = "Lcc;")
    public static class313 field45;

    @OriginalMember(owner = "client!ma", name = "v", descriptor = "Lma;")
    public class5 field38;

    @OriginalMember(owner = "client!ma", name = "X", descriptor = "Lvb;")
    public class74 field65;

    @OriginalMember(owner = "client!ma", name = "B", descriptor = "Loe;")
    public class77 field44;

    @OriginalMember(owner = "client!ma", name = "J", descriptor = "Lqk;")
    public class8 field52;

    @OriginalMember(owner = "client!ma", name = "w", descriptor = "Z")
    public boolean field39;

    @OriginalMember(owner = "client!ma", name = "H", descriptor = "Z")
    public boolean field50;

    @OriginalMember(owner = "client!ma", name = "V", descriptor = "Z")
    public static boolean field63;

    @OriginalMember(owner = "client!ma", name = "W", descriptor = "Z")
    public boolean field64;

    @OriginalMember(owner = "client!ma", name = "Y", descriptor = "Z")
    public static boolean field66;

    @OriginalMember(owner = "client!ma", name = "r", descriptor = "[Lie;")
    public static class2[] field34;

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "(I)V", line = 4)
    public static void method29(int arg0) {
        if (arg0 != 1) {
            return;
        }
        field35 = null;
        field45 = null;
        field34 = null;
        field47 = null;
        field48 = null;
    }

    @OriginalMember(owner = "client!ma", name = "c", descriptor = "(I)V", line = 27)
    public static final void method30(int arg0) {
        class103.field1645.method1238(254, 82);
        class234.field3946++;
        field57++;
        class103.field1645.method933(-3, class45.method282(76));
        if (arg0 >= -80) {
            method31((class134) null, 2);
        }
        class103.field1645.method959(27, class7.field87);
        class103.field1645.method959(-73, class1.field6);
        class103.field1645.method933(-3, class22.field300);
    }

    @OriginalMember(owner = "client!ma", name = "<init>", descriptor = "(III)V", line = 41)
    public class5(int arg0, int arg1, int arg2) {
        this.field36 = arg2;
        this.field55 = arg1;
        this.field37 = this.field59 = arg0;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(Lbb;I)V", line = 55)
    public static final void method31(class134 arg0, int arg1) {
        field58++;
        if (arg1 <= 116) {
            method31((class134) null, -27);
        }
        for (int var2 = 0; var2 < class28.field393; var2++) {
            int var3 = arg0.method930(-15535);
            int var4 = arg0.method942(true);
            if (var4 == 65535) {
                var4 = -1;
            }
            if (class281.field4669[var3] != null) {
                class281.field4669[var3].field479 = var4;
            }
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(IIIIII)V", line = 97)
    public static final void method32(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg4 != 6164) {
            field45 = (class313) null;
        }
        field42++;
        class23.field323 = arg1;
        class252.field4210 = arg3;
        class40.field648 = arg5;
        class190.field3269 = arg2;
        class296.field4930 = arg0;
        if (class252.field4210 >= 100) {
            int var6 = class190.field3269 * 128 + 64;
            int var7 = class296.field4930 * 128 + 64;
            int var8 = class174.method1265(var7, 8100, class131.field2250, var6) - class40.field648;
            int var9 = var7 - class223.field3755;
            int var10 = var6 - class152.field2780;
            int var11 = var8 - class143.field2600;
            int var12 = (int) Math.sqrt((double) (var9 * var9 + var10 * var10));
            class102.field1640 = (int) (Math.atan2((double) var11, (double) var12) * 325.949D) & 0x7FF;
            class29.field404 = (int) (-325.949D * Math.atan2((double) var10, (double) var9)) & 0x7FF;
            if (class102.field1640 < 128) {
                class102.field1640 = 128;
            }
            if (class102.field1640 > 383) {
                class102.field1640 = 383;
            }
        }
        class254.field4261 = 2;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(IIIIIIZIIIII)Z", line = 180)
    public static final boolean method33(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        for (int var12 = 0; var12 < 104; var12++) {
            for (int var13 = 0; var13 < 104; var13++) {
                class53.field811[var12][var13] = 0;
                class244.field4127[var12][var13] = 99999999;
            }
        }
        field40++;
        if (arg10 > -98) {
            field48 = (class126) null;
        }
        class53.field811[arg0][arg9] = 99;
        int var14 = arg0;
        int var15 = arg9;
        class244.field4127[arg0][arg9] = 0;
        int var16 = 0;
        boolean var17 = false;
        byte var18 = 0;
        class205.field3520[var18] = arg0;
        int var32 = var18 + 1;
        class140.field2564[var18] = arg9;
        int[][] var19 = class94.field1475[class131.field2250].field460;
        while (var16 != var32) {
            var15 = class140.field2564[var16];
            var14 = class205.field3520[var16];
            var16 = var16 + 1 & 0xFFF;
            if (arg11 == var14 && arg7 == var15) {
                var17 = true;
                break;
            }
            if (arg3 != 0) {
                if ((arg3 < 5 || arg3 == 10) && class94.field1475[class131.field2250].method155(-123, arg8, arg11, arg7, 2, arg3 - 1, var14, var15)) {
                    var17 = true;
                    break;
                }
                if (arg3 < 10 && class94.field1475[class131.field2250].method166(2, 0, arg8, var15, arg7, arg3 - 1, var14, arg11)) {
                    var17 = true;
                    break;
                }
            }
            if (arg1 != 0 && arg5 != 0 && class94.field1475[class131.field2250].method170(arg5, (byte) -100, 2, arg4, var15, arg7, arg1, arg11, var14)) {
                var17 = true;
                break;
            }
            int var20 = class244.field4127[var14][var15] + 1;
            if (var14 > 0 && class53.field811[var14 - 1][var15] == 0 && (var19[var14 - 1][var15] & 0x12C010E) == 0 && (var19[var14 - 1][var15 + 1] & 0x12C0138) == 0) {
                class205.field3520[var32] = var14 - 1;
                class140.field2564[var32] = var15;
                class53.field811[var14 - 1][var15] = 2;
                var32 = var32 + 1 & 0xFFF;
                class244.field4127[var14 - 1][var15] = var20;
            }
            if (var14 < 102 && class53.field811[var14 + 1][var15] == 0 && (var19[var14 + 2][var15] & 0x12C0183) == 0 && (var19[var14 + 2][var15 + 1] & 0x12C01E0) == 0) {
                class205.field3520[var32] = var14 + 1;
                class140.field2564[var32] = var15;
                var32 = var32 + 1 & 0xFFF;
                class53.field811[var14 + 1][var15] = 8;
                class244.field4127[var14 + 1][var15] = var20;
            }
            if (var15 > 0 && class53.field811[var14][var15 - 1] == 0 && (var19[var14][var15 - 1] & 0x12C010E) == 0 && (var19[var14 + 1][var15 - 1] & 0x12C0183) == 0) {
                class205.field3520[var32] = var14;
                class140.field2564[var32] = var15 - 1;
                var32 = var32 + 1 & 0xFFF;
                class53.field811[var14][var15 - 1] = 1;
                class244.field4127[var14][var15 - 1] = var20;
            }
            if (var15 < 102 && class53.field811[var14][var15 + 1] == 0 && (var19[var14][var15 + 2] & 0x12C0138) == 0 && (var19[var14 + 1][var15 + 2] & 0x12C01E0) == 0) {
                class205.field3520[var32] = var14;
                class140.field2564[var32] = var15 + 1;
                class53.field811[var14][var15 + 1] = 4;
                class244.field4127[var14][var15 + 1] = var20;
                var32 = var32 + 1 & 0xFFF;
            }
            if (var14 > 0 && var15 > 0 && class53.field811[var14 - 1][var15 - 1] == 0 && (var19[var14 - 1][var15] & 0x12C0138) == 0 && (var19[var14 - 1][var15 - 1] & 0x12C010E) == 0 && (var19[var14][var15 - 1] & 0x12C0183) == 0) {
                class205.field3520[var32] = var14 - 1;
                class140.field2564[var32] = var15 - 1;
                class53.field811[var14 - 1][var15 - 1] = 3;
                var32 = var32 + 1 & 0xFFF;
                class244.field4127[var14 - 1][var15 - 1] = var20;
            }
            if (var14 < 102 && var15 > 0 && class53.field811[var14 + 1][var15 - 1] == 0 && (var19[var14 + 1][var15 - 1] & 0x12C010E) == 0 && (var19[var14 + 2][var15 - 1] & 0x12C0183) == 0 && (var19[var14 + 2][var15] & 0x12C01E0) == 0) {
                class205.field3520[var32] = var14 + 1;
                class140.field2564[var32] = var15 - 1;
                class53.field811[var14 + 1][var15 - 1] = 9;
                class244.field4127[var14 + 1][var15 - 1] = var20;
                var32 = var32 + 1 & 0xFFF;
            }
            if (var14 > 0 && var15 < 102 && class53.field811[var14 - 1][var15 + 1] == 0 && (var19[var14 - 1][var15 + 1] & 0x12C010E) == 0 && (var19[var14 - 1][var15 + 2] & 0x12C0138) == 0 && (var19[var14][var15 + 2] & 0x12C01E0) == 0) {
                class205.field3520[var32] = var14 - 1;
                class140.field2564[var32] = var15 + 1;
                var32 = var32 + 1 & 0xFFF;
                class53.field811[var14 - 1][var15 + 1] = 6;
                class244.field4127[var14 - 1][var15 + 1] = var20;
            }
            if (var14 < 102 && var15 < 102 && class53.field811[var14 + 1][var15 + 1] == 0 && (var19[var14 + 1][var15 + 2] & 0x12C0138) == 0 && (var19[var14 + 2][var15 + 2] & 0x12C01E0) == 0 && (var19[var14 + 2][var15 + 1] & 0x12C0183) == 0) {
                class205.field3520[var32] = var14 + 1;
                class140.field2564[var32] = var15 + 1;
                class53.field811[var14 + 1][var15 + 1] = 12;
                var32 = var32 + 1 & 0xFFF;
                class244.field4127[var14 + 1][var15 + 1] = var20;
            }
        }
        class195.field3354 = 0;
        if (!var17) {
            if (!arg6) {
                return false;
            }
            int var21 = 1000;
            int var22 = 100;
            byte var23 = 10;
            for (int var24 = arg11 - var23; var24 <= (arg11 + var23); var24++) {
                for (int var25 = arg7 - var23; var25 <= arg7 + var23; var25++) {
                    if (var24 >= 0 && var25 >= 0 && var24 < 104 && var25 < 104 && class244.field4127[var24][var25] < 100) {
                        int var26 = 0;
                        if (var24 < arg11) {
                            var26 = arg11 - var24;
                        } else if (arg11 + arg1 - 1 < var24) {
                            var26 = var24 - arg11 - (arg1 - 1);
                        }
                        int var27 = 0;
                        if (var25 < arg7) {
                            var27 = arg7 - var25;
                        } else if ((arg5 + arg7 - 1) < var25) {
                            var27 = var25 + 1 - arg7 - arg5;
                        }
                        int var28 = var26 * var26 + var27 * var27;
                        if (var21 > var28 || var21 == var28 && class244.field4127[var24][var25] < var22) {
                            var22 = class244.field4127[var24][var25];
                            var15 = var25;
                            var14 = var24;
                            var21 = var28;
                        }
                    }
                }
            }
            if (var21 == 1000) {
                return false;
            }
            if (arg0 == var14 && arg9 == var15) {
                return false;
            }
            class195.field3354 = 1;
        }
        byte var29 = 0;
        class205.field3520[var29] = var14;
        int var33 = var29 + 1;
        class140.field2564[var29] = var15;
        int var30;
        int var31 = var30 = class53.field811[var14][var15];
        while (arg0 != var14 || arg9 != var15) {
            if (var30 != var31) {
                class205.field3520[var33] = var14;
                class140.field2564[var33++] = var15;
                var30 = var31;
            }
            if ((var31 & 0x1) != 0) {
                var15++;
            } else if ((var31 & 0x4) != 0) {
                var15--;
            }
            if ((var31 & 0x2) != 0) {
                var14++;
            } else if ((var31 & 0x8) != 0) {
                var14--;
            }
            var31 = class53.field811[var14][var15];
        }
        if (var33 > 0) {
            class97.method660((byte) 35, var33, arg2);
            return true;
        } else if (arg2 == 1) {
            return false;
        } else {
            return true;
        }
    }
}
