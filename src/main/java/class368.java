import java.awt.Canvas;
import java.awt.Color;
import java.lang.reflect.Constructor;
import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pa")
public class class368 {

    @OriginalMember(owner = "client!pa", name = "d", descriptor = "[I")
    public static int[] field5257 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

    @OriginalMember(owner = "client!pa", name = "c", descriptor = "[Ljava/awt/Color;")
    public static Color[] field5256 = new Color[] { new Color(16777215), new Color(16777215) };

    @OriginalMember(owner = "client!pa", name = "i", descriptor = "Lsd;")
    public static class74 field5262;

    @OriginalMember(owner = "client!pa", name = "m", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field5266;

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "I")
    public static int field5254;

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "I")
    public static int field5255;

    @OriginalMember(owner = "client!pa", name = "f", descriptor = "I")
    public static int field5259;

    @OriginalMember(owner = "client!pa", name = "g", descriptor = "I")
    public static int field5260;

    @OriginalMember(owner = "client!pa", name = "h", descriptor = "I")
    public static int field5261;

    @OriginalMember(owner = "client!pa", name = "k", descriptor = "I")
    public static int field5264;

    @OriginalMember(owner = "client!pa", name = "e", descriptor = "Lg;")
    public static class470 field5258;

    // $FF: synthetic field
    @OriginalMember(owner = "client!pa", name = "n", descriptor = "Ljava/lang/Class;")
    public static Class field5267;

    // $FF: synthetic field
    @OriginalMember(owner = "client!pa", name = "o", descriptor = "Ljava/lang/Class;")
    public static Class field5268;

    // $FF: synthetic field
    @OriginalMember(owner = "client!pa", name = "p", descriptor = "Ljava/lang/Class;")
    public static Class field5269;

    @OriginalMember(owner = "client!pa", name = "j", descriptor = "[I")
    public static int[] field5263;

    @OriginalMember(owner = "client!pa", name = "l", descriptor = "[S")
    public static short[] field5265;

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(IIIIII)Z")
    public static final boolean method2221(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 != arg2 || arg3 != arg4) {
            for (int var8 = arg1; var8 <= arg2; var8++) {
                for (int var14 = arg3; var14 <= arg4; var14++) {
                    if (class348.field4960[arg0][var8][var14] == -class76.field920) {
                        return false;
                    }
                }
            }
            int var9 = (arg1 << class482.field6812) + 1;
            int var10 = (arg3 << class482.field6812) + 2;
            int var11 = class398.field5667[arg0].method1861(arg1, arg3) + arg5;
            if (!class287.method1818(var9, var11, var10)) {
                return false;
            }
            int var12 = (arg2 << class482.field6812) - 1;
            if (!class287.method1818(var12, var11, var10)) {
                return false;
            }
            int var13 = (arg4 << class482.field6812) - 1;
            if (!class287.method1818(var9, var11, var13)) {
                return false;
            } else if (class287.method1818(var12, var11, var13)) {
                return true;
            } else {
                return false;
            }
        } else if (class328.method1989(arg0, arg1, arg3)) {
            int var6 = arg1 << class482.field6812;
            int var7 = arg3 << class482.field6812;
            return class287.method1818(var6 + 1, class398.field5667[arg0].method1861(arg1, arg3) + arg5, var7 + 1) && class287.method1818(class200.field2777 + var6 - 1, class398.field5667[arg0].method1861(arg1 + 1, arg3) + arg5, var7 + 1) && class287.method1818(class200.field2777 + var6 - 1, class398.field5667[arg0].method1861(arg1 + 1, arg3 + 1) + arg5, class200.field2777 + var7 - 1) && class287.method1818(var6 + 1, class398.field5667[arg0].method1861(arg1, arg3 + 1) + arg5, class200.field2777 + var7 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(ILab;Z)Ljava/lang/String;")
    public static final String method2222(int arg0, class256 arg1, boolean arg2) {
        field5255++;
        if (!arg2) {
            method2224((class256) null, (byte) -97);
        }
        if (!client.method1660(arg1).method1764(arg0, (byte) 125) && arg1.field3631 == null) {
            return null;
        } else if (arg1.field3565 == null || arg1.field3565.length <= arg0 || arg1.field3565[arg0] == null || arg1.field3565[arg0].trim().length() == 0) {
            return class192.field2640 ? "Hidden-" + arg0 : null;
        } else {
            return arg1.field3565[arg0];
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(ILkd;ILjava/awt/Canvas;Leg;I)Loj;")
    public static final class280 method2223(int arg0, class355 arg1, int arg2, Canvas arg3, class394 arg4, int arg5) {
        field5259++;
        if (arg5 != -367829630) {
            field5263 = null;
        }
        try {
            Class var6 = Class.forName("ic");
            Constructor var7 = var6.getConstructor(field5267 == null ? (field5267 = method2227("java.awt.Canvas")) : field5267, field5268 == null ? (field5268 = method2227("eg")) : field5268, Integer.TYPE, Integer.TYPE, field5269 == null ? (field5269 = method2227("kd")) : field5269);
            return (class280) var7.newInstance(arg3, arg4, Integer.valueOf(arg2), new Integer(arg0), arg1);
        } catch (Exception var8) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(Lab;B)Ljava/lang/String;")
    public static final String method2224(class256 arg0, byte arg1) {
        field5261++;
        int var2 = 97 / ((65 - arg1) / 38);
        if (client.method1660(arg0).method1768(-30065) == 0) {
            return null;
        } else if (arg0.field3593 == null || arg0.field3593.trim().length() == 0) {
            return class192.field2640 ? "Hidden-use" : null;
        } else {
            return arg0.field3593;
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(ILkd;)[Lep;")
    public static final class159[] method2225(int arg0, class355 arg1) {
        field5260++;
        if (!arg1.method2159((byte) 102)) {
            return new class159[0];
        }
        class405 var2 = arg1.method2167(0);
        while (var2.field5759 == 0) {
            class85.method433(10L, -88);
        }
        if (var2.field5759 == 2) {
            return new class159[0];
        }
        int[] var3 = (int[]) var2.field5755;
        class159[] var4 = new class159[var3.length >> 2];
        for (int var5 = 0; var5 < var4.length; var5++) {
            class159 var7 = new class159();
            var4[var5] = var7;
            var7.field1902 = var3[var5 << 2];
            var7.field1905 = var3[(var5 << 2) + 1];
            var7.field1900 = var3[(var5 << 2) + 2];
            var7.field1894 = var3[(var5 << 2) + 3];
        }
        int var6 = -97 % ((10 - arg0) / 42);
        return var4;
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(I)V")
    public static void method2226(int arg0) {
        field5256 = null;
        field5266 = null;
        if (arg0 != -448482718) {
            field5262 = null;
        }
        field5257 = null;
        field5265 = null;
        field5262 = null;
        field5263 = null;
        field5258 = null;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method2227(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    static {
        new class40("That user is not in this channel.", "Dieser Benutzer befindet sich nicht in diesem Chatraum.", "Cet utilisateur n'est pas dans ce canal.", "Esse usuário não está no canal.");
        field5262 = new class74(16, -1);
        field5266 = new CRC32();
    }
}
