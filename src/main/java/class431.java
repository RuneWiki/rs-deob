import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aw")
public class class431 {

    @OriginalMember(owner = "client!aw", name = "a", descriptor = "I")
    public static int field6023;

    @OriginalMember(owner = "client!aw", name = "c", descriptor = "I")
    public static int field6025;

    @OriginalMember(owner = "client!aw", name = "b", descriptor = "[I")
    public static int[] field6024;

    @OriginalMember(owner = "client!aw", name = "a", descriptor = "(I)V", line = 8)
    public static void method2665(int arg0) {
        if (arg0 != -32643) {
            field6024 = null;
        }
        field6024 = null;
    }

    @OriginalMember(owner = "client!aw", name = "a", descriptor = "(II)V", line = 18)
    public static final void method2666(int arg0, int arg1) {
        field6025++;
        if (arg0 != -1) {
            method2666(-33, -112);
        }
        class160 var2 = (class160) class131.field1826.method812(118, (long) arg1);
        if (var2 != null) {
            var2.field2229 = !var2.field2229;
            var2.field2234.method3583(1659, var2.field2229);
        }
    }

    @OriginalMember(owner = "client!aw", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;C)Ljava/lang/String;", line = 38)
    public static final String method2667(int arg0, String arg1, String arg2, char arg3) {
        field6023++;
        int var4 = arg2.length();
        int var5 = arg1.length();
        if (arg0 <= 112) {
            method2667(-39, null, null, (char) 65476);
        }
        int var6 = var4;
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
            var9.append(arg1);
        }
    }
}
