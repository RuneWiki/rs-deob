import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public class class45 {

    @OriginalMember(owner = "client!bd", name = "m", descriptor = "Lhd;")
    private class214 field701 = new class214(256);

    @OriginalMember(owner = "client!bd", name = "s", descriptor = "Lhd;")
    private class214 field707 = new class214(256);

    @OriginalMember(owner = "client!bd", name = "h", descriptor = "Ljb;")
    private class11 field696;

    @OriginalMember(owner = "client!bd", name = "r", descriptor = "Ljb;")
    private class11 field706;

    @OriginalMember(owner = "client!bd", name = "f", descriptor = "I")
    public static int field694 = 0;

    @OriginalMember(owner = "client!bd", name = "g", descriptor = "I")
    public static int field695 = 0;

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "Lsc;")
    private static class181 field690 = class149.method967(255, "white:");

    @OriginalMember(owner = "client!bd", name = "j", descriptor = "Lsc;")
    public static class181 field698 = field690;

    @OriginalMember(owner = "client!bd", name = "c", descriptor = "Lsc;")
    public static class181 field691 = field690;

    @OriginalMember(owner = "client!bd", name = "o", descriptor = "Lsc;")
    public static class181 field703 = class149.method967(255, "compass");

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "I")
    public static int field689;

    @OriginalMember(owner = "client!bd", name = "e", descriptor = "I")
    public static int field693;

    @OriginalMember(owner = "client!bd", name = "i", descriptor = "I")
    public static int field697;

    @OriginalMember(owner = "client!bd", name = "k", descriptor = "I")
    public static int field699;

    @OriginalMember(owner = "client!bd", name = "l", descriptor = "I")
    public static int field700;

    @OriginalMember(owner = "client!bd", name = "n", descriptor = "I")
    public static int field702;

    @OriginalMember(owner = "client!bd", name = "p", descriptor = "I")
    public static int field704;

    @OriginalMember(owner = "client!bd", name = "q", descriptor = "I")
    public static int field705;

    @OriginalMember(owner = "client!bd", name = "d", descriptor = "Ldg;")
    public static class90 field692;

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(BIII)V")
    public static final void method302(byte arg0, int arg1, int arg2, int arg3) {
        field704++;
        if (class173.field2911 != 0 && arg3 != 0 && class258.field4512 < 50 && arg1 != -1) {
            class111.field1824[class258.field4512] = arg1;
            class132.field2185[class258.field4512] = arg3;
            class94.field1512[class258.field4512] = arg2;
            class192.field3378[class258.field4512] = null;
            class93.field1471[class258.field4512] = 0;
            class258.field4512++;
        }
        if (arg0 != 48) {
            method305((byte) -3);
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(Z)V")
    public static final void method303(boolean arg0) {
        if (arg0) {
            class31.field505 = class253.field4418;
            class221.field3820 = class155.field2572;
        } else {
            class31.field505 = class21.field379;
            class221.field3820 = class84.field1339;
        }
        class26.field455 = class221.field3820.length;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(II[II)Lee;")
    private final class150 method304(int arg0, int arg1, int[] arg2, int arg3) {
        field697++;
        int var5 = arg0 ^ (arg1 >>> 12 | (arg1 & 0xD0000FFF) << 4);
        int var6 = var5 | arg1 << 16;
        long var7 = (long) var6 ^ 0x100000000L;
        class150 var9 = (class150) this.field707.method1424(true, var7);
        if (var9 != null) {
            return var9;
        } else if (arg2 == null || arg2[0] > 0) {
            class205 var10 = (class205) this.field701.method1424(true, var7);
            if (var10 == null) {
                var10 = class205.method1365(this.field696, arg1, arg0);
                if (var10 == null) {
                    return null;
                }
                this.field701.method1422(var7, var10, -1);
            }
            class150 var11 = var10.method1363(arg2);
            if (var11 == null) {
                return null;
            }
            if (arg3 != 0) {
                field690 = null;
            }
            var10.method290((byte) -48);
            this.field707.method1422(var7, var11, arg3 - 1);
            return var11;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(B)V")
    public static void method305(byte arg0) {
        field698 = null;
        field703 = null;
        field691 = null;
        field690 = null;
        if (arg0 != -2) {
            method307((byte) -94);
        }
        field692 = null;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "([IZII)Lee;")
    private final class150 method306(int[] arg0, boolean arg1, int arg2, int arg3) {
        field689++;
        int var5 = ((arg2 & 0x70000FFF) << 4 | arg2 >>> 12) ^ arg3;
        int var6 = var5 | arg2 << 16;
        long var7 = (long) var6;
        class150 var9 = (class150) this.field707.method1424(arg1, var7);
        if (var9 != null) {
            return var9;
        } else if (arg0 == null || arg0[0] > 0) {
            class103 var10 = class103.method695(this.field706, arg2, arg3);
            if (var10 == null) {
                return null;
            }
            class150 var11 = var10.method692();
            this.field707.method1422(var7, var11, -1);
            if (arg0 != null) {
                arg0[0] -= var11.field2510.length;
            }
            return var11;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "(B)V")
    public static final void method307(byte arg0) {
        field705++;
        class210 var1 = class46.field726;
        synchronized (class46.field726) {
            class78.field1260++;
            class39.field599 = class41.field625;
            class79.field1279 = class59.field885;
            class183.field3215 = class89.field1413;
            class146.field2406 = class248.field4329;
            class235.field4093 = class62.field963;
            class93.field1478 = class185.field3292;
            if (arg0 <= 47) {
                method302((byte) -61, -13, 99, -50);
            }
            class200.field3456 = class243.field4225;
            class248.field4329 = 0;
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(Ljb;ZLeb;Ljb;)V")
    public static final void method308(class11 arg0, boolean arg1, class40 arg2, class11 arg3) {
        class180.field3142 = arg3;
        class201.field3467 = arg2;
        class123.field2016 = arg0;
        field700++;
        if (!arg1) {
            method303(true);
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(I[II)Lee;")
    public final class150 method309(int arg0, int[] arg1, int arg2) {
        field693++;
        if (this.field706.method95(-122) == 1) {
            return this.method306(arg1, true, 0, arg0);
        } else if (this.field706.method102(arg0, -23099) == 1) {
            return this.method306(arg1, true, arg0, 0);
        } else if (arg2 == 6467) {
            throw new RuntimeException();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(II[I)Lee;")
    public final class150 method310(int arg0, int arg1, int[] arg2) {
        field702++;
        if (this.field696.method95(-114) == 1) {
            return this.method304(arg1, 0, arg2, arg0 ^ 0xFFFFFFFE);
        } else if (~this.field696.method102(arg1, -23099) == arg0) {
            return this.method304(0, arg1, arg2, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!bd", name = "<init>", descriptor = "(Ljb;Ljb;)V")
    public class45(class11 arg0, class11 arg1) {
        this.field696 = arg1;
        this.field706 = arg0;
    }
}
