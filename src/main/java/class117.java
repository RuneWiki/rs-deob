import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oda")
public class class117 extends class203 {

    @OriginalMember(owner = "client!oda", name = "l", descriptor = "[Lofa;")
    public class328[] field1850;

    @OriginalMember(owner = "client!oda", name = "j", descriptor = "Z")
    public static boolean field1848 = false;

    @OriginalMember(owner = "client!oda", name = "n", descriptor = "[F")
    public static float[] field1852 = new float[4];

    @OriginalMember(owner = "client!oda", name = "h", descriptor = "I")
    public static int field1846;

    @OriginalMember(owner = "client!oda", name = "i", descriptor = "I")
    public static int field1847;

    @OriginalMember(owner = "client!oda", name = "m", descriptor = "I")
    public static int field1851;

    @OriginalMember(owner = "client!oda", name = "o", descriptor = "I")
    public static int field1853;

    @OriginalMember(owner = "client!oda", name = "k", descriptor = "[[Ldm;")
    public static class50[][] field1849;

    @OriginalMember(owner = "client!oda", name = "a", descriptor = "(Ljava/lang/String;IZ)V")
    public static final void method948(String arg0, int arg1, boolean arg2) {
        field1853++;
        if (arg0 == null) {
            return;
        }
        if (class222.field3169 >= 100) {
            class570.method3327((byte) 74, 4, class281.field3980.method1839((byte) 45, class744.field10426));
            return;
        }
        String var3 = class726.method4041(-1, arg0);
        if (var3 == null) {
            return;
        }
        for (int var4 = 0; var4 < class222.field3169; var4++) {
            String var9 = class726.method4041(-1, class162.field2404[var4]);
            if (var9 != null && var9.equals(var3)) {
                class570.method3327((byte) 83, 4, arg0 + class281.field3981.method1839((byte) 45, class744.field10426));
                return;
            }
            if (class628.field9029[var4] != null) {
                String var10 = class726.method4041(-1, class628.field9029[var4]);
                if (var10 != null && var10.equals(var3)) {
                    class570.method3327((byte) 75, 4, arg0 + class281.field3981.method1839((byte) 45, class744.field10426));
                    return;
                }
            }
        }
        for (int var5 = 0; var5 < class425.field5945; var5++) {
            String var7 = class726.method4041(-1, class583.field8236[var5]);
            if (var7 != null && var7.equals(var3)) {
                class570.method3327((byte) 44, 4, class281.field3986.method1839((byte) 45, class744.field10426) + arg0 + class281.field3987.method1839((byte) 45, class744.field10426));
                return;
            }
            if (class111.field1800[var5] != null) {
                String var8 = class726.method4041(arg1 - 3170, class111.field1800[var5]);
                if (var8 != null && var8.equals(var3)) {
                    class570.method3327((byte) 65, 4, class281.field3986.method1839((byte) 45, class744.field10426) + arg0 + class281.field3987.method1839((byte) 45, class744.field10426));
                    return;
                }
            }
        }
        if (class726.method4041(arg1 - 3170, class468.field6748.field4939).equals(var3)) {
            class570.method3327((byte) 89, 4, class281.field3983.method1839((byte) 45, class744.field10426));
            return;
        }
        class15.field201++;
        class135 var6 = class273.method1801(class459.field6629, class512.field7311, arg1 ^ 0xC63);
        var6.field2109.method263((byte) -126, class552.method3233((byte) 87, arg0) + 1);
        if (arg1 == 3169) {
            var6.field2109.method287((byte) 0, arg0);
            var6.field2109.method263((byte) 125, arg2 ? 1 : 0);
            class539.method3178(var6, -18925);
        }
    }

    @OriginalMember(owner = "client!oda", name = "a", descriptor = "(Ljava/lang/String;II[B)I")
    public static final int method949(String arg0, int arg1, int arg2, byte[] arg3) {
        field1847++;
        int var4 = arg1;
        int var5 = arg0.length();
        if (arg2 != 1) {
            method950(-36, -25, false);
        }
        for (int var6 = 0; var6 < var5; var6 += 4) {
            int var7 = class695.method3902(1237726796, arg0.charAt(var6));
            int var8 = var5 <= (var6 + 1) ? -1 : class695.method3902(arg2 + 1237726795, arg0.charAt(var6 + 1));
            int var9 = var5 > var6 + 2 ? class695.method3902(1237726796, arg0.charAt(var6 + 2)) : -1;
            int var10 = var5 <= var6 + 3 ? -1 : class695.method3902(1237726796, arg0.charAt(var6 + 3));
            arg3[arg1++] = (byte) class164.method1221(var7 << 2, var8 >>> 4);
            if (var9 == -1) {
                break;
            }
            arg3[arg1++] = (byte) class164.method1221(class555.method3246(240, var8 << 4), var9 >>> 2);
            if (var10 == -1) {
                break;
            }
            arg3[arg1++] = (byte) class164.method1221(var10, class555.method3246(192, var9 << 6));
        }
        return arg1 - var4;
    }

    @OriginalMember(owner = "client!oda", name = "<init>", descriptor = "([Lofa;)V")
    public class117(class328[] arg0) {
        this.field1850 = arg0;
    }

    @OriginalMember(owner = "client!oda", name = "a", descriptor = "(IIZ)V")
    public static final void method950(int arg0, int arg1, boolean arg2) {
        field1851++;
        class354 var3 = class501.method3012(arg1, 12, 2145997216);
        if (arg2) {
            var3.method2222(-55);
            var3.field4990 = arg0;
        }
    }

    @OriginalMember(owner = "client!oda", name = "b", descriptor = "(I)V")
    public static void method951(int arg0) {
        field1849 = null;
        field1852 = null;
        int var1 = -61 % ((arg0 - 37) / 46);
    }
}
