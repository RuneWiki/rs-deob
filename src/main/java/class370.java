import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!e")
public class class370 {

    @OriginalMember(owner = "client!e", name = "e", descriptor = "I")
    public int field5185 = 0;

    @OriginalMember(owner = "client!e", name = "b", descriptor = "Z")
    private boolean field5182 = false;

    @OriginalMember(owner = "client!e", name = "y", descriptor = "I")
    public int field5205 = 0;

    @OriginalMember(owner = "client!e", name = "r", descriptor = "I")
    public static int field5198 = 0;

    @OriginalMember(owner = "client!e", name = "p", descriptor = "I")
    public static int field5196 = 0;

    @OriginalMember(owner = "client!e", name = "a", descriptor = "I")
    public int field5181;

    @OriginalMember(owner = "client!e", name = "c", descriptor = "I")
    public int field5183;

    @OriginalMember(owner = "client!e", name = "d", descriptor = "I")
    public static int field5184;

    @OriginalMember(owner = "client!e", name = "f", descriptor = "I")
    private int field5186;

    @OriginalMember(owner = "client!e", name = "g", descriptor = "I")
    public static int field5187;

    @OriginalMember(owner = "client!e", name = "h", descriptor = "I")
    public int field5188;

    @OriginalMember(owner = "client!e", name = "i", descriptor = "I")
    public int field5189;

    @OriginalMember(owner = "client!e", name = "j", descriptor = "I")
    public static int field5190;

    @OriginalMember(owner = "client!e", name = "k", descriptor = "I")
    public int field5191;

    @OriginalMember(owner = "client!e", name = "m", descriptor = "I")
    public int field5193;

    @OriginalMember(owner = "client!e", name = "n", descriptor = "I")
    public static int field5194;

    @OriginalMember(owner = "client!e", name = "q", descriptor = "I")
    public int field5197;

    @OriginalMember(owner = "client!e", name = "s", descriptor = "I")
    public int field5199;

    @OriginalMember(owner = "client!e", name = "t", descriptor = "I")
    public static int field5200;

    @OriginalMember(owner = "client!e", name = "u", descriptor = "I")
    public static int field5201;

    @OriginalMember(owner = "client!e", name = "v", descriptor = "I")
    public static int field5202;

    @OriginalMember(owner = "client!e", name = "w", descriptor = "I")
    public int field5203;

    @OriginalMember(owner = "client!e", name = "x", descriptor = "I")
    public static int field5204;

    @OriginalMember(owner = "client!e", name = "l", descriptor = "J")
    public long field5192;

