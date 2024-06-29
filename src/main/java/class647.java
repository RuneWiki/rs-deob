import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vea")
public class class647 {

    @OriginalMember(owner = "client!vea", name = "n", descriptor = "I")
    public int field9324;

    @OriginalMember(owner = "client!vea", name = "m", descriptor = "I")
    public int field9323;

    @OriginalMember(owner = "client!vea", name = "d", descriptor = "I")
    public static int field9314 = 13156520;

    @OriginalMember(owner = "client!vea", name = "u", descriptor = "I")
    public static int field9331 = 0;

    @OriginalMember(owner = "client!vea", name = "a", descriptor = "I")
    public static int field9311;

    @OriginalMember(owner = "client!vea", name = "b", descriptor = "I")
    public static int field9312;

    @OriginalMember(owner = "client!vea", name = "c", descriptor = "I")
    public int field9313;

    @OriginalMember(owner = "client!vea", name = "e", descriptor = "I")
    public int field9315;

    @OriginalMember(owner = "client!vea", name = "f", descriptor = "I")
    public static int field9316;

    @OriginalMember(owner = "client!vea", name = "g", descriptor = "I")
    public static int field9317;

    @OriginalMember(owner = "client!vea", name = "h", descriptor = "I")
    public int field9318;

    @OriginalMember(owner = "client!vea", name = "i", descriptor = "I")
    public static int field9319;

    @OriginalMember(owner = "client!vea", name = "j", descriptor = "I")
    public static int field9320;

    @OriginalMember(owner = "client!vea", name = "k", descriptor = "I")
    public static int field9321;

    @OriginalMember(owner = "client!vea", name = "l", descriptor = "I")
    public static int field9322;

    @OriginalMember(owner = "client!vea", name = "q", descriptor = "I")
    public static int field9327;

    @OriginalMember(owner = "client!vea", name = "r", descriptor = "I")
    public static int field9328;

    @OriginalMember(owner = "client!vea", name = "s", descriptor = "I")
    public static int field9329;

    @OriginalMember(owner = "client!vea", name = "t", descriptor = "I")
    public static int field9330;

    @OriginalMember(owner = "client!vea", name = "v", descriptor = "I")
    public static int field9332;

    @OriginalMember(owner = "client!vea", name = "o", descriptor = "Lsk;")
    public class121 field9325;

    @OriginalMember(owner = "client!vea", name = "p", descriptor = "Lvea;")
    public class647 field9326;

    @OriginalMember(owner = "client!vea", name = "a", descriptor = "(BII)V", line = 8)
    public static final void method3734(byte arg0, int arg1, int arg2) {
        field9327++;
        if (class664.field9493 > class664.field9492) {
            class664.field9492 = (float) ((double) class664.field9492 / 30.0D + (double) class664.field9492);
            if (class664.field9492 > class664.field9493) {
                class664.field9492 = class664.field9493;
            }
            class91.method710(false);
            class664.field9486 = (int) class664.field9492 >> 1;
            class664.field9494 = class247.method1682(class664.field9486, 7);
        } else if (class664.field9493 < class664.field9492) {
            class664.field9492 = (float) ((double) class664.field9492 - (double) class664.field9492 / 30.0D);
            if (class664.field9493 > class664.field9492) {
                class664.field9492 = class664.field9493;
            }
            class91.method710(false);
            class664.field9486 = (int) class664.field9492 >> 1;
            class664.field9494 = class247.method1682(class664.field9486, arg0 ^ 0x29);
        }
        if (class709.field9963 != -1 && class120.field1639 != -1) {
            int var3 = class709.field9963 - class488.field7039;
            if (var3 < 2 || var3 > 2) {
                var3 /= 8;
            }
            int var4 = class120.field1639 - class78.field1135;
            if (var4 < 2 || var4 > 2) {
                var4 /= 8;
            }
            class488.field7039 += var3;
            class78.field1135 += var4;
            if (var3 == 0 && var4 == 0) {
                class709.field9963 = -1;
                class120.field1639 = -1;
            }
            class91.method710(false);
        }
        if (class672.field9575 > 0) {
            class556.field8080--;
            if (class556.field8080 == 0) {
                class672.field9575--;
                class556.field8080 = 100;
            }
        } else {
            class727.field10217 = -1;
            class68.field1054 = -1;
        }
        if (class656.field9396 && class524.field7613 != null) {
            for (class98 var5 = (class98) class524.field7613.method3565(107); var5 != null; var5 = (class98) class524.field7613.method3561((byte) 63)) {
                class463 var6 = class664.field9482.method2687(var5.field1395.field3562, 36);
                if (var5.method738(arg1, (byte) -14, arg2)) {
                    if (var6.field6569 != null) {
                        if (var6.field6569[4] != null) {
                            class145.method1016(var6.field6569[4], true, 0, false, var6.field6579, arg0 - 171, var6.field6597, (long) var5.field1395.field3562, -1, (long) var5.field1395.field3562, 1010, -1, false);
                        }
                        if (var6.field6569[3] != null) {
                            class145.method1016(var6.field6569[3], true, 0, false, var6.field6579, -124, var6.field6597, (long) var5.field1395.field3562, -1, (long) var5.field1395.field3562, 1007, -1, false);
                        }
                        if (var6.field6569[2] != null) {
                            class145.method1016(var6.field6569[2], true, 0, false, var6.field6579, -121, var6.field6597, (long) var5.field1395.field3562, -1, (long) var5.field1395.field3562, 1001, -1, false);
                        }
                        if (var6.field6569[1] != null) {
                            class145.method1016(var6.field6569[1], true, 0, false, var6.field6579, -118, var6.field6597, (long) var5.field1395.field3562, -1, (long) var5.field1395.field3562, 1008, -1, false);
                        }
                        if (var6.field6569[0] != null) {
                            class145.method1016(var6.field6569[0], true, 0, false, var6.field6579, -120, var6.field6597, (long) var5.field1395.field3562, -1, (long) var5.field1395.field3562, 1006, -1, false);
                        }
                    }
                    if (!var5.field1395.field3570) {
                        var5.field1395.field3570 = true;
                        class529.method3206(class294.field4040, var5.field1395.field3562, var6.field6597);
                    }
                    if (var5.field1395.field3570) {
                        class529.method3206(class240.field3552, var5.field1395.field3562, var6.field6597);
                    }
                } else if (var5.field1395.field3570) {
                    var5.field1395.field3570 = false;
                    class529.method3206(class680.field9667, var5.field1395.field3562, var6.field6597);
                }
            }
        }
        if (arg0 != 46) {
            field9322 = 36;
        }
    }

