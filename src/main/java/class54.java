import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public class class54 {

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "Llc;")
    public static class435 field836 = new class435(119, 11);

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "I")
    public static int field837;

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(I)V")
    public static void method481(int arg0) {
        if (arg0 < -41) {
            field836 = null;
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "([I[ILl;I[I)V")
    public static final void method482(int[] arg0, int[] arg1, class639 arg2, int arg3, int[] arg4) {
        for (int var5 = 0; var5 < arg1.length; var5++) {
            int var6 = arg1[var5];
            int var7 = arg0[var5];
            int var8 = arg4[var5];
            for (int var9 = 0; var7 != 0 && arg2.field4615.length > var9; var9++) {
                if ((var7 & 0x1) != 0) {
                    if (var6 == -1) {
                        arg2.field4615[var9] = null;
                    } else {
                        class131 var10 = class610.field8698.method2999(var6, false);
                        int var11 = var10.field1806;
                        class196 var12 = arg2.field4615[var9];
                        if (var12 != null) {
                            if (var12.field2873 == var6) {
                                if (var11 == 0) {
                                    var12 = arg2.field4615[var9] = null;
                                } else if (var11 == 1) {
                                    var12.field2864 = 0;
                                    var12.field2870 = var8;
                                    var12.field2862 = 0;
                                    var12.field2871 = 1;
                                    var12.field2858 = 0;
                                    if (!arg2.field4612) {
                                        class701.method3941(0, var10, (byte) 101, arg2);
                                    }
                                } else if (var11 == 2) {
                                    var12.field2864 = 0;
                                }
                            } else if (var10.field1784 >= class610.field8698.method2999(var12.field2873, false).field1784) {
                                var12 = arg2.field4615[var9] = null;
                            }
                        }
                        if (var12 == null) {
                            class196 var13 = arg2.field4615[var9] = new class196();
                            var13.field2870 = var8;
                            var13.field2871 = 1;
                            var13.field2858 = 0;
                            var13.field2864 = 0;
                            var13.field2873 = var6;
                            var13.field2862 = 0;
                            if (!arg2.field4612) {
                                class701.method3941(0, var10, (byte) 101, arg2);
                            }
                        }
                    }
                }
                var7 >>>= 0x1;
            }
        }
        field837++;
        if (arg3 != -1) {
            field836 = null;
        }
    }
}
