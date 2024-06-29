import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pa")
public class class94 {

    @OriginalMember(owner = "client!pa", name = "n", descriptor = "I")
    private int field1223 = 0;

    @OriginalMember(owner = "client!pa", name = "h", descriptor = "Z")
    public boolean field1217 = true;

    @OriginalMember(owner = "client!pa", name = "u", descriptor = "I")
    public int field1230 = -1;

    @OriginalMember(owner = "client!pa", name = "o", descriptor = "I")
    public int field1224 = 128;

    @OriginalMember(owner = "client!pa", name = "i", descriptor = "[[S")
    public static short[][] field1218 = new short[][] { { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 24, 44, 64, 84, 104, 304, 678, 698, 550, 934, 954, 6448, 6946, 6966, 2352, 2726, 2746, 10544, 10918, 10938, 10304, 10550, 10570, 14640, 15014, 15034, 19760, 20134, 20154, -29392, -29018, -28998, 31024, 31270, 31290, -24272, -23898, -23878, -19152, -18778, -18758, -14032, -13658, -13638, -6864, -6490, -6470, 516, 536, 6788, 6808, 11012, 11032, 14980, 15000, 21124, 21144, -28924, -28904, -22012, -21992, -12924, -12904 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 10339, 10574, 10425, 10398, 10345, 7512, 8507, 7378, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 24, 44, 64, 84, 104, 304, 678, 698, 550, 934, 954, 6448, 6946, 6966, 2352, 2726, 2746, 10544, 10918, 10938, 10304, 10550, 10570, 14640, 15014, 15034, 19760, 20134, 20154, -29392, -29018, -28998, 31024, 31270, 31290, -24272, -23898, -23878, -19152, -18778, -18758, -14032, -13658, -13638, -6864, -6490, -6470, 516, 536, 6788, 6808, 11012, 11032, 14980, 15000, 21124, 21144, -28924, -28904, -22012, -21992, -12924, -12904 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 13753, 13737, 13719, 13883, 13863, 13974, 19643, 18601, 16532, 23993, 25121, 24980, 26944, 26921, 24854, 27191, 27171, 26130, 26941, 28696, 30100, 12477, 10407, 10388, 10685, 10665, 10646, 6711, 6693, 6674, 6965, 7073, 7056, 2361, 4387, 3346, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 24, 44, 64, 84, 104, 304, 678, 698, 550, 934, 954, 6448, 6946, 6966, 2352, 2726, 2746, 10544, 10918, 10938, 10304, 10550, 10570, 14640, 15014, 15034, 19760, 20134, 20154, -29392, -29018, -28998, 31024, 31270, 31290, -24272, -23898, -23878, -19152, -18778, -18758, -14032, -13658, -13638, -6864, -6490, -6470, 516, 536, 6788, 6808, 11012, 11032, 14980, 15000, 21124, 21144, -28924, -28904, -22012, -21992, -12924, -12904 } };

    @OriginalMember(owner = "client!pa", name = "c", descriptor = "Ldj;")
    public static class143 field1212 = new class143(128);

