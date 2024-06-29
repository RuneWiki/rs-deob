import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public class class138 {

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "I")
    public static int field2130 = 0;

    @OriginalMember(owner = "client!lb", name = "f", descriptor = "Lkk;")
    public static class254 field2135 = null;

    @OriginalMember(owner = "client!lb", name = "n", descriptor = "Ljava/lang/String;")
    public static String field2143 = "yellow:";

    @OriginalMember(owner = "client!lb", name = "m", descriptor = "I")
    public static int field2142 = 0;

    @OriginalMember(owner = "client!lb", name = "k", descriptor = "B")
    public byte field2140;

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "I")
    public static int field2131;

    @OriginalMember(owner = "client!lb", name = "d", descriptor = "I")
    public static int field2133;

    @OriginalMember(owner = "client!lb", name = "e", descriptor = "I")
    public static int field2134;

    @OriginalMember(owner = "client!lb", name = "g", descriptor = "I")
    public static int field2136;

    @OriginalMember(owner = "client!lb", name = "j", descriptor = "I")
    public static int field2139;

    @OriginalMember(owner = "client!lb", name = "l", descriptor = "I")
    public static int field2141;

    @OriginalMember(owner = "client!lb", name = "o", descriptor = "I")
    public int field2144;

    @OriginalMember(owner = "client!lb", name = "c", descriptor = "Ljava/lang/String;")
    public String field2132;

    @OriginalMember(owner = "client!lb", name = "h", descriptor = "Ljava/lang/String;")
    public String field2137;

    @OriginalMember(owner = "client!lb", name = "i", descriptor = "Ljava/lang/String;")
    public String field2138;

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(II)Lve;")
    public static final class203 method920(int arg0, int arg1) {
        field2133++;
        if (class261.field4306 && arg1 >= class1.field2 && arg1 <= class40.field495) {
            if (arg0 != 17514) {
                field2130 = -1;
            }
            return class35.field443[arg1 - class1.field2];
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(ZI)V")
    public static final void method921(boolean arg0, int arg1) {
        if (arg0) {
            class100.field1502.method145(-119);
            class100.field1502 = new class25(arg1);
            field2134++;
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(I)V")
    public static final void method922(int arg0) {
        if (arg0 == -23232) {
            field2136++;
            class276.field4572.method1391(0, 28);
            class276.field4572.method1446((byte) 67, 0);
            class179.field2785++;
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(Z)V")
    public static void method923(boolean arg0) {
        if (!arg0) {
            field2135 = null;
            field2143 = null;
        }
    }
}
