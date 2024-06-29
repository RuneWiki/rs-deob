import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sn")
public class class583 {

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "I")
    public int field8194;

    @OriginalMember(owner = "client!sn", name = "b", descriptor = "I")
    public static int field8195;

    @OriginalMember(owner = "client!sn", name = "c", descriptor = "I")
    public static int field8196;

    @OriginalMember(owner = "client!sn", name = "e", descriptor = "Lqm;")
    public static class129 field8198;

    @OriginalMember(owner = "client!sn", name = "d", descriptor = "[[B")
    public static byte[][] field8197;

    @OriginalMember(owner = "client!sn", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field8196++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(Lmw;Z)V")
    public static final void method3316(class454 arg0, boolean arg1) {
        for (int var2 = arg0.field6524; var2 <= arg0.field6526; var2++) {
            for (int var3 = arg0.field6521; var3 <= arg0.field6516; var3++) {
                class40 var4 = class153.field2210[arg0.field3019][var2][var3];
                if (var4 != null) {
                    class106 var5 = var4.field671;
                    class106 var6 = null;
                    while (var5 != null) {
                        if (var5.field1638 == arg0) {
                            if (var6 == null) {
                                var4.field671 = var5.field1641;
                            } else {
                                var6.field1641 = var5.field1641;
                            }
                            var5.method843(500);
                            break;
                        }
                        var6 = var5;
                        var5 = var5.field1641;
                    }
                }
            }
        }
        if (!arg1) {
            class300.method1929(arg0);
        }
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(B)V")
    public static void method3317(byte arg0) {
        field8198 = null;
        if (arg0 > -62) {
            method3317((byte) -121);
        }
        field8197 = null;
    }

    @OriginalMember(owner = "client!sn", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
    public class583(String arg0, int arg1) {
        this.field8194 = arg1;
    }
}
