import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tg")
public class class243 {

    @OriginalMember(owner = "client!tg", name = "s", descriptor = "[F")
    public float[] field3914 = new float[4];

    @OriginalMember(owner = "client!tg", name = "G", descriptor = "I")
    public int field3928;

    @OriginalMember(owner = "client!tg", name = "E", descriptor = "Z")
    public boolean field3926;

    @OriginalMember(owner = "client!tg", name = "K", descriptor = "Z")
    public boolean field3932;

    @OriginalMember(owner = "client!tg", name = "H", descriptor = "I")
    public int field3929;

    @OriginalMember(owner = "client!tg", name = "k", descriptor = "I")
    public int field3906;

    @OriginalMember(owner = "client!tg", name = "h", descriptor = "I")
    public int field3903;

    @OriginalMember(owner = "client!tg", name = "B", descriptor = "I")
    public int field3923;

    @OriginalMember(owner = "client!tg", name = "g", descriptor = "[S")
    public short[] field3902;

    @OriginalMember(owner = "client!tg", name = "F", descriptor = "I")
    public int field3927;

    @OriginalMember(owner = "client!tg", name = "v", descriptor = "I")
    private int field3917;

    @OriginalMember(owner = "client!tg", name = "A", descriptor = "I")
    private int field3922;

    @OriginalMember(owner = "client!tg", name = "f", descriptor = "Lck;")
    public static class119 field3901 = class298.method1987((byte) 45, " ");

    @OriginalMember(owner = "client!tg", name = "d", descriptor = "Lck;")
    private static class119 field3899 = class298.method1987((byte) 96, "Type");

    @OriginalMember(owner = "client!tg", name = "j", descriptor = "Lck;")
    public static class119 field3905 = class298.method1987((byte) 111, "http:)4)4");

    @OriginalMember(owner = "client!tg", name = "r", descriptor = "[I")
    public static int[] field3913 = new int[1000];

    @OriginalMember(owner = "client!tg", name = "t", descriptor = "I")
    public static int field3915 = 0;

    @OriginalMember(owner = "client!tg", name = "x", descriptor = "I")
    public static int field3919 = 1;

