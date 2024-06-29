import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ub")
public class class140 {

    @OriginalMember(owner = "client!ub", name = "c", descriptor = "I")
    public static int field3258 = 0;

    @OriginalMember(owner = "client!ub", name = "e", descriptor = "Ltd;")
    public static class136 field3260 = class145.method1172("Ihr Charakter)2Profil wird in:", 45);

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "I")
    public static int field3256;

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "I")
    public static int field3257;

    @OriginalMember(owner = "client!ub", name = "d", descriptor = "I")
    public static int field3259;

    @OriginalMember(owner = "client!ub", name = "f", descriptor = "I")
    public static int field3261;

    @OriginalMember(owner = "client!ub", name = "g", descriptor = "I")
    public static int field3262;

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(I)V")
    public static final void method1137(int arg0) {
        class26.field591 = 0;
        if (arg0 != 25663) {
            field3260 = null;
        }
        class149.field3433 = 0;
        field3259++;
        client.method167(-114);
        class127.method1002(-61);
        class11.method75((byte) -99);
        for (int var1 = 0; var1 < class149.field3433; var1++) {
            int var3 = class78.field1799[var1];
            if (class44.field1013 != class122.field2846[var3].field3555) {
                class122.field2846[var3].field1428 = null;
                class122.field2846[var3] = null;
            }
        }
        if (class11.field179 != class4.field70.field2995) {
            throw new RuntimeException("gnp1 pos:" + class4.field70.field2995 + " psize:" + class11.field179);
        }
        for (int var2 = 0; var2 < class51.field1145; var2++) {
            if (class122.field2846[class139.field3237[var2]] == null) {
                throw new RuntimeException("gnp2 pos:" + var2 + " size:" + class51.field1145);
            }
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(ILmd;ZILmd;)Lta;")
    public static final class133 method1138(int arg0, class87 arg1, boolean arg2, int arg3, class87 arg4) {
        field3256++;
        boolean var5 = true;
        int[] var6 = arg1.method651(arg0, -2);
        for (int var7 = 0; var7 < var6.length; var7++) {
            byte[] var8 = arg1.method670(var6[var7], (byte) 75, arg0);
            if (var8 == null) {
                var5 = false;
            } else {
                int var9 = var8[1] & 0xFF | (var8[0] & 0xFF) << 8;
                byte[] var10;
                if (arg2) {
                    var10 = arg4.method670(var9, (byte) 75, 0);
                } else {
                    var10 = arg4.method670(0, (byte) 75, var9);
                }
                if (var10 == null) {
                    var5 = false;
                }
            }
        }
        if (!var5) {
            return null;
        }
        try {
            if (arg3 != 32127) {
                field3258 = -17;
            }
            return new class133(arg1, arg4, arg0, arg2);
        } catch (Exception var11) {
            return null;
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(II[Lke;)V")
    public static final void method1139(int arg0, int arg1, class74[] arg2) {
        if (arg1 != 208) {
            field3258 = -121;
        }
        for (int var3 = 0; var3 < arg2.length; var3++) {
            class74 var4 = arg2[var3];
            if (var4 != null) {
                if (var4.field1690 == 0) {
                    if (var4.field1688 != null) {
                        method1139(arg0, 208, var4.field1688);
                    }
                    class118 var5 = (class118) class18.field363.method109(81, (long) var4.field1663);
                    if (var5 != null) {
                        class99.method801(var5.field2693, arg0, 128);
                    }
                }
                if (arg0 == 0 && var4.field1568 != null) {
                    class139 var6 = new class139();
                    var6.field3222 = var4;
                    var6.field3244 = var4.field1568;
                    class96.method734(-9063, var6);
                }
                if (arg0 == 1 && var4.field1689 != null) {
                    class139 var7 = new class139();
                    var7.field3244 = var4.field1689;
                    var7.field3222 = var4;
                    class96.method734(arg1 - 9271, var7);
                }
            }
        }
        field3257++;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(Z[B)[B")
    public static final byte[] method1140(boolean arg0, byte[] arg1) {
        field3262++;
        int var2 = arg1.length;
        if (arg0) {
            field3258 = -93;
        }
        byte[] var3 = new byte[var2];
        class138.method1132(arg1, 0, var3, 0, var2);
        return var3;
    }

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "(I)V")
    public static void method1141(int arg0) {
        field3260 = null;
        if (arg0 != 0) {
            method1137(19);
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(Ltd;B)V")
    public static final void method1142(class136 arg0, byte arg1) {
        field3261++;
        if (class63.field1354 >= 2) {
            if (arg0.method1092(arg1 + 1930, class96.field2282)) {
                System.gc();
            }
            if (arg0.method1092(1853, class96.field2254)) {
                class125.method963(-100);
            }
            if (arg0.method1092(1853, class149.field3436)) {
                class73.field1523 = true;
            }
            if (arg0.method1092(arg1 + 1930, class31.field728)) {
                class73.field1523 = false;
            }
            if (arg0.method1092(1853, class31.field715)) {
                for (int var2 = 0; var2 < 4; var2++) {
                    for (int var3 = 1; var3 < 103; var3++) {
                        for (int var4 = 1; var4 < 103; var4++) {
                            class4.field83[var2].field1972[var3][var4] = 0;
                        }
                    }
                }
            }
            if (arg0.method1092(1853, class79.field1818) && class81.field1932 == 2) {
                throw new RuntimeException();
            }
            if (arg0.method1120(class94.field2200, 0)) {
                class15.field303 = arg0.method1108(12, arg1 ^ 0x40A0).method1129(false).method1126(true);
                class27.method236((byte) -38, class79.method570(arg1 + 77, new class136[] { class106.field2493, class19.method140(class15.field303, -123) }), 0, null);
            }
            if (arg0.method1092(1853, class135.field3161)) {
                class86.field2010 = true;
            }
        }
        class5.field95++;
        class15.field304.method867(208, true);
        class15.field304.method1026(arg0.method1119(-10511) - 1, (byte) 127);
        class15.field304.method1031(127, arg0.method1108(2, -16621));
        if (arg1 != -77) {
            method1138(23, null, true, -5, null);
        }
    }
}
