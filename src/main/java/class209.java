import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rea")
public class class209 {

    @OriginalMember(owner = "client!rea", name = "c", descriptor = "Z")
    public static volatile boolean field2985 = false;

    @OriginalMember(owner = "client!rea", name = "a", descriptor = "I")
    public static int field2983;

    @OriginalMember(owner = "client!rea", name = "b", descriptor = "I")
    public static int field2984;

    @OriginalMember(owner = "client!rea", name = "d", descriptor = "I")
    public static int field2986;

    @OriginalMember(owner = "client!rea", name = "a", descriptor = "(II)V", line = 3)
    public static final void method1437(int arg0, int arg1) {
        field2983++;
        class594 var2 = class692.method3869(arg0, (byte) 105, arg1);
        var2.method3383(-16058);
    }

    @OriginalMember(owner = "client!rea", name = "a", descriptor = "(Z)Lwm;", line = 15)
    public static final class564 method1438(boolean arg0) {
        field2984++;
        class564 var1 = class756.method4218((byte) -103);
        if (arg0) {
            var1.field7784 = 0;
            var1.field7780 = null;
            var1.field7778 = new class665(5000);
            return var1;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!rea", name = "a", descriptor = "(IBII)V", line = 38)
    public static final void method1439(int arg0, byte arg1, int arg2, int arg3) {
        field2986++;
        int var4 = arg2 + class221.field3177;
        int var5 = class367.field5236 + arg0;
        if (class649.field8928 == null || arg2 < 0 || arg0 < 0 || arg2 >= class376.field5325 || class175.field2711 <= arg0 || class693.field9368.field4458.method3022(-32350) == 0 && class58.field1147.field5926 != arg3) {
            return;
        }
        long var6 = (long) (var5 << 14 | arg3 << 28 | var4);
        class206 var8 = (class206) class491.field6801.method1465(var6, -6008);
        if (var8 == null) {
            class86.method822(arg3, arg2, arg0);
            return;
        }
        class38 var9 = (class38) var8.field2961.method1269(4);
        if (var9 == null) {
            class86.method822(arg3, arg2, arg0);
            return;
        }
        class509 var10 = (class509) class86.method822(arg3, arg2, arg0);
        if (var10 == null) {
            var10 = new class509(arg2 << 9, class683.field9250[arg3].method1851((byte) -86, arg0, arg2), arg0 << 9, arg3, arg3);
        } else {
            var10.field7080 = var10.field7071 = -1;
        }
        var10.field7072 = var9.field942;
        if (arg1 >= -112) {
            field2985 = true;
        }
        var10.field7076 = var9.field940;
        label61: while (true) {
            class38 var11 = (class38) var8.field2961.method1264((byte) 55);
            if (var11 == null) {
                break;
            }
            if (var10.field7072 != var11.field942) {
                var10.field7080 = var11.field942;
                var10.field7081 = var11.field940;
                while (true) {
                    class38 var12 = (class38) var8.field2961.method1264((byte) 55);
                    if (var12 == null) {
                        break label61;
                    }
                    if (var10.field7072 != var12.field942 && var10.field7080 != var12.field942) {
                        var10.field7071 = var12.field942;
                        var10.field7077 = var12.field940;
                    }
                }
            }
        }
        int var13 = class197.method1403((arg2 << 9) + 256, arg3, 11219, (arg0 << 9) + 256);
        var10.field5933 = arg0 << 9;
        var10.field5926 = (byte) arg3;
        var10.field7087 = 0;
        var10.field5922 = arg2 << 9;
        var10.field5927 = var13;
        var10.field5921 = (byte) arg3;
        if (class334.method2118(arg0, arg2, true)) {
            var10.field5921++;
        }
        class189.method1363(arg3, arg2, arg0, var13, var10);
    }
}
