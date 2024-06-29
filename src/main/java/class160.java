import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uq")
public class class160 extends class12 {

    @OriginalMember(owner = "client!uq", name = "e", descriptor = "Ljava/net/Socket;")
    private Socket field2378;

    @OriginalMember(owner = "client!uq", name = "j", descriptor = "Lho;")
    private class148 field2383;

    @OriginalMember(owner = "client!uq", name = "d", descriptor = "Lhp;")
    private class327 field2377;

    @OriginalMember(owner = "client!uq", name = "f", descriptor = "[I")
    public static int[] field2379 = new int[] { 104, 120, 136, 168 };

    @OriginalMember(owner = "client!uq", name = "n", descriptor = "Lmp;")
    public static class758 field2387 = new class758(4);

    @OriginalMember(owner = "client!uq", name = "b", descriptor = "I")
    public static int field2375;

    @OriginalMember(owner = "client!uq", name = "c", descriptor = "I")
    public static int field2376;

    @OriginalMember(owner = "client!uq", name = "g", descriptor = "I")
    public static int field2380;

    @OriginalMember(owner = "client!uq", name = "h", descriptor = "I")
    public static int field2381;

    @OriginalMember(owner = "client!uq", name = "i", descriptor = "I")
    public static int field2382;

    @OriginalMember(owner = "client!uq", name = "k", descriptor = "I")
    public static int field2384;

    @OriginalMember(owner = "client!uq", name = "l", descriptor = "I")
    public static int field2385;

    @OriginalMember(owner = "client!uq", name = "m", descriptor = "I")
    public static int field2386;

    @OriginalMember(owner = "client!uq", name = "o", descriptor = "I")
    public static int field2388;

    @OriginalMember(owner = "client!uq", name = "q", descriptor = "I")
    public static int field2390;

