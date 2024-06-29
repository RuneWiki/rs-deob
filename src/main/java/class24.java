import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ir")
public class class24 extends class145 {

    @OriginalMember(owner = "client!ir", name = "I", descriptor = "I")
    private int field251 = 5;

    @OriginalMember(owner = "client!ir", name = "R", descriptor = "I")
    private int field259 = 2048;

    @OriginalMember(owner = "client!ir", name = "J", descriptor = "I")
    private int field252 = 1;

    @OriginalMember(owner = "client!ir", name = "P", descriptor = "I")
    private int field258 = 2;

    @OriginalMember(owner = "client!ir", name = "U", descriptor = "I")
    private int field262 = 5;

    @OriginalMember(owner = "client!ir", name = "T", descriptor = "I")
    private int field261 = 0;

    @OriginalMember(owner = "client!ir", name = "X", descriptor = "[B")
    private byte[] field265 = new byte[512];

    @OriginalMember(owner = "client!ir", name = "V", descriptor = "[S")
    private short[] field263 = new short[512];

    @OriginalMember(owner = "client!ir", name = "K", descriptor = "[I")
    public static int[] field253 = new int[] { -1, 8192, 0, -1, 12288, 10240, 14336, -1, 4096, 6144, 2048 };

    @OriginalMember(owner = "client!ir", name = "O", descriptor = "I")
    public static int field257 = 0;

    @OriginalMember(owner = "client!ir", name = "L", descriptor = "Lkca;")
    public static class73 field254 = new class73(73, -1);

    @OriginalMember(owner = "client!ir", name = "Y", descriptor = "Lfh;")
    public static class567 field266 = new class567();

    @OriginalMember(owner = "client!ir", name = "Z", descriptor = "Lea;")
    public static class474 field267;

    @OriginalMember(owner = "client!ir", name = "E", descriptor = "I")
    public static int field247;

    @OriginalMember(owner = "client!ir", name = "G", descriptor = "I")
    public static int field249;

    @OriginalMember(owner = "client!ir", name = "H", descriptor = "I")
    public static int field250;

    @OriginalMember(owner = "client!ir", name = "M", descriptor = "I")
    public static int field255;

    @OriginalMember(owner = "client!ir", name = "N", descriptor = "I")
    public static int field256;

    @OriginalMember(owner = "client!ir", name = "S", descriptor = "I")
    public static int field260;

    @OriginalMember(owner = "client!ir", name = "W", descriptor = "I")
    public static int field264;

    @OriginalMember(owner = "client!ir", name = "F", descriptor = "Loc;")
    public static class175 field248;

