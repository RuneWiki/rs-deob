import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qr")
public class class46 extends class354 {

    @OriginalMember(owner = "client!qr", name = "N", descriptor = "[I")
    private int[] field651 = new int[3];

    @OriginalMember(owner = "client!qr", name = "K", descriptor = "I")
    private int field649 = 4096;

    @OriginalMember(owner = "client!qr", name = "M", descriptor = "I")
    private int field650 = 3216;

    @OriginalMember(owner = "client!qr", name = "O", descriptor = "I")
    private int field652 = 3216;

    @OriginalMember(owner = "client!qr", name = "S", descriptor = "[I")
    public static int[] field656 = new int[] { 4, 4, 1, 2, 6, 4, 2, 47, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };

    @OriginalMember(owner = "client!qr", name = "Q", descriptor = "Lof;")
    public static class446 field654 = new class446("Connection lost.", "Verbindung abgebrochen.", "Connexion perdue.", "Conexão perdida.");

    @OriginalMember(owner = "client!qr", name = "X", descriptor = "Lof;")
    public static class446 field661 = new class446("Checking for updates - ", "Suche nach Updates - ", "Vérification des mises à jour - ", "Verificando atualizações - ");

    @OriginalMember(owner = "client!qr", name = "P", descriptor = "I")
    public static int field653;

    @OriginalMember(owner = "client!qr", name = "R", descriptor = "I")
    public static int field655;

    @OriginalMember(owner = "client!qr", name = "T", descriptor = "I")
    public static int field657;

    @OriginalMember(owner = "client!qr", name = "U", descriptor = "I")
    public static int field658;

    @OriginalMember(owner = "client!qr", name = "V", descriptor = "I")
    public static int field659;

    @OriginalMember(owner = "client!qr", name = "W", descriptor = "I")
    public static int field660;

    @OriginalMember(owner = "client!qr", name = "Y", descriptor = "I")
    public static int field662;

    // $FF: synthetic field
    @OriginalMember(owner = "client!qr", name = "Z", descriptor = "Ljava/lang/Class;")
    public static Class field663;

    @OriginalMember(owner = "client!qr", name = "b", descriptor = "(B)V")
    private final void method356(byte arg0) {
        ++field655;
        double var2 = Math.cos((double) ((float) this.field650 / 4096.0F));
        this.field651[0] = (int) (var2 * Math.sin((double) ((float) this.field652 / 4096.0F)) * 4096.0D);
        this.field651[1] = (int) (4096.0D * Math.cos((double) ((float) this.field652 / 4096.0F)) * var2);
        this.field651[2] = (int) (Math.sin((double) ((float) this.field650 / 4096.0F)) * 4096.0D);
        int var4 = this.field651[0] * this.field651[0] >> 12;
        if (arg0 != -35) {
            method359((class119) null, (byte) 9);
        }
        int var5 = this.field651[1] * this.field651[1] >> 12;
        int var6 = this.field651[2] * this.field651[2] >> 12;
        int var7 = (int) (4096.0D * Math.sqrt((double) (var4 - -var5 + var6 >> 12)));
        if (var7 != 0) {
            this.field651[0] = (this.field651[0] << 12) / var7;
            this.field651[2] = (this.field651[2] << 12) / var7;
            this.field651[1] = (this.field651[1] << 12) / var7;
        }
    }

    @OriginalMember(owner = "client!qr", name = "g", descriptor = "(I)V")
    public final void method357(int arg0) {
        ++field653;
        this.method356((byte) -35);
        if (arg0 <= 28) {
            this.method272((class164) null, 109, 79);
        }
    }

