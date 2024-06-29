import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!af")
public class class221 {

    @OriginalMember(owner = "client!af", name = "c", descriptor = "Lia;")
    public static class257 field3735 = class28.method234(122, " steht bereits auf Ihrer Ignorieren)2Liste(Q");

    @OriginalMember(owner = "client!af", name = "h", descriptor = "[I")
    public static int[] field3740 = new int[2000];

    @OriginalMember(owner = "client!af", name = "i", descriptor = "J")
    public static long field3741 = 0L;

    @OriginalMember(owner = "client!af", name = "k", descriptor = "[Lia;")
    public static class257[] field3743 = new class257[100];

    @OriginalMember(owner = "client!af", name = "m", descriptor = "Lia;")
    private static class257 field3745 = class28.method234(104, "Loading config )2 ");

    @OriginalMember(owner = "client!af", name = "o", descriptor = "Lia;")
    public static class257 field3747 = field3745;

    @OriginalMember(owner = "client!af", name = "a", descriptor = "I")
    public static int field3733;

    @OriginalMember(owner = "client!af", name = "b", descriptor = "I")
    public static int field3734;

    @OriginalMember(owner = "client!af", name = "d", descriptor = "I")
    public static int field3736;

    @OriginalMember(owner = "client!af", name = "f", descriptor = "I")
    public static int field3738;

    @OriginalMember(owner = "client!af", name = "g", descriptor = "I")
    public static int field3739;

    @OriginalMember(owner = "client!af", name = "j", descriptor = "I")
    public static int field3742;

    @OriginalMember(owner = "client!af", name = "l", descriptor = "I")
    public static int field3744;

    @OriginalMember(owner = "client!af", name = "n", descriptor = "I")
    public static int field3746;

    @OriginalMember(owner = "client!af", name = "p", descriptor = "I")
    public static int field3748;

