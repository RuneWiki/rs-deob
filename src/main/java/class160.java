import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bj")
public class class160 extends class136 {

    @OriginalMember(owner = "client!bj", name = "H", descriptor = "[I")
    public static int[] field2254 = new int[1000];

    @OriginalMember(owner = "client!bj", name = "C", descriptor = "I")
    private int field2249;

    @OriginalMember(owner = "client!bj", name = "D", descriptor = "I")
    public static int field2250;

    @OriginalMember(owner = "client!bj", name = "E", descriptor = "I")
    private int field2251;

    @OriginalMember(owner = "client!bj", name = "F", descriptor = "I")
    public static int field2252;

    @OriginalMember(owner = "client!bj", name = "G", descriptor = "I")
    private int field2253;

    @OriginalMember(owner = "client!bj", name = "I", descriptor = "I")
    public static int field2255;

    @OriginalMember(owner = "client!bj", name = "J", descriptor = "I")
    public static int field2256;

    @OriginalMember(owner = "client!bj", name = "K", descriptor = "I")
    public static int field2257;

    @OriginalMember(owner = "client!bj", name = "<init>", descriptor = "(I)V")
    private class160(int arg0) {
        super(0, false);
        this.method1133(arg0, (byte) -88);
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(Lcw;I)V")
    public static final void method1130(class120 arg0, int arg1) {
        ++field2250;
        int var2 = arg1;
        arg0.method945(arg1 ^ -934);
        for (int var3 = 0; ~var3 > ~class75.field1027; ++var3) {
            int var15 = class334.field4634[var3];
            if (~(1 & class135.field1949[var15]) == -1) {
                if (var2 > 0) {
                    --var2;
                    class135.field1949[var15] = (byte) class244.method1606(class135.field1949[var15], 2);
                } else {
                    int var16 = arg0.method952(-86, 1);
                    if (var16 == 0) {
                        var2 = class188.method1316((byte) -37, arg0);
                        class135.field1949[var15] = (byte) class244.method1606(class135.field1949[var15], 2);
                    } else {
                        class106.method877(arg0, var15, (byte) -64);
                    }
                }
            }
        }
        arg0.method944((byte) -93);
        if (var2 != 0) {
            throw new RuntimeException("nsn0");
        } else {
            arg0.method945(arg1 ^ -934);
            for (int var4 = 0; var4 < class75.field1027; ++var4) {
                int var13 = class334.field4634[var4];
                if (~(class135.field1949[var13] & 1) != -1) {
                    if (~var2 < -1) {
                        class135.field1949[var13] = (byte) class244.method1606(class135.field1949[var13], 2);
                        --var2;
                    } else {
                        int var14 = arg0.method952(-108, 1);
                        if (~var14 == -1) {
                            var2 = class188.method1316((byte) -37, arg0);
                            class135.field1949[var13] = (byte) class244.method1606(class135.field1949[var13], 2);
                        } else {
                            class106.method877(arg0, var13, (byte) -64);
                        }
                    }
                }
            }
            arg0.method944((byte) 94);
            if (var2 != 0) {
                throw new RuntimeException("nsn1");
            } else {
                arg0.method945(arg1 ^ -934);
                for (int var5 = 0; var5 < class64.field753; ++var5) {
                    int var11 = class310.field4419[var5];
                    if (~(1 & class135.field1949[var11]) != -1) {
                        if (~var2 < -1) {
                            --var2;
                            class135.field1949[var11] = (byte) class244.method1606(class135.field1949[var11], 2);
                        } else {
                            int var12 = arg0.method952(-57, 1);
                            if (var12 == 0) {
                                var2 = class188.method1316((byte) -37, arg0);
                                class135.field1949[var11] = (byte) class244.method1606(class135.field1949[var11], 2);
                            } else if (class180.method1266(arg0, arg1 ^ 85, var11)) {
                                class135.field1949[var11] = (byte) class244.method1606(class135.field1949[var11], 2);
                            }
                        }
                    }
                }
                arg0.method944((byte) -75);
                if (~var2 != -1) {
                    throw new RuntimeException("nsn2");
                } else {
                    arg0.method945(-934);
                    for (int var6 = 0; class64.field753 > var6; ++var6) {
                        int var9 = class310.field4419[var6];
                        if ((1 & class135.field1949[var9]) == 0) {
                            if (var2 > 0) {
                                class135.field1949[var9] = (byte) class244.method1606(class135.field1949[var9], 2);
                                --var2;
                            } else {
                                int var10 = arg0.method952(-63, 1);
                                if (~var10 == -1) {
                                    var2 = class188.method1316((byte) -37, arg0);
                                    class135.field1949[var9] = (byte) class244.method1606(class135.field1949[var9], 2);
                                } else if (class180.method1266(arg0, arg1 + 109, var9)) {
                                    class135.field1949[var9] = (byte) class244.method1606(class135.field1949[var9], 2);
                                }
                            }
                        }
                    }
                    arg0.method944((byte) 78);
                    if (var2 != 0) {
                        throw new RuntimeException("nsn3");
                    } else {
                        class64.field753 = 0;
                        class75.field1027 = 0;
                        for (int var7 = 1; var7 < 2048; ++var7) {
                            class135.field1949[var7] = (byte) (class135.field1949[var7] >> 1);
                            class364 var8 = class384.field5647[var7];
                            if (var8 != null) {
                                class334.field4634[class75.field1027++] = var7;
                            } else {
                                class310.field4419[class64.field753++] = var7;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!bj", name = "c", descriptor = "(B)V")
    public static void method1131(byte arg0) {
        int var1 = -122 % ((-7 - arg0) / 42);
        field2254 = null;
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(IFIIZI[FIII)V")
    public static final void method1132(int arg0, float arg1, int arg2, int arg3, boolean arg4, int arg5, float[] arg6, int arg7, int arg8, int arg9) {
        int var10 = arg0 - arg9;
        ++field2255;
        int var11 = arg5 - arg8;
        if (arg4) {
            int var12 = arg2 - arg3;
            float var13 = arg6[2] * (float) var10 + arg6[1] * (float) var11 + arg6[0] * (float) var12;
            float var14 = arg6[5] * (float) var10 + arg6[4] * (float) var11 + arg6[3] * (float) var12;
            float var15 = arg6[8] * (float) var10 + arg6[7] * (float) var11 + arg6[6] * (float) var12;
            float var16 = (float) Math.sqrt((double) (var15 * var15 + var13 * var13 + var14 * var14));
            float var17 = (float) Math.atan2((double) var13, (double) var15) / 6.2831855F + 0.5F;
            float var18 = (float) Math.asin((double) (var14 / var16)) / 3.1415927F + 0.5F + arg1;
            if (~arg7 == -2) {
                float var19 = var17;
                var17 = -var18;
                var18 = var19;
            } else if (arg7 == 2) {
                var18 = -var18;
                var17 = -var17;
            } else if (arg7 == 3) {
                float var20 = var17;
                var17 = var18;
                var18 = -var20;
            }
            class386.field5695 = var18;
            class349.field4835 = var17;
        }
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(IILiv;)V")
    public final void method268(int arg0, int arg1, class65 arg2) {
        if (arg1 == 0) {
            this.method1133(arg2.method580((byte) 29), (byte) -88);
        }
        if (arg0 != 4) {
            method1130((class120) null, -45);
        }
        ++field2252;
    }

    @OriginalMember(owner = "client!bj", name = "<init>", descriptor = "()V")
    public class160() {
        this(0);
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(BI)[[I")
    public final int[][] method272(byte arg0, int arg1) {
        ++field2256;
        int[][] var3 = super.field1952.method3127((byte) 80, arg1);
        if (arg0 < 33) {
            field2254 = null;
        }
        if (super.field1952.field7770) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            for (int var7 = 0; ~var7 > ~class467.field6889; ++var7) {
                var4[var7] = this.field2249;
                var5[var7] = this.field2253;
                var6[var7] = this.field2251;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(IB)V")
    private final void method1133(int arg0, byte arg1) {
        this.field2253 = arg0 >> 4 & 4080;
        this.field2249 = arg0 >> 12 & 4080;
        ++field2257;
        this.field2251 = (arg0 & 255) << 4;
        if (arg1 != -88) {
            this.field2251 = 11;
        }
    }

    static {
        new class331("Please wait until you are logged out of your previous channel.", "Bitte warte, bis du den vorherigen Chatraum verlassen hast.", "Veuillez attendre d'être déconnecté(e) de votre canal précédent.", "Aguarde até se desconectar do canal anterior.");
    }
}
