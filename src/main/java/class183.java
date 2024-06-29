import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jq")
public class class183 {

    @OriginalMember(owner = "client!jq", name = "b", descriptor = "Lgq;")
    public static class418 field2482 = new class418(64);

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "I")
    public static int field2481;

    @OriginalMember(owner = "client!jq", name = "c", descriptor = "I")
    public static int field2483;

    @OriginalMember(owner = "client!jq", name = "d", descriptor = "I")
    public static int field2484;

    @OriginalMember(owner = "client!jq", name = "e", descriptor = "I")
    public static int field2485;

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(Ln;[I[I[II)V", line = 6)
    public static final void method1116(class25 arg0, int[] arg1, int[] arg2, int[] arg3, int arg4) {
        field2483++;
        for (int var5 = 0; var5 < arg2.length; var5++) {
            int var6 = arg2[var5];
            int var7 = arg1[var5];
            int var8 = arg3[var5];
            for (int var9 = 0; var7 != 0 && arg0.field4278.length > var9; var9++) {
                if ((var7 & 0x1) != 0) {
                    if (var6 == -1) {
                        arg0.field4278[var9] = null;
                    } else {
                        class12 var10 = class33.method221((byte) 102, var6);
                        int var11 = var10.field193;
                        class316 var12 = arg0.field4278[var9];
                        if (var12 != null) {
                            if (var12.field4621 == var6) {
                                if (var11 == 0) {
                                    var12 = arg0.field4278[var9] = null;
                                } else if (var11 == 1) {
                                    var12.field4622 = var8;
                                    var12.field4623 = 0;
                                    var12.field4612 = 0;
                                    var12.field4619 = 0;
                                    var12.field4618 = 1;
                                    class298.method2049(arg0.field734, class227.field2988 == arg0, arg0.field740, arg4 ^ 0xFFFFD9E2, 0, var10);
                                } else if (var11 == 2) {
                                    var12.field4623 = 0;
                                }
                            } else if (var10.field190 >= class33.method221((byte) 102, var12.field4621).field190) {
                                var12 = arg0.field4278[var9] = null;
                            }
                        }
                        if (var12 == null) {
                            class316 var13 = arg0.field4278[var9] = new class316();
                            var13.field4622 = var8;
                            var13.field4612 = 0;
                            var13.field4619 = 0;
                            var13.field4621 = var6;
                            var13.field4618 = 1;
                            var13.field4623 = 0;
                            class298.method2049(arg0.field734, class227.field2988 == arg0, arg0.field740, arg4 ^ 0xFFFFD9E2, 0, var10);
                        }
                    }
                }
                var7 >>>= 0x1;
            }
        }
        if (arg4 != -1) {
            method1118((byte) 80);
        }
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(II)I", line = 104)
    public static int method1117(int arg0, int arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(B)V", line = 123)
    public static void method1118(byte arg0) {
        field2482 = null;
        int var1 = -33 / ((arg0 - 17) / 40);
    }
}