    @OriginalMember(owner = "client!af", name = "e", descriptor = "[[[B")
    public static byte[][][] field3737;

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(I[Lme;I)V")
    public static final void method1454(int arg0, class44[] arg1, int arg2) {
        field3734++;
        if (arg2 < 76) {
            method1455(-28);
        }
        for (int var3 = 0; var3 < arg1.length; var3++) {
            class44 var4 = arg1[var3];
            if (var4 != null) {
                if (var4.field871 == 0) {
                    if (var4.field1015 != null) {
                        method1454(arg0, var4.field1015, 97);
                    }
                    class157 var5 = (class157) class136.field2426.method434((byte) -93, (long) var4.field935);
                    if (var5 != null) {
                        class253.method1652(-15970, var5.field2746, arg0);
                    }
                }
                if (arg0 == 0 && var4.field879 != null) {
                    class164 var6 = new class164();
                    var6.field2864 = var4;
                    var6.field2867 = var4.field879;
                    class57.method441(var6, -10305);
                }
                if (arg0 == 1 && var4.field908 != null) {
                    if (var4.field890 >= 0) {
                        class44 var7 = method1456(var4.field935, (byte) -20);
                        if (var7 == null || var7.field1015 == null || var7.field1015.length <= var4.field890 || var7.field1015[var4.field890] != var4) {
                            continue;
                        }
                    }
                    class164 var8 = new class164();
                    var8.field2864 = var4;
                    var8.field2867 = var4.field908;
                    class57.method441(var8, -10305);
                }
            }
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(I)V")
    public static final void method1455(int arg0) {
        while (true) {
            if (class40.field827.method910((byte) 45, class209.field3582) >= 11) {
                int var1 = class40.field827.method909(11, (byte) -122);
                if (var1 != 2047) {
                    boolean var2 = false;
                    if (class55.field1180[var1] == null) {
                        var2 = true;
                        class55.field1180[var1] = new class180();
                        if (class91.field1735[var1] != null) {
                            class55.field1180[var1].method1237(false, class91.field1735[var1]);
                        }
                    }
                    class132.field2362[class231.field3880++] = var1;
                    class180 var3 = class55.field1180[var1];
                    var3.field4180 = class7.field153;
                    int var4 = class40.field827.method909(1, (byte) -102);
                    int var5 = class40.field827.method909(1, (byte) -126);
                    if (var5 == 1) {
                        class210.field3591[class212.field3628++] = var1;
                    }
                    int var6 = class245.field4258[class40.field827.method909(3, (byte) -128)];
                    if (var2) {
                        var3.field4125 = var3.field4118 = var6;
                    }
                    int var7 = class40.field827.method909(5, (byte) -115);
                    int var8 = class40.field827.method909(5, (byte) -104);
                    if (var8 > 15) {
                        var8 -= 32;
                    }
                    if (var7 > 15) {
                        var7 -= 32;
                    }
                    var3.method1586(class137.field2441.field4119[0] + var7, var4 == 1, class137.field2441.field4182[0] + var8, (byte) 41);
                    continue;
                }
            }
            field3742++;
            if (arg0 != 8) {
                return;
            }
            class40.field827.method911(false);
            return;
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(IB)Lme;")
    public static final class44 method1456(int arg0, byte arg1) {
        field3746++;
        int var2 = arg0 >> 16;
        int var3 = arg0 & 0xFFFF;
        if (arg1 > -6) {
            field3735 = null;
        }
        if (class28.field539[var2] == null || class28.field539[var2][var3] == null) {
            boolean var4 = class31.method258(var2, 0);
            if (!var4) {
                return null;
            }
        }
        return class28.field539[var2][var3];
    }

    @OriginalMember(owner = "client!af", name = "b", descriptor = "(I)V")
    public static final void method1457(int arg0) {
        field3748++;
        System.out.println("Usage: worldid, <live/office/local>, <live/rc/wip>, <software/hardware>, <free/members>, <english/german>, <game0/game1> [safemode]");
        System.exit(1);
        if (arg0 != -1) {
            field3741 = 25L;
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(BLia;)I")
    public static final int method1458(byte arg0, class257 arg1) {
        field3744++;
        return arg0 < 73 ? -98 : arg1.method1679((byte) 112) + 1;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(ILmb;)V")
    public static final void method1459(int arg0, class178 arg1) {
        class59.field1250 = arg1;
        field3733++;
        int var2 = 108 / ((30 - arg0) / 61);
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(ZI)Lrc;")
    public static final class73 method1460(boolean arg0, int arg1) {
        field3736++;
        class73 var2 = (class73) class184.field3195.method615(arg0, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class59.field1250.method1197(arg1, 5, -2);
        class73 var4 = new class73();
        if (var3 != null) {
            var4.method544(new class152(var3), 0);
        }
        class184.field3195.method619((byte) -126, var4, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(II)I")
    public static final int method1461(int arg0, int arg1) {
        field3738++;
        int var2 = 0;
        if (arg0 < 0 || arg0 >= 65536) {
            var2 += 16;
            arg0 >>>= 0x10;
        }
        if (arg0 >= 256) {
            var2 += 8;
            arg0 >>>= 0x8;
        }
        if (arg0 >= 16) {
            var2 += 4;
            arg0 >>>= 0x4;
        }
        if (arg0 >= 4) {
            var2 += 2;
            arg0 >>>= 0x2;
        }
        if (arg0 >= 1) {
            var2++;
            arg0 >>>= 0x1;
        }
        if (arg1 != -32184) {
            field3743 = null;
        }
        return arg0 + var2;
    }

    @OriginalMember(owner = "client!af", name = "c", descriptor = "(I)V")
    public static void method1462(int arg0) {
        if (arg0 != -14742) {
            method1462(69);
        }
        field3740 = null;
        field3745 = null;
        field3743 = null;
        field3735 = null;
        field3737 = null;
        field3747 = null;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(IIBLmb;Lmb;)Ljb;")
    public static final class107 method1463(int arg0, int arg1, byte arg2, class178 arg3, class178 arg4) {
        field3739++;
        if (class156.method1093(arg0, 104, arg1, arg3)) {
            if (arg2 != 123) {
                method1458((byte) 31, (class257) null);
            }
            return class146.method992((byte) -123, arg4.method1197(arg1, arg0, -2));
        } else {
            return null;
        }
    }
}
