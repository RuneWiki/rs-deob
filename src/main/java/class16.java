import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public abstract class class16 extends class113 {

    @OriginalMember(owner = "client!cc", name = "p", descriptor = "Lhb;")
    public static class44 field309 = class102.method810("@gr2@", -28606);

    @OriginalMember(owner = "client!cc", name = "m", descriptor = "Z")
    public static boolean field306 = false;

    @OriginalMember(owner = "client!cc", name = "q", descriptor = "Z")
    public static boolean field310 = false;

    @OriginalMember(owner = "client!cc", name = "x", descriptor = "Lhb;")
    private static class44 field317 = class102.method810(" ", -28606);

    @OriginalMember(owner = "client!cc", name = "w", descriptor = "I")
    public static int field316 = 0;

    @OriginalMember(owner = "client!cc", name = "y", descriptor = "Lhb;")
    public static class44 field318 = field317;

    @OriginalMember(owner = "client!cc", name = "C", descriptor = "Ljava/lang/Object;")
    public static Object field322 = new Object();

    @OriginalMember(owner = "client!cc", name = "G", descriptor = "[I")
    public static int[] field326 = new int[99];

    @OriginalMember(owner = "client!cc", name = "I", descriptor = "Lhb;")
    public static class44 field328;

    @OriginalMember(owner = "client!cc", name = "n", descriptor = "I")
    public static int field307;

    @OriginalMember(owner = "client!cc", name = "r", descriptor = "I")
    public static int field311;

    @OriginalMember(owner = "client!cc", name = "s", descriptor = "I")
    public static int field312;

    @OriginalMember(owner = "client!cc", name = "t", descriptor = "I")
    public static int field313;

    @OriginalMember(owner = "client!cc", name = "u", descriptor = "I")
    public static int field314;

    @OriginalMember(owner = "client!cc", name = "v", descriptor = "I")
    public static int field315;

    @OriginalMember(owner = "client!cc", name = "z", descriptor = "I")
    public static int field319;

    @OriginalMember(owner = "client!cc", name = "A", descriptor = "I")
    public static int field320;

    @OriginalMember(owner = "client!cc", name = "B", descriptor = "I")
    public static int field321;

    @OriginalMember(owner = "client!cc", name = "D", descriptor = "I")
    public static int field323;

    @OriginalMember(owner = "client!cc", name = "H", descriptor = "I")
    public static int field327;

    @OriginalMember(owner = "client!cc", name = "F", descriptor = "Lca;")
    public static class14 field325;

    @OriginalMember(owner = "client!cc", name = "o", descriptor = "Lne;")
    public static class83 field308;

    @OriginalMember(owner = "client!cc", name = "E", descriptor = "[I")
    public static int[] field324;

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 99; var1++) {
            int var2 = var1 + 1;
            int var3 = (int) (Math.pow(2.0D, (double) var2 / 7.0D) * 300.0D + (double) var2);
            var0 += var3;
            field326[var1] = var0 / 4;
        }
        field328 = class102.method810("m-Ochte sich mit Ihnen duellieren)3", -28606);
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(JIBI)V", line = 8)
    public final void method106(long arg0, int arg1, byte arg2, int arg3) {
        int var6 = (int) ((double) arg1 * Math.pow(0.1D, (double) arg3 * 5.0E-4D) + 0.5D);
        if (class129.field3096 != var6) {
            class129.field3096 = var6;
            for (int var7 = 0; var7 < 16; var7++) {
                int var8 = method112(var7);
                this.method50(var7 + 176, 7, var8 >> 7, arg0);
                this.method50(var7 + 176, 39, var8 & 0x7F, arg0);
            }
        }
        int var9 = 93 / ((arg2 - 63) / 46);
        field315++;
    }

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "(IIIJ)Z", line = 51)
    public final boolean method107(int arg0, int arg1, int arg2, long arg3) {
        if ((arg0 & 0xE0) == 128) {
            int var6 = 0x1 << (arg0 & 0xF);
            int var7 = class11.field217[arg1];
            if (arg0 < 144 || arg2 == 0) {
                class11.field217[arg1] = var7 & ~var6;
            } else if ((var7 & var6) == 0) {
                class11.field217[arg1] = var7 | var6;
            } else {
                this.method50(arg0, arg1, 0, arg3);
            }
            return false;
        }
        if ((arg0 & 0xF0) == 176) {
            if (arg1 == 121) {
                this.method50(arg0, arg1, arg2, arg3);
                int var8 = arg0 & 0xF;
                class39.field884[var8] = 12800;
                int var9 = method112(var8);
                this.method50(arg0, 7, var9 >> 7, arg3);
                this.method50(arg0, 39, var9 & 0x7F, arg3);
                return true;
            }
            if (arg1 == 7 || arg1 == 39) {
                int var10 = arg0 & 0xF;
                if (arg1 == 7) {
                    class39.field884[var10] = (arg2 << 7) + (class39.field884[var10] & 0x7F);
                } else {
                    class39.field884[var10] = (class39.field884[var10] & 0x3F80) + arg2;
                }
                int var11 = method112(var10);
                this.method50(arg0, 7, var11 >> 7, arg3);
                this.method50(arg0, 39, var11 & 0x7F, arg3);
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(JIB)V", line = 115)
    public final void method108(long arg0, int arg1, byte arg2) {
        field312++;
        class129.field3096 = arg1;
        for (int var5 = 0; var5 < 16; var5++) {
            class39.field884[var5] = 12800;
        }
        if (arg2 > -123) {
            this.method108(-119L, -35, (byte) 98);
        }
        for (int var6 = 0; var6 < 16; var6++) {
            int var7 = method112(var6);
            this.method50(var6 + 176, 7, var7 >> 7, arg0);
            this.method50(var6 + 176, 39, var7 & 0x7F, arg0);
        }
    }

    @OriginalMember(owner = "client!cc", name = "e", descriptor = "(I)V", line = 146)
    public static void method109(int arg0) {
        field325 = null;
        field317 = null;
        if (arg0 != -31524) {
            return;
        }
        field309 = null;
        field322 = null;
        field328 = null;
        field318 = null;
        field308 = null;
        field326 = null;
        field324 = null;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(JI)V", line = 176)
    public final void method110(long arg0, int arg1) {
        for (int var4 = 0; var4 < 128; var4++) {
            int var11 = class11.field217[var4];
            class11.field217[var4] = 0;
            for (int var12 = 0; var12 < 16; var12++) {
                if ((var11 & 0x1 << var12) != 0) {
                    this.method50(var12 + 144, var4, 0, arg0);
                }
            }
        }
        for (int var5 = 0; var5 < 16; var5++) {
            this.method50(var5 + 176, 123, 0, arg0);
        }
        field313++;
        for (int var6 = 0; var6 < 16; var6++) {
            this.method50(var6 + 176, 120, 0, arg0);
        }
        for (int var7 = 0; var7 < 16; var7++) {
            this.method50(var7 + 176, 121, 0, arg0);
        }
        for (int var8 = 0; var8 < 16; var8++) {
            this.method50(var8 + 176, 0, 0, arg0);
        }
        if (arg1 >= -92) {
            return;
        }
        for (int var9 = 0; var9 < 16; var9++) {
            this.method50(var9 + 176, 32, 0, arg0);
        }
        for (int var10 = 0; var10 < 16; var10++) {
            this.method50(var10 + 192, 0, 0, arg0);
        }
    }

    @OriginalMember(owner = "client!cc", name = "f", descriptor = "(I)V", line = 259)
    public static final void method111(int arg0) {
        field320++;
        class14.field271.method335((byte) 38);
        if (arg0 <= -40) {
            class94.field2382.method335((byte) -128);
            class116.field2842.method335((byte) 98);
        }
    }

    @OriginalMember(owner = "client!cc", name = "g", descriptor = "(I)I", line = 282)
    private static final int method112(int arg0) {
        int var1 = class39.field884[arg0];
        int var2 = (class129.field3096 * var1 >> 8) * var1;
        return (int) (Math.sqrt((double) var2) + 0.5D);
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(IILhc;I)V", line = 287)
    public static final void method113(int arg0, int arg1, class45 arg2, int arg3) {
        int var4 = arg3 * arg3 + arg0 * arg0;
        if (var4 > 4225 && var4 < 90000) {
            int var5 = class85.field2176 + class52.field1284 & 0x7FF;
            int var6 = class24.field557[var5];
            int var7 = var6 * 256 / (class4.field94 + 256);
            int var8 = class24.field554[var5];
            int var9 = var8 * 256 / (class4.field94 + 256);
            int var10 = arg0 * var7 + arg3 * var9 >> 16;
            int var11 = arg0 * var9 - arg3 * var7 >> 16;
            double var12 = Math.atan2((double) var10, (double) var11);
            int var14 = (int) (Math.sin(var12) * 63.0D);
            int var15 = (int) (Math.cos(var12) * 57.0D);
            class92.field2350.method422(var14 + 94 + 4 - 10, 83 - (var15 - -20), 20, 20, 15, 15, var12, 256);
        } else {
            class2.method16(arg0, arg2, arg3, (byte) -123);
        }
        if (arg1 >= -91) {
            method114(-124);
        }
        field307++;
    }

    @OriginalMember(owner = "client!cc", name = "h", descriptor = "(I)V", line = 325)
    public static final void method114(int arg0) {
        field323++;
        class53.field1304.method699(false);
        int var1 = class53.field1304.method700(8, -125);
        if (var1 < class125.field3036) {
            for (int var2 = var1; var2 < class125.field3036; var2++) {
                class64.field1614[class21.field441++] = class100.field2515[var2];
            }
        }
        if (class125.field3036 < var1) {
            throw new RuntimeException("gnpov1");
        }
        class125.field3036 = 0;
        if (arg0 >= -74) {
            return;
        }
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = class100.field2515[var3];
            class46 var5 = class116.field2845[var4];
            int var6 = class53.field1304.method700(1, 119);
            if (var6 == 0) {
                class100.field2515[class125.field3036++] = var4;
                var5.field1345 = class2.field73;
            } else {
                int var7 = class53.field1304.method700(2, -58);
                if (var7 == 0) {
                    class100.field2515[class125.field3036++] = var4;
                    var5.field1345 = class2.field73;
                    class96.field2446[class81.field2080++] = var4;
                } else if (var7 == 1) {
                    class100.field2515[class125.field3036++] = var4;
                    var5.field1345 = class2.field73;
                    int var8 = class53.field1304.method700(3, -82);
                    var5.method506(true, false, var8);
                    int var9 = class53.field1304.method700(1, -39);
                    if (var9 == 1) {
                        class96.field2446[class81.field2080++] = var4;
                    }
                } else if (var7 == 2) {
                    class100.field2515[class125.field3036++] = var4;
                    var5.field1345 = class2.field73;
                    int var10 = class53.field1304.method700(3, 103);
                    var5.method506(true, true, var10);
                    int var11 = class53.field1304.method700(3, -63);
                    var5.method506(true, true, var11);
                    int var12 = class53.field1304.method700(1, 105);
                    if (var12 == 1) {
                        class96.field2446[class81.field2080++] = var4;
                    }
                } else if (var7 == 3) {
                    class64.field1614[class21.field441++] = var4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(IIIJ)V")
    public abstract void method50(int arg0, int arg1, int arg2, long arg3);
}
