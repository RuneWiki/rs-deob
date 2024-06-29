import jaggl.memory.NativeStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ct")
public class class364 extends class23 {

    @OriginalMember(owner = "client!ct", name = "ec", descriptor = "Llo;")
    public static class306 field5669 = new class306("Loading config - ", "Lade Konfiguration - ", "Chargement des fichiers config - ", "Carregando config - ");

    @OriginalMember(owner = "client!ct", name = "gc", descriptor = "Lnk;")
    public static class326 field5671 = new class326(51, 3);

    @OriginalMember(owner = "client!ct", name = "hc", descriptor = "Lui;")
    public static class378 field5672 = new class378("WTQA", 2);

    @OriginalMember(owner = "client!ct", name = "Yb", descriptor = "I")
    public static int field5663;

    @OriginalMember(owner = "client!ct", name = "Zb", descriptor = "I")
    public static int field5664;

    @OriginalMember(owner = "client!ct", name = "ac", descriptor = "I")
    public static int field5665;

    @OriginalMember(owner = "client!ct", name = "cc", descriptor = "I")
    public static int field5667;

    @OriginalMember(owner = "client!ct", name = "dc", descriptor = "I")
    public static int field5668;

    @OriginalMember(owner = "client!ct", name = "fc", descriptor = "I")
    public static int field5670;

    @OriginalMember(owner = "client!ct", name = "bc", descriptor = "Lpl;")
    public static class162 field5666;

    // $FF: synthetic field
    @OriginalMember(owner = "client!ct", name = "ic", descriptor = "Ljava/lang/Class;")
    public static Class field5673;

