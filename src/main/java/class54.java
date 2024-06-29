import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tk")
public class class54 {

    @OriginalMember(owner = "client!tk", name = "d", descriptor = "Ljava/lang/String;")
    public static String field788 = "Ok";

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "I")
    public static int field785;

    @OriginalMember(owner = "client!tk", name = "b", descriptor = "I")
    public static int field786;

    @OriginalMember(owner = "client!tk", name = "c", descriptor = "I")
    public static int field787;

    @OriginalMember(owner = "client!tk", name = "f", descriptor = "I")
    public static int field790;

    @OriginalMember(owner = "client!tk", name = "g", descriptor = "I")
    public static int field791;

    @OriginalMember(owner = "client!tk", name = "e", descriptor = "[[[B")
    public static byte[][][] field789;

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(I)V")
    public static final void method335(int arg0) {
        if (arg0 != 1648141766) {
            method336((class55[]) null, 127, 27, -8, 32, true, -84, -110, (byte[]) null, -17, 51);
        }
        field790++;
        class161.field2633.method1873(arg0 - 1648149167);
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "([Lkb;IIIIZII[BII)V")
    public static final void method336(class55[] arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7, byte[] arg8, int arg9, int arg10) {
        field785++;
        class274 var11 = new class274(arg8);
        int var12 = -1;
        int var13 = -23 % ((-arg3 - 52) / 33);
        while (true) {
            int var14 = var11.method1853(-2);
            if (var14 == 0) {
                return;
            }
            var12 += var14;
            int var15 = 0;
            while (true) {
                int var16 = var11.method1863((byte) -127);
                if (var16 == 0) {
                    break;
                }
                var15 += var16 - 1;
                int var17 = var15 >> 6 & 0x3F;
                int var18 = var15 & 0x3F;
                int var19 = var15 >> 12;
                int var20 = var11.method1849(255);
                int var21 = var20 >> 2;
                int var22 = var20 & 0x3;
                if (arg10 == var19 && var17 >= arg6 && var17 < (arg6 + 8) && var18 >= arg9 && arg9 + 8 > var18) {
                    class172 var23 = class49.method319(var12, 0);
                    int var24 = class288.method1988(-108, var18 & 0x7, var22, var17 & 0x7, var23.field2821, arg7, var23.field2809) + arg2;
                    int var25 = arg1 + class158.method1076(arg7, var17 & 0x7, var23.field2821, var18 & 0x7, var22, var23.field2809, 109);
                    if (var24 > 0 && var25 > 0 && var24 < 103 && var25 < 103) {
                        class55 var26 = null;
                        if (!arg5) {
                            int var27 = arg4;
                            if ((class214.field3386[1][var24][var25] & 0x2) == 2) {
                                var27 = arg4 - 1;
                            }
                            if (var27 >= 0) {
                                var26 = arg0[var27];
                            }
                        }
                        class263.method1775(arg4, var12, arg5, 104, arg4, var25, !arg5, arg7 + var22 & 0x3, var21, var26, var24);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(III)V")
    public static final void method337(int arg0, int arg1, int arg2) {
        class24.field449 = true;
        class40.field616 = arg0;
        class79.field1274 = arg1;
        class23.field431 = arg2;
        class134.field2179 = -1;
        class33.field548 = -1;
    }

    @OriginalMember(owner = "client!tk", name = "b", descriptor = "(I)V")
    public static void method338(int arg0) {
        field788 = null;
        if (arg0 == 3964) {
            field789 = null;
        }
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(ILgi;)V")
    public static final void method339(int arg0, class164 arg1) {
        if (arg0 != -3841) {
            return;
        }
        field787++;
        class135.field2187 = class27.method210(arg1, -104, class205.field3304, 0);
        class119.field1880 = class27.method210(arg1, -101, class61.field878, 0);
        class300.field4926 = class27.method210(arg1, arg0 + 3738, class229.field3591, 0);
        class50.field732 = class27.method210(arg1, -101, class29.field524, 0);
        class273.field4401 = class27.method210(arg1, -107, class23.field428, 0);
        class255.field4205 = class27.method210(arg1, -118, class275.field4496, 0);
        class266.field4325 = class26.method203(0, class58.field834, arg1, false);
        class102.field1620 = class26.method203(0, class14.field291, arg1, false);
        class88.field1374 = class26.method203(0, class210.field3340, arg1, false);
        class162.field2639 = class89.method620(0, arg1, (byte) 59, class250.field4113);
        class197.field3174 = class89.method620(0, arg1, (byte) 59, class163.field2657);
        class183.field3043.method516(class197.field3174, (int[]) null);
        class207.field3313.method516(class197.field3174, (int[]) null);
        class170.field2792.method516(class197.field3174, (int[]) null);
        class67 var2 = class288.method1960(arg1, 0, -103, class163.field2652);
        var2.method443();
        class178.field2959 = var2;
        class67[] var3 = class118.method813(-126, 0, arg1, class99.field1566);
        for (int var4 = 0; var4 < var3.length; var4++) {
            var3[var4].method443();
        }
        class300.field4921 = var3;
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(BII)V")
    public static final void method340(byte arg0, int arg1, int arg2) {
        field786++;
        if (class24.field443 != arg1) {
            class221.field3486 = new int[arg1];
            for (int var3 = 0; var3 < arg1; var3++) {
                class221.field3486[var3] = (var3 << 12) / arg1;
            }
            class211.field3363 = arg1 * 32;
            class128.field2053 = arg1 - 1;
            class24.field443 = arg1;
        }
        if (class153.field2452 != arg2) {
            if (class24.field443 == arg2) {
                class259.field4254 = class221.field3486;
            } else {
                class259.field4254 = new int[arg2];
                for (int var4 = 0; var4 < arg2; var4++) {
                    class259.field4254[var4] = (var4 << 12) / arg2;
                }
            }
            class153.field2452 = arg2;
            class107.field1677 = arg2 - 1;
        }
        int var5 = -19 % ((arg0 + 3) / 52);
    }
}
