import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ba")
public class class217 extends class98 {

    @OriginalMember(owner = "client!ba", name = "Y", descriptor = "Z")
    public static boolean field3066;

    @OriginalMember(owner = "client!ba", name = "L", descriptor = "I")
    public static int field3053;

    @OriginalMember(owner = "client!ba", name = "M", descriptor = "I")
    public static int field3054;

    @OriginalMember(owner = "client!ba", name = "N", descriptor = "I")
    public static int field3055;

    @OriginalMember(owner = "client!ba", name = "O", descriptor = "I")
    public static int field3056;

    @OriginalMember(owner = "client!ba", name = "P", descriptor = "I")
    public static int field3057;

    @OriginalMember(owner = "client!ba", name = "Q", descriptor = "I")
    public static int field3058;

    @OriginalMember(owner = "client!ba", name = "R", descriptor = "I")
    public static int field3059;

    @OriginalMember(owner = "client!ba", name = "S", descriptor = "I")
    public static int field3060;

    @OriginalMember(owner = "client!ba", name = "T", descriptor = "I")
    public static int field3061;

    @OriginalMember(owner = "client!ba", name = "W", descriptor = "I")
    public static int field3064;

    @OriginalMember(owner = "client!ba", name = "X", descriptor = "I")
    public static int field3065;

    @OriginalMember(owner = "client!ba", name = "U", descriptor = "Z")
    public static boolean field3062;

    @OriginalMember(owner = "client!ba", name = "V", descriptor = "[Llo;")
    private class451[] field3063;

