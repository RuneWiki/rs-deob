import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public abstract class class58 {

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "I")
    public static int field1156 = 0;

    @OriginalMember(owner = "client!fb", name = "c", descriptor = "I")
    public static int field1157 = 128;

    @OriginalMember(owner = "client!fb", name = "g", descriptor = "Loc;")
    private static class151 field1161 = class137.method873(2, "Free world");

    @OriginalMember(owner = "client!fb", name = "k", descriptor = "I")
    public static int field1165 = -1;

    @OriginalMember(owner = "client!fb", name = "f", descriptor = "Loc;")
    public static class151 field1160 = field1161;

    @OriginalMember(owner = "client!fb", name = "l", descriptor = "Loc;")
    public static class151 field1166 = class137.method873(2, "Zu viele Anmelde)2Versuche von Ihrer Adresse");

    @OriginalMember(owner = "client!fb", name = "i", descriptor = "Loc;")
    public static class151 field1163 = class137.method873(2, ")3");

    @OriginalMember(owner = "client!fb", name = "m", descriptor = "Loc;")
    private static class151 field1167 = class137.method873(2, "Please check your message)2centre for details)3");

    @OriginalMember(owner = "client!fb", name = "e", descriptor = "Loc;")
    public static class151 field1159 = field1167;

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "I")
    public static int field1155;

    @OriginalMember(owner = "client!fb", name = "d", descriptor = "I")
    public static int field1158;

    @OriginalMember(owner = "client!fb", name = "h", descriptor = "I")
    public static int field1162;

    @OriginalMember(owner = "client!fb", name = "j", descriptor = "Lnd;")
    public static class142 field1164;

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public abstract void method386(int arg0, Component arg1);

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(I)V")
    public static void method387(int arg0) {
        field1164 = null;
        field1160 = null;
        field1159 = null;
        field1166 = null;
        field1161 = null;
        if (arg0 == -599906324) {
            field1167 = null;
            field1163 = null;
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(Ljava/awt/Component;B)V")
    public abstract void method388(Component arg0, byte arg1);

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "(I)I")
    public abstract int method389(int arg0);

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(IIIIII)V")
    public static final void method390(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field1158++;
        int var6 = arg4 - arg5;
        int var7 = arg2 - arg3;
        if (arg1 != -204342964) {
            return;
        }
        if (var7 == 0) {
            if (var6 != 0) {
                class91.method579(arg5, arg4, arg0, (byte) -14, arg3);
            }
        } else if (var6 == 0) {
            class104.method632(arg3, arg0, arg5, 105, arg2);
        } else {
            int var8 = (var6 << 12) / var7;
            int var9 = arg5 - (arg3 * var8 >> 12);
            int var10;
            int var11;
            if (class79.field1526 > arg3) {
                var10 = var9 + (class79.field1526 * var8 >> 12);
                var11 = class79.field1526;
            } else if (class25.field524 < arg3) {
                var11 = class25.field524;
                var10 = var9 + (class25.field524 * var8 >> 12);
            } else {
                var11 = arg3;
                var10 = arg5;
            }
            if (class233.field4281 > var10) {
                var10 = class233.field4281;
                var11 = (class233.field4281 - var9 << 12) / var8;
            } else if (var10 > class154.field2793) {
                var11 = (class154.field2793 - var9 << 12) / var8;
                var10 = class154.field2793;
            }
            int var12;
            int var13;
            if (arg2 < class79.field1526) {
                var12 = (class79.field1526 * var8 >> 12) + var9;
                var13 = class79.field1526;
            } else if (class25.field524 < arg2) {
                var12 = (class25.field524 * var8 >> 12) + var9;
                var13 = class25.field524;
            } else {
                var13 = arg2;
                var12 = arg4;
            }
            if (var12 < class233.field4281) {
                var12 = class233.field4281;
                var13 = (class233.field4281 - var9 << 12) / var8;
            } else if (class154.field2793 < var12) {
                var13 = (class154.field2793 - var9 << 12) / var8;
                var12 = class154.field2793;
            }
            class113.method685(var11, arg0, var10, var12, var13, 11874);
        }
    }
}
