import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ci")
public class class82 {

    @OriginalMember(owner = "client!ci", name = "e", descriptor = "I")
    public static int field1193 = -1;

    @OriginalMember(owner = "client!ci", name = "b", descriptor = "Ljava/lang/String;")
    public static String field1190 = "Loading config - ";

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "I")
    public static int field1189;

    @OriginalMember(owner = "client!ci", name = "c", descriptor = "I")
    public static int field1191;

    @OriginalMember(owner = "client!ci", name = "d", descriptor = "I")
    public static int field1192;

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(Lrn;Lrn;I)V", line = 6)
    public static final void method740(class18 arg0, class18 arg1, int arg2) {
        class175.field2771 = arg1;
        class217.field3398 = arg0;
        field1189++;
        class175.field2771.method197((byte) 125, 34);
        int var3 = (int) (Math.random() * 21.0D) + arg2;
        int var4 = (int) (Math.random() * 21.0D) - 10;
        int var5 = (int) (Math.random() * 41.0D) - 20;
        int var6 = (int) (Math.random() * 21.0D) - 10;
        class112.field1722 = var3 + var5;
        class76.field1114 = var5 + var6;
        class246.field3833 = var4 + var5;
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(B)V", line = 39)
    public static final void method741(byte arg0) {
        field1192++;
        for (int var1 = 0; var1 < 5; var1++) {
            class32.field495[var1] = false;
        }
        class314.field4858 = 5;
        class29.field476 = 0;
        int var2 = -67 % ((arg0 - 6) / 60);
        class98.field1482 = 0;
        class155.field2501 = -1;
        class345.field5481 = -1;
    }

    @OriginalMember(owner = "client!ci", name = "b", descriptor = "(B)V", line = 61)
    public static void method742(byte arg0) {
        field1190 = null;
        if (arg0 != -80) {
            method742((byte) 27);
        }
    }
}
