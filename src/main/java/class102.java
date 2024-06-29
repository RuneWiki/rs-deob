import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public class class102 {

    @OriginalMember(owner = "client!sa", name = "r", descriptor = "[F")
    public float[] field1732 = new float[4];

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "I")
    public int field1715;

    @OriginalMember(owner = "client!sa", name = "o", descriptor = "Z")
    public boolean field1729;

    @OriginalMember(owner = "client!sa", name = "m", descriptor = "Z")
    public boolean field1727;

    @OriginalMember(owner = "client!sa", name = "p", descriptor = "I")
    public int field1730;

    @OriginalMember(owner = "client!sa", name = "e", descriptor = "I")
    public int field1719;

    @OriginalMember(owner = "client!sa", name = "v", descriptor = "I")
    public int field1736;

    @OriginalMember(owner = "client!sa", name = "c", descriptor = "I")
    public int field1717;

    @OriginalMember(owner = "client!sa", name = "l", descriptor = "[S")
    public short[] field1726;

    @OriginalMember(owner = "client!sa", name = "f", descriptor = "I")
    public int field1720;

    @OriginalMember(owner = "client!sa", name = "s", descriptor = "I")
    private int field1733;

    @OriginalMember(owner = "client!sa", name = "h", descriptor = "I")
    private int field1722;

    @OriginalMember(owner = "client!sa", name = "q", descriptor = "I")
    public static int field1731 = 0;

    @OriginalMember(owner = "client!sa", name = "d", descriptor = "F")
    public float field1718;

    @OriginalMember(owner = "client!sa", name = "t", descriptor = "F")
    public float field1734;

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "I")
    public static int field1716;

    @OriginalMember(owner = "client!sa", name = "g", descriptor = "I")
    public static int field1721;

    @OriginalMember(owner = "client!sa", name = "i", descriptor = "I")
    private int field1723;

    @OriginalMember(owner = "client!sa", name = "j", descriptor = "I")
    public static int field1724;

    @OriginalMember(owner = "client!sa", name = "k", descriptor = "I")
    private int field1725;

    @OriginalMember(owner = "client!sa", name = "n", descriptor = "I")
    public static int field1728;

    @OriginalMember(owner = "client!sa", name = "u", descriptor = "I")
    public static int field1735;

    @OriginalMember(owner = "client!sa", name = "w", descriptor = "I")
    private int field1737;

    @OriginalMember(owner = "client!sa", name = "x", descriptor = "I")
    public static int field1738;

    @OriginalMember(owner = "client!sa", name = "z", descriptor = "I")
    private int field1740;

    @OriginalMember(owner = "client!sa", name = "y", descriptor = "Lbg;")
    public class192 field1739;

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(I)V", line = 9)
    private final void method797(int arg0) {
        field1724++;
        int var2 = (this.field1717 << 7) + 64;
        if (arg0 == 1) {
            this.field1734 = 1.0F / (float) (var2 * var2);
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(B)V", line = 24)
    private final void method798(byte arg0) {
        if (arg0 != 24) {
            this.field1719 = -101;
        }
        field1738++;
        int var2 = this.field1722;
        if (var2 == 2) {
            this.field1723 = 2048;
            this.field1725 = 0;
            this.field1740 = 1;
            this.field1737 = 2048;
        } else if (var2 == 3) {
            this.field1725 = 0;
            this.field1723 = 4096;
            this.field1737 = 2048;
            this.field1740 = 1;
        } else if (var2 == 4) {
            this.field1740 = 4;
            this.field1725 = 0;
            this.field1723 = 2048;
            this.field1737 = 2048;
        } else if (var2 == 5) {
            this.field1740 = 4;
            this.field1723 = 8192;
            this.field1725 = 0;
            this.field1737 = 2048;
        } else if (var2 == 12) {
            this.field1723 = 2048;
            this.field1737 = 2048;
            this.field1740 = 2;
            this.field1725 = 0;
        } else if (var2 == 13) {
            this.field1723 = 8192;
            this.field1740 = 2;
            this.field1737 = 2048;
            this.field1725 = 0;
        } else if (var2 == 10) {
            this.field1737 = 512;
            this.field1740 = 3;
            this.field1723 = 2048;
            this.field1725 = 1536;
        } else if (var2 == 11) {
            this.field1725 = 1536;
            this.field1737 = 512;
            this.field1723 = 4096;
            this.field1740 = 3;
        } else if (var2 == 6) {
            this.field1723 = 2048;
            this.field1737 = 768;
            this.field1725 = 1280;
            this.field1740 = 3;
        } else if (var2 == 7) {
            this.field1725 = 1280;
            this.field1723 = 4096;
            this.field1740 = 3;
            this.field1737 = 768;
        } else if (var2 == 8) {
            this.field1723 = 2048;
            this.field1737 = 1024;
            this.field1740 = 3;
            this.field1725 = 1024;
        } else if (var2 == 9) {
            this.field1725 = 1024;
            this.field1737 = 1024;
            this.field1740 = 3;
            this.field1723 = 4096;
        } else if (var2 == 14) {
            this.field1723 = 2048;
            this.field1740 = 1;
            this.field1737 = 768;
            this.field1725 = 1280;
        } else if (var2 == 15) {
            this.field1740 = 1;
            this.field1737 = 512;
            this.field1723 = 4096;
            this.field1725 = 1536;
        } else if (var2 == 16) {
            this.field1723 = 8192;
            this.field1737 = 256;
            this.field1740 = 1;
            this.field1725 = 1792;
        } else {
            this.field1725 = 0;
            this.field1723 = 2048;
            this.field1737 = 2048;
            this.field1740 = 0;
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(II)I", line = 231)
    public static int method799(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "(I)Z", line = 239)
    public static final boolean method800(int arg0) {
        field1728++;
        if (class13.field168 != 0) {
            try {
                class111.field1890.method662(0, class210.field3585.field2072);
                return true;
            } catch (Throwable var2) {
            }
        }
        return arg0 >= -55;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(BZI)V", line = 260)
    public final void method801(byte arg0, boolean arg1, int arg2) {
        field1735++;
        int var4 = this.field1723 * arg2 / 50 + this.field1733 & 0x7FF;
        int var5 = this.field1740;
        int var6;
        if (var5 == 1) {
            var6 = (class21.field288[var4] >> 6) + 1024;
        } else if (var5 == 3) {
            var6 = class212.field3610[var4] >> 1;
        } else if (var5 == 4) {
            var6 = var4 >> 10 << 11;
        } else if (var5 == 2) {
            var6 = var4;
        } else if (var5 == 5) {
            var6 = (var4 >= 1024 ? 2048 - var4 : var4) << 1;
        } else {
            var6 = 2048;
        }
        if (arg1) {
            var6 = 2048;
        }
        if (arg0 != 56) {
            return;
        }
        this.field1718 = (float) ((this.field1737 * var6 >> 11) + this.field1725) / 2048.0F;
        float var7 = this.field1718 / 255.0F;
        this.field1732[2] = (float) class235.method1710(this.field1720, 255) * var7;
        this.field1732[1] = (float) class235.method1710(this.field1720 >> 8, 255) * var7;
        this.field1732[0] = (float) class235.method1710(this.field1720 >> 16, 255) * var7;
    }

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "(B)V", line = 348)
    public static final void method802(byte arg0) {
        class211.field3603 = 0;
        if (arg0 >= -125) {
            method802((byte) -23);
        }
        field1716++;
        int var1 = (class279.field4831.field3259 >> 7) + class275.field4737;
        int var2 = (class279.field4831.field3218 >> 7) + class175.field2939;
        if (var1 >= 3053 && var1 <= 3156 && var2 >= 3056 && var2 <= 3136) {
            class211.field3603 = 1;
        }
        if (var1 >= 3072 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
            class211.field3603 = 1;
        }
        if (class211.field3603 == 1 && var1 >= 3139 && var1 <= 3199 && var2 >= 3008 && var2 <= 3062) {
            class211.field3603 = 0;
        }
    }

    @OriginalMember(owner = "client!sa", name = "<init>", descriptor = "()V", line = 386)
    protected class102() {
        if (class212.field3610 == null) {
            class127.method1014(3283);
        }
        this.method798((byte) 24);
    }

    @OriginalMember(owner = "client!sa", name = "<init>", descriptor = "(Lja;)V", line = 396)
    public class102(class60 arg0) {
        if (class212.field3610 == null) {
            class127.method1014(3283);
        }
        this.field1715 = arg0.method501(0);
        this.field1729 = (this.field1715 & 0x10) != 0;
        this.field1727 = (this.field1715 & 0x8) != 0;
        this.field1715 &= 0x7;
        this.field1730 = arg0.method485((byte) -2);
        this.field1719 = arg0.method485((byte) -2);
        this.field1736 = arg0.method485((byte) -2);
        this.field1717 = arg0.method501(0);
        this.method797(1);
        this.field1726 = new short[this.field1717 * 2 + 1];
        for (int var2 = 0; var2 < this.field1726.length; var2++) {
            this.field1726[var2] = (short) arg0.method485((byte) -2);
        }
        this.field1720 = class21.field290[arg0.method485((byte) -2)];
        int var3 = arg0.method501(0);
        this.field1733 = var3 & 0xE0 << 3;
        this.field1722 = var3 & 0x1F;
        this.method798((byte) 24);
    }
}
