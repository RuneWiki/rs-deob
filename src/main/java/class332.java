import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ug")
public class class332 {

    @OriginalMember(owner = "client!ug", name = "f", descriptor = "Z")
    public static boolean field5288 = false;

    @OriginalMember(owner = "client!ug", name = "e", descriptor = "I")
    public static int field5287 = 0;

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "Z")
    public static boolean field5283 = false;

    @OriginalMember(owner = "client!ug", name = "h", descriptor = "F")
    public static float field5290;

    @OriginalMember(owner = "client!ug", name = "c", descriptor = "I")
    public static int field5285;

    @OriginalMember(owner = "client!ug", name = "d", descriptor = "I")
    public static int field5286;

    @OriginalMember(owner = "client!ug", name = "g", descriptor = "I")
    public static int field5289;

    @OriginalMember(owner = "client!ug", name = "i", descriptor = "I")
    public static int field5291;

    @OriginalMember(owner = "client!ug", name = "j", descriptor = "I")
    public static int field5292;

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "[[I")
    public static int[][] field5284;

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(I)V", line = 13)
    public static final void method2304(int arg0) {
        class207.field3515 = false;
        class35.field509 = -1;
        class338.field5410 = -1;
        class341.field5443.field5353 = 0;
        field5286++;
        class40.field592 = -1;
        class308.field4906 = 0;
        class316.field5008 = 0;
        class293.field4708 = 0;
        class338.field5408 = 0;
        class128.field2224 = -1;
        class207.field3514 = 0;
        class144.field2628 = 0;
        class276.field4398.field5353 = 0;
        for (int var1 = 0; var1 < class135.field2359.length; var1++) {
            if (class135.field2359[var1] != null) {
                class135.field2359[var1].field1941 = -1;
            }
        }
        for (int var2 = 0; var2 < class320.field5071.length; var2++) {
            if (class320.field5071[var2] != null) {
                class320.field5071[var2].field1941 = -1;
            }
        }
        class212.method1573((byte) -26);
        class191.field3194 = 1;
        class33.method302((byte) -46, 30);
        int var3 = 26 / ((-arg0 - 74) / 42);
        for (int var4 = 0; var4 < 100; var4++) {
            class272.field4337[var4] = true;
        }
        class225.method1640(16);
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(BI)V", line = 69)
    public static final void method2305(byte arg0, int arg1) {
        int var2 = -79 % ((68 - arg0) / 33);
        class171.field2962.method469(-11815, arg1);
        field5291++;
    }

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "(I)V", line = 90)
    public static void method2306(int arg0) {
        if (arg0 != 0) {
            field5284 = (int[][]) ((int[][]) null);
        }
        field5284 = (int[][]) null;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(II)I", line = 100)
    public static final int method2307(int arg0, int arg1) {
        field5285++;
        if (arg0 != -1) {
            method2307(-116, 81);
        }
        class213 var2 = class261.method1801(arg1, 10812);
        int var3 = var2.field3583;
        int var4 = var2.field3584;
        int var5 = var2.field3578;
        int var6 = class71.field1169[var3 - var5];
        return class116.field2006[var4] >> var5 & var6;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(B)V", line = 125)
    public static final void method2308(byte arg0) {
        int var1 = 79 / ((-arg0 - 75) / 45);
        if (class257.field4137 != -1) {
            class78.method715(230, class257.field4137, -1, -1);
            class257.field4137 = -1;
        }
        field5289++;
    }
}
