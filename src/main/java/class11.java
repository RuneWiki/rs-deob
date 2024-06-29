import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public class class11 extends class99 {

    @OriginalMember(owner = "client!bc", name = "ab", descriptor = "I")
    public static int field288 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "client!bc", name = "cb", descriptor = "I")
    public static int field290 = 1;

    @OriginalMember(owner = "client!bc", name = "T", descriptor = "I")
    public int field281;

    @OriginalMember(owner = "client!bc", name = "V", descriptor = "I")
    public int field283;

    @OriginalMember(owner = "client!bc", name = "W", descriptor = "I")
    public static int field284;

    @OriginalMember(owner = "client!bc", name = "X", descriptor = "I")
    public static int field285;

    @OriginalMember(owner = "client!bc", name = "Y", descriptor = "I")
    public static int field286;

    @OriginalMember(owner = "client!bc", name = "Z", descriptor = "I")
    public int field287;

    @OriginalMember(owner = "client!bc", name = "bb", descriptor = "I")
    public int field289;

    @OriginalMember(owner = "client!bc", name = "fb", descriptor = "I")
    public static int field293;

    @OriginalMember(owner = "client!bc", name = "R", descriptor = "Lqc;")
    public static class114 field279;

    @OriginalMember(owner = "client!bc", name = "U", descriptor = "Lr;")
    public static class118 field282;

    @OriginalMember(owner = "client!bc", name = "gb", descriptor = "Laf;")
    public class7 field294;

    @OriginalMember(owner = "client!bc", name = "S", descriptor = "[I")
    public int[] field280;

    @OriginalMember(owner = "client!bc", name = "db", descriptor = "[I")
    public int[] field291;

    @OriginalMember(owner = "client!bc", name = "eb", descriptor = "[Laf;")
    public class7[] field292;

    @OriginalMember(owner = "client!bc", name = "e", descriptor = "(B)V")
    public static final void method117(byte arg0) {
        field293++;
        if (class2.field16 != null) {
            class2.field16.method1172((byte) 10);
        }
        int var1 = 98 / ((arg0 + 38) / 52);
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(III)Laf;")
    public static final class7 method118(int arg0, int arg1, int arg2) {
        field285++;
        int var3 = arg1 - arg0;
        if (var3 < -9) {
            return class52.field1264;
        } else if (var3 < -6) {
            return class153.field3577;
        } else if (var3 < -3) {
            return class44.field1055;
        } else if (var3 < 0) {
            return class3.field25;
        } else if (var3 > 9) {
            return class81.field1862;
        } else if (~var3 < arg2) {
            return class57.field1368;
        } else if (var3 > 3) {
            return class136.field3251;
        } else if (var3 > 0) {
            return class86.field2020;
        } else {
            return class51.field1232;
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(B[BII)Z")
    public static final boolean method119(byte arg0, byte[] arg1, int arg2, int arg3) {
        if (arg0 != 20) {
            return false;
        }
        boolean var4 = true;
        field286++;
        class122 var5 = new class122(arg1);
        int var6 = -1;
        label74: while (true) {
            int var7 = var5.method934(-112);
            if (var7 == 0) {
                return var4;
            }
            var6 += var7;
            int var8 = 0;
            boolean var9 = false;
            while (true) {
                int var13;
                class82 var16;
                do {
                    int var14;
                    int var15;
                    do {
                        do {
                            do {
                                do {
                                    while (var9) {
                                        int var17 = var5.method934(arg0 ^ 0xFFFFFF83);
                                        if (var17 == 0) {
                                            continue label74;
                                        }
                                        var5.method931((byte) 124);
                                    }
                                    int var10 = var5.method934(-94);
                                    if (var10 == 0) {
                                        continue label74;
                                    }
                                    var8 += var10 - 1;
                                    int var11 = var8 & 0x3F;
                                    int var12 = var8 >> 6 & 0x3F;
                                    var13 = var5.method931((byte) 124) >> 2;
                                    var14 = arg3 + var12;
                                    var15 = var11 + arg2;
                                } while (var14 <= 0);
                            } while (var15 <= 0);
                        } while (var14 >= 103);
                    } while (var15 >= 103);
                    var16 = class155.method1214((byte) -119, var6);
                } while (var13 == 22 && class91.field2106 && var16.field1929 == 0 && var16.field1897 != 1 && !var16.field1896);
                if (!var16.method685(arg0 ^ 0x15)) {
                    class13.field331++;
                    var4 = false;
                }
                var9 = true;
            }
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(IZLr;)V")
    public static final void method120(int arg0, boolean arg1, class118 arg2) {
        field284++;
        if (class44.field1043 != null) {
            class44.field1043.field2903 = arg0 * 8 + 5;
            int var3 = class44.field1043.method972(-86);
            int var4 = class44.field1043.method972(-96);
            arg2.method918(var4, -1946, var3);
        } else if (!arg1) {
            class18.method171(255, true, 21028, (byte) 0, 255, null, 0);
            class38.field946[arg0] = arg2;
        }
    }

    @OriginalMember(owner = "client!bc", name = "f", descriptor = "(B)V")
    public static void method121(byte arg0) {
        field282 = null;
        if (arg0 < 106) {
            field279 = null;
        }
        field279 = null;
    }
}
