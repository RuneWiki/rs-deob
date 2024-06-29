import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dr")
public class class671 {

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "[Lhb;")
    public static class677[] field9407 = new class677[2048];

    @OriginalMember(owner = "client!dr", name = "l", descriptor = "Lem;")
    public static class206 field9418 = new class206(6, -1);

    @OriginalMember(owner = "client!dr", name = "m", descriptor = "I")
    public static int field9419 = 0;

    @OriginalMember(owner = "client!dr", name = "b", descriptor = "I")
    public static int field9408;

    @OriginalMember(owner = "client!dr", name = "d", descriptor = "I")
    public static int field9410;

    @OriginalMember(owner = "client!dr", name = "e", descriptor = "I")
    public int field9411;

    @OriginalMember(owner = "client!dr", name = "f", descriptor = "I")
    public int field9412;

    @OriginalMember(owner = "client!dr", name = "g", descriptor = "I")
    public int field9413;

    @OriginalMember(owner = "client!dr", name = "i", descriptor = "I")
    public static int field9415;

    @OriginalMember(owner = "client!dr", name = "j", descriptor = "I")
    public static int field9416;

    @OriginalMember(owner = "client!dr", name = "k", descriptor = "I")
    public static int field9417;

    @OriginalMember(owner = "client!dr", name = "h", descriptor = "Z")
    public boolean field9414;

    @OriginalMember(owner = "client!dr", name = "c", descriptor = "[Lf;")
    public static class702[] field9409;

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(B)V")
    public static void method3785(byte arg0) {
        if (arg0 == 96) {
            field9409 = null;
            field9418 = null;
            field9407 = null;
        }
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method3786(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field9415++;
        int var8 = arg6 - arg3;
        int var9 = arg4 + arg3;
        if (arg7 != -21468) {
            method3787((byte) 8, (char) 65476);
        }
        for (int var10 = arg4; var10 < var9; var10++) {
            class470.method2660(arg1, arg2, class344.field4599[var10], (byte) 11, arg0);
        }
        for (int var11 = arg6; var11 > var8; var11--) {
            class470.method2660(arg1, arg2, class344.field4599[var11], (byte) 11, arg0);
        }
        int var12 = arg1 + arg3;
        int var13 = arg2 - arg3;
        for (int var14 = var9; var14 <= var8; var14++) {
            int[] var15 = class344.field4599[var14];
            class470.method2660(arg1, var12, var15, (byte) 11, arg0);
            class470.method2660(var12, var13, var15, (byte) 11, arg5);
            class470.method2660(var13, arg2, var15, (byte) 11, arg0);
        }
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(BC)C")
    public static final char method3787(byte arg0, char arg1) {
        field9417++;
        if (arg1 == 'Æ') {
            return 'E';
        } else if (arg1 == 'æ') {
            return 'e';
        } else if (arg1 == 'ß') {
            return 's';
        } else if (arg0 != -77) {
            return (char) 65495;
        } else if (arg1 == 'Œ') {
            return 'E';
        } else {
            return (char) (arg1 == 'œ' ? 'e' : '\u0000');
        }
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(I)V")
    public static final void method3788(int arg0) {
        if (arg0 != 25298) {
            field9409 = null;
        }
        field9408++;
        if (class390.field5522 != -1) {
            class163.method1145(-109, class390.field5522, -1, -1, false);
            class390.field5522 = -1;
        }
    }

    @OriginalMember(owner = "client!dr", name = "b", descriptor = "(B)V")
    public static final void method3789(byte arg0) {
        field9410++;
        if (class268.field3626 == null) {
            class268.field3626 = class543.method3064(false);
            class296.field4059 = class268.field3626[0];
            class423.field5954 = class577.method3295((byte) 15);
        }
        if (class618.field8608 == null) {
            class607.method3414(true);
        }
        if (arg0 <= 48) {
            return;
        }
        class543 var1 = class296.field4059;
        int var2 = class465.method2623(91);
        if (class296.field4059 == var1) {
            class265.field3590 = class296.field4059.field7349.method555(class697.field9900, true);
            if (class296.field4059.field7347) {
                class699.field9914 = class296.field4059.field7344 + ((class296.field4059.field7352 - class296.field4059.field7344) * var2 / 100);
            }
            if (class296.field4059.field7340) {
                class265.field3590 = class265.field3590 + class699.field9914 + "%";
            }
        } else if (class543.field7373 == class296.field4059) {
            class618.field8608 = null;
            class178.method1232(3, (byte) -94);
        } else {
            class265.field3590 = var1.field7343.method555(class697.field9900, true);
            class699.field9914 = var1.field7352;
            if (class296.field4059.field7340) {
                class265.field3590 = class265.field3590 + var1.field7352 + "%";
            }
            if (class296.field4059.field7347 || var1.field7347) {
                class423.field5954 = class577.method3295((byte) 15);
            }
        }
        if (class618.field8608 == null) {
            return;
        }
        class618.field8608.method278(class423.field5954, class265.field3590, class699.field9914, 4309, class296.field4059);
        if (class610.field8464 == null) {
            return;
        }
        for (int var3 = class550.field7439 + 1; var3 < class610.field8464.length; var3++) {
            if (class610.field8464[var3].method2152(true) >= 100 && var3 - 1 == class550.field7439 && class285.field3921 >= 1 && class618.field8608.method267((byte) 72)) {
                try {
                    class610.field8464[var3].method2151((byte) 11);
                } catch (Exception var4) {
                    class610.field8464 = null;
                    return;
                }
                class618.field8608.method275(-26446, class610.field8464[var3]);
                class550.field7439++;
                if ((class610.field8464.length - 1) <= class550.field7439 && class610.field8464.length > 1) {
                    class550.field7439 = class674.field9525.method1342(924) ? 0 : -1;
                }
            }
        }
        return;
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(III)Z")
    public static final boolean method3790(int arg0, int arg1, int arg2) {
        field9416++;
        if (arg0 != -1) {
            method3790(-3, -43, 126);
        }
        return (arg1 & 0x10) != 0;
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "()V")
    public static final void method3791() {
        for (int var0 = class360.field4750; var0 < class107.field1493; var0++) {
            for (int var1 = 0; var1 < class335.field4511; var1++) {
                for (int var2 = 0; var2 < class643.field8878; var2++) {
                    class390 var3 = class295.field4051[var0][var1][var2];
                    if (var3 != null) {
                        class201 var4 = var3.field5525;
                        class201 var5 = var3.field5529;
                        if (var4 != null && var4.method215(111)) {
                            class241.method1502(var4, var0, var1, var2, 1, 1);
                            if (var5 != null && var5.method215(126)) {
                                class241.method1502(var5, var0, var1, var2, 1, 1);
                                var5.method223(var4, 0, 0, false, class401.field5619, 0, 0);
                                var5.method227(-128);
                            }
                            var4.method227(-119);
                        }
                        for (class467 var6 = var3.field5536; var6 != null; var6 = var6.field6421) {
                            class210 var8 = var6.field6419;
                            if (var8 != null && var8.method215(80)) {
                                class241.method1502(var8, var0, var1, var2, var8.field2973 + 1 - var8.field2972, var8.field2969 - var8.field2963 + 1);
                                var8.method227(-128);
                            }
                        }
                        class457 var7 = var3.field5524;
                        if (var7 != null && var7.method215(78)) {
                            class131.method931(var7, var0, var1, var2);
                            var7.method227(-128);
                        }
                    }
                }
            }
        }
    }
}
