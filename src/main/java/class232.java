import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fd")
public class class232 extends class103 {

    @OriginalMember(owner = "client!fd", name = "Db", descriptor = "Lcd;")
    public static class64 field3912 = class44.method335((byte) 71, ":");

    @OriginalMember(owner = "client!fd", name = "Hb", descriptor = "I")
    public static int field3916 = 0;

    @OriginalMember(owner = "client!fd", name = "Pb", descriptor = "I")
    public static int field3924 = -1;

    @OriginalMember(owner = "client!fd", name = "Nb", descriptor = "[I")
    public static int[] field3922 = new int[] { 4, 4, 1, 2, 6, 4, 2, 50, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };

    @OriginalMember(owner = "client!fd", name = "Eb", descriptor = "I")
    public static int field3913;

    @OriginalMember(owner = "client!fd", name = "Fb", descriptor = "I")
    public static int field3914;

    @OriginalMember(owner = "client!fd", name = "Gb", descriptor = "I")
    public static int field3915;

    @OriginalMember(owner = "client!fd", name = "Ib", descriptor = "I")
    public static int field3917;

    @OriginalMember(owner = "client!fd", name = "Jb", descriptor = "I")
    public static int field3918;

    @OriginalMember(owner = "client!fd", name = "Kb", descriptor = "I")
    public static int field3919;

    @OriginalMember(owner = "client!fd", name = "Lb", descriptor = "I")
    public static int field3920;

    @OriginalMember(owner = "client!fd", name = "Mb", descriptor = "I")
    public static int field3921;

    @OriginalMember(owner = "client!fd", name = "Ob", descriptor = "I")
    public static int field3923;

    @OriginalMember(owner = "client!fd", name = "Qb", descriptor = "I")
    public static int field3925;

    @OriginalMember(owner = "client!fd", name = "I", descriptor = "Lgk;")
    public class6 field3911;

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(IIIBI)V", line = 7)
    public static final void method1665(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        class153.field2714 = arg2;
        if (arg3 <= 69) {
            method1667(105, 37, 110);
        }
        field3918++;
        class290.field4976 = arg4;
        class201.field3444 = arg0;
        class180.field3098 = arg1;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "()I", line = 27)
    public final int method48() {
        field3919++;
        return this.field1909;
    }

