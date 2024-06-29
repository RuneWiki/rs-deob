import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ql")
public abstract class class65 {

    @OriginalMember(owner = "client!ql", name = "b", descriptor = "I")
    public static int field1099 = -1;

    @OriginalMember(owner = "client!ql", name = "c", descriptor = "I")
    public static int field1100;

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "Lvh;")
    public static class108 field1098;

    @OriginalMember(owner = "client!ql", name = "d", descriptor = "[I")
    public static int[] field1101;

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(I)V")
    public static void method408(int arg0) {
        field1098 = null;
        if (arg0 != 4937) {
            field1099 = -7;
        }
        field1101 = null;
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(BLnh;[I[I[I)V")
    public static final void method409(byte arg0, class288 arg1, int[] arg2, int[] arg3, int[] arg4) {
        if (arg0 < 49) {
            return;
        }
        for (int var5 = 0; var5 < arg3.length; var5++) {
            int var6 = arg4[var5];
            int var7 = arg3[var5];
            int var8 = arg2[var5];
            int var9 = 0;
            while (var6 != 0 && arg1.field1477.length > var9) {
                if ((var6 & 0x1) != 0) {
                    if (var7 == -1) {
                        arg1.field1477[var9] = null;
                    } else {
                        class167 var10 = class105.method714(var7, (byte) 33);
                        int var11 = var10.field2742;
                        class56 var12 = arg1.field1477[var9];
                        if (var12 != null) {
                            if (var12.field977 == var7) {
                                if (var11 == 0) {
                                    var12 = arg1.field1477[var9] = null;
                                } else if (var11 == 1) {
                                    var12.field969 = 0;
                                    var12.field967 = 1;
                                    var12.field964 = var8;
                                    var12.field966 = 0;
                                    var12.field971 = 0;
                                    class112.method786(arg1.field1458, var10, 0, arg1.field1397, (byte) -102, class273.field4378 == arg1);
                                } else if (var11 == 2) {
                                    var12.field966 = 0;
                                }
                            } else if (var10.field2744 >= class105.method714(var12.field977, (byte) 122).field2744) {
                                var12 = arg1.field1477[var9] = null;
                            }
                        }
                        if (var12 == null) {
                            class56 var13 = arg1.field1477[var9] = new class56();
                            var13.field964 = var8;
                            var13.field967 = 1;
                            var13.field971 = 0;
                            var13.field969 = 0;
                            var13.field966 = 0;
                            var13.field977 = var7;
                            class112.method786(arg1.field1458, var10, 0, arg1.field1397, (byte) -124, class273.field4378 == arg1);
                        }
                    }
                }
                var9++;
                var6 >>>= 0x1;
            }
        }
        field1100++;
    }
}
