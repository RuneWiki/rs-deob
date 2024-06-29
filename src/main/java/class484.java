import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jn")
public class class484 extends class404 {

    @OriginalMember(owner = "client!jn", name = "B", descriptor = "I")
    private int field7384 = 1;

    @OriginalMember(owner = "client!jn", name = "C", descriptor = "I")
    private int field7385 = 2;

    @OriginalMember(owner = "client!jn", name = "E", descriptor = "I")
    private int field7387 = 5;

    @OriginalMember(owner = "client!jn", name = "A", descriptor = "I")
    private int field7383 = 5;

    @OriginalMember(owner = "client!jn", name = "L", descriptor = "[S")
    private short[] field7393 = new short[512];

    @OriginalMember(owner = "client!jn", name = "D", descriptor = "[B")
    private byte[] field7386 = new byte[512];

    @OriginalMember(owner = "client!jn", name = "I", descriptor = "I")
    private int field7390 = 0;

    @OriginalMember(owner = "client!jn", name = "N", descriptor = "I")
    private int field7395 = 2048;

    @OriginalMember(owner = "client!jn", name = "H", descriptor = "Lnd;")
    public static class366 field7389;

    @OriginalMember(owner = "client!jn", name = "M", descriptor = "Lsk;")
    public static class423 field7394;

    @OriginalMember(owner = "client!jn", name = "Q", descriptor = "I")
    public static int field7398;

    @OriginalMember(owner = "client!jn", name = "P", descriptor = "Lhi;")
    public static class131 field7397;

    @OriginalMember(owner = "client!jn", name = "R", descriptor = "Lsk;")
    public static class423 field7399;

    @OriginalMember(owner = "client!jn", name = "T", descriptor = "F")
    public static float field7400;

    @OriginalMember(owner = "client!jn", name = "z", descriptor = "I")
    public static int field7382;

    @OriginalMember(owner = "client!jn", name = "G", descriptor = "I")
    public static int field7388;

    @OriginalMember(owner = "client!jn", name = "J", descriptor = "I")
    public static int field7391;

    @OriginalMember(owner = "client!jn", name = "K", descriptor = "I")
    public static int field7392;

    @OriginalMember(owner = "client!jn", name = "O", descriptor = "I")
    public static int field7396;

