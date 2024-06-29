import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public class class141 {

    @OriginalMember(owner = "client!ic", name = "f", descriptor = "I")
    private int field2482 = 65000;

    @OriginalMember(owner = "client!ic", name = "n", descriptor = "Lcf;")
    private class93 field2490 = null;

    @OriginalMember(owner = "client!ic", name = "u", descriptor = "Lcf;")
    private class93 field2497 = null;

    @OriginalMember(owner = "client!ic", name = "o", descriptor = "I")
    private int field2491;

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "Loa;")
    public static class99 field2478 = class221.method1463(2844, "::fpsoff");

    @OriginalMember(owner = "client!ic", name = "g", descriptor = "Loa;")
    public static class99 field2483 = class221.method1463(2844, "Verbindung mit Update)2Server)3)3)3");

    @OriginalMember(owner = "client!ic", name = "l", descriptor = "Loa;")
    public static class99 field2488 = class221.method1463(2844, "voudrait faire un -Bchange avec vous)3");

    @OriginalMember(owner = "client!ic", name = "h", descriptor = "[I")
    public static int[] field2484 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "I")
    public static int field2477;

    @OriginalMember(owner = "client!ic", name = "c", descriptor = "I")
    public static int field2479;

    @OriginalMember(owner = "client!ic", name = "d", descriptor = "I")
    public static int field2480;

    @OriginalMember(owner = "client!ic", name = "e", descriptor = "I")
    public static int field2481;

    @OriginalMember(owner = "client!ic", name = "i", descriptor = "I")
    public static int field2485;

    @OriginalMember(owner = "client!ic", name = "j", descriptor = "I")
    public static int field2486;

    @OriginalMember(owner = "client!ic", name = "k", descriptor = "I")
    public static int field2487;

    @OriginalMember(owner = "client!ic", name = "m", descriptor = "I")
    public static int field2489;

    @OriginalMember(owner = "client!ic", name = "p", descriptor = "I")
    public static int field2492;

    @OriginalMember(owner = "client!ic", name = "q", descriptor = "I")
    public static int field2493;

    @OriginalMember(owner = "client!ic", name = "r", descriptor = "I")
    public static int field2494;

    @OriginalMember(owner = "client!ic", name = "s", descriptor = "I")
    public static int field2495;

    @OriginalMember(owner = "client!ic", name = "t", descriptor = "I")
    public static int field2496;

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(I)V")
    public static final void method952(int arg0) {
        if (arg0 <= 30) {
            field2478 = null;
        }
        field2492++;
        class178.field3102.method1812(-126);
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "([BIZI)Z")
    public final boolean method953(byte[] arg0, int arg1, boolean arg2, int arg3) {
        field2495++;
        class93 var5 = this.field2497;
        synchronized (this.field2497) {
            if (arg1 < 0 || arg1 > this.field2482) {
                throw new IllegalArgumentException();
            }
            boolean var6 = this.method955(arg1, arg0, true, (byte) 115, arg3);
            if (arg2) {
                field2484 = null;
            }
            if (!var6) {
                var6 = this.method955(arg1, arg0, false, (byte) 115, arg3);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(III[Loa;)Loa;")
    public static final class99 method954(int arg0, int arg1, int arg2, class99[] arg3) {
        field2489++;
        int var4 = 0;
        for (int var5 = arg1; var5 < arg2; var5++) {
            if (arg3[arg0 + var5] == null) {
                arg3[arg0 + var5] = class226.field3914;
            }
            var4 += arg3[arg0 + var5].field1682;
        }
        byte[] var6 = new byte[var4];
        int var7 = 0;
        for (int var8 = 0; var8 < arg2; var8++) {
            class99 var10 = arg3[arg0 + var8];
            class241.method1568(var10.field1697, 0, var6, var7, var10.field1682);
            var7 += var10.field1682;
        }
        class99 var9 = new class99();
        var9.field1697 = var6;
        var9.field1682 = var4;
        return var9;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(I[BZBI)Z")
    private final boolean method955(int arg0, byte[] arg1, boolean arg2, byte arg3, int arg4) {
        field2496++;
        class93 var6 = this.field2497;
        synchronized (this.field2497) {
            try {
                int var8;
                if (arg2) {
                    if (((long) (arg4 * 6 + 6)) > this.field2490.method630((byte) -93)) {
                        return false;
                    }
                    this.field2490.method632(0, (long) (arg4 * 6));
                    this.field2490.method627(6, -3661, class122.field2135, 0);
                    var8 = ((class122.field2135[3] & 0xFF) << 16) + (class122.field2135[5] & 0xFF) + ((class122.field2135[4] & 0xFF) << 8);
                    if (var8 <= 0 || (long) var8 > this.field2497.method630((byte) -58) / 520L) {
                        return false;
                    }
                } else {
                    var8 = (int) ((this.field2497.method630((byte) -75) + 519L) / 520L);
                    if (var8 == 0) {
                        var8 = 1;
                    }
                }
                int var10 = -104 % ((-arg3 - 1) / 47);
                class122.field2135[5] = (byte) var8;
                class122.field2135[1] = (byte) (arg0 >> 8);
                class122.field2135[3] = (byte) (var8 >> 16);
                int var11 = 0;
                class122.field2135[2] = (byte) arg0;
                int var12 = 0;
                class122.field2135[4] = (byte) (var8 >> 8);
                class122.field2135[0] = (byte) (arg0 >> 16);
                this.field2490.method632(0, (long) (arg4 * 6));
                this.field2490.method622(6, class122.field2135, 0, (byte) -113);
                while (arg0 > var12) {
                    int var13 = 0;
                    if (arg2) {
                        label104: {
                            this.field2497.method632(0, (long) (var8 * 520));
                            try {
                                this.field2497.method627(8, -3661, class122.field2135, 0);
                            } catch (EOFException var34) {
                                return true;
                            }
                            var13 = ((class122.field2135[4] & 0xFF) << 16) - (-((class122.field2135[5] & 0xFF) << 8) - (class122.field2135[6] & 0xFF));
                            int var14 = ((class122.field2135[0] & 0xFF) << 8) + (class122.field2135[1] & 0xFF);
                            int var15 = ((class122.field2135[2] & 0xFF) << 8) + (class122.field2135[3] & 0xFF);
                            int var16 = class122.field2135[7] & 0xFF;
                            if (arg4 == var14 && var11 == var15 && this.field2491 == var16) {
                                if (var13 >= 0 && (this.field2497.method630((byte) -99) / 520L) >= ((long) var13)) {
                                    break label104;
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                    if (var13 == 0) {
                        var13 = (int) ((this.field2497.method630((byte) -78) + 519L) / 520L);
                        if (var13 == 0) {
                            var13++;
                        }
                        arg2 = false;
                        if (var8 == var13) {
                            var13++;
                        }
                    }
                    class122.field2135[0] = (byte) (arg4 >> 8);
                    int var19 = arg0 - var12;
                    class122.field2135[1] = (byte) arg4;
                    if (var19 > 512) {
                        var19 = 512;
                    }
                    if ((arg0 - var12) <= 512) {
                        var13 = 0;
                    }
                    class122.field2135[7] = (byte) this.field2491;
                    class122.field2135[5] = (byte) (var13 >> 8);
                    class122.field2135[3] = (byte) var11;
                    class122.field2135[2] = (byte) (var11 >> 8);
                    class122.field2135[4] = (byte) (var13 >> 16);
                    class122.field2135[6] = (byte) var13;
                    this.field2497.method632(0, (long) (var8 * 520));
                    this.field2497.method622(8, class122.field2135, 0, (byte) -34);
                    var8 = var13;
                    var11++;
                    this.field2497.method622(var19, arg1, var12, (byte) -85);
                    var12 += var19;
                }
                return true;
            } catch (IOException var35) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(Z)V")
    public static final void method956(boolean arg0) {
        if (!arg0) {
            class116.field2053.method1812(-89);
            field2486++;
        }
    }

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "(I)V")
    public static void method957(int arg0) {
        field2483 = null;
        if (arg0 <= 96) {
            method956(true);
        }
        field2488 = null;
        field2478 = null;
        field2484 = null;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method958(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field2494++;
        if (arg3 == arg9 && arg0 == arg4 && arg2 == arg6 && arg5 == arg7) {
            class118.method791(arg8, arg5, arg9, arg2, (byte) 125, arg0);
        } else {
            int var10 = arg0 * 3;
            int var11 = arg0;
            int var12 = arg9;
            int var13 = arg3 * 3;
            int var14 = arg9 * 3;
            int var15 = arg6 * 3;
            int var16 = arg4 * 3;
            int var17 = arg7 * 3;
            int var18 = arg5 + var16 - arg0 - var17;
            int var19 = arg2 + var13 - arg9 - var15;
            int var20 = var15 + var14 - var13 - var13;
            int var21 = var13 - var14;
            int var22 = var10 + var17 - (var16 + var16);
            int var23 = var16 - var10;
            for (int var24 = 128; var24 <= 4096; var24 += 128) {
                int var25 = var24 * var24 >> 12;
                int var26 = var24 * var25 >> 12;
                int var27 = var18 * var26;
                int var28 = var19 * var26;
                int var29 = var20 * var25;
                int var30 = var22 * var25;
                int var31 = var21 * var24;
                int var32 = (var28 + var29 + var31 >> 12) + arg9;
                int var33 = var23 * var24;
                int var34 = (var27 + var33 + var30 >> 12) + arg0;
                class118.method791(arg8, var34, var12, var32, (byte) 125, var11);
                var12 = var32;
                var11 = var34;
            }
        }
        if (arg1 != 2521) {
            field2484 = null;
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(II)[B")
    public final byte[] method959(int arg0, int arg1) {
        field2479++;
        class93 var3 = this.field2497;
        synchronized (this.field2497) {
            try {
                if (this.field2490.method630((byte) -60) < (long) (arg0 * 6 + 6)) {
                    return null;
                }
                this.field2490.method632(arg1 - 1, (long) (arg0 * 6));
                this.field2490.method627(6, arg1 - 3662, class122.field2135, 0);
                int var5 = (class122.field2135[5] & 0xFF) + (class122.field2135[3] & 0xFF << 16) + (class122.field2135[4] & 0xFF << 8);
                int var6 = (class122.field2135[2] & 0xFF) + (((class122.field2135[0] & 0xFF) << 16) + ((class122.field2135[arg1] & 0xFF) << 8));
                if (var6 < 0 || var6 > this.field2482) {
                    return null;
                } else if (var5 > 0 && this.field2497.method630((byte) -80) / 520L >= (long) var5) {
                    byte[] var9 = new byte[var6];
                    int var10 = 0;
                    int var11 = 0;
                    while (var10 < var6) {
                        if (var5 == 0) {
                            return null;
                        }
                        this.field2497.method632(0, (long) (var5 * 520));
                        int var13 = var6 - var10;
                        if (var13 > 512) {
                            var13 = 512;
                        }
                        this.field2497.method627(var13 + 8, -3661, class122.field2135, 0);
                        int var14 = (class122.field2135[6] & 0xFF) + ((class122.field2135[5] & 0xFF) << 8) + (class122.field2135[4] & 0xFF << 16);
                        int var15 = (class122.field2135[0] & 0xFF << 8) + (class122.field2135[1] & 0xFF);
                        int var16 = (class122.field2135[2] & 0xFF << 8) + (class122.field2135[3] & 0xFF);
                        int var17 = class122.field2135[7] & 0xFF;
                        if (arg0 == var15 && var11 == var16 && this.field2491 == var17) {
                            if (var14 >= 0 && (this.field2497.method630((byte) -107) / 520L) >= ((long) var14)) {
                                for (int var20 = 0; var20 < var13; var20++) {
                                    var9[var10++] = class122.field2135[var20 + 8];
                                }
                                var5 = var14;
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

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "(Z)V")
    public static final void method960(boolean arg0) {
        field2493++;
        if (arg0) {
            method957(60);
        }
        for (int var1 = 0; var1 < class102.field1735; var1++) {
            int var2 = class239.field4120[var1];
            class156 var3 = class248.field4287[var2];
            if (var3 != null) {
                class55.method374(var3, var3.field2793.field4469, -31227);
            }
        }
    }

    @OriginalMember(owner = "client!ic", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field2477++;
        return "Cache:" + this.field2491;
    }

    @OriginalMember(owner = "client!ic", name = "<init>", descriptor = "(ILcf;Lcf;I)V")
    public class141(int arg0, class93 arg1, class93 arg2, int arg3) {
        this.field2482 = arg3;
        this.field2497 = arg1;
        this.field2491 = arg0;
        this.field2490 = arg2;
    }
}
