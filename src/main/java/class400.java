import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aia")
public class class400 extends class91 {

    @OriginalMember(owner = "client!aia", name = "l", descriptor = "Lsi;")
    public static class769 field5509 = new class769(64);

    @OriginalMember(owner = "client!aia", name = "k", descriptor = "I")
    public static int field5508;

    @OriginalMember(owner = "client!aia", name = "m", descriptor = "I")
    public int field5510;

    @OriginalMember(owner = "client!aia", name = "n", descriptor = "I")
    public static int field5511;

    @OriginalMember(owner = "client!aia", name = "o", descriptor = "I")
    public static int field5512;

    @OriginalMember(owner = "client!aia", name = "p", descriptor = "I")
    public int field5513;

    @OriginalMember(owner = "client!aia", name = "q", descriptor = "I")
    public static int field5514;

    @OriginalMember(owner = "client!aia", name = "r", descriptor = "I")
    public int field5515;

    @OriginalMember(owner = "client!aia", name = "t", descriptor = "I")
    public int field5517;

    @OriginalMember(owner = "client!aia", name = "u", descriptor = "I")
    public static int field5518;

    @OriginalMember(owner = "client!aia", name = "s", descriptor = "Lfm;")
    public class281 field5516;

    // $FF: synthetic field
    @OriginalMember(owner = "client!aia", name = "v", descriptor = "Ljava/lang/Class;")
    public static Class field5519;

