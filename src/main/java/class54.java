import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vb")
public class class54 {

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "Z")
    public boolean field830 = false;

    @OriginalMember(owner = "client!vb", name = "x", descriptor = "[F")
    public float[] field852 = new float[4];

    @OriginalMember(owner = "client!vb", name = "i", descriptor = "I")
    public int field837;

    @OriginalMember(owner = "client!vb", name = "v", descriptor = "Z")
    public boolean field850;

    @OriginalMember(owner = "client!vb", name = "g", descriptor = "Z")
    public boolean field835;

    @OriginalMember(owner = "client!vb", name = "j", descriptor = "I")
    public int field838;

    @OriginalMember(owner = "client!vb", name = "t", descriptor = "I")
    public int field848;

    @OriginalMember(owner = "client!vb", name = "u", descriptor = "I")
    public int field849;

    @OriginalMember(owner = "client!vb", name = "z", descriptor = "I")
    public int field854;

    @OriginalMember(owner = "client!vb", name = "q", descriptor = "[S")
    public short[] field845;

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "I")
    public int field829;

    @OriginalMember(owner = "client!vb", name = "o", descriptor = "I")
    private int field843;

    @OriginalMember(owner = "client!vb", name = "e", descriptor = "I")
    public int field833;

    @OriginalMember(owner = "client!vb", name = "p", descriptor = "I")
    public static int field844 = 0;

    @OriginalMember(owner = "client!vb", name = "s", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field847 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

    @OriginalMember(owner = "client!vb", name = "n", descriptor = "F")
    public float field842;

    @OriginalMember(owner = "client!vb", name = "r", descriptor = "F")
    public static float field846;

    @OriginalMember(owner = "client!vb", name = "B", descriptor = "F")
    public float field856;

    @OriginalMember(owner = "client!vb", name = "c", descriptor = "I")
    private int field831;

    @OriginalMember(owner = "client!vb", name = "d", descriptor = "I")
    private int field832;

    @OriginalMember(owner = "client!vb", name = "f", descriptor = "I")
    private int field834;

    @OriginalMember(owner = "client!vb", name = "h", descriptor = "I")
    private int field836;

    @OriginalMember(owner = "client!vb", name = "k", descriptor = "I")
    public static int field839;

    @OriginalMember(owner = "client!vb", name = "l", descriptor = "I")
    public static int field840;

    @OriginalMember(owner = "client!vb", name = "w", descriptor = "I")
    public static int field851;

    @OriginalMember(owner = "client!vb", name = "y", descriptor = "I")
    public static int field853;

    @OriginalMember(owner = "client!vb", name = "A", descriptor = "I")
    public static int field855;

    @OriginalMember(owner = "client!vb", name = "C", descriptor = "I")
    public static int field857;

    @OriginalMember(owner = "client!vb", name = "D", descriptor = "I")
    public static int field858;

    @OriginalMember(owner = "client!vb", name = "m", descriptor = "Lul;")
    public class43 field841;

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(IIIIB)V", line = 7)
    public final void method358(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        if (arg4 != 84) {
            return;
        }
        this.field831 = arg0;
        this.field834 = arg2;
        this.field836 = arg3;
        this.field832 = arg1;
        field858++;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(Loe;I)Z", line = 34)
    public static final boolean method359(class127 arg0, int arg1) {
        if (arg1 != 512) {
            return true;
        }
        field851++;
        if (arg0.field1831 == null) {
            return false;
        }
        for (int var2 = 0; var2 < arg0.field1831.length; var2++) {
            int var3 = class287.method1930(arg1 - 635, var2, arg0);
            int var4 = arg0.field1894[var2];
            if (arg0.field1831[var2] == 2) {
                if (var3 >= var4) {
                    return false;
                }
            } else if (arg0.field1831[var2] == 3) {
                if (var3 <= var4) {
                    return false;
                }
            } else if (arg0.field1831[var2] == 4) {
                if (var3 == var4) {
                    return false;
                }
            } else if (var3 != var4) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(I)V", line = 93)
    private final void method360(int arg0) {
        field857++;
        if (arg0 == -32561) {
            int var2 = (this.field854 << 7) + 64;
            this.field842 = 1.0F / (float) (var2 * var2);
        }
    }

    @OriginalMember(owner = "client!vb", name = "<init>", descriptor = "()V", line = 486)
    protected class54() {
        if (class26.field450 == null) {
            class86.method560((byte) 10);
        }
        this.method364(0);
    }

    @OriginalMember(owner = "client!vb", name = "<init>", descriptor = "(Lhi;)V", line = 496)
    public class54(class291 arg0) {
        if (class26.field450 == null) {
            class86.method560((byte) 10);
        }
        this.field837 = arg0.method2011(-68);
        this.field850 = (this.field837 & 0x10) != 0;
        this.field835 = (this.field837 & 0x8) != 0;
        this.field837 &= 0x7;
        this.field838 = arg0.method2021((byte) 74);
        this.field848 = arg0.method2021((byte) 74);
        this.field849 = arg0.method2021((byte) 74);
        this.field854 = arg0.method2011(-19);
        this.method360(-32561);
        this.field845 = new short[this.field854 * 2 + 1];
        for (int var2 = 0; var2 < this.field845.length; var2++) {
            this.field845[var2] = (short) arg0.method2021((byte) 74);
        }
        this.field829 = class181.field2885[arg0.method2021((byte) 74)];
        int var3 = arg0.method2011(-28);
        this.field843 = var3 & 0xE0 << 3;
        this.field833 = var3 & 0x1F;
        if (this.field833 != 31) {
            this.method364(0);
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(III)V", line = 116)
    public static final void method361(int arg0, int arg1, int arg2) {
        int var3 = 122 % ((arg0 + 7) / 59);
        if (class58.field889 != arg2) {
            class131.field1992 = new int[arg2];
            for (int var4 = 0; var4 < arg2; var4++) {
                class131.field1992[var4] = (var4 << 12) / arg2;
            }
            class251.field4304 = arg2 - 1;
            class58.field889 = arg2;
            class162.field2571 = arg2 == 64 ? 2048 : 4096;
        }
        if (class268.field4526 != arg1) {
            if (class58.field889 == arg1) {
                class114.field1620 = class131.field1992;
            } else {
                class114.field1620 = new int[arg1];
                for (int var5 = 0; var5 < arg1; var5++) {
                    class114.field1620[var5] = (var5 << 12) / arg1;
                }
            }
            class275.field4712 = arg1 - 1;
            class268.field4526 = arg1;
        }
        field839++;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(B)V", line = 160)
    public static void method362(byte arg0) {
        if (arg0 <= 4) {
            field844 = 34;
        }
        field847 = null;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(ZIB)V", line = 181)
    public final void method363(boolean arg0, int arg1, byte arg2) {
        int var4 = this.field843 + (this.field836 * arg1 / 50) & 0x7FF;
        field853++;
        int var5 = this.field831;
        int var6;
        if (var5 == 1) {
            var6 = (class181.field2884[var4] >> 6) + 1024;
        } else if (var5 == 3) {
            var6 = class26.field450[var4] >> 1;
        } else if (var5 == 4) {
            var6 = var4 >> 10 << 11;
        } else if (var5 == 2) {
            var6 = var4;
        } else if (var5 == 5) {
            var6 = (var4 >= 1024 ? 2048 - var4 : var4) << 1;
        } else {
            var6 = 2048;
        }
        if (arg2 != 42) {
            return;
        }
        if (arg0) {
            var6 = 2048;
        }
        this.field856 = (float) ((this.field834 * var6 >> 11) + this.field832) / 2048.0F;
        float var7 = this.field856 / 255.0F;
        this.field852[0] = var7 * (float) (class34.method251(16756154, this.field829) >> 16);
        this.field852[1] = (float) class34.method251(this.field829 >> 8, 255) * var7;
        this.field852[2] = var7 * (float) class34.method251(this.field829, 255);
    }

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "(I)V", line = 263)
    private final void method364(int arg0) {
        field855++;
        int var2 = this.field833;
        if (var2 == 2) {
            this.field831 = 1;
            this.field836 = 2048;
            this.field834 = 2048;
            this.field832 = 0;
        } else if (var2 == 3) {
            this.field832 = 0;
            this.field831 = 1;
            this.field836 = 4096;
            this.field834 = 2048;
        } else if (var2 == 4) {
            this.field832 = 0;
            this.field831 = 4;
            this.field834 = 2048;
            this.field836 = 2048;
        } else if (var2 == 5) {
            this.field834 = 2048;
            this.field836 = 8192;
            this.field832 = 0;
            this.field831 = 4;
        } else if (var2 == 12) {
            this.field831 = 2;
            this.field836 = 2048;
            this.field834 = 2048;
            this.field832 = 0;
        } else if (var2 == 13) {
            this.field832 = 0;
            this.field831 = 2;
            this.field836 = 8192;
            this.field834 = 2048;
        } else if (var2 == 10) {
            this.field836 = 2048;
            this.field834 = 512;
            this.field831 = 3;
            this.field832 = 1536;
        } else if (var2 == 11) {
            this.field836 = 4096;
            this.field831 = 3;
            this.field832 = 1536;
            this.field834 = 512;
        } else if (var2 == 6) {
            this.field834 = 768;
            this.field831 = 3;
            this.field832 = 1280;
            this.field836 = 2048;
        } else if (var2 == 7) {
            this.field836 = 4096;
            this.field834 = 768;
            this.field831 = 3;
            this.field832 = 1280;
        } else if (var2 == 8) {
            this.field831 = 3;
            this.field832 = 1024;
            this.field834 = 1024;
            this.field836 = 2048;
        } else if (var2 == 9) {
            this.field834 = 1024;
            this.field831 = 3;
            this.field836 = 4096;
            this.field832 = 1024;
        } else if (var2 == 14) {
            this.field831 = 1;
            this.field834 = 768;
            this.field836 = 2048;
            this.field832 = 1280;
        } else if (var2 == 15) {
            this.field834 = 512;
            this.field831 = 1;
            this.field832 = 1536;
            this.field836 = 4096;
        } else if (var2 == 16) {
            this.field831 = 1;
            this.field832 = 1792;
            this.field834 = 256;
            this.field836 = 8192;
        } else {
            this.field834 = 2048;
            this.field836 = 2048;
            this.field831 = 0;
            this.field832 = 0;
        }
        if (arg0 != 0) {
            method362((byte) -16);
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(Lwm;Lwm;BILwm;)V", line = 464)
    public static final void method365(class152 arg0, class152 arg1, byte arg2, int arg3, class152 arg4) {
        field840++;
        if (arg2 != -97) {
            method361(35, -26, -96);
        }
        class251.method1731(-1, arg3, (byte) 126, arg4, arg0, arg1);
    }
}
