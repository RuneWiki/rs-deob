import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bg")
public class class465 {

    @OriginalMember(owner = "client!bg", name = "d", descriptor = "Lofa;")
    private class332 field6437 = null;

    @OriginalMember(owner = "client!bg", name = "k", descriptor = "Lofa;")
    private class332 field6444 = null;

    @OriginalMember(owner = "client!bg", name = "m", descriptor = "I")
    private int field6446 = 65000;

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "I")
    private int field6434;

    @OriginalMember(owner = "client!bg", name = "h", descriptor = "Llga;")
    public static class712 field6441 = new class712(82, 8);

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "I")
    public static int field6435;

    @OriginalMember(owner = "client!bg", name = "c", descriptor = "I")
    public static int field6436;

    @OriginalMember(owner = "client!bg", name = "e", descriptor = "I")
    public static int field6438;

    @OriginalMember(owner = "client!bg", name = "f", descriptor = "I")
    public static int field6439;

    @OriginalMember(owner = "client!bg", name = "g", descriptor = "I")
    public static int field6440;

    @OriginalMember(owner = "client!bg", name = "i", descriptor = "I")
    public static int field6442;

    @OriginalMember(owner = "client!bg", name = "j", descriptor = "I")
    public static int field6443;

    @OriginalMember(owner = "client!bg", name = "n", descriptor = "I")
    public static int field6447;

    @OriginalMember(owner = "client!bg", name = "l", descriptor = "Lnb;")
    public static class304 field6445;

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(II)V")
    public static final void method2585(int arg0, int arg1) {
        class55 var2 = class310.field4196.method2560(97);
        if (arg0 <= 11) {
            field6443 = -119;
        }
        while (var2 != null) {
            if ((var2.field556 >> 48 & 0xFFFFL) == ((long) arg1)) {
                var2.method315(83);
            }
            var2 = class310.field4196.method2557(-1);
        }
        field6447++;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(IZ)[B")
    public final byte[] method2586(int arg0, boolean arg1) {
        if (arg1) {
            field6445 = null;
        }
        field6439++;
        class332 var3 = this.field6444;
        synchronized (this.field6444) {
            try {
                if ((long) (arg0 * 6 + 6) > this.field6437.method1967(!arg1)) {
                    return null;
                }
                this.field6437.method1966((long) (arg0 * 6), 0);
                this.field6437.method1969(0, class357.field4746, -12913, 6);
                int var5 = ((class357.field4746[0] & 0xFF) << 16) + ((class357.field4746[1] & 0xFF) << 8) + (class357.field4746[2] & 0xFF);
                int var6 = (class357.field4746[5] & 0xFF) + (((class357.field4746[3] & 0xFF) << 16) + (class357.field4746[4] & 0xFF << 8));
                if (var5 < 0 || var5 > this.field6446) {
                    return null;
                } else if (var6 > 0 && (this.field6444.method1967(!arg1) / 520L) >= ((long) var6)) {
                    byte[] var9 = new byte[var5];
                    int var10 = 0;
                    int var11 = 0;
                    while (var5 > var10) {
                        if (var6 == 0) {
                            return null;
                        }
                        this.field6444.method1966((long) (var6 * 520), 0);
                        int var13 = var5 - var10;
                        if (var13 > 512) {
                            var13 = 512;
                        }
                        this.field6444.method1969(0, class357.field4746, -12913, var13 + 8);
                        int var14 = ((class357.field4746[0] & 0xFF) << 8) + (class357.field4746[1] & 0xFF);
                        int var15 = (class357.field4746[2] & 0xFF << 8) + (class357.field4746[3] & 0xFF);
                        int var16 = ((class357.field4746[5] & 0xFF) << 8) + (class357.field4746[4] & 0xFF << 16) + (class357.field4746[6] & 0xFF);
                        int var17 = class357.field4746[7] & 0xFF;
                        if (arg0 == var14 && var11 == var15 && this.field6434 == var17) {
                            if (var16 >= 0 && (this.field6444.method1967(true) / 520L) >= ((long) var16)) {
                                var11++;
                                for (int var20 = 0; var20 < var13; var20++) {
                                    var9[var10++] = class357.field4746[var20 + 8];
                                }
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

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(ILha;IIBIILjava/lang/String;)V")
    public static final void method2587(int arg0, class60 arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, String arg7) {
        field6438++;
        if (class215.field2600 == null || class71.field770 == null) {
            if (class97.field1282.method2882(-71, class729.field10181) && class97.field1282.method2882(-48, class202.field2400)) {
                class215.field2600 = arg1.method366(class204.method1129(class97.field1282, class729.field10181, 0), true);
                class204 var8 = class204.method1129(class97.field1282, class202.field2400, 0);
                class71.field770 = arg1.method366(var8, true);
                var8.method1135();
                class144.field1860 = arg1.method366(var8, true);
            } else {
                arg1.method447(arg5, arg6, arg2, arg0, 255 - class371.field5187 << 24 | class681.field9488, 1);
            }
        }
        if (class215.field2600 != null && class71.field770 != null) {
            int var9 = (arg2 - class71.field770.method674() * 2) / class215.field2600.method674();
            for (int var10 = 0; var10 < var9; var10++) {
                class215.field2600.method3859(class71.field770.method674() + arg5 + var10 * class215.field2600.method674(), arg6);
            }
            class71.field770.method3859(arg5, arg6);
            class144.field1860.method3859(arg5 + (arg2 - class144.field1860.method674()), arg6);
        }
        class214.field2575.method475((byte) 114, arg6 + 14, arg7, class690.field9670 | 0xFF000000, -1, arg5 + 3);
        arg1.method447(arg5, arg0 + arg6, arg2, arg3 - arg0, -class371.field5187 + 255 << 24 | class681.field9488, 1);
        if (arg4 != 58) {
            field6445 = null;
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(ZIB[BI)Z")
    private final boolean method2588(boolean arg0, int arg1, byte arg2, byte[] arg3, int arg4) {
        field6436++;
        class332 var6 = this.field6444;
        synchronized (this.field6444) {
            try {
                int var7;
                if (arg0) {
                    if (((long) (arg4 * 6 + 6)) > this.field6437.method1967(true)) {
                        return false;
                    }
                    this.field6437.method1966((long) (arg4 * 6), 0);
                    this.field6437.method1969(0, class357.field4746, -12913, 6);
                    var7 = (class357.field4746[3] & 0xFF << 16) + ((class357.field4746[4] & 0xFF) << 8) + (class357.field4746[5] & 0xFF);
                    if (var7 <= 0 || (this.field6444.method1967(true) / 520L) < ((long) var7)) {
                        return false;
                    }
                } else {
                    var7 = (int) ((this.field6444.method1967(true) + 519L) / 520L);
                    if (var7 == 0) {
                        var7 = 1;
                    }
                }
                class357.field4746[2] = (byte) arg1;
                class357.field4746[0] = (byte) (arg1 >> 16);
                class357.field4746[3] = (byte) (var7 >> 16);
                class357.field4746[1] = (byte) (arg1 >> 8);
                class357.field4746[5] = (byte) var7;
                class357.field4746[4] = (byte) (var7 >> 8);
                this.field6437.method1966((long) (arg4 * 6), 0);
                this.field6437.method1972(6, 0, -1, class357.field4746);
                if (arg2 != -41) {
                    return true;
                }
                int var11 = 0;
                int var12 = 0;
                while (arg1 > var11) {
                    int var13 = 0;
                    if (arg0) {
                        label110: {
                            this.field6444.method1966((long) (var7 * 520), 0);
                            try {
                                this.field6444.method1969(0, class357.field4746, -12913, 8);
                            } catch (EOFException var36) {
                                return true;
                            }
                            int var14 = ((class357.field4746[0] & 0xFF) << 8) + (class357.field4746[1] & 0xFF);
                            var13 = (class357.field4746[4] & 0xFF << 16) + ((class357.field4746[5] & 0xFF) << 8) + (class357.field4746[6] & 0xFF);
                            int var15 = (class357.field4746[2] & 0xFF << 8) + (class357.field4746[3] & 0xFF);
                            int var16 = class357.field4746[7] & 0xFF;
                            if (arg4 == var14 && var12 == var15 && this.field6434 == var16) {
                                if (var13 >= 0 && (long) var13 <= this.field6444.method1967(true) / 520L) {
                                    break label110;
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                    if (var13 == 0) {
                        arg0 = false;
                        var13 = (int) ((this.field6444.method1967(true) + 519L) / 520L);
                        if (var13 == 0) {
                            var13++;
                        }
                        if (var7 == var13) {
                            var13++;
                        }
                    }
                    class357.field4746[0] = (byte) (arg4 >> 8);
                    if (arg1 - var11 <= 512) {
                        var13 = 0;
                    }
                    class357.field4746[2] = (byte) (var12 >> 8);
                    class357.field4746[3] = (byte) var12;
                    class357.field4746[1] = (byte) arg4;
                    class357.field4746[7] = (byte) this.field6434;
                    class357.field4746[5] = (byte) (var13 >> 8);
                    class357.field4746[4] = (byte) (var13 >> 16);
                    class357.field4746[6] = (byte) var13;
                    this.field6444.method1966((long) (var7 * 520), arg2 + 41);
                    this.field6444.method1972(8, 0, arg2 + 40, class357.field4746);
                    int var19 = arg1 - var11;
                    if (var19 > 512) {
                        var19 = 512;
                    }
                    this.field6444.method1972(var19, var11, -1, arg3);
                    var7 = var13;
                    var12++;
                    var11 += var19;
                }
                return true;
            } catch (IOException var37) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!bg", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field6440++;
        return "Cache:" + this.field6434;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(IIIILoi;II)V")
    public static final void method2589(int arg0, int arg1, int arg2, int arg3, class74 arg4, int arg5, int arg6) {
        field6435++;
        class310.method1867(arg1, arg4.field2170, arg5, 0, (byte) 111, arg4.field2165, arg6, arg4.field2175, arg3, arg0);
        int var7 = 35 % ((-arg2 - 13) / 52);
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(I)V")
    public static void method2590(int arg0) {
        field6445 = null;
        field6441 = null;
        if (arg0 != -24652) {
            field6443 = -28;
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(ZII[B)Z")
    public final boolean method2591(boolean arg0, int arg1, int arg2, byte[] arg3) {
        field6442++;
        class332 var5 = this.field6444;
        synchronized (this.field6444) {
            if (arg1 < 0 || arg1 > this.field6446) {
                throw new IllegalArgumentException();
            }
            if (arg0) {
                this.method2586(29, false);
            }
            boolean var6 = this.method2588(true, arg1, (byte) -41, arg3, arg2);
            if (!var6) {
                var6 = this.method2588(false, arg1, (byte) -41, arg3, arg2);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!bg", name = "<init>", descriptor = "(ILofa;Lofa;I)V")
    public class465(int arg0, class332 arg1, class332 arg2, int arg3) {
        this.field6437 = arg2;
        this.field6446 = arg3;
        this.field6434 = arg0;
        this.field6444 = arg1;
    }
}
