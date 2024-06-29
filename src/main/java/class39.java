import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hl")
public class class39 extends class4 {

    @OriginalMember(owner = "client!hl", name = "x", descriptor = "I")
    public static int field725 = 0;

    @OriginalMember(owner = "client!hl", name = "O", descriptor = "I")
    public static int field740 = 0;

    @OriginalMember(owner = "client!hl", name = "G", descriptor = "Z")
    public static boolean field733 = true;

    @OriginalMember(owner = "client!hl", name = "F", descriptor = "I")
    public static int field732 = 0;

    @OriginalMember(owner = "client!hl", name = "y", descriptor = "Lvj;")
    public static class115 field726 = new class115();

    @OriginalMember(owner = "client!hl", name = "P", descriptor = "[I")
    public static int[] field741 = new int[2];

    @OriginalMember(owner = "client!hl", name = "Q", descriptor = "Laf;")
    public static class68 field742 = new class68(100);

    @OriginalMember(owner = "client!hl", name = "N", descriptor = "C")
    private char field739;

    @OriginalMember(owner = "client!hl", name = "z", descriptor = "I")
    public static int field727;

    @OriginalMember(owner = "client!hl", name = "C", descriptor = "I")
    public static int field729;

    @OriginalMember(owner = "client!hl", name = "D", descriptor = "I")
    public static int field730;

    @OriginalMember(owner = "client!hl", name = "E", descriptor = "I")
    public static int field731;

    @OriginalMember(owner = "client!hl", name = "J", descriptor = "I")
    public int field735;

    @OriginalMember(owner = "client!hl", name = "K", descriptor = "I")
    public static int field736;

    @OriginalMember(owner = "client!hl", name = "L", descriptor = "I")
    public static int field737;

    @OriginalMember(owner = "client!hl", name = "M", descriptor = "I")
    public static int field738;

    @OriginalMember(owner = "client!hl", name = "A", descriptor = "Ljava/lang/String;")
    public String field728;

