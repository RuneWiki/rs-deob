import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!p")
public class class33 {

    @OriginalMember(owner = "client!p", name = "d", descriptor = "I")
    public static int field341 = 0;

    @OriginalMember(owner = "client!p", name = "g", descriptor = "[B")
    public static byte[] field344 = new byte[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

    @OriginalMember(owner = "client!p", name = "b", descriptor = "I")
    public static int field339;

    @OriginalMember(owner = "client!p", name = "c", descriptor = "I")
    public static int field340;

    @OriginalMember(owner = "client!p", name = "e", descriptor = "I")
    public static int field342;

    @OriginalMember(owner = "client!p", name = "f", descriptor = "I")
    public static int field343;

    @OriginalMember(owner = "client!p", name = "a", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field338;

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(IIIZ)I")
    public static final int method203(int arg0, int arg1, int arg2, boolean arg3) {
        int var4 = -112 / ((arg2 + 53) / 53);
        field339++;
        class48 var5 = class317.method2019((byte) -109, arg0, arg3);
        if (var5 == null) {
            return 0;
        } else if (arg1 == -1) {
            return 0;
        } else {
            int var6 = 0;
            for (int var7 = 0; var7 < var5.field725.length; var7++) {
                if (var5.field723[var7] == arg1) {
                    var6 += var5.field725[var7];
                }
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(ILkk;)V")
    public static final void method204(int arg0, class161 arg1) {
        field340++;
        if ((arg1.field2262.length - arg1.field2298) < 1) {
            return;
        }
        int var2 = arg1.method1172((byte) -110);
        if (var2 < 0 || var2 > 15) {
            return;
        }
        byte var3;
        if (var2 == 15) {
            var3 = 37;
        } else if (var2 == 14) {
            var3 = 36;
        } else if (var2 == 13) {
            var3 = 35;
        } else if (var2 == 12) {
            var3 = 34;
        } else if (var2 == 11) {
            var3 = 33;
        } else if (var2 == 10) {
            var3 = 32;
        } else if (var2 == 9) {
            var3 = 31;
        } else if (var2 == 8) {
            var3 = 30;
        } else if (var2 == 7) {
            var3 = 29;
        } else if (var2 == 6) {
            var3 = 28;
        } else if (var2 == 5) {
            var3 = 28;
        } else if (var2 == 4) {
            var3 = 24;
        } else if (var2 == 3) {
            var3 = 23;
        } else if (var2 == 2) {
            var3 = 22;
        } else if (var2 == 1) {
            var3 = 23;
        } else {
            var3 = 19;
        }
        if (var3 > arg1.field2262.length - arg1.field2298) {
            return;
        }
        class172.field2621 = arg1.method1172((byte) 91);
        if (class172.field2621 < 1) {
            class172.field2621 = 1;
        } else if (class172.field2621 > 4) {
            class172.field2621 = 4;
        }
        class91.method760(arg1.method1172((byte) -15) == 1, 79);
        class362.field4981 = arg1.method1172((byte) -109) == 1;
        class181.field2743 = arg1.method1172((byte) 99) == 1;
        class169.field2453 = arg1.method1172((byte) -119) == 1;
        class491.field6931 = arg1.method1172((byte) -125) == 1 ? 1 : 0;
        class199.field2951 = arg1.method1172((byte) 77) == 1;
        class130.field1777 = arg1.method1172((byte) 26) == 1;
        class228.field3281 = arg1.method1172((byte) 12) == 1;
        class99.field1396 = arg1.method1172((byte) 33);
        if (class99.field1396 > 2) {
            class99.field1396 = 2;
        }
        if (var2 < 2) {
            class62.field913 = arg1.method1172((byte) -114) == 1;
            arg1.method1172((byte) 43);
        } else {
            class62.field913 = arg1.method1172((byte) -109) == 1;
        }
        class273.field3964 = arg1.method1172((byte) -127) == 1;
        class300.field4246 = arg1.method1172((byte) -112) == 1;
        class30.field309 = arg1.method1172((byte) -114);
        if (class30.field309 > 2) {
            class30.field309 = 2;
        }
        class227.field3260 = class30.field309;
        class55.field817 = arg1.method1172((byte) -122) == 1;
        class193.field2870 = arg1.method1172((byte) -10);
        if (class193.field2870 > 127) {
            class193.field2870 = 127;
        }
        class409.field5605 = arg1.method1172((byte) 92);
        class339.field4687 = arg1.method1172((byte) 78);
        if (class339.field4687 > 127) {
            class339.field4687 = 127;
        }
        if (var2 >= 1) {
            class185.field2787 = arg1.method1134(-16848);
            class30.field312 = arg1.method1134(-16848);
        }
        if (var2 >= 3 && var2 < 6) {
            arg1.method1172((byte) -124);
        }
        if (var2 >= 4) {
            int var4 = arg1.method1172((byte) -120);
            if (var4 < 0 || var4 > 2) {
                var4 = 0;
            }
            if (class364.field5008 < 96) {
                var4 = 0;
            }
            class150.method1073(var4, (byte) 16);
        }
        if (arg0 <= 103) {
            method203(-6, -20, -81, false);
        }
        if (var2 >= 5) {
            class254.field3646 = arg1.method1168(255);
        }
        int var5 = 0;
        if (var2 >= 6) {
            class223.field3222 = var5 = arg1.method1172((byte) 108);
        }
        if (class223.field3222 != 1 && class223.field3222 != 2) {
            class223.field3222 = 2;
        }
        if (var2 >= 7) {
            class21.field231 = arg1.method1172((byte) 65) == 1;
        }
        if (var2 >= 8) {
            class165.field2399 = arg1.method1172((byte) -118) == 1;
        }
        if (var2 >= 9) {
            class443.field6300 = arg1.method1172((byte) -115);
        }
        if (class443.field6300 < 0 || class443.field6300 > class169.method1232(class364.field5008, -4203)) {
            class443.field6300 = 0;
        }
        if (var2 >= 10) {
            class18.field193 = arg1.method1172((byte) 99) != 0;
        }
        if (var2 >= 11) {
            class51.field743 = arg1.method1172((byte) 54) != 0;
        }
        if (var2 >= 12) {
            class491.field6931 = arg1.method1172((byte) -28);
        }
        if (class491.field6931 < 0 || class491.field6931 > 2) {
            class491.field6931 = 1;
        }
        if (var2 >= 13) {
            class89.field1269 = arg1.method1172((byte) -118) == 1;
        }
        if (var2 >= 14) {
            class211.field3082 = arg1.method1172((byte) -107);
        } else if (var5 == 0) {
            class211.field3082 = 2;
        } else {
            class211.field3082 = 1;
        }
        if (class211.field3082 < 0 || class211.field3082 > 3) {
            class211.field3082 = 2;
        }
        if (var2 >= 15) {
            class69.field1010 = arg1.method1172((byte) 41);
            if (class69.field1010 < 0 || class69.field1010 > 4) {
                class69.field1010 = class198.field2928 == 1 ? 2 : 4;
            }
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(IIILdc;)J")
    public static final long method205(int arg0, int arg1, int arg2, class210 arg3) {
        field343++;
        long var4 = 4194304L;
        if (arg2 != 5) {
            return -59L;
        }
        long var6 = 2147483648L;
        long var8 = Long.MIN_VALUE;
        class267 var10 = class468.field6599.method506(arg2 ^ 0xFFFFFF86, arg3.method80(10143));
        long var11 = (long) (arg3.method83((byte) 73) << 14 | arg1 | arg0 << 7 | arg3.method71((byte) 125) << 20 | 0x40000000);
        if (var10.field3902 == 0) {
            var11 |= var8;
        }
        if (var10.field3853 == 1) {
            var11 |= var4;
        }
        if (var10.field3861) {
            var11 |= var6;
        }
        return var11 | (long) arg3.method80(10143) << 32;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(B)V")
    public static void method206(byte arg0) {
        field338 = null;
        field344 = null;
        if (arg0 != -97) {
            field342 = -107;
        }
    }
}
