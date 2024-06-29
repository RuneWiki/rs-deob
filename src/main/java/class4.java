import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!ba")
public class class4 {

    @OriginalMember(owner = "mapview!ba", name = "f", descriptor = "Lf;")
    public static class10 field25 = class23.method139("50(U", (byte) -75);

    @OriginalMember(owner = "mapview!ba", name = "h", descriptor = "Lf;")
    public static class10 field27 = class23.method139("map", (byte) -120);

    @OriginalMember(owner = "mapview!ba", name = "g", descriptor = "Lf;")
    public static class10 field26 = class23.method139("Furnace", (byte) -61);

    @OriginalMember(owner = "mapview!ba", name = "e", descriptor = "Lf;")
    public static class10 field24 = class23.method139("Candle Shop", (byte) -81);

    @OriginalMember(owner = "mapview!ba", name = "j", descriptor = "Lf;")
    public static class10 field29 = class23.method139("fonts", (byte) -108);

    @OriginalMember(owner = "mapview!ba", name = "b", descriptor = "Lf;")
    public static class10 field21 = class23.method139("(U", (byte) -79);

    @OriginalMember(owner = "mapview!ba", name = "d", descriptor = "J")
    public long field23;

    @OriginalMember(owner = "mapview!ba", name = "a", descriptor = "Lt;")
    public static class38 field20;

    @OriginalMember(owner = "mapview!ba", name = "c", descriptor = "Lba;")
    public class4 field22;

    @OriginalMember(owner = "mapview!ba", name = "i", descriptor = "Lba;")
    public class4 field28;

    @OriginalMember(owner = "mapview!ba", name = "a", descriptor = "(IBZII)V", line = 5)
    public static final void method16(int arg0, byte arg1, boolean arg2, int arg3, int arg4) {
        if (!arg2) {
            method17(false);
        }
        int var5 = arg4 >> 6;
        int var6 = arg3 >> 6;
        if (class38.field527[arg0][var6][var5] == null) {
            class38.field527[arg0][var6][var5] = new byte[4096];
        }
        class38.field527[arg0][var6][var5][(class2.method5(arg3, 63) << 6) + class2.method5(63, arg4)] = arg1;
    }

    @OriginalMember(owner = "mapview!ba", name = "a", descriptor = "(Z)V", line = 29)
    public static final void method17(boolean arg0) {
        if (class21.field235 != null) {
            class27 var1 = class21.field235;
            synchronized (class21.field235) {
                class21.field235 = null;
            }
        }
        if (!arg0) {
            method16(80, (byte) -100, false, 112, -19);
        }
    }

    @OriginalMember(owner = "mapview!ba", name = "b", descriptor = "(Z)V", line = 52)
    public final void method18(boolean arg0) {
        if (this.field22 != null && arg0) {
            this.field22.field28 = this.field28;
            this.field28.field22 = this.field22;
            this.field22 = null;
            this.field28 = null;
        }
    }

    @OriginalMember(owner = "mapview!ba", name = "a", descriptor = "(I)V", line = 78)
    public static void method19(int arg0) {
        int var1 = 71 % ((-arg0 - 45) / 57);
        field29 = null;
        field24 = null;
        field20 = null;
        field27 = null;
        field21 = null;
        field26 = null;
        field25 = null;
    }

    @OriginalMember(owner = "mapview!ba", name = "b", descriptor = "(I)I", line = 100)
    public static final int method20(int arg0) {
        if (arg0 != 0) {
            field21 = null;
        }
        if (class5.field36 == null) {
            return 0;
        } else if (class5.field36.field261 == null) {
            return class41.field536[class5.field36.field264 & 0xFF];
        } else {
            return class41.field536[class5.field36.field261[class41.field538] & 0xFF];
        }
    }

    @OriginalMember(owner = "mapview!ba", name = "a", descriptor = "([Lf;I)V", line = 129)
    public static final void method21(class10[] arg0, int arg1) {
        int var2 = 52 % ((arg1 - 73) / 45);
        mapview.method155(0, arg0.length, 20927, arg0);
    }
}
