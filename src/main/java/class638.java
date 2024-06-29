import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wda")
public class class638 extends class340 {

    @OriginalMember(owner = "client!wda", name = "x", descriptor = "[Ljava/lang/String;")
    public static String[] field8849 = new String[100];

    @OriginalMember(owner = "client!wda", name = "A", descriptor = "S")
    public static short field8852 = 205;

    @OriginalMember(owner = "client!wda", name = "M", descriptor = "[F")
    public static float[] field8864 = new float[4];

    @OriginalMember(owner = "client!wda", name = "B", descriptor = "F")
    private float field8853;

    @OriginalMember(owner = "client!wda", name = "L", descriptor = "F")
    private float field8863;

    @OriginalMember(owner = "client!wda", name = "t", descriptor = "I")
    public static int field8845;

    @OriginalMember(owner = "client!wda", name = "u", descriptor = "I")
    private int field8846;

    @OriginalMember(owner = "client!wda", name = "w", descriptor = "I")
    public static int field8848;

    @OriginalMember(owner = "client!wda", name = "z", descriptor = "I")
    public static int field8851;

    @OriginalMember(owner = "client!wda", name = "C", descriptor = "I")
    public static int field8854;

    @OriginalMember(owner = "client!wda", name = "D", descriptor = "I")
    private int field8855;

    @OriginalMember(owner = "client!wda", name = "F", descriptor = "I")
    public static int field8857;

    @OriginalMember(owner = "client!wda", name = "G", descriptor = "I")
    public static int field8858;

    @OriginalMember(owner = "client!wda", name = "H", descriptor = "I")
    public static int field8859;

    @OriginalMember(owner = "client!wda", name = "I", descriptor = "I")
    public static int field8860;

    @OriginalMember(owner = "client!wda", name = "J", descriptor = "I")
    public static int field8861;

    @OriginalMember(owner = "client!wda", name = "K", descriptor = "I")
    public static int field8862;

    @OriginalMember(owner = "client!wda", name = "N", descriptor = "I")
    public static int field8865;

    @OriginalMember(owner = "client!wda", name = "v", descriptor = "Ljava/lang/String;")
    private String field8847;

    @OriginalMember(owner = "client!wda", name = "y", descriptor = "Ljava/lang/String;")
    private String field8850;

    @OriginalMember(owner = "client!wda", name = "E", descriptor = "Ljava/lang/String;")
    private String field8856;

    @OriginalMember(owner = "client!wda", name = "f", descriptor = "(I)Ljava/lang/String;")
    public final String method3585(int arg0) {
        ++field8861;
        if (arg0 != 22875) {
            this.field8855 = 92;
        }
        return this.field8856;
    }

