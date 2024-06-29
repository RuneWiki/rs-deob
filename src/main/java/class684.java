import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kv")
public class class684 {

    @OriginalMember(owner = "client!kv", name = "j", descriptor = "Lsg;")
    private class17 field9511 = null;

    @OriginalMember(owner = "client!kv", name = "d", descriptor = "I")
    private int field9505 = 65000;

    @OriginalMember(owner = "client!kv", name = "i", descriptor = "Lsg;")
    private class17 field9510 = null;

    @OriginalMember(owner = "client!kv", name = "b", descriptor = "I")
    private int field9503;

    @OriginalMember(owner = "client!kv", name = "l", descriptor = "[I")
    public static int[] field9513 = new int[2];

    @OriginalMember(owner = "client!kv", name = "h", descriptor = "Lgw;")
    public static class690 field9509 = new class690(5);

    @OriginalMember(owner = "client!kv", name = "m", descriptor = "Lst;")
    public static class335 field9514 = new class335(68, 15);

    @OriginalMember(owner = "client!kv", name = "o", descriptor = "Z")
    public static boolean field9516 = true;

    @OriginalMember(owner = "client!kv", name = "n", descriptor = "Lip;")
    public static class306 field9515 = new class306();

    @OriginalMember(owner = "client!kv", name = "p", descriptor = "F")
    public static float field9517;

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "I")
    public static int field9502;

    @OriginalMember(owner = "client!kv", name = "c", descriptor = "I")
    public static int field9504;

    @OriginalMember(owner = "client!kv", name = "e", descriptor = "I")
    public static int field9506;

    @OriginalMember(owner = "client!kv", name = "f", descriptor = "I")
    public static int field9507;

    @OriginalMember(owner = "client!kv", name = "g", descriptor = "I")
    public static int field9508;

    @OriginalMember(owner = "client!kv", name = "k", descriptor = "I")
    public static int field9512;

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(IIIII)V")
    public static final void method3852(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field9507++;
        if (arg2 != -1) {
            method3852(47, 87, 107, -79, -123);
        }
        for (class457 var5 = (class457) class303.field4285.method3618(113); var5 != null; var5 = (class457) class303.field4285.method3619(0)) {
            class39.method211(-257, arg0, arg1, arg3, var5, arg4);
        }
        for (class457 var6 = (class457) class649.field8701.method3618(123); var6 != null; var6 = (class457) class649.field8701.method3619(0)) {
            byte var12 = 1;
            class32 var13 = var6.field6333.method3084((byte) -92);
            if (var6.field6333.field7159 == -1 || var6.field6333.field7165) {
                var12 = 0;
            } else if (var6.field6333.field7159 == var13.field420 || var6.field6333.field7159 == var13.field379 || var6.field6333.field7159 == var13.field398 || var6.field6333.field7159 == var13.field414) {
                var12 = 2;
            } else if (var6.field6333.field7159 == var13.field407 || var6.field6333.field7159 == var13.field415 || var6.field6333.field7159 == var13.field418 || var6.field6333.field7159 == var13.field421) {
                var12 = 3;
            }
            if (var6.field6328 != var12) {
                int var14 = class260.method1759(var6.field6333, -1);
                class123 var15 = var6.field6333.field9436;
                if (var15.field1700 != null) {
                    var15 = var15.method773(class124.field1712, false);
                }
                if (var15 == null || var14 == -1) {
                    var6.field6355 = false;
                    var6.field6328 = var12;
                    var6.field6327 = -1;
                } else if (var6.field6327 == var14 && var6.field6355 == var15.field1644) {
                    var6.field6328 = var12;
                    var6.field6325 = var15.field1692;
                } else {
                    boolean var16 = false;
                    if (var6.field6340 == null) {
                        var16 = true;
                    } else {
                        var6.field6325 -= 512;
                        if (var6.field6325 <= 0) {
                            class483.field6739.method361(var6.field6340);
                            var16 = true;
                            var6.field6340 = null;
                        }
                    }
                    if (var16) {
                        var6.field6355 = var15.field1644;
                        var6.field6325 = var15.field1692;
                        var6.field6327 = var14;
                        var6.field6326 = null;
                        var6.field6328 = var12;
                        var6.field6356 = null;
                    }
                }
            }
            var6.field6344 = var6.field6333.field4410;
            var6.field6352 = var6.field6333.field4410 + (var6.field6333.method662((byte) 15) << 8);
            var6.field6338 = var6.field6333.field4418;
            var6.field6331 = var6.field6333.field4418 + (var6.field6333.method662((byte) 15) << 8);
            class39.method211(-257, arg0, arg1, arg3, var6, arg4);
        }
        for (class457 var7 = (class457) class516.field7206.method821((byte) 122); var7 != null; var7 = (class457) class516.field7206.method818(arg2 ^ 0xFFFFFFD2)) {
            byte var8 = 1;
            class32 var9 = var7.field6343.method3084((byte) -92);
            if (var7.field6343.field7159 == -1 || var7.field6343.field7165) {
                var8 = 0;
            } else if (var7.field6343.field7159 == var9.field420 || var7.field6343.field7159 == var9.field379 || var7.field6343.field7159 == var9.field398 || var7.field6343.field7159 == var9.field414) {
                var8 = 2;
            } else if (var7.field6343.field7159 == var9.field407 || var7.field6343.field7159 == var9.field415 || var7.field6343.field7159 == var9.field418 || var7.field6343.field7159 == var9.field421) {
                var8 = 3;
            }
            if (var7.field6328 != var8) {
                int var10 = class720.method4035(var7.field6343, false);
                if (var7.field6327 == var10 && var7.field6343.field1330 == var7.field6355) {
                    var7.field6325 = var7.field6343.field1339;
                    var7.field6328 = var8;
                } else {
                    boolean var11 = false;
                    if (var7.field6340 == null) {
                        var11 = true;
                    } else {
                        var7.field6325 -= 512;
                        if (var7.field6325 <= 0) {
                            class483.field6739.method361(var7.field6340);
                            var11 = true;
                            var7.field6340 = null;
                        }
                    }
                    if (var11) {
                        var7.field6325 = var7.field6343.field1339;
                        var7.field6328 = var8;
                        var7.field6356 = null;
                        var7.field6327 = var10;
                        var7.field6326 = null;
                        var7.field6355 = var7.field6343.field1330;
                    }
                }
            }
            var7.field6344 = var7.field6343.field4410;
            var7.field6352 = var7.field6343.field4410 + (var7.field6343.method662((byte) 15) << 8);
            var7.field6338 = var7.field6343.field4418;
            var7.field6331 = var7.field6343.field4418 + (var7.field6343.method662((byte) 15) << 8);
            class39.method211(-257, arg0, arg1, arg3, var7, arg4);
        }
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(BI)[B")
    public final byte[] method3853(byte arg0, int arg1) {
        field9502++;
        class17 var3 = this.field9511;
        synchronized (this.field9511) {
            try {
                if ((long) (arg1 * 6 + 6) > this.field9510.method84(-1)) {
                    return null;
                }
                this.field9510.method79((long) (arg1 * 6), (byte) -128);
                this.field9510.method81(6, class490.field6893, false, 0);
                int var5 = (class490.field6893[2] & 0xFF) + ((class490.field6893[0] & 0xFF) << 16) + (class490.field6893[1] & 0xFF << 8);
                int var6 = ((class490.field6893[3] & 0xFF) << 16) + ((class490.field6893[4] & 0xFF) << 8) + (class490.field6893[5] & 0xFF);
                if (var5 < 0 || var5 > this.field9505) {
                    return null;
                } else if (var6 <= 0 || this.field9511.method84(-1) / 520L < (long) var6) {
                    return null;
                } else if (arg0 > -89) {
                    return null;
                } else {
                    byte[] var10 = new byte[var5];
                    int var11 = 0;
                    int var12 = 0;
                    while (var11 < var5) {
                        if (var6 == 0) {
                            return null;
                        }
                        this.field9511.method79((long) (var6 * 520), (byte) -128);
                        int var14 = var5 - var11;
                        if (var14 > 512) {
                            var14 = 512;
                        }
                        this.field9511.method81(var14 + 8, class490.field6893, false, 0);
                        int var15 = ((class490.field6893[0] & 0xFF) << 8) + (class490.field6893[1] & 0xFF);
                        int var16 = ((class490.field6893[2] & 0xFF) << 8) + (class490.field6893[3] & 0xFF);
                        int var17 = ((class490.field6893[4] & 0xFF) << 16) + (class490.field6893[6] & 0xFF) + ((class490.field6893[5] & 0xFF) << 8);
                        int var18 = class490.field6893[7] & 0xFF;
                        if (arg1 == var15 && var12 == var16 && this.field9503 == var18) {
                            if (var17 >= 0 && (long) var17 <= this.field9511.method84(-1) / 520L) {
                                var6 = var17;
                                for (int var21 = 0; var21 < var14; var21++) {
                                    var10[var11++] = class490.field6893[var21 + 8];
                                }
                                var12++;
                                continue;
                            }
                            return null;
                        }
                        return null;
                    }
                    return var10;
                }
            } catch (IOException var42) {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(III[B)Z")
    public final boolean method3854(int arg0, int arg1, int arg2, byte[] arg3) {
        field9512++;
        class17 var5 = this.field9511;
        synchronized (this.field9511) {
            if (arg0 != -26893) {
                return true;
            } else if (arg2 >= 0 && arg2 <= this.field9505) {
                boolean var7 = this.method3857(arg1, true, true, arg3, arg2);
                if (!var7) {
                    var7 = this.method3857(arg1, false, true, arg3, arg2);
                }
                return var7;
            } else {
                throw new IllegalArgumentException();
            }
        }
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(IIIB)V")
    public static final void method3855(int arg0, int arg1, int arg2, byte arg3) {
        if (arg3 != 76) {
            method3852(-46, -108, 52, 117, 101);
        }
        field9506++;
        if (arg2 == 1012) {
            class546.method3226(class547.field7604, arg1, arg0);
        } else if (arg2 == 1010) {
            class546.method3226(class310.field4324, arg1, arg0);
        } else if (arg2 == 1008) {
            class546.method3226(class700.field9769, arg1, arg0);
        } else if (arg2 == 1004) {
            class546.method3226(class398.field5724, arg1, arg0);
        } else if (arg2 == 1011) {
            class546.method3226(class401.field5745, arg1, arg0);
            return;
        }
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(I)V")
    public static void method3856(int arg0) {
        if (arg0 == 0) {
            field9514 = null;
            field9515 = null;
            field9509 = null;
            field9513 = null;
        }
    }

    @OriginalMember(owner = "client!kv", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field9508++;
        return "Cache:" + this.field9503;
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(IZZ[BI)Z")
    private final boolean method3857(int arg0, boolean arg1, boolean arg2, byte[] arg3, int arg4) {
        field9504++;
        class17 var6 = this.field9511;
        synchronized (this.field9511) {
            try {
                int var8;
                if (arg1) {
                    if ((long) (arg0 * 6 + 6) > this.field9510.method84(-1)) {
                        return false;
                    }
                    this.field9510.method79((long) (arg0 * 6), (byte) -128);
                    this.field9510.method81(6, class490.field6893, false, 0);
                    var8 = ((class490.field6893[4] & 0xFF) << 8) + (class490.field6893[3] & 0xFF << 16) + (class490.field6893[5] & 0xFF);
                    if (var8 <= 0 || ((long) var8) > (this.field9511.method84(-1) / 520L)) {
                        return false;
                    }
                } else {
                    var8 = (int) ((this.field9511.method84(-1) + 519L) / 520L);
                    if (var8 == 0) {
                        var8 = 1;
                    }
                }
                class490.field6893[4] = (byte) (var8 >> 8);
                class490.field6893[5] = (byte) var8;
                if (!arg2) {
                    this.method3857(-118, true, true, null, 31);
                }
                class490.field6893[2] = (byte) arg4;
                class490.field6893[0] = (byte) (arg4 >> 16);
                class490.field6893[3] = (byte) (var8 >> 16);
                class490.field6893[1] = (byte) (arg4 >> 8);
                this.field9510.method79((long) (arg0 * 6), (byte) -128);
                this.field9510.method78(107, class490.field6893, 0, 6);
                int var10 = 0;
                int var11 = 0;
                while (arg4 > var10) {
                    int var12 = 0;
                    if (arg1) {
                        label108: {
                            this.field9511.method79((long) (var8 * 520), (byte) -128);
                            try {
                                this.field9511.method81(8, class490.field6893, false, 0);
                            } catch (EOFException var33) {
                                return true;
                            }
                            int var13 = (class490.field6893[0] & 0xFF << 8) + (class490.field6893[1] & 0xFF);
                            var12 = ((class490.field6893[4] & 0xFF) << 16) + (class490.field6893[5] & 0xFF << 8) + (class490.field6893[6] & 0xFF);
                            int var14 = ((class490.field6893[2] & 0xFF) << 8) + (class490.field6893[3] & 0xFF);
                            int var15 = class490.field6893[7] & 0xFF;
                            if (arg0 == var13 && var11 == var14 && this.field9503 == var15) {
                                if (var12 >= 0 && ((long) var12) <= (this.field9511.method84(-1) / 520L)) {
                                    break label108;
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                    if (var12 == 0) {
                        arg1 = false;
                        var12 = (int) ((this.field9511.method84(-1) + 519L) / 520L);
                        if (var12 == 0) {
                            var12++;
                        }
                        if (var8 == var12) {
                            var12++;
                        }
                    }
                    class490.field6893[1] = (byte) arg0;
                    class490.field6893[3] = (byte) var11;
                    class490.field6893[2] = (byte) (var11 >> 8);
                    class490.field6893[0] = (byte) (arg0 >> 8);
                    if ((arg4 - var10) <= 512) {
                        var12 = 0;
                    }
                    class490.field6893[6] = (byte) var12;
                    class490.field6893[5] = (byte) (var12 >> 8);
                    class490.field6893[4] = (byte) (var12 >> 16);
                    class490.field6893[7] = (byte) this.field9503;
                    this.field9511.method79((long) (var8 * 520), (byte) -128);
                    this.field9511.method78(-84, class490.field6893, 0, 8);
                    int var18 = arg4 - var10;
                    if (var18 > 512) {
                        var18 = 512;
                    }
                    this.field9511.method78(-58, arg3, var10, var18);
                    var11++;
                    var10 += var18;
                    var8 = var12;
                }
                return true;
            } catch (IOException var34) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!kv", name = "<init>", descriptor = "(ILsg;Lsg;I)V")
    public class684(int arg0, class17 arg1, class17 arg2, int arg3) {
        this.field9505 = arg3;
        this.field9510 = arg2;
        this.field9511 = arg1;
        this.field9503 = arg0;
    }
}
