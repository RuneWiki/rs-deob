import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gg")
public class class716 extends class6 {

    @OriginalMember(owner = "client!gg", name = "Q", descriptor = "I")
    private int field10194 = 0;

    @OriginalMember(owner = "client!gg", name = "O", descriptor = "I")
    public int field10199 = 0;

    @OriginalMember(owner = "client!gg", name = "W", descriptor = "I")
    public int field10201 = -1;

    @OriginalMember(owner = "client!gg", name = "U", descriptor = "Z")
    private boolean field10206 = false;

    @OriginalMember(owner = "client!gg", name = "Y", descriptor = "I")
    public int field10207 = -1;

    @OriginalMember(owner = "client!gg", name = "K", descriptor = "[Ljava/lang/String;")
    private static final String[] field10208 = new String[] { method5198(method5197("+74W$d")), method5198(method5197("+74R$d")), method5198(method5197("7~4:\u0018")), method5198(method5197("+74WM")), method5198(method5197("\"%vx")), method5198(method5197("+74CM")), method5198(method5197("+74UM")), method5198(method5197("+74BM")), method5198(method5197("+74U$d")), method5198(method5197("+74Q$d")), method5198(method5197("vp")), method5198(method5197("+74P$d")), method5198(method5197("+74DM")), method5198(method5197("+74V$d")), method5198(method5197("+74@M")) };

    @OriginalMember(owner = "client!gg", name = "db", descriptor = "I")
    public int field10186;

    @OriginalMember(owner = "client!gg", name = "X", descriptor = "I")
    public int field10187;

    @OriginalMember(owner = "client!gg", name = "S", descriptor = "I")
    public static int field10188;

    @OriginalMember(owner = "client!gg", name = "fb", descriptor = "I")
    public static int field10189;

    @OriginalMember(owner = "client!gg", name = "cb", descriptor = "I")
    public static int field10190;

    @OriginalMember(owner = "client!gg", name = "gb", descriptor = "I")
    public static int field10191;

    @OriginalMember(owner = "client!gg", name = "P", descriptor = "I")
    public static int field10192;

    @OriginalMember(owner = "client!gg", name = "eb", descriptor = "I")
    public static int field10193;

    @OriginalMember(owner = "client!gg", name = "M", descriptor = "I")
    public int field10195;

    @OriginalMember(owner = "client!gg", name = "R", descriptor = "I")
    public static int field10196;

    @OriginalMember(owner = "client!gg", name = "bb", descriptor = "I")
    public static int field10197;

    @OriginalMember(owner = "client!gg", name = "T", descriptor = "I")
    public static int field10198;

    @OriginalMember(owner = "client!gg", name = "Z", descriptor = "I")
    public static int field10202;

    @OriginalMember(owner = "client!gg", name = "V", descriptor = "I")
    public static int field10203;

    @OriginalMember(owner = "client!gg", name = "N", descriptor = "I")
    public int field10204;

    @OriginalMember(owner = "client!gg", name = "L", descriptor = "Ltb;")
    public static class392 field10200;

    @OriginalMember(owner = "client!gg", name = "ab", descriptor = "Llga;")
    public static class47 field10205;

