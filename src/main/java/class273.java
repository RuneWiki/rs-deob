import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hl")
public class class273 {

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "I")
    public int field4006 = -1;

    @OriginalMember(owner = "client!hl", name = "n", descriptor = "I")
    public int field4019 = -1;

    @OriginalMember(owner = "client!hl", name = "h", descriptor = "[I")
    public static int[] field4013 = new int[13];

    @OriginalMember(owner = "client!hl", name = "g", descriptor = "Z")
    public static boolean field4012 = false;

    @OriginalMember(owner = "client!hl", name = "c", descriptor = "I")
    public static int field4008;

    @OriginalMember(owner = "client!hl", name = "e", descriptor = "I")
    public static int field4010;

    @OriginalMember(owner = "client!hl", name = "i", descriptor = "I")
    public static int field4014;

    @OriginalMember(owner = "client!hl", name = "k", descriptor = "I")
    public static int field4016;

    @OriginalMember(owner = "client!hl", name = "m", descriptor = "I")
    public static int field4018;

    @OriginalMember(owner = "client!hl", name = "o", descriptor = "I")
    public static int field4020;

    @OriginalMember(owner = "client!hl", name = "p", descriptor = "I")
    public static int field4021;

    @OriginalMember(owner = "client!hl", name = "b", descriptor = "Lir;")
    public static class185 field4007;

    @OriginalMember(owner = "client!hl", name = "d", descriptor = "Lsj;")
    public static class248 field4009;

    @OriginalMember(owner = "client!hl", name = "j", descriptor = "Z")
    public static boolean field4015;

    @OriginalMember(owner = "client!hl", name = "f", descriptor = "[I")
    public static int[] field4011;

    @OriginalMember(owner = "client!hl", name = "l", descriptor = "[I")
    public int[] field4017;

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(I)V", line = 6)
    public static void method1803(int arg0) {
        if (arg0 != 0) {
            method1808(false);
        }
        field4007 = null;
        field4009 = null;
        field4013 = null;
        field4011 = null;
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(III)V", line = 23)
    public static final void method1804(int arg0, int arg1, int arg2) {
        field4016++;
        class440 var3 = class186.method1241(arg0, 7, (byte) 56);
        if (arg2 > 123) {
            var3.method2756(-1369656528);
            var3.field6375 = arg1;
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(ILfb;I)V", line = 40)
    public final void method1805(int arg0, class341 arg1, int arg2) {
        if (arg0 != 22433) {
            return;
        }
        field4010++;
        while (true) {
            int var4 = arg1.method2233((byte) 104);
            if (var4 == 0) {
                return;
            }
            this.method1806(var4, arg2, arg1, (byte) -94);
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(IILfb;B)V", line = 62)
    private final void method1806(int arg0, int arg1, class341 arg2, byte arg3) {
        if (arg3 != -94) {
            return;
        }
        field4021++;
        if (arg0 == 1) {
            this.field4019 = arg2.method2239(-1076227960);
        } else if (arg0 == 2) {
            this.field4017 = new int[arg2.method2233((byte) 104)];
            for (int var5 = 0; var5 < this.field4017.length; var5++) {
                this.field4017[var5] = arg2.method2239(-1076227960);
            }
        } else if (arg0 == 3) {
            this.field4006 = arg2.method2233((byte) 104);
            return;
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(B)V", line = 105)
    public static final void method1807(byte arg0) {
        if (arg0 != -91) {
            field4007 = null;
        }
        class194.field2693.method366(-116);
        field4020++;
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(Z)V", line = 122)
    public static final void method1808(boolean arg0) {
        class381.field5570 = 0;
        class40.field620 = arg0;
        class370.field5465 = -1;
        class326.field4822 = 0;
        field4008++;
        class395.field5738 = 1;
        class305.field4567 = 0;
        class241.field3371 = -3;
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(ILqc;IBILqr;ILkg;)V", line = 138)
    public static final void method1809(int arg0, class163 arg1, int arg2, byte arg3, int arg4, class212 arg5, int arg6, class317 arg7) {
        field4018++;
        if (arg3 >= -70) {
            field4012 = false;
        }
        class144 var8 = new class144();
        var8.field1828 = arg4 * 128;
        var8.field1846 = arg0 * 128;
        var8.field1837 = arg6;
        if (arg5 != null) {
            var8.field1838 = arg5;
            int var9 = arg5.field2946;
            int var10 = arg5.field2970;
            if (arg2 == 1 || arg2 == 3) {
                var10 = arg5.field2946;
                var9 = arg5.field2970;
            }
            var8.field1845 = (arg4 + var9) * 128;
            var8.field1842 = arg5.field2971;
            var8.field1843 = arg5.field2955 * 128;
            var8.field1823 = (arg0 + var10) * 128;
            var8.field1833 = arg5.field2948;
            var8.field1825 = arg5.field2914;
            var8.field1826 = arg5.field2920;
            var8.field1832 = arg5.field2961;
            if (arg5.field2944 != null) {
                var8.field1821 = true;
                var8.method994(4860);
            }
            if (var8.field1833 != null) {
                var8.field1839 = (int) ((double) (var8.field1842 - var8.field1832) * Math.random()) + var8.field1832;
            }
            class436.field6330.method1560(-107, var8);
        } else if (arg1 != null) {
            var8.field1820 = arg1;
            class189 var11 = arg1.field2206;
            if (var11.field2575 != null) {
                var8.field1821 = true;
                var11 = var11.method1253(-1);
            }
            if (var11 != null) {
                var8.field1845 = (var11.field2590 + arg4) * 128;
                var8.field1823 = (arg0 + var11.field2590) * 128;
                var8.field1825 = class7.method37(arg1, 115);
                var8.field1843 = var11.field2641 * 128;
                var8.field1826 = var11.field2577;
            }
            class107.field1413.method1560(-122, var8);
        } else if (arg7 != null) {
            var8.field1830 = arg7;
            var8.field1845 = (arg4 + arg7.method1091((byte) -117)) * 128;
            var8.field1823 = (arg7.method1091((byte) -85) + arg0) * 128;
            var8.field1825 = class248.method1616(arg7, (byte) -126);
            var8.field1826 = arg7.field4672;
            var8.field1843 = arg7.field4660 * 128;
            class36.field553.method2815(-1, (long) arg7.field2183, var8);
            return;
        }
    }
}
