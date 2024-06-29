import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public class class105 {

    @OriginalMember(owner = "client!ib", name = "h", descriptor = "Lsq;")
    private class117 field1657 = new class117();

    @OriginalMember(owner = "client!ib", name = "n", descriptor = "Luq;")
    private class111 field1663 = new class111();

    @OriginalMember(owner = "client!ib", name = "k", descriptor = "I")
    private int field1660;

    @OriginalMember(owner = "client!ib", name = "m", descriptor = "I")
    private int field1662;

    @OriginalMember(owner = "client!ib", name = "l", descriptor = "Lcv;")
    private class398 field1661;

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "I")
    public static int field1650 = 0;

    @OriginalMember(owner = "client!ib", name = "f", descriptor = "Lvp;")
    public static class123 field1655 = new class123(16, 8);

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "I")
    public static int field1651;

    @OriginalMember(owner = "client!ib", name = "c", descriptor = "I")
    public static int field1652;

    @OriginalMember(owner = "client!ib", name = "d", descriptor = "I")
    public static int field1653;

    @OriginalMember(owner = "client!ib", name = "e", descriptor = "I")
    public static int field1654;

    @OriginalMember(owner = "client!ib", name = "g", descriptor = "I")
    public static int field1656;

    @OriginalMember(owner = "client!ib", name = "i", descriptor = "I")
    public static int field1658;

    @OriginalMember(owner = "client!ib", name = "j", descriptor = "I")
    public static int field1659;

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(B)V")
    public static void method792(byte arg0) {
        field1655 = null;
        if (arg0 != -68) {
            field1650 = -28;
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(BLsq;J)V")
    public final void method793(byte arg0, class117 arg1, long arg2) {
        field1652++;
        if (arg0 != -91) {
            this.field1663 = null;
        }
        if (this.field1662 == 0) {
            class117 var5 = this.field1663.method814(0);
            var5.method2663(-112);
            var5.method855(arg0 ^ 0xFFFFFF96);
            if (this.field1657 == var5) {
                class117 var6 = this.field1663.method814(0);
                var6.method2663(-117);
                var6.method855(arg0 + 142);
            }
        } else {
            this.field1662--;
        }
        this.field1661.method2486(-108, arg1, arg2);
        this.field1663.method819(arg1, 1431655765);
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(ILti;)Ljava/lang/String;")
    public static final String method794(int arg0, class303 arg1) {
        field1658++;
        int var2 = -86 / ((arg0 - 20) / 34);
        return class399.method2488(0, 32767, arg1);
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(I)V")
    public final void method795(int arg0) {
        if (arg0 != 1) {
            this.field1662 = -110;
        }
        this.field1663.method815(1690797447);
        field1656++;
        this.field1661.method2476(0);
        this.field1657 = new class117();
        this.field1662 = this.field1660;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(Ljava/lang/String;B)V")
    public static final void method796(String arg0, byte arg1) {
        if (class82.field1358 == null) {
            class256.method1625(false);
        }
        field1651++;
        String[] var2 = class82.method650(false, '\n', arg0);
        if (arg1 <= 108) {
            method796(null, (byte) -90);
        }
        for (int var3 = 0; var3 < var2.length; var3++) {
            for (int var4 = class227.field3337; var4 > 0; var4--) {
                class82.field1358[var4] = class82.field1358[var4 - 1];
            }
            class82.field1358[0] = var2[var3];
            if (class82.field1358.length - 1 > class227.field3337) {
                class227.field3337++;
                if (class337.field5142 > 0) {
                    class337.field5142++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(IJ)Lsq;")
    public final class117 method797(int arg0, long arg1) {
        field1654++;
        if (arg0 != 50) {
            method794(-27, null);
        }
        class117 var4 = (class117) this.field1661.method2485(30, arg1);
        if (var4 != null) {
            this.field1663.method819(var4, 1431655765);
        }
        return var4;
    }

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "(I)V")
    public static final void method798(int arg0) {
        field1659++;
        if (!class301.field4287) {
            return;
        }
        class58 var1 = class155.method1123(class153.field2343, class114.field1817, (byte) -101);
        if (var1 != null && var1.field972 != null) {
            class519 var2 = new class519();
            var2.field7625 = var1;
            var2.field7627 = var1.field972;
            class150.method1086(var2);
        }
        class135.field2070 = -1;
        class301.field4287 = false;
        class508.field7429 = -1;
        if (arg0 == -28860 && var1 != null) {
            class139.method1027(var1, false);
        }
    }

    @OriginalMember(owner = "client!ib", name = "<init>", descriptor = "(I)V")
    public class105(int arg0) {
        this.field1660 = arg0;
        this.field1662 = arg0;
        int var2;
        for (var2 = 1; (var2 + var2) < arg0; var2 += var2) {
        }
        this.field1661 = new class398(var2);
    }
}
