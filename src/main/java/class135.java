import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mg")
public class class135 {

    @OriginalMember(owner = "client!mg", name = "f", descriptor = "Lvd;")
    public static class222 field2604 = class212.method1357("(Udns", 10731);

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "Loe;")
    public static class153 field2600 = new class153();

    @OriginalMember(owner = "client!mg", name = "h", descriptor = "[I")
    public static int[] field2606 = new int[32];

    @OriginalMember(owner = "client!mg", name = "i", descriptor = "Lvd;")
    public static class222 field2607 = class212.method1357(" )2>", 10731);

    @OriginalMember(owner = "client!mg", name = "k", descriptor = "I")
    public static int field2609 = 0;

    @OriginalMember(owner = "client!mg", name = "l", descriptor = "Lvd;")
    public static class222 field2610 = class212.method1357("Clientscript error )2 check log for details", 10731);

    @OriginalMember(owner = "client!mg", name = "n", descriptor = "Lig;")
    public static class93 field2612;

    @OriginalMember(owner = "client!mg", name = "o", descriptor = "Lvd;")
    public static class222 field2613;

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "I")
    public static int field2599;

    @OriginalMember(owner = "client!mg", name = "c", descriptor = "I")
    public static int field2601;

    @OriginalMember(owner = "client!mg", name = "d", descriptor = "I")
    public static int field2602;

    @OriginalMember(owner = "client!mg", name = "e", descriptor = "I")
    public static int field2603;

    @OriginalMember(owner = "client!mg", name = "g", descriptor = "I")
    public static int field2605;

    @OriginalMember(owner = "client!mg", name = "j", descriptor = "Lme;")
    public static class133 field2608;

    @OriginalMember(owner = "client!mg", name = "m", descriptor = "Lbg;")
    public static class19 field2611;

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(Z)J")
    public static final synchronized long method849(boolean arg0) {
        field2601++;
        if (!arg0) {
            return -49L;
        }
        long var1 = System.currentTimeMillis();
        if (var1 < class155.field2962) {
            class67.field1270 += class155.field2962 - var1;
        }
        class155.field2962 = var1;
        return var1 + class67.field1270;
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(I)V")
    public static final void method850(int arg0) {
        try {
            if (arg0 >= -29) {
                field2604 = null;
            }
            if (class68.field1280 == null) {
                class68.field1280 = new class66(class191.field3509, class234.method1531(new class222[] { class63.field1154, class56.method414(-119, class103.field1915), class57.field1068 }, -10949).method1418(true));
            } else {
                byte[] var1 = class68.field1280.method454(true);
                if (var1 != null) {
                    class109 var2 = new class109(var1);
                    class201.field3665 = var2.method675(2);
                    class99.field1863 = new class151[class201.field3665];
                    for (int var3 = 0; var3 < class201.field3665; var3++) {
                        class151 var4 = class99.field1863[var3] = new class151();
                        int var5 = var2.method675(2);
                        var4.field2926 = (var5 & 0x8000) != 0;
                        var4.field2923 = var5 & 0x7FFF;
                        var4.field2920 = var2.method674(-60);
                        var4.field2916 = var2.method700((byte) 64);
                        var4.field2927 = var3;
                        var4.field2930 = class17.method149(var2.method675(2), (byte) -32);
                    }
                    class32.method260(class99.field1863, class42.field894, class99.field1863.length - 1, 1642, 0, class227.field4247);
                    class39.field862 = true;
                    class68.field1280 = null;
                }
            }
        } catch (Exception var7) {
            var7.printStackTrace();
            class68.field1280 = null;
        }
        field2599++;
    }

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "(I)V")
    public static final void method851(int arg0) {
        class11 var1 = class176.field3301;
        synchronized (class176.field3301) {
            class186.field3433++;
            class94.field1773 = class107.field1981;
            class94.field1769 = class72.field1424;
            class137.field2651 = class165.field3116;
            class222.field4168 = class6.field100;
            class64.field1168 = class216.field4008;
            class153.field2938 = class131.field2544;
            class222.field4166 = class111.field2101;
            class6.field100 = arg0;
        }
        field2603++;
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/Class;")
    public static final Class method852(int arg0, String arg1) throws ClassNotFoundException {
        field2605++;
        if (arg1.equals("B")) {
            return Byte.TYPE;
        } else if (arg1.equals("I")) {
            return Integer.TYPE;
        } else if (arg1.equals("S")) {
            return Short.TYPE;
        } else if (arg1.equals("J")) {
            return Long.TYPE;
        } else if (arg1.equals("Z")) {
            return Boolean.TYPE;
        } else {
            int var2 = -9 % ((26 - arg0) / 48);
            if (arg1.equals("F")) {
                return Float.TYPE;
            } else if (arg1.equals("D")) {
                return Double.TYPE;
            } else if (arg1.equals("C")) {
                return Character.TYPE;
            } else {
                return Class.forName(arg1);
            }
        }
    }

    @OriginalMember(owner = "client!mg", name = "c", descriptor = "(I)V")
    public static void method853(int arg0) {
        field2613 = null;
        field2600 = null;
        field2608 = null;
        field2606 = null;
        field2612 = null;
        if (arg0 != -22268) {
            field2604 = null;
        }
        field2607 = null;
        field2604 = null;
        field2611 = null;
        field2610 = null;
    }

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field2606[var1] = var0 - 1;
            var0 += var0;
        }
        field2612 = new class93(64);
        field2613 = null;
    }
}
