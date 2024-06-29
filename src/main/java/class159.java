import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mg")
public class class159 {

    @OriginalMember(owner = "client!mg", name = "f", descriptor = "Z")
    public boolean field2190;

    @OriginalMember(owner = "client!mg", name = "g", descriptor = "[I")
    public static int[] field2191 = new int[2];

    @OriginalMember(owner = "client!mg", name = "i", descriptor = "Ljw;")
    public static class581 field2193 = new class581(24, -2);

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "I")
    public static int field2186;

    @OriginalMember(owner = "client!mg", name = "c", descriptor = "I")
    public static int field2187;

    @OriginalMember(owner = "client!mg", name = "e", descriptor = "I")
    public static int field2189;

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "Loh;")
    public class427 field2185;

    @OriginalMember(owner = "client!mg", name = "h", descriptor = "Loh;")
    public class427 field2192;

    @OriginalMember(owner = "client!mg", name = "j", descriptor = "Lwba;")
    public static class54 field2194;

    @OriginalMember(owner = "client!mg", name = "d", descriptor = "Z")
    public boolean field2188;

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(B)V")
    public static void method1165(byte arg0) {
        field2193 = null;
        field2191 = null;
        if (arg0 != 61) {
            field2193 = null;
        }
        field2194 = null;
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(I)V")
    public final void method1166(int arg0) {
        if (arg0 != -9764) {
            this.field2190 = true;
        }
        if (this.field2192 != null) {
            this.field2192.method2614(487);
        }
        field2187++;
        this.field2188 = false;
    }

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "(B)V")
    public static final void method1167(byte arg0) {
        class170.field2269 = 0L;
        class450.field6276 = -1;
        int var1 = -73 % ((arg0 + 41) / 36);
        field2189++;
        class652.field9041 = "";
    }

    @OriginalMember(owner = "client!mg", name = "c", descriptor = "(B)Z")
    public final boolean method1168(byte arg0) {
        field2186++;
        if (arg0 == -40) {
            return this.field2188 && !this.field2190;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!mg", name = "<init>", descriptor = "(Z)V")
    public class159(boolean arg0) {
        this.field2190 = arg0;
    }
}
