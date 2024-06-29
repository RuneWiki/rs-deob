import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qh")
public abstract class class134 {

    @OriginalMember(owner = "client!qh", name = "f", descriptor = "I")
    public static int field2220 = 0;

    @OriginalMember(owner = "client!qh", name = "g", descriptor = "I")
    public static int field2221 = 0;

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "I")
    public static int field2215;

    @OriginalMember(owner = "client!qh", name = "b", descriptor = "I")
    public static int field2216;

    @OriginalMember(owner = "client!qh", name = "c", descriptor = "I")
    public static int field2217;

    @OriginalMember(owner = "client!qh", name = "d", descriptor = "I")
    public static int field2218;

    @OriginalMember(owner = "client!qh", name = "e", descriptor = "I")
    public static int field2219;

    @OriginalMember(owner = "client!qh", name = "h", descriptor = "Lsb;")
    public static class124 field2222;

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(I)Lwf;")
    public static final class17 method955(int arg0) {
        field2217++;
        int var1 = class4.field56[0] * class19.field268[0];
        byte[] var2 = class66.field1082[0];
        class17 var5;
        if (class111.field1711[arg0]) {
            byte[] var6 = class92.field1452[0];
            int[] var7 = new int[var1];
            for (int var8 = 0; var8 < var1; var8++) {
                var7[var8] = class140.method1045(class64.method498(-16777216, var6[var8] << 24), class244.field3857[class64.method498(var2[var8], 255)]);
            }
            var5 = new class202(class287.field4592, class20.field315, class193.field3155[0], class197.field3224[0], class4.field56[0], class19.field268[0], var7);
        } else {
            int[] var3 = new int[var1];
            for (int var4 = 0; var4 < var1; var4++) {
                var3[var4] = class244.field3857[class64.method498(255, var2[var4])];
            }
            var5 = new class17(class287.field4592, class20.field315, class193.field3155[0], class197.field3224[0], class4.field56[0], class19.field268[0], var3);
        }
        class213.method1410(0);
        return var5;
    }

    @OriginalMember(owner = "client!qh", name = "b", descriptor = "(I)I")
    public abstract int method956(int arg0);

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(BLjava/awt/Component;)V")
    public abstract void method957(byte arg0, Component arg1);

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(B)V")
    public static final void method958(byte arg0) {
        class110 var1 = (class110) class189.field3082.method1807(-126);
        field2216++;
        int var2 = 125 % ((-arg0 - 51) / 45);
        while (var1 != null) {
            if (var1.field1698 == -1) {
                var1.field1706 = 0;
                class279.method1876(var1, true);
            } else {
                var1.method1074((byte) -24);
            }
            var1 = (class110) class189.field3082.method1808((byte) 114);
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public abstract void method959(int arg0, Component arg1);

    @OriginalMember(owner = "client!qh", name = "c", descriptor = "(I)V")
    public static void method960(int arg0) {
        if (arg0 != 0) {
            method958((byte) -15);
        }
        field2222 = null;
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(IIIIB)V")
    public static final void method961(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        field2219++;
        class132 var5 = (class132) class139.field2329.method1807(-115);
        if (arg4 != -25) {
            field2222 = null;
        }
        while (var5 != null) {
            class72.method558(var5, arg0, arg2, 104, arg1, arg3);
            var5 = (class132) class139.field2329.method1808((byte) 127);
        }
        for (class132 var6 = (class132) class238.field3755.method1807(arg4 - 76); var6 != null; var6 = (class132) class238.field3755.method1808((byte) 52)) {
            class38 var11 = var6.field2208.method1224(arg4 + 24);
            byte var12 = 1;
            if (var6.field2208.field2901 == var11.field651) {
                var12 = 0;
            } else if (var6.field2208.field2901 == var11.field665 || var6.field2208.field2901 == var11.field672 || var6.field2208.field2901 == var11.field670 || var6.field2208.field2901 == var11.field658) {
                var12 = 2;
            } else if (var6.field2208.field2901 == var11.field638 || var6.field2208.field2901 == var11.field660 || var6.field2208.field2901 == var11.field668 || var6.field2208.field2901 == var11.field635) {
                var12 = 3;
            }
            if (var6.field2202 != var12) {
                int var13 = class71.method551(var6.field2208, (byte) 126);
                if (var6.field2210 != var13) {
                    if (var6.field2205 != null) {
                        class145.field2394.method1242(var6.field2205);
                        var6.field2205 = null;
                    }
                    var6.field2210 = var13;
                }
                var6.field2202 = var12;
            }
            var6.field2197 = var6.field2208.field2849;
            var6.field2212 = var6.field2208.field2849 + (var6.field2208.method1226((byte) -107) * 64);
            var6.field2204 = var6.field2208.field2887;
            var6.field2213 = var6.field2208.field2887 + var6.field2208.method1226((byte) -86) * 64;
            class72.method558(var6, arg0, arg2, 104, arg1, arg3);
        }
        for (class132 var7 = (class132) class269.field4315.method1062(118); var7 != null; var7 = (class132) class269.field4315.method1059(-14608)) {
            byte var8 = 1;
            class38 var9 = var7.field2194.method1224(-1);
            if (var7.field2194.field2901 == var9.field651) {
                var8 = 0;
            } else if (var7.field2194.field2901 == var9.field665 || var7.field2194.field2901 == var9.field672 || var7.field2194.field2901 == var9.field670 || var7.field2194.field2901 == var9.field658) {
                var8 = 2;
            } else if (var7.field2194.field2901 == var9.field638 || var7.field2194.field2901 == var9.field660 || var7.field2194.field2901 == var9.field668 || var7.field2194.field2901 == var9.field635) {
                var8 = 3;
            }
            if (var7.field2202 != var8) {
                int var10 = class254.method1702(arg4 ^ 0xFFFFFFE0, var7.field2194);
                if (var7.field2210 != var10) {
                    if (var7.field2205 != null) {
                        class145.field2394.method1242(var7.field2205);
                        var7.field2205 = null;
                    }
                    var7.field2210 = var10;
                }
                var7.field2202 = var8;
            }
            var7.field2197 = var7.field2194.field2849;
            var7.field2212 = var7.field2194.field2849 + var7.field2194.method1226((byte) -124) * 64;
            var7.field2204 = var7.field2194.field2887;
            var7.field2213 = var7.field2194.field2887 + var7.field2194.method1226((byte) -126) * 64;
            class72.method558(var7, arg0, arg2, 96, arg1, arg3);
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;)Z")
    public static final boolean method962(int arg0, String arg1, String arg2) {
        field2215++;
        int var3 = arg1.length();
        int var4 = arg2.length();
        if (var4 > var3) {
            return false;
        }
        if (arg0 > -78) {
            method961(-112, -30, -96, 12, (byte) -92);
        }
        for (int var5 = 0; var5 < var4; var5++) {
            char var6 = arg1.charAt(var5);
            char var7 = arg2.charAt(var5);
            if (var6 != var7 && Character.toLowerCase(var6) != Character.toLowerCase(var7) && Character.toUpperCase(var6) != Character.toUpperCase(var7)) {
                return false;
            }
        }
        return true;
    }
}
