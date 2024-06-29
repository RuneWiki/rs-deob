import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public abstract class class102 {

    @OriginalMember(owner = "client!ra", name = "f", descriptor = "I")
    public static int field2647 = 0;

    @OriginalMember(owner = "client!ra", name = "c", descriptor = "I")
    public static int field2644 = -1;

    @OriginalMember(owner = "client!ra", name = "k", descriptor = "Lke;")
    public static class65 field2652 = class1.method17(":0", -117);

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "Lke;")
    public static class65 field2643 = class1.method17("backbase1", -115);

    @OriginalMember(owner = "client!ra", name = "n", descriptor = "Lke;")
    private static class65 field2655 = class1.method17("Loading config )2 ", -121);

    @OriginalMember(owner = "client!ra", name = "i", descriptor = "Lke;")
    public static class65 field2650 = field2655;

    @OriginalMember(owner = "client!ra", name = "o", descriptor = "Lke;")
    private static class65 field2656 = class1.method17("Click to continue", -116);

    @OriginalMember(owner = "client!ra", name = "p", descriptor = "Lke;")
    public static class65 field2657 = field2656;

    @OriginalMember(owner = "client!ra", name = "r", descriptor = "Lke;")
    private static class65 field2659 = class1.method17("Try again in 60 secs)3)3)3", -112);

    @OriginalMember(owner = "client!ra", name = "h", descriptor = "Lke;")
    public static class65 field2649 = field2659;

    @OriginalMember(owner = "client!ra", name = "j", descriptor = "I")
    public static int field2651 = 1;

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "I")
    public static int field2642;

    @OriginalMember(owner = "client!ra", name = "e", descriptor = "I")
    public static int field2646;

    @OriginalMember(owner = "client!ra", name = "g", descriptor = "I")
    public static int field2648;

    @OriginalMember(owner = "client!ra", name = "l", descriptor = "I")
    public static int field2653;

    @OriginalMember(owner = "client!ra", name = "q", descriptor = "I")
    public static int field2658;

    @OriginalMember(owner = "client!ra", name = "d", descriptor = "Lqc;")
    public static class98 field2645;

    @OriginalMember(owner = "client!ra", name = "m", descriptor = "Z")
    public static boolean field2654;

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(Z)V", line = 3)
    public static void method845(boolean arg0) {
        field2643 = null;
        field2659 = null;
        field2652 = null;
        field2657 = null;
        field2645 = null;
        field2655 = null;
        if (arg0) {
            field2649 = null;
        }
        field2650 = null;
        field2649 = null;
        field2656 = null;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(III)I", line = 29)
    public static final int method846(int arg0, int arg1, int arg2) {
        field2653++;
        int var3 = arg2 * 57 + arg1;
        int var4 = var3 << 13 ^ var3;
        int var5 = (var4 * var4 * 15731 + 789221) * var4 + 1376312589 & Integer.MAX_VALUE;
        return arg0 == -201750093 ? var5 >> 19 & 0xFF : 123;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(II[BI)Z", line = 45)
    public static final boolean method847(int arg0, int arg1, byte[] arg2, int arg3) {
        field2646++;
        boolean var4 = true;
        if (arg3 != 0) {
            method845(true);
        }
        class39 var5 = new class39(arg2);
        int var6 = -1;
        label69: while (true) {
            int var7 = var5.method311((byte) -81);
            if (var7 == 0) {
                return var4;
            }
            var6 += var7;
            int var8 = 0;
            boolean var9 = false;
            while (true) {
                int var13;
                class19 var16;
                do {
                    int var14;
                    int var15;
                    do {
                        do {
                            do {
                                do {
                                    while (var9) {
                                        int var17 = var5.method311((byte) -126);
                                        if (var17 == 0) {
                                            continue label69;
                                        }
                                        var5.method334(arg3 ^ 0x71);
                                    }
                                    int var10 = var5.method311((byte) -104);
                                    if (var10 == 0) {
                                        continue label69;
                                    }
                                    var8 += var10 - 1;
                                    int var11 = var8 & 0x3F;
                                    int var12 = var8 >> 6 & 0x3F;
                                    var13 = var5.method334(107) >> 2;
                                    var14 = arg0 + var12;
                                    var15 = var11 + arg1;
                                } while (var14 <= 0);
                            } while (var15 <= 0);
                        } while (var14 >= 103);
                    } while (var15 >= 103);
                    var16 = class54.method435(32247, var6);
                } while (var13 == 22 && class41.field1065 && var16.field453 == 0 && !var16.field469);
                var9 = true;
                if (!var16.method152(10087)) {
                    var4 = false;
                    class24.field575++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(BLjd;I)Z", line = 139)
    public static final boolean method848(byte arg0, class58 arg1, int arg2) {
        field2648++;
        int var3 = -79 / ((arg0 - 44) / 46);
        byte[] var4 = arg1.method476(-116, arg2);
        if (var4 == null) {
            return false;
        } else {
            class114.method937(var4, -20);
            return true;
        }
    }

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "(Z)V")
    public abstract void method60(boolean arg0);

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(I)V")
    public abstract void method62(int arg0);

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(ZII)I")
    public abstract int method61(boolean arg0, int arg1, int arg2);
}
