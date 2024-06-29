import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ri")
public class class176 {

    @OriginalMember(owner = "client!ri", name = "l", descriptor = "J")
    public long field2583 = 0L;

    @OriginalMember(owner = "client!ri", name = "g", descriptor = "Z")
    public static boolean field2578 = false;

    @OriginalMember(owner = "client!ri", name = "c", descriptor = "I")
    public static int field2574 = 0;

    @OriginalMember(owner = "client!ri", name = "j", descriptor = "I")
    public static int field2581 = 2;

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "[S")
    public static short[] field2572 = new short[256];

    @OriginalMember(owner = "client!ri", name = "n", descriptor = "I")
    public static int field2585 = 3;

    @OriginalMember(owner = "client!ri", name = "o", descriptor = "Ljava/lang/String;")
    public static String field2586 = "Loaded title screen";

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "I")
    public int field2573;

    @OriginalMember(owner = "client!ri", name = "e", descriptor = "I")
    public static int field2576;

    @OriginalMember(owner = "client!ri", name = "f", descriptor = "I")
    public static int field2577;

    @OriginalMember(owner = "client!ri", name = "h", descriptor = "I")
    public static int field2579;

    @OriginalMember(owner = "client!ri", name = "k", descriptor = "I")
    public int field2582;

    @OriginalMember(owner = "client!ri", name = "m", descriptor = "I")
    public static int field2584;

    @OriginalMember(owner = "client!ri", name = "q", descriptor = "I")
    public int field2588;

    @OriginalMember(owner = "client!ri", name = "r", descriptor = "I")
    public int field2589;

    @OriginalMember(owner = "client!ri", name = "s", descriptor = "I")
    public int field2590;

    @OriginalMember(owner = "client!ri", name = "p", descriptor = "Lpk;")
    public static class237 field2587;

    @OriginalMember(owner = "client!ri", name = "d", descriptor = "Lbg;")
    public class264 field2575;

    @OriginalMember(owner = "client!ri", name = "i", descriptor = "Lbg;")
    public class264 field2580;

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/lang/String;")
    public static final String method1163(String arg0, byte arg1) {
        int var2 = arg0.length();
        field2576++;
        char[] var3 = new char[var2];
        byte var4 = 2;
        int var5 = 13 % (-arg1 / 42);
        for (int var6 = 0; var6 < var2; var6++) {
            char var7 = arg0.charAt(var6);
            if (var4 == 0) {
                var7 = Character.toLowerCase(var7);
            } else if (var4 == 2 || Character.isUpperCase(var7)) {
                var7 = class120.method854(-182, var7);
            }
            if (Character.isLetter(var7)) {
                var4 = 0;
            } else if (var7 == '.' || var7 == '?' || var7 == '!') {
                var4 = 2;
            } else if (!Character.isSpaceChar(var7)) {
                var4 = 1;
            } else if (var4 != 2) {
                var4 = 1;
            }
            var3[var6] = var7;
        }
        return new String(var3);
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(Lui;Lpk;Lpk;Lpk;B)Z")
    public static final boolean method1164(class212 arg0, class237 arg1, class237 arg2, class237 arg3, byte arg4) {
        class235.field3613 = arg1;
        field2579++;
        class25.field494 = arg3;
        class213.field3276 = arg2;
        if (arg4 != -96) {
            field2572 = null;
        }
        class148.field2151 = arg0;
        return true;
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(II)Z")
    public static final boolean method1165(int arg0, int arg1) {
        field2584++;
        if (class24.field388[arg0]) {
            return true;
        } else if (class5.field68.method1626(106, arg0)) {
            int var2 = class5.field68.method1614(0, arg0);
            if (var2 == 0) {
                class24.field388[arg0] = true;
                return true;
            }
            if (class275.field4236[arg0] == null) {
                class275.field4236[arg0] = new class297[var2];
            }
            for (int var3 = 0; var3 < var2; var3++) {
                if (class275.field4236[arg0][var3] == null) {
                    byte[] var4 = class5.field68.method1605(-124, var3, arg0);
                    if (var4 != null) {
                        class297 var5 = class275.field4236[arg0][var3] = new class297();
                        var5.field4683 = (arg0 << 16) + var3;
                        if (var4[0] == -1) {
                            var5.method1985((byte) -112, new class54(var4));
                        } else {
                            var5.method1981((byte) 119, new class54(var4));
                        }
                    }
                }
            }
            if (arg1 != -31001) {
                method1167((short[]) null, (String[]) null, false);
            }
            class24.field388[arg0] = true;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(B)V")
    public static void method1166(byte arg0) {
        field2586 = null;
        field2572 = null;
        if (arg0 >= -77) {
            field2581 = 56;
        }
        field2587 = null;
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "([S[Ljava/lang/String;Z)V")
    public static final void method1167(short[] arg0, String[] arg1, boolean arg2) {
        if (arg2) {
            field2577++;
            class156.method1059(arg0, arg1, -124, arg1.length - 1, 0);
        }
    }
}
