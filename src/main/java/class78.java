import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kq")
public class class78 {

    @OriginalMember(owner = "client!kq", name = "c", descriptor = "Lpn;")
    public static class49 field1297 = new class49(55, 4);

    @OriginalMember(owner = "client!kq", name = "e", descriptor = "Lpu;")
    public static class179 field1299 = new class179(" more options", " weitere Optionen", " autres options", " mais opções");

    @OriginalMember(owner = "client!kq", name = "f", descriptor = "S")
    public static short field1300 = 1;

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "I")
    public static int field1295;

    @OriginalMember(owner = "client!kq", name = "b", descriptor = "I")
    public static int field1296;

    @OriginalMember(owner = "client!kq", name = "d", descriptor = "[I")
    public static int[] field1298;

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(I)V", line = 7)
    public static final void method702(int arg0) {
        field1295++;
        if (arg0 != 17354) {
            field1299 = null;
        }
        for (int var1 = 0; var1 < class166.field2508.length; var1++) {
            for (int var2 = 0; var2 < class166.field2508[var1].length; var2++) {
                class166.field2508[var1][var2] = class392.field5722;
            }
        }
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(ZIIIIII)V", line = 34)
    public static final void method703(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1296++;
        int var7 = class306.method2023(5, class487.field7124, arg1, class232.field3493);
        int var8 = class306.method2023(5, class487.field7124, arg4, class232.field3493);
        if (arg0) {
            return;
        }
        int var9 = class306.method2023(5, class232.field3492, arg6, class36.field453);
        int var10 = class306.method2023(5, class232.field3492, arg5, class36.field453);
        int var11 = class306.method2023(5, class487.field7124, arg1 + arg2, class232.field3493);
        int var12 = class306.method2023(5, class487.field7124, arg4 - arg2, class232.field3493);
        for (int var13 = var7; var13 < var11; var13++) {
            class262.method1831(var10, class402.field5946[var13], (byte) 43, arg3, var9);
        }
        for (int var14 = var8; var14 > var12; var14--) {
            class262.method1831(var10, class402.field5946[var14], (byte) 43, arg3, var9);
        }
        int var15 = class306.method2023(5, class232.field3492, arg2 + arg6, class36.field453);
        int var16 = class306.method2023(5, class232.field3492, arg5 - arg2, class36.field453);
        for (int var17 = var11; var17 <= var12; var17++) {
            int[] var18 = class402.field5946[var17];
            class262.method1831(var15, var18, (byte) 43, arg3, var9);
            class262.method1831(var10, var18, (byte) 43, arg3, var16);
        }
    }

    @OriginalMember(owner = "client!kq", name = "b", descriptor = "(I)V", line = 87)
    public static void method704(int arg0) {
        field1299 = null;
        field1297 = null;
        int var1 = 101 % ((arg0 + 50) / 51);
        field1298 = null;
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(Lbc;IIIII)V", line = 110)
    public static final void method705(class512 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        arg0.field7487 = 0;
        label58: for (int var6 = arg2; var6 <= arg4; var6++) {
            label56: for (int var7 = arg3; var7 <= arg5; var7++) {
                long var8 = class424.field6221[arg1][var6][var7];
                long var10 = 0L;
                while (true) {
                    label51: while (true) {
                        if (var10 > 48L) {
                            continue label56;
                        }
                        int var12 = (int) (var8 >>> (int) var10 & 0xFFFFL);
                        if (var12 <= 0) {
                            continue label56;
                        }
                        class181 var13 = class356.field5270[var12 - 1];
                        for (int var14 = 0; var14 < arg0.field7487; var14++) {
                            if (arg0.field7484[var14] == var13.field2775) {
                                var10 += 16L;
                                continue label51;
                            }
                        }
                        arg0.field7484[arg0.field7487++] = var13.field2775;
                        if (arg0.field7487 == 4) {
                            break label58;
                        }
                        var10 += 16L;
                    }
                }
            }
        }
        for (int var15 = arg0.field7487; var15 < 4; var15++) {
            arg0.field7484[var15] = null;
        }
    }
}
