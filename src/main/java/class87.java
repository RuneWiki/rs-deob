import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!je")
public class class87 {

    @OriginalMember(owner = "client!je", name = "b", descriptor = "I")
    private int field1536 = 65000;

    @OriginalMember(owner = "client!je", name = "h", descriptor = "Ljc;")
    private class85 field1542 = null;

    @OriginalMember(owner = "client!je", name = "a", descriptor = "Ljc;")
    private class85 field1535 = null;

    @OriginalMember(owner = "client!je", name = "q", descriptor = "I")
    private int field1551;

    @OriginalMember(owner = "client!je", name = "d", descriptor = "Lai;")
    public static class10 field1538 = class44.method278("<img=0>", -122);

    @OriginalMember(owner = "client!je", name = "n", descriptor = "I")
    public static int field1548 = 0;

    @OriginalMember(owner = "client!je", name = "k", descriptor = "Lai;")
    public static class10 field1545 = class44.method278(":assistreq:", 98);

    @OriginalMember(owner = "client!je", name = "p", descriptor = "Z")
    public static volatile boolean field1550 = true;

    @OriginalMember(owner = "client!je", name = "l", descriptor = "[J")
    public static long[] field1546 = new long[32];

    @OriginalMember(owner = "client!je", name = "c", descriptor = "I")
    public static int field1537;

    @OriginalMember(owner = "client!je", name = "e", descriptor = "I")
    public static int field1539;

    @OriginalMember(owner = "client!je", name = "f", descriptor = "I")
    public static int field1540;

    @OriginalMember(owner = "client!je", name = "g", descriptor = "I")
    public static int field1541;

    @OriginalMember(owner = "client!je", name = "i", descriptor = "I")
    public static int field1543;

    @OriginalMember(owner = "client!je", name = "j", descriptor = "I")
    public static int field1544;

    @OriginalMember(owner = "client!je", name = "o", descriptor = "I")
    public static int field1549;

    @OriginalMember(owner = "client!je", name = "r", descriptor = "I")
    public static int field1552;

