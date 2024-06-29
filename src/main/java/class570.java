import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oca")
public class class570 {

    @OriginalMember(owner = "client!oca", name = "f", descriptor = "I")
    public int field8324 = 128;

    @OriginalMember(owner = "client!oca", name = "b", descriptor = "I")
    public int field8320 = 128;

    @OriginalMember(owner = "client!oca", name = "h", descriptor = "I")
    public int field8326;

    @OriginalMember(owner = "client!oca", name = "c", descriptor = "I")
    public int field8321;

    @OriginalMember(owner = "client!oca", name = "m", descriptor = "I")
    public int field8331;

    @OriginalMember(owner = "client!oca", name = "i", descriptor = "I")
    public int field8327;

    @OriginalMember(owner = "client!oca", name = "a", descriptor = "Z")
    public static boolean field8319 = false;

    @OriginalMember(owner = "client!oca", name = "d", descriptor = "Lvh;")
    public static class125 field8322 = new class125(80, 8);

    @OriginalMember(owner = "client!oca", name = "n", descriptor = "Ljda;")
    public static class77 field8332 = new class77("", 12);

    @OriginalMember(owner = "client!oca", name = "o", descriptor = "I")
    public static int field8333 = 765;

    @OriginalMember(owner = "client!oca", name = "l", descriptor = "F")
    public static float field8330;

    @OriginalMember(owner = "client!oca", name = "e", descriptor = "I")
    public static int field8323;

    @OriginalMember(owner = "client!oca", name = "g", descriptor = "I")
    public static int field8325;

    @OriginalMember(owner = "client!oca", name = "j", descriptor = "I")
    public static int field8328;

    @OriginalMember(owner = "client!oca", name = "k", descriptor = "I")
    public static int field8329;

    @OriginalMember(owner = "client!oca", name = "a", descriptor = "(B)Loca;")
    public final class570 method3323(byte arg0) {
        if (arg0 != -126) {
            field8332 = null;
        }
        field8328++;
        return new class570(this.field8326, this.field8324, this.field8320, this.field8331, this.field8321, this.field8327);
    }

    @OriginalMember(owner = "client!oca", name = "a", descriptor = "(Loca;Z)V")
    public final void method3324(class570 arg0, boolean arg1) {
        this.field8324 = arg0.field8324;
        this.field8320 = arg0.field8320;
        field8329++;
        this.field8327 = arg0.field8327;
        this.field8326 = arg0.field8326;
        this.field8321 = arg0.field8321;
        this.field8331 = arg0.field8331;
        if (!arg1) {
            this.method3324(null, false);
        }
    }

    @OriginalMember(owner = "client!oca", name = "a", descriptor = "(I)V")
    public static void method3325(int arg0) {
        field8332 = null;
        if (arg0 == 29016) {
            field8322 = null;
        }
    }

    @OriginalMember(owner = "client!oca", name = "<init>", descriptor = "(I)V")
    public class570(int arg0) {
        this.field8326 = arg0;
    }

    @OriginalMember(owner = "client!oca", name = "<init>", descriptor = "(IIIIII)V")
    private class570(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field8321 = arg4;
        this.field8320 = arg2;
        this.field8331 = arg3;
        this.field8326 = arg0;
        this.field8324 = arg1;
        this.field8327 = arg5;
    }
}
