import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!al")
public class class460 extends class28 {

    @OriginalMember(owner = "client!al", name = "j", descriptor = "I")
    public int field6247 = 0;

    @OriginalMember(owner = "client!al", name = "s", descriptor = "Lua;")
    private class303 field6256;

    @OriginalMember(owner = "client!al", name = "w", descriptor = "I")
    public int field6260;

    @OriginalMember(owner = "client!al", name = "l", descriptor = "I")
    public int field6249;

    @OriginalMember(owner = "client!al", name = "p", descriptor = "I")
    public int field6253;

    @OriginalMember(owner = "client!al", name = "n", descriptor = "I")
    public int field6251;

    @OriginalMember(owner = "client!al", name = "A", descriptor = "[I")
    private int[] field6264;

    @OriginalMember(owner = "client!al", name = "D", descriptor = "Lsv;")
    private class312 field6267;

    @OriginalMember(owner = "client!al", name = "o", descriptor = "F")
    public float field6252;

    @OriginalMember(owner = "client!al", name = "F", descriptor = "Z")
    public static boolean field6269 = false;

    @OriginalMember(owner = "client!al", name = "H", descriptor = "[I")
    public static int[] field6271 = new int[2];

    @OriginalMember(owner = "client!al", name = "t", descriptor = "F")
    public static float field6257;

    @OriginalMember(owner = "client!al", name = "q", descriptor = "I")
    public static int field6254;

    @OriginalMember(owner = "client!al", name = "r", descriptor = "I")
    public static int field6255;

    @OriginalMember(owner = "client!al", name = "u", descriptor = "I")
    public static int field6258;

    @OriginalMember(owner = "client!al", name = "v", descriptor = "I")
    public static int field6259;

    @OriginalMember(owner = "client!al", name = "x", descriptor = "I")
    public static int field6261;

    @OriginalMember(owner = "client!al", name = "z", descriptor = "I")
    public static int field6263;

    @OriginalMember(owner = "client!al", name = "B", descriptor = "I")
    public static int field6265;

    @OriginalMember(owner = "client!al", name = "C", descriptor = "I")
    public static int field6266;

    @OriginalMember(owner = "client!al", name = "E", descriptor = "I")
    public static int field6268;

    @OriginalMember(owner = "client!al", name = "G", descriptor = "I")
    public static int field6270;

    @OriginalMember(owner = "client!al", name = "m", descriptor = "Lvp;")
    private class467 field6250;

    @OriginalMember(owner = "client!al", name = "y", descriptor = "Ljaclib/memory/Stream;")
    private Stream field6262;

