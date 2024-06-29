import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public class class166 extends class314 {

    @OriginalMember(owner = "client!ca", name = "E", descriptor = "I")
    private int field2334 = 0;

    @OriginalMember(owner = "client!ca", name = "u", descriptor = "Llj;")
    private class362 field2324 = new class362();

    @OriginalMember(owner = "client!ca", name = "w", descriptor = "I")
    public static int field2326 = 0;

    @OriginalMember(owner = "client!ca", name = "s", descriptor = "Z")
    public static boolean field2322 = false;

    @OriginalMember(owner = "client!ca", name = "v", descriptor = "Z")
    public static boolean field2325 = false;

    @OriginalMember(owner = "client!ca", name = "G", descriptor = "I")
    public static int field2336 = 0;

    @OriginalMember(owner = "client!ca", name = "N", descriptor = "Ljava/lang/String;")
    public static String field2343 = "skill: ";

    @OriginalMember(owner = "client!ca", name = "p", descriptor = "I")
    public static int field2319;

    @OriginalMember(owner = "client!ca", name = "q", descriptor = "I")
    public static int field2320;

    @OriginalMember(owner = "client!ca", name = "r", descriptor = "I")
    public static int field2321;

    @OriginalMember(owner = "client!ca", name = "z", descriptor = "I")
    public static int field2329;

    @OriginalMember(owner = "client!ca", name = "A", descriptor = "I")
    public static int field2330;

    @OriginalMember(owner = "client!ca", name = "B", descriptor = "I")
    public static int field2331;

    @OriginalMember(owner = "client!ca", name = "D", descriptor = "I")
    public static int field2333;

    @OriginalMember(owner = "client!ca", name = "F", descriptor = "I")
    public static int field2335;

    @OriginalMember(owner = "client!ca", name = "H", descriptor = "I")
    public static int field2337;

    @OriginalMember(owner = "client!ca", name = "I", descriptor = "I")
    public static int field2338;

    @OriginalMember(owner = "client!ca", name = "J", descriptor = "I")
    public static int field2339;

    @OriginalMember(owner = "client!ca", name = "K", descriptor = "I")
    public static int field2340;

    @OriginalMember(owner = "client!ca", name = "L", descriptor = "I")
    public static int field2341;

    @OriginalMember(owner = "client!ca", name = "M", descriptor = "I")
    public static int field2342;

    @OriginalMember(owner = "client!ca", name = "C", descriptor = "Lam;")
    public static class378 field2332;

    @OriginalMember(owner = "client!ca", name = "y", descriptor = "[Lkh;")
    public static class11[] field2328;

    @OriginalMember(owner = "client!ca", name = "t", descriptor = "[Luo;")
    public static class344[] field2323;

    @OriginalMember(owner = "client!ca", name = "x", descriptor = "[[[B")
    public static byte[][][] field2327;

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "(I)V", line = 3)
    private final void method1090(int arg0) {
        ++field2335;
        int var2 = super.field4471++;
        if (~super.field4471 <= -5001) {
            super.field4471 = 0;
        }
        this.field2334 = super.field4469[var2];
        Object var3 = super.field4480[var2];
        super.field4480[var2] = null;
        if (arg0 != -8757) {
            this.method1091((class302) null, -82);
        }
        if (~this.field2334 == -22) {
            class102.method556(this.field2324, (class302) var3);
        } else if (~this.field2334 != -21) {
            if (this.field2334 >= 30 && this.field2334 <= 33) {
                class118.field1400.method1017(3000.0F, super.field4470[var2] * 1.5F);
                ((class319) var3).method1987(class239.field3251, class326.field4585, class118.field1410, class289.field4111, this.field2334 + -30 == 0);
            } else if (~this.field2334 <= -41 && ~this.field2334 >= -44) {
                class118.field1400.method1017(3000.0F, super.field4470[var2] * 1.5F);
                ((class319) var3).method1987(class239.field3251, class326.field4585, class118.field1410, class240.field3264, this.field2334 - 40 == 0);
            } else {
                if (this.field2334 != 22) {
                    if (~this.field2334 == -24) {
                        class118.field1400.method924();
                        return;
                    }
                    if (this.field2334 == 24) {
                        class118.field1400.method926(0, (class33[]) null);
                        return;
                    }
                } else {
                    class118.field1400.method961(-1, 1583160, 40);
                }
            }
        } else {
            class302 var4 = (class302) var3;
            if (var4.field4313 != null) {
                var4.field4313.method211(class118.field1400, 0);
            }
            if (var4.field4324 != null) {
                var4.field4324.method211(class118.field1400, arg0 ^ -8757);
            }
            if (var4.field4311 != null) {
                var4.field4311.method211(class118.field1400, 0);
            }
            if (var4.field4306 != null) {
                var4.field4306.method211(class118.field1400, arg0 ^ -8757);
            }
            if (var4.field4310 != null) {
                var4.field4310.method211(class118.field1400, 0);
            }
            for (class299 var5 = var4.field4308; var5 != null; var5 = var5.field4263) {
                var5.field4261.method211(class118.field1400, 0);
            }
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(Ldn;I)V", line = 97)
    public final void method1091(class302 arg0, int arg1) {
        super.field4469[super.field4473] = 21;
        ++field2320;
        if (arg1 != -32426) {
            this.method1090(60);
        }
        super.field4480[super.field4473] = arg0;
        ++super.field4473;
        if (super.field4473 >= 5000) {
            super.field4473 = 0;
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(IIII)V", line = 114)
    public static final void method1092(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg3 << 3;
        int var5 = arg0 << 3;
        int var6 = arg2 << 3;
        ++field2341;
        if (class231.field3128 == 2) {
            class314.field4472 = var6;
            class137.field1952 = var5;
            class77.field869 = var4;
        }
        class276.field3893 = (float) var4;
        if (arg1 >= -55) {
            field2330 = -108;
        }
        class135.field1886 = (float) var6;
        class324.method1998((byte) 111);
        class404.field5889 = true;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(B)V", line = 141)
    public final void method1093(byte arg0) {
        while (super.field4473 != super.field4471) {
            this.method1090(-8757);
        }
        if (arg0 != 89) {
            this.method1090(-53);
        }
        ++field2319;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(BLsl;)Z", line = 163)
    public static final boolean method1094(byte arg0, class265 arg1) {
        ++field2339;
        class327 var2 = class157.method1036(0, arg1.method225(113));
        if (~var2.field4620 == 0) {
            return true;
        } else {
            class97 var3 = class334.method2153(100, var2.field4620);
            int var4 = 11 % ((arg0 - 12) / 58);
            return ~var3.field1082 == 0 ? true : var3.method525(0);
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(BI)V", line = 190)
    public final void method1095(byte arg0, int arg1) {
        ++field2321;
        if (arg0 != 73) {
            this.method1090(20);
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(Ldn;B)V", line = 204)
    public final void method1096(class302 arg0, byte arg1) {
        ++field2342;
        super.field4469[super.field4473] = 20;
        int var3 = -34 / ((39 - arg1) / 32);
        super.field4480[super.field4473] = arg0;
        ++super.field4473;
        if (~super.field4473 <= -5001) {
            super.field4473 = 0;
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(II)V", line = 222)
    public final void method1097(int arg0, int arg1) {
        ++field2329;
        super.field4469[super.field4473] = (byte) arg0;
        if (arg1 != 7) {
            field2332 = null;
        }
        ++super.field4473;
        if (~super.field4473 <= -5001) {
            super.field4473 = 0;
        }
    }

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "(B)V", line = 241)
    public final void method1098(byte arg0) {
        if (arg0 != -67) {
            this.method1090(-109);
        }
        ++field2340;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(ILdn;)V", line = 260)
    public final void method1099(int arg0, class302 arg1) {
        --super.field4471;
        ++field2338;
        if (arg0 > super.field4471) {
            super.field4471 = 4999;
        }
        super.field4469[super.field4471] = 21;
        super.field4480[super.field4471] = arg1;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(IIIIZIII)V", line = 285)
    public static final void method1100(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7) {
        ++field2333;
        if (class344.method2202((byte) 88, arg1)) {
            client.method1068(class224.field3054[arg1], -1, arg0, arg7, arg3, arg6, arg5, arg2);
            if (arg4) {
                field2322 = false;
            }
        }
    }

    @OriginalMember(owner = "client!ca", name = "c", descriptor = "(B)V", line = 302)
    public static void method1101(byte arg0) {
        field2343 = null;
        field2327 = null;
        field2323 = null;
        if (arg0 >= 113) {
            field2332 = null;
            field2328 = null;
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(IFLac;ZI)V", line = 320)
    public final void method1102(int arg0, float arg1, class319 arg2, boolean arg3, int arg4) {
        super.field4469[super.field4473] = (byte) (arg3 ? arg0 + 40 : arg0 + 30);
        if (arg4 != 1) {
            field2326 = -1;
        }
        ++field2337;
        super.field4480[super.field4473] = arg2;
        super.field4470[super.field4473] = arg1;
        ++super.field4473;
        if (~super.field4473 <= -5001) {
            super.field4473 = 0;
        }
    }
}
