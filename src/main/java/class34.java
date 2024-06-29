import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!s")
public class class34 {

    @OriginalMember(owner = "mapview!s", name = "i", descriptor = "[Lfa;")
    private class10[] field487;

    @OriginalMember(owner = "mapview!s", name = "c", descriptor = "I")
    private int field481;

    @OriginalMember(owner = "mapview!s", name = "b", descriptor = "I")
    public static volatile int field480 = 0;

    @OriginalMember(owner = "mapview!s", name = "f", descriptor = "Lia;")
    private static class15 field484 = class28.method196("Herbalist", false);

    @OriginalMember(owner = "mapview!s", name = "h", descriptor = "Lia;")
    private static class15 field486 = class28.method196("Silver Shop", false);

    @OriginalMember(owner = "mapview!s", name = "d", descriptor = "Lia;")
    private static class15 field482 = class28.method196("Candle Shop", false);

    @OriginalMember(owner = "mapview!s", name = "e", descriptor = "I")
    public static int field483;

    @OriginalMember(owner = "mapview!s", name = "a", descriptor = "J")
    private long field479;

    @OriginalMember(owner = "mapview!s", name = "g", descriptor = "Lfa;")
    private class10 field485;

    @OriginalMember(owner = "mapview!s", name = "a", descriptor = "(BLoa;Lia;Lia;)[Lv;", line = 7)
    public static final class40[] method231(byte arg0, class27 arg1, class15 arg2, class15 arg3) {
        int var4 = arg1.method187(arg3, (byte) 104);
        if (arg0 != 78) {
            field482 = null;
        }
        int var5 = arg1.method191(var4, arg2, 1);
        return class3.method19(122, var4, arg1, var5);
    }

    @OriginalMember(owner = "mapview!s", name = "a", descriptor = "(IIB)B", line = 21)
    public static final byte method232(int arg0, int arg1, byte arg2) {
        if (arg2 > -38) {
            method238(-38);
        }
        int var3 = arg1 >> 6;
        int var4 = arg0 >> 6;
        if (class19.field222[var3][var4] == null) {
            return 0;
        } else if (class19.field222[var3][var4].field57 == null) {
            return class19.field222[var3][var4].field51;
        } else {
            return class19.field222[var3][var4].field57[(arg1 & 0xFC0) + arg0 & 0x3F];
        }
    }

    @OriginalMember(owner = "mapview!s", name = "a", descriptor = "(B)V", line = 42)
    public static void method233(byte arg0) {
        if (arg0 != -47) {
            method233((byte) 31);
        }
        field486 = null;
        field484 = null;
        field482 = null;
    }

    @OriginalMember(owner = "mapview!s", name = "a", descriptor = "(JLfa;I)V", line = 73)
    public final void method234(long arg0, class10 arg1, int arg2) {
        if (arg1.field87 != null) {
            arg1.method53(190);
        }
        class10 var5 = this.field487[(int) (arg0 & (long) (this.field481 - arg2))];
        arg1.field88 = var5;
        arg1.field86 = arg0;
        arg1.field87 = var5.field87;
        arg1.field87.field88 = arg1;
        arg1.field88.field87 = arg1;
    }

    @OriginalMember(owner = "mapview!s", name = "a", descriptor = "(I)Lfa;", line = 89)
    public final class10 method235(int arg0) {
        if (this.field485 == null) {
            return null;
        }
        if (arg0 != 1) {
            field486 = null;
        }
        class10 var2 = this.field487[(int) (this.field479 & (long) (this.field481 - 1))];
        while (this.field485 != var2) {
            if (this.field485.field86 == this.field479) {
                class10 var3 = this.field485;
                this.field485 = this.field485.field88;
                return var3;
            }
            this.field485 = this.field485.field88;
        }
        this.field485 = null;
        return null;
    }

    @OriginalMember(owner = "mapview!s", name = "a", descriptor = "(JI)Lfa;", line = 124)
    public final class10 method236(long arg0, int arg1) {
        int var4 = 29 % ((arg1 + 54) / 41);
        this.field479 = arg0;
        class10 var5 = this.field487[(int) (arg0 & (long) (this.field481 - 1))];
        for (this.field485 = var5.field88; this.field485 != var5; this.field485 = this.field485.field88) {
            if (this.field485.field86 == arg0) {
                class10 var6 = this.field485;
                this.field485 = this.field485.field88;
                return var6;
            }
        }
        this.field485 = null;
        return null;
    }

    @OriginalMember(owner = "mapview!s", name = "a", descriptor = "(Lia;Loa;Lia;Z)[Lda;", line = 173)
    public static final class7[] method237(class15 arg0, class27 arg1, class15 arg2, boolean arg3) {
        int var4 = arg1.method187(arg0, (byte) 104);
        int var5 = arg1.method191(var4, arg2, 1);
        if (!arg3) {
            field484 = null;
        }
        return class13.method83(26662, var5, var4, arg1);
    }

    @OriginalMember(owner = "mapview!s", name = "<init>", descriptor = "(I)V", line = 187)
    public class34(int arg0) {
        this.field487 = new class10[arg0];
        this.field481 = arg0;
        for (int var2 = 0; var2 < arg0; var2++) {
            class10 var3 = this.field487[var2] = new class10();
            var3.field88 = var3;
            var3.field87 = var3;
        }
    }

    @OriginalMember(owner = "mapview!s", name = "b", descriptor = "(I)[Lia;", line = 219)
    public static final class15[] method238(int arg0) {
        int var1 = 23 / ((arg0 + 21) / 63);
        class15[] var10000 = new class15[] { class25.field355, class27.field375, class2.field9, class15.field141, class2.field10, class4.field34, class15.field147, class13.field108, class17.field163, class17.field169, class17.field179, class27.field394, class10.field82, class15.field146, class29.field406, class29.field418, class13.field110, class3.field24, class36.field502, class2.field12, field484, class27.field390, class17.field168, class36.field496, field482, class31.field432, class17.field167, class17.field170, class21.field240, class9.field77, class2.field11, class2.field22, class39.field511, class13.field117, class27.field382, class2.field7, class27.field388, class4.field42, class2.field21, class4.field35, class6.field48, class5.field46, class29.field414, mapview.field276, class2.field15, class35.field492, field486, class1.field3, class18.field185, class17.field165, class35.field488, class30.field423, class6.field50, class10.field80, class11.field98, class13.field119, class26.field368, class25.field363, class25.field356, class21.field244, class39.field508, class9.field76, class15.field145, class35.field491, class15.field145, class2.field19, class15.field145, class10.field90, class15.field151, class15.field145, class19.field205, class10.field83, class15.field145, class26.field366, class13.field118, class15.field145, class15.field145 };
        if (class12.field106) {
        }
        return var10000;
    }
}
