import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!c")
public class class306 {

    @OriginalMember(owner = "client!c", name = "i", descriptor = "Z")
    public boolean field4799 = false;

    @OriginalMember(owner = "client!c", name = "x", descriptor = "[F")
    public float[] field4814 = new float[4];

    @OriginalMember(owner = "client!c", name = "C", descriptor = "I")
    public int field4819;

    @OriginalMember(owner = "client!c", name = "e", descriptor = "Z")
    public boolean field4795;

    @OriginalMember(owner = "client!c", name = "E", descriptor = "Z")
    public boolean field4821;

    @OriginalMember(owner = "client!c", name = "z", descriptor = "I")
    public int field4816;

    @OriginalMember(owner = "client!c", name = "b", descriptor = "I")
    public int field4792;

    @OriginalMember(owner = "client!c", name = "t", descriptor = "I")
    public int field4810;

    @OriginalMember(owner = "client!c", name = "l", descriptor = "I")
    public int field4802;

    @OriginalMember(owner = "client!c", name = "o", descriptor = "[S")
    public short[] field4805;

    @OriginalMember(owner = "client!c", name = "v", descriptor = "I")
    public int field4812;

    @OriginalMember(owner = "client!c", name = "g", descriptor = "I")
    private int field4797;

    @OriginalMember(owner = "client!c", name = "s", descriptor = "I")
    public int field4809;

    @OriginalMember(owner = "client!c", name = "r", descriptor = "I")
    public static int field4808 = -1;

    @OriginalMember(owner = "client!c", name = "c", descriptor = "F")
    public float field4793;

    @OriginalMember(owner = "client!c", name = "p", descriptor = "F")
    public float field4806;

    @OriginalMember(owner = "client!c", name = "a", descriptor = "I")
    public static int field4791;

    @OriginalMember(owner = "client!c", name = "d", descriptor = "I")
    private int field4794;

    @OriginalMember(owner = "client!c", name = "f", descriptor = "I")
    public static int field4796;

    @OriginalMember(owner = "client!c", name = "h", descriptor = "I")
    public static int field4798;

    @OriginalMember(owner = "client!c", name = "j", descriptor = "I")
    private int field4800;

    @OriginalMember(owner = "client!c", name = "k", descriptor = "I")
    public static int field4801;

    @OriginalMember(owner = "client!c", name = "m", descriptor = "I")
    public static int field4803;

    @OriginalMember(owner = "client!c", name = "n", descriptor = "I")
    public static int field4804;

    @OriginalMember(owner = "client!c", name = "q", descriptor = "I")
    public static int field4807;

    @OriginalMember(owner = "client!c", name = "u", descriptor = "I")
    private int field4811;

    @OriginalMember(owner = "client!c", name = "w", descriptor = "I")
    public static int field4813;

    @OriginalMember(owner = "client!c", name = "y", descriptor = "I")
    public static int field4815;

    @OriginalMember(owner = "client!c", name = "A", descriptor = "I")
    private int field4817;

    @OriginalMember(owner = "client!c", name = "D", descriptor = "I")
    public static int field4820;

