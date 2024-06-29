import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uh")
public class class146 {

    @OriginalMember(owner = "client!uh", name = "g", descriptor = "Llh;")
    private class114 field2548 = new class114();

    @OriginalMember(owner = "client!uh", name = "k", descriptor = "Lia;")
    private static class257 field2552 = class28.method234(126, "Loaded textures");

    @OriginalMember(owner = "client!uh", name = "j", descriptor = "S")
    public static short field2551 = 1;

    @OriginalMember(owner = "client!uh", name = "c", descriptor = "Lia;")
    public static class257 field2544 = class28.method234(-13, ")4");

    @OriginalMember(owner = "client!uh", name = "i", descriptor = "[I")
    public static int[] field2550 = new int[] { 1, -1, -1, 1 };

    @OriginalMember(owner = "client!uh", name = "h", descriptor = "[I")
    public static int[] field2549 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "client!uh", name = "p", descriptor = "Lia;")
    public static class257 field2557 = field2552;

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "I")
    public static int field2542;

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "I")
    public static int field2543;

    @OriginalMember(owner = "client!uh", name = "d", descriptor = "I")
    public static int field2545;

    @OriginalMember(owner = "client!uh", name = "e", descriptor = "I")
    public static int field2546;

    @OriginalMember(owner = "client!uh", name = "f", descriptor = "I")
    public static int field2547;

    @OriginalMember(owner = "client!uh", name = "l", descriptor = "I")
    public static int field2553;

    @OriginalMember(owner = "client!uh", name = "m", descriptor = "I")
    public static int field2554;

    @OriginalMember(owner = "client!uh", name = "n", descriptor = "I")
    public static int field2555;

    @OriginalMember(owner = "client!uh", name = "o", descriptor = "I")
    public static int field2556;

    @OriginalMember(owner = "client!uh", name = "q", descriptor = "I")
    public static int field2558;

    @OriginalMember(owner = "client!uh", name = "r", descriptor = "I")
    public static int field2559;

    @OriginalMember(owner = "client!uh", name = "t", descriptor = "I")
    public static int field2561;

    @OriginalMember(owner = "client!uh", name = "s", descriptor = "Llh;")
    private class114 field2560;

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(III)Z")
    public static final boolean method983(int arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            field2561++;
            return (arg0 >> arg2 + 1 & 0x1) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(I)Llh;")
    public final class114 method984(int arg0) {
        field2547++;
        if (arg0 != -7553) {
            field2544 = null;
        }
        class114 var2 = this.field2548.field2062;
        if (this.field2548 == var2) {
            this.field2560 = null;
            return null;
        } else {
            this.field2560 = var2.field2062;
            return var2;
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(Llh;B)V")
    public final void method985(class114 arg0, byte arg1) {
        field2554++;
        if (arg0.field2054 != null) {
            arg0.method815((byte) 122);
        }
        arg0.field2054 = this.field2548.field2054;
        arg0.field2062 = this.field2548;
        arg0.field2054.field2062 = arg0;
        arg0.field2062.field2054 = arg0;
        if (arg1 != 27) {
            field2551 = 91;
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(IIZII[Lme;)V")
    public static final void method986(int arg0, int arg1, boolean arg2, int arg3, int arg4, class44[] arg5) {
        field2542++;
        for (int var6 = 0; var6 < arg5.length; var6++) {
            class44 var7 = arg5[var6];
            if (var7 != null && var7.field885 == arg4) {
                class230.method1501((byte) -16, arg0, arg2, var7, arg3);
                class206.method1392(26483, arg3, var7, arg0);
                if ((var7.field947 - var7.field981) < var7.field873) {
                    var7.field873 = var7.field947 - var7.field981;
                }
                if (var7.field992 > var7.field991 - var7.field926) {
                    var7.field992 = var7.field991 - var7.field926;
                }
                if (var7.field992 < 0) {
                    var7.field992 = 0;
                }
                if (var7.field873 < 0) {
                    var7.field873 = 0;
                }
                if (var7.field871 == 0) {
                    class229.method1496(arg2, (byte) 91, var7);
                }
            }
        }
        if (arg1 <= 1) {
            field2557 = null;
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(II)I")
    public static final int method987(int arg0, int arg1) {
        field2558++;
        if (arg1 != 12417) {
            field2550 = null;
        }
        return arg0 & 0xFF;
    }

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "(I)V")
    public static void method988(int arg0) {
        field2552 = null;
        if (arg0 == 24693) {
            field2544 = null;
            field2557 = null;
            field2550 = null;
            field2549 = null;
        }
    }

    @OriginalMember(owner = "client!uh", name = "c", descriptor = "(I)V")
    public final void method989(int arg0) {
        field2553++;
        if (arg0 != -11937) {
            return;
        }
        while (true) {
            class114 var2 = this.field2548.field2062;
            if (this.field2548 == var2) {
                this.field2560 = null;
                return;
            }
            var2.method815((byte) 124);
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(IIB)V")
    public static final void method990(int arg0, int arg1, byte arg2) {
        field2556++;
        class161 var3 = class80.method603(arg2 - 6, arg0);
        int var4 = var3.field2826;
        int var5 = var3.field2816;
        int var6 = var3.field2825;
        if (arg2 != -121) {
            field2549 = null;
        }
        int var7 = class28.field538[var6 - var5];
        if (arg1 < 0 || arg1 > var7) {
            arg1 = 0;
        }
        int var8 = var7 << var5;
        class213.method1433(var8 & arg1 << var5 | ~var8 & class117.field2100[var4], var4, 256);
    }

    @OriginalMember(owner = "client!uh", name = "d", descriptor = "(I)Llh;")
    public final class114 method991(int arg0) {
        class114 var2 = this.field2560;
        if (arg0 < 100) {
            return null;
        }
        field2559++;
        if (this.field2548 == var2) {
            this.field2560 = null;
            return null;
        } else {
            this.field2560 = var2.field2062;
            return var2;
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(B[B)Ljb;")
    public static final class107 method992(byte arg0, byte[] arg1) {
        int var2 = -14 % ((-arg0 - 71) / 41);
        field2555++;
        if (arg1 == null) {
            return null;
        } else {
            class240 var3 = new class240(arg1, class57.field1212, class154.field2701, class72.field1411, class193.field3287, class137.field2454);
            class126.method875(false);
            return var3;
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(Llh;ZLlh;)V")
    public final void method993(class114 arg0, boolean arg1, class114 arg2) {
        if (arg0.field2054 != null) {
            arg0.method815((byte) 120);
        }
        arg0.field2062 = arg2.field2062;
        field2546++;
        if (arg1) {
            this.method985((class114) null, (byte) 113);
        }
        arg0.field2054 = arg2;
        arg0.field2054.field2062 = arg0;
        arg0.field2062.field2054 = arg0;
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(BLlh;)V")
    public final void method994(byte arg0, class114 arg1) {
        field2545++;
        if (arg1.field2054 != null) {
            arg1.method815((byte) -59);
        }
        arg1.field2054 = this.field2548;
        arg1.field2062 = this.field2548.field2062;
        arg1.field2054.field2062 = arg1;
        if (arg0 == -42) {
            arg1.field2062.field2054 = arg1;
        }
    }

    @OriginalMember(owner = "client!uh", name = "e", descriptor = "(I)Llh;")
    public final class114 method995(int arg0) {
        if (arg0 != -1) {
            this.method994((byte) 2, (class114) null);
        }
        field2543++;
        class114 var2 = this.field2548.field2062;
        if (this.field2548 == var2) {
            return null;
        } else {
            var2.method815((byte) 122);
            return var2;
        }
    }

    @OriginalMember(owner = "client!uh", name = "<init>", descriptor = "()V")
    public class146() {
        this.field2548.field2062 = this.field2548;
        this.field2548.field2054 = this.field2548;
    }
}
