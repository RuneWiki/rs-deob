import jaggl.OpenGL;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public abstract class class184 implements class218 {

    @OriginalMember(owner = "client!oe", name = "j", descriptor = "Ldca;")
    private class160 field2660 = class544.field7382;

    @OriginalMember(owner = "client!oe", name = "p", descriptor = "Ljg;")
    public class309 field2666;

    @OriginalMember(owner = "client!oe", name = "e", descriptor = "Z")
    private boolean field2655;

    @OriginalMember(owner = "client!oe", name = "k", descriptor = "I")
    public int field2661;

    @OriginalMember(owner = "client!oe", name = "x", descriptor = "I")
    private int field2674;

    @OriginalMember(owner = "client!oe", name = "v", descriptor = "Ltba;")
    public class147 field2672;

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "Lpn;")
    public class692 field2651;

    @OriginalMember(owner = "client!oe", name = "l", descriptor = "I")
    private int field2662;

    @OriginalMember(owner = "client!oe", name = "r", descriptor = "I")
    public static int field2668 = 2;

    @OriginalMember(owner = "client!oe", name = "f", descriptor = "Z")
    public static boolean field2656 = false;

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "I")
    public static int field2652;

    @OriginalMember(owner = "client!oe", name = "c", descriptor = "I")
    public static int field2653;

    @OriginalMember(owner = "client!oe", name = "d", descriptor = "I")
    public static int field2654;

    @OriginalMember(owner = "client!oe", name = "g", descriptor = "I")
    public static int field2657;

    @OriginalMember(owner = "client!oe", name = "h", descriptor = "I")
    public static int field2658;

    @OriginalMember(owner = "client!oe", name = "m", descriptor = "I")
    public static int field2663;

    @OriginalMember(owner = "client!oe", name = "n", descriptor = "I")
    public static int field2664;

    @OriginalMember(owner = "client!oe", name = "o", descriptor = "I")
    public static int field2665;

    @OriginalMember(owner = "client!oe", name = "s", descriptor = "I")
    public static int field2669;

    @OriginalMember(owner = "client!oe", name = "t", descriptor = "I")
    public static int field2670;

    @OriginalMember(owner = "client!oe", name = "u", descriptor = "I")
    public static int field2671;

    @OriginalMember(owner = "client!oe", name = "w", descriptor = "I")
    public static int field2673;

    @OriginalMember(owner = "client!oe", name = "y", descriptor = "I")
    public static int field2675;

    @OriginalMember(owner = "client!oe", name = "q", descriptor = "[I")
    public static int[] field2667;

    @OriginalMember(owner = "client!oe", name = "i", descriptor = "[Lui;")
    public static class209[] field2659;

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(Ldca;B)V")
    public final void method1259(class160 arg0, byte arg1) {
        if (this.field2660 != arg0) {
            this.field2660 = arg0;
            this.method1260((byte) -119);
        }
        if (arg1 < 66) {
            field2656 = true;
        }
        field2652++;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(B)V")
    private final void method1260(byte arg0) {
        field2664++;
        this.field2672.method2241(this, (byte) 44);
        int var2 = 31 % ((10 - arg0) / 36);
        if (class544.field7382 == this.field2660) {
            OpenGL.glTexParameteri(this.field2661, 10241, this.field2655 ? 9987 : 9729);
            OpenGL.glTexParameteri(this.field2661, 10240, 9729);
        } else {
            OpenGL.glTexParameteri(this.field2661, 10241, this.field2655 ? 9984 : 9728);
            OpenGL.glTexParameteri(this.field2661, 10240, 9728);
        }
    }

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "(B)V")
    private final void method1261(byte arg0) {
        if (arg0 <= 98) {
            this.field2672 = null;
        }
        if (this.field2662 > 0) {
            this.field2672.method1048(this.field2662, this.method1270(2832), -31013);
            this.field2662 = 0;
        }
        field2658++;
    }

    @OriginalMember(owner = "client!oe", name = "d", descriptor = "(I)I")
    public final int method1262(int arg0) {
        field2670++;
        if (arg0 > -111) {
            return -94;
        }
        if (class309.field4271 == this.field2666) {
            if (class46.field554 == this.field2651) {
                return 6407;
            }
            if (class129.field1851 == this.field2651) {
                return 6408;
            }
            if (class559.field7539 == this.field2651) {
                return 6406;
            }
            if (class301.field4189 == this.field2651) {
                return 6409;
            }
            if (class283.field3875 == this.field2651) {
                return 6410;
            }
            if (class309.field4277 == this.field2651) {
                return 6145;
            }
        } else if (class309.field4274 == this.field2666) {
            if (class46.field554 == this.field2651) {
                return 34843;
            }
            if (class129.field1851 == this.field2651) {
                return 34842;
            }
            if (class559.field7539 == this.field2651) {
                return 34844;
            }
            if (class301.field4189 == this.field2651) {
                return 34846;
            }
            if (class283.field3875 == this.field2651) {
                return 34847;
            }
            if (class309.field4277 == this.field2651) {
                return 6145;
            }
        } else if (class309.field4275 == this.field2666) {
            if (class46.field554 == this.field2651) {
                return 34837;
            }
            if (class129.field1851 == this.field2651) {
                return 34836;
            }
            if (class559.field7539 == this.field2651) {
                return 34838;
            }
            if (class301.field4189 == this.field2651) {
                return 34840;
            }
            if (class283.field3875 == this.field2651) {
                return 34841;
            }
            if (class309.field4277 == this.field2651) {
                return 6145;
            }
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!oe", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.method1261((byte) 116);
        field2663++;
        super.finalize();
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(I[BIII)V")
    public final void method1263(int arg0, byte[] arg1, int arg2, int arg3, int arg4) {
        field2657++;
        if (arg0 > 0 && !class588.method3342(54, arg0)) {
            throw new IllegalArgumentException("");
        } else if (arg2 <= 0 || class588.method3342(-101, arg2)) {
            int var6 = this.field2651.field9861;
            int var7 = 0;
            int var8 = arg2 > arg0 ? arg0 : arg2;
            int var9 = arg0 >> 1;
            int var10 = arg2 >> 1;
            if (arg3 != 5) {
                this.field2672 = null;
            }
            byte[] var11 = arg1;
            byte[] var12 = new byte[var9 * var10 * var6];
            while (true) {
                OpenGL.glTexImage2Dub(arg4, var7, this.method1262(-120), arg0, arg2, 0, class216.method1395(this.field2651, (byte) -107), 5121, var11, 0);
                if (var8 <= 1) {
                    return;
                }
                int var13 = arg0 * var6;
                for (int var14 = 0; var14 < var6; var14++) {
                    int var16 = var14;
                    int var17 = var14;
                    int var18 = var13 + var14;
                    for (int var19 = 0; var19 < var10; var19++) {
                        for (int var20 = 0; var20 < var9; var20++) {
                            byte var21 = var11[var17];
                            int var22 = var6 + var17;
                            int var23 = var11[var22] + var21;
                            int var24 = var11[var18] + var23;
                            var17 = var6 + var22;
                            int var25 = var6 + var18;
                            int var26 = var11[var25] + var24;
                            var12[var16] = (byte) (var26 >> 2);
                            var18 = var6 + var25;
                            var16 += var6;
                        }
                        var17 += var13;
                        var18 += var13;
                    }
                }
                byte[] var15 = var12;
                var12 = var11;
                arg0 = var9;
                arg2 = var10;
                var11 = var15;
                var9 >>= 0x1;
                var10 >>= 0x1;
                var7++;
                var8 >>= 0x1;
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(IIIZ[I)V")
    public final void method1264(int arg0, int arg1, int arg2, boolean arg3, int[] arg4) {
        field2675++;
        if (arg2 > 0 && !class588.method3342(107, arg2)) {
            throw new IllegalArgumentException("");
        } else if (arg1 > 0 && !class588.method3342(-116, arg1)) {
            throw new IllegalArgumentException("");
        } else if (class129.field1851 == this.field2651) {
            int var6 = 0;
            int var7 = arg2 < arg1 ? arg2 : arg1;
            int var8 = arg2 >> 1;
            if (!arg3) {
                this.method1267(-84, -127);
            }
            int var9 = arg1 >> 1;
            int[] var10 = arg4;
            int[] var11 = new int[var8 * var9];
            while (true) {
                OpenGL.glTexImage2Di(arg0, var6, this.method1262(-113), arg2, arg1, 0, 32993, this.field2672.field2176, var10, 0);
                if (var7 <= 1) {
                    return;
                }
                int var12 = 0;
                int var13 = 0;
                int var14 = var13 + arg2;
                for (int var15 = 0; var15 < var9; var15++) {
                    for (int var17 = 0; var17 < var8; var17++) {
                        int var18 = var10[var13++];
                        int var19 = var10[var13++];
                        int var20 = var10[var14++];
                        int var21 = var10[var14++];
                        int var22 = var18 >> 24 & 0xFF;
                        int var23 = var18 >> 8 & 0xFF;
                        int var24 = var18 & 0xFF;
                        int var25 = (var18 & 0xFFB3AA) >> 16;
                        int var26 = (var19 >> 16 & 0xFF) + var25;
                        int var27 = ((var19 & 0xFF17) >> 8) + var23;
                        int var28 = (var19 >> 24 & 0xFF) + var22;
                        int var29 = (var19 & 0xFF) + var24;
                        int var30 = ((var20 & 0xFF7B) >> 8) + var27;
                        int var31 = (var20 >> 24 & 0xFF) + var28;
                        int var32 = (var20 >> 16 & 0xFF) + var26;
                        int var33 = (var20 & 0xFF) + var29;
                        int var34 = ((var21 & 0xFF948F) >> 16) + var32;
                        int var35 = (var21 >> 24 & 0xFF) + var31;
                        int var36 = (var21 >> 8 & 0xFF) + var30;
                        int var37 = (var21 & 0xFF) + var33;
                        var11[var12++] = class647.method3617(class647.method3617(class647.method3617(class136.method950(1020, var34) << 14, class136.method950(var35 << 22, -16777216)), class136.method950(1020, var36) << 6), class136.method950(var37, 1020) >> 2);
                    }
                    var13 += arg2;
                    var14 += arg2;
                }
                int[] var16 = var11;
                var11 = var10;
                arg1 = var9;
                arg2 = var8;
                var10 = var16;
                var8 >>= 0x1;
                var6++;
                var9 >>= 0x1;
                var7 >>= 0x1;
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "(Z)V")
    public static final void method1265(boolean arg0) {
        field2665++;
        if (!arg0) {
            field2659 = null;
        }
        class663 var1 = class120.field1658;
        synchronized (class120.field1658) {
            class120.field1658.method3755(19713);
        }
    }

    @OriginalMember(owner = "client!oe", name = "e", descriptor = "(I)V")
    public static void method1266(int arg0) {
        field2667 = null;
        int var1 = 26 / ((arg0 - 37) / 54);
        field2659 = null;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(II)V")
    private final void method1267(int arg0, int arg1) {
        this.field2672.field5279 -= arg1;
        field2654++;
        this.field2672.field5279 += this.method1270(2832);
        if (arg0 != 104) {
            field2659 = null;
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(B[FIII)V")
    public final void method1268(byte arg0, float[] arg1, int arg2, int arg3, int arg4) {
        field2671++;
        if (arg3 > 0 && !class588.method3342(36, arg3)) {
            throw new IllegalArgumentException("");
        } else if (arg2 <= 0 || class588.method3342(-96, arg2)) {
            int var6 = this.field2651.field9861;
            int var7 = 0;
            int var8 = arg3 >= arg2 ? arg2 : arg3;
            int var9 = arg3 >> 1;
            int var10 = arg2 >> 1;
            float[] var11 = arg1;
            float[] var12 = new float[var9 * var10 * var6];
            int var13 = -75 / ((arg0 + 13) / 35);
            while (true) {
                OpenGL.glTexImage2Df(arg4, var7, this.method1262(-121), arg3, arg2, 0, class216.method1395(this.field2651, (byte) -76), 5126, var11, 0);
                if (var8 <= 1) {
                    return;
                }
                int var14 = arg3 * var6;
                float[] var15 = var12;
                for (int var16 = 0; var16 < var6; var16++) {
                    int var17 = var16;
                    int var18 = var16;
                    int var19 = var14 + var16;
                    for (int var20 = 0; var20 < var10; var20++) {
                        for (int var21 = 0; var21 < var9; var21++) {
                            float var22 = var11[var18];
                            int var23 = var6 + var18;
                            float var24 = var11[var23] + var22;
                            float var25 = var11[var19] + var24;
                            var18 = var6 + var23;
                            int var26 = var6 + var19;
                            float var27 = var11[var26] + var25;
                            var12[var17] = var27 * 0.25F;
                            var19 = var6 + var26;
                            var17 += var6;
                        }
                        var18 += var14;
                        var19 += var14;
                    }
                }
                var12 = var11;
                var11 = var15;
                arg2 = var10;
                arg3 = var9;
                var8 >>= 0x1;
                var9 >>= 0x1;
                var10 >>= 0x1;
                var7++;
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!oe", name = "c", descriptor = "(B)V")
    public static final void method1269(byte arg0) {
        field2669++;
        if (class588.field8258 < 102) {
            class588.field8258 += 6;
        }
        if (class399.field5603 != -1 && class577.method3295((byte) 15) > class11.field115) {
            for (int var1 = class399.field5603; var1 < class495.field6746.length; var1++) {
                if (class495.field6746[var1].startsWith("pause")) {
                    int var2 = 5;
                    try {
                        var2 = Integer.parseInt(class495.field6746[var1].substring(6));
                    } catch (Exception var13) {
                    }
                    class26.method251("Pausing for " + var2 + " seconds...", (byte) -102);
                    class399.field5603 = var1 + 1;
                    class11.field115 = (long) (var2 * 1000) + class577.method3295((byte) 15);
                    return;
                }
                class187.field2713 = class495.field6746[var1];
                class301.method1835((byte) -8, false);
            }
            class399.field5603 = -1;
        }
        if (class26.field322 != 0) {
            class286.field3942 -= class26.field322 * 5;
            if (class487.field6692 <= class286.field3942) {
                class286.field3942 = class487.field6692 - 1;
            }
            if (class286.field3942 < 0) {
                class286.field3942 = 0;
            }
            class26.field322 = 0;
        }
        for (int var3 = 0; var3 < class356.field4730; var3++) {
            class305 var4 = class378.field5057[var3];
            int var5 = var4.method1852(27648);
            char var6 = var4.method1853(arg0 - 29551);
            int var7 = var4.method1854((byte) 87);
            if (var5 == 84) {
                class301.method1835((byte) -8, false);
            }
            if (var5 == 80) {
                class301.method1835((byte) -8, true);
            } else if (var5 == 66 && (var7 & 0x4) != 0) {
                if (class65.field852 != null) {
                    String var8 = "";
                    for (int var9 = class61.field687.length - 1; var9 >= 0; var9--) {
                        if (class61.field687[var9] != null && class61.field687[var9].length() > 0) {
                            var8 = var8 + class61.field687[var9] + '\n';
                        }
                    }
                    class65.field852.setContents(new StringSelection(var8), null);
                }
            } else if (var5 == 67 && (var7 & 0x4) != 0) {
                if (class65.field852 != null) {
                    Transferable var10 = class65.field852.getContents(null);
                    if (var10 != null) {
                        try {
                            String var11 = (String) var10.getTransferData(DataFlavor.stringFlavor);
                            if (var11 != null) {
                                String[] var12 = class48.method383(var11, 1, '\n');
                                class57.method478((byte) 70, var12);
                            }
                        } catch (Exception var14) {
                        }
                    }
                }
            } else if (var5 == 85 && class513.field7039 > 0) {
                class187.field2713 = class187.field2713.substring(0, class513.field7039 - 1) + class187.field2713.substring(class513.field7039);
                class513.field7039--;
            } else if (var5 == 101 && class513.field7039 < class187.field2713.length()) {
                class187.field2713 = class187.field2713.substring(0, class513.field7039) + class187.field2713.substring(class513.field7039 + 1);
            } else if (var5 == 96 && class513.field7039 > 0) {
                class513.field7039--;
            } else if (var5 == 97 && class513.field7039 < class187.field2713.length()) {
                class513.field7039++;
            } else if (var5 == 102) {
                class513.field7039 = 0;
            } else if (var5 == 103) {
                class513.field7039 = class187.field2713.length();
            } else if (var5 == 104 && class452.field6235 < class61.field687.length) {
                class452.field6235++;
                class31.method297(0);
                class513.field7039 = class187.field2713.length();
            } else if (var5 == 105 && class452.field6235 > 0) {
                class452.field6235--;
                class31.method297(0);
                class513.field7039 = class187.field2713.length();
            } else if (class73.method579(var6, (byte) 50) || var6 == '\\' || var6 == '/' || var6 == '.' || var6 == ':' || var6 == ',' || var6 == ' ' || var6 == '_' || var6 == '-' || var6 == '+' || var6 == '[' || var6 == ']') {
                class187.field2713 = class187.field2713.substring(0, class513.field7039) + class378.field5057[var3].method1853(-29475) + class187.field2713.substring(class513.field7039);
                class513.field7039++;
            }
        }
        class356.field4730 = 0;
        class390.field5523 = 0;
        class314.method1905(arg0 ^ 0xFFFFFFD7);
        if (arg0 != 76) {
            field2668 = -123;
        }
    }

    @OriginalMember(owner = "client!oe", name = "f", descriptor = "(I)I")
    private final int method1270(int arg0) {
        field2673++;
        int var2 = this.field2666.field4267 * this.field2674 * this.field2651.field9861;
        if (arg0 == 2832) {
            return this.field2655 ? var2 * 4 / 3 : var2;
        } else {
            return 105;
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(Z)V")
    public final void method1271(boolean arg0) {
        field2653++;
        if (arg0) {
            this.field2662 = -116;
        }
        int var2 = this.field2672.method2216(128);
        int var3 = this.field2672.field2171[var2];
        if (this.field2661 != var3) {
            if (var3 != 0) {
                OpenGL.glBindTexture(var3, 0);
                OpenGL.glDisable(var3);
            }
            OpenGL.glEnable(this.field2661);
            this.field2672.field2171[var2] = this.field2661;
        }
        OpenGL.glBindTexture(this.field2661, this.field2662);
    }

    @OriginalMember(owner = "client!oe", name = "<init>", descriptor = "(Ltba;ILpn;Ljg;IZ)V")
    public class184(class147 arg0, int arg1, class692 arg2, class309 arg3, int arg4, boolean arg5) {
        this.field2666 = arg3;
        this.field2655 = arg5;
        this.field2661 = arg1;
        this.field2674 = arg4;
        this.field2672 = arg0;
        this.field2651 = arg2;
        OpenGL.glGenTextures(1, class518.field7054, 0);
        this.field2662 = class518.field7054[0];
        this.method1260((byte) 71);
        this.method1267(104, 0);
    }
}
