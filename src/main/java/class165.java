import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public class class165 {

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "[I")
    public static int[] field2566 = new int[4096];

    @OriginalMember(owner = "client!mb", name = "e", descriptor = "I")
    public static int field2570;

    @OriginalMember(owner = "client!mb", name = "h", descriptor = "[I")
    public static int[] field2573;

    @OriginalMember(owner = "client!mb", name = "f", descriptor = "I")
    public static int field2571;

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "I")
    public static int field2567;

    @OriginalMember(owner = "client!mb", name = "c", descriptor = "I")
    public static int field2568;

    @OriginalMember(owner = "client!mb", name = "d", descriptor = "I")
    public static int field2569;

    @OriginalMember(owner = "client!mb", name = "g", descriptor = "Z")
    public static boolean field2572;

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(B)V")
    public static final void method1042(byte arg0) {
        field2568++;
        if (arg0 != -118) {
            method1044((byte) 91);
        }
        for (class490 var1 = (class490) class311.field4686.method8((byte) -98); var1 != null; var1 = (class490) class311.field4686.method17((byte) -118)) {
            class336 var2 = var1.field7453;
            if (class362.field5339 != var2.field3217 || var2.field5011 < class369.field5424) {
                var1.method1121(false);
                var2.method2083((byte) 123);
            } else if (class369.field5424 >= var2.field5032) {
                if (var2.field5007 > 0) {
                    class249 var3 = class195.field3085[var2.field5007 - 1];
                    if (var3 != null && var3.field3218 >= 0 && (class150.field2422 * 128) > var3.field3218 && var3.field3222 >= 0 && class21.field272 * 128 > var3.field3222) {
                        var2.method2084(class369.field5424, class7.method38(var3.field3218, var2.field3217, var3.field3222, (byte) -54) - var2.field5004, var3.field3222, (byte) 83, var3.field3218);
                    }
                }
                if (var2.field5007 < 0) {
                    int var4 = -var2.field5007 - 1;
                    class47 var5;
                    if (class507.field7667 == var4) {
                        var5 = class286.field4329;
                    } else {
                        var5 = class224.field3450[var4];
                    }
                    if (var5 != null && var5.field3218 >= 0 && var5.field3218 < (class150.field2422 * 128) && var5.field3222 >= 0 && (class21.field272 * 128) > var5.field3222) {
                        var2.method2084(class369.field5424, class7.method38(var5.field3218, var2.field3217, var5.field3222, (byte) -54) - var2.field5004, var5.field3222, (byte) -114, var5.field3218);
                    }
                }
                var2.method2087(class115.field1951, arg0 ^ 0xFFFFCCF0);
                class408.method2418(var2, true);
            }
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(IBLhf;ILjava/awt/Canvas;Lvl;)Lqq;")
    public static final class318 method1043(int arg0, byte arg1, class260 arg2, int arg3, Canvas arg4, class11 arg5) {
        field2567++;
        if (arg1 > -87) {
            method1043(-7, (byte) 70, null, 108, null, null);
        }
        return new class442(arg3, arg4, arg5, arg0, arg2);
    }

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "(B)V")
    public static void method1044(byte arg0) {
        if (arg0 != 108) {
            field2572 = true;
        }
        field2573 = null;
        field2566 = null;
    }

    static {
        new class423("To talk, start each line of chat with the / symbol.", "Leite eine Zeile mit / ein, um hier zu chatten.", "Pour parler, insérez le symbole / au début de chaque ligne.", "Para falar, comece cada linha de conversa com o símbolo /.");
        field2570 = -1;
        field2573 = new int[14];
        field2571 = 0;
    }
}