    @OriginalMember(owner = "client!e", name = "o", descriptor = "Lvh;")
    public static class240 field5195;

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(BIII)V", line = 5)
    public static final void method2137(byte arg0, int arg1, int arg2, int arg3) {
        field5194++;
        if (arg2 == 0) {
            class356.method1978((byte) 55, class246.field3423);
            class123.field1680++;
        }
        if (arg2 == 1) {
            class356.method1978((byte) 80, class138.field1982);
            class65.field894++;
        }
        class244.field3395.method2061(class215.field3059 + arg1, (byte) 118);
        class244.field3395.method2070(81954016, arg3 + class79.field1134);
        class244.field3395.method2067(class488.field7125.method1212(-1, 82) ? 1 : 0, 32479);
        class473.field6909 = arg3;
        int var4 = -54 / ((arg0 - 14) / 47);
        class35.field489 = false;
        class285.field3824 = arg1;
        class352.method1947(119);
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(I)V", line = 36)
    public final void method2138(int arg0) {
        field5202++;
        this.field5193 = class377.field5315[this.field5186 << 3];
        this.field5183 = (int) Math.sqrt((double) (this.field5189 * this.field5189 + this.field5197 * this.field5197 + this.field5181 * this.field5181));
        if (arg0 <= 23) {
            return;
        }
        if (this.field5199 == 0) {
            this.field5199 = 1;
        }
        if (this.field5191 == 0) {
            this.field5192 = 2147483647L;
        } else if (this.field5191 == 1) {
            this.field5192 = (this.field5183 * 8 / this.field5199);
            this.field5192 *= this.field5192;
        } else if (this.field5191 == 2) {
            this.field5192 = (this.field5183 * 8 / this.field5199);
        }
        if (this.field5182) {
            this.field5183 *= -1;
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(B)V", line = 77)
    public static void method2139(byte arg0) {
        field5195 = null;
        if (arg0 >= -64) {
            field5196 = 11;
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(ZZLvh;III)V", line = 90)
    public static final void method2140(boolean arg0, boolean arg1, class240 arg2, int arg3, int arg4, int arg5) {
        class261.field3590 = arg3;
        class284.field3821 = arg5;
        class305.field4187 = arg0;
        class362.field5020 = 10000;
        field5204++;
        class281.field3795 = arg4;
        class510.field7488 = 1;
        class159.field2290 = arg2;
        if (arg1) {
            field5198 = 87;
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(IIIIIII)V", line = 109)
    public static final void method2141(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field5201++;
        if (arg4 != -28875) {
            method2140(true, false, null, 47, -103, -97);
        }
        class473[] var7 = class324.field4457;
        for (int var8 = 0; var8 < var7.length; var8++) {
            class473 var9 = var7[var8];
            if (var9 != null && var9.field6911 == 2) {
                class266.method1536(var9.field6908, arg0 >> 1, arg5 >> 1, var9.field6912, arg6, (byte) -123, arg2, var9.field6915 * 2, var9.field6907);
                if (class172.field2457[0] > -1 && class393.field5484 % 20 < 10) {
                    class344.field4742[var9.field6905].method3111(class172.field2457[0] + arg3 - 12, arg1 - -class172.field2457[1] + -28);
                }
            }
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(ILlh;)V", line = 141)
    public final void method2142(int arg0, class365 arg1) {
        field5190++;
        if (arg0 != 0) {
            this.field5189 = -38;
        }
        while (true) {
            int var3 = arg1.method2099(255);
            if (var3 == 0) {
                return;
            }
            this.method2144(arg1, var3, (byte) 21);
        }
    }

    @OriginalMember(owner = "client!e", name = "b", descriptor = "(I)V", line = 165)
    public static final void method2143(int arg0) {
        if (arg0 < 12) {
            field5196 = 122;
        }
        class151.field2126.method992(-15728);
        field5184++;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(Llh;IB)V", line = 186)
    private final void method2144(class365 arg0, int arg1, byte arg2) {
        if (arg2 != 21) {
            this.method2144(null, -2, (byte) -127);
        }
        field5200++;
        if (arg1 == 1) {
            this.field5186 = arg0.method2062((byte) 14);
        } else if (arg1 == 2) {
            arg0.method2099(255);
        } else if (arg1 == 3) {
            this.field5189 = arg0.method2056((byte) 82);
            this.field5181 = arg0.method2056((byte) -71);
            this.field5197 = arg0.method2056((byte) 114);
        } else if (arg1 == 4) {
            this.field5191 = arg0.method2099(255);
            this.field5199 = arg0.method2056((byte) -93);
        } else if (arg1 == 6) {
            this.field5188 = arg0.method2099(255);
        } else if (arg1 == 8) {
            this.field5205 = 1;
        } else if (arg1 == 9) {
            this.field5185 = 1;
        } else if (arg1 == 10) {
            this.field5182 = true;
            return;
        }
    }

    @OriginalMember(owner = "client!e", name = "c", descriptor = "(I)V", line = 242)
    public static final void method2145(int arg0) {
        field5187++;
        if (!class297.field4101) {
            return;
        }
        class295 var1 = class12.method106(class401.field5585, (byte) -108, class455.field6651);
        if (var1 != null && var1.field4048 != null) {
            class44 var2 = new class44();
            var2.field613 = var1;
            var2.field612 = var1.field4048;
            class475.method2798(var2);
        }
        class297.field4101 = false;
        class287.field3858 = -1;
        class20.field202 = arg0;
        if (var1 != null) {
            class150.method952((byte) 117, var1);
        }
    }
}
