import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public class class308 {

    @OriginalMember(owner = "client!ca", name = "m", descriptor = "F")
    public float field4187 = 0.25F;

    @OriginalMember(owner = "client!ca", name = "o", descriptor = "F")
    public float field4189 = 1.0F;

    @OriginalMember(owner = "client!ca", name = "q", descriptor = "F")
    public float field4191 = 1.0F;

    @OriginalMember(owner = "client!ca", name = "j", descriptor = "F")
    public float field4184;

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "I")
    public int field4176;

    @OriginalMember(owner = "client!ca", name = "i", descriptor = "Ldi;")
    public class128 field4183;

    @OriginalMember(owner = "client!ca", name = "n", descriptor = "I")
    public int field4188;

    @OriginalMember(owner = "client!ca", name = "g", descriptor = "I")
    public int field4181;

    @OriginalMember(owner = "client!ca", name = "f", descriptor = "I")
    public int field4180;

    @OriginalMember(owner = "client!ca", name = "l", descriptor = "I")
    public int field4186;

    @OriginalMember(owner = "client!ca", name = "d", descriptor = "I")
    public int field4178;

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "F")
    public float field4175;

    @OriginalMember(owner = "client!ca", name = "k", descriptor = "F")
    public float field4185;

    @OriginalMember(owner = "client!ca", name = "h", descriptor = "Lil;")
    public static class7 field4182 = new class7();

    @OriginalMember(owner = "client!ca", name = "p", descriptor = "[F")
    public static float[] field4190 = new float[2];

    @OriginalMember(owner = "client!ca", name = "c", descriptor = "I")
    public static int field4177;

    @OriginalMember(owner = "client!ca", name = "e", descriptor = "I")
    public static int field4179;

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(ILji;)V")
    public final void method1861(int arg0, class611 arg1) {
        this.field4191 = (float) (arg1.method3428((byte) 96) * 8) / 255.0F;
        field4179++;
        this.field4187 = (float) (arg1.method3428((byte) -122) * 8) / 255.0F;
        if (arg0 != -50) {
            this.method1861(-51, null);
        }
        this.field4189 = (float) (arg1.method3428((byte) 1) * 8) / 255.0F;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(I)V")
    public static void method1862(int arg0) {
        field4182 = null;
        field4190 = null;
        if (arg0 != -15136) {
            method1862(-41);
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(ZLca;)Z")
    public final boolean method1863(boolean arg0, class308 arg1) {
        if (arg0) {
            field4177++;
            return this.field4186 == arg1.field4186 && this.field4175 == arg1.field4175 && this.field4184 == arg1.field4184 && this.field4185 == arg1.field4185 && this.field4187 == arg1.field4187 && this.field4191 == arg1.field4191 && this.field4189 == arg1.field4189 && this.field4181 == arg1.field4181 && this.field4178 == arg1.field4178 && this.field4183 == arg1.field4183;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ca", name = "<init>", descriptor = "()V")
    public class308() {
        this.field4184 = 0.69921875F;
        this.field4176 = -50;
        this.field4183 = class267.field3537;
        this.field4188 = -50;
        this.field4181 = class63.field686;
        this.field4180 = -60;
        this.field4186 = class425.field5994;
        this.field4178 = 0;
        this.field4175 = 1.1523438F;
        this.field4185 = 1.2F;
    }

    @OriginalMember(owner = "client!ca", name = "<init>", descriptor = "(Lji;)V")
    public class308(class611 arg0) {
        int var2 = arg0.method3428((byte) -100);
        if (class11.field68.field5541.method3210((byte) 126) == 1 && class395.field5617.method455() > 0) {
            if ((var2 & 0x1) == 0) {
                this.field4186 = class425.field5994;
            } else {
                this.field4186 = arg0.method3418(-2);
            }
            if ((var2 & 0x2) == 0) {
                this.field4175 = 1.1523438F;
            } else {
                this.field4175 = (float) arg0.method3402((byte) 127) / 256.0F;
            }
            if ((var2 & 0x4) == 0) {
                this.field4184 = 0.69921875F;
            } else {
                this.field4184 = (float) arg0.method3402((byte) 127) / 256.0F;
            }
            if ((var2 & 0x8) == 0) {
                this.field4185 = 1.2F;
            } else {
                this.field4185 = (float) arg0.method3402((byte) 127) / 256.0F;
            }
        } else {
            if ((var2 & 0x1) != 0) {
                arg0.method3418(-2);
            }
            if ((var2 & 0x2) != 0) {
                arg0.method3402((byte) 127);
            }
            if ((var2 & 0x4) != 0) {
                arg0.method3402((byte) 127);
            }
            if ((var2 & 0x8) != 0) {
                arg0.method3402((byte) 127);
            }
            this.field4175 = 1.1523438F;
            this.field4185 = 1.2F;
            this.field4186 = class425.field5994;
            this.field4184 = 0.69921875F;
        }
        if ((var2 & 0x10) == 0) {
            this.field4180 = -60;
            this.field4188 = -50;
            this.field4176 = -50;
        } else {
            this.field4176 = arg0.method3413(false);
            this.field4180 = arg0.method3413(false);
            this.field4188 = arg0.method3413(false);
        }
        if ((var2 & 0x20) == 0) {
            this.field4181 = class63.field686;
        } else {
            this.field4181 = arg0.method3418(-2);
        }
        if ((var2 & 0x40) == 0) {
            this.field4178 = 0;
        } else {
            this.field4178 = arg0.method3402((byte) 127);
        }
        if ((var2 & 0x80) == 0) {
            this.field4183 = class267.field3537;
        } else {
            int var3 = arg0.method3402((byte) 127);
            int var4 = arg0.method3402((byte) 127);
            int var5 = arg0.method3402((byte) 127);
            int var6 = arg0.method3402((byte) 127);
            int var7 = arg0.method3402((byte) 127);
            int var8 = arg0.method3402((byte) 127);
            this.field4183 = class380.method2221(5, var6, var8, var7, var5, var3, var4);
        }
    }
}
