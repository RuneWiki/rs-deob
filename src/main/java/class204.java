import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public class class204 extends class165 {

    @OriginalMember(owner = "client!kb", name = "y", descriptor = "[Loa;")
    public class153[] field3343 = new class153[5];

    @OriginalMember(owner = "client!kb", name = "J", descriptor = "I")
    public int field3354 = 0;

    @OriginalMember(owner = "client!kb", name = "K", descriptor = "[I")
    public int[] field3355 = new int[5];

    @OriginalMember(owner = "client!kb", name = "F", descriptor = "I")
    public int field3350;

    @OriginalMember(owner = "client!kb", name = "D", descriptor = "I")
    public int field3348;

    @OriginalMember(owner = "client!kb", name = "v", descriptor = "I")
    public int field3340;

    @OriginalMember(owner = "client!kb", name = "s", descriptor = "I")
    public int field3337;

    @OriginalMember(owner = "client!kb", name = "q", descriptor = "[Z")
    public static boolean[] field3335 = new boolean[5];

    @OriginalMember(owner = "client!kb", name = "p", descriptor = "I")
    public static int field3334;

    @OriginalMember(owner = "client!kb", name = "r", descriptor = "I")
    public static int field3336;

    @OriginalMember(owner = "client!kb", name = "t", descriptor = "I")
    public static int field3338;

    @OriginalMember(owner = "client!kb", name = "A", descriptor = "I")
    public int field3345;

    @OriginalMember(owner = "client!kb", name = "B", descriptor = "I")
    public static int field3346;

    @OriginalMember(owner = "client!kb", name = "G", descriptor = "I")
    public int field3351;

    @OriginalMember(owner = "client!kb", name = "I", descriptor = "I")
    public static int field3353;

    @OriginalMember(owner = "client!kb", name = "L", descriptor = "I")
    public static int field3356;

    @OriginalMember(owner = "client!kb", name = "O", descriptor = "I")
    public int field3359;

    @OriginalMember(owner = "client!kb", name = "P", descriptor = "I")
    public int field3360;

    @OriginalMember(owner = "client!kb", name = "S", descriptor = "I")
    public int field3363;

    @OriginalMember(owner = "client!kb", name = "M", descriptor = "Lga;")
    public class104 field3357;

    @OriginalMember(owner = "client!kb", name = "C", descriptor = "Lv;")
    public class113 field3347;

    @OriginalMember(owner = "client!kb", name = "Q", descriptor = "Lak;")
    public static class172 field3361;

    @OriginalMember(owner = "client!kb", name = "w", descriptor = "Lkb;")
    public class204 field3341;

    @OriginalMember(owner = "client!kb", name = "T", descriptor = "Loe;")
    public class225 field3364;

    @OriginalMember(owner = "client!kb", name = "z", descriptor = "Lib;")
    public class31 field3344;

    @OriginalMember(owner = "client!kb", name = "E", descriptor = "Lah;")
    public class32 field3349;

    @OriginalMember(owner = "client!kb", name = "x", descriptor = "Lgg;")
    public class38 field3342;

    @OriginalMember(owner = "client!kb", name = "R", descriptor = "Ljava/awt/Frame;")
    public static Frame field3362;

    @OriginalMember(owner = "client!kb", name = "u", descriptor = "Z")
    public boolean field3339;

    @OriginalMember(owner = "client!kb", name = "H", descriptor = "Z")
    public boolean field3352;

    @OriginalMember(owner = "client!kb", name = "U", descriptor = "Z")
    public boolean field3365;

    @OriginalMember(owner = "client!kb", name = "N", descriptor = "[Lbf;")
    public static class58[] field3358;

    @OriginalMember(owner = "client!kb", name = "c", descriptor = "(B)V", line = 5)
    public static final void method1485(byte arg0) {
        int var1 = -45 / ((arg0 + 60) / 63);
        class33.field449.method702((byte) 121);
        field3338++;
    }

    @OriginalMember(owner = "client!kb", name = "<init>", descriptor = "(III)V", line = 21)
    public class204(int arg0, int arg1, int arg2) {
        this.field3348 = this.field3350 = arg0;
        this.field3340 = arg1;
        this.field3337 = arg2;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(II)V", line = 37)
    public static final void method1486(int arg0, int arg1) {
        int var2 = class83.field1173;
        int var3 = class120.field1825;
        int var4 = class74.field1036;
        int var5 = class260.field4150;
        field3356++;
        int var6 = class186.field3076;
        if (arg1 != 2048) {
            return;
        }
        int var7 = (int) class97.field1386;
        int var8 = (int) class330.field5090 + class150.field2324 & 0x7FF;
        if (class147.field2285 / 256 > var7) {
            var7 = class147.field2285 / 256;
        }
        if (field3335[4] && (class327.field5050[4] + 128) > var7) {
            var7 = class327.field5050[4] + 128;
        }
        class117.method804(11104, class129.field2014, var7 * 3 + 600, var7, var8, class123.method889(1, class49.field698, class191.field3129.field4255, class191.field3129.field4264) - 50, arg0, class55.field772);
        if (class120.field1825 == var3 && class83.field1173 == var2 && class260.field4150 == var5 && class74.field1036 == var4 && class186.field3076 == var6) {
            class31.field423 = 1;
            return;
        }
        class198.field3231 = 10;
        class150.field2326 = 10;
        class200.field3257 = 10;
        if (var3 < class120.field1825) {
            var3 += (class120.field1825 - var3) * class198.field3231 / 1000 + class200.field3257;
            if (class120.field1825 > var3) {
                class120.field1825 = var3;
            }
        }
        if (class120.field1825 < var3) {
            int var9 = var3 - ((var3 - class120.field1825) * class198.field3231 / 1000 + class200.field3257);
            if (class120.field1825 < var9) {
                class120.field1825 = var9;
            }
        }
        if (var2 < class83.field1173) {
            var2 += class200.field3257 + ((class83.field1173 - var2) * class198.field3231 / 1000);
            if (class83.field1173 > var2) {
                class83.field1173 = var2;
            }
        }
        if (class260.field4150 > var5) {
            var5 += (class260.field4150 - var5) * class198.field3231 / 1000 + class200.field3257;
            if (class260.field4150 > var5) {
                class260.field4150 = var5;
            }
        }
        class81.field1127 = 10;
        if (class260.field4150 < var5) {
            int var10 = var5 - ((var5 - class260.field4150) * class198.field3231 / 1000 + class200.field3257);
            if (class260.field4150 < var10) {
                class260.field4150 = var10;
            }
        }
        if (var4 < class74.field1036) {
            var4 += (class74.field1036 - var4) * class81.field1127 / 1000 + class150.field2326;
            if (var4 < class74.field1036) {
                class74.field1036 = var4;
            }
        }
        if (var2 > class83.field1173) {
            int var11 = var2 - ((var2 - class83.field1173) * class198.field3231 / 1000 + class200.field3257);
            if (var11 > class83.field1173) {
                class83.field1173 = var11;
            }
        }
        int var12 = class186.field3076 - var6;
        if (var12 > 1024) {
            var12 -= 2048;
        }
        if (var12 < -1024) {
            var12 += 2048;
        }
        if (var4 > class74.field1036) {
            int var13 = var4 - ((var4 - class74.field1036) * class81.field1127 / 1000 + class150.field2326);
            if (class74.field1036 < var13) {
                class74.field1036 = var13;
            }
        }
        if (var12 > 0) {
            int var14 = class81.field1127 * var12 / 1000 + class150.field2326 + var6;
            var6 = var14 & 0x7FF;
        }
        if (var12 < 0) {
            int var15 = var6 - (-var12 * class81.field1127 / 1000 + class150.field2326);
            var6 = var15 & 0x7FF;
        }
        int var16 = class186.field3076 - var6;
        if (var16 > 1024) {
            var16 -= 2048;
        }
        if (var16 < -1024) {
            var16 += 2048;
        }
        if (var16 >= 0 || var12 <= 0 || var16 > 0 && var12 < 0) {
            class186.field3076 = var6;
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(Log;I)V", line = 187)
    public static final void method1487(class157 arg0, int arg1) {
        field3353++;
        class157 var2 = class319.method2243(21695, arg0);
        int var3;
        int var4;
        if (var2 == null) {
            var4 = class133.field2095;
            var3 = class20.field276;
        } else {
            var3 = var2.field2520;
            var4 = var2.field2468;
        }
        class224.method1594(false, var3, arg0, var4, arg1 ^ arg1);
        class8.method41(var3, var4, 0, arg0);
    }

    @OriginalMember(owner = "client!kb", name = "d", descriptor = "(B)V", line = 232)
    public static void method1488(byte arg0) {
        field3361 = null;
        field3362 = null;
        field3358 = null;
        if (arg0 != 58) {
            method1487((class157) null, -3);
        }
        field3335 = null;
    }

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "(II)V", line = 245)
    public static final void method1489(int arg0, int arg1) {
        class91.field1254 = arg1;
        class50.field707 = arg0;
        field3334++;
        class50.field707 = -1;
        class46.method295(-1);
    }

    @OriginalMember(owner = "client!kb", name = "e", descriptor = "(B)I", line = 259)
    public static final int method1490(byte arg0) {
        if (arg0 != 59) {
            method1489(30, 35);
        }
        field3336++;
        if (field3362 != null) {
            return 3;
        } else if (class232.field3690 && class322.field4990) {
            return 2;
        } else if (class232.field3690 && !class322.field4990) {
            return 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(ILjava/lang/String;)J", line = 282)
    public static final long method1491(int arg0, String arg1) {
        field3346++;
        long var2 = 0L;
        int var4 = arg1.length();
        if (arg0 != -26916) {
            return 57L;
        }
        for (int var5 = 0; var5 < var4; var5++) {
            char var6 = arg1.charAt(var5);
            var2 *= 37L;
            if (var6 >= 'A' && var6 <= 'Z') {
                var2 += (long) (var6 + 1 - 65);
            } else if (var6 >= 'a' && var6 <= 'z') {
                var2 += (long) (var6 + 1 - 97);
            } else if (var6 >= '0' && var6 <= '9') {
                var2 += (long) (var6 + 27 - 48);
            }
            if (var2 >= 177917621779460413L) {
                break;
            }
        }
        while (var2 % 37L == 0L && var2 != 0L) {
            var2 /= 37L;
        }
        return var2;
    }
}
