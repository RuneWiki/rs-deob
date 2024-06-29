import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eo")
public class class193 extends class354 {

    @OriginalMember(owner = "client!eo", name = "P", descriptor = "[I")
    public static int[] field2829 = new int[6];

    @OriginalMember(owner = "client!eo", name = "J", descriptor = "Lmt;")
    public static class271 field2824 = new class271("stellardawn", 1);

    @OriginalMember(owner = "client!eo", name = "S", descriptor = "I")
    public static int field2832 = 0;

    @OriginalMember(owner = "client!eo", name = "R", descriptor = "Lgf;")
    public static class180 field2831 = new class180("flash2:", "blinken2:", "clignotant2:", "flash2:");

    @OriginalMember(owner = "client!eo", name = "U", descriptor = "Lgf;")
    public static class180 field2834;

    @OriginalMember(owner = "client!eo", name = "V", descriptor = "Lgf;")
    public static class180 field2835;

    @OriginalMember(owner = "client!eo", name = "H", descriptor = "I")
    public static int field2822;

    @OriginalMember(owner = "client!eo", name = "I", descriptor = "I")
    public static int field2823;

    @OriginalMember(owner = "client!eo", name = "K", descriptor = "I")
    private int field2825;

    @OriginalMember(owner = "client!eo", name = "L", descriptor = "I")
    public static int field2826;

    @OriginalMember(owner = "client!eo", name = "N", descriptor = "I")
    private int field2827;

    @OriginalMember(owner = "client!eo", name = "O", descriptor = "I")
    public static int field2828;

    @OriginalMember(owner = "client!eo", name = "Q", descriptor = "I")
    private int field2830;

    @OriginalMember(owner = "client!eo", name = "T", descriptor = "I")
    public static int field2833;

    static {
        new class516("", 73);
        field2834 = new class180("Cancel", "Abbrechen", "Annuler", "Cancelar");
        field2835 = new class180("Loading...", "Lade...", "Chargement en cours...", "Carregando...");
    }

    @OriginalMember(owner = "client!eo", name = "<init>", descriptor = "()V", line = 3)
    public class193() {
        this(0);
    }

    @OriginalMember(owner = "client!eo", name = "e", descriptor = "(I)V", line = 7)
    public static final void method1317(int arg0) {
        class54.field796 = true;
        if (arg0 != 16711680) {
            field2831 = null;
        }
        ++field2826;
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(II)V", line = 18)
    private final void method1318(int arg0, int arg1) {
        this.field2827 = 4080 & arg1 << 4;
        int var3 = -33 / ((-4 - arg0) / 38);
        ++field2823;
        this.field2825 = 4080 & arg1 >> 4;
        this.field2830 = (arg1 & 16711680) >> 12;
    }

    @OriginalMember(owner = "client!eo", name = "<init>", descriptor = "(I)V", line = 31)
    private class193(int arg0) {
        super(0, false);
        this.method1318(109, arg0);
    }

    @OriginalMember(owner = "client!eo", name = "d", descriptor = "(Z)V", line = 49)
    public static void method1319(boolean arg0) {
        field2831 = null;
        if (!arg0) {
            field2829 = null;
        }
        field2835 = null;
        field2834 = null;
        field2824 = null;
        field2829 = null;
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(BI)[[I", line = 67)
    public final int[][] method207(byte arg0, int arg1) {
        ++field2833;
        int[][] var3 = super.field5351.method2819((byte) -63, arg1);
        if (arg0 >= -40) {
            return null;
        } else {
            if (super.field5351.field6959) {
                int[] var4 = var3[0];
                int[] var5 = var3[1];
                int[] var6 = var3[2];
                for (int var7 = 0; var7 < class404.field5952; ++var7) {
                    var4[var7] = this.field2830;
                    var5[var7] = this.field2825;
                    var6[var7] = this.field2827;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(ILti;I)V", line = 105)
    public final void method206(int arg0, class303 arg1, int arg2) {
        if (arg2 == 0) {
            this.method1318(-99, arg1.method1866(false));
        }
        if (arg0 != 15180) {
            this.method207((byte) -28, -80);
        }
        ++field2828;
    }
}