    @OriginalMember(owner = "client!tg", name = "p", descriptor = "Lck;")
    public static class119 field3911 = field3899;

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "F")
    public float field3896;

    @OriginalMember(owner = "client!tg", name = "w", descriptor = "F")
    public float field3918;

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "I")
    public static int field3897;

    @OriginalMember(owner = "client!tg", name = "c", descriptor = "I")
    private int field3898;

    @OriginalMember(owner = "client!tg", name = "e", descriptor = "I")
    public static int field3900;

    @OriginalMember(owner = "client!tg", name = "i", descriptor = "I")
    public static int field3904;

    @OriginalMember(owner = "client!tg", name = "l", descriptor = "I")
    public static int field3907;

    @OriginalMember(owner = "client!tg", name = "m", descriptor = "I")
    public static int field3908;

    @OriginalMember(owner = "client!tg", name = "n", descriptor = "I")
    private int field3909;

    @OriginalMember(owner = "client!tg", name = "o", descriptor = "I")
    public static int field3910;

    @OriginalMember(owner = "client!tg", name = "q", descriptor = "I")
    public static int field3912;

    @OriginalMember(owner = "client!tg", name = "u", descriptor = "I")
    public static int field3916;

    @OriginalMember(owner = "client!tg", name = "y", descriptor = "I")
    public static int field3920;

    @OriginalMember(owner = "client!tg", name = "z", descriptor = "I")
    private int field3921;

    @OriginalMember(owner = "client!tg", name = "C", descriptor = "I")
    public static int field3924;

    @OriginalMember(owner = "client!tg", name = "I", descriptor = "I")
    private int field3930;

    @OriginalMember(owner = "client!tg", name = "J", descriptor = "I")
    public static int field3931;

    @OriginalMember(owner = "client!tg", name = "L", descriptor = "I")
    public static int field3933;

    @OriginalMember(owner = "client!tg", name = "D", descriptor = "Log;")
    public class159 field3925;

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(Lqh;B)V", line = 7)
    public static final void method1579(class163 arg0, byte arg1) {
        field3916++;
        for (class32 var2 = (class32) class95.field1461.method995(1836596936); var2 != null; var2 = (class32) class95.field1461.method996(0)) {
            if (var2.field467 == arg0) {
                if (var2.field448 != null) {
                    class230.field3721.method1421(var2.field448);
                    var2.field448 = null;
                }
                var2.method552((byte) 126);
                return;
            }
        }
        int var3 = -67 / ((9 - arg1) / 45);
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(I)V", line = 40)
    private final void method1580(int arg0) {
        if (arg0 != 15426) {
            this.field3917 = 57;
        }
        field3910++;
        int var2 = (this.field3923 << 7) + 64;
        this.field3918 = 1.0F / (float) (var2 * var2);
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(ZIBI[Lml;I)V", line = 60)
    public static final void method1581(boolean arg0, int arg1, byte arg2, int arg3, class134[] arg4, int arg5) {
        field3904++;
        if (arg2 != 65) {
            field3897 = 91;
        }
        for (int var6 = 0; var6 < arg4.length; var6++) {
            class134 var7 = arg4[var6];
            if (var7 != null && var7.field2024 == arg1) {
                class185.method1175(var7, arg0, arg5, arg3, arg2 ^ 0x40);
                class195.method1257(var7, (byte) -72, arg3, arg5);
                if (var7.field2175 - var7.field2180 < var7.field2173) {
                    var7.field2173 = var7.field2175 - var7.field2180;
                }
                if (var7.field2173 < 0) {
                    var7.field2173 = 0;
                }
                if (var7.field2169 > (var7.field2095 - var7.field2057)) {
                    var7.field2169 = var7.field2095 - var7.field2057;
                }
                if (var7.field2169 < 0) {
                    var7.field2169 = 0;
                }
                if (var7.field2135 == 0) {
                    class139.method915(var7, arg2 ^ 0x3E, arg0);
                }
            }
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(IZI)Lck;", line = 108)
    public static final class119 method1582(int arg0, boolean arg1, int arg2) {
        field3908++;
        if (arg0 <= 110) {
            method1584(-96, (byte) 75);
        }
        return class9.method99(arg1, 10, -27866, arg2);
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(II)Lla;", line = 120)
    public static final class113 method1583(int arg0, int arg1) {
        class113 var2 = (class113) class255.field4098.method487(false, (long) arg1);
        field3924++;
        if (var2 != null) {
            return var2;
        }
        class113 var3 = class75.method537(class174.field2786, arg1, client.field1397, false, arg0 - 7);
        if (arg0 != 7) {
            method1579((class163) null, (byte) 97);
        }
        if (var3 != null) {
            class255.field4098.method488(var3, (byte) 95, (long) arg1);
        }
        return var3;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(IB)V", line = 144)
    public static final void method1584(int arg0, byte arg1) {
        field3920++;
        class204.field3237.method491(119, arg0);
        if (arg1 <= 105) {
            field3907 = -126;
        }
    }

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "(I)V", line = 186)
    public static void method1585(int arg0) {
        int var1 = 58 / ((arg0 + 78) / 33);
        field3905 = null;
        field3911 = null;
        field3901 = null;
        field3899 = null;
        field3913 = null;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(Z)V", line = 205)
    private final void method1586(boolean arg0) {
        if (!arg0) {
            this.field3903 = -41;
        }
        field3931++;
        int var2 = this.field3922;
        if (var2 == 2) {
            this.field3909 = 2048;
            this.field3921 = 2048;
            this.field3898 = 0;
            this.field3930 = 1;
        } else if (var2 == 3) {
            this.field3898 = 0;
            this.field3930 = 1;
            this.field3921 = 2048;
            this.field3909 = 4096;
        } else if (var2 == 4) {
            this.field3898 = 0;
            this.field3909 = 2048;
            this.field3930 = 4;
            this.field3921 = 2048;
        } else if (var2 == 5) {
            this.field3898 = 0;
            this.field3930 = 4;
            this.field3921 = 2048;
            this.field3909 = 8192;
        } else if (var2 == 12) {
            this.field3909 = 2048;
            this.field3930 = 2;
            this.field3921 = 2048;
            this.field3898 = 0;
        } else if (var2 == 13) {
            this.field3909 = 8192;
            this.field3930 = 2;
            this.field3921 = 2048;
            this.field3898 = 0;
        } else if (var2 == 10) {
            this.field3898 = 1536;
            this.field3909 = 2048;
            this.field3921 = 512;
            this.field3930 = 3;
        } else if (var2 == 11) {
            this.field3930 = 3;
            this.field3909 = 4096;
            this.field3898 = 1536;
            this.field3921 = 512;
        } else if (var2 == 6) {
            this.field3921 = 768;
            this.field3898 = 1280;
            this.field3909 = 2048;
            this.field3930 = 3;
        } else if (var2 == 7) {
            this.field3930 = 3;
            this.field3921 = 768;
            this.field3898 = 1280;
            this.field3909 = 4096;
        } else if (var2 == 8) {
            this.field3909 = 2048;
            this.field3921 = 1024;
            this.field3898 = 1024;
            this.field3930 = 3;
        } else if (var2 == 9) {
            this.field3930 = 3;
            this.field3898 = 1024;
            this.field3921 = 1024;
            this.field3909 = 4096;
        } else if (var2 == 14) {
            this.field3930 = 1;
            this.field3921 = 768;
            this.field3909 = 2048;
            this.field3898 = 1280;
        } else if (var2 == 15) {
            this.field3898 = 1536;
            this.field3909 = 4096;
            this.field3930 = 1;
            this.field3921 = 512;
        } else if (var2 == 16) {
            this.field3930 = 1;
            this.field3898 = 1792;
            this.field3921 = 256;
            this.field3909 = 8192;
        } else {
            this.field3898 = 0;
            this.field3930 = 0;
            this.field3909 = 2048;
            this.field3921 = 2048;
        }
    }

    @OriginalMember(owner = "client!tg", name = "<init>", descriptor = "()V", line = 420)
    protected class243() {
        if (class241.field3870 == null) {
            class20.method163(3);
        }
        this.method1586(true);
    }

    @OriginalMember(owner = "client!tg", name = "<init>", descriptor = "(Lfj;)V", line = 437)
    public class243(class3 arg0) {
        if (class241.field3870 == null) {
            class20.method163(3);
        }
        this.field3928 = arg0.method64((byte) -93);
        this.field3926 = (this.field3928 & 0x10) != 0;
        this.field3932 = (this.field3928 & 0x8) != 0;
        this.field3928 &= 0x7;
        this.field3929 = arg0.method63((byte) 1);
        this.field3906 = arg0.method63((byte) 1);
        this.field3903 = arg0.method63((byte) 1);
        this.field3923 = arg0.method64((byte) 31);
        this.method1580(15426);
        this.field3902 = new short[this.field3923 * 2 + 1];
        for (int var2 = 0; var2 < this.field3902.length; var2++) {
            this.field3902[var2] = (short) arg0.method63((byte) 1);
        }
        this.field3927 = class284.field4687[arg0.method63((byte) 1)];
        int var3 = arg0.method64((byte) -109);
        this.field3917 = var3 & 0xE0 << 3;
        this.field3922 = var3 & 0x1F;
        this.method1586(true);
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(ZZI)V", line = 472)
    public final void method1587(boolean arg0, boolean arg1, int arg2) {
        field3900++;
        if (arg0) {
            return;
        }
        int var4 = this.field3917 + (this.field3909 * arg2 / 50) & 0x7FF;
        int var5 = this.field3930;
        int var6;
        if (var5 == 1) {
            var6 = (class284.field4698[var4] >> 6) + 1024;
        } else if (var5 == 3) {
            var6 = class241.field3870[var4] >> 1;
        } else if (var5 == 4) {
            var6 = var4 >> 10 << 11;
        } else if (var5 == 2) {
            var6 = var4;
        } else if (var5 == 5) {
            var6 = (var4 < 1024 ? var4 : 2048 - var4) << 1;
        } else {
            var6 = 2048;
        }
        if (arg1) {
            var6 = 2048;
        }
        this.field3896 = (float) ((this.field3921 * var6 >> 11) + this.field3898) / 2048.0F;
        float var7 = this.field3896 / 255.0F;
        this.field3914[0] = (float) (class19.method151(16772967, this.field3927) >> 16) * var7;
        this.field3914[1] = (float) (class19.method151(65403, this.field3927) >> 8) * var7;
        this.field3914[2] = (float) class19.method151(this.field3927, 255) * var7;
    }
}
