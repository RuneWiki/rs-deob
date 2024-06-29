import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rm")
public class class430 {

    @OriginalMember(owner = "client!rm", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field6335 = new String[] { method3302(method3301("0\u0002\u000f\u0014J")), method3302(method3301("%YMV")), method3302(method3301("9A\u000fx\u001f")), method3302(method3301("9A\u000fy\u001f")), method3302(method3301("9A\u000f{\u001f")) };

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "Lub;")
    public static class22 field6332 = new class22(15000);

    @OriginalMember(owner = "client!rm", name = "b", descriptor = "I")
    public static int field6331;

    @OriginalMember(owner = "client!rm", name = "d", descriptor = "I")
    public static int field6333;

    @OriginalMember(owner = "client!rm", name = "c", descriptor = "I")
    public static int field6334;

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(ILla;Lla;Lla;Lla;)V")
    public static final void method3298(int arg0, class476 arg1, class476 arg2, class476 arg3, class476 arg4) {
        try {
            client.field5001 = arg1;
            if (arg0 != 15000) {
                method3300((byte) 79);
            }
            class417.field6155 = arg3;
            class113.field1322 = arg2;
            field6333++;
            class683.field9897 = new class541[class113.field1322.method3629((byte) 18)][];
            class376.field5722 = new boolean[class113.field1322.method3629((byte) 18)];
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field6335[2] + arg0 + ',' + (arg1 == null ? field6335[1] : field6335[0]) + ',' + (arg2 == null ? field6335[1] : field6335[0]) + ',' + (arg3 == null ? field6335[1] : field6335[0]) + ',' + (arg4 == null ? field6335[1] : field6335[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(I)J")
    public static final synchronized long method3299(int arg0) {
        try {
            field6331++;
            long var1 = System.currentTimeMillis();
            if (var1 < class341.field5309) {
                class657.field9491 += class341.field5309 - var1;
            }
            class341.field5309 = var1;
            if (arg0 < 66) {
                field6334 = -62;
            }
            return var1 + class657.field9491;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field6335[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(B)V")
    public static void method3300(byte arg0) {
        try {
            field6332 = null;
            if (arg0 >= -111) {
                field6334 = -111;
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field6335[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!rm", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3301(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x37);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!rm", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3302(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 75;
                    break;
                case 1:
                    var10005 = 44;
                    break;
                case 2:
                    var10005 = 33;
                    break;
                case 3:
                    var10005 = 58;
                    break;
                default:
                    var10005 = 55;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
