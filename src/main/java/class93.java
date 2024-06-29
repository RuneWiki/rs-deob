import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wq")
public class class93 {

    @OriginalMember(owner = "client!wq", name = "b", descriptor = "Lcj;")
    private class412 field1020 = null;

    @OriginalMember(owner = "client!wq", name = "c", descriptor = "Lcj;")
    private class412 field1021 = null;

    @OriginalMember(owner = "client!wq", name = "q", descriptor = "I")
    private int field1035 = 65000;

    @OriginalMember(owner = "client!wq", name = "p", descriptor = "I")
    private int field1034;

    @OriginalMember(owner = "client!wq", name = "i", descriptor = "Lvn;")
    public static class169 field1027 = new class169();

    @OriginalMember(owner = "client!wq", name = "m", descriptor = "Lfi;")
    public static class331 field1031 = new class331(128);

    @OriginalMember(owner = "client!wq", name = "o", descriptor = "Ljava/lang/String;")
    public static String field1033 = "";

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "I")
    public static int field1019;

    @OriginalMember(owner = "client!wq", name = "d", descriptor = "I")
    public static int field1022;

    @OriginalMember(owner = "client!wq", name = "e", descriptor = "I")
    public static int field1023;

    @OriginalMember(owner = "client!wq", name = "f", descriptor = "I")
    public static int field1024;

    @OriginalMember(owner = "client!wq", name = "g", descriptor = "I")
    public static int field1025;

    @OriginalMember(owner = "client!wq", name = "h", descriptor = "I")
    public static int field1026;

    @OriginalMember(owner = "client!wq", name = "j", descriptor = "I")
    public static int field1028;

    @OriginalMember(owner = "client!wq", name = "k", descriptor = "I")
    public static int field1029;

    @OriginalMember(owner = "client!wq", name = "l", descriptor = "I")
    public static int field1030;

    @OriginalMember(owner = "client!wq", name = "n", descriptor = "I")
    public static int field1032;

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(I)V")
    public static void method497(int arg0) {
        field1031 = null;
        if (arg0 >= -105) {
            method501((byte) -12);
        }
        field1033 = null;
        field1027 = null;
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(II)[B")
    public final byte[] method498(int arg0, int arg1) {
        field1024++;
        class412 var3 = this.field1020;
        synchronized (this.field1020) {
            try {
                if (this.field1021.method2581(false) < (long) (arg0 * 6 + 6)) {
                    return null;
                }
                this.field1021.method2579((long) (arg0 * 6), 14653);
                this.field1021.method2584(class180.field2476, 6, 0, -1);
                int var5 = (class180.field2476[2] & 0xFF) + ((class180.field2476[0] & 0xFF << 16) + ((class180.field2476[1] & 0xFF) << 8));
                int var6 = ((class180.field2476[3] & 0xFF) << 16) + (class180.field2476[4] & 0xFF << 8) + (class180.field2476[5] & 0xFF);
                if (var5 < 0 || var5 > this.field1035) {
                    return null;
                } else if (var6 > 0 && this.field1020.method2581(false) / 520L >= (long) var6) {
                    if (arg1 >= -59) {
                        this.method502(-51, (byte[]) null, 20, 103);
                    }
                    byte[] var9 = new byte[var5];
                    int var10 = 0;
                    int var11 = 0;
                    while (var5 > var10) {
                        if (var6 == 0) {
                            return null;
                        }
                        this.field1020.method2579((long) (var6 * 520), 14653);
                        int var13 = var5 - var10;
                        if (var13 > 512) {
                            var13 = 512;
                        }
                        this.field1020.method2584(class180.field2476, var13 + 8, 0, -1);
                        int var14 = ((class180.field2476[0] & 0xFF) << 8) + (class180.field2476[1] & 0xFF);
                        int var15 = ((class180.field2476[2] & 0xFF) << 8) + (class180.field2476[3] & 0xFF);
                        int var16 = ((class180.field2476[5] & 0xFF) << 8) + ((class180.field2476[4] & 0xFF) << 16) + (class180.field2476[6] & 0xFF);
                        int var17 = class180.field2476[7] & 0xFF;
                        if (arg0 == var14 && var11 == var15 && this.field1034 == var17) {
                            if (var16 >= 0 && (long) var16 <= this.field1020.method2581(false) / 520L) {
                                for (int var20 = 0; var20 < var13; var20++) {
                                    var9[var10++] = class180.field2476[var20 + 8];
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

    @OriginalMember(owner = "client!wq", name = "b", descriptor = "(I)Lgk;")
    public static final class278 method499(int arg0) {
        field1030++;
        if (class106.field1208 == null || class95.field1067 == null) {
            return null;
        }
        class278 var1 = (class278) class95.field1067.method599(-79);
        if (arg0 != 7) {
            method501((byte) 6);
        }
        while (var1 != null) {
            class290 var2 = class117.method661((byte) 63, var1.field3920);
            if (var2 != null && var2.field4134 && var2.method1853(-7348)) {
                return var1;
            }
            var1 = (class278) class95.field1067.method599(-14);
        }
        return null;
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(Z[[IBLen;I)V")
    public static final void method500(boolean arg0, int[][] arg1, byte arg2, class174 arg3, int arg4) {
        for (int var5 = 0; var5 < arg4; var5++) {
            int[][] var6;
            if (arg1 == null) {
                var6 = null;
            } else {
                var6 = new int[class279.field3935 + 1][class164.field2287 + 1];
                for (int var7 = 0; var7 <= class164.field2287; var7++) {
                    for (int var8 = 0; var8 <= class279.field3935; var8++) {
                        var6[var8][var7] = class30.field278[var5][var8][var7] - arg1[var8][var7];
                    }
                }
            }
            int var9 = 0;
            int var10 = 0;
            if (!arg0) {
                if (class216.field2943) {
                    var9 |= 0x2;
                }
                if (class307.field4399) {
                    var10 |= 0x8;
                }
                if (class341.field5022 != 0) {
                    var9 |= 0x1;
                    if (var5 == 0 || class343.field5053 >= 96) {
                        var10 |= 0x10;
                    }
                }
            }
            if (class216.field2943) {
                var10 |= 0x7;
            }
            class319 var11 = arg3.method941(class279.field3935, class164.field2287, class30.field278[var5], var6, 128, var9, var10);
            class118.method664(var5, var11);
        }
        if (arg2 > -95) {
            field1031 = null;
        }
        field1028++;
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(B)I")
    public static final int method501(byte arg0) {
        field1022++;
        if (arg0 <= 98) {
            field1027 = null;
        }
        if (class422.field6053) {
            return 0;
        } else if (class257.method1613(-119)) {
            return class67.field763 ? 2 : 1;
        } else {
            return 1;
        }
    }

    @OriginalMember(owner = "client!wq", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field1019++;
        return "Cache:" + this.field1034;
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(I[BII)Z")
    public final boolean method502(int arg0, byte[] arg1, int arg2, int arg3) {
        field1032++;
        class412 var5 = this.field1020;
        synchronized (this.field1020) {
            if (arg0 > arg3 || this.field1035 < arg3) {
                throw new IllegalArgumentException();
            }
            boolean var6 = this.method503(arg3, arg1, true, arg2, arg0 ^ 0x5);
            if (!var6) {
                var6 = this.method503(arg3, arg1, false, arg2, 5);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(I[BZII)Z")
    private final boolean method503(int arg0, byte[] arg1, boolean arg2, int arg3, int arg4) {
        field1025++;
        class412 var6 = this.field1020;
        synchronized (this.field1020) {
            try {
                int var7;
                if (arg2) {
                    if (this.field1021.method2581(false) < (long) (arg3 * 6 + 6)) {
                        return false;
                    }
                    this.field1021.method2579((long) (arg3 * 6), 14653);
                    this.field1021.method2584(class180.field2476, 6, 0, -1);
                    var7 = (class180.field2476[5] & 0xFF) + (((class180.field2476[3] & 0xFF) << 16) + ((class180.field2476[4] & 0xFF) << 8));
                    if (var7 <= 0 || (this.field1020.method2581(false) / 520L) < ((long) var7)) {
                        return false;
                    }
                } else {
                    var7 = (int) ((this.field1020.method2581(false) + 519L) / 520L);
                    if (var7 == 0) {
                        var7 = 1;
                    }
                }
                class180.field2476[4] = (byte) (var7 >> 8);
                class180.field2476[0] = (byte) (arg0 >> 16);
                class180.field2476[1] = (byte) (arg0 >> 8);
                class180.field2476[5] = (byte) var7;
                class180.field2476[3] = (byte) (var7 >> 16);
                class180.field2476[2] = (byte) arg0;
                this.field1021.method2579((long) (arg3 * 6), 14653);
                this.field1021.method2580(6, class180.field2476, arg4 ^ arg4, 0);
                int var10 = 0;
                int var11 = 0;
                while (arg0 > var10) {
                    int var12 = 0;
                    if (arg2) {
                        label105: {
                            this.field1020.method2579((long) (var7 * 520), arg4 ^ 0x3938);
                            try {
                                this.field1020.method2584(class180.field2476, 8, 0, -1);
                            } catch (EOFException var33) {
                                return true;
                            }
                            int var13 = (class180.field2476[0] & 0xFF << 8) + (class180.field2476[1] & 0xFF);
                            int var14 = ((class180.field2476[2] & 0xFF) << 8) + (class180.field2476[3] & 0xFF);
                            var12 = ((class180.field2476[4] & 0xFF) << 16) + (class180.field2476[6] & 0xFF) + ((class180.field2476[5] & 0xFF) << 8);
                            int var15 = class180.field2476[7] & 0xFF;
                            if (arg3 == var13 && var11 == var14 && this.field1034 == var15) {
                                if (var12 >= 0 && this.field1020.method2581(false) / 520L >= (long) var12) {
                                    break label105;
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                    if (var12 == 0) {
                        arg2 = false;
                        var12 = (int) ((this.field1020.method2581(false) + 519L) / 520L);
                        if (var12 == 0) {
                            var12++;
                        }
                        if (var7 == var12) {
                            var12++;
                        }
                    }
                    class180.field2476[0] = (byte) (arg3 >> 8);
                    class180.field2476[2] = (byte) (var11 >> 8);
                    if (arg0 - var10 <= 512) {
                        var12 = 0;
                    }
                    class180.field2476[3] = (byte) var11;
                    class180.field2476[1] = (byte) arg3;
                    class180.field2476[6] = (byte) var12;
                    class180.field2476[7] = (byte) this.field1034;
                    class180.field2476[4] = (byte) (var12 >> 16);
                    class180.field2476[5] = (byte) (var12 >> 8);
                    this.field1020.method2579((long) (var7 * 520), 14653);
                    this.field1020.method2580(8, class180.field2476, 0, 0);
                    int var18 = arg0 - var10;
                    if (var18 > 512) {
                        var18 = 512;
                    }
                    this.field1020.method2580(var18, arg1, 0, var10);
                    var11++;
                    var10 += var18;
                    var7 = var12;
                }
                return true;
            } catch (IOException var34) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(IBIIIII)V")
    public static final void method504(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg1 < 62) {
            return;
        }
        field1023++;
        for (class326 var7 = (class326) class247.field3356.method1604((byte) -119); var7 != null; var7 = (class326) class247.field3356.method1612(-1)) {
            if (class221.field3033 >= var7.field4581) {
                var7.method96(3);
            } else {
                class249.method1564(123, (var7.field4589 << 7) + 64, arg4, arg5 >> 1, arg6, arg2 >> 1, (var7.field4587 << 7) + 64, var7.field4579 * 2);
                class287.field4059.method1253(121, class33.field313[1] + arg3, 0, var7.field4586, var7.field4591 | 0xFF000000, class33.field313[0] + arg0);
            }
        }
    }

    @OriginalMember(owner = "client!wq", name = "<init>", descriptor = "(ILcj;Lcj;I)V")
    public class93(int arg0, class412 arg1, class412 arg2, int arg3) {
        this.field1021 = arg2;
        this.field1035 = arg3;
        this.field1020 = arg1;
        this.field1034 = arg0;
    }
}
