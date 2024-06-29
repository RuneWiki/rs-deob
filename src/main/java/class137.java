import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fq")
public class class137 {

    @OriginalMember(owner = "client!fq", name = "c", descriptor = "I")
    private int field2297 = 65000;

    @OriginalMember(owner = "client!fq", name = "d", descriptor = "Lso;")
    private class331 field2298 = null;

    @OriginalMember(owner = "client!fq", name = "b", descriptor = "Lso;")
    private class331 field2296 = null;

    @OriginalMember(owner = "client!fq", name = "e", descriptor = "I")
    private int field2299;

    @OriginalMember(owner = "client!fq", name = "f", descriptor = "[Lab;")
    public static class477[] field2300 = new class477[128];

    @OriginalMember(owner = "client!fq", name = "j", descriptor = "Los;")
    public static class309 field2304 = new class309("Face here", "Hierhin drehen", "Regarder dans cette direction", "Virar para cá");

    @OriginalMember(owner = "client!fq", name = "l", descriptor = "Ls;")
    public static class186 field2306 = new class186(51, 2);

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "I")
    public static int field2295;

    @OriginalMember(owner = "client!fq", name = "g", descriptor = "I")
    public static int field2301;

    @OriginalMember(owner = "client!fq", name = "h", descriptor = "I")
    public static int field2302;

    @OriginalMember(owner = "client!fq", name = "i", descriptor = "I")
    public static int field2303;

    @OriginalMember(owner = "client!fq", name = "k", descriptor = "I")
    public static int field2305;

    @OriginalMember(owner = "client!fq", name = "m", descriptor = "I")
    public static int field2307;

    @OriginalMember(owner = "client!fq", name = "n", descriptor = "I")
    public static int field2308;

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(BII)I", line = 3)
    public static final int method1033(byte arg0, int arg1, int arg2) {
        field2302++;
        int var3 = arg2 * 57 + arg1;
        int var4 = var3 << 13 ^ var3;
        int var5 = -62 % ((18 - arg0) / 35);
        int var6 = Integer.MAX_VALUE & (var4 * var4 * 15731 + 789221) * var4 + 1376312589;
        return var6 >> 19 & 0xFF;
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "([BIZII)Z", line = 19)
    private final boolean method1034(byte[] arg0, int arg1, boolean arg2, int arg3, int arg4) {
        field2295++;
        class331 var6 = this.field2296;
        synchronized (this.field2296) {
            try {
                int var7;
                if (arg2) {
                    if (this.field2298.method2091(121) < (long) (arg1 * 6 + 6)) {
                        return false;
                    }
                    this.field2298.method2093(-1006, (long) (arg1 * 6));
                    this.field2298.method2087(0, 6, class270.field4094, (byte) -39);
                    var7 = (class270.field4094[4] & 0xFF << 8) + (class270.field4094[3] & 0xFF << 16) + (class270.field4094[5] & 0xFF);
                    if (var7 <= 0 || ((long) var7) > (this.field2296.method2091(119) / 520L)) {
                        return false;
                    }
                } else {
                    var7 = (int) ((this.field2296.method2091(120) + 519L) / 520L);
                    if (var7 == 0) {
                        var7 = 1;
                    }
                }
                class270.field4094[4] = (byte) (var7 >> 8);
                class270.field4094[5] = (byte) var7;
                if (arg3 >= -51) {
                    this.method1037((byte) 97, 76);
                }
                class270.field4094[2] = (byte) arg4;
                class270.field4094[1] = (byte) (arg4 >> 8);
                class270.field4094[0] = (byte) (arg4 >> 16);
                class270.field4094[3] = (byte) (var7 >> 16);
                this.field2298.method2093(-1006, (long) (arg1 * 6));
                this.field2298.method2088(class270.field4094, 6, -25627, 0);
                int var10 = 0;
                int var11 = 0;
                while (var10 < arg4) {
                    int var12 = 0;
                    if (arg2) {
                        label109: {
                            this.field2296.method2093(-1006, (long) (var7 * 520));
                            try {
                                this.field2296.method2087(0, 8, class270.field4094, (byte) -76);
                            } catch (EOFException var33) {
                                return true;
                            }
                            int var13 = ((class270.field4094[0] & 0xFF) << 8) + (class270.field4094[1] & 0xFF);
                            int var14 = ((class270.field4094[2] & 0xFF) << 8) + (class270.field4094[3] & 0xFF);
                            var12 = (class270.field4094[4] & 0xFF << 16) + ((class270.field4094[5] & 0xFF) << 8) + (class270.field4094[6] & 0xFF);
                            int var15 = class270.field4094[7] & 0xFF;
                            if (arg1 == var13 && var11 == var14 && this.field2299 == var15) {
                                if (var12 >= 0 && ((long) var12) <= (this.field2296.method2091(123) / 520L)) {
                                    break label109;
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                    if (var12 == 0) {
                        arg2 = false;
                        var12 = (int) ((this.field2296.method2091(127) + 519L) / 520L);
                        if (var12 == 0) {
                            var12++;
                        }
                        if (var7 == var12) {
                            var12++;
                        }
                    }
                    class270.field4094[3] = (byte) var11;
                    class270.field4094[0] = (byte) (arg1 >> 8);
                    class270.field4094[2] = (byte) (var11 >> 8);
                    if (arg4 - var10 <= 512) {
                        var12 = 0;
                    }
                    class270.field4094[1] = (byte) arg1;
                    class270.field4094[5] = (byte) (var12 >> 8);
                    class270.field4094[4] = (byte) (var12 >> 16);
                    class270.field4094[7] = (byte) this.field2299;
                    class270.field4094[6] = (byte) var12;
                    this.field2296.method2093(-1006, (long) (var7 * 520));
                    this.field2296.method2088(class270.field4094, 8, -25627, 0);
                    int var18 = arg4 - var10;
                    if (var18 > 512) {
                        var18 = 512;
                    }
                    this.field2296.method2088(arg0, var18, -25627, var10);
                    var10 += var18;
                    var7 = var12;
                    var11++;
                }
                return true;
            } catch (IOException var34) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(IIIIIIIIIIIIII)V", line = 141)
    public static final void method1035(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13) {
        field2301++;
        if (class520.field7560 == null) {
            return;
        }
        class535 var14 = null;
        if (arg5 != 65280) {
            field2300 = null;
        }
        if (arg1 < 0) {
            int var15 = -arg1 - 1;
            if (class174.field2806 == var15) {
                var14 = class15.field266;
            } else {
                var14 = class73.field1444[var15];
            }
        } else {
            int var16 = arg1 - 1;
            class435 var17 = (class435) class209.field3337.method1622((long) var16, arg5 ^ 0xFFFF008D);
            if (var17 != null) {
                var14 = var17.field6471;
            }
        }
        if (var14 == null) {
            return;
        }
        class306 var18 = class123.field2142.method1530((byte) -108, arg8);
        int var19;
        int var20;
        if (arg12 == 1 || arg12 == 3) {
            var20 = var18.field4595;
            var19 = var18.field4601;
        } else {
            var19 = var18.field4595;
            var20 = var18.field4601;
        }
        int var21 = (var20 >> 1) + arg7;
        int var22 = arg7 + (var20 + 1 >> 1);
        int var23 = arg3 + (var19 >> 1);
        int var24 = arg3 + (var19 + 1 >> 1);
        class38 var25 = class520.field7560[arg2];
        int var26 = var25.method177(var21, var23) + var25.method177(var22, var23) + var25.method177(var21, var24) + var25.method177(var22, var24) >> 2;
        class436 var27 = new class436();
        var27.field6485 = arg8;
        var27.field6487 = arg3;
        var27.field6486 = class62.field1268 + arg10;
        var27.field6477 = var14.field6084;
        var27.field6480 = arg7;
        if (arg13 > arg9) {
            int var28 = arg13;
            arg13 = arg9;
            arg9 = var28;
        }
        var27.field6481 = arg12;
        var27.field6479 = class62.field1268 + arg6;
        var27.field6488 = arg11;
        var27.field6490 = arg7 + arg13;
        if (arg4 < arg0) {
            int var29 = arg0;
            arg0 = arg4;
            arg4 = var29;
        }
        var27.field6476 = arg7 + arg9;
        var27.field6478 = (var27.field6487 << 7) + (var19 << 6);
        var27.field6491 = (var27.field6480 << 7) + (var20 << 6);
        var27.field6489 = arg0 + arg3;
        var27.field6482 = var26;
        var27.field6484 = arg3 + arg4;
        class143.field2417.method1885(false, var27);
        var14.field7868 = var27;
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(I[BIB)Z", line = 248)
    public final boolean method1036(int arg0, byte[] arg1, int arg2, byte arg3) {
        field2307++;
        class331 var5 = this.field2296;
        synchronized (this.field2296) {
            if (arg3 >= -56) {
                this.field2297 = -25;
            }
            if (arg2 < 0 || arg2 > this.field2297) {
                throw new IllegalArgumentException();
            }
            boolean var6 = this.method1034(arg1, arg0, true, -118, arg2);
            if (!var6) {
                var6 = this.method1034(arg1, arg0, false, -63, arg2);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(BI)[B", line = 285)
    public final byte[] method1037(byte arg0, int arg1) {
        field2305++;
        class331 var3 = this.field2296;
        synchronized (this.field2296) {
            try {
                if (((long) (arg1 * 6 + 6)) > this.field2298.method2091(123)) {
                    return null;
                }
                this.field2298.method2093(-1006, (long) (arg1 * 6));
                this.field2298.method2087(0, 6, class270.field4094, (byte) -112);
                int var5 = (class270.field4094[1] & 0xFF << 8) + ((class270.field4094[0] & 0xFF) << 16) + (class270.field4094[2] & 0xFF);
                int var6 = ((class270.field4094[3] & 0xFF) << 16) + (class270.field4094[4] & 0xFF << 8) + (class270.field4094[5] & 0xFF);
                if (var5 < 0 || this.field2297 < var5) {
                    return null;
                } else if (var6 > 0 && (long) var6 <= this.field2296.method2091(116) / 520L) {
                    byte[] var9 = new byte[var5];
                    int var10 = 0;
                    int var11 = 0;
                    if (arg0 < 69) {
                        field2306 = null;
                    }
                    while (var5 > var10) {
                        if (var6 == 0) {
                            return null;
                        }
                        this.field2296.method2093(-1006, (long) (var6 * 520));
                        int var13 = var5 - var10;
                        if (var13 > 512) {
                            var13 = 512;
                        }
                        this.field2296.method2087(0, var13 + 8, class270.field4094, (byte) -82);
                        int var14 = (class270.field4094[0] & 0xFF << 8) + (class270.field4094[1] & 0xFF);
                        int var15 = ((class270.field4094[2] & 0xFF) << 8) + (class270.field4094[3] & 0xFF);
                        int var16 = (class270.field4094[6] & 0xFF) + ((class270.field4094[5] & 0xFF) << 8) + (class270.field4094[4] & 0xFF << 16);
                        int var17 = class270.field4094[7] & 0xFF;
                        if (arg1 == var14 && var11 == var15 && this.field2299 == var17) {
                            if (var16 >= 0 && (this.field2296.method2091(126) / 520L) >= ((long) var16)) {
                                for (int var20 = 0; var20 < var13; var20++) {
                                    var9[var10++] = class270.field4094[var20 + 8];
                                }
                                var6 = var16;
                                var11++;
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

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(Z)V", line = 367)
    public static void method1038(boolean arg0) {
        field2306 = null;
        field2300 = null;
        field2304 = null;
        if (!arg0) {
            field2300 = null;
        }
    }

    @OriginalMember(owner = "client!fq", name = "<init>", descriptor = "(ILso;Lso;I)V", line = 407)
    public class137(int arg0, class331 arg1, class331 arg2, int arg3) {
        this.field2296 = arg1;
        this.field2297 = arg3;
        this.field2299 = arg0;
        this.field2298 = arg2;
    }

    @OriginalMember(owner = "client!fq", name = "toString", descriptor = "()Ljava/lang/String;", line = 386)
    public final String toString() {
        field2303++;
        return "Cache:" + this.field2299;
    }
}
