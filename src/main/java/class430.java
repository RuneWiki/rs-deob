import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sr")
public class class430 extends class100 {

    @OriginalMember(owner = "client!sr", name = "n", descriptor = "Lvv;")
    public static class313 field6446 = new class313(44, -1);

    @OriginalMember(owner = "client!sr", name = "t", descriptor = "Z")
    public static boolean field6452 = true;

    @OriginalMember(owner = "client!sr", name = "l", descriptor = "I")
    public int field6444;

    @OriginalMember(owner = "client!sr", name = "m", descriptor = "I")
    public static int field6445;

    @OriginalMember(owner = "client!sr", name = "p", descriptor = "I")
    public int field6448;

    @OriginalMember(owner = "client!sr", name = "q", descriptor = "I")
    public static int field6449;

    @OriginalMember(owner = "client!sr", name = "r", descriptor = "I")
    public int field6450;

    @OriginalMember(owner = "client!sr", name = "u", descriptor = "I")
    public static int field6453;

    @OriginalMember(owner = "client!sr", name = "s", descriptor = "Lvl;")
    public class243 field6451;

    @OriginalMember(owner = "client!sr", name = "o", descriptor = "[Ltq;")
    public class273[] field6447;

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(IILza;Z)Z", line = 12)
    public final boolean method2617(int arg0, int arg1, class491 arg2, boolean arg3) {
        field6445++;
        if (arg3) {
            return false;
        }
        if (this.field6447 != null) {
            for (int var5 = 0; var5 < this.field6447.length; var5++) {
                if (this.field6447[var5].method1811(arg0, arg1) && this.field6451.method27(arg2, 127, arg1, arg0)) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(ILec;B)Ljava/lang/String;", line = 39)
    public static final String method2618(int arg0, class68 arg1, byte arg2) {
        field6453++;
        if (!client.method475(arg1).method1991((byte) -120, arg0) && arg1.field1008 == null) {
            return null;
        }
        if (arg2 <= 94) {
            field6452 = true;
        }
        if (arg1.field1149 == null || arg0 >= arg1.field1149.length || arg1.field1149[arg0] == null || arg1.field1149[arg0].trim().length() == 0) {
            return class494.field7214 ? "Hidden-" + arg0 : null;
        } else {
            return arg1.field1149[arg0];
        }
    }

    @OriginalMember(owner = "client!sr", name = "b", descriptor = "(II)V", line = 63)
    public static final void method2619(int arg0, int arg1) {
        class515 var2 = null;
        for (int var3 = arg0; var3 < arg1; var3++) {
            class220 var4 = class511.field7488[var3];
            if (var4 != null) {
                for (int var5 = 0; var5 < class276.field4537; var5++) {
                    for (int var6 = 0; var6 < class236.field4089; var6++) {
                        var2 = var4.method1510(var6, var5, var2);
                        if (var2 != null) {
                            int var7 = var6 << class276.field4534;
                            int var8 = var5 << class276.field4534;
                            for (int var9 = var3 - 1; var9 >= 0; var9--) {
                                class220 var10 = class511.field7488[var9];
                                if (var10 != null) {
                                    int var11 = var4.method1516(var6, var5) - var10.method1516(var6, var5);
                                    int var12 = var4.method1516(var6 + 1, var5) - var10.method1516(var6 + 1, var5);
                                    int var13 = var4.method1516(var6 + 1, var5 + 1) - var10.method1516(var6 + 1, var5 + 1);
                                    int var14 = var4.method1516(var6, var5 + 1) - var10.method1516(var6, var5 + 1);
                                    var10.method1509(var2, var7, (var11 + var12 + var13 + var14) / 4, var8, 0, false);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!sr", name = "b", descriptor = "(I)V", line = 132)
    public static void method2620(int arg0) {
        if (arg0 != 4) {
            method2620(-15);
        }
        field6446 = null;
    }

    @OriginalMember(owner = "client!sr", name = "b", descriptor = "(B)V", line = 146)
    public static final void method2621(byte arg0) {
        if (class494.field7217 < 0) {
            class435.field6504 = -1;
            class129.field2226 = -1;
            class494.field7217 = 0;
        }
        field6449++;
        if (class494.field7217 > class210.field3343) {
            class129.field2226 = -1;
            class435.field6504 = -1;
            class494.field7217 = class210.field3343;
        }
        if (class471.field6970 < 0) {
            class435.field6504 = -1;
            class129.field2226 = -1;
            class471.field6970 = 0;
        }
        if (class471.field6970 > class210.field3342) {
            class129.field2226 = -1;
            class435.field6504 = -1;
            class471.field6970 = class210.field3342;
        }
        if (arg0 < 123) {
            field6446 = null;
        }
    }
}
