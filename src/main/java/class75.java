import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tj")
public class class75 {

    @OriginalMember(owner = "client!tj", name = "k", descriptor = "I")
    private int field1434 = 65000;

    @OriginalMember(owner = "client!tj", name = "g", descriptor = "Lwb;")
    private class132 field1430 = null;

    @OriginalMember(owner = "client!tj", name = "q", descriptor = "Lwb;")
    private class132 field1440 = null;

    @OriginalMember(owner = "client!tj", name = "n", descriptor = "I")
    private int field1437;

    @OriginalMember(owner = "client!tj", name = "h", descriptor = "Lke;")
    public static class256 field1431 = class316.method2202(",Mcran)2titre charg-B", 27626);

    @OriginalMember(owner = "client!tj", name = "i", descriptor = "[Lwb;")
    public static class132[] field1432 = new class132[28];

    @OriginalMember(owner = "client!tj", name = "d", descriptor = "Lke;")
    public static class256 field1427 = class316.method2202("::clientdrop", 27626);

    @OriginalMember(owner = "client!tj", name = "b", descriptor = "[[S")
    public static short[][] field1425 = new short[][] { { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 24, 44, 64, 84, 104, 304, 678, 698, 550, 934, 954, 6448, 6946, 6966, 2352, 2726, 2746, 10544, 10918, 10938, 10304, 10550, 10570, 14640, 15014, 15034, 19760, 20134, 20154, -29392, -29018, -28998, 31024, 31270, 31290, -24272, -23898, -23878, -19152, -18778, -18758, -14032, -13658, -13638, -6864, -6490, -6470, 516, 536, 6788, 6808, 11012, 11032, 14980, 15000, 21124, 21144, -28924, -28904, -22012, -21992, -12924, -12904 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 10339, 10574, 10425, 10398, 10345, 7512, 8507, 7378, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 24, 44, 64, 84, 104, 304, 678, 698, 550, 934, 954, 6448, 6946, 6966, 2352, 2726, 2746, 10544, 10918, 10938, 10304, 10550, 10570, 14640, 15014, 15034, 19760, 20134, 20154, -29392, -29018, -28998, 31024, 31270, 31290, -24272, -23898, -23878, -19152, -18778, -18758, -14032, -13658, -13638, -6864, -6490, -6470, 516, 536, 6788, 6808, 11012, 11032, 14980, 15000, 21124, 21144, -28924, -28904, -22012, -21992, -12924, -12904 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 13753, 13737, 13719, 13883, 13863, 13974, 19643, 18601, 16532, 23993, 25121, 24980, 26944, 26921, 24854, 27191, 27171, 26130, 26941, 28696, 30100, 12477, 10407, 10388, 10685, 10665, 10646, 6711, 6693, 6674, 6965, 7073, 7056, 2361, 4387, 3346, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 24, 44, 64, 84, 104, 304, 678, 698, 550, 934, 954, 6448, 6946, 6966, 2352, 2726, 2746, 10544, 10918, 10938, 10304, 10550, 10570, 14640, 15014, 15034, 19760, 20134, 20154, -29392, -29018, -28998, 31024, 31270, 31290, -24272, -23898, -23878, -19152, -18778, -18758, -14032, -13658, -13638, -6864, -6490, -6470, 516, 536, 6788, 6808, 11012, 11032, 14980, 15000, 21124, 21144, -28924, -28904, -22012, -21992, -12924, -12904 } };

    @OriginalMember(owner = "client!tj", name = "o", descriptor = "[S")
    public static short[] field1438 = new short[] { 23, 28, 18, 16, 32, 9, 30, 14 };

