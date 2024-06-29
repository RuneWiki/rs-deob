import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sh")
public class class132 extends class183 {

    @OriginalMember(owner = "client!sh", name = "e", descriptor = "Z")
    public static boolean field2179 = true;

    @OriginalMember(owner = "client!sh", name = "i", descriptor = "[[[Lvb;")
    public static class247[][][] field2183 = new class247[4][104][104];

    @OriginalMember(owner = "client!sh", name = "k", descriptor = "[I")
    public static int[] field2185 = new int[50];

    @OriginalMember(owner = "client!sh", name = "n", descriptor = "Lhd;")
    public static class214 field2188 = new class214(32);

    @OriginalMember(owner = "client!sh", name = "f", descriptor = "I")
    public static int field2180;

    @OriginalMember(owner = "client!sh", name = "g", descriptor = "I")
    public static int field2181;

    @OriginalMember(owner = "client!sh", name = "h", descriptor = "I")
    public static int field2182;

    @OriginalMember(owner = "client!sh", name = "j", descriptor = "I")
    public static int field2184;

    @OriginalMember(owner = "client!sh", name = "l", descriptor = "I")
    public static int field2186;

    @OriginalMember(owner = "client!sh", name = "o", descriptor = "Ldg;")
    public static class90 field2189;

    @OriginalMember(owner = "client!sh", name = "m", descriptor = "[Lka;")
    public static class134[] field2187;

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(IBIII)V")
    public static final void method850(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        field2181++;
        class196 var5 = (class196) class254.field4435.method1424(true, (long) arg0);
        if (arg1 != -105) {
            return;
        }
        if (var5 == null) {
            var5 = new class196();
            class254.field4435.method1422((long) arg0, var5, -1);
        }
        if (arg3 >= var5.field3420.length) {
            int[] var6 = new int[arg3 + 1];
            int[] var7 = new int[arg3 + 1];
            for (int var8 = 0; var8 < var5.field3420.length; var8++) {
                var6[var8] = var5.field3420[var8];
                var7[var8] = var5.field3418[var8];
            }
            for (int var9 = var5.field3420.length; var9 < arg3; var9++) {
                var6[var9] = -1;
                var7[var9] = 0;
            }
            var5.field3420 = var6;
            var5.field3418 = var7;
        }
        var5.field3420[arg3] = arg2;
        var5.field3418[arg3] = arg4;
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(I)V")
    public static void method851(int arg0) {
        field2188 = null;
        field2187 = null;
        field2183 = null;
        field2189 = null;
        if (arg0 != 104) {
            field2189 = null;
        }
        field2185 = null;
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(IIBII)V")
    public static final void method852(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        if (arg2 != -121) {
            method851(-38);
        }
        field2182++;
        if (arg1 >= class23.field408 && arg1 <= class125.field2056) {
            int var5 = class144.method931(106, class124.field2032, class11.field219, arg0);
            int var6 = class144.method931(arg2 + 224, class124.field2032, class11.field219, arg4);
            class187.method1297(arg1, arg3, var5, var6, arg2 ^ 0x17);
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(ZLo;)V")
    public static final void method853(boolean arg0, class175 arg1) {
        field2186++;
        int var2 = arg1.field3067;
        if (var2 == 324) {
            if (class232.field4059 == -1) {
                class52.field819 = arg1.field3020;
                class232.field4059 = arg1.field2992;
            }
            if (class170.field2859.field2909) {
                arg1.field2992 = class232.field4059;
            } else {
                arg1.field2992 = class52.field819;
            }
        } else if (var2 == 325) {
            if (class232.field4059 == -1) {
                class52.field819 = arg1.field3020;
                class232.field4059 = arg1.field2992;
            }
            if (class170.field2859.field2909) {
                arg1.field2992 = class52.field819;
            } else {
                arg1.field2992 = class232.field4059;
            }
        } else if (var2 == 327) {
            arg1.field2967 = 150;
            arg1.field3048 = (int) (Math.sin((double) class237.field4125 / 40.0D) * 256.0D) & 0x7FF;
            arg1.field2966 = -1;
            arg1.field3017 = 5;
        } else {
            if (!arg0) {
                field2185 = null;
            }
            if (var2 == 328) {
                if (class258.field4507.field1883 == null) {
                    arg1.field2966 = 0;
                } else {
                    arg1.field2967 = 150;
                    arg1.field3048 = (int) (Math.sin((double) class237.field4125 / 40.0D) * 256.0D) & 0x7FF;
                    arg1.field3017 = 5;
                    arg1.field2966 = ((int) class258.field4507.field1883.method1197(-105) << 11) + 2047;
                    arg1.field3063 = class258.field4507.field2629;
                    arg1.field3038 = class258.field4507.field2661;
                }
            }
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(ILka;)V")
    public static final void method854(int arg0, class134 arg1) {
        short var2 = 256;
        for (int var3 = 0; var3 < class239.field4151.length; var3++) {
            class239.field4151[var3] = 0;
        }
        if (arg0 <= 17) {
            method850(-72, (byte) -75, 46, -99, -92);
        }
        for (int var4 = 0; var4 < 5000; var4++) {
            int var16 = (int) (Math.random() * 128.0D * (double) var2);
            class239.field4151[var16] = (int) (Math.random() * 284.0D);
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var12 = 1; var12 < (var2 - 1); var12++) {
                for (int var14 = 1; var14 < 127; var14++) {
                    int var15 = var14 + (var12 << 7);
                    class66.field1072[var15] = (class239.field4151[var15 + 128] + class239.field4151[var15 - 1] - (-class239.field4151[var15 + 1] - class239.field4151[var15 - 128])) / 4;
                }
            }
            int[] var13 = class239.field4151;
            class239.field4151 = class66.field1072;
            class66.field1072 = var13;
        }
        field2180++;
        if (arg1 == null) {
            return;
        }
        int var6 = 0;
        for (int var7 = 0; var7 < arg1.field1102; var7++) {
            for (int var8 = 0; var8 < arg1.field1096; var8++) {
                if (arg1.field2190[var6++] != 0) {
                    int var9 = arg1.field1098 + var8 + 16;
                    int var10 = var7 + arg1.field1105 + 16;
                    int var11 = (var10 << 7) + var9;
                    class239.field4151[var11] = 0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(IIIZIIII)V")
    public static final void method855(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7) {
        field2184++;
        if (arg1 >= 1 && arg0 >= 1 && arg1 <= 102 && arg0 <= 102) {
            if (!class219.method1460(51885665) && (class70.field1129[0][arg1][arg0] & 0x2) == 0) {
                int var8 = arg5;
                if ((class70.field1129[arg5][arg1][arg0] & 0x8) != 0) {
                    var8 = 0;
                }
                if (class31.field509 != var8) {
                    return;
                }
            }
            int var9 = arg5;
            if (arg5 < 3 && (class70.field1129[1][arg1][arg0] & 0x2) == 2) {
                var9 = arg5 + 1;
            }
            class152.method985(arg0, var9, class109.field1784[arg5], arg5, -55, arg7, arg1);
            if (arg2 >= 0) {
                boolean var10 = class239.field4165;
                class239.field4165 = true;
                class42.method295(arg2, class109.field1784[arg5], false, arg6, -103, arg5, arg1, arg4, arg0, false, var9);
                class239.field4165 = var10;
            }
        }
        if (!arg3) {
            field2179 = true;
        }
    }
}
