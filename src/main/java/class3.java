import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!b")
public class class3 {

    @OriginalMember(owner = "mapview!b", name = "e", descriptor = "[I")
    private int[] field83;

    @OriginalMember(owner = "mapview!b", name = "d", descriptor = "Lk;")
    public static class21 field82 = class14.method92((byte) 57, "Amulet Shop");

    @OriginalMember(owner = "mapview!b", name = "a", descriptor = "Lk;")
    public static class21 field79 = class14.method92((byte) 57, "Next page");

    @OriginalMember(owner = "mapview!b", name = "g", descriptor = "Lk;")
    public static class21 field85 = class14.method92((byte) 57, "overlay)3dat");

    @OriginalMember(owner = "mapview!b", name = "b", descriptor = "Lk;")
    public static class21 field80 = class14.method92((byte) 57, "Axe Shop");

    @OriginalMember(owner = "mapview!b", name = "i", descriptor = "Lk;")
    public static class21 field87 = class14.method92((byte) 57, "Fishing Shop");

    @OriginalMember(owner = "mapview!b", name = "f", descriptor = "Lk;")
    public static class21 field84 = class14.method92((byte) 57, "sprites");

    @OriginalMember(owner = "mapview!b", name = "j", descriptor = "I")
    public static int field88 = 0;

    @OriginalMember(owner = "mapview!b", name = "h", descriptor = "Lk;")
    public static class21 field86 = class14.method92((byte) 57, "underlay)3dat");

    @OriginalMember(owner = "mapview!b", name = "c", descriptor = "[[B")
    public static byte[][] field81 = new byte[250][];

    @OriginalMember(owner = "mapview!b", name = "k", descriptor = "Z")
    public static boolean field89 = false;

    @OriginalMember(owner = "mapview!b", name = "<init>", descriptor = "([I)V", line = 36)
    public class3(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= (arg0.length >> 1) + arg0.length; var2 <<= 0x1) {
        }
        this.field83 = new int[var2 + var2];
        for (int var3 = 0; var3 < var2 + var2; var3++) {
            this.field83[var3] = -1;
        }
        int var4 = 0;
        while (arg0.length > var4) {
            int var5;
            for (var5 = var2 - 1 & arg0[var4]; this.field83[var5 + var5 + 1] != -1; var5 = var2 - 1 & var5 + 1) {
            }
            this.field83[var5 + var5] = arg0[var4];
            this.field83[var5 + var5 + 1] = var4++;
        }
    }

    @OriginalMember(owner = "mapview!b", name = "a", descriptor = "(ZI)I", line = 111)
    public final int method44(boolean arg0, int arg1) {
        int var3 = this.field83.length - 2;
        if (!arg0) {
            field81 = null;
        }
        int var4 = var3 & arg1 << 1;
        while (true) {
            int var5 = this.field83[var4];
            if (arg1 == var5) {
                return this.field83[var4 + 1];
            }
            if (var5 == -1) {
                return -1;
            }
            var4 = var4 + 2 & var3;
        }
    }

    @OriginalMember(owner = "mapview!b", name = "a", descriptor = "(I)V", line = 141)
    public static void method45(int arg0) {
        field84 = null;
        if (arg0 != -1) {
            return;
        }
        field85 = null;
        field82 = null;
        field87 = null;
        field86 = null;
        field79 = null;
        field80 = null;
        field81 = null;
    }
}
