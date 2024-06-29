import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qh")
public class class263 {

    @OriginalMember(owner = "client!qh", name = "c", descriptor = "Lqd;")
    public static class37 field3956 = new class37(500);

    @OriginalMember(owner = "client!qh", name = "g", descriptor = "[Lja;")
    public static class55[] field3960 = new class55[0];

    @OriginalMember(owner = "client!qh", name = "k", descriptor = "[I")
    public static int[] field3964 = new int[100];

    @OriginalMember(owner = "client!qh", name = "i", descriptor = "[[I")
    public static int[][] field3962 = new int[104][104];

    @OriginalMember(owner = "client!qh", name = "m", descriptor = "Ljava/lang/String;")
    public static String field3966 = "green:";

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "I")
    public static int field3954;

    @OriginalMember(owner = "client!qh", name = "b", descriptor = "I")
    public static int field3955;

    @OriginalMember(owner = "client!qh", name = "d", descriptor = "I")
    public static int field3957;

    @OriginalMember(owner = "client!qh", name = "e", descriptor = "I")
    public static int field3958;

    @OriginalMember(owner = "client!qh", name = "f", descriptor = "I")
    public static int field3959;

    @OriginalMember(owner = "client!qh", name = "j", descriptor = "I")
    public static int field3963;

    @OriginalMember(owner = "client!qh", name = "h", descriptor = "[[B")
    public static byte[][] field3961;

    @OriginalMember(owner = "client!qh", name = "l", descriptor = "[[B")
    public static byte[][] field3965;

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(B)V")
    public static void method1746(byte arg0) {
        field3965 = null;
        field3956 = null;
        if (arg0 != -104) {
            field3964 = null;
        }
        field3960 = null;
        field3962 = null;
        field3964 = null;
        field3966 = null;
        field3961 = null;
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(IB)V")
    public static final void method1747(int arg0, byte arg1) {
        class270 var2 = class190.method1213(25702, arg0, 6);
        var2.method1806(-8173);
        field3958++;
        if (arg1 > -40) {
            field3960 = null;
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(III)Lje;")
    public static final class62 method1748(int arg0, int arg1, int arg2) {
        class131 var3 = class16.field233[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class62 var4 = var3.field1931;
            var3.field1931 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(ZI)Lle;")
    public static final class214 method1749(boolean arg0, int arg1) {
        field3957++;
        class214 var2 = (class214) class15.field224.method1501((long) arg1, (byte) -5);
        if (var2 != null) {
            return var2;
        }
        byte[] var3;
        if (arg1 >= 32768) {
            var3 = class156.field2282.method1538(0, arg1 & 0x7FFF, (byte) 62);
        } else {
            var3 = class192.field2739.method1538(0, arg1, (byte) 118);
        }
        class214 var4 = new class214();
        if (var3 != null) {
            var4.method1365(new class114(var3), (byte) -73);
        }
        if (arg1 >= 32768) {
            var4.method1368((byte) -46);
        }
        if (arg0) {
            field3964 = null;
        }
        class15.field224.method1499((long) arg1, -92, var4);
        return var4;
    }

    @OriginalMember(owner = "client!qh", name = "b", descriptor = "(ZI)V")
    public static final void method1750(boolean arg0, int arg1) {
        class155.field2272 = arg0;
        field3963++;
        if (arg1 != 0) {
            field3964 = null;
        }
        class168.field2441 = !class202.method1310(false);
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(II[BI)Z")
    public static final boolean method1751(int arg0, int arg1, byte[] arg2, int arg3) {
        field3955++;
        if (arg3 != -1792250120) {
            method1746((byte) 20);
        }
        boolean var4 = true;
        int var5 = -1;
        class114 var6 = new class114(arg2);
        label60: while (true) {
            int var7 = var6.method793((byte) -3);
            if (var7 == 0) {
                return var4;
            }
            var5 += var7;
            int var8 = 0;
            boolean var9 = false;
            while (true) {
                while (!var9) {
                    int var11 = var6.method787((byte) 122);
                    if (var11 == 0) {
                        continue label60;
                    }
                    var8 += var11 - 1;
                    int var12 = var8 & 0x3F;
                    int var13 = var8 >> 6 & 0x3F;
                    int var14 = arg0 + var13;
                    int var15 = var6.method760(false) >> 2;
                    int var16 = var12 + arg1;
                    if (var14 > 0 && var16 > 0 && var14 < 103 && var16 < 103) {
                        class250 var17 = class91.method618(117, var5);
                        if (var15 != 22 || class48.field695 || var17.field3764 != 0 || var17.field3820 == 1 || var17.field3747) {
                            if (!var17.method1654(arg3 + 1792250130)) {
                                class264.field3973++;
                                var4 = false;
                            }
                            var9 = true;
                        }
                    }
                }
                int var10 = var6.method787((byte) -43);
                if (var10 == 0) {
                    break;
                }
                var6.method760(false);
            }
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(IILha;B)V")
    public static final void method1752(int arg0, int arg1, class267 arg2, byte arg3) {
        if (arg3 >= -126) {
            method1750(false, 11);
        }
        field3959++;
        if (class273.field4357 != null || class151.field2185 || arg2 == null || class120.method823(arg2, (byte) 13) == null) {
            return;
        }
        class273.field4357 = arg2;
        class219.field3231 = class120.method823(arg2, (byte) 13);
        class35.field504 = arg1;
        class203.field2946 = 0;
        class114.field1632 = false;
        class123.field1786 = arg0;
    }
}
