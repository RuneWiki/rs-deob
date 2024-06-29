import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ln")
public abstract class class252 {

    @OriginalMember(owner = "client!ln", name = "c", descriptor = "Ljava/lang/String;")
    public static String field3634 = "yellow:";

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "I")
    public static int field3632;

    @OriginalMember(owner = "client!ln", name = "b", descriptor = "I")
    public static int field3633;

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(I)V")
    public static void method1807(int arg0) {
        field3634 = null;
        if (arg0 != -13505) {
            method1808((class37) null, true);
        }
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(Lph;I)Lph;")
    public abstract class115 method1785(class115 arg0, int arg1);

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(Lec;Z)V")
    public static final void method1808(class37 arg0, boolean arg1) {
        field3632++;
        int var2 = arg0.method316((byte) 99);
        class22.field327 = new class91[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            class22.field327[var3] = new class91();
            class22.field327[var3].field1447 = arg0.method316((byte) 122);
            class22.field327[var3].field1444 = arg0.method312(1);
        }
        class407.field5938 = arg0.method316((byte) 100);
        class328.field4729 = arg0.method316((byte) 106);
        class33.field465 = arg0.method316((byte) 112);
        class377.field5333 = new class218[class328.field4729 + 1 - class407.field5938];
        for (int var4 = 0; var4 < class33.field465; var4++) {
            int var5 = arg0.method316((byte) 99);
            class218 var6 = class377.field5333[var5] = new class218();
            var6.field4008 = arg0.method271((byte) 110);
            var6.field4010 = arg0.method278(47);
            var6.field3233 = class407.field5938 + var5;
            var6.field3223 = arg0.method312(1);
            var6.field3227 = arg0.method312(1);
        }
        class268.field4013 = arg0.method278(21);
        class273.field4114 = arg1;
    }
}