    @OriginalMember(owner = "client!aia", name = "a", descriptor = "()V")
    public static final void method2373() {
        for (int var0 = 0; var0 < class774.field10661; var0++) {
            if (!class724.field10089[var0]) {
                class284 var1 = class208.field3032[var0];
                class217 var2 = var1.field4161;
                int var3 = var1.field4162;
                int var4 = var2.method1491(0) - class358.field5076;
                int var5 = (var4 * 2 >> class679.field9600) + 1;
                int var6 = 0;
                int[] var7 = new int[var5 * var5];
                int var8 = var2.method1495(false) - var4 >> class679.field9600;
                int var9 = var2.method1490((byte) -126) - var4 >> class679.field9600;
                int var10 = var2.method1490((byte) -126) + var4 >> class679.field9600;
                if (var9 < 0) {
                    var6 -= var9;
                    var9 = 0;
                }
                if (var10 >= class681.field9665) {
                    var10 = class681.field9665 - 1;
                }
                for (int var11 = var9; var11 <= var10; var11++) {
                    short var12 = var1.field4166[var6];
                    int var13 = var12 >>> 8;
                    int var14 = var5 * var6 + var13;
                    int var15 = (var12 >>> 8) + var8;
                    int var16 = (var12 & 0xFF) + var15 - 1;
                    if (var15 < 0) {
                        var14 -= var15;
                        var15 = 0;
                    }
                    if (var16 >= class42.field520) {
                        var16 = class42.field520 - 1;
                    }
                    for (int var17 = var15; var17 <= var16; var17++) {
                        byte var18 = 1;
                        class208 var19 = class608.method3523(var3, var17, var11, field5519 == null ? (field5519 = method2379("km")) : field5519);
                        if (var19 != null && var19.field3034 != 0) {
                            if (var19.field3034 == 1) {
                                boolean var20 = var17 - 1 >= var15;
                                boolean var21 = var17 + 1 <= var16;
                                if (!var20 && var11 + 1 <= var10) {
                                    short var22 = var1.field4166[var6 + 1];
                                    int var23 = (var22 >>> 8) + var8;
                                    int var24 = (var22 & 0xFF) + var23;
                                    var20 = var17 > var23 && var17 < var24;
                                }
                                if (!var21 && var11 - 1 >= var9) {
                                    short var25 = var1.field4166[var6 - 1];
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
                                    short var30 = var1.field4166[var6 - 1];
                                    int var31 = (var30 >>> 8) + var8;
                                    int var32 = (var30 & 0xFF) + var31;
                                    var28 = var17 > var31 && var17 < var32;
                                }
                                if (!var29 && var11 + 1 <= var10) {
                                    short var33 = var1.field4166[var6 + 1];
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
                class724.field10089[var0] = true;
                class678.field9594[var3].method831(var2, var7);
            }
        }
    }

    @OriginalMember(owner = "client!aia", name = "a", descriptor = "(ILs;)V")
    public static final void method2374(int arg0, class419 arg1) {
        class678.field9594[arg0] = arg1;
    }

    @OriginalMember(owner = "client!aia", name = "a", descriptor = "(ZII)V")
    public static final void method2375(boolean arg0, int arg1, int arg2) {
        if (arg1 > -84) {
            method2374(94, null);
        }
        field5508++;
        class465 var3 = arg0 ? class274.field3846 : class138.field2285;
        if (var3 == null || arg2 < 0 || var3.field6344 <= arg2) {
            return;
        }
        class40 var4 = var3.field6336[arg2];
        if (var4.field473 != -1) {
            return;
        }
        String var5 = var4.field470;
        class302 var6 = class582.method3419(class20.field199, (byte) 126, class626.field8901);
        var6.field4341.method2524(false, class389.method2339(var5, true) + 3);
        var6.field4341.method2524(false, arg0 ? 1 : 0);
        var6.field4341.method2546(true, arg2);
        var6.field4341.method2566(-2, var5);
        class501.method2928(0, var6);
    }

    @OriginalMember(owner = "client!aia", name = "a", descriptor = "(I)V")
    public static final void method2376(int arg0) {
        field5514++;
        if (class621.field8768 != null) {
            return;
        }
        class621.field8768 = new int[65536];
        double var1 = Math.random() * 0.03D + 0.7D - 0.015D;
        int var3 = 0;
        for (int var4 = 0; var4 < 512; var4++) {
            float var6 = ((float) (var4 >> 3) / 64.0F + 0.0078125F) * 360.0F;
            float var7 = (float) (var4 & 0x7) / 8.0F + 0.0625F;
            for (int var8 = 0; var8 < 128; var8++) {
                float var9 = (float) var8 / 128.0F;
                float var10 = 0.0F;
                float var11 = 0.0F;
                float var12 = 0.0F;
                float var13 = var6 / 60.0F;
                int var14 = (int) var13;
                int var15 = var14 % 6;
                float var16 = (float) (-var14) + var13;
                float var17 = (1.0F - var7) * var9;
                float var18 = (1.0F - (var7 * var16)) * var9;
                float var19 = (1.0F - (1.0F - var16) * var7) * var9;
                if (var15 == 0) {
                    var10 = var9;
                    var11 = var19;
                    var12 = var17;
                } else if (var15 == 1) {
                    var11 = var9;
                    var12 = var17;
                    var10 = var18;
                } else if (var15 == 2) {
                    var11 = var9;
                    var12 = var19;
                    var10 = var17;
                } else if (var15 == 3) {
                    var10 = var17;
                    var11 = var18;
                    var12 = var9;
                } else if (var15 == 4) {
                    var10 = var19;
                    var12 = var9;
                    var11 = var17;
                } else if (var15 == 5) {
                    var10 = var9;
                    var12 = var18;
                    var11 = var17;
                }
                float var20 = (float) Math.pow((double) var10, var1);
                float var21 = (float) Math.pow((double) var11, var1);
                float var22 = (float) Math.pow((double) var12, var1);
                int var23 = (int) (var20 * 256.0F);
                int var24 = (int) (var21 * 256.0F);
                int var25 = (int) (var22 * 256.0F);
                int var26 = (var23 << 16) + (var24 << 8) + var25 - 16777216;
                class621.field8768[var3++] = var26;
            }
        }
        int var5 = 111 / ((53 - arg0) / 53);
    }

    @OriginalMember(owner = "client!aia", name = "b", descriptor = "(Z)Ljo;")
    public static final class374 method2377(boolean arg0) {
        field5511++;
        try {
            if (arg0) {
                method2375(true, 48, -102);
            }
            return (class374) Class.forName("nn").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!aia", name = "a", descriptor = "(B)V")
    public static void method2378(byte arg0) {
        if (arg0 <= 40) {
            method2373();
        }
        field5509 = null;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!aia", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method2379(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
