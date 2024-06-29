import java.io.File;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!afa")
public class class535 {

    @OriginalMember(owner = "client!afa", name = "c", descriptor = "Ltt;")
    public static class338 field7349 = new class338(24, -1);

    @OriginalMember(owner = "client!afa", name = "g", descriptor = "[Lto;")
    public static class229[] field7353 = new class229[300];

    @OriginalMember(owner = "client!afa", name = "e", descriptor = "Leba;")
    public static class550 field7351 = new class550(108, -2);

    @OriginalMember(owner = "client!afa", name = "h", descriptor = "S")
    public static short field7354 = 256;

    @OriginalMember(owner = "client!afa", name = "a", descriptor = "I")
    public static int field7347;

    @OriginalMember(owner = "client!afa", name = "b", descriptor = "I")
    public static int field7348;

    @OriginalMember(owner = "client!afa", name = "d", descriptor = "I")
    public static int field7350;

    @OriginalMember(owner = "client!afa", name = "f", descriptor = "I")
    public static int field7352;

    @OriginalMember(owner = "client!afa", name = "a", descriptor = "(ILr;IIII)V")
    public static final void method3002(int arg0, class562 arg1, int arg2, int arg3, int arg4, int arg5) {
        arg1.method1042(arg4, arg2, arg0 + arg4, arg2 + arg3);
        field7348++;
        arg1.method3118(true, arg3, arg4, arg2, arg0, -16777216);
        if (class630.field8726 < 100) {
            return;
        }
        float var6 = (float) class672.field9571 / (float) class672.field9586;
        int var7 = arg0;
        int var8 = arg3;
        if ((var6 < 1.0F)) {
            var8 = (int) ((float) arg0 * var6);
        } else {
            var7 = (int) ((float) arg3 / var6);
        }
        int var9 = (arg3 - var8) / 2 + arg2;
        int var10 = (arg0 - var7) / 2 + arg4;
        if (class428.field5766 == null || class428.field5766.method530() != arg0 || class428.field5766.method529() != arg3) {
            class672.method3837(class672.field9567, class672.field9587 + class672.field9571, class672.field9586 + class672.field9567, class672.field9587, var10, var9, var10 + var7, var8 + var9);
            class672.method3816(arg1);
            class428.field5766 = arg1.method1076(var10, var9, var7, var8, false);
        }
        class428.field5766.method2990(var10, var9);
        int var11 = class9.field87 * var7 / class672.field9586;
        int var12 = class410.field5394 * var8 / class672.field9571;
        int var13 = var10 + (class338.field4556 * var7 / class672.field9586);
        int var14 = var8 + var9 - var12 - class327.field4396 * var8 / class672.field9571;
        int var15 = -1996554240;
        if (class678.field9636 == class508.field7015) {
            var15 = -1996488705;
        }
        arg1.method1113(var13, var14, var11, var12, var15, 1);
        if (arg5 != 5) {
            method3003(true, 71, true, -99, -80, 27, 22);
        }
        arg1.method1121(var13, var14, var11, var12, var15, 0);
        if (class158.field2276 <= 0) {
            return;
        }
        int var16;
        if (class321.field4289 <= 50) {
            var16 = class321.field4289 * 5;
        } else {
            var16 = 500 - (class321.field4289 * 5);
        }
        for (class694 var17 = (class694) class672.field9563.method2506(arg5 ^ 0x41); var17 != null; var17 = (class694) class672.field9563.method2505(-118)) {
            class83 var18 = class672.field9554.method2158(var17.field9786, (byte) -117);
            if (class422.method2382(false, var18)) {
                if (class619.field8600 == var17.field9786) {
                    int var19 = var17.field9789 * var7 / class672.field9586 + var10;
                    int var20 = var9 + ((class672.field9571 - var17.field9784) * var8 / class672.field9571);
                    arg1.method3118(true, 4, var19 - 2, var20 + -2, 4, var16 << 24 | 0xFFFF00);
                } else if (class10.field102 != -1 && class10.field102 == var18.field991) {
                    int var21 = var17.field9789 * var7 / class672.field9586 + var10;
                    int var22 = (class672.field9571 - var17.field9784) * var8 / class672.field9571 + var9;
                    arg1.method3118(true, 4, var21 - 2, var22 - 2, 4, var16 << 24 | 0xFFFF00);
                }
            }
        }
    }

    @OriginalMember(owner = "client!afa", name = "a", descriptor = "(ZIZIIII)V")
    public static final void method3003(boolean arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg1 != 0) {
            return;
        }
        if (arg5 < arg6) {
            int var7 = (arg5 + arg6) / 2;
            int var8 = arg5;
            class277 var9 = class159.field2279[var7];
            class159.field2279[var7] = class159.field2279[arg6];
            class159.field2279[arg6] = var9;
            for (int var10 = arg5; var10 < arg6; var10++) {
                if (class190.method1253(class159.field2279[var10], arg2, arg0, arg4, (byte) 104, arg3, var9) <= 0) {
                    class277 var11 = class159.field2279[var10];
                    class159.field2279[var10] = class159.field2279[var8];
                    class159.field2279[var8++] = var11;
                }
            }
            class159.field2279[arg6] = class159.field2279[var8];
            class159.field2279[var8] = var9;
            method3003(arg0, 0, arg2, arg3, arg4, arg5, var8 - 1);
            method3003(arg0, 0, arg2, arg3, arg4, var8 + 1, arg6);
        }
        field7350++;
    }

    @OriginalMember(owner = "client!afa", name = "a", descriptor = "(ILjava/io/File;Ljava/lang/String;)V")
    public static final void method3004(int arg0, File arg1, String arg2) {
        class611.field8485.put(arg2, arg1);
        field7352++;
        if (arg0 != 4666) {
            field7349 = null;
        }
    }

    @OriginalMember(owner = "client!afa", name = "a", descriptor = "(I)V")
    public static void method3005(int arg0) {
        field7349 = null;
        int var1 = 118 % ((arg0 - 23) / 49);
        field7353 = null;
        field7351 = null;
    }

    @OriginalMember(owner = "client!afa", name = "a", descriptor = "(Lio;I)V")
    public static final void method3006(class157 arg0, int arg1) {
        field7347++;
        for (int var2 = arg1; var2 < class184.field2565; var2++) {
            int var3 = arg0.method964(62);
            int var4 = arg0.method963(-120);
            if (var4 == 65535) {
                var4 = -1;
            }
            if (class233.field3103[var3] != null) {
                class233.field3103[var3].field5262 = var4;
            }
        }
    }
}
