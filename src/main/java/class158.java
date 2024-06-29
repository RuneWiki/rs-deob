import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ah")
public class class158 {

    @OriginalMember(owner = "client!ah", name = "i", descriptor = "[I")
    public static int[] field2853 = new int[] { 2, 2, 4, 2, 1, 8, 4, 1, 4, 4, 2, 1 };

    @OriginalMember(owner = "client!ah", name = "k", descriptor = "Lce;")
    public static class126 field2855 = class206.method1445(-7923, "K");

    @OriginalMember(owner = "client!ah", name = "m", descriptor = "I")
    public static int field2857 = 0;

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "I")
    public static int field2845;

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "I")
    public static int field2846;

    @OriginalMember(owner = "client!ah", name = "c", descriptor = "I")
    public static int field2847;

    @OriginalMember(owner = "client!ah", name = "d", descriptor = "I")
    public static int field2848;

    @OriginalMember(owner = "client!ah", name = "e", descriptor = "I")
    public static int field2849;

    @OriginalMember(owner = "client!ah", name = "f", descriptor = "I")
    public static int field2850;

    @OriginalMember(owner = "client!ah", name = "g", descriptor = "I")
    public static int field2851;

    @OriginalMember(owner = "client!ah", name = "h", descriptor = "I")
    public static int field2852;

    @OriginalMember(owner = "client!ah", name = "j", descriptor = "I")
    public static int field2854;

    @OriginalMember(owner = "client!ah", name = "l", descriptor = "I")
    public static int field2856;

    @OriginalMember(owner = "client!ah", name = "n", descriptor = "I")
    public static int field2858;

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(BI)V", line = 4)
    public static final void method1155(byte arg0, int arg1) {
        if (arg0 < 31) {
            return;
        }
        class100.field1624 = -1;
        class100.field1624 = -1;
        field2856++;
        if (arg1 == 37) {
            class15.field200 = 3.0F;
        } else if (arg1 == 50) {
            class15.field200 = 4.0F;
        } else if (arg1 == 75) {
            class15.field200 = 6.0F;
        } else if (arg1 == 100) {
            class15.field200 = 8.0F;
        } else if (arg1 == 200) {
            class15.field200 = 16.0F;
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(III)V", line = 37)
    public static final void method1156(int arg0, int arg1, int arg2) {
        class103.field1645.method1238(arg0, 80);
        class103.field1645.method959(arg0 - 145, arg1);
        class103.field1645.method929(arg2, (byte) 111);
        field2847++;
        class172.field3036++;
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(I)V", line = 57)
    public static void method1157(int arg0) {
        field2853 = null;
        field2855 = null;
        if (arg0 != 0) {
            method1157(110);
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(Lce;I)I", line = 73)
    public static final int method1158(class126 arg0, int arg1) {
        if (arg1 <= 78) {
            return 10;
        }
        field2854++;
        for (int var2 = 0; var2 < class63.field1042.length; var2++) {
            if (class63.field1042[var2].method881(arg0, (byte) 92)) {
                return var2;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "(I)V", line = 102)
    public static final void method1159(int arg0) {
        if (class24.field344 == null || class270.field4554 == null) {
            class270.field4554 = new int[256];
            class24.field344 = new int[256];
            for (int var1 = 0; var1 < 256; var1++) {
                double var2 = (double) var1 / 255.0D * 6.283185307179586D;
                class24.field344[var1] = (int) (Math.sin(var2) * 4096.0D);
                class270.field4554[var1] = (int) (Math.cos(var2) * 4096.0D);
            }
        }
        if (arg0 < -102) {
            field2850++;
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(Lwd;ILce;)Lce;", line = 134)
    public static final class126 method1160(class112 arg0, int arg1, class126 arg2) {
        field2852++;
        if (arg2.method875(class189.field3243, -126) != -1) {
            label66: while (true) {
                int var3 = arg2.method875(class257.field4328, -117);
                if (var3 == -1) {
                    while (true) {
                        int var4 = arg2.method875(class273.field4605, -59);
                        if (var4 == -1) {
                            while (true) {
                                int var5 = arg2.method875(class39.field627, -51);
                                if (var5 == -1) {
                                    while (true) {
                                        int var6 = arg2.method875(class264.field4402, -69);
                                        if (var6 == -1) {
                                            while (true) {
                                                int var7 = arg2.method875(class7.field83, -127);
                                                if (var7 == -1) {
                                                    while (true) {
                                                        int var8 = arg2.method875(class269.field4545, -57);
                                                        if (var8 == -1) {
                                                            break label66;
                                                        }
                                                        class126 var9 = class224.field3772;
                                                        if (class32.field470 != null) {
                                                            var9 = class140.method1030(class32.field470.field969, -86);
                                                            try {
                                                                if (class32.field470.field967 != null) {
                                                                    byte[] var10 = ((String) class32.field470.field967).getBytes("ISO-8859-1");
                                                                    var9 = class301.method2021(0, var10.length, var10, false);
                                                                }
                                                            } catch (UnsupportedEncodingException var12) {
                                                            }
                                                        }
                                                        arg2 = class12.method69(new class126[] { arg2.method859(var8, -118, 0), var9, arg2.method879(-14178, var8 + 4) }, (byte) 115);
                                                    }
                                                }
                                                arg2 = class12.method69(new class126[] { arg2.method859(var7, -109, 0), class131.method916((byte) 78, class40.method253(4, arg0, 109)), arg2.method879(-14178, var7 + 2) }, (byte) 118);
                                            }
                                        }
                                        arg2 = class12.method69(new class126[] { arg2.method859(var6, 27, 0), class131.method916((byte) 115, class40.method253(3, arg0, -62)), arg2.method879(-14178, var6 + 2) }, (byte) 121);
                                    }
                                }
                                arg2 = class12.method69(new class126[] { arg2.method859(var5, -99, 0), class131.method916((byte) 93, class40.method253(2, arg0, 84)), arg2.method879(-14178, var5 + 2) }, (byte) 123);
                            }
                        }
                        arg2 = class12.method69(new class126[] { arg2.method859(var4, -124, 0), class131.method916((byte) 49, class40.method253(1, arg0, -59)), arg2.method879(-14178, var4 + 2) }, (byte) 117);
                    }
                }
                arg2 = class12.method69(new class126[] { arg2.method859(var3, 114, 0), class131.method916((byte) 84, class40.method253(0, arg0, -50)), arg2.method879(-14178, var3 + 2) }, (byte) 125);
            }
        }
        if (arg1 >= -44) {
            method1156(-64, -126, -117);
        }
        return arg2;
    }

    @OriginalMember(owner = "client!ah", name = "c", descriptor = "(I)V", line = 241)
    public static final void method1161(int arg0) {
        field2851++;
        class252 var1 = (class252) class264.field4399.method898((byte) -99);
        if (arg0 != 8528) {
            method1163((class313) null, (class313) null, -95);
        }
        while (var1 != null) {
            if (var1.field4235 == -1) {
                var1.field4219 = 0;
                class30.method145(-109, var1);
            } else {
                var1.method499((byte) 64);
            }
            var1 = (class252) class264.field4399.method893((byte) 104);
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(B)I", line = 266)
    public static final int method1162(byte arg0) {
        field2849++;
        if (arg0 != 59) {
            field2853 = (int[]) null;
        }
        class259.field4348 = 0;
        return class119.method786((byte) -13);
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(Lcc;Lcc;I)V", line = 279)
    public static final void method1163(class313 arg0, class313 arg1, int arg2) {
        class195.field3348 = arg0;
        class281.field4673 = arg1;
        field2845++;
        if (arg2 != 3479) {
            field2853 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(IBILpg;II)V", line = 291)
    public static final void method1164(int arg0, byte arg1, int arg2, class314 arg3, int arg4, int arg5) {
        field2858++;
        if (arg3.field5387 == -1 && arg3.field5374 == null) {
            return;
        }
        int var6 = 0;
        if (arg3.field5389 < arg5) {
            var6 += arg5 - arg3.field5389;
        } else if (arg3.field5402 > arg5) {
            var6 += arg3.field5402 - arg5;
        }
        if (arg0 > arg3.field5377) {
            var6 += arg0 - arg3.field5377;
        } else if (arg3.field5400 > arg0) {
            var6 += arg3.field5400 - arg0;
        }
        int var7 = -48 % ((-arg1 - 53) / 55);
        if (arg3.field5380 == 0 || arg3.field5380 < var6 - 64 || class205.field3523 == 0 || arg3.field5384 != arg4) {
            if (arg3.field5382 != null) {
                class278.field4633.method562(arg3.field5382);
                arg3.field5382 = null;
            }
            if (arg3.field5398 != null) {
                class278.field4633.method562(arg3.field5398);
                arg3.field5398 = null;
            }
            return;
        }
        var6 -= 64;
        if (var6 < 0) {
            var6 = 0;
        }
        int var8 = (arg3.field5380 - var6) * class205.field3523 / arg3.field5380;
        if (arg3.field5382 != null) {
            arg3.field5382.method1964(var8);
        } else if (arg3.field5387 >= 0) {
            class271 var9 = class271.method1820(class273.field4598, arg3.field5387, 0);
            if (var9 != null) {
                class156 var10 = var9.method1818().method1140(class84.field1340);
                class295 var11 = class295.method1974(var10, 100, var8);
                var11.method1972(-1);
                class278.field4633.method566(var11);
                arg3.field5382 = var11;
            }
        }
        if (arg3.field5398 != null) {
            arg3.field5398.method1964(var8);
            if (!arg3.field5398.method496(true)) {
                arg3.field5398 = null;
            }
        } else if (arg3.field5374 != null && (arg3.field5375 -= arg2) <= 0) {
            int var12 = (int) (Math.random() * (double) arg3.field5374.length);
            class271 var13 = class271.method1820(class273.field4598, arg3.field5374[var12], 0);
            if (var13 != null) {
                class156 var14 = var13.method1818().method1140(class84.field1340);
                class295 var15 = class295.method1974(var14, 100, var8);
                var15.method1972(0);
                class278.field4633.method566(var15);
                arg3.field5398 = var15;
                arg3.field5375 = arg3.field5390 + (int) ((double) (arg3.field5399 - arg3.field5390) * Math.random());
            }
        }
    }

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "(B)V", line = 421)
    public static final void method1165(byte arg0) {
        for (class314 var1 = (class314) class185.field3202.method898((byte) -117); var1 != null; var1 = (class314) class185.field3202.method893((byte) -96)) {
            if (var1.field5391) {
                var1.method2194((byte) -101);
            }
        }
        field2846++;
        if (arg0 >= -94) {
            field2857 = 78;
        }
        for (class314 var2 = (class314) class82.field1322.method898((byte) -60); var2 != null; var2 = (class314) class82.field1322.method893((byte) 108)) {
            if (var2.field5391) {
                var2.method2194((byte) -101);
            }
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(IZ)I", line = 452)
    public static final int method1166(int arg0, boolean arg1) {
        field2848++;
        if (!arg1) {
            method1156(62, -10, 44);
        }
        return arg0 >>> 8;
    }
}
