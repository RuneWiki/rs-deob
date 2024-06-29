import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wg")
public class class293 {

    @OriginalMember(owner = "client!wg", name = "h", descriptor = "I")
    public static int field4221 = 0;

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "I")
    public static int field4214;

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "I")
    public static int field4215;

    @OriginalMember(owner = "client!wg", name = "c", descriptor = "I")
    public static int field4216;

    @OriginalMember(owner = "client!wg", name = "d", descriptor = "I")
    public static int field4217;

    @OriginalMember(owner = "client!wg", name = "e", descriptor = "I")
    public static int field4218;

    @OriginalMember(owner = "client!wg", name = "f", descriptor = "I")
    public static int field4219;

    @OriginalMember(owner = "client!wg", name = "g", descriptor = "I")
    public static int field4220;

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(Let;ILjava/lang/Object;)V", line = 7)
    public static final void method1854(class419 arg0, int arg1, Object arg2) {
        field4219++;
        if (arg1 < 63) {
            field4221 = -125;
        }
        if (arg0.field6191 == null) {
            return;
        }
        for (int var3 = 0; var3 < 50 && arg0.field6191.peekEvent() != null; var3++) {
            class213.method1462(1L, -5184);
        }
        if (arg2 != null) {
            arg0.field6191.postEvent(new ActionEvent(arg2, 1001, "dummy"));
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(BFFF)I", line = 32)
    public static final int method1855(byte arg0, float arg1, float arg2, float arg3) {
        field4215++;
        float var4 = arg1 < 0.0F ? -arg1 : arg1;
        float var5 = (arg3 < 0.0F) ? -arg3 : arg3;
        if (arg0 != -91) {
            field4221 = 4;
        }
        float var6 = (arg2 < 0.0F) ? -arg2 : arg2;
        if (var4 < var5 && var6 < var5) {
            return arg3 > 0.0F ? 0 : 1;
        } else if (var6 > var4 && var5 < var6) {
            return arg2 > 0.0F ? 2 : 3;
        } else if (arg1 > 0.0F) {
            return 4;
        } else {
            return 5;
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(ILjava/lang/String;)V", line = 75)
    public static final void method1856(int arg0, String arg1) {
        if (class474.field6989 == null) {
            class479.method2891(-98);
        }
        field4218++;
        String[] var2 = class92.method817((byte) 20, arg1, '\n');
        if (arg0 < 120) {
            return;
        }
        for (int var3 = 0; var3 < var2.length; var3++) {
            for (int var4 = class209.field3033; var4 > 0; var4--) {
                class474.field6989[var4] = class474.field6989[var4 - 1];
            }
            class474.field6989[0] = var2[var3];
            if (class474.field6989.length - 1 > class209.field3033) {
                if (class7.field88 > 0) {
                    class7.field88++;
                }
                class209.field3033++;
            }
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(II)Z", line = 121)
    public static final boolean method1857(int arg0, int arg1) {
        field4220++;
        if (arg0 == 49 || arg0 == 51 || arg0 == 16 || arg0 == 4 || arg0 == 2) {
            return true;
        } else {
            if (arg1 != 0) {
                field4221 = 73;
            }
            return arg0 == 6 || arg0 == 1009;
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(IIIIZ)V", line = 139)
    public static final void method1858(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field4214++;
        int var5 = 0;
        if (!arg4) {
            field4221 = -103;
        }
        int var6 = arg2;
        int var7 = -arg2;
        int var8 = -1;
        int var9 = class332.method2034(class126.field1842, -24309, arg2 + arg3, class72.field992);
        int var10 = class332.method2034(class126.field1842, -24309, arg3 - arg2, class72.field992);
        class531.method3136(var10, -119, arg1, var9, class141.field1996[arg0]);
        while (var5 < var6) {
            var8 += 2;
            var7 += var8;
            if (var7 > 0) {
                var6--;
                var7 -= var6 << 1;
                int var11 = arg0 - var6;
                int var12 = arg0 + var6;
                if (var12 >= class471.field6963 && class401.field5947 >= var11) {
                    int var13 = class332.method2034(class126.field1842, -24309, arg3 + var5, class72.field992);
                    int var14 = class332.method2034(class126.field1842, -24309, arg3 - var5, class72.field992);
                    if (var12 <= class401.field5947) {
                        class531.method3136(var14, 127, arg1, var13, class141.field1996[var12]);
                    }
                    if (var11 >= class471.field6963) {
                        class531.method3136(var14, -40, arg1, var13, class141.field1996[var11]);
                    }
                }
            }
            var5++;
            int var15 = arg0 - var5;
            int var16 = arg0 + var5;
            if (var16 >= class471.field6963 && var15 <= class401.field5947) {
                int var17 = class332.method2034(class126.field1842, -24309, arg3 + var6, class72.field992);
                int var18 = class332.method2034(class126.field1842, -24309, arg3 - var6, class72.field992);
                if (var16 <= class401.field5947) {
                    class531.method3136(var18, 126, arg1, var17, class141.field1996[var16]);
                }
                if (class471.field6963 <= var15) {
                    class531.method3136(var18, -119, arg1, var17, class141.field1996[var15]);
                }
            }
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(B)V", line = 217)
    public static final void method1859(byte arg0) {
        field4217++;
        class380.field5611.method1105(false);
        class93.field1272.method1105(false);
        class229.field3358.method1105(false);
        class452.field6648.method1105(false);
        if (arg0 < -60) {
            class358.field4979.method1105(false);
        }
    }
}
