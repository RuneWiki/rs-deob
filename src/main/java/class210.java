import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tg")
public abstract class class210 extends class164 {

    @OriginalMember(owner = "client!tg", name = "z", descriptor = "Z")
    public volatile boolean field2557 = true;

    @OriginalMember(owner = "client!tg", name = "t", descriptor = "I")
    public static int field2551;

    @OriginalMember(owner = "client!tg", name = "u", descriptor = "I")
    public static int field2552;

    @OriginalMember(owner = "client!tg", name = "v", descriptor = "I")
    public static int field2553;

    @OriginalMember(owner = "client!tg", name = "y", descriptor = "I")
    public static int field2556;

    @OriginalMember(owner = "client!tg", name = "w", descriptor = "Z")
    public boolean field2554;

    @OriginalMember(owner = "client!tg", name = "x", descriptor = "Z")
    public boolean field2555;

    @OriginalMember(owner = "client!tg", name = "e", descriptor = "(I)I")
    public abstract int method921(int arg0);

    @OriginalMember(owner = "client!tg", name = "f", descriptor = "(I)[B")
    public abstract byte[] method917(int arg0);

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(IIIBI)V")
    public static final void method1254(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        for (int var5 = 0; var5 < class643.field9183; var5++) {
            Rectangle var6 = class631.field9063[var5];
            if (var6.x + var6.width > arg2 && var6.x < (arg2 + arg4) && arg0 < var6.y + var6.height && (arg0 + arg1) > var6.y) {
                class325.field4339[var5] = true;
            }
        }
        field2553++;
        if (arg3 != -41) {
            method1254(-86, -94, 19, (byte) 59, -50);
        }
    }

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "(III)Z")
    public static final boolean method1255(int arg0, int arg1, int arg2) {
        if (arg0 == -20762) {
            field2551++;
            return class314.method1837(true, arg2, arg1) | (arg2 & 0x60000) != 0 || class87.method696(arg2, arg1, 1282244876);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(IIZIZI)V")
    public static final void method1256(int arg0, int arg1, boolean arg2, int arg3, boolean arg4, int arg5) {
        if (arg3 < 1) {
            arg3 = 1;
        }
        if (arg0 < 1) {
            arg0 = 1;
        }
        field2552++;
        int var6 = arg3 - 334;
        if (var6 < 0) {
            var6 = 0;
        } else if (var6 > 100) {
            var6 = 100;
        }
        int var7 = (class489.field6841 - class697.field9871) * var6 / 100 + class697.field9871;
        if (class75.field1113 > var7) {
            var7 = class75.field1113;
        } else if (class611.field8755 < var7) {
            var7 = class611.field8755;
        }
        int var8 = arg3 * var7 * 512 / (arg0 * 334);
        if (class502.field7012 > var8) {
            short var12 = class502.field7012;
            var7 = var12 * 334 * arg0 / (arg3 * 512);
            if (class611.field8755 < var7) {
                var7 = class611.field8755;
                int var13 = var7 * 512 * arg3 / (var12 * 334);
                int var14 = (arg0 - var13) / 2;
                if (arg2) {
                    class68.field1045.method249();
                    class68.field1045.method1042(arg5, var14, 1, arg1, -16777216, arg3);
                    class68.field1045.method1042(arg0 + arg5 - var14, var14, 1, arg1, -16777216, arg3);
                }
                arg5 += var14;
                arg0 -= var14 * 2;
            }
        } else if (class230.field2997 < var8) {
            short var9 = class230.field2997;
            var7 = arg0 * var9 * 334 / (arg3 * 512);
            if (var7 < class75.field1113) {
                var7 = class75.field1113;
                int var10 = arg0 * var9 * 334 / (var7 * 512);
                int var11 = (arg3 - var10) / 2;
                if (arg2) {
                    class68.field1045.method249();
                    class68.field1045.method1042(arg5, arg0, 1, arg1, -16777216, var11);
                    class68.field1045.method1042(arg5, arg0, 1, arg1 + arg3 - var11, -16777216, var11);
                }
                arg1 += var11;
                arg3 -= var11 * 2;
            }
        }
        if (!arg4) {
            method1254(40, -34, -39, (byte) -70, 54);
        }
        class522.field7665 = arg3 * var7 / 334;
        class158.field1925 = arg5;
        class502.field7011 = (short) arg0;
        class112.field1435 = (short) arg3;
        class685.field9783 = arg1;
    }
}
