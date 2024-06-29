import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vn")
public class class288 implements class21 {

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "I")
    public int field4064;

    @OriginalMember(owner = "client!vn", name = "k", descriptor = "I")
    public int field4074;

    @OriginalMember(owner = "client!vn", name = "b", descriptor = "Lrt;")
    public class212 field4065;

    @OriginalMember(owner = "client!vn", name = "l", descriptor = "I")
    public int field4075;

    @OriginalMember(owner = "client!vn", name = "c", descriptor = "I")
    public int field4066;

    @OriginalMember(owner = "client!vn", name = "g", descriptor = "I")
    public int field4070;

    @OriginalMember(owner = "client!vn", name = "d", descriptor = "I")
    public int field4067;

    @OriginalMember(owner = "client!vn", name = "j", descriptor = "I")
    public int field4073;

    @OriginalMember(owner = "client!vn", name = "f", descriptor = "Lcp;")
    public class679 field4069;

    @OriginalMember(owner = "client!vn", name = "h", descriptor = "F")
    public static float field4071 = 0.25F;

    @OriginalMember(owner = "client!vn", name = "e", descriptor = "I")
    public static int field4068;

    @OriginalMember(owner = "client!vn", name = "i", descriptor = "I")
    public static int field4072;

    @OriginalMember(owner = "client!vn", name = "m", descriptor = "I")
    public static int field4076;

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(B)Los;", line = 3)
    public class412 method193(byte arg0) {
        if (arg0 >= -21) {
            this.field4073 = 52;
        }
        field4068++;
        return null;
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "()V", line = 18)
    public static final void method1783() {
        if (class705.field9916 != null) {
            for (int var0 = 0; var0 < class705.field9916.length; var0++) {
                for (int var1 = 0; var1 < class657.field8966; var1++) {
                    for (int var2 = 0; var2 < class227.field3196; var2++) {
                        if (class705.field9916[var0][var1][var2] != null) {
                            class705.field9916[var0][var1][var2].method220(true);
                        }
                        class705.field9916[var0][var1][var2] = null;
                    }
                }
            }
        }
        class705.field9916 = null;
        class684.field9625 = null;
        if (class412.field5656 != null) {
            for (int var3 = 0; var3 < class412.field5656.length; var3++) {
                for (int var4 = 0; var4 < class657.field8966; var4++) {
                    for (int var5 = 0; var5 < class227.field3196; var5++) {
                        if (class412.field5656[var3][var4][var5] != null) {
                            class412.field5656[var3][var4][var5].method220(true);
                        }
                        class412.field5656[var3][var4][var5] = null;
                    }
                }
            }
        }
        class412.field5656 = null;
        class467.field6283 = null;
        class703.field9899 = null;
        class218.field3099 = null;
        class90.field1369 = 0;
        if (class249.field3448 != null) {
            for (int var6 = 0; var6 < class90.field1369; var6++) {
                class249.field3448[var6] = null;
            }
        }
        if (class677.field9570 != null) {
            for (int var7 = 0; var7 < class155.field2440; var7++) {
                class677.field9570[var7] = null;
            }
            class155.field2440 = 0;
        }
        if (class350.field4791 != null) {
            for (int var8 = 0; var8 < class697.field9777; var8++) {
                class350.field4791[var8] = null;
            }
            for (int var9 = 0; var9 < class13.field218; var9++) {
                for (int var10 = 0; var10 < class657.field8966; var10++) {
                    for (int var11 = 0; var11 < class227.field3196; var11++) {
                        class510.field6812[var9][var10][var11] = 0L;
                    }
                }
            }
            class697.field9777 = 0;
        }
        class137.field2226 = null;
        class397.method2280(-125);
        class670.field9502.method324(-96);
        class600.field7970 = null;
        class46.field664 = null;
        class128.field2144 = null;
        class692.field9746 = null;
        class491.field6629 = null;
        class269.field3751 = null;
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(ILjava/lang/String;IZ)Z", line = 160)
    public static final boolean method1784(int arg0, String arg1, int arg2, boolean arg3) {
        field4076++;
        if (arg0 < 2 || arg0 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg0);
        }
        boolean var4 = false;
        boolean var5 = false;
        int var6 = 0;
        int var7 = arg1.length();
        int var8 = 0;
        if (arg2 <= 53) {
            method1784(-20, null, 35, true);
        }
        while (var8 < var7) {
            label79: {
                char var9 = arg1.charAt(var8);
                if (var8 == 0) {
                    if (var9 == '-') {
                        var4 = true;
                        break label79;
                    }
                    if (var9 == '+' && arg3) {
                        break label79;
                    }
                }
                int var11;
                if (var9 >= '0' && var9 <= '9') {
                    var11 = var9 - '0';
                } else if (var9 >= 'A' && var9 <= 'Z') {
                    var11 = var9 - '7';
                } else if (var9 >= 'a' && var9 <= 'z') {
                    var11 = var9 - 'W';
                } else {
                    return false;
                }
                if (var11 >= arg0) {
                    return false;
                }
                if (var4) {
                    var11 = -var11;
                }
                int var10 = arg0 * var6 + var11;
                if ((var10 / arg0) != var6) {
                    return false;
                }
                var5 = true;
                var6 = var10;
            }
            var8++;
        }
        return var5;
    }

    @OriginalMember(owner = "client!vn", name = "<init>", descriptor = "(Lrt;Lcp;IIIIIII)V", line = 248)
    public class288(class212 arg0, class679 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        this.field4064 = arg2;
        this.field4074 = arg7;
        this.field4065 = arg0;
        this.field4075 = arg5;
        this.field4066 = arg8;
        this.field4070 = arg6;
        this.field4067 = arg4;
        this.field4073 = arg3;
        this.field4069 = arg1;
    }
}
