import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ju")
public class class82 extends class383 {

    @OriginalMember(owner = "client!ju", name = "k", descriptor = "Ljava/lang/String;")
    public String field1043;

    @OriginalMember(owner = "client!ju", name = "j", descriptor = "I")
    public static int field1042;

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(I)V")
    public static final void method673(int arg0) {
        field1042++;
        class25.field358 = 0;
        int var1 = (class23.field336.field2666 >> 7) + class441.field6317;
        if (arg0 > -124) {
            return;
        }
        int var2 = (class23.field336.field2677 >> 7) + class320.field4064;
        if (var1 >= 3053 && var1 <= 3156 && var2 >= 3056 && var2 <= 3136) {
            class25.field358 = 1;
        }
        if (var1 >= 3072 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
            class25.field358 = 1;
        }
        if (class25.field358 == 1 && var1 >= 3139 && var1 <= 3199 && var2 >= 3008 && var2 <= 3062) {
            class25.field358 = 0;
        }
    }

    @OriginalMember(owner = "client!ju", name = "<init>", descriptor = "()V")
    public class82() {
    }

    @OriginalMember(owner = "client!ju", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
    public class82(String arg0, int arg1) {
        this.field1043 = arg0;
    }
}
