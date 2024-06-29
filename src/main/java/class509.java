import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uda")
public class class509 {

    @OriginalMember(owner = "client!uda", name = "c", descriptor = "I")
    public int field7091;

    @OriginalMember(owner = "client!uda", name = "a", descriptor = "Lbda;")
    public static class401 field7089 = new class401("WTRC", 1);

    @OriginalMember(owner = "client!uda", name = "e", descriptor = "Lsm;")
    public static class577 field7093 = new class577();

    @OriginalMember(owner = "client!uda", name = "b", descriptor = "I")
    public static int field7090;

    @OriginalMember(owner = "client!uda", name = "d", descriptor = "I")
    public static int field7092;

    @OriginalMember(owner = "client!uda", name = "f", descriptor = "I")
    public static int field7094;

    @OriginalMember(owner = "client!uda", name = "g", descriptor = "I")
    public static int field7095;

    @OriginalMember(owner = "client!uda", name = "i", descriptor = "I")
    public static int field7097;

    @OriginalMember(owner = "client!uda", name = "j", descriptor = "I")
    public static int field7098;

    @OriginalMember(owner = "client!uda", name = "h", descriptor = "[I")
    public static int[] field7096;

    @OriginalMember(owner = "client!uda", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field7097++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!uda", name = "a", descriptor = "(Lqa;ILkr;Lkr;)V")
    public static final void method2845(class167 arg0, int arg1, class329 arg2, class329 arg3) {
        if (arg1 < 31) {
            return;
        }
        field7094++;
        class389.field5395 = class477.method2705(class39.field592, 0, (byte) -26, arg3);
        class332.field4584 = arg0.method982(class389.field5395, class295.method1803(arg2, class39.field592, 0), true);
        class621.field8953 = class477.method2705(class496.field6916, 0, (byte) -26, arg3);
        class522.field7281 = arg0.method982(class621.field8953, class295.method1803(arg2, class496.field6916, 0), true);
        class627.field9137 = class477.method2705(class433.field5898, 0, (byte) -26, arg3);
        class95.field1282 = arg0.method982(class627.field9137, class295.method1803(arg2, class433.field5898, 0), true);
    }

    @OriginalMember(owner = "client!uda", name = "a", descriptor = "(IIIIIZ)V")
    public static final void method2846(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (!arg5) {
            field7095++;
            if (class501.field6954.field7856 != 0 && arg3 != 0 && class369.field5138 < 50 && arg2 != -1) {
                class172.field2225[class369.field5138++] = new class201((byte) 1, arg2, arg3, arg4, arg0, arg1);
            }
        }
    }

    @OriginalMember(owner = "client!uda", name = "<init>", descriptor = "(I)V")
    public class509(int arg0) {
        this.field7091 = arg0;
    }

    @OriginalMember(owner = "client!uda", name = "a", descriptor = "(I)V")
    public static void method2847(int arg0) {
        field7093 = null;
        field7089 = null;
        field7096 = null;
        if (arg0 < 77) {
            method2849(-89);
        }
    }

    @OriginalMember(owner = "client!uda", name = "b", descriptor = "(I)V")
    public static final void method2848(int arg0) {
        field7098++;
        int var1 = class501.field6954.method3538(1, class428.field5845);
        if (var1 == 0) {
            class625.field9046 = null;
            class285.method1770(0, true);
        } else if (var1 == 1) {
            class595.method3429((byte) 106, (byte) 0);
            class285.method1770(512, true);
            if (class310.field3971 != null) {
                class52.method287(0);
            }
        } else {
            class595.method3429((byte) 106, (byte) (class227.field2903 - 4 & 0xFF));
            class285.method1770(2, true);
        }
        if (arg0 == -4) {
            class544.field7587 = class187.field2407;
        }
    }

    @OriginalMember(owner = "client!uda", name = "c", descriptor = "(I)V")
    public static final void method2849(int arg0) {
        if (class568.field7951 < 1024.0F) {
            class568.field7951 = 1024.0F;
        }
        field7092++;
        if (class568.field7951 > 3072.0F) {
            class568.field7951 = 3072.0F;
        }
        while (class521.field7250 >= 16384.0F) {
            class521.field7250 -= 16384.0F;
        }
        while (class521.field7250 < 0.0F) {
            class521.field7250 += 16384.0F;
        }
        int var1 = class223.field2859 >> 9;
        int var2 = class21.field301 >> 9;
        int var3 = class341.method2147(class187.field2407, class223.field2859, arg0 ^ arg0, class21.field301);
        int var4 = 0;
        if (var1 > 3 && var2 > 3 && var1 < class139.field1760 - 4 && (class369.field5135 - 4) > var2) {
            for (int var5 = var1 - 4; var5 <= var1 + 4; var5++) {
                for (int var6 = var2 - 4; var6 <= var2 + 4; var6++) {
                    int var7 = class187.field2407;
                    if (var7 < 3 && class291.method1786(var6, (byte) -9, var5)) {
                        var7++;
                    }
                    int var8 = 0;
                    if (class442.field6004.field1283 != null && class442.field6004.field1283[var7] != null) {
                        var8 = (class442.field6004.field1283[var7][var5][var6] & 0xFF) * 8;
                    }
                    int var9 = var3 + var8 - class501.field6947[var7].method1031(var5, var6);
                    if (var4 < var9) {
                        var4 = var9;
                    }
                }
            }
        }
        int var10 = (var4 >> 2) * 1536;
        if (var10 > 786432) {
            var10 = 786432;
        }
        if (var10 < 262144) {
            var10 = 262144;
        }
        if (class610.field8773 < var10) {
            class610.field8773 += (var10 - class610.field8773) / 24;
        } else if (class610.field8773 > var10) {
            class610.field8773 += (var10 - class610.field8773) / 80;
            return;
        }
    }
}
