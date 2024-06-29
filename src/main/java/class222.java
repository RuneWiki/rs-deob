import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rg")
public class class222 {

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "Lwa;")
    private class142 field3450 = null;

    @OriginalMember(owner = "client!rg", name = "g", descriptor = "I")
    private int field3455 = 65000;

    @OriginalMember(owner = "client!rg", name = "j", descriptor = "Lwa;")
    private class142 field3458 = null;

    @OriginalMember(owner = "client!rg", name = "c", descriptor = "I")
    private int field3451;

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "[I")
    public static int[] field3449 = new int[14];

    @OriginalMember(owner = "client!rg", name = "k", descriptor = "Lhl;")
    public static class139 field3459 = new class139(500);

    @OriginalMember(owner = "client!rg", name = "n", descriptor = "I")
    public static volatile int field3462 = 0;

    @OriginalMember(owner = "client!rg", name = "d", descriptor = "I")
    public static int field3452;

    @OriginalMember(owner = "client!rg", name = "e", descriptor = "I")
    public static int field3453;

    @OriginalMember(owner = "client!rg", name = "f", descriptor = "I")
    public static int field3454;

    @OriginalMember(owner = "client!rg", name = "h", descriptor = "I")
    public static int field3456;

    @OriginalMember(owner = "client!rg", name = "i", descriptor = "I")
    public static int field3457;

    @OriginalMember(owner = "client!rg", name = "l", descriptor = "I")
    public static int field3460;

    @OriginalMember(owner = "client!rg", name = "o", descriptor = "I")
    public static int field3463;

    @OriginalMember(owner = "client!rg", name = "m", descriptor = "[S")
    public static short[] field3461;

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(BI[III)V")
    public static final void method1519(byte arg0, int arg1, int[] arg2, int arg3, int arg4) {
        arg1--;
        if (arg0 >= -107) {
            method1519((byte) -55, 39, (int[]) null, 63, 100);
        }
        field3454++;
        int var11 = arg3 - 1;
        int var5 = var11 - 7;
        while (arg1 < var5) {
            int var6 = arg1 + 1;
            arg2[var6] = arg4;
            int var7 = var6 + 1;
            arg2[var7] = arg4;
            int var8 = var7 + 1;
            arg2[var8] = arg4;
            int var9 = var8 + 1;
            arg2[var9] = arg4;
            int var10 = var9 + 1;
            arg2[var10] = arg4;
            int var12 = var10 + 1;
            arg2[var12] = arg4;
            int var13 = var12 + 1;
            arg2[var13] = arg4;
            arg1 = var13 + 1;
            arg2[arg1] = arg4;
        }
        while (var11 > arg1) {
            arg1++;
            arg2[arg1] = arg4;
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(I[BBIZ)Z")
    private final boolean method1520(int arg0, byte[] arg1, byte arg2, int arg3, boolean arg4) {
        field3452++;
        class142 var6 = this.field3458;
        synchronized (this.field3458) {
            try {
                int var8;
                if (arg4) {
                    if (((long) (arg3 * 6 + 6)) > this.field3450.method968((byte) -127)) {
                        return false;
                    }
                    this.field3450.method955((long) (arg3 * 6), arg2 + 22905);
                    this.field3450.method960(class73.field1192, 0, -29571, 6);
                    var8 = ((class73.field1192[3] & 0xFF) << 16) + ((class73.field1192[4] & 0xFF) << 8) + (class73.field1192[5] & 0xFF);
                    if (var8 <= 0 || (this.field3458.method968((byte) 114) / 520L) < ((long) var8)) {
                        return false;
                    }
                } else {
                    var8 = (int) ((this.field3458.method968((byte) -127) + 519L) / 520L);
                    if (var8 == 0) {
                        var8 = 1;
                    }
                }
                class73.field1192[1] = (byte) (arg0 >> 8);
                class73.field1192[2] = (byte) arg0;
                if (arg2 != 105) {
                    this.method1520(-6, (byte[]) null, (byte) 124, -88, true);
                }
                int var10 = 0;
                class73.field1192[3] = (byte) (var8 >> 16);
                class73.field1192[5] = (byte) var8;
                class73.field1192[4] = (byte) (var8 >> 8);
                class73.field1192[0] = (byte) (arg0 >> 16);
                this.field3450.method955((long) (arg3 * 6), 23010);
                this.field3450.method959(class73.field1192, 0, true, 6);
                int var11 = 0;
                while (arg0 > var10) {
                    int var12 = 0;
                    if (arg4) {
                        label108: {
                            this.field3458.method955((long) (var8 * 520), 23010);
                            try {
                                this.field3458.method960(class73.field1192, 0, arg2 ^ 0xFFFF8C14, 8);
                            } catch (EOFException var33) {
                                return true;
                            }
                            var12 = ((class73.field1192[4] & 0xFF) << 16) + ((class73.field1192[5] & 0xFF) << 8) + (class73.field1192[6] & 0xFF);
                            int var13 = (class73.field1192[0] & 0xFF << 8) + (class73.field1192[1] & 0xFF);
                            int var14 = class73.field1192[7] & 0xFF;
                            int var15 = ((class73.field1192[2] & 0xFF) << 8) + (class73.field1192[3] & 0xFF);
                            if (arg3 == var13 && var11 == var15 && this.field3451 == var14) {
                                if (var12 >= 0 && this.field3458.method968((byte) -38) / 520L >= (long) var12) {
                                    break label108;
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                    if (var12 == 0) {
                        var12 = (int) ((this.field3458.method968((byte) -91) + 519L) / 520L);
                        if (var12 == 0) {
                            var12++;
                        }
                        arg4 = false;
                        if (var8 == var12) {
                            var12++;
                        }
                    }
                    class73.field1192[7] = (byte) this.field3451;
                    class73.field1192[2] = (byte) (var11 >> 8);
                    int var18 = arg0 - var10;
                    class73.field1192[3] = (byte) var11;
                    if ((arg0 - var10) <= 512) {
                        var12 = 0;
                    }
                    if (var18 > 512) {
                        var18 = 512;
                    }
                    class73.field1192[6] = (byte) var12;
                    var11++;
                    class73.field1192[0] = (byte) (arg3 >> 8);
                    class73.field1192[5] = (byte) (var12 >> 8);
                    class73.field1192[1] = (byte) arg3;
                    class73.field1192[4] = (byte) (var12 >> 16);
                    this.field3458.method955((long) (var8 * 520), 23010);
                    var8 = var12;
                    this.field3458.method959(class73.field1192, 0, true, 8);
                    this.field3458.method959(arg1, var10, true, var18);
                    var10 += var18;
                }
                return true;
            } catch (IOException var34) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!rg", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field3457++;
        return "Cache:" + this.field3451;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(I)V")
    public static final void method1521(int arg0) {
        field3456++;
        if (arg0 >= -2) {
            method1524(-72);
        }
        for (class174 var1 = (class174) class73.field1187.method1894((byte) -90); var1 != null; var1 = (class174) class73.field1187.method1886(-20)) {
            class63 var2 = var1.field2546;
            if (class260.field3986 != var2.field1042 || var2.field1056) {
                var1.method1193(111);
            } else if (var2.field1054 <= class120.field1794) {
                var2.method516(-3333, class177.field2599);
                if (var2.field1056) {
                    var1.method1193(127);
                } else {
                    class232.method1579(var2.field1042, var2.field1057, var2.field1052, var2.field1040, 60, var2, 0, -1L, false);
                }
            }
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(III[B)Z")
    public final boolean method1522(int arg0, int arg1, int arg2, byte[] arg3) {
        field3460++;
        class142 var5 = this.field3458;
        synchronized (this.field3458) {
            if (arg1 < ~arg2 || this.field3455 < arg2) {
                throw new IllegalArgumentException();
            }
            boolean var6 = this.method1520(arg2, arg3, (byte) 105, arg0, true);
            if (!var6) {
                var6 = this.method1520(arg2, arg3, (byte) 105, arg0, false);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(IZ)[B")
    public final byte[] method1523(int arg0, boolean arg1) {
        field3453++;
        class142 var3 = this.field3458;
        synchronized (this.field3458) {
            try {
                if ((long) (arg0 * 6 + 6) > this.field3450.method968((byte) 68)) {
                    return null;
                }
                this.field3450.method955((long) (arg0 * 6), 23010);
                this.field3450.method960(class73.field1192, 0, -29571, 6);
                int var5 = ((class73.field1192[3] & 0xFF) << 16) + ((class73.field1192[4] & 0xFF << 8) + (class73.field1192[5] & 0xFF));
                int var6 = (class73.field1192[2] & 0xFF) + ((class73.field1192[0] & 0xFF << 16) + ((class73.field1192[1] & 0xFF) << 8));
                if (var6 < 0 || this.field3455 < var6) {
                    return null;
                } else if (arg1) {
                    return null;
                } else if (var5 > 0 && ((long) var5) <= (this.field3458.method968((byte) -68) / 520L)) {
                    byte[] var10 = new byte[var6];
                    int var11 = 0;
                    int var12 = 0;
                    label75: while (var11 < var6) {
                        if (var5 == 0) {
                            return null;
                        }
                        this.field3458.method955((long) (var5 * 520), 23010);
                        int var14 = var6 - var11;
                        if (var14 > 512) {
                            var14 = 512;
                        }
                        this.field3458.method960(class73.field1192, 0, -29571, var14 + 8);
                        int var15 = (class73.field1192[0] & 0xFF << 8) + (class73.field1192[1] & 0xFF);
                        int var16 = class73.field1192[7] & 0xFF;
                        int var17 = (class73.field1192[4] & 0xFF << 16) + (class73.field1192[5] & 0xFF << 8) + (class73.field1192[6] & 0xFF);
                        int var18 = (class73.field1192[2] & 0xFF << 8) + (class73.field1192[3] & 0xFF);
                        if (arg0 == var15 && var12 == var18 && this.field3451 == var16) {
                            if (var17 >= 0 && (this.field3458.method968((byte) -105) / 520L) >= ((long) var17)) {
                                var5 = var17;
                                var12++;
                                int var21 = 0;
                                while (true) {
                                    if (var21 >= var14) {
                                        continue label75;
                                    }
                                    var10[var11++] = class73.field1192[var21 + 8];
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
            } catch (IOException var42) {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!rg", name = "<init>", descriptor = "(ILwa;Lwa;I)V")
    public class222(int arg0, class142 arg1, class142 arg2, int arg3) {
        this.field3455 = arg3;
        this.field3450 = arg2;
        this.field3458 = arg1;
        this.field3451 = arg0;
    }

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "(I)V")
    public static void method1524(int arg0) {
        field3459 = null;
        field3449 = null;
        field3461 = null;
        if (arg0 != 0) {
            method1521(-21);
        }
    }
}
