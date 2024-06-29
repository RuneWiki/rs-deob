import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public class class136 extends class165 {

    @OriginalMember(owner = "client!wb", name = "p", descriptor = "I")
    private int field2057;

    @OriginalMember(owner = "client!wb", name = "o", descriptor = "I")
    private int field2056;

    @OriginalMember(owner = "client!wb", name = "u", descriptor = "I")
    private int field2062;

    @OriginalMember(owner = "client!wb", name = "m", descriptor = "I")
    private int field2054;

    @OriginalMember(owner = "client!wb", name = "A", descriptor = "Lpu;")
    public static class179 field2068 = new class179("Prepared sound engine", "Musik-Engine vorbereitet.", "Moteur son préparé", "Mecanismo de som preparado");

    @OriginalMember(owner = "client!wb", name = "C", descriptor = "Ld;")
    public static class242 field2070 = new class242(4);

    @OriginalMember(owner = "client!wb", name = "E", descriptor = "[[Z")
    public static boolean[][] field2072 = new boolean[][] { new boolean[4], new boolean[4], { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, new boolean[4], new boolean[4], new boolean[4], new boolean[4] };

    @OriginalMember(owner = "client!wb", name = "D", descriptor = "Lpn;")
    public static class49 field2071 = new class49(58, 2);

    @OriginalMember(owner = "client!wb", name = "F", descriptor = "Ljp;")
    public static class55 field2073 = null;

    @OriginalMember(owner = "client!wb", name = "n", descriptor = "I")
    public static int field2055;

    @OriginalMember(owner = "client!wb", name = "q", descriptor = "I")
    public static int field2058;

    @OriginalMember(owner = "client!wb", name = "r", descriptor = "I")
    public static int field2059;

    @OriginalMember(owner = "client!wb", name = "s", descriptor = "I")
    private int field2060;

    @OriginalMember(owner = "client!wb", name = "v", descriptor = "I")
    private int field2063;

    @OriginalMember(owner = "client!wb", name = "w", descriptor = "I")
    private int field2064;

    @OriginalMember(owner = "client!wb", name = "x", descriptor = "I")
    public static int field2065;

    @OriginalMember(owner = "client!wb", name = "y", descriptor = "I")
    public static int field2066;

    @OriginalMember(owner = "client!wb", name = "z", descriptor = "I")
    public static int field2067;

    @OriginalMember(owner = "client!wb", name = "B", descriptor = "I")
    private int field2069;

    @OriginalMember(owner = "client!wb", name = "G", descriptor = "I")
    public static int field2074;

    @OriginalMember(owner = "client!wb", name = "t", descriptor = "[B")
    private byte[] field2061;

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(II)I")
    public static final int method995(int arg0, int arg1) {
        if (arg0 > -83) {
            method999(-96);
        }
        field2067++;
        return arg1 >>> 8;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(I)V")
    public final void method996(int arg0) {
        this.field2069 = 0;
        this.field2064 = 0;
        field2055++;
        if (arg0 != -7782) {
            method999(-97);
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(III)V")
    public final void method997(int arg0, int arg1, int arg2) {
        field2058++;
        if (arg0 != -10656) {
            return;
        }
        if (arg2 == 0) {
            this.field2063 = this.field2057 - (arg1 >= 0 ? arg1 : -arg1);
            this.field2060 = 4096;
            this.field2063 = this.field2063 * this.field2063 >> 12;
            this.field2064 = this.field2063;
            return;
        }
        this.field2060 = this.field2063 * this.field2056 >> 12;
        this.field2063 = this.field2057 - (arg1 >= 0 ? arg1 : -arg1);
        if (this.field2060 < 0) {
            this.field2060 = 0;
        } else if (this.field2060 > 4096) {
            this.field2060 = 4096;
        }
        this.field2063 = this.field2063 * this.field2063 >> 12;
        this.field2063 = this.field2063 * this.field2060 >> 12;
        this.field2064 += this.field2063 * this.field2054 >> 12;
        this.field2054 = this.field2062 * this.field2054 >> 12;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(BIB)V")
    public void method998(byte arg0, int arg1, byte arg2) {
        if (arg2 != 111) {
            this.method996(-117);
        }
        field2059++;
        this.field2061[arg1] = arg0;
    }

    @OriginalMember(owner = "client!wb", name = "c", descriptor = "(I)V")
    public static void method999(int arg0) {
        field2072 = null;
        field2071 = null;
        field2073 = null;
        field2068 = null;
        field2070 = null;
        if (arg0 != 255) {
            method1000(true, -43);
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(ZI)V")
    public static final void method1000(boolean arg0, int arg1) {
        field2065++;
        class457.field6794++;
        class110.method857(arg1 ^ 0xFFFFF000, class179.field2760);
        if (arg1 != -1) {
            return;
        }
        for (class295 var2 = (class295) class215.field3248.method359(true); var2 != null; var2 = (class295) class215.field3248.method365(-70)) {
            if (!var2.method949(1767)) {
                var2 = (class295) class215.field3248.method359(true);
                if (var2 == null) {
                    break;
                }
            }
            if (var2.field4542 == 0) {
                class336.method2188(true, arg1 ^ 0xFFFFFFFE, arg0, var2);
            }
        }
        if (class416.field6108 != null) {
            class5.method27(class416.field6108, arg1 ^ 0xC699538);
            class416.field6108 = null;
        }
    }

    @OriginalMember(owner = "client!wb", name = "<init>", descriptor = "(IIIIIFFF)V")
    public class136(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5, float arg6, float arg7) {
        super(arg0, arg1, arg2, arg3, arg4);
        this.field2057 = (int) (arg6 * 4096.0F);
        this.field2056 = (int) (arg7 * 4096.0F);
        this.field2054 = this.field2062 = (int) (Math.pow(0.5D, (double) (-arg5)) * 4096.0D);
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(Z)V")
    public final void method1001(boolean arg0) {
        if (arg0) {
            this.method998((byte) 10, -19, (byte) 83);
        }
        this.field2064 >>= 0x4;
        field2066++;
        this.field2054 = this.field2062;
        if (this.field2064 < 0) {
            this.field2064 = 0;
        } else if (this.field2064 > 255) {
            this.field2064 = 255;
        }
        this.method998((byte) this.field2064, this.field2069++, (byte) 111);
        this.field2064 = 0;
    }
}
