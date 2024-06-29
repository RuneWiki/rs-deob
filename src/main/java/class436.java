import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public class class436 {

    @OriginalMember(owner = "client!pd", name = "g", descriptor = "Lok;")
    private class172 field6515 = null;

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "Lok;")
    private class172 field6510 = null;

    @OriginalMember(owner = "client!pd", name = "l", descriptor = "I")
    private int field6520 = 65000;

    @OriginalMember(owner = "client!pd", name = "h", descriptor = "I")
    private int field6516;

    @OriginalMember(owner = "client!pd", name = "d", descriptor = "Lvv;")
    public static class313 field6512 = new class313(93, 8);

    @OriginalMember(owner = "client!pd", name = "k", descriptor = "[S")
    public static short[] field6519 = new short[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

    @OriginalMember(owner = "client!pd", name = "i", descriptor = "[Lhs;")
    public static class94[] field6517 = new class94[30];

    @OriginalMember(owner = "client!pd", name = "j", descriptor = "I")
    public static int field6518 = 500;

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "I")
    public static int field6509;

    @OriginalMember(owner = "client!pd", name = "c", descriptor = "I")
    public static int field6511;

    @OriginalMember(owner = "client!pd", name = "e", descriptor = "I")
    public static int field6513;

    @OriginalMember(owner = "client!pd", name = "f", descriptor = "I")
    public static int field6514;

    @OriginalMember(owner = "client!pd", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field6514++;
        return "Cache:" + this.field6516;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(II)[B")
    public final byte[] method2638(int arg0, int arg1) {
        field6511++;
        class172 var3 = this.field6515;
        synchronized (this.field6515) {
            try {
                if (this.field6510.method1162((byte) 66) < ((long) (arg1 * 6 + 6))) {
                    return null;
                }
                this.field6510.method1170((long) (arg1 * 6), (byte) 14);
                this.field6510.method1168(0, 6, class300.field4817, -1);
                int var5 = (class300.field4817[0] & 0xFF << 16) - (-((class300.field4817[1] & 0xFF) << 8) - (class300.field4817[2] & 0xFF));
                int var6 = (class300.field4817[4] & 0xFF << 8) + ((class300.field4817[3] & 0xFF) << 16) + (class300.field4817[5] & 0xFF);
                if (var5 < 0 || this.field6520 < var5) {
                    return null;
                } else if (var6 > 0 && this.field6515.method1162((byte) 66) / 520L >= (long) var6) {
                    int var9 = 33 / ((arg0 - 45) / 57);
                    byte[] var10 = new byte[var5];
                    int var11 = 0;
                    int var12 = 0;
                    label70: while (var11 < var5) {
                        if (var6 == 0) {
                            return null;
                        }
                        this.field6515.method1170((long) (var6 * 520), (byte) 24);
                        int var14 = var5 - var11;
                        if (var14 > 512) {
                            var14 = 512;
                        }
                        this.field6515.method1168(0, var14 + 8, class300.field4817, -1);
                        int var15 = (class300.field4817[0] & 0xFF << 8) + (class300.field4817[1] & 0xFF);
                        int var16 = (class300.field4817[2] & 0xFF << 8) + (class300.field4817[3] & 0xFF);
                        int var17 = (class300.field4817[6] & 0xFF) + ((class300.field4817[5] & 0xFF) << 8) + ((class300.field4817[4] & 0xFF) << 16);
                        int var18 = class300.field4817[7] & 0xFF;
                        if (arg1 == var15 && var12 == var16 && this.field6516 == var18) {
                            if (var17 >= 0 && this.field6515.method1162((byte) 66) / 520L >= (long) var17) {
                                var12++;
                                var6 = var17;
                                int var21 = 0;
                                while (true) {
                                    if (var14 <= var21) {
                                        continue label70;
                                    }
                                    var10[var11++] = class300.field4817[var21 + 8];
                                    var21++;
                                }
                            }
                            return null;
                        }
                        return null;
                    }
                    return var10;
                } else {
                    return null;
                }
            } catch (IOException var40) {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(I[[[BIBII)V")
    public static final void method2639(int arg0, byte[][][] arg1, int arg2, byte arg3, int arg4, int arg5) {
        class290.field4726++;
        class426.field6410 = 0;
        for (int var6 = class497.field7298; var6 < class76.field1315; var6++) {
            class465[][] var17 = class66.field977[var6];
            for (int var18 = class469.field6967; var18 < class73.field1260; var18++) {
                for (int var19 = class475.field7033; var19 < class465.field6895; var19++) {
                    class465 var20 = var17[var18][var19];
                    if (var20 != null) {
                        if (class141.field2332[var18 + class31.field502 - class205.field3248][var19 + class31.field502 - class77.field1351] && arg1 == null || var6 < arg2 || arg1[var6][var18][var19] != arg3) {
                            var20.field6920 = true;
                            var20.field6902 = true;
                            if (var20.field6898 == null) {
                                var20.field6919 = false;
                            } else {
                                var20.field6919 = true;
                            }
                            class426.field6410++;
                        } else {
                            var20.field6920 = false;
                            var20.field6902 = false;
                            var20.field6903 = 0;
                            if (var18 >= class205.field3248 - 16 && var18 <= class205.field3248 + 16 && var19 >= class77.field1351 - 16 && var19 <= class77.field1351 + 16 && (var20.field6907 != null || var20.field6901 != null || var20.field6904 != null || var20.field6908 != null || var20.field6913 != null || var20.field6898 != null)) {
                                class424.field6390.method2201(0, var20);
                            }
                        }
                    }
                }
            }
        }
        boolean var7 = class360.field5592 == class320.field5039;
        for (int var8 = class497.field7298; var8 < class76.field1315; var8++) {
            float var9 = var7 ? 251.5F : 201.5F - (float) var8 * 50.0F - 0.5F;
            if (class81.field1439.method831() && var8 >= arg2 && arg1 != null) {
                int var10 = class141.field2332.length;
                if (class141.field2332.length + class469.field6967 > class236.field4089) {
                    var10 -= class141.field2332.length + class469.field6967 - class236.field4089;
                }
                int var11 = class141.field2332[0].length;
                if (class141.field2332[0].length + class475.field7033 > class276.field4537) {
                    var11 -= class141.field2332[0].length + class475.field7033 - class276.field4537;
                }
                int var12 = class104.field1703;
                while (true) {
                    if (var12 >= var10) {
                        class424.field6390.method2204(class360.field5592[var8], var8, true, var9, -110);
                        break;
                    }
                    int var13 = class469.field6967 + var12 - class104.field1703;
                    for (int var14 = class383.field5914; var14 < var11; var14++) {
                        class205.field3249[var12][var14] = false;
                        if (class141.field2332[var12][var14]) {
                            int var15 = class475.field7033 + var14 - class383.field5914;
                            for (int var16 = var8; var16 >= 0; var16--) {
                                if (class66.field977[var16][var13][var15] != null && class66.field977[var16][var13][var15].field6916 == var8) {
                                    class205.field3249[var12][var14] = class66.field977[var16][var13][var15].field6920;
                                    break;
                                }
                            }
                        }
                    }
                    var12++;
                }
            } else {
                class424.field6390.method2204(class360.field5592[var8], var8, false, var9, -121);
            }
            class424.field6390.method2207((byte) 123);
        }
        if (!class308.method1958(true)) {
            class308.method1958(false);
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(III[B)Z")
    public final boolean method2640(int arg0, int arg1, int arg2, byte[] arg3) {
        field6513++;
        class172 var5 = this.field6515;
        synchronized (this.field6515) {
            if (arg2 > arg0 || this.field6520 < arg0) {
                throw new IllegalArgumentException();
            }
            boolean var6 = this.method2641(true, arg3, false, arg1, arg0);
            if (!var6) {
                var6 = this.method2641(false, arg3, false, arg1, arg0);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(Z[BZII)Z")
    private final boolean method2641(boolean arg0, byte[] arg1, boolean arg2, int arg3, int arg4) {
        field6509++;
        class172 var6 = this.field6515;
        synchronized (this.field6515) {
            if (arg2) {
                this.field6516 = -54;
            }
            try {
                int var8;
                if (arg0) {
                    if (((long) (arg3 * 6 + 6)) > this.field6510.method1162((byte) 66)) {
                        return false;
                    }
                    this.field6510.method1170((long) (arg3 * 6), (byte) 36);
                    this.field6510.method1168(0, 6, class300.field4817, -1);
                    var8 = ((class300.field4817[4] & 0xFF) << 8) + ((class300.field4817[3] & 0xFF) << 16) + (class300.field4817[5] & 0xFF);
                    if (var8 <= 0 || ((long) var8) > (this.field6515.method1162((byte) 66) / 520L)) {
                        return false;
                    }
                } else {
                    var8 = (int) ((this.field6515.method1162((byte) 66) + 519L) / 520L);
                    if (var8 == 0) {
                        var8 = 1;
                    }
                }
                class300.field4817[5] = (byte) var8;
                class300.field4817[4] = (byte) (var8 >> 8);
                class300.field4817[2] = (byte) arg4;
                class300.field4817[3] = (byte) (var8 >> 16);
                class300.field4817[1] = (byte) (arg4 >> 8);
                class300.field4817[0] = (byte) (arg4 >> 16);
                this.field6510.method1170((long) (arg3 * 6), (byte) -126);
                this.field6510.method1165(-1, class300.field4817, 6, 0);
                int var10 = 0;
                int var11 = 0;
                while (arg4 > var10) {
                    int var12 = 0;
                    if (arg0) {
                        label108: {
                            this.field6515.method1170((long) (var8 * 520), (byte) -124);
                            try {
                                this.field6515.method1168(0, 8, class300.field4817, -1);
                            } catch (EOFException var33) {
                                return true;
                            }
                            int var13 = (class300.field4817[0] & 0xFF << 8) + (class300.field4817[1] & 0xFF);
                            int var14 = (class300.field4817[2] & 0xFF << 8) + (class300.field4817[3] & 0xFF);
                            var12 = ((class300.field4817[4] & 0xFF) << 16) - (-((class300.field4817[5] & 0xFF) << 8) - (class300.field4817[6] & 0xFF));
                            int var15 = class300.field4817[7] & 0xFF;
                            if (arg3 == var13 && var11 == var14 && this.field6516 == var15) {
                                if (var12 >= 0 && (this.field6515.method1162((byte) 66) / 520L) >= ((long) var12)) {
                                    break label108;
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                    if (var12 == 0) {
                        arg0 = false;
                        var12 = (int) ((this.field6515.method1162((byte) 66) + 519L) / 520L);
                        if (var12 == 0) {
                            var12++;
                        }
                        if (var8 == var12) {
                            var12++;
                        }
                    }
                    class300.field4817[3] = (byte) var11;
                    class300.field4817[0] = (byte) (arg3 >> 8);
                    if ((arg4 - var10) <= 512) {
                        var12 = 0;
                    }
                    class300.field4817[2] = (byte) (var11 >> 8);
                    class300.field4817[1] = (byte) arg3;
                    class300.field4817[7] = (byte) this.field6516;
                    class300.field4817[5] = (byte) (var12 >> 8);
                    class300.field4817[4] = (byte) (var12 >> 16);
                    class300.field4817[6] = (byte) var12;
                    this.field6515.method1170((long) (var8 * 520), (byte) 126);
                    this.field6515.method1165(-1, class300.field4817, 8, 0);
                    int var18 = arg4 - var10;
                    if (var18 > 512) {
                        var18 = 512;
                    }
                    this.field6515.method1165(-1, arg1, var18, var10);
                    var10 += var18;
                    var11++;
                    var8 = var12;
                }
                return true;
            } catch (IOException var34) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(I)V")
    public static void method2642(int arg0) {
        field6512 = null;
        field6517 = null;
        if (arg0 != 65280) {
            method2639(-63, null, 64, (byte) 92, -49, -71);
        }
        field6519 = null;
    }

    @OriginalMember(owner = "client!pd", name = "<init>", descriptor = "(ILok;Lok;I)V")
    public class436(int arg0, class172 arg1, class172 arg2, int arg3) {
        this.field6516 = arg0;
        this.field6510 = arg2;
        this.field6515 = arg1;
        this.field6520 = arg3;
    }
}
