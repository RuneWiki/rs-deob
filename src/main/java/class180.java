import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eq")
public class class180 {

    @OriginalMember(owner = "client!eq", name = "b", descriptor = "I")
    public int field2207 = 8;

    @OriginalMember(owner = "client!eq", name = "h", descriptor = "I")
    public int field2213 = 16777215;

    @OriginalMember(owner = "client!eq", name = "e", descriptor = "Ljava/lang/String;")
    public static String field2210 = null;

    @OriginalMember(owner = "client!eq", name = "k", descriptor = "Lkca;")
    public static class73 field2216;

    @OriginalMember(owner = "client!eq", name = "n", descriptor = "[I")
    public static int[] field2219;

    @OriginalMember(owner = "client!eq", name = "c", descriptor = "I")
    public static int field2208;

    @OriginalMember(owner = "client!eq", name = "d", descriptor = "I")
    public int field2209;

    @OriginalMember(owner = "client!eq", name = "f", descriptor = "I")
    public int field2211;

    @OriginalMember(owner = "client!eq", name = "g", descriptor = "I")
    public int field2212;

    @OriginalMember(owner = "client!eq", name = "i", descriptor = "I")
    public int field2214;

    @OriginalMember(owner = "client!eq", name = "j", descriptor = "I")
    public static int field2215;

    @OriginalMember(owner = "client!eq", name = "l", descriptor = "I")
    public int field2217;

    @OriginalMember(owner = "client!eq", name = "m", descriptor = "Laj;")
    public static class264 field2218;

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "Z")
    public boolean field2206;

    static {
        new class474(null, "geschickt werden.", null, null);
        field2216 = new class73(63, -1);
        field2219 = new int[64];
        new class474("Join your channel by clicking 'Join Chat' and typing: ", "Klick auf 'Betreten' und gib ein: ", "Pour rejoindre votre canal, cliquez sur « Participer » et entrez : ", "Para entrar no seu canal, clique em \"Acessar bate-papo\" e digite: ");
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(IILrt;)V", line = 4)
    private final void method1025(int arg0, int arg1, class194 arg2) {
        field2215++;
        if (arg1 == 1) {
            this.field2207 = arg2.method1220(125);
        } else if (arg1 == 2) {
            this.field2206 = true;
        } else if (arg1 == 3) {
            this.field2212 = arg2.method1233(arg0 + 90736);
            this.field2211 = arg2.method1233(65280);
            this.field2209 = arg2.method1233(arg0 + 90736);
        } else if (arg1 == 4) {
            this.field2214 = arg2.method1177(255);
        } else if (arg1 == 5) {
            this.field2217 = arg2.method1220(arg0 + 25411);
        } else if (arg1 == 6) {
            this.field2213 = arg2.method1180(arg0 - 832606060);
        }
        if (arg0 != -25456) {
            field2210 = null;
        }
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(I)V", line = 53)
    public static void method1026(int arg0) {
        if (arg0 != -922) {
            field2210 = null;
        }
        field2218 = null;
        field2210 = null;
        field2216 = null;
        field2219 = null;
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(Lrt;I)V", line = 86)
    public final void method1027(class194 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method1177(arg1 + 256);
            if (var3 == 0) {
                field2208++;
                if (arg1 != -1) {
                    this.method1025(116, -97, null);
                    return;
                }
                return;
            }
            this.method1025(-25456, var3, arg0);
        }
    }
}
