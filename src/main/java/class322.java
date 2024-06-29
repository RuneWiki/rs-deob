import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!l")
public class class322 extends class128 {

    @OriginalMember(owner = "client!l", name = "A", descriptor = "I")
    public int field5114 = 0;

    @OriginalMember(owner = "client!l", name = "E", descriptor = "I")
    public static int field5118 = 0;

    @OriginalMember(owner = "client!l", name = "H", descriptor = "[Z")
    public static boolean[] field5121 = new boolean[100];

    @OriginalMember(owner = "client!l", name = "K", descriptor = "[I")
    public static int[] field5124 = new int[14];

    @OriginalMember(owner = "client!l", name = "y", descriptor = "I")
    public static int field5112;

    @OriginalMember(owner = "client!l", name = "z", descriptor = "I")
    public static int field5113;

    @OriginalMember(owner = "client!l", name = "B", descriptor = "I")
    public static int field5115;

    @OriginalMember(owner = "client!l", name = "C", descriptor = "I")
    public static int field5116;

    @OriginalMember(owner = "client!l", name = "D", descriptor = "I")
    public static int field5117;

    @OriginalMember(owner = "client!l", name = "F", descriptor = "I")
    public static int field5119;

    @OriginalMember(owner = "client!l", name = "G", descriptor = "I")
    public static int field5120;

    @OriginalMember(owner = "client!l", name = "I", descriptor = "I")
    public static int field5122;

    @OriginalMember(owner = "client!l", name = "J", descriptor = "I")
    public static int field5123;

    @OriginalMember(owner = "client!l", name = "c", descriptor = "(II)Lpb;", line = 4)
    public static final class88 method2211(int arg0, int arg1) {
        field5117++;
        class88 var2 = (class88) class39.field581.method2400((long) arg0, 99);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class24.field344.method441(false, arg0, 0);
        if (var3 == null) {
            return null;
        } else if (arg1 <= 78) {
            return (class88) null;
        } else {
            class88 var4 = new class88();
            class336 var5 = new class336(var3);
            var5.field5353 = var5.field5342.length - 2;
            int var6 = var5.method2339((byte) -46);
            int var7 = var5.field5342.length - var6 - 2 - 12;
            var5.field5353 = var7;
            int var8 = var5.method2338((byte) 95);
            var4.field1389 = var5.method2339((byte) -46);
            var4.field1396 = var5.method2339((byte) -46);
            var4.field1394 = var5.method2339((byte) -46);
            var4.field1393 = var5.method2339((byte) -46);
            int var9 = var5.method2364(-9069);
            if (var9 > 0) {
                var4.field1392 = new class79[var9];
                for (int var10 = 0; var10 < var9; var10++) {
                    int var11 = var5.method2339((byte) -46);
                    class79 var12 = new class79(class168.method1318(var11, false));
                    var4.field1392[var10] = var12;
                    while (var11-- > 0) {
                        int var13 = var5.method2338((byte) 45);
                        int var14 = var5.method2338((byte) 42);
                        var12.method725((long) var13, new class142(var14), 1);
                    }
                }
            }
            var5.field5353 = 0;
            var4.field1387 = var5.method2329(-22226);
            var4.field1391 = new int[var8];
            var4.field1385 = new int[var8];
            var4.field1390 = new String[var8];
            int var15 = 0;
            while (var7 > var5.field5353) {
                int var16 = var5.method2339((byte) -46);
                if (var16 == 3) {
                    var4.field1390[var15] = var5.method2365(122).intern();
                } else if (var16 >= 100 || var16 == 21 || var16 == 38 || var16 == 39) {
                    var4.field1391[var15] = var5.method2364(-9069);
                } else {
                    var4.field1391[var15] = var5.method2338((byte) 23);
                }
                var4.field1385[var15++] = var16;
            }
            class39.field581.method2396(0, (long) arg0, var4);
            return var4;
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(ILpi;I)V", line = 96)
    private final void method2212(int arg0, class336 arg1, int arg2) {
        field5119++;
        if (arg2 < 120) {
            method2216((byte) 68);
        }
        if (arg0 == 2) {
            this.field5114 = arg1.method2339((byte) -46);
        }
    }

    @OriginalMember(owner = "client!l", name = "d", descriptor = "(II)I", line = 113)
    public static final int method2213(int arg0, int arg1) {
        if (arg1 > -7) {
            return 104;
        } else {
            field5120++;
            return arg0 & 0xFF;
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(B)I", line = 125)
    public static final int method2214(byte arg0) {
        if (arg0 <= 28) {
            field5115 = 25;
        }
        field5122++;
        if (class222.field3708 == null) {
            return -1;
        }
        while (class222.field3708.field4814 > class98.field1590) {
            if (class222.field3708.method2097(class98.field1590, 17368)) {
                return class98.field1590++;
            }
            class98.field1590++;
        }
        return -1;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Lwe;Ljava/lang/Object;B)V", line = 149)
    public static final void method2215(class59 arg0, Object arg1, byte arg2) {
        field5123++;
        if (arg0.field907 == null) {
            return;
        }
        for (int var3 = 0; var3 < 50 && arg0.field907.peekEvent() != null; var3++) {
            class142.method1149(1L, (byte) 127);
        }
        int var4 = 91 / ((arg2 - 58) / 37);
        if (arg1 != null) {
            arg0.field907.postEvent(new ActionEvent(arg1, 1001, "dummy"));
        }
    }

    @OriginalMember(owner = "client!l", name = "b", descriptor = "(B)V", line = 175)
    public static void method2216(byte arg0) {
        field5121 = null;
        int var1 = 36 / ((arg0 - 16) / 51);
        field5124 = null;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(ILpi;)V", line = 195)
    public final void method2217(int arg0, class336 arg1) {
        while (true) {
            int var3 = arg1.method2364(-9069);
            if (var3 == 0) {
                field5112++;
                if (arg0 >= -126) {
                    method2219(1, -62);
                }
                return;
            }
            this.method2212(var3, arg1, 123);
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/String;", line = 221)
    public static final String method2218(byte arg0, String arg1) {
        field5113++;
        int var2 = -103 % ((-arg0 - 31) / 51);
        int var3 = class224.method1635(arg1, -1);
        return var3 == -1 ? "" : class185.method1427(" ", -117, class222.field3708.field4819[var3], "<br>");
    }

    @OriginalMember(owner = "client!l", name = "e", descriptor = "(II)Lnl;", line = 252)
    public static final class35 method2219(int arg0, int arg1) {
        class35 var2 = (class35) class171.field2962.method467(true, (long) arg0);
        field5116++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class185.field3134.method441(false, arg1, arg0);
        class35 var4 = new class35();
        if (var3 != null) {
            var4.method315(new class336(var3), -1, arg0);
        }
        class171.field2962.method465(var4, (long) arg0, (byte) 61);
        return var4;
    }
}
