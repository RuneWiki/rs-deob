import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public class class5 extends class125 {

    @OriginalMember(owner = "client!ad", name = "z", descriptor = "I")
    public static int field271 = 2;

    @OriginalMember(owner = "client!ad", name = "B", descriptor = "Ljd;")
    public static class92 field273 = class202.method1325((byte) 90, "Die Adresse dieses Computers wurde gesperrt)1");

    @OriginalMember(owner = "client!ad", name = "H", descriptor = "I")
    public static volatile int field278 = 0;

    @OriginalMember(owner = "client!ad", name = "N", descriptor = "Ljd;")
    public static class92 field283 = class202.method1325((byte) 90, "Unerwartete Antwort vom Anmelde)2Server)3");

    @OriginalMember(owner = "client!ad", name = "A", descriptor = "I")
    public int field272;

    @OriginalMember(owner = "client!ad", name = "D", descriptor = "I")
    public static int field274;

    @OriginalMember(owner = "client!ad", name = "E", descriptor = "I")
    public static int field275;

    @OriginalMember(owner = "client!ad", name = "F", descriptor = "I")
    public static int field276;

    @OriginalMember(owner = "client!ad", name = "I", descriptor = "I")
    public static int field279;

    @OriginalMember(owner = "client!ad", name = "J", descriptor = "I")
    public static int field280;

    @OriginalMember(owner = "client!ad", name = "K", descriptor = "I")
    public int field281;

    @OriginalMember(owner = "client!ad", name = "M", descriptor = "I")
    public static int field282;

    @OriginalMember(owner = "client!ad", name = "O", descriptor = "I")
    public int field284;

    @OriginalMember(owner = "client!ad", name = "G", descriptor = "[Lrf;")
    public static class167[] field277;

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(ZLh;)V")
    public final void method34(boolean arg0, class70 arg1) {
        while (true) {
            int var3 = arg1.method443(255);
            if (var3 == 0) {
                field274++;
                if (!arg0) {
                    field273 = null;
                    return;
                }
                return;
            }
            this.method35(false, var3, arg1);
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(ZILh;)V")
    private final void method35(boolean arg0, int arg1, class70 arg2) {
        if (arg1 == 1) {
            this.field281 = arg2.method442(-21351);
            this.field272 = arg2.method443(255);
            this.field284 = arg2.method443(255);
        }
        field280++;
        if (arg0) {
            field271 = -78;
        }
    }

    @OriginalMember(owner = "client!ad", name = "f", descriptor = "(I)Lgb;")
    public static final class63 method36(int arg0) {
        field275++;
        try {
            if (arg0 != 1023) {
                field279 = 8;
            }
            return (class63) Class.forName("qh").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!ad", name = "g", descriptor = "(I)V")
    public static void method37(int arg0) {
        field283 = null;
        if (arg0 < -37) {
            field273 = null;
            field277 = null;
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(IB)I")
    public static final int method38(int arg0, byte arg1) {
        field276++;
        if (arg1 != -68) {
            field277 = null;
        }
        return arg0 & 0x3FF;
    }
}
