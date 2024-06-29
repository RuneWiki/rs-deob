import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lda")
public class class484 {

    @OriginalMember(owner = "client!lda", name = "c", descriptor = "Z")
    public static boolean field6881 = false;

    @OriginalMember(owner = "client!lda", name = "k", descriptor = "Lpia;")
    public static class94 field6889 = new class94(4, 7);

    @OriginalMember(owner = "client!lda", name = "m", descriptor = "[Ljava/lang/String;")
    public static String[] field6891 = new String[100];

    @OriginalMember(owner = "client!lda", name = "b", descriptor = "I")
    public static int field6880;

    @OriginalMember(owner = "client!lda", name = "d", descriptor = "I")
    public static int field6882;

    @OriginalMember(owner = "client!lda", name = "e", descriptor = "I")
    public int field6883;

    @OriginalMember(owner = "client!lda", name = "f", descriptor = "I")
    public static int field6884;

    @OriginalMember(owner = "client!lda", name = "g", descriptor = "I")
    public static int field6885;

    @OriginalMember(owner = "client!lda", name = "h", descriptor = "I")
    public static int field6886;

    @OriginalMember(owner = "client!lda", name = "i", descriptor = "I")
    public static int field6887;

    @OriginalMember(owner = "client!lda", name = "j", descriptor = "I")
    public int field6888;

    @OriginalMember(owner = "client!lda", name = "l", descriptor = "I")
    public static int field6890;

    @OriginalMember(owner = "client!lda", name = "a", descriptor = "[Luha;")
    public class243[] field6879;

    @OriginalMember(owner = "client!lda", name = "a", descriptor = "(B)V", line = 4)
    public static void method2922(byte arg0) {
        if (arg0 == 127) {
            field6889 = null;
            field6891 = null;
        }
    }

    @OriginalMember(owner = "client!lda", name = "b", descriptor = "(B)V", line = 15)
    public static final void method2923(byte arg0) {
        for (class456 var1 = (class456) class228.field2651.method1753(arg0 ^ 0x16); var1 != null; var1 = (class456) class228.field2651.method1755(-65)) {
            if (var1.field6543.method3479(arg0 + 10)) {
                class459.method2805(var1.field6544, -70);
            } else {
                var1.field6543.method3923(-100);
                try {
                    var1.field6543.method3480(arg0 ^ 0xFFFF8139);
                } catch (Exception var5) {
                    class151.method936("TV: " + var1.field6544, var5, arg0 + 103);
                    class459.method2805(var1.field6544, -96);
                }
                if (!var1.field6534 && !var1.field6541) {
                    class122 var3 = var1.field6543.method3482(80);
                    if (var3 != null) {
                        class370 var4 = var3.method785((byte) -86);
                        if (var4 != null) {
                            var4.method2156(var1.field6537, arg0 - 23);
                            class597.field8470.method1689(var4);
                            var1.field6534 = true;
                        }
                    }
                }
            }
        }
        field6885++;
        if (arg0 != 22) {
            method2926(115, true, -35, false, null);
        }
    }

    @OriginalMember(owner = "client!lda", name = "a", descriptor = "(IIZ)B", line = 71)
    public static final byte method2924(int arg0, int arg1, boolean arg2) {
        field6886++;
        if (arg1 == 9) {
            if (!arg2) {
                method2924(33, -121, true);
            }
            return (byte) ((arg0 & 0x1) == 0 ? 1 : 2);
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!lda", name = "a", descriptor = "(III)Z", line = 90)
    public static final boolean method2925(int arg0, int arg1, int arg2) {
        field6884++;
        if (arg0 != -12944) {
            method2924(-86, -91, false);
        }
        return (arg2 & 0x10) != 0;
    }

    @OriginalMember(owner = "client!lda", name = "a", descriptor = "(IZIZLjava/lang/String;)V", line = 103)
    public static final void method2926(int arg0, boolean arg1, int arg2, boolean arg3, String arg4) {
        if (!arg3) {
            method2922((byte) 98);
        }
        field6887++;
        class15.method74(arg0, null, arg2, false, arg4, (byte) -119, arg1);
    }

    @OriginalMember(owner = "client!lda", name = "a", descriptor = "(Lig;I)V", line = 120)
    public final void method2927(class244 arg0, int arg1) {
        this.field6883 = arg0.method1458((byte) -97);
        field6880++;
        this.field6888 = arg0.method1476(-126);
        this.field6879 = new class243[arg0.method1423(-54)];
        class325[] var3 = class317.method1902(-99);
        int var4 = 0;
        if (arg1 != 31741) {
            field6881 = false;
        }
        while (this.field6879.length > var4) {
            this.field6879[var4] = this.method2928(arg0, (byte) -102, var3[arg0.method1423(-67)]);
            var4++;
        }
    }

    @OriginalMember(owner = "client!lda", name = "a", descriptor = "(Lig;BLhs;)Luha;", line = 160)
    private final class243 method2928(class244 arg0, byte arg1, class325 arg2) {
        field6882++;
        if (class614.field8794 == arg2) {
            return class164.method1017(true, arg0);
        }
        int var4 = 108 / ((arg1 - 12) / 40);
        if (class621.field8902 == arg2) {
            return class35.method160(arg0, (byte) 15);
        } else if (class709.field9994 == arg2) {
            return class60.method463(false, arg0);
        } else if (class675.field9561 == arg2) {
            return class584.method3360(false, arg0);
        } else if (class145.field1604 == arg2) {
            return class475.method2857(arg0, 8);
        } else if (class371.field4742 == arg2) {
            return class235.method1391(arg0, true);
        } else if (class366.field4667 == arg2) {
            return class347.method2064(arg0, 0);
        } else if (class294.field3621 == arg2) {
            return class525.method3079(arg0, -14514);
        } else if (class593.field8382 == arg2) {
            return class685.method3876(arg0, (byte) -118);
        } else if (class675.field9563 == arg2) {
            return class496.method2957(-110166866, arg0);
        } else {
            return null;
        }
    }
}
