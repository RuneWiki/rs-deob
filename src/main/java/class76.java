import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ut")
public class class76 extends class96 {

    @OriginalMember(owner = "client!ut", name = "C", descriptor = "I")
    public static int field1074;

    @OriginalMember(owner = "client!ut", name = "D", descriptor = "I")
    public static int field1075;

    @OriginalMember(owner = "client!ut", name = "F", descriptor = "I")
    public static int field1076;

    @OriginalMember(owner = "client!ut", name = "H", descriptor = "I")
    public static int field1078;

    @OriginalMember(owner = "client!ut", name = "I", descriptor = "I")
    public static int field1079;

    @OriginalMember(owner = "client!ut", name = "J", descriptor = "I")
    public static int field1080;

    @OriginalMember(owner = "client!ut", name = "Q", descriptor = "I")
    public static int field1087;

    @OriginalMember(owner = "client!ut", name = "L", descriptor = "Ljava/lang/String;")
    public String field1082;

    @OriginalMember(owner = "client!ut", name = "O", descriptor = "[C")
    public char[] field1085;

    @OriginalMember(owner = "client!ut", name = "P", descriptor = "[C")
    public char[] field1086;

    @OriginalMember(owner = "client!ut", name = "B", descriptor = "[I")
    public static int[] field1073;

    @OriginalMember(owner = "client!ut", name = "G", descriptor = "[I")
    public int[] field1077;

    @OriginalMember(owner = "client!ut", name = "K", descriptor = "[I")
    public static int[] field1081;

    @OriginalMember(owner = "client!ut", name = "M", descriptor = "[I")
    public int[] field1083;

    @OriginalMember(owner = "client!ut", name = "N", descriptor = "[Lfi;")
    public static class373[] field1084;