    @OriginalMember(owner = "client!fd", name = "c", descriptor = "(I)Z", line = 35)
    public final boolean method318(int arg0) {
        field3920++;
        if (this.field3911 == null) {
            return false;
        } else if (arg0 == 4) {
            return true;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(IIIIIIIIJ)V", line = 59)
    public final void method43(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        field3915++;
        if (this.field3911 == null) {
            return;
        }
        class199 var11 = this.field1902 != -1 && this.field1874 == 0 ? class281.method1944(this.field1902, 0) : null;
        class199 var12 = this.field1896 == -1 || this.field1901 == this.field1896 && var11 != null ? null : class281.method1944(this.field1896, 0);
        class243 var13 = this.field3911.method70(this.field1904, var11, this.field1885, 0, var12);
        if (var13 == null) {
            return;
        }
        this.field1909 = var13.method48();
        class6 var14 = this.field3911;
        if (var14.field144 != null) {
            var14 = var14.method66(0);
        }
        if (class263.field4510 && var14.field127) {
            class243 var15 = class134.method954(arg0, this.field1849, this.field1865, this.field1859, 30388, var13, this.field1910, this.field3911.field141, var12 == null ? var11 : var12, var12 == null ? this.field1885 : this.field1904, this.field3911.field125, this.field3911.field148, this.field3911.field123, this.field3911.field165);
            if (class123.field2216) {
                float var16 = class123.method883();
                float var17 = class123.method884();
                class123.method891();
                class123.method877(var16, var17 - 150.0F);
                var15.method43(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L);
                class123.method872();
                class123.method877(var16, var17);
            } else {
                var15.method43(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L);
            }
        }
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        if (this.field3911.field153 != 0 || this.field3911.field145 != 0) {
            short var21 = this.field3911.field153;
            int var22 = class50.field826[arg0];
            short var23 = this.field3911.field145;
            int var24 = class50.field820[arg0];
            int var25 = -var21 / 2;
            int var26 = -var23 / 2;
            int var27 = var24 * var26 - (var22 * var25) >> 16;
            int var28 = var22 * var26 + var24 * var25 >> 16;
            int var29 = class15.method169(this.field1865 + var27, 13257, class20.field364, this.field1859 + var28);
            int var30 = var21 / 2;
            int var31 = -var23 / 2;
            int var32 = var24 * var31 - (var22 * var30) >> 16;
            int var33 = var22 * var31 + (var24 * var30) >> 16;
            int var34 = class15.method169(this.field1865 + var32, 13257, class20.field364, this.field1859 + var33);
            int var35 = -var21 / 2;
            int var36 = var23 / 2;
            int var37 = var24 * var36 - (var22 * var35) >> 16;
            int var38 = var22 * var36 + (var24 * var35) >> 16;
            int var39 = var21 / 2;
            int var40 = class15.method169(this.field1865 + var37, 13257, class20.field364, this.field1859 + var38);
            int var41 = var23 / 2;
            int var42 = var22 * var41 + (var24 * var39) >> 16;
            int var43 = var24 * var41 - (var22 * var39) >> 16;
            int var44 = var29 < var34 ? var29 : var34;
            int var45 = class15.method169(this.field1865 + var43, 13257, class20.field364, this.field1859 + var42);
            int var46 = var29 + var45;
            int var47 = var45 <= var40 ? var45 : var40;
            if (var23 != 0) {
                var18 = (int) (Math.atan2((double) (var44 - var47), (double) var23) * 325.95D) & 0x7FF;
                if (var18 != 0) {
                    var13.method42(var18);
                }
            }
            int var48 = var40 > var29 ? var29 : var40;
            if (var34 + var40 < var46) {
                var46 = var34 + var40;
            }
            int var49 = var34 >= var45 ? var45 : var34;
            if (var21 != 0) {
                var19 = (int) (Math.atan2((double) (var48 - var49), (double) var21) * 325.95D) & 0x7FF;
                if (var19 != 0) {
                    var13.method47(var19);
                }
            }
            var20 = (var46 >> 1) - this.field1910;
            if (var20 != 0) {
                var13.method29(0, var20, 0);
            }
        }
        class243 var50 = null;
        if (this.field1903 != -1 && this.field1916 != -1) {
            class91 var51 = class275.method1908(this.field1903, 75);
            var50 = var51.method685(this.field1916, -1);
            if (var50 != null) {
                var50.method29(0, -this.field1866, 0);
                if (var51.field1639) {
                    if (var18 != 0) {
                        var50.method42(var18);
                    }
                    if (var19 != 0) {
                        var50.method47(var19);
                    }
                    if (var20 != 0) {
                        var50.method29(0, var20, 0);
                    }
                }
            }
        }
        if (!class123.field2216) {
            if (var50 != null) {
                var13 = ((class5) var13).method41(var50);
            }
            if (this.field3911.field141 == 1) {
                var13.field4199 = true;
            }
            var13.method43(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
            return;
        }
        if (this.field3911.field141 == 1) {
            var13.field4199 = true;
        }
        var13.method43(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        if (var50 != null) {
            if (this.field3911.field141 == 1) {
                var50.field4199 = true;
            }
            var50.method43(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        }
    }

    @OriginalMember(owner = "client!fd", name = "e", descriptor = "(I)V", line = 264)
    public static void method1666(int arg0) {
        field3912 = null;
        if (arg0 >= -91) {
            method1668(24, 94, 8, 51, 59, -83, 40, 31, 120, 40);
        }
        field3922 = null;
    }

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "(III)I", line = 279)
    public static final int method1667(int arg0, int arg1, int arg2) {
        field3917++;
        if (arg0 != 0) {
            method1668(-58, -122, -111, 36, -80, -35, 105, -126, 43, 10);
        }
        int var3 = arg2 >>> 31;
        return (arg2 + var3) / arg1 - var3;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(IIIIIIIIII)V", line = 308)
    public static final void method1668(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg0 != 2) {
            field3922 = (int[]) null;
        }
        field3914++;
        if (arg1 == arg3 && arg4 == arg9 && arg6 == arg8 && arg2 == arg7) {
            class85.method651(arg5, arg7, arg9, arg3, arg8, arg0 - 120);
            return;
        }
        int var10 = arg3;
        int var11 = arg3 * 3;
        int var12 = arg1 * 3;
        int var13 = arg4 * 3;
        int var14 = arg9;
        int var15 = arg2 * 3;
        int var16 = arg6 * 3;
        int var17 = var16 + var11 - var12 - var12;
        int var18 = arg9 * 3;
        int var19 = var12 - var11;
        int var20 = var15 + var18 - var13 - var13;
        int var21 = arg7 + var13 - arg9 - var15;
        int var22 = var13 - var18;
        int var23 = arg8 + var12 - var16 - arg3;
        for (int var24 = 128; var24 <= 4096; var24 += 128) {
            int var25 = var24 * var24 >> 12;
            int var26 = var24 * var25 >> 12;
            int var27 = var21 * var26;
            int var28 = var17 * var25;
            int var29 = var23 * var26;
            int var30 = var20 * var25;
            int var31 = var19 * var24;
            int var32 = var22 * var24;
            int var33 = (var28 + var31 + var29 >> 12) + arg3;
            int var34 = arg9 + (var30 + var32 + var27 >> 12);
            class85.method651(arg5, var34, var14, var10, var33, arg0 ^ 0xFFFFFF96);
            var14 = var34;
            var10 = var33;
        }
    }
}
