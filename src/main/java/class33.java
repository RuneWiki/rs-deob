import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public class class33 {

    @OriginalMember(owner = "client!ed", name = "c", descriptor = "Lsa;")
    public static class119 field725 = new class119(64);

    @OriginalMember(owner = "client!ed", name = "h", descriptor = "Lmb;")
    public static class84 field730 = class79.method672(true, "::qa_op_test");

    @OriginalMember(owner = "client!ed", name = "l", descriptor = "Lmb;")
    public static class84 field734 = class79.method672(true, "Verbindung mit");

    @OriginalMember(owner = "client!ed", name = "i", descriptor = "Lmb;")
    private static class84 field731 = class79.method672(true, "Attack");

    @OriginalMember(owner = "client!ed", name = "j", descriptor = "Lmb;")
    public static class84 field732 = class79.method672(true, "leuchten2:");

    @OriginalMember(owner = "client!ed", name = "g", descriptor = "Lmb;")
    public static class84 field729 = class79.method672(true, "gr-Un:");

    @OriginalMember(owner = "client!ed", name = "q", descriptor = "Lmb;")
    public static class84 field739 = class79.method672(true, "sind fehlgeschlagen)3 Bitte warten Sie 5 Minuten)1");

    @OriginalMember(owner = "client!ed", name = "r", descriptor = "Lmb;")
    public static class84 field740 = class79.method672(true, "scrollbar");

    @OriginalMember(owner = "client!ed", name = "s", descriptor = "Lmb;")
    public static class84 field741 = field731;

    @OriginalMember(owner = "client!ed", name = "n", descriptor = "Lmb;")
    private static class84 field736 = class79.method672(true, "On");

    @OriginalMember(owner = "client!ed", name = "o", descriptor = "Lmb;")
    public static class84 field737 = field736;

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "I")
    public static int field723;

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "I")
    public static int field724;

    @OriginalMember(owner = "client!ed", name = "d", descriptor = "I")
    public static int field726;

    @OriginalMember(owner = "client!ed", name = "e", descriptor = "I")
    public static int field727;

    @OriginalMember(owner = "client!ed", name = "k", descriptor = "I")
    public static int field733;

    @OriginalMember(owner = "client!ed", name = "m", descriptor = "I")
    public static int field735;

    @OriginalMember(owner = "client!ed", name = "p", descriptor = "I")
    public static int field738;

    @OriginalMember(owner = "client!ed", name = "f", descriptor = "J")
    public static long field728;

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(IZI)V")
    public static final void method239(int arg0, boolean arg1, int arg2) {
        if (arg1) {
            method241(93);
        }
        field738++;
        if (class128.field3096 != 0 && arg0 != -1) {
            class76.method653(class94.field2333, arg0, false, class128.field3096, 0, (byte) -68);
            class76.field1920 = true;
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(I)V")
    public static final void method240(int arg0) {
        if (arg0 != 162) {
            return;
        }
        field724++;
        class95 var1 = class107.field2598;
        synchronized (class107.field2598) {
            class68.field1657 = class134.field3208;
            if (class41.field930 < 0) {
                for (int var2 = 0; var2 < 112; var2++) {
                    class11.field198[var2] = false;
                }
                class41.field930 = class8.field135;
            } else {
                while (class8.field135 != class41.field930) {
                    int var3 = class106.field2568[class8.field135];
                    class8.field135 = class8.field135 + 1 & 0x7F;
                    if (var3 < 0) {
                        class11.field198[~var3] = false;
                    } else {
                        class11.field198[var3] = true;
                    }
                }
            }
            class134.field3208 = class90.field2261;
        }
    }

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "(I)V")
    public static void method241(int arg0) {
        field729 = null;
        field732 = null;
        field734 = null;
        field741 = null;
        field737 = null;
        field739 = null;
        field740 = null;
        if (arg0 != 162) {
            method242(-50);
        }
        field731 = null;
        field736 = null;
        field725 = null;
        field730 = null;
    }

    @OriginalMember(owner = "client!ed", name = "c", descriptor = "(I)V")
    public static final void method242(int arg0) {
        if (arg0 != 1) {
            method241(83);
        }
        field726++;
        class87.field2148.method765(8);
        int var1 = class87.field2148.method759(26024, 1);
        if (var1 == 0) {
            return;
        }
        int var2 = class87.field2148.method759(26024, 2);
        if (var2 == 0) {
            class125.field3033[class96.field2385++] = 2047;
        } else if (var2 == 1) {
            int var3 = class87.field2148.method759(arg0 ^ 0x65A9, 3);
            class40.field925.method1181(false, 20789, var3);
            int var4 = class87.field2148.method759(26024, 1);
            if (var4 == 1) {
                class125.field3033[class96.field2385++] = 2047;
            }
        } else if (var2 == 2) {
            int var5 = class87.field2148.method759(26024, 3);
            class40.field925.method1181(true, 20789, var5);
            int var6 = class87.field2148.method759(26024, 3);
            class40.field925.method1181(true, 20789, var6);
            int var7 = class87.field2148.method759(26024, 1);
            if (var7 == 1) {
                class125.field3033[class96.field2385++] = 2047;
            }
        } else if (var2 == 3) {
            int var8 = class87.field2148.method759(26024, 7);
            int var9 = class87.field2148.method759(26024, 1);
            class13.field251 = class87.field2148.method759(26024, 2);
            int var10 = class87.field2148.method759(26024, 1);
            if (var10 == 1) {
                class125.field3033[class96.field2385++] = 2047;
            }
            int var11 = class87.field2148.method759(26024, 7);
            class40.field925.method1184(var8, var11, var9 == 1, -25859);
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(JB)V")
    public static final void method243(long arg0, byte arg1) {
        field723++;
        if (arg0 == 0L) {
            return;
        }
        if (arg1 >= -52) {
            method240(-56);
        }
        for (int var3 = 0; var3 < class125.field3024; var3++) {
            if (class30.field710[var3] == arg0) {
                class89.field2220 = true;
                class125.field3024--;
                for (int var4 = var3; var4 < class125.field3024; var4++) {
                    class27.field646[var4] = class27.field646[var4 + 1];
                    class71.field1741[var4] = class71.field1741[var4 + 1];
                    class30.field710[var4] = class30.field710[var4 + 1];
                    class14.field270[var4] = class14.field270[var4 + 1];
                }
                class129.field3102 = class5.field100 + 1;
                class129.field3120++;
                class80.field1978.method769((byte) 48, 162);
                class80.field1978.method419(false, arg0);
                return;
            }
        }
    }
}
