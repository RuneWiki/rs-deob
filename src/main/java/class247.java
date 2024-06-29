import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qi")
public class class247 {

    @OriginalMember(owner = "client!qi", name = "i", descriptor = "Loe;")
    private class79 field4277 = new class79(256);

    @OriginalMember(owner = "client!qi", name = "r", descriptor = "Loe;")
    private class79 field4286 = new class79(256);

    @OriginalMember(owner = "client!qi", name = "q", descriptor = "Lum;")
    private class222 field4285;

    @OriginalMember(owner = "client!qi", name = "k", descriptor = "Lum;")
    private class222 field4279;

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "I")
    public static int field4269 = 0;

    @OriginalMember(owner = "client!qi", name = "e", descriptor = "Lhi;")
    public static class82 field4273 = class95.method664((byte) -70, "Lade Schrifts-=tze )2 ");

    @OriginalMember(owner = "client!qi", name = "j", descriptor = "[Lhi;")
    public static class82[] field4278 = new class82[100];

    @OriginalMember(owner = "client!qi", name = "c", descriptor = "Lhi;")
    public static class82 field4271 = class95.method664((byte) -117, "Null");

    @OriginalMember(owner = "client!qi", name = "m", descriptor = "Lhi;")
    public static class82 field4281 = class95.method664((byte) -26, ")4a=");

    @OriginalMember(owner = "client!qi", name = "n", descriptor = "[I")
    public static int[] field4282 = new int[2000];

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "I")
    public static int field4270;

    @OriginalMember(owner = "client!qi", name = "d", descriptor = "I")
    public static int field4272;

    @OriginalMember(owner = "client!qi", name = "f", descriptor = "I")
    public static int field4274;

    @OriginalMember(owner = "client!qi", name = "g", descriptor = "I")
    public static int field4275;

    @OriginalMember(owner = "client!qi", name = "h", descriptor = "I")
    public static int field4276;

    @OriginalMember(owner = "client!qi", name = "l", descriptor = "I")
    public static int field4280;

    @OriginalMember(owner = "client!qi", name = "o", descriptor = "I")
    public static int field4283;

    @OriginalMember(owner = "client!qi", name = "p", descriptor = "I")
    public static int field4284;

    @OriginalMember(owner = "client!qi", name = "s", descriptor = "I")
    public static int field4287;

    @OriginalMember(owner = "client!qi", name = "t", descriptor = "I")
    public static int field4288;

    @OriginalMember(owner = "client!qi", name = "u", descriptor = "I")
    public static int field4289;

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(I)V", line = 4)
    public static void method1763(int arg0) {
        field4273 = null;
        field4278 = null;
        field4282 = null;
        field4281 = null;
        if (arg0 <= 115) {
            method1774(-100, (byte) -127, 82, -56, 65);
        }
        field4271 = null;
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(I[III)Lvk;", line = 18)
    private final class154 method1764(int arg0, int[] arg1, int arg2, int arg3) {
        if (arg2 <= 32) {
            this.method1767((byte) -52, 72, (int[]) null, 56);
        }
        field4276++;
        int var5 = (arg0 >>> 12 | arg0 << 4 & 0xFFF2) ^ arg3;
        int var6 = var5 | arg0 << 16;
        long var7 = (long) var6;
        class154 var9 = (class154) this.field4286.method507(var7, 602425312);
        if (var9 != null) {
            return var9;
        } else if (arg1 == null || arg1[0] > 0) {
            class96 var10 = class96.method668(this.field4279, arg0, arg3);
            if (var10 == null) {
                return null;
            }
            class154 var11 = var10.method669();
            this.field4286.method503(var7, -113, var11);
            if (arg1 != null) {
                arg1[0] -= var11.field2648.length;
            }
            return var11;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(III)V", line = 57)
    public static final void method1765(int arg0, int arg1, int arg2) {
        class257.field4414 = true;
        class149.field2536 = arg0;
        class133.field2310 = arg1;
        class39.field673 = arg2;
        class100.field1799 = -1;
        class257.field4419 = -1;
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(II[I)Lvk;", line = 72)
    public final class154 method1766(int arg0, int arg1, int[] arg2) {
        if (arg0 != 0) {
            this.method1767((byte) -54, 45, (int[]) null, -67);
        }
        field4284++;
        if (this.field4285.method1597(~arg0) == 1) {
            return this.method1767((byte) 119, arg1, arg2, 0);
        } else if (this.field4285.method1568(1673, arg1) == 1) {
            return this.method1767((byte) 119, 0, arg2, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(BI[II)Lvk;", line = 99)
    private final class154 method1767(byte arg0, int arg1, int[] arg2, int arg3) {
        int var5 = (arg3 >>> 12 | (arg3 & 0xB0000FFF) << 4) ^ arg1;
        int var6 = var5 | arg3 << 16;
        long var7 = (long) var6 ^ 0x100000000L;
        field4289++;
        class154 var9 = (class154) this.field4286.method507(var7, 602425312);
        if (var9 != null) {
            return var9;
        } else if (arg2 == null || arg2[0] > 0) {
            class251 var10 = (class251) this.field4277.method507(var7, 602425312);
            if (var10 == null) {
                var10 = class251.method1808(this.field4285, arg3, arg1);
                if (var10 == null) {
                    return null;
                }
                this.field4277.method503(var7, -127, var10);
            }
            class154 var11 = var10.method1799(arg2);
            if (var11 == null) {
                return null;
            }
            var10.method961((byte) 115);
            if (arg0 == 119) {
                this.field4286.method503(var7, -82, var11);
                return var11;
            } else {
                return (class154) null;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "(I)V", line = 141)
    public static final void method1768(int arg0) {
        field4283++;
        if (arg0 <= 3) {
            method1772((class75) null, (byte) -75);
        }
        class139.field2380.method2172(false);
    }

    @OriginalMember(owner = "client!qi", name = "c", descriptor = "(I)V", line = 152)
    public static final void method1769(int arg0) {
        class119.field2101.method496((byte) 74);
        class221.field3822.method799((byte) 39);
        int var1 = 71 / ((-arg0 - 45) / 57);
        class200.field3439.method799((byte) 39);
        field4280++;
    }

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "(III)I", line = 171)
    public static final int method1770(int arg0, int arg1, int arg2) {
        field4287++;
        if (arg1 != -1771353473) {
            field4275 = 55;
        }
        int var3 = arg2 >>> 31;
        return (arg2 + var3) / arg0 - var3;
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(ZLjk;)V", line = 186)
    public static final void method1771(boolean arg0, class278 arg1) {
        if (arg1.field4669 != null) {
            arg1.field4669.field2943 = 0;
        }
        arg1.field4672 = false;
        if (!arg0) {
            field4271 = (class82) null;
        }
        for (class278 var2 = arg1.method886(); var2 != null; var2 = arg1.method875()) {
            method1771(true, var2);
        }
        field4274++;
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(Lme;B)Lhi;", line = 210)
    public static final class82 method1772(class75 arg0, byte arg1) {
        field4270++;
        if (class53.method374(arg1 - 145, client.method871(arg0)) == 0) {
            return null;
        } else if (arg0.field1168 == null || arg0.field1168.method550(-1).method535(true) == 0) {
            return class182.field3114 ? class254.field4378 : null;
        } else if (arg1 == 18) {
            return arg0.field1168;
        } else {
            return (class82) null;
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "([III)Lvk;", line = 258)
    public final class154 method1773(int[] arg0, int arg1, int arg2) {
        field4288++;
        if (arg1 != 0) {
            this.field4286 = (class79) null;
        }
        if (this.field4279.method1597(-1) == 1) {
            return this.method1764(0, arg0, arg1 + 73, arg2);
        } else if (this.field4279.method1568(1673, arg2) == 1) {
            return this.method1764(arg2, arg0, 43, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(IBIII)V", line = 279)
    public static final void method1774(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        field4272++;
        class114.method780(arg1 + 72, -arg3 + arg0, arg0 + arg3, arg4, class73.field1117[arg2]);
        if (arg1 != 54) {
            field4281 = (class82) null;
        }
        int var5 = 0;
        int var6 = -arg3;
        int var7 = arg3;
        int var8 = -1;
        while (var7 > var5) {
            var5++;
            var8 += 2;
            var6 += var8;
            if (var6 >= 0) {
                var7--;
                int[] var9 = class73.field1117[arg2 - var7];
                int[] var10 = class73.field1117[arg2 + var7];
                var6 -= var7 << 1;
                int var11 = arg0 - var5;
                int var12 = arg0 + var5;
                class114.method780(84, var11, var12, arg4, var10);
                class114.method780(106, var11, var12, arg4, var9);
            }
            int var13 = arg0 - var7;
            int var14 = arg0 + var7;
            int[] var15 = class73.field1117[arg2 + var5];
            int[] var16 = class73.field1117[arg2 - var5];
            class114.method780(79, var13, var14, arg4, var15);
            class114.method780(-92, var13, var14, arg4, var16);
        }
    }

    @OriginalMember(owner = "client!qi", name = "<init>", descriptor = "(Lum;Lum;)V", line = 355)
    public class247(class222 arg0, class222 arg1) {
        this.field4285 = arg1;
        this.field4279 = arg0;
    }
}