    @OriginalMember(owner = "client!al", name = "k", descriptor = "Ljaclib/memory/heap/NativeHeapBuffer;")
    private NativeHeapBuffer field6248;

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(I)V", line = 13)
    public static void method2596(int arg0) {
        if (arg0 == 255) {
            field6271 = null;
        }
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(ZI[I)V", line = 23)
    public final void method2597(boolean arg0, int arg1, int[] arg2) {
        field6270++;
        class526 var4 = this.field6267.method2011(this.field6247 * 3, (byte) 124);
        Buffer var5 = var4.method1025(true, (byte) 67);
        if (var5 == null) {
            return;
        }
        if (arg0) {
            method2603(null, 36);
        }
        Stream var6 = this.field6267.method1920((byte) 124, var5);
        int var7 = 0;
        int var8 = 32767;
        int var9 = -32768;
        if (Stream.method1519()) {
            label105: for (int var18 = 0; var18 < arg1; var18++) {
                int var20 = arg2[var18];
                int var21 = this.field6264[var20];
                short[] var22 = this.field6256.field4049[var20];
                if (var21 != 0 && var22 != null) {
                    int var23 = 0;
                    int var24 = 0;
                    while (true) {
                        while (true) {
                            if (var22.length <= var24) {
                                continue label105;
                            }
                            if ((var21 & 0x1 << var23++) == 0) {
                                var24 += 3;
                            } else {
                                for (int var25 = 0; var25 < 3; var25++) {
                                    int var26 = var22[var24++] & 0xFFFF;
                                    if (var26 > var9) {
                                        var9 = var26;
                                    }
                                    if (var8 > var26) {
                                        var8 = var26;
                                    }
                                    var6.method1531(var26);
                                }
                                var7++;
                            }
                        }
                    }
                }
            }
        } else {
            label130: for (int var10 = 0; var10 < arg1; var10++) {
                int var11 = arg2[var10];
                int var12 = this.field6264[var11];
                short[] var13 = this.field6256.field4049[var11];
                if (var12 != 0 && var13 != null) {
                    int var14 = 0;
                    int var15 = 0;
                    while (true) {
                        while (true) {
                            if (var13.length <= var15) {
                                continue label130;
                            }
                            if ((0x1 << var14++ & var12) == 0) {
                                var15 += 3;
                            } else {
                                var7++;
                                for (int var16 = 0; var16 < 3; var16++) {
                                    int var17 = var13[var15++] & 0xFFFF;
                                    if (var8 > var17) {
                                        var8 = var17;
                                    }
                                    var6.method1525(var17);
                                    if (var9 < var17) {
                                        var9 = var17;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        var6.method1523();
        if (!var4.method1021(!arg0) || var7 <= 0) {
            return;
        }
        this.field6267.method2018((byte) 122, this.field6249, (this.field6256.field4064 & 0x7) != 0, (this.field6256.field4064 & 0x8) != 0);
        if (this.field6267.field4431) {
            this.field6267.method1888(Integer.MAX_VALUE, this.field6251, this.field6253, this.field6260);
        }
        class492 var19 = this.field6267.method1993((byte) -26);
        var19.method2772(1.0F / this.field6252, 1.0F, (byte) 123, 1.0F / this.field6252);
        this.field6267.method1896(class248.field3341, (byte) -6);
        this.field6267.method809(1, 1, this.field6250);
        this.field6267.method849((byte) 43, this.field6256.field4066);
        this.field6267.method818(var8, var9 + 1 - var8, var4, var7, -1, class319.field4687, 0);
        this.field6267.method1928(-9396);
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(II)V", line = 177)
    public final void method2598(int arg0, int arg1) {
        field6261++;
        this.field6262.method1523();
        this.field6250 = this.field6267.method819(false, (byte) -124);
        this.field6250.method1023(this.field6248, arg1, arg0 * 4, 92);
        this.field6248 = null;
        this.field6262 = null;
    }

    @OriginalMember(owner = "client!al", name = "b", descriptor = "(II)V", line = 190)
    public final void method2599(int arg0, int arg1) {
        this.field6262.method1529(arg0 * 4 + 3);
        if (arg1 >= -113) {
            this.field6249 = 61;
        }
        field6263++;
        this.field6262.method1526(-1);
    }

    @OriginalMember(owner = "client!al", name = "<init>", descriptor = "(Lua;IIIII)V", line = 445)
    public class460(class303 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field6256 = arg0;
        this.field6260 = arg5;
        this.field6249 = arg1;
        this.field6253 = arg4;
        this.field6251 = arg3;
        this.field6264 = new int[this.field6256.field2215 * this.field6256.field2214];
        this.field6267 = this.field6256.field4056;
        this.field6252 = arg2;
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(I[Ljava/lang/String;)[Ljava/lang/String;", line = 208)
    public static final String[] method2600(int arg0, String[] arg1) {
        field6266++;
        String[] var2 = new String[5];
        if (arg0 != -20789) {
            return null;
        }
        for (int var3 = 0; var3 < 5; var3++) {
            var2[var3] = var3 + ": ";
            if (arg1 != null && arg1[var3] != null) {
                var2[var3] = var2[var3] + arg1[var3];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(ZIII)V", line = 234)
    public final void method2601(boolean arg0, int arg1, int arg2, int arg3) {
        field6255++;
        if (!arg0) {
            this.field6248 = null;
        }
        this.field6264[this.field6256.field2214 * arg1 + arg2] = class288.method1722(this.field6264[this.field6256.field2214 * arg1 + arg2], 0x1 << arg3);
        this.field6247++;
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(IFIBI)V", line = 250)
    public final void method2602(int arg0, float arg1, int arg2, byte arg3, int arg4) {
        field6259++;
        if (arg3 != 91) {
            field6269 = true;
        }
        if (this.field6249 != -1) {
            class568 var6 = this.field6267.field9731.method1728(arg3 - 192, this.field6249);
            int var7 = var6.field7869 & 0xFF;
            if (var7 != 0 && var6.field7870 != 4) {
                int var8;
                if (arg4 < 0) {
                    var8 = 0;
                } else if (arg4 <= 127) {
                    var8 = arg4 * 131586;
                } else {
                    var8 = 16777215;
                }
                if (var7 == 256) {
                    arg0 = var8;
                } else {
                    int var10 = 256 - var7;
                    arg0 = ((arg0 & 0xFF00) * var10 + (var8 & 0xFF00) * var7 & 0xFF0000) + ((arg0 & 0xFF00FF) * var10 + (var8 & 0xFF00FF) * var7 & 0xFF00FF00) >> 8;
                }
            }
            int var11 = var6.field7863 & 0xFF;
            if (var11 != 0) {
                var11 += 256;
                int var12 = (arg0 >> 16 & 0xFF) * var11;
                if (var12 > 65535) {
                    var12 = 65535;
                }
                int var13 = ((arg0 & 0xFF00) >> 8) * var11;
                if (var13 > 65535) {
                    var13 = 65535;
                }
                int var14 = (arg0 & 0xFF) * var11;
                if (var14 > 65535) {
                    var14 = 65535;
                }
                arg0 = (var12 << 8 & 0xFF00DA) + ((var13 & 0xFF00) + (var14 >> 8));
            }
        }
        if (arg1 != 1.0F) {
            int var15 = arg0 >> 16 & 0xFF;
            int var16 = (arg0 & 0xFFCB) >> 8;
            int var17 = (int) ((float) var15 * arg1);
            int var18 = arg0 & 0xFF;
            if (var17 < 0) {
                var17 = 0;
            } else if (var17 > 255) {
                var17 = 255;
            }
            int var19 = (int) ((float) var16 * arg1);
            if (var19 < 0) {
                var19 = 0;
            } else if (var19 > 255) {
                var19 = 255;
            }
            int var20 = (int) ((float) var18 * arg1);
            if (var20 < 0) {
                var20 = 0;
            } else if (var20 > 255) {
                var20 = 255;
            }
            arg0 = var20 | var17 << 16 | var19 << 8;
        }
        this.field6262.method1529(arg2 * 4);
        if (this.field6267.field4462 == 0) {
            this.field6262.method1526((byte) arg0);
            this.field6262.method1526((byte) (arg0 >> 8));
            this.field6262.method1526((byte) (arg0 >> 16));
        } else {
            this.field6262.method1526((byte) (arg0 >> 16));
            this.field6262.method1526((byte) (arg0 >> 8));
            this.field6262.method1526((byte) arg0);
        }
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(Lur;I)V", line = 370)
    public static final void method2603(class133 arg0, int arg1) {
        if (arg1 != -12392) {
            method2603(null, 60);
        }
        class664.field9420 = arg0;
        field6268++;
    }

    @OriginalMember(owner = "client!al", name = "b", descriptor = "(I)Lch;", line = 382)
    public static final class19 method2604(int arg0) {
        if (arg0 != 65280) {
            return null;
        }
        field6258++;
        class19 var1 = (class19) class218.field2818.method2715((byte) 127);
        if (var1 != null) {
            var1.method175(30604);
            var1.method2669(-29226);
            return var1;
        }
        class19 var2;
        do {
            var2 = (class19) class108.field1301.method2715((byte) 125);
            if (var2 == null) {
                return null;
            }
            if (var2.method106(90) > class669.method3713(arg0 ^ 0xFF00)) {
                return null;
            }
            var2.method175(30604);
            var2.method2669(-29226);
        } while ((Long.MIN_VALUE & var2.field6449) == 0L);
        return var2;
    }

    @OriginalMember(owner = "client!al", name = "c", descriptor = "(II)V", line = 425)
    public final void method2605(int arg0, int arg1) {
        field6254++;
        if (arg1 != 65535) {
            this.field6256 = null;
        }
        this.field6248 = this.field6267.method1923(true, arg0 * 4, 1);
        this.field6262 = new Stream(this.field6248, 0, arg0 * 4);
    }
}
