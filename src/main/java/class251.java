import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mn")
public class class251 {

    @OriginalMember(owner = "client!mn", name = "f", descriptor = "F")
    public float field3739 = 0.25F;

    @OriginalMember(owner = "client!mn", name = "k", descriptor = "F")
    public float field3744 = 1.0F;

    @OriginalMember(owner = "client!mn", name = "n", descriptor = "F")
    public float field3747 = 1.0F;

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "I")
    public int field3734;

    @OriginalMember(owner = "client!mn", name = "l", descriptor = "F")
    public float field3745;

    @OriginalMember(owner = "client!mn", name = "d", descriptor = "I")
    public int field3737;

    @OriginalMember(owner = "client!mn", name = "e", descriptor = "I")
    public int field3738;

    @OriginalMember(owner = "client!mn", name = "p", descriptor = "I")
    public int field3749;

    @OriginalMember(owner = "client!mn", name = "o", descriptor = "I")
    public int field3748;

    @OriginalMember(owner = "client!mn", name = "c", descriptor = "F")
    public float field3736;

    @OriginalMember(owner = "client!mn", name = "b", descriptor = "I")
    public int field3735;

    @OriginalMember(owner = "client!mn", name = "g", descriptor = "Lud;")
    public class27 field3740;

    @OriginalMember(owner = "client!mn", name = "h", descriptor = "F")
    public float field3741;

    @OriginalMember(owner = "client!mn", name = "q", descriptor = "Lhm;")
    public static class150 field3750 = null;

    @OriginalMember(owner = "client!mn", name = "j", descriptor = "I")
    public static int field3743;

    @OriginalMember(owner = "client!mn", name = "m", descriptor = "I")
    public static int field3746;

    @OriginalMember(owner = "client!mn", name = "r", descriptor = "I")
    public static int field3751;

    @OriginalMember(owner = "client!mn", name = "s", descriptor = "I")
    public static int field3752;

    @OriginalMember(owner = "client!mn", name = "i", descriptor = "Lhp;")
    public static class219 field3742;

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(I)V", line = 4)
    public static void method1632(int arg0) {
        field3742 = null;
        field3750 = null;
        int var1 = 18 / ((arg0 + 65) / 38);
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(IIIII)V", line = 19)
    public static final void method1633(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3743++;
        class45 var5 = class354.method2094(arg3, (byte) -72, 10);
        var5.method260(arg2 + 9180);
        var5.field516 = arg4;
        var5.field504 = arg0;
        var5.field510 = arg1;
        if (arg2 != 8) {
            field3750 = null;
        }
    }

    @OriginalMember(owner = "client!mn", name = "b", descriptor = "(IIIII)V", line = 40)
    public static final void method1634(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3746++;
        if (arg0 != -692) {
            field3742 = null;
        }
        if (class4.field81.field1423 != 0 && arg1 != 0 && class10.field140 < 50 && arg2 != -1) {
            class289.field4229[class10.field140++] = new class78((byte) 2, arg2, arg1, arg4, arg3, 0);
        }
    }

    @OriginalMember(owner = "client!mn", name = "<init>", descriptor = "()V", line = 110)
    public class251() {
        this.field3734 = 0;
        this.field3745 = 1.2F;
        this.field3737 = -50;
        this.field3738 = -50;
        this.field3749 = class184.field2662;
        this.field3748 = class332.field4832;
        this.field3736 = 0.69921875F;
        this.field3735 = -60;
        this.field3740 = class478.field6660;
        this.field3741 = 1.1523438F;
    }

    @OriginalMember(owner = "client!mn", name = "<init>", descriptor = "(Lwm;)V", line = 126)
    public class251(class403 arg0) {
        int var2 = arg0.method2357((byte) 104);
        if (class4.field81.method728(false, class405.field5737) && class134.field1759.method371() > 0) {
            if ((var2 & 0x1) == 0) {
                this.field3749 = class184.field2662;
            } else {
                this.field3749 = arg0.method2319((byte) 104);
            }
            if ((var2 & 0x2) == 0) {
                this.field3741 = 1.1523438F;
            } else {
                this.field3741 = (float) arg0.method2338(0) / 256.0F;
            }
            if ((var2 & 0x4) == 0) {
                this.field3736 = 0.69921875F;
            } else {
                this.field3736 = (float) arg0.method2338(0) / 256.0F;
            }
            if ((var2 & 0x8) == 0) {
                this.field3745 = 1.2F;
            } else {
                this.field3745 = (float) arg0.method2338(0) / 256.0F;
            }
        } else {
            if ((var2 & 0x1) != 0) {
                arg0.method2319((byte) 111);
            }
            if ((var2 & 0x2) != 0) {
                arg0.method2338(0);
            }
            if ((var2 & 0x4) != 0) {
                arg0.method2338(0);
            }
            if ((var2 & 0x8) != 0) {
                arg0.method2338(0);
            }
            this.field3749 = class184.field2662;
            this.field3741 = 1.1523438F;
            this.field3736 = 0.69921875F;
            this.field3745 = 1.2F;
        }
        if ((var2 & 0x10) == 0) {
            this.field3737 = -50;
            this.field3738 = -50;
            this.field3735 = -60;
        } else {
            this.field3738 = arg0.method2371(7162);
            this.field3735 = arg0.method2371(7162);
            this.field3737 = arg0.method2371(7162);
        }
        if ((var2 & 0x20) == 0) {
            this.field3748 = class332.field4832;
        } else {
            this.field3748 = arg0.method2319((byte) 81);
        }
        if ((var2 & 0x40) == 0) {
            this.field3734 = 0;
        } else {
            this.field3734 = arg0.method2338(0);
        }
        if ((var2 & 0x80) == 0) {
            this.field3740 = class478.field6660;
        } else {
            int var3 = arg0.method2338(0);
            int var4 = arg0.method2338(0);
            int var5 = arg0.method2338(0);
            int var6 = arg0.method2338(0);
            int var7 = arg0.method2338(0);
            int var8 = arg0.method2338(0);
            this.field3740 = class101.method701(var4, var8, var6, var3, (byte) 114, var7, var5);
        }
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(Lwm;I)V", line = 66)
    public final void method1635(class403 arg0, int arg1) {
        if (arg1 != 21522) {
            field3742 = null;
        }
        this.field3744 = (float) (arg0.method2357((byte) 113) * 8) / 255.0F;
        field3751++;
        this.field3739 = (float) (arg0.method2357((byte) 125) * 8) / 255.0F;
        this.field3747 = (float) (arg0.method2357((byte) 119) * 8) / 255.0F;
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(ILmn;)Z", line = 100)
    public final boolean method1636(int arg0, class251 arg1) {
        field3752++;
        if (arg0 != 4) {
            method1633(28, 67, 7, -81, 58);
        }
        return this.field3749 == arg1.field3749 && this.field3741 == arg1.field3741 && this.field3736 == arg1.field3736 && this.field3745 == arg1.field3745 && this.field3739 == arg1.field3739 && this.field3744 == arg1.field3744 && this.field3747 == arg1.field3747 && this.field3748 == arg1.field3748 && this.field3734 == arg1.field3734 && this.field3740 == arg1.field3740;
    }
}
