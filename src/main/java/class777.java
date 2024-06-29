import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wh")
public class class777 {

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "[I")
    public static int[] field10669 = new int[1];

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "I")
    public static int field10670;

    @OriginalMember(owner = "client!wh", name = "c", descriptor = "I")
    public static int field10671;

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "([IIZLgh;)V", line = 3)
    public static final void method4274(int[] arg0, int arg1, boolean arg2, class506 arg3) {
        field10671++;
        if (arg3.field4088 != null) {
            boolean var4 = true;
            for (int var5 = 0; var5 < arg3.field4088.length; var5++) {
                if (arg3.field4088[var5] != arg0[var5]) {
                    var4 = false;
                    break;
                }
            }
            if (var4 && arg3.field4064 != -1) {
                class98 var6 = class168.field2552.method3287(114, arg3.field4064);
                int var7 = var6.field1392;
                if (var7 == 1) {
                    arg3.field4086 = 0;
                    arg3.field4080 = 1;
                    arg3.field4114 = 0;
                    arg3.field4132 = 0;
                    arg3.field4124 = arg1;
                    if (!arg3.field4120) {
                        class324.method1958(var6, (byte) 42, arg3, arg3.field4114);
                    }
                }
                if (var7 == 2) {
                    arg3.field4086 = 0;
                }
            }
        }
        boolean var8 = true;
        for (int var9 = 0; var9 < arg0.length; var9++) {
            if (arg0[var9] != -1) {
                var8 = false;
            }
            if (arg3.field4088 == null || arg3.field4088[var9] == -1 || class168.field2552.method3287(127, arg0[var9]).field1407 >= class168.field2552.method3287(81, arg3.field4088[var9]).field1407) {
                arg3.field4124 = arg1;
                arg3.field4088 = arg0;
                arg3.field4140 = arg3.field4141;
            }
        }
        if (var8) {
            arg3.field4140 = arg3.field4141;
            arg3.field4088 = arg0;
            arg3.field4124 = arg1;
        }
        if (arg2) {
            field10669 = null;
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(III)V", line = 91)
    public static final void method4275(int arg0, int arg1, int arg2) {
        field10670++;
        if (arg2 != 21896) {
            method4276((byte) 126);
        }
        class371 var3 = class490.method2867((byte) -79, 7, (long) arg1);
        var3.method2212(-108);
        var3.field5233 = arg0;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(B)V", line = 106)
    public static void method4276(byte arg0) {
        if (arg0 == 36) {
            field10669 = null;
        }
    }
}
