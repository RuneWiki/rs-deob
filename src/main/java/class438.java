import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sk")
public class class438 {

    @OriginalMember(owner = "client!sk", name = "h", descriptor = "Lho;")
    private class101 field6552 = null;

    @OriginalMember(owner = "client!sk", name = "d", descriptor = "Lho;")
    private class101 field6548 = null;

    @OriginalMember(owner = "client!sk", name = "l", descriptor = "I")
    private int field6556 = 65000;

    @OriginalMember(owner = "client!sk", name = "b", descriptor = "I")
    private int field6546;

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "I")
    public static int field6545 = 0;

    @OriginalMember(owner = "client!sk", name = "c", descriptor = "I")
    public static int field6547;

    @OriginalMember(owner = "client!sk", name = "f", descriptor = "I")
    public static int field6550;

    @OriginalMember(owner = "client!sk", name = "g", descriptor = "I")
    public static int field6551;

    @OriginalMember(owner = "client!sk", name = "i", descriptor = "I")
    public static int field6553;

    @OriginalMember(owner = "client!sk", name = "j", descriptor = "I")
    public static int field6554;

    @OriginalMember(owner = "client!sk", name = "k", descriptor = "I")
    public static int field6555;

    // $FF: synthetic field
    @OriginalMember(owner = "client!sk", name = "m", descriptor = "Ljava/lang/Class;")
    public static Class field6557;

    @OriginalMember(owner = "client!sk", name = "e", descriptor = "[I")
    public static int[] field6549;

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "()V")
    public static final void method2617() {
        for (int var0 = 0; var0 < class161.field2494; var0++) {
            if (!class54.field940[var0]) {
                class459 var1 = class448.field6723[var0];
                class462 var2 = var1.field6877;
                int var3 = var1.field6871;
                int var4 = var2.method2749((byte) -93) - class130.field2075;
                int var5 = (var4 * 2 >> class426.field6345) + 1;
                int var6 = 0;
                int[] var7 = new int[var5 * var5];
                int var8 = var2.method2752(-25273) - var4 >> class426.field6345;
                int var9 = var2.method2744(-254) - var4 >> class426.field6345;
                int var10 = var2.method2744(-254) + var4 >> class426.field6345;
                if (var9 < 0) {
                    var6 -= var9;
                    var9 = 0;
                }
                if (var10 >= class261.field3792) {
                    var10 = class261.field3792 - 1;
                }
                for (int var11 = var9; var11 <= var10; var11++) {
                    short var12 = var1.field6869[var6];
                    int var13 = var12 >>> 8;
                    int var14 = var5 * var6 + var13;
                    int var15 = (var12 >>> 8) + var8;
                    int var16 = (var12 & 0xFF) + var15 - 1;
                    if (var15 < 0) {
                        var14 -= var15;
                        var15 = 0;
                    }
                    if (var16 >= class151.field2408) {
                        var16 = class151.field2408 - 1;
                    }
                    for (int var17 = var15; var17 <= var16; var17++) {
                        byte var18 = 1;
                        class417 var19 = class367.method2294(var3, var17, var11, field6557 == null ? (field6557 = method2624("nu")) : field6557);
                        if (var19 != null && var19.field6227 != 0) {
                            if (var19.field6227 == 1) {
                                boolean var20 = var17 - 1 >= var15;
                                boolean var21 = var17 + 1 <= var16;
                                if (!var20 && var11 + 1 <= var10) {
                                    short var22 = var1.field6869[var6 + 1];
                                    int var23 = (var22 >>> 8) + var8;
                                    int var24 = (var22 & 0xFF) + var23;
                                    var20 = var17 > var23 && var17 < var24;
                                }
                                if (!var21 && var11 - 1 >= var9) {
                                    short var25 = var1.field6869[var6 - 1];
                                    int var26 = (var25 >>> 8) + var8;
                                    int var27 = (var25 & 0xFF) + var26;
                                    var21 = var17 > var26 && var17 < var27;
                                }
                                if (var20 && !var21) {
                                    var18 = 4;
                                } else if (var21 && !var20) {
                                    var18 = 2;
                                }
                            } else {
                                boolean var28 = var17 - 1 >= var15;
                                boolean var29 = var17 + 1 <= var16;
                                if (!var28 && var11 - 1 >= var9) {
                                    short var30 = var1.field6869[var6 - 1];
                                    int var31 = (var30 >>> 8) + var8;
                                    int var32 = (var30 & 0xFF) + var31;
                                    var28 = var17 > var31 && var17 < var32;
                                }
                                if (!var29 && var11 + 1 <= var10) {
                                    short var33 = var1.field6869[var6 + 1];
                                    int var34 = (var33 >>> 8) + var8;
                                    int var35 = (var33 & 0xFF) + var34;
                                    var29 = var17 > var34 && var17 < var35;
                                }
                                if (var28 && !var29) {
                                    var18 = 3;
                                } else if (var29 && !var28) {
                                    var18 = 5;
                                }
                            }
                        }
                        var7[var14++] = var18;
                    }
                    var6++;
                }
                class54.field940[var0] = true;
                class88.field1546[var3].method378(var2, var7);
            }
        }
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(I[Ljava/lang/Object;[IIB)V")
    public static final void method2618(int arg0, Object[] arg1, int[] arg2, int arg3, byte arg4) {
        field6553++;
        if (arg3 < arg0) {
            int var5 = (arg0 + arg3) / 2;
            int var6 = arg3;
            int var7 = arg2[var5];
            arg2[var5] = arg2[arg0];
            arg2[arg0] = var7;
            Object var8 = arg1[var5];
            arg1[var5] = arg1[arg0];
            arg1[arg0] = var8;
            int var9 = var7 == Integer.MAX_VALUE ? 0 : 1;
            for (int var10 = arg3; var10 < arg0; var10++) {
                if ((var10 & var9) + var7 > arg2[var10]) {
                    int var11 = arg2[var10];
                    arg2[var10] = arg2[var6];
                    arg2[var6] = var11;
                    Object var12 = arg1[var10];
                    arg1[var10] = arg1[var6];
                    arg1[var6++] = var12;
                }
            }
            arg2[arg0] = arg2[var6];
            arg2[var6] = var7;
            arg1[arg0] = arg1[var6];
            arg1[var6] = var8;
            method2618(var6 - 1, arg1, arg2, arg3, (byte) 116);
            method2618(arg0, arg1, arg2, var6 + 1, (byte) 82);
        }
        int var13 = 99 % ((arg4 + 31) / 61);
    }

    @OriginalMember(owner = "client!sk", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field6550++;
        return "Cache:" + this.field6546;
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(I)V")
    public static void method2619(int arg0) {
        if (arg0 != 16188) {
            field6549 = null;
        }
        field6549 = null;
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(ZI[BII)Z")
    private final boolean method2620(boolean arg0, int arg1, byte[] arg2, int arg3, int arg4) {
        field6547++;
        class101 var6 = this.field6548;
        synchronized (this.field6548) {
            if (arg3 <= 24) {
                return false;
            }
            try {
                int var8;
                if (arg0) {
                    if (this.field6552.method756(115) < ((long) (arg1 * 6 + 6))) {
                        return false;
                    }
                    this.field6552.method753(0, (long) (arg1 * 6));
                    this.field6552.method755(6, 0, 0, class318.field4774);
                    var8 = (class318.field4774[5] & 0xFF) + (((class318.field4774[3] & 0xFF) << 16) + (class318.field4774[4] & 0xFF << 8));
                    if (var8 <= 0 || this.field6548.method756(104) / 520L < (long) var8) {
                        return false;
                    }
                } else {
                    var8 = (int) ((this.field6548.method756(111) + 519L) / 520L);
                    if (var8 == 0) {
                        var8 = 1;
                    }
                }
                class318.field4774[0] = (byte) (arg4 >> 16);
                class318.field4774[2] = (byte) arg4;
                class318.field4774[1] = (byte) (arg4 >> 8);
                class318.field4774[5] = (byte) var8;
                class318.field4774[4] = (byte) (var8 >> 8);
                class318.field4774[3] = (byte) (var8 >> 16);
                this.field6552.method753(0, (long) (arg1 * 6));
                this.field6552.method752(class318.field4774, false, 6, 0);
                int var11 = 0;
                int var12 = 0;
                while (var11 < arg4) {
                    int var13 = 0;
                    if (arg0) {
                        label111: {
                            this.field6548.method753(0, (long) (var8 * 520));
                            try {
                                this.field6548.method755(8, 0, 0, class318.field4774);
                            } catch (EOFException var36) {
                                return true;
                            }
                            int var14 = (class318.field4774[0] & 0xFF << 8) + (class318.field4774[1] & 0xFF);
                            var13 = (class318.field4774[5] & 0xFF << 8) + ((class318.field4774[4] & 0xFF) << 16) + (class318.field4774[6] & 0xFF);
                            int var15 = (class318.field4774[2] & 0xFF << 8) + (class318.field4774[3] & 0xFF);
                            int var16 = class318.field4774[7] & 0xFF;
                            if (arg1 == var14 && var12 == var15 && this.field6546 == var16) {
                                if (var13 >= 0 && this.field6548.method756(110) / 520L >= (long) var13) {
                                    break label111;
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                    if (var13 == 0) {
                        var13 = (int) ((this.field6548.method756(111) + 519L) / 520L);
                        arg0 = false;
                        if (var13 == 0) {
                            var13++;
                        }
                        if (var8 == var13) {
                            var13++;
                        }
                    }
                    class318.field4774[1] = (byte) arg1;
                    class318.field4774[0] = (byte) (arg1 >> 8);
                    if (arg4 - var11 <= 512) {
                        var13 = 0;
                    }
                    class318.field4774[3] = (byte) var12;
                    class318.field4774[2] = (byte) (var12 >> 8);
                    class318.field4774[7] = (byte) this.field6546;
                    class318.field4774[5] = (byte) (var13 >> 8);
                    class318.field4774[4] = (byte) (var13 >> 16);
                    class318.field4774[6] = (byte) var13;
                    this.field6548.method753(0, (long) (var8 * 520));
                    this.field6548.method752(class318.field4774, false, 8, 0);
                    int var19 = arg4 - var11;
                    if (var19 > 512) {
                        var19 = 512;
                    }
                    this.field6548.method752(arg2, false, var19, var11);
                    var8 = var13;
                    var11 += var19;
                    var12++;
                }
                return true;
            } catch (IOException var37) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(BI[BI)Z")
    public final boolean method2621(byte arg0, int arg1, byte[] arg2, int arg3) {
        if (arg0 > -77) {
            this.method2622(false, 3);
        }
        field6551++;
        class101 var5 = this.field6548;
        synchronized (this.field6548) {
            if (arg1 < 0 || arg1 > this.field6556) {
                throw new IllegalArgumentException();
            }
            boolean var6 = this.method2620(true, arg3, arg2, 86, arg1);
            if (!var6) {
                var6 = this.method2620(false, arg3, arg2, 104, arg1);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(ZI)[B")
    public final byte[] method2622(boolean arg0, int arg1) {
        field6554++;
        class101 var3 = this.field6548;
        synchronized (this.field6548) {
            try {
                if (this.field6552.method756(114) < ((long) (arg1 * 6 + 6))) {
                    return null;
                }
                this.field6552.method753(0, (long) (arg1 * 6));
                this.field6552.method755(6, 0, 0, class318.field4774);
                if (arg0) {
                    return null;
                }
                int var6 = (class318.field4774[2] & 0xFF) + ((class318.field4774[0] & 0xFF) << 16) + ((class318.field4774[1] & 0xFF) << 8);
                int var7 = (class318.field4774[5] & 0xFF) + (((class318.field4774[3] & 0xFF) << 16) + (class318.field4774[4] & 0xFF << 8));
                if (var6 < 0 || this.field6556 < var6) {
                    return null;
                } else if (var7 > 0 && ((long) var7) <= (this.field6548.method756(115) / 520L)) {
                    byte[] var10 = new byte[var6];
                    int var11 = 0;
                    int var12 = 0;
                    while (var11 < var6) {
                        if (var7 == 0) {
                            return null;
                        }
                        this.field6548.method753(0, (long) (var7 * 520));
                        int var14 = var6 - var11;
                        if (var14 > 512) {
                            var14 = 512;
                        }
                        this.field6548.method755(var14 + 8, 0, 0, class318.field4774);
                        int var15 = (class318.field4774[0] & 0xFF << 8) + (class318.field4774[1] & 0xFF);
                        int var16 = (class318.field4774[2] & 0xFF << 8) + (class318.field4774[3] & 0xFF);
                        int var17 = (class318.field4774[6] & 0xFF) + ((class318.field4774[5] & 0xFF) << 8) + ((class318.field4774[4] & 0xFF) << 16);
                        int var18 = class318.field4774[7] & 0xFF;
                        if (arg1 == var15 && var12 == var16 && this.field6546 == var18) {
                            if (var17 >= 0 && (long) var17 <= this.field6548.method756(109) / 520L) {
                                for (int var21 = 0; var21 < var14; var21++) {
                                    var10[var11++] = class318.field4774[var21 + 8];
                                }
                                var12++;
                                var7 = var17;
                                continue;
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

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(ILck;)I")
    public static final int method2623(int arg0, class452 arg1) {
        field6555++;
        int var2 = arg1.method2700((byte) 87, 2);
        int var3;
        if (var2 == 0) {
            var3 = 0;
        } else if (var2 == 1) {
            var3 = arg1.method2700((byte) 87, 5);
        } else if (var2 == 2) {
            var3 = arg1.method2700((byte) 87, 8);
        } else {
            var3 = arg1.method2700((byte) 87, 11);
        }
        int var4 = 57 / ((71 - arg0) / 36);
        return var3;
    }

    @OriginalMember(owner = "client!sk", name = "<init>", descriptor = "(ILho;Lho;I)V")
    public class438(int arg0, class101 arg1, class101 arg2, int arg3) {
        this.field6556 = arg3;
        this.field6548 = arg1;
        this.field6552 = arg2;
        this.field6546 = arg0;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method2624(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
