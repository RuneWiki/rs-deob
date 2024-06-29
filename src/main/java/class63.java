import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fw")
public class class63 {

    @OriginalMember(owner = "client!fw", name = "a", descriptor = "I")
    public static int field844;

    @OriginalMember(owner = "client!fw", name = "b", descriptor = "I")
    public static int field845;

    @OriginalMember(owner = "client!fw", name = "a", descriptor = "(IIIIIIIIBI)V")
    public static final void method378(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, byte arg8, int arg9) {
        field845++;
        if (arg8 < 25) {
            method379((byte) -60, null);
        }
        if (arg3 == arg9 && arg1 == arg7 && arg2 == arg4 && arg5 == arg6) {
            class259.method1705(arg3, arg2, arg5, true, arg1, arg0);
            return;
        }
        int var10 = arg3;
        int var11 = arg1;
        int var12 = arg3 * 3;
        int var13 = arg1 * 3;
        int var14 = arg9 * 3;
        int var15 = arg7 * 3;
        int var16 = arg4 * 3;
        int var17 = arg6 * 3;
        int var18 = arg2 + var14 - var16 - arg3;
        int var19 = arg5 + var15 - var17 - arg1;
        int var20 = var16 + var12 - var14 - var14;
        int var21 = var13 + var17 - var15 - var15;
        int var22 = var14 - var12;
        int var23 = var15 - var13;
        for (int var24 = 128; var24 <= 4096; var24 += 128) {
            int var25 = var24 * var24 >> 12;
            int var26 = var24 * var25 >> 12;
            int var27 = var18 * var26;
            int var28 = var19 * var26;
            int var29 = var20 * var25;
            int var30 = var21 * var25;
            int var31 = var22 * var24;
            int var32 = var23 * var24;
            int var33 = (var27 + var31 + var29 >> 12) + arg3;
            int var34 = arg1 + (var30 + var32 + var28 >> 12);
            class259.method1705(var10, var33, var34, true, var11, arg0);
            var11 = var34;
            var10 = var33;
        }
    }

    @OriginalMember(owner = "client!fw", name = "a", descriptor = "(B[B)V")
    public static final void method379(byte arg0, byte[] arg1) {
        field844++;
        class120 var2 = new class120(arg1);
        if (arg0 != 72) {
            return;
        }
        boolean var3 = false;
        while (true) {
            while (true) {
                int var4 = var2.method842(2384);
                if (var4 == 0) {
                    if (var3) {
                        return;
                    }
                    if (class667.field9391 == null) {
                        class182.field2764 = new int[4];
                        class233.field3378 = 4;
                        class667.field9391 = new int[4];
                    }
                    for (int var5 = 0; var5 < class667.field9391.length; var5++) {
                        class667.field9391[var5] = 0;
                        class182.field2764[var5] = var5 * 20;
                    }
                    return;
                }
                if (var4 == 1) {
                    if (class667.field9391 == null) {
                        class667.field9391 = new int[4];
                        class233.field3378 = 4;
                        class182.field2764 = new int[4];
                    }
                    for (int var6 = 0; var6 < class667.field9391.length; var6++) {
                        class667.field9391[var6] = var2.method838(true);
                        class182.field2764[var6] = var2.method838(true);
                    }
                    var3 = true;
                } else if (var4 == 2) {
                    class123.field1606 = var2.method898((byte) -106);
                } else if (var4 == 3) {
                    class233.field3378 = var2.method842(arg0 + 2312);
                    class667.field9391 = new int[class233.field3378];
                    class182.field2764 = new int[class233.field3378];
                }
            }
        }
    }
}
