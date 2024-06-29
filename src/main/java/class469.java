import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public class class469 {

    @OriginalMember(owner = "client!pb", name = "e", descriptor = "F")
    public float field6946 = 0.25F;

    @OriginalMember(owner = "client!pb", name = "f", descriptor = "F")
    public float field6947 = 1.0F;

    @OriginalMember(owner = "client!pb", name = "l", descriptor = "F")
    public float field6953 = 1.0F;

    @OriginalMember(owner = "client!pb", name = "n", descriptor = "I")
    public int field6955;

    @OriginalMember(owner = "client!pb", name = "r", descriptor = "I")
    public int field6959;

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "F")
    public float field6942;

    @OriginalMember(owner = "client!pb", name = "i", descriptor = "Lqg;")
    public class325 field6950;

    @OriginalMember(owner = "client!pb", name = "q", descriptor = "I")
    public int field6958;

    @OriginalMember(owner = "client!pb", name = "o", descriptor = "I")
    public int field6956;

    @OriginalMember(owner = "client!pb", name = "c", descriptor = "I")
    public int field6944;

    @OriginalMember(owner = "client!pb", name = "h", descriptor = "F")
    public float field6949;

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "I")
    public int field6943;

    @OriginalMember(owner = "client!pb", name = "p", descriptor = "F")
    public float field6957;

    @OriginalMember(owner = "client!pb", name = "g", descriptor = "D")
    public static double field6948 = -1.0D;

    @OriginalMember(owner = "client!pb", name = "d", descriptor = "I")
    public static int field6945;

    @OriginalMember(owner = "client!pb", name = "j", descriptor = "I")
    public static int field6951;

    @OriginalMember(owner = "client!pb", name = "k", descriptor = "I")
    public static int field6952;

    @OriginalMember(owner = "client!pb", name = "m", descriptor = "I")
    public static int field6954;

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(ILnn;)V")
    public final void method2802(int arg0, class289 arg1) {
        if (arg0 != 0) {
            method2803(-64, 53);
        }
        field6954++;
        this.field6947 = (float) (arg1.method1858(-3256) * 8) / 255.0F;
        this.field6946 = (float) (arg1.method1858(arg0 - 3256) * 8) / 255.0F;
        this.field6953 = (float) (arg1.method1858(-3256) * 8) / 255.0F;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(II)I")
    public static final int method2803(int arg0, int arg1) {
        field6945++;
        if (arg1 < 96) {
            return 0;
        } else if (arg1 < 128) {
            return 2;
        } else {
            if (arg0 != 32) {
                method2803(-60, -21);
            }
            return 3;
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(Lpb;I)Z")
    public final boolean method2804(class469 arg0, int arg1) {
        field6952++;
        if (arg1 != 28936) {
            method2803(13, -60);
        }
        return this.field6958 == arg0.field6958 && this.field6957 == arg0.field6957 && this.field6942 == arg0.field6942 && this.field6949 == arg0.field6949 && this.field6946 == arg0.field6946 && this.field6947 == arg0.field6947 && this.field6953 == arg0.field6953 && this.field6944 == arg0.field6944 && this.field6943 == arg0.field6943 && this.field6950 == arg0.field6950;
    }

    @OriginalMember(owner = "client!pb", name = "<init>", descriptor = "()V")
    public class469() {
        this.field6955 = -50;
        this.field6959 = -50;
        this.field6942 = 0.69921875F;
        this.field6950 = class435.field6470;
        this.field6958 = class107.field1979;
        this.field6956 = -60;
        this.field6944 = class320.field4898;
        this.field6949 = 1.2F;
        this.field6943 = 0;
        this.field6957 = 1.1523438F;
    }

    @OriginalMember(owner = "client!pb", name = "<init>", descriptor = "(Lnn;)V")
    public class469(class289 arg0) {
        int var2 = arg0.method1858(-3256);
        if (class186.field2990.method1129(0, class133.field2236) && client.field3213.method403() > 0) {
            if ((var2 & 0x1) == 0) {
                this.field6958 = class107.field1979;
            } else {
                this.field6958 = arg0.method1815((byte) -102);
            }
            if ((var2 & 0x2) == 0) {
                this.field6957 = 1.1523438F;
            } else {
                this.field6957 = (float) arg0.method1841((byte) -121) / 256.0F;
            }
            if ((var2 & 0x4) == 0) {
                this.field6942 = 0.69921875F;
            } else {
                this.field6942 = (float) arg0.method1841((byte) -120) / 256.0F;
            }
            if ((var2 & 0x8) == 0) {
                this.field6949 = 1.2F;
            } else {
                this.field6949 = (float) arg0.method1841((byte) 43) / 256.0F;
            }
        } else {
            if ((var2 & 0x1) != 0) {
                arg0.method1815((byte) -91);
            }
            if ((var2 & 0x2) != 0) {
                arg0.method1841((byte) 52);
            }
            if ((var2 & 0x4) != 0) {
                arg0.method1841((byte) 8);
            }
            if ((var2 & 0x8) != 0) {
                arg0.method1841((byte) -120);
            }
            this.field6949 = 1.2F;
            this.field6942 = 0.69921875F;
            this.field6957 = 1.1523438F;
            this.field6958 = class107.field1979;
        }
        if ((var2 & 0x10) == 0) {
            this.field6955 = -50;
            this.field6956 = -60;
            this.field6959 = -50;
        } else {
            this.field6959 = arg0.method1848((byte) 117);
            this.field6956 = arg0.method1848((byte) 121);
            this.field6955 = arg0.method1848((byte) 123);
        }
        if ((var2 & 0x20) == 0) {
            this.field6944 = class320.field4898;
        } else {
            this.field6944 = arg0.method1815((byte) -74);
        }
        if ((var2 & 0x40) == 0) {
            this.field6943 = 0;
        } else {
            this.field6943 = arg0.method1841((byte) -123);
        }
        if ((var2 & 0x80) == 0) {
            this.field6950 = class435.field6470;
        } else {
            int var3 = arg0.method1841((byte) 118);
            int var4 = arg0.method1841((byte) 10);
            int var5 = arg0.method1841((byte) -120);
            int var6 = arg0.method1841((byte) 111);
            int var7 = arg0.method1841((byte) 42);
            int var8 = arg0.method1841((byte) -121);
            this.field6950 = class181.method1240(var5, 89, var7, var8, var6, var3, var4);
        }
    }
}
