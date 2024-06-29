import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!e")
public class class38 {

    @OriginalMember(owner = "client!e", name = "j", descriptor = "[I")
    private int[] field695;

    @OriginalMember(owner = "client!e", name = "f", descriptor = "I")
    public static int field691 = 0;

    @OriginalMember(owner = "client!e", name = "c", descriptor = "[I")
    public static int[] field688 = new int[100];

    @OriginalMember(owner = "client!e", name = "a", descriptor = "I")
    public static int field686 = 0;

    @OriginalMember(owner = "client!e", name = "d", descriptor = "Lsd;")
    public static class166 field689 = class135.method935("blinken3:", 0);

    @OriginalMember(owner = "client!e", name = "i", descriptor = "Lsd;")
    public static class166 field694 = class135.method935("Bitte versuchen Sie)1", 0);

    @OriginalMember(owner = "client!e", name = "k", descriptor = "Lsd;")
    public static class166 field696 = class135.method935("Benutzername: ", 0);

    @OriginalMember(owner = "client!e", name = "g", descriptor = "Lsd;")
    public static class166 field692 = class135.method935("Abbrechen", 0);

    @OriginalMember(owner = "client!e", name = "b", descriptor = "I")
    public static int field687;

    @OriginalMember(owner = "client!e", name = "e", descriptor = "I")
    public static int field690;

    @OriginalMember(owner = "client!e", name = "h", descriptor = "I")
    public static int field693;

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(II)I")
    public final int method263(int arg0, int arg1) {
        field687++;
        int var3 = (this.field695.length >> 1) - 1;
        int var4 = var3 & arg0;
        int var5 = -24 % ((-arg1 - 25) / 36);
        while (true) {
            int var6 = this.field695[var4 + var4 + 1];
            if (var6 == -1) {
                return -1;
            }
            if (this.field695[var4 + var4] == arg0) {
                return var6;
            }
            var4 = var4 + 1 & var3;
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(B)V")
    public static void method264(byte arg0) {
        field696 = null;
        field692 = null;
        field694 = null;
        if (arg0 < -6) {
            field688 = null;
            field689 = null;
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(I)V")
    public static final void method265(int arg0) {
        field693++;
        class138.field2688.method71(500);
        if (arg0 != 0) {
            method264((byte) 21);
        }
        class191.field3629.method71(500);
    }

    @OriginalMember(owner = "client!e", name = "<init>", descriptor = "([I)V")
    public class38(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= arg0.length + (arg0.length >> 1); var2 <<= 0x1) {
        }
        this.field695 = new int[var2 + var2];
        for (int var3 = 0; var3 < var2 + var2; var3++) {
            this.field695[var3] = -1;
        }
        int var4 = 0;
        while (arg0.length > var4) {
            int var5;
            for (var5 = arg0[var4] & var2 - 1; this.field695[var5 + var5 + 1] != -1; var5 = var2 - 1 & var5 + 1) {
            }
            this.field695[var5 + var5] = arg0[var4];
            this.field695[var5 + var5 + 1] = var4++;
        }
    }
}