    @OriginalMember(owner = "client!qr", name = "b", descriptor = "(IIIIIII)V")
    public static final void method358(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field657;
        int var7 = arg4 - -arg2;
        int var8 = -arg2 + arg3;
        for (int var9 = arg4; var7 > var9; ++var9) {
            class221.method1489(class466.field6955[var9], arg6, arg1, (byte) -30, arg0);
        }
        int var10 = -arg2 + arg1;
        if (arg5 >= 43) {
            for (int var11 = arg3; var8 < var11; --var11) {
                class221.method1489(class466.field6955[var11], arg6, arg1, (byte) -30, arg0);
            }
            int var12 = arg2 + arg6;
            for (int var13 = var7; var13 <= var8; ++var13) {
                int[] var14 = class466.field6955[var13];
                class221.method1489(var14, arg6, var12, (byte) -30, arg0);
                class221.method1489(var14, var10, arg1, (byte) -30, arg0);
            }
        }
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(Lei;B)V")
    public static final void method359(class119 arg0, byte arg1) {
        ++field659;
        if (class443.field6672 != null) {
            class68 var2 = null;
            int var3 = 87 / ((-39 - arg1) / 51);
            if (~arg0.field1629 == -1) {
                var2 = (class68) class309.method1938(arg0.field1631, arg0.field1638, arg0.field1640);
            }
            if (arg0.field1629 == 1) {
                var2 = (class68) class307.method1926(arg0.field1631, arg0.field1638, arg0.field1640);
            }
            if (arg0.field1629 == 2) {
                var2 = (class68) class172.method1169(arg0.field1631, arg0.field1638, arg0.field1640, field663 != null ? field663 : (field663 = method361("jt")));
            }
            if (~arg0.field1629 == -4) {
                var2 = (class68) class471.method2823(arg0.field1631, arg0.field1638, arg0.field1640);
            }
            if (var2 != null) {
                arg0.field1633 = var2.method338(85);
                arg0.field1635 = var2.method336(-6130);
                arg0.field1628 = var2.method332(6359);
            } else {
                arg0.field1633 = -1;
                arg0.field1635 = 0;
                arg0.field1628 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!qr", name = "c", descriptor = "(B)V")
    public static void method360(byte arg0) {
        field654 = null;
        field656 = null;
        int var1 = -49 / ((-20 - arg0) / 56);
        field661 = null;
    }

    @OriginalMember(owner = "client!qr", name = "b", descriptor = "(BI)[I")
    public final int[] method270(byte arg0, int arg1) {
        ++field660;
        int[] var3 = super.field5478.method2522(arg1, 16863);
        if (arg0 >= -74) {
            return null;
        } else {
            if (super.field5478.field6213) {
                int var4 = class492.field7258 * this.field649 >> 12;
                int[] var5 = this.method2275((byte) 114, 0, class423.field6453 & arg1 - 1);
                int[] var6 = this.method2275((byte) 89, 0, arg1);
                int[] var7 = this.method2275((byte) 76, 0, class423.field6453 & arg1 + 1);
                for (int var8 = 0; ~class531.field7814 < ~var8; ++var8) {
                    int var9 = (var7[var8] + -var5[var8]) * var4 >> 12;
                    int var10 = (var6[class179.field2409 & var8 + -1] + -var6[var8 + 1 & class179.field2409]) * var4 >> 12;
                    int var11 = var10 >> 4;
                    int var12 = var9 >> 4;
                    if (~var11 > -1) {
                        var11 = -var11;
                    }
                    if (~var11 < -256) {
                        var11 = 255;
                    }
                    if (~var12 > -1) {
                        var12 = -var12;
                    }
                    if (~var12 < -256) {
                        var12 = 255;
                    }
                    int var13 = 255 & class199.field2650[((var12 - -1) * var12 >> 1) + var11];
                    int var14 = var9 * var13 >> 8;
                    int var15 = var10 * var13 >> 8;
                    int var16 = var13 * 4096 >> 8;
                    int var17 = this.field651[2] * var16 >> 12;
                    int var18 = this.field651[1] * var14 >> 12;
                    int var19 = this.field651[0] * var15 >> 12;
                    var3[var8] = var18 + var19 + var17;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!qr", name = "<init>", descriptor = "()V")
    public class46() {
        super(1, true);
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(Lnj;II)V")
    public final void method272(class164 arg0, int arg1, int arg2) {
        if (arg2 != 1638) {
            field656 = null;
        }
        ++field658;
        if (arg1 != 0) {
            if (~arg1 != -2) {
                if (arg1 == 2) {
                    this.field650 = arg0.method1074(-635989152);
                }
            } else {
                this.field652 = arg0.method1074(arg2 ^ -635988730);
            }
        } else {
            this.field649 = arg0.method1074(-635989152);
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method361(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
