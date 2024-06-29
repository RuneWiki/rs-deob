import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vs")
public class class616 extends OutputStream {

    @OriginalMember(owner = "client!vs", name = "b", descriptor = "Leba;")
    public static class550 field8525 = new class550(102, -1);

    @OriginalMember(owner = "client!vs", name = "e", descriptor = "Ltt;")
    public static class338 field8528 = new class338(78, 16);

    @OriginalMember(owner = "client!vs", name = "g", descriptor = "Ljb;")
    public static class498 field8530 = new class498();

    @OriginalMember(owner = "client!vs", name = "h", descriptor = "Lrb;")
    public static class379 field8531 = new class379("LIVE", 0);

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "I")
    public static int field8524;

    @OriginalMember(owner = "client!vs", name = "c", descriptor = "I")
    public static int field8526;

    @OriginalMember(owner = "client!vs", name = "d", descriptor = "I")
    public static int field8527;

    @OriginalMember(owner = "client!vs", name = "f", descriptor = "I")
    public static int field8529;

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(I)V", line = 3)
    public static final void method3405(int arg0) {
        if (arg0 >= -73) {
            method3405(31);
        }
        field8526++;
        if (class540.field7410) {
            return;
        }
        class363.method2120(false, class543.field7437);
        if (class631.field8736 != null) {
            class363.method2120(false, class631.field8736);
        }
        class540.field7410 = true;
    }

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(B)V", line = 28)
    public static final void method3406(byte arg0) {
        field8527++;
        class174.field2463++;
        class229 var1 = class97.method550(class71.field841, false, class469.field6332);
        var1.field2971.method915(arg0 - 31788, class702.method3945((byte) -115));
        var1.field2971.method918(arg0 + 24677, class399.field5301);
        var1.field2971.method918(24551, class60.field750);
        if (arg0 == -126) {
            var1.field2971.method915(-31914, class602.field8408.field4325);
            class307.method1805(var1, -14704);
        }
    }

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(Loea;)V", line = 46)
    public static final void method3407(class628 arg0) {
        if (class645.field8927 >= 65535) {
            return;
        }
        class392 var1 = arg0.field8687;
        class141.field1915[class645.field8927] = arg0;
        class499.field6860[class645.field8927] = false;
        class645.field8927++;
        int var2 = arg0.field8702;
        if (arg0.field8698) {
            var2 = 0;
        }
        int var3 = arg0.field8702;
        if (arg0.field8695) {
            var3 = class171.field2428 - 1;
        }
        for (int var4 = var2; var4 <= var3; var4++) {
            int var5 = 0;
            int var6 = var1.method2257(-17895) + class332.field4443 - var1.method2260(2) >> class62.field762;
            if (var6 < 0) {
                var5 -= var6;
                var6 = 0;
            }
            int var7 = var1.method2257(-17895) + var1.method2260(2) - class332.field4443 >> class62.field762;
            if (var7 >= class641.field8846) {
                var7 = class641.field8846 - 1;
            }
            for (int var8 = var6; var8 <= var7; var8++) {
                short var9 = arg0.field8696[var5++];
                int var10 = (var1.method2258((byte) -43) + class332.field4443 - var1.method2260(2) >> class62.field762) + (var9 >>> 8);
                int var11 = (var9 & 0xFF) + var10 - 1;
                if (var10 < 0) {
                    var10 = 0;
                }
                if (var11 >= class329.field4421) {
                    var11 = class329.field4421 - 1;
                }
                for (int var12 = var10; var12 <= var11; var12++) {
                    long var13 = class257.field3366[var4][var12][var8];
                    if ((var13 & 0xFFFFL) == 0L) {
                        class257.field3366[var4][var12][var8] = var13 | (long) class645.field8927;
                    } else if ((var13 & 0xFFFF0000L) == 0L) {
                        class257.field3366[var4][var12][var8] = var13 | (long) class645.field8927 << 16;
                    } else if ((var13 & 0xFFFF00000000L) == 0L) {
                        class257.field3366[var4][var12][var8] = var13 | (long) class645.field8927 << 32;
                    } else if ((var13 & 0xFFFF000000000000L) == 0L) {
                        class257.field3366[var4][var12][var8] = var13 | (long) class645.field8927 << 48;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!vs", name = "write", descriptor = "(I)V", line = 138)
    public final void write(int arg0) throws IOException {
        field8524++;
        throw new IOException();
    }

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(III)Z", line = 148)
    public static final boolean method3408(int arg0, int arg1, int arg2) {
        field8529++;
        if (arg0 != -31006) {
            method3410(-57);
        }
        return (arg1 & 0x800) != 0;
    }

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(Lrc;Z)Z", line = 160)
    public static final boolean method3409(class29 arg0, boolean arg1) {
        boolean var2 = class446.field5914 == class246.field3214;
        int var3 = 0;
        short var4 = 0;
        byte var5 = 0;
        arg0.method186(13035);
        if (arg0.field423 < 0 || arg0.field419 < 0 || arg0.field420 >= class329.field4421 || arg0.field421 >= class641.field8846) {
            return false;
        }
        short var6 = 0;
        for (int var7 = arg0.field423; var7 <= arg0.field420; var7++) {
            for (int var11 = arg0.field419; var11 <= arg0.field421; var11++) {
                class207 var12 = class549.method3077(arg0.field385, var7, var11);
                if (var12 != null) {
                    class634 var13 = class502.method2854((byte) 9, arg0);
                    class634 var14 = var12.field2774;
                    if (var14 == null) {
                        var12.field2774 = var13;
                    } else {
                        while (var14.field8764 != null) {
                            var14 = var14.field8764;
                        }
                        var14.field8764 = var13;
                    }
                    if (var2 && (class582.field7958[var7][var11] & 0xFF000000) != 0) {
                        var3 = class582.field7958[var7][var11];
                        var4 = class400.field5303[var7][var11];
                        var5 = class190.field2637[var7][var11];
                    }
                    if (!arg1 && var12.field2765 != null && var12.field2765.field3534 > var6) {
                        var6 = var12.field2765.field3534;
                    }
                }
            }
        }
        if (var2 && (var3 & 0xFF000000) != 0) {
            for (int var8 = arg0.field423; var8 <= arg0.field420; var8++) {
                for (int var9 = arg0.field419; var9 <= arg0.field421; var9++) {
                    if ((class582.field7958[var8][var9] & 0xFF000000) == 0) {
                        class582.field7958[var8][var9] = var3;
                        class400.field5303[var8][var9] = var4;
                        class190.field2637[var8][var9] = var5;
                    }
                }
            }
        }
        if (arg1) {
            class420.field5512[class392.field5241++] = arg0;
        } else {
            int var10 = class446.field5914 == class246.field3214 ? 1 : 0;
            if (!arg0.method161(28602)) {
                class100.field1206[var10][class189.field2627[var10]++] = arg0;
            } else if (arg0.method168(20071)) {
                class648.field8957[var10][class629.field8709[var10]++] = arg0;
            } else {
                class150.field2058[var10][class57.field730[var10]++] = arg0;
            }
        }
        if (arg1) {
            arg0.field388 -= var6;
        }
        return true;
    }

    @OriginalMember(owner = "client!vs", name = "b", descriptor = "(I)V", line = 278)
    public static void method3410(int arg0) {
        field8531 = null;
        int var1 = 25 / ((arg0 - 59) / 54);
        field8528 = null;
        field8525 = null;
        field8530 = null;
    }
}
