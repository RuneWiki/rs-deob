import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vg")
public class class75 {

    @OriginalMember(owner = "client!vg", name = "c", descriptor = "I")
    public static int field1180 = 100;

    @OriginalMember(owner = "client!vg", name = "g", descriptor = "Ljava/lang/String;")
    public static String field1184 = "Loading fonts - ";

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "Lfd;")
    public static class130 field1178 = new class130(16);

    @OriginalMember(owner = "client!vg", name = "d", descriptor = "I")
    public static int field1181;

    @OriginalMember(owner = "client!vg", name = "e", descriptor = "I")
    public static int field1182;

    @OriginalMember(owner = "client!vg", name = "h", descriptor = "I")
    public static int field1185;

    @OriginalMember(owner = "client!vg", name = "f", descriptor = "Lfd;")
    public static class130 field1183;

    @OriginalMember(owner = "client!vg", name = "i", descriptor = "Lqm;")
    public static class189 field1186;

    @OriginalMember(owner = "client!vg", name = "b", descriptor = "[Lsh;")
    public static class230[] field1179;

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(B)V")
    public static final void method491(byte arg0) {
        field1181++;
        if (class72.field1038) {
            int var1 = -89 / ((arg0 + 46) / 48);
            class151.field2347 = null;
            class72.field1038 = false;
            class147.field2312 = null;
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(III)V")
    public static final void method492(int arg0, int arg1, int arg2) {
        class34.field418 = true;
        class193.field3047 = arg0;
        class285.field4758 = arg1;
        class217.field3456 = arg2;
        class74.field1138 = -1;
        class299.field4912 = -1;
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(Z)V")
    public static final void method493(boolean arg0) {
        for (int var1 = 0; var1 < class12.field159; var1++) {
            class20 var2 = class163.method1080(-107, var1);
            if (var2 != null && var2.field273 == 0) {
                class178.field2775[var1] = 0;
                class209.field3356[var1] = 0;
            }
        }
        if (!arg0) {
            field1183 = null;
        }
        field1182++;
        class36.field450 = new class130(16);
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(IB)V")
    public static final void method494(int arg0, byte arg1) {
        field1185++;
        if (arg1 > -20) {
            method491((byte) 91);
        }
        class36 var2 = class161.method1067(5, arg0, (byte) 81);
        var2.method220(123);
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(I)V")
    public static void method495(int arg0) {
        field1178 = null;
        field1184 = null;
        field1183 = null;
        field1179 = null;
        if (arg0 != 0) {
            method494(-80, (byte) 49);
        }
        field1186 = null;
    }
}
