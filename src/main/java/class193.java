import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public abstract class class193 {

    @OriginalMember(owner = "client!hc", name = "f", descriptor = "[I")
    public static int[] field3113 = new int[256];

    @OriginalMember(owner = "client!hc", name = "o", descriptor = "Lok;")
    public static class41 field3122;

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "I")
    public static int field3108;

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "I")
    public static int field3109;

    @OriginalMember(owner = "client!hc", name = "c", descriptor = "I")
    public static int field3110;

    @OriginalMember(owner = "client!hc", name = "d", descriptor = "I")
    public static int field3111;

    @OriginalMember(owner = "client!hc", name = "e", descriptor = "I")
    public static int field3112;

    @OriginalMember(owner = "client!hc", name = "g", descriptor = "I")
    public int field3114;

    @OriginalMember(owner = "client!hc", name = "h", descriptor = "I")
    public static int field3115;

    @OriginalMember(owner = "client!hc", name = "i", descriptor = "I")
    public int field3116;

    @OriginalMember(owner = "client!hc", name = "j", descriptor = "I")
    public static int field3117;

    @OriginalMember(owner = "client!hc", name = "k", descriptor = "I")
    public static int field3118;

    @OriginalMember(owner = "client!hc", name = "l", descriptor = "I")
    public static int field3119;

    @OriginalMember(owner = "client!hc", name = "m", descriptor = "I")
    public int field3120;

    @OriginalMember(owner = "client!hc", name = "n", descriptor = "I")
    public static int field3121;

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(B)Z", line = 10)
    public final boolean method1381(byte arg0) {
        field3109++;
        if (arg0 >= -34) {
            this.method1386(-88);
        }
        return (this.field3114 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(I)Loc;", line = 22)
    public static final class249 method1382(int arg0) {
        field3110++;
        try {
            if (arg0 != 1238347303) {
                method1388((byte) 63);
            }
            return (class249) Class.forName("ja").getDeclaredConstructor().newInstance();
        } catch (Throwable var2) {
            return null;
        }
    }

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "(I)Z", line = 41)
    public final boolean method1383(int arg0) {
        field3112++;
        if (arg0 < 92) {
            field3108 = -78;
        }
        return (this.field3114 & 0x8) != 0;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(ZLok;Lmh;)Lpa;", line = 53)
    public static final class294 method1384(boolean arg0, class41 arg1, class65 arg2) {
        int var3 = arg2.method476(arg1, (byte) -9);
        field3115++;
        if (var3 == -1) {
            return new class294(0);
        }
        int[] var4 = arg2.method457(-107, var3);
        class294 var5 = new class294(var4.length);
        int var6 = 0;
        if (arg0) {
            return (class294) null;
        }
        while (var6 < var5.field4760) {
            class112 var7 = new class112(arg2.method454(var3, 0, var4[var6]));
            var5.field4754[var6] = var7.method763(true);
            var5.field4767[var6] = var7.method785((byte) -126);
            var5.field4762[var6] = (short) var7.method759((byte) -63);
            var5.field4759[var6] = (short) var7.method759((byte) -38);
            var5.field4768[var6] = var7.method779(-27100);
            var6++;
        }
        return var5;
    }

    @OriginalMember(owner = "client!hc", name = "c", descriptor = "(I)Z", line = 88)
    public final boolean method1385(int arg0) {
        field3121++;
        if (arg0 != 4) {
            this.method1383(45);
        }
        return (this.field3114 & 0x4) != 0;
    }

    @OriginalMember(owner = "client!hc", name = "d", descriptor = "(I)Z", line = 100)
    public final boolean method1386(int arg0) {
        if (arg0 != -1) {
            method1384(false, (class41) null, (class65) null);
        }
        field3118++;
        return (this.field3114 & 0x2) != 0;
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            int var1 = var0;
            for (int var2 = 0; var2 < 8; var2++) {
                if ((var1 & 0x1) == 1) {
                    var1 = var1 >>> 1 ^ 0xEDB88320;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field3113[var0] = var1;
        }
        field3122 = class137.method956("Schrifts-=tze geladen)3", 45);
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(II[Lue;[BIIIZ)V", line = 117)
    public static final void method1387(int arg0, int arg1, class223[] arg2, byte[] arg3, int arg4, int arg5, int arg6, boolean arg7) {
        field3119++;
        if (arg5 <= 0) {
            field3113 = (int[]) null;
        }
        if (!arg7) {
            for (int var8 = 0; var8 < 4; var8++) {
                for (int var9 = 0; var9 < 64; var9++) {
                    for (int var10 = 0; var10 < 64; var10++) {
                        if (arg6 + var9 > 0 && arg6 + var9 < 103 && arg0 + var10 > 0 && arg0 + var10 < 103) {
                            arg2[var8].field3570[arg6 + var9][arg0 + var10] = class217.method1563(arg2[var8].field3570[arg6 + var9][arg0 + var10], -16777217);
                        }
                    }
                }
            }
        }
        byte var11;
        if (arg7) {
            var11 = 1;
        } else {
            var11 = 4;
        }
        class112 var12 = new class112(arg3);
        for (int var13 = 0; var13 < var11; var13++) {
            for (int var14 = 0; var14 < 64; var14++) {
                for (int var15 = 0; var15 < 64; var15++) {
                    class315.method2180(arg1, arg0 + var15, arg4, 0, var13, var12, var14 + arg6, arg7, -8932);
                }
            }
        }
        if (!class166.field2625 || arg7) {
            return;
        }
        class284 var16 = null;
        label118: while (true) {
            int var18;
            label111: do {
                while (var12.field1607.length > var12.field1640) {
                    int var17 = var12.method792(2);
                    if (var17 != 0) {
                        if (var17 != 1) {
                            throw new IllegalStateException();
                        }
                        var18 = var12.method792(2);
                        continue label111;
                    }
                    var16 = new class284(var12);
                }
                if (var16 == null) {
                    var16 = new class284();
                }
                for (int var23 = 0; var23 < 8; var23++) {
                    for (int var24 = 0; var24 < 8; var24++) {
                        int var25 = (arg6 >> 3) + var23;
                        int var26 = (arg0 >> 3) + var24;
                        if (var25 >= 0 && var25 < 13 && var26 >= 0 && var26 < 13) {
                            class129.field1932[var25][var26] = var16;
                        }
                    }
                }
                break label118;
            } while (var18 <= 0);
            for (int var19 = 0; var19 < var18; var19++) {
                class297 var20 = new class297(var12);
                var20.field4808 += arg0 << 7;
                int var21 = var20.field4808 >> 7;
                var20.field4803 += arg6 << 7;
                int var22 = var20.field4803 >> 7;
                if (var22 >= 0 && var21 >= 0 && var22 < 104 && var21 < 104) {
                    var20.field4795 = class278.field4548[var20.field4813][var22][var21] - var20.field4795;
                    class179.method1279(var20);
                }
            }
        }
    }

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "(B)V", line = 277)
    public static void method1388(byte arg0) {
        field3122 = null;
        field3113 = null;
        int var1 = -52 / ((38 - arg0) / 63);
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(Lmh;Lmh;I)V", line = 331)
    public static final void method1389(class65 arg0, class65 arg1, int arg2) {
        class80.field1184 = arg1;
        if (arg2 >= -66) {
            field3108 = -36;
        }
        class76.field1134 = arg0;
        field3117++;
    }
}
