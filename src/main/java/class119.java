import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public class class119 extends class55 {

    @OriginalMember(owner = "client!v", name = "V", descriptor = "Z")
    public boolean field2636 = false;

    @OriginalMember(owner = "client!v", name = "fb", descriptor = "[I")
    private int[] field2646 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!v", name = "T", descriptor = "[I")
    private int[] field2634 = new int[6];

    @OriginalMember(owner = "client!v", name = "Q", descriptor = "I")
    public int field2632 = -1;

    @OriginalMember(owner = "client!v", name = "lb", descriptor = "[I")
    private int[] field2652 = new int[6];

    @OriginalMember(owner = "client!v", name = "P", descriptor = "[Z")
    public static boolean[] field2631 = new boolean[112];

    @OriginalMember(owner = "client!v", name = "O", descriptor = "Lo;")
    public static class84 field2630 = class15.method124("Invalid loginserver requested", 255);

    @OriginalMember(owner = "client!v", name = "cb", descriptor = "[Lkc;")
    public static class63[] field2643 = new class63[2048];

    @OriginalMember(owner = "client!v", name = "X", descriptor = "Lo;")
    public static class84 field2638 = class15.method124("@gre@", 255);

    @OriginalMember(owner = "client!v", name = "ib", descriptor = "Lo;")
    public static class84 field2649 = class15.method124("To ", 255);

    @OriginalMember(owner = "client!v", name = "gb", descriptor = "I")
    public static int field2647 = 0;

    @OriginalMember(owner = "client!v", name = "db", descriptor = "I")
    public static int field2644 = 0;

    @OriginalMember(owner = "client!v", name = "kb", descriptor = "Lo;")
    public static class84 field2651 = class15.method124("Connecting to update server", 255);

    @OriginalMember(owner = "client!v", name = "S", descriptor = "I")
    public static int field2633;

    @OriginalMember(owner = "client!v", name = "U", descriptor = "I")
    public static int field2635;

    @OriginalMember(owner = "client!v", name = "W", descriptor = "I")
    public static int field2637;

    @OriginalMember(owner = "client!v", name = "Y", descriptor = "I")
    public static int field2639;

    @OriginalMember(owner = "client!v", name = "Z", descriptor = "I")
    public static int field2640;

    @OriginalMember(owner = "client!v", name = "ab", descriptor = "I")
    public static int field2641;

    @OriginalMember(owner = "client!v", name = "bb", descriptor = "I")
    public static int field2642;

    @OriginalMember(owner = "client!v", name = "eb", descriptor = "I")
    public static int field2645;

    @OriginalMember(owner = "client!v", name = "hb", descriptor = "I")
    public static int field2648;

    @OriginalMember(owner = "client!v", name = "jb", descriptor = "[I")
    private int[] field2650;

    @OriginalMember(owner = "client!v", name = "c", descriptor = "(B)Lne;", line = 6)
    public final class83 method924(byte arg0) {
        field2633++;
        if (this.field2650 == null) {
            return null;
        }
        class83[] var2 = new class83[this.field2650.length];
        for (int var3 = 0; var3 < this.field2650.length; var3++) {
            var2[var3] = class83.method633(class84.field1898, this.field2650[var3], 0);
        }
        class83 var4;
        if (var2.length == 1) {
            var4 = var2[0];
        } else {
            var4 = new class83(var2, var2.length);
        }
        if (arg0 != 73) {
            field2649 = null;
        }
        for (int var5 = 0; var5 < 6 && this.field2634[var5] != 0; var5++) {
            var4.method610(this.field2634[var5], this.field2652[var5]);
        }
        return var4;
    }

    @OriginalMember(owner = "client!v", name = "f", descriptor = "(I)V", line = 56)
    public static void method925(int arg0) {
        field2630 = null;
        field2649 = null;
        field2638 = null;
        field2631 = null;
        if (arg0 != 0) {
            field2643 = null;
        }
        field2651 = null;
        field2643 = null;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(IZ)Lo;", line = 71)
    public static final class84 method926(int arg0, boolean arg1) {
        field2642++;
        if (!arg1) {
            field2649 = null;
        }
        return arg0 < 999999999 ? class62.method489(arg0, (byte) -125) : class19.field351;
    }

    @OriginalMember(owner = "client!v", name = "g", descriptor = "(I)Z", line = 87)
    public final boolean method927(int arg0) {
        field2648++;
        if (this.field2650 == null) {
            return true;
        }
        boolean var2 = true;
        int var3 = 0;
        if (arg0 != -1000000000) {
            return true;
        }
        while (this.field2650.length > var3) {
            if (!class84.field1898.method905(50, 0, this.field2650[var3])) {
                var2 = false;
            }
            var3++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/Class;", line = 121)
    public static final Class method928(int arg0, String arg1) throws ClassNotFoundException {
        field2640++;
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
        } else if (arg1.equals("F")) {
            return Float.TYPE;
        } else {
            if (arg0 != 29609) {
                field2651 = null;
            }
            if (arg1.equals("D")) {
                return Double.TYPE;
            } else if (arg1.equals("C")) {
                return Character.TYPE;
            } else {
                return Class.forName(arg1);
            }
        }
    }

    @OriginalMember(owner = "client!v", name = "h", descriptor = "(I)V", line = 161)
    public static final void method929(int arg0) {
        field2641++;
        if (arg0 != -13559) {
            method926(-94, true);
        }
        class125.field2775 = new class88();
    }

    @OriginalMember(owner = "client!v", name = "i", descriptor = "(I)Z", line = 178)
    public final boolean method930(int arg0) {
        field2635++;
        boolean var2 = true;
        int var3 = 0;
        if (arg0 < 85) {
            this.method927(-51);
        }
        while (var3 < 5) {
            if (this.field2646[var3] != -1 && !class84.field1898.method905(50, 0, this.field2646[var3])) {
                var2 = false;
            }
            var3++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!v", name = "j", descriptor = "(I)Lne;", line = 205)
    public final class83 method931(int arg0) {
        class83[] var2 = new class83[5];
        int var3 = 0;
        field2637++;
        for (int var4 = 0; var4 < 5; var4++) {
            if (this.field2646[var4] != -1) {
                var2[var3++] = class83.method633(class84.field1898, this.field2646[var4], 0);
            }
        }
        if (arg0 != -40) {
            method925(-124);
        }
        class83 var5 = new class83(var2, var3);
        for (int var6 = 0; var6 < 6 && this.field2634[var6] != 0; var6++) {
            var5.method610(this.field2634[var6], this.field2652[var6]);
        }
        return var5;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Leb;I)V", line = 284)
    public final void method932(class27 arg0, int arg1) {
        if (arg1 != 18688) {
            return;
        }
        field2645++;
        while (true) {
            int var3 = arg0.method231(255);
            if (var3 == 0) {
                return;
            }
            this.method933(arg0, var3, -60);
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Leb;II)V", line = 305)
    private final void method933(class27 arg0, int arg1, int arg2) {
        field2639++;
        if (arg1 == 1) {
            this.field2632 = arg0.method231(255);
        } else if (arg1 == 2) {
            int var4 = arg0.method231(255);
            this.field2650 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field2650[var5] = arg0.method227(arg2 + 187);
            }
        } else if (arg1 == 3) {
            this.field2636 = true;
        } else if (arg1 >= 40 && arg1 < 50) {
            this.field2634[arg1 - 40] = arg0.method227(class82.method595(arg2, -69));
        } else if (arg1 >= 50 && arg1 < 60) {
            this.field2652[arg1 - 50] = arg0.method227(127);
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field2646[arg1 - 60] = arg0.method227(127);
        }
        if (arg2 != -60) {
            method926(110, true);
        }
    }
}
