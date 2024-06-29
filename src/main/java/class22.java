import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!l")
public class class22 {

    @OriginalMember(owner = "mapview!l", name = "o", descriptor = "I")
    private int field277;

    @OriginalMember(owner = "mapview!l", name = "d", descriptor = "[Lha;")
    private class16[] field266;

    @OriginalMember(owner = "mapview!l", name = "c", descriptor = "Lba;")
    public static class4 field265 = class14.method105((byte) -111, "Platelegs Shop");

    @OriginalMember(owner = "mapview!l", name = "g", descriptor = "Lba;")
    public static class4 field269 = class14.method105((byte) -114, "Candle Shop");

    @OriginalMember(owner = "mapview!l", name = "h", descriptor = "Lba;")
    public static class4 field270 = class14.method105((byte) -71, "Find");

    @OriginalMember(owner = "mapview!l", name = "b", descriptor = "Lba;")
    public static class4 field264 = class14.method105((byte) -73, "Sword Shop");

    @OriginalMember(owner = "mapview!l", name = "p", descriptor = "Lba;")
    public static class4 field278 = class14.method105((byte) -80, "Estate Agent");

    @OriginalMember(owner = "mapview!l", name = "a", descriptor = "Lba;")
    public static class4 field263 = class14.method105((byte) -108, "overlay2)3dat");

    @OriginalMember(owner = "mapview!l", name = "r", descriptor = "Lba;")
    public static class4 field280 = class14.method105((byte) -68, "Scimitar Shop");

    @OriginalMember(owner = "mapview!l", name = "m", descriptor = "Lba;")
    public static class4 field275 = class14.method105((byte) -85, "Next page");

    @OriginalMember(owner = "mapview!l", name = "q", descriptor = "Lba;")
    public static class4 field279 = class14.method105((byte) -96, "Kebab Seller");

    @OriginalMember(owner = "mapview!l", name = "n", descriptor = "Lba;")
    public static class4 field276 = class14.method105((byte) -76, "Furnace");

    @OriginalMember(owner = "mapview!l", name = "j", descriptor = "I")
    public static int field272;

    @OriginalMember(owner = "mapview!l", name = "k", descriptor = "J")
    private long field273;

    @OriginalMember(owner = "mapview!l", name = "e", descriptor = "Lga;")
    public static class14 field267;

    @OriginalMember(owner = "mapview!l", name = "i", descriptor = "Lha;")
    private class16 field271;

    @OriginalMember(owner = "mapview!l", name = "f", descriptor = "Lba;")
    public static class4 field268;

    @OriginalMember(owner = "mapview!l", name = "l", descriptor = "[I")
    public static int[] field274;

    @OriginalMember(owner = "mapview!l", name = "a", descriptor = "(Z)Lha;", line = 18)
    public final class16 method155(boolean arg0) {
        if (this.field271 == null) {
            return null;
        }
        if (!arg0) {
            field274 = null;
        }
        class16 var2 = this.field266[(int) ((long) (this.field277 - 1) & this.field273)];
        while (this.field271 != var2) {
            if (this.field271.field210 == this.field273) {
                class16 var3 = this.field271;
                this.field271 = this.field271.field203;
                return var3;
            }
            this.field271 = this.field271.field203;
        }
        this.field271 = null;
        return null;
    }

    @OriginalMember(owner = "mapview!l", name = "a", descriptor = "(I)V", line = 72)
    public static void method156(int arg0) {
        field275 = null;
        field276 = null;
        field274 = null;
        field280 = null;
        field265 = null;
        field264 = null;
        field270 = null;
        field269 = null;
        field279 = null;
        field278 = null;
        field268 = null;
        field267 = null;
        if (arg0 != 11781) {
            field275 = null;
        }
        field263 = null;
    }

    @OriginalMember(owner = "mapview!l", name = "a", descriptor = "(JB)Lha;", line = 110)
    public final class16 method157(long arg0, byte arg1) {
        if (arg1 < 31) {
            return (class16) null;
        }
        this.field273 = arg0;
        class16 var4 = this.field266[(int) ((long) (this.field277 - 1) & arg0)];
        for (this.field271 = var4.field203; this.field271 != var4; this.field271 = this.field271.field203) {
            if (this.field271.field210 == arg0) {
                class16 var5 = this.field271;
                this.field271 = this.field271.field203;
                return var5;
            }
        }
        this.field271 = null;
        return null;
    }

    @OriginalMember(owner = "mapview!l", name = "a", descriptor = "(BLha;J)V", line = 145)
    public final void method158(byte arg0, class16 arg1, long arg2) {
        if (arg1.field205 != null) {
            arg1.method118(true);
        }
        class16 var5 = this.field266[(int) (arg2 & (long) (this.field277 - 1))];
        arg1.field210 = arg2;
        arg1.field205 = var5.field205;
        arg1.field203 = var5;
        arg1.field205.field203 = arg1;
        if (arg0 >= -122) {
            this.method158((byte) 27, null, -43L);
        }
        arg1.field203.field205 = arg1;
    }

    @OriginalMember(owner = "mapview!l", name = "<init>", descriptor = "(I)V", line = 177)
    public class22(int arg0) {
        this.field277 = arg0;
        this.field266 = new class16[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class16 var3 = this.field266[var2] = new class16();
            var3.field205 = var3;
            var3.field203 = var3;
        }
    }

    @OriginalMember(owner = "mapview!l", name = "b", descriptor = "(I)V", line = 201)
    public static final void method159(int arg0) {
        if (class35.field435 != null) {
            class27 var1 = class35.field435;
            synchronized (class35.field435) {
                class35.field435 = null;
            }
        }
        if (arg0 < 52) {
            field276 = null;
        }
    }
}
