import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ak")
public abstract class class194 {

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "I")
    public int field2685;

    @OriginalMember(owner = "client!ak", name = "b", descriptor = "I")
    public int field2686;

    @OriginalMember(owner = "client!ak", name = "g", descriptor = "I")
    public int field2691;

    @OriginalMember(owner = "client!ak", name = "h", descriptor = "Leb;")
    public static class371 field2692 = new class371(new byte[5000]);

    @OriginalMember(owner = "client!ak", name = "j", descriptor = "Llr;")
    public static class448 field2694 = null;

    @OriginalMember(owner = "client!ak", name = "m", descriptor = "I")
    public static int field2697;

    @OriginalMember(owner = "client!ak", name = "c", descriptor = "I")
    public static int field2687;

    @OriginalMember(owner = "client!ak", name = "d", descriptor = "I")
    public static int field2688;

    @OriginalMember(owner = "client!ak", name = "e", descriptor = "I")
    public static int field2689;

    @OriginalMember(owner = "client!ak", name = "f", descriptor = "I")
    public static int field2690;

    @OriginalMember(owner = "client!ak", name = "i", descriptor = "I")
    public static int field2693;

    @OriginalMember(owner = "client!ak", name = "k", descriptor = "I")
    public static int field2695;

    @OriginalMember(owner = "client!ak", name = "l", descriptor = "I")
    public static int field2696;

    @OriginalMember(owner = "client!ak", name = "n", descriptor = "I")
    public static int field2698;

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(I)V")
    public static final void method1286(int arg0) {
        field2687++;
        if (class227.field3044 != null) {
            return;
        }
        int var1 = -49 % ((arg0 - 22) / 58);
        Container var2;
        if (class393.field5746 == null) {
            var2 = class204.field2772.field4888;
        } else {
            var2 = class393.field5746;
        }
        class33.field502 = var2.getSize().width;
        class358.field5043 = var2.getSize().height;
        if (class393.field5746 == var2) {
            Insets var3 = class393.field5746.getInsets();
            class33.field502 -= var3.right + var3.left;
            class358.field5043 -= var3.top + var3.bottom;
        }
        if (class162.method1075(-45) == 1) {
            class63.field985 = 0;
            class364.field5104 = (class33.field502 - 765) / 2;
            field2696 = 765;
            class243.field3359 = 503;
        } else if (class275.field3730 < 96 && class16.field205 == 0) {
            int var4 = class33.field502 > 1024 ? 1024 : class33.field502;
            int var5 = class358.field5043 > 768 ? 768 : class358.field5043;
            field2696 = var4;
            class364.field5104 = (class33.field502 - var4) / 2;
            class63.field985 = 0;
            class243.field3359 = var5;
        } else {
            class63.field985 = 0;
            class364.field5104 = 0;
            field2696 = class33.field502;
            class243.field3359 = class358.field5043;
        }
        if (class67.field1043 != 0) {
            boolean var10000;
            if (field2696 < 1024 && class243.field3359 < 768) {
                var10000 = true;
            } else {
                var10000 = false;
            }
        }
        class41.field617.setSize(field2696, class243.field3359);
        if (class408.field5920 != null) {
            class408.field5920.method1761();
        }
        if (class393.field5746 == var2) {
            Insets var6 = class393.field5746.getInsets();
            class41.field617.setLocation(class364.field5104 + var6.left, class63.field985 + var6.top);
        } else {
            class41.field617.setLocation(class364.field5104, class63.field985);
        }
        if (class230.field3089 != -1) {
            class279.method1706(0, true);
        }
        class236.method1486(-830);
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(II)Luq;")
    public static final class91 method1287(int arg0, int arg1) {
        field2688++;
        class190 var2 = class411.field5963;
        class91 var3;
        synchronized (class411.field5963) {
            var3 = (class91) class411.field5963.method1246((byte) -124, (long) arg0);
        }
        if (var3 != null) {
            return var3;
        }
        byte[] var4 = class24.field324.method1920(arg0, false, 3);
        if (arg1 != 11093) {
            method1291(52, -108, -79);
        }
        class91 var5 = new class91();
        if (var4 != null) {
            var5.method620(new class371(var4), (byte) 79);
        }
        class190 var6 = class411.field5963;
        synchronized (class411.field5963) {
            class411.field5963.method1247((long) arg0, (byte) 38, var5);
            return var5;
        }
    }

    @OriginalMember(owner = "client!ak", name = "b", descriptor = "(I)V")
    public static void method1288(int arg0) {
        field2692 = null;
        if (arg0 != 134) {
            method1288(-60);
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(BLjava/lang/String;Z)V")
    public static final void method1289(byte arg0, String arg1, boolean arg2) {
        field2698++;
        if (arg1 == null) {
            return;
        }
        if (class157.field2221 >= 100) {
            class141.method966((byte) -87, class401.field5856);
            return;
        }
        String var3 = class408.method2616(arg1, -1);
        if (arg0 < 93) {
            field2697 = 16;
        }
        if (var3 == null) {
            return;
        }
        for (int var4 = 0; var4 < class157.field2221; var4++) {
            String var8 = class408.method2616(class259.field3549[var4], -1);
            if (var8 != null && var8.equals(var3)) {
                class141.method966((byte) -93, arg1 + class61.field929);
                return;
            }
            if (class20.field258[var4] != null) {
                String var9 = class408.method2616(class20.field258[var4], -1);
                if (var9 != null && var9.equals(var3)) {
                    class141.method966((byte) 101, arg1 + class61.field929);
                    return;
                }
            }
        }
        for (int var5 = 0; var5 < class97.field1482; var5++) {
            String var6 = class408.method2616(class40.field609[var5], -1);
            if (var6 != null && var6.equals(var3)) {
                class141.method966((byte) 122, class323.field4429 + arg1 + class209.field2816);
                return;
            }
            if (class365.field5117[var5] != null) {
                String var7 = class408.method2616(class365.field5117[var5], -1);
                if (var7 != null && var7.equals(var3)) {
                    class141.method966((byte) -91, class323.field4429 + arg1 + class209.field2816);
                    return;
                }
            }
        }
        if (class408.method2616(class307.field4211.field4994, -1).equals(var3)) {
            class141.method966((byte) 88, class107.field1589);
            return;
        }
        class442.field6400.method158((byte) 7, 134);
        class214.field2845++;
        class442.field6400.method2396(class322.method2036(arg1, -49) + 1, 12450);
        class442.field6400.method2412(-125, arg1);
        class442.field6400.method2396(arg2 ? 1 : 0, 12450);
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1290(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field2689++;
        if (arg5 != -765) {
            method1288(80);
        }
        for (class368 var7 = (class368) class76.field1178.method2307(false); var7 != null; var7 = (class368) class76.field1178.method2311(arg5 - 4351)) {
            if (class35.field541 >= var7.field5156) {
                var7.method2552(arg5 ^ 0x2FC);
            } else {
                class231.method1451((var7.field5154 << 7) + 64, (byte) -92, arg2, arg1 >> 1, arg3 >> 1, arg0, (var7.field5162 << 7) + 64, var7.field5155 * 2);
                class220.field2899.method2277(arg4 + class401.field5848[1], var7.field5160, class401.field5848[0] + arg6, -47, 0, var7.field5159 | 0xFF000000);
            }
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(III)I")
    public static final int method1291(int arg0, int arg1, int arg2) {
        field2695++;
        int var3 = class190.method1252(arg0 - 1, (byte) 126, arg1 - 1) + (class190.method1252(arg0 + 1, (byte) 104, arg1 - 1) - (-class190.method1252(arg0 - 1, (byte) -62, arg1 + 1) - class190.method1252(arg0 + 1, (byte) 119, arg1 + 1)));
        int var4 = class190.method1252(arg0 - 1, (byte) -46, arg1) + class190.method1252(arg0 + 1, (byte) 110, arg1) + class190.method1252(arg0, (byte) 122, arg1 + -1) + class190.method1252(arg0, (byte) 121, arg1 - -1);
        if (arg2 == -21153) {
            int var5 = class190.method1252(arg0, (byte) -18, arg1);
            return var3 / 16 + var4 / 8 + (var5 / 4);
        } else {
            return -13;
        }
    }

    @OriginalMember(owner = "client!ak", name = "c", descriptor = "(I)V")
    public static final void method1292(int arg0) {
        if (arg0 != 16) {
            return;
        }
        field2690++;
        if (class232.field3141 < 0) {
            return;
        }
        long var1 = class224.method1425(-26805);
        class232.field3141 = (int) ((long) class232.field3141 - (var1 - class76.field1193));
        if (class232.field3141 <= 0) {
            class176.field2488 = class229.field3054.field665;
            class232.field3141 = -1;
            class115.field1674 = class229.field3054.field672;
            class262.field3577 = class229.field3054.field666;
            class250.field3462 = class229.field3054.field669;
            class9.field135 = class229.field3054.field662;
            class83.field1272 = class229.field3054.field668;
            class280.field3843 = class229.field3054.field670;
            class446.field6436 = class229.field3054.field663;
            class182.field2551 = class229.field3054.field674;
            class436.field6266 = class229.field3054.field661;
        } else {
            int var3 = (class232.field3141 << 8) / class432.field6216;
            int var4 = 255 - var3;
            float var5 = (float) var3 / 255.0F;
            float var6 = 1.0F - var5;
            class182.field2551 = ((class249.field3450 & 0xFF00) * var3 + ((class229.field3054.field674 & 0xFF00) * var4) & 0xFF0000) + ((class249.field3450 & 0xFF00FF) * var3 + (class229.field3054.field674 & 0xFF00FF) * var4 & 0xFF00FF00) >>> 8;
            class83.field1272 = (class229.field3054.field668 - class294.field4062) * var6 + class294.field4062;
            class280.field3843 = (class229.field3054.field670 - class248.field3441) * var6 + class248.field3441;
            class436.field6266 = (class229.field3054.field661 - class124.field1743) * var6 + class124.field1743;
            class262.field3577 = ((class65.field1028 & 0xFF00FF) * var3 + (class229.field3054.field666 & 0xFF00FF) * var4 & 0xFF00FF00) + ((class65.field1028 & 0xFF00) * var3 + (class229.field3054.field666 & 0xFF00) * var4 & 0xFF0000) >>> 8;
            class250.field3462 = class141.field2020 * var3 + (class229.field3054.field669 * var4) >> 8;
            class9.field135 = (class229.field3054.field662 - class450.field6531) * var6 + class450.field6531;
            class115.field1674 = (class229.field3054.field672 - class3.field35) * var6 + class3.field35;
            class446.field6436 = (class229.field3054.field663 - class450.field6524) * var6 + class450.field6524;
            if (class41.field612 != class229.field3054.field665) {
                class176.field2488 = class308.field4230.method1808(class41.field612, class229.field3054.field665, var6, class176.field2488);
            }
        }
        class76.field1193 = var1;
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(IZ)V")
    public static final void method1293(int arg0, boolean arg1) {
        field2693++;
        if (class192.field2667 != arg1) {
            class192.field2667 = arg1;
            if (arg0 == -25870) {
                class31.method237(arg0 ^ 0xFFFF9AF5);
            }
        }
    }

    @OriginalMember(owner = "client!ak", name = "<init>", descriptor = "(III)V")
    public class194(int arg0, int arg1, int arg2) {
        this.field2685 = arg2;
        this.field2686 = arg1;
        this.field2691 = arg0;
    }

    @OriginalMember(owner = "client!ak", name = "b", descriptor = "(III)V")
    public abstract void method1041(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ak", name = "c", descriptor = "(III)V")
    public static final void method1294(int arg0, int arg1, int arg2) {
        class142 var3 = class5.field79[arg0][arg1][arg2];
        if (var3 == null) {
            return;
        }
        if (var3.field2031 != null) {
            var3.field2031 = null;
        }
        if (var3.field2044 != null) {
            var3.field2044 = null;
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(BII)V")
    public abstract void method1039(byte arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ak", name = "d", descriptor = "(III)V")
    public abstract void method1042(int arg0, int arg1, int arg2);

    static {
        new class79(64);
        field2697 = 0;
    }
}
