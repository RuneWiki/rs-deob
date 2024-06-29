import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kea")
public class class236 {

    @OriginalMember(owner = "client!kea", name = "a", descriptor = "[Liaa;")
    public static class494[] field3169 = new class494[14];

    @OriginalMember(owner = "client!kea", name = "b", descriptor = "I")
    public static int field3170;

    @OriginalMember(owner = "client!kea", name = "e", descriptor = "I")
    public static int field3173;

    @OriginalMember(owner = "client!kea", name = "d", descriptor = "Lfp;")
    public static class323 field3172;

    @OriginalMember(owner = "client!kea", name = "c", descriptor = "Z")
    public static boolean field3171;

    @OriginalMember(owner = "client!kea", name = "a", descriptor = "(Ljava/lang/String;BLjava/lang/String;C)Ljava/lang/String;", line = 3)
    public static final String method1515(String arg0, byte arg1, String arg2, char arg3) {
        field3173++;
        int var4 = arg2.length();
        int var5 = arg0.length();
        int var6 = var4;
        if (arg1 != 122) {
            method1516(-60);
        }
        int var7 = var5 - 1;
        if (var7 != 0) {
            int var8 = 0;
            while (true) {
                var8 = arg2.indexOf(arg3, var8);
                if (var8 < 0) {
                    break;
                }
                var6 += var7;
                var8++;
            }
        }
        StringBuffer var9 = new StringBuffer(var6);
        int var10 = 0;
        while (true) {
            int var11 = arg2.indexOf(arg3, var10);
            if (var11 < 0) {
                var9.append(arg2.substring(var10));
                return var9.toString();
            }
            var9.append(arg2.substring(var10, var11));
            var10 = var11 + 1;
            var9.append(arg0);
        }
    }

    @OriginalMember(owner = "client!kea", name = "a", descriptor = "(I)V", line = 64)
    public static void method1516(int arg0) {
        if (arg0 != -6958) {
            field3171 = false;
        }
        field3169 = null;
        field3172 = null;
    }
}