    @OriginalMember(owner = "client!uq", name = "p", descriptor = "Lkd;")
    public static class280 field2389;

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(I)V")
    public final void method67(int arg0) {
        try {
            this.field2378.close();
        } catch (IOException var2) {
        }
        if (arg0 != -1) {
            this.method65(true);
        }
        field2382++;
        this.field2383.method1144(arg0 + 109);
        this.field2377.method2086(28650);
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(III[B)V")
    public final void method64(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        if (arg1 != -24243) {
            field2390 = -67;
        }
        this.field2377.method2088(false, arg0, arg3, arg2);
        field2375++;
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(II[FII[FFIFIII)V")
    public static final void method1207(int arg0, int arg1, float[] arg2, int arg3, int arg4, float[] arg5, float arg6, int arg7, float arg8, int arg9, int arg10, int arg11) {
        int var12 = arg7 - arg1;
        int var13 = arg10 - arg11;
        int var14 = arg9 - arg4;
        field2385++;
        float var15 = arg2[2] * (float) var12 + arg2[0] * (float) var13 + arg2[1] * (float) var14;
        float var16 = arg2[5] * (float) var12 + arg2[4] * (float) var14 + arg2[3] * (float) var13;
        float var17 = arg2[8] * (float) var12 + arg2[7] * (float) var14 + arg2[6] * (float) var13;
        if (arg3 != -167141975) {
            method1207(-50, -58, null, -15, -55, null, -0.39354238F, 125, 0.6276364F, -86, 123, -19);
        }
        float var18 = (float) Math.atan2((double) var15, (double) var17) / 6.2831855F + 0.5F;
        if (arg6 != 1.0F) {
            var18 = arg6 * var18;
        }
        float var19 = var16 + arg8 + 0.5F;
        if (arg0 == 1) {
            float var20 = var18;
            var18 = -var19;
            var19 = var20;
        } else if (arg0 == 2) {
            var19 = -var19;
            var18 = -var18;
        } else if (arg0 == 3) {
            float var21 = var18;
            var18 = var19;
            var19 = -var21;
        }
        arg5[1] = var19;
        arg5[0] = var18;
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(II[BI)I")
    public final int method68(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        field2376++;
        if (arg3 != -1) {
            field2390 = -80;
        }
        return this.field2383.method1146(arg1, arg2, -27845, arg0);
    }

    @OriginalMember(owner = "client!uq", name = "<init>", descriptor = "(Ljava/net/Socket;I)V")
    public class160(Socket arg0, int arg1) throws IOException {
        this.field2378 = arg0;
        this.field2378.setSoTimeout(30000);
        this.field2378.setTcpNoDelay(true);
        this.field2383 = new class148(this.field2378.getInputStream(), arg1);
        this.field2377 = new class327(this.field2378.getOutputStream(), arg1);
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(III)Z")
    public static final boolean method1208(int arg0, int arg1, int arg2) {
        if (arg0 != 65536) {
            method1210(-122);
        }
        field2381++;
        return class152.method1167(arg2, arg1, (byte) 84) || class189.method1330(arg1, 21721, arg2);
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(Z)V")
    public final void method65(boolean arg0) {
        field2386++;
        this.field2383.method1148(22708);
        this.field2377.method2090(0);
        if (!arg0) {
            field2390 = 19;
        }
    }

    @OriginalMember(owner = "client!uq", name = "b", descriptor = "(Z)V")
    public static void method1209(boolean arg0) {
        field2387 = null;
        field2389 = null;
        field2379 = null;
        if (arg0) {
            method1210(56);
        }
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(II)Z")
    public final boolean method66(int arg0, int arg1) throws IOException {
        int var3 = 42 / ((arg1 - 16) / 48);
        field2380++;
        return this.field2383.method1149(arg0, -75);
    }

    @OriginalMember(owner = "client!uq", name = "b", descriptor = "(I)V")
    public static final void method1210(int arg0) {
        field2388++;
        if (class471.field6781.field6668.method3947(27669) != 2) {
            return;
        }
        byte var1 = (byte) (class258.field3741 - 4 & 0xFF);
        int var2 = class258.field3741 % class174.field2540;
        for (int var3 = 0; var3 < 4; var3++) {
            for (int var18 = 0; var18 < class716.field9999; var18++) {
                class10.field141[var3][var2][var18] = var1;
            }
        }
        if (class312.field4409 == 3) {
            return;
        }
        for (int var4 = 0; var4 < 2; var4++) {
            class182.field2601[var4] = -1000000;
            class57.field1058[var4] = 1000000;
            class361.field5063[var4] = 0;
            class548.field7724[var4] = 1000000;
            class135.field2113[var4] = 0;
        }
        int var5 = class468.field6748.field644;
        int var6 = class468.field6748.field648;
        if (arg0 != 2) {
            method1211(-52, 11, 79, null);
        }
        if (class666.field9338 != 1 && class679.field9569 == -1) {
            int var7 = class534.method3136(1, class312.field4409, class685.field9660, class260.field3810);
            if (var7 - class136.field2118 < 3200 && (class435.field6078[class312.field4409][class685.field9660 >> 9][class260.field3810 >> 9] & 0x4) != 0) {
                class698.method3918(false, class390.field5454, class260.field3810 >> 9, class685.field9660 >> 9, arg0 ^ 0x3638, 1);
                return;
            }
            return;
        }
        if (class666.field9338 != 1) {
            var6 = class411.field5689;
            var5 = class679.field9569;
        }
        if ((class435.field6078[class312.field4409][var5 >> 9][var6 >> 9] & 0x4) != 0) {
            class698.method3918(false, class390.field5454, var6 >> 9, var5 >> 9, 13882, 0);
        }
        if (class694.field9754 >= 2560) {
            return;
        }
        int var8 = class685.field9660 >> 9;
        int var9 = class260.field3810 >> 9;
        int var10 = var5 >> 9;
        int var11 = var6 >> 9;
        int var12;
        if (var8 >= var10) {
            var12 = var8 - var10;
        } else {
            var12 = var10 - var8;
        }
        int var13;
        if (var11 > var9) {
            var13 = var11 - var9;
        } else {
            var13 = var9 - var11;
        }
        if ((var12 != 0 || var13 != 0) && var12 > (-class174.field2540) && var12 < class174.field2540 && (-class716.field9999) < var13 && var13 < class716.field9999) {
            if (var12 > var13) {
                int var14 = var13 * 65536 / var12;
                int var15 = 32768;
                while (var8 != var10) {
                    if (var10 > var8) {
                        var8++;
                    } else if (var10 < var8) {
                        var8--;
                    }
                    if ((class435.field6078[class312.field4409][var8][var9] & 0x4) != 0) {
                        class698.method3918(false, class390.field5454, var9, var8, arg0 ^ 0x3638, 1);
                        return;
                    }
                    var15 += var14;
                    if (var15 >= 65536) {
                        if (var9 < var11) {
                            var9++;
                        } else if (var9 > var11) {
                            var9--;
                        }
                        var15 -= 65536;
                        if ((class435.field6078[class312.field4409][var8][var9] & 0x4) != 0) {
                            class698.method3918(false, class390.field5454, var9, var8, 13882, 1);
                            return;
                        }
                    }
                }
                return;
            }
            int var16 = var12 * 65536 / var13;
            int var17 = 32768;
            while (var9 != var11) {
                if (var9 < var11) {
                    var9++;
                } else if (var9 > var11) {
                    var9--;
                }
                if ((class435.field6078[class312.field4409][var8][var9] & 0x4) != 0) {
                    class698.method3918(false, class390.field5454, var9, var8, 13882, 1);
                    return;
                }
                var17 += var16;
                if (var17 >= 65536) {
                    if (var10 > var8) {
                        var8++;
                    } else if (var8 > var10) {
                        var8--;
                    }
                    var17 -= 65536;
                    if ((class435.field6078[class312.field4409][var8][var9] & 0x4) != 0) {
                        class698.method3918(false, class390.field5454, var9, var8, 13882, 1);
                        return;
                    }
                }
            }
            return;
        }
        class621.method3591("RC: " + var8 + "," + var9 + " " + var10 + "," + var11 + " " + class115.field1845 + "," + class64.field1160, null, (byte) -93);
        return;
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(IIILjava/lang/Class;)V")
    public static final void method1211(int arg0, int arg1, int arg2, Class arg3) {
        class416 var4 = class390.field5454[arg0][arg1][arg2];
        if (var4 == null) {
            return;
        }
        for (class217 var5 = var4.field5844; var5 != null; var5 = var5.field3091) {
            class113 var6 = var5.field3090;
            if (arg3.isAssignableFrom(var6.getClass()) && var6.field1814 == arg1 && var6.field1820 == arg2) {
                class395.method2453(var6, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!uq", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        this.method67(-1);
        field2384++;
    }
}
