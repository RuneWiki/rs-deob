import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!g")
public class class154 {

    @OriginalMember(owner = "client!g", name = "e", descriptor = "F")
    public float field2313 = 1.0F;

    @OriginalMember(owner = "client!g", name = "s", descriptor = "F")
    public float field2327 = 1.0F;

    @OriginalMember(owner = "client!g", name = "t", descriptor = "F")
    public float field2328 = 0.25F;

    @OriginalMember(owner = "client!g", name = "f", descriptor = "I")
    public int field2314;

    @OriginalMember(owner = "client!g", name = "q", descriptor = "I")
    public int field2325;

    @OriginalMember(owner = "client!g", name = "d", descriptor = "I")
    public int field2312;

    @OriginalMember(owner = "client!g", name = "j", descriptor = "F")
    public float field2318;

    @OriginalMember(owner = "client!g", name = "c", descriptor = "F")
    public float field2311;

    @OriginalMember(owner = "client!g", name = "n", descriptor = "I")
    public int field2322;

    @OriginalMember(owner = "client!g", name = "g", descriptor = "F")
    public float field2315;

    @OriginalMember(owner = "client!g", name = "o", descriptor = "I")
    public int field2323;

    @OriginalMember(owner = "client!g", name = "k", descriptor = "Lsfa;")
    public class693 field2319;

    @OriginalMember(owner = "client!g", name = "i", descriptor = "I")
    public int field2317;

    @OriginalMember(owner = "client!g", name = "p", descriptor = "Z")
    public static boolean field2324 = true;

    @OriginalMember(owner = "client!g", name = "b", descriptor = "I")
    public static int field2310;

    @OriginalMember(owner = "client!g", name = "h", descriptor = "I")
    public static int field2316;

    @OriginalMember(owner = "client!g", name = "l", descriptor = "I")
    public static int field2320;

    @OriginalMember(owner = "client!g", name = "m", descriptor = "I")
    public static int field2321;

    @OriginalMember(owner = "client!g", name = "r", descriptor = "I")
    public static int field2326;

    @OriginalMember(owner = "client!g", name = "a", descriptor = "Lha;")
    public static class58 field2309;

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(IIZ)Ljava/lang/String;", line = 5)
    public static final String method1178(int arg0, int arg1, boolean arg2) {
        field2321++;
        if (arg2 && arg1 >= 0) {
            int var3 = -124 % ((-arg0 - 50) / 47);
            return class203.method1417(arg2, arg1, (byte) 127, 10);
        } else {
            return Integer.toString(arg1);
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(Lud;I)V", line = 18)
    public final void method1179(class35 arg0, int arg1) {
        this.field2327 = (float) (arg0.method273(255) * arg1) / 255.0F;
        field2326++;
        this.field2328 = (float) (arg0.method273(255) * 8) / 255.0F;
        this.field2313 = (float) (arg0.method273(arg1 ^ 0xF7) * 8) / 255.0F;
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(BII)Z", line = 29)
    public static final boolean method1180(byte arg0, int arg1, int arg2) {
        field2320++;
        return arg0 != -67;
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(I)V", line = 43)
    public static void method1181(int arg0) {
        field2309 = null;
        if (arg0 <= 10) {
            field2309 = null;
        }
    }

    @OriginalMember(owner = "client!g", name = "<init>", descriptor = "()V", line = 92)
    public class154() {
        this.field2314 = class70.field1248;
        this.field2325 = 0;
        this.field2312 = -50;
        this.field2318 = 0.69921875F;
        this.field2311 = 1.1523438F;
        this.field2322 = class509.field7255;
        this.field2315 = 1.2F;
        this.field2323 = -60;
        this.field2319 = class618.field8927;
        this.field2317 = -50;
    }

    @OriginalMember(owner = "client!g", name = "<init>", descriptor = "(Lud;)V", line = 108)
    public class154(class35 arg0) {
        int var2 = arg0.method273(255);
        if (class471.field6781.field6688.method3933(27669) == 1 && class532.field7530.method615() > 0) {
            if ((var2 & 0x1) == 0) {
                this.field2314 = class70.field1248;
            } else {
                this.field2314 = arg0.method234((byte) -110);
            }
            if ((var2 & 0x2) == 0) {
                this.field2311 = 1.1523438F;
            } else {
                this.field2311 = (float) arg0.method253(-13900) / 256.0F;
            }
            if ((var2 & 0x4) == 0) {
                this.field2318 = 0.69921875F;
            } else {
                this.field2318 = (float) arg0.method253(-13900) / 256.0F;
            }
            if ((var2 & 0x8) == 0) {
                this.field2315 = 1.2F;
            } else {
                this.field2315 = (float) arg0.method253(-13900) / 256.0F;
            }
        } else {
            if ((var2 & 0x1) != 0) {
                arg0.method234((byte) -127);
            }
            if ((var2 & 0x2) != 0) {
                arg0.method253(-13900);
            }
            if ((var2 & 0x4) != 0) {
                arg0.method253(-13900);
            }
            if ((var2 & 0x8) != 0) {
                arg0.method253(-13900);
            }
            this.field2314 = class70.field1248;
            this.field2311 = 1.1523438F;
            this.field2315 = 1.2F;
            this.field2318 = 0.69921875F;
        }
        if ((var2 & 0x10) == 0) {
            this.field2323 = -60;
            this.field2317 = -50;
            this.field2312 = -50;
        } else {
            this.field2317 = arg0.method225((byte) 74);
            this.field2323 = arg0.method225((byte) 91);
            this.field2312 = arg0.method225((byte) 72);
        }
        if ((var2 & 0x20) == 0) {
            this.field2322 = class509.field7255;
        } else {
            this.field2322 = arg0.method234((byte) -124);
        }
        if ((var2 & 0x40) == 0) {
            this.field2325 = 0;
        } else {
            this.field2325 = arg0.method253(-13900);
        }
        if ((var2 & 0x80) == 0) {
            this.field2319 = class618.field8927;
        } else {
            int var3 = arg0.method253(-13900);
            int var4 = arg0.method253(-13900);
            int var5 = arg0.method253(-13900);
            int var6 = arg0.method253(-13900);
            int var7 = arg0.method253(-13900);
            int var8 = arg0.method253(-13900);
            this.field2319 = class459.method2802(var3, var6, var4, var8, 127, var7, var5);
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(ILg;)Z", line = 69)
    public final boolean method1182(int arg0, class154 arg1) {
        field2316++;
        if (arg0 == 661) {
            return this.field2314 == arg1.field2314 && this.field2311 == arg1.field2311 && this.field2318 == arg1.field2318 && this.field2315 == arg1.field2315 && this.field2328 == arg1.field2328 && this.field2327 == arg1.field2327 && this.field2313 == arg1.field2313 && this.field2322 == arg1.field2322 && this.field2325 == arg1.field2325 && this.field2319 == arg1.field2319;
        } else {
            return true;
        }
    }
}
