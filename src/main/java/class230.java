import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fd")
public class class230 {

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "I")
    public int field3901;

    @OriginalMember(owner = "client!fd", name = "j", descriptor = "I")
    public int field3909;

    @OriginalMember(owner = "client!fd", name = "k", descriptor = "I")
    public int field3910;

    @OriginalMember(owner = "client!fd", name = "m", descriptor = "I")
    public int field3912;

    @OriginalMember(owner = "client!fd", name = "p", descriptor = "F")
    public float field3915;

    @OriginalMember(owner = "client!fd", name = "f", descriptor = "F")
    public float field3905;

    @OriginalMember(owner = "client!fd", name = "g", descriptor = "I")
    public int field3906;

    @OriginalMember(owner = "client!fd", name = "e", descriptor = "F")
    public float field3904;

    @OriginalMember(owner = "client!fd", name = "i", descriptor = "I")
    public int field3908;

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "Lwa;")
    public static class75 field3900 = class66.method560("Sie k-Onnen sich selbst nicht selbst auf Ihre Ignorieren)2Liste setzen(Q", false);

    @OriginalMember(owner = "client!fd", name = "n", descriptor = "Lwa;")
    public static class75 field3913 = class66.method560("loginscreen", false);

    @OriginalMember(owner = "client!fd", name = "h", descriptor = "I")
    public static int field3907 = 0;

    @OriginalMember(owner = "client!fd", name = "l", descriptor = "[I")
    public static int[] field3911 = new int[128];

    @OriginalMember(owner = "client!fd", name = "c", descriptor = "I")
    public static int field3902;

    @OriginalMember(owner = "client!fd", name = "d", descriptor = "I")
    public static int field3903;

    @OriginalMember(owner = "client!fd", name = "o", descriptor = "Lcb;")
    public static class267 field3914;

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(B)V", line = 11)
    public static void method1682(byte arg0) {
        field3900 = null;
        field3914 = null;
        if (arg0 != 93) {
            field3900 = (class75) null;
        }
        field3913 = null;
        field3911 = null;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(Lre;I)V", line = 29)
    public static final void method1683(class262 arg0, int arg1) {
        field3902++;
        int var2 = arg0.field4462;
        if (var2 == 324) {
            if (class233.field3939 == -1) {
                class75.field1284 = arg0.field4537;
                class233.field3939 = arg0.field4444;
            }
            if (class306.field5231.field3778) {
                arg0.field4444 = class233.field3939;
            } else {
                arg0.field4444 = class75.field1284;
            }
        } else if (var2 == 325) {
            if (class233.field3939 == -1) {
                class75.field1284 = arg0.field4537;
                class233.field3939 = arg0.field4444;
            }
            if (class306.field5231.field3778) {
                arg0.field4444 = class75.field1284;
            } else {
                arg0.field4444 = class233.field3939;
            }
        } else if (var2 == 327) {
            arg0.field4477 = 150;
            arg0.field4390 = (int) (Math.sin((double) class143.field2463 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field4535 = -1;
            arg0.field4467 = 5;
        } else if (var2 == 328) {
            if (class279.field4831.field1561 == null) {
                arg0.field4535 = 0;
            } else {
                arg0.field4477 = 150;
                arg0.field4390 = (int) (Math.sin((double) class143.field2463 / 40.0D) * 256.0D) & 0x7FF;
                arg0.field4467 = 5;
                arg0.field4535 = ((int) class279.field4831.field1561.method630(-93) << 11) + 2047;
                arg0.field4447 = class279.field4831.field3215;
                arg0.field4505 = class279.field4831.field3248;
            }
        } else if (arg1 > -45) {
            field3913 = (class75) null;
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(III)J", line = 103)
    public static final long method1684(int arg0, int arg1, int arg2) {
        class242 var3 = class271.field4681[arg0][arg1][arg2];
        return var3 == null || var3.field4098 == null ? 0L : var3.field4098.field2814;
    }

    @OriginalMember(owner = "client!fd", name = "<init>", descriptor = "()V", line = 132)
    public class230() {
        this.field3901 = class239.field4037;
        this.field3909 = -50;
        this.field3910 = -50;
        this.field3912 = class239.field4044;
        this.field3915 = 1.1523438F;
        this.field3905 = 1.2F;
        this.field3906 = 0;
        this.field3904 = 0.69921875F;
        this.field3908 = -60;
    }

    @OriginalMember(owner = "client!fd", name = "<init>", descriptor = "(Lja;)V", line = 147)
    public class230(class60 arg0) {
        int var2 = arg0.method501(0);
        if ((var2 & 0x1) == 0) {
            this.field3901 = class239.field4037;
        } else {
            this.field3901 = arg0.method505(255);
        }
        if ((var2 & 0x2) == 0) {
            this.field3915 = 1.1523438F;
        } else {
            this.field3915 = (float) arg0.method485((byte) -2) / 256.0F;
        }
        if ((var2 & 0x4) == 0) {
            this.field3904 = 0.69921875F;
        } else {
            this.field3904 = (float) arg0.method485((byte) -2) / 256.0F;
        }
        if ((var2 & 0x8) == 0) {
            this.field3905 = 1.2F;
        } else {
            this.field3905 = (float) arg0.method485((byte) -2) / 256.0F;
        }
        if ((var2 & 0x10) == 0) {
            this.field3910 = -50;
            this.field3909 = -50;
            this.field3908 = -60;
        } else {
            this.field3909 = arg0.method487((byte) -127);
            this.field3908 = arg0.method487((byte) -102);
            this.field3910 = arg0.method487((byte) -87);
        }
        if ((var2 & 0x20) == 0) {
            this.field3912 = class239.field4044;
        } else {
            this.field3912 = arg0.method505(255);
        }
        if ((var2 & 0x40) == 0) {
            this.field3906 = 0;
        } else {
            this.field3906 = arg0.method485((byte) -2);
        }
    }
}