    @OriginalMember(owner = "client!je", name = "m", descriptor = "[I")
    public static int[] field1547;

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(IZLwa;)I")
    public static final int method530(int arg0, boolean arg1, class200 arg2) {
        field1543++;
        if (arg2.field3924 == null || arg0 >= arg2.field3924.length) {
            return -2;
        }
        try {
            int[] var3 = arg2.field3924[arg0];
            if (arg1) {
                return -34;
            }
            int var4 = 0;
            int var5 = 0;
            byte var6 = 0;
            while (true) {
                int var7 = 0;
                int var8 = var3[var5++];
                byte var9 = 0;
                if (var8 == 0) {
                    return var4;
                }
                if (var8 == 15) {
                    var9 = 1;
                }
                if (var8 == 1) {
                    var7 = class172.field3319[var3[var5++]];
                }
                if (var8 == 2) {
                    var7 = class107.field1991[var3[var5++]];
                }
                if (var8 == 3) {
                    var7 = class65.field1135[var3[var5++]];
                }
                if (var8 == 4) {
                    int var10 = var3[var5++] << 16;
                    int var11 = var10 + var3[var5++];
                    class200 var12 = class66.method432(var11, false);
                    int var13 = var3[var5++];
                    if (var13 != -1 && (!class104.method678(500, var13).field1713 || class25.field377)) {
                        for (int var14 = 0; var14 < var12.field3883.length; var14++) {
                            if (var13 + 1 == var12.field3883[var14]) {
                                var7 += var12.field3905[var14];
                            }
                        }
                    }
                }
                if (var8 == 16) {
                    var9 = 2;
                }
                if (var8 == 17) {
                    var9 = 3;
                }
                if (var8 == 5) {
                    var7 = class13.field215[var3[var5++]];
                }
                if (var8 == 6) {
                    var7 = class117.field2249[class107.field1991[var3[var5++]] - 1];
                }
                if (var8 == 7) {
                    var7 = class13.field215[var3[var5++]] * 100 / 46875;
                }
                if (var8 == 8) {
                    var7 = class145.field2767.field594;
                }
                if (var8 == 9) {
                    for (int var15 = 0; var15 < 25; var15++) {
                        if (class172.field3336[var15]) {
                            var7 += class107.field1991[var15];
                        }
                    }
                }
                if (var8 == 10) {
                    int var16 = var3[var5++] << 16;
                    int var17 = var16 + var3[var5++];
                    class200 var18 = class66.method432(var17, false);
                    int var19 = var3[var5++];
                    if (var19 != -1 && (!class104.method678(500, var19).field1713 || class25.field377)) {
                        for (int var20 = 0; var20 < var18.field3883.length; var20++) {
                            if (var19 + 1 == var18.field3883[var20]) {
                                var7 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var8 == 11) {
                    var7 = class149.field2875;
                }
                if (var8 == 12) {
                    var7 = class154.field2982;
                }
                if (var8 == 13) {
                    int var21 = class13.field215[var3[var5++]];
                    int var22 = var3[var5++];
                    var7 = (0x1 << var22 & var21) == 0 ? 0 : 1;
                }
                if (var8 == 14) {
                    int var23 = var3[var5++];
                    var7 = class207.method1336((byte) 87, var23);
                }
                if (var8 == 18) {
                    var7 = (class145.field2767.field1100 >> 7) + class2.field16;
                }
                if (var8 == 19) {
                    var7 = (class145.field2767.field1097 >> 7) + class200.field3767;
                }
                if (var8 == 20) {
                    var7 = var3[var5++];
                }
                if (var9 == 0) {
                    if (var6 == 0) {
                        var4 += var7;
                    }
                    if (var6 == 1) {
                        var4 -= var7;
                    }
                    if (var6 == 2 && var7 != 0) {
                        var4 /= var7;
                    }
                    if (var6 == 3) {
                        var4 *= var7;
                    }
                    var6 = 0;
                } else {
                    var6 = var9;
                }
            }
        } catch (Exception var24) {
            return -1;
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(III)I")
    public static final int method531(int arg0, int arg1, int arg2) {
        field1544++;
        int var3 = 12 / ((arg1 + 37) / 37);
        class131 var4 = (class131) class101.field1882.method213(-127, (long) arg0);
        if (var4 == null) {
            return 0;
        } else if (arg2 >= 0 && arg2 < var4.field2479.length) {
            return var4.field2479[arg2];
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(IIII)I")
    public static final int method532(int arg0, int arg1, int arg2, int arg3) {
        field1552++;
        int var4 = arg0 / arg2;
        int var5 = arg0 & arg2 - 1;
        int var6 = arg1 & arg2 - 1;
        int var7 = arg1 / arg2;
        int var8 = class75.method465(var4, var7, -119);
        if (arg3 < 3) {
            field1545 = null;
        }
        int var9 = class75.method465(var4 + 1, var7, -119);
        int var10 = class75.method465(var4, var7 + 1, -114);
        int var11 = class75.method465(var4 + 1, var7 - -1, -111);
        int var12 = class9.method31(var8, var5, var9, 65536, arg2);
        int var13 = class9.method31(var10, var5, var11, 65536, arg2);
        return class9.method31(var12, var6, var13, 65536, arg2);
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(II)V")
    public static final void method533(int arg0, int arg1) {
        field1549++;
        class131 var2 = (class131) class101.field1882.method213(122, (long) arg1);
        if (var2 != null) {
            var2.method848(false);
            int var3 = -50 % ((arg0 + 56) / 54);
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(I[BIBZ)Z")
    private final boolean method534(int arg0, byte[] arg1, int arg2, byte arg3, boolean arg4) {
        field1537++;
        class85 var6 = this.field1542;
        synchronized (this.field1542) {
            try {
                int var8;
                if (arg4) {
                    if (this.field1535.method516((byte) 113) < (long) (arg2 * 6 + 6)) {
                        return false;
                    }
                    this.field1535.method524((long) (arg2 * 6), (byte) 112);
                    this.field1535.method522(0, 6, class39.field659, 86);
                    var8 = ((class39.field659[3] & 0xFF) << 16) + (class39.field659[5] & 0xFF) + ((class39.field659[4] & 0xFF) << 8);
                    if (var8 <= 0 || this.field1542.method516((byte) 113) / 520L < (long) var8) {
                        return false;
                    }
                } else {
                    var8 = (int) ((this.field1542.method516((byte) 113) + 519L) / 520L);
                    if (var8 == 0) {
                        var8 = 1;
                    }
                }
                class39.field659[0] = (byte) (arg0 >> 16);
                if (arg3 >= -111) {
                    return true;
                }
                class39.field659[2] = (byte) arg0;
                class39.field659[5] = (byte) var8;
                class39.field659[1] = (byte) (arg0 >> 8);
                class39.field659[4] = (byte) (var8 >> 8);
                class39.field659[3] = (byte) (var8 >> 16);
                this.field1535.method524((long) (arg2 * 6), (byte) 112);
                int var11 = 0;
                this.field1535.method525(105, 6, 0, class39.field659);
                int var12 = 0;
                while (var11 < arg0) {
                    int var13 = 0;
                    if (arg4) {
                        label110: {
                            this.field1542.method524((long) (var8 * 520), (byte) 112);
                            try {
                                this.field1542.method522(0, 8, class39.field659, -109);
                            } catch (EOFException var36) {
                                return true;
                            }
                            int var14 = ((class39.field659[0] & 0xFF) << 8) + (class39.field659[1] & 0xFF);
                            var13 = ((class39.field659[4] & 0xFF) << 16) + ((class39.field659[5] & 0xFF) << 8) + (class39.field659[6] & 0xFF);
                            int var15 = class39.field659[7] & 0xFF;
                            int var16 = ((class39.field659[2] & 0xFF) << 8) + (class39.field659[3] & 0xFF);
                            if (arg2 == var14 && var12 == var16 && this.field1551 == var15) {
                                if (var13 >= 0 && (long) var13 <= this.field1542.method516((byte) 113) / 520L) {
                                    break label110;
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                    int var19 = arg0 - var11;
                    if (var19 > 512) {
                        var19 = 512;
                    }
                    if (var13 == 0) {
                        var13 = (int) ((this.field1542.method516((byte) 113) + 519L) / 520L);
                        arg4 = false;
                        if (var13 == 0) {
                            var13++;
                        }
                        if (var8 == var13) {
                            var13++;
                        }
                    }
                    if (arg0 - var11 <= 512) {
                        var13 = 0;
                    }
                    class39.field659[1] = (byte) arg2;
                    class39.field659[7] = (byte) this.field1551;
                    class39.field659[4] = (byte) (var13 >> 16);
                    class39.field659[2] = (byte) (var12 >> 8);
                    class39.field659[6] = (byte) var13;
                    class39.field659[0] = (byte) (arg2 >> 8);
                    class39.field659[3] = (byte) var12;
                    var12++;
                    class39.field659[5] = (byte) (var13 >> 8);
                    this.field1542.method524((long) (var8 * 520), (byte) 112);
                    this.field1542.method525(87, 8, 0, class39.field659);
                    var8 = var13;
                    this.field1542.method525(81, var19, var11, arg1);
                    var11 += var19;
                }
                return true;
            } catch (IOException var37) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(B)V")
    public static void method535(byte arg0) {
        field1546 = null;
        field1545 = null;
        field1547 = null;
        if (arg0 < 91) {
            method531(9, -32, -26);
        }
        field1538 = null;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(I[BII)Z")
    public final boolean method536(int arg0, byte[] arg1, int arg2, int arg3) {
        field1539++;
        class85 var5 = this.field1542;
        synchronized (this.field1542) {
            if (arg2 < 0 || this.field1536 < arg2) {
                throw new IllegalArgumentException();
            }
            boolean var6 = this.method534(arg2, arg1, arg0, (byte) -113, true);
            if (!var6) {
                var6 = this.method534(arg2, arg1, arg0, (byte) -119, false);
            }
            if (arg3 != 0) {
                this.toString();
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!je", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field1540++;
        return "Cache:" + this.field1551;
    }

    @OriginalMember(owner = "client!je", name = "b", descriptor = "(II)[B")
    public final byte[] method537(int arg0, int arg1) {
        field1541++;
        class85 var3 = this.field1542;
        synchronized (this.field1542) {
            try {
                if (this.field1535.method516((byte) 113) < (long) (arg0 * 6 + 6)) {
                    return null;
                }
                this.field1535.method524((long) (arg0 * 6), (byte) 112);
                this.field1535.method522(0, 6, class39.field659, 121);
                int var5 = ((class39.field659[3] & 0xFF) << 16) + ((class39.field659[4] & 0xFF) << 8) + (class39.field659[5] & 0xFF);
                int var6 = ((class39.field659[0] & 0xFF) << 16) - (-((class39.field659[1] & 0xFF) << 8) - (class39.field659[2] & 0xFF));
                if (var6 < 0 || this.field1536 < var6) {
                    return null;
                } else if (var5 > 0 && (long) var5 <= this.field1542.method516((byte) 113) / 520L) {
                    byte[] var9 = new byte[var6];
                    int var10 = 0;
                    int var11 = 0;
                    int var12 = 22 / ((arg1 + 56) / 47);
                    label70: while (var6 > var10) {
                        if (var5 == 0) {
                            return null;
                        }
                        this.field1542.method524((long) (var5 * 520), (byte) 112);
                        int var14 = var6 - var10;
                        if (var14 > 512) {
                            var14 = 512;
                        }
                        this.field1542.method522(0, var14 + 8, class39.field659, 65);
                        int var15 = ((class39.field659[0] & 0xFF) << 8) + (class39.field659[1] & 0xFF);
                        int var16 = ((class39.field659[2] & 0xFF) << 8) + (class39.field659[3] & 0xFF);
                        int var17 = class39.field659[7] & 0xFF;
                        int var18 = (class39.field659[6] & 0xFF) + ((class39.field659[5] & 0xFF) << 8) + ((class39.field659[4] & 0xFF) << 16);
                        if (arg0 == var15 && var11 == var16 && this.field1551 == var17) {
                            if (var18 >= 0 && this.field1542.method516((byte) 113) / 520L >= (long) var18) {
                                var5 = var18;
                                var11++;
                                int var21 = 0;
                                while (true) {
                                    if (var14 <= var21) {
                                        continue label70;
                                    }
                                    var9[var10++] = class39.field659[var21 + 8];
                                    var21++;
                                }
                            }
                            return null;
                        }
                        return null;
                    }
                    return var9;
                } else {
                    return null;
                }
            } catch (IOException var40) {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!je", name = "<init>", descriptor = "(ILjc;Ljc;I)V")
    public class87(int arg0, class85 arg1, class85 arg2, int arg3) {
        this.field1551 = arg0;
        this.field1542 = arg1;
        this.field1536 = arg3;
        this.field1535 = arg2;
    }
}
