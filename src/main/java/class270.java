import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ba")
public abstract class class270 {

    @OriginalMember(owner = "client!ba", name = "c", descriptor = "I")
    public static int field3661;

    @OriginalMember(owner = "client!ba", name = "e", descriptor = "Ljava/lang/String;")
    public static String field3663;

    @OriginalMember(owner = "client!ba", name = "f", descriptor = "[I")
    public static int[] field3664;

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "I")
    public static int field3659;

    @OriginalMember(owner = "client!ba", name = "g", descriptor = "I")
    public static int field3665;

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "Lam;")
    public static class286 field3660;

    @OriginalMember(owner = "client!ba", name = "d", descriptor = "[Llg;")
    public static class20[] field3662;

    static {
        new class47(64);
        field3661 = 0;
        field3663 = "Checking for updates - ";
        field3664 = new int[1000];
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(IIIILlh;B)Ljava/awt/Frame;", line = 8)
    public static final Frame method1498(int arg0, int arg1, int arg2, int arg3, class450 arg4, byte arg5) {
        field3659++;
        if (arg5 != -38) {
            return null;
        } else if (arg4.method2796(false)) {
            if (arg1 == 0) {
                class108[] var6 = class229.method1248((byte) 126, arg4);
                if (var6 == null) {
                    return null;
                }
                boolean var7 = false;
                for (int var8 = 0; var8 < var6.length; var8++) {
                    if (var6[var8].field1320 == arg3 && var6[var8].field1326 == arg0 && (arg2 == 0 || var6[var8].field1323 == arg2) && (!var7 || var6[var8].field1327 > arg1)) {
                        arg1 = var6[var8].field1327;
                        var7 = true;
                    }
                }
                if (!var7) {
                    return null;
                }
            }
            class304 var9 = arg4.method2786(1414295824, arg2, arg3, arg1, arg0);
            while (var9.field4123 == 0) {
                class370.method2235(10L, 10);
            }
            Frame var10 = (Frame) var9.field4126;
            if (var10 == null) {
                return null;
            } else if (var9.field4123 == 2) {
                class279.method1544(var10, arg4, (byte) 115);
                return null;
            } else {
                return var10;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(IIIB)I", line = 90)
    public static final int method1499(int arg0, int arg1, int arg2, byte arg3) {
        int var4 = 80 % ((arg3 - 38) / 45);
        field3665++;
        int var5 = arg0 & 0x3;
        if (var5 == 0) {
            return arg1;
        } else if (var5 == 1) {
            return arg2;
        } else if (var5 == 2) {
            return 7 - arg1;
        } else {
            return 7 - arg2;
        }
    }

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "(B)V", line = 129)
    public static void method1500(byte arg0) {
        if (arg0 >= 58) {
            field3660 = null;
            field3663 = null;
            field3662 = null;
            field3664 = null;
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(B)Lqh;")
    public abstract class327 method173(byte arg0);

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(II)I")
    public abstract int method164(int arg0, int arg1);

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(IB)V")
    public abstract void method175(int arg0, byte arg1);

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(BI)[B")
    public abstract byte[] method170(byte arg0, int arg1);
}
