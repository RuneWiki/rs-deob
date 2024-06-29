import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qp")
public class class466 {

    @OriginalMember(owner = "client!qp", name = "d", descriptor = "[Ljava/lang/String;")
    private String[] field6835;

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "Ldi;")
    public static class83 field6832 = new class83(62, -1);

    @OriginalMember(owner = "client!qp", name = "f", descriptor = "Ldi;")
    public static class83 field6837 = new class83(58, -1);

    @OriginalMember(owner = "client!qp", name = "g", descriptor = "Z")
    public static boolean field6838 = true;

    @OriginalMember(owner = "client!qp", name = "b", descriptor = "I")
    public static int field6833;

    @OriginalMember(owner = "client!qp", name = "c", descriptor = "I")
    public static int field6834;

    @OriginalMember(owner = "client!qp", name = "e", descriptor = "I")
    public static int field6836;

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(II)Ljava/lang/String;")
    public final String method2731(int arg0, int arg1) {
        if (arg0 == 62) {
            field6834++;
            return this.field6835[arg1];
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!qp", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field6833++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/lang/String;")
    public static final String method2732(String arg0, byte arg1) {
        if (arg1 < 15) {
            field6837 = null;
        }
        field6836++;
        String var2 = class374.method2235(class506.method3021(-1453, arg0), (byte) 112);
        if (var2 == null) {
            var2 = "";
        }
        return var2;
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(Z)V")
    public static void method2733(boolean arg0) {
        if (!arg0) {
            method2733(true);
        }
        field6837 = null;
        field6832 = null;
    }

    @OriginalMember(owner = "client!qp", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V")
    public class466(String arg0, String arg1, String arg2, String arg3) {
        this.field6835 = new String[] { arg0, arg1, arg2, arg3 };
    }
}
