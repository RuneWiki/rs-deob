import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jj")
public class class47 extends class305 {

    @OriginalMember(owner = "client!jj", name = "D", descriptor = "I")
    public int field735 = 4;

    @OriginalMember(owner = "client!jj", name = "E", descriptor = "[B")
    private byte[] field736 = new byte[512];

    @OriginalMember(owner = "client!jj", name = "M", descriptor = "I")
    public int field742 = 4;

    @OriginalMember(owner = "client!jj", name = "J", descriptor = "Z")
    public boolean field740 = true;

    @OriginalMember(owner = "client!jj", name = "V", descriptor = "I")
    public int field751 = 4;

    @OriginalMember(owner = "client!jj", name = "T", descriptor = "I")
    public int field749 = 0;

    @OriginalMember(owner = "client!jj", name = "X", descriptor = "I")
    public int field753 = 1638;

    @OriginalMember(owner = "client!jj", name = "I", descriptor = "I")
    public static int field739 = 0;

    @OriginalMember(owner = "client!jj", name = "Q", descriptor = "Lpn;")
    public static class49 field746 = new class49(82, 11);

    @OriginalMember(owner = "client!jj", name = "U", descriptor = "[Lho;")
    public static class347[] field750 = new class347[30];

    @OriginalMember(owner = "client!jj", name = "W", descriptor = "Lpn;")
    public static class49 field752 = new class49(22, 3);

    @OriginalMember(owner = "client!jj", name = "G", descriptor = "I")
    public static int field737;

    @OriginalMember(owner = "client!jj", name = "H", descriptor = "I")
    public static int field738;

    @OriginalMember(owner = "client!jj", name = "L", descriptor = "I")
    public static int field741;

    @OriginalMember(owner = "client!jj", name = "N", descriptor = "I")
    public static int field743;

    @OriginalMember(owner = "client!jj", name = "O", descriptor = "I")
    public static int field744;

    @OriginalMember(owner = "client!jj", name = "S", descriptor = "I")
    public static int field748;

    @OriginalMember(owner = "client!jj", name = "Y", descriptor = "I")
    public static int field754;

    @OriginalMember(owner = "client!jj", name = "Z", descriptor = "I")
    public static int field755;

    @OriginalMember(owner = "client!jj", name = "P", descriptor = "[S")
    private short[] field745;

    @OriginalMember(owner = "client!jj", name = "R", descriptor = "[S")
    private short[] field747;

    static {
        new class179("You cannot send a quick chat message to a player on this world at this time.", "Einem Spieler auf dieser Welt können derzeit keine Direktchat-Nachrichten", "Impossible d'envoyer un message rapide à un joueur de ce serveur à l'heure actuelle.", "Você não pode enviar uma mensagem de papo rápido para um jogador neste mundo neste momento.");
    }

