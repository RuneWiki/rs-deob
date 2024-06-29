import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sl")
public abstract class class205 extends class325 {

    @OriginalMember(owner = "client!sl", name = "F", descriptor = "Z")
    public volatile boolean field3139 = true;

    @OriginalMember(owner = "client!sl", name = "E", descriptor = "I")
    public static int field3138 = -1;

    @OriginalMember(owner = "client!sl", name = "R", descriptor = "I")
    public static int field3150 = 0;

    @OriginalMember(owner = "client!sl", name = "S", descriptor = "Ljava/lang/String;")
    public static String field3151 = "Connected to update server";

    @OriginalMember(owner = "client!sl", name = "K", descriptor = "I")
    public static int field3143 = 0;

    @OriginalMember(owner = "client!sl", name = "O", descriptor = "[I")
    public static int[] field3147 = new int[32];

    @OriginalMember(owner = "client!sl", name = "T", descriptor = "Z")
    public static boolean field3152 = false;

    @OriginalMember(owner = "client!sl", name = "I", descriptor = "I")
    public static int field3141;

    @OriginalMember(owner = "client!sl", name = "J", descriptor = "I")
    public static int field3142;

    @OriginalMember(owner = "client!sl", name = "L", descriptor = "I")
    public static int field3144;

    @OriginalMember(owner = "client!sl", name = "M", descriptor = "I")
    public static int field3145;

    @OriginalMember(owner = "client!sl", name = "N", descriptor = "I")
    public static int field3146;

    @OriginalMember(owner = "client!sl", name = "G", descriptor = "Lpe;")
    public static class277 field3140;

    @OriginalMember(owner = "client!sl", name = "P", descriptor = "Z")
    public boolean field3148;

    @OriginalMember(owner = "client!sl", name = "Q", descriptor = "Z")
    public boolean field3149;

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(IIIIIII)V", line = 7)
    public static final void method1475(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class161 var7 = class94.method680(arg1, 0, arg0);
        field3141++;
        if (var7 != null && var7.field2570 != null) {
            class296 var8 = new class296();
            var8.field4574 = var7;
            var8.field4575 = var7.field2570;
            class251.method1719(-31, var8);
        }
        class201.field3098 = arg5;
        class183.field2893 = arg0;
        class38.field552 = arg6;
        class7.field110 = true;
        class242.field3685 = arg4;
        class333.field5194 = arg1;
        if (arg2 < -102) {
            class280.field4352 = arg3;
            class254.method1776(4, var7);
        }
    }

    @OriginalMember(owner = "client!sl", name = "b", descriptor = "(III)Lu;", line = 36)
    public static final class35 method1476(int arg0, int arg1, int arg2) {
        class79 var3 = class213.field3262[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class35 var4 = var3.field1161;
            var3.field1161 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!sl", name = "c", descriptor = "(III)J", line = 51)
    public static final long method1478(int arg0, int arg1, int arg2) {
        class79 var3 = class213.field3262[arg0][arg1][arg2];
        return var3 == null || var3.field1161 == null ? 0L : var3.field1161.field512;
    }

    @OriginalMember(owner = "client!sl", name = "d", descriptor = "(B)V", line = 63)
    public static void method1479(byte arg0) {
        field3140 = null;
        field3147 = null;
        field3151 = null;
        if (arg0 > -11) {
            method1475(95, 20, 8, 101, -66, -23, 115);
        }
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(IIIIIIII)V", line = 77)
    public static final void method1480(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field3146++;
        if (class154.method1161(arg0, 49)) {
            client.method1006(class8.field128[arg0], arg3, arg2, arg1, arg6, arg4, arg5, arg7);
        }
    }

    @OriginalMember(owner = "client!sl", name = "b", descriptor = "(IIIIIIII)Z", line = 107)
    public static final boolean method1482(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
            return false;
        } else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
            return false;
        } else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
            return false;
        } else if (arg0 > arg5 && arg0 > arg6 && arg0 > arg7) {
            return false;
        } else {
            int var8 = (arg1 - arg2) * (arg6 - arg5) - (arg0 - arg5) * (arg3 - arg2);
            int var9 = (arg1 - arg4) * (arg5 - arg7) - (arg0 - arg7) * (arg2 - arg4);
            int var10 = (arg1 - arg3) * (arg7 - arg6) - (arg0 - arg6) * (arg4 - arg3);
            return var8 * var10 > 0 && var9 * var10 > 0;
        }
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(IZ)V", line = 137)
    public static final void method1483(int arg0, boolean arg1) {
        field3142++;
        if (arg1) {
            field3151 = (String) null;
        }
        class153.field2311.method741(arg0, (byte) 121);
    }

    @OriginalMember(owner = "client!sl", name = "c", descriptor = "(B)[B")
    public abstract byte[] method1477(byte arg0);

    @OriginalMember(owner = "client!sl", name = "b", descriptor = "(Z)I")
    public abstract int method1481(boolean arg0);
}