    @OriginalMember(owner = "client!gg", name = "c", descriptor = "(B)I")
    public final int method578(byte arg0) {
        try {
            ++field10190;
            return arg0 != 114 ? 13 : this.field10194;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field10208[11] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(Lha;B)Lsba;")
    public final class311 method587(class18 arg0, byte arg1) {
        try {
            ++field10197;
            if (arg1 < 94) {
                this.method578((byte) 60);
            }
            return null;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field10208[12] + (arg0 != null ? field10208[2] : field10208[4]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!gg", name = "c", descriptor = "(Z)I")
    public final int method575(boolean arg0) {
        try {
            if (arg0) {
                return 14;
            } else {
                ++field10192;
                return -10;
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field10208[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "(ZLha;)Lrs;")
    public final class297 method573(boolean arg0, class18 arg1) {
        try {
            ++field10198;
            class219 var3 = class732.method5328(super.field2981, super.field2969 >> class179.field2328, super.field2984 >> class179.field2328);
            class122 var4 = class254.method2130(super.field2981, super.field2969 >> class179.field2328, super.field2984 >> class179.field2328);
            int var5 = 0;
            if (var3 != null && var3.field3188.field8667) {
                var5 = var3.field3188.method575(false);
            }
            if (var4 != null && var4.field1543 > -var5) {
                var5 = -var4.field1543;
            }
            if (this.field10199 != var5) {
                super.field2975 -= this.field10199;
                super.field2975 += var5;
                this.field10199 = var5;
            }
            class104 var6 = arg1.method136();
            var6.method735();
            if (~this.field10199 == -1) {
                boolean var7 = false;
                boolean var8 = false;
                boolean var9 = false;
                class751 var10 = class107.field1413[super.field2971];
                int var11 = this.field10194 << 1;
                int var13 = -var11 / 2;
                int var14 = -var11 / 2;
                int var15 = var10.method5440((byte) 15, super.field2969 + var13, super.field2984 - -var14);
                int var16 = var11 / 2;
                int var17 = -var11 / 2;
                int var18 = var10.method5440((byte) 15, super.field2969 + var16, super.field2984 + var17);
                int var19 = -var11 / 2;
                int var20 = var11 / 2;
                int var21 = var10.method5440((byte) 15, super.field2969 + var19, super.field2984 - -var20);
                int var22 = var11 / 2;
                int var23 = var11 / 2;
                int var24 = var10.method5440((byte) 15, super.field2969 + var22, super.field2984 - -var23);
                int var25 = var15 < var18 ? var15 : var18;
                int var26 = var24 <= var21 ? var24 : var21;
                int var27 = var18 >= var24 ? var24 : var18;
                int var28 = var21 <= var15 ? var21 : var15;
                if (~var11 != -1) {
                    int var29 = (int) (Math.atan2((double) (var25 - var26), (double) var11) * 2607.5945876176133D) & 16383;
                    if (~var29 != -1) {
                        var6.method741(var29);
                    }
                }
                if (~var11 != -1) {
                    int var30 = (int) (2607.5945876176133D * Math.atan2((double) (var28 - var27), (double) var11)) & 16383;
                    if (var30 != 0) {
                        var6.method724(-var30);
                    }
                }
                int var31 = var15 + var24;
                if (~var31 < ~(var18 + var21)) {
                    var31 = var18 + var21;
                }
                int var32 = (var31 >> 1) + -super.field2975;
                if (var32 != 0) {
                    var6.method721(0, var32, 0);
                }
            }
            var6.method721(super.field2969, super.field2975 - 10, super.field2984);
            class297 var33 = class674.method4839(true, 3, 12853);
            this.field10206 = arg0;
            this.field10194 = 0;
            if (this.field10201 != -1) {
                class761 var34 = class153.field1955.method3237(this.field10201, 0).method2944(2048, this.field10186, -26629, (class471) null, arg1, (class84) null);
                if (var34 != null) {
                    if (class149.field1902) {
                        var34.method427(var6, var33.field4153[2], class194.field2686, 0);
                    } else {
                        var34.method415(var6, var33.field4153[2], 0);
                    }
                    this.field10206 |= var34.method422();
                    this.field10194 = var34.method423();
                }
            }
            if (~this.field10207 != 0) {
                class761 var35 = class153.field1955.method3237(this.field10207, 0).method2944(2048, this.field10204, -26629, (class471) null, arg1, (class84) null);
                if (var35 != null) {
                    if (!class149.field1902) {
                        var35.method415(var6, var33.field4153[1], 0);
                    } else {
                        var35.method427(var6, var33.field4153[1], class194.field2686, 0);
                    }
                    this.field10206 |= var35.method422();
                    if (var35.method423() > this.field10194) {
                        this.field10194 = var35.method423();
                    }
                }
            }
            class761 var36 = class153.field1955.method3237(this.field10187, 0).method2944(2048, this.field10195, -26629, (class471) null, arg1, (class84) null);
            if (var36 != null) {
                if (class149.field1902) {
                    var36.method427(var6, var33.field4153[0], class194.field2686, 0);
                } else {
                    var36.method415(var6, var33.field4153[0], 0);
                }
                this.field10206 |= var36.method422();
                if (~var36.method423() < ~this.field10194) {
                    this.field10194 = var36.method423();
                }
            }
            return var33;
        } catch (RuntimeException var38) {
            throw class665.method4799(var38, field10208[3] + arg0 + ',' + (arg1 != null ? field10208[2] : field10208[4]) + ')');
        }
    }

    @OriginalMember(owner = "client!gg", name = "d", descriptor = "(Z)Z")
    public final boolean method579(boolean arg0) {
        try {
            if (arg0) {
                field10200 = null;
            }
            ++field10196;
            return this.field10206;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field10208[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(Lha;I)V")
    public final void method586(class18 arg0, int arg1) {
        try {
            if (arg1 == 0) {
                ++field10193;
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field10208[14] + (arg0 != null ? field10208[2] : field10208[4]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!gg", name = "e", descriptor = "(Z)Z")
    public final boolean method582(boolean arg0) {
        try {
            if (arg0) {
                this.field10194 = -45;
            }
            ++field10188;
            return false;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field10208[13] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(Lha;III)Z")
    public final boolean method580(class18 arg0, int arg1, int arg2, int arg3) {
        try {
            ++field10203;
            class104 var5 = arg0.method136();
            var5.method739(super.field2969, super.field2975 - 10, super.field2984);
            class371 var6 = class153.field1955.method3237(this.field10187, arg2 + 1);
            class761 var7 = var6.method2944(131072, this.field10195, -26629, (class471) null, arg0, (class84) null);
            if (var7 != null && (!class149.field1902 ? var7.method382(arg3, arg1, var5, true, var6.field5393) : var7.method440(arg3, arg1, var5, true, var6.field5393, class194.field2686))) {
                return true;
            } else {
                if (this.field10207 != arg2) {
                    class371 var8 = class153.field1955.method3237(this.field10207, 0);
                    class761 var9 = var8.method2944(131072, this.field10204, arg2 ^ 26628, (class471) null, arg0, (class84) null);
                    if (var9 != null && (!class149.field1902 ? var9.method382(arg3, arg1, var5, true, var8.field5393) : var9.method440(arg3, arg1, var5, true, var8.field5393, class194.field2686))) {
                        return true;
                    }
                }
                if (this.field10201 != -1) {
                    class371 var10 = class153.field1955.method3237(this.field10201, ~arg2);
                    class761 var11 = var10.method2944(131072, this.field10186, -26629, (class471) null, arg0, (class84) null);
                    if (var11 != null && (class149.field1902 ? var11.method440(arg3, arg1, var5, true, var10.field5393, class194.field2686) : var11.method382(arg3, arg1, var5, true, var10.field5393))) {
                        return true;
                    }
                }
                return false;
            }
        } catch (RuntimeException var13) {
            throw class665.method4799(var13, field10208[6] + (arg0 != null ? field10208[2] : field10208[4]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!gg", name = "e", descriptor = "(B)V")
    public static void method5194(byte arg0) {
        try {
            field10200 = null;
            field10205 = null;
            if (arg0 != -84) {
                field10205 = null;
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field10208[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "([Ljava/lang/String;B)[Ljava/lang/String;")
    public static final String[] method5195(String[] arg0, byte arg1) {
        try {
            ++field10202;
            String[] var2 = new String[5];
            int var3 = 0;
            if (arg1 != -123) {
                return null;
            } else {
                while (var3 < 5) {
                    var2[var3] = var3 + field10208[10];
                    if (arg0 != null && arg0[var3] != null) {
                        var2[var3] = var2[var3] + arg0[var3];
                    }
                    ++var3;
                }
                return var2;
            }
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field10208[9] + (arg0 != null ? field10208[2] : field10208[4]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(I)V")
    public static final void method5196(int arg0) {
        try {
            ++field10191;
            class224 var1 = (class224) class486.field7127.method3977((byte) -49);
            if (arg0 != -18948) {
                field10200 = null;
            }
            while (var1 != null) {
                class280.method2280(true, false, var1);
                var1 = (class224) class486.field7127.method3987(0);
            }
            for (class224 var2 = (class224) class631.field8964.method3977((byte) -73); var2 != null; var2 = (class224) class631.field8964.method3987(arg0 + 18948)) {
                class280.method2280(true, true, var2);
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field10208[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gg", name = "f", descriptor = "(I)I")
    public final int method1734(int arg0) {
        try {
            ++field10189;
            class371 var2 = class153.field1955.method3237(this.field10187, 0);
            int var3 = var2.field5393;
            if (arg0 != 13720) {
                return -75;
            } else {
                if (this.field10207 != -1) {
                    class371 var4 = class153.field1955.method3237(this.field10207, arg0 + -13720);
                    if (var3 < var4.field5393) {
                        var3 = var4.field5393;
                    }
                }
                if (this.field10201 != -1) {
                    class371 var5 = class153.field1955.method3237(this.field10201, 0);
                    if (~var3 > ~var5.field5393) {
                        var3 = var5.field5393;
                    }
                }
                return var3;
            }
        } catch (RuntimeException var7) {
            throw class665.method4799(var7, field10208[8] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gg", name = "<init>", descriptor = "(IIIII)V")
    public class716(int arg0, int arg1, int arg2, int arg3, int arg4) {
        super(arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!gg", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5197(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 101);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!gg", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5198(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 76;
                    break;
                case 1:
                    var10005 = 80;
                    break;
                case 2:
                    var10005 = 26;
                    break;
                case 3:
                    var10005 = 20;
                    break;
                default:
                    var10005 = 101;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
