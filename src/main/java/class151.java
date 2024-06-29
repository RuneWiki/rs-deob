import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gf")
public class class151 {

    @OriginalMember(owner = "client!gf", name = "i", descriptor = "Z")
    public boolean field2120 = true;

    @OriginalMember(owner = "client!gf", name = "m", descriptor = "I")
    public int field2124 = -1;

    @OriginalMember(owner = "client!gf", name = "q", descriptor = "I")
    private int field2128 = 0;

    @OriginalMember(owner = "client!gf", name = "p", descriptor = "I")
    public int field2127 = 128;

    @OriginalMember(owner = "client!gf", name = "o", descriptor = "Z")
    public static boolean field2126 = false;

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "I")
    public static int field2112;

    @OriginalMember(owner = "client!gf", name = "c", descriptor = "I")
    public static int field2114;

    @OriginalMember(owner = "client!gf", name = "d", descriptor = "I")
    public static int field2115;

    @OriginalMember(owner = "client!gf", name = "e", descriptor = "I")
    public int field2116;

    @OriginalMember(owner = "client!gf", name = "f", descriptor = "I")
    public int field2117;

    @OriginalMember(owner = "client!gf", name = "g", descriptor = "I")
    public int field2118;

    @OriginalMember(owner = "client!gf", name = "j", descriptor = "I")
    public static int field2121;

    @OriginalMember(owner = "client!gf", name = "k", descriptor = "I")
    public int field2122;

    @OriginalMember(owner = "client!gf", name = "l", descriptor = "I")
    public static int field2123;

    @OriginalMember(owner = "client!gf", name = "n", descriptor = "I")
    public static int field2125;

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "Lra;")
    public static class57 field2113;

    @OriginalMember(owner = "client!gf", name = "h", descriptor = "Lra;")
    public static class57 field2119;

    @OriginalMember(owner = "client!gf", name = "r", descriptor = "Lra;")
    public static class57 field2129;

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(IIIII)V")
    public static final void method899(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2123++;
        int var5 = 0;
        int var6 = arg0;
        int var7 = -arg0;
        int var8 = -1;
        int var9 = class115.method640((byte) -67, class128.field1785, arg0 + arg1, class143.field2029);
        int var10 = class115.method640((byte) -116, class128.field1785, arg1 - arg0, class143.field2029);
        class105.method564(arg4, var10, 0, class318.field4522[arg3], var9);
        while (var5 < var6) {
            var8 += 2;
            var7 += var8;
            if (var7 > 0) {
                var6--;
                var7 -= var6 << 1;
                int var11 = arg3 - var6;
                int var12 = arg3 + var6;
                if (class20.field209 <= var12 && class407.field5914 >= var11) {
                    int var13 = class115.method640((byte) -105, class128.field1785, arg1 + var5, class143.field2029);
                    int var14 = class115.method640((byte) -110, class128.field1785, arg1 - var5, class143.field2029);
                    if (class407.field5914 >= var12) {
                        class105.method564(arg4, var14, 0, class318.field4522[var12], var13);
                    }
                    if (class20.field209 <= var11) {
                        class105.method564(arg4, var14, 0, class318.field4522[var11], var13);
                    }
                }
            }
            var5++;
            int var15 = arg3 - var5;
            int var16 = arg3 + var5;
            if (class20.field209 <= var16 && class407.field5914 >= var15) {
                int var17 = class115.method640((byte) -123, class128.field1785, arg1 + var6, class143.field2029);
                int var18 = class115.method640((byte) -122, class128.field1785, arg1 - var6, class143.field2029);
                if (var16 <= class407.field5914) {
                    class105.method564(arg4, var18, 0, class318.field4522[var16], var17);
                }
                if (var15 >= class20.field209) {
                    class105.method564(arg4, var18, arg2 - 255, class318.field4522[var15], var17);
                }
            }
        }
        if (arg2 != 255) {
            field2126 = false;
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(I)V")
    public static void method900(int arg0) {
        field2119 = null;
        field2113 = null;
        field2129 = null;
        if (arg0 != -4645) {
            field2126 = true;
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(Lbk;IIZ)V")
    private final void method901(class211 arg0, int arg1, int arg2, boolean arg3) {
        if (!arg3) {
            field2119 = null;
        }
        field2115++;
        if (arg2 == 1) {
            this.field2128 = arg0.method1353(89);
            this.method904((byte) 27, this.field2128);
        } else if (arg2 == 2) {
            this.field2124 = arg0.method1355(32136);
            if (this.field2124 == 65535) {
                this.field2124 = -1;
                return;
            }
        } else {
            if (arg2 == 3) {
                this.field2127 = arg0.method1355(32136);
            } else if (arg2 == 4) {
                this.field2120 = false;
                return;
            }
            return;
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(ZZ)V")
    public static final void method902(boolean arg0, boolean arg1) {
        field2121++;
        if (!arg0) {
            field2129 = null;
        }
        class78.method442(arg1, class38.field389, (byte) 126, class222.field3039, class424.field6086);
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(Len;JI)V")
    public static final void method903(class174 arg0, long arg1, int arg2) {
        class152.field2132 = class101.field1143;
        class102.field1161 = arg2;
        field2112++;
        class101.field1143 = 0;
        long var4 = class203.method1299((byte) 5);
        for (class389 var6 = (class389) class268.field3774.method1604((byte) -127); var6 != null; var6 = (class389) class268.field3774.method1612(arg2 - 1)) {
            if (var6.method2490(arg0, arg1)) {
                class102.field1161++;
            }
        }
        if (class350.field5110 && (arg1 % 100L) == 0L) {
            System.out.println("Particle system count: " + class268.field3774.method1609(10196) + ", running: " + class102.field1161 + ". Particles: " + class101.field1143 + ". Time taken: " + (class203.method1299((byte) 5) - var4) + "ms");
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(BI)V")
    private final void method904(byte arg0, int arg1) {
        field2114++;
        if (arg0 <= 11) {
            method900(28);
        }
        double var3 = (double) (arg1 >> 16 & 0xFF) / 256.0D;
        double var5 = (double) (arg1 >> 8 & 0xFF) / 256.0D;
        double var7 = (double) (arg1 & 0xFF) / 256.0D;
        double var9 = var3;
        if (var3 > var5) {
            var9 = var5;
        }
        if (var9 > var7) {
            var9 = var7;
        }
        double var11 = var3;
        if (var3 < var5) {
            var11 = var5;
        }
        if (var7 > var11) {
            var11 = var7;
        }
        double var13 = 0.0D;
        double var15 = 0.0D;
        double var17 = (var9 + var11) / 2.0D;
        if (var9 != var11) {
            if (var17 < 0.5D) {
                var15 = (var11 - var9) / (var9 + var11);
            }
            if (var17 >= 0.5D) {
                var15 = (var11 - var9) / (2.0D - var11 - var9);
            }
            if (var3 == var11) {
                var13 = (var5 - var7) / (var11 - var9);
            } else if (var5 == var11) {
                var13 = (var7 - var3) / (var11 - var9) + 2.0D;
            } else if (var7 == var11) {
                var13 = (var3 - var5) / (var11 - var9) + 4.0D;
            }
        }
        this.field2116 = (int) (var15 * 256.0D);
        double var19 = var13 / 6.0D;
        this.field2118 = (int) (var17 * 256.0D);
        if ((var17 > 0.5D)) {
            this.field2117 = (int) ((1.0D - var17) * var15 * 512.0D);
        } else {
            this.field2117 = (int) (var15 * var17 * 512.0D);
        }
        if (this.field2116 < 0) {
            this.field2116 = 0;
        } else if (this.field2116 > 255) {
            this.field2116 = 255;
        }
        if (this.field2118 < 0) {
            this.field2118 = 0;
        } else if (this.field2118 > 255) {
            this.field2118 = 255;
        }
        if (this.field2117 < 1) {
            this.field2117 = 1;
        }
        this.field2122 = (int) ((double) this.field2117 * var19);
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(ILbk;I)V")
    public final void method905(int arg0, class211 arg1, int arg2) {
        field2125++;
        if (arg0 != -1) {
            this.field2120 = false;
        }
        while (true) {
            int var4 = arg1.method1342((byte) -128);
            if (var4 == 0) {
                return;
            }
            this.method901(arg1, arg2, var4, true);
        }
    }
}
