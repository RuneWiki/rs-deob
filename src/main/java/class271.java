import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fd")
public class class271 {

    @OriginalMember(owner = "client!fd", name = "e", descriptor = "I")
    public int field4261 = -1;

    @OriginalMember(owner = "client!fd", name = "f", descriptor = "I")
    public int field4262 = -1;

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "[F")
    public static float[] field4258 = new float[] { 0.0F, 0.0F, 0.0F, 0.0F };

    @OriginalMember(owner = "client!fd", name = "j", descriptor = "[S")
    public static short[] field4266 = new short[256];

    @OriginalMember(owner = "client!fd", name = "i", descriptor = "I")
    public static int field4265 = -1;

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "I")
    public static int field4257;

    @OriginalMember(owner = "client!fd", name = "c", descriptor = "I")
    public static int field4259;

    @OriginalMember(owner = "client!fd", name = "h", descriptor = "I")
    public static int field4264;

    @OriginalMember(owner = "client!fd", name = "k", descriptor = "I")
    public static int field4267;

    @OriginalMember(owner = "client!fd", name = "l", descriptor = "I")
    public static int field4268;

    @OriginalMember(owner = "client!fd", name = "m", descriptor = "I")
    public static int field4269;

    @OriginalMember(owner = "client!fd", name = "d", descriptor = "Lnk;")
    public static class16 field4260;

    @OriginalMember(owner = "client!fd", name = "g", descriptor = "[I")
    public int[] field4263;

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(Llf;III)V", line = 13)
    private final void method1916(class143 arg0, int arg1, int arg2, int arg3) {
        field4259++;
        if (arg1 <= 23) {
            field4269 = -103;
        }
        if (arg2 == 1) {
            this.field4261 = arg0.method1051(1);
        } else if (arg2 == 2) {
            this.field4263 = new int[arg0.method1043(true)];
            for (int var5 = 0; var5 < this.field4263.length; var5++) {
                this.field4263[var5] = arg0.method1051(1);
            }
        } else if (arg2 == 3) {
            this.field4262 = arg0.method1043(true);
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(B)V", line = 46)
    public static void method1917(byte arg0) {
        if (arg0 != 6) {
            method1919(42, -69, 51, (byte) 92);
        }
        field4266 = null;
        field4258 = null;
        field4260 = null;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(Llf;II)V", line = 65)
    public final void method1918(class143 arg0, int arg1, int arg2) {
        while (true) {
            int var4 = arg0.method1043(true);
            if (var4 == 0) {
                field4267++;
                if (arg1 != 2635) {
                    field4265 = -5;
                }
                return;
            }
            this.method1916(arg0, arg1 ^ 0xA00, var4, arg2);
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(IIIB)V", line = 86)
    public static final void method1919(int arg0, int arg1, int arg2, byte arg3) {
        field4268++;
        if (arg3 != -24) {
            field4265 = 85;
        }
        if (arg2 == 1007) {
            class162.method1171((byte) -60, 10, arg0, arg1);
        } else if (arg2 == 1005) {
            class162.method1171((byte) -25, 11, arg0, arg1);
        } else if (arg2 == 1011) {
            class162.method1171((byte) 127, 12, arg0, arg1);
        } else if (arg2 == 1003) {
            class162.method1171((byte) -46, 13, arg0, arg1);
        } else if (arg2 == 1008) {
            class162.method1171((byte) -43, 14, arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(Z)V", line = 114)
    public static final void method1920(boolean arg0) {
        if (arg0) {
            class194.field2947 = class6.field76;
            class72.field902 = class349.field5572;
            class69.field866 = class120.field1669;
        } else {
            class194.field2947 = class236.field3634;
            class72.field902 = class214.field3247;
            class69.field866 = class62.field748;
        }
        class196.field2973 = class194.field2947.length;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(IZI)V", line = 137)
    public static final void method1921(int arg0, boolean arg1, int arg2) {
        field4264++;
        if (class71.field879 > 0) {
            class308.method2171(class71.field879, 106);
            class71.field879 = 0;
        }
        short var3 = 256;
        if (arg1) {
            field4260 = (class16) null;
        }
        int var4 = 0;
        int var5 = class343.field5437 * arg2;
        int var6 = 0;
        for (int var7 = 1; var7 < (var3 - 1); var7++) {
            int var8 = (var3 - var7) * class187.field2822[var7] / var3;
            if (var8 < 0) {
                var8 = 0;
            }
            var4 += var8;
            for (int var9 = var8; var9 < 128; var9++) {
                int var10 = class343.field5439[var5++ + arg0];
                int var11 = class77.field1012[var4++];
                if (var11 == 0) {
                    class309.field4853.field2455[var6++] = var10;
                } else {
                    int var12 = 238 - var11;
                    int var13 = var11 + 18;
                    int var14 = class132.field1902[var11];
                    if (var13 > 255) {
                        var13 = 255;
                    }
                    if (var12 > 255) {
                        var12 = 255;
                    }
                    class309.field4853.field2455[var6++] = class261.method1840(var13 * class261.method1840(var14, 65280) + var12 * class261.method1840(65280, var10), 16711680) + class261.method1840(-16711936, var12 * class261.method1840(16711935, var10) + class261.method1840(16711935, var14) * var13) >> 8;
                }
            }
            for (int var15 = 0; var15 < var8; var15++) {
                class309.field4853.field2455[var6++] = class343.field5439[var5++ + arg0];
            }
            var5 += class343.field5437 - 128;
        }
        if (class272.field4317) {
            class239.method1655(class309.field4853.field2455, arg0, arg2, class309.field4853.field13, class309.field4853.field24);
        } else {
            class309.field4853.method17(arg0, arg2);
        }
    }
}