    @OriginalMember(owner = "client!ir", name = "<init>", descriptor = "()V")
    public class24() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(B)V")
    public static void method148(byte arg0) {
        if (arg0 != 10) {
            method150((String) null, (String) null, (byte) 112, (String) null);
        }
        field254 = null;
        field253 = null;
        field267 = null;
        field248 = null;
        field266 = null;
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(IILrt;)V")
    public final void method28(int arg0, int arg1, class194 arg2) {
        if (~arg0 != -1) {
            if (~arg0 != -2) {
                if (arg0 != 2) {
                    if (arg0 != 3) {
                        if (arg0 != 4) {
                            if (~arg0 != -6) {
                                if (~arg0 == -7) {
                                    this.field262 = arg2.method1177(255);
                                }
                            } else {
                                this.field251 = arg2.method1177(255);
                            }
                        } else {
                            this.field252 = arg2.method1177(255);
                        }
                    } else {
                        this.field258 = arg2.method1177(255);
                    }
                } else {
                    this.field259 = arg2.method1220(121);
                }
            } else {
                this.field261 = arg2.method1177(255);
            }
        } else {
            this.field251 = this.field262 = arg2.method1177(255);
        }
        ++field264;
        if (arg1 > -67) {
            this.method28(-84, 85, (class194) null);
        }
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(ZI)[I")
    public final int[] method27(boolean arg0, int arg1) {
        ++field260;
        int[] var3 = super.field1779.method2069(-2, arg1);
        if (super.field1779.field4602) {
            int var4 = class573.field8270[arg1] * this.field262 + 2048;
            int var5 = var4 >> 12;
            int var6 = var5 + 1;
            for (int var7 = 0; ~class647.field9368 < ~var7; ++var7) {
                class135.field1686 = Integer.MAX_VALUE;
                class513.field7489 = Integer.MAX_VALUE;
                class31.field354 = Integer.MAX_VALUE;
                class493.field7195 = Integer.MAX_VALUE;
                int var8 = 2048 - -(class601.field8779[var7] * this.field251);
                int var9 = var8 >> 12;
                int var10 = var9 + 1;
                for (int var11 = var5 + -1; ~var6 <= ~var11; ++var11) {
                    int var13 = 255 & this.field265[255 & (this.field262 > var11 ? var11 : -this.field262 + var11)];
                    for (int var14 = var9 + -1; ~var14 >= ~var10; ++var14) {
                        int var15 = (this.field265[var13 - -(~this.field251 < ~var14 ? var14 : -this.field251 + var14) & 255] & 255) * 2;
                        int var27 = var15 + 1;
                        int var16 = -this.field263[var15] - (var14 << 12) + var8;
                        int var17 = var4 - ((var11 << 12) + this.field263[var27]);
                        int var18 = this.field252;
                        int var19;
                        if (var18 != 1) {
                            if (var18 != 3) {
                                if (~var18 != -5) {
                                    if (var18 != 5) {
                                        if (var18 == 2) {
                                            var19 = (var16 < 0 ? -var16 : var16) - -(var17 >= 0 ? var17 : -var17);
                                        } else {
                                            var19 = (int) (Math.sqrt((double) ((float) (var16 * var16 + var17 * var17) / 1.6777216E7F)) * 4096.0D);
                                        }
                                    } else {
                                        int var20 = var16 * var16;
                                        int var21 = var17 * var17;
                                        var19 = (int) (Math.sqrt(Math.sqrt((double) ((float) (var20 + var21) / 1.6777216E7F))) * 4096.0D);
                                    }
                                } else {
                                    int var22 = (int) (Math.sqrt((double) ((float) (var16 < 0 ? -var16 : var16) / 4096.0F)) * 4096.0D);
                                    int var23 = (int) (4096.0D * Math.sqrt((double) ((float) (~var17 > -1 ? -var17 : var17) / 4096.0F)));
                                    int var24 = var22 - -var23;
                                    var19 = var24 * var24 >> 12;
                                }
                            } else {
                                int var25 = ~var16 > -1 ? -var16 : var16;
                                int var26 = ~var17 > -1 ? -var17 : var17;
                                var19 = var25 > var26 ? var25 : var26;
                            }
                        } else {
                            var19 = var16 * var16 + var17 * var17 >> 12;
                        }
                        if (~class493.field7195 < ~var19) {
                            class135.field1686 = class513.field7489;
                            class513.field7489 = class31.field354;
                            class31.field354 = class493.field7195;
                            class493.field7195 = var19;
                        } else if (class31.field354 <= var19) {
                            if (var19 < class513.field7489) {
                                class135.field1686 = class513.field7489;
                                class513.field7489 = var19;
                            } else if (~var19 > ~class135.field1686) {
                                class135.field1686 = var19;
                            }
                        } else {
                            class135.field1686 = class513.field7489;
                            class513.field7489 = class31.field354;
                            class31.field354 = var19;
                        }
                    }
                }
                int var12 = this.field258;
                if (~var12 != -1) {
                    if (~var12 != -2) {
                        if (~var12 != -4) {
                            if (~var12 != -5) {
                                if (var12 == 2) {
                                    var3[var7] = -class493.field7195 + class31.field354;
                                }
                            } else {
                                var3[var7] = class135.field1686;
                            }
                        } else {
                            var3[var7] = class513.field7489;
                        }
                    } else {
                        var3[var7] = class31.field354;
                    }
                } else {
                    var3[var7] = class493.field7195;
                }
            }
        }
        return arg0 ? null : var3;
    }

    @OriginalMember(owner = "client!ir", name = "f", descriptor = "(I)V")
    public final void method145(int arg0) {
        this.field265 = class243.method1621(this.field261, (byte) -115);
        ++field250;
        this.method151((byte) 78);
        int var2 = -45 % ((arg0 - -46) / 45);
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(II)Ltp;")
    public static final class463 method149(int arg0, int arg1) {
        ++field247;
        if (~arg0 <= -1 && arg0 < 100) {
            if (arg1 != 0) {
                method148((byte) -112);
            }
            return class260.field3707[arg0];
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;BLjava/lang/String;)Ljava/lang/String;")
    public static final String method150(String arg0, String arg1, byte arg2, String arg3) {
        ++field249;
        if (arg2 != -40) {
            field266 = null;
        }
        for (int var4 = arg1.indexOf(arg0); var4 != -1; var4 = arg1.indexOf(arg0, arg3.length() + var4)) {
            arg1 = arg1.substring(0, var4) + arg3 + arg1.substring(arg0.length() + var4);
        }
        return arg1;
    }

    @OriginalMember(owner = "client!ir", name = "b", descriptor = "(B)V")
    private final void method151(byte arg0) {
        ++field256;
        Random var2 = new Random((long) this.field261);
        int var3 = -57 / ((7 - arg0) / 45);
        this.field263 = new short[512];
        if (this.field259 > 0) {
            for (int var4 = 0; var4 < 512; ++var4) {
                this.field263[var4] = (short) class107.method659(var2, false, this.field259);
            }
        }
    }

    static {
        new class474("Your clan channel has now been enabled!", "Dein Chatraum ist jetzt eingeschaltet.", "Votre canal de clan est activé !", "Seu canal de clã já está ativado!");
        field267 = new class474("Stellar Dawn is loading - please wait...", "Mechscape wird geladen - bitte warten...", "Chargement de Mechscape en cours - veuillez patienter...", "Mechscape carregando. Aguarde...");
    }
}
