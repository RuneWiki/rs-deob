import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public class class398 {

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "Let;")
    private class274 field5650 = null;

    @OriginalMember(owner = "client!hc", name = "l", descriptor = "Let;")
    private class274 field5661 = null;

    @OriginalMember(owner = "client!hc", name = "p", descriptor = "I")
    private int field5665 = 65000;

    @OriginalMember(owner = "client!hc", name = "k", descriptor = "I")
    private int field5660;

    @OriginalMember(owner = "client!hc", name = "e", descriptor = "Lpn;")
    public static class72 field5654 = new class72(51, 7);

    @OriginalMember(owner = "client!hc", name = "g", descriptor = "I")
    public static int field5656 = -1;

    @OriginalMember(owner = "client!hc", name = "h", descriptor = "Lsd;")
    public static class74 field5657 = new class74(17, -2);

    @OriginalMember(owner = "client!hc", name = "m", descriptor = "[I")
    public static int[] field5662 = new int[3];

    @OriginalMember(owner = "client!hc", name = "n", descriptor = "Z")
    public static boolean field5663 = false;

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "I")
    public static int field5651;

    @OriginalMember(owner = "client!hc", name = "c", descriptor = "I")
    public static int field5652;

    @OriginalMember(owner = "client!hc", name = "d", descriptor = "I")
    public static int field5653;

    @OriginalMember(owner = "client!hc", name = "f", descriptor = "I")
    public static int field5655;

    @OriginalMember(owner = "client!hc", name = "i", descriptor = "I")
    public static int field5658;

    @OriginalMember(owner = "client!hc", name = "j", descriptor = "I")
    public static int field5659;

    @OriginalMember(owner = "client!hc", name = "o", descriptor = "I")
    public static int field5664;

    @OriginalMember(owner = "client!hc", name = "q", descriptor = "[Lrg;")
    public static class395[] field5666;

    @OriginalMember(owner = "client!hc", name = "r", descriptor = "[Lmi;")
    public static class443[] field5667;

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(BI)[B")
    public final byte[] method2380(byte arg0, int arg1) {
        field5658++;
        class274 var3 = this.field5650;
        synchronized (this.field5650) {
            try {
                if (((long) (arg1 * 6 + 6)) > this.field5661.method1643(-99216864)) {
                    return null;
                }
                this.field5661.method1646(0, (long) (arg1 * 6));
                this.field5661.method1648((byte) -100, 0, class427.field6157, 6);
                if (arg0 > -22) {
                    this.toString();
                }
                int var5 = (class427.field6157[0] & 0xFF << 16) + (class427.field6157[2] & 0xFF) + ((class427.field6157[1] & 0xFF) << 8);
                int var6 = (class427.field6157[4] & 0xFF << 8) + ((class427.field6157[3] & 0xFF << 16) + (class427.field6157[5] & 0xFF));
                if (var5 < 0 || var5 > this.field5665) {
                    return null;
                } else if (var6 > 0 && ((long) var6) <= (this.field5650.method1643(-99216864) / 520L)) {
                    byte[] var9 = new byte[var5];
                    int var10 = 0;
                    int var11 = 0;
                    label72: while (var10 < var5) {
                        if (var6 == 0) {
                            return null;
                        }
                        this.field5650.method1646(0, (long) (var6 * 520));
                        int var13 = var5 - var10;
                        if (var13 > 512) {
                            var13 = 512;
                        }
                        this.field5650.method1648((byte) -88, 0, class427.field6157, var13 + 8);
                        int var14 = ((class427.field6157[0] & 0xFF) << 8) + (class427.field6157[1] & 0xFF);
                        int var15 = ((class427.field6157[2] & 0xFF) << 8) + (class427.field6157[3] & 0xFF);
                        int var16 = (class427.field6157[5] & 0xFF << 8) + ((class427.field6157[4] & 0xFF) << 16) + (class427.field6157[6] & 0xFF);
                        int var17 = class427.field6157[7] & 0xFF;
                        if (arg1 == var14 && var11 == var15 && this.field5660 == var17) {
                            if (var16 >= 0 && ((long) var16) <= (this.field5650.method1643(-99216864) / 520L)) {
                                var11++;
                                var6 = var16;
                                int var20 = 0;
                                while (true) {
                                    if (var20 >= var13) {
                                        continue label72;
                                    }
                                    var9[var10++] = class427.field6157[var20 + 8];
                                    var20++;
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
            } catch (IOException var39) {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(IIII)V")
    public static final void method2381(int arg0, int arg1, int arg2, int arg3) {
        field5655++;
        int var4 = class224.field3102 * arg1 >> 8;
        if (arg2 != -27247) {
            field5664 = 79;
        }
        if (var4 != 0 && arg3 != -1) {
            class53.method286(class258.field3728, var4, arg3, (byte) 91, false, 0);
            class60.field756 = true;
        }
    }

    @OriginalMember(owner = "client!hc", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field5651++;
        return "Cache:" + this.field5660;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(I[BII)Z")
    public final boolean method2382(int arg0, byte[] arg1, int arg2, int arg3) {
        field5652++;
        if (arg0 < 52) {
            field5663 = false;
        }
        class274 var5 = this.field5650;
        synchronized (this.field5650) {
            if (arg3 < 0 || this.field5665 < arg3) {
                throw new IllegalArgumentException();
            }
            boolean var6 = this.method2384(arg2, arg1, arg3, true, false);
            if (!var6) {
                var6 = this.method2384(arg2, arg1, arg3, false, false);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(Lab;I)V")
    public static final void method2383(class256 arg0, int arg1) {
        field5653++;
        if (arg1 > 5 && class76.field921 == arg0.field3559) {
            class61.field764[arg0.field3594] = true;
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(I[BIZZ)Z")
    private final boolean method2384(int arg0, byte[] arg1, int arg2, boolean arg3, boolean arg4) {
        field5659++;
        class274 var6 = this.field5650;
        synchronized (this.field5650) {
            try {
                int var7;
                if (arg3) {
                    if ((long) (arg0 * 6 + 6) > this.field5661.method1643(-99216864)) {
                        return false;
                    }
                    this.field5661.method1646(0, (long) (arg0 * 6));
                    this.field5661.method1648((byte) -65, 0, class427.field6157, 6);
                    var7 = ((class427.field6157[3] & 0xFF) << 16) + (class427.field6157[5] & 0xFF) + (class427.field6157[4] & 0xFF << 8);
                    if (var7 <= 0 || this.field5650.method1643(-99216864) / 520L < (long) var7) {
                        return false;
                    }
                } else {
                    var7 = (int) ((this.field5650.method1643(-99216864) + 519L) / 520L);
                    if (var7 == 0) {
                        var7 = 1;
                    }
                }
                class427.field6157[4] = (byte) (var7 >> 8);
                class427.field6157[1] = (byte) (arg2 >> 8);
                class427.field6157[2] = (byte) arg2;
                class427.field6157[3] = (byte) (var7 >> 16);
                class427.field6157[5] = (byte) var7;
                class427.field6157[0] = (byte) (arg2 >> 16);
                this.field5661.method1646(0, (long) (arg0 * 6));
                this.field5661.method1647(class427.field6157, -855377040, 0, 6);
                int var10 = 0;
                int var11 = 0;
                while (true) {
                    if (var10 < arg2) {
                        label112: {
                            int var12 = 0;
                            if (arg3) {
                                label110: {
                                    this.field5650.method1646(0, (long) (var7 * 520));
                                    try {
                                        this.field5650.method1648((byte) -114, 0, class427.field6157, 8);
                                    } catch (EOFException var33) {
                                        break label112;
                                    }
                                    int var13 = ((class427.field6157[0] & 0xFF) << 8) + (class427.field6157[1] & 0xFF);
                                    var12 = (class427.field6157[5] & 0xFF << 8) + ((class427.field6157[4] & 0xFF) << 16) + (class427.field6157[6] & 0xFF);
                                    int var14 = (class427.field6157[2] & 0xFF << 8) + (class427.field6157[3] & 0xFF);
                                    int var15 = class427.field6157[7] & 0xFF;
                                    if (arg0 == var13 && var11 == var14 && this.field5660 == var15) {
                                        if (var12 >= 0 && (long) var12 <= this.field5650.method1643(-99216864) / 520L) {
                                            break label110;
                                        }
                                        return false;
                                    }
                                    return false;
                                }
                            }
                            if (var12 == 0) {
                                var12 = (int) ((this.field5650.method1643(-99216864) + 519L) / 520L);
                                arg3 = false;
                                if (var12 == 0) {
                                    var12++;
                                }
                                if (var7 == var12) {
                                    var12++;
                                }
                            }
                            class427.field6157[1] = (byte) arg0;
                            class427.field6157[3] = (byte) var11;
                            class427.field6157[2] = (byte) (var11 >> 8);
                            class427.field6157[0] = (byte) (arg0 >> 8);
                            if (arg2 - var10 <= 512) {
                                var12 = 0;
                            }
                            class427.field6157[4] = (byte) (var12 >> 16);
                            class427.field6157[7] = (byte) this.field5660;
                            class427.field6157[5] = (byte) (var12 >> 8);
                            class427.field6157[6] = (byte) var12;
                            this.field5650.method1646(0, (long) (var7 * 520));
                            this.field5650.method1647(class427.field6157, -855377040, 0, 8);
                            int var18 = arg2 - var10;
                            if (var18 > 512) {
                                var18 = 512;
                            }
                            this.field5650.method1647(arg1, -855377040, var10, var18);
                            var7 = var12;
                            var11++;
                            var10 += var18;
                            continue;
                        }
                    }
                    if (arg4) {
                        this.method2384(116, (byte[]) null, -45, true, true);
                    }
                    return true;
                }
            } catch (IOException var34) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(I)V")
    public static void method2385(int arg0) {
        field5667 = null;
        field5657 = null;
        field5666 = null;
        field5654 = null;
        if (arg0 != 666584968) {
            field5663 = true;
        }
        field5662 = null;
    }

    @OriginalMember(owner = "client!hc", name = "<init>", descriptor = "(ILet;Let;I)V")
    public class398(int arg0, class274 arg1, class274 arg2, int arg3) {
        this.field5661 = arg2;
        this.field5665 = arg3;
        this.field5650 = arg1;
        this.field5660 = arg0;
    }
}
