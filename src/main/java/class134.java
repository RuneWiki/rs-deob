import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uj")
public class class134 {

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "Lmh;")
    public static class128 field2326 = class22.method156(125, "Ladevorgang )2 bitte warten Sie)3");

    @OriginalMember(owner = "client!uj", name = "c", descriptor = "[Lbj;")
    public static class51[] field2328 = new class51[27];

    @OriginalMember(owner = "client!uj", name = "f", descriptor = "S")
    public static short field2331 = 1;

    @OriginalMember(owner = "client!uj", name = "k", descriptor = "[S")
    public static short[] field2336 = new short[] { 960, 957, -21568, -21571, 22464 };

    @OriginalMember(owner = "client!uj", name = "h", descriptor = "Lmh;")
    public static class128 field2333 = class22.method156(127, "settings");

    @OriginalMember(owner = "client!uj", name = "l", descriptor = "Lmh;")
    public static class128 field2337 = class22.method156(126, "Benutzen");

    @OriginalMember(owner = "client!uj", name = "j", descriptor = "I")
    public static int field2335 = 0;

    @OriginalMember(owner = "client!uj", name = "i", descriptor = "F")
    public static float field2334;

    @OriginalMember(owner = "client!uj", name = "b", descriptor = "I")
    public static int field2327;

    @OriginalMember(owner = "client!uj", name = "d", descriptor = "I")
    public static int field2329;

    @OriginalMember(owner = "client!uj", name = "e", descriptor = "I")
    public static int field2330;

    @OriginalMember(owner = "client!uj", name = "g", descriptor = "I")
    public static int field2332;

    @OriginalMember(owner = "client!uj", name = "m", descriptor = "I")
    public static int field2338;

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(I)V", line = 9)
    public static void method892(int arg0) {
        field2328 = null;
        field2336 = null;
        if (arg0 < 118) {
            field2334 = 0.52477354F;
        }
        field2326 = null;
        field2333 = null;
        field2337 = null;
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(ZLej;)V", line = 38)
    public static final void method893(boolean arg0, class149 arg1) {
        field2329++;
        arg1.field2562 = arg0;
        if (arg1.field2559 != null) {
            arg1.field2559.field535 = 0;
        }
        for (class149 var2 = arg1.method387(); var2 != null; var2 = arg1.method397()) {
            method893(false, var2);
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(ILmh;I)V", line = 89)
    public static final void method894(int arg0, class128 arg1, int arg2) {
        class313.field5288++;
        field2330++;
        if (arg0 >= -43) {
            method895(81, 110, -58);
        }
        class71.field1320.method570(187, -1);
        class71.field1320.method1344(88, arg1.method819((byte) 105));
        class71.field1320.method1352(7528, arg2);
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(III)I", line = 104)
    public static final int method895(int arg0, int arg1, int arg2) {
        field2327++;
        int var3 = arg1;
        while (arg2 > 0) {
            var3 = var3 << 1 | arg0 & 0x1;
            arg2--;
            arg0 >>>= 0x1;
        }
        return var3;
    }
}