    static {
        new class194("To go here you must login to a members' server.", "Du musst auf einer Mitglieder-Welt sein, um dort hinzukommen.", "Vous devez vous connecter à un serveur d'abonnés pour aller à cet endroit.", "Para entrar aqui, acesse um servidor para membros.");
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(ZC)I", line = 9)
    public final int method499(boolean arg0, char arg1) {
        field1087++;
        if (this.field1077 == null) {
            return -1;
        } else if (arg0) {
            return -110;
        } else {
            for (int var3 = 0; var3 < this.field1077.length; var3++) {
                if (this.field1086[var3] == arg1) {
                    return this.field1077[var3];
                }
            }
            return -1;
        }
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(IIIIIB)V", line = 35)
    public static final void method500(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5) {
        field1075++;
        int var6 = 0;
        int var7 = arg3;
        int var8 = arg4 * arg4;
        int var9 = arg3 * arg3;
        int var10 = var9 << 1;
        int var11 = var8 << 1;
        int var12 = arg3 << 1;
        int var13 = (1 - var12) * var8 + var10;
        int var14 = var9 - ((var12 - 1) * var11);
        int var15 = var8 << 2;
        int var16 = var9 << 2;
        int var17 = ((var6 << 1) + 3) * var10;
        if (arg5 != -64) {
            return;
        }
        int var18 = ((arg3 << 1) - 3) * var11;
        int var19 = (var6 + 1) * var16;
        if (arg2 >= class7.field131 && class92.field1252 >= arg2) {
            int var20 = class372.method2266(class473.field6839, arg5 ^ 0x4F3C, class63.field933, arg0 + arg4);
            int var21 = class372.method2266(class473.field6839, -20228, class63.field933, arg0 - arg4);
            class238.method1440(class41.field629[arg2], arg1, var20, var21, -14726);
        }
        int var22 = (arg3 - 1) * var15;
        while (var7 > 0) {
            if (var13 < 0) {
                while (var13 < 0) {
                    var13 += var17;
                    var14 += var19;
                    var6++;
                    var19 += var16;
                    var17 += var16;
                }
            }
            if (var14 < 0) {
                var14 += var19;
                var13 += var17;
                var6++;
                var17 += var16;
                var19 += var16;
            }
            var13 += -var22;
            var14 += -var18;
            var7--;
            var18 -= var15;
            var22 -= var15;
            int var23 = arg2 - var7;
            int var24 = arg2 + var7;
            if (var24 >= class7.field131 && var23 <= class92.field1252) {
                int var25 = class372.method2266(class473.field6839, -20228, class63.field933, arg0 + var6);
                int var26 = class372.method2266(class473.field6839, arg5 ^ 0x4F3C, class63.field933, arg0 - var6);
                if (class7.field131 <= var23) {
                    class238.method1440(class41.field629[var23], arg1, var25, var26, -14726);
                }
                if (class92.field1252 >= var24) {
                    class238.method1440(class41.field629[var24], arg1, var25, var26, -14726);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(ILae;)V", line = 142)
    public final void method501(int arg0, class156 arg1) {
        while (true) {
            int var3 = arg1.method941((byte) 123);
            if (var3 == 0) {
                if (arg0 != 0) {
                    return;
                }
                field1079++;
                return;
            }
            this.method506(arg1, var3, true);
        }
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(BC)I", line = 164)
    public final int method502(byte arg0, char arg1) {
        field1080++;
        if (this.field1083 == null) {
            return -1;
        }
        for (int var3 = 0; var3 < this.field1083.length; var3++) {
            if (this.field1085[var3] == arg1) {
                return this.field1083[var3];
            }
        }
        if (arg0 != -43) {
            field1084 = null;
        }
        return -1;
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(Ljo;Z)Z", line = 188)
    public static final boolean method503(class210 arg0, boolean arg1) {
        boolean var2 = class311.field4527 == class178.field2562;
        int var3 = 0;
        byte var4 = 0;
        byte var5 = 0;
        arg0.method1295(25);
        if (arg0.field2972 < 0 || arg0.field2975 < 0 || arg0.field2962 >= class282.field4031 || arg0.field2957 >= class98.field1339) {
            return false;
        }
        for (int var6 = arg0.field2972; var6 <= arg0.field2962; var6++) {
            for (int var9 = arg0.field2975; var9 <= arg0.field2957; var9++) {
                class468 var10 = class323.method1937(arg0.field2956, var6, var9);
                if (var10 != null) {
                    int var11 = 0;
                    if (var6 > arg0.field2972) {
                        var11++;
                    }
                    if (var6 < arg0.field2962) {
                        var11 += 4;
                    }
                    if (var9 > arg0.field2975) {
                        var11 += 8;
                    }
                    if (var9 < arg0.field2957) {
                        var11 += 2;
                    }
                    class323 var12 = class208.method1282(arg0, var11, -2872);
                    class323 var13 = var10.field6769;
                    if (var13 == null) {
                        var10.field6769 = var12;
                    } else {
                        while (var13.field4727 != null) {
                            var13 = var13.field4727;
                        }
                        var13.field4727 = var12;
                    }
                    var10.field6767 = (byte) (var10.field6767 | var11);
                    if (var2 && (class285.field4073[var6][var9] & 0xFF000000) != 0) {
                        var3 = class285.field4073[var6][var9];
                        var4 = class256.field3674[var6][var9];
                        var5 = class502.field7676[var6][var9];
                    }
                }
            }
        }
        if (var2 && (var3 & 0xFF000000) != 0) {
            for (int var7 = arg0.field2972; var7 <= arg0.field2962; var7++) {
                for (int var8 = arg0.field2975; var8 <= arg0.field2957; var8++) {
                    if ((class285.field4073[var7][var8] & 0xFF000000) == 0) {
                        class285.field4073[var7][var8] = var3;
                        class256.field3674[var7][var8] = var4;
                        class502.field7676[var7][var8] = var5;
                    }
                }
            }
        }
        if (arg1) {
            class451.field6573[class134.field1712++] = arg0;
        }
        return true;
    }

    @OriginalMember(owner = "client!ut", name = "e", descriptor = "(B)V", line = 292)
    public final void method504(byte arg0) {
        if (this.field1077 != null) {
            for (int var2 = 0; var2 < this.field1077.length; var2++) {
                this.field1077[var2] = class51.method379(this.field1077[var2], 32768);
            }
        }
        if (arg0 != 21) {
            return;
        }
        field1076++;
        if (this.field1083 != null) {
            for (int var3 = 0; var3 < this.field1083.length; var3++) {
                this.field1083[var3] = class51.method379(this.field1083[var3], 32768);
            }
        }
    }

    @OriginalMember(owner = "client!ut", name = "b", descriptor = "(III)Z", line = 330)
    public static final boolean method505(int arg0, int arg1, int arg2) {
        int var3 = class479.field6919[arg0][arg1][arg2];
        if (-class130.field1655 == var3) {
            return false;
        } else if (class130.field1655 == var3) {
            return true;
        } else {
            int var4 = arg1 << class41.field628;
            int var5 = arg2 << class41.field628;
            if (class3.method18(var4 + 1, class311.field4527[arg0].method848(arg1, arg2), var5 + 1) && class3.method18(class153.field1965 + var4 - 1, class311.field4527[arg0].method848(arg1 + 1, arg2), var5 + 1) && class3.method18(class153.field1965 + var4 - 1, class311.field4527[arg0].method848(arg1 + 1, arg2 + 1), class153.field1965 + var5 - 1) && class3.method18(var4 + 1, class311.field4527[arg0].method848(arg1, arg2 + 1), class153.field1965 + var5 - 1) && class3.method18(class170.field2281 + var4, class311.field4527[arg0].method848(arg1, arg2), var5 + 1) && class3.method18(class153.field1965 + var4 - 1, class311.field4527[arg0].method848(arg1 + 1, arg2), class170.field2281 + var5) && class3.method18(class170.field2281 + var4, class311.field4527[arg0].method848(arg1, arg2 + 1), class153.field1965 + var5 - 1) && class3.method18(class153.field1965 + var4 - 1, class311.field4527[arg0].method848(arg1, arg2), class170.field2281 + var5) && class3.method18(class170.field2281 + var4, class311.field4527[arg0].method848(arg1, arg2), class170.field2281 + var5)) {
                class479.field6919[arg0][arg1][arg2] = class130.field1655;
                return true;
            } else {
                class479.field6919[arg0][arg1][arg2] = -class130.field1655;
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(Lae;IZ)V", line = 361)
    private final void method506(class156 arg0, int arg1, boolean arg2) {
        if (!arg2) {
            field1084 = null;
        }
        field1078++;
        if (arg1 == 1) {
            this.field1082 = arg0.method981(!arg2);
        } else if (arg1 == 2) {
            int var7 = arg0.method941((byte) 124);
            this.field1085 = new char[var7];
            this.field1083 = new int[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field1083[var8] = arg0.method993((byte) -102);
                byte var9 = arg0.method946(108);
                this.field1085[var8] = var9 == 0 ? 0 : class207.method1279(1, var9);
            }
        } else if (arg1 == 3) {
            int var4 = arg0.method941((byte) 126);
            this.field1086 = new char[var4];
            this.field1077 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field1077[var5] = arg0.method993((byte) -33);
                byte var6 = arg0.method946(39);
                this.field1086[var5] = var6 == 0 ? 0 : class207.method1279(1, var6);
            }
            return;
        }
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(I)V", line = 425)
    public static void method507(int arg0) {
        field1084 = null;
        field1073 = null;
        if (arg0 != 0) {
            method503(null, true);
        }
        field1081 = null;
    }
}
