import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ch")
public class class445 implements class7 {

    @OriginalMember(owner = "client!ch", name = "c", descriptor = "Lka;")
    public static class408 field6237 = new class408(50);

    @OriginalMember(owner = "client!ch", name = "e", descriptor = "[[B")
    public static byte[][] field6239 = new byte[250][];

    @OriginalMember(owner = "client!ch", name = "g", descriptor = "I")
    public static int field6241 = 0;

    @OriginalMember(owner = "client!ch", name = "f", descriptor = "I")
    public static int field6240 = 0;

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "I")
    public static int field6235;

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "I")
    public static int field6236;

    @OriginalMember(owner = "client!ch", name = "d", descriptor = "Lfk;")
    public static class23 field6238;

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(BII[Lbm;ZLea;[B)V", line = 5)
    public static final void method2751(byte arg0, int arg1, int arg2, class325[] arg3, boolean arg4, class58 arg5, byte[] arg6) {
        if (arg0 >= -96) {
            method2751((byte) -79, 6, -8, (class325[]) null, false, (class58) null, (byte[]) null);
        }
        field6236++;
        class366 var7 = new class366(arg6);
        int var8 = -1;
        while (true) {
            int var9 = var7.method2293(-2);
            if (var9 == 0) {
                return;
            }
            var8 += var9;
            int var10 = 0;
            while (true) {
                int var11 = var7.method2251(-98);
                if (var11 == 0) {
                    break;
                }
                var10 += var11 - 1;
                int var12 = var10 & 0x3F;
                int var13 = (var10 & 0xFEA) >> 6;
                int var14 = var10 >> 12;
                int var15 = var7.method2306((byte) 123);
                int var16 = var15 >> 2;
                int var17 = var15 & 0x3;
                int var18 = arg1 + var13;
                int var19 = arg2 + var12;
                if (var18 > 0 && var19 > 0 && var18 < class11.field107 - 1 && (class264.field3620 - 1) > var19) {
                    class325 var20 = null;
                    if (!arg4) {
                        int var21 = var14;
                        if ((class302.field4122[1][var18][var19] & 0x2) == 2) {
                            var21 = var14 - 1;
                        }
                        if (var21 >= 0) {
                            var20 = arg3[var21];
                        }
                    }
                    class405.method2499(var20, var19, var17, 5000, var8, var14, arg4, var16, var14, -1, var18, arg5, true);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(II[IJ)Ljava/lang/String;", line = 87)
    public final String method42(int arg0, int arg1, int[] arg2, long arg3) {
        field6235++;
        if (arg0 == 0) {
            class394 var6 = class177.method1255(arg2[0], -46);
            return var6.method2444(92, (int) arg3);
        } else if (arg0 == 1 || arg0 == 10) {
            class14 var7 = class367.method2308(false, (int) arg3);
            return var7.field191;
        } else if (arg1 < 51) {
            return null;
        } else if (arg0 == 6 || arg0 == 7 || arg0 == 11) {
            return class177.method1255(arg2[0], -35).method2444(56, (int) arg3);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(I)V", line = 121)
    public static void method2752(int arg0) {
        field6239 = null;
        field6237 = null;
        if (arg0 != -3) {
            method2752(-63);
        }
        field6238 = null;
    }
}
