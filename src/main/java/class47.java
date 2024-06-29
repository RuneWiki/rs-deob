import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public class class47 extends class113 {

    @OriginalMember(owner = "client!ie", name = "J", descriptor = "I")
    private int field862 = 0;

    @OriginalMember(owner = "client!ie", name = "B", descriptor = "Lmj;")
    private class144 field854 = new class144(16);

    @OriginalMember(owner = "client!ie", name = "S", descriptor = "I")
    private int field871 = 0;

    @OriginalMember(owner = "client!ie", name = "V", descriptor = "Lre;")
    private class266 field874 = new class266();

    @OriginalMember(owner = "client!ie", name = "X", descriptor = "J")
    private long field876 = 0L;

    @OriginalMember(owner = "client!ie", name = "x", descriptor = "I")
    private int field850;

    @OriginalMember(owner = "client!ie", name = "O", descriptor = "Lek;")
    private class239 field867;

    @OriginalMember(owner = "client!ie", name = "W", descriptor = "Z")
    private boolean field875;

    @OriginalMember(owner = "client!ie", name = "T", descriptor = "Lre;")
    private class266 field872;

    @OriginalMember(owner = "client!ie", name = "M", descriptor = "I")
    private int field865;

    @OriginalMember(owner = "client!ie", name = "s", descriptor = "I")
    private int field845;

    @OriginalMember(owner = "client!ie", name = "p", descriptor = "Lhk;")
    private class159 field842;

    @OriginalMember(owner = "client!ie", name = "D", descriptor = "Lek;")
    private class239 field856;

    @OriginalMember(owner = "client!ie", name = "Y", descriptor = "Z")
    private boolean field877;

    @OriginalMember(owner = "client!ie", name = "C", descriptor = "Lra;")
    private class116 field855;

    @OriginalMember(owner = "client!ie", name = "A", descriptor = "Lr;")
    private class238 field853;

    @OriginalMember(owner = "client!ie", name = "m", descriptor = "Ljava/lang/String;")
    public static String field839 = "Please wait...";

    @OriginalMember(owner = "client!ie", name = "n", descriptor = "[Ljava/lang/String;")
    public static String[] field840 = new String[500];

    @OriginalMember(owner = "client!ie", name = "Q", descriptor = "Z")
    public static boolean field869 = false;

    @OriginalMember(owner = "client!ie", name = "G", descriptor = "Lf;")
    public static class227 field859 = new class227(64);

    @OriginalMember(owner = "client!ie", name = "o", descriptor = "I")
    public static int field841;

    @OriginalMember(owner = "client!ie", name = "q", descriptor = "I")
    public static int field843;

    @OriginalMember(owner = "client!ie", name = "r", descriptor = "I")
    public static int field844;

    @OriginalMember(owner = "client!ie", name = "t", descriptor = "I")
    public static int field846;

    @OriginalMember(owner = "client!ie", name = "u", descriptor = "I")
    public static int field847;

    @OriginalMember(owner = "client!ie", name = "v", descriptor = "I")
    public static int field848;

    @OriginalMember(owner = "client!ie", name = "w", descriptor = "I")
    public static int field849;

    @OriginalMember(owner = "client!ie", name = "y", descriptor = "I")
    public static int field851;

    @OriginalMember(owner = "client!ie", name = "z", descriptor = "I")
    public static int field852;

    @OriginalMember(owner = "client!ie", name = "E", descriptor = "I")
    public static int field857;

    @OriginalMember(owner = "client!ie", name = "F", descriptor = "I")
    public static int field858;

    @OriginalMember(owner = "client!ie", name = "I", descriptor = "I")
    public static int field861;

    @OriginalMember(owner = "client!ie", name = "K", descriptor = "I")
    public static int field863;

    @OriginalMember(owner = "client!ie", name = "L", descriptor = "I")
    public static int field864;

    @OriginalMember(owner = "client!ie", name = "P", descriptor = "I")
    public static int field868;

    @OriginalMember(owner = "client!ie", name = "R", descriptor = "I")
    public static int field870;

    @OriginalMember(owner = "client!ie", name = "H", descriptor = "Lca;")
    private class131 field860;

    @OriginalMember(owner = "client!ie", name = "U", descriptor = "Z")
    private boolean field873;

    @OriginalMember(owner = "client!ie", name = "N", descriptor = "[B")
    private byte[] field866;

    @OriginalMember(owner = "client!ie", name = "c", descriptor = "(B)V")
    public static void method397(byte arg0) {
        if (arg0 <= -20) {
            field839 = null;
            field840 = null;
            field859 = null;
        }
    }

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "(B)Lca;")
    public final class131 method398(byte arg0) {
        field857++;
        if (this.field860 != null) {
            return this.field860;
        } else if (arg0 == 0) {
            if (this.field853 == null) {
                if (this.field842.method1142(true)) {
                    return null;
                }
                this.field853 = this.field842.method1151((byte) -48, 255, true, this.field850, (byte) 0);
            }
            if (this.field853.field3756) {
                return null;
            }
            byte[] var2 = this.field853.method733(true);
            if (this.field853 instanceof class96) {
                try {
                    if (var2 == null) {
                        throw new RuntimeException();
                    }
                    this.field860 = new class131(var2, this.field845);
                    if (this.field860.field2167 != this.field865) {
                        throw new RuntimeException();
                    }
                } catch (RuntimeException var3) {
                    this.field860 = null;
                    if (this.field842.method1142(true)) {
                        this.field853 = null;
                    } else {
                        this.field853 = this.field842.method1151((byte) -128, 255, true, this.field850, (byte) 0);
                    }
                    return null;
                }
            } else {
                try {
                    if (var2 == null) {
                        throw new RuntimeException();
                    }
                    this.field860 = new class131(var2, this.field845);
                } catch (RuntimeException var4) {
                    this.field842.method1143((byte) 18);
                    this.field860 = null;
                    if (this.field842.method1142(true)) {
                        this.field853 = null;
                    } else {
                        this.field853 = this.field842.method1151((byte) -57, 255, true, this.field850, (byte) 0);
                    }
                    return null;
                }
                if (this.field856 != null) {
                    this.field855.method862(this.field856, this.field850, arg0 ^ 0xFFFFFF8D, var2);
                }
            }
            this.field853 = null;
            if (this.field867 != null) {
                this.field866 = new byte[this.field860.field2180];
                this.field862 = 0;
            }
            return this.field860;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "(II)I")
    public final int method399(int arg0, int arg1) {
        if (arg0 != -26533) {
            this.method412(-27, (byte) 108);
        }
        field863++;
        class238 var3 = (class238) this.field854.method1063((byte) -24, (long) arg1);
        return var3 == null ? 0 : var3.method734(-111);
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(IIZIII)V")
    public static final void method400(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        field846++;
        int var6 = arg5 - arg0;
        int var7 = arg4 - arg1;
        if (var7 == 0) {
            if (var6 != 0) {
                class106.method795(arg1, arg3, arg5, -58, arg0);
            }
        } else if (var6 == 0) {
            class225.method1508(arg4, arg3, arg0, arg1, -31738);
        } else {
            if (var7 < 0) {
                var7 = -var7;
            }
            if (!arg2) {
                method397((byte) -71);
            }
            if (var6 < 0) {
                var6 = -var6;
            }
            boolean var8 = var6 > var7;
            if (var8) {
                int var9 = arg1;
                arg1 = arg0;
                arg0 = var9;
                int var10 = arg4;
                arg4 = arg5;
                arg5 = var10;
            }
            if (arg4 < arg1) {
                int var11 = arg1;
                arg1 = arg4;
                arg4 = var11;
                int var12 = arg0;
                arg0 = arg5;
                arg5 = var12;
            }
            int var13 = arg4 - arg1;
            int var14 = arg0;
            int var15 = arg0 >= arg5 ? -1 : 1;
            int var16 = -(var13 >> 1);
            int var17 = arg5 - arg0;
            if (var17 < 0) {
                var17 = -var17;
            }
            if (var8) {
                for (int var19 = arg1; var19 <= arg4; var19++) {
                    class114.field1841[var19][var14] = arg3;
                    var16 += var17;
                    if (var16 > 0) {
                        var14 += var15;
                        var16 -= var13;
                    }
                }
            } else {
                for (int var18 = arg1; var18 <= arg4; var18++) {
                    class114.field1841[var14][var18] = arg3;
                    var16 += var17;
                    if (var16 > 0) {
                        var16 -= var13;
                        var14 += var15;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "(I)V")
    public final void method401(int arg0) {
        field841++;
        if (arg0 <= 13) {
            this.field854 = null;
        }
        if (this.field872 == null || this.method398((byte) 0) == null) {
            return;
        }
        for (class146 var2 = this.field874.method1807(-111); var2 != null; var2 = this.field874.method1808((byte) 47)) {
            int var3 = (int) var2.field2406;
            if (var3 < 0 || var3 >= this.field860.field2180 || this.field860.field2185[var3] == 0) {
                var2.method1074((byte) -11);
            } else {
                if (this.field866[var3] == 0) {
                    this.method411(var3, 1, (byte) -40);
                }
                if (this.field866[var3] == -1) {
                    this.method411(var3, 2, (byte) -40);
                }
                if (this.field866[var3] == 1) {
                    var2.method1074((byte) -122);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ie", name = "c", descriptor = "(I)I")
    public final int method402(int arg0) {
        field852++;
        if (arg0 != 13918) {
            this.field856 = null;
        }
        if (this.method398((byte) 0) == null) {
            return this.field853 == null ? 0 : this.field853.method734(-122);
        } else {
            return 100;
        }
    }

    @OriginalMember(owner = "client!ie", name = "d", descriptor = "(I)I")
    public final int method403(int arg0) {
        field844++;
        int var2 = -125 % ((80 - arg0) / 40);
        if (this.field860 == null) {
            return 0;
        } else if (this.field875) {
            class146 var3 = this.field872.method1807(-120);
            return var3 == null ? 0 : (int) var3.field2406;
        } else {
            return this.field860.field2188;
        }
    }

    @OriginalMember(owner = "client!ie", name = "d", descriptor = "(B)I")
    public final int method404(byte arg0) {
        if (arg0 <= 1) {
            this.method406((byte) -71);
        }
        field843++;
        return this.field860 == null ? 0 : this.field860.field2188;
    }

    @OriginalMember(owner = "client!ie", name = "e", descriptor = "(I)I")
    public final int method405(int arg0) {
        field849++;
        if (arg0 != 25547) {
            method400(-121, 105, true, 68, -99, -28);
        }
        return this.field862;
    }

    @OriginalMember(owner = "client!ie", name = "e", descriptor = "(B)V")
    public final void method406(byte arg0) {
        field868++;
        if (arg0 != -99) {
            this.method406((byte) -9);
        }
        if (this.field867 != null) {
            this.field873 = true;
            if (this.field872 == null) {
                this.field872 = new class266();
            }
        }
    }

    @OriginalMember(owner = "client!ie", name = "f", descriptor = "(B)V")
    public final void method407(byte arg0) {
        field864++;
        if (this.field872 != null) {
            if (this.method398((byte) 0) == null) {
                return;
            }
            if (this.field875) {
                boolean var6 = true;
                for (class146 var7 = this.field872.method1807(-100); var7 != null; var7 = this.field872.method1808((byte) 127)) {
                    int var9 = (int) var7.field2406;
                    if (this.field866[var9] == 0) {
                        this.method411(var9, 1, (byte) -40);
                    }
                    if (this.field866[var9] == 0) {
                        var6 = false;
                    } else {
                        var7.method1074((byte) 48);
                    }
                }
                while (this.field860.field2185.length > this.field871) {
                    if (this.field860.field2185[this.field871] == 0) {
                        this.field871++;
                    } else {
                        if (this.field855.field1958 >= 250) {
                            var6 = false;
                            break;
                        }
                        if (this.field866[this.field871] == 0) {
                            this.method411(this.field871, 1, (byte) -40);
                        }
                        if (this.field866[this.field871] == 0) {
                            var6 = false;
                            class146 var8 = new class146();
                            var8.field2406 = (long) this.field871;
                            this.field872.method1809(5, var8);
                        }
                        this.field871++;
                    }
                }
                if (var6) {
                    this.field875 = false;
                    this.field871 = 0;
                }
            } else if (this.field873) {
                boolean var2 = true;
                for (class146 var3 = this.field872.method1807(-110); var3 != null; var3 = this.field872.method1808((byte) 40)) {
                    int var5 = (int) var3.field2406;
                    if (this.field866[var5] != 1) {
                        this.method411(var5, 2, (byte) -40);
                    }
                    if (this.field866[var5] == 1) {
                        var3.method1074((byte) 81);
                    } else {
                        var2 = false;
                    }
                }
                while (this.field860.field2185.length > this.field871) {
                    if (this.field860.field2185[this.field871] == 0) {
                        this.field871++;
                    } else {
                        if (this.field842.method1144((byte) 101)) {
                            var2 = false;
                            break;
                        }
                        if (this.field866[this.field871] != 1) {
                            this.method411(this.field871, 2, (byte) -40);
                        }
                        if (this.field866[this.field871] != 1) {
                            var2 = false;
                            class146 var4 = new class146();
                            var4.field2406 = (long) this.field871;
                            this.field872.method1809(5, var4);
                        }
                        this.field871++;
                    }
                }
                if (var2) {
                    this.field871 = 0;
                    this.field873 = false;
                }
            } else {
                this.field872 = null;
            }
        }
        if (this.field877 && this.field876 <= class62.method472(117)) {
            for (class238 var10 = (class238) this.field854.method1062(-117); var10 != null; var10 = (class238) this.field854.method1059(-14608)) {
                if (!var10.field3756) {
                    if (var10.field3754) {
                        if (!var10.field3753) {
                            throw new RuntimeException();
                        }
                        var10.method1074((byte) -124);
                    } else {
                        var10.field3754 = true;
                    }
                }
            }
            this.field876 = class62.method472(49) + 1000L;
        }
        if (arg0 <= 88) {
            method410(58);
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(ZIIZ)V")
    public static final void method408(boolean arg0, int arg1, int arg2, boolean arg3) {
        field858++;
        int var10002;
        for (int var4 = 0; var4 < class7.field88; var4++) {
            class139 var21 = class3.field45[class287.field4587[var4]];
            if (var21 != null && var21.method1041((byte) -123) && var21.field2321.method1199((byte) 93)) {
                int var22 = var21.method1226((byte) -122);
                if (arg0) {
                    if (!var21.field2321.field2695) {
                        continue;
                    }
                } else if (var21.field2321.field2728 != arg3 || arg1 != 0 && arg1 != var22) {
                    continue;
                }
                if (var22 == 1) {
                    if ((var21.field2849 & 0x7F) == 64 && (var21.field2887 & 0x7F) == 64) {
                        int var23 = var21.field2887 >> 7;
                        int var24 = var21.field2849 >> 7;
                        if (var24 >= 0 && var24 < 104 && var23 >= 0 && var23 < 104) {
                            var10002 = class258.field4112[var24][var23]++;
                        }
                    }
                } else if (((var22 & 0x1) != 0 || (var21.field2849 & 0x7F) == 0 && (var21.field2887 & 0x7F) == 0) && ((var22 & 0x1) != 1 || (var21.field2849 & 0x7F) == 64 && (var21.field2887 & 0x7F) == 64)) {
                    int var25 = var21.field2849 - var22 * 64 >> 7;
                    int var26 = var21.field2887 - (var22 * 64) >> 7;
                    int var27 = var25 + var21.method1226((byte) -127);
                    if (var25 < 0) {
                        var25 = 0;
                    }
                    int var28 = var26 + var21.method1226((byte) -87);
                    if (var28 > 104) {
                        var28 = 104;
                    }
                    if (var26 < 0) {
                        var26 = 0;
                    }
                    if (var27 > 104) {
                        var27 = 104;
                    }
                    for (int var29 = var25; var29 < var27; var29++) {
                        for (int var30 = var26; var30 < var28; var30++) {
                            var10002 = class258.field4112[var29][var30]++;
                        }
                    }
                }
            }
        }
        if (arg2 != -22469) {
            return;
        }
        label210: for (int var5 = 0; var5 < class7.field88; var5++) {
            class139 var6 = class3.field45[class287.field4587[var5]];
            long var7 = (long) class287.field4587[var5] << 32 | 0x20000000L;
            if (var6 != null && var6.method1041((byte) -106) && var6.field2321.method1199((byte) 99)) {
                int var9 = var6.method1226((byte) -126);
                if (arg0) {
                    if (!var6.field2321.field2695) {
                        continue;
                    }
                } else if (arg3 != var6.field2321.field2728 || arg1 != 0 && arg1 != var9) {
                    continue;
                }
                var6.field2824 = true;
                if (var9 == 1) {
                    if ((var6.field2849 & 0x7F) == 64 && (var6.field2887 & 0x7F) == 64) {
                        int var10 = var6.field2887 >> 7;
                        int var11 = var6.field2849 >> 7;
                        if (var11 < 0 || var11 >= 104 || var10 < 0 || var10 >= 104) {
                            continue;
                        }
                        if (class258.field4112[var11][var10] > 1) {
                            var10002 = class258.field4112[var11][var10]--;
                            continue;
                        }
                    }
                } else if ((var9 & 0x1) == 0 && (var6.field2849 & 0x7F) == 0 && (var6.field2887 & 0x7F) == 0 || (var9 & 0x1) == 1 && (var6.field2849 & 0x7F) == 64 && (var6.field2887 & 0x7F) == 64) {
                    int var12 = var6.field2849 - (var9 * 64) >> 7;
                    int var13 = var6.field2887 - (var9 * 64) >> 7;
                    int var14 = var9 + var13;
                    int var15 = var9 + var12;
                    if (var13 < 0) {
                        var13 = 0;
                    }
                    if (var15 > 104) {
                        var15 = 104;
                    }
                    if (var14 > 104) {
                        var14 = 104;
                    }
                    boolean var16 = true;
                    if (var12 < 0) {
                        var12 = 0;
                    }
                    for (int var17 = var12; var17 < var15; var17++) {
                        for (int var20 = var13; var20 < var14; var20++) {
                            if (class258.field4112[var17][var20] <= 1) {
                                var16 = false;
                                break;
                            }
                        }
                    }
                    if (var16) {
                        int var18 = var12;
                        while (true) {
                            if (var15 <= var18) {
                                continue label210;
                            }
                            for (int var19 = var13; var19 < var14; var19++) {
                                var10002 = class258.field4112[var18][var19]--;
                            }
                            var18++;
                        }
                    }
                }
                var6.field2824 = false;
                if (!var6.field2321.field2737) {
                    var7 |= Long.MIN_VALUE;
                }
                var6.field2851 = class218.method1450(var6.field2887, var6.field2849, true, class92.field1448);
                class130.method942(class92.field1448, var6.field2849, var6.field2887, var6.field2851, var9 * 64 + 60 - 64, var6, var6.field2831, var7, var6.field2837);
            }
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(II)[B")
    public final byte[] method409(int arg0, int arg1) {
        int var3 = -77 / ((-arg0 - 36) / 50);
        field848++;
        class238 var4 = this.method411(arg1, 0, (byte) -40);
        if (var4 == null) {
            return null;
        } else {
            byte[] var5 = var4.method733(true);
            var4.method1074((byte) 91);
            return var5;
        }
    }

    @OriginalMember(owner = "client!ie", name = "f", descriptor = "(I)J")
    public static final long method410(int arg0) {
        field847++;
        if (arg0 != 1) {
            method400(73, -4, false, 16, 28, -109);
        }
        return class100.field1533.method920(-2657);
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(IIB)Lr;")
    private final class238 method411(int arg0, int arg1, byte arg2) {
        field861++;
        class238 var4 = (class238) this.field854.method1063((byte) -45, (long) arg0);
        if (var4 != null && arg1 == 0 && !var4.field3753 && var4.field3756) {
            var4.method1074((byte) -120);
            var4 = null;
        }
        if (var4 == null) {
            if (arg1 == 0) {
                if (this.field867 == null || this.field866[arg0] == -1) {
                    if (this.field842.method1142(true)) {
                        return null;
                    }
                    var4 = this.field842.method1151((byte) 116, this.field850, true, arg0, (byte) 2);
                } else {
                    var4 = this.field855.method855((byte) -43, this.field867, arg0);
                }
            } else if (arg1 == 1) {
                if (this.field867 == null) {
                    throw new RuntimeException();
                }
                var4 = this.field855.method860(arg0, arg2 ^ 0xFFFFFFDB, this.field867);
            } else if (arg1 == 2) {
                if (this.field867 == null) {
                    throw new RuntimeException();
                }
                if (this.field866[arg0] != -1) {
                    throw new RuntimeException();
                }
                if (this.field842.method1144((byte) 101)) {
                    return null;
                }
                var4 = this.field842.method1151((byte) 104, this.field850, false, arg0, (byte) 2);
            } else {
                throw new RuntimeException();
            }
            this.field854.method1064(var4, (long) arg0, (byte) -126);
        }
        if (var4.field3756) {
            return null;
        }
        if (arg2 != -40) {
            this.field845 = 12;
        }
        byte[] var5 = var4.method733(true);
        if (!var4 instanceof class96) {
            try {
                if (var5 == null || var5.length <= 2) {
                    throw new RuntimeException();
                }
                class104.field1587.reset();
                class104.field1587.update(var5, 0, var5.length - 2);
                int var6 = (int) class104.field1587.getValue();
                if (this.field860.field2172[arg0] != var6) {
                    throw new RuntimeException();
                }
                this.field842.field2594 = 0;
                this.field842.field2592 = 0;
            } catch (RuntimeException var12) {
                this.field842.method1143((byte) 120);
                var4.method1074((byte) 39);
                if (var4.field3753 && !this.field842.method1142(true)) {
                    class274 var7 = this.field842.method1151((byte) -66, this.field850, true, arg0, (byte) 2);
                    this.field854.method1064(var7, (long) arg0, (byte) -128);
                }
                return null;
            }
            var5[var5.length - 2] = (byte) (this.field860.field2166[arg0] >>> 8);
            var5[var5.length - 1] = (byte) this.field860.field2166[arg0];
            if (this.field867 != null) {
                this.field855.method862(this.field867, arg0, arg2 - 64, var5);
                if (this.field866[arg0] != 1) {
                    this.field862++;
                    this.field866[arg0] = 1;
                }
            }
            if (!var4.field3753) {
                var4.method1074((byte) -119);
            }
            return var4;
        }
        try {
            if (var5 == null || var5.length <= 2) {
                throw new RuntimeException();
            }
            class104.field1587.reset();
            class104.field1587.update(var5, 0, var5.length - 2);
            int var8 = (int) class104.field1587.getValue();
            if (this.field860.field2172[arg0] != var8) {
                throw new RuntimeException();
            }
            int var9 = ((var5[var5.length - 2] & 0xFF) << 8) + (var5[var5.length - 1] & 0xFF);
            if ((this.field860.field2166[arg0] & 0xFFFF) != var9) {
                throw new RuntimeException();
            }
            if (this.field866[arg0] != 1) {
                this.field862++;
                this.field866[arg0] = 1;
            }
            if (!var4.field3753) {
                var4.method1074((byte) -126);
            }
            return var4;
        } catch (Exception var11) {
            this.field866[arg0] = -1;
            var4.method1074((byte) -3);
            if (var4.field3753 && !this.field842.method1142(true)) {
                class274 var10 = this.field842.method1151((byte) 88, this.field850, true, arg0, (byte) 2);
                this.field854.method1064(var10, (long) arg0, (byte) -122);
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(IB)V")
    public final void method412(int arg0, byte arg1) {
        field851++;
        if (this.field867 == null) {
            return;
        }
        class146 var3 = this.field874.method1807(-104);
        if (arg1 != -94) {
            this.method407((byte) 46);
        }
        while (var3 != null) {
            if (((long) arg0) == var3.field2406) {
                return;
            }
            var3 = this.field874.method1808((byte) 98);
        }
        class146 var4 = new class146();
        var4.field2406 = (long) arg0;
        this.field874.method1809(5, var4);
    }

    @OriginalMember(owner = "client!ie", name = "<init>", descriptor = "(ILek;Lek;Lhk;Lra;IIZ)V")
    public class47(int arg0, class239 arg1, class239 arg2, class159 arg3, class116 arg4, int arg5, int arg6, boolean arg7) {
        this.field850 = arg0;
        this.field867 = arg1;
        if (this.field867 == null) {
            this.field875 = false;
        } else {
            this.field875 = true;
            this.field872 = new class266();
        }
        this.field865 = arg6;
        this.field845 = arg5;
        this.field842 = arg3;
        this.field856 = arg2;
        this.field877 = arg7;
        this.field855 = arg4;
        if (this.field856 != null) {
            this.field853 = this.field855.method855((byte) -105, this.field856, this.field850);
        }
    }
}