    @OriginalMember(owner = "client!jj", name = "f", descriptor = "(I)V", line = 5)
    private final void method318(int arg0) {
        ++field741;
        if (arg0 == 2) {
            if (this.field753 <= 0) {
                if (this.field747 != null && ~this.field747.length == ~this.field751) {
                    this.field745 = new short[this.field751];
                    for (int var2 = 0; ~this.field751 < ~var2; ++var2) {
                        this.field745[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
                    }
                    return;
                }
            } else {
                this.field747 = new short[this.field751];
                this.field745 = new short[this.field751];
                for (int var3 = 0; this.field751 > var3; ++var3) {
                    this.field747[var3] = (short) ((int) (4096.0D * Math.pow((double) ((float) this.field753 / 4096.0F), (double) var3)));
                    this.field745[var3] = (short) ((int) Math.pow(2.0D, (double) var3));
                }
            }
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(B)V", line = 52)
    public final void method17(byte arg0) {
        this.field736 = class367.method2336(this.field749, arg0 + 317);
        ++field737;
        this.method318(2);
        int var2 = this.field751 - 1;
        if (arg0 != -62) {
            field746 = null;
        }
        while (~var2 <= -2) {
            short var3 = this.field747[var2];
            if (~var3 < -9) {
                return;
            }
            if (~var3 > 7) {
                return;
            }
            --this.field751;
            --var2;
        }
    }

    @OriginalMember(owner = "client!jj", name = "<init>", descriptor = "()V", line = 224)
    public class47() {
        super(0, true);
    }

    @OriginalMember(owner = "client!jj", name = "g", descriptor = "(I)V", line = 88)
    public static void method319(int arg0) {
        field750 = null;
        field752 = null;
        if (arg0 < 115) {
            method321(-32, 101);
        }
        field746 = null;
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(ILfh;B)V", line = 105)
    public final void method14(int arg0, class194 arg1, byte arg2) {
        if (arg0 != 0) {
            if (~arg0 != -2) {
                if (arg0 != 2) {
                    if (arg0 != 3) {
                        if (~arg0 != -5) {
                            if (~arg0 != -6) {
                                if (arg0 == 6) {
                                    this.field742 = arg1.method1337((byte) -116);
                                }
                            } else {
                                this.field735 = arg1.method1337((byte) -122);
                            }
                        } else {
                            this.field749 = arg1.method1337((byte) -120);
                        }
                    } else {
                        this.field735 = this.field742 = arg1.method1337((byte) -111);
                    }
                } else {
                    this.field753 = arg1.method1384(true);
                    if (this.field753 < 0) {
                        this.field747 = new short[this.field751];
                        for (int var5 = 0; var5 < this.field751; ++var5) {
                            this.field747[var5] = (short) arg1.method1384(true);
                        }
                    }
                }
            } else {
                this.field751 = arg1.method1337((byte) -118);
            }
        } else {
            this.field740 = arg1.method1337((byte) 94) == 1;
        }
        if (arg2 <= 76) {
            this.field747 = null;
        }
        ++field738;
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(II)[I", line = 199)
    public final int[] method15(int arg0, int arg1) {
        if (arg1 != 4688) {
            this.method17((byte) 25);
        }
        ++field743;
        int[] var3 = super.field4677.method2174(arg0, 49);
        if (super.field4677.field5040) {
            this.method322(var3, arg0, (byte) 56);
        }
        return var3;
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(IZIIIII)I", line = 228)
    private final int method320(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field748;
        int var8 = arg0 >> 12;
        int var9 = var8 + 1;
        if (arg1) {
            this.field749 = 2;
        }
        if (~arg5 >= ~var9) {
            var9 = 0;
        }
        int var10 = arg0 & 4095;
        int var11 = var8 & 255;
        int var12 = arg3 + -4096;
        int var13 = var9 & 255;
        int var14 = var10 + -4096;
        int var15 = this.field736[var11 - -arg2] & 3;
        int var16 = class501.field7283[var10];
        int var17;
        if (~var15 < -2) {
            var17 = ~var15 != -3 ? -arg3 + -var10 : -arg3 + var10;
        } else {
            var17 = ~var15 != -1 ? -var10 + arg3 : arg3 + var10;
        }
        int var18 = 3 & this.field736[arg2 + var13];
        int var19;
        if (~var18 < -2) {
            var19 = ~var18 != -3 ? -arg3 + -var14 : -arg3 + var14;
        } else {
            var19 = ~var18 != -1 ? arg3 - var14 : arg3 + var14;
        }
        int var20 = 3 & this.field736[arg6 + var11];
        int var21 = var17 - -((-var17 + var19) * var16 >> 12);
        int var22;
        if (~var20 < -2) {
            var22 = var20 == 2 ? -var12 + var10 : -var10 + -var12;
        } else {
            var22 = var20 != 0 ? -var10 + var12 : var10 + var12;
        }
        int var23 = 3 & this.field736[var13 - -arg6];
        int var24;
        if (~var23 >= -2) {
            var24 = ~var23 != -1 ? -var14 + var12 : var14 - -var12;
        } else {
            var24 = var23 == 2 ? var14 - var12 : -var12 + -var14;
        }
        int var25 = ((-var22 + var24) * var16 >> 12) + var22;
        return ((-var21 + var25) * arg4 >> 12) + var21;
    }

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "(II)V", line = 302)
    public static final void method321(int arg0, int arg1) {
        ++field744;
        class188 var2 = class10.method48((byte) 73, 5, arg0);
        if (arg1 > -47) {
            field752 = null;
        }
        var2.method1306(-23128);
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "([IIB)V", line = 344)
    public final void method322(int[] arg0, int arg1, byte arg2) {
        ++field755;
        int var4 = class301.field4614[arg1] * this.field742;
        if (arg2 == 56) {
            if (~this.field751 != -2) {
                short var5 = this.field747[0];
                if (~var5 < -9 || var5 < -8) {
                    int var6 = this.field745[0] << 12;
                    int var7 = this.field742 * var6 >> 12;
                    int var8 = this.field735 * var6 >> 12;
                    int var9 = var4 * var6 >> 12;
                    int var10 = var9 >> 12;
                    int var11 = var10 - -1;
                    if (var11 >= var7) {
                        var11 = 0;
                    }
                    int var12 = var9 & 4095;
                    int var13 = this.field736[255 & var11] & 255;
                    int var14 = 255 & this.field736[var10 & 255];
                    int var15 = class501.field7283[var12];
                    for (int var16 = 0; var16 < class91.field1471; ++var16) {
                        int var36 = class78.field1298[var16] * this.field735;
                        int var37 = this.method320(var6 * var36 >> 12, false, var14, var12, var15, var8, var13);
                        arg0[var16] = var5 * var37 >> 12;
                    }
                }
                for (int var17 = 1; var17 < this.field751; ++var17) {
                    short var18 = this.field747[var17];
                    if (var18 > 8 || ~var18 > 7) {
                        int var19 = this.field745[var17] << 12;
                        int var20 = this.field735 * var19 >> 12;
                        int var21 = this.field742 * var19 >> 12;
                        int var22 = var4 * var19 >> 12;
                        int var23 = var22 >> 12;
                        int var24 = var23 + 1;
                        int var25 = var22 & 4095;
                        if (var24 >= var21) {
                            var24 = 0;
                        }
                        int var26 = this.field736[var23 & 255] & 255;
                        int var27 = 255 & this.field736[var24 & 255];
                        int var28 = class501.field7283[var25];
                        if (this.field740 && this.field751 - 1 == var17) {
                            for (int var29 = 0; ~var29 > ~class91.field1471; ++var29) {
                                int var30 = class78.field1298[var29] * this.field735;
                                int var31 = this.method320(var19 * var30 >> 12, false, var26, var25, var28, var20, var27);
                                int var32 = (var18 * var31 >> 12) + arg0[var29];
                                arg0[var29] = (var32 >> 1) + 2048;
                            }
                        } else {
                            for (int var33 = 0; ~class91.field1471 < ~var33; ++var33) {
                                int var34 = class78.field1298[var33] * this.field735;
                                int var35 = this.method320(var19 * var34 >> 12, false, var26, var25, var28, var20, var27);
                                arg0[var33] += var18 * var35 >> 12;
                            }
                        }
                    }
                }
            } else {
                short var38 = this.field747[0];
                int var39 = this.field745[0] << 12;
                int var40 = this.field742 * var39 >> 12;
                int var41 = this.field735 * var39 >> 12;
                int var42 = var4 * var39 >> 12;
                int var43 = var42 >> 12;
                int var44 = var43 - -1;
                if (var44 >= var40) {
                    var44 = 0;
                }
                int var45 = var42 & 4095;
                int var46 = class501.field7283[var45];
                int var47 = 255 & this.field736[255 & var43];
                int var48 = this.field736[var44 & 255] & 255;
                if (this.field740) {
                    for (int var49 = 0; ~var49 > ~class91.field1471; ++var49) {
                        int var50 = class78.field1298[var49] * this.field735;
                        int var51 = this.method320(var39 * var50 >> 12, false, var47, var45, var46, var41, var48);
                        int var52 = var38 * var51 >> 12;
                        arg0[var49] = (var52 >> 1) + 2048;
                    }
                } else {
                    for (int var53 = 0; ~var53 > ~class91.field1471; ++var53) {
                        int var54 = class78.field1298[var53] * this.field735;
                        int var55 = this.method320(var39 * var54 >> 12, false, var47, var45, var46, var41, var48);
                        arg0[var53] = var38 * var55 >> 12;
                    }
                }
            }
        }
    }
}
