import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aca")
public class class758 extends class101 {

    @OriginalMember(owner = "client!aca", name = "t", descriptor = "I")
    public int field10516;

    @OriginalMember(owner = "client!aca", name = "q", descriptor = "I")
    public int field10513;

    @OriginalMember(owner = "client!aca", name = "o", descriptor = "I")
    public static int field10511 = -50;

    @OriginalMember(owner = "client!aca", name = "n", descriptor = "Lmt;")
    public static class419 field10510 = new class419(11, 0, 1, 2);

    @OriginalMember(owner = "client!aca", name = "p", descriptor = "I")
    public static int field10512;

    @OriginalMember(owner = "client!aca", name = "r", descriptor = "I")
    public static int field10514;

    @OriginalMember(owner = "client!aca", name = "s", descriptor = "I")
    public static int field10515;

    @OriginalMember(owner = "client!aca", name = "a", descriptor = "(I)V")
    public static void method4214(int arg0) {
        field10510 = null;
        if (arg0 != -10119) {
            method4216(31, 7);
        }
    }

    @OriginalMember(owner = "client!aca", name = "b", descriptor = "(I)V")
    public static final void method4215(int arg0) {
        field10512++;
        int var1 = class571.field7608;
        int[] var2 = class79.field1136;
        if (arg0 <= 53) {
            return;
        }
        for (int var3 = 0; var3 < var1; var3++) {
            class73 var9 = class599.field8149[var2[var3]];
            if (var9 != null && var9.field1875 > 0) {
                var9.field1875--;
                if (var9.field1875 == 0) {
                    var9.field1797 = null;
                }
            }
        }
        for (int var4 = 0; var4 < class688.field9678; var4++) {
            long var5 = (long) class382.field5588[var4];
            class174 var7 = (class174) class234.field3169.method3953(var5, 14);
            if (var7 != null) {
                class192 var8 = var7.field2336;
                if (var8.field1875 > 0) {
                    var8.field1875--;
                    if (var8.field1875 == 0) {
                        var8.field1797 = null;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!aca", name = "a", descriptor = "(II)Z")
    public static final boolean method4216(int arg0, int arg1) {
        if (arg1 <= 3) {
            method4217(101, -30, -20, 16);
        }
        field10514++;
        return arg0 != 1 && arg0 != 7;
    }

    @OriginalMember(owner = "client!aca", name = "a", descriptor = "(IIII)I")
    public static final int method4217(int arg0, int arg1, int arg2, int arg3) {
        field10515++;
        if (arg1 != -17020) {
            return -1;
        }
        int var4 = arg3 & 0x3;
        if (var4 == 0) {
            return arg2;
        } else if (var4 == 1) {
            return arg0;
        } else if (var4 == 2) {
            return 7 - arg2;
        } else {
            return 7 - arg0;
        }
    }

    @OriginalMember(owner = "client!aca", name = "<init>", descriptor = "(II)V")
    public class758(int arg0, int arg1) {
        this.field10516 = arg0;
        this.field10513 = arg1;
    }
}
