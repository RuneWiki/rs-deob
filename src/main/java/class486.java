import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lh")
public class class486 {

    @OriginalMember(owner = "client!lh", name = "d", descriptor = "Ltf;")
    public static class264 field6915 = new class264(3, 3);

    @OriginalMember(owner = "client!lh", name = "f", descriptor = "Lhk;")
    public static class87 field6917 = new class87();

    @OriginalMember(owner = "client!lh", name = "h", descriptor = "I")
    public static int field6919 = 0;

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "F")
    public static float field6912;

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "I")
    public static int field6913;

    @OriginalMember(owner = "client!lh", name = "c", descriptor = "I")
    public static int field6914;

    @OriginalMember(owner = "client!lh", name = "e", descriptor = "I")
    public static int field6916;

    @OriginalMember(owner = "client!lh", name = "g", descriptor = "I")
    public static int field6918;

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(I)V")
    public static final void method2823(int arg0) {
        field6913++;
        class641.field9041++;
        class135 var1 = class688.method3794(class407.field5950, class583.field8198, (byte) 38);
        var1.field1978.method3853((byte) 51, arg0);
        class19.method223(var1, 0);
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(B[I[[B[B[[B[III)I")
    public static final int method2824(byte arg0, int[] arg1, byte[][] arg2, byte[] arg3, byte[][] arg4, int[] arg5, int arg6, int arg7) {
        field6914++;
        int var8 = arg5[arg6];
        int var9 = var8 + arg1[arg6];
        int var10 = arg5[arg7];
        int var11 = arg1[arg7] + var10;
        int var12 = var8;
        if (var10 > var8) {
            var12 = var10;
        }
        int var13 = var9;
        if (var11 < var9) {
            var13 = var11;
        }
        int var14 = arg3[arg6] & 0xFF;
        if ((arg3[arg7] & 0xFF) < var14) {
            var14 = arg3[arg7] & 0xFF;
        }
        if (arg0 != 5) {
            method2825(61);
        }
        byte[] var15 = arg2[arg6];
        byte[] var16 = arg4[arg7];
        int var17 = var12 - var8;
        int var18 = var12 - var10;
        for (int var19 = var12; var19 < var13; var19++) {
            int var20 = var15[var17++] + var16[var18++];
            if (var20 < var14) {
                var14 = var20;
            }
        }
        return -var14;
    }

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "(I)V")
    public static void method2825(int arg0) {
        field6915 = null;
        if (arg0 != 2116812800) {
            method2828(null, 73, -73, 100);
        }
        field6917 = null;
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(II)I")
    public static int method2826(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(ZI)V")
    public static final void method2827(boolean arg0, int arg1) {
        field6916++;
        if (arg1 <= 109) {
            return;
        }
        if (class27.field400 == null) {
            class420.method2525(-88);
        }
        if (arg0) {
            class27.field400.method3376(2);
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(Lrga;III)V")
    public static final void method2828(class215 arg0, int arg1, int arg2, int arg3) {
        if (arg2 < class302.field4492) {
            class40 var4 = class153.field2210[arg1][arg2 + 1][arg3];
            if (var4 != null && var4.field663 != null && var4.field663.method951(-86)) {
                arg0.method953(0, true, class682.field9618, var4.field663, class437.field6392, 0, true);
            }
        }
        if (arg3 < class302.field4492) {
            class40 var5 = class153.field2210[arg1][arg2][arg3 + 1];
            if (var5 != null && var5.field663 != null && var5.field663.method951(-89)) {
                arg0.method953(0, true, class682.field9618, var5.field663, 0, class437.field6392, true);
            }
        }
        if (arg2 < class302.field4492 && arg3 < class8.field82) {
            class40 var6 = class153.field2210[arg1][arg2 + 1][arg3 + 1];
            if (var6 != null && var6.field663 != null && var6.field663.method951(-90)) {
                arg0.method953(0, true, class682.field9618, var6.field663, class437.field6392, class437.field6392, true);
            }
        }
        if (arg2 < class302.field4492 && arg3 > 0) {
            class40 var7 = class153.field2210[arg1][arg2 + 1][arg3 - 1];
            if (var7 != null && var7.field663 != null && var7.field663.method951(-114)) {
                arg0.method953(0, true, class682.field9618, var7.field663, class437.field6392, -class437.field6392, true);
            }
        }
    }
}
