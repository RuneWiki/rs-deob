import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jr")
public class class73 {

    @OriginalMember(owner = "client!jr", name = "c", descriptor = "I")
    public static int field997;

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "Lmg;")
    public static class101 field995;

    @OriginalMember(owner = "client!jr", name = "b", descriptor = "Lld;")
    public static class115 field996;

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(Lsk;[II[I[I)V", line = 3)
    public static final void method594(class438 arg0, int[] arg1, int arg2, int[] arg3, int[] arg4) {
        for (int var5 = arg2; var5 < arg4.length; var5++) {
            int var6 = arg4[var5];
            int var7 = arg1[var5];
            int var8 = arg3[var5];
            for (int var9 = 0; var7 != 0 && arg0.field1058.length > var9; var9++) {
                if ((var7 & 0x1) != 0) {
                    if (var6 == -1) {
                        arg0.field1058[var9] = null;
                    } else {
                        class104 var10 = class222.field3168.method126(-118, var6);
                        int var11 = var10.field1566;
                        class431 var12 = arg0.field1058[var9];
                        if (var12 != null) {
                            if (var12.field6335 == var6) {
                                if (var11 == 0) {
                                    var12 = arg0.field1058[var9] = null;
                                } else if (var11 == 1) {
                                    var12.field6337 = 1;
                                    var12.field6333 = 0;
                                    var12.field6330 = 0;
                                    var12.field6331 = 0;
                                    var12.field6329 = var8;
                                    class441.method2618(arg0.field1732, arg0.field1735, arg0.field1738, class316.field4324 == arg0, var10, 0, 86);
                                } else if (var11 == 2) {
                                    var12.field6333 = 0;
                                }
                            } else if (var10.field1570 >= class222.field3168.method126(-106, var12.field6335).field1570) {
                                var12 = arg0.field1058[var9] = null;
                            }
                        }
                        if (var12 == null) {
                            class431 var13 = arg0.field1058[var9] = new class431();
                            var13.field6329 = var8;
                            var13.field6330 = 0;
                            var13.field6335 = var6;
                            var13.field6331 = 0;
                            var13.field6333 = 0;
                            var13.field6337 = 1;
                            class441.method2618(arg0.field1732, arg0.field1735, arg0.field1738, class316.field4324 == arg0, var10, 0, 121);
                        }
                    }
                }
                var7 >>>= 0x1;
            }
        }
        field997++;
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(I)V", line = 96)
    public static void method595(int arg0) {
        field995 = null;
        if (arg0 != 0) {
            field995 = null;
        }
        field996 = null;
    }
}
