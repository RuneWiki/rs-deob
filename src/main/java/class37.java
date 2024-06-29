import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!be")
public class class37 extends class626 {

    @OriginalMember(owner = "client!be", name = "p", descriptor = "I")
    public int field554 = 0;

    @OriginalMember(owner = "client!be", name = "C", descriptor = "Lov;")
    private class186 field567;

    @OriginalMember(owner = "client!be", name = "v", descriptor = "I")
    public int field560;

    @OriginalMember(owner = "client!be", name = "H", descriptor = "I")
    public int field572;

    @OriginalMember(owner = "client!be", name = "t", descriptor = "Lgt;")
    private class453 field558;

    @OriginalMember(owner = "client!be", name = "q", descriptor = "F")
    public float field555;

    @OriginalMember(owner = "client!be", name = "r", descriptor = "[I")
    private int[] field556;

    @OriginalMember(owner = "client!be", name = "F", descriptor = "I")
    public int field570;

    @OriginalMember(owner = "client!be", name = "A", descriptor = "I")
    public int field565;

    @OriginalMember(owner = "client!be", name = "n", descriptor = "Lmp;")
    public static class758 field552 = new class758(8);

    @OriginalMember(owner = "client!be", name = "s", descriptor = "Lqaa;")
    public static class27 field557 = new class27(44, 1);

    @OriginalMember(owner = "client!be", name = "D", descriptor = "J")
    public static long field568 = -1L;

    @OriginalMember(owner = "client!be", name = "B", descriptor = "Lqaa;")
    public static class27 field566 = new class27(80, -1);

    @OriginalMember(owner = "client!be", name = "j", descriptor = "F")
    public static float field548;

    @OriginalMember(owner = "client!be", name = "i", descriptor = "I")
    public static int field547;

    @OriginalMember(owner = "client!be", name = "k", descriptor = "I")
    public static int field549;

    @OriginalMember(owner = "client!be", name = "l", descriptor = "I")
    public static int field550;

    @OriginalMember(owner = "client!be", name = "m", descriptor = "I")
    public static int field551;

    @OriginalMember(owner = "client!be", name = "o", descriptor = "I")
    public static int field553;

    @OriginalMember(owner = "client!be", name = "w", descriptor = "I")
    public static int field561;

    @OriginalMember(owner = "client!be", name = "x", descriptor = "I")
    public static int field562;

    @OriginalMember(owner = "client!be", name = "y", descriptor = "I")
    public static int field563;

    @OriginalMember(owner = "client!be", name = "E", descriptor = "I")
    public static int field569;

    @OriginalMember(owner = "client!be", name = "G", descriptor = "I")
    public static int field571;

    @OriginalMember(owner = "client!be", name = "u", descriptor = "Lcaa;")
    private class302 field559;

    @OriginalMember(owner = "client!be", name = "z", descriptor = "Ljaclib/memory/Stream;")
    private Stream field564;

