import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oi")
public class class45 {

    @OriginalMember(owner = "client!oi", name = "j", descriptor = "Z")
    public static boolean field551 = false;

    @OriginalMember(owner = "client!oi", name = "c", descriptor = "I")
    public static int field544 = 0;

    @OriginalMember(owner = "client!oi", name = "m", descriptor = "Z")
    public static boolean field554 = false;

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "I")
    public static int field543;

    @OriginalMember(owner = "client!oi", name = "e", descriptor = "I")
    public static int field546;

    @OriginalMember(owner = "client!oi", name = "h", descriptor = "I")
    public static int field549;

    @OriginalMember(owner = "client!oi", name = "k", descriptor = "I")
    public static int field552;

    @OriginalMember(owner = "client!oi", name = "l", descriptor = "I")
    public static int field553;

    @OriginalMember(owner = "client!oi", name = "i", descriptor = "Lgp;")
    public static class31 field550;

    @OriginalMember(owner = "client!oi", name = "d", descriptor = "Lra;")
    public static class57 field545;

    @OriginalMember(owner = "client!oi", name = "g", descriptor = "[Lkh;")
    public static class11[] field548;

    @OriginalMember(owner = "client!oi", name = "f", descriptor = "[Lsf;")
    public static class306[] field547;

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "[Z")
    public static boolean[] field542;

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(I)V", line = 3)
    public static void method283(int arg0) {
        field550 = null;
        field542 = null;
        if (arg0 != 18943) {
            method285(32, 96, false, -55);
        }
        field545 = null;
        field548 = null;
        field547 = null;
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(B)V", line = 31)
    public static final void method284(byte arg0) {
        field553++;
        class249.field3379.method813((byte) -35);
        int var1 = class249.field3379.method817(-120, 8);
        if (class426.field6168 > var1) {
            for (int var2 = var1; var2 < class426.field6168; var2++) {
                class99.field1113[class305.field4362++] = class201.field2770[var2];
            }
        }
        if (class426.field6168 < var1) {
            throw new RuntimeException("gnpov1");
        }
        class426.field6168 = 0;
        int var3 = -43 % ((arg0 - 33) / 42);
        for (int var4 = 0; var4 < var1; var4++) {
            int var5 = class201.field2770[var4];
            class358 var6 = class81.field917[var5];
            int var7 = class249.field3379.method817(-119, 1);
            if (var7 == 0) {
                class201.field2770[class426.field6168++] = var5;
                var6.field6320 = class221.field3033;
            } else {
                int var8 = class249.field3379.method817(-126, 2);
                if (var8 == 0) {
                    class201.field2770[class426.field6168++] = var5;
                    var6.field6320 = class221.field3033;
                    class204.field2798[class189.field2578++] = var5;
                } else if (var8 == 1) {
                    class201.field2770[class426.field6168++] = var5;
                    var6.field6320 = class221.field3033;
                    int var9 = class249.field3379.method817(-116, 3);
                    var6.method2694(1, var9, (byte) -127);
                    int var10 = class249.field3379.method817(-115, 1);
                    if (var10 == 1) {
                        class204.field2798[class189.field2578++] = var5;
                    }
                } else if (var8 == 2) {
                    class201.field2770[class426.field6168++] = var5;
                    var6.field6320 = class221.field3033;
                    if (class249.field3379.method817(-124, 1) == 1) {
                        int var11 = class249.field3379.method817(-122, 3);
                        var6.method2694(2, var11, (byte) -127);
                        int var12 = class249.field3379.method817(-113, 3);
                        var6.method2694(2, var12, (byte) -127);
                    } else {
                        int var13 = class249.field3379.method817(95, 3);
                        var6.method2694(0, var13, (byte) -127);
                    }
                    int var14 = class249.field3379.method817(124, 1);
                    if (var14 == 1) {
                        class204.field2798[class189.field2578++] = var5;
                    }
                } else if (var8 == 3) {
                    class99.field1113[class305.field4362++] = var5;
                }
            }
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(IIZI)V", line = 141)
    public static final void method285(int arg0, int arg1, boolean arg2, int arg3) {
        field546++;
        if (arg0 < 8000 || arg0 > 48000) {
            throw new IllegalArgumentException();
        }
        class118.field1409 = arg1;
        class134.field1882 = arg2;
        if (arg3 != 48000) {
            field548 = null;
        }
        class233.field3158 = arg0;
    }

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "(I)V", line = 162)
    public static final void method286(int arg0) {
        class331 var1 = class193.field2629;
        synchronized (class193.field2629) {
            class193.field2629.method2043(-22);
        }
        if (arg0 >= 40) {
            field552++;
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(Z)V", line = 183)
    public static final void method287(boolean arg0) {
        if (arg0) {
            method285(124, -11, true, 113);
        }
        field543++;
        class331 var1 = class140.field1983;
        synchronized (class140.field1983) {
            class140.field1983.method2043(-120);
        }
    }

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "(B)V", line = 199)
    public static final void method288(byte arg0) {
        class315.field4487 = class268.field3775.field3912 + class268.field3775.field3906 + 2;
        field549++;
        class7.field89 = class1.field1.field3912 + class1.field1.field3906 + 2;
        class133.field1857 = new String[350 / class7.field89];
        if (arg0 >= 72) {
            for (int var1 = 0; var1 < class133.field1857.length; var1++) {
                class133.field1857[var1] = "";
            }
        }
    }
}
