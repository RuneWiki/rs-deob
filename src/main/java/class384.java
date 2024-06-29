import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ck")
public class class384 extends class98 {

    @OriginalMember(owner = "client!ck", name = "Q", descriptor = "I")
    private int field5419 = 32768;

    @OriginalMember(owner = "client!ck", name = "R", descriptor = "[I")
    public static int[] field5420;

    @OriginalMember(owner = "client!ck", name = "S", descriptor = "Liq;")
    public static class362 field5421;

    @OriginalMember(owner = "client!ck", name = "W", descriptor = "I")
    public static int field5425;

    @OriginalMember(owner = "client!ck", name = "L", descriptor = "I")
    public static int field5414;

    @OriginalMember(owner = "client!ck", name = "M", descriptor = "I")
    public static int field5415;

    @OriginalMember(owner = "client!ck", name = "N", descriptor = "I")
    public static int field5416;

    @OriginalMember(owner = "client!ck", name = "O", descriptor = "I")
    public static int field5417;

    @OriginalMember(owner = "client!ck", name = "P", descriptor = "I")
    public static int field5418;

    @OriginalMember(owner = "client!ck", name = "U", descriptor = "I")
    public static int field5423;

    @OriginalMember(owner = "client!ck", name = "V", descriptor = "I")
    public static int field5424;

    @OriginalMember(owner = "client!ck", name = "T", descriptor = "Lqr;")
    public static class40 field5422;

    static {
        new class362("The channel you tried to join does not exist.", "Der von dir gewünschte Chatraum existiert nicht.", "Le canal que vous essayez de rejoindre n'existe pas.", "O canal que você tentou acessar não existe.");
        field5420 = new int[32];
        field5421 = new class362("RuneScape is loading - please wait...", "RuneScape wird geladen - bitte warten...", "Chargement de RuneScape en cours - veuillez patienter...", "RuneScape carregando. Aguarde...");
        field5425 = 0;
    }

    @OriginalMember(owner = "client!ck", name = "<init>", descriptor = "()V", line = 3)
    public class384() {
        super(3, false);
    }

    @OriginalMember(owner = "client!ck", name = "e", descriptor = "(I)Z", line = 8)
    public static final boolean method2464(int arg0) {
        ++field5415;
        if (class217.field3066) {
            try {
                if ((Boolean) class368.method2348(class14.field185.field2685, -111, "showingVideoAd")) {
                    return false;
                }
                return true;
            } catch (Throwable var1) {
            }
        }
        return arg0 != 30221 ? true : true;
    }

