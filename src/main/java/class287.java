import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!go")
public abstract class class287 extends class352 {

    @OriginalMember(owner = "client!go", name = "z", descriptor = "I")
    public int field4393;

    @OriginalMember(owner = "client!go", name = "y", descriptor = "I")
    public int field4392;

    @OriginalMember(owner = "client!go", name = "t", descriptor = "I")
    public int field4387;

    @OriginalMember(owner = "client!go", name = "k", descriptor = "I")
    public int field4378;

    @OriginalMember(owner = "client!go", name = "j", descriptor = "I")
    public int field4377;

    @OriginalMember(owner = "client!go", name = "w", descriptor = "I")
    public int field4390;

    @OriginalMember(owner = "client!go", name = "r", descriptor = "I")
    public int field4385;

    @OriginalMember(owner = "client!go", name = "q", descriptor = "I")
    public static int field4384 = -1;

    @OriginalMember(owner = "client!go", name = "p", descriptor = "Lko;")
    public static class176 field4383 = new class176(0, -1);

    @OriginalMember(owner = "client!go", name = "x", descriptor = "Lsh;")
    public static class472 field4391 = new class472(15, 4);

    @OriginalMember(owner = "client!go", name = "i", descriptor = "F")
    public static float field4376;

    @OriginalMember(owner = "client!go", name = "l", descriptor = "I")
    public static int field4379;

    @OriginalMember(owner = "client!go", name = "m", descriptor = "I")
    public static int field4380;

    @OriginalMember(owner = "client!go", name = "n", descriptor = "I")
    public static int field4381;

    @OriginalMember(owner = "client!go", name = "o", descriptor = "I")
    public static int field4382;

    @OriginalMember(owner = "client!go", name = "s", descriptor = "I")
    public static int field4386;

    @OriginalMember(owner = "client!go", name = "u", descriptor = "I")
    public static int field4388;

    @OriginalMember(owner = "client!go", name = "v", descriptor = "I")
    public static int field4389;

    @OriginalMember(owner = "client!go", name = "c", descriptor = "(I)Z", line = 3)
    public final boolean method253(int arg0) {
        if (arg0 > -9) {
            return true;
        } else {
            field4386++;
            return false;
        }
    }

    @OriginalMember(owner = "client!go", name = "c", descriptor = "(B)V", line = 21)
    public static void method1832(byte arg0) {
        if (arg0 >= 51) {
            field4383 = null;
            field4391 = null;
        }
    }

