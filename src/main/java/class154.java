import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ue")
public abstract class class154 {

    @OriginalMember(owner = "client!ue", name = "e", descriptor = "I")
    public int field2214;

    @OriginalMember(owner = "client!ue", name = "c", descriptor = "I")
    public int field2212;

    @OriginalMember(owner = "client!ue", name = "d", descriptor = "I")
    public int field2213;

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "Ljm;")
    public static class485 field2211 = new class485(74, 16);

    @OriginalMember(owner = "client!ue", name = "g", descriptor = "[I")
    public static int[] field2216 = new int[4];

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "I")
    public static int field2210;

    @OriginalMember(owner = "client!ue", name = "f", descriptor = "I")
    public static int field2215;

    @OriginalMember(owner = "client!ue", name = "h", descriptor = "I")
    public static int field2217;

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(IBI)V")
    public abstract void method294(int arg0, byte arg1, int arg2);

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(III)V")
    public abstract void method295(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "(III)V")
    public abstract void method296(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(IC)Z")
    public static final boolean method966(int arg0, char arg1) {
        field2215++;
        if (arg0 >= -62) {
            method967(56);
        }
        return arg1 >= 'A' && arg1 <= 'Z' || arg1 >= 'a' && arg1 <= 'z';
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(I)V")
    public static void method967(int arg0) {
        if (arg0 != 97) {
            method968(62);
        }
        field2216 = null;
        field2211 = null;
    }

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "(I)V")
    public static final void method968(int arg0) {
        field2210++;
        int var1 = 12 / ((arg0 + 44) / 50);
        if (class397.field5519 != 3) {
            class223.field3140 = -1;
        }
    }

    @OriginalMember(owner = "client!ue", name = "<init>", descriptor = "(III)V")
    public class154(int arg0, int arg1, int arg2) {
        this.field2214 = arg2;
        this.field2212 = arg1;
        this.field2213 = arg0;
    }
}
