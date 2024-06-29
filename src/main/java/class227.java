import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!s")
public class class227 {

    @OriginalMember(owner = "client!s", name = "e", descriptor = "Ldh;")
    private class9 field4055 = new class9();

    @OriginalMember(owner = "client!s", name = "s", descriptor = "I")
    private int field4069;

    @OriginalMember(owner = "client!s", name = "t", descriptor = "I")
    private int field4070;

    @OriginalMember(owner = "client!s", name = "h", descriptor = "Ldf;")
    private class231 field4058;

    @OriginalMember(owner = "client!s", name = "m", descriptor = "I")
    public static int field4063 = 0;

    @OriginalMember(owner = "client!s", name = "n", descriptor = "Lqj;")
    public static class196 field4064 = class80.method502("Ihre Ignorieren)2Liste ist voll)1 Sie k-Onnen nur 100 Spieler darauf eintragen)3", -48);

    @OriginalMember(owner = "client!s", name = "c", descriptor = "[Lqj;")
    public static class196[] field4053 = new class196[100];

    @OriginalMember(owner = "client!s", name = "j", descriptor = "Lqj;")
    private static class196 field4060 = class80.method502("flash2:", -48);

    @OriginalMember(owner = "client!s", name = "l", descriptor = "Lqj;")
    public static class196 field4062 = field4060;

    @OriginalMember(owner = "client!s", name = "i", descriptor = "Lqj;")
    public static class196 field4059 = class80.method502("Clientscript error )2 check log for details", -48);

    @OriginalMember(owner = "client!s", name = "p", descriptor = "Lqj;")
    public static class196 field4066 = field4060;

    @OriginalMember(owner = "client!s", name = "b", descriptor = "I")
    public static int field4052 = 0;

    @OriginalMember(owner = "client!s", name = "a", descriptor = "I")
    public static int field4051;

    @OriginalMember(owner = "client!s", name = "d", descriptor = "I")
    public static int field4054;

    @OriginalMember(owner = "client!s", name = "f", descriptor = "I")
    public static int field4056;

    @OriginalMember(owner = "client!s", name = "g", descriptor = "I")
    public static int field4057;

    @OriginalMember(owner = "client!s", name = "k", descriptor = "I")
    public static int field4061;

    @OriginalMember(owner = "client!s", name = "o", descriptor = "I")
    public static int field4065;

    @OriginalMember(owner = "client!s", name = "q", descriptor = "I")
    public static int field4067;

    @OriginalMember(owner = "client!s", name = "r", descriptor = "I")
    public static int field4068;

    @OriginalMember(owner = "client!s", name = "u", descriptor = "I")
    public static int field4071;

    @OriginalMember(owner = "client!s", name = "v", descriptor = "I")
    public static int field4072;

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(I)V")
    public final void method1529(int arg0) {
        field4071++;
        if (arg0 != 382) {
            field4059 = null;
        }
        this.field4055.method36((byte) 5);
        this.field4058.method1545(arg0 - 382);
        this.field4069 = this.field4070;
    }

