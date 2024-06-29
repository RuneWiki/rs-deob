import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!an")
public class class20 {

    @OriginalMember(owner = "client!an", name = "m", descriptor = "B")
    public byte field209;

    @OriginalMember(owner = "client!an", name = "k", descriptor = "I")
    public int field207;

    @OriginalMember(owner = "client!an", name = "e", descriptor = "I")
    public int field201;

    @OriginalMember(owner = "client!an", name = "d", descriptor = "I")
    public int field200;

    @OriginalMember(owner = "client!an", name = "a", descriptor = "I")
    public int field197;

    @OriginalMember(owner = "client!an", name = "t", descriptor = "I")
    public int field216;

    @OriginalMember(owner = "client!an", name = "f", descriptor = "I")
    public static int field202 = -1;

    @OriginalMember(owner = "client!an", name = "r", descriptor = "I")
    public static int field214 = 0;

    @OriginalMember(owner = "client!an", name = "n", descriptor = "Lfg;")
    public static class83 field210 = new class83("Discard", "Ablegen", "Jeter", "Descartar");

    @OriginalMember(owner = "client!an", name = "u", descriptor = "Lwo;")
    public static class522 field217 = new class522();

    @OriginalMember(owner = "client!an", name = "c", descriptor = "I")
    public static int field199;

    @OriginalMember(owner = "client!an", name = "g", descriptor = "I")
    public static int field203;

    @OriginalMember(owner = "client!an", name = "i", descriptor = "I")
    public static int field205;

    @OriginalMember(owner = "client!an", name = "j", descriptor = "I")
    public static int field206;

    @OriginalMember(owner = "client!an", name = "l", descriptor = "I")
    public static int field208;

    @OriginalMember(owner = "client!an", name = "q", descriptor = "Lwl;")
    public class280 field213;

    @OriginalMember(owner = "client!an", name = "b", descriptor = "Lnv;")
    public class286 field198;

    @OriginalMember(owner = "client!an", name = "h", descriptor = "Lgq;")
    public class355 field204;

    @OriginalMember(owner = "client!an", name = "p", descriptor = "Lum;")
    public class363 field212;

    @OriginalMember(owner = "client!an", name = "o", descriptor = "Lqs;")
    public static class427 field211;

