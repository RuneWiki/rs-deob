import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mo")
public class class537 extends class5 {

    @OriginalMember(owner = "client!mo", name = "k", descriptor = "[B")
    public byte[] field7874;

    @OriginalMember(owner = "client!mo", name = "l", descriptor = "Lla;")
    public static class319 field7875 = new class319(50, 8);

    @OriginalMember(owner = "client!mo", name = "j", descriptor = "I")
    public static int field7873;

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(B[I[I[ILwk;)V", line = 4)
    public static final void method3170(byte arg0, int[] arg1, int[] arg2, int[] arg3, class96 arg4) {
        for (int var5 = 0; var5 < arg3.length; var5++) {
            int var6 = arg3[var5];
            int var7 = arg1[var5];
            int var8 = arg2[var5];
            for (int var9 = 0; var7 != 0 && var9 < arg4.field3901.length; var9++) {
                if ((var7 & 0x1) != 0) {
                    if (var6 == -1) {
                        arg4.field3901[var9] = null;
                    } else {
                        class91 var10 = class201.field2707.method489(83, var6);
                        int var11 = var10.field1340;
                        class389 var12 = arg4.field3901[var9];
                        if (var12 != null) {
                            if (var12.field5937 == var6) {
                                if (var11 == 0) {
                                    var12 = arg4.field3901[var9] = null;
                                } else if (var11 == 1) {
                                    var12.field5940 = 0;
                                    var12.field5938 = var8;
                                    var12.field5946 = 0;
                                    var12.field5939 = 0;
                                    var12.field5941 = 1;
                                    class441.method2669(false, var10, arg4.field1866, 0, arg4.field1867, arg4.field1862, class56.field800 == arg4);
                                } else if (var11 == 2) {
                                    var12.field5939 = 0;
                                }
                            } else if (var10.field1332 >= class201.field2707.method489(101, var12.field5937).field1332) {
                                var12 = arg4.field3901[var9] = null;
                            }
                        }
                        if (var12 == null) {
                            class389 var13 = arg4.field3901[var9] = new class389();
                            var13.field5939 = 0;
                            var13.field5941 = 1;
                            var13.field5937 = var6;
                            var13.field5940 = 0;
                            var13.field5946 = 0;
                            var13.field5938 = var8;
                            class441.method2669(false, var10, arg4.field1866, 0, arg4.field1867, arg4.field1862, class56.field800 == arg4);
                        }
                    }
                }
                var7 >>>= 0x1;
            }
        }
        field7873++;
        if (arg0 != 104) {
            field7875 = null;
        }
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(I)V", line = 101)
    public static void method3171(int arg0) {
        if (arg0 == 8) {
            field7875 = null;
        }
    }

    @OriginalMember(owner = "client!mo", name = "<init>", descriptor = "([B)V", line = 112)
    public class537(byte[] arg0) {
        this.field7874 = arg0;
    }
}
