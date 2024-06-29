import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public abstract class class40 extends class130 {

    @OriginalMember(owner = "client!qd", name = "J", descriptor = "I")
    public static int field631 = 0;

    @OriginalMember(owner = "client!qd", name = "B", descriptor = "Lcd;")
    private static class64 field623 = class44.method335((byte) 71, "Loading textures )2 ");

    @OriginalMember(owner = "client!qd", name = "I", descriptor = "Lcd;")
    public static class64 field630 = class44.method335((byte) 71, "Texturen geladen)3");

    @OriginalMember(owner = "client!qd", name = "L", descriptor = "[I")
    public static int[] field633 = new int[2000];

    @OriginalMember(owner = "client!qd", name = "w", descriptor = "Lcd;")
    public static class64 field618 = field623;

    @OriginalMember(owner = "client!qd", name = "x", descriptor = "I")
    public static int field619;

    @OriginalMember(owner = "client!qd", name = "y", descriptor = "I")
    public static int field620;

    @OriginalMember(owner = "client!qd", name = "z", descriptor = "I")
    public int field621;

    @OriginalMember(owner = "client!qd", name = "A", descriptor = "I")
    public int field622;

    @OriginalMember(owner = "client!qd", name = "C", descriptor = "I")
    public int field624;

    @OriginalMember(owner = "client!qd", name = "D", descriptor = "I")
    public static int field625;

    @OriginalMember(owner = "client!qd", name = "E", descriptor = "I")
    public static int field626;

    @OriginalMember(owner = "client!qd", name = "F", descriptor = "I")
    public int field627;

    @OriginalMember(owner = "client!qd", name = "H", descriptor = "I")
    public int field629;

    @OriginalMember(owner = "client!qd", name = "K", descriptor = "I")
    public int field632;

    @OriginalMember(owner = "client!qd", name = "G", descriptor = "[Lnm;")
    public static class176[] field628;

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(ILqm;)V", line = 5)
    public static final void method307(int arg0, class222 arg1) {
        field619++;
        class14.field317 = arg1;
        int var2 = -58 / ((-arg0 - 64) / 41);
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(IIIBI)V", line = 50)
    public final void method311(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        field625++;
        int var6 = this.field632 << 3;
        if (arg3 != -90) {
            this.field624 = -81;
        }
        int var7 = this.field622 << 3;
        int var8 = (arg0 << 4) + (var7 & 0xF);
        int var9 = (arg4 << 4) + (var6 & 0xF);
        this.method308(var6, var7, var9, var8, arg2, arg1);
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(Z)V", line = 71)
    public static void method313(boolean arg0) {
        field623 = null;
        if (arg0) {
            field630 = null;
            field628 = null;
            field633 = null;
            field618 = null;
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(II)V")
    public abstract void method306(int arg0, int arg1);

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(IIIIII)V")
    public abstract void method308(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "(IIII)V")
    public abstract void method309(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(IIIII)V")
    public abstract void method310(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(III)V")
    public abstract void method312(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "(II)V")
    public abstract void method314(int arg0, int arg1);
}
