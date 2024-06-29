import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!n")
public abstract class class15 extends class261 {

    @OriginalMember(owner = "client!n", name = "p", descriptor = "Lbj;")
    public static class162 field270 = new class162(32, 4);

    @OriginalMember(owner = "client!n", name = "k", descriptor = "I")
    public static int field265;

    @OriginalMember(owner = "client!n", name = "m", descriptor = "I")
    public static int field267;

    @OriginalMember(owner = "client!n", name = "n", descriptor = "I")
    public static int field268;

    @OriginalMember(owner = "client!n", name = "o", descriptor = "I")
    public static int field269;

    @OriginalMember(owner = "client!n", name = "l", descriptor = "Lsf;")
    public static class366 field266;

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(I)V", line = 3)
    public static void method100(int arg0) {
        field270 = null;
        if (arg0 <= -106) {
            field266 = null;
        }
    }

    @OriginalMember(owner = "client!n", name = "b", descriptor = "(II)V", line = 24)
    public static final void method101(int arg0, int arg1) {
        field269++;
        class198.field3192 = arg0;
        class399 var2 = class262.field4002;
        synchronized (class262.field4002) {
            class262.field4002.method2475((byte) 67);
        }
        if (arg1 != -27307) {
            field266 = null;
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(III[Ljava/lang/String;)Ljava/lang/String;", line = 39)
    public static final String method102(int arg0, int arg1, int arg2, String[] arg3) {
        field268++;
        if (arg0 != 531) {
            return null;
        } else if (arg2 == 0) {
            return "";
        } else if (arg2 == 1) {
            String var4 = arg3[arg1];
            return var4 == null ? "null" : var4.toString();
        } else {
            int var5 = arg1 + arg2;
            int var6 = 0;
            for (int var7 = arg1; var7 < var5; var7++) {
                String var11 = arg3[var7];
                if (var11 == null) {
                    var6 += 4;
                } else {
                    var6 += var11.length();
                }
            }
            StringBuffer var8 = new StringBuffer(var6);
            for (int var9 = arg1; var9 < var5; var9++) {
                String var10 = arg3[var9];
                if (var10 == null) {
                    var8.append("null");
                } else {
                    var8.append(var10);
                }
            }
            return var8.toString();
        }
    }

    @OriginalMember(owner = "client!n", name = "b", descriptor = "(B)V", line = 105)
    public static final void method103(byte arg0) {
        field265++;
        class293.field4482.method2081(5, 0);
        class127.field2174.method680(5, (byte) -67);
        class428.field6404.method526(3, 5);
        class123.field2142.method1528(5, -101);
        class102.field1942.method841(774, 5);
        class135.field2271.method1642((byte) -121, 5);
        class422.field6355.method239(100, 5);
        class514.field7469.method593(1, 5);
        class155.field2526.method1452(27051, 5);
        class161.field2593.method1405(0, 5);
        class452.field6708.method2458(false, 5);
        class309.field4682.method1246(4, 5);
        class160.field2586.method2129(5, -13631);
        class453.field6727.method462(5, 11);
        class523.field7610.method1556(5, false);
        class159.field2574.method2509(29, 5);
        class464.field6883.method2405(8, 5);
        class214.field3396.method1086(5, true);
        class62.field1264.method1692(8, 5);
        class60.field1255.method982(5, 20703);
        class389.method2403(5, (byte) -118);
        class293.method1908(50, true);
        class63.method552(5, 128);
        class239.method1567(5, -92);
        class187.field2998.method2471((byte) 98, 5);
        if (arg0 < 115) {
            method104(null, -74, 1.7845956F, -0.7134834F, -123, -112, -128, -1.2361281F, -0.42170462F, -0.41062945F, -26);
        }
        class491.field7197.method2471((byte) 98, 5);
        class130.field2208.method2471((byte) 98, 5);
        class486.field7162.method2471((byte) 98, 5);
        class495.field7269.method2471((byte) 98, 5);
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(Lpj;IFFIIIFFFI)[B", line = 144)
    public static final byte[] method104(class101 arg0, int arg1, float arg2, float arg3, int arg4, int arg5, int arg6, float arg7, float arg8, float arg9, int arg10) {
        field267++;
        byte[] var11 = new byte[arg4 * arg10 * arg6];
        if (arg1 != -15722) {
            field266 = null;
        }
        class31.method215(arg7, arg9, arg6, var11, arg10, arg4, arg0, 0, arg3, arg8, arg2, arg5, (byte) 127);
        return var11;
    }
}
