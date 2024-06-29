import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vm")
public class class88 {

    @OriginalMember(owner = "client!vm", name = "c", descriptor = "I")
    public static volatile int field1163 = -1;

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "[I")
    public static int[] field1161 = new int[50];

    @OriginalMember(owner = "client!vm", name = "f", descriptor = "Lqb;")
    public static class117 field1166 = new class117(8);

    @OriginalMember(owner = "client!vm", name = "b", descriptor = "I")
    public static int field1162;

    @OriginalMember(owner = "client!vm", name = "d", descriptor = "I")
    public static int field1164;

    @OriginalMember(owner = "client!vm", name = "e", descriptor = "I")
    public static int field1165;

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(B)V", line = 5)
    public static void method560(byte arg0) {
        field1161 = null;
        field1166 = null;
        int var1 = 80 / ((arg0 - 38) / 63);
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(ZI)V", line = 31)
    public static final void method561(boolean arg0, int arg1) {
        if (arg0) {
            if (class345.field5482 != -1) {
                class315.method2224((byte) -105, class345.field5482);
            }
            for (class238 var2 = (class238) field1166.method761(89); var2 != null; var2 = (class238) field1166.method757(-1)) {
                class178.method1233(true, var2, 106);
            }
            class345.field5482 = -1;
            field1166 = new class117(8);
            class285.method2055((byte) -88);
            class345.field5482 = class14.field143;
            class241.method1707(536870911, false);
            class344.method2386(0);
            class110.method713(class345.field5482, true);
        }
        class161.field2479 = -1;
        field1164++;
        class267.method1878(class101.field1375, arg1 ^ 0xFFFFC0FC);
        class11.field113 = new class67();
        class11.field113.field3763 = 3000;
        class11.field113.field3767 = 3000;
        if (arg1 != 8) {
            method561(false, 64);
        }
        if (!class272.field4317 && class199.field3024 == 0) {
            class231.method1600(class65.field786, 119);
            class219.method1525((byte) 101, 10);
            return;
        }
        if (class120.field1667 == 2) {
            class10.field96 = class11.field118 << 7;
            class280.field4415 = class93.field1222 << 7;
        } else {
            class143.method1034((byte) 76);
        }
        if (class272.field4317) {
            class306.method2155((byte) 112);
        }
        class135.method934(arg1 + 2040);
        class219.method1525((byte) -96, 28);
    }
}
