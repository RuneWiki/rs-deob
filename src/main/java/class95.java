import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gg")
public class class95 extends class34 implements class193 {

    @OriginalMember(owner = "client!gg", name = "Z", descriptor = "S")
    private short field1334;

    @OriginalMember(owner = "client!gg", name = "y", descriptor = "B")
    private byte field1307;

    @OriginalMember(owner = "client!gg", name = "P", descriptor = "Z")
    private boolean field1324;

    @OriginalMember(owner = "client!gg", name = "F", descriptor = "B")
    private byte field1314;

    @OriginalMember(owner = "client!gg", name = "G", descriptor = "Z")
    private boolean field1315;

    @OriginalMember(owner = "client!gg", name = "M", descriptor = "Z")
    private boolean field1321;

    @OriginalMember(owner = "client!gg", name = "W", descriptor = "B")
    private byte field1331;

    @OriginalMember(owner = "client!gg", name = "S", descriptor = "Z")
    private boolean field1327;

    @OriginalMember(owner = "client!gg", name = "V", descriptor = "Lmc;")
    private class69 field1330;

    @OriginalMember(owner = "client!gg", name = "Y", descriptor = "Lmj;")
    public class394 field1333;

    @OriginalMember(owner = "client!gg", name = "ab", descriptor = "[C")
    public static char[] field1335;

    @OriginalMember(owner = "client!gg", name = "z", descriptor = "I")
    public static int field1308;

    @OriginalMember(owner = "client!gg", name = "A", descriptor = "I")
    public static int field1309;

    @OriginalMember(owner = "client!gg", name = "B", descriptor = "I")
    public static int field1310;

    @OriginalMember(owner = "client!gg", name = "C", descriptor = "I")
    public static int field1311;

    @OriginalMember(owner = "client!gg", name = "D", descriptor = "I")
    public static int field1312;

    @OriginalMember(owner = "client!gg", name = "H", descriptor = "I")
    public static int field1316;

    @OriginalMember(owner = "client!gg", name = "I", descriptor = "I")
    public static int field1317;

    @OriginalMember(owner = "client!gg", name = "J", descriptor = "I")
    public static int field1318;

    @OriginalMember(owner = "client!gg", name = "K", descriptor = "I")
    public static int field1319;

    @OriginalMember(owner = "client!gg", name = "L", descriptor = "I")
    public static int field1320;

    @OriginalMember(owner = "client!gg", name = "N", descriptor = "I")
    public static int field1322;

    @OriginalMember(owner = "client!gg", name = "O", descriptor = "I")
    public static int field1323;

    @OriginalMember(owner = "client!gg", name = "Q", descriptor = "I")
    public static int field1325;

    @OriginalMember(owner = "client!gg", name = "R", descriptor = "I")
    public static int field1326;

    @OriginalMember(owner = "client!gg", name = "T", descriptor = "I")
    public static int field1328;

    @OriginalMember(owner = "client!gg", name = "U", descriptor = "I")
    public static int field1329;

    @OriginalMember(owner = "client!gg", name = "X", descriptor = "I")
    public static int field1332;

    @OriginalMember(owner = "client!gg", name = "bb", descriptor = "I")
    public static int field1336;

    @OriginalMember(owner = "client!gg", name = "E", descriptor = "Lk;")
    public static class337 field1313;