    // $FF: synthetic method
    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method2327(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(FI)V", line = 3)
    public final void method2319(float arg0, int arg1) {
        if (arg1 != 2177) {
            field5672 = null;
        }
        ++field5670;
        int var3 = NativeStream.floatToRawIntBits(arg0);
        super.field302[super.field301++] = (byte) (var3 >> 24);
        super.field302[super.field301++] = (byte) (var3 >> 16);
        super.field302[super.field301++] = (byte) (var3 >> 8);
        super.field302[super.field301++] = (byte) var3;
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(Lih;B)V", line = 20)
    public static final void method2320(class214 arg0, byte arg1) {
        if (class446.field6661 == null) {
            class347 var2 = new class347();
            byte[] var3 = var2.method2241(11339, 128, 128, 16);
            class446.field6661 = class411.method2537(false, var3, false);
        }
        ++field5667;
        if (class261.field4362 == null) {
            class237 var4 = new class237();
            byte[] var5 = var4.method1624(128, 16, -6441, 128);
            class261.field4362 = class411.method2537(false, var5, false);
        }
        class252 var6 = arg0.field3597;
        if (var6.method1719(0) && class147.field2395 == null) {
            byte[] var7 = class117.method937(16, new class165(419684), 16.0F, 4.0F, 0.6F, 128, true, 8, 128, 0.5F, 4.0F);
            class147.field2395 = class411.method2537(false, var7, false);
        }
        if (arg1 != -19) {
            method2320((class214) null, (byte) -63);
        }
    }

    @OriginalMember(owner = "client!ct", name = "<init>", descriptor = "(I)V", line = 60)
    public class364(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(ZIIIILqs;I)V", line = 67)
    public static final void method2321(boolean arg0, int arg1, int arg2, int arg3, int arg4, class496 arg5, int arg6) {
        class264.field4416 = arg3;
        ++field5665;
        class104.field1743 = arg6;
        class321.field5055 = arg0;
        class257.field4335 = arg4;
        class375.field5837 = arg2;
        class505.field7357 = arg5;
        class432.field6464 = arg1;
    }

    @OriginalMember(owner = "client!ct", name = "t", descriptor = "(I)V", line = 83)
    public static void method2322(int arg0) {
        if (arg0 != 187805048) {
            field5672 = null;
        }
        field5669 = null;
        field5666 = null;
        field5672 = null;
        field5671 = null;
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(FB)V", line = 97)
    public final void method2323(float arg0, byte arg1) {
        if (arg1 <= -56) {
            ++field5668;
            int var3 = NativeStream.floatToRawIntBits(arg0);
            super.field302[super.field301++] = (byte) var3;
            super.field302[super.field301++] = (byte) (var3 >> 8);
            super.field302[super.field301++] = (byte) (var3 >> 16);
            super.field302[super.field301++] = (byte) (var3 >> 24);
        }
    }

    @OriginalMember(owner = "client!ct", name = "b", descriptor = "(ZI)I", line = 114)
    public static final int method2324(boolean arg0, int arg1) {
        if (!arg0) {
            method2321(false, 79, 34, -115, 77, (class496) null, 37);
        }
        ++field5663;
        return arg1 >>> 8;
    }

    @OriginalMember(owner = "client!ct", name = "b", descriptor = "(IZ)Ljava/lang/String;", line = 126)
    public static final String method2325(int arg0, boolean arg1) {
        if (!arg1) {
            field5672 = null;
        }
        ++field5664;
        return (arg0 >> 24 & 255) + "." + ((arg0 & 16756415) >> 16) + "." + ((arg0 & 65494) >> 8) + "." + (255 & arg0);
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "()V", line = 142)
    public static final void method2326() {
        for (int var0 = 0; var0 < class38.field572; ++var0) {
            if (!class16.field188[var0]) {
                class429 var1 = class435.field6486[var0];
                class450 var2 = var1.field6429;
                int var3 = var1.field6440;
                int var4 = var2.method2694(false) - class331.field5211;
                int var5 = (var4 * 2 >> class276.field4534) + 1;
                int var6 = 0;
                int[] var7 = new int[var5 * var5];
                int var8 = var2.method2700(false) - var4 >> class276.field4534;
                int var9 = var2.method2696((byte) 127) - var4 >> class276.field4534;
                int var10 = var2.method2696((byte) 127) + var4 >> class276.field4534;
                if (var9 < 0) {
                    var6 -= var9;
                    var9 = 0;
                }
                if (var10 >= class276.field4537) {
                    var10 = class276.field4537 - 1;
                }
                for (int var11 = var9; var11 <= var10; ++var11) {
                    short var12 = var1.field6431[var6];
                    int var13 = var12 >>> 8;
                    int var14 = var5 * var6 + var13;
                    int var15 = (var12 >>> 8) + var8;
                    int var16 = (var12 & 255) + var15 - 1;
                    if (var15 < 0) {
                        var14 -= var15;
                        var15 = 0;
                    }
                    if (var16 >= class236.field4089) {
                        var16 = class236.field4089 - 1;
                    }
                    for (int var17 = var15; var17 <= var16; ++var17) {
                        byte var18 = 1;
                        class290 var19 = class491.method2868(var3, var17, var11, field5673 != null ? field5673 : (field5673 = method2327("ol")));
                        if (var19 != null && var19.field4727 != 0) {
                            if (var19.field4727 == 1) {
                                boolean var20 = var17 - 1 >= var15;
                                boolean var21 = var17 + 1 <= var16;
                                if (!var20 && var11 + 1 <= var10) {
                                    short var22 = var1.field6431[var6 + 1];
                                    int var23 = (var22 >>> 8) + var8;
                                    int var24 = (var22 & 255) + var23;
                                    var20 = var17 > var23 && var17 < var24;
                                }
                                if (!var21 && var11 - 1 >= var9) {
                                    short var25 = var1.field6431[var6 - 1];
                                    int var26 = (var25 >>> 8) + var8;
                                    int var27 = (var25 & 255) + var26;
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
                                    short var30 = var1.field6431[var6 - 1];
                                    int var31 = (var30 >>> 8) + var8;
                                    int var32 = (var30 & 255) + var31;
                                    var28 = var17 > var31 && var17 < var32;
                                }
                                if (!var29 && var11 + 1 <= var10) {
                                    short var33 = var1.field6431[var6 + 1];
                                    int var34 = (var33 >>> 8) + var8;
                                    int var35 = (var33 & 255) + var34;
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
                    ++var6;
                }
                class16.field188[var0] = true;
                class360.field5592[var3].method1513(var2, var7);
            }
        }
    }
}
