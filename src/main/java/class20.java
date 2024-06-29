import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fi")
public class class20 extends OutputStream {

    @OriginalMember(owner = "client!fi", name = "d", descriptor = "I")
    public static int field267 = 0;

    @OriginalMember(owner = "client!fi", name = "c", descriptor = "Z")
    public static boolean field266 = false;

    @OriginalMember(owner = "client!fi", name = "j", descriptor = "Lha;")
    private static class46 field273 = class271.method1828("Your ignore list is full)3 Max of 100 users)3", -46);

    @OriginalMember(owner = "client!fi", name = "k", descriptor = "Lha;")
    public static class46 field274 = field273;

    @OriginalMember(owner = "client!fi", name = "g", descriptor = "Lha;")
    public static class46 field270 = class271.method1828("Lade Sprites )2 ", -46);

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "I")
    public static int field264;

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "I")
    public static int field265;

    @OriginalMember(owner = "client!fi", name = "e", descriptor = "I")
    public static int field268;

    @OriginalMember(owner = "client!fi", name = "f", descriptor = "I")
    public static int field269;

    @OriginalMember(owner = "client!fi", name = "h", descriptor = "I")
    public static int field271;

    @OriginalMember(owner = "client!fi", name = "i", descriptor = "I")
    public static int field272;

    @OriginalMember(owner = "client!fi", name = "l", descriptor = "I")
    public static int field275;

    @OriginalMember(owner = "client!fi", name = "m", descriptor = "I")
    public static int field276;

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(I)V")
    public static final void method103(int arg0) {
        field268++;
        if (!class187.field3339) {
            return;
        }
        int var1 = 18 / ((arg0 + 4) / 40);
        class24 var2 = class108.method841(class194.field3477, class275.field4793, -1);
        if (var2 != null && var2.field499 != null) {
            class275 var3 = new class275();
            var3.field4792 = var2;
            var3.field4796 = var2.field499;
            class215.method1509(var3, 122);
        }
        class187.field3339 = false;
        class226.method1549(false, var2);
    }

    @OriginalMember(owner = "client!fi", name = "write", descriptor = "(I)V")
    public final void write(int arg0) throws IOException {
        field264++;
        throw new IOException();
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(ZI)V")
    public static final void method104(boolean arg0, int arg1) {
        class146.field2638.method81((byte) 30, arg1);
        class184.field3293.method81((byte) 30, arg1);
        class217.field3837.method81((byte) 30, arg1);
        field271++;
        if (arg0) {
            method106((class81) null, -107, (byte) 120, -30, -81);
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(JB)V")
    public static final void method105(long arg0, byte arg1) {
        class58.field967.field1380 = 0;
        class58.field967.method570(213, 15619);
        class58.field967.method578((byte) 89, arg0);
        field275++;
        class78.field1481 = 1;
        int var3 = -122 % ((arg1 + 31) / 62);
        class207.field3716 = -3;
        class105.field1882 = 0;
        class69.field1193 = 0;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(Lmi;IBII)V")
    public static final void method106(class81 arg0, int arg1, byte arg2, int arg3, int arg4) {
        field272++;
        if (class277.field4824 == arg0 || class242.field4290 >= 400) {
            return;
        }
        int var5 = -63 / ((19 - arg2) / 46);
        class46 var6;
        if (arg0.field1548 == 0) {
            boolean var7 = true;
            if (class277.field4824.field1540 != -1 && arg0.field1540 != -1) {
                int var8 = class277.field4824.field1550 <= arg0.field1550 ? arg0.field1550 : class277.field4824.field1550;
                int var9 = arg0.field1540 > class277.field4824.field1540 ? class277.field4824.field1540 : arg0.field1540;
                int var10 = 5 - (-(var8 * 10 / 100) - var9);
                int var11 = class277.field4824.field1550 - arg0.field1550;
                if (var11 < 0) {
                    var11 = -var11;
                }
                if (var10 < var11) {
                    var7 = false;
                }
            }
            if (arg0.field1530 > arg0.field1550) {
                var6 = class109.method855(0, new class46[] { arg0.method636(-1537), var7 ? class12.method65(false, class277.field4824.field1550, arg0.field1550) : class39.field686, class216.field3829, class63.field1074, class115.method932(false, arg0.field1550), class53.field918, class115.method932(false, arg0.field1530 - arg0.field1550), class221.field3885 });
            } else {
                var6 = class109.method855(0, new class46[] { arg0.method636(-1537), var7 ? class12.method65(false, class277.field4824.field1550, arg0.field1550) : class39.field686, class216.field3829, class63.field1074, class115.method932(false, arg0.field1550), class221.field3885 });
            }
        } else {
            var6 = class109.method855(0, new class46[] { arg0.method636(-1537), class216.field3829, class185.field3300, class115.method932(false, arg0.field1548), class221.field3885 });
        }
        if (class31.field585 == 1) {
            class39.method267((short) 40, class89.field1687, arg1, class109.method855(0, new class46[] { class32.field606, class98.field1822, var6 }), arg3, (long) arg4, -1);
            class105.field1888++;
        } else if (!class187.field3339) {
            for (int var12 = 7; var12 >= 0; var12--) {
                if (class111.field2092[var12] != null) {
                    class52.field896++;
                    boolean var13 = false;
                    short var14 = 0;
                    if (class32.field601 == 0 && class111.field2092[var12].method315((byte) -38, class229.field3996)) {
                        if (arg0.field1550 > class277.field4824.field1550) {
                            var14 = 2000;
                        }
                        if (class277.field4824.field1537 != 0 && arg0.field1537 != 0) {
                            if (class277.field4824.field1537 == arg0.field1537) {
                                var14 = 2000;
                            } else {
                                var14 = 0;
                            }
                        }
                    } else if (class86.field1637[var12]) {
                        var14 = 2000;
                    }
                    short var15 = class5.field79[var12];
                    short var16 = (short) (var14 + var15);
                    class39.method267(var16, class111.field2092[var12], arg1, class109.method855(0, new class46[] { class39.field686, var6 }), arg3, (long) arg4, -1);
                }
            }
        } else if ((class248.field4382 & 0x8) == 8) {
            class115.field2178++;
            class39.method267((short) 42, class64.field1083, arg1, class109.method855(0, new class46[] { class16.field232, class98.field1822, var6 }), arg3, (long) arg4, -1);
        }
        for (int var17 = 0; var17 < class242.field4290; var17++) {
            if (class215.field3807[var17] == 6) {
                class162.field2855[var17] = class109.method855(0, new class46[] { class39.field686, var6 });
                return;
            }
        }
    }

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "(I)V")
    public static void method107(int arg0) {
        field273 = null;
        if (arg0 != 5) {
            method105(-22L, (byte) 74);
        }
        field274 = null;
        field270 = null;
    }
}
