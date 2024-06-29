import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eo")
public class class484 extends class276 {

    @OriginalMember(owner = "client!eo", name = "n", descriptor = "I")
    public volatile int field7108 = -1;

    @OriginalMember(owner = "client!eo", name = "q", descriptor = "Ljava/lang/String;")
    public volatile String field7111;

    @OriginalMember(owner = "client!eo", name = "p", descriptor = "Z")
    public static boolean field7110 = false;

    @OriginalMember(owner = "client!eo", name = "s", descriptor = "[Ljava/lang/String;")
    public static String[] field7113 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @OriginalMember(owner = "client!eo", name = "o", descriptor = "Lnk;")
    public static class326 field7109 = new class326(75, -1);

    @OriginalMember(owner = "client!eo", name = "t", descriptor = "Lnk;")
    public static class326 field7114 = new class326(34, -1);

    @OriginalMember(owner = "client!eo", name = "r", descriptor = "I")
    public static int field7112;

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(IILdw;I)Lgn;", line = 4)
    public static final class405 method2837(int arg0, int arg1, class403 arg2, int arg3) {
        field7112++;
        if (arg1 != -2068975664) {
            field7110 = false;
        }
        int var4 = arg2.field6128 | arg0 << 8;
        class405 var5 = (class405) class387.field5958.method2832((byte) 82, (long) var4 << 16);
        if (var5 != null) {
            return var5;
        }
        byte[] var6 = class488.field7142.method2942(class488.field7142.method2937(var4, true), arg1 + 2068965299);
        if (var6 == null) {
            int var8 = arg3 + 65536 << 8 | arg2.field6128;
            class405 var9 = (class405) class387.field5958.method2832((byte) 82, (long) var8 << 16);
            if (var9 != null) {
                return var9;
            }
            byte[] var10 = class488.field7142.method2942(class488.field7142.method2937(var8, true), -10365);
            if (var10 == null) {
                int var12 = arg2.field6128 | 0xFFFF00;
                class405 var13 = (class405) class387.field5958.method2832((byte) 82, (long) var12 << 16);
                if (var13 != null) {
                    return var13;
                }
                byte[] var14 = class488.field7142.method2942(class488.field7142.method2937(var12, true), -10365);
                if (var14 == null) {
                    return null;
                } else if (var14.length <= 1) {
                    return null;
                } else {
                    class405 var15 = class534.method3167(var14, (byte) -21);
                    var15.field6151 = arg2;
                    class387.field5958.method2831((byte) 108, var15, (long) var12 << 16);
                    return var15;
                }
            } else if (var10.length <= 1) {
                return null;
            } else {
                class405 var11 = class534.method3167(var10, (byte) -21);
                var11.field6151 = arg2;
                class387.field5958.method2831((byte) -81, var11, (long) var8 << 16);
                return var11;
            }
        } else if (var6.length <= 1) {
            return null;
        } else {
            class405 var7 = class534.method3167(var6, (byte) -21);
            var7.field6151 = arg2;
            class387.field5958.method2831((byte) 113, var7, (long) var4 << 16);
            return var7;
        }
    }

    @OriginalMember(owner = "client!eo", name = "<init>", descriptor = "(Ljava/lang/String;)V", line = 87)
    public class484(String arg0) {
        this.field7111 = arg0;
    }

    @OriginalMember(owner = "client!eo", name = "b", descriptor = "(B)V", line = 104)
    public static void method2838(byte arg0) {
        field7114 = null;
        field7113 = null;
        field7109 = null;
        if (arg0 != -122) {
            field7113 = null;
        }
    }
}
