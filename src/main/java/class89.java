import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ub")
public class class89 extends class254 {

    @OriginalMember(owner = "client!ub", name = "A", descriptor = "[Z")
    public static boolean[] field1578 = new boolean[8];

    @OriginalMember(owner = "client!ub", name = "O", descriptor = "I")
    public static int field1591 = -1;

    @OriginalMember(owner = "client!ub", name = "C", descriptor = "Lcf;")
    public static class93 field1580 = class147.method1066("brillant2:", -48);

    @OriginalMember(owner = "client!ub", name = "P", descriptor = "I")
    public static int field1592 = 0;

    @OriginalMember(owner = "client!ub", name = "z", descriptor = "I")
    public static int field1577;

    @OriginalMember(owner = "client!ub", name = "E", descriptor = "I")
    public static int field1582;

    @OriginalMember(owner = "client!ub", name = "F", descriptor = "I")
    public static int field1583;

    @OriginalMember(owner = "client!ub", name = "G", descriptor = "I")
    public static int field1584;

    @OriginalMember(owner = "client!ub", name = "H", descriptor = "I")
    public static int field1585;

    @OriginalMember(owner = "client!ub", name = "I", descriptor = "I")
    public static int field1586;

    @OriginalMember(owner = "client!ub", name = "J", descriptor = "I")
    public static int field1587;

    @OriginalMember(owner = "client!ub", name = "K", descriptor = "I")
    public static int field1588;

    @OriginalMember(owner = "client!ub", name = "L", descriptor = "I")
    public static int field1589;

    @OriginalMember(owner = "client!ub", name = "M", descriptor = "I")
    public static int field1590;

    @OriginalMember(owner = "client!ub", name = "B", descriptor = "Ltg;")
    public static class181 field1579;

    @OriginalMember(owner = "client!ub", name = "D", descriptor = "Llj;")
    private class25 field1581;

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(Lcf;II)Lcf;")
    public final class93 method613(class93 arg0, int arg1, int arg2) {
        field1584++;
        if (this.field1581 == null) {
            return arg0;
        }
        class82 var4 = (class82) this.field1581.method135((long) arg1, true);
        if (var4 == null) {
            return arg0;
        } else {
            if (arg2 != -250) {
                this.method613((class93) null, -110, -94);
            }
            return var4.field1507;
        }
    }

    @OriginalMember(owner = "client!ub", name = "d", descriptor = "(B)V")
    public static final void method614(byte arg0) {
        if (arg0 >= -73) {
            field1591 = -60;
        }
        field1583++;
        class120.field2126 = 0;
        int var1 = (class166.field2927.field3784 >> 7) + class4.field52;
        int var2 = (class166.field2927.field3868 >> 7) + class229.field4111;
        if (var2 >= 3053 && var2 <= 3156 && var1 >= 3056 && var1 <= 3136) {
            class120.field2126 = 1;
        }
        if (var2 >= 3072 && var2 <= 3118 && var1 >= 9492 && var1 <= 9535) {
            class120.field2126 = 1;
        }
        if (class120.field2126 == 1 && var2 >= 3139 && var2 <= 3199 && var1 >= 3008 && var1 <= 3062) {
            class120.field2126 = 0;
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(BLee;)Lnl;")
    public static final class95 method615(byte arg0, class280 arg1) {
        field1587++;
        class95 var2 = new class95();
        var2.field1712 = arg1.method1891(-124);
        var2.field1715 = class127.method928(var2.field1712, (byte) 18);
        int var3 = 61 % ((arg0 + 37) / 37);
        return var2;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(IB[B)I")
    public static final int method616(int arg0, byte arg1, byte[] arg2) {
        field1582++;
        int var3 = -15 / ((68 - arg1) / 54);
        return class200.method1436(arg0, 20920, arg2, 0);
    }

    @OriginalMember(owner = "client!ub", name = "c", descriptor = "(II)Lfb;")
    public static final class29 method617(int arg0, int arg1) {
        field1577++;
        class29 var2 = (class29) class167.field2939.method302((long) arg0, 0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class40.field622.method1271(class1.method1(arg0, (byte) 11), arg1 ^ 0xFFFFF796, class83.method583(arg0, -128));
        class29 var4 = new class29();
        var4.field385 = arg0;
        if (var3 != null) {
            var4.method173(new class280(var3), arg1 + 81);
        }
        var4.method169((byte) -35);
        if (~var4.field427 != arg1) {
            var4.method165(109, method617(var4.field397, arg1), method617(var4.field427, 0));
        }
        if (var4.field382 != -1) {
            var4.method160(arg1 + 70, method617(var4.field372, 0), method617(var4.field382, 0));
        }
        if (!class124.field2211 && var4.field424) {
            var4.field438 = class34.field536;
            var4.field413 = false;
            var4.field383 = class169.field2982;
            var4.field357 = class31.field501;
            var4.field423 = 0;
        }
        class167.field2939.method297((long) arg0, var4, arg1 ^ 0x28AE);
        return var4;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(BI)V")
    public static final void method618(byte arg0, int arg1) {
        field1585++;
        class218.field3972.method298(true, arg1);
        int var2 = -37 / ((33 - arg0) / 36);
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(IILee;)V")
    private final void method619(int arg0, int arg1, class280 arg2) {
        if (arg0 == 249) {
            int var4 = arg2.method1907(arg1 ^ 0x41C0);
            if (this.field1581 == null) {
                int var5 = class152.method1094(-2085166256, var4);
                this.field1581 = new class25(var5);
            }
            for (int var6 = 0; var6 < var4; var6++) {
                boolean var7 = arg2.method1907(16832) == 1;
                int var8 = arg2.method1893((byte) -94);
                class222 var9;
                if (var7) {
                    var9 = new class82(arg2.method1889((byte) -67));
                } else {
                    var9 = new class236(arg2.method1872(118));
                }
                this.field1581.method137((long) var8, var9, -1);
            }
        }
        field1586++;
        if (arg1 != 0) {
            method615((byte) 70, (class280) null);
        }
    }

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "(BLee;)V")
    public final void method620(byte arg0, class280 arg1) {
        if (arg0 > -21) {
            return;
        }
        while (true) {
            int var3 = arg1.method1907(16832);
            if (var3 == 0) {
                field1590++;
                return;
            }
            this.method619(var3, 0, arg1);
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(III)I")
    public final int method621(int arg0, int arg1, int arg2) {
        if (arg2 != 3053) {
            method622(true, (class93) null);
        }
        field1588++;
        if (this.field1581 == null) {
            return arg1;
        } else {
            class236 var4 = (class236) this.field1581.method135((long) arg0, true);
            return var4 == null ? arg1 : var4.field4210;
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(ZLcf;)V")
    public static final void method622(boolean arg0, class93 arg1) {
        field1589++;
        if (class97.field1733 == null) {
            return;
        }
        int var2 = 0;
        if (arg0) {
            return;
        }
        long var3 = arg1.method679((byte) -110);
        if (var3 == 0L) {
            return;
        }
        while (var2 < class97.field1733.length && class97.field1733[var2].field4006 != var3) {
            var2++;
        }
        if (class97.field1733.length > var2 && class97.field1733[var2] != null) {
            class285.field5105.method1568(192, (byte) 112);
            class285.field5105.method1882(class97.field1733[var2].field4006, (byte) -126);
            class200.field3617++;
        }
    }

    @OriginalMember(owner = "client!ub", name = "c", descriptor = "(I)V")
    public static void method623(int arg0) {
        if (arg0 == 3008) {
            field1579 = null;
            field1578 = null;
            field1580 = null;
        }
    }
}
