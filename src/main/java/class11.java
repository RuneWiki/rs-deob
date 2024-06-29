import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!n")
public abstract class class11 {

    @OriginalMember(owner = "client!n", name = "b", descriptor = "I")
    public static int field118 = -1;

    @OriginalMember(owner = "client!n", name = "e", descriptor = "Lwg;")
    public static class198 field121 = new class198();

    @OriginalMember(owner = "client!n", name = "g", descriptor = "I")
    public static volatile int field123 = 0;

    @OriginalMember(owner = "client!n", name = "a", descriptor = "I")
    public static int field117;

    @OriginalMember(owner = "client!n", name = "c", descriptor = "I")
    public static int field119;

    @OriginalMember(owner = "client!n", name = "d", descriptor = "I")
    public static int field120;

    @OriginalMember(owner = "client!n", name = "f", descriptor = "I")
    public static int field122;

    @OriginalMember(owner = "client!n", name = "h", descriptor = "I")
    public static int field124;

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(I[B)[B", line = 12)
    public static final byte[] method69(int arg0, byte[] arg1) {
        class313 var2 = new class313(arg1);
        field119++;
        int var3 = var2.method2224(-126);
        if (arg0 != 0) {
            method71((byte[]) null, -61);
        }
        int var4 = var2.method2231((byte) -125);
        if (var4 < 0 || !(class270.field4458 == 0 || class270.field4458 >= var4)) {
            throw new RuntimeException();
        } else if (var3 == 0) {
            byte[] var5 = new byte[var4];
            var2.method2237(var5, 2, 0, var4);
            return var5;
        } else {
            int var6 = var2.method2231((byte) -124);
            if (var6 < 0 || !(class270.field4458 == 0 || class270.field4458 >= var6)) {
                throw new RuntimeException();
            }
            byte[] var7 = new byte[var6];
            if (var3 == 1) {
                class288.method2044(var7, var6, arg1, var4, 9);
            } else {
                class94.field1375.method423(23522, var2, var7);
            }
            return var7;
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(IIIIIII)V", line = 63)
    public static final void method70(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field122++;
        if (arg1 != 23443) {
            return;
        }
        class264 var7 = class113.method741(arg6, (byte) 124, arg4);
        if (var7 != null && var7.field4243 != null) {
            class190 var8 = new class190();
            var8.field2937 = var7;
            var8.field2940 = var7.field4243;
            class201.method1372(var8, 200000);
        }
        class29.field447 = arg0;
        class83.field1199 = arg2;
        class345.field5530 = arg6;
        class313.field5108 = arg4;
        class107.field1532 = true;
        class41.field628 = arg3;
        class339.field5457 = arg5;
        class218.method1472((byte) 127, var7);
    }

    @OriginalMember(owner = "client!n", name = "b", descriptor = "([BI)Luj;", line = 96)
    public static final class175 method71(byte[] arg0, int arg1) {
        field124++;
        if (arg0 == null) {
            return null;
        }
        if (arg1 > -56) {
            field123 = 11;
        }
        class175 var2;
        if (class245.field3886) {
            var2 = new class57(arg0, class18.field228, class28.field419, class322.field5289, class94.field1379, class105.field1522);
        } else {
            var2 = new class82(arg0, class18.field228, class28.field419, class322.field5289, class94.field1379, class105.field1522);
        }
        class167.method1164(false);
        return var2;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(IIIII)V", line = 122)
    public static final void method72(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if ((arg3 - arg4) >= class341.field5494 && class196.field3001 >= (arg3 + arg4) && (arg2 - arg4) >= class33.field505 && class278.field4586 >= (arg2 + arg4)) {
            class179.method1253(arg0, arg1 - 267485868, arg3, arg2, arg4);
        } else {
            class207.method1410(arg0, arg3, (byte) 51, arg4, arg2);
        }
        if (arg1 != -10259) {
            field123 = -71;
        }
        field120++;
    }

    @OriginalMember(owner = "client!n", name = "b", descriptor = "(I)V", line = 144)
    public static void method73(int arg0) {
        if (arg0 < 126) {
            field123 = 86;
        }
        field121 = null;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "([BI)V")
    public abstract void method67(byte[] arg0, int arg1);

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(I)[B")
    public abstract byte[] method68(int arg0);
}
