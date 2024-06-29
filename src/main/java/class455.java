import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!km")
public class class455 {

    @OriginalMember(owner = "client!km", name = "g", descriptor = "Lgca;")
    private class209 field6262 = new class209(256);

    @OriginalMember(owner = "client!km", name = "o", descriptor = "Lgca;")
    private class209 field6270 = new class209(256);

    @OriginalMember(owner = "client!km", name = "h", descriptor = "Lwu;")
    private class557 field6263;

    @OriginalMember(owner = "client!km", name = "a", descriptor = "Lwu;")
    private class557 field6256;

    @OriginalMember(owner = "client!km", name = "c", descriptor = "[I")
    public static int[] field6258 = new int[] { 2, 1, 1, 1, 2, 2, 2, 1, 3, 3, 3, 2, 0, 4, 0 };

    @OriginalMember(owner = "client!km", name = "l", descriptor = "[F")
    public static float[] field6267 = new float[2];

    @OriginalMember(owner = "client!km", name = "k", descriptor = "J")
    public static long field6266 = 0L;

    @OriginalMember(owner = "client!km", name = "q", descriptor = "J")
    public static long field6272 = (long) (Math.random() * 9.999999999E9D);

    @OriginalMember(owner = "client!km", name = "f", descriptor = "F")
    public static float field6261;

    @OriginalMember(owner = "client!km", name = "d", descriptor = "I")
    public static int field6259;

    @OriginalMember(owner = "client!km", name = "i", descriptor = "I")
    public static int field6264;

    @OriginalMember(owner = "client!km", name = "j", descriptor = "I")
    public static int field6265;

    @OriginalMember(owner = "client!km", name = "m", descriptor = "I")
    public static int field6268;

    @OriginalMember(owner = "client!km", name = "n", descriptor = "I")
    public static int field6269;

    @OriginalMember(owner = "client!km", name = "p", descriptor = "I")
    public static int field6271;

    @OriginalMember(owner = "client!km", name = "e", descriptor = "Lg;")
    public static class594 field6260;