    @OriginalMember(owner = "client!tj", name = "c", descriptor = "I")
    public static int field1426 = 0;

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "I")
    public static int field1424;

    @OriginalMember(owner = "client!tj", name = "e", descriptor = "I")
    public static int field1428;

    @OriginalMember(owner = "client!tj", name = "f", descriptor = "I")
    public static int field1429;

    @OriginalMember(owner = "client!tj", name = "j", descriptor = "I")
    public static int field1433;

    @OriginalMember(owner = "client!tj", name = "l", descriptor = "I")
    public static int field1435;

    @OriginalMember(owner = "client!tj", name = "m", descriptor = "I")
    public static int field1436;

    @OriginalMember(owner = "client!tj", name = "p", descriptor = "I")
    public static int field1439;

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(II)[B", line = 14)
    public final byte[] method568(int arg0, int arg1) {
        field1429++;
        class132 var3 = this.field1440;
        synchronized (this.field1440) {
            if (arg1 != 6456) {
                method574(-105, true);
            }
            try {
                Object var10000;
                if ((long) (arg0 * 6 + 6) > this.field1430.method895(false)) {
                    var10000 = null;
                    return (byte[]) var10000;
                }
                this.field1430.method905((long) (arg0 * 6), (byte) 116);
                this.field1430.method894(94, 6, 0, class175.field3115);
                int var4 = ((class175.field3115[4] & 0xFF) << 8) + ((class175.field3115[3] & 0xFF) << 16) + (class175.field3115[5] & 0xFF);
                int var5 = (class175.field3115[1] & 0xFF << 8) + ((class175.field3115[0] & 0xFF) << 16) + (class175.field3115[2] & 0xFF);
                if (var5 < 0 || this.field1434 < var5) {
                    var10000 = null;
                    return (byte[]) var10000;
                } else if (var4 <= 0 || this.field1440.method895(false) / 520L < (long) var4) {
                    var10000 = null;
                    return (byte[]) var10000;
                } else {
                    byte[] var6 = new byte[var5];
                    int var7 = 0;
                    int var8 = 0;
                    while (var5 > var7) {
                        if (var4 == 0) {
                            var10000 = null;
                            return (byte[]) var10000;
                        }
                        this.field1440.method905((long) (var4 * 520), (byte) 58);
                        int var9 = var5 - var7;
                        if (var9 > 512) {
                            var9 = 512;
                        }
                        this.field1440.method894(arg1 - 6351, var9 - -8, 0, class175.field3115);
                        int var10 = (class175.field3115[2] & 0xFF << 8) + (class175.field3115[3] & 0xFF);
                        int var11 = class175.field3115[7] & 0xFF;
                        int var12 = ((class175.field3115[4] & 0xFF) << 16) - (-((class175.field3115[5] & 0xFF) << 8) - (class175.field3115[6] & 0xFF));
                        int var13 = (class175.field3115[0] & 0xFF << 8) + (class175.field3115[1] & 0xFF);
                        if (arg0 != var13 || var8 != var10 || this.field1437 != var11) {
                            var10000 = null;
                            return (byte[]) var10000;
                        }
                        if (var12 < 0 || ((long) var12) > (this.field1440.method895(false) / 520L)) {
                            var10000 = null;
                            return (byte[]) var10000;
                        }
                        for (int var14 = 0; var14 < var9; var14++) {
                            var6[var7++] = class175.field3115[var14 + 8];
                        }
                        var8++;
                        var4 = var12;
                    }
                    byte[] var19 = var6;
                    return var19;
                }
            } catch (IOException var17) {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(Z[BII)Z", line = 105)
    public final boolean method569(boolean arg0, byte[] arg1, int arg2, int arg3) {
        field1436++;
        class132 var5 = this.field1440;
        synchronized (this.field1440) {
            if (arg3 < 0 || this.field1434 < arg3) {
                throw new IllegalArgumentException();
            }
            boolean var6 = this.method571(arg0, (byte) 56, arg2, arg1, arg3);
            if (!var6) {
                var6 = this.method571(false, (byte) 56, arg2, arg1, arg3);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(BLke;)V", line = 128)
    public static final void method570(byte arg0, class256 arg1) {
        field1439++;
        class148.method1082(false, 86);
        if (arg0 < 107) {
            method573(true);
        }
        class108.method763(arg1, -24376);
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(ZBI[BI)Z", line = 159)
    private final boolean method571(boolean arg0, byte arg1, int arg2, byte[] arg3, int arg4) {
        field1433++;
        class132 var6 = this.field1440;
        synchronized (this.field1440) {
            try {
                if (arg1 != 56) {
                    this.method569(true, (byte[]) null, -20, -12);
                }
                int var7;
                boolean var10000;
                if (arg0) {
                    if (((long) (arg2 * 6 + 6)) > this.field1430.method895(false)) {
                        var10000 = false;
                        return var10000;
                    }
                    this.field1430.method905((long) (arg2 * 6), (byte) 76);
                    this.field1430.method894(100, 6, 0, class175.field3115);
                    var7 = ((class175.field3115[4] & 0xFF) << 8) + ((class175.field3115[3] & 0xFF) << 16) + (class175.field3115[5] & 0xFF);
                    if (var7 <= 0 || (this.field1440.method895(false) / 520L) < ((long) var7)) {
                        var10000 = false;
                        return var10000;
                    }
                } else {
                    var7 = (int) ((this.field1440.method895(false) + 519L) / 520L);
                    if (var7 == 0) {
                        var7 = 1;
                    }
                }
                class175.field3115[1] = (byte) (arg4 >> 8);
                class175.field3115[0] = (byte) (arg4 >> 16);
                class175.field3115[3] = (byte) (var7 >> 16);
                class175.field3115[4] = (byte) (var7 >> 8);
                class175.field3115[2] = (byte) arg4;
                int var8 = 0;
                int var9 = 0;
                class175.field3115[5] = (byte) var7;
                this.field1430.method905((long) (arg2 * 6), (byte) 96);
                this.field1430.method904(6, 0, class175.field3115, 1625757712);
                while (true) {
                    if (var9 < arg4) {
                        label137: {
                            int var10 = 0;
                            if (arg0) {
                                this.field1440.method905((long) (var7 * 520), (byte) 100);
                                try {
                                    this.field1440.method894(118, 8, 0, class175.field3115);
                                } catch (EOFException var18) {
                                    break label137;
                                }
                                var10 = (class175.field3115[6] & 0xFF) + ((class175.field3115[4] & 0xFF) << 16) + (class175.field3115[5] & 0xFF << 8);
                                int var12 = (class175.field3115[2] & 0xFF << 8) + (class175.field3115[3] & 0xFF);
                                int var13 = class175.field3115[7] & 0xFF;
                                int var14 = ((class175.field3115[0] & 0xFF) << 8) + (class175.field3115[1] & 0xFF);
                                if (arg2 != var14 || var8 != var12 || this.field1437 != var13) {
                                    var10000 = false;
                                    return var10000;
                                }
                                if (var10 < 0 || ((long) var10) > (this.field1440.method895(false) / 520L)) {
                                    var10000 = false;
                                    return var10000;
                                }
                            }
                            if (var10 == 0) {
                                arg0 = false;
                                var10 = (int) ((this.field1440.method895(false) + 519L) / 520L);
                                if (var10 == 0) {
                                    var10++;
                                }
                                if (var7 == var10) {
                                    var10++;
                                }
                            }
                            if ((arg4 - var9) <= 512) {
                                var10 = 0;
                            }
                            class175.field3115[4] = (byte) (var10 >> 16);
                            class175.field3115[0] = (byte) (arg2 >> 8);
                            class175.field3115[3] = (byte) var8;
                            int var15 = arg4 - var9;
                            class175.field3115[2] = (byte) (var8 >> 8);
                            class175.field3115[7] = (byte) this.field1437;
                            class175.field3115[1] = (byte) arg2;
                            class175.field3115[6] = (byte) var10;
                            if (var15 > 512) {
                                var15 = 512;
                            }
                            class175.field3115[5] = (byte) (var10 >> 8);
                            this.field1440.method905((long) (var7 * 520), (byte) 57);
                            var8++;
                            this.field1440.method904(8, 0, class175.field3115, 1625757712);
                            var7 = var10;
                            this.field1440.method904(var15, var9, arg3, 1625757712);
                            var9 += var15;
                            continue;
                        }
                    }
                    var10000 = true;
                    return var10000;
                }
            } catch (IOException var19) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(Lnm;IIIIIIIZ)V", line = 281)
    public static final void method572(class198 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8) {
        int var9;
        int var10 = var9 = (arg6 << 7) - class310.field5346;
        int var11;
        int var12 = var11 = (arg7 << 7) - class271.field4623;
        int var13;
        int var14 = var13 = var10 + 128;
        int var15;
        int var16 = var15 = var12 + 128;
        int var17 = class118.field2090[arg1][arg6][arg7] - class59.field1079;
        int var18 = class118.field2090[arg1][arg6 + 1][arg7] - class59.field1079;
        int var19 = class118.field2090[arg1][arg6 + 1][arg7 + 1] - class59.field1079;
        int var20 = class118.field2090[arg1][arg6][arg7 + 1] - class59.field1079;
        int var21 = arg4 * var12 + arg5 * var10 >> 16;
        int var22 = arg5 * var12 - arg4 * var10 >> 16;
        int var24 = arg3 * var17 - arg2 * var22 >> 16;
        int var25 = arg2 * var17 + arg3 * var22 >> 16;
        if (var25 < 50) {
            return;
        }
        int var27 = arg4 * var11 + arg5 * var14 >> 16;
        int var28 = arg5 * var11 - arg4 * var14 >> 16;
        int var30 = arg3 * var18 - arg2 * var28 >> 16;
        int var31 = arg2 * var18 + arg3 * var28 >> 16;
        if (var31 < 50) {
            return;
        }
        int var33 = arg4 * var16 + arg5 * var13 >> 16;
        int var34 = arg5 * var16 - arg4 * var13 >> 16;
        int var36 = arg3 * var19 - arg2 * var34 >> 16;
        int var37 = arg2 * var19 + arg3 * var34 >> 16;
        if (var37 < 50) {
            return;
        }
        int var39 = arg4 * var15 + arg5 * var9 >> 16;
        int var40 = arg5 * var15 - arg4 * var9 >> 16;
        int var42 = arg3 * var20 - arg2 * var40 >> 16;
        int var43 = arg2 * var20 + arg3 * var40 >> 16;
        if (var43 < 50) {
            return;
        }
        int var45 = (var21 << 9) / var25 + class136.field2375;
        int var46 = (var24 << 9) / var25 + class136.field2374;
        int var47 = (var27 << 9) / var31 + class136.field2375;
        int var48 = (var30 << 9) / var31 + class136.field2374;
        int var49 = (var33 << 9) / var37 + class136.field2375;
        int var50 = (var36 << 9) / var37 + class136.field2374;
        int var51 = (var39 << 9) / var43 + class136.field2375;
        int var52 = (var42 << 9) / var43 + class136.field2374;
        class136.field2377 = 0;
        if ((var48 - var52) * (var49 - var51) - (var47 - var51) * (var50 - var52) > 0) {
            if (class14.field187 && class5.method42(class136.field2375 + class135.field2353, class303.field5244 + class136.field2374, var50, var52, var48, var49, var51, var47)) {
                class91.field1666 = arg6;
                class160.field2847 = arg7;
            }
            if (!class253.field4323 && !arg8) {
                class136.field2365 = false;
                if (var49 < 0 || var51 < 0 || var47 < 0 || var49 > class136.field2360 || var51 > class136.field2360 || var47 > class136.field2360) {
                    class136.field2365 = true;
                }
                if (arg0.field3614 == -1) {
                    if (arg0.field3623 != 12345678) {
                        class136.method971(var50, var52, var48, var49, var51, var47, arg0.field3623, arg0.field3620, arg0.field3617);
                    }
                } else if (!class11.field165) {
                    int var53 = class136.field2373.method190(arg0.field3614, 65535);
                    class136.method971(var50, var52, var48, var49, var51, var47, class285.method1998(var53, arg0.field3623), class285.method1998(var53, arg0.field3620), class285.method1998(var53, arg0.field3617));
                } else if (arg0.field3611) {
                    class136.method979(var50, var52, var48, var49, var51, var47, arg0.field3623, arg0.field3620, arg0.field3617, var21, var27, var39, var24, var30, var42, var25, var31, var43, arg0.field3614);
                } else {
                    class136.method979(var50, var52, var48, var49, var51, var47, arg0.field3623, arg0.field3620, arg0.field3617, var33, var39, var27, var36, var42, var30, var37, var43, var31, arg0.field3614);
                }
            }
        }
        if ((var45 - var47) * (var52 - var48) - (var46 - var48) * (var51 - var47) <= 0) {
            return;
        }
        if (class14.field187 && class5.method42(class136.field2375 + class135.field2353, class303.field5244 + class136.field2374, var46, var48, var52, var45, var47, var51)) {
            class91.field1666 = arg6;
            class160.field2847 = arg7;
        }
        if (class253.field4323 || arg8) {
            return;
        }
        class136.field2365 = false;
        if (var45 < 0 || var47 < 0 || var51 < 0 || var45 > class136.field2360 || var47 > class136.field2360 || var51 > class136.field2360) {
            class136.field2365 = true;
        }
        if (arg0.field3614 == -1) {
            if (arg0.field3610 != 12345678) {
                class136.method971(var46, var48, var52, var45, var47, var51, arg0.field3610, arg0.field3617, arg0.field3620);
            }
        } else if (class11.field165) {
            class136.method979(var46, var48, var52, var45, var47, var51, arg0.field3610, arg0.field3617, arg0.field3620, var21, var27, var39, var24, var30, var42, var25, var31, var43, arg0.field3614);
        } else {
            int var54 = class136.field2373.method190(arg0.field3614, 65535);
            class136.method971(var46, var48, var52, var45, var47, var51, class285.method1998(var54, arg0.field3610), class285.method1998(var54, arg0.field3617), class285.method1998(var54, arg0.field3620));
        }
    }

    @OriginalMember(owner = "client!tj", name = "<init>", descriptor = "(ILwb;Lwb;I)V", line = 513)
    public class75(int arg0, class132 arg1, class132 arg2, int arg3) {
        this.field1437 = arg0;
        this.field1430 = arg2;
        this.field1440 = arg1;
        this.field1434 = arg3;
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(Z)V", line = 454)
    public static void method573(boolean arg0) {
        field1432 = null;
        if (arg0) {
            field1438 = (short[]) null;
        }
        field1438 = null;
        field1431 = null;
        field1427 = null;
        field1425 = (short[][]) null;
    }

    @OriginalMember(owner = "client!tj", name = "toString", descriptor = "()Ljava/lang/String;", line = 473)
    public final String toString() {
        field1424++;
        return "Cache:" + this.field1437;
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(IZ)Lgb;", line = 489)
    public static final class83 method574(int arg0, boolean arg1) {
        class83 var2 = (class83) class297.field5156.method2077(-13408, (long) arg0);
        field1428++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class166.field2945.method1016(33, 100, arg0);
        class83 var4 = new class83();
        if (arg1) {
            field1427 = (class256) null;
        }
        if (var3 != null) {
            var4.method616(-14024, new class41(var3), arg0);
        }
        class297.field5156.method2074(var4, (long) arg0, -1);
        return var4;
    }
}
