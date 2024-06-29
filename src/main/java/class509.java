import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bf")
public class class509 extends class105 {

    @OriginalMember(owner = "client!bf", name = "D", descriptor = "Ljava/lang/Object;")
    private Object field7392;

    @OriginalMember(owner = "client!bf", name = "E", descriptor = "I")
    public static int field7393 = 0;

    @OriginalMember(owner = "client!bf", name = "G", descriptor = "F")
    public static float field7395 = 1024.0F;

    @OriginalMember(owner = "client!bf", name = "F", descriptor = "I")
    public static int field7394;

    @OriginalMember(owner = "client!bf", name = "H", descriptor = "I")
    public static int field7396;

    @OriginalMember(owner = "client!bf", name = "I", descriptor = "I")
    public static int field7397;

    @OriginalMember(owner = "client!bf", name = "L", descriptor = "I")
    public static int field7399;

    @OriginalMember(owner = "client!bf", name = "M", descriptor = "I")
    public static int field7400;

    @OriginalMember(owner = "client!bf", name = "J", descriptor = "Ltd;")
    public static class374 field7398;

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(Ljava/lang/String;B)J")
    public static final long method2991(String arg0, byte arg1) {
        field7396++;
        long var2 = 0L;
        int var4 = arg0.length();
        for (int var5 = 0; var5 < var4; var5++) {
            var2 *= 37L;
            char var6 = arg0.charAt(var5);
            if (var6 >= 'A' && var6 <= 'Z') {
                var2 += (var6 + 1 - 65);
            } else if (var6 >= 'a' && var6 <= 'z') {
                var2 += (var6 - 96);
            } else if (var6 >= '0' && var6 <= '9') {
                var2 += (var6 + 27 - 48);
            }
            if (var2 >= 177917621779460413L) {
                break;
            }
        }
        int var7 = -104 / ((-arg1 - 4) / 56);
        while ((var2 % 37L) == 0L && var2 != 0L) {
            var2 /= 37L;
        }
        return var2;
    }

    @OriginalMember(owner = "client!bf", name = "e", descriptor = "(I)V")
    public static void method2992(int arg0) {
        if (arg0 != 57) {
            method2991(null, (byte) 23);
        }
        field7398 = null;
    }

    @OriginalMember(owner = "client!bf", name = "<init>", descriptor = "(Lmb;Ljava/lang/Object;I)V")
    public class509(class288 arg0, Object arg1, int arg2) {
        super(arg0, arg2);
        this.field7392 = arg1;
    }

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "(Z)Z")
    public final boolean method360(boolean arg0) {
        if (arg0) {
            this.method361(64);
        }
        field7397++;
        return false;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(BILza;ILpu;)V")
    public static final void method2993(byte arg0, int arg1, class491 arg2, int arg3, class411 arg4) {
        if (arg0 != 106) {
            return;
        }
        field7394++;
        class536.field7873.method2543(arg0 + 7549);
        if (class106.field1902) {
            return;
        }
        for (class366 var5 = (class366) arg4.method2538(arg0 - 109); var5 != null; var5 = (class366) arg4.method2535((byte) -125)) {
            class445 var6 = class210.field3329.method492(var5.field5694, (byte) -10);
            if (class78.method572(var6, arg0 - 221)) {
                boolean var7 = class361.method2309(var6, arg3, var5, arg1, arg2, -8495);
                if (var7) {
                    class417.method2567((byte) -96, arg2, var6, var5);
                }
            }
        }
    }

    @OriginalMember(owner = "client!bf", name = "d", descriptor = "(I)Ljava/lang/Object;")
    public final Object method361(int arg0) {
        field7400++;
        if (arg0 != -14111) {
            method2992(-108);
        }
        return this.field7392;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(Lec;ZZII)V")
    public static final void method2994(class68 arg0, boolean arg1, boolean arg2, int arg3, int arg4) {
        field7399++;
        int var5 = arg0.field1009;
        int var6 = arg0.field1081;
        if (!arg1) {
            return;
        }
        if (arg0.field1060 == 0) {
            arg0.field1009 = arg0.field1156;
        } else if (arg0.field1060 == 1) {
            arg0.field1009 = arg3 - arg0.field1156;
        } else if (arg0.field1060 == 2) {
            arg0.field1009 = arg0.field1156 * arg3 >> 14;
        }
        if (arg0.field1061 == 0) {
            arg0.field1081 = arg0.field1132;
        } else if (arg0.field1061 == 1) {
            arg0.field1081 = arg4 - arg0.field1132;
        } else if (arg0.field1061 == 2) {
            arg0.field1081 = arg0.field1132 * arg4 >> 14;
        }
        if (arg0.field1060 == 4) {
            arg0.field1009 = arg0.field1081 * arg0.field1068 / arg0.field992;
        }
        if (arg0.field1061 == 4) {
            arg0.field1081 = arg0.field992 * arg0.field1009 / arg0.field1068;
        }
        if (class494.field7214 && (client.method475(arg0).field4938 != 0 || arg0.field1086 == 0)) {
            if (arg0.field1081 < 5 && arg0.field1009 < 5) {
                arg0.field1009 = 5;
                arg0.field1081 = 5;
            } else {
                if (arg0.field1081 <= 0) {
                    arg0.field1081 = 5;
                }
                if (arg0.field1009 <= 0) {
                    arg0.field1009 = 5;
                }
            }
        }
        if (class81.field1426 == arg0.field1115) {
            class446.field6673 = arg0;
        }
        if (arg2 && arg0.field1000 != null && arg0.field1009 != var5 || arg0.field1081 != var6) {
            class483 var7 = new class483();
            var7.field7100 = arg0;
            var7.field7101 = arg0.field1000;
            class503.field7344.method2541(0, var7);
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(Lza;Lvl;III)V")
    public static final void method2995(class491 arg0, class243 arg1, int arg2, int arg3, int arg4) {
        if (arg3 < class236.field4089) {
            class465 var5 = class66.field977[arg2][arg3 + 1][arg4];
            if (var5 != null && var5.field6913 != null && var5.field6913.method42(false)) {
                arg1.method39(0, class70.field1217, arg0, 0, 0, var5.field6913, true);
            }
        }
        if (arg4 < class236.field4089) {
            class465 var6 = class66.field977[arg2][arg3][arg4 + 1];
            if (var6 != null && var6.field6913 != null && var6.field6913.method42(false)) {
                arg1.method39(0, 0, arg0, class70.field1217, 0, var6.field6913, true);
            }
        }
        if (arg3 < class236.field4089 && arg4 < class276.field4537) {
            class465 var7 = class66.field977[arg2][arg3 + 1][arg4 + 1];
            if (var7 != null && var7.field6913 != null && var7.field6913.method42(false)) {
                arg1.method39(0, class70.field1217, arg0, class70.field1217, 0, var7.field6913, true);
            }
        }
        if (arg3 < class236.field4089 && arg4 > 0) {
            class465 var8 = class66.field977[arg2][arg3 + 1][arg4 - 1];
            if (var8 != null && var8.field6913 != null && var8.field6913.method42(false)) {
                arg1.method39(0, class70.field1217, arg0, -class70.field1217, 0, var8.field6913, true);
            }
        }
    }
}