    @OriginalMember(owner = "client!vea", name = "a", descriptor = "(II)Lvea;", line = 148)
    public final class647 method3735(int arg0, int arg1) {
        field9328++;
        return arg0 == 1 ? new class647(this.field9324, arg1) : null;
    }

    @OriginalMember(owner = "client!vea", name = "a", descriptor = "(I)Lhl;", line = 161)
    public final class396 method3736(int arg0) {
        if (arg0 != 8) {
            field9329 = -34;
        }
        field9311++;
        return class257.method1712(this.field9324, (byte) -8);
    }

    @OriginalMember(owner = "client!vea", name = "a", descriptor = "(BLsl;)Ldw;", line = 174)
    public static final class659 method3737(byte arg0, class479 arg1) {
        field9321++;
        class390 var2 = class13.method67(0, arg1);
        int var3 = 100 / ((26 - arg0) / 33);
        int var4 = arg1.method2868(-69);
        int var5 = arg1.method2868(-50);
        return new class659(var2.field5625, var2.field5623, var2.field5620, var2.field5622, var2.field5617, var2.field5613, var2.field5614, var2.field5616, var2.field5624, var4, var5);
    }

    @OriginalMember(owner = "client!vea", name = "a", descriptor = "(Leg;I)Leg;", line = 190)
    public static final class317 method3738(class317 arg0, int arg1) {
        if (arg1 != -27496) {
            field9314 = 99;
        }
        field9312++;
        class317 var2 = arg0 == null ? new class317() : new class317(arg0);
        var2.method1976(9, 128, (byte) -111);
        return var2;
    }

    @OriginalMember(owner = "client!vea", name = "a", descriptor = "(III)Z", line = 205)
    public static final boolean method3739(int arg0, int arg1, int arg2) {
        if (arg0 == -1) {
            field9330++;
            return (arg2 & 0x400) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!vea", name = "a", descriptor = "(ILha;)V", line = 225)
    public static final void method3740(int arg0, class543 arg1) {
        field9319++;
        if (class299.field4080.method3557(84) == 0) {
            return;
        }
        if (class243.field3580.field7975.method3775(false) == 0) {
            for (class692 var2 = (class692) class299.field4080.method3565(-83); var2 != null; var2 = (class692) class299.field4080.method3561((byte) 69)) {
                class425.field6147.method4148(class564.field8163, var2.field9810, var2.field9804, var2.field9811, var2.field9806, var2.field9812 ? class108.field1536.field9081 : null, arg1, arg1, false, (byte) -97, var2.field9808, false);
                var2.method2656((byte) 124);
            }
            class328.method2021(arg0 + 6782);
        } else {
            if (class533.field7776 == null) {
                Canvas var3 = new Canvas();
                var3.setSize(36, 32);
                class533.field7776 = class68.method612(0, false, 0, class481.field6877, var3, class621.field8832);
                class384.field5560 = class533.field7776.method322(class396.method2403(0, (byte) 79, class726.field10209, class505.field7348), class676.method3846(class603.field8548, class505.field7348, 0), true);
            }
            for (class692 var4 = (class692) class299.field4080.method3565(arg0 ^ 0xFFFFC389); var4 != null; var4 = (class692) class299.field4080.method3561((byte) 33)) {
                class425.field6147.method4148(class384.field5560, var4.field9810, var4.field9804, var4.field9811, var4.field9806, var4.field9812 ? class108.field1536.field9081 : null, class533.field7776, arg1, false, (byte) -97, var4.field9808, false);
                var4.method2656((byte) 121);
            }
        }
        if (arg0 != -15368) {
            field9329 = -41;
        }
    }

    @OriginalMember(owner = "client!vea", name = "a", descriptor = "(IBI)V", line = 277)
    public static final void method3741(int arg0, byte arg1, int arg2) {
        field9316++;
        if (arg1 != -82) {
            method3737((byte) 83, null);
        }
        if (class416.method2507(arg2, -2113733296)) {
            class659.method3763(arg0, class600.field8524[arg2], false);
        }
    }

    @OriginalMember(owner = "client!vea", name = "b", descriptor = "(II)Lnca;", line = 295)
    public static final class627 method3742(int arg0, int arg1) {
        field9320++;
        if (arg1 != -1) {
            return null;
        }
        class627[] var2 = class565.method3381(29753);
        for (int var3 = 0; var3 < var2.length; var3++) {
            class627 var4 = var2[var3];
            if (var4.field8892 == arg0) {
                return var4;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!vea", name = "<init>", descriptor = "(II)V", line = 324)
    public class647(int arg0, int arg1) {
        this.field9324 = arg0;
        this.field9323 = arg1;
    }
}