    @OriginalMember(owner = "client!c", name = "B", descriptor = "Lci;")
    public class201 field4818;

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(ZII)V", line = 10)
    public final void method2115(boolean arg0, int arg1, int arg2) {
        field4804++;
        int var4 = this.field4817 * arg1 / 50 + this.field4797 & 0x7FF;
        int var5 = this.field4794;
        int var6;
        if (var5 == 1) {
            var6 = (class174.field2731[var4] >> 6) + 1024;
        } else if (var5 == 3) {
            var6 = class143.field2253[var4] >> 1;
        } else if (var5 == 4) {
            var6 = var4 >> 10 << 11;
        } else if (var5 == 2) {
            var6 = var4;
        } else if (var5 == 5) {
            var6 = (var4 < 1024 ? var4 : 2048 - var4) << 1;
        } else {
            var6 = 2048;
        }
        if (arg2 != 22689) {
            this.field4792 = 85;
        }
        if (arg0) {
            var6 = 2048;
        }
        this.field4806 = (float) (this.field4811 + (this.field4800 * var6 >> 11)) / 2048.0F;
        float var7 = this.field4806 / 255.0F;
        this.field4814[1] = (float) (class280.method2001(this.field4812, 65402) >> 8) * var7;
        this.field4814[0] = (float) class280.method2001(this.field4812 >> 16, 255) * var7;
        this.field4814[2] = (float) class280.method2001(this.field4812, 255) * var7;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(ZI)V", line = 86)
    public static final void method2116(boolean arg0, int arg1) {
        class65.field1064 = arg0;
        class42.field751 = !class34.method248(-125);
        if (arg1 != -19689) {
            method2121(-19, false);
        }
        field4813++;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(IIIII)V", line = 98)
    public final void method2117(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < 92) {
            this.field4797 = 64;
        }
        field4803++;
        this.field4817 = arg2;
        this.field4800 = arg3;
        this.field4794 = arg1;
        this.field4811 = arg4;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(I)V", line = 113)
    private final void method2118(int arg0) {
        if (arg0 != 0) {
            this.field4792 = 63;
        }
        int var2 = (this.field4802 << 7) + 64;
        this.field4793 = 1.0F / (float) (var2 * var2);
        field4798++;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(Ljava/awt/Component;I)V", line = 135)
    public static final void method2119(Component arg0, int arg1) {
        arg0.removeMouseListener(class114.field1862);
        field4801++;
        if (arg1 != -9889) {
            field4808 = 82;
        }
        arg0.removeMouseMotionListener(class114.field1862);
        arg0.removeFocusListener(class114.field1862);
        class124.field1988 = 0;
    }

    @OriginalMember(owner = "client!c", name = "<init>", descriptor = "()V", line = 389)
    protected class306() {
        if (class143.field2253 == null) {
            class318.method2183(86);
        }
        this.method2120(false);
    }

    @OriginalMember(owner = "client!c", name = "<init>", descriptor = "(Lpe;)V", line = 412)
    public class306(class101 arg0) {
        if (class143.field2253 == null) {
            class318.method2183(73);
        }
        this.field4819 = arg0.method741(41);
        this.field4795 = (this.field4819 & 0x8) != 0;
        this.field4821 = (this.field4819 & 0x10) != 0;
        this.field4819 &= 0x7;
        this.field4816 = arg0.method731(false);
        this.field4792 = arg0.method731(false);
        this.field4810 = arg0.method731(false);
        this.field4802 = arg0.method741(19);
        this.method2118(0);
        this.field4805 = new short[this.field4802 * 2 + 1];
        for (int var2 = 0; var2 < this.field4805.length; var2++) {
            this.field4805[var2] = (short) arg0.method731(false);
        }
        this.field4812 = class174.field2740[arg0.method731(false)];
        int var3 = arg0.method741(13);
        this.field4797 = (var3 & 0xE0) << 3;
        this.field4809 = var3 & 0x1F;
        if (this.field4809 != 31) {
            this.method2120(false);
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(Z)V", line = 156)
    private final void method2120(boolean arg0) {
        if (arg0) {
            this.method2118(-86);
        }
        field4815++;
        int var2 = this.field4809;
        if (var2 == 2) {
            this.field4800 = 2048;
            this.field4817 = 2048;
            this.field4811 = 0;
            this.field4794 = 1;
        } else if (var2 == 3) {
            this.field4817 = 4096;
            this.field4794 = 1;
            this.field4811 = 0;
            this.field4800 = 2048;
        } else if (var2 == 4) {
            this.field4800 = 2048;
            this.field4811 = 0;
            this.field4794 = 4;
            this.field4817 = 2048;
        } else if (var2 == 5) {
            this.field4811 = 0;
            this.field4794 = 4;
            this.field4800 = 2048;
            this.field4817 = 8192;
        } else if (var2 == 12) {
            this.field4817 = 2048;
            this.field4794 = 2;
            this.field4811 = 0;
            this.field4800 = 2048;
        } else if (var2 == 13) {
            this.field4800 = 2048;
            this.field4794 = 2;
            this.field4817 = 8192;
            this.field4811 = 0;
        } else if (var2 == 10) {
            this.field4811 = 1536;
            this.field4800 = 512;
            this.field4794 = 3;
            this.field4817 = 2048;
        } else if (var2 == 11) {
            this.field4811 = 1536;
            this.field4800 = 512;
            this.field4794 = 3;
            this.field4817 = 4096;
        } else if (var2 == 6) {
            this.field4817 = 2048;
            this.field4794 = 3;
            this.field4800 = 768;
            this.field4811 = 1280;
        } else if (var2 == 7) {
            this.field4800 = 768;
            this.field4811 = 1280;
            this.field4794 = 3;
            this.field4817 = 4096;
        } else if (var2 == 8) {
            this.field4800 = 1024;
            this.field4817 = 2048;
            this.field4794 = 3;
            this.field4811 = 1024;
        } else if (var2 == 9) {
            this.field4800 = 1024;
            this.field4794 = 3;
            this.field4817 = 4096;
            this.field4811 = 1024;
        } else if (var2 == 14) {
            this.field4794 = 1;
            this.field4817 = 2048;
            this.field4800 = 768;
            this.field4811 = 1280;
        } else if (var2 == 15) {
            this.field4811 = 1536;
            this.field4800 = 512;
            this.field4817 = 4096;
            this.field4794 = 1;
        } else if (var2 == 16) {
            this.field4800 = 256;
            this.field4794 = 1;
            this.field4817 = 8192;
            this.field4811 = 1792;
        } else {
            this.field4817 = 2048;
            this.field4794 = 0;
            this.field4800 = 2048;
            this.field4811 = 0;
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(IZ)Z", line = 372)
    public static final boolean method2121(int arg0, boolean arg1) {
        field4791++;
        if (arg0 >= 0 && class145.field2268.length > arg0) {
            if (arg1) {
                method2122(-92);
            }
            return class145.field2268[arg0];
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!c", name = "b", descriptor = "(I)V", line = 401)
    public static final void method2122(int arg0) {
        field4796++;
        class13.field247.method837(true);
        class162.field2545.method1613(-14142);
        if (arg0 != 0) {
            method2119((Component) null, 118);
        }
        class60.field941.method1613(-14142);
    }
}
