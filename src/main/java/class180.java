import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jl")
public class class180 {

    @OriginalMember(owner = "client!jl", name = "e", descriptor = "I")
    public static int field2707 = 0;

    @OriginalMember(owner = "client!jl", name = "d", descriptor = "F")
    public static float field2706;

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "I")
    public static int field2703;

    @OriginalMember(owner = "client!jl", name = "f", descriptor = "I")
    public static int field2708;

    @OriginalMember(owner = "client!jl", name = "g", descriptor = "I")
    public static int field2709;

    @OriginalMember(owner = "client!jl", name = "h", descriptor = "I")
    public static int field2710;

    @OriginalMember(owner = "client!jl", name = "c", descriptor = "Lnm;")
    public static class333 field2705;

    @OriginalMember(owner = "client!jl", name = "b", descriptor = "Lul;")
    public static class406 field2704;

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(B)V", line = 8)
    public static final void method1201(byte arg0) {
        field2708++;
        for (class155 var1 = (class155) class483.field6941.method1004((byte) -103); var1 != null; var1 = (class155) class483.field6941.method996(1)) {
            if (var1.field2295 > 0) {
                var1.field2295--;
            }
            if (var1.field2295 != 0) {
                if (var1.field2309 > 0) {
                    var1.field2309--;
                }
                if (var1.field2309 == 0 && var1.field2306 >= 1 && var1.field2302 >= 1 && class69.field976 - 2 >= var1.field2306 && (class285.field4328 - 2) >= var1.field2302 && (var1.field2305 < 0 || class452.method2753(var1.field2305, 22046, var1.field2308))) {
                    class45.method465(var1.field2302, var1.field2299, var1.field2298, -1, var1.field2308, var1.field2305, var1.field2306, true, var1.field2301);
                    var1.field2309 = -1;
                    if (var1.field2307 == var1.field2305 && var1.field2307 == -1) {
                        var1.method2677(-22491);
                    } else if (var1.field2307 == var1.field2305 && var1.field2299 == var1.field2294 && var1.field2308 == var1.field2300) {
                        var1.method2677(-22491);
                    }
                }
            } else if (var1.field2307 < 0 || class452.method2753(var1.field2307, 22046, var1.field2300)) {
                class45.method465(var1.field2302, var1.field2294, var1.field2298, -1, var1.field2300, var1.field2307, var1.field2306, true, var1.field2301);
                var1.method2677(-22491);
            }
        }
        if (arg0 >= -24) {
            method1202(true, null, 80, -49);
        }
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(ZLuq;II)V", line = 64)
    public static final void method1202(boolean arg0, class114 arg1, int arg2, int arg3) {
        class460.field6696 = arg1;
        class299.field4541 = arg3;
        field2709++;
        class534.field7853 = arg2;
        if (arg0) {
            method1201((byte) -34);
        }
    }

    @OriginalMember(owner = "client!jl", name = "b", descriptor = "(B)V", line = 81)
    public static void method1203(byte arg0) {
        field2705 = null;
        if (arg0 == -117) {
            field2704 = null;
        }
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(IIIZII)V", line = 92)
    public static final void method1204(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        if (class193.field3258.field7251 != 0 && arg1 != 0 && class384.field5774 < 50 && arg2 != -1) {
            class522.field7636[class384.field5774++] = new class85((byte) 1, arg2, arg1, arg5, arg0, arg4);
        }
        field2710++;
        if (!arg3) {
            field2704 = null;
        }
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(ILjava/lang/String;)[B", line = 111)
    public static final byte[] method1205(int arg0, String arg1) {
        field2703++;
        int var2 = arg1.length();
        byte[] var3 = new byte[var2];
        int var4 = 0;
        if (arg0 != 25146) {
            return null;
        }
        while (var2 > var4) {
            char var5 = arg1.charAt(var4);
            if (var5 > '\u0000' && var5 < '\u0080' || var5 >= ' ' && var5 <= 'ÿ') {
                var3[var4] = (byte) var5;
            } else if (var5 == '€') {
                var3[var4] = -128;
            } else if (var5 == '‚') {
                var3[var4] = -126;
            } else if (var5 == 'ƒ') {
                var3[var4] = -125;
            } else if (var5 == '„') {
                var3[var4] = -124;
            } else if (var5 == '…') {
                var3[var4] = -123;
            } else if (var5 == '†') {
                var3[var4] = -122;
            } else if (var5 == '‡') {
                var3[var4] = -121;
            } else if (var5 == 'ˆ') {
                var3[var4] = -120;
            } else if (var5 == '‰') {
                var3[var4] = -119;
            } else if (var5 == 'Š') {
                var3[var4] = -118;
            } else if (var5 == '‹') {
                var3[var4] = -117;
            } else if (var5 == 'Œ') {
                var3[var4] = -116;
            } else if (var5 == 'Ž') {
                var3[var4] = -114;
            } else if (var5 == '‘') {
                var3[var4] = -111;
            } else if (var5 == '’') {
                var3[var4] = -110;
            } else if (var5 == '“') {
                var3[var4] = -109;
            } else if (var5 == '”') {
                var3[var4] = -108;
            } else if (var5 == '•') {
                var3[var4] = -107;
            } else if (var5 == '–') {
                var3[var4] = -106;
            } else if (var5 == '—') {
                var3[var4] = -105;
            } else if (var5 == '˜') {
                var3[var4] = -104;
            } else if (var5 == '™') {
                var3[var4] = -103;
            } else if (var5 == 'š') {
                var3[var4] = -102;
            } else if (var5 == '›') {
                var3[var4] = -101;
            } else if (var5 == 'œ') {
                var3[var4] = -100;
            } else if (var5 == 'ž') {
                var3[var4] = -98;
            } else if (var5 == 'Ÿ') {
                var3[var4] = -97;
            } else {
                var3[var4] = 63;
            }
            var4++;
        }
        return var3;
    }
}
