import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hba")
public class class10 extends class176 {

    @OriginalMember(owner = "client!hba", name = "m", descriptor = "I")
    public int field106;

    @OriginalMember(owner = "client!hba", name = "p", descriptor = "I")
    public static int field109 = 0;

    @OriginalMember(owner = "client!hba", name = "o", descriptor = "Lcba;")
    public static class471 field108 = new class471(82, 8);

    @OriginalMember(owner = "client!hba", name = "s", descriptor = "Lcba;")
    public static class471 field112 = new class471(18, 7);

    @OriginalMember(owner = "client!hba", name = "n", descriptor = "I")
    public static int field107;

    @OriginalMember(owner = "client!hba", name = "r", descriptor = "I")
    public static int field111;

    @OriginalMember(owner = "client!hba", name = "q", descriptor = "Lhv;")
    public static class442 field110;

    @OriginalMember(owner = "client!hba", name = "t", descriptor = "[Lg;")
    public static class135[] field113;

    @OriginalMember(owner = "client!hba", name = "a", descriptor = "(II)Ljava/lang/String;")
    public static final String method57(int arg0, int arg1) {
        if (arg1 != 6548) {
            method58(71, null);
        }
        field107++;
        return (arg0 >> 24 & 0xFF) + "." + (arg0 >> 16 & 0xFF) + "." + (arg0 >> 8 & 0xFF) + "." + (arg0 & 0xFF);
    }

    @OriginalMember(owner = "client!hba", name = "a", descriptor = "(ILnj;)V")
    public static final void method58(int arg0, class204 arg1) {
        field111++;
        if (arg0 != -16077) {
            method58(-19, null);
        }
        for (int var2 = 0; var2 < class155.field2316; var2++) {
            int var3 = class283.field3910[var2];
            class188 var4 = class349.field4696[var3];
            int var5 = arg1.method110((byte) 42);
            if ((var5 & 0x80) != 0) {
                var5 += arg1.method110((byte) 113) << 8;
            }
            if ((var5 & 0x1000) != 0) {
                var5 += arg1.method110((byte) 37) << 16;
            }
            class246.method1520(var4, var3, -1, arg1, var5);
        }
    }

    @OriginalMember(owner = "client!hba", name = "<init>", descriptor = "()V")
    public class10() {
    }

    @OriginalMember(owner = "client!hba", name = "a", descriptor = "(Z)V")
    public static void method59(boolean arg0) {
        field108 = null;
        field110 = null;
        field113 = null;
        field112 = null;
        if (!arg0) {
            field110 = null;
        }
    }

    @OriginalMember(owner = "client!hba", name = "<init>", descriptor = "(I)V")
    public class10(int arg0) {
        this.field106 = arg0;
    }
}