    @OriginalMember(owner = "client!s", name = "b", descriptor = "(I)V")
    public static final void method1530(int arg0) {
        if (arg0 == 25) {
            field4061++;
            class193.field3386.method1529(382);
            class253.field4474.method135(arg0 - 131);
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(ZIILec;I)V")
    public static final void method1531(boolean arg0, int arg1, int arg2, class178 arg3, int arg4) {
        field4057++;
        class181.method1187((byte) 113);
        class55.method296(arg4, arg2, arg4 + arg3.field3085, arg3.field2997 + arg2);
        if (class156.field2510 == 2 || class156.field2510 == 5 || class149.field2376 == null) {
            class55.method298(arg4, arg2, 0, arg3.field3007, arg3.field3060);
        } else {
            int var5 = class249.field4408 + class18.field216 & 0x7FF;
            int var6 = class102.field1477.field2081 / 32 + 48;
            int var7 = 464 - class102.field1477.field2085 / 32;
            ((class233) class149.field2376).method1408(arg4, arg2, arg3.field3085, arg3.field2997, var6, var7, var5, class90.field1325 + 256, arg3.field3007, arg3.field3060);
            for (int var8 = 0; var8 < class251.field4439; var8++) {
                int var41 = class154.field2492[var8] * 4 + 2 - class102.field1477.field2081 / 32;
                int var42 = class56.field697[var8] * 4 + 2 - class102.field1477.field2085 / 32;
                class145 var43 = class83.method521(class71.field1011[var8], (byte) 53);
                if (var43.field2232 != null) {
                    var43 = var43.method899(98);
                    if (var43 == null || var43.field2241 == -1) {
                        continue;
                    }
                }
                class230.method1544(class251.field4441[var43.field2241], arg3, arg4, 1932722700, var42, var41, arg2);
            }
            for (int var9 = 0; var9 < 104; var9++) {
                for (int var37 = 0; var37 < 104; var37++) {
                    class243 var38 = class178.field3040[class27.field335][var9][var37];
                    if (var38 != null) {
                        int var39 = var37 * 4 + 2 - class102.field1477.field2085 / 32;
                        int var40 = var9 * 4 + 2 - class102.field1477.field2081 / 32;
                        class230.method1544(class238.field4237[0], arg3, arg4, 1932722700, var39, var40, arg2);
                    }
                }
            }
            for (int var10 = 0; var10 < class63.field863; var10++) {
                class164 var33 = class153.field2482[class188.field3295[var10]];
                if (var33 != null && var33.method811(120)) {
                    class111 var34 = var33.field2648;
                    if (var34 != null && var34.field1591 != null) {
                        var34 = var34.method659(121);
                    }
                    if (var34 != null && var34.field1610 && var34.field1639) {
                        int var35 = var33.field2081 / 32 - class102.field1477.field2081 / 32;
                        int var36 = var33.field2085 / 32 - class102.field1477.field2085 / 32;
                        class230.method1544(class238.field4237[1], arg3, arg4, 1932722700, var36, var35, arg2);
                    }
                }
            }
            for (int var11 = 0; var11 < class252.field4451; var11++) {
                class134 var25 = class247.field4397[class14.field153[var11]];
                if (var25 != null && var25.method811(-64)) {
                    int var26 = var25.field2085 / 32 - class102.field1477.field2085 / 32;
                    int var27 = var25.field2081 / 32 - class102.field1477.field2081 / 32;
                    long var28 = var25.field1924.method1330(0);
                    boolean var30 = false;
                    for (int var31 = 0; var31 < class156.field2514; var31++) {
                        if (class91.field1333[var31] == var28 && class52.field654[var31] != 0) {
                            var30 = true;
                            break;
                        }
                    }
                    boolean var32 = false;
                    if (class102.field1477.field1917 != 0 && var25.field1917 != 0 && class102.field1477.field1917 == var25.field1917) {
                        var32 = true;
                    }
                    if (var30) {
                        class230.method1544(class238.field4237[3], arg3, arg4, 1932722700, var26, var27, arg2);
                    } else if (var32) {
                        class230.method1544(class238.field4237[4], arg3, arg4, 1932722700, var26, var27, arg2);
                    } else {
                        class230.method1544(class238.field4237[2], arg3, arg4, 1932722700, var26, var27, arg2);
                    }
                }
            }
            class70[] var12 = class214.field3834;
            for (int var13 = 0; var13 < var12.length; var13++) {
                class70 var16 = var12[var13];
                if (var16 != null && var16.field983 != 0 && class171.field2879 % 20 < 10) {
                    if (var16.field983 == 1 && var16.field994 >= 0 && class153.field2482.length > var16.field994) {
                        class164 var17 = class153.field2482[var16.field994];
                        if (var17 != null) {
                            int var18 = var17.field2081 / 32 - class102.field1477.field2081 / 32;
                            int var19 = var17.field2085 / 32 - class102.field1477.field2085 / 32;
                            class131.method798((byte) -15, var16.field993, var19, arg3, arg2, var18, arg4);
                        }
                    }
                    if (var16.field983 == 2) {
                        int var20 = (var16.field987 - class106.field1523) * 4 + 2 - class102.field1477.field2081 / 32;
                        int var21 = (var16.field982 - class178.field3011) * 4 + 2 - class102.field1477.field2085 / 32;
                        class131.method798((byte) -15, var16.field993, var21, arg3, arg2, var20, arg4);
                    }
                    if (var16.field983 == 10 && var16.field994 >= 0 && class247.field4397.length > var16.field994) {
                        class134 var22 = class247.field4397[var16.field994];
                        if (var22 != null) {
                            int var23 = var22.field2081 / 32 - class102.field1477.field2081 / 32;
                            int var24 = var22.field2085 / 32 - class102.field1477.field2085 / 32;
                            class131.method798((byte) -15, var16.field993, var24, arg3, arg2, var23, arg4);
                        }
                    }
                }
            }
            if (class12.field133 != 0) {
                int var14 = class80.field1151 * 4 + 2 - class102.field1477.field2085 / 32;
                int var15 = class12.field133 * 4 + 2 - class102.field1477.field2081 / 32;
                class230.method1544(class138.field2119, arg3, arg4, 1932722700, var14, var15, arg2);
            }
            class55.method295(arg4 + arg3.field3085 / 2 - 1, arg3.field2997 / 2 + -1 + arg2, 3, 3, 16777215);
        }
        class86.field1271[arg1] = arg0;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(ZJLmb;)V")
    public final void method1532(boolean arg0, long arg1, class147 arg2) {
        if (!arg0) {
            this.field4069 = -73;
        }
        if (this.field4069 == 0) {
            class147 var5 = this.field4055.method43(-24852);
            var5.method797((byte) 103);
            var5.method920(-2);
        } else {
            this.field4069--;
        }
        field4054++;
        this.field4058.method1552(arg2, arg1, 0);
        this.field4055.method33(arg2, (byte) -122);
        arg2.field2327 = 0L;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(JI)V")
    public final void method1533(long arg0, int arg1) {
        field4065++;
        class147 var4 = (class147) this.field4058.method1551(arg1 + 7868, arg0);
        if (arg1 == 24900 && var4 != null) {
            var4.method797((byte) 117);
            var4.method920(-2);
            this.field4069++;
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(Lbk;B)V")
    public static final void method1534(class136 arg0, byte arg1) {
        field4056++;
        if (class168.field2815) {
            return;
        }
        if (arg1 != -105) {
            field4052 = -68;
        }
        class55.method290();
        class147.field2329 = class132.method802(class168.field2818, arg0, (byte) 97);
        class147.field2329.method226(-95, 0);
        class163.field2638 = class44.method234(arg0, class151.field2427, 0);
        class163.field2638.method442(382 - class163.field2638.field3814 / 2, 18);
        class168.field2815 = true;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(II)V")
    public final void method1535(int arg0, int arg1) {
        if (arg1 != 30704) {
            return;
        }
        for (class147 var3 = this.field4055.method40(arg1 ^ 0x778F); var3 != null; var3 = this.field4055.method39((byte) -28)) {
            var3.field2327++;
            if ((long) arg0 < var3.field2327) {
                var3.method797((byte) 123);
                var3.method920(-2);
                this.field4069++;
            }
        }
        field4051++;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(B)V")
    public static void method1536(byte arg0) {
        if (arg0 < 93) {
            method1530(-102);
        }
        field4066 = null;
        field4064 = null;
        field4053 = null;
        field4060 = null;
        field4062 = null;
        field4059 = null;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(JZ)Lmb;")
    public final class147 method1537(long arg0, boolean arg1) {
        field4067++;
        if (arg1) {
            field4059 = null;
        }
        class147 var4 = (class147) this.field4058.method1551(32768, arg0);
        if (var4 != null) {
            this.field4055.method33(var4, (byte) -94);
            var4.field2327 = 0L;
        }
        return var4;
    }

    @OriginalMember(owner = "client!s", name = "c", descriptor = "(I)V")
    public static final void method1538(int arg0) {
        if (arg0 != 0) {
            field4059 = null;
        }
        field4072++;
        if (class56.field741 == 30) {
            class180.method1182((byte) -101, 25);
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(I[B)[B")
    public static final byte[] method1539(int arg0, byte[] arg1) {
        field4068++;
        class56 var2 = new class56(arg1);
        int var3 = var2.method367(1);
        int var4 = var2.method311(arg0 ^ arg0);
        if (var4 < 0 || class236.field4191 != 0 && class236.field4191 < var4) {
            throw new RuntimeException();
        } else if (var3 == 0) {
            byte[] var7 = new byte[var4];
            var2.method316(var4, var7, (byte) -87, 0);
            return var7;
        } else {
            int var5 = var2.method311(0);
            if (var5 < 0 || class236.field4191 != 0 && var5 > class236.field4191) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var3 == 1) {
                class141.method873(var6, var5, arg1, var4, 9);
            } else {
                class177.field2983.method1714((byte) -120, var6, var2);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!s", name = "<init>", descriptor = "(I)V")
    public class227(int arg0) {
        int var2 = 1;
        this.field4069 = arg0;
        while (var2 + var2 < arg0) {
            var2 += var2;
        }
        this.field4070 = arg0;
        this.field4058 = new class231(var2);
    }
}
