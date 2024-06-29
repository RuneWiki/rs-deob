import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!ka")
public class class19 {

    @OriginalMember(owner = "mapview!ka", name = "p", descriptor = "[Lg;")
    private class10[] field202;

    @OriginalMember(owner = "mapview!ka", name = "h", descriptor = "I")
    private int field194;

    @OriginalMember(owner = "mapview!ka", name = "g", descriptor = "Lw;")
    public static class38 field193 = class35.method219("Fishing Shop", true);

    @OriginalMember(owner = "mapview!ka", name = "c", descriptor = "Lw;")
    public static class38 field189 = class35.method219("Gem Shop", true);

    @OriginalMember(owner = "mapview!ka", name = "f", descriptor = "Lw;")
    public static class38 field192 = class35.method219("Slayer Master", true);

    @OriginalMember(owner = "mapview!ka", name = "b", descriptor = "I")
    public static int field188 = 0;

    @OriginalMember(owner = "mapview!ka", name = "k", descriptor = "Lw;")
    public static class38 field197 = class35.method219("Please wait)3)3)3 Rendering Map", true);

    @OriginalMember(owner = "mapview!ka", name = "q", descriptor = "Lw;")
    public static class38 field203 = class35.method219("u_pass", true);

    @OriginalMember(owner = "mapview!ka", name = "j", descriptor = "Lw;")
    public static class38 field196 = class35.method219("Silk Trader", true);

    @OriginalMember(owner = "mapview!ka", name = "n", descriptor = "I")
    public static int field200 = -1;

    @OriginalMember(owner = "mapview!ka", name = "r", descriptor = "Lw;")
    public static class38 field204 = class35.method219("Hair Dressers", true);

    @OriginalMember(owner = "mapview!ka", name = "i", descriptor = "Lw;")
    public static class38 field195 = class35.method219("", true);

    @OriginalMember(owner = "mapview!ka", name = "o", descriptor = "Lw;")
    public static class38 field201 = class35.method219("details)3dat", true);

    @OriginalMember(owner = "mapview!ka", name = "s", descriptor = "[I")
    public static int[] field205 = new int[128];

    @OriginalMember(owner = "mapview!ka", name = "a", descriptor = "I")
    public static int field187;

    @OriginalMember(owner = "mapview!ka", name = "d", descriptor = "I")
    public static int field190;

    @OriginalMember(owner = "mapview!ka", name = "e", descriptor = "J")
    private long field191;

    @OriginalMember(owner = "mapview!ka", name = "l", descriptor = "Lg;")
    private class10 field198;

    @OriginalMember(owner = "mapview!ka", name = "m", descriptor = "Lt;")
    public static class35 field199;

    @OriginalMember(owner = "mapview!ka", name = "a", descriptor = "(I)Lg;", line = 5)
    public final class10 method114(int arg0) {
        if (this.field198 == null) {
            return null;
        }
        if (arg0 != 73) {
            method117((byte) -53);
        }
        class10 var2 = this.field202[(int) ((long) (this.field194 - 1) & this.field191)];
        while (this.field198 != var2) {
            if (this.field198.field81 == this.field191) {
                class10 var3 = this.field198;
                this.field198 = this.field198.field80;
                return var3;
            }
            this.field198 = this.field198.field80;
        }
        this.field198 = null;
        return null;
    }

    @OriginalMember(owner = "mapview!ka", name = "b", descriptor = "(I)V", line = 38)
    public static void method115(int arg0) {
        field199 = null;
        field195 = null;
        field196 = null;
        field205 = null;
        field203 = null;
        field197 = null;
        if (arg0 != -5207) {
            return;
        }
        field204 = null;
        field193 = null;
        field189 = null;
        field201 = null;
        field192 = null;
    }

    @OriginalMember(owner = "mapview!ka", name = "a", descriptor = "(IZ)V", line = 59)
    public static final void method116(int arg0, boolean arg1) {
        if (class24.field338.field227 == null) {
            return;
        }
        for (int var2 = 0; var2 < 50 && class24.field338.field227.peekEvent() != null; var2++) {
            class8.method36(1L, 10);
        }
        int var3 = 114 % ((arg0 + 4) / 59);
        if (arg1) {
            class24.field338.field227.postEvent(new ActionEvent(class31.field397, 1001, "dummy"));
        }
    }

    @OriginalMember(owner = "mapview!ka", name = "a", descriptor = "(B)V", line = 85)
    public static final void method117(byte arg0) {
        if (arg0 >= -54) {
            method116(-22, true);
        }
        if (class22.field224.toLowerCase().indexOf("microsoft") != -1) {
            class34.field439[222] = 59;
            class34.field439[188] = 71;
            class34.field439[221] = 43;
            class34.field439[189] = 26;
            class34.field439[186] = 57;
            class34.field439[191] = 73;
            class34.field439[192] = 58;
            class34.field439[190] = 72;
            class34.field439[220] = 74;
            class34.field439[187] = 27;
            class34.field439[219] = 42;
            class34.field439[223] = 28;
            return;
        }
        class34.field439[61] = 27;
        class34.field439[91] = 42;
        if (class22.field234 == null) {
            class34.field439[222] = 59;
            class34.field439[192] = 58;
        } else {
            class34.field439[192] = 28;
            class34.field439[222] = 58;
            class34.field439[520] = 59;
        }
        class34.field439[93] = 43;
        class34.field439[44] = 71;
        class34.field439[47] = 73;
        class34.field439[59] = 57;
        class34.field439[45] = 26;
        class34.field439[46] = 72;
        class34.field439[92] = 74;
    }

    @OriginalMember(owner = "mapview!ka", name = "a", descriptor = "(IJ)Lg;", line = 190)
    public final class10 method118(int arg0, long arg1) {
        this.field191 = arg1;
        if (arg0 != -15725) {
            return (class10) null;
        }
        class10 var4 = this.field202[(int) (arg1 & (long) (this.field194 - 1))];
        for (this.field198 = var4.field80; this.field198 != var4; this.field198 = this.field198.field80) {
            if (this.field198.field81 == arg1) {
                class10 var5 = this.field198;
                this.field198 = this.field198.field80;
                return var5;
            }
        }
        this.field198 = null;
        return null;
    }

    @OriginalMember(owner = "mapview!ka", name = "a", descriptor = "(Lg;IJ)V", line = 236)
    public final void method119(class10 arg0, int arg1, long arg2) {
        if (arg0.field88 != null) {
            arg0.method46((byte) -124);
        }
        class10 var5 = this.field202[(int) (arg2 & (long) (this.field194 - 1))];
        arg0.field80 = var5;
        arg0.field88 = var5.field88;
        arg0.field81 = arg2;
        arg0.field88.field80 = arg0;
        arg0.field80.field88 = arg0;
        if (arg1 != -51) {
            this.method118(114, -80L);
        }
    }

    @OriginalMember(owner = "mapview!ka", name = "<init>", descriptor = "(I)V", line = 273)
    public class19(int arg0) {
        this.field202 = new class10[arg0];
        this.field194 = arg0;
        for (int var2 = 0; var2 < arg0; var2++) {
            class10 var3 = this.field202[var2] = new class10();
            var3.field88 = var3;
            var3.field80 = var3;
        }
    }
}
