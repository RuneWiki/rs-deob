import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public class class359 {

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "Lbg;")
    public static class324 field4998 = new class324(108, 8);

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "I")
    public static int field4997;

    @OriginalMember(owner = "client!cb", name = "c", descriptor = "I")
    public static int field4999;

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(JI)V")
    public static final void method2159(long arg0, int arg1) {
        if (class422.field6240 != null) {
            if (class462.field6802 == 1 || class462.field6802 == 5) {
                class255.method1643(115, arg0);
            } else if (class462.field6802 == 4) {
                class353.method2135(arg0, (byte) 1);
            }
        }
        field4999++;
        class352.method2118((long) class263.field3867, class225.field3300, 99);
        if (class64.field761 != -1) {
            class85.method755((byte) -10, class64.field761);
        }
        for (int var3 = 0; var3 < class267.field3933; var3++) {
            if (class342.field4736[var3]) {
                class525.field7706[var3] = true;
            }
            class368.field5473[var3] = class342.field4736[var3];
            class342.field4736[var3] = false;
        }
        class526.field7727 = class263.field3867;
        if (class225.field3300.method298()) {
            class311.field4441 = true;
        }
        if (class64.field761 != -1) {
            class267.field3933 = 0;
            class95.method824(-9410);
        }
        int var4 = -80 % ((arg1 - 29) / 43);
        class225.field3300.method339();
        class175.method1227((byte) -7, class225.field3300);
        int var5 = class149.method1077(-29249);
        if (var5 == -1) {
            var5 = class86.field1177;
        }
        if (var5 == -1) {
            var5 = class74.field1011;
        }
        class328.method2020(var5, (byte) 125);
        class21.method188(class435.field6375.field6334, class406.field6056, class435.field6375.field6335, class435.field6375.field6328, (byte) -107);
        class406.field6056 = 0;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(I)V")
    public static void method2160(int arg0) {
        if (arg0 >= -19) {
            field4998 = null;
        }
        field4998 = null;
    }

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "(JI)Ljava/lang/String;")
    public static final String method2161(long arg0, int arg1) {
        field4997++;
        if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
            return null;
        } else if ((arg0 % 37L) == 0L) {
            return null;
        } else {
            int var3 = 0;
            if (arg1 >= -71) {
                field4998 = null;
            }
            for (long var4 = arg0; var4 != 0L; var4 /= 37L) {
                var3++;
            }
            StringBuffer var6 = new StringBuffer(var3);
            while (arg0 != 0L) {
                long var7 = arg0;
                arg0 /= 37L;
                char var9 = class256.field3752[(int) (var7 - (arg0 * 37L))];
                if (var9 == '_') {
                    int var10 = var6.length() - 1;
                    var9 = ' ';
                    var6.setCharAt(var10, Character.toUpperCase(var6.charAt(var10)));
                }
                var6.append(var9);
            }
            var6.reverse();
            var6.setCharAt(0, Character.toUpperCase(var6.charAt(0)));
            return var6.toString();
        }
    }
}
