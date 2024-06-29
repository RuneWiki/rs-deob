import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!ma")
public class class24 {

    @OriginalMember(owner = "mapview!ma", name = "d", descriptor = "I")
    private int field281;

    @OriginalMember(owner = "mapview!ma", name = "a", descriptor = "[Ll;")
    private class21[] field278;

    @OriginalMember(owner = "mapview!ma", name = "b", descriptor = "Lt;")
    public static class36 field279 = class3.method8(13631, "Agility Training");

    @OriginalMember(owner = "mapview!ma", name = "c", descriptor = "Lt;")
    public static class36 field280 = class3.method8(13631, "Please wait)3)3)3 Rendering Map");

    @OriginalMember(owner = "mapview!ma", name = "h", descriptor = "Lt;")
    public static class36 field285 = class3.method8(13631, "Pet Shop");

    @OriginalMember(owner = "mapview!ma", name = "g", descriptor = "Lt;")
    public static class36 field284 = class3.method8(13631, "Axe Shop");

    @OriginalMember(owner = "mapview!ma", name = "j", descriptor = "Lt;")
    public static class36 field287 = class3.method8(13631, "underlay)3dat");

    @OriginalMember(owner = "mapview!ma", name = "l", descriptor = "Lt;")
    public static class36 field289 = class3.method8(13631, "Mining Site");

    @OriginalMember(owner = "mapview!ma", name = "i", descriptor = "Lt;")
    public static class36 field286 = class3.method8(13631, "Vegetable Store");

    @OriginalMember(owner = "mapview!ma", name = "m", descriptor = "Lt;")
    public static class36 field290 = class3.method8(13631, "Find");

    @OriginalMember(owner = "mapview!ma", name = "e", descriptor = "J")
    private long field282;

    @OriginalMember(owner = "mapview!ma", name = "f", descriptor = "Ll;")
    private class21 field283;

    @OriginalMember(owner = "mapview!ma", name = "k", descriptor = "[I")
    public static int[] field288;

    @OriginalMember(owner = "mapview!ma", name = "a", descriptor = "(Z)V", line = 4)
    public static void method129(boolean arg0) {
        field286 = null;
        field290 = null;
        field280 = null;
        field288 = null;
        field285 = null;
        field289 = null;
        field279 = null;
        field287 = null;
        field284 = null;
        if (!arg0) {
            field286 = null;
        }
    }

    @OriginalMember(owner = "mapview!ma", name = "a", descriptor = "(I)I", line = 39)
    public static final int method130(int arg0) {
        if (arg0 != -1) {
            return 126;
        } else if (class22.field274 == null) {
            return 0;
        } else if (class22.field274.field537 == null) {
            return class7.field75[class22.field274.field536 & 0xFF];
        } else {
            return class7.field75[class22.field274.field537[class6.field65] & 0xFF];
        }
    }

    @OriginalMember(owner = "mapview!ma", name = "a", descriptor = "(Ll;JI)V", line = 70)
    public final void method131(class21 arg0, long arg1, int arg2) {
        if (arg0.field260 != null) {
            arg0.method126(1);
        }
        class21 var5 = this.field278[(int) ((long) (this.field281 - 1) & arg1)];
        arg0.field270 = arg1;
        arg0.field267 = var5;
        arg0.field260 = var5.field260;
        arg0.field260.field267 = arg0;
        if (arg2 <= 47) {
            field286 = null;
        }
        arg0.field267.field260 = arg0;
    }

    @OriginalMember(owner = "mapview!ma", name = "<init>", descriptor = "(I)V", line = 88)
    public class24(int arg0) {
        this.field281 = arg0;
        this.field278 = new class21[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class21 var3 = this.field278[var2] = new class21();
            var3.field260 = var3;
            var3.field267 = var3;
        }
    }

    @OriginalMember(owner = "mapview!ma", name = "a", descriptor = "(JB)Ll;", line = 111)
    public final class21 method132(long arg0, byte arg1) {
        if (arg1 != -29) {
            field288 = null;
        }
        this.field282 = arg0;
        class21 var4 = this.field278[(int) (arg0 & (long) (this.field281 - 1))];
        for (this.field283 = var4.field267; this.field283 != var4; this.field283 = this.field283.field267) {
            if (this.field283.field270 == arg0) {
                class21 var5 = this.field283;
                this.field283 = this.field283.field267;
                return var5;
            }
        }
        this.field283 = null;
        return null;
    }

    @OriginalMember(owner = "mapview!ma", name = "a", descriptor = "(B)Ll;", line = 167)
    public final class21 method133(byte arg0) {
        if (arg0 < 51) {
            this.method131(null, 119L, 80);
        }
        if (this.field283 == null) {
            return null;
        }
        class21 var2 = this.field278[(int) ((long) (this.field281 - 1) & this.field282)];
        while (this.field283 != var2) {
            if (this.field283.field270 == this.field282) {
                class21 var3 = this.field283;
                this.field283 = this.field283.field267;
                return var3;
            }
            this.field283 = this.field283.field267;
        }
        this.field283 = null;
        return null;
    }
}
