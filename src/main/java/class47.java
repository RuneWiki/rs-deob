import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public class class47 {

    @OriginalMember(owner = "client!ie", name = "d", descriptor = "I")
    public static int field824 = 1;

    @OriginalMember(owner = "client!ie", name = "f", descriptor = "[I")
    public static int[] field826 = new int[64];

    @OriginalMember(owner = "client!ie", name = "i", descriptor = "[Lii;")
    public static class218[] field829 = new class218[50];

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "I")
    public static int field821;

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "I")
    public static int field822;

    @OriginalMember(owner = "client!ie", name = "c", descriptor = "I")
    public int field823;

    @OriginalMember(owner = "client!ie", name = "e", descriptor = "I")
    public static int field825;

    @OriginalMember(owner = "client!ie", name = "g", descriptor = "I")
    public int field827;

    @OriginalMember(owner = "client!ie", name = "h", descriptor = "I")
    public int field828;

    @OriginalMember(owner = "client!ie", name = "j", descriptor = "I")
    public static int field830;

    @OriginalMember(owner = "client!ie", name = "k", descriptor = "I")
    public static int field831;

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "([II)[I")
    public static final int[] method293(int[] arg0, int arg1) {
        field830++;
        if (arg0 == null) {
            return null;
        }
        if (arg1 != -27689) {
            method293((int[]) null, 4);
        }
        int[] var2 = new int[arg0.length];
        class235.method1559(arg0, 0, var2, 0, arg0.length);
        return var2;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(IILeh;)V")
    private final void method294(int arg0, int arg1, class101 arg2) {
        field831++;
        if (arg1 == 1) {
            this.field828 = arg2.method677(false);
            this.field827 = arg2.method669((byte) 36);
            this.field823 = arg2.method669((byte) 36);
        }
        if (arg0 < 71) {
            method293((int[]) null, 69);
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(BLeh;)V")
    public final void method295(byte arg0, class101 arg1) {
        field822++;
        if (arg0 > -122) {
            method297((byte) 81);
        }
        while (true) {
            int var3 = arg1.method669((byte) 36);
            if (var3 == 0) {
                return;
            }
            this.method294(107, var3, arg1);
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(I)V")
    public static void method296(int arg0) {
        int var1 = -21 % ((-arg0 - 10) / 40);
        field829 = null;
        field826 = null;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(B)V")
    public static final void method297(byte arg0) {
        field821++;
        boolean var1 = false;
        if (arg0 != 125) {
            method296(-44);
        }
        while (!var1) {
            var1 = true;
            for (int var2 = 0; var2 < (class275.field4399 - 1); var2++) {
                if (class101.field1788[var2] < 1000 && class101.field1788[var2 + 1] > 1000) {
                    var1 = false;
                    String var3 = class93.field1636[var2];
                    class93.field1636[var2] = class93.field1636[var2 + 1];
                    class93.field1636[var2 + 1] = var3;
                    String var4 = class93.field1632[var2];
                    class93.field1632[var2] = class93.field1632[var2 + 1];
                    class93.field1632[var2 + 1] = var4;
                    int var5 = class60.field1052[var2];
                    class60.field1052[var2] = class60.field1052[var2 + 1];
                    class60.field1052[var2 + 1] = var5;
                    int var6 = class145.field2477[var2];
                    class145.field2477[var2] = class145.field2477[var2 + 1];
                    class145.field2477[var2 + 1] = var6;
                    int var7 = class291.field4653[var2];
                    class291.field4653[var2] = class291.field4653[var2 + 1];
                    class291.field4653[var2 + 1] = var7;
                    short var8 = class101.field1788[var2];
                    class101.field1788[var2] = class101.field1788[var2 + 1];
                    class101.field1788[var2 + 1] = var8;
                    long var9 = class153.field2563[var2];
                    class153.field2563[var2] = class153.field2563[var2 + 1];
                    class153.field2563[var2 + 1] = var9;
                }
            }
        }
    }
}
