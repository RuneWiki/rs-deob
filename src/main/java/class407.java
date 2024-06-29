import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!io")
public class class407 {

    @OriginalMember(owner = "client!io", name = "a", descriptor = "Lfn;")
    public static class52 field5631 = new class52(80, 3);

    @OriginalMember(owner = "client!io", name = "f", descriptor = "Ltm;")
    public static class112 field5636 = new class112("Examine", "Untersuchen", "Examiner", "Examinar");

    @OriginalMember(owner = "client!io", name = "j", descriptor = "Lcs;")
    public static class351 field5640 = new class351(9, 16);

    @OriginalMember(owner = "client!io", name = "k", descriptor = "Lfn;")
    public static class52 field5641 = new class52(29, 15);

    @OriginalMember(owner = "client!io", name = "m", descriptor = "I")
    public static int field5643 = 0;

    @OriginalMember(owner = "client!io", name = "l", descriptor = "I")
    public static int field5642 = 765;

    @OriginalMember(owner = "client!io", name = "n", descriptor = "I")
    public static int field5644 = 0;

    @OriginalMember(owner = "client!io", name = "o", descriptor = "Lcs;")
    public static class351 field5645 = new class351(42, 1);

    @OriginalMember(owner = "client!io", name = "h", descriptor = "F")
    public static float field5638;

    @OriginalMember(owner = "client!io", name = "b", descriptor = "I")
    public static int field5632;

    @OriginalMember(owner = "client!io", name = "c", descriptor = "I")
    public static int field5633;

    @OriginalMember(owner = "client!io", name = "d", descriptor = "I")
    public static int field5634;

    @OriginalMember(owner = "client!io", name = "e", descriptor = "I")
    public static int field5635;

    @OriginalMember(owner = "client!io", name = "g", descriptor = "I")
    public static int field5637;

