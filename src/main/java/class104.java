import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uh")
public class class104 {

    @OriginalMember(owner = "client!uh", name = "c", descriptor = "Lpf;")
    private class305 field1618 = new class305(256);

    @OriginalMember(owner = "client!uh", name = "m", descriptor = "Lpf;")
    private class305 field1628 = new class305(256);

    @OriginalMember(owner = "client!uh", name = "i", descriptor = "Lub;")
    private class92 field1624;

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "Lub;")
    private class92 field1616;

    @OriginalMember(owner = "client!uh", name = "h", descriptor = "Ljava/lang/String;")
    public static String field1623 = "Loaded title screen";

    @OriginalMember(owner = "client!uh", name = "o", descriptor = "[I")
    public static int[] field1630 = new int[64];

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "I")
    public static int field1617;

    @OriginalMember(owner = "client!uh", name = "d", descriptor = "I")
    public static int field1619;

    @OriginalMember(owner = "client!uh", name = "e", descriptor = "I")
    public static int field1620;

    @OriginalMember(owner = "client!uh", name = "k", descriptor = "I")
    public static int field1626;

    @OriginalMember(owner = "client!uh", name = "l", descriptor = "I")
    public static int field1627;

    @OriginalMember(owner = "client!uh", name = "n", descriptor = "I")
    public static int field1629;

    @OriginalMember(owner = "client!uh", name = "g", descriptor = "Lpg;")
    public static class78 field1622;

    @OriginalMember(owner = "client!uh", name = "j", descriptor = "Lub;")
    public static class92 field1625;

    @OriginalMember(owner = "client!uh", name = "p", descriptor = "Lub;")
    public static class92 field1631;

    @OriginalMember(owner = "client!uh", name = "f", descriptor = "[I")
    public static int[] field1621;

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(I[II)Ljd;")
    public final class90 method789(int arg0, int[] arg1, int arg2) {
        field1626++;
        if (arg0 != -26815) {
            return null;
        } else if (this.field1624.method704(0) == 1) {
            return this.method794(arg1, 0, (byte) 9, arg2);
        } else if (this.field1624.method700((byte) -111, arg2) == 1) {
            return this.method794(arg1, arg2, (byte) 9, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "([III)Ljd;")
    public final class90 method790(int[] arg0, int arg1, int arg2) {
        field1627++;
        if (this.field1616.method704(0) == 1) {
            return this.method792(0, arg0, arg2, (byte) -35);
        }
        if (arg1 < 34) {
            this.field1624 = null;
        }
        if (this.field1616.method700((byte) -127, arg2) != 1) {
            throw new RuntimeException();
        }
        return this.method792(arg2, arg0, 0, (byte) -35);
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(IIZILub;I)V")
    public static final void method791(int arg0, int arg1, boolean arg2, int arg3, class92 arg4, int arg5) {
        class105.field1640 = 1;
        class246.field3912 = arg1;
        class220.field3361 = arg4;
        class266.field4209 = 10000;
        int var6 = 5 % ((46 - arg3) / 47);
        class74.field1140 = arg0;
        class108.field1682 = arg2;
        class270.field4277 = arg5;
        field1629++;
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(I[IIB)Ljd;")
    private final class90 method792(int arg0, int[] arg1, int arg2, byte arg3) {
        field1617++;
        int var5 = ((arg0 & 0xF0000FFF) << 4 | arg0 >>> 12) ^ arg2;
        int var6 = var5 | arg0 << 16;
        long var7 = (long) var6;
        class90 var9 = (class90) this.field1628.method2043(var7, -1);
        if (var9 != null) {
            return var9;
        } else if (arg1 == null || arg1[0] > 0) {
            class71 var10 = class71.method567(this.field1616, arg0, arg2);
            if (var10 == null) {
                return null;
            }
            class90 var11 = var10.method565();
            this.field1628.method2046(var11, -93, var7);
            if (arg1 != null) {
                arg1[0] -= var11.field1413.length;
            }
            if (arg3 != -35) {
                method791(117, -80, false, 15, (class92) null, -12);
            }
            return var11;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(III)J")
    public static final long method793(int arg0, int arg1, int arg2) {
        class22 var3 = class149.field2210[arg0][arg1][arg2];
        if (var3 == null) {
            return 0L;
        }
        for (int var4 = 0; var4 < var3.field371; var4++) {
            class19 var5 = var3.field355[var4];
            if ((var5.field267 >> 29 & 0x3L) == 2L && var5.field255 == arg1 && var5.field258 == arg2) {
                return var5.field267;
            }
        }
        return 0L;
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "([IIBI)Ljd;")
    private final class90 method794(int[] arg0, int arg1, byte arg2, int arg3) {
        field1620++;
        int var5 = arg3 ^ (arg1 << 4 & 0xFFF8 | arg1 >>> 12);
        int var6 = var5 | arg1 << 16;
        long var7 = (long) var6 ^ 0x100000000L;
        class90 var9 = (class90) this.field1628.method2043(var7, -1);
        if (var9 != null) {
            return var9;
        } else if (arg0 == null || arg0[0] > 0) {
            class132 var10 = (class132) this.field1618.method2043(var7, arg2 - 10);
            if (var10 == null) {
                var10 = class132.method979(this.field1624, arg1, arg3);
                if (var10 == null) {
                    return null;
                }
                this.field1618.method2046(var10, arg2 - 83, var7);
            }
            class90 var11 = var10.method981(arg0);
            if (arg2 != 9) {
                this.method790((int[]) null, 75, -63);
            }
            if (var11 == null) {
                return null;
            } else {
                var10.method995((byte) -120);
                this.field1628.method2046(var11, -42, var7);
                return var11;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!uh", name = "<init>", descriptor = "(Lub;Lub;)V")
    public class104(class92 arg0, class92 arg1) {
        this.field1624 = arg1;
        this.field1616 = arg0;
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(Z)V")
    public static void method795(boolean arg0) {
        field1631 = null;
        field1622 = null;
        field1630 = null;
        field1623 = null;
        field1621 = null;
        field1625 = null;
        if (arg0) {
            field1625 = null;
        }
    }
}
