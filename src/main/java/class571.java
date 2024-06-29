import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public abstract class class571 {

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "[Lei;")
    public static class183[] field8083 = new class183[0];

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "I")
    public static int field8084;

    @OriginalMember(owner = "client!aa", name = "c", descriptor = "I")
    public static int field8085;

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(III)Z")
    public static final boolean method3412(int arg0, int arg1, int arg2) {
        field8084++;
        if (arg1 != 10) {
            method3413(-77);
        }
        if (!class484.field6549) {
            return false;
        }
        int var3 = arg2 >> 16;
        int var4 = arg2 & 0xFFFF;
        if (class491.field6599[var3] == null || class491.field6599[var3][var4] == null) {
            return false;
        }
        class712 var5 = class491.field6599[var3][var4];
        if (arg0 == -1 && var5.field10039 == 0) {
            for (class6 var6 = (class6) class478.field6510.method3118((byte) 73); var6 != null; var6 = (class6) class478.field6510.method3111(119)) {
                if (var6.field60 == 9 || var6.field60 == 1002 || var6.field60 == 5 || var6.field60 == 10 || var6.field60 == 15) {
                    for (class712 var7 = class733.method4073(true, var6.field58); var7 != null; var7 = class101.method686(-1, var7)) {
                        if (var5.field9998 == var7.field9998) {
                            return true;
                        }
                    }
                }
            }
        } else {
            for (class6 var8 = (class6) class478.field6510.method3118((byte) 73); var8 != null; var8 = (class6) class478.field6510.method3111(114)) {
                if (var8.field57 == arg0 && var5.field9998 == var8.field58 && (var8.field60 == 9 || var8.field60 == 1002 || var8.field60 == 5 || var8.field60 == 10 || var8.field60 == 15)) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(I)[Lln;")
    public static final class473[] method3413(int arg0) {
        if (arg0 != -22947) {
            method3413(27);
        }
        field8085++;
        if (class641.field9109 == null) {
            class473[] var1 = class216.method1418((byte) 89, class379.field5339);
            class473[] var2 = new class473[var1.length];
            int var3 = 0;
            int var4 = class674.field9500.field5139.method3774(0);
            label73: for (int var5 = 0; var5 < var1.length; var5++) {
                class473 var9 = var1[var5];
                if ((var9.field6480 <= 0 || var9.field6480 >= 24) && var9.field6481 >= 800 && var9.field6477 >= 600 && (var4 != 2 || var9.field6481 <= 800 && var9.field6477 <= 600) && (var4 != 1 || var9.field6481 <= 1024 && var9.field6477 <= 768)) {
                    for (int var10 = 0; var10 < var3; var10++) {
                        class473 var11 = var2[var10];
                        if (var9.field6481 == var11.field6481 && var9.field6477 == var11.field6477) {
                            if (var11.field6480 < var9.field6480) {
                                var2[var10] = var9;
                            }
                            continue label73;
                        }
                    }
                    var2[var3] = var9;
                    var3++;
                }
            }
            class641.field9109 = new class473[var3];
            class34.method242(var2, 0, class641.field9109, 0, var3);
            int[] var6 = new int[class641.field9109.length];
            for (int var7 = 0; var7 < class641.field9109.length; var7++) {
                class473 var8 = class641.field9109[var7];
                var6[var7] = var8.field6481 * var8.field6477;
            }
            class713.method4018(66, var6, class641.field9109);
        }
        return class641.field9109;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(Z)V")
    public static void method3414(boolean arg0) {
        field8083 = null;
        if (arg0) {
            field8083 = null;
        }
    }
}
