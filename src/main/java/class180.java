import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pk")
public class class180 {

    @OriginalMember(owner = "client!pk", name = "e", descriptor = "Z")
    public boolean field2211;

    @OriginalMember(owner = "client!pk", name = "g", descriptor = "Z")
    public static boolean field2213 = false;

    @OriginalMember(owner = "client!pk", name = "k", descriptor = "[Ljava/lang/String;")
    public static String[] field2217 = new String[] { "en", "de", "fr", "pt", "nl" };

    @OriginalMember(owner = "client!pk", name = "l", descriptor = "[[I")
    public static int[][] field2218 = new int[128][128];

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "I")
    public static int field2207;

    @OriginalMember(owner = "client!pk", name = "d", descriptor = "I")
    public static int field2210;

    @OriginalMember(owner = "client!pk", name = "h", descriptor = "I")
    public static int field2214;

    @OriginalMember(owner = "client!pk", name = "i", descriptor = "I")
    public static int field2215;

    @OriginalMember(owner = "client!pk", name = "c", descriptor = "Lpga;")
    public static class495 field2209;

    @OriginalMember(owner = "client!pk", name = "b", descriptor = "Lel;")
    public class508 field2208;

    @OriginalMember(owner = "client!pk", name = "j", descriptor = "Lel;")
    public class508 field2216;

    @OriginalMember(owner = "client!pk", name = "f", descriptor = "Z")
    public boolean field2212;

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(I)Z")
    public final boolean method1119(int arg0) {
        if (arg0 != 30840) {
            this.method1119(17);
        }
        field2215++;
        return this.field2212 && !this.field2211;
    }

    @OriginalMember(owner = "client!pk", name = "b", descriptor = "(I)V")
    public static final void method1120(int arg0) {
        field2207++;
        if (class588.field8514) {
            return;
        }
        class376.method2186(class177.field2183, 0);
        if (arg0 != 128) {
            field2214 = 30;
        }
        if (class551.field8014 != null) {
            class376.method2186(class551.field8014, arg0 ^ 0x80);
        }
        class588.field8514 = true;
    }

    @OriginalMember(owner = "client!pk", name = "c", descriptor = "(I)V")
    public static void method1121(int arg0) {
        if (arg0 != 128) {
            field2209 = null;
        }
        field2218 = null;
        field2217 = null;
        field2209 = null;
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(Z)V")
    public final void method1122(boolean arg0) {
        if (this.field2216 != null) {
            this.field2216.method11((byte) 17);
        }
        field2210++;
        this.field2212 = arg0;
    }

    @OriginalMember(owner = "client!pk", name = "<init>", descriptor = "(Z)V")
    public class180(boolean arg0) {
        this.field2211 = arg0;
    }
}