    @OriginalMember(owner = "client!be", name = "h", descriptor = "Ljaclib/memory/heap/NativeHeapBuffer;")
    private NativeHeapBuffer field546;

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(FIIII)V", line = 7)
    public final void method299(float arg0, int arg1, int arg2, int arg3, int arg4) {
        if (this.field570 != -1) {
            class546 var6 = this.field558.field1084.method1154(arg1 ^ 0xFFFFFF8D, this.field570);
            int var7 = var6.field7707 & 0xFF;
            if (var7 != 0 && var6.field7711 != 4) {
                int var8;
                if (arg2 < 0) {
                    var8 = 0;
                } else if (arg2 <= 127) {
                    var8 = arg2 * 131586;
                } else {
                    var8 = 16777215;
                }
                if (var7 == 256) {
                    arg3 = var8;
                } else {
                    int var10 = 256 - var7;
                    arg3 = ((arg3 & 0xFF00) * var10 + (var8 & 0xFF00) * var7 & 0xFF0000) + ((arg3 & 0xFF00FF) * var10 + (var8 & 0xFF00FF) * var7 & 0xFF00FF00) >> 8;
                }
            }
            int var11 = var6.field7696 & 0xFF;
            if (var11 != 0) {
                var11 += 256;
                int var12 = ((arg3 & 0xFF0000) >> 16) * var11;
                if (var12 > 65535) {
                    var12 = 65535;
                }
                int var13 = ((arg3 & 0xFF00) >> 8) * var11;
                if (var13 > 65535) {
                    var13 = 65535;
                }
                int var14 = (arg3 & 0xFF) * var11;
                if (var14 > 65535) {
                    var14 = 65535;
                }
                arg3 = (var13 & 0xFF00) + (((var12 & 0x7600FF00) << 8) + (var14 >> 8));
            }
        }
        field551++;
        if (arg0 != 1.0F) {
            int var15 = arg3 >> 16 & 0xFF;
            int var16 = (arg3 & 0xFF18) >> 8;
            int var17 = arg3 & 0xFF;
            int var18 = (int) ((float) var15 * arg0);
            if (var18 < 0) {
                var18 = 0;
            } else if (var18 > 255) {
                var18 = 255;
            }
            int var19 = (int) ((float) var16 * arg0);
            int var20 = (int) ((float) var17 * arg0);
            if (var19 < 0) {
                var19 = 0;
            } else if (var19 > 255) {
                var19 = 255;
            }
            if (var20 < 0) {
                var20 = 0;
            } else if (var20 > 255) {
                var20 = 255;
            }
            arg3 = var19 << 8 | var18 << 16 | var20;
        }
        this.field564.method3775(arg1 * arg4);
        if (this.field558.field6498 == 0) {
            this.field564.method3772((byte) arg3);
            this.field564.method3772((byte) (arg3 >> 8));
            this.field564.method3772((byte) (arg3 >> 16));
        } else {
            this.field564.method3772((byte) (arg3 >> 16));
            this.field564.method3772((byte) (arg3 >> 8));
            this.field564.method3772((byte) arg3);
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(IBII)V", line = 126)
    public final void method300(int arg0, byte arg1, int arg2, int arg3) {
        if (arg1 < 98) {
            this.field559 = null;
        }
        field571++;
        this.field556[this.field567.field3924 * arg3 + arg0] = class164.method1221(this.field556[this.field567.field3924 * arg3 + arg0], 0x1 << arg2);
        this.field554++;
    }

    @OriginalMember(owner = "client!be", name = "<init>", descriptor = "(Lov;IIIII)V", line = 538)
    public class37(class186 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field567 = arg0;
        this.field560 = arg5;
        this.field572 = arg4;
        this.field558 = this.field567.field2655;
        this.field555 = arg2;
        this.field556 = new int[this.field567.field3924 * this.field567.field3914];
        this.field570 = arg1;
        this.field565 = arg3;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(JZ)V", line = 149)
    public static final void method301(long arg0, boolean arg1) {
        field550++;
        int var3 = class352.field4960 + class468.field6748.field644;
        int var4 = class362.field5077 + class468.field6748.field648;
        if (class701.field9841 - var3 < -2000 || class701.field9841 - var3 > 2000 || class246.field3437 - var4 < -2000 || class246.field3437 - var4 > 2000) {
            class246.field3437 = var4;
            class701.field9841 = var3;
        }
        if (!arg1) {
            method303(-114);
        }
        if (class701.field9841 != var3) {
            int var5 = var3 - class701.field9841;
            int var6 = (int) ((long) var5 * arg0 / 320L);
            if (var5 > 0) {
                if (var6 == 0) {
                    var6 = 1;
                } else if (var5 < var6) {
                    var6 = var5;
                }
            } else if (var6 == 0) {
                var6 = -1;
            } else if (var6 < var5) {
                var6 = var5;
            }
            class701.field9841 += var6;
        }
        if (class246.field3437 != var4) {
            int var7 = var4 - class246.field3437;
            int var8 = (int) ((long) var7 * arg0 / 320L);
            if (var7 <= 0) {
                if (var8 == 0) {
                    var8 = -1;
                } else if (var7 > var8) {
                    var8 = var7;
                }
            } else if (var8 == 0) {
                var8 = 1;
            } else if (var8 > var7) {
                var8 = var7;
            }
            class246.field3437 += var8;
        }
        class432.field6035 += (float) arg0 * class15.field190 / 6.0F;
        class321.field4568 += (float) arg0 * class390.field5450 / 6.0F;
        class181.method1295(101);
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(B)V", line = 239)
    public static void method302(byte arg0) {
        field566 = null;
        field552 = null;
        int var1 = -68 / ((12 - arg0) / 62);
        field557 = null;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(I)V", line = 254)
    public static final void method303(int arg0) {
        field569++;
        if (!class579.field8180) {
            return;
        }
        int var1 = -34 / ((arg0 - 28) / 39);
        while (true) {
            while (class289.field4072 < class261.field3819.length) {
                class483 var2 = class261.field3819[class289.field4072];
                if (var2 != null && var2.field6844 == -1) {
                    if (class405.field5646 == null) {
                        class405.field5646 = class4.field58.method3392(var2.field6839, (byte) 103);
                    }
                    int var3 = class405.field5646.field1275;
                    if (var3 == -1) {
                        return;
                    }
                    var2.field6844 = var3;
                    class405.field5646 = null;
                    class289.field4072++;
                } else {
                    class289.field4072++;
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(II)V", line = 295)
    public final void method304(int arg0, int arg1) {
        this.field546 = this.field558.method2766(arg1 * 4, 0, true);
        field562++;
        this.field564 = new Stream(this.field546, 0, arg1 * 4);
        int var3 = -13 % ((arg0 + 1) / 53);
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(BLoea;III)Lm;", line = 307)
    public static final class189 method305(byte arg0, class594 arg1, int arg2, int arg3, int arg4) {
        if (arg0 != 2) {
            return null;
        }
        field549++;
        if (!arg1.field8644 && (!class278.method1826((byte) 127, arg4) || !class278.method1826((byte) 127, arg3))) {
            return arg1.field8587 ? new class189(arg1, 34037, arg2, arg4, arg3) : new class189(arg1, arg2, arg4, arg3, class613.method3530(false, arg4), class613.method3530(false, arg3));
        } else {
            return new class189(arg1, 3553, arg2, arg4, arg3);
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(IIZ)V", line = 333)
    public static final void method306(int arg0, int arg1, boolean arg2) {
        field547++;
        if (!arg2) {
            method303(-97);
        }
        class354 var3 = class501.method3012(arg0, 7, 2145997216);
        var3.method2222(-75);
        var3.field4990 = arg1;
    }

    @OriginalMember(owner = "client!be", name = "b", descriptor = "(II)V", line = 349)
    public final void method307(int arg0, int arg1) {
        field563++;
        this.field564.method3761();
        this.field559 = this.field558.method1036((byte) -51, false);
        this.field559.method1495(this.field546, 4, arg1 * 4, (byte) -47);
        this.field564 = null;
        if (arg0 < -27) {
            this.field546 = null;
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(IZ)V", line = 365)
    public final void method308(int arg0, boolean arg1) {
        field561++;
        this.field564.method3775(arg0 * 4 + 3);
        this.field564.method3772(-1);
        if (arg1) {
            this.method304(92, 31);
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(II[I)V", line = 382)
    public final void method309(int arg0, int arg1, int[] arg2) {
        field553++;
        class234 var4 = this.field558.method2714(this.field554 * 3, (byte) 19);
        Buffer var5 = var4.method1599(true, (byte) -109);
        if (var5 == null) {
            return;
        }
        Stream var6 = this.field558.method2764(var5, (byte) -76);
        int var7 = arg1;
        int var8 = 32767;
        int var9 = -32768;
        if (Stream.method3762()) {
            label98: for (int var18 = 0; var18 < arg0; var18++) {
                int var20 = arg2[var18];
                int var21 = this.field556[var20];
                short[] var22 = this.field567.field2667[var20];
                if (var21 != 0 && var22 != null) {
                    int var23 = 0;
                    int var24 = 0;
                    while (true) {
                        while (true) {
                            if (var24 >= var22.length) {
                                continue label98;
                            }
                            if ((0x1 << var23++ & var21) == 0) {
                                var24 += 3;
                            } else {
                                for (int var25 = 0; var25 < 3; var25++) {
                                    int var26 = var22[var24++] & 0xFFFF;
                                    if (var26 < var8) {
                                        var8 = var26;
                                    }
                                    var6.method3766(var26);
                                    if (var9 < var26) {
                                        var9 = var26;
                                    }
                                }
                                var7++;
                            }
                        }
                    }
                }
            }
        } else {
            label122: for (int var10 = 0; var10 < arg0; var10++) {
                int var11 = arg2[var10];
                int var12 = this.field556[var11];
                short[] var13 = this.field567.field2667[var11];
                if (var12 != 0 && var13 != null) {
                    int var14 = 0;
                    int var15 = 0;
                    while (true) {
                        while (true) {
                            if (var15 >= var13.length) {
                                continue label122;
                            }
                            if ((var12 & 0x1 << var14++) == 0) {
                                var15 += 3;
                            } else {
                                var7++;
                                for (int var16 = 0; var16 < 3; var16++) {
                                    int var17 = var13[var15++] & 0xFFFF;
                                    if (var9 < var17) {
                                        var9 = var17;
                                    }
                                    if (var17 < var8) {
                                        var8 = var17;
                                    }
                                    var6.method3768(var17);
                                }
                            }
                        }
                    }
                }
            }
        }
        var6.method3761();
        if (!var4.method1601(124) || var7 <= 0) {
            return;
        }
        this.field558.method2728((this.field567.field2638 & 0x7) != 0, (this.field567.field2638 & 0x8) != 0, (byte) 23, this.field570);
        if (this.field558.field6538) {
            this.field558.method596(Integer.MAX_VALUE, this.field565, this.field572, this.field560);
        }
        class25 var19 = this.field558.method2773((byte) -30);
        var19.method179(1.0F, 1.0F / this.field555, false, 1.0F / this.field555);
        this.field558.method2699(class56.field1049, -17);
        this.field558.method1059(this.field559, 1, -57);
        this.field558.method1014(this.field567.field2683, false);
        this.field558.method1046(0, var9 + 1 - var8, var4, (byte) 54, var7, class428.field5978, var8);
        this.field558.method2763((byte) -79);
    }
}
