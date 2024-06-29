import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bi")
public class class137 extends class135 {

    @OriginalMember(owner = "client!bi", name = "y", descriptor = "[F")
    private float[] field2212 = new float[4];

    @OriginalMember(owner = "client!bi", name = "o", descriptor = "Lar;")
    private class526 field2202;

    @OriginalMember(owner = "client!bi", name = "r", descriptor = "Lar;")
    private class526 field2205;

    @OriginalMember(owner = "client!bi", name = "l", descriptor = "Lar;")
    private class526 field2199;

    @OriginalMember(owner = "client!bi", name = "z", descriptor = "Lar;")
    private class526 field2213;

    @OriginalMember(owner = "client!bi", name = "s", descriptor = "Z")
    private boolean field2206;

    @OriginalMember(owner = "client!bi", name = "A", descriptor = "Ldca;")
    private class612 field2214;

    @OriginalMember(owner = "client!bi", name = "B", descriptor = "I")
    public static int field2215 = 0;

    @OriginalMember(owner = "client!bi", name = "C", descriptor = "[I")
    public static int[] field2216 = new int[8];

    @OriginalMember(owner = "client!bi", name = "k", descriptor = "I")
    public static int field2198;

    @OriginalMember(owner = "client!bi", name = "m", descriptor = "I")
    public static int field2200;

    @OriginalMember(owner = "client!bi", name = "n", descriptor = "I")
    public static int field2201;

    @OriginalMember(owner = "client!bi", name = "p", descriptor = "I")
    public static int field2203;

    @OriginalMember(owner = "client!bi", name = "q", descriptor = "I")
    public static int field2204;

    @OriginalMember(owner = "client!bi", name = "u", descriptor = "I")
    public static int field2208;

    @OriginalMember(owner = "client!bi", name = "v", descriptor = "I")
    public static int field2209;

    @OriginalMember(owner = "client!bi", name = "w", descriptor = "I")
    public static int field2210;

    @OriginalMember(owner = "client!bi", name = "D", descriptor = "I")
    public static int field2217;

    @OriginalMember(owner = "client!bi", name = "F", descriptor = "I")
    public static int field2219;

    @OriginalMember(owner = "client!bi", name = "E", descriptor = "Lvo;")
    public static class345 field2218;

    @OriginalMember(owner = "client!bi", name = "t", descriptor = "Z")
    private boolean field2207;

    @OriginalMember(owner = "client!bi", name = "x", descriptor = "Z")
    private boolean field2211;

