import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uj")
public class class214 {

    @OriginalMember(owner = "client!uj", name = "f", descriptor = "[B")
    private byte[] field3029;

    @OriginalMember(owner = "client!uj", name = "g", descriptor = "[I")
    private int[] field3030;

    @OriginalMember(owner = "client!uj", name = "c", descriptor = "[I")
    private int[] field3026;

    @OriginalMember(owner = "client!uj", name = "e", descriptor = "Liq;")
    public static class362 field3028 = new class362(" ", ": ", " ", " ");

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "I")
    public static int field3024;

    @OriginalMember(owner = "client!uj", name = "b", descriptor = "I")
    public static int field3025;

    @OriginalMember(owner = "client!uj", name = "d", descriptor = "I")
    public static int field3027;

    @OriginalMember(owner = "client!uj", name = "h", descriptor = "I")
    public static int field3031;

    @OriginalMember(owner = "client!uj", name = "i", descriptor = "I")
    public static int field3032;

    @OriginalMember(owner = "client!uj", name = "j", descriptor = "I")
    public static int field3033;

    @OriginalMember(owner = "client!uj", name = "k", descriptor = "I")
    public static int field3034;

    @OriginalMember(owner = "client!uj", name = "l", descriptor = "I")
    public static int field3035;

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(I)V", line = 5)
    public static final void method1437(int arg0) {
        field3032++;
        if (arg0 != -47644573) {
            method1444(-116);
        }
        for (int var1 = 0; var1 < class63.field730; var1++) {
            class370 var2 = class237.method1630(var1, 0);
            if (var2 != null && var2.field5227 == 0) {
                class151.field1865[var1] = 0;
                class4.field61[var1] = 0;
            }
        }
        class281.field3985 = new class288(128);
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(Z)V", line = 33)
    public static void method1438(boolean arg0) {
        field3028 = null;
        if (arg0) {
            method1439(-75, -104, (class236) null);
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(IILdg;)V", line = 45)
    public static final void method1439(int arg0, int arg1, class236 arg2) {
        field3025++;
        if (arg1 <= 12 || class348.field4944 == null) {
            return;
        }
        try {
            class348.field4944.method2502(0L, (byte) 76);
            class348.field4944.method2499(false, arg2.field3364, 24, arg0);
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "([BIII[BI)I", line = 71)
    public final int method1440(byte[] arg0, int arg1, int arg2, int arg3, byte[] arg4, int arg5) {
        field3027++;
        if (arg2 == 0) {
            return 0;
        } else if (arg5 >= -45) {
            return 23;
        } else {
            int var7 = arg2 + arg3;
            int var8 = 0;
            int var9 = arg1;
            while (true) {
                byte var10 = arg4[var9];
                if (var10 >= 0) {
                    var8++;
                } else {
                    var8 = this.field3026[var8];
                }
                int var11;
                if ((var11 = this.field3026[var8]) < 0) {
                    arg0[arg3++] = (byte) (~var11);
                    if (arg3 >= var7) {
                        break;
                    }
                    var8 = 0;
                }
                if ((var10 & 0x40) == 0) {
                    var8++;
                } else {
                    var8 = this.field3026[var8];
                }
                int var12;
                if ((var12 = this.field3026[var8]) < 0) {
                    arg0[arg3++] = (byte) (~var12);
                    if (arg3 >= var7) {
                        break;
                    }
                    var8 = 0;
                }
                if ((var10 & 0x20) == 0) {
                    var8++;
                } else {
                    var8 = this.field3026[var8];
                }
                int var13;
                if ((var13 = this.field3026[var8]) < 0) {
                    arg0[arg3++] = (byte) (~var13);
                    if (arg3 >= var7) {
                        break;
                    }
                    var8 = 0;
                }
                if ((var10 & 0x10) == 0) {
                    var8++;
                } else {
                    var8 = this.field3026[var8];
                }
                int var14;
                if ((var14 = this.field3026[var8]) < 0) {
                    arg0[arg3++] = (byte) (~var14);
                    if (arg3 >= var7) {
                        break;
                    }
                    var8 = 0;
                }
                if ((var10 & 0x8) == 0) {
                    var8++;
                } else {
                    var8 = this.field3026[var8];
                }
                int var15;
                if ((var15 = this.field3026[var8]) < 0) {
                    arg0[arg3++] = (byte) (~var15);
                    if (var7 <= arg3) {
                        break;
                    }
                    var8 = 0;
                }
                if ((var10 & 0x4) == 0) {
                    var8++;
                } else {
                    var8 = this.field3026[var8];
                }
                int var16;
                if ((var16 = this.field3026[var8]) < 0) {
                    arg0[arg3++] = (byte) (~var16);
                    if (arg3 >= var7) {
                        break;
                    }
                    var8 = 0;
                }
                if ((var10 & 0x2) == 0) {
                    var8++;
                } else {
                    var8 = this.field3026[var8];
                }
                int var17;
                if ((var17 = this.field3026[var8]) < 0) {
                    arg0[arg3++] = (byte) (~var17);
                    if (arg3 >= var7) {
                        break;
                    }
                    var8 = 0;
                }
                if ((var10 & 0x1) == 0) {
                    var8++;
                } else {
                    var8 = this.field3026[var8];
                }
                int var18;
                if ((var18 = this.field3026[var8]) < 0) {
                    arg0[arg3++] = (byte) (~var18);
                    if (var7 <= arg3) {
                        break;
                    }
                    var8 = 0;
                }
                var9++;
            }
            return var9 - (arg1 - 1);
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(II[BI[BI)I", line = 223)
    public final int method1441(int arg0, int arg1, byte[] arg2, int arg3, byte[] arg4, int arg5) {
        field3031++;
        int var7 = arg1;
        int var8 = arg3 + arg5;
        int var9 = arg0 << 3;
        while (var8 > arg5) {
            int var10 = arg4[arg5] & 0xFF;
            int var11 = this.field3030[var10];
            byte var12 = this.field3029[var10];
            if (var12 == 0) {
                throw new RuntimeException("No codeword for data value " + var10);
            }
            int var13 = var9 >> 3;
            int var14 = var9 & 0x7;
            int var15 = var7 & -var14 >> 31;
            int var16 = (var14 + var12 - 1 >> 3) + var13;
            var9 += var12;
            int var17 = var14 + 24;
            arg2[var13] = (byte) (var7 = class429.method2704(var15, var11 >>> var17));
            if (var13 < var16) {
                var13++;
                var14 = var17 - 8;
                arg2[var13] = (byte) (var7 = var11 >>> var14);
                if (var16 > var13) {
                    var14 -= 8;
                    var13++;
                    arg2[var13] = (byte) (var7 = var11 >>> var14);
                    if (var13 < var16) {
                        var13++;
                        var14 -= 8;
                        arg2[var13] = (byte) (var7 = var11 >>> var14);
                        if (var13 < var16) {
                            var13++;
                            var14 -= 8;
                            arg2[var13] = (byte) (var7 = var11 << -var14);
                        }
                    }
                }
            }
            arg5++;
        }
        return (var9 + 7 >> 3) - arg0;
    }

    @OriginalMember(owner = "client!uj", name = "b", descriptor = "(I)V", line = 291)
    public static final void method1442(int arg0) {
        field3035++;
        class230.field3251.method1618(arg0 ^ arg0);
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(BI)V", line = 303)
    public static final void method1443(byte arg0, int arg1) {
        class45.field541.method1629(arg1, arg0 + 101);
        if (arg0 != -52) {
            field3034 = 113;
        }
        field3024++;
        class71.field820.method1629(arg1, 42);
    }

    @OriginalMember(owner = "client!uj", name = "<init>", descriptor = "([B)V", line = 314)
    public class214(byte[] arg0) {
        int var2 = arg0.length;
        this.field3029 = arg0;
        this.field3030 = new int[var2];
        int[] var3 = new int[33];
        this.field3026 = new int[8];
        int var4 = 0;
        for (int var5 = 0; var5 < var2; var5++) {
            byte var6 = arg0[var5];
            if (var6 != 0) {
                int var7 = 0x1 << 32 - var6;
                int var8 = var3[var6];
                this.field3030[var5] = var8;
                int var9;
                if ((var7 & var8) == 0) {
                    var9 = var7 | var8;
                    for (int var10 = var6 - 1; var10 >= 1; var10--) {
                        int var11 = var3[var10];
                        if (var8 != var11) {
                            break;
                        }
                        int var12 = 0x1 << 32 - var10;
                        if ((var11 & var12) != 0) {
                            var3[var10] = var3[var10 - 1];
                            break;
                        }
                        var3[var10] = class429.method2704(var12, var11);
                    }
                } else {
                    var9 = var3[var6 - 1];
                }
                var3[var6] = var9;
                for (int var13 = var6 + 1; var13 <= 32; var13++) {
                    if (var3[var13] == var8) {
                        var3[var13] = var9;
                    }
                }
                int var14 = 0;
                for (int var15 = 0; var15 < var6; var15++) {
                    int var16 = Integer.MIN_VALUE >>> var15;
                    if ((var16 & var8) == 0) {
                        var14++;
                    } else {
                        if (this.field3026[var14] == 0) {
                            this.field3026[var14] = var4;
                        }
                        var14 = this.field3026[var14];
                    }
                    if (this.field3026.length <= var14) {
                        int[] var17 = new int[this.field3026.length * 2];
                        for (int var18 = 0; var18 < this.field3026.length; var18++) {
                            var17[var18] = this.field3026[var18];
                        }
                        this.field3026 = var17;
                    }
                    int var19 = var16 >>> 1;
                }
                this.field3026[var14] = ~var5;
                if (var4 <= var14) {
                    var4 = var14 + 1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!uj", name = "c", descriptor = "(I)V", line = 438)
    public static final void method1444(int arg0) {
        if (arg0 != -128) {
            field3034 = -2;
        }
        field3033++;
        if (class222.field3120) {
            return;
        }
        class222.field3120 = true;
        if (class374.field5254) {
            class441.field6333 = (float) ((int) class441.field6333 - 65 & 0xFFFFFF80);
        } else {
            class286.field4016 += (-class286.field4016 - 24.0F) / 2.0F;
        }
        class225.field3160 = true;
    }
}
