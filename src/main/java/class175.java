import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qg")
public class class175 {

    @OriginalMember(owner = "client!qg", name = "e", descriptor = "Leg;")
    public static class37 field2929 = class174.method1167("::serverjs5drop", -94);

    @OriginalMember(owner = "client!qg", name = "d", descriptor = "Lid;")
    public static class226 field2928 = new class226();

    @OriginalMember(owner = "client!qg", name = "j", descriptor = "[I")
    public static int[] field2934 = new int[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

    @OriginalMember(owner = "client!qg", name = "m", descriptor = "Leg;")
    public static class37 field2937 = class174.method1167("", 95);

    @OriginalMember(owner = "client!qg", name = "k", descriptor = "Leg;")
    public static class37 field2935 = class174.method1167("Ladevorgang )2 bitte warten Sie)3", -16);

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "I")
    public static int field2925;

    @OriginalMember(owner = "client!qg", name = "b", descriptor = "I")
    public static int field2926;

    @OriginalMember(owner = "client!qg", name = "c", descriptor = "I")
    public static int field2927;

    @OriginalMember(owner = "client!qg", name = "f", descriptor = "I")
    public static int field2930;

    @OriginalMember(owner = "client!qg", name = "g", descriptor = "I")
    public static int field2931;

    @OriginalMember(owner = "client!qg", name = "h", descriptor = "I")
    public static int field2932;

    @OriginalMember(owner = "client!qg", name = "i", descriptor = "I")
    public static int field2933;

    @OriginalMember(owner = "client!qg", name = "l", descriptor = "I")
    public static int field2936;

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(III)J")
    public static final long method1170(int arg0, int arg1, int arg2) {
        class111 var3 = class286.field5048[arg0][arg1][arg2];
        if (var3 == null) {
            return 0L;
        }
        for (int var4 = 0; var4 < var3.field1880; var4++) {
            class27 var5 = var3.field1858[var4];
            if ((var5.field381 >> 29 & 0x3L) == 2L && var5.field402 == arg1 && var5.field397 == arg2) {
                return var5.field381;
            }
        }
        return 0L;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(II)Z")
    public static final boolean method1171(int arg0, int arg1) {
        if (arg1 == -499336730) {
            field2925++;
            return arg0 >= 97 && arg0 <= 122 || arg0 >= 65 && arg0 <= 90;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(Ljava/lang/String;B)V")
    public static final void method1172(String arg0, byte arg1) {
        field2926++;
        if (arg1 < -25) {
            System.out.println("Bad " + arg0 + ", Usage: worldid, <live/rc/wip>, <english/german>, <game0/game1>");
            System.exit(1);
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(I)V")
    public static void method1173(int arg0) {
        field2935 = null;
        field2928 = null;
        field2937 = null;
        field2934 = null;
        field2929 = null;
        if (arg0 != 16777215) {
            field2928 = null;
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(Z)V")
    public static final void method1174(boolean arg0) {
        int var1 = class160.field2676;
        field2933++;
        int var2 = class62.field1011;
        int var3 = class137.field2348;
        int var4 = class146.field2482;
        if (arg0) {
            field2936 = -117;
        }
        int var5 = 6116423;
        class122.method873(var1, var2, var3, var4, var5);
        class122.method873(var1 + 1, var2 + 1, var3 - 2, 16, 0);
        class122.method861(var1 + 1, var2 + 18, var3 - 2, var4 + -19, 0);
        class180.field3002.method1226(class131.field2192, var1 + 3, var2 - -14, var5, -1);
        int var6 = class268.field4689;
        int var7 = class26.field363;
        for (int var8 = 0; var8 < class159.field2661; var8++) {
            int var9 = 16777215;
            int var10 = (class159.field2661 - var8 - 1) * 15 + var2 + 31;
            if (var1 < var7 && var7 < var1 + var3 && var6 > (var10 - 13) && (var10 + 3) > var6) {
                var9 = 16776960;
            }
            class180.field3002.method1226(class132.method945(var8, 123), var1 + 3, var10, var9, 0);
        }
        class99.method642(class62.field1011, class160.field2676, class137.field2348, true, class146.field2482);
    }

    @OriginalMember(owner = "client!qg", name = "b", descriptor = "(III)V")
    public static final void method1175(int arg0, int arg1, int arg2) {
        field2931++;
        if (arg0 == -499336730 && class262.method1772(arg0 + 499336730, arg1)) {
            class125.method897(arg2, class232.field4000[arg1], -27256);
        }
    }
}
