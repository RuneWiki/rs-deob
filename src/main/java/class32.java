import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bk")
public class class32 {

    @OriginalMember(owner = "client!bk", name = "b", descriptor = "Ljava/lang/String;")
    public static String field307 = "wave2:";

    @OriginalMember(owner = "client!bk", name = "e", descriptor = "Z")
    public static boolean field310 = false;

    @OriginalMember(owner = "client!bk", name = "g", descriptor = "I")
    public static int field312 = 0;

    @OriginalMember(owner = "client!bk", name = "i", descriptor = "Ljava/lang/String;")
    public static String field314 = "glow1:";

    @OriginalMember(owner = "client!bk", name = "h", descriptor = "Ljava/lang/String;")
    public static String field313 = "You can't add yourself to your own friend list.";

    @OriginalMember(owner = "client!bk", name = "d", descriptor = "[I")
    public static int[] field309 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "I")
    public static int field306;

    @OriginalMember(owner = "client!bk", name = "c", descriptor = "I")
    public static int field308;

    @OriginalMember(owner = "client!bk", name = "f", descriptor = "I")
    public static int field311;

    @OriginalMember(owner = "client!bk", name = "l", descriptor = "I")
    public static int field317;

    @OriginalMember(owner = "client!bk", name = "m", descriptor = "I")
    public static int field318;

    @OriginalMember(owner = "client!bk", name = "o", descriptor = "I")
    public int field320;

    @OriginalMember(owner = "client!bk", name = "p", descriptor = "I")
    public static int field321;

    @OriginalMember(owner = "client!bk", name = "q", descriptor = "I")
    public int field322;

    @OriginalMember(owner = "client!bk", name = "r", descriptor = "I")
    public static int field323;

    @OriginalMember(owner = "client!bk", name = "s", descriptor = "I")
    public int field324;

    @OriginalMember(owner = "client!bk", name = "k", descriptor = "Lqp;")
    public static class278 field316;

    // $FF: synthetic field
    @OriginalMember(owner = "client!bk", name = "t", descriptor = "Ljava/lang/Class;")
    public static Class field325;

    @OriginalMember(owner = "client!bk", name = "j", descriptor = "[I")
    public static int[] field315;

    @OriginalMember(owner = "client!bk", name = "n", descriptor = "[Llg;")
    public static class20[] field319;

    // $FF: synthetic method
    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method156(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(Lfd;ZIII)V", line = 5)
    public static final void method148(class194 arg0, boolean arg1, int arg2, int arg3, int arg4) {
        field306++;
        int var5 = arg0.field2501;
        if (arg2 != 5) {
            return;
        }
        if (arg0.field2619 == 0) {
            arg0.field2501 = arg0.field2495;
        } else if (arg0.field2619 == 1) {
            arg0.field2501 = arg3 - arg0.field2495;
        } else if (arg0.field2619 == 2) {
            arg0.field2501 = arg0.field2495 * arg3 >> 14;
        } else if (arg0.field2619 == 3) {
            if (arg0.field2492 == 2) {
                arg0.field2501 = (arg0.field2495 - 1) * arg0.field2602 + arg0.field2495 * 32;
            } else if (arg0.field2492 == 7) {
                arg0.field2501 = (arg0.field2495 - 1) * arg0.field2602 + arg0.field2495 * 115;
            }
        }
        int var6 = arg0.field2460;
        if (arg0.field2606 == 0) {
            arg0.field2460 = arg0.field2450;
        } else if (arg0.field2606 == 1) {
            arg0.field2460 = arg4 - arg0.field2450;
        } else if (arg0.field2606 == 2) {
            arg0.field2460 = arg0.field2450 * arg4 >> 14;
        } else if (arg0.field2606 == 3) {
            if (arg0.field2492 == 2) {
                arg0.field2460 = arg0.field2450 * 32 + ((arg0.field2450 - 1) * arg0.field2538);
            } else if (arg0.field2492 == 7) {
                arg0.field2460 = (arg0.field2450 - 1) * arg0.field2538 + arg0.field2450 * 12;
            }
        }
        if (arg0.field2619 == 4) {
            arg0.field2501 = arg0.field2509 * arg0.field2460 / arg0.field2469;
        }
        if (arg0.field2606 == 4) {
            arg0.field2460 = arg0.field2501 * arg0.field2469 / arg0.field2509;
        }
        if (class318.field4237 && (client.method1410(arg0).field2940 != 0 || arg0.field2492 == 0)) {
            if (arg0.field2460 < 5 && arg0.field2501 < 5) {
                arg0.field2460 = 5;
                arg0.field2501 = 5;
            } else {
                if (arg0.field2460 <= 0) {
                    arg0.field2460 = 5;
                }
                if (arg0.field2501 <= 0) {
                    arg0.field2501 = 5;
                }
            }
        }
        if (arg0.field2455 == 1337) {
            class243.field3308 = arg0;
        }
        if (arg1 && arg0.field2546 != null && arg0.field2501 != var5 || arg0.field2460 != var6) {
            class425 var7 = new class425();
            var7.field6240 = arg0.field2546;
            var7.field6242 = arg0;
            class204.field2736.method825(arg2 ^ 0x7C, var7);
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(BZLjava/lang/String;)V", line = 113)
    public static final void method149(byte arg0, boolean arg1, String arg2) {
        if (arg0 <= 16) {
            field319 = null;
        }
        field317++;
        String var3 = arg2.toLowerCase();
        short[] var4 = new short[16];
        int var5 = 0;
        int var6 = arg1 ? 32768 : 0;
        int var7 = var6 + (arg1 ? class429.field6294 : class263.field3599);
        for (int var8 = var6; var8 < var7; var8++) {
            class409 var11 = class206.method1118(var8, 32767);
            if (var11.field5909 && var11.method2544((byte) -92).toLowerCase().indexOf(var3) != -1) {
                if (var5 >= 50) {
                    class19.field184 = null;
                    class359.field5063 = -1;
                    return;
                }
                if (var5 >= var4.length) {
                    short[] var12 = new short[var4.length * 2];
                    for (int var13 = 0; var13 < var5; var13++) {
                        var12[var13] = var4[var13];
                    }
                    var4 = var12;
                }
                var4[var5++] = (short) var8;
            }
        }
        class19.field184 = var4;
        class359.field5063 = var5;
        class370.field5171 = 0;
        String[] var9 = new String[class359.field5063];
        for (int var10 = 0; var10 < class359.field5063; var10++) {
            var9[var10] = class206.method1118(var4[var10], 32767).method2544((byte) -92);
        }
        class151.method801(var9, class19.field184, (byte) 28);
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(ZLam;)I", line = 185)
    public static final int method150(boolean arg0, class286 arg1) {
        field308++;
        if (!arg0) {
            return -112;
        }
        int var2 = 0;
        if (arg1.method1673(44, class123.field1579)) {
            var2++;
        }
        if (arg1.method1673(-121, class99.field1172)) {
            var2++;
        }
        if (arg1.method1673(-128, class259.field3520)) {
            var2++;
        }
        if (arg1.method1673(20, class140.field1795)) {
            var2++;
        }
        if (arg1.method1673(91, class206.field2781)) {
            var2++;
        }
        if (arg1.method1673(-120, class188.field2367)) {
            var2++;
        }
        if (arg1.method1673(-103, class132.field1710)) {
            var2++;
        }
        if (arg1.method1673(-31, class154.field1946)) {
            var2++;
        }
        if (arg1.method1673(-113, class36.field349)) {
            var2++;
        }
        if (arg1.method1673(36, class298.field4072)) {
            var2++;
        }
        if (arg1.method1673(-120, class23.field217)) {
            var2++;
        }
        if (arg1.method1673(20, class98.field1163)) {
            var2++;
        }
        if (arg1.method1673(6, class30.field293)) {
            var2++;
        }
        if (arg1.method1673(-112, class110.field1360)) {
            var2++;
        }
        if (arg1.method1673(-14, class75.field842)) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(Z)I", line = 253)
    public static final int method151(boolean arg0) {
        field321++;
        class322 var1 = class88.field1003;
        boolean var2 = arg0;
        if (class101.field1182 != 0) {
            Canvas var3 = new Canvas();
            var3.setSize(100, 100);
            var2 = true;
            var1 = class88.method486((class369) null, (class450) null, (byte) 73, 0, var3, 0);
        }
        long var4 = class442.method2730(25207);
        for (int var6 = 0; var6 < 10000; var6++) {
            var1.method1639(5, 10, 75, 50, 15, 90, -65536, -65536, -65536, 1);
        }
        int var7 = (int) (class442.method2730(25207) - var4);
        var1.method1860(0, -3272, 100, 0, 100, -16777216);
        if (var2) {
            var1.method1855((byte) -49);
        }
        return var7;
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(B)V", line = 294)
    public static void method152(byte arg0) {
        field307 = null;
        field316 = null;
        field309 = null;
        field319 = null;
        if (arg0 == -32) {
            field314 = null;
            field313 = null;
            field315 = null;
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(Lkm;B)V", line = 313)
    public static final void method153(class436 arg0, byte arg1) {
        field318++;
        if (class176.field2209 == null) {
            return;
        }
        class285 var2 = null;
        if (arg0.field6368 == 0) {
            var2 = (class285) class173.method906(arg0.field6384, arg0.field6378, arg0.field6386);
        }
        if (arg0.field6368 == 1) {
            var2 = (class285) class316.method1828(arg0.field6384, arg0.field6378, arg0.field6386);
        }
        if (arg1 < 53) {
            return;
        }
        if (arg0.field6368 == 2) {
            var2 = (class285) class165.method878(arg0.field6384, arg0.field6378, arg0.field6386, field325 == null ? (field325 = method156("io")) : field325);
        }
        if (arg0.field6368 == 3) {
            var2 = (class285) class275.method1514(arg0.field6384, arg0.field6378, arg0.field6386);
        }
        if (var2 == null) {
            arg0.field6371 = 0;
            arg0.field6385 = 0;
            arg0.field6383 = -1;
        } else {
            arg0.field6383 = var2.method356(10397);
            arg0.field6385 = var2.method339(-99);
            arg0.field6371 = var2.method351((byte) 103);
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(Ltq;I)V", line = 354)
    public final void method154(class250 arg0, int arg1) {
        if (arg1 != -1) {
            field307 = null;
        }
        field311++;
        while (true) {
            int var3 = arg0.method1350(31351);
            if (var3 == 0) {
                return;
            }
            this.method155(var3, arg0, (byte) 75);
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(ILtq;B)V", line = 379)
    private final void method155(int arg0, class250 arg1, byte arg2) {
        field323++;
        int var4 = 52 % ((-arg2 - 2) / 57);
        if (arg0 == 1) {
            this.field322 = arg1.method1374(-2);
            this.field320 = arg1.method1350(31351);
            this.field324 = arg1.method1350(31351);
        }
    }
}
