import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!md")
public class class226 {

    @OriginalMember(owner = "client!md", name = "b", descriptor = "Ljava/lang/String;")
    public static String field3575 = "Prepared sound engine";

    @OriginalMember(owner = "client!md", name = "f", descriptor = "I")
    public static int field3579 = 0;

    @OriginalMember(owner = "client!md", name = "a", descriptor = "I")
    public static int field3574;

    @OriginalMember(owner = "client!md", name = "d", descriptor = "I")
    public static int field3577;

    @OriginalMember(owner = "client!md", name = "g", descriptor = "Lic;")
    public static class104 field3580;

    @OriginalMember(owner = "client!md", name = "e", descriptor = "Ljg;")
    public static class271 field3578;

    @OriginalMember(owner = "client!md", name = "c", descriptor = "[S")
    public static short[] field3576;

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(Z)V")
    public static void method1491(boolean arg0) {
        field3576 = null;
        field3578 = null;
        if (arg0) {
            field3575 = null;
        }
        field3580 = null;
        field3575 = null;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(I)V")
    public static final void method1492(int arg0) {
        class75.field1024.method1831(-110);
        if (arg0 != 0) {
            field3579 = -26;
        }
        field3574++;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(Lfi;[I[IB[I)V")
    public static final void method1493(class235 arg0, int[] arg1, int[] arg2, byte arg3, int[] arg4) {
        for (int var5 = 0; var5 < arg4.length; var5++) {
            int var6 = arg4[var5];
            int var7 = arg2[var5];
            int var8 = arg1[var5];
            for (int var9 = 0; var7 != 0 && arg0.field654.length > var9; var9++) {
                if ((var7 & 0x1) != 0) {
                    if (var6 == -1) {
                        arg0.field654[var9] = null;
                    } else {
                        class21 var10 = class267.method1812((byte) 89, var6);
                        int var11 = var10.field239;
                        class171 var12 = arg0.field654[var9];
                        if (var12 != null) {
                            if (var12.field2762 == var6) {
                                if (var11 == 0) {
                                    var12 = arg0.field654[var9] = null;
                                } else if (var11 == 1) {
                                    var12.field2754 = 0;
                                    var12.field2759 = 1;
                                    var12.field2765 = 0;
                                    var12.field2756 = var8;
                                    var12.field2767 = 0;
                                    class150.method1022(var10, (byte) 127, 0, arg0.field613, class197.field3179 == arg0, arg0.field614);
                                } else if (var11 == 2) {
                                    var12.field2767 = 0;
                                }
                            } else if (var10.field257 >= class267.method1812((byte) 89, var12.field2762).field257) {
                                var12 = arg0.field654[var9] = null;
                            }
                        }
                        if (var12 == null) {
                            class171 var13 = arg0.field654[var9] = new class171();
                            var13.field2762 = var6;
                            var13.field2767 = 0;
                            var13.field2754 = 0;
                            var13.field2759 = 1;
                            var13.field2765 = 0;
                            var13.field2756 = var8;
                            class150.method1022(var10, (byte) 127, 0, arg0.field613, class197.field3179 == arg0, arg0.field614);
                        }
                    }
                }
                var7 >>>= 0x1;
            }
        }
        field3577++;
        if (arg3 <= 41) {
            field3576 = null;
        }
    }
}
