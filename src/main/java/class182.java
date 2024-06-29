import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ij")
public class class182 {

    @OriginalMember(owner = "client!ij", name = "f", descriptor = "Z")
    public boolean field2931 = false;

    @OriginalMember(owner = "client!ij", name = "h", descriptor = "I")
    public int field2933 = -1;

    @OriginalMember(owner = "client!ij", name = "t", descriptor = "[I")
    private int[] field2945 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!ij", name = "c", descriptor = "Ljava/lang/String;")
    public static String field2928 = "Members object";

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "I")
    public static int field2926;

    @OriginalMember(owner = "client!ij", name = "d", descriptor = "I")
    public static int field2929;

    @OriginalMember(owner = "client!ij", name = "i", descriptor = "I")
    public static int field2934;

    @OriginalMember(owner = "client!ij", name = "j", descriptor = "I")
    public static int field2935;

    @OriginalMember(owner = "client!ij", name = "l", descriptor = "I")
    public static int field2937;

    @OriginalMember(owner = "client!ij", name = "n", descriptor = "I")
    public static int field2939;

    @OriginalMember(owner = "client!ij", name = "o", descriptor = "I")
    public static int field2940;

    @OriginalMember(owner = "client!ij", name = "p", descriptor = "I")
    public static int field2941;

    @OriginalMember(owner = "client!ij", name = "q", descriptor = "I")
    public static int field2942;

    @OriginalMember(owner = "client!ij", name = "r", descriptor = "I")
    public static int field2943;

    @OriginalMember(owner = "client!ij", name = "s", descriptor = "I")
    public static int field2944;

    @OriginalMember(owner = "client!ij", name = "u", descriptor = "I")
    public static int field2946;

    @OriginalMember(owner = "client!ij", name = "m", descriptor = "[I")
    private int[] field2938;

    @OriginalMember(owner = "client!ij", name = "b", descriptor = "[S")
    private short[] field2927;

    @OriginalMember(owner = "client!ij", name = "e", descriptor = "[S")
    private short[] field2930;

    @OriginalMember(owner = "client!ij", name = "g", descriptor = "[S")
    private short[] field2932;

    @OriginalMember(owner = "client!ij", name = "k", descriptor = "[S")
    private short[] field2936;

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(I)Lch;", line = 7)
    public final class114 method1424(int arg0) {
        field2926++;
        class114[] var2 = new class114[5];
        int var3 = 0;
        int var4 = 23 / ((67 - arg0) / 45);
        for (int var5 = 0; var5 < 5; var5++) {
            if (this.field2945[var5] != -1) {
                var2[var3++] = class114.method887(class125.field2136, this.field2945[var5], 0);
            }
        }
        class114 var6 = new class114(var2, var3);
        if (this.field2930 != null) {
            for (int var7 = 0; var7 < this.field2930.length; var7++) {
                var6.method885(this.field2930[var7], this.field2927[var7]);
            }
        }
        if (this.field2936 != null) {
            for (int var8 = 0; var8 < this.field2936.length; var8++) {
                var6.method864(this.field2936[var8], this.field2932[var8]);
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(ZIIII[Lwf;)V", line = 60)
    public static final void method1425(boolean arg0, int arg1, int arg2, int arg3, int arg4, class250[] arg5) {
        for (int var6 = arg3; var6 < arg5.length; var6++) {
            class250 var7 = arg5[var6];
            if (var7 != null && var7.field4086 == arg1) {
                class11.method45(-109, var7, arg4, arg0, arg2);
                class43.method315(arg2, arg4, (byte) -94, var7);
                if (var7.field4225 > var7.field4211 - var7.field4081) {
                    var7.field4225 = var7.field4211 - var7.field4081;
                }
                if (var7.field4120 > (var7.field4201 - var7.field4157)) {
                    var7.field4120 = var7.field4201 - var7.field4157;
                }
                if (var7.field4225 < 0) {
                    var7.field4225 = 0;
                }
                if (var7.field4120 < 0) {
                    var7.field4120 = 0;
                }
                if (var7.field4078 == 0) {
                    class278.method2057(var7, arg0, -120);
                }
            }
        }
        field2935++;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(Lqm;ZI)V", line = 109)
    private final void method1426(class227 arg0, boolean arg1, int arg2) {
        if (arg1) {
            return;
        }
        if (arg2 == 1) {
            this.field2933 = arg0.method1720((byte) -22);
        } else if (arg2 == 2) {
            int var4 = arg0.method1720((byte) -9);
            this.field2938 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field2938[var5] = arg0.method1765(true);
            }
        } else if (arg2 == 3) {
            this.field2931 = true;
        } else if (arg2 == 40) {
            int var6 = arg0.method1720((byte) -92);
            this.field2927 = new short[var6];
            this.field2930 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field2930[var7] = (short) arg0.method1765(true);
                this.field2927[var7] = (short) arg0.method1765(!arg1);
            }
        } else if (arg2 == 41) {
            int var8 = arg0.method1720((byte) -40);
            this.field2932 = new short[var8];
            this.field2936 = new short[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field2936[var9] = (short) arg0.method1765(true);
                this.field2932[var9] = (short) arg0.method1765(!arg1);
            }
        } else if (arg2 >= 60 && arg2 < 70) {
            this.field2945[arg2 - 60] = arg0.method1765(!arg1);
        }
        field2929++;
    }

    @OriginalMember(owner = "client!ij", name = "b", descriptor = "(I)Z", line = 203)
    public final boolean method1427(int arg0) {
        field2939++;
        boolean var2 = true;
        for (int var3 = arg0; var3 < 5; var3++) {
            if (this.field2945[var3] != -1 && !class125.field2136.method486(this.field2945[var3], 0, arg0 + 105)) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(Lqm;B)V", line = 225)
    public final void method1428(class227 arg0, byte arg1) {
        field2934++;
        if (arg1 != -3) {
            field2928 = (String) null;
        }
        while (true) {
            int var3 = arg0.method1720((byte) -114);
            if (var3 == 0) {
                return;
            }
            this.method1426(arg0, false, var3);
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(IIBIIIII)V", line = 246)
    public static final void method1429(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg2 == 64) {
            class181.method1420(arg7, -81, arg5, arg4, 0, arg3, arg0, arg6, arg1);
            field2943++;
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(II)[F", line = 257)
    public static final float[] method1430(int arg0, int arg1) {
        field2946++;
        float var2 = class167.method1303() + class167.method1298();
        int var3 = class167.method1300();
        float var4 = (float) ((var3 & 0xFFF7) >> 8) / 255.0F;
        class102.field1666[arg0] = 1.0F;
        float var5 = (float) (var3 & 0xFF) / 255.0F;
        float var6 = (float) (var3 >> 16 & 0xFF) / 255.0F;
        float var7 = 0.58823526F;
        class102.field1666[0] = var2 * var7 * var6 * ((float) (class343.method2418(16742426, arg1) >> 16) / 255.0F);
        class102.field1666[1] = var4 * ((float) class343.method2418(arg1 >> 8, 255) / 255.0F) * var7 * var2;
        class102.field1666[2] = var2 * (float) class343.method2418(arg1, 255) / 255.0F * var5 * var7;
        return class102.field1666;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(Ljava/lang/String;B)V", line = 282)
    public static final void method1431(String arg0, byte arg1) {
        if (arg1 == -11) {
            field2942++;
            class35.method241(arg1 ^ 0xFFFFFFF4, 0, arg0, 0, "", "");
        }
    }

    @OriginalMember(owner = "client!ij", name = "c", descriptor = "(I)Z", line = 294)
    public final boolean method1432(int arg0) {
        field2941++;
        if (this.field2938 == null) {
            return true;
        }
        boolean var2 = true;
        for (int var3 = arg0; var3 < this.field2938.length; var3++) {
            if (!class125.field2136.method486(this.field2938[var3], 0, arg0 - 80)) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(ILth;Lth;Z)V", line = 316)
    public static final void method1433(int arg0, class57 arg1, class57 arg2, boolean arg3) {
        class92.field1558 = arg3;
        class247.field4045 = arg1;
        if (arg0 != 0) {
            method1431((String) null, (byte) -64);
        }
        field2944++;
        class305.field4886 = arg2;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(B)Lch;", line = 329)
    public final class114 method1434(byte arg0) {
        field2937++;
        if (this.field2938 == null) {
            return null;
        } else if (arg0 == -20) {
            class114[] var2 = new class114[this.field2938.length];
            for (int var3 = 0; var3 < this.field2938.length; var3++) {
                var2[var3] = class114.method887(class125.field2136, this.field2938[var3], 0);
            }
            class114 var4;
            if (var2.length == 1) {
                var4 = var2[0];
            } else {
                var4 = new class114(var2, var2.length);
            }
            if (this.field2930 != null) {
                for (int var5 = 0; var5 < this.field2930.length; var5++) {
                    var4.method885(this.field2930[var5], this.field2927[var5]);
                }
            }
            if (this.field2936 != null) {
                for (int var6 = 0; var6 < this.field2936.length; var6++) {
                    var4.method864(this.field2936[var6], this.field2932[var6]);
                }
            }
            return var4;
        } else {
            return (class114) null;
        }
    }

    @OriginalMember(owner = "client!ij", name = "d", descriptor = "(I)V", line = 388)
    public static void method1435(int arg0) {
        if (arg0 < 104) {
            field2928 = (String) null;
        }
        field2928 = null;
    }
}
