import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kp")
public class class8 {

    @OriginalMember(owner = "client!kp", name = "b", descriptor = "Ljava/lang/String;")
    public static String field78 = "wave2:";

    @OriginalMember(owner = "client!kp", name = "d", descriptor = "[I")
    public static int[] field80 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "I")
    public static int field77;

    @OriginalMember(owner = "client!kp", name = "c", descriptor = "I")
    public static int field79;

    @OriginalMember(owner = "client!kp", name = "e", descriptor = "I")
    public static int field81;

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(Loc;III[Z)Z", line = 6)
    public static final boolean method61(class93 arg0, int arg1, int arg2, int arg3, boolean[] arg4) {
        boolean var5 = false;
        if (class88.field1226 != class425.field6324) {
            int var6 = class198.field2829[arg1].method797(arg2, arg3);
            for (int var7 = 0; var7 <= arg1; var7++) {
                class337 var8 = class198.field2829[var7];
                if (var8 != null) {
                    int var9 = var6 - var8.method797(arg2, arg3);
                    if (arg4 != null) {
                        arg4[var7] = var8.method778(arg0, arg2, var9, arg3, 0, false);
                        if (!arg4[var7]) {
                            continue;
                        }
                    }
                    var8.method783(arg0, arg2, var9, arg3, 0, false);
                    var5 = true;
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(Lil;I)Ljava/lang/String;", line = 41)
    public static final String method62(class265 arg0, int arg1) {
        if (arg1 == 32767) {
            field81++;
            return class224.method1398(32767, arg0, arg1 - 32648);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(III)Z", line = 56)
    public static final boolean method63(int arg0, int arg1, int arg2) {
        field79++;
        if (arg1 != 4) {
            field78 = null;
        }
        if (!class229.field3230) {
            return false;
        }
        int var3 = arg0 >> 16;
        int var4 = arg0 & 0xFFFF;
        if (class119.field1607[var3] == null || class119.field1607[var3][var4] == null) {
            return false;
        }
        class249 var5 = class119.field1607[var3][var4];
        if (arg2 == -1 && var5.field3637 == 0) {
            for (class259 var6 = (class259) class373.field5574.method2649(0); var6 != null; var6 = (class259) class373.field5574.method2656(0)) {
                if (var6.field3777 == 22 || var6.field3777 == 1006 || var6.field3777 == 4 || var6.field3777 == 36 || var6.field3777 == 24) {
                    for (class249 var7 = class107.method746(var6.field3776, -64); var7 != null; var7 = class177.method1078(var7, (byte) -85)) {
                        if (var5.field3622 == var7.field3622) {
                            return true;
                        }
                    }
                }
            }
        } else {
            for (class259 var8 = (class259) class373.field5574.method2649(0); var8 != null; var8 = (class259) class373.field5574.method2656(0)) {
                if (var8.field3779 == arg2 && var5.field3622 == var8.field3776 && (var8.field3777 == 22 || var8.field3777 == 1006 || var8.field3777 == 4 || var8.field3777 == 36 || var8.field3777 == 24)) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(II)I", line = 130)
    public static final int method64(int arg0, int arg1) {
        int var7 = arg1 - 1;
        field77++;
        int var2 = var7 | var7 >>> 1;
        if (arg0 != 1388313616) {
            method64(101, -30);
        }
        int var3 = var2 | var2 >>> 2;
        int var4 = var3 | var3 >>> 4;
        int var5 = var4 | var4 >>> 8;
        int var6 = var5 | var5 >>> 16;
        return var6 + 1;
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(Z)V", line = 152)
    public static void method65(boolean arg0) {
        if (arg0) {
            field78 = null;
            field80 = null;
        }
    }
}
