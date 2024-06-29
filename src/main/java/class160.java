import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public class class160 extends class505 {

    @OriginalMember(owner = "client!ec", name = "y", descriptor = "I")
    public int field2390 = (int) (class493.method2937(-91) / 1000L);

    @OriginalMember(owner = "client!ec", name = "C", descriptor = "S")
    public short field2394;

    @OriginalMember(owner = "client!ec", name = "z", descriptor = "Ljava/lang/String;")
    public String field2391;

    @OriginalMember(owner = "client!ec", name = "A", descriptor = "[I")
    public static int[] field2392 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

    @OriginalMember(owner = "client!ec", name = "B", descriptor = "[I")
    public static int[] field2393 = new int[] { 0, 4, 3, 3, 1, 1, 3, 5, 1, 5, 3, 6, 4 };

    @OriginalMember(owner = "client!ec", name = "x", descriptor = "I")
    public static int field2389;

    @OriginalMember(owner = "client!ec", name = "D", descriptor = "I")
    public static int field2395;

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(BI)Lgo;", line = 6)
    public static final class445 method1093(byte arg0, int arg1) {
        if (arg0 != -106) {
            method1095(true);
        }
        field2389++;
        return class202.field3348 && arg1 >= class258.field3953 && class129.field1883 >= arg1 ? class282.field4291[arg1 - class258.field3953] : null;
    }

    @OriginalMember(owner = "client!ec", name = "e", descriptor = "(I)V", line = 25)
    public static final void method1094(int arg0) {
        field2395++;
        class51 var1 = null;
        try {
            class449 var2 = class360.field5349.method2194("2", true, 0);
            while (var2.field6570 == 0) {
                class434.method2690(10, 1L);
            }
            if (var2.field6570 == 1) {
                var1 = (class51) var2.field6569;
                class217 var3 = new class217(class5.field62 * 6 + 3);
                var3.method1545(1, -41);
                var3.method1542(class5.field62, -2756);
                for (int var4 = 0; var4 < class505.field7385.length; var4++) {
                    if (class256.field3922[var4]) {
                        var3.method1542(var4, -2756);
                        var3.method1566(true, class505.field7385[var4]);
                    }
                }
                var1.method494(var3.field3556, -127, var3.field3572, 0);
            }
        } catch (Exception var6) {
        }
        if (arg0 > -29) {
            field2393 = null;
        }
        try {
            if (var1 != null) {
                var1.method496(-32307);
            }
        } catch (Exception var5) {
        }
        class341.field5071 = class493.method2937(-84);
        class73.field1045 = false;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(Z)V", line = 81)
    public static void method1095(boolean arg0) {
        field2392 = null;
        field2393 = null;
        if (arg0) {
            method1095(false);
        }
    }

    @OriginalMember(owner = "client!ec", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 94)
    public class160(String arg0, int arg1) {
        this.field2394 = (short) arg1;
        this.field2391 = arg0;
    }
}
