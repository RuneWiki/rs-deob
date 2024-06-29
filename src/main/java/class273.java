import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hf")
public class class273 {

    @OriginalMember(owner = "client!hf", name = "d", descriptor = "I")
    public int field4169 = 0;

    @OriginalMember(owner = "client!hf", name = "q", descriptor = "I")
    public int field4182 = 0;

    @OriginalMember(owner = "client!hf", name = "p", descriptor = "Z")
    private boolean field4181 = false;

    @OriginalMember(owner = "client!hf", name = "e", descriptor = "Lob;")
    public static class521 field4170 = new class521(68, 2);

    @OriginalMember(owner = "client!hf", name = "r", descriptor = "[Ljava/awt/Rectangle;")
    public static Rectangle[] field4183 = new Rectangle[100];

    @OriginalMember(owner = "client!hf", name = "v", descriptor = "I")
    public static int field4187;

    @OriginalMember(owner = "client!hf", name = "u", descriptor = "Lak;")
    public static class234 field4186;

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "I")
    public static int field4166;

    @OriginalMember(owner = "client!hf", name = "c", descriptor = "I")
    public int field4168;

    @OriginalMember(owner = "client!hf", name = "f", descriptor = "I")
    public int field4171;

    @OriginalMember(owner = "client!hf", name = "g", descriptor = "I")
    public int field4172;

    @OriginalMember(owner = "client!hf", name = "h", descriptor = "I")
    public static int field4173;

    @OriginalMember(owner = "client!hf", name = "i", descriptor = "I")
    public int field4174;

    @OriginalMember(owner = "client!hf", name = "j", descriptor = "I")
    private int field4175;

    @OriginalMember(owner = "client!hf", name = "k", descriptor = "I")
    public static int field4176;

    @OriginalMember(owner = "client!hf", name = "l", descriptor = "I")
    public int field4177;

    @OriginalMember(owner = "client!hf", name = "m", descriptor = "I")
    public int field4178;

    @OriginalMember(owner = "client!hf", name = "n", descriptor = "I")
    public int field4179;

    @OriginalMember(owner = "client!hf", name = "o", descriptor = "I")
    public static int field4180;

    @OriginalMember(owner = "client!hf", name = "s", descriptor = "I")
    public int field4184;

    @OriginalMember(owner = "client!hf", name = "t", descriptor = "I")
    public int field4185;

    @OriginalMember(owner = "client!hf", name = "w", descriptor = "I")
    public static int field4188;

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "J")
    public long field4167;

    static {
        for (int var0 = 0; var0 < 100; var0++) {
            field4183[var0] = new Rectangle();
        }
        field4187 = -1;
        field4186 = new class234("Connecting to update server", "Verbindung mit Update-Server...", "Connexion au serveur de mise à jour en cours", "Conectando ao servidor de atualização");
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(I)V", line = 13)
    public static void method1798(int arg0) {
        int var1 = -98 % ((arg0 + 52) / 55);
        field4170 = null;
        field4186 = null;
        field4183 = null;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(ILhp;I)V", line = 28)
    private final void method1799(int arg0, class217 arg1, int arg2) {
        field4173++;
        if (arg0 == 1) {
            this.field4175 = arg1.method1511(97);
        } else if (arg0 == 2) {
            arg1.method1515((byte) 126);
        } else if (arg0 == 3) {
            this.field4177 = arg1.method1556(122);
            this.field4172 = arg1.method1556(arg2 ^ 0x5ADD);
            this.field4179 = arg1.method1556(126);
        } else if (arg0 == 4) {
            this.field4184 = arg1.method1515((byte) 123);
            this.field4168 = arg1.method1556(110);
        } else if (arg0 == 6) {
            this.field4178 = arg1.method1515((byte) 122);
        } else if (arg0 == 8) {
            this.field4169 = 1;
        } else if (arg0 == 9) {
            this.field4182 = 1;
        } else if (arg0 == 10) {
            this.field4181 = true;
        }
        if (arg2 != 23207) {
            this.method1800((byte) 13, null);
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(BLhp;)V", line = 88)
    public final void method1800(byte arg0, class217 arg1) {
        int var3 = 46 % ((arg0 - 39) / 54);
        field4180++;
        while (true) {
            int var4 = arg1.method1515((byte) 121);
            if (var4 == 0) {
                return;
            }
            this.method1799(var4, arg1, 23207);
        }
    }

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "(I)V", line = 113)
    public final void method1801(int arg0) {
        field4176++;
        this.field4174 = class281.field4279[this.field4175 << 3];
        if (arg0 != -3) {
            return;
        }
        this.field4171 = (int) Math.sqrt((double) (this.field4177 * this.field4177 + this.field4179 * this.field4179 + this.field4172 * this.field4172));
        if (this.field4168 == 0) {
            this.field4168 = 1;
        }
        if (this.field4184 == 0) {
            this.field4167 = 2147483647L;
        } else if (this.field4184 == 1) {
            this.field4167 = (this.field4171 * 8 / this.field4168);
            this.field4167 *= this.field4167;
        } else if (this.field4184 == 2) {
            this.field4167 = (this.field4171 * 8 / this.field4168);
        }
        if (this.field4181) {
            this.field4171 *= -1;
        }
    }
}