    @OriginalMember(owner = "client!ba", name = "<init>", descriptor = "()V")
    public class217() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(Lqm;B)I")
    public static final int method1452(class77 arg0, byte arg1) {
        ++field3060;
        class135 var2 = arg0.field912;
        if (var2.field1655 != null) {
            var2 = var2.method836((byte) -96);
            if (var2 == null) {
                return -1;
            }
        }
        if (arg1 != -111) {
            return -85;
        } else {
            int var3 = var2.field1632;
            class306 var4 = arg0.method2526(arg1 ^ -107);
            if (!arg0.field5613) {
                if (~arg0.field5640 != ~var4.field4335 && arg0.field5640 != var4.field4320 && arg0.field5640 != var4.field4330 && ~arg0.field5640 != ~var4.field4342) {
                    if (~arg0.field5640 == ~var4.field4290 || arg0.field5640 == var4.field4319 || arg0.field5640 == var4.field4311 || ~arg0.field5640 == ~var4.field4309) {
                        var3 = var2.field1656;
                    }
                } else {
                    var3 = var2.field1688;
                }
            } else {
                var3 = var2.field1674;
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(ILqm;)V")
    public static final void method1453(int arg0, class77 arg1) {
        ++field3065;
        if (arg0 < 74) {
            field3064 = -125;
        }
        for (class435 var2 = (class435) class138.field1713.method506((byte) -128); var2 != null; var2 = (class435) class138.field1713.method514(true)) {
            if (var2.field6265 == arg1) {
                if (var2.field6263 != null) {
                    class399.field5694.method1137(var2.field6263);
                    var2.field6263 = null;
                }
                var2.method2594((byte) -22);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(II)[I")
    public final int[] method83(int arg0, int arg1) {
        ++field3057;
        int[] var3 = super.field1177.method820(arg1, true);
        if (arg0 != 0) {
            field3064 = 76;
        }
        if (super.field1177.field1610) {
            this.method1456(super.field1177.method816(-124), 0);
        }
        return var3;
    }

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "(II)[[I")
    public final int[][] method194(int arg0, int arg1) {
        ++field3055;
        int[][] var3 = super.field1184.method185((byte) -48, arg0);
        int var4 = 43 % ((60 - arg1) / 43);
        if (super.field1184.field332) {
            int var5 = class268.field3811;
            int var6 = class140.field1737;
            int[][] var7 = new int[var6][var5];
            int[][][] var8 = super.field1184.method179(0);
            this.method1456(var7, 0);
            for (int var9 = 0; var9 < class140.field1737; ++var9) {
                int[] var10 = var7[var9];
                int[][] var11 = var8[var9];
                int[] var12 = var11[0];
                int[] var13 = var11[1];
                int[] var14 = var11[2];
                for (int var15 = 0; ~class268.field3811 < ~var15; ++var15) {
                    int var16 = var10[var15];
                    var14[var15] = class33.method210(255, var16) << 4;
                    var13[var15] = class33.method210(65280, var16) >> 4;
                    var12[var15] = class33.method210(4080, var16 >> 12);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(ILdg;I)V")
    public final void method81(int arg0, class236 arg1, int arg2) {
        ++field3053;
        if (arg0 != arg2) {
            if (~arg0 == -2) {
                super.field1176 = ~arg1.method1574(arg2 + -121) == -2;
                return;
            }
        } else {
            this.field3063 = new class451[arg1.method1574(-93)];
            for (int var4 = 0; ~var4 > ~this.field3063.length; ++var4) {
                int var5 = arg1.method1574(-56);
                if (~var5 != -1) {
                    if (~var5 != -2) {
                        if (var5 != 2) {
                            if (var5 == 3) {
                                this.field3063[var4] = class406.method2595(arg1, -27179);
                            }
                        } else {
                            this.field3063[var4] = class219.method1471(40, arg1);
                        }
                    } else {
                        this.field3063[var4] = class339.method2180(-79, arg1);
                    }
                } else {
                    this.field3063[var4] = class17.method110(112, arg1);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ba", name = "c", descriptor = "(II)V")
    public static final void method1454(int arg0, int arg1) {
        if (arg1 > -111) {
            method1454(-107, 37);
        }
        ++field3061;
        class20 var2 = class369.method2351((byte) 107, 5, arg0);
        var2.method148(-11806);
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "([BI)Z")
    public static final boolean method1455(byte[] arg0, int arg1) {
        if (arg1 > -107) {
            field3066 = true;
        }
        ++field3058;
        class236 var2 = new class236(arg0);
        int var3 = var2.method1574(-74);
        if (var3 != 1) {
            return false;
        } else {
            boolean var4 = ~var2.method1574(-67) == -2;
            if (var4) {
                class191.method1297(-1, var2);
            }
            class26.method184(-84, var2);
            return true;
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "([[II)V")
    private final void method1456(int[][] arg0, int arg1) {
        ++field3054;
        int var3 = class268.field3811;
        if (arg1 == 0) {
            int var4 = class140.field1737;
            class68.method378(-121, arg0);
            class215.method1445(class210.field2995, 0, class225.field3153, 0, true);
            if (this.field3063 != null) {
                for (int var5 = 0; this.field3063.length > var5; ++var5) {
                    class451 var6 = this.field3063[var5];
                    int var7 = var6.field6456;
                    int var8 = var6.field6457;
                    if (~var7 <= -1) {
                        if (var8 >= 0) {
                            var6.method260(-26, var3, var4);
                        } else {
                            var6.method261(var3, -78, var4);
                        }
                    } else if (var8 >= 0) {
                        var6.method259(var3, (byte) 12, var4);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(IIIII)I")
    public static final int method1457(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg3 > -94) {
            return 46;
        } else {
            ++field3059;
            int var5 = arg2 & 15;
            int var6 = ~var5 > -9 ? arg0 : arg4;
            int var7 = var5 >= 4 ? (var5 != 12 && ~var5 != -15 ? arg1 : arg0) : arg4;
            return (~(2 & var5) != -1 ? -var7 : var7) + (~(1 & var5) == -1 ? var6 : -var6);
        }
    }

    @OriginalMember(owner = "client!ba", name = "e", descriptor = "(I)V")
    public static final void method1458(int arg0) {
        class189.field2723 = null;
        class419.field5994 = null;
        if (arg0 != -2) {
            field3064 = -19;
        }
        class190.field2743 = null;
        class131.field1588 = null;
        class435.field6272 = null;
        class421.field6018 = null;
        class164.field2321 = null;
        class141.field1747 = null;
        class143.field1767 = null;
        class389.field5496 = null;
        ++field3056;
        class369.field5213 = null;
        class257.field3686 = null;
    }

    static {
        new class362("Unable to add name - unknown player.", "Name konnte nicht hinzugefügt werden - Spieler unbekannt.", "Impossible d'ajouter le nom - joueur inconnu.", "Não foi possível adicionar um nome - jogador desconhecido.");
        field3066 = false;
    }
}
