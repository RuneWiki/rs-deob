import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jg")
public class class272 implements class46 {

    @OriginalMember(owner = "client!jg", name = "h", descriptor = "[Ljava/lang/String;")
    public static String[] field3982 = new String[100];

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "I")
    public static int field3975 = 0;

    @OriginalMember(owner = "client!jg", name = "k", descriptor = "I")
    public static int field3985 = 0;

    @OriginalMember(owner = "client!jg", name = "t", descriptor = "[Ljava/lang/String;")
    public static String[] field3994 = new String[200];

    @OriginalMember(owner = "client!jg", name = "c", descriptor = "I")
    public int field3977;

    @OriginalMember(owner = "client!jg", name = "d", descriptor = "I")
    public static int field3978;

    @OriginalMember(owner = "client!jg", name = "e", descriptor = "I")
    public int field3979;

    @OriginalMember(owner = "client!jg", name = "f", descriptor = "I")
    public int field3980;

    @OriginalMember(owner = "client!jg", name = "g", descriptor = "I")
    public static int field3981;

    @OriginalMember(owner = "client!jg", name = "i", descriptor = "I")
    public int field3983;

    @OriginalMember(owner = "client!jg", name = "j", descriptor = "I")
    public static int field3984;

    @OriginalMember(owner = "client!jg", name = "m", descriptor = "I")
    public static int field3987;

    @OriginalMember(owner = "client!jg", name = "o", descriptor = "I")
    public static int field3989;

    @OriginalMember(owner = "client!jg", name = "p", descriptor = "I")
    public static int field3990;

    @OriginalMember(owner = "client!jg", name = "q", descriptor = "I")
    public int field3991;

    @OriginalMember(owner = "client!jg", name = "r", descriptor = "I")
    public int field3992;

    @OriginalMember(owner = "client!jg", name = "s", descriptor = "I")
    public static int field3993;

    @OriginalMember(owner = "client!jg", name = "u", descriptor = "I")
    public static int field3995;

    @OriginalMember(owner = "client!jg", name = "l", descriptor = "Lfi;")
    public static class165 field3986;

    @OriginalMember(owner = "client!jg", name = "n", descriptor = "Lqj;")
    public static class238 field3988;

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "Z")
    public boolean field3976;

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1740(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field3981++;
        int var8 = arg5 - 334;
        if (var8 < 0) {
            var8 = 0;
        } else if (var8 > 100) {
            var8 = 100;
        }
        int var9 = (class318.field4542 - class29.field501) * var8 / 100 + class29.field501;
        int var10 = arg2 * var9 >> 8;
        int var11 = 16384 - arg3 & 0x3FFF;
        int var12 = 16384 - arg4 & 0x3FFF;
        int var13 = 0;
        int var14 = arg0;
        int var15 = var10;
        if (var11 != 0) {
            var14 = class190.field2644[var11] * -var10 >> 15;
            var15 = class190.field2635[var11] * var10 >> 15;
        }
        if (var12 != 0) {
            var13 = class190.field2644[var12] * var15 >> 15;
            var15 = class190.field2635[var12] * var15 >> 15;
        }
        class7.field71 = arg6 - var15;
        class237.field3326 = arg7 - var13;
        class179.field2364 = arg4;
        class130.field1745 = arg1 - var14;
        class265.field3878 = arg3;
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(B)V")
    public static void method1741(byte arg0) {
        field3994 = null;
        field3986 = null;
        field3982 = null;
        field3988 = null;
        if (arg0 < 75) {
            field3988 = null;
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(Ljava/lang/String;Z)V")
    public static final void method1742(String arg0, boolean arg1) {
        field3978++;
        System.out.println("Bad " + arg0 + ", Usage: worldid, <live/rc/wip>, <english/german>, <game0/game1>");
        System.exit(1);
        if (arg1) {
            method1743(-90, (class249) null, false);
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(ILro;Z)V")
    public static final void method1743(int arg0, class249 arg1, boolean arg2) {
        field3989++;
        int var3 = arg1.field3611 == 0 ? arg1.field3578 : arg1.field3611;
        int var4 = arg1.field3646 == 0 ? arg1.field3604 : arg1.field3646;
        class264.method1652(arg2, class119.field1607[arg1.field3622 >> 16], -31, var3, var4, arg1.field3622);
        if (arg1.field3493 != null) {
            class264.method1652(arg2, arg1.field3493, -53, var3, var4, arg1.field3622);
        }
        class158 var5 = (class158) class269.field3933.method954(126, (long) arg1.field3622);
        if (arg0 < 64) {
            method1744(34, -82);
        }
        if (var5 != null) {
            class227.method1411(var3, var4, arg2, var5.field2075, (byte) 120);
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(Lbp;I)Z")
    public final boolean method335(class46 arg0, int arg1) {
        field3990++;
        if (!(arg0 instanceof class272)) {
            return false;
        }
        class272 var3 = (class272) arg0;
        if (this.field3980 != var3.field3980) {
            return false;
        } else if (this.field3979 == var3.field3979) {
            if (arg1 > -106) {
                method1743(41, (class249) null, true);
            }
            if (this.field3977 != var3.field3977) {
                return false;
            } else if (this.field3992 != var3.field3992) {
                return false;
            } else if (this.field3983 != var3.field3983) {
                return false;
            } else if (this.field3991 == var3.field3991) {
                return this.field3976 == var3.field3976;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(II)I")
    public static final int method1744(int arg0, int arg1) {
        field3984++;
        int var2 = arg0 & 0x3F;
        if (arg1 > -94) {
            field3988 = null;
        }
        int var3 = (arg0 & 0xD9) >> 6;
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

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(I)J")
    public final long method334(int arg0) {
        field3987++;
        long[] var2 = class381.field5719;
        long var3 = -1L;
        long var5 = var3 >>> 8 ^ var2[(int) (((long) this.field3980 ^ var3) & 0xFFL)];
        long var7 = var2[(int) ((var5 ^ (long) (this.field3979 >> 8)) & 0xFFL)] ^ var5 >>> 8;
        long var9 = var7 >>> 8 ^ var2[(int) (((long) this.field3979 ^ var7) & 0xFFL)];
        long var11 = var9 >>> 8 ^ var2[(int) (((long) (this.field3977 >> 24) ^ var9) & 0xFFL)];
        long var13 = var2[(int) ((var11 ^ (long) (this.field3977 >> 16)) & 0xFFL)] ^ var11 >>> 8;
        long var15 = var13 >>> 8 ^ var2[(int) ((var13 ^ (long) (this.field3977 >> 8)) & 0xFFL)];
        long var17 = var2[(int) ((var15 ^ (long) this.field3977) & 0xFFL)] ^ var15 >>> 8;
        long var19 = var17 >>> 8 ^ var2[(int) ((var17 ^ (long) this.field3992) & 0xFFL)];
        long var21 = var2[(int) ((var19 ^ (long) (this.field3983 >> 24)) & 0xFFL)] ^ var19 >>> 8;
        long var23 = var21 >>> 8 ^ var2[(int) (((long) (this.field3983 >> 16) ^ var21) & 0xFFL)];
        long var25 = var2[(int) ((var23 ^ (long) (this.field3983 >> 8)) & 0xFFL)] ^ var23 >>> 8;
        long var27 = var25 >>> 8 ^ var2[(int) ((var25 ^ (long) this.field3983) & 0xFFL)];
        long var29 = var2[(int) (((long) this.field3991 ^ var27) & 0xFFL)] ^ var27 >>> 8;
        long var31 = var2[(int) (((long) (this.field3976 ? 1 : 0) ^ var29) & 0xFFL)] ^ var29 >>> 8;
        if (arg0 != 21209) {
            this.field3977 = 39;
        }
        return var31;
    }

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "(I)V")
    public static final void method1745(int arg0) {
        class10.field97 = 0;
        field3993++;
        class373.field5574.method2654(0);
        if (arg0 <= -114) {
            class229.field3230 = false;
        }
    }
}
