import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public class class186 extends class259 {

    @OriginalMember(owner = "client!bd", name = "U", descriptor = "Ljava/lang/String;")
    private String field2716 = "null";

    @OriginalMember(owner = "client!bd", name = "L", descriptor = "[I")
    public static int[] field2708 = new int[500];

    @OriginalMember(owner = "client!bd", name = "Q", descriptor = "Ljava/lang/String;")
    public static String field2712 = "skill: ";

    @OriginalMember(owner = "client!bd", name = "T", descriptor = "C")
    public char field2715;

    @OriginalMember(owner = "client!bd", name = "V", descriptor = "C")
    public char field2717;

    @OriginalMember(owner = "client!bd", name = "N", descriptor = "I")
    private int field2710;

    @OriginalMember(owner = "client!bd", name = "O", descriptor = "I")
    public static int field2711;

    @OriginalMember(owner = "client!bd", name = "R", descriptor = "I")
    public static int field2713;

    @OriginalMember(owner = "client!bd", name = "S", descriptor = "I")
    public static int field2714;

    @OriginalMember(owner = "client!bd", name = "W", descriptor = "I")
    public static int field2718;

    @OriginalMember(owner = "client!bd", name = "Y", descriptor = "I")
    public static int field2720;

    @OriginalMember(owner = "client!bd", name = "Z", descriptor = "I")
    public static int field2721;

    @OriginalMember(owner = "client!bd", name = "ab", descriptor = "I")
    public static int field2722;

    @OriginalMember(owner = "client!bd", name = "bb", descriptor = "I")
    public static int field2723;

    @OriginalMember(owner = "client!bd", name = "cb", descriptor = "I")
    public static int field2724;

    @OriginalMember(owner = "client!bd", name = "eb", descriptor = "I")
    public static int field2726;

    @OriginalMember(owner = "client!bd", name = "fb", descriptor = "I")
    public static int field2727;

    @OriginalMember(owner = "client!bd", name = "M", descriptor = "Ldb;")
    public class39 field2709;

    @OriginalMember(owner = "client!bd", name = "db", descriptor = "Ldb;")
    private class39 field2725;

    @OriginalMember(owner = "client!bd", name = "X", descriptor = "[[[B")
    public static byte[][][] field2719;

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(Lca;I)V")
    public final void method1210(class54 arg0, int arg1) {
        field2711++;
        while (true) {
            int var3 = arg0.method407(255);
            if (var3 == 0) {
                if (arg1 == 24002) {
                    return;
                } else {
                    this.field2716 = null;
                    return;
                }
            }
            this.method1221((byte) -117, var3, arg0);
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
    public static final String method1211(int arg0, String arg1) {
        field2720++;
        if (arg0 != 3) {
            field2708 = null;
        }
        String var2 = class37.method287(class37.method286(25077, arg1), (byte) 116);
        if (var2 == null) {
            var2 = "";
        }
        return var2;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(ILjk;B)Ljava/lang/String;")
    public static final String method1212(int arg0, class297 arg1, byte arg2) {
        field2723++;
        if (arg2 < 8) {
            return null;
        } else if (!client.method333(arg1).method1963(2912, arg0) && arg1.field4685 == null) {
            return null;
        } else if (arg1.field4609 == null || arg1.field4609.length <= arg0 || arg1.field4609[arg0] == null || arg1.field4609[arg0].trim().length() == 0) {
            return class112.field1712 ? "Hidden-" + arg0 : null;
        } else {
            return arg1.field4609[arg0];
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(BLjava/lang/String;)Z")
    public final boolean method1213(byte arg0, String arg1) {
        field2724++;
        if (this.field2709 == null) {
            return false;
        }
        if (this.field2725 == null) {
            this.method1217(arg0 - 250);
        }
        class121 var3 = (class121) this.field2725.method306(class111.method801((byte) -57, arg1), 16216);
        if (arg0 != 125) {
            return false;
        }
        while (var3 != null) {
            if (var3.field1800.equals(arg1)) {
                return true;
            }
            var3 = (class121) this.field2725.method311(arg0 - 15);
        }
        return false;
    }

    @OriginalMember(owner = "client!bd", name = "e", descriptor = "(II)Ln;")
    public static final class283 method1214(int arg0, int arg1) {
        field2726++;
        return arg1 == 5 ? (class283) class85.field1297.method306((long) arg0, 16216) : null;
    }

    @OriginalMember(owner = "client!bd", name = "f", descriptor = "(II)I")
    public static int method1215(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!bd", name = "g", descriptor = "(II)I")
    public final int method1216(int arg0, int arg1) {
        field2714++;
        if (this.field2709 == null) {
            return this.field2710;
        }
        if (arg1 != 500) {
            this.method1219((byte) 13);
        }
        class135 var3 = (class135) this.field2709.method306((long) arg0, 16216);
        return var3 == null ? this.field2710 : var3.field1975;
    }

    @OriginalMember(owner = "client!bd", name = "e", descriptor = "(I)V")
    private final void method1217(int arg0) {
        this.field2725 = new class39(this.field2709.method307(-65));
        field2721++;
        for (class83 var2 = (class83) this.field2709.method315((byte) -51); var2 != null; var2 = (class83) this.field2709.method310(-114)) {
            class121 var4 = new class121(var2.field1275, (int) var2.field2628);
            this.field2725.method309((byte) -8, var4, class111.method801((byte) -103, var2.field1275));
        }
        int var3 = -69 / ((38 - arg0) / 40);
    }

    @OriginalMember(owner = "client!bd", name = "f", descriptor = "(I)V")
    public static void method1218(int arg0) {
        if (arg0 != 0) {
            method1218(52);
        }
        field2708 = null;
        field2712 = null;
        field2719 = null;
    }

    @OriginalMember(owner = "client!bd", name = "c", descriptor = "(B)V")
    private final void method1219(byte arg0) {
        field2713++;
        this.field2725 = new class39(this.field2709.method307(-65));
        for (class135 var2 = (class135) this.field2709.method315((byte) -85); var2 != null; var2 = (class135) this.field2709.method310(-55)) {
            class135 var4 = new class135((int) var2.field2628);
            this.field2725.method309((byte) -8, var4, (long) var2.field1975);
        }
        int var3 = -57 / ((-arg0 - 38) / 61);
    }

    @OriginalMember(owner = "client!bd", name = "h", descriptor = "(II)Ljava/lang/String;")
    public final String method1220(int arg0, int arg1) {
        if (arg1 != 10861) {
            this.field2725 = null;
        }
        field2718++;
        if (this.field2709 == null) {
            return this.field2716;
        } else {
            class83 var3 = (class83) this.field2709.method306((long) arg0, arg1 ^ 0x1535);
            return var3 == null ? this.field2716 : var3.field1275;
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(BILca;)V")
    private final void method1221(byte arg0, int arg1, class54 arg2) {
        field2727++;
        int var4 = -16 % ((arg0 + 31) / 33);
        if (arg1 == 1) {
            this.field2717 = class1.method1((byte) 19, arg2.method459(false));
        } else if (arg1 == 2) {
            this.field2715 = class1.method1((byte) 19, arg2.method459(false));
        } else if (arg1 == 3) {
            this.field2716 = arg2.method439((byte) -58);
        } else if (arg1 == 4) {
            this.field2710 = arg2.method420((byte) 96);
        } else if (arg1 == 5 || arg1 == 6) {
            int var5 = arg2.method423(50);
            this.field2709 = new class39(class239.method1637(var5, 0));
            for (int var6 = 0; var6 < var5; var6++) {
                int var7 = arg2.method420((byte) -127);
                class181 var8;
                if (arg1 == 5) {
                    var8 = new class83(arg2.method439((byte) 75));
                } else {
                    var8 = new class135(arg2.method420((byte) -96));
                }
                this.field2709.method309((byte) -8, var8, (long) var7);
            }
        }
    }

    @OriginalMember(owner = "client!bd", name = "i", descriptor = "(II)Z")
    public final boolean method1222(int arg0, int arg1) {
        field2722++;
        if (this.field2709 == null) {
            return false;
        }
        if (arg0 != 0) {
            field2712 = null;
        }
        if (this.field2725 == null) {
            this.method1219((byte) 53);
        }
        class135 var3 = (class135) this.field2725.method306((long) arg1, arg0 + 16216);
        return var3 != null;
    }
}