    @OriginalMember(owner = "client!bi", name = "<init>", descriptor = "(Lad;Lvo;)V", line = 9)
    public class137(class669 arg0, class345 arg1) {
        super(arg0);
        if (arg1 != null && arg0.field9532) {
            this.field2202 = class109.method895(arg1.method2073((byte) 95, "uw_ground_unlit", "gl"), arg0, 32173, 34336);
            this.field2205 = class109.method895(arg1.method2073((byte) 71, "uw_ground_lit", "gl"), arg0, 32173, 34336);
            this.field2199 = class109.method895(arg1.method2073((byte) 86, "uw_model_unlit", "gl"), arg0, 32173, 34336);
            this.field2213 = class109.method895(arg1.method2073((byte) 70, "uw_model_lit", "gl"), arg0, 32173, 34336);
            if (!(this.field2213 != null & this.field2205 != null & this.field2202 != null & this.field2199 != null)) {
                this.field2206 = false;
            } else {
                this.field2214 = super.field2179.method2928(false, 1, false, 2, new int[] { 0, -1 });
                this.field2214.method414(111, false, false);
                this.field2206 = true;
            }
        } else {
            this.field2206 = false;
        }
    }

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "(B)V", line = 35)
    public final void method380(byte arg0) {
        if (arg0 <= 63) {
            this.field2199 = null;
        }
        ++field2209;
        if (this.field2207) {
            int var2 = super.field2179.method746();
            int var3 = super.field2179.method820();
            float var4 = (float) var2 - (float) (-var3 + var2) * 0.125F;
            float var5 = (float) var2 - (float) (-var3 + var2) * 0.25F;
            OpenGL.glProgramLocalParameter4fARB(34336, 0, var5, var4, 1.0F / (float) super.field2179.method2968(false), (float) super.field2179.method2898((byte) -97) / 255.0F);
            super.field2179.method2953(1, 104);
            super.field2179.method2936(super.field2179.method2901(56), -126);
            super.field2179.method2953(0, 109);
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(IZ)V", line = 61)
    public final void method375(int arg0, boolean arg1) {
        ++field2198;
        if (arg0 <= 14) {
            method1046(52, 31);
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(IIB)Z", line = 76)
    public static final boolean method1044(int arg0, int arg1, byte arg2) {
        ++field2204;
        if (arg2 != -23) {
            field2218 = null;
        }
        return ~(458752 & arg1) != -1 | class582.method3369(-11610, arg1, arg0) || class250.method1597(arg0, arg1, 26127);
    }

    @OriginalMember(owner = "client!bi", name = "i", descriptor = "(I)V", line = 88)
    public static void method1045(int arg0) {
        if (arg0 != 34820) {
            field2215 = -31;
        }
        field2216 = null;
        field2218 = null;
    }

    @OriginalMember(owner = "client!bi", name = "g", descriptor = "(I)Z", line = 101)
    public final boolean method379(int arg0) {
        if (arg0 != -4931) {
            this.method384((class402) null, -88, 17);
        }
        ++field2219;
        return this.field2206;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(II)Lvfa;", line = 113)
    public static final class438 method1046(int arg0, int arg1) {
        ++field2201;
        class438 var2 = (class438) class43.field584.method3823((long) arg1, -1);
        if (var2 != null) {
            return var2;
        } else {
            if (arg0 > -45) {
                method1046(-57, -94);
            }
            byte[] var3 = class563.field8216.method2081(-33, 0, arg1);
            if (var3 != null && ~var3.length < -2) {
                class438 var4;
                try {
                    var4 = class596.method3410(124, var3);
                } catch (Exception var6) {
                    throw new RuntimeException(var6.getMessage() + " S: " + arg1);
                }
                class43.field584.method3824((long) arg1, -91, var4);
                return var4;
            } else {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "(I)V", line = 142)
    public final void method385(int arg0) {
        ++field2217;
        super.field2179.method2953(1, 123);
        super.field2179.method2924(13528, (class402) null);
        super.field2179.method2959(class55.field715, class55.field715, (byte) 73);
        super.field2179.method2914(36, 0, class171.field2763);
        int var2 = -31 % ((arg0 - -29) / 45);
        super.field2179.method2914(84, 2, class450.field6484);
        super.field2179.method2937(8, class171.field2763, 0);
        super.field2179.method2953(0, 121);
        if (this.field2207) {
            OpenGL.glBindProgramARB(34336, 0);
            OpenGL.glDisable(34820);
            OpenGL.glDisable(34336);
            this.field2207 = false;
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(ZI)V", line = 174)
    public final void method376(boolean arg0, int arg1) {
        ++field2203;
        if (arg1 != -25475) {
            this.method377(-97, -95, -79);
        }
        this.field2211 = arg0;
        super.field2179.method2953(1, 114);
        super.field2179.method2924(13528, this.field2214);
        super.field2179.method2959(class166.field2734, class345.field4866, (byte) 65);
        super.field2179.method2914(52, 0, class450.field6484);
        super.field2179.method143(true, class171.field2763, 26, false, 2);
        super.field2179.method2937(8, class51.field669, 0);
        super.field2179.method2953(0, 120);
        this.method1037(-13501);
    }

    @OriginalMember(owner = "client!bi", name = "f", descriptor = "(I)V", line = 194)
    public final void method1037(int arg0) {
        ++field2200;
        int var2 = super.field2179.method2916(false);
        if (arg0 == -13501) {
            class14 var3 = super.field2179.method2961(arg0 ^ -30101);
            if (this.field2211) {
                OpenGL.glBindProgramARB(34336, var2 == Integer.MAX_VALUE ? this.field2205.field7714 : this.field2213.field7714);
            } else {
                OpenGL.glBindProgramARB(34336, var2 != Integer.MAX_VALUE ? this.field2199.field7714 : this.field2202.field7714);
            }
            OpenGL.glEnable(34336);
            this.field2207 = true;
            var3.method185(this.field2212, -1.0F, 0.0F, 0.0F, (byte) 14, (float) var2);
            OpenGL.glProgramLocalParameter4fARB(34336, 1, this.field2212[0], this.field2212[1], this.field2212[2], this.field2212[3]);
            this.method380((byte) 70);
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(III)V", line = 222)
    public final void method377(int arg0, int arg1, int arg2) {
        ++field2208;
        if (arg2 != 0) {
            method1045(-83);
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(Laj;II)V", line = 239)
    public final void method384(class402 arg0, int arg1, int arg2) {
        if (arg1 == 0) {
            ++field2210;
            super.field2179.method2924(13528, arg0);
            super.field2179.method2956((byte) 47, arg2);
        }
    }
}
