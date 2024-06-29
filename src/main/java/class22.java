import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public abstract class class22 {

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "I")
    public int field387;

    @OriginalMember(owner = "client!ad", name = "d", descriptor = "I")
    public int field389;

    @OriginalMember(owner = "client!ad", name = "h", descriptor = "I")
    public int field393;

    @OriginalMember(owner = "client!ad", name = "i", descriptor = "[I")
    public static int[] field394 = new int[] { -1, 0, -1, 0, 0, 4, 0, 0, 0, 0, -1, 14, 1, 0, 0, 0, 0, 0, 0, 6, 0, 0, 4, -2, 0, 0, 0, -1, 15, 0, 0, 12, 4, 0, 0, -2, 0, 0, 0, 0, 6, 0, 0, 0, 0, 10, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 15, 0, 0, 0, 7, 2, 0, 1, 0, 6, 6, 3, 4, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 5, 9, 0, 3, 0, 0, 0, 2, 0, 0, 0, 0, 2, 3, 6, 8, -2, 0, 0, 5, 3, 0, 0, 0, -1, 0, 0, 0, -1, 0, 7, 0, 7, 0, 0, 0, 6, 8, 24, -2, 1, 0, 0, 0, 0, -1, 5, 5, 6, -1, 0, 0, 0, 0, 0, 0, 0, 0, 6, 0, -2, 0, 6, 0, 0, 0, -2, 0, 0, 4, 0, 5, 0, 10, 2, 0, 0, 10, 0, 0, 0, -2, 0, 0, 6, 1, 0, 0, 0, 7, 0, 0, 6, 0, 0, 0, 0, -2, 0, 0, 0, 0, 4, 2, 0, 0, 0, 0, 0, -1, 0, 0, 1, 0, 4, 0, 2, 6, 0, 0, 0, -2, 0, -1, -1, 0, 0, 3, 6, 0, 0, 8, 0, 0, 5, 5, -1, 0, 0, 0, 0, -1, 20, -2, 0, 0, 0, 3, 0, 0, -2, 0, 4, 0, -2, 0, 0, 8, 0, 0, -2, 0, 4, 0, 0, 0, -2, 0, 0, -1, 0, 0, 0, 0, 0, -1 };

    @OriginalMember(owner = "client!ad", name = "k", descriptor = "Lsc;")
    public static class181 field396 = class149.method967(255, "Ausw-=hlen");

    @OriginalMember(owner = "client!ad", name = "j", descriptor = "[I")
    public static int[] field395 = new int[500];

    @OriginalMember(owner = "client!ad", name = "c", descriptor = "F")
    public static float field388;

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "I")
    public static int field386;

    @OriginalMember(owner = "client!ad", name = "e", descriptor = "I")
    public static int field390;

    @OriginalMember(owner = "client!ad", name = "f", descriptor = "I")
    public static int field391;

    @OriginalMember(owner = "client!ad", name = "g", descriptor = "I")
    public static int field392;

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(I)V")
    public static void method197(int arg0) {
        if (arg0 == 0) {
            field394 = null;
            field396 = null;
            field395 = null;
        }
    }

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "(I)V")
    public static final void method198(int arg0) {
        field390++;
        if (!class102.field1700) {
            return;
        }
        class239.field4162 = null;
        class102.field1700 = false;
        if (arg0 != -20698) {
            method198(78);
        }
        class100.field1678 = null;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(III)V")
    public abstract void method199(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(IBI)V")
    public abstract void method200(int arg0, byte arg1, int arg2);

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(IILdi;II)V")
    public static final void method201(int arg0, int arg1, class64 arg2, int arg3, int arg4) {
        field386++;
        if (class131.field2177 >= 400) {
            return;
        }
        if (arg2.field1050 != null) {
            arg2 = arg2.method458((byte) -54);
        }
        if (arg4 != 635 || arg2 == null || !arg2.field1030) {
            return;
        }
        class181 var5 = arg2.field1025;
        if (arg2.field1037 != 0) {
            var5 = class175.method1164(new class181[] { var5, class250.method1698(class258.field4507.field1919, arg2.field1037, (byte) -57), class200.field3459, class116.field1906, class169.method1119((byte) 77, arg2.field1037), class238.field4136 }, (byte) 124);
        }
        if (class216.field3710 == 1) {
            class95.field1527++;
            class199.method1348(class175.method1164(new class181[] { class208.field3568, class42.field634, var5 }, (byte) 127), true, arg0, (short) 46, arg3, (long) arg1, class52.field830);
        } else if (!class220.field3781) {
            class181[] var6 = arg2.field1029;
            if (class73.field1170) {
                var6 = class149.method971((byte) -115, var6);
            }
            class116.field1901++;
            if (var6 != null) {
                for (int var7 = 4; var7 >= 0; var7--) {
                    if (var6[var7] != null && (class65.field1069 != 0 || !var6[var7].method1227(arg4 ^ 0x77F6, class146.field2402))) {
                        class242.field4204++;
                        byte var8 = 0;
                        if (var7 == 0) {
                            var8 = 25;
                        }
                        if (var7 == 1) {
                            var8 = 26;
                        }
                        if (var7 == 2) {
                            var8 = 18;
                        }
                        if (var7 == 3) {
                            var8 = 1;
                        }
                        if (var7 == 4) {
                            var8 = 29;
                        }
                        class199.method1348(class175.method1164(new class181[] { class58.field872, var5 }, (byte) 126), true, arg0, var8, arg3, (long) arg1, var6[var7]);
                    }
                }
            }
            if (class65.field1069 == 0 && var6 != null) {
                for (int var9 = 4; var9 >= 0; var9--) {
                    if (var6[var9] != null && var6[var9].method1227(30093, class146.field2402)) {
                        short var10 = 0;
                        class159.field2719++;
                        if (arg2.field1037 > class258.field4507.field1919) {
                            var10 = 2000;
                        }
                        short var11 = 0;
                        if (var9 == 0) {
                            var11 = 25;
                        }
                        if (var9 == 1) {
                            var11 = 26;
                        }
                        if (var9 == 2) {
                            var11 = 18;
                        }
                        if (var9 == 3) {
                            var11 = 1;
                        }
                        if (var9 == 4) {
                            var11 = 29;
                        }
                        if (var11 != 0) {
                            var11 += var10;
                        }
                        class199.method1348(class175.method1164(new class181[] { class58.field872, var5 }, (byte) 125), true, arg0, var11, arg3, (long) arg1, var6[var9]);
                    }
                }
            }
            class199.method1348(class175.method1164(new class181[] { class58.field872, var5 }, (byte) 125), true, arg0, (short) 1002, arg3, (long) arg1, class20.field353);
            return;
        } else if ((class121.field1974 & 0x2) == 2) {
            class58.field877++;
            class199.method1348(class175.method1164(new class181[] { class166.field2817, class42.field634, var5 }, (byte) 123), true, arg0, (short) 48, arg3, (long) arg1, class177.field3113);
            return;
        }
    }

    @OriginalMember(owner = "client!ad", name = "<init>", descriptor = "(III)V")
    public class22(int arg0, int arg1, int arg2) {
        this.field387 = arg0;
        this.field389 = arg1;
        this.field393 = arg2;
    }

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "(III)V")
    public abstract void method202(int arg0, int arg1, int arg2);
}
