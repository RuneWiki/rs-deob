import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!afa")
public class class365 {

    @OriginalMember(owner = "client!afa", name = "a", descriptor = "I")
    public static int field4953;

    @OriginalMember(owner = "client!afa", name = "b", descriptor = "I")
    public static int field4954;

    @OriginalMember(owner = "client!afa", name = "c", descriptor = "I")
    public static int field4955;

    @OriginalMember(owner = "client!afa", name = "e", descriptor = "I")
    public static int field4957;

    @OriginalMember(owner = "client!afa", name = "f", descriptor = "Lgj;")
    public static class662 field4958;

    @OriginalMember(owner = "client!afa", name = "d", descriptor = "[I")
    public static int[] field4956;

    @OriginalMember(owner = "client!afa", name = "a", descriptor = "(B)V", line = 3)
    public static void method2225(byte arg0) {
        field4958 = null;
        field4956 = null;
        if (arg0 >= -38) {
            method2225((byte) -19);
        }
    }

    @OriginalMember(owner = "client!afa", name = "a", descriptor = "(Z)V", line = 14)
    public static final void method2226(boolean arg0) {
        field4953++;
        if (class626.field8724) {
            return;
        }
        class626.field8724 = true;
        if (!arg0) {
            class429.field5846 = true;
            class58.field809 += (-24.0F - class58.field809) / 2.0F;
        }
    }

    @OriginalMember(owner = "client!afa", name = "a", descriptor = "(Lkh;ILjava/lang/String;Lda;Laa;IBIILkc;II)V", line = 34)
    public static final void method2227(class17 arg0, int arg1, String arg2, class67 arg3, class514 arg4, int arg5, byte arg6, int arg7, int arg8, class145 arg9, int arg10, int arg11) {
        if (arg6 != -93) {
            method2226(false);
        }
        field4957++;
        int var12;
        if (class536.field7291 == 4) {
            var12 = (int) class53.field763 & 0x3FFF;
        } else {
            var12 = (int) class53.field763 + class408.field5599 & 0x3FFF;
        }
        int var13 = Math.max(arg0.field347 / 2, arg0.field330 / 2) + 10;
        int var14 = arg7 * arg7 + arg10 * arg10;
        if ((var13 * var13) < var14) {
            return;
        }
        int var15 = class191.field2937[var12];
        int var16 = class191.field2936[var12];
        if (class536.field7291 != 4) {
            var15 = var15 * 256 / (class301.field4140 + 256);
            var16 = var16 * 256 / (class301.field4140 + 256);
        }
        int var17 = arg7 * var16 + arg10 * var15 >> 14;
        int var18 = arg10 * var16 - (arg7 * var15) >> 14;
        int var19 = arg9.method1166((byte) 118, 100, null, arg2);
        int var20 = arg9.method1165(null, 0, arg2, arg6 + 93, 100);
        int var21 = var17 - var19 / 2;
        if (-arg0.field347 <= var21 && var21 <= arg0.field347 && (-arg0.field330) <= var18 && arg0.field330 >= var18) {
            arg3.method599((byte) 106, arg2, arg11 + arg0.field330 / 2 - var20 - arg5 - var18, 1, var19, arg4, arg1, arg11, 0, 50, 0, 0, null, null, var21 + (arg0.field347 / 2) + arg1, arg8);
        }
    }

    @OriginalMember(owner = "client!afa", name = "a", descriptor = "(IIII)V", line = 83)
    public static final void method2228(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg0 << 3;
        int var5 = arg3 << 3;
        if (arg1 != 1) {
            field4958 = null;
        }
        field4954++;
        int var6 = arg2 << 3;
        if (class536.field7291 == 2) {
            class460.field6249 = var5;
            class255.field3585 = var4;
            class463.field6307 = var6;
        }
        class53.field763 = var5;
        class43.field682 = var4;
        class559.method3245((byte) 127);
        class429.field5846 = true;
    }

    @OriginalMember(owner = "client!afa", name = "a", descriptor = "()V", line = 113)
    public static final void method2229() {
        for (int var0 = class70.field1028; var0 < class62.field856; var0++) {
            for (int var1 = 0; var1 < class441.field5980; var1++) {
                for (int var2 = 0; var2 < class375.field5083; var2++) {
                    class549 var3 = class325.field4448[var0][var1][var2];
                    if (var3 != null) {
                        class373 var4 = var3.field7462;
                        class373 var5 = var3.field7463;
                        if (var4 != null && var4.method904(0)) {
                            class344.method2131(var4, var0, var1, var2, 1, 1);
                            if (var5 != null && var5.method904(0)) {
                                class344.method2131(var5, var0, var1, var2, 1, 1);
                                var5.method903(class112.field2107, var4, 0, 0, (byte) 90, false, 0);
                                var5.method905(-16665);
                            }
                            var4.method905(-16665);
                        }
                        for (class58 var6 = var3.field7466; var6 != null; var6 = var6.field811) {
                            class597 var8 = var6.field815;
                            if (var8 != null && var8.method904(0)) {
                                class344.method2131(var8, var0, var1, var2, var8.field8372 + 1 - var8.field8368, var8.field8365 - var8.field8369 + 1);
                                var8.method905(-16665);
                            }
                        }
                        class436 var7 = var3.field7471;
                        if (var7 != null && var7.method904(0)) {
                            class197.method1424(var7, var0, var1, var2);
                            var7.method905(-16665);
                        }
                    }
                }
            }
        }
    }
}