    @OriginalMember(owner = "client!ck", name = "b", descriptor = "(II)[[I", line = 32)
    public final int[][] method194(int arg0, int arg1) {
        ++field5424;
        int[][] var3 = super.field1184.method185((byte) -48, arg0);
        if (super.field1184.field332) {
            int[] var4 = this.method539(1, (byte) -83, arg0);
            int[] var5 = this.method539(2, (byte) -116, arg0);
            int[] var6 = var3[0];
            int[] var7 = var3[1];
            int[] var8 = var3[2];
            for (int var9 = 0; ~class268.field3811 < ~var9; ++var9) {
                int var10 = 255 & var4[var9] * 255 >> 12;
                int var11 = var5[var9] * this.field5419 >> 12;
                int var12 = class247.field3531[var10] * var11 >> 12;
                int var13 = class299.field4191[var10] * var11 >> 12;
                int var14 = class210.field2995 & var9 - -(var12 >> 12);
                int var15 = class225.field3153 & (var13 >> 12) + arg0;
                int[][] var16 = this.method546(var15, (byte) 33, 0);
                var6[var9] = var16[0][var14];
                var7[var9] = var16[1][var14];
                var8[var9] = var16[2][var14];
            }
        }
        int var17 = 78 % ((arg1 - 60) / 43);
        return var3;
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(II)[I", line = 88)
    public final int[] method83(int arg0, int arg1) {
        ++field5417;
        int[] var3 = super.field1177.method820(arg1, true);
        if (arg0 != 0) {
            method2467(-27);
        }
        if (super.field1177.field1610) {
            int[] var4 = this.method539(1, (byte) -64, arg1);
            int[] var5 = this.method539(2, (byte) -92, arg1);
            for (int var6 = 0; var6 < class268.field3811; ++var6) {
                int var7 = var4[var6] >> 4 & 255;
                int var8 = var5[var6] * this.field5419 >> 12;
                int var9 = class247.field3531[var7] * var8 >> 12;
                int var10 = class299.field4191[var7] * var8 >> 12;
                int var11 = var6 - -(var9 >> 12) & class210.field2995;
                int var12 = (var10 >> 12) + arg1 & class225.field3153;
                int[] var13 = this.method539(0, (byte) -126, var12);
                var3[var6] = var13[var11];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ck", name = "f", descriptor = "(I)V", line = 138)
    public static final void method2465(int arg0) {
        ++field5418;
        if (arg0 != -19620) {
            method2464(-26);
        }
        int var1 = class359.field5120.method2146(8, (byte) 52);
        if (~class305.field4287 < ~var1) {
            for (int var2 = var1; class305.field4287 > var2; ++var2) {
                class183.field2507[class141.field1738++] = class94.field1135[var2];
            }
        }
        if (var1 > class305.field4287) {
            throw new RuntimeException("gppov1");
        } else {
            class305.field4287 = 0;
            for (int var3 = 0; var1 > var3; ++var3) {
                int var4 = class94.field1135[var3];
                class40 var5 = class26.field314[var4];
                int var6 = class359.field5120.method2146(1, (byte) 52);
                if (~var6 == -1) {
                    class94.field1135[class305.field4287++] = var4;
                    var5.field5625 = class189.field2726;
                } else {
                    int var7 = class359.field5120.method2146(2, (byte) 52);
                    if (~var7 == -1) {
                        class94.field1135[class305.field4287++] = var4;
                        var5.field5625 = class189.field2726;
                        class150.field1853[class176.field2399++] = var4;
                    } else if (~var7 == -2) {
                        class94.field1135[class305.field4287++] = var4;
                        var5.field5625 = class189.field2726;
                        int var8 = class359.field5120.method2146(3, (byte) 52);
                        var5.method241(arg0 + -10654, var8, 1);
                        int var9 = class359.field5120.method2146(1, (byte) 52);
                        if (var9 == 1) {
                            class150.field1853[class176.field2399++] = var4;
                        }
                    } else if (~var7 == -3) {
                        class94.field1135[class305.field4287++] = var4;
                        var5.field5625 = class189.field2726;
                        if (~class359.field5120.method2146(1, (byte) 52) != -2) {
                            int var10 = class359.field5120.method2146(3, (byte) 52);
                            var5.method241(arg0 + -10654, var10, 0);
                        } else {
                            int var11 = class359.field5120.method2146(3, (byte) 52);
                            var5.method241(-30274, var11, 2);
                            int var12 = class359.field5120.method2146(3, (byte) 52);
                            var5.method241(-30274, var12, 2);
                        }
                        int var13 = class359.field5120.method2146(1, (byte) 52);
                        if (var13 == 1) {
                            class150.field1853[class176.field2399++] = var4;
                        }
                    } else if (var7 == 3) {
                        class183.field2507[class141.field1738++] = var4;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(ZLon;B)V", line = 256)
    public static final void method2466(boolean arg0, class184 arg1, byte arg2) {
        ++field5416;
        int var3 = arg1.field2545 == 0 ? arg1.field2618 : arg1.field2545;
        int var4 = ~arg1.field2646 != -1 ? arg1.field2646 : arg1.field2516;
        class12.method91(104, class98.field1194[arg1.field2584 >> 16], arg0, var4, arg1.field2584, var3);
        if (arg1.field2603 != null) {
            class12.method91(54, arg1.field2603, arg0, var4, arg1.field2584, var3);
        }
        class167 var5 = (class167) class22.field280.method1888((long) arg1.field2584, (byte) -30);
        if (var5 != null) {
            class183.method1230(var3, arg0, (byte) -92, var4, var5.field2332);
        }
        if (arg2 > -65) {
            field5420 = null;
        }
    }

    @OriginalMember(owner = "client!ck", name = "g", descriptor = "(I)V", line = 281)
    public static void method2467(int arg0) {
        field5420 = null;
        field5421 = null;
        if (arg0 == -7925) {
            field5422 = null;
        }
    }

    @OriginalMember(owner = "client!ck", name = "b", descriptor = "(I)V", line = 302)
    public final void method188(int arg0) {
        if (arg0 != 1) {
            method2464(110);
        }
        class55.method315((byte) 42);
        ++field5414;
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(ILdg;I)V", line = 322)
    public final void method81(int arg0, class236 arg1, int arg2) {
        if (arg0 != 0) {
            if (arg0 == 1) {
                super.field1176 = ~arg1.method1574(arg2 ^ -3) == -2;
            }
        } else {
            this.field5419 = arg1.method1617((byte) 48) << 4;
        }
        if (arg2 != 0) {
            this.method188(30);
        }
        ++field5423;
    }
}
