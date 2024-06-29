import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pf")
public class class759 {

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "I")
    public static int field10335;

    @OriginalMember(owner = "client!pf", name = "b", descriptor = "I")
    public static int field10336;

    @OriginalMember(owner = "client!pf", name = "c", descriptor = "I")
    public static int field10337;

    @OriginalMember(owner = "client!pf", name = "d", descriptor = "I")
    public static int field10338;

    @OriginalMember(owner = "client!pf", name = "e", descriptor = "I")
    public static int field10339;

    @OriginalMember(owner = "client!pf", name = "f", descriptor = "I")
    public static int field10340;

    @OriginalMember(owner = "client!pf", name = "g", descriptor = "I")
    public static int field10341;

    @OriginalMember(owner = "client!pf", name = "h", descriptor = "I")
    public static int field10342;

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(IZ)I")
    public static final int method4128(int arg0, boolean arg1) {
        field10341++;
        int var2 = class596.field7567;
        if (var2 == 0) {
            return arg1 ? 0 : class340.field4159;
        } else if (var2 == 1) {
            return class340.field4159;
        } else if (var2 == 2) {
            return 0;
        } else {
            if (arg0 != 5) {
                method4128(-47, false);
            }
            return 0;
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(III)I")
    public final int method4129(int arg0, int arg1, int arg2) {
        if (arg0 != 0) {
            method4128(65, true);
        }
        field10340++;
        int var4 = class372.field4550 > arg1 ? class372.field4550 : arg1;
        if (class121.field1630 == this) {
            return 0;
        } else if (class503.field6450 == this) {
            return var4 - arg2;
        } else if (class518.field6593 == this) {
            return (var4 - arg2) / 2;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!pf", name = "b", descriptor = "(III)Z")
    public static final boolean method4130(int arg0, int arg1, int arg2) {
        field10338++;
        int var3 = 70 % ((arg0 + 31) / 47);
        return (arg2 & 0x20) != 0;
    }

    @OriginalMember(owner = "client!pf", name = "c", descriptor = "(III)Z")
    public static final boolean method4131(int arg0, int arg1, int arg2) {
        field10336++;
        return arg2 == -1 ? class76.method470(arg0, -68, arg1) & class593.method3190(6151, arg0, arg1) : true;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(IIIZ)I")
    public static final int method4132(int arg0, int arg1, int arg2, boolean arg3) {
        if (!arg3) {
            return 17;
        }
        field10339++;
        if (class562.field7147 < 100) {
            return -2;
        }
        int var4 = -2;
        int var5 = Integer.MAX_VALUE;
        int var6 = arg2 - class402.field5357;
        int var7 = arg1 - class402.field5347;
        for (class307 var8 = (class307) class402.field5329.method3591(0); var8 != null; var8 = (class307) class402.field5329.method3600((byte) 114)) {
            if (var8.field3860 == arg0) {
                int var9 = var8.field3857;
                int var10 = var8.field3859;
                int var11 = class402.field5357 + var9 << 14 | var10 + class402.field5347;
                int var12 = (var7 - var10) * (var7 - var10) + (var6 - var9) * (var6 - var9);
                if (var4 < 0 || var12 < var5) {
                    var4 = var11;
                    var5 = var12;
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(IIJZ)Ljava/lang/String;")
    public static final String method4133(int arg0, int arg1, long arg2, boolean arg3) {
        field10337++;
        Calendar var5;
        if (arg3) {
            class622.method3323(arg2, false);
            var5 = class368.field4499;
        } else {
            class525.method2886(arg1 - 125, arg2);
            var5 = class368.field4508;
        }
        int var6 = var5.get(arg1);
        int var7 = var5.get(2);
        int var8 = var5.get(1);
        int var9 = var5.get(11);
        int var10 = var5.get(12);
        return arg0 == 3 ? class240.method1583(arg0, arg2, arg3, arg1 ^ 0x79) : Integer.toString(var6 / 10) + var6 % 10 + "-" + class349.field4274[arg0][var7] + "-" + var8 + " " + var9 / 10 + var9 % 10 + ":" + var10 / 10 + var10 % 10;
    }

    @OriginalMember(owner = "client!pf", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field10335++;
        throw new IllegalStateException();
    }
}
