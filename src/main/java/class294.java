import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qh")
public class class294 extends class371 {

    @OriginalMember(owner = "client!qh", name = "N", descriptor = "I")
    private int field4313 = 1;

    @OriginalMember(owner = "client!qh", name = "O", descriptor = "I")
    private int field4314 = 0;

    @OriginalMember(owner = "client!qh", name = "M", descriptor = "I")
    private int field4312 = 0;

    @OriginalMember(owner = "client!qh", name = "K", descriptor = "Lqu;")
    public static class364 field4310 = new class364(62, 11);

    @OriginalMember(owner = "client!qh", name = "R", descriptor = "Lnj;")
    public static class487 field4317 = new class487("Your ignore list is full, max of 100.", "Deine Ignorieren-Liste ist voll, du kannst nur 100 Spieler darauf eintragen.", "Votre liste noire est pleine (100 noms maximum).", "Sua lista de ignorados está cheia. O máx. é 100.");

    @OriginalMember(owner = "client!qh", name = "Q", descriptor = "F")
    public static float field4316;

    @OriginalMember(owner = "client!qh", name = "I", descriptor = "I")
    public static int field4308;

    @OriginalMember(owner = "client!qh", name = "J", descriptor = "I")
    public static int field4309;

    @OriginalMember(owner = "client!qh", name = "L", descriptor = "I")
    public static int field4311;

    @OriginalMember(owner = "client!qh", name = "P", descriptor = "I")
    public static int field4315;

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(IBLps;)V", line = 7)
    public final void method81(int arg0, byte arg1, class428 arg2) {
        int var4 = -57 / ((arg1 - -15) / 39);
        if (~arg0 != -1) {
            if (~arg0 != -2) {
                if (arg0 == 3) {
                    this.field4313 = arg2.method2561((byte) -70);
                }
            } else {
                this.field4312 = arg2.method2561((byte) -69);
            }
        } else {
            this.field4314 = arg2.method2561((byte) 113);
        }
        ++field4311;
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(I)V", line = 51)
    public final void method212(int arg0) {
        class568.method3315(false);
        ++field4315;
        if (arg0 != -19103) {
            method1826(125, (byte) -102, -4);
        }
    }

    @OriginalMember(owner = "client!qh", name = "b", descriptor = "(IBI)V", line = 66)
    public static final void method1826(int arg0, byte arg1, int arg2) {
        class165.method1046(-3466, class469.field7121);
        ++class25.field233;
        ++field4309;
        class221.field3268.method2623(arg0, 1323018352);
        class221.field3268.method2608(arg2, (byte) 86);
        int var3 = 20 % ((arg1 - -70) / 52);
    }

    @OriginalMember(owner = "client!qh", name = "<init>", descriptor = "()V", line = 100)
    public class294() {
        super(0, true);
    }

    @OriginalMember(owner = "client!qh", name = "g", descriptor = "(I)V", line = 89)
    public static void method1827(int arg0) {
        field4317 = null;
        field4310 = null;
        if (arg0 != -2048) {
            field4317 = null;
        }
    }

    @OriginalMember(owner = "client!qh", name = "b", descriptor = "(BI)[I", line = 107)
    public final int[] method79(byte arg0, int arg1) {
        ++field4308;
        int[] var3 = super.field5378.method1451(63, arg1);
        if (arg0 > -80) {
            field4317 = null;
        }
        if (super.field5378.field3254) {
            int var4 = class614.field9004[arg1];
            int var5 = var4 + -2048 >> 1;
            for (int var6 = 0; ~class41.field455 < ~var6; ++var6) {
                int var7 = class287.field4215[var6];
                int var8 = var7 + -2048 >> 1;
                int var9;
                if (~this.field4314 == -1) {
                    var9 = (var7 - var4) * this.field4313;
                } else {
                    int var10 = var8 * var8 - -(var5 * var5) >> 12;
                    int var11 = (int) (4096.0D * Math.sqrt((double) ((float) var10 / 4096.0F)));
                    var9 = (int) ((double) (this.field4313 * var11) * 3.141592653589793D);
                }
                int var12 = var9 - (var9 & -4096);
                if (~this.field4312 == -1) {
                    var12 = class212.field3118[255 & var12 >> 4] + 4096 >> 1;
                } else if (this.field4312 == 2) {
                    var12 -= 2048;
                    if (~var12 > -1) {
                        var12 = -var12;
                    }
                    var12 = -var12 + 2048 << 1;
                }
                var3[var6] = var12;
            }
        }
        return var3;
    }
}
