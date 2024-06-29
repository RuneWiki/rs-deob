import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public class class23 {

    @OriginalMember(owner = "client!db", name = "c", descriptor = "Loc;")
    private static class99 field541 = class48.method402((byte) -104, "Loaded fonts");

    @OriginalMember(owner = "client!db", name = "e", descriptor = "Loc;")
    private static class99 field543 = class48.method402((byte) -104, "Public chat");

    @OriginalMember(owner = "client!db", name = "k", descriptor = "Loc;")
    public static class99 field549 = class48.method402((byte) -104, "Moderator)2Option: Spieler f-Ur 48 Stunden stumm schalten: <AUS>");

    @OriginalMember(owner = "client!db", name = "f", descriptor = "Loc;")
    public static class99 field544 = field543;

    @OriginalMember(owner = "client!db", name = "m", descriptor = "Loc;")
    public static class99 field551 = field541;

    @OriginalMember(owner = "client!db", name = "b", descriptor = "I")
    public static int field540 = 0;

    @OriginalMember(owner = "client!db", name = "r", descriptor = "I")
    public static int field556 = 0;

    @OriginalMember(owner = "client!db", name = "n", descriptor = "Loc;")
    private static class99 field552 = class48.method402((byte) -104, "Too many connections from your address)3");

    @OriginalMember(owner = "client!db", name = "p", descriptor = "Loc;")
    public static class99 field554 = field552;

    @OriginalMember(owner = "client!db", name = "i", descriptor = "Loc;")
    public static class99 field547 = class48.method402((byte) -104, "@whi@ )4 ");

    @OriginalMember(owner = "client!db", name = "s", descriptor = "Loc;")
    public static class99 field557 = class48.method402((byte) -104, "Fps:");

    @OriginalMember(owner = "client!db", name = "v", descriptor = "I")
    public static int field560 = 0;

    @OriginalMember(owner = "client!db", name = "q", descriptor = "I")
    public static int field555 = -1;

    @OriginalMember(owner = "client!db", name = "w", descriptor = "Loc;")
    public static class99 field561 = class48.method402((byte) -104, "Stufe)2");

    @OriginalMember(owner = "client!db", name = "d", descriptor = "I")
    public static int field542;

    @OriginalMember(owner = "client!db", name = "g", descriptor = "I")
    public static int field545;

    @OriginalMember(owner = "client!db", name = "h", descriptor = "I")
    public static int field546;

    @OriginalMember(owner = "client!db", name = "j", descriptor = "I")
    public static int field548;

    @OriginalMember(owner = "client!db", name = "l", descriptor = "I")
    public static int field550;

    @OriginalMember(owner = "client!db", name = "t", descriptor = "I")
    public static int field558;

    @OriginalMember(owner = "client!db", name = "u", descriptor = "I")
    public static int field559;

    @OriginalMember(owner = "client!db", name = "o", descriptor = "Lpc;")
    public static class105 field553;

    @OriginalMember(owner = "client!db", name = "a", descriptor = "[I")
    public static int[] field539;

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(B)V")
    public static final void method207(byte arg0) {
        class121.field2954 = 0;
        if (arg0 < 115) {
            field556 = -33;
        }
        field546++;
        int var1 = (class69.field1770.field3077 >> 7) + class5.field120;
        int var2 = (class69.field1770.field3115 >> 7) + class67.field1712;
        if (var2 >= 3053 && var2 <= 3156 && var1 >= 3056 && var1 <= 3136) {
            class121.field2954 = 1;
        }
        if (var2 >= 3072 && var2 <= 3118 && var1 >= 9492 && var1 <= 9535) {
            class121.field2954 = 1;
        }
        if (class121.field2954 == 1 && var2 >= 3139 && var2 <= 3199 && var1 >= 3008 && var1 <= 3062) {
            class121.field2954 = 0;
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(IIII[Lhe;IIIIILhe;I)Lhe;")
    public static final class54 method208(int arg0, int arg1, int arg2, int arg3, class54[] arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class54 arg10, int arg11) {
        field542++;
        if (arg1 > arg2 || arg0 > arg6 || arg2 >= arg5 || arg6 >= arg7) {
            return null;
        }
        int var12 = 100 / ((56 - arg9) / 58);
        for (int var13 = 0; var13 < arg4.length; var13++) {
            class54 var14 = arg4[var13];
            if (var14 != null && var14.field1292 == arg3 && !class11.method123((byte) 94, var14) && arg10 != var14) {
                int var15 = arg1 + var14.field1324 - arg8;
                int var16 = var14.field1356 + arg0 - arg11;
                if (var14.field1341 == 0) {
                    class54 var17 = method208(var16, var15, arg2, var14.field1293, arg4, var14.field1383 + var15, arg6, var14.field1403 + var16, var14.field1296, 120, arg10, var14.field1378);
                    if (var17 != null) {
                        return var17;
                    }
                    if (var14.field1344 != null) {
                        class54 var18 = method208(var16, var15, arg2, var14.field1293, var14.field1344, var15 + var14.field1383, arg6, var16 + var14.field1403, var14.field1296, 118, arg10, var14.field1378);
                        if (var18 != null) {
                            return var18;
                        }
                    }
                }
                if (class36.method315(class20.method188(var14, -604452832), 20454) && arg2 >= var15 && arg6 >= var16 && var14.field1383 + var15 > arg2 && var14.field1403 + var16 > arg6) {
                    return var14;
                }
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(I)V")
    public static final void method209(int arg0) {
        class125.field2991.method998(true);
        if (arg0 >= -52) {
            field556 = 70;
        }
        class27.field677.method998(true);
        field545++;
    }

    @OriginalMember(owner = "client!db", name = "b", descriptor = "(I)V")
    public static void method210(int arg0) {
        field561 = null;
        field557 = null;
        field544 = null;
        field541 = null;
        field551 = null;
        field547 = null;
        field554 = null;
        field553 = null;
        field552 = null;
        if (arg0 >= -13) {
            method212(59, true);
        }
        field543 = null;
        field539 = null;
        field549 = null;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "([Lee;II[BIII)V")
    public static final void method211(class34[] arg0, int arg1, int arg2, byte[] arg3, int arg4, int arg5, int arg6) {
        field550++;
        for (int var7 = 0; var7 < 4; var7++) {
            for (int var12 = 0; var12 < 64; var12++) {
                for (int var13 = 0; var13 < 64; var13++) {
                    if (arg6 + var12 > 0 && arg6 + var12 < 103 && arg4 + var13 > 0 && arg4 + var13 < 103) {
                        arg0[var7].field820[arg6 + var12][arg4 + var13] = class17.method171(arg0[var7].field820[arg6 + var12][arg4 + var13], -16777217);
                    }
                }
            }
        }
        class57 var8 = new class57(arg3);
        int var9 = 0;
        if (arg2 != 5048) {
            return;
        }
        while (var9 < 4) {
            for (int var10 = 0; var10 < 64; var10++) {
                for (int var11 = 0; var11 < 64; var11++) {
                    class93.method772(var8, arg5, arg4 + var11, (byte) -15, arg6 + var10, var9, 0, arg1);
                }
            }
            var9++;
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(IZ)V")
    public static final void method212(int arg0, boolean arg1) {
        class111.method949(18645);
        if (arg0 != 36) {
            return;
        }
        field548++;
        class15.field354++;
        if (class15.field354 < 50 && !arg1) {
            return;
        }
        class15.field354 = 0;
        if (class3.field54 || class104.field2536 == null) {
            return;
        }
        class133.field3231++;
        class134.field3276.method869((byte) 11, 36);
        try {
            class104.field2536.method1214(0, true, class134.field3276.field1469, class134.field3276.field1477);
            class134.field3276.field1477 = 0;
        } catch (IOException var2) {
            class3.field54 = true;
        }
    }
}
