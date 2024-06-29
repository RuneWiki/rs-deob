import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vq")
public class class268 {

    @OriginalMember(owner = "client!vq", name = "f", descriptor = "I")
    public static int field3812 = 64;

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "I")
    public static int field3807;

    @OriginalMember(owner = "client!vq", name = "b", descriptor = "I")
    public static int field3808;

    @OriginalMember(owner = "client!vq", name = "c", descriptor = "I")
    public static int field3809;

    @OriginalMember(owner = "client!vq", name = "e", descriptor = "I")
    public static int field3811;

    @OriginalMember(owner = "client!vq", name = "g", descriptor = "I")
    public static int field3813;

    @OriginalMember(owner = "client!vq", name = "d", descriptor = "Ltq;")
    public static class376 field3810;

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(I)V")
    public static void method1781(int arg0) {
        if (arg0 >= -69) {
            field3810 = null;
        }
        field3810 = null;
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(II)V")
    public static final void method1782(int arg0, int arg1) {
        class93.field1126 = arg1;
        field3813++;
        class237 var2 = class150.field1839;
        synchronized (class150.field1839) {
            class150.field1839.method1618(0);
        }
        class237 var3 = class305.field4284;
        synchronized (class305.field4284) {
            class305.field4284.method1618(arg0 ^ arg0);
        }
        class237 var4 = class425.field6071;
        synchronized (class425.field6071) {
            class425.field6071.method1618(0);
        }
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(Lae;)V")
    public static final void method1783(class134 arg0) {
        for (int var1 = class55.field668; var1 < class167.field2334; var1++) {
            for (int var2 = 0; var2 < class415.field5953; var2++) {
                for (int var3 = 0; var3 < class299.field4190; var3++) {
                    class193 var4 = class250.field3570[var1][var2][var3];
                    if (var4 != null) {
                        class394 var5 = var4.field2784;
                        class394 var6 = var4.field2771;
                        if (var5 != null && var5.method54(true)) {
                            class279.method1838(arg0, var5, var1, var2, var3, 1, 1);
                            if (var6 != null && var6.method54(true)) {
                                class279.method1838(arg0, var6, var1, var2, var3, 1, 1);
                                var6.method60(false, (byte) 71, 0, 0, var5, 0, arg0);
                                var6.method51(6);
                            }
                            var5.method51(6);
                        }
                        for (class250 var7 = var4.field2779; var7 != null; var7 = var7.field3568) {
                            class233 var9 = var7.field3571;
                            if (var9 != null && var9.method54(true)) {
                                class279.method1838(arg0, var9, var1, var2, var3, var9.field3275 + 1 - var9.field3268, var9.field3271 - var9.field3267 + 1);
                                var9.method51(6);
                            }
                        }
                        class46 var8 = var4.field2790;
                        if (var8 != null && var8.method54(true)) {
                            class219.method1468(arg0, var8, var1, var2, var3);
                            var8.method51(6);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(IIIIIIIBI)V")
    public static final void method1784(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7, int arg8) {
        field3809++;
        int var9 = -99 % ((arg7 - 50) / 40);
        if (class98.method545(arg4, (byte) 11)) {
            class355.method2267(-1, arg6, (byte) 94, class98.field1194[arg4], arg0, arg2, arg5, arg3, arg8, arg1);
        } else if (arg0 == -1) {
            for (int var10 = 0; var10 < 100; var10++) {
                class394.field5556[var10] = true;
            }
        } else {
            class394.field5556[arg0] = true;
        }
    }
}
