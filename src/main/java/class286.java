import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ef")
public class class286 extends class121 {

    @OriginalMember(owner = "client!ef", name = "o", descriptor = "[Ljava/lang/String;")
    public static String[] field4549 = new String[100];

    @OriginalMember(owner = "client!ef", name = "h", descriptor = "I")
    public static int field4542 = 0;

    @OriginalMember(owner = "client!ef", name = "i", descriptor = "I")
    public static int field4543;

    @OriginalMember(owner = "client!ef", name = "j", descriptor = "I")
    public static int field4544;

    @OriginalMember(owner = "client!ef", name = "k", descriptor = "I")
    public static int field4545;

    @OriginalMember(owner = "client!ef", name = "m", descriptor = "I")
    public static int field4547;

    @OriginalMember(owner = "client!ef", name = "n", descriptor = "I")
    public static int field4548;

    @OriginalMember(owner = "client!ef", name = "l", descriptor = "Lse;")
    public static class10 field4546;

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "(I)V")
    public static void method1924(int arg0) {
        if (arg0 != 28827) {
            field4542 = 41;
        }
        field4549 = null;
        field4546 = null;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "([IIIJ)Ljava/lang/String;")
    public static final String method1925(int[] arg0, int arg1, int arg2, long arg3) {
        field4548++;
        int var5 = -100 / ((arg2 + 31) / 35);
        if (class193.field2775 != null) {
            String var6 = class193.field2775.method670(arg0, arg1, arg3, (byte) 60);
            if (var6 != null) {
                return var6;
            }
        }
        return Long.toString(arg3);
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "([I[I[IILth;)V")
    public static final void method1926(int[] arg0, int[] arg1, int[] arg2, int arg3, class72 arg4) {
        field4547++;
        for (int var5 = 0; var5 < arg2.length; var5++) {
            int var6 = arg2[var5];
            int var7 = arg1[var5];
            int var8 = arg0[var5];
            int var9 = 0;
            while (var7 != 0 && var9 < arg4.field101.length) {
                if ((var7 & 0x1) != 0) {
                    if (var6 == -1) {
                        arg4.field101[var9] = null;
                    } else {
                        class196 var10 = class70.method478(var6, false);
                        class235 var11 = arg4.field101[var9];
                        int var12 = var10.field2820;
                        if (var11 != null) {
                            if (var11.field3553 == var6) {
                                if (var12 == 0) {
                                    var11 = arg4.field101[var9] = null;
                                } else if (var12 == 1) {
                                    var11.field3552 = 0;
                                    var11.field3543 = 0;
                                    var11.field3548 = var8;
                                    var11.field3544 = 1;
                                    var11.field3554 = 0;
                                    class206.method1327(0, -77, var10, false, arg4.field94, arg4.field45);
                                } else if (var12 == 2) {
                                    var11.field3552 = 0;
                                }
                            } else if (var10.field2830 >= class70.method478(var11.field3553, false).field2830) {
                                var11 = arg4.field101[var9] = null;
                            }
                        }
                        if (var11 == null) {
                            class235 var13 = arg4.field101[var9] = new class235();
                            var13.field3552 = 0;
                            var13.field3554 = 0;
                            var13.field3544 = 1;
                            var13.field3548 = var8;
                            var13.field3543 = 0;
                            var13.field3553 = var6;
                            class206.method1327(0, -122, var10, false, arg4.field94, arg4.field45);
                        }
                    }
                }
                var9++;
                var7 >>>= 0x1;
            }
        }
        if (arg3 < 32) {
            method1925((int[]) null, -80, -6, -45L);
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(Lve;ILve;)V")
    public static final void method1927(class233 arg0, int arg1, class233 arg2) {
        class87.field1340 = arg0;
        class40.field592 = arg2;
        field4543++;
        if (arg1 != 0) {
            method1924(-62);
        }
    }
}
