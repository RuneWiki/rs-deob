import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oj")
public class class294 {

    @OriginalMember(owner = "client!oj", name = "g", descriptor = "I")
    public static int field4657 = 0;

    @OriginalMember(owner = "client!oj", name = "e", descriptor = "[I")
    public static int[] field4655 = new int[256];

    @OriginalMember(owner = "client!oj", name = "f", descriptor = "Lgg;")
    public static class61 field4656 = new class61(8);

    @OriginalMember(owner = "client!oj", name = "l", descriptor = "Z")
    public static boolean field4662 = false;

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "I")
    public static int field4651;

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "I")
    public static int field4652;

    @OriginalMember(owner = "client!oj", name = "c", descriptor = "I")
    public int field4653;

    @OriginalMember(owner = "client!oj", name = "d", descriptor = "I")
    public static int field4654;

    @OriginalMember(owner = "client!oj", name = "h", descriptor = "I")
    public static int field4658;

    @OriginalMember(owner = "client!oj", name = "i", descriptor = "I")
    public int field4659;

    @OriginalMember(owner = "client!oj", name = "j", descriptor = "I")
    public int field4660;

    @OriginalMember(owner = "client!oj", name = "k", descriptor = "I")
    public static int field4661;

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(I)V")
    public static void method1964(int arg0) {
        field4655 = null;
        if (arg0 > 34) {
            field4656 = null;
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(ILhi;B)V")
    private final void method1965(int arg0, class264 arg1, byte arg2) {
        field4661++;
        if (arg2 >= 30 && arg0 == 1) {
            this.field4660 = arg1.method1777(-61);
            this.field4653 = arg1.method1779(-50);
            this.field4659 = arg1.method1779(-124);
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(IIB)V")
    public static final void method1966(int arg0, int arg1, byte arg2) {
        field4654++;
        class48 var3 = class244.field3913[class28.field336][arg0][arg1];
        if (var3 == null) {
            class267.method1813(class28.field336, arg0, arg1);
            return;
        }
        int var4 = -99999999;
        class266 var5 = null;
        for (class266 var6 = (class266) var3.method365(3); var6 != null; var6 = (class266) var3.method372((byte) 7)) {
            class208 var13 = class64.method514(var6.field4312.field3250, 0);
            int var14 = var13.field3405;
            if (var13.field3360 == 1) {
                var14 = (var6.field4312.field3245 + 1) * var14;
            }
            if (var4 < var14) {
                var4 = var14;
                var5 = var6;
            }
        }
        if (var5 == null) {
            class267.method1813(class28.field336, arg0, arg1);
            return;
        }
        class202 var7 = null;
        class202 var8 = null;
        var3.method368(var5, 76);
        for (class266 var9 = (class266) var3.method365(3); var9 != null; var9 = (class266) var3.method372((byte) 7)) {
            class202 var12 = var9.field4312;
            if (var5.field4312.field3250 != var12.field3250) {
                if (var7 == null) {
                    var7 = var12;
                }
                if (var7.field3250 != var12.field3250 && var8 == null) {
                    var8 = var12;
                }
            }
        }
        long var10 = (long) ((arg1 << 7) + arg0 + 1610612736);
        if (arg2 < -118) {
            class202.method1358(class28.field336, arg0, arg1, class220.method1461(arg0 * 128 + 64, class28.field336, arg1 * 128 + 64, 18), var5.field4312, var10, var7, var8);
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(III[B)Z")
    public static final boolean method1967(int arg0, int arg1, int arg2, byte[] arg3) {
        if (arg1 != -23) {
            method1964(-66);
        }
        field4651++;
        boolean var4 = true;
        class264 var5 = new class264(arg3);
        int var6 = -1;
        label60: while (true) {
            int var7 = var5.method1753((byte) -69);
            if (var7 == 0) {
                return var4;
            }
            var6 += var7;
            int var8 = 0;
            boolean var9 = false;
            while (true) {
                while (!var9) {
                    int var11 = var5.method1729(false);
                    if (var11 == 0) {
                        continue label60;
                    }
                    var8 += var11 - 1;
                    int var12 = var8 >> 6 & 0x3F;
                    int var13 = var8 & 0x3F;
                    int var14 = arg2 + var12;
                    int var15 = arg0 + var13;
                    int var16 = var5.method1779(arg1 ^ 0x29) >> 2;
                    if (var14 > 0 && var15 > 0 && var14 < 103 && var15 < 103) {
                        class94 var17 = class119.method842(-5, var6);
                        if (var16 != 22 || class205.field3279 || var17.field1360 != 0 || var17.field1355 == 1 || var17.field1342) {
                            if (!var17.method670(65535)) {
                                var4 = false;
                                class7.field106++;
                            }
                            var9 = true;
                        }
                    }
                }
                int var10 = var5.method1729(false);
                if (var10 == 0) {
                    break;
                }
                var5.method1779(-95);
            }
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(III)J")
    public static final long method1968(int arg0, int arg1, int arg2) {
        class99 var3 = class273.field4415[arg0][arg1][arg2];
        return var3 == null || var3.field1494 == null ? 0L : var3.field1494.field3157;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(BLhi;)V")
    public final void method1969(byte arg0, class264 arg1) {
        if (arg0 < 88) {
            return;
        }
        field4652++;
        while (true) {
            int var3 = arg1.method1779(-57);
            if (var3 == 0) {
                return;
            }
            this.method1965(var3, arg1, (byte) 89);
        }
    }
}
