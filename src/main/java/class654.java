import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oo")
public class class654 {

    @OriginalMember(owner = "client!oo", name = "j", descriptor = "Lpja;")
    private class43 field9060 = new class43(64);

    @OriginalMember(owner = "client!oo", name = "g", descriptor = "Lgj;")
    private class662 field9057;

    @OriginalMember(owner = "client!oo", name = "f", descriptor = "[I")
    public static int[] field9056 = new int[4096];

    @OriginalMember(owner = "client!oo", name = "h", descriptor = "Lfja;")
    public static class783 field9058 = new class783(4, 4);

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "I")
    public static int field9051;

    @OriginalMember(owner = "client!oo", name = "b", descriptor = "I")
    public static int field9052;

    @OriginalMember(owner = "client!oo", name = "c", descriptor = "I")
    public static int field9053;

    @OriginalMember(owner = "client!oo", name = "d", descriptor = "I")
    public static int field9054;

    @OriginalMember(owner = "client!oo", name = "e", descriptor = "I")
    public static int field9055;

    @OriginalMember(owner = "client!oo", name = "i", descriptor = "I")
    public static int field9059;

    @OriginalMember(owner = "client!oo", name = "k", descriptor = "I")
    public static int field9061;

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(B)V", line = 4)
    public final void method3673(byte arg0) {
        class43 var2 = this.field9060;
        synchronized (this.field9060) {
            this.field9060.method273(arg0 ^ 0x64);
        }
        if (arg0 == 26) {
            field9061++;
        }
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(I)V", line = 17)
    public static void method3674(int arg0) {
        field9058 = null;
        if (arg0 != -32512) {
            method3674(-93);
        }
        field9056 = null;
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(Lha;I)V", line = 35)
    public static final void method3675(class66 arg0, int arg1) {
        field9053++;
        int var2 = 0;
        int var3 = 0;
        if (class618.field8597) {
            var2 = class146.method1175(-29909);
            var3 = class605.method3435((byte) -98);
        }
        int var4 = -10660793;
        class276.method1778(arg0, 16, -16777216, var4, class326.field4452, class776.field10712, class207.field3113 + var3, class480.field6479 + var2);
        class557.field7861.method598(class207.field3113 + var3 + 14, var4, -1, class641.field8842.method3566((byte) 101, class464.field6309), class480.field6479 + var2 + 3, (byte) -19);
        int var5 = class420.field5727.method1326((byte) -87) + var2;
        int var6 = class420.field5727.method1319((byte) 126) + var3;
        if (class11.field181) {
            int var10 = 0;
            for (class606 var11 = (class606) class142.field2405.method1951(arg1 ^ 0xD4DBD656); var11 != null; var11 = (class606) class142.field2405.method1946(arg1 ^ 0xFFFFCEA4)) {
                int var15 = var3 + class207.field3113 - (-(var10 * 16) - 31);
                var10++;
                if (var11.field8457 == 1) {
                    class614.method3478((class534) var11.field8460.field4189.field7006, class326.field4452, class776.field10712, class207.field3113 + var3, -1, -119, class480.field6479 + var2, -256, var5, var6, arg0, var15);
                } else {
                    class269.method1750(var6, class207.field3113 + var3, var15, var5, var11, -1, 127, class776.field10712, class326.field4452, arg0, class480.field6479 + var2, -256);
                }
            }
            if (class426.field5815 != null) {
                class276.method1778(arg0, 16, -16777216, var4, class119.field2183, class424.field5808, class429.field5856, class396.field5471);
                class557.field7861.method598(class429.field5856 + 14, var4, -1, class426.field5815.field8462, class396.field5471 + 3, (byte) -19);
                int var12 = 0;
                for (class534 var13 = (class534) class426.field5815.field8460.method1951(-723780560); var13 != null; var13 = (class534) class426.field5815.field8460.method1946(-6974)) {
                    int var14 = class429.field5856 + (var12 * 16) + 31;
                    class614.method3478(var13, class119.field2183, class424.field5808, class429.field5856, -1, 51, class396.field5471, -256, var5, var6, arg0, var14);
                    var12++;
                }
                class257.method1678(class119.field2183, class396.field5471, (byte) -112, class429.field5856, class424.field5808);
            }
        } else {
            int var7 = 0;
            for (class534 var8 = (class534) class208.field3119.method3589((byte) -128); var8 != null; var8 = (class534) class208.field3119.method3591(0)) {
                int var9 = (class690.field9574 - var7 - 1) * 16 + var3 + class207.field3113 + 31;
                class614.method3478(var8, class326.field4452, class776.field10712, class207.field3113 + var3, -1, -121, class480.field6479 + var2, -256, var5, var6, arg0, var9);
                var7++;
            }
        }
        class257.method1678(class326.field4452, class480.field6479 + var2, (byte) -123, class207.field3113 + var3, class776.field10712);
        if (arg1 != 10854) {
            method3674(113);
        }
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(ZLha;Lgj;)V", line = 128)
    public static final void method3676(boolean arg0, class66 arg1, class662 arg2) {
        field9051++;
        class49[] var3 = class49.method373(arg2, class393.field5397, 0);
        class407.field5584 = new class604[var3.length];
        for (int var4 = 0; var4 < var3.length; var4++) {
            class407.field5584[var4] = arg1.method498(var3[var4], true);
        }
        class49[] var5 = class49.method373(arg2, class271.field3795, 0);
        class350.field4695 = new class604[var5.length];
        for (int var6 = 0; var6 < var5.length; var6++) {
            class350.field4695[var6] = arg1.method498(var5[var6], true);
        }
        class49[] var7 = class49.method373(arg2, class433.field5894, 0);
        class759.field10456 = new class604[var7.length];
        for (int var8 = 0; var8 < var7.length; var8++) {
            class759.field10456[var8] = arg1.method498(var7[var8], true);
        }
        class49[] var9 = class49.method373(arg2, class538.field7315, 0);
        class309.field4220 = new class604[var9.length];
        for (int var10 = 0; var10 < var9.length; var10++) {
            class309.field4220[var10] = arg1.method498(var9[var10], true);
        }
        class49[] var11 = class49.method373(arg2, class252.field3537, 0);
        class62.field857 = new class604[var11.length];
        for (int var12 = 0; var12 < var11.length; var12++) {
            class62.field857[var12] = arg1.method498(var11[var12], true);
        }
        class49[] var13 = class49.method373(arg2, class60.field832, 0);
        class18.field424 = new class604[var13.length];
        for (int var14 = 0; var14 < var13.length; var14++) {
            class18.field424[var14] = arg1.method498(var13[var14], true);
        }
        class49[] var15 = class49.method373(arg2, class636.field8787, 0);
        class724.field9959 = new class604[var15.length];
        for (int var16 = 0; var16 < var15.length; var16++) {
            class724.field9959[var16] = arg1.method498(var15[var16], true);
        }
        class49[] var17 = class49.method373(arg2, class256.field3598, 0);
        class521.field7068 = new class604[var17.length];
        for (int var18 = 0; var18 < var17.length; var18++) {
            class521.field7068[var18] = arg1.method498(var17[var18], true);
        }
        class49[] var19 = class49.method373(arg2, class629.field8746, 0);
        class761.field10487 = new class604[var19.length];
        for (int var20 = 0; var20 < var19.length; var20++) {
            class761.field10487[var20] = arg1.method498(var19[var20], true);
        }
        class49[] var21 = class49.method373(arg2, class766.field10573, 0);
        class766.field10566 = new class604[var21.length];
        for (int var22 = 0; var22 < var21.length; var22++) {
            class766.field10566[var22] = arg1.method498(var21[var22], true);
        }
        class49[] var23 = class49.method373(arg2, class173.field2759, 0);
        class8.field161 = new class604[var23.length];
        for (int var24 = 0; var24 < var23.length; var24++) {
            class8.field161[var24] = arg1.method498(var23[var24], true);
        }
        class49[] var25 = class49.method373(arg2, class45.field697, 0);
        class70.field1037 = new class604[var25.length];
        for (int var26 = 0; var26 < var25.length; var26++) {
            class70.field1037[var26] = arg1.method498(var25[var26], true);
        }
        class783.field10756 = arg1.method498(class49.method366(arg2, class38.field640, 0), true);
        class467.field6329 = arg1.method498(class49.method366(arg2, class492.field6721, 0), arg0);
        class49[] var27 = class49.method373(arg2, class628.field8734, 0);
        class259.field3631 = new class604[var27.length];
        for (int var28 = 0; var28 < var27.length; var28++) {
            class259.field3631[var28] = arg1.method498(var27[var28], true);
        }
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(II)Lcj;", line = 255)
    public final class722 method3677(int arg0, int arg1) {
        field9054++;
        class43 var3 = this.field9060;
        class722 var4;
        synchronized (this.field9060) {
            var4 = (class722) this.field9060.method266((byte) -98, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class662 var5 = this.field9057;
        byte[] var6;
        synchronized (this.field9057) {
            var6 = this.field9057.method3732(arg1, 8906, 35);
            if (arg0 != -7533) {
                method3675(null, 106);
            }
        }
        class722 var7 = new class722();
        if (var6 != null) {
            var7.method3997(new class93(var6), (byte) -36);
        }
        var7.method3998((byte) 91);
        class43 var8 = this.field9060;
        synchronized (this.field9060) {
            this.field9060.method270(var7, (long) arg1, -126);
            return var7;
        }
    }

    @OriginalMember(owner = "client!oo", name = "b", descriptor = "(II)V", line = 289)
    public final void method3678(int arg0, int arg1) {
        class43 var3 = this.field9060;
        synchronized (this.field9060) {
            if (arg1 <= 125) {
                field9058 = null;
            }
            this.field9060.method265(arg0, -89);
        }
        field9052++;
    }

    @OriginalMember(owner = "client!oo", name = "b", descriptor = "(I)V", line = 307)
    public final void method3679(int arg0) {
        class43 var2 = this.field9060;
        synchronized (this.field9060) {
            this.field9060.method272(20);
            if (arg0 != 0) {
                this.method3673((byte) -52);
            }
        }
        field9059++;
    }

    @OriginalMember(owner = "client!oo", name = "<init>", descriptor = "(Lim;ILgj;)V", line = 326)
    public class654(class598 arg0, int arg1, class662 arg2) {
        this.field9057 = arg2;
        if (this.field9057 != null) {
            this.field9057.method3730((byte) 77, 35);
        }
    }
}