    @OriginalMember(owner = "client!pa", name = "v", descriptor = "Z")
    public static boolean field1231 = false;

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "I")
    public static int field1210;

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "I")
    public int field1211;

    @OriginalMember(owner = "client!pa", name = "d", descriptor = "I")
    public static int field1213;

    @OriginalMember(owner = "client!pa", name = "e", descriptor = "I")
    public static int field1214;

    @OriginalMember(owner = "client!pa", name = "f", descriptor = "I")
    public static int field1215;

    @OriginalMember(owner = "client!pa", name = "g", descriptor = "I")
    public static int field1216;

    @OriginalMember(owner = "client!pa", name = "j", descriptor = "I")
    public static int field1219;

    @OriginalMember(owner = "client!pa", name = "k", descriptor = "I")
    public int field1220;

    @OriginalMember(owner = "client!pa", name = "l", descriptor = "I")
    public static int field1221;

    @OriginalMember(owner = "client!pa", name = "m", descriptor = "I")
    public static int field1222;

    @OriginalMember(owner = "client!pa", name = "p", descriptor = "I")
    public static int field1225;

    @OriginalMember(owner = "client!pa", name = "q", descriptor = "I")
    public static int field1226;

    @OriginalMember(owner = "client!pa", name = "r", descriptor = "I")
    public int field1227;

    @OriginalMember(owner = "client!pa", name = "s", descriptor = "I")
    public static int field1228;

    @OriginalMember(owner = "client!pa", name = "t", descriptor = "I")
    public static int field1229;

    @OriginalMember(owner = "client!pa", name = "w", descriptor = "I")
    public int field1232;

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(II)[B", line = 5)
    public static final byte[] method676(int arg0, int arg1) {
        if (arg1 != -29382) {
            field1212 = (class143) null;
        }
        field1225++;
        class107 var2 = (class107) class355.field5554.method1116(17301, (long) arg0);
        if (var2 == null) {
            byte[] var3 = new byte[512];
            Random var4 = new Random((long) arg0);
            for (int var5 = 0; var5 < 255; var5++) {
                var3[var5] = (byte) var5;
            }
            for (int var6 = 0; var6 < 255; var6++) {
                int var7 = 255 - var6;
                int var8 = class294.method2011(var4, var7, 106);
                byte var9 = var3[var8];
                var3[var8] = var3[var7];
                var3[var7] = var3[511 - var6] = var9;
            }
            var2 = new class107(var3);
            class355.field5554.method1115((long) arg0, arg1 ^ 0xFFFF8D40, var2);
        }
        return var2.field1384;
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(I)V", line = 55)
    public static final void method677(int arg0) {
        field1215++;
        class348.method2415((byte) 25, class58.field745);
        int var1 = (class331.field4867 >> 3) + (class112.field1453 >> 10);
        int var2 = (class355.field5556 >> 3) + (class248.field3606 >> 10);
        byte var3 = 8;
        byte var4 = 8;
        byte var5 = 18;
        class101.field1316 = new byte[var5][];
        class182.field2484 = new int[var5];
        class305.field4461 = new byte[var5][];
        class45.field550 = new int[var5];
        class294.field4286 = new int[var5];
        class277.field3972 = new byte[var5][];
        if (arg0 != 0) {
            field1222 = 59;
        }
        class75.field994 = new int[var5];
        class264.field3838 = new byte[var5][];
        class305.field4457 = new int[var5];
        class356.field5573 = new int[var5][4];
        class303.field4442 = new int[var5];
        byte var6 = 0;
        class48.field649 = new byte[var5][];
        int var7 = 0;
        for (int var8 = (var1 - 6) / 8; var8 <= (var1 + 6) / 8; var8++) {
            for (int var9 = (var2 - 6) / 8; var9 <= ((var2 + 6) / 8); var9++) {
                int var10 = (var8 << 8) + var9;
                class305.field4457[var7] = var10;
                class182.field2484[var7] = class5.field61.method1079(false, "m" + var8 + "_" + var9);
                class294.field4286[var7] = class5.field61.method1079(false, "l" + var8 + "_" + var9);
                class45.field550[var7] = class5.field61.method1079(false, "n" + var8 + "_" + var9);
                class75.field994[var7] = class5.field61.method1079(false, "um" + var8 + "_" + var9);
                class303.field4442[var7] = class5.field61.method1079(false, "ul" + var8 + "_" + var9);
                if (class45.field550[var7] == -1) {
                    class182.field2484[var7] = -1;
                    class294.field4286[var7] = -1;
                    class75.field994[var7] = -1;
                    class303.field4442[var7] = -1;
                }
                var7++;
            }
        }
        for (int var11 = var7; var11 < class45.field550.length; var11++) {
            class45.field550[var11] = -1;
            class182.field2484[var11] = -1;
            class294.field4286[var11] = -1;
            class75.field994[var11] = -1;
            class303.field4442[var11] = -1;
        }
        class208.method1534(true, 111, var1, false, var4, var3, var2, var6);
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(IIIIZI)V", line = 140)
    public static final void method678(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        field1216++;
        if (arg0 == arg5) {
            class17.method125(arg5, arg2, false, arg3, arg1);
            return;
        }
        if (class245.field3574 <= arg1 - arg5 && class321.field4722 >= (arg1 + arg5) && arg3 - arg0 >= class207.field2937 && class25.field292 >= arg3 + arg0) {
            class93.method675(-593542495, arg0, arg1, arg2, arg3, arg5);
        } else {
            class26.method176(arg3, arg0, arg2, arg5, arg1, -43);
        }
        if (!arg4) {
            method677(4);
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(B)V", line = 168)
    public static void method679(byte arg0) {
        field1212 = null;
        field1218 = (short[][]) null;
        if (arg0 != -110) {
            field1222 = 115;
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(IIIIZILqc;)V", line = 181)
    public static final void method680(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, class331 arg6) {
        field1228++;
        class10.method66((byte) -116, arg0, arg5, arg1, arg6.field4855, arg6.field4893, arg2, arg3);
        if (arg4) {
            method682(-56, -106, -38, -28, true);
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(Lfd;II)V", line = 192)
    public final void method681(class299 arg0, int arg1, int arg2) {
        field1229++;
        if (arg1 != 0) {
            method684((byte) -21);
        }
        while (true) {
            int var4 = arg0.method2096((byte) -122);
            if (var4 == 0) {
                return;
            }
            this.method683(arg2, arg0, var4, (byte) -87);
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(IIIIZ)V", line = 219)
    public static final void method682(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        if (class310.field4568 == 1) {
            class167.field2329[class95.field1238 / 100].method85(class210.field2975 - 8, class52.field682 - 8);
        }
        if (!arg4) {
            method686(true, (class281) null, true);
        }
        if (class310.field4568 == 2) {
            class167.field2329[class95.field1238 / 100 + 4].method85(class210.field2975 - 8, class52.field682 - 8);
        }
        class179.method1322((byte) -117);
        field1214++;
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(ILfd;IB)V", line = 246)
    private final void method683(int arg0, class299 arg1, int arg2, byte arg3) {
        field1210++;
        if (arg2 == 1) {
            this.field1223 = arg1.method2085((byte) 120);
            this.method685((byte) 59, this.field1223);
        } else if (arg2 == 2) {
            this.field1230 = arg1.method2083((byte) -57);
            if (this.field1230 == 65535) {
                this.field1230 = -1;
            }
        } else if (arg2 == 3) {
            this.field1224 = arg1.method2083((byte) -34);
        } else if (arg2 == 4) {
            this.field1217 = false;
        }
        if (arg3 > -75) {
            this.method685((byte) -40, -88);
        }
    }

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "(B)V", line = 290)
    public static final void method684(byte arg0) {
        class225.field3238.method2262(false);
        if (arg0 >= 86) {
            field1219++;
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(BI)V", line = 301)
    private final void method685(byte arg0, int arg1) {
        field1213++;
        double var3 = (double) (arg1 >> 16 & 0xFF) / 256.0D;
        double var5 = (double) ((arg1 & 0xFF18) >> 8) / 256.0D;
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
        double var13 = 0.0D;
        if (var11 < var7) {
            var11 = var7;
        }
        double var15 = 0.0D;
        double var17 = (var9 + var11) / 2.0D;
        if (arg0 != 59) {
            return;
        }
        this.field1232 = (int) (var17 * 256.0D);
        if (this.field1232 < 0) {
            this.field1232 = 0;
        } else if (this.field1232 > 255) {
            this.field1232 = 255;
        }
        if (var9 != var11) {
            if (var17 < 0.5D) {
                var15 = (var11 - var9) / (var9 + var11);
            }
            if (var3 == var11) {
                var13 = (var5 - var7) / (var11 - var9);
            } else if (var5 == var11) {
                var13 = (var7 - var3) / (var11 - var9) + 2.0D;
            } else if (var7 == var11) {
                var13 = (var3 - var5) / (var11 - var9) + 4.0D;
            }
            if (var17 >= 0.5D) {
                var15 = (var11 - var9) / (2.0D - var11 - var9);
            }
        }
        this.field1220 = (int) (var15 * 256.0D);
        if (var17 > 0.5D) {
            this.field1227 = (int) ((1.0D - var17) * var15 * 512.0D);
        } else {
            this.field1227 = (int) (var15 * var17 * 512.0D);
        }
        if (this.field1227 < 1) {
            this.field1227 = 1;
        }
        double var19 = var13 / 6.0D;
        this.field1211 = (int) ((double) this.field1227 * var19);
        if (this.field1220 < 0) {
            this.field1220 = 0;
        } else if (this.field1220 > 255) {
            this.field1220 = 255;
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(ZLgl;Z)V", line = 409)
    public static final void method686(boolean arg0, class281 arg1, boolean arg2) {
        field1226++;
        if (class47.field623 || arg0) {
            int var3 = class192.field2660;
            int var4 = var3 * 956 / 503;
            class312.field4590.method70((class163.field2314 - var4) / 2, 0, var4, var3);
            class30.field358.method937(class163.field2314 / 2 - (class30.field358.field2024 / 2), 18);
        }
        arg1.method1911(class299.field4362 == 1 ? class27.field312 : class330.field4829, class163.field2314 / 2, class192.field2660 / 2 - 26, 16777215, -1);
        if (arg2) {
            field1218 = (short[][]) ((short[][]) null);
        }
        int var5 = class192.field2660 / 2 - 18;
        if (class47.field623) {
            class129.method986(class163.field2314 / 2 - 152, var5, 304, 34, 9179409);
            class129.method986(class163.field2314 / 2 - 151, var5 + 1, 302, 32, 0);
            class129.method997(class163.field2314 / 2 - 150, var5 + 2, class74.field984 * 3, 30, 9179409);
            class129.method997(class74.field984 * 3 + class163.field2314 / 2 - 150, var5 + 2, 300 - (class74.field984 * 3), 30, 0);
        } else {
            class37.method248(class163.field2314 / 2 - 152, var5, 304, 34, 9179409);
            class37.method248(class163.field2314 / 2 - 151, var5 + 1, 302, 32, 0);
            class37.method231(class163.field2314 / 2 - 150, var5 + 2, class74.field984 * 3, 30, 9179409);
            class37.method231(class74.field984 * 3 + (class163.field2314 / 2 - 150), var5 - -2, 300 - (class74.field984 * 3), 30, 0);
        }
        arg1.method1911(class48.field645, class163.field2314 / 2, class192.field2660 / 2 + 4, 16777215, -1);
    }
}
