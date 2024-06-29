import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ee")
public class class116 {

    @OriginalMember(owner = "client!ee", name = "f", descriptor = "Loa;")
    private class157 field1614 = new class157();

    @OriginalMember(owner = "client!ee", name = "l", descriptor = "I")
    private int field1620;

    @OriginalMember(owner = "client!ee", name = "j", descriptor = "I")
    private int field1618;

    @OriginalMember(owner = "client!ee", name = "g", descriptor = "Lfa;")
    private class371 field1615;

    @OriginalMember(owner = "client!ee", name = "n", descriptor = "Lsh;")
    public static class472 field1622 = new class472(104, 4);

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "I")
    public static int field1609;

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "I")
    public static int field1610;

    @OriginalMember(owner = "client!ee", name = "c", descriptor = "I")
    public static int field1611;

    @OriginalMember(owner = "client!ee", name = "d", descriptor = "I")
    public static int field1612;

    @OriginalMember(owner = "client!ee", name = "e", descriptor = "I")
    public static int field1613;

    @OriginalMember(owner = "client!ee", name = "h", descriptor = "I")
    public static int field1616;

    @OriginalMember(owner = "client!ee", name = "k", descriptor = "I")
    public static int field1619;

    @OriginalMember(owner = "client!ee", name = "m", descriptor = "I")
    public static int field1621;

    @OriginalMember(owner = "client!ee", name = "o", descriptor = "I")
    public static int field1623;

    @OriginalMember(owner = "client!ee", name = "p", descriptor = "I")
    public static int field1624;

    @OriginalMember(owner = "client!ee", name = "q", descriptor = "I")
    public static int field1625;

    @OriginalMember(owner = "client!ee", name = "r", descriptor = "I")
    public static int field1626;

    @OriginalMember(owner = "client!ee", name = "s", descriptor = "Liu;")
    public static class397 field1627;

    @OriginalMember(owner = "client!ee", name = "i", descriptor = "Lui;")
    public static class451 field1617;

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(B)V", line = 3)
    public static void method827(byte arg0) {
        field1617 = null;
        field1627 = null;
        if (arg0 == 48) {
            field1622 = null;
        }
    }

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "(B)V", line = 17)
    public final void method828(byte arg0) {
        field1624++;
        if (arg0 >= -39) {
            this.method833((byte) 76, 121);
        }
        for (class40 var2 = (class40) this.field1614.method1070((byte) -48); var2 != null; var2 = (class40) this.field1614.method1073(115)) {
            if (var2.method302((byte) 86)) {
                var2.method283(2);
                var2.method701(-78);
                this.field1620 += var2.field559;
            }
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(I)I", line = 43)
    public final int method829(int arg0) {
        int var2 = -6 % ((45 - arg0) / 55);
        field1616++;
        return this.field1618;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(BILui;)Lis;", line = 54)
    public static final class1 method830(byte arg0, int arg1, class451 arg2) {
        field1623++;
        if (arg0 <= 119) {
            method827((byte) -82);
        }
        byte[] var3 = arg2.method2667((byte) -125, arg1);
        return var3 == null ? null : new class1(var3);
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(Lvk;BILjava/lang/Object;)V", line = 73)
    private final void method831(class308 arg0, byte arg1, int arg2, Object arg3) {
        field1610++;
        if (this.field1618 < arg2) {
            throw new IllegalStateException("s>cs");
        }
        this.method832(arg0, 104);
        this.field1620 -= arg2;
        while (this.field1620 < 0) {
            class40 var6 = (class40) this.field1614.method1069((byte) 89);
            this.method838(var6, true);
        }
        if (arg1 >= -66) {
            this.method837((class308) null, -18);
        }
        class479 var5 = new class479(arg0, arg3, arg2);
        this.field1615.method2307(arg0.method1913(27314), var5, (byte) -103);
        this.field1614.method1075((byte) -18, var5);
        var5.field1255 = 0L;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(Lvk;I)V", line = 107)
    private final void method832(class308 arg0, int arg1) {
        field1621++;
        long var3 = arg0.method1913(27314);
        for (class40 var5 = (class40) this.field1615.method2305(var3, (byte) 91); var5 != null; var5 = (class40) this.field1615.method2306((byte) 21)) {
            if (var5.field558.method1914(-126, arg0)) {
                this.method838(var5, true);
                break;
            }
        }
        if (arg1 != 104) {
            this.method836((class308) null, (Object) null, 4);
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(BI)V", line = 132)
    public final void method833(byte arg0, int arg1) {
        if (class334.field4980 != null) {
            for (class40 var3 = (class40) this.field1614.method1070((byte) -40); var3 != null; var3 = (class40) this.field1614.method1073(-122)) {
                if (var3.method302((byte) 117)) {
                    if (var3.method306(arg0 - 7708) == null) {
                        var3.method283(2);
                        var3.method701(-67);
                        this.field1620 += var3.field559;
                    }
                } else if (++var3.field1255 > (long) arg1) {
                    class40 var4 = class334.field4980.method2467(98, var3);
                    this.field1615.method2307(var3.field436, var4, (byte) 126);
                    class156.method1061((byte) -112, var3, var4);
                    var3.method283(2);
                    var3.method701(-37);
                }
            }
        }
        field1609++;
        if (arg0 != -20) {
            field1622 = null;
        }
    }

    @OriginalMember(owner = "client!ee", name = "c", descriptor = "(B)V", line = 181)
    public final void method834(byte arg0) {
        this.field1614.method1071(27536);
        field1619++;
        if (arg0 >= 63) {
            this.field1615.method2299((byte) -79);
            this.field1620 = this.field1618;
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(ILje;)Z", line = 203)
    public static final boolean method835(int arg0, class178 arg1) {
        if (arg0 != -958) {
            method830((byte) 8, 30, (class451) null);
        }
        field1611++;
        if (class73.field984 == arg1.field2577) {
            class147.field2072 = 250;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(Lvk;Ljava/lang/Object;I)V", line = 224)
    public final void method836(class308 arg0, Object arg1, int arg2) {
        if (arg2 == 104) {
            field1625++;
            this.method831(arg0, (byte) -123, 1, arg1);
        }
    }

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "(Lvk;I)Ljava/lang/Object;", line = 235)
    public final Object method837(class308 arg0, int arg1) {
        field1613++;
        long var3 = arg0.method1913(27314);
        if (arg1 >= -71) {
            return null;
        }
        for (class40 var5 = (class40) this.field1615.method2305(var3, (byte) 45); var5 != null; var5 = (class40) this.field1615.method2306((byte) 21)) {
            if (var5.field558.method1914(-111, arg0)) {
                Object var6 = var5.method306(-7728);
                if (var6 != null) {
                    if (var5.method302((byte) 120)) {
                        class479 var7 = new class479(arg0, var6, var5.field559);
                        this.field1615.method2307(var5.field436, var7, (byte) 117);
                        this.field1614.method1075((byte) -120, var7);
                        var7.field1255 = 0L;
                        var5.method283(2);
                        var5.method701(-80);
                    } else {
                        this.field1614.method1075((byte) -42, var5);
                        var5.field1255 = 0L;
                    }
                    return var6;
                }
                var5.method283(2);
                var5.method701(-94);
                this.field1620 += var5.field559;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(Lmn;Z)V", line = 289)
    private final void method838(class40 arg0, boolean arg1) {
        field1612++;
        if (arg0 != null) {
            arg0.method283(2);
            arg0.method701(-77);
            this.field1620 += arg0.field559;
        }
        if (!arg1) {
            field1627 = null;
        }
    }

    @OriginalMember(owner = "client!ee", name = "<init>", descriptor = "(I)V", line = 310)
    public class116(int arg0) {
        this.field1620 = arg0;
        this.field1618 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field1615 = new class371(var2);
    }

    @OriginalMember(owner = "client!ee", name = "d", descriptor = "(B)I", line = 329)
    public final int method839(byte arg0) {
        field1626++;
        if (arg0 >= -54) {
            this.field1615 = null;
        }
        return this.field1620;
    }
}