    @OriginalMember(owner = "client!go", name = "b", descriptor = "(I)V", line = 36)
    public final void method249(int arg0) {
        if (arg0 <= 56) {
            field4376 = -1.420262F;
        }
        field4380++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(I[[[BILtq;IIIIIIIII)V", line = 47)
    public static final void method1833(int arg0, byte[][][] arg1, int arg2, class63 arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        field4379++;
        if (arg11 == 0 || arg4 == 0) {
            return;
        }
        if (arg11 == 9) {
            arg8 = arg8 + 1 & 0x3;
            arg11 = 1;
        }
        if (arg11 == 10) {
            arg8 = arg8 + 3 & 0x3;
            arg11 = 1;
        }
        if (arg5 != 3) {
            field4376 = -1.3448501F;
        }
        if (arg11 == 11) {
            arg11 = 8;
            arg8 = arg8 + 3 & 0x3;
        }
        arg3.method541(arg6, arg2, arg12, arg7, arg10, arg9, arg1[arg11 - 1][arg8], arg4, arg0);
    }

    @OriginalMember(owner = "client!go", name = "e", descriptor = "(I)V", line = 85)
    public static final void method1834(int arg0) {
        field4388++;
        if (class100.field1423 == -1 || class258.field3855 == -1) {
            return;
        }
        int var1 = ((class151.field2118 - class263.field3911) * class20.field256 >> 16) + class263.field3911;
        class20.field256 += var1;
        if (class20.field256 < 65535) {
            class441.field6237 = false;
            class330.field4938 = false;
        } else {
            class20.field256 = 65535;
            if (class441.field6237) {
                class330.field4938 = false;
            } else {
                class330.field4938 = true;
            }
            class441.field6237 = true;
        }
        float var2 = (float) class20.field256 / 65535.0F;
        float[] var3 = new float[3];
        int var4 = class266.field3954 * 2;
        for (int var5 = 0; var5 < 3; var5++) {
            int var21 = class186.field2834[class100.field1423][var4][var5] * 3;
            int var22 = class186.field2834[class100.field1423][var4 + 1][var5] * 3;
            int var23 = (class186.field2834[class100.field1423][var4 + 2][var5] + class186.field2834[class100.field1423][var4 + 2][var5] - class186.field2834[class100.field1423][var4 + 3][var5]) * 3;
            int var24 = class186.field2834[class100.field1423][var4][var5];
            int var25 = var22 - var21;
            int var26 = var21 + var23 - (var22 * 2);
            int var27 = class186.field2834[class100.field1423][var4 + 2][var5] + var22 - var24 - var23;
            var3[var5] = (((float) var27 * var2 + (float) var26) * var2 + (float) var25) * var2 + (float) var24;
        }
        class200.field3027 = (int) var3[2] - (class468.field6588 * 128);
        class68.field920 = (int) var3[0] - (class68.field922 * 128);
        class344.field5191 = (int) var3[1] * -1;
        float[] var6 = new float[3];
        int var7 = class238.field3466 * 2;
        for (int var8 = arg0; var8 < 3; var8++) {
            int var14 = class186.field2834[class258.field3855][var7][var8] * 3;
            int var15 = class186.field2834[class258.field3855][var7 + 1][var8] * 3;
            int var16 = (class186.field2834[class258.field3855][var7 + 2][var8] - (class186.field2834[class258.field3855][var7 + 3][var8] - class186.field2834[class258.field3855][var7 + 2][var8])) * 3;
            int var17 = class186.field2834[class258.field3855][var7][var8];
            int var18 = var15 - var14;
            int var19 = var14 + var16 - (var15 * 2);
            int var20 = class186.field2834[class258.field3855][var7 + 2][var8] + var15 - var16 - var17;
            var6[var8] = (((float) var20 * var2 + (float) var19) * var2 + (float) var18) * var2 + (float) var17;
        }
        float var9 = var6[0] - var3[0];
        float var10 = (var6[1] - var3[1]) * -1.0F;
        float var11 = var6[2] - var3[2];
        double var12 = Math.sqrt((double) (var9 * var9 + var11 * var11));
        class283.field4287 = (int) (Math.atan2((double) var10, var12) * 2607.5945876176133D) & 0x3FFF;
        class433.field6156 = (int) (-Math.atan2((double) var9, (double) var11) * 2607.5945876176133D) & 0x3FFF;
        class32.field425 = ((class186.field2834[class100.field1423][var4 + 2][3] - class186.field2834[class100.field1423][var4][3]) * class20.field256 >> 16) + class186.field2834[class100.field1423][var4][3];
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(BZLtq;Lhm;III)V", line = 190)
    public final void method245(byte arg0, boolean arg1, class63 arg2, class352 arg3, int arg4, int arg5, int arg6) {
        field4389++;
        if (arg0 >= -41) {
            this.field4387 = 30;
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(Lh;ZI)V", line = 204)
    public static final void method1835(class349 arg0, boolean arg1, int arg2) {
        field4382++;
        if (class186.field2817 >= 400) {
            return;
        }
        class273 var3 = arg0.field5309;
        if (arg2 <= 117) {
            return;
        }
        if (var3.field4107 != null) {
            var3 = var3.method1781(class315.field4736, true);
            if (var3 == null) {
                return;
            }
        }
        if (!var3.field4118) {
            return;
        }
        String var4 = var3.field4138;
        if (var3.field4104 != 0) {
            String var5 = class77.field1088 == class124.field1710 ? class260.field3864.method2036(class4.field85, (byte) -21) : class425.field6076.method2036(class4.field85, (byte) -21);
            var4 = var4 + class341.method2093(class472.field6622.field3840, var3.field4104, (byte) 127) + " (" + var5 + var3.field4104 + ")";
        }
        if (!class432.field6152) {
            if (!arg1) {
                String[] var6 = var3.field4122;
                if (class35.field442) {
                    var6 = class450.method2654(var6, (byte) 63);
                }
                if (var6 != null) {
                    for (int var7 = 4; var7 >= 0; var7--) {
                        if (var6[var7] != null && (class13.field195 != class124.field1710 || !var6[var7].equalsIgnoreCase(class99.field1405.method2036(class4.field85, (byte) -21)))) {
                            byte var8 = 0;
                            int var9 = class162.field2235;
                            if (var7 == 0) {
                                var8 = 8;
                            }
                            if (var7 == 1) {
                                var8 = 23;
                            }
                            if (var7 == 2) {
                                var8 = 25;
                            }
                            if (var7 == 3) {
                                var8 = 6;
                            }
                            if (var7 == 4) {
                                var8 = 3;
                            }
                            if (var3.field4150 == var7) {
                                var9 = var3.field4127;
                            }
                            if (var3.field4117 == var7) {
                                var9 = var3.field4101;
                            }
                            class344.method2117((long) arg0.field4609, var8, true, var9, "<col=ffff00>" + var4, var6[var7], -8, 0, -1, false, 0);
                            class344.field5198++;
                        }
                    }
                }
                if (class13.field195 == class124.field1710 && var6 != null) {
                    for (int var10 = 4; var10 >= 0; var10--) {
                        if (var6[var10] != null && var6[var10].equalsIgnoreCase(class99.field1405.method2036(class4.field85, (byte) -21))) {
                            short var11 = 0;
                            if (class472.field6622.field3840 < var3.field4104) {
                                var11 = 2000;
                            }
                            short var12 = 0;
                            if (var10 == 0) {
                                var12 = 8;
                            }
                            if (var10 == 1) {
                                var12 = 23;
                            }
                            if (var10 == 2) {
                                var12 = 25;
                            }
                            if (var10 == 3) {
                                var12 = 6;
                            }
                            if (var10 == 4) {
                                var12 = 3;
                            }
                            if (var12 != 0) {
                                var12 += var11;
                            }
                            class344.method2117((long) arg0.field4609, var12, true, var3.field4113, "<col=ffff00>" + var4, var6[var10], -8, 0, -1, false, 0);
                            class71.field957++;
                        }
                    }
                }
            }
            class344.method2117((long) arg0.field4609, 1012, true, class365.field5524, "<col=ffff00>" + var4, class402.field5868.method2036(class4.field85, (byte) -21), -8, 0, -1, arg1, 0);
            class98.field1399++;
        } else if (!arg1) {
            class170 var13 = class25.field323 == -1 ? null : class237.field3463.method1398(-69, class25.field323);
            if ((class197.field2960 & 0x2) != 0) {
                if (var13 == null || var3.method1780(var13.field2419, 15, class25.field323) != var13.field2419) {
                    class344.method2117((long) arg0.field4609, 57, true, class186.field2830, class357.field5428 + " -> <col=ffff00>" + var4, class184.field2803, -8, 0, -1, false, 0);
                    class170.field2418++;
                }
                return;
            }
        }
    }

    @OriginalMember(owner = "client!go", name = "<init>", descriptor = "(IIIIIII)V", line = 377)
    public class287(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field4393 = arg6;
        this.field4392 = arg0;
        this.field4387 = arg2;
        this.field4378 = arg4;
        this.field4377 = arg1;
        this.field4390 = arg3;
        this.field4385 = arg5;
    }

    @OriginalMember(owner = "client!go", name = "d", descriptor = "(B)I")
    public abstract int method286(byte arg0);
}
