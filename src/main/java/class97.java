import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wk")
public class class97 {

    @OriginalMember(owner = "client!wk", name = "b", descriptor = "I")
    private int field1262 = 65000;

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "Lie;")
    private class6 field1261 = null;

    @OriginalMember(owner = "client!wk", name = "f", descriptor = "Lie;")
    private class6 field1266 = null;

    @OriginalMember(owner = "client!wk", name = "c", descriptor = "I")
    private int field1263;

    @OriginalMember(owner = "client!wk", name = "e", descriptor = "Ltn;")
    public static class60 field1265 = new class60(46, 11);

    @OriginalMember(owner = "client!wk", name = "n", descriptor = "Lam;")
    public static class455 field1274 = new class455();

    @OriginalMember(owner = "client!wk", name = "o", descriptor = "[I")
    public static int[] field1275 = new int[4096];

    @OriginalMember(owner = "client!wk", name = "q", descriptor = "Leh;")
    public static class246 field1277 = new class246(40, -1);

    @OriginalMember(owner = "client!wk", name = "r", descriptor = "I")
    public static int field1278 = -1;

    @OriginalMember(owner = "client!wk", name = "d", descriptor = "I")
    public static int field1264;

    @OriginalMember(owner = "client!wk", name = "g", descriptor = "I")
    public static int field1267;

    @OriginalMember(owner = "client!wk", name = "h", descriptor = "I")
    public static int field1268;

    @OriginalMember(owner = "client!wk", name = "i", descriptor = "I")
    public static int field1269;

    @OriginalMember(owner = "client!wk", name = "j", descriptor = "I")
    public static int field1270;

    @OriginalMember(owner = "client!wk", name = "k", descriptor = "I")
    public static int field1271;

    @OriginalMember(owner = "client!wk", name = "l", descriptor = "I")
    public static int field1272;

    @OriginalMember(owner = "client!wk", name = "m", descriptor = "I")
    public static int field1273;

    @OriginalMember(owner = "client!wk", name = "p", descriptor = "I")
    public static int field1276;

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(I)V", line = 3)
    public static void method683(int arg0) {
        field1277 = null;
        field1275 = null;
        if (arg0 == -2029631744) {
            field1274 = null;
            field1265 = null;
        }
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(I[BII)Z", line = 18)
    public final boolean method684(int arg0, byte[] arg1, int arg2, int arg3) {
        field1271++;
        class6 var5 = this.field1261;
        synchronized (this.field1261) {
            if (arg2 < 0 || arg2 > this.field1262) {
                throw new IllegalArgumentException();
            } else if (arg3 == 4) {
                boolean var7 = this.method690(1, arg0, arg1, arg2, true);
                if (!var7) {
                    var7 = this.method690(arg3 - 3, arg0, arg1, arg2, false);
                }
                return var7;
            } else {
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(ZLwm;)Lsh;", line = 47)
    public static final class51 method685(boolean arg0, class403 arg1) {
        field1270++;
        return arg0 ? null : new class51(arg1.method2371(7162), arg1.method2371(7162), arg1.method2371(7162), arg1.method2371(7162), arg1.method2323((byte) 100), arg1.method2323((byte) 107), arg1.method2357((byte) 118));
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(IZ)[B", line = 60)
    public final byte[] method686(int arg0, boolean arg1) {
        field1273++;
        class6 var3 = this.field1261;
        synchronized (this.field1261) {
            if (!arg1) {
                this.method684(-83, null, -29, 66);
            }
            try {
                if ((long) (arg0 * 6 + 6) > this.field1266.method45((byte) 127)) {
                    return null;
                }
                this.field1266.method44((long) (arg0 * 6), -30985);
                this.field1266.method38((byte) -125, 0, class437.field6133, 6);
                int var5 = (class437.field6133[1] & 0xFF << 8) + ((class437.field6133[0] & 0xFF) << 16) + (class437.field6133[2] & 0xFF);
                int var6 = (class437.field6133[5] & 0xFF) + (class437.field6133[4] & 0xFF << 8) + (class437.field6133[3] & 0xFF << 16);
                if (var5 < 0 || this.field1262 < var5) {
                    return null;
                } else if (var6 > 0 && (this.field1261.method45((byte) 118) / 520L) >= ((long) var6)) {
                    byte[] var9 = new byte[var5];
                    int var10 = 0;
                    int var11 = 0;
                    while (var5 > var10) {
                        if (var6 == 0) {
                            return null;
                        }
                        this.field1261.method44((long) (var6 * 520), -30985);
                        int var13 = var5 - var10;
                        if (var13 > 512) {
                            var13 = 512;
                        }
                        this.field1261.method38((byte) -117, 0, class437.field6133, var13 + 8);
                        int var14 = (class437.field6133[0] & 0xFF << 8) + (class437.field6133[1] & 0xFF);
                        int var15 = ((class437.field6133[2] & 0xFF) << 8) + (class437.field6133[3] & 0xFF);
                        int var16 = (class437.field6133[4] & 0xFF << 16) + (class437.field6133[5] & 0xFF << 8) + (class437.field6133[6] & 0xFF);
                        int var17 = class437.field6133[7] & 0xFF;
                        if (arg0 == var14 && var11 == var15 && this.field1263 == var17) {
                            if (var16 >= 0 && (long) var16 <= this.field1261.method45((byte) -55) / 520L) {
                                for (int var20 = 0; var20 < var13; var20++) {
                                    var9[var10++] = class437.field6133[var20 + 8];
                                }
                                var11++;
                                var6 = var16;
                                continue;
                            }
                            return null;
                        }
                        return null;
                    }
                    return var9;
                } else {
                    return null;
                }
            } catch (IOException var39) {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!wk", name = "<init>", descriptor = "(ILie;Lie;I)V", line = 300)
    public class97(int arg0, class6 arg1, class6 arg2, int arg3) {
        this.field1263 = arg0;
        this.field1261 = arg1;
        this.field1266 = arg2;
        this.field1262 = arg3;
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lbp;", line = 148)
    public static final class266 method687(Throwable arg0, String arg1) {
        field1264++;
        class266 var2;
        if ((arg0 instanceof class266)) {
            var2 = (class266) arg0;
            var2.field3892 = var2.field3892 + ' ' + arg1;
        } else {
            var2 = new class266(arg0, arg1);
        }
        return var2;
    }

    @OriginalMember(owner = "client!wk", name = "toString", descriptor = "()Ljava/lang/String;", line = 169)
    public final String toString() {
        field1267++;
        return "Cache:" + this.field1263;
    }

    @OriginalMember(owner = "client!wk", name = "b", descriptor = "(I)V", line = 178)
    public static final void method688(int arg0) {
        if (class327.field4768 < 1024.0F) {
            class327.field4768 = 1024.0F;
        }
        field1269++;
        if (class327.field4768 > 3072.0F) {
            class327.field4768 = 3072.0F;
        }
        while (class153.field2204 >= 16384.0F) {
            class153.field2204 -= 16384.0F;
        }
        while (class153.field2204 < 0.0F) {
            class153.field2204 += 16384.0F;
        }
        if (arg0 != -16503) {
            return;
        }
        int var1 = class267.field3903 >> 7;
        int var2 = class220.field3175 >> 7;
        int var3 = class488.method2817(class267.field3903, true, class220.field3175, class320.field4627);
        int var4 = 0;
        if (var1 > 3 && var2 > 3 && (class43.field494 - 4) > var1 && class500.field7068 - 4 > var2) {
            for (int var5 = var1 - 4; var5 <= (var1 + 4); var5++) {
                for (int var6 = var2 - 4; var6 <= var2 + 4; var6++) {
                    int var7 = class320.field4627;
                    if (var7 < 3 && class362.method2135(var6, 44, var5)) {
                        var7++;
                    }
                    int var8 = 0;
                    if (class450.field6304.field7793 != null && class450.field6304.field7793[var7] != null) {
                        var8 = (class450.field6304.field7793[var7][var5][var6] & 0xFF) * 8;
                    }
                    int var9 = var3 + var8 - class330.field4818[var7].method10(var5, var6);
                    if (var4 < var9) {
                        var4 = var9;
                    }
                }
            }
        }
        int var10 = (var4 >> 0) * 1536;
        if (var10 > 786432) {
            var10 = 786432;
        }
        if (var10 < 262144) {
            var10 = 262144;
        }
        if (var10 > class364.field5209) {
            class364.field5209 += (var10 - class364.field5209) / 24;
        } else if (class364.field5209 > var10) {
            class364.field5209 += (var10 - class364.field5209) / 80;
        }
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(B)V", line = 276)
    public static final void method689(byte arg0) {
        if (arg0 <= 125) {
            method687(null, null);
        }
        field1272++;
        class134.field1759.method318(class498.field7058, class4.field81.field1438 ? class81.field1053 + 256 << 0 : -1, 256);
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(II[BIZ)Z", line = 317)
    private final boolean method690(int arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        field1268++;
        class6 var6 = this.field1261;
        synchronized (this.field1261) {
            try {
                int var8;
                if (arg4) {
                    if (this.field1266.method45((byte) -65) < (long) (arg1 * 6 + 6)) {
                        return false;
                    }
                    this.field1266.method44((long) (arg1 * 6), -30985);
                    this.field1266.method38((byte) -128, 0, class437.field6133, 6);
                    var8 = (class437.field6133[4] & 0xFF << 8) + ((class437.field6133[3] & 0xFF << 16) + (class437.field6133[5] & 0xFF));
                    if (var8 <= 0 || ((long) var8) > (this.field1261.method45((byte) 102) / 520L)) {
                        return false;
                    }
                } else {
                    var8 = (int) ((this.field1261.method45((byte) 125) + 519L) / 520L);
                    if (var8 == 0) {
                        var8 = 1;
                    }
                }
                class437.field6133[2] = (byte) arg3;
                class437.field6133[0] = (byte) (arg3 >> 16);
                class437.field6133[5] = (byte) var8;
                class437.field6133[arg0] = (byte) (arg3 >> 8);
                class437.field6133[4] = (byte) (var8 >> 8);
                class437.field6133[3] = (byte) (var8 >> 16);
                this.field1266.method44((long) (arg1 * 6), arg0 - 30986);
                this.field1266.method39(6, 0, class437.field6133, arg0 - 2);
                int var10 = 0;
                int var11 = 0;
                while (arg3 > var10) {
                    int var12 = 0;
                    if (arg4) {
                        label104: {
                            this.field1261.method44((long) (var8 * 520), -30985);
                            try {
                                this.field1261.method38((byte) -86, 0, class437.field6133, 8);
                            } catch (EOFException var33) {
                                return true;
                            }
                            int var13 = ((class437.field6133[0] & 0xFF) << 8) + (class437.field6133[1] & 0xFF);
                            int var14 = ((class437.field6133[2] & 0xFF) << 8) + (class437.field6133[3] & 0xFF);
                            var12 = ((class437.field6133[4] & 0xFF) << 16) - (-(class437.field6133[5] & 0xFF << 8) - (class437.field6133[6] & 0xFF));
                            int var15 = class437.field6133[7] & 0xFF;
                            if (arg1 == var13 && var11 == var14 && this.field1263 == var15) {
                                if (var12 >= 0 && (this.field1261.method45((byte) 119) / 520L) >= ((long) var12)) {
                                    break label104;
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                    if (var12 == 0) {
                        arg4 = false;
                        var12 = (int) ((this.field1261.method45((byte) 58) + 519L) / 520L);
                        if (var12 == 0) {
                            var12++;
                        }
                        if (var8 == var12) {
                            var12++;
                        }
                    }
                    class437.field6133[3] = (byte) var11;
                    if (arg3 - var10 <= 512) {
                        var12 = 0;
                    }
                    class437.field6133[0] = (byte) (arg1 >> 8);
                    class437.field6133[1] = (byte) arg1;
                    class437.field6133[2] = (byte) (var11 >> 8);
                    class437.field6133[6] = (byte) var12;
                    class437.field6133[5] = (byte) (var12 >> 8);
                    class437.field6133[7] = (byte) this.field1263;
                    class437.field6133[4] = (byte) (var12 >> 16);
                    this.field1261.method44((long) (var8 * 520), -30985);
                    this.field1261.method39(8, 0, class437.field6133, -1);
                    int var18 = arg3 - var10;
                    if (var18 > 512) {
                        var18 = 512;
                    }
                    this.field1261.method39(var18, var10, arg2, arg0 ^ 0xFFFFFFFE);
                    var11++;
                    var8 = var12;
                    var10 += var18;
                }
                return true;
            } catch (IOException var34) {
                return false;
            }
        }
    }
}
