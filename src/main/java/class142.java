import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uq")
public class class142 {

    @OriginalMember(owner = "client!uq", name = "b", descriptor = "I")
    public static int field1996 = 0;

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "I")
    public int field1995;

    @OriginalMember(owner = "client!uq", name = "c", descriptor = "I")
    public static int field1997;

    @OriginalMember(owner = "client!uq", name = "d", descriptor = "I")
    public int field1998;

    @OriginalMember(owner = "client!uq", name = "e", descriptor = "I")
    public int field1999;

    @OriginalMember(owner = "client!uq", name = "f", descriptor = "I")
    public static int field2000;

    @OriginalMember(owner = "client!uq", name = "g", descriptor = "I")
    public static int field2001;

    @OriginalMember(owner = "client!uq", name = "h", descriptor = "I")
    public static int field2002;

    @OriginalMember(owner = "client!uq", name = "i", descriptor = "I")
    public int field2003;

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(I[Lvp;I)V", line = 5)
    public static final void method972(int arg0, class162[] arg1, int arg2) {
        for (int var3 = arg2; var3 < arg1.length; var3++) {
            class162 var4 = arg1[var3];
            if (var4 != null) {
                if (var4.field2552 == 0) {
                    if (var4.field2462 != null) {
                        method972(arg0, var4.field2462, arg2);
                    }
                    class243 var5 = (class243) class385.field5297.method2799((long) var4.field2456, true);
                    if (var5 != null) {
                        class541.method3291(3, arg0, var5.field3471);
                    }
                }
                if (arg0 == 0 && var4.field2491 != null) {
                    class518 var6 = new class518();
                    var6.field7376 = var4;
                    var6.field7383 = var4.field2491;
                    class98.method757(var6);
                }
                if (arg0 == 1 && var4.field2556 != null) {
                    if (var4.field2415 >= 0) {
                        class162 var7 = class153.method1117(var4.field2456, -30170);
                        if (var7 == null || var7.field2462 == null || var7.field2462.length <= var4.field2415 || var7.field2462[var4.field2415] != var4) {
                            continue;
                        }
                    }
                    class518 var8 = new class518();
                    var8.field7376 = var4;
                    var8.field7383 = var4.field2556;
                    class98.method757(var8);
                }
            }
        }
        field2000++;
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(IIIIIB[B)Z", line = 74)
    public static final boolean method973(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, byte[] arg6) {
        if (arg5 <= 83) {
            return true;
        }
        field1997++;
        int var7 = arg1 % arg0;
        int var8;
        if (var7 == 0) {
            var8 = 0;
        } else {
            var8 = arg0 - var7;
        }
        int var9 = -((arg0 + arg2 - 1) / arg0);
        int var10 = -((arg1 + arg0 - 1) / arg0);
        for (int var11 = var9; var11 < 0; var11++) {
            for (int var12 = var10; var12 < 0; var12++) {
                if (arg6[arg4] == 0) {
                    return true;
                }
                arg4 += arg0;
            }
            int var13 = arg4 - var8;
            if (arg6[var13 - 1] == 0) {
                return true;
            }
            arg4 = arg3 + var13;
        }
        return false;
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(BII)Z", line = 127)
    public static final boolean method974(byte arg0, int arg1, int arg2) {
        field2002++;
        int var3 = -46 / ((arg0 - 43) / 51);
        return class194.method1312(arg2, 9, arg1) & class591.method3508(arg2, arg1, -68);
    }
}