    static {
        new class231("", 73);
        field7389 = new class366(5, 7);
        field7394 = new class423("Attack", "Angreifen", "Attaquer", "Atacar");
        field7398 = 0;
        field7397 = new class131(6, 0, 4, 2);
        field7399 = new class423("Loaded client variable data", "Client-Variablen geladen", "Variables du client chargées", "As variáveis do sistema foram carregadas");
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(II)[I", line = 4)
    public final int[] method90(int arg0, int arg1) {
        ++field7382;
        int[] var3 = super.field5870.method372(arg1, (byte) -119);
        if (arg0 > -47) {
            method2916(-50, 27);
        }
        if (super.field5870.field810) {
            int var4 = class289.field4381[arg1] * this.field7383 + 2048;
            int var5 = var4 >> 12;
            int var6 = var5 + 1;
            for (int var7 = 0; class431.field6348 > var7; ++var7) {
                class113.field1922 = Integer.MAX_VALUE;
                class174.field2727 = Integer.MAX_VALUE;
                class165.field2569 = Integer.MAX_VALUE;
                class181.field2816 = Integer.MAX_VALUE;
                int var8 = class167.field2594[var7] * this.field7387 + 2048;
                int var9 = var8 >> 12;
                int var10 = var9 + 1;
                for (int var11 = var5 - 1; var6 >= var11; ++var11) {
                    int var13 = 255 & this.field7386[(~var11 > ~this.field7383 ? var11 : -this.field7383 + var11) & 255];
                    for (int var14 = var9 - 1; ~var14 >= ~var10; ++var14) {
                        int var15 = (255 & this.field7386[var13 + (~this.field7387 < ~var14 ? var14 : -this.field7387 + var14) & 255]) * 2;
                        int var27 = var15 + 1;
                        int var16 = var8 - (this.field7393[var15] - -(var14 << 12));
                        int var17 = -(var11 << 12) + var4 + -this.field7393[var27];
                        int var18 = this.field7384;
                        int var19;
                        if (~var18 != -2) {
                            if (~var18 != -4) {
                                if (var18 != 4) {
                                    if (~var18 != -6) {
                                        if (var18 == 2) {
                                            var19 = (var17 >= 0 ? var17 : -var17) + (~var16 > -1 ? -var16 : var16);
                                        } else {
                                            var19 = (int) (Math.sqrt((double) ((float) (var16 * var16 + var17 * var17) / 1.6777216E7F)) * 4096.0D);
                                        }
                                    } else {
                                        int var20 = var17 * var17;
                                        int var21 = var16 * var16;
                                        var19 = (int) (4096.0D * Math.sqrt(Math.sqrt((double) ((float) (var20 + var21) / 1.6777216E7F))));
                                    }
                                } else {
                                    int var22 = (int) (4096.0D * Math.sqrt((double) ((float) (~var16 > -1 ? -var16 : var16) / 4096.0F)));
                                    int var23 = (int) (Math.sqrt((double) ((float) (var17 < 0 ? -var17 : var17) / 4096.0F)) * 4096.0D);
                                    int var24 = var22 + var23;
                                    var19 = var24 * var24 >> 12;
                                }
                            } else {
                                int var25 = var17 >= 0 ? var17 : -var17;
                                int var26 = var16 >= 0 ? var16 : -var16;
                                var19 = ~var26 >= ~var25 ? var25 : var26;
                            }
                        } else {
                            var19 = var16 * var16 + var17 * var17 >> 12;
                        }
                        if (class181.field2816 > var19) {
                            class113.field1922 = class174.field2727;
                            class174.field2727 = class165.field2569;
                            class165.field2569 = class181.field2816;
                            class181.field2816 = var19;
                        } else if (~class165.field2569 < ~var19) {
                            class113.field1922 = class174.field2727;
                            class174.field2727 = class165.field2569;
                            class165.field2569 = var19;
                        } else if (~class174.field2727 < ~var19) {
                            class113.field1922 = class174.field2727;
                            class174.field2727 = var19;
                        } else if (var19 < class113.field1922) {
                            class113.field1922 = var19;
                        }
                    }
                }
                int var12 = this.field7385;
                if (var12 != 0) {
                    if (~var12 != -2) {
                        if (~var12 != -4) {
                            if (var12 != 4) {
                                if (var12 == 2) {
                                    var3[var7] = -class181.field2816 + class165.field2569;
                                }
                            } else {
                                var3[var7] = class113.field1922;
                            }
                        } else {
                            var3[var7] = class174.field2727;
                        }
                    } else {
                        var3[var7] = class165.field2569;
                    }
                } else {
                    var3[var7] = class181.field2816;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!jn", name = "<init>", descriptor = "()V", line = 216)
    public class484() {
        super(0, true);
    }

    @OriginalMember(owner = "client!jn", name = "c", descriptor = "(II)I", line = 220)
    public static final int method2916(int arg0, int arg1) {
        if (arg1 < 68) {
            return 26;
        } else {
            ++field7392;
            return arg0 & 127;
        }
    }

    @OriginalMember(owner = "client!jn", name = "h", descriptor = "(I)V", line = 234)
    private final void method2917(int arg0) {
        ++field7396;
        Random var2 = new Random((long) this.field7390);
        this.field7393 = new short[512];
        if (~this.field7395 < -1) {
            for (int var3 = 0; ~var3 > -513; ++var3) {
                this.field7393[var3] = (short) class482.method2911((byte) 45, this.field7395, var2);
            }
        }
        if (arg0 != -12713) {
            this.method2917(-12);
        }
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(ILha;I)V", line = 265)
    public final void method87(int arg0, class40 arg1, int arg2) {
        if (~arg2 != -1) {
            if (arg2 != 1) {
                if (arg2 != 2) {
                    if (~arg2 != -4) {
                        if (~arg2 != -5) {
                            if (arg2 != 5) {
                                if (arg2 == 6) {
                                    this.field7383 = arg1.method257((byte) 60);
                                }
                            } else {
                                this.field7387 = arg1.method257((byte) 110);
                            }
                        } else {
                            this.field7384 = arg1.method257((byte) 63);
                        }
                    } else {
                        this.field7385 = arg1.method257((byte) 51);
                    }
                } else {
                    this.field7395 = arg1.method254((byte) -112);
                }
            } else {
                this.field7390 = arg1.method257((byte) 74);
            }
        } else {
            this.field7387 = this.field7383 = arg1.method257((byte) 116);
        }
        if (arg0 != 0) {
            this.method87(87, (class40) null, -8);
        }
        ++field7391;
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(B)V", line = 353)
    public static void method2918(byte arg0) {
        field7399 = null;
        field7389 = null;
        field7397 = null;
        if (arg0 > -75) {
            field7399 = null;
        }
        field7394 = null;
    }

    @OriginalMember(owner = "client!jn", name = "d", descriptor = "(I)V", line = 371)
    public final void method211(int arg0) {
        ++field7388;
        this.field7386 = class128.method867(this.field7390, -19333);
        if (arg0 == -3) {
            this.method2917(-12713);
        }
    }
}
