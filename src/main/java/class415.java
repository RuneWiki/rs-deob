import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wh")
public class class415 {

    @OriginalMember(owner = "client!wh", name = "d", descriptor = "Ljr;")
    private class357 field5516 = new class357(256);

    @OriginalMember(owner = "client!wh", name = "r", descriptor = "Ljr;")
    private class357 field5530 = new class357(256);

    @OriginalMember(owner = "client!wh", name = "e", descriptor = "Ldn;")
    private class201 field5517;

    @OriginalMember(owner = "client!wh", name = "m", descriptor = "Ldn;")
    private class201 field5525;

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "Lgp;")
    public static class459 field5514 = new class459(8, 14);

    @OriginalMember(owner = "client!wh", name = "g", descriptor = "I")
    public static int field5519 = 0;

    @OriginalMember(owner = "client!wh", name = "o", descriptor = "Loi;")
    public static class169 field5527 = new class169("Prepared sound engine", "Musik-Engine vorbereitet.", "Moteur son préparé", "Mecanismo de som preparado");

    @OriginalMember(owner = "client!wh", name = "p", descriptor = "[I")
    public static int[] field5528 = new int[1];

    @OriginalMember(owner = "client!wh", name = "t", descriptor = "[Lhi;")
    public static class44[] field5532;

    @OriginalMember(owner = "client!wh", name = "u", descriptor = "[S")
    public static short[] field5533;

    @OriginalMember(owner = "client!wh", name = "v", descriptor = "Z")
    public static boolean field5534;

    @OriginalMember(owner = "client!wh", name = "s", descriptor = "F")
    public static float field5531;

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "I")
    public static int field5513;

    @OriginalMember(owner = "client!wh", name = "c", descriptor = "I")
    public static int field5515;

    @OriginalMember(owner = "client!wh", name = "f", descriptor = "I")
    public static int field5518;

    @OriginalMember(owner = "client!wh", name = "h", descriptor = "I")
    public static int field5520;

    @OriginalMember(owner = "client!wh", name = "i", descriptor = "I")
    public static int field5521;

    @OriginalMember(owner = "client!wh", name = "j", descriptor = "I")
    public static int field5522;

    @OriginalMember(owner = "client!wh", name = "k", descriptor = "I")
    public static int field5523;

    @OriginalMember(owner = "client!wh", name = "l", descriptor = "I")
    public static int field5524;

    @OriginalMember(owner = "client!wh", name = "n", descriptor = "I")
    public static int field5526;

    @OriginalMember(owner = "client!wh", name = "q", descriptor = "I")
    public static int field5529;

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(II[II)Leb;")
    private final class59 method2438(int arg0, int arg1, int[] arg2, int arg3) {
        field5522++;
        int var5 = arg1 ^ ((arg3 & arg0) << 4 | arg3 >>> 12);
        int var6 = var5 | arg3 << 16;
        long var7 = (long) var6 ^ 0x100000000L;
        class59 var9 = (class59) this.field5530.method2085(var7, arg0 - 1342186798);
        if (var9 != null) {
            return var9;
        } else if (arg2 == null || arg2[0] > 0) {
            class309 var10 = (class309) this.field5516.method2085(var7, -5423);
            if (var10 == null) {
                var10 = class309.method1840(this.field5517, arg3, arg1);
                if (var10 == null) {
                    return null;
                }
                this.field5516.method2096(var7, var10, (byte) 76);
            }
            class59 var11 = var10.method1844(arg2);
            if (var11 == null) {
                return null;
            } else {
                var10.method3021(-101);
                this.field5530.method2096(var7, var11, (byte) 76);
                return var11;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(JLeo;IIIILea;II)V")
    public static final void method2439(long arg0, class423 arg1, int arg2, int arg3, int arg4, int arg5, class113 arg6, int arg7, int arg8) {
        int var10 = 11 / ((10 - arg2) / 52);
        field5515++;
        int var11 = arg3 * arg3 + arg4 * arg4;
        if ((long) var11 > arg0) {
            return;
        }
        int var12 = Math.min(arg1.field5735 / 2, arg1.field5726 / 2);
        if (var12 * var12 >= var11) {
            class519.method3087(arg5, arg6, arg3, (byte) -113, arg4, arg1, arg8, class328.field4215[arg7]);
            return;
        }
        var12 -= 10;
        int var13;
        if (class396.field5271 == 4) {
            var13 = (int) class244.field3138 & 0x3FFF;
        } else {
            var13 = (int) class244.field3138 + class446.field6192 & 0x3FFF;
        }
        int var14 = class21.field385[var13];
        int var15 = class21.field397[var13];
        if (class396.field5271 != 4) {
            var14 = var14 * 256 / (class364.field4694 + 256);
            var15 = var15 * 256 / (class364.field4694 + 256);
        }
        int var16 = arg3 * var14 + arg4 * var15 >> 15;
        int var17 = arg3 * var15 - (arg4 * var14) >> 15;
        double var18 = Math.atan2((double) var16, (double) var17);
        int var20 = (int) (Math.sin(var18) * (double) var12);
        int var21 = (int) ((double) var12 * Math.cos(var18));
        class310.field4007[arg7].method2403((float) arg1.field5735 / 2.0F + (float) arg5 + (float) var20, (float) arg1.field5726 / 2.0F + (float) arg8 - (float) var21, 4096, (int) (-var18 / 6.283185307179586D * 65535.0D));
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(ILeo;)V")
    public static final void method2440(int arg0, class423 arg1) {
        if (class254.field3210 == arg1.field5805) {
            class76.field967[arg1.field5811] = true;
        }
        if (arg0 == 10) {
            field5513++;
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "([III)Leb;")
    public final class59 method2441(int[] arg0, int arg1, int arg2) {
        field5524++;
        if (arg2 != 6255) {
            return null;
        } else if (this.field5517.method1309((byte) 31) == 1) {
            return this.method2438(arg2 ^ 0x50001790, arg1, arg0, 0);
        } else if (this.field5517.method1302(arg2 ^ 0xFFFFE7F9, arg1) == 1) {
            return this.method2438(1342181375, 0, arg0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(ILjava/lang/String;)I")
    public static final int method2442(int arg0, String arg1) {
        field5518++;
        int var2 = -98 / ((16 - arg0) / 46);
        return arg1.length() + 1;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(Z)Lcc;")
    public static final class343 method2443(boolean arg0) {
        field5526++;
        if (class230.field2953 == null || class63.field804 == null) {
            return null;
        }
        class63.field804.method463(class230.field2953, arg0);
        class343 var1 = (class343) class63.field804.method465(false);
        if (var1 == null) {
            return null;
        } else {
            class429 var2 = class230.field2950.method1093(var1.field4371, 65);
            return var2 != null && var2.field5902 && var2.method2544(class230.field2944, -80) ? var1 : class509.method3024(124);
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(IILpb;I)Lpl;")
    public static final class457 method2444(int arg0, int arg1, class296 arg2, int arg3) {
        field5520++;
        int var4 = 53 / ((46 - arg1) / 48);
        int var5 = arg2.field3843 | arg3 << 8;
        class457 var6 = (class457) class489.field7136.method672((long) var5 << 16, (byte) -75);
        if (var6 != null) {
            return var6;
        }
        byte[] var7 = class491.field7174.method1320(class491.field7174.method1295((byte) 55, var5), 1);
        if (var7 == null) {
            int var9 = arg2.field3843 | arg0 + 65536 << 8;
            class457 var10 = (class457) class489.field7136.method672((long) var9 << 16, (byte) -75);
            if (var10 != null) {
                return var10;
            }
            byte[] var11 = class491.field7174.method1320(class491.field7174.method1295((byte) 55, var9), 1);
            if (var11 == null) {
                int var13 = arg2.field3843 | 0xFFFF00;
                class457 var14 = (class457) class489.field7136.method672((long) var13 << 16, (byte) -75);
                if (var14 != null) {
                    return var14;
                }
                byte[] var15 = class491.field7174.method1320(class491.field7174.method1295((byte) 55, var13), 1);
                if (var15 == null) {
                    return null;
                } else if (var15.length <= 1) {
                    return null;
                } else {
                    class457 var16 = class421.method2489(false, var15);
                    var16.field6378 = arg2;
                    class489.field7136.method668(var16, (long) var13 << 16, -1);
                    return var16;
                }
            } else if (var11.length <= 1) {
                return null;
            } else {
                class457 var12 = class421.method2489(false, var11);
                var12.field6378 = arg2;
                class489.field7136.method668(var12, (long) var9 << 16, -1);
                return var12;
            }
        } else if (var7.length <= 1) {
            return null;
        } else {
            class457 var8 = class421.method2489(false, var7);
            var8.field6378 = arg2;
            class489.field7136.method668(var8, (long) var5 << 16, -1);
            return var8;
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "([IBI)Leb;")
    public final class59 method2445(int[] arg0, byte arg1, int arg2) {
        field5523++;
        if (arg1 != -102) {
            method2442(-21, null);
        }
        if (this.field5525.method1309((byte) 31) == 1) {
            return this.method2446(true, arg2, 0, arg0);
        } else if (this.field5525.method1302(arg1 + 30, arg2) == 1) {
            return this.method2446(true, 0, arg2, arg0);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(ZII[I)Leb;")
    private final class59 method2446(boolean arg0, int arg1, int arg2, int[] arg3) {
        field5521++;
        int var5 = arg1 ^ (arg2 >>> 12 | (arg2 & 0x20000FFF) << 4);
        int var6 = var5 | arg2 << 16;
        long var7 = (long) var6;
        class59 var9 = (class59) this.field5530.method2085(var7, -5423);
        if (var9 != null) {
            return var9;
        } else if (arg3 == null || arg3[0] > 0) {
            class384 var10 = class384.method2299(this.field5525, arg2, arg1);
            if (var10 == null) {
                return null;
            }
            if (!arg0) {
                method2447(-112);
            }
            class59 var11 = var10.method2300();
            this.field5530.method2096(var7, var11, (byte) 76);
            if (arg3 != null) {
                arg3[0] -= var11.field781.length;
            }
            return var11;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(I)V")
    public static void method2447(int arg0) {
        field5533 = null;
        field5528 = null;
        field5527 = null;
        field5532 = null;
        if (arg0 != -1) {
            field5531 = 0.15431093F;
        }
        field5514 = null;
    }

    @OriginalMember(owner = "client!wh", name = "<init>", descriptor = "(Ldn;Ldn;)V")
    public class415(class201 arg0, class201 arg1) {
        this.field5517 = arg1;
        this.field5525 = arg0;
    }

    static {
        new class169("Invalid name", "Unzulässiger Name!", "Nom incorrect", "Nome inválido");
        field5532 = new class44[14];
        field5533 = new short[256];
        field5534 = false;
    }
}
