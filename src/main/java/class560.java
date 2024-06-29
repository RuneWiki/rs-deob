import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kfa")
public abstract class class560 {

    @OriginalMember(owner = "client!kfa", name = "b", descriptor = "[I")
    public static int[] field7908 = new int[256];

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "I")
    public static int field7907;

    @OriginalMember(owner = "client!kfa", name = "d", descriptor = "I")
    public static int field7910;

    @OriginalMember(owner = "client!kfa", name = "c", descriptor = "Lhj;")
    public static class530 field7909;

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "([BZ)V")
    public abstract void method1462(byte[] arg0, boolean arg1);

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "(I)V")
    public static void method3184(int arg0) {
        field7909 = null;
        field7908 = null;
        if (arg0 != 0) {
            method3186(false, null);
        }
    }

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "(IZIILom;ZI)V")
    public static final void method3185(int arg0, boolean arg1, int arg2, int arg3, class344 arg4, boolean arg5, int arg6) {
        if (arg3 <= 0) {
            class444.method2671(arg4, arg6, arg1, 6408, arg2, arg0);
        } else {
            class486.field6961 = arg6;
            class585.field8450 = arg2;
            class577.field8380 = 1;
            class339.field5051 = arg1;
            class71.field1489 = arg0;
            class47.field1136 = arg4;
            class540.field7540 = class114.field2046.method228((byte) 46) / arg3;
            if (class540.field7540 < 1) {
                class540.field7540 = 1;
            }
        }
        if (!arg5) {
            field7907++;
        }
    }

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "(ZLjava/lang/String;)V")
    public static final void method3186(boolean arg0, String arg1) {
        if (arg0) {
            method3184(67);
        }
        field7910++;
        if (arg1 == null) {
            return;
        }
        if (arg1.startsWith("*")) {
            arg1 = arg1.substring(1);
        }
        String var2 = class655.method3728(arg1, true);
        if (var2 == null) {
            return;
        }
        for (int var3 = 0; var3 < class296.field4436; var3++) {
            String var4 = class518.field7306[var3];
            if (var4.startsWith("*")) {
                var4 = var4.substring(1);
            }
            String var5 = class655.method3728(var4, true);
            if (var5 != null && var5.equals(var2)) {
                class296.field4436--;
                for (int var6 = var3; var6 < class296.field4436; var6++) {
                    class518.field7306[var6] = class518.field7306[var6 + 1];
                    class38.field1057[var6] = class38.field1057[var6 + 1];
                    class291.field4370[var6] = class291.field4370[var6 + 1];
                    class34.field974[var6] = class34.field974[var6 + 1];
                    class234.field3488[var6] = class234.field3488[var6 + 1];
                }
                class63.field1431 = class104.field1844;
                class637.field9178++;
                class275 var7 = class185.method1355(0, class600.field8606, class395.field5772);
                var7.field4103.method693((byte) 106, class511.method3019(arg1, -105));
                var7.field4103.method750(127, arg1);
                class140.method1141(var7, 19321);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "(IBI)[B")
    public abstract byte[] method1460(int arg0, byte arg1, int arg2);

    @OriginalMember(owner = "client!kfa", name = "b", descriptor = "(I)[B")
    public abstract byte[] method1461(int arg0);
}
