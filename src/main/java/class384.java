import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jq")
public class class384 {

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "Lwd;")
    private class179 field5494;

    @OriginalMember(owner = "client!jq", name = "e", descriptor = "Ljn;")
    public static class134 field5498 = new class134(113, -1);

    @OriginalMember(owner = "client!jq", name = "g", descriptor = "D")
    public static double field5500;

    @OriginalMember(owner = "client!jq", name = "d", descriptor = "I")
    public static int field5497;

    @OriginalMember(owner = "client!jq", name = "f", descriptor = "I")
    public static int field5499;

    @OriginalMember(owner = "client!jq", name = "h", descriptor = "I")
    public static int field5501;

    @OriginalMember(owner = "client!jq", name = "i", descriptor = "I")
    public static int field5502;

    @OriginalMember(owner = "client!jq", name = "c", descriptor = "Lae;")
    public static class283 field5496;

    @OriginalMember(owner = "client!jq", name = "b", descriptor = "Llm;")
    private class49 field5495;

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(ZI)Lsha;")
    public static final class115 method2387(boolean arg0, int arg1) {
        field5497++;
        int var2 = arg1 >> 16;
        int var3 = arg1 & 0xFFFF;
        if (class609.field8594[var2] == null || class609.field8594[var2][var3] == null) {
            boolean var4 = class718.method4015(var2, 56);
            if (!var4) {
                return null;
            }
        }
        if (arg0) {
            field5498 = null;
        }
        return class609.field8594[var2][var3];
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(I)Llm;")
    public final class49 method2388(int arg0) {
        field5502++;
        class49 var2 = this.field5494.field2266.field591;
        if (this.field5494.field2266 == var2) {
            this.field5495 = null;
            return null;
        } else {
            this.field5495 = var2.field591;
            int var3 = 121 / ((-arg0 - 75) / 32);
            return var2;
        }
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(B)V")
    public static void method2389(byte arg0) {
        field5496 = null;
        field5498 = null;
        if (arg0 <= 24) {
            method2389((byte) -67);
        }
    }

    @OriginalMember(owner = "client!jq", name = "<init>", descriptor = "()V")
    public class384() {
    }

    @OriginalMember(owner = "client!jq", name = "b", descriptor = "(I)Llm;")
    public final class49 method2390(int arg0) {
        field5499++;
        class49 var2 = this.field5495;
        if (this.field5494.field2266 == var2) {
            this.field5495 = null;
            return null;
        } else {
            int var3 = 65 % ((arg0 - 26) / 47);
            this.field5495 = var2.field591;
            return var2;
        }
    }

    @OriginalMember(owner = "client!jq", name = "<init>", descriptor = "(Lwd;)V")
    public class384(class179 arg0) {
        this.field5494 = arg0;
    }
}