    @OriginalMember(owner = "client!io", name = "i", descriptor = "Lpc;")
    public static class141 field5639;

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(IB[Lms;)V")
    public static final void method2389(int arg0, byte arg1, class363[] arg2) {
        if (arg1 > -125) {
            return;
        }
        for (int var3 = 0; var3 < arg2.length; var3++) {
            class363 var4 = arg2[var3];
            if (var4 != null) {
                if (var4.field5093 == 0) {
                    if (var4.field5113 != null) {
                        method2389(arg0, (byte) -126, var4.field5113);
                    }
                    class465 var5 = (class465) class231.field3258.method2614((long) var4.field5096, 41);
                    if (var5 != null) {
                        class64.method463(var5.field6527, 1, arg0);
                    }
                }
                if (arg0 == 0 && var4.field5054 != null) {
                    class32 var6 = new class32();
                    var6.field517 = var4;
                    var6.field518 = var4.field5054;
                    class212.method1331(var6);
                }
                if (arg0 == 1 && var4.field5086 != null) {
                    if (var4.field5047 >= 0) {
                        class363 var7 = class292.method1804((byte) -63, var4.field5096);
                        if (var7 == null || var7.field5113 == null || var4.field5047 >= var7.field5113.length || var7.field5113[var4.field5047] != var4) {
                            continue;
                        }
                    }
                    class32 var8 = new class32();
                    var8.field517 = var4;
                    var8.field518 = var4.field5086;
                    class212.method1331(var8);
                }
            }
        }
        field5632++;
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(B)V")
    public static final void method2390(byte arg0) {
        if (arg0 >= -106) {
            field5643 = -124;
        }
        if (class406.field5629 == null || class328.field4534 == null) {
            class328.field4534 = new int[256];
            class406.field5629 = new int[256];
            for (int var1 = 0; var1 < 256; var1++) {
                double var2 = (double) var1 / 255.0D * 6.283185307179586D;
                class406.field5629[var1] = (int) (Math.sin(var2) * 4096.0D);
                class328.field4534[var1] = (int) (Math.cos(var2) * 4096.0D);
            }
        }
        field5634++;
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
    public static final String method2391(String arg0, int arg1) {
        int var2 = 5 / ((arg1 + 76) / 37);
        field5633++;
        int var3 = arg0.length();
        char[] var4 = new char[var3];
        byte var5 = 2;
        for (int var6 = 0; var6 < var3; var6++) {
            char var7 = arg0.charAt(var6);
            if (var5 == 0) {
                var7 = Character.toLowerCase(var7);
            } else if (var5 == 2 || Character.isUpperCase(var7)) {
                var7 = class161.method982(false, var7);
            }
            if (Character.isLetter(var7)) {
                var5 = 0;
            } else if (var7 == '.' || var7 == '?' || var7 == '!') {
                var5 = 2;
            } else if (!Character.isSpaceChar(var7)) {
                var5 = 1;
            } else if (var5 != 2) {
                var5 = 1;
            }
            var4[var6] = var7;
        }
        return new String(var4);
    }

    @OriginalMember(owner = "client!io", name = "b", descriptor = "(B)V")
    public static void method2392(byte arg0) {
        field5636 = null;
        field5645 = null;
        field5641 = null;
        field5631 = null;
        int var1 = 8 % ((arg0 - 57) / 59);
        field5640 = null;
        field5639 = null;
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(IIIII)V")
    public static final void method2393(int arg0, int arg1, int arg2, int arg3, int arg4) {
        for (class462 var5 = (class462) class178.field2594.method1544(-96); var5 != null; var5 = (class462) class178.field2594.method1546((byte) -42)) {
            class439.method2549(arg3, arg4, arg2, (byte) -69, var5, arg1);
        }
        field5635++;
        if (arg0 != 64) {
            method2389(100, (byte) -34, (class363[]) null);
        }
        for (class462 var6 = (class462) class366.field5213.method1544(-126); var6 != null; var6 = (class462) class366.field5213.method1546((byte) -42)) {
            byte var11 = 1;
            class318 var12 = var6.field6495.method517(-87);
            if (var6.field6495.field1127) {
                var11 = 0;
            } else if (var6.field6495.field1089 == var12.field4348 || var6.field6495.field1089 == var12.field4312 || var6.field6495.field1089 == var12.field4352 || var6.field6495.field1089 == var12.field4317) {
                var11 = 2;
            } else if (var6.field6495.field1089 == var12.field4350 || var6.field6495.field1089 == var12.field4357 || var6.field6495.field1089 == var12.field4329 || var6.field6495.field1089 == var12.field4315) {
                var11 = 3;
            }
            if (var6.field6516 != var11) {
                int var13 = class257.method1600((byte) 97, var6.field6495);
                if (var6.field6510 != var13) {
                    if (var6.field6507 != null) {
                        class386.field5445.method1313(var6.field6507);
                        var6.field6507 = null;
                    }
                    var6.field6510 = var13;
                }
                var6.field6516 = var11;
            }
            var6.field6509 = var6.field6495.field6765;
            var6.field6506 = var6.field6495.field6765 + var6.field6495.method206(0) * 64;
            var6.field6500 = var6.field6495.field6746;
            var6.field6514 = var6.field6495.field6746 + var6.field6495.method206(arg0 ^ 0x40) * 64;
            class439.method2549(arg3, arg4, arg2, (byte) -69, var6, arg1);
        }
        for (class462 var7 = (class462) class78.field1184.method2615((byte) -18); var7 != null; var7 = (class462) class78.field1184.method2619((byte) -98)) {
            byte var8 = 1;
            class318 var9 = var7.field6513.method517(-117);
            if (var7.field6513.field1127) {
                var8 = 0;
            } else if (var7.field6513.field1089 == var9.field4348 || var7.field6513.field1089 == var9.field4312 || var7.field6513.field1089 == var9.field4352 || var7.field6513.field1089 == var9.field4317) {
                var8 = 2;
            } else if (var7.field6513.field1089 == var9.field4350 || var7.field6513.field1089 == var9.field4357 || var7.field6513.field1089 == var9.field4329 || var7.field6513.field1089 == var9.field4315) {
                var8 = 3;
            }
            if (var7.field6516 != var8) {
                int var10 = class347.method2080(true, var7.field6513);
                if (var7.field6510 != var10) {
                    if (var7.field6507 != null) {
                        class386.field5445.method1313(var7.field6507);
                        var7.field6507 = null;
                    }
                    var7.field6510 = var10;
                }
                var7.field6516 = var8;
            }
            var7.field6509 = var7.field6513.field6765;
            var7.field6506 = var7.field6513.field6765 + (var7.field6513.method206(0) * 64);
            var7.field6500 = var7.field6513.field6746;
            var7.field6514 = var7.field6513.field6746 + (var7.field6513.method206(0) * 64);
            class439.method2549(arg3, arg4, arg2, (byte) -69, var7, arg1);
        }
    }
}
