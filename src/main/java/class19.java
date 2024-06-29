import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!k")
public abstract class class19 {

    @OriginalMember(owner = "client!k", name = "f", descriptor = "[I")
    public static int[] field214 = new int[32];

    @OriginalMember(owner = "client!k", name = "h", descriptor = "I")
    public static int field216 = 0;

    @OriginalMember(owner = "client!k", name = "a", descriptor = "I")
    public static int field209;

    @OriginalMember(owner = "client!k", name = "b", descriptor = "I")
    public static int field210;

    @OriginalMember(owner = "client!k", name = "d", descriptor = "I")
    public static int field212;

    @OriginalMember(owner = "client!k", name = "g", descriptor = "I")
    public static int field215;

    @OriginalMember(owner = "client!k", name = "c", descriptor = "[I")
    public static int[] field211;

    @OriginalMember(owner = "client!k", name = "e", descriptor = "[Ljava/lang/String;")
    public static String[] field213;

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(IIIIII)V", line = 5)
    public static final void method105(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field215++;
        class27.field328 = arg1;
        class255.field4299 = arg4;
        class330.field5249 = arg0;
        class353.field5590 = arg3;
        if (arg2 != -129) {
            field216 = -57;
        }
        class234.field3883 = arg5;
        if (class353.field5590 >= 100) {
            int var6 = class234.field3883 * 128 + 64;
            int var7 = class27.field328 * 128 + 64;
            int var8 = class271.method2034(-1, var7, var6, class186.field2991) - class330.field5249;
            int var9 = var8 - class206.field3250;
            int var10 = var7 - class229.field3807;
            int var11 = var6 - class281.field4617;
            int var12 = (int) Math.sqrt((double) (var10 * var10 + var11 * var11));
            class194.field3095 = (int) (Math.atan2((double) var9, (double) var12) * 325.949D) & 0x7FF;
            class176.field2818 = (int) (-325.949D * Math.atan2((double) var11, (double) var10)) & 0x7FF;
            if (class194.field3095 < 128) {
                class194.field3095 = 128;
            }
            if (class194.field3095 > 383) {
                class194.field3095 = 383;
            }
        }
        class112.field1827 = 2;
    }

    @OriginalMember(owner = "client!k", name = "b", descriptor = "(I)V", line = 55)
    public static void method107(int arg0) {
        field211 = null;
        if (arg0 == 64) {
            field213 = null;
            field214 = null;
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(ILqm;Z)Ljava/lang/String;", line = 67)
    public static final String method108(int arg0, class227 arg1, boolean arg2) {
        field209++;
        try {
            int var3 = arg1.method1708((byte) 103);
            if (arg0 < var3) {
                var3 = arg0;
            }
            byte[] var4 = new byte[var3];
            if (!arg2) {
                field214 = (int[]) null;
            }
            arg1.field3760 += class55.field903.method606(var3, 0, arg1.field3793, var4, arg1.field3760, 0);
            return class166.method1289(0, var4, var3, -123);
        } catch (Exception var7) {
            return "Cabbage";
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(IIIZIIB)V", line = 102)
    public static final void method110(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, byte arg6) {
        if (arg6 != -63) {
            method110(-104, -25, 32, false, -115, -109, (byte) -16);
        }
        class49.field784 = arg5;
        class336.field5309 = arg1;
        class296.field4767 = arg0;
        class258.field4347 = arg4;
        field210++;
        class32.field457 = arg2;
        if (arg3 && class336.field5309 >= 100) {
            class281.field4617 = class32.field457 * 128 + 64;
            class229.field3807 = class296.field4767 * 128 + 64;
            class206.field3250 = class271.method2034(-1, class229.field3807, class281.field4617, class186.field2991) - class49.field784;
        }
        class112.field1827 = 2;
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(B)V", line = 140)
    public static final void method112(byte arg0) {
        field212++;
        if (arg0 > -37) {
            method110(-112, 22, 84, false, 49, -81, (byte) -37);
        }
        class227.field3781.method2327(1);
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(I)I")
    public abstract int method106(int arg0);

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public abstract void method109(int arg0, Component arg1);

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(Ljava/awt/Component;Z)V")
    public abstract void method111(Component arg0, boolean arg1);
}
