import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!ga")
public class class12 {

    @OriginalMember(owner = "mapview!ga", name = "b", descriptor = "Lna;")
    public static class26 field140 = class6.method40("Rare Trees", 48);

    @OriginalMember(owner = "mapview!ga", name = "d", descriptor = "Lna;")
    public static class26 field142 = class6.method40("Hair Dressers", 48);

    @OriginalMember(owner = "mapview!ga", name = "a", descriptor = "Lna;")
    public static class26 field139 = class6.method40("details)3dat", 48);

    @OriginalMember(owner = "mapview!ga", name = "i", descriptor = "Lna;")
    public static class26 field147 = class6.method40("Estate Agent", 48);

    @OriginalMember(owner = "mapview!ga", name = "f", descriptor = "[I")
    public static int[] field144 = new int[256];

    @OriginalMember(owner = "mapview!ga", name = "l", descriptor = "Lna;")
    public static class26 field150;

    @OriginalMember(owner = "mapview!ga", name = "k", descriptor = "Lna;")
    public static class26 field149;

    @OriginalMember(owner = "mapview!ga", name = "p", descriptor = "I")
    public static int field154;

    @OriginalMember(owner = "mapview!ga", name = "q", descriptor = "Lna;")
    public static class26 field155;

    @OriginalMember(owner = "mapview!ga", name = "m", descriptor = "[I")
    public static int[] field151;

    @OriginalMember(owner = "mapview!ga", name = "n", descriptor = "Lna;")
    public static class26 field152;

    @OriginalMember(owner = "mapview!ga", name = "j", descriptor = "J")
    public long field148;

    @OriginalMember(owner = "mapview!ga", name = "e", descriptor = "Lga;")
    public class12 field143;

    @OriginalMember(owner = "mapview!ga", name = "g", descriptor = "Lga;")
    public class12 field145;

    @OriginalMember(owner = "mapview!ga", name = "o", descriptor = "Lsa;")
    public static class35 field153;

    @OriginalMember(owner = "mapview!ga", name = "c", descriptor = "Lc;")
    public static class5 field141;

    @OriginalMember(owner = "mapview!ga", name = "h", descriptor = "[[Lba;")
    public static class4[][] field146;

    @OriginalMember(owner = "mapview!ga", name = "a", descriptor = "(I)V", line = 4)
    public final void method76(int arg0) {
        if (this.field145 == null) {
            return;
        }
        if (arg0 < 89) {
            this.method76(32);
        }
        this.field145.field143 = this.field143;
        this.field143.field145 = this.field145;
        this.field143 = null;
        this.field145 = null;
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            int var1 = var0;
            for (int var2 = 0; var2 < 8; var2++) {
                if ((var1 & 0x1) == 1) {
                    var1 = var1 >>> 1 ^ 0xEDB88320;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field144[var0] = var1;
        }
        field150 = class6.method40("Prev page", 48);
        field149 = class6.method40("Legende", 48);
        field154 = 0;
        field155 = class6.method40("Furnace", 48);
        field151 = new int[128];
        field152 = class6.method40("Key", 48);
    }

    @OriginalMember(owner = "mapview!ga", name = "b", descriptor = "(I)V", line = 68)
    public static void method77(int arg0) {
        field153 = null;
        field141 = null;
        field142 = null;
        field146 = null;
        field140 = null;
        field147 = null;
        field155 = null;
        field139 = null;
        field152 = null;
        if (arg0 != -13648) {
            field152 = null;
        }
        field144 = null;
        field149 = null;
        field151 = null;
        field150 = null;
    }
}
