import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ng")
public class class226 {

    @OriginalMember(owner = "client!ng", name = "e", descriptor = "F")
    public float field3211 = 1.0F;

    @OriginalMember(owner = "client!ng", name = "k", descriptor = "F")
    public float field3217 = 1.0F;

    @OriginalMember(owner = "client!ng", name = "i", descriptor = "F")
    public float field3215 = 0.25F;

    @OriginalMember(owner = "client!ng", name = "q", descriptor = "I")
    public int field3223;

    @OriginalMember(owner = "client!ng", name = "l", descriptor = "I")
    public int field3218;

    @OriginalMember(owner = "client!ng", name = "r", descriptor = "F")
    public float field3224;

    @OriginalMember(owner = "client!ng", name = "d", descriptor = "I")
    public int field3210;

    @OriginalMember(owner = "client!ng", name = "m", descriptor = "F")
    public float field3219;

    @OriginalMember(owner = "client!ng", name = "j", descriptor = "F")
    public float field3216;

    @OriginalMember(owner = "client!ng", name = "c", descriptor = "I")
    public int field3209;

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "Lbi;")
    public class333 field3208;

    @OriginalMember(owner = "client!ng", name = "f", descriptor = "I")
    public int field3212;

    @OriginalMember(owner = "client!ng", name = "p", descriptor = "I")
    public int field3222;

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field3207 = new CRC32();

    @OriginalMember(owner = "client!ng", name = "o", descriptor = "Ljv;")
    public static class55 field3221 = new class55(4);

    @OriginalMember(owner = "client!ng", name = "g", descriptor = "I")
    public static int field3213;

    @OriginalMember(owner = "client!ng", name = "h", descriptor = "I")
    public static int field3214;

    @OriginalMember(owner = "client!ng", name = "n", descriptor = "I")
    public static int field3220;

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(Lcu;I)V")
    public final void method1481(class145 arg0, int arg1) {
        field3214++;
        this.field3211 = (float) (arg0.method1063((byte) -95) * 8) / 255.0F;
        this.field3215 = (float) (arg0.method1063((byte) -31) * 8) / 255.0F;
        this.field3217 = (float) (arg0.method1063((byte) -33) * 8) / 255.0F;
        if (arg1 != 2753) {
            field3207 = null;
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(Lng;I)Z")
    public final boolean method1482(class226 arg0, int arg1) {
        field3220++;
        if (arg1 >= -98) {
            method1483(88);
        }
        return this.field3210 == arg0.field3210 && this.field3224 == arg0.field3224 && this.field3216 == arg0.field3216 && this.field3219 == arg0.field3219 && this.field3215 == arg0.field3215 && this.field3211 == arg0.field3211 && this.field3217 == arg0.field3217 && this.field3222 == arg0.field3222 && this.field3209 == arg0.field3209 && this.field3208 == arg0.field3208;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(I)V")
    public static void method1483(int arg0) {
        if (arg0 > -96) {
            field3221 = null;
        }
        field3207 = null;
        field3221 = null;
    }

    @OriginalMember(owner = "client!ng", name = "<init>", descriptor = "()V")
    public class226() {
        this.field3223 = -60;
        this.field3218 = -50;
        this.field3224 = 1.1523438F;
        this.field3210 = class170.field2635;
        this.field3219 = 1.2F;
        this.field3216 = 0.69921875F;
        this.field3209 = 0;
        this.field3208 = class14.field226;
        this.field3212 = -50;
        this.field3222 = class175.field2682;
    }

    @OriginalMember(owner = "client!ng", name = "<init>", descriptor = "(Lcu;)V")
    public class226(class145 arg0) {
        int var2 = arg0.method1063((byte) 127);
        if (class443.field6623.method337(class169.field2624, (byte) 126) && class412.field6158.method293() > 0) {
            if ((var2 & 0x1) == 0) {
                this.field3210 = class170.field2635;
            } else {
                this.field3210 = arg0.method1070(-32387);
            }
            if ((var2 & 0x2) == 0) {
                this.field3224 = 1.1523438F;
            } else {
                this.field3224 = (float) arg0.method1069((byte) -53) / 256.0F;
            }
            if ((var2 & 0x4) == 0) {
                this.field3216 = 0.69921875F;
            } else {
                this.field3216 = (float) arg0.method1069((byte) -39) / 256.0F;
            }
            if ((var2 & 0x8) == 0) {
                this.field3219 = 1.2F;
            } else {
                this.field3219 = (float) arg0.method1069((byte) -61) / 256.0F;
            }
        } else {
            if ((var2 & 0x1) != 0) {
                arg0.method1070(-32387);
            }
            if ((var2 & 0x2) != 0) {
                arg0.method1069((byte) -19);
            }
            if ((var2 & 0x4) != 0) {
                arg0.method1069((byte) -32);
            }
            if ((var2 & 0x8) != 0) {
                arg0.method1069((byte) -80);
            }
            this.field3224 = 1.1523438F;
            this.field3219 = 1.2F;
            this.field3216 = 0.69921875F;
            this.field3210 = class170.field2635;
        }
        if ((var2 & 0x10) == 0) {
            this.field3223 = -60;
            this.field3218 = -50;
            this.field3212 = -50;
        } else {
            this.field3212 = arg0.method1122(65280);
            this.field3223 = arg0.method1122(65280);
            this.field3218 = arg0.method1122(65280);
        }
        if ((var2 & 0x20) == 0) {
            this.field3222 = class175.field2682;
        } else {
            this.field3222 = arg0.method1070(-32387);
        }
        if ((var2 & 0x40) == 0) {
            this.field3209 = 0;
        } else {
            this.field3209 = arg0.method1069((byte) -73);
        }
        if ((var2 & 0x80) == 0) {
            this.field3208 = class14.field226;
        } else {
            int var3 = arg0.method1069((byte) -117);
            int var4 = arg0.method1069((byte) -38);
            int var5 = arg0.method1069((byte) -45);
            int var6 = arg0.method1069((byte) -116);
            int var7 = arg0.method1069((byte) -15);
            int var8 = arg0.method1069((byte) -54);
            this.field3208 = class389.method2399(var8, var7, var6, var3, -1, var4, var5);
        }
    }
}
