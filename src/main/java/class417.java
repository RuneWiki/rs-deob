import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nn")
public class class417 {

    @OriginalMember(owner = "client!nn", name = "c", descriptor = "B")
    public byte field6241;

    @OriginalMember(owner = "client!nn", name = "d", descriptor = "[I")
    public int[] field6242;

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "[I")
    public int[] field6239;

    @OriginalMember(owner = "client!nn", name = "k", descriptor = "[I")
    public int[] field6249;

    @OriginalMember(owner = "client!nn", name = "p", descriptor = "B")
    public byte field6254;

    @OriginalMember(owner = "client!nn", name = "e", descriptor = "S")
    public short field6243;

    @OriginalMember(owner = "client!nn", name = "n", descriptor = "S")
    public short field6252;

    @OriginalMember(owner = "client!nn", name = "j", descriptor = "S")
    public short field6248;

    @OriginalMember(owner = "client!nn", name = "q", descriptor = "[S")
    public short[] field6255;

    @OriginalMember(owner = "client!nn", name = "b", descriptor = "[S")
    public short[] field6240;

    @OriginalMember(owner = "client!nn", name = "g", descriptor = "S")
    public short field6245;

    @OriginalMember(owner = "client!nn", name = "i", descriptor = "[S")
    public short[] field6247;

    @OriginalMember(owner = "client!nn", name = "l", descriptor = "Lqe;")
    public static class469 field6250 = new class469(17, -1);

    @OriginalMember(owner = "client!nn", name = "o", descriptor = "Lqe;")
    public static class469 field6253 = new class469(84, 2);

    @OriginalMember(owner = "client!nn", name = "f", descriptor = "I")
    public static int field6244;

    @OriginalMember(owner = "client!nn", name = "h", descriptor = "I")
    public static int field6246;

    @OriginalMember(owner = "client!nn", name = "m", descriptor = "I")
    public static int field6251;

    @OriginalMember(owner = "client!nn", name = "r", descriptor = "I")
    public static int field6256;

    // $FF: synthetic field
    @OriginalMember(owner = "client!nn", name = "s", descriptor = "Ljava/lang/Class;")
    public static Class field6257;

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method2632(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field6246++;
        if (arg0 <= 33) {
            field6253 = null;
        }
        if (arg7 < 0 || arg2 < 0 || arg7 >= class194.field2946 - 1 || class255.field3656 - 1 <= arg2) {
            return;
        }
        if (class80.field1136 == null) {
            return;
        }
        if (arg4 == 0) {
            class721 var8 = (class721) class608.method3529(arg1, arg7, arg2);
            class721 var9 = (class721) class373.method2399(arg1, arg7, arg2);
            if (var8 != null && arg6 != 2) {
                if ((var8 instanceof class507)) {
                    ((class507) var8).field7226.method902(arg5, (byte) -110);
                } else {
                    class548.method3205(arg1, arg5, arg2, arg3, arg4, 16329, arg6, var8.method317(114), arg7);
                }
            }
            if (var9 != null) {
                if (!(var9 instanceof class507)) {
                    class548.method3205(arg1, arg5, arg2, arg3, arg4, 16329, arg6, var9.method317(115), arg7);
                    return;
                }
                ((class507) var9).field7226.method902(arg5, (byte) -110);
                return;
            }
            return;
        }
        if (arg4 == 1) {
            class721 var10 = (class721) class245.method1634(arg1, arg7, arg2);
            if (var10 != null) {
                if (!(var10 instanceof class78)) {
                    int var11 = var10.method317(127);
                    if (arg6 != 4 && arg6 != 5) {
                        if (arg6 != 6) {
                            if (arg6 == 7) {
                                class548.method3205(arg1, arg5, arg2, (arg3 + 2 & 0x3) + 4, arg4, 16329, 4, var11, arg7);
                            } else if (arg6 == 8) {
                                class548.method3205(arg1, arg5, arg2, arg3 + 4, arg4, 16329, 4, var11, arg7);
                                class548.method3205(arg1, arg5, arg2, (arg3 + 2 & 0x3) + 4, arg4, 16329, 4, var11, arg7);
                                return;
                            }
                            return;
                        }
                        class548.method3205(arg1, arg5, arg2, arg3 + 4, arg4, 16329, 4, var11, arg7);
                        return;
                    }
                    class548.method3205(arg1, arg5, arg2, arg3, arg4, 16329, 4, var11, arg7);
                    return;
                }
                ((class78) var10).field1092.method902(arg5, (byte) -110);
                return;
            }
            return;
        }
        if (arg4 != 2) {
            if (arg4 == 3) {
                class721 var12 = (class721) class577.method3340(arg1, arg7, arg2);
                if (var12 != null) {
                    if (!(var12 instanceof class745)) {
                        class548.method3205(arg1, arg5, arg2, arg3, arg4, 16329, arg6, var12.method317(127), arg7);
                        return;
                    }
                    ((class745) var12).field10432.method902(arg5, (byte) -110);
                    return;
                }
            }
            return;
        }
        class721 var13 = (class721) class755.method4208(arg1, arg7, arg2, field6257 == null ? (field6257 = method2636("jn")) : field6257);
        if (var13 == null) {
            return;
        }
        if (arg6 == 11) {
            arg6 = 10;
        }
        if (!(var13 instanceof class734)) {
            class548.method3205(arg1, arg5, arg2, arg3, arg4, 16329, arg6, var13.method317(115), arg7);
            return;
        }
        ((class734) var13).field10277.method902(arg5, (byte) -110);
        return;
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(ZIIII)V")
    public static final void method2633(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        field6256++;
        class56.method392(-1);
        class533.field7669 = 0L;
        int var5 = class756.method4219((byte) 8);
        if (arg2 == 3 || var5 == 3) {
            arg0 = true;
        }
        if (arg4 == 4) {
            if (!class736.field10316.method532()) {
                arg0 = true;
            }
            class602.method3500(arg3, var5, arg4 + 100, arg2, arg1, arg0);
        }
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(B)V")
    public static final void method2634(byte arg0) {
        if (class149.field2330 == null || class89.field1268 == null) {
            class89.field1268 = new int[256];
            class149.field2330 = new int[256];
            for (int var1 = 0; var1 < 256; var1++) {
                double var2 = (double) var1 / 255.0D * 6.283185307179586D;
                class149.field2330[var1] = (int) (Math.sin(var2) * 4096.0D);
                class89.field1268[var1] = (int) (Math.cos(var2) * 4096.0D);
            }
        }
        field6244++;
        if (arg0 != -118) {
            method2634((byte) 95);
        }
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(I)V")
    public static void method2635(int arg0) {
        field6250 = null;
        field6253 = null;
        if (arg0 >= -92) {
            field6253 = null;
        }
    }

    @OriginalMember(owner = "client!nn", name = "<init>", descriptor = "(IIIIIIIIIIIIII)V")
    public class417(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13) {
        this.field6241 = (byte) arg0;
        this.field6242 = new int[4];
        this.field6239 = new int[4];
        this.field6249 = new int[4];
        this.field6254 = (byte) arg1;
        this.field6249[2] = arg4;
        this.field6249[3] = arg5;
        this.field6249[1] = arg3;
        this.field6249[0] = arg2;
        this.field6242[2] = arg8;
        this.field6242[1] = arg7;
        this.field6242[3] = arg9;
        this.field6242[0] = arg6;
        this.field6243 = (short) (arg2 >> class459.field6769);
        this.field6239[1] = arg11;
        this.field6239[0] = arg10;
        this.field6239[3] = arg13;
        this.field6239[2] = arg12;
        this.field6252 = (short) (arg4 >> class459.field6769);
        this.field6248 = (short) (arg10 >> class459.field6769);
        this.field6255 = new short[4];
        this.field6240 = new short[4];
        this.field6245 = (short) (arg12 >> class459.field6769);
        this.field6247 = new short[4];
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method2636(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
