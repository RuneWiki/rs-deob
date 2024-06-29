import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ns")
public class class172 {

    @OriginalMember(owner = "client!ns", name = "c", descriptor = "Ljava/lang/String;")
    public static String field2553 = "Ok";

    @OriginalMember(owner = "client!ns", name = "d", descriptor = "[Lkf;")
    public static class293[] field2554 = new class293[14];

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "I")
    public static int field2551;

    @OriginalMember(owner = "client!ns", name = "b", descriptor = "I")
    public static int field2552;

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(I)V")
    public static void method1312(int arg0) {
        field2553 = null;
        if (arg0 != 47047344) {
            field2554 = null;
        }
        field2554 = null;
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(IIIII)I")
    public static final int method1313(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = -89 % ((arg2 - 37) / 60);
        field2551++;
        int var6 = 65536 - class56.field898[arg3 * 8192 / arg0] >> 1;
        return ((65536 - var6) * arg4 >> 16) + (arg1 * var6 >> 16);
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(IIIJ)V")
    public static final void method1314(int arg0, int arg1, int arg2, long arg3) {
        field2552++;
        int var5 = 82 % ((arg1 - 2) / 59);
        int var6 = (int) arg3 >> 14 & 0x1F;
        int var7 = ((int) arg3 & 0x3F94EA) >> 20;
        int var8 = Integer.MAX_VALUE & (int) (arg3 >>> 32);
        if (var6 != 10 && var6 != 11 && var6 != 22) {
            class367.method2342(true, class86.field1394.field5694[0], class86.field1394.field5696[0], var6, 0, 0, 0, (byte) 101, arg0, var7, arg2);
            return;
        }
        class45 var9 = class451.method2812(99, var8);
        int var10;
        int var11;
        if (var7 == 0 || var7 == 2) {
            var11 = var9.field717;
            var10 = var9.field724;
        } else {
            var10 = var9.field717;
            var11 = var9.field724;
        }
        int var12 = var9.field698;
        if (var7 != 0) {
            var12 = (var12 << var7 & 0xF) + (var12 >> 4 - var7);
        }
        class367.method2342(true, class86.field1394.field5694[0], class86.field1394.field5696[0], 0, var11, var12, var10, (byte) -100, arg0, 0, arg2);
    }
}