    @OriginalMember(owner = "client!hl", name = "I", descriptor = "[S")
    public static short[] field734;

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(IBLog;)V")
    private final void method339(int arg0, byte arg1, class221 arg2) {
        if (arg1 != -121) {
            return;
        }
        field731++;
        if (arg0 == 1) {
            this.field739 = class61.method439(41, arg2.method1535((byte) -117));
        } else if (arg0 == 2) {
            this.field735 = arg2.method1526(-16777216);
            return;
        } else if (arg0 == 5) {
            this.field728 = arg2.method1539(50);
            return;
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(B)Lg;")
    public static final class277 method340(byte arg0) {
        if (arg0 != -95) {
            field740 = -6;
        }
        field738++;
        try {
            return (class277) Class.forName("pe").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!hl", name = "c", descriptor = "(Z)V")
    public static void method341(boolean arg0) {
        field741 = null;
        if (arg0) {
            method345(45, (class33) null, 45, -119, (class15) null, -108, (class135) null, false);
        }
        field742 = null;
        field734 = null;
        field726 = null;
    }

    @OriginalMember(owner = "client!hl", name = "f", descriptor = "(I)Z")
    public final boolean method342(int arg0) {
        field737++;
        if (arg0 != 115) {
            this.field739 = (char) 65509;
        }
        return this.field739 == 's';
    }

    @OriginalMember(owner = "client!hl", name = "g", descriptor = "(I)V")
    public static final void method343(int arg0) {
        class67.field1103.method530(255);
        field730++;
        int var1 = class67.field1103.method540(1, 882786883);
        if (var1 == 0 || arg0 != 19515) {
            return;
        }
        int var2 = class67.field1103.method540(2, 882786883);
        if (var2 == 0) {
            class106.field1701[class43.field802++] = 2047;
        } else if (var2 == 1) {
            int var3 = class67.field1103.method540(3, 882786883);
            class167.field2655.method1426(1, var3, -1);
            int var4 = class67.field1103.method540(1, arg0 ^ 0x349E0E78);
            if (var4 == 1) {
                class106.field1701[class43.field802++] = 2047;
            }
        } else if (var2 == 2) {
            if (class67.field1103.method540(1, arg0 + 882767368) == 1) {
                int var5 = class67.field1103.method540(3, 882786883);
                class167.field2655.method1426(2, var5, -1);
                int var6 = class67.field1103.method540(3, arg0 + 882767368);
                class167.field2655.method1426(2, var6, -1);
            } else {
                int var7 = class67.field1103.method540(3, 882786883);
                class167.field2655.method1426(0, var7, -1);
            }
            int var8 = class67.field1103.method540(1, 882786883);
            if (var8 == 1) {
                class106.field1701[class43.field802++] = 2047;
            }
        } else if (var2 == 3) {
            int var9 = class67.field1103.method540(7, arg0 ^ 0x349E0E78);
            int var10 = class67.field1103.method540(1, arg0 + 882767368);
            class250.field3980 = class67.field1103.method540(2, 882786883);
            int var11 = class67.field1103.method540(7, 882786883);
            int var12 = class67.field1103.method540(1, 882786883);
            if (var12 == 1) {
                class106.field1701[class43.field802++] = 2047;
            }
            class167.field2655.method279(var11, var9, false, var10 == 1);
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(BLog;)V")
    public final void method344(byte arg0, class221 arg1) {
        if (arg0 >= -106) {
            field742 = null;
        }
        while (true) {
            int var3 = arg1.method1517((byte) -96);
            if (var3 == 0) {
                field727++;
                return;
            }
            this.method339(var3, (byte) -121, arg1);
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(ILbl;IILwe;ILac;Z)V")
    public static final void method345(int arg0, class33 arg1, int arg2, int arg3, class15 arg4, int arg5, class135 arg6, boolean arg7) {
        field736++;
        if (arg7) {
            method345(-121, (class33) null, -115, -48, (class15) null, 19, (class135) null, true);
        }
        class97 var8 = new class97();
        var8.field1586 = arg5 * 128;
        var8.field1588 = arg3;
        var8.field1579 = arg0 * 128;
        if (arg6 != null) {
            var8.field1582 = arg6.field2177;
            var8.field1598 = arg6;
            var8.field1584 = arg6.field2216;
            var8.field1576 = arg6.field2163;
            var8.field1580 = arg6.field2213 * 128;
            int var10 = arg6.field2175;
            int var11 = arg6.field2225;
            var8.field1593 = arg6.field2220;
            if (arg2 == 1 || arg2 == 3) {
                var10 = arg6.field2225;
                var11 = arg6.field2175;
            }
            var8.field1578 = (arg0 + var10) * 128;
            var8.field1592 = (arg5 + var11) * 128;
            if (arg6.field2209 != null) {
                var8.field1577 = true;
                var8.method715(-122);
            }
            if (var8.field1582 != null) {
                var8.field1587 = var8.field1593 + ((int) (Math.random() * (double) (var8.field1576 - var8.field1593)));
            }
            class247.field3937.method855(arg7, var8);
            return;
        }
        if (arg4 != null) {
            class107 var9 = arg4.field258;
            var8.field1591 = arg4;
            if (var9.field1716 != null) {
                var8.field1577 = true;
                var9 = var9.method775(false);
            }
            if (var9 != null) {
                var8.field1592 = (var9.field1731 + arg5) * 128;
                var8.field1578 = (arg0 + var9.field1731) * 128;
                var8.field1584 = class281.method1896(arg4, (byte) -92);
                var8.field1580 = var9.field1738 * 128;
            }
            class263.field4188.method855(arg7, var8);
            return;
        }
        if (arg1 == null) {
            return;
        }
        var8.field1599 = arg1;
        var8.field1578 = (arg1.method278(0) + arg0) * 128;
        var8.field1592 = (arg1.method278(0) + arg5) * 128;
        var8.field1584 = class64.method452((byte) 88, arg1);
        var8.field1580 = arg1.field510 * 128;
        class220.field3593.method1399(7292, var8, class74.method522((byte) -92, arg1.field525));
        return;
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(ZII)I")
    public static final int method346(boolean arg0, int arg1, int arg2) {
        if (!arg0) {
            method343(-120);
        }
        int var3 = arg2 + (arg1 * 57);
        int var4 = var3 << 13 ^ var3;
        field729++;
        int var5 = (var4 * 15731 * var4 + 789221) * var4 + 1376312589 & Integer.MAX_VALUE;
        return (var5 & 0x7F9B667) >> 19;
    }
}
