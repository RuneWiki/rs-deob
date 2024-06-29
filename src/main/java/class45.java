import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!e")
public class class45 {

    @OriginalMember(owner = "client!e", name = "l", descriptor = "Loc;")
    private static class151 field935 = class137.method873(2, "Loading title screen )2 ");

    @OriginalMember(owner = "client!e", name = "d", descriptor = "Loc;")
    public static class151 field927 = class137.method873(2, "runes");

    @OriginalMember(owner = "client!e", name = "b", descriptor = "Loc;")
    private static class151 field925 = class137.method873(2, " is already on your ignore list)3");

    @OriginalMember(owner = "client!e", name = "p", descriptor = "Loc;")
    private static class151 field939 = class137.method873(2, "Try again in 60 secs)3)3)3");

    @OriginalMember(owner = "client!e", name = "j", descriptor = "Loc;")
    public static class151 field933 = field925;

    @OriginalMember(owner = "client!e", name = "e", descriptor = "Loc;")
    public static class151 field928 = class137.method873(2, "");

    @OriginalMember(owner = "client!e", name = "a", descriptor = "Loc;")
    public static class151 field924 = field935;

    @OriginalMember(owner = "client!e", name = "g", descriptor = "Loc;")
    private static class151 field930 = class137.method873(2, "Loaded textures");

    @OriginalMember(owner = "client!e", name = "m", descriptor = "Loc;")
    private static class151 field936 = class137.method873(2, "Please remove ");

    @OriginalMember(owner = "client!e", name = "h", descriptor = "Loc;")
    public static class151 field931 = field936;

    @OriginalMember(owner = "client!e", name = "q", descriptor = "Loc;")
    public static class151 field940 = field939;

    @OriginalMember(owner = "client!e", name = "u", descriptor = "Loc;")
    public static class151 field944 = field930;

    @OriginalMember(owner = "client!e", name = "t", descriptor = "Loc;")
    private static class151 field943 = class137.method873(2, "glow3:");

    @OriginalMember(owner = "client!e", name = "o", descriptor = "Loc;")
    public static class151 field938 = field943;

    @OriginalMember(owner = "client!e", name = "k", descriptor = "Loc;")
    public static class151 field934 = field943;

    @OriginalMember(owner = "client!e", name = "f", descriptor = "Loc;")
    public static class151 field929 = field936;

    @OriginalMember(owner = "client!e", name = "c", descriptor = "I")
    public static int field926;

    @OriginalMember(owner = "client!e", name = "i", descriptor = "I")
    public static int field932;

    @OriginalMember(owner = "client!e", name = "n", descriptor = "I")
    public static int field937;

    @OriginalMember(owner = "client!e", name = "r", descriptor = "I")
    public static int field941;

    @OriginalMember(owner = "client!e", name = "s", descriptor = "I")
    public static int field942;

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(BLsd;II)[Lcg;")
    public static final class30[] method321(byte arg0, class192 arg1, int arg2, int arg3) {
        field942++;
        if (class204.method1291(0, arg2, arg1, arg3)) {
            if (arg0 >= -88) {
                method321((byte) 47, null, 46, -86);
            }
            return class71.method474((byte) 21);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(I)V")
    public static final void method322(int arg0) {
        int var1 = class193.field3463 * 128 + 64;
        int var2 = class157.field2845 * 128 + 64;
        int var3 = class195.method1225(var1, class234.field4325, var2, (byte) -118) - class64.field1252;
        if (var3 > class113.field2011) {
            class113.field2011 += (var3 - class113.field2011) * class23.field519 / 1000 + class177.field3205;
            if (class113.field2011 > var3) {
                class113.field2011 = var3;
            }
        }
        if (var1 > class90.field1650) {
            class90.field1650 += (var1 - class90.field1650) * class23.field519 / 1000 + class177.field3205;
            if (var1 < class90.field1650) {
                class90.field1650 = var1;
            }
        }
        if (var3 < class113.field2011) {
            class113.field2011 -= (class113.field2011 - var3) * class23.field519 / 1000 + class177.field3205;
            if (var3 > class113.field2011) {
                class113.field2011 = var3;
            }
        }
        if (var1 < class90.field1650) {
            class90.field1650 -= (class90.field1650 - var1) * class23.field519 / 1000 + class177.field3205;
            if (var1 > class90.field1650) {
                class90.field1650 = var1;
            }
        }
        if (var2 > class181.field3267) {
            class181.field3267 += (var2 - class181.field3267) * class23.field519 / 1000 + class177.field3205;
            if (var2 < class181.field3267) {
                class181.field3267 = var2;
            }
        }
        int var4 = class67.field1280 * 128 + 64;
        if (class181.field3267 > var2) {
            class181.field3267 -= (class181.field3267 - var2) * class23.field519 / 1000 + class177.field3205;
            if (class181.field3267 < var2) {
                class181.field3267 = var2;
            }
        }
        int var5 = class14.field332 * 128 + 64;
        field941++;
        int var6 = class195.method1225(var4, class234.field4325, var5, (byte) -118) - class166.field3021;
        int var7 = var5 - class181.field3267;
        int var8 = var6 - class113.field2011;
        int var9 = var4 - class90.field1650;
        int var10 = (int) Math.sqrt((double) (var7 * var7 + var9 * var9));
        int var11 = (int) (Math.atan2((double) var8, (double) var10) * 325.949D) & 0x7FF;
        if (var11 < 128) {
            var11 = 128;
        }
        int var12 = (int) (-325.949D * Math.atan2((double) var9, (double) var7)) & 0x7FF;
        if (var11 > 383) {
            var11 = 383;
        }
        int var13 = var12 - class147.field2640;
        if (var13 > 1024) {
            var13 -= 2048;
        }
        if (class37.field779 < var11) {
            class37.field779 += class69.field1357 + (var11 - class37.field779) * class93.field1752 / 1000;
            if (class37.field779 > var11) {
                class37.field779 = var11;
            }
        }
        if (var13 < -1024) {
            var13 += 2048;
        }
        if (var11 < class37.field779) {
            class37.field779 -= (class37.field779 - var11) * class93.field1752 / 1000 + class69.field1357;
            if (var11 > class37.field779) {
                class37.field779 = var11;
            }
        }
        if (var13 > 0) {
            class147.field2640 += class93.field1752 * var13 / 1000 + class69.field1357;
            class147.field2640 &= 0x7FF;
        }
        if (var13 < 0) {
            class147.field2640 -= -var13 * class93.field1752 / 1000 + class69.field1357;
            class147.field2640 &= 0x7FF;
        }
        int var14 = var12 - class147.field2640;
        if (var14 > 1024) {
            var14 -= 2048;
        }
        if (arg0 <= 99) {
            return;
        }
        if (var14 < -1024) {
            var14 += 2048;
        }
        if (var14 < 0 && var13 > 0 || var14 > 0 && var13 < 0) {
            class147.field2640 = var12;
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(Z)V")
    public static void method323(boolean arg0) {
        field933 = null;
        field940 = null;
        field943 = null;
        field934 = null;
        field928 = null;
        field924 = null;
        field929 = null;
        field944 = null;
        field931 = null;
        if (!arg0) {
            return;
        }
        field930 = null;
        field938 = null;
        field939 = null;
        field927 = null;
        field936 = null;
        field925 = null;
        field935 = null;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(II)Z")
    public static final boolean method324(int arg0, int arg1) {
        field926++;
        if (arg1 != 2833) {
            method324(-40, -63);
        }
        return (arg0 >> 21 & 0x1) != 0;
    }
}
