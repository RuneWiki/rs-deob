import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public class class23 {

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "I")
    public static int field568 = 0;

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "Ljk;")
    public static class241 field569 = class114.method807((byte) -126);

    @OriginalMember(owner = "client!ec", name = "h", descriptor = "Ljd;")
    public static class86 field575 = class122.method868("settings=", true);

    @OriginalMember(owner = "client!ec", name = "i", descriptor = "Lrk;")
    public static class257 field576 = new class257();

    @OriginalMember(owner = "client!ec", name = "j", descriptor = "I")
    public static int field577 = 0;

    @OriginalMember(owner = "client!ec", name = "k", descriptor = "I")
    public static int field578 = 0;

    @OriginalMember(owner = "client!ec", name = "c", descriptor = "I")
    public static int field570;

    @OriginalMember(owner = "client!ec", name = "d", descriptor = "I")
    public static int field571;

    @OriginalMember(owner = "client!ec", name = "e", descriptor = "I")
    public static int field572;

    @OriginalMember(owner = "client!ec", name = "f", descriptor = "I")
    public static int field573;

    @OriginalMember(owner = "client!ec", name = "g", descriptor = "I")
    public static int field574;

    @OriginalMember(owner = "client!ec", name = "l", descriptor = "Lja;")
    public static class58 field579;

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(BZ)V")
    public static final void method169(byte arg0, boolean arg1) {
        byte var2 = 4;
        byte[][] var3 = class164.field3086;
        field570++;
        int var4 = var3.length;
        for (int var5 = 0; var5 < var4; var5++) {
            int var12 = (class168.field3103[var5] & 0xFF) * 64 - class79.field1554;
            byte[] var13 = var3[var5];
            int var14 = (class168.field3103[var5] >> 8) * 64 - class252.field4481;
            if (var13 != null) {
                class7.method51(21966);
                class14.method101(112, arg1, class122.field2388, class249.field4446 * 8 - 48, var13, var14, class149.field2780 * 8 - 48, var12);
            }
        }
        int var6 = 62 % ((45 - arg0) / 43);
        for (int var7 = 0; var7 < var4; var7++) {
            int var8 = (class168.field3103[var7] >> 8) * 64 - class252.field4481;
            int var9 = (class168.field3103[var7] & 0xFF) * 64 - class79.field1554;
            byte[] var10 = var3[var7];
            if (var10 == null && class149.field2780 < 800) {
                class7.method51(21966);
                for (int var11 = 0; var11 < var2; var11++) {
                    class268.method1846(var8, 64, var11, 7, 64, var9);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(B)V")
    public static final void method170(byte arg0) {
        class168.field3102.method1358((byte) 21);
        int var1 = class168.field3102.method1352(8, 93);
        field573++;
        if (var1 < class61.field1207) {
            for (int var2 = var1; var2 < class61.field1207; var2++) {
                class1.field11[class102.field1971++] = class189.field3350[var2];
            }
        }
        if (class61.field1207 < var1) {
            throw new RuntimeException("gnpov1");
        }
        class61.field1207 = 0;
        if (arg0 < 124) {
            field578 = 8;
        }
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = class189.field3350[var3];
            class170 var5 = class233.field4217[var4];
            int var6 = class168.field3102.method1352(1, -104);
            if (var6 == 0) {
                class189.field3350[class61.field1207++] = var4;
                var5.field702 = class236.field4265;
            } else {
                int var7 = class168.field3102.method1352(2, 96);
                if (var7 == 0) {
                    class189.field3350[class61.field1207++] = var4;
                    var5.field702 = class236.field4265;
                    class271.field4762[class164.field3083++] = var4;
                } else if (var7 == 1) {
                    class189.field3350[class61.field1207++] = var4;
                    var5.field702 = class236.field4265;
                    int var8 = class168.field3102.method1352(3, 108);
                    var5.method235(var8, false, 127);
                    int var9 = class168.field3102.method1352(1, -79);
                    if (var9 == 1) {
                        class271.field4762[class164.field3083++] = var4;
                    }
                } else if (var7 == 2) {
                    class189.field3350[class61.field1207++] = var4;
                    var5.field702 = class236.field4265;
                    int var10 = class168.field3102.method1352(3, -84);
                    var5.method235(var10, true, 125);
                    int var11 = class168.field3102.method1352(3, -107);
                    var5.method235(var11, true, 126);
                    int var12 = class168.field3102.method1352(1, 105);
                    if (var12 == 1) {
                        class271.field4762[class164.field3083++] = var4;
                    }
                } else if (var7 == 3) {
                    class1.field11[class102.field1971++] = var4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(I)V")
    public static void method171(int arg0) {
        field576 = null;
        if (arg0 < -36) {
            field575 = null;
            field569 = null;
            field579 = null;
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(IIIIIIIB)V")
    public static final void method172(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7) {
        field571++;
        int var8 = 2048 - arg4 & 0x7FF;
        int var9 = 0;
        int var10 = 2048 - arg2 & 0x7FF;
        int var11 = 0;
        int var12 = arg1;
        if (var8 != 0) {
            int var13 = class145.field2746[var8];
            var11 = -arg1 * var13 >> 16;
            int var14 = class145.field2742[var8];
            var12 = arg1 * var14 >> 16;
        }
        if (var10 != 0) {
            int var15 = class145.field2746[var10];
            var9 = var12 * var15 >> 16;
            int var16 = class145.field2742[var10];
            var12 = var12 * var16 >> 16;
        }
        class88.field1748 = arg0 - var11;
        class255.field4541 = arg4;
        class70.field1430 = arg6 - var9;
        class176.field3202 = arg2;
        class4.field61 = arg3 - var12;
        if (arg7 != -23) {
            method171(-22);
        }
    }
}
