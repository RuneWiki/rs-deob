import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public class class127 {

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "I")
    public static int field3213 = 0;

    @OriginalMember(owner = "client!sc", name = "f", descriptor = "I")
    public static int field3218 = 5063219;

    @OriginalMember(owner = "client!sc", name = "i", descriptor = "Lfc;")
    public static class39 field3221 = class90.method774("nav", -106);

    @OriginalMember(owner = "client!sc", name = "n", descriptor = "I")
    public static int field3226 = 10;

    @OriginalMember(owner = "client!sc", name = "h", descriptor = "Lfc;")
    private static class39 field3220 = class90.method774("flash1:", -91);

    @OriginalMember(owner = "client!sc", name = "u", descriptor = "Lfc;")
    public static class39 field3233 = class90.method774("Bitte versuchen Sie es erneut)3", -105);

    @OriginalMember(owner = "client!sc", name = "w", descriptor = "Lfc;")
    public static class39 field3235 = class90.method774("Fps:", -86);

    @OriginalMember(owner = "client!sc", name = "y", descriptor = "Lfc;")
    public static class39 field3237 = class90.method774("blinken2:", -82);

    @OriginalMember(owner = "client!sc", name = "s", descriptor = "I")
    public static int field3231 = 0;

    @OriginalMember(owner = "client!sc", name = "x", descriptor = "Lfc;")
    public static class39 field3236 = class90.method774(",Zffentlicher Chat", -120);

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "Lfc;")
    private static class39 field3214 = class90.method774("Prepared sound engine", -103);

    @OriginalMember(owner = "client!sc", name = "e", descriptor = "Lfc;")
    public static class39 field3217 = field3220;

    @OriginalMember(owner = "client!sc", name = "m", descriptor = "Lfc;")
    private static class39 field3225 = class90.method774("Existing User", -119);

    @OriginalMember(owner = "client!sc", name = "o", descriptor = "Lfc;")
    public static class39 field3227 = class90.method774("Registrierter Benutzer", -92);

    @OriginalMember(owner = "client!sc", name = "j", descriptor = "Lfc;")
    public static class39 field3222 = field3214;

    @OriginalMember(owner = "client!sc", name = "A", descriptor = "Lfc;")
    public static class39 field3239 = class90.method774("Spieler kann nicht gefunden werden: ", -79);

    @OriginalMember(owner = "client!sc", name = "v", descriptor = "Lfc;")
    public static class39 field3234 = field3220;

    @OriginalMember(owner = "client!sc", name = "c", descriptor = "Lfc;")
    public static class39 field3215 = field3225;

    @OriginalMember(owner = "client!sc", name = "d", descriptor = "I")
    public static int field3216;

    @OriginalMember(owner = "client!sc", name = "g", descriptor = "I")
    public static int field3219;

    @OriginalMember(owner = "client!sc", name = "k", descriptor = "I")
    public static int field3223;

    @OriginalMember(owner = "client!sc", name = "l", descriptor = "I")
    public static int field3224;

    @OriginalMember(owner = "client!sc", name = "p", descriptor = "I")
    public static int field3228;

    @OriginalMember(owner = "client!sc", name = "q", descriptor = "I")
    public static int field3229;

    @OriginalMember(owner = "client!sc", name = "z", descriptor = "I")
    public static int field3238;

    @OriginalMember(owner = "client!sc", name = "r", descriptor = "Loc;")
    public static class100 field3230;

    @OriginalMember(owner = "client!sc", name = "t", descriptor = "Lue;")
    public static class141 field3232;

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(Z)V", line = 11)
    public static final void method1051(boolean arg0) {
        for (int var1 = 0; var1 < class15.field416; var1++) {
            int var2 = class121.field3176[var1];
            class121 var3 = class118.field3092[var2];
            if (var3 != null) {
                class39.method460(var3, var3.field3163.field2279, -30616);
            }
        }
        field3238++;
        if (!arg0) {
            method1056(54);
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(ILmf;B)V", line = 51)
    public static final void method1052(int arg0, class89 arg1, byte arg2) {
        field3228++;
        if (class145.field3627 == null) {
            class61.method607(255, null, (byte) 2, 255, true, (byte) 0, 0);
            if (arg2 == -8) {
                class101.field2538[arg0] = arg1;
            }
        } else {
            class145.field3627.field710 = arg0 * 8 + 5;
            int var3 = class145.field3627.method313((byte) 28);
            int var4 = class145.field3627.method313((byte) 25);
            arg1.method758(var3, -99, var4);
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(I)V", line = 78)
    public static final void method1053(int arg0) {
        field3219++;
        if (arg0 == -20200) {
            class109.field2733.method927(false);
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(IBILoc;)Z", line = 102)
    public static final boolean method1054(int arg0, byte arg1, int arg2, class100 arg3) {
        if (arg1 != 0) {
            return true;
        }
        field3224++;
        byte[] var4 = arg3.method839(arg1 ^ 0x5, arg2, arg0);
        if (var4 == null) {
            return false;
        } else {
            class6.method88(var4, 117);
            return true;
        }
    }

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "(I)V", line = 135)
    public static final void method1055(int arg0) {
        for (int var1 = 0; var1 < class145.field3615; var1++) {
            int var10002 = class1.field11[var1]--;
            if (class1.field11[var1] >= -10) {
                class21 var3 = class25.field735[var1];
                if (var3 == null) {
                    var3 = class21.method227(class53.field1333, class90.field2136[var1], 0);
                    if (var3 == null) {
                        continue;
                    }
                    class1.field11[var1] += var3.method225();
                    class25.field735[var1] = var3;
                }
                if (class1.field11[var1] < 0) {
                    int var10;
                    if (class50.field1264[var1] == 0) {
                        var10 = class44.field1212;
                    } else {
                        int var4 = (class50.field1264[var1] & 0xFF) * 128;
                        int var5 = class50.field1264[var1] >> 16 & 0xFF;
                        int var6 = class50.field1264[var1] >> 8 & 0xFF;
                        int var7 = var5 * 128 + 64 - class94.field2197.field2916;
                        int var8 = var6 * 128 + 64 - class94.field2197.field2909;
                        if (var7 < 0) {
                            var7 = -var7;
                        }
                        if (var8 < 0) {
                            var8 = -var8;
                        }
                        int var9 = var7 + var8 - 128;
                        if (var4 < var9) {
                            class1.field11[var1] = -100;
                            continue;
                        }
                        if (var9 < 0) {
                            var9 = 0;
                        }
                        var10 = (var4 - var9) * class24.field669 / var4;
                    }
                    if (var10 > 0) {
                        class105 var11 = var3.method224().method938(class63.field1550);
                        class102 var12 = class102.method907(var11, 100, var10);
                        var12.method877(class145.field3629[var1] - 1);
                        class37.field1014.method536(var12);
                    }
                    class1.field11[var1] = -100;
                }
            } else {
                class145.field3615--;
                for (int var2 = var1; var2 < class145.field3615; var2++) {
                    class90.field2136[var2] = class90.field2136[var2 + 1];
                    class25.field735[var2] = class25.field735[var2 + 1];
                    class145.field3629[var2] = class145.field3629[var2 + 1];
                    class1.field11[var2] = class1.field11[var2 + 1];
                    class50.field1264[var2] = class50.field1264[var2 + 1];
                }
                var1--;
            }
        }
        if (arg0 > -51) {
            return;
        }
        if (class9.field255 && !class112.method983(0)) {
            if (class37.field998 != 0 && class55.field1371 != -1) {
                class75.method672(class55.field1371, 0, false, class57.field1418, false, class37.field998);
            }
            class9.field255 = false;
        }
        field3216++;
    }

    @OriginalMember(owner = "client!sc", name = "c", descriptor = "(I)V", line = 273)
    public static void method1056(int arg0) {
        field3221 = null;
        field3232 = null;
        field3222 = null;
        field3237 = null;
        field3215 = null;
        if (arg0 > -57) {
            method1056(-123);
        }
        field3214 = null;
        field3235 = null;
        field3234 = null;
        field3225 = null;
        field3239 = null;
        field3220 = null;
        field3217 = null;
        field3236 = null;
        field3230 = null;
        field3233 = null;
        field3227 = null;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lob;I)Lob;", line = 322)
    public static final class99 method1057(class99 arg0, int arg1) {
        field3223++;
        if (arg1 != 100) {
            field3239 = null;
        }
        class99 var2 = class39.method463(arg0, 56);
        if (var2 == null) {
            var2 = arg0.field2358;
        }
        return var2;
    }
}
