import java.lang.reflect.Field;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sha")
public class class117 {

    @OriginalMember(owner = "client!sha", name = "a", descriptor = "Low;")
    public static class665 field1994 = new class665();

    @OriginalMember(owner = "client!sha", name = "b", descriptor = "I")
    public static int field1995;

    @OriginalMember(owner = "client!sha", name = "c", descriptor = "I")
    public static int field1996;

    @OriginalMember(owner = "client!sha", name = "d", descriptor = "I")
    public static int field1997;

    // $FF: synthetic field
    @OriginalMember(owner = "client!sha", name = "e", descriptor = "Ljava/lang/Class;")
    public static Class field1998;

    // $FF: synthetic field
    @OriginalMember(owner = "client!sha", name = "f", descriptor = "Ljava/lang/Class;")
    public static Class field1999;

    // $FF: synthetic method
    @OriginalMember(owner = "client!sha", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method1034(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!sha", name = "a", descriptor = "(IB)Z", line = 3)
    public static final boolean method1030(int arg0, byte arg1) {
        field1996++;
        int var2 = -43 % ((arg1 + 58) / 37);
        return arg0 == 2 || arg0 == 3;
    }

    @OriginalMember(owner = "client!sha", name = "a", descriptor = "(Z)V", line = 14)
    public static void method1031(boolean arg0) {
        if (!arg0) {
            field1994 = null;
        }
    }

    @OriginalMember(owner = "client!sha", name = "a", descriptor = "(I)I", line = 25)
    public static final int method1032(int arg0) {
        field1995++;
        if (arg0 != -14554) {
            field1994 = null;
        }
        int var1 = 0;
        Field[] var2 = (field1998 == null ? (field1998 = method1034("w")) : field1998).getDeclaredFields();
        Field[] var3 = var2;
        for (int var4 = 0; var4 < var3.length; var4++) {
            Field var5 = var3[var4];
            if ((field1999 == null ? (field1999 = method1034("wc")) : field1999).isAssignableFrom(var5.getType())) {
                var1++;
            }
        }
        return var1 + 1;
    }

    @OriginalMember(owner = "client!sha", name = "a", descriptor = "(II)[B", line = 68)
    public static final byte[] method1033(int arg0, int arg1) {
        if (arg1 != -3979) {
            return null;
        }
        field1997++;
        class255 var2 = (class255) class27.field290.method245(4768, (long) arg0);
        if (var2 == null) {
            byte[] var3 = new byte[512];
            Random var4 = new Random((long) arg0);
            for (int var5 = 0; var5 < 255; var5++) {
                var3[var5] = (byte) var5;
            }
            for (int var6 = 0; var6 < 255; var6++) {
                int var7 = 255 - var6;
                int var8 = class728.method4047(arg1 + 4105, var7, var4);
                byte var9 = var3[var8];
                var3[var8] = var3[var7];
                var3[var7] = var3[511 - var6] = var9;
            }
            var2 = new class255(var3);
            class27.field290.method243((byte) -4, var2, (long) arg0);
        }
        return var2.field3650;
    }
}
