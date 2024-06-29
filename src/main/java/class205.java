import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ef")
public class class205 extends class110 {

    @OriginalMember(owner = "client!ef", name = "O", descriptor = "[S")
    private short[] field3085 = new short[257];

    @OriginalMember(owner = "client!ef", name = "U", descriptor = "I")
    private int field3091 = 0;

    @OriginalMember(owner = "client!ef", name = "N", descriptor = "I")
    public static int field3084 = 0;

    @OriginalMember(owner = "client!ef", name = "L", descriptor = "Lom;")
    public static class156 field3082 = new class156();

    @OriginalMember(owner = "client!ef", name = "Y", descriptor = "[[S")
    public static short[][] field3095 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };

    @OriginalMember(owner = "client!ef", name = "ab", descriptor = "[Ljava/lang/String;")
    public static String[] field3097 = new String[100];

    @OriginalMember(owner = "client!ef", name = "G", descriptor = "I")
    public static int field3077;

    @OriginalMember(owner = "client!ef", name = "H", descriptor = "I")
    public static int field3078;

    @OriginalMember(owner = "client!ef", name = "J", descriptor = "I")
    public static int field3080;

    @OriginalMember(owner = "client!ef", name = "Q", descriptor = "I")
    public static int field3087;

    @OriginalMember(owner = "client!ef", name = "R", descriptor = "I")
    public static int field3088;

    @OriginalMember(owner = "client!ef", name = "S", descriptor = "I")
    public static int field3089;

    @OriginalMember(owner = "client!ef", name = "T", descriptor = "I")
    public static int field3090;

    @OriginalMember(owner = "client!ef", name = "V", descriptor = "I")
    public static int field3092;

    @OriginalMember(owner = "client!ef", name = "W", descriptor = "I")
    public static int field3093;

    @OriginalMember(owner = "client!ef", name = "X", descriptor = "I")
    public static int field3094;

    @OriginalMember(owner = "client!ef", name = "Z", descriptor = "I")
    public static int field3096;

    @OriginalMember(owner = "client!ef", name = "bb", descriptor = "I")
    public static int field3098;

    @OriginalMember(owner = "client!ef", name = "eb", descriptor = "Lfa;")
    public static class95 field3101;

    @OriginalMember(owner = "client!ef", name = "K", descriptor = "[I")
    private int[] field3081;

    @OriginalMember(owner = "client!ef", name = "P", descriptor = "[I")
    private int[] field3086;

    @OriginalMember(owner = "client!ef", name = "db", descriptor = "[I")
    public static int[] field3100;

    @OriginalMember(owner = "client!ef", name = "M", descriptor = "[[B")
    public static byte[][] field3083;

    @OriginalMember(owner = "client!ef", name = "I", descriptor = "[[I")
    private int[][] field3079;

    @OriginalMember(owner = "client!ef", name = "cb", descriptor = "[[[B")
    public static byte[][][] field3099;

    @OriginalMember(owner = "client!ef", name = "c", descriptor = "(III)V", line = 6)
    public static final void method1407(int arg0, int arg1, int arg2) {
        field3092++;
        if (arg0 >= 125 && class115.field1760 != 0 && arg1 != -1) {
            class104.method732(0, arg1, class70.field925, class115.field1760, -120, false);
            class146.field2205 = true;
        }
    }

    @OriginalMember(owner = "client!ef", name = "f", descriptor = "(I)V", line = 25)
    public final void method47(int arg0) {
        if (this.field3079 == null) {
            this.field3079 = new int[][] { { 0, 0 }, { 4096, 4096 } };
        }
        if (arg0 != -9) {
            field3096 = -111;
        }
        field3090++;
        if (this.field3079.length < 2) {
            throw new RuntimeException("Curve operation requires at least two markers");
        }
        if (this.field3091 == 2) {
            this.method1413((byte) 51);
        }
        class314.method2157(-49);
        this.method1409(-26537);
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(ILre;I)V", line = 50)
    public final void method44(int arg0, class263 arg1, int arg2) {
        if (arg0 == 0) {
            this.field3091 = arg1.method1787(false);
            this.field3079 = new int[arg1.method1787(false)][2];
            for (int var4 = 0; var4 < this.field3079.length; var4++) {
                this.field3079[var4][0] = arg1.method1830((byte) -77);
                this.field3079[var4][1] = arg1.method1830((byte) -77);
            }
        }
        if (arg2 > -37) {
            this.method46(33, 49);
        }
        field3087++;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(II)[I", line = 78)
    public final int[] method46(int arg0, int arg1) {
        if (arg0 != 1) {
            field3095 = (short[][]) ((short[][]) null);
        }
        field3098++;
        int[] var3 = this.field1695.method440((byte) -60, arg1);
        if (this.field1695.field875) {
            int[] var4 = this.method764(0, true, arg1);
            for (int var5 = 0; var5 < class124.field1936; var5++) {
                int var6 = var4[var5] >> 4;
                if (var6 < 0) {
                    var6 = 0;
                }
                if (var6 > 256) {
                    var6 = 256;
                }
                var3[var5] = this.field3085[var6];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "(IZ)[I", line = 121)
    private final int[] method1408(int arg0, boolean arg1) {
        field3088++;
        if (arg0 < 0) {
            return this.field3086;
        } else if (this.field3079.length <= arg0) {
            return this.field3081;
        } else {
            if (!arg1) {
                this.field3081 = (int[]) null;
            }
            return this.field3079[arg0];
        }
    }

    @OriginalMember(owner = "client!ef", name = "h", descriptor = "(I)V", line = 138)
    private final void method1409(int arg0) {
        field3094++;
        int var2 = this.field3091;
        if (var2 == 2) {
            for (int var3 = 0; var3 < 257; var3++) {
                int var4 = var3 << 4;
                int var5;
                for (var5 = 1; this.field3079.length - 1 > var5 && var4 >= this.field3079[var5][0]; var5++) {
                }
                int[] var6 = this.field3079[var5 - 1];
                int[] var7 = this.field3079[var5];
                int var8 = this.method1408(var5 - 2, true)[1];
                int var9 = var6[1];
                int var10 = var7[1];
                int var11 = this.method1408(var5 + 1, true)[1];
                int var12 = var9 + var11 - var8 - var10;
                int var13 = (var4 - var6[0] << 12) / (var7[0] - var6[0]);
                int var14 = var8 - var9 - var12;
                int var16 = var13 * var13 >> 12;
                int var17 = var10 - var8;
                int var18 = (var12 * var13 >> 12) * var16 >> 12;
                int var19 = var14 * var16 >> 12;
                int var20 = var13 * var17 >> 12;
                int var21 = var9 + var19 + var18 + var20;
                if (var21 <= -32768) {
                    var21 = -32767;
                }
                if (var21 >= 32768) {
                    var21 = 32767;
                }
                this.field3085[var3] = (short) var21;
            }
        } else if (var2 == 1) {
            for (int var30 = 0; var30 < 257; var30++) {
                int var31 = var30 << 4;
                int var32;
                for (var32 = 1; var32 < this.field3079.length - 1 && this.field3079[var32][0] <= var31; var32++) {
                }
                int[] var33 = this.field3079[var32 - 1];
                int[] var34 = this.field3079[var32];
                int var35 = (var31 - var33[0] << 12) / (var34[0] - var33[0]);
                int var36 = 4096 - class321.field4852[var35 >> 5 & 0xFF] >> 1;
                int var37 = 4096 - var36;
                int var38 = var33[1] * var37 + var34[1] * var36 >> 12;
                if (var38 <= -32768) {
                    var38 = -32767;
                }
                if (var38 >= 32768) {
                    var38 = 32767;
                }
                this.field3085[var30] = (short) var38;
            }
        } else {
            for (int var22 = 0; var22 < 257; var22++) {
                int var23 = var22 << 4;
                int var24;
                for (var24 = 1; this.field3079.length - 1 > var24 && this.field3079[var24][0] <= var23; var24++) {
                }
                int[] var25 = this.field3079[var24];
                int[] var26 = this.field3079[var24 - 1];
                int var27 = (var23 - var26[0] << 12) / (var25[0] - var26[0]);
                int var28 = 4096 - var27;
                int var29 = var26[1] * var28 + (var25[1] * var27) >> 12;
                if (var29 <= -32768) {
                    var29 = -32767;
                }
                if (var29 >= 32768) {
                    var29 = 32767;
                }
                this.field3085[var22] = (short) var29;
            }
        }
        if (arg0 != -26537) {
            method1412((byte) 40);
        }
    }

    @OriginalMember(owner = "client!ef", name = "c", descriptor = "(II)Lij;", line = 331)
    public static final class178 method1410(int arg0, int arg1) {
        field3080++;
        if (class75.field977 && class169.field2528 <= arg0 && class131.field2024 >= arg0) {
            if (arg1 != 2586) {
                field3082 = (class156) null;
            }
            return class74.field962[arg0 - class169.field2528];
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(BILf;)Ljava/lang/String;", line = 345)
    public static final String method1411(byte arg0, int arg1, class329 arg2) {
        field3078++;
        if (!client.method902(arg2).method137(arg1, -114) && arg2.field4978 == null) {
            return null;
        } else if (arg2.field4942 == null || arg1 >= arg2.field4942.length || arg2.field4942[arg1] == null || arg2.field4942[arg1].trim().length() == 0) {
            return class250.field3733 ? "Hidden-" + arg1 : null;
        } else {
            if (arg0 <= 12) {
                method1407(-46, 88, -114);
            }
            return arg2.field4942[arg1];
        }
    }

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "(B)V", line = 371)
    public static void method1412(byte arg0) {
        field3095 = (short[][]) null;
        field3083 = (byte[][]) null;
        field3099 = (byte[][][]) null;
        field3101 = null;
        field3097 = null;
        if (arg0 != -17) {
            field3089 = -115;
        }
        field3100 = null;
        field3082 = null;
    }

    @OriginalMember(owner = "client!ef", name = "<init>", descriptor = "()V", line = 387)
    public class205() {
        super(1, true);
    }

    @OriginalMember(owner = "client!ef", name = "c", descriptor = "(B)V", line = 393)
    private final void method1413(byte arg0) {
        if (arg0 != 51) {
            method1407(-100, 113, 123);
        }
        int[] var2 = this.field3079[0];
        field3093++;
        int[] var3 = this.field3079[1];
        int[] var4 = this.field3079[this.field3079.length - 2];
        int[] var5 = this.field3079[this.field3079.length - 1];
        this.field3081 = new int[] { var4[0] + var4[0] - var5[0], var4[1] + -var5[1] + var4[1] };
        this.field3086 = new int[] { var2[0] + var2[0] - var3[0], var2[1] + -var3[1] + var2[1] };
    }
}
