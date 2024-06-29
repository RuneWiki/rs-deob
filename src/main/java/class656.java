import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tq")
public class class656 implements class351 {

    @OriginalMember(owner = "client!tq", name = "e", descriptor = "Ljava/lang/String;")
    private String field9087;

    @OriginalMember(owner = "client!tq", name = "b", descriptor = "I")
    public static int field9084 = 0;

    @OriginalMember(owner = "client!tq", name = "g", descriptor = "Ljia;")
    public static class645 field9089 = new class645();

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "I")
    public static int field9083;

    @OriginalMember(owner = "client!tq", name = "c", descriptor = "I")
    public static int field9085;

    @OriginalMember(owner = "client!tq", name = "f", descriptor = "I")
    public static int field9088;

    @OriginalMember(owner = "client!tq", name = "h", descriptor = "I")
    public static int field9090;

    @OriginalMember(owner = "client!tq", name = "i", descriptor = "I")
    public static int field9091;

    @OriginalMember(owner = "client!tq", name = "d", descriptor = "Z")
    private boolean field9086;

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(I)Lgb;", line = 3)
    public final class228 method1499(int arg0) {
        if (arg0 != 27291) {
            this.field9087 = null;
        }
        field9085++;
        return class228.field3325;
    }

    @OriginalMember(owner = "client!tq", name = "b", descriptor = "(B)V", line = 16)
    public static void method3688(byte arg0) {
        if (arg0 == -118) {
            field9089 = null;
        }
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(ZI)V", line = 35)
    public static final void method3689(boolean arg0, int arg1) {
        if (arg0 && class64.field875 != null) {
            class572.field8145 = class64.field875.field3330;
        } else {
            class572.field8145 = -1;
        }
        field9091++;
        class64.field875 = null;
        class488.field6583 = null;
        class497.field6805 = null;
        class394.field5442 = 0;
        class64.method445();
        class64.field888.method3590((byte) 5);
        if (arg1 != -201) {
            field9089 = null;
        }
        class492.field6740 = null;
        class499.field6826 = -1;
        class64.field884 = null;
        class642.field8890 = null;
        class724.field9960 = null;
        class410.field5616 = null;
        class405.field5579 = null;
        class466.field6316 = null;
        class332.field4495 = null;
        class210.field3141 = -1;
        class418.field5707 = null;
        class367.field4983 = null;
        if (class64.field882 != null) {
            class64.field882.method4032(-93);
            class64.field882.method4028(arg1 ^ 0xFFFFFF00, 128, 64);
        }
        if (class64.field883 != null) {
            class64.field883.method2115(64, (byte) 23, 64);
        }
        if (class64.field878 != null) {
            class64.field878.method2315(arg1 + 201, 64);
        }
        class201.field3056.method1926(64, 1);
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(BLjava/lang/String;)V", line = 83)
    public static final void method3690(byte arg0, String arg1) {
        field9088++;
        if (arg1 == null) {
            return;
        }
        if (!(class749.field10345 < 200 || class790.field10829) || class749.field10345 >= 200) {
            class629.method3535(class641.field8828.method3566((byte) -38, class464.field6309), 4, -2309);
            String var2 = class641.field8829.method3566((byte) -70, class464.field6309);
            if (var2 != null) {
                class629.method3535(var2, 4, -2309);
            }
            return;
        }
        String var3 = class177.method1336(arg1, (byte) 75);
        if (var3 == null) {
            return;
        }
        for (int var4 = 0; var4 < class749.field10345; var4++) {
            String var10 = class177.method1336(class463.field6303[var4], (byte) 75);
            if (var10 != null && var10.equals(var3)) {
                class629.method3535(arg1 + class641.field8856.method3566((byte) 109, class464.field6309), 4, -2309);
                return;
            }
            if (class392.field5378[var4] != null) {
                String var11 = class177.method1336(class392.field5378[var4], (byte) 75);
                if (var11 != null && var11.equals(var3)) {
                    class629.method3535(arg1 + class641.field8856.method3566((byte) 117, class464.field6309), 4, -2309);
                    return;
                }
            }
        }
        int var5 = -12 / ((-arg0 - 6) / 59);
        for (int var6 = 0; var6 < class766.field10564; var6++) {
            String var8 = class177.method1336(class174.field2766[var6], (byte) 75);
            if (var8 != null && var8.equals(var3)) {
                class629.method3535(class641.field8861.method3566((byte) 94, class464.field6309) + arg1 + class641.field8862.method3566((byte) -74, class464.field6309), 4, -2309);
                return;
            }
            if (class707.field9726[var6] != null) {
                String var9 = class177.method1336(class707.field9726[var6], (byte) 75);
                if (var9 != null && var9.equals(var3)) {
                    class629.method3535(class641.field8861.method3566((byte) -65, class464.field6309) + arg1 + class641.field8862.method3566((byte) 123, class464.field6309), 4, -2309);
                    return;
                }
            }
        }
        if (class177.method1336(class235.field3379.field10641, (byte) 75).equals(var3)) {
            class629.method3535(class641.field8859.method3566((byte) -100, class464.field6309), 4, -2309);
            return;
        }
        class72.field1057++;
        class537 var7 = class476.method2729(class519.field7044, (byte) -46, class551.field7498);
        var7.field7295.method754(class703.method3926(120, arg1), 106);
        var7.field7295.method783((byte) 81, arg1);
        class173.method1314(false, var7);
    }

    @OriginalMember(owner = "client!tq", name = "<init>", descriptor = "(Ljava/lang/String;)V", line = 182)
    public class656(String arg0) {
        this.field9087 = arg0;
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(B)I", line = 190)
    public final int method1501(byte arg0) {
        field9083++;
        int var2 = class733.method4070((byte) -122, this.field9087);
        if (arg0 != 5) {
            this.method1499(-68);
        }
        if (var2 >= 0 && var2 <= 100) {
            return var2;
        } else {
            this.field9086 = true;
            return 100;
        }
    }

    @OriginalMember(owner = "client!tq", name = "c", descriptor = "(B)Z", line = 208)
    public final boolean method3691(byte arg0) {
        field9090++;
        return arg0 < 124 ? true : this.field9086;
    }
}
