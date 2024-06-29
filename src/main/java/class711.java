import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pg")
public class class711 {

    @OriginalMember(owner = "client!pg", name = "c", descriptor = "F")
    public float field10000 = 1.0F;

    @OriginalMember(owner = "client!pg", name = "k", descriptor = "F")
    public float field10008 = 1.0F;

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "F")
    public float field9998 = 0.25F;

    @OriginalMember(owner = "client!pg", name = "h", descriptor = "I")
    public int field10005;

    @OriginalMember(owner = "client!pg", name = "r", descriptor = "F")
    public float field10015;

    @OriginalMember(owner = "client!pg", name = "f", descriptor = "F")
    public float field10003;

    @OriginalMember(owner = "client!pg", name = "n", descriptor = "I")
    public int field10011;

    @OriginalMember(owner = "client!pg", name = "i", descriptor = "Ltj;")
    public class662 field10006;

    @OriginalMember(owner = "client!pg", name = "m", descriptor = "I")
    public int field10010;

    @OriginalMember(owner = "client!pg", name = "j", descriptor = "I")
    public int field10007;

    @OriginalMember(owner = "client!pg", name = "q", descriptor = "I")
    public int field10014;

    @OriginalMember(owner = "client!pg", name = "p", descriptor = "F")
    public float field10013;

    @OriginalMember(owner = "client!pg", name = "l", descriptor = "I")
    public int field10009;

    @OriginalMember(owner = "client!pg", name = "d", descriptor = "I")
    public static int field10001;

    @OriginalMember(owner = "client!pg", name = "e", descriptor = "I")
    public static int field10002;

    @OriginalMember(owner = "client!pg", name = "g", descriptor = "I")
    public static int field10004;

    @OriginalMember(owner = "client!pg", name = "o", descriptor = "I")
    public static int field10012;

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "I")
    public static int field9999;

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(ILtn;)V", line = 7)
    public final void method3924(int arg0, class179 arg1) {
        this.field10000 = (float) (arg1.method1094(arg0 + 247) * 8) / 255.0F;
        field10001++;
        this.field9998 = (float) (arg1.method1094(255) * 8) / 255.0F;
        this.field10008 = (float) (arg1.method1094(255) * arg0) / 255.0F;
    }

    @OriginalMember(owner = "client!pg", name = "<init>", descriptor = "()V", line = 75)
    public class711() {
        this.field10005 = class205.field2611;
        this.field10015 = 0.69921875F;
        this.field10003 = 1.2F;
        this.field10011 = class575.field8034;
        this.field10006 = class489.field6957;
        this.field10010 = 0;
        this.field10007 = -50;
        this.field10014 = -60;
        this.field10013 = 1.1523438F;
        this.field10009 = -50;
    }

    @OriginalMember(owner = "client!pg", name = "<init>", descriptor = "(Ltn;)V", line = 91)
    public class711(class179 arg0) {
        int var2 = arg0.method1094(255);
        if (class223.field2944.field602.method1676((byte) -125) == 1 && class518.field7289.method115() > 0) {
            if ((var2 & 0x1) == 0) {
                this.field10011 = class575.field8034;
            } else {
                this.field10011 = arg0.method1095((byte) 115);
            }
            if ((var2 & 0x2) == 0) {
                this.field10013 = 1.1523438F;
            } else {
                this.field10013 = (float) arg0.method1107(false) / 256.0F;
            }
            if ((var2 & 0x4) == 0) {
                this.field10015 = 0.69921875F;
            } else {
                this.field10015 = (float) arg0.method1107(false) / 256.0F;
            }
            if ((var2 & 0x8) == 0) {
                this.field10003 = 1.2F;
            } else {
                this.field10003 = (float) arg0.method1107(false) / 256.0F;
            }
        } else {
            if ((var2 & 0x1) != 0) {
                arg0.method1095((byte) 120);
            }
            if ((var2 & 0x2) != 0) {
                arg0.method1107(false);
            }
            if ((var2 & 0x4) != 0) {
                arg0.method1107(false);
            }
            if ((var2 & 0x8) != 0) {
                arg0.method1107(false);
            }
            this.field10013 = 1.1523438F;
            this.field10011 = class575.field8034;
            this.field10003 = 1.2F;
            this.field10015 = 0.69921875F;
        }
        if ((var2 & 0x10) == 0) {
            this.field10007 = -50;
            this.field10009 = -50;
            this.field10014 = -60;
        } else {
            this.field10007 = arg0.method1137((byte) -92);
            this.field10014 = arg0.method1137((byte) -65);
            this.field10009 = arg0.method1137((byte) -93);
        }
        if ((var2 & 0x20) == 0) {
            this.field10005 = class205.field2611;
        } else {
            this.field10005 = arg0.method1095((byte) 126);
        }
        if ((var2 & 0x40) == 0) {
            this.field10010 = 0;
        } else {
            this.field10010 = arg0.method1107(false);
        }
        if ((var2 & 0x80) == 0) {
            this.field10006 = class489.field6957;
        } else {
            int var3 = arg0.method1107(false);
            int var4 = arg0.method1107(false);
            int var5 = arg0.method1107(false);
            int var6 = arg0.method1107(false);
            int var7 = arg0.method1107(false);
            int var8 = arg0.method1107(false);
            this.field10006 = class269.method1613((byte) -125, var5, var6, var8, var7, var3, var4);
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(Lpg;B)Z", line = 33)
    public final boolean method3925(class711 arg0, byte arg1) {
        if (arg1 != 4) {
            this.field10005 = 53;
        }
        field9999++;
        return this.field10011 == arg0.field10011 && this.field10013 == arg0.field10013 && this.field10015 == arg0.field10015 && this.field10003 == arg0.field10003 && this.field9998 == arg0.field9998 && this.field10000 == arg0.field10000 && this.field10008 == arg0.field10008 && this.field10005 == arg0.field10005 && this.field10010 == arg0.field10010 && this.field10006 == arg0.field10006;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(II)Z", line = 44)
    public static final boolean method3926(int arg0, int arg1) {
        field10012++;
        if (arg0 == 9713) {
            return arg1 == 7 || arg1 == 9;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(IIII)I", line = 62)
    public static final int method3927(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 > -107) {
            return -77;
        }
        field10002++;
        if (arg3 <= arg0) {
            return arg0 > arg2 ? arg2 : arg0;
        } else {
            return arg3;
        }
    }
}
