import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qa")
public class class144 extends class166 {

    @OriginalMember(owner = "client!qa", name = "p", descriptor = "I")
    public static int field2936 = 0;

    @OriginalMember(owner = "client!qa", name = "u", descriptor = "Lcd;")
    private static class23 field2941 = class54.method414("Press (Wrecover a locked account(W on front page)3", -1);

    @OriginalMember(owner = "client!qa", name = "y", descriptor = "[I")
    public static int[] field2945 = new int[100];

    @OriginalMember(owner = "client!qa", name = "r", descriptor = "[B")
    public static byte[] field2938 = new byte[520];

    @OriginalMember(owner = "client!qa", name = "E", descriptor = "Lcd;")
    public static class23 field2951 = field2941;

    @OriginalMember(owner = "client!qa", name = "q", descriptor = "I")
    public static int field2937;

    @OriginalMember(owner = "client!qa", name = "t", descriptor = "I")
    public int field2940;

    @OriginalMember(owner = "client!qa", name = "w", descriptor = "I")
    public int field2943;

    @OriginalMember(owner = "client!qa", name = "x", descriptor = "I")
    public static int field2944;

    @OriginalMember(owner = "client!qa", name = "C", descriptor = "I")
    public int field2949;

    @OriginalMember(owner = "client!qa", name = "D", descriptor = "I")
    public int field2950;

    @OriginalMember(owner = "client!qa", name = "F", descriptor = "I")
    public int field2952;

    @OriginalMember(owner = "client!qa", name = "A", descriptor = "Lb;")
    public static class10 field2947;

    @OriginalMember(owner = "client!qa", name = "z", descriptor = "Lcd;")
    public class23 field2946;

    @OriginalMember(owner = "client!qa", name = "s", descriptor = "Lfa;")
    public class47 field2939;

    @OriginalMember(owner = "client!qa", name = "B", descriptor = "Lfa;")
    public class47 field2948;

    @OriginalMember(owner = "client!qa", name = "v", descriptor = "[Ljava/lang/Object;")
    public Object[] field2942;

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "(I)V")
    public static void method915(int arg0) {
        field2947 = null;
        field2938 = null;
        field2941 = null;
        field2951 = null;
        field2945 = null;
        if (arg0 != 9822) {
            field2938 = null;
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(BJ)V")
    public static final void method916(byte arg0, long arg1) {
        field2937++;
        if (arg1 == 0L) {
            return;
        }
        if (class82.field1780 >= 100 && class183.field3604 != 1 || class82.field1780 >= 200) {
            class107.method701(10945, class66.field1566, 0, class62.field1438);
            return;
        }
        class23 var3 = class39.method326(arg1, 92).method164(-12065);
        for (int var4 = 0; var4 < class82.field1780; var4++) {
            if (class17.field364[var4] == arg1) {
                class107.method701(10945, class66.field1566, 0, class3.method14(true, new class23[] { var3, class110.field2339 }));
                return;
            }
        }
        for (int var5 = 0; var5 < class157.field3145; var5++) {
            if (class189.field3758[var5] == arg1) {
                class107.method701(10945, class66.field1566, 0, class3.method14(true, new class23[] { class21.field440, var3, class23.field511 }));
                return;
            }
        }
        if (var3.method161(124, class134.field2790.field1345)) {
            class107.method701(10945, class66.field1566, 0, class175.field3490);
            return;
        }
        class200.field3958++;
        class5.field95[class82.field1780] = var3;
        class17.field364[class82.field1780] = arg1;
        class74.field1680[class82.field1780] = 0;
        class65.field1544[class82.field1780] = 0;
        int var6 = 86 % ((arg0 + 41) / 37);
        class82.field1780++;
        class1.field7 = class13.field296;
        class159.field3190.method631(110, -1);
        class159.field3190.method1199(arg1, -1898826808);
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(BIIII)I")
    public static final int method917(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        field2944++;
        if (arg0 < 47) {
            return -13;
        } else {
            int var5 = 65536 - class140.field2891[arg4 * 1024 / arg2] >> 1;
            return ((65536 - var5) * arg3 >> 16) + (arg1 * var5 >> 16);
        }
    }
}
