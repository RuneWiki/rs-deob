import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bt")
public class class496 {

    @OriginalMember(owner = "client!bt", name = "m", descriptor = "I")
    public int field7018 = 0;

    @OriginalMember(owner = "client!bt", name = "d", descriptor = "Z")
    private boolean field7009 = false;

    @OriginalMember(owner = "client!bt", name = "j", descriptor = "I")
    public int field7015 = 0;

    @OriginalMember(owner = "client!bt", name = "o", descriptor = "I")
    public static int field7020 = 1;

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "I")
    public int field7006;

    @OriginalMember(owner = "client!bt", name = "b", descriptor = "I")
    public int field7007;

    @OriginalMember(owner = "client!bt", name = "c", descriptor = "I")
    public int field7008;

    @OriginalMember(owner = "client!bt", name = "e", descriptor = "I")
    public int field7010;

    @OriginalMember(owner = "client!bt", name = "f", descriptor = "I")
    public static int field7011;

    @OriginalMember(owner = "client!bt", name = "g", descriptor = "I")
    private int field7012;

    @OriginalMember(owner = "client!bt", name = "h", descriptor = "I")
    public int field7013;

    @OriginalMember(owner = "client!bt", name = "i", descriptor = "I")
    public static int field7014;

    @OriginalMember(owner = "client!bt", name = "k", descriptor = "I")
    public static int field7016;

    @OriginalMember(owner = "client!bt", name = "n", descriptor = "I")
    public static int field7019;

    @OriginalMember(owner = "client!bt", name = "p", descriptor = "I")
    public int field7021;

    @OriginalMember(owner = "client!bt", name = "q", descriptor = "I")
    public int field7022;

    @OriginalMember(owner = "client!bt", name = "r", descriptor = "I")
    public static int field7023;

    @OriginalMember(owner = "client!bt", name = "s", descriptor = "I")
    public int field7024;

    @OriginalMember(owner = "client!bt", name = "t", descriptor = "I")
    public int field7025;

    @OriginalMember(owner = "client!bt", name = "u", descriptor = "I")
    public static int field7026;

    @OriginalMember(owner = "client!bt", name = "l", descriptor = "J")
    public long field7017;

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(B)Lca;")
    public static final class131 method2880(byte arg0) {
        field7023++;
        try {
            if (arg0 > -25) {
                method2880((byte) -23);
            }
            return (class131) Class.forName("hf").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(IILtn;)V")
    private final void method2881(int arg0, int arg1, class179 arg2) {
        if (arg0 == 1) {
            this.field7012 = arg2.method1107(false);
        } else if (arg0 == 2) {
            arg2.method1094(255);
        } else if (arg0 == 3) {
            this.field7021 = arg2.method1095((byte) 124);
            this.field7022 = arg2.method1095((byte) 120);
            this.field7024 = arg2.method1095((byte) 114);
        } else if (arg0 == 4) {
            this.field7010 = arg2.method1094(255);
            this.field7006 = arg2.method1095((byte) 122);
        } else if (arg0 == 6) {
            this.field7013 = arg2.method1094(255);
        } else if (arg0 == 8) {
            this.field7018 = 1;
        } else if (arg0 == 9) {
            this.field7015 = 1;
        } else if (arg0 == 10) {
            this.field7009 = true;
        }
        field7011++;
        int var4 = -95 / ((arg1 + 27) / 54);
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(Ltn;I)V")
    public final void method2882(class179 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method1094(arg1 + 255);
            if (var3 == 0) {
                if (arg1 != 0) {
                    this.method2884((byte) 77);
                }
                field7016++;
                return;
            }
            this.method2881(var3, arg1 + 92, arg0);
        }
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(BLew;)I")
    public static final int method2883(byte arg0, class240 arg1) {
        if (arg0 >= -54) {
            return 104;
        }
        field7014++;
        if (class240.field3088 == arg1) {
            return 5120;
        } else if (class240.field3091 == arg1) {
            return 5122;
        } else if (class240.field3092 == arg1) {
            return 5124;
        } else if (class240.field3093 == arg1) {
            return 5121;
        } else if (class240.field3094 == arg1) {
            return 5123;
        } else if (class240.field3095 == arg1) {
            return 5125;
        } else if (class240.field3096 == arg1) {
            return 5131;
        } else if (class240.field3097 == arg1) {
            return 5126;
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!bt", name = "b", descriptor = "(B)V")
    public final void method2884(byte arg0) {
        field7019++;
        this.field7007 = class138.field1645[this.field7012 << 3];
        long var2 = (long) this.field7021;
        if (arg0 != -33) {
            this.method2882(null, 39);
        }
        long var4 = (long) this.field7022;
        long var6 = (long) this.field7024;
        this.field7025 = (int) Math.sqrt((double) (var2 * var2 - (-(var4 * var4) - (var6 * var6))));
        if (this.field7006 == 0) {
            this.field7006 = 1;
        }
        if (this.field7010 == 0) {
            this.field7017 = 2147483647L;
        } else if (this.field7010 == 1) {
            this.field7017 = (this.field7025 * 8 / this.field7006);
            this.field7017 *= this.field7017;
        } else if (this.field7010 == 2) {
            this.field7017 = (this.field7025 * 8 / this.field7006);
        }
        if (this.field7009) {
            this.field7025 *= -1;
        }
    }
}
