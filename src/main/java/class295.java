import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lh")
public class class295 {

    @OriginalMember(owner = "client!lh", name = "p", descriptor = "I")
    public int field4648 = 16777215;

    @OriginalMember(owner = "client!lh", name = "t", descriptor = "I")
    public int field4652 = 8;

    @OriginalMember(owner = "client!lh", name = "o", descriptor = "Ljava/lang/String;")
    public static String field4647 = "Loaded world list data";

    @OriginalMember(owner = "client!lh", name = "n", descriptor = "Z")
    public static boolean field4646 = false;

    @OriginalMember(owner = "client!lh", name = "c", descriptor = "J")
    public static volatile long field4635 = 0L;

    @OriginalMember(owner = "client!lh", name = "s", descriptor = "Z")
    public static boolean field4651 = false;

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "I")
    public static int field4633;

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "I")
    public int field4634;

    @OriginalMember(owner = "client!lh", name = "d", descriptor = "I")
    public int field4636;

    @OriginalMember(owner = "client!lh", name = "f", descriptor = "I")
    public static int field4638;

    @OriginalMember(owner = "client!lh", name = "g", descriptor = "I")
    public int field4639;

    @OriginalMember(owner = "client!lh", name = "h", descriptor = "I")
    public static int field4640;

    @OriginalMember(owner = "client!lh", name = "i", descriptor = "I")
    public int field4641;

    @OriginalMember(owner = "client!lh", name = "j", descriptor = "I")
    public static int field4642;

    @OriginalMember(owner = "client!lh", name = "l", descriptor = "I")
    public int field4644;

    @OriginalMember(owner = "client!lh", name = "m", descriptor = "I")
    public static int field4645;

    @OriginalMember(owner = "client!lh", name = "q", descriptor = "I")
    public static int field4649;

    @OriginalMember(owner = "client!lh", name = "r", descriptor = "I")
    public static int field4650;

    @OriginalMember(owner = "client!lh", name = "u", descriptor = "I")
    public static int field4653;

    @OriginalMember(owner = "client!lh", name = "e", descriptor = "Lhc;")
    public static class235 field4637;

    @OriginalMember(owner = "client!lh", name = "k", descriptor = "Z")
    public boolean field4643;

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(BII[Ljb;II[BIZII)V")
    public static final void method1973(byte arg0, int arg1, int arg2, class276[] arg3, int arg4, int arg5, byte[] arg6, int arg7, boolean arg8, int arg9, int arg10) {
        field4633++;
        int var11 = -40 % ((64 - arg0) / 50);
        class224 var12 = new class224(arg6);
        int var13 = -1;
        while (true) {
            int var14 = var12.method1469(31412);
            if (var14 == 0) {
                return;
            }
            var13 += var14;
            int var15 = 0;
            while (true) {
                int var16 = var12.method1461(true);
                if (var16 == 0) {
                    break;
                }
                var15 += var16 - 1;
                int var17 = var15 & 0x3F;
                int var18 = var15 >> 6 & 0x3F;
                int var19 = var15 >> 12;
                int var20 = var12.method1453((byte) -127);
                int var21 = var20 & 0x3;
                int var22 = var20 >> 2;
                if (arg7 == var19 && arg10 <= var18 && var18 < (arg10 + 8) && var17 >= arg4 && var17 < arg4 + 8) {
                    class111 var23 = class76.method489(var13, 102);
                    int var24 = arg9 + class265.method1735(var23.field1598, var21, var18 & 0x7, arg1, (byte) -87, var17 & 0x7, var23.field1582);
                    int var25 = arg5 + class230.method1520(var17 & 0x7, arg1, var23.field1598, (byte) -123, var18 & 0x7, var21, var23.field1582);
                    if (var24 > 0 && var25 > 0 && var24 < 103 && var25 < 103) {
                        class276 var26 = null;
                        if (!arg8) {
                            int var27 = arg2;
                            if ((class230.field3489[1][var24][var25] & 0x2) == 2) {
                                var27 = arg2 - 1;
                            }
                            if (var27 >= 0) {
                                var26 = arg3[var27];
                            }
                        }
                        class21.method160(!arg8, arg8, var26, (byte) 124, var25, arg2, var22, var24, arg2, arg1 + var21 & 0x3, var13);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(B)V")
    public static final void method1974(byte arg0) {
        field4645++;
        class281.field4359.method1864(7, (byte) -69);
        class281.field4359.method1451(0L, (byte) -24);
        class148.field2045++;
        if (arg0 != 9) {
            field4651 = true;
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(IIILql;)V")
    private final void method1975(int arg0, int arg1, int arg2, class224 arg3) {
        field4638++;
        if (arg1 != -10439) {
            this.method1975(92, 91, 75, (class224) null);
        }
        if (arg0 == 1) {
            this.field4652 = arg3.method1445(false);
        } else if (arg0 == 2) {
            this.field4643 = true;
        } else if (arg0 == 3) {
            this.field4636 = arg3.method1479(false);
            this.field4641 = arg3.method1479(false);
            this.field4639 = arg3.method1479(false);
        } else if (arg0 == 4) {
            this.field4644 = arg3.method1453((byte) -127);
        } else if (arg0 == 5) {
            this.field4634 = arg3.method1445(false);
            return;
        } else if (arg0 == 6) {
            this.field4648 = arg3.method1454(-112);
            return;
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(I)V")
    public static void method1976(int arg0) {
        field4637 = null;
        field4647 = null;
        if (arg0 != 7254) {
            field4649 = -108;
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(IILql;)V")
    public final void method1977(int arg0, int arg1, class224 arg2) {
        if (arg0 > -55) {
            method1978(63, -128, 15, -49, -71);
        }
        field4650++;
        while (true) {
            int var4 = arg2.method1453((byte) -128);
            if (var4 == 0) {
                return;
            }
            this.method1975(var4, -10439, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(IIIII)V")
    public static final void method1978(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4640++;
        if (class281.field4347 == 1) {
            class125.field1751[class21.field295 / 100].method710(class172.field2384 - 8, class74.field1038 + -8);
        }
        if (arg1 == 3) {
            if (class281.field4347 == 2) {
                class125.field1751[class21.field295 / 100 + 4].method710(class172.field2384 - 8, class74.field1038 - 8);
            }
            class249.method1673((byte) -96);
        }
    }
}
