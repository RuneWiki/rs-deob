import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public class class119 {

    @OriginalMember(owner = "client!nc", name = "i", descriptor = "[I")
    private int[] field2327;

    @OriginalMember(owner = "client!nc", name = "m", descriptor = "[B")
    private byte[] field2331;

    @OriginalMember(owner = "client!nc", name = "o", descriptor = "[I")
    private int[] field2333;

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "Lsg;")
    public static class30 field2319 = class167.method1221((byte) 33, ":tradereq:");

    @OriginalMember(owner = "client!nc", name = "e", descriptor = "[I")
    public static int[] field2323 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @OriginalMember(owner = "client!nc", name = "d", descriptor = "I")
    public static int field2322 = 0;

    @OriginalMember(owner = "client!nc", name = "l", descriptor = "[I")
    public static int[] field2330 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "client!nc", name = "p", descriptor = "[Lug;")
    public static class257[] field2334 = new class257[27];

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "I")
    public static int field2320;

    @OriginalMember(owner = "client!nc", name = "c", descriptor = "I")
    public static int field2321;

    @OriginalMember(owner = "client!nc", name = "f", descriptor = "I")
    public static int field2324;

    @OriginalMember(owner = "client!nc", name = "g", descriptor = "I")
    public static int field2325;

    @OriginalMember(owner = "client!nc", name = "h", descriptor = "I")
    public static int field2326;

    @OriginalMember(owner = "client!nc", name = "j", descriptor = "I")
    public static int field2328;

    @OriginalMember(owner = "client!nc", name = "n", descriptor = "I")
    public static int field2332;

    @OriginalMember(owner = "client!nc", name = "k", descriptor = "[Lgj;")
    public static class192[] field2329;

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(II[BII[B)I")
    public final int method906(int arg0, int arg1, byte[] arg2, int arg3, int arg4, byte[] arg5) {
        if (arg3 != 17596) {
            method910(-70, -123, (class66) null, (Component) null, -79);
        }
        field2325++;
        if (arg0 == 0) {
            return 0;
        }
        int var7 = arg0 + arg4;
        int var8 = 0;
        int var9 = arg1;
        while (true) {
            byte var10 = arg5[var9];
            if (var10 >= 0) {
                var8++;
            } else {
                var8 = this.field2333[var8];
            }
            int var11;
            if ((var11 = this.field2333[var8]) < 0) {
                arg2[arg4++] = (byte) (~var11);
                if (var7 <= arg4) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x40) == 0) {
                var8++;
            } else {
                var8 = this.field2333[var8];
            }
            int var12;
            if ((var12 = this.field2333[var8]) < 0) {
                arg2[arg4++] = (byte) (~var12);
                if (arg4 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x20) == 0) {
                var8++;
            } else {
                var8 = this.field2333[var8];
            }
            int var13;
            if ((var13 = this.field2333[var8]) < 0) {
                arg2[arg4++] = (byte) (~var13);
                if (var7 <= arg4) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x10) == 0) {
                var8++;
            } else {
                var8 = this.field2333[var8];
            }
            int var14;
            if ((var14 = this.field2333[var8]) < 0) {
                arg2[arg4++] = (byte) (~var14);
                if (var7 <= arg4) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x8) == 0) {
                var8++;
            } else {
                var8 = this.field2333[var8];
            }
            int var15;
            if ((var15 = this.field2333[var8]) < 0) {
                arg2[arg4++] = (byte) (~var15);
                if (arg4 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x4) == 0) {
                var8++;
            } else {
                var8 = this.field2333[var8];
            }
            int var16;
            if ((var16 = this.field2333[var8]) < 0) {
                arg2[arg4++] = (byte) (~var16);
                if (arg4 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x2) == 0) {
                var8++;
            } else {
                var8 = this.field2333[var8];
            }
            int var17;
            if ((var17 = this.field2333[var8]) < 0) {
                arg2[arg4++] = (byte) (~var17);
                if (var7 <= arg4) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x1) == 0) {
                var8++;
            } else {
                var8 = this.field2333[var8];
            }
            int var18;
            if ((var18 = this.field2333[var8]) < 0) {
                arg2[arg4++] = (byte) (~var18);
                if (arg4 >= var7) {
                    break;
                }
                var8 = 0;
            }
            var9++;
        }
        return var9 + 1 - arg1;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(IIII)V")
    public static final void method907(int arg0, int arg1, int arg2, int arg3) {
        field2326++;
        if (arg0 == 10522) {
            class68 var4 = class103.method830(arg1, 4, 4);
            var4.method608(false);
            var4.field1490 = arg3;
            var4.field1484 = arg2;
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(Z)V")
    public static void method908(boolean arg0) {
        field2319 = null;
        if (arg0) {
            field2330 = null;
            field2329 = null;
            field2334 = null;
            field2323 = null;
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(IIZI)Lsg;")
    public static final class30 method909(int arg0, int arg1, boolean arg2, int arg3) {
        field2328++;
        if (arg3 < 2 || arg3 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg3);
        }
        int var4 = 1;
        int var5 = arg1 / arg3;
        while (var5 != 0) {
            var5 /= arg3;
            var4++;
        }
        int var6 = var4;
        if (arg1 < 0 || arg2) {
            var6 = var4 + 1;
        }
        byte[] var7 = new byte[var6];
        if (arg1 < 0) {
            var7[0] = 45;
        } else if (arg2) {
            var7[0] = 43;
        }
        for (int var8 = 0; var8 < var4; var8++) {
            int var10 = arg1 % arg3;
            arg1 /= arg3;
            if (var10 < 0) {
                var10 = -var10;
            }
            if (var10 > 9) {
                var10 += 39;
            }
            var7[var6 - var8 - 1] = (byte) (var10 + 48);
        }
        class30 var9 = new class30();
        var9.field576 = var6;
        if (arg0 > -73) {
            method909(1, -118, true, -36);
        }
        var9.field618 = var7;
        return var9;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(IILbi;Ljava/awt/Component;I)Lde;")
    public static final class50 method910(int arg0, int arg1, class66 arg2, Component arg3, int arg4) {
        field2320++;
        if (class121.field2389 == 0) {
            throw new IllegalStateException();
        } else if (arg0 >= 0 && arg0 < 2) {
            if (arg1 < 256) {
                arg1 = 256;
            }
            try {
                class50 var5 = (class50) Class.forName("h").getDeclaredConstructor().newInstance();
                var5.field1153 = arg1;
                var5.field1130 = new int[(class134.field2618 ? 2 : 1) * 256];
                var5.method489(arg3);
                var5.field1155 = (arg1 & 0xFFFFFC00) + 1024;
                if (var5.field1155 > 16384) {
                    var5.field1155 = 16384;
                }
                var5.method497(var5.field1155);
                if (class130.field2574 > 0 && class40.field994 == null) {
                    class40.field994 = new class256();
                    class40.field994.field4518 = arg2;
                    arg2.method592(class40.field994, -23, class130.field2574);
                }
                if (class40.field994 != null) {
                    if (class40.field994.field4512[arg0] != null) {
                        throw new IllegalArgumentException();
                    }
                    class40.field994.field4512[arg0] = var5;
                }
                return var5;
            } catch (Throwable var8) {
                try {
                    class156 var6 = new class156(arg2, arg0);
                    var6.field1130 = new int[(class134.field2618 ? 2 : 1) * 256];
                    var6.field1153 = arg1;
                    if (arg4 >= -120) {
                        method910(88, -31, (class66) null, (Component) null, -114);
                    }
                    var6.method489(arg3);
                    var6.field1155 = 16384;
                    var6.method497(var6.field1155);
                    if (class130.field2574 > 0 && class40.field994 == null) {
                        class40.field994 = new class256();
                        class40.field994.field4518 = arg2;
                        arg2.method592(class40.field994, -128, class130.field2574);
                    }
                    if (class40.field994 != null) {
                        if (class40.field994.field4512[arg0] != null) {
                            throw new IllegalArgumentException();
                        }
                        class40.field994.field4512[arg0] = var6;
                    }
                    return var6;
                } catch (Throwable var7) {
                    return new class50();
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(IIII[B[B)I")
    public final int method911(int arg0, int arg1, int arg2, int arg3, byte[] arg4, byte[] arg5) {
        int var7 = arg0 + arg1;
        field2332++;
        int var8 = 0;
        if (arg2 < 31) {
            return -91;
        }
        int var9 = arg3 << 3;
        while (arg0 < var7) {
            int var10 = arg5[arg0] & 0xFF;
            int var11 = this.field2327[var10];
            byte var12 = this.field2331[var10];
            if (var12 == 0) {
                throw new RuntimeException("No codeword for data value " + var10);
            }
            int var13 = var9 & 0x7;
            int var14 = var8 & -var13 >> 31;
            int var15 = var9 >> 3;
            var9 += var12;
            int var16 = var15 + (var12 + var13 - 1 >> 3);
            int var17 = var13 + 24;
            arg4[var15] = (byte) (var8 = class182.method1314(var14, var11 >>> var17));
            if (var15 < var16) {
                var15++;
                var13 = var17 - 8;
                arg4[var15] = (byte) (var8 = var11 >>> var13);
                if (var16 > var15) {
                    var15++;
                    var13 -= 8;
                    arg4[var15] = (byte) (var8 = var11 >>> var13);
                    if (var16 > var15) {
                        var13 -= 8;
                        var15++;
                        arg4[var15] = (byte) (var8 = var11 >>> var13);
                        if (var15 < var16) {
                            var15++;
                            var13 -= 8;
                            arg4[var15] = (byte) (var8 = var11 << -var13);
                        }
                    }
                }
            }
            arg0++;
        }
        return (var9 + 7 >> 3) - arg3;
    }

    @OriginalMember(owner = "client!nc", name = "<init>", descriptor = "([B)V")
    public class119(byte[] arg0) {
        int var2 = arg0.length;
        this.field2327 = new int[var2];
        this.field2331 = arg0;
        this.field2333 = new int[8];
        int[] var3 = new int[33];
        int var4 = 0;
        for (int var5 = 0; var5 < var2; var5++) {
            byte var6 = arg0[var5];
            if (var6 != 0) {
                int var7 = 0x1 << 32 - var6;
                int var8 = var3[var6];
                this.field2327[var5] = var8;
                int var12;
                if ((var8 & var7) == 0) {
                    for (int var9 = var6 - 1; var9 >= 1; var9--) {
                        int var10 = var3[var9];
                        if (var8 != var10) {
                            break;
                        }
                        int var11 = 0x1 << 32 - var9;
                        if ((var10 & var11) != 0) {
                            var3[var9] = var3[var9 - 1];
                            break;
                        }
                        var3[var9] = class182.method1314(var11, var10);
                    }
                    var12 = var7 | var8;
                } else {
                    var12 = var3[var6 - 1];
                }
                var3[var6] = var12;
                for (int var13 = var6 + 1; var13 <= 32; var13++) {
                    if (var3[var13] == var8) {
                        var3[var13] = var12;
                    }
                }
                int var14 = 0;
                for (int var15 = 0; var15 < var6; var15++) {
                    int var16 = Integer.MIN_VALUE >>> var15;
                    if ((var8 & var16) == 0) {
                        var14++;
                    } else {
                        if (this.field2333[var14] == 0) {
                            this.field2333[var14] = var4;
                        }
                        var14 = this.field2333[var14];
                    }
                    int var17 = var16 >>> 1;
                    if (this.field2333.length <= var14) {
                        int[] var18 = new int[this.field2333.length * 2];
                        for (int var19 = 0; var19 < this.field2333.length; var19++) {
                            var18[var19] = this.field2333[var19];
                        }
                        this.field2333 = var18;
                    }
                }
                this.field2333[var14] = ~var5;
                if (var4 <= var14) {
                    var4 = var14 + 1;
                }
            }
        }
    }
}
