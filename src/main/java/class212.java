import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ti")
public class class212 implements Runnable {

    @OriginalMember(owner = "client!ti", name = "k", descriptor = "[Ltf;")
    public volatile class246[] field3759 = new class246[2];

    @OriginalMember(owner = "client!ti", name = "i", descriptor = "Z")
    public volatile boolean field3757 = false;

    @OriginalMember(owner = "client!ti", name = "h", descriptor = "Z")
    public volatile boolean field3756 = false;

    @OriginalMember(owner = "client!ti", name = "g", descriptor = "Ltb;")
    public static class210 field3755 = new class210(64);

    @OriginalMember(owner = "client!ti", name = "j", descriptor = "I")
    public static int field3758 = 0;

    @OriginalMember(owner = "client!ti", name = "p", descriptor = "Lmh;")
    public static class128 field3764 = class22.method156(124, "blinken3:");

    @OriginalMember(owner = "client!ti", name = "l", descriptor = "J")
    public static long field3760 = 0L;

    @OriginalMember(owner = "client!ti", name = "o", descriptor = "Lmh;")
    public static class128 field3763 = class22.method156(124, "Spieler kann nicht gefunden werden: ");

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "I")
    public static int field3749;

    @OriginalMember(owner = "client!ti", name = "b", descriptor = "I")
    public static int field3750;

    @OriginalMember(owner = "client!ti", name = "d", descriptor = "I")
    public static int field3752;

    @OriginalMember(owner = "client!ti", name = "e", descriptor = "I")
    public static int field3753;

    @OriginalMember(owner = "client!ti", name = "f", descriptor = "I")
    public static int field3754;

    @OriginalMember(owner = "client!ti", name = "n", descriptor = "I")
    public static int field3762;

    @OriginalMember(owner = "client!ti", name = "q", descriptor = "I")
    public static int field3765;

    @OriginalMember(owner = "client!ti", name = "c", descriptor = "Lcb;")
    public class270 field3751;

    @OriginalMember(owner = "client!ti", name = "m", descriptor = "[I")
    public static int[] field3761;

    @OriginalMember(owner = "client!ti", name = "run", descriptor = "()V", line = 7)
    public final void run() {
        field3750++;
        this.field3756 = true;
        try {
            while (!this.field3757) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class246 var2 = this.field3759[var1];
                    if (var2 != null) {
                        var2.method1680(-30144);
                    }
                }
                class177.method1213(0, 10L);
                class295.method2016(0, this.field3751, (Object) null);
            }
        } catch (Exception var7) {
            class79.method506((byte) -51, (String) null, var7);
        } finally {
            this.field3756 = false;
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(Lmh;ILmh;I)V", line = 47)
    public static final void method1456(class128 arg0, int arg1, class128 arg2, int arg3) {
        field3765++;
        class107.method657(false, arg0, (class128) null, -1, arg3, arg2);
        if (arg1 != 1) {
            method1458((byte) -11);
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(I)V", line = 64)
    public static final void method1457(int arg0) {
        field3753++;
        class54.field1051.method567(8);
        int var1 = class54.field1051.method564((byte) -76, 8);
        if (class37.field749 > var1) {
            for (int var2 = var1; var2 < class37.field749; var2++) {
                class207.field3637[class8.field188++] = class39.field839[var2];
            }
        }
        if (var1 > class37.field749) {
            throw new RuntimeException("gnpov1");
        }
        class37.field749 = 0;
        if (arg0 != 64) {
            field3755 = (class210) null;
        }
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = class39.field839[var3];
            class115 var5 = class201.field3560[var4];
            int var6 = class54.field1051.method564((byte) -110, 1);
            if (var6 == 0) {
                class39.field839[class37.field749++] = var4;
                var5.field477 = class293.field5011;
            } else {
                int var7 = class54.field1051.method564((byte) -87, 2);
                if (var7 == 0) {
                    class39.field839[class37.field749++] = var4;
                    var5.field477 = class293.field5011;
                    class158.field2715[class314.field5335++] = var4;
                } else if (var7 == 1) {
                    class39.field839[class37.field749++] = var4;
                    var5.field477 = class293.field5011;
                    int var8 = class54.field1051.method564((byte) -98, 3);
                    var5.method121(false, var8, true);
                    int var9 = class54.field1051.method564((byte) -100, 1);
                    if (var9 == 1) {
                        class158.field2715[class314.field5335++] = var4;
                    }
                } else if (var7 == 2) {
                    class39.field839[class37.field749++] = var4;
                    var5.field477 = class293.field5011;
                    int var10 = class54.field1051.method564((byte) -94, 3);
                    var5.method121(true, var10, true);
                    int var11 = class54.field1051.method564((byte) -93, 3);
                    var5.method121(true, var11, true);
                    int var12 = class54.field1051.method564((byte) -86, 1);
                    if (var12 == 1) {
                        class158.field2715[class314.field5335++] = var4;
                    }
                } else if (var7 == 3) {
                    class207.field3637[class8.field188++] = var4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(B)V", line = 169)
    public static final void method1458(byte arg0) {
        if (arg0 > -88) {
            method1457(-67);
        }
        field3749++;
        class37.field744.method1832((byte) 70);
        class189.field3288.method1832((byte) 101);
        class169.field2936.method1832((byte) 108);
    }

    @OriginalMember(owner = "client!ti", name = "b", descriptor = "(I)V", line = 195)
    public static void method1459(int arg0) {
        field3764 = null;
        field3763 = null;
        int var1 = -98 % ((arg0 + 72) / 44);
        field3755 = null;
        field3761 = null;
    }
}
