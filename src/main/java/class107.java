import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kg")
public class class107 {

    @OriginalMember(owner = "client!kg", name = "f", descriptor = "J")
    public long field1590 = 0L;

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "Lma;")
    public static class5 field1585 = class12.method119("Fallen lassen", (byte) 74);

    @OriginalMember(owner = "client!kg", name = "h", descriptor = "Lma;")
    public static class5 field1592 = class12.method119("Spielwelt erstellt)3", (byte) 86);

    @OriginalMember(owner = "client!kg", name = "j", descriptor = "I")
    public static int field1594 = 0;

    @OriginalMember(owner = "client!kg", name = "o", descriptor = "S")
    public static short field1599 = 32767;

    @OriginalMember(owner = "client!kg", name = "b", descriptor = "I")
    public static int field1586;

    @OriginalMember(owner = "client!kg", name = "c", descriptor = "I")
    public int field1587;

    @OriginalMember(owner = "client!kg", name = "d", descriptor = "I")
    public static int field1588;

    @OriginalMember(owner = "client!kg", name = "g", descriptor = "I")
    public int field1591;

    @OriginalMember(owner = "client!kg", name = "i", descriptor = "I")
    public static int field1593;

    @OriginalMember(owner = "client!kg", name = "k", descriptor = "I")
    public int field1595;

    @OriginalMember(owner = "client!kg", name = "l", descriptor = "I")
    public int field1596;

    @OriginalMember(owner = "client!kg", name = "m", descriptor = "I")
    public int field1597;

    @OriginalMember(owner = "client!kg", name = "n", descriptor = "I")
    public int field1598;

    @OriginalMember(owner = "client!kg", name = "p", descriptor = "I")
    public int field1600;

    @OriginalMember(owner = "client!kg", name = "q", descriptor = "I")
    public int field1601;

    @OriginalMember(owner = "client!kg", name = "r", descriptor = "I")
    public int field1602;

    @OriginalMember(owner = "client!kg", name = "s", descriptor = "I")
    public int field1603;

    @OriginalMember(owner = "client!kg", name = "t", descriptor = "I")
    public int field1604;

    @OriginalMember(owner = "client!kg", name = "u", descriptor = "I")
    public static int field1605;

    @OriginalMember(owner = "client!kg", name = "e", descriptor = "Lkb;")
    public class280 field1589;

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(IZZI)I", line = 18)
    public static final int method673(int arg0, boolean arg1, boolean arg2, int arg3) {
        field1586++;
        class255 var4 = (class255) class300.field5062.method1372(arg1, (long) arg0);
        if (var4 == null) {
            return 0;
        }
        int var5 = 0;
        for (int var6 = 0; var6 < var4.field4355.length; var6++) {
            if (var4.field4355[var6] >= 0 && class100.field1495 > var4.field4355[var6]) {
                class196 var7 = class235.method1664(107, var4.field4355[var6]);
                if (var7.field3065 != null) {
                    class276 var8 = (class276) var7.field3065.method1372(arg1, (long) arg3);
                    if (var8 != null) {
                        if (arg2) {
                            var5 += var4.field4360[var6] * var8.field4703;
                        } else {
                            var5 += var8.field4703;
                        }
                    }
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(ZLma;)V", line = 75)
    public static final void method674(boolean arg0, class5 arg1) {
        int var2 = class190.method1244(arg1, 1);
        field1593++;
        if (var2 == -1) {
            return;
        }
        class153.field2240 = class46.field704.field396[var2] - class206.field3284;
        int var3 = class153.field2240 - ((int) ((float) class158.field2377.field4228 / class98.field1473));
        int var4 = class153.field2240 + ((int) ((float) class158.field2377.field4228 / class98.field1473));
        if (!arg0) {
            return;
        }
        class171.field2634 = class97.field1460 - (1 - class289.field4918) - class46.field704.field395[var2];
        if (var3 < 0) {
            class153.field2240 = (int) ((float) class158.field2377.field4228 / class98.field1473);
        }
        if (var4 > class139.field2066) {
            class153.field2240 = class139.field2066 - ((int) ((float) class158.field2377.field4228 / class98.field1473));
        }
        int var5 = (int) ((float) class158.field2377.field4190 / class98.field1473) + class171.field2634;
        int var6 = class171.field2634 - ((int) ((float) class158.field2377.field4190 / class98.field1473));
        if (var6 < 0) {
            class171.field2634 = (int) ((float) class158.field2377.field4190 / class98.field1473);
        }
        if (var5 > class97.field1460) {
            class171.field2634 = class97.field1460 - (int) ((float) class158.field2377.field4190 / class98.field1473);
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(II)Lcb;", line = 125)
    public static final class201 method675(int arg0, int arg1) {
        if (arg1 <= 41) {
            method674(true, (class5) null);
        }
        field1605++;
        class201 var2 = (class201) class209.field3312.method521((long) arg0, (byte) 80);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class185.field2912.method1342(51, 16, arg0);
        class201 var4 = new class201();
        if (var3 != null) {
            var4.method1319(true, new class221(var3));
        }
        class209.field3312.method519((byte) -95, var4, (long) arg0);
        return var4;
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(Z)V", line = 152)
    public static void method676(boolean arg0) {
        field1592 = null;
        field1585 = null;
        if (!arg0) {
            field1594 = 13;
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(B)Lvd;", line = 166)
    public static final class19 method677(byte arg0) {
        field1588++;
        int var1 = 37 / ((-arg0 - 39) / 57);
        try {
            return (class19) Class.forName("hb").getDeclaredConstructor().newInstance();
        } catch (Throwable var3) {
            return null;
        }
    }
}
