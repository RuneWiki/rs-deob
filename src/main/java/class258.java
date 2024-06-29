import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!te")
public class class258 {

    @OriginalMember(owner = "client!te", name = "a", descriptor = "Llc;")
    public static class143 field4630 = class66.method374("Attaquer", -1);

    @OriginalMember(owner = "client!te", name = "f", descriptor = "Z")
    public static boolean field4635 = false;

    @OriginalMember(owner = "client!te", name = "e", descriptor = "Z")
    public static boolean field4634 = false;

    @OriginalMember(owner = "client!te", name = "c", descriptor = "J")
    public static long field4632 = 0L;

    @OriginalMember(owner = "client!te", name = "b", descriptor = "I")
    public static int field4631;

    @OriginalMember(owner = "client!te", name = "d", descriptor = "I")
    public static int field4633;

    @OriginalMember(owner = "client!te", name = "g", descriptor = "I")
    public static int field4636;

    @OriginalMember(owner = "client!te", name = "h", descriptor = "I")
    public static int field4637;

    @OriginalMember(owner = "client!te", name = "i", descriptor = "I")
    public static int field4638;

    @OriginalMember(owner = "client!te", name = "j", descriptor = "I")
    public static int field4639;

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(I)V")
    public static void method1704(int arg0) {
        if (arg0 != 1) {
            method1708(-67);
        }
        field4630 = null;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1705(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field4636++;
        int var8 = 2048 - arg4 & 0x7FF;
        int var9 = 2048 - arg5 & 0x7FF;
        int var10 = 0;
        int var11 = 0;
        if (arg2 > -88) {
            return;
        }
        int var12 = arg7;
        if (var8 != 0) {
            int var13 = class196.field3635[var8];
            var11 = -arg7 * var13 >> 16;
            int var14 = class196.field3630[var8];
            var12 = arg7 * var14 >> 16;
        }
        if (var9 != 0) {
            int var15 = class196.field3635[var9];
            int var16 = class196.field3630[var9];
            var10 = var12 * var15 >> 16;
            var12 = var12 * var16 >> 16;
        }
        class154.field2776 = arg0 - var12;
        class148.field2729 = arg5;
        class163.field2925 = arg4;
        class92.field1658 = arg3 - var11;
        class167.field2992 = arg1 - var10;
    }

    @OriginalMember(owner = "client!te", name = "b", descriptor = "(I)Lvg;")
    public static final class230 method1706(int arg0) {
        field4637++;
        int var1 = class41.field697[0] * class153.field2766[0];
        byte[] var2 = class282.field4961[0];
        int[] var3 = new int[var1];
        for (int var4 = 0; var4 < var1; var4++) {
            var3[var4] = class111.field1961[class129.method777(255, var2[var4])];
        }
        class160 var5 = new class160(class257.field4628, class70.field1332, class126.field2226[0], class32.field536[0], class41.field697[0], class153.field2766[0], var3);
        int var6 = 14 / ((-arg0 - 63) / 58);
        method1708(0);
        return var5;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(ILlc;I)V")
    public static final void method1707(int arg0, class143 arg1, int arg2) {
        if (arg0 != 24534) {
            method1706(-88);
        }
        field4638++;
        class143 var3 = arg1.method869(arg0 - 24486).method878(-28102);
        boolean var4 = false;
        for (int var5 = 0; var5 < class107.field1889; var5++) {
            class32 var6 = class6.field97[class30.field467[var5]];
            if (var6 != null && var6.field518 != null && var6.field518.method895((byte) -94, var3)) {
                var4 = true;
                class203.method1389((byte) -119, false, 0, 2, 1, var6.field4148[0], class229.field4195.field4115[0], class229.field4195.field4148[0], 1, var6.field4115[0], 0, 0);
                if (arg2 == 1) {
                    class285.field5010.method799(arg0 - 24431, 157);
                    class147.field2656++;
                    class285.field5010.method1272(3225, class30.field467[var5]);
                } else if (arg2 == 4) {
                    class285.field5010.method799(103, 114);
                    class72.field1363++;
                    class285.field5010.method1245(class30.field467[var5], 68);
                } else if (arg2 == 5) {
                    class27.field445++;
                    class285.field5010.method799(arg0 - 24431, 236);
                    class285.field5010.method1278(class30.field467[var5], (byte) 69);
                } else if (arg2 == 6) {
                    class285.field5010.method799(arg0 ^ 0x5FB1, 190);
                    class285.field5010.method1245(class30.field467[var5], 112);
                    class62.field1176++;
                } else if (arg2 == 7) {
                    class285.field5010.method799(103, 56);
                    class272.field4857++;
                    class285.field5010.method1278(class30.field467[var5], (byte) 69);
                }
                break;
            }
        }
        if (!var4) {
            class170.method1119(class21.field342, 4096, class25.method179(0, new class143[] { class163.field2923, var3 }), 0);
        }
    }

    @OriginalMember(owner = "client!te", name = "c", descriptor = "(I)V")
    public static final void method1708(int arg0) {
        class32.field536 = null;
        field4639++;
        class111.field1961 = null;
        class282.field4961 = null;
        if (arg0 != 0) {
            field4630 = null;
        }
        class153.field2766 = null;
        class126.field2226 = null;
        class41.field697 = null;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(II)Lcf;")
    public static final class112 method1709(int arg0, int arg1) {
        field4633++;
        class112 var2 = (class112) class119.field2107.method1168((long) arg1, (byte) 96);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class255.field4587.method41(-18328, arg0, arg1);
        class112 var4 = new class112();
        if (var3 != null) {
            var4.method675(true, new class190(var3));
        }
        class119.field2107.method1163(var4, (long) arg1, 0);
        return var4;
    }
}
