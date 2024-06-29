import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jp")
public class class374 {

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "Z")
    public boolean field5155 = true;

    @OriginalMember(owner = "client!jp", name = "f", descriptor = "I")
    public int field5160 = 1190717;

    @OriginalMember(owner = "client!jp", name = "c", descriptor = "I")
    public int field5157 = 127;

    @OriginalMember(owner = "client!jp", name = "g", descriptor = "I")
    public int field5161 = 512;

    @OriginalMember(owner = "client!jp", name = "d", descriptor = "I")
    public int field5158 = 0;

    @OriginalMember(owner = "client!jp", name = "j", descriptor = "I")
    public int field5164 = -1;

    @OriginalMember(owner = "client!jp", name = "m", descriptor = "I")
    public int field5167 = -1;

    @OriginalMember(owner = "client!jp", name = "r", descriptor = "Z")
    public boolean field5172 = true;

    @OriginalMember(owner = "client!jp", name = "l", descriptor = "I")
    public int field5166 = 64;

    @OriginalMember(owner = "client!jp", name = "n", descriptor = "Z")
    public boolean field5168 = false;

    @OriginalMember(owner = "client!jp", name = "q", descriptor = "I")
    public int field5171 = 8;

    @OriginalMember(owner = "client!jp", name = "e", descriptor = "[I")
    public static int[] field5159 = new int[8];

    @OriginalMember(owner = "client!jp", name = "k", descriptor = "I")
    public static int field5165 = 0;

    @OriginalMember(owner = "client!jp", name = "b", descriptor = "I")
    public static int field5156;

    @OriginalMember(owner = "client!jp", name = "h", descriptor = "I")
    public int field5162;

    @OriginalMember(owner = "client!jp", name = "i", descriptor = "I")
    public static int field5163;

    @OriginalMember(owner = "client!jp", name = "o", descriptor = "I")
    public static int field5169;

    @OriginalMember(owner = "client!jp", name = "p", descriptor = "I")
    public static int field5170;

    @OriginalMember(owner = "client!jp", name = "t", descriptor = "I")
    public static int field5174;

    @OriginalMember(owner = "client!jp", name = "u", descriptor = "I")
    public static int field5175;

    @OriginalMember(owner = "client!jp", name = "s", descriptor = "Lufa;")
    public class708 field5173;

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(B)V", line = 8)
    public static void method2318(byte arg0) {
        field5159 = null;
        if (arg0 != 0) {
            field5159 = null;
        }
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(Lso;II)V", line = 20)
    private final void method2319(class494 arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            this.field5158 = class446.method2661(-18523, arg0.method2960((byte) 94));
        } else if (arg2 == 2) {
            this.field5164 = arg0.method2964((byte) 79);
        } else if (arg2 == 3) {
            this.field5164 = arg0.method2998(true);
            if (this.field5164 == 65535) {
                this.field5164 = -1;
            }
        } else if (arg2 == 5) {
            this.field5155 = false;
        } else if (arg2 == 7) {
            this.field5167 = class446.method2661(-18523, arg0.method2960((byte) 94));
        } else if (arg2 == 8) {
            this.field5173.field9853 = this.field5162;
        } else if (arg2 == 9) {
            this.field5161 = arg0.method2998(true) << 2;
        } else if (arg2 == 10) {
            this.field5172 = false;
        } else if (arg2 == 11) {
            this.field5171 = arg0.method2964((byte) 73);
        } else if (arg2 == 12) {
            this.field5168 = true;
        } else if (arg2 == 13) {
            this.field5160 = arg0.method2960((byte) 94);
        } else if (arg2 == 14) {
            this.field5166 = arg0.method2964((byte) 122) << 2;
        } else if (arg2 == 16) {
            this.field5157 = arg0.method2964((byte) 45);
        }
        field5169++;
        int var4 = 90 / ((arg1 + 73) / 41);
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(Lso;I)V", line = 97)
    public final void method2320(class494 arg0, int arg1) {
        if (arg1 != 1287) {
            this.field5172 = true;
        }
        while (true) {
            int var3 = arg0.method2964((byte) 58);
            if (var3 == 0) {
                field5174++;
                return;
            }
            this.method2319(arg0, -122, var3);
        }
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(I)V", line = 125)
    public final void method2321(int arg0) {
        this.field5171 = this.field5162 | this.field5171 << 8;
        if (arg0 < 0) {
            this.field5157 = 43;
        }
        field5170++;
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(Lef;B)I", line = 145)
    public static final int method2322(class512 arg0, byte arg1) {
        field5175++;
        if (arg1 > -26) {
            return 49;
        } else if (class776.field10666 == arg0) {
            return 7681;
        } else if (class463.field6532 == arg0) {
            return 8448;
        } else if (class116.field1782 == arg0) {
            return 34165;
        } else if (class624.field8745 == arg0) {
            return 260;
        } else if (class758.field10455 == arg0) {
            return 34023;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(BII)Z", line = 190)
    public static final boolean method2323(byte arg0, int arg1, int arg2) {
        if (arg0 < 63) {
            field5159 = null;
        }
        field5156++;
        return class282.method1825(arg2, arg1, 13) || class227.method1546(arg2, (byte) 108, arg1);
    }
}