    @OriginalMember(owner = "client!an", name = "s", descriptor = "[[B")
    public static byte[][] field215;

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(I[B)Z", line = 7)
    public static final boolean method144(int arg0, byte[] arg1) {
        field206++;
        if (arg0 != 22461) {
            method148(false, null, null);
        }
        class365 var2 = new class365(arg1);
        int var3 = var2.method2099(255);
        if (var3 != 1) {
            return false;
        }
        boolean var4 = var2.method2099(255) == 1;
        if (var4) {
            class51.method317(-108, var2);
        }
        class354.method1962(true, var2);
        return true;
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(B)V", line = 35)
    public static final void method145(byte arg0) {
        if (arg0 == 71) {
            field208++;
            class522.field7701 = new class295[class36.field506.method1410(0)][];
            class25.field396 = new class295[class36.field506.method1410(0)][];
            class359.field4910 = new boolean[class36.field506.method1410(0)];
        }
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(Z)I", line = 50)
    public static final int method146(boolean arg0) {
        if (arg0) {
            field203++;
            return class233.field3232;
        } else {
            return 21;
        }
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(La;IZ)V", line = 62)
    public static final void method147(class436 arg0, int arg1, boolean arg2) {
        field199++;
        if (arg2) {
            return;
        }
        boolean var3 = arg0.method2599((byte) 98, 1) == 1;
        if (var3) {
            class364.field5055[class282.field3806++] = arg1;
        }
        int var4 = arg0.method2599((byte) 98, 2);
        class192 var5 = class309.field4234[arg1];
        if (var4 == 0) {
            if (var3) {
                var5.field2727 = false;
            } else if (class202.field2880 == arg1) {
                throw new RuntimeException("s:lr");
            } else {
                class135 var6 = class26.field405[arg1] = new class135();
                var6.field1944 = (var5.field464 << 28) + (class215.field3059 + var5.field372[0] >> 6 << 14) + (class79.field1134 - -var5.field362[0] >> 6);
                if (var5.field2713 == -1) {
                    var6.field1948 = var5.field357.method816(71);
                } else {
                    var6.field1948 = var5.field2713;
                }
                var6.field1947 = var5.field2702;
                var6.field1951 = var5.field289;
                if (var5.field2691 > 0) {
                    class472.method2778((byte) -27, var5);
                }
                class309.field4234[arg1] = null;
                if (arg0.method2599((byte) 98, 1) != 0) {
                    class368.method2132(arg1, 104, arg0);
                }
            }
        } else if (var4 == 1) {
            int var7 = arg0.method2599((byte) 98, 3);
            int var8 = var5.field372[0];
            int var9 = var5.field362[0];
            if (var7 == 0) {
                var8--;
                var9--;
            } else if (var7 == 1) {
                var9--;
            } else if (var7 == 2) {
                var8++;
                var9--;
            } else if (var7 == 3) {
                var8--;
            } else if (var7 == 4) {
                var8++;
            } else if (var7 == 5) {
                var9++;
                var8--;
            } else if (var7 == 6) {
                var9++;
            } else if (var7 == 7) {
                var9++;
                var8++;
            }
            if (var3) {
                var5.field2727 = true;
                var5.field2720 = var9;
                var5.field2726 = var8;
            } else {
                var5.method1160(0, var9, var8, class324.field4454[arg1]);
            }
        } else if (var4 == 2) {
            int var10 = arg0.method2599((byte) 98, 4);
            int var11 = var5.field372[0];
            int var12 = var5.field362[0];
            if (var10 == 0) {
                var11 -= 2;
                var12 -= 2;
            } else if (var10 == 1) {
                var11--;
                var12 -= 2;
            } else if (var10 == 2) {
                var12 -= 2;
            } else if (var10 == 3) {
                var12 -= 2;
                var11++;
            } else if (var10 == 4) {
                var12 -= 2;
                var11 += 2;
            } else if (var10 == 5) {
                var11 -= 2;
                var12--;
            } else if (var10 == 6) {
                var11 += 2;
                var12--;
            } else if (var10 == 7) {
                var11 -= 2;
            } else if (var10 == 8) {
                var11 += 2;
            } else if (var10 == 9) {
                var11 -= 2;
                var12++;
            } else if (var10 == 10) {
                var11 += 2;
                var12++;
            } else if (var10 == 11) {
                var12 += 2;
                var11 -= 2;
            } else if (var10 == 12) {
                var12 += 2;
                var11--;
            } else if (var10 == 13) {
                var12 += 2;
            } else if (var10 == 14) {
                var11++;
                var12 += 2;
            } else if (var10 == 15) {
                var12 += 2;
                var11 += 2;
            }
            if (var3) {
                var5.field2727 = true;
                var5.field2720 = var12;
                var5.field2726 = var11;
            } else {
                var5.method1160(0, var12, var11, class324.field4454[arg1]);
            }
        } else {
            int var13 = arg0.method2599((byte) 98, 1);
            if (var13 == 0) {
                int var14 = arg0.method2599((byte) 98, 12);
                int var15 = var14 >> 10;
                int var16 = (var14 & 0x3FA) >> 5;
                if (var16 > 15) {
                    var16 -= 32;
                }
                int var17 = var14 & 0x1F;
                if (var17 > 15) {
                    var17 -= 32;
                }
                int var18 = var5.field372[0] + var16;
                int var19 = var5.field362[0] + var17;
                if (var3) {
                    var5.field2727 = true;
                    var5.field2720 = var19;
                    var5.field2726 = var18;
                } else {
                    var5.method1160(0, var19, var18, class324.field4454[arg1]);
                }
                var5.field464 = (byte) (var5.field464 + var15 & 0x3);
                if (class202.field2880 == arg1) {
                    class400.field5571 = var5.field464;
                }
            } else {
                int var20 = arg0.method2599((byte) 98, 30);
                int var21 = var20 >> 28;
                int var22 = var20 >> 14 & 0x3FFF;
                int var23 = var20 & 0x3FFF;
                int var24 = (var5.field372[0] + class215.field3059 + var22 & 0x3FFF) - class215.field3059;
                int var25 = (var5.field362[0] + class79.field1134 + var23 & 0x3FFF) - class79.field1134;
                if (var3) {
                    var5.field2727 = true;
                    var5.field2720 = var25;
                    var5.field2726 = var24;
                } else {
                    var5.method1160(0, var25, var24, class324.field4454[arg1]);
                }
                var5.field464 = (byte) (var5.field464 + var21 & 0x3);
                if (class202.field2880 == arg1) {
                    class400.field5571 = var5.field464;
                }
            }
        }
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(Z[[BLmi;)V", line = 391)
    public static final void method148(boolean arg0, byte[][] arg1, class341 arg2) {
        if (!arg0) {
            method149(29);
        }
        for (int var3 = 0; var3 < arg2.field7639; var3++) {
            class503.method2959(false);
            for (int var4 = 0; var4 < class442.field6435 >> 3; var4++) {
                for (int var5 = 0; var5 < class232.field3217 >> 3; var5++) {
                    int var6 = class530.field7811[var3][var4][var5];
                    if (var6 != -1) {
                        int var7 = var6 >> 24 & 0x3;
                        if (!arg2.field7626 || var7 == 0) {
                            int var8 = var6 >> 1 & 0x3;
                            int var9 = (var6 & 0xFFEC68) >> 14;
                            int var10 = (var6 & 0x3FFF) >> 3;
                            int var11 = (var9 / 8 << 8) + var10 / 8;
                            for (int var12 = 0; var12 < class101.field1378.length; var12++) {
                                if (class101.field1378[var12] == var11 && arg1[var12] != null) {
                                    arg2.method1905(var7, arg1[var12], var5 * 8, var3, 3, (var10 & 0x7) * 8, var4 * 8, class418.field6109, var8, class6.field64, (var9 & 0x7) * 8);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        field205++;
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(I)V", line = 462)
    public static void method149(int arg0) {
        if (arg0 < 30) {
            method146(true);
        }
        field217 = null;
        field215 = null;
        field210 = null;
        field211 = null;
    }

    @OriginalMember(owner = "client!an", name = "<init>", descriptor = "(BIIIII)V", line = 475)
    public class20(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field209 = arg0;
        this.field207 = arg5;
        this.field201 = arg3;
        this.field200 = arg4;
        this.field197 = arg2;
        this.field216 = arg1;
    }
}
