import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rca")
public class class34 {

    @OriginalMember(owner = "client!rca", name = "h", descriptor = "F")
    public float field475 = 1.0F;

    @OriginalMember(owner = "client!rca", name = "i", descriptor = "F")
    public float field476 = 0.25F;

    @OriginalMember(owner = "client!rca", name = "p", descriptor = "F")
    public float field483 = 1.0F;

    @OriginalMember(owner = "client!rca", name = "c", descriptor = "I")
    public int field470;

    @OriginalMember(owner = "client!rca", name = "q", descriptor = "Lit;")
    public class513 field484;

    @OriginalMember(owner = "client!rca", name = "n", descriptor = "I")
    public int field481;

    @OriginalMember(owner = "client!rca", name = "o", descriptor = "I")
    public int field482;

    @OriginalMember(owner = "client!rca", name = "e", descriptor = "F")
    public float field472;

    @OriginalMember(owner = "client!rca", name = "l", descriptor = "I")
    public int field479;

    @OriginalMember(owner = "client!rca", name = "j", descriptor = "I")
    public int field477;

    @OriginalMember(owner = "client!rca", name = "f", descriptor = "F")
    public float field473;

    @OriginalMember(owner = "client!rca", name = "g", descriptor = "F")
    public float field474;

    @OriginalMember(owner = "client!rca", name = "a", descriptor = "I")
    public int field468;

    @OriginalMember(owner = "client!rca", name = "d", descriptor = "Ltt;")
    public static class338 field471 = new class338(6, 8);

    @OriginalMember(owner = "client!rca", name = "r", descriptor = "[C")
    public static char[] field485 = new char[] { ' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß' };

    @OriginalMember(owner = "client!rca", name = "s", descriptor = "I")
    public static int field486 = -1;

    @OriginalMember(owner = "client!rca", name = "u", descriptor = "I")
    public static int field488 = 0;

    @OriginalMember(owner = "client!rca", name = "v", descriptor = "Z")
    public static boolean field489 = false;

    @OriginalMember(owner = "client!rca", name = "t", descriptor = "F")
    public static float field487;

    @OriginalMember(owner = "client!rca", name = "b", descriptor = "I")
    public static int field469;

    @OriginalMember(owner = "client!rca", name = "k", descriptor = "I")
    public static int field478;

    @OriginalMember(owner = "client!rca", name = "m", descriptor = "I")
    public static int field480;

    @OriginalMember(owner = "client!rca", name = "a", descriptor = "(BLrca;)Z", line = 10)
    public final boolean method200(byte arg0, class34 arg1) {
        if (arg0 <= 44) {
            return true;
        } else {
            field478++;
            return this.field479 == arg1.field479 && this.field474 == arg1.field474 && this.field473 == arg1.field473 && this.field472 == arg1.field472 && this.field476 == arg1.field476 && this.field475 == arg1.field475 && this.field483 == arg1.field483 && this.field470 == arg1.field470 && this.field477 == arg1.field477 && this.field484 == arg1.field484;
        }
    }

    @OriginalMember(owner = "client!rca", name = "a", descriptor = "(ILio;)V", line = 27)
    public final void method201(int arg0, class157 arg1) {
        this.field475 = (float) (arg1.method930(255) * 8) / 255.0F;
        field480++;
        this.field476 = (float) (arg1.method930(255) * 8) / 255.0F;
        this.field483 = (float) (arg1.method930(255) * 8) / 255.0F;
        if (arg0 > -106) {
            this.field472 = -1.0225197F;
        }
    }

    @OriginalMember(owner = "client!rca", name = "<init>", descriptor = "()V", line = 69)
    public class34() {
        this.field470 = class129.field1801;
        this.field484 = class59.field745;
        this.field481 = -50;
        this.field482 = -50;
        this.field472 = 1.2F;
        this.field479 = class381.field5038;
        this.field477 = 0;
        this.field473 = 0.69921875F;
        this.field474 = 1.1523438F;
        this.field468 = -60;
    }

    @OriginalMember(owner = "client!rca", name = "<init>", descriptor = "(Lio;)V", line = 92)
    public class34(class157 arg0) {
        int var2 = arg0.method930(255);
        if (class602.field8408.method1868(class618.field8566, 1) && class610.field8468.method1133() > 0) {
            if ((var2 & 0x1) == 0) {
                this.field479 = class381.field5038;
            } else {
                this.field479 = arg0.method908(false);
            }
            if ((var2 & 0x2) == 0) {
                this.field474 = 1.1523438F;
            } else {
                this.field474 = (float) arg0.method963(-128) / 256.0F;
            }
            if ((var2 & 0x4) == 0) {
                this.field473 = 0.69921875F;
            } else {
                this.field473 = (float) arg0.method963(-128) / 256.0F;
            }
            if ((var2 & 0x8) == 0) {
                this.field472 = 1.2F;
            } else {
                this.field472 = (float) arg0.method963(-126) / 256.0F;
            }
        } else {
            if ((var2 & 0x1) != 0) {
                arg0.method908(false);
            }
            if ((var2 & 0x2) != 0) {
                arg0.method963(-128);
            }
            if ((var2 & 0x4) != 0) {
                arg0.method963(-126);
            }
            if ((var2 & 0x8) != 0) {
                arg0.method963(-122);
            }
            this.field474 = 1.1523438F;
            this.field473 = 0.69921875F;
            this.field479 = class381.field5038;
            this.field472 = 1.2F;
        }
        if ((var2 & 0x10) == 0) {
            this.field481 = -50;
            this.field468 = -60;
            this.field482 = -50;
        } else {
            this.field482 = arg0.method928(2016790224);
            this.field468 = arg0.method928(2016790224);
            this.field481 = arg0.method928(2016790224);
        }
        if ((var2 & 0x20) == 0) {
            this.field470 = class129.field1801;
        } else {
            this.field470 = arg0.method908(false);
        }
        if ((var2 & 0x40) == 0) {
            this.field477 = 0;
        } else {
            this.field477 = arg0.method963(-122);
        }
        if ((var2 & 0x80) == 0) {
            this.field484 = class59.field745;
        } else {
            int var3 = arg0.method963(-126);
            int var4 = arg0.method963(-123);
            int var5 = arg0.method963(-119);
            int var6 = arg0.method963(-118);
            int var7 = arg0.method963(-127);
            int var8 = arg0.method963(-126);
            this.field484 = class509.method2887(var4, var7, (byte) -19, var3, var6, var8, var5);
        }
    }

    @OriginalMember(owner = "client!rca", name = "a", descriptor = "(I)V", line = 48)
    public static void method202(int arg0) {
        field471 = null;
        field485 = null;
        int var1 = 117 / ((arg0 - 27) / 46);
    }
}