    @OriginalMember(owner = "client!wda", name = "a", descriptor = "(Lcea;I)V")
    public static final void method3586(class215 arg0, int arg1) {
        ++field8860;
        if (arg1 != -16255) {
            method3590(-54, -22, (String) null);
        }
        for (class101 var2 = (class101) class315.field4251.method724(arg1 + 16287); var2 != null; var2 = (class101) class315.field4251.method723(arg1 ^ -16165)) {
            if (var2.field1328 == arg0) {
                if (var2.field1354 != null) {
                    class143.field1851.method2542(var2.field1354);
                    var2.field1354 = null;
                }
                var2.method315(116);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!wda", name = "a", descriptor = "(Ljagtheora/ogg/OggPacket;Z)V")
    public final void method1724(OggPacket arg0, boolean arg1) {
        ++field8854;
        if (super.field4578 <= 0 || "SUB".equals(this.field8847)) {
            class611 var3 = new class611(arg0.getData());
            if (arg1) {
                method3592(-72);
            }
            int var4 = var3.method3428((byte) 27);
            if (super.field4578 > 8) {
                if (var4 == 0) {
                    long var5 = var3.method3388((byte) -53);
                    long var7 = var3.method3388((byte) -63);
                    long var9 = var3.method3388((byte) -110);
                    if (var5 < 0L || ~var7 > -1L || var9 < 0L || ~var9 < ~var5) {
                        throw new IllegalStateException();
                    }
                    this.field8863 = (float) ((long) this.field8855 * var5) / (float) this.field8846;
                    this.field8853 = (float) ((var5 - -var7) * (long) this.field8855) / (float) this.field8846;
                    int var11 = var3.method3401((byte) -75);
                    if (~var11 > -1 || var11 > var3.field8529.length - var3.field8520) {
                        throw new IllegalStateException();
                    }
                    this.field8856 = class625.method3537(var3.field8520, var11, (byte) -51, var3.field8529);
                }
                if ((128 | var4) != 0) {
                    return;
                }
            } else {
                if (~(var4 | 128) == -1) {
                    throw new IllegalStateException();
                }
                if (~super.field4578 != -1) {
                    return;
                }
                var3.field8520 += 23;
                this.field8846 = var3.method3401((byte) -51);
                this.field8855 = var3.method3401((byte) -108);
                if (this.field8846 == 0 || this.field8855 == 0) {
                    throw new IllegalStateException();
                }
                class611 var12 = new class611(16);
                var3.method3389(var12.field8529, true, 16, 0);
                this.field8850 = var12.method3403((byte) 84);
                var12.field8520 = 0;
                var3.method3389(var12.field8529, !arg1, 16, 0);
                this.field8847 = var12.method3403((byte) 84);
            }
        }
    }

    @OriginalMember(owner = "client!wda", name = "g", descriptor = "(I)V")
    public static void method3587(int arg0) {
        field8864 = null;
        field8849 = null;
        if (arg0 != 21237) {
            field8852 = -113;
        }
    }

    @OriginalMember(owner = "client!wda", name = "a", descriptor = "(IIIIIILpfa;IIII)Z")
    public static final boolean method3588(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class298 arg6, int arg7, int arg8, int arg9, int arg10) {
        ++field8858;
        int var11 = arg3;
        int var12 = arg10;
        byte var13 = 64;
        if (arg1 != 14664) {
            method3586((class215) null, -75);
        }
        byte var14 = 64;
        int var15 = -var13 + arg3;
        int var16 = -var14 + arg10;
        class244.field3173[var13][var14] = 99;
        class525.field7061[var13][var14] = 0;
        byte var17 = 0;
        int var18 = 0;
        class43.field472[var17] = arg3;
        byte var10001 = var17;
        int var26 = var17 + 1;
        class386.field5451[var10001] = arg10;
        int[][] var19 = arg6.field3994;
        while (var26 != var18) {
            var11 = class43.field472[var18];
            var12 = class386.field5451[var18];
            int var20 = var11 - var15;
            int var21 = -var16 + var12;
            int var22 = -arg6.field3999 + var11;
            var18 = var18 + 1 & 4095;
            int var23 = -arg6.field4003 + var12;
            if (~arg0 != 3) {
                if (~arg0 != 2) {
                    if (arg0 != -2) {
                        if (arg0 != -1) {
                            if (~arg0 != -1 && arg0 != 1 && arg0 != 2 && arg0 != 3 && ~arg0 != -10) {
                                if (arg6.method1776(arg5, arg8, var12, arg7, arg0, 17761, 1, var11)) {
                                    class378.field5253 = var12;
                                    class301.field4076 = var11;
                                    return true;
                                }
                            } else if (arg6.method1790(arg7, var11, (byte) -110, 1, var12, arg8, arg5, arg0)) {
                                class378.field5253 = var12;
                                class301.field4076 = var11;
                                return true;
                            }
                        } else if (arg6.method1777(arg9, arg5, var12, 14672, 1, arg7, arg4, var11, arg2)) {
                            class378.field5253 = var12;
                            class301.field4076 = var11;
                            return true;
                        }
                    } else if (arg6.method1774(arg5, arg2, arg7, -1, var12, arg9, 1, var11, 1, arg4)) {
                        class378.field5253 = var12;
                        class301.field4076 = var11;
                        return true;
                    }
                } else if (class551.method3134(arg5, arg9, -105, var12, arg2, var11, arg7, 1, 1)) {
                    class301.field4076 = var11;
                    class378.field5253 = var12;
                    return true;
                }
            } else if (~arg5 == ~var11 && arg7 == var12) {
                class378.field5253 = var12;
                class301.field4076 = var11;
                return true;
            }
            int var25 = class525.field7061[var20][var21] + 1;
            if (var20 > 0 && ~class244.field3173[var20 + -1][var21] == -1 && ~(var19[var22 + -1][var23] & 1109655552) == -1) {
                class43.field472[var26] = var11 - 1;
                class386.field5451[var26] = var12;
                class244.field3173[var20 - 1][var21] = 2;
                var26 = 4095 & var26 + 1;
                class525.field7061[var20 + -1][var21] = var25;
            }
            if (~var20 > -128 && class244.field3173[var20 + 1][var21] == 0 && ~(1612972032 & var19[var22 + 1][var23]) == -1) {
                class43.field472[var26] = var11 + 1;
                class386.field5451[var26] = var12;
                class244.field3173[var20 + 1][var21] = 8;
                var26 = var26 + 1 & 4095;
                class525.field7061[var20 + 1][var21] = var25;
            }
            if (var21 > 0 && ~class244.field3173[var20][var21 + -1] == -1 && (var19[var22][var23 + -1] & 1084489728) == 0) {
                class43.field472[var26] = var11;
                class386.field5451[var26] = var12 - 1;
                class244.field3173[var20][var21 - 1] = 1;
                var26 = var26 + 1 & 4095;
                class525.field7061[var20][var21 + -1] = var25;
            }
            if (var21 < 127 && class244.field3173[var20][var21 - -1] == 0 && ~(var19[var22][var23 + 1] & 1210318848) == -1) {
                class43.field472[var26] = var11;
                class386.field5451[var26] = var12 - -1;
                var26 = var26 + 1 & 4095;
                class244.field3173[var20][var21 - -1] = 4;
                class525.field7061[var20][var21 + 1] = var25;
            }
            if (var20 > 0 && ~var21 < -1 && ~class244.field3173[var20 + -1][var21 - 1] == -1 && (var19[var22 + -1][var23 - 1] & 1134821376) == 0 && ~(var19[var22 + -1][var23] & 1109655552) == -1 && (1084489728 & var19[var22][var23 + -1]) == 0) {
                class43.field472[var26] = var11 + -1;
                class386.field5451[var26] = var12 + -1;
                var26 = 4095 & var26 + 1;
                class244.field3173[var20 + -1][var21 + -1] = 3;
                class525.field7061[var20 + -1][var21 + -1] = var25;
            }
            if (var20 < 127 && var21 > 0 && class244.field3173[var20 + 1][var21 + -1] == 0 && ~(var19[var22 + 1][var23 - 1] & 1625554944) == -1 && (var19[var22 + 1][var23] & 1612972032) == 0 && (var19[var22][var23 - 1] & 1084489728) == 0) {
                class43.field472[var26] = var11 - -1;
                class386.field5451[var26] = var12 - 1;
                var26 = 4095 & var26 + 1;
                class244.field3173[var20 - -1][var21 + -1] = 9;
                class525.field7061[var20 + 1][var21 + -1] = var25;
            }
            if (~var20 < -1 && ~var21 > -128 && ~class244.field3173[var20 + -1][var21 + 1] == -1 && (var19[var22 + -1][var23 + 1] & 1310982144) == 0 && (1109655552 & var19[var22 - 1][var23]) == 0 && (1210318848 & var19[var22][var23 + 1]) == 0) {
                class43.field472[var26] = var11 + -1;
                class386.field5451[var26] = var12 - -1;
                class244.field3173[var20 + -1][var21 + 1] = 6;
                var26 = var26 + 1 & 4095;
                class525.field7061[var20 + -1][var21 + 1] = var25;
            }
            if (~var20 > -128 && ~var21 > -128 && ~class244.field3173[var20 - -1][var21 + 1] == -1 && (2015625216 & var19[var22 + 1][var23 + 1]) == 0 && (1612972032 & var19[var22 + 1][var23]) == 0 && (1210318848 & var19[var22][var23 + 1]) == 0) {
                class43.field472[var26] = var11 + 1;
                class386.field5451[var26] = var12 + 1;
                class244.field3173[var20 - -1][var21 - -1] = 12;
                var26 = 4095 & var26 + 1;
                class525.field7061[var20 + 1][var21 + 1] = var25;
            }
        }
        class301.field4076 = var11;
        class378.field5253 = var12;
        return false;
    }

    @OriginalMember(owner = "client!wda", name = "a", descriptor = "(Z)Ljava/lang/String;")
    public final String method3589(boolean arg0) {
        ++field8845;
        return !arg0 ? null : this.field8850;
    }

    @OriginalMember(owner = "client!wda", name = "e", descriptor = "(I)V")
    public final void method1723(int arg0) {
        ++field8848;
        if (arg0 != -1128) {
            method3592(33);
        }
    }

    @OriginalMember(owner = "client!wda", name = "a", descriptor = "(IILjava/lang/String;)I")
    public static final int method3590(int arg0, int arg1, String arg2) {
        if (arg0 != 1) {
            field8849 = null;
        }
        ++field8851;
        return class407.method2353(arg1, true, arg2, arg0 ^ -21971);
    }

    @OriginalMember(owner = "client!wda", name = "<init>", descriptor = "(Ljagtheora/ogg/OggStreamState;)V")
    public class638(OggStreamState arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!wda", name = "h", descriptor = "(I)F")
    public final float method3591(int arg0) {
        if (arg0 != -6085) {
            return 2.7172983F;
        } else {
            ++field8865;
            return this.field8853;
        }
    }

    @OriginalMember(owner = "client!wda", name = "i", descriptor = "(I)V")
    public static final void method3592(int arg0) {
        class290.field3843.method1420((byte) -30);
        ++field8857;
        if (arg0 != 28837) {
            field8859 = -111;
        }
        class427.field6034.method529(-119);
        class58.field623.method1402(arg0 + -28837);
        class725.field10121.setBackground(Color.black);
        class665.field9268 = -1;
        class290.field3843 = class409.method2361((byte) 10, class725.field10121);
        class427.field6034 = class213.method1187(class725.field10121, true, -16777216);
    }

    @OriginalMember(owner = "client!wda", name = "j", descriptor = "(I)F")
    public final float method3593(int arg0) {
        ++field8862;
        if (arg0 >= -38) {
            field8852 = 29;
        }
        return this.field8863;
    }
}
