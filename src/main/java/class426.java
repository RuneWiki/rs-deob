import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!or")
public class class426 {

    @OriginalMember(owner = "client!or", name = "b", descriptor = "Lcha;")
    public static class174 field6053 = null;

    @OriginalMember(owner = "client!or", name = "c", descriptor = "I")
    public static int field6054 = 0;

    @OriginalMember(owner = "client!or", name = "a", descriptor = "Lmq;")
    public static class78 field6052 = new class78(83, 6);

    @OriginalMember(owner = "client!or", name = "d", descriptor = "I")
    public static int field6055;

    @OriginalMember(owner = "client!or", name = "e", descriptor = "I")
    public static int field6056;

    @OriginalMember(owner = "client!or", name = "f", descriptor = "Lcr;")
    public static class175 field6057;

    @OriginalMember(owner = "client!or", name = "g", descriptor = "Lkha;")
    public static class687 field6058;

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(IIIIIII)V", line = 9)
    public static final void method2530(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field6055++;
        int var7 = class711.method3927(arg6, -109, class328.field4190, class112.field1386);
        int var8 = class711.method3927(arg0, -121, class328.field4190, class112.field1386);
        int var9 = class711.method3927(arg3, -125, class592.field8242, class108.field1334);
        int var10 = class711.method3927(arg2, -121, class592.field8242, class108.field1334);
        int var11 = class711.method3927(arg5 + arg6, -126, class328.field4190, class112.field1386);
        int var12 = class711.method3927(arg0 - arg5, -114, class328.field4190, class112.field1386);
        for (int var13 = var7; var13 < var11; var13++) {
            class284.method1709(class15.field220[var13], var10, -8251, var9, arg1);
        }
        for (int var14 = var8; var14 > var12; var14--) {
            class284.method1709(class15.field220[var14], var10, -8251, var9, arg1);
        }
        int var15 = class711.method3927(arg3 + arg5, -118, class592.field8242, class108.field1334);
        int var16 = class711.method3927(arg2 - arg5, -120, class592.field8242, class108.field1334);
        for (int var17 = var11; var17 <= var12; var17++) {
            int[] var18 = class15.field220[var17];
            class284.method1709(var18, var15, -8251, var9, arg1);
            class284.method1709(var18, var10, -8251, var16, arg1);
        }
        if (arg4 != 0) {
            method2530(-89, 70, 36, 111, 47, 72, -95);
        }
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(ILjava/lang/String;)V", line = 63)
    public static final void method2531(int arg0, String arg1) {
        field6056++;
        if (arg1 == null) {
            return;
        }
        if (arg0 != 17073) {
            field6052 = null;
        }
        if (arg1.startsWith("*")) {
            arg1 = arg1.substring(1);
        }
        String var2 = class165.method1022((byte) 107, arg1);
        if (var2 == null) {
            return;
        }
        for (int var3 = 0; var3 < class497.field7034; var3++) {
            String var4 = class736.field10317[var3];
            if (var4.startsWith("*")) {
                var4 = var4.substring(1);
            }
            String var5 = class165.method1022((byte) 122, var4);
            if (var5 != null && var5.equals(var2)) {
                class497.field7034--;
                for (int var6 = var3; var6 < class497.field7034; var6++) {
                    class736.field10317[var6] = class736.field10317[var6 + 1];
                    class223.field2934[var6] = class223.field2934[var6 + 1];
                    class415.field5866[var6] = class415.field5866[var6 + 1];
                    class556.field7801[var6] = class556.field7801[var6 + 1];
                    class425.field6051[var6] = class425.field6051[var6 + 1];
                }
                class453.field6344++;
                class112.field1379 = class215.field2727;
                class650 var7 = class314.method1837(class64.field866, true, class625.field8727);
                var7.field8928.method1141(class663.method3588(0, arg1), -70);
                var7.field8928.method1110(arg1, -30452);
                class108.method745(var7, arg0 - 17192);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(I)V", line = 145)
    public static void method2532(int arg0) {
        field6057 = null;
        if (arg0 > 110) {
            field6052 = null;
            field6053 = null;
            field6058 = null;
        }
    }
}