    @OriginalMember(owner = "client!km", name = "b", descriptor = "Ljava/awt/Frame;")
    public static Frame field6257;

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(IB[II)Laaa;")
    private final class25 method2731(int arg0, byte arg1, int[] arg2, int arg3) {
        field6271++;
        int var5 = arg3 ^ ((arg0 & 0xFFF) << 4 | arg0 >>> 12);
        int var6 = var5 | arg0 << 16;
        long var7 = (long) var6;
        class25 var9 = (class25) this.field6270.method1381(true, var7);
        if (var9 != null) {
            return var9;
        } else if (arg2 == null || arg2[0] > 0) {
            class258 var10 = class258.method1605(this.field6263, arg0, arg3);
            if (var10 == null) {
                return null;
            }
            if (arg1 > -18) {
                this.method2735((byte) -27, -14, null);
            }
            class25 var11 = var10.method1608();
            this.field6270.method1387(var11, var7, (byte) -116);
            if (arg2 != null) {
                arg2[0] -= var11.field275.length;
            }
            return var11;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(I[III)Laaa;")
    private final class25 method2732(int arg0, int[] arg1, int arg2, int arg3) {
        field6269++;
        int var5 = arg0 ^ (arg2 << 4 & 0xFFF7 | arg2 >>> 12);
        int var6 = var5 | arg2 << 16;
        long var7 = (long) var6 ^ 0x100000000L;
        class25 var9 = (class25) this.field6270.method1381(true, var7);
        if (var9 != null) {
            return var9;
        } else if (arg1 == null || arg1[0] > 0) {
            if (arg3 != -1) {
                this.method2735((byte) -127, -104, null);
            }
            class110 var10 = (class110) this.field6262.method1381(true, var7);
            if (var10 == null) {
                var10 = class110.method744(this.field6256, arg2, arg0);
                if (var10 == null) {
                    return null;
                }
                this.field6262.method1387(var10, var7, (byte) -113);
            }
            class25 var11 = var10.method737(arg1);
            if (var11 == null) {
                return null;
            } else {
                var10.method3065(-17363);
                this.field6270.method1387(var11, var7, (byte) -122);
                return var11;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(B)V")
    public static void method2733(byte arg0) {
        field6258 = null;
        if (arg0 >= 24) {
            field6257 = null;
            field6260 = null;
            field6267 = null;
        }
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(I[II)Laaa;")
    public final class25 method2734(int arg0, int[] arg1, int arg2) {
        if (arg2 != 0) {
            this.field6256 = null;
        }
        field6268++;
        if (this.field6256.method3341((byte) 26) == 1) {
            return this.method2732(arg0, arg1, 0, arg2 - 1);
        } else if (this.field6256.method3333(arg0, 3443) == 1) {
            return this.method2732(0, arg1, arg0, -1);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(BI[I)Laaa;")
    public final class25 method2735(byte arg0, int arg1, int[] arg2) {
        field6264++;
        if (this.field6263.method3341((byte) 51) == 1) {
            return this.method2731(0, (byte) -118, arg2, arg1);
        }
        if (arg0 != -88) {
            field6260 = null;
        }
        if (this.field6263.method3333(arg1, 3443) != 1) {
            throw new RuntimeException();
        }
        return this.method2731(arg1, (byte) -105, arg2, 0);
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(IIZLfw;I)Z")
    public static final boolean method2736(int arg0, int arg1, boolean arg2, class217 arg3, int arg4) {
        field6259++;
        if (!class57.field802 || !class238.field3315) {
            return false;
        } else if (class129.field1762 < 100) {
            return false;
        } else if (class614.method3603(arg0, arg2, arg4, arg1)) {
            int var5 = arg4 << class509.field7106;
            int var6 = arg0 << class509.field7106;
            int var7 = class52.field741[arg1].method1959(126, arg0, arg4) - 1;
            int var8 = arg3.method268(-1) + var7;
            if (arg3.field3072 == 1) {
                if (!class640.method3720(var5, var5, var6, true, var8, class96.field1402 + var6, var7, var5, var6, var8)) {
                    return false;
                } else if (class640.method3720(var5, var5, class96.field1402 + var6, true, var8, class96.field1402 + var6, var7, var5, var6, var7)) {
                    class114.field1607++;
                    return true;
                } else {
                    return false;
                }
            } else if (arg3.field3072 == 2) {
                if (!class640.method3720(var5, var5, class96.field1402 + var6, true, var8, class96.field1402 + var6, var7, var5 + class96.field1402, class96.field1402 + var6, var8)) {
                    return false;
                } else if (class640.method3720(class96.field1402 + var5, var5, class96.field1402 + var6, true, var7, var6 + class96.field1402, var7, var5 + class96.field1402, var6 - -class96.field1402, var8)) {
                    class114.field1607++;
                    return true;
                } else {
                    return false;
                }
            } else if (arg3.field3072 != 4) {
                if (arg2) {
                    field6260 = null;
                }
                if (arg3.field3072 == 8) {
                    if (!class640.method3720(var5, var5, var6, !arg2, var8, var6, var7, class96.field1402 + var5, var6, var8)) {
                        return false;
                    } else if (class640.method3720(class96.field1402 + var5, var5, var6, true, var7, var6, var7, var5 + class96.field1402, var6, var8)) {
                        class114.field1607++;
                        return true;
                    } else {
                        return false;
                    }
                } else if (arg3.field3072 == 16) {
                    if (class141.method909(class457.field6297 + var6, class457.field6297, var5, var8, -94, class457.field6297, var7)) {
                        class114.field1607++;
                        return true;
                    } else {
                        return false;
                    }
                } else if (arg3.field3072 == 32) {
                    if (class141.method909(var6 + class457.field6297, class457.field6297, class457.field6297 + var5, var8, -96, class457.field6297, var7)) {
                        class114.field1607++;
                        return true;
                    } else {
                        return false;
                    }
                } else if (arg3.field3072 == 64) {
                    if (class141.method909(var6, class457.field6297, class457.field6297 + var5, var8, -126, class457.field6297, var7)) {
                        class114.field1607++;
                        return true;
                    } else {
                        return false;
                    }
                } else if (arg3.field3072 != 128) {
                    return true;
                } else if (class141.method909(var6, class457.field6297, var5, var8, -112, class457.field6297, var7)) {
                    class114.field1607++;
                    return true;
                } else {
                    return false;
                }
            } else if (!class640.method3720(class96.field1402 + var5, class96.field1402 + var5, var6, true, var8, class96.field1402 + var6, var7, class96.field1402 + var5, var6, var8)) {
                return false;
            } else if (class640.method3720(var5 + class96.field1402, class96.field1402 + var5, class96.field1402 + var6, true, var8, class96.field1402 + var6, var7, var5 + class96.field1402, var6, var7)) {
                class114.field1607++;
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!km", name = "<init>", descriptor = "(Lwu;Lwu;)V")
    public class455(class557 arg0, class557 arg1) {
        this.field6263 = arg0;
        this.field6256 = arg1;
    }
}
