import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nt")
public class class224 {

    @OriginalMember(owner = "client!nt", name = "h", descriptor = "F")
    public float field3176 = 1.0F;

    @OriginalMember(owner = "client!nt", name = "s", descriptor = "F")
    public float field3187 = 1.0F;

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "F")
    public float field3169 = 0.25F;

    @OriginalMember(owner = "client!nt", name = "c", descriptor = "I")
    public int field3171;

    @OriginalMember(owner = "client!nt", name = "i", descriptor = "I")
    public int field3177;

    @OriginalMember(owner = "client!nt", name = "o", descriptor = "F")
    public float field3183;

    @OriginalMember(owner = "client!nt", name = "k", descriptor = "F")
    public float field3179;

    @OriginalMember(owner = "client!nt", name = "j", descriptor = "F")
    public float field3178;

    @OriginalMember(owner = "client!nt", name = "e", descriptor = "I")
    public int field3173;

    @OriginalMember(owner = "client!nt", name = "t", descriptor = "I")
    public int field3188;

    @OriginalMember(owner = "client!nt", name = "f", descriptor = "Ltea;")
    public class241 field3174;

    @OriginalMember(owner = "client!nt", name = "v", descriptor = "I")
    public int field3190;

    @OriginalMember(owner = "client!nt", name = "q", descriptor = "I")
    public int field3185;

    @OriginalMember(owner = "client!nt", name = "l", descriptor = "I")
    public static int field3180 = 0;

    @OriginalMember(owner = "client!nt", name = "b", descriptor = "Z")
    public static boolean field3170 = false;

    @OriginalMember(owner = "client!nt", name = "m", descriptor = "[I")
    public static int[] field3181 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

    @OriginalMember(owner = "client!nt", name = "g", descriptor = "I")
    public static int field3175;

    @OriginalMember(owner = "client!nt", name = "n", descriptor = "I")
    public static int field3182;

    @OriginalMember(owner = "client!nt", name = "p", descriptor = "I")
    public static int field3184;

    @OriginalMember(owner = "client!nt", name = "r", descriptor = "I")
    public static int field3186;

    @OriginalMember(owner = "client!nt", name = "u", descriptor = "I")
    public static int field3189;

    @OriginalMember(owner = "client!nt", name = "d", descriptor = "Luda;")
    public static class455 field3172;

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(IIILwu;ZII)V", line = 24)
    public static final void method1429(int arg0, int arg1, int arg2, class376 arg3, boolean arg4, int arg5, int arg6) {
        if (arg2 > 0) {
            class577.field7577 = null;
            class307.field4417 = arg4;
            class65.field803 = arg0;
            class175.field2641 = arg5;
            class320.field4576 = 1;
            class556.field7305 = arg3;
            class172.field2631 = arg1;
            class670.field9141 = class566.field7445.method39(true) / arg2;
            if (class670.field9141 < 1) {
                class670.field9141 = 1;
            }
        } else {
            class238.method1498(arg4, 67, arg0, arg1, arg5, arg3);
        }
        if (arg6 >= -90) {
            method1432(-26, 51, (byte) 65);
        }
        field3186++;
    }

    @OriginalMember(owner = "client!nt", name = "<init>", descriptor = "()V", line = 129)
    public class224() {
        this.field3171 = 0;
        this.field3177 = -50;
        this.field3183 = 1.2F;
        this.field3179 = 0.69921875F;
        this.field3178 = 1.1523438F;
        this.field3173 = class213.field3119;
        this.field3188 = class412.field5715;
        this.field3174 = class201.field3013;
        this.field3190 = -50;
        this.field3185 = -60;
    }

    @OriginalMember(owner = "client!nt", name = "<init>", descriptor = "(Lee;)V", line = 145)
    public class224(class677 arg0) {
        int var2 = arg0.method3821((byte) 119);
        if (class411.field5711.field3902.method3070(true) == 1 && class164.field2494.method466() > 0) {
            if ((var2 & 0x1) == 0) {
                this.field3173 = class213.field3119;
            } else {
                this.field3173 = arg0.method3799(false);
            }
            if ((var2 & 0x2) == 0) {
                this.field3178 = 1.1523438F;
            } else {
                this.field3178 = (float) arg0.method3807(-1) / 256.0F;
            }
            if ((var2 & 0x4) == 0) {
                this.field3179 = 0.69921875F;
            } else {
                this.field3179 = (float) arg0.method3807(-1) / 256.0F;
            }
            if ((var2 & 0x8) == 0) {
                this.field3183 = 1.2F;
            } else {
                this.field3183 = (float) arg0.method3807(-1) / 256.0F;
            }
        } else {
            if ((var2 & 0x1) != 0) {
                arg0.method3799(false);
            }
            if ((var2 & 0x2) != 0) {
                arg0.method3807(-1);
            }
            if ((var2 & 0x4) != 0) {
                arg0.method3807(-1);
            }
            if ((var2 & 0x8) != 0) {
                arg0.method3807(-1);
            }
            this.field3179 = 0.69921875F;
            this.field3173 = class213.field3119;
            this.field3183 = 1.2F;
            this.field3178 = 1.1523438F;
        }
        if ((var2 & 0x10) == 0) {
            this.field3177 = -50;
            this.field3190 = -50;
            this.field3185 = -60;
        } else {
            this.field3177 = arg0.method3771((byte) -10);
            this.field3185 = arg0.method3771((byte) -10);
            this.field3190 = arg0.method3771((byte) -10);
        }
        if ((var2 & 0x20) == 0) {
            this.field3188 = class412.field5715;
        } else {
            this.field3188 = arg0.method3799(false);
        }
        if ((var2 & 0x40) == 0) {
            this.field3171 = 0;
        } else {
            this.field3171 = arg0.method3807(-1);
        }
        if ((var2 & 0x80) == 0) {
            this.field3174 = class201.field3013;
        } else {
            int var3 = arg0.method3807(-1);
            int var4 = arg0.method3807(-1);
            int var5 = arg0.method3807(-1);
            int var6 = arg0.method3807(-1);
            int var7 = arg0.method3807(-1);
            int var8 = arg0.method3807(-1);
            this.field3174 = class367.method2168((byte) -121, var4, var6, var5, var8, var7, var3);
        }
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(ILnt;)Z", line = 61)
    public final boolean method1430(int arg0, class224 arg1) {
        if (arg0 != 2) {
            method1432(48, 44, (byte) 65);
        }
        field3189++;
        return this.field3173 == arg1.field3173 && this.field3178 == arg1.field3178 && this.field3179 == arg1.field3179 && this.field3183 == arg1.field3183 && this.field3169 == arg1.field3169 && this.field3187 == arg1.field3187 && this.field3176 == arg1.field3176 && this.field3188 == arg1.field3188 && this.field3171 == arg1.field3171 && this.field3174 == arg1.field3174;
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(I)Lrs;", line = 74)
    public static final class653 method1431(int arg0) {
        class660.field8710 = 0;
        field3184++;
        return arg0 >= -65 ? null : class18.method142(-144254536);
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(IIB)Z", line = 86)
    public static final boolean method1432(int arg0, int arg1, byte arg2) {
        int var3 = 43 / ((arg2 + 61) / 59);
        field3182++;
        return class478.method2694(true, arg0, arg1) & ((arg1 & 0x2000) != 0 | class672.method3713(-47, arg1, arg0) | class598.method3260(arg0, 4, arg1));
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(Lee;B)V", line = 97)
    public final void method1433(class677 arg0, byte arg1) {
        if (arg1 >= -52) {
            this.field3173 = 61;
        }
        this.field3187 = (float) (arg0.method3821((byte) 123) * 8) / 255.0F;
        field3175++;
        this.field3169 = (float) (arg0.method3821((byte) -76) * 8) / 255.0F;
        this.field3176 = (float) (arg0.method3821((byte) -81) * 8) / 255.0F;
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(Z)V", line = 115)
    public static void method1434(boolean arg0) {
        if (arg0) {
            method1431(-13);
        }
        field3181 = null;
        field3172 = null;
    }
}
