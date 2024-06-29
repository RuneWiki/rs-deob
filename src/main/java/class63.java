import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vd")
public class class63 extends class216 {

    @OriginalMember(owner = "client!vd", name = "H", descriptor = "Lbd;")
    public static class162 field973 = class17.method142(0, "Fallen lassen");

    @OriginalMember(owner = "client!vd", name = "T", descriptor = "I")
    public static int field984 = 0;

    @OriginalMember(owner = "client!vd", name = "S", descriptor = "Lbd;")
    public static class162 field983 = class17.method142(0, "Ihre Ignorieren)2Liste ist voll)1 Sie k-Onnen nur 100 Spieler darauf eintragen)3");

    @OriginalMember(owner = "client!vd", name = "J", descriptor = "Lk;")
    public static class47 field975 = new class47(5000);

    @OriginalMember(owner = "client!vd", name = "ab", descriptor = "[Z")
    public static boolean[] field991 = new boolean[112];

    @OriginalMember(owner = "client!vd", name = "X", descriptor = "I")
    public static int field988 = 0;

    @OriginalMember(owner = "client!vd", name = "E", descriptor = "I")
    public static int field970;

    @OriginalMember(owner = "client!vd", name = "F", descriptor = "I")
    public int field971;

    @OriginalMember(owner = "client!vd", name = "G", descriptor = "I")
    public static int field972;

    @OriginalMember(owner = "client!vd", name = "I", descriptor = "I")
    public static int field974;

    @OriginalMember(owner = "client!vd", name = "K", descriptor = "I")
    public int field976;

    @OriginalMember(owner = "client!vd", name = "L", descriptor = "I")
    public static int field977;

    @OriginalMember(owner = "client!vd", name = "N", descriptor = "I")
    public static int field979;

    @OriginalMember(owner = "client!vd", name = "O", descriptor = "I")
    public int field980;

    @OriginalMember(owner = "client!vd", name = "P", descriptor = "I")
    public static int field981;

    @OriginalMember(owner = "client!vd", name = "Q", descriptor = "I")
    public static int field982;

    @OriginalMember(owner = "client!vd", name = "U", descriptor = "I")
    public static int field985;

    @OriginalMember(owner = "client!vd", name = "V", descriptor = "I")
    public static int field986;

    @OriginalMember(owner = "client!vd", name = "M", descriptor = "Lda;")
    public static class143 field978;

    @OriginalMember(owner = "client!vd", name = "W", descriptor = "Lbd;")
    public class162 field987;

    @OriginalMember(owner = "client!vd", name = "Z", descriptor = "Loc;")
    public static class267 field990;

    @OriginalMember(owner = "client!vd", name = "Y", descriptor = "[Lud;")
    public static class79[] field989;

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(IILbd;ILbd;Lbd;)V", line = 14)
    public static final void method426(int arg0, int arg1, class162 arg2, int arg3, class162 arg4, class162 arg5) {
        field972++;
        for (int var6 = 99; var6 > 0; var6--) {
            class295.field4943[var6] = class295.field4943[var6 - 1];
            class275.field4574[var6] = class275.field4574[var6 - 1];
            class285.field4812[var6] = class285.field4812[var6 - 1];
            class207.field3498[var6] = class207.field3498[var6 - 1];
            class229.field3817[var6] = class229.field3817[var6 - 1];
        }
        class25.field412++;
        class295.field4943[0] = arg0;
        class229.field3817[0] = arg1;
        if (arg3 == -1) {
            class128.field2316 = class284.field4808;
            class275.field4574[0] = arg2;
            class285.field4812[0] = arg5;
            class207.field3498[0] = arg4;
        }
    }

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "(I)V", line = 47)
    public final void method427(int arg0) {
        this.field3604 = Long.MIN_VALUE & this.field3604 | class300.method2048((byte) 18) + 500L;
        if (arg0 == -22507) {
            class57.field890.method379(this, 255);
            field977++;
        }
    }

    @OriginalMember(owner = "client!vd", name = "c", descriptor = "(Z)J", line = 66)
    public final long method428(boolean arg0) {
        field974++;
        return arg0 ? this.field3604 & Long.MAX_VALUE : -37L;
    }

    @OriginalMember(owner = "client!vd", name = "d", descriptor = "(B)I", line = 82)
    public final int method429(byte arg0) {
        if (arg0 != -16) {
            this.method430(true);
        }
        field985++;
        return (int) (this.field2701 >>> 32 & 0xFFL);
    }

    @OriginalMember(owner = "client!vd", name = "d", descriptor = "(Z)V", line = 93)
    public final void method430(boolean arg0) {
        field986++;
        if (!arg0) {
            this.field3604 |= Long.MIN_VALUE;
            if (this.method428(true) == 0L) {
                class263.field4387.method379(this, 255);
            }
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(IIII)V", line = 109)
    public static final void method431(int arg0, int arg1, int arg2, int arg3) {
        class225 var4 = class288.field4856[arg0][arg1][arg2];
        if (var4 == null) {
            return;
        }
        class138 var5 = var4.field3775;
        if (var5 != null) {
            var5.field2471 = var5.field2471 * arg3 / 16;
            var5.field2472 = var5.field2472 * arg3 / 16;
        }
    }

    @OriginalMember(owner = "client!vd", name = "e", descriptor = "(Z)V", line = 133)
    public static void method432(boolean arg0) {
        field975 = null;
        field983 = null;
        field990 = null;
        field973 = null;
        if (!arg0) {
            field991 = (boolean[]) null;
        }
        field989 = null;
        field978 = null;
        field991 = null;
    }

    @OriginalMember(owner = "client!vd", name = "c", descriptor = "(I)V", line = 149)
    public static final void method433(int arg0) {
        field982++;
        if (arg0 != 0) {
            method431(-61, 76, -41, -77);
        }
        class288.field4850.method1533(true);
    }

    @OriginalMember(owner = "client!vd", name = "e", descriptor = "(B)I", line = 160)
    public final int method434(byte arg0) {
        if (arg0 < 106) {
            this.field987 = (class162) null;
        }
        field981++;
        return (int) this.field2701;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(IZ)Z", line = 176)
    public static final boolean method435(int arg0, boolean arg1) {
        field979++;
        if (arg1) {
            field978 = (class143) null;
        }
        return arg0 == 198 || arg0 == 230 || arg0 == 156 || arg0 == 140 || arg0 == 223;
    }

    @OriginalMember(owner = "client!vd", name = "<init>", descriptor = "(II)V", line = 186)
    public class63(int arg0, int arg1) {
        this.field2701 = (long) arg1 | (long) arg0 << 32;
    }
}
