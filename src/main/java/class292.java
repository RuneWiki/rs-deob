import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ks")
public class class292 extends class47 {

    @OriginalMember(owner = "client!ks", name = "C", descriptor = "Lrc;")
    public static class108 field4128 = new class108(49, -1);

    @OriginalMember(owner = "client!ks", name = "L", descriptor = "Lch;")
    public static class151 field4136 = new class151("Loaded sprites", "Sprites geladen.", "Sprites chargés", "Sprites carregados");

    @OriginalMember(owner = "client!ks", name = "B", descriptor = "I")
    public int field4127;

    @OriginalMember(owner = "client!ks", name = "E", descriptor = "I")
    public int field4130;

    @OriginalMember(owner = "client!ks", name = "I", descriptor = "I")
    public int field4133;

    @OriginalMember(owner = "client!ks", name = "J", descriptor = "I")
    public static int field4134;

    @OriginalMember(owner = "client!ks", name = "M", descriptor = "I")
    public static int field4137;

    @OriginalMember(owner = "client!ks", name = "P", descriptor = "I")
    public int field4140;

    @OriginalMember(owner = "client!ks", name = "F", descriptor = "Lhq;")
    public class30 field4131;

    @OriginalMember(owner = "client!ks", name = "G", descriptor = "Ljava/lang/String;")
    public String field4132;

    @OriginalMember(owner = "client!ks", name = "K", descriptor = "[I")
    public int[] field4135;

    @OriginalMember(owner = "client!ks", name = "N", descriptor = "[I")
    public int[] field4138;

    @OriginalMember(owner = "client!ks", name = "D", descriptor = "[Lwk;")
    public class155[] field4129;

    @OriginalMember(owner = "client!ks", name = "O", descriptor = "[Ljava/lang/String;")
    public String[] field4139;

    @OriginalMember(owner = "client!ks", name = "d", descriptor = "(I)I")
    public static final int method1910(int arg0) {
        field4137++;
        if ((double) class330.field4574 == 3.0D) {
            return 37;
        } else if ((double) class330.field4574 == 4.0D) {
            return 50;
        } else if ((double) class330.field4574 == 6.0D) {
            return 75;
        } else {
            if (arg0 != 100) {
                method1911((byte) -60);
            }
            return (double) class330.field4574 == 8.0D ? 100 : 200;
        }
    }

    @OriginalMember(owner = "client!ks", name = "d", descriptor = "(B)V")
    public static void method1911(byte arg0) {
        if (arg0 >= -127) {
            method1911((byte) 33);
        }
        field4136 = null;
        field4128 = null;
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(IIZLae;B)V")
    public static final void method1912(int arg0, int arg1, boolean arg2, class172 arg3, byte arg4) {
        field4134++;
        int var5 = arg3.field2554;
        if (arg3.field2473 == 0) {
            arg3.field2554 = arg3.field2580;
        } else if (arg3.field2473 == 1) {
            arg3.field2554 = arg0 - arg3.field2580;
        } else if (arg3.field2473 == 2) {
            arg3.field2554 = arg3.field2580 * arg0 >> 14;
        }
        int var6 = arg3.field2579;
        if (arg3.field2511 == 0) {
            arg3.field2579 = arg3.field2545;
        } else if (arg3.field2511 == 1) {
            arg3.field2579 = arg1 - arg3.field2545;
        } else if (arg3.field2511 == 2) {
            arg3.field2579 = arg3.field2545 * arg1 >> 14;
        }
        if (arg4 != 67) {
            field4128 = null;
        }
        if (arg3.field2473 == 4) {
            arg3.field2554 = arg3.field2579 * arg3.field2534 / arg3.field2493;
        }
        if (arg3.field2511 == 4) {
            arg3.field2579 = arg3.field2554 * arg3.field2493 / arg3.field2534;
        }
        if (class79.field1162 && (client.method547(arg3).field1544 != 0 || arg3.field2602 == 0)) {
            if (arg3.field2579 < 5 && arg3.field2554 < 5) {
                arg3.field2579 = 5;
                arg3.field2554 = 5;
            } else {
                if (arg3.field2579 <= 0) {
                    arg3.field2579 = 5;
                }
                if (arg3.field2554 <= 0) {
                    arg3.field2554 = 5;
                }
            }
        }
        if (class136.field1892 == arg3.field2624) {
            class486.field6890 = arg3;
        }
        if (arg2 && arg3.field2563 != null && arg3.field2554 != var5 || arg3.field2579 != var6) {
            class472 var7 = new class472();
            var7.field6642 = arg3;
            var7.field6649 = arg3.field2563;
            class262.field3780.method766(var7, -1);
        }
    }

    static {
        new class151("To talk, start each line of chat with the / symbol.", "Leite eine Zeile mit / ein, um hier zu chatten.", "Pour parler, insérez le symbole / au début de chaque ligne.", "Para falar, comece cada linha de conversa com o símbolo /.");
    }
}
