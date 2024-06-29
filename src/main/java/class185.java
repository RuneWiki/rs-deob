import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eh")
public class class185 extends InputStream {

    @OriginalMember(owner = "client!eh", name = "f", descriptor = "I")
    public static int field3139 = 0;

    @OriginalMember(owner = "client!eh", name = "d", descriptor = "Z")
    public static boolean field3137 = false;

    @OriginalMember(owner = "client!eh", name = "e", descriptor = "Lc;")
    public static class331 field3138 = new class331();

    @OriginalMember(owner = "client!eh", name = "l", descriptor = "Ljava/lang/String;")
    public static String field3145 = "shake:";

    @OriginalMember(owner = "client!eh", name = "j", descriptor = "F")
    public static float field3143;

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "I")
    public static int field3135;

    @OriginalMember(owner = "client!eh", name = "c", descriptor = "I")
    public static int field3136;

    @OriginalMember(owner = "client!eh", name = "g", descriptor = "I")
    public static int field3140;

    @OriginalMember(owner = "client!eh", name = "h", descriptor = "I")
    public static int field3141;

    @OriginalMember(owner = "client!eh", name = "k", descriptor = "I")
    public static int field3144;

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "Lcg;")
    public static class49 field3134;

    @OriginalMember(owner = "client!eh", name = "i", descriptor = "Lcg;")
    public static class49 field3142;

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(Llg;IZ)V", line = 5)
    public static final void method1425(class137 arg0, int arg1, boolean arg2) {
        field3141++;
        if (arg1 < 43) {
            field3143 = -2.4929404F;
        }
        int var3 = arg0.field2426 == 0 ? arg0.field2533 : arg0.field2426;
        int var4 = arg0.field2497 == 0 ? arg0.field2515 : arg0.field2497;
        class138.method1132(arg0.field2462, arg2, var3, class109.field1852[arg0.field2462 >> 16], -128, var4);
        if (arg0.field2453 != null) {
            class138.method1132(arg0.field2462, arg2, var3, arg0.field2453, 34, var4);
        }
        class228 var5 = (class228) class172.field2972.method732((long) arg0.field2462, true);
        if (var5 != null) {
            class215.method1590(arg2, var4, var3, -120, var5.field3833);
        }
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(I)V", line = 37)
    public static void method1426(int arg0) {
        field3138 = null;
        field3134 = null;
        field3145 = null;
        if (arg0 <= 123) {
            field3144 = 30;
        }
        field3142 = null;
    }

    @OriginalMember(owner = "client!eh", name = "read", descriptor = "()I", line = 52)
    public final int read() {
        field3135++;
        class142.method1149(30000L, (byte) 127);
        return -1;
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;", line = 63)
    public static final String method1427(String arg0, int arg1, String arg2, String arg3) {
        int var4 = arg2.length();
        int var5 = arg3.length();
        field3136++;
        int var6 = arg0.length();
        if (arg1 > -37) {
            return (String) null;
        } else if (var5 == 0) {
            throw new IllegalArgumentException("Key cannot have zero length");
        } else {
            int var7 = var4;
            int var8 = var6 - var5;
            if (var8 != 0) {
                int var9 = 0;
                while (true) {
                    int var10 = arg2.indexOf(arg3, var9);
                    if (var10 < 0) {
                        break;
                    }
                    var7 += var8;
                    var9 = var5 + var10;
                }
            }
            StringBuffer var11 = new StringBuffer(var7);
            int var12 = 0;
            while (true) {
                int var13 = arg2.indexOf(arg3, var12);
                if (var13 < 0) {
                    var11.append(arg2.substring(var12));
                    return var11.toString();
                }
                var11.append(arg2.substring(var12, var13));
                var11.append(arg0);
                var12 = var5 + var13;
            }
        }
    }
}
