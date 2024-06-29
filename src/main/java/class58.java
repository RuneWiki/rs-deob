import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ri")
public class class58 extends class161 {

    @OriginalMember(owner = "client!ri", name = "m", descriptor = "I")
    public int field729 = 0;

    @OriginalMember(owner = "client!ri", name = "s", descriptor = "I")
    public static int field735 = 0;

    @OriginalMember(owner = "client!ri", name = "D", descriptor = "Lbn;")
    public static class256 field746 = new class256(128);

    @OriginalMember(owner = "client!ri", name = "G", descriptor = "Ljava/lang/String;")
    public static String field749 = "M";

    @OriginalMember(owner = "client!ri", name = "J", descriptor = "Lbd;")
    public static class37 field752 = new class37();

    @OriginalMember(owner = "client!ri", name = "P", descriptor = "Ler;")
    public static class54 field758 = new class54();

    @OriginalMember(owner = "client!ri", name = "n", descriptor = "I")
    public int field730;

    @OriginalMember(owner = "client!ri", name = "o", descriptor = "I")
    public static int field731;

    @OriginalMember(owner = "client!ri", name = "p", descriptor = "I")
    public int field732;

    @OriginalMember(owner = "client!ri", name = "q", descriptor = "I")
    public int field733;

    @OriginalMember(owner = "client!ri", name = "r", descriptor = "I")
    public static int field734;

    @OriginalMember(owner = "client!ri", name = "u", descriptor = "I")
    public int field737;

    @OriginalMember(owner = "client!ri", name = "v", descriptor = "I")
    public int field738;

    @OriginalMember(owner = "client!ri", name = "w", descriptor = "I")
    public static int field739;

    @OriginalMember(owner = "client!ri", name = "x", descriptor = "I")
    public int field740;

    @OriginalMember(owner = "client!ri", name = "y", descriptor = "I")
    public int field741;

    @OriginalMember(owner = "client!ri", name = "A", descriptor = "I")
    public int field743;

    @OriginalMember(owner = "client!ri", name = "B", descriptor = "I")
    public static int field744;

    @OriginalMember(owner = "client!ri", name = "C", descriptor = "I")
    public static int field745;

    @OriginalMember(owner = "client!ri", name = "F", descriptor = "I")
    public static int field748;

    @OriginalMember(owner = "client!ri", name = "H", descriptor = "I")
    public int field750;

    @OriginalMember(owner = "client!ri", name = "L", descriptor = "I")
    public static int field754;

    @OriginalMember(owner = "client!ri", name = "M", descriptor = "I")
    public int field755;

    @OriginalMember(owner = "client!ri", name = "N", descriptor = "I")
    public int field756;

    @OriginalMember(owner = "client!ri", name = "z", descriptor = "Lfa;")
    public class127 field742;

    @OriginalMember(owner = "client!ri", name = "l", descriptor = "Lrr;")
    public class202 field728;

    @OriginalMember(owner = "client!ri", name = "K", descriptor = "Lrr;")
    public class202 field753;

    @OriginalMember(owner = "client!ri", name = "E", descriptor = "Ltm;")
    public class219 field747;

    @OriginalMember(owner = "client!ri", name = "O", descriptor = "Lsd;")
    public class50 field757;

    @OriginalMember(owner = "client!ri", name = "I", descriptor = "Z")
    public boolean field751;

    @OriginalMember(owner = "client!ri", name = "t", descriptor = "[I")
    public int[] field736;

    @OriginalMember(owner = "client!ri", name = "d", descriptor = "(I)V", line = 10)
    public static void method380(int arg0) {
        field752 = null;
        if (arg0 != -1) {
            field735 = -73;
        }
        field749 = null;
        field746 = null;
        field758 = null;
    }

    @OriginalMember(owner = "client!ri", name = "e", descriptor = "(I)V", line = 33)
    public static final void method381(int arg0) {
        if (arg0 > -99) {
            field746 = null;
        }
        class369.field5611.method335((byte) -99);
        field754++;
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(II)V", line = 52)
    public static final void method382(int arg0, int arg1) {
        field731++;
        if (arg1 != 2) {
            method382(0, 39);
        }
        class417.field6164 = arg0;
        class52 var2 = class287.field4601;
        synchronized (class287.field4601) {
            class287.field4601.method335((byte) 89);
        }
    }

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "(B)V", line = 72)
    public static final void method383(byte arg0) {
        if (arg0 >= -120) {
            method384(-114, -105, -1, -69, 88, 85, 25, 26);
        }
        class126.field1937.method1764(92);
        field739++;
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(IIIIIIII)V", line = 94)
    public static final void method384(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field745++;
        class196.method1373(0, (byte) -127, arg3, arg7, arg4, arg2, arg5, arg1, arg0);
        int var8 = 48 % ((66 - arg6) / 55);
    }

    @OriginalMember(owner = "client!ri", name = "f", descriptor = "(I)V", line = 107)
    public final void method385(int arg0) {
        field748++;
        int var2 = this.field741;
        if (this.field742 != null) {
            class127 var5 = this.field742.method948((byte) -77);
            if (var5 == null) {
                this.field733 = 0;
                this.field741 = -1;
                this.field743 = 0;
                this.field750 = 0;
                this.field736 = null;
                this.field738 = 0;
            } else {
                this.field736 = var5.field1965;
                this.field750 = var5.field1949 * 128;
                this.field741 = var5.field2019;
                this.field743 = var5.field1953;
                this.field733 = var5.field1946;
                this.field738 = var5.field2023;
            }
        } else if (this.field757 != null) {
            int var3 = class275.method1854(this.field757, (byte) 124);
            if (var2 != var3) {
                this.field741 = var3;
                class226 var4 = this.field757.field615;
                if (var4.field3771 != null) {
                    var4 = var4.method1619(-67);
                }
                if (var4 == null) {
                    this.field743 = this.field750 = 0;
                } else {
                    this.field750 = var4.field3752 * 128;
                    this.field743 = var4.field3756;
                }
            }
        } else if (this.field747 != null) {
            this.field741 = class35.method226(this.field747, 122);
            this.field750 = this.field747.field3620 * 128;
            this.field743 = this.field747.field3610;
        }
        if (this.field741 != var2 && this.field753 != null) {
            class82.field1025.method2479(this.field753);
            this.field753 = null;
        }
        if (arg0 < 4) {
            method384(-106, -26, 107, -35, -85, -112, -47, 66);
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(IBII)I", line = 190)
    public static final int method386(int arg0, byte arg1, int arg2, int arg3) {
        field734++;
        if (class275.field4396 == null) {
            return 0;
        }
        if (arg1 > -87) {
            field735 = 116;
        }
        int var4 = arg2 >> 7;
        int var5 = arg3 >> 7;
        if (var4 < 0 || var5 < 0 || (class80.field1003 - 1) < var4 || var5 > class380.field5751 - 1) {
            return 0;
        }
        int var6 = arg0;
        if (arg0 < 3 && (class31.field382[1][var4][var5] & 0x2) != 0) {
            var6 = arg0 + 1;
        }
        return class275.field4396[var6].method771(arg2, arg3);
    }
}
