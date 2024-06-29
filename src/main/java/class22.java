import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public class class22 {

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "F")
    public float field205 = 1.0F;

    @OriginalMember(owner = "client!cd", name = "g", descriptor = "F")
    public float field211 = 1.0F;

    @OriginalMember(owner = "client!cd", name = "c", descriptor = "F")
    public float field207 = 0.25F;

    @OriginalMember(owner = "client!cd", name = "l", descriptor = "I")
    public int field216;

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "F")
    public float field206;

    @OriginalMember(owner = "client!cd", name = "k", descriptor = "I")
    public int field215;

    @OriginalMember(owner = "client!cd", name = "o", descriptor = "I")
    public int field219;

    @OriginalMember(owner = "client!cd", name = "e", descriptor = "I")
    public int field209;

    @OriginalMember(owner = "client!cd", name = "f", descriptor = "Lvm;")
    public class72 field210;

    @OriginalMember(owner = "client!cd", name = "h", descriptor = "I")
    public int field212;

    @OriginalMember(owner = "client!cd", name = "m", descriptor = "I")
    public int field217;

    @OriginalMember(owner = "client!cd", name = "i", descriptor = "F")
    public float field213;

    @OriginalMember(owner = "client!cd", name = "p", descriptor = "F")
    public float field220;

    @OriginalMember(owner = "client!cd", name = "d", descriptor = "[C")
    private static char[] field208 = new char[64];

    @OriginalMember(owner = "client!cd", name = "j", descriptor = "I")
    public static int field214;

    @OriginalMember(owner = "client!cd", name = "n", descriptor = "I")
    public static int field218;

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(BLcd;)Z")
    public final boolean method118(byte arg0, class22 arg1) {
        field214++;
        int var3 = -128 % ((arg0 - 53) / 55);
        return this.field215 == arg1.field215 && this.field220 == arg1.field220 && this.field213 == arg1.field213 && this.field206 == arg1.field206 && this.field207 == arg1.field207 && this.field205 == arg1.field205 && this.field211 == arg1.field211 && this.field209 == arg1.field209 && this.field217 == arg1.field217 && this.field210 == arg1.field210;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(B)V")
    public static void method119(byte arg0) {
        if (arg0 <= 59) {
            method119((byte) -51);
        }
        field208 = null;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(JJ)J")
    public static long method120(long arg0, long arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(ILofa;)V")
    public final void method121(int arg0, class301 arg1) {
        field218++;
        this.field205 = (float) (arg1.method1987(-115) * 8) / 255.0F;
        this.field207 = (float) (arg1.method1987(-79) * 8) / 255.0F;
        this.field211 = (float) (arg1.method1987(arg0 + 5426) * 8) / 255.0F;
        if (arg0 != -5491) {
            this.method121(103, null);
        }
    }

    @OriginalMember(owner = "client!cd", name = "<init>", descriptor = "()V")
    public class22() {
        this.field216 = -50;
        this.field206 = 1.2F;
        this.field215 = class285.field4393;
        this.field219 = -60;
        this.field209 = class711.field10008;
        this.field210 = class142.field2217;
        this.field212 = -50;
        this.field217 = 0;
        this.field213 = 0.69921875F;
        this.field220 = 1.1523438F;
    }

    @OriginalMember(owner = "client!cd", name = "<init>", descriptor = "(Lofa;)V")
    public class22(class301 arg0) {
        int var2 = arg0.method1987(-67);
        if (class654.field9289.field5447.method4104(3) == 1 && class565.field8015.method356() > 0) {
            if ((var2 & 0x1) == 0) {
                this.field215 = class285.field4393;
            } else {
                this.field215 = arg0.method1934(-2);
            }
            if ((var2 & 0x2) == 0) {
                this.field220 = 1.1523438F;
            } else {
                this.field220 = (float) arg0.method1989((byte) -55) / 256.0F;
            }
            if ((var2 & 0x4) == 0) {
                this.field213 = 0.69921875F;
            } else {
                this.field213 = (float) arg0.method1989((byte) -57) / 256.0F;
            }
            if ((var2 & 0x8) == 0) {
                this.field206 = 1.2F;
            } else {
                this.field206 = (float) arg0.method1989((byte) -127) / 256.0F;
            }
        } else {
            if ((var2 & 0x1) != 0) {
                arg0.method1934(-2);
            }
            if ((var2 & 0x2) != 0) {
                arg0.method1989((byte) -112);
            }
            if ((var2 & 0x4) != 0) {
                arg0.method1989((byte) -112);
            }
            if ((var2 & 0x8) != 0) {
                arg0.method1989((byte) -113);
            }
            this.field213 = 0.69921875F;
            this.field220 = 1.1523438F;
            this.field215 = class285.field4393;
            this.field206 = 1.2F;
        }
        if ((var2 & 0x10) == 0) {
            this.field212 = -50;
            this.field219 = -60;
            this.field216 = -50;
        } else {
            this.field212 = arg0.method1977((byte) 66);
            this.field219 = arg0.method1977((byte) -126);
            this.field216 = arg0.method1977((byte) 120);
        }
        if ((var2 & 0x20) == 0) {
            this.field209 = class711.field10008;
        } else {
            this.field209 = arg0.method1934(-2);
        }
        if ((var2 & 0x40) == 0) {
            this.field217 = 0;
        } else {
            this.field217 = arg0.method1989((byte) -79);
        }
        if ((var2 & 0x80) == 0) {
            this.field210 = class142.field2217;
        } else {
            int var3 = arg0.method1989((byte) -70);
            int var4 = arg0.method1989((byte) -86);
            int var5 = arg0.method1989((byte) -87);
            int var6 = arg0.method1989((byte) -73);
            int var7 = arg0.method1989((byte) -78);
            int var8 = arg0.method1989((byte) -61);
            this.field210 = class426.method2660(var8, var5, var6, var3, (byte) 119, var7, var4);
        }
    }

    static {
        for (int var0 = 0; var0 < 26; var0++) {
            field208[var0] = (char) (var0 + 65);
        }
        for (int var1 = 26; var1 < 52; var1++) {
            field208[var1] = (char) (var1 + 71);
        }
        for (int var2 = 52; var2 < 62; var2++) {
            field208[var2] = (char) (var2 + 48 - 52);
        }
        field208[63] = '-';
        field208[62] = '*';
    }
}
