import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rv")
public class class224 {

    @OriginalMember(owner = "client!rv", name = "d", descriptor = "Lvd;")
    private class258 field3166;

    @OriginalMember(owner = "client!rv", name = "c", descriptor = "J")
    public long field3165;

    @OriginalMember(owner = "client!rv", name = "e", descriptor = "Laa;")
    public static class76 field3167 = new class76(75, -1);

    @OriginalMember(owner = "client!rv", name = "h", descriptor = "Laa;")
    public static class76 field3170 = new class76(62, -1);

    @OriginalMember(owner = "client!rv", name = "i", descriptor = "I")
    public static int field3171 = -1;

    @OriginalMember(owner = "client!rv", name = "k", descriptor = "I")
    public static int field3173 = -1;

    @OriginalMember(owner = "client!rv", name = "l", descriptor = "Laa;")
    public static class76 field3174 = new class76(21, 11);

    @OriginalMember(owner = "client!rv", name = "j", descriptor = "F")
    public static float field3172;

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "I")
    public static int field3163;

    @OriginalMember(owner = "client!rv", name = "b", descriptor = "I")
    public static int field3164;

    @OriginalMember(owner = "client!rv", name = "f", descriptor = "I")
    public static int field3168;

    @OriginalMember(owner = "client!rv", name = "g", descriptor = "I")
    public static int field3169;

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(Z)V")
    public static final void method1407(boolean arg0) {
        if (class407.field6147.method126()) {
            class407.field6147.method81(class357.field5469);
            class300.method1867(-1);
            class407.field6147.method129(class357.field5469);
            class407.field6147.method108(class357.field5469);
        } else {
            class264.method1650(class113.field1723, -113);
        }
        if (!arg0) {
            method1408(121, -48, (byte) 10);
        }
        field3164++;
        class134.method988(-28945);
    }

    @OriginalMember(owner = "client!rv", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        field3168++;
        this.field3166.method1609(this.field3165, -15490);
        super.finalize();
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(IIB)V")
    public static final void method1408(int arg0, int arg1, byte arg2) {
        class517.field7583++;
        class97.method758(class234.field3289, false);
        field3169++;
        class43.field559.method2777((byte) 74, arg0);
        if (arg2 == -74) {
            class43.field559.method2748(arg1, (byte) -23);
        }
    }

    @OriginalMember(owner = "client!rv", name = "<init>", descriptor = "(Lvd;JI)V")
    public class224(class258 arg0, long arg1, int arg2) {
        this.field3166 = arg0;
        this.field3165 = arg1;
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(B)V")
    public static void method1409(byte arg0) {
        field3170 = null;
        field3167 = null;
        field3174 = null;
        if (arg0 <= 0) {
            field3167 = null;
        }
    }
}
