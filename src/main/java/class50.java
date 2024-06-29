import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vb")
public class class50 {

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "[I")
    public static int[] field896 = new int[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

    @OriginalMember(owner = "client!vb", name = "f", descriptor = "I")
    public static int field901 = 2301979;

    @OriginalMember(owner = "client!vb", name = "h", descriptor = "Lok;")
    public static class146 field903 = class235.method1724(-12908, "runes");

    @OriginalMember(owner = "client!vb", name = "j", descriptor = "Lok;")
    public static class146 field905 = class235.method1724(-12908, "Untersuchen");

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "I")
    public static int field897;

    @OriginalMember(owner = "client!vb", name = "c", descriptor = "I")
    public static int field898;

    @OriginalMember(owner = "client!vb", name = "d", descriptor = "I")
    public static int field899;

    @OriginalMember(owner = "client!vb", name = "i", descriptor = "Lan;")
    public class315 field904;

    @OriginalMember(owner = "client!vb", name = "e", descriptor = "Lbf;")
    public class322 field900;

    @OriginalMember(owner = "client!vb", name = "g", descriptor = "Z")
    public static boolean field902;

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(Loh;Z)V", line = 5)
    public static final void method410(class15 arg0, boolean arg1) {
        field897++;
        if (class194.field3228) {
            return;
        }
        if (class271.field4640) {
            class131.method971();
        } else {
            class181.method1439();
        }
        class32.field622 = class300.method2118(arg0, class282.field4833, (byte) -33);
        int var2 = class56.field997;
        int var3 = var2 * 956 / 503;
        class32.field622.method58((class148.field2518 - var3) / 2, 0, var3, var2);
        class119.field1939 = class252.method1842(arg0, 255, class278.field4769);
        class119.field1939.method180(class148.field2518 / 2 - (class119.field1939.field480 / 2), 18);
        class194.field3228 = arg1;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(I)V", line = 42)
    public static void method411(int arg0) {
        field905 = null;
        field896 = null;
        field903 = null;
        if (arg0 != 0) {
            method410((class15) null, true);
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(IZI[Lqf;B[B)V", line = 63)
    public static final void method412(int arg0, boolean arg1, int arg2, class144[] arg3, byte arg4, byte[] arg5) {
        if (arg4 != 84) {
            return;
        }
        int var6 = -1;
        field898++;
        class47 var7 = new class47(arg5);
        while (true) {
            int var8 = var7.method334(false);
            if (var8 == 0) {
                return;
            }
            var6 += var8;
            int var9 = 0;
            while (true) {
                int var10 = var7.method350(-32768);
                if (var10 == 0) {
                    break;
                }
                var9 += var10 - 1;
                int var11 = var9 & 0x3F;
                int var12 = (var9 & 0xFF6) >> 6;
                int var13 = var7.method368(116);
                int var14 = var9 >> 12;
                int var15 = var13 >> 2;
                int var16 = var13 & 0x3;
                int var17 = arg0 + var12;
                int var18 = arg2 + var11;
                if (var17 > 0 && var18 > 0 && var17 < 103 && var18 < 103) {
                    class144 var19 = null;
                    if (!arg1) {
                        int var20 = var14;
                        if ((class46.field775[1][var17][var18] & 0x2) == 2) {
                            var20 = var14 - 1;
                        }
                        if (var20 >= 0) {
                            var19 = arg3[var20];
                        }
                    }
                    class309.method2180(var15, var16, !arg1, var17, var19, var14, var6, var14, arg1, var18, arg4 ^ 0x56);
                }
            }
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(B)V", line = 141)
    public static final void method413(byte arg0) {
        int var1 = class39.field695.method207(class261.field4334);
        for (int var2 = 0; var2 < class45.field763; var2++) {
            int var3 = class39.field695.method207(class45.method311(var2, (byte) 110));
            if (var3 > var1) {
                var1 = var3;
            }
        }
        if (arg0 != -29) {
            method412(-64, false, -96, (class144[]) null, (byte) -34, (byte[]) null);
        }
        field899++;
        var1 += 8;
        int var4 = class250.field4183;
        int var5 = class263.field4372 - (var1 / 2);
        int var6 = class45.field763 * 15 + 21;
        if ((var4 + var6) > class56.field997) {
            var4 = class56.field997 - var6;
        }
        if ((var1 + var5) > class148.field2518) {
            var5 = class148.field2518 - var1;
        }
        if (var5 < 0) {
            var5 = 0;
        }
        if (var4 < 0) {
            var4 = 0;
        }
        if (class124.field2029 == 1) {
            if (class263.field4372 == class258.field4295 && class250.field4183 == class218.field3612) {
                class124.field2029 = 0;
                class171.field2889 = class45.field763 * 15 + (class177.field3003 ? 26 : 22);
                class283.field4851 = var1;
                class113.field1821 = var5;
                class116.field1864 = var4;
                class295.field4998 = true;
            }
        } else if (class263.field4372 == class120.field1974 && class250.field4183 == class215.field3542) {
            class124.field2029 = 0;
            class113.field1821 = var5;
            class295.field4998 = true;
            class283.field4851 = var1;
            class171.field2889 = class45.field763 * 15 + (class177.field3003 ? 26 : 22);
            class116.field1864 = var4;
        } else {
            class258.field4295 = class120.field1974;
            class124.field2029 = 1;
            class218.field3612 = class215.field3542;
        }
    }
}
