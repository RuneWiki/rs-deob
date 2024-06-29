import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public class class88 extends class210 {

    @OriginalMember(owner = "client!pd", name = "K", descriptor = "I")
    private int field1076 = 5;

    @OriginalMember(owner = "client!pd", name = "J", descriptor = "I")
    private int field1075 = 2048;

    @OriginalMember(owner = "client!pd", name = "L", descriptor = "I")
    private int field1077 = 2;

    @OriginalMember(owner = "client!pd", name = "R", descriptor = "I")
    private int field1082 = 0;

    @OriginalMember(owner = "client!pd", name = "Y", descriptor = "[S")
    private short[] field1088 = new short[512];

    @OriginalMember(owner = "client!pd", name = "U", descriptor = "I")
    private int field1084 = 5;

    @OriginalMember(owner = "client!pd", name = "N", descriptor = "I")
    private int field1079 = 1;

    @OriginalMember(owner = "client!pd", name = "bb", descriptor = "[B")
    private byte[] field1091 = new byte[512];

    @OriginalMember(owner = "client!pd", name = "I", descriptor = "I")
    public static int field1074 = 0;

    @OriginalMember(owner = "client!pd", name = "V", descriptor = "[I")
    public static int[] field1085 = new int[2048];

    @OriginalMember(owner = "client!pd", name = "M", descriptor = "Ljn;")
    public static class409 field1078 = new class409(" has logged out.", " loggt sich aus.", " s'est déconnecté.", " saiu do jogo.");

    @OriginalMember(owner = "client!pd", name = "cb", descriptor = "Ljn;")
    public static class409 field1092 = new class409("Checking for updates - ", "Suche nach Updates - ", "Vérification des mises à jour - ", "Verificando atualizações - ");

    @OriginalMember(owner = "client!pd", name = "O", descriptor = "I")
    public static int field1080;

    @OriginalMember(owner = "client!pd", name = "Q", descriptor = "I")
    public static int field1081;

    @OriginalMember(owner = "client!pd", name = "T", descriptor = "I")
    public static int field1083;

    @OriginalMember(owner = "client!pd", name = "W", descriptor = "I")
    public static int field1086;

    @OriginalMember(owner = "client!pd", name = "X", descriptor = "I")
    public static int field1087;

    @OriginalMember(owner = "client!pd", name = "Z", descriptor = "I")
    public static int field1089;

    @OriginalMember(owner = "client!pd", name = "ab", descriptor = "I")
    public static int field1090;

    @OriginalMember(owner = "client!pd", name = "<init>", descriptor = "()V", line = 3)
    public class88() {
        super(0, true);
    }

    @OriginalMember(owner = "client!pd", name = "g", descriptor = "(I)V", line = 8)
    public static final void method590(int arg0) {
        ++field1080;
        if (arg0 != 11805) {
            method590(-5);
        }
        class388.field5677.method161(((float) class52.field652 * 0.1F + 0.7F) * 1.1523438F);
        class388.field5677.method133(class159.field2135, 0.69921875F, 1.2F, -50.0F, -60.0F, -50.0F);
        class388.field5677.method140(class57.field695, -1);
        class388.field5677.method118(class332.field4933);
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(BI)V", line = 25)
    public static final void method591(byte arg0, int arg1) {
        ++field1087;
        class125 var2 = class56.method428(arg1, 14, -3636);
        int var3 = -116 / ((43 - arg0) / 56);
        var2.method847(84);
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(IILat;)V", line = 39)
    public final void method56(int arg0, int arg1, class256 arg2) {
        if (~arg0 != -1) {
            if (~arg0 != -2) {
                if (arg0 != 2) {
                    if (~arg0 != -4) {
                        if (arg0 != 4) {
                            if (arg0 != 5) {
                                if (~arg0 == -7) {
                                    this.field1084 = arg2.method1738((byte) 94);
                                }
                            } else {
                                this.field1076 = arg2.method1738((byte) 60);
                            }
                        } else {
                            this.field1079 = arg2.method1738((byte) 84);
                        }
                    } else {
                        this.field1077 = arg2.method1738((byte) -47);
                    }
                } else {
                    this.field1075 = arg2.method1767(1930493576);
                }
            } else {
                this.field1082 = arg2.method1738((byte) 96);
            }
        } else {
            this.field1076 = this.field1084 = arg2.method1738((byte) -78);
        }
        if (arg1 != -11941) {
            field1085 = null;
        }
        ++field1083;
    }

    @OriginalMember(owner = "client!pd", name = "c", descriptor = "(B)V", line = 132)
    private final void method592(byte arg0) {
        ++field1089;
        if (arg0 > 47) {
            Random var2 = new Random((long) this.field1082);
            this.field1088 = new short[512];
            if (~this.field1075 < -1) {
                for (int var3 = 0; ~var3 > -513; ++var3) {
                    this.field1088[var3] = (short) class435.method2683(var2, (byte) -75, this.field1075);
                }
            }
        }
    }

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "(BI)V", line = 171)
    public static final void method593(byte arg0, int arg1) {
        class169.field2214 = false;
        class82.field1008 = 1;
        class286.field4209 = null;
        class67.field897 = -1;
        class182.field2563 = arg1;
        if (arg0 >= 29) {
            class316.field4628 = 0;
            class71.field928 = -1;
            ++field1090;
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(IB)[I", line = 193)
    public final int[] method361(int arg0, byte arg1) {
        if (arg1 != -38) {
            this.field1077 = 36;
        }
        ++field1086;
        int[] var3 = super.field2950.method1892(arg0, (byte) -115);
        if (super.field2950.field4111) {
            int var4 = class331.field4911[arg0] * this.field1084 + 2048;
            int var5 = var4 >> 12;
            int var6 = var5 + 1;
            for (int var7 = 0; class202.field2852 > var7; ++var7) {
                class368.field5316 = Integer.MAX_VALUE;
                class67.field894 = Integer.MAX_VALUE;
                class146.field1986 = Integer.MAX_VALUE;
                class36.field517 = Integer.MAX_VALUE;
                int var8 = 2048 - -(class430.field6250[var7] * this.field1076);
                int var9 = var8 >> 12;
                int var10 = var9 + 1;
                for (int var11 = var5 + -1; ~var6 <= ~var11; ++var11) {
                    int var13 = this.field1091[255 & (~var11 > ~this.field1084 ? var11 : -this.field1084 + var11)] & 255;
                    for (int var14 = var9 - 1; ~var10 <= ~var14; ++var14) {
                        int var15 = 2 * (255 & this.field1091[var13 + (var14 < this.field1076 ? var14 : -this.field1076 + var14) & 255]);
                        int var10001 = var14 << 12;
                        int var27 = var15 + 1;
                        int var16 = var8 - (var10001 + this.field1088[var15]);
                        int var17 = var4 - ((var11 << 12) + this.field1088[var27]);
                        int var18 = this.field1079;
                        int var19;
                        if (var18 != 1) {
                            if (~var18 != -4) {
                                if (~var18 != -5) {
                                    if (~var18 != -6) {
                                        if (var18 == 2) {
                                            var19 = (var17 < 0 ? -var17 : var17) + (var16 < 0 ? -var16 : var16);
                                        } else {
                                            var19 = (int) (Math.sqrt((double) ((float) (var16 * var16 + var17 * var17) / 1.6777216E7F)) * 4096.0D);
                                        }
                                    } else {
                                        int var20 = var17 * var17;
                                        int var21 = var16 * var16;
                                        var19 = (int) (Math.sqrt(Math.sqrt((double) ((float) (var21 - -var20) / 1.6777216E7F))) * 4096.0D);
                                    }
                                } else {
                                    int var22 = (int) (Math.sqrt((double) ((float) (~var16 > -1 ? -var16 : var16) / 4096.0F)) * 4096.0D);
                                    int var23 = (int) (4096.0D * Math.sqrt((double) ((float) (var17 < 0 ? -var17 : var17) / 4096.0F)));
                                    int var24 = var22 + var23;
                                    var19 = var24 * var24 >> 12;
                                }
                            } else {
                                int var25 = var17 < 0 ? -var17 : var17;
                                int var26 = ~var16 <= -1 ? var16 : -var16;
                                var19 = ~var26 >= ~var25 ? var25 : var26;
                            }
                        } else {
                            var19 = var16 * var16 + var17 * var17 >> 12;
                        }
                        if (class36.field517 > var19) {
                            class368.field5316 = class67.field894;
                            class67.field894 = class146.field1986;
                            class146.field1986 = class36.field517;
                            class36.field517 = var19;
                        } else if (var19 >= class146.field1986) {
                            if (class67.field894 > var19) {
                                class368.field5316 = class67.field894;
                                class67.field894 = var19;
                            } else if (var19 < class368.field5316) {
                                class368.field5316 = var19;
                            }
                        } else {
                            class368.field5316 = class67.field894;
                            class67.field894 = class146.field1986;
                            class146.field1986 = var19;
                        }
                    }
                }
                int var12 = this.field1077;
                if (~var12 != -1) {
                    if (var12 != 1) {
                        if (~var12 != -4) {
                            if (~var12 != -5) {
                                if (~var12 == -3) {
                                    var3[var7] = -class36.field517 + class146.field1986;
                                }
                            } else {
                                var3[var7] = class368.field5316;
                            }
                        } else {
                            var3[var7] = class67.field894;
                        }
                    } else {
                        var3[var7] = class146.field1986;
                    }
                } else {
                    var3[var7] = class36.field517;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!pd", name = "e", descriptor = "(I)V", line = 409)
    public final void method363(int arg0) {
        if (arg0 == 0) {
            ++field1081;
            this.field1091 = class302.method2012((byte) -119, this.field1082);
            this.method592((byte) 64);
        }
    }

    @OriginalMember(owner = "client!pd", name = "h", descriptor = "(I)V", line = 421)
    public static void method594(int arg0) {
        field1092 = null;
        if (arg0 == 1020391948) {
            field1085 = null;
            field1078 = null;
        }
    }
}
