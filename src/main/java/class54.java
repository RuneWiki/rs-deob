import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ij")
public class class54 {

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "Luj;")
    public static class156 field859 = new class156();

    @OriginalMember(owner = "client!ij", name = "g", descriptor = "I")
    public static int field865 = 0;

    @OriginalMember(owner = "client!ij", name = "h", descriptor = "Z")
    public static boolean field866 = false;

    @OriginalMember(owner = "client!ij", name = "i", descriptor = "I")
    public static int field867 = 0;

    @OriginalMember(owner = "client!ij", name = "b", descriptor = "I")
    public static int field860;

    @OriginalMember(owner = "client!ij", name = "c", descriptor = "I")
    public static int field861;

    @OriginalMember(owner = "client!ij", name = "d", descriptor = "I")
    public static int field862;

    @OriginalMember(owner = "client!ij", name = "e", descriptor = "I")
    public static int field863;

    @OriginalMember(owner = "client!ij", name = "f", descriptor = "I")
    public static int field864;

    @OriginalMember(owner = "client!ij", name = "j", descriptor = "I")
    public static int field868;

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "([IIIIII)V", line = 5)
    public static final void method399(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class104 var6 = class150.field2390[arg3][arg4][arg5];
        if (var6 == null) {
            return;
        }
        class37 var7 = var6.field1605;
        if (var7 != null) {
            int var8 = var7.field557;
            if (var8 != 0) {
                for (int var9 = 0; var9 < 4; var9++) {
                    arg0[arg1] = var8;
                    arg0[arg1 + 1] = var8;
                    arg0[arg1 + 2] = var8;
                    arg0[arg1 + 3] = var8;
                    arg1 += arg2;
                }
            }
            return;
        }
        class41 var10 = var6.field1594;
        if (var10 == null) {
            return;
        }
        int var11 = var10.field609;
        int var12 = var10.field613;
        int var13 = var10.field608;
        int var14 = var10.field625;
        int[] var15 = class67.field1040[var11];
        int[] var16 = class222.field3577[var12];
        int var17 = 0;
        if (var13 != 0) {
            for (int var18 = 0; var18 < 4; var18++) {
                arg0[arg1] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 1] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 2] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 3] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg1 += arg2;
            }
            return;
        }
        for (int var19 = 0; var19 < 4; var19++) {
            if (var15[var16[var17++]] != 0) {
                arg0[arg1] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 1] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 2] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 3] = var14;
            }
            arg1 += arg2;
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(III)V", line = 111)
    public static final void method400(int arg0, int arg1, int arg2) {
        field863++;
        class156 var3 = class240.field3841[class10.field189][arg0][arg1];
        if (var3 == null) {
            class103.method679(class10.field189, arg0, arg1);
            return;
        }
        int var4 = -99999999;
        if (arg2 != 9807) {
            return;
        }
        class155 var5 = (class155) var3.method995(1836596936);
        class155 var6 = null;
        while (var5 != null) {
            class262 var7 = class205.method1296((byte) -118, var5.field2476.field4117);
            int var8 = var7.field4270;
            if (var7.field4201 == 1) {
                var8 = (var5.field2476.field4111 + 1) * var8;
            }
            if (var8 > var4) {
                var6 = var5;
                var4 = var8;
            }
            var5 = (class155) var3.method996(0);
        }
        if (var6 == null) {
            class103.method679(class10.field189, arg0, arg1);
            return;
        }
        var3.method1003(arg2 - 9690, var6);
        class256 var9 = null;
        class256 var10 = null;
        for (class155 var11 = (class155) var3.method995(1836596936); var11 != null; var11 = (class155) var3.method996(0)) {
            class256 var12 = var11.field2476;
            if (var6.field2476.field4117 != var12.field4117) {
                if (var9 == null) {
                    var9 = var12;
                }
                if (var9.field4117 != var12.field4117 && var10 == null) {
                    var10 = var12;
                }
            }
        }
        long var13 = (long) ((arg1 << 7) + (arg0 + 1610612736));
        class65.method483(class10.field189, arg0, arg1, class207.method1304(class10.field189, (byte) 97, arg0 * 128 + 64, arg1 * 128 + 64), var6.field2476, var13, var9, var10);
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(BLck;ILck;)V", line = 188)
    public static final void method401(byte arg0, class119 arg1, int arg2, class119 arg3) {
        field864++;
        if (arg0 >= -100) {
            field859 = (class156) null;
        }
        class24.method184(120, arg1, arg2, arg3, (class119) null, -1);
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(B)V", line = 200)
    public static void method402(byte arg0) {
        field859 = null;
        if (arg0 < 50) {
            field868 = 100;
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(BIIII)I", line = 249)
    public static final int method403(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = arg2 & 0xF;
        int var6 = var5 < 4 ? arg4 : (var5 == 12 || var5 == 14 ? arg1 : arg3);
        field860++;
        if (arg0 >= -10) {
            field866 = true;
        }
        int var7 = var5 < 8 ? arg1 : arg4;
        return ((var5 & 0x2) == 0 ? var6 : -var6) + ((var5 & 0x1) == 0 ? var7 : -var7);
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(Lqh;IIZ)V", line = 271)
    public static final void method404(class163 arg0, int arg1, int arg2, boolean arg3) {
        field861++;
        if (arg3) {
            field865 = 95;
        }
        if (arg0.field4993 == arg2 && arg2 != -1) {
            class56 var4 = class276.method1818(-20682, arg2);
            int var5 = var4.field909;
            if (var5 == 1) {
                arg0.field4941 = arg1;
                arg0.field4975 = 0;
                arg0.field4959 = 0;
                arg0.field4967 = 0;
                class199.method1269(arg0.field4959, false, var4, arg0.field4991, -66, arg0.field4949);
            }
            if (var5 == 2) {
                arg0.field4967 = 0;
            }
        } else if (arg2 == -1 || arg0.field4993 == -1 || class276.method1818(-20682, arg2).field907 >= class276.method1818(-20682, arg0.field4993).field907) {
            arg0.field4993 = arg2;
            arg0.field4967 = 0;
            arg0.field4996 = arg0.field4990;
            arg0.field4975 = 0;
            arg0.field4959 = 0;
            arg0.field4941 = arg1;
            if (arg0.field4993 != -1) {
                class199.method1269(arg0.field4959, false, class276.method1818(-20682, arg0.field4993), arg0.field4991, -77, arg0.field4949);
            }
        }
    }
}
