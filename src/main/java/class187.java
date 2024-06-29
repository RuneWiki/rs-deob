import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nn")
public class class187 {

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "I")
    public static int field2943;

    @OriginalMember(owner = "client!nn", name = "b", descriptor = "I")
    public static int field2944;

    @OriginalMember(owner = "client!nn", name = "c", descriptor = "I")
    public int field2945;

    @OriginalMember(owner = "client!nn", name = "e", descriptor = "I")
    public int field2947;

    @OriginalMember(owner = "client!nn", name = "f", descriptor = "I")
    public int field2948;

    @OriginalMember(owner = "client!nn", name = "d", descriptor = "[[I")
    public static int[][] field2946;

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(B)V", line = 5)
    public static final void method1384(byte arg0) {
        class85.field1236.method1141((byte) 69, 167);
        class85.field1236.method1752(class63.method431(1), -101);
        field2943++;
        class85.field1236.method1744(true, class151.field2281);
        class218.field3342++;
        if (arg0 >= -101) {
            method1386(52);
        }
        class85.field1236.method1744(true, class215.field3300);
        class85.field1236.method1752(class142.field2190, -81);
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(Z)V", line = 23)
    public static void method1385(boolean arg0) {
        if (arg0) {
            field2946 = (int[][]) ((int[][]) null);
        }
        field2946 = (int[][]) null;
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(I)V", line = 46)
    public static final void method1386(int arg0) {
        for (int var1 = 0; var1 < 5; var1++) {
            class307.field4791[var1] = false;
        }
        field2944++;
        class267.field4150 = -1;
        class273.field4265 = 0;
        class98.field1418 = -1;
        class269.field4181 = 0;
        class268.field4168 = 1;
        int var2 = 22 % ((arg0 + 43) / 56);
    }
}