    static {
        new class442("You do not have permission to kick this user.", "Du darfst diesen Benutzer nicht rauswerfen.", "Vous n'êtes pas autorisé à expulser cet utilisateur.", "Você não tem permissão para expulsar este usuário.");
        field1335 = new char[] { '€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ' };
        new class442("You can spot a Jagex moderator by the gold crown next to their name.", "Jagex-Mitarbeiter haben eine goldene Krone neben ihrem Namen.", "Vous pouvez reconnaître les modérateurs Jagex à la couronne dorée en regard de leur nom.", "Os moderadores da Jagex são identificados por uma coroa dourada próxima ao \u007fnome.");
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(I)I", line = 5)
    public final int method672(int arg0) {
        ++field1323;
        if (arg0 != 17011) {
            this.method679(74, (byte) 45, 118, 70, (class203) null, (class345) null, true);
        }
        return this.field1307;
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(ZZ)V", line = 20)
    public static final void method673(boolean arg0, boolean arg1) {
        if (arg1) {
            ++field1329;
            class285.method1860(12);
            if (class446.field6250 == 30 || class446.field6250 == 25) {
                ++class263.field3664;
                if (class263.field3664 >= 50 || arg0) {
                    class263.field3664 = 0;
                    if (!class399.field5700 && class156.field2207 != null) {
                        class46.field648.method1178(63, 61);
                        ++class264.field3684;
                        try {
                            class156.field2207.method2203(class46.field648.field230, 0, class46.field648.field191, -68);
                            class46.field648.field191 = 0;
                        } catch (IOException var2) {
                            class399.field5700 = true;
                        }
                    }
                    class285.method1860(12);
                }
            }
        }
    }

    @OriginalMember(owner = "client!gg", name = "<init>", descriptor = "(Luo;Lgm;IIIIZIIZ)V", line = 55)
    public class95(class345 arg0, class64 arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, boolean arg9) {
        super(arg3, arg4, arg5, class348.method2214(arg7, arg8, (byte) -43));
        this.field1334 = (short) arg1.field916;
        super.field533 = (short) arg3;
        this.field1307 = (byte) arg8;
        this.field1324 = arg9;
        this.field1314 = (byte) arg7;
        super.field525 = (short) arg5;
        this.field1315 = arg1.field922 != 0 && !arg6;
        this.field1321 = arg6;
        this.field1331 = (byte) arg2;
        this.field1327 = arg0.method125() && arg1.field939 && !this.field1321 && ~class327.field4508 != -1;
        int var11 = 1024;
        if (this.field1324) {
            var11 |= 32768;
        }
        class33 var12 = this.method687(arg0, var11, this.field1327, 3);
        if (var12 != null) {
            this.field1330 = var12.field520;
            this.field1333 = var12.field516;
            if (this.field1324) {
                this.field1333 = this.field1333.method1430((byte) 0, var11, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!gg", name = "d", descriptor = "(B)V", line = 90)
    public final void method674(byte arg0) {
        if (arg0 != -1) {
            this.field1333 = null;
        }
        ++field1332;
        this.field1324 = false;
        if (this.field1333 != null) {
            this.field1333.method1453(this.field1333.method1424() & -32769);
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(IILuo;I)Z", line = 105)
    public final boolean method675(int arg0, int arg1, class345 arg2, int arg3) {
        if (arg1 != -20759) {
            this.method683((byte) -29);
        }
        ++field1310;
        class394 var5 = this.method690(65536, (byte) -28, arg2);
        if (var5 != null) {
            class417 var6 = arg2.method84();
            var6.method702(super.field533, super.field534, super.field525);
            return var5.method1465(arg3, arg0, var6, false);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(ILuo;)V", line = 126)
    public final void method676(int arg0, class345 arg1) {
        if (arg0 > -58) {
            this.method676(76, (class345) null);
        }
        ++field1325;
        Object var3 = null;
        class69 var5;
        if (this.field1330 == null && this.field1327) {
            class33 var4 = this.method687(arg1, 131072, true, 3);
            var5 = var4 == null ? null : var4.field520;
        } else {
            var5 = this.field1330;
            this.field1330 = null;
        }
        if (var5 != null) {
            class423.method2681(var5, this.field1331, super.field533, super.field525, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(Luo;I)V", line = 155)
    public final void method677(class345 arg0, int arg1) {
        ++field1317;
        if (arg1 <= 33) {
            field1335 = null;
        }
        Object var3 = null;
        class69 var5;
        if (this.field1330 == null && this.field1327) {
            class33 var4 = this.method687(arg0, 131072, true, 3);
            var5 = var4 != null ? var4.field520 : null;
        } else {
            var5 = this.field1330;
            this.field1330 = null;
        }
        if (var5 != null) {
            class91.method648(var5, this.field1331, super.field533, super.field525, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "(Luo;I)V", line = 188)
    public final void method678(class345 arg0, int arg1) {
        if (arg1 == -22948) {
            ++field1312;
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(IBIILrr;Luo;Z)V", line = 198)
    public final void method679(int arg0, byte arg1, int arg2, int arg3, class203 arg4, class345 arg5, boolean arg6) {
        if (arg1 == -126) {
            ++field1328;
            if (!(arg4 instanceof class95)) {
                if (arg4 instanceof class347) {
                    class347 var8 = (class347) arg4;
                    if (this.field1333 != null && var8.field4764 != null) {
                        this.field1333.method1454(var8.field4764, arg3, arg2, arg0, arg6);
                        return;
                    }
                }
            } else {
                class95 var9 = (class95) arg4;
                if (this.field1333 == null || var9.field1333 == null) {
                    return;
                }
                this.field1333.method1454(var9.field1333, arg3, arg2, arg0, arg6);
            }
        }
    }

    @OriginalMember(owner = "client!gg", name = "c", descriptor = "(I)V", line = 230)
    public final void method680(int arg0) {
        if (arg0 != -24686) {
            this.field1330 = null;
        }
        if (this.field1333 != null) {
            this.field1333.method1467();
        }
        ++field1326;
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(ZLuo;)Laj;", line = 245)
    public final class170 method681(boolean arg0, class345 arg1) {
        ++field1311;
        if (this.field1333 == null) {
            return null;
        } else if (!arg0) {
            return null;
        } else {
            class417 var3 = arg1.method84();
            var3.method702(super.field533, super.field534, super.field525);
            class170 var4 = null;
            if (this.field1315) {
                var4 = class175.method1152((byte) 72, 1);
            }
            this.field1333.method1416(var3, var4 == null ? null : var4.field2333[0], 0);
            return var4;
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(II)I", line = 275)
    public static final int method682(int arg0, int arg1) {
        if (arg0 != 8216) {
            field1335 = null;
        }
        ++field1316;
        return 127 & arg1;
    }

    @OriginalMember(owner = "client!gg", name = "c", descriptor = "(B)Z", line = 288)
    public final boolean method683(byte arg0) {
        int var2 = 84 % ((arg0 - 47) / 47);
        ++field1319;
        return this.field1324;
    }

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "(I)I", line = 299)
    public final int method684(int arg0) {
        if (arg0 != -13726) {
            this.method681(true, (class345) null);
        }
        ++field1336;
        return this.field1314;
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(ILuo;I)Lmj;", line = 312)
    public final class394 method685(int arg0, class345 arg1, int arg2) {
        if (arg2 != -9380) {
            method682(-48, 75);
        }
        ++field1308;
        return this.method690(arg0, (byte) -28, arg1);
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(Lgr;III)V", line = 327)
    public static final void method686(class249 arg0, int arg1, int arg2, int arg3) {
        int var4 = class54.field754[arg1][arg2][arg3];
        int var5 = 0;
        arg0.field3522 = 0;
        while (var5 <= 24) {
            int var6 = var4 >> var5 & 255;
            if (var6 <= 0) {
                break;
            }
            arg0.field3521[arg0.field3522++] = class14.field280[var6 - 1];
            var5 += 8;
        }
        for (int var7 = arg0.field3522; var7 < 4; ++var7) {
            arg0.field3521[var7] = null;
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(Luo;IZI)Lvg;", line = 356)
    private final class33 method687(class345 arg0, int arg1, boolean arg2, int arg3) {
        ++field1320;
        if (arg3 != 3) {
            this.field1330 = null;
        }
        class64 var5 = class375.method2395((byte) 115, this.field1334 & 65535);
        class242 var6;
        class242 var7;
        if (!this.field1321) {
            var6 = class418.field5939[this.field1331];
            if (this.field1331 < 3) {
                var7 = class418.field5939[this.field1331 + 1];
            } else {
                var7 = null;
            }
        } else {
            var7 = class418.field5939[0];
            var6 = class214.field2979[this.field1331];
        }
        return var5.method497(arg0, this.field1307, super.field533, this.field1314, var6, (byte) -11, super.field534, var7, super.field525, arg2, arg1);
    }

    @OriginalMember(owner = "client!gg", name = "f", descriptor = "(B)V", line = 387)
    public static void method688(byte arg0) {
        if (arg0 != -89) {
            method686((class249) null, -92, -71, 107);
        }
        field1313 = null;
        field1335 = null;
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(B)I", line = 403)
    public final int method689(byte arg0) {
        if (arg0 != -83) {
            return 48;
        } else {
            ++field1318;
            return 65535 & this.field1334;
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(IBLuo;)Lmj;", line = 419)
    private final class394 method690(int arg0, byte arg1, class345 arg2) {
        ++field1309;
        if (this.field1333 != null && arg2.method139(this.field1333.method1424(), arg0) == 0) {
            return this.field1333;
        } else {
            if (arg1 != -28) {
                method686((class249) null, 114, -114, 119);
            }
            class33 var4 = this.method687(arg2, arg0, false, 3);
            return var4 == null ? null : var4.field516;
        }
    }

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "(B)Z", line = 444)
    public final boolean method691(byte arg0) {
        if (arg0 != -72) {
            return true;
        } else {
            ++field1322;
            return this.field1327;
        }
    }
}
