import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qh")
public class class51 {

    @OriginalMember(owner = "client!qh", name = "b", descriptor = "I")
    public static int field683 = 0;

    @OriginalMember(owner = "client!qh", name = "h", descriptor = "Lfa;")
    public static class461 field689 = new class461(0, 0);

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "I")
    public int field682;

    @OriginalMember(owner = "client!qh", name = "c", descriptor = "I")
    public int field684;

    @OriginalMember(owner = "client!qh", name = "d", descriptor = "I")
    public int field685;

    @OriginalMember(owner = "client!qh", name = "f", descriptor = "I")
    public int field687;

    @OriginalMember(owner = "client!qh", name = "g", descriptor = "I")
    public int field688;

    @OriginalMember(owner = "client!qh", name = "i", descriptor = "I")
    public int field690;

    @OriginalMember(owner = "client!qh", name = "k", descriptor = "I")
    public static int field692;

    @OriginalMember(owner = "client!qh", name = "l", descriptor = "I")
    public int field693;

    @OriginalMember(owner = "client!qh", name = "m", descriptor = "I")
    public static int field694;

    @OriginalMember(owner = "client!qh", name = "e", descriptor = "[B")
    public byte[] field686;

    @OriginalMember(owner = "client!qh", name = "j", descriptor = "[B")
    public byte[] field691;

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(I)V")
    public static void method352(int arg0) {
        if (arg0 != 0) {
            field683 = 79;
        }
        field689 = null;
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(IZII)V")
    public static final void method353(int arg0, boolean arg1, int arg2, int arg3) {
        int var4 = class96.field1399.field5226 * arg3 >> 8;
        field692++;
        if (!arg1) {
            field689 = null;
        }
        if (var4 != 0 && arg2 != -1) {
            class76.method503(var4, 0, arg2, -109, class21.field335, false);
            class165.field2412 = true;
        }
    }
}
