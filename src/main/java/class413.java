import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!am")
public class class413 {

    @OriginalMember(owner = "client!am", name = "a", descriptor = "[Lnh;")
    public static class487[] field5644 = new class487[2048];

    @OriginalMember(owner = "client!am", name = "c", descriptor = "Loj;")
    public static class235 field5646 = new class235(2);

    @OriginalMember(owner = "client!am", name = "g", descriptor = "[C")
    public static char[] field5650 = new char[] { '[', ']', '#' };

    @OriginalMember(owner = "client!am", name = "h", descriptor = "I")
    public static int field5651 = 0;

    @OriginalMember(owner = "client!am", name = "j", descriptor = "I")
    public static int field5653 = 0;

    @OriginalMember(owner = "client!am", name = "b", descriptor = "I")
    public static int field5645;

    @OriginalMember(owner = "client!am", name = "d", descriptor = "I")
    public static int field5647;

    @OriginalMember(owner = "client!am", name = "e", descriptor = "I")
    public static int field5648;

    @OriginalMember(owner = "client!am", name = "f", descriptor = "Ljd;")
    public static class139 field5649;

    @OriginalMember(owner = "client!am", name = "i", descriptor = "[I")
    public static int[] field5652;

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(BII)V", line = 4)
    public static final void method2475(byte arg0, int arg1, int arg2) {
        if ((class55.field739 < class55.field744)) {
            class55.field739 = (float) ((double) class55.field739 / 30.0D + (double) class55.field739);
            if (class55.field739 > class55.field744) {
                class55.field739 = class55.field744;
            }
            class346.method2132(0);
            class55.field737 = (int) class55.field739 >> 1;
            class55.field741 = class282.method1598(class55.field737, 127);
        } else if (class55.field744 < class55.field739) {
            class55.field739 = (float) ((double) class55.field739 - (double) class55.field739 / 30.0D);
            if (class55.field744 > class55.field739) {
                class55.field739 = class55.field744;
            }
            class346.method2132(0);
            class55.field737 = (int) class55.field739 >> 1;
            class55.field741 = class282.method1598(class55.field737, 121);
        }
        field5647++;
        int var3 = -96 / ((-arg0 - 45) / 32);
        if (class304.field4034 != -1 && class222.field2959 != -1) {
            int var4 = class304.field4034 - class370.field5065;
            if (var4 < 2 || var4 > 2) {
                var4 /= 8;
            }
            int var5 = class222.field2959 - class432.field5889;
            class370.field5065 += var4;
            if (var5 < 2 || var5 > 2) {
                var5 /= 8;
            }
            class432.field5889 += var5;
            if (var4 == 0 && var5 == 0) {
                class304.field4034 = -1;
                class222.field2959 = -1;
            }
            class346.method2132(0);
        }
        if (class134.field1953 <= 0) {
            class15.field215 = -1;
            class464.field6405 = -1;
        } else {
            class308.field4076--;
            if (class308.field4076 == 0) {
                class308.field4076 = 100;
                class134.field1953--;
            }
        }
        if (!class158.field2175 || class271.field3611 == null) {
            return;
        }
        for (class392 var6 = (class392) class271.field3611.method652((byte) 37); var6 != null; var6 = (class392) class271.field3611.method653(92)) {
            class313 var7 = class55.field735.method2710(26, var6.field5444.field2775);
            if (var6.method2398(arg1, (byte) -20, arg2)) {
                if (var7.field4158 != null) {
                    if (var7.field4158[4] != null) {
                        class402.method2436(-1, true, 0, false, (byte) 101, var7.field4158[4], var7.field4139, 1007, var7.field4152, -1, (long) var6.field5444.field2775);
                    }
                    if (var7.field4158[3] != null) {
                        class402.method2436(-1, true, 0, false, (byte) 115, var7.field4158[3], var7.field4139, 1003, var7.field4152, -1, (long) var6.field5444.field2775);
                    }
                    if (var7.field4158[2] != null) {
                        class402.method2436(-1, true, 0, false, (byte) 96, var7.field4158[2], var7.field4139, 1012, var7.field4152, -1, (long) var6.field5444.field2775);
                    }
                    if (var7.field4158[1] != null) {
                        class402.method2436(-1, true, 0, false, (byte) 104, var7.field4158[1], var7.field4139, 1002, var7.field4152, -1, (long) var6.field5444.field2775);
                    }
                    if (var7.field4158[0] != null) {
                        class402.method2436(-1, true, 0, false, (byte) 93, var7.field4158[0], var7.field4139, 1008, var7.field4152, -1, (long) var6.field5444.field2775);
                    }
                }
                if (!var6.field5444.field2770) {
                    var6.field5444.field2770 = true;
                    class382.method2345(class79.field1069, var6.field5444.field2775, var7.field4139);
                }
                if (var6.field5444.field2770) {
                    class382.method2345(class428.field5789, var6.field5444.field2775, var7.field4139);
                }
            } else if (var6.field5444.field2770) {
                var6.field5444.field2770 = false;
                class382.method2345(class437.field5929, var6.field5444.field2775, var7.field4139);
            }
        }
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(B)V", line = 141)
    public static void method2476(byte arg0) {
        field5652 = null;
        field5644 = null;
        field5646 = null;
        if (arg0 != -22) {
            method2476((byte) 18);
        }
        field5649 = null;
        field5650 = null;
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(I)V", line = 161)
    public static final void method2477(int arg0) {
        field5648++;
        for (class279 var1 = (class279) class192.field2607.method652((byte) 37); var1 != null; var1 = (class279) class192.field2607.method653(58)) {
            if (var1.field3696) {
                var1.method1575(false);
            }
        }
        for (class279 var2 = (class279) class94.field1395.method652((byte) 37); var2 != null; var2 = (class279) class94.field1395.method653(44)) {
            if (var2.field3696) {
                var2.method1575(false);
            }
        }
        if (arg0 > -28) {
            method2477(-73);
        }
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(III)Lgq;", line = 204)
    public static final class327 method2478(int arg0, int arg1, int arg2) {
        class491 var3 = class289.field3897[arg0][arg1][arg2];
        return var3 == null ? null : var3.field6864;
    }
}
